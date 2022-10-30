package AST.ASTNode;

import AST.ASTVisitor;
import Util.ClsType;
import Util.position;

import java.util.ArrayList;


public class JpStmtNode extends StmtNode {
    public ExprNode exp = null;
    public boolean is_return = false;

    public boolean is_break = false;
    public boolean is_continue = false;

    public ClsType re_type;

    public JpStmtNode(position pos) {
        super (pos);
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

