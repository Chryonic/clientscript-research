package mgi.tools.jagcsc.analyzer;

import mgi.tools.jagcsc.Compiler;
import mgi.tools.jagcsc.CompilerException;
import mgi.tools.jagcsc.OutputMessage;
import mgi.tools.jagcsc.tokens.*;
import mgi.utilities.Bag;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Includes analyzer purpose is to quickly analyze
 * lexical analyzer product and replace include tokens with tokens from the requested files.
 */
public class IncludesAnalyzer {

	/**
	 * Contains our compiler instance from which we pick needed information.
	 */
	public Compiler compiler;
	/**
	 * Contains lexical analyzer which product will be modified.
	 */
	public LexicalAnalyzer analyzer;
	/**
	 * Contains list of full file patches which were included. 
	 */
	public List<String> parsedIncludes = new ArrayList<String>();
	
	public IncludesAnalyzer(Compiler compiler,LexicalAnalyzer analyzer) {
		this.compiler = compiler;
		this.analyzer = analyzer;
	}
	
	public void analyze() throws CompilerException {
		for (;;) {
			if (this.analyzeIncludes() <= 0)
				return;
		}
	}
	
	private int analyzeIncludes() throws CompilerException {
		Bag<AbstractToken> writeBuffer = new Bag<AbstractToken>();
		int numIncludesResolved = 0;
		
		analyzeLoop : while (analyzer.tokens.getLength() > 0) {
			AbstractToken token = analyzer.tokens.Take();
			
			if (token instanceof KeywordToken && (token.getData().equals("include") || token.getData().equals("includeonce"))) {
				boolean isIncludeOnce = token.getData().equals("includeonce");
				AbstractToken fPath = analyzer.tokens.Take();
				if (!(fPath instanceof StringToken))
					throw new CompilerException("Expected include file name in " + '"' + "'s");
				String fullPatch = this.compiler.importsFolder.getAbsolutePath() + "\\" + fPath.getData();
				File includeFile = new File(fullPatch);
				fullPatch = includeFile.getAbsolutePath();
				for (String patch : this.parsedIncludes) {
					if (patch.equals(fullPatch)) {
						this.compiler.outputWarning(new OutputMessage("Include already included:" + fullPatch));
						continue analyzeLoop;
					}
				}

				if (!includeFile.exists() && !includeFile.isFile() && !includeFile.canRead()) {
					this.compiler.outputWarning(new OutputMessage("Can't read include file:" + fullPatch));
				}
				try {
					LexicalAnalyzer includeAnalyzer = new LexicalAnalyzer();
					includeAnalyzer.analyze(includeFile);
					
					while (includeAnalyzer.tokens.getLength() > 0) {
						writeBuffer.Put(includeAnalyzer.tokens.Take());
					}
					if (isIncludeOnce) {
						this.parsedIncludes.add(fullPatch);
					}
					numIncludesResolved++;
				}
				catch (IOException exception) {
					this.compiler.outputWarning(new OutputMessage("I/O exception when reading include file:" + fullPatch));
				}
			}
			else {
				writeBuffer.Put(token);
			}
			
		}
		
		writeBuffer.Flip();
		this.analyzer.tokens = writeBuffer;
		return numIncludesResolved;
	}

}
