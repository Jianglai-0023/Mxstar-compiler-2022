package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;


public class ComStmtNode extends StmtNode {
    //    public position pos;
    public ArrayList<StmtNode> stmts;
    public ComStmtNode(position pos) {
        super (pos);
        stmts = new ArrayList<>();
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

