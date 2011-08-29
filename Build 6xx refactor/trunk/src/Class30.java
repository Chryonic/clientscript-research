/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class30
{
    static Class166 aClass166_206 = new Class166(124, 3);
    
    static final Class259[] method359(byte argument) {
	if (Statics.aClass259Array5496 == null) {
	    Class259[] class259s
		= Statics.method1191(-122, Applet_Sub1.baseSignlink);
	    Class259[] class259s_0_ = new Class259[class259s.length];
	    int anLocalInt = 0;
	    int anLocalInt_1_ = ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				    .aClass62_Sub23_4311.method1449(77);
	while_45_:
	    for (int anLocalInt_2_ = 0; anLocalInt_2_ < class259s.length;
		 anLocalInt_2_++) {
		Class259 class259 = class259s[anLocalInt_2_];
		if ((((Class259) class259).anInt2017 <= 0
		     || ((Class259) class259).anInt2017 >= 24)
		    && ((Class259) class259).anInt2019 >= 800
		    && ((Class259) class259).anInt2018 >= 600
		    && (anLocalInt_1_ != 2
			|| (((Class259) class259).anInt2019 <= 800
			    && ((Class259) class259).anInt2018 <= 600))
		    && (anLocalInt_1_ != 1
			|| (((Class259) class259).anInt2019 <= 1024
			    && ((Class259) class259).anInt2018 <= 768))) {
		    for (int anLocalInt_3_ = 0; anLocalInt_3_ < anLocalInt;
			 anLocalInt_3_++) {
			Class259 class259_4_ = class259s_0_[anLocalInt_3_];
			if ((((Class259) class259).anInt2019
			     == ((Class259) class259_4_).anInt2019)
			    && (((Class259) class259).anInt2018
				== ((Class259) class259_4_).anInt2018)) {
			    if (((Class259) class259).anInt2017
				> ((Class259) class259_4_).anInt2017)
				class259s_0_[anLocalInt_3_] = class259;
			    continue while_45_;
			}
		    }
		    class259s_0_[anLocalInt] = class259;
		    anLocalInt++;
		}
	    }
	    Statics.aClass259Array5496 = new Class259[anLocalInt];
	    JagStrings.memcpy(class259s_0_, 0, Statics.aClass259Array5496, 0, anLocalInt);
	    int[] anLocalInts
		= new int[Statics.aClass259Array5496.length];
	    for (int anLocalInt_5_ = 0;
		 anLocalInt_5_ < Statics.aClass259Array5496.length;
		 anLocalInt_5_++) {
		Class259 class259
		    = Statics.aClass259Array5496[anLocalInt_5_];
		anLocalInts[anLocalInt_5_]
		    = (((Class259) class259).anInt2019
		       * ((Class259) class259).anInt2018);
	    }
	    Class251.method3242((byte) 66, anLocalInts,
				Statics.aClass259Array5496);
	}
	return Statics.aClass259Array5496;
    }
    
    public static void method360(int argument) {
	aClass166_206 = null;
    }
}
