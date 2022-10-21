package AST;

import Util.position;

import java.util.ArrayList;


public class ItStmtNode extends StmtNode {
    public ExprNode exp;

    public String type;//for / while

    public StmtNode stmt;

    public StmtNode ini_stmt;

    public ConNode con;

    public ItStmtNode(position pos) {
        super (pos);
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

