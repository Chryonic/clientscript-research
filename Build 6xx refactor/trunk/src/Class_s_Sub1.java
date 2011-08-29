/* Class_s_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

final class Class_s_Sub1 extends Class_s
{
    int[][][] anIntArrayArrayArray5320;
    GraphicsToolkit_Sub2 aClass_ha_Sub2_5321;
    int anInt5322;
    private int anInt5323;
    private int[][][] anIntArrayArrayArray5324;
    private CyclicLinkedList aCyclicLinkedList_5325;
    private int[][][] anIntArrayArrayArray5326;
    private float aFloat5327 = 3.4028235E38F;
    private Class232 aClass232_5328;
    private byte[][] aByteArrayArray5329;
    short[][] aShortArrayArray5330;
    static int anInt5331 = 1407;
    private Node_Sub45[][][] aClass59_Sub45ArrayArrayArray5332;
    private int anInt5333;
    private int[][][] anIntArrayArrayArray5334;
    private int anInt5335;
    int[][][] anIntArrayArrayArray5336;
    private int anInt5337;
    private float aFloat5338 = -3.4028235E38F;
    int[][][] anIntArrayArrayArray5339;
    private float[][] aFloatArrayArray5340;
    private float[][] aFloatArrayArray5341;
    private Node_Sub45[] aClass59_Sub45Array5342;
    private byte[][] aByteArrayArray5343;
    private Interface4_Impl2 anInterface4_Impl2_5344;
    private int anInt5345;
    private float[][] aFloatArrayArray5346;
    private int anInt5347;
    Class222 aClass222_5348;
    private Interface4_Impl2 anInterface4_Impl2_5349;
    private JagexHashMap aJagexHashMap_5350;
    
    final boolean method3542(tia_sub_35DoublyLinked argument_0_, int argument_1_,
			     int argument_2_, int argument_3_, int argument_4_,
			     boolean argument_5_) {
	if (aClass232_5328 == null || argument_0_ == null)
	    return false;
	int anLocalInt
	    = (-(argument_2_ * (((GraphicsToolkit_Sub2)
				 ((Class_s_Sub1) this).aClass_ha_Sub2_5321)
				.anInt4705)
		 >> 8) + argument_1_
	       >> (((GraphicsToolkit_Sub2) ((Class_s_Sub1) this).aClass_ha_Sub2_5321)
		   .anInt4701));
	int anLocalInt_6_
	    = (-(argument_2_ * (((GraphicsToolkit_Sub2)
				 ((Class_s_Sub1) this).aClass_ha_Sub2_5321)
				.anInt4704)
		 >> 8) + argument_3_
	       >> (((GraphicsToolkit_Sub2) ((Class_s_Sub1) this).aClass_ha_Sub2_5321)
		   .anInt4701));
	return aClass232_5328.method3095(anLocalInt, anLocalInt_6_,
					 argument_0_, 122);
    }
    
    private final void method3545(boolean[][] argument_7_, int argument_8_,
				  boolean argument_9_, int argument_10_,
				  int argument_11_, int argument_12_,
				  int argument_13_, int argument_14_) {
	if (aClass59_Sub45Array5342 != null) {
	    int anLocalInt = argument_10_ + (argument_10_ + 1);
	    anLocalInt *= anLocalInt;
	    if (anLocalInt > Statics.anIntArray426.length)
		Statics.anIntArray426 = new int[anLocalInt];
	    int anLocalInt_15_ = -argument_10_ + argument_14_;
	    int anLocalInt_16_ = anLocalInt_15_;
	    if (anLocalInt_15_ < 0)
		anLocalInt_15_ = 0;
	    int anLocalInt_17_ = argument_12_ - argument_10_;
	    int anLocalInt_18_ = anLocalInt_17_;
	    if (anLocalInt_17_ < 0)
		anLocalInt_17_ = 0;
	    int anLocalInt_19_ = argument_10_ + argument_14_;
	    if (((Class_s) this).anInt2550 - 1 < anLocalInt_19_)
		anLocalInt_19_ = ((Class_s) this).anInt2550 - 1;
	    int anLocalInt_20_ = argument_12_ + argument_10_;
	    Class183.anInt1380 = 0;
	    if (((Class_s) this).anInt2549 - 1 < anLocalInt_20_)
		anLocalInt_20_ = ((Class_s) this).anInt2549 - 1;
	    for (int anLocalInt_21_ = anLocalInt_15_;
		 anLocalInt_19_ >= anLocalInt_21_; anLocalInt_21_++) {
		boolean[] anLocalBooleans
		    = argument_7_[-anLocalInt_16_ + anLocalInt_21_];
		for (int anLocalInt_22_ = anLocalInt_17_;
		     anLocalInt_20_ >= anLocalInt_22_; anLocalInt_22_++) {
		    if (anLocalBooleans[-anLocalInt_18_ + anLocalInt_22_])
			Statics.anIntArray426[Class183.anInt1380++]
			    = (anLocalInt_22_ * ((Class_s) this).anInt2550
			       + anLocalInt_21_);
		}
	    }
	    if (argument_11_ == -1)
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2200(true);
	    else {
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2124((float) argument_11_, (byte) 119);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2226(argument_8_ - 8);
	    }
	    ((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2166();
	    ((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2172
		((byte) -68, (((Class_s_Sub1) this).anInt5322 & 0x7) != 0);
	    ((Class_s_Sub1) this).aClass_ha_Sub2_5321
		.method2215(false, -1, false, (byte) -112);
	    ((Class_s_Sub1) this).aClass_ha_Sub2_5321
		.method2130(anInterface4_Impl2_5349, 0, 72);
	    for (int anLocalInt_23_ = 0;
		 anLocalInt_23_ < aClass59_Sub45Array5342.length;
		 anLocalInt_23_++)
		aClass59_Sub45Array5342[anLocalInt_23_].method1088
		    (-31861, Statics.anIntArray426, Class183.anInt1380);
	    Class350_Sub2 class350_sub2
		= ((Class_s_Sub1) this).aClass_ha_Sub2_5321
		      .method2187((byte) 88);
	    class350_sub2.method3825(0, -1, 0);
	    ((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2222(11570);
	    if (!aCyclicLinkedList_5325.isEmpty()) {
		int anLocalInt_24_ = (((GraphicsToolkit_Sub2) (((Class_s_Sub1) this)
							.aClass_ha_Sub2_5321))
				      .fogColour);
		int anLocalInt_25_ = (((GraphicsToolkit_Sub2) (((Class_s_Sub1) this)
							.aClass_ha_Sub2_5321))
				      .fogThickness);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.setFog(0, anLocalInt_25_, ((GraphicsToolkit_Sub2) ((Class_s_Sub1) this).aClass_ha_Sub2_5321).fogDistance);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2172((byte) -68, false);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2212((byte) -119, false);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2147(0, 128);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2215(false, -2, false, (byte) -112);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2237
		    (true, (((GraphicsToolkit_Sub2)
			     ((Class_s_Sub1) this).aClass_ha_Sub2_5321)
			    .anInterface7_4741));
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2228
		    (CombineModeEnum.REPLACE, CombineModeEnum.MODULATE,
		     92);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2229((byte) -59, GlMultiTexSourceEnum.CONSTANT, 0);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2224(0, GlMultiTexSourceEnum.PRIMARY_COLOUR, -107);
		for (Node node = aCyclicLinkedList_5325.getFirst();
		     node != null;
		     node = aCyclicLinkedList_5325.getNext()) {
		    Node_Sub21 class59_sub21 = (Node_Sub21) node;
		    class59_sub21.method730(argument_7_, argument_10_,
					    argument_14_, argument_12_, -1);
		}
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2229((byte) 116, GlMultiTexSourceEnum.TEXTURE, 0);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2224(0, GlMultiTexSourceEnum.TEXTURE, -107);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2237(true,
								     null);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.setFog(anLocalInt_24_, anLocalInt_25_, ((GraphicsToolkit_Sub2) ((Class_s_Sub1) this).aClass_ha_Sub2_5321).fogDistance);
	    }
	    if (aClass232_5328 != null) {
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2130
		    (anInterface4_Impl2_5349, 0, argument_8_ ^ ~0x6e);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2130
		    (anInterface4_Impl2_5344, 1, argument_8_ ^ ~0x4c);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2179
		    (((Class_s_Sub1) this).aClass222_5348, (byte) -63);
		aClass232_5328.method3092((byte) 127, argument_9_,
					  argument_12_, argument_14_,
					  argument_7_, argument_10_);
	    }
	}
	if (argument_8_ != 7)
	    YA();
    }
    
    final void ka(int argument_26_, int argument_27_, int argument_28_) {
	if (argument_28_
	    > (aByteArrayArray5343[argument_26_][argument_27_] & 0xff))
	    aByteArrayArray5343[argument_26_][argument_27_]
		= (byte) argument_28_;
    }
    
    final void method3533(int argument_29_, int argument_30_, int argument_31_,
			  boolean[][] argument_32_, boolean argument_33_,
			  int argument_34_) {
	method3545(argument_32_, 7, argument_33_, argument_31_, -1,
		   argument_30_, argument_34_, argument_29_);
    }
    
    final void method3535(int argument_35_, int argument_36_, int argument_37_,
			  int argument_38_, int argument_39_, int argument_40_,
			  int argument_41_, boolean[][] argument_42_) {
	if (anInt5347 > 0) {
	    Interface4_Impl1 interface4_impl1
		= ((Class_s_Sub1) this).aClass_ha_Sub2_5321
		      .method2199((byte) 31, anInt5323);
	    int anLocalInt = 0;
	    int anLocalInt_43_ = 32767;
	    int anLocalInt_44_ = -32768;
	    for (int anLocalInt_45_ = 0; anLocalInt_45_ < 4;
		 anLocalInt_45_++) {
		anLocalInt = 0;
		Buffer buffer
		    = interface4_impl1.method43(true, 3754);
		if (buffer != null) {
		    Stream stream = ((Class_s_Sub1) this)
					.aClass_ha_Sub2_5321
					.method2116(9, buffer);
		    if (!Stream.isBigEndian()) {
			for (int anLocalInt_46_ = argument_39_;
			     argument_41_ > anLocalInt_46_; anLocalInt_46_++) {
			    int anLocalInt_47_
				= (((Class_s) this).anInt2550 * anLocalInt_46_
				   + argument_38_);
			    for (int anLocalInt_48_ = argument_38_;
				 anLocalInt_48_ < argument_40_;
				 anLocalInt_48_++) {
				if (argument_42_[anLocalInt_48_ - argument_38_]
				    [-argument_39_ + anLocalInt_46_]) {
				    short[] anLocalInts
					= (((Class_s_Sub1) this)
					   .aShortArrayArray5330
					   [anLocalInt_47_]);
				    if (anLocalInts != null) {
					for (int anLocalInt_49_ = 0;
					     (anLocalInts.length
					      > anLocalInt_49_);
					     anLocalInt_49_++) {
					    int anLocalInt_50_
						= (anLocalInts[anLocalInt_49_]
						   & 0xffff);
					    anLocalInt++;
					    if (anLocalInt_43_
						> anLocalInt_50_)
						anLocalInt_43_
						    = anLocalInt_50_;
					    if (anLocalInt_50_
						> anLocalInt_44_)
						anLocalInt_44_
						    = anLocalInt_50_;
					    stream.writeShortLE(anLocalInt_50_);
					}
				    }
				}
				anLocalInt_47_++;
			    }
			}
		    } else {
			for (int anLocalInt_51_ = argument_39_;
			     argument_41_ > anLocalInt_51_; anLocalInt_51_++) {
			    int anLocalInt_52_
				= (anLocalInt_51_ * ((Class_s) this).anInt2550
				   + argument_38_);
			    for (int anLocalInt_53_ = argument_38_;
				 anLocalInt_53_ < argument_40_;
				 anLocalInt_53_++) {
				if (argument_42_[anLocalInt_53_ - argument_38_]
				    [anLocalInt_51_ - argument_39_]) {
				    short[] anLocalInts
					= (((Class_s_Sub1) this)
					   .aShortArrayArray5330
					   [anLocalInt_52_]);
				    if (anLocalInts != null) {
					for (int anLocalInt_54_ = 0;
					     (anLocalInt_54_
					      < anLocalInts.length);
					     anLocalInt_54_++) {
					    int anLocalInt_55_
						= (anLocalInts[anLocalInt_54_]
						   & 0xffff);
					    if (anLocalInt_44_
						< anLocalInt_55_)
						anLocalInt_44_
						    = anLocalInt_55_;
					    anLocalInt++;
					    if (anLocalInt_55_
						< anLocalInt_43_)
						anLocalInt_43_
						    = anLocalInt_55_;
					    stream.writeShortBE(anLocalInt_55_);
					}
				    }
				}
				anLocalInt_52_++;
			    }
			}
		    }
		    stream.upload();
		    if (interface4_impl1.method41(26937))
			break;
		}
	    }
	    if (anLocalInt > 0) {
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2207(true);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2243(-545832829, false);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2172((byte) -68, false);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2189(1, false);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2212((byte) 124, false);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2147(0, 0);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2215(false, -2, false, (byte) -112);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2237(true,
								     null);
		Class350_Sub2 class350_sub2
		    = ((Class_s_Sub1) this).aClass_ha_Sub2_5321
			  .method2187((byte) 71);
		float[] fs
		    = ((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2176();
		fs[11] = 0.0F;
		fs[0] = ((float) argument_37_
			 / ((float) ((Class_s) this).anInt2547 * 128.0F
			    * (float) (((GraphicsToolkit_Sub2) (((Class_s_Sub1) this)
							 .aClass_ha_Sub2_5321))
				       .viewportW)));
		fs[15] = 1.0F;
		fs[14] = -aFloat5327 / (aFloat5338 - aFloat5327);
		fs[13] = -(((float) (argument_36_ * 2)
			    + (float) (argument_37_ * argument_41_) / 128.0F)
			   / (float) (((GraphicsToolkit_Sub2) (((Class_s_Sub1) this)
							.aClass_ha_Sub2_5321))
				      .viewportH)) + 1.0F;
		fs[7] = 0.0F;
		fs[4] = 0.0F;
		fs[10] = 1.0F / (aFloat5338 - aFloat5327);
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[9] = 0.0F;
		fs[12] = -(((float) (argument_37_ * argument_38_) / 128.0F
			    - (float) (argument_35_ * 2))
			   / (float) (((GraphicsToolkit_Sub2) (((Class_s_Sub1) this)
							.aClass_ha_Sub2_5321))
				      .viewportW)) + -1.0F;
		fs[5] = ((float) argument_37_
			 / ((float) (((GraphicsToolkit_Sub2) (((Class_s_Sub1) this)
						       .aClass_ha_Sub2_5321))
				     .viewportH)
			    * ((float) ((Class_s) this).anInt2547 * 128.0F)));
		fs[6] = 0.0F;
		fs[1] = 0.0F;
		fs[8] = 0.0F;
		class350_sub2.method3860(0.0F, 0.0F, 0.0F, 0, 1.0F, 0.0F, 1.0F,
					 0.0F, 1.0F, 0.0F);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2151(111);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2222(11570);
		if ((((Class_s_Sub1) this).anInt5322 & 0x7) != 0) {
		    ((Class_s_Sub1) this).aClass_ha_Sub2_5321
			.method2172((byte) -68, true);
		    ((Class_s_Sub1) this).aClass_ha_Sub2_5321.applySunLightPosition(-116);
		} else
		    ((Class_s_Sub1) this).aClass_ha_Sub2_5321
			.method2172((byte) -68, false);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2238(-109,
								     false);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2130(anInterface4_Impl2_5349, 0, -119);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321
		    .method2130(anInterface4_Impl2_5344, 1, 125);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2179
		    (((Class_s_Sub1) this).aClass222_5348, (byte) -63);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2131
		    (anLocalInt / 3, 0, interface4_impl1, anLocalInt_43_,
		     -anLocalInt_43_ + 1 + anLocalInt_44_, true,
		     Class232.aClass390_1684);
		((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2238(-109,
								     true);
	    }
	}
    }
    
    final void method3540(int argument_56_, int argument_57_) {
	/* empty */
    }
    
    final void method3539(int argument_58_, int argument_59_, int argument_60_,
			  boolean[][] argument_61_, boolean argument_62_,
			  int argument_63_, int argument_64_) {
	method3545(argument_61_, 7, argument_62_, argument_60_, argument_63_,
		   argument_59_, argument_64_, argument_58_);
    }
    
    final void YA() {
	if (anInt5347 > 0) {
	    byte[][] anLocalInts = (new byte[((Class_s) this).anInt2550 + 1]
				    [((Class_s) this).anInt2549 + 1]);
	    for (int anLocalInt = 1; anLocalInt < ((Class_s) this).anInt2550;
		 anLocalInt++) {
		for (int anLocalInt_65_ = 1;
		     anLocalInt_65_ < ((Class_s) this).anInt2549;
		     anLocalInt_65_++)
		    anLocalInts[anLocalInt][anLocalInt_65_]
			= (byte) (((aByteArrayArray5343[anLocalInt]
				    [anLocalInt_65_ + 1])
				   >> 3)
				  + ((aByteArrayArray5343[anLocalInt]
				      [anLocalInt_65_ - 1])
				     >> 2)
				  + (((aByteArrayArray5343[anLocalInt + 1]
				       [anLocalInt_65_])
				      >> 3)
				     + ((aByteArrayArray5343[anLocalInt - 1]
					 [anLocalInt_65_])
					>> 2)
				     + ((aByteArrayArray5343[anLocalInt]
					 [anLocalInt_65_])
					>> 1)));
	    }
	    Node_Sub45[] class59_sub45s
		= new Node_Sub45[aJagexHashMap_5350.count()];
	    aJagexHashMap_5350.method1520(0, class59_sub45s);
	    for (int anLocalInt = 0; class59_sub45s.length > anLocalInt;
		 anLocalInt++)
		class59_sub45s[anLocalInt].method1091(127, anInt5347);
	    int anLocalInt = 20;
	    if (anIntArrayArrayArray5334 != null)
		anLocalInt += 4;
	    if ((((Class_s_Sub1) this).anInt5322 & 0x7) != 0)
		anLocalInt += 12;
	    NativeHeapBuffer nativeHeapBuffer
		= ((GraphicsToolkit_Sub2) ((Class_s_Sub1) this).aClass_ha_Sub2_5321)
		      .heap.safeAllocateBuffer(anInt5347 * 4, false);
	    NativeHeapBuffer nativeHeapBuffer_66_
		= ((GraphicsToolkit_Sub2) ((Class_s_Sub1) this).aClass_ha_Sub2_5321)
		      .heap
		      .safeAllocateBuffer(anLocalInt * anInt5347, false);
	    Stream stream = new Stream(nativeHeapBuffer_66_);
	    Stream stream_67_ = new Stream(nativeHeapBuffer);
	    Node_Sub45[] class59_sub45s_68_ = new Node_Sub45[anInt5347];
	    int anLocalInt_69_ = Class392.method4142(anInt5347 / 4, false);
	    if (anLocalInt_69_ < 1)
		anLocalInt_69_ = 1;
	    JagexHashMap jagexHashMap = new JagexHashMap(anLocalInt_69_);
	    Node_Sub45[] class59_sub45s_70_ = new Node_Sub45[anInt5345];
	    for (int anLocalInt_71_ = 0;
		 ((Class_s) this).anInt2550 > anLocalInt_71_;
		 anLocalInt_71_++) {
		for (int anLocalInt_72_ = 0;
		     ((Class_s) this).anInt2549 > anLocalInt_72_;
		     anLocalInt_72_++) {
		    if ((((Class_s_Sub1) this).anIntArrayArrayArray5339
			 [anLocalInt_71_][anLocalInt_72_])
			!= null) {
			Node_Sub45[] class59_sub45s_73_
			    = (aClass59_Sub45ArrayArrayArray5332
			       [anLocalInt_71_][anLocalInt_72_]);
			int[] anLocalInts_74_
			    = (((Class_s_Sub1) this).anIntArrayArrayArray5320
			       [anLocalInt_71_][anLocalInt_72_]);
			int[] anLocalInts_75_
			    = (((Class_s_Sub1) this).anIntArrayArrayArray5336
			       [anLocalInt_71_][anLocalInt_72_]);
			int[] anLocalInts_76_
			    = (anIntArrayArrayArray5324[anLocalInt_71_]
			       [anLocalInt_72_]);
			int[] anLocalInts_77_
			    = (((Class_s_Sub1) this).anIntArrayArrayArray5339
			       [anLocalInt_71_][anLocalInt_72_]);
			int[] anLocalInts_78_
			    = (anIntArrayArrayArray5326 != null
			       ? (anIntArrayArrayArray5326[anLocalInt_71_]
				  [anLocalInt_72_])
			       : null);
			int[] anLocalInts_79_
			    = (anIntArrayArrayArray5334 == null ? null
			       : (anIntArrayArrayArray5334[anLocalInt_71_]
				  [anLocalInt_72_]));
			if (anLocalInts_76_ == null)
			    anLocalInts_76_ = anLocalInts_77_;
			float f = (aFloatArrayArray5340[anLocalInt_71_]
				   [anLocalInt_72_]);
			float f_80_ = (aFloatArrayArray5341[anLocalInt_71_]
				       [anLocalInt_72_]);
			float f_81_ = (aFloatArrayArray5346[anLocalInt_71_]
				       [anLocalInt_72_]);
			float f_82_ = (aFloatArrayArray5340[anLocalInt_71_]
				       [anLocalInt_72_ + 1]);
			float f_83_ = (aFloatArrayArray5341[anLocalInt_71_]
				       [anLocalInt_72_ + 1]);
			float f_84_ = (aFloatArrayArray5346[anLocalInt_71_]
				       [anLocalInt_72_ + 1]);
			float f_85_ = (aFloatArrayArray5340[anLocalInt_71_ + 1]
				       [anLocalInt_72_ + 1]);
			float f_86_ = (aFloatArrayArray5341[anLocalInt_71_ + 1]
				       [anLocalInt_72_ + 1]);
			float f_87_ = (aFloatArrayArray5346[anLocalInt_71_ + 1]
				       [anLocalInt_72_ + 1]);
			float f_88_ = (aFloatArrayArray5340[anLocalInt_71_ + 1]
				       [anLocalInt_72_]);
			float f_89_ = (aFloatArrayArray5341[anLocalInt_71_ + 1]
				       [anLocalInt_72_]);
			float f_90_ = (aFloatArrayArray5346[anLocalInt_71_ + 1]
				       [anLocalInt_72_]);
			int anLocalInt_91_
			    = (anLocalInts[anLocalInt_71_][anLocalInt_72_]
			       & 0xff);
			int anLocalInt_92_
			    = (anLocalInts[anLocalInt_71_][anLocalInt_72_ + 1]
			       & 0xff);
			int anLocalInt_93_ = ((anLocalInts[anLocalInt_71_ + 1]
					       [anLocalInt_72_ + 1])
					      & 0xff);
			int anLocalInt_94_
			    = (anLocalInts[anLocalInt_71_ + 1][anLocalInt_72_]
			       & 0xff);
			int anLocalInt_95_ = 0;
		    while_217_:
			for (int anLocalInt_96_ = 0;
			     anLocalInt_96_ < anLocalInts_77_.length;
			     anLocalInt_96_++) {
			    Node_Sub45 class59_sub45
				= class59_sub45s_73_[anLocalInt_96_];
			    for (int anLocalInt_97_ = 0;
				 anLocalInt_97_ < anLocalInt_95_;
				 anLocalInt_97_++) {
				if (class59_sub45s_70_[anLocalInt_97_]
				    == class59_sub45)
				    continue while_217_;
			    }
			    class59_sub45s_70_[anLocalInt_95_++]
				= class59_sub45;
			}
			short[] anLocalInts_98_
			    = (((Class_s_Sub1) this).aShortArrayArray5330
				   [(((Class_s) this).anInt2550
				     * anLocalInt_72_) + anLocalInt_71_]
			       = new short[anLocalInts_77_.length]);
			for (int anLocalInt_99_ = 0;
			     anLocalInts_77_.length > anLocalInt_99_;
			     anLocalInt_99_++) {
			    int anLocalInt_100_
				= ((anLocalInt_71_
				    << ((Class_s) this).anInt2548)
				   + anLocalInts_74_[anLocalInt_99_]);
			    int anLocalInt_101_
				= ((anLocalInt_72_
				    << ((Class_s) this).anInt2548)
				   + anLocalInts_75_[anLocalInt_99_]);
			    int anLocalInt_102_ = anLocalInt_100_ >> anInt5337;
			    int anLocalInt_103_ = anLocalInt_101_ >> anInt5337;
			    int anLocalInt_104_
				= anLocalInts_77_[anLocalInt_99_];
			    int anLocalInt_105_
				= anLocalInts_76_[anLocalInt_99_];
			    int anLocalInt_106_
				= (anLocalInts_78_ != null
				   ? anLocalInts_78_[anLocalInt_99_] : 0);
			    long l = ((long) anLocalInt_105_ << 48
				      | (long) anLocalInt_104_ << 32
				      | (long) (anLocalInt_102_ << 16)
				      | (long) anLocalInt_103_);
			    int anLocalInt_107_
				= anLocalInts_74_[anLocalInt_99_];
			    int anLocalInt_108_
				= anLocalInts_75_[anLocalInt_99_];
			    int anLocalInt_109_ = 74;
			    int anLocalInt_110_ = 0;
			    float f_111_;
			    float f_112_;
			    float f_113_;
			    if (anLocalInt_107_ == 0 && anLocalInt_108_ == 0) {
				f_112_ = f;
				f_111_ = f_80_;
				f_113_ = f_81_;
				anLocalInt_109_ -= anLocalInt_91_;
			    } else if (anLocalInt_107_ != 0
				       || (((Class_s) this).anInt2547
					   != anLocalInt_108_)) {
				if ((anLocalInt_107_
				     == ((Class_s) this).anInt2547)
				    && (anLocalInt_108_
					== ((Class_s) this).anInt2547)) {
				    f_111_ = f_86_;
				    anLocalInt_109_ -= anLocalInt_93_;
				    f_112_ = f_85_;
				    f_113_ = f_87_;
				} else if ((anLocalInt_107_
					    != ((Class_s) this).anInt2547)
					   || anLocalInt_108_ != 0) {
				    float f_114_ = ((float) anLocalInt_107_
						    / (float) (((Class_s) this)
							       .anInt2547));
				    float f_115_ = ((float) anLocalInt_108_
						    / (float) (((Class_s) this)
							       .anInt2547));
				    float f_116_ = f + f_114_ * (f_88_ - f);
				    float f_117_
					= f_80_ + (-f_80_ + f_89_) * f_114_;
				    float f_118_
					= f_81_ + (f_90_ - f_81_) * f_114_;
				    float f_119_
					= (f_85_ - f_82_) * f_114_ + f_82_;
				    float f_120_
					= (f_86_ - f_83_) * f_114_ + f_83_;
				    f_111_
					= f_115_ * (f_120_ - f_117_) + f_117_;
				    float f_121_
					= f_114_ * (f_87_ - f_84_) + f_84_;
				    f_112_
					= (-f_116_ + f_119_) * f_115_ + f_116_;
				    f_113_
					= f_115_ * (-f_118_ + f_121_) + f_118_;
				    int anLocalInt_122_
					= (anLocalInt_91_
					   + (((anLocalInt_94_
						- anLocalInt_91_)
					       * anLocalInt_107_)
					      >> ((Class_s) this).anInt2548));
				    int anLocalInt_123_
					= (anLocalInt_92_
					   + (((anLocalInt_93_
						- anLocalInt_92_)
					       * anLocalInt_107_)
					      >> ((Class_s) this).anInt2548));
				    anLocalInt_109_
					-= ((((anLocalInt_123_
					       - anLocalInt_122_)
					      * anLocalInt_108_)
					     >> ((Class_s) this).anInt2548)
					    + anLocalInt_122_);
				} else {
				    anLocalInt_109_ -= anLocalInt_94_;
				    f_111_ = f_89_;
				    f_113_ = f_90_;
				    f_112_ = f_88_;
				}
			    } else {
				f_113_ = f_84_;
				f_112_ = f_82_;
				anLocalInt_109_ -= anLocalInt_92_;
				f_111_ = f_83_;
			    }
			    float f_124_ = 1.0F;
			    if (anLocalInt_104_ != -1) {
				int anLocalInt_125_
				    = (anLocalInt_109_ * (anLocalInt_104_
							  & 0x7f)
				       >> 7);
				if (anLocalInt_125_ < 2)
				    anLocalInt_125_ = 2;
				else if (anLocalInt_125_ > 126)
				    anLocalInt_125_ = 126;
				if ((((Class_s_Sub1) this).anInt5322 & 0x7)
				    == 0) {
				    f_124_ = ((((GraphicsToolkit_Sub2)
						(((Class_s_Sub1) this)
						 .aClass_ha_Sub2_5321))
					       .sunLight0Position[2]) * f_113_
					      + ((((GraphicsToolkit_Sub2)
						   (((Class_s_Sub1) this)
						    .aClass_ha_Sub2_5321))
						  .sunLight0Position[1]) * f_111_
						 + (f_112_
						    * (((GraphicsToolkit_Sub2)
							(((Class_s_Sub1) this)
							 .aClass_ha_Sub2_5321))
						       .sunLight0Position[0]))));
				    f_124_ = ((f_124_
					       * (!(f_124_ > 0.0F)
						  ? (((GraphicsToolkit_Sub2)
						      (((Class_s_Sub1) this)
						       .aClass_ha_Sub2_5321))
						     .sunLight1Intensity)
						  : (((GraphicsToolkit_Sub2)
						      (((Class_s_Sub1) this)
						       .aClass_ha_Sub2_5321))
						     .sunLight0Intensity)))
					      + (((GraphicsToolkit_Sub2)
						  (((Class_s_Sub1) this)
						   .aClass_ha_Sub2_5321))
						 .ambientModelIntensity));
				}
				anLocalInt_110_
				    = (HslToRgb.table
				       [(anLocalInt_125_
					 | anLocalInt_104_ & 0xff80)]);
			    }
			    Node node = null;
			    if ((anInt5333 - 1 & anLocalInt_100_) == 0
				&& (anLocalInt_101_ & anInt5333 - 1) == 0)
				node = jagexHashMap.get(l);
			    int anLocalInt_126_;
			    if (node != null) {
				anLocalInts_98_[anLocalInt_99_]
				    = ((Node_Sub39) (Node_Sub39)
                        node).aShort4197;
				anLocalInt_126_
				    = anLocalInts_98_[anLocalInt_99_] & 0xffff;
				if (anLocalInt_104_ != -1
				    && (((Node) (class59_sub45s_73_
						    [anLocalInt_99_])).hash
					< (((Node) (class59_sub45s_68_
						       [anLocalInt_126_]))
					   .hash)))
				    class59_sub45s_68_[anLocalInt_126_]
					= class59_sub45s_73_[anLocalInt_99_];
			    } else {
				int anLocalInt_127_;
				if (anLocalInt_104_ != anLocalInt_105_) {
				    int anLocalInt_128_
					= (anLocalInt_109_ * (anLocalInt_105_
							      & 0x7f)
					   >> 7);
				    if (anLocalInt_128_ >= 2) {
					if (anLocalInt_128_ > 126)
					    anLocalInt_128_ = 126;
				    } else
					anLocalInt_128_ = 2;
				    anLocalInt_127_
					= (HslToRgb.table
					   [(anLocalInt_128_
					     | anLocalInt_105_ & 0xff80)]);
				    if ((((Class_s_Sub1) this).anInt5322 & 0x7)
					== 0) {
					float f_129_
					    = ((((GraphicsToolkit_Sub2)
						 (((Class_s_Sub1) this)
						  .aClass_ha_Sub2_5321))
						.sunLight0Position[1]) * f_111_
					       + (((GraphicsToolkit_Sub2)
						   (((Class_s_Sub1) this)
						    .aClass_ha_Sub2_5321))
						  .sunLight0Position[0]) * f_112_
					       + ((((GraphicsToolkit_Sub2)
						    (((Class_s_Sub1) this)
						     .aClass_ha_Sub2_5321))
						   .sunLight0Position[2])
						  * f_113_));
					f_129_
					    = ((((GraphicsToolkit_Sub2)
						 (((Class_s_Sub1) this)
						  .aClass_ha_Sub2_5321))
						.ambientModelIntensity)
					       + (f_124_
						  * (f_124_ > 0.0F
						     ? (((GraphicsToolkit_Sub2)
							 (((Class_s_Sub1) this)
							  .aClass_ha_Sub2_5321))
							.sunLight0Intensity)
						     : (((GraphicsToolkit_Sub2)
							 (((Class_s_Sub1) this)
							  .aClass_ha_Sub2_5321))
							.sunLight1Intensity))));
					int anLocalInt_130_
					    = anLocalInt_127_ >> 16 & 0xff;
					int anLocalInt_131_
					    = anLocalInt_127_ >> 8 & 0xff;
					anLocalInt_130_ *= f_129_;
					int anLocalInt_132_
					    = anLocalInt_127_ & 0xff;
					anLocalInt_131_ *= f_129_;
					if (anLocalInt_130_ >= 0) {
					    if (anLocalInt_130_ > 255)
						anLocalInt_130_ = 255;
					} else
					    anLocalInt_130_ = 0;
					if (anLocalInt_131_ >= 0) {
					    if (anLocalInt_131_ > 255)
						anLocalInt_131_ = 255;
					} else
					    anLocalInt_131_ = 0;
					anLocalInt_132_ *= f_129_;
					if (anLocalInt_132_ < 0)
					    anLocalInt_132_ = 0;
					else if (anLocalInt_132_ > 255)
					    anLocalInt_132_ = 255;
					anLocalInt_127_
					    = (anLocalInt_132_
					       | (anLocalInt_131_ << 8
						  | anLocalInt_130_ << 16));
				    }
				} else
				    anLocalInt_127_ = anLocalInt_110_;
				if (!Stream.isBigEndian()) {
				    stream.writeFloatLE((float) anLocalInt_100_);
				    stream.writeFloatLE((float) (anLocalInt_106_ + (this.method3541(anLocalInt_101_, 0, anLocalInt_100_))));
				    stream.writeFloatLE((float) anLocalInt_101_);
				    stream.writeFloatLE((float) anLocalInt_100_);
				    stream.writeFloatLE((float) anLocalInt_101_);
				    if (anIntArrayArrayArray5334 != null)
					stream.writeFloatLE((float) (anLocalInts_79_ == null ? 0 : ((anLocalInts_79_[anLocalInt_99_]) - 1)));
				    if ((((Class_s_Sub1) this).anInt5322 & 0x7)
					!= 0) {
					stream.writeFloatLE(f_112_);
					stream.writeFloatLE(f_111_);
					stream.writeFloatLE(f_113_);
				    }
				} else {
				    stream.writeFloatBE((float) anLocalInt_100_);
				    stream.writeFloatBE((float) ((this.method3541(anLocalInt_101_, 0, anLocalInt_100_)) + anLocalInt_106_));
				    stream.writeFloatBE((float) anLocalInt_101_);
				    stream.writeFloatBE((float) anLocalInt_100_);
				    stream.writeFloatBE((float) anLocalInt_101_);
				    if (anIntArrayArrayArray5334 != null)
					stream.writeFloatBE((float) (anLocalInts_79_ != null ? (anLocalInts_79_[anLocalInt_99_]) - 1 : 0));
				    if ((((Class_s_Sub1) this).anInt5322 & 0x7)
					!= 0) {
					stream.writeFloatBE(f_112_);
					stream.writeFloatBE(f_111_);
					stream.writeFloatBE(f_113_);
				    }
				}
				if ((((GraphicsToolkit_Sub2) (((Class_s_Sub1) this)
						       .aClass_ha_Sub2_5321))
				     .anInt4774)
				    != 0)
				    stream_67_.writeRGBA(anLocalInt_127_ | ~0xffffff);
				else
				    stream_67_.writeIntLE(anLocalInt_127_ | ~0xffffff);
				anLocalInt_126_ = anInt5335++;
				anLocalInts_98_[anLocalInt_99_]
				    = (short) anLocalInt_126_;
				if (anLocalInt_104_ != -1)
				    class59_sub45s_68_[anLocalInt_126_]
					= class59_sub45s_73_[anLocalInt_99_];
				jagexHashMap.put(l, new Node_Sub39(anLocalInts_98_[anLocalInt_99_]));
			    }
			    for (int anLocalInt_133_ = 0;
				 anLocalInt_133_ < anLocalInt_95_;
				 anLocalInt_133_++)
				class59_sub45s_70_[anLocalInt_133_].method1096
				    (f_124_, anLocalInt_109_, anLocalInt_110_,
				     0, anLocalInt_126_);
			    anInt5323++;
			}
		    }
		}
	    }
	    for (int anLocalInt_134_ = 0; anInt5335 > anLocalInt_134_;
		 anLocalInt_134_++) {
		Node_Sub45 class59_sub45
		    = class59_sub45s_68_[anLocalInt_134_];
		if (class59_sub45 != null)
		    class59_sub45.method1093(110, anLocalInt_134_);
	    }
	    for (int anLocalInt_135_ = 0;
		 anLocalInt_135_ < ((Class_s) this).anInt2550;
		 anLocalInt_135_++) {
		for (int anLocalInt_136_ = 0;
		     ((Class_s) this).anInt2549 > anLocalInt_136_;
		     anLocalInt_136_++) {
		    short[] anLocalInts_137_
			= (((Class_s_Sub1) this).aShortArrayArray5330
			   [(((Class_s) this).anInt2550 * anLocalInt_136_
			     + anLocalInt_135_)]);
		    if (anLocalInts_137_ != null) {
			int anLocalInt_138_ = 0;
			int anLocalInt_139_ = 0;
			while (anLocalInts_137_.length > anLocalInt_139_) {
			    int anLocalInt_140_
				= anLocalInts_137_[anLocalInt_139_++] & 0xffff;
			    int anLocalInt_141_
				= anLocalInts_137_[anLocalInt_139_++] & 0xffff;
			    int anLocalInt_142_
				= anLocalInts_137_[anLocalInt_139_++] & 0xffff;
			    Node_Sub45 class59_sub45
				= class59_sub45s_68_[anLocalInt_140_];
			    Node_Sub45 class59_sub45_143_
				= class59_sub45s_68_[anLocalInt_141_];
			    Node_Sub45 class59_sub45_144_
				= class59_sub45s_68_[anLocalInt_142_];
			    Node_Sub45 class59_sub45_145_ = null;
			    if (class59_sub45 != null) {
				class59_sub45_145_ = class59_sub45;
				class59_sub45.method1094(anLocalInt_136_, 64,
							 anLocalInt_138_,
							 anLocalInt_135_);
			    }
			    if (class59_sub45_143_ != null) {
				class59_sub45_143_.method1094(anLocalInt_136_,
							      49,
							      anLocalInt_138_,
							      anLocalInt_135_);
				if (class59_sub45_145_ == null
				    || (((Node) class59_sub45_143_).hash
					< (((Node) class59_sub45_145_)
					   .hash)))
				    class59_sub45_145_ = class59_sub45_143_;
			    }
			    if (class59_sub45_144_ != null) {
				class59_sub45_144_.method1094(anLocalInt_136_,
							      47,
							      anLocalInt_138_,
							      anLocalInt_135_);
				if (class59_sub45_145_ == null
				    || (((Node) class59_sub45_144_).hash
					< (((Node) class59_sub45_145_)
					   .hash)))
				    class59_sub45_145_ = class59_sub45_144_;
			    }
			    if (class59_sub45_145_ != null) {
				if (class59_sub45 != null)
				    class59_sub45_145_
					.method1093(-68, anLocalInt_140_);
				if (class59_sub45_143_ != null)
				    class59_sub45_145_
					.method1093(-38, anLocalInt_141_);
				if (class59_sub45_144_ != null)
				    class59_sub45_145_
					.method1093(126, anLocalInt_142_);
				class59_sub45_145_.method1094(anLocalInt_136_,
							      96,
							      anLocalInt_138_,
							      anLocalInt_135_);
			    }
			    anLocalInt_138_++;
			}
		    }
		}
	    }
	    stream.upload();
	    stream_67_.upload();
	    anInterface4_Impl2_5344
		= ((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2248(0,
								       false);
	    anInterface4_Impl2_5344.method51(anInt5335 * 4, 4, -959, nativeHeapBuffer);
	    anInterface4_Impl2_5349
		= ((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2248(0,
								       false);
	    anInterface4_Impl2_5349.method51(anLocalInt * anInt5335,
					     anLocalInt, -959, nativeHeapBuffer_66_);
	    if ((((Class_s_Sub1) this).anInt5322 & 0x7) != 0) {
		if (anIntArrayArrayArray5334 == null)
		    ((Class_s_Sub1) this).aClass222_5348
			= (((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2134
			   ((new Class289[]
			     { new Class289(new InterleavedArrayElementEnum[]
					    { InterleavedArrayElementEnum.VERTEX_POINTER,
					      InterleavedArrayElementEnum.TEXCOORD_2D_POINTER,
					      InterleavedArrayElementEnum.NORMAL_POINTER}),
			       new Class289(InterleavedArrayElementEnum.COLOUR_POINTER) }),
			    (byte) -6));
		else
		    ((Class_s_Sub1) this).aClass222_5348
			= (((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2134
			   ((new Class289[]
			     { new Class289(new InterleavedArrayElementEnum[]
					    { InterleavedArrayElementEnum.VERTEX_POINTER,
					      InterleavedArrayElementEnum.TEXCOORD_2D_POINTER,
					      InterleavedArrayElementEnum.TEXCOORD_1D_POINTER,
					      InterleavedArrayElementEnum.NORMAL_POINTER}),
			       new Class289(InterleavedArrayElementEnum.COLOUR_POINTER) }),
			    (byte) -27));
	    } else if (anIntArrayArrayArray5334 == null)
		((Class_s_Sub1) this).aClass222_5348
		    = (((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2134
		       ((new Class289[]
			 { new Class289(new InterleavedArrayElementEnum[]
					{ InterleavedArrayElementEnum.VERTEX_POINTER,
					  InterleavedArrayElementEnum.TEXCOORD_2D_POINTER}),
			   new Class289(InterleavedArrayElementEnum.COLOUR_POINTER) }),
			(byte) -37));
	    else
		((Class_s_Sub1) this).aClass222_5348
		    = (((Class_s_Sub1) this).aClass_ha_Sub2_5321.method2134
		       ((new Class289[]
			 { new Class289(new InterleavedArrayElementEnum[]
					{ InterleavedArrayElementEnum.VERTEX_POINTER,
					  InterleavedArrayElementEnum.TEXCOORD_2D_POINTER,
					  InterleavedArrayElementEnum.TEXCOORD_1D_POINTER}),
			   new Class289(InterleavedArrayElementEnum.COLOUR_POINTER) }),
			(byte) -125));
	    int anLocalInt_146_ = 0;
	    for (int anLocalInt_147_ = 0;
		 class59_sub45s.length > anLocalInt_147_; anLocalInt_147_++) {
		if (((Node_Sub45) class59_sub45s[anLocalInt_147_]).anInt4274
		    > 0)
		    class59_sub45s[anLocalInt_146_++]
			= class59_sub45s[anLocalInt_147_];
	    }
	    aClass59_Sub45Array5342 = new Node_Sub45[anLocalInt_146_];
	    long[] ls = new long[anLocalInt_146_];
	    for (int anLocalInt_148_ = 0; anLocalInt_148_ < anLocalInt_146_;
		 anLocalInt_148_++) {
		Node_Sub45 class59_sub45 = class59_sub45s[anLocalInt_148_];
		ls[anLocalInt_148_] = ((Node) class59_sub45).hash;
		aClass59_Sub45Array5342[anLocalInt_148_] = class59_sub45;
		class59_sub45.method1092(4, anInt5335);
	    }
	    Node_Sub49.method1150(false, aClass59_Sub45Array5342, ls);
	    if (aClass232_5328 != null)
		aClass232_5328.method3087(-118);
	} else
	    aClass232_5328 = null;
	anIntArrayArrayArray5334 = null;
	aJagexHashMap_5350 = null;
	((Class_s_Sub1) this).anIntArrayArrayArray5339 = null;
	aByteArrayArray5343 = null;
	anIntArrayArrayArray5326 = null;
	anIntArrayArrayArray5324 = null;
	aClass59_Sub45ArrayArrayArray5332 = null;
	aFloatArrayArray5340 = aFloatArrayArray5341 = aFloatArrayArray5346
	    = null;
	((Class_s_Sub1) this).anIntArrayArrayArray5320
	    = ((Class_s_Sub1) this).anIntArrayArrayArray5336 = null;
    }
    
    final tia_sub_35DoublyLinked fa(int argument_149_, int argument_150_,
			tia_sub_35DoublyLinked argument_151_) {
	if ((aByteArrayArray5329[argument_149_][argument_150_] & 0x1) == 0)
	    return null;
	int anLocalInt
	    = (((Class_s) this).anInt2547
	       >> (((GraphicsToolkit_Sub2) ((Class_s_Sub1) this).aClass_ha_Sub2_5321)
		   .anInt4701));
	tia_sub_35_Sub1DoublyLinked var_tia_sub_35_Sub1 = (tia_sub_35_Sub1DoublyLinked) argument_151_;
	tia_sub_35_Sub1DoublyLinked var_tia_sub_35_Sub1_152_;
	if (var_tia_sub_35_Sub1 != null
	    && var_tia_sub_35_Sub1.method1223(anLocalInt, -1, anLocalInt)) {
	    var_tia_sub_35_Sub1_152_ = var_tia_sub_35_Sub1;
	    var_tia_sub_35_Sub1_152_.method1220(66);
	} else
	    var_tia_sub_35_Sub1_152_
		= new tia_sub_35_Sub1DoublyLinked((((Class_s_Sub1) this)
				       .aClass_ha_Sub2_5321),
				      anLocalInt, anLocalInt);
	var_tia_sub_35_Sub1_152_.method1221(anLocalInt, 0, 0, -25483,
					    anLocalInt);
	method3548((byte) -100, argument_149_, var_tia_sub_35_Sub1_152_,
		   argument_150_);
	return var_tia_sub_35_Sub1_152_;
    }
    
    final void method3538
	(int argument_153_, int argument_154_, int[] argument_155_,
	 int[] argument_156_, int[] argument_157_, int[] argument_158_,
	 int[] argument_159_, int[] argument_160_, int[] argument_161_,
	 int[] argument_162_, int[] argument_163_, int[] argument_164_,
	 int[] argument_165_, int argument_166_, int argument_167_,
	 int argument_168_, boolean argument_169_) {
	int anLocalInt = argument_162_.length;
	int[] anLocalInts = new int[anLocalInt * 3];
	int[] anLocalInts_170_ = new int[anLocalInt * 3];
	int[] anLocalInts_171_ = new int[anLocalInt * 3];
	int[] anLocalInts_172_ = new int[anLocalInt * 3];
	int[] anLocalInts_173_ = new int[anLocalInt * 3];
	int[] anLocalInts_174_ = new int[anLocalInt * 3];
	int[] anLocalInts_175_
	    = argument_156_ == null ? null : new int[anLocalInt * 3];
	int[] anLocalInts_176_
	    = argument_158_ != null ? new int[anLocalInt * 3] : null;
	int anLocalInt_177_ = 0;
	for (int anLocalInt_178_ = 0; anLocalInt_178_ < anLocalInt;
	     anLocalInt_178_++) {
	    int anLocalInt_179_ = argument_159_[anLocalInt_178_];
	    int anLocalInt_180_ = argument_160_[anLocalInt_178_];
	    int anLocalInt_181_ = argument_161_[anLocalInt_178_];
	    anLocalInts[anLocalInt_177_] = argument_155_[anLocalInt_179_];
	    anLocalInts_170_[anLocalInt_177_] = argument_157_[anLocalInt_179_];
	    anLocalInts_171_[anLocalInt_177_] = argument_162_[anLocalInt_178_];
	    anLocalInts_173_[anLocalInt_177_] = argument_164_[anLocalInt_178_];
	    anLocalInts_174_[anLocalInt_177_] = argument_165_[anLocalInt_178_];
	    anLocalInts_172_[anLocalInt_177_]
		= (argument_163_ != null ? argument_163_[anLocalInt_178_]
		   : argument_162_[anLocalInt_178_]);
	    if (argument_156_ != null)
		anLocalInts_175_[anLocalInt_177_]
		    = argument_156_[anLocalInt_179_];
	    if (argument_158_ != null)
		anLocalInts_176_[anLocalInt_177_]
		    = argument_158_[anLocalInt_179_];
	    anLocalInt_177_++;
	    anLocalInts[anLocalInt_177_] = argument_155_[anLocalInt_180_];
	    anLocalInts_170_[anLocalInt_177_] = argument_157_[anLocalInt_180_];
	    anLocalInts_171_[anLocalInt_177_] = argument_162_[anLocalInt_178_];
	    anLocalInts_173_[anLocalInt_177_] = argument_164_[anLocalInt_178_];
	    anLocalInts_174_[anLocalInt_177_] = argument_165_[anLocalInt_178_];
	    anLocalInts_172_[anLocalInt_177_]
		= (argument_163_ == null ? argument_162_[anLocalInt_178_]
		   : argument_163_[anLocalInt_178_]);
	    if (argument_156_ != null)
		anLocalInts_175_[anLocalInt_177_]
		    = argument_156_[anLocalInt_180_];
	    if (argument_158_ != null)
		anLocalInts_176_[anLocalInt_177_]
		    = argument_158_[anLocalInt_180_];
	    anLocalInt_177_++;
	    anLocalInts[anLocalInt_177_] = argument_155_[anLocalInt_181_];
	    anLocalInts_170_[anLocalInt_177_] = argument_157_[anLocalInt_181_];
	    anLocalInts_171_[anLocalInt_177_] = argument_162_[anLocalInt_178_];
	    anLocalInts_173_[anLocalInt_177_] = argument_164_[anLocalInt_178_];
	    anLocalInts_174_[anLocalInt_177_] = argument_165_[anLocalInt_178_];
	    anLocalInts_172_[anLocalInt_177_]
		= (argument_163_ == null ? argument_162_[anLocalInt_178_]
		   : argument_163_[anLocalInt_178_]);
	    if (argument_156_ != null)
		anLocalInts_175_[anLocalInt_177_]
		    = argument_156_[anLocalInt_181_];
	    if (argument_158_ != null)
		anLocalInts_176_[anLocalInt_177_]
		    = argument_158_[anLocalInt_181_];
	    anLocalInt_177_++;
	}
	U(argument_153_, argument_154_, anLocalInts, anLocalInts_175_,
	  anLocalInts_170_, anLocalInts_176_, anLocalInts_171_,
	  anLocalInts_172_, anLocalInts_173_, anLocalInts_174_, argument_166_,
	  argument_167_, argument_168_, argument_169_);
    }
    
    final void CA(tia_sub_35DoublyLinked argument_182_, int argument_183_,
		  int argument_184_, int argument_185_, int argument_186_,
		  boolean argument_187_) {
	if (aClass232_5328 != null && argument_182_ != null) {
	    int anLocalInt
		= (-((((GraphicsToolkit_Sub2)
		       ((Class_s_Sub1) this).aClass_ha_Sub2_5321).anInt4705
		      * argument_184_)
		     >> 8) + argument_183_
		   >> ((GraphicsToolkit_Sub2)
		       ((Class_s_Sub1) this).aClass_ha_Sub2_5321).anInt4701);
	    int anLocalInt_188_
		= (argument_185_ - (argument_184_ * (((GraphicsToolkit_Sub2)
						      (((Class_s_Sub1) this)
						       .aClass_ha_Sub2_5321))
						     .anInt4704)
				    >> 8)
		   >> ((GraphicsToolkit_Sub2)
		       ((Class_s_Sub1) this).aClass_ha_Sub2_5321).anInt4701);
	    aClass232_5328.method3090(54, anLocalInt, anLocalInt_188_,
				      argument_182_);
	}
    }
    
    final void method3536(HardwareLight argument_189_, int[] argument_190_) {
	aCyclicLinkedList_5325.add(new Node_Sub21((((Class_s_Sub1) this).aClass_ha_Sub2_5321), this, argument_189_, argument_190_));
    }
    
    Class_s_Sub1(GraphicsToolkit_Sub2 argument_191_, int argument_192_,
		 int argument_193_, int argument_194_, int argument_195_,
		 int[][] argument_196_, int[][] argument_197_,
		 int argument_198_) {
	super(argument_194_, argument_195_, argument_198_, argument_196_);
	aCyclicLinkedList_5325 = new CyclicLinkedList();
	((Class_s_Sub1) this).aClass_ha_Sub2_5321 = argument_191_;
	anInt5337 = ((Class_s) this).anInt2548 - 2;
	aFloatArrayArray5346 = (new float[((Class_s) this).anInt2550 + 1]
				[((Class_s) this).anInt2549 + 1]);
	aByteArrayArray5343 = new byte[argument_194_ + 1][argument_195_ + 1];
	anIntArrayArrayArray5324 = new int[argument_194_][argument_195_][];
	((Class_s_Sub1) this).anIntArrayArrayArray5339
	    = new int[argument_194_][argument_195_][];
	aClass59_Sub45ArrayArrayArray5332
	    = new Node_Sub45[argument_194_][argument_195_][];
	anInt5333 = 1 << anInt5337;
	aByteArrayArray5329 = new byte[argument_194_][argument_195_];
	aFloatArrayArray5341 = (new float[((Class_s) this).anInt2550 + 1]
				[((Class_s) this).anInt2549 + 1]);
	((Class_s_Sub1) this).anIntArrayArrayArray5320
	    = new int[argument_194_][argument_195_][];
	((Class_s_Sub1) this).anIntArrayArrayArray5336
	    = new int[argument_194_][argument_195_][];
	((Class_s_Sub1) this).anInt5322 = argument_193_;
	anIntArrayArrayArray5326 = new int[argument_194_][argument_195_][];
	aFloatArrayArray5340 = (new float[((Class_s) this).anInt2550 + 1]
				[((Class_s) this).anInt2549 + 1]);
	((Class_s_Sub1) this).aShortArrayArray5330
	    = new short[argument_195_ * argument_194_][];
	for (int anLocalInt = 0; ((Class_s) this).anInt2549 >= anLocalInt;
	     anLocalInt++) {
	    for (int anLocalInt_199_ = 0;
		 ((Class_s) this).anInt2550 >= anLocalInt_199_;
		 anLocalInt_199_++) {
		int anLocalInt_200_ = (((Class_s) this).anIntArrayArray2546
				       [anLocalInt_199_][anLocalInt]);
		if (aFloat5327 > (float) anLocalInt_200_)
		    aFloat5327 = (float) anLocalInt_200_;
		if (aFloat5338 < (float) anLocalInt_200_)
		    aFloat5338 = (float) anLocalInt_200_;
		if (anLocalInt_199_ > 0 && anLocalInt > 0
		    && anLocalInt_199_ < ((Class_s) this).anInt2550
		    && anLocalInt < ((Class_s) this).anInt2549) {
		    int anLocalInt_201_
			= (argument_197_[anLocalInt_199_ + 1][anLocalInt]
			   - argument_197_[anLocalInt_199_ - 1][anLocalInt]);
		    int anLocalInt_202_
			= (argument_197_[anLocalInt_199_][anLocalInt + 1]
			   - argument_197_[anLocalInt_199_][anLocalInt - 1]);
		    float f
			= (float) (1.0
				   / (Math.sqrt
				      ((double) ((anLocalInt_202_
						  * anLocalInt_202_)
						 + ((argument_198_ * 4
						     * argument_198_)
						    + (anLocalInt_201_
						       * anLocalInt_201_))))));
		    aFloatArrayArray5340[anLocalInt_199_][anLocalInt]
			= (float) anLocalInt_201_ * f;
		    aFloatArrayArray5341[anLocalInt_199_][anLocalInt]
			= f * (float) (-argument_198_ * 2);
		    aFloatArrayArray5346[anLocalInt_199_][anLocalInt]
			= (float) anLocalInt_202_ * f;
		}
	    }
	}
	aFloat5338++;
	aFloat5327--;
	aJagexHashMap_5350 = new JagexHashMap(128);
	if ((((Class_s_Sub1) this).anInt5322 & 0x10) != 0)
	    aClass232_5328
		= new Class232(((Class_s_Sub1) this).aClass_ha_Sub2_5321,
			       this);
    }
    
    final void wa(tia_sub_35DoublyLinked argument_203_, int argument_204_,
		  int argument_205_, int argument_206_, int argument_207_,
		  boolean argument_208_) {
	if (aClass232_5328 != null && argument_203_ != null) {
	    int anLocalInt
		= (argument_204_ - (argument_205_ * (((GraphicsToolkit_Sub2)
						      (((Class_s_Sub1) this)
						       .aClass_ha_Sub2_5321))
						     .anInt4705)
				    >> 8)
		   >> ((GraphicsToolkit_Sub2)
		       ((Class_s_Sub1) this).aClass_ha_Sub2_5321).anInt4701);
	    int anLocalInt_209_
		= (argument_206_ - (argument_205_ * (((GraphicsToolkit_Sub2)
						      (((Class_s_Sub1) this)
						       .aClass_ha_Sub2_5321))
						     .anInt4704)
				    >> 8)
		   >> ((GraphicsToolkit_Sub2)
		       ((Class_s_Sub1) this).aClass_ha_Sub2_5321).anInt4701);
	    aClass232_5328.method3093(anLocalInt_209_, argument_203_, true,
				      anLocalInt);
	}
    }
    
    static final void method3546(int argument, byte argument_210_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(9, 13175, (long) argument);
	class59_sub51_sub3.method1181(585134072);
    }
    
    static final int method3547(int argument, int argument_211_,
				int argument_212_) {
	int anLocalInt = argument_211_ * argument + argument_212_;
	anLocalInt = anLocalInt << 13 ^ anLocalInt;
	int anLocalInt_213_ = (anLocalInt * (anLocalInt * (anLocalInt * 15731)
					     + 789221) + 1376312589
			       & 0x7fffffff);
	return anLocalInt_213_ >> 19 & 0xff;
    }
    
    private final void method3548(byte argument_214_, int argument_215_,
				  tia_sub_35_Sub1DoublyLinked argument_216_,
				  int argument_217_) {
	int[] anLocalInts = (((Class_s_Sub1) this).anIntArrayArrayArray5320
			     [argument_215_][argument_217_]);
	int[] anLocalInts_218_
	    = (((Class_s_Sub1) this).anIntArrayArrayArray5336[argument_215_]
	       [argument_217_]);
	int anLocalInt = anLocalInts.length;
	if (anLocalInt > Statics.anIntArray97.length) {
	    Statics.anIntArray97 = new int[anLocalInt];
	    Class314.anIntArray2601 = new int[anLocalInt];
	}
	for (int anLocalInt_219_ = 0; anLocalInt > anLocalInt_219_;
	     anLocalInt_219_++) {
	    Statics.anIntArray97[anLocalInt_219_]
		= (anLocalInts[anLocalInt_219_]
		   >> ((GraphicsToolkit_Sub2)
		       ((Class_s_Sub1) this).aClass_ha_Sub2_5321).anInt4701);
	    Class314.anIntArray2601[anLocalInt_219_]
		= (anLocalInts_218_[anLocalInt_219_]
		   >> ((GraphicsToolkit_Sub2)
		       ((Class_s_Sub1) this).aClass_ha_Sub2_5321).anInt4701);
	}
	int anLocalInt_220_ = 0;
	while (anLocalInt > anLocalInt_220_) {
	    int anLocalInt_221_ = Statics.anIntArray97[anLocalInt_220_];
	    int anLocalInt_222_ = Class314.anIntArray2601[anLocalInt_220_++];
	    int anLocalInt_223_ = Statics.anIntArray97[anLocalInt_220_];
	    int anLocalInt_224_ = Class314.anIntArray2601[anLocalInt_220_++];
	    int anLocalInt_225_ = Statics.anIntArray97[anLocalInt_220_];
	    int anLocalInt_226_ = Class314.anIntArray2601[anLocalInt_220_++];
	    if (((anLocalInt_224_ - anLocalInt_226_) * (anLocalInt_221_
							- anLocalInt_223_)
		 - (anLocalInt_224_ - anLocalInt_222_) * (-anLocalInt_223_
							  + anLocalInt_225_))
		> 0)
		argument_216_.method1217(anLocalInt_225_, anLocalInt_221_,
					 anLocalInt_224_, anLocalInt_222_,
					 anLocalInt_223_, anLocalInt_226_,
					 29167);
	}
	if (argument_214_ != -100)
	    method3538(93, 34, null, null, null, null, null, null, null, null,
		       null, null, null, 28, 92, 64, false);
    }
    
    final void U(int argument_227_, int argument_228_, int[] argument_229_,
		 int[] argument_230_, int[] argument_231_, int[] argument_232_,
		 int[] argument_233_, int[] argument_234_, int[] argument_235_,
		 int[] argument_236_, int argument_237_, int argument_238_,
		 int argument_239_, boolean argument_240_) {
	TextureSource textureSource
	    = (((GraphicsToolkit) ((Class_s_Sub1) this).aClass_ha_Sub2_5321)
	       .textureSource);
	if (argument_232_ != null && anIntArrayArrayArray5334 == null)
	    anIntArrayArrayArray5334 = (new int[((Class_s) this).anInt2550]
					[((Class_s) this).anInt2549][]);
	if (argument_230_ != null && anIntArrayArrayArray5326 == null)
	    anIntArrayArrayArray5326 = (new int[((Class_s) this).anInt2550]
					[((Class_s) this).anInt2549][]);
	((Class_s_Sub1) this).anIntArrayArrayArray5320[argument_227_]
	    [argument_228_]
	    = argument_229_;
	((Class_s_Sub1) this).anIntArrayArrayArray5336[argument_227_]
	    [argument_228_]
	    = argument_231_;
	((Class_s_Sub1) this).anIntArrayArrayArray5339[argument_227_]
	    [argument_228_]
	    = argument_233_;
	anIntArrayArrayArray5324[argument_227_][argument_228_] = argument_234_;
	if (anIntArrayArrayArray5334 != null)
	    anIntArrayArrayArray5334[argument_227_][argument_228_]
		= argument_232_;
	if (anIntArrayArrayArray5326 != null)
	    anIntArrayArrayArray5326[argument_227_][argument_228_]
		= argument_230_;
	Node_Sub45[] class59_sub45s
	    = (aClass59_Sub45ArrayArrayArray5332[argument_227_][argument_228_]
	       = new Node_Sub45[argument_233_.length]);
	for (int anLocalInt = 0; argument_233_.length > anLocalInt;
	     anLocalInt++) {
	    int anLocalInt_241_ = argument_235_[anLocalInt];
	    int anLocalInt_242_ = argument_236_[anLocalInt];
	    if ((((Class_s_Sub1) this).anInt5322 & 0x20) != 0
		&& anLocalInt_241_ != -1
		&& (((TextureDescriptor) textureSource.getDescriptor(anLocalInt_241_, true))
		    .aBoolean836)) {
		anLocalInt_242_ = 128;
		anLocalInt_241_ = -1;
	    }
	    long l
		= ((long) argument_237_ << 28
		   | ((long) argument_239_ << 48 | (long) argument_238_ << 42)
		   | (long) (anLocalInt_242_ << 14) | (long) anLocalInt_241_);
	    Node node;
	    for (node = aJagexHashMap_5350.get(l); node != null;
		 node = aJagexHashMap_5350.method1526()) {
		Node_Sub45 class59_sub45 = (Node_Sub45) node;
		if ((anLocalInt_241_
		     == ((Node_Sub45) class59_sub45).anInt4260)
		    && ((float) anLocalInt_242_
			== ((Node_Sub45) class59_sub45).aFloat4262)
		    && (argument_237_
			== ((Node_Sub45) class59_sub45).anInt4266)
		    && (((Node_Sub45) class59_sub45).anInt4276
			== argument_238_)
		    && (((Node_Sub45) class59_sub45).anInt4258
			== argument_239_))
		    break;
	    }
	    if (node != null)
		class59_sub45s[anLocalInt] = (Node_Sub45) node;
	    else {
		class59_sub45s[anLocalInt]
		    = new Node_Sub45(this, anLocalInt_241_, anLocalInt_242_,
					argument_237_, argument_238_,
					argument_239_);
		aJagexHashMap_5350.put(l, class59_sub45s[anLocalInt]);
	    }
	}
	if (argument_240_)
	    aByteArrayArray5329[argument_227_][argument_228_]
		= (byte) MathStatics.OR((aByteArrayArray5329[argument_227_][argument_228_]), 1);
	if (argument_233_.length > anInt5345)
	    anInt5345 = argument_233_.length;
	anInt5347 += argument_233_.length;
    }
}
