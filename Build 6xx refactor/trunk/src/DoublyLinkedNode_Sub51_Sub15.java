/* Class59_Sub51_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNode_Sub51_Sub15 extends DoublyLinkedNode
{
    private Node_Sub31 aClass59_Sub31_6307;
    private Node_Sub31 aClass59_Sub31_6308;
    private int[] anIntArray6310;
    private Node_Sub31 aClass59_Sub31_6311;
    private int[] anIntArray6312;
    static Class166 aClass166_6313 = new Class166(108, -1);
    static Class207 aClass207_6315 = new Class207(33, 3);
    private Node_Sub31[] aClass59_Sub31Array6316;
    static Class166 aClass166_6317 = new Class166(32, -1);
    static GameServer aGameServer_6318;
    static boolean[][] aBooleanArrayArray6319;
    static int anInt6320;
    
    public static void method1270(byte argument) {
	aBooleanArrayArray6319 = null;
	aGameServer_6318 = null;
	ByteArrayManager.byteArrayPoolSize30000 = null;
	aClass166_6313 = null;
	aClass166_6317 = null;
	aClass207_6315 = null;
	Class211.aClass211_6309 = null;
    }
    
    final boolean method1271(TextureSource argument_0_, Js5Store argument_1_,
			     byte argument_2_) {
	if (Node_Sub23.anInt4056 >= 0) {
	    for (int anLocalInt = 0; anIntArray6312.length > anLocalInt;
		 anLocalInt++) {
		if (!argument_1_.isLoaded(Node_Sub23.anInt4056, anIntArray6312[anLocalInt]))
		    return false;
	    }
	} else {
	    for (int anLocalInt = 0; anIntArray6312.length > anLocalInt;
		 anLocalInt++) {
		if (!argument_1_.isFlatFile(anIntArray6312[anLocalInt]))
		    return false;
	    }
	}
	for (int anLocalInt = 0; anLocalInt < anIntArray6310.length;
	     anLocalInt++) {
	    if (!argument_0_.method9(true, anIntArray6310[anLocalInt]))
		return false;
	}
	return true;
    }
    
    final float[] method1272(boolean argument_3_, boolean argument_4_,
			     int argument_5_, Js5Store argument_6_,
			     TextureSource argument_7_, int argument_8_) {
	Class366.aJs5Store_3087 = argument_6_;
	Class62_Sub24.anTextureSource_4439 = argument_7_;
	for (int anLocalInt = 0; anLocalInt < aClass59_Sub31Array6316.length;
	     anLocalInt++)
	    aClass59_Sub31Array6316[anLocalInt].method866(argument_8_,
							  argument_5_, -8740);
	Class122.method2391(argument_8_, argument_5_, -68);
	float[] fs = new float[argument_5_ * argument_8_ * 4];
	int anLocalInt = 0;
	for (int anLocalInt_9_ = 0; argument_5_ > anLocalInt_9_;
	     anLocalInt_9_++) {
	    int[] anLocalInts;
	    int[] anLocalInts_10_;
	    int[] anLocalInts_11_;
	    if (!((Node_Sub31) aClass59_Sub31_6308).aBoolean4138) {
		int[][] anLocalInts_12_
		    = aClass59_Sub31_6308.method870(anLocalInt_9_, (byte) -9);
		anLocalInts_11_ = anLocalInts_12_[1];
		anLocalInts = anLocalInts_12_[0];
		anLocalInts_10_ = anLocalInts_12_[2];
	    } else {
		int[] anLocalInts_13_
		    = aClass59_Sub31_6308.method867((byte) 125, anLocalInt_9_);
		anLocalInts = anLocalInts_13_;
		anLocalInts_10_ = anLocalInts_13_;
		anLocalInts_11_ = anLocalInts_13_;
	    }
	    int[] anLocalInts_14_;
	    if (!((Node_Sub31) aClass59_Sub31_6307).aBoolean4138)
		anLocalInts_14_ = (aClass59_Sub31_6307.method870
				   (anLocalInt_9_, (byte) -9)[0]);
	    else
		anLocalInts_14_
		    = aClass59_Sub31_6307.method867((byte) 30, anLocalInt_9_);
	    int[] anLocalInts_15_;
	    if (((Node_Sub31) aClass59_Sub31_6311).aBoolean4138)
		anLocalInts_15_
		    = aClass59_Sub31_6311.method867((byte) 80, anLocalInt_9_);
	    else
		anLocalInts_15_ = (aClass59_Sub31_6311.method870
				   (anLocalInt_9_, (byte) -9)[0]);
	    if (argument_3_)
		anLocalInt = anLocalInt_9_ << 2;
	    for (int anLocalInt_16_ = argument_8_ - 1; anLocalInt_16_ >= 0;
		 anLocalInt_16_--) {
		float f = (float) anLocalInts_14_[anLocalInt_16_] / 4096.0F;
		float f_17_ = ((((float) anLocalInts_15_[anLocalInt_16_]
				 * 31.0F / 4096.0F)
				+ 1.0F)
			       / 4096.0F);
		if (!(f < 0.0F)) {
		    if (f > 1.0F)
			f = 1.0F;
		} else
		    f = 0.0F;
		fs[anLocalInt++] = f_17_ * (float) anLocalInts[anLocalInt_16_];
		fs[anLocalInt++]
		    = (float) anLocalInts_11_[anLocalInt_16_] * f_17_;
		fs[anLocalInt++]
		    = (float) anLocalInts_10_[anLocalInt_16_] * f_17_;
		fs[anLocalInt++] = f;
		if (argument_3_)
		    anLocalInt += (argument_8_ << 2) - 4;
	    }
	}
	for (int anLocalInt_18_ = 0;
	     anLocalInt_18_ < aClass59_Sub31Array6316.length; anLocalInt_18_++)
	    aClass59_Sub31Array6316[anLocalInt_18_].method873(-31278);
	return fs;
    }
    
    final int[] method1273(Js5Store argument_19_, int argument_20_,
			   boolean argument_21_, double argument_22_,
			   TextureSource argument_23_, boolean argument_24_,
			   int argument_25_, boolean argument_26_) {
	Class62_Sub24.anTextureSource_4439 = argument_23_;
	Class366.aJs5Store_3087 = argument_19_;
	for (int anLocalInt = 0; anLocalInt < aClass59_Sub31Array6316.length;
	     anLocalInt++)
	    aClass59_Sub31Array6316[anLocalInt].method866(argument_20_,
							  argument_25_, -8740);
	Class389.method4133(90, argument_22_);
	Class122.method2391(argument_20_, argument_25_, -47);
	int[] anLocalInts = new int[argument_25_ * argument_20_];
	int anLocalInt;
	int anLocalInt_27_;
	int anLocalInt_28_;
	if (argument_21_) {
	    anLocalInt_28_ = -1;
	    anLocalInt_27_ = argument_20_ - 1;
	    anLocalInt = -1;
	} else {
	    anLocalInt = argument_20_;
	    anLocalInt_27_ = 0;
	    anLocalInt_28_ = 1;
	}
	int anLocalInt_29_ = 0;
	for (int anLocalInt_30_ = 0; argument_25_ > anLocalInt_30_;
	     anLocalInt_30_++) {
	    int[] anLocalInts_31_;
	    int[] anLocalInts_32_;
	    int[] anLocalInts_33_;
	    if (!((Node_Sub31) aClass59_Sub31_6308).aBoolean4138) {
		int[][] anLocalInts_34_
		    = aClass59_Sub31_6308.method870(anLocalInt_30_, (byte) -9);
		anLocalInts_32_ = anLocalInts_34_[2];
		anLocalInts_33_ = anLocalInts_34_[0];
		anLocalInts_31_ = anLocalInts_34_[1];
	    } else {
		int[] anLocalInts_35_
		    = aClass59_Sub31_6308.method867((byte) 60, anLocalInt_30_);
		anLocalInts_31_ = anLocalInts_35_;
		anLocalInts_32_ = anLocalInts_35_;
		anLocalInts_33_ = anLocalInts_35_;
	    }
	    if (argument_24_)
		anLocalInt_29_ = anLocalInt_30_;
	    for (int anLocalInt_36_ = anLocalInt_27_;
		 anLocalInt_36_ != anLocalInt;
		 anLocalInt_36_ += anLocalInt_28_) {
		int anLocalInt_37_ = anLocalInts_33_[anLocalInt_36_] >> 4;
		if (anLocalInt_37_ > 255)
		    anLocalInt_37_ = 255;
		if (anLocalInt_37_ < 0)
		    anLocalInt_37_ = 0;
		int anLocalInt_38_ = anLocalInts_31_[anLocalInt_36_] >> 4;
		if (anLocalInt_38_ > 255)
		    anLocalInt_38_ = 255;
		if (anLocalInt_38_ < 0)
		    anLocalInt_38_ = 0;
		int anLocalInt_39_ = anLocalInts_32_[anLocalInt_36_] >> 4;
		if (anLocalInt_39_ > 255)
		    anLocalInt_39_ = 255;
		anLocalInt_37_ = Statics.anIntArray5209[anLocalInt_37_];
		if (anLocalInt_39_ < 0)
		    anLocalInt_39_ = 0;
		anLocalInt_38_ = Statics.anIntArray5209[anLocalInt_38_];
		anLocalInt_39_ = Statics.anIntArray5209[anLocalInt_39_];
		int anLocalInt_40_
		    = ((anLocalInt_37_ << 16) + (anLocalInt_38_ << 8)
		       + anLocalInt_39_);
		if (anLocalInt_40_ != 0)
		    anLocalInt_40_ |= ~0xffffff;
		anLocalInts[anLocalInt_29_++] = anLocalInt_40_;
		if (argument_24_)
		    anLocalInt_29_ += argument_20_ - 1;
	    }
	}
	for (int anLocalInt_41_ = 0;
	     anLocalInt_41_ < aClass59_Sub31Array6316.length; anLocalInt_41_++)
	    aClass59_Sub31Array6316[anLocalInt_41_].method873(-31278);
	return anLocalInts;
    }
    
    final int[] method1274(int argument_42_, double argument_43_,
			   boolean argument_44_, Js5Store argument_45_,
			   TextureSource argument_46_, int argument_47_,
			   int argument_48_) {
	Class62_Sub24.anTextureSource_4439 = argument_46_;
	Class366.aJs5Store_3087 = argument_45_;
	for (int anLocalInt = 0; aClass59_Sub31Array6316.length > anLocalInt;
	     anLocalInt++)
	    aClass59_Sub31Array6316[anLocalInt].method866(argument_48_,
							  argument_42_, -8740);
	Class389.method4133(82, argument_43_);
	Class122.method2391(argument_48_, argument_42_, 106);
	int[] anLocalInts = new int[argument_42_ * argument_48_];
	int anLocalInt = 0;
	for (int anLocalInt_49_ = 0; anLocalInt_49_ < argument_42_;
	     anLocalInt_49_++) {
	    int[] anLocalInts_50_;
	    int[] anLocalInts_51_;
	    int[] anLocalInts_52_;
	    if (((Node_Sub31) aClass59_Sub31_6308).aBoolean4138) {
		int[] anLocalInts_53_
		    = aClass59_Sub31_6308.method867((byte) 42, anLocalInt_49_);
		anLocalInts_50_ = anLocalInts_53_;
		anLocalInts_52_ = anLocalInts_53_;
		anLocalInts_51_ = anLocalInts_53_;
	    } else {
		int[][] anLocalInts_54_
		    = aClass59_Sub31_6308.method870(anLocalInt_49_, (byte) -9);
		anLocalInts_50_ = anLocalInts_54_[0];
		anLocalInts_51_ = anLocalInts_54_[1];
		anLocalInts_52_ = anLocalInts_54_[2];
	    }
	    if (argument_44_)
		anLocalInt = anLocalInt_49_;
	    int[] anLocalInts_55_;
	    if (!((Node_Sub31) aClass59_Sub31_6307).aBoolean4138)
		anLocalInts_55_ = (aClass59_Sub31_6307.method870
				   (anLocalInt_49_, (byte) -9)[0]);
	    else
		anLocalInts_55_
		    = aClass59_Sub31_6307.method867((byte) 70, anLocalInt_49_);
	    for (int anLocalInt_56_ = argument_48_ - 1; anLocalInt_56_ >= 0;
		 anLocalInt_56_--) {
		int anLocalInt_57_ = anLocalInts_50_[anLocalInt_56_] >> 4;
		if (anLocalInt_57_ > 255)
		    anLocalInt_57_ = 255;
		if (anLocalInt_57_ < 0)
		    anLocalInt_57_ = 0;
		int anLocalInt_58_ = anLocalInts_51_[anLocalInt_56_] >> 4;
		if (anLocalInt_58_ > 255)
		    anLocalInt_58_ = 255;
		if (anLocalInt_58_ < 0)
		    anLocalInt_58_ = 0;
		int anLocalInt_59_ = anLocalInts_52_[anLocalInt_56_] >> 4;
		if (anLocalInt_59_ > 255)
		    anLocalInt_59_ = 255;
		if (anLocalInt_59_ < 0)
		    anLocalInt_59_ = 0;
		anLocalInt_58_ = Statics.anIntArray5209[anLocalInt_58_];
		anLocalInt_57_ = Statics.anIntArray5209[anLocalInt_57_];
		anLocalInt_59_ = Statics.anIntArray5209[anLocalInt_59_];
		int anLocalInt_60_;
		if (anLocalInt_57_ == 0 && anLocalInt_58_ == 0
		    && anLocalInt_59_ == 0)
		    anLocalInt_60_ = 0;
		else {
		    anLocalInt_60_ = anLocalInts_55_[anLocalInt_56_] >> 4;
		    if (anLocalInt_60_ > 255)
			anLocalInt_60_ = 255;
		    if (anLocalInt_60_ < 0)
			anLocalInt_60_ = 0;
		}
		anLocalInts[anLocalInt++]
		    = ((anLocalInt_58_ << 8)
		       + ((anLocalInt_60_ << 24) + (anLocalInt_57_ << 16))
		       + anLocalInt_59_);
		if (argument_44_)
		    anLocalInt += argument_48_ - 1;
	    }
	}
	for (int anLocalInt_61_ = 0;
	     aClass59_Sub31Array6316.length > anLocalInt_61_; anLocalInt_61_++)
	    aClass59_Sub31Array6316[anLocalInt_61_].method873(-31278);
	return anLocalInts;
    }
    
    public DoublyLinkedNode_Sub51_Sub15() {
	anIntArray6312 = new int[0];
	anIntArray6310 = new int[0];
	aClass59_Sub31_6311 = new Node_Sub31_Sub4(0);
	((Node_Sub31) aClass59_Sub31_6311).anInt4139 = 1;
	aClass59_Sub31_6308 = new Node_Sub31_Sub4();
	((Node_Sub31) aClass59_Sub31_6308).anInt4139 = 1;
	aClass59_Sub31_6307 = new Node_Sub31_Sub4();
	aClass59_Sub31Array6316
	    = new Node_Sub31[] { aClass59_Sub31_6308, aClass59_Sub31_6307,
				    aClass59_Sub31_6311 };
	((Node_Sub31) aClass59_Sub31_6307).anInt4139 = 1;
    }
    
    DoublyLinkedNode_Sub51_Sub15(Packet argument_62_) {
	int anLocalInt = argument_62_.g1();
	int anLocalInt_63_ = 0;
	int anLocalInt_64_ = 0;
	aClass59_Sub31Array6316 = new Node_Sub31[anLocalInt];
	int[][] anLocalInts = new int[anLocalInt][];
	for (int anLocalInt_65_ = 0; anLocalInt > anLocalInt_65_;
	     anLocalInt_65_++) {
	    Node_Sub31 class59_sub31 = Class42.method423(0, argument_62_);
	    if (class59_sub31.method871((byte) -17) >= 0)
		anLocalInt_63_++;
	    if (class59_sub31.method872((byte) -113) >= 0)
		anLocalInt_64_++;
	    int anLocalInt_66_ = (((Node_Sub31) class59_sub31)
				  .aClass59_Sub31Array4136).length;
	    anLocalInts[anLocalInt_65_] = new int[anLocalInt_66_];
	    for (int anLocalInt_67_ = 0; anLocalInt_67_ < anLocalInt_66_;
		 anLocalInt_67_++)
		anLocalInts[anLocalInt_65_][anLocalInt_67_]
		    = argument_62_.g1();
	    aClass59_Sub31Array6316[anLocalInt_65_] = class59_sub31;
	}
	anIntArray6312 = new int[anLocalInt_63_];
	anIntArray6310 = new int[anLocalInt_64_];
	anLocalInt_63_ = 0;
	anLocalInt_64_ = 0;
	for (int anLocalInt_68_ = 0; anLocalInt_68_ < anLocalInt;
	     anLocalInt_68_++) {
	    Node_Sub31 class59_sub31
		= aClass59_Sub31Array6316[anLocalInt_68_];
	    int anLocalInt_69_ = (((Node_Sub31) class59_sub31)
				  .aClass59_Sub31Array4136).length;
	    for (int anLocalInt_70_ = 0; anLocalInt_69_ > anLocalInt_70_;
		 anLocalInt_70_++)
		((Node_Sub31) class59_sub31).aClass59_Sub31Array4136
		    [anLocalInt_70_]
		    = (aClass59_Sub31Array6316
		       [anLocalInts[anLocalInt_68_][anLocalInt_70_]]);
	    int anLocalInt_71_ = class59_sub31.method871((byte) -17);
	    int anLocalInt_72_ = class59_sub31.method872((byte) -78);
	    if (anLocalInt_71_ > 0)
		anIntArray6312[anLocalInt_63_++] = anLocalInt_71_;
	    if (anLocalInt_72_ > 0)
		anIntArray6310[anLocalInt_64_++] = anLocalInt_72_;
	    anLocalInts[anLocalInt_68_] = null;
	}
	aClass59_Sub31_6308
	    = aClass59_Sub31Array6316[argument_62_.g1()];
	aClass59_Sub31_6307
	    = aClass59_Sub31Array6316[argument_62_.g1()];
	aClass59_Sub31_6311
	    = aClass59_Sub31Array6316[argument_62_.g1()];
	Object object = null;
    }
}
