package mgi.tools.jagcsc.analyzer;

import mgi.tools.jagcsc.CompilerException;
import mgi.tools.jagcsc.CompilerFlags;
import mgi.tools.jagcsc.abstractcode.*;
import mgi.tools.jagcsc.tokens.*;
import mgi.utilities.Bag;

/**
 * Class for analyzing function, used by Syntax analyzer.
 */
public class FunctionAnalyzer {

	/**
	 * Contains syntax analyzer which is used for read/write functions.
	 */
	public SyntaxAnalyzer analyzer;
	/**
	 * Function which is being analyzed.
	 */
	public Function function;
	/**
	 * Contains our main node where all our code begins.
	 */
	public ScopeNode mainNode;
	
	public FunctionAnalyzer(SyntaxAnalyzer analyzer,Function function)
	{
		this.analyzer = analyzer;
		this.function = function;
		this.mainNode = new ScopeNode();
		this.function.firstScope = this.mainNode;
	}
	
	
	public void analyze() throws CompilerException {
		/**
		 * First off , we need to declare argument variables, then
		 * what we expect when we begin parsing function
		 * is main scope, so we execute scope parser.
		 */
    	for (FunctionArgument arg : this.function.arguments) {
    	    this.mainNode.declare(new LocalVariable(arg.name,arg.type));
    	}
		this.parseScope(this.mainNode);
		
		if (!this.analyzer.compiler.flagEnabled(CompilerFlags.NO_OPTIMIZING)) {
			this.mainNode = this.function.firstScope = (ScopeNode)this.optimizeNode(this.mainNode);
		}
	}
	
	/**
	 * Optimizes given all children's which belongs to given code node.
	 * @param node
	 * Node which contains children's.
	 */
	public void optimizeChilds(AbstractCodeNode node) {
    	Bag<AbstractCodeNode> ch = node.childs.Copy();
    	ch.Flip();
    	node.childs.Clear();
    	while (ch.getLength() > 0) {
    		AbstractCodeNode prev = ch.Take();
    		AbstractCodeNode optimized = this.optimizeNode(prev);
    		node.onChildOptimized(prev, optimized);
    		node.childs.Put(optimized);
    	}
	}
	
	/**
	 * Optimizes given code node.
	 * @param node
	 * Node which should be optimized.
	 * @return
	 * Returns optimized code node.
	 */
	public AbstractCodeNode optimizeNode(AbstractCodeNode node) {
		for (AbstractCodeNode prev = node;;prev = node) {
			this.optimizeChilds(node);
			node = prev.optimize();
			for (AbstractCodeNode child : node.childs.getData().values()) {
				if (child instanceof ExpressionNode && ((ExpressionNode)child).getParent() == prev) {
					((ExpressionNode)child).setParent(node);
				}
				if (child instanceof ScopeNode && ((ScopeNode)child).getParent() == prev) {
					((ScopeNode)child).setParent(node);
				}
			}
			if (prev == node) {
				return node;
			}
		}
		
	}
	
	
	
	/**
	 * Parse's scope including it's beginning ('{') and end ('}').
	 * @param scopeNode
	 * ScopeNode to which contents should be writen.
	 * @throws CompilerException
	 * If there's error while parsing contents.
	 */
	public void parseScope(ScopeNode scopeNode) throws CompilerException {
		/**
		 * When we begin parsing scope, what we expect first
		 * is  'enterscope' ('{') and 'exitscope' ('}').
		 */
		if (!(this.analyzer.peek() instanceof SymbolToken) || !((SymbolToken)this.analyzer.peek()).getData().equals("{")) {
			throw new CompilerException("'enterscope' ('{') expected after function description.");
		}
		this.analyzer.next();
		/**
		 * Now as the scope is entered , we need to create a loop
		 * and parse it's contents until we encounter exitscope ('}') 
		 * instruction , which means that scope ends.
		 */
		for (;;) {
			if (this.analyzer.peek() == null) {
				throw new CompilerException("'}' expected!");
			}
			else if (this.analyzer.peek() instanceof SymbolToken && ((SymbolToken)this.analyzer.peek()).getData().equals("}")) {
				/**
				 * We found scope terminator , exit scope.
				 */
				this.analyzer.next();
				break;
			}
			else {
				this.parseScopeContent(scopeNode);
			}
			
		}
	}
	
	/**
	 * Parse's one line of scope content.
	 * @param scopeNode
	 * ScopeNode to which content should be written.
	 * @throws CompilerException
	 * If there's error while parsing given content.
	 */
	public void parseScopeContent(ScopeNode scopeNode) throws CompilerException {
		if (this.analyzer.peek() instanceof SymbolToken && ((SymbolToken)this.analyzer.peek()).getData().equals("{")) {
			/**
			 * We found new scope! , let's parse it.
			 */
			ScopeNode newScope = new ScopeNode(scopeNode);
			scopeNode.write(newScope);
			this.parseScope(newScope);
		}
		else if (this.analyzer.peek() instanceof KeywordToken) {
			/**
			 * We found keyword, this could be anything , if,else,while,return & etc.
			 */
			KeywordToken keyword = (KeywordToken)this.analyzer.read();
			AbstractCodeNode acn = this.parseKeyword(scopeNode, keyword);
			scopeNode.write(acn);
		}
		else if (this.analyzer.peek() instanceof ExpressionToken) {
			/**
			 * We found expression token , this could be start of expression
			 */
			ExpressionToken beginning = (ExpressionToken)this.analyzer.read();
			ExpressionNode expr = this.parseExpression(scopeNode, beginning);
			scopeNode.write(new PopableNode(expr));
		}
		else {
			throw new CompilerException("Unexpected scope token:" + this.analyzer.peek());
		}
	}
	
	/**
	 * Parses keyword while reading tokens.
	 * @param scope
	 * Scope in which this keyword is readed.
	 * @param keyword
	 * First token in expression.
	 * @return
	 * Returns parsed keyword node.
	 * @throws CompilerException
	 * Throws compiler exception if the data is invalid.
	 */
	public AbstractCodeNode parseKeyword(ScopeNode scope, KeywordToken keyword) throws CompilerException {
	    
	    if (this.analyzer.analyzer.isType(keyword.getData())) {
			if (!(this.analyzer.peek() instanceof NameToken)) {
			    throw new CompilerException("Expected variable name after type.");
			}
			if (keyword.getData().equals("void")) {
			    throw new CompilerException("Local variable can't be void type!");
			}
			NameToken variableName = (NameToken)this.analyzer.read();
			LocalVariable var = new LocalVariable(variableName.getData(),CS2Type.getType(keyword.getData()));
			scope.declare(var);
			ExpressionNode assignExpr = this.parseExpression(scope, variableName);
			if (!(assignExpr instanceof VariableAssignationNode))
				throw new CompilerException("Expected assignation expression!");
			return new PopableNode(assignExpr);
	    }
	    else if (keyword.getData().equals("if")) {
	    	if (!(this.analyzer.peek() instanceof SymbolToken) || !((SymbolToken)this.analyzer.peek()).getData().equals("("))
	    		throw new CompilerException("Expected '(' after if keyword!");
	    	ExpressionNode ifExpr = this.parseExpression(scope, this.readParentheses());
	    	if (ifExpr.getType() != CS2Type.boolean_type)
	    		throw new CompilerException("Expected boolean on if expression , but found:" + ifExpr.getType());
	    	ScopeNode ifTrueScope = new ScopeNode(scope);
	    	this.parseScopeContent(ifTrueScope);
	    	ScopeNode ifFalseScope = new ScopeNode(scope);
	    	if (this.analyzer.peek() instanceof KeywordToken && this.analyzer.peek().getData().equals("else")) {
	    		this.analyzer.read();
	    		this.parseScopeContent(ifFalseScope);
	    	}
	    	return new IfElseNode(ifTrueScope,ifFalseScope,ifExpr);
	    	
	    }
	    else if (keyword.getData().equals("while")) {
	    	if (!(this.analyzer.peek() instanceof SymbolToken) || !((SymbolToken)this.analyzer.peek()).getData().equals("("))
	    		throw new CompilerException("Expected '(' after while keyword!");
	    	ExpressionNode whileExpr = this.parseExpression(scope, this.readParentheses());
	    	if (whileExpr.getType() != CS2Type.boolean_type)
	    		throw new CompilerException("Expected boolean on while expression , but found:" + whileExpr.getType());
	    	ScopeNode whileScope = new ScopeNode(scope);
	    	WhileNode wn = new WhileNode(whileScope,whileExpr);
	    	this.parseScopeContent(whileScope);
	    	return wn;
	    }
	    else if (keyword.getData().equals("break")) {
	    	/**
	    	 * First off we need to find what it is trying to break.
	    	 */
	    	ControllableFlowNode controllableNode = null;
	    	for (ScopeNode base = scope;base != null; base = base.parentScope) {
	    		if (base.getParent() != null && base.getParent() instanceof ControllableFlowNode) {
	    			controllableNode = (ControllableFlowNode)base.getParent();
	    			break;
	    		}
	    	}
	    	if (controllableNode == null || !controllableNode.canBreak())
	    		throw new CompilerException("Couldn't find loop which should can be breaked.");
	    	if (!(this.analyzer.peek() instanceof SymbolToken) || !this.analyzer.peek().getData().equals(";"))
	    		throw new CompilerException("Expected ; after break keyword.");
	    	this.analyzer.next();
	    	return new BreakNode(controllableNode);
	    }
	    else if (keyword.getData().equals("continue")) {
	    	/**
	    	 * First off we need to find what it is trying to break.
	    	 */
	    	ControllableFlowNode controllableNode = null;
	    	for (ScopeNode base = scope;base != null; base = base.parentScope) {
	    		if (base.getParent() != null && base.getParent() instanceof ControllableFlowNode) {
	    			controllableNode = (ControllableFlowNode)base.getParent();
	    			break;
	    		}
	    	}
	    	if (controllableNode == null || !controllableNode.canContinue())
	    		throw new CompilerException("Couldn't find loop which should can be continued.");
	    	if (!(this.analyzer.peek() instanceof SymbolToken) || !this.analyzer.peek().getData().equals(";"))
	    		throw new CompilerException("Expected ; after continue keyword.");
	    	this.analyzer.next();
	    	return new ContinueNode(controllableNode);
	    }
	    else if (keyword.getData().equals("return")) {
	    	if (!(this.analyzer.peek() instanceof ExpressionToken))
			    throw new CompilerException("Expected expression after return keyword!");
			ExpressionNode expr = this.parseExpression(scope,(ExpressionToken)this.analyzer.read());
			if (!this.function.type.matches(expr.getType())) {
			    throw new CompilerException("Expected " + this.function.type + " on return expression , but found:" + expr.getType());
			}
			return new ReturnNode(expr);
	    }
	    else {
	    	throw new CompilerException("Unknown keyword:" + keyword.getData());
	    }
	}
	

	/**
	 * Parses expression while reading tokens, until 
	 * ';' (Terminator) is found.
	 * @param scope
	 * Scope in which this expression is readed.
	 * @param firstToken
	 * First token in the expression.
	 * @throws CompilerException
	 * If there's parsing error.
	 * @returns
	 * Returns parsed expression node.
	 */
	public ExpressionNode parseExpression(ScopeNode scope, ExpressionToken firstToken) throws CompilerException {
	    AbstractToken[] buff = new AbstractToken[this.analyzer.tokens.length];
	    int expr_length = 0;
	    buff[expr_length++] = firstToken;
	    
	    if (this.isExpressionTerminator(firstToken))
	    	return new EmptyExpressionNode();
	    
	    for (;;) {
			if (this.analyzer.peek() == null) {
			    throw new CompilerException("Unterminated expression!");
			}
			AbstractToken t = this.analyzer.read();
			if (this.isExpressionTerminator(t))
			    break;
			buff[expr_length++] = t;
	    }
	    if (expr_length == 0)
	    	return new EmptyExpressionNode();
	    
	    AbstractToken[] expr = new AbstractToken[expr_length];
	    for (int i = 0; i < expr_length; i++)
	    	expr[i] = buff[i];
	    return this.parseExpression(scope, expr);
	}
	
	/**
	 * Parse's expression from given tokens.
	 * @param scope
	 * Scope in which this expression is readed.
	 * @param tokens
	 * Tokens which represends this expression.
	 * tokens array must length must be greater than 0 and 
	 * first element in it must be instance of ExpressionToken.
	 * @return
	 * Return's parsed expression node.
	 * @throws ArrayIndexOutOfBoundsException
	 * If tokens array length is less than 1.
	 * @throws ClassCastException
	 * If first element is not instanceof ExpressionToken
	 * @throws CompilerException
	 * If parsing error occurs.
	 */
	public ExpressionNode parseExpression(ScopeNode scope, AbstractToken[] tokens) throws ArrayIndexOutOfBoundsException,ClassCastException,CompilerException {
	    
	    int ptr = 0;
	    ExpressionNode expr = null;
	    
	    ExpressionToken current = (ExpressionToken)tokens[ptr];
	    boolean expectingEnd = false;
	    for (;;) {	
			if (expectingEnd) {
			    throw new CompilerException("Expected expression end , but found:" + current.getData());
			}
		    if (current instanceof StringToken) {
				expr = new StringExpressionNode(current.getData());
				expectingEnd = true;
		    }
		    else if (current instanceof CharToken) {
		    	expr = new CharExpressionNode(current.getData());
		    	expectingEnd = true;
		    }
		    else if (current instanceof NumericToken) {		
				if (current.getData().endsWith("L")) {
				    expr = new LongExpressionNode(Long.parseLong(current.getData().substring(0, current.getData().length() - 1)));
				}
				else {
				    expr = new IntExpressionNode(Integer.parseInt(current.getData()));
				}
				expectingEnd = true;
		    }
		    else if (current instanceof SymbolToken) {
		    	if (current.getData().equals("(")) {
		    		AbstractToken[] paren = this.readParentheses(tokens);
		    		ptr += (paren.length + 2); // + '(' and ')'.
		    		expr = this.parseExpression(scope, paren);
		    		expectingEnd = true;
		    	}
		    	else {
		    		throw new CompilerException("Unknown symbol in expression:" + current.getData());
		    	}
		    }
		    else if (current instanceof ExpressionKeywordToken) {
		    	if (current.getData().equals("true")) {
		    		expr = new BooleanExpressionNode(true);
		    		expectingEnd = true;
		    	}
		    	else if (current.getData().equals("false")) {
		    		expr = new BooleanExpressionNode(false);
		    		expectingEnd = true;
		    	}
		    	else {
		    		throw new CompilerException("Unknown expression keyword:" + current.getData());
		    	}
		    }
		    else if (current instanceof NameToken) {
				if ((ptr + 1) >= tokens.length || !(tokens[ptr + 1] instanceof SymbolToken) || !tokens[ptr + 1].getData().equals("(")) {
				    LocalVariable var = scope.getLocalVariable(current.getData());
				    if (this.get(tokens, ptr + 1) instanceof SymbolToken && this.get(tokens, ptr + 1).getData().equals("=") &&
				    	(!(this.get(tokens, ptr + 2) instanceof SymbolToken) || !this.get(tokens, ptr + 2).getData().equals("="))) 
				    {	    
						// assignation
						ExpressionNode assignExpr = this.parseExpression(scope, this.cut(tokens, ptr + 2));
						ptr = tokens.length;
		        		if (!var.type.matches(assignExpr.getType()))
		        		    throw new CompilerException("Variable assignation expression return's " + assignExpr.getType() + " however variable is " + var.type);
						expr = new VariableAssignationNode(var,assignExpr);
		    			expectingEnd = true;
					}
					else {
						// load
						expr = new VariableLoadNode(var);
						expectingEnd = true;
				    }
				    
				}
				else {
					if (this.get(tokens, ptr + 1) instanceof SymbolToken && this.get(tokens, ptr + 1).getData().equals("(")) {
						// call
						FunctionDefinition definition = this.analyzer.script.getDefinition(tokens[ptr].getData());
						AbstractToken[] paren = this.readParentheses(this.cut(tokens, ptr + 1));
						ptr += (paren.length + 2); // + '(' and ')'
						AbstractToken[][] splt = this.split(paren, ",");
						ExpressionNode[] argsExpr = new ExpressionNode[splt.length];
						for (int i = 0; i < splt.length; i++) {
							argsExpr[i] = this.parseExpression(scope, splt[i]);
						}
						if (definition.arguments.length != argsExpr.length)
							throw new CompilerException("Expected " + definition.arguments.length + " arguments on call, but found:" + argsExpr.length);
						if (!definition.safe && !this.analyzer.compiler.flagEnabled(CompilerFlags.ALLOW_UNSAFE_CODE))
							throw new CompilerException(definition + " is unsafe , enable CompilerFlags.ALLOW_UNSAFE_CODE to solve this!");
						for (int i = 0; i < argsExpr.length; i++) {
							if (!definition.arguments[i].type.matches(argsExpr[i].getType()))
								throw new CompilerException(definition.name + " call requires argument " + (i + 1) + " to be " + definition.arguments[i].type);
							if (definition.arguments[i].isConst && !(argsExpr[i] instanceof IConstantNode))
								throw new CompilerException(definition.name + " call requires argument " + (i + 1) + " to be compile time constant.");
						}
						expr = new CallExpressionNode(definition, argsExpr);
						expectingEnd = true;
					}
					else {
						throw new CompilerException("Invalid expression:" + current.getData());
					}
				}
		    }
		    else {
		    	throw new CompilerException("Invalid expression:" + current.getData());
		    }
		
		    
		    if (this.get(tokens, ptr + 1) instanceof SymbolToken && this.get(tokens, ptr + 2) instanceof SymbolToken) {
		    	if (this.getCompareType(tokens[ptr + 1].getData(), tokens[ptr + 2].getData()) != -1) {
		    		int compareType = this.getCompareType(tokens[ptr + 1].getData(), tokens[ptr + 2].getData());
		    		ExpressionNode right = this.parseExpression(scope, this.cut(tokens, ptr + 3));
		    		if (!expr.getType().comparable(right.getType(), compareType)) {
		    			throw new CompilerException("Can't compare " + expr.getType() + " to " + right.getType());
		    		}
		    		expr = new ConditionalExpressionNode(expr,right,compareType);
		    		ptr = tokens.length; // end
		    	}
		    }
		    else if (this.get(tokens, ptr + 1) instanceof SymbolToken) {
		    	if (this.getCompareType(tokens[ptr + 1].getData(),null) != -1) {
		    		int compareType = this.getCompareType(tokens[ptr + 1].getData(), null);
		    		ExpressionNode right = this.parseExpression(scope, this.cut(tokens, ptr + 2));
		    		if (!expr.getType().comparable(right.getType(), compareType)) {
		    			throw new CompilerException("Can't compare " + expr.getType() + " to " + right.getType());
		    		}
		    		expr = new ConditionalExpressionNode(expr,right,compareType);
		    		ptr = tokens.length; // end
		    	}
		    }
		    
			/**
			 * After looping , move on.
			 */
			ptr++;
			if (ptr >= tokens.length) {
			    if (!expectingEnd)
			    	throw new CompilerException("Unterminated expression!");
			    break;
			}
			AbstractToken token = tokens[ptr];
			if (!(token instanceof ExpressionToken))
				throw new CompilerException("Invalid expression:" + (token.getData()));
			current = (ExpressionToken)token;
	    }
	    return expr;	    
	}
	
	/**
	 * Read's content inside parentheses ( '(' and ')' ) 
	 * into AbstractToken[] buffer.
	 * @return
	 * Returns readed contents.
	 * @throws CompilerException
	 * If there's not enough '(' or ')'.
	 */
	private AbstractToken[] readParentheses() throws CompilerException {
		AbstractToken[] buff = new AbstractToken[this.analyzer.tokens.length];
		int writePointer = 0;
		
		if (!(this.analyzer.peek() instanceof SymbolToken) || !this.analyzer.peek().getData().equals("("))
			throw new CompilerException("Expected '(' !");
		this.analyzer.read();
		int amount = 1;
		

		for (;;) {
			if (this.analyzer.peek() == null) {
				throw new CompilerException("Expected ')' !");
			}
			else if (this.analyzer.peek() instanceof SymbolToken && this.analyzer.peek().getData().equals("(")) {
				amount++;
			}
			else if (this.analyzer.peek() instanceof SymbolToken && this.analyzer.peek().getData().equals(")")) {
				amount--;
			}
			if (amount == 0) {
				this.analyzer.read();
				break;
			}
			buff[writePointer++] = this.analyzer.read();
		}

		
		AbstractToken[] parentheses = new AbstractToken[writePointer];
		for (int i = 0; i < writePointer; i++) {
			parentheses[i] = buff[i];
		}
		
		return parentheses;
	}
	
	/**
	 * Read's content inside parentheses ( '(' and ')' ) 
	 * into AbstractToken[] buffer.
	 * @param readBuff
	 * Buffer from which tokens should be readed.
	 * @return
	 * Returns readed contents.
	 * @throws CompilerException
	 * If there's not enough '(' or ')'.
	 */
	private AbstractToken[] readParentheses(AbstractToken[] readBuff) throws CompilerException {
		AbstractToken[] buff = new AbstractToken[this.analyzer.tokens.length];
		int writePointer = 0;
		int readPointer = 0;
		
		if (!(this.get(readBuff, readPointer) instanceof SymbolToken) || !this.get(readBuff, readPointer).getData().equals("("))
			throw new CompilerException("Expected '(' !");
		readPointer++;
		int amount = 1;
		

		for (;;) {
			if (this.get(readBuff, readPointer) == null) {
				throw new CompilerException("Expected ')' !");
			}
			else if (this.get(readBuff, readPointer) instanceof SymbolToken && this.get(readBuff, readPointer).getData().equals("(")) {
				amount++;
			}
			else if (this.get(readBuff, readPointer) instanceof SymbolToken && this.get(readBuff, readPointer).getData().equals(")")) {
				amount--;
			}
			if (amount == 0)
				break;
			buff[writePointer++] = this.get(readBuff, readPointer);
			readPointer++;
		}

		
		AbstractToken[] parentheses = new AbstractToken[writePointer];
		for (int i = 0; i < writePointer; i++) {
			parentheses[i] = buff[i];
		}
		
		return parentheses;
	}
	
	/**
	 * Split's given data buffer.
	 * @param data
	 * Data which should be splited.
	 * @param delimeter
	 * Delimeter for this split.
	 * @return
	 * Return's given buffer splited.
	 * @throws CompilerException
	 * If there's not enough '(' or ')'.
	 */
	private AbstractToken[][] split(AbstractToken[] data,String delimeter) throws CompilerException {
		AbstractToken[][] buffer = new AbstractToken[data.length][data.length];
		int[] splitDataWritePointers = new int[buffer.length];
		int splitWritePointer = 1;
		int paren = 0;
		for (int readptr = 0; readptr < data.length; readptr++) {
			if (this.get(data, readptr) == null) {
				break;
			}
			else if (this.get(data, readptr) instanceof SymbolToken && this.get(data, readptr).getData().equals(delimeter) && paren == 0) {
				splitWritePointer++;
				continue;
			}
			else if (this.get(data, readptr) instanceof SymbolToken && this.get(data, readptr).getData().equals("(")) {
				paren++;
			}
			else if (this.get(data, readptr) instanceof SymbolToken && this.get(data, readptr).getData().equals(")")) {
				paren--;
			}
			buffer[splitWritePointer - 1][splitDataWritePointers[splitWritePointer - 1]++] = this.get(data, readptr);
		}
		
		if (paren > 0 || paren < 0) {
			throw new CompilerException((paren > 0 ? "')'" : "'('") + " missing!");
		}
		
		AbstractToken[][] rebuff = new AbstractToken[splitWritePointer][];
		for (int i = 0; i < splitWritePointer;i++) {
			rebuff[i] = new AbstractToken[splitDataWritePointers[i]];
			for (int a = 0; a < splitDataWritePointers[i]; a++) {
				rebuff[i][a] = buffer[i][a];
			}
		}
		return rebuff;
		
	}
	
	/**
	 * Cut's AbstractToken[] array.
	 * @param buff
	 * Array which should be cut.
	 * @param beginIdx
	 * First index in the buff from which new array will start.
	 * @return
	 * New array with reduced length.
	 */
	private AbstractToken[] cut(AbstractToken[] buff, int beginIdx) {
	    AbstractToken[] cBuff = new AbstractToken[buff.length - beginIdx];
	    for (int i = 0; i < cBuff.length; i++)
	    	cBuff[i] = buff[beginIdx + i];
	    return cBuff;
	}
	
	/**
	 * Return's element in given buffer
	 * from given offset or null if element couldn't be fetched.
	 * @param buffer
	 * Buffer from where element will be fetched.
	 * @param offset
	 * Offset in the buffer.
	 * @return
	 * Returns element or null if element couldn't be fetched.
	 */
	private AbstractToken get(AbstractToken[] buffer,int offset) {
	    if (offset < 0 || offset >= buffer.length)
	    	return null;
	    return buffer[offset];
	}
	
	
	/**
	 * Get's comparsion type.
	 * @param s1
	 * Symbol 1.
	 * @param s2
	 * Symbol 2.
	 * @return
	 * Return's comparsion type or -1 if it was not found.
	 * 0 means !=
	 * 1 means ==
	 * 2 means >
	 * 3 means <
	 * 4 means >=
	 * 5 means <=
	 * 6 means ||
	 * 7 means &&
	 */
	public int getCompareType(String s1,String s2) {
		if (s2 == null) {
			if (s1.equals(">")) {
				return 2;
			}
			else if (s1.equals("<")) {
				return 3;
			}
			return -1;
		}
		if (s1.equals("!") && s2.equals("="))
			return 0;
		else if (s1.equals("=") && s2.equals("="))
			return 1;
		else if (s1.equals(">") && s2.equals("="))
			return 4;
		else if (s1.equals("<") && s2.equals("="))
			return 5;
		else if (s1.equals("|") && s2.equals("|"))
			return 6;
		else if (s1.equals("&") && s2.equals("&"))
			return 7;
		return -1;
	}
	
	
	/**
	 * Checks if given token is able to terminate expression.
	 * @param token
	 * Token which should be checked.
	 * @return
	 * Returns true if expression can be terminated with given token.
	 */
	public boolean isExpressionTerminator(AbstractToken token) {
		if (token instanceof SymbolToken && ((SymbolToken)token).getData().equals(";")) {
			return true;
		}
		return false;
	}
	
}
