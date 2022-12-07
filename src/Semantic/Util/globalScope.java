package Semantic.Util;


import Semantic.Util.error.semanticError;
import codegen.llvmIR.tools.Class;
import codegen.llvmIR.tools.Function;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.HashMap;

import codegen.llvmIR.Type.IRcls;

public class globalScope extends Scope {

    private HashMap<String, ClsType> cls_types = new HashMap<>();
    private HashMap<String,FunType> func_types = new HashMap<>();

    private HashMap<String, Class> cls_ir = new HashMap<>();

    private HashMap<String, Function> func_ir = new HashMap<>();

    public globalScope(Scope parentScope) {
        super(parentScope);
        is_global = true;
    }

    public void addfunType(String name, FunType t, position pos) {
        if (func_types.containsKey(name))
            throw new semanticError("multiple definition of function" + name, pos);
        func_types.put(name, t);
    }
    public void addclsType(String name, ClsType t, position pos) {
        if (cls_types.containsKey(name))
            throw new semanticError("multiple definition of class" + name, pos);
        cls_types.put(name, t);
    }
    public FunType getFunTypeFromName(String name, position pos) {
        if (func_types.containsKey(name)) return func_types.get(name);
        throw new semanticError("no such function type: " + name, pos);
    }
    public ClsType getClsTypeFromName(String name, position pos) {
        if (cls_types.containsKey(name)) return cls_types.get(name);
        throw new semanticError("no such class type: " + name, pos);
    }
    @Override
    public Pair<ClsType,FunType> find_var_def(String name){
        if(members.containsKey(name))return new Pair<>(members.get(name),null);
        else return new Pair<>(null, func_types.getOrDefault(name, null));
    }

    public void add_IRcls(Class cls){
        cls_ir.put(cls.name,cls);
    }

    public void add_func(Function f){
        func_ir.put(f.name,f);
    }

    public Class get_IRcls_from_name(String name){
        return cls_ir.get(name);
    }
}