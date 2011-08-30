package mgi.tools.jagcsc.abstractcode;

public class BreakNode extends FlowControlNode {
        

    public BreakNode(ControllableFlowNode controlledNode) {
		super(controlledNode);
	}

	public String toString() {
    	return "break;";
    }

}
