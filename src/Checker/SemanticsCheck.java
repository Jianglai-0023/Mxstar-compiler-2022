package Checker;

import AST.*;
import AST.ASTNode.*;
import Util.*;
import Util.error.semanticError;

public class SemanticsCheck implements ASTVisitor {
    private Scope currentScope;
    private boolean main_appeared = false;
    private final globalScope gScope;
//    private Type currentStruct = null;

    public SemanticsCheck(globalScope gScope) {
        currentScope = this.gScope = gScope;
    }
    public boolean type_equal(ClsType x,ClsType y){

        if(x.idn.equals("null")&&y.dim!=0||(y.idn.equals("null")&&x.dim!=0))return true;
        if(!y.idn.equals("int")&&!y.idn.equals("bool")&&!y.idn.equals("string")&&x.idn.equals("null")
                ||!x.idn.equals("int")&&!x.idn.equals("bool")&&!x.idn.equals("string")&&y.idn.equals("null"))
            return true;
        return x.idn.equals(y.idn)&&x.dim==y.dim;
    }
    @Override
    public void visit(RootNode it) {
        for(int i = 0; i < it.sequent.size(); ++i){
            if(it.sequent.get(i).is_main&&!main_appeared)main_appeared=true;
            else if(it.sequent.get(i).is_main&&main_appeared)throw new semanticError("main repeated",it.pos);
            it.sequent.get(i).accept(this);
        }
        if(!main_appeared)throw new semanticError("no main()",it.pos);
//        it.fn.accept(this);
    }

    @Override
    public void visit(FnRootNode it) {
       currentScope = new Scope(currentScope);
       currentScope.is_func = new FunType(new ClsType("int"));
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
        if(currentScope.getVarType(it.idn,false)==null){//可能是函数，寻找顺序必须先将本层的全部找完，才能到下一层
            if(currentScope.is_in_cls()==null){
                it.fun_type = gScope.getFunTypeFromName(it.idn,it.pos);
            }
            else{
                it.fun_type=currentScope.is_in_cls().fun.get(it.idn);
                if(it.fun_type==null){
                    it.fun_type = gScope.getFunTypeFromName(it.idn,it.pos);
                }
            }
            if(it.fun_type==null)throw new semanticError("undefined var type",it.pos);
            it.type = it.fun_type.return_type;
            return;
        }
        it.type = new ClsType(currentScope.getVarType(it.idn,true));
        it.is_left_val = true;
    }

    @Override
    public void visit(DecStmtNode it) {
        if(gScope.getClsTypeFromName(it.type_name,it.pos)==null)throw new semanticError("dec class not exists",it.pos);
        ClsType clst = new ClsType(gScope.getClsTypeFromName(it.type_name,it.pos));
//        System.out.println("!!");
//        System.out.println(it.dim);
            clst.dim = it.dim;
            it.type = clst;
       for(ExprNode ex:it.exprs){
           ex.accept(this);
           if(!ex.type.idn.equals("null")&&!type_equal(ex.type,it.type))
               throw new semanticError("Semantic Error: DecStmt unmatch type",it.pos);
       }
        for(VarDef def : it.var){
//           System.out.println("()()");
//           System.out.println(def.idn);
            currentScope.defineVariable(def.idn,new ClsType(it.type),it.pos);
        }
    }

    @Override
    public void visit(ExprStmtNode it) {
        if(it.exp==null)return;
         it.exp.accept(this);
    }



    @Override
    public void visit(SleStmtNode it) {
        it.exp.accept(this);
        if(!it.exp.type.idn.equals("bool"))throw new semanticError("Semantic Error: if expression not bool",it.pos);
        it.stmts.forEach(i->i.accept(this));
    }

    @Override
    public void visit(ItStmtNode it) {
        currentScope.is_in_loop = true;
        if(it.is_while)
        {
            it.con.accept(this);
            it.stmt.accept(this);
        }
        else{
            currentScope = new Scope(currentScope);
            if(it.con!=null)it.con.accept(this);
            if(it.ini_stmt!=null)it.ini_stmt.accept(this);
            if(it.exp!=null)it.exp.accept(this);
            it.stmt.accept(this);
            currentScope = currentScope.parentScope();
        }
        currentScope.is_in_loop = false;
    }

    @Override
    public void visit(ConNode it) {
        it.exp.accept(this);
        it.type = it.exp.type;
       if(!type_equal(it.type,new ClsType("bool")))throw new semanticError("condition is not bool",it.pos);
    }

    @Override
    public void visit(ClsDecNode it) {
        //symbol collector的时候已经在global collector中增加名字了
        currentScope = new Scope(currentScope);
        currentScope.is_cls = new ClsType(gScope.getClsTypeFromName(it.idn,it.pos));
        it.decs.forEach(i->i.accept(this));
        if(it.constructs.size()>1)throw new semanticError("Semantics Error: ClsDec too many contruct function",it.pos);
        it.constructs.forEach(i->i.accept(this));
        it.funs.forEach(i->i.accept(this));
        currentScope = currentScope.parentScope();
    }

    @Override
    public void visit(FunDecNode it) {//check return type
        currentScope = new Scope(currentScope);
        currentScope.is_func = it.fun_type;//当前的function type
        it.fun_type.calllist.forEach(i->currentScope.defineVariable(i.idn,i.type,it.pos));//定义新的变量进入scope
        it.stmt.accept(this);
        currentScope = currentScope.parentScope();
    }

    @Override
    public void visit(ClsstruNode it) {
        currentScope = new Scope(currentScope);
        currentScope.is_constru = true;
        if(!it.idn.equals(currentScope.is_in_cls().idn))throw new semanticError("wrong construct name",it.pos);//todo find class in Scope
        it.stmt.accept(this);
        currentScope = currentScope.parentScope();
    }

    @Override
    public void visit(AssnExpNode it) {
        it.leftson.accept(this);

//        System.out.println(it.leftson.type.dim);
        it.rightson.accept(this);
//        System.out.println(it.leftson.type.dim);

        if(!it.leftson.is_left_val)throw new semanticError("assign not left val",it.pos);


        System.out.println(it.leftson.type.dim);
        if(!type_equal(it.leftson.type,it.rightson.type))
            throw new semanticError("unmatch assn type",it.pos);
        if(it.leftson.type.idn.equals("this"))throw new semanticError("this on left",it.pos);
        if(it.leftson.is_constant)throw new semanticError("constant on left",it.pos);
    }

    @Override
    public void visit(BiExNode it) {
         it.lson.accept(this);
         it.rson.accept(this);
         if(it.op==OP.EQUALEQUAL || it.op == OP.NOTEQUAL){
             if(!type_equal(it.lson.type,it.rson.type))throw new semanticError("bi arraytype2",it.pos);
             it.type = new ClsType("bool");
            return;
         }
         else if(!type_equal(it.lson.type,it.rson.type))
             throw new semanticError("unmatch type in BI",it.pos);
         //判断type
         if(it.op.compareTo(OP.LESS)>=0&& it.op.compareTo(OP.NOT) <= 0)
             it.type = new ClsType("bool");
         else it.type = it.lson.type;

         if(it.op.compareTo(OP.PLUS)==0 && !it.lson.type.idn.equals("string")&&!it.lson.type.idn.equals("int"))throw new semanticError("wrong plus type0",it.pos);

         else if(it.op.compareTo(OP.PLUS)>0 && it.op.compareTo(OP.GREATERGREATER)<=0 && !it.lson.type.idn.equals("int"))throw new semanticError("wrong plus type1",it.pos);
//         else if(it.op.compareTo(OP.LESS) >= 0 && it.op.compareTo(OP.NOTEQUAL)<=0 && (!it.lson.type.idn.equals("string") && !it.lson.type.idn.equals("int")))throw new semanticError("wrong plus type2",it.pos);
         else if(it.op.compareTo(OP.ANDAND)>=0 && it.op.compareTo(OP.NOT)<=0 && !it.lson.type.idn.equals("bool"))throw new semanticError("wrong plus type3",it.pos);
         else if(it.op.compareTo(OP.AND)>=0 && it.op.compareTo(OP.OR)<=0&&!it.lson.type.idn.equals("int"))throw new semanticError("wrong plus type4",it.pos);
//         else if(it.op.compareTo(OP.EQUALEQUAL) >= 0 && it.op.compareTo(OP.NOTEQUAL)<=0 && (!it.lson.type.idn.equals("string") && !it.lson.type.idn.equals("int")))throw new semanticError("wrong plus type",it.pos)

         if(it.lson.is_left_val && it.rson.is_left_val)it.is_left_val = true;
    }

    @Override
    public void visit(SinExNode it) {
        it.exp.accept(this);
        it.type = it.exp.type;
        if(it.op==OP.NOT && !it.exp.type.idn.equals("bool"))throw new semanticError("wrong SinEx",it.pos);
        if(it.op==OP.L_PLUSPLUS||it.op==OP.L_MINUSMINUS)it.is_left_val = true;
        if((it.op==OP.L_PLUSPLUS||it.op==OP.R_PLUSPLUS ||it.op==OP.L_MINUSMINUS||it.op==OP.R_MINUSMINUS)&& !it.exp.is_left_val)throw new semanticError("single with unleft",it.pos);
        if(!it.type.idn.equals("int")&&it.op!=OP.NOT)
            throw new semanticError("wrong sinex type",it.pos);
    }

    @Override
    public void visit(ConExNode it) {
        if(it.type_name.equals("this")){
            if(currentScope.is_in_cls()==null)throw new semanticError("this is out",it.pos);
            it.type = new ClsType(currentScope.is_in_cls());
            return;
        }
//        else it.type = new ClsType(it.type_name);
//        else if(it.type_name.equals("true")||it.type_name.equals("false"))it.type= new ClsType("bool");
//        else if(it.type_name.equals("string"))
        it.type = new ClsType(gScope.getClsTypeFromName(it.type_name,it.pos));
    }

    @Override
    public void visit(FunExNode it) {
        it.exp.accept(this);
        if(it.exp.fun_type==null)throw new semanticError("wrong function name",it.pos);
        FunType fun = new FunType(it.exp.fun_type);
        it.type = new ClsType(it.exp.type);
        it.calllist.forEach(i-> i.accept(this));
            if(it.calllist.size()!=fun.calllist.size())throw new semanticError("size unmatch in function call list",it.pos);
            for(int i = 0; i < fun.calllist.size(); ++i){
//                System.out.println(it.calllist.get(i).type.idn);
//                System.out.println(fun.calllist.get(i).type.idn);
                if(!type_equal(it.calllist.get(i).type,fun.calllist.get(i).type))throw new semanticError("type unmatch in function call list",it.pos);
        }
    }

    @Override
    public void visit(MemExNode it) {
       it.target.accept(this);
//       it.type = it.target.type;
        System.out.println("Mem");
        System.out.println(it.target.type.dim);
        System.out.println(it.target.type.idn);
        if(it.target.type.dim!=0 && it.member.equals("size")){
            it.fun_type = new FunType(new ClsType("int"));
            it.type = new ClsType("int");
            return;
        }
       int i = 0;
       if(it.target.type.var.containsKey(it.member)){
           it.type = it.target.type.var.get(it.member);//取对象为变量时的形式
           it.is_left_val = true;

       }

        else if (!it.target.type.fun.containsKey(it.member))throw new semanticError("no member visit",it.pos);
        else{
           it.fun_type = it.target.type.fun.get(it.member);
           it.type = it.fun_type.return_type;
       }

//       for(;i < it.target.type.var.size(); ++i){
//           if(it.member.equals(it.type.var.get(i).idn)){
//               it.type = it.type.var.get(i).type;
//               break;
//           }
//       }
//       if(i == it.target.type.var.size()){
//           if(it.target.type.fun.get(it.member)==null)throw new semanticError("no member visit", it.pos);
//           it.type = it.target.type.fun.get(it.member).return_type;
//           it.fun_type = it.target.type.fun.get(it.member);
//       }
    }

    @Override
    public void visit(NewExNode it) {
        if(it.err_array)throw new semanticError("array new wrong index",it.pos);
        ClsType c = new ClsType(gScope.getClsTypeFromName(it.type_name,it.pos));
        c.dim = it.dim;
        it.type = c;
        for(int i = 0; i < it.exps.size(); ++i){
            it.exps.get(i).accept(this);
            if(!type_equal(it.exps.get(i).type,new ClsType("int")))throw new semanticError("array exp not int",it.pos);
        }
//         if(currentScope.getVarType(it.idn,true)==null || currentScope.getVarType(it.idn,true).dim != it.dim)throw  new semanticError("can't new",it.pos);
//         if(it.err_array)throw new semanticError("wrong array new",it.pos);
//         it.type = currentScope.getVarType(it.idn,true);
    }

    @Override
    public void visit(ArrExNode it) {//dim 在node中维护
        it.target.accept(this);
        System.out.println("&&&");
        System.out.println(it.target.type.idn);
        it.type = new ClsType(it.target.type);
        it.type.dim = it.target.type.dim-1;
        it.idx.accept(this);
        it.is_left_val = true;
//        if(it.type == null || it.type.dim < it.dim)throw new semanticError("wrong array exp",it.pos);
    }

    @Override
    public void visit(LamExNode it) {
        currentScope = new Scope(currentScope);
        currentScope.is_func = new FunType(0);//empty的函数Scope//todo
        it.stmts.forEach(i->i.accept(this));
        if(currentScope.is_func.return_type==null)it.type = new ClsType(gScope.getClsTypeFromName("void",it.pos));
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
         if(it.exp==null && it.is_return)it.re_type =new ClsType(gScope.getClsTypeFromName("void",it.pos));
         if(it.is_return){
             if(!currentScope.Is_in_constru()&&(currentScope.is_in_fun()==null))throw new semanticError("return out of func",it.pos);

             if(it.exp==null){
                 if(!currentScope.Is_in_constru() && !currentScope.is_in_fun().return_type.idn.equals("void"))throw new semanticError("unmatch return type1",it.pos);
                 return;
             }
             it.re_type = it.exp.type;
             FunType f = currentScope.is_in_fun();
             if(!type_equal(f.return_type,it.re_type))throw new semanticError("unmatch return type",it.pos);
         }
         else if((it.is_continue || it.is_break) && !currentScope.Is_in_loop())
             throw new semanticError("break or continue out of loop",it.pos);

    }
}
