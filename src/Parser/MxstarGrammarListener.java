// Generated from /Users/jianglai/IdeaProjects/Mx-compiler2022/src/Parser/MxstarGrammar.g4 by ANTLR 4.10.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxstarGrammarParser}.
 */
public interface MxstarGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MxstarGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MxstarGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#mainFn}.
	 * @param ctx the parse tree
	 */
	void enterMainFn(MxstarGrammarParser.MainFnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#mainFn}.
	 * @param ctx the parse tree
	 */
	void exitMainFn(MxstarGrammarParser.MainFnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(MxstarGrammarParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(MxstarGrammarParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#functionParametersList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParametersList(MxstarGrammarParser.FunctionParametersListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#functionParametersList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParametersList(MxstarGrammarParser.FunctionParametersListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#functionCallList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallList(MxstarGrammarParser.FunctionCallListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#functionCallList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallList(MxstarGrammarParser.FunctionCallListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MxstarGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MxstarGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#primaryDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryDeclaration(MxstarGrammarParser.PrimaryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#primaryDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryDeclaration(MxstarGrammarParser.PrimaryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void enterClassConstructor(MxstarGrammarParser.ClassConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void exitClassConstructor(MxstarGrammarParser.ClassConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MxstarGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MxstarGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#theTypeName}.
	 * @param ctx the parse tree
	 */
	void enterTheTypeName(MxstarGrammarParser.TheTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#theTypeName}.
	 * @param ctx the parse tree
	 */
	void exitTheTypeName(MxstarGrammarParser.TheTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#bracket}.
	 * @param ctx the parse tree
	 */
	void enterBracket(MxstarGrammarParser.BracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#bracket}.
	 * @param ctx the parse tree
	 */
	void exitBracket(MxstarGrammarParser.BracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(MxstarGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(MxstarGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(MxstarGrammarParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(MxstarGrammarParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelfExpression(MxstarGrammarParser.SelfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelfExpression(MxstarGrammarParser.SelfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(MxstarGrammarParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(MxstarGrammarParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#postExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostExpression(MxstarGrammarParser.PostExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#postExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostExpression(MxstarGrammarParser.PostExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(MxstarGrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(MxstarGrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#mulOperator}.
	 * @param ctx the parse tree
	 */
	void enterMulOperator(MxstarGrammarParser.MulOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#mulOperator}.
	 * @param ctx the parse tree
	 */
	void exitMulOperator(MxstarGrammarParser.MulOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(MxstarGrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(MxstarGrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(MxstarGrammarParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(MxstarGrammarParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(MxstarGrammarParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(MxstarGrammarParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftOperator(MxstarGrammarParser.ShiftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftOperator(MxstarGrammarParser.ShiftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(MxstarGrammarParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(MxstarGrammarParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(MxstarGrammarParser.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(MxstarGrammarParser.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(MxstarGrammarParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(MxstarGrammarParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#equalAndNotEqualoperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualAndNotEqualoperator(MxstarGrammarParser.EqualAndNotEqualoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#equalAndNotEqualoperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualAndNotEqualoperator(MxstarGrammarParser.EqualAndNotEqualoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(MxstarGrammarParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(MxstarGrammarParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(MxstarGrammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(MxstarGrammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(MxstarGrammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(MxstarGrammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(MxstarGrammarParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(MxstarGrammarParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(MxstarGrammarParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(MxstarGrammarParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(MxstarGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(MxstarGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MxstarGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MxstarGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(MxstarGrammarParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(MxstarGrammarParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(MxstarGrammarParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(MxstarGrammarParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MxstarGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MxstarGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MxstarGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MxstarGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(MxstarGrammarParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(MxstarGrammarParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(MxstarGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(MxstarGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(MxstarGrammarParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(MxstarGrammarParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(MxstarGrammarParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(MxstarGrammarParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(MxstarGrammarParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(MxstarGrammarParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(MxstarGrammarParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(MxstarGrammarParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#forInitialStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInitialStatement(MxstarGrammarParser.ForInitialStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#forInitialStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInitialStatement(MxstarGrammarParser.ForInitialStatementContext ctx);
}