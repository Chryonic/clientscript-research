package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.analyzer.CS2Type;

public class ConditionalExpressionNode extends ExpressionNode {

	/**
	 * Contains left expression node. 
	 */
	public ExpressionNode left;
	/**
	 * Contains right expression node.
	 */
	public ExpressionNode right;
	/**
	 * Contains expression conditional.
	 * 0 means !=
	 * 1 means ==
	 * 2 means >
	 * 3 means <
	 * 4 means >=
	 * 5 means <=
	 * 6 means ||
	 * 7 means &&
	 */
	public int conditional;
	
	public ConditionalExpressionNode(ExpressionNode left,ExpressionNode right,int conditional) {
		this.left = left;
		this.right = right;
		this.conditional = conditional;
		
		this.write(left);
		this.write(right);
		this.left.setParent(this);
		this.right.setParent(this);
	}
	
	
	@Override
	public int getComponentsCount() {
		return 2;
	}

	@Override
	public CS2Type getType() {
		return CS2Type.boolean_type;
	}

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild, AbstractCodeNode optimizedChild) {
		if (prevChild == left) 
			left = (ExpressionNode)optimizedChild;
		else if (prevChild == right)
			right = (ExpressionNode)optimizedChild;
	}
	

	@Override
	public AbstractCodeNode optimize() {
		if ((this.left instanceof IntExpressionNode || this.left instanceof BooleanExpressionNode) && 
			(this.right instanceof IntExpressionNode || this.right instanceof BooleanExpressionNode)) {
			int lvalue = this.left instanceof IntExpressionNode ? ((IntExpressionNode)this.left).getData() : (((BooleanExpressionNode)this.left).getData() ? 1 : 0);
			int rvalue = this.right instanceof IntExpressionNode ? ((IntExpressionNode)this.right).getData() : (((BooleanExpressionNode)this.right).getData() ? 1 : 0);
			
			ExpressionNode opt;
			switch (this.conditional) {
				case 0:
					opt = new BooleanExpressionNode(lvalue != rvalue);
					break;
				case 1:
					opt = new BooleanExpressionNode(lvalue == rvalue);
					break;
				case 2:
					opt = new BooleanExpressionNode(lvalue > rvalue);
					break;
				case 3:
					opt = new BooleanExpressionNode(lvalue < rvalue);
					break;
				case 4:
					opt = new BooleanExpressionNode(lvalue >= rvalue);
					break;
				case 5:
					opt = new BooleanExpressionNode(lvalue <= rvalue);
					break;
				case 6:
					opt = new BooleanExpressionNode(lvalue == 1 || rvalue == 1);
					break;
				case 7:
					opt = new BooleanExpressionNode(lvalue == 1 && rvalue == 1);
					break;
				default:
					throw new RuntimeException("Unknown conditional:" + this.conditional);
			}
			opt.setParent(this.getParent());
			return opt;
			
		}
		return this;
	}
	
	public String conditionalToString() {
		switch (this.conditional) {
		case 0:
			return "!=";
		case 1:
			return "==";
		case 2:
			return ">";
		case 3:
			return "<";
		case 4:
			return ">=";
		case 5:
			return "<=";
		case 6:
			return "||";
		case 7:
			return "&&";
		default:
			return "??";
		}
	}
	
	public String toString() {
		return this.left.toString() + " " + this.conditionalToString() + " " + this.right.toString();
	}

}
