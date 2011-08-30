package mgi.tools.jagcsc.abstractcode;

public class IfElseNode extends AbstractCodeNode {

    /**
     * Contains expression which type is boolean.
     */
    public ExpressionNode expression;
    /**
     * Contains scope which should be executed if 
     * expression results in true.
     */
    public ScopeNode trueScope;  
    /**
     * Contains scope which should be executed if
     * expression results in false.
     */
    public ScopeNode falseScope;
    
    public IfElseNode(ScopeNode trueScope,ScopeNode falseScope, ExpressionNode expr) {
    	this.expression = expr;
    	this.trueScope = trueScope;
    	this.falseScope = falseScope;
		this.write(expr);
		this.write(trueScope);
		this.write(falseScope);
		expr.setParent(this);
		this.trueScope.setParent(this);
		this.falseScope.setParent(this);
    }
    
    @Override
    public AbstractCodeNode optimize() {
    	if (this.expression instanceof BooleanExpressionNode) {
    		// constant expr
    		if (!this.hasTrueScope() && !this.hasFalseScope())
    			return new EmptyNode();
    		boolean value = ((BooleanExpressionNode)this.expression).getData();
    		return value ? this.trueScope : this.falseScope;
    	}
    	else {
    		if (!this.hasTrueScope() && !this.hasFalseScope()) {
    			this.expression.setParent(null);
    			return this.expression;
    		}
    		
    	}
    	return this;
    }
    
    public boolean hasTrueScope() {
    	return !this.trueScope.isEmpty();
    }
    
    public boolean hasFalseScope() {
    	return !this.falseScope.isEmpty();
    }
    
    public String toString() {
    	StringBuilder bld = new StringBuilder();
    	
    	bld.append("if (");
    	bld.append(this.expression.toString());
    	bld.append(") ");
    	bld.append(this.trueScope.toString());
    	if (this.hasFalseScope()) {
    		bld.append(" else ");
    		bld.append(this.falseScope.toString());
    	}
    	return bld.toString();
    }

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild, AbstractCodeNode optimizedChild) {
		if (prevChild == this.expression)
			this.expression = (ExpressionNode)optimizedChild;
		else if (prevChild == this.trueScope)
			this.trueScope = (ScopeNode)optimizedChild;
		else if (prevChild == this.falseScope)
			this.falseScope = (ScopeNode)optimizedChild;
		
	}

}
