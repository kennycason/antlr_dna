package grammar;

import lib.FileUtils;

import org.antlr.v4.Tool;
import org.apache.log4j.Logger;

public class Generator {

	private static final String INPUT = FileUtils.pwd()
			+ "src/main/java/grammar/Grammar.g4";

	private static final String OUTPUT = FileUtils.pwd()
			+ "src/main/java/gen/";

	private static final Logger LOGGER = Logger.getLogger(Generator.class);

	public static void main(String[] args) {
		new Generator();
	}

	/**
	 * http://stackoverflow.com/questions/7283478/scanner-lexing-keywords-with-
	 * antlr
	 */
	public Generator() {
		LOGGER.info(INPUT);
		LOGGER.info(OUTPUT);
		Tool.main(new String[] { "-o", OUTPUT, INPUT });
	}

}
