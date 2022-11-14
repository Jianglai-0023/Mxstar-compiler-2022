package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.position;
import Semantic.Util.OP;

public class SinExNode extends ExprNode {
    public OP op;//运算符

    public ExprNode exp;



    public SinExNode(position pos,OP op_) {
        super(pos);
        op = op_;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}