/* Class59_Sub31_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub25 extends Node_Sub31
{
    static long aLong5952;
    static Class244 aClass244_5953;
    
    final int[] method867(byte argument_0_, int argument_1_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_1_,
							      -13476);
	if (argument_0_ <= 21)
	    aClass244_5953 = null;
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int anLocalInt = Class82.anIntArray585[argument_1_];
	    for (int anLocalInt_2_ = 0; anLocalInt_2_ < Statics.anInt294;
		 anLocalInt_2_++)
		anLocalInts[anLocalInt_2_]
		    = method956(anLocalInt,
				Class130.anIntArray1053[anLocalInt_2_],
				262144) % 4096;
	}
	return anLocalInts;
    }
    
    private final int method956(int argument_3_, int argument_4_,
				int argument_5_) {
	int anLocalInt = argument_3_ * 57 + argument_4_;
	anLocalInt = anLocalInt << 1 ^ anLocalInt;
	if (argument_5_ != 262144)
	    return 76;
	return (-((((anLocalInt * (anLocalInt * 15731) + 789221) * anLocalInt
		    + 1376312589)
		   & 0x7fffffff)
		  / 262144)
		+ 4096);
    }
    
    public Node_Sub31_Sub25() {
	super(0, true);
    }
    
    public static void method957(int argument) {
	aClass244_5953 = null;
    }
}
