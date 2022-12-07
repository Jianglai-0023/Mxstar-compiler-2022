package codegen.llvmIR;

import Semantic.AST.ASTNode.*;
import Semantic.AST.ASTVisitor;
import Semantic.Util.*;
import codegen.llvmIR.Entity.Entity;
import codegen.llvmIR.Entity.Register;
import codegen.llvmIR.Type.IRType;
import codegen.llvmIR.Type.IRbase;
import codegen.llvmIR.Type.IRcls;
import codegen.llvmIR.Type.IRptr;
import codegen.llvmIR.tools.Class;
import codegen.llvmIR.tools.Function;
import codegen.llvmIR.tools.IRBlock;
import codegen.llvmIR.tools.IRModule;

import java.util.ArrayList;

public class IRCollector implements ASTVisitor {

    private IRModule tp_module;

    private Scope current_scope;

    private globalScope gScope;

    private Class cur_cls = null;

    private int reg_num;

    public IRCollector(IRModule m,Scope s){
       tp_module = m;
       gScope = (globalScope)s;
       reg_num = 0;
       current_scope = s;
    }

    private IRType typeTranslate(ClsType c){ //for function return type
        if(c.dim==0 && !c.idn.equals("string")){
            return switch (c.idn) {
                case "void" -> new IRbase(IRbase.typeToken.VOID, 0);
                case "int" -> new IRbase(IRbase.typeToken.I, 32);
                case "bool" -> new IRbase(IRbase.typeToken.I, 8);
                default -> new IRcls(gScope.get_IRcls_from_name(c.idn));
            };
        }else{
            assert(!c.idn.equals("void"));
            IRType t = switch (c.idn) {
                case "int" -> new IRbase(IRbase.typeToken.I, 32);
                case "bool", "string" -> new IRbase(IRbase.typeToken.I, 8);
                default -> new IRcls(gScope.get_IRcls_from_name(c.idn));
            };
            t = new IRptr(t);
            for(int i = 0; i < c.dim; ++i){
                t = new IRptr(t);
            }
            return t;
        }
    }

    private IRType typeTranslate(VarDef c){
        if(c.dim==0 && !c.type.equals("string")){
            return switch (c.type) {
                case "int" -> new IRbase(IRbase.typeToken.I, 32);
                case "bool" -> new IRbase(IRbase.typeToken.I, 8);
                default -> new IRcls(gScope.get_IRcls_from_name(c.idn));
            };
        }else{
            assert(!c.type.equals("void"));
            IRType t = switch (c.type) {
                case "int" -> new IRbase(IRbase.typeToken.I, 32);
                case "bool", "string" -> new IRbase(IRbase.typeToken.I, 8);
                default -> new IRcls(gScope.get_IRcls_from_name(c.idn));
            };
            if(c.type.equals("string"))t = new IRptr(t);
            for(int i = 0; i < c.dim; ++i){
                t = new IRptr(t);
            }
            return t;
        }
    }

    @Override
    public void visit(RootNode it) {

        it.sequent.forEach(i->{
            if(i instanceof ClsDecNode){
                Class cur = new Class(((ClsDecNode) i).idn,"class."+((ClsDecNode) i).idn);
                gScope.add_IRcls(cur);
            }
        }
        );

        it.sequent.forEach(i->{
            if(i instanceof ClsDecNode){
                cur_cls = gScope.get_IRcls_from_name(((ClsDecNode) i).idn);
                i.accept(this);
                cur_cls = null;
            }
        });

        it.sequent.forEach(i->{
            if(i instanceof FunDecNode){
                i.accept(this);
            }
        });
    }

    @Override
    public void visit(ClsDecNode it) {
        it.decs.forEach(i->{
            ClsType t = new ClsType(gScope.getClsTypeFromName(i.type_name,new position(0,0)));
            cur_cls.vars.add(typeTranslate(t));
        });
        it.funs.forEach(i->{
            i.accept(this);
        });

    }

    @Override
    public void visit(FunDecNode it) {
        reg_num = 0;
        assert it.fun_type.return_type.dim==it.return_type.dim && it.return_type.idn.equals(it.fun_type.return_type.idn);
        Function f = new Function(it.idn,typeTranslate(it.fun_type.return_type));

        f.identifier = (cur_cls!=null ? cur_cls.identifier+ ".":"")  + it.idn;

        it.para.forEach(i->
            f.parameters.add(new Register(false,typeTranslate(i),Integer.toString(reg_num++)))
        );
        if(cur_cls!=null)f.parameters.add(new Register(false,new IRptr(new IRcls(cur_cls)),Integer.toString(reg_num++)));
        f.reg_num = reg_num;
        f.entry_block = new IRBlock();
        f.entry_block.parameters = f.parameters;
        if(cur_cls==null)gScope.add_func(f);
        else cur_cls.funcs.add(f);
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
