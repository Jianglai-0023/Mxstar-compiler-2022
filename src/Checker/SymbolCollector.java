package Checker;


import AST.ASTVisitor;
import AST.ASTNode.*;
import Util.*;
import Util.error.semanticError;
import com.sun.source.tree.VariableTree;

public class SymbolCollector implements ASTVisitor {
    private globalScope gScope;
    private boolean first_class_look;
    private ClsType now_class = null;
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
        Substring.calllist.add(new ClsVarType(Int,"left"));
        Substring.calllist.add(new ClsVarType(Int,"right"));
        String.fun.put("substring",Substring);
        String.fun.put("parseInt",new FunType(Int));
        FunType Ord = new FunType(Int);
        Ord.calllist.add(new ClsVarType(Int,"pos"));
        String.fun.put("order",Ord);
        this.gScope.addclsType("string",String,new position(0,0));

        ClsType Null = new ClsType("null");
        this.gScope.addclsType("null",Null,new position(0,0));

        FunType Print = new FunType(Void);
        Print.calllist.add(new ClsVarType(String,"str"));
        this.gScope.addfunType("print",Print,new position(0,0));

        FunType PrintLn = new FunType(Void);
        PrintLn.calllist.add(new ClsVarType(String,"str"));
        this.gScope.addfunType("println",PrintLn,new position(0,0));

        FunType PrintInt = new FunType(Void);
        PrintInt.calllist.add(new ClsVarType(Int,"n"));
        this.gScope.addfunType("printInt",PrintInt,new position(0,0));

        FunType GetString = new FunType(String);
//        Getstring.calllist.add(new ClsVarType(String,"str"));
        this.gScope.addfunType("getString",GetString,new position(0,0));

        FunType GetInt = new FunType(Int);
//        GetInt.calllist.add(new ClsVarType(String,"str"));
        this.gScope.addfunType("getInt",GetInt,new position(0,0));

        FunType Tstring = new FunType(String);
        Tstring.calllist.add(new ClsVarType(Int,"i"));
        this.gScope.addfunType("toString",Tstring,new position(0,0));

//        ClsType Array = new ClsType("array");
//        this.gScope.addclsType("array",Array,new position(0,0));
    }
    @Override
    public void visit(RootNode it) {
           it.cls.forEach(p->p.accept(this));
           first_class_look = true;
           it.cls.forEach(p->p.accept(this));
           it.funs.forEach(p->p.accept(this));
//           it.decs.forEach(p->p.accept(this));
    }
    @Override
    public void visit(DecStmtNode it) {
            for(int j = 0; j < it.var.size(); ++j){
                ClsType dec= gScope.getClsTypeFromName(it.var.get(j).type,it.var.get(j).pos);
                gScope.is_cls.var.add(new ClsVarType(dec,it.var.get(j).idn));
            }
    }
    @Override
    public void visit(ClsDecNode it) {
        if(!first_class_look) {
            ClsType t = new ClsType(it.idn);
            gScope.addclsType(it.idn,t,it.pos);
        }
        else {
            ClsType my = gScope.getClsTypeFromName(it.idn,it.pos);
            gScope.is_cls = my;
            for(int i = 0; i < it.funs.size(); ++i){
                it.funs.get(i).accept(this);
            }
            it.decs.forEach(p-> p.accept(this));
            gScope.is_cls = null;
        }
    }
    @Override
    public void visit(FunDecNode it) {
         FunType t = new FunType(gScope.getClsTypeFromName(it.re_type_name,it.pos));
         for(int i = 0; i < it.para.size(); ++i){
             ClsType pa = gScope.getClsTypeFromName(it.para.get(i).type,it.pos);
             t.calllist.add(new ClsVarType(pa,it.para.get(i).idn));
         }
         if(gScope.is_cls==null) gScope.addfunType(it.idn,t,it.pos);
         else gScope.is_cls.fun.put(it.idn,t);
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
