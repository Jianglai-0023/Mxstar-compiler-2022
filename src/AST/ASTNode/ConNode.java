package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

public class ConNode extends ASTNode {//condition
    public String type;
    public ExprNode exp;

    public ConNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}