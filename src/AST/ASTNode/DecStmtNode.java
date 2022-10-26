package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;


public class DecStmtNode extends StmtNode {
    //    public position pos;
    public String type;//var array j_array
    public ArrayList<ExprNode> exprs;
    public ArrayList<String> idn;
    public int dim;

    public DecStmtNode(position pos) {
        super (pos);
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

