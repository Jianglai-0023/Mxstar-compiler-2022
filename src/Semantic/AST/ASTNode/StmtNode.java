package Semantic.AST.ASTNode;

import Semantic.Util.position;

public abstract class StmtNode extends ASTNode {
    public StmtNode(position pos) {
        super(pos);
    }
}