// Generated from /home/kenny/workspace/dna/src/main/java/grammar/Grammar.g4 by ANTLR 4.0
 package gen; 

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class GrammarBaseListener implements GrammarListener {
	@Override public void enterAminoacid(GrammarParser.AminoacidContext ctx) { }
	@Override public void exitAminoacid(GrammarParser.AminoacidContext ctx) { }

	@Override public void enterDna(GrammarParser.DnaContext ctx) { }
	@Override public void exitDna(GrammarParser.DnaContext ctx) { }

	@Override public void enterProtein(GrammarParser.ProteinContext ctx) { }
	@Override public void exitProtein(GrammarParser.ProteinContext ctx) { }

	@Override public void enterNucleotide(GrammarParser.NucleotideContext ctx) { }
	@Override public void exitNucleotide(GrammarParser.NucleotideContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}