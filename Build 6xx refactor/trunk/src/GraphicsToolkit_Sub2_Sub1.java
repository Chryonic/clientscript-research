/* Class_ha_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.awt.Rectangle;

import jaclib.memory.Stream;

import jaggl.MapBuffer;
import jaggl.OpenGL;

final class GraphicsToolkit_Sub2_Sub1 extends GraphicsToolkit_Sub2 {
    static int[] deletionArray = new int[1000];
    static float[] setBuffer = new float[4];
    static float[] matrixBuffer = new float[16];
    private CyclicLinkedList drawingListDeleteQueue = new CyclicLinkedList();
    private OpenGL openGL;
    private CyclicLinkedList arbBufferDeleteQueue = new CyclicLinkedList();
    private CyclicLinkedList textureDeleteQueue = new CyclicLinkedList();
    private CyclicLinkedList frameBufferDeleteQueue = new CyclicLinkedList();
    private CyclicLinkedList renderBufferDeleteQueue = new CyclicLinkedList();
    private CyclicLinkedList arbProgramDeleteQueue = new CyclicLinkedList();
    private CyclicLinkedList arbObjectDeleteQueue = new CyclicLinkedList();
    private boolean aBoolean6461;
    private boolean aBoolean6462;
    private long lastGC;
    private boolean vertexArraysEnabled;
    private Class1_Sub2[] aClass1_Sub2Array6465 = new Class1_Sub2[16];
    private int texcoordArrayEnabledTexturePtr;
    private boolean colourArraysEnabled;
    MapBuffer aMapBuffer__6468 = new MapBuffer();
    private boolean normalArraysEnabled;
    MapBuffer aMapBuffer__6470 = new MapBuffer();
    private String glVendorString;
    private int glVersion;
    boolean hasVBO;
    boolean hasVertexShader;
    boolean hasVertexProgram;
    int anInt6476;
    int[] textureTarget;
    boolean hasFragmentShader;
    private String glRendererString;
    private boolean hasNonPow2Texture;
    private int anInt6481 = 0;
    private boolean hasTexRect;

    final void method2175(byte argument_0_) {
        if (Class245_Sub2.aClass85_5310 == this.aClass85_4707)
            OpenGL.glBlendFunc(770, 771);
        else if (Node_Sub31_Sub15_Sub1.aClass85_6639 != this.aClass85_4707) {
            if (this.aClass85_4707 == Class195.aClass85_1419)
                OpenGL.glBlendFunc(774, 1);
        } else
            OpenGL.glBlendFunc(1, 1);
    }

    final void method2098() {
        /* empty */
    }

    final Interface17 method2077(int argument_1_, int argument_2_) {
        return null;
    }

    final Interface4_Impl1 method2142(int argument_3_, boolean argument_4_) {
        if (argument_3_ != -1)
            return null;
        return new Class1_Sub1(this, DataType.aDataType_1075, argument_4_);
    }

    final void method2137(int argument_5_, Canvas argument_6_, Object argument_7_) {
        Long var_long = (Long) argument_7_;
        openGL.releaseSurface(argument_6_, var_long);
        if (argument_5_ <= 92)
            colourArraysEnabled = true;
    }

    final Interface7_Impl3 method2220(byte argument_8_, boolean argument_9_, int argument_10_, int[][] argument_11_) {
        if (argument_8_ <= 92)
            method2163(-13, null, null, 43, -102, 68, 61, true);
        return new Class256_Sub1(this, argument_10_, argument_9_, argument_11_);
    }

    final void F(int argument_12_, int argument_13_) {
        /* empty */
    }

    final void method2178(byte argument_14_) {
        if (!this.aBoolean4706 || !this.aBoolean4728 || this.fogThickness < 0)
            OpenGL.glDisable(2912);
        else
            OpenGL.glEnable(2912);
        if (argument_14_ != 82)
            aClass1_Sub2Array6465 = null;
    }

    final void method2179(Class222 argument_15_, byte argument_16_) {
        Class289[] class289s = (((Class222_Sub2) argument_15_).aClass289Array5295);
        int usedTextures = 0;
        boolean enableColourArrays = false;
        boolean enableNormalArray = false;
        boolean enableVertexArray = false;
        if (argument_16_ != -63)
            Statics.aClass368_6450 = null;
        for (int anLocalInt_19_ = 0; class289s.length > anLocalInt_19_; anLocalInt_19_++) {
            Class289 class289 = class289s[anLocalInt_19_];
            Class1_Sub2 class1_sub2 = aClass1_Sub2Array6465[anLocalInt_19_];
            int offset = 0;
            int stride = class1_sub2.getStride();
            long baseAddress = class1_sub2.getAddress();
            class1_sub2.bind();
            for (int anLocalInt_22_ = 0; anLocalInt_22_ < class289.method3479((byte) 121); anLocalInt_22_++) {
                InterleavedArrayElementEnum interleavedArrayElementEnum = class289.method3474(anLocalInt_22_);
                if (interleavedArrayElementEnum == InterleavedArrayElementEnum.VERTEX_POINTER) {
                    OpenGL.glVertexPointer(3, 5126, stride, baseAddress + (long) offset);
                    enableVertexArray = true;
                } else if (interleavedArrayElementEnum == InterleavedArrayElementEnum.NORMAL_POINTER) {
                    OpenGL.glNormalPointer(5126, stride, baseAddress + (long) offset);
                    enableNormalArray = true;
                } else if (interleavedArrayElementEnum == InterleavedArrayElementEnum.COLOUR_POINTER) {
                    OpenGL.glColorPointer(4, 5121, stride, baseAddress + (long) offset);
                    enableColourArrays = true;
                } else if (interleavedArrayElementEnum == InterleavedArrayElementEnum.TEXCOORD_1D_POINTER) {
                    OpenGL.glClientActiveTexture(usedTextures++ + 33984);
                    OpenGL.glTexCoordPointer(1, 5126, stride, (baseAddress + (long) offset));
                } else if (interleavedArrayElementEnum == InterleavedArrayElementEnum.TEXCOORD_2D_POINTER) {
                    OpenGL.glClientActiveTexture(33984 + usedTextures++);
                    OpenGL.glTexCoordPointer(2, 5126, stride, (baseAddress + (long) offset));
                } else if (interleavedArrayElementEnum == InterleavedArrayElementEnum.TEXCOORD_3D_POINTER) {
                    OpenGL.glClientActiveTexture(usedTextures++ + 33984);
                    OpenGL.glTexCoordPointer(3, 5126, stride, baseAddress + (long) offset);
                } else if (interleavedArrayElementEnum == InterleavedArrayElementEnum.TEXCOORD_4D_POINTER) {
                    OpenGL.glClientActiveTexture(33984 + usedTextures++);
                    OpenGL.glTexCoordPointer(4, 5126, stride, baseAddress + (long) offset);
                }
                offset += interleavedArrayElementEnum.byteSize;
            }
        }
        if (vertexArraysEnabled != enableVertexArray) {
            if (enableVertexArray)
                OpenGL.glEnableClientState(32884);
            else
                OpenGL.glDisableClientState(32884);
            vertexArraysEnabled = enableVertexArray;
        }
        if (enableNormalArray != normalArraysEnabled) {
            if (!enableNormalArray)
                OpenGL.glDisableClientState(32885);
            else
                OpenGL.glEnableClientState(32885);
            normalArraysEnabled = enableNormalArray;
        }
        if (colourArraysEnabled != enableColourArrays) {
            if (!enableColourArrays)
                OpenGL.glDisableClientState(32886);
            else
                OpenGL.glEnableClientState(32886);
            colourArraysEnabled = enableColourArrays;
        }
        if (usedTextures > texcoordArrayEnabledTexturePtr) {
            for (int texturePtr = texcoordArrayEnabledTexturePtr; texturePtr < usedTextures; texturePtr++) {
                OpenGL.glClientActiveTexture(texturePtr + 33984);
                OpenGL.glEnableClientState(32888);
            }
            texcoordArrayEnabledTexturePtr = usedTextures;
        } else if (usedTextures < texcoordArrayEnabledTexturePtr) {
            for (int anLocalInt_24_ = usedTextures; anLocalInt_24_ < texcoordArrayEnabledTexturePtr; anLocalInt_24_++) {
                OpenGL.glClientActiveTexture(anLocalInt_24_ + 33984);
                OpenGL.glDisableClientState(32888);
            }
            texcoordArrayEnabledTexturePtr = usedTextures;
        }
    }

    final synchronized void requestArbProgramDeletion(int ptr) {
        Node node = new Node();
        node.hash = (long) ptr;
        arbProgramDeleteQueue.add(node);
    }

    final Interface7_Impl2 method2125(boolean argument_27_, Class320 argument_28_, int argument_29_, int argument_30_, byte[] argument_31_, int argument_32_, int argument_33_, int argument_34_) {
        if (argument_32_ != 8)
            setTexEnvColour(103);
        if (!hasNonPow2Texture && (!Class2_Sub1.method198(argument_33_) || !Class2_Sub1.method198(argument_29_))) {
            if (!hasTexRect) {
                Class256_Sub2 class256_sub2 = new Class256_Sub2(this, argument_28_, DataType.BYTE, MathStatics.method2589(argument_33_), MathStatics.method2589(argument_29_));
                class256_sub2.method21(argument_28_, 5259, 0, argument_30_, argument_33_, argument_31_, 0, argument_34_, argument_29_);
                return class256_sub2;
            }
            return new Class256_Sub3(this, argument_28_, argument_33_, argument_29_, argument_31_, argument_30_, argument_34_);
        }
        return new Class256_Sub2(this, argument_28_, argument_33_, argument_29_, argument_27_, argument_31_, argument_30_, argument_34_);
    }

    final Class2 method2247(int argument_35_, int argument_36_) {
        if (argument_35_ == 3)
            return new Class2_Sub10(this, (this.aJs5Store_4673));
        if (argument_35_ == 4)
            return new Class2_Sub2(this, this.aJs5Store_4673, this.aClass191_4677);
        if (argument_35_ == 8)
            return new Gl2Water0(this, this.aJs5Store_4673, this.aClass191_4677);
        return super.method2247(argument_35_, argument_36_);
    }

    final void enableSun(int argument_37_) {
        if (argument_37_ != 0) {
            /* empty */
        }
    }

    final void method2122(int argument_38_) {
        if (this.aBoolean4719) {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        } else {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        }
        if (argument_38_ != 4)
            this.hasVBO = true;
    }

    final void applySunLightColours(byte argument_39_) {
        setBuffer[3] = 1.0F;
        setBuffer[0] = (this.sunRed * this.sunLight0Intensity);
        setBuffer[1] = (this.sunGreen * this.sunLight0Intensity);
        setBuffer[2] = (this.sunBlue * this.sunLight0Intensity);
        OpenGL.glLightfv(16384, 4609, setBuffer, 0);
        setBuffer[0] = (this.sunRed * -this.sunLight1Intensity);
        setBuffer[1] = (this.sunGreen * -this.sunLight1Intensity);
        setBuffer[2] = (this.sunBlue * -this.sunLight1Intensity);
        setBuffer[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, setBuffer, 0);
    }

    final Class222 method2134(Class289[] argument_40_, byte argument_41_) {
        int anLocalInt = 99 % ((argument_41_ + 87) / 37);
        return new Class222_Sub2(argument_40_);
    }

    final Interface7_Impl2 method2206(int argument_42_, int[] argument_43_, int argument_44_, int argument_45_, boolean argument_46_, int argument_47_, int argument_48_) {
        if (argument_48_ != 9567)
            Statics.aClass368_6450 = null;
        if (!hasNonPow2Texture && (!Class2_Sub1.method198(argument_44_) || !Class2_Sub1.method198(argument_47_))) {
            if (hasTexRect)
                return new Class256_Sub3(this, argument_44_, argument_47_, argument_43_, argument_45_, argument_42_);
            Class256_Sub2 class256_sub2 = new Class256_Sub2(this, Applet_Sub1.aClass320_9, DataType.BYTE, MathStatics.method2589(argument_44_), MathStatics.method2589(argument_47_));
            class256_sub2.method15(0, (byte) 119, argument_44_, argument_43_, argument_42_, argument_47_, argument_45_, 0);
            return class256_sub2;
        }
        return new Class256_Sub2(this, argument_44_, argument_47_, argument_46_, argument_43_, argument_45_, argument_42_);
    }

    final void swapBuffers(int argument_49_, int argument_50_) throws Exception_Sub1 {
        openGL.swapBuffers();
    }

    final void method2156(Class390 argument_51_, int argument_52_, int argument_53_, byte argument_54_) {
        int anLocalInt;
        int anLocalInt_55_;
        if (argument_51_ != LoadingBar.aClass390_1359) {
            if (argument_51_ == Statics.aClass390_1649) {
                anLocalInt = 3;
                anLocalInt_55_ = argument_52_ + 1;
            } else if (Class232.aClass390_1684 != argument_51_) {
                if (Class387.aClass390_3267 != argument_51_) {
                    if (Class276.aClass390_2213 == argument_51_) {
                        anLocalInt_55_ = argument_52_ + 2;
                        anLocalInt = 5;
                    } else {
                        anLocalInt = 0;
                        anLocalInt_55_ = argument_52_;
                    }
                } else {
                    anLocalInt = 6;
                    anLocalInt_55_ = argument_52_ + 2;
                }
            } else {
                anLocalInt_55_ = argument_52_ * 3;
                anLocalInt = 4;
            }
        } else {
            anLocalInt = 1;
            anLocalInt_55_ = argument_52_ * 2;
        }
        if (argument_54_ <= 38)
            arbObjectDeleteQueue = null;
        OpenGL.glDrawArrays(anLocalInt, argument_53_, anLocalInt_55_);
    }

    final void method2195(byte argument_56_, Canvas argument_57_, Object argument_58_) {
        Long var_long = (Long) argument_58_;
        openGL.surfaceResized(var_long.longValue());
    }

    final void method2148(int argument_59_) {
        if (argument_59_ == 24) {
            aBoolean6461 = false;
            method2258();
        }
    }

    final float method2165(int argument_60_) {
        return 0.0F;
    }

    final void applyScissorTestToggle(int argument_61_) {
        if (!this.scissorEnabled)
            OpenGL.glDisable(3089);
        else
            OpenGL.glEnable(3089);
    }

    final void applySunLightPosition(int argument_62_) {
        OpenGL.glLightfv(16384, 4611, this.sunLight0Position, 0);
        OpenGL.glLightfv(16385, 4611, this.sunLight1Position, 0);
    }

    final synchronized void processDeletions(int argument_63_) {
        int deletionArrayPtr = 0;
        argument_63_ &= 0x7fffffff;
        while (!arbBufferDeleteQueue.isEmpty()) {
            IntegerNode request = (IntegerNode) arbBufferDeleteQueue.remove();
            deletionArray[deletionArrayPtr++] = (int) request.hash;
            ((GraphicsToolkit_Sub2) this).arbBufferMemoryUsage -= request.value;
            if (deletionArrayPtr == 1000) {
                OpenGL.glDeleteBuffersARB(deletionArrayPtr, deletionArray, 0);
                deletionArrayPtr = 0;
            }
        }
        if (deletionArrayPtr > 0) {
            OpenGL.glDeleteBuffersARB(deletionArrayPtr, deletionArray, 0);
            deletionArrayPtr = 0;
        }
        while (!textureDeleteQueue.isEmpty()) {
            IntegerNode request = (IntegerNode) textureDeleteQueue.remove();
            deletionArray[deletionArrayPtr++] = (int) request.hash;
            ((GraphicsToolkit_Sub2) this).textureMemoryUsage -= request.value;
            if (deletionArrayPtr == 1000) {
                OpenGL.glDeleteTextures(deletionArrayPtr, deletionArray, 0);
                deletionArrayPtr = 0;
            }
        }
        if (deletionArrayPtr > 0) {
            OpenGL.glDeleteTextures(deletionArrayPtr, deletionArray, 0);
            deletionArrayPtr = 0;
        }
        while (!frameBufferDeleteQueue.isEmpty()) {
            IntegerNode request = (IntegerNode) frameBufferDeleteQueue.remove();
            deletionArray[deletionArrayPtr++] = request.value;
            if (deletionArrayPtr == 1000) {
                OpenGL.glDeleteFramebuffersEXT(deletionArrayPtr, deletionArray, 0);
                deletionArrayPtr = 0;
            }
        }
        if (deletionArrayPtr > 0) {
            OpenGL.glDeleteFramebuffersEXT(deletionArrayPtr, deletionArray, 0);
            deletionArrayPtr = 0;
        }
        while (!renderBufferDeleteQueue.isEmpty()) {
            IntegerNode request = (IntegerNode) renderBufferDeleteQueue.remove();
            deletionArray[deletionArrayPtr++] = (int) request.hash;
            ((GraphicsToolkit_Sub2) this).renderBufferMemoryUsage -= request.value;
            if (deletionArrayPtr == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(deletionArrayPtr, deletionArray, 0);
                deletionArrayPtr = 0;
            }
        }
        if (deletionArrayPtr > 0) {
            OpenGL.glDeleteRenderbuffersEXT(deletionArrayPtr, deletionArray, 0);
        }
        while (!drawingListDeleteQueue.isEmpty()) {
            IntegerNode request = (IntegerNode) drawingListDeleteQueue.remove();
            OpenGL.glDeleteLists((int) request.hash, request.value);
        }
        while (!arbProgramDeleteQueue.isEmpty()) {
            Node node = arbProgramDeleteQueue.remove();
            OpenGL.glDeleteProgramARB((int) node.hash);
        }
        while (!arbObjectDeleteQueue.isEmpty()) {
            Node node = arbObjectDeleteQueue.remove();
            OpenGL.glDeleteObjectARB(node.hash);
        }
        while (!drawingListDeleteQueue.isEmpty()) {
            IntegerNode request = (IntegerNode) drawingListDeleteQueue.remove();
            OpenGL.glDeleteLists((int) request.hash, request.value);
        }
        if (this.getMemoryUsage() > 100663296 && lastGC + 60000L < Applet_Sub1.getGameTime()) {
            System.gc();
            lastGC = Applet_Sub1.getGameTime();
        }
        super.processDeletions(argument_63_);
    }

    final Interface4_Impl2 method2248(int argument_64_, boolean argument_65_) {
        if (argument_64_ != 0)
            this.hasVBO = true;
        return new Class1_Sub2(this, argument_65_);
    }

    final void loadLights(boolean argument_66_) {
        this.method2166();
        int lightId;
        for (lightId = 0; this.activeLightCount > lightId; lightId++) {
            HardwareLight light = this.activeLights[lightId];
            int diffuse = light.getColour();
            int glLightId = lightId + 16386;
            float intensity = light.getColourIntensity() / 255.0F;
            setBuffer[0] = (float) light.getX();
            setBuffer[1] = (float) light.getY();
            setBuffer[2] = (float) light.getZ();
            setBuffer[3] = 1.0F;
            OpenGL.glLightfv(glLightId, 4611, setBuffer, 0);
            setBuffer[0] = (float) (MathStatics.AND(diffuse, 16741039) >> 16) * intensity;
            setBuffer[1] = (float) MathStatics.AND(diffuse >> 8, 255) * intensity;
            setBuffer[2] = (float) MathStatics.AND(diffuse, 255) * intensity;
            setBuffer[3] = 1.0F;
            OpenGL.glLightfv(glLightId, 4609, setBuffer, 0);
            OpenGL.glLightf(glLightId, 4617, 1.0F / (float) (light.getRadius() * light.getRadius()));
            OpenGL.glEnable(glLightId);
        }
        for (/**/; lightId < this.previousActiveLightCount; lightId++)
            OpenGL.glDisable(lightId + 16386);
        super.loadLights(argument_66_);
    }

    final void method2131(int argument_69_, int argument_70_, Interface4_Impl1 argument_71_, int argument_72_, int argument_73_, boolean argument_74_, Class390 argument_75_) {
        int anLocalInt;
        int anLocalInt_76_;
        if (LoadingBar.aClass390_1359 == argument_75_) {
            anLocalInt = 1;
            anLocalInt_76_ = argument_69_ * 2;
        } else if (argument_75_ == Statics.aClass390_1649) {
            anLocalInt = 3;
            anLocalInt_76_ = argument_69_ + 1;
        } else if (argument_75_ != Class232.aClass390_1684) {
            if (argument_75_ != Class387.aClass390_3267) {
                if (argument_75_ == Class276.aClass390_2213) {
                    anLocalInt = 5;
                    anLocalInt_76_ = argument_69_ + 2;
                } else {
                    anLocalInt = 0;
                    anLocalInt_76_ = argument_69_;
                }
            } else {
                anLocalInt = 6;
                anLocalInt_76_ = argument_69_ + 2;
            }
        } else {
            anLocalInt_76_ = argument_69_ * 3;
            anLocalInt = 4;
        }
        DataType dataType = argument_71_.method42(21064);
        Class1_Sub1 class1_sub1 = (Class1_Sub1) argument_71_;
        class1_sub1.bind();
        OpenGL.glDrawElements(anLocalInt, anLocalInt_76_, Node_Sub52.method1318((byte) -124, dataType), (class1_sub1.getAddress() + (long) (dataType.length * argument_70_)));
        if (argument_74_ != true)
            this.hasVBO = false;
    }

    final void method2213(int argument_77_) {
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.aFloatArray4755, 0);
        OpenGL.glMatrixMode(5888);
        if (argument_77_ < 94)
            arbProgramDeleteQueue = null;
    }

    final void method2177(boolean argument_78_) {
        if (!this.aBoolean4721)
            OpenGL.glDisable(2929);
        else
            OpenGL.glEnable(2929);
        if (argument_78_ != true)
            method2098();
    }

    final void method2234(int argument_79_, int argument_80_) {
        if (argument_80_ != 0)
            hasNonPow2Texture = false;
    }

    final void method2080(boolean argument_81_) {
        /* empty */
    }

    final void method2149(int argument_82_) {
        for (int anLocalInt = this.maxTextureUnits - 1; anLocalInt >= 0; anLocalInt--) {
            OpenGL.glActiveTexture(33984 + anLocalInt);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glAlphaFunc(516, 0.0F);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] fs = {0.0F, 0.0F, 0.0F, 1.0F};
        for (int anLocalInt = 0; anLocalInt < 8; anLocalInt++) {
            int anLocalInt_83_ = anLocalInt + 16384;
            OpenGL.glLightfv(anLocalInt_83_, 4608, fs, 0);
            OpenGL.glLightf(anLocalInt_83_, 4615, 0.0F);
            OpenGL.glLightf(anLocalInt_83_, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        openGL.setSwapInterval(0);
        super.method2149(argument_82_);
    }

    final void method2051() {
        /* empty */
    }

    final void applyFog(byte argument_84_) {
        ((GraphicsToolkit_Sub2) this).fogEnd = (float) (this.farPlane - this.fogDistance);
        ((GraphicsToolkit_Sub2) this).fogStart = (this.fogEnd - (float) this.fogThickness);
        if (this.fogStart < (float) this.anInt4749)
            ((GraphicsToolkit_Sub2) this).fogStart = (float) this.anInt4749;
        OpenGL.glFogf(2915, this.fogStart);
        OpenGL.glFogf(2916, this.fogEnd);
        setBuffer[0] = (float) MathStatics.AND((this.fogColour), 16711680) / 1.671168E7F;
        setBuffer[2] = (float) MathStatics.AND(255, (this.fogColour)) / 255.0F;
        setBuffer[1] = ((float) MathStatics.AND(65280, (this.fogColour)) / 65280.0F);
        OpenGL.glFogfv(2918, setBuffer, 0);
    }

    final void setTexEnvColour(int argument_85_) {
        setBuffer[2] = (float) MathStatics.AND(this.anInt4762, 255) / 255.0F;
        setBuffer[1] = ((float) MathStatics.AND(65280, this.anInt4762) / 65280.0F);
        setBuffer[3] = (float) (this.anInt4762 >>> 24) / 255.0F;
        setBuffer[0] = ((float) MathStatics.AND(16711680, this.anInt4762) / 1.671168E7F);
        OpenGL.glTexEnvfv(8960, 8705, setBuffer, argument_85_);
    }

    final void method2087(Interface15 argument_86_) {
        /* empty */
    }

    final void applyLightingToggle(boolean argument_87_) {
        if (!this.aBoolean4789 || this.aBoolean4784)
            OpenGL.glDisable(2896);
        else
            OpenGL.glEnable(2896);
    }

    final void clear(int colour) {
        OpenGL.glClearColor((float) (colour & 0xff0000) / 1.671168E7F, (float) (colour & 0xff00) / 65280.0F, (float) (colour & 0xff) / 255.0F, (float) (colour >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    final int I() {
        return anInt6481;
    }

    final void method2238(int argument_89_, boolean argument_90_) {
        if (argument_89_ <= -103) {
            if (!argument_90_)
                OpenGL.glDisable(32925);
            else
                OpenGL.glEnable(32925);
        }
    }

    final void method2023() {
        super.method2023();
        if (openGL != null) {
            openGL.releaseThread();
            openGL.release();
            openGL = null;
        }
    }

    final Object method2245(byte argument_91_, Canvas argument_92_) {
        if (argument_91_ <= 61)
            return null;
        long l = openGL.prepareSurface(argument_92_);
        if (l == -1L)
            throw new RuntimeException();
        return new Long(l);
    }

    final boolean method2019() {
        return false;
    }

    final void method2139(int argument_93_) {
        if (argument_93_ != 0)
            this.aMapBuffer__6470 = null;
        if (this.aBoolean4783)
            OpenGL.glEnable(3042);
        else
            OpenGL.glDisable(3042);
    }

    GraphicsToolkit_Sub2_Sub1(OpenGL argument_94_, Canvas argument_95_, long argument_96_, TextureSource argument_97_, Js5Store argument_98_, int argument_99_) {
        super(argument_95_, new Long(argument_96_), argument_97_, argument_98_, argument_99_, 1);
        try {
            openGL = argument_94_;
            openGL.assignThread();
            glVendorString = OpenGL.glGetString(7936).toLowerCase();
            glRendererString = OpenGL.glGetString(7937).toLowerCase();
            if (glVendorString.contains("microsoft") || glVendorString.contains("brian paul") || glVendorString.contains("mesa"))
                throw new RuntimeException("Incompatible OpenGL implementation");
            String glVersionString = OpenGL.glGetString(7938);
            String[] versionComponents = JagexStringUtils.split(glVersionString.replace('.', ' '), 0, ' ');
            if (versionComponents.length < 2)
                throw new RuntimeException("Invalid version string");
            try {
                int major = JagexStringUtils.parseInt(versionComponents[0]);
                int minor = JagexStringUtils.parseInt(versionComponents[1]);
                glVersion = minor + major * 10;
            } catch (NumberFormatException numberformatexception) {
                throw new RuntimeException("Invalid version string");
            }
            if (glVersion < 12)
                throw new RuntimeException("OpenGL 1.2 Required");
            if (!openGL.hasCapability("GL_ARB_multitexture"))
                throw new RuntimeException("ARB Multitexturing required");
            if (!openGL.hasCapability("GL_ARB_texture_env_combine"))
                throw new RuntimeException("ARB Texture environment required");
            int[] getArray = new int[1];
            OpenGL.glGetIntegerv(34018, getArray, 0);
            ((GraphicsToolkit_Sub2) this).maxTextureUnits = getArray[0];
            if (this.maxTextureUnits < 2)
                throw new RuntimeException("At least 2 texture units are required");
            ((GraphicsToolkit_Sub2) this).anInt4756 = 8;
            this.hasVBO = openGL.hasCapability("GL_ARB_vertex_buffer_object");
            ((GraphicsToolkit_Sub2) this).hasMultiSample = openGL.hasCapability("GL_ARB_multisample");
            hasTexRect = openGL.hasCapability("GL_ARB_texture_rectangle");
            ((GraphicsToolkit_Sub2) this).hasCubeMap = openGL.hasCapability("GL_ARB_texture_cube_map");
            hasNonPow2Texture = openGL.hasCapability("GL_ARB_texture_non_power_of_two");
            ((GraphicsToolkit_Sub2) this).hasTexture3D = openGL.hasCapability("GL_EXT_texture3D");
            this.hasVertexShader = openGL.hasCapability("GL_ARB_vertex_shader");
            this.hasVertexProgram = openGL.hasCapability("GL_ARB_vertex_program");
            this.hasFragmentShader = openGL.hasCapability("GL_ARB_fragment_shader");
            openGL.hasCapability("GL_ARB_fragment_program");
            this.textureTarget = new int[this.maxTextureUnits];
            this.anInt6476 = Stream.isBigEndian() ? 33639 : 5121;
            if (glRendererString.indexOf("radeon") != -1) {
                int radeonMake = 0;
                boolean hdRadeon = false;
                boolean xRadeon = false;
                String[] rendererStubStrings = JagexStringUtils.split(glRendererString.replace('/', ' '), 0, ' ');
                for (int anLocalInt_103_ = 0; anLocalInt_103_ < rendererStubStrings.length; anLocalInt_103_++) {
                    String string_104_ = rendererStubStrings[anLocalInt_103_];
                    try {
                        if (string_104_.length() > 0) {
                            if (string_104_.charAt(0) == 'x' && string_104_.length() >= 3 && Class230.method3073(string_104_.substring(1, 3), 0)) {
                                xRadeon = true;
                                string_104_ = string_104_.substring(1);
                            }
                            if (string_104_.equals("hd"))
                                hdRadeon = true;
                            else {
                                if (string_104_.startsWith("hd")) {
                                    hdRadeon = true;
                                    string_104_ = string_104_.substring(2);
                                }
                                if (string_104_.length() >= 4 && (Class230.method3073(string_104_.substring(0, 4), 0))) {
                                    radeonMake = (JagexStringUtils.parseInt(string_104_.substring(0, 4)));
                                    break;
                                }
                            }
                        }
                    } catch (Exception exception) {
                        /* empty */
                    }
                }
                if (!xRadeon && !hdRadeon) {
                    if (radeonMake >= 7000 && radeonMake <= 9250)
                        ((GraphicsToolkit_Sub2) this).hasTexture3D = false;
                    if (radeonMake >= 7000 && radeonMake <= 7999)
                        this.hasVBO = false;
                }
                hasTexRect &= openGL.hasCapability("GL_ARB_half_float_pixel");
            }
            if (this.hasVBO) {
                try {
                    int[] anLocalInts_105_ = new int[1];
                    OpenGL.glGenBuffersARB(1, anLocalInts_105_, 0);
                } catch (Throwable throwable) {
                    throw new RuntimeException("");
                }
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.method2027((byte) -81);
            throw new RuntimeException("");
        }
    }

    final void setMultiTexAlphaSource(int id, GlMultiTexSourceEnum sourceEnum, boolean inverseAlpha, boolean argument_108_) {
        OpenGL.glTexEnvi(8960, id + 34184, GlMultiTexSourceEnum.toGLConstant(sourceEnum));
        OpenGL.glTexEnvi(8960, id + 34200, inverseAlpha ? 771 : 770);
    }

    final Interface7_Impl2 method2242(int argument_110_, int argument_111_, DataType argument_112_, Class320 argument_113_, int argument_114_) {
        if (argument_114_ != 18018)
            Statics.aFloatArrayArray6455 = null;
        if (!hasNonPow2Texture && (!Class2_Sub1.method198(argument_111_) || !Class2_Sub1.method198(argument_110_))) {
            if (hasTexRect)
                return new Class256_Sub3(this, argument_113_, argument_112_, argument_111_, argument_110_);
            return new Class256_Sub2(this, argument_113_, argument_112_, MathStatics.method2589(argument_111_), MathStatics.method2589(argument_110_));
        }
        return new Class256_Sub2(this, argument_113_, argument_112_, argument_111_, argument_110_);
    }

    final void finish() {
        OpenGL.glFinish();
    }

    final void setMultiTexRgbSource(int id, boolean useAlpha, boolean inverse, GlMultiTexSourceEnum source, byte argument_117_) {
        OpenGL.glTexEnvi(8960, 34176 + id, GlMultiTexSourceEnum.toGLConstant(source));
        if (!useAlpha)
            OpenGL.glTexEnvi(8960, id + 34192, inverse ? 769 : 768);
        else
            OpenGL.glTexEnvi(8960, id + 34192, inverse ? 771 : 770);
    }

    final void applyAlphaTestToggle(int argument_120_) {
        if (this.useAlphaTest)
            OpenGL.glEnable(3008);
        else
            OpenGL.glDisable(3008);
    }

    final Interface7_Impl1 method2154(Class320 argument_121_, int argument_122_, int argument_123_, int argument_124_, byte[] argument_125_, int argument_126_) {
        if (argument_126_ != 0)
            return null;
        return new Class256_Sub4(this, argument_121_, argument_123_, argument_122_, argument_124_, argument_125_);
    }

    final void loadViewport(byte argument_127_) {
        OpenGL.glViewport(this.viewportX, this.viewportY, this.viewportW, this.viewportH);
    }

    final synchronized void requestARBBufferDeletion(int ptr, int size) {
        IntegerNode request = new IntegerNode(size);
        ((Node) request).hash = (long) ptr;
        arbBufferDeleteQueue.add(request);
    }

    final void method2130(Interface4_Impl2 argument_131_, int argument_132_, int argument_133_) {
        aClass1_Sub2Array6465[argument_132_] = (Class1_Sub2) argument_131_;
    }

    final void b(int argument_134_, int argument_135_, int argument_136_, int argument_137_, double argument_138_) {
        /* empty */
    }

    final void applyDepthMaskToggle(int argument_139_) {
        OpenGL.glDepthMask(this.aBoolean4786 && this.aBoolean4715);
    }

    final void method2041(Rectangle[] argument_143_, int argument_144_, int argument_145_, int argument_146_) throws Exception_Sub1 {
        swapBuffers(argument_145_, argument_146_);
    }

    final void method2244(int argument_147_) {
        if (argument_147_ == 11)
            method2258();
    }

    final ToolkitInfo getDescriptor() {
        int anLocalInt = -1;
        if (glVendorString.contains("nvidia"))
            anLocalInt = 4318;
        else if (!glVendorString.contains("intel")) {
            if (glVendorString.contains("ati"))
                anLocalInt = 4098;
        } else
            anLocalInt = 32902;
        return new ToolkitInfo(anLocalInt, "OpenGL", glVersion, glRendererString, 0L);
    }

    final void method2058() {
        /* empty */
    }

    final void clearDepthBuffer() {
        this.method2212((byte) 126, true);
        OpenGL.glClear(256);
    }

    final synchronized void requestTextureDeletion(int ptr, int size) {
        IntegerNode class59_sub54 = new IntegerNode(size);
        ((Node) class59_sub54).hash = (long) ptr;
        textureDeleteQueue.add(class59_sub54);
    }

    final void method2126(byte argument_151_) {
        OpenGL.glMatrixMode(5890);
        if (Node_Sub7.aClass81_3915 != (this.aClass81Array4744[this.activeTexUnit]))
            OpenGL.glLoadMatrixf(this.textureMatrix[this.activeTexUnit].getMatrixArray(matrixBuffer), 0);
        else
            OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    final void setupTexcoordGeneration(int argument_152_, TexGenEnum mode) {
        if (TexGenEnum.DISABLED == mode) {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        } else {
            int anLocalInt = TexGenEnum.toGLConstant(mode);
            OpenGL.glTexGeni(8192, 9472, anLocalInt);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, anLocalInt);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, anLocalInt);
            OpenGL.glEnable(3170);
        }
    }

    final void applyActiveTextureRgbCombineMode(int argument_154_) {
        OpenGL.glTexEnvi(8960, 34161, CombineModeEnum.toGLConstant((this.rgbCombinationModes[(this.activeTexUnit)])));
    }

    final void method2048() {
        if (this.viewportW > 0 || this.viewportH > 0) {
            int anLocalInt = this.scissorX;
            int anLocalInt_155_ = this.scissorRight;
            int anLocalInt_156_ = this.scissorBottom;
            int anLocalInt_157_ = this.scissorY;
            this.clearClip();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2207(true);
            this.method2243(-545832829, false);
            this.method2172((byte) -68, false);
            this.method2189(1, false);
            this.method2212((byte) 122, false);
            this.method2237(true, null);
            this.method2215(false, -2, false, (byte) -112);
            this.method2216((byte) -122, 1);
            this.method2147(0, 0);
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
            this.setClip(anLocalInt, anLocalInt_157_, anLocalInt_155_, anLocalInt_156_);
        }
    }

    final void method2170(Canvas argument_158_, byte argument_159_, Object argument_160_) {
        Long var_long = (Long) argument_160_;
        if (!openGL.setSurface(var_long.longValue()))
            throw new RuntimeException();
        if (argument_159_ != 109)
            anInt6481 = -39;
    }

    final synchronized void requestArbObjectDeletion(long ptr) {
        Node node = new Node();
        node.hash = ptr;
        arbObjectDeleteQueue.add(node);
    }

    final void applyActiveTexture(byte argument_163_) {
        OpenGL.glActiveTexture(this.activeTexUnit + 33984);
    }

    final void unbindActiveTexture(byte argument_164_) {
        int target = (this.textureTarget[this.activeTexUnit]);
        if (target != 0) {
            this.textureTarget[(((GraphicsToolkit_Sub2) this).activeTexUnit)] = 0;
            OpenGL.glBindTexture(target, 0);
            OpenGL.glDisable(target);
        }
    }

    final Interface21 method2070(int argument_165_, int argument_166_) {
        return null;
    }

    final boolean method2132(Class320 argument_167_, int argument_168_, DataType argument_169_) {
        if (argument_168_ != -2)
            return false;
        return true;
    }

    final void method2059(float argument_170_, float argument_171_, float argument_172_) {
        /* empty */
    }

    final Interface15 method2097(Interface21 argument_173_, Interface17 argument_174_) {
        return null;
    }

    final Interface7_Impl2 method2163(int argument_175_, float[] argument_176_, Class320 argument_177_, int argument_178_, int argument_179_, int argument_180_, int argument_181_, boolean argument_182_) {
        if (argument_181_ != 0)
            hasNonPow2Texture = false;
        if (hasNonPow2Texture || (Class2_Sub1.method198(argument_180_) && Class2_Sub1.method198(argument_179_)))
            return new Class256_Sub2(this, argument_177_, argument_180_, argument_179_, argument_182_, argument_176_, argument_178_, argument_175_);
        if (hasTexRect)
            return new Class256_Sub3(this, argument_177_, argument_180_, argument_179_, argument_176_, argument_178_, argument_175_);
        Class256_Sub2 class256_sub2 = new Class256_Sub2(this, argument_177_, DataType.FLOAT, MathStatics.method2589(argument_180_), MathStatics.method2589(argument_179_));
        class256_sub2.method3284(argument_175_, argument_176_, argument_179_, argument_178_, argument_177_, 0, argument_181_ - 128, argument_180_, 0);
        return class256_sub2;
    }

    final Skybox method2045(Skybox argument_183_, Skybox argument_184_, float argument_185_, Skybox argument_186_) {
        if (!(argument_185_ < 0.5F))
            return argument_184_;
        return argument_183_;
    }

    final void applyAmbientLightModel(int argument_187_) {
        setBuffer[1] = (this.sunGreen * this.ambientModelIntensity);
        setBuffer[0] = (this.sunRed * this.ambientModelIntensity);
        setBuffer[2] = (this.sunBlue * this.ambientModelIntensity);
        setBuffer[3] = 1.0F;
        OpenGL.glLightModelfv(2899, setBuffer, 0);
    }

    final int[] getPixels(int argument_188_, int argument_189_, int argument_190_, int argument_191_) {
        int[] anLocalInts = new int[argument_190_ * argument_191_];
        for (int anLocalInt = 0; anLocalInt < argument_191_; anLocalInt++)
            OpenGL.glReadPixelsi(argument_188_, (-anLocalInt - 1 + (-argument_189_ + this.viewportH)), argument_190_, 1, 32993, this.anInt6476, anLocalInts, argument_190_ * anLocalInt);
        return anLocalInts;
    }

    final void method2062(int argument_192_, int argument_193_, int argument_194_, int argument_195_) {
        /* empty */
    }

    final void loadScissor(int argument_196_) {
        OpenGL.glScissor((this.viewportX + this.scissorX), (-this.scissorY + (this.viewportY + this.viewportH)), (this.scissorRight - this.scissorX), (-this.scissorBottom + this.scissorY));
    }

    final void applyActiveTextureAlphaCombineMode(int argument_197_) {
        OpenGL.glTexEnvi(8960, 34162, CombineModeEnum.toGLConstant((this.alphaCombinationModes[(this.activeTexUnit)])));
    }

    final boolean method2155(Class320 argument_198_, DataType argument_199_, boolean argument_200_) {
        return true;
    }

    final boolean method2092() {
        return false;
    }

    private void method2258() {
        if (aBoolean6462)
            OpenGL.glPopMatrix();
        if (this.aClass221_4801.method3029(76)) {
            if (!aBoolean6461) {
                OpenGL.glLoadMatrixf(this.aClass350_Sub2_4698.getMatrixArray(matrixBuffer), 0);
                aBoolean6461 = true;
                applySunLightPosition(-93);
                loadLights(true);
            }
            if (this.aBoolean4694)
                aBoolean6462 = false;
            else {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(this.aClass350_Sub2_4695.getMatrixArray(matrixBuffer), 0);
                aBoolean6462 = true;
            }
        } else if (!this.aBoolean4694) {
            OpenGL.glLoadMatrixf(this.aClass350_Sub2_4695.getMatrixArray(matrixBuffer), 0);
            aBoolean6462 = false;
        } else {
            OpenGL.glLoadIdentity();
            aBoolean6462 = false;
        }
    }
}
