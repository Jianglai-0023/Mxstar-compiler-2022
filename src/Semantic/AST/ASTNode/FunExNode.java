package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.position;

import java.util.ArrayList;

public class FunExNode extends ExprNode {
    public String idn;
    public ExprNode exp;
    public ArrayList<ExprNode> calllist;
//    public String op;//运算符
//    public int dim;

    public FunExNode(position pos) {
        super(pos);
        calllist = new ArrayList<>();
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}