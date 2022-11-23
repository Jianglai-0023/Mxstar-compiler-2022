package codegen.llvmIR.Type;

public class arrayType extends IRType {
    public int size;
    public IRType type;

    public arrayType(IRType t, int s){
        size = s;
        type = t;
    }

    @Override
    public int getBytes() {
        return size * type.getBytes();
    }
    @Override
    public String toString(){
        return "[" + size + " x " + type + "]";
    }
}
