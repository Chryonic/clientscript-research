/* VertexElementCollection - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.Class394;
import jaclib.peer.Peer_Sub1;

public class VertexElementCollection extends Peer_Sub1
{
    public final native void reset();
    
    public final native void addElement(int argument_0_, int argument_1_,
					int argument_2_, int argument_3_,
					int argument_4_, int argument_5_);
    
    private final native void init();
    
    public final native void finish();
    
    public VertexElementCollection(Class394 argument_6_) {
	super(argument_6_);
	init();
    }
}
