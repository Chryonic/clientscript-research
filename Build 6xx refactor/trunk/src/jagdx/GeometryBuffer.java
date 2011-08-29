/* GeometryBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.memory.Buffer;
import jaclib.peer.Class394;
import jaclib.peer.Peer_Sub1;

public class GeometryBuffer extends Peer_Sub1 implements Buffer
{
    public final native int getSize();
    
    private final native void putub(byte[] argument_0_, int argument_1_,
				    int argument_2_, int argument_3_);
    
    private final native void init();
    
    public final void put(byte[] argument_4_, int argument_5_, int argument_6_, int argument_7_) {
	if ((argument_6_ < 0
	     | (argument_4_ == null | argument_5_ < 0
		| argument_4_.length < argument_7_ + argument_5_))
	    || argument_6_ + argument_7_ > getSize())
	    throw new RuntimeException_Sub1();
	putub(argument_4_, argument_5_, argument_6_, argument_7_);
    }
    
    private final native void getub(byte[] argument_8_, int argument_9_,
				    int argument_10_, int argument_11_);
    
    public GeometryBuffer(Class394 argument_12_) {
	super(argument_12_);
	init();
    }
    
    public final native long getAddress();
}
