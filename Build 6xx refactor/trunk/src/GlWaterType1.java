/* Class353_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class GlWaterType1 extends Class353 {
    private Class208 aClass208_5513;
    private GlToolkitNr1Program aGlToolkitNr1Program_5514;
    private boolean aBoolean5515;
    private boolean aBoolean5516 = false;

    final void method3891(int argument_0_) {
        if (argument_0_ != -1756)
            aBoolean5516 = false;
        if (aBoolean5516) {
            ((Class353) this).toolkit.setActiveTextureUnit(1);
            ((Class353) this).toolkit.bind(null);
            ((Class353) this).toolkit.setActiveTextureUnit(0);
            ((Class353) this).toolkit.bind(null);
            OpenGL.glUseProgramObjectARB(0L);
            aBoolean5516 = false;
        }
    }

    final void method3885(int argument_3_, boolean argument_4_) {
        if (argument_3_ != 0)
            Statics.method3911(-31, -128, 99);
    }

    final void method3882(int argument_8_, GlTexture argument_9_, int argument_10_) {
        if (argument_8_ != 9)
            aGlToolkitNr1Program_5514 = null;
        if (!aBoolean5516) {
            ((Class353) this).toolkit.bindTexture(argument_9_);
            ((Class353) this).toolkit.setCombineMode(argument_10_);
        }
    }

    final boolean method3890(int argument_11_) {
        if (argument_11_ != -6808)
            return false;
        return false;
    }

    final void configure(int argument_12_, int argument_13_, int argument_14_) {
        if (argument_12_ > 122) {
            if (aBoolean5516) {
                int anLocalInt = 1 << (argument_13_ & 0x3);
                float f = (float) (1 << ((argument_13_ & 0x3f) >> 3)) / 32.0F;
                int anLocalInt_15_ = argument_14_ & 0xffff;
                float f_16_ = (float) (argument_14_ >> 16 & 0x3) / 8.0F;
                long l = ((GlToolkitNr1Program) aGlToolkitNr1Program_5514).glPtr;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"), ((float) ((((GlToolkit) (((Class353) this).toolkit)).anInt4850) * anLocalInt % 40000) / 40000.0F));
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"), f);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"), (float) anLocalInt_15_);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_16_);
            }
        }
    }

    GlWaterType1(GlToolkit argument_17_, Class208 argument_18_) {
        super(argument_17_);
        aBoolean5515 = false;
        aClass208_5513 = argument_18_;
        if (((Class208) aClass208_5513).aClass142_Sub3_1495 != null && (((GlToolkit) ((Class353) this).toolkit).haveVertexShader) && (((GlToolkit) ((Class353) this).toolkit).haveFragmentShader)) {
            GlToolkitNr1Shader glToolkitNr1Shader = (GlToolkitNr1Shader.compile(35633, ((Class353) this).toolkit, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
            GlToolkitNr1Shader glToolkitNr1Shader_19_ = (GlToolkitNr1Shader.compile(35632, ((Class353) this).toolkit, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
            aGlToolkitNr1Program_5514 = GlToolkitNr1Program.link(new GlToolkitNr1Shader[]{glToolkitNr1Shader, glToolkitNr1Shader_19_}, (((Class353) this).toolkit));
            aBoolean5515 = aGlToolkitNr1Program_5514 != null;
        }
    }

    final void bind(boolean argument_22_, boolean argument_23_) {
        GlCubeMap class142_sub1 = ((Class353) this).toolkit.method2311(1);
        if (aBoolean5515 && class142_sub1 != null) {
            ((Class353) this).toolkit.setActiveTextureUnit(1);
            ((Class353) this).toolkit.bindTexture(class142_sub1);
            ((Class353) this).toolkit.setActiveTextureUnit(0);
            ((Class353) this).toolkit.bindTexture(((Class208) aClass208_5513).aClass142_Sub3_1495);
            long l = ((GlToolkitNr1Program) aGlToolkitNr1Program_5514).glPtr;
            OpenGL.glUseProgramObjectARB(l);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"), -(((GlToolkit) ((Class353) this).toolkit).sunDirection[0]), -(((GlToolkit) ((Class353) this).toolkit).sunDirection[1]), -(((GlToolkit) ((Class353) this).toolkit).sunDirection[2]));
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l, "sunColour"), (((GlToolkit) ((Class353) this).toolkit).lightRed), (((GlToolkit) ((Class353) this).toolkit).lightGreen), (((GlToolkit) ((Class353) this).toolkit).lightBlue), 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "sunExponent"), Math.abs(((GlToolkit) ((Class353) this).toolkit).sunDirection[1]) * 928.0F + 96.0F);
            aBoolean5516 = true;
        }
        if (argument_23_)
            method3885(77, false);
    }
}
