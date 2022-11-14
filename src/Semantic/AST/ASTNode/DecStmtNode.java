package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.ClsType;
import Semantic.Util.VarDef;
import Semantic.Util.position;

import java.util.ArrayList;


public class DecStmtNode extends StmtNode {
    //    public position pos;
//    public String type;//var array j_array
    public ArrayList<ExprNode> exprs;
    public ArrayList<VarDef> var;
    public int dim;
    public String type_name;
    public ClsType type;

    public DecStmtNode(position pos) {
        super (pos);
        var = new ArrayList<>();
        exprs = new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

