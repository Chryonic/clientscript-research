/* Class353_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class GlWaterType0 extends Class353 {
    private GlToolkitNr1Program program;
    private Class208 aClass208_5492;
    private boolean bound = false;
    private boolean makeSucceeded = false;

    final void bind(boolean argument_0_, boolean argument_1_) {
        GlCubeMap class142_sub1 = this.toolkit.method2311(1);
        if (makeSucceeded && class142_sub1 != null) {
            float f = ((-Math.abs(this.toolkit.sunDirection[1]) + 1.0F) * 2.0F + 1.0F);
            this.toolkit.setActiveTextureUnit(1);
            this.toolkit.bindTexture(class142_sub1);
            this.toolkit.setActiveTextureUnit(0);
            this.toolkit.bindTexture(aClass208_5492.aClass142_Sub3_1495);
            long l = program.glPtr;
            OpenGL.glUseProgramObjectARB(l);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"), -(this.toolkit.sunDirection[0]), -(this.toolkit.sunDirection[1]), -(this.toolkit.sunDirection[2]));
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l, "sunColour"), (this.toolkit.lightRed) * f, (this.toolkit.lightGreen) * f, (this.toolkit.lightBlue) * f, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "sunExponent"), Math.abs(this.toolkit.sunDirection[1]) * 928.0F + 64.0F);
            bound = true;
        }
    }

    final void method3891(int argument_2_) {
        if (argument_2_ != -1756)
            Statics.method3902((byte) 8);
        if (bound) {
            this.toolkit.setActiveTextureUnit(1);
            this.toolkit.bind(null);
            this.toolkit.setActiveTextureUnit(0);
            this.toolkit.bind(null);
            OpenGL.glUseProgramObjectARB(0L);
            bound = false;
        }
    }

    final void configure(int argument_3_, int configP1, int configP2) {
        if (bound) {
            int speed = 1 << (configP1 & 0x3);
            float scale = (float) (1 << (configP1 >> 3 & 0x7)) / 32.0F;
            int breakWaterDepth = configP2 & 0xffff;
            float breakWaterOffset = (float) ((configP2 & 0x3b8d1) >> 16) / 8.0F;
            float waveIntensityY = (float) (configP2 >> 19 & 0xf) / 16.0F;
            float waveIntensityX = (float) (configP2 >> 23 & 0xf) / 16.0F;
            int waveExponent = (configP2 & 0x79167e74) >> 27;
            long l = program.glPtr;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"), (float) (this.toolkit.anInt4850 * speed % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"), scale);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"), (float) breakWaterDepth);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), breakWaterOffset);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(l, "waveIntensity"), waveIntensityX, waveIntensityY);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "waveExponent"), (float) waveExponent);
        }
    }

    final void method3882(int argument_11_, GlTexture argument_12_, int argument_13_) {
        if (!bound) {
            this.toolkit.bindTexture(argument_12_);
            this.toolkit.setCombineMode(argument_13_);
        }
        if (argument_11_ != 9)
            KeyHandler.adjustKeymapToJRE();
    }

    final boolean method3890(int argument_14_) {
        if (argument_14_ != -6808)
            return true;
        return makeSucceeded;
    }

    final void method3885(int argument_15_, boolean argument_16_) {
        if (argument_15_ != 0) {
            /* empty */
        }
    }

    GlWaterType0(GlToolkit argument_19_, Class208 argument_20_) {
        super(argument_19_);
        aClass208_5492 = argument_20_;
        if (aClass208_5492.aClass142_Sub3_1495 != null && (this.toolkit.haveVertexShader) && (this.toolkit.haveFragmentShader)) {
            GlToolkitNr1Shader vertexShader = (GlToolkitNr1Shader.compile(35633, this.toolkit, "uniform float time;\n" + "uniform float scale;\n" + "varying vec3 wvVertex;\n" + "varying float waterDepth;\n" + "void main() {\n" + "waterDepth = gl_MultiTexCoord0.z;\n" + "vec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\n" + "wvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\n" + "wvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\n" + "wvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\n" + "gl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\n" + "gl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\n" + "gl_TexCoord[0].z = time;\n" + "gl_TexCoord[0].w = 1.0;\n" + "gl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\n" + "gl_Position = ftransform();\n" + "}\n" + ""));
            GlToolkitNr1Shader fragmentShader = (GlToolkitNr1Shader.compile(35632, this.toolkit, "varying vec3 wvVertex;\n" + "varying float waterDepth;\n" + "uniform vec3 sunDir;\n" + "uniform vec4 sunColour;\n" + "uniform float sunExponent;\n" + "uniform vec2 waveIntensity;\n" + "uniform float waveExponent;\n" + "uniform float breakWaterDepth;\n" + "uniform float breakWaterOffset;\n" + "uniform sampler3D normalSampler;\n" + "uniform samplerCube envMapSampler;\n" + "void main() {\n" + "vec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\n" + "wnNormal.xyz = 2.0*wnNormal.xyz-1.0;\n" + "vec3 wnVector = normalize(wvVertex);\n" + "vec3 wnReflection = reflect(wnVector, wnNormal.xyz);\n" + "vec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\n" + "vec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\n" + "float shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\n" + "float waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\n" + "waveFactor = -4.0*waveFactor*waveFactor+1.0;\n" + "float ndote = dot(wnVector, wnNormal.xyz);\n" + "float fresnel = pow(1.0-abs(ndote), 1.0);\n" + "vec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\n" + "gl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n" + "}\n"));
            program = GlToolkitNr1Program.link(new GlToolkitNr1Shader[]{vertexShader, fragmentShader}, (this.toolkit));
            makeSucceeded = program != null;
        }
    }
}
