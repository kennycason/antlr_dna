// Generated from /home/kenny/workspace/dna/src/main/java/grammar/Grammar.g4 by ANTLR 4.0
 package gen; 
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GrammarListener extends ParseTreeListener {
	void enterAminoacid(GrammarParser.AminoacidContext ctx);
	void exitAminoacid(GrammarParser.AminoacidContext ctx);

	void enterDna(GrammarParser.DnaContext ctx);
	void exitDna(GrammarParser.DnaContext ctx);

	void enterProtein(GrammarParser.ProteinContext ctx);
	void exitProtein(GrammarParser.ProteinContext ctx);

	void enterNucleotide(GrammarParser.NucleotideContext ctx);
	void exitNucleotide(GrammarParser.NucleotideContext ctx);
}