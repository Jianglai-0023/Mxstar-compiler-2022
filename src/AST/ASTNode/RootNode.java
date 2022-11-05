package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;


public class RootNode extends ASTNode {
    public ArrayList<ASTNode> sequent = new ArrayList<>();
    public FnRootNode fn;
    public RootNode(position pos) {
         super (pos);
    }

@Override
public void accept(ASTVisitor visitor) {
    visitor.visit(this);
}
}

