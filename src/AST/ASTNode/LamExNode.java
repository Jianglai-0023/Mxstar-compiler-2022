package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;

public class LamExNode extends ExprNode {
    public String type;
    public ArrayList<ExprNode> parameters;
    //todo namespace
    public ComStmtNode stmt;
    public ArrayList<ExprNode>call_lists;
    public boolean is_in;


    public LamExNode(position pos,String type_,ComStmtNode st) {
        super(pos);
        type = type_;
        stmt = st;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}