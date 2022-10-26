package AST.ASTNode;
import AST.ASTVisitor;
import Util.Type;
import Util.position;

public class FnRootNode extends ASTNode {
    public ComStmtNode stmts;
    public Type intType, boolType;

    public FnRootNode(position pos,ComStmtNode com) {
        super(pos);
        stmts = com;
        intType = new Type();
        boolType = new Type();
        intType.isInt = true;
        boolType.isBool = true;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
