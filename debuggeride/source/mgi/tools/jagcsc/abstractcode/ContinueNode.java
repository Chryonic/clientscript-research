package mgi.tools.jagcsc.abstractcode;

public class ContinueNode extends FlowControlNode {
        

    public ContinueNode(ControllableFlowNode controlledNode) {
		super(controlledNode);
	}

	public String toString() {
    	return "continue;";
    }

}
