package AST.ASTNode;
import AST.ASTVisitor;
import Util.Type;
import Util.position;

public class FnRootNode extends ASTNode {
    public ComStmtNode stmts;

    public FnRootNode(position pos,ComStmtNode com) {
        super(pos);
        stmts = com;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
