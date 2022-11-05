package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;


public class ClsDecNode extends StmtNode {
    public String idn;//var array j_array
    public ArrayList<DecStmtNode> decs;
    public ArrayList<ClsstruNode> constructs;
    public ArrayList<FunDecNode> funs;

    public ClsDecNode(position pos) {
        super (pos);
        decs = new ArrayList<>();
        constructs = new ArrayList<>();
        funs = new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

