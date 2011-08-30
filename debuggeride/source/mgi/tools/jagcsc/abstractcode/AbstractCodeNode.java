package mgi.tools.jagcsc.abstractcode;

import mgi.utilities.Bag;

public abstract class AbstractCodeNode {

	/**
	 * Contains childs of this node.
	 * most times childs contains expression data.
	 * for example:
	 * print(@something(#something))
	 * Tree would be parsed as:
	 * print -> @something -> #something
	 * Meaning that @something would be child of print
	 * and parent of #something.
	 */
	public Bag<AbstractCodeNode> childs;
	/**
	 * Contains info if read mode is on.
	 */
	public boolean readMode;
	
	
	
	public AbstractCodeNode() {
		this.childs = new Bag<AbstractCodeNode>();
		this.readMode = false;
	}


	/**
	 * Optimizes given expression node.
	 * @return
	 * Return's new optimized code node.
	 */
	public abstract AbstractCodeNode optimize();
	
	/**
	 * This method get's called when one of the node childs get's optimized.
	 * @param prevChild
	 * Previous child that was not optimized.
	 * @param optimizedChild
	 * Optimized child.
	 */
	public abstract void onChildOptimized(AbstractCodeNode prevChild,AbstractCodeNode optimizedChild);
	
	public void write(AbstractCodeNode node) {
		if (this.readMode) {
			throw new RuntimeException("Read mode is on, unable to write!");
		}
		else {
			this.childs.Put(node);
		}
	}
	
	public AbstractCodeNode read() {
		if (!this.readMode) {
			throw new RuntimeException("Read mode is off, unable to read!");
		}
		else {
			return this.childs.Take();
		}
	}
	
	public void readMode() {
		if (this.readMode) {
			throw new RuntimeException("Read mode is already on!");
		}
		else {
			synchronized (this.childs) {
				this.readMode = true;
				this.childs.Flip();
			}
		}
	}
	
	public void writeMode() {
		if (!this.readMode) {
			throw new RuntimeException("Write mode is already on!");
		}
		else {
			synchronized (this.childs) {
				this.readMode = false;
				this.childs.Flip();
			}
		}
	}
}
