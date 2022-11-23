package codegen.llvmIR.Entity;

import codegen.llvmIR.Type.IRType;

public class Label extends Entity{
    public String name;

    public Label(boolean islValue_, IRType type_) {
        super(islValue_, type_);
    }

    @Override
    public String getValue() {
        return name;
    }
}
