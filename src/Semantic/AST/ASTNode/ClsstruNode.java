package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.position;

public class ClsstruNode extends ASTNode {
    public String idn;
    public StmtNode stmt;

    public ClsstruNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}