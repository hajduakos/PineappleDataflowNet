/*
* generated by Xtext
*/
package hu.bme.mit.mdsd.pineapple.language.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DNLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.tokens");
	}
}
