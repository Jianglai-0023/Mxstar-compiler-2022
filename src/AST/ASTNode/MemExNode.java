package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;

public class MemExNode extends ExprNode {
    public String type;
    public String member;
    public ExprNode target;
    public ArrayList<ExprNode> calllist;
//    public String op;//运算符
//    public int dim;

    public MemExNode(position pos,String type_,ExprNode fa,String son) {
        super(pos);
        type = type_;
        target = fa;
        member = son;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}