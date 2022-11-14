package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.position;

public class AssnExpNode extends ExprNode {
    public ExprNode leftson;
    public ExprNode rightson;

    public AssnExpNode(position pos) {
        super(pos);
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}