package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;


abstract public class ASTNode {
    public position pos;

    public boolean is_constant = false;

    public ASTNode(position pos) {
        this.pos = pos;
    }

    abstract public void accept(ASTVisitor visitor);
}

