/* Class59_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

final class Node_Sub20 extends Node
{
    private Stream aStream4013;
    private GlInterleavedArray aGlInterleavedArray_4014;
    int anInt4015;
    static Class166 aClass166_4016 = new Class166(77, 28);
    int anInt4017;
    int anInt4018;
    int anInt4019;
    private GlToolkit aClass_ha_Sub3_4020;
    private NativeHeapBuffer aNativeHeapBuffer_4021;
    private GlElementArray aClass12_Sub2_4022;
    private Class_s_Sub2 aClass_s_Sub2_4023;
    float aFloat4024;
    private int[] anIntArray4025;
    static int anInt4026;
    
    static final boolean method717(int argument, int argument_0_,
				   int argument_1_) {
	return (Class233.method3098(argument, 9209, argument_0_)
		& Class90.method1680(argument, argument_0_, 2048));
    }
    
    static final void method718(int argument,
				Entity argument_2_) {
	int anLocalInt = (-Class333.anInt2720
			  + ((Entity) argument_2_).anInt6762);
	int anLocalInt_3_
	    = (((Entity) argument_2_).anInt6746 * 512
	       + argument_2_.method1830(-126) * 256);
	int anLocalInt_4_
	    = (((Entity) argument_2_).anInt6766 * 512
	       + argument_2_.method1830(-126) * 256);
	((DoublyLinkedNodeP2_Sub2) argument_2_).worldX
	    += ((anLocalInt_3_ - ((DoublyLinkedNodeP2_Sub2) argument_2_).worldX)
		/ anLocalInt);
	((Entity) argument_2_).anInt6796 = 0;
	((DoublyLinkedNodeP2_Sub2) argument_2_).worldZ
	    += ((-((DoublyLinkedNodeP2_Sub2) argument_2_).worldZ + anLocalInt_4_)
		/ anLocalInt);
	if (((Entity) argument_2_).anInt6756 == 0)
	    argument_2_.method1824(8192, (byte) 78);
	if (((Entity) argument_2_).anInt6756 == 1)
	    argument_2_.method1824(12288, (byte) 123);
	if (((Entity) argument_2_).anInt6756 == 2)
	    argument_2_.method1824(0, (byte) 89);
	if (((Entity) argument_2_).anInt6756 == 3)
	    argument_2_.method1824(4096, (byte) 104);
    }
    
    static final boolean method719
	(int argument, int argument_5_, byte[] argument_6_, byte argument_7_,
	 int argument_8_, int argument_9_, int argument_10_) {
	int anLocalInt = argument_10_ % argument_8_;
	int anLocalInt_11_;
	if (anLocalInt != 0)
	    anLocalInt_11_ = -anLocalInt + argument_8_;
	else
	    anLocalInt_11_ = 0;
	int anLocalInt_12_ = -((argument_8_ - 1 + argument) / argument_8_);
	int anLocalInt_13_ = -((argument_10_ + argument_8_ - 1) / argument_8_);
	for (int anLocalInt_14_ = anLocalInt_12_; anLocalInt_14_ < 0;
	     anLocalInt_14_++) {
	    for (int anLocalInt_15_ = anLocalInt_13_; anLocalInt_15_ < 0;
		 anLocalInt_15_++) {
		if (argument_6_[argument_9_] == 0)
		    return true;
		argument_9_ += argument_8_;
	    }
	    argument_9_ -= anLocalInt_11_;
	    if (argument_6_[argument_9_ - 1] == 0)
		return true;
	    argument_9_ += argument_5_;
	}
	return false;
    }

    static final void method721(int argument, String[] argument_27_) {
	if (argument_27_.length > 1) {
	    for (int anLocalInt = 0; anLocalInt < argument_27_.length;
		 anLocalInt++) {
		if (argument_27_[anLocalInt].startsWith("pause")) {
		    int anLocalInt_28_ = 5;
		    try {
			anLocalInt_28_
			    = Integer.parseInt(argument_27_[anLocalInt]
						   .substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Statics.method2425((byte) -117, ("Pausing for " + anLocalInt_28_ + " seconds..."));
		    Class114.aStringArray945 = argument_27_;
		    Statics.anInt1807 = anLocalInt + 1;
		    Statics.aLong3225 = ((long) (anLocalInt_28_ * 1000)
					  + Applet_Sub1.getGameTime());
		    break;
		}
		Class85.aString605 = argument_27_[anLocalInt];
		Class261.method3320(false, -18422);
	    }
	} else {
	    Class85.aString605 += (String) argument_27_[0];
	    Class205.anInt1471 += argument_27_[0].length();
	}
    }
    
    final void method722(int[] argument_29_, int argument_30_,
			 byte argument_31_) {
	int anLocalInt = 0;
	FloatPacket class59_sub28_sub2
	    = ((GlToolkit) aClass_ha_Sub3_4020).aClass59_Sub28_Sub2_4957;
	((Packet) class59_sub28_sub2).pos = 0;
	if (((GlToolkit) aClass_ha_Sub3_4020).isBigEndian) {
	    for (int anLocalInt_32_ = 0; argument_30_ > anLocalInt_32_;
		 anLocalInt_32_++) {
		int anLocalInt_33_ = argument_29_[anLocalInt_32_];
		short[] anLocalInts = (((Class_s_Sub2) aClass_s_Sub2_4023)
				       .aShortArrayArray5351[anLocalInt_33_]);
		int anLocalInt_34_ = anIntArray4025[anLocalInt_33_];
		if (anLocalInt_34_ != 0 && anLocalInts != null) {
		    int anLocalInt_35_ = 0;
		    int anLocalInt_36_ = 0;
		    while (anLocalInts.length > anLocalInt_36_) {
			if ((1 << anLocalInt_35_++ & anLocalInt_34_) == 0)
			    anLocalInt_36_ += 3;
			else {
			    class59_sub28_sub2.p2(
                        ((anLocalInts
                                [anLocalInt_36_++])
                                & 0xffff));
			    anLocalInt++;
			    anLocalInt++;
			    class59_sub28_sub2.p2(
                        ((anLocalInts
                                [anLocalInt_36_++])
                                & 0xffff));
			    anLocalInt++;
			    class59_sub28_sub2.p2(
                        ((anLocalInts
                                [anLocalInt_36_++])
                                & 0xffff));
			}
		    }
		}
	    }
	} else {
	    for (int anLocalInt_37_ = 0; anLocalInt_37_ < argument_30_;
		 anLocalInt_37_++) {
		int anLocalInt_38_ = argument_29_[anLocalInt_37_];
		short[] anLocalInts = (((Class_s_Sub2) aClass_s_Sub2_4023)
				       .aShortArrayArray5351[anLocalInt_38_]);
		int anLocalInt_39_ = anIntArray4025[anLocalInt_38_];
		if (anLocalInt_39_ != 0 && anLocalInts != null) {
		    int anLocalInt_40_ = 0;
		    int anLocalInt_41_ = 0;
		    while (anLocalInts.length > anLocalInt_41_) {
			if ((1 << anLocalInt_40_++ & anLocalInt_39_) == 0)
			    anLocalInt_41_ += 3;
			else {
			    anLocalInt++;
			    class59_sub28_sub2.p2i(
                        ((anLocalInts
                                [anLocalInt_41_++])
                                & 0xffff));
			    anLocalInt++;
			    class59_sub28_sub2.p2i(
                        ((anLocalInts
                                [anLocalInt_41_++])
                                & 0xffff));
			    class59_sub28_sub2.p2i(
                        ((anLocalInts
                                [anLocalInt_41_++])
                                & 0xffff));
			    anLocalInt++;
			}
		    }
		}
	    }
	}
	if (anLocalInt > 0) {
	    aClass12_Sub2_4022.setData((((Packet) class59_sub28_sub2).pos), 5123, (((Packet) class59_sub28_sub2).data));
	    aClass_ha_Sub3_4020.bindArrays(((Class_s_Sub2) aClass_s_Sub2_4023).aGlInterleavedArray_5373, aGlInterleavedArray_4014, ((Class_s_Sub2) aClass_s_Sub2_4023).aGlInterleavedArray_5378, ((Class_s_Sub2) aClass_s_Sub2_4023).aGlInterleavedArray_5379);
	    aClass_ha_Sub3_4020.method2273
		((((Class_s_Sub2) aClass_s_Sub2_4023).anInt5371 & 0x8) != 0, (((Class_s_Sub2) aClass_s_Sub2_4023).anInt5371 & 0x7) != 0,
		 ((Node_Sub20) this).anInt4019);
	    if (((GlToolkit) aClass_ha_Sub3_4020).aBoolean4901)
		aClass_ha_Sub3_4020.EA(2147483647,
				       ((Node_Sub20) this).anInt4017,
				       ((Node_Sub20) this).anInt4015,
				       ((Node_Sub20) this).anInt4018);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPushMatrix();
	    OpenGL.glScalef(1.0F / ((Node_Sub20) this).aFloat4024,
			    1.0F / ((Node_Sub20) this).aFloat4024, 1.0F);
	    OpenGL.glMatrixMode(5888);
	    aClass_ha_Sub3_4020.bindArrays(((Class_s_Sub2) aClass_s_Sub2_4023).aGlInterleavedArray_5373, aGlInterleavedArray_4014, ((Class_s_Sub2) aClass_s_Sub2_4023).aGlInterleavedArray_5378, ((Class_s_Sub2) aClass_s_Sub2_4023).aGlInterleavedArray_5379);
	    aClass_ha_Sub3_4020.drawElements(aClass12_Sub2_4022, anLocalInt, 4, 0);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	}
    }
    
    final void method723(int argument_42_, int argument_43_, int argument_44_,
			 int argument_45_) {
	anIntArray4025[argument_43_ + (((Class_s) aClass_s_Sub2_4023).anInt2550
				       * argument_44_)]
	    = MathStatics.OR((anIntArray4025[(argument_43_ + (((Class_s) aClass_s_Sub2_4023).anInt2550) * argument_44_)]), 1 << argument_42_);
    }
    
    final void method724(int argument_46_, byte argument_47_) {
	aStream4013.method4165(argument_46_ * 4 + 3);
	aStream4013.writeByte(-1);
    }
    
    public static void method725(boolean argument) {
	aClass166_4016 = null;
    }
    
    final void method726(int argument_48_, int argument_49_, int argument_50_,
			 int argument_51_, float argument_52_) {
	if ((((Node_Sub20) this).anInt4019 ^ 0xffffffff) != argument_50_) {
	    TextureDescriptor textureDescriptor
		= ((GraphicsToolkit) aClass_ha_Sub3_4020).textureSource
		      .getDescriptor(((Node_Sub20) this).anInt4019, true);
	    int anLocalInt = ((TextureDescriptor) textureDescriptor).aByte840 & 0xff;
	    if (anLocalInt != 0 && ((TextureDescriptor) textureDescriptor).aByte834 != 4) {
		int anLocalInt_53_;
		if (argument_48_ >= 0) {
		    if (argument_48_ <= 127)
			anLocalInt_53_ = argument_48_ * 131586;
		    else
			anLocalInt_53_ = 16777215;
		} else
		    anLocalInt_53_ = 0;
		if (anLocalInt != 256) {
		    int anLocalInt_54_ = anLocalInt;
		    int anLocalInt_55_ = -anLocalInt + 256;
		    argument_51_
			= (((anLocalInt_54_ * (anLocalInt_53_ & 0xff00ff)
			     + anLocalInt_55_ * (argument_51_ & 0xff00ff))
			    & ~0xff00ff)
			   + (((argument_51_ & 0xff00) * anLocalInt_55_
			       + anLocalInt_54_ * (anLocalInt_53_ & 0xff00))
			      & 0xff0000)) >> 8;
		} else
		    argument_51_ = anLocalInt_53_;
	    }
	    int anLocalInt_56_ = ((TextureDescriptor) textureDescriptor).aByte828 & 0xff;
	    if (anLocalInt_56_ != 0) {
		anLocalInt_56_ += 256;
		int anLocalInt_57_
		    = anLocalInt_56_ * ((argument_51_ & 0xff0000) >> 16);
		if (anLocalInt_57_ > 65535)
		    anLocalInt_57_ = 65535;
		int anLocalInt_58_
		    = ((argument_51_ & 0xff00) >> 8) * anLocalInt_56_;
		if (anLocalInt_58_ > 65535)
		    anLocalInt_58_ = 65535;
		int anLocalInt_59_ = anLocalInt_56_ * (argument_51_ & 0xff);
		if (anLocalInt_59_ > 65535)
		    anLocalInt_59_ = 65535;
		argument_51_
		    = ((anLocalInt_57_ << 8 & 0xff0019)
		       + (anLocalInt_58_ & 0xff00) + (anLocalInt_59_ >> 8));
	    }
	}
	aStream4013.method4165(argument_49_ * 4);
	if (argument_52_ != 1.0F) {
	    int anLocalInt = (argument_51_ & 0xff505a) >> 16;
	    int anLocalInt_60_ = (argument_51_ & 0xff23) >> 8;
	    int anLocalInt_61_ = argument_51_ & 0xff;
	    anLocalInt *= argument_52_;
	    anLocalInt_60_ *= argument_52_;
	    if (anLocalInt >= 0) {
		if (anLocalInt > 255)
		    anLocalInt = 255;
	    } else
		anLocalInt = 0;
	    if (anLocalInt_60_ >= 0) {
		if (anLocalInt_60_ > 255)
		    anLocalInt_60_ = 255;
	    } else
		anLocalInt_60_ = 0;
	    anLocalInt_61_ *= argument_52_;
	    if (anLocalInt_61_ >= 0) {
		if (anLocalInt_61_ > 255)
		    anLocalInt_61_ = 255;
	    } else
		anLocalInt_61_ = 0;
	    argument_51_
		= anLocalInt_61_ | (anLocalInt_60_ << 8 | anLocalInt << 16);
	}
	aStream4013.writeByte((byte) (argument_51_ >> 16));
	aStream4013.writeByte((byte) (argument_51_ >> 8));
	aStream4013.writeByte((byte) argument_51_);
    }
    
    final void method727(int argument_62_, int argument_63_) {
	aNativeHeapBuffer_4021 = ((GlToolkit) aClass_ha_Sub3_4020)
			     .heap
			     .safeAllocateBuffer(argument_62_ * 4, true);
	aStream4013 = new Stream(aNativeHeapBuffer_4021);
    }
    
    final void method728(int argument_64_, int argument_65_) {
	aStream4013.upload();
	GlArrayBuffer glArrayBuffer
	    = aClass_ha_Sub3_4020.method2349(aNativeHeapBuffer_4021, false,
					     argument_64_ * argument_65_,
					     argument_64_ ^ 0x3, 4);
	aGlInterleavedArray_4014 = new GlInterleavedArray(glArrayBuffer, 5121, 4, 0);
	aStream4013 = null;
	aNativeHeapBuffer_4021 = null;
    }
    
    Node_Sub20(Class_s_Sub2 argument_66_, int argument_67_,
               int argument_68_, int argument_69_, int argument_70_,
               int argument_71_) {
	aClass_s_Sub2_4023 = argument_66_;
	anIntArray4025 = new int[(((Class_s) aClass_s_Sub2_4023).anInt2549
				  * ((Class_s) aClass_s_Sub2_4023).anInt2550)];
	((Node_Sub20) this).anInt4015 = argument_70_;
	((Node_Sub20) this).anInt4019 = argument_67_;
	((Node_Sub20) this).anInt4018 = argument_71_;
	((Node_Sub20) this).anInt4017 = argument_69_;
	((Node_Sub20) this).aFloat4024 = (float) argument_68_;
	aClass_ha_Sub3_4020
	    = ((Class_s_Sub2) aClass_s_Sub2_4023).aClass_ha_Sub3_5370;
	aClass12_Sub2_4022
	    = new GlElementArray(aClass_ha_Sub3_4020, 5123, null, 1);
    }
}
