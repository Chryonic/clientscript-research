/* Class353_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class353_Sub5 extends Class353
{
    private boolean aBoolean5497 = false;
    private boolean aBoolean5498;
    static int anInt5499;
    static int anInt5500;
    static Class207 aClass207_5501 = new Class207(49, 8);
    private GlDrawingList aGlDrawingList_5502;
    private GlCubeMap[] aClass142_Sub1Array5503;
    static int anInt5504;
    
    static final int method3905(int argument, int argument_0_, int argument_1_,
				boolean argument_2_) {
	argument_0_ &= 0x3;
	if (argument_0_ == 0)
	    return argument_1_;
	if (argument_0_ == 1)
	    return -argument + 4095;
	if (argument_0_ == 2)
	    return -argument_1_ + 4095;
	return argument;
    }
    
    final boolean method3890(int argument_3_) {
	if (argument_3_ != -6808)
	    return true;
	return true;
    }
    
    final void method3882(int argument_4_, GlTexture argument_5_,
			  int argument_6_) {
	if (argument_4_ != 9)
	    aClass142_Sub1Array5503 = null;
	((Class353) this).toolkit.bindTexture(argument_5_);
	((Class353) this).toolkit.setCombineMode(argument_6_);
    }
    
    public static void method3906(int argument) {
	aClass207_5501 = null;
    }
    
    private final void method3907(int argument_7_) {
	aGlDrawingList_5502
	    = new GlDrawingList(2);
	aGlDrawingList_5502.newList(0);
	((Class353) this).toolkit.setActiveTextureUnit(1);
	OpenGL.glTexGeni(8192, 9472, 34065);
	OpenGL.glTexGeni(8193, 9472, 34065);
	OpenGL.glTexGeni(8194, 9472, 34065);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glEnable(3170);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
	int anLocalInt = 92 / ((argument_7_ + 58) / 41);
	OpenGL.glMatrixMode(5888);
	if (!aBoolean5498) {
	    ((Class353) this).toolkit.setCombineModes(8448, 7681);
	    ((Class353) this).toolkit.method2334(34168, 768, 0,
							     34192);
	    ((Class353) this).toolkit.setActiveTextureUnit(2);
	    ((Class353) this).toolkit.setCombineModes(7681, 260);
	    ((Class353) this).toolkit.method2334(34168, 768, 0,
							     34192);
	    ((Class353) this).toolkit.method2334(34168, 770, 1,
							     34192);
	    ((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 34167);
	} else {
	    ((Class353) this).toolkit.setCombineModes(7681, 260);
	    ((Class353) this).toolkit.method2334(5890, 770, 0,
							     34192);
	    ((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 34167);
	}
	((Class353) this).toolkit.setActiveTextureUnit(0);
	aGlDrawingList_5502.endList();
	aGlDrawingList_5502.newList(1);
	((Class353) this).toolkit.setActiveTextureUnit(1);
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	OpenGL.glDisable(3170);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	if (!aBoolean5498) {
	    ((Class353) this).toolkit.setCombineModes(8448, 8448);
	    ((Class353) this).toolkit.method2334(5890, 768, 0,
							     34192);
	    ((Class353) this).toolkit.setActiveTextureUnit(2);
	    ((Class353) this).toolkit.setCombineModes(8448, 8448);
	    ((Class353) this).toolkit.method2334(5890, 768, 0,
							     34192);
	    ((Class353) this).toolkit.method2334(34168, 768, 1,
							     34192);
	    ((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 5890);
	} else {
	    ((Class353) this).toolkit.setCombineModes(8448, 8448);
	    ((Class353) this).toolkit.method2334(5890, 768, 0,
							     34192);
	    ((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 5890);
	}
	((Class353) this).toolkit.setActiveTextureUnit(0);
	aGlDrawingList_5502.endList();
    }
    
    Class353_Sub5(GlToolkit argument_8_) {
	super(argument_8_);
	if (((GlToolkit) argument_8_).haveTextureCubeMap) {
	    aBoolean5498 = ((GlToolkit) argument_8_).maxTextureUnits < 3;
	    int anLocalInt = aBoolean5498 ? 48 : 127;
	    byte[][] anLocalInts = new byte[6][4096];
	    byte[][] anLocalInts_9_ = new byte[6][4096];
	    byte[][] anLocalInts_10_ = new byte[6][4096];
	    int anLocalInt_11_ = 0;
	    for (int anLocalInt_12_ = 0; anLocalInt_12_ < 64;
		 anLocalInt_12_++) {
		for (int anLocalInt_13_ = 0; anLocalInt_13_ < 64;
		     anLocalInt_13_++) {
		    float f = (float) anLocalInt_13_ * 2.0F / 64.0F - 1.0F;
		    float f_14_
			= (float) anLocalInt_12_ * 2.0F / 64.0F + -1.0F;
		    float f_15_
			= (float) (1.0
				   / Math.sqrt((double) (f * f + 1.0F
							 + f_14_ * f_14_)));
		    f *= f_15_;
		    f_14_ *= f_15_;
		    for (int anLocalInt_16_ = 0; anLocalInt_16_ < 6;
			 anLocalInt_16_++) {
			float f_17_;
			if (anLocalInt_16_ != 0) {
			    if (anLocalInt_16_ == 1)
				f_17_ = f;
			    else if (anLocalInt_16_ == 2)
				f_17_ = f_14_;
			    else if (anLocalInt_16_ != 3) {
				if (anLocalInt_16_ == 4)
				    f_17_ = f_15_;
				else
				    f_17_ = -f_15_;
			    } else
				f_17_ = -f_14_;
			} else
			    f_17_ = -f;
			int anLocalInt_18_;
			int anLocalInt_19_;
			int anLocalInt_20_;
			if (!(f_17_ > 0.0F))
			    anLocalInt_18_ = anLocalInt_19_
				= anLocalInt_20_ = 0;
			else {
			    anLocalInt_18_
				= (int) ((double) anLocalInt
					 * Math.pow((double) f_17_, 96.0));
			    anLocalInt_19_
				= (int) ((double) anLocalInt
					 * Math.pow((double) f_17_, 36.0));
			    anLocalInt_20_
				= (int) ((double) anLocalInt
					 * Math.pow((double) f_17_, 12.0));
			}
			anLocalInts_9_[anLocalInt_16_][anLocalInt_11_]
			    = (byte) anLocalInt_18_;
			anLocalInts_10_[anLocalInt_16_][anLocalInt_11_]
			    = (byte) anLocalInt_19_;
			anLocalInts[anLocalInt_16_][anLocalInt_11_]
			    = (byte) anLocalInt_20_;
		    }
		    anLocalInt_11_++;
		}
	    }
	    aClass142_Sub1Array5503 = new GlCubeMap[3];
	    aClass142_Sub1Array5503[0]
		= new GlCubeMap(((Class353) this).toolkit,
				    6406, 64, false, anLocalInts_9_, 6406);
	    aClass142_Sub1Array5503[1]
		= new GlCubeMap(((Class353) this).toolkit,
				    6406, 64, false, anLocalInts_10_, 6406);
	    aClass142_Sub1Array5503[2]
		= new GlCubeMap(((Class353) this).toolkit,
				    6406, 64, false, anLocalInts, 6406);
	    method3907(59);
	}
    }
    
    final void method3891(int argument_21_) {
	if (!aBoolean5497)
	    ((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 5890);
	else {
	    if (!aBoolean5498) {
		((Class353) this).toolkit.setActiveTextureUnit(2);
		((Class353) this).toolkit.bind(null);
	    }
	    ((Class353) this).toolkit.setActiveTextureUnit(1);
	    ((Class353) this).toolkit.bind(null);
	    ((Class353) this).toolkit.setActiveTextureUnit(0);
	    aGlDrawingList_5502.call('\001');
	    aBoolean5497 = false;
	}
	((Class353) this).toolkit.setCombineModes(8448, 8448);
	if (argument_21_ != -1756)
	    method3905(-9, 38, -40, false);
    }
    
    final void configure(int argument_22_, int argument_23_, int argument_24_) {
	if (aBoolean5497) {
	    ((Class353) this).toolkit.setActiveTextureUnit(1);
	    ((Class353) this).toolkit.bindTexture(aClass142_Sub1Array5503[argument_23_ - 1]);
	    ((Class353) this).toolkit.setActiveTextureUnit(0);
	}
	if (argument_22_ < 122)
	    aBoolean5498 = false;
    }
    
    final void bind(boolean argument_25_, boolean argument_26_) {
	if (argument_26_)
	    method3907(-7);
	if (aGlDrawingList_5502 == null || !argument_25_)
	    ((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 34168);
	else {
	    if (!aBoolean5498) {
		((Class353) this).toolkit.setActiveTextureUnit(2);
		((Class353) this).toolkit.bindTexture((((GlToolkit) ((Class353) this).toolkit).aClass142_Sub4_4955));
		((Class353) this).toolkit.setActiveTextureUnit(0);
	    }
	    aGlDrawingList_5502.call('\0');
	    aBoolean5497 = true;
	}
    }
    
    final void method3885(int argument_27_, boolean argument_28_) {
	if (argument_27_ != 0)
	    method3906(-105);
	((Class353) this).toolkit.setCombineModes(7681, 8448);
    }
}
