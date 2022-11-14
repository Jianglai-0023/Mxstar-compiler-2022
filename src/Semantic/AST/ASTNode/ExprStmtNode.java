package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.position;


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

