/* Class324 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GlProgramObject
{
    int glPtr;
    private GlToolkit toolkit;
    
    protected final void finalize() throws Throwable {
	toolkit.requestARBProgramDeletion(this.glPtr);
	super.finalize();
    }

    GlProgramObject(GlToolkit toolkit, int ptr) {
	((GlProgramObject) this).glPtr = ptr;
	this.toolkit = toolkit;
    }
}
