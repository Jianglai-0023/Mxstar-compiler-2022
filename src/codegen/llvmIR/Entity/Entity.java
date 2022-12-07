package codegen.llvmIR.Entity;

import codegen.llvmIR.Type.IRType;

public abstract class Entity {
    IRType type;

    public boolean is_lval;//todo ??

    public Entity(boolean islValue_, IRType type_){
        is_lval = islValue_;
        type = type_;
    }

//    public Entity(){
//
//    }

    public abstract String getValue();

    public String toString(){
        return type.toString();
    }
}
