// Generated from /home/danila/SPbU/year4/VM/simplelanguage/lamalanguage/src/main/java/ru/usachev63/lamatruffle/parser/LamaLanguage.g4 by ANTLR 4.13.2
package ru.usachev63.lamatruffle.parser;

// DO NOT MODIFY - generated from LamaLanguage.g4 using antlr4

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.oracle.truffle.api.*;
import com.oracle.truffle.api.source.*;
import ru.usachev63.lamatruffle.*;
import ru.usachev63.lamatruffle.nodes.*;
import ru.usachev63.lamatruffle.nodes.expr.*;
import ru.usachev63.lamatruffle.nodes.expr.numeric.*;
import ru.usachev63.lamatruffle.nodes.builtins.*;
import ru.usachev63.lamatruffle.nodes.pattern.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LamaLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, WS=44, COMMENT=45, LINE_COMMENT=46, 
		UIDENT=47, LIDENT=48, DECIMAL=49, STRING=50, CHAR=51;
	public static final int
		RULE_lama = 0, RULE_scopeExpression = 1, RULE_scopeExpressionNoStart = 2, 
		RULE_definition = 3, RULE_variableDefinition = 4, RULE_variableDefinitionSequence = 5, 
		RULE_variableDefinitionItem = 6, RULE_functionDefinition = 7, RULE_functionParameters = 8, 
		RULE_functionParameter = 9, RULE_expression = 10, RULE_basicExpression = 11, 
		RULE_maybeAssignment = 12, RULE_maybeConjunction = 13, RULE_maybeCmp = 14, 
		RULE_maybeAddSub = 15, RULE_maybeMulDivRem = 16, RULE_binaryOperand = 17, 
		RULE_postfixExpression = 18, RULE_postfixItem = 19, RULE_primary = 20, 
		RULE_const_ = 21, RULE_stringLiteral = 22, RULE_charLiteral = 23, RULE_varRef = 24, 
		RULE_arrayExpression = 25, RULE_sExpression = 26, RULE_ifExpression = 27, 
		RULE_elseBranch = 28, RULE_whileDoExpression = 29, RULE_doWhileExpression = 30, 
		RULE_forExpression = 31, RULE_caseExpression = 32, RULE_caseBranches = 33, 
		RULE_caseBranch = 34, RULE_pattern = 35, RULE_simplePattern = 36, RULE_wildcardPattern = 37, 
		RULE_sexpPattern = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"lama", "scopeExpression", "scopeExpressionNoStart", "definition", "variableDefinition", 
			"variableDefinitionSequence", "variableDefinitionItem", "functionDefinition", 
			"functionParameters", "functionParameter", "expression", "basicExpression", 
			"maybeAssignment", "maybeConjunction", "maybeCmp", "maybeAddSub", "maybeMulDivRem", 
			"binaryOperand", "postfixExpression", "postfixItem", "primary", "const_", 
			"stringLiteral", "charLiteral", "varRef", "arrayExpression", "sExpression", 
			"ifExpression", "elseBranch", "whileDoExpression", "doWhileExpression", 
			"forExpression", "caseExpression", "caseBranches", "caseBranch", "pattern", 
			"simplePattern", "wildcardPattern", "sexpPattern"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "';'", "','", "'='", "'fun'", "'('", "')'", "'{'", "'}'", 
			"':='", "'&&'", "'=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'['", "']'", "'.'", "'true'", "'false'", 
			"'skip'", "'if'", "'then'", "'elif'", "'fi'", "'else'", "'while'", "'do'", 
			"'od'", "'for'", "'case'", "'of'", "'esac'", "'|'", "'->'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "COMMENT", "LINE_COMMENT", 
			"UIDENT", "LIDENT", "DECIMAL", "STRING", "CHAR"
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
	public String getGrammarFileName() { return "LamaLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private LamaNodeFactory factory;

	private static final class BailoutErrorListener extends BaseErrorListener {
	    private final Source source;
	    BailoutErrorListener(Source source) {
	        this.source = source;
	    }
	    @Override
	    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
	        throwParseError(source, line, charPositionInLine, (Token) offendingSymbol, msg);
	    }
	}

	private static void throwParseError(Source source, int line, int charPositionInLine, Token token, String message) {
	    int col = charPositionInLine + 1;
	    String location = "-- line " + line + " col " + col + ": ";
	    int length = token == null ? 1 : Math.max(token.getStopIndex() - token.getStartIndex(), 0);
	    throw new LamaParseError(source, line, col, length, String.format("Error(s) parsing script:%n" + location + message));
	}

	public static RootCallTarget parseLama(LamaLanguage language, Source source) {
	    LamaLanguageLexer lexer = new LamaLanguageLexer(CharStreams.fromString(source.getCharacters().toString()));
	    LamaLanguageParser parser = new LamaLanguageParser(new CommonTokenStream(lexer));
	    lexer.removeErrorListeners();
	    parser.removeErrorListeners();
	    BailoutErrorListener listener = new BailoutErrorListener(source);
	    lexer.addErrorListener(listener);
	    parser.addErrorListener(listener);
	    parser.factory = new LamaNodeFactory(language, source);
	    parser.lama();
	    return parser.factory.getMain().getCallTarget();
	}

	private static enum Attr {
	    VAL,
	    REF,
	    VOID,
	    WEAK,
	};

	public static class IfThenEntry {
	  public ExprNode conditionNode;
	  public ExprNode bodyNode;
	  public IfThenEntry(ExprNode conditionNode, ExprNode bodyNode) {
	    this.conditionNode = conditionNode;
	    this.bodyNode = bodyNode;
	  }
	};


	public LamaLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LamaContext extends ParserRuleContext {
		public ScopeExpressionContext scopeExpression;
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LamaLanguageParser.EOF, 0); }
		public LamaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lama; }
	}

	public final LamaContext lama() throws RecognitionException {
		LamaContext _localctx = new LamaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lama);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((LamaContext)_localctx).scopeExpression = scopeExpression(Attr.VOID, true);
			 factory.createMain(((LamaContext)_localctx).scopeExpression.result); 
			setState(80);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScopeExpressionContext extends ParserRuleContext {
		public Attr attr;
		public boolean popScope;
		public ScopeExprNode result;
		public ScopeExpressionNoStartContext scopeExpressionNoStart;
		public ScopeExpressionNoStartContext scopeExpressionNoStart() {
			return getRuleContext(ScopeExpressionNoStartContext.class,0);
		}
		public ScopeExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ScopeExpressionContext(ParserRuleContext parent, int invokingState, Attr attr, boolean popScope) {
			super(parent, invokingState);
			this.attr = attr;
			this.popScope = popScope;
		}
		@Override public int getRuleIndex() { return RULE_scopeExpression; }
	}

	public final ScopeExpressionContext scopeExpression(Attr attr,boolean popScope) throws RecognitionException {
		ScopeExpressionContext _localctx = new ScopeExpressionContext(_ctx, getState(), attr, popScope);
		enterRule(_localctx, 2, RULE_scopeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startScope(); 
			setState(83);
			((ScopeExpressionContext)_localctx).scopeExpressionNoStart = scopeExpressionNoStart(attr, popScope);

			    ((ScopeExpressionContext)_localctx).result =  ((ScopeExpressionContext)_localctx).scopeExpressionNoStart.result;
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScopeExpressionNoStartContext extends ParserRuleContext {
		public Attr attr;
		public boolean popScope;
		public ScopeExprNode result;
		public ExpressionContext expression;
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScopeExpressionNoStartContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ScopeExpressionNoStartContext(ParserRuleContext parent, int invokingState, Attr attr, boolean popScope) {
			super(parent, invokingState);
			this.attr = attr;
			this.popScope = popScope;
		}
		@Override public int getRuleIndex() { return RULE_scopeExpressionNoStart; }
	}

	public final ScopeExpressionNoStartContext scopeExpressionNoStart(Attr attr,boolean popScope) throws RecognitionException {
		ScopeExpressionNoStartContext _localctx = new ScopeExpressionNoStartContext(_ctx, getState(), attr, popScope);
		enterRule(_localctx, 4, RULE_scopeExpressionNoStart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					definition();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(92);
				((ScopeExpressionNoStartContext)_localctx).expression = expression(attr);
				}
				break;
			}

			    ExprNode body = null;
			    if (((ScopeExpressionNoStartContext)_localctx).expression != null)
			      body = ((ScopeExpressionNoStartContext)_localctx).expression.result;
			    ((ScopeExpressionNoStartContext)_localctx).result =  factory.finishScope(body, popScope);
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definition);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				variableDefinition();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				functionDefinition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDefinitionContext extends ParserRuleContext {
		public VariableDefinitionSequenceContext variableDefinitionSequence() {
			return getRuleContext(VariableDefinitionSequenceContext.class,0);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__0);
			setState(102);
			variableDefinitionSequence();
			setState(103);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDefinitionSequenceContext extends ParserRuleContext {
		public List<VariableDefinitionItemContext> variableDefinitionItem() {
			return getRuleContexts(VariableDefinitionItemContext.class);
		}
		public VariableDefinitionItemContext variableDefinitionItem(int i) {
			return getRuleContext(VariableDefinitionItemContext.class,i);
		}
		public VariableDefinitionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitionSequence; }
	}

	public final VariableDefinitionSequenceContext variableDefinitionSequence() throws RecognitionException {
		VariableDefinitionSequenceContext _localctx = new VariableDefinitionSequenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDefinitionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			variableDefinitionItem();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(106);
				match(T__2);
				setState(107);
				variableDefinitionItem();
				}
				}
				setState(112);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDefinitionItemContext extends ParserRuleContext {
		public Token LIDENT;
		public BasicExpressionContext basicExpression;
		public TerminalNode LIDENT() { return getToken(LamaLanguageParser.LIDENT, 0); }
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public VariableDefinitionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitionItem; }
	}

	public final VariableDefinitionItemContext variableDefinitionItem() throws RecognitionException {
		VariableDefinitionItemContext _localctx = new VariableDefinitionItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDefinitionItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((VariableDefinitionItemContext)_localctx).LIDENT = match(LIDENT);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(114);
				match(T__3);
				setState(115);
				((VariableDefinitionItemContext)_localctx).basicExpression = basicExpression(Attr.VAL);
				}
			}


			    factory.onVariableDefinition(((VariableDefinitionItemContext)_localctx).LIDENT, ((VariableDefinitionItemContext)_localctx).basicExpression != null ? ((VariableDefinitionItemContext)_localctx).basicExpression.result : null);
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public Token LIDENT;
		public ScopeExpressionNoStartContext body;
		public TerminalNode LIDENT() { return getToken(LamaLanguageParser.LIDENT, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public ScopeExpressionNoStartContext scopeExpressionNoStart() {
			return getRuleContext(ScopeExpressionNoStartContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__4);
			setState(121);
			((FunctionDefinitionContext)_localctx).LIDENT = match(LIDENT);

			    factory.startFrame(((FunctionDefinitionContext)_localctx).LIDENT);
			    factory.startScope();
			  
			setState(123);
			match(T__5);
			setState(124);
			functionParameters();
			setState(125);
			match(T__6);
			setState(126);
			match(T__7);
			setState(127);
			((FunctionDefinitionContext)_localctx).body = scopeExpressionNoStart(Attr.VOID, true);
			setState(128);
			match(T__8);
			 factory.finishFrame(((FunctionDefinitionContext)_localctx).body.result); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParametersContext extends ParserRuleContext {
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIDENT) {
				{
				setState(131);
				functionParameter();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(132);
					match(T__2);
					setState(133);
					functionParameter();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParameterContext extends ParserRuleContext {
		public Token LIDENT;
		public TerminalNode LIDENT() { return getToken(LamaLanguageParser.LIDENT, 0); }
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			((FunctionParameterContext)_localctx).LIDENT = match(LIDENT);
			 factory.addFormalParameter(((FunctionParameterContext)_localctx).LIDENT); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public BasicExpressionContext basicExpression;
		public ExpressionContext expression;
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression(Attr attr) throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState(), attr);
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				((ExpressionContext)_localctx).basicExpression = basicExpression(attr);
				 ((ExpressionContext)_localctx).result =  ((ExpressionContext)_localctx).basicExpression.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				((ExpressionContext)_localctx).basicExpression = basicExpression(Attr.VOID);
				setState(148);
				match(T__1);
				setState(149);
				((ExpressionContext)_localctx).expression = expression(attr);
				 ((ExpressionContext)_localctx).result =  new SeqNode(((ExpressionContext)_localctx).basicExpression.result, ((ExpressionContext)_localctx).expression.result); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class BasicExpressionContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public MaybeAssignmentContext maybeAssignment;
		public MaybeAssignmentContext maybeAssignment() {
			return getRuleContext(MaybeAssignmentContext.class,0);
		}
		public BasicExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BasicExpressionContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_basicExpression; }
	}

	public final BasicExpressionContext basicExpression(Attr attr) throws RecognitionException {
		BasicExpressionContext _localctx = new BasicExpressionContext(_ctx, getState(), attr);
		enterRule(_localctx, 22, RULE_basicExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((BasicExpressionContext)_localctx).maybeAssignment = maybeAssignment(attr);
			 ((BasicExpressionContext)_localctx).result =  ((BasicExpressionContext)_localctx).maybeAssignment.result; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeAssignmentContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public MaybeConjunctionContext lhs;
		public MaybeAssignmentContext rhs;
		public MaybeConjunctionContext maybeConjunction;
		public MaybeConjunctionContext maybeConjunction() {
			return getRuleContext(MaybeConjunctionContext.class,0);
		}
		public MaybeAssignmentContext maybeAssignment() {
			return getRuleContext(MaybeAssignmentContext.class,0);
		}
		public MaybeAssignmentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MaybeAssignmentContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_maybeAssignment; }
	}

	public final MaybeAssignmentContext maybeAssignment(Attr attr) throws RecognitionException {
		MaybeAssignmentContext _localctx = new MaybeAssignmentContext(_ctx, getState(), attr);
		enterRule(_localctx, 24, RULE_maybeAssignment);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(158);
				((MaybeAssignmentContext)_localctx).lhs = maybeConjunction(Attr.REF);
				setState(159);
				match(T__9);
				setState(160);
				((MaybeAssignmentContext)_localctx).rhs = maybeAssignment(Attr.VAL);

				    ((MaybeAssignmentContext)_localctx).result =  factory.createAssn(((MaybeAssignmentContext)_localctx).lhs.result, ((MaybeAssignmentContext)_localctx).rhs.result);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				((MaybeAssignmentContext)_localctx).maybeConjunction = maybeConjunction(attr);
				 ((MaybeAssignmentContext)_localctx).result =  ((MaybeAssignmentContext)_localctx).maybeConjunction.result; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeConjunctionContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public MaybeCmpContext maybeCmp;
		public Token op;
		public MaybeCmpContext rhs;
		public List<MaybeCmpContext> maybeCmp() {
			return getRuleContexts(MaybeCmpContext.class);
		}
		public MaybeCmpContext maybeCmp(int i) {
			return getRuleContext(MaybeCmpContext.class,i);
		}
		public MaybeConjunctionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MaybeConjunctionContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_maybeConjunction; }
	}

	public final MaybeConjunctionContext maybeConjunction(Attr attr) throws RecognitionException {
		MaybeConjunctionContext _localctx = new MaybeConjunctionContext(_ctx, getState(), attr);
		enterRule(_localctx, 26, RULE_maybeConjunction);
		try {
			int _alt;
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(attr);
				 ((MaybeConjunctionContext)_localctx).result =  ((MaybeConjunctionContext)_localctx).maybeCmp.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(Attr.VAL);
				 ((MaybeConjunctionContext)_localctx).result =  ((MaybeConjunctionContext)_localctx).maybeCmp.result; 
				setState(177); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(173);
						((MaybeConjunctionContext)_localctx).op = match(T__10);
						setState(174);
						((MaybeConjunctionContext)_localctx).rhs = ((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(Attr.VAL);

						      ((MaybeConjunctionContext)_localctx).result =  factory.createBinary(((MaybeConjunctionContext)_localctx).op, _localctx.result, ((MaybeConjunctionContext)_localctx).rhs.result);
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(179); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeCmpContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public MaybeAddSubContext lhs;
		public Token op;
		public MaybeAddSubContext rhs;
		public MaybeAddSubContext maybeAddSub;
		public List<MaybeAddSubContext> maybeAddSub() {
			return getRuleContexts(MaybeAddSubContext.class);
		}
		public MaybeAddSubContext maybeAddSub(int i) {
			return getRuleContext(MaybeAddSubContext.class,i);
		}
		public MaybeCmpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MaybeCmpContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_maybeCmp; }
	}

	public final MaybeCmpContext maybeCmp(Attr attr) throws RecognitionException {
		MaybeCmpContext _localctx = new MaybeCmpContext(_ctx, getState(), attr);
		enterRule(_localctx, 28, RULE_maybeCmp);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(184);
				((MaybeCmpContext)_localctx).lhs = maybeAddSub(Attr.VAL);
				setState(185);
				((MaybeCmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0)) ) {
					((MaybeCmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				((MaybeCmpContext)_localctx).rhs = maybeAddSub(Attr.VAL);

				    ((MaybeCmpContext)_localctx).result =  factory.createBinary(((MaybeCmpContext)_localctx).op, ((MaybeCmpContext)_localctx).lhs.result, ((MaybeCmpContext)_localctx).rhs.result);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				((MaybeCmpContext)_localctx).maybeAddSub = maybeAddSub(attr);
				 ((MaybeCmpContext)_localctx).result =  ((MaybeCmpContext)_localctx).maybeAddSub.result; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeAddSubContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public MaybeMulDivRemContext maybeMulDivRem;
		public Token op;
		public MaybeMulDivRemContext rhs;
		public List<MaybeMulDivRemContext> maybeMulDivRem() {
			return getRuleContexts(MaybeMulDivRemContext.class);
		}
		public MaybeMulDivRemContext maybeMulDivRem(int i) {
			return getRuleContext(MaybeMulDivRemContext.class,i);
		}
		public MaybeAddSubContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MaybeAddSubContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_maybeAddSub; }
	}

	public final MaybeAddSubContext maybeAddSub(Attr attr) throws RecognitionException {
		MaybeAddSubContext _localctx = new MaybeAddSubContext(_ctx, getState(), attr);
		enterRule(_localctx, 30, RULE_maybeAddSub);
		int _la;
		try {
			int _alt;
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(attr);
				 ((MaybeAddSubContext)_localctx).result =  ((MaybeAddSubContext)_localctx).maybeMulDivRem.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(198);
				((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(Attr.VAL);
				 ((MaybeAddSubContext)_localctx).result =  ((MaybeAddSubContext)_localctx).maybeMulDivRem.result; 
				setState(204); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(200);
						((MaybeAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((MaybeAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						((MaybeAddSubContext)_localctx).rhs = ((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(Attr.VAL);

						      ((MaybeAddSubContext)_localctx).result =  factory.createBinary(((MaybeAddSubContext)_localctx).op, _localctx.result, ((MaybeAddSubContext)_localctx).rhs.result);
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(206); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeMulDivRemContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public BinaryOperandContext binaryOperand;
		public Token op;
		public BinaryOperandContext rhs;
		public List<BinaryOperandContext> binaryOperand() {
			return getRuleContexts(BinaryOperandContext.class);
		}
		public BinaryOperandContext binaryOperand(int i) {
			return getRuleContext(BinaryOperandContext.class,i);
		}
		public MaybeMulDivRemContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MaybeMulDivRemContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_maybeMulDivRem; }
	}

	public final MaybeMulDivRemContext maybeMulDivRem(Attr attr) throws RecognitionException {
		MaybeMulDivRemContext _localctx = new MaybeMulDivRemContext(_ctx, getState(), attr);
		enterRule(_localctx, 32, RULE_maybeMulDivRem);
		int _la;
		try {
			int _alt;
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(attr);
				 ((MaybeMulDivRemContext)_localctx).result =  ((MaybeMulDivRemContext)_localctx).binaryOperand.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(214);
				((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(Attr.VAL);
				 ((MaybeMulDivRemContext)_localctx).result =  ((MaybeMulDivRemContext)_localctx).binaryOperand.result; 
				setState(220); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(216);
						((MaybeMulDivRemContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
							((MaybeMulDivRemContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						((MaybeMulDivRemContext)_localctx).rhs = ((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(Attr.VAL);

						    ((MaybeMulDivRemContext)_localctx).result =  factory.createBinary(((MaybeMulDivRemContext)_localctx).op, _localctx.result, ((MaybeMulDivRemContext)_localctx).rhs.result);
						  
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(222); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOperandContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public PostfixExpressionContext postfixExpression;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public BinaryOperandContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BinaryOperandContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_binaryOperand; }
	}

	public final BinaryOperandContext binaryOperand(Attr attr) throws RecognitionException {
		BinaryOperandContext _localctx = new BinaryOperandContext(_ctx, getState(), attr);
		enterRule(_localctx, 34, RULE_binaryOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((BinaryOperandContext)_localctx).postfixExpression = postfixExpression(attr);

			    ((BinaryOperandContext)_localctx).result =  ((BinaryOperandContext)_localctx).postfixExpression.result;
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public PrimaryContext primary;
		public PostfixItemContext postfixItem;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<PostfixItemContext> postfixItem() {
			return getRuleContexts(PostfixItemContext.class);
		}
		public PostfixItemContext postfixItem(int i) {
			return getRuleContext(PostfixItemContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	}

	public final PostfixExpressionContext postfixExpression(Attr attr) throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState(), attr);
		enterRule(_localctx, 36, RULE_postfixExpression);
		try {
			int _alt;
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				((PostfixExpressionContext)_localctx).primary = primary(attr);
				 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).primary.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				((PostfixExpressionContext)_localctx).primary = primary(Attr.VAL);
				 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).primary.result; 
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(234);
						((PostfixExpressionContext)_localctx).postfixItem = postfixItem(_localctx.result, Attr.VAL);
						 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).postfixItem.result; 
						}
						} 
					}
					setState(241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(242);
				((PostfixExpressionContext)_localctx).postfixItem = postfixItem(_localctx.result, attr);
				 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).postfixItem.result; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixItemContext extends ParserRuleContext {
		public ExprNode base;
		public Attr attr;
		public ExprNode result;
		public ExpressionContext index;
		public ExpressionContext expression;
		public VarRefContext callee;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public PostfixItemContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PostfixItemContext(ParserRuleContext parent, int invokingState, ExprNode base, Attr attr) {
			super(parent, invokingState);
			this.base = base;
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_postfixItem; }
	}

	public final PostfixItemContext postfixItem(ExprNode base,Attr attr) throws RecognitionException {
		PostfixItemContext _localctx = new PostfixItemContext(_ctx, getState(), base, attr);
		enterRule(_localctx, 38, RULE_postfixItem);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__22);
				setState(248);
				((PostfixItemContext)_localctx).index = expression(Attr.VAL);
				setState(249);
				match(T__23);

				    if (_localctx.attr == Attr.REF)
				      ((PostfixItemContext)_localctx).result =  factory.createElemRef(_localctx.base, ((PostfixItemContext)_localctx).index.result);
				    else
				      ((PostfixItemContext)_localctx).result =  factory.createElemRead(_localctx.base, ((PostfixItemContext)_localctx).index.result);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				 List<ExprNode> argumentNodes = new ArrayList<>(); 
				setState(254);
				match(T__5);
				setState(266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(255);
					((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
					 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(257);
						match(T__2);
						setState(258);
						((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
						 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
						}
						}
						setState(265);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(268);
				match(T__6);

				    ((PostfixItemContext)_localctx).result =  factory.createCallExpr(_localctx.base, argumentNodes);
				  
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				 List<ExprNode> argumentNodes = new ArrayList<>(); argumentNodes.add(_localctx.base); 
				setState(272);
				match(T__24);
				setState(273);
				((PostfixItemContext)_localctx).callee = varRef(Attr.VAL);
				setState(288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(274);
					match(T__5);
					setState(275);
					((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
					 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(277);
						match(T__2);
						setState(278);
						((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
						 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
						}
						}
						setState(285);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(286);
					match(T__6);
					}
					break;
				}

				    ((PostfixItemContext)_localctx).result =  factory.createCallExpr(((PostfixItemContext)_localctx).callee.result, argumentNodes);
				  
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public Const_Context const_;
		public StringLiteralContext stringLiteral;
		public CharLiteralContext charLiteral;
		public VarRefContext varRef;
		public ScopeExpressionContext scopeExpression;
		public ArrayExpressionContext arrayExpression;
		public SExpressionContext sExpression;
		public IfExpressionContext ifExpression;
		public WhileDoExpressionContext whileDoExpression;
		public DoWhileExpressionContext doWhileExpression;
		public ForExpressionContext forExpression;
		public CaseExpressionContext caseExpression;
		public Const_Context const_() {
			return getRuleContext(Const_Context.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public SExpressionContext sExpression() {
			return getRuleContext(SExpressionContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public WhileDoExpressionContext whileDoExpression() {
			return getRuleContext(WhileDoExpressionContext.class,0);
		}
		public DoWhileExpressionContext doWhileExpression() {
			return getRuleContext(DoWhileExpressionContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PrimaryContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary(Attr attr) throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState(), attr);
		enterRule(_localctx, 40, RULE_primary);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(295);
				((PrimaryContext)_localctx).const_ = const_();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).const_.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(299);
				((PrimaryContext)_localctx).stringLiteral = stringLiteral();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).stringLiteral.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(303);
				((PrimaryContext)_localctx).charLiteral = charLiteral();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).charLiteral.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				((PrimaryContext)_localctx).varRef = varRef(attr);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).varRef.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(310);
				match(T__25);
				 ((PrimaryContext)_localctx).result =  new LongLiteralNode(1); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(312);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(313);
				match(T__26);
				 ((PrimaryContext)_localctx).result =  new LongLiteralNode(0); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(315);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(316);
				match(T__27);
				 ((PrimaryContext)_localctx).result =  new SkipNode(); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(318);
				match(T__5);
				setState(319);
				((PrimaryContext)_localctx).scopeExpression = scopeExpression(attr, true);
				setState(320);
				match(T__6);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).scopeExpression.result; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(323);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(324);
				((PrimaryContext)_localctx).arrayExpression = arrayExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).arrayExpression.result; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(327);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(328);
				((PrimaryContext)_localctx).sExpression = sExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).sExpression.result; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(331);
				((PrimaryContext)_localctx).ifExpression = ifExpression(attr);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).ifExpression.result; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(334);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(335);
				((PrimaryContext)_localctx).whileDoExpression = whileDoExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).whileDoExpression.result; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(338);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(339);
				((PrimaryContext)_localctx).doWhileExpression = doWhileExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).doWhileExpression.result; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(342);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(343);
				((PrimaryContext)_localctx).forExpression = forExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).forExpression.result; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(346);
				((PrimaryContext)_localctx).caseExpression = caseExpression(attr);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).caseExpression.result; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Const_Context extends ParserRuleContext {
		public LongLiteralNode result;
		public Token minus;
		public Token DECIMAL;
		public TerminalNode DECIMAL() { return getToken(LamaLanguageParser.DECIMAL, 0); }
		public Const_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_; }
	}

	public final Const_Context const_() throws RecognitionException {
		Const_Context _localctx = new Const_Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_const_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(351);
				((Const_Context)_localctx).minus = match(T__18);
				}
			}

			setState(354);
			((Const_Context)_localctx).DECIMAL = match(DECIMAL);

			    long value = Long.parseLong(((Const_Context)_localctx).DECIMAL.getText());
			    if (((Const_Context)_localctx).minus != null)
			      value = -value;
			    ((Const_Context)_localctx).result =  new LongLiteralNode(value);
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public StringLiteralNode result;
		public Token STRING;
		public TerminalNode STRING() { return getToken(LamaLanguageParser.STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			((StringLiteralContext)_localctx).STRING = match(STRING);
			 ((StringLiteralContext)_localctx).result =  factory.createStringLiteral(((StringLiteralContext)_localctx).STRING); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharLiteralContext extends ParserRuleContext {
		public LongLiteralNode result;
		public Token CHAR;
		public TerminalNode CHAR() { return getToken(LamaLanguageParser.CHAR, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_charLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			((CharLiteralContext)_localctx).CHAR = match(CHAR);
			 ((CharLiteralContext)_localctx).result =  factory.createCharLiteral(((CharLiteralContext)_localctx).CHAR); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarRefContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public Token LIDENT;
		public TerminalNode LIDENT() { return getToken(LamaLanguageParser.LIDENT, 0); }
		public VarRefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarRefContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_varRef; }
	}

	public final VarRefContext varRef(Attr attr) throws RecognitionException {
		VarRefContext _localctx = new VarRefContext(_ctx, getState(), attr);
		enterRule(_localctx, 48, RULE_varRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			((VarRefContext)_localctx).LIDENT = match(LIDENT);

			    ExprNode refNode = factory.createVarRef(((VarRefContext)_localctx).LIDENT);
			    if (attr == Attr.REF)
			      ((VarRefContext)_localctx).result =  refNode;
			    else
			      ((VarRefContext)_localctx).result =  factory.createVarRead(refNode);
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpressionContext extends ParserRuleContext {
		public ArrayExprNode result;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression; }
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<ExprNode> elements = new ArrayList<>(); 
			setState(367);
			match(T__22);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(368);
				((ArrayExpressionContext)_localctx).expression = expression(Attr.VAL);
				 elements.add(((ArrayExpressionContext)_localctx).expression.result); 
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(370);
					match(T__2);
					setState(371);
					((ArrayExpressionContext)_localctx).expression = expression(Attr.VAL);
					 elements.add(((ArrayExpressionContext)_localctx).expression.result); 
					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(381);
			match(T__23);
			 ((ArrayExpressionContext)_localctx).result =  factory.createArrayExpr(elements); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SExpressionContext extends ParserRuleContext {
		public SexpNode result;
		public Token UIDENT;
		public ExpressionContext expression;
		public TerminalNode UIDENT() { return getToken(LamaLanguageParser.UIDENT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sExpression; }
	}

	public final SExpressionContext sExpression() throws RecognitionException {
		SExpressionContext _localctx = new SExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<ExprNode> elementNodes = new ArrayList<>(); 
			setState(385);
			((SExpressionContext)_localctx).UIDENT = match(UIDENT);
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(386);
				match(T__5);
				setState(387);
				((SExpressionContext)_localctx).expression = expression(Attr.VAL);
				 elementNodes.add(((SExpressionContext)_localctx).expression.result); 
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(389);
					match(T__2);
					setState(390);
					((SExpressionContext)_localctx).expression = expression(Attr.VAL);
					 elementNodes.add(((SExpressionContext)_localctx).expression.result); 
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(398);
				match(T__6);
				}
				break;
			}
			 ((SExpressionContext)_localctx).result =  factory.createSexp(((SExpressionContext)_localctx).UIDENT, elementNodes); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfExpressionContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public ExpressionContext cond;
		public ExpressionContext thenBody;
		public ElseBranchContext elseBranch;
		public ElseBranchContext elseBranch() {
			return getRuleContext(ElseBranchContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IfExpressionContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
	}

	public final IfExpressionContext ifExpression(Attr attr) throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState(), attr);
		enterRule(_localctx, 54, RULE_ifExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			    List<IfThenEntry> ifThenEntries = new ArrayList<>();
			  
			setState(405);
			match(T__28);
			setState(406);
			((IfExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(407);
			match(T__29);
			setState(408);
			((IfExpressionContext)_localctx).thenBody = expression(attr);

			    ifThenEntries.add(new IfThenEntry(((IfExpressionContext)_localctx).cond.result, ((IfExpressionContext)_localctx).thenBody.result));
			  
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410);
					match(T__30);
					setState(411);
					((IfExpressionContext)_localctx).cond = expression(Attr.VAL);
					setState(412);
					match(T__29);
					setState(413);
					((IfExpressionContext)_localctx).thenBody = expression(attr);

					      ifThenEntries.add(new IfThenEntry(((IfExpressionContext)_localctx).cond.result, ((IfExpressionContext)_localctx).thenBody.result));
					    
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(421);
			((IfExpressionContext)_localctx).elseBranch = elseBranch(attr);
			setState(422);
			match(T__31);

			    ((IfExpressionContext)_localctx).result =  factory.createIf(ifThenEntries, ((IfExpressionContext)_localctx).elseBranch.result);
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseBranchContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElseBranchContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElseBranchContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_elseBranch; }
	}

	public final ElseBranchContext elseBranch(Attr attr) throws RecognitionException {
		ElseBranchContext _localctx = new ElseBranchContext(_ctx, getState(), attr);
		enterRule(_localctx, 56, RULE_elseBranch);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(T__32);
				setState(426);
				((ElseBranchContext)_localctx).expression = expression(attr);

				    ((ElseBranchContext)_localctx).result =  ((ElseBranchContext)_localctx).expression.result;
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				 ((ElseBranchContext)_localctx).result =  null; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileDoExpressionContext extends ParserRuleContext {
		public ExprNode result;
		public ExpressionContext cond;
		public ScopeExpressionContext body;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public WhileDoExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDoExpression; }
	}

	public final WhileDoExpressionContext whileDoExpression() throws RecognitionException {
		WhileDoExpressionContext _localctx = new WhileDoExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whileDoExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(T__33);
			setState(434);
			((WhileDoExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(435);
			match(T__34);
			setState(436);
			((WhileDoExpressionContext)_localctx).body = scopeExpression(Attr.VOID, true);
			setState(437);
			match(T__35);

			    ((WhileDoExpressionContext)_localctx).result =  factory.createWhile(((WhileDoExpressionContext)_localctx).cond.result, ((WhileDoExpressionContext)_localctx).body.result);
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileExpressionContext extends ParserRuleContext {
		public ExprNode result;
		public ScopeExpressionContext body;
		public ExpressionContext cond;
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileExpression; }
	}

	public final DoWhileExpressionContext doWhileExpression() throws RecognitionException {
		DoWhileExpressionContext _localctx = new DoWhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_doWhileExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(T__34);
			setState(441);
			((DoWhileExpressionContext)_localctx).body = scopeExpression(Attr.VOID, false);
			setState(442);
			match(T__33);
			setState(443);
			((DoWhileExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(444);
			match(T__35);

			    factory.popScope();
			    ((DoWhileExpressionContext)_localctx).result =  new SeqNode(((DoWhileExpressionContext)_localctx).body.result, factory.createWhile(((DoWhileExpressionContext)_localctx).cond.result, ((DoWhileExpressionContext)_localctx).body.result));
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForExpressionContext extends ParserRuleContext {
		public ExprNode result;
		public ScopeExpressionContext init;
		public ExpressionContext cond;
		public ExpressionContext incr;
		public ScopeExpressionContext body;
		public List<ScopeExpressionContext> scopeExpression() {
			return getRuleContexts(ScopeExpressionContext.class);
		}
		public ScopeExpressionContext scopeExpression(int i) {
			return getRuleContext(ScopeExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__36);
			setState(448);
			((ForExpressionContext)_localctx).init = scopeExpression(Attr.VOID, false);
			setState(449);
			match(T__2);
			setState(450);
			((ForExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(451);
			match(T__2);
			setState(452);
			((ForExpressionContext)_localctx).incr = expression(Attr.VOID);
			setState(453);
			match(T__34);
			setState(454);
			((ForExpressionContext)_localctx).body = scopeExpression(Attr.VOID, true);
			setState(455);
			match(T__35);

			    factory.popScope();
			    ((ForExpressionContext)_localctx).result =  new SeqNode(
			      ((ForExpressionContext)_localctx).init.result,
			      factory.createWhile(
			        ((ForExpressionContext)_localctx).cond.result,
			        new SeqNode(((ForExpressionContext)_localctx).body.result, ((ForExpressionContext)_localctx).incr.result)
			      )
			    );
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseExpressionContext extends ParserRuleContext {
		public Attr attr;
		public CaseNode result;
		public ExpressionContext scrutinee;
		public CaseBranchesContext caseBranches;
		public CaseBranchesContext caseBranches() {
			return getRuleContext(CaseBranchesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CaseExpressionContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
	}

	public final CaseExpressionContext caseExpression(Attr attr) throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState(), attr);
		enterRule(_localctx, 64, RULE_caseExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(T__37);
			setState(459);
			((CaseExpressionContext)_localctx).scrutinee = expression(Attr.VAL);
			setState(460);
			match(T__38);
			setState(461);
			((CaseExpressionContext)_localctx).caseBranches = caseBranches(attr);
			setState(462);
			match(T__39);

			    ((CaseExpressionContext)_localctx).result =  factory.createCase(((CaseExpressionContext)_localctx).scrutinee.result, ((CaseExpressionContext)_localctx).caseBranches.result);
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseBranchesContext extends ParserRuleContext {
		public Attr attr;
		public List<CaseNode.Branch> result;
		public CaseBranchContext caseBranch;
		public List<CaseBranchContext> caseBranch() {
			return getRuleContexts(CaseBranchContext.class);
		}
		public CaseBranchContext caseBranch(int i) {
			return getRuleContext(CaseBranchContext.class,i);
		}
		public CaseBranchesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CaseBranchesContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_caseBranches; }
	}

	public final CaseBranchesContext caseBranches(Attr attr) throws RecognitionException {
		CaseBranchesContext _localctx = new CaseBranchesContext(_ctx, getState(), attr);
		enterRule(_localctx, 66, RULE_caseBranches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((CaseBranchesContext)_localctx).result =  new ArrayList<CaseNode.Branch>(); 
			setState(466);
			((CaseBranchesContext)_localctx).caseBranch = caseBranch(attr);
			 _localctx.result.add(((CaseBranchesContext)_localctx).caseBranch.result); 
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(468);
				match(T__40);
				setState(469);
				((CaseBranchesContext)_localctx).caseBranch = caseBranch(attr);
				 _localctx.result.add(((CaseBranchesContext)_localctx).caseBranch.result); 
				}
				}
				setState(476);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseBranchContext extends ParserRuleContext {
		public Attr attr;
		public CaseNode.Branch result;
		public PatternContext pattern;
		public ScopeExpressionContext scopeExpression;
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public CaseBranchContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CaseBranchContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_caseBranch; }
	}

	public final CaseBranchContext caseBranch(Attr attr) throws RecognitionException {
		CaseBranchContext _localctx = new CaseBranchContext(_ctx, getState(), attr);
		enterRule(_localctx, 68, RULE_caseBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			((CaseBranchContext)_localctx).pattern = pattern();
			setState(478);
			match(T__41);
			setState(479);
			((CaseBranchContext)_localctx).scopeExpression = scopeExpression(attr, true);

			    ((CaseBranchContext)_localctx).result =  new CaseNode.Branch(((CaseBranchContext)_localctx).pattern.result, ((CaseBranchContext)_localctx).scopeExpression.result);
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public PatternNode result;
		public SimplePatternContext simplePattern;
		public SimplePatternContext simplePattern() {
			return getRuleContext(SimplePatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			((PatternContext)_localctx).simplePattern = simplePattern();
			 ((PatternContext)_localctx).result =  ((PatternContext)_localctx).simplePattern.result; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimplePatternContext extends ParserRuleContext {
		public PatternNode result;
		public WildcardPatternContext wildcardPattern;
		public SexpPatternContext sexpPattern;
		public WildcardPatternContext wildcardPattern() {
			return getRuleContext(WildcardPatternContext.class,0);
		}
		public SexpPatternContext sexpPattern() {
			return getRuleContext(SexpPatternContext.class,0);
		}
		public SimplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePattern; }
	}

	public final SimplePatternContext simplePattern() throws RecognitionException {
		SimplePatternContext _localctx = new SimplePatternContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_simplePattern);
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				((SimplePatternContext)_localctx).wildcardPattern = wildcardPattern();
				 ((SimplePatternContext)_localctx).result =  ((SimplePatternContext)_localctx).wildcardPattern.result; 
				}
				break;
			case UIDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				((SimplePatternContext)_localctx).sexpPattern = sexpPattern();
				 ((SimplePatternContext)_localctx).result =  ((SimplePatternContext)_localctx).sexpPattern.result; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class WildcardPatternContext extends ParserRuleContext {
		public PatternNode result;
		public WildcardPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardPattern; }
	}

	public final WildcardPatternContext wildcardPattern() throws RecognitionException {
		WildcardPatternContext _localctx = new WildcardPatternContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(T__42);
			 ((WildcardPatternContext)_localctx).result =  new WildcardPatternNode(); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SexpPatternContext extends ParserRuleContext {
		public PatternNode result;
		public Token UIDENT;
		public PatternContext pattern;
		public TerminalNode UIDENT() { return getToken(LamaLanguageParser.UIDENT, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public SexpPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexpPattern; }
	}

	public final SexpPatternContext sexpPattern() throws RecognitionException {
		SexpPatternContext _localctx = new SexpPatternContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sexpPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<PatternNode> subpatterns = new ArrayList<>(); 
			setState(497);
			((SexpPatternContext)_localctx).UIDENT = match(UIDENT);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(498);
				match(T__5);
				setState(499);
				((SexpPatternContext)_localctx).pattern = pattern();
				 subpatterns.add(((SexpPatternContext)_localctx).pattern.result); 
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(501);
					match(T__2);
					setState(502);
					((SexpPatternContext)_localctx).pattern = pattern();
					 subpatterns.add(((SexpPatternContext)_localctx).pattern.result); 
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(510);
				match(T__6);
				}
			}

			 ((SexpPatternContext)_localctx).result =  factory.createSexpPattern(((SexpPatternContext)_localctx).UIDENT, subpatterns); 
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
		case 12:
			return maybeAssignment_sempred((MaybeAssignmentContext)_localctx, predIndex);
		case 14:
			return maybeCmp_sempred((MaybeCmpContext)_localctx, predIndex);
		case 15:
			return maybeAddSub_sempred((MaybeAddSubContext)_localctx, predIndex);
		case 16:
			return maybeMulDivRem_sempred((MaybeMulDivRemContext)_localctx, predIndex);
		case 19:
			return postfixItem_sempred((PostfixItemContext)_localctx, predIndex);
		case 20:
			return primary_sempred((PrimaryContext)_localctx, predIndex);
		case 28:
			return elseBranch_sempred((ElseBranchContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean maybeAssignment_sempred(MaybeAssignmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean maybeCmp_sempred(MaybeCmpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean maybeAddSub_sempred(MaybeAddSubContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean maybeMulDivRem_sempred(MaybeMulDivRemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean postfixItem_sempred(PostfixItemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return _localctx.attr != Attr.REF;
		case 5:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean primary_sempred(PrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return _localctx.attr != Attr.REF;
		case 7:
			return _localctx.attr != Attr.REF;
		case 8:
			return _localctx.attr != Attr.REF;
		case 9:
			return _localctx.attr != Attr.REF;
		case 10:
			return _localctx.attr != Attr.REF;
		case 11:
			return _localctx.attr == Attr.VOID;
		case 12:
			return _localctx.attr != Attr.REF;
		case 13:
			return _localctx.attr != Attr.REF;
		case 14:
			return _localctx.attr == Attr.VOID;
		case 15:
			return _localctx.attr == Attr.VOID;
		case 16:
			return _localctx.attr == Attr.VOID;
		}
		return true;
	}
	private boolean elseBranch_sempred(ElseBranchContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return _localctx.attr == Attr.VOID;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u0205\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0005\u0002X\b\u0002\n\u0002\f\u0002[\t\u0002\u0001\u0002"+
		"\u0003\u0002^\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0003\u0003d\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005m\b\u0005\n\u0005\f\u0005"+
		"p\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006u\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0087\b\b\n\b\f\b\u008a\t\b\u0003"+
		"\b\u008c\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0099\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00a7\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0004\r\u00b2\b\r\u000b\r\f\r\u00b3\u0003\r"+
		"\u00b6\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c1\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00cd\b\u000f"+
		"\u000b\u000f\f\u000f\u00ce\u0003\u000f\u00d1\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00dd\b\u0010\u000b\u0010\f"+
		"\u0010\u00de\u0003\u0010\u00e1\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00ee\b\u0012\n\u0012\f\u0012\u00f1"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00f6\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0106\b\u0013\n\u0013\f\u0013\u0109"+
		"\t\u0013\u0003\u0013\u010b\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u011a\b\u0013"+
		"\n\u0013\f\u0013\u011d\t\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0121"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0125\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u015e\b\u0014\u0001\u0015\u0003\u0015\u0161\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u0177\b\u0019\n\u0019\f\u0019\u017a\t\u0019"+
		"\u0003\u0019\u017c\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u018a\b\u001a\n\u001a\f\u001a\u018d"+
		"\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0191\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u01a1\b\u001b\n\u001b\f\u001b\u01a4\t\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01b0\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!"+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u01d9\b!\n!\f!\u01dc\t!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0003$\u01ec\b$\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u01fa"+
		"\b&\n&\f&\u01fd\t&\u0001&\u0001&\u0003&\u0201\b&\u0001&\u0001&\u0001&"+
		"\u0000\u0000\'\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJL\u0000\u0003\u0001\u0000"+
		"\f\u0011\u0001\u0000\u0012\u0013\u0001\u0000\u0014\u0016\u020e\u0000N"+
		"\u0001\u0000\u0000\u0000\u0002R\u0001\u0000\u0000\u0000\u0004Y\u0001\u0000"+
		"\u0000\u0000\u0006c\u0001\u0000\u0000\u0000\be\u0001\u0000\u0000\u0000"+
		"\ni\u0001\u0000\u0000\u0000\fq\u0001\u0000\u0000\u0000\u000ex\u0001\u0000"+
		"\u0000\u0000\u0010\u008b\u0001\u0000\u0000\u0000\u0012\u008d\u0001\u0000"+
		"\u0000\u0000\u0014\u0098\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000"+
		"\u0000\u0000\u0018\u00a6\u0001\u0000\u0000\u0000\u001a\u00b5\u0001\u0000"+
		"\u0000\u0000\u001c\u00c0\u0001\u0000\u0000\u0000\u001e\u00d0\u0001\u0000"+
		"\u0000\u0000 \u00e0\u0001\u0000\u0000\u0000\"\u00e2\u0001\u0000\u0000"+
		"\u0000$\u00f5\u0001\u0000\u0000\u0000&\u0124\u0001\u0000\u0000\u0000("+
		"\u015d\u0001\u0000\u0000\u0000*\u0160\u0001\u0000\u0000\u0000,\u0165\u0001"+
		"\u0000\u0000\u0000.\u0168\u0001\u0000\u0000\u00000\u016b\u0001\u0000\u0000"+
		"\u00002\u016e\u0001\u0000\u0000\u00004\u0180\u0001\u0000\u0000\u00006"+
		"\u0194\u0001\u0000\u0000\u00008\u01af\u0001\u0000\u0000\u0000:\u01b1\u0001"+
		"\u0000\u0000\u0000<\u01b8\u0001\u0000\u0000\u0000>\u01bf\u0001\u0000\u0000"+
		"\u0000@\u01ca\u0001\u0000\u0000\u0000B\u01d1\u0001\u0000\u0000\u0000D"+
		"\u01dd\u0001\u0000\u0000\u0000F\u01e2\u0001\u0000\u0000\u0000H\u01eb\u0001"+
		"\u0000\u0000\u0000J\u01ed\u0001\u0000\u0000\u0000L\u01f0\u0001\u0000\u0000"+
		"\u0000NO\u0003\u0002\u0001\u0000OP\u0006\u0000\uffff\uffff\u0000PQ\u0005"+
		"\u0000\u0000\u0001Q\u0001\u0001\u0000\u0000\u0000RS\u0006\u0001\uffff"+
		"\uffff\u0000ST\u0003\u0004\u0002\u0000TU\u0006\u0001\uffff\uffff\u0000"+
		"U\u0003\u0001\u0000\u0000\u0000VX\u0003\u0006\u0003\u0000WV\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\^\u0003\u0014\n\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_`\u0006\u0002\uffff\uffff\u0000`\u0005"+
		"\u0001\u0000\u0000\u0000ad\u0003\b\u0004\u0000bd\u0003\u000e\u0007\u0000"+
		"ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000d\u0007\u0001\u0000"+
		"\u0000\u0000ef\u0005\u0001\u0000\u0000fg\u0003\n\u0005\u0000gh\u0005\u0002"+
		"\u0000\u0000h\t\u0001\u0000\u0000\u0000in\u0003\f\u0006\u0000jk\u0005"+
		"\u0003\u0000\u0000km\u0003\f\u0006\u0000lj\u0001\u0000\u0000\u0000mp\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"o\u000b\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qt\u00050\u0000"+
		"\u0000rs\u0005\u0004\u0000\u0000su\u0003\u0016\u000b\u0000tr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0006"+
		"\u0006\uffff\uffff\u0000w\r\u0001\u0000\u0000\u0000xy\u0005\u0005\u0000"+
		"\u0000yz\u00050\u0000\u0000z{\u0006\u0007\uffff\uffff\u0000{|\u0005\u0006"+
		"\u0000\u0000|}\u0003\u0010\b\u0000}~\u0005\u0007\u0000\u0000~\u007f\u0005"+
		"\b\u0000\u0000\u007f\u0080\u0003\u0004\u0002\u0000\u0080\u0081\u0005\t"+
		"\u0000\u0000\u0081\u0082\u0006\u0007\uffff\uffff\u0000\u0082\u000f\u0001"+
		"\u0000\u0000\u0000\u0083\u0088\u0003\u0012\t\u0000\u0084\u0085\u0005\u0003"+
		"\u0000\u0000\u0085\u0087\u0003\u0012\t\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u0083\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0011\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u00050\u0000\u0000\u008e\u008f\u0006\t\uffff\uffff"+
		"\u0000\u008f\u0013\u0001\u0000\u0000\u0000\u0090\u0091\u0003\u0016\u000b"+
		"\u0000\u0091\u0092\u0006\n\uffff\uffff\u0000\u0092\u0099\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0003\u0016\u000b\u0000\u0094\u0095\u0005\u0002\u0000"+
		"\u0000\u0095\u0096\u0003\u0014\n\u0000\u0096\u0097\u0006\n\uffff\uffff"+
		"\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0090\u0001\u0000\u0000"+
		"\u0000\u0098\u0093\u0001\u0000\u0000\u0000\u0099\u0015\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0003\u0018\f\u0000\u009b\u009c\u0006\u000b\uffff\uffff"+
		"\u0000\u009c\u0017\u0001\u0000\u0000\u0000\u009d\u009e\u0004\f\u0000\u0001"+
		"\u009e\u009f\u0003\u001a\r\u0000\u009f\u00a0\u0005\n\u0000\u0000\u00a0"+
		"\u00a1\u0003\u0018\f\u0000\u00a1\u00a2\u0006\f\uffff\uffff\u0000\u00a2"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003\u001a\r\u0000\u00a4\u00a5"+
		"\u0006\f\uffff\uffff\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u009d"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a7\u0019"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003\u001c\u000e\u0000\u00a9\u00aa"+
		"\u0006\r\uffff\uffff\u0000\u00aa\u00b6\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0003\u001c\u000e\u0000\u00ac\u00b1\u0006\r\uffff\uffff\u0000\u00ad\u00ae"+
		"\u0005\u000b\u0000\u0000\u00ae\u00af\u0003\u001c\u000e\u0000\u00af\u00b0"+
		"\u0006\r\uffff\uffff\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b5\u00a8\u0001\u0000\u0000\u0000\u00b5\u00ab"+
		"\u0001\u0000\u0000\u0000\u00b6\u001b\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0004\u000e\u0001\u0001\u00b8\u00b9\u0003\u001e\u000f\u0000\u00b9\u00ba"+
		"\u0007\u0000\u0000\u0000\u00ba\u00bb\u0003\u001e\u000f\u0000\u00bb\u00bc"+
		"\u0006\u000e\uffff\uffff\u0000\u00bc\u00c1\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0003\u001e\u000f\u0000\u00be\u00bf\u0006\u000e\uffff\uffff\u0000"+
		"\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00b7\u0001\u0000\u0000\u0000"+
		"\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c1\u001d\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0003 \u0010\u0000\u00c3\u00c4\u0006\u000f\uffff\uffff\u0000"+
		"\u00c4\u00d1\u0001\u0000\u0000\u0000\u00c5\u00c6\u0004\u000f\u0002\u0001"+
		"\u00c6\u00c7\u0003 \u0010\u0000\u00c7\u00cc\u0006\u000f\uffff\uffff\u0000"+
		"\u00c8\u00c9\u0007\u0001\u0000\u0000\u00c9\u00ca\u0003 \u0010\u0000\u00ca"+
		"\u00cb\u0006\u000f\uffff\uffff\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00c2\u0001\u0000\u0000\u0000"+
		"\u00d0\u00c5\u0001\u0000\u0000\u0000\u00d1\u001f\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0003\"\u0011\u0000\u00d3\u00d4\u0006\u0010\uffff\uffff\u0000"+
		"\u00d4\u00e1\u0001\u0000\u0000\u0000\u00d5\u00d6\u0004\u0010\u0003\u0001"+
		"\u00d6\u00d7\u0003\"\u0011\u0000\u00d7\u00dc\u0006\u0010\uffff\uffff\u0000"+
		"\u00d8\u00d9\u0007\u0002\u0000\u0000\u00d9\u00da\u0003\"\u0011\u0000\u00da"+
		"\u00db\u0006\u0010\uffff\uffff\u0000\u00db\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dc\u00d8\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00d2\u0001\u0000\u0000\u0000"+
		"\u00e0\u00d5\u0001\u0000\u0000\u0000\u00e1!\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0003$\u0012\u0000\u00e3\u00e4\u0006\u0011\uffff\uffff\u0000\u00e4"+
		"#\u0001\u0000\u0000\u0000\u00e5\u00e6\u0003(\u0014\u0000\u00e6\u00e7\u0006"+
		"\u0012\uffff\uffff\u0000\u00e7\u00f6\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0003(\u0014\u0000\u00e9\u00ef\u0006\u0012\uffff\uffff\u0000\u00ea\u00eb"+
		"\u0003&\u0013\u0000\u00eb\u00ec\u0006\u0012\uffff\uffff\u0000\u00ec\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ee\u00f1"+
		"\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003&\u0013\u0000\u00f3\u00f4\u0006"+
		"\u0012\uffff\uffff\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00e5"+
		"\u0001\u0000\u0000\u0000\u00f5\u00e8\u0001\u0000\u0000\u0000\u00f6%\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005\u0017\u0000\u0000\u00f8\u00f9\u0003"+
		"\u0014\n\u0000\u00f9\u00fa\u0005\u0018\u0000\u0000\u00fa\u00fb\u0006\u0013"+
		"\uffff\uffff\u0000\u00fb\u0125\u0001\u0000\u0000\u0000\u00fc\u00fd\u0004"+
		"\u0013\u0004\u0001\u00fd\u00fe\u0006\u0013\uffff\uffff\u0000\u00fe\u010a"+
		"\u0005\u0006\u0000\u0000\u00ff\u0100\u0003\u0014\n\u0000\u0100\u0107\u0006"+
		"\u0013\uffff\uffff\u0000\u0101\u0102\u0005\u0003\u0000\u0000\u0102\u0103"+
		"\u0003\u0014\n\u0000\u0103\u0104\u0006\u0013\uffff\uffff\u0000\u0104\u0106"+
		"\u0001\u0000\u0000\u0000\u0105\u0101\u0001\u0000\u0000\u0000\u0106\u0109"+
		"\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107"+
		"\u0001\u0000\u0000\u0000\u010a\u00ff\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0005\u0007\u0000\u0000\u010d\u0125\u0006\u0013\uffff\uffff\u0000\u010e"+
		"\u010f\u0004\u0013\u0005\u0001\u010f\u0110\u0006\u0013\uffff\uffff\u0000"+
		"\u0110\u0111\u0005\u0019\u0000\u0000\u0111\u0120\u00030\u0018\u0000\u0112"+
		"\u0113\u0005\u0006\u0000\u0000\u0113\u0114\u0003\u0014\n\u0000\u0114\u011b"+
		"\u0006\u0013\uffff\uffff\u0000\u0115\u0116\u0005\u0003\u0000\u0000\u0116"+
		"\u0117\u0003\u0014\n\u0000\u0117\u0118\u0006\u0013\uffff\uffff\u0000\u0118"+
		"\u011a\u0001\u0000\u0000\u0000\u0119\u0115\u0001\u0000\u0000\u0000\u011a"+
		"\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0001\u0000\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d"+
		"\u011b\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u0007\u0000\u0000\u011f"+
		"\u0121\u0001\u0000\u0000\u0000\u0120\u0112\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0006\u0013\uffff\uffff\u0000\u0123\u0125\u0001\u0000\u0000\u0000"+
		"\u0124\u00f7\u0001\u0000\u0000\u0000\u0124\u00fc\u0001\u0000\u0000\u0000"+
		"\u0124\u010e\u0001\u0000\u0000\u0000\u0125\'\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0004\u0014\u0006\u0001\u0127\u0128\u0003*\u0015\u0000\u0128\u0129"+
		"\u0006\u0014\uffff\uffff\u0000\u0129\u015e\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0004\u0014\u0007\u0001\u012b\u012c\u0003,\u0016\u0000\u012c\u012d"+
		"\u0006\u0014\uffff\uffff\u0000\u012d\u015e\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0004\u0014\b\u0001\u012f\u0130\u0003.\u0017\u0000\u0130\u0131"+
		"\u0006\u0014\uffff\uffff\u0000\u0131\u015e\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u00030\u0018\u0000\u0133\u0134\u0006\u0014\uffff\uffff\u0000\u0134"+
		"\u015e\u0001\u0000\u0000\u0000\u0135\u0136\u0004\u0014\t\u0001\u0136\u0137"+
		"\u0005\u001a\u0000\u0000\u0137\u015e\u0006\u0014\uffff\uffff\u0000\u0138"+
		"\u0139\u0004\u0014\n\u0001\u0139\u013a\u0005\u001b\u0000\u0000\u013a\u015e"+
		"\u0006\u0014\uffff\uffff\u0000\u013b\u013c\u0004\u0014\u000b\u0001\u013c"+
		"\u013d\u0005\u001c\u0000\u0000\u013d\u015e\u0006\u0014\uffff\uffff\u0000"+
		"\u013e\u013f\u0005\u0006\u0000\u0000\u013f\u0140\u0003\u0002\u0001\u0000"+
		"\u0140\u0141\u0005\u0007\u0000\u0000\u0141\u0142\u0006\u0014\uffff\uffff"+
		"\u0000\u0142\u015e\u0001\u0000\u0000\u0000\u0143\u0144\u0004\u0014\f\u0001"+
		"\u0144\u0145\u00032\u0019\u0000\u0145\u0146\u0006\u0014\uffff\uffff\u0000"+
		"\u0146\u015e\u0001\u0000\u0000\u0000\u0147\u0148\u0004\u0014\r\u0001\u0148"+
		"\u0149\u00034\u001a\u0000\u0149\u014a\u0006\u0014\uffff\uffff\u0000\u014a"+
		"\u015e\u0001\u0000\u0000\u0000\u014b\u014c\u00036\u001b\u0000\u014c\u014d"+
		"\u0006\u0014\uffff\uffff\u0000\u014d\u015e\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0004\u0014\u000e\u0001\u014f\u0150\u0003:\u001d\u0000\u0150\u0151"+
		"\u0006\u0014\uffff\uffff\u0000\u0151\u015e\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u0004\u0014\u000f\u0001\u0153\u0154\u0003<\u001e\u0000\u0154\u0155"+
		"\u0006\u0014\uffff\uffff\u0000\u0155\u015e\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0004\u0014\u0010\u0001\u0157\u0158\u0003>\u001f\u0000\u0158\u0159"+
		"\u0006\u0014\uffff\uffff\u0000\u0159\u015e\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0003@ \u0000\u015b\u015c\u0006\u0014\uffff\uffff\u0000\u015c\u015e"+
		"\u0001\u0000\u0000\u0000\u015d\u0126\u0001\u0000\u0000\u0000\u015d\u012a"+
		"\u0001\u0000\u0000\u0000\u015d\u012e\u0001\u0000\u0000\u0000\u015d\u0132"+
		"\u0001\u0000\u0000\u0000\u015d\u0135\u0001\u0000\u0000\u0000\u015d\u0138"+
		"\u0001\u0000\u0000\u0000\u015d\u013b\u0001\u0000\u0000\u0000\u015d\u013e"+
		"\u0001\u0000\u0000\u0000\u015d\u0143\u0001\u0000\u0000\u0000\u015d\u0147"+
		"\u0001\u0000\u0000\u0000\u015d\u014b\u0001\u0000\u0000\u0000\u015d\u014e"+
		"\u0001\u0000\u0000\u0000\u015d\u0152\u0001\u0000\u0000\u0000\u015d\u0156"+
		"\u0001\u0000\u0000\u0000\u015d\u015a\u0001\u0000\u0000\u0000\u015e)\u0001"+
		"\u0000\u0000\u0000\u015f\u0161\u0005\u0013\u0000\u0000\u0160\u015f\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u00051\u0000\u0000\u0163\u0164\u0006\u0015"+
		"\uffff\uffff\u0000\u0164+\u0001\u0000\u0000\u0000\u0165\u0166\u00052\u0000"+
		"\u0000\u0166\u0167\u0006\u0016\uffff\uffff\u0000\u0167-\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u00053\u0000\u0000\u0169\u016a\u0006\u0017\uffff\uffff"+
		"\u0000\u016a/\u0001\u0000\u0000\u0000\u016b\u016c\u00050\u0000\u0000\u016c"+
		"\u016d\u0006\u0018\uffff\uffff\u0000\u016d1\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0006\u0019\uffff\uffff\u0000\u016f\u017b\u0005\u0017\u0000\u0000"+
		"\u0170\u0171\u0003\u0014\n\u0000\u0171\u0178\u0006\u0019\uffff\uffff\u0000"+
		"\u0172\u0173\u0005\u0003\u0000\u0000\u0173\u0174\u0003\u0014\n\u0000\u0174"+
		"\u0175\u0006\u0019\uffff\uffff\u0000\u0175\u0177\u0001\u0000\u0000\u0000"+
		"\u0176\u0172\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000"+
		"\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000"+
		"\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000"+
		"\u017b\u0170\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e\u0005\u0018\u0000\u0000"+
		"\u017e\u017f\u0006\u0019\uffff\uffff\u0000\u017f3\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0006\u001a\uffff\uffff\u0000\u0181\u0190\u0005/\u0000\u0000"+
		"\u0182\u0183\u0005\u0006\u0000\u0000\u0183\u0184\u0003\u0014\n\u0000\u0184"+
		"\u018b\u0006\u001a\uffff\uffff\u0000\u0185\u0186\u0005\u0003\u0000\u0000"+
		"\u0186\u0187\u0003\u0014\n\u0000\u0187\u0188\u0006\u001a\uffff\uffff\u0000"+
		"\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u0185\u0001\u0000\u0000\u0000"+
		"\u018a\u018d\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018e\u0001\u0000\u0000\u0000"+
		"\u018d\u018b\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u0007\u0000\u0000"+
		"\u018f\u0191\u0001\u0000\u0000\u0000\u0190\u0182\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000"+
		"\u0192\u0193\u0006\u001a\uffff\uffff\u0000\u01935\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0006\u001b\uffff\uffff\u0000\u0195\u0196\u0005\u001d\u0000"+
		"\u0000\u0196\u0197\u0003\u0014\n\u0000\u0197\u0198\u0005\u001e\u0000\u0000"+
		"\u0198\u0199\u0003\u0014\n\u0000\u0199\u01a2\u0006\u001b\uffff\uffff\u0000"+
		"\u019a\u019b\u0005\u001f\u0000\u0000\u019b\u019c\u0003\u0014\n\u0000\u019c"+
		"\u019d\u0005\u001e\u0000\u0000\u019d\u019e\u0003\u0014\n\u0000\u019e\u019f"+
		"\u0006\u001b\uffff\uffff\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0"+
		"\u019a\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u00038\u001c\u0000\u01a6\u01a7\u0005 \u0000\u0000\u01a7\u01a8\u0006"+
		"\u001b\uffff\uffff\u0000\u01a87\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005"+
		"!\u0000\u0000\u01aa\u01ab\u0003\u0014\n\u0000\u01ab\u01ac\u0006\u001c"+
		"\uffff\uffff\u0000\u01ac\u01b0\u0001\u0000\u0000\u0000\u01ad\u01ae\u0004"+
		"\u001c\u0011\u0001\u01ae\u01b0\u0006\u001c\uffff\uffff\u0000\u01af\u01a9"+
		"\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b09\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0005\"\u0000\u0000\u01b2\u01b3\u0003\u0014"+
		"\n\u0000\u01b3\u01b4\u0005#\u0000\u0000\u01b4\u01b5\u0003\u0002\u0001"+
		"\u0000\u01b5\u01b6\u0005$\u0000\u0000\u01b6\u01b7\u0006\u001d\uffff\uffff"+
		"\u0000\u01b7;\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005#\u0000\u0000\u01b9"+
		"\u01ba\u0003\u0002\u0001\u0000\u01ba\u01bb\u0005\"\u0000\u0000\u01bb\u01bc"+
		"\u0003\u0014\n\u0000\u01bc\u01bd\u0005$\u0000\u0000\u01bd\u01be\u0006"+
		"\u001e\uffff\uffff\u0000\u01be=\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005"+
		"%\u0000\u0000\u01c0\u01c1\u0003\u0002\u0001\u0000\u01c1\u01c2\u0005\u0003"+
		"\u0000\u0000\u01c2\u01c3\u0003\u0014\n\u0000\u01c3\u01c4\u0005\u0003\u0000"+
		"\u0000\u01c4\u01c5\u0003\u0014\n\u0000\u01c5\u01c6\u0005#\u0000\u0000"+
		"\u01c6\u01c7\u0003\u0002\u0001\u0000\u01c7\u01c8\u0005$\u0000\u0000\u01c8"+
		"\u01c9\u0006\u001f\uffff\uffff\u0000\u01c9?\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0005&\u0000\u0000\u01cb\u01cc\u0003\u0014\n\u0000\u01cc\u01cd"+
		"\u0005\'\u0000\u0000\u01cd\u01ce\u0003B!\u0000\u01ce\u01cf\u0005(\u0000"+
		"\u0000\u01cf\u01d0\u0006 \uffff\uffff\u0000\u01d0A\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0006!\uffff\uffff\u0000\u01d2\u01d3\u0003D\"\u0000\u01d3"+
		"\u01da\u0006!\uffff\uffff\u0000\u01d4\u01d5\u0005)\u0000\u0000\u01d5\u01d6"+
		"\u0003D\"\u0000\u01d6\u01d7\u0006!\uffff\uffff\u0000\u01d7\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d4\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001"+
		"\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001"+
		"\u0000\u0000\u0000\u01dbC\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000"+
		"\u0000\u0000\u01dd\u01de\u0003F#\u0000\u01de\u01df\u0005*\u0000\u0000"+
		"\u01df\u01e0\u0003\u0002\u0001\u0000\u01e0\u01e1\u0006\"\uffff\uffff\u0000"+
		"\u01e1E\u0001\u0000\u0000\u0000\u01e2\u01e3\u0003H$\u0000\u01e3\u01e4"+
		"\u0006#\uffff\uffff\u0000\u01e4G\u0001\u0000\u0000\u0000\u01e5\u01e6\u0003"+
		"J%\u0000\u01e6\u01e7\u0006$\uffff\uffff\u0000\u01e7\u01ec\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e9\u0003L&\u0000\u01e9\u01ea\u0006$\uffff\uffff"+
		"\u0000\u01ea\u01ec\u0001\u0000\u0000\u0000\u01eb\u01e5\u0001\u0000\u0000"+
		"\u0000\u01eb\u01e8\u0001\u0000\u0000\u0000\u01ecI\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ee\u0005+\u0000\u0000\u01ee\u01ef\u0006%\uffff\uffff\u0000\u01ef"+
		"K\u0001\u0000\u0000\u0000\u01f0\u01f1\u0006&\uffff\uffff\u0000\u01f1\u0200"+
		"\u0005/\u0000\u0000\u01f2\u01f3\u0005\u0006\u0000\u0000\u01f3\u01f4\u0003"+
		"F#\u0000\u01f4\u01fb\u0006&\uffff\uffff\u0000\u01f5\u01f6\u0005\u0003"+
		"\u0000\u0000\u01f6\u01f7\u0003F#\u0000\u01f7\u01f8\u0006&\uffff\uffff"+
		"\u0000\u01f8\u01fa\u0001\u0000\u0000\u0000\u01f9\u01f5\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005\u0007\u0000"+
		"\u0000\u01ff\u0201\u0001\u0000\u0000\u0000\u0200\u01f2\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0006&\uffff\uffff\u0000\u0203M\u0001\u0000\u0000\u0000"+
		"#Y]cnt\u0088\u008b\u0098\u00a6\u00b3\u00b5\u00c0\u00ce\u00d0\u00de\u00e0"+
		"\u00ef\u00f5\u0107\u010a\u011b\u0120\u0124\u015d\u0160\u0178\u017b\u018b"+
		"\u0190\u01a2\u01af\u01da\u01eb\u01fb\u0200";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}