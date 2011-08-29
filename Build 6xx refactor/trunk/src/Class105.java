/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class105
{
    static int anInt861 = 0;
    static Class207 aClass207_862 = new Class207(55, 0);
    static int[][] anIntArrayArray863 = new int[128][128];
    
    static final void method1948(int[] argument, int[] argument_0_,
				 byte argument_1_, int argument_2_,
				 int argument_3_) {
	if (argument_2_ > argument_3_) {
	    int anLocalInt = (argument_3_ + argument_2_) / 2;
	    int anLocalInt_4_ = argument_3_;
	    int anLocalInt_5_ = argument_0_[anLocalInt];
	    argument_0_[anLocalInt] = argument_0_[argument_2_];
	    argument_0_[argument_2_] = anLocalInt_5_;
	    int anLocalInt_6_ = argument[anLocalInt];
	    argument[anLocalInt] = argument[argument_2_];
	    argument[argument_2_] = anLocalInt_6_;
	    int anLocalInt_7_ = anLocalInt_5_ == 2147483647 ? 0 : 1;
	    for (int anLocalInt_8_ = argument_3_; anLocalInt_8_ < argument_2_;
		 anLocalInt_8_++) {
		if (anLocalInt_5_ + (anLocalInt_8_ & anLocalInt_7_)
		    > argument_0_[anLocalInt_8_]) {
		    int anLocalInt_9_ = argument_0_[anLocalInt_8_];
		    argument_0_[anLocalInt_8_] = argument_0_[anLocalInt_4_];
		    argument_0_[anLocalInt_4_] = anLocalInt_9_;
		    int anLocalInt_10_ = argument[anLocalInt_8_];
		    argument[anLocalInt_8_] = argument[anLocalInt_4_];
		    argument[anLocalInt_4_++] = anLocalInt_10_;
		}
	    }
	    argument_0_[argument_2_] = argument_0_[anLocalInt_4_];
	    argument_0_[anLocalInt_4_] = anLocalInt_5_;
	    argument[argument_2_] = argument[anLocalInt_4_];
	    argument[anLocalInt_4_] = anLocalInt_6_;
	    method1948(argument, argument_0_, (byte) 1, anLocalInt_4_ - 1,
		       argument_3_);
	    method1948(argument, argument_0_, (byte) 1, argument_2_,
		       anLocalInt_4_ + 1);
	}
    }
    
    public static void method1949(int argument) {
	anIntArrayArray863 = null;
	aClass207_862 = null;
    }
    
    static final void method1950(byte argument, int argument_11_) {
	Class60.anIntArray435 = new int[argument_11_];
	DxSkybox.anIntArray4477 = new int[argument_11_];
	DiskBackedCache.anIntArray2706 = new int[argument_11_];
	Class227.anIntArray1642 = new int[argument_11_];
	Statics.anIntArray1179 = new int[argument_11_];
    }
}
