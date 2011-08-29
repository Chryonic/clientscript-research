/* Class245_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class245_Sub2_Sub2 extends Class245_Sub2
{
    static Class212 aClass212_6523 = new Class212(14, 0);
    static int anInt6524;
    private byte[] aByteArray6525;
    static Class212 aClass212_6526 = new Class212(15, 4);
    static Class212 aClass212_6527 = new Class212(16, -2);
    static Class212 aClass212_6528 = new Class212(17, 0);
    static Class212 aClass212_6529 = new Class212(19, -2);
    static Class212 aClass212_6530 = new Class212(22, -2);
    static Class212 aClass212_6531 = new Class212(23, 4);
    static Class212 aClass212_6532 = new Class212(24, -1);
    static Class212 aClass212_6533 = new Class212(26, 0);
    static Class212 aClass212_6534 = new Class212(27, 0);
    static Class212 aClass212_6535 = new Class212(28, -2);
    static Class212 aClass212_6536 = new Class212(29, -2);
    static Class212 aClass212_6537 = new Class212(30, -2);
    private static Class212[] aClass212Array6538 = new Class212[32];

    final void method3189(boolean argument_0_, int argument_1_,
			  byte argument_2_) {
	int anLocalInt = argument_1_ * 2;
	if (argument_0_ == true) {
	    int anLocalInt_3_ = argument_2_ & 0xff;
	    aByteArray6525[anLocalInt++] = (byte) -1;
	    aByteArray6525[anLocalInt] = (byte) (anLocalInt_3_ * 3 >> 5);
	}
    }
    
    final byte[] method3196(int argument_4_, int argument_5_, int argument_6_,
			    int argument_7_) {
	aByteArray6525
	    = new byte[argument_7_ * (argument_6_ * argument_4_) * 2];
	this.method3174((byte) -123, argument_4_, argument_7_, argument_6_);
	return aByteArray6525;
    }
    
    static final void method3197(byte argument, Js5Store argument_8_) {
	Class62_Sub8.aJs5Store_4393 = argument_8_;
    }
    
    public Class245_Sub2_Sub2() {
	super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
    
    public static void method3198(int argument) {
	aClass212_6535 = null;
	aClass212_6523 = null;
	aClass212_6536 = null;
	aClass212_6529 = null;
	aClass212_6533 = null;
	aClass212_6537 = null;
	aClass212_6526 = null;
	aClass212_6530 = null;
	aClass212_6532 = null;
	aClass212_6531 = null;
	aClass212_6528 = null;
	aClass212_6534 = null;
	aClass212Array6538 = null;
	aClass212_6527 = null;
    }
    
    static {
	Class212[] class212s = DoublyLinkedNodeP2_Sub2_Sub1_Sub1.method1787(-122);
	for (int anLocalInt = 0; class212s.length > anLocalInt; anLocalInt++)
	    aClass212Array6538[((Class212) class212s[anLocalInt]).anInt1505]
		= class212s[anLocalInt];
    }
}
