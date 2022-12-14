package Semantic.AST.ASTNode;

import Semantic.AST.ASTVisitor;
import Semantic.Util.*;

import java.util.ArrayList;


public class FunDecNode extends StmtNode {

    public ComStmtNode stmt;
    public FunType fun_type;//symbolcollector之后存functype
    public String idn;
    public String re_type_name;
    public int dim = 0;
    public ClsType return_type;
    public ArrayList<VarDef> para = new ArrayList<>();

    public FunDecNode(position pos) {
        super (pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

