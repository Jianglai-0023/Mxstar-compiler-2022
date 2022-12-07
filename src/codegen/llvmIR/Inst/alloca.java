package codegen.llvmIR.Inst;

import codegen.llvmIR.Entity.Entity;
import codegen.llvmIR.Type.IRType;

public class alloca extends Inst{
        public IRType type;
        public Entity var;
        public alloca(IRType t, Entity v){
                type = t;
                var = v;
        }
        @Override
        public String toString(){
            return var.getValue() + "= alloca" + type;//直接+相当于调用tostring函数
        } //调用alloca作为右值

}
