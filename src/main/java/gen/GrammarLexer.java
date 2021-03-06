// Generated from /home/kenny/workspace/dna/src/main/java/grammar/Grammar.g4 by ANTLR 4.0
 package gen; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		A=1, T=2, C=3, G=4, ISO=5, LEU=6, VAL=7, PHE=8, MET=9, CYS=10, ALA=11, 
		GLY=12, PRO=13, THR=14, SER=15, TYR=16, TRY=17, GLN=18, ASN=19, HIS=20, 
		GLU=21, ASP=22, LYS=23, ARG=24, STOP=25, WS=26, OTHER=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"A", "T", "C", "G", "ISO", "LEU", "VAL", "PHE", "MET", "CYS", "ALA", "GLY", 
		"PRO", "THR", "SER", "TYR", "TRY", "GLN", "ASN", "HIS", "GLU", "ASP", 
		"LYS", "ARG", "STOP", "WS", "OTHER"
	};
	public static final String[] ruleNames = {
		"A", "T", "C", "G", "ISO", "LEU", "VAL", "PHE", "MET", "CYS", "ALA", "GLY", 
		"PRO", "THR", "SER", "TYR", "TRY", "GLN", "ASN", "HIS", "GLU", "ASP", 
		"LYS", "ARG", "STOP", "WS", "OTHER"
	};





	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 25: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\35\u0170\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"N\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bz\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0084\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u0092\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00a4\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c8\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00da\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00f4\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00fe\n"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u010c"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0116\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0120\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u012a\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0134\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013e\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0158\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0166"+
		"\n\32\3\33\6\33\u0169\n\33\r\33\16\33\u016a\3\33\3\33\3\34\3\34\2\35\3"+
		"\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r"+
		"\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\2\67\35\1\3\2\3\5\13\f\16\17\"\""+
		"\u019b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2"+
		"\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13M\3\2\2\2\rg\3\2\2\2\17y\3\2\2\2"+
		"\21\u0083\3\2\2\2\23\u0085\3\2\2\2\25\u0091\3\2\2\2\27\u00a3\3\2\2\2\31"+
		"\u00b5\3\2\2\2\33\u00c7\3\2\2\2\35\u00d9\3\2\2\2\37\u00f3\3\2\2\2!\u00fd"+
		"\3\2\2\2#\u00ff\3\2\2\2%\u010b\3\2\2\2\'\u0115\3\2\2\2)\u011f\3\2\2\2"+
		"+\u0129\3\2\2\2-\u0133\3\2\2\2/\u013d\3\2\2\2\61\u0157\3\2\2\2\63\u0165"+
		"\3\2\2\2\65\u0168\3\2\2\2\67\u016e\3\2\2\29:\7C\2\2:\4\3\2\2\2;<\7V\2"+
		"\2<\6\3\2\2\2=>\7E\2\2>\b\3\2\2\2?@\7I\2\2@\n\3\2\2\2AB\5\3\2\2BC\5\5"+
		"\3\2CD\5\5\3\2DN\3\2\2\2EF\5\3\2\2FG\5\5\3\2GH\5\7\4\2HN\3\2\2\2IJ\5\3"+
		"\2\2JK\5\5\3\2KL\5\3\2\2LN\3\2\2\2MA\3\2\2\2ME\3\2\2\2MI\3\2\2\2N\f\3"+
		"\2\2\2OP\5\7\4\2PQ\5\5\3\2QR\5\5\3\2Rh\3\2\2\2ST\5\7\4\2TU\5\5\3\2UV\5"+
		"\7\4\2Vh\3\2\2\2WX\5\7\4\2XY\5\5\3\2YZ\5\3\2\2Zh\3\2\2\2[\\\5\7\4\2\\"+
		"]\5\5\3\2]^\5\t\5\2^h\3\2\2\2_`\5\5\3\2`a\5\5\3\2ab\5\3\2\2bh\3\2\2\2"+
		"cd\5\5\3\2de\5\5\3\2ef\5\t\5\2fh\3\2\2\2gO\3\2\2\2gS\3\2\2\2gW\3\2\2\2"+
		"g[\3\2\2\2g_\3\2\2\2gc\3\2\2\2h\16\3\2\2\2ij\5\t\5\2jk\5\5\3\2kl\5\5\3"+
		"\2lz\3\2\2\2mn\5\t\5\2no\5\5\3\2op\5\7\4\2pz\3\2\2\2qr\5\t\5\2rs\5\5\3"+
		"\2st\5\3\2\2tz\3\2\2\2uv\5\t\5\2vw\5\5\3\2wx\5\t\5\2xz\3\2\2\2yi\3\2\2"+
		"\2ym\3\2\2\2yq\3\2\2\2yu\3\2\2\2z\20\3\2\2\2{|\5\5\3\2|}\5\5\3\2}~\5\5"+
		"\3\2~\u0084\3\2\2\2\177\u0080\5\5\3\2\u0080\u0081\5\5\3\2\u0081\u0082"+
		"\5\7\4\2\u0082\u0084\3\2\2\2\u0083{\3\2\2\2\u0083\177\3\2\2\2\u0084\22"+
		"\3\2\2\2\u0085\u0086\5\3\2\2\u0086\u0087\5\5\3\2\u0087\u0088\5\t\5\2\u0088"+
		"\24\3\2\2\2\u0089\u008a\5\5\3\2\u008a\u008b\5\t\5\2\u008b\u008c\5\5\3"+
		"\2\u008c\u0092\3\2\2\2\u008d\u008e\5\5\3\2\u008e\u008f\5\t\5\2\u008f\u0090"+
		"\5\7\4\2\u0090\u0092\3\2\2\2\u0091\u0089\3\2\2\2\u0091\u008d\3\2\2\2\u0092"+
		"\26\3\2\2\2\u0093\u0094\5\t\5\2\u0094\u0095\5\7\4\2\u0095\u0096\5\5\3"+
		"\2\u0096\u00a4\3\2\2\2\u0097\u0098\5\t\5\2\u0098\u0099\5\7\4\2\u0099\u009a"+
		"\5\7\4\2\u009a\u00a4\3\2\2\2\u009b\u009c\5\t\5\2\u009c\u009d\5\7\4\2\u009d"+
		"\u009e\5\3\2\2\u009e\u00a4\3\2\2\2\u009f\u00a0\5\t\5\2\u00a0\u00a1\5\7"+
		"\4\2\u00a1\u00a2\5\t\5\2\u00a2\u00a4\3\2\2\2\u00a3\u0093\3\2\2\2\u00a3"+
		"\u0097\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\30\3\2\2"+
		"\2\u00a5\u00a6\5\t\5\2\u00a6\u00a7\5\t\5\2\u00a7\u00a8\5\5\3\2\u00a8\u00b6"+
		"\3\2\2\2\u00a9\u00aa\5\t\5\2\u00aa\u00ab\5\t\5\2\u00ab\u00ac\5\7\4\2\u00ac"+
		"\u00b6\3\2\2\2\u00ad\u00ae\5\t\5\2\u00ae\u00af\5\t\5\2\u00af\u00b0\5\3"+
		"\2\2\u00b0\u00b6\3\2\2\2\u00b1\u00b2\5\t\5\2\u00b2\u00b3\5\t\5\2\u00b3"+
		"\u00b4\5\t\5\2\u00b4\u00b6\3\2\2\2\u00b5\u00a5\3\2\2\2\u00b5\u00a9\3\2"+
		"\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\32\3\2\2\2\u00b7\u00b8"+
		"\5\7\4\2\u00b8\u00b9\5\7\4\2\u00b9\u00ba\5\5\3\2\u00ba\u00c8\3\2\2\2\u00bb"+
		"\u00bc\5\7\4\2\u00bc\u00bd\5\7\4\2\u00bd\u00be\5\7\4\2\u00be\u00c8\3\2"+
		"\2\2\u00bf\u00c0\5\7\4\2\u00c0\u00c1\5\7\4\2\u00c1\u00c2\5\3\2\2\u00c2"+
		"\u00c8\3\2\2\2\u00c3\u00c4\5\7\4\2\u00c4\u00c5\5\7\4\2\u00c5\u00c6\5\t"+
		"\5\2\u00c6\u00c8\3\2\2\2\u00c7\u00b7\3\2\2\2\u00c7\u00bb\3\2\2\2\u00c7"+
		"\u00bf\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\34\3\2\2\2\u00c9\u00ca\5\3\2"+
		"\2\u00ca\u00cb\5\7\4\2\u00cb\u00cc\5\5\3\2\u00cc\u00da\3\2\2\2\u00cd\u00ce"+
		"\5\3\2\2\u00ce\u00cf\5\7\4\2\u00cf\u00d0\5\7\4\2\u00d0\u00da\3\2\2\2\u00d1"+
		"\u00d2\5\3\2\2\u00d2\u00d3\5\7\4\2\u00d3\u00d4\5\3\2\2\u00d4\u00da\3\2"+
		"\2\2\u00d5\u00d6\5\3\2\2\u00d6\u00d7\5\7\4\2\u00d7\u00d8\5\t\5\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00c9\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00d1\3\2"+
		"\2\2\u00d9\u00d5\3\2\2\2\u00da\36\3\2\2\2\u00db\u00dc\5\5\3\2\u00dc\u00dd"+
		"\5\7\4\2\u00dd\u00de\5\5\3\2\u00de\u00f4\3\2\2\2\u00df\u00e0\5\5\3\2\u00e0"+
		"\u00e1\5\7\4\2\u00e1\u00e2\5\7\4\2\u00e2\u00f4\3\2\2\2\u00e3\u00e4\5\5"+
		"\3\2\u00e4\u00e5\5\7\4\2\u00e5\u00e6\5\3\2\2\u00e6\u00f4\3\2\2\2\u00e7"+
		"\u00e8\5\5\3\2\u00e8\u00e9\5\7\4\2\u00e9\u00ea\5\t\5\2\u00ea\u00f4\3\2"+
		"\2\2\u00eb\u00ec\5\3\2\2\u00ec\u00ed\5\t\5\2\u00ed\u00ee\5\5\3\2\u00ee"+
		"\u00f4\3\2\2\2\u00ef\u00f0\5\3\2\2\u00f0\u00f1\5\t\5\2\u00f1\u00f2\5\7"+
		"\4\2\u00f2\u00f4\3\2\2\2\u00f3\u00db\3\2\2\2\u00f3\u00df\3\2\2\2\u00f3"+
		"\u00e3\3\2\2\2\u00f3\u00e7\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ef\3\2"+
		"\2\2\u00f4 \3\2\2\2\u00f5\u00f6\5\5\3\2\u00f6\u00f7\5\3\2\2\u00f7\u00f8"+
		"\5\5\3\2\u00f8\u00fe\3\2\2\2\u00f9\u00fa\5\5\3\2\u00fa\u00fb\5\3\2\2\u00fb"+
		"\u00fc\5\7\4\2\u00fc\u00fe\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f9\3\2"+
		"\2\2\u00fe\"\3\2\2\2\u00ff\u0100\5\5\3\2\u0100\u0101\5\t\5\2\u0101\u0102"+
		"\5\t\5\2\u0102$\3\2\2\2\u0103\u0104\5\7\4\2\u0104\u0105\5\3\2\2\u0105"+
		"\u0106\5\3\2\2\u0106\u010c\3\2\2\2\u0107\u0108\5\7\4\2\u0108\u0109\5\3"+
		"\2\2\u0109\u010a\5\t\5\2\u010a\u010c\3\2\2\2\u010b\u0103\3\2\2\2\u010b"+
		"\u0107\3\2\2\2\u010c&\3\2\2\2\u010d\u010e\5\3\2\2\u010e\u010f\5\3\2\2"+
		"\u010f\u0110\5\5\3\2\u0110\u0116\3\2\2\2\u0111\u0112\5\3\2\2\u0112\u0113"+
		"\5\3\2\2\u0113\u0114\5\7\4\2\u0114\u0116\3\2\2\2\u0115\u010d\3\2\2\2\u0115"+
		"\u0111\3\2\2\2\u0116(\3\2\2\2\u0117\u0118\5\7\4\2\u0118\u0119\5\3\2\2"+
		"\u0119\u011a\5\5\3\2\u011a\u0120\3\2\2\2\u011b\u011c\5\7\4\2\u011c\u011d"+
		"\5\3\2\2\u011d\u011e\5\7\4\2\u011e\u0120\3\2\2\2\u011f\u0117\3\2\2\2\u011f"+
		"\u011b\3\2\2\2\u0120*\3\2\2\2\u0121\u0122\5\t\5\2\u0122\u0123\5\3\2\2"+
		"\u0123\u0124\5\3\2\2\u0124\u012a\3\2\2\2\u0125\u0126\5\t\5\2\u0126\u0127"+
		"\5\3\2\2\u0127\u0128\5\t\5\2\u0128\u012a\3\2\2\2\u0129\u0121\3\2\2\2\u0129"+
		"\u0125\3\2\2\2\u012a,\3\2\2\2\u012b\u012c\5\t\5\2\u012c\u012d\5\3\2\2"+
		"\u012d\u012e\5\5\3\2\u012e\u0134\3\2\2\2\u012f\u0130\5\t\5\2\u0130\u0131"+
		"\5\3\2\2\u0131\u0132\5\7\4\2\u0132\u0134\3\2\2\2\u0133\u012b\3\2\2\2\u0133"+
		"\u012f\3\2\2\2\u0134.\3\2\2\2\u0135\u0136\5\3\2\2\u0136\u0137\5\3\2\2"+
		"\u0137\u0138\5\3\2\2\u0138\u013e\3\2\2\2\u0139\u013a\5\3\2\2\u013a\u013b"+
		"\5\3\2\2\u013b\u013c\5\t\5\2\u013c\u013e\3\2\2\2\u013d\u0135\3\2\2\2\u013d"+
		"\u0139\3\2\2\2\u013e\60\3\2\2\2\u013f\u0140\5\7\4\2\u0140\u0141\5\t\5"+
		"\2\u0141\u0142\5\5\3\2\u0142\u0158\3\2\2\2\u0143\u0144\5\7\4\2\u0144\u0145"+
		"\5\t\5\2\u0145\u0146\5\7\4\2\u0146\u0158\3\2\2\2\u0147\u0148\5\7\4\2\u0148"+
		"\u0149\5\t\5\2\u0149\u014a\5\3\2\2\u014a\u0158\3\2\2\2\u014b\u014c\5\7"+
		"\4\2\u014c\u014d\5\t\5\2\u014d\u014e\5\t\5\2\u014e\u0158\3\2\2\2\u014f"+
		"\u0150\5\3\2\2\u0150\u0151\5\t\5\2\u0151\u0152\5\3\2\2\u0152\u0158\3\2"+
		"\2\2\u0153\u0154\5\3\2\2\u0154\u0155\5\t\5\2\u0155\u0156\5\t\5\2\u0156"+
		"\u0158\3\2\2\2\u0157\u013f\3\2\2\2\u0157\u0143\3\2\2\2\u0157\u0147\3\2"+
		"\2\2\u0157\u014b\3\2\2\2\u0157\u014f\3\2\2\2\u0157\u0153\3\2\2\2\u0158"+
		"\62\3\2\2\2\u0159\u015a\5\5\3\2\u015a\u015b\5\3\2\2\u015b\u015c\5\3\2"+
		"\2\u015c\u0166\3\2\2\2\u015d\u015e\5\5\3\2\u015e\u015f\5\3\2\2\u015f\u0160"+
		"\5\t\5\2\u0160\u0166\3\2\2\2\u0161\u0162\5\5\3\2\u0162\u0163\5\t\5\2\u0163"+
		"\u0164\5\3\2\2\u0164\u0166\3\2\2\2\u0165\u0159\3\2\2\2\u0165\u015d\3\2"+
		"\2\2\u0165\u0161\3\2\2\2\u0166\64\3\2\2\2\u0167\u0169\t\2\2\2\u0168\u0167"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016d\b\33\2\2\u016d\66\3\2\2\2\u016e\u016f\13\2"+
		"\2\2\u016f8\3\2\2\2\27\2Mgy\u0083\u0091\u00a3\u00b5\u00c7\u00d9\u00f3"+
		"\u00fd\u010b\u0115\u011f\u0129\u0133\u013d\u0157\u0165\u016a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}