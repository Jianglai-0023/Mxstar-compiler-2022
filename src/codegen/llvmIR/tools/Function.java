package codegen.llvmIR.tools;


import java.util.ArrayList;
import codegen.llvmIR.Entity.Entity;
import codegen.llvmIR.Type.IRType;

public class Function {
    public String name;
    public String identifier;
    public IRType ret_type;
    public ArrayList<IRBlock> blocks = new ArrayList<>();
    public ArrayList<Entity> parameters = new ArrayList<>();
    public IRBlock entry_block,exit_block;
    public ArrayList<IRBlock> ret_blocks = new ArrayList<>();

    public int reg_num;

    public Function(){

    }
    public Function(String n, IRType ret){
        name = n;
        ret_type = ret;
    }

}
