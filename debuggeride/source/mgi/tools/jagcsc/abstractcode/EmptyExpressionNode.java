package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.analyzer.CS2Type;

public class EmptyExpressionNode extends ExpressionNode {

    @Override
    public int getComponentsCount() {
    	return 0;
    }

    @Override
    public AbstractCodeNode optimize() {
    	return this;
    }

    @Override
    public CS2Type getType() {
    	return CS2Type.void_type;
    }
    
    public String toString() {
    	return "";
    }

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild,
			AbstractCodeNode optimizedChild) {
	}

}
