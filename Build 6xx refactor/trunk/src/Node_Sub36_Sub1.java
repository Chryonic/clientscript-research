/* Class59_Sub36_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Node_Sub36_Sub1 extends Node_Sub36
{
    static int anInt6098 = 2;
    private GlToolkitNr1Program aGlToolkitNr1Program_6099;
    private int anInt6100;
    private GlToolkitNr1Program aGlToolkitNr1Program_6101;
    static int[] anIntArray6102;
    private GlTexture_Sub4 aClass142_Sub4_6103;
    private int anInt6104;
    private int anInt6105;
    private GlToolkitNr1Program aGlToolkitNr1Program_6106;
    private GlTexture_Sub4[] aClass142_Sub4Array6107;
    private GlExtFramebuffer aGlExtFramebuffer_6108;
    static IKeyMessage[] keyMessages = new IKeyMessage[75];
    private GlExtFramebuffer aGlExtFramebuffer_6110;
    private int anInt6111;
    private GlToolkitNr1Program aGlToolkitNr1Program_6112;
    private GlTexture_Sub4 aClass142_Sub4_6113;
    
    final void method1043(byte argument_0_, GlTexture_Sub4 argument_1_,
			  int argument_2_, GlTexture_Sub4 argument_3_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (aClass142_Sub4Array6107 != null) {
	    ((Node_Sub36) this).aClass_ha_Sub3_4162
		.method2331(aGlExtFramebuffer_6108);
	    int anLocalInt = Class392.method4142(anInt6111, false);
	    int anLocalInt_4_ = Class392.method4142(anInt6105, false);
	    int anLocalInt_5_ = 0;
	    while (anLocalInt > 256 || anLocalInt_4_ > 256) {
		OpenGL.glViewport(0, 0, anLocalInt, anLocalInt_4_);
		aGlExtFramebuffer_6108.method2962(0, (aClass142_Sub4Array6107
					   [anLocalInt_5_]));
		if (anLocalInt_5_ == 0) {
		    ((Node_Sub36) this).aClass_ha_Sub3_4162
			.bindTexture(argument_3_);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) anInt6111, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) anInt6111, (float) anInt6105);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, (float) anInt6105);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    ((Node_Sub36) this).aClass_ha_Sub3_4162.bindTexture(aClass142_Sub4Array6107[anLocalInt_5_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (anLocalInt_4_ > 256)
		    anLocalInt_4_ >>= 1;
		if (anLocalInt > 256)
		    anLocalInt >>= 1;
		anLocalInt_5_++;
	    }
	    ((Node_Sub36) this).aClass_ha_Sub3_4162
		.detachFBO(aGlExtFramebuffer_6108, false);
	    ((Node_Sub36) this).aClass_ha_Sub3_4162.bindTexture(aClass142_Sub4Array6107[anLocalInt_5_ - 1]);
	    ((Node_Sub36) this).aClass_ha_Sub3_4162
		.method2331(aGlExtFramebuffer_6110);
	    aGlExtFramebuffer_6110.draw(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    long l = ((GlToolkitNr1Program) aGlToolkitNr1Program_6099).glPtr;
	    OpenGL.glUseProgramObjectARB(l);
	    OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "sceneTex"), 0);
	    OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "params"), Class46_Sub1.aFloat3837, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    ((Node_Sub36) this).aClass_ha_Sub3_4162.bindTexture(argument_3_);
	    ((Node_Sub36) this).aClass_ha_Sub3_4162
		.method2331(aGlExtFramebuffer_6110);
	    aGlExtFramebuffer_6110.draw(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    long l = ((GlToolkitNr1Program) aGlToolkitNr1Program_6112).glPtr;
	    OpenGL.glUseProgramObjectARB(l);
	    OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l,
								 "sceneTex"),
				  0);
	    OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "params"),
				  Class46_Sub1.aFloat3837, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) anInt6111, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) anInt6111, (float) anInt6105);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) anInt6105);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	aGlExtFramebuffer_6110.draw(1);
	((Node_Sub36) this).aClass_ha_Sub3_4162
	    .bindTexture(aClass142_Sub4_6113);
	long l = ((GlToolkitNr1Program) aGlToolkitNr1Program_6101).glPtr;
	OpenGL.glUseProgramObjectARB(l);
	OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "baseTex"), 0);
	OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "step"),
			      0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	aGlExtFramebuffer_6110.draw(0);
	((Node_Sub36) this).aClass_ha_Sub3_4162
	    .bindTexture(aClass142_Sub4_6103);
	OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "step"), 0.0F,
			      0.00390625F, 0.0F);
	if (argument_0_ >= 53) {
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	    OpenGL.glPopAttrib();
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	    ((Node_Sub36) this).aClass_ha_Sub3_4162
		.detachFBO(aGlExtFramebuffer_6110, false);
	    long l_6_ = ((GlToolkitNr1Program) aGlToolkitNr1Program_6106).glPtr;
	    OpenGL.glUseProgramObjectARB(l_6_);
	    OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l_6_,
								 "sceneTex"),
				  0);
	    OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l_6_,
								 "bloomTex"),
				  1);
	    OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l_6_,
								 "params"),
				  Statics.aFloat6377,
				  Class204.aFloat1458, 0.0F);
	    ((Node_Sub36) this).aClass_ha_Sub3_4162.setActiveTextureUnit(1);
	    ((Node_Sub36) this).aClass_ha_Sub3_4162
		.bindTexture(aClass142_Sub4_6113);
	    ((Node_Sub36) this).aClass_ha_Sub3_4162.setActiveTextureUnit(0);
	    ((Node_Sub36) this).aClass_ha_Sub3_4162.bindTexture(argument_3_);
	}
    }
    
    final void method1048(int argument_7_, byte argument_8_) {
	OpenGL.glUseProgramObjectARB(0L);
	((Node_Sub36) this).aClass_ha_Sub3_4162.setActiveTextureUnit(1);
	((Node_Sub36) this).aClass_ha_Sub3_4162.bind(null);
	if (argument_8_ > -127)
	    method1052(-20);
	((Node_Sub36) this).aClass_ha_Sub3_4162.setActiveTextureUnit(0);
    }
    
    Node_Sub36_Sub1(GlToolkit argument_9_) {
	super(argument_9_);
    }
    
    final boolean method1044(int argument_10_) {
	if ((((GlToolkit) ((Node_Sub36) this).aClass_ha_Sub3_4162)
	     .haveFBO)
	    && (((GlToolkit) ((Node_Sub36) this).aClass_ha_Sub3_4162)
		.haveFragmentShader)
	    && (((GlToolkit) ((Node_Sub36) this).aClass_ha_Sub3_4162)
		.haveTextureFloat)) {
	    aGlExtFramebuffer_6110
		= new GlExtFramebuffer(((Node_Sub36) this).aClass_ha_Sub3_4162);
	    aClass142_Sub4_6113
		= new GlTexture_Sub4(((Node_Sub36) this).aClass_ha_Sub3_4162,
				    3553, 34842, 256, 256);
	    aClass142_Sub4_6113.setWrappingMode(false, false);
	    aClass142_Sub4_6103
		= new GlTexture_Sub4(((Node_Sub36) this).aClass_ha_Sub3_4162,
				    3553, 34842, 256, 256);
	    aClass142_Sub4_6103.setWrappingMode(false, false);
	    ((Node_Sub36) this).aClass_ha_Sub3_4162
		.method2331(aGlExtFramebuffer_6110);
	    aGlExtFramebuffer_6110.method2962(0, aClass142_Sub4_6113);
	    aGlExtFramebuffer_6110.method2962(1, aClass142_Sub4_6103);
	    aGlExtFramebuffer_6110.draw(0);
	    if (!aGlExtFramebuffer_6110.isComplete()) {
		((Node_Sub36) this).aClass_ha_Sub3_4162
		    .detachFBO(aGlExtFramebuffer_6110, false);
		return false;
	    }
	    ((Node_Sub36) this).aClass_ha_Sub3_4162
		.detachFBO(aGlExtFramebuffer_6110, false);
	    aGlToolkitNr1Program_6112
		= (GlToolkitNr1Program.link((new GlToolkitNr1Shader[]{GlToolkitNr1Shader.compile(35632, ((Node_Sub36) this).aClass_ha_Sub3_4162, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")}), ((Node_Sub36) this).aClass_ha_Sub3_4162));
	    aGlToolkitNr1Program_6099
		= (GlToolkitNr1Program.link((new GlToolkitNr1Shader[]{GlToolkitNr1Shader.compile(35632, ((Node_Sub36) this).aClass_ha_Sub3_4162, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")}), ((Node_Sub36) this).aClass_ha_Sub3_4162));
	    aGlToolkitNr1Program_6106
		= (GlToolkitNr1Program.link((new GlToolkitNr1Shader[]{GlToolkitNr1Shader.compile(35632, ((Node_Sub36) this).aClass_ha_Sub3_4162, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")}), ((Node_Sub36) this).aClass_ha_Sub3_4162));
	    aGlToolkitNr1Program_6101
		= (GlToolkitNr1Program.link((new GlToolkitNr1Shader[]{GlToolkitNr1Shader.compile(35632, ((Node_Sub36) this).aClass_ha_Sub3_4162, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")}), ((Node_Sub36) this).aClass_ha_Sub3_4162));
	    if (aGlToolkitNr1Program_6099 == null || aGlToolkitNr1Program_6112 == null
		|| aGlToolkitNr1Program_6106 == null || aGlToolkitNr1Program_6101 == null)
		return false;
	    return true;
	}
	if (argument_10_ != 9752)
	    method1052(45);
	return false;
    }
    
    final int method1046(int argument_11_) {
	if (argument_11_ != 1)
	    method1054(false);
	return 1;
    }
    
    final boolean method1053(int argument_12_) {
	if (!(((GlToolkit) ((Node_Sub36) this).aClass_ha_Sub3_4162)
	      .haveFBO)
	    || !(((GlToolkit) ((Node_Sub36) this).aClass_ha_Sub3_4162)
		 .haveFragmentShader)
	    || !(((GlToolkit) ((Node_Sub36) this).aClass_ha_Sub3_4162)
		 .haveTextureFloat))
	    return false;
	return true;
    }
    
    final void method1051(int argument_13_) {
	aGlToolkitNr1Program_6101 = null;
	aGlToolkitNr1Program_6106 = null;
	aClass142_Sub4_6113 = null;
	aGlExtFramebuffer_6110 = null;
	aGlExtFramebuffer_6108 = null;
	aGlToolkitNr1Program_6099 = null;
	aClass142_Sub4Array6107 = null;
	aGlToolkitNr1Program_6112 = null;
	aClass142_Sub4_6103 = null;
    }
    
    public static void method1054(boolean argument) {
	keyMessages = null;
	anIntArray6102 = null;
    }
    
    final boolean method1052(int argument_14_) {
	if (argument_14_ != 256)
	    method1051(-85);
	if (aGlExtFramebuffer_6110 == null)
	    return false;
	return true;
    }
    
    final void method1045(int argument_15_, int argument_16_,
			  int argument_17_) {
	if (argument_15_ == 1) {
	    anInt6105 = argument_16_;
	    anInt6111 = argument_17_;
	    int anLocalInt = Class392.method4142(anInt6111, false);
	    int anLocalInt_18_ = Class392.method4142(anInt6105, false);
	    if (anLocalInt != anInt6100 || anInt6104 != anLocalInt_18_) {
		if (aClass142_Sub4Array6107 != null) {
		    for (int anLocalInt_19_ = 0;
			 anLocalInt_19_ < aClass142_Sub4Array6107.length;
			 anLocalInt_19_++)
			aClass142_Sub4Array6107[anLocalInt_19_]
			    .deleteFromServer();
		    aClass142_Sub4Array6107 = null;
		}
		if (anLocalInt <= 256 && anLocalInt_18_ <= 256)
		    aGlExtFramebuffer_6108 = null;
		else {
		    int anLocalInt_20_ = anLocalInt;
		    int anLocalInt_21_ = anLocalInt_18_;
		    int anLocalInt_22_ = 0;
		    if (aGlExtFramebuffer_6108 == null)
			aGlExtFramebuffer_6108 = new GlExtFramebuffer(((Node_Sub36) this)
						      .aClass_ha_Sub3_4162);
		    while (anLocalInt_20_ > 256 || anLocalInt_21_ > 256) {
			if (anLocalInt_21_ > 256)
			    anLocalInt_21_ >>= 1;
			if (anLocalInt_20_ > 256)
			    anLocalInt_20_ >>= 1;
			anLocalInt_22_++;
		    }
		    anLocalInt_20_ = anLocalInt;
		    anLocalInt_21_ = anLocalInt_18_;
		    aClass142_Sub4Array6107
			= new GlTexture_Sub4[anLocalInt_22_];
		    anLocalInt_22_ = 0;
		    while (anLocalInt_20_ > 256 || anLocalInt_21_ > 256) {
			aClass142_Sub4Array6107[anLocalInt_22_++]
			    = new GlTexture_Sub4((((Node_Sub36) this)
						 .aClass_ha_Sub3_4162),
						3553, 34842, anLocalInt_20_,
						anLocalInt_21_);
			if (anLocalInt_20_ > 256)
			    anLocalInt_20_ >>= 1;
			if (anLocalInt_21_ > 256)
			    anLocalInt_21_ >>= 1;
		    }
		}
		anInt6104 = anLocalInt_18_;
		anInt6100 = anLocalInt;
	    }
	}
    }
}
