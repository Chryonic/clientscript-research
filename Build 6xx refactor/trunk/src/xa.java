/* xa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class xa implements Interface17, Interface3
{
    long aLong3500 = 0L;
    
    private final native void r(int argument_0_, int argument_1_);
    
    protected final void finalize() {
	if (((xa) this).aLong3500 != 0L)
	    Class346.method3809(this, (byte) 20);
    }
    
    private final native void va(long argument_2_, boolean argument_3_);
    
    public final void w(boolean argument_4_) {
	va(((xa) this).aLong3500, argument_4_);
    }
    
    xa(int argument_5_, int argument_6_) {
	r(argument_5_, argument_6_);
    }
}
