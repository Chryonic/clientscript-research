/* Class142_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class GlTexture_Sub2 extends GlTexture
{
    private int anInt5563;
    static Class166 aClass166_5564 = new Class166(42, -2);
    
    static final DoublyLinkedNodeP2_Sub2_Sub1 method2492(int argument, int argument_0_,
					       int argument_1_) {
	Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			     [argument][argument_0_][argument_1_]);
	if (class148 == null)
	    return null;
	return ((Class148) class148).aClass104_Sub2_Sub1_1131;
    }

    public static void method2494(int argument) {
	aClass166_5564 = null;
    }
    
    GlTexture_Sub2(GlToolkit argument_3_, int argument_4_, int argument_5_, byte[] argument_6_, int argument_7_) {
	super(argument_3_, 3552, argument_4_, argument_5_, false);
	anInt5563 = argument_5_;
	((GlTexture) this).myGLRenderer.bindTexture(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage1Dub(((GlTexture) this).type, 0,
			      ((GlTexture) this).format, anInt5563, 0,
			      argument_7_, 5121, argument_6_, 0);
	OpenGL.glPixelStorei(3317, 4);
	this.setLinearMagnification(true);
    }
    
    public final void detachFBO(int argument_8_) {
        if (argument_8_ != -1)
            aClass166_5564 = null;
    }
    
    final void method2495(byte argument_9_, boolean argument_10_) {
	((GlTexture) this).myGLRenderer.bindTexture(this);
	OpenGL.glTexParameteri(((GlTexture) this).type, 10242,
			       !argument_10_ ? 33071 : 10497);
    }
}
