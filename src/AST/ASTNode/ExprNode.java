package AST.ASTNode;

import Util.ClsType;
import Util.FunType;
import Util.position;

public abstract class ExprNode extends ASTNode {
    public ClsType type = null;
    public FunType fun_type = null;
    public int dim;
    public boolean is_left_val = false;


    public ExprNode(position pos) {
        super(pos);
    }

    public boolean isAssignable() {
        return false;
    }

}