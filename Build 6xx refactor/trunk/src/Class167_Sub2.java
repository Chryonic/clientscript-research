/* Class167_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class167_Sub2 extends Class167
{
    private Class38[] aClass38Array5145;
    private int[][] anIntArrayArray5146;
    private boolean aBoolean5147;
    private int anInt5148;
    private short[] aShortArray5149;
    private int anInt5150;
    private boolean aBoolean5151 = false;
    private int anInt5152;
    private short[] aShortArray5153;
    private short[] aShortArray5154;
    private int anInt5155;
    private Class163[] aClass163Array5156;
    private boolean aBoolean5157;
    private Class247 aClass247_5158;
    private int anInt5159;
    private byte[] aByteArray5160;
    private float[] aFloatArray5161;
    private short[] aShortArray5162;
    private int[] anIntArray5163;
    private int anInt5164;
    static Class149 aClass149_5165 = new Class149(32);
    private short[] aShortArray5166;
    private int[] anIntArray5167;
    private short[] aShortArray5168;
    private int anInt5169;
    private boolean aBoolean5170 = true;
    private Class284 aClass284_5172;
    private Class206 aClass206_5173;
    private short[] aShortArray5174;
    private float[] aFloatArray5175;
    private int[][] anIntArrayArray5176;
    private Class247 aClass247_5177;
    private int anInt5178;
    private int[][] anIntArrayArray5179;
    private boolean aBoolean5180;
    private int[] anIntArray5181;
    private int anInt5182;
    private short[] aShortArray5183;
    private byte[] aByteArray5184;
    private int anInt5185;
    private int anInt5186;
    private short[] aShortArray5187;
    private short aShort5188;
    private int[] anIntArray5189;
    private short[] aShortArray5190;
    private Class247 aClass247_5191;
    private int anInt5192;
    private int[] anIntArray5193;
    private GraphicsToolkit_Sub2 aClass_ha_Sub2_5194;
    private int anInt5195;
    private short[] aShortArray5196;
    private short[] aShortArray5197;
    private short[] aShortArray5198;
    private Class247 aClass247_5199;
    private int anInt5200;
    private int anInt5201;
    private int[] anIntArray5202;
    private Class55[] aClass55Array5203;
    private short aShort5204;
    private int anInt5205;
    private Class185[] aClass185Array5206;
    private int[] anIntArray5207;
    
    final void method2652() {
	if (anInt5186 > 0 && anInt5169 > 0) {
	    method2697((byte) -107);
	    method2711(0);
	    method2710((byte) 35);
	}
    }
    
    private final boolean method2697(byte argument_0_) {
	boolean anLocalBoolean = !((Class247) aClass247_5158).aBoolean1794;
	boolean anLocalBoolean_1_
	    = ((anInt5201 & 0x37) != 0
	       && !((Class247) aClass247_5177).aBoolean1794);
	boolean anLocalBoolean_2_ = !((Class247) aClass247_5199).aBoolean1794;
	boolean anLocalBoolean_3_ = !((Class247) aClass247_5191).aBoolean1794;
	if (!anLocalBoolean_2_ && !anLocalBoolean && !anLocalBoolean_1_
	    && !anLocalBoolean_3_)
	    return true;
	boolean anLocalBoolean_4_ = true;
	if (anLocalBoolean_2_) {
	    if (((Class247) aClass247_5199).anInterface4_Impl2_1795 == null)
		((Class247) aClass247_5199).anInterface4_Impl2_1795
		    = aClass_ha_Sub2_5194.method2248(0, aBoolean5180);
	    Interface4_Impl2 interface4_impl2
		= ((Class247) aClass247_5199).anInterface4_Impl2_1795;
	    interface4_impl2.method52(anInt5186 * 12, 12, -10760);
	    Buffer buffer = interface4_impl2.method50(true, true);
	    if (buffer == null)
		anLocalBoolean_4_ = false;
	    else {
		((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aNativeInterface4675
		    .copyPositions
		    (anIntArray5163, anIntArray5193, anIntArray5189,
		     aShortArray5153, 0, 12, anInt5186,
		     buffer.getAddress());
		if (!interface4_impl2.method53(10925))
		    anLocalBoolean_4_ = false;
		else {
		    ((Class247) aClass247_5199).anInterface4_Impl2_1797
			= interface4_impl2;
		    ((Class247) aClass247_5199).aBoolean1794 = true;
		}
	    }
	}
	if (argument_0_ >= -45)
	    LA(-124);
	if (anLocalBoolean) {
	    if (((Class247) aClass247_5158).anInterface4_Impl2_1795 == null)
		((Class247) aClass247_5158).anInterface4_Impl2_1795
		    = aClass_ha_Sub2_5194.method2248(0, aBoolean5180);
	    Interface4_Impl2 interface4_impl2
		= ((Class247) aClass247_5158).anInterface4_Impl2_1795;
	    interface4_impl2.method52(anInt5186 * 4, 4, -10760);
	    Buffer buffer = interface4_impl2.method50(true, true);
	    if (buffer != null) {
		if ((anInt5201 & 0x37) != 0)
		    ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
			.aNativeInterface4675.copyColours
			(aShortArray5168, aByteArray5184, aShortArray5190,
			 aShort5204, aShortArray5154, 0, 4, anInt5186,
			 buffer.getAddress());
		else {
		    byte[] anLocalInts;
		    short[] anLocalInts_5_;
		    short[] anLocalInts_6_;
		    short[] anLocalInts_7_;
		    if (aClass284_5172 == null) {
			anLocalInts_6_ = aShortArray5197;
			anLocalInts_5_ = aShortArray5187;
			anLocalInts = aByteArray5160;
			anLocalInts_7_ = aShortArray5166;
		    } else {
			anLocalInts
			    = ((Class284) aClass284_5172).aByteArray2282;
			anLocalInts_5_
			    = ((Class284) aClass284_5172).aShortArray2281;
			anLocalInts_6_
			    = ((Class284) aClass284_5172).aShortArray2284;
			anLocalInts_7_
			    = ((Class284) aClass284_5172).aShortArray2278;
		    }
		    ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
			.aNativeInterface4675.copyLighting
			(aShortArray5168, aByteArray5184, aShortArray5190,
			 anLocalInts_7_, anLocalInts_5_, anLocalInts_6_,
			 anLocalInts, aShort5204, aShort5188, aShortArray5154,
			 0, 4, anInt5186, buffer.getAddress());
		}
		if (interface4_impl2.method53(10925)) {
		    ((Class247) aClass247_5158).aBoolean1794 = true;
		    ((Class247) aClass247_5158).anInterface4_Impl2_1797
			= interface4_impl2;
		} else
		    anLocalBoolean_4_ = false;
	    } else
		anLocalBoolean_4_ = false;
	}
	if (anLocalBoolean_1_) {
	    if (((Class247) aClass247_5177).anInterface4_Impl2_1795 == null)
		((Class247) aClass247_5177).anInterface4_Impl2_1795
		    = aClass_ha_Sub2_5194.method2248(0, aBoolean5180);
	    Interface4_Impl2 interface4_impl2
		= ((Class247) aClass247_5177).anInterface4_Impl2_1795;
	    interface4_impl2.method52(anInt5186 * 12, 12, -10760);
	    Buffer buffer = interface4_impl2.method50(true, true);
	    if (buffer != null) {
		byte[] anLocalInts;
		short[] anLocalInts_8_;
		short[] anLocalInts_9_;
		short[] anLocalInts_10_;
		if (aClass284_5172 == null) {
		    anLocalInts_10_ = aShortArray5197;
		    anLocalInts_8_ = aShortArray5187;
		    anLocalInts_9_ = aShortArray5166;
		    anLocalInts = aByteArray5160;
		} else {
		    anLocalInts = ((Class284) aClass284_5172).aByteArray2282;
		    anLocalInts_8_
			= ((Class284) aClass284_5172).aShortArray2281;
		    anLocalInts_9_
			= ((Class284) aClass284_5172).aShortArray2278;
		    anLocalInts_10_
			= ((Class284) aClass284_5172).aShortArray2284;
		}
		((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aNativeInterface4675
		    .copyNormals
		    (anLocalInts_9_, anLocalInts_8_, anLocalInts_10_,
		     anLocalInts, 3.0F / (float) aShort5188,
		     3.0F / (float) (aShort5188 + aShort5188 / 2), 0, 12,
		     anInt5186, buffer.getAddress());
		if (interface4_impl2.method53(10925)) {
		    ((Class247) aClass247_5177).aBoolean1794 = true;
		    ((Class247) aClass247_5177).anInterface4_Impl2_1797
			= interface4_impl2;
		} else
		    anLocalBoolean_4_ = false;
	    } else
		anLocalBoolean_4_ = false;
	}
	if (anLocalBoolean_3_) {
	    if (((Class247) aClass247_5191).anInterface4_Impl2_1795 == null)
		((Class247) aClass247_5191).anInterface4_Impl2_1795
		    = aClass_ha_Sub2_5194.method2248(0, aBoolean5180);
	    Interface4_Impl2 interface4_impl2
		= ((Class247) aClass247_5191).anInterface4_Impl2_1795;
	    interface4_impl2.method52(anInt5186 * 8, 8, -10760);
	    Buffer buffer = interface4_impl2.method50(true, true);
	    if (buffer == null)
		anLocalBoolean_4_ = false;
	    else {
		((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aNativeInterface4675
		    .copyTexCoords
		    (aFloatArray5161, aFloatArray5175, 0, 8, anInt5186,
		     buffer.getAddress());
		if (!interface4_impl2.method53(10925))
		    anLocalBoolean_4_ = false;
		else {
		    ((Class247) aClass247_5191).aBoolean1794 = true;
		    ((Class247) aClass247_5191).anInterface4_Impl2_1797
			= interface4_impl2;
		}
	    }
	}
	return anLocalBoolean_4_;
    }
    
    final int V() {
	if (!aBoolean5157)
	    method2714(40);
	return anInt5185;
    }
    
    final int WA() {
	return aShort5204;
    }
    
    final void O(int argument_11_, int argument_12_, int argument_13_) {
	for (int anLocalInt = 0; anInt5200 > anLocalInt; anLocalInt++) {
	    if (argument_11_ != 128)
		anIntArray5163[anLocalInt]
		    = argument_11_ * anIntArray5163[anLocalInt] >> 7;
	    if (argument_12_ != 128)
		anIntArray5193[anLocalInt]
		    = anIntArray5193[anLocalInt] * argument_12_ >> 7;
	    if (argument_13_ != 128)
		anIntArray5189[anLocalInt]
		    = anIntArray5189[anLocalInt] * argument_13_ >> 7;
	}
	method2705(true);
	aBoolean5157 = false;
    }
    
    static final void method2698(Node_Sub7 argument, Class299 argument_14_,
				 GraphicsToolkit argument_15_, int argument_16_) {
	Class368 class368 = argument_14_.method3528(argument_15_, (byte) 2);
	if (class368 != null) {
	    int anLocalInt = class368.method4019();
	    if (anLocalInt < class368.method4022())
		anLocalInt = class368.method4022();
	    int anLocalInt_17_ = 10;
	    int anLocalInt_18_ = ((Node_Sub7) argument).anInt3916;
	    int anLocalInt_19_ = ((Node_Sub7) argument).anInt3919;
	    int anLocalInt_20_ = 0;
	    int anLocalInt_21_ = 0;
	    int anLocalInt_22_ = 0;
	    if (((Class299) argument_14_).aString2478 != null) {
		anLocalInt_20_ = (BufferedFile.aClass76_2753.method1562
				  (null, DxSkybox.aStringArray4476, null,
				   ((Class299) argument_14_).aString2478, -1));
		for (int anLocalInt_23_ = 0; anLocalInt_23_ < anLocalInt_20_;
		     anLocalInt_23_++) {
		    String string
			= DxSkybox.aStringArray4476[anLocalInt_23_];
		    if (anLocalInt_20_ - 1 > anLocalInt_23_)
			string = string.substring(0, string.length() - 4);
		    int anLocalInt_24_
			= Class97.aClass244_757.method3162(string);
		    if (anLocalInt_21_ < anLocalInt_24_)
			anLocalInt_21_ = anLocalInt_24_;
		}
		anLocalInt_22_
		    = (Class97.aClass244_757.method3161() * anLocalInt_20_
		       + Class97.aClass244_757.method3165() / 2);
	    }
	    int anLocalInt_25_
		= ((Node_Sub7) argument).anInt3916 + anLocalInt / 2;
	    if (Class179.anInt1341 + anLocalInt > anLocalInt_18_) {
		anLocalInt_18_ = Class179.anInt1341;
		anLocalInt_25_
		    = (anLocalInt_21_ / 2 + Class179.anInt1341
		       - (-(anLocalInt / 2) - (anLocalInt_17_ + 5)));
	    } else if (anLocalInt_18_ > Class179.anInt1348 - anLocalInt) {
		anLocalInt_25_ = -anLocalInt_17_ - 5 + (-(anLocalInt / 2)
							+ Class179.anInt1348
							- anLocalInt_21_ / 2);
		anLocalInt_18_ = -anLocalInt + Class179.anInt1348;
	    }
	    int anLocalInt_26_ = ((Node_Sub7) argument).anInt3919;
	    if (anLocalInt_19_ >= Class179.anInt1336 + anLocalInt) {
		if (-anLocalInt + Class179.anInt1356 < anLocalInt_19_) {
		    anLocalInt_19_ = -anLocalInt + Class179.anInt1356;
		    anLocalInt_26_
			= -(anLocalInt / 2) + (Class179.anInt1356
					       + (-anLocalInt_17_
						  - anLocalInt_22_));
		}
	    } else {
		anLocalInt_26_
		    = anLocalInt / 2 + (Class179.anInt1336 + anLocalInt_17_);
		anLocalInt_19_ = Class179.anInt1336;
	    }
	    int anLocalInt_27_
		= ((int) (Math.atan2((double) (-(((Node_Sub7) argument)
						 .anInt3916)
					       + anLocalInt_18_),
				     (double) (anLocalInt_19_
					       - (((Node_Sub7) argument)
						  .anInt3919)))
			  / 3.141592653589793 * 32767.0)
		   & 0xffff);
	    class368.method4021(((float) anLocalInt / 2.0F
				 + (float) anLocalInt_18_),
				((float) anLocalInt_19_
				 + (float) anLocalInt / 2.0F),
				4096, anLocalInt_27_);
	    int anLocalInt_28_ = -2;
	    int anLocalInt_29_ = -2;
	    int anLocalInt_30_ = -2;
	    int anLocalInt_31_ = -2;
	    if (((Class299) argument_14_).aString2478 != null) {
		anLocalInt_29_ = anLocalInt_26_;
		anLocalInt_28_ = anLocalInt_25_ - 5 - anLocalInt_21_ / 2;
		anLocalInt_31_
		    = (anLocalInt_20_ * Class97.aClass244_757.method3161()
		       + anLocalInt_29_ + 3);
		anLocalInt_30_ = anLocalInt_28_ + anLocalInt_21_ + 10;
		if (((Class299) argument_14_).anInt2516 != 0)
		    argument_15_.method2020(29,
					    anLocalInt_30_ - anLocalInt_28_,
					    anLocalInt_29_,
					    -anLocalInt_29_ + anLocalInt_31_,
					    anLocalInt_28_,
					    (((Class299) argument_14_)
					     .anInt2516));
		if (((Class299) argument_14_).anInt2511 != 0)
		    argument_15_.method2028(anLocalInt_29_, (byte) 40,
					    -anLocalInt_29_ + anLocalInt_31_,
					    (((Class299) argument_14_)
					     .anInt2511),
					    anLocalInt_28_,
					    anLocalInt_30_ - anLocalInt_28_);
		for (int anLocalInt_32_ = 0; anLocalInt_32_ < anLocalInt_20_;
		     anLocalInt_32_++) {
		    String string
			= DxSkybox.aStringArray4476[anLocalInt_32_];
		    if (anLocalInt_20_ - 1 > anLocalInt_32_)
			string = string.substring(0, string.length() - 4);
		    Class97.aClass244_757.method3164(argument_15_, string,
						     anLocalInt_25_,
						     anLocalInt_26_,
						     (((Class299) argument_14_)
						      .anInt2510),
						     true);
		    anLocalInt_26_ += Class97.aClass244_757.method3161();
		}
	    }
	    if (((Class299) argument_14_).anInt2509 != -1
		|| ((Class299) argument_14_).aString2478 != null) {
		anLocalInt >>= 1;
		Node_Sub8 class59_sub8 = new Node_Sub8(argument);
		((Node_Sub8) class59_sub8).anInt3923 = anLocalInt_30_;
		((Node_Sub8) class59_sub8).anInt3922
		    = anLocalInt + anLocalInt_19_;
		((Node_Sub8) class59_sub8).anInt3929 = anLocalInt_28_;
		((Node_Sub8) class59_sub8).anInt3921
		    = anLocalInt_18_ + anLocalInt;
		((Node_Sub8) class59_sub8).anInt3927
		    = -anLocalInt + anLocalInt_19_;
		((Node_Sub8) class59_sub8).anInt3925
		    = -anLocalInt + anLocalInt_18_;
		((Node_Sub8) class59_sub8).anInt3928 = anLocalInt_31_;
		((Node_Sub8) class59_sub8).anInt3924 = anLocalInt_29_;
		Statics.aCyclicLinkedList_429.add(class59_sub8);
	    }
	}
    }
    
    final void method2699(int argument_33_) {
	if (aClass247_5199 != null)
	    aClass247_5199.method3201(-16578);
	if (aClass247_5191 != null)
	    aClass247_5191.method3201(-16578);
	if (aClass247_5158 != null)
	    aClass247_5158.method3201(-16578);
	if (aClass247_5177 != null)
	    aClass247_5177.method3201(-16578);
	if (aClass206_5173 != null)
	    aClass206_5173.method2942(-9764);
    }
    
    final boolean method2653() {
	if (aShortArray5190 == null)
	    return true;
	for (int anLocalInt = 0; aShortArray5190.length > anLocalInt;
	     anLocalInt++) {
	    if (aShortArray5190[anLocalInt] != -1
		&& !((GraphicsToolkit) aClass_ha_Sub2_5194).textureSource
			.method9(true, aShortArray5190[anLocalInt]))
		return false;
	}
	return true;
    }
    
    private final void method2700(byte argument_34_) {
	if (aClass55Array5203 != null) {
	    aClass_ha_Sub2_5194.C(!aBoolean5151);
	    aClass_ha_Sub2_5194.method2172((byte) -68, false);
	    aClass_ha_Sub2_5194.method2229((byte) 99,
					   GlMultiTexSourceEnum.CONSTANT, 1);
	    aClass_ha_Sub2_5194.method2224(1, GlMultiTexSourceEnum.CONSTANT,
					   -105);
	    for (int anLocalInt = 0; anInt5159 > anLocalInt; anLocalInt++) {
		Class55 class55 = aClass55Array5203[anLocalInt];
		Class163 class163 = aClass163Array5156[anLocalInt];
		if (!((Class55) class55).aBoolean399
		    || !aClass_ha_Sub2_5194.method2019()) {
		    float f
			= (float) (anIntArray5163[((Class55) class55).anInt397]
				   + (anIntArray5163
				      [((Class55) class55).anInt404])
				   + anIntArray5163[(((Class55) class55)
						     .anInt398)]) * 0.3333333F;
		    float f_35_
			= (float) (anIntArray5193[((Class55) class55).anInt397]
				   + (anIntArray5193
				      [((Class55) class55).anInt404])
				   + anIntArray5193[(((Class55) class55)
						     .anInt398)]) * 0.3333333F;
		    float f_36_
			= ((float) ((anIntArray5189
				     [((Class55) class55).anInt398])
				    + ((anIntArray5189
					[((Class55) class55).anInt397])
				       + (anIntArray5189
					  [((Class55) class55).anInt404])))
			   * 0.3333333F);
		    float f_37_ = (f_36_ * Class261.aFloat2038
				   + (f_35_ * LoadingBar.aFloat1360
				      + f * Class256_Sub3.aFloat5628)
				   + Class189.aFloat3620);
		    float f_38_ = (Node_Sub13.aFloat3977 * f_36_
				   + (f * Class62_Sub1.aFloat4364
				      + Class123.aFloat1001 * f_35_)
				   + Class159.aFloat3670);
		    float f_39_
			= (Class174.aFloat3441
			   + (f_35_ * Node_Sub31_Sub4.aFloat5854
			      + Statics.aFloat5558 * f
			      + f_36_ * Statics.aFloat6147));
		    float f_40_
			= ((float) (1.0
				    / Math.sqrt((double) (f_39_ * f_39_
							  + (f_38_ * f_38_
							     + (f_37_
								* f_37_)))))
			   * (float) ((Class55) class55).anInt400);
		    Class350_Sub2 class350_sub2
			= aClass_ha_Sub2_5194.method2187((byte) 92);
		    class350_sub2.method3861
			(((Class163) class163).anInt1194,
			 ((float) ((Class163) class163).anInt1193 + f_38_
			  - f_38_ * f_40_),
			 true,
			 (f_37_ + (float) ((Class163) class163).anInt1192
			  - f_40_ * f_37_),
			 f_39_ - f_40_ * f_39_,
			 (((Class55) class55).aShort405
			  * ((Class163) class163).anInt1195) >> 7,
			 (((Class163) class163).anInt1191
			  * ((Class55) class55).aShort407) >> 7);
		    class350_sub2.method3845((((GraphicsToolkit_Sub2)
					       aClass_ha_Sub2_5194)
					      .aClass350_Sub2_4697),
					     0);
		    aClass_ha_Sub2_5194.method2222(11570);
		    int anLocalInt_41_ = ((Class163) class163).anInt1196;
		    aClass_ha_Sub2_5194.method2215(false,
						   (((Class55) class55)
						    .aShort401),
						   false, (byte) -112);
		    aClass_ha_Sub2_5194
			.method2147(0, ((Class55) class55).aByte402);
		    aClass_ha_Sub2_5194.method2246(anLocalInt_41_, 1);
		    aClass_ha_Sub2_5194.method2188(-27539);
		}
	    }
	    aClass_ha_Sub2_5194.method2224(1, GlMultiTexSourceEnum.PREVIOUS,
					   -111);
	    aClass_ha_Sub2_5194.method2229((byte) -96,
					   GlMultiTexSourceEnum.PREVIOUS, 1);
	    aClass_ha_Sub2_5194.C(true);
	}
	if (argument_34_ < 109)
	    r();
    }
    
    final void method2659(int argument_42_, int[] argument_43_,
			  int argument_44_, int argument_45_, int argument_46_,
			  int argument_47_, boolean argument_48_) {
	int anLocalInt = argument_43_.length;
	if (argument_42_ == 0) {
	    argument_44_ <<= 4;
	    argument_45_ <<= 4;
	    argument_46_ <<= 4;
	    Statics.anInt6646 = 0;
	    int anLocalInt_49_ = 0;
	    Class44.anInt312 = 0;
	    JagexHashMap.anInt489 = 0;
	    for (int anLocalInt_50_ = 0; anLocalInt > anLocalInt_50_;
		 anLocalInt_50_++) {
		int anLocalInt_51_ = argument_43_[anLocalInt_50_];
		if (anIntArrayArray5176.length > anLocalInt_51_) {
		    int[] anLocalInts = anIntArrayArray5176[anLocalInt_51_];
		    for (int anLocalInt_52_ = 0;
			 anLocalInts.length > anLocalInt_52_;
			 anLocalInt_52_++) {
			int anLocalInt_53_ = anLocalInts[anLocalInt_52_];
			Class44.anInt312 += anIntArray5163[anLocalInt_53_];
			JagexHashMap.anInt489 += anIntArray5193[anLocalInt_53_];
			anLocalInt_49_++;
			Statics.anInt6646
			    += anIntArray5189[anLocalInt_53_];
		    }
		}
	    }
	    if (anLocalInt_49_ > 0) {
		Statics.anInt6646
		    = (argument_46_
		       + Statics.anInt6646 / anLocalInt_49_);
		JagexHashMap.anInt489
		    = JagexHashMap.anInt489 / anLocalInt_49_ + argument_45_;
		Class44.anInt312
		    = Class44.anInt312 / anLocalInt_49_ + argument_44_;
	    } else {
		JagexHashMap.anInt489 = argument_45_;
		Statics.anInt6646 = argument_46_;
		Class44.anInt312 = argument_44_;
	    }
	} else if (argument_42_ == 1) {
	    argument_45_ <<= 4;
	    argument_44_ <<= 4;
	    argument_46_ <<= 4;
	    for (int anLocalInt_54_ = 0; anLocalInt > anLocalInt_54_;
		 anLocalInt_54_++) {
		int anLocalInt_55_ = argument_43_[anLocalInt_54_];
		if (anIntArrayArray5176.length > anLocalInt_55_) {
		    int[] anLocalInts = anIntArrayArray5176[anLocalInt_55_];
		    for (int anLocalInt_56_ = 0;
			 anLocalInts.length > anLocalInt_56_;
			 anLocalInt_56_++) {
			int anLocalInt_57_ = anLocalInts[anLocalInt_56_];
			anIntArray5163[anLocalInt_57_] += argument_44_;
			anIntArray5193[anLocalInt_57_] += argument_45_;
			anIntArray5189[anLocalInt_57_] += argument_46_;
		    }
		}
	    }
	} else if (argument_42_ == 2) {
	    for (int anLocalInt_58_ = 0; anLocalInt_58_ < anLocalInt;
		 anLocalInt_58_++) {
		int anLocalInt_59_ = argument_43_[anLocalInt_58_];
		if (anIntArrayArray5176.length > anLocalInt_59_) {
		    int[] anLocalInts = anIntArrayArray5176[anLocalInt_59_];
		    if ((argument_47_ & 0x1) != 0) {
			for (int anLocalInt_60_ = 0;
			     anLocalInts.length > anLocalInt_60_;
			     anLocalInt_60_++) {
			    int anLocalInt_61_ = anLocalInts[anLocalInt_60_];
			    anIntArray5163[anLocalInt_61_] -= Class44.anInt312;
			    anIntArray5193[anLocalInt_61_] -= JagexHashMap.anInt489;
			    anIntArray5189[anLocalInt_61_]
				-= Statics.anInt6646;
			    if (argument_44_ != 0) {
				int anLocalInt_62_
				    = (Node_Sub6.SINETABLE
				       [argument_44_]);
				int anLocalInt_63_
				    = (Node_Sub6.COSINETABLE
				       [argument_44_]);
				int anLocalInt_64_
				    = ((-(anIntArray5189[anLocalInt_61_]
					  * anLocalInt_62_)
					+ (anIntArray5193[anLocalInt_61_]
					   * anLocalInt_63_)
					+ 16383)
				       >> 14);
				anIntArray5189[anLocalInt_61_]
				    = (((anLocalInt_63_
					 * anIntArray5189[anLocalInt_61_])
					+ 16383
					+ (anLocalInt_62_
					   * anIntArray5193[anLocalInt_61_]))
				       >> 14);
				anIntArray5193[anLocalInt_61_]
				    = anLocalInt_64_;
			    }
			    if (argument_46_ != 0) {
				int anLocalInt_65_
				    = (Node_Sub6.SINETABLE
				       [argument_46_]);
				int anLocalInt_66_
				    = (Node_Sub6.COSINETABLE
				       [argument_46_]);
				int anLocalInt_67_
				    = (((anLocalInt_66_
					 * anIntArray5163[anLocalInt_61_])
					+ 16383
					+ (anLocalInt_65_
					   * anIntArray5193[anLocalInt_61_]))
				       >> 14);
				anIntArray5193[anLocalInt_61_]
				    = (-(anLocalInt_65_
					 * anIntArray5163[anLocalInt_61_])
				       + (anIntArray5193[anLocalInt_61_]
					  * anLocalInt_66_)
				       + 16383) >> 14;
				anIntArray5163[anLocalInt_61_]
				    = anLocalInt_67_;
			    }
			    if (argument_45_ != 0) {
				int anLocalInt_68_
				    = (Node_Sub6.SINETABLE
				       [argument_45_]);
				int anLocalInt_69_
				    = (Node_Sub6.COSINETABLE
				       [argument_45_]);
				int anLocalInt_70_
				    = (((anLocalInt_69_
					 * anIntArray5163[anLocalInt_61_])
					+ (anLocalInt_68_
					   * anIntArray5189[anLocalInt_61_])
					+ 16383)
				       >> 14);
				anIntArray5189[anLocalInt_61_]
				    = (-(anIntArray5163[anLocalInt_61_]
					 * anLocalInt_68_)
				       + (anIntArray5189[anLocalInt_61_]
					  * anLocalInt_69_)
				       + 16383) >> 14;
				anIntArray5163[anLocalInt_61_]
				    = anLocalInt_70_;
			    }
			    anIntArray5163[anLocalInt_61_] += Class44.anInt312;
			    anIntArray5193[anLocalInt_61_] += JagexHashMap.anInt489;
			    anIntArray5189[anLocalInt_61_]
				+= Statics.anInt6646;
			}
		    } else {
			for (int anLocalInt_71_ = 0;
			     anLocalInt_71_ < anLocalInts.length;
			     anLocalInt_71_++) {
			    int anLocalInt_72_ = anLocalInts[anLocalInt_71_];
			    anIntArray5163[anLocalInt_72_] -= Class44.anInt312;
			    anIntArray5193[anLocalInt_72_] -= JagexHashMap.anInt489;
			    anIntArray5189[anLocalInt_72_]
				-= Statics.anInt6646;
			    if (argument_46_ != 0) {
				int anLocalInt_73_
				    = (Node_Sub6.SINETABLE
				       [argument_46_]);
				int anLocalInt_74_
				    = (Node_Sub6.COSINETABLE
				       [argument_46_]);
				int anLocalInt_75_
				    = (((anLocalInt_74_
					 * anIntArray5163[anLocalInt_72_])
					+ (anIntArray5193[anLocalInt_72_]
					   * anLocalInt_73_)
					+ 16383)
				       >> 14);
				anIntArray5193[anLocalInt_72_]
				    = (-(anLocalInt_73_
					 * anIntArray5163[anLocalInt_72_])
				       + (anIntArray5193[anLocalInt_72_]
					  * anLocalInt_74_)
				       + 16383) >> 14;
				anIntArray5163[anLocalInt_72_]
				    = anLocalInt_75_;
			    }
			    if (argument_44_ != 0) {
				int anLocalInt_76_
				    = (Node_Sub6.SINETABLE
				       [argument_44_]);
				int anLocalInt_77_
				    = (Node_Sub6.COSINETABLE
				       [argument_44_]);
				int anLocalInt_78_
				    = ((-(anLocalInt_76_
					  * anIntArray5189[anLocalInt_72_])
					+ (anLocalInt_77_
					   * anIntArray5193[anLocalInt_72_])
					+ 16383)
				       >> 14);
				anIntArray5189[anLocalInt_72_]
				    = ((anIntArray5189[anLocalInt_72_]
					* anLocalInt_77_)
				       + (anLocalInt_76_
					  * anIntArray5193[anLocalInt_72_])
				       + 16383) >> 14;
				anIntArray5193[anLocalInt_72_]
				    = anLocalInt_78_;
			    }
			    if (argument_45_ != 0) {
				int anLocalInt_79_
				    = (Node_Sub6.SINETABLE
				       [argument_45_]);
				int anLocalInt_80_
				    = (Node_Sub6.COSINETABLE
				       [argument_45_]);
				int anLocalInt_81_
				    = (((anLocalInt_80_
					 * anIntArray5163[anLocalInt_72_])
					+ 16383
					+ (anLocalInt_79_
					   * anIntArray5189[anLocalInt_72_]))
				       >> 14);
				anIntArray5189[anLocalInt_72_]
				    = (-(anIntArray5163[anLocalInt_72_]
					 * anLocalInt_79_)
				       + (anLocalInt_80_
					  * anIntArray5189[anLocalInt_72_])
				       + 16383) >> 14;
				anIntArray5163[anLocalInt_72_]
				    = anLocalInt_81_;
			    }
			    anIntArray5163[anLocalInt_72_] += Class44.anInt312;
			    anIntArray5193[anLocalInt_72_] += JagexHashMap.anInt489;
			    anIntArray5189[anLocalInt_72_]
				+= Statics.anInt6646;
			}
		    }
		}
	    }
	    if (argument_48_) {
		for (int anLocalInt_82_ = 0; anLocalInt > anLocalInt_82_;
		     anLocalInt_82_++) {
		    int anLocalInt_83_ = argument_43_[anLocalInt_82_];
		    if (anLocalInt_83_ < anIntArrayArray5176.length) {
			int[] anLocalInts
			    = anIntArrayArray5176[anLocalInt_83_];
			for (int anLocalInt_84_ = 0;
			     anLocalInts.length > anLocalInt_84_;
			     anLocalInt_84_++) {
			    int anLocalInt_85_ = anLocalInts[anLocalInt_84_];
			    int anLocalInt_86_
				= anIntArray5202[anLocalInt_85_];
			    int anLocalInt_87_
				= anIntArray5202[anLocalInt_85_ + 1];
			    for (int anLocalInt_88_ = anLocalInt_86_;
				 anLocalInt_87_ > anLocalInt_88_;
				 anLocalInt_88_++) {
				int anLocalInt_89_
				    = aShortArray5174[anLocalInt_88_] - 1;
				if (anLocalInt_89_ == -1)
				    break;
				if (argument_46_ != 0) {
				    int anLocalInt_90_
					= (Node_Sub6.SINETABLE
					   [argument_46_]);
				    int anLocalInt_91_
					= (Node_Sub6.COSINETABLE
					   [argument_46_]);
				    int anLocalInt_92_
					= (((anLocalInt_90_
					     * aShortArray5187[anLocalInt_89_])
					    - (-(anLocalInt_91_
						 * (aShortArray5166
						    [anLocalInt_89_]))
					       - 16383))
					   >> 14);
				    aShortArray5187[anLocalInt_89_]
					= (short) ((-((aShortArray5166
						       [anLocalInt_89_])
						      * anLocalInt_90_)
						    + ((aShortArray5187
							[anLocalInt_89_])
						       * anLocalInt_91_)
						    + 16383)
						   >> 14);
				    aShortArray5166[anLocalInt_89_]
					= (short) anLocalInt_92_;
				}
				if (argument_44_ != 0) {
				    int anLocalInt_93_
					= (Node_Sub6.SINETABLE
					   [argument_44_]);
				    int anLocalInt_94_
					= (Node_Sub6.COSINETABLE
					   [argument_44_]);
				    int anLocalInt_95_
					= (-(anLocalInt_93_
					     * aShortArray5197[anLocalInt_89_])
					   + ((anLocalInt_94_
					       * (aShortArray5187
						  [anLocalInt_89_]))
					      + 16383)) >> 14;
				    aShortArray5197[anLocalInt_89_]
					= (short) (((anLocalInt_93_
						     * (aShortArray5187
							[anLocalInt_89_]))
						    + ((aShortArray5197
							[anLocalInt_89_])
						       * anLocalInt_94_)
						    + 16383)
						   >> 14);
				    aShortArray5187[anLocalInt_89_]
					= (short) anLocalInt_95_;
				}
				if (argument_45_ != 0) {
				    int anLocalInt_96_
					= (Node_Sub6.SINETABLE
					   [argument_45_]);
				    int anLocalInt_97_
					= (Node_Sub6.COSINETABLE
					   [argument_45_]);
				    int anLocalInt_98_
					= (((aShortArray5197[anLocalInt_89_]
					     * anLocalInt_96_)
					    + (aShortArray5166[anLocalInt_89_]
					       * anLocalInt_97_)
					    + 16383)
					   >> 14);
				    aShortArray5197[anLocalInt_89_]
					= (short) ((-((aShortArray5166
						       [anLocalInt_89_])
						      * anLocalInt_96_)
						    + 16383
						    + ((aShortArray5197
							[anLocalInt_89_])
						       * anLocalInt_97_))
						   >> 14);
				    aShortArray5166[anLocalInt_89_]
					= (short) anLocalInt_98_;
				}
			    }
			}
		    }
		}
		method2708((byte) 40);
	    }
	} else if (argument_42_ == 3) {
	    for (int anLocalInt_99_ = 0; anLocalInt_99_ < anLocalInt;
		 anLocalInt_99_++) {
		int anLocalInt_100_ = argument_43_[anLocalInt_99_];
		if (anLocalInt_100_ < anIntArrayArray5176.length) {
		    int[] anLocalInts = anIntArrayArray5176[anLocalInt_100_];
		    for (int anLocalInt_101_ = 0;
			 anLocalInts.length > anLocalInt_101_;
			 anLocalInt_101_++) {
			int anLocalInt_102_ = anLocalInts[anLocalInt_101_];
			anIntArray5163[anLocalInt_102_] -= Class44.anInt312;
			anIntArray5193[anLocalInt_102_] -= JagexHashMap.anInt489;
			anIntArray5189[anLocalInt_102_]
			    -= Statics.anInt6646;
			anIntArray5163[anLocalInt_102_]
			    = (argument_44_ * anIntArray5163[anLocalInt_102_]
			       >> 7);
			anIntArray5193[anLocalInt_102_]
			    = (argument_45_ * anIntArray5193[anLocalInt_102_]
			       >> 7);
			anIntArray5189[anLocalInt_102_]
			    = (argument_46_ * anIntArray5189[anLocalInt_102_]
			       >> 7);
			anIntArray5163[anLocalInt_102_] += Class44.anInt312;
			anIntArray5193[anLocalInt_102_] += JagexHashMap.anInt489;
			anIntArray5189[anLocalInt_102_]
			    += Statics.anInt6646;
		    }
		}
	    }
	} else if (argument_42_ == 5) {
	    if (anIntArrayArray5146 != null) {
		boolean anLocalBoolean = false;
		for (int anLocalInt_103_ = 0; anLocalInt_103_ < anLocalInt;
		     anLocalInt_103_++) {
		    int anLocalInt_104_ = argument_43_[anLocalInt_103_];
		    if (anLocalInt_104_ < anIntArrayArray5146.length) {
			int[] anLocalInts
			    = anIntArrayArray5146[anLocalInt_104_];
			for (int anLocalInt_105_ = 0;
			     anLocalInts.length > anLocalInt_105_;
			     anLocalInt_105_++) {
			    int anLocalInt_106_ = anLocalInts[anLocalInt_105_];
			    int anLocalInt_107_
				= ((aByteArray5184[anLocalInt_106_] & 0xff)
				   + argument_44_ * 8);
			    if (anLocalInt_107_ < 0)
				anLocalInt_107_ = 0;
			    else if (anLocalInt_107_ > 255)
				anLocalInt_107_ = 255;
			    aByteArray5184[anLocalInt_106_]
				= (byte) anLocalInt_107_;
			}
			anLocalBoolean
			    = anLocalBoolean | anLocalInts.length > 0;
		    }
		}
		if (anLocalBoolean) {
		    if (aClass55Array5203 != null) {
			for (int anLocalInt_108_ = 0;
			     anLocalInt_108_ < anInt5159; anLocalInt_108_++) {
			    Class55 class55
				= aClass55Array5203[anLocalInt_108_];
			    Class163 class163
				= aClass163Array5156[anLocalInt_108_];
			    ((Class163) class163).anInt1196
				= (-((aByteArray5184
				      [((Class55) class55).anInt396])
				     & 0xff) + 255 << 24
				   | (((Class163) class163).anInt1196
				      & 0xffffff));
			}
		    }
		    method2712(-28645);
		}
	    }
	} else if (argument_42_ == 7) {
	    if (anIntArrayArray5146 != null) {
		boolean anLocalBoolean = false;
		for (int anLocalInt_109_ = 0; anLocalInt > anLocalInt_109_;
		     anLocalInt_109_++) {
		    int anLocalInt_110_ = argument_43_[anLocalInt_109_];
		    if (anLocalInt_110_ < anIntArrayArray5146.length) {
			int[] anLocalInts
			    = anIntArrayArray5146[anLocalInt_110_];
			for (int anLocalInt_111_ = 0;
			     anLocalInt_111_ < anLocalInts.length;
			     anLocalInt_111_++) {
			    int anLocalInt_112_ = anLocalInts[anLocalInt_111_];
			    int anLocalInt_113_
				= aShortArray5168[anLocalInt_112_] & 0xffff;
			    int anLocalInt_114_ = anLocalInt_113_ >> 10 & 0x3f;
			    int anLocalInt_115_ = anLocalInt_113_ >> 7 & 0x7;
			    int anLocalInt_116_ = anLocalInt_113_ & 0x7f;
			    anLocalInt_114_
				= anLocalInt_114_ + argument_44_ & 0x3f;
			    anLocalInt_115_ += argument_45_ / 4;
			    anLocalInt_116_ += argument_46_;
			    if (anLocalInt_115_ < 0)
				anLocalInt_115_ = 0;
			    else if (anLocalInt_115_ > 7)
				anLocalInt_115_ = 7;
			    if (anLocalInt_116_ < 0)
				anLocalInt_116_ = 0;
			    else if (anLocalInt_116_ > 127)
				anLocalInt_116_ = 127;
			    aShortArray5168[anLocalInt_112_]
				= (short) (MathStatics.OR
					   (anLocalInt_116_, (MathStatics.OR(anLocalInt_115_ << 7, anLocalInt_114_ << 10))));
			}
			anLocalBoolean
			    = anLocalBoolean | anLocalInts.length > 0;
		    }
		}
		if (anLocalBoolean) {
		    if (aClass55Array5203 != null) {
			for (int anLocalInt_117_ = 0;
			     anLocalInt_117_ < anInt5159; anLocalInt_117_++) {
			    Class55 class55
				= aClass55Array5203[anLocalInt_117_];
			    Class163 class163
				= aClass163Array5156[anLocalInt_117_];
			    ((Class163) class163).anInt1196
				= (((Class163) class163).anInt1196 & ~0xffffff
				   | ((HslToRgb.table
				       [aShortArray5168[(((Class55) class55)
							 .anInt396)] & 0xffff])
				      & 0xffffff));
			}
		    }
		    method2712(-28645);
		}
	    }
	} else if (argument_42_ == 8) {
	    if (anIntArrayArray5179 != null) {
		for (int anLocalInt_118_ = 0; anLocalInt_118_ < anLocalInt;
		     anLocalInt_118_++) {
		    int anLocalInt_119_ = argument_43_[anLocalInt_118_];
		    if (anLocalInt_119_ < anIntArrayArray5179.length) {
			int[] anLocalInts
			    = anIntArrayArray5179[anLocalInt_119_];
			for (int anLocalInt_120_ = 0;
			     anLocalInt_120_ < anLocalInts.length;
			     anLocalInt_120_++) {
			    Class163 class163
				= (aClass163Array5156
				   [anLocalInts[anLocalInt_120_]]);
			    ((Class163) class163).anInt1193 += argument_45_;
			    ((Class163) class163).anInt1192 += argument_44_;
			}
		    }
		}
	    }
	} else if (argument_42_ == 10) {
	    if (anIntArrayArray5179 != null) {
		for (int anLocalInt_121_ = 0; anLocalInt_121_ < anLocalInt;
		     anLocalInt_121_++) {
		    int anLocalInt_122_ = argument_43_[anLocalInt_121_];
		    if (anLocalInt_122_ < anIntArrayArray5179.length) {
			int[] anLocalInts
			    = anIntArrayArray5179[anLocalInt_122_];
			for (int anLocalInt_123_ = 0;
			     anLocalInt_123_ < anLocalInts.length;
			     anLocalInt_123_++) {
			    Class163 class163
				= (aClass163Array5156
				   [anLocalInts[anLocalInt_123_]]);
			    ((Class163) class163).anInt1191
				= (((Class163) class163).anInt1191
				   * argument_45_) >> 7;
			    ((Class163) class163).anInt1195
				= (argument_44_
				   * ((Class163) class163).anInt1195) >> 7;
			}
		    }
		}
	    }
	} else if (argument_42_ == 9) {
	    if (anIntArrayArray5179 != null) {
		for (int anLocalInt_124_ = 0; anLocalInt_124_ < anLocalInt;
		     anLocalInt_124_++) {
		    int anLocalInt_125_ = argument_43_[anLocalInt_124_];
		    if (anLocalInt_125_ < anIntArrayArray5179.length) {
			int[] anLocalInts
			    = anIntArrayArray5179[anLocalInt_125_];
			for (int anLocalInt_126_ = 0;
			     anLocalInt_126_ < anLocalInts.length;
			     anLocalInt_126_++) {
			    Class163 class163
				= (aClass163Array5156
				   [anLocalInts[anLocalInt_126_]]);
			    ((Class163) class163).anInt1194
				= (((Class163) class163).anInt1194
				   + argument_44_) & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    final void method2646(Class350 argument_127_, DoublyLinkedNodeP2_Sub9 argument_128_,
			  int argument_129_, int argument_130_) {
	if (anInt5186 != 0) {
	    Class350_Sub2 class350_sub2
		= ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aClass350_Sub2_4696;
	    if (!aBoolean5157)
		method2714(-126);
	    Class350_Sub2 class350_sub2_131_ = (Class350_Sub2) argument_127_;
	    Class174.aFloat3441
		= (((Class350_Sub2) class350_sub2).aFloat5443
		   + ((((Class350_Sub2) class350_sub2_131_).v7
		       * ((Class350_Sub2) class350_sub2).aFloat5448)
		      + (((Class350_Sub2) class350_sub2_131_).v3
			 * ((Class350_Sub2) class350_sub2).aFloat5445)
		      + (((Class350_Sub2) class350_sub2_131_).aFloat5443
			 * ((Class350_Sub2) class350_sub2).aFloat5444)));
	    Node_Sub31_Sub4.aFloat5854
		= ((((Class350_Sub2) class350_sub2_131_).aFloat5448
		    * ((Class350_Sub2) class350_sub2).aFloat5444)
		   + ((((Class350_Sub2) class350_sub2).aFloat5445
		       * ((Class350_Sub2) class350_sub2_131_).v1)
		      + (((Class350_Sub2) class350_sub2_131_).v5
			 * ((Class350_Sub2) class350_sub2).aFloat5448)));
	    float f = (Class174.aFloat3441
		       + Node_Sub31_Sub4.aFloat5854 * (float) anInt5205);
	    float f_132_ = (Node_Sub31_Sub4.aFloat5854 * (float) anInt5178
			    + Class174.aFloat3441);
	    float f_133_;
	    float f_134_;
	    if (f > f_132_) {
		f_133_ = f_132_ - (float) anInt5148;
		f_134_ = f + (float) anInt5148;
	    } else {
		f_133_ = (float) -anInt5148 + f;
		f_134_ = (float) anInt5148 + f_132_;
	    }
	    if (!(((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aFloat4747 <= f_133_)
		&& !(f_134_ <= (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					.anInt4749))) {
		Class189.aFloat3620
		    = (((Class350_Sub2) class350_sub2).v3
		       + ((((Class350_Sub2) class350_sub2_131_).v3
			   * ((Class350_Sub2) class350_sub2).v0)
			  + (((Class350_Sub2) class350_sub2_131_).v7
			     * ((Class350_Sub2) class350_sub2).v1)
			  + (((Class350_Sub2) class350_sub2).v2
			     * (((Class350_Sub2) class350_sub2_131_)
				.aFloat5443))));
		LoadingBar.aFloat1360
		    = ((((Class350_Sub2) class350_sub2_131_).v1
			* ((Class350_Sub2) class350_sub2).v0)
		       + (((Class350_Sub2) class350_sub2).v1
			  * ((Class350_Sub2) class350_sub2_131_).v5)
		       + (((Class350_Sub2) class350_sub2_131_).aFloat5448
			  * ((Class350_Sub2) class350_sub2).v2));
		float f_135_ = (Class189.aFloat3620
				+ (float) anInt5205 * LoadingBar.aFloat1360);
		float f_136_ = (LoadingBar.aFloat1360 * (float) anInt5178
				+ Class189.aFloat3620);
		float f_137_;
		float f_138_;
		if (f_135_ > f_136_) {
		    f_137_
			= (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				   .anInt4750) * (f_135_ + (float) anInt5148);
		    f_138_
			= (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				   .anInt4750) * (f_136_ - (float) anInt5148);
		} else {
		    f_137_ = ((f_136_ + (float) anInt5148)
			      * (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					 .anInt4750));
		    f_138_
			= (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				   .anInt4750) * (f_135_ - (float) anInt5148);
		}
		if (!(((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aFloat4718
		      <= f_138_ / (float) argument_129_)
		    && !(f_137_ / (float) argument_129_
			 <= (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
			     .aFloat4708))) {
		    Class159.aFloat3670
			= (((Class350_Sub2) class350_sub2).v7
			   + ((((Class350_Sub2) class350_sub2).v4
			       * (((Class350_Sub2) class350_sub2_131_)
				  .v3))
			      + ((((Class350_Sub2) class350_sub2_131_)
				  .v7)
				 * ((Class350_Sub2) class350_sub2).v5)
			      + (((Class350_Sub2) class350_sub2).v6
				 * (((Class350_Sub2) class350_sub2_131_)
				    .aFloat5443))));
		    Class123.aFloat1001
			= ((((Class350_Sub2) class350_sub2).v4
			    * ((Class350_Sub2) class350_sub2_131_).v1)
			   + (((Class350_Sub2) class350_sub2_131_).v5
			      * ((Class350_Sub2) class350_sub2).v5)
			   + (((Class350_Sub2) class350_sub2_131_).aFloat5448
			      * ((Class350_Sub2) class350_sub2).v6));
		    float f_139_ = (Class123.aFloat1001 * (float) anInt5205
				    + Class159.aFloat3670);
		    float f_140_ = (Class159.aFloat3670
				    + (float) anInt5178 * Class123.aFloat1001);
		    float f_141_;
		    float f_142_;
		    if (f_139_ > f_140_) {
			f_142_
			    = ((f_140_ - (float) anInt5148)
			       * (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					  .anInt4794));
			f_141_
			    = ((f_139_ + (float) anInt5148)
			       * (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					  .anInt4794));
		    } else {
			f_141_
			    = ((f_140_ + (float) anInt5148)
			       * (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					  .anInt4794));
			f_142_
			    = (((float) -anInt5148 + f_139_)
			       * (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					  .anInt4794));
		    }
		    if (!(f_142_ / (float) argument_129_
			  >= ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aFloat4787)
			&& !(f_141_ / (float) argument_129_
			     <= (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				 .aFloat4770))) {
			if (argument_128_ != null
			    || aClass55Array5203 != null) {
			    Statics.aFloat5558
				= ((((Class350_Sub2) class350_sub2).aFloat5445
				    * (((Class350_Sub2) class350_sub2_131_)
				       .v0))
				   + ((((Class350_Sub2) class350_sub2_131_)
				       .v4)
				      * (((Class350_Sub2) class350_sub2)
					 .aFloat5448))
				   + ((((Class350_Sub2) class350_sub2)
				       .aFloat5444)
				      * (((Class350_Sub2) class350_sub2_131_)
					 .aFloat5445)));
			    Class62_Sub1.aFloat4364
				= (((((Class350_Sub2) class350_sub2_131_)
				     .aFloat5445)
				    * (((Class350_Sub2) class350_sub2)
				       .v6))
				   + (((((Class350_Sub2) class350_sub2)
					.v4)
				       * (((Class350_Sub2) class350_sub2_131_)
					  .v0))
				      + ((((Class350_Sub2) class350_sub2)
					  .v5)
					 * ((Class350_Sub2)
					    class350_sub2_131_).v4)));
			    Statics.aFloat6147
				= ((((Class350_Sub2) class350_sub2).aFloat5444
				    * (((Class350_Sub2) class350_sub2_131_)
				       .aFloat5444))
				   + (((((Class350_Sub2) class350_sub2_131_)
					.v6)
				       * (((Class350_Sub2) class350_sub2)
					  .aFloat5448))
				      + ((((Class350_Sub2) class350_sub2_131_)
					  .v2)
					 * (((Class350_Sub2) class350_sub2)
					    .aFloat5445))));
			    Class256_Sub3.aFloat5628
				= (((((Class350_Sub2) class350_sub2_131_)
				     .aFloat5445)
				    * (((Class350_Sub2) class350_sub2)
				       .v2))
				   + (((((Class350_Sub2) class350_sub2)
					.v1)
				       * (((Class350_Sub2) class350_sub2_131_)
					  .v4))
				      + ((((Class350_Sub2) class350_sub2)
					  .v0)
					 * ((Class350_Sub2)
					    class350_sub2_131_).v0)));
			    Node_Sub13.aFloat3977
				= ((((Class350_Sub2) class350_sub2).v4
				    * (((Class350_Sub2) class350_sub2_131_)
				       .v2))
				   + ((((Class350_Sub2) class350_sub2)
				       .v5)
				      * (((Class350_Sub2) class350_sub2_131_)
					 .v6))
				   + ((((Class350_Sub2) class350_sub2)
				       .v6)
				      * (((Class350_Sub2) class350_sub2_131_)
					 .aFloat5444)));
			    Class261.aFloat2038
				= (((((Class350_Sub2) class350_sub2_131_)
				     .v2)
				    * (((Class350_Sub2) class350_sub2)
				       .v0))
				   + ((((Class350_Sub2) class350_sub2)
				       .v1)
				      * (((Class350_Sub2) class350_sub2_131_)
					 .v6))
				   + ((((Class350_Sub2) class350_sub2)
				       .v2)
				      * (((Class350_Sub2) class350_sub2_131_)
					 .aFloat5444)));
			}
			if (argument_128_ != null) {
			    int anLocalInt = anInt5152 + anInt5185 >> 1;
			    int anLocalInt_143_ = anInt5155 + anInt5182 >> 1;
			    int anLocalInt_144_
				= (int) ((Class261.aFloat2038
					  * (float) anLocalInt_143_)
					 + (Class189.aFloat3620
					    + (Class256_Sub3.aFloat5628
					       * (float) anLocalInt)
					    + ((float) anInt5205
					       * LoadingBar.aFloat1360)));
			    int anLocalInt_145_
				= (int) (Class159.aFloat3670
					 + ((float) anLocalInt
					    * Class62_Sub1.aFloat4364)
					 + ((float) anInt5205
					    * Class123.aFloat1001)
					 + (Node_Sub13.aFloat3977
					    * (float) anLocalInt_143_));
			    int anLocalInt_146_
				= (int) ((Statics.aFloat6147
					  * (float) anLocalInt_143_)
					 + ((Statics.aFloat5558
					     * (float) anLocalInt)
					    + Class174.aFloat3441
					    + (Node_Sub31_Sub4.aFloat5854
					       * (float) anInt5205)));
			    int anLocalInt_147_
				= (int) ((Class261.aFloat2038
					  * (float) anLocalInt_143_)
					 + ((LoadingBar.aFloat1360
					     * (float) anInt5178)
					    + ((Class256_Sub3.aFloat5628
						* (float) anLocalInt)
					       + Class189.aFloat3620)));
			    int anLocalInt_148_
				= (int) ((Node_Sub13.aFloat3977
					  * (float) anLocalInt_143_)
					 + (Class159.aFloat3670
					    + ((float) anLocalInt
					       * Class62_Sub1.aFloat4364)
					    + (Class123.aFloat1001
					       * (float) anInt5178)));
			    int anLocalInt_149_
				= (int) (((float) anLocalInt
					  * Statics.aFloat5558)
					 + Class174.aFloat3441
					 + (Node_Sub31_Sub4.aFloat5854
					    * (float) anInt5178)
					 + (Statics.aFloat6147
					    * (float) anLocalInt_143_));
			    ((DoublyLinkedNodeP2_Sub9) argument_128_).anInt4590
				= ((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				    .anInt4737)
				   + ((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				       .anInt4750)
				      * anLocalInt_147_ / argument_129_));
			    ((DoublyLinkedNodeP2_Sub9) argument_128_).anInt4588
				= ((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				    .anInt4737)
				   + (anLocalInt_144_
				      * (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					 .anInt4750)
				      / argument_129_));
			    ((DoublyLinkedNodeP2_Sub9) argument_128_).anInt4589
				= ((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				    .anInt4754)
				   + ((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				       .anInt4794)
				      * anLocalInt_145_ / argument_129_));
			    ((DoublyLinkedNodeP2_Sub9) argument_128_).anInt4587
				= ((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				    .anInt4754)
				   + (anLocalInt_148_
				      * (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					 .anInt4794)
				      / argument_129_));
			    if ((anLocalInt_146_
				 >= (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				     .anInt4749))
				|| (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				    .anInt4749) <= anLocalInt_149_) {
				((DoublyLinkedNodeP2_Sub9) argument_128_).anInt4586
				    = ((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					.anInt4737)
				       + ((anLocalInt_144_ + anInt5148)
					  * ((GraphicsToolkit_Sub2)
					     aClass_ha_Sub2_5194).anInt4750
					  / argument_129_)
				       - (((DoublyLinkedNodeP2_Sub9) argument_128_)
					  .anInt4588));
				((DoublyLinkedNodeP2_Sub9) argument_128_).aBoolean4591
				    = true;
			    }
			}
			aClass_ha_Sub2_5194.method2124((float) argument_129_,
						       (byte) 93);
			aClass_ha_Sub2_5194.method2226(-1);
			aClass_ha_Sub2_5194.method2120(2, class350_sub2_131_);
			method2704(14295);
			method2700((byte) 117);
		    }
		}
	    }
	}
    }
    
    final void VA(int argument_150_) {
	int anLocalInt = Node_Sub6.SINETABLE[argument_150_];
	int anLocalInt_151_ = Node_Sub6.COSINETABLE[argument_150_];
	for (int anLocalInt_152_ = 0; anLocalInt_152_ < anInt5200;
	     anLocalInt_152_++) {
	    int anLocalInt_153_
		= ((anIntArray5163[anLocalInt_152_] * anLocalInt_151_
		    + anIntArray5193[anLocalInt_152_] * anLocalInt)
		   >> 14);
	    anIntArray5193[anLocalInt_152_]
		= (-(anIntArray5163[anLocalInt_152_] * anLocalInt)
		   + anIntArray5193[anLocalInt_152_] * anLocalInt_151_) >> 14;
	    anIntArray5163[anLocalInt_152_] = anLocalInt_153_;
	}
	method2705(true);
	aBoolean5157 = false;
    }
    
    final Class185[] method2655() {
	return aClass185Array5206;
    }
    
    final void LA(int argument_154_) {
	aShort5188 = (short) argument_154_;
	method2705(true);
	method2708((byte) 40);
    }
    
    final void method2643(Class350 argument_155_, int argument_156_,
			  boolean argument_157_) {
	if (aShortArray5183 != null) {
	    int[] anLocalInts = new int[3];
	    for (int anLocalInt = 0; anLocalInt < anInt5200; anLocalInt++) {
		if ((argument_156_ & aShortArray5183[anLocalInt]) != 0) {
		    if (argument_157_)
			argument_155_.method3831(anIntArray5163[anLocalInt],
						 anIntArray5193[anLocalInt],
						 anIntArray5189[anLocalInt],
						 anLocalInts);
		    else
			argument_155_.method3829(anIntArray5163[anLocalInt],
						 anIntArray5193[anLocalInt],
						 anIntArray5189[anLocalInt],
						 anLocalInts);
		    anIntArray5163[anLocalInt] = anLocalInts[0];
		    anIntArray5193[anLocalInt] = anLocalInts[1];
		    anIntArray5189[anLocalInt] = anLocalInts[2];
		}
	    }
	}
    }
    
    final void a(int argument_158_) {
	int anLocalInt = Node_Sub6.SINETABLE[argument_158_];
	int anLocalInt_159_ = Node_Sub6.COSINETABLE[argument_158_];
	for (int anLocalInt_160_ = 0; anInt5200 > anLocalInt_160_;
	     anLocalInt_160_++) {
	    int anLocalInt_161_
		= ((anIntArray5163[anLocalInt_160_] * anLocalInt_159_
		    + anLocalInt * anIntArray5189[anLocalInt_160_])
		   >> 14);
	    anIntArray5189[anLocalInt_160_]
		= (anIntArray5189[anLocalInt_160_] * anLocalInt_159_
		   - anLocalInt * anIntArray5163[anLocalInt_160_]) >> 14;
	    anIntArray5163[anLocalInt_160_] = anLocalInt_161_;
	}
	method2705(true);
	aBoolean5157 = false;
    }
    
    private final void method2701(tia_sub_35_Sub1DoublyLinked argument_162_,
				  int argument_163_) {
	int anLocalInt = -66 % ((argument_163_ - 67) / 35);
	if (anInt5186 > Class354.anIntArray3004.length) {
	    Class354.anIntArray3004 = new int[anInt5186];
	    Class352.anIntArray2948 = new int[anInt5186];
	}
	for (int anLocalInt_164_ = 0; anInt5200 > anLocalInt_164_;
	     anLocalInt_164_++) {
	    int anLocalInt_165_
		= (((anIntArray5163[anLocalInt_164_]
		     - ((anIntArray5193[anLocalInt_164_]
			 * ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4705)
			>> 8))
		    >> ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4701)
		   - ((tia_sub_35_Sub1DoublyLinked) argument_162_).anInt6653);
	    int anLocalInt_166_
		= (((anIntArray5189[anLocalInt_164_]
		     - ((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4704
			 * anIntArray5193[anLocalInt_164_])
			>> 8))
		    >> ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4701)
		   - ((tia_sub_35_Sub1DoublyLinked) argument_162_).anInt6655);
	    int anLocalInt_167_ = anIntArray5202[anLocalInt_164_];
	    int anLocalInt_168_ = anIntArray5202[anLocalInt_164_ + 1];
	    for (int anLocalInt_169_ = anLocalInt_167_;
		 anLocalInt_168_ > anLocalInt_169_; anLocalInt_169_++) {
		int anLocalInt_170_ = aShortArray5174[anLocalInt_169_] - 1;
		if (anLocalInt_170_ == -1)
		    break;
		Class354.anIntArray3004[anLocalInt_170_] = anLocalInt_165_;
		Class352.anIntArray2948[anLocalInt_170_] = anLocalInt_166_;
	    }
	}
	for (int anLocalInt_171_ = 0; anLocalInt_171_ < anInt5169;
	     anLocalInt_171_++) {
	    if (aByteArray5184 == null
		|| aByteArray5184[anLocalInt_171_] <= 128) {
		short anLocalInt_172_ = aShortArray5162[anLocalInt_171_];
		short anLocalInt_173_ = aShortArray5149[anLocalInt_171_];
		short anLocalInt_174_ = aShortArray5196[anLocalInt_171_];
		int anLocalInt_175_ = Class354.anIntArray3004[anLocalInt_172_];
		int anLocalInt_176_ = Class354.anIntArray3004[anLocalInt_173_];
		int anLocalInt_177_ = Class354.anIntArray3004[anLocalInt_174_];
		int anLocalInt_178_ = Class352.anIntArray2948[anLocalInt_172_];
		int anLocalInt_179_ = Class352.anIntArray2948[anLocalInt_173_];
		int anLocalInt_180_ = Class352.anIntArray2948[anLocalInt_174_];
		if ((-((anLocalInt_177_ - anLocalInt_176_)
		       * (-anLocalInt_178_ + anLocalInt_179_))
		     + ((-anLocalInt_180_ + anLocalInt_179_)
			* (anLocalInt_175_ - anLocalInt_176_)))
		    > 0)
		    argument_162_.method1217(anLocalInt_177_, anLocalInt_175_,
					     anLocalInt_179_, anLocalInt_178_,
					     anLocalInt_176_, anLocalInt_180_,
					     29167);
	    }
	}
    }
    
    final int ma() {
	if (!aBoolean5157)
	    method2714(0);
	return anInt5150;
    }
    
    final int ua() {
	return anInt5195;
    }
    
    final void method2654() {
	/* empty */
    }
    
    private final boolean method2702
	(int argument_181_, int argument_182_, int argument_183_,
	 int argument_184_, int argument_185_, int argument_186_,
	 int argument_187_, int argument_188_, int argument_189_) {
	if (argument_189_ > argument_184_ && argument_181_ > argument_184_
	    && argument_184_ < argument_185_)
	    return false;
	if (argument_184_ > argument_189_ && argument_184_ > argument_181_
	    && argument_184_ > argument_185_)
	    return false;
	if (argument_186_ != 2)
	    return false;
	if (argument_182_ > argument_183_ && argument_183_ < argument_188_
	    && argument_187_ > argument_183_)
	    return false;
	if (argument_182_ < argument_183_ && argument_183_ > argument_188_
	    && argument_183_ > argument_187_)
	    return false;
	return true;
    }
    
    private final void method2703(byte argument_190_) {
	int anLocalInt = -127 % ((-23 - argument_190_) / 61);
	if (aClass206_5173 != null)
	    ((Class206) aClass206_5173).aBoolean1477 = false;
    }
    
    final void wa() {
	for (int anLocalInt = 0; anInt5192 > anLocalInt; anLocalInt++) {
	    anIntArray5163[anLocalInt] = anIntArray5163[anLocalInt] + 7 >> 4;
	    anIntArray5193[anLocalInt] = anIntArray5193[anLocalInt] + 7 >> 4;
	    anIntArray5189[anLocalInt] = anIntArray5189[anLocalInt] + 7 >> 4;
	}
	method2705(true);
	aBoolean5157 = false;
    }
    
    private final void method2704(int argument_191_) {
	if (anInt5169 != 0) {
	    if (method2697((byte) -54) && method2711(argument_191_ - 14295)) {
		aClass_ha_Sub2_5194.method2130((((Class247) aClass247_5199)
						.anInterface4_Impl2_1797),
					       0, argument_191_ ^ 0x37e4);
		aClass_ha_Sub2_5194.method2130((((Class247) aClass247_5158)
						.anInterface4_Impl2_1797),
					       1, -125);
		aClass_ha_Sub2_5194.method2130((((Class247) aClass247_5191)
						.anInterface4_Impl2_1797),
					       2, argument_191_ - 14265);
		boolean anLocalBoolean;
		if ((anInt5201 & 0x37) == 0) {
		    aClass_ha_Sub2_5194.method2172((byte) -68, false);
		    anLocalBoolean = false;
		    aClass_ha_Sub2_5194.method2179((((GraphicsToolkit_Sub2)
						     aClass_ha_Sub2_5194)
						    .aClass222_4809),
						   (byte) -63);
		} else {
		    anLocalBoolean = true;
		    aClass_ha_Sub2_5194.method2172((byte) -68, true);
		    aClass_ha_Sub2_5194.method2130((((Class247) aClass247_5177)
						    .anInterface4_Impl2_1797),
						   3, 24);
		    aClass_ha_Sub2_5194.method2179((((GraphicsToolkit_Sub2)
						     aClass_ha_Sub2_5194)
						    .aClass222_4812),
						   (byte) -63);
		}
		for (int anLocalInt = 0; anIntArray5181.length > anLocalInt;
		     anLocalInt++) {
		    int anLocalInt_192_ = anIntArray5207[anLocalInt];
		    int anLocalInt_193_ = anIntArray5207[anLocalInt + 1];
		    int anLocalInt_194_
			= aShortArray5190[anLocalInt_192_] & 0xffff;
		    if (anLocalInt_194_ == 65535)
			anLocalInt_194_ = -1;
		    aClass_ha_Sub2_5194.method2215(true, anLocalInt_194_,
						   anLocalBoolean,
						   (byte) -112);
		    aClass_ha_Sub2_5194.method2131((-anLocalInt_192_
						    + anLocalInt_193_),
						   anLocalInt_192_ * 3,
						   (((Class206) aClass206_5173)
						    .anInterface4_Impl1_1476),
						   anIntArray5181[anLocalInt],
						   anIntArray5167[anLocalInt],
						   true,
						   Class232.aClass390_1684);
		}
	    }
	    if (argument_191_ != 14295)
		aFloatArray5175 = null;
	    method2710((byte) -104);
	}
    }
    
    final void p(int argument_195_, int argument_196_, Class_s argument_197_,
		 Class_s argument_198_, int argument_199_, int argument_200_,
		 int argument_201_) {
	if (!aBoolean5157)
	    method2714(38);
	int anLocalInt = anInt5185 + argument_199_;
	int anLocalInt_202_ = argument_199_ + anInt5152;
	int anLocalInt_203_ = anInt5155 + argument_201_;
	int anLocalInt_204_ = anInt5182 + argument_201_;
	if ((argument_195_ != 1 && argument_195_ != 2 && argument_195_ != 3
	     && argument_195_ != 5)
	    || (anLocalInt >= 0
		&& ((((Class_s) argument_197_).anInt2547 + anLocalInt_202_
		     >> ((Class_s) argument_197_).anInt2548)
		    < ((Class_s) argument_197_).anInt2550)
		&& anLocalInt_203_ >= 0
		&& ((anLocalInt_204_ + ((Class_s) argument_197_).anInt2547
		     >> ((Class_s) argument_197_).anInt2548)
		    < ((Class_s) argument_197_).anInt2549))) {
	    if (argument_195_ == 4 || argument_195_ == 5) {
		if (argument_198_ == null
		    || (anLocalInt < 0
			|| (((anLocalInt_202_
			      + ((Class_s) argument_198_).anInt2547)
			     >> ((Class_s) argument_198_).anInt2548)
			    >= ((Class_s) argument_198_).anInt2550)
			|| anLocalInt_203_ < 0
			|| (((Class_s) argument_198_).anInt2549
			    <= ((((Class_s) argument_198_).anInt2547
				 + anLocalInt_204_)
				>> ((Class_s) argument_198_).anInt2548))))
		    return;
	    } else {
		anLocalInt >>= ((Class_s) argument_197_).anInt2548;
		anLocalInt_202_
		    = (anLocalInt_202_ - (-((Class_s) argument_197_).anInt2547
					  + 1)
		       >> ((Class_s) argument_197_).anInt2548);
		anLocalInt_203_ >>= ((Class_s) argument_197_).anInt2548;
		anLocalInt_204_ = ((anLocalInt_204_ - 1
				    + ((Class_s) argument_197_).anInt2547)
				   >> ((Class_s) argument_197_).anInt2548);
		if (argument_197_.method3534(anLocalInt, false,
					     anLocalInt_203_) == argument_200_
		    && (argument_197_.method3534(anLocalInt_202_, false,
						 anLocalInt_203_)
			== argument_200_)
		    && (argument_197_.method3534(anLocalInt, false,
						 anLocalInt_204_)
			== argument_200_)
		    && (argument_200_
			== argument_197_.method3534(anLocalInt_202_, false,
						    anLocalInt_204_)))
		    return;
	    }
	    if (argument_195_ != 1) {
		if (argument_195_ == 2) {
		    int anLocalInt_205_ = anInt5205;
		    if (anLocalInt_205_ == 0)
			return;
		    for (int anLocalInt_206_ = 0; anLocalInt_206_ < anInt5200;
			 anLocalInt_206_++) {
			int anLocalInt_207_
			    = ((anIntArray5193[anLocalInt_206_] << 16)
			       / anLocalInt_205_);
			if (argument_196_ > anLocalInt_207_)
			    anIntArray5193[anLocalInt_206_]
				= (anIntArray5193[anLocalInt_206_]
				   + ((-anLocalInt_207_ + argument_196_)
				      * (-argument_200_
					 + (argument_197_.method3541
					    ((anIntArray5189[anLocalInt_206_]
					      + argument_201_),
					     0,
					     (argument_199_
					      + (anIntArray5163
						 [anLocalInt_206_])))))
				      / argument_196_));
		    }
		} else if (argument_195_ != 3) {
		    if (argument_195_ != 4) {
			if (argument_195_ == 5) {
			    int anLocalInt_208_ = anInt5178 - anInt5205;
			    for (int anLocalInt_209_ = 0;
				 anLocalInt_209_ < anInt5200;
				 anLocalInt_209_++) {
				int anLocalInt_210_
				    = (argument_199_
				       + anIntArray5163[anLocalInt_209_]);
				int anLocalInt_211_
				    = (anIntArray5189[anLocalInt_209_]
				       + argument_201_);
				int anLocalInt_212_
				    = (argument_197_.method3541
				       (anLocalInt_211_, 0, anLocalInt_210_));
				int anLocalInt_213_
				    = (argument_198_.method3541
				       (anLocalInt_211_, 0, anLocalInt_210_));
				int anLocalInt_214_
				    = (anLocalInt_212_ - anLocalInt_213_
				       - argument_196_);
				anIntArray5193[anLocalInt_209_]
				    = ((anLocalInt_214_
					* ((anIntArray5193[anLocalInt_209_]
					    << 8)
					   / anLocalInt_208_))
				       >> 8) + anLocalInt_212_ - argument_200_;
			    }
			}
		    } else {
			int anLocalInt_215_ = anInt5178 - anInt5205;
			for (int anLocalInt_216_ = 0;
			     anInt5200 > anLocalInt_216_; anLocalInt_216_++)
			    anIntArray5193[anLocalInt_216_]
				= (anIntArray5193[anLocalInt_216_]
				   + (-argument_200_
				      + ((argument_198_.method3541
					  ((anIntArray5189[anLocalInt_216_]
					    + argument_201_),
					   0,
					   (argument_199_
					    + (anIntArray5163
					       [anLocalInt_216_]))))
					 + anLocalInt_215_)));
		    }
		} else {
		    int anLocalInt_217_ = (argument_196_ & 0xff) * 4;
		    int anLocalInt_218_ = (argument_196_ >> 8 & 0xff) * 4;
		    int anLocalInt_219_ = (argument_196_ >> 16 & 0xff) << 6;
		    int anLocalInt_220_ = (argument_196_ >> 24 & 0xff) << 6;
		    if (-(anLocalInt_217_ >> 1) + argument_199_ < 0
			|| ((((Class_s) argument_197_).anInt2550
			     << ((Class_s) argument_197_).anInt2548)
			    <= (((Class_s) argument_197_).anInt2547
				+ ((anLocalInt_217_ >> 1) + argument_199_)))
			|| -(anLocalInt_218_ >> 1) + argument_201_ < 0
			|| ((((Class_s) argument_197_).anInt2549
			     << ((Class_s) argument_197_).anInt2548)
			    <= (((Class_s) argument_197_).anInt2547
				+ (argument_201_ + (anLocalInt_218_ >> 1)))))
			return;
		    this.method2642(argument_200_, argument_197_, -44,
				    anLocalInt_219_, anLocalInt_220_,
				    anLocalInt_217_, anLocalInt_218_,
				    argument_199_, argument_201_);
		}
	    } else {
		for (int anLocalInt_221_ = 0; anLocalInt_221_ < anInt5200;
		     anLocalInt_221_++)
		    anIntArray5193[anLocalInt_221_]
			= (-argument_200_ + anIntArray5193[anLocalInt_221_]
			   + (argument_197_.method3541
			      (anIntArray5189[anLocalInt_221_] + argument_201_,
			       0,
			       (argument_199_
				+ anIntArray5163[anLocalInt_221_]))));
	    }
	    method2705(true);
	    aBoolean5157 = false;
	}
    }
    
    final void s(int argument_222_) {
	if (aClass247_5199 != null)
	    ((Class247) aClass247_5199).aBoolean1799
		= Class60.method1336(argument_222_, (byte) -51, anInt5201);
	if (aClass247_5191 != null)
	    ((Class247) aClass247_5191).aBoolean1799
		= Node_Sub50.method1166(anInt5201, (byte) 0, argument_222_);
	if (aClass247_5158 != null)
	    ((Class247) aClass247_5158).aBoolean1799
		= Class245_Sub2.method3191(argument_222_, anInt5201,
					   (byte) -49);
	if (aClass247_5177 != null)
	    ((Class247) aClass247_5177).aBoolean1799
		= Class256_Sub3.method3291(anInt5201, (byte) -17,
					   argument_222_);
	anInt5195 = argument_222_;
	aBoolean5170 = true;
	if (aClass284_5172 != null && (anInt5195 & 0x10000) == 0) {
	    aShortArray5197 = ((Class284) aClass284_5172).aShortArray2284;
	    aShortArray5187 = ((Class284) aClass284_5172).aShortArray2281;
	    aByteArray5160 = ((Class284) aClass284_5172).aByteArray2282;
	    aShortArray5166 = ((Class284) aClass284_5172).aShortArray2278;
	    aClass284_5172 = null;
	}
	method2710((byte) -100);
    }
    
    final void method2656(Class350 argument_223_) {
	Class350_Sub2 class350_sub2 = (Class350_Sub2) argument_223_;
	if (aClass38Array5145 != null) {
	    for (int anLocalInt = 0; aClass38Array5145.length > anLocalInt;
		 anLocalInt++) {
		Class38 class38 = aClass38Array5145[anLocalInt];
		Class38 class38_224_ = class38;
		if (((Class38) class38).aClass38_278 != null)
		    class38_224_ = ((Class38) class38).aClass38_278;
		((Class38) class38_224_).anInt282
		    = (int) (((float) (anIntArray5189
				       [((Class38) class38).anInt286])
			      * ((Class350_Sub2) class350_sub2).v2)
			     + (((float) (anIntArray5163
					  [((Class38) class38).anInt286])
				 * ((Class350_Sub2) class350_sub2).v0)
				+ ((float) (anIntArray5193
					    [((Class38) class38).anInt286])
				   * (((Class350_Sub2) class350_sub2)
				      .v1)))
			     + ((Class350_Sub2) class350_sub2).v3);
		((Class38) class38_224_).anInt279
		    = (int) (((Class350_Sub2) class350_sub2).v7
			     + ((((Class350_Sub2) class350_sub2).v6
				 * (float) (anIntArray5189
					    [((Class38) class38).anInt286]))
				+ (((float) (anIntArray5193
					     [((Class38) class38).anInt286])
				    * (((Class350_Sub2) class350_sub2)
				       .v5))
				   + ((float) (anIntArray5163
					       [((Class38) class38).anInt286])
				      * (((Class350_Sub2) class350_sub2)
					 .v4)))));
		((Class38) class38_224_).anInt280
		    = (int) (((Class350_Sub2) class350_sub2).aFloat5443
			     + (((float) (anIntArray5189
					  [((Class38) class38).anInt286])
				 * ((Class350_Sub2) class350_sub2).aFloat5444)
				+ (((float) (anIntArray5163
					     [((Class38) class38).anInt286])
				    * (((Class350_Sub2) class350_sub2)
				       .aFloat5445))
				   + ((((Class350_Sub2) class350_sub2)
				       .aFloat5448)
				      * (float) (anIntArray5193
						 [(((Class38) class38)
						   .anInt286)])))));
		((Class38) class38_224_).anInt283
		    = (int) ((((Class350_Sub2) class350_sub2).v0
			      * (float) (anIntArray5163
					 [((Class38) class38).anInt284]))
			     + (((Class350_Sub2) class350_sub2).v1
				* (float) (anIntArray5193
					   [((Class38) class38).anInt284]))
			     + ((float) (anIntArray5189
					 [((Class38) class38).anInt284])
				* ((Class350_Sub2) class350_sub2).v2)
			     + ((Class350_Sub2) class350_sub2).v3);
		((Class38) class38_224_).anInt276
		    = (int) ((((Class350_Sub2) class350_sub2).v5
			      * (float) (anIntArray5193
					 [((Class38) class38).anInt284]))
			     + (((Class350_Sub2) class350_sub2).v4
				* (float) (anIntArray5163
					   [((Class38) class38).anInt284]))
			     + (((Class350_Sub2) class350_sub2).v6
				* (float) (anIntArray5189
					   [((Class38) class38).anInt284]))
			     + ((Class350_Sub2) class350_sub2).v7);
		((Class38) class38_224_).anInt289
		    = (int) ((((Class350_Sub2) class350_sub2).aFloat5444
			      * (float) (anIntArray5189
					 [((Class38) class38).anInt284]))
			     + (((float) (anIntArray5163
					  [((Class38) class38).anInt284])
				 * ((Class350_Sub2) class350_sub2).aFloat5445)
				+ (((Class350_Sub2) class350_sub2).aFloat5448
				   * (float) (anIntArray5193
					      [((Class38) class38).anInt284])))
			     + ((Class350_Sub2) class350_sub2).aFloat5443);
		((Class38) class38_224_).anInt277
		    = (int) ((((Class350_Sub2) class350_sub2).v2
			      * (float) (anIntArray5189
					 [((Class38) class38).anInt281]))
			     + (((float) (anIntArray5193
					  [((Class38) class38).anInt281])
				 * ((Class350_Sub2) class350_sub2).v1)
				+ (((Class350_Sub2) class350_sub2).v0
				   * (float) (anIntArray5163
					      [((Class38) class38).anInt281])))
			     + ((Class350_Sub2) class350_sub2).v3);
		((Class38) class38_224_).anInt288
		    = (int) (((Class350_Sub2) class350_sub2).v7
			     + ((((Class350_Sub2) class350_sub2).v6
				 * (float) (anIntArray5189
					    [((Class38) class38).anInt281]))
				+ ((((Class350_Sub2) class350_sub2).v4
				    * (float) (anIntArray5163
					       [((Class38) class38).anInt281]))
				   + ((float) (anIntArray5193
					       [((Class38) class38).anInt281])
				      * (((Class350_Sub2) class350_sub2)
					 .v5)))));
		((Class38) class38_224_).anInt290
		    = (int) (((Class350_Sub2) class350_sub2).aFloat5443
			     + (((float) (anIntArray5189
					  [((Class38) class38).anInt281])
				 * ((Class350_Sub2) class350_sub2).aFloat5444)
				+ ((((Class350_Sub2) class350_sub2).aFloat5448
				    * (float) (anIntArray5193
					       [((Class38) class38).anInt281]))
				   + ((((Class350_Sub2) class350_sub2)
				       .aFloat5445)
				      * (float) (anIntArray5163
						 [(((Class38) class38)
						   .anInt281)])))));
	    }
	}
	if (aClass185Array5206 != null) {
	    for (int anLocalInt = 0; aClass185Array5206.length > anLocalInt;
		 anLocalInt++) {
		Class185 class185 = aClass185Array5206[anLocalInt];
		Class185 class185_225_ = class185;
		if (((Class185) class185).aClass185_1387 != null)
		    class185_225_ = ((Class185) class185).aClass185_1387;
		if (((Class185) class185).aClass350_1383 == null)
		    ((Class185) class185).aClass350_1383
			= class350_sub2.method3826();
		else
		    ((Class185) class185).aClass350_1383
			.method3838(class350_sub2);
		((Class185) class185_225_).anInt1384
		    = (int) (((Class350_Sub2) class350_sub2).v3
			     + ((((Class350_Sub2) class350_sub2).v2
				 * (float) (anIntArray5189
					    [((Class185) class185).anInt1389]))
				+ (((float) (anIntArray5193
					     [((Class185) class185).anInt1389])
				    * (((Class350_Sub2) class350_sub2)
				       .v1))
				   + ((((Class350_Sub2) class350_sub2)
				       .v0)
				      * (float) (anIntArray5163
						 [(((Class185) class185)
						   .anInt1389)])))));
		((Class185) class185_225_).anInt1388
		    = (int) (((Class350_Sub2) class350_sub2).v7
			     + (((float) (anIntArray5189
					  [((Class185) class185).anInt1389])
				 * ((Class350_Sub2) class350_sub2).v6)
				+ ((((Class350_Sub2) class350_sub2).v5
				    * (float) (anIntArray5193
					       [(((Class185) class185)
						 .anInt1389)]))
				   + ((((Class350_Sub2) class350_sub2)
				       .v4)
				      * (float) (anIntArray5163
						 [(((Class185) class185)
						   .anInt1389)])))));
		((Class185) class185_225_).anInt1385
		    = (int) (((Class350_Sub2) class350_sub2).aFloat5443
			     + ((((Class350_Sub2) class350_sub2).aFloat5444
				 * (float) (anIntArray5189
					    [((Class185) class185).anInt1389]))
				+ (((float) (anIntArray5163
					     [((Class185) class185).anInt1389])
				    * (((Class350_Sub2) class350_sub2)
				       .aFloat5445))
				   + ((float) (anIntArray5193
					       [(((Class185) class185)
						 .anInt1389)])
				      * (((Class350_Sub2) class350_sub2)
					 .aFloat5448)))));
	    }
	}
    }
    
    final tia_sub_35DoublyLinked ba(tia_sub_35DoublyLinked argument_226_) {
	if (anInt5186 == 0)
	    return null;
	if (!aBoolean5157)
	    method2714(58);
	int anLocalInt;
	int anLocalInt_227_;
	if (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4705 <= 0) {
	    anLocalInt
		= (anInt5185 - (anInt5205 * ((GraphicsToolkit_Sub2)
					     aClass_ha_Sub2_5194).anInt4705
				>> 8)
		   >> ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4701);
	    anLocalInt_227_
		= (anInt5152 - (anInt5178 * ((GraphicsToolkit_Sub2)
					     aClass_ha_Sub2_5194).anInt4705
				>> 8)
		   >> ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4701);
	} else {
	    anLocalInt = (-((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4705
			     * anInt5178)
			    >> 8) + anInt5185
			  >> ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4701);
	    anLocalInt_227_
		= (anInt5152 - ((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				 .anInt4705) * anInt5205
				>> 8)
		   >> ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4701);
	}
	int anLocalInt_228_;
	int anLocalInt_229_;
	if (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4704 > 0) {
	    anLocalInt_228_
		= (anInt5155 - (anInt5178 * ((GraphicsToolkit_Sub2)
					     aClass_ha_Sub2_5194).anInt4704
				>> 8)
		   >> ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4701);
	    anLocalInt_229_
		= (-((anInt5205
		      * ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4704)
		     >> 8) + anInt5182
		   >> ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4701);
	} else {
	    anLocalInt_228_
		= (-((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4704
		      * anInt5205)
		     >> 8) + anInt5155
		   >> ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4701);
	    anLocalInt_229_
		= (-((anInt5178
		      * ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4704)
		     >> 8) + anInt5182
		   >> ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4701);
	}
	int anLocalInt_230_ = -anLocalInt + (anLocalInt_227_ + 1);
	int anLocalInt_231_ = anLocalInt_229_ - anLocalInt_228_ + 1;
	tia_sub_35_Sub1DoublyLinked var_tia_sub_35_Sub1 = (tia_sub_35_Sub1DoublyLinked) argument_226_;
	tia_sub_35_Sub1DoublyLinked var_tia_sub_35_Sub1_232_;
	if (var_tia_sub_35_Sub1 == null
	    || !var_tia_sub_35_Sub1.method1223(anLocalInt_230_, -1,
					       anLocalInt_231_))
	    var_tia_sub_35_Sub1_232_
		= new tia_sub_35_Sub1DoublyLinked(aClass_ha_Sub2_5194, anLocalInt_230_,
				      anLocalInt_231_);
	else {
	    var_tia_sub_35_Sub1_232_ = var_tia_sub_35_Sub1;
	    var_tia_sub_35_Sub1_232_.method1220(126);
	}
	var_tia_sub_35_Sub1_232_.method1221(anLocalInt_227_, anLocalInt_228_,
					    anLocalInt, -25483,
					    anLocalInt_229_);
	method2701(var_tia_sub_35_Sub1_232_, -78);
	return var_tia_sub_35_Sub1_232_;
    }
    
    final boolean NA() {
	if (anIntArrayArray5176 == null)
	    return false;
	for (int anLocalInt = 0; anInt5192 > anLocalInt; anLocalInt++) {
	    anIntArray5163[anLocalInt] <<= 4;
	    anIntArray5193[anLocalInt] <<= 4;
	    anIntArray5189[anLocalInt] <<= 4;
	}
	Statics.anInt6646 = 0;
	JagexHashMap.anInt489 = 0;
	Class44.anInt312 = 0;
	return true;
    }
    
    final boolean method2645(int argument_233_, int argument_234_,
			     Class350 argument_235_, boolean argument_236_,
			     int argument_237_) {
	return method2709(argument_236_, argument_237_, argument_233_, -15442,
			  -1, argument_235_, argument_234_);
    }
    
    final void method2647() {
	/* empty */
    }
    
    private final void method2705(boolean argument_238_) {
	if (aClass247_5199 != null)
	    ((Class247) aClass247_5199).aBoolean1794 = false;
	if (argument_238_ != true)
	    V();
    }
    
    public static void method2706(int argument) {
	aClass149_5165 = null;
    }
    
    final int da() {
	return aShort5188;
    }
    
    final void I(int argument_239_, int[] argument_240_, int argument_241_,
		 int argument_242_, int argument_243_, boolean argument_244_,
		 int argument_245_, int[] argument_246_) {
	int anLocalInt = argument_240_.length;
	if (argument_239_ == 0) {
	    argument_243_ <<= 4;
	    argument_241_ <<= 4;
	    argument_242_ <<= 4;
	    Statics.anInt6646 = 0;
	    int anLocalInt_247_ = 0;
	    JagexHashMap.anInt489 = 0;
	    Class44.anInt312 = 0;
	    for (int anLocalInt_248_ = 0; anLocalInt_248_ < anLocalInt;
		 anLocalInt_248_++) {
		int anLocalInt_249_ = argument_240_[anLocalInt_248_];
		if (anLocalInt_249_ < anIntArrayArray5176.length) {
		    int[] anLocalInts = anIntArrayArray5176[anLocalInt_249_];
		    for (int anLocalInt_250_ = 0;
			 anLocalInt_250_ < anLocalInts.length;
			 anLocalInt_250_++) {
			int anLocalInt_251_ = anLocalInts[anLocalInt_250_];
			if (aShortArray5183 == null
			    || (argument_245_
				& aShortArray5183[anLocalInt_251_]) != 0) {
			    Class44.anInt312
				+= anIntArray5163[anLocalInt_251_];
			    JagexHashMap.anInt489
				+= anIntArray5193[anLocalInt_251_];
			    Statics.anInt6646
				+= anIntArray5189[anLocalInt_251_];
			    anLocalInt_247_++;
			}
		    }
		}
	    }
	    if (anLocalInt_247_ <= 0) {
		Class44.anInt312 = argument_241_;
		JagexHashMap.anInt489 = argument_242_;
		Statics.anInt6646 = argument_243_;
	    } else {
		Class372.aBoolean3193 = true;
		Statics.anInt6646
		    = (Statics.anInt6646 / anLocalInt_247_
		       + argument_243_);
		Class44.anInt312
		    = Class44.anInt312 / anLocalInt_247_ + argument_241_;
		JagexHashMap.anInt489
		    = argument_242_ + JagexHashMap.anInt489 / anLocalInt_247_;
	    }
	} else if (argument_239_ == 1) {
	    if (argument_246_ != null) {
		int anLocalInt_252_ = ((argument_242_ * argument_246_[1] + 8192
					+ (argument_241_ * argument_246_[0]
					   + argument_243_ * argument_246_[2]))
				       >> 14);
		int anLocalInt_253_ = ((argument_243_ * argument_246_[5] + 8192
					+ (argument_241_ * argument_246_[3]
					   + argument_242_ * argument_246_[4]))
				       >> 14);
		int anLocalInt_254_
		    = ((argument_242_ * argument_246_[7]
			+ argument_246_[6] * argument_241_
			- (-(argument_243_ * argument_246_[8]) - 8192))
		       >> 14);
		argument_243_ = anLocalInt_254_;
		argument_241_ = anLocalInt_252_;
		argument_242_ = anLocalInt_253_;
	    }
	    argument_242_ <<= 4;
	    argument_243_ <<= 4;
	    argument_241_ <<= 4;
	    for (int anLocalInt_255_ = 0; anLocalInt_255_ < anLocalInt;
		 anLocalInt_255_++) {
		int anLocalInt_256_ = argument_240_[anLocalInt_255_];
		if (anLocalInt_256_ < anIntArrayArray5176.length) {
		    int[] anLocalInts = anIntArrayArray5176[anLocalInt_256_];
		    for (int anLocalInt_257_ = 0;
			 anLocalInts.length > anLocalInt_257_;
			 anLocalInt_257_++) {
			int anLocalInt_258_ = anLocalInts[anLocalInt_257_];
			if (aShortArray5183 == null
			    || (argument_245_
				& aShortArray5183[anLocalInt_258_]) != 0) {
			    anIntArray5163[anLocalInt_258_] += argument_241_;
			    anIntArray5193[anLocalInt_258_] += argument_242_;
			    anIntArray5189[anLocalInt_258_] += argument_243_;
			}
		    }
		}
	    }
	} else if (argument_239_ == 2) {
	    if (argument_246_ == null) {
		for (int anLocalInt_259_ = 0; anLocalInt > anLocalInt_259_;
		     anLocalInt_259_++) {
		    int anLocalInt_260_ = argument_240_[anLocalInt_259_];
		    if (anLocalInt_260_ < anIntArrayArray5176.length) {
			int[] anLocalInts
			    = anIntArrayArray5176[anLocalInt_260_];
			for (int anLocalInt_261_ = 0;
			     anLocalInts.length > anLocalInt_261_;
			     anLocalInt_261_++) {
			    int anLocalInt_262_ = anLocalInts[anLocalInt_261_];
			    if (aShortArray5183 == null
				|| (argument_245_
				    & aShortArray5183[anLocalInt_262_]) != 0) {
				anIntArray5163[anLocalInt_262_]
				    -= Class44.anInt312;
				anIntArray5193[anLocalInt_262_]
				    -= JagexHashMap.anInt489;
				anIntArray5189[anLocalInt_262_]
				    -= Statics.anInt6646;
				if (argument_243_ != 0) {
				    int anLocalInt_263_
					= (Node_Sub6.SINETABLE
					   [argument_243_]);
				    int anLocalInt_264_
					= (Node_Sub6.COSINETABLE
					   [argument_243_]);
				    int anLocalInt_265_
					= (((anLocalInt_264_
					     * anIntArray5163[anLocalInt_262_])
					    + 16383
					    + (anIntArray5193[anLocalInt_262_]
					       * anLocalInt_263_))
					   >> 14);
				    anIntArray5193[anLocalInt_262_]
					= (-(anIntArray5163[anLocalInt_262_]
					     * anLocalInt_263_)
					   + ((anLocalInt_264_
					       * (anIntArray5193
						  [anLocalInt_262_]))
					      + 16383)) >> 14;
				    anIntArray5163[anLocalInt_262_]
					= anLocalInt_265_;
				}
				if (argument_241_ != 0) {
				    int anLocalInt_266_
					= (Node_Sub6.SINETABLE
					   [argument_241_]);
				    int anLocalInt_267_
					= (Node_Sub6.COSINETABLE
					   [argument_241_]);
				    int anLocalInt_268_
					= (-(anLocalInt_266_
					     * anIntArray5189[anLocalInt_262_])
					   + (anIntArray5193[anLocalInt_262_]
					      * anLocalInt_267_)
					   + 16383) >> 14;
				    anIntArray5189[anLocalInt_262_]
					= ((anLocalInt_266_
					    * anIntArray5193[anLocalInt_262_])
					   + (anIntArray5189[anLocalInt_262_]
					      * anLocalInt_267_)
					   + 16383) >> 14;
				    anIntArray5193[anLocalInt_262_]
					= anLocalInt_268_;
				}
				if (argument_242_ != 0) {
				    int anLocalInt_269_
					= (Node_Sub6.SINETABLE
					   [argument_242_]);
				    int anLocalInt_270_
					= (Node_Sub6.COSINETABLE
					   [argument_242_]);
				    int anLocalInt_271_
					= (((anIntArray5189[anLocalInt_262_]
					     * anLocalInt_269_)
					    + (anIntArray5163[anLocalInt_262_]
					       * anLocalInt_270_)
					    + 16383)
					   >> 14);
				    anIntArray5189[anLocalInt_262_]
					= ((anIntArray5189[anLocalInt_262_]
					    * anLocalInt_270_)
					   + 16383
					   - (anIntArray5163[anLocalInt_262_]
					      * anLocalInt_269_)) >> 14;
				    anIntArray5163[anLocalInt_262_]
					= anLocalInt_271_;
				}
				anIntArray5163[anLocalInt_262_]
				    += Class44.anInt312;
				anIntArray5193[anLocalInt_262_]
				    += JagexHashMap.anInt489;
				anIntArray5189[anLocalInt_262_]
				    += Statics.anInt6646;
			    }
			}
		    }
		}
		if (argument_244_) {
		    for (int anLocalInt_272_ = 0; anLocalInt > anLocalInt_272_;
			 anLocalInt_272_++) {
			int anLocalInt_273_ = argument_240_[anLocalInt_272_];
			if (anLocalInt_273_ < anIntArrayArray5176.length) {
			    int[] anLocalInts
				= anIntArrayArray5176[anLocalInt_273_];
			    for (int anLocalInt_274_ = 0;
				 anLocalInts.length > anLocalInt_274_;
				 anLocalInt_274_++) {
				int anLocalInt_275_
				    = anLocalInts[anLocalInt_274_];
				if (aShortArray5183 == null
				    || ((argument_245_
					 & aShortArray5183[anLocalInt_275_])
					!= 0)) {
				    int anLocalInt_276_
					= anIntArray5202[anLocalInt_275_];
				    int anLocalInt_277_
					= anIntArray5202[anLocalInt_275_ + 1];
				    for (int anLocalInt_278_ = anLocalInt_276_;
					 anLocalInt_277_ > anLocalInt_278_;
					 anLocalInt_278_++) {
					int anLocalInt_279_
					    = (aShortArray5174[anLocalInt_278_]
					       - 1);
					if (anLocalInt_279_ == -1)
					    break;
					if (argument_243_ != 0) {
					    int anLocalInt_280_
						= (Node_Sub6.SINETABLE
						   [argument_243_]);
					    int anLocalInt_281_
						= (Node_Sub6.COSINETABLE
						   [argument_243_]);
					    int anLocalInt_282_
						= (((anLocalInt_280_
						     * (aShortArray5187
							[anLocalInt_279_]))
						    + 16383
						    + ((aShortArray5166
							[anLocalInt_279_])
						       * anLocalInt_281_))
						   >> 14);
					    aShortArray5187[anLocalInt_279_]
						= (short) ((-(anLocalInt_280_
							      * (aShortArray5166
								 [anLocalInt_279_]))
							    + 16383
							    + (anLocalInt_281_
							       * (aShortArray5187
								  [anLocalInt_279_])))
							   >> 14);
					    aShortArray5166[anLocalInt_279_]
						= (short) anLocalInt_282_;
					}
					if (argument_241_ != 0) {
					    int anLocalInt_283_
						= (Node_Sub6.SINETABLE
						   [argument_241_]);
					    int anLocalInt_284_
						= (Node_Sub6.COSINETABLE
						   [argument_241_]);
					    int anLocalInt_285_
						= ((-((aShortArray5197
						       [anLocalInt_279_])
						      * anLocalInt_283_)
						    + ((aShortArray5187
							[anLocalInt_279_])
						       * anLocalInt_284_)
						    + 16383)
						   >> 14);
					    aShortArray5197[anLocalInt_279_]
						= (short) ((((aShortArray5197
							      [anLocalInt_279_])
							     * anLocalInt_284_)
							    + ((aShortArray5187
								[anLocalInt_279_])
							       * anLocalInt_283_)
							    + 16383)
							   >> 14);
					    aShortArray5187[anLocalInt_279_]
						= (short) anLocalInt_285_;
					}
					if (argument_242_ != 0) {
					    int anLocalInt_286_
						= (Node_Sub6.SINETABLE
						   [argument_242_]);
					    int anLocalInt_287_
						= (Node_Sub6.COSINETABLE
						   [argument_242_]);
					    int anLocalInt_288_
						= (((anLocalInt_287_
						     * (aShortArray5166
							[anLocalInt_279_]))
						    + ((aShortArray5197
							[anLocalInt_279_])
						       * anLocalInt_286_)
						    + 16383)
						   >> 14);
					    aShortArray5197[anLocalInt_279_]
						= (short) ((-(anLocalInt_286_
							      * (aShortArray5166
								 [anLocalInt_279_]))
							    + ((aShortArray5197
								[anLocalInt_279_])
							       * anLocalInt_287_)
							    + 16383)
							   >> 14);
					    aShortArray5166[anLocalInt_279_]
						= (short) anLocalInt_288_;
					}
				    }
				}
			    }
			}
		    }
		    method2708((byte) 40);
		}
	    } else {
		int anLocalInt_289_ = argument_246_[9] << 4;
		int anLocalInt_290_ = argument_246_[10] << 4;
		int anLocalInt_291_ = argument_246_[11] << 4;
		int anLocalInt_292_ = argument_246_[12] << 4;
		int anLocalInt_293_ = argument_246_[13] << 4;
		int anLocalInt_294_ = argument_246_[14] << 4;
		if (Class372.aBoolean3193) {
		    int anLocalInt_295_
			= (argument_246_[6] * Statics.anInt6646
			   + (argument_246_[3] * JagexHashMap.anInt489
			      + Class44.anInt312 * argument_246_[0])
			   + 8192) >> 14;
		    int anLocalInt_296_
			= (Statics.anInt6646 * argument_246_[7]
			   + (Class44.anInt312 * argument_246_[1]
			      + argument_246_[4] * JagexHashMap.anInt489)
			   + 8192) >> 14;
		    anLocalInt_296_ += anLocalInt_293_;
		    anLocalInt_295_ += anLocalInt_292_;
		    int anLocalInt_297_
			= (argument_246_[8] * Statics.anInt6646
			   + (Class44.anInt312 * argument_246_[2]
			      + argument_246_[5] * JagexHashMap.anInt489)
			   + 8192) >> 14;
		    Class44.anInt312 = anLocalInt_295_;
		    anLocalInt_297_ += anLocalInt_294_;
		    JagexHashMap.anInt489 = anLocalInt_296_;
		    Class372.aBoolean3193 = false;
		    Statics.anInt6646 = anLocalInt_297_;
		}
		int[] anLocalInts = new int[9];
		int anLocalInt_298_
		    = Node_Sub6.COSINETABLE[argument_241_];
		int anLocalInt_299_
		    = Node_Sub6.SINETABLE[argument_241_];
		int anLocalInt_300_
		    = Node_Sub6.COSINETABLE[argument_242_];
		int anLocalInt_301_
		    = Node_Sub6.SINETABLE[argument_242_];
		int anLocalInt_302_
		    = Node_Sub6.COSINETABLE[argument_243_];
		int anLocalInt_303_
		    = Node_Sub6.SINETABLE[argument_243_];
		int anLocalInt_304_
		    = anLocalInt_302_ * anLocalInt_299_ + 8192 >> 14;
		int anLocalInt_305_
		    = anLocalInt_303_ * anLocalInt_299_ + 8192 >> 14;
		anLocalInts[2]
		    = anLocalInt_298_ * anLocalInt_301_ + 8192 >> 14;
		anLocalInts[6]
		    = (-anLocalInt_301_ * anLocalInt_302_
		       + (anLocalInt_300_ * anLocalInt_305_ + 8192)) >> 14;
		anLocalInts[8]
		    = anLocalInt_300_ * anLocalInt_298_ + 8192 >> 14;
		anLocalInts[7]
		    = (anLocalInt_300_ * anLocalInt_304_
		       + anLocalInt_301_ * anLocalInt_303_ + 8192) >> 14;
		anLocalInts[4]
		    = anLocalInt_298_ * anLocalInt_302_ + 8192 >> 14;
		anLocalInts[1]
		    = (-anLocalInt_300_ * anLocalInt_303_
		       + anLocalInt_301_ * anLocalInt_304_ + 8192) >> 14;
		anLocalInts[5] = -anLocalInt_299_;
		anLocalInts[0]
		    = (anLocalInt_305_ * anLocalInt_301_
		       + anLocalInt_302_ * anLocalInt_300_ + 8192) >> 14;
		anLocalInts[3]
		    = anLocalInt_298_ * anLocalInt_303_ + 8192 >> 14;
		int anLocalInt_306_
		    = ((-JagexHashMap.anInt489 * anLocalInts[1]
			+ -Class44.anInt312 * anLocalInts[0]
			+ anLocalInts[2] * -Statics.anInt6646
			+ 8192)
		       >> 14);
		int anLocalInt_307_
		    = ((anLocalInts[5] * -Statics.anInt6646
			+ -Class44.anInt312 * anLocalInts[3]
			- (-(-JagexHashMap.anInt489 * anLocalInts[4]) - 8192))
		       >> 14);
		int anLocalInt_308_
		    = (-JagexHashMap.anInt489 * anLocalInts[7]
		       + (anLocalInts[6] * -Class44.anInt312
			  + anLocalInts[8] * -Statics.anInt6646
			  + 8192)) >> 14;
		int anLocalInt_309_ = Class44.anInt312 + anLocalInt_306_;
		int anLocalInt_310_ = JagexHashMap.anInt489 + anLocalInt_307_;
		int anLocalInt_311_
		    = Statics.anInt6646 + anLocalInt_308_;
		int[] anLocalInts_312_ = new int[9];
		for (int anLocalInt_313_ = 0; anLocalInt_313_ < 3;
		     anLocalInt_313_++) {
		    for (int anLocalInt_314_ = 0; anLocalInt_314_ < 3;
			 anLocalInt_314_++) {
			int anLocalInt_315_ = 0;
			for (int anLocalInt_316_ = 0; anLocalInt_316_ < 3;
			     anLocalInt_316_++)
			    anLocalInt_315_
				+= ((argument_246_
				     [anLocalInt_316_ + anLocalInt_314_ * 3])
				    * anLocalInts[(anLocalInt_313_ * 3
						   + anLocalInt_316_)]);
			anLocalInts_312_[anLocalInt_313_ * 3 + anLocalInt_314_]
			    = anLocalInt_315_ + 8192 >> 14;
		    }
		}
		int anLocalInt_317_
		    = ((anLocalInt_294_ * anLocalInts[2]
			+ anLocalInt_292_ * anLocalInts[0]
			+ anLocalInt_293_ * anLocalInts[1] + 8192)
		       >> 14);
		int anLocalInt_318_
		    = ((anLocalInts[4] * anLocalInt_293_
			+ anLocalInts[3] * anLocalInt_292_
			+ (anLocalInts[5] * anLocalInt_294_ + 8192))
		       >> 14);
		anLocalInt_317_ += anLocalInt_309_;
		int anLocalInt_319_ = ((anLocalInts[8] * anLocalInt_294_
					+ (anLocalInts[7] * anLocalInt_293_
					   + anLocalInt_292_ * anLocalInts[6])
					+ 8192)
				       >> 14);
		anLocalInt_318_ += anLocalInt_310_;
		anLocalInt_319_ += anLocalInt_311_;
		int[] anLocalInts_320_ = new int[9];
		for (int anLocalInt_321_ = 0; anLocalInt_321_ < 3;
		     anLocalInt_321_++) {
		    for (int anLocalInt_322_ = 0; anLocalInt_322_ < 3;
			 anLocalInt_322_++) {
			int anLocalInt_323_ = 0;
			for (int anLocalInt_324_ = 0; anLocalInt_324_ < 3;
			     anLocalInt_324_++)
			    anLocalInt_323_
				+= ((argument_246_
				     [anLocalInt_324_ + anLocalInt_321_ * 3])
				    * (anLocalInts_312_
				       [(anLocalInt_322_
					 + anLocalInt_324_ * 3)]));
			anLocalInts_320_[anLocalInt_321_ * 3 + anLocalInt_322_]
			    = anLocalInt_323_ + 8192 >> 14;
		    }
		}
		int anLocalInt_325_
		    = ((argument_246_[2] * anLocalInt_319_ + 8192
			+ argument_246_[1] * anLocalInt_318_
			+ argument_246_[0] * anLocalInt_317_)
		       >> 14);
		int anLocalInt_326_
		    = ((argument_246_[5] * anLocalInt_319_ + 8192
			+ anLocalInt_318_ * argument_246_[4]
			+ anLocalInt_317_ * argument_246_[3])
		       >> 14);
		anLocalInt_325_ += anLocalInt_289_;
		anLocalInt_326_ += anLocalInt_290_;
		int anLocalInt_327_ = (anLocalInt_317_ * argument_246_[6]
				       + (anLocalInt_318_ * argument_246_[7]
					  + argument_246_[8] * anLocalInt_319_)
				       + 8192) >> 14;
		anLocalInt_327_ += anLocalInt_291_;
		for (int anLocalInt_328_ = 0; anLocalInt > anLocalInt_328_;
		     anLocalInt_328_++) {
		    int anLocalInt_329_ = argument_240_[anLocalInt_328_];
		    if (anIntArrayArray5176.length > anLocalInt_329_) {
			int[] anLocalInts_330_
			    = anIntArrayArray5176[anLocalInt_329_];
			for (int anLocalInt_331_ = 0;
			     anLocalInts_330_.length > anLocalInt_331_;
			     anLocalInt_331_++) {
			    int anLocalInt_332_
				= anLocalInts_330_[anLocalInt_331_];
			    if (aShortArray5183 == null
				|| (argument_245_
				    & aShortArray5183[anLocalInt_332_]) != 0) {
				int anLocalInt_333_
				    = (((anIntArray5163[anLocalInt_332_]
					 * anLocalInts_320_[0])
					+ (anIntArray5193[anLocalInt_332_]
					   * anLocalInts_320_[1])
					+ (anLocalInts_320_[2]
					   * anIntArray5189[anLocalInt_332_])
					+ 8192)
				       >> 14);
				int anLocalInt_334_
				    = (((anLocalInts_320_[5]
					 * anIntArray5189[anLocalInt_332_])
					+ (anLocalInts_320_[4]
					   * anIntArray5193[anLocalInt_332_])
					+ (anIntArray5163[anLocalInt_332_]
					   * anLocalInts_320_[3])
					+ 8192)
				       >> 14);
				anLocalInt_333_ += anLocalInt_325_;
				anLocalInt_334_ += anLocalInt_326_;
				int anLocalInt_335_
				    = (((anIntArray5189[anLocalInt_332_]
					 * anLocalInts_320_[8])
					+ 8192
					+ (anLocalInts_320_[7]
					   * anIntArray5193[anLocalInt_332_])
					+ (anLocalInts_320_[6]
					   * anIntArray5163[anLocalInt_332_]))
				       >> 14);
				anIntArray5163[anLocalInt_332_]
				    = anLocalInt_333_;
				anLocalInt_335_ += anLocalInt_327_;
				anIntArray5193[anLocalInt_332_]
				    = anLocalInt_334_;
				anIntArray5189[anLocalInt_332_]
				    = anLocalInt_335_;
			    }
			}
		    }
		}
	    }
	} else if (argument_239_ == 3) {
	    if (argument_246_ == null) {
		for (int anLocalInt_336_ = 0; anLocalInt_336_ < anLocalInt;
		     anLocalInt_336_++) {
		    int anLocalInt_337_ = argument_240_[anLocalInt_336_];
		    if (anLocalInt_337_ < anIntArrayArray5176.length) {
			int[] anLocalInts
			    = anIntArrayArray5176[anLocalInt_337_];
			for (int anLocalInt_338_ = 0;
			     anLocalInt_338_ < anLocalInts.length;
			     anLocalInt_338_++) {
			    int anLocalInt_339_ = anLocalInts[anLocalInt_338_];
			    if (aShortArray5183 == null
				|| (aShortArray5183[anLocalInt_339_]
				    & argument_245_) != 0) {
				anIntArray5163[anLocalInt_339_]
				    -= Class44.anInt312;
				anIntArray5193[anLocalInt_339_]
				    -= JagexHashMap.anInt489;
				anIntArray5189[anLocalInt_339_]
				    -= Statics.anInt6646;
				anIntArray5163[anLocalInt_339_]
				    = (anIntArray5163[anLocalInt_339_]
				       * argument_241_) >> 7;
				anIntArray5193[anLocalInt_339_]
				    = (argument_242_
				       * anIntArray5193[anLocalInt_339_]) >> 7;
				anIntArray5189[anLocalInt_339_]
				    = (argument_243_
				       * anIntArray5189[anLocalInt_339_]) >> 7;
				anIntArray5163[anLocalInt_339_]
				    += Class44.anInt312;
				anIntArray5193[anLocalInt_339_]
				    += JagexHashMap.anInt489;
				anIntArray5189[anLocalInt_339_]
				    += Statics.anInt6646;
			    }
			}
		    }
		}
	    } else {
		int anLocalInt_340_ = argument_246_[9] << 4;
		int anLocalInt_341_ = argument_246_[10] << 4;
		int anLocalInt_342_ = argument_246_[11] << 4;
		int anLocalInt_343_ = argument_246_[12] << 4;
		int anLocalInt_344_ = argument_246_[13] << 4;
		int anLocalInt_345_ = argument_246_[14] << 4;
		if (Class372.aBoolean3193) {
		    int anLocalInt_346_
			= ((argument_246_[3] * JagexHashMap.anInt489
			    + (Class44.anInt312 * argument_246_[0]
			       + (Statics.anInt6646
				  * argument_246_[6]))
			    + 8192)
			   >> 14);
		    int anLocalInt_347_
			= ((JagexHashMap.anInt489 * argument_246_[4] + 8192
			    + Class44.anInt312 * argument_246_[1]
			    + (argument_246_[7]
			       * Statics.anInt6646))
			   >> 14);
		    anLocalInt_346_ += anLocalInt_343_;
		    int anLocalInt_348_
			= ((argument_246_[2] * Class44.anInt312 + 8192
			    + (argument_246_[5] * JagexHashMap.anInt489
			       + (argument_246_[8]
				  * Statics.anInt6646)))
			   >> 14);
		    anLocalInt_347_ += anLocalInt_344_;
		    JagexHashMap.anInt489 = anLocalInt_347_;
		    anLocalInt_348_ += anLocalInt_345_;
		    Class44.anInt312 = anLocalInt_346_;
		    Statics.anInt6646 = anLocalInt_348_;
		    Class372.aBoolean3193 = false;
		}
		int anLocalInt_349_ = argument_241_ << 15 >> 7;
		int anLocalInt_350_ = argument_242_ << 15 >> 7;
		int anLocalInt_351_ = argument_243_ << 15 >> 7;
		int anLocalInt_352_
		    = anLocalInt_349_ * -Class44.anInt312 + 8192 >> 14;
		int anLocalInt_353_
		    = -JagexHashMap.anInt489 * anLocalInt_350_ + 8192 >> 14;
		int anLocalInt_354_
		    = ((anLocalInt_351_ * -Statics.anInt6646
			+ 8192)
		       >> 14);
		int anLocalInt_355_ = anLocalInt_352_ + Class44.anInt312;
		int anLocalInt_356_ = JagexHashMap.anInt489 + anLocalInt_353_;
		int anLocalInt_357_
		    = Statics.anInt6646 + anLocalInt_354_;
		int[] anLocalInts = new int[9];
		anLocalInts[2]
		    = argument_246_[6] * anLocalInt_349_ + 8192 >> 14;
		anLocalInts[1]
		    = argument_246_[3] * anLocalInt_349_ + 8192 >> 14;
		anLocalInts[0]
		    = anLocalInt_349_ * argument_246_[0] + 8192 >> 14;
		anLocalInts[3]
		    = argument_246_[1] * anLocalInt_350_ + 8192 >> 14;
		anLocalInts[5]
		    = argument_246_[7] * anLocalInt_350_ + 8192 >> 14;
		anLocalInts[4]
		    = argument_246_[4] * anLocalInt_350_ + 8192 >> 14;
		anLocalInts[6]
		    = argument_246_[2] * anLocalInt_351_ + 8192 >> 14;
		anLocalInts[7]
		    = anLocalInt_351_ * argument_246_[5] + 8192 >> 14;
		anLocalInts[8]
		    = argument_246_[8] * anLocalInt_351_ + 8192 >> 14;
		int anLocalInt_358_
		    = anLocalInt_349_ * anLocalInt_343_ + 8192 >> 14;
		int anLocalInt_359_
		    = anLocalInt_344_ * anLocalInt_350_ + 8192 >> 14;
		anLocalInt_359_ += anLocalInt_356_;
		int anLocalInt_360_
		    = anLocalInt_345_ * anLocalInt_351_ + 8192 >> 14;
		anLocalInt_358_ += anLocalInt_355_;
		anLocalInt_360_ += anLocalInt_357_;
		int[] anLocalInts_361_ = new int[9];
		for (int anLocalInt_362_ = 0; anLocalInt_362_ < 3;
		     anLocalInt_362_++) {
		    for (int anLocalInt_363_ = 0; anLocalInt_363_ < 3;
			 anLocalInt_363_++) {
			int anLocalInt_364_ = 0;
			for (int anLocalInt_365_ = 0; anLocalInt_365_ < 3;
			     anLocalInt_365_++)
			    anLocalInt_364_
				+= ((anLocalInts
				     [anLocalInt_365_ * 3 + anLocalInt_363_])
				    * argument_246_[(anLocalInt_362_ * 3
						     + anLocalInt_365_)]);
			anLocalInts_361_[anLocalInt_363_ + anLocalInt_362_ * 3]
			    = anLocalInt_364_ + 8192 >> 14;
		    }
		}
		int anLocalInt_366_
		    = ((anLocalInt_358_ * argument_246_[0]
			+ anLocalInt_359_ * argument_246_[1]
			- (-(anLocalInt_360_ * argument_246_[2]) - 8192))
		       >> 14);
		int anLocalInt_367_
		    = ((argument_246_[3] * anLocalInt_358_
			+ anLocalInt_359_ * argument_246_[4] + 8192
			+ anLocalInt_360_ * argument_246_[5])
		       >> 14);
		anLocalInt_366_ += anLocalInt_340_;
		anLocalInt_367_ += anLocalInt_341_;
		int anLocalInt_368_
		    = ((anLocalInt_360_ * argument_246_[8]
			+ (anLocalInt_358_ * argument_246_[6]
			   + argument_246_[7] * anLocalInt_359_ + 8192))
		       >> 14);
		anLocalInt_368_ += anLocalInt_342_;
		for (int anLocalInt_369_ = 0; anLocalInt_369_ < anLocalInt;
		     anLocalInt_369_++) {
		    int anLocalInt_370_ = argument_240_[anLocalInt_369_];
		    if (anLocalInt_370_ < anIntArrayArray5176.length) {
			int[] anLocalInts_371_
			    = anIntArrayArray5176[anLocalInt_370_];
			for (int anLocalInt_372_ = 0;
			     anLocalInts_371_.length > anLocalInt_372_;
			     anLocalInt_372_++) {
			    int anLocalInt_373_
				= anLocalInts_371_[anLocalInt_372_];
			    if (aShortArray5183 == null
				|| (aShortArray5183[anLocalInt_373_]
				    & argument_245_) != 0) {
				int anLocalInt_374_
				    = (((anLocalInts_361_[2]
					 * anIntArray5189[anLocalInt_373_])
					+ (anLocalInts_361_[0]
					   * anIntArray5163[anLocalInt_373_])
					+ (anIntArray5193[anLocalInt_373_]
					   * anLocalInts_361_[1])
					+ 8192)
				       >> 14);
				int anLocalInt_375_
				    = (((anIntArray5189[anLocalInt_373_]
					 * anLocalInts_361_[5])
					+ ((anLocalInts_361_[4]
					    * anIntArray5193[anLocalInt_373_])
					   + (anIntArray5163[anLocalInt_373_]
					      * anLocalInts_361_[3]))
					+ 8192)
				       >> 14);
				int anLocalInt_376_
				    = (((anIntArray5189[anLocalInt_373_]
					 * anLocalInts_361_[8])
					+ ((anIntArray5193[anLocalInt_373_]
					    * anLocalInts_361_[7])
					   + (anLocalInts_361_[6]
					      * (anIntArray5163
						 [anLocalInt_373_])))
					+ 8192)
				       >> 14);
				anLocalInt_374_ += anLocalInt_366_;
				anLocalInt_375_ += anLocalInt_367_;
				anIntArray5163[anLocalInt_373_]
				    = anLocalInt_374_;
				anLocalInt_376_ += anLocalInt_368_;
				anIntArray5193[anLocalInt_373_]
				    = anLocalInt_375_;
				anIntArray5189[anLocalInt_373_]
				    = anLocalInt_376_;
			    }
			}
		    }
		}
	    }
	} else if (argument_239_ == 5) {
	    if (anIntArrayArray5146 != null) {
		boolean anLocalBoolean = false;
		for (int anLocalInt_377_ = 0; anLocalInt_377_ < anLocalInt;
		     anLocalInt_377_++) {
		    int anLocalInt_378_ = argument_240_[anLocalInt_377_];
		    if (anIntArrayArray5146.length > anLocalInt_378_) {
			int[] anLocalInts
			    = anIntArrayArray5146[anLocalInt_378_];
			for (int anLocalInt_379_ = 0;
			     anLocalInt_379_ < anLocalInts.length;
			     anLocalInt_379_++) {
			    int anLocalInt_380_ = anLocalInts[anLocalInt_379_];
			    if (aShortArray5198 == null
				|| (argument_245_
				    & aShortArray5198[anLocalInt_380_]) != 0) {
				int anLocalInt_381_
				    = (argument_241_ * 8
				       + (aByteArray5184[anLocalInt_380_]
					  & 0xff));
				if (anLocalInt_381_ < 0)
				    anLocalInt_381_ = 0;
				else if (anLocalInt_381_ > 255)
				    anLocalInt_381_ = 255;
				aByteArray5184[anLocalInt_380_]
				    = (byte) anLocalInt_381_;
			    }
			}
			anLocalBoolean
			    = anLocalBoolean | anLocalInts.length > 0;
		    }
		}
		if (anLocalBoolean) {
		    if (aClass55Array5203 != null) {
			for (int anLocalInt_382_ = 0;
			     anInt5159 > anLocalInt_382_; anLocalInt_382_++) {
			    Class55 class55
				= aClass55Array5203[anLocalInt_382_];
			    Class163 class163
				= aClass163Array5156[anLocalInt_382_];
			    ((Class163) class163).anInt1196
				= (-((aByteArray5184
				      [((Class55) class55).anInt396])
				     & 0xff) + 255 << 24
				   | (((Class163) class163).anInt1196
				      & 0xffffff));
			}
		    }
		    method2712(-28645);
		}
	    }
	} else if (argument_239_ == 7) {
	    if (anIntArrayArray5146 != null) {
		boolean anLocalBoolean = false;
		for (int anLocalInt_383_ = 0; anLocalInt_383_ < anLocalInt;
		     anLocalInt_383_++) {
		    int anLocalInt_384_ = argument_240_[anLocalInt_383_];
		    if (anIntArrayArray5146.length > anLocalInt_384_) {
			int[] anLocalInts
			    = anIntArrayArray5146[anLocalInt_384_];
			for (int anLocalInt_385_ = 0;
			     anLocalInts.length > anLocalInt_385_;
			     anLocalInt_385_++) {
			    int anLocalInt_386_ = anLocalInts[anLocalInt_385_];
			    if (aShortArray5198 == null
				|| (argument_245_
				    & aShortArray5198[anLocalInt_386_]) != 0) {
				int anLocalInt_387_
				    = (aShortArray5168[anLocalInt_386_]
				       & 0xffff);
				int anLocalInt_388_
				    = anLocalInt_387_ >> 10 & 0x3f;
				int anLocalInt_389_
				    = (anLocalInt_387_ & 0x383) >> 7;
				anLocalInt_388_
				    = argument_241_ + anLocalInt_388_ & 0x3f;
				anLocalInt_389_ += argument_242_ / 4;
				int anLocalInt_390_ = anLocalInt_387_ & 0x7f;
				if (anLocalInt_389_ >= 0) {
				    if (anLocalInt_389_ > 7)
					anLocalInt_389_ = 7;
				} else
				    anLocalInt_389_ = 0;
				anLocalInt_390_ += argument_243_;
				if (anLocalInt_390_ < 0)
				    anLocalInt_390_ = 0;
				else if (anLocalInt_390_ > 127)
				    anLocalInt_390_ = 127;
				aShortArray5168[anLocalInt_386_]
				    = (short) (MathStatics.OR
					       ((MathStatics.OR(anLocalInt_388_ << 10, anLocalInt_389_ << 7)), anLocalInt_390_));
			    }
			}
			anLocalBoolean
			    = anLocalBoolean | anLocalInts.length > 0;
		    }
		}
		if (anLocalBoolean) {
		    if (aClass55Array5203 != null) {
			for (int anLocalInt_391_ = 0;
			     anInt5159 > anLocalInt_391_; anLocalInt_391_++) {
			    Class55 class55
				= aClass55Array5203[anLocalInt_391_];
			    Class163 class163
				= aClass163Array5156[anLocalInt_391_];
			    ((Class163) class163).anInt1196
				= (((Class163) class163).anInt1196 & ~0xffffff
				   | ((HslToRgb.table
				       [aShortArray5168[(((Class55) class55)
							 .anInt396)] & 0xffff])
				      & 0xffffff));
			}
		    }
		    method2712(-28645);
		}
	    }
	} else if (argument_239_ == 8) {
	    if (anIntArrayArray5179 != null) {
		for (int anLocalInt_392_ = 0; anLocalInt_392_ < anLocalInt;
		     anLocalInt_392_++) {
		    int anLocalInt_393_ = argument_240_[anLocalInt_392_];
		    if (anLocalInt_393_ < anIntArrayArray5179.length) {
			int[] anLocalInts
			    = anIntArrayArray5179[anLocalInt_393_];
			for (int anLocalInt_394_ = 0;
			     anLocalInts.length > anLocalInt_394_;
			     anLocalInt_394_++) {
			    Class163 class163
				= (aClass163Array5156
				   [anLocalInts[anLocalInt_394_]]);
			    ((Class163) class163).anInt1192 += argument_241_;
			    ((Class163) class163).anInt1193 += argument_242_;
			}
		    }
		}
	    }
	} else if (argument_239_ == 10) {
	    if (anIntArrayArray5179 != null) {
		for (int anLocalInt_395_ = 0; anLocalInt > anLocalInt_395_;
		     anLocalInt_395_++) {
		    int anLocalInt_396_ = argument_240_[anLocalInt_395_];
		    if (anLocalInt_396_ < anIntArrayArray5179.length) {
			int[] anLocalInts
			    = anIntArrayArray5179[anLocalInt_396_];
			for (int anLocalInt_397_ = 0;
			     anLocalInt_397_ < anLocalInts.length;
			     anLocalInt_397_++) {
			    Class163 class163
				= (aClass163Array5156
				   [anLocalInts[anLocalInt_397_]]);
			    ((Class163) class163).anInt1195
				= (argument_241_
				   * ((Class163) class163).anInt1195) >> 7;
			    ((Class163) class163).anInt1191
				= (argument_242_
				   * ((Class163) class163).anInt1191) >> 7;
			}
		    }
		}
	    }
	} else if (argument_239_ == 9) {
	    if (anIntArrayArray5179 != null) {
		for (int anLocalInt_398_ = 0; anLocalInt_398_ < anLocalInt;
		     anLocalInt_398_++) {
		    int anLocalInt_399_ = argument_240_[anLocalInt_398_];
		    if (anIntArrayArray5179.length > anLocalInt_399_) {
			int[] anLocalInts
			    = anIntArrayArray5179[anLocalInt_399_];
			for (int anLocalInt_400_ = 0;
			     anLocalInt_400_ < anLocalInts.length;
			     anLocalInt_400_++) {
			    Class163 class163
				= (aClass163Array5156
				   [anLocalInts[anLocalInt_400_]]);
			    ((Class163) class163).anInt1194
				= (argument_241_
				   + ((Class163) class163).anInt1194) & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    Class167_Sub2(GraphicsToolkit_Sub2 argument_401_, Class101 argument_402_,
		  int argument_403_, int argument_404_, int argument_405_,
		  int argument_406_) {
	this(argument_401_, argument_403_, argument_406_, true, false);
	TextureSource textureSource
	    = ((GraphicsToolkit) argument_401_).textureSource;
	int[] anLocalInts = new int[((Class101) argument_402_).anInt795];
	anIntArray5202 = new int[((Class101) argument_402_).anInt797 + 1];
	for (int anLocalInt = 0;
	     anLocalInt < ((Class101) argument_402_).anInt795; anLocalInt++) {
	    if (((Class101) argument_402_).aByteArray813 == null
		|| ((Class101) argument_402_).aByteArray813[anLocalInt] != 2) {
		if (((Class101) argument_402_).aShortArray815 != null
		    && (((Class101) argument_402_).aShortArray815[anLocalInt]
			!= -1)) {
		    TextureDescriptor textureDescriptor
			= textureSource.getDescriptor(((((Class101) argument_402_).aShortArray815[anLocalInt]) & 0xffff), true);
		    if (((anInt5201 & 0x40) == 0
			 || !((TextureDescriptor) textureDescriptor).aBoolean836)
			&& ((TextureDescriptor) textureDescriptor).aBoolean843)
			continue;
		}
		anLocalInts[anInt5164++] = anLocalInt;
		anIntArray5202[(((Class101) argument_402_).aShortArray798
				[anLocalInt])]++;
		anIntArray5202[(((Class101) argument_402_).aShortArray807
				[anLocalInt])]++;
		anIntArray5202[(((Class101) argument_402_).aShortArray793
				[anLocalInt])]++;
	    }
	}
	anInt5169 = anInt5164;
	long[] ls = new long[anInt5164];
	boolean anLocalBoolean = (anInt5195 & 0x100) != 0;
	for (int anLocalInt = 0; anLocalInt < anInt5164; anLocalInt++) {
	    int anLocalInt_407_ = anLocalInts[anLocalInt];
	    TextureDescriptor textureDescriptor = null;
	    int anLocalInt_408_ = 0;
	    int anLocalInt_409_ = 0;
	    int anLocalInt_410_ = 0;
	    int anLocalInt_411_ = 0;
	    if (((Class101) argument_402_).aClass147Array784 != null) {
		boolean anLocalBoolean_412_ = false;
		for (int anLocalInt_413_ = 0;
		     (anLocalInt_413_
		      < ((Class101) argument_402_).aClass147Array784.length);
		     anLocalInt_413_++) {
		    Class147 class147 = (((Class101) argument_402_)
					 .aClass147Array784[anLocalInt_413_]);
		    if (((Class147) class147).anInt1115 == anLocalInt_407_) {
			Class125 class125
			    = Node_Sub31_Sub4.method887((byte) 113,
                    (((Class147)
                            class147)
                            .anInt1118));
			if (((Class125) class125).aBoolean1016)
			    anLocalBoolean_412_ = true;
			if (((Class125) class125).anInt1014 != -1) {
			    TextureDescriptor textureDescriptor_414_
				= textureSource.getDescriptor((((Class125) class125).anInt1014), true);
			    if (((TextureDescriptor) textureDescriptor_414_).anInt830 == 2)
				aBoolean5151 = true;
			}
		    }
		}
		if (anLocalBoolean_412_) {
		    ls[anLocalInt] = 9223372036854775807L;
		    anInt5169--;
		    continue;
		}
	    }
	    int anLocalInt_415_ = -1;
	    if (((Class101) argument_402_).aShortArray815 != null) {
		anLocalInt_415_ = (((Class101) argument_402_).aShortArray815
				   [anLocalInt_407_]);
		if (anLocalInt_415_ != -1) {
		    textureDescriptor = textureSource.getDescriptor(anLocalInt_415_ & 0xffff, true);
		    if ((anInt5201 & 0x40) != 0
			&& ((TextureDescriptor) textureDescriptor).aBoolean836) {
			anLocalInt_415_ = -1;
			textureDescriptor = null;
		    } else {
			anLocalInt_411_ = ((TextureDescriptor) textureDescriptor).aByte842;
			anLocalInt_410_ = ((TextureDescriptor) textureDescriptor).aByte834;
		    }
		}
	    }
	    boolean anLocalBoolean_416_
		= ((((Class101) argument_402_).aByteArray816 != null
		    && (((Class101) argument_402_).aByteArray816
			[anLocalInt_407_]) != 0)
		   || textureDescriptor != null && ((TextureDescriptor) textureDescriptor).anInt830 != 0);
	    if ((anLocalBoolean || anLocalBoolean_416_)
		&& ((Class101) argument_402_).aByteArray790 != null)
		anLocalInt_408_ += (((Class101) argument_402_).aByteArray790
				    [anLocalInt_407_]) << 17;
	    if (anLocalBoolean_416_)
		anLocalInt_408_ += 65536;
	    anLocalInt_408_ += (anLocalInt_410_ & 0xff) << 8;
	    anLocalInt_408_ += anLocalInt_411_ & 0xff;
	    anLocalInt_409_ += anLocalInt_415_ << 16 & ~0xffff;
	    anLocalInt_409_ += anLocalInt & 0xffff;
	    ls[anLocalInt]
		= ((long) anLocalInt_408_ << 32) + (long) anLocalInt_409_;
	    Class167_Sub2 class167_sub2 = this;
	    class167_sub2.aBoolean5147
		= (class167_sub2.aBoolean5147
		   | (textureDescriptor != null
		      && (((TextureDescriptor) textureDescriptor).aByte845 != 0
			  || ((TextureDescriptor) textureDescriptor).aByte849 != 0)));
	    aBoolean5151 |= anLocalBoolean_416_;
	}
	Class62_Sub16.method1419(anLocalInts, (byte) -68, ls);
	anIntArray5163 = ((Class101) argument_402_).anIntArray814;
	anInt5192 = ((Class101) argument_402_).anInt792;
	aShortArray5183 = ((Class101) argument_402_).aShortArray789;
	anInt5200 = ((Class101) argument_402_).anInt797;
	anIntArray5193 = ((Class101) argument_402_).anIntArray810;
	anIntArray5189 = ((Class101) argument_402_).anIntArray785;
	aClass185Array5206 = ((Class101) argument_402_).aClass185Array817;
	aClass38Array5145 = ((Class101) argument_402_).aClass38Array787;
	Class268[] class268s = new Class268[anInt5200];
	if (((Class101) argument_402_).aClass147Array784 != null) {
	    anInt5159 = ((Class101) argument_402_).aClass147Array784.length;
	    aClass163Array5156 = new Class163[anInt5159];
	    aClass55Array5203 = new Class55[anInt5159];
	    for (int anLocalInt = 0; anInt5159 > anLocalInt; anLocalInt++) {
		Class147 class147
		    = ((Class101) argument_402_).aClass147Array784[anLocalInt];
		Class125 class125
		    = Node_Sub31_Sub4.method887((byte) 113,
                (((Class147) class147)
                        .anInt1118));
		int anLocalInt_417_ = -1;
		for (int anLocalInt_418_ = 0; anInt5164 > anLocalInt_418_;
		     anLocalInt_418_++) {
		    if (((Class147) class147).anInt1115
			== anLocalInts[anLocalInt_418_]) {
			anLocalInt_417_ = anLocalInt_418_;
			break;
		    }
		}
		if (anLocalInt_417_ == -1)
		    throw new RuntimeException();
		int anLocalInt_419_
		    = ((HslToRgb.table
			[(((Class101) argument_402_).aShortArray783
			  [((Class147) class147).anInt1115]) & 0xffff])
		       & 0xffffff);
		anLocalInt_419_
		    = (anLocalInt_419_
		       | -(((Class101) argument_402_).aByteArray816 != null
			   ? (((Class101) argument_402_).aByteArray816
			      [((Class147) class147).anInt1115])
			   : 0) + 255 << 24);
		aClass55Array5203[anLocalInt]
		    = new Class55(anLocalInt_417_,
				  (((Class101) argument_402_).aShortArray798
				   [((Class147) class147).anInt1115]),
				  (((Class101) argument_402_).aShortArray807
				   [((Class147) class147).anInt1115]),
				  (((Class101) argument_402_).aShortArray793
				   [((Class147) class147).anInt1115]),
				  ((Class125) class125).anInt1018,
				  ((Class125) class125).anInt1019,
				  ((Class125) class125).anInt1014,
				  ((Class125) class125).anInt1017,
				  ((Class125) class125).anInt1015,
				  ((Class125) class125).aBoolean1016,
				  ((Class125) class125).aBoolean1013,
				  ((Class147) class147).anInt1114);
		aClass163Array5156[anLocalInt] = new Class163(anLocalInt_419_);
	    }
	}
	int anLocalInt = anInt5164 * 3;
	aShortArray5174 = new short[anLocalInt];
	aShortArray5162 = new short[anInt5164];
	aFloatArray5161 = new float[anLocalInt];
	if (((Class101) argument_402_).aShortArray794 != null)
	    aShortArray5198 = new short[anInt5164];
	aByteArray5184 = new byte[anInt5164];
	aShortArray5187 = new short[anLocalInt];
	aShortArray5190 = new short[anInt5164];
	aByteArray5160 = new byte[anLocalInt];
	aShort5188 = (short) argument_405_;
	aShortArray5154 = new short[anLocalInt];
	Class86.aLongArray641 = new long[anLocalInt];
	aShortArray5197 = new short[anLocalInt];
	aShortArray5149 = new short[anInt5164];
	aShortArray5196 = new short[anInt5164];
	aShortArray5166 = new short[anLocalInt];
	aShortArray5153 = new short[anLocalInt];
	aFloatArray5175 = new float[anLocalInt];
	aShort5204 = (short) argument_404_;
	aShortArray5168 = new short[anInt5164];
	int anLocalInt_420_ = 0;
	for (int anLocalInt_421_ = 0;
	     anLocalInt_421_ < ((Class101) argument_402_).anInt797;
	     anLocalInt_421_++) {
	    int anLocalInt_422_ = anIntArray5202[anLocalInt_421_];
	    anIntArray5202[anLocalInt_421_] = anLocalInt_420_;
	    anLocalInt_420_ += anLocalInt_422_;
	    class268s[anLocalInt_421_] = new Class268();
	}
	anIntArray5202[((Class101) argument_402_).anInt797] = anLocalInt_420_;
	Class358 class358
	    = Statics.method2485(argument_402_, true, anInt5164, anLocalInts);
	Class15[] class15s = new Class15[((Class101) argument_402_).anInt795];
	for (int anLocalInt_423_ = 0;
	     anLocalInt_423_ < ((Class101) argument_402_).anInt795;
	     anLocalInt_423_++) {
	    short anLocalInt_424_
		= ((Class101) argument_402_).aShortArray798[anLocalInt_423_];
	    short anLocalInt_425_
		= ((Class101) argument_402_).aShortArray807[anLocalInt_423_];
	    short anLocalInt_426_
		= ((Class101) argument_402_).aShortArray793[anLocalInt_423_];
	    int anLocalInt_427_ = (anIntArray5163[anLocalInt_425_]
				   - anIntArray5163[anLocalInt_424_]);
	    int anLocalInt_428_ = (-anIntArray5193[anLocalInt_424_]
				   + anIntArray5193[anLocalInt_425_]);
	    int anLocalInt_429_ = (anIntArray5189[anLocalInt_425_]
				   - anIntArray5189[anLocalInt_424_]);
	    int anLocalInt_430_ = (-anIntArray5163[anLocalInt_424_]
				   + anIntArray5163[anLocalInt_426_]);
	    int anLocalInt_431_ = (-anIntArray5193[anLocalInt_424_]
				   + anIntArray5193[anLocalInt_426_]);
	    int anLocalInt_432_ = (anIntArray5189[anLocalInt_426_]
				   - anIntArray5189[anLocalInt_424_]);
	    int anLocalInt_433_ = (anLocalInt_428_ * anLocalInt_432_
				   - anLocalInt_429_ * anLocalInt_431_);
	    int anLocalInt_434_ = (anLocalInt_429_ * anLocalInt_430_
				   - anLocalInt_432_ * anLocalInt_427_);
	    int anLocalInt_435_;
	    for (anLocalInt_435_ = (anLocalInt_427_ * anLocalInt_431_
				    - anLocalInt_428_ * anLocalInt_430_);
		 (anLocalInt_433_ > 8192 || anLocalInt_434_ > 8192
		  || anLocalInt_435_ > 8192 || anLocalInt_433_ < -8192
		  || anLocalInt_434_ < -8192 || anLocalInt_435_ < -8192);
		 anLocalInt_433_ >>= 1) {
		anLocalInt_434_ >>= 1;
		anLocalInt_435_ >>= 1;
	    }
	    int anLocalInt_436_
		= (int) Math.sqrt((double) (anLocalInt_435_ * anLocalInt_435_
					    + ((anLocalInt_434_
						* anLocalInt_434_)
					       + (anLocalInt_433_
						  * anLocalInt_433_))));
	    if (anLocalInt_436_ <= 0)
		anLocalInt_436_ = 1;
	    anLocalInt_435_ = anLocalInt_435_ * 256 / anLocalInt_436_;
	    anLocalInt_434_ = anLocalInt_434_ * 256 / anLocalInt_436_;
	    anLocalInt_433_ = anLocalInt_433_ * 256 / anLocalInt_436_;
	    byte anLocalInt_437_
		= (((Class101) argument_402_).aByteArray813 != null
		   ? ((Class101) argument_402_).aByteArray813[anLocalInt_423_]
		   : (byte) 0);
	    if (anLocalInt_437_ != 0) {
		if (anLocalInt_437_ == 1) {
		    Class15 class15
			= class15s[anLocalInt_423_] = new Class15();
		    ((Class15) class15).anInt117 = anLocalInt_433_;
		    ((Class15) class15).anInt119 = anLocalInt_435_;
		    ((Class15) class15).anInt118 = anLocalInt_434_;
		}
	    } else {
		Class268 class268 = class268s[anLocalInt_424_];
		((Class268) class268).anInt2143++;
		((Class268) class268).anInt2144 += anLocalInt_434_;
		((Class268) class268).anInt2142 += anLocalInt_435_;
		((Class268) class268).anInt2145 += anLocalInt_433_;
		class268 = class268s[anLocalInt_425_];
		((Class268) class268).anInt2143++;
		((Class268) class268).anInt2142 += anLocalInt_435_;
		((Class268) class268).anInt2145 += anLocalInt_433_;
		((Class268) class268).anInt2144 += anLocalInt_434_;
		class268 = class268s[anLocalInt_426_];
		((Class268) class268).anInt2142 += anLocalInt_435_;
		((Class268) class268).anInt2145 += anLocalInt_433_;
		((Class268) class268).anInt2144 += anLocalInt_434_;
		((Class268) class268).anInt2143++;
	    }
	}
	for (int anLocalInt_438_ = 0; anLocalInt_438_ < anInt5164;
	     anLocalInt_438_++) {
	    int anLocalInt_439_ = anLocalInts[anLocalInt_438_];
	    int anLocalInt_440_
		= (((Class101) argument_402_).aShortArray783[anLocalInt_439_]
		   & 0xffff);
	    int anLocalInt_441_;
	    if (((Class101) argument_402_).aByteArray818 == null)
		anLocalInt_441_ = -1;
	    else
		anLocalInt_441_ = (((Class101) argument_402_).aByteArray818
				   [anLocalInt_439_]);
	    int anLocalInt_442_;
	    if (((Class101) argument_402_).aByteArray816 != null)
		anLocalInt_442_ = (((Class101) argument_402_).aByteArray816
				   [anLocalInt_439_]) & 0xff;
	    else
		anLocalInt_442_ = 0;
	    short anLocalInt_443_
		= (((Class101) argument_402_).aShortArray815 == null
		   ? (short) -1
		   : (((Class101) argument_402_).aShortArray815
		      [anLocalInt_439_]));
	    if (anLocalInt_443_ != -1 && (anInt5201 & 0x40) != 0) {
		TextureDescriptor textureDescriptor
		    = textureSource.getDescriptor(anLocalInt_443_ & 0xffff, true);
		if (((TextureDescriptor) textureDescriptor).aBoolean836)
		    anLocalInt_443_ = (short) -1;
	    }
	    float f = 0.0F;
	    float f_444_ = 0.0F;
	    float f_445_ = 0.0F;
	    float f_446_ = 0.0F;
	    float f_447_ = 0.0F;
	    float f_448_ = 0.0F;
	    int anLocalInt_449_ = 0;
	    int anLocalInt_450_ = 0;
	    int anLocalInt_451_ = 0;
	    if (anLocalInt_443_ != -1) {
		if (anLocalInt_441_ == -1) {
		    anLocalInt_450_ = 2;
		    f_446_ = 1.0F;
		    f_447_ = 0.0F;
		    anLocalInt_449_ = 1;
		    f_448_ = 0.0F;
		    f_444_ = 1.0F;
		    f = 0.0F;
		    f_445_ = 1.0F;
		} else {
		    anLocalInt_441_ &= 0xff;
		    byte anLocalInt_452_ = (((Class101) argument_402_)
					    .aByteArray800[anLocalInt_441_]);
		    if (anLocalInt_452_ != 0) {
			short anLocalInt_453_
			    = (((Class101) argument_402_).aShortArray798
			       [anLocalInt_439_]);
			short anLocalInt_454_
			    = (((Class101) argument_402_).aShortArray807
			       [anLocalInt_439_]);
			short anLocalInt_455_
			    = (((Class101) argument_402_).aShortArray793
			       [anLocalInt_439_]);
			int anLocalInt_456_
			    = (((Class358) class358).anIntArray3034
			       [anLocalInt_441_]);
			int anLocalInt_457_
			    = (((Class358) class358).anIntArray3035
			       [anLocalInt_441_]);
			int anLocalInt_458_
			    = (((Class358) class358).anIntArray3030
			       [anLocalInt_441_]);
			float[] fs = (((Class358) class358)
				      .aFloatArrayArray3032[anLocalInt_441_]);
			byte anLocalInt_459_
			    = (((Class101) argument_402_).aByteArray786
			       [anLocalInt_441_]);
			float f_460_
			    = ((float) (((Class101) argument_402_)
					.anIntArray819[anLocalInt_441_])
			       / 256.0F);
			if (anLocalInt_452_ != 1) {
			    if (anLocalInt_452_ == 2) {
				float f_461_
				    = ((float) (((Class101) argument_402_)
						.anIntArray805
						[anLocalInt_441_])
				       / 256.0F);
				float f_462_
				    = ((float) (((Class101) argument_402_)
						.anIntArray801
						[anLocalInt_441_])
				       / 256.0F);
				int anLocalInt_463_
				    = ((((Class101) argument_402_)
					.anIntArray814[anLocalInt_454_])
				       - (((Class101) argument_402_)
					  .anIntArray814[anLocalInt_453_]));
				int anLocalInt_464_
				    = ((((Class101) argument_402_)
					.anIntArray810[anLocalInt_454_])
				       - (((Class101) argument_402_)
					  .anIntArray810[anLocalInt_453_]));
				int anLocalInt_465_
				    = (-(((Class101) argument_402_)
					 .anIntArray785[anLocalInt_453_])
				       + (((Class101) argument_402_)
					  .anIntArray785[anLocalInt_454_]));
				int anLocalInt_466_
				    = (-(((Class101) argument_402_)
					 .anIntArray814[anLocalInt_453_])
				       + (((Class101) argument_402_)
					  .anIntArray814[anLocalInt_455_]));
				int anLocalInt_467_
				    = (-(((Class101) argument_402_)
					 .anIntArray810[anLocalInt_453_])
				       + (((Class101) argument_402_)
					  .anIntArray810[anLocalInt_455_]));
				int anLocalInt_468_
				    = ((((Class101) argument_402_)
					.anIntArray785[anLocalInt_455_])
				       - (((Class101) argument_402_)
					  .anIntArray785[anLocalInt_453_]));
				int anLocalInt_469_
				    = (-(anLocalInt_467_ * anLocalInt_465_)
				       + anLocalInt_468_ * anLocalInt_464_);
				int anLocalInt_470_
				    = (-(anLocalInt_463_ * anLocalInt_468_)
				       + anLocalInt_465_ * anLocalInt_466_);
				int anLocalInt_471_
				    = (-(anLocalInt_464_ * anLocalInt_466_)
				       + anLocalInt_467_ * anLocalInt_463_);
				float f_472_
				    = (64.0F
				       / (float) (((Class101) argument_402_)
						  .anIntArray804
						  [anLocalInt_441_]));
				float f_473_
				    = (64.0F
				       / (float) (((Class101) argument_402_)
						  .anIntArray811
						  [anLocalInt_441_]));
				float f_474_
				    = (64.0F
				       / (float) (((Class101) argument_402_)
						  .anIntArray791
						  [anLocalInt_441_]));
				float f_475_
				    = ((fs[0] * (float) anLocalInt_469_
					+ (float) anLocalInt_470_ * fs[1]
					+ fs[2] * (float) anLocalInt_471_)
				       / f_472_);
				float f_476_
				    = (((float) anLocalInt_471_ * fs[5]
					+ (fs[4] * (float) anLocalInt_470_
					   + (float) anLocalInt_469_ * fs[3]))
				       / f_473_);
				float f_477_
				    = (((float) anLocalInt_471_ * fs[8]
					+ (fs[6] * (float) anLocalInt_469_
					   + fs[7] * (float) anLocalInt_470_))
				       / f_474_);
				anLocalInt_451_
				    = Class60.method1337(f_475_, f_476_,
							 f_477_, -12855);
				Class92.method1689
				    (anLocalInt_451_, GlToolkitNr2Program.aFloatArray1972,
				     anLocalInt_459_, anLocalInt_457_,
				     anLocalInt_458_,
				     (((Class101) argument_402_).anIntArray814
				      [anLocalInt_453_]),
				     anLocalInt_456_, 0, fs, f_462_,
				     (((Class101) argument_402_).anIntArray785
				      [anLocalInt_453_]),
				     (((Class101) argument_402_).anIntArray810
				      [anLocalInt_453_]),
				     f_460_, f_461_);
				f_444_ = GlToolkitNr2Program.aFloatArray1972[1];
				f = GlToolkitNr2Program.aFloatArray1972[0];
				Class92.method1689
				    (anLocalInt_451_, GlToolkitNr2Program.aFloatArray1972,
				     anLocalInt_459_, anLocalInt_457_,
				     anLocalInt_458_,
				     (((Class101) argument_402_).anIntArray814
				      [anLocalInt_454_]),
				     anLocalInt_456_, 0, fs, f_462_,
				     (((Class101) argument_402_).anIntArray785
				      [anLocalInt_454_]),
				     (((Class101) argument_402_).anIntArray810
				      [anLocalInt_454_]),
				     f_460_, f_461_);
				f_445_ = GlToolkitNr2Program.aFloatArray1972[0];
				f_446_ = GlToolkitNr2Program.aFloatArray1972[1];
				Class92.method1689
				    (anLocalInt_451_, GlToolkitNr2Program.aFloatArray1972,
				     anLocalInt_459_, anLocalInt_457_,
				     anLocalInt_458_,
				     (((Class101) argument_402_).anIntArray814
				      [anLocalInt_455_]),
				     anLocalInt_456_, 0, fs, f_462_,
				     (((Class101) argument_402_).anIntArray785
				      [anLocalInt_455_]),
				     (((Class101) argument_402_).anIntArray810
				      [anLocalInt_455_]),
				     f_460_, f_461_);
				f_447_ = GlToolkitNr2Program.aFloatArray1972[0];
				f_448_ = GlToolkitNr2Program.aFloatArray1972[1];
			    } else if (anLocalInt_452_ == 3) {
				Class5.method226(GlToolkitNr2Program.aFloatArray1972,
						 anLocalInt_456_,
						 (((Class101) argument_402_)
						  .anIntArray814
						  [anLocalInt_453_]),
						 anLocalInt_457_,
						 (((Class101) argument_402_)
						  .anIntArray785
						  [anLocalInt_453_]),
						 (((Class101) argument_402_)
						  .anIntArray810
						  [anLocalInt_453_]),
						 fs, anLocalInt_458_, true,
						 anLocalInt_459_, f_460_);
				f_444_ = GlToolkitNr2Program.aFloatArray1972[1];
				f = GlToolkitNr2Program.aFloatArray1972[0];
				Class5.method226(GlToolkitNr2Program.aFloatArray1972,
						 anLocalInt_456_,
						 (((Class101) argument_402_)
						  .anIntArray814
						  [anLocalInt_454_]),
						 anLocalInt_457_,
						 (((Class101) argument_402_)
						  .anIntArray785
						  [anLocalInt_454_]),
						 (((Class101) argument_402_)
						  .anIntArray810
						  [anLocalInt_454_]),
						 fs, anLocalInt_458_, true,
						 anLocalInt_459_, f_460_);
				f_446_ = GlToolkitNr2Program.aFloatArray1972[1];
				f_445_ = GlToolkitNr2Program.aFloatArray1972[0];
				Class5.method226(GlToolkitNr2Program.aFloatArray1972,
						 anLocalInt_456_,
						 (((Class101) argument_402_)
						  .anIntArray814
						  [anLocalInt_455_]),
						 anLocalInt_457_,
						 (((Class101) argument_402_)
						  .anIntArray785
						  [anLocalInt_455_]),
						 (((Class101) argument_402_)
						  .anIntArray810
						  [anLocalInt_455_]),
						 fs, anLocalInt_458_, true,
						 anLocalInt_459_, f_460_);
				f_447_ = GlToolkitNr2Program.aFloatArray1972[0];
				f_448_ = GlToolkitNr2Program.aFloatArray1972[1];
				if ((anLocalInt_459_ & 0x1) == 0) {
				    if (-f + f_447_ > 0.5F) {
					f_447_--;
					anLocalInt_450_ = 1;
				    } else if (f - f_447_ > 0.5F) {
					f_447_++;
					anLocalInt_450_ = 2;
				    }
				    if (f_445_ - f > 0.5F) {
					f_445_--;
					anLocalInt_449_ = 1;
				    } else if (-f_445_ + f > 0.5F) {
					anLocalInt_449_ = 2;
					f_445_++;
				    }
				} else {
				    if (!(-f_444_ + f_446_ > 0.5F)) {
					if (-f_446_ + f_444_ > 0.5F) {
					    f_446_++;
					    anLocalInt_449_ = 2;
					}
				    } else {
					f_446_--;
					anLocalInt_449_ = 1;
				    }
				    if (!(f_448_ - f_444_ > 0.5F)) {
					if (f_444_ - f_448_ > 0.5F) {
					    f_448_++;
					    anLocalInt_450_ = 2;
					}
				    } else {
					anLocalInt_450_ = 1;
					f_448_--;
				    }
				}
			    }
			} else {
			    float f_478_
				= ((float) (((Class101) argument_402_)
					    .anIntArray791[anLocalInt_441_])
				   / 1024.0F);
			    Node_Sub16.method699(anLocalInt_456_, fs,
                        anLocalInt_459_, f_460_,
                        anLocalInt_457_,
                        (((Class101) argument_402_)
                                .anIntArray810
                                [anLocalInt_453_]),
                        f_478_, anLocalInt_458_,
                        (((Class101) argument_402_)
                                .anIntArray785
                                [anLocalInt_453_]),
                        GlToolkitNr2Program.aFloatArray1972,
                        (((Class101) argument_402_)
                                .anIntArray814
                                [anLocalInt_453_]),
                        -120);
			    f_444_ = GlToolkitNr2Program.aFloatArray1972[1];
			    f = GlToolkitNr2Program.aFloatArray1972[0];
			    Node_Sub16.method699(anLocalInt_456_, fs,
                        anLocalInt_459_, f_460_,
                        anLocalInt_457_,
                        (((Class101) argument_402_)
                                .anIntArray810
                                [anLocalInt_454_]),
                        f_478_, anLocalInt_458_,
                        (((Class101) argument_402_)
                                .anIntArray785
                                [anLocalInt_454_]),
                        GlToolkitNr2Program.aFloatArray1972,
                        (((Class101) argument_402_)
                                .anIntArray814
                                [anLocalInt_454_]),
                        -105);
			    f_445_ = GlToolkitNr2Program.aFloatArray1972[0];
			    f_446_ = GlToolkitNr2Program.aFloatArray1972[1];
			    Node_Sub16.method699(anLocalInt_456_, fs,
                        anLocalInt_459_, f_460_,
                        anLocalInt_457_,
                        (((Class101) argument_402_)
                                .anIntArray810
                                [anLocalInt_455_]),
                        f_478_, anLocalInt_458_,
                        (((Class101) argument_402_)
                                .anIntArray785
                                [anLocalInt_455_]),
                        GlToolkitNr2Program.aFloatArray1972,
                        (((Class101) argument_402_)
                                .anIntArray814
                                [anLocalInt_455_]),
                        -125);
			    f_447_ = GlToolkitNr2Program.aFloatArray1972[0];
			    f_448_ = GlToolkitNr2Program.aFloatArray1972[1];
			    float f_479_ = f_478_ / 2.0F;
			    if ((anLocalInt_459_ & 0x1) != 0) {
				if (!(f_446_ - f_444_ > f_479_)) {
				    if (-f_446_ + f_444_ > f_479_) {
					anLocalInt_449_ = 2;
					f_446_ += f_478_;
				    }
				} else {
				    f_446_ -= f_478_;
				    anLocalInt_449_ = 1;
				}
				if (!(f_479_ < f_448_ - f_444_)) {
				    if (f_479_ < f_444_ - f_448_) {
					anLocalInt_450_ = 2;
					f_448_ += f_478_;
				    }
				} else {
				    anLocalInt_450_ = 1;
				    f_448_ -= f_478_;
				}
			    } else {
				if (!(f_479_ < f_447_ - f)) {
				    if (-f_447_ + f > f_479_) {
					anLocalInt_450_ = 2;
					f_447_ += f_478_;
				    }
				} else {
				    f_447_ -= f_478_;
				    anLocalInt_450_ = 1;
				}
				if (!(f_445_ - f > f_479_)) {
				    if (-f_445_ + f > f_479_) {
					f_445_ += f_478_;
					anLocalInt_449_ = 2;
				    }
				} else {
				    f_445_ -= f_478_;
				    anLocalInt_449_ = 1;
				}
			    }
			}
		    } else {
			short anLocalInt_480_
			    = (((Class101) argument_402_).aShortArray798
			       [anLocalInt_439_]);
			short anLocalInt_481_
			    = (((Class101) argument_402_).aShortArray807
			       [anLocalInt_439_]);
			short anLocalInt_482_
			    = (((Class101) argument_402_).aShortArray793
			       [anLocalInt_439_]);
			short anLocalInt_483_
			    = (((Class101) argument_402_).aShortArray821
			       [anLocalInt_441_]);
			short anLocalInt_484_
			    = (((Class101) argument_402_).aShortArray803
			       [anLocalInt_441_]);
			short anLocalInt_485_
			    = (((Class101) argument_402_).aShortArray799
			       [anLocalInt_441_]);
			float f_486_
			    = (float) (((Class101) argument_402_).anIntArray814
				       [anLocalInt_483_]);
			float f_487_
			    = (float) (((Class101) argument_402_).anIntArray810
				       [anLocalInt_483_]);
			float f_488_
			    = (float) (((Class101) argument_402_).anIntArray785
				       [anLocalInt_483_]);
			float f_489_
			    = ((float) (((Class101) argument_402_)
					.anIntArray814[anLocalInt_484_])
			       - f_486_);
			float f_490_
			    = (-f_487_
			       + (float) (((Class101) argument_402_)
					  .anIntArray810[anLocalInt_484_]));
			float f_491_
			    = (-f_488_
			       + (float) (((Class101) argument_402_)
					  .anIntArray785[anLocalInt_484_]));
			float f_492_
			    = (-f_486_
			       + (float) (((Class101) argument_402_)
					  .anIntArray814[anLocalInt_485_]));
			float f_493_
			    = ((float) (((Class101) argument_402_)
					.anIntArray810[anLocalInt_485_])
			       - f_487_);
			float f_494_
			    = ((float) (((Class101) argument_402_)
					.anIntArray785[anLocalInt_485_])
			       - f_488_);
			float f_495_
			    = (-f_486_
			       + (float) (((Class101) argument_402_)
					  .anIntArray814[anLocalInt_480_]));
			float f_496_
			    = ((float) (((Class101) argument_402_)
					.anIntArray810[anLocalInt_480_])
			       - f_487_);
			float f_497_
			    = ((float) (((Class101) argument_402_)
					.anIntArray785[anLocalInt_480_])
			       - f_488_);
			float f_498_
			    = ((float) (((Class101) argument_402_)
					.anIntArray814[anLocalInt_481_])
			       - f_486_);
			float f_499_
			    = ((float) (((Class101) argument_402_)
					.anIntArray810[anLocalInt_481_])
			       - f_487_);
			float f_500_
			    = (-f_488_
			       + (float) (((Class101) argument_402_)
					  .anIntArray785[anLocalInt_481_]));
			float f_501_
			    = ((float) (((Class101) argument_402_)
					.anIntArray814[anLocalInt_482_])
			       - f_486_);
			float f_502_
			    = (-f_487_
			       + (float) (((Class101) argument_402_)
					  .anIntArray810[anLocalInt_482_]));
			float f_503_
			    = (-f_488_
			       + (float) (((Class101) argument_402_)
					  .anIntArray785[anLocalInt_482_]));
			float f_504_ = f_494_ * f_490_ - f_491_ * f_493_;
			float f_505_ = f_491_ * f_492_ - f_494_ * f_489_;
			float f_506_ = -(f_492_ * f_490_) + f_489_ * f_493_;
			float f_507_ = f_506_ * f_493_ - f_505_ * f_494_;
			float f_508_ = -(f_492_ * f_506_) + f_504_ * f_494_;
			float f_509_ = f_505_ * f_492_ - f_493_ * f_504_;
			float f_510_
			    = 1.0F / (f_490_ * f_508_ + f_507_ * f_489_
				      + f_491_ * f_509_);
			f_447_ = (f_502_ * f_508_ + f_501_ * f_507_
				  + f_509_ * f_503_) * f_510_;
			f_445_
			    = (f_500_ * f_509_
			       + (f_508_ * f_499_ + f_498_ * f_507_)) * f_510_;
			f = (f_509_ * f_497_
			     + (f_507_ * f_495_ + f_508_ * f_496_)) * f_510_;
			f_507_ = f_506_ * f_490_ - f_491_ * f_505_;
			f_508_ = -(f_506_ * f_489_) + f_504_ * f_491_;
			f_509_ = f_489_ * f_505_ - f_490_ * f_504_;
			f_510_
			    = 1.0F / (f_494_ * f_509_
				      + (f_507_ * f_492_ + f_493_ * f_508_));
			f_446_
			    = f_510_ * (f_500_ * f_509_
					+ (f_507_ * f_498_ + f_499_ * f_508_));
			f_444_
			    = (f_509_ * f_497_
			       + (f_495_ * f_507_ + f_508_ * f_496_)) * f_510_;
			f_448_
			    = f_510_ * (f_503_ * f_509_
					+ (f_507_ * f_501_ + f_502_ * f_508_));
		    }
		}
	    }
	    byte anLocalInt_511_;
	    if (((Class101) argument_402_).aByteArray813 != null)
		anLocalInt_511_ = (((Class101) argument_402_).aByteArray813
				   [anLocalInt_439_]);
	    else
		anLocalInt_511_ = (byte) 0;
	    if (anLocalInt_511_ != 0) {
		if (anLocalInt_511_ == 1) {
		    Class15 class15 = class15s[anLocalInt_439_];
		    long l
			= ((long) ((((Class15) class15).anInt119 + 256 << 22)
				   + ((((Class15) class15).anInt117 > 0 ? 1024
				       : 2048)
				      + ((anLocalInt_441_ << 2)
					 + (((Class15) class15).anInt118 + 256
					    << 12))))
			   - -(((long) anLocalInt_442_
				+ (long) (anLocalInt_440_ << 8)
				+ (long) (anLocalInt_451_ << 24))
			       << 32));
		    aShortArray5162[anLocalInt_438_]
			= method2707(l, f, argument_402_,
				     (((Class101) argument_402_).aShortArray798
				      [anLocalInt_439_]),
				     ((Class15) class15).anInt119,
				     ((Class15) class15).anInt118, f_444_, 0,
				     anLocalInt_438_, false,
				     ((Class15) class15).anInt117);
		    aShortArray5149[anLocalInt_438_]
			= method2707((long) anLocalInt_449_ + l, f_445_,
				     argument_402_,
				     (((Class101) argument_402_).aShortArray807
				      [anLocalInt_439_]),
				     ((Class15) class15).anInt119,
				     ((Class15) class15).anInt118, f_446_, 0,
				     anLocalInt_438_, false,
				     ((Class15) class15).anInt117);
		    aShortArray5196[anLocalInt_438_]
			= method2707(l + (long) anLocalInt_450_, f_447_,
				     argument_402_,
				     (((Class101) argument_402_).aShortArray793
				      [anLocalInt_439_]),
				     ((Class15) class15).anInt119,
				     ((Class15) class15).anInt118, f_448_, 0,
				     anLocalInt_438_, false,
				     ((Class15) class15).anInt117);
		}
	    } else {
		long l = ((((long) (anLocalInt_451_ << 24)
			    - (-(long) (anLocalInt_440_ << 8)
			       - (long) anLocalInt_442_))
			   << 32)
			  + (long) (anLocalInt_441_ << 2));
		short anLocalInt_512_ = (((Class101) argument_402_)
					 .aShortArray798[anLocalInt_439_]);
		short anLocalInt_513_ = (((Class101) argument_402_)
					 .aShortArray807[anLocalInt_439_]);
		short anLocalInt_514_ = (((Class101) argument_402_)
					 .aShortArray793[anLocalInt_439_]);
		Class268 class268 = class268s[anLocalInt_512_];
		aShortArray5162[anLocalInt_438_]
		    = method2707(l, f, argument_402_, anLocalInt_512_,
				 ((Class268) class268).anInt2142,
				 ((Class268) class268).anInt2144, f_444_,
				 ((Class268) class268).anInt2143,
				 anLocalInt_438_, false,
				 ((Class268) class268).anInt2145);
		class268 = class268s[anLocalInt_513_];
		aShortArray5149[anLocalInt_438_]
		    = method2707((long) anLocalInt_449_ + l, f_445_,
				 argument_402_, anLocalInt_513_,
				 ((Class268) class268).anInt2142,
				 ((Class268) class268).anInt2144, f_446_,
				 ((Class268) class268).anInt2143,
				 anLocalInt_438_, false,
				 ((Class268) class268).anInt2145);
		class268 = class268s[anLocalInt_514_];
		aShortArray5196[anLocalInt_438_]
		    = method2707((long) anLocalInt_450_ + l, f_447_,
				 argument_402_, anLocalInt_514_,
				 ((Class268) class268).anInt2142,
				 ((Class268) class268).anInt2144, f_448_,
				 ((Class268) class268).anInt2143,
				 anLocalInt_438_, false,
				 ((Class268) class268).anInt2145);
	    }
	    if (((Class101) argument_402_).aByteArray816 != null)
		aByteArray5184[anLocalInt_438_]
		    = (((Class101) argument_402_).aByteArray816
		       [anLocalInt_439_]);
	    if (((Class101) argument_402_).aShortArray794 != null)
		aShortArray5198[anLocalInt_438_]
		    = (((Class101) argument_402_).aShortArray794
		       [anLocalInt_439_]);
	    aShortArray5168[anLocalInt_438_]
		= ((Class101) argument_402_).aShortArray783[anLocalInt_439_];
	    aShortArray5190[anLocalInt_438_] = anLocalInt_443_;
	}
	if (anInt5169 > 0) {
	    int anLocalInt_515_ = 1;
	    short anLocalInt_516_ = aShortArray5190[0];
	    for (int anLocalInt_517_ = 0; anLocalInt_517_ < anInt5169;
		 anLocalInt_517_++) {
		short anLocalInt_518_ = aShortArray5190[anLocalInt_517_];
		if (anLocalInt_518_ != anLocalInt_516_) {
		    anLocalInt_515_++;
		    anLocalInt_516_ = anLocalInt_518_;
		}
	    }
	    anIntArray5167 = new int[anLocalInt_515_];
	    anIntArray5181 = new int[anLocalInt_515_];
	    anIntArray5207 = new int[anLocalInt_515_ + 1];
	    anIntArray5207[0] = 0;
	    int anLocalInt_519_ = anInt5186;
	    anLocalInt_516_ = aShortArray5190[0];
	    int anLocalInt_520_ = 0;
	    anLocalInt_515_ = 0;
	    for (int anLocalInt_521_ = 0; anLocalInt_521_ < anInt5169;
		 anLocalInt_521_++) {
		short anLocalInt_522_ = aShortArray5190[anLocalInt_521_];
		if (anLocalInt_522_ != anLocalInt_516_) {
		    anIntArray5181[anLocalInt_515_] = anLocalInt_519_;
		    anIntArray5167[anLocalInt_515_]
			= anLocalInt_520_ - anLocalInt_519_ + 1;
		    anIntArray5207[++anLocalInt_515_] = anLocalInt_521_;
		    anLocalInt_516_ = anLocalInt_522_;
		    anLocalInt_519_ = anInt5186;
		    anLocalInt_520_ = 0;
		}
		int anLocalInt_523_ = aShortArray5162[anLocalInt_521_];
		if (anLocalInt_523_ < anLocalInt_519_)
		    anLocalInt_519_ = anLocalInt_523_;
		if (anLocalInt_520_ < anLocalInt_523_)
		    anLocalInt_520_ = anLocalInt_523_;
		anLocalInt_523_ = aShortArray5149[anLocalInt_521_];
		if (anLocalInt_520_ < anLocalInt_523_)
		    anLocalInt_520_ = anLocalInt_523_;
		if (anLocalInt_519_ > anLocalInt_523_)
		    anLocalInt_519_ = anLocalInt_523_;
		anLocalInt_523_ = aShortArray5196[anLocalInt_521_];
		if (anLocalInt_523_ > anLocalInt_520_)
		    anLocalInt_520_ = anLocalInt_523_;
		if (anLocalInt_519_ > anLocalInt_523_)
		    anLocalInt_519_ = anLocalInt_523_;
	    }
	    anIntArray5181[anLocalInt_515_] = anLocalInt_519_;
	    anIntArray5167[anLocalInt_515_]
		= anLocalInt_520_ - anLocalInt_519_ + 1;
	    anIntArray5207[++anLocalInt_515_] = anInt5169;
	}
	Class86.aLongArray641 = null;
	aShortArray5153
	    = Statics.method3914(aShortArray5153, (byte) -97, anInt5186);
	aShortArray5154
	    = Statics.method3914(aShortArray5154, (byte) -97, anInt5186);
	aShortArray5166
	    = Statics.method3914(aShortArray5166, (byte) -95, anInt5186);
	aShortArray5187 = Statics.method3914(aShortArray5187, (byte) -112, anInt5186);
	aShortArray5197 = Statics.method3914(aShortArray5197, (byte) -111, anInt5186);
	aByteArray5160 = Statics.method2521(aByteArray5160, anInt5186, 0);
	aFloatArray5161
	    = Class62_Sub18.method1429(9912, aFloatArray5161, anInt5186);
	aFloatArray5175
	    = Class62_Sub18.method1429(9912, aFloatArray5175, anInt5186);
	if (((Class101) argument_402_).anIntArray796 != null
	    && Class60.method1338((byte) -128, argument_403_, anInt5201))
	    anIntArrayArray5176 = argument_402_.method1743(0, false);
	if (((Class101) argument_402_).aClass147Array784 != null
	    && Node_Sub31_Sub29.method964(argument_403_, anInt5201, 27677))
	    anIntArrayArray5179 = argument_402_.method1737(-126);
	if (((Class101) argument_402_).anIntArray809 != null
	    && Class222_Sub2.method3033(anInt5201, true, argument_403_)) {
	    int anLocalInt_524_ = 0;
	    int[] anLocalInts_525_ = new int[256];
	    for (int anLocalInt_526_ = 0; anInt5164 > anLocalInt_526_;
		 anLocalInt_526_++) {
		int anLocalInt_527_ = (((Class101) argument_402_).anIntArray809
				       [anLocalInts[anLocalInt_526_]]);
		if (anLocalInt_527_ >= 0) {
		    if (anLocalInt_527_ > anLocalInt_524_)
			anLocalInt_524_ = anLocalInt_527_;
		    anLocalInts_525_[anLocalInt_527_]++;
		}
	    }
	    anIntArrayArray5146 = new int[anLocalInt_524_ + 1][];
	    for (int anLocalInt_528_ = 0; anLocalInt_528_ <= anLocalInt_524_;
		 anLocalInt_528_++) {
		anIntArrayArray5146[anLocalInt_528_]
		    = new int[anLocalInts_525_[anLocalInt_528_]];
		anLocalInts_525_[anLocalInt_528_] = 0;
	    }
	    for (int anLocalInt_529_ = 0; anLocalInt_529_ < anInt5164;
		 anLocalInt_529_++) {
		int anLocalInt_530_ = (((Class101) argument_402_).anIntArray809
				       [anLocalInts[anLocalInt_529_]]);
		if (anLocalInt_530_ >= 0)
		    anIntArrayArray5146[anLocalInt_530_]
			[anLocalInts_525_[anLocalInt_530_]++]
			= anLocalInt_529_;
	    }
	}
    }
    
    private final short method2707
	(long argument_531_, float argument_532_, Class101 argument_533_,
	 int argument_534_, int argument_535_, int argument_536_,
	 float argument_537_, int argument_538_, int argument_539_,
	 boolean argument_540_, int argument_541_) {
	if (argument_540_)
	    aShortArray5183 = null;
	int anLocalInt = anIntArray5202[argument_534_];
	int anLocalInt_542_ = anIntArray5202[argument_534_ + 1];
	int anLocalInt_543_ = 0;
	for (int anLocalInt_544_ = anLocalInt;
	     anLocalInt_542_ > anLocalInt_544_; anLocalInt_544_++) {
	    short anLocalInt_545_ = aShortArray5174[anLocalInt_544_];
	    if (anLocalInt_545_ == 0) {
		anLocalInt_543_ = anLocalInt_544_;
		break;
	    }
	    if (Class86.aLongArray641[anLocalInt_544_] == argument_531_)
		return (short) (anLocalInt_545_ - 1);
	}
	aShortArray5174[anLocalInt_543_] = (short) (anInt5186 + 1);
	Class86.aLongArray641[anLocalInt_543_] = argument_531_;
	aShortArray5154[anInt5186] = (short) argument_539_;
	aShortArray5153[anInt5186] = (short) argument_534_;
	aShortArray5166[anInt5186] = (short) argument_541_;
	aShortArray5187[anInt5186] = (short) argument_536_;
	aShortArray5197[anInt5186] = (short) argument_535_;
	aByteArray5160[anInt5186] = (byte) argument_538_;
	aFloatArray5161[anInt5186] = argument_532_;
	aFloatArray5175[anInt5186] = argument_537_;
	return (short) anInt5186++;
    }
    
    final void H(int argument_546_, int argument_547_, int argument_548_) {
	for (int anLocalInt = 0; anInt5200 > anLocalInt; anLocalInt++) {
	    if (argument_546_ != 0)
		anIntArray5163[anLocalInt] += argument_546_;
	    if (argument_547_ != 0)
		anIntArray5193[anLocalInt] += argument_547_;
	    if (argument_548_ != 0)
		anIntArray5189[anLocalInt] += argument_548_;
	}
	method2705(true);
	aBoolean5157 = false;
    }
    
    private final void method2708(byte argument_549_) {
	if (argument_549_ != 40)
	    ua();
	do {
	    if ((anInt5201 & 0x37) != 0) {
		if (aClass247_5177 != null)
		    ((Class247) aClass247_5177).aBoolean1794 = false;
	    } else {
		if (aClass247_5158 == null)
		    break;
		((Class247) aClass247_5158).aBoolean1794 = false;
	    }
	    break;
	} while (false);
    }
    
    final void P(int argument_550_, int argument_551_, int argument_552_,
		 int argument_553_) {
	if (argument_550_ == 0) {
	    JagexHashMap.anInt489 = 0;
	    Class44.anInt312 = 0;
	    int anLocalInt = 0;
	    Statics.anInt6646 = 0;
	    for (int anLocalInt_554_ = 0; anInt5200 > anLocalInt_554_;
		 anLocalInt_554_++) {
		Class44.anInt312 += anIntArray5163[anLocalInt_554_];
		JagexHashMap.anInt489 += anIntArray5193[anLocalInt_554_];
		Statics.anInt6646
		    += anIntArray5189[anLocalInt_554_];
		anLocalInt++;
	    }
	    if (anLocalInt > 0) {
		JagexHashMap.anInt489
		    = argument_552_ + JagexHashMap.anInt489 / anLocalInt;
		Class44.anInt312
		    = argument_551_ + Class44.anInt312 / anLocalInt;
		Statics.anInt6646
		    = (argument_553_
		       + Statics.anInt6646 / anLocalInt);
	    } else {
		JagexHashMap.anInt489 = argument_552_;
		Class44.anInt312 = argument_551_;
		Statics.anInt6646 = argument_553_;
	    }
	} else if (argument_550_ == 1) {
	    for (int anLocalInt = 0; anInt5200 > anLocalInt; anLocalInt++) {
		anIntArray5163[anLocalInt] += argument_551_;
		anIntArray5193[anLocalInt] += argument_552_;
		anIntArray5189[anLocalInt] += argument_553_;
	    }
	} else if (argument_550_ == 2) {
	    for (int anLocalInt = 0; anInt5200 > anLocalInt; anLocalInt++) {
		anIntArray5163[anLocalInt] -= Class44.anInt312;
		anIntArray5193[anLocalInt] -= JagexHashMap.anInt489;
		anIntArray5189[anLocalInt]
		    -= Statics.anInt6646;
		if (argument_553_ != 0) {
		    int anLocalInt_555_
			= Node_Sub6.SINETABLE[argument_553_];
		    int anLocalInt_556_
			= Node_Sub6.COSINETABLE[argument_553_];
		    int anLocalInt_557_
			= ((anLocalInt_555_ * anIntArray5193[anLocalInt]
			    + anIntArray5163[anLocalInt] * anLocalInt_556_
			    + 16383)
			   >> 14);
		    anIntArray5193[anLocalInt]
			= (-(anIntArray5163[anLocalInt] * anLocalInt_555_)
			   + anIntArray5193[anLocalInt] * anLocalInt_556_
			   + 16383) >> 14;
		    anIntArray5163[anLocalInt] = anLocalInt_557_;
		}
		if (argument_551_ != 0) {
		    int anLocalInt_558_
			= Node_Sub6.SINETABLE[argument_551_];
		    int anLocalInt_559_
			= Node_Sub6.COSINETABLE[argument_551_];
		    int anLocalInt_560_
			= ((anLocalInt_559_ * anIntArray5193[anLocalInt]
			    - anIntArray5189[anLocalInt] * anLocalInt_558_
			    + 16383)
			   >> 14);
		    anIntArray5189[anLocalInt]
			= (anIntArray5193[anLocalInt] * anLocalInt_558_
			   + anIntArray5189[anLocalInt] * anLocalInt_559_
			   + 16383) >> 14;
		    anIntArray5193[anLocalInt] = anLocalInt_560_;
		}
		if (argument_552_ != 0) {
		    int anLocalInt_561_
			= Node_Sub6.SINETABLE[argument_552_];
		    int anLocalInt_562_
			= Node_Sub6.COSINETABLE[argument_552_];
		    int anLocalInt_563_
			= ((anLocalInt_561_ * anIntArray5189[anLocalInt]
			    + anIntArray5163[anLocalInt] * anLocalInt_562_
			    + 16383)
			   >> 14);
		    anIntArray5189[anLocalInt]
			= (-(anLocalInt_561_ * anIntArray5163[anLocalInt])
			   + anLocalInt_562_ * anIntArray5189[anLocalInt]
			   + 16383) >> 14;
		    anIntArray5163[anLocalInt] = anLocalInt_563_;
		}
		anIntArray5163[anLocalInt] += Class44.anInt312;
		anIntArray5193[anLocalInt] += JagexHashMap.anInt489;
		anIntArray5189[anLocalInt]
		    += Statics.anInt6646;
	    }
	} else if (argument_550_ == 3) {
	    for (int anLocalInt = 0; anLocalInt < anInt5200; anLocalInt++) {
		anIntArray5163[anLocalInt] -= Class44.anInt312;
		anIntArray5193[anLocalInt] -= JagexHashMap.anInt489;
		anIntArray5189[anLocalInt]
		    -= Statics.anInt6646;
		anIntArray5163[anLocalInt]
		    = anIntArray5163[anLocalInt] * argument_551_ / 128;
		anIntArray5193[anLocalInt]
		    = anIntArray5193[anLocalInt] * argument_552_ / 128;
		anIntArray5189[anLocalInt]
		    = argument_553_ * anIntArray5189[anLocalInt] / 128;
		anIntArray5163[anLocalInt] += Class44.anInt312;
		anIntArray5193[anLocalInt] += JagexHashMap.anInt489;
		anIntArray5189[anLocalInt]
		    += Statics.anInt6646;
	    }
	} else if (argument_550_ == 5) {
	    for (int anLocalInt = 0; anInt5164 > anLocalInt; anLocalInt++) {
		int anLocalInt_564_
		    = (aByteArray5184[anLocalInt] & 0xff) + argument_551_ * 8;
		if (anLocalInt_564_ < 0)
		    anLocalInt_564_ = 0;
		else if (anLocalInt_564_ > 255)
		    anLocalInt_564_ = 255;
		aByteArray5184[anLocalInt] = (byte) anLocalInt_564_;
	    }
	    if (aClass55Array5203 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5159;
		     anLocalInt++) {
		    Class55 class55 = aClass55Array5203[anLocalInt];
		    Class163 class163 = aClass163Array5156[anLocalInt];
		    ((Class163) class163).anInt1196
			= (255 - (aByteArray5184[((Class55) class55).anInt396]
				  & 0xff) << 24
			   | ((Class163) class163).anInt1196 & 0xffffff);
		}
	    }
	    method2712(-28645);
	} else if (argument_550_ == 7) {
	    for (int anLocalInt = 0; anInt5164 > anLocalInt; anLocalInt++) {
		int anLocalInt_565_ = aShortArray5168[anLocalInt] & 0xffff;
		int anLocalInt_566_ = anLocalInt_565_ >> 10 & 0x3f;
		int anLocalInt_567_ = (anLocalInt_565_ & 0x3b4) >> 7;
		anLocalInt_566_ = anLocalInt_566_ + argument_551_ & 0x3f;
		int anLocalInt_568_ = anLocalInt_565_ & 0x7f;
		anLocalInt_567_ += argument_552_ / 4;
		anLocalInt_568_ += argument_553_;
		if (anLocalInt_567_ >= 0) {
		    if (anLocalInt_567_ > 7)
			anLocalInt_567_ = 7;
		} else
		    anLocalInt_567_ = 0;
		if (anLocalInt_568_ < 0)
		    anLocalInt_568_ = 0;
		else if (anLocalInt_568_ > 127)
		    anLocalInt_568_ = 127;
		aShortArray5168[anLocalInt]
		    = (short) (MathStatics.OR
			       (anLocalInt_568_, MathStatics.OR((anLocalInt_566_ << 10), (anLocalInt_567_ << 7))));
	    }
	    if (aClass55Array5203 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5159;
		     anLocalInt++) {
		    Class55 class55 = aClass55Array5203[anLocalInt];
		    Class163 class163 = aClass163Array5156[anLocalInt];
		    ((Class163) class163).anInt1196
			= ((HslToRgb.table
			    [(aShortArray5168[((Class55) class55).anInt396]
			      & 0xffff)]) & 0xffffff
			   | ((Class163) class163).anInt1196 & ~0xffffff);
		}
	    }
	    method2712(-28645);
	} else if (argument_550_ == 8) {
	    for (int anLocalInt = 0; anInt5159 > anLocalInt; anLocalInt++) {
		Class163 class163 = aClass163Array5156[anLocalInt];
		((Class163) class163).anInt1192 += argument_551_;
		((Class163) class163).anInt1193 += argument_552_;
	    }
	} else if (argument_550_ == 10) {
	    for (int anLocalInt = 0; anLocalInt < anInt5159; anLocalInt++) {
		Class163 class163 = aClass163Array5156[anLocalInt];
		((Class163) class163).anInt1195
		    = argument_551_ * ((Class163) class163).anInt1195 >> 7;
		((Class163) class163).anInt1191
		    = ((Class163) class163).anInt1191 * argument_552_ >> 7;
	    }
	} else if (argument_550_ == 9) {
	    for (int anLocalInt = 0; anInt5159 > anLocalInt; anLocalInt++) {
		Class163 class163 = aClass163Array5156[anLocalInt];
		((Class163) class163).anInt1194
		    = ((Class163) class163).anInt1194 + argument_551_ & 0x3fff;
	    }
	}
    }
    
    final void FA(int argument_569_) {
	int anLocalInt = Node_Sub6.SINETABLE[argument_569_];
	int anLocalInt_570_ = Node_Sub6.COSINETABLE[argument_569_];
	for (int anLocalInt_571_ = 0; anInt5200 > anLocalInt_571_;
	     anLocalInt_571_++) {
	    int anLocalInt_572_
		= ((-(anLocalInt * anIntArray5189[anLocalInt_571_])
		    + anIntArray5193[anLocalInt_571_] * anLocalInt_570_)
		   >> 14);
	    anIntArray5189[anLocalInt_571_]
		= (anLocalInt * anIntArray5193[anLocalInt_571_]
		   + anIntArray5189[anLocalInt_571_] * anLocalInt_570_) >> 14;
	    anIntArray5193[anLocalInt_571_] = anLocalInt_572_;
	}
	method2705(true);
	aBoolean5157 = false;
    }
    
    private final boolean method2709(boolean argument_573_, int argument_574_,
				     int argument_575_, int argument_576_,
				     int argument_577_, Class350 argument_578_,
				     int argument_579_) {
	Class350_Sub2 class350_sub2 = (Class350_Sub2) argument_578_;
	Class350_Sub2 class350_sub2_580_
	    = ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aClass350_Sub2_4696;
	float f = (((Class350_Sub2) class350_sub2_580_).v3
		   + ((((Class350_Sub2) class350_sub2_580_).v1
		       * ((Class350_Sub2) class350_sub2).v7)
		      + (((Class350_Sub2) class350_sub2_580_).v0
			 * ((Class350_Sub2) class350_sub2).v3)
		      + (((Class350_Sub2) class350_sub2_580_).v2
			 * ((Class350_Sub2) class350_sub2).aFloat5443)));
	float f_581_ = ((((Class350_Sub2) class350_sub2_580_).v4
			 * ((Class350_Sub2) class350_sub2).v3)
			+ (((Class350_Sub2) class350_sub2_580_).v5
			   * ((Class350_Sub2) class350_sub2).v7)
			+ (((Class350_Sub2) class350_sub2_580_).v6
			   * ((Class350_Sub2) class350_sub2).aFloat5443)
			+ ((Class350_Sub2) class350_sub2_580_).v7);
	LoadingBar.aFloat1360
	    = ((((Class350_Sub2) class350_sub2_580_).v1
		* ((Class350_Sub2) class350_sub2).v5)
	       + (((Class350_Sub2) class350_sub2).v1
		  * ((Class350_Sub2) class350_sub2_580_).v0)
	       + (((Class350_Sub2) class350_sub2).aFloat5448
		  * ((Class350_Sub2) class350_sub2_580_).v2));
	Class256_Sub3.aFloat5628
	    = ((((Class350_Sub2) class350_sub2).aFloat5445
		* ((Class350_Sub2) class350_sub2_580_).v2)
	       + ((((Class350_Sub2) class350_sub2).v4
		   * ((Class350_Sub2) class350_sub2_580_).v1)
		  + (((Class350_Sub2) class350_sub2).v0
		     * ((Class350_Sub2) class350_sub2_580_).v0)));
	Class123.aFloat1001
	    = ((((Class350_Sub2) class350_sub2).v5
		* ((Class350_Sub2) class350_sub2_580_).v5)
	       + (((Class350_Sub2) class350_sub2).v1
		  * ((Class350_Sub2) class350_sub2_580_).v4)
	       + (((Class350_Sub2) class350_sub2).aFloat5448
		  * ((Class350_Sub2) class350_sub2_580_).v6));
	Node_Sub31_Sub4.aFloat5854
	    = ((((Class350_Sub2) class350_sub2).aFloat5448
		* ((Class350_Sub2) class350_sub2_580_).aFloat5444)
	       + ((((Class350_Sub2) class350_sub2).v5
		   * ((Class350_Sub2) class350_sub2_580_).aFloat5448)
		  + (((Class350_Sub2) class350_sub2).v1
		     * ((Class350_Sub2) class350_sub2_580_).aFloat5445)));
	float f_582_
	    = (((Class350_Sub2) class350_sub2_580_).aFloat5443
	       + ((((Class350_Sub2) class350_sub2).aFloat5443
		   * ((Class350_Sub2) class350_sub2_580_).aFloat5444)
		  + ((((Class350_Sub2) class350_sub2).v3
		      * ((Class350_Sub2) class350_sub2_580_).aFloat5445)
		     + (((Class350_Sub2) class350_sub2).v7
			* ((Class350_Sub2) class350_sub2_580_).aFloat5448))));
	Statics.aFloat5558
	    = ((((Class350_Sub2) class350_sub2_580_).aFloat5448
		* ((Class350_Sub2) class350_sub2).v4)
	       + (((Class350_Sub2) class350_sub2_580_).aFloat5445
		  * ((Class350_Sub2) class350_sub2).v0)
	       + (((Class350_Sub2) class350_sub2).aFloat5445
		  * ((Class350_Sub2) class350_sub2_580_).aFloat5444));
	Statics.aFloat6147
	    = ((((Class350_Sub2) class350_sub2).v2
		* ((Class350_Sub2) class350_sub2_580_).aFloat5445)
	       + (((Class350_Sub2) class350_sub2_580_).aFloat5448
		  * ((Class350_Sub2) class350_sub2).v6)
	       + (((Class350_Sub2) class350_sub2).aFloat5444
		  * ((Class350_Sub2) class350_sub2_580_).aFloat5444));
	Class261.aFloat2038
	    = ((((Class350_Sub2) class350_sub2).v6
		* ((Class350_Sub2) class350_sub2_580_).v1)
	       + (((Class350_Sub2) class350_sub2).v2
		  * ((Class350_Sub2) class350_sub2_580_).v0)
	       + (((Class350_Sub2) class350_sub2_580_).v2
		  * ((Class350_Sub2) class350_sub2).aFloat5444));
	Class62_Sub1.aFloat4364
	    = ((((Class350_Sub2) class350_sub2_580_).v6
		* ((Class350_Sub2) class350_sub2).aFloat5445)
	       + ((((Class350_Sub2) class350_sub2).v4
		   * ((Class350_Sub2) class350_sub2_580_).v5)
		  + (((Class350_Sub2) class350_sub2_580_).v4
		     * ((Class350_Sub2) class350_sub2).v0)));
	Node_Sub13.aFloat3977
	    = ((((Class350_Sub2) class350_sub2_580_).v4
		* ((Class350_Sub2) class350_sub2).v2)
	       + (((Class350_Sub2) class350_sub2_580_).v5
		  * ((Class350_Sub2) class350_sub2).v6)
	       + (((Class350_Sub2) class350_sub2_580_).v6
		  * ((Class350_Sub2) class350_sub2).aFloat5444));
	boolean anLocalBoolean = false;
	float f_583_ = 3.4028235E38F;
	float f_584_ = -3.4028235E38F;
	float f_585_ = 3.4028235E38F;
	float f_586_ = -3.4028235E38F;
	int anLocalInt = ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4750;
	int anLocalInt_587_ = ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4794;
	if (!aBoolean5157)
	    method2714(argument_576_ ^ 0x3c2e);
	int anLocalInt_588_ = -anInt5185 + anInt5152 >> 1;
	int anLocalInt_589_ = -anInt5205 + anInt5178 >> 1;
	int anLocalInt_590_ = anInt5182 - anInt5155 >> 1;
	int anLocalInt_591_ = anInt5185 + anLocalInt_588_;
	int anLocalInt_592_ = anInt5205 + anLocalInt_589_;
	int anLocalInt_593_ = anInt5155 + anLocalInt_590_;
	int anLocalInt_594_
	    = anLocalInt_591_ - (anLocalInt_588_ << argument_574_);
	int anLocalInt_595_
	    = -(anLocalInt_589_ << argument_574_) + anLocalInt_592_;
	int anLocalInt_596_
	    = anLocalInt_593_ - (anLocalInt_590_ << argument_574_);
	if (argument_576_ != -15442)
	    method2709(true, 125, 19, 65, 46, null, -49);
	int anLocalInt_597_
	    = anLocalInt_591_ + (anLocalInt_588_ << argument_574_);
	int anLocalInt_598_
	    = (anLocalInt_589_ << argument_574_) + anLocalInt_592_;
	int anLocalInt_599_
	    = (anLocalInt_590_ << argument_574_) + anLocalInt_593_;
	Statics.anIntArray430[0] = anLocalInt_594_;
	Class362.anIntArray3059[0] = anLocalInt_595_;
	Statics.anIntArray430[1] = anLocalInt_597_;
	LoadingBar.anIntArray1361[0] = anLocalInt_596_;
	Class362.anIntArray3059[1] = anLocalInt_595_;
	LoadingBar.anIntArray1361[1] = anLocalInt_596_;
	Statics.anIntArray430[2] = anLocalInt_594_;
	Class362.anIntArray3059[2] = anLocalInt_598_;
	Statics.anIntArray430[3] = anLocalInt_597_;
	LoadingBar.anIntArray1361[2] = anLocalInt_596_;
	Class362.anIntArray3059[3] = anLocalInt_598_;
	Statics.anIntArray430[4] = anLocalInt_594_;
	LoadingBar.anIntArray1361[3] = anLocalInt_596_;
	Class362.anIntArray3059[4] = anLocalInt_595_;
	LoadingBar.anIntArray1361[4] = anLocalInt_599_;
	Statics.anIntArray430[5] = anLocalInt_597_;
	Class362.anIntArray3059[5] = anLocalInt_595_;
	LoadingBar.anIntArray1361[5] = anLocalInt_599_;
	Statics.anIntArray430[6] = anLocalInt_594_;
	Class362.anIntArray3059[6] = anLocalInt_598_;
	Statics.anIntArray430[7] = anLocalInt_597_;
	LoadingBar.anIntArray1361[6] = anLocalInt_599_;
	Class362.anIntArray3059[7] = anLocalInt_598_;
	LoadingBar.anIntArray1361[7] = anLocalInt_599_;
	for (int anLocalInt_600_ = 0; anLocalInt_600_ < 8; anLocalInt_600_++) {
	    float f_601_ = (float) LoadingBar.anIntArray1361[anLocalInt_600_];
	    float f_602_ = (float) Statics.anIntArray430[anLocalInt_600_];
	    float f_603_ = (float) Class362.anIntArray3059[anLocalInt_600_];
	    float f_604_ = f_581_ + (Class123.aFloat1001 * f_603_
				     + f_602_ * Class62_Sub1.aFloat4364
				     + Node_Sub13.aFloat3977 * f_601_);
	    float f_605_ = f + (Class261.aFloat2038 * f_601_
				+ (f_602_ * Class256_Sub3.aFloat5628
				   + f_603_ * LoadingBar.aFloat1360));
	    float f_606_ = f_582_ + (Statics.aFloat5558 * f_602_
				     + Node_Sub31_Sub4.aFloat5854 * f_603_
				     + Statics.aFloat6147 * f_601_);
	    if ((float) ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4749
		<= f_606_) {
		if (argument_577_ > 0)
		    f_606_ = (float) argument_577_;
		float f_607_
		    = ((float) anLocalInt * f_605_ / f_606_
		       + (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				  .anInt4737));
		float f_608_
		    = ((float) ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4754
		       + f_604_ * (float) anLocalInt_587_ / f_606_);
		if (f_584_ < f_607_)
		    f_584_ = f_607_;
		if (f_583_ > f_607_)
		    f_583_ = f_607_;
		anLocalBoolean = true;
		if (f_585_ > f_608_)
		    f_585_ = f_608_;
		if (f_608_ > f_586_)
		    f_586_ = f_608_;
	    }
	}
	if (anLocalBoolean && f_583_ < (float) argument_575_
	    && f_584_ > (float) argument_575_ && (float) argument_579_ > f_585_
	    && f_586_ > (float) argument_579_) {
	    if (argument_573_)
		return true;
	    if (anInt5186 > Class354.anIntArray3004.length) {
		Class354.anIntArray3004 = new int[anInt5186];
		Class352.anIntArray2948 = new int[anInt5186];
	    }
	    for (int anLocalInt_609_ = 0; anInt5200 > anLocalInt_609_;
		 anLocalInt_609_++) {
		float f_610_ = (float) anIntArray5189[anLocalInt_609_];
		float f_611_ = (float) anIntArray5193[anLocalInt_609_];
		float f_612_ = (float) anIntArray5163[anLocalInt_609_];
		float f_613_
		    = (Node_Sub31_Sub4.aFloat5854 * f_611_
		       + Statics.aFloat5558 * f_612_
		       + Statics.aFloat6147 * f_610_ + f_582_);
		float f_614_ = f_581_ + (f_610_ * Node_Sub13.aFloat3977
					 + (Class62_Sub1.aFloat4364 * f_612_
					    + Class123.aFloat1001 * f_611_));
		float f_615_ = (f_612_ * Class256_Sub3.aFloat5628
				+ LoadingBar.aFloat1360 * f_611_
				+ f_610_ * Class261.aFloat2038 + f);
		if (!((float) ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4749
		      <= f_613_)) {
		    int anLocalInt_616_ = anIntArray5202[anLocalInt_609_];
		    int anLocalInt_617_ = anIntArray5202[anLocalInt_609_ + 1];
		    for (int anLocalInt_618_ = anLocalInt_616_;
			 anLocalInt_618_ < anLocalInt_617_;
			 anLocalInt_618_++) {
			int anLocalInt_619_
			    = aShortArray5174[anLocalInt_618_] - 1;
			if (anLocalInt_619_ == -1)
			    break;
			Class354.anIntArray3004
			    [aShortArray5174[anLocalInt_618_] - 1]
			    = -999999;
		    }
		} else {
		    if (argument_577_ > 0)
			f_613_ = (float) argument_577_;
		    int anLocalInt_620_
			= (int) ((float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					  .anInt4737)
				 + f_615_ * (float) anLocalInt / f_613_);
		    int anLocalInt_621_
			= (int) (f_614_ * (float) anLocalInt_587_ / f_613_
				 + (float) ((GraphicsToolkit_Sub2)
					    aClass_ha_Sub2_5194).anInt4754);
		    int anLocalInt_622_ = anIntArray5202[anLocalInt_609_];
		    int anLocalInt_623_ = anIntArray5202[anLocalInt_609_ + 1];
		    for (int anLocalInt_624_ = anLocalInt_622_;
			 anLocalInt_623_ > anLocalInt_624_;
			 anLocalInt_624_++) {
			int anLocalInt_625_
			    = aShortArray5174[anLocalInt_624_] - 1;
			if (anLocalInt_625_ == -1)
			    break;
			Class354.anIntArray3004[anLocalInt_625_]
			    = anLocalInt_620_;
			Class352.anIntArray2948[anLocalInt_625_]
			    = anLocalInt_621_;
		    }
		}
	    }
	    for (int anLocalInt_626_ = 0; anLocalInt_626_ < anInt5164;
		 anLocalInt_626_++) {
		if ((Class354.anIntArray3004[aShortArray5162[anLocalInt_626_]]
		     != -999999)
		    && (Class354.anIntArray3004
			[aShortArray5149[anLocalInt_626_]]) != -999999
		    && (Class354.anIntArray3004
			[aShortArray5196[anLocalInt_626_]]) != -999999
		    && method2702((Class352.anIntArray2948
				   [aShortArray5149[anLocalInt_626_]]),
				  (Class354.anIntArray3004
				   [aShortArray5162[anLocalInt_626_]]),
				  argument_575_, argument_579_,
				  (Class352.anIntArray2948
				   [aShortArray5196[anLocalInt_626_]]),
				  2,
				  (Class354.anIntArray3004
				   [aShortArray5196[anLocalInt_626_]]),
				  (Class354.anIntArray3004
				   [aShortArray5149[anLocalInt_626_]]),
				  (Class352.anIntArray2948
				   [aShortArray5162[anLocalInt_626_]])))
		    return true;
	    }
	}
	return false;
    }
    
    final int fa() {
	if (!aBoolean5157)
	    method2714(-125);
	return anInt5205;
    }
    
    final boolean r() {
	return aBoolean5147;
    }
    
    final void method2660(Class167 argument_627_, int argument_628_,
			  int argument_629_, int argument_630_,
			  boolean argument_631_) {
	Class167_Sub2 class167_sub2 = (Class167_Sub2) argument_627_;
	if (anInt5164 != 0 && class167_sub2.anInt5164 != 0) {
	    int anLocalInt = class167_sub2.anInt5200;
	    int[] anLocalInts = class167_sub2.anIntArray5163;
	    int[] anLocalInts_632_ = class167_sub2.anIntArray5193;
	    int[] anLocalInts_633_ = class167_sub2.anIntArray5189;
	    short[] anLocalInts_634_ = class167_sub2.aShortArray5166;
	    short[] anLocalInts_635_ = class167_sub2.aShortArray5187;
	    short[] anLocalInts_636_ = class167_sub2.aShortArray5197;
	    byte[] anLocalInts_637_ = class167_sub2.aByteArray5160;
	    byte[] anLocalInts_638_;
	    short[] anLocalInts_639_;
	    short[] anLocalInts_640_;
	    short[] anLocalInts_641_;
	    if (aClass284_5172 != null) {
		anLocalInts_641_ = ((Class284) aClass284_5172).aShortArray2284;
		anLocalInts_638_ = ((Class284) aClass284_5172).aByteArray2282;
		anLocalInts_639_ = ((Class284) aClass284_5172).aShortArray2281;
		anLocalInts_640_ = ((Class284) aClass284_5172).aShortArray2278;
	    } else {
		anLocalInts_638_ = null;
		anLocalInts_639_ = null;
		anLocalInts_640_ = null;
		anLocalInts_641_ = null;
	    }
	    short[] anLocalInts_642_;
	    byte[] anLocalInts_643_;
	    short[] anLocalInts_644_;
	    short[] anLocalInts_645_;
	    if (class167_sub2.aClass284_5172 == null) {
		anLocalInts_642_ = null;
		anLocalInts_643_ = null;
		anLocalInts_645_ = null;
		anLocalInts_644_ = null;
	    } else {
		anLocalInts_642_ = (((Class284) class167_sub2.aClass284_5172)
				    .aShortArray2284);
		anLocalInts_643_
		    = ((Class284) class167_sub2.aClass284_5172).aByteArray2282;
		anLocalInts_644_ = (((Class284) class167_sub2.aClass284_5172)
				    .aShortArray2278);
		anLocalInts_645_ = (((Class284) class167_sub2.aClass284_5172)
				    .aShortArray2281);
	    }
	    int[] anLocalInts_646_ = class167_sub2.anIntArray5202;
	    short[] anLocalInts_647_ = class167_sub2.aShortArray5174;
	    if (!class167_sub2.aBoolean5157)
		class167_sub2.method2714(66);
	    int anLocalInt_648_ = class167_sub2.anInt5205;
	    int anLocalInt_649_ = class167_sub2.anInt5178;
	    int anLocalInt_650_ = class167_sub2.anInt5185;
	    int anLocalInt_651_ = class167_sub2.anInt5152;
	    int anLocalInt_652_ = class167_sub2.anInt5155;
	    int anLocalInt_653_ = class167_sub2.anInt5182;
	    for (int anLocalInt_654_ = 0; anInt5200 > anLocalInt_654_;
		 anLocalInt_654_++) {
		int anLocalInt_655_
		    = anIntArray5193[anLocalInt_654_] - argument_629_;
		if (anLocalInt_655_ >= anLocalInt_648_
		    && anLocalInt_649_ >= anLocalInt_655_) {
		    int anLocalInt_656_
			= anIntArray5163[anLocalInt_654_] - argument_628_;
		    if (anLocalInt_656_ >= anLocalInt_650_
			&& anLocalInt_656_ <= anLocalInt_651_) {
			int anLocalInt_657_
			    = anIntArray5189[anLocalInt_654_] - argument_630_;
			if (anLocalInt_652_ <= anLocalInt_657_
			    && anLocalInt_657_ <= anLocalInt_653_) {
			    int anLocalInt_658_ = -1;
			    int anLocalInt_659_
				= anIntArray5202[anLocalInt_654_];
			    int anLocalInt_660_
				= anIntArray5202[anLocalInt_654_ + 1];
			    for (int anLocalInt_661_ = anLocalInt_659_;
				 anLocalInt_661_ < anLocalInt_660_;
				 anLocalInt_661_++) {
				anLocalInt_658_
				    = aShortArray5174[anLocalInt_661_] - 1;
				if (anLocalInt_658_ == -1
				    || aByteArray5160[anLocalInt_658_] != 0)
				    break;
			    }
			    if (anLocalInt_658_ != -1) {
				for (int anLocalInt_662_ = 0;
				     anLocalInt_662_ < anLocalInt;
				     anLocalInt_662_++) {
				    if ((anLocalInt_656_
					 == anLocalInts[anLocalInt_662_])
					&& (anLocalInts_633_[anLocalInt_662_]
					    == anLocalInt_657_)
					&& (anLocalInt_655_
					    == (anLocalInts_632_
						[anLocalInt_662_]))) {
					anLocalInt_659_ = (anLocalInts_646_
							   [anLocalInt_662_]);
					anLocalInt_660_
					    = (anLocalInts_646_
					       [anLocalInt_662_ + 1]);
					int anLocalInt_663_ = -1;
					for (int anLocalInt_664_
						 = anLocalInt_659_;
					     anLocalInt_664_ < anLocalInt_660_;
					     anLocalInt_664_++) {
					    anLocalInt_663_
						= (anLocalInts_647_
						   [anLocalInt_664_]) - 1;
					    if (anLocalInt_663_ == -1
						|| (anLocalInts_637_
						    [anLocalInt_663_]) != 0)
						break;
					}
					if (anLocalInt_663_ != -1) {
					    if (anLocalInts_640_ == null) {
						aClass284_5172
						    = new Class284();
						anLocalInts_640_
						    = ((Class284)
						       aClass284_5172)
							  .aShortArray2278
						    = (Class46.method433
						       (-29647,
							aShortArray5166));
						anLocalInts_639_
						    = ((Class284)
						       aClass284_5172)
							  .aShortArray2281
						    = (Class46.method433
						       (-29647,
							aShortArray5187));
						anLocalInts_641_
						    = ((Class284)
						       aClass284_5172)
							  .aShortArray2284
						    = (Class46.method433
						       (-29647,
							aShortArray5197));
						anLocalInts_638_
						    = ((Class284)
						       aClass284_5172)
							  .aByteArray2282
						    = (Class37.method388
						       (false,
							aByteArray5160));
					    }
					    if (anLocalInts_644_ == null) {
						Class284 class284
						    = (class167_sub2
							   .aClass284_5172
						       = new Class284());
						anLocalInts_644_
						    = ((Class284) class284)
							  .aShortArray2278
						    = (Class46.method433
						       (-29647,
							anLocalInts_634_));
						anLocalInts_645_
						    = ((Class284) class284)
							  .aShortArray2281
						    = (Class46.method433
						       (-29647,
							anLocalInts_635_));
						anLocalInts_642_
						    = ((Class284) class284)
							  .aShortArray2284
						    = (Class46.method433
						       (-29647,
							anLocalInts_636_));
						anLocalInts_643_
						    = ((Class284) class284)
							  .aByteArray2282
						    = (Class37.method388
						       (false,
							anLocalInts_637_));
					    }
					    short anLocalInt_665_
						= (aShortArray5166
						   [anLocalInt_658_]);
					    short anLocalInt_666_
						= (aShortArray5187
						   [anLocalInt_658_]);
					    short anLocalInt_667_
						= (aShortArray5197
						   [anLocalInt_658_]);
					    anLocalInt_660_
						= (anLocalInts_646_
						   [anLocalInt_662_ + 1]);
					    anLocalInt_659_
						= (anLocalInts_646_
						   [anLocalInt_662_]);
					    byte anLocalInt_668_
						= (aByteArray5160
						   [anLocalInt_658_]);
					    for (int anLocalInt_669_
						     = anLocalInt_659_;
						 (anLocalInt_669_
						  < anLocalInt_660_);
						 anLocalInt_669_++) {
						int anLocalInt_670_
						    = ((anLocalInts_647_
							[anLocalInt_669_])
						       - 1);
						if (anLocalInt_670_ == -1)
						    break;
						if ((anLocalInts_643_
						     [anLocalInt_670_])
						    != 0) {
						    anLocalInts_644_
							[anLocalInt_670_]
							+= anLocalInt_665_;
						    anLocalInts_645_
							[anLocalInt_670_]
							+= anLocalInt_666_;
						    anLocalInts_642_
							[anLocalInt_670_]
							+= anLocalInt_667_;
						    anLocalInts_643_
							[anLocalInt_670_]
							+= anLocalInt_668_;
						}
					    }
					    anLocalInt_667_
						= (anLocalInts_636_
						   [anLocalInt_663_]);
					    anLocalInt_666_
						= (anLocalInts_635_
						   [anLocalInt_663_]);
					    anLocalInt_660_
						= (anIntArray5202
						   [anLocalInt_654_ + 1]);
					    anLocalInt_659_
						= (anIntArray5202
						   [anLocalInt_654_]);
					    anLocalInt_668_
						= (anLocalInts_637_
						   [anLocalInt_663_]);
					    anLocalInt_665_
						= (anLocalInts_634_
						   [anLocalInt_663_]);
					    for (int anLocalInt_671_
						     = anLocalInt_659_;
						 (anLocalInt_671_
						  < anLocalInt_660_);
						 anLocalInt_671_++) {
						int anLocalInt_672_
						    = ((aShortArray5174
							[anLocalInt_671_])
						       - 1);
						if (anLocalInt_672_ == -1)
						    break;
						if ((anLocalInts_638_
						     [anLocalInt_672_])
						    != 0) {
						    anLocalInts_640_
							[anLocalInt_672_]
							+= anLocalInt_665_;
						    anLocalInts_639_
							[anLocalInt_672_]
							+= anLocalInt_666_;
						    anLocalInts_641_
							[anLocalInt_672_]
							+= anLocalInt_667_;
						    anLocalInts_638_
							[anLocalInt_672_]
							+= anLocalInt_668_;
						}
					    }
					    class167_sub2
						.method2708((byte) 40);
					    method2708((byte) 40);
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    final int EA() {
	if (!aBoolean5157)
	    method2714(-118);
	return anInt5178;
    }
    
    final int RA() {
	if (!aBoolean5157)
	    method2714(-125);
	return anInt5152;
    }
    
    final void C(int argument_673_) {
	aShort5204 = (short) argument_673_;
	method2712(-28645);
    }
    
    final void ia(short argument_674_, short argument_675_) {
	for (int anLocalInt = 0; anInt5164 > anLocalInt; anLocalInt++) {
	    if (argument_674_ == aShortArray5168[anLocalInt])
		aShortArray5168[anLocalInt] = argument_675_;
	}
	if (aClass55Array5203 != null) {
	    for (int anLocalInt = 0; anInt5159 > anLocalInt; anLocalInt++) {
		Class55 class55 = aClass55Array5203[anLocalInt];
		Class163 class163 = aClass163Array5156[anLocalInt];
		((Class163) class163).anInt1196
		    = ((HslToRgb.table
			[(aShortArray5168[((Class55) class55).anInt396]
			  & 0xffff)]) & 0xffffff
		       | ((Class163) class163).anInt1196 & ~0xffffff);
	    }
	}
	method2712(-28645);
    }
    
    final void method2640(Class350 argument_676_, DoublyLinkedNodeP2_Sub9 argument_677_,
			  int argument_678_) {
	if (anInt5186 != 0) {
	    Class350_Sub2 class350_sub2
		= ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aClass350_Sub2_4696;
	    Class350_Sub2 class350_sub2_679_ = (Class350_Sub2) argument_676_;
	    if (!aBoolean5157)
		method2714(66);
	    Class174.aFloat3441
		= ((((Class350_Sub2) class350_sub2_679_).aFloat5443
		    * ((Class350_Sub2) class350_sub2).aFloat5444)
		   + ((((Class350_Sub2) class350_sub2).aFloat5445
		       * ((Class350_Sub2) class350_sub2_679_).v3)
		      + (((Class350_Sub2) class350_sub2_679_).v7
			 * ((Class350_Sub2) class350_sub2).aFloat5448))
		   + ((Class350_Sub2) class350_sub2).aFloat5443);
	    Node_Sub31_Sub4.aFloat5854
		= ((((Class350_Sub2) class350_sub2_679_).v5
		    * ((Class350_Sub2) class350_sub2).aFloat5448)
		   + (((Class350_Sub2) class350_sub2_679_).v1
		      * ((Class350_Sub2) class350_sub2).aFloat5445)
		   + (((Class350_Sub2) class350_sub2_679_).aFloat5448
		      * ((Class350_Sub2) class350_sub2).aFloat5444));
	    float f = ((float) anInt5205 * Node_Sub31_Sub4.aFloat5854
		       + Class174.aFloat3441);
	    float f_680_ = (Node_Sub31_Sub4.aFloat5854 * (float) anInt5178
			    + Class174.aFloat3441);
	    float f_681_;
	    float f_682_;
	    if (f > f_680_) {
		f_681_ = f_680_ - (float) anInt5148;
		f_682_ = f + (float) anInt5148;
	    } else {
		f_681_ = f - (float) anInt5148;
		f_682_ = (float) anInt5148 + f_680_;
	    }
	    if (!(f_681_ >= ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aFloat4746)
		&& !(f_682_ <= (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					.anInt4749))) {
		Class189.aFloat3620
		    = (((Class350_Sub2) class350_sub2).v3
		       + ((((Class350_Sub2) class350_sub2).v2
			   * ((Class350_Sub2) class350_sub2_679_).aFloat5443)
			  + ((((Class350_Sub2) class350_sub2).v0
			      * (((Class350_Sub2) class350_sub2_679_)
				 .v3))
			     + (((Class350_Sub2) class350_sub2).v1
				* (((Class350_Sub2) class350_sub2_679_)
				   .v7)))));
		LoadingBar.aFloat1360
		    = ((((Class350_Sub2) class350_sub2_679_).v1
			* ((Class350_Sub2) class350_sub2).v0)
		       + (((Class350_Sub2) class350_sub2).v1
			  * ((Class350_Sub2) class350_sub2_679_).v5)
		       + (((Class350_Sub2) class350_sub2).v2
			  * ((Class350_Sub2) class350_sub2_679_).aFloat5448));
		float f_683_ = (Class189.aFloat3620
				+ (float) anInt5205 * LoadingBar.aFloat1360);
		float f_684_ = (LoadingBar.aFloat1360 * (float) anInt5178
				+ Class189.aFloat3620);
		float f_685_;
		float f_686_;
		if (f_683_ > f_684_) {
		    f_686_ = ((f_683_ + (float) anInt5148)
			      * (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					 .anInt4750));
		    f_685_ = ((f_684_ - (float) anInt5148)
			      * (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					 .anInt4750));
		} else {
		    f_685_
			= (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				   .anInt4750) * (f_683_ - (float) anInt5148);
		    f_686_ = (((float) anInt5148 + f_684_)
			      * (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					 .anInt4750));
		}
		if (!(((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aFloat4718
		      <= f_685_ / f_682_)
		    && !(((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aFloat4708
			 >= f_686_ / f_682_)) {
		    Class159.aFloat3670
			= ((((Class350_Sub2) class350_sub2).v5
			    * ((Class350_Sub2) class350_sub2_679_).v7)
			   + (((Class350_Sub2) class350_sub2).v4
			      * (((Class350_Sub2) class350_sub2_679_)
				 .v3))
			   + (((Class350_Sub2) class350_sub2_679_).aFloat5443
			      * ((Class350_Sub2) class350_sub2).v6)
			   + ((Class350_Sub2) class350_sub2).v7);
		    Class123.aFloat1001
			= ((((Class350_Sub2) class350_sub2).v6
			    * ((Class350_Sub2) class350_sub2_679_).aFloat5448)
			   + ((((Class350_Sub2) class350_sub2).v4
			       * (((Class350_Sub2) class350_sub2_679_)
				  .v1))
			      + ((((Class350_Sub2) class350_sub2_679_)
				  .v5)
				 * (((Class350_Sub2) class350_sub2)
				    .v5))));
		    float f_687_ = ((float) anInt5205 * Class123.aFloat1001
				    + Class159.aFloat3670);
		    float f_688_ = (Class159.aFloat3670
				    + (float) anInt5178 * Class123.aFloat1001);
		    float f_689_;
		    float f_690_;
		    if (f_688_ < f_687_) {
			f_690_
			    = ((float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					.anInt4794)
			       * ((float) anInt5148 + f_687_));
			f_689_
			    = ((float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					.anInt4794)
			       * ((float) -anInt5148 + f_688_));
		    } else {
			f_689_
			    = ((f_687_ - (float) anInt5148)
			       * (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					  .anInt4794));
			f_690_
			    = (((float) anInt5148 + f_688_)
			       * (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					  .anInt4794));
		    }
		    if (!(f_689_ / f_682_
			  >= ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aFloat4787)
			&& !(f_690_ / f_682_
			     <= (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				 .aFloat4770))) {
			if (argument_677_ != null
			    || aClass55Array5203 != null) {
			    Statics.aFloat6147
				= (((((Class350_Sub2) class350_sub2_679_)
				     .aFloat5444)
				    * (((Class350_Sub2) class350_sub2)
				       .aFloat5444))
				   + (((((Class350_Sub2) class350_sub2_679_)
					.v2)
				       * (((Class350_Sub2) class350_sub2)
					  .aFloat5445))
				      + ((((Class350_Sub2) class350_sub2)
					  .aFloat5448)
					 * ((Class350_Sub2)
					    class350_sub2_679_).v6)));
			    Class62_Sub1.aFloat4364
				= (((((Class350_Sub2) class350_sub2_679_)
				     .aFloat5445)
				    * (((Class350_Sub2) class350_sub2)
				       .v6))
				   + (((((Class350_Sub2) class350_sub2)
					.v4)
				       * (((Class350_Sub2) class350_sub2_679_)
					  .v0))
				      + ((((Class350_Sub2) class350_sub2_679_)
					  .v4)
					 * (((Class350_Sub2) class350_sub2)
					    .v5))));
			    Class261.aFloat2038
				= ((((Class350_Sub2) class350_sub2).v2
				    * (((Class350_Sub2) class350_sub2_679_)
				       .aFloat5444))
				   + (((((Class350_Sub2) class350_sub2)
					.v0)
				       * (((Class350_Sub2) class350_sub2_679_)
					  .v2))
				      + ((((Class350_Sub2) class350_sub2)
					  .v1)
					 * ((Class350_Sub2)
					    class350_sub2_679_).v6)));
			    Node_Sub13.aFloat3977
				= (((((Class350_Sub2) class350_sub2_679_)
				     .aFloat5444)
				    * (((Class350_Sub2) class350_sub2)
				       .v6))
				   + (((((Class350_Sub2) class350_sub2)
					.v5)
				       * (((Class350_Sub2) class350_sub2_679_)
					  .v6))
				      + ((((Class350_Sub2) class350_sub2_679_)
					  .v2)
					 * (((Class350_Sub2) class350_sub2)
					    .v4))));
			    Statics.aFloat5558
				= ((((Class350_Sub2) class350_sub2).aFloat5444
				    * (((Class350_Sub2) class350_sub2_679_)
				       .aFloat5445))
				   + (((((Class350_Sub2) class350_sub2_679_)
					.v4)
				       * (((Class350_Sub2) class350_sub2)
					  .aFloat5448))
				      + ((((Class350_Sub2) class350_sub2_679_)
					  .v0)
					 * (((Class350_Sub2) class350_sub2)
					    .aFloat5445))));
			    Class256_Sub3.aFloat5628
				= ((((Class350_Sub2) class350_sub2).v0
				    * (((Class350_Sub2) class350_sub2_679_)
				       .v0))
				   + ((((Class350_Sub2) class350_sub2)
				       .v1)
				      * (((Class350_Sub2) class350_sub2_679_)
					 .v4))
				   + ((((Class350_Sub2) class350_sub2_679_)
				       .aFloat5445)
				      * (((Class350_Sub2) class350_sub2)
					 .v2)));
			}
			if (argument_677_ != null) {
			    boolean anLocalBoolean = false;
			    boolean anLocalBoolean_691_ = true;
			    int anLocalInt = anInt5152 + anInt5185 >> 1;
			    int anLocalInt_692_ = anInt5182 + anInt5155 >> 1;
			    int anLocalInt_693_
				= (int) ((Class256_Sub3.aFloat5628
					  * (float) anLocalInt)
					 + Class189.aFloat3620
					 + ((float) anInt5205
					    * LoadingBar.aFloat1360)
					 + (Class261.aFloat2038
					    * (float) anLocalInt_692_));
			    int anLocalInt_694_
				= (int) (Class159.aFloat3670
					 + ((float) anLocalInt
					    * Class62_Sub1.aFloat4364)
					 + (Class123.aFloat1001
					    * (float) anInt5205)
					 + ((float) anLocalInt_692_
					    * Node_Sub13.aFloat3977));
			    int anLocalInt_695_
				= (int) (((float) anLocalInt
					  * Statics.aFloat5558)
					 + Class174.aFloat3441
					 + (Node_Sub31_Sub4.aFloat5854
					    * (float) anInt5205)
					 + (Statics.aFloat6147
					    * (float) anLocalInt_692_));
			    if (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4749
				> anLocalInt_695_)
				anLocalBoolean = true;
			    else {
				((DoublyLinkedNodeP2_Sub9) argument_677_).anInt4589
				    = ((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					.anInt4754)
				       + (anLocalInt_694_
					  * ((GraphicsToolkit_Sub2)
					     aClass_ha_Sub2_5194).anInt4794
					  / anLocalInt_695_));
				((DoublyLinkedNodeP2_Sub9) argument_677_).anInt4588
				    = ((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					.anInt4737)
				       + (anLocalInt_693_
					  * ((GraphicsToolkit_Sub2)
					     aClass_ha_Sub2_5194).anInt4750
					  / anLocalInt_695_));
			    }
			    int anLocalInt_696_
				= (int) ((Class261.aFloat2038
					  * (float) anLocalInt_692_)
					 + (((float) anLocalInt
					     * Class256_Sub3.aFloat5628)
					    + Class189.aFloat3620
					    + ((float) anInt5178
					       * LoadingBar.aFloat1360)));
			    int anLocalInt_697_
				= (int) ((Node_Sub13.aFloat3977
					  * (float) anLocalInt_692_)
					 + (Class159.aFloat3670
					    + (Class62_Sub1.aFloat4364
					       * (float) anLocalInt)
					    + ((float) anInt5178
					       * Class123.aFloat1001)));
			    int anLocalInt_698_
				= (int) ((Statics.aFloat6147
					  * (float) anLocalInt_692_)
					 + (((float) anInt5178
					     * Node_Sub31_Sub4.aFloat5854)
					    + ((Statics.aFloat5558
						* (float) anLocalInt)
					       + Class174.aFloat3441)));
			    if (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).anInt4749
				<= anLocalInt_698_) {
				((DoublyLinkedNodeP2_Sub9) argument_677_).anInt4587
				    = ((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					.anInt4754)
				       + (anLocalInt_697_
					  * ((GraphicsToolkit_Sub2)
					     aClass_ha_Sub2_5194).anInt4794
					  / anLocalInt_698_));
				((DoublyLinkedNodeP2_Sub9) argument_677_).anInt4590
				    = ((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					.anInt4737)
				       + (anLocalInt_696_
					  * ((GraphicsToolkit_Sub2)
					     aClass_ha_Sub2_5194).anInt4750
					  / anLocalInt_698_));
			    } else
				anLocalBoolean = true;
			    if (anLocalBoolean) {
				if ((anLocalInt_695_
				     >= (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					 .anInt4749))
				    || (anLocalInt_698_
					>= ((GraphicsToolkit_Sub2)
					    aClass_ha_Sub2_5194).anInt4749)) {
				    if ((((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					 .anInt4749)
					<= anLocalInt_695_) {
					if (((GraphicsToolkit_Sub2)
					     aClass_ha_Sub2_5194).anInt4749
					    > anLocalInt_698_) {
					    int anLocalInt_699_
						= (((anLocalInt_695_
						     - (((GraphicsToolkit_Sub2)
							 aClass_ha_Sub2_5194)
							.anInt4749))
						    << 16)
						   / (anLocalInt_695_
						      - anLocalInt_698_));
					    int anLocalInt_700_
						= (anLocalInt_693_
						   + ((anLocalInt_699_
						       * (-anLocalInt_696_
							  + anLocalInt_693_))
						      >> 16));
					    int anLocalInt_701_
						= ((((anLocalInt_694_
						      - anLocalInt_697_)
						     * anLocalInt_699_)
						    >> 16)
						   + anLocalInt_694_);
					    ((DoublyLinkedNodeP2_Sub9) argument_677_)
						.anInt4588
						= ((((GraphicsToolkit_Sub2)
						     aClass_ha_Sub2_5194)
						    .anInt4737)
						   + ((((GraphicsToolkit_Sub2)
							aClass_ha_Sub2_5194)
						       .anInt4750)
						      * anLocalInt_700_
						      / (((GraphicsToolkit_Sub2)
							  aClass_ha_Sub2_5194)
							 .anInt4749)));
					    ((DoublyLinkedNodeP2_Sub9) argument_677_)
						.anInt4589
						= ((((GraphicsToolkit_Sub2)
						     aClass_ha_Sub2_5194)
						    .anInt4754)
						   + ((((GraphicsToolkit_Sub2)
							aClass_ha_Sub2_5194)
						       .anInt4794)
						      * anLocalInt_701_
						      / (((GraphicsToolkit_Sub2)
							  aClass_ha_Sub2_5194)
							 .anInt4749)));
					}
				    } else {
					int anLocalInt_702_
					    = (((anLocalInt_698_
						 - (((GraphicsToolkit_Sub2)
						     aClass_ha_Sub2_5194)
						    .anInt4749))
						<< 16)
					       / (anLocalInt_698_
						  - anLocalInt_695_));
					int anLocalInt_703_
					    = (anLocalInt_696_
					       + ((anLocalInt_702_
						   * (anLocalInt_696_
						      - anLocalInt_693_))
						  >> 16));
					int anLocalInt_704_
					    = (((anLocalInt_702_
						 * (-anLocalInt_694_
						    + anLocalInt_697_))
						>> 16)
					       + anLocalInt_697_);
					((DoublyLinkedNodeP2_Sub9) argument_677_)
					    .anInt4588
					    = (((GraphicsToolkit_Sub2)
						aClass_ha_Sub2_5194).anInt4737
					       + (anLocalInt_703_
						  * (((GraphicsToolkit_Sub2)
						      aClass_ha_Sub2_5194)
						     .anInt4750)
						  / (((GraphicsToolkit_Sub2)
						      aClass_ha_Sub2_5194)
						     .anInt4749)));
					((DoublyLinkedNodeP2_Sub9) argument_677_)
					    .anInt4589
					    = ((anLocalInt_704_
						* (((GraphicsToolkit_Sub2)
						    aClass_ha_Sub2_5194)
						   .anInt4794)
						/ (((GraphicsToolkit_Sub2)
						    aClass_ha_Sub2_5194)
						   .anInt4749))
					       + (((GraphicsToolkit_Sub2)
						   aClass_ha_Sub2_5194)
						  .anInt4754));
				    }
				} else
				    anLocalBoolean_691_ = false;
			    }
			    if (anLocalBoolean_691_) {
				if (anLocalInt_698_ >= anLocalInt_695_)
				    ((DoublyLinkedNodeP2_Sub9) argument_677_).anInt4586
					= (((anLocalInt_696_ + anInt5148)
					    * ((GraphicsToolkit_Sub2)
					       aClass_ha_Sub2_5194).anInt4750
					    / anLocalInt_698_)
					   + ((GraphicsToolkit_Sub2)
					      aClass_ha_Sub2_5194).anInt4737
					   - (((DoublyLinkedNodeP2_Sub9) argument_677_)
					      .anInt4590));
				else
				    ((DoublyLinkedNodeP2_Sub9) argument_677_).anInt4586
					= (-(((DoublyLinkedNodeP2_Sub9) argument_677_)
					     .anInt4588)
					   + ((((GraphicsToolkit_Sub2)
						aClass_ha_Sub2_5194).anInt4750
					       * (anInt5148 + anLocalInt_693_)
					       / anLocalInt_695_)
					      + (((GraphicsToolkit_Sub2)
						  aClass_ha_Sub2_5194)
						 .anInt4737)));
				((DoublyLinkedNodeP2_Sub9) argument_677_).aBoolean4591
				    = true;
			    }
			}
			aClass_ha_Sub2_5194.method2200(true);
			aClass_ha_Sub2_5194.method2120(2, class350_sub2_679_);
			method2704(14295);
			method2700((byte) 119);
		    }
		}
	    }
	}
    }
    
    private final void method2710(byte argument_705_) {
	int anLocalInt = 107 % ((argument_705_ + 20) / 52);
	if (aBoolean5170) {
	    aBoolean5170 = false;
	    if (aClass38Array5145 == null && aClass185Array5206 == null
		&& aClass55Array5203 == null
		&& !Class307.method3605(anInt5195, anInt5201, 55)) {
		boolean anLocalBoolean = false;
		boolean anLocalBoolean_706_ = false;
		if (anIntArray5163 != null
		    && !Statics.method3355(anInt5201, 126, anInt5195)) {
		    if (aClass247_5199 == null
			|| aClass247_5199.method3204(4)) {
			if (!aBoolean5157)
			    method2714(61);
			anLocalBoolean = true;
		    } else
			aBoolean5170 = true;
		}
		boolean anLocalBoolean_707_ = false;
		if (anIntArray5193 != null
		    && !Class133.method2443(anInt5201, anInt5195,
					    (byte) -31)) {
		    if (aClass247_5199 != null
			&& !aClass247_5199.method3204(4))
			aBoolean5170 = true;
		    else {
			anLocalBoolean_706_ = true;
			if (!aBoolean5157)
			    method2714(-123);
		    }
		}
		if (anIntArray5189 != null
		    && !DoublyLinkedNode_Sub51_Sub8.method1234(-119, anInt5201, anInt5195)) {
		    if (aClass247_5199 != null
			&& !aClass247_5199.method3204(4))
			aBoolean5170 = true;
		    else {
			anLocalBoolean_707_ = true;
			if (!aBoolean5157)
			    method2714(-127);
		    }
		}
		if (anLocalBoolean_707_)
		    anIntArray5189 = null;
		if (anLocalBoolean_706_)
		    anIntArray5193 = null;
		if (anLocalBoolean)
		    anIntArray5163 = null;
	    }
	    if (aShortArray5174 != null && anIntArray5163 == null
		&& anIntArray5193 == null && anIntArray5189 == null) {
		anIntArray5202 = null;
		aShortArray5174 = null;
	    }
	    if (aByteArray5160 != null
		&& !ModeWhatEnum.method3482(anInt5201, 127, anInt5195)) {
		if (!((anInt5201 & 0x37) != 0
		      ? aClass247_5177 == null || aClass247_5177.method3204(4)
		      : (aClass247_5158 == null
			 || aClass247_5158.method3204(4))))
		    aBoolean5170 = true;
		else {
		    aShortArray5166 = aShortArray5187 = aShortArray5197 = null;
		    aByteArray5160 = null;
		}
	    }
	    if (aShortArray5168 != null
		&& !Class116.method2371(anInt5201, 2, anInt5195)) {
		if (aClass247_5158 == null || aClass247_5158.method3204(4))
		    aShortArray5168 = null;
		else
		    aBoolean5170 = true;
	    }
	    if (aByteArray5184 != null
		&& !tia_sub_35DoublyLinked.method1214(-30823, anInt5195, anInt5201)) {
		if (aClass247_5158 != null && !aClass247_5158.method3204(4))
		    aBoolean5170 = true;
		else
		    aByteArray5184 = null;
	    }
	    if (aFloatArray5161 != null
		&& !Class373.method4074(anInt5201, 1222, anInt5195)) {
		if (aClass247_5191 == null || aClass247_5191.method3204(4))
		    aFloatArray5161 = aFloatArray5175 = null;
		else
		    aBoolean5170 = true;
	    }
	    if (aShortArray5190 != null
		&& !Class62_Sub1.method1349(-1, anInt5201, anInt5195)) {
		if (aClass247_5158 == null || aClass247_5158.method3204(4))
		    aShortArray5190 = null;
		else
		    aBoolean5170 = true;
	    }
	    if (aShortArray5162 != null
		&& !Class224.method3047((byte) 53, anInt5195, anInt5201)) {
		if ((aClass206_5173 != null
		     && !aClass206_5173.method2944((byte) -40))
		    || aClass247_5158 != null && !aClass247_5158.method3204(4))
		    aBoolean5170 = true;
		else
		    aShortArray5162 = aShortArray5149 = aShortArray5196 = null;
	    }
	    if (aShortArray5153 != null) {
		if (aClass247_5199 == null || aClass247_5199.method3204(4))
		    aShortArray5153 = null;
		else
		    aBoolean5170 = true;
	    }
	    if (aShortArray5154 != null) {
		if (aClass247_5158 == null || aClass247_5158.method3204(4))
		    aShortArray5154 = null;
		else
		    aBoolean5170 = true;
	    }
	    if (anIntArrayArray5146 != null
		&& !Class222_Sub2.method3033(anInt5201, true, anInt5195)) {
		anIntArrayArray5146 = null;
		aShortArray5198 = null;
	    }
	    if (anIntArrayArray5176 != null
		&& !Class60.method1338((byte) -124, anInt5195, anInt5201)) {
		aShortArray5183 = null;
		anIntArrayArray5176 = null;
	    }
	    if (anIntArrayArray5179 != null
		&& !Node_Sub31_Sub29.method964(anInt5195, anInt5201, 27677))
		anIntArrayArray5179 = null;
	    if (anIntArray5207 != null && (anInt5195 & 0x800) == 0
		&& (anInt5195 & 0x40000) == 0) {
		anIntArray5167 = null;
		anIntArray5207 = null;
		anIntArray5181 = null;
	    }
	}
    }
    
    final void k(int argument_708_) {
	int anLocalInt = Node_Sub6.SINETABLE[argument_708_];
	int anLocalInt_709_ = Node_Sub6.COSINETABLE[argument_708_];
	for (int anLocalInt_710_ = 0; anLocalInt_710_ < anInt5200;
	     anLocalInt_710_++) {
	    int anLocalInt_711_
		= ((anLocalInt * anIntArray5189[anLocalInt_710_]
		    + anLocalInt_709_ * anIntArray5163[anLocalInt_710_])
		   >> 14);
	    anIntArray5189[anLocalInt_710_]
		= (anIntArray5189[anLocalInt_710_] * anLocalInt_709_
		   - anIntArray5163[anLocalInt_710_] * anLocalInt) >> 14;
	    anIntArray5163[anLocalInt_710_] = anLocalInt_711_;
	}
	for (int anLocalInt_712_ = 0; anInt5186 > anLocalInt_712_;
	     anLocalInt_712_++) {
	    int anLocalInt_713_
		= ((anLocalInt * aShortArray5197[anLocalInt_712_]
		    + anLocalInt_709_ * aShortArray5166[anLocalInt_712_])
		   >> 14);
	    aShortArray5197[anLocalInt_712_]
		= (short) ((-(aShortArray5166[anLocalInt_712_] * anLocalInt)
			    + (anLocalInt_709_
			       * aShortArray5197[anLocalInt_712_]))
			   >> 14);
	    aShortArray5166[anLocalInt_712_] = (short) anLocalInt_713_;
	}
	method2705(true);
	method2708((byte) 40);
	aBoolean5157 = false;
    }
    
    final void method2649(int argument_714_, int argument_715_,
			  int argument_716_, int argument_717_) {
	for (int anLocalInt = 0; anLocalInt < anInt5164; anLocalInt++) {
	    int anLocalInt_718_ = aShortArray5168[anLocalInt] & 0xffff;
	    int anLocalInt_719_ = (anLocalInt_718_ & 0xfd8e) >> 10;
	    int anLocalInt_720_ = (anLocalInt_718_ & 0x384) >> 7;
	    if (argument_715_ != -1)
		anLocalInt_720_
		    = (((argument_715_ - anLocalInt_720_) * argument_717_ >> 7)
		       + anLocalInt_720_);
	    if (argument_714_ != -1)
		anLocalInt_719_
		    = ((-anLocalInt_719_ + argument_714_) * argument_717_
		       >> 7) + anLocalInt_719_;
	    int anLocalInt_721_ = anLocalInt_718_ & 0x7f;
	    if (argument_716_ != -1)
		anLocalInt_721_
		    = (((argument_716_ - anLocalInt_721_) * argument_717_ >> 7)
		       + anLocalInt_721_);
	    aShortArray5168[anLocalInt]
		= (short) (MathStatics.OR
			   (MathStatics.OR(anLocalInt_720_ << 7, anLocalInt_719_ << 10), anLocalInt_721_));
	}
	if (aClass55Array5203 != null) {
	    for (int anLocalInt = 0; anInt5159 > anLocalInt; anLocalInt++) {
		Class55 class55 = aClass55Array5203[anLocalInt];
		Class163 class163 = aClass163Array5156[anLocalInt];
		((Class163) class163).anInt1196
		    = ((HslToRgb.table
			[(aShortArray5168[((Class55) class55).anInt396]
			  & 0xffff)]) & 0xffffff
		       | ((Class163) class163).anInt1196 & ~0xffffff);
	    }
	}
	method2712(-28645);
    }
    
    final Class167 method2651(byte argument_722_, int argument_723_,
			      boolean argument_724_) {
	Class167_Sub2 class167_sub2;
	Class167_Sub2 class167_sub2_725_;
	if (argument_722_ != 1) {
	    if (argument_722_ != 2) {
		if (argument_722_ == 3) {
		    class167_sub2_725_ = (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					  .aClass167_Sub2_4804);
		    class167_sub2 = (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				     .aClass167_Sub2_4806);
		} else if (argument_722_ != 4) {
		    if (argument_722_ != 5)
			class167_sub2_725_ = class167_sub2
			    = new Class167_Sub2(aClass_ha_Sub2_5194, 0, 0,
						true, false);
		    else {
			class167_sub2 = (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					 .aClass167_Sub2_4805);
			class167_sub2_725_
			    = (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
			       .aClass167_Sub2_4811);
		    }
		} else {
		    class167_sub2 = (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				     .aClass167_Sub2_4819);
		    class167_sub2_725_ = (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
					  .aClass167_Sub2_4810);
		}
	    } else {
		class167_sub2_725_ = (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				      .aClass167_Sub2_4814);
		class167_sub2 = (((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194)
				 .aClass167_Sub2_4818);
	    }
	} else {
	    class167_sub2
		= ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aClass167_Sub2_4815;
	    class167_sub2_725_
		= ((GraphicsToolkit_Sub2) aClass_ha_Sub2_5194).aClass167_Sub2_4817;
	}
	return method2713(argument_723_, class167_sub2, argument_722_ != 0,
			  argument_724_, -1, class167_sub2_725_);
    }
    
    private final boolean method2711(int argument_726_) {
	if (((Class206) aClass206_5173).aBoolean1477)
	    return true;
	if (argument_726_ != 0)
	    return true;
	if (((Class206) aClass206_5173).anInterface4_Impl1_1480 == null)
	    ((Class206) aClass206_5173).anInterface4_Impl1_1480
		= aClass_ha_Sub2_5194.method2142(argument_726_ - 1,
						 aBoolean5180);
	Interface4_Impl1 interface4_impl1
	    = ((Class206) aClass206_5173).anInterface4_Impl1_1480;
	interface4_impl1.method45(anInt5169 * 6, (byte) -73);
	Buffer buffer = interface4_impl1.method43(true, 3754);
	if (buffer != null) {
	    Stream stream = aClass_ha_Sub2_5194.method2116(9, buffer);
	    if (Stream.isBigEndian()) {
		for (int anLocalInt = 0; anLocalInt < anInt5169;
		     anLocalInt++) {
		    stream.writeShortBE(aShortArray5162[anLocalInt]);
		    stream.writeShortBE(aShortArray5149[anLocalInt]);
		    stream.writeShortBE(aShortArray5196[anLocalInt]);
		}
	    } else {
		for (int anLocalInt = 0; anLocalInt < anInt5169;
		     anLocalInt++) {
		    stream.writeShortLE(aShortArray5162[anLocalInt]);
		    stream.writeShortLE(aShortArray5149[anLocalInt]);
		    stream.writeShortLE(aShortArray5196[anLocalInt]);
		}
	    }
	    stream.upload();
	    if (interface4_impl1.method41(26937)) {
		aBoolean5170 = true;
		((Class206) aClass206_5173).anInterface4_Impl1_1476
		    = interface4_impl1;
		((Class206) aClass206_5173).aBoolean1477 = true;
		return true;
	    }
	}
	return false;
    }
    
    final int G() {
	if (!aBoolean5157)
	    method2714(104);
	return anInt5182;
    }
    
    final int HA() {
	if (!aBoolean5157)
	    method2714(119);
	return anInt5155;
    }
    
    final boolean method2637(int argument_727_, int argument_728_,
			     Class350 argument_729_, boolean argument_730_,
			     int argument_731_, int argument_732_) {
	return method2709(argument_730_, argument_731_, argument_727_, -15442,
			  argument_732_, argument_729_, argument_728_);
    }
    
    final void v() {
	for (int anLocalInt = 0; anLocalInt < anInt5200; anLocalInt++)
	    anIntArray5189[anLocalInt] = -anIntArray5189[anLocalInt];
	for (int anLocalInt = 0; anLocalInt < anInt5186; anLocalInt++)
	    aShortArray5197[anLocalInt] = (short) -aShortArray5197[anLocalInt];
	for (int anLocalInt = 0; anInt5164 > anLocalInt; anLocalInt++) {
	    short anLocalInt_733_ = aShortArray5162[anLocalInt];
	    aShortArray5162[anLocalInt] = aShortArray5196[anLocalInt];
	    aShortArray5196[anLocalInt] = anLocalInt_733_;
	}
	method2705(true);
	method2708((byte) 40);
	method2703((byte) 62);
	aBoolean5157 = false;
    }
    
    private final void method2712(int argument_734_) {
	if (argument_734_ != -28645)
	    anInt5195 = -5;
	if (aClass247_5158 != null)
	    ((Class247) aClass247_5158).aBoolean1794 = false;
    }
    
    final int na() {
	if (!aBoolean5157)
	    method2714(-127);
	return anInt5148;
    }
    
    private final Class167 method2713
	(int argument_735_, Class167_Sub2 argument_736_, boolean argument_737_,
	 boolean argument_738_, int argument_739_,
	 Class167_Sub2 argument_740_) {
	if ((argument_735_ & 0x100 ^ 0xffffffff) != argument_739_)
	    argument_740_.aBoolean5151 = true;
	else
	    argument_740_.aBoolean5151 = aBoolean5151;
	argument_740_.anInt5201 = anInt5201;
	argument_740_.anInt5192 = anInt5192;
	argument_740_.anInt5169 = anInt5169;
	argument_740_.anInt5186 = anInt5186;
	argument_740_.anInt5200 = anInt5200;
	argument_740_.anInt5164 = anInt5164;
	argument_740_.aBoolean5147 = aBoolean5147;
	argument_740_.anInt5159 = anInt5159;
	argument_740_.anInt5195 = argument_735_;
	argument_740_.aShort5204 = aShort5204;
	argument_740_.aShort5188 = aShort5188;
	boolean anLocalBoolean
	    = Class277.method3403(argument_735_, argument_739_ + 6, anInt5201);
	boolean anLocalBoolean_741_
	    = Class38.method392(argument_735_, anInt5201, 0);
	boolean anLocalBoolean_742_
	    = Class352.method3879(anInt5201, argument_735_, -102);
	boolean anLocalBoolean_743_
	    = anLocalBoolean_742_ | (anLocalBoolean_741_ | anLocalBoolean);
	if (!anLocalBoolean_743_) {
	    argument_740_.anIntArray5163 = anIntArray5163;
	    argument_740_.anIntArray5193 = anIntArray5193;
	    argument_740_.anIntArray5189 = anIntArray5189;
	} else {
	    if (anLocalBoolean) {
		if (argument_736_.anIntArray5163 != null
		    && argument_736_.anIntArray5163.length >= anInt5192)
		    argument_740_.anIntArray5163
			= argument_736_.anIntArray5163;
		else
		    argument_740_.anIntArray5163
			= argument_736_.anIntArray5163 = new int[anInt5192];
	    } else
		argument_740_.anIntArray5163 = anIntArray5163;
	    if (!anLocalBoolean_741_)
		argument_740_.anIntArray5193 = anIntArray5193;
	    else if (argument_736_.anIntArray5193 != null
		     && argument_736_.anIntArray5193.length >= anInt5192)
		argument_740_.anIntArray5193 = argument_736_.anIntArray5193;
	    else
		argument_740_.anIntArray5193 = argument_736_.anIntArray5193
		    = new int[anInt5192];
	    if (anLocalBoolean_742_) {
		if (argument_736_.anIntArray5189 == null
		    || anInt5192 > argument_736_.anIntArray5189.length)
		    argument_740_.anIntArray5189
			= argument_736_.anIntArray5189 = new int[anInt5192];
		else
		    argument_740_.anIntArray5189
			= argument_736_.anIntArray5189;
	    } else
		argument_740_.anIntArray5189 = anIntArray5189;
	    for (int anLocalInt = 0; anInt5192 > anLocalInt; anLocalInt++) {
		if (anLocalBoolean)
		    argument_740_.anIntArray5163[anLocalInt]
			= anIntArray5163[anLocalInt];
		if (anLocalBoolean_741_)
		    argument_740_.anIntArray5193[anLocalInt]
			= anIntArray5193[anLocalInt];
		if (anLocalBoolean_742_)
		    argument_740_.anIntArray5189[anLocalInt]
			= anIntArray5189[anLocalInt];
	    }
	}
	if (Class60.method1336(argument_735_, (byte) -52, anInt5201)) {
	    argument_740_.aClass247_5199 = argument_736_.aClass247_5199;
	    ((Class247) argument_740_.aClass247_5199).anInterface4_Impl2_1797
		= ((Class247) aClass247_5199).anInterface4_Impl2_1797;
	    ((Class247) argument_740_.aClass247_5199).aBoolean1799 = true;
	    ((Class247) argument_740_.aClass247_5199).aBoolean1794
		= ((Class247) aClass247_5199).aBoolean1794;
	} else if (Class224.method3043(anInt5201, argument_735_, -32183))
	    argument_740_.aClass247_5199 = aClass247_5199;
	else
	    argument_740_.aClass247_5199 = null;
	if (Class178.method2798((byte) -50, argument_735_, anInt5201)) {
	    if (argument_736_.aShortArray5168 == null
		|| anInt5164 > argument_736_.aShortArray5168.length)
		argument_740_.aShortArray5168
		    = argument_736_.aShortArray5168 = new short[anInt5164];
	    else
		argument_740_.aShortArray5168 = argument_736_.aShortArray5168;
	    for (int anLocalInt = 0; anInt5164 > anLocalInt; anLocalInt++)
		argument_740_.aShortArray5168[anLocalInt]
		    = aShortArray5168[anLocalInt];
	} else
	    argument_740_.aShortArray5168 = aShortArray5168;
	if (Class46.method435(-1, anInt5201, argument_735_)) {
	    if (argument_736_.aByteArray5184 != null
		&& argument_736_.aByteArray5184.length >= anInt5164)
		argument_740_.aByteArray5184 = argument_736_.aByteArray5184;
	    else
		argument_740_.aByteArray5184 = argument_736_.aByteArray5184
		    = new byte[anInt5164];
	    for (int anLocalInt = 0; anInt5164 > anLocalInt; anLocalInt++)
		argument_740_.aByteArray5184[anLocalInt]
		    = aByteArray5184[anLocalInt];
	} else
	    argument_740_.aByteArray5184 = aByteArray5184;
	if (Class245_Sub2.method3191(argument_735_, anInt5201, (byte) -49)) {
	    argument_740_.aClass247_5158 = argument_736_.aClass247_5158;
	    ((Class247) argument_740_.aClass247_5158).aBoolean1794
		= ((Class247) aClass247_5158).aBoolean1794;
	    ((Class247) argument_740_.aClass247_5158).aBoolean1799 = true;
	    ((Class247) argument_740_.aClass247_5158).anInterface4_Impl2_1797
		= ((Class247) aClass247_5158).anInterface4_Impl2_1797;
	} else if (!Class168.method2729(argument_735_, false, anInt5201))
	    argument_740_.aClass247_5158 = null;
	else
	    argument_740_.aClass247_5158 = aClass247_5158;
	if (DoublyLinkedNode_Sub51_Sub8.method1232((byte) -99, argument_735_, anInt5201)) {
	    if (argument_736_.aShortArray5166 == null
		|| argument_736_.aShortArray5166.length < anInt5186) {
		int anLocalInt = anInt5186;
		argument_740_.aShortArray5166
		    = argument_736_.aShortArray5166 = new short[anLocalInt];
		argument_740_.aShortArray5197
		    = argument_736_.aShortArray5197 = new short[anLocalInt];
		argument_740_.aShortArray5187
		    = argument_736_.aShortArray5187 = new short[anLocalInt];
	    } else {
		argument_740_.aShortArray5187 = argument_736_.aShortArray5187;
		argument_740_.aShortArray5197 = argument_736_.aShortArray5197;
		argument_740_.aShortArray5166 = argument_736_.aShortArray5166;
	    }
	    if (aClass284_5172 != null) {
		if (argument_736_.aClass284_5172 == null)
		    argument_736_.aClass284_5172 = new Class284();
		Class284 class284 = (argument_740_.aClass284_5172
				     = argument_736_.aClass284_5172);
		if (((Class284) class284).aShortArray2278 == null
		    || (anInt5186
			> ((Class284) class284).aShortArray2278.length)) {
		    int anLocalInt = anInt5186;
		    ((Class284) class284).aByteArray2282
			= new byte[anLocalInt];
		    ((Class284) class284).aShortArray2281
			= new short[anLocalInt];
		    ((Class284) class284).aShortArray2278
			= new short[anLocalInt];
		    ((Class284) class284).aShortArray2284
			= new short[anLocalInt];
		}
		for (int anLocalInt = 0; anInt5186 > anLocalInt;
		     anLocalInt++) {
		    argument_740_.aShortArray5166[anLocalInt]
			= aShortArray5166[anLocalInt];
		    argument_740_.aShortArray5187[anLocalInt]
			= aShortArray5187[anLocalInt];
		    argument_740_.aShortArray5197[anLocalInt]
			= aShortArray5197[anLocalInt];
		    ((Class284) class284).aShortArray2278[anLocalInt]
			= (((Class284) aClass284_5172).aShortArray2278
			   [anLocalInt]);
		    ((Class284) class284).aShortArray2281[anLocalInt]
			= (((Class284) aClass284_5172).aShortArray2281
			   [anLocalInt]);
		    ((Class284) class284).aShortArray2284[anLocalInt]
			= (((Class284) aClass284_5172).aShortArray2284
			   [anLocalInt]);
		    ((Class284) class284).aByteArray2282[anLocalInt]
			= (((Class284) aClass284_5172).aByteArray2282
			   [anLocalInt]);
		}
	    } else {
		argument_740_.aClass284_5172 = null;
		for (int anLocalInt = 0; anInt5186 > anLocalInt;
		     anLocalInt++) {
		    argument_740_.aShortArray5166[anLocalInt]
			= aShortArray5166[anLocalInt];
		    argument_740_.aShortArray5187[anLocalInt]
			= aShortArray5187[anLocalInt];
		    argument_740_.aShortArray5197[anLocalInt]
			= aShortArray5197[anLocalInt];
		}
	    }
	    argument_740_.aByteArray5160 = aByteArray5160;
	} else {
	    argument_740_.aShortArray5197 = aShortArray5197;
	    argument_740_.aClass284_5172 = aClass284_5172;
	    argument_740_.aShortArray5187 = aShortArray5187;
	    argument_740_.aShortArray5166 = aShortArray5166;
	    argument_740_.aByteArray5160 = aByteArray5160;
	}
	if (!Class256_Sub3.method3291(anInt5201, (byte) -48, argument_735_)) {
	    if (Applet_Sub1.method103(argument_735_, anInt5201, 13085))
		argument_740_.aClass247_5177 = aClass247_5177;
	    else
		argument_740_.aClass247_5177 = null;
	} else {
	    argument_740_.aClass247_5177 = argument_736_.aClass247_5177;
	    ((Class247) argument_740_.aClass247_5177).anInterface4_Impl2_1797
		= ((Class247) aClass247_5177).anInterface4_Impl2_1797;
	    ((Class247) argument_740_.aClass247_5177).aBoolean1794
		= ((Class247) aClass247_5177).aBoolean1794;
	    ((Class247) argument_740_.aClass247_5177).aBoolean1799 = true;
	}
	if (Node_Sub30.method863(anInt5201, argument_735_, false)) {
	    if (argument_736_.aFloatArray5161 == null
		|| anInt5164 > argument_736_.aFloatArray5161.length) {
		int anLocalInt = anInt5186;
		argument_740_.aFloatArray5161
		    = argument_736_.aFloatArray5161 = new float[anLocalInt];
		argument_740_.aFloatArray5175
		    = argument_736_.aFloatArray5175 = new float[anLocalInt];
	    } else {
		argument_740_.aFloatArray5175 = argument_736_.aFloatArray5175;
		argument_740_.aFloatArray5161 = argument_736_.aFloatArray5161;
	    }
	    for (int anLocalInt = 0; anLocalInt < anInt5186; anLocalInt++) {
		argument_740_.aFloatArray5161[anLocalInt]
		    = aFloatArray5161[anLocalInt];
		argument_740_.aFloatArray5175[anLocalInt]
		    = aFloatArray5175[anLocalInt];
	    }
	} else {
	    argument_740_.aFloatArray5175 = aFloatArray5175;
	    argument_740_.aFloatArray5161 = aFloatArray5161;
	}
	if (!Node_Sub50.method1166(anInt5201, (byte) 0, argument_735_)) {
	    if (!Node_Sub31_Sub34.method982(anInt5201, argument_735_,
                (byte) -12))
		argument_740_.aClass247_5191 = null;
	    else
		argument_740_.aClass247_5191 = aClass247_5191;
	} else {
	    argument_740_.aClass247_5191 = argument_736_.aClass247_5191;
	    ((Class247) argument_740_.aClass247_5191).anInterface4_Impl2_1797
		= ((Class247) aClass247_5191).anInterface4_Impl2_1797;
	    ((Class247) argument_740_.aClass247_5191).aBoolean1794
		= ((Class247) aClass247_5191).aBoolean1794;
	    ((Class247) argument_740_.aClass247_5191).aBoolean1799 = true;
	}
	if (!Class247.method3203(argument_739_ + 17, argument_735_,
				 anInt5201)) {
	    argument_740_.aShortArray5196 = aShortArray5196;
	    argument_740_.aShortArray5149 = aShortArray5149;
	    argument_740_.aShortArray5162 = aShortArray5162;
	} else {
	    if (argument_736_.aShortArray5162 != null
		&& argument_736_.aShortArray5162.length >= anInt5164) {
		argument_740_.aShortArray5149 = argument_736_.aShortArray5149;
		argument_740_.aShortArray5196 = argument_736_.aShortArray5196;
		argument_740_.aShortArray5162 = argument_736_.aShortArray5162;
	    } else {
		int anLocalInt = anInt5164;
		argument_740_.aShortArray5162
		    = argument_736_.aShortArray5162 = new short[anLocalInt];
		argument_740_.aShortArray5196
		    = argument_736_.aShortArray5196 = new short[anLocalInt];
		argument_740_.aShortArray5149
		    = argument_736_.aShortArray5149 = new short[anLocalInt];
	    }
	    for (int anLocalInt = 0; anInt5164 > anLocalInt; anLocalInt++) {
		argument_740_.aShortArray5162[anLocalInt]
		    = aShortArray5162[anLocalInt];
		argument_740_.aShortArray5149[anLocalInt]
		    = aShortArray5149[anLocalInt];
		argument_740_.aShortArray5196[anLocalInt]
		    = aShortArray5196[anLocalInt];
	    }
	}
	if (Statics.method1284(28361, argument_735_, anInt5201)) {
	    argument_740_.aClass206_5173 = argument_736_.aClass206_5173;
	    ((Class206) argument_740_.aClass206_5173).aBoolean1477
		= ((Class206) aClass206_5173).aBoolean1477;
	    ((Class206) argument_740_.aClass206_5173).anInterface4_Impl1_1476
		= ((Class206) aClass206_5173).anInterface4_Impl1_1476;
	    ((Class206) argument_740_.aClass206_5173).aBoolean1478 = true;
	} else if (!Node_Sub15.method697((byte) -55, anInt5201,
            argument_735_))
	    argument_740_.aClass206_5173 = null;
	else
	    argument_740_.aClass206_5173 = aClass206_5173;
	if (!Class62_Sub17.method1424(argument_735_, anInt5201, false))
	    argument_740_.aShortArray5190 = aShortArray5190;
	else {
	    if (argument_736_.aShortArray5190 != null
		&& argument_736_.aShortArray5190.length >= anInt5164)
		argument_740_.aShortArray5190 = argument_736_.aShortArray5190;
	    else {
		int anLocalInt = anInt5164;
		argument_740_.aShortArray5190
		    = argument_736_.aShortArray5190 = new short[anLocalInt];
	    }
	    for (int anLocalInt = 0; anInt5164 > anLocalInt; anLocalInt++)
		argument_740_.aShortArray5190[anLocalInt]
		    = aShortArray5190[anLocalInt];
	}
	if (Class156.method2586((byte) -9, anInt5201, argument_735_)) {
	    if (argument_736_.aClass163Array5156 != null
		&& argument_736_.aClass163Array5156.length >= anInt5159) {
		argument_740_.aClass163Array5156
		    = argument_736_.aClass163Array5156;
		for (int anLocalInt = 0; anLocalInt < anInt5159; anLocalInt++)
		    argument_740_.aClass163Array5156[anLocalInt].method2619
			((byte) 121, aClass163Array5156[anLocalInt]);
	    } else {
		int anLocalInt = anInt5159;
		argument_740_.aClass163Array5156
		    = argument_736_.aClass163Array5156
		    = new Class163[anLocalInt];
		for (int anLocalInt_744_ = 0; anLocalInt_744_ < anInt5159;
		     anLocalInt_744_++)
		    argument_740_.aClass163Array5156[anLocalInt_744_]
			= (aClass163Array5156[anLocalInt_744_].method2621
			   (MathStatics.XOR(argument_739_, -4)));
	    }
	} else
	    argument_740_.aClass163Array5156 = aClass163Array5156;
	argument_740_.anIntArray5202 = anIntArray5202;
	argument_740_.anIntArray5181 = anIntArray5181;
	argument_740_.anIntArrayArray5179 = anIntArrayArray5179;
	argument_740_.anIntArrayArray5146 = anIntArrayArray5146;
	argument_740_.anIntArray5167 = anIntArray5167;
	argument_740_.aShortArray5198 = aShortArray5198;
	if (aBoolean5157) {
	    argument_740_.anInt5205 = anInt5205;
	    argument_740_.anInt5155 = anInt5155;
	    argument_740_.anInt5185 = anInt5185;
	    argument_740_.anInt5150 = anInt5150;
	    argument_740_.anInt5152 = anInt5152;
	    argument_740_.anInt5182 = anInt5182;
	    argument_740_.anInt5148 = anInt5148;
	    argument_740_.anInt5178 = anInt5178;
	    argument_740_.aBoolean5157 = true;
	} else
	    argument_740_.aBoolean5157 = false;
	argument_740_.aClass55Array5203 = aClass55Array5203;
	argument_740_.anIntArray5207 = anIntArray5207;
	argument_740_.aShortArray5154 = aShortArray5154;
	argument_740_.aClass38Array5145 = aClass38Array5145;
	argument_740_.aShortArray5174 = aShortArray5174;
	argument_740_.aClass185Array5206 = aClass185Array5206;
	argument_740_.anIntArrayArray5176 = anIntArrayArray5176;
	argument_740_.aShortArray5183 = aShortArray5183;
	argument_740_.aShortArray5153 = aShortArray5153;
	return argument_740_;
    }
    
    final boolean F() {
	return aBoolean5151;
    }
    
    final Class38[] method2641() {
	return aClass38Array5145;
    }
    
    private final void method2714(int argument_745_) {
	int anLocalInt = 32767;
	int anLocalInt_746_ = 32767;
	int anLocalInt_747_ = 32767;
	int anLocalInt_748_ = -32768;
	int anLocalInt_749_ = -32768;
	int anLocalInt_750_ = -32768;
	int anLocalInt_751_ = 0;
	int anLocalInt_752_ = 0;
	for (int anLocalInt_753_ = 0; anLocalInt_753_ < anInt5200;
	     anLocalInt_753_++) {
	    int anLocalInt_754_ = anIntArray5163[anLocalInt_753_];
	    int anLocalInt_755_ = anIntArray5193[anLocalInt_753_];
	    if (anLocalInt > anLocalInt_754_)
		anLocalInt = anLocalInt_754_;
	    int anLocalInt_756_ = anIntArray5189[anLocalInt_753_];
	    if (anLocalInt_748_ < anLocalInt_754_)
		anLocalInt_748_ = anLocalInt_754_;
	    if (anLocalInt_749_ < anLocalInt_755_)
		anLocalInt_749_ = anLocalInt_755_;
	    if (anLocalInt_755_ < anLocalInt_746_)
		anLocalInt_746_ = anLocalInt_755_;
	    if (anLocalInt_750_ < anLocalInt_756_)
		anLocalInt_750_ = anLocalInt_756_;
	    if (anLocalInt_756_ < anLocalInt_747_)
		anLocalInt_747_ = anLocalInt_756_;
	    int anLocalInt_757_ = (anLocalInt_754_ * anLocalInt_754_
				   + anLocalInt_756_ * anLocalInt_756_);
	    if (anLocalInt_751_ < anLocalInt_757_)
		anLocalInt_751_ = anLocalInt_757_;
	    anLocalInt_757_ = (anLocalInt_754_ * anLocalInt_754_
			       - (-(anLocalInt_756_ * anLocalInt_756_)
				  - anLocalInt_755_ * anLocalInt_755_));
	    if (anLocalInt_752_ < anLocalInt_757_)
		anLocalInt_752_ = anLocalInt_757_;
	}
	anInt5155 = anLocalInt_747_;
	anInt5205 = anLocalInt_746_;
	anInt5178 = anLocalInt_749_;
	anInt5185 = anLocalInt;
	anInt5182 = anLocalInt_750_;
	int anLocalInt_758_ = 99 % ((argument_745_ + 69) / 48);
	anInt5152 = anLocalInt_748_;
	anInt5148 = (int) (Math.sqrt((double) anLocalInt_751_) + 0.99);
	anInt5150 = (int) (Math.sqrt((double) anLocalInt_752_) + 0.99);
	aBoolean5157 = true;
    }
    
    final void aa(short argument_759_, short argument_760_) {
	TextureSource textureSource
	    = ((GraphicsToolkit) aClass_ha_Sub2_5194).textureSource;
	for (int anLocalInt = 0; anLocalInt < anInt5164; anLocalInt++) {
	    if (argument_759_ == aShortArray5190[anLocalInt])
		aShortArray5190[anLocalInt] = argument_760_;
	}
	byte anLocalInt = 0;
	byte anLocalInt_761_ = 0;
	if (argument_759_ != -1) {
	    TextureDescriptor textureDescriptor
		= textureSource.getDescriptor(argument_759_ & 0xffff, true);
	    anLocalInt_761_ = ((TextureDescriptor) textureDescriptor).aByte828;
	    anLocalInt = ((TextureDescriptor) textureDescriptor).aByte840;
	}
	byte anLocalInt_762_ = 0;
	byte anLocalInt_763_ = 0;
	if (argument_760_ != -1) {
	    TextureDescriptor textureDescriptor
		= textureSource.getDescriptor(argument_760_ & 0xffff, true);
	    anLocalInt_763_ = ((TextureDescriptor) textureDescriptor).aByte828;
	    anLocalInt_762_ = ((TextureDescriptor) textureDescriptor).aByte840;
	    if (((TextureDescriptor) textureDescriptor).aByte845 != 0
		|| ((TextureDescriptor) textureDescriptor).aByte849 != 0)
		aBoolean5147 = true;
	}
	if (anLocalInt_763_ != anLocalInt_761_
	    | anLocalInt_762_ != anLocalInt) {
	    if (aClass55Array5203 != null) {
		for (int anLocalInt_764_ = 0; anInt5159 > anLocalInt_764_;
		     anLocalInt_764_++) {
		    Class55 class55 = aClass55Array5203[anLocalInt_764_];
		    Class163 class163 = aClass163Array5156[anLocalInt_764_];
		    ((Class163) class163).anInt1196
			= ((HslToRgb.table
			    [(aShortArray5168[((Class55) class55).anInt396]
			      & 0xffff)]) & 0xffffff
			   | ((Class163) class163).anInt1196 & ~0xffffff);
		}
	    }
	    method2712(-28645);
	}
    }
    
    Class167_Sub2(GraphicsToolkit_Sub2 argument_765_, int argument_766_,
		  int argument_767_, boolean argument_768_,
		  boolean argument_769_) {
	aBoolean5157 = false;
	anInt5164 = 0;
	anInt5186 = 0;
	aBoolean5147 = false;
	aBoolean5180 = false;
	anInt5192 = 0;
	anInt5169 = 0;
	anInt5200 = 0;
	aClass_ha_Sub2_5194 = argument_765_;
	anInt5195 = argument_766_;
	aBoolean5180 = argument_769_;
	anInt5201 = argument_767_;
	if (argument_768_ || Class224.method3043(anInt5201, anInt5195, -32183))
	    aClass247_5199
		= new Class247(Class60.method1336(anInt5195, (byte) -89,
						  anInt5201));
	if (argument_768_
	    || Node_Sub31_Sub34.method982(anInt5201, anInt5195, (byte) -12))
	    aClass247_5191
		= new Class247(Node_Sub50.method1166(anInt5201, (byte) 0,
                anInt5195));
	if (argument_768_ || Class168.method2729(anInt5195, false, anInt5201))
	    aClass247_5158
		= new Class247(Class245_Sub2.method3191(anInt5195, anInt5201,
							(byte) -49));
	if (argument_768_
	    || Applet_Sub1.method103(anInt5195, anInt5201, 13085))
	    aClass247_5177
		= new Class247(Class256_Sub3.method3291(anInt5201, (byte) -100,
							anInt5195));
	if (argument_768_
	    || Node_Sub15.method697((byte) -86, anInt5201, anInt5195))
	    aClass206_5173
		= new Class206(Statics.method1284(28361, anInt5195, anInt5201));
    }
}
