package AST;

import AST.ASTNode.*;

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
    void visit(AssnExpNode it);
    void visit(BiExNode it);

    void visit(SinExNode it);

    void visit(ConExNode it);
    void visit(FunExNode it);
    void visit(MemExNode it);

    void visit(NewExNode it);
    void visit(ArrExNode it);
    void visit(LamExNode it);
    void visit(JpStmtNode it);
}