/* Class_ha_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaclib.memory.heap.NativeHeap;

import jagex3.graphics2.hw.NativeInterface;

abstract class GraphicsToolkit_Sub2 extends GraphicsToolkit {
    private CyclicLinkedList aCyclicLinkedList_4672 = new CyclicLinkedList();
    Js5Store aJs5Store_4673;
    NativeHeap heap;
    NativeInterface aNativeInterface4675;
    static Class148[][][] aClass148ArrayArrayArray4676;
    Class191 aClass191_4677;
    private int anInt4678;
    static int anInt4679;
    Canvas aCanvas4680;
    private Canvas aCanvas4681;
    long aLong4682;
    private int anInt4683;
    static Class207 aClass207_4684 = new Class207(60, -1);
    int viewportW;
    int viewportH;
    NativeHeapBuffer aNativeHeapBuffer_4687;
    Object anObject4688;
    private Object anObject4689;
    private Hashtable aHashtable4690;
    int renderBufferMemoryUsage;
    int textureMemoryUsage;
    int arbBufferMemoryUsage;
    boolean aBoolean4694 = true;
    Class350_Sub2 aClass350_Sub2_4695 = new Class350_Sub2();
    Class350_Sub2 aClass350_Sub2_4696 = new Class350_Sub2();
    Class350_Sub2 aClass350_Sub2_4697 = new Class350_Sub2();
    Class350_Sub2 aClass350_Sub2_4698 = new Class350_Sub2();
    private Class350_Sub2 aClass350_Sub2_4699 = new Class350_Sub2();
    private Class350_Sub2 aClass350_Sub2_4700 = new Class350_Sub2();
    int anInt4701;
    float ambientModelIntensity;
    boolean aBoolean4703;
    int anInt4704;
    int anInt4705;
    boolean aBoolean4706 = true;
    Class85 aClass85_4707;
    float aFloat4708;
    int fogColour;
    int scissorX;
    Class350_Sub2[] textureMatrix;
    private Class2[] aClass2Array4712;
    float fogStart;
    float fogEnd;
    boolean aBoolean4715 = false;
    float sunRed;
    int farPlane;
    float aFloat4718;
    boolean aBoolean4719;
    int activeTexUnit;
    boolean aBoolean4721;
    private float aFloat4722;
    private Class230 aClass230_4723;
    private float[] sunLight0Angle;
    boolean useAlphaTest;
    boolean hasCubeMap;
    private int anInt4727;
    boolean aBoolean4728;
    int scissorBottom;
    private float[] aFloatArray4730;
    float sunLight1Intensity;
    private float[] aFloatArray4732;
    private float aFloat4733;
    int anInt4734;
    int scissorRight;
    private DxSkybox aClass67_Sub2_4736;
    int anInt4737;
    private float[] sunLight1Angle;
    private boolean aBoolean4739;
    private boolean aBoolean4740;
    Interface7 anInterface7_4741;
    private boolean aBoolean4742;
    private float[] aFloatArray4743;
    Class81[] aClass81Array4744;
    float sunBlue;
    float aFloat4746;
    float aFloat4747;
    private int anInt4748;
    int anInt4749;
    int anInt4750;
    float[] sunLight1Position;
    CombineModeEnum[] alphaCombinationModes;
    private int anInt4753;
    int anInt4754;
    float[] aFloatArray4755;
    int anInt4756;
    int anInt4757;
    float[] sunLight0Position;
    private int anInt4759;
    private boolean aBoolean4760;
    int previousActiveLightCount;
    int anInt4762;
    float sunLight0Intensity;
    private int anInt4764;
    int anInt4765;
    private Class138 aClass138_4766;
    boolean hasTexture3D;
    private int anInt4768;
    int maxTextureUnits;
    float aFloat4770;
    private Interface7[] anInterface7Array4771;
    int fogDistance;
    int scissorY;
    int anInt4774;
    private Class2 aClass2_4775;
    private int anInt4776;
    private int anInt4777;
    int anInt4778;
    int fogThickness;
    int viewportY;
    HardwareLight[] activeLights;
    private int anInt4782;
    boolean aBoolean4783;
    boolean aBoolean4784;
    private int anInt4785;
    boolean aBoolean4786;
    float aFloat4787;
    CombineModeEnum[] rgbCombinationModes;
    boolean aBoolean4789;
    private float aFloat4790;
    int viewportX;
    private boolean aBoolean4792;
    private float[] aFloatArray4793;
    int anInt4794;
    boolean hasMultiSample;
    private boolean aBoolean4796;
    int activeLightCount;
    float sunGreen;
    private int sunRGB;
    private Stream aStream4800;
    Class221 aClass221_4801;
    private Interface4_Impl2 anInterface4_Impl2_4802;
    private Interface4_Impl2 anInterface4_Impl2_4803;
    Class167_Sub2 aClass167_Sub2_4804;
    Class167_Sub2 aClass167_Sub2_4805;
    Class167_Sub2 aClass167_Sub2_4806;
    Class222 aClass222_4807;
    private Class222 aClass222_4808;
    Class222 aClass222_4809;
    Class167_Sub2 aClass167_Sub2_4810;
    Class167_Sub2 aClass167_Sub2_4811;
    Class222 aClass222_4812;
    private Interface4_Impl1 anInterface4_Impl1_4813;
    Class167_Sub2 aClass167_Sub2_4814;
    Class167_Sub2 aClass167_Sub2_4815;
    private Class222 aClass222_4816;
    Class167_Sub2 aClass167_Sub2_4817;
    Class167_Sub2 aClass167_Sub2_4818;
    Class167_Sub2 aClass167_Sub2_4819;
    private Class350_Sub2 aClass350_Sub2_4820;
    Class222 aClass222_4821;
    private Interface4_Impl2 anInterface4_Impl2_4822;
    private Class222 aClass222_4823;
    private int anInt4824;
    boolean scissorEnabled;

    abstract void setupTexcoordGeneration(int argument_0_, TexGenEnum argument_1_);

    final Stream method2116(int argument_2_, Buffer argument_3_) {
        aStream4800.method4159(argument_3_);
        return aStream4800;
    }

    private final void method2117(int argument_4_) {
        if (argument_4_ > -80)
            method2224(18, null, -100);
        if (this.aClass221_4801 != Node_Sub31_Sub21.aClass221_5931) {
            Class221 class221 = this.aClass221_4801;
            this.aClass221_4801 = Node_Sub31_Sub21.aClass221_5931;
            if (!class221.method3029(92))
                method2230(3);
            method2202(true);
            this.aFloatArray4755 = aFloatArray4793;
            method2214((byte) -121);
            anInt4785 &= ~0x7;
        }
    }

    final Class368 method2033(Class83 argument_5_, boolean argument_6_) {
        Class368 class368;
        if (argument_5_.anInt590 != 0 && argument_5_.anInt587 != 0) {
            int[] anLocalInts = new int[(argument_5_.anInt587 * argument_5_.anInt590)];
            int anLocalInt = 0;
            int anLocalInt_7_ = 0;
            if (argument_5_.aByteArray592 != null) {
                for (int anLocalInt_8_ = 0; argument_5_.anInt587 > anLocalInt_8_; anLocalInt_8_++) {
                    for (int anLocalInt_9_ = 0; argument_5_.anInt590 > anLocalInt_9_; anLocalInt_9_++) {
                        anLocalInts[anLocalInt_7_++] = (MathStatics.OR((argument_5_.aByteArray592[anLocalInt]) << 24, (argument_5_.anIntArray586[MathStatics.AND((argument_5_.aByteArray591[anLocalInt]), 255)])));
                        anLocalInt++;
                    }
                }
            } else {
                for (int anLocalInt_10_ = 0; anLocalInt_10_ < argument_5_.anInt587; anLocalInt_10_++) {
                    for (int anLocalInt_11_ = 0; argument_5_.anInt590 > anLocalInt_11_; anLocalInt_11_++) {
                        int anLocalInt_12_ = (argument_5_.anIntArray586[(argument_5_.aByteArray591[anLocalInt++]) & 0xff]);
                        anLocalInts[anLocalInt_7_++] = (anLocalInt_12_ != 0 ? MathStatics.OR(-16777216, anLocalInt_12_) : 0);
                    }
                }
            }
            class368 = this.method2047(argument_5_.anInt590, anLocalInts, 0, argument_5_.anInt587, argument_5_.anInt590);
        } else
            class368 = this.method2047(1, new int[1], 0, 1, 1);
        class368.method4024(argument_5_.anInt593, argument_5_.anInt589, argument_5_.anInt588, argument_5_.anInt594);
        return class368;
    }

    final boolean method2081() {
        return true;
    }

    final float[] method2118(int argument_13_, float[] argument_14_) {
        argument_14_[0] = this.aFloatArray4755[0];
        argument_14_[8] = this.aFloatArray4755[2];
        argument_14_[4] = this.aFloatArray4755[1];
        argument_14_[12] = this.aFloatArray4755[3];
        argument_14_[2] = this.aFloatArray4755[8];
        argument_14_[1] = this.aFloatArray4755[4];
        argument_14_[13] = this.aFloatArray4755[7];
        argument_14_[5] = this.aFloatArray4755[5];
        argument_14_[9] = this.aFloatArray4755[6];
        argument_14_[3] = this.aFloatArray4755[12];
        argument_14_[7] = this.aFloatArray4755[13];
        argument_14_[10] = this.aFloatArray4755[10];
        argument_14_[6] = this.aFloatArray4755[9];
        argument_14_[14] = this.aFloatArray4755[11];
        argument_14_[11] = this.aFloatArray4755[14];
        argument_14_[15] = this.aFloatArray4755[15];
        return argument_14_;
    }

    final Class350_Sub2 method2119(int argument_15_) {
        return this.aClass350_Sub2_4698;
    }

    final void method2120(int argument_16_, Class350_Sub2 argument_17_) {
        this.aClass350_Sub2_4695.method3838(argument_17_);
        this.aBoolean4694 = false;
        method2240();
    }

    final int method2121(byte argument_18_) {
        return anInt4764;
    }

    abstract void method2122(int argument_19_);

    final int method2016() {
        return this.anInt4756 - 2;
    }

    final void method2031(int argument_20_, int argument_21_, int argument_22_, int argument_23_, int argument_24_, int argument_25_, Class_aa argument_26_, int argument_27_, int argument_28_) {
        /* empty */
    }

    final int getMemoryUsage() {
        return (this.renderBufferMemoryUsage + this.textureMemoryUsage + this.arbBufferMemoryUsage);
    }

    abstract void applyActiveTextureAlphaCombineMode(int argument_29_);

    final void method2124(float argument_30_, byte argument_31_) {
        if (aFloat4722 != argument_30_) {
            aFloat4722 = argument_30_;
            method2225(-14326);
        }
    }

    final void drawVLine(int argument_32_, int argument_33_, int argument_34_, int argument_35_, int argument_36_) {
        drawLine(argument_32_, argument_33_, argument_32_, argument_34_ + argument_33_, argument_35_, argument_36_);
    }

    abstract Interface7_Impl2 method2125(boolean argument_37_, Class320 argument_38_, int argument_39_, int argument_40_, byte[] argument_41_, int argument_42_, int argument_43_, int argument_44_);

    abstract void method2126(byte argument_45_);

    final int or(int argument_46_, int argument_47_) {
        return argument_46_ | argument_47_;
    }

    final Class350_Sub2 method2127(byte argument_48_) {
        return (this.textureMatrix[this.activeTexUnit]);
    }

    final void method2128(int argument_49_) {
        anInterface7Array4771 = new Interface7[this.maxTextureUnits];
        this.aClass81Array4744 = new Class81[this.maxTextureUnits];
        this.rgbCombinationModes = new CombineModeEnum[this.maxTextureUnits];
        this.alphaCombinationModes = new CombineModeEnum[this.maxTextureUnits];
        this.textureMatrix = new Class350_Sub2[this.maxTextureUnits];
        for (int texUnit = 0; texUnit < this.maxTextureUnits; texUnit++) {
            this.alphaCombinationModes[texUnit] = CombineModeEnum.MODULATE;
            this.rgbCombinationModes[texUnit] = CombineModeEnum.MODULATE;
            this.aClass81Array4744[texUnit] = Node_Sub7.aClass81_3915;
            this.textureMatrix[texUnit] = new Class350_Sub2();
        }
        this.activeLights = new HardwareLight[this.anInt4756 - 2];
        this.anInterface7_4741 = method2242(1, 1, DataType.BYTE, Applet_Sub1.aClass320_9, argument_49_ + 18018);
        method2014(new dba_sub_772_Sub2(262144));
        this.aClass222_4807 = method2134((new Class289[]{new Class289(new InterleavedArrayElementEnum[]{InterleavedArrayElementEnum.VERTEX_POINTER, InterleavedArrayElementEnum.TEXCOORD_2D_POINTER})}), (byte) -125);
        this.aClass222_4821 = method2134((new Class289[]{new Class289(new InterleavedArrayElementEnum[]{InterleavedArrayElementEnum.VERTEX_POINTER, InterleavedArrayElementEnum.COLOUR_POINTER})}), (byte) -125);
        this.aClass222_4812 = method2134((new Class289[]{new Class289(InterleavedArrayElementEnum.VERTEX_POINTER), new Class289(InterleavedArrayElementEnum.COLOUR_POINTER), new Class289(InterleavedArrayElementEnum.TEXCOORD_2D_POINTER), new Class289(InterleavedArrayElementEnum.NORMAL_POINTER)}), (byte) -125);
        this.aClass222_4809 = method2134((new Class289[]{new Class289(InterleavedArrayElementEnum.VERTEX_POINTER), new Class289(InterleavedArrayElementEnum.COLOUR_POINTER), new Class289(InterleavedArrayElementEnum.TEXCOORD_2D_POINTER)}), (byte) 57);
        this.aClass167_Sub2_4817 = new Class167_Sub2(this, 0, 0, false, false);
        this.aClass167_Sub2_4815 = new Class167_Sub2(this, 0, 0, true, true);
        this.aClass167_Sub2_4814 = new Class167_Sub2(this, 0, 0, false, false);
        this.aClass167_Sub2_4818 = new Class167_Sub2(this, 0, 0, true, true);
        this.aClass167_Sub2_4804 = new Class167_Sub2(this, 0, 0, false, false);
        this.aClass167_Sub2_4806 = new Class167_Sub2(this, 0, argument_49_, true, true);
        this.aClass167_Sub2_4810 = new Class167_Sub2(this, 0, 0, false, false);
        this.aClass167_Sub2_4819 = new Class167_Sub2(this, 0, 0, true, true);
        this.aClass167_Sub2_4811 = new Class167_Sub2(this, 0, 0, false, false);
        this.aClass167_Sub2_4805 = new Class167_Sub2(this, 0, 0, true, true);
        aClass230_4723 = new Class230(this);
        anInterface4_Impl1_4813 = method2142(-1, true);
        method2235(80);
        this.aClass191_4677 = new Class191(this);
        aClass2Array4712[1] = method2247(1, argument_49_ + 2);
        aClass2Array4712[2] = method2247(2, 2);
        aClass2Array4712[4] = method2247(4, MathStatics.XOR(argument_49_, 2));
        aClass2Array4712[5] = method2247(5, 2);
        aClass2Array4712[6] = method2247(6, argument_49_ + 2);
        aClass2Array4712[7] = method2247(7, 2);
        aClass2Array4712[3] = method2247(3, 2);
        aClass2Array4712[8] = method2247(8, 2);
        aClass2Array4712[9] = method2247(9, 2);
        if (!aClass2Array4712[2].method185(93))
            aClass2Array4712[2] = method2247(0, 2);
        if (!aClass2Array4712[4].method185(68))
            aClass2Array4712[4] = aClass2Array4712[2];
        if (!aClass2Array4712[8].method185(88))
            aClass2Array4712[8] = aClass2Array4712[4];
        if (!aClass2Array4712[9].method185(59))
            aClass2Array4712[9] = aClass2Array4712[8];
        method2149(29906);
        clearClip();
        this.method2048();
    }

    final void getScissor(int[] argument_50_) {
        argument_50_[2] = this.scissorRight;
        argument_50_[3] = this.scissorY;
        argument_50_[1] = this.scissorBottom;
        argument_50_[0] = this.scissorX;
    }

    final void method2095(int argument_51_, int argument_52_, int argument_53_, int argument_54_, int argument_55_, int argument_56_, int argument_57_) {
        float f = (float) argument_53_ - (float) argument_51_;
        float f_58_ = (float) -argument_52_ + (float) argument_54_;
        float f_59_ = 0.0F;
        float f_60_ = 1.0F;
        if (f != 0.0F || f_58_ != 0.0F) {
            f_60_ = (float) Math.sqrt((double) (f_58_ * f_58_ + f * f));
            f_59_ = (float) Math.atan2((double) f_58_, (double) f);
        }
        method2198(-2);
        method2246(argument_55_, 1);
        method2229((byte) 94, GlMultiTexSourceEnum.CONSTANT, 0);
        method2224(0, GlMultiTexSourceEnum.CONSTANT, -102);
        method2147(0, argument_57_);
        this.aClass350_Sub2_4695.method3853((byte) -86, f_60_, 1.0F, (float) argument_56_);
        this.aClass350_Sub2_4695.method3835(0, -argument_56_ / 2, 0);
        this.aClass350_Sub2_4695.method3837((int) ((double) f_59_ * 2607.5945876176133) & 0x3fff);
        this.aClass350_Sub2_4695.method3835(argument_51_, argument_52_, 0);
        method2222(11570);
        method2238(-113, false);
        method2188(-27539);
        method2238(-128, true);
        method2224(0, GlMultiTexSourceEnum.TEXTURE, -96);
        method2229((byte) 110, GlMultiTexSourceEnum.TEXTURE, 0);
    }

    abstract void setTexEnvColour(int argument_61_);

    abstract void method2130(Interface4_Impl2 argument_62_, int argument_63_, int argument_64_);

    abstract void method2131(int argument_65_, int argument_66_, Interface4_Impl1 argument_67_, int argument_68_, int argument_69_, boolean argument_70_, Class390 argument_71_);

    final void method2036(Canvas argument_72_, int argument_73_, int argument_74_) {
        if (this.aCanvas4680 == argument_72_)
            throw new RuntimeException();
        if (!aHashtable4690.containsKey(argument_72_)) {
            if (!argument_72_.isShowing())
                throw new RuntimeException();
            try {
                Class var_class = Class.forName("java.awt.Canvas");
                Method method = var_class.getMethod("setIgnoreRepaint", new Class[]{Boolean.TYPE});
                method.invoke(argument_72_, new Object[]{Boolean.TRUE});
            } catch (Exception exception) {
                /* empty */
            }
            Object object = method2245((byte) 70, argument_72_);
            if (object == null)
                throw new RuntimeException();
            aHashtable4690.put(argument_72_, object);
        }
    }

    abstract boolean method2132(Class320 argument_75_, int argument_76_, DataType argument_77_);

    private final void method2133(int argument_78_) {
        if (argument_78_ != 8)
            this.aClass167_Sub2_4815 = null;
        method2130(anInterface4_Impl2_4822, 0, 113);
        method2179(aClass222_4808, (byte) -63);
        method2156(LoadingBar.aClass390_1359, 1, 0, (byte) 45);
    }

    final void EA(int argument_79_, int argument_80_, int argument_81_, int argument_82_) {
        if (!this.aBoolean4703)
            throw new RuntimeException("");
        anInt4764 = argument_81_;
        anInt4727 = argument_80_;
        anInt4776 = argument_82_;
        anInt4748 = argument_79_;
        if (aBoolean4739) {
            aClass2Array4712[3].method191((byte) -36);
            aClass2Array4712[3].method190((byte) -128);
        }
    }

    final boolean method2042() {
        return true;
    }

    final void method2073(boolean argument_83_) {
        /* empty */
    }

    abstract Class222 method2134(Class289[] argument_84_, byte argument_85_);

    final dba_sub_772 method2037(int argument_86_) {
        dba_sub_772_Sub2 var_dba_sub_772_Sub2 = new dba_sub_772_Sub2(argument_86_);
        aCyclicLinkedList_4672.add(var_dba_sub_772_Sub2);
        return var_dba_sub_772_Sub2;
    }

    abstract void enableSun(int argument_87_);

    final int method2136(byte argument_88_) {
        return anInt4776;
    }

    abstract void method2137(int argument_89_, Canvas argument_90_, Object argument_91_);

    final int i() {
        return this.anInt4749;
    }

    final void da(int argument_92_, int argument_93_, int argument_94_, int[] argument_95_) {
        float f = (this.aClass350_Sub2_4696.method3850((float) argument_93_, (float) argument_92_, 16383, (float) argument_94_));
        int anLocalInt;
        int anLocalInt_96_;
        if (!(f < -0.0078125F) && !(f > 0.0078125F)) {
            anLocalInt = this.anInt4737;
            anLocalInt_96_ = this.anInt4754;
        } else {
            anLocalInt = (int) ((float) this.anInt4750 * (this.aClass350_Sub2_4696.method3846((float) argument_92_, (float) argument_93_, (byte) 120, (float) argument_94_)) / f);
            anLocalInt_96_ = (int) ((float) this.anInt4794 * (this.aClass350_Sub2_4696.method3865(false, (float) argument_94_, (float) argument_93_, (float) argument_92_)) / f);
        }
        argument_95_[1] = (int) ((float) anLocalInt_96_ - this.aFloat4770);
        argument_95_[0] = (int) ((float) anLocalInt - this.aFloat4708);
        argument_95_[2] = (int) f;
    }

    final HardwareLight createLight(int x, int y, int z, int attenuation, int colour, float intensity) {
        return new HlHardwareLight(x, y, z, attenuation, colour, intensity);
    }

    final Class350_Sub2 method2138(int argument_103_) {
        if (!aBoolean4792) {
            aClass350_Sub2_4700.method3854((this.aClass350_Sub2_4698), (this.aClass350_Sub2_4695));
            aBoolean4792 = true;
        }
        return aClass350_Sub2_4700;
    }

    final void drawImage(int argument_104_, int argument_105_, int argument_106_, int argument_107_, int argument_108_, int argument_109_, byte[] argument_110_, int argument_111_, int argument_112_) {
        /* empty */
    }

    abstract void method2139(int argument_113_);

    void loadLights(boolean argument_114_) {
        this.previousActiveLightCount = this.activeLightCount;
        this.activeLightCount = 0;
    }

    private final void method2141(int argument_115_) {
        aBoolean4760 = false;
        if (argument_115_ != 16202)
            method2237(true, null);
        method2184(11);
        if (this.aClass221_4801 == Node_Sub31_Sub24.aClass221_5951)
            method2214((byte) -60);
    }

    final void method2014(dba_sub_772 argument_116_) {
        this.heap = (((dba_sub_772_Sub2) argument_116_).aNativeHeap6371);
        this.aNativeHeapBuffer_4687 = this.heap.safeAllocateBuffer(32768, false);
    }

    abstract Interface4_Impl1 method2142(int argument_117_, boolean argument_118_);

    final void setSun(int rgb, float light0Intensity, float light1Intensity, float sunAngleX, float sunAngleY, float sunAngleZ) {
        boolean colourChanged = sunRGB != rgb;
        if (colourChanged || this.sunLight0Intensity != light0Intensity || this.sunLight1Intensity != light1Intensity) {
            sunRGB = rgb;
            this.sunLight1Intensity = light1Intensity;
            this.sunLight0Intensity = light0Intensity;
            if (colourChanged) {
                this.sunRed = (float) (sunRGB & 0xff0000) / 1.671168E7F;
                this.sunGreen = (float) (sunRGB & 0xff00) / 65280.0F;
                this.sunBlue = (float) (sunRGB & 0xff) / 255.0F;
                applyAmbientLightModel(1);
            }
            this.aNativeInterface4675.setSunColour(this.sunRed, this.sunGreen, this.sunBlue, light0Intensity, light1Intensity);
            applySunLightColours((byte) -74);
        }
        if (sunAngleX != sunLight0Angle[0] || sunAngleY != sunLight0Angle[1] || sunLight0Angle[2] != sunAngleZ) {
            sunLight0Angle[1] = sunAngleY;
            sunLight0Angle[0] = sunAngleX;
            sunLight0Angle[2] = sunAngleZ;
            sunLight1Angle[0] = -sunAngleX;
            sunLight1Angle[2] = -sunAngleZ;
            sunLight1Angle[1] = -sunAngleY;
            float sunLength = (float) (1.0 / Math.sqrt((double) (sunAngleY * sunAngleY + (sunAngleX * sunAngleX) + (sunAngleZ * sunAngleZ))));
            this.sunLight0Position[2] = sunAngleZ * sunLength;
            this.sunLight0Position[1] = sunAngleY * sunLength;
            this.sunLight0Position[0] = sunAngleX * sunLength;
            this.sunLight1Position[1] = -this.sunLight0Position[1];
            this.sunLight1Position[2] = -this.sunLight0Position[2];
            this.sunLight1Position[0] = -this.sunLight0Position[0];
            this.aNativeInterface4675.setSunDirection(this.sunLight0Position[0], this.sunLight0Position[1], this.sunLight0Position[2]);
            applySunLightPosition(-103);
            this.anInt4704 = (int) (sunAngleZ * 256.0F / sunAngleY);
            this.anInt4705 = (int) (sunAngleX * 256.0F / sunAngleY);
        }
        enableSun(0);
    }

    abstract void applyAlphaTestToggle(int argument_125_);

    final Class350_Sub2 method2144(int argument_126_) {
        return aClass350_Sub2_4699;
    }

    final void method2018(Canvas argument_127_) {
        anObject4689 = null;
        aCanvas4681 = null;
        if (argument_127_ != null && this.aCanvas4680 != argument_127_) {
            if (aHashtable4690.containsKey(argument_127_)) {
                anObject4689 = aHashtable4690.get(argument_127_);
                aCanvas4681 = argument_127_;
            }
        } else {
            aCanvas4681 = this.aCanvas4680;
            anObject4689 = this.anObject4688;
        }
        if (aCanvas4681 == null || anObject4689 == null)
            throw new RuntimeException();
        method2170(aCanvas4681, (byte) 109, anObject4689);
        method2161(-99);
    }

    abstract void loadScissor(int argument_128_);

    final void method2074(Class72 argument_129_, int argument_130_) {
        aClass230_4723.method3074(argument_130_, argument_129_, this, (byte) -81);
    }

    private final void method2146(int argument_131_, int argument_132_, boolean argument_133_, boolean argument_134_, int argument_135_, int argument_136_) {
        argument_133_ &= method2075();
        if (!argument_133_ && (argument_136_ == 4 || argument_136_ == 8 || argument_136_ == 9)) {
            argument_136_ = 2;
            argument_135_ = argument_136_ != 4 ? 1 : argument_132_ & 0x1;
            argument_132_ = 0;
        }
        if (argument_136_ != 0 && argument_134_)
            argument_136_ |= ~0x7fffffff;
        if (argument_131_ == 8) {
            if (anInt4782 != argument_136_) {
                if (anInt4782 != 0)
                    aClass2Array4712[anInt4782 & 0x7fffffff].method195((byte) 86);
                if (argument_136_ == 0)
                    aClass2_4775 = null;
                else {
                    aClass2_4775 = aClass2Array4712[argument_136_ & 0x7fffffff];
                    aClass2_4775.method193(argument_134_, 2);
                    aClass2_4775.method189(argument_131_ ^ 0x590d, argument_134_);
                    aClass2_4775.method186(argument_132_, argument_135_, true);
                }
                anInt4753 = argument_135_;
                anInt4759 = argument_132_;
                anInt4782 = argument_136_;
            } else if (anInt4782 != 0) {
                aClass2Array4712[anInt4782 & 0x7fffffff].method189(argument_131_ + 22781, argument_134_);
                if (argument_132_ != anInt4759 || anInt4753 != argument_135_) {
                    aClass2Array4712[anInt4782 & 0x7fffffff].method186(argument_132_, argument_135_, true);
                    anInt4759 = argument_132_;
                    anInt4753 = argument_135_;
                }
            }
        }
    }

    final boolean method2065() {
        return false;
    }

    final void method2147(int argument_137_, int argument_138_) {
        if (anInt4768 != argument_138_) {
            Class85 class85;
            boolean anLocalBoolean;
            boolean anLocalBoolean_139_;
            if (argument_138_ != 1) {
                if (argument_138_ == 2) {
                    anLocalBoolean_139_ = true;
                    class85 = Node_Sub31_Sub15_Sub1.aClass85_6639;
                    anLocalBoolean = false;
                } else if (argument_138_ == 128) {
                    class85 = Class195.aClass85_1419;
                    anLocalBoolean_139_ = true;
                    anLocalBoolean = true;
                } else {
                    anLocalBoolean = false;
                    anLocalBoolean_139_ = false;
                    class85 = tia_sub_35_Sub2DoublyLinked.aClass85_6664;
                }
            } else {
                class85 = Class245_Sub2.aClass85_5310;
                anLocalBoolean = true;
                anLocalBoolean_139_ = true;
            }
            if (anLocalBoolean == !this.useAlphaTest) {
                this.useAlphaTest = anLocalBoolean;
                applyAlphaTestToggle(124);
            }
            if (this.aBoolean4783 != anLocalBoolean_139_) {
                this.aBoolean4783 = anLocalBoolean_139_;
                method2139(0);
            }
            if (this.aClass85_4707 != class85) {
                this.aClass85_4707 = class85;
                method2175((byte) 106);
            }
            anInt4768 = argument_138_;
            anInt4785 &= ~0x1c;
        }
    }

    abstract void method2148(int argument_140_);

    final void method2054(int argument_141_, int argument_142_, int argument_143_, int argument_144_, int argument_145_, int argument_146_, int argument_147_, int argument_148_, int argument_149_) {
        float f = (float) argument_143_ - (float) argument_141_;
        float f_150_ = (float) -argument_142_ + (float) argument_144_;
        if (f == 0.0F && f_150_ == 0.0F)
            f = 1.0F;
        else {
            float f_151_ = (float) (1.0 / Math.sqrt((double) (f * f + f_150_ * f_150_)));
            f *= f_151_;
            f_150_ *= f_151_;
        }
        method2198(-2);
        method2246(argument_145_, 1);
        method2229((byte) 111, GlMultiTexSourceEnum.CONSTANT, 0);
        method2224(0, GlMultiTexSourceEnum.CONSTANT, -92);
        method2147(0, argument_146_);
        method2166();
        argument_149_ %= argument_147_ + argument_148_;
        method2238(-122, false);
        float f_152_ = (float) argument_147_ * f;
        float f_153_ = (float) argument_147_ * f_150_;
        float f_154_ = 0.0F;
        float f_155_ = 0.0F;
        float f_156_ = f_152_;
        float f_157_ = f_153_;
        if (argument_149_ > argument_147_) {
            f_155_ = ((float) (argument_147_ + (argument_148_ - argument_149_)) * f_150_);
            f_154_ = f * (float) (argument_148_ + (argument_147_ - argument_149_));
        } else {
            f_157_ = (float) (argument_147_ - argument_149_) * f_150_;
            f_156_ = (float) (argument_147_ - argument_149_) * f;
        }
        float f_158_ = f_154_ + (float) argument_141_;
        float f_159_ = (float) argument_142_ + f_155_;
        float f_160_ = f * (float) argument_148_;
        float f_161_ = f_150_ * (float) argument_148_;
        for (; ; ) {
            if (argument_143_ <= argument_141_) {
                if (f_158_ < (float) argument_143_)
                    break;
                if ((float) argument_143_ > f_156_ + f_158_)
                    f_156_ = -f_158_ + (float) argument_143_;
            } else {
                if (f_158_ > (float) argument_143_)
                    break;
                if (f_158_ + f_156_ > (float) argument_143_)
                    f_156_ = (float) argument_143_ - f_158_;
            }
            if (argument_142_ >= argument_144_) {
                if (f_159_ < (float) argument_144_)
                    break;
                if (f_159_ + f_157_ < (float) argument_144_)
                    f_157_ = -f_159_ + (float) argument_144_;
            } else {
                if (f_159_ > (float) argument_144_)
                    break;
                if (f_159_ + f_157_ > (float) argument_144_)
                    f_157_ = -f_159_ + (float) argument_144_;
            }
            if (!method2193(f_158_, f_159_, 256, 0.0F, f_158_ + f_156_, f_157_ + f_159_, 0.0F))
                return;
            f_159_ += f_157_ + f_161_;
            f_158_ += f_160_ + f_156_;
            method2133(8);
            f_157_ = f_153_;
            f_156_ = f_152_;
        }
        method2238(-112, true);
        method2224(0, GlMultiTexSourceEnum.TEXTURE, -106);
        method2229((byte) -83, GlMultiTexSourceEnum.TEXTURE, 0);
    }

    void method2149(int argument_162_) {
        if (argument_162_ != 29906)
            aFloatArray4730 = null;
        method2249(argument_162_ ^ 0x74d3);
    }

    final boolean method2075() {
        return aClass2Array4712[3].method185(64);
    }

    abstract void applyFog(byte argument_163_);

    final void X(int argument_164_) {
        this.anInt4701 = 0;
        while (argument_164_ > 1) {
            argument_164_ >>= 1;
            this.anInt4701++;
        }
        this.anInt4778 = 1 << this.anInt4701;
    }

    final void method2151(int argument_165_) {
        method2207(true);
        method2214((byte) 99);
    }

    abstract void applyDepthMaskToggle(int argument_166_);

    final void method2053(int argument_167_) {
        if (argument_167_ < 128 || argument_167_ > 1024)
            throw new IllegalArgumentException();
        if (aClass138_4766 != null)
            aClass138_4766.method2465(true);
        this.anInt4734 = argument_167_;
    }

    void processDeletions(int argument_168_) {
        if (aClass138_4766 != null)
            aClass138_4766.method2462(105);
        this.anInt4757 = argument_168_ & 0x7fffffff;
    }

    final Interface7_Impl2 method2153(byte[] argument_169_, int argument_170_, int argument_171_, byte argument_172_, boolean argument_173_, Class320 argument_174_) {
        return method2125(argument_173_, argument_174_, argument_171_, 0, argument_169_, 8, argument_170_, 0);
    }

    final void H(int argument_175_, int argument_176_, int argument_177_, int[] argument_178_) {
        float f = (this.aClass350_Sub2_4696.method3850((float) argument_176_, (float) argument_175_, 16383, (float) argument_177_));
        int anLocalInt;
        int anLocalInt_179_;
        if (!(f < -0.0078125F) && !(f > 0.0078125F)) {
            anLocalInt_179_ = this.anInt4754;
            anLocalInt = this.anInt4737;
        } else {
            anLocalInt = (int) ((float) this.anInt4750 * (this.aClass350_Sub2_4696.method3846((float) argument_175_, (float) argument_176_, (byte) 120, (float) argument_177_)) / f);
            anLocalInt_179_ = (int) ((float) this.anInt4794 * (this.aClass350_Sub2_4696.method3865(false, (float) argument_177_, (float) argument_176_, (float) argument_175_)) / f);
        }
        argument_178_[1] = (int) (-this.aFloat4770 + (float) anLocalInt_179_);
        argument_178_[0] = (int) (-this.aFloat4708 + (float) anLocalInt);
        argument_178_[2] = (int) f;
    }

    abstract Interface7_Impl1 method2154(Class320 argument_180_, int argument_181_, int argument_182_, int argument_183_, byte[] argument_184_, int argument_185_);

    final void fillRect(int argument_186_, int argument_187_, int argument_188_, int argument_189_, int argument_190_, int argument_191_) {
        method2198(-2);
        method2246(argument_190_, 1);
        method2229((byte) -75, GlMultiTexSourceEnum.CONSTANT, 0);
        method2224(0, GlMultiTexSourceEnum.CONSTANT, -92);
        method2147(0, argument_191_);
        this.aClass350_Sub2_4695.method3853((byte) -120, (float) argument_188_, 1.0F, (float) argument_189_);
        this.aClass350_Sub2_4695.method3835(argument_186_, argument_187_, 0);
        method2222(11570);
        method2238(-112, false);
        method2188(-27539);
        method2238(-104, true);
        method2224(0, GlMultiTexSourceEnum.TEXTURE, -83);
        method2229((byte) -58, GlMultiTexSourceEnum.TEXTURE, 0);
    }

    abstract boolean method2155(Class320 argument_192_, DataType argument_193_, boolean argument_194_);

    abstract void method2156(Class390 argument_195_, int argument_196_, int argument_197_, byte argument_198_);

    abstract void applyScissorTestToggle(int argument_199_);

    private final void method2158(int argument_200_, int argument_201_, Class390 argument_202_) {
        if (argument_200_ >= -113)
            method2192((byte) 59, false);
        method2130(anInterface4_Impl2_4803, 0, 5);
        method2179(aClass222_4823, (byte) -63);
        method2156(argument_202_, argument_201_, 0, (byte) 42);
    }

    private final void method2159(boolean argument_203_) {
        if (Class350_Sub1.aClass221_5431 != this.aClass221_4801) {
            Class221 class221 = this.aClass221_4801;
            this.aClass221_4801 = Class350_Sub1.aClass221_5431;
            if (class221.method3029(38))
                method2230(3);
            method2208(15);
            this.aFloatArray4755 = aFloatArray4730;
            method2214((byte) 123);
            anInt4785 &= ~0x18;
        }
    }

    final void method2160(byte argument_204_) {
        Enumeration enumeration = aHashtable4690.keys();
        while (enumeration.hasMoreElements()) {
            Canvas canvas = (Canvas) enumeration.nextElement();
            method2137(127, canvas, aHashtable4690.get(canvas));
        }
        anInterface4_Impl2_4803.method44(487);
        anInterface4_Impl2_4822.method44(487);
        anInterface4_Impl2_4802.method44(487);
        this.aClass167_Sub2_4815.method2699(63);
        this.aClass167_Sub2_4818.method2699(31);
        this.aClass167_Sub2_4806.method2699(111);
        this.aClass167_Sub2_4819.method2699(120);
        this.aClass167_Sub2_4805.method2699(82);
        aClass230_4723.method3071(-37);
        anInterface4_Impl1_4813.method44(487);
    }

    final void ra(int argument_205_, int argument_206_, int argument_207_, int argument_208_) {
        anInt4727 = argument_206_;
        anInt4748 = argument_205_;
        anInt4764 = argument_207_;
        this.aBoolean4703 = true;
        anInt4776 = argument_208_;
    }

    private final void method2161(int argument_209_) {
        if (argument_209_ <= -93) {
            if (aCanvas4681 != null) {
                Dimension dimension = aCanvas4681.getSize();
                anInt4683 = dimension.width;
                anInt4678 = dimension.height;
            } else
                anInt4683 = anInt4678 = 1;
            this.viewportH = anInt4678;
            this.viewportW = anInt4683;
            method2227(-16826);
            method2141(16202);
            method2225(-14326);
            loadViewport((byte) -30);
            method2221(-1);
            method2207(true);
            clearClip();
        }
    }

    final Class_s method2085(int argument_210_, int argument_211_, int[][] argument_212_, int[][] argument_213_, int argument_214_, int argument_215_, int argument_216_) {
        return new Class_s_Sub1(this, argument_215_, argument_216_, argument_210_, argument_211_, argument_212_, argument_213_, argument_214_);
    }

    private final void method2162(int argument_217_) {
        anInterface4_Impl2_4803 = method2248(argument_217_, false);
        anInterface4_Impl2_4803.method52(140, 28, -10760);
        for (int anLocalInt = 0; anLocalInt < 4; anLocalInt++) {
            Buffer buffer = anInterface4_Impl2_4803.method50(true, true);
            if (buffer != null) {
                Stream stream = method2116(argument_217_ ^ 0x9, buffer);
                if (Stream.isBigEndian()) {
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(1.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(1.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(1.0F);
                    stream.writeFloatBE(1.0F);
                    stream.writeFloatBE(1.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(1.0F);
                    stream.writeFloatBE(1.0F);
                    stream.writeFloatBE(1.0F);
                    stream.writeFloatBE(1.0F);
                    stream.writeFloatBE(1.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(1.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(1.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                    stream.writeFloatBE(0.0F);
                } else {
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(1.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(1.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(1.0F);
                    stream.writeFloatLE(1.0F);
                    stream.writeFloatLE(1.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(1.0F);
                    stream.writeFloatLE(1.0F);
                    stream.writeFloatLE(1.0F);
                    stream.writeFloatLE(1.0F);
                    stream.writeFloatLE(1.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(1.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(1.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                    stream.writeFloatLE(0.0F);
                }
                stream.upload();
                if (anInterface4_Impl2_4803.method53(10925))
                    break;
            }
        }
        aClass222_4823 = method2134((new Class289[]{new Class289(new InterleavedArrayElementEnum[]{InterleavedArrayElementEnum.VERTEX_POINTER, InterleavedArrayElementEnum.TEXCOORD_2D_POINTER, InterleavedArrayElementEnum.TEXCOORD_2D_POINTER})}), (byte) -125);
    }

    final void removeCanvas(Canvas argument_218_) {
        if (argument_218_ == this.aCanvas4680)
            throw new RuntimeException();
        if (aHashtable4690.containsKey(argument_218_)) {
            method2137(114, argument_218_, aHashtable4690.get(argument_218_));
            aHashtable4690.remove(argument_218_);
        }
    }

    abstract Interface7_Impl2 method2163(int argument_219_, float[] argument_220_, Class320 argument_221_, int argument_222_, int argument_223_, int argument_224_, int argument_225_, boolean argument_226_);

    static final void method2164(byte argument) {
        for (DoublyLinkedNode_Sub51_Sub2 class59_sub51_sub2 = ((DoublyLinkedNode_Sub51_Sub2) Class305.aCyclicLinkedList_3640.getFirst()); class59_sub51_sub2 != null; class59_sub51_sub2 = ((DoublyLinkedNode_Sub51_Sub2) Class305.aCyclicLinkedList_3640.getNext())) {
            DoublyLinkedNodeP2_Sub2_Sub2_Sub4 class104_sub2_sub2_sub4 = (class59_sub51_sub2.aClass104_Sub2_Sub2_Sub4_6225);
            if (class104_sub2_sub2_sub4.aBoolean6723) {
                class59_sub51_sub2.unlink();
                class104_sub2_sub2_sub4.method1818(true);
            } else if ((class104_sub2_sub2_sub4.anInt6717) <= Class333.anInt2720) {
                class104_sub2_sub2_sub4.method1819(Class350.anInt2930, (byte) -43);
                if (class104_sub2_sub2_sub4.aBoolean6723)
                    class59_sub51_sub2.unlink();
                else
                    Node_Sub47_Sub6.method1126(class104_sub2_sub2_sub4, true);
            }
        }
    }

    abstract float method2165(int argument_227_);

    final void method2166() {
        this.aClass350_Sub2_4695.method3840();
        this.aBoolean4694 = true;
        method2240();
    }

    abstract void applyActiveTexture(byte argument_229_);

    final void setActiveTexture(int argument_231_) {
        if (this.activeTexUnit != argument_231_) {
            this.activeTexUnit = argument_231_;
            applyActiveTexture((byte) 123);
        }
    }

    abstract void unbindActiveTexture(byte argument_232_);

    abstract void method2170(Canvas argument_233_, byte argument_234_, Object argument_235_);

    final void method2171(int argument_236_, Class81 argument_237_) {
        this.aClass81Array4744[(this.activeTexUnit)] = argument_237_;
        method2186(1);
    }

    final void method2067(Class72 argument_238_) {
        aClass230_4723.method3074(-1, argument_238_, this, (byte) -121);
    }

    final void method2172(byte argument_239_, boolean argument_240_) {
        if (this.aBoolean4789 != argument_240_) {
            this.aBoolean4789 = argument_240_;
            applyLightingToggle(false);
            anInt4785 &= ~0x7;
        }
    }

    final NativeHeapBuffer allocateBuffer(boolean argument_241_, int size) {
        return this.heap.safeAllocateBuffer(size, argument_241_);
    }

    final int method2174(boolean argument_244_) {
        return anInt4727;
    }

    final void pa() {
        this.aBoolean4703 = false;
    }

    final Class350 method2029() {
        return new Class350_Sub2();
    }

    abstract void method2175(byte argument_245_);

    final void drawDot(int argument_246_, int argument_247_, int argument_248_, int argument_249_, int argument_250_) {
        method2198(-2);
        method2246(argument_249_, 1);
        method2229((byte) 119, GlMultiTexSourceEnum.CONSTANT, 0);
        method2224(0, GlMultiTexSourceEnum.CONSTANT, -106);
        method2147(0, argument_250_);
        this.aClass350_Sub2_4695.method3853((byte) 87, (float) argument_248_, 1.0F, (float) argument_248_);
        this.aClass350_Sub2_4695.method3835(argument_246_, argument_247_, 0);
        method2222(11570);
        method2238(-122, false);
        method2130(anInterface4_Impl2_4802, 0, -97);
        method2179(aClass222_4816, (byte) -63);
        method2156(Class387.aClass390_3267, 256, 0, (byte) 87);
        method2238(-124, true);
        method2224(0, GlMultiTexSourceEnum.TEXTURE, -116);
        method2229((byte) 98, GlMultiTexSourceEnum.TEXTURE, 0);
    }

    final void setAmbientIntensity(float argument_251_) {
        if (this.ambientModelIntensity != argument_251_) {
            this.ambientModelIntensity = argument_251_;
            this.aNativeInterface4675.setAmbient(argument_251_);
            applyAmbientLightModel(1);
            enableSun(0);
        }
    }

    final float[] method2176() {
        return aFloatArray4743;
    }

    GraphicsToolkit_Sub2(Canvas argument_252_, Object argument_253_, TextureSource argument_254_, Js5Store argument_255_, int argument_256_, int argument_257_) {
        super(argument_254_);
        this.scissorX = 0;
        this.fogColour = -1;
        this.sunRed = 1.0F;
        aBoolean4739 = false;
        sunLight0Angle = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
        this.sunLight1Intensity = -1.0F;
        this.activeTexUnit = 0;
        aFloatArray4730 = new float[16];
        anInt4727 = -1;
        this.ambientModelIntensity = 1.0F;
        this.sunLight0Position = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
        aFloatArray4743 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        this.aFloat4746 = 3584.0F;
        this.sunBlue = 1.0F;
        aFloat4722 = 1.0F;
        this.anInt4750 = 512;
        this.scissorRight = 0;
        aClass2Array4712 = new Class2[10];
        this.sunLight0Intensity = -1.0F;
        aFloatArray4732 = new float[16];
        this.anInt4737 = 0;
        aBoolean4742 = false;
        anInt4753 = 0;
        aBoolean4740 = false;
        this.aBoolean4719 = true;
        this.farPlane = 3584;
        this.fogDistance = 0;
        this.anInt4749 = 50;
        this.scissorY = 0;
        this.aFloatArray4755 = aFloatArray4743;
        this.sunLight1Position = new float[]{0.0F, 0.0F, -1.0F, 0.0F};
        this.aBoolean4783 = true;
        anInt4777 = -1;
        this.aClass85_4707 = Class245_Sub2.aClass85_5310;
        this.anInt4701 = 3;
        anInt4782 = 0;
        anInt4764 = -1;
        this.aBoolean4721 = false;
        anInt4776 = 0;
        this.fogThickness = -1;
        this.aFloat4747 = 3584.0F;
        this.useAlphaTest = true;
        anInt4768 = 1;
        aBoolean4760 = false;
        this.viewportY = 0;
        this.aBoolean4786 = true;
        this.anInt4778 = 8;
        this.anInt4754 = 0;
        this.anInt4734 = 128;
        this.anInt4794 = 512;
        this.aBoolean4784 = false;
        aBoolean4792 = false;
        this.scissorBottom = 0;
        aFloatArray4793 = new float[16];
        anInt4759 = 0;
        aBoolean4796 = false;
        sunLight1Angle = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
        this.aBoolean4789 = false;
        this.viewportX = 0;
        this.sunGreen = 1.0F;
        this.aClass221_4801 = DoublyLinkedNodeP2_Sub2_Sub4_Sub2.aClass221_6583;
        sunRGB = 16777215;
        aStream4800 = new Stream();
        aClass350_Sub2_4820 = new Class350_Sub2();
        try {
            this.anInt4765 = argument_256_;
            this.aJs5Store_4673 = argument_255_;
            aCanvas4681 = this.aCanvas4680 = argument_252_;
            anObject4689 = this.anObject4688 = argument_253_;
            Dimension dimension = argument_252_.getSize();
            this.anInt4774 = argument_257_;
            this.viewportH = anInt4678 = dimension.height;
            this.viewportW = anInt4683 = dimension.width;
            Node_Sub47_Sub1.method1116(true, false, true);
            if (this.textureSource != null) {
                aClass138_4766 = new Class138(this, this.textureSource);
                this.aNativeInterface4675 = new NativeInterface(this.textureSource.method11((byte) 40), this.anInt4774);
                for (int anLocalInt = 0; (this.textureSource.method11((byte) 18) > anLocalInt); anLocalInt++) {
                    TextureDescriptor textureDescriptor = this.textureSource.getDescriptor(anLocalInt, true);
                    if (textureDescriptor != null)
                        this.aNativeInterface4675.initTextureMetrics(anLocalInt, textureDescriptor.aByte840, textureDescriptor.aByte828);
                }
            } else {
                this.aNativeInterface4675 = new NativeInterface(0, this.anInt4774);
                aClass138_4766 = null;
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.method2027((byte) -109);
            throw new RuntimeException("");
        }
    }

    abstract void method2177(boolean argument_258_);

    final int XA() {
        return this.farPlane;
    }

    final boolean method2076() {
        return true;
    }

    abstract void method2178(byte argument_259_);

    abstract void method2179(Class222 argument_260_, byte argument_261_);

    final int method2180(int argument_262_) {
        int anLocalInt = 50 / ((argument_262_ + 12) / 51);
        return this.activeTexUnit;
    }

    private final void method2181(int argument_263_) {
        anInterface4_Impl2_4802 = method2248(0, false);
        if (argument_263_ != 256)
            method2116(97, null);
        anInterface4_Impl2_4802.method52(3096, 12, argument_263_ - 11016);
        for (int anLocalInt = 0; anLocalInt < 4; anLocalInt++) {
            Buffer buffer = anInterface4_Impl2_4802.method50(true, true);
            if (buffer != null) {
                Stream stream = method2116(argument_263_ ^ 0x109, buffer);
                stream.writeFloatBE(0.0F);
                stream.writeFloatBE(0.0F);
                stream.writeFloatBE(0.0F);
                for (int anLocalInt_264_ = 0; anLocalInt_264_ <= 256; anLocalInt_264_++) {
                    double d = ((double) (anLocalInt_264_ * 2) * 3.141592653589793 / 256.0);
                    float f = (float) Math.cos(d);
                    float f_265_ = (float) Math.sin(d);
                    if (Stream.isBigEndian()) {
                        stream.writeFloatBE(f_265_);
                        stream.writeFloatBE(f);
                        stream.writeFloatBE(0.0F);
                    } else {
                        stream.writeFloatLE(f_265_);
                        stream.writeFloatLE(f);
                        stream.writeFloatLE(0.0F);
                    }
                }
                stream.upload();
                if (anInterface4_Impl2_4802.method53(argument_263_ + 10669))
                    break;
            }
        }
        aClass222_4816 = method2134((new Class289[]{new Class289(InterleavedArrayElementEnum.VERTEX_POINTER)}), (byte) 52);
    }

    final void drawHLine(int argument_266_, int argument_267_, int argument_268_, int argument_269_, int argument_270_) {
        drawLine(argument_266_, argument_267_, argument_266_ + argument_268_, argument_267_, argument_269_, argument_270_);
    }

    abstract void setMultiTexAlphaSource(int argument_274_, GlMultiTexSourceEnum argument_271_, boolean argument_272_, boolean argument_273_);

    final void method2183(int argument_275_) {
        if (anInt4785 != 2) {
            method2159(true);
            method2243(-545832829, false);
            method2172((byte) -68, false);
            method2189(1, false);
            method2212((byte) 123, false);
            method2215(false, -2, false, (byte) -112);
            anInt4785 = 2;
        }
    }

    final void method2089(int argument_276_) {
        if (argument_276_ != 1)
            throw new IllegalArgumentException("");
    }

    final void drawLine(int argument_277_, int argument_278_, int argument_279_, int argument_280_, int argument_281_, int argument_282_) {
        float f = (float) -argument_277_ + (float) argument_279_;
        float f_283_ = (float) -argument_278_ + (float) argument_280_;
        if (f == 0.0F && f_283_ == 0.0F)
            f = 1.0F;
        else {
            float f_284_ = (float) (1.0 / Math.sqrt((double) (f * f + f_283_ * f_283_)));
            f_283_ *= f_284_;
            f *= f_284_;
        }
        if (method2193((float) argument_277_, (float) argument_278_, 256, 0.0F, f + (float) argument_279_, (float) argument_280_ + f_283_, 0.0F)) {
            method2198(-2);
            method2246(argument_281_, 1);
            method2229((byte) -124, GlMultiTexSourceEnum.CONSTANT, 0);
            method2224(0, GlMultiTexSourceEnum.CONSTANT, -81);
            method2147(0, argument_282_);
            method2166();
            method2238(-114, false);
            method2133(8);
            method2238(-117, true);
            method2224(0, GlMultiTexSourceEnum.TEXTURE, -82);
            method2229((byte) -81, GlMultiTexSourceEnum.TEXTURE, 0);
        }
    }

    private final void method2184(int argument_285_) {
        if (!aBoolean4760) {
            float[] fs = aFloatArray4732;
            float f = ((float) (-this.anInt4737 * this.anInt4749) / (float) this.anInt4750);
            float f_286_ = ((float) ((this.viewportW - this.anInt4737) * this.anInt4749) / (float) this.anInt4750);
            float f_287_ = ((float) (this.anInt4749 * this.anInt4754) / (float) this.anInt4794);
            float f_288_ = ((float) (this.anInt4749 * (this.anInt4754 - this.viewportH)) / (float) this.anInt4794);
            if (f_286_ != f && f_288_ != f_287_) {
                float f_289_ = (float) this.anInt4749 * 2.0F;
                fs[9] = (f_287_ + f_288_) / (-f_288_ + f_287_);
                fs[0] = f_289_ / (-f + f_286_);
                fs[4] = 0.0F;
                fs[8] = (f + f_286_) / (-f + f_286_);
                fs[7] = 0.0F;
                fs[6] = 0.0F;
                fs[10] = aFloat4733 = ((float) this.farPlane / (float) (-this.farPlane + this.anInt4749));
                fs[5] = f_289_ / (-f_288_ + f_287_);
                fs[15] = 0.0F;
                fs[1] = 0.0F;
                fs[11] = -1.0F;
                fs[12] = 0.0F;
                fs[2] = 0.0F;
                fs[14] = aFloat4790 = ((float) (this.farPlane * this.anInt4749) / (float) (-this.farPlane + this.anInt4749));
                fs[3] = 0.0F;
                fs[13] = 0.0F;
            } else {
                fs[8] = 0.0F;
                fs[11] = 0.0F;
                fs[6] = 0.0F;
                fs[3] = 0.0F;
                fs[5] = 1.0F;
                fs[10] = 1.0F;
                fs[2] = 0.0F;
                fs[0] = 1.0F;
                fs[1] = 0.0F;
                fs[12] = 0.0F;
                fs[14] = 0.0F;
                fs[15] = 1.0F;
                fs[9] = 0.0F;
                fs[13] = 0.0F;
                fs[4] = 0.0F;
                fs[7] = 0.0F;
            }
            method2211(argument_285_ + 12847);
            aBoolean4760 = true;
        }
        if (argument_285_ != 11)
            aClass222_4816 = null;
    }

    final Class368 method2082(int[] argument_290_, int argument_291_, int argument_292_, int argument_293_, int argument_294_, boolean argument_295_) {
        return new Class368_Sub1(this, argument_293_, argument_294_, argument_290_, argument_291_, argument_292_);
    }

    final void drawRect(int argument_296_, int argument_297_, int argument_298_, int argument_299_, int argument_300_, int argument_301_) {
        float f = method2165(-116);
        method2198(-2);
        method2246(argument_300_, 1);
        method2229((byte) 101, GlMultiTexSourceEnum.CONSTANT, 0);
        method2224(0, GlMultiTexSourceEnum.CONSTANT, -87);
        method2147(0, argument_301_);
        this.aClass350_Sub2_4695.method3853((byte) 114, (float) (argument_298_ - 1), 1.0F, (float) (argument_299_ - 1));
        this.aClass350_Sub2_4695.method3864(18645, 0.0F, -f + (float) argument_297_, -f + (float) argument_296_);
        method2222(11570);
        method2238(-110, false);
        method2158(-118, 4, Statics.aClass390_1649);
        method2238(-109, true);
        method2224(0, GlMultiTexSourceEnum.TEXTURE, -83);
        method2229((byte) -69, GlMultiTexSourceEnum.TEXTURE, 0);
    }

    final Interface7_Impl2 method2185(int argument_302_, int argument_303_, int argument_304_, Class320 argument_305_, float[] argument_306_, boolean argument_307_) {
        return method2163(0, argument_306_, argument_305_, 0, argument_304_, argument_303_, 0, argument_307_);
    }

    private final void method2186(int argument_308_) {
        if (argument_308_ != 1)
            this.sunLight1Position = null;
        method2126((byte) -21);
        if (aClass2_4775 != null)
            aClass2_4775.method188((byte) -56);
    }

    final Class350_Sub2 method2187(byte argument_309_) {
        return this.aClass350_Sub2_4695;
    }

    final Class350 method2096() {
        return this.aClass350_Sub2_4696;
    }

    final void method2188(int argument_310_) {
        method2158(-119, 2, Class387.aClass390_3267);
    }

    final void method2030(Skybox argument_311_) {
        aClass67_Sub2_4736 = (DxSkybox) argument_311_;
    }

    final void method2043(int argument_312_) {
        /* empty */
    }

    final void method2189(int argument_313_, boolean argument_314_) {
        if (argument_314_ != this.aBoolean4721) {
            this.aBoolean4721 = argument_314_;
            method2177(true);
            anInt4785 &= ~0x1f;
        }
    }

    final AbstractFont method2083(Class76 argument_315_, Class83[] argument_316_, boolean argument_317_) {
        return new AbstractFont_Sub4(this, argument_315_, argument_316_, argument_317_);
    }

    final void method2190(byte argument_318_, byte argument_319_) {
        method2246((argument_318_ << 8 | (argument_318_ << 24 | argument_318_ << 16) | argument_318_), 1);
    }

    final void method2191(int argument_320_, boolean argument_321_) {
        if (argument_321_ == !this.aBoolean4706) {
            this.aBoolean4706 = argument_321_;
            method2178((byte) 82);
        }
        if (argument_320_ != 8)
            this.scissorX = -77;
    }

    final void method2192(byte argument_322_, boolean argument_323_) {
        if (!argument_323_ != !this.aBoolean4784) {
            this.aBoolean4784 = argument_323_;
            applyLightingToggle(false);
        }
    }

    final boolean method2049() {
        return true;
    }

    private final boolean method2193(float argument_324_, float argument_325_, int argument_326_, float argument_327_, float argument_328_, float argument_329_, float argument_330_) {
        Buffer buffer = anInterface4_Impl2_4822.method50(true, true);
        if (buffer == null)
            return false;
        if (argument_326_ != 256)
            return true;
        Stream stream = method2116(argument_326_ ^ 0x109, buffer);
        if (!Stream.isBigEndian()) {
            stream.writeFloatLE(argument_324_);
            stream.writeFloatLE(argument_325_);
            stream.writeFloatLE(argument_327_);
            stream.writeFloatLE(argument_328_);
            stream.writeFloatLE(argument_329_);
            stream.writeFloatLE(argument_330_);
        } else {
            stream.writeFloatBE(argument_324_);
            stream.writeFloatBE(argument_325_);
            stream.writeFloatBE(argument_327_);
            stream.writeFloatBE(argument_328_);
            stream.writeFloatBE(argument_329_);
            stream.writeFloatBE(argument_330_);
        }
        stream.upload();
        return anInterface4_Impl2_4822.method53(argument_326_ ^ 0x2bad);
    }

    final void draw3DTriangle(int argument_331_, int argument_332_, int argument_333_, int argument_334_, int argument_335_, int argument_336_, int argument_337_, int argument_338_, int argument_339_, int argument_340_, int argument_341_, int argument_342_, int argument_343_) {
        /* empty */
    }

    final boolean method2060() {
        return true;
    }

    final void method2194(boolean argument_344_, int argument_345_) {
        if (argument_345_ != 64)
            method2117(6);
        if (!this.aBoolean4719 != !argument_344_) {
            this.aBoolean4719 = argument_344_;
            method2122(4);
        }
    }

    abstract void method2195(byte argument_346_, Canvas argument_347_, Object argument_348_);

    final void setCanvas(Canvas argument_349_, int argument_350_, int argument_351_) {
        Object object = null;
        if (argument_349_ == null || argument_349_ == this.aCanvas4680)
            object = anObject4689;
        else if (aHashtable4690.containsKey(argument_349_))
            object = aHashtable4690.get(argument_349_);
        if (object == null)
            throw new RuntimeException();
        method2195((byte) 95, argument_349_, object);
        if (aCanvas4681 == argument_349_)
            method2161(-113);
    }

    final void method2196(int argument_352_) {
        if (argument_352_ != 1)
            this.aBoolean4715 = true;
        if (anInt4785 != 4) {
            method2159(true);
            method2243(-545832829, false);
            method2172((byte) -68, false);
            method2189(argument_352_, false);
            method2212((byte) 124, false);
            method2215(false, -2, false, (byte) -112);
            method2147(argument_352_ ^ 0x1, 1);
            method2216((byte) -99, 0);
            anInt4785 = 4;
        }
    }

    abstract void applySunLightPosition(int argument_353_);

    private final void method2198(int argument_354_) {
        if (argument_354_ != (anInt4785 ^ 0xffffffff)) {
            method2159(true);
            method2243(-545832829, false);
            method2172((byte) -68, false);
            method2189(1, false);
            method2212((byte) 3, false);
            method2215(false, -2, false, (byte) -112);
            method2216((byte) 78, 1);
            method2237(true, this.anInterface7_4741);
            anInt4785 = 1;
        }
    }

    final Interface4_Impl1 method2199(byte argument_355_, int argument_356_) {
        if (argument_356_ * 2 > anInterface4_Impl1_4813.getSize((byte) 91))
            anInterface4_Impl1_4813.method45(argument_356_, (byte) -73);
        return anInterface4_Impl1_4813;
    }

    final void HA(int argument_357_, int argument_358_, int argument_359_, int argument_360_, int[] argument_361_) {
        float f = (this.aClass350_Sub2_4696.method3850((float) argument_358_, (float) argument_357_, 16383, (float) argument_359_));
        if (f < (float) this.anInt4749 || (float) this.farPlane < f)
            argument_361_[0] = argument_361_[1] = argument_361_[2] = -1;
        else {
            int anLocalInt = (int) ((float) this.anInt4750 * (this.aClass350_Sub2_4696.method3846((float) argument_357_, (float) argument_358_, (byte) 120, (float) argument_359_)) / (float) argument_360_);
            int anLocalInt_362_ = (int) ((float) this.anInt4794 * (this.aClass350_Sub2_4696.method3865(false, (float) argument_359_, (float) argument_358_, (float) argument_357_)) / (float) argument_360_);
            argument_361_[2] = (int) f;
            argument_361_[0] = (int) (-this.aFloat4708 + (float) anLocalInt);
            argument_361_[1] = (int) ((float) anLocalInt_362_ - this.aFloat4770);
        }
    }

    final void method2200(boolean argument_363_) {
        if (anInt4785 != 8) {
            method2218((byte) 106);
            method2243(-545832829, true);
            method2189(1, true);
            method2212((byte) -122, true);
            method2147(0, 1);
            anInt4785 = 8;
        }
    }

    abstract void applySunLightColours(byte argument_364_);

    private final void method2202(boolean argument_365_) {
        if (argument_365_ != true)
            method2212((byte) 15, false);
        if (!aBoolean4740) {
            float[] fs = aFloatArray4793;
            float f = (float) this.anInt4749;
            float f_366_ = (float) this.farPlane;
            float f_367_ = (aFloat4722 * (float) -this.anInt4754 / (float) this.anInt4794);
            float f_368_ = ((float) -this.anInt4737 * aFloat4722 / (float) this.anInt4750);
            float f_369_ = (aFloat4722 * (float) (-this.anInt4737 + this.viewportW) / (float) this.anInt4750);
            float f_370_ = (aFloat4722 * (float) (-this.anInt4754 + this.viewportH) / (float) this.anInt4794);
            if (f_368_ == f_369_ || f_370_ == f_367_) {
                fs[15] = 1.0F;
                fs[1] = 0.0F;
                fs[0] = 1.0F;
                fs[13] = 0.0F;
                fs[11] = 0.0F;
                fs[5] = 1.0F;
                fs[10] = 1.0F;
                fs[2] = 0.0F;
                fs[7] = 0.0F;
                fs[3] = 0.0F;
                fs[6] = 0.0F;
                fs[8] = 0.0F;
                fs[9] = 0.0F;
                fs[4] = 0.0F;
                fs[12] = 0.0F;
                fs[14] = 0.0F;
            } else {
                fs[12] = (f_368_ + f_369_) / (f_368_ - f_369_);
                fs[14] = f / (-f_366_ + f);
                fs[5] = 2.0F / (f_370_ - f_367_);
                fs[15] = 1.0F;
                fs[10] = 1.0F / (f - f_366_);
                fs[6] = 0.0F;
                fs[8] = 0.0F;
                fs[7] = 0.0F;
                fs[2] = 0.0F;
                fs[1] = 0.0F;
                fs[4] = 0.0F;
                fs[9] = 0.0F;
                fs[0] = 2.0F / (f_369_ - f_368_);
                fs[13] = (f_370_ + f_367_) / (f_370_ - f_367_);
                fs[3] = 0.0F;
                fs[11] = 0.0F;
            }
            method2241(-118);
            aBoolean4740 = true;
        }
    }

    private final void method2203(int argument_371_) {
        anInterface4_Impl2_4822 = method2248(0, true);
        anInterface4_Impl2_4822.method52(24, argument_371_, -10760);
        aClass222_4808 = method2134((new Class289[]{new Class289(InterleavedArrayElementEnum.VERTEX_POINTER)}), (byte) -124);
    }

    static final void method2204(byte[][] argument, Class303_Sub1 argument_372_, byte argument_373_) {
        int[] anLocalInts = {-1, 0, 0, 0, 0};
        for (int anLocalInt = 0; anLocalInt < argument_372_.mapHeight; anLocalInt++) {
            Class47.method453((byte) -48);
            for (int anLocalInt_374_ = 0; anLocalInt_374_ < MapRelated.mapWidth >> 3; anLocalInt_374_++) {
                for (int anLocalInt_375_ = 0; MapRelated.mapDepth >> 3 > anLocalInt_375_; anLocalInt_375_++) {
                    int anLocalInt_376_ = (MapRelated.mapGenerationArray[anLocalInt][anLocalInt_374_][anLocalInt_375_]);
                    if (anLocalInt_376_ != -1) {
                        int anLocalInt_377_ = (anLocalInt_376_ & 0x3f9ef53) >> 24;
                        if (!argument_372_.aBoolean2561 || anLocalInt_377_ == 0) {
                            int anLocalInt_378_ = anLocalInt_376_ >> 1 & 0x3;
                            int anLocalInt_379_ = (anLocalInt_376_ & 0xfff51f) >> 14;
                            int anLocalInt_380_ = anLocalInt_376_ >> 3 & 0x7ff;
                            int anLocalInt_381_ = ((anLocalInt_379_ / 8 << 8) + anLocalInt_380_ / 8);
                            for (int anLocalInt_382_ = 0; (MapRelated.mapCoordinates.length > anLocalInt_382_); anLocalInt_382_++) {
                                if ((MapRelated.mapCoordinates[anLocalInt_382_] == anLocalInt_381_) && argument[anLocalInt_382_] != null) {
                                    Packet class59_sub28 = new Packet(argument[anLocalInt_382_]);
                                    argument_372_.method3575(anLocalInt_378_, anLocalInt_374_ * 8, anLocalInt_375_ * 8, MapRelated.clippingMaps, anLocalInt_377_, anLocalInt, anLocalInt_379_, class59_sub28, anLocalInt_380_, argument_373_ ^ ~0x5a);
                                    argument_372_.method3585(anLocalInt_375_ * 8, false, anLocalInt, (anLocalInts[0] == -1 ? anLocalInts : null), anLocalInt_377_, anLocalInt_374_ * 8, class59_sub28, anLocalInt_379_, anLocalInt_378_, anLocalInt_380_, Class389.aGraphicsToolkit3281);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (argument_373_ != -91)
            method2164((byte) 69);
        for (int anLocalInt = 0; argument_372_.mapHeight > anLocalInt; anLocalInt++) {
            Class47.method453((byte) -93);
            for (int anLocalInt_383_ = 0; MapRelated.mapWidth >> 3 > anLocalInt_383_; anLocalInt_383_++) {
                for (int anLocalInt_384_ = 0; anLocalInt_384_ < MapRelated.mapDepth >> 3; anLocalInt_384_++) {
                    int anLocalInt_385_ = (MapRelated.mapGenerationArray[anLocalInt][anLocalInt_383_][anLocalInt_384_]);
                    if (anLocalInt_385_ == -1)
                        argument_372_.method3571(anLocalInt_384_ * 8, 8, anLocalInt, anLocalInt_383_ * 8, 8, (byte) 111);
                }
            }
        }
        if (anLocalInts[0] != -1) {
            Class_s.aClass195_2551 = Statics.aClass333_2631.method3727(-18085, anLocalInts[2], (InputStream_Sub2.aClass64_35), anLocalInts[3], anLocalInts[1], anLocalInts[0]);
            Statics.anInt6416 = anLocalInts[4];
        }
    }

    abstract void setMultiTexRgbSource(int argument_389_, boolean argument_386_, boolean argument_387_, GlMultiTexSourceEnum argument_390_, byte argument_388_);

    abstract Interface7_Impl2 method2206(int argument_391_, int[] argument_392_, int argument_393_, int argument_394_, boolean argument_395_, int argument_396_, int argument_397_);

    final void method2207(boolean argument_398_) {
        if (this.aClass221_4801 != DoublyLinkedNodeP2_Sub2_Sub4_Sub2.aClass221_6583) {
            Class221 class221 = this.aClass221_4801;
            this.aClass221_4801 = DoublyLinkedNodeP2_Sub2_Sub4_Sub2.aClass221_6583;
            if (class221.method3029(122))
                method2230(3);
            this.aFloatArray4755 = aFloatArray4743;
            anInt4785 &= ~0x1f;
        }
    }

    private final void method2208(int argument_399_) {
        if (argument_399_ != 15)
            aFloat4733 = -0.028265707F;
        if (!aBoolean4796) {
            float[] fs = aFloatArray4730;
            aBoolean4796 = true;
            if (this.viewportW != 0 && this.viewportH != 0) {
                fs[12] = -1.0F;
                fs[13] = 1.0F;
                fs[4] = 0.0F;
                fs[8] = 0.0F;
                fs[10] = 0.5F;
                fs[6] = 0.0F;
                fs[15] = 1.0F;
                fs[7] = 0.0F;
                fs[5] = -2.0F / (float) this.viewportH;
                fs[14] = 0.5F;
                fs[1] = 0.0F;
                fs[11] = 0.0F;
                fs[0] = 2.0F / (float) this.viewportW;
                fs[2] = 0.0F;
                fs[9] = 0.0F;
                fs[3] = 0.0F;
            } else {
                fs[5] = 1.0F;
                fs[1] = 0.0F;
                fs[4] = 0.0F;
                fs[10] = 1.0F;
                fs[15] = 1.0F;
                fs[13] = 0.0F;
                fs[6] = 0.0F;
                fs[3] = 0.0F;
                fs[12] = 0.0F;
                fs[14] = 0.0F;
                fs[0] = 1.0F;
                fs[9] = 0.0F;
                fs[7] = 0.0F;
                fs[2] = 0.0F;
                fs[8] = 0.0F;
                fs[11] = 0.0F;
            }
        }
    }

    final void getViewportSize(int[] argument_400_) {
        argument_400_[1] = this.viewportH;
        argument_400_[0] = this.viewportW;
    }

    abstract void loadViewport(byte argument_401_);

    abstract void applyAmbientLightModel(int argument_402_);

    private final void method2211(int argument_403_) {
        aFloatArray4732[14] = aFloat4790;
        aFloatArray4732[10] = aFloat4733;
        this.aFloat4746 = ((aFloatArray4732[14] - (float) this.farPlane) / aFloatArray4732[10]);
        if (argument_403_ != 12858)
            aFloatArray4743 = null;
    }

    final int r(int argument_404_, int argument_405_, int argument_406_, int argument_407_, int argument_408_, int argument_409_, int argument_410_) {
        int anLocalInt = 0;
        float f = ((this.aClass350_Sub2_4696.aFloat5448) * (float) argument_405_ + ((float) argument_404_ * this.aClass350_Sub2_4696.aFloat5445) + ((float) argument_406_ * this.aClass350_Sub2_4696.aFloat5444) + (this.aClass350_Sub2_4696.aFloat5443));
        float f_411_ = ((this.aClass350_Sub2_4696.aFloat5443) + (((float) argument_408_ * this.aClass350_Sub2_4696.aFloat5448) + ((float) argument_407_ * this.aClass350_Sub2_4696.aFloat5445) + ((float) argument_409_ * this.aClass350_Sub2_4696.aFloat5444)));
        if (!(f < (float) this.anInt4749) || !((float) this.anInt4749 > f_411_)) {
            if (f > (float) this.farPlane && f_411_ > (float) this.farPlane)
                anLocalInt |= 0x20;
        } else
            anLocalInt |= 0x10;
        int anLocalInt_412_ = (int) ((this.aClass350_Sub2_4696.v3 + ((this.aClass350_Sub2_4696.v2 * (float) argument_406_) + ((this.aClass350_Sub2_4696.v0) * (float) argument_404_ + (this.aClass350_Sub2_4696.v1) * (float) argument_405_))) * (float) this.anInt4750 / (float) argument_410_);
        int anLocalInt_413_ = (int) ((float) this.anInt4750 * (this.aClass350_Sub2_4696.v3 + (((float) argument_409_ * (this.aClass350_Sub2_4696.v2)) + (((float) argument_408_ * (this.aClass350_Sub2_4696.v1)) + (this.aClass350_Sub2_4696.v0) * (float) argument_407_))) / (float) argument_410_);
        if ((float) anLocalInt_412_ < this.aFloat4708 && (float) anLocalInt_413_ < this.aFloat4708)
            anLocalInt |= 0x1;
        else if ((float) anLocalInt_412_ > this.aFloat4718 && (this.aFloat4718 < (float) anLocalInt_413_))
            anLocalInt |= 0x2;
        int anLocalInt_414_ = (int) (((this.aClass350_Sub2_4696.v4 * (float) argument_404_) + (this.aClass350_Sub2_4696.v5 * (float) argument_405_) + ((float) argument_406_ * this.aClass350_Sub2_4696.v6) + this.aClass350_Sub2_4696.v7) * (float) this.anInt4794 / (float) argument_410_);
        int anLocalInt_415_ = (int) ((float) this.anInt4794 * (this.aClass350_Sub2_4696.v7 + ((this.aClass350_Sub2_4696.v4 * (float) argument_407_) + ((float) argument_408_ * (this.aClass350_Sub2_4696.v5)) + ((float) argument_409_ * (this.aClass350_Sub2_4696.v6)))) / (float) argument_410_);
        if (!((float) anLocalInt_414_ < this.aFloat4770) || !((float) anLocalInt_415_ < this.aFloat4770)) {
            if (this.aFloat4787 < (float) anLocalInt_414_ && (float) anLocalInt_415_ > this.aFloat4787)
                anLocalInt |= 0x8;
        } else
            anLocalInt |= 0x4;
        return anLocalInt;
    }

    final void method2212(byte argument_416_, boolean argument_417_) {
        if (argument_417_ == !this.aBoolean4715) {
            this.aBoolean4715 = argument_417_;
            applyDepthMaskToggle(0);
            anInt4785 &= ~0x1f;
        }
    }

    abstract void method2213(int argument_418_);

    private final void method2214(byte argument_419_) {
        method2213(108);
        int anLocalInt = -44 % ((14 - argument_419_) / 39);
        if (aClass2_4775 != null)
            aClass2_4775.method194(1);
    }

    final boolean method2038() {
        return true;
    }

    final void method2215(boolean argument_420_, int argument_421_, boolean argument_422_, byte argument_423_) {
        if (argument_421_ != anInt4777 || this.aBoolean4703 == !aBoolean4739) {
            Interface7_Impl2 interface7_impl2 = null;
            int anLocalInt = 0;
            byte anLocalInt_424_ = 0;
            int anLocalInt_425_ = 0;
            byte anLocalInt_426_ = this.aBoolean4703 ? (byte) 3 : (byte) 0;
            if (argument_421_ < 0)
                method2217((byte) -57);
            else {
                interface7_impl2 = aClass138_4766.method2463(false, argument_421_);
                TextureDescriptor textureDescriptor = this.textureSource.getDescriptor(argument_421_, true);
                if (textureDescriptor.aByte845 == 0 && textureDescriptor.aByte849 == 0)
                    method2217((byte) -57);
                else {
                    int anLocalInt_427_ = textureDescriptor.isHalfSize ? 64 : 128;
                    int anLocalInt_428_ = anLocalInt_427_ * 50;
                    Class350_Sub2 class350_sub2 = method2219((byte) -103);
                    class350_sub2.method3866(0.0F, ((float) (textureDescriptor.aByte845 * (this.anInt4757 % anLocalInt_428_)) / (float) anLocalInt_428_), ((float) (this.anInt4757 % anLocalInt_428_ * textureDescriptor.aByte849) / (float) anLocalInt_428_), (byte) -20);
                    method2171(30, Class95.aClass81_723);
                }
                anLocalInt = textureDescriptor.anInt835;
                if (!this.aBoolean4703) {
                    anLocalInt_424_ = textureDescriptor.aByte842;
                    anLocalInt_425_ = textureDescriptor.anInt847;
                    anLocalInt_426_ = textureDescriptor.aByte834;
                }
            }
            method2146(8, anLocalInt_424_, argument_420_, argument_422_, anLocalInt_425_, anLocalInt_426_);
            if (aClass2_4775 == null) {
                method2237(true, interface7_impl2);
                method2216((byte) -108, anLocalInt);
            } else
                aClass2_4775.method196(anLocalInt, (byte) 125, interface7_impl2);
            aBoolean4739 = this.aBoolean4703;
            anInt4777 = argument_421_;
        }
        anInt4785 &= ~0x7;
    }

    final void method2216(byte argument_429_, int argument_430_) {
        if (argument_430_ != 1) {
            if (argument_430_ == 0)
                method2228(CombineModeEnum.MODULATE, CombineModeEnum.MODULATE, -87);
            else if (argument_430_ != 2) {
                if (argument_430_ == 3)
                    method2228(CombineModeEnum.MODULATE, CombineModeEnum.ADD, -114);
                else if (argument_430_ == 4)
                    method2228(CombineModeEnum.SUBTRACT, CombineModeEnum.SUBTRACT, 86);
            } else
                method2228(CombineModeEnum.REPLACE, CombineModeEnum.INTERPOLATE, -81);
        } else
            method2228(CombineModeEnum.REPLACE, CombineModeEnum.REPLACE, -31);
    }

    final void method2217(byte argument_431_) {
        if (argument_431_ == -57) {
            if ((this.aClass81Array4744[this.activeTexUnit]) != Node_Sub7.aClass81_3915) {
                this.aClass81Array4744[this.activeTexUnit] = Node_Sub7.aClass81_3915;
                this.textureMatrix[this.activeTexUnit].method3840();
                method2186(argument_431_ + 58);
            }
        }
    }

    private final void method2218(byte argument_432_) {
        if (this.aClass221_4801 != Node_Sub31_Sub24.aClass221_5951) {
            Class221 class221 = this.aClass221_4801;
            this.aClass221_4801 = Node_Sub31_Sub24.aClass221_5951;
            if (!class221.method3029(81))
                method2230(3);
            method2184(11);
            this.aFloatArray4755 = aFloatArray4732;
            method2214((byte) -35);
            anInt4785 &= ~0x7;
        }
        if (argument_432_ < 2)
            method2138(-95);
    }

    final Class350_Sub2 method2219(byte argument_433_) {
        return (this.textureMatrix[this.activeTexUnit]);
    }

    final void T(int argument_434_, int argument_435_, int argument_436_, int argument_437_) {
        boolean anLocalBoolean = false;
        if (this.scissorX < argument_434_) {
            this.scissorX = argument_434_;
            anLocalBoolean = true;
        }
        if (argument_436_ < this.scissorRight) {
            anLocalBoolean = true;
            this.scissorRight = argument_436_;
        }
        if (argument_435_ > this.scissorBottom) {
            anLocalBoolean = true;
            this.scissorBottom = argument_435_;
        }
        if (argument_437_ < this.scissorY) {
            anLocalBoolean = true;
            this.scissorY = argument_437_;
        }
        if (anLocalBoolean) {
            if (!this.scissorEnabled) {
                this.scissorEnabled = true;
                applyScissorTestToggle(70);
            }
            loadScissor(-2);
            method2221(-1);
        }
    }

    abstract Interface7_Impl3 method2220(byte argument_438_, boolean argument_439_, int argument_440_, int[][] argument_441_);

    private final void method2221(int argument_442_) {
        if (argument_442_ == -1) {
            this.aFloat4708 = (float) (-this.anInt4737 + this.scissorX);
            this.aFloat4718 = (float) (this.scissorRight - this.anInt4737);
            this.aFloat4787 = (float) (this.scissorY - this.anInt4754);
            this.aFloat4770 = (float) (-this.anInt4754 + this.scissorBottom);
        }
    }

    final Skybox createSkybox(int argument_443_, int argument_444_, int argument_445_, int argument_446_, int argument_447_, int argument_448_) {
        return new Skybox_Sub2_Sub1(this, argument_443_, argument_444_, argument_445_, argument_446_, argument_447_, argument_448_);
    }

    final void method2222(int argument_449_) {
        this.aBoolean4694 = false;
        method2240();
    }

    abstract void applyActiveTextureRgbCombineMode(int argument_450_);

    final void method2224(int argument_451_, GlMultiTexSourceEnum argument_452_, int argument_453_) {
        setMultiTexAlphaSource(argument_451_, argument_452_, false, true);
    }

    final void setClip(int argument_454_, int argument_457_, int argument_456_, int argument_455_) {
        if (argument_454_ <= 0 && argument_456_ >= this.viewportW - 1 && argument_455_ <= 0 && this.viewportH - 1 <= argument_457_)
            clearClip();
        else {
            this.scissorRight = (this.viewportW < argument_456_ ? 0 : argument_456_);
            this.scissorY = (argument_457_ <= this.viewportW ? argument_457_ : 0);
            this.scissorBottom = argument_455_ >= 0 ? argument_455_ : 0;
            this.scissorX = argument_454_ < 0 ? 0 : argument_454_;
            if (!this.scissorEnabled) {
                this.scissorEnabled = true;
                applyScissorTestToggle(120);
            }
            loadScissor(-2);
            method2221(-1);
        }
    }

    private final void method2225(int argument_458_) {
        aBoolean4740 = false;
        method2202(true);
        if (this.aClass221_4801 == Node_Sub31_Sub21.aClass221_5931)
            method2214((byte) 76);
        if (argument_458_ != -14326)
            loadScissor(115);
    }

    final Class167 method2057(Class101 argument_459_, int argument_460_, int argument_461_, int argument_462_, int argument_463_) {
        return new Class167_Sub2(this, argument_459_, argument_460_, argument_462_, argument_463_, argument_461_);
    }

    final void method2226(int argument_464_) {
        if (anInt4785 != 16) {
            method2117(-83);
            method2243(argument_464_ ^ 0x2088bf7c, true);
            method2189(1, true);
            method2212((byte) -62, true);
            method2147(0, 1);
            anInt4785 = 16;
        }
        if (argument_464_ != -1)
            XA();
    }

    private final void method2227(int argument_465_) {
        if (argument_465_ == -16826) {
            aBoolean4796 = false;
            if (this.aClass221_4801 == Class350_Sub1.aClass221_5431) {
                method2208(argument_465_ + 16841);
                method2214((byte) -31);
            }
        }
    }

    final void method2228(CombineModeEnum argument_466_, CombineModeEnum argument_467_, int argument_468_) {
        boolean anLocalBoolean = false;
        if (argument_467_ != (this.rgbCombinationModes[this.activeTexUnit])) {
            this.rgbCombinationModes[(this.activeTexUnit)] = argument_467_;
            anLocalBoolean = true;
            applyActiveTextureRgbCombineMode(13608);
        }
        if (argument_466_ != (this.alphaCombinationModes[this.activeTexUnit])) {
            this.alphaCombinationModes[(this.activeTexUnit)] = argument_466_;
            applyActiveTextureAlphaCombineMode(7);
            anLocalBoolean = true;
        }
        if (anLocalBoolean)
            anInt4785 &= ~0x1d;
    }

    final void method2229(byte argument_469_, GlMultiTexSourceEnum argument_470_, int argument_471_) {
        setMultiTexRgbSource(argument_471_, false, false, argument_470_, (byte) -67);
    }

    private final void method2230(int argument_472_) {
        aBoolean4792 = false;
        if (aClass2_4775 != null)
            aClass2_4775.method184((byte) 117);
        if (argument_472_ != 3)
            this.aClass222_4821 = null;
        method2148(24);
    }

    abstract void applyLightingToggle(boolean argument_473_);

    final int JA(int argument_474_, int argument_475_, int argument_476_, int argument_477_, int argument_478_, int argument_479_) {
        int anLocalInt = 0;
        float f = ((this.aClass350_Sub2_4696.aFloat5443) + (((float) argument_476_ * this.aClass350_Sub2_4696.aFloat5444) + ((this.aClass350_Sub2_4696.aFloat5448 * (float) argument_475_) + ((float) argument_474_ * (this.aClass350_Sub2_4696.aFloat5445)))));
        if (f < 1.0F)
            f = 1.0F;
        float f_480_ = ((this.aClass350_Sub2_4696.aFloat5443) + ((this.aClass350_Sub2_4696.aFloat5444) * (float) argument_479_ + ((this.aClass350_Sub2_4696.aFloat5445 * (float) argument_477_) + (this.aClass350_Sub2_4696.aFloat5448 * (float) argument_478_))));
        if (f_480_ < 1.0F)
            f_480_ = 1.0F;
        if (f < (float) this.anInt4749 && (float) this.anInt4749 > f_480_)
            anLocalInt |= 0x10;
        else if ((float) this.farPlane < f && (float) this.farPlane < f_480_)
            anLocalInt |= 0x20;
        int anLocalInt_481_ = (int) ((this.aClass350_Sub2_4696.v3 + (((float) argument_476_ * (this.aClass350_Sub2_4696.v2)) + (((float) argument_474_ * (this.aClass350_Sub2_4696.v0)) + ((float) argument_475_ * (this.aClass350_Sub2_4696.v1))))) * (float) this.anInt4750 / f);
        int anLocalInt_482_ = (int) ((float) this.anInt4750 * (((float) argument_479_ * this.aClass350_Sub2_4696.v2) + (((float) argument_478_ * (this.aClass350_Sub2_4696.v1)) + ((float) argument_477_ * (this.aClass350_Sub2_4696.v0))) + this.aClass350_Sub2_4696.v3) / f_480_);
        if ((float) anLocalInt_481_ < this.aFloat4708 && this.aFloat4708 > (float) anLocalInt_482_)
            anLocalInt |= 0x1;
        else if (this.aFloat4718 < (float) anLocalInt_481_ && ((float) anLocalInt_482_ > this.aFloat4718))
            anLocalInt |= 0x2;
        int anLocalInt_483_ = (int) ((float) this.anInt4794 * (this.aClass350_Sub2_4696.v7 + ((this.aClass350_Sub2_4696.v5 * (float) argument_475_) + (this.aClass350_Sub2_4696.v4) * (float) argument_474_ + (this.aClass350_Sub2_4696.v6) * (float) argument_476_)) / f);
        int anLocalInt_484_ = (int) ((float) this.anInt4794 * (this.aClass350_Sub2_4696.v7 + (((float) argument_477_ * (this.aClass350_Sub2_4696.v4)) + (this.aClass350_Sub2_4696.v5) * (float) argument_478_ + ((float) argument_479_ * (this.aClass350_Sub2_4696.v6)))) / f_480_);
        if ((float) anLocalInt_483_ < this.aFloat4770 && this.aFloat4770 > (float) anLocalInt_484_)
            anLocalInt |= 0x4;
        else if (this.aFloat4787 < (float) anLocalInt_483_ && ((float) anLocalInt_484_ > this.aFloat4787))
            anLocalInt |= 0x8;
        return anLocalInt;
    }

    private final void _applyFog(int argument_485_) {
        if (aClass2_4775 != null)
            aClass2_4775.method190((byte) -127);
        applyFog((byte) 58);
    }

    final void C(boolean argument_486_) {
        this.aBoolean4786 = argument_486_;
        applyDepthMaskToggle(0);
    }

    final boolean method2034() {
        return false;
    }

    final void method2068(int argument_487_, int argument_488_, int argument_489_, int argument_490_, int argument_491_, int argument_492_, Class_aa argument_493_, int argument_494_, int argument_495_, int argument_496_, int argument_497_, int argument_498_) {
        /* empty */
    }

    void method2023() {
        if (!aBoolean4742) {
            for (Node node = aCyclicLinkedList_4672.getFirst(); node != null; node = aCyclicLinkedList_4672.getNext())
                ((dba_sub_772_Sub2) node).method1314(-28982);
            Enumeration enumeration = aHashtable4690.keys();
            while (enumeration.hasMoreElements()) {
                Canvas canvas = (Canvas) enumeration.nextElement();
                method2137(114, canvas, aHashtable4690.get(canvas));
            }
            Class112.method2009(true, -11692, false);
            this.aNativeInterface4675.release();
            aBoolean4742 = true;
        }
    }

    final Interface7_Impl2 method2233(byte argument_499_, int argument_500_, int argument_501_, boolean argument_502_, int[] argument_503_) {
        return method2206(0, argument_503_, argument_500_, 0, argument_502_, argument_501_, 9567);
    }

    abstract void method2234(int argument_504_, int argument_505_);

    final Class368 method2094(int argument_506_, int argument_507_, int argument_508_, int argument_509_, boolean argument_510_) {
        Class368_Sub1 class368_sub1 = new Class368_Sub1(this, argument_508_, argument_509_, argument_510_);
        class368_sub1.method4013(0, 0, argument_508_, argument_509_, argument_506_, argument_507_);
        return class368_sub1;
    }

    final void method2017(int argument_511_) {
        /* empty */
    }

    final void method2235(int argument_512_) {
        Hashtable hashtable = new Hashtable();
        if (aHashtable4690 != null && !aHashtable4690.isEmpty()) {
            Enumeration enumeration = aHashtable4690.keys();
            while (enumeration.hasMoreElements()) {
                Canvas canvas = (Canvas) enumeration.nextElement();
                hashtable.put(canvas, method2245((byte) 86, canvas));
            }
        }
        aHashtable4690 = hashtable;
        method2162(0);
        method2203(12);
        int anLocalInt = 115 % ((-32 - argument_512_) / 40);
        method2181(256);
        aClass230_4723.method3075(this, -1403085716);
    }

    final int M() {
        return anInt4824;
    }

    final Interface7_Impl3 method2236() {
        if (aClass67_Sub2_4736 == null)
            return null;
        return aClass67_Sub2_4736.method1513(22113);
    }

    final void method2237(boolean argument_513_, Interface7 argument_514_) {
        if (argument_514_ != anInterface7Array4771[this.activeTexUnit]) {
            anInterface7Array4771[this.activeTexUnit] = argument_514_;
            if (argument_514_ == null)
                unbindActiveTexture((byte) -87);
            else
                argument_514_.method34(20464);
            anInt4785 &= ~0x1;
        }
    }

    final void method2069(Class350 argument_515_) {
        this.aClass350_Sub2_4696 = (Class350_Sub2) argument_515_;
        this.aClass350_Sub2_4698.method3838(this.aClass350_Sub2_4696);
        this.aClass350_Sub2_4698.method3862(31433);
        aClass350_Sub2_4699.method3847(16383, this.aClass350_Sub2_4698);
        this.aClass350_Sub2_4697.method3847(16383, this.aClass350_Sub2_4696);
        if (this.aClass221_4801.method3029(70))
            method2230(3);
    }

    abstract void method2238(int argument_516_, boolean argument_517_);

    final int method2239() {
        return anInt4748;
    }

    final Class350 method2015() {
        return aClass350_Sub2_4820;
    }

    private final void method2240() {
        if (Class350_Sub1.aClass221_5431 == this.aClass221_4801) {
            float f = method2165(-85);
            this.aClass350_Sub2_4695.method3864(18645, 0.0F, f, f);
        }
        aBoolean4792 = false;
        method2244(11);
        if (aClass2_4775 != null)
            aClass2_4775.method192(88);
    }

    private final void method2241(int argument_519_) {
        this.aFloat4747 = (float) this.farPlane;
        if (argument_519_ > -48)
            this.fogDistance = 63;
    }

    abstract Interface7_Impl2 method2242(int argument_520_, int argument_521_, DataType argument_522_, Class320 argument_523_, int argument_524_);

    final boolean method2039() {
        return this.hasMultiSample;
    }

    final void DA(int argument_525_, int argument_526_, int argument_527_, int argument_528_) {
        this.anInt4750 = argument_527_;
        this.anInt4754 = argument_526_;
        this.anInt4737 = argument_525_;
        this.anInt4794 = argument_528_;
        method2225(-14326);
        method2141(16202);
        method2207(true);
        method2221(-1);
    }

    final int andPow(int argument_529_, int argument_530_) {
        return argument_530_ & argument_529_ ^ argument_530_;
    }

    final void method2243(int argument_531_, boolean argument_532_) {
        if (!argument_532_ == this.aBoolean4728) {
            this.aBoolean4728 = argument_532_;
            method2178((byte) 82);
            anInt4785 &= ~0x1f;
        }
    }

    final Class_aa method2066(int argument_533_, int argument_534_, int[] argument_535_, int[] argument_536_) {
        return Class245_Sub1_Sub1.method3183(argument_536_, argument_535_, this, argument_534_, argument_533_, -106);
    }

    final void clearClip() {
        this.scissorX = 0;
        this.scissorY = this.viewportH;
        this.scissorRight = this.viewportW;
        this.scissorBottom = 0;
        if (this.scissorEnabled) {
            this.scissorEnabled = false;
            applyScissorTestToggle(78);
        }
        method2221(-1);
    }

    abstract void method2244(int argument_537_);

    abstract Object method2245(byte argument_538_, Canvas argument_539_);

    final void f(int argument_540_, int argument_541_) {
        if (argument_540_ != this.anInt4749 || argument_541_ != this.farPlane) {
            this.anInt4749 = argument_540_;
            this.farPlane = argument_541_;
            method2141(16202);
            method2225(-14326);
            _applyFog(4);
        }
    }

    final void assignThread(int argument_542_) {
        /* empty */
    }

    final void A(int argument_543_, Class_aa argument_544_, int argument_545_, int argument_546_) {
        Class_aa_Sub2 class_aa_sub2 = (Class_aa_Sub2) argument_544_;
        Interface7_Impl2 interface7_impl2 = class_aa_sub2.anInterface7_Impl2_3751;
        method2183(4);
        method2237(true, interface7_impl2);
        method2147(0, 1);
        method2228(CombineModeEnum.REPLACE, CombineModeEnum.REPLACE, -128);
        method2229((byte) 122, GlMultiTexSourceEnum.CONSTANT, 0);
        method2246(argument_543_, 1);
        this.aClass350_Sub2_4695.method3853((byte) 64, (float) this.viewportW, 0.0F, (float) this.viewportH);
        method2222(11570);
        this.textureMatrix[0].method3853((byte) 117, interface7_impl2.method18(-18982, (float) this.viewportW), 1.0F, interface7_impl2.method22(122, (float) this.viewportH));
        this.textureMatrix[0].method3864(18645, 0.0F, interface7_impl2.method22(127, (float) -argument_546_), interface7_impl2.method18(-18982, (float) -argument_545_));
        this.aClass81Array4744[0] = Class95.aClass81_723;
        method2186(1);
        method2188(-27539);
        method2217((byte) -57);
        method2229((byte) -55, GlMultiTexSourceEnum.TEXTURE, 0);
    }

    final void method2246(int argument_547_, int argument_548_) {
        if (this.anInt4762 != argument_547_) {
            this.anInt4762 = argument_547_;
            setTexEnvColour(0);
        }
    }

    Class2 method2247(int argument_549_, int argument_550_) {
        if (argument_550_ != 2)
            this.aBoolean4728 = true;
        int anLocalInt = argument_549_;
        while_120_:
        do {
            while_119_:
            do {
                do {
                    if (anLocalInt != 6) {
                        if (anLocalInt != 1) {
                            if (anLocalInt != 2) {
                                if (anLocalInt != 7)
                                    break while_120_;
                            } else
                                break;
                            break while_119_;
                        }
                    } else
                        return new Class2_Sub5(this);
                    return new Class2_Sub6(this);
                } while (false);
                return new Class2_Sub8(this, this.aClass191_4677);
            } while (false);
            return new Class2_Sub11(this);
        } while (false);
        return new Class2_Sub1(this);
    }

    final boolean method2064() {
        return false;
    }

    final void setLights(int lightCount, HardwareLight[] lights) {
        for (int lightId = 0; lightId < lightCount; lightId++)
            this.activeLights[lightId] = lights[lightId];
        this.activeLightCount = lightCount;
        if (this.aClass221_4801.method3029(84))
            loadLights(true);
    }

    abstract Interface4_Impl2 method2248(int argument_553_, boolean argument_554_);

    final void method2071() {
        if (aClass138_4766 != null)
            aClass138_4766.method2465(true);
    }

    final Class368 method2055(int argument_555_, int argument_556_, boolean argument_557_) {
        return new Class368_Sub1(this, argument_555_, argument_556_, argument_557_);
    }

    final void setFog(int rgb, int thinkness, int distance) {
        if (rgb != this.fogColour || this.fogThickness != thinkness || this.fogDistance != distance) {
            this.fogDistance = distance;
            this.fogColour = rgb;
            this.fogThickness = thinkness;
            _applyFog(4);
            method2178((byte) 82);
        }
    }

    private final void method2249(int argument_561_) {
        applyAmbientLightModel(1);
        applySunLightColours((byte) -57);
        applyLightingToggle(false);
        loadLights(true);
        applySunLightPosition(-101);
        enableSun(argument_561_ ^ argument_561_);
        method2122(4);
        method2177(true);
        applyDepthMaskToggle(0);
        method2178((byte) 82);
        applyFog((byte) 58);
        method2139(argument_561_ ^ 0x1);
        method2175((byte) -111);
        applyAlphaTestToggle(125);
        for (int anLocalInt = this.maxTextureUnits - 1; anLocalInt >= 0; anLocalInt--) {
            setActiveTexture(anLocalInt);
            applyActiveTextureRgbCombineMode(13608);
            applyActiveTextureAlphaCombineMode(7);
            method2217((byte) -57);
        }
        setTexEnvColour(argument_561_ ^ 0x1);
        loadViewport((byte) -30);
        method2213(argument_561_ ^ 0x74);
        method2244(argument_561_ + 10);
        method2148(24);
    }

    public static void method2250() {
        aClass148ArrayArrayArray4676 = null;
        aClass207_4684 = null;
    }

    final int[] Y() {
        return new int[]{this.anInt4737, this.anInt4754, this.anInt4750, this.anInt4794};
    }
}
