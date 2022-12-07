package codegen.llvmIR.Entity;

import codegen.llvmIR.Type.IRbase;

public class Label extends Entity{
    public String name;

    public Label(String n) {
        super(false, new IRbase(IRbase.typeToken.LABEL,0));
        name = n;
    }

    @Override
    public String getValue() {
        return "%" + name;
    }

    @Override
    public String toString() {
        return super.toString() + " %" + name;
    }

}
