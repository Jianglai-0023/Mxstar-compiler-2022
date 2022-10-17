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
		T__0=1, T__1=2, Void=3, Bool=4, Int=5, String=6, New=7, Class=8, Null=9, 
		True=10, False=11, This=12, If=13, Else=14, For=15, While=16, Break=17, 
		Continue=18, Return=19, DIGIT=20, LeftParen=21, RightParen=22, LeftBracket=23, 
		RightBracket=24, LeftBrace=25, RightBrace=26, Plus=27, Minus=28, Star=29, 
		Div=30, Mod=31, Equal=32, Less=33, Greater=34, EqualEqual=35, NotEqual=36, 
		LessEqual=37, GreaterEqual=38, AndAnd=39, OrOr=40, Not=41, And=42, Or=43, 
		Caret=44, Wavy=45, PlusPlus=46, MinusMinus=47, Dot=48, Comma=49, Semi=50, 
		Arrow=51, Whitespace=52, Newline=53, LineComment=54, StringLiteral=55, 
		Identifier=56, BlockComment=57;
	public static final int
		RULE_program = 0, RULE_mainFn = 1, RULE_statement = 2, RULE_declarationStatement = 3, 
		RULE_expressionStatement = 4, RULE_compoundStatement = 5, RULE_statementSeq = 6, 
		RULE_selectionStatement = 7, RULE_jumpStatement = 8, RULE_iterationStatement = 9, 
		RULE_constantExpression = 10, RULE_arrayDeclaration = 11, RULE_jaggedarrayDeclaration = 12, 
		RULE_arrayVisit = 13, RULE_arraySize = 14, RULE_arrayCreate = 15, RULE_jaggedarrayCreate = 16, 
		RULE_jaggedarrayVisit = 17, RULE_theTypeName = 18, RULE_functionParametersList = 19, 
		RULE_functionCallList = 20, RULE_functionIdentifier = 21, RULE_functionExpression = 22, 
		RULE_functionDeclaration = 23, RULE_primaryDeclaration = 24, RULE_classConstructor = 25, 
		RULE_classDeclaration = 26, RULE_classMemberVisit = 27, RULE_primaryExpression = 28, 
		RULE_creatClass = 29, RULE_arrayFunctionExpression = 30, RULE_stringFunctionExpression = 31, 
		RULE_singleExpression = 32, RULE_postExpression = 33, RULE_multiplicativeExpression = 34, 
		RULE_additiveExpression = 35, RULE_shiftExpression = 36, RULE_shiftOperator = 37, 
		RULE_relationalExpression = 38, RULE_equalityExpression = 39, RULE_andExpression = 40, 
		RULE_exclusiveOrExpression = 41, RULE_inclusiveOrExpression = 42, RULE_logicalAndExpression = 43, 
		RULE_logicalOrExpression = 44, RULE_assignmentExpression = 45, RULE_expression = 46, 
		RULE_lambdaExpression_in = 47, RULE_lambdaExpression_out = 48, RULE_condition = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainFn", "statement", "declarationStatement", "expressionStatement", 
			"compoundStatement", "statementSeq", "selectionStatement", "jumpStatement", 
			"iterationStatement", "constantExpression", "arrayDeclaration", "jaggedarrayDeclaration", 
			"arrayVisit", "arraySize", "arrayCreate", "jaggedarrayCreate", "jaggedarrayVisit", 
			"theTypeName", "functionParametersList", "functionCallList", "functionIdentifier", 
			"functionExpression", "functionDeclaration", "primaryDeclaration", "classConstructor", 
			"classDeclaration", "classMemberVisit", "primaryExpression", "creatClass", 
			"arrayFunctionExpression", "stringFunctionExpression", "singleExpression", 
			"postExpression", "multiplicativeExpression", "additiveExpression", "shiftExpression", 
			"shiftOperator", "relationalExpression", "equalityExpression", "andExpression", 
			"exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "assignmentExpression", "expression", "lambdaExpression_in", 
			"lambdaExpression_out", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'size'", "'void'", "'bool'", "'int'", "'string'", "'new'", 
			"'class'", "'null'", "'true'", "'false'", "'this'", "'if'", "'else'", 
			"'for'", "'while'", "'break'", "'continue'", "'return'", null, "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'='", "'<'", "'>'", "'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", 
			"'!'", "'&'", "'|'", "'^'", "'~'", "'++'", "'--'", "'.'", "','", "';'", 
			"'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Void", "Bool", "Int", "String", "New", "Class", "Null", 
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
		public List<ArrayDeclarationContext> arrayDeclaration() {
			return getRuleContexts(ArrayDeclarationContext.class);
		}
		public ArrayDeclarationContext arrayDeclaration(int i) {
			return getRuleContext(ArrayDeclarationContext.class,i);
		}
		public List<JaggedarrayDeclarationContext> jaggedarrayDeclaration() {
			return getRuleContexts(JaggedarrayDeclarationContext.class);
		}
		public JaggedarrayDeclarationContext jaggedarrayDeclaration(int i) {
			return getRuleContext(JaggedarrayDeclarationContext.class,i);
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
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(100);
						declarationStatement();
						}
						break;
					case 2:
						{
						setState(101);
						classDeclaration();
						}
						break;
					case 3:
						{
						setState(102);
						functionDeclaration();
						}
						break;
					case 4:
						{
						setState(103);
						arrayDeclaration();
						}
						break;
					case 5:
						{
						setState(104);
						jaggedarrayDeclaration();
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(110);
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
			setState(112);
			match(Int);
			setState(113);
			match(T__0);
			setState(114);
			match(LeftParen);
			setState(115);
			match(RightParen);
			setState(116);
			compoundStatement();
			setState(117);
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				declarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				selectionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				jumpStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
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
		public PrimaryDeclarationContext primaryDeclaration() {
			return getRuleContext(PrimaryDeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MxstarGrammarParser.Semi, 0); }
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
		enterRule(_localctx, 6, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			primaryDeclaration();
			setState(128);
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
		enterRule(_localctx, 8, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(130);
				expression();
				}
			}

			setState(133);
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
		public StatementSeqContext statementSeq() {
			return getRuleContext(StatementSeqContext.class,0);
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
		enterRule(_localctx, 10, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(LeftBrace);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << If) | (1L << For) | (1L << While) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Semi) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(136);
				statementSeq();
				}
			}

			setState(139);
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

	public static class StatementSeqContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterStatementSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitStatementSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitStatementSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementSeqContext statementSeq() throws RecognitionException {
		StatementSeqContext _localctx = new StatementSeqContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statementSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				statement();
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << If) | (1L << For) | (1L << While) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Semi) | (1L << StringLiteral) | (1L << Identifier))) != 0) );
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
		enterRule(_localctx, 14, RULE_selectionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(If);
			setState(147);
			match(LeftParen);
			setState(148);
			condition();
			setState(149);
			match(RightParen);
			setState(150);
			statement();
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(151);
				match(Else);
				{
				setState(152);
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
		enterRule(_localctx, 16, RULE_jumpStatement);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Return:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(Return);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
					{
					setState(156);
					expression();
					}
				}

				setState(159);
				match(Semi);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(Break);
				setState(161);
				match(Semi);
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(Continue);
				setState(163);
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
		public List<TerminalNode> Semi() { return getTokens(MxstarGrammarParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(MxstarGrammarParser.Semi, i);
		}
		public PrimaryDeclarationContext primaryDeclaration() {
			return getRuleContext(PrimaryDeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 18, RULE_iterationStatement);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(While);
				setState(167);
				match(LeftParen);
				setState(168);
				condition();
				setState(169);
				match(RightParen);
				setState(170);
				statement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(For);
				setState(173);
				match(LeftParen);
				{
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(174);
					primaryDeclaration();
					}
					break;
				case 2:
					{
					setState(175);
					expression();
					}
					break;
				}
				setState(178);
				match(Semi);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
					{
					setState(179);
					expression();
					}
				}

				setState(182);
				match(Semi);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
					{
					setState(183);
					expression();
					}
				}

				}
				setState(186);
				match(RightParen);
				setState(187);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(MxstarGrammarParser.True, 0); }
		public TerminalNode False() { return getToken(MxstarGrammarParser.False, 0); }
		public TerminalNode DIGIT() { return getToken(MxstarGrammarParser.DIGIT, 0); }
		public TerminalNode StringLiteral() { return getToken(MxstarGrammarParser.StringLiteral, 0); }
		public TerminalNode Null() { return getToken(MxstarGrammarParser.Null, 0); }
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
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Null) | (1L << True) | (1L << False) | (1L << DIGIT) | (1L << StringLiteral))) != 0)) ) {
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(MxstarGrammarParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MxstarGrammarParser.RightBracket, 0); }
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
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			theTypeName();
			setState(193);
			match(LeftBracket);
			setState(194);
			match(RightBracket);
			setState(195);
			match(Identifier);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(196);
				match(Equal);
				setState(197);
				expression();
				}
			}

			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(200);
				match(Comma);
				setState(201);
				match(Identifier);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Equal) {
					{
					setState(202);
					match(Equal);
					setState(203);
					expression();
					}
				}

				}
				}
				setState(210);
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

	public static class JaggedarrayDeclarationContext extends ParserRuleContext {
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(MxstarGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MxstarGrammarParser.Identifier, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(MxstarGrammarParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MxstarGrammarParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MxstarGrammarParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MxstarGrammarParser.RightBracket, i);
		}
		public List<TerminalNode> Comma() { return getTokens(MxstarGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MxstarGrammarParser.Comma, i);
		}
		public TerminalNode Equal() { return getToken(MxstarGrammarParser.Equal, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JaggedarrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jaggedarrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterJaggedarrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitJaggedarrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitJaggedarrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JaggedarrayDeclarationContext jaggedarrayDeclaration() throws RecognitionException {
		JaggedarrayDeclarationContext _localctx = new JaggedarrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jaggedarrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			theTypeName();
			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(212);
				match(LeftBracket);
				setState(213);
				match(RightBracket);
				}
				}
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftBracket );
			setState(218);
			match(Identifier);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(219);
				match(Comma);
				setState(220);
				match(Identifier);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(226);
				match(Equal);
				setState(227);
				expression();
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

	public static class ArrayVisitContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(MxstarGrammarParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MxstarGrammarParser.RightBracket, 0); }
		public TerminalNode Identifier() { return getToken(MxstarGrammarParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(MxstarGrammarParser.LeftParen, 0); }
		public ArrayCreateContext arrayCreate() {
			return getRuleContext(ArrayCreateContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MxstarGrammarParser.RightParen, 0); }
		public ArrayVisitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVisit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterArrayVisit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitArrayVisit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitArrayVisit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayVisitContext arrayVisit() throws RecognitionException {
		ArrayVisitContext _localctx = new ArrayVisitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayVisit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(230);
				match(Identifier);
				}
				break;
			case LeftParen:
				{
				setState(231);
				match(LeftParen);
				setState(232);
				arrayCreate();
				setState(233);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(237);
			match(LeftBracket);
			setState(238);
			expression();
			setState(239);
			match(RightBracket);
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

	public static class ArraySizeContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(MxstarGrammarParser.DIGIT, 0); }
		public ArraySizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterArraySize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitArraySize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitArraySize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraySizeContext arraySize() throws RecognitionException {
		ArraySizeContext _localctx = new ArraySizeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arraySize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(DIGIT);
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

	public static class ArrayCreateContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(MxstarGrammarParser.New, 0); }
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(MxstarGrammarParser.LeftBracket, 0); }
		public ArraySizeContext arraySize() {
			return getRuleContext(ArraySizeContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MxstarGrammarParser.RightBracket, 0); }
		public ArrayCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterArrayCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitArrayCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitArrayCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreateContext arrayCreate() throws RecognitionException {
		ArrayCreateContext _localctx = new ArrayCreateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayCreate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(New);
			setState(244);
			theTypeName();
			setState(245);
			match(LeftBracket);
			setState(246);
			arraySize();
			setState(247);
			match(RightBracket);
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

	public static class JaggedarrayCreateContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(MxstarGrammarParser.New, 0); }
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(MxstarGrammarParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MxstarGrammarParser.LeftBracket, i);
		}
		public List<ArraySizeContext> arraySize() {
			return getRuleContexts(ArraySizeContext.class);
		}
		public ArraySizeContext arraySize(int i) {
			return getRuleContext(ArraySizeContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MxstarGrammarParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MxstarGrammarParser.RightBracket, i);
		}
		public JaggedarrayCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jaggedarrayCreate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterJaggedarrayCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitJaggedarrayCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitJaggedarrayCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JaggedarrayCreateContext jaggedarrayCreate() throws RecognitionException {
		JaggedarrayCreateContext _localctx = new JaggedarrayCreateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jaggedarrayCreate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(New);
			setState(250);
			theTypeName();
			setState(251);
			match(LeftBracket);
			setState(252);
			arraySize();
			setState(253);
			match(RightBracket);
			setState(259); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(254);
					match(LeftBracket);
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DIGIT) {
						{
						setState(255);
						arraySize();
						}
					}

					setState(258);
					match(RightBracket);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(261); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class JaggedarrayVisitContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MxstarGrammarParser.Identifier, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(MxstarGrammarParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MxstarGrammarParser.LeftBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MxstarGrammarParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MxstarGrammarParser.RightBracket, i);
		}
		public JaggedarrayVisitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jaggedarrayVisit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterJaggedarrayVisit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitJaggedarrayVisit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitJaggedarrayVisit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JaggedarrayVisitContext jaggedarrayVisit() throws RecognitionException {
		JaggedarrayVisitContext _localctx = new JaggedarrayVisitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jaggedarrayVisit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(Identifier);
			setState(268); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(264);
					match(LeftBracket);
					setState(265);
					expression();
					setState(266);
					match(RightBracket);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(270); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 36, RULE_theTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Identifier))) != 0)) ) {
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
		enterRule(_localctx, 38, RULE_functionParametersList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			theTypeName();
			setState(275);
			match(Identifier);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(276);
				match(Comma);
				setState(277);
				theTypeName();
				setState(278);
				match(Identifier);
				}
				}
				setState(284);
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
		enterRule(_localctx, 40, RULE_functionCallList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			expression();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(286);
				match(Comma);
				setState(287);
				expression();
				}
				}
				setState(292);
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
		enterRule(_localctx, 42, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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

	public static class FunctionExpressionContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MxstarGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MxstarGrammarParser.RightParen, 0); }
		public FunctionCallListContext functionCallList() {
			return getRuleContext(FunctionCallListContext.class,0);
		}
		public FunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExpressionContext functionExpression() throws RecognitionException {
		FunctionExpressionContext _localctx = new FunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			functionIdentifier();
			setState(296);
			match(LeftParen);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(297);
				functionCallList();
				}
			}

			setState(300);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MxstarGrammarParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(MxstarGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MxstarGrammarParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 46, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			theTypeName();
			setState(303);
			match(Identifier);
			setState(304);
			match(LeftParen);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Identifier))) != 0)) {
				{
				setState(305);
				functionParametersList();
				}
			}

			setState(308);
			match(RightParen);
			setState(309);
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
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public JaggedarrayDeclarationContext jaggedarrayDeclaration() {
			return getRuleContext(JaggedarrayDeclarationContext.class,0);
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
		enterRule(_localctx, 48, RULE_primaryDeclaration);
		int _la;
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				theTypeName();
				setState(312);
				match(Identifier);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Equal) {
					{
					setState(313);
					match(Equal);
					setState(314);
					expression();
					}
				}

				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(317);
					match(Comma);
					setState(318);
					match(Identifier);
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Equal) {
						{
						setState(319);
						match(Equal);
						setState(320);
						expression();
						}
					}

					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				arrayDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				jaggedarrayDeclaration();
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
		enterRule(_localctx, 50, RULE_classConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(Identifier);
			setState(333);
			match(LeftParen);
			setState(334);
			match(RightParen);
			setState(335);
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
		enterRule(_localctx, 52, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(Class);
			setState(338);
			match(Identifier);
			setState(339);
			match(LeftBrace);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Identifier))) != 0)) {
				{
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(340);
					declarationStatement();
					}
					break;
				case 2:
					{
					setState(341);
					classConstructor();
					}
					break;
				case 3:
					{
					setState(342);
					functionDeclaration();
					}
					break;
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			match(RightBrace);
			setState(349);
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

	public static class ClassMemberVisitContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(MxstarGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MxstarGrammarParser.Identifier, i);
		}
		public TerminalNode Dot() { return getToken(MxstarGrammarParser.Dot, 0); }
		public TerminalNode This() { return getToken(MxstarGrammarParser.This, 0); }
		public TerminalNode LeftParen() { return getToken(MxstarGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MxstarGrammarParser.RightParen, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(MxstarGrammarParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MxstarGrammarParser.LeftBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MxstarGrammarParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MxstarGrammarParser.RightBracket, i);
		}
		public FunctionCallListContext functionCallList() {
			return getRuleContext(FunctionCallListContext.class,0);
		}
		public ClassMemberVisitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberVisit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterClassMemberVisit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitClassMemberVisit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitClassMemberVisit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberVisitContext classMemberVisit() throws RecognitionException {
		ClassMemberVisitContext _localctx = new ClassMemberVisitContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_classMemberVisit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(Identifier);
			setState(352);
			match(Dot);
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case This:
				{
				setState(353);
				match(This);
				}
				break;
			case Identifier:
				{
				{
				setState(354);
				match(Identifier);
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					{
					setState(355);
					match(LeftParen);
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
						{
						setState(356);
						functionCallList();
						}
					}

					setState(359);
					match(RightParen);
					}
					}
					break;
				case 2:
					{
					setState(364); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(360);
							match(LeftBracket);
							setState(361);
							expression();
							setState(362);
							match(RightBracket);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(366); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode This() { return getToken(MxstarGrammarParser.This, 0); }
		public TerminalNode Identifier() { return getToken(MxstarGrammarParser.Identifier, 0); }
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public LambdaExpression_inContext lambdaExpression_in() {
			return getRuleContext(LambdaExpression_inContext.class,0);
		}
		public LambdaExpression_outContext lambdaExpression_out() {
			return getRuleContext(LambdaExpression_outContext.class,0);
		}
		public ArrayVisitContext arrayVisit() {
			return getRuleContext(ArrayVisitContext.class,0);
		}
		public JaggedarrayVisitContext jaggedarrayVisit() {
			return getRuleContext(JaggedarrayVisitContext.class,0);
		}
		public ArrayFunctionExpressionContext arrayFunctionExpression() {
			return getRuleContext(ArrayFunctionExpressionContext.class,0);
		}
		public StringFunctionExpressionContext stringFunctionExpression() {
			return getRuleContext(StringFunctionExpressionContext.class,0);
		}
		public ArrayCreateContext arrayCreate() {
			return getRuleContext(ArrayCreateContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MxstarGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MxstarGrammarParser.RightParen, 0); }
		public ClassMemberVisitContext classMemberVisit() {
			return getRuleContext(ClassMemberVisitContext.class,0);
		}
		public JaggedarrayCreateContext jaggedarrayCreate() {
			return getRuleContext(JaggedarrayCreateContext.class,0);
		}
		public CreatClassContext creatClass() {
			return getRuleContext(CreatClassContext.class,0);
		}
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
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_primaryExpression);
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				constantExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(This);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				functionExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(376);
				lambdaExpression_in();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(377);
				lambdaExpression_out();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(378);
				arrayVisit();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(379);
				jaggedarrayVisit();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(380);
				arrayFunctionExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(381);
				stringFunctionExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(382);
				arrayCreate();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(383);
				match(LeftParen);
				setState(384);
				expression();
				setState(385);
				match(RightParen);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(387);
				classMemberVisit();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(388);
				jaggedarrayCreate();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(389);
				creatClass();
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

	public static class CreatClassContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(MxstarGrammarParser.New, 0); }
		public TerminalNode Identifier() { return getToken(MxstarGrammarParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(MxstarGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MxstarGrammarParser.RightParen, 0); }
		public CreatClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creatClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterCreatClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitCreatClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitCreatClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatClassContext creatClass() throws RecognitionException {
		CreatClassContext _localctx = new CreatClassContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_creatClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(New);
			setState(393);
			match(Identifier);
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(394);
				match(LeftParen);
				setState(395);
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

	public static class ArrayFunctionExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MxstarGrammarParser.Identifier, 0); }
		public TerminalNode Dot() { return getToken(MxstarGrammarParser.Dot, 0); }
		public TerminalNode LeftParen() { return getToken(MxstarGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MxstarGrammarParser.RightParen, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(MxstarGrammarParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MxstarGrammarParser.LeftBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MxstarGrammarParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MxstarGrammarParser.RightBracket, i);
		}
		public ArrayFunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayFunctionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterArrayFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitArrayFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitArrayFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayFunctionExpressionContext arrayFunctionExpression() throws RecognitionException {
		ArrayFunctionExpressionContext _localctx = new ArrayFunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayFunctionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(Identifier);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftBracket) {
				{
				{
				setState(399);
				match(LeftBracket);
				setState(400);
				expression();
				setState(401);
				match(RightBracket);
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(Dot);
			setState(409);
			match(T__1);
			setState(410);
			match(LeftParen);
			setState(411);
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

	public static class StringFunctionExpressionContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(MxstarGrammarParser.StringLiteral, 0); }
		public TerminalNode Dot() { return getToken(MxstarGrammarParser.Dot, 0); }
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public StringFunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringFunctionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterStringFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitStringFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitStringFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringFunctionExpressionContext stringFunctionExpression() throws RecognitionException {
		StringFunctionExpressionContext _localctx = new StringFunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stringFunctionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(StringLiteral);
			setState(414);
			match(Dot);
			setState(415);
			functionExpression();
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
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
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
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
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
				{
				setState(418);
				primaryExpression();
				}
				break;
			case PlusPlus:
			case MinusMinus:
				{
				setState(419);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==MinusMinus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(420);
				singleExpression(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SingleExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
					setState(423);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(424);
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
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		enterRule(_localctx, 66, RULE_postExpression);
		int _la;
		try {
			setState(433);
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
				setState(430);
				singleExpression(0);
				}
				break;
			case Plus:
			case Minus:
			case Not:
			case Wavy:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(432);
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
		enterRule(_localctx, 68, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			postExpression();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) {
				{
				{
				setState(436);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(437);
				postExpression();
				}
				}
				setState(442);
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
		enterRule(_localctx, 70, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			multiplicativeExpression();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(444);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(445);
				multiplicativeExpression();
				}
				}
				setState(450);
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
		enterRule(_localctx, 72, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			additiveExpression();
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(452);
					shiftOperator();
					setState(453);
					additiveExpression();
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		enterRule(_localctx, 74, RULE_shiftOperator);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Greater:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(Greater);
				setState(461);
				match(Greater);
				}
				break;
			case Less:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				match(Less);
				setState(463);
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
		enterRule(_localctx, 76, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			shiftExpression();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) {
				{
				{
				setState(467);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(468);
				shiftExpression();
				}
				}
				setState(473);
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
		enterRule(_localctx, 78, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			relationalExpression();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EqualEqual || _la==NotEqual) {
				{
				{
				setState(475);
				_la = _input.LA(1);
				if ( !(_la==EqualEqual || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(476);
				relationalExpression();
				}
				}
				setState(481);
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
		enterRule(_localctx, 80, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			equalityExpression();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(483);
				match(And);
				setState(484);
				equalityExpression();
				}
				}
				setState(489);
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
		enterRule(_localctx, 82, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			andExpression();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(491);
				match(Caret);
				setState(492);
				andExpression();
				}
				}
				setState(497);
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
		enterRule(_localctx, 84, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			exclusiveOrExpression();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(499);
				match(Or);
				setState(500);
				exclusiveOrExpression();
				}
				}
				setState(505);
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
		enterRule(_localctx, 86, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			inclusiveOrExpression();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(507);
				match(AndAnd);
				setState(508);
				inclusiveOrExpression();
				}
				}
				setState(513);
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
		enterRule(_localctx, 88, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			logicalAndExpression();
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(515);
				match(OrOr);
				setState(516);
				logicalAndExpression();
				}
				}
				setState(521);
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
		enterRule(_localctx, 90, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			logicalOrExpression();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(523);
				match(Equal);
				setState(524);
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
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MxstarGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MxstarGrammarParser.Comma, i);
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
		enterRule(_localctx, 92, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			assignmentExpression();
			setState(532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(528);
					match(Comma);
					setState(529);
					assignmentExpression();
					}
					} 
				}
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	public static class LambdaExpression_inContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(MxstarGrammarParser.LeftBracket, 0); }
		public TerminalNode And() { return getToken(MxstarGrammarParser.And, 0); }
		public TerminalNode RightBracket() { return getToken(MxstarGrammarParser.RightBracket, 0); }
		public TerminalNode Arrow() { return getToken(MxstarGrammarParser.Arrow, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> LeftParen() { return getTokens(MxstarGrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(MxstarGrammarParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(MxstarGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(MxstarGrammarParser.RightParen, i);
		}
		public FunctionCallListContext functionCallList() {
			return getRuleContext(FunctionCallListContext.class,0);
		}
		public FunctionParametersListContext functionParametersList() {
			return getRuleContext(FunctionParametersListContext.class,0);
		}
		public LambdaExpression_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterLambdaExpression_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitLambdaExpression_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitLambdaExpression_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpression_inContext lambdaExpression_in() throws RecognitionException {
		LambdaExpression_inContext _localctx = new LambdaExpression_inContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lambdaExpression_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(LeftBracket);
			setState(536);
			match(And);
			setState(537);
			match(RightBracket);
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(538);
				match(LeftParen);
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Identifier))) != 0)) {
					{
					setState(539);
					functionParametersList();
					}
				}

				setState(542);
				match(RightParen);
				}
			}

			setState(545);
			match(Arrow);
			setState(546);
			statement();
			setState(547);
			match(LeftParen);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(548);
				functionCallList();
				}
			}

			setState(551);
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

	public static class LambdaExpression_outContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(MxstarGrammarParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MxstarGrammarParser.RightBracket, 0); }
		public TerminalNode Arrow() { return getToken(MxstarGrammarParser.Arrow, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> LeftParen() { return getTokens(MxstarGrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(MxstarGrammarParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(MxstarGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(MxstarGrammarParser.RightParen, i);
		}
		public FunctionCallListContext functionCallList() {
			return getRuleContext(FunctionCallListContext.class,0);
		}
		public FunctionParametersListContext functionParametersList() {
			return getRuleContext(FunctionParametersListContext.class,0);
		}
		public LambdaExpression_outContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).enterLambdaExpression_out(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxstarGrammarListener ) ((MxstarGrammarListener)listener).exitLambdaExpression_out(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxstarGrammarVisitor ) return ((MxstarGrammarVisitor<? extends T>)visitor).visitLambdaExpression_out(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpression_outContext lambdaExpression_out() throws RecognitionException {
		LambdaExpression_outContext _localctx = new LambdaExpression_outContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lambdaExpression_out);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(LeftBracket);
			setState(554);
			match(RightBracket);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(555);
				match(LeftParen);
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Identifier))) != 0)) {
					{
					setState(556);
					functionParametersList();
					}
				}

				setState(559);
				match(RightParen);
				}
			}

			setState(562);
			match(Arrow);
			setState(563);
			statement();
			setState(564);
			match(LeftParen);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Null) | (1L << True) | (1L << False) | (1L << This) | (1L << DIGIT) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Wavy) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(565);
				functionCallList();
				}
			}

			setState(568);
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
		enterRule(_localctx, 98, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u023d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000j\b"+
		"\u0000\n\u0000\f\u0000m\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002~\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003"+
		"\u0004\u0084\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u008a\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006\u008f"+
		"\b\u0006\u000b\u0006\f\u0006\u0090\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009a\b\u0007"+
		"\u0001\b\u0001\b\u0003\b\u009e\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00a5\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b1\b\t\u0001\t\u0001\t\u0003\t\u00b5"+
		"\b\t\u0001\t\u0001\t\u0003\t\u00b9\b\t\u0001\t\u0001\t\u0003\t\u00bd\b"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00c7\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00cd\b\u000b\u0005\u000b\u00cf\b\u000b"+
		"\n\u000b\f\u000b\u00d2\t\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u00d7\b"+
		"\f\u000b\f\f\f\u00d8\u0001\f\u0001\f\u0001\f\u0005\f\u00de\b\f\n\f\f\f"+
		"\u00e1\t\f\u0001\f\u0001\f\u0003\f\u00e5\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00ec\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0101\b\u0010\u0001\u0010\u0004\u0010"+
		"\u0104\b\u0010\u000b\u0010\f\u0010\u0105\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u010d\b\u0011\u000b\u0011\f"+
		"\u0011\u010e\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0119\b\u0013\n\u0013"+
		"\f\u0013\u011c\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u0121\b\u0014\n\u0014\f\u0014\u0124\t\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u012b\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0133"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u013c\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0142\b\u0018\u0005\u0018\u0144\b\u0018"+
		"\n\u0018\f\u0018\u0147\t\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u014b"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u0158\b\u001a\n\u001a\f\u001a\u015b\t\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0166\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0004\u001b\u016d\b\u001b\u000b\u001b\f\u001b"+
		"\u016e\u0003\u001b\u0171\b\u001b\u0003\u001b\u0173\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0187\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u018d\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u0194\b\u001e\n\u001e\f\u001e\u0197\t\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u01a6\b \u0001 "+
		"\u0001 \u0005 \u01aa\b \n \f \u01ad\t \u0001!\u0001!\u0001!\u0003!\u01b2"+
		"\b!\u0001\"\u0001\"\u0001\"\u0005\"\u01b7\b\"\n\"\f\"\u01ba\t\"\u0001"+
		"#\u0001#\u0001#\u0005#\u01bf\b#\n#\f#\u01c2\t#\u0001$\u0001$\u0001$\u0001"+
		"$\u0005$\u01c8\b$\n$\f$\u01cb\t$\u0001%\u0001%\u0001%\u0001%\u0003%\u01d1"+
		"\b%\u0001&\u0001&\u0001&\u0005&\u01d6\b&\n&\f&\u01d9\t&\u0001\'\u0001"+
		"\'\u0001\'\u0005\'\u01de\b\'\n\'\f\'\u01e1\t\'\u0001(\u0001(\u0001(\u0005"+
		"(\u01e6\b(\n(\f(\u01e9\t(\u0001)\u0001)\u0001)\u0005)\u01ee\b)\n)\f)\u01f1"+
		"\t)\u0001*\u0001*\u0001*\u0005*\u01f6\b*\n*\f*\u01f9\t*\u0001+\u0001+"+
		"\u0001+\u0005+\u01fe\b+\n+\f+\u0201\t+\u0001,\u0001,\u0001,\u0005,\u0206"+
		"\b,\n,\f,\u0209\t,\u0001-\u0001-\u0001-\u0003-\u020e\b-\u0001.\u0001."+
		"\u0001.\u0005.\u0213\b.\n.\f.\u0216\t.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u021d\b/\u0001/\u0003/\u0220\b/\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u0226\b/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00030\u022e\b0\u0001"+
		"0\u00030\u0231\b0\u00010\u00010\u00010\u00010\u00030\u0237\b0\u00010\u0001"+
		"0\u00011\u00011\u00011\u0000\u0001@2\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`b\u0000\b\u0003\u0000\t\u000b\u0014\u001477\u0002\u0000"+
		"\u0003\u000688\u0001\u0000./\u0003\u0000\u001b\u001c))--\u0001\u0000\u001d"+
		"\u001f\u0001\u0000\u001b\u001c\u0002\u0000!\"%&\u0001\u0000#$\u0261\u0000"+
		"k\u0001\u0000\u0000\u0000\u0002p\u0001\u0000\u0000\u0000\u0004}\u0001"+
		"\u0000\u0000\u0000\u0006\u007f\u0001\u0000\u0000\u0000\b\u0083\u0001\u0000"+
		"\u0000\u0000\n\u0087\u0001\u0000\u0000\u0000\f\u008e\u0001\u0000\u0000"+
		"\u0000\u000e\u0092\u0001\u0000\u0000\u0000\u0010\u00a4\u0001\u0000\u0000"+
		"\u0000\u0012\u00bc\u0001\u0000\u0000\u0000\u0014\u00be\u0001\u0000\u0000"+
		"\u0000\u0016\u00c0\u0001\u0000\u0000\u0000\u0018\u00d3\u0001\u0000\u0000"+
		"\u0000\u001a\u00eb\u0001\u0000\u0000\u0000\u001c\u00f1\u0001\u0000\u0000"+
		"\u0000\u001e\u00f3\u0001\u0000\u0000\u0000 \u00f9\u0001\u0000\u0000\u0000"+
		"\"\u0107\u0001\u0000\u0000\u0000$\u0110\u0001\u0000\u0000\u0000&\u0112"+
		"\u0001\u0000\u0000\u0000(\u011d\u0001\u0000\u0000\u0000*\u0125\u0001\u0000"+
		"\u0000\u0000,\u0127\u0001\u0000\u0000\u0000.\u012e\u0001\u0000\u0000\u0000"+
		"0\u014a\u0001\u0000\u0000\u00002\u014c\u0001\u0000\u0000\u00004\u0151"+
		"\u0001\u0000\u0000\u00006\u015f\u0001\u0000\u0000\u00008\u0186\u0001\u0000"+
		"\u0000\u0000:\u0188\u0001\u0000\u0000\u0000<\u018e\u0001\u0000\u0000\u0000"+
		">\u019d\u0001\u0000\u0000\u0000@\u01a5\u0001\u0000\u0000\u0000B\u01b1"+
		"\u0001\u0000\u0000\u0000D\u01b3\u0001\u0000\u0000\u0000F\u01bb\u0001\u0000"+
		"\u0000\u0000H\u01c3\u0001\u0000\u0000\u0000J\u01d0\u0001\u0000\u0000\u0000"+
		"L\u01d2\u0001\u0000\u0000\u0000N\u01da\u0001\u0000\u0000\u0000P\u01e2"+
		"\u0001\u0000\u0000\u0000R\u01ea\u0001\u0000\u0000\u0000T\u01f2\u0001\u0000"+
		"\u0000\u0000V\u01fa\u0001\u0000\u0000\u0000X\u0202\u0001\u0000\u0000\u0000"+
		"Z\u020a\u0001\u0000\u0000\u0000\\\u020f\u0001\u0000\u0000\u0000^\u0217"+
		"\u0001\u0000\u0000\u0000`\u0229\u0001\u0000\u0000\u0000b\u023a\u0001\u0000"+
		"\u0000\u0000dj\u0003\u0006\u0003\u0000ej\u00034\u001a\u0000fj\u0003.\u0017"+
		"\u0000gj\u0003\u0016\u000b\u0000hj\u0003\u0018\f\u0000id\u0001\u0000\u0000"+
		"\u0000ie\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000no\u0003\u0002\u0001\u0000o\u0001\u0001\u0000"+
		"\u0000\u0000pq\u0005\u0005\u0000\u0000qr\u0005\u0001\u0000\u0000rs\u0005"+
		"\u0015\u0000\u0000st\u0005\u0016\u0000\u0000tu\u0003\n\u0005\u0000uv\u0005"+
		"\u0000\u0000\u0001v\u0003\u0001\u0000\u0000\u0000w~\u0003\u0006\u0003"+
		"\u0000x~\u0003\b\u0004\u0000y~\u0003\u000e\u0007\u0000z~\u0003\u0010\b"+
		"\u0000{~\u0003\u0012\t\u0000|~\u0003\n\u0005\u0000}w\u0001\u0000\u0000"+
		"\u0000}x\u0001\u0000\u0000\u0000}y\u0001\u0000\u0000\u0000}z\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0005"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u00030\u0018\u0000\u0080\u0081\u0005"+
		"2\u0000\u0000\u0081\u0007\u0001\u0000\u0000\u0000\u0082\u0084\u0003\\"+
		".\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u00052\u0000\u0000"+
		"\u0086\t\u0001\u0000\u0000\u0000\u0087\u0089\u0005\u0019\u0000\u0000\u0088"+
		"\u008a\u0003\f\u0006\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005\u001a\u0000\u0000\u008c\u000b\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0003\u0004\u0002\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\r\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"\r\u0000\u0000\u0093\u0094\u0005\u0015\u0000\u0000\u0094\u0095\u0003b"+
		"1\u0000\u0095\u0096\u0005\u0016\u0000\u0000\u0096\u0099\u0003\u0004\u0002"+
		"\u0000\u0097\u0098\u0005\u000e\u0000\u0000\u0098\u009a\u0003\u0004\u0002"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u000f\u0001\u0000\u0000\u0000\u009b\u009d\u0005\u0013\u0000"+
		"\u0000\u009c\u009e\u0003\\.\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a5\u00052\u0000\u0000\u00a0\u00a1\u0005\u0011\u0000\u0000\u00a1"+
		"\u00a5\u00052\u0000\u0000\u00a2\u00a3\u0005\u0012\u0000\u0000\u00a3\u00a5"+
		"\u00052\u0000\u0000\u00a4\u009b\u0001\u0000\u0000\u0000\u00a4\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u0011\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005\u0010\u0000\u0000\u00a7\u00a8\u0005"+
		"\u0015\u0000\u0000\u00a8\u00a9\u0003b1\u0000\u00a9\u00aa\u0005\u0016\u0000"+
		"\u0000\u00aa\u00ab\u0003\u0004\u0002\u0000\u00ab\u00bd\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005\u000f\u0000\u0000\u00ad\u00b0\u0005\u0015\u0000"+
		"\u0000\u00ae\u00b1\u00030\u0018\u0000\u00af\u00b1\u0003\\.\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b4\u00052\u0000\u0000\u00b3\u00b5\u0003\\.\u0000\u00b4\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b8\u00052\u0000\u0000\u00b7\u00b9\u0003\\"+
		".\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0016\u0000"+
		"\u0000\u00bb\u00bd\u0003\u0004\u0002\u0000\u00bc\u00a6\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ac\u0001\u0000\u0000\u0000\u00bd\u0013\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0007\u0000\u0000\u0000\u00bf\u0015\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0003$\u0012\u0000\u00c1\u00c2\u0005\u0017\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0018\u0000\u0000\u00c3\u00c6\u00058\u0000\u0000\u00c4"+
		"\u00c5\u0005 \u0000\u0000\u00c5\u00c7\u0003\\.\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00d0\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u00051\u0000\u0000\u00c9\u00cc\u00058\u0000"+
		"\u0000\u00ca\u00cb\u0005 \u0000\u0000\u00cb\u00cd\u0003\\.\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cf\u0001\u0000\u0000\u0000\u00ce\u00c8\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u0017\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6\u0003$\u0012\u0000\u00d4\u00d5"+
		"\u0005\u0017\u0000\u0000\u00d5\u00d7\u0005\u0018\u0000\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00df\u00058\u0000\u0000\u00db\u00dc\u0005"+
		"1\u0000\u0000\u00dc\u00de\u00058\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005 \u0000\u0000"+
		"\u00e3\u00e5\u0003\\.\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u0019\u0001\u0000\u0000\u0000\u00e6"+
		"\u00ec\u00058\u0000\u0000\u00e7\u00e8\u0005\u0015\u0000\u0000\u00e8\u00e9"+
		"\u0003\u001e\u000f\u0000\u00e9\u00ea\u0005\u0016\u0000\u0000\u00ea\u00ec"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000\u00eb\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0005\u0017\u0000\u0000\u00ee\u00ef\u0003\\.\u0000\u00ef\u00f0\u0005"+
		"\u0018\u0000\u0000\u00f0\u001b\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0014\u0000\u0000\u00f2\u001d\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005"+
		"\u0007\u0000\u0000\u00f4\u00f5\u0003$\u0012\u0000\u00f5\u00f6\u0005\u0017"+
		"\u0000\u0000\u00f6\u00f7\u0003\u001c\u000e\u0000\u00f7\u00f8\u0005\u0018"+
		"\u0000\u0000\u00f8\u001f\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0007"+
		"\u0000\u0000\u00fa\u00fb\u0003$\u0012\u0000\u00fb\u00fc\u0005\u0017\u0000"+
		"\u0000\u00fc\u00fd\u0003\u001c\u000e\u0000\u00fd\u0103\u0005\u0018\u0000"+
		"\u0000\u00fe\u0100\u0005\u0017\u0000\u0000\u00ff\u0101\u0003\u001c\u000e"+
		"\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0005\u0018\u0000"+
		"\u0000\u0103\u00fe\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106!\u0001\u0000\u0000\u0000\u0107\u010c\u00058\u0000\u0000\u0108"+
		"\u0109\u0005\u0017\u0000\u0000\u0109\u010a\u0003\\.\u0000\u010a\u010b"+
		"\u0005\u0018\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u0108"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010c"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f#\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0007\u0001\u0000\u0000\u0111%\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0003$\u0012\u0000\u0113\u011a\u00058\u0000\u0000"+
		"\u0114\u0115\u00051\u0000\u0000\u0115\u0116\u0003$\u0012\u0000\u0116\u0117"+
		"\u00058\u0000\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0114\u0001"+
		"\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\'\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u0122\u0003\\."+
		"\u0000\u011e\u011f\u00051\u0000\u0000\u011f\u0121\u0003\\.\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122"+
		"\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123"+
		")\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u00058\u0000\u0000\u0126+\u0001\u0000\u0000\u0000\u0127\u0128\u0003*"+
		"\u0015\u0000\u0128\u012a\u0005\u0015\u0000\u0000\u0129\u012b\u0003(\u0014"+
		"\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0016\u0000"+
		"\u0000\u012d-\u0001\u0000\u0000\u0000\u012e\u012f\u0003$\u0012\u0000\u012f"+
		"\u0130\u00058\u0000\u0000\u0130\u0132\u0005\u0015\u0000\u0000\u0131\u0133"+
		"\u0003&\u0013\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0005"+
		"\u0016\u0000\u0000\u0135\u0136\u0003\u0004\u0002\u0000\u0136/\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0003$\u0012\u0000\u0138\u013b\u00058\u0000\u0000"+
		"\u0139\u013a\u0005 \u0000\u0000\u013a\u013c\u0003\\.\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u0145"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u00051\u0000\u0000\u013e\u0141\u0005"+
		"8\u0000\u0000\u013f\u0140\u0005 \u0000\u0000\u0140\u0142\u0003\\.\u0000"+
		"\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u013d\u0001\u0000\u0000\u0000"+
		"\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u014b\u0001\u0000\u0000\u0000"+
		"\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u014b\u0003\u0016\u000b\u0000"+
		"\u0149\u014b\u0003\u0018\f\u0000\u014a\u0137\u0001\u0000\u0000\u0000\u014a"+
		"\u0148\u0001\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b"+
		"1\u0001\u0000\u0000\u0000\u014c\u014d\u00058\u0000\u0000\u014d\u014e\u0005"+
		"\u0015\u0000\u0000\u014e\u014f\u0005\u0016\u0000\u0000\u014f\u0150\u0003"+
		"\u0004\u0002\u0000\u01503\u0001\u0000\u0000\u0000\u0151\u0152\u0005\b"+
		"\u0000\u0000\u0152\u0153\u00058\u0000\u0000\u0153\u0159\u0005\u0019\u0000"+
		"\u0000\u0154\u0158\u0003\u0006\u0003\u0000\u0155\u0158\u00032\u0019\u0000"+
		"\u0156\u0158\u0003.\u0017\u0000\u0157\u0154\u0001\u0000\u0000\u0000\u0157"+
		"\u0155\u0001\u0000\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158"+
		"\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b"+
		"\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u001a\u0000\u0000\u015d"+
		"\u015e\u00052\u0000\u0000\u015e5\u0001\u0000\u0000\u0000\u015f\u0160\u0005"+
		"8\u0000\u0000\u0160\u0172\u00050\u0000\u0000\u0161\u0173\u0005\f\u0000"+
		"\u0000\u0162\u0170\u00058\u0000\u0000\u0163\u0165\u0005\u0015\u0000\u0000"+
		"\u0164\u0166\u0003(\u0014\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167"+
		"\u0171\u0005\u0016\u0000\u0000\u0168\u0169\u0005\u0017\u0000\u0000\u0169"+
		"\u016a\u0003\\.\u0000\u016a\u016b\u0005\u0018\u0000\u0000\u016b\u016d"+
		"\u0001\u0000\u0000\u0000\u016c\u0168\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0001\u0000\u0000\u0000\u016f\u0171\u0001\u0000\u0000\u0000\u0170\u0163"+
		"\u0001\u0000\u0000\u0000\u0170\u016c\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0001\u0000\u0000\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u0161"+
		"\u0001\u0000\u0000\u0000\u0172\u0162\u0001\u0000\u0000\u0000\u01737\u0001"+
		"\u0000\u0000\u0000\u0174\u0187\u0003\u0014\n\u0000\u0175\u0187\u0005\f"+
		"\u0000\u0000\u0176\u0187\u00058\u0000\u0000\u0177\u0187\u0003,\u0016\u0000"+
		"\u0178\u0187\u0003^/\u0000\u0179\u0187\u0003`0\u0000\u017a\u0187\u0003"+
		"\u001a\r\u0000\u017b\u0187\u0003\"\u0011\u0000\u017c\u0187\u0003<\u001e"+
		"\u0000\u017d\u0187\u0003>\u001f\u0000\u017e\u0187\u0003\u001e\u000f\u0000"+
		"\u017f\u0180\u0005\u0015\u0000\u0000\u0180\u0181\u0003\\.\u0000\u0181"+
		"\u0182\u0005\u0016\u0000\u0000\u0182\u0187\u0001\u0000\u0000\u0000\u0183"+
		"\u0187\u00036\u001b\u0000\u0184\u0187\u0003 \u0010\u0000\u0185\u0187\u0003"+
		":\u001d\u0000\u0186\u0174\u0001\u0000\u0000\u0000\u0186\u0175\u0001\u0000"+
		"\u0000\u0000\u0186\u0176\u0001\u0000\u0000\u0000\u0186\u0177\u0001\u0000"+
		"\u0000\u0000\u0186\u0178\u0001\u0000\u0000\u0000\u0186\u0179\u0001\u0000"+
		"\u0000\u0000\u0186\u017a\u0001\u0000\u0000\u0000\u0186\u017b\u0001\u0000"+
		"\u0000\u0000\u0186\u017c\u0001\u0000\u0000\u0000\u0186\u017d\u0001\u0000"+
		"\u0000\u0000\u0186\u017e\u0001\u0000\u0000\u0000\u0186\u017f\u0001\u0000"+
		"\u0000\u0000\u0186\u0183\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000"+
		"\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u01879\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0005\u0007\u0000\u0000\u0189\u018c\u00058\u0000\u0000"+
		"\u018a\u018b\u0005\u0015\u0000\u0000\u018b\u018d\u0005\u0016\u0000\u0000"+
		"\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000"+
		"\u018d;\u0001\u0000\u0000\u0000\u018e\u0195\u00058\u0000\u0000\u018f\u0190"+
		"\u0005\u0017\u0000\u0000\u0190\u0191\u0003\\.\u0000\u0191\u0192\u0005"+
		"\u0018\u0000\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193\u018f\u0001"+
		"\u0000\u0000\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0198\u0001"+
		"\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u0199\u0005"+
		"0\u0000\u0000\u0199\u019a\u0005\u0002\u0000\u0000\u019a\u019b\u0005\u0015"+
		"\u0000\u0000\u019b\u019c\u0005\u0016\u0000\u0000\u019c=\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u00057\u0000\u0000\u019e\u019f\u00050\u0000\u0000\u019f"+
		"\u01a0\u0003,\u0016\u0000\u01a0?\u0001\u0000\u0000\u0000\u01a1\u01a2\u0006"+
		" \uffff\uffff\u0000\u01a2\u01a6\u00038\u001c\u0000\u01a3\u01a4\u0007\u0002"+
		"\u0000\u0000\u01a4\u01a6\u0003@ \u0002\u01a5\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01ab\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\n\u0001\u0000\u0000\u01a8\u01aa\u0007\u0002\u0000\u0000\u01a9"+
		"\u01a7\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab"+
		"\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac"+
		"A\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01b2"+
		"\u0003@ \u0000\u01af\u01b0\u0007\u0003\u0000\u0000\u01b0\u01b2\u0003B"+
		"!\u0000\u01b1\u01ae\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000"+
		"\u0000\u01b2C\u0001\u0000\u0000\u0000\u01b3\u01b8\u0003B!\u0000\u01b4"+
		"\u01b5\u0007\u0004\u0000\u0000\u01b5\u01b7\u0003B!\u0000\u01b6\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9E\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01bb\u01c0\u0003D\""+
		"\u0000\u01bc\u01bd\u0007\u0005\u0000\u0000\u01bd\u01bf\u0003D\"\u0000"+
		"\u01be\u01bc\u0001\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c1G\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c9\u0003F#\u0000\u01c4\u01c5\u0003J%\u0000\u01c5\u01c6\u0003F#\u0000"+
		"\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0001\u0000\u0000\u0000\u01caI\u0001\u0000\u0000\u0000\u01cb"+
		"\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005\"\u0000\u0000\u01cd\u01d1"+
		"\u0005\"\u0000\u0000\u01ce\u01cf\u0005!\u0000\u0000\u01cf\u01d1\u0005"+
		"!\u0000\u0000\u01d0\u01cc\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000"+
		"\u0000\u0000\u01d1K\u0001\u0000\u0000\u0000\u01d2\u01d7\u0003H$\u0000"+
		"\u01d3\u01d4\u0007\u0006\u0000\u0000\u01d4\u01d6\u0003H$\u0000\u01d5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8M\u0001"+
		"\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01df\u0003"+
		"L&\u0000\u01db\u01dc\u0007\u0007\u0000\u0000\u01dc\u01de\u0003L&\u0000"+
		"\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000\u0000\u0000"+
		"\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e0O\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e7\u0003N\'\u0000\u01e3\u01e4\u0005*\u0000\u0000\u01e4\u01e6\u0003"+
		"N\'\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000"+
		"\u0000\u0000\u01e8Q\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000"+
		"\u0000\u01ea\u01ef\u0003P(\u0000\u01eb\u01ec\u0005,\u0000\u0000\u01ec"+
		"\u01ee\u0003P(\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001"+
		"\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f0S\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f7\u0003R)\u0000\u01f3\u01f4\u0005+\u0000\u0000"+
		"\u01f4\u01f6\u0003R)\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f9"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f8"+
		"\u0001\u0000\u0000\u0000\u01f8U\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001"+
		"\u0000\u0000\u0000\u01fa\u01ff\u0003T*\u0000\u01fb\u01fc\u0005\'\u0000"+
		"\u0000\u01fc\u01fe\u0003T*\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe"+
		"\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0001\u0000\u0000\u0000\u0200W\u0001\u0000\u0000\u0000\u0201\u01ff"+
		"\u0001\u0000\u0000\u0000\u0202\u0207\u0003V+\u0000\u0203\u0204\u0005("+
		"\u0000\u0000\u0204\u0206\u0003V+\u0000\u0205\u0203\u0001\u0000\u0000\u0000"+
		"\u0206\u0209\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000"+
		"\u0207\u0208\u0001\u0000\u0000\u0000\u0208Y\u0001\u0000\u0000\u0000\u0209"+
		"\u0207\u0001\u0000\u0000\u0000\u020a\u020d\u0003X,\u0000\u020b\u020c\u0005"+
		" \u0000\u0000\u020c\u020e\u0003X,\u0000\u020d\u020b\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e[\u0001\u0000\u0000\u0000"+
		"\u020f\u0214\u0003Z-\u0000\u0210\u0211\u00051\u0000\u0000\u0211\u0213"+
		"\u0003Z-\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0213\u0216\u0001\u0000"+
		"\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000"+
		"\u0000\u0000\u0215]\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000"+
		"\u0000\u0217\u0218\u0005\u0017\u0000\u0000\u0218\u0219\u0005*\u0000\u0000"+
		"\u0219\u021f\u0005\u0018\u0000\u0000\u021a\u021c\u0005\u0015\u0000\u0000"+
		"\u021b\u021d\u0003&\u0013\u0000\u021c\u021b\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e"+
		"\u0220\u0005\u0016\u0000\u0000\u021f\u021a\u0001\u0000\u0000\u0000\u021f"+
		"\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221"+
		"\u0222\u00053\u0000\u0000\u0222\u0223\u0003\u0004\u0002\u0000\u0223\u0225"+
		"\u0005\u0015\u0000\u0000\u0224\u0226\u0003(\u0014\u0000\u0225\u0224\u0001"+
		"\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0227\u0001"+
		"\u0000\u0000\u0000\u0227\u0228\u0005\u0016\u0000\u0000\u0228_\u0001\u0000"+
		"\u0000\u0000\u0229\u022a\u0005\u0017\u0000\u0000\u022a\u0230\u0005\u0018"+
		"\u0000\u0000\u022b\u022d\u0005\u0015\u0000\u0000\u022c\u022e\u0003&\u0013"+
		"\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0231\u0005\u0016\u0000"+
		"\u0000\u0230\u022b\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000"+
		"\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u00053\u0000\u0000"+
		"\u0233\u0234\u0003\u0004\u0002\u0000\u0234\u0236\u0005\u0015\u0000\u0000"+
		"\u0235\u0237\u0003(\u0014\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0236"+
		"\u0237\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238"+
		"\u0239\u0005\u0016\u0000\u0000\u0239a\u0001\u0000\u0000\u0000\u023a\u023b"+
		"\u0003\\.\u0000\u023bc\u0001\u0000\u0000\u0000>ik}\u0083\u0089\u0090\u0099"+
		"\u009d\u00a4\u00b0\u00b4\u00b8\u00bc\u00c6\u00cc\u00d0\u00d8\u00df\u00e4"+
		"\u00eb\u0100\u0105\u010e\u011a\u0122\u012a\u0132\u013b\u0141\u0145\u014a"+
		"\u0157\u0159\u0165\u016e\u0170\u0172\u0186\u018c\u0195\u01a5\u01ab\u01b1"+
		"\u01b8\u01c0\u01c9\u01d0\u01d7\u01df\u01e7\u01ef\u01f7\u01ff\u0207\u020d"+
		"\u0214\u021c\u021f\u0225\u022d\u0230\u0236";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}