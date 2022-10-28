package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;

public class ArrExNode extends ExprNode {
    public ExprNode target;
    public ExprNode idx;
    public String idn;


    public ArrExNode(position pos,ExprNode tar,ExprNode id,int dim_) {
        super(pos);
        target = tar;
        idx = id;
        dim = dim_;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}