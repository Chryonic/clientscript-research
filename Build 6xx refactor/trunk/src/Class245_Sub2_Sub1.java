/* Class245_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class245_Sub2_Sub1 extends Class245_Sub2
{
    static Class24 aClass24_6520;
    static long aLong6521 = 20000000L;
    private byte[] aByteArray6522;
    
    public static void method3193(int argument) {
	aClass24_6520 = null;
    }
    
    public Class245_Sub2_Sub1() {
	super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
    
    static final void method3194(int argument) {
	if (Class194.aFileOutputStream1416 != null) {
	    try {
		Class194.aFileOutputStream1416.close();
	    } catch (java.io.IOException ioexception) {
		/* empty */
	    }
	}
	Class194.aFileOutputStream1416 = null;
    }
    
    final byte[] method3195(int argument_0_, int argument_1_, int argument_2_,
			    int argument_3_) {
	aByteArray6522
	    = new byte[argument_0_ * (argument_3_ * argument_2_) * 2];
	this.method3174((byte) 116, argument_0_, argument_3_, argument_2_);
	return aByteArray6522;
    }
    
    final void method3189(boolean argument_4_, int argument_5_,
			  byte argument_6_) {
	if (argument_4_ != true)
	    method3195(-7, 81, 89, -80);
	int anLocalInt = argument_5_ * 2;
	int anLocalInt_7_ = argument_6_ & 0xff;
	aByteArray6522[anLocalInt++] = (byte) (anLocalInt_7_ * 3 >> 5);
	aByteArray6522[anLocalInt] = (byte) (anLocalInt_7_ * 3 >> 5);
    }
}
