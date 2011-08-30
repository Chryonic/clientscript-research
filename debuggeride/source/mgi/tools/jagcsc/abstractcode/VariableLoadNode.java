package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.analyzer.CS2Type;

public class VariableLoadNode extends ExpressionNode {

    /**
     * Variable that is being loaded.
     */
    public LocalVariable variable;
    
    public VariableLoadNode(LocalVariable variable) {
    	this.variable = variable;
    }
    
    @Override
    public AbstractCodeNode optimize() {
    	if (this.getParent() instanceof PopableNode) {
    		return new EmptyExpressionNode();
    	}
    	return this;
    }
    
    @Override
    public String toString() {
    	return variable.name;
    }

    @Override
    public int getComponentsCount() {
    	return 1;
    }

    @Override
    public CS2Type getType() {
    	return this.variable.type;
    }

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild,
			AbstractCodeNode optimizedChild) {
		
	}

}
