/* Class196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class196
{
    private GlToolkitNr1Program aGlToolkitNr1Program_1434;
    static Class207 aClass207_1435 = new Class207(52, 15);
    private GlToolkit aClass_ha_Sub3_1436;
    static Class320 aClass320_1437 = new Class320(3);
    static Class244 aClass244_1438;
    
    final boolean method2901(byte argument_0_) {
	if (argument_0_ != 36)
	    aClass_ha_Sub3_1436 = null;
	if (((GlToolkit) aClass_ha_Sub3_1436).haveFBO
	    && ((GlToolkit) aClass_ha_Sub3_1436).haveFragmentShader
	    && aGlToolkitNr1Program_1434 == null) {
	    GlToolkitNr1Shader glToolkitNr1Shader
		= (GlToolkitNr1Shader.compile(35632, aClass_ha_Sub3_1436, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
	    if (glToolkitNr1Shader != null)
		aGlToolkitNr1Program_1434
		    = GlToolkitNr1Program.link(new GlToolkitNr1Shader[]{glToolkitNr1Shader}, aClass_ha_Sub3_1436);
	}
	if (aGlToolkitNr1Program_1434 == null)
	    return false;
	return true;
    }
    
    static final boolean method2902
	(int argument, int[] argument_1_, int argument_2_, int argument_3_,
	 int argument_4_, int argument_5_, int argument_6_, int argument_7_) {
	if (argument_5_ < 0)
	    argument_5_ = 0;
	if (Class25.anInt164 < argument_6_)
	    argument_6_ = Class25.anInt164;
	if (argument_6_ <= argument_5_)
	    return true;
	argument_2_ += argument_5_ - 1;
	argument_7_ = -argument_5_ + argument_6_ >> 2;
	argument_3_ += argument_5_ * argument;
	if (GraphicsToolkit_Sub2.anInt4679 != 1) {
	    argument_3_ -= 38400;
	    while (--argument_7_ >= 0) {
		if (argument_1_[++argument_2_] > argument_3_)
		    return false;
		argument_3_ += argument;
		if (argument_3_ < argument_1_[++argument_2_])
		    return false;
		argument_3_ += argument;
		if (argument_1_[++argument_2_] > argument_3_)
		    return false;
		argument_3_ += argument;
		if (argument_1_[++argument_2_] > argument_3_)
		    return false;
		argument_3_ += argument;
	    }
	    argument_7_ = argument_6_ - argument_5_ & 0x3;
	    while (--argument_7_ >= 0) {
		if (argument_1_[++argument_2_] > argument_3_)
		    return false;
		argument_3_ += argument;
	    }
	} else {
	    Class253_Sub3.anInt5675 += argument_7_;
	    while (--argument_7_ >= 0) {
		if (argument_1_[++argument_2_] > argument_3_)
		    argument_1_[argument_2_] = argument_3_;
		argument_3_ += argument;
		if (argument_1_[++argument_2_] > argument_3_)
		    argument_1_[argument_2_] = argument_3_;
		argument_3_ += argument;
		if (argument_3_ < argument_1_[++argument_2_])
		    argument_1_[argument_2_] = argument_3_;
		argument_3_ += argument;
		if (argument_1_[++argument_2_] > argument_3_)
		    argument_1_[argument_2_] = argument_3_;
		argument_3_ += argument;
	    }
	    argument_7_ = -argument_5_ + argument_6_ & 0x3;
	    while (--argument_7_ >= 0) {
		if (argument_1_[++argument_2_] > argument_3_)
		    argument_1_[argument_2_] = argument_3_;
		argument_3_ += argument;
	    }
	}
	return true;
    }
    
    final boolean method2903(byte argument_8_, float argument_9_,
			     GlTexture_Sub3 argument_10_,
			     GlTexture_Sub3 argument_11_) {
	if (!method2901((byte) 36))
	    return false;
	GlExtFramebuffer glExtFramebuffer
	    = ((GlToolkit) aClass_ha_Sub3_1436).aGlExtFramebuffer_4945;
	DoublyLinkedNode_Sub51_Sub10 class59_sub51_sub10
	    = new DoublyLinkedNode_Sub51_Sub10(aClass_ha_Sub3_1436, 6408,
				      ((GlTexture_Sub3) argument_10_).anInt5565,
				      (((GlTexture_Sub3) argument_10_)
				       .anInt5567));
	aClass_ha_Sub3_1436.method2331(glExtFramebuffer);
	boolean anLocalBoolean = false;
	glExtFramebuffer.method2967(class59_sub51_sub10, 0);
	if (glExtFramebuffer.isComplete()) {
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	    OpenGL.glPushAttrib(2048);
	    OpenGL.glViewport(0, 0, ((GlTexture_Sub3) argument_10_).anInt5565,
			      ((GlTexture_Sub3) argument_10_).anInt5567);
	    OpenGL
		.glUseProgramObjectARB(((GlToolkitNr1Program) aGlToolkitNr1Program_1434).glPtr);
	    OpenGL.glUniform1iARB((OpenGL.glGetUniformLocationARB
				   (((GlToolkitNr1Program) aGlToolkitNr1Program_1434).glPtr,
				    "heightMap")),
				  0);
	    OpenGL.glUniform1fARB((OpenGL.glGetUniformLocationARB
				   (((GlToolkitNr1Program) aGlToolkitNr1Program_1434).glPtr,
				    "rcpRelief")),
				  1.0F / argument_9_);
	    OpenGL.glUniform2fARB
		(OpenGL.glGetUniformLocationARB((((GlToolkitNr1Program) aGlToolkitNr1Program_1434)
						 .glPtr),
						"sampleSize"),
		 1.0F / (float) ((GlTexture_Sub3) argument_11_).anInt5565,
		 1.0F / (float) ((GlTexture_Sub3) argument_11_).anInt5567);
	    for (int anLocalInt = 0;
		 anLocalInt < ((GlTexture_Sub3) argument_10_).anInt5571;
		 anLocalInt++) {
		float f = ((float) anLocalInt
			   / (float) ((GlTexture_Sub3) argument_10_).anInt5571);
		aClass_ha_Sub3_1436.bindTexture(argument_11_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord3f(0.0F, 0.0F, f);
		OpenGL.glVertex2f(0.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 0.0F, f);
		OpenGL.glVertex2f(1.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 1.0F, f);
		OpenGL.glVertex2f(1.0F, 1.0F);
		OpenGL.glTexCoord3f(0.0F, 1.0F, f);
		OpenGL.glVertex2f(0.0F, 1.0F);
		OpenGL.glEnd();
		argument_10_.method2496
		    (true, anLocalInt, 0,
		     ((GlTexture_Sub3) argument_10_).anInt5565, 0,
		     ((GlTexture_Sub3) argument_10_).anInt5567, 0, 0);
	    }
	    OpenGL.glUseProgramObjectARB(0L);
	    OpenGL.glPopAttrib();
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glPopMatrix();
	    anLocalBoolean = true;
	}
	glExtFramebuffer.detachObject(0);
	aClass_ha_Sub3_1436.detachFBO(glExtFramebuffer, false);
	return anLocalBoolean;
    }
    
    public static void method2904(int argument) {
	aClass207_1435 = null;
	aClass244_1438 = null;
	aClass320_1437 = null;
    }
    
    Class196(GlToolkit argument_12_) {
	aClass_ha_Sub3_1436 = argument_12_;
    }
}
