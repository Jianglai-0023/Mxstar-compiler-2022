package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;

public class NewExNode extends ExprNode {
    public String type;
    public String idn;


    public NewExNode(position pos,String type_,String idn_) {
        super(pos);
        type = type_;
        idn = idn_;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}