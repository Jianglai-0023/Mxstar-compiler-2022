package Util;

import java.util.ArrayList;
import java.util.HashMap;

public class ClsType extends Type{
    public String idn;
    public int dim = 0;
    public HashMap<String,ClsType>var;
    public HashMap<String,ClsType>var_member;
    public HashMap<String, FunType>fun;
    public ClsType(String idn_){
        idn = idn_;
        fun = new HashMap<>();
        var = new HashMap<>();
        }
        public ClsType(ClsType other){
        idn = other.idn;
        fun = other.fun;
        var = other.var;
        dim = other.dim;
        }
}