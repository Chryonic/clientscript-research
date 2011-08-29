/* Class_ha_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;

import jaggl.OpenGL;

final class GlToolkit extends GraphicsToolkit {
    static float[] glVBuffer = new float[4];
    static int[] deletionBuffer = new int[1000];
    static float[] lightValueBuffer = new float[4];
    private int canvasWidth;
    private OpenGL myGL;
    private int canvasHeight;
    private Canvas myCanvas;
    private long aLong4831;
    private long surfaceId;
    int viewportW;
    private Hashtable canvasTable = new Hashtable();
    private Canvas currentCanvas;
    int viewportH;
    private Node_Sub36_Sub1 aClass59_Sub36_Sub1_4838;
    private Class96 aClass96_4839;
    int anInt4840;
    int anInt4841 = 128;
    private Class90 aClass90_4842 = new Class90();
    private Class65 aClass65_4843;
    private Class107 aClass107_4844;
    private Class350_Sub3 aClass350_Sub3_4845 = new Class350_Sub3();
    Class350_Sub3 aClass350_Sub3_4846 = new Class350_Sub3();
    int anInt4847 = 3;
    Class196 aClass196_4848;
    private boolean aBoolean4849 = false;
    int anInt4850;
    NativeHeap heap;
    int anInt4852 = 8;
    private CyclicLinkedList aCyclicLinkedList_4853 = new CyclicLinkedList();
    private int anInt4854 = -1;
    private GlExtFramebuffer aGlExtFramebuffer_4855;
    private Class368_Sub3 aClass368_Sub3_4856;
    private GlFrameBuffer anGlFrameBuffer_4857;
    private GlFrameBuffer[] anGlFrameBufferArray4858;
    private GlFrameBuffer[] anGlFrameBufferArray4859;
    private int anInt4860 = -1;
    private GlFrameBuffer[] anGlFrameBufferArray4861;
    private int anInt4862;
    private GlFrameBuffer anGlFrameBuffer_4863;
    private CyclicLinkedList displayListDeleteQueue;
    private int renderBufferMemoryUsage;
    int textureMemoryUsage;
    int arbBufferMemoryUsage;
    private CyclicLinkedList arbBufferDeleteQueue;
    private CyclicLinkedList textureDeleteQueue;
    private CyclicLinkedList frameBufferDeleteQueue;
    private CyclicLinkedList renderBufferDeleteQueue;
    private CyclicLinkedList programDeleteQueue;
    private CyclicLinkedList objectDeleteQueue;
    private long aLong4874;
    private boolean aBoolean4875;
    private boolean alphaTestEnabled;
    private boolean colourWritingDisabled;
    private int blendingConfiguration;
    private boolean depthTestEnabled;
    private int graphicsConfiguration;
    Class350_Sub3 aClass350_Sub3_4881;
    private int blendingMode;
    Class350_Sub3 lightingMatrix;
    Class350_Sub3 aClass350_Sub3_4884;
    private boolean aBoolean4885;
    int anInt4886;
    private int alphaCombineMode;
    float lightBlue;
    private boolean fogEnabled;
    private GlArrayBuffer anGlArrayBuffer_4890;
    private boolean aBoolean4891;
    private boolean aBoolean4892;
    private float[] projectionMatrix;
    boolean isMacintosh;
    private boolean lightingEnabled;
    int anInt4896;
    GlInterleavedArray aGlInterleavedArray_4897;
    private float largestPointSize;
    float aFloat4899;
    int anInt4900;
    boolean aBoolean4901;
    boolean haveTextureFloat;
    private boolean haveVBO;
    float light2NegIntensity;
    GlInterleavedArray aGlInterleavedArray_4905;
    boolean isBigEndian;
    boolean haveTexture3D;
    private boolean aBoolean4908;
    private GlArrayBuffer boundArrayBuffer;
    Class167_Sub3 aClass167_Sub3_4910;
    int fogColour;
    Class167_Sub3 aClass167_Sub3_4912;
    private int currentTexture;
    int framebufferFormat;
    float aFloat4915;
    private int maxTextureImageUnits;
    boolean haveVertexShader;
    private HardwareLight[] activeLights;
    Class167_Sub3 aClass167_Sub3_4919;
    int anInt4920;
    private float aFloat4921;
    private int anInt4922;
    int maxTextureUnits;
    private String glVendorString;
    Class167_Sub3 aClass167_Sub3_4925;
    private int scissorXB;
    boolean aBoolean4927;
    Class167_Sub3 aClass167_Sub3_4928;
    float[] sunDirection;
    int anInt4930;
    private boolean aBoolean4931;
    int anInt4932;
    private int usedLightCount;
    float aFloat4934;
    boolean haveFBO;
    private float fogEnd;
    private float[] light1Position;
    private int viewportX;
    private int viewportY;
    private int maxTextureCoords;
    private float[] aFloatArray4941;
    private int scissorX;
    private String glRendererString;
    float lightRed;
    GlExtFramebuffer aGlExtFramebuffer_4945;
    private int scissorYB;
    private float aFloat4947;
    private int glVersion;
    private float[] aFloatArray4949;
    int anInt4950;
    private int anInt4951;
    float aFloat4952;
    boolean haveFragmentShader;
    private int colourCombineMode;
    GlTexture_Sub4 aClass142_Sub4_4955;
    int anInt4956;
    FloatPacket aClass59_Sub28_Sub2_4957;
    Class167_Sub3 aClass167_Sub3_4958;
    private GlSkybox aGlClass67_4959;
    private GlElementBuffer boundElementBuffer;
    float lightGreen;
    Class167_Sub3 aClass167_Sub3_4962;
    boolean haveFBBlit;
    float aFloat4964;
    private int anInt4965;
    boolean haveFBMultisample;
    private float aFloat4967;
    private GlTexture[] textureArray;
    float light1Intensity;
    private int previousUsedLightCount;
    boolean haveTextureRectangle;
    int anInt4972;
    Class167_Sub3 aClass167_Sub3_4973;
    int anInt4974;
    float modelIntensity;
    private boolean incrementalTextureTranslates;
    private boolean havePBuffers;
    float fogStart;
    private int scissorY;
    int anInt4980;
    private GlTexture_Sub4_Sub1 aClass142_Sub4_Sub1_4981;
    private boolean aBoolean4982;
    private float aFloat4983;
    private int projectionMode;
    Class167_Sub3 aClass167_Sub3_4985;
    private boolean haveMultisample;
    Class167_Sub3 aClass167_Sub3_4987;
    int anInt4988;
    boolean haveVertexProgram;
    boolean haveTextureCubeMap;
    float aFloat4991;
    boolean aBoolean4992;
    int anInt4993;
    private float smallestPointSize;
    private float aFloat4995;
    private int anInt4996;
    int[] anIntArray4997;
    int[] anIntArray4998;
    int[] anIntArray4999;
    byte[] aByteArray5000;
    private int anInt5001;

    static final int method883(int argument) {
	if (argument == 6406)
	    return 1;
	if (argument != 6409) {
	    if (argument != 32841) {
		if (argument != 6410) {
		    if (argument != 6407) {
			if (argument == 6408)
			    return 4;
		    } else
			return 3;
		} else
		    return 2;
	    } else
		return 1;
	} else
	    return 1;
	throw new IllegalArgumentException("");
    }

    final void method2273(boolean argument_0_, boolean argument_2_, int argument_3_) {
        if (argument_3_ != anInt4965 || aBoolean4931 != this.aBoolean4901) {
            GlTexture_Sub4 textureSub4 = null;
            int anLocalInt = 0;
            byte anLocalInt_4_ = 0;
            int anLocalInt_5_ = 0;
            byte anLocalInt_6_ = !this.aBoolean4901 ? (byte) 0 : (byte) 3;
            if (argument_3_ >= 0) {
                textureSub4 = aClass107_4844.method1958(argument_3_, (byte) 45);
                TextureDescriptor textureDescriptor = this.textureSource.getDescriptor(argument_3_, true);
                if (textureDescriptor.aByte845 != 0 || textureDescriptor.aByte849 != 0) {
                    int textureSize = textureDescriptor.isHalfSize ? 64 : 128;
                    int textureSizex50 = textureSize * 50;
                    translateTexture(((float) (this.anInt4850 % textureSizex50 * textureDescriptor.aByte849) / (float) textureSizex50), 0.0F, ((float) (textureDescriptor.aByte845 * (this.anInt4850 % textureSizex50)) / (float) textureSizex50));
                } else
                    resetTextureMatrix();
                anLocalInt = textureDescriptor.anInt835;
                if (!this.aBoolean4901) {
                    anLocalInt_4_ = textureDescriptor.aByte842;
                    anLocalInt_6_ = textureDescriptor.aByte834;
                    anLocalInt_5_ = textureDescriptor.anInt847;
                }
            } else
                resetTextureMatrix();
            aClass65_4843.method1489(anLocalInt_4_, -3912, argument_0_, anLocalInt_6_, anLocalInt_5_, argument_2_);
            if (!aClass65_4843.method1488(textureSub4, anLocalInt)) {
                bindTexture(textureSub4);
                setCombineMode(anLocalInt);
            }
            anInt4965 = argument_3_;
            aBoolean4931 = this.aBoolean4901;
        }
        graphicsConfiguration &= ~0x7;
    }

    private void loadScissor() {
        if (scissorXB < scissorX || scissorY < scissorYB)
            OpenGL.glScissor(0, 0, 0, 0);
        else
            OpenGL.glScissor(scissorX + viewportX, (this.viewportH + viewportY - scissorY), scissorXB - scissorX, -scissorYB + scissorY);
    }

    private void initialize(boolean argument_10_) {
        method2333(-2);
        for (int anLocalInt = this.maxTextureUnits - 1; anLocalInt >= 0; anLocalInt--) {
            setActiveTextureUnit(anLocalInt);
            bindTexture(null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        setCombineModes(8448, 8448);
        method2334(34168, 770, 2, 34192);
        resetTextureMatrix();
        blendingConfiguration = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        blendingMode = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        alphaTestEnabled = true;
        OpenGL.glColorMask(true, true, true, true);
        colourWritingDisabled = true;
        setFogEnabled(true);
        setLightingEnabled(true);
        setDepthTestEnabled(argument_10_);
        method2276(true);
        setMode0();
        myGL.setSwapInterval(0);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] ambient = {0.0F, 0.0F, 0.0F, 1.0F};
        for (int lightId = 0; lightId < 8; lightId++) {
            int glLightID = lightId + 16384;
            OpenGL.glLightfv(glLightID, 4608, ambient, 0);
            OpenGL.glLightf(glLightID, 4615, 0.0F);  //Constant attenuation
            OpenGL.glLightf(glLightID, 4616, 0.0F);  //Linear attenuation
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        anInt4922 = this.fogColour = -1;
        clearClip();
    }

    final void F(int argument_12_, int argument_13_) {
        /* empty */
    }

    final void method2276(boolean argument_15_) {
        if (aBoolean4875 != argument_15_) {
            aBoolean4875 = argument_15_;
            applyDepthMaskToggle();
            graphicsConfiguration &= ~0x1f;
        }
    }

    private void resetTextureMatrix() {
        if (incrementalTextureTranslates) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            incrementalTextureTranslates = false;
        }
    }

    final AbstractFont method2083(Class76 argument_17_, Class83[] argument_18_, boolean argument_19_) {
        return new GlFont(this, argument_17_, argument_18_, argument_19_);
    }

    final synchronized void requestARBProgramDeletion(int argument_20_) {
        Node node = new Node();
        node.hash = (long) argument_20_;
        programDeleteQueue.add(node);
    }

    final void drawElements(GlElementBuffer buffer, int count, int mode, int offset) {
        int type = buffer.getType();
        offset *= sizeofPoly(type);
        bind(buffer);
        OpenGL.glDrawElements(mode, count, type, ((long) offset + buffer.getAddress()));
    }

    final boolean method2019() {
        if (aClass59_Sub36_Sub1_4838 == null || !aClass59_Sub36_Sub1_4838.method1042(917))
            return false;
        return true;
    }

    final void method2062(int argument_27_, int argument_28_, int argument_29_, int argument_30_) {
        aClass96_4839.method1707(argument_27_, argument_29_, argument_28_, true, argument_30_);
    }

    final int getMemoryUsage() {
        return this.arbBufferMemoryUsage - (-this.textureMemoryUsage - renderBufferMemoryUsage);
    }

    final void method2067(Class72 argument_31_) {
        aClass90_4842.method1681(64, argument_31_, -1, this);
    }

    final void finish() {
        OpenGL.glFinish();
    }

    final void assignThread(int argument_32_) {
        assignThread();
    }

    final void setCanvas(Canvas canvas, int argument_34_, int argument_35_) {
        long l = 0L;
        if (canvas == null || canvas == currentCanvas)
            l = surfaceId;
        else if (canvasTable.containsKey(canvas)) {
            l = (Long) canvasTable.get(canvas);
        }
        if (l == 0L)
            throw new RuntimeException();
        myGL.surfaceResized(l);
        if (canvas == myCanvas)
            setupDimensions();
    }

    final void f(int argument_36_, int argument_37_) {
        if (this.anInt4920 != argument_36_ || argument_37_ != anInt4951) {
            this.anInt4920 = argument_36_;
            anInt4951 = argument_37_;
            method2340(29021);
            loadFog();
            if (projectionMode == 3)
                method2312();
            else if (projectionMode == 2)
                loadStoredProjection();
        }
    }

    final boolean method2092() {
        if (aClass59_Sub36_Sub1_4838 != null) {
            if (!aClass59_Sub36_Sub1_4838.method1042(917)) {
                if (aClass96_4839.method1705(aClass59_Sub36_Sub1_4838, (byte) 122))
                    aClass107_4844.method1956((byte) -21);
                else
                    return false;
            }
            return true;
        }
        return false;
    }

    final void setDepthTestEnabled(boolean depthTestEnabled) {
        if (depthTestEnabled != this.depthTestEnabled) {
            if (!depthTestEnabled)
                OpenGL.glDisable(2929);
            else
                OpenGL.glEnable(2929);
            graphicsConfiguration &= ~0x1f;
            this.depthTestEnabled = depthTestEnabled;
        }
    }

    final Class368 method2033(Class83 argument_40_, boolean argument_41_) {
        int[] anLocalInts = new int[(argument_40_.anInt590 * argument_40_.anInt587)];
        int anLocalInt = 0;
        int anLocalInt_42_ = 0;
        if (argument_40_.aByteArray592 != null) {
            for (int anLocalInt_43_ = 0; anLocalInt_43_ < argument_40_.anInt587; anLocalInt_43_++) {
                for (int anLocalInt_44_ = 0; argument_40_.anInt590 > anLocalInt_44_; anLocalInt_44_++) {
                    anLocalInts[anLocalInt_42_++] = (MathStatics.OR((argument_40_.aByteArray592[anLocalInt] << 24), (argument_40_.anIntArray586[MathStatics.AND((argument_40_.aByteArray591[anLocalInt]), 255)])));
                    anLocalInt++;
                }
            }
        } else {
            for (int anLocalInt_45_ = 0; anLocalInt_45_ < argument_40_.anInt587; anLocalInt_45_++) {
                for (int anLocalInt_46_ = 0; anLocalInt_46_ < argument_40_.anInt590; anLocalInt_46_++) {
                    int anLocalInt_47_ = (argument_40_.anIntArray586[(argument_40_.aByteArray591[anLocalInt++]) & 0xff]);
                    anLocalInts[anLocalInt_42_++] = (anLocalInt_47_ != 0 ? MathStatics.OR(-16777216, anLocalInt_47_) : 0);
                }
            }
        }
        Class368 class368 = this.method2047(argument_40_.anInt590, anLocalInts, 0, argument_40_.anInt587, argument_40_.anInt590);
        class368.method4024(argument_40_.anInt593, argument_40_.anInt589, argument_40_.anInt588, argument_40_.anInt594);
        return class368;
    }

    final void setupConfig8() {
        if (graphicsConfiguration != 8) {
            method2313(2);
            setFogEnabled(true);
            setDepthTestEnabled(true);
            method2276(true);
            setBlendingConfiguration(1);
            graphicsConfiguration = 8;
        }
    }

    final void removeCanvas(Canvas argument_49_) {
        if (argument_49_ == currentCanvas)
            throw new RuntimeException();
        if (canvasTable.containsKey(argument_49_)) {
            Long var_long = (Long) canvasTable.get(argument_49_);
            myGL.releaseSurface(argument_49_, var_long.longValue());
            canvasTable.remove(argument_49_);
        }
    }

    final int i() {
        return this.anInt4920;
    }

    final void setCombineMode(int argument_51_) {
        switch (argument_51_) {
            case 1:
                setCombineModes(7681, 7681);
                break;
            case 0:
                setCombineModes(8448, 8448);
                break;
            case 2:
                setCombineModes(7681, 34165);
                break;
            case 3:
                setCombineModes(8448, 260);
                break;
            case 4:
                setCombineModes(34023, 34023);
                break;
        }
    }

    private void loadViewport() {
        OpenGL.glViewport(viewportX, viewportY, this.viewportW, this.viewportH);
    }

    final void setTexEnvColour(int argument_53_) {
        glVBuffer[2] = (float) MathStatics.AND(255, argument_53_) / 255.0F;
        glVBuffer[1] = (float) MathStatics.AND(65280, argument_53_) / 65280.0F;
        glVBuffer[3] = (float) (argument_53_ >>> 24) / 255.0F;
        glVBuffer[0] = ((float) MathStatics.AND(16711680, argument_53_) / 1.671168E7F);
        OpenGL.glTexEnvfv(8960, 8705, glVBuffer, 0);
    }

    final Interface15 method2097(Interface21 argument_55_, Interface17 argument_56_) {
        return null;
    }

    private void setupConfig3() {
        if (projectionMode != 3) {
            projectionMode = 3;
            method2312();
            updateMatrix();
            graphicsConfiguration &= ~0x7;
        }
    }

    final void setupConfig4() {
        if (graphicsConfiguration != 4) {
            setupFlatOrtho();
            setFogEnabled(false);
            setLightingEnabled(false);
            setDepthTestEnabled(false);
            method2276(false);
            method2333(-2);
            setBlendingConfiguration(1);
            graphicsConfiguration = 4;
        }
    }

    final boolean method2060() {
        return true;
    }

    private int getCaps() {
        int errorFlags = 0;
        glVendorString = OpenGL.glGetString(7936).toLowerCase();
        glRendererString = OpenGL.glGetString(7937).toLowerCase();
        if (glVendorString.indexOf("microsoft") != -1)
            errorFlags |= 0x1;
        if (glVendorString.indexOf("brian paul") != -1 || glVendorString.indexOf("mesa") != -1)
            errorFlags |= 0x1;
        String glVersionString = OpenGL.glGetString(7938);
        String[] strings = JagexStringUtils.split(glVersionString.replace('.', ' '), 0, ' ');
        if (strings.length < 2)
            errorFlags |= 0x4;
        else {
            try {
                int major = JagexStringUtils.parseInt(strings[0]);
                int minor = JagexStringUtils.parseInt(strings[1]);
                glVersion = minor + major * 10;
            } catch (NumberFormatException numberformatexception) {
                errorFlags |= 0x4;
            }
        }
        if (glVersion < 12)
            errorFlags |= 0x2;
        if (!myGL.hasCapability("GL_ARB_multitexture"))
            errorFlags |= 0x8;
        if (!myGL.hasCapability("GL_ARB_texture_env_combine"))
            errorFlags |= 0x20;
        int[] anLocalInts = new int[1];
        OpenGL.glGetIntegerv(34018, anLocalInts, 0);
        this.maxTextureUnits = anLocalInts[0];
        OpenGL.glGetIntegerv(34929, anLocalInts, 0);
        maxTextureCoords = anLocalInts[0];
        OpenGL.glGetIntegerv(34930, anLocalInts, 0);
        maxTextureImageUnits = anLocalInts[0];
        if (this.maxTextureUnits < 2 || maxTextureCoords < 2 || maxTextureImageUnits < 2)
            errorFlags |= 0x10;
        this.isBigEndian = Stream.isBigEndian();
        havePBuffers = myGL.arePbuffersAvailable();
        haveVBO = myGL.hasCapability("GL_ARB_vertex_buffer_object");
        haveMultisample = myGL.hasCapability("GL_ARB_multisample");
        this.haveVertexProgram = myGL.hasCapability("GL_ARB_vertex_program");
        myGL.hasCapability("GL_ARB_fragment_program");
        this.haveVertexShader = myGL.hasCapability("GL_ARB_vertex_shader");
        this.haveFragmentShader = myGL.hasCapability("GL_ARB_fragment_shader");
        this.haveTexture3D = myGL.hasCapability("GL_EXT_texture3D");
        this.haveTextureRectangle = myGL.hasCapability("GL_ARB_texture_rectangle");
        this.haveTextureCubeMap = myGL.hasCapability("GL_ARB_texture_cube_map");
        this.haveTextureFloat = myGL.hasCapability("GL_ARB_texture_float");
        this.aBoolean4927 = false;
        this.haveFBO = myGL.hasCapability("GL_EXT_framebuffer_object");
        this.haveFBBlit = myGL.hasCapability("GL_EXT_framebuffer_blit");
        this.haveFBMultisample = myGL.hasCapability("GL_EXT_framebuffer_multisample");
        aBoolean4891 = (this.haveFBMultisample & this.haveFBBlit);
        this.isMacintosh = Class62_Sub5.osName.startsWith("mac");
        OpenGL.glGetFloatv(2834, glVBuffer, 0);
        largestPointSize = glVBuffer[1];
        smallestPointSize = glVBuffer[0];
        if (errorFlags == 0)
            return 0;
        return errorFlags;
    }

    final void drawImage(int _x, int _y, int w, int h, int rgb, int argument_67_, byte[] argument_68_, int argument_69_, int argument_70_) {
        float tcSizeY;
        float tcSizeX;
        if (aClass142_Sub4_Sub1_4981 == null || (w > aClass142_Sub4_Sub1_4981.width) || (h > aClass142_Sub4_Sub1_4981.height)) {
            aClass142_Sub4_Sub1_4981 = Class188.method2868(argument_68_, 6406, h, this, w, 6406, false, (byte) -123);
            aClass142_Sub4_Sub1_4981.setWrappingMode(false, false);
            tcSizeX = aClass142_Sub4_Sub1_4981.tileW;
            tcSizeY = aClass142_Sub4_Sub1_4981.tileH;
        } else {
            aClass142_Sub4_Sub1_4981.method2501(w, 0, false, 127, h, argument_68_, 6406, 0, 0, 0);
            tcSizeY = (aClass142_Sub4_Sub1_4981.tileH * (float) h / (float) (aClass142_Sub4_Sub1_4981.height));
            tcSizeX = (aClass142_Sub4_Sub1_4981.tileW * (float) w / (float) (aClass142_Sub4_Sub1_4981.width));
        }
        method2296();
        bindTexture(aClass142_Sub4_Sub1_4981);
        setBlendingConfiguration(argument_70_);
        OpenGL.glColor4ub((byte) (rgb >> 16), (byte) (rgb >> 8), (byte) rgb, (byte) (rgb >> 24));
        setTexEnvColour(argument_67_);
        setCombineModes(34165, 34165);
        method2334(34166, 768, 0, 34192);
        method2334(5890, 770, 2, 34192);
        setTextureAlphaCombiners(0, 770, 34166);
        setTextureAlphaCombiners(2, 770, 5890);
        float x = (float) _x;
        float z = (float) _y;
        float x_b = x + (float) w;
        float z_b = z + (float) h;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(x, z);
        OpenGL.glTexCoord2f(0.0F, tcSizeX);
        OpenGL.glVertex2f(x, z_b);
        OpenGL.glTexCoord2f(tcSizeY, tcSizeX);
        OpenGL.glVertex2f(x_b, z_b);
        OpenGL.glTexCoord2f(tcSizeY, 0.0F);
        OpenGL.glVertex2f(x_b, z);
        OpenGL.glEnd();
        method2334(5890, 768, 0, 34192);
        method2334(34166, 770, 2, 34192);
        setTextureAlphaCombiners(0, 770, 5890);
        setTextureAlphaCombiners(2, 770, 34166);
    }

    final boolean method2039() {
        if (!haveMultisample || method2019() && !aBoolean4891)
            return false;
        return true;
    }

    private void method2288(int argument_76_) {
        if (argument_76_ == 2910)
            myGL.releaseThread();
    }

    final boolean method2081() {
        return true;
    }

    final GlArrayBuffer method2289(int argument_77_, int argument_78_, byte[] argument_79_, boolean argument_80_, int argument_81_) {
        if (haveVBO && (!argument_80_ || aBoolean4982))
            return new ArbArrayBuffer(this, argument_81_, argument_79_, argument_78_, argument_80_);
        return new GlGeometryArray(this, argument_81_, argument_79_, argument_78_);
    }

    final GlElementBuffer method2290(int argument_82_, boolean argument_83_, int argument_84_, boolean argument_85_, byte[] argument_86_) {
        if (haveVBO && (!argument_83_ || aBoolean4982))
            return new ArbElementBuffer(this, argument_84_, argument_86_, argument_82_, argument_83_);
        return new GlElementArray(this, argument_84_, argument_86_, argument_82_);
    }

    final int andPow(int argument_87_, int argument_88_) {
        return argument_87_ & argument_88_ ^ argument_88_;
    }

    private void method2291(byte argument_89_) {
        this.aFloat4934 = (float) (-this.anInt4972 + scissorYB);
        if (argument_89_ > -28)
            this.aFloat4899 = -0.12362388F;
        this.aFloat4952 = (float) (scissorX - this.anInt4993);
        this.aFloat4915 = (float) (-this.anInt4993 + scissorXB);
        this.aFloat4899 = (float) (scissorY - this.anInt4972);
    }

    final void getScissor(int[] argument_90_) {
        argument_90_[1] = scissorYB;
        argument_90_[2] = scissorXB;
        argument_90_[0] = scissorX;
        argument_90_[3] = scissorY;
    }

    final void popMatrix() {
        OpenGL.glPopMatrix();
    }

    final void method2030(Skybox argument_92_) {
        aGlClass67_4959 = (GlSkybox) argument_92_;
    }

    final void clear(int color) {
        setBlendingConfiguration(0);
        OpenGL.glClearColor((float) (color & 0xff0000) / 1.671168E7F, (float) (color & 0xff00) / 65280.0F, (float) (color & 0xff) / 255.0F, (float) (color >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    final void bindArrays(GlInterleavedArray normalArray, GlInterleavedArray colourArray, GlInterleavedArray vertexArray, GlInterleavedArray texCoordArray) {
        if (vertexArray == null)
            OpenGL.glDisableClientState(32884);
        else {
            bindArrayBuffer(vertexArray.arrayBuffer);
            OpenGL.glVertexPointer(vertexArray.size, vertexArray.type, boundArrayBuffer.getStride(), (boundArrayBuffer.getAddress() + (long) (vertexArray.offset)));
            OpenGL.glEnableClientState(32884);
        }
        if (normalArray == null)
            OpenGL.glDisableClientState(32885);
        else {
            bindArrayBuffer(normalArray.arrayBuffer);
            OpenGL.glNormalPointer(normalArray.type, boundArrayBuffer.getStride(), (boundArrayBuffer.getAddress() - -(long) (normalArray.offset)));
            OpenGL.glEnableClientState(32885);
        }
        if (colourArray != null) {
            bindArrayBuffer(colourArray.arrayBuffer);
            OpenGL.glColorPointer(colourArray.size, colourArray.type, boundArrayBuffer.getStride(), (boundArrayBuffer.getAddress() + (long) (colourArray.offset)));
            OpenGL.glEnableClientState(32886);
        } else
            OpenGL.glDisableClientState(32886);
        if (texCoordArray != null) {
            bindArrayBuffer(texCoordArray.arrayBuffer);
            OpenGL.glTexCoordPointer(texCoordArray.size, texCoordArray.type, boundArrayBuffer.getStride(), (boundArrayBuffer.getAddress() - -(long) (texCoordArray.offset)));
            OpenGL.glEnableClientState(32888);
        } else
            OpenGL.glDisableClientState(32888);
    }

    final void EA(int argument_99_, int argument_100_, int argument_101_, int argument_102_) {
        if (!this.aBoolean4901)
            throw new RuntimeException("");
        this.anInt4974 = argument_102_;
        this.anInt4988 = argument_101_;
        this.anInt4980 = argument_100_;
        this.anInt4950 = argument_99_;
        if (aBoolean4931) {
            aClass65_4843.aClass353_Sub1_456.method3894(928);
            aClass65_4843.aClass353_Sub1_456.method3893((byte) 127);
        }
    }

    final synchronized void requestRenderBufferDeletion(int argument_103_, int argument_104_) {
        IntegerNode class59_sub54 = new IntegerNode(argument_103_);
        ((Node) class59_sub54).hash = (long) argument_104_;
        renderBufferDeleteQueue.add(class59_sub54);
    }

    final void clearDepthBuffer() {
        method2276(true);
        OpenGL.glClear(256);
    }

    final boolean method2034() {
        if (aClass59_Sub36_Sub1_4838 == null || this.anInt4840 > 1 && !aBoolean4891)
            return false;
        return true;
    }

    final void DA(int argument_106_, int argument_107_, int argument_108_, int argument_109_) {
        this.anInt4993 = argument_106_;
        this.anInt4900 = argument_108_;
        this.anInt4956 = argument_109_;
        this.anInt4972 = argument_107_;
        method2340(29021);
        method2291((byte) -103);
        if (projectionMode == 3) {
            method2312();
        } else if (projectionMode == 2)
            loadStoredProjection();
    }

    final void loadLightPositions() {
        OpenGL.glLightfv(16384, 4611, sunDirection, 0);
        OpenGL.glLightfv(16385, 4611, light1Position, 0);
    }

    final void setFog2(float argument_112_, float argument_114_) {
        aFloat4995 = argument_112_;
        aFloat4947 = argument_114_;
        loadFog();
    }

    private void applyLightingToggle() {
        if (lightingEnabled && !aBoolean4892)
            OpenGL.glEnable(2896);
        else
            OpenGL.glDisable(2896);
    }

    final dba_sub_772 method2037(int argument_116_) {
        dba_sub_772_Sub1 var_dba_sub_772_Sub1 = new dba_sub_772_Sub1(argument_116_);
        aCyclicLinkedList_4853.add(var_dba_sub_772_Sub1);
        return var_dba_sub_772_Sub1;
    }

    private void loadLightModel() {
        glVBuffer[3] = 1.0F;
        glVBuffer[2] = (this.modelIntensity * this.lightBlue);
        glVBuffer[1] = (this.lightGreen * this.modelIntensity);
        glVBuffer[0] = (this.modelIntensity * this.lightRed);
        OpenGL.glLightModelfv(2899, glVBuffer, 0);
    }

    final void setViewport(int x, int y) {
        viewportY = y;
        viewportX = x;
        loadViewport();
        loadScissor();
    }

    final int getGLFriendlyCombineMode(int argument_121_) {
        switch (argument_121_) {
            case 1:
                return 7681;
            case 0:
                return 8448;
            case 2:
                return 34165;
            case 3:
                return 260;
            case 4:
                return 34023;
        }
        throw new IllegalArgumentException();
    }

    final Class350 method2015() {
        return aClass350_Sub3_4845;
    }

    private void configure2DSettings() {
        if (graphicsConfiguration != 1) {
            setupFlatOrtho();
            setFogEnabled(false);
            setLightingEnabled(false);
            setDepthTestEnabled(false);
            method2276(false);
            bindTexture( null);
            method2333(-2);
            setCombineMode(1);
            graphicsConfiguration = 1;
        }
    }

    final void method2296() {
        if (graphicsConfiguration != 2) {
            setupFlatOrtho();
            setFogEnabled(false);
            setLightingEnabled(false);
            setDepthTestEnabled(false);
            method2276(false);
            method2333(-2);
            graphicsConfiguration = 2;
        }
    }

    final void HA(int argument_124_, int argument_125_, int argument_126_, int argument_127_, int[] argument_128_) {
        float f = ((this.aClass350_Sub3_4881.aFloat5462) + ((this.aClass350_Sub3_4881.aFloat5455) * (float) argument_124_ + ((float) argument_125_ * this.aClass350_Sub3_4881.aFloat5465) + (this.aClass350_Sub3_4881.aFloat5461 * (float) argument_126_)));
        if (f < (float) this.anInt4920 || (float) anInt4951 < f)
            argument_128_[0] = argument_128_[1] = argument_128_[2] = -1;
        else {
            int anLocalInt = (int) ((this.aClass350_Sub3_4881.aFloat5459 + (((float) argument_124_ * (this.aClass350_Sub3_4881.aFloat5458)) + (this.aClass350_Sub3_4881.aFloat5460) * (float) argument_125_ + ((float) argument_126_ * (this.aClass350_Sub3_4881.aFloat5463)))) * (float) this.anInt4900 / (float) argument_127_);
            int anLocalInt_129_ = (int) ((float) this.anInt4956 * (this.aClass350_Sub3_4881.aFloat5467 + ((this.aClass350_Sub3_4881.aFloat5457) * (float) argument_124_ + ((float) argument_125_ * (this.aClass350_Sub3_4881.aFloat5456)) + (this.aClass350_Sub3_4881.aFloat5466) * (float) argument_126_)) / (float) argument_127_);
            if (!(this.aFloat4952 <= (float) anLocalInt) || !(this.aFloat4915 >= (float) anLocalInt) || !((float) anLocalInt_129_ >= this.aFloat4934) || !((float) anLocalInt_129_ <= this.aFloat4899))
                argument_128_[0] = argument_128_[1] = argument_128_[2] = -1;
            else {
                argument_128_[0] = (int) (-this.aFloat4952 + (float) anLocalInt);
                argument_128_[1] = (int) ((float) anLocalInt_129_ - this.aFloat4934);
                argument_128_[2] = (int) f;
            }
        }
    }

    final synchronized void requestFramebufferDeletion(int argument_130_) {
        IntegerNode class59_sub54 = new IntegerNode(argument_130_);
        frameBufferDeleteQueue.add(class59_sub54);
    }

    final void glPushMatrix() {
        OpenGL.glPushMatrix();
    }

    final void drawVLine(int _x, int _y, int h, int rgb, int blendingConfiguration) {
        configure2DSettings();
        setBlendingConfiguration(blendingConfiguration);
        float x = (float) _x + 0.35F;
        float y = (float) _y + 0.35F;
        OpenGL.glColor4ub((byte) (rgb >> 16), (byte) (rgb >> 8), (byte) rgb, (byte) (rgb >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(x, y);
        OpenGL.glVertex2f(x, (float) h + y);
        OpenGL.glEnd();
    }

    final void method2098() {
        aClass96_4839.method1708(0);
    }

    final void setTexEnvColour(float r, float g, float b, float a) {
        glVBuffer[1] = g;
        glVBuffer[0] = r;
        glVBuffer[2] = b;
        glVBuffer[3] = a;
        OpenGL.glTexEnvfv(8960, 8705, glVBuffer, 0);
    }

    final void method2306(float argument_145_) {
        if (aFloat4967 != argument_145_) {
            aFloat4967 = argument_145_;
            if (projectionMode == 3)
                method2312();
        }
    }

    final void ra(int argument_146_, int argument_147_, int argument_148_, int argument_149_) {
        this.anInt4980 = argument_147_;
        this.anInt4950 = argument_146_;
        this.aBoolean4901 = true;
        this.anInt4974 = argument_149_;
        this.anInt4988 = argument_148_;
    }

    final void swapBuffers(int argument_150_, int argument_151_) throws Exception_Sub1 {
        try {
            myGL.swapBuffers();
        } catch (Exception exception) {
            /* empty */
        }
    }

    final void method2307(boolean argument_152_, int argument_153_) {
        method2273(true, argument_152_, argument_153_);
    }

    final int r(int argument_155_, int argument_156_, int argument_157_, int argument_158_, int argument_159_, int argument_160_, int argument_161_) {
        float f = (((float) argument_157_ * (this.aClass350_Sub3_4881.aFloat5461)) + (((float) argument_156_ * this.aClass350_Sub3_4881.aFloat5465) + (this.aClass350_Sub3_4881.aFloat5455 * (float) argument_155_)) + (this.aClass350_Sub3_4881.aFloat5462));
        float f_162_ = ((this.aClass350_Sub3_4881.aFloat5462) + (((float) argument_159_ * this.aClass350_Sub3_4881.aFloat5465) + ((float) argument_158_ * this.aClass350_Sub3_4881.aFloat5455) + ((float) argument_160_ * this.aClass350_Sub3_4881.aFloat5461)));
        int anLocalInt = 0;
        if (!((float) this.anInt4920 > f) || !(f_162_ < (float) this.anInt4920)) {
            if (f > (float) anInt4951 && (float) anInt4951 < f_162_)
                anLocalInt |= 0x20;
        } else
            anLocalInt |= 0x10;
        int anLocalInt_163_ = (int) ((float) this.anInt4900 * (this.aClass350_Sub3_4881.aFloat5459 + (((float) argument_157_ * (this.aClass350_Sub3_4881.aFloat5463)) + ((this.aClass350_Sub3_4881.aFloat5458) * (float) argument_155_ + (this.aClass350_Sub3_4881.aFloat5460) * (float) argument_156_))) / (float) argument_161_);
        int anLocalInt_164_ = (int) ((float) this.anInt4900 * (this.aClass350_Sub3_4881.aFloat5459 + (((float) argument_158_ * (this.aClass350_Sub3_4881.aFloat5458)) + (this.aClass350_Sub3_4881.aFloat5460) * (float) argument_159_ + (this.aClass350_Sub3_4881.aFloat5463) * (float) argument_160_)) / (float) argument_161_);
        if (!(this.aFloat4952 > (float) anLocalInt_163_) || !(this.aFloat4952 > (float) anLocalInt_164_)) {
            if (this.aFloat4915 < (float) anLocalInt_163_ && (float) anLocalInt_164_ > this.aFloat4915)
                anLocalInt |= 0x2;
        } else
            anLocalInt |= 0x1;
        int anLocalInt_165_ = (int) ((this.aClass350_Sub3_4881.aFloat5467 + (((float) argument_157_ * (this.aClass350_Sub3_4881.aFloat5466)) + (((float) argument_156_ * (this.aClass350_Sub3_4881.aFloat5456)) + ((float) argument_155_ * (this.aClass350_Sub3_4881.aFloat5457))))) * (float) this.anInt4956 / (float) argument_161_);
        int anLocalInt_166_ = (int) (((this.aClass350_Sub3_4881.aFloat5457 * (float) argument_158_) + ((float) argument_159_ * this.aClass350_Sub3_4881.aFloat5456) + (this.aClass350_Sub3_4881.aFloat5466 * (float) argument_160_) + this.aClass350_Sub3_4881.aFloat5467) * (float) this.anInt4956 / (float) argument_161_);
        if (!(this.aFloat4934 > (float) anLocalInt_165_) || !((float) anLocalInt_166_ < this.aFloat4934)) {
            if ((float) anLocalInt_165_ > this.aFloat4899 && (float) anLocalInt_166_ > this.aFloat4899)
                anLocalInt |= 0x8;
        } else
            anLocalInt |= 0x4;
        return anLocalInt;
    }

    private void method2308(int argument_167_) {
        textureArray = new GlTexture[this.maxTextureUnits];
        this.aClass142_Sub4_4955 = new GlTexture_Sub4(this, 3553, 6408, argument_167_, 1);
        new GlTexture_Sub4(this, 3553, 6408, 1, 1);
        new GlTexture_Sub4(this, 3553, 6408, 1, 1);
        this.aClass167_Sub3_4928 = new Class167_Sub3(this);
        this.aClass167_Sub3_4925 = new Class167_Sub3(this);
        this.aClass167_Sub3_4985 = new Class167_Sub3(this);
        this.aClass167_Sub3_4958 = new Class167_Sub3(this);
        this.aClass167_Sub3_4919 = new Class167_Sub3(this);
        this.aClass167_Sub3_4987 = new Class167_Sub3(this);
        this.aClass167_Sub3_4973 = new Class167_Sub3(this);
        this.aClass167_Sub3_4962 = new Class167_Sub3(this);
        this.aClass167_Sub3_4910 = new Class167_Sub3(this);
        this.aClass167_Sub3_4912 = new Class167_Sub3(this);
        if (this.haveFBO) {
            this.aGlExtFramebuffer_4945 = new GlExtFramebuffer(this);
            new GlExtFramebuffer(this);
        }
    }

    final void method2309(GlFrameBuffer argument_168_, int argument_169_) {
        if (anInt4860 >= 3)
            throw new RuntimeException();
        if ((~anInt4860) <= argument_169_)
            anGlFrameBufferArray4858[anInt4860].unbindForRead(-4055);
        anGlFrameBuffer_4863 = anGlFrameBufferArray4858[++anInt4860] = argument_168_;
        anGlFrameBuffer_4863.bindForRead((byte) 89);
    }

    final Class167 method2057(Class101 argument_170_, int argument_171_, int argument_172_, int argument_173_, int argument_174_) {
        return new Class167_Sub3(this, argument_170_, argument_171_, argument_173_, argument_174_, argument_172_);
    }

    final void b(int argument_175_, int argument_176_, int argument_177_, int argument_178_, double argument_179_) {
        /* empty */
    }

    final void setLightingEnabled(boolean argument_180_) {
        if (!lightingEnabled != !argument_180_) {
            lightingEnabled = argument_180_;
            applyLightingToggle();
            graphicsConfiguration &= ~0x7;
        }
    }

    final GlCubeMap method2311(int argument_182_) {
        if (argument_182_ != 1)
            setTextureAlphaCombiners(-101, 29, -46);
        if (aGlClass67_4959 != null)
            return aGlClass67_4959.getCubeMap();
        return null;
    }

    private void method2312() {
        float f = (aFloat4967 * (float) -this.anInt4993 / (float) this.anInt4900);
        float f_184_ = ((float) -this.anInt4972 * aFloat4967 / (float) this.anInt4956);
        float f_185_ = ((float) (-this.anInt4993 + this.viewportW) * aFloat4967 / (float) this.anInt4900);
        float f_186_ = ((float) (-this.anInt4972 + this.viewportH) * aFloat4967 / (float) this.anInt4956);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (f != f_185_ && f_184_ != f_186_)
            OpenGL.glOrtho((double) f, (double) f_185_, (double) -f_186_, (double) -f_184_, (double) this.anInt4920, (double) anInt4951);
        OpenGL.glMatrixMode(5888);
    }

    final void method2017(int argument_187_) {
        /* empty */
    }

    final void drawRect(int x, int y, int width, int height, int rgb, int blendingConfiguration) {
        float _x = (float) x + 0.35F;
        float _y = (float) y + 0.35F;
        float _xb = _x + (float) width - 1.0F;
        float _yb = _y + (float) height - 1.0F;
        configure2DSettings();
        setBlendingConfiguration(blendingConfiguration);
        OpenGL.glColor4ub((byte) (rgb >> 16), (byte) (rgb >> 8), (byte) rgb, (byte) (rgb >> 24));
        if (haveMultisample)
            OpenGL.glDisable(32925);
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(_x, _y);
        OpenGL.glVertex2f(_x, _yb);
        OpenGL.glVertex2f(_xb, _yb);
        OpenGL.glVertex2f(_xb, _y);
        OpenGL.glEnd();
        if (haveMultisample)
            OpenGL.glEnable(32925);
    }

    private void method2313(int argument_197_) {
        if (projectionMode != argument_197_) {
            projectionMode = 2;
            loadStoredProjection();
            updateMatrix();
            graphicsConfiguration &= ~0x7;
        }
    }

    final void detachFBO(GlFrameBuffer argument_198_, boolean argument_199_) {
        if (argument_199_)
            translateTexture(-0.6727019F, 0.5287709F, -1.4773127F);
        if (!this.haveFBBlit) {
            if (anInt4854 < 0 || anGlFrameBufferArray4859[anInt4854] != argument_198_)
                throw new RuntimeException();
            anGlFrameBufferArray4859[anInt4854--] = null;
            argument_198_.unbind(15427);
            if (anInt4854 >= 0) {
                anGlFrameBuffer_4863 = anGlFrameBuffer_4857 = anGlFrameBufferArray4859[anInt4854];
                anGlFrameBuffer_4863.bind((byte) -122);
            } else
                anGlFrameBuffer_4863 = anGlFrameBuffer_4857 = null;
        } else {
            method2347(2, argument_198_);
            method2348(argument_198_, true);
        }
    }

    final ToolkitInfo getDescriptor() {
        int anLocalInt = -1;
        if (glVendorString.contains("nvidia"))
            anLocalInt = 4318;
        else if (glVendorString.contains("intel"))
            anLocalInt = 32902;
        else if (glVendorString.contains("ati"))
            anLocalInt = 4098;
        return new ToolkitInfo(anLocalInt, "OpenGL", glVersion, glRendererString, 0L);
    }

    final void method2069(Class350 argument_200_) {
        this.aClass350_Sub3_4881.method3838(argument_200_);
        this.lightingMatrix.method3838(this.aClass350_Sub3_4881);
        this.lightingMatrix.method3873(126);
        this.aClass350_Sub3_4884.method3869((byte) -121, this.lightingMatrix);
        if (projectionMode != 1)
            updateMatrix();
    }

    final int M() {
        int anLocalInt = anInt4996;
        anInt4996 = 0;
        return anLocalInt;
    }

    final void setCombineModes(int alphaCombineMode, int rgbCombine) {
        if (currentTexture != 0) {
            OpenGL.glTexEnvi(8960, 34161, rgbCombine);
            OpenGL.glTexEnvi(8960, 34162, alphaCombineMode);
        } else {
            boolean changed = false;
            if (colourCombineMode != rgbCombine) {
                OpenGL.glTexEnvi(8960, 34161, rgbCombine);
                colourCombineMode = rgbCombine;
                changed = true;
            }
            if (alphaCombineMode != this.alphaCombineMode) {
                OpenGL.glTexEnvi(8960, 34162, alphaCombineMode);
                changed = true;
                this.alphaCombineMode = alphaCombineMode;
            }
            if (changed)
                graphicsConfiguration &= ~0x1d;
        }
    }

    final synchronized void method2316(long argument_204_, boolean argument_205_) {
        Node node = new Node();
        node.hash = argument_204_;
        objectDeleteQueue.add(node);
    }

    private void setupLightColours() {
        glVBuffer[0] = (this.lightRed * this.light1Intensity);
        glVBuffer[1] = (this.lightGreen * this.light1Intensity);
        glVBuffer[2] = (this.lightBlue * this.light1Intensity);
        glVBuffer[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, glVBuffer, 0);
        glVBuffer[0] = (this.lightRed * -this.light2NegIntensity);
        glVBuffer[1] = (this.lightGreen * -this.light2NegIntensity);
        glVBuffer[2] = (this.lightBlue * -this.light2NegIntensity);
        glVBuffer[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, glVBuffer, 0);
    }

    final Class_aa method2066(int argument_207_, int argument_208_, int[] argument_209_, int[] argument_210_) {
        return Class260.method3317(this, argument_208_, argument_209_, argument_207_, argument_210_, 0);
    }

    final void X(int argument_211_) {
        this.anInt4847 = 0;
        while (argument_211_ > 1) {
            argument_211_ >>= 1;
            this.anInt4847++;
        }
        this.anInt4852 = 1 << this.anInt4847;
    }

    final boolean method2075() {
        return aClass65_4843.method1491((byte) 72, 3);
    }

    private void method2318(int argument_212_) {
        projectionMatrix[14] = aFloat4921;
        projectionMatrix[10] = aFloat4983;
        this.aFloat4964 = (projectionMatrix[14] - (float) anInt4951) / projectionMatrix[10];
        if (argument_212_ != 22545)
            M();
        this.aFloat4991 = (float) anInt4951;
    }

    final void setClip(int x, int y, int xb, int yb) {
        if (xb > this.viewportW)
            xb = this.viewportW;
        if (x < 0)
            x = 0;
        if (y > this.viewportH)
            y = this.viewportH;
        if (yb < 0)
            yb = 0;
        scissorXB = xb;
        scissorX = x;
        scissorY = y;
        scissorYB = yb;
        OpenGL.glEnable(3089);
        method2291((byte) -73);
        loadScissor();
    }

    private void loadFog() {
        fogEnd = (float) (anInt4951 - this.anInt4932) - aFloat4995;
        this.fogStart = (fogEnd - (float) this.anInt4896 * aFloat4947);
        if (this.fogStart < (float) this.anInt4920)
            this.fogStart = (float) this.anInt4920;
        OpenGL.glFogf(2915, this.fogStart);
        OpenGL.glFogf(2916, fogEnd);
        glVBuffer[2] = (float) MathStatics.AND(this.fogColour, 255) / 255.0F;
        glVBuffer[0] = (float) MathStatics.AND(this.fogColour, 16711680) / 1.671168E7F;
        glVBuffer[1] = ((float) MathStatics.AND(65280, this.fogColour) / 65280.0F);
        OpenGL.glFogfv(2918, glVBuffer, 0);
    }

    final void drawArrays(int mode, int first, int count) {
        OpenGL.glDrawArrays(mode, first, count);
    }

    private void updateMatrix() {
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.lightingMatrix.method3874(false), 0);
        if (aBoolean4931)
            aClass65_4843.aClass353_Sub1_456.method3894(928);
        loadLightPositions();
        loadLights();
    }

    final void setMode0() {
        if (projectionMode != 0) {
            projectionMode = 0;
            graphicsConfiguration &= ~0x1f;
        }
    }

    final void clearClip() {
        scissorY = this.viewportH;
        scissorX = 0;
        scissorXB = this.viewportW;
        scissorYB = 0;
        OpenGL.glDisable(3089);
        method2291((byte) -71);
    }

    private void setupDimensions() {
        if (myCanvas != null) {
            Dimension dimension = myCanvas.getSize();
            canvasHeight = dimension.height;
            canvasWidth = dimension.width;
        } else
            canvasWidth = canvasHeight = 0;
        if (anGlFrameBuffer_4857 == null) {
            this.viewportH = canvasHeight;
            this.viewportW = canvasWidth;
            loadViewport();
        }
        setMode0();
        clearClip();
    }

    final void method2041(Rectangle[] argument_225_, int argument_226_, int argument_227_, int argument_228_) throws Exception_Sub1 {
        swapBuffers(argument_227_, argument_228_);
    }

    final boolean method2038() {
        return true;
    }

    final void pa() {
        this.aBoolean4901 = false;
    }

    private void applyFogToggle() {
        if (!fogEnabled || this.anInt4896 < 0)
            OpenGL.glDisable(2912);
        else
            OpenGL.glEnable(2912);
    }

    final Class368 method2055(int argument_230_, int argument_231_, boolean argument_232_) {
        return new Class368_Sub3(this, argument_230_, argument_231_, argument_232_);
    }

    final void method2325(boolean argument_233_) {
        if (!argument_233_ != !aBoolean4892) {
            aBoolean4892 = argument_233_;
            applyLightingToggle();
        }
    }

    private void assignThread() {
        int anLocalInt = 0;
        while (!myGL.assignThread()) {
            if (anLocalInt++ > 5)
                throw new RuntimeException("");
            Timing.sleep(1000L);
        }
    }

    private void setupFlatOrtho() {
        if (projectionMode != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.viewportW > 0 && this.viewportH > 0)
                OpenGL.glOrtho(0.0, (double) this.viewportW, (double) this.viewportH, 0.0, -1.0, 1.0);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            graphicsConfiguration &= ~0x18;
            projectionMode = 1;
        }
    }

    final void drawDot(int x, int y, int size, int rgb, int blendingConfiguration) {
        if (size < 0)
            size = -size;
        if (x + size >= scissorX && -size + x <= scissorXB && y + size >= scissorYB && -size + y <= scissorY) {
            configure2DSettings();
            setBlendingConfiguration(blendingConfiguration);
            OpenGL.glColor4ub((byte) (rgb >> 16), (byte) (rgb >> 8), (byte) rgb, (byte) (rgb >> 24));
            float _x = (float) x + 0.35F;
            float _y = (float) y + 0.35F;
            int anLocalInt = size << 1;
            if (smallestPointSize > (float) anLocalInt) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(_x + 1.0F, _y + 1.0F);
                OpenGL.glVertex2f(_x + 1.0F, _y - 1.0F);
                OpenGL.glVertex2f(_x + -1.0F, _y + -1.0F);
                OpenGL.glVertex2f(_x - 1.0F, _y + 1.0F);
                OpenGL.glEnd();
            } else if (largestPointSize >= (float) anLocalInt) {
                OpenGL.glEnable(2832);  //Smoothpoint
                OpenGL.glPointSize((float) anLocalInt);
                OpenGL.glBegin(0);
                OpenGL.glVertex2f(_x, _y);
                OpenGL.glEnd();
                OpenGL.glDisable(2832);
            } else {
                OpenGL.glBegin(6);
                OpenGL.glVertex2f(_x, _y);
                int anLocalInt_243_ = 262144 / (size * 6);
                if (anLocalInt_243_ <= 64)
                    anLocalInt_243_ = 64;
                else if (anLocalInt_243_ > 512)
                    anLocalInt_243_ = 512;
                anLocalInt_243_ = Class392.method4142(anLocalInt_243_, false);
                OpenGL.glVertex2f((float) size + _x, _y);
                for (int anLocalInt_244_ = 16384 - anLocalInt_243_; anLocalInt_244_ > 0; anLocalInt_244_ -= anLocalInt_243_)
                    OpenGL.glVertex2f(_x + ((DoublyLinkedNode_Sub51_Sub2.aFloatArray6226[anLocalInt_244_]) * (float) size), _y + ((float) size * (DoublyLinkedNode_Sub51_Sub2.aFloatArray6224[anLocalInt_244_])));
                OpenGL.glVertex2f(_x + (float) size, _y);
                OpenGL.glEnd();
            }
        }
    }

    final void C(boolean argument_245_) {
        aBoolean4908 = argument_245_;
        applyDepthMaskToggle();
    }

    final void A(int argument_246_, Class_aa argument_247_, int argument_248_, int argument_249_) {
        Class_aa_Sub1 class_aa_sub1 = (Class_aa_Sub1) argument_247_;
        GlTexture_Sub4_Sub1 class142_sub4_sub1 = class_aa_sub1.aClass142_Sub4_Sub1_3746;
        method2296();
        bindTexture(class_aa_sub1.aClass142_Sub4_Sub1_3746);
        setBlendingConfiguration(1);
        setCombineModes(8448, 7681);
        method2334(34167, 768, 0, 34192);
        float f = (class142_sub4_sub1.tileW / (float) class142_sub4_sub1.anInt6552);
        float f_250_ = (class142_sub4_sub1.tileH / (float) class142_sub4_sub1.anInt6545);
        OpenGL.glColor4ub((byte) (argument_246_ >> 16), (byte) (argument_246_ >> 8), (byte) argument_246_, (byte) (argument_246_ >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(f * (float) (-argument_248_ + scissorX), (float) (-argument_249_ + scissorYB) * f_250_);
        OpenGL.glVertex2i(scissorX, scissorYB);
        OpenGL.glTexCoord2f(f * (float) (-argument_248_ + scissorX), (float) (scissorY - argument_249_) * f_250_);
        OpenGL.glVertex2i(scissorX, scissorY);
        OpenGL.glTexCoord2f(f * (float) (-argument_248_ + scissorXB), f_250_ * (float) (-argument_249_ + scissorY));
        OpenGL.glVertex2i(scissorXB, scissorY);
        OpenGL.glTexCoord2f((float) (scissorXB - argument_248_) * f, (float) (scissorYB - argument_249_) * f_250_);
        OpenGL.glVertex2i(scissorXB, scissorYB);
        OpenGL.glEnd();
        method2334(5890, 768, 0, 34192);
    }

    final void method2051() {
        if (aClass59_Sub36_Sub1_4838 != null && aClass59_Sub36_Sub1_4838.method1042(917)) {
            aClass96_4839.method1715(aClass59_Sub36_Sub1_4838, (byte) -19);
            aClass107_4844.method1956((byte) -52);
        }
    }

    private void translateTexture(float y, float z, float x) {
        OpenGL.glMatrixMode(5890);
        if (incrementalTextureTranslates)
            OpenGL.glLoadIdentity();
        OpenGL.glTranslatef(x, y, z);
        OpenGL.glMatrixMode(5888);
        incrementalTextureTranslates = true;
    }

    final void method2329(byte argument_255_, GlFrameBuffer argument_256_) {
        if (anInt4862 >= 3)
            throw new RuntimeException();
        if (anInt4862 >= 0)
            anGlFrameBufferArray4861[anInt4862].unbindForDraw(-16250);
        anGlFrameBuffer_4857 = anGlFrameBufferArray4861[++anInt4862] = argument_256_;
        anGlFrameBuffer_4857.bindForDraw(-114);
    }

    final void drawHLine(int x, int y, int w, int rgb, int blendingConfiguration) {
        configure2DSettings();
        setBlendingConfiguration(blendingConfiguration);
        float _x = (float) x + 0.35F;
        float _y = (float) y + 0.35F;
        OpenGL.glColor4ub((byte) (rgb >> 16), (byte) (rgb >> 8), (byte) rgb, (byte) (rgb >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(_x, _y);
        OpenGL.glVertex2f(_x + (float) w, _y);
        OpenGL.glEnd();
    }

    final void setLights(int usedCount, HardwareLight[] lights) {
        System.arraycopy(lights, 0, activeLights, 0, usedCount);
        usedLightCount = usedCount;
        if (projectionMode != 1)
            loadLights();
    }

    final void setFog(int argument_265_, int argument_266_, int argument_267_) {
        if (this.fogColour != argument_265_ || argument_266_ != this.anInt4896 || argument_267_ != this.anInt4932) {
            this.fogColour = argument_265_;
            this.anInt4896 = argument_266_;
            this.anInt4932 = argument_267_;
            loadFog();
            applyFogToggle();
        }
    }

    final void setActiveTextureUnit(int textureUnit) {
        if (textureUnit != currentTexture) {
            OpenGL.glActiveTexture(textureUnit + 33984);
            currentTexture = textureUnit;
        }
    }

    final void method2331(GlFrameBuffer argument_271_) {
        if (!this.haveFBBlit) {
            if (anInt4854 >= 3)
                throw new RuntimeException();
            if (anInt4854 >= 0)
                anGlFrameBufferArray4859[anInt4854].unbind(15427);
            anGlFrameBuffer_4863 = anGlFrameBuffer_4857 = anGlFrameBufferArray4859[++anInt4854] = argument_271_;
            anGlFrameBuffer_4863.bind((byte) -100);
        } else {
            method2309(argument_271_, -1);
            method2329((byte) 125, argument_271_);
        }
    }

    private void applyDepthMaskToggle() {
        OpenGL.glDepthMask(aBoolean4875 && aBoolean4908);
    }

    final void method2048() {
        if (aBoolean4885 && this.viewportW > 0 && this.viewportH > 0) {
            int anLocalInt = scissorX;
            int anLocalInt_273_ = scissorXB;
            int anLocalInt_274_ = scissorYB;
            int anLocalInt_275_ = scissorY;
            clearClip();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            setMode0();
            setFogEnabled(false);
            setLightingEnabled(false);
            setDepthTestEnabled(false);
            method2276(false);
            bindTexture((GlTexture) null);
            method2333(-2);
            setCombineMode(1);
            setBlendingConfiguration(0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.viewportW, this.viewportH, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            setClip(anLocalInt, anLocalInt_275_, anLocalInt_273_, anLocalInt_274_);
        }
    }

    final void method2333(int argument_276_) {
        method2307(true, argument_276_);
    }

    final void method2058() {
        if (!this.haveFBO) {
            if (!havePBuffers)
                throw new RuntimeException("");
            aClass368_Sub3_4856.method4013(0, 0, this.viewportW, this.viewportH, 0, 0);
            myGL.setSurface(aLong4831);
        } else {
            if (anGlFrameBuffer_4857 != aGlExtFramebuffer_4855)
                throw new RuntimeException();
            aGlExtFramebuffer_4855.detachObject(0);
            aGlExtFramebuffer_4855.detachObject(8);
            detachFBO(aGlExtFramebuffer_4855, false);
        }
        this.viewportW = canvasWidth;
        aClass368_Sub3_4856 = null;
        this.viewportH = canvasHeight;
        setMode0();
        loadViewport();
        clearClip();
    }

    final void setSun(int argument_278_, float argument_279_, float argument_280_, float argument_281_, float argument_282_, float argument_283_) {
        boolean anLocalBoolean = anInt4922 != argument_278_;
        if (anLocalBoolean || this.light1Intensity != argument_279_ || this.light2NegIntensity != argument_280_) {
            this.light1Intensity = argument_279_;
            anInt4922 = argument_278_;
            this.light2NegIntensity = argument_280_;
            if (anLocalBoolean) {
                this.lightBlue = (float) (anInt4922 & 0xff) / 255.0F;
                this.lightGreen = (float) (anInt4922 & 0xff00) / 65280.0F;
                this.lightRed = (float) (anInt4922 & 0xff0000) / 1.671168E7F;
                loadLightModel();
            }
            setupLightColours();
        }
        if (aFloatArray4941[0] != argument_281_ || aFloatArray4941[1] != argument_282_ || aFloatArray4941[2] != argument_283_) {
            aFloatArray4941[2] = argument_283_;
            aFloatArray4941[0] = argument_281_;
            aFloatArray4941[1] = argument_282_;
            aFloatArray4949[1] = -argument_282_;
            aFloatArray4949[0] = -argument_281_;
            aFloatArray4949[2] = -argument_283_;
            float f = (float) (1.0 / Math.sqrt((double) (argument_281_ * argument_281_ + (argument_282_ * argument_282_) + (argument_283_ * argument_283_))));
            this.sunDirection[0] = f * argument_281_;
            this.sunDirection[1] = argument_282_ * f;
            this.sunDirection[2] = argument_283_ * f;
            light1Position[2] = -this.sunDirection[2];
            light1Position[0] = -this.sunDirection[0];
            light1Position[1] = -this.sunDirection[1];
            loadLightPositions();
            this.anInt4886 = (int) (argument_281_ * 256.0F / argument_282_);
            this.anInt4930 = (int) (argument_283_ * 256.0F / argument_282_);
        }
    }

    final void method2087(Interface15 argument_284_) {
        /* empty */
    }

    final void method2095(int argument_285_, int argument_286_, int argument_287_, int argument_288_, int argument_289_, int argument_290_, int argument_291_) {
        OpenGL.glLineWidth((float) argument_290_);
        drawLine(argument_285_, argument_286_, argument_287_, argument_288_, argument_289_, argument_291_);
        OpenGL.glLineWidth(1.0F);
    }

    final void method2334(int argument_292_, int argument_293_, int argument_294_, int argument_295_) {
        OpenGL.glTexEnvi(8960, argument_294_ + 34176, argument_292_);
        OpenGL.glTexEnvi(8960, argument_295_ + argument_294_, argument_293_);
    }

    final void setFogEnabled(boolean fogEnabled) {
        if (!this.fogEnabled == fogEnabled) {
            this.fogEnabled = fogEnabled;
            applyFogToggle();
            graphicsConfiguration &= ~0x1f;
        }
    }

    final Class368 method2082(int[] argument_298_, int argument_299_, int argument_300_, int argument_301_, int argument_302_, boolean argument_303_) {
        return new Class368_Sub3(this, argument_301_, argument_302_, argument_298_, argument_299_, argument_300_);
    }

    final void method2043(int argument_304_) {
        method2288(2910);
    }

    final Class350 method2096() {
        return this.aClass350_Sub3_4881;
    }

    final void method2074(Class72 argument_305_, int argument_306_) {
        aClass90_4842.method1681(64, argument_305_, argument_306_, this);
    }

    final void method2023() {
        for (Node node = aCyclicLinkedList_4853.getFirst(); node != null; node = aCyclicLinkedList_4853.getNext())
            ((dba_sub_772_Sub1) node).method1308((byte) -125);
        if (aClass96_4839 != null)
            aClass96_4839.method1706(-115);
        if (myGL != null) {
            method2288(2910);
            Enumeration enumeration = canvasTable.keys();
            while (enumeration.hasMoreElements()) {
                Canvas canvas = (Canvas) enumeration.nextElement();
                Long var_long = (Long) canvasTable.get(canvas);
                myGL.releaseSurface(canvas, var_long.longValue());
            }
            myGL.release();
            myGL = null;
        }
        if (aBoolean4849) {
            Class112.method2009(true, -11692, false);
            aBoolean4849 = false;
        }
    }

    final void drawLine(int x, int y, int x2, int y2, int colour, int blendConf) {
        configure2DSettings();
        setBlendingConfiguration(blendConf);
        float w = (float) x2 - (float) x;
        float h = (float) y2 - (float) y;
        if (w == 0.0F && h == 0.0F)
            w = 1.0F;
        else {
            float f_314_ = (float) (1.0 / Math.sqrt((double) (h * h + w * w)));
            h *= f_314_;
            w *= f_314_;
        }
        OpenGL.glColor4ub((byte) (colour >> 16), (byte) (colour >> 8), (byte) colour, (byte) (colour >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) x + 0.35F, (float) y + 0.35F);
        OpenGL.glVertex2f(w + (float) x2 + 0.35F, h + (float) y2 + 0.35F);
        OpenGL.glEnd();
    }

    final void method2336(int argument_315_, Class350_Sub3 argument_316_) {
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(argument_316_.method3874(false), 0);
    }

    final int method2016() {
        return 4;
    }

    final boolean method2042() {
        return true;
    }

    final void method2059(float argument_317_, float argument_318_, float argument_319_) {
        Statics.aFloat6377 = argument_319_;
        Class204.aFloat1458 = argument_318_;
        Class46_Sub1.aFloat3837 = argument_317_;
    }

    private void loadLights() {
        int lightId;
        for (lightId = 0; lightId < usedLightCount; lightId++) {
            HardwareLight hardwareLight = activeLights[lightId];
            int glLightID = lightId + 16386;
            lightValueBuffer[0] = (float) hardwareLight.getX();
            lightValueBuffer[1] = (float) hardwareLight.getY();
            lightValueBuffer[2] = (float) hardwareLight.getZ();
            lightValueBuffer[3] = 1.0F;
            OpenGL.glLightfv(glLightID, 4611, lightValueBuffer, 0);
            int diffuse = hardwareLight.getColour();
            float intensity = hardwareLight.getColourIntensity() / 255.0F;
            lightValueBuffer[0] = (float) ((diffuse & 0xff0000) >> 16) * intensity;
            lightValueBuffer[1] = (float) ((diffuse & 0xff00) >> 8) * intensity;
            lightValueBuffer[2] = (float) (diffuse & 0xff) * intensity;
            OpenGL.glLightfv(glLightID, 4609, lightValueBuffer, 0);
            OpenGL.glLightf(glLightID, 4617, (1.0F / (float) (hardwareLight.getRadius() * hardwareLight.getRadius())));
            OpenGL.glEnable(glLightID);
        }
        for (/**/; lightId < previousUsedLightCount; lightId++)
            OpenGL.glDisable(16386 + lightId);
        previousUsedLightCount = usedLightCount;
    }

    final void T(int x, int y, int xb, int yb) {
        if (y > scissorYB)
            scissorYB = y;
        if (scissorY > yb)
            scissorY = yb;
        if (scissorXB > xb)
            scissorXB = xb;
        if (scissorX < x)
            scissorX = x;
        OpenGL.glEnable(3089);
        method2291((byte) -52);
        loadScissor();
    }

    final int sizeof(int format) {
        switch (format) {
            case 6406:
            case 6409:
                return 1;
            case 6410:
            case 34846:
            case 34844:
                return 2;
            case 6407:
                return 3;
            case 6408:
            case 34847:
                return 4;
            case 34843:
                return 6;
            case 34842:
                return 8;
            case 6402:
                return 3;
            case 6401:
                return 1;
            default:
                throw new IllegalArgumentException("");
        }
    }

    final synchronized void requestBufferDeletion(int ptr, int size) {
        IntegerNode class59_sub54 = new IntegerNode(size);
        ((Node) class59_sub54).hash = (long) ptr;
        arbBufferDeleteQueue.add(class59_sub54);
    }

    final Class350 method2029() {
        return new Class350_Sub3();
    }

    final void method2053(int argument_332_) {
        if (argument_332_ < 128 || argument_332_ > 1024)
            throw new IllegalArgumentException();
        this.anInt4841 = argument_332_;
        aClass107_4844.method1956((byte) -101);
    }

    final Skybox createSkybox(int argument_333_, int argument_334_, int argument_335_, int argument_336_, int argument_337_, int argument_338_) {
        if (this.haveTextureCubeMap)
            return new GlImageSkybox(this, argument_333_, argument_334_, argument_335_, argument_336_, argument_337_, argument_338_);
        return null;
    }

    final Class_s method2085(int argument_339_, int argument_340_, int[][] argument_341_, int[][] argument_342_, int argument_343_, int argument_344_, int argument_345_) {
        return new Class_s_Sub2(this, argument_344_, argument_345_, argument_339_, argument_340_, argument_341_, argument_342_, argument_343_);
    }

    private void method2340(int argument_346_) {
        float[] fs = projectionMatrix;
        float f = ((float) (-this.anInt4993 * this.anInt4920) / (float) this.anInt4900);
        if (argument_346_ != 29021)
            loadLightModel();
        float f_347_ = ((float) ((this.viewportW - this.anInt4993) * this.anInt4920) / (float) this.anInt4900);
        float f_348_ = ((float) (this.anInt4972 * this.anInt4920) / (float) this.anInt4956);
        float f_349_ = ((float) ((-this.viewportH + this.anInt4972) * this.anInt4920) / (float) this.anInt4956);
        if (f != f_347_ && f_348_ != f_349_) {
            float f_350_ = (float) this.anInt4920 * 2.0F;
            fs[2] = 0.0F;
            fs[7] = 0.0F;
            fs[8] = (f_347_ + f) / (-f + f_347_);
            fs[6] = 0.0F;
            fs[14] = aFloat4921 = (-((float) anInt4951 * f_350_) / (float) (-this.anInt4920 + anInt4951));
            fs[0] = f_350_ / (-f + f_347_);
            fs[15] = 0.0F;
            fs[1] = 0.0F;
            fs[5] = f_350_ / (-f_349_ + f_348_);
            fs[10] = aFloat4983 = ((float) -(this.anInt4920 + anInt4951) / (float) (anInt4951 - this.anInt4920));
            fs[12] = 0.0F;
            fs[3] = 0.0F;
            fs[13] = 0.0F;
            fs[4] = 0.0F;
            fs[9] = (f_349_ + f_348_) / (-f_349_ + f_348_);
            fs[11] = -1.0F;
        } else {
            fs[0] = 1.0F;
            fs[13] = 0.0F;
            fs[5] = 1.0F;
            fs[14] = 0.0F;
            fs[4] = 0.0F;
            fs[1] = 0.0F;
            fs[8] = 0.0F;
            fs[15] = 1.0F;
            fs[3] = 0.0F;
            fs[6] = 0.0F;
            fs[11] = 0.0F;
            fs[12] = 0.0F;
            fs[10] = 1.0F;
            fs[7] = 0.0F;
            fs[9] = 0.0F;
            fs[2] = 0.0F;
        }
        method2318(22545);
    }

    final void setBlendingConfiguration(int argument_352_) {
        if (blendingConfiguration != argument_352_) {
            int blendingMode;
            boolean enableColour;
            boolean enableAlphaTest;
            switch (argument_352_) {
                case 1:
                    blendingMode = 1;
                    enableColour = true;
                    enableAlphaTest = true;
                    break;
                case 2:
                    blendingMode = 2;
                    enableAlphaTest = false;
                    enableColour = true;
                    break;
                case 128:
                    blendingMode = 3;
                    enableColour = true;
                    enableAlphaTest = true;
                    break;
                default:
                    enableAlphaTest = false;
                    blendingMode = 0;
                    enableColour = true;
                    break;
            }
            if (colourWritingDisabled == !enableColour) {
                OpenGL.glColorMask(enableColour, enableColour, enableColour, true);
                colourWritingDisabled = enableColour;
            }
            if (!alphaTestEnabled != !enableAlphaTest) {
                if (enableAlphaTest)
                    OpenGL.glEnable(3008);
                else
                    OpenGL.glDisable(3008);
                alphaTestEnabled = enableAlphaTest;
            }
            if (blendingMode != this.blendingMode) {
                switch (blendingMode) {
                    case 1:
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(770, 771);  //SRC,1-SRC
                        break;
                    case 2:
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);      //ONE,ONE
                        break;
                    case 3:
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);    //DST_COLOR,ONE
                        break;
                    default:
                        OpenGL.glDisable(3042);
                        break;
                }
                this.blendingMode = blendingMode;
            }
            graphicsConfiguration &= ~0x1c;
            blendingConfiguration = argument_352_;
        }
    }

    final void method2073(boolean argument_354_) {
        /* empty */
    }

    final HardwareLight createLight(int argument_355_, int argument_356_, int argument_357_, int argument_358_, int argument_359_, float argument_360_) {
        return new GlHardwareLight(argument_355_, argument_356_, argument_357_, argument_358_, argument_359_, argument_360_);
    }

    final int or(int argument_361_, int argument_362_) {
        return argument_362_ | argument_361_;
    }

    private void loadStoredProjection() {
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(projectionMatrix, 0);
        OpenGL.glMatrixMode(5888);
    }

    final void method2343() {
        if (graphicsConfiguration != 16) {
            setupConfig3();
            setFogEnabled(true);
            setDepthTestEnabled(true);
            method2276(true);
            setBlendingConfiguration(1);
            graphicsConfiguration = 16;
        }
    }

    final void bindArrayBuffer(GlArrayBuffer argument_366_) {
        if (boundArrayBuffer != argument_366_) {
            if (haveVBO)
                OpenGL.glBindBufferARB(34962, argument_366_.getARBPointer());
            boundArrayBuffer = argument_366_;
        }
    }

    final int JA(int argument_367_, int argument_368_, int argument_369_, int argument_370_, int argument_371_, int argument_372_) {
        int anLocalInt = 0;
        float f = ((this.aClass350_Sub3_4881.aFloat5462) + (((float) argument_367_ * this.aClass350_Sub3_4881.aFloat5455) + (this.aClass350_Sub3_4881.aFloat5465 * (float) argument_368_) + (this.aClass350_Sub3_4881.aFloat5461 * (float) argument_369_)));
        if (f < 1.0F)
            f = 1.0F;
        float f_373_ = (((float) argument_371_ * (this.aClass350_Sub3_4881.aFloat5465)) + ((float) argument_370_ * this.aClass350_Sub3_4881.aFloat5455) + ((float) argument_372_ * this.aClass350_Sub3_4881.aFloat5461) + (this.aClass350_Sub3_4881.aFloat5462));
        if (f_373_ < 1.0F)
            f_373_ = 1.0F;
        if (f < (float) this.anInt4920 && (float) this.anInt4920 > f_373_)
            anLocalInt |= 0x10;
        else if ((float) anInt4951 < f && (float) anInt4951 < f_373_)
            anLocalInt |= 0x20;
        int anLocalInt_374_ = (int) (((this.aClass350_Sub3_4881.aFloat5460 * (float) argument_368_) + ((float) argument_367_ * this.aClass350_Sub3_4881.aFloat5458) + (this.aClass350_Sub3_4881.aFloat5463 * (float) argument_369_) + this.aClass350_Sub3_4881.aFloat5459) * (float) this.anInt4900 / f);
        int anLocalInt_375_ = (int) ((float) this.anInt4900 * ((this.aClass350_Sub3_4881.aFloat5460 * (float) argument_371_) + ((float) argument_370_ * (this.aClass350_Sub3_4881.aFloat5458)) + (this.aClass350_Sub3_4881.aFloat5463 * (float) argument_372_) + this.aClass350_Sub3_4881.aFloat5459) / f_373_);
        if ((float) anLocalInt_374_ < this.aFloat4952 && this.aFloat4952 > (float) anLocalInt_375_)
            anLocalInt |= 0x1;
        else if ((float) anLocalInt_374_ > this.aFloat4915 && ((float) anLocalInt_375_ > this.aFloat4915))
            anLocalInt |= 0x2;
        int anLocalInt_376_ = (int) (((this.aClass350_Sub3_4881.aFloat5466 * (float) argument_369_) + ((this.aClass350_Sub3_4881.aFloat5457 * (float) argument_367_) + ((float) argument_368_ * (this.aClass350_Sub3_4881.aFloat5456))) + this.aClass350_Sub3_4881.aFloat5467) * (float) this.anInt4956 / f);
        int anLocalInt_377_ = (int) (((this.aClass350_Sub3_4881.aFloat5466 * (float) argument_372_) + ((this.aClass350_Sub3_4881.aFloat5457 * (float) argument_370_) + ((float) argument_371_ * (this.aClass350_Sub3_4881.aFloat5456))) + this.aClass350_Sub3_4881.aFloat5467) * (float) this.anInt4956 / f_373_);
        if (!((float) anLocalInt_376_ < this.aFloat4934) || !((float) anLocalInt_377_ < this.aFloat4934)) {
            if ((float) anLocalInt_376_ > this.aFloat4899 && (float) anLocalInt_377_ > this.aFloat4899)
                anLocalInt |= 0x8;
        } else
            anLocalInt |= 0x4;
        return anLocalInt;
    }

    final void method2068(int argument_378_, int argument_379_, int argument_380_, int argument_381_, int argument_382_, int argument_383_, Class_aa argument_384_, int argument_385_, int argument_386_, int argument_387_, int argument_388_, int argument_389_) {
        if (argument_380_ != argument_378_ || argument_381_ != argument_379_) {
            Class_aa_Sub1 class_aa_sub1 = (Class_aa_Sub1) argument_384_;
            GlTexture_Sub4_Sub1 class142_sub4_sub1 = class_aa_sub1.aClass142_Sub4_Sub1_3746;
            method2296();
            bindTexture((class_aa_sub1.aClass142_Sub4_Sub1_3746));
            setBlendingConfiguration(argument_383_);
            setCombineModes(8448, 7681);
            method2334(34167, 768, 0, 34192);
            float f = (class142_sub4_sub1.tileW / (float) (class142_sub4_sub1.anInt6552));
            float f_390_ = (class142_sub4_sub1.tileH / (float) (class142_sub4_sub1.anInt6545));
            float f_391_ = (float) argument_380_ - (float) argument_378_;
            float f_392_ = (float) -argument_379_ + (float) argument_381_;
            float f_393_ = (float) (1.0 / Math.sqrt((double) (f_392_ * f_392_ + f_391_ * f_391_)));
            OpenGL.glColor4ub((byte) (argument_382_ >> 16), (byte) (argument_382_ >> 8), (byte) argument_382_, (byte) (argument_382_ >> 24));
            f_391_ *= f_393_;
            argument_389_ %= argument_387_ + argument_388_;
            f_392_ *= f_393_;
            float f_394_ = f_391_ * (float) argument_387_;
            float f_395_ = f_392_ * (float) argument_387_;
            float f_396_ = 0.0F;
            float f_397_ = 0.0F;
            float f_398_ = f_394_;
            float f_399_ = f_395_;
            if (argument_387_ >= argument_389_) {
                f_398_ = f_391_ * (float) (argument_387_ - argument_389_);
                f_399_ = f_392_ * (float) (-argument_389_ + argument_387_);
            } else {
                f_397_ = (float) (argument_387_ + (argument_388_ - argument_389_)) * f_392_;
                f_396_ = (float) (argument_388_ + (argument_387_ - argument_389_)) * f_391_;
            }
            float f_400_ = (float) argument_378_ + 0.35F + f_396_;
            float f_401_ = f_397_ + ((float) argument_379_ + 0.35F);
            float f_402_ = (float) argument_388_ * f_391_;
            float f_403_ = f_392_ * (float) argument_388_;
            for (; ; ) {
                if (argument_378_ < argument_380_) {
                    if (f_400_ > (float) argument_380_ + 0.35F)
                        break;
                    if ((float) argument_380_ < f_400_ + f_398_)
                        f_398_ = (float) argument_380_ - f_400_;
                } else {
                    if ((float) argument_380_ + 0.35F > f_400_)
                        break;
                    if (f_398_ + f_400_ < (float) argument_380_)
                        f_398_ = -f_400_ + (float) argument_380_;
                }
                if (argument_379_ >= argument_381_) {
                    if ((float) argument_381_ + 0.35F > f_401_)
                        break;
                    if ((float) argument_381_ > f_401_ + f_399_)
                        f_399_ = -f_401_ + (float) argument_381_;
                } else {
                    if (f_401_ > (float) argument_381_ + 0.35F)
                        break;
                    if (f_399_ + f_401_ > (float) argument_381_)
                        f_399_ = (float) argument_381_ - f_401_;
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f(f * (f_400_ - (float) argument_385_), (((float) -argument_386_ + f_401_) * f_390_));
                OpenGL.glVertex2f(f_400_, f_401_);
                OpenGL.glTexCoord2f(((float) -argument_385_ + (f_398_ + f_400_)) * f, f_390_ * ((float) -argument_386_ + (f_399_ + f_401_)));
                OpenGL.glVertex2f(f_398_ + f_400_, f_401_ + f_399_);
                f_400_ += f_402_ + f_398_;
                f_401_ += f_403_ + f_399_;
                OpenGL.glEnd();
                f_398_ = f_394_;
                f_399_ = f_395_;
            }
            method2334(5890, 768, 0, 34192);
        }
    }

    final void setAmbientIntensity(float argument_404_) {
        if (argument_404_ != this.modelIntensity) {
            this.modelIntensity = argument_404_;
            loadLightModel();
        }
    }

    final boolean method2049() {
        return true;
    }

    final void method2054(int argument_405_, int argument_406_, int argument_407_, int argument_408_, int argument_409_, int argument_410_, int argument_411_, int argument_412_, int argument_413_) {
        if (argument_407_ != argument_405_ || argument_408_ != argument_406_) {
            configure2DSettings();
            setBlendingConfiguration(argument_410_);
            float f = (float) -argument_405_ + (float) argument_407_;
            float f_414_ = (float) -argument_406_ + (float) argument_408_;
            float f_415_ = (float) (1.0 / Math.sqrt((double) (f_414_ * f_414_ + f * f)));
            f_414_ *= f_415_;
            f *= f_415_;
            OpenGL.glColor4ub((byte) (argument_409_ >> 16), (byte) (argument_409_ >> 8), (byte) argument_409_, (byte) (argument_409_ >> 24));
            argument_413_ %= argument_412_ + argument_411_;
            float f_416_ = f * (float) argument_411_;
            float f_417_ = f_414_ * (float) argument_411_;
            float f_418_ = 0.0F;
            float f_419_ = 0.0F;
            float f_420_ = f_416_;
            float f_421_ = f_417_;
            if (argument_413_ > argument_411_) {
                f_419_ = (float) (argument_412_ + argument_411_ - argument_413_) * f_414_;
                f_418_ = f * (float) (argument_412_ + argument_411_ - argument_413_);
            } else {
                f_421_ = (float) (-argument_413_ + argument_411_) * f_414_;
                f_420_ = f * (float) (argument_411_ - argument_413_);
            }
            float f_422_ = (float) argument_405_ + 0.35F + f_418_;
            float f_423_ = (float) argument_406_ + 0.35F + f_419_;
            float f_424_ = (float) argument_412_ * f;
            float f_425_ = (float) argument_412_ * f_414_;
            for (; ; ) {
                if (argument_407_ <= argument_405_) {
                    if ((float) argument_407_ + 0.35F > f_422_)
                        break;
                    if ((float) argument_407_ > f_422_ + f_420_)
                        f_420_ = (float) argument_407_ - f_422_;
                } else {
                    if (f_422_ > (float) argument_407_ + 0.35F)
                        break;
                    if (f_422_ + f_420_ > (float) argument_407_)
                        f_420_ = -f_422_ + (float) argument_407_;
                }
                if (argument_406_ < argument_408_) {
                    if (f_423_ > (float) argument_408_ + 0.35F)
                        break;
                    if ((float) argument_408_ < f_423_ + f_421_)
                        f_421_ = -f_423_ + (float) argument_408_;
                } else {
                    if (f_423_ < (float) argument_408_ + 0.35F)
                        break;
                    if ((float) argument_408_ > f_421_ + f_423_)
                        f_421_ = -f_423_ + (float) argument_408_;
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(f_422_, f_423_);
                OpenGL.glVertex2f(f_420_ + f_422_, f_421_ + f_423_);
                f_422_ += f_420_ + f_424_;
                OpenGL.glEnd();
                f_423_ += f_421_ + f_425_;
                f_420_ = f_416_;
                f_421_ = f_417_;
            }
        }
    }

    final int I() {
        int anLocalInt = anInt5001;
        anInt5001 = 0;
        return anLocalInt;
    }

    final void bind(GlElementBuffer argument_427_) {
        if (argument_427_ != boundElementBuffer) {
            if (haveVBO)
                OpenGL.glBindBufferARB(34963, argument_427_.getARBPointer());
            boundElementBuffer = argument_427_;
        }
    }

    final void bindTexture(GlTexture texture) {
        GlTexture boundTexture = textureArray[currentTexture];
        if (texture != boundTexture) {
            if (texture != null) {
                if (boundTexture != null) {
                    if (texture.type != boundTexture.type) {
                        OpenGL.glDisable(boundTexture.type);
                        OpenGL.glEnable(texture.type);
                    }
                } else
                    OpenGL.glEnable(texture.type);
                OpenGL.glBindTexture(texture.type, texture.getGlPtr());
            } else
                OpenGL.glDisable(boundTexture.type);
            textureArray[currentTexture] = texture;
        }
        graphicsConfiguration &= ~0x1;
    }

    final int XA() {
        return anInt4951;
    }

    final void method2347(int argument_430_, GlFrameBuffer argument_431_) {
        if (anInt4860 < 0 || argument_431_ != anGlFrameBufferArray4858[anInt4860])
            throw new RuntimeException();
        anGlFrameBufferArray4858[anInt4860--] = null;
        argument_431_.unbindForRead(-4055);
        if (anInt4860 < 0)
            anGlFrameBuffer_4863 = null;
        else {
            anGlFrameBuffer_4863 = anGlFrameBufferArray4858[anInt4860];
            anGlFrameBuffer_4863.bindForRead((byte) 78);
        }
    }

    final Class368 method2094(int argument_432_, int argument_433_, int argument_434_, int argument_435_, boolean argument_436_) {
        return new Class368_Sub3(this, argument_432_, argument_433_, argument_434_, argument_435_);
    }

    final void method2348(GlFrameBuffer argument_437_, boolean argument_438_) {
        if (anInt4862 < 0 || anGlFrameBufferArray4861[anInt4862] != argument_437_)
            throw new RuntimeException();
        anGlFrameBufferArray4861[anInt4862--] = null;
        argument_437_.unbindForDraw(-16250);
        if (anInt4862 < 0)
            anGlFrameBuffer_4857 = null;
        else {
            anGlFrameBuffer_4857 = anGlFrameBufferArray4861[anInt4862];
            anGlFrameBuffer_4857.bindForDraw(-106);
        }
    }

    final void method2018(Canvas argument_439_) {
        aLong4831 = 0L;
        myCanvas = null;
        if (argument_439_ != null && argument_439_ != currentCanvas) {
            if (canvasTable.containsKey(argument_439_)) {
                Long var_long = (Long) canvasTable.get(argument_439_);
                aLong4831 = var_long.longValue();
                myCanvas = argument_439_;
            }
        } else {
            myCanvas = currentCanvas;
            aLong4831 = surfaceId;
        }
        if (myCanvas == null || aLong4831 == 0L)
            throw new RuntimeException();
        myGL.setSurface(aLong4831);
        setupDimensions();
    }

    GlToolkit(Canvas argument_440_, TextureSource argument_441_, int argument_442_) {
        super(argument_441_);
        anGlFrameBufferArray4858 = new GlFrameBuffer[4];
        anGlFrameBufferArray4859 = new GlFrameBuffer[4];
        anGlFrameBufferArray4861 = new GlFrameBuffer[4];
        anInt4862 = -1;
        new DCyclicLinkedList();
        new JagexHashMap(16);
        displayListDeleteQueue = new CyclicLinkedList();
        arbBufferDeleteQueue = new CyclicLinkedList();
        textureDeleteQueue = new CyclicLinkedList();
        frameBufferDeleteQueue = new CyclicLinkedList();
        renderBufferDeleteQueue = new CyclicLinkedList();
        programDeleteQueue = new CyclicLinkedList();
        objectDeleteQueue = new CyclicLinkedList();
        this.aClass350_Sub3_4881 = new Class350_Sub3();
        this.lightingMatrix = new Class350_Sub3();
        this.aClass350_Sub3_4884 = new Class350_Sub3();
        alphaCombineMode = 8448;
        this.anInt4900 = 512;
        largestPointSize = -1.0F;
        this.sunDirection = new float[4];
        this.anInt4896 = -1;
        scissorXB = 0;
        this.anInt4920 = 50;
        this.anInt4932 = 0;
        scissorYB = 0;
        viewportX = 0;
        viewportY = 0;
        anInt4951 = 3584;
        activeLights = new HardwareLight[Class68.anInt3584];
        this.anInt4956 = 512;
        this.lightGreen = 1.0F;
        anInt4922 = -1;
        aFloatArray4949 = new float[4];
        light1Position = new float[4];
        this.light2NegIntensity = -1.0F;
        this.light1Intensity = -1.0F;
        aFloat4947 = 1.0F;
        this.fogColour = -1;
        aBoolean4931 = false;
        this.lightRed = 1.0F;
        projectionMatrix = new float[16];
        scissorY = 0;
        aFloatArray4941 = new float[4];
        this.aFloat4964 = 3584.0F;
        this.anInt4972 = 0;
        aFloat4967 = 1.0F;
        scissorX = 0;
        colourCombineMode = 8448;
        this.anInt4974 = 0;
        aBoolean4908 = true;
        this.aFloat4991 = 3584.0F;
        this.anInt4988 = -1;
        this.anInt4993 = 0;
        this.anInt4980 = -1;
        this.lightBlue = 1.0F;
        smallestPointSize = -1.0F;
        aFloat4995 = 0.0F;
        this.aClass59_Sub28_Sub2_4957 = new FloatPacket(8192);
        this.anIntArray4999 = new int[1];
        this.anIntArray4997 = new int[1];
        this.anIntArray4998 = new int[1];
        this.aByteArray5000 = new byte[16384];
        myCanvas = currentCanvas = argument_440_;
        this.anInt4840 = argument_442_;
        if (!NativeManager.method2978("jaclib"))
            throw new RuntimeException("");
        if (!NativeManager.method2978("jaggl"))
            throw new RuntimeException("");
        try {
            myGL = new OpenGL();
            aLong4831 = surfaceId = myGL.init(argument_440_, 8, 8, 8, 24, 0, this.anInt4840);
            if (surfaceId == 0L)
                throw new RuntimeException("");
            assignThread();
            int anLocalInt = getCaps();
            if (anLocalInt != 0)
                throw new RuntimeException("");
            this.framebufferFormat = this.isBigEndian ? 33639 : 5121;
            if (glRendererString.indexOf("radeon") != -1) {
                int anLocalInt_443_ = 0;
                boolean anLocalBoolean = false;
                boolean anLocalBoolean_444_ = false;
                String[] strings = JagexStringUtils.split(glRendererString.replace('/', ' '), 0, ' ');
                for (int anLocalInt_445_ = 0; strings.length > anLocalInt_445_; anLocalInt_445_++) {
                    String string = strings[anLocalInt_445_];
                    try {
                        if (string.length() > 0) {
                            if (string.charAt(0) == 'x' && string.length() >= 3 && Class230.method3073(string.substring(1, 3), 0)) {
                                anLocalBoolean_444_ = true;
                                string = string.substring(1);
                            }
                            if (string.equals("hd"))
                                anLocalBoolean = true;
                            else {
                                if (string.startsWith("hd")) {
                                    string = string.substring(2);
                                    anLocalBoolean = true;
                                }
                                if (string.length() >= 4 && Class230.method3073(string.substring(0, 4), 0)) {
                                    anLocalInt_443_ = (JagexStringUtils.parseInt(string.substring(0, 4)));
                                    break;
                                }
                            }
                        }
                    } catch (Exception exception) {
                        /* empty */
                    }
                }
                if (!anLocalBoolean || anLocalInt_443_ < 4000)
                    this.haveTextureFloat = false;
                if (!anLocalBoolean_444_ && !anLocalBoolean) {
                    if (anLocalInt_443_ >= 7000 && anLocalInt_443_ <= 7999)
                        haveVBO = false;
                    if (anLocalInt_443_ >= 7000 && anLocalInt_443_ <= 9250)
                        this.haveTexture3D = false;
                }
                this.haveTextureRectangle &= myGL.hasCapability("GL_ARB_half_float_pixel");
                aBoolean4982 = haveVBO;
                this.aBoolean4992 = true;
            }
            if (glVendorString.indexOf("intel") != -1)
                this.haveFBO = false;
            aBoolean4885 = !glVendorString.equals("s3 graphics");
            if (haveVBO) {
                try {
                    int[] anLocalInts = new int[1];
                    OpenGL.glGenBuffersARB(1, anLocalInts, 0);
                } catch (Throwable throwable) {
                    throw new RuntimeException("");
                }
            }
            Node_Sub47_Sub1.method1116(true, false, true);
            aBoolean4849 = true;
            aClass107_4844 = new Class107(this, this.textureSource);
            method2308(1);
            this.aClass196_4848 = new Class196(this);
            aClass96_4839 = new Class96(this);
            if (aClass96_4839.method1710((byte) -73)) {
                aClass59_Sub36_Sub1_4838 = new Node_Sub36_Sub1(this);
                if (!aClass59_Sub36_Sub1_4838.method1053(256)) {
                    aClass59_Sub36_Sub1_4838.method1051(-82);
                    aClass59_Sub36_Sub1_4838 = null;
                }
            }
            aClass65_4843 = new Class65(this);
            initialize(true);
            setupDimensions();
            method2048();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            method2023();
            throw new RuntimeException("");
        }
    }

    final GlArrayBuffer method2349(Buffer argument_446_, boolean argument_447_, int argument_448_, int argument_449_, int argument_450_) {
        if (haveVBO && (!argument_447_ || aBoolean4982))
            return new ArbArrayBuffer(this, argument_450_, argument_446_, argument_448_, argument_447_);
        return new GlGeometryArray(this, argument_450_, argument_446_);
    }

    final Interface17 method2077(int argument_451_, int argument_452_) {
        return null;
    }

    final void setTextureAlphaCombiners(int source_id, int operand, int source_to_use) {
        OpenGL.glTexEnvi(8960, source_id + 34184, source_to_use);
        OpenGL.glTexEnvi(8960, source_id + 34200, operand);
    }

    final void getViewportSize(int[] argument_457_) {
        argument_457_[0] = this.viewportW;
        argument_457_[1] = this.viewportH;
    }

    final int sizeofPoly(int type) {
        if (type == 5121 || type == 5120)
            return 1;
        if (type == 5123 || type == 5122)
            return 2;
        if (type == 5125 || type == 5124 || type == 5126)
            return 4;
        throw new IllegalArgumentException("");
    }

    final boolean method2065() {
        return false;
    }

    final Skybox method2045(Skybox argument_460_, Skybox argument_461_, float argument_462_, Skybox argument_463_) {
        if (argument_460_ != null && argument_461_ != null && this.haveTextureCubeMap && this.haveFBO) {
            GlInterpolatedSkybox interpolatedClass67 = null;
            GlSkybox glClass67 = (GlSkybox) argument_460_;
            GlSkybox glClass67_464_ = (GlSkybox) argument_461_;
            GlCubeMap class142_sub1 = glClass67.getCubeMap();
            GlCubeMap class142_sub1_465_ = glClass67_464_.getCubeMap();
            if (class142_sub1 != null && class142_sub1_465_ != null) {
                int anLocalInt = ((class142_sub1.size > class142_sub1_465_.size) ? class142_sub1.size : class142_sub1_465_.size);
                if (argument_463_ != argument_460_ && argument_461_ != argument_463_ && argument_463_ instanceof GlInterpolatedSkybox) {
                    GlInterpolatedSkybox interpolatedClass67_2 = (GlInterpolatedSkybox) argument_463_;
                    if (interpolatedClass67_2.getSize() == anLocalInt)
                        interpolatedClass67 = interpolatedClass67_2;
                }
                if (interpolatedClass67 == null)
                    interpolatedClass67 = new GlInterpolatedSkybox(this, anLocalInt);
                if (interpolatedClass67.combineCubemaps(class142_sub1_465_, class142_sub1, argument_462_))
                    return interpolatedClass67;
            }
        }
        if (!(argument_462_ < 0.5F))
            return argument_461_;
        return argument_460_;
    }

    final void method2071() {
        /* empty */
    }

    final void fillRect(int x, int y, int w, int h, int rgb, int blendingConfiguration) {
        float _x = (float) x + 0.35F;
        float _y = (float) y + 0.35F;
        float _xb = (float) w + _x;
        float _yb = _y + (float) h;
        configure2DSettings();
        setBlendingConfiguration(blendingConfiguration);
        OpenGL.glColor4ub((byte) (rgb >> 16), (byte) (rgb >> 8), (byte) rgb, (byte) (rgb >> 24));
        if (haveMultisample)
            OpenGL.glDisable(32925);
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(_x, _y);
        OpenGL.glVertex2f(_x, _yb);
        OpenGL.glVertex2f(_xb, _yb);
        OpenGL.glVertex2f(_xb, _y);
        OpenGL.glEnd();
        if (haveMultisample)
            OpenGL.glEnable(32925);
    }

    public static void cleanStatics() {
        Statics.aStringArray4827 = null;
    }

    final void method2031(int argument_476_, int argument_477_, int argument_478_, int argument_479_, int argument_480_, int argument_481_, Class_aa argument_482_, int argument_483_, int argument_484_) {
        Class_aa_Sub1 class_aa_sub1 = (Class_aa_Sub1) argument_482_;
        GlTexture_Sub4_Sub1 class142_sub4_sub1 = class_aa_sub1.aClass142_Sub4_Sub1_3746;
        method2296();
        bindTexture(class_aa_sub1.aClass142_Sub4_Sub1_3746);
        setBlendingConfiguration(argument_481_);
        setCombineModes(8448, 7681);
        method2334(34167, 768, 0, 34192);
        float f = (class142_sub4_sub1.tileW / (float) class142_sub4_sub1.anInt6552);
        float f_485_ = (class142_sub4_sub1.tileH / (float) class142_sub4_sub1.anInt6545);
        float f_486_ = (float) -argument_476_ + (float) argument_478_;
        float f_487_ = (float) -argument_477_ + (float) argument_479_;
        float f_488_ = (float) (1.0 / Math.sqrt((double) (f_487_ * f_487_ + f_486_ * f_486_)));
        f_486_ *= f_488_;
        OpenGL.glColor4ub((byte) (argument_480_ >> 16), (byte) (argument_480_ >> 8), (byte) argument_480_, (byte) (argument_480_ >> 24));
        f_487_ *= f_488_;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f(f * (float) (argument_476_ - argument_483_), f_485_ * (float) (-argument_484_ + argument_477_));
        OpenGL.glVertex2f((float) argument_476_ + 0.35F, (float) argument_477_ + 0.35F);
        OpenGL.glTexCoord2f((float) (argument_478_ - argument_483_) * f, (float) (-argument_484_ + argument_479_) * f_485_);
        OpenGL.glVertex2f(f_486_ + (float) argument_478_ + 0.35F, f_487_ + (float) argument_479_ + 0.35F);
        OpenGL.glEnd();
        method2334(5890, 768, 0, 34192);
    }

    final Interface21 method2070(int argument_489_, int argument_490_) {
        return null;
    }

    final void method2353(Class350_Sub3 argument_492_) {
        OpenGL.glLoadMatrixf(argument_492_.method3874(false), 0);
    }

    final synchronized void requestTextureDeletion(int glPtr, int size) {
        IntegerNode integerNode = new IntegerNode(size);
        ((Node) integerNode).hash = (long) glPtr;
        textureDeleteQueue.add(integerNode);
    }

    final void da(int argument_496_, int argument_497_, int argument_498_, int[] argument_499_) {
        float f = ((this.aClass350_Sub3_4881.aFloat5462) + ((this.aClass350_Sub3_4881.aFloat5461) * (float) argument_498_ + (((float) argument_497_ * this.aClass350_Sub3_4881.aFloat5465) + ((float) argument_496_ * (this.aClass350_Sub3_4881.aFloat5455)))));
        if (f < (float) this.anInt4920 || f > (float) anInt4951)
            argument_499_[0] = argument_499_[1] = argument_499_[2] = -1;
        else {
            int anLocalInt = (int) ((this.aClass350_Sub3_4881.aFloat5459 + ((this.aClass350_Sub3_4881.aFloat5463) * (float) argument_498_ + (((float) argument_497_ * (this.aClass350_Sub3_4881.aFloat5460)) + (this.aClass350_Sub3_4881.aFloat5458) * (float) argument_496_))) * (float) this.anInt4900 / f);
            int anLocalInt_500_ = (int) ((this.aClass350_Sub3_4881.aFloat5467 + ((this.aClass350_Sub3_4881.aFloat5466) * (float) argument_498_ + (((float) argument_497_ * (this.aClass350_Sub3_4881.aFloat5456)) + (this.aClass350_Sub3_4881.aFloat5457) * (float) argument_496_))) * (float) this.anInt4956 / f);
            if (!(this.aFloat4952 <= (float) anLocalInt) || !((float) anLocalInt <= this.aFloat4915) || !((float) anLocalInt_500_ >= this.aFloat4934) || !((float) anLocalInt_500_ <= this.aFloat4899))
                argument_499_[0] = argument_499_[1] = argument_499_[2] = -1;
            else {
                argument_499_[1] = (int) (-this.aFloat4934 + (float) anLocalInt_500_);
                argument_499_[0] = (int) (-this.aFloat4952 + (float) anLocalInt);
                argument_499_[2] = (int) f;
            }
        }
    }

    final synchronized void processDeletions(int argument_501_) {
        int anLocalInt = 0;
        argument_501_ &= 0x7fffffff;
        while (!arbBufferDeleteQueue.isEmpty()) {
            IntegerNode class59_sub54 = (IntegerNode) arbBufferDeleteQueue.remove();
            deletionBuffer[anLocalInt++] = (int) class59_sub54.hash;
            this.arbBufferMemoryUsage -= class59_sub54.value;
            if (anLocalInt == 1000) {
                OpenGL.glDeleteBuffersARB(anLocalInt, deletionBuffer, 0);
                anLocalInt = 0;
            }
        }
        if (anLocalInt > 0) {
            OpenGL.glDeleteBuffersARB(anLocalInt, deletionBuffer, 0);
            anLocalInt = 0;
        }
        while (!textureDeleteQueue.isEmpty()) {
            IntegerNode class59_sub54 = (IntegerNode) textureDeleteQueue.remove();
            deletionBuffer[anLocalInt++] = (int) class59_sub54.hash;
            this.textureMemoryUsage -= class59_sub54.value;
            if (anLocalInt == 1000) {
                OpenGL.glDeleteTextures(anLocalInt, deletionBuffer, 0);
                anLocalInt = 0;
            }
        }
        if (anLocalInt > 0) {
            OpenGL.glDeleteTextures(anLocalInt, deletionBuffer, 0);
            anLocalInt = 0;
        }
        while (!frameBufferDeleteQueue.isEmpty()) {
            IntegerNode class59_sub54 = (IntegerNode) frameBufferDeleteQueue.remove();
            deletionBuffer[anLocalInt++] = class59_sub54.value;
            if (anLocalInt == 1000) {
                OpenGL.glDeleteFramebuffersEXT(anLocalInt, deletionBuffer, 0);
                anLocalInt = 0;
            }
        }
        if (anLocalInt > 0) {
            OpenGL.glDeleteFramebuffersEXT(anLocalInt, deletionBuffer, 0);
            anLocalInt = 0;
        }
        while (!renderBufferDeleteQueue.isEmpty()) {
            IntegerNode class59_sub54 = (IntegerNode) renderBufferDeleteQueue.remove();
            deletionBuffer[anLocalInt++] = (int) class59_sub54.hash;
            renderBufferMemoryUsage -= class59_sub54.value;
            if (anLocalInt == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(anLocalInt, deletionBuffer, 0);
                anLocalInt = 0;
            }
        }
        if (anLocalInt > 0) {
            OpenGL.glDeleteRenderbuffersEXT(anLocalInt, deletionBuffer, 0);
        }
        while (!displayListDeleteQueue.isEmpty()) {
            IntegerNode request = (IntegerNode) displayListDeleteQueue.remove();
            OpenGL.glDeleteLists((int) request.hash, request.value);
        }
        while (!programDeleteQueue.isEmpty()) {
            Node node = programDeleteQueue.remove();
            OpenGL.glDeleteProgramARB((int) node.hash);
        }
        while (!objectDeleteQueue.isEmpty()) {
            Node node = objectDeleteQueue.remove();
            OpenGL.glDeleteObjectARB(node.hash);
        }
        while (!displayListDeleteQueue.isEmpty()) {
            IntegerNode class59_sub54 = (IntegerNode) displayListDeleteQueue.remove();
            OpenGL.glDeleteLists((int) class59_sub54.hash, class59_sub54.value);
        }
        aClass107_4844.method1957(-18254);
        if (getMemoryUsage() > 100663296 && aLong4874 - -60000L < Applet_Sub1.getGameTime()) {
            System.gc();
            aLong4874 = Applet_Sub1.getGameTime();
        }
        this.anInt4850 = argument_501_;
    }

    final void method2089(int argument_502_) {
        if (argument_502_ != 1)
            throw new IllegalArgumentException("");
    }

    final void method2036(Canvas canvas, int argument_504_, int argument_505_) {
        if (currentCanvas == canvas)
            throw new RuntimeException();
        if (!canvasTable.containsKey(canvas)) {
            if (!canvas.isShowing())
                throw new RuntimeException();
            try {
                Class var_class = Class.forName("java.awt.Canvas");
                Method method = var_class.getMethod("setIgnoreRepaint", new Class[]{Boolean.TYPE});
                method.invoke(canvas, new Object[]{Boolean.TRUE});
            } catch (Exception exception) {
                /* empty */
            }
            long l = myGL.prepareSurface(canvas);
            if (l == -1L)
                throw new RuntimeException();
            canvasTable.put(canvas, new Long(l));
        }
    }

    final void H(int argument_506_, int argument_507_, int argument_508_, int[] argument_509_) {
        float f = ((this.aClass350_Sub3_4881.aFloat5455) * (float) argument_506_ + (this.aClass350_Sub3_4881.aFloat5465) * (float) argument_507_ + ((float) argument_508_ * this.aClass350_Sub3_4881.aFloat5461) + (this.aClass350_Sub3_4881.aFloat5462));
        if (f == 0.0F)
            argument_509_[0] = argument_509_[1] = argument_509_[2] = -1;
        else {
            int anLocalInt = (int) ((float) this.anInt4900 * (this.aClass350_Sub3_4881.aFloat5459 + (((float) argument_508_ * (this.aClass350_Sub3_4881.aFloat5463)) + (((float) argument_507_ * (this.aClass350_Sub3_4881.aFloat5460)) + (this.aClass350_Sub3_4881.aFloat5458) * (float) argument_506_))) / f);
            int anLocalInt_510_ = (int) (((this.aClass350_Sub3_4881.aFloat5456 * (float) argument_507_) + (this.aClass350_Sub3_4881.aFloat5457) * (float) argument_506_ + (this.aClass350_Sub3_4881.aFloat5466) * (float) argument_508_ + (this.aClass350_Sub3_4881.aFloat5467)) * (float) this.anInt4956 / f);
            argument_509_[0] = (int) ((float) anLocalInt - this.aFloat4952);
            argument_509_[1] = (int) ((float) anLocalInt_510_ - this.aFloat4934);
            argument_509_[2] = (int) f;
        }
    }

    final int[] Y() {
        return new int[]{this.anInt4993, this.anInt4972, this.anInt4900, this.anInt4956};
    }

    final void method2014(dba_sub_772 argument_511_) {
        this.heap = (((dba_sub_772_Sub1) argument_511_).aNativeHeap6363);
        if (anGlArrayBuffer_4890 == null) {
            FloatPacket packet = new FloatPacket(80);
            if (this.isBigEndian) {
                packet.pfloat(-1.0F);
                packet.pfloat(-1.0F);
                packet.pfloat(0.0F);
                packet.pfloat(0.0F);
                packet.pfloat(1.0F);
                packet.pfloat(1.0F);
                packet.pfloat(-1.0F);
                packet.pfloat(0.0F);
                packet.pfloat(1.0F);
                packet.pfloat(1.0F);
                packet.pfloat(1.0F);
                packet.pfloat(1.0F);
                packet.pfloat(0.0F);
                packet.pfloat(1.0F);
                packet.pfloat(0.0F);
                packet.pfloat(-1.0F);
                packet.pfloat(1.0F);
                packet.pfloat(0.0F);
                packet.pfloat(0.0F);
                packet.pfloat(0.0F);
            } else {
                packet.ipfloat(-1.0F);
                packet.ipfloat(-1.0F);
                packet.ipfloat(0.0F);
                packet.ipfloat(0.0F);
                packet.ipfloat(1.0F);
                packet.ipfloat(1.0F);
                packet.ipfloat(-1.0F);
                packet.ipfloat(0.0F);
                packet.ipfloat(1.0F);
                packet.ipfloat(1.0F);
                packet.ipfloat(1.0F);
                packet.ipfloat(1.0F);
                packet.ipfloat(0.0F);
                packet.ipfloat(1.0F);
                packet.ipfloat(0.0F);
                packet.ipfloat(-1.0F);
                packet.ipfloat(1.0F);
                packet.ipfloat(0.0F);
                packet.ipfloat(0.0F);
                packet.ipfloat(0.0F);
            }
            anGlArrayBuffer_4890 = method2289(0, packet.pos, (packet.data), false, 20);
            this.aGlInterleavedArray_4905 = new GlInterleavedArray(anGlArrayBuffer_4890, 5126, 3, 0);
            this.aGlInterleavedArray_4897 = new GlInterleavedArray(anGlArrayBuffer_4890, 5126, 2, 12);
            aClass90_4842.method1678(this, 98);
        }
    }

    final void draw3DTriangle(int xA, int yA, int zA, int xB, int yB, int zB, int xC, int yC, int zC, int rgbA, int rgbB, int rgbC, int argument_524_) {
        configure2DSettings();
        setBlendingConfiguration(argument_524_);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (rgbA >> 16), (byte) (rgbA >> 8), (byte) rgbA, (byte) (rgbA >> 24));
        OpenGL.glVertex3f((float) xA + 0.35F, (float) yA + 0.35F, (float) zA);
        OpenGL.glColor4ub((byte) (rgbB >> 16), (byte) (rgbB >> 8), (byte) rgbB, (byte) (rgbB >> 24));
        OpenGL.glVertex3f((float) xB + 0.35F, (float) yB + 0.35F, (float) zB);
        OpenGL.glColor4ub((byte) (rgbC >> 16), (byte) (rgbC >> 8), (byte) rgbC, (byte) (rgbC >> 24));
        OpenGL.glVertex3f((float) xC + 0.35F, (float) yC + 0.35F, (float) zC);
        OpenGL.glEnd();
    }

    final boolean method2076() {
        return true;
    }

    final boolean method2064() {
        return false;
    }

    final int[] getPixels(int x, int y, int w, int h) {
        int[] pixels = new int[w * h];
        for (int _y = 0; _y < h; _y++)
            OpenGL.glReadPixelsi(x, (-_y - y + this.viewportH), w, 1, 32993, this.framebufferFormat, pixels, w * _y);
        return pixels;
    }

    final void method2080(boolean argument_529_) {
        /* empty */
    }
    static {

    }
}
