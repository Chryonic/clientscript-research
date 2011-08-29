/* DecoderContext - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;
import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class DecoderContext extends SimplePeer
{
    public final native long granuleFrame(GranulePos argument_0_);
    
    public final native int setGranulePosition(long argument_1_);
    
    public final native int setPostProcessingLevel(int argument_2_);
    
    public DecoderContext(TheoraInfo argument_3_, SetupInfo argument_4_) {
	init(argument_3_, argument_4_);
	if (this.method4214())
	    throw new IllegalArgumentException("");
    }
    
    public final native int decodeFrame(Frame argument_5_);
    
    public final native int getMaxPostProcessingLevel();
    
    public final native double granuleTime(GranulePos argument_6_);
    
    private final native void init(TheoraInfo argument_7_,
				   SetupInfo argument_8_);
    
    public final native int decodePacketIn(OggPacket argument_9_,
					   GranulePos argument_10_);
    
    protected final native void clear();
}
