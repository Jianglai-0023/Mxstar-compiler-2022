package AST;

import Util.position;

import java.util.ArrayList;


public class ExprStmtNode extends StmtNode {
    public ExprNode exp;


    public ExprStmtNode(position pos) {
        super (pos);
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

