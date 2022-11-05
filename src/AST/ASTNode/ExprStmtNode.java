package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;


public class ExprStmtNode extends StmtNode {
    public ExprNode exp;


    public ExprStmtNode(position pos) {
        super (pos);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

