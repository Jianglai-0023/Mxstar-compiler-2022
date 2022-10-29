package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;


public class SleStmtNode extends StmtNode {
    public ExprNode exp;

    public ArrayList<StmtNode> stmts = new ArrayList<>();

    public SleStmtNode(position pos) {
        super (pos);
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

