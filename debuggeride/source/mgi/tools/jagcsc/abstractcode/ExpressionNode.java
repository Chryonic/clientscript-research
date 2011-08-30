package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.analyzer.CS2Type;

public abstract class ExpressionNode extends AbstractCodeNode {

    
    /**
     * Contains parent or null if this expression return is 
     * not used.
     */
    private AbstractCodeNode parent;
    
    /**
     * Get's count of components in this expression.
     * @return
     * Return's component's count.
     */
    public abstract int getComponentsCount();
    
    /**
     * Return's type of this expression.
     */
    public abstract CS2Type getType();

    public void setParent(AbstractCodeNode parent) {
    	this.parent = parent;
    }

    public AbstractCodeNode getParent() {
    	return parent;
    }
}
