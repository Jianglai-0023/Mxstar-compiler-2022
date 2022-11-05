package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;


public class ItStmtNode extends StmtNode {
    public ExprNode exp;

    public String type;//for / while

    public StmtNode stmt;

    public StmtNode ini_stmt;

    public ConNode con;

    public boolean is_while;

    public ItStmtNode(position pos) {
        super (pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

