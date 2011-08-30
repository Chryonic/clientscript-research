package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.analyzer.CS2Type;

public class IntExpressionNode extends ExpressionNode implements IConstantNode {

    /**
     * Contains int which this expression holds.
     */
    private int data;
    
    public IntExpressionNode(int data) {
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

    public void setData(int data) {
    	this.data = data;
    }

    public int getData() {
    	return data;
    }
    
    public String toString() {
    	return "" + this.data + "";
    }

    @Override
    public CS2Type getType() {
    	return CS2Type.int_type;
    }

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild,
			AbstractCodeNode optimizedChild) {
		
	}
	
	@Override
	public Object getConst() {
		return this.data;
	}

}
