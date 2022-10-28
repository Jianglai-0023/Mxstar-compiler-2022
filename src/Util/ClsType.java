package Util;

import java.util.ArrayList;
import java.util.HashMap;

public class ClsType extends Type{
    public String idn;
    public int dim = 0;
    public ArrayList<VarDef>var;
    public HashMap<String, FunType>fun;
    public ClsType(String idn_){
        idn = idn_;
    }
}