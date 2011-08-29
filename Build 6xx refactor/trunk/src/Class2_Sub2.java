/* Class2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class2_Sub2 extends Class2
{
    static int anInt3763;
    private GraphicsToolkit_Sub2_Sub1 aClass_ha_Sub2_Sub1_3764;
    private Class191 aClass191_3765;
    static int anInt3768;
    private Class301 aClass301_3769;
    static int anInt3770 = 1;
    
    final boolean method185(int argument_0_) {
	if (argument_0_ <= 53)
	    return false;
	if (aClass301_3769 == null)
	    return false;
	return true;
    }
    
    final void method193(boolean argument_1_, int argument_2_) {
	OpenGL.glBindProgramARB(34336, ((Class301) aClass301_3769).anInt2526);
	OpenGL.glEnable(34336);
	if (argument_2_ == 2)
	    ((Class2) this).aClass_ha_Sub2_56
		.method2229((byte) 107, GlMultiTexSourceEnum.PREVIOUS, 0);
    }
    
    Class2_Sub2(GraphicsToolkit_Sub2_Sub1 argument_3_, Js5Store argument_4_,
		Class191 argument_5_) {
	super(argument_3_);
	aClass_ha_Sub2_Sub1_3764 = argument_3_;
	aClass191_3765 = argument_5_;
	if (argument_4_ != null && aClass191_3765.method2883(29925)
	    && ((GraphicsToolkit_Sub2_Sub1) aClass_ha_Sub2_Sub1_3764).hasVertexProgram)
	    aClass301_3769
		= (Class281.method3445
		   ((byte) -63,
		    argument_4_.getData("gl", "transparent_water"), 34336,
		    aClass_ha_Sub2_Sub1_3764));
	else
	    aClass301_3769 = null;
    }
    
    final void method186(int argument_6_, int argument_7_,
			 boolean argument_8_) {
	if (argument_8_ != true)
	    aClass191_3765 = null;
	if (!((Class191) aClass191_3765).aBoolean1408) {
	    int anLocalInt
		= ((((GraphicsToolkit_Sub2) ((Class2) this).aClass_ha_Sub2_56)
		    .anInt4757)
		   % 4000 * 16 / 4000);
	    ((Class2) this).aClass_ha_Sub2_56.method2237
		(true, (((Class191) aClass191_3765).anInterface7_Impl2Array1400
			[anLocalInt]));
	    OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F,
						1.0F);
	} else {
	    float f
		= (float) ((((GraphicsToolkit_Sub2) ((Class2) this).aClass_ha_Sub2_56)
			    .anInt4757)
			   % 4000) / 4000.0F;
	    ((Class2) this).aClass_ha_Sub2_56.method2237
		(true, ((Class191) aClass191_3765).anInterface7_Impl1_1403);
	    OpenGL.glProgramLocalParameter4fARB(34336, 0, f, 0.0F, 0.0F, 1.0F);
	}
    }
    
    static final GlProgramObject method200(int argument, String argument_9_,
				    byte argument_10_,
				    GlToolkit argument_11_) {
	int anLocalInt = OpenGL.glGenProgramARB();
	OpenGL.glBindProgramARB(argument, anLocalInt);
	OpenGL.glProgramStringARB(argument, 34933, argument_9_);
	OpenGL.glGetIntegerv(34379, Node_Sub37_Sub4.anIntArray6134, 0);
	if (Node_Sub37_Sub4.anIntArray6134[0] != -1) {
	    OpenGL.glBindProgramARB(argument, 0);
	    return null;
	}
	OpenGL.glBindProgramARB(argument, 0);
	return new GlProgramObject(argument_11_, anLocalInt);
    }
    
    final void method195(byte argument_12_) {
	if (argument_12_ > 54) {
	    ((Class2) this).aClass_ha_Sub2_56
		.method2229((byte) 119, GlMultiTexSourceEnum.TEXTURE, 0);
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	}
    }
    
    final void method196(int argument_13_, byte argument_14_,
			 Interface7 argument_15_) {
	int anLocalInt = -85 % ((60 - argument_14_) / 61);
    }
    
    final void method189(int argument_16_, boolean argument_17_) {
	if (argument_16_ != 22789)
	    aClass301_3769 = null;
	((Class2) this).aClass_ha_Sub2_56.method2228
	    (CombineModeEnum.ADD, CombineModeEnum.REPLACE, -93);
    }
}
