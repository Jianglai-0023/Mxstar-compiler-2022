package AST;

public interface ASTVisitor {//比抽象类更抽象的抽象方法集合

void visit(RootNode it);

    void visit(FnRootNode it);

    void visit(ComStmtNode it);

    void visit(VarDefNode it);

    void visit(DecStmtNode it);

    void visit(ExprStmtNode it);

    void visit(SleStmtNode it);

    void visit(ItStmtNode it);

    void visit(ConNode it);

    void visit(ClsDecNode it);

    void visit(FunDecNode it);

    void visit(ClsstruNode it);
}