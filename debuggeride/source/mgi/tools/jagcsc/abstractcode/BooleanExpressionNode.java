package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.analyzer.CS2Type;

public class BooleanExpressionNode extends ExpressionNode {

    /**
     * Contains boolean which this expression holds.
     */
    private boolean data;
    
    public BooleanExpressionNode(boolean data) {
    	this.data = data;
    }
    
    @Override
    public int getComponentsCount() {
    	return 1;
    }

    @Override
    public AbstractCodeNode optimize() {
    	if (this.getParent() instanceof PopableNode) {
    		return new EmptyExpressionNode();
    	}
    	return this;
    }

    public void setData(boolean data) {
    	this.data = data;
    }

    public boolean getData() {
    	return data;
    }
    
    public String toString() {
    	return "" + this.data + "";
    }

    @Override
    public CS2Type getType() {
    	return CS2Type.boolean_type;
    }

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild,
			AbstractCodeNode optimizedChild) {
	}

}
