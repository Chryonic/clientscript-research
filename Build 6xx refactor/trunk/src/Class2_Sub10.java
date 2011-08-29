/* Class2_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class2_Sub10 extends Class2
{
    private Class301 aClass301_3813;
    private float[] aFloatArray3814;
    private Interface7_Impl2 anInterface7_Impl2_3815;
    private Class301 aClass301_3816;
    private Class301 aClass301_3817;
    private boolean aBoolean3818 = false;
    private Class301 aClass301_3819;
    private boolean aBoolean3820;
    private boolean aBoolean3821;
    private boolean aBoolean3822;
    static Class207 aClass207_3823;
    static int anInt3824 = 0;
    
    final void method191(byte argument_0_) {
	if (argument_0_ != -36)
	    aFloatArray3814 = null;
	int anLocalInt = ((Class2) this).aClass_ha_Sub2_56.method2239();
	Class350_Sub2 class350_sub2
	    = ((Class2) this).aClass_ha_Sub2_56.method2119(0);
	if (!aBoolean3822)
	    OpenGL.glBindProgramARB(34336,
				    (anLocalInt != 2147483647
				     ? ((Class301) aClass301_3813).anInt2526
				     : ((Class301) aClass301_3817).anInt2526));
	else
	    OpenGL.glBindProgramARB(34336,
				    (anLocalInt == 2147483647
				     ? ((Class301) aClass301_3816).anInt2526
				     : ((Class301) aClass301_3819).anInt2526));
	OpenGL.glEnable(34336);
	aBoolean3820 = true;
	class350_sub2.method3863(-1.0F, 1, 0.0F, (float) anLocalInt, 0.0F,
				 aFloatArray3814);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray3814[0],
					    aFloatArray3814[1],
					    aFloatArray3814[2],
					    aFloatArray3814[3]);
	method190((byte) -128);
    }
    
    final boolean method185(int argument_1_) {
	if (argument_1_ < 53)
	    method185(51);
	return aBoolean3821;
    }
    
    Class2_Sub10(GraphicsToolkit_Sub2_Sub1 argument_2_, Js5Store argument_3_) {
	super(argument_2_);
	aFloatArray3814 = new float[4];
	if (argument_3_ == null
	    || !((GraphicsToolkit_Sub2_Sub1) argument_2_).hasVertexProgram)
	    aBoolean3821 = false;
	else {
	    aClass301_3817
		= Class281.method3445((byte) -63,
				      argument_3_.getData("gl", "uw_ground_unlit"),
				      34336, argument_2_);
	    aClass301_3816
		= Class281.method3445((byte) -63,
				      argument_3_
					  .getData("gl", "uw_ground_lit"),
				      34336, argument_2_);
	    aClass301_3813
		= Class281.method3445((byte) -63,
				      argument_3_.getData("gl", "uw_model_unlit"),
				      34336, argument_2_);
	    aClass301_3819
		= Class281.method3445((byte) -63,
				      argument_3_.getData("gl", "uw_model_lit"),
				      34336, argument_2_);
	    if (!(aClass301_3813 != null
		  & (aClass301_3816 != null & aClass301_3817 != null)
		  & aClass301_3819 != null))
		aBoolean3821 = false;
	    else {
		anInterface7_Impl2_3815
		    = ((Class2) this).aClass_ha_Sub2_56.method2233((byte) -121,
								   2, 1, false,
								   (new int[]
								    { 0,
								      -1 }));
		anInterface7_Impl2_3815.method19(false, false, 30135);
		aBoolean3821 = true;
	    }
	}
    }
    
    final void method196(int argument_4_, byte argument_5_,
			 Interface7 argument_6_) {
	if (argument_6_ != null) {
	    if (aBoolean3818) {
		((Class2) this).aClass_ha_Sub2_56
		    .method2229((byte) -78, GlMultiTexSourceEnum.TEXTURE, 0);
		((Class2) this).aClass_ha_Sub2_56
		    .method2224(0, GlMultiTexSourceEnum.TEXTURE, -111);
		aBoolean3818 = false;
	    }
	    ((Class2) this).aClass_ha_Sub2_56.method2237(true, argument_6_);
	    ((Class2) this).aClass_ha_Sub2_56.method2216((byte) 73,
							 argument_4_);
	} else if (!aBoolean3818) {
	    ((Class2) this).aClass_ha_Sub2_56.method2237
		(true, (((GraphicsToolkit_Sub2) ((Class2) this).aClass_ha_Sub2_56)
			.anInterface7_4741));
	    ((Class2) this).aClass_ha_Sub2_56.method2216((byte) 101, 1);
	    ((Class2) this).aClass_ha_Sub2_56
		.method2229((byte) 95, GlMultiTexSourceEnum.PREVIOUS, 0);
	    ((Class2) this).aClass_ha_Sub2_56
		.method2224(0, GlMultiTexSourceEnum.PREVIOUS, -110);
	    aBoolean3818 = true;
	}
	int anLocalInt = -92 % ((60 - argument_5_) / 61);
    }
    
    final void method189(int argument_7_, boolean argument_8_) {
	if (argument_7_ != 22789)
	    method195((byte) 25);
    }
    
    final void method195(byte argument_9_) {
	((Class2) this).aClass_ha_Sub2_56.setActiveTexture(1);
	((Class2) this).aClass_ha_Sub2_56.method2237(true, null);
	if (argument_9_ <= 54)
	    method212(70);
	((Class2) this).aClass_ha_Sub2_56
	    .method2228(CombineModeEnum.MODULATE, CombineModeEnum.MODULATE, 100);
	((Class2) this).aClass_ha_Sub2_56
	    .method2229((byte) 115, GlMultiTexSourceEnum.TEXTURE, 0);
	((Class2) this).aClass_ha_Sub2_56
	    .method2229((byte) 97, GlMultiTexSourceEnum.CONSTANT, 2);
	((Class2) this).aClass_ha_Sub2_56
	    .method2224(0, GlMultiTexSourceEnum.TEXTURE, -123);
	((Class2) this).aClass_ha_Sub2_56.setActiveTexture(0);
	if (aBoolean3818) {
	    ((Class2) this).aClass_ha_Sub2_56
		.method2229((byte) 106, GlMultiTexSourceEnum.TEXTURE, 0);
	    ((Class2) this).aClass_ha_Sub2_56
		.method2224(0, GlMultiTexSourceEnum.TEXTURE, -82);
	    aBoolean3818 = false;
	}
	if (aBoolean3820) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    aBoolean3820 = false;
	}
    }
    
    public static void method212(int argument) {
	aClass207_3823 = null;
    }
    
    final void method190(byte argument_10_) {
	if (argument_10_ <= -126) {
	    if (aBoolean3820) {
		int anLocalInt = ((Class2) this).aClass_ha_Sub2_56.XA();
		int anLocalInt_11_ = ((Class2) this).aClass_ha_Sub2_56.i();
		float f = (-((float) (anLocalInt - anLocalInt_11_) * 0.125F)
			   + (float) anLocalInt);
		float f_12_
		    = (-((float) (-anLocalInt_11_ + anLocalInt) * 0.25F)
		       + (float) anLocalInt);
		OpenGL.glProgramLocalParameter4fARB
		    (34336, 0, f_12_, f,
		     1.0F / (float) ((Class2) this).aClass_ha_Sub2_56
					.method2121((byte) 127),
		     (float) ((Class2) this).aClass_ha_Sub2_56
				 .method2136((byte) 97) / 255.0F);
		((Class2) this).aClass_ha_Sub2_56.setActiveTexture(1);
		((Class2) this).aClass_ha_Sub2_56.method2246
		    (((Class2) this).aClass_ha_Sub2_56.method2174(false), 1);
		((Class2) this).aClass_ha_Sub2_56.setActiveTexture(0);
	    }
	}
    }
    
    final void method186(int argument_13_, int argument_14_,
			 boolean argument_15_) {
	if (argument_15_ != true)
	    method191((byte) -57);
    }
    
    final void method193(boolean argument_16_, int argument_17_) {
	aBoolean3822 = argument_16_;
	((Class2) this).aClass_ha_Sub2_56.setActiveTexture(1);
	((Class2) this).aClass_ha_Sub2_56.method2237(true,
						     anInterface7_Impl2_3815);
	((Class2) this).aClass_ha_Sub2_56.method2228((CombineModeEnum
						      .REPLACE),
						     CombineModeEnum.INTERPOLATE,
						     121);
	((Class2) this).aClass_ha_Sub2_56
	    .method2229((byte) -50, GlMultiTexSourceEnum.CONSTANT, 0);
	((Class2) this).aClass_ha_Sub2_56.setMultiTexRgbSource(argument_17_, true, false, (GlMultiTexSourceEnum.TEXTURE), (byte) -67);
	((Class2) this).aClass_ha_Sub2_56
	    .method2224(0, GlMultiTexSourceEnum.PREVIOUS, argument_17_ - 89);
	((Class2) this).aClass_ha_Sub2_56.setActiveTexture(0);
	method191((byte) -36);
    }
    
    static {
	aClass207_3823 = new Class207(35, 4);
    }
}
