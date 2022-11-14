package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.position;

public class ArrExNode extends ExprNode {
    public ExprNode target;
    public ExprNode idx;


    public ArrExNode(position pos,ExprNode tar,ExprNode id,int dim_) {
        super(pos);
        target = tar;
        idx = id;
        dim = dim_;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}