package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

public class ConExNode extends ExprNode {
    public String op;//运算符

    public ConExNode(position pos,String op_) {
        super(pos);
        op = op_;
        is_constant = true;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}