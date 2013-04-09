package grammar;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import gen.GrammarLexer;
import gen.GrammarParser;

import java.util.List;

import lib.FileUtils;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;


public class GrammarTest {

	private TokenMapper mapper = new TokenMapper(FileUtils.pwd() + "src/main/java/gen/Grammar.tokens");
	
	@Test
	public void test() {
		
		assertTrue(isDNA("ATGCCTTA"));
		assertTrue(isDNA("TATACGCGTA"));
		assertTrue(isAminoAcid("TTT"));
		assertTrue(isProtein("GACCACGAA"));
		assertFalse(isDNA("NOTDNA"));
	}

	private void printTokens(CommonTokenStream tokenStream) {
		tokenStream.fill();
		List<Token> tokens = tokenStream.getTokens();
		// System.out.println("parsed: " + tokens.size() + " tokens");
		for(Token token : tokens) {
			System.out.print(mapper.type(token.getType()) + " [" + token.getText() + "], ");
		}
		System.out.println();
	}
	
	private GrammarParser getParser(String query) {
		CharStream stream = new ANTLRInputStream(query);
		GrammarLexer lexer = new GrammarLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		printTokens(tokens);
		GrammarParser parser = new GrammarParser(tokens);
		parser.setErrorHandler(new BailErrorStrategy());
		return parser;
	}

	public boolean isDNA(String query) {
		try {
			getParser(query).dna();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(query + ": FALSE");
			return false;
		}
		System.out.println(query + ": TRUE");
		return true;
	}
	
	public boolean isAminoAcid(String query) {
		try {
			getParser(query).aminoacid();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(query + ": FALSE");
			return false;
		}
		System.out.println(query + ": TRUE");
		return true;
	}
	
	public boolean isProtein(String query) {
		try {
			getParser(query).protein();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(query + ": FALSE");
			return false;
		}
		System.out.println(query + ": TRUE");
		return true;
	}
	
}
