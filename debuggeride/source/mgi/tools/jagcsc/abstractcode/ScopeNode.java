package mgi.tools.jagcsc.abstractcode;

import java.util.ArrayList;
import java.util.List;

import mgi.tools.jagcsc.CompilerException;
import mgi.utilities.Bag;

public class ScopeNode extends AbstractCodeNode {

    
    /**
     * Contains scope in which this scope is 
     * declared or null if this scope is first.
     */
    public ScopeNode parentScope;
    /**
     * Contains parent node or null if this scope doesn't have
     * parent node.
     */
    private AbstractCodeNode parent;
    /**
     * Contains list of declared local variables.
     */
    private List<LocalVariable> declaredLocalVariables;
    
    
    public ScopeNode() {
    	this(null);
    }
    
    public ScopeNode(ScopeNode parent) {
    	this.parentScope = parent;
    	this.declaredLocalVariables = new ArrayList<LocalVariable>();
    }
    
    /**
     * Declare's given local variable to this scope.
     * @param variable
     * @throws CompilerException
     * If variable there's variable with the same name declared.
     */
    public void declare(LocalVariable variable) throws CompilerException {
    	if (this.isDeclared(variable.name)) {
    		throw new CompilerException("Variable (" + variable.toString() + ") is already declared!");
    	}
    	this.declaredLocalVariables.add(variable);
    }
    
    /**
     * Get's declared local variable from this scope or one of the parent scopes.
     * @param localName
     * Local name of the variable that should be returned.
     * @return
     * Returns local variable with given localName.
     * @throws CompilerException
     * If the given local variable is not declared.
     */
    public LocalVariable getLocalVariable(String localName) throws CompilerException {
		for (LocalVariable var : this.declaredLocalVariables) {
		    if (var.name.equals(localName)) {
		    	return var;
		    }
		}
		if (this.parentScope != null) {
		    return this.parentScope.getLocalVariable(localName);
		}
		throw new CompilerException("Variable " + localName + " is not declared!");
    }
    
    /**
     * Get's if given local variable is declared in this
     * scope or in parent scopes.
     * @param localName
     * Name of the local variable
     * @return 
     * Wheter given local variable is declared.
     */
    public boolean isDeclared(String localName) {
		for (LocalVariable var : this.declaredLocalVariables) {
		    if (var.name.equals(localName)) {
		    	return true;
		    }
		}
		if (this.parentScope != null) {
		    return this.parentScope.isDeclared(localName);
		}
		return false;
    }
    
    /**
     * Copies declared variables in this scope only.
     */
    public List<LocalVariable> copyDeclaredVariables() {
    	return new ArrayList<LocalVariable>(this.declaredLocalVariables);
    }
    
    /**
     * Get's if this scopeNode is empty.
     * @return
     */
    public boolean isEmpty() {
    	return this.childs.getData().size() <= 0;
    }
    
    public String toString() {
		StringBuilder bld = new StringBuilder();
		bld.append("{\n");
		for (LocalVariable var : this.declaredLocalVariables) {
		    bld.append(var.toString() + '\n');
		}
		Bag<AbstractCodeNode> childs = this.childs.Copy();
		childs.Flip();
		while (childs.getLength() > 0) {
		    bld.append(childs.Take().toString() + "\n");
		}
		bld.append("}");
		return bld.toString();
    }

    @Override
    public AbstractCodeNode optimize() {
    	Bag<AbstractCodeNode> childs = this.childs.Copy();
    	childs.Flip();
    	if (this.declaredLocalVariables.size() == 0 && childs.getLength() == 1) {
    		AbstractCodeNode node = childs.Take();
    		if (!(node instanceof ScopeNode)) {
    			return this;
    		}
    		ScopeNode scnode = (ScopeNode)node;
    		scnode.parentScope = this.parentScope;
    		return node;
    		
    	}
    	return this;
    }

	@Override
	public void onChildOptimized(AbstractCodeNode prevChild,
			AbstractCodeNode optimizedChild) {
	}

	public void setParent(AbstractCodeNode parentInstruction) {
		this.parent = parentInstruction;
	}

	public AbstractCodeNode getParent() {
		return parent;
	}
    
    
}
