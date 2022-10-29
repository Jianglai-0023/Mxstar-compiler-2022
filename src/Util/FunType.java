package Util;

import java.util.ArrayList;
import java.util.HashMap;

public class FunType extends Type{
//    public String idn;
    public ClsType return_type;
    public String idn;

    public ArrayList<ClsVarType> calllist;
    public FunType(ClsType retype){
//        idn = id;
//        idn  =name;
        return_type = retype;
        calllist = new ArrayList<>();
    }
}