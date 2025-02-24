// Generated from /home/danila/SPbU/year4/VM/simplelanguage/lamalanguage/src/main/java/ru/usachev63/lamatruffle/parser/LamaLanguage.g4 by ANTLR 4.13.2
package ru.usachev63.lamatruffle.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LamaLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WS=13, COMMENT=14, LINE_COMMENT=15, UIDENT=16, 
		LIDENT=17, DECIMAL=18, STRING=19, CHAR=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "WS", "COMMENT", "LINE_COMMENT", "NON_ZERO_DIGIT", 
			"DIGIT", "UIDENT", "LIDENT", "DECIMAL", "STRING", "CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "';'", "','", "'='", "':='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WS", "COMMENT", "LINE_COMMENT", "UIDENT", "LIDENT", "DECIMAL", 
			"STRING", "CHAR"
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


	public LamaLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LamaLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\fQ\b\f\u000b\f\f\f"+
		"R\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r[\b\r\n\r\f\r"+
		"^\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000ei\b\u000e\n\u000e\f\u000el\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0005\u0011v\b\u0011\n\u0011\f\u0011y\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0005\u0012}\b\u0012\n\u0012\f\u0012\u0080\t"+
		"\u0012\u0001\u0013\u0003\u0013\u0083\b\u0013\u0001\u0013\u0004\u0013\u0086"+
		"\b\u0013\u000b\u0013\f\u0013\u0087\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u008e\b\u0014\n\u0014\f\u0014\u0091\t\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u009d\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\\\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0000!\u0000#\u0010"+
		"%\u0011\'\u0012)\u0013+\u0014\u0001\u0000\t\u0003\u0000\t\n\f\r  \u0002"+
		"\u0000\n\n\r\r\u0001\u000019\u0001\u000009\u0001\u0000AZ\u0004\u00000"+
		"9AZ__az\u0001\u0000az\u0003\u0000\n\n\r\r\"\"\u0001\u0000\'\'\u00a9\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000"+
		"\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000"+
		"\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u0003"+
		"1\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u00075\u0001"+
		"\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b:\u0001\u0000\u0000"+
		"\u0000\r<\u0001\u0000\u0000\u0000\u000f>\u0001\u0000\u0000\u0000\u0011"+
		"@\u0001\u0000\u0000\u0000\u0013B\u0001\u0000\u0000\u0000\u0015D\u0001"+
		"\u0000\u0000\u0000\u0017I\u0001\u0000\u0000\u0000\u0019P\u0001\u0000\u0000"+
		"\u0000\u001bV\u0001\u0000\u0000\u0000\u001dd\u0001\u0000\u0000\u0000\u001f"+
		"o\u0001\u0000\u0000\u0000!q\u0001\u0000\u0000\u0000#s\u0001\u0000\u0000"+
		"\u0000%z\u0001\u0000\u0000\u0000\'\u0082\u0001\u0000\u0000\u0000)\u0089"+
		"\u0001\u0000\u0000\u0000+\u0094\u0001\u0000\u0000\u0000-.\u0005v\u0000"+
		"\u0000./\u0005a\u0000\u0000/0\u0005r\u0000\u00000\u0002\u0001\u0000\u0000"+
		"\u000012\u0005;\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0005,\u0000"+
		"\u00004\u0006\u0001\u0000\u0000\u000056\u0005=\u0000\u00006\b\u0001\u0000"+
		"\u0000\u000078\u0005:\u0000\u000089\u0005=\u0000\u00009\n\u0001\u0000"+
		"\u0000\u0000:;\u0005+\u0000\u0000;\f\u0001\u0000\u0000\u0000<=\u0005-"+
		"\u0000\u0000=\u000e\u0001\u0000\u0000\u0000>?\u0005*\u0000\u0000?\u0010"+
		"\u0001\u0000\u0000\u0000@A\u0005/\u0000\u0000A\u0012\u0001\u0000\u0000"+
		"\u0000BC\u0005%\u0000\u0000C\u0014\u0001\u0000\u0000\u0000DE\u0005t\u0000"+
		"\u0000EF\u0005r\u0000\u0000FG\u0005u\u0000\u0000GH\u0005e\u0000\u0000"+
		"H\u0016\u0001\u0000\u0000\u0000IJ\u0005f\u0000\u0000JK\u0005a\u0000\u0000"+
		"KL\u0005l\u0000\u0000LM\u0005s\u0000\u0000MN\u0005e\u0000\u0000N\u0018"+
		"\u0001\u0000\u0000\u0000OQ\u0007\u0000\u0000\u0000PO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0006\f\u0000\u0000U\u001a\u0001"+
		"\u0000\u0000\u0000VW\u0005(\u0000\u0000WX\u0005*\u0000\u0000X\\\u0001"+
		"\u0000\u0000\u0000Y[\t\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"]_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005*\u0000\u0000"+
		"`a\u0005)\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0006\r\u0000\u0000"+
		"c\u001c\u0001\u0000\u0000\u0000de\u0005-\u0000\u0000ef\u0005-\u0000\u0000"+
		"fj\u0001\u0000\u0000\u0000gi\b\u0001\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0006\u000e"+
		"\u0000\u0000n\u001e\u0001\u0000\u0000\u0000op\u0007\u0002\u0000\u0000"+
		"p \u0001\u0000\u0000\u0000qr\u0007\u0003\u0000\u0000r\"\u0001\u0000\u0000"+
		"\u0000sw\u0007\u0004\u0000\u0000tv\u0007\u0005\u0000\u0000ut\u0001\u0000"+
		"\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000x$\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"z~\u0007\u0006\u0000\u0000{}\u0007\u0005\u0000\u0000|{\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f&\u0001\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0081\u0083\u0005-\u0000\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0007\u0003\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088(\u0001\u0000\u0000\u0000"+
		"\u0089\u008f\u0005\"\u0000\u0000\u008a\u008e\b\u0007\u0000\u0000\u008b"+
		"\u008c\u0005\"\u0000\u0000\u008c\u008e\u0005\"\u0000\u0000\u008d\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005\"\u0000\u0000\u0093*\u0001"+
		"\u0000\u0000\u0000\u0094\u009c\u0005\'\u0000\u0000\u0095\u009d\b\b\u0000"+
		"\u0000\u0096\u0097\u0005\'\u0000\u0000\u0097\u009d\u0005\'\u0000\u0000"+
		"\u0098\u0099\u0005\\\u0000\u0000\u0099\u009d\u0005n\u0000\u0000\u009a"+
		"\u009b\u0005\\\u0000\u0000\u009b\u009d\u0005t\u0000\u0000\u009c\u0095"+
		"\u0001\u0000\u0000\u0000\u009c\u0096\u0001\u0000\u0000\u0000\u009c\u0098"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005\'\u0000\u0000\u009f,\u0001"+
		"\u0000\u0000\u0000\u000b\u0000R\\jw~\u0082\u0087\u008d\u008f\u009c\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}