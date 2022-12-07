package codegen.llvmIR.Inst;

import codegen.llvmIR.Entity.Entity;
import codegen.llvmIR.Type.IRType;

import java.util.ArrayList;

public class call extends Inst{
    IRType return_type;
    String name;
    ArrayList<Entity> parameters;
    Entity rd;
    boolean is_void;


    @Override
    public String toString() {
        String ret;
        if(is_void){
         ret =  "call " +"void " + "@" + name + "(";
         if(parameters.size()!=0)ret += parameters.get(0).toString();
         for(int i = 1; i < parameters.size(); ++i){
             ret += "," + parameters.get(i).toString();
         }
         ret += ")";
        }else{
            ret = "call " + return_type.toString() +  " @" + name + "(";
            if(parameters.size()!=0){
                ret += parameters.get(0).toString();
                for(int i = 1; i < parameters.size(); ++i){
                    ret += "," + parameters.get(i).toString();
                }
            }
            ret += ")";
        }
        return ret;
    }
}
