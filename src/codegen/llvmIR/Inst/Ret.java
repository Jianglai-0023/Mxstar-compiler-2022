package codegen.llvmIR.Inst;

import codegen.llvmIR.Entity.Entity;

public class Ret extends Inst {
    Entity ret_type;

    public Ret(Entity re){
        ret_type = re;
    }

    @Override
    public String toString(){
        return "ret " + ret_type;
    }


}
