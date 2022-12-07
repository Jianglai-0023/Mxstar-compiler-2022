package codegen.llvmIR.Type;

public class IRptr extends IRType {
    public IRType type;

    public IRptr(IRType type_){
        type = type_;
    }

    @Override
    public String toString(){
        return type + "*";
    }

    @Override
    public int getBytes() {
        return 4;
    }
}

