/* VorbisInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;
import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisInfo extends SimplePeer
{
    public int anInt5555;
    public int anInt5556;
    
    protected final native void clear();
    
    private static final native void initFields();
    
    private final native void init();
    
    public final native int headerIn(VorbisComment argument_0_,
				     OggPacket argument_1_);
    
    public VorbisInfo() {
	init();
	if (this.method4214())
	    throw new IllegalStateException();
    }
    
    static {
	initFields();
    }
}
