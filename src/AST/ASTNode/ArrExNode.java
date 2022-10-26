package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;

public class ArrExNode extends ExprNode {
    public String type;
    public ExprNode target;
    public ExprNode idx;


    public ArrExNode(position pos,String type_,ExprNode tar,ExprNode id) {
        super(pos);
        type = type_;
        target = tar;
        idx = id;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}