/* DSPState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;
import jagtheora.misc.SimplePeer;

public class DSPState extends SimplePeer
{
    public DSPState(VorbisInfo argument_0_) {
	init(argument_0_);
	if (this.method4214())
	    throw new IllegalStateException();
    }
    
    public final native void blockIn(VorbisBlock argument_1_);
    
    private final native void init(VorbisInfo argument_2_);
    
    public final native float[][] pcmOut(int argument_3_);
    
    public final native double granuleTime();
    
    public final native void read(int argument_4_);
    
    protected final native void clear();
}
