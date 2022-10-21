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
	 * Enter a parse tree produced by {@link MxstarGrammarParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(MxstarGrammarParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(MxstarGrammarParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#jaggedarrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterJaggedarrayDeclaration(MxstarGrammarParser.JaggedarrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#jaggedarrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitJaggedarrayDeclaration(MxstarGrammarParser.JaggedarrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#arrayVisit}.
	 * @param ctx the parse tree
	 */
	void enterArrayVisit(MxstarGrammarParser.ArrayVisitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#arrayVisit}.
	 * @param ctx the parse tree
	 */
	void exitArrayVisit(MxstarGrammarParser.ArrayVisitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#arraySize}.
	 * @param ctx the parse tree
	 */
	void enterArraySize(MxstarGrammarParser.ArraySizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#arraySize}.
	 * @param ctx the parse tree
	 */
	void exitArraySize(MxstarGrammarParser.ArraySizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#arrayCreate}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreate(MxstarGrammarParser.ArrayCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#arrayCreate}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreate(MxstarGrammarParser.ArrayCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#jaggedarrayCreate}.
	 * @param ctx the parse tree
	 */
	void enterJaggedarrayCreate(MxstarGrammarParser.JaggedarrayCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#jaggedarrayCreate}.
	 * @param ctx the parse tree
	 */
	void exitJaggedarrayCreate(MxstarGrammarParser.JaggedarrayCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#jaggedarrayVisit}.
	 * @param ctx the parse tree
	 */
	void enterJaggedarrayVisit(MxstarGrammarParser.JaggedarrayVisitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#jaggedarrayVisit}.
	 * @param ctx the parse tree
	 */
	void exitJaggedarrayVisit(MxstarGrammarParser.JaggedarrayVisitContext ctx);
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
	 * Enter a parse tree produced by {@link MxstarGrammarParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(MxstarGrammarParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(MxstarGrammarParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(MxstarGrammarParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(MxstarGrammarParser.FunctionExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link MxstarGrammarParser#classMemberVisit}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberVisit(MxstarGrammarParser.ClassMemberVisitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#classMemberVisit}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberVisit(MxstarGrammarParser.ClassMemberVisitContext ctx);
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
	 * Enter a parse tree produced by {@link MxstarGrammarParser#creatClass}.
	 * @param ctx the parse tree
	 */
	void enterCreatClass(MxstarGrammarParser.CreatClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#creatClass}.
	 * @param ctx the parse tree
	 */
	void exitCreatClass(MxstarGrammarParser.CreatClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#arrayFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayFunctionExpression(MxstarGrammarParser.ArrayFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#arrayFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayFunctionExpression(MxstarGrammarParser.ArrayFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#stringFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringFunctionExpression(MxstarGrammarParser.StringFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#stringFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringFunctionExpression(MxstarGrammarParser.StringFunctionExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link MxstarGrammarParser#lambdaExpression_in}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression_in(MxstarGrammarParser.LambdaExpression_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#lambdaExpression_in}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression_in(MxstarGrammarParser.LambdaExpression_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxstarGrammarParser#lambdaExpression_out}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression_out(MxstarGrammarParser.LambdaExpression_outContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxstarGrammarParser#lambdaExpression_out}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression_out(MxstarGrammarParser.LambdaExpression_outContext ctx);
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
}