package codegen.llvmIR.Inst;

import codegen.llvmIR.Entity.Entity;
import codegen.llvmIR.Type.IRType;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class getelementptr extends Inst{
    boolean inbounds;//todo why inbounds
    IRType ar_type;
    Entity rs,rd;

    ArrayList<Entity> cls_idx;
    ArrayList<Entity> arr_oft;//constant
    @Override
    public String toString(){
        String ret = rd.toString() + "= getelementptr inbounds" + ar_type.toString() +", "
                + rs.toString();
        for(int i = 0; i < cls_idx.size(); ++i){
            ret += ", " + cls_idx.get(i).toString();
            if(i < arr_oft.size()){
                ret +=", "+arr_oft.get(i).toString();
            }
        }
      return ret;
    }
}
