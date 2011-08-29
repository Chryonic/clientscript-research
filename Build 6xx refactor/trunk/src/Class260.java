/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class260
{
    static boolean aBoolean2026 = false;
    static Class166 aClass166_2027;
    int anInt2028;
    int anInt2029;
    int anInt2030;
    static String[] aStringArray2031 = new String[200];
    boolean aBoolean2032 = true;
    int anInt2033;
    private int anInt2034;
    boolean aBoolean2035 = true;
    int anInt2036;
    int anInt2037;
    
    static final void method3311(int argument, int argument_0_,
				 int argument_1_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(12, argument_0_ + 9615,
            (long) argument);
	if (argument_0_ != 3560)
	    aClass166_2027 = null;
	class59_sub51_sub3.method1182(argument_0_ ^ ~0xd81);
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231 = argument_1_;
    }
    
    static final void method3312(byte argument, int argument_2_,
				 Node_Sub28_Sub1 argument_3_) {
	boolean anLocalBoolean = argument_3_.method850(-1, 1) == 1;
	if (anLocalBoolean)
	    Class256_Sub1.anIntArray5620[DoublyLinkedNodeP2_Sub2_Sub1_Sub2.anInt6562++]
		= argument_2_;
	int anLocalInt = argument_3_.method850(-1, 2);
	DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
	    = Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[argument_2_];
	if (anLocalInt == 0) {
	    if (anLocalBoolean)
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) class104_sub2_sub2_sub5_sub2)
		    .aBoolean6864
		    = false;
	    else {
		if (Class64.anInt451 == argument_2_)
		    throw new RuntimeException("s:lr");
		Class239 class239
		    = (Node_Sub31_Sub15_Sub1.aClass239Array6640[argument_2_]
		       = new Class239());
		((Class239) class239).anInt1740
		    = (((((Entity)
			  class104_sub2_sub2_sub5_sub2).pathZ[0]
			 + MapRelated.baseZ)
			>> 6)
		       + (MapRelated.baseX + (((Entity)
						 class104_sub2_sub2_sub5_sub2)
						.pathX[0])
			  >> 6 << 14)
		       + ((((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2)
			   .lightingHL)
			  << 28));
		if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		     class104_sub2_sub2_sub5_sub2).anInt6862
		    == -1)
		    ((Class239) class239).anInt1738
			= ((Entity)
			   class104_sub2_sub2_sub5_sub2)
			      .aClass271_6780.method3372(2);
		else
		    ((Class239) class239).anInt1738
			= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
			   class104_sub2_sub2_sub5_sub2).anInt6862;
		((Class239) class239).aBoolean1741
		    = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		       class104_sub2_sub2_sub5_sub2).aBoolean6856;
		((Class239) class239).anInt1739
		    = (((Entity) class104_sub2_sub2_sub5_sub2)
		       .anInt6725);
		((Class239) class239).aBoolean1737
		    = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		       class104_sub2_sub2_sub5_sub2).aBoolean6852;
		if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		     class104_sub2_sub2_sub5_sub2).anInt6863
		    > 0)
		    Statics.method1505(class104_sub2_sub2_sub5_sub2, -9269);
		Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[argument_2_]
		    = null;
		if (argument_3_.method850(-1, 1) != 0)
		    Class133_Sub1.method2450(argument_2_, argument_3_, 0);
	    }
	} else if (anLocalInt == 1) {
	    int anLocalInt_4_ = argument_3_.method850(-1, 3);
	    int anLocalInt_5_
		= (((Entity) class104_sub2_sub2_sub5_sub2)
		   .pathX[0]);
	    int anLocalInt_6_
		= (((Entity) class104_sub2_sub2_sub5_sub2)
		   .pathZ[0]);
	    if (anLocalInt_4_ != 0) {
		if (anLocalInt_4_ != 1) {
		    if (anLocalInt_4_ == 2) {
			anLocalInt_6_--;
			anLocalInt_5_++;
		    } else if (anLocalInt_4_ == 3)
			anLocalInt_5_--;
		    else if (anLocalInt_4_ == 4)
			anLocalInt_5_++;
		    else if (anLocalInt_4_ != 5) {
			if (anLocalInt_4_ != 6) {
			    if (anLocalInt_4_ == 7) {
				anLocalInt_6_++;
				anLocalInt_5_++;
			    }
			} else
			    anLocalInt_6_++;
		    } else {
			anLocalInt_6_++;
			anLocalInt_5_--;
		    }
		} else
		    anLocalInt_6_--;
	    } else {
		anLocalInt_5_--;
		anLocalInt_6_--;
	    }
	    if (!anLocalBoolean)
		class104_sub2_sub2_sub5_sub2.method1859
		    (anLocalInt_5_, -105, anLocalInt_6_,
		     DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aByteArray6570[argument_2_]);
	    else {
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) class104_sub2_sub2_sub5_sub2)
		    .anInt6845
		    = anLocalInt_6_;
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) class104_sub2_sub2_sub5_sub2)
		    .anInt6849
		    = anLocalInt_5_;
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) class104_sub2_sub2_sub5_sub2)
		    .aBoolean6864
		    = true;
	    }
	} else if (anLocalInt == 2) {
	    int anLocalInt_7_ = argument_3_.method850(-1, 4);
	    int anLocalInt_8_
		= (((Entity) class104_sub2_sub2_sub5_sub2)
		   .pathX[0]);
	    int anLocalInt_9_
		= (((Entity) class104_sub2_sub2_sub5_sub2)
		   .pathZ[0]);
	    if (anLocalInt_7_ == 0) {
		anLocalInt_9_ -= 2;
		anLocalInt_8_ -= 2;
	    } else if (anLocalInt_7_ != 1) {
		if (anLocalInt_7_ == 2)
		    anLocalInt_9_ -= 2;
		else if (anLocalInt_7_ != 3) {
		    if (anLocalInt_7_ != 4) {
			if (anLocalInt_7_ != 5) {
			    if (anLocalInt_7_ == 6) {
				anLocalInt_8_ += 2;
				anLocalInt_9_--;
			    } else if (anLocalInt_7_ == 7)
				anLocalInt_8_ -= 2;
			    else if (anLocalInt_7_ == 8)
				anLocalInt_8_ += 2;
			    else if (anLocalInt_7_ != 9) {
				if (anLocalInt_7_ != 10) {
				    if (anLocalInt_7_ != 11) {
					if (anLocalInt_7_ != 12) {
					    if (anLocalInt_7_ != 13) {
						if (anLocalInt_7_ != 14) {
						    if (anLocalInt_7_ == 15) {
							anLocalInt_9_ += 2;
							anLocalInt_8_ += 2;
						    }
						} else {
						    anLocalInt_8_++;
						    anLocalInt_9_ += 2;
						}
					    } else
						anLocalInt_9_ += 2;
					} else {
					    anLocalInt_8_--;
					    anLocalInt_9_ += 2;
					}
				    } else {
					anLocalInt_8_ -= 2;
					anLocalInt_9_ += 2;
				    }
				} else {
				    anLocalInt_9_++;
				    anLocalInt_8_ += 2;
				}
			    } else {
				anLocalInt_9_++;
				anLocalInt_8_ -= 2;
			    }
			} else {
			    anLocalInt_9_--;
			    anLocalInt_8_ -= 2;
			}
		    } else {
			anLocalInt_8_ += 2;
			anLocalInt_9_ -= 2;
		    }
		} else {
		    anLocalInt_9_ -= 2;
		    anLocalInt_8_++;
		}
	    } else {
		anLocalInt_9_ -= 2;
		anLocalInt_8_--;
	    }
	    if (!anLocalBoolean)
		class104_sub2_sub2_sub5_sub2.method1859
		    (anLocalInt_8_, -124, anLocalInt_9_,
		     DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aByteArray6570[argument_2_]);
	    else {
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) class104_sub2_sub2_sub5_sub2)
		    .aBoolean6864
		    = true;
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) class104_sub2_sub2_sub5_sub2)
		    .anInt6849
		    = anLocalInt_8_;
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) class104_sub2_sub2_sub5_sub2)
		    .anInt6845
		    = anLocalInt_9_;
	    }
	} else {
	    int anLocalInt_10_ = argument_3_.method850(-1, 1);
	    if (anLocalInt_10_ == 0) {
		int anLocalInt_11_ = argument_3_.method850(-1, 12);
		int anLocalInt_12_ = anLocalInt_11_ >> 10;
		int anLocalInt_13_ = (anLocalInt_11_ & 0x3f8) >> 5;
		if (anLocalInt_13_ > 15)
		    anLocalInt_13_ -= 32;
		int anLocalInt_14_ = anLocalInt_11_ & 0x1f;
		if (anLocalInt_14_ > 15)
		    anLocalInt_14_ -= 32;
		int anLocalInt_15_
		    = (((Entity) class104_sub2_sub2_sub5_sub2)
		       .pathX[0]) + anLocalInt_13_;
		int anLocalInt_16_
		    = (anLocalInt_14_
		       + ((Entity)
			  class104_sub2_sub2_sub5_sub2).pathZ[0]);
		if (anLocalBoolean) {
		    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		     class104_sub2_sub2_sub5_sub2).anInt6845
			= anLocalInt_16_;
		    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		     class104_sub2_sub2_sub5_sub2).anInt6849
			= anLocalInt_15_;
		    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		     class104_sub2_sub2_sub5_sub2).aBoolean6864
			= true;
		} else
		    class104_sub2_sub2_sub5_sub2.method1859
			(anLocalInt_15_, -116, anLocalInt_16_,
			 DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aByteArray6570[argument_2_]);
		((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).lightingHL
		    = ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).aByte4509
		    = (byte) ((((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2)
			       .lightingHL) + anLocalInt_12_
			      & 0x3);
		if (Class274.method3388(anLocalInt_15_, anLocalInt_16_, 1))
		    ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).aByte4509++;
		if (Class64.anInt451 == argument_2_) {
		    if ((((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2)
			 .lightingHL)
			!= Class176.anInt1308)
			Class18.aBoolean124 = true;
		    Class176.anInt1308
			= (((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2)
			   .lightingHL);
		}
	    } else {
		int anLocalInt_17_ = argument_3_.method850(-1, 30);
		int anLocalInt_18_ = 44 / ((argument - 5) / 55);
		int anLocalInt_19_ = anLocalInt_17_ >> 28;
		int anLocalInt_20_ = (anLocalInt_17_ & 0xfffce96) >> 14;
		int anLocalInt_21_ = anLocalInt_17_ & 0x3fff;
		int anLocalInt_22_
		    = (-MapRelated.baseX
		       + (MapRelated.baseX + ((((Entity)
						  class104_sub2_sub2_sub5_sub2)
						 .pathX[0])
						+ anLocalInt_20_)
			  & 0x3fff));
		int anLocalInt_23_
		    = ((anLocalInt_21_ + (MapRelated.baseZ
					  + (((Entity)
					      class104_sub2_sub2_sub5_sub2)
					     .pathZ[0]))
			& 0x3fff)
		       - MapRelated.baseZ);
		if (anLocalBoolean) {
		    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		     class104_sub2_sub2_sub5_sub2).anInt6845
			= anLocalInt_23_;
		    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		     class104_sub2_sub2_sub5_sub2).aBoolean6864
			= true;
		    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		     class104_sub2_sub2_sub5_sub2).anInt6849
			= anLocalInt_22_;
		} else
		    class104_sub2_sub2_sub5_sub2.method1859
			(anLocalInt_22_, -123, anLocalInt_23_,
			 DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aByteArray6570[argument_2_]);
		((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).lightingHL
		    = ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).aByte4509
		    = (byte) (anLocalInt_19_ + (((DoublyLinkedNodeP2_Sub2)
						 class104_sub2_sub2_sub5_sub2)
						.lightingHL)
			      & 0x3);
		if (Class274.method3388(anLocalInt_22_, anLocalInt_23_, 1))
		    ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).aByte4509++;
		if (Class64.anInt451 == argument_2_)
		    Class176.anInt1308
			= (((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2)
			   .lightingHL);
	    }
	}
    }
    
    private final void method3313(int argument_24_, Packet argument_25_,
				  byte argument_26_) {
	if (argument_24_ != 1) {
	    if (argument_24_ == 2) {
		((Class260) this).anInt2029 = argument_25_.g2();
		if (((Class260) this).anInt2029 == 65535)
		    ((Class260) this).anInt2029 = -1;
	    } else if (argument_24_ == 3)
		((Class260) this).anInt2037 = argument_25_.g2() << 2;
	    else if (argument_24_ == 4)
		((Class260) this).aBoolean2032 = false;
	    else if (argument_24_ == 5)
		((Class260) this).aBoolean2035 = false;
	} else {
	    anInt2034 = argument_25_.g3_dupl();
	    method3314(-98, anInt2034);
	}
	if (argument_26_ > -20)
	    method3318((byte) 91);
    }
    
    private final void method3314(int argument_27_, int argument_28_) {
	double d = (double) ((argument_28_ & 0xff397f) >> 16) / 256.0;
	double d_29_ = (double) ((argument_28_ & 0xffbf) >> 8) / 256.0;
	double d_30_ = (double) (argument_28_ & 0xff) / 256.0;
	double d_31_ = d;
	if (d_31_ > d_29_)
	    d_31_ = d_29_;
	if (d_30_ < d_31_)
	    d_31_ = d_30_;
	double d_32_ = d;
	if (d_32_ < d_29_)
	    d_32_ = d_29_;
	int anLocalInt = -47 % ((-11 - argument_27_) / 55);
	if (d_30_ > d_32_)
	    d_32_ = d_30_;
	double d_33_ = 0.0;
	double d_34_ = 0.0;
	double d_35_ = (d_31_ + d_32_) / 2.0;
	if (d_32_ != d_31_) {
	    if (d_35_ < 0.5)
		d_34_ = (-d_31_ + d_32_) / (d_32_ + d_31_);
	    if (d_35_ >= 0.5)
		d_34_ = (d_32_ - d_31_) / (2.0 - d_32_ - d_31_);
	    if (d != d_32_) {
		if (d_29_ == d_32_)
		    d_33_ = (d_30_ - d) / (d_32_ - d_31_) + 2.0;
		else if (d_30_ == d_32_)
		    d_33_ = (-d_29_ + d) / (-d_31_ + d_32_) + 4.0;
	    } else
		d_33_ = (d_29_ - d_30_) / (-d_31_ + d_32_);
	}
	d_33_ /= 6.0;
	((Class260) this).anInt2028 = (int) (d_35_ * 256.0);
	((Class260) this).anInt2036 = (int) (d_34_ * 256.0);
	if (((Class260) this).anInt2028 < 0)
	    ((Class260) this).anInt2028 = 0;
	else if (((Class260) this).anInt2028 > 255)
	    ((Class260) this).anInt2028 = 255;
	if (!(d_35_ > 0.5))
	    ((Class260) this).anInt2033 = (int) (d_34_ * d_35_ * 512.0);
	else
	    ((Class260) this).anInt2033
		= (int) ((1.0 - d_35_) * d_34_ * 512.0);
	if (((Class260) this).anInt2036 >= 0) {
	    if (((Class260) this).anInt2036 > 255)
		((Class260) this).anInt2036 = 255;
	} else
	    ((Class260) this).anInt2036 = 0;
	if (((Class260) this).anInt2033 < 1)
	    ((Class260) this).anInt2033 = 1;
	((Class260) this).anInt2030
	    = (int) (d_33_ * (double) ((Class260) this).anInt2033);
    }
    
    final void method3315(int argument_36_, Packet argument_37_) {
	if (argument_36_ != 2)
	    ((Class260) this).anInt2028 = -113;
	for (;;) {
	    int anLocalInt = argument_37_.g1();
	    if (anLocalInt == 0)
		break;
	    method3313(anLocalInt, argument_37_, (byte) -96);
	}
    }
    
    static final int method3316(byte argument, int argument_38_,
				int argument_39_) {
	argument_38_ = (argument_39_ & 0x7f) * argument_38_ >> 7;
	if (argument_38_ < 2)
	    argument_38_ = 2;
	else if (argument_38_ > 126)
	    argument_38_ = 126;
	return argument_38_ + (argument_39_ & 0xff80);
    }
    
    static final Class_aa_Sub1 method3317
	(GlToolkit argument, int argument_40_, int[] argument_41_,
	 int argument_42_, int[] argument_43_, int argument_44_) {
	byte[] anLocalInts = new byte[argument_40_ * argument_42_];
	for (int anLocalInt = argument_44_; anLocalInt < argument_40_;
	     anLocalInt++) {
	    int anLocalInt_45_
		= argument_42_ * anLocalInt + argument_41_[anLocalInt];
	    for (int anLocalInt_46_ = 0;
		 anLocalInt_46_ < argument_43_[anLocalInt]; anLocalInt_46_++)
		anLocalInts[anLocalInt_45_++] = (byte) -1;
	}
	return new Class_aa_Sub1(argument, argument_42_, argument_40_,
				 anLocalInts);
    }
    
    public static void method3318(byte argument) {
	aStringArray2031 = null;
	aClass166_2027 = null;
    }
    
    static final void method3319(int argument) {
	Applet_Sub1.loadingBarFont = null;
	Applet_Sub1.backBuffer = null;
    }
    
    public Class260() {
	anInt2034 = 0;
	((Class260) this).anInt2037 = 512;
	((Class260) this).anInt2029 = -1;
    }
    
    static {
	aClass166_2027 = new Class166(60, 6);
    }
}
