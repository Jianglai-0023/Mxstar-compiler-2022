package codegen.llvmIR.Inst;

import codegen.llvmIR.Entity.Entity;

public class br extends Inst{
    boolean direct;
    Entity con,label1,label2;

    @Override
    public String toString() {
        if(direct){
            return "br label " + "%" + label1;
        }
        return "br i1" + con.getValue() + ", label " +label1.getValue() + ", label " + label2.getValue();
    }
}
