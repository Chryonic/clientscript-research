package mgi.tools.jagcsc.abstractcode;

import java.util.ArrayList;
import java.util.List;

public abstract class ControllableFlowNode extends AbstractCodeNode {
	/**
	 * Contains list of controllers.
	 */
	public List<FlowControlNode> controllers = new ArrayList<FlowControlNode>();
	/**
	 * Get's controllable scope.
	 */
	public abstract ScopeNode getControllableScope();
	/**
	 * Get's if this node can be breaked.
	 */
	public abstract boolean canBreak();
	/**
	 * Get's if this node can be continued.
	 */
	public abstract boolean canContinue();
}
