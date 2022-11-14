package Semantic.Util;

import Semantic.Util.error.semanticError;

import java.util.HashMap;
import org.antlr.v4.runtime.misc.Pair;

public class Scope {

    protected HashMap<String,ClsType> members;//变量定义


    private Scope parentScope;
    public FunType is_func = null;
    public ClsType is_cls = null;

    public boolean is_global = false;

    public boolean is_in_loop = false;

    public boolean is_constru = false;

    public boolean lookup = true;

    public Scope(Scope parentScope) {
        members = new HashMap<>();
        this.parentScope = parentScope;
//
//        if(parentScope!=null){
//            this.is_constru = parentScope.is_constru;
//            this.is_func = parentScope.is_func;
//            this.is_cls = parentScope.is_cls;
//        }
    }

    public Scope parentScope() {
        return parentScope;
    }

    public void defineVariable(String idn, ClsType t, position pos) {
        if (members.containsKey(idn))
            throw new semanticError("Semantic Error: variable redefine", pos);
        members.put(idn, t);
    }
    public ClsType is_in_cls(){
        if(is_cls==null && parentScope!=null)return parentScope.is_in_cls();
        return is_cls;
    }
    public FunType is_in_fun(){
        if(is_func==null && parentScope!=null)return parentScope.is_in_fun();
        return is_func;
    }

    public boolean Is_in_loop() {
        if(!is_in_loop&&parentScope!=null)return parentScope.Is_in_loop();
        return is_in_loop;
    }
    public boolean Is_in_constru(){
        if(!is_constru&&parentScope!=null)return parentScope.Is_in_constru();
        return is_constru;
    }
    public Pair<ClsType,FunType> find_var_def(String name){
        if(is_cls!=null){
            if(is_cls.fun.containsKey(name)){
                return new Pair<>(null,is_cls.fun.get(name));
            }
            else if(is_cls.var.containsKey(name))return new Pair<>(is_cls.var.get(name),null);
//            else if(members.containsKey(name))return new Pair<>(members.get(name),null);
            else if(parentScope!=null&&lookup)return parentScope.find_var_def(name);
            else return new Pair<>(null,null);
        }
        else{
            if(members.containsKey(name))return new Pair<>(members.get(name),null);
            else if(parentScope!=null&&lookup)return parentScope.find_var_def(name);
            else return new Pair<>(null,null);
        }

    }
}
