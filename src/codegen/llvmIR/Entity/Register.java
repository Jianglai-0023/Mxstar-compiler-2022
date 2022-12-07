package codegen.llvmIR.Entity;

import codegen.llvmIR.Type.IRType;

public class Register extends Entity{
    String name;
    @Override
    public String getValue() {
        return "%" + name;
    }

    public Register(boolean isL, IRType t,String n){
        super(isL,t);
        name = n;
    }

    @Override
    public String toString(){
        return super.toString() + " %" + name;
    }

}
