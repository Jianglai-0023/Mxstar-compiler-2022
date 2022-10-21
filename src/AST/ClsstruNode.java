package AST;

import MIR.entity;
import Util.Type;
import Util.position;

public class ClsstruNode extends ASTNode {
    public String type;
    public ExprNode exp;

    public ClsstruNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}