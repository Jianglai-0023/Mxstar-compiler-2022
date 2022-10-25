package AST;

import MIR.entity;
import Util.Type;
import Util.position;

public class BiExNode extends ExprNode {
    public String type;
    public String op;//运算符
    public int dim;
    public ExprNode lson;
    public ExprNode rson;

    public BiExNode(position pos,String op_,String type_,ExprNode l,ExprNode r) {
        super(pos);
        op = op_;
        type = type_;
        lson = l;
        rson = r;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}