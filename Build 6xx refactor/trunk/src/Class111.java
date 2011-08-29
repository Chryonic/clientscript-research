/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class111
{
    static ClanVarbitSource aClanVarbitSource_916;
    static Class88 aClass88_917;
    
    public Class111() {
	/* empty */
    }
    
    static final void method1989(Signlink argument, int argument_0_,
				 Js5Store argument_1_) {
	Class289.aSignlink_2307 = argument;
	Class_s_Sub2.aString5366 = "";
	Class371.aJs5Store_3130 = argument_1_;
	if (Class62_Sub5.osName.startsWith("win"))
	    Class_s_Sub2.aString5366 += "windows/";
	else if (!Class62_Sub5.osName.startsWith("linux")) {
	    if (Class62_Sub5.osName.startsWith("mac"))
		Class_s_Sub2.aString5366 += "macos/";
	} else
	    Class_s_Sub2.aString5366 += "linux/";
	if (!((Signlink) Class289.aSignlink_2307).useWin32) {
	    if (!Class62_Sub5.osArch.startsWith("amd64")
		&& !Class62_Sub5.osArch.startsWith("x86_64")) {
		if (Class62_Sub5.osArch.startsWith("i386")
		    || Class62_Sub5.osArch.startsWith("i486")
		    || Class62_Sub5.osArch.startsWith("i586")
		    || Class62_Sub5.osArch.startsWith("x86"))
		    Class_s_Sub2.aString5366 += "x86/";
		else if (Class62_Sub5.osArch.startsWith("ppc"))
		    Class_s_Sub2.aString5366 += "ppc/";
		else
		    Class_s_Sub2.aString5366 += "universal/";
	    } else
		Class_s_Sub2.aString5366 += "x86_64/";
	} else
	    Class_s_Sub2.aString5366 += "msjava/";
    }
    
    static final void method1990(int argument, int argument_2_,
				 int argument_3_, int argument_4_,
				 int argument_5_, boolean argument_6_) {
	if (argument_2_ < 1)
	    argument_2_ = 1;
	if (argument_3_ != 6680)
	    aClass88_917 = null;
	if (argument < 1)
	    argument = 1;
	int anLocalInt = argument_2_ - 334;
	if (anLocalInt >= 0) {
	    if (anLocalInt > 100)
		anLocalInt = 100;
	} else
	    anLocalInt = 0;
	int anLocalInt_7_ = (((ClanSettingsDelta.aShort1547 - Class350_Sub1.aShort5435)
			      * anLocalInt / 100)
			     + Class350_Sub1.aShort5435);
	if (anLocalInt_7_ < Node_Sub32_Sub4.aShort6094)
	    anLocalInt_7_ = Node_Sub32_Sub4.aShort6094;
	else if (anLocalInt_7_ > Class276.aShort2216)
	    anLocalInt_7_ = Class276.aShort2216;
	int anLocalInt_8_
	    = anLocalInt_7_ * argument_2_ * 512 / (argument * 334);
	if (Class308.aShort2586 <= anLocalInt_8_) {
	    if (Class62_Sub18.aShort4424 < anLocalInt_8_) {
		anLocalInt_8_ = Class62_Sub18.aShort4424;
		anLocalInt_7_
		    = anLocalInt_8_ * argument * 334 / (argument_2_ * 512);
		if (anLocalInt_7_ < Node_Sub32_Sub4.aShort6094) {
		    anLocalInt_7_ = Node_Sub32_Sub4.aShort6094;
		    int anLocalInt_9_ = (anLocalInt_8_ * (argument * 334)
					 / (anLocalInt_7_ * 512));
		    int anLocalInt_10_ = (-anLocalInt_9_ + argument_2_) / 2;
		    if (argument_6_) {
			Class389.aGraphicsToolkit3281.clearClip();
			Class389.aGraphicsToolkit3281.method2020
			    (argument_3_ ^ ~0x1a62, argument, argument_5_,
			     anLocalInt_10_, argument_4_, -16777216);
			Class389.aGraphicsToolkit3281.method2020
			    (argument_3_ ^ ~0x1a68, argument,
			     -anLocalInt_10_ + argument_5_ + argument_2_,
			     anLocalInt_10_, argument_4_, -16777216);
		    }
		    argument_5_ += anLocalInt_10_;
		    argument_2_ -= anLocalInt_10_ * 2;
		}
	    }
	} else {
	    anLocalInt_8_ = Class308.aShort2586;
	    anLocalInt_7_
		= anLocalInt_8_ * 334 * argument / (argument_2_ * 512);
	    if (Class276.aShort2216 < anLocalInt_7_) {
		anLocalInt_7_ = Class276.aShort2216;
		int anLocalInt_11_ = (anLocalInt_7_ * argument_2_ * 512
				      / (anLocalInt_8_ * 334));
		int anLocalInt_12_ = (-anLocalInt_11_ + argument) / 2;
		if (argument_6_) {
		    Class389.aGraphicsToolkit3281.clearClip();
		    Class389.aGraphicsToolkit3281.method2020(113, anLocalInt_12_,
						      argument_5_, argument_2_,
						      argument_4_, -16777216);
		    Class389.aGraphicsToolkit3281.method2020(-113, anLocalInt_12_,
						      argument_5_, argument_2_,
						      (argument + argument_4_
						       - anLocalInt_12_),
						      -16777216);
		}
		argument_4_ += anLocalInt_12_;
		argument -= anLocalInt_12_ * 2;
	    }
	}
	Class350_Sub2.anInt5446 = argument_4_;
	Class287.anInt2297 = (short) argument_2_;
	Class62_Sub13.anInt4406 = anLocalInt_7_ * argument_2_ / 334;
	Class96.anInt748 = argument_5_;
	Class127.anInt1038 = (short) argument;
    }
    
    public static void method1991(int argument) {
	Network.stream = null;
	aClanVarbitSource_916 = null;
	aClass88_917 = null;
    }
    
    abstract void method1992
	(float argument_13_, int argument_14_, float argument_15_,
	 int argument_16_, int argument_17_, float argument_18_,
	 int argument_19_, int argument_20_, float argument_21_,
	 float[] argument_22_, int argument_23_);
}
