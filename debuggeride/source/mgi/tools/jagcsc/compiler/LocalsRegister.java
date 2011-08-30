package mgi.tools.jagcsc.compiler;

import mgi.tools.jagcsc.CompilerException;
import mgi.tools.jagcsc.abstractcode.LocalVariable;

/**
 * Class for manipulating locals register slots.
 */
public class LocalsRegister {

    /**
     * Contains our slots array
     * First dimension of this array represends
     * type of the local variable:
     * 0 - Integer
     * 1 - String
     * 2 - Long
     */
    private LocalVariable[][] slots = new LocalVariable[3][1000];
    /**
     * Contains highest local variable slot that was ever allocated.
     */
    private int[] highestSlot = new int[] { -1, -1, -1 };
    
    public LocalsRegister() {
    }
    
    /**
     * Delete's local variable from locals register.
     * @param variable
     * Variable which should be deleted.
     * @throws CompilerException
     * If variable couldn't be deleted.
     */
    public void deleteVariable(LocalVariable variable) throws CompilerException {
		int type = this.getVariableType(variable);
		for (int slot = 0; slot < this.slots[type].length; slot++) {
		    if (this.slots[type][slot] == variable) {
			this.slots[type][slot] = null;
			return;
		    }
		}
		throw new CompilerException("Couldn't find variable:" + variable);
    }
    
    /**
     * Finds local variable slot from locals register.
     * @param variable
     * Variable which should be searched for.
     * @return
     * Return's variable slot in current register situation.
     * @throws CompilerException
     * If variable couldn't be found.
     */
    public int getSlot(LocalVariable variable) throws CompilerException {
		int type = this.getVariableType(variable);
		for (int slot = 0; slot < this.slots[type].length; slot++) {
		    if (this.slots[type][slot] == variable) {
			return slot;
		    }
		}
		throw new CompilerException("Couldn't find variable:" + variable);
    }
    
    /**
     * Allocate's variable to locals register. 
     * @param variable
     * Variable which should be allocated.
     * @return
     * Return's allocated variable slot
     * @throws CompilerException
     * If variable type is unsupported, or slot couldn't be allocated.
     */
    public int allocateVariable(LocalVariable variable) throws CompilerException {
		int type = this.getVariableType(variable);
		for (int slot = 0; slot < this.slots[type].length; slot++) {
		    if (this.slots[type][slot] == null) {
		    	this.slots[type][slot] = variable;
		    	if (slot > this.highestSlot[type])
		    		this.highestSlot[type] = slot;
				return slot;
		    }
		}
		throw new CompilerException("Variable couldn't be allocated, increase buffer size to avoid this issue!");
    }
    
    /**
     * Get's variable type in int.
     * @param var
     * Variable from which type should be gotten.
     * @return
     * Return's variable type in int form.
     * @throws CompilerException
     * If type is unsupported.
     */
    private int getVariableType(LocalVariable var) throws CompilerException {
		if (var.type.runtimeStackType >= 0 && var.type.runtimeStackType <= 2) {
			return var.type.runtimeStackType;
		}
		else {
		    throw new CompilerException("Unsupported variable type:" + var.type);
		}
    }
    
    
    /**
     * Calculate's maximum length of locals register.
     * @return
     */
    public int calculateMaxLocals(int type) {
    	return this.highestSlot[type] + 1;
    }
    
}
