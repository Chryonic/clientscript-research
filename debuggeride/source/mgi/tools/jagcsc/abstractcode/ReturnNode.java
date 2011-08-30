package mgi.tools.jagcsc.abstractcode;

public class ReturnNode extends AbstractCodeNode {

    /**
     * Contains return expression.
     */
    public ExpressionNode expression;
        
    
    public ReturnNode(ExpressionNode expr) {
    	this.expression = expr;
		this.write(expr);
		expr.setParent(this);
    }
    
    @Override
    public AbstractCodeNode optimize() {
    	
    	return this;
    }
    
    
    public String toString() {
    	return "return " + expression.toString() + ";";
    }

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild, AbstractCodeNode optimizedChild) {
		if (prevChild == this.expression)
			this.expression = (ExpressionNode)optimizedChild;
		
	}

}
