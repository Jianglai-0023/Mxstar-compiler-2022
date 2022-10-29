package AST.ASTNode;

import AST.ASTVisitor;
import Util.VarDef;
import Util.position;
import Util.Type;
import Util.ClsType;

import java.util.ArrayList;


public class FunDecNode extends StmtNode {

    public ComStmtNode stmt;
    public String idn;
    public String re_type_name;
    public int dim = 0;
    public ClsType return_type;
    public ArrayList<VarDef> para;

    public FunDecNode(position pos) {
        super (pos);
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

