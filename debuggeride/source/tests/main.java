package tests;

import mgi.tools.jagcsc.Compiler;
import mgi.tools.jagcsc.CompilerFlags;

public class main {

    public static void main(String[] args) throws Throwable {	
		int flag = CompilerFlags.ALLOW_UNSAFE_CODE | CompilerFlags.ALLOW_DEBUG_OUTPUT | 
					CompilerFlags.OUTPUT_PARSED_TOKENS | CompilerFlags.SYNTAX_ANALYZER_DEBUG | 
					CompilerFlags.OUTPUT_PARSED_SYNTAX | CompilerFlags.OUTPUT_ASSEMBLY;
		Compiler compiler = new Compiler("tests/","testscript.cscript","compiled.cscript","tests/lib/",System.err,flag);
		long ms = System.currentTimeMillis();
		compiler.compile();
		long took = System.currentTimeMillis() - ms;
		System.err.println("Took " + took + " ms.");
    }
    
    
    static {

    }
}
