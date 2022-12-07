package codegen.llvmIR.Entity;

import codegen.llvmIR.Type.IRType;

public class GlobalEntity extends Entity{
    String name;//变量名
    boolean is_const;
    @Override
    public String getValue() {
        return "@" + name;
    }
    @Override
    public String toString(){
        return super.toString() + " @" + name;
    }
    public GlobalEntity(boolean isL, IRType t,boolean iscon,String n){
        super(isL,t);
        name = n;
        is_const = iscon;
    }

}
