/* OggSyncState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;
import jagtheora.misc.SimplePeer;

public class OggSyncState extends SimplePeer
{
    public final native int pageOut(OggPage argument_0_);
    
    public final native boolean reset();
    
    public final native long pageSeek(OggPage argument_1_);
    
    private final native void init();
    
    protected final native void clear();
    
    public OggSyncState() {
	init();
	if (this.method4214())
	    throw new IllegalStateException();
    }
    
    public final native boolean write(byte[] argument_2_, int argument_3_);
}
