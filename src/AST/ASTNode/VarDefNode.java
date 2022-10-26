package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;


public class VarDefNode extends StmtNode {
    //    public position pos;
    public ArrayList<StmtNode> stmts;
    public String type;
    public int dim;

    public VarDefNode(position pos,String type_, int dim_) {
        super (pos);
       type = type_;
       dim=dim_;
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

