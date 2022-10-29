package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;


public class RootNode extends ASTNode {
//    public position pos;
    public ArrayList<ASTNode> sequent = new ArrayList<>();
    public FnRootNode fn;


//    public ArrayList<DecStmtNode> decs;

//    public ArrayList<FunDecNode> funs;

//    public ArrayList<ClsDecNode> cls;
    public RootNode(position pos) {
         super (pos);
    }

//    abstract public void accept(ASTVisitor visitor);
@Override
public void accept(ASTVisitor visitor) {
    visitor.visit(this);
}
}

