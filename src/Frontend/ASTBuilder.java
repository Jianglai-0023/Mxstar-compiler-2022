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
          stmt.dim = 0;
//todo no arraydec
          if(ctx.primaryDeclaration().Identifier()!=null){
              stmt.type = ctx.primaryDeclaration().theTypeName().getText();
              for(TerminalNode node:ctx.primaryDeclaration().Identifier()){
                  stmt.idn.add(node.getText());
              }
              for(MxstarGrammarParser.ExpressionContext ex:ctx.primaryDeclaration().expression()){
                  stmt.exprs.add((ExprNode) visit(ex));
              }
          }
          else if(ctx.primaryDeclaration().arrayDeclaration()!=null){
              stmt.type=ctx.primaryDeclaration().arrayDeclaration().theTypeName().getText();
              stmt.dim = 1;
              for(TerminalNode node:ctx.primaryDeclaration().arrayDeclaration().Identifier()){
                  stmt.idn.add(node.getText());
              }
              for(MxstarGrammarParser.ExpressionContext ex:ctx.primaryDeclaration().arrayDeclaration().expression()){
                  stmt.exprs.add((ExprNode) visit(ex));
              }
          }
          else if(ctx.primaryDeclaration().jaggedarrayDeclaration()!=null){
              stmt.type=ctx.primaryDeclaration().jaggedarrayDeclaration().theTypeName().getText();
              stmt.dim = get_dim(ctx.primaryDeclaration().jaggedarrayDeclaration().getText());
              for(TerminalNode node:ctx.primaryDeclaration().jaggedarrayDeclaration().Identifier()){
                  stmt.idn.add(node.getText());
              }
              for(MxstarGrammarParser.ExpressionContext ex:ctx.primaryDeclaration().jaggedarrayDeclaration().expression()){
                  stmt.exprs.add((ExprNode) visit(ex));
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


//todo array = 'new' def






}