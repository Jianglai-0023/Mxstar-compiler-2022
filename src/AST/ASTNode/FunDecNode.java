package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;


public class FunDecNode extends StmtNode {
    public String type;
    public ComStmtNode stmt;
    public String idn;

    public FunDecNode(position pos) {
        super (pos);
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

