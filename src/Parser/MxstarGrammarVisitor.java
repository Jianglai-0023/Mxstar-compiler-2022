// Generated from /Users/jianglai/IdeaProjects/Mx-compiler2022/src/Parser/MxstarGrammar.g4 by ANTLR 4.10.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MxstarGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MxstarGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MxstarGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#mainFn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFn(MxstarGrammarParser.MainFnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MxstarGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(MxstarGrammarParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(MxstarGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(MxstarGrammarParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#statementSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSeq(MxstarGrammarParser.StatementSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(MxstarGrammarParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(MxstarGrammarParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(MxstarGrammarParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(MxstarGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(MxstarGrammarParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#jaggedarrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJaggedarrayDeclaration(MxstarGrammarParser.JaggedarrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#arrayVisit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVisit(MxstarGrammarParser.ArrayVisitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#arraySize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySize(MxstarGrammarParser.ArraySizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#arrayCreate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreate(MxstarGrammarParser.ArrayCreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#jaggedarrayCreate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJaggedarrayCreate(MxstarGrammarParser.JaggedarrayCreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#jaggedarrayVisit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJaggedarrayVisit(MxstarGrammarParser.JaggedarrayVisitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#theTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypeName(MxstarGrammarParser.TheTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#functionParametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParametersList(MxstarGrammarParser.FunctionParametersListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#functionCallList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallList(MxstarGrammarParser.FunctionCallListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(MxstarGrammarParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#functionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(MxstarGrammarParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MxstarGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#primaryDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryDeclaration(MxstarGrammarParser.PrimaryDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#classConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassConstructor(MxstarGrammarParser.ClassConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MxstarGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#classMemberVisit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberVisit(MxstarGrammarParser.ClassMemberVisitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(MxstarGrammarParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#creatClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatClass(MxstarGrammarParser.CreatClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#arrayFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFunctionExpression(MxstarGrammarParser.ArrayFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#stringFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFunctionExpression(MxstarGrammarParser.StringFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(MxstarGrammarParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#postExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostExpression(MxstarGrammarParser.PostExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(MxstarGrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(MxstarGrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(MxstarGrammarParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(MxstarGrammarParser.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(MxstarGrammarParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(MxstarGrammarParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(MxstarGrammarParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(MxstarGrammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(MxstarGrammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(MxstarGrammarParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(MxstarGrammarParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(MxstarGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MxstarGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#lambdaExpression_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression_in(MxstarGrammarParser.LambdaExpression_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#lambdaExpression_out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression_out(MxstarGrammarParser.LambdaExpression_outContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxstarGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MxstarGrammarParser.ConditionContext ctx);
}