/* Class360 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class360
{
    static boolean aBoolean3045 = true;
    static Class166 aClass166_3046 = new Class166(44, -1);
    static Class207 aClass207_3047 = new Class207(64, 11);
    static Class166 aClass166_3048 = new Class166(127, 6);
    static Node_Sub1 aClass59_Sub1_3049 = null;
    
    static final boolean method3950(boolean argument, int argument_0_) {
	if (argument_0_ != 0 && argument_0_ != 1 && argument_0_ != 2)
	    return false;
	return true;
    }
    
    static final void method3951
	(int argument, int argument_1_, int argument_2_, int argument_3_,
	 int argument_4_, byte[][][] argument_5_, int argument_6_,
	 int argument_7_, int argument_8_, GraphicsToolkit argument_9_,
	 int argument_10_, int argument_11_, int argument_12_) {
	if (argument_4_ != 0 && argument != 0) {
	    if (argument_8_ == (argument_4_ ^ 0xffffffff)) {
		argument_6_ = argument_6_ + 1 & 0x3;
		argument_4_ = 1;
	    }
	    if (argument_4_ == 10) {
		argument_6_ = argument_6_ + 3 & 0x3;
		argument_4_ = 1;
	    }
	    if (argument_4_ == 11) {
		argument_6_ = argument_6_ + 3 & 0x3;
		argument_4_ = 8;
	    }
	    argument_9_.drawImage(argument_12_, argument_1_, argument_11_, argument_7_, argument_2_, argument_3_, argument_5_[argument_4_ - 1][argument_6_], argument, argument_10_);
	}
    }
    
    static final void method3952(boolean argument) {
	for (Node_Sub23 class59_sub23 = (Node_Sub23) Node_Sub37_Sub1
							       .aJagexHashMap_6114
							       .first(0);
	     class59_sub23 != null;
	     class59_sub23 = (Node_Sub23) Node_Sub37_Sub1
						 .aJagexHashMap_6114
						 .next()) {
	    if (!((Node_Sub23) class59_sub23).aClass109_Sub1_4050
		     .method1967(true)) {
		((Node_Sub23) class59_sub23).aClass109_Sub1_4050
		    .method1982((byte) -118);
		try {
		    ((Node_Sub23) class59_sub23).aClass109_Sub1_4050
			.method1965(-2);
		} catch (Exception exception) {
		    ErrorReporting.reportError("TV: " + ((Node_Sub23) class59_sub23).anInt4053, exception);
		    Class389.method4135(118, (((Node_Sub23) class59_sub23)
					      .anInt4053));
		}
		if (!((Node_Sub23) class59_sub23).aBoolean4054
		    && !((Node_Sub23) class59_sub23).aBoolean4055) {
		    Node_Sub32_Sub4 class59_sub32_sub4
			= ((Node_Sub23) class59_sub23)
			      .aClass109_Sub1_4050.method1973(-2);
		    if (class59_sub32_sub4 != null) {
			Node_Sub9_Sub5 class59_sub9_sub5
			    = class59_sub32_sub4.method1030((byte) 72);
			if (class59_sub9_sub5 != null) {
			    class59_sub9_sub5.method672((((Node_Sub23)
							  class59_sub23)
							 .anInt4058),
							(byte) -114);
			    Class353_Sub2.aClass59_Sub9_Sub3_5483
				.method629(class59_sub9_sub5);
			    ((Node_Sub23) class59_sub23).aBoolean4054
				= true;
			}
		    }
		}
	    } else
		Class389.method4135(121,
				    ((Node_Sub23) class59_sub23).anInt4053);
	}
    }
    
    public static void method3953(boolean argument) {
	aClass207_3047 = null;
	aClass166_3048 = null;
	aClass166_3046 = null;
	aClass59_Sub1_3049 = null;
    }
}
