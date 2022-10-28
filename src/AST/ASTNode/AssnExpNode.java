package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

public class AssnExpNode extends ExprNode {
    public ExprNode leftson;
    public ExprNode rightson;

    public AssnExpNode(position pos) {
        super(pos);
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}