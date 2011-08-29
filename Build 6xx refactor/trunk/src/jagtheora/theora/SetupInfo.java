/* SetupInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;
import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class SetupInfo extends SimplePeer
{
    protected final native void clear();
    
    public final native int decodeHeader(TheoraInfo argument_0_,
					 TheoraComment argument_1_,
					 OggPacket argument_2_);
}
