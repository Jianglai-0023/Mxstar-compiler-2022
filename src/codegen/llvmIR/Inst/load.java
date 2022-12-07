package codegen.llvmIR.Inst;

import codegen.llvmIR.Entity.Entity;
import codegen.llvmIR.Type.IRType;

public class load extends Inst{
    Entity tar,res;
    IRType type;
    public load(Entity t,Entity r, IRType ty){
        tar = t;
        res = r;
        type = ty;
    }

    @Override
    public String toString(){
        return tar.getValue() + " = load " + type + ", " + res;
    }

}
