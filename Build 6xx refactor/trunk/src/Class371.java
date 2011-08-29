/* Class371 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class371
{
    int anInt3123 = 0;
    int anInt3124;
    int anInt3125;
    private int anInt3126;
    int anInt3127;
    int anInt3128;
    int anInt3129;
    static Js5Store aJs5Store_3130;
    boolean aBoolean3131;
    int anInt3132;
    int anInt3133;
    private short[] aShortArray3134;
    int anInt3135;
    String[] aStringArray3136;
    int anInt3137;
    int anInt3138;
    int anInt3139;
    int anInt3140;
    int anInt3141;
    int anInt3142 = -1;
    String[] aStringArray3143;
    short[] aShortArray3144;
    private int anInt3145;
    int anInt3146;
    private int anInt3147;
    int anInt3148;
    private int anInt3149;
    short[] aShortArray3150;
    int anInt3151;
    int anInt3152;
    int anInt3153;
    private int anInt3154;
    int[] anIntArray3155;
    private int anInt3156;
    int anInt3157;
    private int anInt3158;
    int anInt3159;
    String aString3160;
    private int anInt3161;
    int anInt3162;
    int[] anIntArray3163;
    int anInt3164;
    int anInt3165;
    int anInt3166;
    private short[] aShortArray3167;
    int[] anIntArray3168;
    private int anInt3169;
    int anInt3170;
    int anInt3171;
    int anInt3172;
    JagexHashMap aJagexHashMap_3173;
    int anInt3174;
    private int anInt3175;
    boolean aBoolean3176;
    int anInt3177;
    private int anInt3178;
    private byte[] aByteArray3179;
    int anInt3180;
    int anInt3181;
    int anInt3182;
    private int anInt3183;
    static Class207 aClass207_3184 = new Class207(87, 7);
    int anInt3185;
    int anInt3186;
    static Class207 aClass207_3187 = new Class207(69, 8);
    Class365 aClass365_3188;
    int anInt3189;
    static int anInt3190 = 0;
    static Class149 aClass149_3191 = new Class149(50);
    
    static final void method4047(int argument) {
	Node_Sub29.aClass368_4130 = null;
	Class62_Sub19.anInt4428 = -1;
    }
    
    final Class101 method4048(Class4 argument_0_, boolean argument_1_,
			      int argument_2_) {
	int anLocalInt;
	int anLocalInt_3_;
	int anLocalInt_4_;
	if (argument_1_) {
	    if (argument_0_ == null
		|| ((Class4) argument_0_).anIntArray63 == null) {
		anLocalInt_4_ = ((Class371) this).anInt3180;
		anLocalInt = ((Class371) this).anInt3174;
		anLocalInt_3_ = ((Class371) this).anInt3164;
	    } else {
		anLocalInt_4_ = ((Class4) argument_0_).anIntArray63[0];
		anLocalInt = ((Class4) argument_0_).anIntArray63[1];
		anLocalInt_3_ = ((Class4) argument_0_).anIntArray63[2];
	    }
	} else if (argument_0_ == null
		   || ((Class4) argument_0_).anIntArray58 == null) {
	    anLocalInt = ((Class371) this).anInt3159;
	    anLocalInt_3_ = ((Class371) this).anInt3124;
	    anLocalInt_4_ = ((Class371) this).anInt3165;
	} else {
	    anLocalInt_4_ = ((Class4) argument_0_).anIntArray58[0];
	    anLocalInt = ((Class4) argument_0_).anIntArray58[1];
	    anLocalInt_3_ = ((Class4) argument_0_).anIntArray58[2];
	}
	if (anLocalInt_4_ == -1)
	    return null;
	Class101 class101
	    = tia_sub_35_Sub1DoublyLinked.method1219(2085750768, (((Class365) ((Class371) this).aClass365_3188).aJs5Store_3074), anLocalInt_4_, 0);
	if (class101 == null)
	    return null;
	if (((Class101) class101).anInt820 < 13)
	    class101.method1733(17496, 2);
	if (anLocalInt != -1) {
	    Class101 class101_5_
		= tia_sub_35_Sub1DoublyLinked.method1219(2085750768, (((Class365) (((Class371) this).aClass365_3188)).aJs5Store_3074), anLocalInt, 0);
	    if (((Class101) class101_5_).anInt820 < 13)
		class101_5_.method1733(17496, 2);
	    if (anLocalInt_3_ != -1) {
		Class101 class101_6_
		    = tia_sub_35_Sub1DoublyLinked.method1219(2085750768, (((Class365) (((Class371) this).aClass365_3188)).aJs5Store_3074), anLocalInt_3_, 0);
		if (((Class101) class101_6_).anInt820 < 13)
		    class101_6_.method1733(17496, 2);
		Class101[] class101s = { class101, class101_5_, class101_6_ };
		class101 = new Class101(class101s, 3);
	    } else {
		Class101[] class101s = { class101, class101_5_ };
		class101 = new Class101(class101s, 2);
	    }
	}
	if (!argument_1_
	    && (anInt3158 != 0 || anInt3149 != 0 || anInt3169 != 0))
	    class101.method1752(anInt3169, anInt3158, anInt3149, -58);
	if (argument_1_
	    && (anInt3145 != 0 || anInt3126 != 0 || anInt3156 != 0))
	    class101.method1752(anInt3156, anInt3145, anInt3126, 98);
	if (aShortArray3167 != null) {
	    short[] anLocalInts;
	    if (argument_0_ != null
		&& ((Class4) argument_0_).aShortArray61 != null)
		anLocalInts = ((Class4) argument_0_).aShortArray61;
	    else
		anLocalInts = ((Class371) this).aShortArray3144;
	    for (int anLocalInt_7_ = 0; aShortArray3167.length > anLocalInt_7_;
		 anLocalInt_7_++)
		class101.method1751(anLocalInts[anLocalInt_7_],
				    aShortArray3167[anLocalInt_7_], false);
	}
	if (aShortArray3134 != null) {
	    short[] anLocalInts;
	    if (argument_0_ != null
		&& ((Class4) argument_0_).aShortArray64 != null)
		anLocalInts = ((Class4) argument_0_).aShortArray64;
	    else
		anLocalInts = ((Class371) this).aShortArray3150;
	    for (int anLocalInt_8_ = 0; anLocalInt_8_ < aShortArray3134.length;
		 anLocalInt_8_++)
		class101.method1739(anLocalInts[anLocalInt_8_],
				    aShortArray3134[anLocalInt_8_], -8378);
	}
	return class101;
    }
    
    static final void method4049(int argument, byte argument_9_,
				 int argument_10_, int argument_11_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(9, 13175, (long) argument);
	class59_sub51_sub3.method1182(-113);
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231 = argument_11_;
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6233 = argument_10_;
    }
    
    private final void method4050(int[] argument_12_, boolean argument_13_,
				  int argument_14_) {
	for (int anLocalInt = 31; anLocalInt > 0; anLocalInt--) {
	    int anLocalInt_15_ = anLocalInt * 36;
	    for (int anLocalInt_16_ = 35; anLocalInt_16_ > 0;
		 anLocalInt_16_--) {
		if (argument_12_[anLocalInt_15_ + anLocalInt_16_] == 0
		    && (argument_12_[anLocalInt_16_ + anLocalInt_15_ - 1 - 36]
			!= 0))
		    argument_12_[anLocalInt_15_ + anLocalInt_16_]
			= argument_14_;
	    }
	}
	if (argument_13_ != true)
	    method4059(null, 74, -17);
    }
    
    final int[] method4051(int argument_17_, boolean argument_18_,
			   int argument_19_, GraphicsToolkit argument_20_,
			   GraphicsToolkit argument_21_, byte argument_22_,
			   int argument_23_, int argument_24_,
			   Class22 argument_25_, AbstractFont argument_26_) {
	Class101 class101
	    = tia_sub_35_Sub1DoublyLinked.method1219(2085750768, (((Class365) ((Class371) this).aClass365_3188).aJs5Store_3074), anInt3183, 0);
	if (class101 == null)
	    return null;
	if (((Class101) class101).anInt820 < 13)
	    class101.method1733(17496, 2);
	if (aShortArray3167 != null) {
	    for (int anLocalInt = 0; aShortArray3167.length > anLocalInt;
		 anLocalInt++) {
		if (aByteArray3179 == null
		    || aByteArray3179.length <= anLocalInt)
		    class101.method1751((((Class371) this).aShortArray3144
					 [anLocalInt]),
					aShortArray3167[anLocalInt], false);
		else
		    class101.method1751((Class70.aShortArray483
					 [aByteArray3179[anLocalInt] & 0xff]),
					aShortArray3167[anLocalInt], false);
	    }
	}
	if (aShortArray3134 != null) {
	    for (int anLocalInt = 0; aShortArray3134.length > anLocalInt;
		 anLocalInt++)
		class101.method1739((((Class371) this).aShortArray3150
				     [anLocalInt]),
				    aShortArray3134[anLocalInt], -8378);
	}
	if (argument_25_ != null) {
	    for (int anLocalInt = 0; anLocalInt < 5; anLocalInt++) {
		for (int anLocalInt_27_ = 0;
		     anLocalInt_27_ < Statics.aShortArrayArrayArray270.length;
		     anLocalInt_27_++) {
		    if ((Statics.aShortArrayArrayArray270[anLocalInt_27_]
			 [anLocalInt]).length
			> ((Class22) argument_25_).anIntArray150[anLocalInt])
			class101.method1751((Statics.aShortArrayArrayArray270
					     [anLocalInt_27_][anLocalInt]
					     [(((Class22) argument_25_)
					       .anIntArray150[anLocalInt])]),
					    (Class42.aShortArrayArray3543
					     [anLocalInt_27_][anLocalInt]),
					    false);
		}
	    }
	}
	int anLocalInt = 2048;
	boolean anLocalBoolean = false;
	if (anInt3175 != 128 || anInt3147 != 128 || anInt3154 != 128) {
	    anLocalBoolean = true;
	    anLocalInt |= 0x7;
	}
	Class167 class167
	    = argument_20_.method2057(class101, anLocalInt, 64, anInt3178 + 64,
				      anInt3161 + 768);
	if (!class167.method2653())
	    return null;
	if (anLocalBoolean)
	    class167.O(anInt3175, anInt3147, anInt3154);
	Class368 class368 = null;
	if (((Class371) this).anInt3138 == -1) {
	    if (((Class371) this).anInt3151 != -1) {
		class368
		    = (((Class371) this).aClass365_3188.method3978
		       (((Class371) this).anInt3177, false, argument_25_,
			argument_24_, argument_23_, argument_26_, argument_21_,
			true, argument_17_, 0, argument_20_, -25958));
		if (class368 == null)
		    return null;
	    } else if (((Class371) this).anInt3157 != -1) {
		class368
		    = (((Class371) this).aClass365_3188.method3978
		       (((Class371) this).anInt3135, false, argument_25_,
			argument_24_, argument_23_, argument_26_, argument_21_,
			true, argument_17_, 0, argument_20_, -25958));
		if (class368 == null)
		    return null;
	    }
	} else {
	    class368 = (((Class371) this).aClass365_3188.method3978
			(((Class371) this).anInt3189, true, argument_25_, 10,
			 0, argument_26_, argument_21_, true, 1, 0,
			 argument_20_, -25958));
	    if (class368 == null)
		return null;
	}
	int anLocalInt_28_;
	if (argument_18_)
	    anLocalInt_28_
		= (int) ((double) ((Class371) this).anInt3166 * 1.5) << 2;
	else if (argument_17_ != 2)
	    anLocalInt_28_ = ((Class371) this).anInt3166 << 2;
	else
	    anLocalInt_28_
		= (int) ((double) ((Class371) this).anInt3166 * 1.04) << 2;
	argument_20_.DA(16, 16, 512, 512);
	Class350 class350 = argument_20_.method2029();
	class350.method3840();
	argument_20_.method2069(class350);
	argument_20_.setAmbientIntensity(1.0F);
	argument_20_.setSun(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
	Class350 class350_29_ = argument_20_.method2015();
	class350_29_.method3839(-((Class371) this).anInt3132 << 3);
	class350_29_.method3834(((Class371) this).anInt3123 << 3);
	class350_29_.method3835
	    (((Class371) this).anInt3146 << 2,
	     ((Node_Sub6.SINETABLE[((Class371) this).anInt3153 << 3]
	       * anLocalInt_28_)
	      >> 14) - class167.fa() / 2 + (((Class371) this).anInt3172 << 2),
	     ((Node_Sub6.COSINETABLE[((Class371) this).anInt3153 << 3]
	       * anLocalInt_28_)
	      >> 14) + (((Class371) this).anInt3172 << 2));
	class350_29_.method3833(((Class371) this).anInt3153 << 3);
	int anLocalInt_30_ = argument_20_.i();
	int anLocalInt_31_ = argument_20_.XA();
	argument_20_.f(50, 2147483647);
	argument_20_.clearDepthBuffer();
	argument_20_.clearClip();
	argument_20_.fillRect(0, 0, 36, 32, 0, 0);
	class167.method2640(class350_29_, null, 1);
	argument_20_.f(anLocalInt_30_, anLocalInt_31_);
	int[] anLocalInts = argument_20_.getPixels(0, 0, 36, 32);
	if (argument_17_ >= 1) {
	    anLocalInts = method4067(anLocalInts, -16777214, (byte) 113);
	    if (argument_17_ >= 2)
		anLocalInts = method4067(anLocalInts, -1, (byte) 113);
	}
	if (argument_23_ != 0)
	    method4050(anLocalInts, true, argument_23_);
	argument_20_.method2047(36, anLocalInts, 0, 32, 36)
	    .method4014(0, 0);
	if (((Class371) this).anInt3138 != -1)
	    class368.method4014(0, 0);
	else if (((Class371) this).anInt3151 != -1)
	    class368.method4014(0, 0);
	else if (((Class371) this).anInt3157 != -1)
	    class368.method4014(0, 0);
	if (argument_19_ == 1
	    || (argument_19_ == 2
		&& (((Class371) this).anInt3152 == 1 || argument_24_ != 1)
		&& argument_24_ != -1))
	    argument_26_.method507((byte) 56, 9, -16777215,
				   method4065((byte) 107, argument_24_), -256,
				   0);
	anLocalInts = argument_20_.getPixels(0, 0, 36, 32);
	for (int anLocalInt_32_ = 0; anLocalInts.length > anLocalInt_32_;
	     anLocalInt_32_++) {
	    if ((anLocalInts[anLocalInt_32_] & 0xffffff) != 0)
		anLocalInts[anLocalInt_32_]
		    = MathStatics.OR(anLocalInts[anLocalInt_32_], -16777216);
	    else
		anLocalInts[anLocalInt_32_] = 0;
	}
	return anLocalInts;
    }
    
    final String method4052(int argument_33_, String argument_34_,
			    byte argument_35_) {
	if (((Class371) this).aJagexHashMap_3173 == null)
	    return argument_34_;
	StringNode class59_sub34
	    = ((StringNode)
	       ((Class371) this).aJagexHashMap_3173.get((long) argument_33_));
	if (class59_sub34 == null)
	    return argument_34_;
	return ((StringNode) class59_sub34).value;
    }
    
    final int method4053(int argument_36_, int argument_37_,
			 int argument_38_) {
	if (((Class371) this).aJagexHashMap_3173 == null)
	    return argument_36_;
	IntegerNode class59_sub54
	    = ((IntegerNode)
	       ((Class371) this).aJagexHashMap_3173.get((long) argument_37_));
	if (class59_sub54 == null)
	    return argument_36_;
	return ((IntegerNode) class59_sub54).value;
    }
    
    final void method4054(Class371 argument_39_, Class371 argument_40_,
			  byte argument_41_) {
	((Class371) this).aShortArray3144
	    = ((Class371) argument_39_).aShortArray3144;
	aShortArray3134 = argument_39_.aShortArray3134;
	((Class371) this).aString3160 = ((Class371) argument_40_).aString3160;
	((Class371) this).anInt3152 = 1;
	((Class371) this).anInt3146 = ((Class371) argument_39_).anInt3146;
	aByteArray3179 = argument_39_.aByteArray3179;
	((Class371) this).anInt3172 = ((Class371) argument_39_).anInt3172;
	((Class371) this).aBoolean3131
	    = ((Class371) argument_40_).aBoolean3131;
	anInt3183 = argument_39_.anInt3183;
	((Class371) this).anInt3153 = ((Class371) argument_39_).anInt3153;
	aShortArray3167 = argument_39_.aShortArray3167;
	((Class371) this).anInt3166 = ((Class371) argument_39_).anInt3166;
	((Class371) this).anInt3123 = ((Class371) argument_39_).anInt3123;
	((Class371) this).anInt3129 = ((Class371) argument_40_).anInt3129;
	((Class371) this).anInt3132 = ((Class371) argument_39_).anInt3132;
	((Class371) this).aShortArray3150
	    = ((Class371) argument_39_).aShortArray3150;
    }
    
    final Class371 method4055(int argument_42_, byte argument_43_) {
	if (((Class371) this).anIntArray3163 != null && argument_42_ > 1) {
	    int anLocalInt = -1;
	    for (int anLocalInt_44_ = 0; anLocalInt_44_ < 10;
		 anLocalInt_44_++) {
		if ((((Class371) this).anIntArray3168[anLocalInt_44_]
		     <= argument_42_)
		    && ((Class371) this).anIntArray3168[anLocalInt_44_] != 0)
		    anLocalInt
			= ((Class371) this).anIntArray3163[anLocalInt_44_];
	    }
	    if (anLocalInt != -1)
		return ((Class371) this).aClass365_3188.method3975(122,
								   anLocalInt);
	}
	return this;
    }
    
    final void method4056(Class371 argument_45_, int argument_46_,
			  Class371 argument_47_) {
	anInt3156 = argument_45_.anInt3156;
	aShortArray3167 = argument_45_.aShortArray3167;
	((Class371) this).anInt3164 = ((Class371) argument_45_).anInt3164;
	((Class371) this).aShortArray3144
	    = ((Class371) argument_45_).aShortArray3144;
	((Class371) this).aShortArray3150
	    = ((Class371) argument_45_).aShortArray3150;
	((Class371) this).anInt3165 = ((Class371) argument_45_).anInt3165;
	anInt3169 = argument_45_.anInt3169;
	((Class371) this).aBoolean3131
	    = ((Class371) argument_45_).aBoolean3131;
	aShortArray3134 = argument_45_.aShortArray3134;
	((Class371) this).anInt3181 = ((Class371) argument_45_).anInt3181;
	((Class371) this).anInt3123 = ((Class371) argument_47_).anInt3123;
	((Class371) this).anInt3146 = ((Class371) argument_47_).anInt3146;
	((Class371) this).anInt3132 = ((Class371) argument_47_).anInt3132;
	if (argument_46_ != -23141)
	    method4060(-6);
	((Class371) this).anInt3128 = ((Class371) argument_45_).anInt3128;
	((Class371) this).aStringArray3136
	    = ((Class371) argument_45_).aStringArray3136;
	((Class371) this).anInt3152 = ((Class371) argument_45_).anInt3152;
	((Class371) this).anInt3124 = ((Class371) argument_45_).anInt3124;
	((Class371) this).anInt3153 = ((Class371) argument_47_).anInt3153;
	((Class371) this).anInt3170 = ((Class371) argument_45_).anInt3170;
	((Class371) this).anInt3142 = ((Class371) argument_45_).anInt3142;
	anInt3126 = argument_45_.anInt3126;
	((Class371) this).anInt3133 = ((Class371) argument_45_).anInt3133;
	((Class371) this).anInt3174 = ((Class371) argument_45_).anInt3174;
	((Class371) this).anInt3166 = ((Class371) argument_47_).anInt3166;
	aByteArray3179 = argument_45_.aByteArray3179;
	((Class371) this).anInt3129 = 0;
	((Class371) this).aString3160 = ((Class371) argument_45_).aString3160;
	((Class371) this).aStringArray3143 = new String[5];
	anInt3149 = argument_45_.anInt3149;
	((Class371) this).anInt3172 = ((Class371) argument_47_).anInt3172;
	anInt3158 = argument_45_.anInt3158;
	((Class371) this).anInt3180 = ((Class371) argument_45_).anInt3180;
	((Class371) this).aJagexHashMap_3173
	    = ((Class371) argument_45_).aJagexHashMap_3173;
	anInt3183 = argument_47_.anInt3183;
	anInt3145 = argument_45_.anInt3145;
	((Class371) this).anInt3159 = ((Class371) argument_45_).anInt3159;
	if (((Class371) argument_45_).aStringArray3143 != null) {
	    for (int anLocalInt = 0; anLocalInt < 4; anLocalInt++)
		((Class371) this).aStringArray3143[anLocalInt]
		    = ((Class371) argument_45_).aStringArray3143[anLocalInt];
	}
	((Class371) this).aStringArray3143[4]
	    = MultilanguageString.DISCARD_DUPLICATE.getLocalizedString(
            (((Class365)
                    (((Class371) this)
                            .aClass365_3188))
                    .anInt3069));
    }
    
    final Class167 method4057
	(int argument_48_, int argument_49_, int argument_50_,
	 Class367 argument_51_, int argument_52_, int argument_53_,
	 GraphicsToolkit argument_54_, Class22 argument_55_, int argument_56_) {
	if (argument_50_ != 5)
	    method4052(12, null, (byte) 0);
	if (((Class371) this).anIntArray3163 != null && argument_56_ > 1) {
	    int anLocalInt = -1;
	    for (int anLocalInt_57_ = 0; anLocalInt_57_ < 10;
		 anLocalInt_57_++) {
		if ((((Class371) this).anIntArray3168[anLocalInt_57_]
		     <= argument_56_)
		    && ((Class371) this).anIntArray3168[anLocalInt_57_] != 0)
		    anLocalInt
			= ((Class371) this).anIntArray3163[anLocalInt_57_];
	    }
	    if (anLocalInt != -1)
		return (((Class371) this).aClass365_3188.method3975
			    (argument_50_ ^ 0x7f, anLocalInt).method4057
			(argument_48_, argument_49_, 5, argument_51_,
			 argument_52_, argument_53_, argument_54_,
			 argument_55_, 1));
	}
	int anLocalInt = argument_48_;
	if (argument_51_ != null)
	    anLocalInt |= argument_51_.method3997(true, argument_49_, 27123,
						  argument_53_);
	Class167 class167;
	synchronized (((Class365) ((Class371) this).aClass365_3188)
		      .aClass149_3076) {
	    class167
		= ((Class167)
		   (((Class365) ((Class371) this).aClass365_3188)
			.aClass149_3076.get((long) (((Class371) this).anInt3140 | ((GraphicsToolkit) argument_54_).anInt939 << 29))));
	}
	if (class167 == null
	    || argument_54_.andPow(class167.ua(), anLocalInt) != 0) {
	    if (class167 != null)
		anLocalInt
		    = argument_54_.or(anLocalInt, class167.ua());
	    int anLocalInt_58_ = anLocalInt;
	    if (aShortArray3134 != null)
		anLocalInt_58_ |= 0x8000;
	    if (aShortArray3167 != null || argument_55_ != null)
		anLocalInt_58_ |= 0x4000;
	    if (anInt3175 != 128)
		anLocalInt_58_ |= 0x1;
	    if (anInt3175 != 128)
		anLocalInt_58_ |= 0x2;
	    if (anInt3175 != 128)
		anLocalInt_58_ |= 0x4;
	    Class101 class101
		= tia_sub_35_Sub1DoublyLinked.method1219(argument_50_ ^ 0x7c5207f5, (((Class365) (((Class371) this).aClass365_3188)).aJs5Store_3074), anInt3183, 0);
	    if (class101 == null)
		return null;
	    if (((Class101) class101).anInt820 < 13)
		class101.method1733(17496, 2);
	    class167
		= argument_54_.method2057(class101, anLocalInt_58_,
					  (((Class365)
					    ((Class371) this).aClass365_3188)
					   .anInt3085),
					  anInt3178 + 64, 850 + anInt3161);
	    if (anInt3175 != 128 || anInt3147 != 128 || anInt3154 != 128)
		class167.O(anInt3175, anInt3147, anInt3154);
	    if (aShortArray3167 != null) {
		for (int anLocalInt_59_ = 0;
		     anLocalInt_59_ < aShortArray3167.length;
		     anLocalInt_59_++) {
		    if (aByteArray3179 == null
			|| aByteArray3179.length <= anLocalInt_59_)
			class167.ia(aShortArray3167[anLocalInt_59_],
				    (((Class371) this).aShortArray3144
				     [anLocalInt_59_]));
		    else
			class167.ia(aShortArray3167[anLocalInt_59_],
				    (Class70.aShortArray483
				     [aByteArray3179[anLocalInt_59_] & 0xff]));
		}
	    }
	    if (aShortArray3134 != null) {
		for (int anLocalInt_60_ = 0;
		     aShortArray3134.length > anLocalInt_60_; anLocalInt_60_++)
		    class167.aa(aShortArray3134[anLocalInt_60_],
				(((Class371) this).aShortArray3150
				 [anLocalInt_60_]));
	    }
	    if (argument_55_ != null) {
		for (int anLocalInt_61_ = 0; anLocalInt_61_ < 5;
		     anLocalInt_61_++) {
		    for (int anLocalInt_62_ = 0;
			 (Statics.aShortArrayArrayArray270.length
			  > anLocalInt_62_);
			 anLocalInt_62_++) {
			if ((Statics.aShortArrayArrayArray270[anLocalInt_62_]
			     [anLocalInt_61_]).length
			    > (((Class22) argument_55_).anIntArray150
			       [anLocalInt_61_]))
			    class167.ia((Class42.aShortArrayArray3543
					 [anLocalInt_62_][anLocalInt_61_]),
					(Statics.aShortArrayArrayArray270
					 [anLocalInt_62_][anLocalInt_61_]
					 [(((Class22) argument_55_)
					   .anIntArray150[anLocalInt_61_])]));
		    }
		}
	    }
	    class167.s(anLocalInt);
	    synchronized (((Class365) ((Class371) this).aClass365_3188)
			  .aClass149_3076) {
		((Class365) ((Class371) this).aClass365_3188)
		    .aClass149_3076.put(class167, (long) (((Class371) this).anInt3140 | ((GraphicsToolkit) argument_54_).anInt939 << 29));
	    }
	}
	if (argument_51_ != null)
	    class167 = argument_51_.method4000(argument_52_, class167, false,
					       argument_49_, anLocalInt,
					       argument_53_);
	class167.s(argument_48_);
	return class167;
    }
    
    final Class101 method4058(boolean argument_63_, boolean argument_64_,
			      Class4 argument_65_) {
	if (argument_63_ != true)
	    return null;
	int anLocalInt;
	int anLocalInt_66_;
	if (argument_64_) {
	    if (argument_65_ == null
		|| ((Class4) argument_65_).anIntArray62 == null) {
		anLocalInt_66_ = ((Class371) this).anInt3170;
		anLocalInt = ((Class371) this).anInt3128;
	    } else {
		anLocalInt = ((Class4) argument_65_).anIntArray62[0];
		anLocalInt_66_ = ((Class4) argument_65_).anIntArray62[1];
	    }
	} else if (argument_65_ == null
		   || ((Class4) argument_65_).anIntArray57 == null) {
	    anLocalInt = ((Class371) this).anInt3133;
	    anLocalInt_66_ = ((Class371) this).anInt3142;
	} else {
	    anLocalInt = ((Class4) argument_65_).anIntArray57[0];
	    anLocalInt_66_ = ((Class4) argument_65_).anIntArray57[1];
	}
	if (anLocalInt == -1)
	    return null;
	Class101 class101
	    = tia_sub_35_Sub1DoublyLinked.method1219(2085750768, (((Class365) ((Class371) this).aClass365_3188).aJs5Store_3074), anLocalInt, 0);
	if (((Class101) class101).anInt820 < 13)
	    class101.method1733(17496, 2);
	if (anLocalInt_66_ != -1) {
	    Class101 class101_67_
		= tia_sub_35_Sub1DoublyLinked.method1219(2085750768, (((Class365) (((Class371) this).aClass365_3188)).aJs5Store_3074), anLocalInt_66_, 0);
	    if (((Class101) class101_67_).anInt820 < 13)
		class101_67_.method1733(17496, 2);
	    Class101[] class101s = { class101, class101_67_ };
	    class101 = new Class101(class101s, 2);
	}
	if (aShortArray3167 != null) {
	    short[] anLocalInts;
	    if (argument_65_ == null
		|| ((Class4) argument_65_).aShortArray61 == null)
		anLocalInts = ((Class371) this).aShortArray3144;
	    else
		anLocalInts = ((Class4) argument_65_).aShortArray61;
	    for (int anLocalInt_68_ = 0;
		 anLocalInt_68_ < aShortArray3167.length; anLocalInt_68_++)
		class101.method1751(anLocalInts[anLocalInt_68_],
				    aShortArray3167[anLocalInt_68_], false);
	}
	if (aShortArray3134 != null) {
	    short[] anLocalInts;
	    if (argument_65_ == null
		|| ((Class4) argument_65_).aShortArray64 == null)
		anLocalInts = ((Class371) this).aShortArray3150;
	    else
		anLocalInts = ((Class4) argument_65_).aShortArray64;
	    for (int anLocalInt_69_ = 0;
		 anLocalInt_69_ < aShortArray3134.length; anLocalInt_69_++)
		class101.method1739(anLocalInts[anLocalInt_69_],
				    aShortArray3134[anLocalInt_69_], -8378);
	}
	return class101;
    }
    
    private final void method4059(Packet argument_70_, int argument_71_,
				  int argument_72_) {
	if (argument_71_ != 1) {
	    if (argument_71_ == 2)
		((Class371) this).aString3160
		    = argument_70_.gstr();
	    else if (argument_71_ != 4) {
		if (argument_71_ == 5)
		    ((Class371) this).anInt3153 = argument_70_.g2();
		else if (argument_71_ == 6)
		    ((Class371) this).anInt3123 = argument_70_.g2();
		else if (argument_71_ == 7) {
		    ((Class371) this).anInt3146 = argument_70_.g2();
		    if (((Class371) this).anInt3146 > 32767)
			((Class371) this).anInt3146 -= 65536;
		} else if (argument_71_ == 8) {
		    ((Class371) this).anInt3172 = argument_70_.g2();
		    if (((Class371) this).anInt3172 > 32767)
			((Class371) this).anInt3172 -= 65536;
		} else if (argument_71_ == 11)
		    ((Class371) this).anInt3152 = 1;
		else if (argument_71_ != 12) {
		    if (argument_71_ != 16) {
			if (argument_71_ != 18) {
			    if (argument_71_ == 23)
				((Class371) this).anInt3165
				    = argument_70_.g2();
			    else if (argument_71_ != 24) {
				if (argument_71_ == 25)
				    ((Class371) this).anInt3180
					= argument_70_.g2();
				else if (argument_71_ != 26) {
				    if (argument_71_ < 30
					|| argument_71_ >= 35) {
					if (argument_71_ < 35
					    || argument_71_ >= 40) {
					    if (argument_71_ != 40) {
						if (argument_71_ == 41) {
						    int anLocalInt
							= (argument_70_
							       .g1
                                           ());
						    ((Class371) this)
							.aShortArray3150
							= (new short
							   [anLocalInt]);
						    aShortArray3134
							= (new short
							   [anLocalInt]);
						    for (int anLocalInt_73_
							     = 0;
							 (anLocalInt
							  > anLocalInt_73_);
							 anLocalInt_73_++) {
							aShortArray3134
							    [anLocalInt_73_]
							    = (short) (argument_70_
									   .g2
                                               ());
							((Class371) this)
							    .aShortArray3150
							    [anLocalInt_73_]
							    = (short) (argument_70_
									   .g2
                                               ());
						    }
						} else if (argument_71_
							   == 42) {
						    int anLocalInt
							= (argument_70_
							       .g1
                                           ());
						    aByteArray3179
							= new byte[anLocalInt];
						    for (int anLocalInt_74_
							     = 0;
							 (anLocalInt
							  > anLocalInt_74_);
							 anLocalInt_74_++)
							aByteArray3179
							    [anLocalInt_74_]
							    = (argument_70_
								   .g1s
                                           ());
						} else if (argument_71_
							   != 65) {
						    if (argument_71_ == 78)
							((Class371) this)
							    .anInt3124
							    = (argument_70_
								   .g2
                                           ());
						    else if (argument_71_
							     == 79)
							((Class371) this)
							    .anInt3164
							    = (argument_70_
								   .g2
                                           ());
						    else if (argument_71_
							     == 90)
							((Class371) this)
							    .anInt3133
							    = (argument_70_
								   .g2
                                           ());
						    else if (argument_71_
							     != 91) {
							if (argument_71_ == 92)
							    ((Class371) this)
								.anInt3142
								= (argument_70_
								       .g2
                                               ());
							else if (argument_71_
								 != 93) {
							    if (argument_71_
								== 95)
								((Class371)
								 this)
								    .anInt3132
								    = (argument_70_
									   .g2
                                               ());
							    else if (argument_71_
								     == 96)
								((Class371)
								 this)
								    .anInt3182
								    = (argument_70_
									   .g1
                                               ());
							    else if (argument_71_
								     == 97)
								((Class371)
								 this)
								    .anInt3189
								    = (argument_70_
									   .g2
                                               ());
							    else if (argument_71_
								     == 98)
								((Class371)
								 this)
								    .anInt3138
								    = (argument_70_
									   .g2
                                               ());
							    else if ((argument_71_
								      >= 100)
								     && (argument_71_
									 < 110)) {
								if ((((Class371)
								      this)
								     .anIntArray3163)
								    == null) {
								    ((Class371)
								     this)
									.anIntArray3168
									= (new int
									   [10]);
								    ((Class371)
								     this)
									.anIntArray3163
									= (new int
									   [10]);
								}
								((Class371)
								 this)
								    .anIntArray3163
								    [(argument_71_
								      - 100)]
								    = (argument_70_
									   .g2
                                               ());
								((Class371)
								 this)
								    .anIntArray3168
								    [(argument_71_
								      - 100)]
								    = (argument_70_
									   .g2
                                               ());
							    } else if (argument_71_
								       != 110) {
								if (argument_71_
								    != 111) {
								    if (argument_71_
									== 112)
									anInt3154
									    = argument_70_.g2();
								    else if (argument_71_
									     == 113)
									anInt3178
									    = argument_70_.g1s();
								    else if (argument_71_
									     == 114)
									anInt3161
									    = argument_70_.g1s() * 5;
								    else if (argument_71_
									     != 115) {
									if (argument_71_
									    != 121) {
									    if (argument_71_ != 122) {
										if (argument_71_ == 125) {
										    anInt3158 = argument_70_.g1s() << 2;
										    anInt3149 = argument_70_.g1s() << 2;
										    anInt3169 = argument_70_.g1s() << 2;
										} else if (argument_71_ == 126) {
										    anInt3145 = argument_70_.g1s() << 2;
										    anInt3126 = argument_70_.g1s() << 2;
										    anInt3156 = argument_70_.g1s() << 2;
										} else if (argument_71_ != 127) {
										    if (argument_71_ == 128) {
											((Class371) this).anInt3186 = argument_70_.g1();
											((Class371) this).anInt3185 = argument_70_.g2();
										    } else if (argument_71_ != 129) {
											if (argument_71_ == 130) {
											    ((Class371) this).anInt3139 = argument_70_.g1();
											    ((Class371) this).anInt3171 = argument_70_.g2();
											} else if (argument_71_ != 132) {
											    if (argument_71_ == 134)
												((Class371) this).anInt3125 = argument_70_.g1();
											    else if (argument_71_ != 139) {
												if (argument_71_ != 140) {
												    if (argument_71_ == 249) {
													int anLocalInt = argument_70_.g1();
													if (((Class371) this).aJagexHashMap_3173 == null) {
													    int anLocalInt_75_ = MathStatics.method2589(anLocalInt);
													    ((Class371) this).aJagexHashMap_3173 = new JagexHashMap(anLocalInt_75_);
													}
													for (int anLocalInt_76_ = 0; anLocalInt > anLocalInt_76_; anLocalInt_76_++) {
													    boolean anLocalBoolean = argument_70_.g1() == 1;
													    int anLocalInt_77_ = argument_70_.g3_dupl();
													    Node node;
													    if (!anLocalBoolean)
														node = new IntegerNode(argument_70_.g4());
													    else
														node = new StringNode(argument_70_.gstr());
													    ((Class371) this).aJagexHashMap_3173.put((long) anLocalInt_77_, node);
													}
												    }
												} else
												    ((Class371) this).anInt3157 = argument_70_.g2();
											    } else
												((Class371) this).anInt3135 = argument_70_.g2();
											} else {
											    int anLocalInt = argument_70_.g1();
											    ((Class371) this).anIntArray3155 = new int[anLocalInt];
											    for (int anLocalInt_78_ = 0; anLocalInt > anLocalInt_78_; anLocalInt_78_++)
												((Class371) this).anIntArray3155[anLocalInt_78_] = argument_70_.g2();
											}
										    } else {
											((Class371) this).anInt3141 = argument_70_.g1();
											((Class371) this).anInt3148 = argument_70_.g2();
										    }
										} else {
										    ((Class371) this).anInt3127 = argument_70_.g1();
										    ((Class371) this).anInt3137 = argument_70_.g2();
										}
									    } else
										((Class371) this).anInt3151 = argument_70_.g2();
									} else
									    ((Class371)
									     this).anInt3177
										= argument_70_.g2();
								    } else
									((Class371)
									 this)
									    .anInt3181
									    = argument_70_.g1();
								} else
								    anInt3147
									= (argument_70_.g2
                                            ());
							    } else
								anInt3175
								    = (argument_70_
									   .g2
                                               ());
							} else
							    ((Class371) this)
								.anInt3170
								= (argument_70_
								       .g2
                                               ());
						    } else
							((Class371) this)
							    .anInt3128
							    = (argument_70_
								   .g2
                                           ());
						} else
						    ((Class371) this)
							.aBoolean3176
							= true;
					    } else {
						int anLocalInt
						    = (argument_70_.g1
                                ());
						aShortArray3167
						    = new short[anLocalInt];
						((Class371) this)
						    .aShortArray3144
						    = new short[anLocalInt];
						for (int anLocalInt_79_ = 0;
						     (anLocalInt_79_
						      < anLocalInt);
						     anLocalInt_79_++) {
						    aShortArray3167
							[anLocalInt_79_]
							= (short) (argument_70_
								       .g2
                                               ());
						    ((Class371) this)
							.aShortArray3144
							[anLocalInt_79_]
							= (short) (argument_70_
								       .g2
                                               ());
						}
					    }
					} else
					    ((Class371) this)
						.aStringArray3143
						[argument_71_ - 35]
						= argument_70_
						      .gstr();
				    } else
					((Class371) this).aStringArray3136
					    [argument_71_ - 30]
					    = argument_70_
						  .gstr();
				} else
				    ((Class371) this).anInt3174
					= argument_70_.g2();
			    } else
				((Class371) this).anInt3159
				    = argument_70_.g2();
			} else
			    ((Class371) this).anInt3162
				= argument_70_.g2();
		    } else
			((Class371) this).aBoolean3131 = true;
		} else
		    ((Class371) this).anInt3129 = argument_70_.g4();
	    } else
		((Class371) this).anInt3166 = argument_70_.g2();
	} else
	    anInt3183 = argument_70_.g2();
	int anLocalInt = 59 / ((argument_72_ + 37) / 38);
    }
    
    public static void method4060(int argument) {
	aClass149_3191 = null;
	aClass207_3187 = null;
	aClass207_3184 = null;
	aJs5Store_3130 = null;
    }
    
    final void method4061(int argument_80_, Class371 argument_81_,
			  Class371 argument_82_) {
	anInt3145 = argument_81_.anInt3145;
	aByteArray3179 = argument_81_.aByteArray3179;
	anInt3126 = argument_81_.anInt3126;
	((Class371) this).aBoolean3131
	    = ((Class371) argument_81_).aBoolean3131;
	((Class371) this).anInt3166 = ((Class371) argument_82_).anInt3166;
	((Class371) this).anInt3153 = ((Class371) argument_82_).anInt3153;
	((Class371) this).anInt3132 = ((Class371) argument_82_).anInt3132;
	((Class371) this).aString3160 = ((Class371) argument_81_).aString3160;
	anInt3156 = argument_81_.anInt3156;
	((Class371) this).anInt3128 = ((Class371) argument_81_).anInt3128;
	((Class371) this).anInt3142 = ((Class371) argument_81_).anInt3142;
	((Class371) this).anInt3170 = ((Class371) argument_81_).anInt3170;
	anInt3149 = argument_81_.anInt3149;
	((Class371) this).aShortArray3144
	    = ((Class371) argument_81_).aShortArray3144;
	((Class371) this).anInt3159 = ((Class371) argument_81_).anInt3159;
	((Class371) this).anInt3180 = ((Class371) argument_81_).anInt3180;
	((Class371) this).anInt3181 = ((Class371) argument_81_).anInt3181;
	((Class371) this).anInt3123 = ((Class371) argument_82_).anInt3123;
	((Class371) this).anInt3174 = ((Class371) argument_81_).anInt3174;
	anInt3158 = argument_81_.anInt3158;
	((Class371) this).anInt3146 = ((Class371) argument_82_).anInt3146;
	((Class371) this).aShortArray3150
	    = ((Class371) argument_81_).aShortArray3150;
	((Class371) this).aStringArray3136
	    = ((Class371) argument_81_).aStringArray3136;
	((Class371) this).aJagexHashMap_3173
	    = ((Class371) argument_81_).aJagexHashMap_3173;
	aShortArray3167 = argument_81_.aShortArray3167;
	((Class371) this).anInt3164 = ((Class371) argument_81_).anInt3164;
	anInt3169 = argument_81_.anInt3169;
	((Class371) this).anInt3129 = argument_80_;
	((Class371) this).aStringArray3143 = new String[5];
	aShortArray3134 = argument_81_.aShortArray3134;
	anInt3183 = argument_82_.anInt3183;
	((Class371) this).anInt3133 = ((Class371) argument_81_).anInt3133;
	((Class371) this).anInt3165 = ((Class371) argument_81_).anInt3165;
	((Class371) this).anInt3172 = ((Class371) argument_82_).anInt3172;
	((Class371) this).anInt3124 = ((Class371) argument_81_).anInt3124;
	if (((Class371) argument_81_).aStringArray3143 != null) {
	    for (int anLocalInt = 0; anLocalInt < 4; anLocalInt++)
		((Class371) this).aStringArray3143[anLocalInt]
		    = ((Class371) argument_81_).aStringArray3143[anLocalInt];
	}
	((Class371) this).aStringArray3143[4]
	    = MultilanguageString.DISCARD.getLocalizedString(
            (((Class365)
                    (((Class371) this)
                            .aClass365_3188))
                    .anInt3069));
    }
    
    final boolean method4062(boolean argument_83_, int argument_84_,
			     Class4 argument_85_) {
	int anLocalInt;
	int anLocalInt_86_;
	int anLocalInt_87_;
	if (argument_83_) {
	    if (argument_85_ == null
		|| ((Class4) argument_85_).anIntArray63 == null) {
		anLocalInt = ((Class371) this).anInt3164;
		anLocalInt_87_ = ((Class371) this).anInt3174;
		anLocalInt_86_ = ((Class371) this).anInt3180;
	    } else {
		anLocalInt_86_ = ((Class4) argument_85_).anIntArray63[0];
		anLocalInt_87_ = ((Class4) argument_85_).anIntArray63[1];
		anLocalInt = ((Class4) argument_85_).anIntArray63[2];
	    }
	} else if (argument_85_ == null
		   || ((Class4) argument_85_).anIntArray58 == null) {
	    anLocalInt = ((Class371) this).anInt3124;
	    anLocalInt_86_ = ((Class371) this).anInt3165;
	    anLocalInt_87_ = ((Class371) this).anInt3159;
	} else {
	    anLocalInt_86_ = ((Class4) argument_85_).anIntArray58[0];
	    anLocalInt_87_ = ((Class4) argument_85_).anIntArray58[1];
	    anLocalInt = ((Class4) argument_85_).anIntArray58[2];
	}
	if (argument_84_ == anLocalInt_86_)
	    return true;
	boolean anLocalBoolean = true;
	if (!((Class365) ((Class371) this).aClass365_3188).aJs5Store_3074
		 .isLoaded(anLocalInt_86_, 0))
	    anLocalBoolean = false;
	if (anLocalInt_87_ != -1
	    && !((Class365) ((Class371) this).aClass365_3188).aJs5Store_3074
		    .isLoaded(anLocalInt_87_, 0))
	    anLocalBoolean = false;
	if (anLocalInt != -1
	    && !((Class365) ((Class371) this).aClass365_3188).aJs5Store_3074
		    .isLoaded(anLocalInt, 0))
	    anLocalBoolean = false;
	return anLocalBoolean;
    }
    
    final void method4063(int argument_88_, Packet argument_89_) {
	for (;;) {
	    int anLocalInt = argument_89_.g1();
	    if (anLocalInt == 0)
		break;
	    method4059(argument_89_, anLocalInt, -117);
	}
	int anLocalInt = 34 % ((argument_88_ + 1) / 34);
    }
    
    final boolean method4064(boolean argument_90_, Class4 argument_91_,
			     byte argument_92_) {
	int anLocalInt;
	int anLocalInt_93_;
	if (!argument_90_) {
	    if (argument_91_ != null
		&& ((Class4) argument_91_).anIntArray57 != null) {
		anLocalInt_93_ = ((Class4) argument_91_).anIntArray57[1];
		anLocalInt = ((Class4) argument_91_).anIntArray57[0];
	    } else {
		anLocalInt_93_ = ((Class371) this).anInt3142;
		anLocalInt = ((Class371) this).anInt3133;
	    }
	} else if (argument_91_ == null
		   || ((Class4) argument_91_).anIntArray62 == null) {
	    anLocalInt = ((Class371) this).anInt3128;
	    anLocalInt_93_ = ((Class371) this).anInt3170;
	} else {
	    anLocalInt = ((Class4) argument_91_).anIntArray62[0];
	    anLocalInt_93_ = ((Class4) argument_91_).anIntArray62[1];
	}
	if (anLocalInt == -1)
	    return true;
	boolean anLocalBoolean = true;
	if (!((Class365) ((Class371) this).aClass365_3188).aJs5Store_3074
		 .isLoaded(anLocalInt, 0))
	    anLocalBoolean = false;
	if (anLocalInt_93_ != -1
	    && !((Class365) ((Class371) this).aClass365_3188).aJs5Store_3074
		    .isLoaded(anLocalInt_93_, 0))
	    anLocalBoolean = false;
	if (argument_92_ != 118)
	    ((Class371) this).anInt3135 = -85;
	return anLocalBoolean;
    }
    
    private final String method4065(byte argument_94_, int argument_95_) {
	if (argument_95_ < 100000)
	    return "<col=ffff00>" + argument_95_ + "</col>";
	if (argument_95_ < 10000000)
	    return ("<col=ffffff>" + argument_95_ / 1000
		    + MultilanguageString.KILO_SUFFIX_DUPLICATE.getLocalizedString(
                (((Class365)
                        (((Class371) this)
                                .aClass365_3188))
                        .anInt3069))
		    + "</col>");
	if (argument_94_ < 101)
	    method4060(1);
	return ("<col=00ff80>" + argument_95_ / 1000000
		+ MultilanguageString.MILLION_SUFFIX_DUPLICATE.getLocalizedString((((Class365)
            (((Class371) this)
                    .aClass365_3188))
            .anInt3069))
		+ "</col>");
    }
    
    final void method4066(int argument_96_) {
	/* empty */
    }
    
    private final int[] method4067(int[] argument_97_, int argument_98_,
				   byte argument_99_) {
	int[] anLocalInts = new int[1152];
	int anLocalInt = 0;
	if (argument_99_ <= 93)
	    method4064(false, null, (byte) -113);
	for (int anLocalInt_100_ = 0; anLocalInt_100_ < 32;
	     anLocalInt_100_++) {
	    for (int anLocalInt_101_ = 0; anLocalInt_101_ < 36;
		 anLocalInt_101_++) {
		int anLocalInt_102_ = argument_97_[anLocalInt];
		if (anLocalInt_102_ == 0) {
		    if (anLocalInt_101_ > 0
			&& argument_97_[anLocalInt - 1] != 0)
			anLocalInt_102_ = argument_98_;
		    else if (anLocalInt_100_ <= 0
			     || argument_97_[anLocalInt - 36] == 0) {
			if (anLocalInt_101_ >= 35
			    || argument_97_[anLocalInt + 1] == 0) {
			    if (anLocalInt_100_ < 31
				&& argument_97_[anLocalInt + 36] != 0)
				anLocalInt_102_ = argument_98_;
			} else
			    anLocalInt_102_ = argument_98_;
		    } else
			anLocalInt_102_ = argument_98_;
		}
		anLocalInts[anLocalInt++] = anLocalInt_102_;
	    }
	}
	return anLocalInts;
    }
    
    public Class371() {
	((Class371) this).anInt3132 = 0;
	anInt3126 = 0;
	((Class371) this).anInt3127 = -1;
	((Class371) this).anInt3125 = 0;
	((Class371) this).anInt3151 = -1;
	((Class371) this).aBoolean3131 = false;
	anInt3147 = 128;
	((Class371) this).anInt3138 = -1;
	anInt3156 = 0;
	anInt3158 = 0;
	((Class371) this).anInt3146 = 0;
	((Class371) this).anInt3128 = -1;
	anInt3161 = 0;
	anInt3154 = 128;
	((Class371) this).anInt3133 = -1;
	((Class371) this).anInt3162 = -1;
	((Class371) this).anInt3157 = -1;
	((Class371) this).anInt3159 = -1;
	((Class371) this).anInt3137 = -1;
	((Class371) this).anInt3129 = 1;
	((Class371) this).anInt3152 = 0;
	((Class371) this).anInt3141 = -1;
	((Class371) this).aString3160 = "null";
	((Class371) this).anInt3172 = 0;
	((Class371) this).anInt3164 = -1;
	anInt3169 = 0;
	((Class371) this).anInt3181 = 0;
	((Class371) this).anInt3174 = -1;
	anInt3145 = 0;
	((Class371) this).anInt3135 = -1;
	((Class371) this).anInt3171 = -1;
	((Class371) this).anInt3124 = -1;
	((Class371) this).anInt3148 = -1;
	((Class371) this).aBoolean3176 = false;
	anInt3149 = 0;
	((Class371) this).anInt3177 = -1;
	((Class371) this).anInt3170 = -1;
	anInt3178 = 0;
	((Class371) this).anInt3182 = 0;
	((Class371) this).anInt3153 = 0;
	((Class371) this).anInt3139 = -1;
	anInt3175 = 128;
	((Class371) this).anInt3186 = -1;
	((Class371) this).anInt3189 = -1;
	((Class371) this).anInt3180 = -1;
	((Class371) this).anInt3166 = 2000;
	((Class371) this).anInt3185 = -1;
	((Class371) this).anInt3165 = -1;
    }
}
