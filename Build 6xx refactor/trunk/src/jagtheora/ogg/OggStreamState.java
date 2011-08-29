/* OggStreamState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;
import jagtheora.misc.SimplePeer;

public class OggStreamState extends SimplePeer
{
    protected final native void clear();
    
    private final native boolean init(int argument_0_);
    
    public final native int packetOut(OggPacket argument_1_);
    
    public final native boolean resetSerialNo(int argument_2_);
    
    public final native int packetPeek();
    
    public final native boolean reset();
    
    public final native int packetPeek(OggPacket argument_3_);
    
    public final native boolean isEOS();
    
    public OggStreamState(int argument_4_) {
	if (!init(argument_4_))
	    throw new IllegalStateException();
    }
    
    public final native int packetOut();
    
    public final native boolean pageIn(OggPage argument_5_);
}
