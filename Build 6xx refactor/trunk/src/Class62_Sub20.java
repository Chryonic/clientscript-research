/* Class62_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub20 extends Class62
{
    static Class314 aClass314_4430;
    static Class314 aClass314_4431;
    
    final int method1342(int argument_0_, byte argument_1_) {
	int anLocalInt = -49 / ((-53 - argument_1_) / 50);
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -126))
	    return 3;
	if (argument_0_ == 0
	    || ((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
		   .aClass62_Sub3_4318.method1365(105) == 1)
	    return 1;
	return 2;
    }
    
    static final int method1434(int argument, int argument_2_, int argument_3_,
				boolean argument_4_) {
	Node_Sub5 class59_sub5
	    = Class365.method3969((byte) 95, argument_2_, argument_4_);
	if (class59_sub5 == null)
	    return 0;
	if (argument == -1)
	    return 0;
	int anLocalInt = 0;
	for (int anLocalInt_5_ = 0;
	     (anLocalInt_5_
	      < ((Node_Sub5) class59_sub5).anIntArray3895.length);
	     anLocalInt_5_++) {
	    if (((Node_Sub5) class59_sub5).anIntArray3897[anLocalInt_5_]
		== argument)
		anLocalInt += (((Node_Sub5) class59_sub5).anIntArray3895
			       [anLocalInt_5_]);
	}
	return anLocalInt;
    }
    
    Class62_Sub20(int argument_6_, Node_Sub50 argument_7_) {
	super(argument_6_, argument_7_);
    }
    
    final int method1344(byte argument_8_) {
	if (argument_8_ != 4)
	    method1344((byte) 21);
	return 1;
    }
    
    final int method1435(int argument_9_) {
	return ((Class62) this).anInt441;
    }
    
    static final void method1436(byte argument, int argument_10_) {
	Node_Sub31_Sub21.anInt5930 = argument_10_;
	Statics.anInt2726 = -1;
	Class55.anInt409 = -1;
	Class279.method3417((byte) 116);
    }
    
    final void method1343(int argument_11_, byte argument_12_) {
	if (argument_12_ != -107)
	    aClass314_4430 = null;
	((Class62) this).anInt441 = argument_11_;
    }
    
    Class62_Sub20(Node_Sub50 argument_13_) {
	super(argument_13_);
    }
    
    final void method1346(boolean argument_14_) {
	if (!argument_14_) {
	    if (((Class62) this).aClass59_Sub50_440.method1164((byte) -107))
		((Class62) this).anInt441 = 0;
	    if (((Class62) this).anInt441 < 0 && ((Class62) this).anInt441 > 2)
		((Class62) this).anInt441 = method1344((byte) 4);
	}
    }
    
    final boolean method1437(int argument_15_) {
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -105))
	    return false;
	return true;
    }
    
    static final boolean method1438(int argument) {
	if (Node_Sub47_Sub7.aClass59_Sub51_Sub9_6188 == null)
	    return false;
	if ((((MenuAction) Node_Sub47_Sub7.aClass59_Sub51_Sub9_6188)
	     .action)
	    >= 2000)
	    ((MenuAction) Node_Sub47_Sub7.aClass59_Sub51_Sub9_6188)
		.action
		-= 2000;
	if ((((MenuAction) Node_Sub47_Sub7.aClass59_Sub51_Sub9_6188)
	     .action)
	    == 1001)
	    return true;
	return false;
    }
    
    public static void method1439(byte argument) {
	aClass314_4430 = null;
	aClass314_4431 = null;
    }
    
    static {
	aClass314_4431 = aClass314_4430 = new Class314(false);
    }
}
