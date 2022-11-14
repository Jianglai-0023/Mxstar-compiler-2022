package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.position;


abstract public class ASTNode {
    public position pos;

    public boolean is_func_dec = false;
    public boolean is_cls_dec = false;
    public boolean is_var_dec = false;

    public boolean is_main = false;

    public boolean is_constant = false;

    public ASTNode(position pos) {
        this.pos = pos;
    }

    abstract public void accept(ASTVisitor visitor);
}

