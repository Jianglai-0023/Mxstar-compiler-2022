package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;

public class NewExNode extends ExprNode {
    public String idn;
    public ArrayList<ExprNode> exps;
    public boolean err_array = false;


    public NewExNode(position pos,String idn_) {
        super(pos);
        idn = idn_;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}