package codegen.llvmIR.Inst;

import codegen.llvmIR.Entity.Entity;
import codegen.llvmIR.Type.IRType;

public class Alloca extends Inst{
        public IRType type;
        public Entity var;
        public Alloca(IRType t, Entity v){
                type = t;
                var = v;
        }
        @Override
        public String printString(){
            return var.getValue() + "= alloca" + type;//直接+相当于调用tostring函数
        }

}
