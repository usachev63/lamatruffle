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
		T__0=1, T__1=2, T__2=3, WS=4, COMMENT=5, LINE_COMMENT=6, UIDENT=7, LIDENT=8, 
		DECIMAL=9, STRING=10, CHAR=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "WS", "COMMENT", "LINE_COMMENT", "NON_ZERO_DIGIT", 
			"DIGIT", "UIDENT", "LIDENT", "DECIMAL", "STRING", "CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
		"\u0004\u0000\u000bt\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0004"+
		"\u0003%\b\u0003\u000b\u0003\f\u0003&\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004/\b\u0004\n\u0004\f\u0004"+
		"2\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005=\b\u0005"+
		"\n\u0005\f\u0005@\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bJ\b\b\n\b\f\bM\t\b\u0001"+
		"\t\u0001\t\u0005\tQ\b\t\n\t\f\tT\t\t\u0001\n\u0003\nW\b\n\u0001\n\u0004"+
		"\nZ\b\n\u000b\n\f\n[\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000bb\b\u000b\n\u000b\f\u000be\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fq\b"+
		"\f\u0001\f\u0001\f\u00010\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0000\u000f\u0000\u0011\u0007\u0013"+
		"\b\u0015\t\u0017\n\u0019\u000b\u0001\u0000\t\u0003\u0000\t\n\f\r  \u0002"+
		"\u0000\n\n\r\r\u0001\u000019\u0001\u000009\u0001\u0000AZ\u0004\u00000"+
		"9AZ__az\u0001\u0000az\u0003\u0000\n\n\r\r\"\"\u0001\u0000\'\'}\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\u0011\u0001"+
		"\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001"+
		"\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001"+
		"\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003\u001f\u0001"+
		"\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000\u0007$\u0001\u0000\u0000"+
		"\u0000\t*\u0001\u0000\u0000\u0000\u000b8\u0001\u0000\u0000\u0000\rC\u0001"+
		"\u0000\u0000\u0000\u000fE\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000"+
		"\u0000\u0013N\u0001\u0000\u0000\u0000\u0015V\u0001\u0000\u0000\u0000\u0017"+
		"]\u0001\u0000\u0000\u0000\u0019h\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"v\u0000\u0000\u001c\u001d\u0005a\u0000\u0000\u001d\u001e\u0005r\u0000"+
		"\u0000\u001e\u0002\u0001\u0000\u0000\u0000\u001f \u0005,\u0000\u0000 "+
		"\u0004\u0001\u0000\u0000\u0000!\"\u0005;\u0000\u0000\"\u0006\u0001\u0000"+
		"\u0000\u0000#%\u0007\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'(\u0001\u0000\u0000\u0000()\u0006\u0003\u0000\u0000)\b\u0001\u0000\u0000"+
		"\u0000*+\u0005(\u0000\u0000+,\u0005*\u0000\u0000,0\u0001\u0000\u0000\u0000"+
		"-/\t\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000013\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000034\u0005*\u0000\u000045\u0005)\u0000\u0000"+
		"56\u0001\u0000\u0000\u000067\u0006\u0004\u0000\u00007\n\u0001\u0000\u0000"+
		"\u000089\u0005-\u0000\u00009:\u0005-\u0000\u0000:>\u0001\u0000\u0000\u0000"+
		";=\b\u0001\u0000\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000AB\u0006\u0005\u0000\u0000B\f\u0001\u0000"+
		"\u0000\u0000CD\u0007\u0002\u0000\u0000D\u000e\u0001\u0000\u0000\u0000"+
		"EF\u0007\u0003\u0000\u0000F\u0010\u0001\u0000\u0000\u0000GK\u0007\u0004"+
		"\u0000\u0000HJ\u0007\u0005\u0000\u0000IH\u0001\u0000\u0000\u0000JM\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"L\u0012\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NR\u0007\u0006"+
		"\u0000\u0000OQ\u0007\u0005\u0000\u0000PO\u0001\u0000\u0000\u0000QT\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"S\u0014\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UW\u0005-\u0000"+
		"\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000"+
		"\u0000\u0000XZ\u0007\u0003\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\\u0016\u0001\u0000\u0000\u0000]c\u0005\"\u0000\u0000^b\b\u0007\u0000"+
		"\u0000_`\u0005\"\u0000\u0000`b\u0005\"\u0000\u0000a^\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000fg\u0005\"\u0000\u0000g\u0018\u0001\u0000\u0000\u0000"+
		"hp\u0005\'\u0000\u0000iq\b\b\u0000\u0000jk\u0005\'\u0000\u0000kq\u0005"+
		"\'\u0000\u0000lm\u0005\\\u0000\u0000mq\u0005n\u0000\u0000no\u0005\\\u0000"+
		"\u0000oq\u0005t\u0000\u0000pi\u0001\u0000\u0000\u0000pj\u0001\u0000\u0000"+
		"\u0000pl\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rs\u0005\'\u0000\u0000s\u001a\u0001\u0000\u0000\u0000\u000b"+
		"\u0000&0>KRV[acp\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}