package AST.ASTNode;

import AST.ASTVisitor;
import Util.ClsType;
import Util.Type;
import Util.position;

import java.util.ArrayList;

public class LamExNode extends ExprNode {
    public ArrayList<ExprNode> parameters = null;
    public ArrayList<StmtNode> stmts;
    public ArrayList<ExprNode>call_lists = null;
    public boolean is_in;



    public LamExNode(position pos) {
        super(pos);
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}