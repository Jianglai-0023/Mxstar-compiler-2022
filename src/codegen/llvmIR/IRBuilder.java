package codegen.llvmIR;


import Semantic.AST.ASTNode.*;
import Semantic.AST.ASTVisitor;

public class IRBuilder implements ASTVisitor {

    public IRBuilder(RootNode astroot){
            this.visit(astroot);
    }

    @Override
    public void visit(RootNode it) {

    }

    @Override
    public void visit(FnRootNode it) {

    }

    @Override
    public void visit(ComStmtNode it) {

    }

    @Override
    public void visit(VarDefNode it) {

    }

    @Override
    public void visit(DecStmtNode it) {

    }

    @Override
    public void visit(ExprStmtNode it) {

    }

    @Override
    public void visit(SleStmtNode it) {

    }

    @Override
    public void visit(ItStmtNode it) {

    }

    @Override
    public void visit(ConNode it) {

    }

    @Override
    public void visit(ClsDecNode it) {

    }

    @Override
    public void visit(FunDecNode it) {

    }

    @Override
    public void visit(ClsstruNode it) {

    }

    @Override
    public void visit(AssnExpNode it) {

    }

    @Override
    public void visit(BiExNode it) {

    }

    @Override
    public void visit(SinExNode it) {

    }

    @Override
    public void visit(ConExNode it) {

    }

    @Override
    public void visit(FunExNode it) {

    }

    @Override
    public void visit(MemExNode it) {

    }

    @Override
    public void visit(NewExNode it) {

    }

    @Override
    public void visit(ArrExNode it) {

    }

    @Override
    public void visit(LamExNode it) {

    }

    @Override
    public void visit(JpStmtNode it) {

    }
}