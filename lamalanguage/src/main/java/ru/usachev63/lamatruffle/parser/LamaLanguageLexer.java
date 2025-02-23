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
		DECIMAL=9, STRING=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "WS", "COMMENT", "LINE_COMMENT", "NON_ZERO_DIGIT", 
			"DIGIT", "UIDENT", "LIDENT", "DECIMAL", "STRING"
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
			"DECIMAL", "STRING"
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
		"\u0004\u0000\nf\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003#\b\u0003"+
		"\u000b\u0003\f\u0003$\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004-\b\u0004\n\u0004\f\u00040\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005;\b\u0005\n\u0005\f\u0005"+
		">\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0005\bH\b\b\n\b\f\bK\t\b\u0001\t\u0001\t"+
		"\u0005\tO\b\t\n\t\f\tR\t\t\u0001\n\u0003\nU\b\n\u0001\n\u0004\nX\b\n\u000b"+
		"\n\f\nY\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b`\b"+
		"\u000b\n\u000b\f\u000bc\t\u000b\u0001\u000b\u0001\u000b\u0001.\u0000\f"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0000\u000f\u0000\u0011\u0007\u0013\b\u0015\t\u0017\n\u0001\u0000\b\u0003"+
		"\u0000\t\n\f\r  \u0002\u0000\n\n\r\r\u0001\u000019\u0001\u000009\u0001"+
		"\u0000AZ\u0004\u000009AZ__az\u0001\u0000az\u0002\u0000\"\"^^l\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\u0011\u0001"+
		"\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001"+
		"\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001"+
		"\u0000\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005\u001f\u0001"+
		"\u0000\u0000\u0000\u0007\"\u0001\u0000\u0000\u0000\t(\u0001\u0000\u0000"+
		"\u0000\u000b6\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000f"+
		"C\u0001\u0000\u0000\u0000\u0011E\u0001\u0000\u0000\u0000\u0013L\u0001"+
		"\u0000\u0000\u0000\u0015T\u0001\u0000\u0000\u0000\u0017[\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0005v\u0000\u0000\u001a\u001b\u0005a\u0000\u0000\u001b"+
		"\u001c\u0005r\u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0005,\u0000\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0005;"+
		"\u0000\u0000 \u0006\u0001\u0000\u0000\u0000!#\u0007\u0000\u0000\u0000"+
		"\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0006\u0003"+
		"\u0000\u0000\'\b\u0001\u0000\u0000\u0000()\u0005(\u0000\u0000)*\u0005"+
		"*\u0000\u0000*.\u0001\u0000\u0000\u0000+-\t\u0000\u0000\u0000,+\u0001"+
		"\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000012\u0005*\u0000\u000023\u0005)\u0000\u000034\u0001\u0000\u0000\u0000"+
		"45\u0006\u0004\u0000\u00005\n\u0001\u0000\u0000\u000067\u0005-\u0000\u0000"+
		"78\u0005-\u0000\u00008<\u0001\u0000\u0000\u00009;\b\u0001\u0000\u0000"+
		":9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000?@\u0006\u0005\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0007"+
		"\u0002\u0000\u0000B\u000e\u0001\u0000\u0000\u0000CD\u0007\u0003\u0000"+
		"\u0000D\u0010\u0001\u0000\u0000\u0000EI\u0007\u0004\u0000\u0000FH\u0007"+
		"\u0005\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0012\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000LP\u0007\u0006\u0000\u0000MO\u0007"+
		"\u0005\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u0014\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000SU\u0005-\u0000\u0000TS\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VX\u0007"+
		"\u0003\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0016\u0001\u0000"+
		"\u0000\u0000[a\u0005\"\u0000\u0000\\`\u0007\u0007\u0000\u0000]^\u0005"+
		"\"\u0000\u0000^`\u0005\"\u0000\u0000_\\\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000de\u0005\"\u0000\u0000e\u0018\u0001\u0000\u0000\u0000\n\u0000$."+
		"<IPTY_a\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}