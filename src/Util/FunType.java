package Util;

import java.util.ArrayList;
import java.util.HashMap;

public class FunType extends Type{
//    public String idn;
    public ClsType return_type;
    public String idn;
    public boolean is_lambda = false;
    public ArrayList<ClsVarType> calllist;
    public FunType(ClsType retype){
        return_type = retype;
        calllist = new ArrayList<>();
    }
    public FunType(FunType oth){
        return_type = new ClsType(oth.return_type);
        idn = oth.idn;
        calllist = oth.calllist;
    }
    public FunType(int i){
     is_lambda = true;
    }

}