package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.analyzer.CS2Type;

public class VariableAssignationNode extends ExpressionNode {

    /**
     * Variable that is being assigned a value.
     */
    public LocalVariable variable;
    /**
     * Contains assignation expression
     */
    public ExpressionNode expression;
    
    public VariableAssignationNode(LocalVariable variable,ExpressionNode expr) {
    	this.variable = variable;
    	this.expression = expr;
    	this.write(expr);
    	expr.setParent(this);
    }
    
    @Override
    public AbstractCodeNode optimize() {
    	return this;
    }
    
    @Override
    public String toString() {
    	return variable.name + " = " + this.expression;
    }

    @Override
    public int getComponentsCount() {
    	return 1;
    }

    @Override
    public CS2Type getType() {
    	return expression.getType();
    }

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild, AbstractCodeNode optimizedChild) {
		if (prevChild == this.expression)
			this.expression = (ExpressionNode)optimizedChild;
		
	}

}
