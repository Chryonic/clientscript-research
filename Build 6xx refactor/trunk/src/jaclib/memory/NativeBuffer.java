/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source
{
    private long aLong3741;
    private int anInt3742 = -1;
    
    public final int getSize() {
	return anInt3742;
    }
    
    private final native void put(long argument_0_, byte[] argument_1_,
				  int argument_2_, int argument_3_,
				  int argument_4_);
    
    protected final void method4152(long argument_5_, int argument_6_) {
	aLong3741 = argument_5_;
	anInt3742 = argument_6_;
    }
    
    public final long getAddress() {
	return aLong3741;
    }
    
    private final native void get(long argument_7_, byte[] argument_8_,
				  int argument_9_, int argument_10_,
				  int argument_11_);
    
    public void put(byte[] argument_12_, int argument_13_, int argument_14_, int argument_15_) {
	if (anInt3742 < argument_15_ + argument_14_
	    | (argument_13_ + argument_15_ > argument_12_.length
	       | (aLong3741 == 0L | argument_12_ == null | argument_13_ < 0)
	       | argument_14_ < 0))
	    throw new RuntimeException();
	put(aLong3741, argument_12_, argument_13_, argument_14_, argument_15_);
    }
}
