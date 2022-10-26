package AST.ASTNode;

import Util.position;

public abstract class ExprNode extends ASTNode {
    public String type;
    public int dim;


    public ExprNode(position pos) {
        super(pos);
    }

    public boolean isAssignable() {
        return false;
    }

}