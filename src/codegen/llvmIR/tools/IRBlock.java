package codegen.llvmIR.tools;

import codegen.llvmIR.Entity.Entity;
import codegen.llvmIR.Type.IRType;
import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import codegen.llvmIR.Inst.Inst;
public class IRBlock {
    public ArrayList<Inst> stmts = new ArrayList<>();//全部指令
    public ArrayList<Entity> parameters = new ArrayList<>();
    public IRBlock(){

    }
}
