package codegen.llvmIR.Type;

public class IRarray extends IRType {
    public int size;
    public IRType type;

    public IRarray(IRType t, int s){
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
