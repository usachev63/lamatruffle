// Generated from ./lamalanguage/src/main/java/ru/usachev63/lamatruffle/parser/LamaLanguage.g4 by ANTLR 4.13.2
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, WS=52, COMMENT=53, 
		LINE_COMMENT=54, UIDENT=55, LIDENT=56, DECIMAL=57, STRING=58, CHAR=59;
	public static final int
		RULE_lama = 0, RULE_scopeExpression = 1, RULE_scopeExpressionNoStart = 2, 
		RULE_definition = 3, RULE_variableDefinition = 4, RULE_variableDefinitionSequence = 5, 
		RULE_variableDefinitionItem = 6, RULE_functionDefinition = 7, RULE_functionParameters = 8, 
		RULE_functionParameter = 9, RULE_expression = 10, RULE_basicExpression = 11, 
		RULE_maybeAssignment = 12, RULE_maybeCons = 13, RULE_maybeDisjunction = 14, 
		RULE_maybeConjunction = 15, RULE_maybeCmp = 16, RULE_maybeAddSub = 17, 
		RULE_maybeMulDivRem = 18, RULE_binaryOperand = 19, RULE_postfixExpression = 20, 
		RULE_postfixItem = 21, RULE_primary = 22, RULE_const_ = 23, RULE_varRef = 24, 
		RULE_anonFunction = 25, RULE_arrayExpression = 26, RULE_listExpression = 27, 
		RULE_sExpression = 28, RULE_ifExpression = 29, RULE_elseBranch = 30, RULE_whileDoExpression = 31, 
		RULE_doWhileExpression = 32, RULE_forExpression = 33, RULE_caseExpression = 34, 
		RULE_caseBranches = 35, RULE_caseBranch = 36, RULE_pattern = 37, RULE_consPattern = 38, 
		RULE_simplePattern = 39, RULE_wildcardPattern = 40, RULE_sexpPattern = 41, 
		RULE_arrayPattern = 42, RULE_listPattern = 43, RULE_bindingPattern = 44, 
		RULE_longLiteralPattern = 45, RULE_longLiteral = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"lama", "scopeExpression", "scopeExpressionNoStart", "definition", "variableDefinition", 
			"variableDefinitionSequence", "variableDefinitionItem", "functionDefinition", 
			"functionParameters", "functionParameter", "expression", "basicExpression", 
			"maybeAssignment", "maybeCons", "maybeDisjunction", "maybeConjunction", 
			"maybeCmp", "maybeAddSub", "maybeMulDivRem", "binaryOperand", "postfixExpression", 
			"postfixItem", "primary", "const_", "varRef", "anonFunction", "arrayExpression", 
			"listExpression", "sExpression", "ifExpression", "elseBranch", "whileDoExpression", 
			"doWhileExpression", "forExpression", "caseExpression", "caseBranches", 
			"caseBranch", "pattern", "consPattern", "simplePattern", "wildcardPattern", 
			"sexpPattern", "arrayPattern", "listPattern", "bindingPattern", "longLiteralPattern", 
			"longLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "';'", "','", "'='", "'fun'", "'('", "')'", "'{'", "'}'", 
			"':='", "':'", "'!!'", "'&&'", "'=='", "'!='", "'<='", "'<'", "'>='", 
			"'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'['", "']'", "'.'", "'true'", 
			"'false'", "'skip'", "'if'", "'then'", "'elif'", "'fi'", "'else'", "'while'", 
			"'do'", "'od'", "'for'", "'case'", "'of'", "'esac'", "'|'", "'->'", "'#'", 
			"'val'", "'str'", "'array'", "'sexp'", "'_'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "WS", "COMMENT", "LINE_COMMENT", "UIDENT", "LIDENT", 
			"DECIMAL", "STRING", "CHAR"
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
	    parser.setBuildParseTree(false);
	    lexer.removeErrorListeners();
	    parser.removeErrorListeners();
	    BailoutErrorListener listener = new BailoutErrorListener(source);
	    lexer.addErrorListener(listener);
	    parser.addErrorListener(listener);
	    parser.factory = new LamaNodeFactory(language);
	    parser.lama();
		parser.factory.getMain().adoptChildren();
	    parser.factory.resolveAll();
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
		public ScopeExpressionNoStartContext scopeExpressionNoStart;
		public ScopeExpressionNoStartContext scopeExpressionNoStart() {
			return getRuleContext(ScopeExpressionNoStartContext.class,0);
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
			setState(94);
			((LamaContext)_localctx).scopeExpressionNoStart = scopeExpressionNoStart(Attr.VOID, true);

			    factory.createMain(((LamaContext)_localctx).scopeExpressionNoStart.result);
			  
			setState(96);
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
			setState(99);
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
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					definition();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(108);
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
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				variableDefinition();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
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
			setState(117);
			match(T__0);
			setState(118);
			variableDefinitionSequence();
			setState(119);
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
			setState(121);
			variableDefinitionItem();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(122);
				match(T__2);
				setState(123);
				variableDefinitionItem();
				}
				}
				setState(128);
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
			setState(129);
			((VariableDefinitionItemContext)_localctx).LIDENT = match(LIDENT);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(130);
				match(T__3);
				setState(131);
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
			setState(136);
			match(T__4);
			setState(137);
			((FunctionDefinitionContext)_localctx).LIDENT = match(LIDENT);
			 factory.startFrame(((FunctionDefinitionContext)_localctx).LIDENT); 
			setState(139);
			match(T__5);
			setState(140);
			functionParameters();
			setState(141);
			match(T__6);
			setState(142);
			match(T__7);
			setState(143);
			((FunctionDefinitionContext)_localctx).body = scopeExpressionNoStart(Attr.VOID, true);
			setState(144);
			match(T__8);
			 factory.finishFuncDecl(((FunctionDefinitionContext)_localctx).body.result); 
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
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIDENT) {
				{
				setState(147);
				functionParameter();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(148);
					match(T__2);
					setState(149);
					functionParameter();
					}
					}
					setState(154);
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
			setState(157);
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				((ExpressionContext)_localctx).basicExpression = basicExpression(attr);
				 ((ExpressionContext)_localctx).result =  ((ExpressionContext)_localctx).basicExpression.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				((ExpressionContext)_localctx).basicExpression = basicExpression(Attr.VOID);
				setState(164);
				match(T__1);
				setState(165);
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
			setState(170);
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
		public MaybeConsContext lhs;
		public MaybeAssignmentContext rhs;
		public MaybeConsContext maybeCons;
		public MaybeConsContext maybeCons() {
			return getRuleContext(MaybeConsContext.class,0);
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
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(174);
				((MaybeAssignmentContext)_localctx).lhs = maybeCons(Attr.REF);
				setState(175);
				match(T__9);
				setState(176);
				((MaybeAssignmentContext)_localctx).rhs = maybeAssignment(Attr.VAL);

				    ((MaybeAssignmentContext)_localctx).result =  GenericAssnNodeGen.create(((MaybeAssignmentContext)_localctx).lhs.result, ((MaybeAssignmentContext)_localctx).rhs.result);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				((MaybeAssignmentContext)_localctx).maybeCons = maybeCons(attr);
				 ((MaybeAssignmentContext)_localctx).result =  ((MaybeAssignmentContext)_localctx).maybeCons.result; 
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
	public static class MaybeConsContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public MaybeDisjunctionContext head;
		public MaybeConsContext tail;
		public MaybeDisjunctionContext maybeDisjunction;
		public MaybeDisjunctionContext maybeDisjunction() {
			return getRuleContext(MaybeDisjunctionContext.class,0);
		}
		public MaybeConsContext maybeCons() {
			return getRuleContext(MaybeConsContext.class,0);
		}
		public MaybeConsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MaybeConsContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_maybeCons; }
	}

	public final MaybeConsContext maybeCons(Attr attr) throws RecognitionException {
		MaybeConsContext _localctx = new MaybeConsContext(_ctx, getState(), attr);
		enterRule(_localctx, 26, RULE_maybeCons);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(185);
				((MaybeConsContext)_localctx).head = maybeDisjunction(Attr.VAL);
				setState(186);
				match(T__10);
				setState(187);
				((MaybeConsContext)_localctx).tail = maybeCons(Attr.VAL);

				    ((MaybeConsContext)_localctx).result =  factory.createCons(((MaybeConsContext)_localctx).head.result, ((MaybeConsContext)_localctx).tail.result);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				((MaybeConsContext)_localctx).maybeDisjunction = maybeDisjunction(attr);
				 ((MaybeConsContext)_localctx).result =  ((MaybeConsContext)_localctx).maybeDisjunction.result; 
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
	public static class MaybeDisjunctionContext extends ParserRuleContext {
		public Attr attr;
		public ExprNode result;
		public MaybeConjunctionContext maybeConjunction;
		public Token op;
		public MaybeConjunctionContext rhs;
		public List<MaybeConjunctionContext> maybeConjunction() {
			return getRuleContexts(MaybeConjunctionContext.class);
		}
		public MaybeConjunctionContext maybeConjunction(int i) {
			return getRuleContext(MaybeConjunctionContext.class,i);
		}
		public MaybeDisjunctionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MaybeDisjunctionContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_maybeDisjunction; }
	}

	public final MaybeDisjunctionContext maybeDisjunction(Attr attr) throws RecognitionException {
		MaybeDisjunctionContext _localctx = new MaybeDisjunctionContext(_ctx, getState(), attr);
		enterRule(_localctx, 28, RULE_maybeDisjunction);
		try {
			int _alt;
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				((MaybeDisjunctionContext)_localctx).maybeConjunction = maybeConjunction(attr);
				 ((MaybeDisjunctionContext)_localctx).result =  ((MaybeDisjunctionContext)_localctx).maybeConjunction.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(199);
				((MaybeDisjunctionContext)_localctx).maybeConjunction = maybeConjunction(Attr.VAL);
				 ((MaybeDisjunctionContext)_localctx).result =  ((MaybeDisjunctionContext)_localctx).maybeConjunction.result; 
				setState(205); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(201);
						((MaybeDisjunctionContext)_localctx).op = match(T__11);
						setState(202);
						((MaybeDisjunctionContext)_localctx).rhs = ((MaybeDisjunctionContext)_localctx).maybeConjunction = maybeConjunction(Attr.VAL);

						      ((MaybeDisjunctionContext)_localctx).result =  factory.createBinary(((MaybeDisjunctionContext)_localctx).op, _localctx.result, ((MaybeDisjunctionContext)_localctx).rhs.result);
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(207); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 30, RULE_maybeConjunction);
		try {
			int _alt;
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(attr);
				 ((MaybeConjunctionContext)_localctx).result =  ((MaybeConjunctionContext)_localctx).maybeCmp.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(215);
				((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(Attr.VAL);
				 ((MaybeConjunctionContext)_localctx).result =  ((MaybeConjunctionContext)_localctx).maybeCmp.result; 
				setState(221); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(217);
						((MaybeConjunctionContext)_localctx).op = match(T__12);
						setState(218);
						((MaybeConjunctionContext)_localctx).rhs = ((MaybeConjunctionContext)_localctx).maybeCmp = maybeCmp(Attr.VAL);

						      ((MaybeConjunctionContext)_localctx).result =  factory.createBinary(((MaybeConjunctionContext)_localctx).op, _localctx.result, ((MaybeConjunctionContext)_localctx).rhs.result);
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(223); 
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
		enterRule(_localctx, 32, RULE_maybeCmp);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(228);
				((MaybeCmpContext)_localctx).lhs = maybeAddSub(Attr.VAL);
				setState(229);
				((MaybeCmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) ) {
					((MaybeCmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
				((MaybeCmpContext)_localctx).rhs = maybeAddSub(Attr.VAL);

				    ((MaybeCmpContext)_localctx).result =  factory.createBinary(((MaybeCmpContext)_localctx).op, ((MaybeCmpContext)_localctx).lhs.result, ((MaybeCmpContext)_localctx).rhs.result);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
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
		enterRule(_localctx, 34, RULE_maybeAddSub);
		int _la;
		try {
			int _alt;
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(attr);
				 ((MaybeAddSubContext)_localctx).result =  ((MaybeAddSubContext)_localctx).maybeMulDivRem.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(242);
				((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(Attr.VAL);
				 ((MaybeAddSubContext)_localctx).result =  ((MaybeAddSubContext)_localctx).maybeMulDivRem.result; 
				setState(248); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(244);
						((MaybeAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((MaybeAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(245);
						((MaybeAddSubContext)_localctx).rhs = ((MaybeAddSubContext)_localctx).maybeMulDivRem = maybeMulDivRem(Attr.VAL);

						      ((MaybeAddSubContext)_localctx).result =  factory.createBinary(((MaybeAddSubContext)_localctx).op, _localctx.result, ((MaybeAddSubContext)_localctx).rhs.result);
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(250); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 36, RULE_maybeMulDivRem);
		int _la;
		try {
			int _alt;
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(attr);
				 ((MaybeMulDivRemContext)_localctx).result =  ((MaybeMulDivRemContext)_localctx).binaryOperand.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(258);
				((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(Attr.VAL);
				 ((MaybeMulDivRemContext)_localctx).result =  ((MaybeMulDivRemContext)_localctx).binaryOperand.result; 
				setState(264); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(260);
						((MaybeMulDivRemContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
							((MaybeMulDivRemContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(261);
						((MaybeMulDivRemContext)_localctx).rhs = ((MaybeMulDivRemContext)_localctx).binaryOperand = binaryOperand(Attr.VAL);

						    ((MaybeMulDivRemContext)_localctx).result =  factory.createBinary(((MaybeMulDivRemContext)_localctx).op, _localctx.result, ((MaybeMulDivRemContext)_localctx).rhs.result);
						  
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(266); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 38, RULE_binaryOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
		enterRule(_localctx, 40, RULE_postfixExpression);
		try {
			int _alt;
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				((PostfixExpressionContext)_localctx).primary = primary(attr);
				 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).primary.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				((PostfixExpressionContext)_localctx).primary = primary(Attr.VAL);
				 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).primary.result; 
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(278);
						((PostfixExpressionContext)_localctx).postfixItem = postfixItem(_localctx.result, Attr.VAL);
						 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).postfixItem.result; 
						}
						} 
					}
					setState(285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(286);
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
		enterRule(_localctx, 42, RULE_postfixItem);
		int _la;
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(T__24);
				setState(292);
				((PostfixItemContext)_localctx).index = expression(Attr.VAL);
				setState(293);
				match(T__25);

				    if (_localctx.attr == Attr.REF)
				      ((PostfixItemContext)_localctx).result =  factory.createElemRef(_localctx.base, ((PostfixItemContext)_localctx).index.result);
				    else
				      ((PostfixItemContext)_localctx).result =  factory.createElemRead(_localctx.base, ((PostfixItemContext)_localctx).index.result);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				 List<ExprNode> argumentNodes = new ArrayList<>(); 
				setState(298);
				match(T__5);
				setState(310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(299);
					((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
					 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(301);
						match(T__2);
						setState(302);
						((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
						 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
						}
						}
						setState(309);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(312);
				match(T__6);

				    ((PostfixItemContext)_localctx).result =  factory.createCallExpr(_localctx.base, argumentNodes);
				  
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				 List<ExprNode> argumentNodes = new ArrayList<>(); argumentNodes.add(_localctx.base); 
				setState(316);
				match(T__26);
				setState(317);
				((PostfixItemContext)_localctx).callee = varRef(Attr.VAL);
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(318);
					match(T__5);
					setState(319);
					((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
					 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(321);
						match(T__2);
						setState(322);
						((PostfixItemContext)_localctx).expression = expression(Attr.VAL);
						 argumentNodes.add(((PostfixItemContext)_localctx).expression.result); 
						}
						}
						setState(329);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(330);
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
		public Token STRING;
		public Token CHAR;
		public VarRefContext varRef;
		public AnonFunctionContext anonFunction;
		public ScopeExpressionContext scopeExpression;
		public ListExpressionContext listExpression;
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
		public TerminalNode STRING() { return getToken(LamaLanguageParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(LamaLanguageParser.CHAR, 0); }
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public AnonFunctionContext anonFunction() {
			return getRuleContext(AnonFunctionContext.class,0);
		}
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
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
		enterRule(_localctx, 44, RULE_primary);
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(339);
				((PrimaryContext)_localctx).const_ = const_();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).const_.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(343);
				((PrimaryContext)_localctx).STRING = match(STRING);
				 ((PrimaryContext)_localctx).result =  factory.createStringLiteral(((PrimaryContext)_localctx).STRING); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(346);
				((PrimaryContext)_localctx).CHAR = match(CHAR);
				 ((PrimaryContext)_localctx).result =  factory.createCharLiteral(((PrimaryContext)_localctx).CHAR); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				((PrimaryContext)_localctx).varRef = varRef(attr);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).varRef.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(351);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(352);
				match(T__27);
				 ((PrimaryContext)_localctx).result =  new LongLiteralNode(1); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(354);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(355);
				match(T__28);
				 ((PrimaryContext)_localctx).result =  new LongLiteralNode(0); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(357);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(358);
				((PrimaryContext)_localctx).anonFunction = anonFunction();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).anonFunction.result; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(361);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(362);
				match(T__29);
				 ((PrimaryContext)_localctx).result =  new SkipNode(); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(364);
				match(T__5);
				setState(365);
				((PrimaryContext)_localctx).scopeExpression = scopeExpression(attr, true);
				setState(366);
				match(T__6);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).scopeExpression.result; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(369);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(370);
				((PrimaryContext)_localctx).listExpression = listExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).listExpression.result; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(373);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(374);
				((PrimaryContext)_localctx).arrayExpression = arrayExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).arrayExpression.result; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(377);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(378);
				((PrimaryContext)_localctx).sExpression = sExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).sExpression.result; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(381);
				((PrimaryContext)_localctx).ifExpression = ifExpression(attr);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).ifExpression.result; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(384);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(385);
				((PrimaryContext)_localctx).whileDoExpression = whileDoExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).whileDoExpression.result; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(388);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(389);
				((PrimaryContext)_localctx).doWhileExpression = doWhileExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).doWhileExpression.result; 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(392);
				if (!(_localctx.attr == Attr.VOID)) throw new FailedPredicateException(this, "$attr == Attr.VOID");
				setState(393);
				((PrimaryContext)_localctx).forExpression = forExpression();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).forExpression.result; 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(396);
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
		public LongLiteralContext longLiteral;
		public LongLiteralContext longLiteral() {
			return getRuleContext(LongLiteralContext.class,0);
		}
		public Const_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_; }
	}

	public final Const_Context const_() throws RecognitionException {
		Const_Context _localctx = new Const_Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_const_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			((Const_Context)_localctx).longLiteral = longLiteral();

			    ((Const_Context)_localctx).result =  new LongLiteralNode(((Const_Context)_localctx).longLiteral.result);
			  
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
			setState(404);
			((VarRefContext)_localctx).LIDENT = match(LIDENT);

			    var refNode = factory.createUnresolvedRef(((VarRefContext)_localctx).LIDENT);
			    if (attr == Attr.REF)
			      ((VarRefContext)_localctx).result =  refNode;
			    else
			      ((VarRefContext)_localctx).result =  GenericReadNodeGen.create(refNode);
			  
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
	public static class AnonFunctionContext extends ParserRuleContext {
		public ExprNode result;
		public ScopeExpressionNoStartContext body;
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public ScopeExpressionNoStartContext scopeExpressionNoStart() {
			return getRuleContext(ScopeExpressionNoStartContext.class,0);
		}
		public AnonFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonFunction; }
	}

	public final AnonFunctionContext anonFunction() throws RecognitionException {
		AnonFunctionContext _localctx = new AnonFunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_anonFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(T__4);

			    factory.startAnonFrame();
			  
			setState(409);
			match(T__5);
			setState(410);
			functionParameters();
			setState(411);
			match(T__6);
			setState(412);
			match(T__7);
			setState(413);
			((AnonFunctionContext)_localctx).body = scopeExpressionNoStart(Attr.VOID, true);
			setState(414);
			match(T__8);
			 ((AnonFunctionContext)_localctx).result =  factory.finishAnonFunction(((AnonFunctionContext)_localctx).body.result); 
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
		enterRule(_localctx, 52, RULE_arrayExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<ExprNode> elements = new ArrayList<>(); 
			setState(418);
			match(T__24);
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(419);
				((ArrayExpressionContext)_localctx).expression = expression(Attr.VAL);
				 elements.add(((ArrayExpressionContext)_localctx).expression.result); 
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(421);
					match(T__2);
					setState(422);
					((ArrayExpressionContext)_localctx).expression = expression(Attr.VAL);
					 elements.add(((ArrayExpressionContext)_localctx).expression.result); 
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(432);
			match(T__25);
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
	public static class ListExpressionContext extends ParserRuleContext {
		public ExprNode result;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpression; }
	}

	public final ListExpressionContext listExpression() throws RecognitionException {
		ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<ExprNode> elements = new ArrayList<>(); 
			setState(436);
			match(T__7);
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(437);
				((ListExpressionContext)_localctx).expression = expression(Attr.VAL);
				 elements.add(((ListExpressionContext)_localctx).expression.result); 
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(439);
					match(T__2);
					setState(440);
					((ListExpressionContext)_localctx).expression = expression(Attr.VAL);
					 elements.add(((ListExpressionContext)_localctx).expression.result); 
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(450);
			match(T__8);
			 ((ListExpressionContext)_localctx).result =  factory.createListExpr(elements); 
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
		enterRule(_localctx, 56, RULE_sExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<ExprNode> elementNodes = new ArrayList<>(); 
			setState(454);
			((SExpressionContext)_localctx).UIDENT = match(UIDENT);
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(455);
				match(T__5);
				setState(456);
				((SExpressionContext)_localctx).expression = expression(Attr.VAL);
				 elementNodes.add(((SExpressionContext)_localctx).expression.result); 
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(458);
					match(T__2);
					setState(459);
					((SExpressionContext)_localctx).expression = expression(Attr.VAL);
					 elementNodes.add(((SExpressionContext)_localctx).expression.result); 
					}
					}
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(467);
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
		enterRule(_localctx, 58, RULE_ifExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			    List<IfThenEntry> ifThenEntries = new ArrayList<>();
			  
			setState(474);
			match(T__30);
			setState(475);
			((IfExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(476);
			match(T__31);
			setState(477);
			((IfExpressionContext)_localctx).thenBody = expression(attr);

			    ifThenEntries.add(new IfThenEntry(((IfExpressionContext)_localctx).cond.result, ((IfExpressionContext)_localctx).thenBody.result));
			  
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(479);
					match(T__32);
					setState(480);
					((IfExpressionContext)_localctx).cond = expression(Attr.VAL);
					setState(481);
					match(T__31);
					setState(482);
					((IfExpressionContext)_localctx).thenBody = expression(attr);

					      ifThenEntries.add(new IfThenEntry(((IfExpressionContext)_localctx).cond.result, ((IfExpressionContext)_localctx).thenBody.result));
					    
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(490);
			((IfExpressionContext)_localctx).elseBranch = elseBranch(attr);
			setState(491);
			match(T__33);

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
		enterRule(_localctx, 60, RULE_elseBranch);
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(T__34);
				setState(495);
				((ElseBranchContext)_localctx).expression = expression(attr);

				    ((ElseBranchContext)_localctx).result =  ((ElseBranchContext)_localctx).expression.result;
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
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
		enterRule(_localctx, 62, RULE_whileDoExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(T__35);
			setState(503);
			((WhileDoExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(504);
			match(T__36);
			setState(505);
			((WhileDoExpressionContext)_localctx).body = scopeExpression(Attr.VOID, true);
			setState(506);
			match(T__37);

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
		enterRule(_localctx, 64, RULE_doWhileExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(T__36);
			setState(510);
			((DoWhileExpressionContext)_localctx).body = scopeExpression(Attr.VOID, false);
			setState(511);
			match(T__35);
			setState(512);
			((DoWhileExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(513);
			match(T__37);

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
		enterRule(_localctx, 66, RULE_forExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(T__38);
			setState(517);
			((ForExpressionContext)_localctx).init = scopeExpression(Attr.VOID, false);
			setState(518);
			match(T__2);
			setState(519);
			((ForExpressionContext)_localctx).cond = expression(Attr.VAL);
			setState(520);
			match(T__2);
			setState(521);
			((ForExpressionContext)_localctx).incr = expression(Attr.VOID);
			setState(522);
			match(T__36);
			setState(523);
			((ForExpressionContext)_localctx).body = scopeExpression(Attr.VOID, true);
			setState(524);
			match(T__37);

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
		enterRule(_localctx, 68, RULE_caseExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(T__39);
			setState(528);
			((CaseExpressionContext)_localctx).scrutinee = expression(Attr.VAL);
			setState(529);
			match(T__40);
			setState(530);
			((CaseExpressionContext)_localctx).caseBranches = caseBranches(attr);
			setState(531);
			match(T__41);

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
		enterRule(_localctx, 70, RULE_caseBranches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((CaseBranchesContext)_localctx).result =  new ArrayList<CaseNode.Branch>(); 
			setState(535);
			((CaseBranchesContext)_localctx).caseBranch = caseBranch(attr);
			 _localctx.result.add(((CaseBranchesContext)_localctx).caseBranch.result); 
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(537);
				match(T__42);
				setState(538);
				((CaseBranchesContext)_localctx).caseBranch = caseBranch(attr);
				 _localctx.result.add(((CaseBranchesContext)_localctx).caseBranch.result); 
				}
				}
				setState(545);
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
		public ScopeExpressionNoStartContext outcome;
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ScopeExpressionNoStartContext scopeExpressionNoStart() {
			return getRuleContext(ScopeExpressionNoStartContext.class,0);
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
		enterRule(_localctx, 72, RULE_caseBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 factory.startScope(); 
			setState(547);
			((CaseBranchContext)_localctx).pattern = pattern();
			setState(548);
			match(T__43);
			setState(549);
			((CaseBranchContext)_localctx).outcome = scopeExpressionNoStart(attr, true);

			    ((CaseBranchContext)_localctx).result =  new CaseNode.Branch(((CaseBranchContext)_localctx).pattern.result, ((CaseBranchContext)_localctx).outcome.result);
			  
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
		public ConsPatternContext consPattern;
		public SimplePatternContext simplePattern;
		public ConsPatternContext consPattern() {
			return getRuleContext(ConsPatternContext.class,0);
		}
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
		enterRule(_localctx, 74, RULE_pattern);
		try {
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				((PatternContext)_localctx).consPattern = consPattern();
				 ((PatternContext)_localctx).result =  ((PatternContext)_localctx).consPattern.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				((PatternContext)_localctx).simplePattern = simplePattern();
				 ((PatternContext)_localctx).result =  ((PatternContext)_localctx).simplePattern.result; 
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
	public static class ConsPatternContext extends ParserRuleContext {
		public PatternNode result;
		public SimplePatternContext simplePattern;
		public PatternContext pattern;
		public SimplePatternContext simplePattern() {
			return getRuleContext(SimplePatternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ConsPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consPattern; }
	}

	public final ConsPatternContext consPattern() throws RecognitionException {
		ConsPatternContext _localctx = new ConsPatternContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_consPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			((ConsPatternContext)_localctx).simplePattern = simplePattern();
			setState(561);
			match(T__10);
			setState(562);
			((ConsPatternContext)_localctx).pattern = pattern();

			    ((ConsPatternContext)_localctx).result =  factory.createConsPattern(((ConsPatternContext)_localctx).simplePattern.result, ((ConsPatternContext)_localctx).pattern.result);
			  
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
		public ArrayPatternContext arrayPattern;
		public ListPatternContext listPattern;
		public BindingPatternContext bindingPattern;
		public LongLiteralPatternContext longLiteralPattern;
		public Token STRING;
		public Token CHAR;
		public PatternContext pattern;
		public WildcardPatternContext wildcardPattern() {
			return getRuleContext(WildcardPatternContext.class,0);
		}
		public SexpPatternContext sexpPattern() {
			return getRuleContext(SexpPatternContext.class,0);
		}
		public ArrayPatternContext arrayPattern() {
			return getRuleContext(ArrayPatternContext.class,0);
		}
		public ListPatternContext listPattern() {
			return getRuleContext(ListPatternContext.class,0);
		}
		public BindingPatternContext bindingPattern() {
			return getRuleContext(BindingPatternContext.class,0);
		}
		public LongLiteralPatternContext longLiteralPattern() {
			return getRuleContext(LongLiteralPatternContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LamaLanguageParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(LamaLanguageParser.CHAR, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public SimplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePattern; }
	}

	public final SimplePatternContext simplePattern() throws RecognitionException {
		SimplePatternContext _localctx = new SimplePatternContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_simplePattern);
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				((SimplePatternContext)_localctx).wildcardPattern = wildcardPattern();
				 ((SimplePatternContext)_localctx).result =  ((SimplePatternContext)_localctx).wildcardPattern.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				((SimplePatternContext)_localctx).sexpPattern = sexpPattern();
				 ((SimplePatternContext)_localctx).result =  ((SimplePatternContext)_localctx).sexpPattern.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				((SimplePatternContext)_localctx).arrayPattern = arrayPattern();
				 ((SimplePatternContext)_localctx).result =  ((SimplePatternContext)_localctx).arrayPattern.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(574);
				((SimplePatternContext)_localctx).listPattern = listPattern();
				 ((SimplePatternContext)_localctx).result =  ((SimplePatternContext)_localctx).listPattern.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(577);
				((SimplePatternContext)_localctx).bindingPattern = bindingPattern();
				 ((SimplePatternContext)_localctx).result =  ((SimplePatternContext)_localctx).bindingPattern.result; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(580);
				((SimplePatternContext)_localctx).longLiteralPattern = longLiteralPattern();
				 ((SimplePatternContext)_localctx).result =  ((SimplePatternContext)_localctx).longLiteralPattern.result; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(583);
				((SimplePatternContext)_localctx).STRING = match(STRING);
				 ((SimplePatternContext)_localctx).result =  factory.createStringLiteralPattern(((SimplePatternContext)_localctx).STRING); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(585);
				((SimplePatternContext)_localctx).CHAR = match(CHAR);
				 ((SimplePatternContext)_localctx).result =  factory.createCharLiteralPattern(((SimplePatternContext)_localctx).CHAR); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(587);
				match(T__27);
				 ((SimplePatternContext)_localctx).result =  new LongLiteralPatternNode(1); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(589);
				match(T__28);
				 ((SimplePatternContext)_localctx).result =  new LongLiteralPatternNode(0); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(591);
				match(T__44);
				setState(592);
				match(T__45);
				 ((SimplePatternContext)_localctx).result =  new ValTypePatternNode(); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(594);
				match(T__44);
				setState(595);
				match(T__46);
				 ((SimplePatternContext)_localctx).result =  new StringTypePatternNode(); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(597);
				match(T__44);
				setState(598);
				match(T__47);
				 ((SimplePatternContext)_localctx).result =  new ArrayTypePatternNode(); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(600);
				match(T__44);
				setState(601);
				match(T__48);
				 ((SimplePatternContext)_localctx).result =  new SexpTypePatternNode(); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(603);
				match(T__44);
				setState(604);
				match(T__4);
				 ((SimplePatternContext)_localctx).result =  new FunTypePatternNode(); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(606);
				match(T__5);
				setState(607);
				((SimplePatternContext)_localctx).pattern = pattern();
				setState(608);
				match(T__6);
				 ((SimplePatternContext)_localctx).result =  ((SimplePatternContext)_localctx).pattern.result; 
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
	public static class WildcardPatternContext extends ParserRuleContext {
		public PatternNode result;
		public WildcardPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardPattern; }
	}

	public final WildcardPatternContext wildcardPattern() throws RecognitionException {
		WildcardPatternContext _localctx = new WildcardPatternContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(T__49);
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
		enterRule(_localctx, 82, RULE_sexpPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<PatternNode> subpatterns = new ArrayList<>(); 
			setState(617);
			((SexpPatternContext)_localctx).UIDENT = match(UIDENT);
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(618);
				match(T__5);
				setState(619);
				((SexpPatternContext)_localctx).pattern = pattern();
				 subpatterns.add(((SexpPatternContext)_localctx).pattern.result); 
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(621);
					match(T__2);
					setState(622);
					((SexpPatternContext)_localctx).pattern = pattern();
					 subpatterns.add(((SexpPatternContext)_localctx).pattern.result); 
					}
					}
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(630);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayPatternContext extends ParserRuleContext {
		public PatternNode result;
		public PatternContext pattern;
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public ArrayPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayPattern; }
	}

	public final ArrayPatternContext arrayPattern() throws RecognitionException {
		ArrayPatternContext _localctx = new ArrayPatternContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arrayPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<PatternNode> subpatterns = new ArrayList<>(); 
			setState(637);
			match(T__24);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1118053792707772736L) != 0)) {
				{
				setState(638);
				((ArrayPatternContext)_localctx).pattern = pattern();
				 subpatterns.add(((ArrayPatternContext)_localctx).pattern.result); 
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(640);
					match(T__2);
					setState(641);
					((ArrayPatternContext)_localctx).pattern = pattern();
					 subpatterns.add(((ArrayPatternContext)_localctx).pattern.result); 
					}
					}
					setState(648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(651);
			match(T__25);
			 ((ArrayPatternContext)_localctx).result =  factory.createArrayPattern(subpatterns); 
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
	public static class ListPatternContext extends ParserRuleContext {
		public PatternNode result;
		public PatternContext pattern;
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public ListPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listPattern; }
	}

	public final ListPatternContext listPattern() throws RecognitionException {
		ListPatternContext _localctx = new ListPatternContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_listPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<PatternNode> subpatterns = new ArrayList<>(); 
			setState(655);
			match(T__7);
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1118053792707772736L) != 0)) {
				{
				setState(656);
				((ListPatternContext)_localctx).pattern = pattern();
				 subpatterns.add(((ListPatternContext)_localctx).pattern.result); 
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(658);
					match(T__2);
					setState(659);
					((ListPatternContext)_localctx).pattern = pattern();
					 subpatterns.add(((ListPatternContext)_localctx).pattern.result); 
					}
					}
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(669);
			match(T__8);
			 ((ListPatternContext)_localctx).result =  factory.createListPattern(subpatterns); 
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
	public static class BindingPatternContext extends ParserRuleContext {
		public PatternNode result;
		public Token LIDENT;
		public PatternContext pattern;
		public TerminalNode LIDENT() { return getToken(LamaLanguageParser.LIDENT, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public BindingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingPattern; }
	}

	public final BindingPatternContext bindingPattern() throws RecognitionException {
		BindingPatternContext _localctx = new BindingPatternContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_bindingPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			((BindingPatternContext)_localctx).LIDENT = match(LIDENT);
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__50) {
				{
				setState(673);
				match(T__50);
				setState(674);
				((BindingPatternContext)_localctx).pattern = pattern();
				}
			}


			    ((BindingPatternContext)_localctx).result =  factory.createBindingPattern(((BindingPatternContext)_localctx).LIDENT, ((BindingPatternContext)_localctx).pattern != null ? ((BindingPatternContext)_localctx).pattern.result : null);
			  
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
	public static class LongLiteralPatternContext extends ParserRuleContext {
		public PatternNode result;
		public LongLiteralContext longLiteral;
		public LongLiteralContext longLiteral() {
			return getRuleContext(LongLiteralContext.class,0);
		}
		public LongLiteralPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longLiteralPattern; }
	}

	public final LongLiteralPatternContext longLiteralPattern() throws RecognitionException {
		LongLiteralPatternContext _localctx = new LongLiteralPatternContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_longLiteralPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			((LongLiteralPatternContext)_localctx).longLiteral = longLiteral();

			    ((LongLiteralPatternContext)_localctx).result =  new LongLiteralPatternNode(((LongLiteralPatternContext)_localctx).longLiteral.result);
			  
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
	public static class LongLiteralContext extends ParserRuleContext {
		public long result;
		public Token minus;
		public Token DECIMAL;
		public TerminalNode DECIMAL() { return getToken(LamaLanguageParser.DECIMAL, 0); }
		public LongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longLiteral; }
	}

	public final LongLiteralContext longLiteral() throws RecognitionException {
		LongLiteralContext _localctx = new LongLiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_longLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(682);
				((LongLiteralContext)_localctx).minus = match(T__20);
				}
			}

			setState(685);
			((LongLiteralContext)_localctx).DECIMAL = match(DECIMAL);

			    ((LongLiteralContext)_localctx).result =  Long.parseLong(((LongLiteralContext)_localctx).DECIMAL.getText());
			    if (((LongLiteralContext)_localctx).minus != null)
			      ((LongLiteralContext)_localctx).result =  -_localctx.result;
			  
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
		case 13:
			return maybeCons_sempred((MaybeConsContext)_localctx, predIndex);
		case 14:
			return maybeDisjunction_sempred((MaybeDisjunctionContext)_localctx, predIndex);
		case 15:
			return maybeConjunction_sempred((MaybeConjunctionContext)_localctx, predIndex);
		case 16:
			return maybeCmp_sempred((MaybeCmpContext)_localctx, predIndex);
		case 17:
			return maybeAddSub_sempred((MaybeAddSubContext)_localctx, predIndex);
		case 18:
			return maybeMulDivRem_sempred((MaybeMulDivRemContext)_localctx, predIndex);
		case 21:
			return postfixItem_sempred((PostfixItemContext)_localctx, predIndex);
		case 22:
			return primary_sempred((PrimaryContext)_localctx, predIndex);
		case 30:
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
	private boolean maybeCons_sempred(MaybeConsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean maybeDisjunction_sempred(MaybeDisjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean maybeConjunction_sempred(MaybeConjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean maybeCmp_sempred(MaybeCmpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean maybeAddSub_sempred(MaybeAddSubContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean maybeMulDivRem_sempred(MaybeMulDivRemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean postfixItem_sempred(PostfixItemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return _localctx.attr != Attr.REF;
		case 8:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean primary_sempred(PrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return _localctx.attr != Attr.REF;
		case 10:
			return _localctx.attr != Attr.REF;
		case 11:
			return _localctx.attr != Attr.REF;
		case 12:
			return _localctx.attr != Attr.REF;
		case 13:
			return _localctx.attr != Attr.REF;
		case 14:
			return _localctx.attr != Attr.REF;
		case 15:
			return _localctx.attr == Attr.VOID;
		case 16:
			return _localctx.attr != Attr.REF;
		case 17:
			return _localctx.attr != Attr.REF;
		case 18:
			return _localctx.attr != Attr.REF;
		case 19:
			return _localctx.attr == Attr.VOID;
		case 20:
			return _localctx.attr == Attr.VOID;
		case 21:
			return _localctx.attr == Attr.VOID;
		}
		return true;
	}
	private boolean elseBranch_sempred(ElseBranchContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return _localctx.attr == Attr.VOID;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u02b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002"+
		"h\b\u0002\n\u0002\f\u0002k\t\u0002\u0001\u0002\u0003\u0002n\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003t\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005}\b\u0005\n\u0005\f\u0005\u0080\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0085\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u0097\b\b\n\b\f\b\u009a\t\b\u0003\b\u009c\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00a9\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00b7\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00c2\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0004\u000e\u00ce\b\u000e\u000b\u000e\f\u000e\u00cf\u0003\u000e"+
		"\u00d2\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f"+
		"\u00de\b\u000f\u000b\u000f\f\u000f\u00df\u0003\u000f\u00e2\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ed\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u00f9\b\u0011\u000b\u0011\f"+
		"\u0011\u00fa\u0003\u0011\u00fd\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0004\u0012\u0109\b\u0012\u000b\u0012\f\u0012\u010a\u0003"+
		"\u0012\u010d\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u011a\b\u0014\n\u0014\f\u0014\u011d\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0122\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0132\b\u0015\n\u0015\f\u0015\u0135\t\u0015\u0003\u0015\u0137"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0146\b\u0015\n\u0015\f\u0015\u0149\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u014d\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0151\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0190\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u01aa\b\u001a\n\u001a\f\u001a\u01ad\t\u001a\u0003\u001a\u01af\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u01bc\b\u001b\n\u001b\f\u001b\u01bf\t\u001b\u0003\u001b\u01c1\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u01cf\b\u001c\n\u001c\f\u001c\u01d2\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u01d6\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01e6"+
		"\b\u001d\n\u001d\f\u001d\u01e9\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u01f5\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005"+
		"#\u021e\b#\n#\f#\u0221\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u022f\b%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u0264\b\'\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u0272"+
		"\b)\n)\f)\u0275\t)\u0001)\u0001)\u0003)\u0279\b)\u0001)\u0001)\u0001*"+
		"\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u0285\b*\n*\f"+
		"*\u0288\t*\u0003*\u028a\b*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0005+\u0297\b+\n+\f+\u029a\t+\u0003+\u029c"+
		"\b+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0003,\u02a4\b,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001.\u0003.\u02ac\b.\u0001.\u0001.\u0001.\u0001"+
		".\u0000\u0000/\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\\u0000\u0003"+
		"\u0001\u0000\u000e\u0013\u0001\u0000\u0014\u0015\u0001\u0000\u0016\u0018"+
		"\u02cd\u0000^\u0001\u0000\u0000\u0000\u0002b\u0001\u0000\u0000\u0000\u0004"+
		"i\u0001\u0000\u0000\u0000\u0006s\u0001\u0000\u0000\u0000\bu\u0001\u0000"+
		"\u0000\u0000\ny\u0001\u0000\u0000\u0000\f\u0081\u0001\u0000\u0000\u0000"+
		"\u000e\u0088\u0001\u0000\u0000\u0000\u0010\u009b\u0001\u0000\u0000\u0000"+
		"\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u00a8\u0001\u0000\u0000\u0000"+
		"\u0016\u00aa\u0001\u0000\u0000\u0000\u0018\u00b6\u0001\u0000\u0000\u0000"+
		"\u001a\u00c1\u0001\u0000\u0000\u0000\u001c\u00d1\u0001\u0000\u0000\u0000"+
		"\u001e\u00e1\u0001\u0000\u0000\u0000 \u00ec\u0001\u0000\u0000\u0000\""+
		"\u00fc\u0001\u0000\u0000\u0000$\u010c\u0001\u0000\u0000\u0000&\u010e\u0001"+
		"\u0000\u0000\u0000(\u0121\u0001\u0000\u0000\u0000*\u0150\u0001\u0000\u0000"+
		"\u0000,\u018f\u0001\u0000\u0000\u0000.\u0191\u0001\u0000\u0000\u00000"+
		"\u0194\u0001\u0000\u0000\u00002\u0197\u0001\u0000\u0000\u00004\u01a1\u0001"+
		"\u0000\u0000\u00006\u01b3\u0001\u0000\u0000\u00008\u01c5\u0001\u0000\u0000"+
		"\u0000:\u01d9\u0001\u0000\u0000\u0000<\u01f4\u0001\u0000\u0000\u0000>"+
		"\u01f6\u0001\u0000\u0000\u0000@\u01fd\u0001\u0000\u0000\u0000B\u0204\u0001"+
		"\u0000\u0000\u0000D\u020f\u0001\u0000\u0000\u0000F\u0216\u0001\u0000\u0000"+
		"\u0000H\u0222\u0001\u0000\u0000\u0000J\u022e\u0001\u0000\u0000\u0000L"+
		"\u0230\u0001\u0000\u0000\u0000N\u0263\u0001\u0000\u0000\u0000P\u0265\u0001"+
		"\u0000\u0000\u0000R\u0268\u0001\u0000\u0000\u0000T\u027c\u0001\u0000\u0000"+
		"\u0000V\u028e\u0001\u0000\u0000\u0000X\u02a0\u0001\u0000\u0000\u0000Z"+
		"\u02a7\u0001\u0000\u0000\u0000\\\u02ab\u0001\u0000\u0000\u0000^_\u0003"+
		"\u0004\u0002\u0000_`\u0006\u0000\uffff\uffff\u0000`a\u0005\u0000\u0000"+
		"\u0001a\u0001\u0001\u0000\u0000\u0000bc\u0006\u0001\uffff\uffff\u0000"+
		"cd\u0003\u0004\u0002\u0000de\u0006\u0001\uffff\uffff\u0000e\u0003\u0001"+
		"\u0000\u0000\u0000fh\u0003\u0006\u0003\u0000gf\u0001\u0000\u0000\u0000"+
		"hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000ln\u0003\u0014"+
		"\n\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000op\u0006\u0002\uffff\uffff\u0000p\u0005\u0001\u0000\u0000"+
		"\u0000qt\u0003\b\u0004\u0000rt\u0003\u000e\u0007\u0000sq\u0001\u0000\u0000"+
		"\u0000sr\u0001\u0000\u0000\u0000t\u0007\u0001\u0000\u0000\u0000uv\u0005"+
		"\u0001\u0000\u0000vw\u0003\n\u0005\u0000wx\u0005\u0002\u0000\u0000x\t"+
		"\u0001\u0000\u0000\u0000y~\u0003\f\u0006\u0000z{\u0005\u0003\u0000\u0000"+
		"{}\u0003\f\u0006\u0000|z\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u000b\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u00058\u0000\u0000\u0082\u0083\u0005\u0004\u0000\u0000\u0083\u0085\u0003"+
		"\u0016\u000b\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0006"+
		"\u0006\uffff\uffff\u0000\u0087\r\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"\u0005\u0000\u0000\u0089\u008a\u00058\u0000\u0000\u008a\u008b\u0006\u0007"+
		"\uffff\uffff\u0000\u008b\u008c\u0005\u0006\u0000\u0000\u008c\u008d\u0003"+
		"\u0010\b\u0000\u008d\u008e\u0005\u0007\u0000\u0000\u008e\u008f\u0005\b"+
		"\u0000\u0000\u008f\u0090\u0003\u0004\u0002\u0000\u0090\u0091\u0005\t\u0000"+
		"\u0000\u0091\u0092\u0006\u0007\uffff\uffff\u0000\u0092\u000f\u0001\u0000"+
		"\u0000\u0000\u0093\u0098\u0003\u0012\t\u0000\u0094\u0095\u0005\u0003\u0000"+
		"\u0000\u0095\u0097\u0003\u0012\t\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u0093\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u0011\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u00058\u0000\u0000\u009e\u009f\u0006\t\uffff\uffff\u0000"+
		"\u009f\u0013\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003\u0016\u000b\u0000"+
		"\u00a1\u00a2\u0006\n\uffff\uffff\u0000\u00a2\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0003\u0016\u000b\u0000\u00a4\u00a5\u0005\u0002\u0000\u0000"+
		"\u00a5\u00a6\u0003\u0014\n\u0000\u00a6\u00a7\u0006\n\uffff\uffff\u0000"+
		"\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a9\u0015\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0003\u0018\f\u0000\u00ab\u00ac\u0006\u000b\uffff\uffff\u0000"+
		"\u00ac\u0017\u0001\u0000\u0000\u0000\u00ad\u00ae\u0004\f\u0000\u0001\u00ae"+
		"\u00af\u0003\u001a\r\u0000\u00af\u00b0\u0005\n\u0000\u0000\u00b0\u00b1"+
		"\u0003\u0018\f\u0000\u00b1\u00b2\u0006\f\uffff\uffff\u0000\u00b2\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003\u001a\r\u0000\u00b4\u00b5\u0006"+
		"\f\uffff\uffff\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b7\u0019\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0004\r\u0001\u0001\u00b9\u00ba\u0003\u001c"+
		"\u000e\u0000\u00ba\u00bb\u0005\u000b\u0000\u0000\u00bb\u00bc\u0003\u001a"+
		"\r\u0000\u00bc\u00bd\u0006\r\uffff\uffff\u0000\u00bd\u00c2\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0003\u001c\u000e\u0000\u00bf\u00c0\u0006\r\uffff"+
		"\uffff\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00b8\u0001\u0000"+
		"\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c2\u001b\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0003\u001e\u000f\u0000\u00c4\u00c5\u0006\u000e"+
		"\uffff\uffff\u0000\u00c5\u00d2\u0001\u0000\u0000\u0000\u00c6\u00c7\u0004"+
		"\u000e\u0002\u0001\u00c7\u00c8\u0003\u001e\u000f\u0000\u00c8\u00cd\u0006"+
		"\u000e\uffff\uffff\u0000\u00c9\u00ca\u0005\f\u0000\u0000\u00ca\u00cb\u0003"+
		"\u001e\u000f\u0000\u00cb\u00cc\u0006\u000e\uffff\uffff\u0000\u00cc\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00c3"+
		"\u0001\u0000\u0000\u0000\u00d1\u00c6\u0001\u0000\u0000\u0000\u00d2\u001d"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003 \u0010\u0000\u00d4\u00d5\u0006"+
		"\u000f\uffff\uffff\u0000\u00d5\u00e2\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0004\u000f\u0003\u0001\u00d7\u00d8\u0003 \u0010\u0000\u00d8\u00dd\u0006"+
		"\u000f\uffff\uffff\u0000\u00d9\u00da\u0005\r\u0000\u0000\u00da\u00db\u0003"+
		" \u0010\u0000\u00db\u00dc\u0006\u000f\uffff\uffff\u0000\u00dc\u00de\u0001"+
		"\u0000\u0000\u0000\u00dd\u00d9\u0001\u0000\u0000\u0000\u00de\u00df\u0001"+
		"\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00d3\u0001"+
		"\u0000\u0000\u0000\u00e1\u00d6\u0001\u0000\u0000\u0000\u00e2\u001f\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0004\u0010\u0004\u0001\u00e4\u00e5\u0003"+
		"\"\u0011\u0000\u00e5\u00e6\u0007\u0000\u0000\u0000\u00e6\u00e7\u0003\""+
		"\u0011\u0000\u00e7\u00e8\u0006\u0010\uffff\uffff\u0000\u00e8\u00ed\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0003\"\u0011\u0000\u00ea\u00eb\u0006\u0010"+
		"\uffff\uffff\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00e3\u0001"+
		"\u0000\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ed!\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0003$\u0012\u0000\u00ef\u00f0\u0006\u0011\uffff"+
		"\uffff\u0000\u00f0\u00fd\u0001\u0000\u0000\u0000\u00f1\u00f2\u0004\u0011"+
		"\u0005\u0001\u00f2\u00f3\u0003$\u0012\u0000\u00f3\u00f8\u0006\u0011\uffff"+
		"\uffff\u0000\u00f4\u00f5\u0007\u0001\u0000\u0000\u00f5\u00f6\u0003$\u0012"+
		"\u0000\u00f6\u00f7\u0006\u0011\uffff\uffff\u0000\u00f7\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00ee\u0001\u0000"+
		"\u0000\u0000\u00fc\u00f1\u0001\u0000\u0000\u0000\u00fd#\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0003&\u0013\u0000\u00ff\u0100\u0006\u0012\uffff\uffff"+
		"\u0000\u0100\u010d\u0001\u0000\u0000\u0000\u0101\u0102\u0004\u0012\u0006"+
		"\u0001\u0102\u0103\u0003&\u0013\u0000\u0103\u0108\u0006\u0012\uffff\uffff"+
		"\u0000\u0104\u0105\u0007\u0002\u0000\u0000\u0105\u0106\u0003&\u0013\u0000"+
		"\u0106\u0107\u0006\u0012\uffff\uffff\u0000\u0107\u0109\u0001\u0000\u0000"+
		"\u0000\u0108\u0104\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u00fe\u0001\u0000\u0000"+
		"\u0000\u010c\u0101\u0001\u0000\u0000\u0000\u010d%\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0003(\u0014\u0000\u010f\u0110\u0006\u0013\uffff\uffff\u0000"+
		"\u0110\'\u0001\u0000\u0000\u0000\u0111\u0112\u0003,\u0016\u0000\u0112"+
		"\u0113\u0006\u0014\uffff\uffff\u0000\u0113\u0122\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0003,\u0016\u0000\u0115\u011b\u0006\u0014\uffff\uffff\u0000"+
		"\u0116\u0117\u0003*\u0015\u0000\u0117\u0118\u0006\u0014\uffff\uffff\u0000"+
		"\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0116\u0001\u0000\u0000\u0000"+
		"\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u011f\u0003*\u0015\u0000\u011f"+
		"\u0120\u0006\u0014\uffff\uffff\u0000\u0120\u0122\u0001\u0000\u0000\u0000"+
		"\u0121\u0111\u0001\u0000\u0000\u0000\u0121\u0114\u0001\u0000\u0000\u0000"+
		"\u0122)\u0001\u0000\u0000\u0000\u0123\u0124\u0005\u0019\u0000\u0000\u0124"+
		"\u0125\u0003\u0014\n\u0000\u0125\u0126\u0005\u001a\u0000\u0000\u0126\u0127"+
		"\u0006\u0015\uffff\uffff\u0000\u0127\u0151\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0004\u0015\u0007\u0001\u0129\u012a\u0006\u0015\uffff\uffff\u0000"+
		"\u012a\u0136\u0005\u0006\u0000\u0000\u012b\u012c\u0003\u0014\n\u0000\u012c"+
		"\u0133\u0006\u0015\uffff\uffff\u0000\u012d\u012e\u0005\u0003\u0000\u0000"+
		"\u012e\u012f\u0003\u0014\n\u0000\u012f\u0130\u0006\u0015\uffff\uffff\u0000"+
		"\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u012d\u0001\u0000\u0000\u0000"+
		"\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000"+
		"\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u012b\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000"+
		"\u0138\u0139\u0005\u0007\u0000\u0000\u0139\u0151\u0006\u0015\uffff\uffff"+
		"\u0000\u013a\u013b\u0004\u0015\b\u0001\u013b\u013c\u0006\u0015\uffff\uffff"+
		"\u0000\u013c\u013d\u0005\u001b\u0000\u0000\u013d\u014c\u00030\u0018\u0000"+
		"\u013e\u013f\u0005\u0006\u0000\u0000\u013f\u0140\u0003\u0014\n\u0000\u0140"+
		"\u0147\u0006\u0015\uffff\uffff\u0000\u0141\u0142\u0005\u0003\u0000\u0000"+
		"\u0142\u0143\u0003\u0014\n\u0000\u0143\u0144\u0006\u0015\uffff\uffff\u0000"+
		"\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0141\u0001\u0000\u0000\u0000"+
		"\u0146\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014a\u0001\u0000\u0000\u0000"+
		"\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u0007\u0000\u0000"+
		"\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u013e\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0006\u0015\uffff\uffff\u0000\u014f\u0151\u0001\u0000\u0000"+
		"\u0000\u0150\u0123\u0001\u0000\u0000\u0000\u0150\u0128\u0001\u0000\u0000"+
		"\u0000\u0150\u013a\u0001\u0000\u0000\u0000\u0151+\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0004\u0016\t\u0001\u0153\u0154\u0003.\u0017\u0000\u0154"+
		"\u0155\u0006\u0016\uffff\uffff\u0000\u0155\u0190\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0004\u0016\n\u0001\u0157\u0158\u0005:\u0000\u0000\u0158"+
		"\u0190\u0006\u0016\uffff\uffff\u0000\u0159\u015a\u0004\u0016\u000b\u0001"+
		"\u015a\u015b\u0005;\u0000\u0000\u015b\u0190\u0006\u0016\uffff\uffff\u0000"+
		"\u015c\u015d\u00030\u0018\u0000\u015d\u015e\u0006\u0016\uffff\uffff\u0000"+
		"\u015e\u0190\u0001\u0000\u0000\u0000\u015f\u0160\u0004\u0016\f\u0001\u0160"+
		"\u0161\u0005\u001c\u0000\u0000\u0161\u0190\u0006\u0016\uffff\uffff\u0000"+
		"\u0162\u0163\u0004\u0016\r\u0001\u0163\u0164\u0005\u001d\u0000\u0000\u0164"+
		"\u0190\u0006\u0016\uffff\uffff\u0000\u0165\u0166\u0004\u0016\u000e\u0001"+
		"\u0166\u0167\u00032\u0019\u0000\u0167\u0168\u0006\u0016\uffff\uffff\u0000"+
		"\u0168\u0190\u0001\u0000\u0000\u0000\u0169\u016a\u0004\u0016\u000f\u0001"+
		"\u016a\u016b\u0005\u001e\u0000\u0000\u016b\u0190\u0006\u0016\uffff\uffff"+
		"\u0000\u016c\u016d\u0005\u0006\u0000\u0000\u016d\u016e\u0003\u0002\u0001"+
		"\u0000\u016e\u016f\u0005\u0007\u0000\u0000\u016f\u0170\u0006\u0016\uffff"+
		"\uffff\u0000\u0170\u0190\u0001\u0000\u0000\u0000\u0171\u0172\u0004\u0016"+
		"\u0010\u0001\u0172\u0173\u00036\u001b\u0000\u0173\u0174\u0006\u0016\uffff"+
		"\uffff\u0000\u0174\u0190\u0001\u0000\u0000\u0000\u0175\u0176\u0004\u0016"+
		"\u0011\u0001\u0176\u0177\u00034\u001a\u0000\u0177\u0178\u0006\u0016\uffff"+
		"\uffff\u0000\u0178\u0190\u0001\u0000\u0000\u0000\u0179\u017a\u0004\u0016"+
		"\u0012\u0001\u017a\u017b\u00038\u001c\u0000\u017b\u017c\u0006\u0016\uffff"+
		"\uffff\u0000\u017c\u0190\u0001\u0000\u0000\u0000\u017d\u017e\u0003:\u001d"+
		"\u0000\u017e\u017f\u0006\u0016\uffff\uffff\u0000\u017f\u0190\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0004\u0016\u0013\u0001\u0181\u0182\u0003>\u001f"+
		"\u0000\u0182\u0183\u0006\u0016\uffff\uffff\u0000\u0183\u0190\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0004\u0016\u0014\u0001\u0185\u0186\u0003@ \u0000"+
		"\u0186\u0187\u0006\u0016\uffff\uffff\u0000\u0187\u0190\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0004\u0016\u0015\u0001\u0189\u018a\u0003B!\u0000\u018a"+
		"\u018b\u0006\u0016\uffff\uffff\u0000\u018b\u0190\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0003D\"\u0000\u018d\u018e\u0006\u0016\uffff\uffff\u0000"+
		"\u018e\u0190\u0001\u0000\u0000\u0000\u018f\u0152\u0001\u0000\u0000\u0000"+
		"\u018f\u0156\u0001\u0000\u0000\u0000\u018f\u0159\u0001\u0000\u0000\u0000"+
		"\u018f\u015c\u0001\u0000\u0000\u0000\u018f\u015f\u0001\u0000\u0000\u0000"+
		"\u018f\u0162\u0001\u0000\u0000\u0000\u018f\u0165\u0001\u0000\u0000\u0000"+
		"\u018f\u0169\u0001\u0000\u0000\u0000\u018f\u016c\u0001\u0000\u0000\u0000"+
		"\u018f\u0171\u0001\u0000\u0000\u0000\u018f\u0175\u0001\u0000\u0000\u0000"+
		"\u018f\u0179\u0001\u0000\u0000\u0000\u018f\u017d\u0001\u0000\u0000\u0000"+
		"\u018f\u0180\u0001\u0000\u0000\u0000\u018f\u0184\u0001\u0000\u0000\u0000"+
		"\u018f\u0188\u0001\u0000\u0000\u0000\u018f\u018c\u0001\u0000\u0000\u0000"+
		"\u0190-\u0001\u0000\u0000\u0000\u0191\u0192\u0003\\.\u0000\u0192\u0193"+
		"\u0006\u0017\uffff\uffff\u0000\u0193/\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u00058\u0000\u0000\u0195\u0196\u0006\u0018\uffff\uffff\u0000\u01961\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0005\u0005\u0000\u0000\u0198\u0199\u0006"+
		"\u0019\uffff\uffff\u0000\u0199\u019a\u0005\u0006\u0000\u0000\u019a\u019b"+
		"\u0003\u0010\b\u0000\u019b\u019c\u0005\u0007\u0000\u0000\u019c\u019d\u0005"+
		"\b\u0000\u0000\u019d\u019e\u0003\u0004\u0002\u0000\u019e\u019f\u0005\t"+
		"\u0000\u0000\u019f\u01a0\u0006\u0019\uffff\uffff\u0000\u01a03\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0006\u001a\uffff\uffff\u0000\u01a2\u01ae\u0005"+
		"\u0019\u0000\u0000\u01a3\u01a4\u0003\u0014\n\u0000\u01a4\u01ab\u0006\u001a"+
		"\uffff\uffff\u0000\u01a5\u01a6\u0005\u0003\u0000\u0000\u01a6\u01a7\u0003"+
		"\u0014\n\u0000\u01a7\u01a8\u0006\u001a\uffff\uffff\u0000\u01a8\u01aa\u0001"+
		"\u0000\u0000\u0000\u01a9\u01a5\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ae\u01a3\u0001\u0000\u0000\u0000\u01ae\u01af\u0001"+
		"\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005"+
		"\u001a\u0000\u0000\u01b1\u01b2\u0006\u001a\uffff\uffff\u0000\u01b25\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0006\u001b\uffff\uffff\u0000\u01b4\u01c0"+
		"\u0005\b\u0000\u0000\u01b5\u01b6\u0003\u0014\n\u0000\u01b6\u01bd\u0006"+
		"\u001b\uffff\uffff\u0000\u01b7\u01b8\u0005\u0003\u0000\u0000\u01b8\u01b9"+
		"\u0003\u0014\n\u0000\u01b9\u01ba\u0006\u001b\uffff\uffff\u0000\u01ba\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bb\u01b7\u0001\u0000\u0000\u0000\u01bc\u01bf"+
		"\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01bd"+
		"\u0001\u0000\u0000\u0000\u01c0\u01b5\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0005\t\u0000\u0000\u01c3\u01c4\u0006\u001b\uffff\uffff\u0000\u01c47"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c6\u0006\u001c\uffff\uffff\u0000\u01c6"+
		"\u01d5\u00057\u0000\u0000\u01c7\u01c8\u0005\u0006\u0000\u0000\u01c8\u01c9"+
		"\u0003\u0014\n\u0000\u01c9\u01d0\u0006\u001c\uffff\uffff\u0000\u01ca\u01cb"+
		"\u0005\u0003\u0000\u0000\u01cb\u01cc\u0003\u0014\n\u0000\u01cc\u01cd\u0006"+
		"\u001c\uffff\uffff\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000\u01d0\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0005\u0007\u0000\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01c7"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0006\u001c\uffff\uffff\u0000\u01d8"+
		"9\u0001\u0000\u0000\u0000\u01d9\u01da\u0006\u001d\uffff\uffff\u0000\u01da"+
		"\u01db\u0005\u001f\u0000\u0000\u01db\u01dc\u0003\u0014\n\u0000\u01dc\u01dd"+
		"\u0005 \u0000\u0000\u01dd\u01de\u0003\u0014\n\u0000\u01de\u01e7\u0006"+
		"\u001d\uffff\uffff\u0000\u01df\u01e0\u0005!\u0000\u0000\u01e0\u01e1\u0003"+
		"\u0014\n\u0000\u01e1\u01e2\u0005 \u0000\u0000\u01e2\u01e3\u0003\u0014"+
		"\n\u0000\u01e3\u01e4\u0006\u001d\uffff\uffff\u0000\u01e4\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e5\u01df\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000"+
		"\u0000\u0000\u01e8\u01ea\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0003<\u001e\u0000\u01eb\u01ec\u0005\"\u0000"+
		"\u0000\u01ec\u01ed\u0006\u001d\uffff\uffff\u0000\u01ed;\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0005#\u0000\u0000\u01ef\u01f0\u0003\u0014\n\u0000"+
		"\u01f0\u01f1\u0006\u001e\uffff\uffff\u0000\u01f1\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0004\u001e\u0016\u0001\u01f3\u01f5\u0006\u001e\uffff"+
		"\uffff\u0000\u01f4\u01ee\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f5=\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005$\u0000\u0000"+
		"\u01f7\u01f8\u0003\u0014\n\u0000\u01f8\u01f9\u0005%\u0000\u0000\u01f9"+
		"\u01fa\u0003\u0002\u0001\u0000\u01fa\u01fb\u0005&\u0000\u0000\u01fb\u01fc"+
		"\u0006\u001f\uffff\uffff\u0000\u01fc?\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0005%\u0000\u0000\u01fe\u01ff\u0003\u0002\u0001\u0000\u01ff\u0200\u0005"+
		"$\u0000\u0000\u0200\u0201\u0003\u0014\n\u0000\u0201\u0202\u0005&\u0000"+
		"\u0000\u0202\u0203\u0006 \uffff\uffff\u0000\u0203A\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0005\'\u0000\u0000\u0205\u0206\u0003\u0002\u0001\u0000\u0206"+
		"\u0207\u0005\u0003\u0000\u0000\u0207\u0208\u0003\u0014\n\u0000\u0208\u0209"+
		"\u0005\u0003\u0000\u0000\u0209\u020a\u0003\u0014\n\u0000\u020a\u020b\u0005"+
		"%\u0000\u0000\u020b\u020c\u0003\u0002\u0001\u0000\u020c\u020d\u0005&\u0000"+
		"\u0000\u020d\u020e\u0006!\uffff\uffff\u0000\u020eC\u0001\u0000\u0000\u0000"+
		"\u020f\u0210\u0005(\u0000\u0000\u0210\u0211\u0003\u0014\n\u0000\u0211"+
		"\u0212\u0005)\u0000\u0000\u0212\u0213\u0003F#\u0000\u0213\u0214\u0005"+
		"*\u0000\u0000\u0214\u0215\u0006\"\uffff\uffff\u0000\u0215E\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0006#\uffff\uffff\u0000\u0217\u0218\u0003H$"+
		"\u0000\u0218\u021f\u0006#\uffff\uffff\u0000\u0219\u021a\u0005+\u0000\u0000"+
		"\u021a\u021b\u0003H$\u0000\u021b\u021c\u0006#\uffff\uffff\u0000\u021c"+
		"\u021e\u0001\u0000\u0000\u0000\u021d\u0219\u0001\u0000\u0000\u0000\u021e"+
		"\u0221\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f"+
		"\u0220\u0001\u0000\u0000\u0000\u0220G\u0001\u0000\u0000\u0000\u0221\u021f"+
		"\u0001\u0000\u0000\u0000\u0222\u0223\u0006$\uffff\uffff\u0000\u0223\u0224"+
		"\u0003J%\u0000\u0224\u0225\u0005,\u0000\u0000\u0225\u0226\u0003\u0004"+
		"\u0002\u0000\u0226\u0227\u0006$\uffff\uffff\u0000\u0227I\u0001\u0000\u0000"+
		"\u0000\u0228\u0229\u0003L&\u0000\u0229\u022a\u0006%\uffff\uffff\u0000"+
		"\u022a\u022f\u0001\u0000\u0000\u0000\u022b\u022c\u0003N\'\u0000\u022c"+
		"\u022d\u0006%\uffff\uffff\u0000\u022d\u022f\u0001\u0000\u0000\u0000\u022e"+
		"\u0228\u0001\u0000\u0000\u0000\u022e\u022b\u0001\u0000\u0000\u0000\u022f"+
		"K\u0001\u0000\u0000\u0000\u0230\u0231\u0003N\'\u0000\u0231\u0232\u0005"+
		"\u000b\u0000\u0000\u0232\u0233\u0003J%\u0000\u0233\u0234\u0006&\uffff"+
		"\uffff\u0000\u0234M\u0001\u0000\u0000\u0000\u0235\u0236\u0003P(\u0000"+
		"\u0236\u0237\u0006\'\uffff\uffff\u0000\u0237\u0264\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0003R)\u0000\u0239\u023a\u0006\'\uffff\uffff\u0000\u023a"+
		"\u0264\u0001\u0000\u0000\u0000\u023b\u023c\u0003T*\u0000\u023c\u023d\u0006"+
		"\'\uffff\uffff\u0000\u023d\u0264\u0001\u0000\u0000\u0000\u023e\u023f\u0003"+
		"V+\u0000\u023f\u0240\u0006\'\uffff\uffff\u0000\u0240\u0264\u0001\u0000"+
		"\u0000\u0000\u0241\u0242\u0003X,\u0000\u0242\u0243\u0006\'\uffff\uffff"+
		"\u0000\u0243\u0264\u0001\u0000\u0000\u0000\u0244\u0245\u0003Z-\u0000\u0245"+
		"\u0246\u0006\'\uffff\uffff\u0000\u0246\u0264\u0001\u0000\u0000\u0000\u0247"+
		"\u0248\u0005:\u0000\u0000\u0248\u0264\u0006\'\uffff\uffff\u0000\u0249"+
		"\u024a\u0005;\u0000\u0000\u024a\u0264\u0006\'\uffff\uffff\u0000\u024b"+
		"\u024c\u0005\u001c\u0000\u0000\u024c\u0264\u0006\'\uffff\uffff\u0000\u024d"+
		"\u024e\u0005\u001d\u0000\u0000\u024e\u0264\u0006\'\uffff\uffff\u0000\u024f"+
		"\u0250\u0005-\u0000\u0000\u0250\u0251\u0005.\u0000\u0000\u0251\u0264\u0006"+
		"\'\uffff\uffff\u0000\u0252\u0253\u0005-\u0000\u0000\u0253\u0254\u0005"+
		"/\u0000\u0000\u0254\u0264\u0006\'\uffff\uffff\u0000\u0255\u0256\u0005"+
		"-\u0000\u0000\u0256\u0257\u00050\u0000\u0000\u0257\u0264\u0006\'\uffff"+
		"\uffff\u0000\u0258\u0259\u0005-\u0000\u0000\u0259\u025a\u00051\u0000\u0000"+
		"\u025a\u0264\u0006\'\uffff\uffff\u0000\u025b\u025c\u0005-\u0000\u0000"+
		"\u025c\u025d\u0005\u0005\u0000\u0000\u025d\u0264\u0006\'\uffff\uffff\u0000"+
		"\u025e\u025f\u0005\u0006\u0000\u0000\u025f\u0260\u0003J%\u0000\u0260\u0261"+
		"\u0005\u0007\u0000\u0000\u0261\u0262\u0006\'\uffff\uffff\u0000\u0262\u0264"+
		"\u0001\u0000\u0000\u0000\u0263\u0235\u0001\u0000\u0000\u0000\u0263\u0238"+
		"\u0001\u0000\u0000\u0000\u0263\u023b\u0001\u0000\u0000\u0000\u0263\u023e"+
		"\u0001\u0000\u0000\u0000\u0263\u0241\u0001\u0000\u0000\u0000\u0263\u0244"+
		"\u0001\u0000\u0000\u0000\u0263\u0247\u0001\u0000\u0000\u0000\u0263\u0249"+
		"\u0001\u0000\u0000\u0000\u0263\u024b\u0001\u0000\u0000\u0000\u0263\u024d"+
		"\u0001\u0000\u0000\u0000\u0263\u024f\u0001\u0000\u0000\u0000\u0263\u0252"+
		"\u0001\u0000\u0000\u0000\u0263\u0255\u0001\u0000\u0000\u0000\u0263\u0258"+
		"\u0001\u0000\u0000\u0000\u0263\u025b\u0001\u0000\u0000\u0000\u0263\u025e"+
		"\u0001\u0000\u0000\u0000\u0264O\u0001\u0000\u0000\u0000\u0265\u0266\u0005"+
		"2\u0000\u0000\u0266\u0267\u0006(\uffff\uffff\u0000\u0267Q\u0001\u0000"+
		"\u0000\u0000\u0268\u0269\u0006)\uffff\uffff\u0000\u0269\u0278\u00057\u0000"+
		"\u0000\u026a\u026b\u0005\u0006\u0000\u0000\u026b\u026c\u0003J%\u0000\u026c"+
		"\u0273\u0006)\uffff\uffff\u0000\u026d\u026e\u0005\u0003\u0000\u0000\u026e"+
		"\u026f\u0003J%\u0000\u026f\u0270\u0006)\uffff\uffff\u0000\u0270\u0272"+
		"\u0001\u0000\u0000\u0000\u0271\u026d\u0001\u0000\u0000\u0000\u0272\u0275"+
		"\u0001\u0000\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0001\u0000\u0000\u0000\u0274\u0276\u0001\u0000\u0000\u0000\u0275\u0273"+
		"\u0001\u0000\u0000\u0000\u0276\u0277\u0005\u0007\u0000\u0000\u0277\u0279"+
		"\u0001\u0000\u0000\u0000\u0278\u026a\u0001\u0000\u0000\u0000\u0278\u0279"+
		"\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u027b"+
		"\u0006)\uffff\uffff\u0000\u027bS\u0001\u0000\u0000\u0000\u027c\u027d\u0006"+
		"*\uffff\uffff\u0000\u027d\u0289\u0005\u0019\u0000\u0000\u027e\u027f\u0003"+
		"J%\u0000\u027f\u0286\u0006*\uffff\uffff\u0000\u0280\u0281\u0005\u0003"+
		"\u0000\u0000\u0281\u0282\u0003J%\u0000\u0282\u0283\u0006*\uffff\uffff"+
		"\u0000\u0283\u0285\u0001\u0000\u0000\u0000\u0284\u0280\u0001\u0000\u0000"+
		"\u0000\u0285\u0288\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000"+
		"\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u028a\u0001\u0000\u0000"+
		"\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0289\u027e\u0001\u0000\u0000"+
		"\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000"+
		"\u0000\u028b\u028c\u0005\u001a\u0000\u0000\u028c\u028d\u0006*\uffff\uffff"+
		"\u0000\u028dU\u0001\u0000\u0000\u0000\u028e\u028f\u0006+\uffff\uffff\u0000"+
		"\u028f\u029b\u0005\b\u0000\u0000\u0290\u0291\u0003J%\u0000\u0291\u0298"+
		"\u0006+\uffff\uffff\u0000\u0292\u0293\u0005\u0003\u0000\u0000\u0293\u0294"+
		"\u0003J%\u0000\u0294\u0295\u0006+\uffff\uffff\u0000\u0295\u0297\u0001"+
		"\u0000\u0000\u0000\u0296\u0292\u0001\u0000\u0000\u0000\u0297\u029a\u0001"+
		"\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0298\u0299\u0001"+
		"\u0000\u0000\u0000\u0299\u029c\u0001\u0000\u0000\u0000\u029a\u0298\u0001"+
		"\u0000\u0000\u0000\u029b\u0290\u0001\u0000\u0000\u0000\u029b\u029c\u0001"+
		"\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u029e\u0005"+
		"\t\u0000\u0000\u029e\u029f\u0006+\uffff\uffff\u0000\u029fW\u0001\u0000"+
		"\u0000\u0000\u02a0\u02a3\u00058\u0000\u0000\u02a1\u02a2\u00053\u0000\u0000"+
		"\u02a2\u02a4\u0003J%\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02a6"+
		"\u0006,\uffff\uffff\u0000\u02a6Y\u0001\u0000\u0000\u0000\u02a7\u02a8\u0003"+
		"\\.\u0000\u02a8\u02a9\u0006-\uffff\uffff\u0000\u02a9[\u0001\u0000\u0000"+
		"\u0000\u02aa\u02ac\u0005\u0015\u0000\u0000\u02ab\u02aa\u0001\u0000\u0000"+
		"\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000"+
		"\u0000\u02ad\u02ae\u00059\u0000\u0000\u02ae\u02af\u0006.\uffff\uffff\u0000"+
		"\u02af]\u0001\u0000\u0000\u0000.ims~\u0084\u0098\u009b\u00a8\u00b6\u00c1"+
		"\u00cf\u00d1\u00df\u00e1\u00ec\u00fa\u00fc\u010a\u010c\u011b\u0121\u0133"+
		"\u0136\u0147\u014c\u0150\u018f\u01ab\u01ae\u01bd\u01c0\u01d0\u01d5\u01e7"+
		"\u01f4\u021f\u022e\u0263\u0273\u0278\u0286\u0289\u0298\u029b\u02a3\u02ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}