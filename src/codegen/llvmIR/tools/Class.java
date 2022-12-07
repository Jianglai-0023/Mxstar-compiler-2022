package codegen.llvmIR.tools;

import codegen.llvmIR.Type.IRType;

import java.util.ArrayList;

public class Class {
    public String name;
    public String identifier;

    public long bytes = 0;

    public ArrayList<Function> funcs = new ArrayList<>();

    public ArrayList<IRType> vars = new ArrayList<>();

    public Class(String nam,String i){
        identifier = i;
        name = nam;
    }

}
