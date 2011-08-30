package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.analyzer.CS2Type;

public class LongExpressionNode extends ExpressionNode implements IConstantNode {

    /**
     * Contains long which this expression holds.
     */
    private long data;
    
    public LongExpressionNode(long data) {
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

    public void setData(long data) {
    	this.data = data;
    }

    public long getData() {
    	return data;
    }
    
    public String toString() {
    	return "" + this.data + "";
    }

    @Override
    public CS2Type getType() {
    	return CS2Type.long_type;
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
