package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.position;

import java.util.ArrayList;


public class RootNode extends ASTNode {
    public ArrayList<ASTNode> sequent = new ArrayList<>();
    public RootNode(position pos) {
         super (pos);
    }

@Override
public void accept(ASTVisitor visitor) {
    visitor.visit(this);
}
}

