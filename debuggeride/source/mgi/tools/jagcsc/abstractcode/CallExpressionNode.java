package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.analyzer.CS2Type;
import mgi.tools.jagcsc.analyzer.FunctionDefinition;

public class CallExpressionNode extends ExpressionNode {

	/**
	 * Contains definition to this call.
	 */
    public FunctionDefinition definition;
    /**
     * Contains arguments of this call.
     */
    public ExpressionNode[] arguments;
    
    public CallExpressionNode(FunctionDefinition function,ExpressionNode[] arguments) {
    	this.definition = function;
    	this.arguments = arguments;
    	
    	for (int i = 0; i < arguments.length; i++) {
    		this.write(arguments[i]);
    		arguments[i].setParent(this);
    	}
    }
    
    @Override
    public int getComponentsCount() {
    	return this.arguments.length;
    }

    @Override
    public AbstractCodeNode optimize() {
    	return this;
    }

    public String toString() {
    	StringBuilder buff = new StringBuilder();
    	buff.append(this.definition.name);
    	buff.append("(");
    	for (int i = 0; i < this.arguments.length; i++) {
    		boolean last = (i + 1) >= this.arguments.length;
    		buff.append(this.arguments[i].toString() + (last ? "" : ", "));
    	}
    	buff.append(")");
    	return buff.toString();
    }

    @Override
    public CS2Type getType() {
    	return definition.returnType;
    }

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild, AbstractCodeNode optimizedChild) {
		for (int i = 0; i < this.arguments.length; i++) {
			if (this.arguments[i] == prevChild) {
				this.arguments[i] = (ExpressionNode)optimizedChild;
			}
		}
	}

}
