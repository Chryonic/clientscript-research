/* IUnknownReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

class IUnknownReference extends WeakReference_Sub1
{
    protected final native long releasePeer(long argument_0_);
    
    IUnknownReference(IUnknown argument_1_, Class394 argument_2_) {
	super((Peer) argument_1_, argument_2_);
    }
}
