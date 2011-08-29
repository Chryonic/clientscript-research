/* Class256_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class256_Sub2 extends Class256 implements Interface7_Impl2
{
    private int anInt5622;
    static Class166 aClass166_5623;
    private int anInt5624;
    static String[][] aStringArrayArray5625
	= { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
	      "Oct", "Nov", "Dec" },
	    { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug",
	      "Sep", "Okt", "Nov", "Dez" },
	    { "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil",
	      "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" },
	    { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set",
	      "out", "nov", "dez" },
	    { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep",
	      "okt", "nov", "dec" } };
    static int[] anIntArray5626;
    
    public final void method23
	(int argument_0_, int argument_1_, int argument_2_, int argument_3_,
	 int[] argument_4_, int argument_5_, int argument_6_) {
	int[] anLocalInts = new int[anInt5624 * anInt5622];
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	OpenGL.glGetTexImagei(((Class256) this).anInt3533, 0, 32993, 5121,
			      anLocalInts, 0);
	if (argument_6_ != 3839)
	    method16(-64);
	for (int anLocalInt = 0; anLocalInt < argument_1_; anLocalInt++)
	    JagStrings.memcpy(anLocalInts, anInt5624 * (argument_3_ - (-argument_1_ + 1) - anLocalInt), argument_4_, argument_5_ + anLocalInt * argument_2_, argument_2_);
    }
    
    public final int method17(byte argument_7_) {
	if (argument_7_ != 84)
	    method21(null, -58, -3, 14, -61, null, -86, 105, -53);
	return anInt5622;
    }
    
    public final boolean method16(int argument_8_) {
	if (argument_8_ != 26244)
	    anIntArray5626 = null;
	return true;
    }
    
    public final void method21
	(Class320 argument_9_, int argument_10_, int argument_11_,
	 int argument_12_, int argument_13_, byte[] argument_14_,
	 int argument_15_, int argument_16_, int argument_17_) {
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, argument_16_);
	OpenGL.glTexSubImage2Dub(((Class256) this).anInt3533, 0, argument_15_,
				 argument_11_, argument_13_, argument_17_,
				 Class157.method2592(116, argument_9_), 5121,
				 argument_14_, argument_12_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    Class256_Sub2(GraphicsToolkit_Sub2_Sub1 argument_18_, Class320 argument_19_,
		  int argument_20_, int argument_21_, boolean argument_22_,
		  byte[] argument_23_, int argument_24_, int argument_25_) {
	super(argument_18_, 3553, argument_19_, DataType.BYTE,
	      argument_21_ * argument_20_, argument_22_);
	anInt5624 = argument_20_;
	anInt5622 = argument_21_;
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	OpenGL.glPixelStorei(3317, 1);
	if (!argument_22_ || argument_25_ != 0 || argument_24_ != 0) {
	    OpenGL.glPixelStorei(3314, argument_25_);
	    OpenGL.glTexImage2Dub(((Class256) this).anInt3533, 0,
				  this.method3273(-11391), argument_20_,
				  argument_21_, 0,
				  Class157.method2592(35, (((Class256) this)
							   .aClass320_3534)),
				  5121, argument_23_, argument_24_);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    this.method3275((byte) -22, argument_23_, argument_20_,
			    argument_21_, ((Class256) this).anInt3533);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public final float method22(int argument_26_, float argument_27_) {
	int anLocalInt = -76 / ((68 - argument_26_) / 53);
	return argument_27_ / (float) anInt5622;
    }
    
    public final void method15(int argument_28_, byte argument_29_,
			       int argument_30_, int[] argument_31_,
			       int argument_32_, int argument_33_,
			       int argument_34_, int argument_35_) {
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	OpenGL.glPixelStorei(3314, argument_32_);
	OpenGL.glTexSubImage2Di(((Class256) this).anInt3533, 0, argument_35_,
				argument_28_, argument_30_, argument_33_,
				32993,
				(((GraphicsToolkit_Sub2_Sub1)
				  ((Class256) this).aClass_ha_Sub2_Sub1_3531)
				 .anInt6476),
				argument_31_, argument_34_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    public final int method20(boolean argument_36_) {
	if (argument_36_)
	    anInt5624 = -80;
	return anInt5624;
    }
    
    Class256_Sub2(GraphicsToolkit_Sub2_Sub1 argument_37_, int argument_38_,
		  int argument_39_, boolean argument_40_, int[] argument_41_,
		  int argument_42_, int argument_43_) {
	super(argument_37_, 3553, Applet_Sub1.aClass320_9,
	      DataType.BYTE, argument_38_ * argument_39_,
	      argument_40_);
	anInt5624 = argument_38_;
	anInt5622 = argument_39_;
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	if (!argument_40_ || argument_43_ != 0 || argument_42_ != 0) {
	    OpenGL.glPixelStorei(3314, argument_43_);
	    OpenGL.glTexImage2Di(((Class256) this).anInt3533, 0, 6408,
				 anInt5624, anInt5622, 0, 32993,
				 (((GraphicsToolkit_Sub2_Sub1)
				   ((Class256) this).aClass_ha_Sub2_Sub1_3531)
				  .anInt6476),
				 argument_41_, argument_42_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    this.method3279(argument_41_, ((Class256) this).anInt3533,
			    argument_38_, true, argument_39_);
    }
    
    Class256_Sub2(GraphicsToolkit_Sub2_Sub1 argument_44_, Class320 argument_45_,
		  int argument_46_, int argument_47_, boolean argument_48_,
		  float[] argument_49_, int argument_50_, int argument_51_) {
	super(argument_44_, 3553, argument_45_, DataType.FLOAT,
	      argument_46_ * argument_47_, argument_48_);
	anInt5624 = argument_46_;
	anInt5622 = argument_47_;
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	if (argument_48_ || argument_51_ != 0 || argument_50_ != 0) {
	    OpenGL.glPixelStorei(3314, argument_51_);
	    OpenGL.glTexImage2Df(((Class256) this).anInt3533, 0,
				 this.method3273(-11391), argument_46_,
				 argument_47_, 0,
				 Class157.method2592(36, (((Class256) this)
							  .aClass320_3534)),
				 5126, argument_49_, argument_50_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    this.method3276(argument_47_, argument_46_, argument_49_, 5126,
			    ((Class256) this).anInt3533);
    }
    
    public final float method18(int argument_52_, float argument_53_) {
	if (argument_52_ != -18982)
	    return 0.057882626F;
	return argument_53_ / (float) anInt5624;
    }
    
    public final void method19(boolean argument_54_, boolean argument_55_,
			       int argument_56_) {
	if (argument_56_ == 30135) {
	    ((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	    OpenGL.glTexParameteri(((Class256) this).anInt3533, 10242,
				   !argument_55_ ? 33071 : 10497);
	    OpenGL.glTexParameteri(((Class256) this).anInt3533, 10243,
				   !argument_54_ ? 33071 : 10497);
	}
    }
    
    public static void method3283(int argument) {
	anIntArray5626 = null;
	aClass166_5623 = null;
	aStringArrayArray5625 = null;
    }
    
    final void method3284
	(int argument_57_, float[] argument_58_, int argument_59_,
	 int argument_60_, Class320 argument_61_, int argument_62_,
	 int argument_63_, int argument_64_, int argument_65_) {
	if (argument_63_ < -122) {
	    ((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	    OpenGL.glPixelStorei(3314, argument_57_);
	    OpenGL.glTexSubImage2Df(((Class256) this).anInt3533, 0,
				    argument_65_, argument_62_, argument_64_,
				    argument_59_,
				    Class157.method2592(50, argument_61_),
				    5121, argument_58_, argument_60_);
	    OpenGL.glPixelStorei(3314, 0);
	}
    }
    
    Class256_Sub2(GraphicsToolkit_Sub2_Sub1 argument_66_, Class320 argument_67_,
		  DataType argument_68_, int argument_69_, int argument_70_) {
	super(argument_66_, 3553, argument_67_, argument_68_,
	      argument_69_ * argument_70_, false);
	anInt5622 = argument_70_;
	anInt5624 = argument_69_;
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	OpenGL.glTexImage2Dub(((Class256) this).anInt3533, 0,
			      this.method3273(-11391), argument_69_,
			      argument_70_, 0,
			      Class157.method2592(77, (((Class256) this)
						       .aClass320_3534)),
			      Node_Sub52.method1318((byte) -124,
                          (((Class256) this)
                                  .aDataType_3529)),
			      null, 0);
    }
    
    static final void method3285
	(int argument, int argument_71_, int argument_72_, int argument_73_,
	 int argument_74_, int argument_75_, int argument_76_) {
	int anLocalInt
	    = Node_Sub31_Sub8.method897(argument_74_, Class209.anInt1504,
            124915076,
            Node_Sub31_Sub13.anInt5896);
	int anLocalInt_77_
	    = Node_Sub31_Sub8.method897(argument_71_, Class209.anInt1504,
            124915076,
            Node_Sub31_Sub13.anInt5896);
	int anLocalInt_78_
	    = Node_Sub31_Sub8.method897(argument_72_,
            Node_Sub35.anInt4156, 124915076,
            Node_Sub9_Sub2.anInt5776);
	int anLocalInt_79_
	    = Node_Sub31_Sub8.method897(argument_75_,
            Node_Sub35.anInt4156, 124915076,
            Node_Sub9_Sub2.anInt5776);
	int anLocalInt_80_
	    = Node_Sub31_Sub8.method897(argument_73_ + argument_74_,
            Class209.anInt1504, 124915076,
            Node_Sub31_Sub13.anInt5896);
	int anLocalInt_81_
	    = Node_Sub31_Sub8.method897(-argument_73_ + argument_71_,
            Class209.anInt1504, 124915076,
            Node_Sub31_Sub13.anInt5896);
	for (int anLocalInt_82_ = anLocalInt; anLocalInt_82_ < anLocalInt_80_;
	     anLocalInt_82_++)
	    Statics.method3364(Class223.anIntArrayArray1562[anLocalInt_82_], (byte) 91, anLocalInt_78_, anLocalInt_79_, argument_76_);
	for (int anLocalInt_83_ = anLocalInt_77_;
	     anLocalInt_83_ > anLocalInt_81_; anLocalInt_83_--)
	    Statics.method3364(Class223.anIntArrayArray1562[anLocalInt_83_], (byte) -86, anLocalInt_78_, anLocalInt_79_, argument_76_);
	int anLocalInt_84_
	    = Node_Sub31_Sub8.method897(argument_72_ + argument_73_,
            Node_Sub35.anInt4156, 124915076,
            Node_Sub9_Sub2.anInt5776);
	int anLocalInt_85_
	    = Node_Sub31_Sub8.method897(-argument_73_ + argument_75_,
            Node_Sub35.anInt4156, 124915076,
            Node_Sub9_Sub2.anInt5776);
	for (int anLocalInt_86_ = anLocalInt_80_;
	     anLocalInt_86_ <= anLocalInt_81_; anLocalInt_86_++) {
	    int[] anLocalInts = Class223.anIntArrayArray1562[anLocalInt_86_];
	    Statics.method3364(anLocalInts, (byte) -89, anLocalInt_78_, anLocalInt_84_, argument_76_);
	    Statics.method3364(anLocalInts, (byte) -85, anLocalInt_85_, anLocalInt_79_, argument_76_);
	}
    }

    static {
	aClass166_5623 = new Class166(130, -2);
	anIntArray5626 = new int[1];
    }
}
