package Frontend;

import Parser.MxstarGrammarBaseVisitor;
import Parser.MxstarGrammarParser;
import Util.globalScope;
import AST.*;
import Util.position;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ASTBuilder extends MxstarGrammarBaseVisitor<ASTNode> {

    public int get_dim(String type)
    {
        int cnt = 0, ans = 0;
        for (int i = 0; i < type.length(); i++)
        {
            if (type.charAt(i) == '[')
                cnt++;
            if (type.charAt(i) == ']')
            {
                cnt--;
                if (cnt == 0)
                    ans++;
            }
        }
        return ans;
    }
    public String get_type(MxstarGrammarParser.TheTypeNameContext typename){
        String ans = "Wrong";
        if(typename.Bool()!=null){
            return typename.Bool().getText();
        }
        else if(typename.Void()!=null){
            return typename.Void().getText();
        }
        else if(typename.Int()!=null){
            return typename.Int().getText();
        }
        else if(typename.String()!=null){
            return typename.String().getText();
        }
        else if(typename.Identifier()!=null){
            return typename.Identifier().getText();
        }
        return ans;
    }
    private globalScope gScope;
    public ASTBuilder(globalScope gScope){ this.gScope = gScope;}

    //todo Type

    @Override public ASTNode visitProgram(MxstarGrammarParser.ProgramContext ctx){
        RootNode root = new RootNode(new position(ctx),(FnRootNode)visit(ctx.mainFn()));
        if(ctx.declarationStatement()!=null){
            for(ParserRuleContext stmt: ctx.declarationStatement()){
                root.decs.add((DecStmtNode) visit(stmt));
            }
        }
        if(ctx.classDeclaration()!=null){
            for(ParserRuleContext stmt:ctx.classDeclaration()){
                root.cls.add((ClsDecNode) visit(stmt));
            }
        }
        if(ctx.functionDeclaration()!=null){
            for(ParserRuleContext stmt:ctx.functionDeclaration()){
                root.funs.add((FunDecNode) visit(stmt));
            }
        }
        return root;
    }

    @Override public ASTNode visitClassDeclaration(MxstarGrammarParser.ClassDeclarationContext ctx){
        ClsDecNode node = new ClsDecNode(new position(ctx));
        if(ctx.declarationStatement()!=null){
            for(ParserRuleContext stmt: ctx.declarationStatement())node.decs.add((DecStmtNode) visit(stmt));
        }
        if(ctx.classConstructor()!=null){
            for(ParserRuleContext stmt:ctx.classConstructor())node.constructs.add((ClsstruNode) visit(stmt));
        }
        if(ctx.functionDeclaration()!=null){
            for(ParserRuleContext stmt:ctx.functionDeclaration())node.funs.add((FunDecNode)visit(stmt));
        }
        return node;
    }

    @Override public ASTNode visitFunctionDeclaration(MxstarGrammarParser.FunctionDeclarationContext ctx){
        FunDecNode node = new FunDecNode(new position(ctx));
        node.stmt = (StmtNode)visit(ctx.statement());
        node.type = ctx.theTypeName().getText();
        node.idn = ctx.Identifier().getText();
        return node;
    }

    @Override public ASTNode visitMainFn(MxstarGrammarParser.MainFnContext ctx){
        FnRootNode root = new FnRootNode(new position(ctx),(ComStmtNode)visit(ctx.compoundStatement()));
        return root;

    }

    @Override public ASTNode visitCompoundStatement(MxstarGrammarParser.CompoundStatementContext ctx){
        ComStmtNode com = new ComStmtNode(new position(ctx));

        if(ctx.statement() != null){
            for(ParserRuleContext stmt:ctx.statement()){
                com.stmts.add((StmtNode) visit(stmt));
            }
        }

        return com;
    }

    @Override public ASTNode visitDeclarationStatement(MxstarGrammarParser.DeclarationStatementContext ctx){
          DecStmtNode stmt = new DecStmtNode(new position(ctx));
          if(ctx.primaryDeclaration()!=null){
              stmt.dim =  get_dim(ctx.primaryDeclaration().theTypeName().getText());
              stmt.type = get_type(ctx.primaryDeclaration().theTypeName());
              if(ctx.primaryDeclaration().expression()!=null){
                  for(ParserRuleContext exps:ctx.primaryDeclaration().expression())stmt.exprs.add((ExprNode) visit(exps));
              }
          }
     return stmt;
    }

    //todo visit expression node

    @Override public ASTNode visitExpressionStatement(MxstarGrammarParser.ExpressionStatementContext ctx){
        ExprStmtNode node = new ExprStmtNode(new position(ctx));

        if(ctx.expression()!=null){
            node.exp = (ExprNode) visit(ctx.expression());
        }
        return node;
    }
    @Override public ASTNode visitSelectionStatement(MxstarGrammarParser.SelectionStatementContext ctx){
          SleStmtNode node = new SleStmtNode(new position(ctx));
          node.exp = (ExprNode) visit(ctx.expression());
          for(ParserRuleContext stmt:ctx.statement()){
              node.stmts.add((StmtNode) visit(stmt));
          }
          return node;
    }
    @Override public ASTNode visitJumpStatement(MxstarGrammarParser.JumpStatementContext ctx){
       JpStmtNode node = new JpStmtNode(new position(ctx));
       if(ctx.Return()!=null){
           node.type = ctx.Return().getText();

           if(ctx.expression()!=null){
               node.exp = (ExprNode) visit(ctx.expression());
               node.re_type = node.exp.type;
           }
       }
       else if(ctx.Break()!=null)node.type = ctx.Break().getText();
       else node.type = ctx.Continue().getText();
       return node;
    }
    @Override public ASTNode visitIterationStatement(MxstarGrammarParser.IterationStatementContext ctx){
        ItStmtNode node = new ItStmtNode(new position(ctx));
         if(ctx.While()!=null){
             node.con = (ConNode) visit(ctx.condition());
             node.stmt = (StmtNode) visit(ctx.statement());
         }
         else{
             node.stmt = (StmtNode) visit(ctx.statement());
             if(ctx.forInitialStatement()!=null){
                 if(ctx.forInitialStatement().declarationStatement()!=null)node.ini_stmt = (DecStmtNode)visit(ctx.forInitialStatement().declarationStatement());
                 else node.ini_stmt = (ExprStmtNode) visit(ctx.forInitialStatement().expressionStatement());
             }
             if(ctx.condition()!=null){
                 node.con = (ConNode) visit(ctx.condition());
             }
             if(ctx.expression()!=null){
                 node.exp = (ExprNode) visit(ctx.expression());
             }
         }
         return node;
    }

    @Override public ASTNode visitCondition(MxstarGrammarParser.ConditionContext ctx){
        ConNode node = new ConNode(new position(ctx));
        node.exp = (ExprNode) visit(ctx.expression());
        node.type = node.exp.type;
        return node;
    }

    @Override public ASTNode visitExpression(MxstarGrammarParser.ExpressionContext ctx){
       if(ctx.assignmentExpression().Equal()!=null){
           AssnExpNode node = new AssnExpNode(new position(ctx));
           node.leftson = (ExprNode) visit(ctx.assignmentExpression().logicalOrExpression(0));
           node.rightson = (ExprNode) visit(ctx.assignmentExpression().logicalOrExpression(1));
           return node;
       }
       else return visit(ctx.assignmentExpression().logicalOrExpression(0));
    }
    @Override public ASTNode visitLogicalOrExpression(MxstarGrammarParser.LogicalOrExpressionContext ctx){
        ExprNode node = (ExprNode)visit(ctx.logicalAndExpression(0));
        for(int i = 1; i < ctx.logicalAndExpression().size(); ++i){
            node = new BiExNode(new position(ctx),ctx.OrOr().toString(),"bool",node,(ExprNode) visit(ctx.logicalAndExpression(i)));
        }
        return node;
//        if(ctx.OrOr()!=null){
//            BiExNode node = new BiExNode(new position(ctx),ctx.OrOr().toString(),"bool",(ExprNode) visit(ctx.logicalAndExpression(0)),(ExprNode) visit(ctx.logicalAndExpression(1)));
//            for(int i = 2; i < ctx.logicalAndExpression().size();++i){
//                node = new BiExNode(new position(ctx),ctx.OrOr().toString(),"bool",node,(ExprNode) visit(ctx.logicalAndExpression(i)));
//            }
//            return node;
//        }
//        else return (ExprNode)visit(ctx.logicalAndExpression(0));
    }

    @Override public ASTNode visitLogicalAndExpression(MxstarGrammarParser.LogicalAndExpressionContext ctx){
        ExprNode node = (ExprNode)visit(ctx.inclusiveOrExpression(0));
        for(int i = 1; i < ctx.inclusiveOrExpression().size(); ++i){
            node = new BiExNode(new position(ctx),ctx.AndAnd().toString(),"bool",node,(ExprNode) visit(ctx.inclusiveOrExpression(i)));
        }
        return node;
//        if(ctx.AndAnd()!=null){
//            BiExNode node = new BiExNode(new position(ctx),ctx.AndAnd().toString(),"bool",(ExprNode) visit(ctx.inclusiveOrExpression(0)),(ExprNode) visit(ctx.inclusiveOrExpression(1)));
//            for(int i = 2; i < ctx.inclusiveOrExpression().size();++i){
//                node = new BiExNode(new position(ctx),ctx.AndAnd().toString(),"bool",node,(ExprNode) visit(ctx.inclusiveOrExpression(i)));
//            }
//            return node;
//        }
//        else return (ExprNode)visit(ctx.inclusiveOrExpression(0));
    }

    @Override public ASTNode visitInclusiveOrExpression(MxstarGrammarParser.InclusiveOrExpressionContext ctx){
        ExprNode node = (ExprNode)visit(ctx.exclusiveOrExpression(0));
        for(int i = 1; i < ctx.exclusiveOrExpression().size(); ++i){
            node = new BiExNode(new position(ctx),ctx.Or().toString(),"bool",node,(ExprNode) visit(ctx.exclusiveOrExpression(i)));
        }
        return node;
//        if(ctx.Or()!=null){//todo type
//            BiExNode node = new BiExNode(new position(ctx),ctx.Or().toString(),"bool",(ExprNode) visit(ctx.exclusiveOrExpression(0)),(ExprNode) visit(ctx.exclusiveOrExpression(1)));
//            for(int i = 2; i < ctx.exclusiveOrExpression().size();++i){
//                node = new BiExNode(new position(ctx),ctx.Or().toString(),"bool",node,(ExprNode) visit(ctx.exclusiveOrExpression(i)));
//            }
//            return node;
//        }
//        else return (ExprNode)visit(ctx.exclusiveOrExpression(0));
    }

    @Override public ASTNode visitExclusiveOrExpression(MxstarGrammarParser.ExclusiveOrExpressionContext ctx){
        ExprNode node = (ExprNode)visit(ctx.andExpression(0));
        for(int i = 1; i < ctx.andExpression().size(); ++i){
            node = new BiExNode(new position(ctx),ctx.Caret().toString(),"bool",node,(ExprNode) visit(ctx.andExpression(i)));
        }
        return node;
//        if(ctx.Caret()!=null){//todo type
//            BiExNode node = new BiExNode(new position(ctx),ctx.Caret().toString(),"bool",(ExprNode) visit(ctx.andExpression(0)),(ExprNode) visit(ctx.andExpression(1)));
//            for(int i = 2; i < ctx.andExpression().size();++i){
//                node = new BiExNode(new position(ctx),ctx.Caret().toString(),"bool",node,(ExprNode) visit(ctx.andExpression(i)));
//            }
//            return node;
//        }
//        else return (ExprNode)visit(ctx.andExpression(0));
    }

    @Override public ASTNode visitAndExpression(MxstarGrammarParser.AndExpressionContext ctx){
        ExprNode node = (ExprNode)visit(ctx.equalityExpression(0));
        for(int i = 1; i < ctx.equalityExpression().size(); ++i){
            node = new BiExNode(new position(ctx),ctx.And().toString(),"bool",node,(ExprNode) visit(ctx.equalityExpression(i)));
        }
        return node;
//        if(ctx.And()!=null){//todo type
//            BiExNode node = new BiExNode(new position(ctx),ctx.And().toString(),"bool",(ExprNode) visit(ctx.equalityExpression(0)),(ExprNode) visit(ctx.equalityExpression(1)));
//            for(int i = 2; i < ctx.equalityExpression().size();++i){
//                node = new BiExNode(new position(ctx),ctx.And().toString(),"bool",node,(ExprNode) visit(ctx.equalityExpression(i)));
//            }
//            return node;
//        }
//        else return (ExprNode)visit(ctx.equalityExpression(0));
    }

    @Override public ASTNode visitEqualityExpression(MxstarGrammarParser.EqualityExpressionContext ctx){
        ExprNode node = (ExprNode)visit(ctx.relationalExpression(0));
        for(int i = 1; i < ctx.relationalExpression().size(); ++i){
            String str = (ctx.EqualEqual(i-1)!=null) ? ctx.EqualEqual(i-1).toString():ctx.NotEqual(i-1).toString();
            node = new BiExNode(new position(ctx),str,"bool",node,(ExprNode) visit(ctx.relationalExpression(i)));
        }
        return node;
    }

    @Override public ASTNode visitRelationalExpression(MxstarGrammarParser.RelationalExpressionContext ctx){
        ExprNode node = (ExprNode)visit(ctx.shiftExpression(0));
        for(int i = 1; i < ctx.shiftExpression().size(); ++i){
            String str = "Wrong_";
            if(ctx.Greater().size()>i&&ctx.Greater(i-1)!=null)str = ctx.Greater(i-1).toString();
            else if (ctx.Less().size()>i&&ctx.Less(i-1)!=null)str = ctx.Less(i-1).toString();
            else if(ctx.LessEqual().size()>i&&ctx.LessEqual(i-1)!=null)str = ctx.LessEqual(i-1).toString();
            else if(ctx.GreaterEqual().size()>i&&ctx.GreaterEqual(i-1)!=null)str = ctx.GreaterEqual(i-1).toString();
            node = new BiExNode(new position(ctx),str,"bool",node,(ExprNode) visit(ctx.shiftExpression(i)));
        }
        return node;
    }

    @Override public ASTNode visitShiftExpression(MxstarGrammarParser.ShiftExpressionContext ctx){

    }
    @Override public ASTNode visitLogicalAndExpression(MxstarGrammarParser.LogicalAndExpressionContext ctx){}
    @Override public ASTNode visitLogicalAndExpression(MxstarGrammarParser.LogicalAndExpressionContext ctx){}
    @Override public ASTNode visitLogicalAndExpression(MxstarGrammarParser.LogicalAndExpressionContext ctx){}






}