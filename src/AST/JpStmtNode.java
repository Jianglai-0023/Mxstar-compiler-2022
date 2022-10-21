package AST;

import Util.position;

import java.util.ArrayList;


public class JpStmtNode extends StmtNode {
    public ExprNode exp;

    public String re_type;

    public String type;

    ArrayList<StmtNode> stmts;

    public JpStmtNode(position pos) {
        super (pos);
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

