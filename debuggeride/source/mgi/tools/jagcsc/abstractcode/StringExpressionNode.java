package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.analyzer.CS2Type;

public class StringExpressionNode extends ExpressionNode implements IConstantNode {

    /**
     * Contains string which this expression holds.
     */
    private String data;
    
    public StringExpressionNode(String data) {
    	this.data = data;
    }
    
    @Override
    public int getComponentsCount() {
    	return 1;
    }

    @Override
    public AbstractCodeNode optimize() {
    	if (this.getParent() instanceof PopableNode) {
    		/**
    		 * Since our return is not used we can remove this expression.
    		 */
    		return new EmptyExpressionNode();
    	}
    	return this;
    }

    public void setData(String data) {
    	this.data = data;
    }

    public String getData() {
    	return data;
    }
    
    public String toString() {
    	return '"' + this.data + '"';
    }

    @Override
    public CS2Type getType() {
    	return CS2Type.string_type;
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
