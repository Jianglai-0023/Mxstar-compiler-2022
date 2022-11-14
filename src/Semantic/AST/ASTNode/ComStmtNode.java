package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.position;

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

