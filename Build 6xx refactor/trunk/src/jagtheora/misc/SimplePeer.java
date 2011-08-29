/* SimplePeer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.misc;

public abstract class SimplePeer
{
    private long aLong3419;
    
    public final boolean method4214() {
	if (aLong3419 != 0L)
	    return false;
	return true;
    }
    
    protected abstract void clear();
    
    public final void method4215() {
	if (!method4214())
	    clear();
    }
    
    private static final native void init();
    
    protected final void finalize() throws Throwable {
	if (!method4214())
	    method4215();
	super.finalize();
    }
    
    private final void method4216(long argument_0_) {
	aLong3419 = argument_0_;
    }
    
    static {
	init();
    }
}
