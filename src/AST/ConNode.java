package AST;

import MIR.entity;
import Util.Type;
import Util.position;

public class ConNode extends ASTNode {
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