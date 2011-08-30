package mgi.tools.jagcsc;

import java.io.*;

import mgi.tools.jagcsc.analyzer.IncludesAnalyzer;
import mgi.tools.jagcsc.analyzer.LexicalAnalyzer;
import mgi.tools.jagcsc.analyzer.SyntaxAnalyzer;
import mgi.tools.jagcsc.compiler.AssemblyGenerator;
import mgi.tools.jagcsc.compiler.AssemblyWriter;
import mgi.tools.jagcsc.tokens.AbstractToken;
import mgi.utilities.Bag;

public class Compiler {
	
    /**
     * Folder in which imports are presend.
     */
    public File importsFolder;
	/**
	 * Folder which in which source files are placed.
	 */
	public File sourceFolder;
	/**
	 * Source file, which needs to be compiled.
	 * Source file instance (java.io.File) is generated using the formula:
	 * new File(sourceFolder + sourceFile); 
	 */
	public File sourceFile;
	/**
	 * Output file , which is generated if source is sucessfully compiled.
	 * Output file instance (java.io.File) is generated using the formula:
	 * new File(sourceFolder + outputFile);
	 */
	public File outputFile;
	/**
	 * Stream , used for outputing warnings and errors.
	 * Default:java.lang.System.err
	 */
	public PrintStream output;
	/**
	 * Integer containing various information:
	 * 0x1 - No error ouput.
	 * 0x2 - No warning output.
	 * 0x4 - Allow unsafe code.
	 * 0x8 - No code optimization.
	 * 0x10 - Enable debug output.
	 * 0x20 - Output Lexical Analyzer product.
	 * 0x40 - Output Exclusive SyntaxAnalyzer debugs.
	 * 0x80 - Output SyntaxAnalyzer product.
	 * 0x100 - Force compile to old format.
	 * 0x200 - Output AssemblyGenerator product.
	 */
	public int compilerFlags;
	
	/**
	 * Creates compiler instance and initializes it.
	 * @param sourceFolder
	 * Directory containing source files.
	 * @param sourceFile
	 * Source file to be compiler.
	 * @param outputFile
	 * File which will be outputed if compile will be sucessfull.
	 * @param importsFolder
	 * Folder where import files are presend.
	 * @param output
	 * Stream for outputing warnings and errors.
	 * @param flags
	 * Integer containing compiler parameters.
	 * @throws FileNotFoundException
	 * FileNotFoundException is thrown when sourceFolder or sourceFile or outputFile cannot be found.
	 * @throws IOException
	 * When compiler doesn't have enough privileges to read source file or write output file.
	 */
	public Compiler(String sourceFolder,String sourceFile,String outputFile,String importsFolder ,PrintStream output,int flags) throws FileNotFoundException,IOException
	{
		this.sourceFolder = new File(sourceFolder);
		if (!this.sourceFolder.isDirectory())
			throw new FileNotFoundException("Source folder is not folder!");
		this.sourceFile = new File(sourceFolder + sourceFile);
		if (!this.sourceFile.exists() || !this.sourceFile.isFile())
			throw new FileNotFoundException("Source file cannot be found!");
		this.outputFile = new File(sourceFolder + outputFile);
		if (this.outputFile.exists() && !this.outputFile.canWrite())
			throw new IOException("Can't write to output file.");
		this.importsFolder = new File(importsFolder);
		if (!this.importsFolder.exists() || !this.importsFolder.isDirectory()) 
		    throw new FileNotFoundException("Imports folder cannot be found!");
		this.compilerFlags = flags;
		this.output = output;
	}
	
	
	/**
	 * Get's specified boolean from compilerFlags integer.
	 */
	public boolean flagEnabled(int flag)
	{
		return (this.compilerFlags & flag) != 0;
	}
	
	/**
	 * Outputs error message to output stream.
	 * Note:If compiler flag 0x1 is enabled this function does nothing.
	 */
	public void outputError(OutputMessage message)
	{
		if (this.flagEnabled(CompilerFlags.NO_ERR_OUTPUT))
			return;
		this.output.print("[ERROR]:" + message);
	}

	/**
	 * Outputs warning message to output stream.
	 * Note:If compiler flag 0x2 is enabled this function does nothing.
	 */
	public void outputWarning(OutputMessage message)
	{
		if (this.flagEnabled(CompilerFlags.NO_WARN_OUTPUT))
			return;
		this.output.print("[WARNING]:" + message);		
	}
	
	/**
	 * Outputs debug message to output stream.
	 * Note:If compiler flag 0x10 is not enabled this function does nothing.
	 */
	public void outputDebug(OutputMessage message)
	{
		if (!this.flagEnabled(CompilerFlags.ALLOW_DEBUG_OUTPUT))
			return;
		this.output.print("[DEBUG]:" + message);		
	}
	
	/**
	 * Reads source code and produces machine code to output file.
	 */
	public void compile() throws CompilerException
	{
	    try {
	    	
	    	/**
	    	 * First off , output some warnings about compiler flags.
	    	 */
	    	if (this.flagEnabled(CompilerFlags.ALLOW_UNSAFE_CODE)) {
	    		this.outputWarning(new OutputMessage("Unsafe code is currently allowed, this can cause stack corruption!"));
	    	}
	    	
			/**
			 * Create lexical analyzer which produces Atomic Units(tokens)
			 * by reading and analyzing source file.
			 * This info is later consumed by IncludesAnalyzer and Syntax analyzer.
			 */
			LexicalAnalyzer analyzer = new LexicalAnalyzer();
			analyzer.analyze(this.sourceFile);
			this.outputDebug(new OutputMessage("Lexical Analyzing done."));
			
			/**
			 * If NO_INCLUDES is not enabled , we will
			 * Create includes analyzer which reads include files and adds their 
			 * tokens to our lexical analyzer product.
			 */
			if (!this.flagEnabled(CompilerFlags.IGNORE_INCLUDES)) {
				IncludesAnalyzer includesAnalyzer = new IncludesAnalyzer(this,analyzer);
				includesAnalyzer.analyze();
				this.outputDebug(new OutputMessage("Includes analyzing done."));
			}
			
			if (this.flagEnabled(CompilerFlags.OUTPUT_PARSED_TOKENS))
			{
				Bag<AbstractToken> b = new Bag<AbstractToken>();
				int len = analyzer.tokens.getLength();
				for (int i = 0 ; i < len; i++) {
					AbstractToken t = analyzer.tokens.Take();
					b.Put(t);
					this.outputDebug(new OutputMessage("[" + i + "]:" + t.getClass().getSimpleName() + ":" + t));
				}
				b.Flip();
				analyzer.tokens = b;
			}
			/**
			 * Create syntax analyzer which produces ScriptTree by parsing
			 * tokens provided by Lexical Analyzer.
			 * This info is later consumed by Machine code generator.
			 */
			SyntaxAnalyzer syntaxAnalyzer = new SyntaxAnalyzer(this,analyzer);
			syntaxAnalyzer.analyze();
			this.outputDebug(new OutputMessage("Syntax Analyzing done."));
			if (this.flagEnabled(CompilerFlags.OUTPUT_PARSED_SYNTAX))
			{
			    this.outputDebug(new OutputMessage(syntaxAnalyzer.script.toString()));
			}
			/**
			 * Now create our AssemblyGenerator which will generate
			 * assembly.
			 */
			AssemblyGenerator generator = new AssemblyGenerator(this,syntaxAnalyzer.script);
			generator.generate();
			this.outputDebug(new OutputMessage("Assembly generating done."));
			if (this.flagEnabled(CompilerFlags.OUTPUT_ASSEMBLY))
			{
			    for (int i = 0; i < generator.assembly.length; i++) {
			    	this.outputDebug(new OutputMessage(generator.assembly[i].toString()));
			    }
			}
			
			/**
			 * And finally write assembly to our compile file.
			 */
			AssemblyWriter writer = new AssemblyWriter(this,generator);
			byte[] data = writer.writeAssembly();
			this.outputDebug(new OutputMessage("Assembly writing done, length:" + data.length));
			
			try {
			    FileOutputStream fos = new FileOutputStream(this.outputFile);
			    fos.write(data, 0, data.length);
			    fos.close();
			}
			catch (Exception exception) {
			    throw new CompilerException(exception.getClass().getName() + " got throwed with message:" + exception.getMessage());
			}
			
			this.outputDebug(new OutputMessage("Compiling done!"));
		}
		catch (Exception exception) {
			this.outputError(new OutputMessage(exception.getMessage()));
			if (exception instanceof CompilerException)
				throw (CompilerException)exception;
			exception.printStackTrace();
			throw new CompilerException(exception.getClass().getName() + " got throwed:" + exception.getMessage());
	    }
		
	}
	

	
}
