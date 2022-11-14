package Semantic.Checker;


import Semantic.AST.ASTVisitor;
import Semantic.AST.ASTNode.*;
import Semantic.Util.*;
import Semantic.Util.error.semanticError;

public class SymbolCollector implements ASTVisitor {
    private final globalScope gScope;
    private boolean first_class_look;
    private final ClsType now_class = null;
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
        String.fun.put("ord",Ord);
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

        FunType PrintlnInt = new FunType(Void);
        PrintlnInt.calllist.add(new ClsVarType(Int,"n"));
        this.gScope.addfunType("printlnInt",PrintlnInt,new position(0,0));

        FunType GetString = new FunType(String);
        this.gScope.addfunType("getString",GetString,new position(0,0));

        FunType GetInt = new FunType(Int);
        this.gScope.addfunType("getInt",GetInt,new position(0,0));

        FunType Tstring = new FunType(String);
        Tstring.calllist.add(new ClsVarType(Int,"i"));
        this.gScope.addfunType("toString",Tstring,new position(0,0));
    }
    @Override
    public void visit(RootNode it) {
           for(int i = 0; i < it.sequent.size(); ++i){
               if(it.sequent.get(i).is_cls_dec)
                   it.sequent.get(i).accept(this);
           }
           first_class_look = true;
        for(int i = 0; i < it.sequent.size(); ++i){
            if(it.sequent.get(i).is_cls_dec)
                it.sequent.get(i).accept(this);
        }
        for(int i = 0; i < it.sequent.size(); ++i){
            if(it.sequent.get(i).is_func_dec)
                it.sequent.get(i).accept(this);
        }
    }
    @Override
    public void visit(DecStmtNode it) {
            for(int j = 0; j < it.var.size(); ++j){
                ClsType dec= new ClsType(gScope.getClsTypeFromName(it.var.get(j).type,it.var.get(j).pos));
                dec.dim = it.dim;
                gScope.is_cls.var.put(it.var.get(j).idn,dec);
            }
    }
    @Override
    public void visit(ClsDecNode it) {
        if(!first_class_look) {
            ClsType t = new ClsType(it.idn);
            gScope.addclsType(it.idn,t,it.pos);
        }
        else {
            gScope.is_cls = new ClsType(gScope.getClsTypeFromName(it.idn,it.pos));
            for(int i = 0; i < it.funs.size(); ++i){
                if(it.funs.get(i).idn.equals(it.idn))throw new semanticError("function name same as cls",it.pos);
                it.funs.get(i).accept(this);
            }
            if(it.constructs.size()>1)throw new semanticError("to many constructs",it.pos);
            for(int i = 0; i < it.constructs.size(); ++i){
                 if(!it.constructs.get(i).idn.equals(it.idn))throw new semanticError("constru func different name with cls",it.pos);
                it.constructs.get(i).accept(this);
            }
            it.decs.forEach(p-> p.accept(this));
            gScope.is_cls = null;
        }
    }
    @Override
    public void visit(FunDecNode it) {
        ClsType re = new ClsType(gScope.getClsTypeFromName(it.re_type_name,it.pos));
        re.dim = it.dim;
         FunType t = new FunType(re);
         for(int i = 0; i < it.para.size(); ++i){
             ClsType pa = new ClsType(gScope.getClsTypeFromName(it.para.get(i).type,it.pos));
             pa.dim = it.para.get(i).dim;//数组
             t.calllist.add(new ClsVarType(pa,it.para.get(i).idn));
         }
         if(gScope.is_cls==null) gScope.addfunType(it.idn,t,it.pos);
         else gScope.is_cls.fun.put(it.idn,t);
         it.fun_type =t;
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
