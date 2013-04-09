// Generated from /home/kenny/workspace/dna/src/main/java/grammar/Grammar.g4 by ANTLR 4.0
 package gen; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		A=1, T=2, C=3, G=4, ISO=5, LEU=6, VAL=7, PHE=8, MET=9, CYS=10, ALA=11, 
		GLY=12, PRO=13, THR=14, SER=15, TYR=16, TRY=17, GLN=18, ASN=19, HIS=20, 
		GLU=21, ASP=22, LYS=23, ARG=24, STOP=25, WS=26, OTHER=27;
	public static final String[] tokenNames = {
		"<INVALID>", "A", "T", "C", "G", "ISO", "LEU", "VAL", "PHE", "MET", "CYS", 
		"ALA", "GLY", "PRO", "THR", "SER", "TYR", "TRY", "GLN", "ASN", "HIS", 
		"GLU", "ASP", "LYS", "ARG", "STOP", "WS", "OTHER"
	};
	public static final int
		RULE_dna = 0, RULE_nucleotide = 1, RULE_aminoacid = 2, RULE_protein = 3;
	public static final String[] ruleNames = {
		"dna", "nucleotide", "aminoacid", "protein"
	};

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DnaContext extends ParserRuleContext {
		public NucleotideContext nucleotide(int i) {
			return getRuleContext(NucleotideContext.class,i);
		}
		public List<AminoacidContext> aminoacid() {
			return getRuleContexts(AminoacidContext.class);
		}
		public List<NucleotideContext> nucleotide() {
			return getRuleContexts(NucleotideContext.class);
		}
		public AminoacidContext aminoacid(int i) {
			return getRuleContext(AminoacidContext.class,i);
		}
		public DnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDna(this);
		}
	}

	public final DnaContext dna() throws RecognitionException {
		DnaContext _localctx = new DnaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(10);
				switch (_input.LA(1)) {
				case A:
				case T:
				case C:
				case G:
					{
					setState(8); nucleotide();
					}
					break;
				case ISO:
				case LEU:
				case VAL:
				case PHE:
				case MET:
				case CYS:
				case ALA:
				case GLY:
				case PRO:
				case THR:
				case SER:
				case TYR:
				case TRY:
				case GLN:
				case ASN:
				case HIS:
				case GLU:
				case ASP:
				case LYS:
				case ARG:
				case STOP:
					{
					setState(9); aminoacid();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(12); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << T) | (1L << C) | (1L << G) | (1L << ISO) | (1L << LEU) | (1L << VAL) | (1L << PHE) | (1L << MET) | (1L << CYS) | (1L << ALA) | (1L << GLY) | (1L << PRO) | (1L << THR) | (1L << SER) | (1L << TYR) | (1L << TRY) | (1L << GLN) | (1L << ASN) | (1L << HIS) | (1L << GLU) | (1L << ASP) | (1L << LYS) | (1L << ARG) | (1L << STOP))) != 0) );
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

	public static class NucleotideContext extends ParserRuleContext {
		public TerminalNode T() { return getToken(GrammarParser.T, 0); }
		public TerminalNode G() { return getToken(GrammarParser.G, 0); }
		public TerminalNode A() { return getToken(GrammarParser.A, 0); }
		public TerminalNode C() { return getToken(GrammarParser.C, 0); }
		public NucleotideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nucleotide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNucleotide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNucleotide(this);
		}
	}

	public final NucleotideContext nucleotide() throws RecognitionException {
		NucleotideContext _localctx = new NucleotideContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nucleotide);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << T) | (1L << C) | (1L << G))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AminoacidContext extends ParserRuleContext {
		public TerminalNode PHE() { return getToken(GrammarParser.PHE, 0); }
		public TerminalNode LYS() { return getToken(GrammarParser.LYS, 0); }
		public TerminalNode ARG() { return getToken(GrammarParser.ARG, 0); }
		public TerminalNode THR() { return getToken(GrammarParser.THR, 0); }
		public TerminalNode MET() { return getToken(GrammarParser.MET, 0); }
		public TerminalNode ASP() { return getToken(GrammarParser.ASP, 0); }
		public TerminalNode CYS() { return getToken(GrammarParser.CYS, 0); }
		public TerminalNode GLU() { return getToken(GrammarParser.GLU, 0); }
		public TerminalNode ASN() { return getToken(GrammarParser.ASN, 0); }
		public TerminalNode ISO() { return getToken(GrammarParser.ISO, 0); }
		public TerminalNode GLY() { return getToken(GrammarParser.GLY, 0); }
		public TerminalNode GLN() { return getToken(GrammarParser.GLN, 0); }
		public TerminalNode SER() { return getToken(GrammarParser.SER, 0); }
		public TerminalNode VAL() { return getToken(GrammarParser.VAL, 0); }
		public TerminalNode TYR() { return getToken(GrammarParser.TYR, 0); }
		public TerminalNode STOP() { return getToken(GrammarParser.STOP, 0); }
		public TerminalNode ALA() { return getToken(GrammarParser.ALA, 0); }
		public TerminalNode PRO() { return getToken(GrammarParser.PRO, 0); }
		public TerminalNode HIS() { return getToken(GrammarParser.HIS, 0); }
		public TerminalNode LEU() { return getToken(GrammarParser.LEU, 0); }
		public TerminalNode TRY() { return getToken(GrammarParser.TRY, 0); }
		public AminoacidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aminoacid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAminoacid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAminoacid(this);
		}
	}

	public final AminoacidContext aminoacid() throws RecognitionException {
		AminoacidContext _localctx = new AminoacidContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aminoacid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ISO) | (1L << LEU) | (1L << VAL) | (1L << PHE) | (1L << MET) | (1L << CYS) | (1L << ALA) | (1L << GLY) | (1L << PRO) | (1L << THR) | (1L << SER) | (1L << TYR) | (1L << TRY) | (1L << GLN) | (1L << ASN) | (1L << HIS) | (1L << GLU) | (1L << ASP) | (1L << LYS) | (1L << ARG) | (1L << STOP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ProteinContext extends ParserRuleContext {
		public List<AminoacidContext> aminoacid() {
			return getRuleContexts(AminoacidContext.class);
		}
		public AminoacidContext aminoacid(int i) {
			return getRuleContext(AminoacidContext.class,i);
		}
		public ProteinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protein; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProtein(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProtein(this);
		}
	}

	public final ProteinContext protein() throws RecognitionException {
		ProteinContext _localctx = new ProteinContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_protein);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18); aminoacid();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ISO) | (1L << LEU) | (1L << VAL) | (1L << PHE) | (1L << MET) | (1L << CYS) | (1L << ALA) | (1L << GLY) | (1L << PRO) | (1L << THR) | (1L << SER) | (1L << TYR) | (1L << TRY) | (1L << GLN) | (1L << ASN) | (1L << HIS) | (1L << GLU) | (1L << ASP) | (1L << LYS) | (1L << ARG) | (1L << STOP))) != 0) );
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

	public static final String _serializedATN =
		"\2\3\35\32\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\6\2\r\n\2\r\2\16\2"+
		"\16\3\3\3\3\3\4\3\4\3\5\6\5\26\n\5\r\5\16\5\27\3\5\2\6\2\4\6\b\2\4\3\3"+
		"\6\3\7\33\30\2\f\3\2\2\2\4\20\3\2\2\2\6\22\3\2\2\2\b\25\3\2\2\2\n\r\5"+
		"\4\3\2\13\r\5\6\4\2\f\n\3\2\2\2\f\13\3\2\2\2\r\16\3\2\2\2\16\f\3\2\2\2"+
		"\16\17\3\2\2\2\17\3\3\2\2\2\20\21\t\2\2\2\21\5\3\2\2\2\22\23\t\3\2\2\23"+
		"\7\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27"+
		"\30\3\2\2\2\30\t\3\2\2\2\5\f\16\27";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}