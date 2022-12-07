package codegen.llvmIR.Inst;

import codegen.llvmIR.Type.IRType;
import codegen.llvmIR.Entity.Entity;
public class global extends Inst{
    IRType type;

    Entity rd,init;

    @Override
    public String toString(){
        return  rd.getValue()+ " = global " + type + init;
    }

    public global(Entity rd_ ,Entity ini, IRType typ){
        rd = rd_;
        init = ini;
        type = typ;
    }
}
