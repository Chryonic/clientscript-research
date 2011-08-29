/* Class256_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class256_Sub3 extends Class256 implements Interface7_Impl2
{
    private int anInt5627;
    static float aFloat5628;
    private int anInt5629;
    static Signlink aSignlink_5630;
    static Node_Sub9_Sub2 aClass59_Sub9_Sub2_5631;
    
    static final boolean method3287(boolean argument) {
	if (Class62_Sub12.anInt4402 <= 0)
	    return false;
	return true;
    }
    
    static final void method3288(int argument, int argument_0_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(argument_0_, 13175,
            (long) argument);
	class59_sub51_sub3.method1181(585134072);
    }
    
    static final String method3289(byte argument, long argument_1_,
				   int argument_2_) {
	Statics.method292((byte) -126, argument_1_);
	int anLocalInt = Class212.aCalendar1507.get(5);
	int anLocalInt_3_ = Class212.aCalendar1507.get(2) + 1;
	int anLocalInt_4_ = Class212.aCalendar1507.get(1);
	return (Integer.toString(anLocalInt / 10) + anLocalInt % 10 + "/"
		+ anLocalInt_3_ / 10 + anLocalInt_3_ % 10 + "/"
		+ anLocalInt_4_ % 100 / 10 + anLocalInt_4_ % 10);
    }
    
    Class256_Sub3(GraphicsToolkit_Sub2_Sub1 argument_5_, Class320 argument_6_,
		  int argument_7_, int argument_8_, float[] argument_9_,
		  int argument_10_, int argument_11_) {
	super(argument_5_, 34037, argument_6_, DataType.FLOAT,
	      argument_7_ * argument_8_, false);
	anInt5629 = argument_7_;
	anInt5627 = argument_8_;
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	OpenGL.glPixelStorei(3314, argument_11_);
	OpenGL.glTexImage2Df(((Class256) this).anInt3533, 0,
			     this.method3273(-11391), argument_7_, argument_8_,
			     0,
			     Class157.method2592(90, (((Class256) this)
						      .aClass320_3534)),
			     5126, argument_9_, argument_10_ * 4);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    public final int method17(byte argument_12_) {
	if (argument_12_ != 84)
	    aClass59_Sub9_Sub2_5631 = null;
	return anInt5627;
    }
    
    public final boolean method16(int argument_13_) {
	if (argument_13_ != 26244)
	    method3291(-95, (byte) 80, -1);
	return false;
    }
    
    Class256_Sub3(GraphicsToolkit_Sub2_Sub1 argument_14_, Class320 argument_15_,
		  DataType argument_16_, int argument_17_, int argument_18_) {
	super(argument_14_, 34037, argument_15_, argument_16_,
	      argument_17_ * argument_18_, false);
	anInt5629 = argument_17_;
	anInt5627 = argument_18_;
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	OpenGL.glTexImage2Dub(((Class256) this).anInt3533, 0,
			      this.method3273(-11391), argument_17_,
			      argument_18_, 0,
			      Class157.method2592(124, (((Class256) this)
							.aClass320_3534)),
			      Node_Sub52.method1318((byte) -124,
                          (((Class256) this)
                                  .aDataType_3529)),
			      null, 0);
    }
    
    public final void method15(int argument_19_, byte argument_20_,
			       int argument_21_, int[] argument_22_,
			       int argument_23_, int argument_24_,
			       int argument_25_, int argument_26_) {
	if (argument_23_ == 0)
	    argument_23_ = argument_21_;
	int anLocalInt = -105 % ((argument_20_ - 52) / 59);
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	if (argument_21_ != argument_23_)
	    OpenGL.glPixelStorei(3314, argument_23_);
	OpenGL.glTexSubImage2Di(((Class256) this).anInt3533, 0, argument_26_,
				argument_19_, argument_21_, argument_24_,
				32993,
				(((GraphicsToolkit_Sub2_Sub1)
				  ((Class256) this).aClass_ha_Sub2_Sub1_3531)
				 .anInt6476),
				argument_22_, argument_25_);
	if (argument_21_ != argument_23_)
	    OpenGL.glPixelStorei(3314, 0);
    }
    
    Class256_Sub3(GraphicsToolkit_Sub2_Sub1 argument_27_, Class320 argument_28_,
		  int argument_29_, int argument_30_, byte[] argument_31_,
		  int argument_32_, int argument_33_) {
	super(argument_27_, 34037, argument_28_, DataType.BYTE,
	      argument_30_ * argument_29_, false);
	anInt5627 = argument_30_;
	anInt5629 = argument_29_;
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, argument_33_);
	OpenGL.glTexImage2Dub(((Class256) this).anInt3533, 0,
			      this.method3273(-11391), argument_29_,
			      argument_30_, 0,
			      Class157.method2592(50, (((Class256) this)
						       .aClass320_3534)),
			      5121, argument_31_, argument_32_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public final float method18(int argument_34_, float argument_35_) {
	if (argument_34_ != -18982)
	    return -0.22292215F;
	return argument_35_;
    }
    
    public static void method3290(byte argument) {
	aClass59_Sub9_Sub2_5631 = null;
	aSignlink_5630 = null;
    }
    
    public final void method21
	(Class320 argument_36_, int argument_37_, int argument_38_,
	 int argument_39_, int argument_40_, byte[] argument_41_,
	 int argument_42_, int argument_43_, int argument_44_) {
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	if (argument_43_ == 0)
	    argument_43_ = argument_40_;
	OpenGL.glPixelStorei(3317, 1);
	if (argument_43_ != argument_40_)
	    OpenGL.glPixelStorei(3314, argument_43_);
	OpenGL.glTexSubImage2Dub(((Class256) this).anInt3533, 0, argument_42_,
				 argument_38_, argument_40_, argument_44_,
				 Class157.method2592(103, argument_36_), 5121,
				 argument_41_, argument_39_);
	if (argument_43_ != argument_40_)
	    OpenGL.glPixelStorei(3314, 0);
	if (argument_37_ == 5259)
	    OpenGL.glPixelStorei(3317, 4);
    }
    
    public final float method22(int argument_45_, float argument_46_) {
	int anLocalInt = 92 / ((argument_45_ - 68) / 53);
	return argument_46_;
    }
    
    public final void method19(boolean argument_47_, boolean argument_48_,
			       int argument_49_) {
	if (argument_49_ != 30135)
	    method16(116);
    }
    
    Class256_Sub3(GraphicsToolkit_Sub2_Sub1 argument_50_, int argument_51_,
		  int argument_52_, int[] argument_53_, int argument_54_,
		  int argument_55_) {
	super(argument_50_, 34037, Applet_Sub1.aClass320_9,
	      DataType.BYTE, argument_51_ * argument_52_, false);
	anInt5627 = argument_52_;
	anInt5629 = argument_51_;
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	OpenGL.glPixelStorei(3314, argument_55_);
	OpenGL.glTexImage2Di(((Class256) this).anInt3533, 0, 6408, anInt5629,
			     anInt5627, 0, 32993,
			     (((GraphicsToolkit_Sub2_Sub1)
			       ((Class256) this).aClass_ha_Sub2_Sub1_3531)
			      .anInt6476),
			     argument_53_, argument_54_ * 4);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    static final boolean method3291(int argument, byte argument_56_,
				    int argument_57_) {
	return (Applet_Sub1.method103(argument_57_, argument, 13085)
		& (DoublyLinkedNode_Sub51_Sub8.method1232((byte) -93, argument_57_, argument)
		   | (argument_57_ & 0x2000) != 0
		   | Statics.method549(argument_57_, argument, true)));
    }
    
    public final void method23(int argument_58_, int argument_59_,
			       int argument_60_, int argument_61_,
			       int[] argument_62_, int argument_63_,
			       int argument_64_) {
	int[] anLocalInts = new int[anInt5629 * anInt5627];
	if (argument_64_ == 3839) {
	    ((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	    OpenGL.glGetTexImagei(((Class256) this).anInt3533, 0, 32993, 5121,
				  anLocalInts, 0);
	    for (int anLocalInt = 0; anLocalInt < argument_59_; anLocalInt++)
		JagStrings.memcpy(anLocalInts, (-anLocalInt + argument_59_ - (1 - argument_61_)) * anInt5629, argument_62_, argument_63_ + argument_60_ * anLocalInt, argument_60_);
	}
    }
    
    public final int method20(boolean argument_65_) {
	if (argument_65_)
	    anInt5629 = -90;
	return anInt5629;
    }
}
