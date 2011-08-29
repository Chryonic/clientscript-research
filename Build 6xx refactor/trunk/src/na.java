/* na - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class na extends Class_aa implements Interface3
{
    long aLong3465;
    
    public final native void w(boolean argument_0_);
    
    protected final void finalize() {
	if (((na) this).aLong3465 != 0L)
	    Class346.method3809(this, (byte) 20);
    }
    
    private final native void ma(NativeToolkit argument_1_, ya argument_2_,
				 int argument_3_, int argument_4_,
				 int[] argument_5_, int[] argument_6_);
    
    na(NativeToolkit argument_7_, ya argument_8_, int argument_9_, int argument_10_,
       int[] argument_11_, int[] argument_12_) {
	ma(argument_7_, argument_8_, argument_9_, argument_10_, argument_11_,
	   argument_12_);
    }
}
