/* PixelBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.memory.Buffer;
import jaclib.peer.Class394;
import jaclib.peer.Peer_Sub1;

public class PixelBuffer extends Peer_Sub1 implements Buffer
{
    private final native void geti(int[] argument_0_, int argument_1_,
				   int argument_2_, int argument_3_);
    
    public PixelBuffer(Class394 argument_4_) {
	super(argument_4_);
	init();
    }
    
    public final void method4205(int[] argument_5_, int argument_6_,
				 int argument_7_, int argument_8_) {
	if ((argument_5_ == null | argument_6_ < 0
	     | argument_6_ + argument_8_ > argument_5_.length
	     | argument_7_ < 0)
	    || argument_7_ + argument_8_ * 4 > getSize())
	    throw new RuntimeException_Sub1();
	puti(argument_5_, argument_6_, argument_7_, argument_8_);
    }
    
    private final native void putub(byte[] argument_9_, int argument_10_,
				    int argument_11_, int argument_12_);
    
    public final native int getSlicePitch();
    
    private final native void puti(int[] argument_13_, int argument_14_,
				   int argument_15_, int argument_16_);
    
    public final native int getSize();
    
    public final long getAddress() {
	return 0L;
    }
    
    public final native int getRowPitch();
    
    private final native void init();
    
    private final native void getub(byte[] argument_17_, int argument_18_,
				    int argument_19_, int argument_20_);
    
    public final void put(byte[] argument_21_, int argument_22_, int argument_23_, int argument_24_) {
	if ((argument_23_ < 0
	     | (argument_22_ < 0 | argument_21_ == null
		| argument_21_.length < argument_22_ + argument_24_))
	    || argument_24_ + argument_23_ > getSize())
	    throw new RuntimeException_Sub1();
	putub(argument_21_, argument_22_, argument_23_, argument_24_);
    }
    
    public final void method4206(int[] argument_25_, int argument_26_,
				 int argument_27_, int argument_28_) {
	if ((argument_25_.length < argument_28_ + argument_26_
	     | (argument_26_ < 0 | argument_25_ == null) | argument_27_ < 0)
	    || argument_27_ + argument_28_ * 4 > getSize())
	    throw new RuntimeException_Sub1();
	geti(argument_25_, argument_26_, argument_27_, argument_28_);
    }
}
