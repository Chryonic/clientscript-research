/* Class142_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class GlTexture_Sub3 extends GlTexture
{
    int anInt5565;
    private int anInt5566 = -1;
    int anInt5567;
    static boolean aBoolean5568 = false;
    private int anInt5569 = -1;
    static int anInt5570 = 0;
    int anInt5571;
    
    final void method2496(boolean argument_0_, int argument_1_,
			  int argument_2_, int argument_3_, int argument_4_,
			  int argument_5_, int argument_6_, int argument_7_) {
	((GlTexture) this).myGLRenderer.bindTexture(this);
	OpenGL.glCopyTexSubImage3D(((GlTexture) this).type, 0, argument_7_,
				   argument_2_, argument_1_, argument_6_,
				   argument_4_, argument_3_, argument_5_);
	OpenGL.glFlush();
    }
    
    public final void detachFBO(int argument_8_) {
	OpenGL.glFramebufferTexture3DEXT(anInt5569, anInt5566,
					 ((GlTexture) this).type, 0, 0, 0);
	anInt5569 = -1;
	anInt5566 = argument_8_;
    }
    
    static final boolean method2497(int argument, int argument_9_) {
	if (argument != 0 && argument != 2)
	    return false;
	return true;
    }
    
    GlTexture_Sub3(GlToolkit argument_10_, int argument_11_, int argument_12_, int argument_13_, int argument_14_, byte[] argument_15_, int argument_16_) {
	super(argument_10_, 32879, argument_11_,
	      argument_14_ * (argument_12_ * argument_13_), false);
	((GlTexture_Sub3) this).anInt5567 = argument_13_;
	((GlTexture_Sub3) this).anInt5565 = argument_12_;
	((GlTexture_Sub3) this).anInt5571 = argument_14_;
	((GlTexture) this).myGLRenderer.bindTexture(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage3Dub(((GlTexture) this).type, 0,
			      ((GlTexture) this).format,
			      ((GlTexture_Sub3) this).anInt5565,
			      ((GlTexture_Sub3) this).anInt5567,
			      ((GlTexture_Sub3) this).anInt5571, 0,
			      argument_16_, 5121, argument_15_, 0);
	OpenGL.glPixelStorei(3317, 4);
	this.setLinearMagnification(true);
    }
    
    GlTexture_Sub3(GlToolkit argument_17_, int argument_18_, int argument_19_, int argument_20_, int argument_21_) {
	super(argument_17_, 32879, argument_18_,
	      argument_21_ * argument_19_ * argument_20_, false);
	((GlTexture_Sub3) this).anInt5571 = argument_21_;
	((GlTexture_Sub3) this).anInt5565 = argument_19_;
	((GlTexture_Sub3) this).anInt5567 = argument_20_;
	((GlTexture) this).myGLRenderer.bindTexture(this);
	OpenGL.glTexImage3Dub(((GlTexture) this).type, 0,
			      ((GlTexture) this).format,
			      ((GlTexture_Sub3) this).anInt5565,
			      ((GlTexture_Sub3) this).anInt5567,
			      ((GlTexture_Sub3) this).anInt5571, 0,
			      Statics.method1498(((GlTexture) this).format, 37),
			      5121, null, 0);
	this.setLinearMagnification(true);
    }
}
