package AST;

import MIR.entity;
import Util.Type;
import Util.position;

public abstract class ExprNode extends ASTNode {
    public String type;
    public entity val;

    public ExprNode(position pos) {
        super(pos);
    }

    public boolean isAssignable() {
        return false;
    }
}