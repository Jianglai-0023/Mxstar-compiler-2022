package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.ClsType;
import Semantic.Util.position;


public class JpStmtNode extends StmtNode {
    public ExprNode exp = null;
    public boolean is_return = false;

    public boolean is_break = false;
    public boolean is_continue = false;

    public ClsType re_type;

    public JpStmtNode(position pos) {
        super (pos);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

