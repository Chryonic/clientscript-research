package mgi.tools.jagcsc.abstractcode;

public class PopableNode extends AbstractCodeNode {

    public ExpressionNode expression;
    
    public PopableNode(ExpressionNode expression) {
    	this.expression = expression;
    	this.write(expression);
		expression.setParent(this);
    }
    
    @Override
    public AbstractCodeNode optimize() {
    	
    	if (this.expression instanceof EmptyExpressionNode) {
    		return new EmptyNode();
    	}
    	else if (this.expression instanceof VariableAssignationNode) {
    		this.expression.setParent(null);
    		return this.expression;
    	}
    	return this;
    }
    
    public String toString() {
    	return this.expression + ";";
    }

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild, AbstractCodeNode optimizedChild) {
		if (prevChild == this.expression)
			this.expression = (ExpressionNode)optimizedChild;
	}

}
