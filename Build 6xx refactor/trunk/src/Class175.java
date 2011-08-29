/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class175
{
    private static byte[] aByteArray1294
	= { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    private Packet aClass59_Sub28_1295;
    private int[] anIntArray1296;
    private int[] anIntArray1297;
    private long aLong1298;
    private int anInt1299;
    int[] anIntArray1300;
    private int[] anIntArray1301;
    int anInt1302;
    
    private final int method2771(int argument_0_, int argument_1_) {
	if (argument_1_ == 255) {
	    int anLocalInt = aClass59_Sub28_1295.g1();
	    int anLocalInt_2_ = aClass59_Sub28_1295.gMultiSomething();
	    if (anLocalInt == 47) {
		((Packet) aClass59_Sub28_1295).pos
		    += anLocalInt_2_;
		return 1;
	    }
	    if (anLocalInt == 81) {
		int anLocalInt_3_ = aClass59_Sub28_1295.g3_dupl();
		anLocalInt_2_ -= 3;
		int anLocalInt_4_
		    = ((Class175) this).anIntArray1300[argument_0_];
		aLong1298 += (long) anLocalInt_4_ * (long) (anInt1299
							    - anLocalInt_3_);
		anInt1299 = anLocalInt_3_;
		((Packet) aClass59_Sub28_1295).pos
		    += anLocalInt_2_;
		return 2;
	    }
	    ((Packet) aClass59_Sub28_1295).pos += anLocalInt_2_;
	    return 3;
	}
	byte anLocalInt = aByteArray1294[argument_1_ - 128];
	int anLocalInt_5_ = argument_1_;
	if (anLocalInt >= 1)
	    anLocalInt_5_ |= aClass59_Sub28_1295.g1() << 8;
	if (anLocalInt >= 2)
	    anLocalInt_5_ |= aClass59_Sub28_1295.g1() << 16;
	return anLocalInt_5_;
    }
    
    final int method2772() {
	int anLocalInt = anIntArray1301.length;
	int anLocalInt_6_ = -1;
	int anLocalInt_7_ = 2147483647;
	for (int anLocalInt_8_ = 0; anLocalInt_8_ < anLocalInt;
	     anLocalInt_8_++) {
	    if (anIntArray1301[anLocalInt_8_] >= 0
		&& (((Class175) this).anIntArray1300[anLocalInt_8_]
		    < anLocalInt_7_)) {
		anLocalInt_6_ = anLocalInt_8_;
		anLocalInt_7_
		    = ((Class175) this).anIntArray1300[anLocalInt_8_];
	    }
	}
	return anLocalInt_6_;
    }
    
    final int method2773() {
	return anIntArray1301.length;
    }
    
    private final int method2774(int argument_9_) {
	int anLocalInt = (((Packet) aClass59_Sub28_1295).data
			  [((Packet) aClass59_Sub28_1295).pos]);
	if (anLocalInt < 0) {
	    anLocalInt &= 0xff;
	    anIntArray1297[argument_9_] = anLocalInt;
	    ((Packet) aClass59_Sub28_1295).pos++;
	} else
	    anLocalInt = anIntArray1297[argument_9_];
	if (anLocalInt == 240 || anLocalInt == 247) {
	    int anLocalInt_10_ = aClass59_Sub28_1295.gMultiSomething();
	    if (anLocalInt == 247 && anLocalInt_10_ > 0) {
		int anLocalInt_11_
		    = ((((Packet) aClass59_Sub28_1295).data
			[((Packet) aClass59_Sub28_1295).pos])
		       & 0xff);
		if (anLocalInt_11_ >= 241 && anLocalInt_11_ <= 243
		    || anLocalInt_11_ == 246 || anLocalInt_11_ == 248
		    || anLocalInt_11_ >= 250 && anLocalInt_11_ <= 252
		    || anLocalInt_11_ == 254) {
		    ((Packet) aClass59_Sub28_1295).pos++;
		    anIntArray1297[argument_9_] = anLocalInt_11_;
		    return method2771(argument_9_, anLocalInt_11_);
		}
	    }
	    ((Packet) aClass59_Sub28_1295).pos += anLocalInt_10_;
	    return 0;
	}
	return method2771(argument_9_, anLocalInt);
    }
    
    final int method2775(int argument_12_) {
	int anLocalInt = method2774(argument_12_);
	return anLocalInt;
    }
    
    final void method2776(int argument_13_) {
	anIntArray1301[argument_13_]
	    = ((Packet) aClass59_Sub28_1295).pos;
    }
    
    final boolean method2777() {
	int anLocalInt = anIntArray1301.length;
	for (int anLocalInt_14_ = 0; anLocalInt_14_ < anLocalInt;
	     anLocalInt_14_++) {
	    if (anIntArray1301[anLocalInt_14_] >= 0)
		return false;
	}
	return true;
    }
    
    final boolean method2778() {
	if (((Packet) aClass59_Sub28_1295).data == null)
	    return false;
	return true;
    }
    
    final void method2779(int argument_15_) {
	((Packet) aClass59_Sub28_1295).pos
	    = anIntArray1301[argument_15_];
    }
    
    final void method2780() {
	((Packet) aClass59_Sub28_1295).pos = -1;
    }
    
    final void method2781(int argument_16_) {
	int anLocalInt = aClass59_Sub28_1295.gMultiSomething();
	((Class175) this).anIntArray1300[argument_16_] += anLocalInt;
    }
    
    final void method2782(byte[] argument_17_) {
	((Packet) aClass59_Sub28_1295).data = argument_17_;
	((Packet) aClass59_Sub28_1295).pos = 10;
	int anLocalInt = aClass59_Sub28_1295.g2();
	((Class175) this).anInt1302 = aClass59_Sub28_1295.g2();
	anInt1299 = 500000;
	anIntArray1296 = new int[anLocalInt];
	int anLocalInt_18_ = 0;
	while (anLocalInt_18_ < anLocalInt) {
	    int anLocalInt_19_ = aClass59_Sub28_1295.g4();
	    int anLocalInt_20_ = aClass59_Sub28_1295.g4();
	    if (anLocalInt_19_ == 1297379947) {
		anIntArray1296[anLocalInt_18_]
		    = ((Packet) aClass59_Sub28_1295).pos;
		anLocalInt_18_++;
	    }
	    ((Packet) aClass59_Sub28_1295).pos += anLocalInt_20_;
	}
	aLong1298 = 0L;
	anIntArray1301 = new int[anLocalInt];
	for (int anLocalInt_21_ = 0; anLocalInt_21_ < anLocalInt;
	     anLocalInt_21_++)
	    anIntArray1301[anLocalInt_21_] = anIntArray1296[anLocalInt_21_];
	((Class175) this).anIntArray1300 = new int[anLocalInt];
	anIntArray1297 = new int[anLocalInt];
    }
    
    final void method2783() {
	((Packet) aClass59_Sub28_1295).data = null;
	anIntArray1296 = null;
	anIntArray1301 = null;
	((Class175) this).anIntArray1300 = null;
	anIntArray1297 = null;
    }
    
    public static void method2784() {
	aByteArray1294 = null;
    }
    
    final long method2785(int argument_22_) {
	return aLong1298 + (long) argument_22_ * (long) anInt1299;
    }
    
    final void method2786(long argument_23_) {
	aLong1298 = argument_23_;
	int anLocalInt = anIntArray1301.length;
	for (int anLocalInt_24_ = 0; anLocalInt_24_ < anLocalInt;
	     anLocalInt_24_++) {
	    ((Class175) this).anIntArray1300[anLocalInt_24_] = 0;
	    anIntArray1297[anLocalInt_24_] = 0;
	    ((Packet) aClass59_Sub28_1295).pos
		= anIntArray1296[anLocalInt_24_];
	    method2781(anLocalInt_24_);
	    anIntArray1301[anLocalInt_24_]
		= ((Packet) aClass59_Sub28_1295).pos;
	}
    }
    
    public Class175() {
	aClass59_Sub28_1295 = new Packet(null);
    }
    
    Class175(byte[] argument_25_) {
	aClass59_Sub28_1295 = new Packet(null);
	method2782(argument_25_);
    }
}
