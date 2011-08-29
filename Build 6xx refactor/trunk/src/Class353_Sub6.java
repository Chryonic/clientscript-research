/* Class353_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class353_Sub6 extends Class353
{
    private Class208 aClass208_5505;
    private GlDrawingList aGlDrawingList_5506;
    static int anInt5507;
    static Class368[] aClass368Array5508;
    
    final boolean method3890(int argument_0_) {
	if (argument_0_ != -6808)
	    return false;
	return true;
    }
    
    public static void method3908(int argument) {
	aClass368Array5508 = null;
    }
    
    final void method3882(int argument_1_, GlTexture argument_2_,
			  int argument_3_) {
	((Class353) this).toolkit.bindTexture(argument_2_);
	((Class353) this).toolkit.setCombineMode(argument_3_);
	if (argument_1_ != 9)
	    method3885(2, true);
    }
    
    final void method3891(int argument_4_) {
	aGlDrawingList_5506.call('\001');
	if (argument_4_ != -1756)
	    method3882(117, null, -101);
	((Class353) this).toolkit.setActiveTextureUnit(1);
	((Class353) this).toolkit.bind(null);
	((Class353) this).toolkit.setActiveTextureUnit(0);
    }
    
    final void method3885(int argument_5_, boolean argument_6_) {
	if (argument_5_ != 0) {
	    /* empty */
	}
    }
    
    final void bind(boolean argument_7_, boolean argument_8_) {
	if (argument_8_)
	    aClass368Array5508 = null;
	aGlDrawingList_5506.call('\0');
	if (((Class208) aClass208_5505).aBoolean1490) {
	    ((Class353) this).toolkit.setActiveTextureUnit(1);
	    ((Class353) this).toolkit.bindTexture(((Class208) aClass208_5505).aClass142_Sub3_1489);
	    ((Class353) this).toolkit.setActiveTextureUnit(0);
	}
    }
    
    Class353_Sub6(GlToolkit argument_9_, Class208 argument_10_) {
	super(argument_9_);
	aClass208_5505 = argument_10_;
	aGlDrawingList_5506 = new GlDrawingList(2);
	aGlDrawingList_5506.newList(0);
	((Class353) this).toolkit.setActiveTextureUnit(1);
	if (((Class208) aClass208_5505).aBoolean1490) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glEnable(3170);
	}
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	((Class353) this).toolkit.setActiveTextureUnit(0);
	aGlDrawingList_5506.endList();
	aGlDrawingList_5506.newList(1);
	((Class353) this).toolkit.setActiveTextureUnit(1);
	if (((Class208) aClass208_5505).aBoolean1490)
	    OpenGL.glDisable(3170);
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	((Class353) this).toolkit.setActiveTextureUnit(0);
	aGlDrawingList_5506.endList();
    }
    
    final void configure(int argument_11_, int argument_12_, int argument_13_) {
	float f = (float) ((argument_12_ & 0x3) + 1) * -5.0E-4F;
	float f_14_ = (float) ((argument_12_ >> 3 & 0x3) + 1) * 5.0E-4F;
	float f_15_
	    = (argument_12_ & 0x40) != 0 ? 9.765625E-4F : 4.8828125E-4F;
	((Class353) this).toolkit.setActiveTextureUnit(1);
	boolean anLocalBoolean = (argument_12_ & 0x80) != 0;
	if (!anLocalBoolean) {
	    Class52.aFloatArray390[1] = 0.0F;
	    Class52.aFloatArray390[0] = 0.0F;
	    Class52.aFloatArray390[2] = f_15_;
	    Class52.aFloatArray390[3] = 0.0F;
	} else {
	    Class52.aFloatArray390[0] = f_15_;
	    Class52.aFloatArray390[1] = 0.0F;
	    Class52.aFloatArray390[2] = 0.0F;
	    Class52.aFloatArray390[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, Class52.aFloatArray390, 0);
	Class52.aFloatArray390[2] = 0.0F;
	Class52.aFloatArray390[0] = 0.0F;
	Class52.aFloatArray390[1] = f_15_;
	Class52.aFloatArray390[3]
	    = f * (float) (((GlToolkit)
			    ((Class353) this).toolkit)
			   .anInt4850) % 1.0F;
	OpenGL.glTexGenfv(8193, 9474, Class52.aFloatArray390, 0);
	if (argument_11_ <= 122)
	    aGlDrawingList_5506 = null;
	if (((Class208) aClass208_5505).aBoolean1490) {
	    Class52.aFloatArray390[3]
		= f_14_ * (float) (((GlToolkit)
				    ((Class353) this).toolkit)
				   .anInt4850) % 1.0F;
	    Class52.aFloatArray390[0] = 0.0F;
	    Class52.aFloatArray390[2] = 0.0F;
	    Class52.aFloatArray390[1] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, Class52.aFloatArray390, 0);
	} else {
	    int anLocalInt
		= (int) ((float) (((GlToolkit)
				   ((Class353) this).toolkit)
				  .anInt4850)
			 * f_14_ * 16.0F);
	    ((Class353) this).toolkit.bindTexture((((Class208) aClass208_5505).aClass142_Sub4Array1488[anLocalInt % 16]));
	}
	((Class353) this).toolkit.setActiveTextureUnit(0);
    }
}
