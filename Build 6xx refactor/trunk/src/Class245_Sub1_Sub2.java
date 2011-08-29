/* Class245_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class245_Sub1_Sub2 extends Class245_Sub1
{
    private byte[] aByteArray6518;
    static Class110 aClass110_6519;
    
    final void method3177(int argument_0_, byte argument_1_,
			  byte argument_2_) {
	int anLocalInt = argument_0_ * 2;
	argument_2_ = (byte) ((argument_2_ >> 1 & 0x7f) + 127);
	int anLocalInt_3_ = -80 % ((-75 - argument_1_) / 40);
	aByteArray6518[anLocalInt++] = argument_2_;
	aByteArray6518[anLocalInt] = argument_2_;
    }
    
    public static void method3184(int argument) {
	aClass110_6519 = null;
    }
    
    public Class245_Sub1_Sub2() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
    
    static final void method3185(int argument, boolean argument_4_,
				 String argument_5_) {
	Statics.method2583(-1, 1, argument_5_, argument, argument_4_);
    }
    
    final byte[] method3186(int argument_6_, int argument_7_, int argument_8_,
			    int argument_9_) {
	aByteArray6518
	    = new byte[argument_8_ * (argument_7_ * argument_9_ * 2)];
	this.method3174((byte) 105, argument_9_, argument_7_, argument_8_);
	return aByteArray6518;
    }
}
