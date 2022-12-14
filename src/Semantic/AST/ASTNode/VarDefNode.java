package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.position;




public class VarDefNode extends ExprNode {
    public String idn;
    boolean is_func = false;

    public VarDefNode(position pos,String idn_, int dim_) {
        super (pos);
       idn = idn_;
       dim=dim_;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

