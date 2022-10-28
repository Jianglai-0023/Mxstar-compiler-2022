package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;

public class MemExNode extends ExprNode {
    public String member;
    public ExprNode target;

//    public String op;//运算符
//    public int dim;

    public MemExNode(position pos,ExprNode fa,String son) {
        super(pos);
        target = fa;
        member = son;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}