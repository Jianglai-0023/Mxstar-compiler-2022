package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;

public class FunExNode extends ExprNode {
    public String type;
    public ArrayList<ExprNode> calllist;
//    public String op;//运算符
//    public int dim;

    public FunExNode(position pos,String type_) {
        super(pos);
        type = type_;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}