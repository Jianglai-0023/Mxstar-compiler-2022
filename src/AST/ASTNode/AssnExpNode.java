package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

public class AssnExpNode extends ExprNode {
    public String type;
    public int dim;
    public ExprNode leftson;
    public ExprNode rightson;

    public AssnExpNode(position pos) {
        super(pos);
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}