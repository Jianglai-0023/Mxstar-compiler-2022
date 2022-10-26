// Generated from /Users/jianglai/IdeaProjects/Mx-compiler2022/src/Parser/MxstarGrammar.g4 by ANTLR 4.10.1
package Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxstarGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Void=2, Bool=3, Int=4, String=5, New=6, Class=7, Null=8, True=9, 
		False=10, This=11, If=12, Else=13, For=14, While=15, Break=16, Continue=17, 
		Return=18, DIGIT=19, LeftParen=20, RightParen=21, LeftBracket=22, RightBracket=23, 
		LeftBrace=24, RightBrace=25, Plus=26, Minus=27, Star=28, Div=29, Mod=30, 
		Equal=31, Less=32, Greater=33, EqualEqual=34, NotEqual=35, LessEqual=36, 
		GreaterEqual=37, AndAnd=38, OrOr=39, Not=40, And=41, Or=42, Caret=43, 
		Wavy=44, PlusPlus=45, MinusMinus=46, Dot=47, Comma=48, Semi=49, Arrow=50, 
		Whitespace=51, Newline=52, LineComment=53, StringLiteral=54, Identifier=55, 
		BlockComment=56;
	public static final int
		RULE_program = 0, RULE_mainFn = 1, RULE_functionParametersList = 2, RULE_functionCallList = 3, 
		RULE_functionIdentifier = 4, RULE_functionDeclaration = 5, RULE_primaryDeclaration = 6, 
		RULE_classConstructor = 7, RULE_classDeclaration = 8, RULE_theTypeName = 9, 
		RULE_constantExpression = 10, RULE_primaryExpression = 11, RULE_selfExpression = 12, 
		RULE_singleExpression = 13, RULE_postExpression = 14, RULE_multiplicativeExpression = 15, 
		RULE_additiveExpression = 16, RULE_shiftExpression = 17, RULE_shiftOperator = 18, 
		RULE_relationalExpression = 19, RULE_equalityExpression = 20, RULE_andExpression = 21, 
		RULE_exclusiveOrExpression = 22, RULE_inclusiveOrExpression = 23, RULE_logicalAndExpression = 24, 
		RULE_logicalOrExpression = 25, RULE_assignmentExpression = 26, RULE_expression = 27, 
		RULE_lambdaExpression = 28, RULE_newExpression = 29, RULE_condition = 30, 
		RULE_statement = 31, RULE_declarationStatement = 32, RULE_expressionStatement = 33, 
		RULE_compoundStatement = 34, RULE_selectionStatement = 35, RULE_jumpStatement = 36, 
		RULE_iterationStatement = 37, RULE_forInitialStatement = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainFn", "functionParametersList", "functionCallList", "functionIdentifier", 
			"functionDeclaration", "primaryDeclaration", "classConstructor", "classDeclaration", 
			"theTypeName", "constantExpression", "primaryExpression", "selfExpression", 
			"singleExpression", "postExpression", "multiplicativeExpression", "additiveExpression", 
			"shiftExpression", "shiftOperator", "relationalExpression", "equalityExpression", 
			"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "assignmentExpression", "expression", "lambdaExpression", 
			"newExpression", "condition", "statement", "declarationStatement", "expressionStatement", 
			"compoundStatement", "selectionStatement", "jumpStatement", "iterationStatement", 
			"forInitialStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'void'", "'bool'", "'int'", "'string'", "'new'", "'class'", 
			"'null'", "'true'", "'false'", "'this'", "'if'", "'else'", "'for'", "'while'", 
			"'break'", "'continue'", "'return'", null, "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'<'", "'>'", 
			"'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", "'!'", "'&'", "'|'", 
			"'^'", "'~'", "'++'", "'--'", "'.'", "','", "';'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Void", "Bool", "Int", "String", "New", "Class", "Null", 
			"True", "False", "This", "If", "Else", "For", "While", "Break", "Continue", 
			"Return", "DIGIT", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Equal", 
			"Less", "Greater", "EqualEqual", "NotEqual", "LessEqual", "GreaterEqual", 
			"AndAnd", "OrOr", "Not", "And", "Or", "Caret", "Wavy", "PlusPlus", "MinusMinus", 
			"Dot", "Comma", "Semi", "Arrow", "Whitespace", "Newline", "LineComment", 
			"StringLiteral", "Identifier", "BlockComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MxstarGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MxstarGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainFnContext mainFn() {
			return getRuleContext(MainFnContext.class,0);
		}
		public List<DeclarationStatementContext> declarationStatement() {
			return getRuleContexts(DeclarationStatementContext.class);
		}
		public DeclarationStatementContext declarationStatement(int i) {
			return getRuleContext(DeclarationStatementContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(81);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(78);
						declarationStatement();
						}
						break;
					case 2:
						{
						setState(79);
						classDeclaration();
						}
						break;
					case 3:
						{
						setState(80);
						functionDeclaration();
						}
						break;
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(86);
			mainFn();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainFnContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(MxstarGrammarParser.Int, 0); }
		public TerminalNode LeftParen() { return getToken(MxstarGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MxstarGrammarParser.RightParen, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MxstarGrammarParser.EOF, 0); }
		public MainFnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterMainFn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitMainFn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitMainFn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFnContext mainFn() throws RecognitionException {
		MainFnContext _localctx = new MainFnContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainFn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(Int);
			setState(89);
			match(T__0);
			setState(90);
			match(LeftParen);
			setState(91);
			match(RightParen);
			setState(92);
			compoundStatement();
			setState(93);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParametersListContext extends ParserRuleContext {
		public List<TheTypeNameContext> theTypeName() {
			return getRuleContexts(TheTypeNameContext.class);
		}
		public TheTypeNameContext theTypeName(int i) {
			return getRuleContext(TheTypeNameContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(MxstarGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MxstarGrammarParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(MxstarGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MxstarGrammarParser.Comma, i);
		}
		public FunctionParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParametersList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterFunctionParametersList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitFunctionParametersList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitFunctionParametersList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersListContext functionParametersList() throws RecognitionException {
		FunctionParametersListContext _localctx = new FunctionParametersListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionParametersList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			theTypeName();
			setState(96);
			match(Identifier);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(97);
				match(Comma);
				setState(98);
				theTypeName();
				setState(99);
				match(Identifier);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MxstarGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MxstarGrammarParser.Comma, i);
		}
		public FunctionCallListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterFunctionCallList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitFunctionCallList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitFunctionCallList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallListContext functionCallList() throws RecognitionException {
		FunctionCallListContext _localctx = new FunctionCallListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionCallList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			expression();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(107);
				match(Comma);
				setState(108);
				expression();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MxstarGrammarParser.Identifier, 0); }
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MxstarGrammarParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(MxstarGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MxstarGrammarParser.RightParen, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FunctionParametersListContext functionParametersList() {
			return getRuleContext(FunctionParametersListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			theTypeName();
			setState(117);
			match(Identifier);
			setState(118);
			match(LeftParen);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Identifier))) != 0)) {
				{
				setState(119);
				functionParametersList();
				}
			}

			setState(122);
			match(RightParen);
			setState(123);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryDeclarationContext extends ParserRuleContext {
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(MxstarGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MxstarGrammarParser.Identifier, i);
		}
		public List<TerminalNode> Equal() { return getTokens(MxstarGrammarParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(MxstarGrammarParser.Equal, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MxstarGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MxstarGrammarParser.Comma, i);
		}
		public PrimaryDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterPrimaryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitPrimaryDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitPrimaryDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryDeclarationContext primaryDeclaration() throws RecognitionException {
		PrimaryDeclarationContext _localctx = new PrimaryDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primaryDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			theTypeName();
			setState(126);
			match(Identifier);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(127);
				match(Equal);
				setState(128);
				expression();
				}
			}

			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(131);
				match(Comma);
				setState(132);
				match(Identifier);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Equal) {
					{
					setState(133);
					match(Equal);
					setState(134);
					expression();
					}
				}

				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassConstructorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MxstarGrammarParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(MxstarGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MxstarGrammarParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ClassConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterClassConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitClassConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitClassConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstructorContext classConstructor() throws RecognitionException {
		ClassConstructorContext _localctx = new ClassConstructorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(Identifier);
			setState(143);
			match(LeftParen);
			setState(144);
			match(RightParen);
			setState(145);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(MxstarGrammarParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(MxstarGrammarParser.Identifier, 0); }
		public TerminalNode LeftBrace() { return getToken(MxstarGrammarParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MxstarGrammarParser.RightBrace, 0); }
		public TerminalNode Semi() { return getToken(MxstarGrammarParser.Semi, 0); }
		public List<DeclarationStatementContext> declarationStatement() {
			return getRuleContexts(DeclarationStatementContext.class);
		}
		public DeclarationStatementContext declarationStatement(int i) {
			return getRuleContext(DeclarationStatementContext.class,i);
		}
		public List<ClassConstructorContext> classConstructor() {
			return getRuleContexts(ClassConstructorContext.class);
		}
		public ClassConstructorContext classConstructor(int i) {
			return getRuleContext(ClassConstructorContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(Class);
			setState(148);
			match(Identifier);
			setState(149);
			match(LeftBrace);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Semi) | (1L << Identifier))) != 0)) {
				{
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(150);
					declarationStatement();
					}
					break;
				case 2:
					{
					setState(151);
					classConstructor();
					}
					break;
				case 3:
					{
					setState(152);
					functionDeclaration();
					}
					break;
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(RightBrace);
			setState(159);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TheTypeNameContext extends ParserRuleContext {
		public TerminalNode Bool() { return getToken(MxstarGrammarParser.Bool, 0); }
		public TerminalNode Void() { return getToken(MxstarGrammarParser.Void, 0); }
		public TerminalNode Int() { return getToken(MxstarGrammarParser.Int, 0); }
		public TerminalNode String() { return getToken(MxstarGrammarParser.String, 0); }
		public TerminalNode Identifier() { return getToken(MxstarGrammarParser.Identifier, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(MxstarGrammarParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MxstarGrammarParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MxstarGrammarParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MxstarGrammarParser.RightBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TheTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterTheTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitTheTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitTheTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheTypeNameContext theTypeName() throws RecognitionException {
		TheTypeNameContext _localctx = new TheTypeNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_theTypeName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Identifier))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					match(LeftBracket);
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
						{
						setState(163);
						expression();
						}
					}

					setState(166);
					match(RightBracket);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(MxstarGrammarParser.True, 0); }
		public TerminalNode False() { return getToken(MxstarGrammarParser.False, 0); }
		public TerminalNode DIGIT() { return getToken(MxstarGrammarParser.DIGIT, 0); }
		public TerminalNode StringLiteral() { return getToken(MxstarGrammarParser.StringLiteral, 0); }
		public TerminalNode Null() { return getToken(MxstarGrammarParser.Null, 0); }
		public TerminalNode This() { return getToken(MxstarGrammarParser.This, 0); }
		public TerminalNode Identifier() { return getToken(MxstarGrammarParser.Identifier, 0); }
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constantExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << StringLiteral) | (1L << Identifier))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MxstarGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MxstarGrammarParser.RightParen, 0); }
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public FunctionCallListContext functionCallList() {
			return getRuleContext(FunctionCallListContext.class,0);
		}
		public TerminalNode Dot() { return getToken(MxstarGrammarParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(MxstarGrammarParser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(MxstarGrammarParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MxstarGrammarParser.RightBracket, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Null:
			case True:
			case False:
			case This:
			case DIGIT:
			case StringLiteral:
			case Identifier:
				{
				setState(175);
				constantExpression();
				}
				break;
			case LeftParen:
				{
				setState(176);
				match(LeftParen);
				setState(177);
				expression();
				setState(178);
				match(RightParen);
				}
				break;
			case New:
				{
				setState(180);
				newExpression();
				}
				break;
			case LeftBracket:
				{
				setState(181);
				lambdaExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(184);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(185);
						match(LeftParen);
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
							{
							setState(186);
							functionCallList();
							}
						}

						setState(189);
						match(RightParen);
						}
						break;
					case 2:
						{
						_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(190);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(191);
						match(Dot);
						setState(192);
						match(Identifier);
						}
						}
						break;
					case 3:
						{
						_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(193);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(194);
						match(LeftBracket);
						setState(195);
						expression();
						setState(196);
						match(RightBracket);
						}
						break;
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelfExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(MxstarGrammarParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(MxstarGrammarParser.MinusMinus, 0); }
		public SelfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitSelfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitSelfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfExpressionContext selfExpression() throws RecognitionException {
		SelfExpressionContext _localctx = new SelfExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selfExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			primaryExpression(0);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PlusPlus || _la==MinusMinus) {
				{
				setState(204);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==MinusMinus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public SelfExpressionContext selfExpression() {
			return getRuleContext(SelfExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(MxstarGrammarParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(MxstarGrammarParser.MinusMinus, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_singleExpression);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case New:
			case Null:
			case True:
			case False:
			case This:
			case DIGIT:
			case LeftParen:
			case LeftBracket:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				selfExpression();
				}
				break;
			case PlusPlus:
			case MinusMinus:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==MinusMinus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(209);
				selfExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostExpressionContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PostExpressionContext postExpression() {
			return getRuleContext(PostExpressionContext.class,0);
		}
		public TerminalNode Not() { return getToken(MxstarGrammarParser.Not, 0); }
		public TerminalNode Wavy() { return getToken(MxstarGrammarParser.Wavy, 0); }
		public TerminalNode Minus() { return getToken(MxstarGrammarParser.Minus, 0); }
		public TerminalNode Plus() { return getToken(MxstarGrammarParser.Plus, 0); }
		public PostExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterPostExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitPostExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitPostExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostExpressionContext postExpression() throws RecognitionException {
		PostExpressionContext _localctx = new PostExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_postExpression);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case New:
			case Null:
			case True:
			case False:
			case This:
			case DIGIT:
			case LeftParen:
			case LeftBracket:
			case PlusPlus:
			case MinusMinus:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				singleExpression();
				}
				break;
			case Plus:
			case Minus:
			case Not:
			case Wavy:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(214);
				postExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<PostExpressionContext> postExpression() {
			return getRuleContexts(PostExpressionContext.class);
		}
		public PostExpressionContext postExpression(int i) {
			return getRuleContext(PostExpressionContext.class,i);
		}
		public List<TerminalNode> Div() { return getTokens(MxstarGrammarParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(MxstarGrammarParser.Div, i);
		}
		public List<TerminalNode> Star() { return getTokens(MxstarGrammarParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(MxstarGrammarParser.Star, i);
		}
		public List<TerminalNode> Mod() { return getTokens(MxstarGrammarParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(MxstarGrammarParser.Mod, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			postExpression();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) {
				{
				{
				setState(218);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(219);
				postExpression();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(MxstarGrammarParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(MxstarGrammarParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(MxstarGrammarParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(MxstarGrammarParser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			multiplicativeExpression();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(226);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(227);
				multiplicativeExpression();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOperatorContext> shiftOperator() {
			return getRuleContexts(ShiftOperatorContext.class);
		}
		public ShiftOperatorContext shiftOperator(int i) {
			return getRuleContext(ShiftOperatorContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			additiveExpression();
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					shiftOperator();
					setState(235);
					additiveExpression();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftOperatorContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(MxstarGrammarParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(MxstarGrammarParser.Greater, i);
		}
		public List<TerminalNode> Less() { return getTokens(MxstarGrammarParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(MxstarGrammarParser.Less, i);
		}
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterShiftOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitShiftOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitShiftOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_shiftOperator);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Greater:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(Greater);
				setState(243);
				match(Greater);
				}
				break;
			case Less:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(Less);
				setState(245);
				match(Less);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(MxstarGrammarParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(MxstarGrammarParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(MxstarGrammarParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(MxstarGrammarParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(MxstarGrammarParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(MxstarGrammarParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(MxstarGrammarParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(MxstarGrammarParser.GreaterEqual, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			shiftExpression();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) {
				{
				{
				setState(249);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(250);
				shiftExpression();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EqualEqual() { return getTokens(MxstarGrammarParser.EqualEqual); }
		public TerminalNode EqualEqual(int i) {
			return getToken(MxstarGrammarParser.EqualEqual, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(MxstarGrammarParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(MxstarGrammarParser.NotEqual, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			relationalExpression();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EqualEqual || _la==NotEqual) {
				{
				{
				setState(257);
				_la = _input.LA(1);
				if ( !(_la==EqualEqual || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(258);
				relationalExpression();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(MxstarGrammarParser.And); }
		public TerminalNode And(int i) {
			return getToken(MxstarGrammarParser.And, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			equalityExpression();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(265);
				match(And);
				setState(266);
				equalityExpression();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> Caret() { return getTokens(MxstarGrammarParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(MxstarGrammarParser.Caret, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			andExpression();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(273);
				match(Caret);
				setState(274);
				andExpression();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(MxstarGrammarParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(MxstarGrammarParser.Or, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			exclusiveOrExpression();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(281);
				match(Or);
				setState(282);
				exclusiveOrExpression();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(MxstarGrammarParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(MxstarGrammarParser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			inclusiveOrExpression();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(289);
				match(AndAnd);
				setState(290);
				inclusiveOrExpression();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(MxstarGrammarParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(MxstarGrammarParser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			logicalAndExpression();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(297);
				match(OrOr);
				setState(298);
				logicalAndExpression();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public TerminalNode Equal() { return getToken(MxstarGrammarParser.Equal, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			logicalOrExpression();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(305);
				match(Equal);
				setState(306);
				logicalOrExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(MxstarGrammarParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MxstarGrammarParser.RightBracket, 0); }
		public TerminalNode Arrow() { return getToken(MxstarGrammarParser.Arrow, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<TerminalNode> LeftParen() { return getTokens(MxstarGrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(MxstarGrammarParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(MxstarGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(MxstarGrammarParser.RightParen, i);
		}
		public TerminalNode And() { return getToken(MxstarGrammarParser.And, 0); }
		public FunctionCallListContext functionCallList() {
			return getRuleContext(FunctionCallListContext.class,0);
		}
		public FunctionParametersListContext functionParametersList() {
			return getRuleContext(FunctionParametersListContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lambdaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(LeftBracket);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(312);
				match(And);
				}
			}

			setState(315);
			match(RightBracket);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(316);
				match(LeftParen);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Identifier))) != 0)) {
					{
					setState(317);
					functionParametersList();
					}
				}

				setState(320);
				match(RightParen);
				}
			}

			setState(323);
			match(Arrow);
			setState(324);
			compoundStatement();
			setState(325);
			match(LeftParen);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(326);
				functionCallList();
				}
			}

			setState(329);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(MxstarGrammarParser.New, 0); }
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MxstarGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MxstarGrammarParser.RightParen, 0); }
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_newExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(New);
			setState(332);
			theTypeName();
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(333);
				match(LeftParen);
				setState(334);
				match(RightParen);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statement);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				declarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				selectionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				jumpStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(343);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(344);
				compoundStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(MxstarGrammarParser.Semi, 0); }
		public PrimaryDeclarationContext primaryDeclaration() {
			return getRuleContext(PrimaryDeclarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Identifier))) != 0)) {
				{
				setState(347);
				primaryDeclaration();
				}
			}

			setState(350);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(MxstarGrammarParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(352);
				expression();
				}
			}

			setState(355);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(MxstarGrammarParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MxstarGrammarParser.RightBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(LeftBrace);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << If) | (1L << For) | (1L << While) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Semi) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				{
				setState(358);
				statement();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(MxstarGrammarParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(MxstarGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MxstarGrammarParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(MxstarGrammarParser.Else, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_selectionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(If);
			setState(367);
			match(LeftParen);
			setState(368);
			expression();
			setState(369);
			match(RightParen);
			setState(370);
			statement();
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(371);
				match(Else);
				{
				setState(372);
				statement();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(MxstarGrammarParser.Return, 0); }
		public TerminalNode Semi() { return getToken(MxstarGrammarParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Break() { return getToken(MxstarGrammarParser.Break, 0); }
		public TerminalNode Continue() { return getToken(MxstarGrammarParser.Continue, 0); }
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_jumpStatement);
		int _la;
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Return:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(Return);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
					{
					setState(376);
					expression();
					}
				}

				setState(379);
				match(Semi);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(Break);
				setState(381);
				match(Semi);
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				match(Continue);
				setState(383);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(MxstarGrammarParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(MxstarGrammarParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MxstarGrammarParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode For() { return getToken(MxstarGrammarParser.For, 0); }
		public TerminalNode Semi() { return getToken(MxstarGrammarParser.Semi, 0); }
		public ForInitialStatementContext forInitialStatement() {
			return getRuleContext(ForInitialStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_iterationStatement);
		int _la;
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(While);
				setState(387);
				match(LeftParen);
				setState(388);
				condition();
				setState(389);
				match(RightParen);
				setState(390);
				statement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(For);
				setState(393);
				match(LeftParen);
				{
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(394);
					forInitialStatement();
					}
					break;
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
					{
					setState(397);
					condition();
					}
				}

				setState(400);
				match(Semi);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
					{
					setState(401);
					expression();
					}
				}

				}
				setState(404);
				match(RightParen);
				setState(405);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitialStatementContext extends ParserRuleContext {
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ForInitialStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitialStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterForInitialStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitForInitialStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitForInitialStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitialStatementContext forInitialStatement() throws RecognitionException {
		ForInitialStatementContext _localctx = new ForInitialStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forInitialStatement);
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				declarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				expressionStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00018\u019d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000R\b\u0000\n\u0000\f\u0000U\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002f\b\u0002\n\u0002\f\u0002i\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003n\b\u0003\n\u0003\f\u0003"+
		"q\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005y\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0082\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0088\b\u0006"+
		"\u0005\u0006\u008a\b\u0006\n\u0006\f\u0006\u008d\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u009a\b\b\n\b\f\b\u009d\t\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00a5\b\t\u0001\t\u0005\t\u00a8"+
		"\b\t\n\t\f\t\u00ab\t\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00b7\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00bc\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c7\b\u000b\n"+
		"\u000b\f\u000b\u00ca\t\u000b\u0001\f\u0001\f\u0003\f\u00ce\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00d3\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00d8\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00dd\b\u000f\n\u000f\f\u000f\u00e0\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00e5\b\u0010\n\u0010\f\u0010\u00e8\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00ee\b\u0011\n\u0011"+
		"\f\u0011\u00f1\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00f7\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00fc\b\u0013\n\u0013\f\u0013\u00ff\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0104\b\u0014\n\u0014\f\u0014\u0107\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u010c\b\u0015\n\u0015\f\u0015\u010f"+
		"\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0114\b\u0016"+
		"\n\u0016\f\u0016\u0117\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u011c\b\u0017\n\u0017\f\u0017\u011f\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0124\b\u0018\n\u0018\f\u0018\u0127\t\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u012c\b\u0019\n\u0019\f\u0019"+
		"\u012f\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0134\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u013a"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u013f\b\u001c"+
		"\u0001\u001c\u0003\u001c\u0142\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0148\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0150\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u015a\b\u001f\u0001 \u0003 \u015d\b \u0001 \u0001"+
		" \u0001!\u0003!\u0162\b!\u0001!\u0001!\u0001\"\u0001\"\u0005\"\u0168\b"+
		"\"\n\"\f\"\u016b\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u0176\b#\u0001$\u0001$\u0003$\u017a\b$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u0181\b$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0003%\u018c\b%\u0001%\u0003%\u018f\b%\u0001"+
		"%\u0001%\u0003%\u0193\b%\u0001%\u0001%\u0003%\u0197\b%\u0001&\u0001&\u0003"+
		"&\u019b\b&\u0001&\u0000\u0001\u0016\'\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJL\u0000\b\u0002\u0000\u0002\u000577\u0003\u0000\b\u000b\u0013\u0013"+
		"67\u0001\u0000-.\u0003\u0000\u001a\u001b((,,\u0001\u0000\u001c\u001e\u0001"+
		"\u0000\u001a\u001b\u0002\u0000 !$%\u0001\u0000\"#\u01af\u0000S\u0001\u0000"+
		"\u0000\u0000\u0002X\u0001\u0000\u0000\u0000\u0004_\u0001\u0000\u0000\u0000"+
		"\u0006j\u0001\u0000\u0000\u0000\br\u0001\u0000\u0000\u0000\nt\u0001\u0000"+
		"\u0000\u0000\f}\u0001\u0000\u0000\u0000\u000e\u008e\u0001\u0000\u0000"+
		"\u0000\u0010\u0093\u0001\u0000\u0000\u0000\u0012\u00a1\u0001\u0000\u0000"+
		"\u0000\u0014\u00ac\u0001\u0000\u0000\u0000\u0016\u00b6\u0001\u0000\u0000"+
		"\u0000\u0018\u00cb\u0001\u0000\u0000\u0000\u001a\u00d2\u0001\u0000\u0000"+
		"\u0000\u001c\u00d7\u0001\u0000\u0000\u0000\u001e\u00d9\u0001\u0000\u0000"+
		"\u0000 \u00e1\u0001\u0000\u0000\u0000\"\u00e9\u0001\u0000\u0000\u0000"+
		"$\u00f6\u0001\u0000\u0000\u0000&\u00f8\u0001\u0000\u0000\u0000(\u0100"+
		"\u0001\u0000\u0000\u0000*\u0108\u0001\u0000\u0000\u0000,\u0110\u0001\u0000"+
		"\u0000\u0000.\u0118\u0001\u0000\u0000\u00000\u0120\u0001\u0000\u0000\u0000"+
		"2\u0128\u0001\u0000\u0000\u00004\u0130\u0001\u0000\u0000\u00006\u0135"+
		"\u0001\u0000\u0000\u00008\u0137\u0001\u0000\u0000\u0000:\u014b\u0001\u0000"+
		"\u0000\u0000<\u0151\u0001\u0000\u0000\u0000>\u0159\u0001\u0000\u0000\u0000"+
		"@\u015c\u0001\u0000\u0000\u0000B\u0161\u0001\u0000\u0000\u0000D\u0165"+
		"\u0001\u0000\u0000\u0000F\u016e\u0001\u0000\u0000\u0000H\u0180\u0001\u0000"+
		"\u0000\u0000J\u0196\u0001\u0000\u0000\u0000L\u019a\u0001\u0000\u0000\u0000"+
		"NR\u0003@ \u0000OR\u0003\u0010\b\u0000PR\u0003\n\u0005\u0000QN\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0003\u0002\u0001"+
		"\u0000W\u0001\u0001\u0000\u0000\u0000XY\u0005\u0004\u0000\u0000YZ\u0005"+
		"\u0001\u0000\u0000Z[\u0005\u0014\u0000\u0000[\\\u0005\u0015\u0000\u0000"+
		"\\]\u0003D\"\u0000]^\u0005\u0000\u0000\u0001^\u0003\u0001\u0000\u0000"+
		"\u0000_`\u0003\u0012\t\u0000`g\u00057\u0000\u0000ab\u00050\u0000\u0000"+
		"bc\u0003\u0012\t\u0000cd\u00057\u0000\u0000df\u0001\u0000\u0000\u0000"+
		"ea\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000h\u0005\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000jo\u00036\u001b\u0000kl\u00050\u0000\u0000ln\u00036"+
		"\u001b\u0000mk\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0007\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000rs\u00057\u0000\u0000s\t\u0001\u0000\u0000"+
		"\u0000tu\u0003\u0012\t\u0000uv\u00057\u0000\u0000vx\u0005\u0014\u0000"+
		"\u0000wy\u0003\u0004\u0002\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005\u0015\u0000\u0000{|\u0003"+
		"D\"\u0000|\u000b\u0001\u0000\u0000\u0000}~\u0003\u0012\t\u0000~\u0081"+
		"\u00057\u0000\u0000\u007f\u0080\u0005\u001f\u0000\u0000\u0080\u0082\u0003"+
		"6\u001b\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u008b\u0001\u0000\u0000\u0000\u0083\u0084\u00050\u0000"+
		"\u0000\u0084\u0087\u00057\u0000\u0000\u0085\u0086\u0005\u001f\u0000\u0000"+
		"\u0086\u0088\u00036\u001b\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089"+
		"\u0083\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\r\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u00057\u0000\u0000\u008f\u0090\u0005\u0014\u0000\u0000\u0090\u0091\u0005"+
		"\u0015\u0000\u0000\u0091\u0092\u0003>\u001f\u0000\u0092\u000f\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0005\u0007\u0000\u0000\u0094\u0095\u00057\u0000"+
		"\u0000\u0095\u009b\u0005\u0018\u0000\u0000\u0096\u009a\u0003@ \u0000\u0097"+
		"\u009a\u0003\u000e\u0007\u0000\u0098\u009a\u0003\n\u0005\u0000\u0099\u0096"+
		"\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005\u0019\u0000\u0000\u009f\u00a0\u00051\u0000\u0000\u00a0\u0011\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a9\u0007\u0000\u0000\u0000\u00a2\u00a4\u0005"+
		"\u0016\u0000\u0000\u00a3\u00a5\u00036\u001b\u0000\u00a4\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a8\u0005\u0017\u0000\u0000\u00a7\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u0013\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0007\u0001"+
		"\u0000\u0000\u00ad\u0015\u0001\u0000\u0000\u0000\u00ae\u00af\u0006\u000b"+
		"\uffff\uffff\u0000\u00af\u00b7\u0003\u0014\n\u0000\u00b0\u00b1\u0005\u0014"+
		"\u0000\u0000\u00b1\u00b2\u00036\u001b\u0000\u00b2\u00b3\u0005\u0015\u0000"+
		"\u0000\u00b3\u00b7\u0001\u0000\u0000\u0000\u00b4\u00b7\u0003:\u001d\u0000"+
		"\u00b5\u00b7\u00038\u001c\u0000\u00b6\u00ae\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u00c8\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\n\u0005\u0000\u0000\u00b9\u00bb\u0005\u0014\u0000\u0000\u00ba\u00bc"+
		"\u0003\u0006\u0003\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c7"+
		"\u0005\u0015\u0000\u0000\u00be\u00bf\n\u0004\u0000\u0000\u00bf\u00c0\u0005"+
		"/\u0000\u0000\u00c0\u00c7\u00057\u0000\u0000\u00c1\u00c2\n\u0002\u0000"+
		"\u0000\u00c2\u00c3\u0005\u0016\u0000\u0000\u00c3\u00c4\u00036\u001b\u0000"+
		"\u00c4\u00c5\u0005\u0017\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c6\u00b8\u0001\u0000\u0000\u0000\u00c6\u00be\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c1\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c9\u0017\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0003\u0016\u000b\u0000\u00cc\u00ce\u0007\u0002\u0000\u0000"+
		"\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u0019\u0001\u0000\u0000\u0000\u00cf\u00d3\u0003\u0018\f\u0000\u00d0"+
		"\u00d1\u0007\u0002\u0000\u0000\u00d1\u00d3\u0003\u0018\f\u0000\u00d2\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u001b"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d8\u0003\u001a\r\u0000\u00d5\u00d6\u0007"+
		"\u0003\u0000\u0000\u00d6\u00d8\u0003\u001c\u000e\u0000\u00d7\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u001d\u0001"+
		"\u0000\u0000\u0000\u00d9\u00de\u0003\u001c\u000e\u0000\u00da\u00db\u0007"+
		"\u0004\u0000\u0000\u00db\u00dd\u0003\u001c\u000e\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u001f\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e6\u0003"+
		"\u001e\u000f\u0000\u00e2\u00e3\u0007\u0005\u0000\u0000\u00e3\u00e5\u0003"+
		"\u001e\u000f\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e7!\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ef\u0003 \u0010\u0000\u00ea\u00eb\u0003$\u0012\u0000"+
		"\u00eb\u00ec\u0003 \u0010\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"#\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0005!\u0000\u0000\u00f3\u00f7\u0005!\u0000\u0000\u00f4\u00f5\u0005 "+
		"\u0000\u0000\u00f5\u00f7\u0005 \u0000\u0000\u00f6\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7%\u0001\u0000\u0000\u0000"+
		"\u00f8\u00fd\u0003\"\u0011\u0000\u00f9\u00fa\u0007\u0006\u0000\u0000\u00fa"+
		"\u00fc\u0003\"\u0011\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\'\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u0100\u0105\u0003&\u0013\u0000\u0101\u0102\u0007\u0007"+
		"\u0000\u0000\u0102\u0104\u0003&\u0013\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106)\u0001\u0000\u0000\u0000"+
		"\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010d\u0003(\u0014\u0000\u0109"+
		"\u010a\u0005)\u0000\u0000\u010a\u010c\u0003(\u0014\u0000\u010b\u0109\u0001"+
		"\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e+\u0001\u0000"+
		"\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0115\u0003*\u0015"+
		"\u0000\u0111\u0112\u0005+\u0000\u0000\u0112\u0114\u0003*\u0015\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000\u0115"+
		"\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116"+
		"-\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u011d"+
		"\u0003,\u0016\u0000\u0119\u011a\u0005*\u0000\u0000\u011a\u011c\u0003,"+
		"\u0016\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000"+
		"\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000"+
		"\u0000\u0000\u011e/\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000"+
		"\u0000\u0120\u0125\u0003.\u0017\u0000\u0121\u0122\u0005&\u0000\u0000\u0122"+
		"\u0124\u0003.\u0017\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0127"+
		"\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u01261\u0001\u0000\u0000\u0000\u0127\u0125\u0001"+
		"\u0000\u0000\u0000\u0128\u012d\u00030\u0018\u0000\u0129\u012a\u0005\'"+
		"\u0000\u0000\u012a\u012c\u00030\u0018\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e3\u0001\u0000\u0000\u0000"+
		"\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0133\u00032\u0019\u0000\u0131"+
		"\u0132\u0005\u001f\u0000\u0000\u0132\u0134\u00032\u0019\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u01345\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u00034\u001a\u0000\u01367\u0001\u0000\u0000"+
		"\u0000\u0137\u0139\u0005\u0016\u0000\u0000\u0138\u013a\u0005)\u0000\u0000"+
		"\u0139\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u0141\u0005\u0017\u0000\u0000"+
		"\u013c\u013e\u0005\u0014\u0000\u0000\u013d\u013f\u0003\u0004\u0002\u0000"+
		"\u013e\u013d\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0142\u0005\u0015\u0000\u0000"+
		"\u0141\u013c\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u00052\u0000\u0000\u0144"+
		"\u0145\u0003D\"\u0000\u0145\u0147\u0005\u0014\u0000\u0000\u0146\u0148"+
		"\u0003\u0006\u0003\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0005\u0015\u0000\u0000\u014a9\u0001\u0000\u0000\u0000\u014b\u014c\u0005"+
		"\u0006\u0000\u0000\u014c\u014f\u0003\u0012\t\u0000\u014d\u014e\u0005\u0014"+
		"\u0000\u0000\u014e\u0150\u0005\u0015\u0000\u0000\u014f\u014d\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150;\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u00036\u001b\u0000\u0152=\u0001\u0000\u0000\u0000\u0153"+
		"\u015a\u0003@ \u0000\u0154\u015a\u0003B!\u0000\u0155\u015a\u0003F#\u0000"+
		"\u0156\u015a\u0003H$\u0000\u0157\u015a\u0003J%\u0000\u0158\u015a\u0003"+
		"D\"\u0000\u0159\u0153\u0001\u0000\u0000\u0000\u0159\u0154\u0001\u0000"+
		"\u0000\u0000\u0159\u0155\u0001\u0000\u0000\u0000\u0159\u0156\u0001\u0000"+
		"\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u0158\u0001\u0000"+
		"\u0000\u0000\u015a?\u0001\u0000\u0000\u0000\u015b\u015d\u0003\f\u0006"+
		"\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u00051\u0000\u0000"+
		"\u015fA\u0001\u0000\u0000\u0000\u0160\u0162\u00036\u001b\u0000\u0161\u0160"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u00051\u0000\u0000\u0164C\u0001\u0000"+
		"\u0000\u0000\u0165\u0169\u0005\u0018\u0000\u0000\u0166\u0168\u0003>\u001f"+
		"\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000"+
		"\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000"+
		"\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0005\u0019\u0000\u0000\u016dE\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0005\f\u0000\u0000\u016f\u0170\u0005\u0014\u0000\u0000\u0170"+
		"\u0171\u00036\u001b\u0000\u0171\u0172\u0005\u0015\u0000\u0000\u0172\u0175"+
		"\u0003>\u001f\u0000\u0173\u0174\u0005\r\u0000\u0000\u0174\u0176\u0003"+
		">\u001f\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176G\u0001\u0000\u0000\u0000\u0177\u0179\u0005\u0012\u0000"+
		"\u0000\u0178\u017a\u00036\u001b\u0000\u0179\u0178\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000"+
		"\u017b\u0181\u00051\u0000\u0000\u017c\u017d\u0005\u0010\u0000\u0000\u017d"+
		"\u0181\u00051\u0000\u0000\u017e\u017f\u0005\u0011\u0000\u0000\u017f\u0181"+
		"\u00051\u0000\u0000\u0180\u0177\u0001\u0000\u0000\u0000\u0180\u017c\u0001"+
		"\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0181I\u0001\u0000"+
		"\u0000\u0000\u0182\u0183\u0005\u000f\u0000\u0000\u0183\u0184\u0005\u0014"+
		"\u0000\u0000\u0184\u0185\u0003<\u001e\u0000\u0185\u0186\u0005\u0015\u0000"+
		"\u0000\u0186\u0187\u0003>\u001f\u0000\u0187\u0197\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0005\u000e\u0000\u0000\u0189\u018b\u0005\u0014\u0000\u0000"+
		"\u018a\u018c\u0003L&\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0001\u0000\u0000\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u018f"+
		"\u0003<\u001e\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018e\u018f\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0005"+
		"1\u0000\u0000\u0191\u0193\u00036\u001b\u0000\u0192\u0191\u0001\u0000\u0000"+
		"\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0005\u0015\u0000\u0000\u0195\u0197\u0003>\u001f\u0000"+
		"\u0196\u0182\u0001\u0000\u0000\u0000\u0196\u0188\u0001\u0000\u0000\u0000"+
		"\u0197K\u0001\u0000\u0000\u0000\u0198\u019b\u0003@ \u0000\u0199\u019b"+
		"\u0003B!\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u0199\u0001\u0000"+
		"\u0000\u0000\u019bM\u0001\u0000\u0000\u00000QSgox\u0081\u0087\u008b\u0099"+
		"\u009b\u00a4\u00a9\u00b6\u00bb\u00c6\u00c8\u00cd\u00d2\u00d7\u00de\u00e6"+
		"\u00ef\u00f6\u00fd\u0105\u010d\u0115\u011d\u0125\u012d\u0133\u0139\u013e"+
		"\u0141\u0147\u014f\u0159\u015c\u0161\u0169\u0175\u0179\u0180\u018b\u018e"+
		"\u0192\u0196\u019a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}