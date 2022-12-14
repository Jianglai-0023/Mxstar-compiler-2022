package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.ClsVarType;
import Semantic.Util.VarDef;
import Semantic.Util.position;

import java.util.ArrayList;

public class LamExNode extends ExprNode {
    public ArrayList<ExprNode> call_list = new ArrayList<>();

    public ArrayList<ClsVarType> para_type = new ArrayList<>();
    public ArrayList<StmtNode> stmts = new ArrayList<>();
    public ArrayList<VarDef>parameters = new ArrayList<>();
    public boolean is_in;



    public LamExNode(position pos) {
        super(pos);
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}