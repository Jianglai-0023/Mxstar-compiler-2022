package AST.ASTNode;

import AST.ASTVisitor;
import Util.*;

import java.util.ArrayList;


public class FunDecNode extends StmtNode {

    public ComStmtNode stmt;
    public FunType fun_type;//symbolcollector之后存functype
    public String idn;
    public String re_type_name;
    public int dim = 0;
    public ClsType return_type;
    public ArrayList<VarDef> para = new ArrayList<>();

    public FunDecNode(position pos) {
        super (pos);
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

