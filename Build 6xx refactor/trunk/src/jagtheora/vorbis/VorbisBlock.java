/* VorbisBlock - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;
import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisBlock extends SimplePeer
{
    private final native void init(DSPState argument_0_);
    
    public VorbisBlock(DSPState argument_1_) {
	init(argument_1_);
	if (this.method4214())
	    throw new IllegalStateException();
    }
    
    protected final native void clear();
    
    public final native int synthesis(OggPacket argument_2_);
}
