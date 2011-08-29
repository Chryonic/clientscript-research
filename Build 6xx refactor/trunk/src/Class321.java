/* Class321 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class321
{
    static Class207 aClass207_2636;
    static int[] anIntArray2637 = new int[5];
    static float[] aFloatArray2638 = new float[16];
    
    static final void method3649(int argument, int argument_0_,
				 int argument_1_, int argument_2_,
				 int argument_3_, int argument_4_,
				 int argument_5_, boolean argument_6_) {
	if ((!argument_6_
	     ? ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		   .aClass62_Sub22_4298.method1446(115)
	     : ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		   .aClass62_Sub22_4333.method1446(68)) != 0
	    && argument_0_ != 0 && Class105.anInt861 < 50 && argument_3_ != -1)
	    Class131.aClass169Array1059[Class105.anInt861++]
		= new Class169(argument_6_ ? (byte) 3 : (byte) 2, argument_3_,
			       argument_0_, argument_2_, argument, argument_4_,
			       argument_5_, null);
    }
    
    public static void method3650(boolean argument) {
	aClass207_2636 = null;
	anIntArray2637 = null;
	aFloatArray2638 = null;
    }
    
    static {
	aClass207_2636 = new Class207(48, 2);
    }
}
