/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Bzip2Decompressor
{
    private static Class338 aClass338_291 = new Class338();
    
    private static final void method399(Class338 argument) {
	((Class338) argument).anInt2778 = 0;
	for (int anLocalInt = 0; anLocalInt < 256; anLocalInt++) {
	    if (((Class338) argument).aBooleanArray2777[anLocalInt]) {
		((Class338) argument).aByteArray2783[(((Class338) argument)
						      .anInt2778)]
		    = (byte) anLocalInt;
		((Class338) argument).anInt2778++;
	    }
	}
    }
    
    private static final byte method400(Class338 argument) {
	return (byte) method404(1, argument);
    }
    
    private static final byte method401(Class338 argument) {
	return (byte) method404(8, argument);
    }
    
    public static void method402() {
	aClass338_291 = null;
    }
    
    private static final void method403(int[] argument, int[] argument_0_,
					int[] argument_1_, byte[] argument_2_,
					int argument_3_, int argument_4_,
					int argument_5_) {
	int anLocalInt = 0;
	for (int anLocalInt_6_ = argument_3_; anLocalInt_6_ <= argument_4_;
	     anLocalInt_6_++) {
	    for (int anLocalInt_7_ = 0; anLocalInt_7_ < argument_5_;
		 anLocalInt_7_++) {
		if (argument_2_[anLocalInt_7_] == anLocalInt_6_) {
		    argument_1_[anLocalInt] = anLocalInt_7_;
		    anLocalInt++;
		}
	    }
	}
	for (int anLocalInt_8_ = 0; anLocalInt_8_ < 23; anLocalInt_8_++)
	    argument_0_[anLocalInt_8_] = 0;
	for (int anLocalInt_9_ = 0; anLocalInt_9_ < argument_5_;
	     anLocalInt_9_++)
	    argument_0_[argument_2_[anLocalInt_9_] + 1]++;
	for (int anLocalInt_10_ = 1; anLocalInt_10_ < 23; anLocalInt_10_++)
	    argument_0_[anLocalInt_10_] += argument_0_[anLocalInt_10_ - 1];
	for (int anLocalInt_11_ = 0; anLocalInt_11_ < 23; anLocalInt_11_++)
	    argument[anLocalInt_11_] = 0;
	int anLocalInt_12_ = 0;
	for (int anLocalInt_13_ = argument_3_; anLocalInt_13_ <= argument_4_;
	     anLocalInt_13_++) {
	    anLocalInt_12_ += (argument_0_[anLocalInt_13_ + 1]
			       - argument_0_[anLocalInt_13_]);
	    argument[anLocalInt_13_] = anLocalInt_12_ - 1;
	    anLocalInt_12_ <<= 1;
	}
	for (int anLocalInt_14_ = argument_3_ + 1;
	     anLocalInt_14_ <= argument_4_; anLocalInt_14_++)
	    argument_0_[anLocalInt_14_] = (argument[anLocalInt_14_ - 1] + 1
					   << 1) - argument_0_[anLocalInt_14_];
    }
    
    private static final int method404(int argument, Class338 argument_15_) {
	for (;;) {
	    if (((Class338) argument_15_).anInt2793 >= argument) {
		int anLocalInt
		    = ((((Class338) argument_15_).anInt2764
			>> ((Class338) argument_15_).anInt2793 - argument)
		       & (1 << argument) - 1);
		((Class338) argument_15_).anInt2793 -= argument;
		return anLocalInt;
	    }
	    ((Class338) argument_15_).anInt2764
		= (((Class338) argument_15_).anInt2764 << 8
		   | (((Class338) argument_15_).aByteArray2782
		      [((Class338) argument_15_).anInt2768]) & 0xff);
	    ((Class338) argument_15_).anInt2793 += 8;
	    ((Class338) argument_15_).anInt2768++;
	    ((Class338) argument_15_).anInt2773++;
	}
    }
    
    static final int decompressBzip2(byte[] argument, int argument_16_, byte[] argument_17_, int argument_18_, int argument_19_) {
	synchronized (aClass338_291) {
	    ((Class338) aClass338_291).aByteArray2782 = argument_17_;
	    ((Class338) aClass338_291).anInt2768 = argument_19_;
	    ((Class338) aClass338_291).aByteArray2769 = argument;
	    ((Class338) aClass338_291).anInt2765 = 0;
	    ((Class338) aClass338_291).anInt2771 = argument_16_;
	    ((Class338) aClass338_291).anInt2793 = 0;
	    ((Class338) aClass338_291).anInt2764 = 0;
	    ((Class338) aClass338_291).anInt2773 = 0;
	    ((Class338) aClass338_291).anInt2794 = 0;
	    method406(aClass338_291);
	    argument_16_ -= ((Class338) aClass338_291).anInt2771;
	    ((Class338) aClass338_291).aByteArray2782 = null;
	    ((Class338) aClass338_291).aByteArray2769 = null;
	    return argument_16_;
	}
    }
    
    private static final void method406(Class338 argument) {
	boolean anLocalBoolean = false;
	boolean anLocalBoolean_20_ = false;
	boolean anLocalBoolean_21_ = false;
	boolean anLocalBoolean_22_ = false;
	boolean anLocalBoolean_23_ = false;
	boolean anLocalBoolean_24_ = false;
	boolean anLocalBoolean_25_ = false;
	boolean anLocalBoolean_26_ = false;
	boolean anLocalBoolean_27_ = false;
	boolean anLocalBoolean_28_ = false;
	boolean anLocalBoolean_29_ = false;
	boolean anLocalBoolean_30_ = false;
	boolean anLocalBoolean_31_ = false;
	boolean anLocalBoolean_32_ = false;
	boolean anLocalBoolean_33_ = false;
	boolean anLocalBoolean_34_ = false;
	boolean anLocalBoolean_35_ = false;
	boolean anLocalBoolean_36_ = false;
	int anLocalInt = 0;
	int[] anLocalInts = null;
	int[] anLocalInts_37_ = null;
	int[] anLocalInts_38_ = null;
	((Class338) argument).anInt2789 = 1;
	if (Class193.anIntArray1412 == null)
	    Class193.anIntArray1412
		= new int[((Class338) argument).anInt2789 * 100000];
	boolean anLocalBoolean_39_ = true;
	while (anLocalBoolean_39_) {
	    byte anLocalInt_40_ = method401(argument);
	    if (anLocalInt_40_ == 23)
		break;
	    anLocalInt_40_ = method401(argument);
	    anLocalInt_40_ = method401(argument);
	    anLocalInt_40_ = method401(argument);
	    anLocalInt_40_ = method401(argument);
	    anLocalInt_40_ = method401(argument);
	    anLocalInt_40_ = method401(argument);
	    anLocalInt_40_ = method401(argument);
	    anLocalInt_40_ = method401(argument);
	    anLocalInt_40_ = method401(argument);
	    anLocalInt_40_ = method400(argument);
	    ((Class338) argument).anInt2780 = 0;
	    int anLocalInt_41_ = method401(argument);
	    ((Class338) argument).anInt2780
		= ((Class338) argument).anInt2780 << 8 | anLocalInt_41_ & 0xff;
	    anLocalInt_41_ = method401(argument);
	    ((Class338) argument).anInt2780
		= ((Class338) argument).anInt2780 << 8 | anLocalInt_41_ & 0xff;
	    anLocalInt_41_ = method401(argument);
	    ((Class338) argument).anInt2780
		= ((Class338) argument).anInt2780 << 8 | anLocalInt_41_ & 0xff;
	    for (int anLocalInt_42_ = 0; anLocalInt_42_ < 16;
		 anLocalInt_42_++) {
		anLocalInt_40_ = method400(argument);
		if (anLocalInt_40_ == 1)
		    ((Class338) argument).aBooleanArray2795[anLocalInt_42_]
			= true;
		else
		    ((Class338) argument).aBooleanArray2795[anLocalInt_42_]
			= false;
	    }
	    for (int anLocalInt_43_ = 0; anLocalInt_43_ < 256;
		 anLocalInt_43_++)
		((Class338) argument).aBooleanArray2777[anLocalInt_43_]
		    = false;
	    for (int anLocalInt_44_ = 0; anLocalInt_44_ < 16;
		 anLocalInt_44_++) {
		if (((Class338) argument).aBooleanArray2795[anLocalInt_44_]) {
		    for (int anLocalInt_45_ = 0; anLocalInt_45_ < 16;
			 anLocalInt_45_++) {
			anLocalInt_40_ = method400(argument);
			if (anLocalInt_40_ == 1)
			    ((Class338) argument).aBooleanArray2777
				[anLocalInt_44_ * 16 + anLocalInt_45_]
				= true;
		    }
		}
	    }
	    method399(argument);
	    int anLocalInt_46_ = ((Class338) argument).anInt2778 + 2;
	    int anLocalInt_47_ = method404(3, argument);
	    int anLocalInt_48_ = method404(15, argument);
	    for (int anLocalInt_49_ = 0; anLocalInt_49_ < anLocalInt_48_;
		 anLocalInt_49_++) {
		int anLocalInt_50_ = 0;
		for (;;) {
		    anLocalInt_40_ = method400(argument);
		    if (anLocalInt_40_ == 0)
			break;
		    anLocalInt_50_++;
		}
		((Class338) argument).aByteArray2775[anLocalInt_49_]
		    = (byte) anLocalInt_50_;
	    }
	    byte[] anLocalInts_51_ = new byte[6];
	    for (byte anLocalInt_52_ = 0; anLocalInt_52_ < anLocalInt_47_;
		 anLocalInt_52_++)
		anLocalInts_51_[anLocalInt_52_] = anLocalInt_52_;
	    for (int anLocalInt_53_ = 0; anLocalInt_53_ < anLocalInt_48_;
		 anLocalInt_53_++) {
		byte anLocalInt_54_
		    = ((Class338) argument).aByteArray2775[anLocalInt_53_];
		byte anLocalInt_55_ = anLocalInts_51_[anLocalInt_54_];
		for (/**/; anLocalInt_54_ > 0; anLocalInt_54_--)
		    anLocalInts_51_[anLocalInt_54_]
			= anLocalInts_51_[anLocalInt_54_ - 1];
		anLocalInts_51_[0] = anLocalInt_55_;
		((Class338) argument).aByteArray2776[anLocalInt_53_]
		    = anLocalInt_55_;
	    }
	    for (int anLocalInt_56_ = 0; anLocalInt_56_ < anLocalInt_47_;
		 anLocalInt_56_++) {
		int anLocalInt_57_ = method404(5, argument);
		for (int anLocalInt_58_ = 0; anLocalInt_58_ < anLocalInt_46_;
		     anLocalInt_58_++) {
		    for (;;) {
			anLocalInt_40_ = method400(argument);
			if (anLocalInt_40_ == 0)
			    break;
			anLocalInt_40_ = method400(argument);
			if (anLocalInt_40_ == 0)
			    anLocalInt_57_++;
			else
			    anLocalInt_57_--;
		    }
		    ((Class338) argument).aByteArrayArray2785
			[anLocalInt_56_][anLocalInt_58_]
			= (byte) anLocalInt_57_;
		}
	    }
	    for (int anLocalInt_59_ = 0; anLocalInt_59_ < anLocalInt_47_;
		 anLocalInt_59_++) {
		int anLocalInt_60_ = 32;
		byte anLocalInt_61_ = 0;
		for (int anLocalInt_62_ = 0; anLocalInt_62_ < anLocalInt_46_;
		     anLocalInt_62_++) {
		    if ((((Class338) argument).aByteArrayArray2785
			 [anLocalInt_59_][anLocalInt_62_])
			> anLocalInt_61_)
			anLocalInt_61_
			    = (((Class338) argument).aByteArrayArray2785
			       [anLocalInt_59_][anLocalInt_62_]);
		    if ((((Class338) argument).aByteArrayArray2785
			 [anLocalInt_59_][anLocalInt_62_])
			< anLocalInt_60_)
			anLocalInt_60_
			    = (((Class338) argument).aByteArrayArray2785
			       [anLocalInt_59_][anLocalInt_62_]);
		}
		method403
		    (((Class338) argument).anIntArrayArray2774[anLocalInt_59_],
		     ((Class338) argument).anIntArrayArray2772[anLocalInt_59_],
		     ((Class338) argument).anIntArrayArray2763[anLocalInt_59_],
		     ((Class338) argument).aByteArrayArray2785[anLocalInt_59_],
		     anLocalInt_60_, anLocalInt_61_, anLocalInt_46_);
		((Class338) argument).anIntArray2792[anLocalInt_59_]
		    = anLocalInt_60_;
	    }
	    int anLocalInt_63_ = ((Class338) argument).anInt2778 + 1;
	    int anLocalInt_64_ = -1;
	    int anLocalInt_65_ = 0;
	    for (int anLocalInt_66_ = 0; anLocalInt_66_ <= 255;
		 anLocalInt_66_++)
		((Class338) argument).anIntArray2767[anLocalInt_66_] = 0;
	    int anLocalInt_67_ = 4095;
	    for (int anLocalInt_68_ = 15; anLocalInt_68_ >= 0;
		 anLocalInt_68_--) {
		for (int anLocalInt_69_ = 15; anLocalInt_69_ >= 0;
		     anLocalInt_69_--) {
		    ((Class338) argument).aByteArray2787[anLocalInt_67_]
			= (byte) (anLocalInt_68_ * 16 + anLocalInt_69_);
		    anLocalInt_67_--;
		}
		((Class338) argument).anIntArray2790[anLocalInt_68_]
		    = anLocalInt_67_ + 1;
	    }
	    int anLocalInt_70_ = 0;
	    if (anLocalInt_65_ == 0) {
		anLocalInt_64_++;
		anLocalInt_65_ = 50;
		byte anLocalInt_71_
		    = ((Class338) argument).aByteArray2776[anLocalInt_64_];
		anLocalInt
		    = ((Class338) argument).anIntArray2792[anLocalInt_71_];
		anLocalInts = (((Class338) argument).anIntArrayArray2774
			       [anLocalInt_71_]);
		anLocalInts_38_ = (((Class338) argument).anIntArrayArray2763
				   [anLocalInt_71_]);
		anLocalInts_37_ = (((Class338) argument).anIntArrayArray2772
				   [anLocalInt_71_]);
	    }
	    anLocalInt_65_--;
	    int anLocalInt_72_ = anLocalInt;
	    int anLocalInt_73_;
	    int anLocalInt_74_;
	    for (anLocalInt_74_ = method404(anLocalInt_72_, argument);
		 anLocalInt_74_ > anLocalInts[anLocalInt_72_];
		 anLocalInt_74_ = anLocalInt_74_ << 1 | anLocalInt_73_) {
		anLocalInt_72_++;
		anLocalInt_73_ = method400(argument);
	    }
	    int anLocalInt_75_
		= (anLocalInts_38_
		   [anLocalInt_74_ - anLocalInts_37_[anLocalInt_72_]]);
	    while (anLocalInt_75_ != anLocalInt_63_) {
		if (anLocalInt_75_ == 0 || anLocalInt_75_ == 1) {
		    int anLocalInt_76_ = -1;
		    int anLocalInt_77_ = 1;
		    do {
			if (anLocalInt_75_ == 0)
			    anLocalInt_76_ += anLocalInt_77_;
			else if (anLocalInt_75_ == 1)
			    anLocalInt_76_ += anLocalInt_77_ * 2;
			anLocalInt_77_ *= 2;
			if (anLocalInt_65_ == 0) {
			    anLocalInt_64_++;
			    anLocalInt_65_ = 50;
			    byte anLocalInt_78_
				= (((Class338) argument).aByteArray2776
				   [anLocalInt_64_]);
			    anLocalInt = (((Class338) argument).anIntArray2792
					  [anLocalInt_78_]);
			    anLocalInts
				= (((Class338) argument).anIntArrayArray2774
				   [anLocalInt_78_]);
			    anLocalInts_38_
				= (((Class338) argument).anIntArrayArray2763
				   [anLocalInt_78_]);
			    anLocalInts_37_
				= (((Class338) argument).anIntArrayArray2772
				   [anLocalInt_78_]);
			}
			anLocalInt_65_--;
			anLocalInt_72_ = anLocalInt;
			for (anLocalInt_74_
				 = method404(anLocalInt_72_, argument);
			     anLocalInt_74_ > anLocalInts[anLocalInt_72_];
			     anLocalInt_74_
				 = anLocalInt_74_ << 1 | anLocalInt_73_) {
			    anLocalInt_72_++;
			    anLocalInt_73_ = method400(argument);
			}
			anLocalInt_75_
			    = (anLocalInts_38_
			       [(anLocalInt_74_
				 - anLocalInts_37_[anLocalInt_72_])]);
		    } while (anLocalInt_75_ == 0 || anLocalInt_75_ == 1);
		    anLocalInt_76_++;
		    anLocalInt_41_
			= (((Class338) argument).aByteArray2783
			   [((((Class338) argument).aByteArray2787
			      [((Class338) argument).anIntArray2790[0]])
			     & 0xff)]);
		    ((Class338) argument).anIntArray2767[anLocalInt_41_ & 0xff]
			+= anLocalInt_76_;
		    for (/**/; anLocalInt_76_ > 0; anLocalInt_76_--) {
			Class193.anIntArray1412[anLocalInt_70_]
			    = anLocalInt_41_ & 0xff;
			anLocalInt_70_++;
		    }
		} else {
		    int anLocalInt_79_ = anLocalInt_75_ - 1;
		    if (anLocalInt_79_ < 16) {
			int anLocalInt_80_
			    = ((Class338) argument).anIntArray2790[0];
			anLocalInt_40_ = (((Class338) argument).aByteArray2787
					  [anLocalInt_80_ + anLocalInt_79_]);
			for (/**/; anLocalInt_79_ > 3; anLocalInt_79_ -= 4) {
			    int anLocalInt_81_
				= anLocalInt_80_ + anLocalInt_79_;
			    ((Class338) argument).aByteArray2787
				[anLocalInt_81_]
				= (((Class338) argument).aByteArray2787
				   [anLocalInt_81_ - 1]);
			    ((Class338) argument).aByteArray2787
				[anLocalInt_81_ - 1]
				= (((Class338) argument).aByteArray2787
				   [anLocalInt_81_ - 2]);
			    ((Class338) argument).aByteArray2787
				[anLocalInt_81_ - 2]
				= (((Class338) argument).aByteArray2787
				   [anLocalInt_81_ - 3]);
			    ((Class338) argument).aByteArray2787
				[anLocalInt_81_ - 3]
				= (((Class338) argument).aByteArray2787
				   [anLocalInt_81_ - 4]);
			}
			for (/**/; anLocalInt_79_ > 0; anLocalInt_79_--)
			    ((Class338) argument).aByteArray2787
				[anLocalInt_80_ + anLocalInt_79_]
				= (((Class338) argument).aByteArray2787
				   [anLocalInt_80_ + anLocalInt_79_ - 1]);
			((Class338) argument).aByteArray2787[anLocalInt_80_]
			    = anLocalInt_40_;
		    } else {
			int anLocalInt_82_ = anLocalInt_79_ / 16;
			int anLocalInt_83_ = anLocalInt_79_ % 16;
			int anLocalInt_84_ = ((((Class338) argument)
					       .anIntArray2790[anLocalInt_82_])
					      + anLocalInt_83_);
			anLocalInt_40_ = (((Class338) argument).aByteArray2787
					  [anLocalInt_84_]);
			for (/**/; (anLocalInt_84_
				    > (((Class338) argument).anIntArray2790
				       [anLocalInt_82_])); anLocalInt_84_--)
			    ((Class338) argument).aByteArray2787
				[anLocalInt_84_]
				= (((Class338) argument).aByteArray2787
				   [anLocalInt_84_ - 1]);
			((Class338) argument).anIntArray2790[anLocalInt_82_]++;
			for (/**/; anLocalInt_82_ > 0; anLocalInt_82_--) {
			    ((Class338) argument).anIntArray2790
				[anLocalInt_82_]--;
			    ((Class338) argument).aByteArray2787
				[(((Class338) argument).anIntArray2790
				  [anLocalInt_82_])]
				= (((Class338) argument).aByteArray2787
				   [(((Class338) argument).anIntArray2790
				     [anLocalInt_82_ - 1]) + 16 - 1]);
			}
			((Class338) argument).anIntArray2790[0]--;
			((Class338) argument).aByteArray2787
			    [((Class338) argument).anIntArray2790[0]]
			    = anLocalInt_40_;
			if (((Class338) argument).anIntArray2790[0] == 0) {
			    int anLocalInt_85_ = 4095;
			    for (int anLocalInt_86_ = 15; anLocalInt_86_ >= 0;
				 anLocalInt_86_--) {
				for (int anLocalInt_87_ = 15;
				     anLocalInt_87_ >= 0; anLocalInt_87_--) {
				    ((Class338) argument).aByteArray2787
					[anLocalInt_85_]
					= (((Class338) argument).aByteArray2787
					   [((((Class338) argument)
					      .anIntArray2790[anLocalInt_86_])
					     + anLocalInt_87_)]);
				    anLocalInt_85_--;
				}
				((Class338) argument).anIntArray2790
				    [anLocalInt_86_]
				    = anLocalInt_85_ + 1;
			    }
			}
		    }
		    ((Class338) argument).anIntArray2767
			[(((Class338) argument).aByteArray2783
			  [anLocalInt_40_ & 0xff]) & 0xff]++;
		    Class193.anIntArray1412[anLocalInt_70_]
			= (((Class338) argument).aByteArray2783
			   [anLocalInt_40_ & 0xff]) & 0xff;
		    anLocalInt_70_++;
		    if (anLocalInt_65_ == 0) {
			anLocalInt_64_++;
			anLocalInt_65_ = 50;
			byte anLocalInt_88_
			    = (((Class338) argument).aByteArray2776
			       [anLocalInt_64_]);
			anLocalInt = (((Class338) argument).anIntArray2792
				      [anLocalInt_88_]);
			anLocalInts = (((Class338) argument)
				       .anIntArrayArray2774[anLocalInt_88_]);
			anLocalInts_38_
			    = (((Class338) argument).anIntArrayArray2763
			       [anLocalInt_88_]);
			anLocalInts_37_
			    = (((Class338) argument).anIntArrayArray2772
			       [anLocalInt_88_]);
		    }
		    anLocalInt_65_--;
		    anLocalInt_72_ = anLocalInt;
		    for (anLocalInt_74_ = method404(anLocalInt_72_, argument);
			 anLocalInt_74_ > anLocalInts[anLocalInt_72_];
			 anLocalInt_74_
			     = anLocalInt_74_ << 1 | anLocalInt_73_) {
			anLocalInt_72_++;
			anLocalInt_73_ = method400(argument);
		    }
		    anLocalInt_75_
			= (anLocalInts_38_
			   [anLocalInt_74_ - anLocalInts_37_[anLocalInt_72_]]);
		}
	    }
	    ((Class338) argument).anInt2796 = 0;
	    ((Class338) argument).aByte2779 = (byte) 0;
	    ((Class338) argument).anIntArray2791[0] = 0;
	    for (int anLocalInt_89_ = 1; anLocalInt_89_ <= 256;
		 anLocalInt_89_++)
		((Class338) argument).anIntArray2791[anLocalInt_89_]
		    = ((Class338) argument).anIntArray2767[anLocalInt_89_ - 1];
	    for (int anLocalInt_90_ = 1; anLocalInt_90_ <= 256;
		 anLocalInt_90_++)
		((Class338) argument).anIntArray2791[anLocalInt_90_]
		    += (((Class338) argument).anIntArray2791
			[anLocalInt_90_ - 1]);
	    for (int anLocalInt_91_ = 0; anLocalInt_91_ < anLocalInt_70_;
		 anLocalInt_91_++) {
		anLocalInt_41_
		    = (byte) (Class193.anIntArray1412[anLocalInt_91_] & 0xff);
		Class193.anIntArray1412[(((Class338) argument).anIntArray2791
					 [anLocalInt_41_ & 0xff])]
		    |= anLocalInt_91_ << 8;
		((Class338) argument).anIntArray2791[anLocalInt_41_ & 0xff]++;
	    }
	    ((Class338) argument).anInt2781
		= (Class193.anIntArray1412[((Class338) argument).anInt2780]
		   >> 8);
	    ((Class338) argument).anInt2770 = 0;
	    ((Class338) argument).anInt2781
		= Class193.anIntArray1412[((Class338) argument).anInt2781];
	    ((Class338) argument).anInt2788
		= (byte) (((Class338) argument).anInt2781 & 0xff);
	    ((Class338) argument).anInt2781 >>= 8;
	    ((Class338) argument).anInt2770++;
	    ((Class338) argument).anInt2798 = anLocalInt_70_;
	    method407(argument);
	    if ((((Class338) argument).anInt2770
		 == ((Class338) argument).anInt2798 + 1)
		&& ((Class338) argument).anInt2796 == 0)
		anLocalBoolean_39_ = true;
	    else
		anLocalBoolean_39_ = false;
	}
    }
    
    private static final void method407(Class338 argument) {
	byte anLocalInt = ((Class338) argument).aByte2779;
	int anLocalInt_92_ = ((Class338) argument).anInt2796;
	int anLocalInt_93_ = ((Class338) argument).anInt2770;
	int anLocalInt_94_ = ((Class338) argument).anInt2788;
	int[] anLocalInts = Class193.anIntArray1412;
	int anLocalInt_95_ = ((Class338) argument).anInt2781;
	byte[] anLocalInts_96_ = ((Class338) argument).aByteArray2769;
	int anLocalInt_97_ = ((Class338) argument).anInt2765;
	int anLocalInt_98_ = ((Class338) argument).anInt2771;
	int anLocalInt_99_ = anLocalInt_98_;
	int anLocalInt_100_ = ((Class338) argument).anInt2798 + 1;
    while_46_:
	for (;;) {
	    if (anLocalInt_92_ > 0) {
		for (;;) {
		    if (anLocalInt_98_ == 0)
			break while_46_;
		    if (anLocalInt_92_ == 1)
			break;
		    anLocalInts_96_[anLocalInt_97_] = anLocalInt;
		    anLocalInt_92_--;
		    anLocalInt_97_++;
		    anLocalInt_98_--;
		}
		if (anLocalInt_98_ == 0) {
		    anLocalInt_92_ = 1;
		    break;
		}
		anLocalInts_96_[anLocalInt_97_] = anLocalInt;
		anLocalInt_97_++;
		anLocalInt_98_--;
	    }
	    for (;;) {
		if (anLocalInt_93_ == anLocalInt_100_) {
		    anLocalInt_92_ = 0;
		    break while_46_;
		}
		anLocalInt = (byte) anLocalInt_94_;
		anLocalInt_95_ = anLocalInts[anLocalInt_95_];
		int anLocalInt_101_ = (byte) anLocalInt_95_;
		anLocalInt_95_ >>= 8;
		anLocalInt_93_++;
		if (anLocalInt_101_ != anLocalInt_94_) {
		    anLocalInt_94_ = anLocalInt_101_;
		    if (anLocalInt_98_ == 0) {
			anLocalInt_92_ = 1;
			break while_46_;
		    }
		    anLocalInts_96_[anLocalInt_97_] = anLocalInt;
		    anLocalInt_97_++;
		    anLocalInt_98_--;
		} else {
		    if (anLocalInt_93_ != anLocalInt_100_)
			break;
		    if (anLocalInt_98_ == 0) {
			anLocalInt_92_ = 1;
			break while_46_;
		    }
		    anLocalInts_96_[anLocalInt_97_] = anLocalInt;
		    anLocalInt_97_++;
		    anLocalInt_98_--;
		}
	    }
	    anLocalInt_92_ = 2;
	    anLocalInt_95_ = anLocalInts[anLocalInt_95_];
	    int anLocalInt_102_ = (byte) anLocalInt_95_;
	    anLocalInt_95_ >>= 8;
	    if (++anLocalInt_93_ != anLocalInt_100_) {
		if (anLocalInt_102_ != anLocalInt_94_)
		    anLocalInt_94_ = anLocalInt_102_;
		else {
		    anLocalInt_92_ = 3;
		    anLocalInt_95_ = anLocalInts[anLocalInt_95_];
		    anLocalInt_102_ = (byte) anLocalInt_95_;
		    anLocalInt_95_ >>= 8;
		    if (++anLocalInt_93_ != anLocalInt_100_) {
			if (anLocalInt_102_ != anLocalInt_94_)
			    anLocalInt_94_ = anLocalInt_102_;
			else {
			    anLocalInt_95_ = anLocalInts[anLocalInt_95_];
			    anLocalInt_102_ = (byte) anLocalInt_95_;
			    anLocalInt_95_ >>= 8;
			    anLocalInt_93_++;
			    anLocalInt_92_ = (anLocalInt_102_ & 0xff) + 4;
			    anLocalInt_95_ = anLocalInts[anLocalInt_95_];
			    anLocalInt_94_ = (byte) anLocalInt_95_;
			    anLocalInt_95_ >>= 8;
			    anLocalInt_93_++;
			}
		    }
		}
	    }
	}
	int anLocalInt_103_ = ((Class338) argument).anInt2794;
	((Class338) argument).anInt2794 += anLocalInt_99_ - anLocalInt_98_;
	((Class338) argument).aByte2779 = anLocalInt;
	((Class338) argument).anInt2796 = anLocalInt_92_;
	((Class338) argument).anInt2770 = anLocalInt_93_;
	((Class338) argument).anInt2788 = anLocalInt_94_;
	Class193.anIntArray1412 = anLocalInts;
	((Class338) argument).anInt2781 = anLocalInt_95_;
	((Class338) argument).aByteArray2769 = anLocalInts_96_;
	((Class338) argument).anInt2765 = anLocalInt_97_;
	((Class338) argument).anInt2771 = anLocalInt_98_;
    }
}
