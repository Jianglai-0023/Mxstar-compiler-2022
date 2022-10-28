package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;
import Util.OP;

public class SinExNode extends ExprNode {
    public OP op;//运算符
    public int dim;
    public ExprNode exp;

    public SinExNode(position pos,OP op_) {
        super(pos);
        op = op_;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}