package Util;

import Util.error.semanticError;

import java.util.HashMap;

public class Scope {

    private HashMap<String,ClsType> members;//变量定义


    private Scope parentScope;
    public FunType is_func = null;
    public ClsType is_cls = null;

    public boolean is_constru = false;

    public Scope(Scope parentScope) {
        members = new HashMap<>();
        this.parentScope = parentScope;
        this.is_constru = parentScope.is_constru;
        this.is_func = parentScope.is_func;
        this.is_cls = parentScope.is_cls;
    }

    public Scope parentScope() {
        return parentScope;
    }

    public void defineVariable(String idn, ClsType t, position pos) {
        if (members.containsKey(idn))
            throw new semanticError("Semantic Error: variable redefine", pos);
        members.put(idn, t);
    }

    public boolean containsVariable(String name, boolean lookUpon) {
        if (members.containsKey(name)) return true;
        else if (parentScope != null && lookUpon)
            return parentScope.containsVariable(name, true);
        else return false;
    }
    public ClsType getClsType(String name, boolean lookUpon) {
        if (members.containsKey(name)) return members.get(name);
        else if (parentScope != null && lookUpon)
            return parentScope.getClsType(name, true);
        return null;
    }

}
