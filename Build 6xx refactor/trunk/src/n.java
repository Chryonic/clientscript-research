/* n - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class n extends AbstractFont implements Interface3
{
    long aLong3464;
    
    public final native void w(boolean argument_0_);
    
    private final native void S(NativeToolkit argument_1_, ya argument_2_,
				byte[][] argument_3_, int[] argument_4_,
				int[] argument_5_, int[] argument_6_,
				int[] argument_7_, int[] argument_8_);
    
    final native void drawCharacter2(char character_, int x_, int y_, int colour_, boolean argument_13_);
    
    final void drawCharacter(char character_, int x_, int y_, int argument_17_, boolean argument_18_, Class_aa argument_19_, int argument_20_, int argument_21_) {
	PA(character_, x_, y_, argument_17_,
	   argument_18_, argument_19_, argument_20_, argument_21_);
    }
    
    protected final void finalize() {
	if (((n) this).aLong3464 != 0L)
	    Class346.method3809(this, (byte) 20);
    }
    
    private final native void PA(char argument_22_, int argument_23_,
				 int argument_24_, int argument_25_,
				 boolean argument_26_, Class_aa argument_27_,
				 int argument_28_, int argument_29_);
    
    n(NativeToolkit argument_30_, ya argument_31_, Class76 argument_32_,
      Class83[] argument_33_, Class368[] argument_34_) {
	super(argument_30_, argument_32_);
	byte[][] anLocalInts = new byte[argument_33_.length][];
	int[] anLocalInts_35_ = new int[argument_33_.length];
	int[] anLocalInts_36_ = new int[argument_33_.length];
	int[] anLocalInts_37_ = new int[argument_33_.length];
	int[] anLocalInts_38_ = new int[argument_33_.length];
	for (int anLocalInt = 0; anLocalInt < argument_33_.length;
	     anLocalInt++) {
	    anLocalInts[anLocalInt]
		= ((Class83) argument_33_[anLocalInt]).aByteArray591;
	    anLocalInts_35_[anLocalInt]
		= ((Class83) argument_33_[anLocalInt]).anInt590;
	    anLocalInts_36_[anLocalInt]
		= ((Class83) argument_33_[anLocalInt]).anInt587;
	    anLocalInts_37_[anLocalInt]
		= ((Class83) argument_33_[anLocalInt]).anInt593;
	    anLocalInts_38_[anLocalInt]
		= ((Class83) argument_33_[anLocalInt]).anInt589;
	}
	S(argument_30_, argument_31_, anLocalInts,
	  ((Class83) argument_33_[0]).anIntArray586, anLocalInts_35_,
	  anLocalInts_36_, anLocalInts_37_, anLocalInts_38_);
    }
}
