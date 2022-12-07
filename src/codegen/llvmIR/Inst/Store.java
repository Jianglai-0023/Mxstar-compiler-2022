package codegen.llvmIR.Inst;

import codegen.llvmIR.Entity.Entity;
import codegen.llvmIR.Type.IRType;

import java.util.EventObject;

public class Store extends Inst {
    Entity tar,res;
    public Store(Entity t,Entity r){
        tar = t;
        res = r;
    }
    @Override
    public String toString(){
        return "store " + tar + ", " + res;
    }
}
