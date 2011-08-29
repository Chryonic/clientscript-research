/* Class59_Sub31_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub13 extends Node_Sub31
{
    static int anInt5896 = 100;
    static Class20 aClass20_5897;
    static float[] aFloatArray5898 = new float[4];
    static ClanSettings aClanSettings_5899;
    static Node_Sub35[] aClass59_Sub35Array5900 = new Node_Sub35[1024];
    
    final int[] method867(byte argument_0_, int argument_1_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_1_,
							      -13476);
	if (argument_0_ < 21)
	    aClass59_Sub35Array5900 = null;
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int[][] anLocalInts_2_ = this.method869(0, 1, argument_1_);
	    int[] anLocalInts_3_ = anLocalInts_2_[0];
	    int[] anLocalInts_4_ = anLocalInts_2_[1];
	    int[] anLocalInts_5_ = anLocalInts_2_[2];
	    for (int anLocalInt = 0; anLocalInt < Statics.anInt294;
		 anLocalInt++)
		anLocalInts[anLocalInt]
		    = (anLocalInts_5_[anLocalInt] + anLocalInts_4_[anLocalInt]
		       + anLocalInts_3_[anLocalInt]) / 3;
	}
	return anLocalInts;
    }
    
    public Node_Sub31_Sub13() {
	super(1, true);
    }
    
    public static void method914(byte argument) {
	aClanSettings_5899 = null;
	aClass20_5897 = null;
	aClass59_Sub35Array5900 = null;
	aFloatArray5898 = null;
    }
}
