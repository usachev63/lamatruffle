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
		WS=10, COMMENT=11, LINE_COMMENT=12, UIDENT=13, LIDENT=14, DECIMAL=15, 
		STRING=16, CHAR=17;
	public static final int
		RULE_lama = 0, RULE_scopeExpr = 1, RULE_definition = 2, RULE_variableDefinition = 3, 
		RULE_variableDefinitionSequence = 4, RULE_variableDefinitionItem = 5, 
		RULE_expression = 6, RULE_basicExpression = 7, RULE_maybeAssignment = 8, 
		RULE_maybeAddSub = 9, RULE_binaryOperand = 10, RULE_postfixExpression = 11, 
		RULE_primary = 12, RULE_const_ = 13, RULE_stringLiteral = 14, RULE_charLiteral = 15, 
		RULE_varRef = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"lama", "scopeExpr", "definition", "variableDefinition", "variableDefinitionSequence", 
			"variableDefinitionItem", "expression", "basicExpression", "maybeAssignment", 
			"maybeAddSub", "binaryOperand", "postfixExpression", "primary", "const_", 
			"stringLiteral", "charLiteral", "varRef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "';'", "','", "'='", "':='", "'+'", "'-'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "WS", "COMMENT", 
			"LINE_COMMENT", "UIDENT", "LIDENT", "DECIMAL", "STRING", "CHAR"
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

	private enum Attr {
	    VAL,
	    REF,
	    VOID,
	    WEAK,
	};

	public LamaLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LamaContext extends ParserRuleContext {
		public ScopeExprContext scopeExpr;
		public ScopeExprContext scopeExpr() {
			return getRuleContext(ScopeExprContext.class,0);
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
			setState(34);
			((LamaContext)_localctx).scopeExpr = scopeExpr(Attr.VOID);
			 factory.createMain(((LamaContext)_localctx).scopeExpr.result); 
			setState(36);
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
	public static class ScopeExprContext extends ParserRuleContext {
		public Attr attr;
		public ScopeExpr result;
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
		public ScopeExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ScopeExprContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_scopeExpr; }
	}

	public final ScopeExprContext scopeExpr(Attr attr) throws RecognitionException {
		ScopeExprContext _localctx = new ScopeExprContext(_ctx, getState(), attr);
		enterRule(_localctx, 2, RULE_scopeExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 factory.startScope(); 
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					definition();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(45);
				((ScopeExprContext)_localctx).expression = expression(attr);
				}
				break;
			}
			 Expr body = null;
			                    if (((ScopeExprContext)_localctx).expression != null)
			                      body = ((ScopeExprContext)_localctx).expression.result;
			                    ((ScopeExprContext)_localctx).result =  factory.finishScope(body);
			                  
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
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			variableDefinition();
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
		enterRule(_localctx, 6, RULE_variableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			variableDefinitionSequence();
			setState(54);
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
		enterRule(_localctx, 8, RULE_variableDefinitionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			variableDefinitionItem();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(57);
				match(T__2);
				setState(58);
				variableDefinitionItem();
				}
				}
				setState(63);
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
		enterRule(_localctx, 10, RULE_variableDefinitionItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((VariableDefinitionItemContext)_localctx).LIDENT = match(LIDENT);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(65);
				match(T__3);
				setState(66);
				((VariableDefinitionItemContext)_localctx).basicExpression = basicExpression(Attr.VAL);
				}
			}


			  int frameSlot = factory.addVarDef(((VariableDefinitionItemContext)_localctx).LIDENT);
			  if (((VariableDefinitionItemContext)_localctx).basicExpression != null)
			    factory.addVarInitializer(frameSlot, ((VariableDefinitionItemContext)_localctx).basicExpression.result);

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
		public Expr result;
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
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((ExpressionContext)_localctx).basicExpression = basicExpression(attr);
				 ((ExpressionContext)_localctx).result =  ((ExpressionContext)_localctx).basicExpression.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				((ExpressionContext)_localctx).basicExpression = basicExpression(Attr.VOID);
				setState(75);
				match(T__1);
				setState(76);
				((ExpressionContext)_localctx).expression = expression(attr);
				 ((ExpressionContext)_localctx).result =  new Seq(((ExpressionContext)_localctx).basicExpression.result, ((ExpressionContext)_localctx).expression.result); 
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
		public Expr result;
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
		enterRule(_localctx, 14, RULE_basicExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
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
		public Expr result;
		public VarRefContext lhs;
		public MaybeAssignmentContext rhs;
		public MaybeAddSubContext maybeAddSub;
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public MaybeAssignmentContext maybeAssignment() {
			return getRuleContext(MaybeAssignmentContext.class,0);
		}
		public MaybeAddSubContext maybeAddSub() {
			return getRuleContext(MaybeAddSubContext.class,0);
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
		enterRule(_localctx, 16, RULE_maybeAssignment);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(85);
				((MaybeAssignmentContext)_localctx).lhs = varRef(Attr.REF);
				setState(86);
				match(T__4);
				setState(87);
				((MaybeAssignmentContext)_localctx).rhs = maybeAssignment(Attr.VAL);
				 ((MaybeAssignmentContext)_localctx).result =  factory.createAssn(((MaybeAssignmentContext)_localctx).lhs.result, ((MaybeAssignmentContext)_localctx).rhs.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				((MaybeAssignmentContext)_localctx).maybeAddSub = maybeAddSub(attr);
				 ((MaybeAssignmentContext)_localctx).result =  ((MaybeAssignmentContext)_localctx).maybeAddSub.result; 
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
		public Expr result;
		public BinaryOperandContext binaryOperand;
		public Token op;
		public BinaryOperandContext rhs;
		public List<BinaryOperandContext> binaryOperand() {
			return getRuleContexts(BinaryOperandContext.class);
		}
		public BinaryOperandContext binaryOperand(int i) {
			return getRuleContext(BinaryOperandContext.class,i);
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
		enterRule(_localctx, 18, RULE_maybeAddSub);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				((MaybeAddSubContext)_localctx).binaryOperand = binaryOperand(attr);
				 ((MaybeAddSubContext)_localctx).result =  ((MaybeAddSubContext)_localctx).binaryOperand.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(99);
				((MaybeAddSubContext)_localctx).binaryOperand = binaryOperand(Attr.VAL);
				 ((MaybeAddSubContext)_localctx).result =  ((MaybeAddSubContext)_localctx).binaryOperand.result; 
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101);
					((MaybeAddSubContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__6) ) {
						((MaybeAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(102);
					((MaybeAddSubContext)_localctx).rhs = ((MaybeAddSubContext)_localctx).binaryOperand = binaryOperand(Attr.VAL);

					    ((MaybeAddSubContext)_localctx).result =  factory.createBinary(((MaybeAddSubContext)_localctx).op, _localctx.result, ((MaybeAddSubContext)_localctx).rhs.result);
					  
					}
					}
					setState(107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 || _la==T__6 );
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
		public Expr result;
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
		enterRule(_localctx, 20, RULE_binaryOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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
		public Expr result;
		public PrimaryContext primary;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
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
		enterRule(_localctx, 22, RULE_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((PostfixExpressionContext)_localctx).primary = primary(attr);
			 ((PostfixExpressionContext)_localctx).result =  ((PostfixExpressionContext)_localctx).primary.result; 
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
		public Expr result;
		public Const_Context const_;
		public StringLiteralContext stringLiteral;
		public CharLiteralContext charLiteral;
		public VarRefContext varRef;
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
		public PrimaryContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PrimaryContext(ParserRuleContext parent, int invokingState, Attr attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary(Attr attr) throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState(), attr);
		enterRule(_localctx, 24, RULE_primary);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(118);
				((PrimaryContext)_localctx).const_ = const_();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).const_.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(122);
				((PrimaryContext)_localctx).stringLiteral = stringLiteral();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).stringLiteral.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(126);
				((PrimaryContext)_localctx).charLiteral = charLiteral();
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).charLiteral.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				((PrimaryContext)_localctx).varRef = varRef(attr);
				 ((PrimaryContext)_localctx).result =  ((PrimaryContext)_localctx).varRef.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(133);
				match(T__7);
				 ((PrimaryContext)_localctx).result =  new Const(1); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				if (!(_localctx.attr != Attr.REF)) throw new FailedPredicateException(this, "$attr != Attr.REF");
				setState(136);
				match(T__8);
				 ((PrimaryContext)_localctx).result =  new Const(0); 
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
		public Const result;
		public Token DECIMAL;
		public TerminalNode DECIMAL() { return getToken(LamaLanguageParser.DECIMAL, 0); }
		public Const_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_; }
	}

	public final Const_Context const_() throws RecognitionException {
		Const_Context _localctx = new Const_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_const_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((Const_Context)_localctx).DECIMAL = match(DECIMAL);
			 ((Const_Context)_localctx).result =  factory.createConst(((Const_Context)_localctx).DECIMAL); 
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
		public StringLiteral result;
		public Token STRING;
		public TerminalNode STRING() { return getToken(LamaLanguageParser.STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
		public Const result;
		public Token CHAR;
		public TerminalNode CHAR() { return getToken(LamaLanguageParser.CHAR, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_charLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
		public Expr result;
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
		enterRule(_localctx, 32, RULE_varRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((VarRefContext)_localctx).LIDENT = match(LIDENT);

			  LocalVarRef ref = factory.createLocalVarRef(((VarRefContext)_localctx).LIDENT);
			  if (attr == Attr.REF)
			    ((VarRefContext)_localctx).result =  ref;
			  else
			    ((VarRefContext)_localctx).result =  factory.createVarRead(ref);
			  
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
		case 8:
			return maybeAssignment_sempred((MaybeAssignmentContext)_localctx, predIndex);
		case 9:
			return maybeAddSub_sempred((MaybeAddSubContext)_localctx, predIndex);
		case 12:
			return primary_sempred((PrimaryContext)_localctx, predIndex);
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
	private boolean maybeAddSub_sempred(MaybeAddSubContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}
	private boolean primary_sempred(PrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return _localctx.attr != Attr.REF;
		case 3:
			return _localctx.attr != Attr.REF;
		case 4:
			return _localctx.attr != Attr.REF;
		case 5:
			return _localctx.attr != Attr.REF;
		case 6:
			return _localctx.attr != Attr.REF;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0011\u0099\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t"+
		"\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004<\b\u0004\n\u0004\f\u0004?\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005D\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006P\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b^\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\tj\b\t"+
		"\u000b\t\f\tk\u0003\tn\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u008b\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \u0000\u0001\u0001\u0000\u0006\u0007\u0094\u0000\"\u0001\u0000"+
		"\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000"+
		"\u00064\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\n@\u0001\u0000"+
		"\u0000\u0000\fO\u0001\u0000\u0000\u0000\u000eQ\u0001\u0000\u0000\u0000"+
		"\u0010]\u0001\u0000\u0000\u0000\u0012m\u0001\u0000\u0000\u0000\u0014o"+
		"\u0001\u0000\u0000\u0000\u0016r\u0001\u0000\u0000\u0000\u0018\u008a\u0001"+
		"\u0000\u0000\u0000\u001a\u008c\u0001\u0000\u0000\u0000\u001c\u008f\u0001"+
		"\u0000\u0000\u0000\u001e\u0092\u0001\u0000\u0000\u0000 \u0095\u0001\u0000"+
		"\u0000\u0000\"#\u0003\u0002\u0001\u0000#$\u0006\u0000\uffff\uffff\u0000"+
		"$%\u0005\u0000\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&*\u0006\u0001"+
		"\uffff\uffff\u0000\')\u0003\u0004\u0002\u0000(\'\u0001\u0000\u0000\u0000"+
		"),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-/\u0003\f\u0006"+
		"\u0000.-\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u000001\u0006\u0001\uffff\uffff\u00001\u0003\u0001\u0000\u0000"+
		"\u000023\u0003\u0006\u0003\u00003\u0005\u0001\u0000\u0000\u000045\u0005"+
		"\u0001\u0000\u000056\u0003\b\u0004\u000067\u0005\u0002\u0000\u00007\u0007"+
		"\u0001\u0000\u0000\u00008=\u0003\n\u0005\u00009:\u0005\u0003\u0000\u0000"+
		":<\u0003\n\u0005\u0000;9\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\t\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000@C\u0005\u000e\u0000\u0000AB\u0005\u0004"+
		"\u0000\u0000BD\u0003\u000e\u0007\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0006\u0005\uffff\uffff"+
		"\u0000F\u000b\u0001\u0000\u0000\u0000GH\u0003\u000e\u0007\u0000HI\u0006"+
		"\u0006\uffff\uffff\u0000IP\u0001\u0000\u0000\u0000JK\u0003\u000e\u0007"+
		"\u0000KL\u0005\u0002\u0000\u0000LM\u0003\f\u0006\u0000MN\u0006\u0006\uffff"+
		"\uffff\u0000NP\u0001\u0000\u0000\u0000OG\u0001\u0000\u0000\u0000OJ\u0001"+
		"\u0000\u0000\u0000P\r\u0001\u0000\u0000\u0000QR\u0003\u0010\b\u0000RS"+
		"\u0006\u0007\uffff\uffff\u0000S\u000f\u0001\u0000\u0000\u0000TU\u0004"+
		"\b\u0000\u0001UV\u0003 \u0010\u0000VW\u0005\u0005\u0000\u0000WX\u0003"+
		"\u0010\b\u0000XY\u0006\b\uffff\uffff\u0000Y^\u0001\u0000\u0000\u0000Z"+
		"[\u0003\u0012\t\u0000[\\\u0006\b\uffff\uffff\u0000\\^\u0001\u0000\u0000"+
		"\u0000]T\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000^\u0011\u0001"+
		"\u0000\u0000\u0000_`\u0003\u0014\n\u0000`a\u0006\t\uffff\uffff\u0000a"+
		"n\u0001\u0000\u0000\u0000bc\u0004\t\u0001\u0001cd\u0003\u0014\n\u0000"+
		"di\u0006\t\uffff\uffff\u0000ef\u0007\u0000\u0000\u0000fg\u0003\u0014\n"+
		"\u0000gh\u0006\t\uffff\uffff\u0000hj\u0001\u0000\u0000\u0000ie\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000m_\u0001\u0000\u0000\u0000"+
		"mb\u0001\u0000\u0000\u0000n\u0013\u0001\u0000\u0000\u0000op\u0003\u0016"+
		"\u000b\u0000pq\u0006\n\uffff\uffff\u0000q\u0015\u0001\u0000\u0000\u0000"+
		"rs\u0003\u0018\f\u0000st\u0006\u000b\uffff\uffff\u0000t\u0017\u0001\u0000"+
		"\u0000\u0000uv\u0004\f\u0002\u0001vw\u0003\u001a\r\u0000wx\u0006\f\uffff"+
		"\uffff\u0000x\u008b\u0001\u0000\u0000\u0000yz\u0004\f\u0003\u0001z{\u0003"+
		"\u001c\u000e\u0000{|\u0006\f\uffff\uffff\u0000|\u008b\u0001\u0000\u0000"+
		"\u0000}~\u0004\f\u0004\u0001~\u007f\u0003\u001e\u000f\u0000\u007f\u0080"+
		"\u0006\f\uffff\uffff\u0000\u0080\u008b\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0003 \u0010\u0000\u0082\u0083\u0006\f\uffff\uffff\u0000\u0083\u008b"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0004\f\u0005\u0001\u0085\u0086\u0005"+
		"\b\u0000\u0000\u0086\u008b\u0006\f\uffff\uffff\u0000\u0087\u0088\u0004"+
		"\f\u0006\u0001\u0088\u0089\u0005\t\u0000\u0000\u0089\u008b\u0006\f\uffff"+
		"\uffff\u0000\u008au\u0001\u0000\u0000\u0000\u008ay\u0001\u0000\u0000\u0000"+
		"\u008a}\u0001\u0000\u0000\u0000\u008a\u0081\u0001\u0000\u0000\u0000\u008a"+
		"\u0084\u0001\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008b"+
		"\u0019\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u000f\u0000\u0000\u008d"+
		"\u008e\u0006\r\uffff\uffff\u0000\u008e\u001b\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u0010\u0000\u0000\u0090\u0091\u0006\u000e\uffff\uffff\u0000"+
		"\u0091\u001d\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0011\u0000\u0000"+
		"\u0093\u0094\u0006\u000f\uffff\uffff\u0000\u0094\u001f\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005\u000e\u0000\u0000\u0096\u0097\u0006\u0010\uffff"+
		"\uffff\u0000\u0097!\u0001\u0000\u0000\u0000\t*.=CO]km\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}