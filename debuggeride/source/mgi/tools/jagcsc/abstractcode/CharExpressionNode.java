package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.CompilerException;
import mgi.tools.jagcsc.analyzer.CS2Type;

public class CharExpressionNode extends ExpressionNode implements IConstantNode {

    /**
     * Contains char which this expression holds.
     */
    private char data;
    
    public CharExpressionNode(String data) throws CompilerException {
		if (data.startsWith("\\")) {
		    if (data.equals("\\n")) {
		    	this.data = '\n';
		    }
		    else if (data.equals("\\t")) {
		    	this.data = '\t';
		    }
		    else if (data.equals("\\\\")) {
		    	this.data = '\\';
		    }
		    else {
		    	throw new CompilerException("Unexpected character:" + data);
		    }
		}
		else {
		    if (data.length() > 1 || data.length() < 1) {
		    	throw new CompilerException("Unexpected character:" + data);
		    }
		    this.data = data.charAt(0);
		}
    }
    
    @Override
    public int getComponentsCount() {
    	return 1;
    }

    @Override
    public AbstractCodeNode optimize() {
    	if (this.getParent() instanceof PopableNode) {
    		return new EmptyExpressionNode();
    	}
    	return this;
    }

    public void setData(char data) {
    	this.data = data;
    }

    public char getData() {
    	return data;
    }
    
    public String toString() {
    	return "'" + this.data + "'";
    }

    @Override
    public CS2Type getType() {
    	return CS2Type.char_type;
    }

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild,
			AbstractCodeNode optimizedChild) {
		
	}

	@Override
	public Object getConst() {
		return this.data;
	}

}
