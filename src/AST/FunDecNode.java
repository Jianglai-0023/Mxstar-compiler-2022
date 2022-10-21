package AST;

import Util.position;

import java.util.ArrayList;


public class FunDecNode extends StmtNode {
    public String type;
    public StmtNode stmt;
    public String idn;

    public FunDecNode(position pos) {
        super (pos);
    }

    //    abstract public void accept(ASTVisitor visitor);
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

