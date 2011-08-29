/* NativeHeapPeerReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

class NativeHeapPeerReference extends WeakReference_Sub1
{
    NativeHeapPeerReference(Peer_Sub1 argument_0_, Class394 argument_1_) {
	super((Peer) argument_0_, argument_1_);
    }
    
    protected final native long releasePeer(long argument_2_);
}
