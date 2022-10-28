package Util;

import java.util.ArrayList;
import java.util.HashMap;

public class VarDef {
    public String type;
    public String idn;
    public position pos;
    public VarDef(String ty,String id,position pos_){
        pos = pos_;
        this.type = ty;
        this.idn = id;
    }
}