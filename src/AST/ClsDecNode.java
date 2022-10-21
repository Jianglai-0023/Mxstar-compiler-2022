package AST;

import Util.position;

import java.util.ArrayList;


public class ClsDecNode extends StmtNode {
    //    public position pos;
    public String idn;//var array j_array
    public ArrayList<DecStmtNode> decs;
    public ArrayList<ClsstruNode> constructs;
    public ArrayList<FunDecNode> funs;

    public ClsDecNode(position pos) {
        super (pos);
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

