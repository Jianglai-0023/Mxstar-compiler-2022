package Util;

import java.util.ArrayList;
import java.util.HashMap;

public class FunType extends Type{
//    public String idn;
    public ClsType return_type;

    public ArrayList<VarDef> calllist = null;
    public FunType(ClsType ret){
//        idn = id;
        return_type  = ret;
    }
}