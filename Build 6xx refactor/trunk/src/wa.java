/* wa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wa implements Interface15
{
    xa aXa3653;
    private long aLong3654 = 0L;
    j aJ3655;
    
    private final native void X
	(long argument_0_, long argument_1_, long argument_2_, int argument_3_,
	 int argument_4_, int argument_5_, int argument_6_, int argument_7_,
	 int argument_8_, boolean argument_9_, boolean argument_10_);
    
    public final void method61(int argument_11_, int argument_12_,
			       int argument_13_, int argument_14_,
			       int argument_15_, int argument_16_,
			       boolean argument_17_, boolean argument_18_) {
	Z(aLong3654, ((j) ((wa) this).aJ3655).aLong5595,
	  ((xa) ((wa) this).aXa3653).aLong3500, argument_11_, argument_12_,
	  argument_13_, argument_14_, argument_15_, argument_16_, argument_17_,
	  argument_18_);
    }
    
    public final void method60(int argument_19_, int argument_20_,
			       int argument_21_, int argument_22_,
			       int argument_23_, int argument_24_,
			       boolean argument_25_, boolean argument_26_) {
	X(aLong3654, ((j) ((wa) this).aJ3655).aLong5595,
	  ((xa) ((wa) this).aXa3653).aLong3500, argument_19_, argument_20_,
	  argument_21_, argument_22_, argument_23_, argument_24_, argument_25_,
	  argument_26_);
    }
    
    private final native void Z
	(long argument_27_, long argument_28_, long argument_29_,
	 int argument_30_, int argument_31_, int argument_32_,
	 int argument_33_, int argument_34_, int argument_35_,
	 boolean argument_36_, boolean argument_37_);
    
    wa(NativeToolkit argument_38_, j argument_39_, xa argument_40_) {
	aLong3654 = ((NativeToolkit) argument_38_).aLong3467;
	((wa) this).aJ3655 = argument_39_;
	((wa) this).aXa3653 = argument_40_;
    }
}
