package mgi.tools.jagcsc.abstractcode;

public class EmptyNode extends AbstractCodeNode {


    @Override
    public AbstractCodeNode optimize() {
    	return this;
    }
    
    public String toString() {
    	return "";
    }

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild,
			AbstractCodeNode optimizedChild) {
	}

}
