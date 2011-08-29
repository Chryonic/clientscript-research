/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class90
{
    static long aLong680;
    static int anInt681 = 0;
    private float[] aFloatArray682 = new float[16];
    static int anInt683;
    private FloatPacket aClass59_Sub28_Sub2_684
	= new FloatPacket(786336);
    private GlInterleavedArray aGlInterleavedArray_685;
    private GlArrayBuffer anGlArrayBuffer_686;
    private GlInterleavedArray aGlInterleavedArray_687;
    private int anInt688 = DoublyLinkedNode_Sub51_Sub13.method1258(9761, 1600);
    static int anInt689;
    private GlInterleavedArray aGlInterleavedArray_690;
    private DoublyLinkedNodeP2_Sub4_Sub1[][] aClass104_Sub4_Sub1ArrayArray691;
    private int anInt692;
    private int[] anIntArray693 = new int[1600];
    private int[] anIntArray694 = new int[64];
    private DoublyLinkedNodeP2_Sub4_Sub1[][] aClass104_Sub4_Sub1ArrayArray695;
    private int[] anIntArray696;
    
    private final void method1674(int argument_0_, GlToolkit argument_1_,
				  int argument_2_) {
	Statics.aFloat6341
	    = ((GlToolkit) argument_1_).modelIntensity;
	argument_1_.method2306((float) argument_2_);
	argument_1_.method2343();
	OpenGL.glDisable(16384);
	OpenGL.glDisable(16385);
	if (argument_0_ != -28486)
	    anInt681 = 24;
	argument_1_.method2276(false);
	OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    private final void method1675(GlToolkit argument_3_,
				  byte argument_4_) {
	argument_3_.method2276(true);
	int anLocalInt = 120 / ((argument_4_ + 25) / 52);
	OpenGL.glEnable(16384);
	OpenGL.glEnable(16385);
	if (Statics.aFloat6341
	    != ((GlToolkit) argument_3_).modelIntensity)
	    argument_3_.setAmbientIntensity(Statics.aFloat6341);
    }
    
    static final void method1676
	(int argument, int argument_5_, int argument_6_, int argument_7_,
	 byte[][][] argument_8_, int[] argument_9_, int[] argument_10_,
	 int[] argument_11_, int[] argument_12_, int[] argument_13_,
	 int argument_14_, byte argument_15_, int argument_16_,
	 int argument_17_, boolean argument_18_, boolean argument_19_,
	 int argument_20_, int argument_21_, boolean argument_22_) {
	Class384.aBoolean3255 = true;
	Class128.aBoolean1039
	    = DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.method2016() > 0;
	Node_Sub31_Sub16.aBoolean5911 = argument_19_;
	Class189_Sub2.anInt5642 = argument_5_ >> LightingManager.lightCoordRShift;
	Class311.anInt2592 = argument_7_ >> LightingManager.lightCoordRShift;
	Class320.anInt2635 = argument_5_;
	Class277.anInt2220 = argument_7_;
	Class252.anInt1977 = argument_6_;
	Class243.anInt3602 = Class189_Sub2.anInt5642 - Node_Sub35.anInt4158;
	if (Class243.anInt3602 < 0) {
	    Class140.anInt1094 = -Class243.anInt3602;
	    Class243.anInt3602 = 0;
	} else
	    Class140.anInt1094 = 0;
	Statics.anInt6448
	    = Class311.anInt2592 - Node_Sub35.anInt4158;
	if (Statics.anInt6448 < 0) {
	    Class268.anInt2140 = -Statics.anInt6448;
	    Statics.anInt6448 = 0;
	} else
	    Class268.anInt2140 = 0;
	Class353_Sub1.anInt5477
	    = Class189_Sub2.anInt5642 + Node_Sub35.anInt4158;
	if (Class353_Sub1.anInt5477 > LightingManager.xMapSize)
	    Class353_Sub1.anInt5477 = LightingManager.xMapSize;
	Class245_Sub2.anInt5315 = Class311.anInt2592 + Node_Sub35.anInt4158;
	if (Class245_Sub2.anInt5315 > LightingManager.zMapSize)
	    Class245_Sub2.anInt5315 = LightingManager.zMapSize;
	boolean[][] anLocalBooleans = Class242.aBooleanArrayArray1757;
	boolean[][] anLocalBooleans_23_
	    = DoublyLinkedNode_Sub51_Sub15.aBooleanArrayArray6319;
	if (Node_Sub31_Sub16.aBoolean5911) {
	    for (int anLocalInt = 0;
		 (anLocalInt
		  < Node_Sub35.anInt4158 + Node_Sub35.anInt4158 + 2);
		 anLocalInt++) {
		int anLocalInt_24_ = 0;
		int anLocalInt_25_ = 0;
		for (int anLocalInt_26_ = 0;
		     (anLocalInt_26_
		      < Node_Sub35.anInt4158 + Node_Sub35.anInt4158 + 2);
		     anLocalInt_26_++) {
		    if (anLocalInt_26_ > 1)
			Class92.anIntArray709[anLocalInt_26_ - 2]
			    = anLocalInt_24_;
		    anLocalInt_24_ = anLocalInt_25_;
		    int anLocalInt_27_
			= (Class189_Sub2.anInt5642 - Node_Sub35.anInt4158
			   + anLocalInt);
		    int anLocalInt_28_
			= (Class311.anInt2592 - Node_Sub35.anInt4158
			   + anLocalInt_26_);
		    if (anLocalInt_27_ >= 0 && anLocalInt_28_ >= 0
			&& anLocalInt_27_ < LightingManager.xMapSize
			&& anLocalInt_28_ < LightingManager.zMapSize) {
			int anLocalInt_29_
			    = anLocalInt_27_ << LightingManager.lightCoordRShift;
			int anLocalInt_30_
			    = anLocalInt_28_ << LightingManager.lightCoordRShift;
			int anLocalInt_31_
			    = ((Statics.aClass_sArray2713
				    [Statics.aClass_sArray2713.length - 1]
				    .method3534
				(anLocalInt_27_, false, anLocalInt_28_))
			       - (1000 << LightingManager.lightCoordRShift - 7));
			int anLocalInt_32_
			    = (Class65.aClass_sArray455 != null
			       ? ((Class65.aClass_sArray455[0].method3534
				   (anLocalInt_27_, false, anLocalInt_28_))
				  + Class110.anInt909)
			       : ((Statics.aClass_sArray2713[0].method3534
				   (anLocalInt_27_, false, anLocalInt_28_))
				  + Class110.anInt909));
			anLocalInt_25_
			    = (argument_20_ >= 0
			       ? (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.r
				  (anLocalInt_29_, anLocalInt_31_,
				   anLocalInt_30_, anLocalInt_29_,
				   anLocalInt_32_, anLocalInt_30_,
				   argument_20_))
			       : (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.JA
				  (anLocalInt_29_, anLocalInt_31_,
				   anLocalInt_30_, anLocalInt_29_,
				   anLocalInt_32_, anLocalInt_30_)));
			DoublyLinkedNode_Sub51_Sub15.aBooleanArrayArray6319
			    [anLocalInt][anLocalInt_26_]
			    = anLocalInt_25_ == 0;
		    } else {
			anLocalInt_25_ = -1;
			DoublyLinkedNode_Sub51_Sub15.aBooleanArrayArray6319
			    [anLocalInt][anLocalInt_26_]
			    = false;
		    }
		    if (anLocalInt > 0 && anLocalInt_26_ > 0) {
			int anLocalInt_33_
			    = (Class92.anIntArray709[anLocalInt_26_ - 1]
			       & Class92.anIntArray709[anLocalInt_26_]
			       & anLocalInt_24_ & anLocalInt_25_);
			Class242.aBooleanArrayArray1757[anLocalInt - 1]
			    [anLocalInt_26_ - 1]
			    = anLocalInt_33_ == 0;
		    }
		}
		Class92.anIntArray709[(Node_Sub35.anInt4158
				       + Node_Sub35.anInt4158)]
		    = anLocalInt_24_;
		Class92.anIntArray709[(Node_Sub35.anInt4158
				       + Node_Sub35.anInt4158 + 1)]
		    = anLocalInt_25_;
	    }
	    if (argument_20_ >= 0)
		Class384.aBoolean3255 = false;
	    else {
		DoublyLinkedNode_Sub51_Sub8.anIntArray6263 = argument_9_;
		Class294.anIntArray2452 = argument_10_;
		Class368_Sub3.anIntArray5728 = argument_11_;
		Node_Sub43.anIntArray4229 = argument_12_;
		Node_Sub47_Sub12.anIntArray6214 = argument_13_;
		DoublyLinkedNode_Sub51_Sub7.method1209((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834), 28548, argument_14_);
	    }
	} else {
	    if (Statics.aBooleanArrayArray1174 == null)
		Statics.aBooleanArrayArray1174
		    = (new boolean
		       [LightingManager.xMapSize + LightingManager.xMapSize + 1]
		       [LightingManager.zMapSize + LightingManager.xMapSize + 1]);
	    for (int anLocalInt = 0;
		 anLocalInt < Statics.aBooleanArrayArray1174.length;
		 anLocalInt++) {
		for (int anLocalInt_34_ = 0;
		     (anLocalInt_34_
		      < Statics.aBooleanArrayArray1174[0].length);
		     anLocalInt_34_++)
		    Statics.aBooleanArrayArray1174[anLocalInt][anLocalInt_34_]
			= true;
	    }
	    DoublyLinkedNode_Sub51_Sub15.aBooleanArrayArray6319
		= Statics.aBooleanArrayArray1174;
	    Class242.aBooleanArrayArray1757 = Statics.aBooleanArrayArray1174;
	    Class243.anInt3602 = 0;
	    Statics.anInt6448 = 0;
	    Class353_Sub1.anInt5477 = LightingManager.xMapSize;
	    Class245_Sub2.anInt5315 = LightingManager.zMapSize;
	    Class384.aBoolean3255 = false;
	}
	Class253_Sub1.method3248((byte) 77,
				 DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834);
	if (!((Class314) Class62_Sub20.aClass314_4431).aBoolean2604) {
	    Class366 class366
		= ((Class314) Class62_Sub20.aClass314_4431).aClass366_2600;
	    for (DoublyLinkedNodeP2_Sub10 class104_sub10
		     = (DoublyLinkedNodeP2_Sub10) class366.method3986(0);
		 class104_sub10 != null;
		 class104_sub10
		     = (DoublyLinkedNodeP2_Sub10) class366.method3992((byte) -108)) {
		class104_sub10.unlink();
		Class353_Sub9.method3915(class104_sub10, (byte) 95);
	    }
	}
	if (Class128.aBoolean1039) {
	    for (int anLocalInt = 0;
		 anLocalInt < LightingManager.lightListPointer; anLocalInt++)
		LightingManager.virtualLights[anLocalInt]
		    .calculateIntensity(argument, argument_18_);
	}
	if (Node_Sub31_Sub10.aBoolean5882) {
	    Statics.anIntArray6413
		= DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.Y();
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834
		.getScissor(DoublyLinkedNodeP2_Sub2_Sub3_Sub2.anIntArray6605);
	    int anLocalInt = ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2.anIntArray6605[2]
			       - DoublyLinkedNodeP2_Sub2_Sub3_Sub2.anIntArray6605[0])
			      / Statics.anInt1650);
	    for (int anLocalInt_35_ = 0;
		 anLocalInt_35_ < Statics.anInt1650 - 1; anLocalInt_35_++)
		Class62_Sub3.anIntArray4373[anLocalInt_35_]
		    = (anLocalInt * (anLocalInt_35_ + 1)
		       + IOException_Sub1.anIntArray41[anLocalInt_35_]);
	    for (int anLocalInt_36_ = 0;
		 anLocalInt_36_ < Node_Sub32_Sub4.aClass380Array6085.length;
		 anLocalInt_36_++)
		Node_Sub32_Sub4.aClass380Array6085[anLocalInt_36_]
		    .method4101();
	}
	if (Class152.aClass148ArrayArrayArray1151 != null) {
	    if (Node_Sub31_Sub10.aBoolean5882)
		Statics.method136(0);
	    Class295.method3511(true);
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.ra(-1, 1583160, 40,
							  127);
	    Node_Sub32.method1011(true, argument_8_, argument_14_,
                argument_15_, argument_20_, argument_21_,
                argument_22_);
	    if (Node_Sub31_Sub10.aBoolean5882)
		Class313.method3614();
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.pa();
	    Class295.method3511(false);
	}
	Node_Sub32.method1011(false, argument_8_, argument_14_,
            argument_15_, argument_20_, argument_21_,
            argument_22_);
	if (Node_Sub31_Sub10.aBoolean5882) {
	    for (int anLocalInt = 0; anLocalInt < LightingManager.yMapSize;
		 anLocalInt++)
		Node_Sub44.aBooleanArrayArrayArray4255[anLocalInt]
		    = Class62_Sub22.aBooleanArrayArrayArray4435[anLocalInt];
	    Statics.method136(0);
	    for (int anLocalInt = 0;
		 anLocalInt < Node_Sub32_Sub4.aClass380Array6085.length;
		 anLocalInt++)
		Node_Sub32_Sub4.aClass380Array6085[anLocalInt].method4101();
	}
	if (Node_Sub31_Sub10.aBoolean5882) {
	    Class313.method3614();
	    for (int anLocalInt = 0; anLocalInt < LightingManager.yMapSize;
		 anLocalInt++)
		Class62_Sub22.aBooleanArrayArrayArray4435[anLocalInt]
		    = Node_Sub44.aBooleanArrayArrayArray4255[anLocalInt];
	    if (DoublyLinkedNodeP2_Sub2_Sub3_Sub1.anInt6602 == 2) {
		if (Class350.aLongArray2927[0] < Class350.aLongArray2927[1]) {
		    if ((Class62_Sub3.anIntArray4373[0]
			 + IOException_Sub1.anIntArray41[0])
			> DoublyLinkedNodeP2_Sub2_Sub3_Sub2.anIntArray6605[0])
			IOException_Sub1.anIntArray41[0]++;
		} else if ((Class350.aLongArray2927[0]
			    > Class350.aLongArray2927[1])
			   && ((Class62_Sub3.anIntArray4373[0]
				+ IOException_Sub1.anIntArray41[0])
			       < DoublyLinkedNodeP2_Sub2_Sub3_Sub2.anIntArray6605[2]))
		    IOException_Sub1.anIntArray41[0]--;
	    }
	}
	if (!Node_Sub31_Sub16.aBoolean5911) {
	    Class242.aBooleanArrayArray1757 = anLocalBooleans;
	    DoublyLinkedNode_Sub51_Sub15.aBooleanArrayArray6319 = anLocalBooleans_23_;
	}
	Class118.method2376();
    }
    
    private final void method1677
	(boolean argument_37_, GlToolkit argument_38_, int argument_39_) {
	OpenGL.glGetFloatv(2982, aFloatArray682, 0);
	float f = aFloatArray682[0];
	float f_40_ = aFloatArray682[4];
	float f_41_ = aFloatArray682[8];
	float f_42_ = aFloatArray682[1];
	float f_43_ = aFloatArray682[5];
	float f_44_ = aFloatArray682[9];
	float f_45_ = f_42_ + f;
	float f_46_ = f_40_ + f_43_;
	if (argument_37_ == true) {
	    float f_47_ = f_41_ + f_44_;
	    float f_48_ = f - f_42_;
	    float f_49_ = -f_43_ + f_40_;
	    float f_50_ = -f_44_ + f_41_;
	    float f_51_ = -f + f_42_;
	    float f_52_ = -f_40_ + f_43_;
	    ((Packet) aClass59_Sub28_Sub2_684).pos = 0;
	    float f_53_ = -f_41_ + f_44_;
	    if (!((GlToolkit) argument_38_).isBigEndian) {
		for (int anLocalInt = argument_39_ - 1; anLocalInt >= 0;
		     anLocalInt--) {
		    int anLocalInt_54_ = (anIntArray693[anLocalInt] > 64 ? 64
					  : anIntArray693[anLocalInt]);
		    if (anLocalInt_54_ > 0) {
			for (int anLocalInt_55_ = anLocalInt_54_ - 1;
			     anLocalInt_55_ >= 0; anLocalInt_55_--) {
			    DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1
				= (aClass104_Sub4_Sub1ArrayArray691[anLocalInt]
				   [anLocalInt_55_]);
			    int anLocalInt_56_
				= (((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				   .anInt6439);
			    byte anLocalInt_57_
				= (byte) (anLocalInt_56_ >> 16);
			    byte anLocalInt_58_ = (byte) (anLocalInt_56_ >> 8);
			    byte anLocalInt_59_ = (byte) anLocalInt_56_;
			    byte anLocalInt_60_
				= (byte) (anLocalInt_56_ >>> 24);
			    float f_61_
				= (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
					    class104_sub4_sub1).anInt6435
					   >> 12);
			    float f_62_
				= (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
					    class104_sub4_sub1).anInt6430
					   >> 12);
			    float f_63_
				= (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
					    class104_sub4_sub1).anInt6432
					   >> 12);
			    int anLocalInt_64_
				= ((((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				    .anInt6431)
				   >> 12);
			    aClass59_Sub28_Sub2_684.ipfloat(0.0F);
			    aClass59_Sub28_Sub2_684.ipfloat(0.0F);
			    aClass59_Sub28_Sub2_684.ipfloat(f_45_ * (float) -anLocalInt_64_ + f_61_);
			    aClass59_Sub28_Sub2_684.ipfloat((float) -anLocalInt_64_ * f_46_ + f_62_);
			    aClass59_Sub28_Sub2_684.ipfloat(f_47_ * (float) -anLocalInt_64_ + f_63_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_57_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_58_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_59_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_60_);
			    aClass59_Sub28_Sub2_684.ipfloat(1.0F);
			    aClass59_Sub28_Sub2_684.ipfloat(0.0F);
			    aClass59_Sub28_Sub2_684.ipfloat((float) anLocalInt_64_ * f_48_ + f_61_);
			    aClass59_Sub28_Sub2_684.ipfloat(f_62_ + (float) anLocalInt_64_ * f_49_);
			    aClass59_Sub28_Sub2_684.ipfloat(f_50_ * (float) anLocalInt_64_ + f_63_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_57_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_58_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_59_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_60_);
			    aClass59_Sub28_Sub2_684.ipfloat(1.0F);
			    aClass59_Sub28_Sub2_684.ipfloat(1.0F);
			    aClass59_Sub28_Sub2_684.ipfloat(f_61_ + f_45_ * (float) anLocalInt_64_);
			    aClass59_Sub28_Sub2_684.ipfloat(f_46_ * (float) anLocalInt_64_ + f_62_);
			    aClass59_Sub28_Sub2_684.ipfloat(f_63_ + (float) anLocalInt_64_ * f_47_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_57_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_58_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_59_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_60_);
			    aClass59_Sub28_Sub2_684.ipfloat(0.0F);
			    aClass59_Sub28_Sub2_684.ipfloat(1.0F);
			    aClass59_Sub28_Sub2_684.ipfloat(f_61_ + (float) anLocalInt_64_ * f_51_);
			    aClass59_Sub28_Sub2_684.ipfloat(f_52_ * (float) anLocalInt_64_ + f_62_);
			    aClass59_Sub28_Sub2_684.ipfloat(f_63_ + (float) anLocalInt_64_ * f_53_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_57_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_58_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_59_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_60_);
			}
			if (anIntArray693[anLocalInt] > 64) {
			    int anLocalInt_65_
				= anIntArray693[anLocalInt] - 64 - 1;
			    for (int anLocalInt_66_
				     = anIntArray694[anLocalInt_65_] - 1;
				 anLocalInt_66_ >= 0; anLocalInt_66_--) {
				DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1
				    = (aClass104_Sub4_Sub1ArrayArray695
				       [anLocalInt_65_][anLocalInt_66_]);
				int anLocalInt_67_ = (((DoublyLinkedNodeP2_Sub4_Sub1)
						       class104_sub4_sub1)
						      .anInt6439);
				byte anLocalInt_68_
				    = (byte) (anLocalInt_67_ >> 16);
				byte anLocalInt_69_
				    = (byte) (anLocalInt_67_ >> 8);
				byte anLocalInt_70_ = (byte) anLocalInt_67_;
				byte anLocalInt_71_
				    = (byte) (anLocalInt_67_ >>> 24);
				float f_72_
				    = (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
						class104_sub4_sub1).anInt6435
					       >> 12);
				float f_73_
				    = (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
						class104_sub4_sub1).anInt6430
					       >> 12);
				float f_74_
				    = (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
						class104_sub4_sub1).anInt6432
					       >> 12);
				int anLocalInt_75_
				    = (((DoublyLinkedNodeP2_Sub4_Sub1)
					class104_sub4_sub1).anInt6431
				       >> 12);
				aClass59_Sub28_Sub2_684.ipfloat(0.0F);
				aClass59_Sub28_Sub2_684.ipfloat(0.0F);
				aClass59_Sub28_Sub2_684.ipfloat(f_72_ + (float) -anLocalInt_75_ * f_45_);
				aClass59_Sub28_Sub2_684.ipfloat(f_73_ + (float) -anLocalInt_75_ * f_46_);
				aClass59_Sub28_Sub2_684.ipfloat(f_74_ + (float) -anLocalInt_75_ * f_47_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_68_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_69_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_70_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_71_);
				aClass59_Sub28_Sub2_684.ipfloat(1.0F);
				aClass59_Sub28_Sub2_684.ipfloat(0.0F);
				aClass59_Sub28_Sub2_684.ipfloat((float) anLocalInt_75_ * f_48_ + f_72_);
				aClass59_Sub28_Sub2_684.ipfloat((float) anLocalInt_75_ * f_49_ + f_73_);
				aClass59_Sub28_Sub2_684.ipfloat(f_74_ + f_50_ * (float) anLocalInt_75_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_68_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_69_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_70_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_71_);
				aClass59_Sub28_Sub2_684.ipfloat(1.0F);
				aClass59_Sub28_Sub2_684.ipfloat(1.0F);
				aClass59_Sub28_Sub2_684.ipfloat(f_72_ + f_45_ * (float) anLocalInt_75_);
				aClass59_Sub28_Sub2_684.ipfloat(f_73_ + (float) anLocalInt_75_ * f_46_);
				aClass59_Sub28_Sub2_684.ipfloat(f_74_ + (float) anLocalInt_75_ * f_47_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_68_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_69_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_70_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_71_);
				aClass59_Sub28_Sub2_684.ipfloat(0.0F);
				aClass59_Sub28_Sub2_684.ipfloat(1.0F);
				aClass59_Sub28_Sub2_684.ipfloat(f_51_ * (float) anLocalInt_75_ + f_72_);
				aClass59_Sub28_Sub2_684.ipfloat((float) anLocalInt_75_ * f_52_ + f_73_);
				aClass59_Sub28_Sub2_684.ipfloat(f_74_ + (float) anLocalInt_75_ * f_53_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_68_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_69_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_70_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_71_);
			    }
			}
		    }
		}
	    } else {
		for (int anLocalInt = argument_39_ - 1; anLocalInt >= 0;
		     anLocalInt--) {
		    int anLocalInt_76_ = (anIntArray693[anLocalInt] <= 64
					  ? anIntArray693[anLocalInt] : 64);
		    if (anLocalInt_76_ > 0) {
			for (int anLocalInt_77_ = anLocalInt_76_ - 1;
			     anLocalInt_77_ >= 0; anLocalInt_77_--) {
			    DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1
				= (aClass104_Sub4_Sub1ArrayArray691[anLocalInt]
				   [anLocalInt_77_]);
			    int anLocalInt_78_
				= (((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				   .anInt6439);
			    byte anLocalInt_79_
				= (byte) (anLocalInt_78_ >> 16);
			    byte anLocalInt_80_ = (byte) (anLocalInt_78_ >> 8);
			    byte anLocalInt_81_ = (byte) anLocalInt_78_;
			    byte anLocalInt_82_
				= (byte) (anLocalInt_78_ >>> 24);
			    float f_83_
				= (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
					    class104_sub4_sub1).anInt6435
					   >> 12);
			    float f_84_
				= (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
					    class104_sub4_sub1).anInt6430
					   >> 12);
			    float f_85_
				= (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
					    class104_sub4_sub1).anInt6432
					   >> 12);
			    int anLocalInt_86_
				= ((((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				    .anInt6431)
				   >> 12);
			    aClass59_Sub28_Sub2_684.pfloat(0.0F);
			    aClass59_Sub28_Sub2_684.pfloat(0.0F);
			    aClass59_Sub28_Sub2_684.pfloat(f_83_ + (float) -anLocalInt_86_ * f_45_);
			    aClass59_Sub28_Sub2_684.pfloat(f_84_ + f_46_ * (float) -anLocalInt_86_);
			    aClass59_Sub28_Sub2_684.pfloat(f_47_ * (float) -anLocalInt_86_ + f_85_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_79_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_80_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_81_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_82_);
			    aClass59_Sub28_Sub2_684.pfloat(1.0F);
			    aClass59_Sub28_Sub2_684.pfloat(0.0F);
			    aClass59_Sub28_Sub2_684.pfloat(f_83_ + (float) anLocalInt_86_ * f_48_);
			    aClass59_Sub28_Sub2_684.pfloat(f_84_ + (float) anLocalInt_86_ * f_49_);
			    aClass59_Sub28_Sub2_684.pfloat((float) anLocalInt_86_ * f_50_ + f_85_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_79_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_80_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_81_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_82_);
			    aClass59_Sub28_Sub2_684.pfloat(1.0F);
			    aClass59_Sub28_Sub2_684.pfloat(1.0F);
			    aClass59_Sub28_Sub2_684.pfloat(f_83_ + (float) anLocalInt_86_ * f_45_);
			    aClass59_Sub28_Sub2_684.pfloat(f_46_ * (float) anLocalInt_86_ + f_84_);
			    aClass59_Sub28_Sub2_684.pfloat((float) anLocalInt_86_ * f_47_ + f_85_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_79_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_80_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_81_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_82_);
			    aClass59_Sub28_Sub2_684.pfloat(0.0F);
			    aClass59_Sub28_Sub2_684.pfloat(1.0F);
			    aClass59_Sub28_Sub2_684.pfloat(f_83_ + f_51_ * (float) anLocalInt_86_);
			    aClass59_Sub28_Sub2_684.pfloat(f_52_ * (float) anLocalInt_86_ + f_84_);
			    aClass59_Sub28_Sub2_684.pfloat(f_53_ * (float) anLocalInt_86_ + f_85_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_79_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_80_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_81_);
			    aClass59_Sub28_Sub2_684.p1(
                        anLocalInt_82_);
			}
			if (anIntArray693[anLocalInt] > 64) {
			    int anLocalInt_87_
				= anIntArray693[anLocalInt] - 1 - 64;
			    for (int anLocalInt_88_
				     = anIntArray694[anLocalInt_87_] - 1;
				 anLocalInt_88_ >= 0; anLocalInt_88_--) {
				DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1
				    = (aClass104_Sub4_Sub1ArrayArray695
				       [anLocalInt_87_][anLocalInt_88_]);
				int anLocalInt_89_ = (((DoublyLinkedNodeP2_Sub4_Sub1)
						       class104_sub4_sub1)
						      .anInt6439);
				byte anLocalInt_90_
				    = (byte) (anLocalInt_89_ >> 16);
				byte anLocalInt_91_
				    = (byte) (anLocalInt_89_ >> 8);
				byte anLocalInt_92_ = (byte) anLocalInt_89_;
				byte anLocalInt_93_
				    = (byte) (anLocalInt_89_ >>> 24);
				float f_94_
				    = (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
						class104_sub4_sub1).anInt6435
					       >> 12);
				float f_95_
				    = (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
						class104_sub4_sub1).anInt6430
					       >> 12);
				float f_96_
				    = (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
						class104_sub4_sub1).anInt6432
					       >> 12);
				int anLocalInt_97_
				    = (((DoublyLinkedNodeP2_Sub4_Sub1)
					class104_sub4_sub1).anInt6431
				       >> 12);
				aClass59_Sub28_Sub2_684.pfloat(0.0F);
				aClass59_Sub28_Sub2_684.pfloat(0.0F);
				aClass59_Sub28_Sub2_684.pfloat(f_94_ + f_45_ * (float) -anLocalInt_97_);
				aClass59_Sub28_Sub2_684.pfloat(f_46_ * (float) -anLocalInt_97_ + f_95_);
				aClass59_Sub28_Sub2_684.pfloat((float) -anLocalInt_97_ * f_47_ + f_96_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_90_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_91_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_92_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_93_);
				aClass59_Sub28_Sub2_684.pfloat(1.0F);
				aClass59_Sub28_Sub2_684.pfloat(0.0F);
				aClass59_Sub28_Sub2_684.pfloat(f_94_ + (float) anLocalInt_97_ * f_48_);
				aClass59_Sub28_Sub2_684.pfloat(f_95_ + f_49_ * (float) anLocalInt_97_);
				aClass59_Sub28_Sub2_684.pfloat(f_50_ * (float) anLocalInt_97_ + f_96_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_90_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_91_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_92_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_93_);
				aClass59_Sub28_Sub2_684.pfloat(1.0F);
				aClass59_Sub28_Sub2_684.pfloat(1.0F);
				aClass59_Sub28_Sub2_684.pfloat(f_94_ + f_45_ * (float) anLocalInt_97_);
				aClass59_Sub28_Sub2_684.pfloat(f_46_ * (float) anLocalInt_97_ + f_95_);
				aClass59_Sub28_Sub2_684.pfloat(f_47_ * (float) anLocalInt_97_ + f_96_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_90_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_91_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_92_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_93_);
				aClass59_Sub28_Sub2_684.pfloat(0.0F);
				aClass59_Sub28_Sub2_684.pfloat(1.0F);
				aClass59_Sub28_Sub2_684.pfloat((float) anLocalInt_97_ * f_51_ + f_94_);
				aClass59_Sub28_Sub2_684.pfloat((float) anLocalInt_97_ * f_52_ + f_95_);
				aClass59_Sub28_Sub2_684.pfloat(f_96_ + (float) anLocalInt_97_ * f_53_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_90_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_91_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_92_);
				aClass59_Sub28_Sub2_684
				    .p1(anLocalInt_93_);
			    }
			}
		    }
		}
	    }
	    if (((Packet) aClass59_Sub28_Sub2_684).pos != 0) {
		anGlArrayBuffer_686.setData(((Packet) aClass59_Sub28_Sub2_684).data, 24, ((Packet) aClass59_Sub28_Sub2_684).pos);
		argument_38_.bindArrays(null, aGlInterleavedArray_687, aGlInterleavedArray_685, aGlInterleavedArray_690);
		argument_38_.drawArrays(7, 0, (((Packet) aClass59_Sub28_Sub2_684).pos / 24));
	    }
	}
    }
    
    final void method1678(GlToolkit argument_98_, int argument_99_) {
	anGlArrayBuffer_686 = argument_98_.method2289(0, 196584, null, true, 24);
	aGlInterleavedArray_690 = new GlInterleavedArray(anGlArrayBuffer_686, 5126, 2, 0);
	aGlInterleavedArray_685 = new GlInterleavedArray(anGlArrayBuffer_686, 5126, 3, 8);
	aGlInterleavedArray_687 = new GlInterleavedArray(anGlArrayBuffer_686, 5121, 4, 20);
    }
    
    static final int method1679(int argument, boolean argument_100_,
				int argument_101_, int argument_102_) {
	argument_101_ &= 0x3;
	if (argument_101_ == 0)
	    return argument;
	if (argument_101_ == 1)
	    return argument_102_;
	if (argument_101_ == 2)
	    return -argument + 4095;
	return 4095 - argument_102_;
    }
    
    static final boolean method1680(int argument, int argument_103_,
				    int argument_104_) {
	if ((argument & 0x800) == 0)
	    return false;
	return true;
    }
    
    final void method1681(int argument_105_, Class72 argument_106_,
			  int argument_107_, GlToolkit argument_108_) {
	if (((GlToolkit) argument_108_).aClass350_Sub3_4881 != null) {
	    if (argument_107_ >= 0)
		method1674(-28486, argument_108_, argument_107_);
	    else
		method1682(argument_108_, (byte) -107);
	    float f = (((Class350_Sub3)
			((GlToolkit) argument_108_).aClass350_Sub3_4881)
		       .aFloat5455);
	    float f_109_ = (((Class350_Sub3) (((GlToolkit) argument_108_)
					      .aClass350_Sub3_4881))
			    .aFloat5465);
	    float f_110_ = (((Class350_Sub3) (((GlToolkit) argument_108_)
					      .aClass350_Sub3_4881))
			    .aFloat5461);
	    float f_111_ = (((Class350_Sub3) (((GlToolkit) argument_108_)
					      .aClass350_Sub3_4881))
			    .aFloat5462);
	    try {
		int anLocalInt = 0;
		int anLocalInt_112_ = 2147483647;
		int anLocalInt_113_ = 0;
		DoublyLinkedNodeP2_Sub4 class104_sub4
		    = (((Class119) ((Class72) argument_106_).aClass119_497)
		       .aClass104_Sub4_971);
		for (DoublyLinkedNodeP2_Sub4 class104_sub4_114_
			 = ((DoublyLinkedNodeP2_Sub4) class104_sub4).aClass104_Sub4_4526;
		     class104_sub4_114_ != class104_sub4;
		     class104_sub4_114_ = (((DoublyLinkedNodeP2_Sub4) class104_sub4_114_)
					   .aClass104_Sub4_4526)) {
		    DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1
			= (DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_114_;
		    int anLocalInt_115_
			= (int) (f_110_ * (float) ((((DoublyLinkedNodeP2_Sub4_Sub1)
						     class104_sub4_sub1)
						    .anInt6432)
						   >> 12)
				 + ((float) (((DoublyLinkedNodeP2_Sub4_Sub1)
					      class104_sub4_sub1).anInt6435
					     >> 12) * f
				    + (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
						class104_sub4_sub1).anInt6430
					       >> 12) * f_109_)
				 + f_111_);
		    if (anLocalInt_115_ > anLocalInt_113_)
			anLocalInt_113_ = anLocalInt_115_;
		    anIntArray696[anLocalInt++] = anLocalInt_115_;
		    if (anLocalInt_115_ < anLocalInt_112_)
			anLocalInt_112_ = anLocalInt_115_;
		}
		int anLocalInt_116_ = anLocalInt_113_ - anLocalInt_112_;
		int anLocalInt_117_;
		if (anLocalInt_116_ + 2 <= 1600) {
		    anLocalInt_116_ += 2;
		    anLocalInt_117_ = 0;
		} else {
		    anLocalInt_117_
			= (DoublyLinkedNode_Sub51_Sub13.method1258(9761, anLocalInt_116_)
			   + 1 - anInt688);
		    anLocalInt_116_ = (anLocalInt_116_ >> anLocalInt_117_) + 2;
		}
		DoublyLinkedNodeP2_Sub4 class104_sub4_118_
		    = ((DoublyLinkedNodeP2_Sub4) class104_sub4).aClass104_Sub4_4526;
		anLocalInt = 0;
		int anLocalInt_119_ = -2;
		boolean anLocalBoolean = true;
		boolean anLocalBoolean_120_ = true;
		while (class104_sub4 != class104_sub4_118_) {
		    anInt692 = 0;
		    for (int anLocalInt_121_ = 0;
			 anLocalInt_116_ > anLocalInt_121_; anLocalInt_121_++)
			anIntArray693[anLocalInt_121_] = 0;
		    for (int anLocalInt_122_ = 0; anLocalInt_122_ < 64;
			 anLocalInt_122_++)
			anIntArray694[anLocalInt_122_] = 0;
		    for (/**/; class104_sub4 != class104_sub4_118_;
			 class104_sub4_118_
			     = (((DoublyLinkedNodeP2_Sub4) class104_sub4_118_)
				.aClass104_Sub4_4526)) {
			DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1
			    = (DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_118_;
			if (anLocalBoolean_120_) {
			    anLocalBoolean_120_ = false;
			    anLocalBoolean
				= (((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				   .aBoolean6440);
			    anLocalInt_119_
				= (((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				   .anInt6438);
			}
			if (anLocalInt > 0
			    && ((((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				 .anInt6438) != anLocalInt_119_
				|| anLocalBoolean != (((DoublyLinkedNodeP2_Sub4_Sub1)
						       class104_sub4_sub1)
						      .aBoolean6440))) {
			    anLocalBoolean_120_ = true;
			    break;
			}
			int anLocalInt_123_
			    = (-anLocalInt_112_ + anIntArray696[anLocalInt++]
			       >> anLocalInt_117_);
			if (anLocalInt_123_ < 1600) {
			    if (anIntArray693[anLocalInt_123_] < 64)
				aClass104_Sub4_Sub1ArrayArray691
				    [anLocalInt_123_]
				    [anIntArray693[anLocalInt_123_]++]
				    = class104_sub4_sub1;
			    else {
				if (anIntArray693[anLocalInt_123_] == 64) {
				    if (anInt692 == 64)
					continue;
				    anIntArray693[anLocalInt_123_]
					+= 1 + anInt692++;
				}
				aClass104_Sub4_Sub1ArrayArray695
				    [anIntArray693[anLocalInt_123_] - 64 - 1]
				    [anIntArray694[((anIntArray693
						     [anLocalInt_123_])
						    - 64 - 1)]++]
				    = class104_sub4_sub1;
			    }
			}
		    }
		    if (anLocalInt_119_ < 0)
			argument_108_.method2333(-1);
		    else
			argument_108_.method2333(anLocalInt_119_);
		    if (anLocalBoolean
			&& (Statics.aFloat6341
			    != ((GlToolkit) argument_108_).modelIntensity))
			argument_108_.setAmbientIntensity(Statics.aFloat6341);
		    else if (((GlToolkit) argument_108_).modelIntensity
			     != 1.0F)
			argument_108_.setAmbientIntensity(1.0F);
		    method1677(true, argument_108_, anLocalInt_116_);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method1675(argument_108_, (byte) 45);
	}
    }
    
    private final void method1682(GlToolkit argument_124_,
				  byte argument_125_) {
	Statics.aFloat6341
	    = ((GlToolkit) argument_124_).modelIntensity;
	int anLocalInt = 79 / ((argument_125_ + 6) / 52);
	argument_124_.setupConfig8();
	OpenGL.glDisable(16384);
	OpenGL.glDisable(16385);
	argument_124_.method2276(false);
	OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    Class90() {
	aClass104_Sub4_Sub1ArrayArray691 = new DoublyLinkedNodeP2_Sub4_Sub1[1600][64];
	anInt692 = 0;
	aClass104_Sub4_Sub1ArrayArray695 = new DoublyLinkedNodeP2_Sub4_Sub1[64][768];
	anIntArray696 = new int[8191];
    }
}
