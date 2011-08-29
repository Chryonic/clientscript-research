/* Class353_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class353_Sub7 extends Class353
{
    private Class208 aClass208_5509;
    private GlTexture_Sub2 aClass142_Sub2_5510;
    static int anInt5511;
    private GlDrawingList aGlDrawingList_5512;
    
    final void method3882(int argument_0_, GlTexture argument_1_,
			  int argument_2_) {
	if (argument_0_ != 9)
	    method3882(33, null, 77);
    }
    
    final void method3885(int argument_3_, boolean argument_4_) {
	if (argument_3_ != 0)
	    bind(false, true);
	((Class353) this).toolkit.setCombineModes(8448, 260);
    }
    
    Class353_Sub7(GlToolkit argument_5_, Class208 argument_6_) {
	super(argument_5_);
	aClass208_5509 = argument_6_;
	method3910((byte) 45);
	aClass142_Sub2_5510
	    = new GlTexture_Sub2(((Class353) this).toolkit, 6406, 2,
				new byte[] { 0, -1 }, 6406);
	aClass142_Sub2_5510.method2495((byte) 95, false);
    }
    
    final void bind(boolean argument_7_, boolean argument_8_) {
	if (((GlToolkit) ((Class353) this).toolkit).anInt4896
	    > 0) {
	    float f = -0.5F / (float) (((GlToolkit)
					((Class353) this).toolkit)
				       .anInt4896);
	    ((Class353) this).toolkit.setActiveTextureUnit(1);
	    Node_Sub31_Sub13.aFloatArray5898[3]
		= f * (((GlToolkit) ((Class353) this).toolkit)
		       .fogStart) + 0.25F;
	    Node_Sub31_Sub13.aFloatArray5898[1] = 0.0F;
	    Node_Sub31_Sub13.aFloatArray5898[2] = f;
	    Node_Sub31_Sub13.aFloatArray5898[0] = 0.0F;
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glTexGenfv(8192, 9474, Node_Sub31_Sub13.aFloatArray5898,
			      0);
	    OpenGL.glPopMatrix();
	    ((Class353) this).toolkit.setFog2((float) ((GlToolkit) ((Class353) this).toolkit).anInt4896, 0.5F);
	    ((Class353) this).toolkit
		.bindTexture(aClass142_Sub2_5510);
	    ((Class353) this).toolkit.setActiveTextureUnit(0);
	}
	aGlDrawingList_5512.call('\0');
	OpenGL.glMatrixMode(5890);
	OpenGL.glPushMatrix();
	OpenGL.glScalef(0.25F, 0.25F, 1.0F);
	OpenGL.glMatrixMode(5888);
	if (argument_8_)
	    aGlDrawingList_5512 = null;
    }
    
    final void configure(int argument_9_, int argument_10_, int argument_11_) {
	if ((argument_10_ & 0x1) == 1) {
	    if (!((Class208) aClass208_5509).aBoolean1490) {
		int anLocalInt
		    = ((((GlToolkit) ((Class353) this).toolkit)
			.anInt4850)
		       % 4000 * 16 / 4000);
		((Class353) this).toolkit.bindTexture((((Class208) aClass208_5509).aClass142_Sub4Array1493[anLocalInt]));
	    } else {
		((Class353) this).toolkit.bindTexture(((Class208) aClass208_5509).aClass142_Sub3_1491);
		Node_Sub31_Sub13.aFloatArray5898[3]
		    = (float) ((((GlToolkit)
				 ((Class353) this).toolkit)
				.anInt4850)
			       % 4000) / 4000.0F;
		Node_Sub31_Sub13.aFloatArray5898[1] = 0.0F;
		Node_Sub31_Sub13.aFloatArray5898[2] = 0.0F;
		Node_Sub31_Sub13.aFloatArray5898[0] = 0.0F;
		OpenGL.glTexGenfv(8194, 9473,
				  Node_Sub31_Sub13.aFloatArray5898, 0);
	    }
	} else if (!((Class208) aClass208_5509).aBoolean1490)
	    ((Class353) this).toolkit.bindTexture(((Class208) aClass208_5509).aClass142_Sub4Array1493[0]);
	else {
	    ((Class353) this).toolkit.bindTexture(((Class208) aClass208_5509).aClass142_Sub3_1491);
	    Node_Sub31_Sub13.aFloatArray5898[0] = 0.0F;
	    Node_Sub31_Sub13.aFloatArray5898[2] = 0.0F;
	    Node_Sub31_Sub13.aFloatArray5898[3] = 0.0F;
	    Node_Sub31_Sub13.aFloatArray5898[1] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, Node_Sub31_Sub13.aFloatArray5898,
			      0);
	}
	if (argument_9_ <= 122)
	    method3909((byte) -90);
    }
    
    final void method3891(int argument_12_) {
	aGlDrawingList_5512.call('\001');
	if (((GlToolkit) ((Class353) this).toolkit).anInt4896
	    > 0) {
	    ((Class353) this).toolkit
		.setActiveTextureUnit(1);
	    ((Class353) this).toolkit.bind(null);
	    ((Class353) this).toolkit.setFog2(0.0F, 1.0F);
	    ((Class353) this).toolkit.setActiveTextureUnit(0);
	}
	((Class353) this).toolkit.setCombineModes(8448, 8448);
	OpenGL.glMatrixMode(5890);
	if (argument_12_ != -1756)
	    method3882(3, null, -86);
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
    }
    
    final boolean method3890(int argument_13_) {
	if (argument_13_ != -6808)
	    return false;
	return true;
    }
    
    static final void method3909(byte argument) {
	if (argument != -67)
	    anInt5511 = 105;
	if (Class201.aByteArray1448 == null) {
	    if (Class141.anInt1099 != -1)
		Statics.method3415(argument ^ ~0x43);
	    else
		Statics.method180((byte) 93, Class276.aString2215, Statics.aString2295);
	} else
	    Class53.method482(argument ^ 0x4cf8);
    }
    
    private final void method3910(byte argument_14_) {
	if (argument_14_ == 45) {
	    aGlDrawingList_5512
		= new GlDrawingList(2);
	    aGlDrawingList_5512.newList(0);
	    ((Class353) this).toolkit.setActiveTextureUnit(1);
	    ((Class353) this).toolkit.setCombineModes(260, 7681);
	    ((Class353) this).toolkit.method2334(34168, 768, 0,
							     34192);
	    OpenGL.glTexGeni(8192, 9472, 9216);
	    OpenGL.glEnable(3168);
	    ((Class353) this).toolkit.setActiveTextureUnit(0);
	    OpenGL.glTexEnvf(8960, 34163, 2.0F);
	    if (((Class208) aClass208_5509).aBoolean1490) {
		OpenGL.glTexGeni(8194, 9472, 9217);
		OpenGL.glTexGeni(8195, 9472, 9217);
		OpenGL.glTexGenfv(8195, 9473,
				  new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
		OpenGL.glEnable(3170);
		OpenGL.glEnable(3171);
	    }
	    aGlDrawingList_5512.endList();
	    aGlDrawingList_5512.newList(1);
	    ((Class353) this).toolkit.setActiveTextureUnit(1);
	    ((Class353) this).toolkit.setCombineModes(8448, 8448);
	    ((Class353) this).toolkit
		.method2334(5890, 768, 0, argument_14_ + 34147);
	    OpenGL.glDisable(3168);
	    ((Class353) this).toolkit
		.setActiveTextureUnit(0);
	    OpenGL.glTexEnvf(8960, 34163, 1.0F);
	    if (((Class208) aClass208_5509).aBoolean1490) {
		OpenGL.glDisable(3170);
		OpenGL.glDisable(3171);
	    }
	    aGlDrawingList_5512.endList();
	}
    }
}
