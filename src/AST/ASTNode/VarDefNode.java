package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;


public class VarDefNode extends ExprNode {
    //    public position pos;
    public String idn;
    boolean is_func = false;

    public VarDefNode(position pos,String idn_, int dim_) {
        super (pos);
       idn = idn_;
       dim=dim_;
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

