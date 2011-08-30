package mgi.tools.jagcsc.abstractcode;

import java.util.ArrayList;
import java.util.List;

import mgi.tools.jagcsc.compiler.ClientScriptInstruction;

public class FlowControlNode extends AbstractCodeNode {

	/**
	 * Contains flow node that this node controls.
	 */
	public ControllableFlowNode controlledNode;
	/**
	 * Contains offset set by assemblyGenerator and used by it later.
	 */
	public int offset;
	
	public FlowControlNode(ControllableFlowNode controlledNode) { 
		this.controlledNode = controlledNode;
		this.controlledNode.controllers.add(this);
	}

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild, AbstractCodeNode optimizedChild) {
		
	}

	@Override
	public AbstractCodeNode optimize() {
		return this;
	}
}
