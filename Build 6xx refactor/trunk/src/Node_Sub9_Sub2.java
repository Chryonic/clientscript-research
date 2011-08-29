/* Class59_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub9_Sub2 extends Node_Sub9
{
    int[] anIntArray5752;
    private int[] anIntArray5753;
    private Class175 aClass175_5754;
    private int[] anIntArray5755;
    private int[] anIntArray5756;
    private int[] anIntArray5757;
    int[] anIntArray5758;
    private int[] anIntArray5759;
    private int[] anIntArray5760;
    private int[] anIntArray5761;
    static Class166 aClass166_5762 = new Class166(36, -1);
    private int[] anIntArray5763;
    private Node_Sub43[][] aClass59_Sub43ArrayArray5764;
    int[] anIntArray5765;
    private JagexHashMap aJagexHashMap_5766;
    private int[] anIntArray5767;
    private int[] anIntArray5768;
    static int anInt5769;
    static Class166 aClass166_5770 = new Class166(94, 6);
    private int anInt5771;
    private int anInt5772;
    private int[] anIntArray5773;
    private int[] anIntArray5774;
    private Node_Sub43[][] aClass59_Sub43ArrayArray5775;
    static int anInt5776 = 100;
    static int anInt5777;
    private int[] anIntArray5778;
    private long aLong5779;
    private Node_Sub9_Sub1 aClass59_Sub9_Sub1_5780;
    private long aLong5781;
    private int anInt5782;
    private boolean aBoolean5783;
    private int anInt5784;
    private boolean aBoolean5785;
    private Node_Sub17 aClass59_Sub17_5786;
    private int anInt5787;
    
    private final void method584(int argument_0_, int argument_1_,
				 int argument_2_) {
	anIntArray5757[argument_1_] = argument_2_;
	int anLocalInt = 118 % ((argument_0_ + 24) / 39);
	anIntArray5755[argument_1_] = MathStatics.AND(-128, argument_2_);
	method599(argument_1_, argument_2_, -129);
    }
    
    final void method585(int argument_3_, boolean argument_4_,
			 Node_Sub43 argument_5_) {
	int anLocalInt = (((Node_Sub40_Sub1) (((Node_Sub43) argument_5_)
						 .aClass59_Sub40_Sub1_4227))
			  .aByteArray6136).length;
	int anLocalInt_6_;
	if (argument_4_
	    && (((Node_Sub40_Sub1)
		 ((Node_Sub43) argument_5_).aClass59_Sub40_Sub1_4227)
		.aBoolean6135)) {
	    int anLocalInt_7_
		= (-(((Node_Sub40_Sub1)
		      ((Node_Sub43) argument_5_).aClass59_Sub40_Sub1_4227)
		     .anInt6138)
		   + (anLocalInt + anLocalInt));
	    anLocalInt_6_
		= (int) (((long) (((Node_Sub9_Sub2) this).anIntArray5752
				  [((Node_Sub43) argument_5_).anInt4228])
			  * (long) anLocalInt_7_)
			 >> 6);
	    anLocalInt <<= 8;
	    if (anLocalInt_6_ >= anLocalInt) {
		anLocalInt_6_
		    = -anLocalInt_6_ + (anLocalInt + (anLocalInt - 1));
		((Node_Sub43) argument_5_).aClass59_Sub9_Sub4_4226
		    .method651(true);
	    }
	} else
	    anLocalInt_6_
		= (int) (((long) anLocalInt
			  * (long) (((Node_Sub9_Sub2) this).anIntArray5752
				    [((Node_Sub43) argument_5_).anInt4228]))
			 >> 6);
	((Node_Sub43) argument_5_).aClass59_Sub9_Sub4_4226
	    .method638(anLocalInt_6_);
	if (argument_3_ != 24904)
	    method596(-18, -13, 32, 52);
    }
    
    private final void method586(int argument_8_, byte argument_9_) {
	int anLocalInt = argument_8_ & 0xf0;
	if (anLocalInt == 128) {
	    int anLocalInt_10_ = argument_8_ & 0xf;
	    int anLocalInt_11_ = (argument_8_ & 0x7fb8) >> 8;
	    int anLocalInt_12_ = argument_8_ >> 16 & 0x7f;
	    method619(anLocalInt_11_, anLocalInt_10_, anLocalInt_12_,
		      (byte) -128);
	} else if (anLocalInt == 144) {
	    int anLocalInt_13_ = argument_8_ & 0xf;
	    int anLocalInt_14_ = (argument_8_ & 0x7f05) >> 8;
	    int anLocalInt_15_ = (argument_8_ & 0x7f4855) >> 16;
	    if (anLocalInt_15_ <= 0)
		method619(anLocalInt_14_, anLocalInt_13_, 64, (byte) -128);
	    else
		method597(anLocalInt_13_, (byte) -120, anLocalInt_14_,
			  anLocalInt_15_);
	} else if (anLocalInt == 160) {
	    int anLocalInt_16_ = argument_8_ & 0xf;
	    int anLocalInt_17_ = (argument_8_ & 0x7f98) >> 8;
	    int anLocalInt_18_ = argument_8_ >> 16 & 0x7f;
	    method596(anLocalInt_16_, anLocalInt_17_, anLocalInt_18_, -128);
	} else if (anLocalInt == 176) {
	    int anLocalInt_19_ = argument_8_ & 0xf;
	    int anLocalInt_20_ = (argument_8_ & 0x7f97) >> 8;
	    int anLocalInt_21_ = (argument_8_ & 0x7fb822) >> 16;
	    if (anLocalInt_20_ == 0)
		anIntArray5755[anLocalInt_19_]
		    = ((anLocalInt_21_ << 14)
		       + MathStatics.AND(-2080769, (anIntArray5755[anLocalInt_19_])));
	    if (anLocalInt_20_ == 32)
		anIntArray5755[anLocalInt_19_]
		    = (MathStatics.AND(-16257, anIntArray5755[anLocalInt_19_])
		       + (anLocalInt_21_ << 7));
	    if (anLocalInt_20_ == 1)
		anIntArray5768[anLocalInt_19_]
		    = MathStatics.AND(anIntArray5768[anLocalInt_19_], -16257) + (anLocalInt_21_ << 7);
	    if (anLocalInt_20_ == 33)
		anIntArray5768[anLocalInt_19_]
		    = MathStatics.AND(anIntArray5768[anLocalInt_19_], -128) + anLocalInt_21_;
	    if (anLocalInt_20_ == 5)
		anIntArray5753[anLocalInt_19_]
		    = MathStatics.AND(anIntArray5753[anLocalInt_19_], -16257) + (anLocalInt_21_ << 7);
	    if (anLocalInt_20_ == 37)
		anIntArray5753[anLocalInt_19_]
		    = (anLocalInt_21_
		       + MathStatics.AND(anIntArray5753[anLocalInt_19_], -128));
	    if (anLocalInt_20_ == 7)
		anIntArray5759[anLocalInt_19_]
		    = MathStatics.AND(anIntArray5759[anLocalInt_19_], -16257) + (anLocalInt_21_ << 7);
	    if (anLocalInt_20_ == 39)
		anIntArray5759[anLocalInt_19_]
		    = (anLocalInt_21_
		       + MathStatics
			     .AND(-128, anIntArray5759[anLocalInt_19_]));
	    if (anLocalInt_20_ == 10)
		anIntArray5767[anLocalInt_19_]
		    = MathStatics.AND(anIntArray5767[anLocalInt_19_], -16257) + (anLocalInt_21_ << 7);
	    if (anLocalInt_20_ == 42)
		anIntArray5767[anLocalInt_19_]
		    = (anLocalInt_21_
		       + MathStatics
			     .AND(-128, anIntArray5767[anLocalInt_19_]));
	    if (anLocalInt_20_ == 11)
		anIntArray5760[anLocalInt_19_]
		    = ((anLocalInt_21_ << 7)
		       + MathStatics.AND(-16257, (anIntArray5760[anLocalInt_19_])));
	    if (anLocalInt_20_ == 43)
		anIntArray5760[anLocalInt_19_]
		    = (MathStatics.AND(-128, anIntArray5760[anLocalInt_19_])
		       + anLocalInt_21_);
	    if (anLocalInt_20_ == 64) {
		if (anLocalInt_21_ >= 64)
		    ((Node_Sub9_Sub2) this).anIntArray5765[anLocalInt_19_]
			= MathStatics.OR((((Node_Sub9_Sub2) this).anIntArray5765[anLocalInt_19_]), 1);
		else
		    ((Node_Sub9_Sub2) this).anIntArray5765[anLocalInt_19_]
			= MathStatics.AND((((Node_Sub9_Sub2) this).anIntArray5765[anLocalInt_19_]), -2);
	    }
	    if (anLocalInt_20_ == 65) {
		if (anLocalInt_21_ >= 64)
		    ((Node_Sub9_Sub2) this).anIntArray5765[anLocalInt_19_]
			= MathStatics.OR((((Node_Sub9_Sub2) this).anIntArray5765[anLocalInt_19_]), 2);
		else {
		    method615((byte) 68, anLocalInt_19_);
		    ((Node_Sub9_Sub2) this).anIntArray5765[anLocalInt_19_]
			= MathStatics.AND((((Node_Sub9_Sub2) this).anIntArray5765[anLocalInt_19_]), -3);
		}
	    }
	    if (anLocalInt_20_ == 99)
		anIntArray5774[anLocalInt_19_]
		    = MathStatics.AND(anIntArray5774[anLocalInt_19_], 127) + (anLocalInt_21_ << 7);
	    if (anLocalInt_20_ == 98)
		anIntArray5774[anLocalInt_19_]
		    = (MathStatics.AND(16256, anIntArray5774[anLocalInt_19_])
		       + anLocalInt_21_);
	    if (anLocalInt_20_ == 101)
		anIntArray5774[anLocalInt_19_]
		    = ((anLocalInt_21_ << 7) + 16384
		       + MathStatics.AND(anIntArray5774[anLocalInt_19_], 127));
	    if (anLocalInt_20_ == 100)
		anIntArray5774[anLocalInt_19_]
		    = MathStatics.AND(anIntArray5774[anLocalInt_19_], 16256) + 16384 + anLocalInt_21_;
	    if (anLocalInt_20_ == 120)
		method606(0, anLocalInt_19_);
	    if (anLocalInt_20_ == 121)
		method592(anLocalInt_19_, (byte) -48);
	    if (anLocalInt_20_ == 123)
		method593(anLocalInt_19_, 107);
	    if (anLocalInt_20_ == 6) {
		int anLocalInt_22_ = anIntArray5774[anLocalInt_19_];
		if (anLocalInt_22_ == 16384)
		    anIntArray5773[anLocalInt_19_]
			= (MathStatics.AND(-16257, (anIntArray5773[anLocalInt_19_]))
			   + (anLocalInt_21_ << 7));
	    }
	    if (anLocalInt_20_ == 38) {
		int anLocalInt_23_ = anIntArray5774[anLocalInt_19_];
		if (anLocalInt_23_ == 16384)
		    anIntArray5773[anLocalInt_19_]
			= (anLocalInt_21_
			   + MathStatics.AND(-128, (anIntArray5773[anLocalInt_19_])));
	    }
	    if (anLocalInt_20_ == 16)
		((Node_Sub9_Sub2) this).anIntArray5752[anLocalInt_19_]
		    = (MathStatics.AND(-16257, (((Node_Sub9_Sub2) this).anIntArray5752[anLocalInt_19_]))
		       + (anLocalInt_21_ << 7));
	    if (anLocalInt_20_ == 48)
		((Node_Sub9_Sub2) this).anIntArray5752[anLocalInt_19_]
		    = (anLocalInt_21_
		       + MathStatics.AND((((Node_Sub9_Sub2) this).anIntArray5752[anLocalInt_19_]), -128));
	    if (anLocalInt_20_ == 81) {
		if (anLocalInt_21_ >= 64)
		    ((Node_Sub9_Sub2) this).anIntArray5765[anLocalInt_19_]
			= MathStatics.OR((((Node_Sub9_Sub2) this).anIntArray5765[anLocalInt_19_]), 4);
		else {
		    method604(anLocalInt_19_, (byte) 125);
		    ((Node_Sub9_Sub2) this).anIntArray5765[anLocalInt_19_]
			= MathStatics.AND((((Node_Sub9_Sub2) this).anIntArray5765[anLocalInt_19_]), -5);
		}
	    }
	    if (anLocalInt_20_ == 17)
		method605(-18660, ((anIntArray5756[anLocalInt_19_] & ~0x3f80)
				   + (anLocalInt_21_ << 7)), anLocalInt_19_);
	    if (anLocalInt_20_ == 49)
		method605(-18660, ((anIntArray5756[anLocalInt_19_] & ~0x7f)
				   + anLocalInt_21_), anLocalInt_19_);
	} else if (anLocalInt == 192) {
	    int anLocalInt_24_ = argument_8_ & 0xf;
	    int anLocalInt_25_ = (argument_8_ & 0x7f6e) >> 8;
	    method599(anLocalInt_24_,
		      anIntArray5755[anLocalInt_24_] + anLocalInt_25_, -129);
	} else if (anLocalInt == 208) {
	    int anLocalInt_26_ = argument_8_ & 0xf;
	    int anLocalInt_27_ = argument_8_ >> 8 & 0x7f;
	    method589(-110, anLocalInt_27_, anLocalInt_26_);
	} else if (anLocalInt == 224) {
	    int anLocalInt_28_ = argument_8_ & 0xf;
	    int anLocalInt_29_ = (((argument_8_ & 0x7f0110) >> 9)
				  + ((argument_8_ & 0x7f8d) >> 8));
	    method608(anLocalInt_28_, anLocalInt_29_, true);
	} else {
	    anLocalInt = argument_8_ & 0xff;
	    if (argument_9_ <= 95)
		anIntArray5778 = null;
	    if (anLocalInt == 255)
		method587(true, -126);
	}
    }
    
    private final void method587(boolean argument_30_, int argument_31_) {
	if (argument_30_)
	    method606(0, -1);
	else
	    method593(-1, 124);
	method592(-1, (byte) -48);
	for (int anLocalInt = 0; anLocalInt < 16; anLocalInt++)
	    anIntArray5763[anLocalInt] = anIntArray5757[anLocalInt];
	int anLocalInt = -19 / ((-79 - argument_31_) / 45);
	for (int anLocalInt_32_ = 0; anLocalInt_32_ < 16; anLocalInt_32_++)
	    anIntArray5755[anLocalInt_32_]
		= MathStatics.AND(-128, anIntArray5757[anLocalInt_32_]);
    }
    
    private final int method588(Node_Sub43 argument_33_,
				byte argument_34_) {
	int anLocalInt = (((((Node_Sub43) argument_33_).anInt4216
			    * ((Node_Sub43) argument_33_).anInt4221)
			   >> 12)
			  + ((Node_Sub43) argument_33_).anInt4218);
	anLocalInt
	    += (anIntArray5773[((Node_Sub43) argument_33_).anInt4228]
		* (anIntArray5761[((Node_Sub43) argument_33_).anInt4228]
		   - 8192)) >> 12;
	Class384 class384 = ((Node_Sub43) argument_33_).aClass384_4217;
	if (((Class384) class384).anInt3252 > 0
	    && (((Class384) class384).anInt3254 > 0
		|| (anIntArray5768[((Node_Sub43) argument_33_).anInt4228]
		    > 0))) {
	    int anLocalInt_35_ = ((Class384) class384).anInt3254 << 2;
	    int anLocalInt_36_ = ((Class384) class384).anInt3248 << 1;
	    if (((Node_Sub43) argument_33_).anInt4215 < anLocalInt_36_)
		anLocalInt_35_ = (((Node_Sub43) argument_33_).anInt4215
				  * anLocalInt_35_ / anLocalInt_36_);
	    anLocalInt_35_
		+= (anIntArray5768[((Node_Sub43) argument_33_).anInt4228]
		    >> 7);
	    double d
		= Math.sin((double) (((Node_Sub43) argument_33_).anInt4219
				     & 0x1ff) * 0.01227184630308513);
	    anLocalInt += (int) ((double) anLocalInt_35_ * d);
	}
	if (argument_34_ != 77)
	    anInt5772 = -87;
	int anLocalInt_37_
	    = (int) (((double) (((Node_Sub40_Sub1)
				 (((Node_Sub43) argument_33_)
				  .aClass59_Sub40_Sub1_4227)).anInt6139
				* 256)
		      * Math.pow(2.0,
				 (double) anLocalInt * 3.255208333333333E-4)
		      / (double) Statics.anInt44)
		     + 0.5);
	if (anLocalInt_37_ >= 1)
	    return anLocalInt_37_;
	return 1;
    }
    
    private final void method589(int argument_38_, int argument_39_,
				 int argument_40_) {
	if (argument_38_ > -17) {
	    /* empty */
	}
    }
    
    final synchronized int method575() {
	return 0;
    }
    
    final synchronized Node_Sub9 method573() {
	return aClass59_Sub9_Sub1_5780;
    }
    
    final synchronized void method590(byte argument_41_, int argument_42_) {
	anInt5772 = argument_42_;
    }
    
    final synchronized void method591(byte argument_43_) {
	for (Node_Sub6 class59_sub6
		 = (Node_Sub6) aJagexHashMap_5766.first(0);
	     class59_sub6 != null;
	     class59_sub6 = (Node_Sub6) aJagexHashMap_5766.next())
	    class59_sub6.unlink();
    }
    
    private final void method592(int argument_44_, byte argument_45_) {
	if (argument_44_ < 0) {
	    for (argument_44_ = 0; argument_44_ < 16; argument_44_++)
		method592(argument_44_, (byte) -48);
	} else {
	    anIntArray5759[argument_44_] = 12800;
	    anIntArray5767[argument_44_] = 8192;
	    anIntArray5760[argument_44_] = 16383;
	    anIntArray5761[argument_44_] = 8192;
	    anIntArray5768[argument_44_] = 0;
	    anIntArray5753[argument_44_] = 8192;
	    method615((byte) 126, argument_44_);
	    if (argument_45_ != -48)
		anInt5782 = 57;
	    method604(argument_44_, (byte) 125);
	    ((Node_Sub9_Sub2) this).anIntArray5765[argument_44_] = 0;
	    anIntArray5774[argument_44_] = 32767;
	    anIntArray5773[argument_44_] = 256;
	    ((Node_Sub9_Sub2) this).anIntArray5752[argument_44_] = 0;
	    method605(-18660, 8192, argument_44_);
	}
    }
    
    private final void method593(int argument_46_, int argument_47_) {
	for (Node_Sub43 class59_sub43
		 = ((Node_Sub43)
		    ((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
			.aCyclicLinkedList_5750.getFirst());
	     class59_sub43 != null;
	     class59_sub43 = ((Node_Sub43)
			      ((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
				  .aCyclicLinkedList_5750.getNext())) {
	    if ((argument_46_ < 0
		 || ((Node_Sub43) class59_sub43).anInt4228 == argument_46_)
		&& ((Node_Sub43) class59_sub43).anInt4223 < 0) {
		aClass59_Sub43ArrayArray5764
		    [((Node_Sub43) class59_sub43).anInt4228]
		    [((Node_Sub43) class59_sub43).anInt4207]
		    = null;
		((Node_Sub43) class59_sub43).anInt4223 = 0;
	    }
	}
	if (argument_47_ < 104)
	    method607(true, null);
    }
    
    private final synchronized void method594(int argument_48_,
					      boolean argument_49_) {
	aClass175_5754.method2783();
	aClass59_Sub17_5786 = null;
	method587(argument_49_, 14);
	if (argument_48_ < 22)
	    anIntArray5778 = null;
    }
    
    public static void method595(int argument) {
	aClass166_5770 = null;
	aClass166_5762 = null;
    }
    
    private final void method596(int argument_50_, int argument_51_,
				 int argument_52_, int argument_53_) {
	if (argument_53_ >= -127)
	    method613(-114, 96, 66, -4, -38);
    }
    
    private final void method597(int argument_54_, byte argument_55_,
				 int argument_56_, int argument_57_) {
	method619(argument_56_, argument_54_, 64, (byte) -128);
	if ((((Node_Sub9_Sub2) this).anIntArray5765[argument_54_] & 0x2)
	    != 0) {
	    for (Node_Sub43 class59_sub43
		     = ((Node_Sub43)
			((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
			    .aCyclicLinkedList_5750.getEnd());
		 class59_sub43 != null;
		 class59_sub43 = ((Node_Sub43)
				  ((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
				      .aCyclicLinkedList_5750.get())) {
		if (argument_54_ == ((Node_Sub43) class59_sub43).anInt4228
		    && ((Node_Sub43) class59_sub43).anInt4223 < 0) {
		    aClass59_Sub43ArrayArray5764[argument_54_]
			[((Node_Sub43) class59_sub43).anInt4207]
			= null;
		    aClass59_Sub43ArrayArray5764[argument_54_][argument_56_]
			= class59_sub43;
		    int anLocalInt
			= (((((Node_Sub43) class59_sub43).anInt4221
			     * ((Node_Sub43) class59_sub43).anInt4216)
			    >> 12)
			   + ((Node_Sub43) class59_sub43).anInt4218);
		    ((Node_Sub43) class59_sub43).anInt4218
			+= (argument_56_
			    - ((Node_Sub43) class59_sub43).anInt4207) << 8;
		    ((Node_Sub43) class59_sub43).anInt4216 = 4096;
		    ((Node_Sub43) class59_sub43).anInt4207 = argument_56_;
		    ((Node_Sub43) class59_sub43).anInt4221
			= (-((Node_Sub43) class59_sub43).anInt4218
			   + anLocalInt);
		    return;
		}
	    }
	}
	Node_Sub6 class59_sub6
	    = ((Node_Sub6)
	       aJagexHashMap_5766.get((long) anIntArray5763[argument_54_]));
	if (class59_sub6 != null) {
	    Node_Sub40_Sub1 class59_sub40_sub1
		= (((Node_Sub6) class59_sub6).aClass59_Sub40_Sub1Array3902
		   [argument_56_]);
	    if (class59_sub40_sub1 != null) {
		Node_Sub43 class59_sub43 = new Node_Sub43();
		((Node_Sub43) class59_sub43).anInt4228 = argument_54_;
		int anLocalInt = 122 % ((argument_55_ + 55) / 44);
		((Node_Sub43) class59_sub43).aClass59_Sub6_4224
		    = class59_sub6;
		((Node_Sub43) class59_sub43).aClass59_Sub40_Sub1_4227
		    = class59_sub40_sub1;
		((Node_Sub43) class59_sub43).aClass384_4217
		    = (((Node_Sub6) class59_sub6).aClass384Array3901
		       [argument_56_]);
		((Node_Sub43) class59_sub43).anInt4225
		    = (((Node_Sub6) class59_sub6).aByteArray3905
		       [argument_56_]);
		((Node_Sub43) class59_sub43).anInt4207 = argument_56_;
		((Node_Sub43) class59_sub43).anInt4214
		    = ((((Node_Sub6) class59_sub6).aByteArray3898
			[argument_56_])
		       * ((Node_Sub6) class59_sub6).anInt3899
		       * (argument_57_ * argument_57_)) + 1024 >> 11;
		((Node_Sub43) class59_sub43).anInt4211
		    = (((Node_Sub6) class59_sub6).aByteArray3906
		       [argument_56_]) & 0xff;
		((Node_Sub43) class59_sub43).anInt4218
		    = (argument_56_ << 8) - ((((Node_Sub6) class59_sub6)
					      .aShortArray3908[argument_56_])
					     & 0x7fff);
		((Node_Sub43) class59_sub43).anInt4222 = 0;
		((Node_Sub43) class59_sub43).anInt4212 = 0;
		((Node_Sub43) class59_sub43).anInt4209 = 0;
		((Node_Sub43) class59_sub43).anInt4208 = 0;
		((Node_Sub43) class59_sub43).anInt4223 = -1;
		if (((Node_Sub9_Sub2) this).anIntArray5752[argument_54_]
		    == 0)
		    ((Node_Sub43) class59_sub43).aClass59_Sub9_Sub4_4226
			= Node_Sub9_Sub4.method631(class59_sub40_sub1,
                    method588(class59_sub43,
                            (byte) 77),
                    method621(65565736,
                            class59_sub43),
                    method598(class59_sub43,
                            (byte) 78));
		else {
		    ((Node_Sub43) class59_sub43).aClass59_Sub9_Sub4_4226
			= Node_Sub9_Sub4.method631(class59_sub40_sub1,
                    method588(class59_sub43,
                            (byte) 77),
                    0,
                    method598(class59_sub43,
                            (byte) 78));
		    method585(24904,
			      (((Node_Sub6) class59_sub6).aShortArray3908
			       [argument_56_]) < 0,
			      class59_sub43);
		}
		if (((Node_Sub6) class59_sub6).aShortArray3908[argument_56_]
		    < 0)
		    ((Node_Sub43) class59_sub43).aClass59_Sub9_Sub4_4226
			.method664(-1);
		if (((Node_Sub43) class59_sub43).anInt4225 >= 0) {
		    Node_Sub43 class59_sub43_58_
			= (aClass59_Sub43ArrayArray5775[argument_54_]
			   [((Node_Sub43) class59_sub43).anInt4225]);
		    if (class59_sub43_58_ != null
			&& ((Node_Sub43) class59_sub43_58_).anInt4223 < 0) {
			aClass59_Sub43ArrayArray5764[argument_54_]
			    [((Node_Sub43) class59_sub43_58_).anInt4207]
			    = null;
			((Node_Sub43) class59_sub43_58_).anInt4223 = 0;
		    }
		    aClass59_Sub43ArrayArray5775[argument_54_]
			[((Node_Sub43) class59_sub43).anInt4225]
			= class59_sub43;
		}
		((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
		    .aCyclicLinkedList_5750.add(class59_sub43);
		aClass59_Sub43ArrayArray5764[argument_54_][argument_56_]
		    = class59_sub43;
	    }
	}
    }
    
    private final int method598(Node_Sub43 argument_59_,
				byte argument_60_) {
	if (argument_60_ != 78)
	    aClass166_5762 = null;
	int anLocalInt
	    = anIntArray5767[((Node_Sub43) argument_59_).anInt4228];
	if (anLocalInt < 8192)
	    return (((Node_Sub43) argument_59_).anInt4211 * anLocalInt + 32
		    >> 6);
	return (16384
		- (((16384 - anLocalInt)
		    * (-((Node_Sub43) argument_59_).anInt4211 + 128)) + 32
		   >> 6));
    }
    
    private final void method599(int argument_61_, int argument_62_,
				 int argument_63_) {
	if (argument_63_ != -129)
	    method597(-127, (byte) -52, 48, 69);
	if (argument_62_ != anIntArray5763[argument_61_]) {
	    anIntArray5763[argument_61_] = argument_62_;
	    for (int anLocalInt = 0; anLocalInt < 128; anLocalInt++)
		aClass59_Sub43ArrayArray5775[argument_61_][anLocalInt] = null;
	}
    }
    
    private final synchronized void method600
	(boolean argument_64_, int argument_65_, Node_Sub17 argument_66_,
	 boolean argument_67_) {
	method594(68, argument_64_);
	aClass175_5754
	    .method2782(((Node_Sub17) argument_66_).aByteArray4003);
	aBoolean5783 = argument_67_;
	aLong5781 = 0L;
	int anLocalInt = aClass175_5754.method2773();
	for (int anLocalInt_68_ = 0; anLocalInt > anLocalInt_68_;
	     anLocalInt_68_++) {
	    aClass175_5754.method2779(anLocalInt_68_);
	    aClass175_5754.method2781(anLocalInt_68_);
	    aClass175_5754.method2776(anLocalInt_68_);
	}
	anInt5784 = aClass175_5754.method2772();
	anInt5782 = ((Class175) aClass175_5754).anIntArray1300[anInt5784];
	if (argument_65_ == -26965)
	    aLong5779 = aClass175_5754.method2785(anInt5782);
    }
    
    final synchronized void method601(int argument_69_, byte argument_70_,
				      int argument_71_) {
	method584(-74, argument_71_, argument_69_);
    }
    
    final synchronized boolean method602(byte argument_72_) {
	return aClass175_5754.method2778();
    }
    
    private final void method603(byte argument_73_, long argument_74_) {
	while (argument_74_ >= aLong5779) {
	    int anLocalInt = anInt5784;
	    int anLocalInt_75_ = anInt5782;
	    long l = aLong5779;
	    while (anInt5782 == anLocalInt_75_) {
		while (((Class175) aClass175_5754).anIntArray1300[anLocalInt]
		       == anLocalInt_75_) {
		    aClass175_5754.method2779(anLocalInt);
		    int anLocalInt_76_ = aClass175_5754.method2775(anLocalInt);
		    if (anLocalInt_76_ == 1) {
			aClass175_5754.method2780();
			aClass175_5754.method2776(anLocalInt);
			if (aClass175_5754.method2777()) {
			    if (aBoolean5783 && anLocalInt_75_ != 0)
				aClass175_5754.method2786(l);
			    else {
				method587(true, 71);
				aClass175_5754.method2783();
				return;
			    }
			}
			break;
		    }
		    if ((anLocalInt_76_ & 0x80) != 0
			&& (anLocalInt_76_ & 0xf0) != 144)
			method586(anLocalInt_76_, (byte) 119);
		    aClass175_5754.method2781(anLocalInt);
		    aClass175_5754.method2776(anLocalInt);
		}
		aLong5781 = l;
		anLocalInt = aClass175_5754.method2772();
		anLocalInt_75_
		    = ((Class175) aClass175_5754).anIntArray1300[anLocalInt];
		l = aClass175_5754.method2785(anLocalInt_75_);
	    }
	    aLong5779 = l;
	    anInt5782 = anLocalInt_75_;
	    anInt5784 = anLocalInt;
	}
	int anLocalInt = -54 % ((16 - argument_73_) / 49);
    }
    
    private final void method604(int argument_77_, byte argument_78_) {
	if (argument_78_ == 125) {
	    if ((((Node_Sub9_Sub2) this).anIntArray5765[argument_77_] & 0x4)
		!= 0) {
		for (Node_Sub43 class59_sub43
			 = ((Node_Sub43)
			    ((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
				.aCyclicLinkedList_5750.getFirst());
		     class59_sub43 != null;
		     class59_sub43
			 = ((Node_Sub43)
			    ((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
				.aCyclicLinkedList_5750.getNext())) {
		    if (argument_77_
			== ((Node_Sub43) class59_sub43).anInt4228)
			((Node_Sub43) class59_sub43).anInt4213 = 0;
		}
	    }
	}
    }
    
    private final void method605(int argument_79_, int argument_80_,
				 int argument_81_) {
	anIntArray5756[argument_81_] = argument_80_;
	if (argument_79_ == -18660)
	    ((Node_Sub9_Sub2) this).anIntArray5758[argument_81_]
		= (int) ((Math.pow(2.0,
				   (double) argument_80_ * 5.4931640625E-4)
			  * 2097152.0)
			 + 0.5);
    }
    
    private final void method606(int argument_82_, int argument_83_) {
	for (Node_Sub43 class59_sub43
		 = ((Node_Sub43)
		    ((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
			.aCyclicLinkedList_5750.getFirst());
	     class59_sub43 != null;
	     class59_sub43
		 = ((Node_Sub43)
		    ((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
			.aCyclicLinkedList_5750.getNext())) {
	    if (argument_83_ < 0
		|| ((Node_Sub43) class59_sub43).anInt4228 == argument_83_) {
		if (((Node_Sub43) class59_sub43).aClass59_Sub9_Sub4_4226
		    != null) {
		    ((Node_Sub43) class59_sub43).aClass59_Sub9_Sub4_4226
			.method668(Statics.anInt44 / 100);
		    if (((Node_Sub43) class59_sub43)
			    .aClass59_Sub9_Sub4_4226.method669())
			((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
			    .aClass59_Sub9_Sub3_5751.method629
			    (((Node_Sub43) class59_sub43)
			     .aClass59_Sub9_Sub4_4226);
		    class59_sub43.method1081((byte) -120);
		}
		if (((Node_Sub43) class59_sub43).anInt4223 < 0)
		    aClass59_Sub43ArrayArray5764
			[((Node_Sub43) class59_sub43).anInt4228]
			[((Node_Sub43) class59_sub43).anInt4207]
			= null;
		class59_sub43.unlink();
	    }
	}
	if (argument_82_ != 0)
	    anInt5784 = 6;
    }
    
    static final void method607(boolean argument, GraphicsToolkit argument_84_) {
	if (!Node_Sub31_Sub39.aBoolean6055)
	    Class361.method3955(argument_84_, -123);
	else
	    Node_Sub31_Sub17.method930(argument_84_, (byte) -91);
    }
    
    private final void method608(int argument_85_, int argument_86_,
				 boolean argument_87_) {
	anIntArray5761[argument_85_] = argument_86_;
	if (argument_87_ != true)
	    anInt5769 = -7;
    }
    
    final boolean method609(Node_Sub43 argument_88_, int argument_89_) {
	if (((Node_Sub43) argument_88_).aClass59_Sub9_Sub4_4226 == null) {
	    if (((Node_Sub43) argument_88_).anInt4223 >= 0) {
		argument_88_.unlink();
		if (((Node_Sub43) argument_88_).anInt4225 > 0
		    && (argument_88_
			== (aClass59_Sub43ArrayArray5775
			    [((Node_Sub43) argument_88_).anInt4228]
			    [((Node_Sub43) argument_88_).anInt4225])))
		    aClass59_Sub43ArrayArray5775
			[((Node_Sub43) argument_88_).anInt4228]
			[((Node_Sub43) argument_88_).anInt4225]
			= null;
	    }
	    return true;
	}
	return false;
    }
    
    final synchronized void method610(int argument_90_, int argument_91_,
				      int argument_92_) {
	if (argument_91_ < argument_92_) {
	    for (int anLocalInt = 0; anLocalInt < 16; anLocalInt++)
		anIntArray5778[anLocalInt] = argument_90_;
	} else
	    anIntArray5778[argument_91_] = argument_90_;
    }
    
    private final void method611(byte argument_93_) {
	int anLocalInt = anInt5784;
	int anLocalInt_94_ = anInt5782;
	long l = aLong5779;
	if (aClass59_Sub17_5786 != null && anInt5787 == anLocalInt_94_) {
	    method600(aBoolean5785, -26965, aClass59_Sub17_5786, aBoolean5783);
	    method611((byte) -118);
	} else {
	    while (anLocalInt_94_ == anInt5782) {
		while (((Class175) aClass175_5754).anIntArray1300[anLocalInt]
		       == anLocalInt_94_) {
		    aClass175_5754.method2779(anLocalInt);
		    int anLocalInt_95_ = aClass175_5754.method2775(anLocalInt);
		    if (anLocalInt_95_ == 1) {
			aClass175_5754.method2780();
			aClass175_5754.method2776(anLocalInt);
			if (aClass175_5754.method2777()) {
			    if (aClass59_Sub17_5786 != null) {
				method618(aBoolean5783, aClass59_Sub17_5786,
					  -2);
				method611((byte) -108);
				return;
			    }
			    if (aBoolean5783 && anLocalInt_94_ != 0)
				aClass175_5754.method2786(l);
			    else {
				method587(true, -126);
				aClass175_5754.method2783();
				return;
			    }
			}
			break;
		    }
		    if ((anLocalInt_95_ & 0x80) != 0)
			method586(anLocalInt_95_, (byte) 113);
		    aClass175_5754.method2781(anLocalInt);
		    aClass175_5754.method2776(anLocalInt);
		}
		anLocalInt = aClass175_5754.method2772();
		anLocalInt_94_
		    = ((Class175) aClass175_5754).anIntArray1300[anLocalInt];
		l = aClass175_5754.method2785(anLocalInt_94_);
	    }
	    aLong5779 = l;
	    anInt5782 = anLocalInt_94_;
	    int anLocalInt_96_ = -93 / ((-57 - argument_93_) / 44);
	    anInt5784 = anLocalInt;
	    if (aClass59_Sub17_5786 != null && anLocalInt_94_ > anInt5787) {
		anInt5784 = -1;
		anInt5782 = anInt5787;
		aLong5779 = aClass175_5754.method2785(anInt5782);
	    }
	}
    }
    
    final synchronized boolean method612
	(Class215 argument_97_, boolean argument_98_,
	 Node_Sub17 argument_99_, int argument_100_,
	 Js5Store argument_101_) {
	argument_99_.method705();
	boolean anLocalBoolean = argument_98_;
	int[] anLocalInts = null;
	if (argument_100_ > 0)
	    anLocalInts = new int[] { argument_100_ };
	for (Node_Sub52 class59_sub52
		 = (Node_Sub52) ((Node_Sub17) argument_99_)
				       .aJagexHashMap_4004.first(0);
	     class59_sub52 != null;
	     class59_sub52
		 = (Node_Sub52) ((Node_Sub17) argument_99_)
				       .aJagexHashMap_4004.next()) {
	    int anLocalInt = (int) ((Node) class59_sub52).hash;
	    Node_Sub6 class59_sub6
		= ((Node_Sub6)
		   aJagexHashMap_5766.get((long) anLocalInt));
	    if (class59_sub6 == null) {
		class59_sub6
		    = Class170.method2735(0, anLocalInt, argument_101_);
		if (class59_sub6 == null) {
		    anLocalBoolean = false;
		    continue;
		}
		aJagexHashMap_5766.put((long) anLocalInt, class59_sub6);
	    }
	    if (!class59_sub6.method561((byte) -77,
					(((Node_Sub52) class59_sub52)
					 .aByteArray4346),
					anLocalInts, argument_97_))
		anLocalBoolean = false;
	}
	if (anLocalBoolean)
	    argument_99_.method703();
	return anLocalBoolean;
    }
    
    static final void method613(int argument, int argument_102_,
				int argument_103_, int argument_104_,
				int argument_105_) {
	int anLocalInt = Class199.anInt1443;
	int anLocalInt_106_ = Node_Sub32.anInt4144;
	if (Class52.aBoolean391) {
	    anLocalInt += Node_Sub52.method1319(99);
	    anLocalInt_106_ += Class82.method1596(-2);
	}
	if (Class131.anInt1058 == 1) {
	    Class368 class368
		= Class341.aClass368Array2878[Class134.anInt3613 / 100];
	    class368.method4014(anLocalInt - 8, anLocalInt_106_ - 8);
	    Canvas_Sub1.method125(class368.getWidth() + (anLocalInt - 8),
				  (byte) -102,
				  class368.method4018() - 8 + anLocalInt_106_,
				  anLocalInt_106_ - 8, anLocalInt - 8);
	}
	if (Class131.anInt1058 == 2) {
	    Class368 class368
		= Class341.aClass368Array2878[Class134.anInt3613 / 100 + 4];
	    class368.method4014(anLocalInt - 8, anLocalInt_106_ - 8);
	    Canvas_Sub1.method125(class368.getWidth() + (anLocalInt - 8),
				  (byte) -102,
				  anLocalInt_106_ - 8 + class368.method4018(),
				  anLocalInt_106_ - 8, anLocalInt - 8);
	}
	Class79.method1583((byte) -71);
    }
    
    final synchronized void method578(int[] argument_107_, int argument_108_,
				      int argument_109_) {
	if (aClass175_5754.method2778()) {
	    int anLocalInt = (anInt5771 * ((Class175) aClass175_5754).anInt1302
			      / Statics.anInt44);
	    do {
		long l = (long) argument_109_ * (long) anLocalInt + aLong5781;
		if (aLong5779 - l >= 0L) {
		    aLong5781 = l;
		    break;
		}
		int anLocalInt_110_
		    = (int) ((-aLong5781 + -1L
			      + (aLong5779 - -(long) anLocalInt))
			     / (long) anLocalInt);
		aLong5781 += (long) anLocalInt_110_ * (long) anLocalInt;
		aClass59_Sub9_Sub1_5780.method578(argument_107_, argument_108_,
						  anLocalInt_110_);
		argument_108_ += anLocalInt_110_;
		method611((byte) 102);
		argument_109_ -= anLocalInt_110_;
	    } while (aClass175_5754.method2778());
	}
	aClass59_Sub9_Sub1_5780.method578(argument_107_, argument_108_,
					  argument_109_);
    }
    
    final synchronized void method614
	(long argument_111_, boolean argument_112_, boolean argument_113_,
	 Node_Sub17 argument_114_, boolean argument_115_) {
	method600(argument_112_, -26965, argument_114_, argument_113_);
	method603((byte) -111, ((long) ((Class175) aClass175_5754).anInt1302
				* argument_111_));
    }
    
    private final void method615(byte argument_116_, int argument_117_) {
	if ((((Node_Sub9_Sub2) this).anIntArray5765[argument_117_] & 0x2)
	    != 0) {
	    for (Node_Sub43 class59_sub43
		     = ((Node_Sub43)
			((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
			    .aCyclicLinkedList_5750.getFirst());
		 class59_sub43 != null;
		 class59_sub43 = ((Node_Sub43)
				  ((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
				      .aCyclicLinkedList_5750.getNext())) {
		if (argument_117_ == ((Node_Sub43) class59_sub43).anInt4228
		    && (aClass59_Sub43ArrayArray5764[argument_117_]
			[((Node_Sub43) class59_sub43).anInt4207]) == null
		    && ((Node_Sub43) class59_sub43).anInt4223 < 0)
		    ((Node_Sub43) class59_sub43).anInt4223 = 0;
	    }
	}
	if (argument_116_ <= 18) {
	    /* empty */
	}
    }
    
    final int method616(int argument_118_) {
	return anInt5772;
    }
    
    final synchronized void method617(int argument_119_) {
	method594(47, true);
    }
    
    final synchronized void method618(boolean argument_120_,
				      Node_Sub17 argument_121_,
				      int argument_122_) {
	if (argument_122_ != -2)
	    method575();
	method600(true, argument_122_ - 26963, argument_121_, argument_120_);
    }
    
    private final void method619(int argument_123_, int argument_124_,
				 int argument_125_, byte argument_126_) {
	if (argument_126_ <= -126) {
	    Node_Sub43 class59_sub43
		= aClass59_Sub43ArrayArray5764[argument_124_][argument_123_];
	    if (class59_sub43 != null) {
		aClass59_Sub43ArrayArray5764[argument_124_][argument_123_]
		    = null;
		if ((((Node_Sub9_Sub2) this).anIntArray5765[argument_124_]
		     & 0x2)
		    == 0)
		    ((Node_Sub43) class59_sub43).anInt4223 = 0;
		else {
		    for (Node_Sub43 class59_sub43_127_
			     = ((Node_Sub43)
				((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
				    .aCyclicLinkedList_5750.getFirst());
			 class59_sub43_127_ != null;
			 class59_sub43_127_
			     = ((Node_Sub43)
				((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
				    .aCyclicLinkedList_5750.getNext())) {
			if ((((Node_Sub43) class59_sub43_127_).anInt4228
			     == ((Node_Sub43) class59_sub43).anInt4228)
			    && (((Node_Sub43) class59_sub43_127_).anInt4223
				< 0)
			    && class59_sub43_127_ != class59_sub43) {
			    ((Node_Sub43) class59_sub43).anInt4223 = 0;
			    break;
			}
		    }
		}
	    }
	}
    }
    
    final synchronized void method574(int argument_128_) {
	if (aClass175_5754.method2778()) {
	    int anLocalInt = (((Class175) aClass175_5754).anInt1302 * anInt5771
			      / Statics.anInt44);
	    do {
		long l = (long) anLocalInt * (long) argument_128_ + aLong5781;
		if (aLong5779 - l >= 0L) {
		    aLong5781 = l;
		    break;
		}
		int anLocalInt_129_ = (int) (((long) anLocalInt
					      + (-aLong5781 + aLong5779) + -1L)
					     / (long) anLocalInt);
		aLong5781 += (long) anLocalInt_129_ * (long) anLocalInt;
		aClass59_Sub9_Sub1_5780.method574(anLocalInt_129_);
		argument_128_ -= anLocalInt_129_;
		method611((byte) -125);
	    } while (aClass175_5754.method2778());
	}
	aClass59_Sub9_Sub1_5780.method574(argument_128_);
    }
    
    final boolean method620(Node_Sub43 argument_130_, int argument_131_,
			    int[] argument_132_, int argument_133_,
			    int argument_134_) {
	if (argument_134_ != -12)
	    method594(108, false);
	((Node_Sub43) argument_130_).anInt4210
	    = Statics.anInt44 / 100;
	if (((Node_Sub43) argument_130_).anInt4223 >= 0
	    && (((Node_Sub43) argument_130_).aClass59_Sub9_Sub4_4226 == null
		|| ((Node_Sub43) argument_130_).aClass59_Sub9_Sub4_4226
		       .method632())) {
	    argument_130_.method1081((byte) -111);
	    argument_130_.unlink();
	    if (((Node_Sub43) argument_130_).anInt4225 > 0
		&& (argument_130_
		    == (aClass59_Sub43ArrayArray5775
			[((Node_Sub43) argument_130_).anInt4228]
			[((Node_Sub43) argument_130_).anInt4225])))
		aClass59_Sub43ArrayArray5775
		    [((Node_Sub43) argument_130_).anInt4228]
		    [((Node_Sub43) argument_130_).anInt4225]
		    = null;
	    return true;
	}
	int anLocalInt = ((Node_Sub43) argument_130_).anInt4216;
	if (anLocalInt > 0) {
	    anLocalInt
		-= (int) (Math.pow(2.0,
				   ((double) (anIntArray5753
					      [(((Node_Sub43) argument_130_)
						.anInt4228)])
				    * 4.921259842519685E-4)) * 16.0
			  + 0.5);
	    if (anLocalInt < 0)
		anLocalInt = 0;
	    ((Node_Sub43) argument_130_).anInt4216 = anLocalInt;
	}
	((Node_Sub43) argument_130_).aClass59_Sub9_Sub4_4226
	    .method654(method588(argument_130_, (byte) 77));
	Class384 class384 = ((Node_Sub43) argument_130_).aClass384_4217;
	boolean anLocalBoolean = false;
	((Node_Sub43) argument_130_).anInt4219
	    += ((Class384) class384).anInt3252;
	((Node_Sub43) argument_130_).anInt4215++;
	double d
	    = ((double) ((((Node_Sub43) argument_130_).anInt4207 - 60 << 8)
			 + ((((Node_Sub43) argument_130_).anInt4221
			     * ((Node_Sub43) argument_130_).anInt4216)
			    >> 12))
	       * 5.086263020833333E-6);
	if (((Class384) class384).anInt3253 > 0) {
	    if (((Class384) class384).anInt3258 <= 0)
		((Node_Sub43) argument_130_).anInt4222 += 128;
	    else
		((Node_Sub43) argument_130_).anInt4222
		    += (int) (Math.pow(2.0, d * (double) (((Class384) class384)
							  .anInt3258)) * 128.0
			      + 0.5);
	    if ((((Node_Sub43) argument_130_).anInt4222
		 * ((Class384) class384).anInt3253)
		>= 819200)
		anLocalBoolean = true;
	}
	if (((Class384) class384).aByteArray3250 != null) {
	    if (((Class384) class384).anInt3257 <= 0)
		((Node_Sub43) argument_130_).anInt4212 += 128;
	    else
		((Node_Sub43) argument_130_).anInt4212
		    += (int) (Math.pow(2.0, (double) (((Class384) class384)
						      .anInt3257) * d) * 128.0
			      + 0.5);
	    for (/**/;
		 ((((Node_Sub43) argument_130_).anInt4208
		   < ((Class384) class384).aByteArray3250.length - 2)
		  && (((Node_Sub43) argument_130_).anInt4212
		      > ((((Class384) class384).aByteArray3250
			  [((Node_Sub43) argument_130_).anInt4208 + 2]) << 8
			 & 0xff00)));
		 ((Node_Sub43) argument_130_).anInt4208 += 2) {
		/* empty */
	    }
	    if ((((Node_Sub43) argument_130_).anInt4208
		 == ((Class384) class384).aByteArray3250.length - 2)
		&& (((Class384) class384).aByteArray3250
		    [((Node_Sub43) argument_130_).anInt4208 + 1]) == 0)
		anLocalBoolean = true;
	}
	if (((Node_Sub43) argument_130_).anInt4223 >= 0
	    && ((Class384) class384).aByteArray3256 != null
	    && ((((Node_Sub9_Sub2) this).anIntArray5765
		 [((Node_Sub43) argument_130_).anInt4228])
		& 0x1) == 0
	    && (((Node_Sub43) argument_130_).anInt4225 < 0
		|| (argument_130_
		    != (aClass59_Sub43ArrayArray5775
			[((Node_Sub43) argument_130_).anInt4228]
			[((Node_Sub43) argument_130_).anInt4225])))) {
	    if (((Class384) class384).anInt3247 > 0)
		((Node_Sub43) argument_130_).anInt4223
		    += (int) (Math.pow(2.0, d * (double) (((Class384) class384)
							  .anInt3247)) * 128.0
			      + 0.5);
	    else
		((Node_Sub43) argument_130_).anInt4223 += 128;
	    for (/**/;
		 ((((Node_Sub43) argument_130_).anInt4209
		   < ((Class384) class384).aByteArray3256.length - 2)
		  && (((((Class384) class384).aByteArray3256
			[((Node_Sub43) argument_130_).anInt4209 + 2])
		       & 0xff) << 8
		      < ((Node_Sub43) argument_130_).anInt4223));
		 ((Node_Sub43) argument_130_).anInt4209 += 2) {
		/* empty */
	    }
	    if (((Class384) class384).aByteArray3256.length - 2
		== ((Node_Sub43) argument_130_).anInt4209)
		anLocalBoolean = true;
	}
	if (anLocalBoolean) {
	    ((Node_Sub43) argument_130_).aClass59_Sub9_Sub4_4226
		.method668(((Node_Sub43) argument_130_).anInt4210);
	    if (argument_132_ != null)
		((Node_Sub43) argument_130_).aClass59_Sub9_Sub4_4226
		    .method578(argument_132_, argument_131_, argument_133_);
	    else
		((Node_Sub43) argument_130_).aClass59_Sub9_Sub4_4226
		    .method574(argument_133_);
	    if (((Node_Sub43) argument_130_).aClass59_Sub9_Sub4_4226
		    .method669())
		((Node_Sub9_Sub1) aClass59_Sub9_Sub1_5780)
		    .aClass59_Sub9_Sub3_5751.method629
		    (((Node_Sub43) argument_130_).aClass59_Sub9_Sub4_4226);
	    argument_130_.method1081((byte) -123);
	    if (((Node_Sub43) argument_130_).anInt4223 >= 0) {
		argument_130_.unlink();
		if (((Node_Sub43) argument_130_).anInt4225 > 0
		    && (argument_130_
			== (aClass59_Sub43ArrayArray5775
			    [((Node_Sub43) argument_130_).anInt4228]
			    [((Node_Sub43) argument_130_).anInt4225])))
		    aClass59_Sub43ArrayArray5775
			[((Node_Sub43) argument_130_).anInt4228]
			[((Node_Sub43) argument_130_).anInt4225]
			= null;
	    }
	    return true;
	}
	((Node_Sub43) argument_130_).aClass59_Sub9_Sub4_4226.method650
	    (((Node_Sub43) argument_130_).anInt4210,
	     method621(65565736, argument_130_),
	     method598(argument_130_, (byte) 78));
	return false;
    }
    
    private final int method621(int argument_135_,
				Node_Sub43 argument_136_) {
	if (anIntArray5778[((Node_Sub43) argument_136_).anInt4228] == 0)
	    return 0;
	Class384 class384 = ((Node_Sub43) argument_136_).aClass384_4217;
	int anLocalInt
	    = (((anIntArray5759[((Node_Sub43) argument_136_).anInt4228]
		 * anIntArray5760[((Node_Sub43) argument_136_).anInt4228])
		+ 4096)
	       >> 13);
	if (argument_135_ != 65565736)
	    return -13;
	anLocalInt = anLocalInt * anLocalInt + 16384 >> 15;
	anLocalInt
	    = (anLocalInt * ((Node_Sub43) argument_136_).anInt4214 + 16384
	       >> 15);
	anLocalInt = anInt5772 * anLocalInt + 128 >> 8;
	anLocalInt
	    = anLocalInt * anIntArray5778[(((Node_Sub43) argument_136_)
					   .anInt4228)] + 128 >> 8;
	if (((Class384) class384).anInt3253 > 0)
	    anLocalInt
		= (int) (((double) anLocalInt
			  * Math.pow(0.5,
				     ((double) ((Class384) class384).anInt3253
				      * ((double) ((Node_Sub43)
						   argument_136_).anInt4222
					 * 1.953125E-5))))
			 + 0.5);
	if (((Class384) class384).aByteArray3250 != null) {
	    int anLocalInt_137_ = ((Node_Sub43) argument_136_).anInt4212;
	    int anLocalInt_138_
		= (((Class384) class384).aByteArray3250
		   [((Node_Sub43) argument_136_).anInt4208 + 1]);
	    if (((Node_Sub43) argument_136_).anInt4208
		< ((Class384) class384).aByteArray3250.length - 2) {
		int anLocalInt_139_
		    = ((((Class384) class384).aByteArray3250
			[((Node_Sub43) argument_136_).anInt4208]) << 8
		       & 0xff00);
		int anLocalInt_140_
		    = (((((Class384) class384).aByteArray3250
			 [((Node_Sub43) argument_136_).anInt4208 + 2])
			& 0xff)
		       << 8);
		anLocalInt_138_
		    += ((anLocalInt_137_ - anLocalInt_139_)
			* (-anLocalInt_138_
			   + (((Class384) class384).aByteArray3250
			      [((Node_Sub43) argument_136_).anInt4208 + 3]))
			/ (anLocalInt_140_ - anLocalInt_139_));
	    }
	    anLocalInt = anLocalInt * anLocalInt_138_ + 32 >> 6;
	}
	if (((Node_Sub43) argument_136_).anInt4223 > 0
	    && ((Class384) class384).aByteArray3256 != null) {
	    int anLocalInt_141_ = ((Node_Sub43) argument_136_).anInt4223;
	    int anLocalInt_142_
		= (((Class384) class384).aByteArray3256
		   [((Node_Sub43) argument_136_).anInt4209 + 1]);
	    if (((Node_Sub43) argument_136_).anInt4209
		< ((Class384) class384).aByteArray3256.length - 2) {
		int anLocalInt_143_
		    = (((((Class384) class384).aByteArray3256
			 [((Node_Sub43) argument_136_).anInt4209])
			& 0xff)
		       << 8);
		int anLocalInt_144_
		    = (((((Class384) class384).aByteArray3256
			 [((Node_Sub43) argument_136_).anInt4209 + 2])
			& 0xff)
		       << 8);
		anLocalInt_142_
		    += ((-anLocalInt_142_
			 + (((Class384) class384).aByteArray3256
			    [((Node_Sub43) argument_136_).anInt4209 + 3]))
			* (anLocalInt_141_ - anLocalInt_143_)
			/ (-anLocalInt_143_ + anLocalInt_144_));
	    }
	    anLocalInt = anLocalInt_142_ * anLocalInt + 32 >> 6;
	}
	return anLocalInt;
    }
    
    final synchronized Node_Sub9 method577() {
	return null;
    }
    
    final synchronized void method622(int argument_145_) {
	for (Node_Sub6 class59_sub6
		 = (Node_Sub6) aJagexHashMap_5766.first(0);
	     class59_sub6 != null;
	     class59_sub6 = (Node_Sub6) aJagexHashMap_5766.next())
	    class59_sub6.method562(1);
    }
    
    public Node_Sub9_Sub2() {
	((Node_Sub9_Sub2) this).anIntArray5752 = new int[16];
	((Node_Sub9_Sub2) this).anIntArray5758 = new int[16];
	anIntArray5760 = new int[16];
	anIntArray5756 = new int[16];
	anIntArray5753 = new int[16];
	anIntArray5759 = new int[16];
	anIntArray5757 = new int[16];
	aClass59_Sub43ArrayArray5764 = new Node_Sub43[16][128];
	anIntArray5755 = new int[16];
	anIntArray5761 = new int[16];
	anIntArray5767 = new int[16];
	anIntArray5768 = new int[16];
	anIntArray5774 = new int[16];
	anIntArray5773 = new int[16];
	aClass59_Sub43ArrayArray5775 = new Node_Sub43[16][128];
	anInt5772 = 256;
	anInt5771 = 1000000;
	anIntArray5763 = new int[16];
	((Node_Sub9_Sub2) this).anIntArray5765 = new int[16];
	anIntArray5778 = new int[16];
	aClass175_5754 = new Class175();
	aClass59_Sub9_Sub1_5780 = new Node_Sub9_Sub1(this);
	aJagexHashMap_5766 = new JagexHashMap(128);
	method610(256, -1, 0);
	method587(true, -125);
    }
    
    Node_Sub9_Sub2(Node_Sub9_Sub2 argument_146_) {
	((Node_Sub9_Sub2) this).anIntArray5752 = new int[16];
	((Node_Sub9_Sub2) this).anIntArray5758 = new int[16];
	anIntArray5760 = new int[16];
	anIntArray5756 = new int[16];
	anIntArray5753 = new int[16];
	anIntArray5759 = new int[16];
	anIntArray5757 = new int[16];
	aClass59_Sub43ArrayArray5764 = new Node_Sub43[16][128];
	anIntArray5755 = new int[16];
	anIntArray5761 = new int[16];
	anIntArray5767 = new int[16];
	anIntArray5768 = new int[16];
	anIntArray5774 = new int[16];
	anIntArray5773 = new int[16];
	aClass59_Sub43ArrayArray5775 = new Node_Sub43[16][128];
	anInt5772 = 256;
	anInt5771 = 1000000;
	anIntArray5763 = new int[16];
	((Node_Sub9_Sub2) this).anIntArray5765 = new int[16];
	anIntArray5778 = new int[16];
	aClass175_5754 = new Class175();
	aClass59_Sub9_Sub1_5780 = new Node_Sub9_Sub1(this);
	aJagexHashMap_5766 = argument_146_.aJagexHashMap_5766;
	method610(256, -1, 0);
	method587(true, -10);
    }
}
