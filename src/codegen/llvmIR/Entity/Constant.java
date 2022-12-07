package codegen.llvmIR.Entity;

import codegen.llvmIR.Type.IRType;

public class Constant extends Entity{//todo
    enum conType{
        I1,I8,I32,I64
    }
    public conType contype;

    @Override
    public String getValue() {
        return null;
    }
    public Constant(IRType t){
        super(false,t);
    }

}
