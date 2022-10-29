package Checker;

import AST.*;
import AST.ASTNode.*;
import Util.*;
import Util.error.semanticError;

public class SemanticsCheck implements ASTVisitor {
    private Scope currentScope;
    private final globalScope gScope;
//    private Type currentStruct = null;

    public SemanticsCheck(globalScope gScope) {
        currentScope = this.gScope = gScope;
    }
    public boolean type_equal(ClsType x,ClsType y){
        return x.idn.equals(y.idn)&&x.dim==y.dim;
    }
    @Override
    public void visit(RootNode it) {
        it.cls.forEach(i->i.accept(this));
        it.decs.forEach(i->i.accept(this));
        it.funs.forEach(i->i.accept(this));
        it.fn.accept(this);
    }

    @Override
    public void visit(FnRootNode it) {
       currentScope = new Scope(currentScope);
        it.stmts.accept(this);
        currentScope = currentScope.parentScope();
    }

    @Override
    public void visit(ComStmtNode it) {
        currentScope = new Scope(currentScope);
        it.stmts.forEach((i->i.accept(this)));
        currentScope = currentScope.parentScope();
    }

    @Override
    public void visit(VarDefNode it) {
        it.type = currentScope.getVarType(it.idn,true);
        it.is_left_val = true;
    }

    @Override
    public void visit(DecStmtNode it) {
        if(currentScope.is_cls==null||currentScope.is_func!=null){//不是class中的or 是函数中的
            ClsType clst = gScope.getClsTypeFromName(it.type_name,it.pos);
            if(clst==null)throw new semanticError("dec class not exists",it.pos);
            clst.dim = it.dim;
            it.type = clst;
        }
       for(VarDef def : it.var){
           currentScope.defineVariable(def.idn,it.type,it.pos);
       }
       for(ExprNode ex:it.exprs){
           ex.accept(this);
           if(!type_equal(ex.type,it.type))throw new semanticError("Semantic Error: DecStmt unmatch type",it.pos);
       }
    }

    @Override
    public void visit(ExprStmtNode it) {
         it.exp.accept(this);
    }



    @Override
    public void visit(SleStmtNode it) {
        if(!it.exp.type.equals("bool"))throw new semanticError("Semantic Error: if expression not bool",it.pos);
        it.stmts.forEach(i->i.accept(this));
    }

    @Override
    public void visit(ItStmtNode it) {
        if(it.is_while)
        {
            it.con.accept(this);
            it.stmt.accept(this);
        }
        else{
            currentScope = new Scope(currentScope);
            if(it.con!=null)it.con.accept(this);
            if(it.ini_stmt!=null)it.ini_stmt.accept(this);
            it.stmt.accept(this);
            if(it.exp!=null)it.exp.accept(this);
            currentScope = currentScope.parentScope();
        }
    }

    @Override
    public void visit(ConNode it) {
       if(!it.type.equals("bool"))throw new semanticError("Semantic Error: condition is not bool",it.pos);
       it.exp.accept(this);
    }

    @Override
    public void visit(ClsDecNode it) {
        //symbol collector的时候已经在global collector中增加名字了
        currentScope = new Scope(currentScope);
        it.decs.forEach(i->i.accept(this));
        if(it.constructs.size()>1)throw new semanticError("Semantics Error: ClsDec too many contruct function",it.pos);
        it.constructs.forEach(i->i.accept(this));
        it.funs.forEach(i->i.accept(this));
        currentScope = currentScope.parentScope();
    }

    @Override
    public void visit(FunDecNode it) {//check return type
        currentScope = new Scope(currentScope);
        if(currentScope.is_cls==null){
            currentScope.is_func = gScope.getFunTypeFromName(it.idn,it.pos);
            it.stmt.accept(this);
            currentScope = currentScope.parentScope();
        }
        else{
//            FunType fun = new FunType(it.re_type);
            it.para.forEach(i->currentScope.defineVariable(i.idn,gScope.getClsTypeFromName(i.type,it.pos),it.pos));
//            currentScope.is_cls.fun.put(it.idn,fun);
            currentScope.is_func = currentScope.is_cls.fun.get(it.idn);
            it.stmt.accept(this);
            currentScope = currentScope.parentScope();
        }
    }

    @Override
    public void visit(ClsstruNode it) {
        currentScope = new Scope(currentScope);
        currentScope.is_constru = true;
        if(!it.idn.equals(currentScope.is_cls.idn))throw new semanticError("wrong construct name",it.pos);
        it.stmt.accept(this);
        currentScope = currentScope.parentScope();
    }

    @Override
    public void visit(AssnExpNode it) {
        it.leftson.accept(this);
        it.rightson.accept(this);

        if(!it.leftson.is_left_val)throw new semanticError("assign not left val",it.pos);
        if(!it.leftson.type.equals(it.rightson.type))throw new semanticError("unmatch assn type",it.pos);
        if(it.leftson.type.equals("this"))throw new semanticError("this on left",it.pos);
        if(it.leftson.is_constant)throw new semanticError("constant on left",it.pos);
    }

    @Override
    public void visit(BiExNode it) {
         it.lson.accept(this);
         it.rson.accept(this);
         if(it.lson.type.dim != 0 && !it.rson.type.idn.equals("null")||it.rson.type.dim != 0 && !it.lson.type.idn.equals("null"))throw new semanticError("bi arraytype",it.pos);
         else if(!type_equal(it.lson.type,it.rson.type))throw new semanticError("unmatch type in BI",it.pos);
         it.type = it.lson.type;
         if(it.type.idn.equals("bool")&&(it.op!=OP.EQUALEQUAL&&it.op!=OP.NOTEQUAL))throw new semanticError("wrong op for bool",it.pos);
         if(it.lson.is_left_val && it.rson.is_left_val)it.is_left_val = true;
    }

    @Override
    public void visit(SinExNode it) {
        it.exp.accept(this);
        if(!it.exp.is_left_val|| it.op==OP.NOT && !it.exp.type.idn.equals("bool"))throw new semanticError("wrong SinEx",it.pos);
        if(it.op==OP.PLUSPLUS||it.op==OP.MINUSMINUS)it.is_left_val = true;
    }

    @Override
    public void visit(ConExNode it) {
        it.type = gScope.getClsTypeFromName(it.type_name,it.pos);
    }

    @Override
    public void visit(FunExNode it) {
        it.exp.accept(this);
        FunType fun;
        if(currentScope.is_cls!=null){//in cls
            fun =currentScope.is_cls.fun.get(it.idn);
            if(fun==null) fun = gScope.getFunTypeFromName(it.idn,it.pos);
        }
        else{
            fun = gScope.getFunTypeFromName(it.idn,it.pos);
        }
        it.calllist.forEach(i-> i.accept(this));
        if(it.calllist.isEmpty() && !fun.calllist.isEmpty()||!it.calllist.isEmpty() && fun.calllist.isEmpty())throw new semanticError("function call list empty and not empty",it.pos);
        else if(!it.calllist.isEmpty() && !fun.calllist.isEmpty()){
            if(it.calllist.size()!=fun.calllist.size())throw new semanticError("size unmatch in function call list",it.pos);
            for(int i = 0; i < fun.calllist.size(); ++i){
                if(!it.calllist.get(i).type.equals(fun.calllist.get(i).type))throw new semanticError("type unmatch in function call list",it.pos);
            }
        }
    }

    @Override
    public void visit(MemExNode it) {
       it.target.accept(this);
       it.type = it.target.type;
       int i = 0;
       for(;i < it.type.var.size(); ++i){
           if(it.member.equals(it.type.var.get(i).idn)){
               it.type = it.type.var.get(i).type;
               break;
           }
       }
       if(i == it.type.var.size()){
           if(it.type.fun.get(it.member)==null)throw new semanticError("no member visit", it.pos);
           it.type = it.type.fun.get(it.member).return_type;
       }
    }

    @Override
    public void visit(NewExNode it) {
         if(currentScope.getVarType(it.idn,true)==null || currentScope.getVarType(it.idn,true).dim != it.dim)throw  new semanticError("can't new",it.pos);
         if(it.err_array)throw new semanticError("wrong array new",it.pos);
         it.type = currentScope.getVarType(it.idn,true);
    }

    @Override
    public void visit(ArrExNode it) {//dim 在node中维护
        it.type = currentScope.getVarType(it.idn,true);
        if(it.type == null || it.type.dim < it.dim)throw new semanticError("wrong array exp",it.pos);
    }

    @Override
    public void visit(LamExNode it) {
        currentScope = new Scope(currentScope);
        currentScope.is_func = new FunType(null);
        it.stmts.forEach(i->i.accept(this));
        if(currentScope.is_func.return_type==null)it.type = gScope.getClsTypeFromName("void",it.pos);
        else it.type = currentScope.is_func.return_type;
        currentScope = currentScope.parentScope();

        if(it.parameters==null && it.call_lists!=null || it.parameters!=null && it.call_lists==null)throw new semanticError("can't match call and para in lambda",it.pos);
        if(it.call_lists!=null&&it.parameters!=null){
            it.parameters.forEach(i->i.accept(this));
            it.call_lists.forEach(i->i.accept(this));
            if(it.call_lists.size()!=it.parameters.size())throw new semanticError("unmatch para size in lambda",it.pos);
            for(int i = 0; i < it.call_lists.size(); ++i){
                if(!it.call_lists.get(i).type.idn.equals(it.parameters.get(i).type.idn)||it.call_lists.get(i).type.dim!=it.parameters.get(i).type.dim)throw new semanticError("element can't match in lambda",it.pos);
            }
        }

    }

    @Override
    public void visit(JpStmtNode it) {
         if(it.exp!=null)it.exp.accept(this);
         if(it.exp==null && it.is_return)it.re_type =gScope.getClsTypeFromName("void",it.pos);
         else if(it.is_return)it.re_type = it.exp.type;
    }
}
