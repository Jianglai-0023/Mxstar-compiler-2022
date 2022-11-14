package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.position;

public class MemExNode extends ExprNode {
    public String member;
    public ExprNode target;


    public MemExNode(position pos,ExprNode fa,String son) {
        super(pos);
        target = fa;
        member = son;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}