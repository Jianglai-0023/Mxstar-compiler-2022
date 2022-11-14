package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.position;

import java.util.ArrayList;


public class SleStmtNode extends StmtNode {
    public ExprNode exp;

    public ArrayList<StmtNode> stmts = new ArrayList<>();

    public SleStmtNode(position pos) {
        super (pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

