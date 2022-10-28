package Checker;


import AST.ASTVisitor;
import AST.ASTNode.*;
import Util.*;
import Util.error.semanticError;
import com.sun.source.tree.VariableTree;

public class SymbolCollector implements ASTVisitor {
    private globalScope gScope;
    public SymbolCollector(globalScope gScope) {
        this.gScope = gScope;

        ClsType Int = new ClsType("int");
        this.gScope.addclsType("int",Int,new position(0,0));

        ClsType Bool = new ClsType("bool");
        this.gScope.addclsType("bool",Bool,new position(0,0));

        ClsType Void = new ClsType("void");
        this.gScope.addclsType("void",Void,new position(0,0));

        ClsType String = new ClsType("string");
        String.fun.put("length",new FunType(Int));
        FunType Substring = new FunType(String);
        Substring.calllist.add(new VarDef("int","left",new position(0,0)));
        Substring.calllist.add(new VarDef("int","right",new position(0,0)));
        String.fun.put("substring",Substring);
        String.fun.put("parseInt",new FunType(Int));
        FunType Ord = new FunType(Int);
        Ord.calllist.add(new VarDef("int","pos",new position(0,0)));
        String.fun.put("order",Ord);
        this.gScope.addclsType("string",String,new position(0,0));

//        ClsType Array = new ClsType("array");
//        this.gScope.addclsType("array",Array,new position(0,0));
    }
    @Override
    public void visit(RootNode it) {
           it.cls.forEach(p->p.accept(this));
           it.funs.forEach(p->p.accept(this));
//           it.decs.forEach(p->p.accept(this));
    }
    @Override
    public void visit(DecStmtNode it) {
         it.idn.forEach(p->gScope.defineVariable(p.idn,gScope.getClsTypeFromName(p.type,it.pos),it.pos));
    }
    @Override
    public void visit(ClsDecNode it) {
       ClsType t = new ClsType(it.idn);
       it.decs.forEach(p-> t.var.addAll(p.idn));
       for(FunDecNode node: it.funs){
           FunType ty = new FunType((ClsType) node.type);
           ty.calllist.addAll(node.para);
           t.fun.put(node.idn,ty);
       }
    }
    @Override
    public void visit(FunDecNode it) {
         FunType t = new FunType((ClsType) it.type);
         t.calllist.addAll(it.para);
    }
    @Override
    public void visit(FnRootNode it) {}
    @Override
    public void visit(ComStmtNode it) {}
    @Override
    public void visit(VarDefNode it) {}
    @Override
    public void visit(ExprStmtNode it) {}
    @Override
    public void visit(SleStmtNode it) {}
    @Override
    public void visit(ItStmtNode it) {}
    @Override
    public void visit(ConNode it) {}
    @Override
    public void visit(ClsstruNode it) {}
    @Override
    public void visit(AssnExpNode it) {}
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
