package AST;

import Util.position;

import java.util.ArrayList;


public class ComStmtNode extends ASTNode {
    //    public position pos;
    public ArrayList<StmtNode> stmts;
    public ComStmtNode(position pos) {
        super (pos);
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

