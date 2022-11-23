package codegen.llvmIR.tools;


import java.util.ArrayList;
import codegen.llvmIR.Entity.Entity;

public class Function {
    public ArrayList<IRBlock> blocks = new ArrayList<>();
    public ArrayList<Entity> parameters = new ArrayList<>();
    public IRBlock entry_block,exit_block;
    public ArrayList<IRBlock> ret_blocks;

    public Function(){

    }

}
