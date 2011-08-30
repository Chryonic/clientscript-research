package mgi.tools.jagcsc.compiler;

import java.util.List;

import mgi.tools.jagcsc.Compiler;
import mgi.tools.jagcsc.CompilerException;
import mgi.tools.jagcsc.OutputMessage;
import mgi.tools.jagcsc.abstractcode.*;
import mgi.tools.jagcsc.analyzer.CS2Function;
import mgi.tools.jagcsc.analyzer.CS2Type;
import mgi.tools.jagcsc.analyzer.FunctionDefinition;
import mgi.tools.jagcsc.analyzer.OpcodeFunction;

/**
 * Assembly generator takes SyntaxAnalyzer product 
 * and produces compiled instructions which are later consumed by AssemblyWriter.
 */
public class AssemblyGenerator {
    
	/**
	 * Our compiler instance, from where we pick needed information.
	 */
	public Compiler compiler;
	/**
	 * Contains SyntaxAnalyzer product - scriptTree which is generated
	 * by analyzing tokens.
	 */
	public Script scriptTree;
	/**
	 * Contains locals registered which is writen when code
	 * is being generated.
	 */
	public LocalsRegister localsRegister;
	/**
	 * Contains generated assembly instructions.
	 */
	public ClientScriptInstruction<?>[] assembly;
	/**
	 * Contains instruction buffer.
	 */
	private ClientScriptInstruction<?>[] writeBuffer;
	/**
	 * Contains write pointer to writeBuffer.
	 */
	private int writePointer = 0;
	
	
	
	public AssemblyGenerator(Compiler compiler,Script tree) {
	    this.compiler = compiler;
	    this.scriptTree = tree;
	    this.localsRegister = new LocalsRegister();
	    this.writeBuffer = new ClientScriptInstruction[5000];
	}
	
	/**
	 * Generate's assembly.
	 */
	public void generate() throws CompilerException {
	    this.writeAbstractCode(scriptTree.function.firstScope);
	    this.bufferToAssembly();
	}
	
	/**
	 * Write's abstract code node.
	 * @param node
	 * Node which should be writen.
	 */
	@SuppressWarnings("unchecked")
	public void writeAbstractCode(AbstractCodeNode node) throws CompilerException {
	    if (node instanceof ScopeNode) {
			ScopeNode scope = (ScopeNode)node;
			List<LocalVariable> declarables = scope.copyDeclaredVariables();
			for (LocalVariable var : declarables) {
			    this.localsRegister.allocateVariable(var);
			}
			scope.readMode();
			while (scope.childs.getLength() > 0)
			{
			    this.writeAbstractCode(scope.read());
			}
			for (LocalVariable var : declarables) {
			    this.localsRegister.deleteVariable(var);
			}
	    }
	    else if (node instanceof EmptyNode) {
	    }
	    else if (node instanceof EmptyExpressionNode) {
	    }
	    else if (node instanceof CharExpressionNode) {
	    	this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.PUSH_INT,(int)((CharExpressionNode)node).getData());
	    }
	    else if (node instanceof BooleanExpressionNode) {
	    	this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.PUSH_INT,((BooleanExpressionNode)node).getData() ? 1 : 0);
	    }
	    else if (node instanceof IntExpressionNode) {
	    	this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.PUSH_INT,((IntExpressionNode)node).getData());
	    }
	    else if (node instanceof StringExpressionNode) {
	    	this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<String>(Opcodes.PUSH_STRING,((StringExpressionNode)node).getData());
	    }
	    else if (node instanceof LongExpressionNode) {
	    	this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Long>(Opcodes.PUSH_LONG,((LongExpressionNode)node).getData());
	    }
	    else if (node instanceof PopableNode) {
	    	PopableNode n = (PopableNode)node;
			this.writeAbstractCode(n.expression);
			int type = n.expression.getType().runtimeStackType;
		    if (type == 0)
		    	this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Boolean>(Opcodes.POP_INT,false);
		    else if (type == 1)
		    	this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Boolean>(Opcodes.POP_STRING,false);
		    else if (type == 2)
		    	this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.POP_LONG,0);
	    }
	    else if (node instanceof ReturnNode) {
			this.writeAbstractCode(((ReturnNode)node).expression);
			this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Boolean>(Opcodes.RETURN,false);
	    }
	    else if (node instanceof FlowControlNode) {
    		FlowControlNode fcn = (FlowControlNode)node;
    		fcn.offset = this.writePointer;
    		this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.GOTO,-1);
	    }
	    else if (node instanceof VariableAssignationNode) {
			VariableAssignationNode van = (VariableAssignationNode)node;
			this.writeAbstractCode(van.expression);
			int type = van.variable.type.runtimeStackType;
			if (type < 0 || type > 2)
			    throw new CompilerException("Unsupported local variable type:" + van.variable.type);
			int opStore = type == 0 ? Opcodes.STORE_INT : (type == 1 ? Opcodes.STORE_STRING : Opcodes.STORE_LONG);
			int opLoad = type == 0 ? Opcodes.LOAD_INT : (type == 1 ? Opcodes.LOAD_STRING : Opcodes.LOAD_LONG);
			this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(opStore,this.localsRegister.getSlot(van.variable));
			if (van.getParent() != null) {
			    this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(opLoad,this.localsRegister.getSlot(van.variable));
			}
	    }
	    else if (node instanceof VariableLoadNode) {
			VariableLoadNode vln = (VariableLoadNode)node;
			int type = vln.variable.type.runtimeStackType;
			if (type < 0 || type > 2)
			    throw new CompilerException("Unsupported local variable type:" + vln.variable.type);
			int opLoad = type == 0 ? Opcodes.LOAD_INT : (type == 1 ? Opcodes.LOAD_STRING : Opcodes.LOAD_LONG);
			this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(opLoad,this.localsRegister.getSlot(vln.variable));
	    }
	    else if (node instanceof CallExpressionNode) {
	    	CallExpressionNode cexpr = (CallExpressionNode)node;
	    	FunctionDefinition callDef = cexpr.definition;
	    	
	    	if (callDef instanceof CS2Function) {
		    	for (int i = 0; i < cexpr.arguments.length; i++) {
		    		this.writeAbstractCode(cexpr.arguments[i]);
		    	}
		    	this.writeBuffer[this.writePointer++] = callDef.assembly[0];
	    	}
	    	else if (callDef instanceof OpcodeFunction) {
		    	for (int i = 0; i < cexpr.arguments.length; i++) {
		    		if (callDef.arguments[i].isConst) {
		    			if (cexpr.arguments[i].getType() == CS2Type.string_type) {
		    				((ClientScriptInstruction<String>)callDef.assembly[0]).setAttachment((String)((IConstantNode)cexpr.arguments[i]).getConst());
		    			}
		    			else if (cexpr.arguments[i].getType() == CS2Type.int_type) {
		    				((ClientScriptInstruction<Integer>)callDef.assembly[0]).setAttachment((Integer)((IConstantNode)cexpr.arguments[i]).getConst());
		    			}
		    			else if (cexpr.arguments[i].getType() == CS2Type.char_type) {
		    				((ClientScriptInstruction<Integer>)callDef.assembly[0]).setAttachment((int)(Character)((IConstantNode)cexpr.arguments[i]).getConst());
		    			}
		    			else if (cexpr.arguments[i].getType() == CS2Type.long_type) {
		    				((ClientScriptInstruction<Long>)callDef.assembly[0]).setAttachment((Long)((IConstantNode)cexpr.arguments[i]).getConst());
		    			}
		    			else if (cexpr.arguments[i].getType() == CS2Type.boolean_type) {
		    				((ClientScriptInstruction<Boolean>)callDef.assembly[0]).setAttachment((Boolean)((IConstantNode)cexpr.arguments[i]).getConst());
		    			}
		    		}
		    		else {
		    			this.writeAbstractCode(cexpr.arguments[i]);
		    		}
		    	}
		    	this.writeBuffer[this.writePointer++] = callDef.assembly[0];
	    	}
	    	else {
	    		throw new CompilerException("Unknown call definition type:" + callDef);
	    	}
	    	
	    }
	    else if (node instanceof WhileNode) {
	    	WhileNode whileNode = (WhileNode)node;
	    	
	    	ClientScriptInstruction<Integer> enterloop = new ClientScriptInstruction<Integer>(Opcodes.GOTO,-1);
	    	this.writeBuffer[this.writePointer++] = enterloop;
	    	int position = this.writePointer;
	    	this.writeAbstractCode(whileNode.scope);
	    	int afterScope = this.writePointer;
	    	enterloop.setAttachment(this.writePointer - position);
	    	int opcode = -1;

	    	int exprType = this.getOptimizedExprType(whileNode.expression);
	    	if (exprType == 0) { // not optimized
	    		this.writeAbstractCode(whileNode.expression);
	    		opcode = Opcodes.INT_EQ;
	    	}
	    	else if (exprType == 1) { // direct conditional jump
		    	ConditionalExpressionNode cen = (ConditionalExpressionNode)whileNode.expression;
		    	if (cen.left.getType().runtimeStackType != cen.right.getType().runtimeStackType)
		    		throw new CompilerException("Type doesn't match!");
		    	int type = cen.left.getType().runtimeStackType;
		    	if (type == 1 || type == -1)
		    		throw new CompilerException("Unsupported type:" + cen.left.getType());
		    	this.writeAbstractCode(cen.left);
		    	this.writeAbstractCode(cen.right);
		    	opcode = this.conditionalOpcode(cen.conditional, type == 2);
	    	}
	    	else if (exprType == 2) { // 6 or 7 conditionals jump
	    		throw new RuntimeException("TODO");
	    	}
	    	else {
	    		throw new RuntimeException("Unknown expr type:" + exprType);
	    	}
	    	
    		if (exprType != -2) {
    			this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(opcode,-(this.writePointer - position));
    		}
    		
    		for (FlowControlNode fcn : whileNode.controllers) {
    			if (fcn instanceof BreakNode) {
    				((ClientScriptInstruction<Integer>)this.writeBuffer[fcn.offset]).setAttachment((this.writePointer - 1) - fcn.offset);
    			}
    			else if (fcn instanceof ContinueNode) {
    				((ClientScriptInstruction<Integer>)this.writeBuffer[fcn.offset]).setAttachment((afterScope - 1) - fcn.offset);
    			}
    			else {
    				throw new CompilerException("Unknown controller:" + fcn);
    			}
    		}
	    }
	    else if (node instanceof IfElseNode) {
	    	IfElseNode ifElse = (IfElseNode)node;

	    	int exprType = this.getOptimizedExprType(ifElse.expression);
	    	int opcode;
	    	if (exprType == 0) {
	    		opcode = Opcodes.INT_NE;
	    	}
	    	else if (exprType == 1) {
		    	ConditionalExpressionNode cen = (ConditionalExpressionNode)ifElse.expression;
		    	if (cen.left.getType().runtimeStackType != cen.right.getType().runtimeStackType)
		    		throw new CompilerException("Type doesn't match!");
		    	int type = cen.left.getType().runtimeStackType;
		    	if (type == 1 || type == -1)
		    		throw new CompilerException("Unsupported type:" + cen.left.getType());
		    	this.writeAbstractCode(cen.left);
		    	this.writeAbstractCode(cen.right);
		    	opcode = this.conditionalReversedOpcode(cen.conditional, type == 2);
	    	}
	    	else if (exprType == 2) { // TODO optimized || and &&.
	    		throw new RuntimeException("TODO");
	    	}
	    	else {
	    		throw new RuntimeException("Unknown expr type:" + exprType);
	    	}
	    	
	    	if (exprType != 2) {
	    		ClientScriptInstruction<Integer> elseJump = new ClientScriptInstruction<Integer>(opcode,-1);
	    		ClientScriptInstruction<Integer> ifEscapeJump = ifElse.hasFalseScope() ? new ClientScriptInstruction<Integer>(Opcodes.GOTO,-1) : null;
	    		this.writeBuffer[this.writePointer++] = elseJump;
		    	int startPosition = this.writePointer;
	    		this.writeAbstractCode(ifElse.trueScope);
	    		if (ifEscapeJump != null) {
	    			this.writeBuffer[this.writePointer++] = ifEscapeJump;
	    		}
	    		elseJump.setAttachment(this.writePointer - startPosition);
	    		startPosition = this.writePointer;
	    		if (ifEscapeJump != null) {
	    			this.writeAbstractCode(ifElse.falseScope);
	    			ifEscapeJump.setAttachment(this.writePointer - startPosition);
	    		}
	    	}
    		
	    }
	    else if (node instanceof ConditionalExpressionNode) {
	    	ConditionalExpressionNode cen = (ConditionalExpressionNode)node;
	    	if (cen.left.getType().runtimeStackType != cen.right.getType().runtimeStackType)
	    		throw new CompilerException("Type doesn't match!");
	    	int type = cen.left.getType().runtimeStackType;
	    	if (type == 1 || type == -1)
	    		throw new CompilerException("Unsupported type:" + cen.left.getType());
	    	
	    	if (cen.conditional < 6) {
		    	this.writeAbstractCode(cen.left);
		    	this.writeAbstractCode(cen.right);
		    	int op = this.conditionalReversedOpcode(cen.conditional, type == 2);
	    		this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(op,2); // jump by three instructions
	    		this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.PUSH_INT,1);
	    		this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.GOTO,1); // jump by two instructions
	    		this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.PUSH_INT,0);
	    	}
	    	else {
	    		if (type == 2)
	    			throw new CompilerException("Unsuported conditional for long:" + cen.conditional);
	    		if (cen.conditional == 6) {
	    			// || condition
	    			this.writeAbstractCode(cen.left);
	    			this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.PUSH_INT,1);
	    			ClientScriptInstruction<Integer> firstJump = new ClientScriptInstruction<Integer>(Opcodes.INT_EQ,-1);
	    			int firstJumpPosition = this.writePointer;
	    			this.writeBuffer[this.writePointer++] = firstJump;
	    			this.writeAbstractCode(cen.right);
	    			this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.PUSH_INT,1);
	    			this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.INT_EQ,2); // jump by three instructions
	    			this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.PUSH_INT,0);
		    		this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.GOTO,1); // jump by two instructions
		    		this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.PUSH_INT,1);
	    			firstJump.setAttachment(((this.writePointer - 1) - firstJumpPosition) - 1);
	    		}
	    		else if (cen.conditional == 7) {
	    			// && condition
	    			this.writeAbstractCode(cen.left);
	    			this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.PUSH_INT,1);
	    			ClientScriptInstruction<Integer> firstJump = new ClientScriptInstruction<Integer>(Opcodes.INT_NE,-1);
	    			int firstJumpPosition = this.writePointer;
	    			this.writeBuffer[this.writePointer++] = firstJump;
	    			this.writeAbstractCode(cen.right);
	    			this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.PUSH_INT,1);
	    			this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.INT_NE,2); // jump by three instructions
	    			this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.PUSH_INT,1);
		    		this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.GOTO,1); // jump by two instructions
		    		this.writeBuffer[this.writePointer++] = new ClientScriptInstruction<Integer>(Opcodes.PUSH_INT,0);
	    			firstJump.setAttachment(((this.writePointer - 1) - firstJumpPosition) - 1);
	    		}
	    	}
	    }
	    else {
	    	throw new CompilerException("Unknown node type:" + node.getClass().getName());
	    }
	    
	}
	
	private void bufferToAssembly() {
	    this.assembly = new ClientScriptInstruction<?>[this.writePointer];
	    for (int i = 0; i < this.writePointer; i++)
	    	this.assembly[i] = this.writeBuffer[i];
	}
	
	private int conditionalOpcode(int conditional, boolean isLong) throws CompilerException {
		switch (conditional) {
			case 0:
				return isLong ? Opcodes.LONG_NE : Opcodes.INT_NE;
			case 1:
				return isLong ? Opcodes.LONG_EQ : Opcodes.INT_EQ;
			case 2:
				return isLong ? Opcodes.LONG_GT : Opcodes.INT_GT;
			case 3:
				return isLong ? Opcodes.LONG_LT : Opcodes.INT_LT;
			case 4:
				return isLong ? Opcodes.LONG_GE : Opcodes.INT_GE;
			case 5:
				return isLong ? Opcodes.LONG_LE : Opcodes.INT_LE;
			default:
				throw new CompilerException("Unknown conditional:" + conditional);
		}
	}
	
	private int conditionalReversedOpcode(int conditional, boolean isLong) throws CompilerException {
		switch (conditional) {
			case 0:
				return isLong ? Opcodes.LONG_EQ : Opcodes.INT_EQ;
			case 1:
				return isLong ? Opcodes.LONG_NE : Opcodes.INT_NE;
			case 2:
				return isLong ? Opcodes.LONG_LE : Opcodes.INT_LE;
			case 3:
				return isLong ? Opcodes.LONG_GE : Opcodes.INT_GE;
			case 4:
				return isLong ? Opcodes.LONG_LT : Opcodes.INT_LT;
			case 5:
				return isLong ? Opcodes.LONG_GT : Opcodes.INT_GT;
			default:
				throw new CompilerException("Unknown conditional:" + conditional);
		}
	}
	
	private int getOptimizedExprType(ExpressionNode expr) {
		if (expr instanceof ConditionalExpressionNode) {
			return ((ConditionalExpressionNode)expr).conditional < 6 ? 1 : 2;
		}
		return 0;
	}
}
