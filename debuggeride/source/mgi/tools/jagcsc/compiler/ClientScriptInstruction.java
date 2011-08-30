package mgi.tools.jagcsc.compiler;

public class ClientScriptInstruction<T> {

    /**
     * Contains opcode of this instruction.
     */
    private int opcode;
    /**
     * Contains instruction attachment.
     */
    private T attachment;
    
    public ClientScriptInstruction(int opcode,T attachment) {
		this.opcode = opcode;
		if (!isValidAttachment(attachment)) {
		    throw new RuntimeException("Invalid instruction " + this.opcode + " attachment!");
		}
		this.attachment = attachment;
    }
    
    private boolean isValidAttachment(T attachment) {
		if (this.opcode == 3 && attachment instanceof String)
		    return true;
		if (this.opcode == 54 && attachment instanceof Long)
		    return true;
		if ((this.opcode < 150 && this.opcode != 21 && this.opcode != 38 && this.opcode != 39) && attachment instanceof Integer)
		    return true;
		if (attachment instanceof Boolean)
		    return true;
		return false;
    }

    public void setAttachment(T attachment) {
		if (!isValidAttachment(attachment))
			throw new RuntimeException("Invalid instruction " + this.opcode + " attachment!");
		this.attachment = attachment;
    }
    
    public T getAttachment() {
    	return attachment;
    }

    public int getOpcode() {
    	return opcode;
    }
    
    public String toString() {
    	return Opcodes.getOpcodeName(this.opcode) + "[" + this.getAttachment().toString() + "]";
    }
    
}
