/* IUnknown - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

public class IUnknown extends Peer
{
    public final long method4179(byte argument_0_) {
	if (argument_0_ != -70)
	    return -13L;
	return super.method4177();
    }
    
    public final native long AddRef();
    
    protected IUnknown(Class394 argument_1_) {
	aWeakReference_Sub1_3309 = new IUnknownReference(this, argument_1_);
    }
}
