/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class178
{
    static int anInt1311;
    static Class368 aClass368_1312;
    static float[] aFloatArray1313 = { 0.0F, -1.0F, 0.0F, 0.0F };
    static Class368 aClass368_1314;
    static Class166 aClass166_1315 = new Class166(61, -1);
    static boolean aBoolean1316 = false;
    
    public static void method2795(int argument) {
	aClass166_1315 = null;
	aClass368_1314 = null;
	client.idx255File = null;
	aClass368_1312 = null;
	aFloatArray1313 = null;
    }
    
    static final String method2796(int argument, String argument_0_) {
	String string = null;
	int anLocalInt = argument_0_.indexOf("--> ");
	if (argument <= anLocalInt) {
	    string = argument_0_.substring(0, anLocalInt + 4);
	    argument_0_ = argument_0_.substring(anLocalInt + 4);
	}
	if (argument_0_.startsWith("directlogin ")) {
	    int anLocalInt_1_
		= argument_0_.indexOf(" ", "directlogin ".length());
	    if (anLocalInt_1_ >= 0) {
		int anLocalInt_2_ = argument_0_.length();
		argument_0_ = argument_0_.substring(0, anLocalInt_1_) + " ";
		for (int anLocalInt_3_ = anLocalInt_1_ + 1;
		     anLocalInt_2_ > anLocalInt_3_; anLocalInt_3_++)
		    argument_0_ += "*";
	    }
	}
	if (string != null)
	    return string + argument_0_;
	return argument_0_;
    }
    
    static final void method2797(int argument, int argument_4_,
				 int argument_5_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(14, 13175, (long) argument);
	class59_sub51_sub3.method1182(-107);
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231 = argument_5_;
    }
    
    static final boolean method2798(byte argument, int argument_6_,
				    int argument_7_) {
	if ((argument_6_ & 0x84080) == 0)
	    return false;
	return true;
    }
}
