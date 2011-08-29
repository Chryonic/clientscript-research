/* OpenGL - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;

import java.awt.Canvas;
import java.util.Hashtable;

@SuppressWarnings({"UnusedDeclaration"})
public class OpenGL {
    private Thread thread;
    private Hashtable glCapabilities;
    long aLong3417;
    private static Hashtable glContexts = new Hashtable();

    public static native void glPixelStorei(int argument, int argument_0_);

    public static native void glMultiTexCoord2i(int argument, int argument_1_, int argument_2_);

    public static native void glLinkProgramARB(long argument);

    public static native void glCullFace(int argument);

    public static native void glRenderbufferStorageMultisampleEXT(int argument, int argument_3_, int argument_4_, int argument_5_, int argument_6_);

    public final native long prepareSurface(Canvas argument_7_);

    public static native void glReadPixelsub(int argument, int argument_8_, int argument_9_, int argument_10_, int argument_11_, int argument_12_, byte[] argument_13_, int argument_14_);

    public static native void glColor3f(float argument, float argument_15_, float argument_16_);

    public static native void glProgramStringARB(int argument, int argument_17_, String argument_18_);

    public static native void glBufferDataARBub(int argument, int argument_19_, byte[] argument_20_, int argument_21_, int argument_22_);

    public static native void glUniform4fARB(int argument, float argument_23_, float argument_24_, float argument_25_, float argument_26_);

    public static native void glTexCoordPointer(int argument, int argument_27_, int argument_28_, long argument_29_);

    public static native void glTexCoord2i(int argument, int argument_30_);

    public static native void glDeleteTextures(int argument, int[] argument_31_, int argument_32_);

    private native void detachPeer();

    public static native void glPixelTransferf(int argument, float argument_33_);

    public static native void glFogi(int argument, int argument_34_);

    public static native void glDeleteRenderbuffersEXT(int argument, int[] argument_35_, int argument_36_);

    public static native void glClearDepth(float argument);

    public static native void glNewList(int argument, int argument_37_);

    public static native void glGetInfoLogARB(long argument, int argument_38_, int[] argument_39_, int argument_40_, byte[] argument_41_, int argument_42_);

    public static native void glMaterialfv(int argument, int argument_43_, float[] argument_44_, int argument_45_);

    public static native void glDisable(int argument);

    public static native int glGenProgramARB();

    public static native void glPointSize(float argument);

    public static native void glTexImage2Di(int argument, int argument_46_, int argument_47_, int argument_48_, int argument_49_, int argument_50_, int argument_51_, int argument_52_, int[] argument_53_, int argument_54_);

    public final native void release();

    public static native void glAttachObjectARB(long argument, long argument_55_);

    public static native void glMultMatrixf(float[] argument, int argument_56_);

    public static native void glDisableClientState(int argument);

    public static native void glUniform2fARB(int argument, float argument_57_, float argument_58_);

    public final synchronized boolean releaseThread() {
        if (thread != Thread.currentThread())
            return false;
        detachPeer();
        glContexts.remove(thread);
        thread = null;
        return true;
    }

    public static native void glLineWidth(float argument);

    public static native void glLoadIdentity();

    public static native void glVertexPointer(int argument, int argument_59_, int argument_60_, long argument_61_);

    public static native void glDeleteLists(int argument, int argument_62_);

    public static native void glAlphaFunc(int argument, float argument_63_);

    public static native void glGenRenderbuffersEXT(int argument, int[] argument_64_, int argument_65_);

    public static native void glFrustum(double argument, double argument_66_, double argument_67_, double argument_68_, double argument_69_, double argument_70_);

    public static native void glGetProgramivARB(int argument, int argument_71_, int[] argument_72_, int argument_73_);

    public static native void glPushAttrib(int argument);

    public static native void glTexImage2Df(int argument, int argument_74_, int argument_75_, int argument_76_, int argument_77_, int argument_78_, int argument_79_, int argument_80_, float[] argument_81_, int argument_82_);

    public static native void glDrawArrays(int argument, int argument_83_, int argument_84_);

    public static native void glFinish();

    public static native void glRotatef(float argument, float argument_85_, float argument_86_, float argument_87_);

    public static native void glColor3ub(byte argument, byte argument_88_, byte argument_89_);

    public static native void glGetFloatv(int argument, float[] argument_90_, int argument_91_);

    public static native void glVertex2f(float argument, float argument_92_);

    public final native void releasePbuffer(long argument_93_);

    public static native void glClear(int argument);

    public static native int glGenLists(int argument);

    public static native void glFlush();

    public static native int glGetUniformLocationARB(long argument, String argument_94_);

    public static native void glTexParameterf(int argument, int argument_95_, float argument_96_);

    public static native void glMatrixMode(int argument);

    public static native void glBindTexture(int argument, int argument_97_);

    public static native void glPopAttrib();

    public static native void glBindRenderbufferEXT(int argument, int argument_98_);

    public static native void glLightf(int argument, int argument_99_, float argument_100_);

    public static native void glShadeModel(int argument);

    public static native void glCopyTexImage2D(int argument, int argument_101_, int argument_102_, int argument_103_, int argument_104_, int argument_105_, int argument_106_, int argument_107_);

    public static native void glTexCoord3i(int argument, int argument_108_, int argument_109_);

    public static native void glColorPointer(int argument, int argument_110_, int argument_111_, long argument_112_);

    public static native void glEnableClientState(int argument);

    public static native void glGetTexImageub(int argument, int argument_113_, int argument_114_, int argument_115_, byte[] argument_116_, int argument_117_);

    public static native void glGenFramebuffersEXT(int argument, int[] argument_118_, int argument_119_);

    public static native void glRenderbufferStorageEXT(int argument, int argument_120_, int argument_121_, int argument_122_);

    public static native void glGetObjectParameterivARB(long argument, int argument_123_, int[] argument_124_, int argument_125_);

    public static native void glReadBuffer(int argument);

    public static native void glShaderSourceRawARB(long argument, byte[] argument_126_);

    public static native void glBufferSubDataARBub(int argument, int argument_127_, int argument_128_, byte[] argument_129_, int argument_130_);

    public static native void glTexEnvf(int argument, int argument_131_, float argument_132_);

    public static native void glUniformMatrix2fvARB(int argument, int argument_133_, boolean argument_134_, float[] argument_135_, int argument_136_);

    public static native void glBlitFramebufferEXT(int argument, int argument_137_, int argument_138_, int argument_139_, int argument_140_, int argument_141_, int argument_142_, int argument_143_, int argument_144_, int argument_145_);

    public static native void glPushMatrix();

    public static native void glTexCoord3f(float argument, float argument_146_, float argument_147_);

    public static native void glDrawPixelsub(int argument, int argument_148_, int argument_149_, int argument_150_, byte[] argument_151_, int argument_152_);

    public static native void glDepthMask(boolean argument);

    public static native void glColor4ub(byte argument, byte argument_153_, byte argument_154_, byte argument_155_);

    public static native void glShaderSourceARB(long argument, String argument_156_);

    public static native void glGenTextures(int argument, int[] argument_157_, int argument_158_);

    public static native void glDrawBuffer(int argument);

    public final native void setSwapInterval(int argument_159_);

    public static native void glProgramLocalParameter4fvARB(int argument, int argument_160_, float[] argument_161_, int argument_162_);

    public static native void glNormal3f(float argument, float argument_163_, float argument_164_);

    public static native void glCallList(int argument);

    public final boolean hasCapability(String name) {
        if (glCapabilities == null) {
            glCapabilities = new Hashtable();
            String string = glGetString(7939);
            int anLocalInt = 0;
            for (; ; ) {
                int spaceIdx = string.indexOf(' ', anLocalInt);
                if (spaceIdx == -1)
                    break;
                String string_167_ = string.substring(anLocalInt, spaceIdx).trim();
                anLocalInt = spaceIdx + 1;
                if (string_167_.length() != 0)
                    glCapabilities.put(string_167_, string_167_);
            }
            String _name = string.substring(anLocalInt).trim();
            if (_name.length() != 0)
                glCapabilities.put(_name, _name);
        }
        return glCapabilities.containsKey(name );
    }

    public static native void glMultiTexCoord3i(int argument, int argument_169_, int argument_170_, int argument_171_);

    public static native void glFramebufferRenderbufferEXT(int argument, int argument_172_, int argument_173_, int argument_174_);

    public static native String glGetString(int argument);

    public static native void glUniformMatrix3fvARB(int argument, int argument_175_, boolean argument_176_, float[] argument_177_, int argument_178_);

    public static native void glTexSubImage2Df(int argument, int argument_179_, int argument_180_, int argument_181_, int argument_182_, int argument_183_, int argument_184_, int argument_185_, float[] argument_186_, int argument_187_);

    public static native void glTexImage1Dub(int argument, int argument_188_, int argument_189_, int argument_190_, int argument_191_, int argument_192_, int argument_193_, byte[] argument_194_, int argument_195_);

    public static native void glGetIntegerv(int argument, int[] argument_196_, int argument_197_);

    public static native int glGetError();

    public final native void surfaceResized(long argument_198_);

    public static native void glTexSubImage2Di(int argument, int argument_199_, int argument_200_, int argument_201_, int argument_202_, int argument_203_, int argument_204_, int argument_205_, int[] argument_206_, int argument_207_);

    public static native void glDrawPixelsi(int argument, int argument_208_, int argument_209_, int argument_210_, int[] argument_211_, int argument_212_);

    public static native void glFramebufferTexture3DEXT(int argument, int argument_213_, int argument_214_, int argument_215_, int argument_216_, int argument_217_);

    public final native void setPbuffer(long argument_218_);

    public static native void glTexImage3Dub(int argument, int argument_219_, int argument_220_, int argument_221_, int argument_222_, int argument_223_, int argument_224_, int argument_225_, int argument_226_, byte[] argument_227_, int argument_228_);

    public static native int glCheckFramebufferStatusEXT(int argument);

    public static native void glTexGeni(int argument, int argument_229_, int argument_230_);

    public static native void glTexParameteri(int argument, int argument_231_, int argument_232_);

    public static native void glEnable(int argument);

    public static native void glGenerateMipmapEXT(int argument);

    public static native void glRasterPos2i(int argument, int argument_233_);

    public static native void glBlendFunc(int argument, int argument_234_);

    public static native void glFogf(int argument, float argument_235_);

    public static native void glTexCoord2f(float argument, float argument_236_);

    public static native void glBufferSubDataARBa(int argument, int argument_237_, int argument_238_, long argument_239_);

    public static native void glBufferDataARBa(int argument, int argument_240_, long argument_241_, int argument_242_);

    public static native void glScissor(int argument, int argument_243_, int argument_244_, int argument_245_);

    public static native void glCopyPixels(int argument, int argument_246_, int argument_247_, int argument_248_, int argument_249_);

    public static native void glMultiTexCoord2f(int argument, float argument_250_, float argument_251_);

    public static native void glTexGenfv(int argument, int argument_252_, float[] argument_253_, int argument_254_);

    public static native void glStencilFunc(int argument, int argument_255_, int argument_256_);

    public static native void glBindBufferARB(int argument, int argument_257_);

    public final synchronized boolean assignThread() {
        Thread thread = Thread.currentThread();
        if (attachPeer()) {
            OpenGL opengl = (OpenGL) glContexts.put(thread, this);
            if (opengl != null)
                opengl.thread = null;
            this.thread = thread;
            return true;
        }
        return false;
    }

    public static native void glCopyTexSubImage2D(int argument, int argument_258_, int argument_259_, int argument_260_, int argument_261_, int argument_262_, int argument_263_, int argument_264_);

    public static native void glNormalPointer(int argument, int argument_265_, long argument_266_);

    private native boolean attachPeer();

    public static native void glScalef(float argument, float argument_267_, float argument_268_);

    public static native void glPolygonMode(int argument, int argument_269_);

    public static native void glBindFramebufferEXT(int argument, int argument_270_);

    public static native void glPixelZoom(float argument, float argument_271_);

    public static native void glTexImage2Dub(int argument, int argument_272_, int argument_273_, int argument_274_, int argument_275_, int argument_276_, int argument_277_, int argument_278_, byte[] argument_279_, int argument_280_);

    public static native void glBegin(int argument);

    public final native long createPbuffer(int argument_281_, int argument_282_);

    public static native long glCreateProgramObjectARB();

    public static native void glFramebufferTexture2DEXT(int argument, int argument_283_, int argument_284_, int argument_285_, int argument_286_);

    public static native void glProgramLocalParameter4fARB(int argument, int argument_287_, float argument_288_, float argument_289_, float argument_290_, float argument_291_);

    public static native void glDeleteFramebuffersEXT(int argument, int[] argument_292_, int argument_293_);

    public static native void glPopMatrix();

    public static native void glOrtho(double argument, double argument_294_, double argument_295_, double argument_296_, double argument_297_, double argument_298_);

    public static native void glDeleteBuffersARB(int argument, int[] argument_299_, int argument_300_);

    public static native void glFogfv(int argument, float[] argument_301_, int argument_302_);

    public static native void glBindProgramARB(int argument, int argument_303_);

    public static native void glDrawBuffersARB(int argument, int[] argument_304_, int argument_305_);

    public static native void glEndList();

    public static native void glColorMask(boolean argument, boolean argument_306_, boolean argument_307_, boolean argument_308_);

    public static native void glCopyTexSubImage3D(int argument, int argument_309_, int argument_310_, int argument_311_, int argument_312_, int argument_313_, int argument_314_, int argument_315_, int argument_316_);

    public static native void glUniformMatrix4fvARB(int argument, int argument_317_, boolean argument_318_, float[] argument_319_, int argument_320_);

    public static native void glActiveTexture(int argument);

    public static native void glEnd();

    public static native void glTexEnvfv(int argument, int argument_321_, float[] argument_322_, int argument_323_);

    public static native void glTranslatef(float argument, float argument_324_, float argument_325_);

    public static native void glUniform3fARB(int argument, float argument_326_, float argument_327_, float argument_328_);

    public static native void glStencilOp(int argument, int argument_329_, int argument_330_);

    public static native void glTexEnvi(int argument, int argument_331_, int argument_332_);

    public static native void glUniform1fARB(int argument, float argument_333_);

    public final native void swapBuffers();

    public static native void glLightfv(int argument, int argument_334_, float[] argument_335_, int argument_336_);

    public static native long glCreateShaderObjectARB(int argument);

    public final native boolean arePbuffersAvailable();

    public static native void glCompileShaderARB(long argument);

    public static native void glHint(int argument, int argument_337_);

    public static native void glVertex3f(float argument, float argument_338_, float argument_339_);

    public static native void glDeleteProgramARB(int argument);

    public static native void glDeleteObjectARB(long argument);

    public static native void glClearColor(float argument, float argument_340_, float argument_341_, float argument_342_);

    public static native void glReadPixelsi(int argument, int argument_343_, int argument_344_, int argument_345_, int argument_346_, int argument_347_, int[] argument_348_, int argument_349_);

    public static native void glTexSubImage2Dub(int argument, int argument_350_, int argument_351_, int argument_352_, int argument_353_, int argument_354_, int argument_355_, int argument_356_, byte[] argument_357_, int argument_358_);

    public final native long init(Canvas argument_359_, int argument_360_, int argument_361_, int argument_362_, int argument_363_, int argument_364_, int argument_365_);

    public static native void glGenBuffersARB(int argument, int[] argument_366_, int argument_367_);

    public static native void glProgramRawARB(int argument, int argument_368_, byte[] argument_369_);

    public static native void glLoadMatrixf(float[] argument, int argument_370_);

    public static native void glGetTexImagei(int argument, int argument_371_, int argument_372_, int argument_373_, int[] argument_374_, int argument_375_);

    public static native void glUniform1iARB(int argument, int argument_376_);

    public final native void releaseSurface(Canvas argument_377_, long argument_378_);

    public static native void glUseProgramObjectARB(long argument);

    public final native boolean setSurface(long argument_379_);

    static native boolean glUnmapBufferARB(int argument);

    public static native void glViewport(int argument, int argument_380_, int argument_381_, int argument_382_);

    public static native void glClientActiveTexture(int argument);

    public static native void glDetachObjectARB(long argument, long argument_383_);

    public static native void glColor4f(float argument, float argument_384_, float argument_385_, float argument_386_);

    public static native void glLightModelfv(int argument, float[] argument_387_, int argument_388_);

    public static native void glVertex2i(int argument, int argument_389_);

    public static native void glDepthFunc(int argument);

    public static native void glColorMaterial(int argument, int argument_390_);

    public static native void glDrawElements(int argument, int argument_391_, int argument_392_, long argument_393_);

    static native long glMapBufferARB(int argument, int argument_394_);
}
