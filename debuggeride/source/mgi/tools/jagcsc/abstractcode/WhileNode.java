package mgi.tools.jagcsc.abstractcode;

public class WhileNode extends ControllableFlowNode {

    /**
     * Contains expression which type is boolean.
     */
    public ExpressionNode expression;
    /**
     * Contains scope which should be executed if 
     * expression results in true.
     */
    public ScopeNode scope;  
    
    public WhileNode(ScopeNode scope, ExpressionNode expr) {
    	this.expression = expr;
    	this.scope = scope;
		this.write(expr);
		this.write(scope);
		expr.setParent(this);
		scope.setParent(this);
    }
    
    @Override
    public AbstractCodeNode optimize() {
    	if (this.expression instanceof BooleanExpressionNode) {
    		if (((BooleanExpressionNode)this.expression).getData() == false) {
    			return new EmptyNode();
    		}
    	}
    	return this;
    }
    
    public String toString() {
    	StringBuilder bld = new StringBuilder();
    	
    	bld.append("while (");
    	bld.append(this.expression.toString());
    	bld.append(") ");
    	bld.append(this.scope.toString());
    	return bld.toString();
    }

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild, AbstractCodeNode optimizedChild) {
		if (prevChild == this.expression)
			this.expression = (ExpressionNode)optimizedChild;
		else if (prevChild == this.scope)
			this.scope = (ScopeNode)optimizedChild;
		
	}

	@Override
	public ScopeNode getControllableScope() {
		return this.scope;
	}

	@Override
	public boolean canBreak() {
		return true;
	}

	@Override
	public boolean canContinue() {
		return true;
	}

}
