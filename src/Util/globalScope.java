package Util;

import Util.error.semanticError;

import java.util.HashMap;

public class globalScope extends Scope {
    private HashMap<String, ClsType> cls_types = new HashMap<>();
    private HashMap<String,FunType> func_types = new HashMap<>();
    public globalScope(Scope parentScope) {
        super(parentScope);
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
}