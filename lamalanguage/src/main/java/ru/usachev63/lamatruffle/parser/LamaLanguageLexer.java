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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, WS=8, COMMENT=9, 
		LINE_COMMENT=10, UIDENT=11, LIDENT=12, DECIMAL=13, STRING=14, CHAR=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "WS", "COMMENT", 
			"LINE_COMMENT", "NON_ZERO_DIGIT", "DIGIT", "UIDENT", "LIDENT", "DECIMAL", 
			"STRING", "CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "';'", "','", "'='", "':='", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
		"\u0004\u0000\u000f\u008c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007"+
		"=\b\u0007\u000b\u0007\f\u0007>\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\bG\b\b\n\b\f\bJ\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tU\b\t\n\t\f\tX\t\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005"+
		"\fb\b\f\n\f\f\fe\t\f\u0001\r\u0001\r\u0005\ri\b\r\n\r\f\rl\t\r\u0001\u000e"+
		"\u0003\u000eo\b\u000e\u0001\u000e\u0004\u000er\b\u000e\u000b\u000e\f\u000e"+
		"s\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000fz\b\u000f"+
		"\n\u000f\f\u000f}\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0089\b\u0010\u0001\u0010\u0001\u0010\u0001H\u0000\u0011"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u0000\u0017\u0000\u0019\u000b\u001b"+
		"\f\u001d\r\u001f\u000e!\u000f\u0001\u0000\t\u0003\u0000\t\n\f\r  \u0002"+
		"\u0000\n\n\r\r\u0001\u000019\u0001\u000009\u0001\u0000AZ\u0004\u00000"+
		"9AZ__az\u0001\u0000az\u0003\u0000\n\n\r\r\"\"\u0001\u0000\'\'\u0095\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000"+
		"\u0000\u0000\u0005)\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000"+
		"\t-\u0001\u0000\u0000\u0000\u000b0\u0001\u0000\u0000\u0000\r5\u0001\u0000"+
		"\u0000\u0000\u000f<\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000"+
		"\u0013P\u0001\u0000\u0000\u0000\u0015[\u0001\u0000\u0000\u0000\u0017]"+
		"\u0001\u0000\u0000\u0000\u0019_\u0001\u0000\u0000\u0000\u001bf\u0001\u0000"+
		"\u0000\u0000\u001dn\u0001\u0000\u0000\u0000\u001fu\u0001\u0000\u0000\u0000"+
		"!\u0080\u0001\u0000\u0000\u0000#$\u0005v\u0000\u0000$%\u0005a\u0000\u0000"+
		"%&\u0005r\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005;\u0000\u0000"+
		"(\u0004\u0001\u0000\u0000\u0000)*\u0005,\u0000\u0000*\u0006\u0001\u0000"+
		"\u0000\u0000+,\u0005=\u0000\u0000,\b\u0001\u0000\u0000\u0000-.\u0005:"+
		"\u0000\u0000./\u0005=\u0000\u0000/\n\u0001\u0000\u0000\u000001\u0005t"+
		"\u0000\u000012\u0005r\u0000\u000023\u0005u\u0000\u000034\u0005e\u0000"+
		"\u00004\f\u0001\u0000\u0000\u000056\u0005f\u0000\u000067\u0005a\u0000"+
		"\u000078\u0005l\u0000\u000089\u0005s\u0000\u00009:\u0005e\u0000\u0000"+
		":\u000e\u0001\u0000\u0000\u0000;=\u0007\u0000\u0000\u0000<;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0006\u0007\u0000\u0000"+
		"A\u0010\u0001\u0000\u0000\u0000BC\u0005(\u0000\u0000CD\u0005*\u0000\u0000"+
		"DH\u0001\u0000\u0000\u0000EG\t\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000"+
		"GJ\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0005*\u0000"+
		"\u0000LM\u0005)\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0006\b\u0000"+
		"\u0000O\u0012\u0001\u0000\u0000\u0000PQ\u0005-\u0000\u0000QR\u0005-\u0000"+
		"\u0000RV\u0001\u0000\u0000\u0000SU\b\u0001\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0006"+
		"\t\u0000\u0000Z\u0014\u0001\u0000\u0000\u0000[\\\u0007\u0002\u0000\u0000"+
		"\\\u0016\u0001\u0000\u0000\u0000]^\u0007\u0003\u0000\u0000^\u0018\u0001"+
		"\u0000\u0000\u0000_c\u0007\u0004\u0000\u0000`b\u0007\u0005\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000d\u001a\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000fj\u0007\u0006\u0000\u0000gi\u0007\u0005\u0000\u0000"+
		"hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000k\u001c\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000mo\u0005-\u0000\u0000nm\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pr\u0007\u0003\u0000\u0000"+
		"qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000t\u001e\u0001\u0000\u0000\u0000u{\u0005"+
		"\"\u0000\u0000vz\b\u0007\u0000\u0000wx\u0005\"\u0000\u0000xz\u0005\"\u0000"+
		"\u0000yv\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z}\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005\"\u0000\u0000"+
		"\u007f \u0001\u0000\u0000\u0000\u0080\u0088\u0005\'\u0000\u0000\u0081"+
		"\u0089\b\b\u0000\u0000\u0082\u0083\u0005\'\u0000\u0000\u0083\u0089\u0005"+
		"\'\u0000\u0000\u0084\u0085\u0005\\\u0000\u0000\u0085\u0089\u0005n\u0000"+
		"\u0000\u0086\u0087\u0005\\\u0000\u0000\u0087\u0089\u0005t\u0000\u0000"+
		"\u0088\u0081\u0001\u0000\u0000\u0000\u0088\u0082\u0001\u0000\u0000\u0000"+
		"\u0088\u0084\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0005\'\u0000\u0000\u008b"+
		"\"\u0001\u0000\u0000\u0000\u000b\u0000>HVcjnsy{\u0088\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}