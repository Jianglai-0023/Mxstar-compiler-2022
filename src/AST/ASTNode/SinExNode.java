package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

public class SinExNode extends ExprNode {
    public String type;
    public String op;//运算符
    public int dim;

    public SinExNode(position pos,String op_,String type_) {
        super(pos);
        op = op_;
        type = type_;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}