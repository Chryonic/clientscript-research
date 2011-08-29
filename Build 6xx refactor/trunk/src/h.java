/* h - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class h extends AbstractFont implements Interface3
{
    long aLong3457;
    
    final native void drawCharacter2(char character_, int x_, int y_, int colour_, boolean argument_4_);
    
    h(NativeToolkit argument_5_, ya argument_6_, Class76 argument_7_,
      Class83[] argument_8_, Class368[] argument_9_) {
	super(argument_5_, argument_7_);
	byte[][] anLocalInts = new byte[argument_8_.length][];
	int[] anLocalInts_10_ = new int[argument_8_.length];
	int[] anLocalInts_11_ = new int[argument_8_.length];
	int[] anLocalInts_12_ = new int[argument_8_.length];
	int[] anLocalInts_13_ = new int[argument_8_.length];
	for (int anLocalInt = 0; anLocalInt < argument_8_.length;
	     anLocalInt++) {
	    anLocalInts[anLocalInt]
		= ((Class83) argument_8_[anLocalInt]).aByteArray591;
	    anLocalInts_10_[anLocalInt]
		= ((Class83) argument_8_[anLocalInt]).anInt590;
	    anLocalInts_11_[anLocalInt]
		= ((Class83) argument_8_[anLocalInt]).anInt587;
	    anLocalInts_12_[anLocalInt]
		= ((Class83) argument_8_[anLocalInt]).anInt593;
	    anLocalInts_13_[anLocalInt]
		= ((Class83) argument_8_[anLocalInt]).anInt589;
	}
	JA(argument_5_, argument_6_, anLocalInts, anLocalInts_10_,
	   anLocalInts_11_, anLocalInts_12_, anLocalInts_13_);
    }
    
    public final native void w(boolean argument_14_);
    
    final void drawCharacter(char character_, int x_, int y_, int argument_18_, boolean argument_19_, Class_aa argument_20_, int argument_21_, int argument_22_) {
	NA(character_, x_, y_, argument_18_,
	   argument_19_, argument_20_, argument_21_, argument_22_);
    }
    
    protected final void finalize() {
	if (((h) this).aLong3457 != 0L)
	    Class346.method3809(this, (byte) 20);
    }
    
    private final native void JA(NativeToolkit argument_23_, ya argument_24_,
				 byte[][] argument_25_, int[] argument_26_,
				 int[] argument_27_, int[] argument_28_,
				 int[] argument_29_);
    
    private final native void NA(char argument_30_, int argument_31_,
				 int argument_32_, int argument_33_,
				 boolean argument_34_, Class_aa argument_35_,
				 int argument_36_, int argument_37_);
}
