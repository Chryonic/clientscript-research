/* Class59_Sub9_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub9_Sub4 extends Node_Sub9
{
    private int anInt5792;
    private int anInt5793;
    private int anInt5794;
    private int anInt5795;
    private boolean aBoolean5796;
    private int anInt5797;
    private int anInt5798;
    private int anInt5799;
    private int anInt5800;
    private int anInt5801;
    private int anInt5802;
    private int anInt5803;
    private int anInt5804;
    private int anInt5805;
    private int anInt5806;
    
    static final Node_Sub9_Sub4 method631(Node_Sub40_Sub1 argument,
					     int argument_0_, int argument_1_,
					     int argument_2_) {
	if (((Node_Sub40_Sub1) argument).aByteArray6136 == null
	    || ((Node_Sub40_Sub1) argument).aByteArray6136.length == 0)
	    return null;
	return new Node_Sub9_Sub4(argument, argument_0_, argument_1_,
				     argument_2_);
    }
    
    final boolean method632() {
	if (anInt5798 >= 0
	    && anInt5798 < (((Node_Sub40_Sub1) (Node_Sub40_Sub1)
			     ((Node_Sub9) this).aClass59_Sub40_3930)
			    .aByteArray6136).length << 8)
	    return false;
	return true;
    }
    
    private static final int method633
	(int argument, byte[] argument_3_, int[] argument_4_, int argument_5_,
	 int argument_6_, int argument_7_, int argument_8_, int argument_9_,
	 int argument_10_, int argument_11_, int argument_12_,
	 int argument_13_, Node_Sub9_Sub4 argument_14_) {
	argument_5_ >>= 8;
	argument_13_ >>= 8;
	argument_7_ <<= 2;
	argument_8_ <<= 2;
	argument_9_ <<= 2;
	argument_10_ <<= 2;
	if ((argument_11_ = argument_6_ + argument_13_ - argument_5_)
	    > argument_12_)
	    argument_11_ = argument_12_;
	argument_14_.anInt5797
	    += argument_14_.anInt5801 * (argument_11_ - argument_6_);
	argument_6_ <<= 1;
	argument_11_ <<= 1;
	argument_11_ -= 6;
	while (argument_6_ < argument_11_) {
	    argument = argument_3_[argument_5_++];
	    argument_4_[argument_6_++] += argument * argument_7_;
	    argument_7_ += argument_9_;
	    argument_4_[argument_6_++] += argument * argument_8_;
	    argument_8_ += argument_10_;
	    argument = argument_3_[argument_5_++];
	    argument_4_[argument_6_++] += argument * argument_7_;
	    argument_7_ += argument_9_;
	    argument_4_[argument_6_++] += argument * argument_8_;
	    argument_8_ += argument_10_;
	    argument = argument_3_[argument_5_++];
	    argument_4_[argument_6_++] += argument * argument_7_;
	    argument_7_ += argument_9_;
	    argument_4_[argument_6_++] += argument * argument_8_;
	    argument_8_ += argument_10_;
	    argument = argument_3_[argument_5_++];
	    argument_4_[argument_6_++] += argument * argument_7_;
	    argument_7_ += argument_9_;
	    argument_4_[argument_6_++] += argument * argument_8_;
	    argument_8_ += argument_10_;
	}
	argument_11_ += 6;
	while (argument_6_ < argument_11_) {
	    argument = argument_3_[argument_5_++];
	    argument_4_[argument_6_++] += argument * argument_7_;
	    argument_7_ += argument_9_;
	    argument_4_[argument_6_++] += argument * argument_8_;
	    argument_8_ += argument_10_;
	}
	argument_14_.anInt5793 = argument_7_ >> 2;
	argument_14_.anInt5804 = argument_8_ >> 2;
	argument_14_.anInt5798 = argument_5_ << 8;
	return argument_6_ >> 1;
    }
    
    private final void method634() {
	anInt5797 = anInt5800;
	anInt5793 = method642(anInt5800, anInt5806);
	anInt5804 = method645(anInt5800, anInt5806);
    }
    
    private static final int method635
	(int argument, byte[] argument_15_, int[] argument_16_,
	 int argument_17_, int argument_18_, int argument_19_,
	 int argument_20_, int argument_21_, int argument_22_,
	 int argument_23_, int argument_24_, int argument_25_,
	 Node_Sub9_Sub4 argument_26_) {
	argument_17_ >>= 8;
	argument_25_ >>= 8;
	argument_19_ <<= 2;
	argument_20_ <<= 2;
	argument_21_ <<= 2;
	argument_22_ <<= 2;
	if ((argument_23_ = argument_18_ + argument_17_ - (argument_25_ - 1))
	    > argument_24_)
	    argument_23_ = argument_24_;
	argument_26_.anInt5797
	    += argument_26_.anInt5801 * (argument_23_ - argument_18_);
	argument_18_ <<= 1;
	argument_23_ <<= 1;
	argument_23_ -= 6;
	while (argument_18_ < argument_23_) {
	    argument = argument_15_[argument_17_--];
	    argument_16_[argument_18_++] += argument * argument_19_;
	    argument_19_ += argument_21_;
	    argument_16_[argument_18_++] += argument * argument_20_;
	    argument_20_ += argument_22_;
	    argument = argument_15_[argument_17_--];
	    argument_16_[argument_18_++] += argument * argument_19_;
	    argument_19_ += argument_21_;
	    argument_16_[argument_18_++] += argument * argument_20_;
	    argument_20_ += argument_22_;
	    argument = argument_15_[argument_17_--];
	    argument_16_[argument_18_++] += argument * argument_19_;
	    argument_19_ += argument_21_;
	    argument_16_[argument_18_++] += argument * argument_20_;
	    argument_20_ += argument_22_;
	    argument = argument_15_[argument_17_--];
	    argument_16_[argument_18_++] += argument * argument_19_;
	    argument_19_ += argument_21_;
	    argument_16_[argument_18_++] += argument * argument_20_;
	    argument_20_ += argument_22_;
	}
	argument_23_ += 6;
	while (argument_18_ < argument_23_) {
	    argument = argument_15_[argument_17_--];
	    argument_16_[argument_18_++] += argument * argument_19_;
	    argument_19_ += argument_21_;
	    argument_16_[argument_18_++] += argument * argument_20_;
	    argument_20_ += argument_22_;
	}
	argument_26_.anInt5793 = argument_19_ >> 2;
	argument_26_.anInt5804 = argument_20_ >> 2;
	argument_26_.anInt5798 = argument_17_ << 8;
	return argument_18_ >> 1;
    }
    
    private static final int method636
	(int argument, byte[] argument_27_, int[] argument_28_,
	 int argument_29_, int argument_30_, int argument_31_,
	 int argument_32_, int argument_33_, int argument_34_,
	 int argument_35_, Node_Sub9_Sub4 argument_36_) {
	argument_29_ >>= 8;
	argument_35_ >>= 8;
	argument_31_ <<= 2;
	argument_32_ <<= 2;
	if ((argument_33_ = argument_30_ + argument_29_ - (argument_35_ - 1))
	    > argument_34_)
	    argument_33_ = argument_34_;
	argument_30_ <<= 1;
	argument_33_ <<= 1;
	argument_33_ -= 6;
	while (argument_30_ < argument_33_) {
	    argument = argument_27_[argument_29_--];
	    argument_28_[argument_30_++] += argument * argument_31_;
	    argument_28_[argument_30_++] += argument * argument_32_;
	    argument = argument_27_[argument_29_--];
	    argument_28_[argument_30_++] += argument * argument_31_;
	    argument_28_[argument_30_++] += argument * argument_32_;
	    argument = argument_27_[argument_29_--];
	    argument_28_[argument_30_++] += argument * argument_31_;
	    argument_28_[argument_30_++] += argument * argument_32_;
	    argument = argument_27_[argument_29_--];
	    argument_28_[argument_30_++] += argument * argument_31_;
	    argument_28_[argument_30_++] += argument * argument_32_;
	}
	argument_33_ += 6;
	while (argument_30_ < argument_33_) {
	    argument = argument_27_[argument_29_--];
	    argument_28_[argument_30_++] += argument * argument_31_;
	    argument_28_[argument_30_++] += argument * argument_32_;
	}
	argument_36_.anInt5798 = argument_29_ << 8;
	return argument_30_ >> 1;
    }
    
    private static final int method637
	(byte[] argument, int[] argument_37_, int argument_38_,
	 int argument_39_, int argument_40_, int argument_41_,
	 int argument_42_, int argument_43_, Node_Sub9_Sub4 argument_44_) {
	argument_38_ >>= 8;
	argument_43_ >>= 8;
	argument_40_ <<= 2;
	if ((argument_41_ = argument_39_ + argument_38_ - (argument_43_ - 1))
	    > argument_42_)
	    argument_41_ = argument_42_;
	argument_41_ -= 3;
	while (argument_39_ < argument_41_) {
	    argument_37_[argument_39_++]
		+= argument[argument_38_--] * argument_40_;
	    argument_37_[argument_39_++]
		+= argument[argument_38_--] * argument_40_;
	    argument_37_[argument_39_++]
		+= argument[argument_38_--] * argument_40_;
	    argument_37_[argument_39_++]
		+= argument[argument_38_--] * argument_40_;
	}
	argument_41_ += 3;
	while (argument_39_ < argument_41_)
	    argument_37_[argument_39_++]
		+= argument[argument_38_--] * argument_40_;
	argument_44_.anInt5798 = argument_38_ << 8;
	return argument_39_;
    }
    
    final synchronized void method638(int argument_45_) {
	int anLocalInt = ((((Node_Sub40_Sub1) (Node_Sub40_Sub1)
			    ((Node_Sub9) this).aClass59_Sub40_3930)
			   .aByteArray6136).length
			  << 8);
	if (argument_45_ < -1)
	    argument_45_ = -1;
	if (argument_45_ > anLocalInt)
	    argument_45_ = anLocalInt;
	anInt5798 = argument_45_;
    }
    
    private static final int method639
	(byte[] argument, int[] argument_46_, int argument_47_,
	 int argument_48_, int argument_49_, int argument_50_,
	 int argument_51_, int argument_52_, int argument_53_,
	 Node_Sub9_Sub4 argument_54_) {
	argument_47_ >>= 8;
	argument_53_ >>= 8;
	argument_49_ <<= 2;
	argument_50_ <<= 2;
	if ((argument_51_ = argument_48_ + argument_53_ - argument_47_)
	    > argument_52_)
	    argument_51_ = argument_52_;
	argument_54_.anInt5793
	    += argument_54_.anInt5794 * (argument_51_ - argument_48_);
	argument_54_.anInt5804
	    += argument_54_.anInt5803 * (argument_51_ - argument_48_);
	argument_51_ -= 3;
	while (argument_48_ < argument_51_) {
	    argument_46_[argument_48_++]
		+= argument[argument_47_++] * argument_49_;
	    argument_49_ += argument_50_;
	    argument_46_[argument_48_++]
		+= argument[argument_47_++] * argument_49_;
	    argument_49_ += argument_50_;
	    argument_46_[argument_48_++]
		+= argument[argument_47_++] * argument_49_;
	    argument_49_ += argument_50_;
	    argument_46_[argument_48_++]
		+= argument[argument_47_++] * argument_49_;
	    argument_49_ += argument_50_;
	}
	argument_51_ += 3;
	while (argument_48_ < argument_51_) {
	    argument_46_[argument_48_++]
		+= argument[argument_47_++] * argument_49_;
	    argument_49_ += argument_50_;
	}
	argument_54_.anInt5797 = argument_49_ >> 2;
	argument_54_.anInt5798 = argument_47_ << 8;
	return argument_48_;
    }
    
    private static final int method640
	(int argument, byte[] argument_55_, int[] argument_56_,
	 int argument_57_, int argument_58_, int argument_59_,
	 int argument_60_, int argument_61_, int argument_62_,
	 int argument_63_, Node_Sub9_Sub4 argument_64_) {
	argument_57_ >>= 8;
	argument_63_ >>= 8;
	argument_59_ <<= 2;
	argument_60_ <<= 2;
	if ((argument_61_ = argument_58_ + argument_63_ - argument_57_)
	    > argument_62_)
	    argument_61_ = argument_62_;
	argument_58_ <<= 1;
	argument_61_ <<= 1;
	argument_61_ -= 6;
	while (argument_58_ < argument_61_) {
	    argument = argument_55_[argument_57_++];
	    argument_56_[argument_58_++] += argument * argument_59_;
	    argument_56_[argument_58_++] += argument * argument_60_;
	    argument = argument_55_[argument_57_++];
	    argument_56_[argument_58_++] += argument * argument_59_;
	    argument_56_[argument_58_++] += argument * argument_60_;
	    argument = argument_55_[argument_57_++];
	    argument_56_[argument_58_++] += argument * argument_59_;
	    argument_56_[argument_58_++] += argument * argument_60_;
	    argument = argument_55_[argument_57_++];
	    argument_56_[argument_58_++] += argument * argument_59_;
	    argument_56_[argument_58_++] += argument * argument_60_;
	}
	argument_61_ += 6;
	while (argument_58_ < argument_61_) {
	    argument = argument_55_[argument_57_++];
	    argument_56_[argument_58_++] += argument * argument_59_;
	    argument_56_[argument_58_++] += argument * argument_60_;
	}
	argument_64_.anInt5798 = argument_57_ << 8;
	return argument_58_ >> 1;
    }
    
    private static final int method641
	(int argument, int argument_65_, byte[] argument_66_,
	 int[] argument_67_, int argument_68_, int argument_69_,
	 int argument_70_, int argument_71_, int argument_72_,
	 int argument_73_, int argument_74_, Node_Sub9_Sub4 argument_75_,
	 int argument_76_, int argument_77_) {
	if (argument_76_ == 0
	    || (argument_72_ = argument_69_ + ((argument_74_ + 256
						- argument_68_ + argument_76_)
					       / argument_76_)) > argument_73_)
	    argument_72_ = argument_73_;
	argument_69_ <<= 1;
	argument_72_ <<= 1;
	while (argument_69_ < argument_72_) {
	    argument_65_ = argument_68_ >> 8;
	    argument = argument_66_[argument_65_ - 1];
	    argument = (argument << 8) + (argument_66_[argument_65_]
					  - argument) * (argument_68_ & 0xff);
	    argument_67_[argument_69_++] += argument * argument_70_ >> 6;
	    argument_67_[argument_69_++] += argument * argument_71_ >> 6;
	    argument_68_ += argument_76_;
	}
	if (argument_76_ == 0
	    || ((argument_72_
		 = (argument_69_ >> 1) + (argument_74_ - argument_68_
					  + argument_76_) / argument_76_)
		> argument_73_))
	    argument_72_ = argument_73_;
	argument_72_ <<= 1;
	argument_65_ = argument_77_;
	while (argument_69_ < argument_72_) {
	    argument = (argument_65_ << 8) + ((argument_66_[argument_68_ >> 8]
					       - argument_65_)
					      * (argument_68_ & 0xff));
	    argument_67_[argument_69_++] += argument * argument_70_ >> 6;
	    argument_67_[argument_69_++] += argument * argument_71_ >> 6;
	    argument_68_ += argument_76_;
	}
	argument_75_.anInt5798 = argument_68_;
	return argument_69_ >> 1;
    }
    
    final synchronized void method578(int[] argument_78_, int argument_79_,
				      int argument_80_) {
	if (anInt5800 == 0 && anInt5792 == 0)
	    method574(argument_80_);
	else {
	    Node_Sub40_Sub1 class59_sub40_sub1
		= ((Node_Sub40_Sub1)
		   ((Node_Sub9) this).aClass59_Sub40_3930);
	    int anLocalInt = anInt5802 << 8;
	    int anLocalInt_81_ = anInt5799 << 8;
	    int anLocalInt_82_ = ((((Node_Sub40_Sub1) class59_sub40_sub1)
				   .aByteArray6136).length
				  << 8);
	    int anLocalInt_83_ = anLocalInt_81_ - anLocalInt;
	    if (anLocalInt_83_ <= 0)
		anInt5805 = 0;
	    int anLocalInt_84_ = argument_79_;
	    argument_80_ += argument_79_;
	    if (anInt5798 < 0) {
		if (anInt5795 > 0)
		    anInt5798 = 0;
		else {
		    method652();
		    this.unlink();
		    return;
		}
	    }
	    if (anInt5798 >= anLocalInt_82_) {
		if (anInt5795 < 0)
		    anInt5798 = anLocalInt_82_ - 1;
		else {
		    method652();
		    this.unlink();
		    return;
		}
	    }
	    if (anInt5805 < 0) {
		if (aBoolean5796) {
		    if (anInt5795 < 0) {
			anLocalInt_84_
			    = method666(argument_78_, anLocalInt_84_,
					anLocalInt, argument_80_,
					(((Node_Sub40_Sub1)
					  class59_sub40_sub1)
					 .aByteArray6136[anInt5802]));
			if (anInt5798 >= anLocalInt)
			    return;
			anInt5798 = anLocalInt + anLocalInt - 1 - anInt5798;
			anInt5795 = -anInt5795;
		    }
		    for (;;) {
			anLocalInt_84_
			    = method656(argument_78_, anLocalInt_84_,
					anLocalInt_81_, argument_80_,
					(((Node_Sub40_Sub1)
					  class59_sub40_sub1)
					 .aByteArray6136[anInt5799 - 1]));
			if (anInt5798 < anLocalInt_81_)
			    break;
			anInt5798
			    = anLocalInt_81_ + anLocalInt_81_ - 1 - anInt5798;
			anInt5795 = -anInt5795;
			anLocalInt_84_
			    = method666(argument_78_, anLocalInt_84_,
					anLocalInt, argument_80_,
					(((Node_Sub40_Sub1)
					  class59_sub40_sub1)
					 .aByteArray6136[anInt5802]));
			if (anInt5798 >= anLocalInt)
			    break;
			anInt5798 = anLocalInt + anLocalInt - 1 - anInt5798;
			anInt5795 = -anInt5795;
		    }
		} else if (anInt5795 < 0) {
		    for (;;) {
			anLocalInt_84_
			    = method666(argument_78_, anLocalInt_84_,
					anLocalInt, argument_80_,
					(((Node_Sub40_Sub1)
					  class59_sub40_sub1)
					 .aByteArray6136[anInt5799 - 1]));
			if (anInt5798 >= anLocalInt)
			    break;
			anInt5798 = anLocalInt_81_ - 1 - ((anLocalInt_81_ - 1
							   - anInt5798)
							  % anLocalInt_83_);
		    }
		} else {
		    for (;;) {
			anLocalInt_84_
			    = method656(argument_78_, anLocalInt_84_,
					anLocalInt_81_, argument_80_,
					(((Node_Sub40_Sub1)
					  class59_sub40_sub1)
					 .aByteArray6136[anInt5802]));
			if (anInt5798 < anLocalInt_81_)
			    break;
			anInt5798 = anLocalInt + ((anInt5798 - anLocalInt)
						  % anLocalInt_83_);
		    }
		}
	    } else {
		do {
		    if (anInt5805 > 0) {
			if (aBoolean5796) {
			    if (anInt5795 < 0) {
				anLocalInt_84_
				    = method666(argument_78_, anLocalInt_84_,
						anLocalInt, argument_80_,
						(((Node_Sub40_Sub1)
						  class59_sub40_sub1)
						 .aByteArray6136[anInt5802]));
				if (anInt5798 >= anLocalInt)
				    return;
				anInt5798
				    = anLocalInt + anLocalInt - 1 - anInt5798;
				anInt5795 = -anInt5795;
				if (--anInt5805 == 0)
				    break;
			    }
			    do {
				anLocalInt_84_
				    = method656(argument_78_, anLocalInt_84_,
						anLocalInt_81_, argument_80_,
						(((Node_Sub40_Sub1)
						  class59_sub40_sub1)
						 .aByteArray6136
						 [anInt5799 - 1]));
				if (anInt5798 < anLocalInt_81_)
				    return;
				anInt5798 = (anLocalInt_81_ + anLocalInt_81_
					     - 1 - anInt5798);
				anInt5795 = -anInt5795;
				if (--anInt5805 == 0)
				    break;
				anLocalInt_84_
				    = method666(argument_78_, anLocalInt_84_,
						anLocalInt, argument_80_,
						(((Node_Sub40_Sub1)
						  class59_sub40_sub1)
						 .aByteArray6136[anInt5802]));
				if (anInt5798 >= anLocalInt)
				    return;
				anInt5798
				    = anLocalInt + anLocalInt - 1 - anInt5798;
				anInt5795 = -anInt5795;
			    } while (--anInt5805 != 0);
			} else if (anInt5795 < 0) {
			    for (;;) {
				anLocalInt_84_
				    = method666(argument_78_, anLocalInt_84_,
						anLocalInt, argument_80_,
						(((Node_Sub40_Sub1)
						  class59_sub40_sub1)
						 .aByteArray6136
						 [anInt5799 - 1]));
				if (anInt5798 >= anLocalInt)
				    return;
				int anLocalInt_85_
				    = ((anLocalInt_81_ - 1 - anInt5798)
				       / anLocalInt_83_);
				if (anLocalInt_85_ >= anInt5805) {
				    anInt5798 += anLocalInt_83_ * anInt5805;
				    anInt5805 = 0;
				    break;
				}
				anInt5798 += anLocalInt_83_ * anLocalInt_85_;
				anInt5805 -= anLocalInt_85_;
			    }
			} else {
			    for (;;) {
				anLocalInt_84_
				    = method656(argument_78_, anLocalInt_84_,
						anLocalInt_81_, argument_80_,
						(((Node_Sub40_Sub1)
						  class59_sub40_sub1)
						 .aByteArray6136[anInt5802]));
				if (anInt5798 < anLocalInt_81_)
				    return;
				int anLocalInt_86_ = ((anInt5798 - anLocalInt)
						      / anLocalInt_83_);
				if (anLocalInt_86_ >= anInt5805) {
				    anInt5798 -= anLocalInt_83_ * anInt5805;
				    anInt5805 = 0;
				    break;
				}
				anInt5798 -= anLocalInt_83_ * anLocalInt_86_;
				anInt5805 -= anLocalInt_86_;
			    }
			}
		    }
		} while (false);
		if (anInt5795 < 0) {
		    method666(argument_78_, anLocalInt_84_, 0, argument_80_,
			      0);
		    if (anInt5798 < 0) {
			anInt5798 = -1;
			method652();
			this.unlink();
		    }
		} else {
		    method656(argument_78_, anLocalInt_84_, anLocalInt_82_,
			      argument_80_, 0);
		    if (anInt5798 >= anLocalInt_82_) {
			anInt5798 = anLocalInt_82_;
			method652();
			this.unlink();
		    }
		}
	    }
	}
    }
    
    private static final int method642(int argument, int argument_87_) {
	if (argument_87_ < 0)
	    return argument;
	return (int) ((double) argument * Math.sqrt((double) (16384
							      - argument_87_)
						    * 1.220703125E-4)
		      + 0.5);
    }
    
    final synchronized void method643(int argument_88_, int argument_89_) {
	method650(argument_88_, argument_89_, method662());
    }
    
    final synchronized int method644() {
	if (anInt5800 == -2147483648)
	    return 0;
	return anInt5800;
    }
    
    private static final int method645(int argument, int argument_90_) {
	if (argument_90_ < 0)
	    return -argument;
	return (int) (((double) argument
		       * Math.sqrt((double) argument_90_ * 1.220703125E-4))
		      + 0.5);
    }
    
    final int method575() {
	if (anInt5800 == 0 && anInt5792 == 0)
	    return 0;
	return 1;
    }
    
    private static final int method646
	(int argument, int argument_91_, byte[] argument_92_,
	 int[] argument_93_, int argument_94_, int argument_95_,
	 int argument_96_, int argument_97_, int argument_98_,
	 int argument_99_, Node_Sub9_Sub4 argument_100_, int argument_101_,
	 int argument_102_) {
	if (argument_101_ == 0
	    || (argument_97_
		= argument_95_ + (argument_99_ - argument_94_ + argument_101_
				  - 257) / argument_101_) > argument_98_)
	    argument_97_ = argument_98_;
	while (argument_95_ < argument_97_) {
	    argument_91_ = argument_94_ >> 8;
	    argument = argument_92_[argument_91_];
	    argument_93_[argument_95_++]
		+= (((argument << 8) + (argument_92_[argument_91_ + 1]
					- argument) * (argument_94_ & 0xff))
		    * argument_96_) >> 6;
	    argument_94_ += argument_101_;
	}
	if (argument_101_ == 0
	    || (argument_97_
		= argument_95_ + (argument_99_ - argument_94_ + argument_101_
				  - 1) / argument_101_) > argument_98_)
	    argument_97_ = argument_98_;
	argument_91_ = argument_102_;
	while (argument_95_ < argument_97_) {
	    argument = argument_92_[argument_94_ >> 8];
	    argument_93_[argument_95_++]
		+= (((argument << 8)
		     + (argument_91_ - argument) * (argument_94_ & 0xff))
		    * argument_96_) >> 6;
	    argument_94_ += argument_101_;
	}
	argument_100_.anInt5798 = argument_94_;
	return argument_95_;
    }
    
    private static final int method647(byte[] argument, int[] argument_103_,
				       int argument_104_, int argument_105_,
				       int argument_106_, int argument_107_,
				       int argument_108_, int argument_109_,
				       Node_Sub9_Sub4 argument_110_) {
	argument_104_ >>= 8;
	argument_109_ >>= 8;
	argument_106_ <<= 2;
	if ((argument_107_ = argument_105_ + argument_109_ - argument_104_)
	    > argument_108_)
	    argument_107_ = argument_108_;
	argument_107_ -= 3;
	while (argument_105_ < argument_107_) {
	    argument_103_[argument_105_++]
		+= argument[argument_104_++] * argument_106_;
	    argument_103_[argument_105_++]
		+= argument[argument_104_++] * argument_106_;
	    argument_103_[argument_105_++]
		+= argument[argument_104_++] * argument_106_;
	    argument_103_[argument_105_++]
		+= argument[argument_104_++] * argument_106_;
	}
	argument_107_ += 3;
	while (argument_105_ < argument_107_)
	    argument_103_[argument_105_++]
		+= argument[argument_104_++] * argument_106_;
	argument_110_.anInt5798 = argument_104_ << 8;
	return argument_105_;
    }
    
    private static final int method648
	(int argument, int argument_111_, byte[] argument_112_,
	 int[] argument_113_, int argument_114_, int argument_115_,
	 int argument_116_, int argument_117_, int argument_118_,
	 int argument_119_, int argument_120_, int argument_121_,
	 int argument_122_, Node_Sub9_Sub4 argument_123_, int argument_124_,
	 int argument_125_) {
	argument_123_.anInt5797 -= argument_123_.anInt5801 * argument_115_;
	if (argument_124_ == 0
	    || ((argument_120_
		 = argument_115_ + (argument_122_ + 256 - argument_114_
				    + argument_124_) / argument_124_)
		> argument_121_))
	    argument_120_ = argument_121_;
	argument_115_ <<= 1;
	argument_120_ <<= 1;
	while (argument_115_ < argument_120_) {
	    argument_111_ = argument_114_ >> 8;
	    argument = argument_112_[argument_111_ - 1];
	    argument = (argument << 8) + (argument_112_[argument_111_]
					  - argument) * (argument_114_ & 0xff);
	    argument_113_[argument_115_++] += argument * argument_116_ >> 6;
	    argument_116_ += argument_118_;
	    argument_113_[argument_115_++] += argument * argument_117_ >> 6;
	    argument_117_ += argument_119_;
	    argument_114_ += argument_124_;
	}
	if (argument_124_ == 0
	    || ((argument_120_
		 = (argument_115_ >> 1) + (argument_122_ - argument_114_
					   + argument_124_) / argument_124_)
		> argument_121_))
	    argument_120_ = argument_121_;
	argument_120_ <<= 1;
	argument_111_ = argument_125_;
	while (argument_115_ < argument_120_) {
	    argument
		= (argument_111_ << 8) + ((argument_112_[argument_114_ >> 8]
					   - argument_111_)
					  * (argument_114_ & 0xff));
	    argument_113_[argument_115_++] += argument * argument_116_ >> 6;
	    argument_116_ += argument_118_;
	    argument_113_[argument_115_++] += argument * argument_117_ >> 6;
	    argument_117_ += argument_119_;
	    argument_114_ += argument_124_;
	}
	argument_115_ >>= 1;
	argument_123_.anInt5797 += argument_123_.anInt5801 * argument_115_;
	argument_123_.anInt5793 = argument_116_;
	argument_123_.anInt5804 = argument_117_;
	argument_123_.anInt5798 = argument_114_;
	return argument_115_;
    }
    
    private final boolean method649() {
	int anLocalInt = anInt5800;
	int anLocalInt_126_;
	int anLocalInt_127_;
	if (anLocalInt == -2147483648)
	    anLocalInt = anLocalInt_126_ = anLocalInt_127_ = 0;
	else {
	    anLocalInt_126_ = method642(anLocalInt, anInt5806);
	    anLocalInt_127_ = method645(anLocalInt, anInt5806);
	}
	if (anInt5797 != anLocalInt || anInt5793 != anLocalInt_126_
	    || anInt5804 != anLocalInt_127_) {
	    if (anInt5797 < anLocalInt) {
		anInt5801 = 1;
		anInt5792 = anLocalInt - anInt5797;
	    } else if (anInt5797 > anLocalInt) {
		anInt5801 = -1;
		anInt5792 = anInt5797 - anLocalInt;
	    } else
		anInt5801 = 0;
	    if (anInt5793 < anLocalInt_126_) {
		anInt5794 = 1;
		if (anInt5792 == 0 || anInt5792 > anLocalInt_126_ - anInt5793)
		    anInt5792 = anLocalInt_126_ - anInt5793;
	    } else if (anInt5793 > anLocalInt_126_) {
		anInt5794 = -1;
		if (anInt5792 == 0 || anInt5792 > anInt5793 - anLocalInt_126_)
		    anInt5792 = anInt5793 - anLocalInt_126_;
	    } else
		anInt5794 = 0;
	    if (anInt5804 < anLocalInt_127_) {
		anInt5803 = 1;
		if (anInt5792 == 0 || anInt5792 > anLocalInt_127_ - anInt5804)
		    anInt5792 = anLocalInt_127_ - anInt5804;
	    } else if (anInt5804 > anLocalInt_127_) {
		anInt5803 = -1;
		if (anInt5792 == 0 || anInt5792 > anInt5804 - anLocalInt_127_)
		    anInt5792 = anInt5804 - anLocalInt_127_;
	    } else
		anInt5803 = 0;
	    return false;
	}
	if (anInt5800 == -2147483648) {
	    anInt5800 = 0;
	    anInt5797 = anInt5793 = anInt5804 = 0;
	    this.unlink();
	    return true;
	}
	method634();
	return false;
    }
    
    final synchronized void method650(int argument_128_, int argument_129_,
				      int argument_130_) {
	if (argument_128_ == 0)
	    method663(argument_129_, argument_130_);
	else {
	    int anLocalInt = method642(argument_129_, argument_130_);
	    int anLocalInt_131_ = method645(argument_129_, argument_130_);
	    if (anInt5793 == anLocalInt && anInt5804 == anLocalInt_131_)
		anInt5792 = 0;
	    else {
		int anLocalInt_132_ = argument_129_ - anInt5797;
		if (anInt5797 - argument_129_ > anLocalInt_132_)
		    anLocalInt_132_ = anInt5797 - argument_129_;
		if (anLocalInt - anInt5793 > anLocalInt_132_)
		    anLocalInt_132_ = anLocalInt - anInt5793;
		if (anInt5793 - anLocalInt > anLocalInt_132_)
		    anLocalInt_132_ = anInt5793 - anLocalInt;
		if (anLocalInt_131_ - anInt5804 > anLocalInt_132_)
		    anLocalInt_132_ = anLocalInt_131_ - anInt5804;
		if (anInt5804 - anLocalInt_131_ > anLocalInt_132_)
		    anLocalInt_132_ = anInt5804 - anLocalInt_131_;
		if (argument_128_ > anLocalInt_132_)
		    argument_128_ = anLocalInt_132_;
		anInt5792 = argument_128_;
		anInt5800 = argument_129_;
		anInt5806 = argument_130_;
		anInt5801 = (argument_129_ - anInt5797) / argument_128_;
		anInt5794 = (anLocalInt - anInt5793) / argument_128_;
		anInt5803 = (anLocalInt_131_ - anInt5804) / argument_128_;
	    }
	}
    }
    
    final synchronized void method651(boolean argument_133_) {
	anInt5795 = (anInt5795 ^ anInt5795 >> 31) + (anInt5795 >>> 31);
	anInt5795 = -anInt5795;
    }
    
    private final void method652() {
	if (anInt5792 != 0) {
	    if (anInt5800 == -2147483648)
		anInt5800 = 0;
	    anInt5792 = 0;
	    method634();
	}
    }
    
    final Node_Sub9 method577() {
	return null;
    }
    
    private static final int method653
	(int argument, int argument_134_, byte[] argument_135_,
	 int[] argument_136_, int argument_137_, int argument_138_,
	 int argument_139_, int argument_140_, int argument_141_,
	 int argument_142_, int argument_143_, int argument_144_,
	 int argument_145_, Node_Sub9_Sub4 argument_146_, int argument_147_,
	 int argument_148_) {
	argument_146_.anInt5797 -= argument_146_.anInt5801 * argument_138_;
	if (argument_147_ == 0
	    || ((argument_143_
		 = argument_138_ + (argument_145_ - argument_137_
				    + argument_147_ - 257) / argument_147_)
		> argument_144_))
	    argument_143_ = argument_144_;
	argument_138_ <<= 1;
	argument_143_ <<= 1;
	while (argument_138_ < argument_143_) {
	    argument_134_ = argument_137_ >> 8;
	    argument = argument_135_[argument_134_];
	    argument = (argument << 8) + (argument_135_[argument_134_ + 1]
					  - argument) * (argument_137_ & 0xff);
	    argument_136_[argument_138_++] += argument * argument_139_ >> 6;
	    argument_139_ += argument_141_;
	    argument_136_[argument_138_++] += argument * argument_140_ >> 6;
	    argument_140_ += argument_142_;
	    argument_137_ += argument_147_;
	}
	if (argument_147_ == 0
	    || (argument_143_
		= (argument_138_ >> 1) + ((argument_145_ - argument_137_
					   + argument_147_ - 1)
					  / argument_147_)) > argument_144_)
	    argument_143_ = argument_144_;
	argument_143_ <<= 1;
	argument_134_ = argument_148_;
	while (argument_138_ < argument_143_) {
	    argument = argument_135_[argument_137_ >> 8];
	    argument
		= (argument << 8) + (argument_134_ - argument) * (argument_137_
								  & 0xff);
	    argument_136_[argument_138_++] += argument * argument_139_ >> 6;
	    argument_139_ += argument_141_;
	    argument_136_[argument_138_++] += argument * argument_140_ >> 6;
	    argument_140_ += argument_142_;
	    argument_137_ += argument_147_;
	}
	argument_138_ >>= 1;
	argument_146_.anInt5797 += argument_146_.anInt5801 * argument_138_;
	argument_146_.anInt5793 = argument_139_;
	argument_146_.anInt5804 = argument_140_;
	argument_146_.anInt5798 = argument_137_;
	return argument_138_;
    }
    
    final synchronized void method654(int argument_149_) {
	if (anInt5795 < 0)
	    anInt5795 = -argument_149_;
	else
	    anInt5795 = argument_149_;
    }
    
    private static final int method655
	(byte[] argument, int[] argument_150_, int argument_151_,
	 int argument_152_, int argument_153_, int argument_154_,
	 int argument_155_, int argument_156_, int argument_157_,
	 Node_Sub9_Sub4 argument_158_) {
	argument_151_ >>= 8;
	argument_157_ >>= 8;
	argument_153_ <<= 2;
	argument_154_ <<= 2;
	if ((argument_155_
	     = argument_152_ + argument_151_ - (argument_157_ - 1))
	    > argument_156_)
	    argument_155_ = argument_156_;
	argument_158_.anInt5793
	    += argument_158_.anInt5794 * (argument_155_ - argument_152_);
	argument_158_.anInt5804
	    += argument_158_.anInt5803 * (argument_155_ - argument_152_);
	argument_155_ -= 3;
	while (argument_152_ < argument_155_) {
	    argument_150_[argument_152_++]
		+= argument[argument_151_--] * argument_153_;
	    argument_153_ += argument_154_;
	    argument_150_[argument_152_++]
		+= argument[argument_151_--] * argument_153_;
	    argument_153_ += argument_154_;
	    argument_150_[argument_152_++]
		+= argument[argument_151_--] * argument_153_;
	    argument_153_ += argument_154_;
	    argument_150_[argument_152_++]
		+= argument[argument_151_--] * argument_153_;
	    argument_153_ += argument_154_;
	}
	argument_155_ += 3;
	while (argument_152_ < argument_155_) {
	    argument_150_[argument_152_++]
		+= argument[argument_151_--] * argument_153_;
	    argument_153_ += argument_154_;
	}
	argument_158_.anInt5797 = argument_153_ >> 2;
	argument_158_.anInt5798 = argument_151_ << 8;
	return argument_152_;
    }
    
    private final int method656(int[] argument_159_, int argument_160_,
				int argument_161_, int argument_162_,
				int argument_163_) {
	while (anInt5792 > 0) {
	    int anLocalInt = argument_160_ + anInt5792;
	    if (anLocalInt > argument_162_)
		anLocalInt = argument_162_;
	    anInt5792 += argument_160_;
	    if (anInt5795 == 256 && (anInt5798 & 0xff) == 0) {
		if (Class62_Sub3.aBoolean4377)
		    argument_160_
			= method633(0,
				    ((Node_Sub40_Sub1) (Node_Sub40_Sub1)
				     (((Node_Sub9) this)
				      .aClass59_Sub40_3930)).aByteArray6136,
				    argument_159_, anInt5798, argument_160_,
				    anInt5793, anInt5804, anInt5794, anInt5803,
				    0, anLocalInt, argument_161_, this);
		else
		    argument_160_
			= method639(((Node_Sub40_Sub1) (Node_Sub40_Sub1)
				     (((Node_Sub9) this)
				      .aClass59_Sub40_3930)).aByteArray6136,
				    argument_159_, anInt5798, argument_160_,
				    anInt5797, anInt5801, 0, anLocalInt,
				    argument_161_, this);
	    } else if (Class62_Sub3.aBoolean4377)
		argument_160_
		    = method653(0, 0,
				(((Node_Sub40_Sub1) (Node_Sub40_Sub1)
				  ((Node_Sub9) this).aClass59_Sub40_3930)
				 .aByteArray6136),
				argument_159_, anInt5798, argument_160_,
				anInt5793, anInt5804, anInt5794, anInt5803, 0,
				anLocalInt, argument_161_, this, anInt5795,
				argument_163_);
	    else
		argument_160_
		    = method658(0, 0,
				(((Node_Sub40_Sub1) (Node_Sub40_Sub1)
				  ((Node_Sub9) this).aClass59_Sub40_3930)
				 .aByteArray6136),
				argument_159_, anInt5798, argument_160_,
				anInt5797, anInt5801, 0, anLocalInt,
				argument_161_, this, anInt5795, argument_163_);
	    anInt5792 -= argument_160_;
	    if (anInt5792 != 0)
		return argument_160_;
	    if (method649())
		return argument_162_;
	}
	if (anInt5795 == 256 && (anInt5798 & 0xff) == 0) {
	    if (Class62_Sub3.aBoolean4377)
		return method640(0,
				 (((Node_Sub40_Sub1) (Node_Sub40_Sub1)
				   ((Node_Sub9) this).aClass59_Sub40_3930)
				  .aByteArray6136),
				 argument_159_, anInt5798, argument_160_,
				 anInt5793, anInt5804, 0, argument_162_,
				 argument_161_, this);
	    return method647((((Node_Sub40_Sub1) (Node_Sub40_Sub1)
			       ((Node_Sub9) this).aClass59_Sub40_3930)
			      .aByteArray6136),
			     argument_159_, anInt5798, argument_160_,
			     anInt5797, 0, argument_162_, argument_161_, this);
	}
	if (Class62_Sub3.aBoolean4377)
	    return method657(0, 0,
			     (((Node_Sub40_Sub1) (Node_Sub40_Sub1)
			       ((Node_Sub9) this).aClass59_Sub40_3930)
			      .aByteArray6136),
			     argument_159_, anInt5798, argument_160_,
			     anInt5793, anInt5804, 0, argument_162_,
			     argument_161_, this, anInt5795, argument_163_);
	return method646(0, 0,
			 (((Node_Sub40_Sub1) (Node_Sub40_Sub1)
			   ((Node_Sub9) this).aClass59_Sub40_3930)
			  .aByteArray6136),
			 argument_159_, anInt5798, argument_160_, anInt5797, 0,
			 argument_162_, argument_161_, this, anInt5795,
			 argument_163_);
    }
    
    private static final int method657
	(int argument, int argument_164_, byte[] argument_165_,
	 int[] argument_166_, int argument_167_, int argument_168_,
	 int argument_169_, int argument_170_, int argument_171_,
	 int argument_172_, int argument_173_, Node_Sub9_Sub4 argument_174_,
	 int argument_175_, int argument_176_) {
	if (argument_175_ == 0
	    || ((argument_171_
		 = argument_168_ + (argument_173_ - argument_167_
				    + argument_175_ - 257) / argument_175_)
		> argument_172_))
	    argument_171_ = argument_172_;
	argument_168_ <<= 1;
	argument_171_ <<= 1;
	while (argument_168_ < argument_171_) {
	    argument_164_ = argument_167_ >> 8;
	    argument = argument_165_[argument_164_];
	    argument = (argument << 8) + (argument_165_[argument_164_ + 1]
					  - argument) * (argument_167_ & 0xff);
	    argument_166_[argument_168_++] += argument * argument_169_ >> 6;
	    argument_166_[argument_168_++] += argument * argument_170_ >> 6;
	    argument_167_ += argument_175_;
	}
	if (argument_175_ == 0
	    || (argument_171_
		= (argument_168_ >> 1) + ((argument_173_ - argument_167_
					   + argument_175_ - 1)
					  / argument_175_)) > argument_172_)
	    argument_171_ = argument_172_;
	argument_171_ <<= 1;
	argument_164_ = argument_176_;
	while (argument_168_ < argument_171_) {
	    argument = argument_165_[argument_167_ >> 8];
	    argument
		= (argument << 8) + (argument_164_ - argument) * (argument_167_
								  & 0xff);
	    argument_166_[argument_168_++] += argument * argument_169_ >> 6;
	    argument_166_[argument_168_++] += argument * argument_170_ >> 6;
	    argument_167_ += argument_175_;
	}
	argument_174_.anInt5798 = argument_167_;
	return argument_168_ >> 1;
    }
    
    private static final int method658
	(int argument, int argument_177_, byte[] argument_178_,
	 int[] argument_179_, int argument_180_, int argument_181_,
	 int argument_182_, int argument_183_, int argument_184_,
	 int argument_185_, int argument_186_, Node_Sub9_Sub4 argument_187_,
	 int argument_188_, int argument_189_) {
	argument_187_.anInt5793 -= argument_187_.anInt5794 * argument_181_;
	argument_187_.anInt5804 -= argument_187_.anInt5803 * argument_181_;
	if (argument_188_ == 0
	    || ((argument_184_
		 = argument_181_ + (argument_186_ - argument_180_
				    + argument_188_ - 257) / argument_188_)
		> argument_185_))
	    argument_184_ = argument_185_;
	while (argument_181_ < argument_184_) {
	    argument_177_ = argument_180_ >> 8;
	    argument = argument_178_[argument_177_];
	    argument_179_[argument_181_++]
		+= (((argument << 8) + (argument_178_[argument_177_ + 1]
					- argument) * (argument_180_ & 0xff))
		    * argument_182_) >> 6;
	    argument_182_ += argument_183_;
	    argument_180_ += argument_188_;
	}
	if (argument_188_ == 0
	    || ((argument_184_
		 = argument_181_ + (argument_186_ - argument_180_
				    + argument_188_ - 1) / argument_188_)
		> argument_185_))
	    argument_184_ = argument_185_;
	argument_177_ = argument_189_;
	while (argument_181_ < argument_184_) {
	    argument = argument_178_[argument_180_ >> 8];
	    argument_179_[argument_181_++]
		+= (((argument << 8)
		     + (argument_177_ - argument) * (argument_180_ & 0xff))
		    * argument_182_) >> 6;
	    argument_182_ += argument_183_;
	    argument_180_ += argument_188_;
	}
	argument_187_.anInt5793 += argument_187_.anInt5794 * argument_181_;
	argument_187_.anInt5804 += argument_187_.anInt5803 * argument_181_;
	argument_187_.anInt5797 = argument_182_;
	argument_187_.anInt5798 = argument_180_;
	return argument_181_;
    }
    
    final synchronized void method574(int argument_190_) {
	if (anInt5792 > 0) {
	    if (argument_190_ >= anInt5792) {
		if (anInt5800 == -2147483648) {
		    anInt5800 = 0;
		    anInt5797 = anInt5793 = anInt5804 = 0;
		    this.unlink();
		    argument_190_ = anInt5792;
		}
		anInt5792 = 0;
		method634();
	    } else {
		anInt5797 += anInt5801 * argument_190_;
		anInt5793 += anInt5794 * argument_190_;
		anInt5804 += anInt5803 * argument_190_;
		anInt5792 -= argument_190_;
	    }
	}
	Node_Sub40_Sub1 class59_sub40_sub1
	    = (Node_Sub40_Sub1) ((Node_Sub9) this).aClass59_Sub40_3930;
	int anLocalInt = anInt5802 << 8;
	int anLocalInt_191_ = anInt5799 << 8;
	int anLocalInt_192_
	    = (((Node_Sub40_Sub1) class59_sub40_sub1).aByteArray6136.length
	       << 8);
	int anLocalInt_193_ = anLocalInt_191_ - anLocalInt;
	if (anLocalInt_193_ <= 0)
	    anInt5805 = 0;
	if (anInt5798 < 0) {
	    if (anInt5795 > 0)
		anInt5798 = 0;
	    else {
		method652();
		this.unlink();
		return;
	    }
	}
	if (anInt5798 >= anLocalInt_192_) {
	    if (anInt5795 < 0)
		anInt5798 = anLocalInt_192_ - 1;
	    else {
		method652();
		this.unlink();
		return;
	    }
	}
	anInt5798 += anInt5795 * argument_190_;
	if (anInt5805 < 0) {
	    if (aBoolean5796) {
		if (anInt5795 < 0) {
		    if (anInt5798 >= anLocalInt)
			return;
		    anInt5798 = anLocalInt + anLocalInt - 1 - anInt5798;
		    anInt5795 = -anInt5795;
		}
		while (anInt5798 >= anLocalInt_191_) {
		    anInt5798
			= anLocalInt_191_ + anLocalInt_191_ - 1 - anInt5798;
		    anInt5795 = -anInt5795;
		    if (anInt5798 >= anLocalInt)
			break;
		    anInt5798 = anLocalInt + anLocalInt - 1 - anInt5798;
		    anInt5795 = -anInt5795;
		}
	    } else if (anInt5795 < 0) {
		if (anInt5798 < anLocalInt)
		    anInt5798 = anLocalInt_191_ - 1 - ((anLocalInt_191_ - 1
							- anInt5798)
						       % anLocalInt_193_);
	    } else if (anInt5798 >= anLocalInt_191_)
		anInt5798
		    = anLocalInt + (anInt5798 - anLocalInt) % anLocalInt_193_;
	} else {
	    do {
		if (anInt5805 > 0) {
		    if (aBoolean5796) {
			if (anInt5795 < 0) {
			    if (anInt5798 >= anLocalInt)
				return;
			    anInt5798
				= anLocalInt + anLocalInt - 1 - anInt5798;
			    anInt5795 = -anInt5795;
			    if (--anInt5805 == 0)
				break;
			}
			do {
			    if (anInt5798 < anLocalInt_191_)
				return;
			    anInt5798 = (anLocalInt_191_ + anLocalInt_191_ - 1
					 - anInt5798);
			    anInt5795 = -anInt5795;
			    if (--anInt5805 == 0)
				break;
			    if (anInt5798 >= anLocalInt)
				return;
			    anInt5798
				= anLocalInt + anLocalInt - 1 - anInt5798;
			    anInt5795 = -anInt5795;
			} while (--anInt5805 != 0);
		    } else if (anInt5795 < 0) {
			if (anInt5798 >= anLocalInt)
			    return;
			int anLocalInt_194_
			    = ((anLocalInt_191_ - 1 - anInt5798)
			       / anLocalInt_193_);
			if (anLocalInt_194_ >= anInt5805) {
			    anInt5798 += anLocalInt_193_ * anInt5805;
			    anInt5805 = 0;
			} else {
			    anInt5798 += anLocalInt_193_ * anLocalInt_194_;
			    anInt5805 -= anLocalInt_194_;
			    return;
			}
		    } else {
			if (anInt5798 < anLocalInt_191_)
			    return;
			int anLocalInt_195_
			    = (anInt5798 - anLocalInt) / anLocalInt_193_;
			if (anLocalInt_195_ >= anInt5805) {
			    anInt5798 -= anLocalInt_193_ * anInt5805;
			    anInt5805 = 0;
			} else {
			    anInt5798 -= anLocalInt_193_ * anLocalInt_195_;
			    anInt5805 -= anLocalInt_195_;
			    return;
			}
		    }
		}
	    } while (false);
	    if (anInt5795 < 0) {
		if (anInt5798 < 0) {
		    anInt5798 = -1;
		    method652();
		    this.unlink();
		}
	    } else if (anInt5798 >= anLocalInt_192_) {
		anInt5798 = anLocalInt_192_;
		method652();
		this.unlink();
	    }
	}
    }
    
    final synchronized int method659() {
	if (anInt5795 < 0)
	    return -anInt5795;
	return anInt5795;
    }
    
    final synchronized void method660(int argument_196_) {
	method663(argument_196_ << 6, method662());
    }
    
    private static final int method661
	(int argument, int argument_197_, byte[] argument_198_,
	 int[] argument_199_, int argument_200_, int argument_201_,
	 int argument_202_, int argument_203_, int argument_204_,
	 int argument_205_, Node_Sub9_Sub4 argument_206_, int argument_207_,
	 int argument_208_) {
	if (argument_207_ == 0
	    || ((argument_203_
		 = argument_201_ + (argument_205_ + 256 - argument_200_
				    + argument_207_) / argument_207_)
		> argument_204_))
	    argument_203_ = argument_204_;
	while (argument_201_ < argument_203_) {
	    argument_197_ = argument_200_ >> 8;
	    argument = argument_198_[argument_197_ - 1];
	    argument_199_[argument_201_++]
		+= (((argument << 8) + (argument_198_[argument_197_]
					- argument) * (argument_200_ & 0xff))
		    * argument_202_) >> 6;
	    argument_200_ += argument_207_;
	}
	if (argument_207_ == 0
	    || ((argument_203_
		 = argument_201_ + (argument_205_ - argument_200_
				    + argument_207_) / argument_207_)
		> argument_204_))
	    argument_203_ = argument_204_;
	argument = argument_208_;
	argument_197_ = argument_207_;
	while (argument_201_ < argument_203_) {
	    argument_199_[argument_201_++]
		+= (((argument << 8) + (argument_198_[argument_200_ >> 8]
					- argument) * (argument_200_ & 0xff))
		    * argument_202_) >> 6;
	    argument_200_ += argument_197_;
	}
	argument_206_.anInt5798 = argument_200_;
	return argument_201_;
    }
    
    final synchronized int method662() {
	if (anInt5806 < 0)
	    return -1;
	return anInt5806;
    }
    
    private final synchronized void method663(int argument_209_,
					      int argument_210_) {
	anInt5800 = argument_209_;
	anInt5806 = argument_210_;
	anInt5792 = 0;
	method634();
    }
    
    final synchronized void method664(int argument_211_) {
	anInt5805 = argument_211_;
    }
    
    final Node_Sub9 method573() {
	return null;
    }
    
    final synchronized void method665(int argument_212_) {
	method663(method644(), argument_212_);
    }
    
    private final int method666(int[] argument_213_, int argument_214_,
				int argument_215_, int argument_216_,
				int argument_217_) {
	while (anInt5792 > 0) {
	    int anLocalInt = argument_214_ + anInt5792;
	    if (anLocalInt > argument_216_)
		anLocalInt = argument_216_;
	    anInt5792 += argument_214_;
	    if (anInt5795 == -256 && (anInt5798 & 0xff) == 0) {
		if (Class62_Sub3.aBoolean4377)
		    argument_214_
			= method635(0,
				    ((Node_Sub40_Sub1) (Node_Sub40_Sub1)
				     (((Node_Sub9) this)
				      .aClass59_Sub40_3930)).aByteArray6136,
				    argument_213_, anInt5798, argument_214_,
				    anInt5793, anInt5804, anInt5794, anInt5803,
				    0, anLocalInt, argument_215_, this);
		else
		    argument_214_
			= method655(((Node_Sub40_Sub1) (Node_Sub40_Sub1)
				     (((Node_Sub9) this)
				      .aClass59_Sub40_3930)).aByteArray6136,
				    argument_213_, anInt5798, argument_214_,
				    anInt5797, anInt5801, 0, anLocalInt,
				    argument_215_, this);
	    } else if (Class62_Sub3.aBoolean4377)
		argument_214_
		    = method648(0, 0,
				(((Node_Sub40_Sub1) (Node_Sub40_Sub1)
				  ((Node_Sub9) this).aClass59_Sub40_3930)
				 .aByteArray6136),
				argument_213_, anInt5798, argument_214_,
				anInt5793, anInt5804, anInt5794, anInt5803, 0,
				anLocalInt, argument_215_, this, anInt5795,
				argument_217_);
	    else
		argument_214_
		    = method670(0, 0,
				(((Node_Sub40_Sub1) (Node_Sub40_Sub1)
				  ((Node_Sub9) this).aClass59_Sub40_3930)
				 .aByteArray6136),
				argument_213_, anInt5798, argument_214_,
				anInt5797, anInt5801, 0, anLocalInt,
				argument_215_, this, anInt5795, argument_217_);
	    anInt5792 -= argument_214_;
	    if (anInt5792 != 0)
		return argument_214_;
	    if (method649())
		return argument_216_;
	}
	if (anInt5795 == -256 && (anInt5798 & 0xff) == 0) {
	    if (Class62_Sub3.aBoolean4377)
		return method636(0,
				 (((Node_Sub40_Sub1) (Node_Sub40_Sub1)
				   ((Node_Sub9) this).aClass59_Sub40_3930)
				  .aByteArray6136),
				 argument_213_, anInt5798, argument_214_,
				 anInt5793, anInt5804, 0, argument_216_,
				 argument_215_, this);
	    return method637((((Node_Sub40_Sub1) (Node_Sub40_Sub1)
			       ((Node_Sub9) this).aClass59_Sub40_3930)
			      .aByteArray6136),
			     argument_213_, anInt5798, argument_214_,
			     anInt5797, 0, argument_216_, argument_215_, this);
	}
	if (Class62_Sub3.aBoolean4377)
	    return method641(0, 0,
			     (((Node_Sub40_Sub1) (Node_Sub40_Sub1)
			       ((Node_Sub9) this).aClass59_Sub40_3930)
			      .aByteArray6136),
			     argument_213_, anInt5798, argument_214_,
			     anInt5793, anInt5804, 0, argument_216_,
			     argument_215_, this, anInt5795, argument_217_);
	return method661(0, 0,
			 (((Node_Sub40_Sub1) (Node_Sub40_Sub1)
			   ((Node_Sub9) this).aClass59_Sub40_3930)
			  .aByteArray6136),
			 argument_213_, anInt5798, argument_214_, anInt5797, 0,
			 argument_216_, argument_215_, this, anInt5795,
			 argument_217_);
    }
    
    private final synchronized void method667(int argument_218_) {
	method663(argument_218_, method662());
    }
    
    final synchronized void method668(int argument_219_) {
	if (argument_219_ == 0) {
	    method667(0);
	    this.unlink();
	} else if (anInt5793 == 0 && anInt5804 == 0) {
	    anInt5792 = 0;
	    anInt5800 = 0;
	    anInt5797 = 0;
	    this.unlink();
	} else {
	    int anLocalInt = -anInt5797;
	    if (anInt5797 > anLocalInt)
		anLocalInt = anInt5797;
	    if (-anInt5793 > anLocalInt)
		anLocalInt = -anInt5793;
	    if (anInt5793 > anLocalInt)
		anLocalInt = anInt5793;
	    if (-anInt5804 > anLocalInt)
		anLocalInt = -anInt5804;
	    if (anInt5804 > anLocalInt)
		anLocalInt = anInt5804;
	    if (argument_219_ > anLocalInt)
		argument_219_ = anLocalInt;
	    anInt5792 = argument_219_;
	    anInt5800 = -2147483648;
	    anInt5801 = -anInt5797 / argument_219_;
	    anInt5794 = -anInt5793 / argument_219_;
	    anInt5803 = -anInt5804 / argument_219_;
	}
    }
    
    final boolean method669() {
	if (anInt5792 == 0)
	    return false;
	return true;
    }
    
    private static final int method670
	(int argument, int argument_220_, byte[] argument_221_,
	 int[] argument_222_, int argument_223_, int argument_224_,
	 int argument_225_, int argument_226_, int argument_227_,
	 int argument_228_, int argument_229_, Node_Sub9_Sub4 argument_230_,
	 int argument_231_, int argument_232_) {
	argument_230_.anInt5793 -= argument_230_.anInt5794 * argument_224_;
	argument_230_.anInt5804 -= argument_230_.anInt5803 * argument_224_;
	if (argument_231_ == 0
	    || ((argument_227_
		 = argument_224_ + (argument_229_ + 256 - argument_223_
				    + argument_231_) / argument_231_)
		> argument_228_))
	    argument_227_ = argument_228_;
	while (argument_224_ < argument_227_) {
	    argument_220_ = argument_223_ >> 8;
	    argument = argument_221_[argument_220_ - 1];
	    argument_222_[argument_224_++]
		+= (((argument << 8) + (argument_221_[argument_220_]
					- argument) * (argument_223_ & 0xff))
		    * argument_225_) >> 6;
	    argument_225_ += argument_226_;
	    argument_223_ += argument_231_;
	}
	if (argument_231_ == 0
	    || ((argument_227_
		 = argument_224_ + (argument_229_ - argument_223_
				    + argument_231_) / argument_231_)
		> argument_228_))
	    argument_227_ = argument_228_;
	argument = argument_232_;
	argument_220_ = argument_231_;
	while (argument_224_ < argument_227_) {
	    argument_222_[argument_224_++]
		+= (((argument << 8) + (argument_221_[argument_223_ >> 8]
					- argument) * (argument_223_ & 0xff))
		    * argument_225_) >> 6;
	    argument_225_ += argument_226_;
	    argument_223_ += argument_220_;
	}
	argument_230_.anInt5793 += argument_230_.anInt5794 * argument_224_;
	argument_230_.anInt5804 += argument_230_.anInt5803 * argument_224_;
	argument_230_.anInt5797 = argument_225_;
	argument_230_.anInt5798 = argument_223_;
	return argument_224_;
    }
    
    final int method576() {
	int anLocalInt = anInt5797 * 3 >> 6;
	anLocalInt = (anLocalInt ^ anLocalInt >> 31) + (anLocalInt >>> 31);
	if (anInt5805 == 0)
	    anLocalInt -= (anLocalInt * anInt5798
			   / ((((Node_Sub40_Sub1) (Node_Sub40_Sub1)
				((Node_Sub9) this).aClass59_Sub40_3930)
			       .aByteArray6136).length
			      << 8));
	else if (anInt5805 >= 0)
	    anLocalInt -= (anLocalInt * anInt5802
			   / (((Node_Sub40_Sub1) (Node_Sub40_Sub1)
			       ((Node_Sub9) this).aClass59_Sub40_3930)
			      .aByteArray6136).length);
	if (anLocalInt > 255)
	    return 255;
	return anLocalInt;
    }
    
    private Node_Sub9_Sub4(Node_Sub40_Sub1 argument_233_,
                           int argument_234_, int argument_235_,
                           int argument_236_) {
	((Node_Sub9) this).aClass59_Sub40_3930 = argument_233_;
	anInt5802 = ((Node_Sub40_Sub1) argument_233_).anInt6138;
	anInt5799 = ((Node_Sub40_Sub1) argument_233_).anInt6137;
	aBoolean5796 = ((Node_Sub40_Sub1) argument_233_).aBoolean6135;
	anInt5795 = argument_234_;
	anInt5800 = argument_235_;
	anInt5806 = argument_236_;
	anInt5798 = 0;
	method634();
    }
}
