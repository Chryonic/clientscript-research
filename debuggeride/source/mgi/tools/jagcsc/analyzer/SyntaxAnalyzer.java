package mgi.tools.jagcsc.analyzer;

import mgi.tools.jagcsc.Compiler;
import mgi.tools.jagcsc.CompilerException;
import mgi.tools.jagcsc.CompilerFlags;
import mgi.tools.jagcsc.OutputMessage;
import mgi.tools.jagcsc.abstractcode.*;
import mgi.tools.jagcsc.compiler.Opcodes;
import mgi.tools.jagcsc.tokens.*;
import mgi.utilities.Bag;

/**
 * Syntax analyzer purpose is to analyze LexicalAnalyzer product.
 * While analyzing it ensures that there's no syntax or logic errors.
 * After analyzing it produces abstract code , which is needed by MachineCodeGenerator.
 */
public class SyntaxAnalyzer {

	/**
	 * Our compiler instance, from where we pick needed information.
	 */
	public Compiler compiler;
	/**
	 * Our LexicalAnalyzer instance, from which information about source is taken.
	 */
	public LexicalAnalyzer analyzer;
	/**
	 * Contains tokens which are analyzed.
	 */
	public AbstractToken[] tokens;
	/**
	 * Contains position at which tokens are read.
	 */
	public int tokenReadPointer;
	/**
	 * Contains SyntaxAnalyzer product - scriptTree which is generated
	 * by analyzing tokens.
	 */
	public Script script;
	
	public SyntaxAnalyzer(Compiler compiler,LexicalAnalyzer analyzer)
	{
		this.compiler = compiler;
		this.analyzer = analyzer;
		/**
		 * We need to consume LexicalAnalyzer product - tokens.
		 * We will create array and store them to it.
		 */
		this.tokens = new AbstractToken[this.analyzer.tokens.getLength()];
		for (int i = 0; i < this.tokens.length; i++)
			this.tokens[i] = this.analyzer.tokens.Take();
		/**
		 * Once tokens are stored we need to assign pointer.
		 * We will begin reading at 0.
		 */
		this.tokenReadPointer = 0;
		/**
		 * And finally create our script tree.
		 */
		this.script = new Script(this.compiler);
	}
	
	
	public AbstractToken read()
	{
		if (this.tokenReadPointer >= this.tokens.length) {
			return null;
		}
		AbstractToken a = this.tokens[this.tokenReadPointer];
		this.tokenReadPointer++;
		return a;
	}
	
	public AbstractToken peek()
	{
		if (this.tokenReadPointer >= this.tokens.length) {
			return null;
		}
		return this.tokens[this.tokenReadPointer];
	}
	
	public void next()
	{
		this.tokenReadPointer++;
	}
	
	public void prev()
	{
		this.tokenReadPointer--;
	}
	
	public void analyze() throws CompilerException
	{
			/**
			 * First off , we need to parse header of the file.
			 * Header contains imports declarations.
			 */
			this.parseHeader();
			/**
			 * Now as we parsed header , 'there is' possibility
			 * that script will have functions.
			 * So we need to check if there's code available and then read functions.
			 */
			for (;;) {
				if (this.peek() == null) {
					/**
					 * No more code available in script, finish.
					 */
				    	if (this.script.function == null) {
				    	    throw new CompilerException("No functions were found in given source file!");
				    	}
					break;
				}
				else {
					this.parseFunction();
				}
			}
	}
	
	public void parseFunction() throws CompilerException {
		/**
		 * Function description begins with KeywordToken declaring it's type
		 * Then goes it's name as NameToken
		 * After that SymbolicToken ( '(' ) occurs
		 * Then for each argument (if available) KeywordToken and NameToken follows
		 * and finally SymbolicToken ( ')' ) terminates function description.
		 * After function description is readed FunctionTree is created and work is
		 * passed to FunctionAnalyzer.
		 */
		if (!(this.peek() instanceof KeywordToken))
			throw new CompilerException("Wrong function type!, expected <keyword-type>.");
		KeywordToken type = (KeywordToken)this.read();
		if (!this.analyzer.isType(type.getData()))
			throw new CompilerException("Wrong function type!, expected <keyword-type>.");
		if (!(this.peek() instanceof NameToken))
			throw new CompilerException("Wrong function name, expected <name>.");
		NameToken name = (NameToken)this.read();
		if (!(this.peek() instanceof SymbolToken) || !((SymbolToken)this.peek()).getData().equals("("))
			throw new CompilerException("Wrong function arguments block beggining , expected <(>");
		this.next();
		/**
		 * As we parsed beginning of the block , we need to parse arguments block.
		 * We will continue to read until terminator ')' is found.
		 */
		Bag<FunctionArgument> arguments = new Bag<FunctionArgument>();
		for (;;) {
			if (!(this.peek() instanceof KeywordToken) || !analyzer.isType(((KeywordToken)this.peek()).getData())) {
				throw new CompilerException("Wrong argument type, expected <keyword-type>");
			}
			else {
				KeywordToken argumentType = (KeywordToken)this.read();
				if (!(this.peek() instanceof NameToken))
					throw new CompilerException("Wrong argument name, expected <name>");
				NameToken argumentName = (NameToken)this.read();
				arguments.Put(new FunctionArgument(argumentName.getData(),CS2Type.getType(argumentType.getData()),false));
			}
			
			if (this.peek() instanceof SymbolToken) {
				/**
				 * We still need to check if we found right symbol.
				 */
				SymbolToken symbol = (SymbolToken) this.read();
				if (symbol.getData().equals(")")) {
				    break;
				}
				else if (!symbol.getData().equals(",")) {
				    throw new CompilerException("Wrong function arguments block terminator - " + symbol.getData() + ". Expected ')'");
				}
			}
			else {
			    throw new CompilerException("Expected ',' or ')'.");
			}
		}
		FunctionArgument[] argumentsArray = new FunctionArgument[arguments.getLength()];
		arguments.fillArray(argumentsArray);
		Function functionTree = new Function(name.getData(),CS2Type.getType(type.getData()),argumentsArray);
		this.script.declareFunction(functionTree);
		if (this.compiler.flagEnabled(0x40)) { // exclusive syntax analyzer debug.
			StringBuilder argsBuilder = new StringBuilder();
			for (int i = 0; i < argumentsArray.length; i++)
				argsBuilder.append(argumentsArray[i].type + " " + argumentsArray[i].name + (i + 1 < argumentsArray.length ? "," : ""));
			this.compiler.outputDebug(new OutputMessage("Parsed function header:" + functionTree.name + ", type:" + functionTree.type + ", arguments(" + argsBuilder.toString() + ")"));
		}
		FunctionAnalyzer fAnalyzer = new FunctionAnalyzer(this,functionTree);
		fAnalyzer.analyze();
	}
	
	public void parseHeader() throws CompilerException
	{
		for (;;) {
			// what we search for is KeywordToken
			AbstractToken token = this.peek();
			if (token == null) { // no code available.
				return;
			}
			if (token instanceof KeywordToken) {
				KeywordToken keyword = (KeywordToken)token;				
				if (keyword.getData().equals("definition")) {
					/**
					 * We found some definition , this could be cs2 script call definition or
					 * opcode definition.
					 */
					this.next();
					boolean isSafe = true;
					if (this.peek() instanceof KeywordToken && this.peek().getData().equals("unsafe")) {
						isSafe = false;
						this.next();
					}
					
					if (!(this.peek() instanceof KeywordToken))
						throw new CompilerException("Wrong function type!, expected <keyword-type>.");
					KeywordToken type = (KeywordToken)this.read();
					if (!this.analyzer.isType(type.getData()))
						throw new CompilerException("Wrong function type!, expected <keyword-type>.");
					if (!(this.peek() instanceof NameToken))
						throw new CompilerException("Wrong function name, expected <name>.");
					NameToken name = (NameToken)this.read();
					if (!(this.peek() instanceof SymbolToken) || !((SymbolToken)this.peek()).getData().equals("("))
						throw new CompilerException("Wrong function arguments block beggining , expected <(>");
					this.next();
					/**
					 * As we parsed beginning of the block , we need to parse arguments block.
					 * We will continue to read until terminator ')' is found.
					 */
					Bag<FunctionArgument> arguments = new Bag<FunctionArgument>();
					for (;;) {
						boolean constEnabled = false;
						
						if (this.peek() instanceof KeywordToken && this.peek().getData().equals("const")) {
							constEnabled = true;
							this.next();
						}
						
						if (!(this.peek() instanceof KeywordToken) || !analyzer.isType(((KeywordToken)this.peek()).getData())) {
							throw new CompilerException("Wrong argument type, expected <keyword-type>");
						}
						KeywordToken argumentType = (KeywordToken)this.read();
						if (!(this.peek() instanceof NameToken))
							throw new CompilerException("Wrong argument name, expected <name>");
						NameToken argumentName = (NameToken)this.read();
						arguments.Put(new FunctionArgument(argumentName.getData(),CS2Type.getType(argumentType.getData()),constEnabled));
						
						if (this.peek() instanceof SymbolToken) {
							/**
							 * We still need to check if we found right symbol.
							 */
							SymbolToken symbol = (SymbolToken) this.read();
							if (symbol.getData().equals(")")) {
							    break;
							}
							else if (!symbol.getData().equals(",")) {
							    throw new CompilerException("Wrong function arguments block terminator - " + symbol.getData() + ". Expected ')'");
							}
						}
						else {
						    throw new CompilerException("Expected ',' or ')'.");
						}
					}
					FunctionArgument[] argumentsArray = new FunctionArgument[arguments.getLength()];
					arguments.fillArray(argumentsArray);
					
					if (!(this.peek() instanceof KeywordToken) || !(this.peek().getData().equals("opcode") || this.peek().getData().equals("cs2"))) {
						throw new CompilerException("Expected 'opcode' or 'cs2' keyword after definition declaration.");
					}
					
					boolean isOpcodeDefinition = this.peek().getData().equals("opcode");
					this.next();
					
					FunctionDefinition definition;
					if (isOpcodeDefinition) {
						int opc;
						if (this.peek() instanceof NameToken) {
							opc = Opcodes.getOpcode(this.peek().getData());
						}
						else if (this.peek() instanceof NumericToken) {
							opc = Integer.parseInt(this.peek().getData());
						}
						else {
							throw new CompilerException("Expected opcode name or number after opcode keyword!");
						}
						this.next();
						definition = new OpcodeFunction(name.getData(), argumentsArray,CS2Type.getType(type.getData()),isSafe,opc);
					}
					else {
						if (!(this.peek() instanceof NumericToken))
							throw new CompilerException("Expected cs2 ID, but found:" + this.peek());
						int id = Integer.parseInt(this.peek().getData());
						this.next();
						definition = new CS2Function(name.getData(), argumentsArray,CS2Type.getType(type.getData()),isSafe,id);
					}
					if (this.compiler.flagEnabled(CompilerFlags.SYNTAX_ANALYZER_DEBUG)) {
						this.compiler.outputDebug(new OutputMessage("Declare definition:" + definition.toString()));
					}
					this.script.declareDefinition(definition);
					
				}
				
				else {
					/** 
					 * Sadly, this isn't what we expected.
					 */
					return;
				}
			}
			else {
				/**
				 * Sadly, this isn't what we expected.
				 */
				return;
			}
		}
	}
	

}
