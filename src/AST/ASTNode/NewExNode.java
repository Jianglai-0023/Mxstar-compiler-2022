package AST.ASTNode;

import AST.ASTVisitor;
import Util.position;

import java.util.ArrayList;

public class NewExNode extends ExprNode {
    public String type_name;
    public boolean err_array = false;


    public NewExNode(position pos,String type_name_) {
        super(pos);
        type_name = type_name_;
    }

    @Override public void accept(ASTVisitor visitor){visitor.visit(this);}
}