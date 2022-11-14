package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.position;
import Semantic.Util.OP;

public class BiExNode extends ExprNode {
    public OP op;//运算符
    public ExprNode lson;
    public ExprNode rson;

    public BiExNode(position pos,OP op_,ExprNode l,ExprNode r) {
        super(pos);
        op = op_;
        lson = l;
        rson = r;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}