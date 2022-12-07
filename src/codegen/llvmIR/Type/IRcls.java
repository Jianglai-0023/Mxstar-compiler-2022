package codegen.llvmIR.Type;

import codegen.llvmIR.tools.Class;

public class IRcls extends IRType {
    public String className;
    public String identifier;
    public int bytes;
    public Class cl;

    public IRcls(Class cl_){
        cl = cl_;
        className = cl.name;
        identifier = cl.identifier;
        cl.vars.forEach(x -> bytes += x.getBytes());
    }

    @Override
    public int getBytes() {
        return bytes;
    }

    @Override
    public String toString(){
        return "%" + identifier;
    }
}
