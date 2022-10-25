package AST;

import Util.position;

import java.util.ArrayList;


public class RootNode extends ASTNode {
//    public position pos;
    public FnRootNode fn;

    public ArrayList<DecStmtNode> decs;

    public ArrayList<FunDecNode> funs;

    public ArrayList<ClsDecNode> cls;
    public RootNode(position pos,FnRootNode fn_) {
         super (pos);
         this.fn = fn_;
    }

//    abstract public void accept(ASTVisitor visitor);
@Override
public void accept(ASTVisitor visitor) {
    visitor.visit(this);
}
}

