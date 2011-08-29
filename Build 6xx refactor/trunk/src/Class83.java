/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class83
{
    int[] anIntArray586;
    int anInt587;
    int anInt588;
    int anInt589;
    int anInt590;
    byte[] aByteArray591;
    byte[] aByteArray592;
    int anInt593;
    int anInt594;
    
    final int method1598() {
	return (((Class83) this).anInt587 + ((Class83) this).anInt589
		+ ((Class83) this).anInt594);
    }
    
    final void method1599() {
	int anLocalInt = method1600();
	int anLocalInt_0_ = method1598();
	if (((Class83) this).anInt590 != anLocalInt
	    || ((Class83) this).anInt587 != anLocalInt_0_) {
	    byte[] anLocalInts = new byte[anLocalInt * anLocalInt_0_];
	    if (((Class83) this).aByteArray592 != null) {
		byte[] anLocalInts_1_ = new byte[anLocalInt * anLocalInt_0_];
		for (int anLocalInt_2_ = 0;
		     anLocalInt_2_ < ((Class83) this).anInt587;
		     anLocalInt_2_++) {
		    int anLocalInt_3_
			= anLocalInt_2_ * ((Class83) this).anInt590;
		    int anLocalInt_4_
			= (((anLocalInt_2_ + ((Class83) this).anInt589)
			    * anLocalInt)
			   + ((Class83) this).anInt593);
		    for (int anLocalInt_5_ = 0;
			 anLocalInt_5_ < ((Class83) this).anInt590;
			 anLocalInt_5_++) {
			anLocalInts[anLocalInt_4_]
			    = ((Class83) this).aByteArray591[anLocalInt_3_];
			anLocalInts_1_[anLocalInt_4_++]
			    = ((Class83) this).aByteArray592[anLocalInt_3_++];
		    }
		}
		((Class83) this).aByteArray592 = anLocalInts_1_;
	    } else {
		for (int anLocalInt_6_ = 0;
		     anLocalInt_6_ < ((Class83) this).anInt587;
		     anLocalInt_6_++) {
		    int anLocalInt_7_
			= anLocalInt_6_ * ((Class83) this).anInt590;
		    int anLocalInt_8_
			= (((anLocalInt_6_ + ((Class83) this).anInt589)
			    * anLocalInt)
			   + ((Class83) this).anInt593);
		    for (int anLocalInt_9_ = 0;
			 anLocalInt_9_ < ((Class83) this).anInt590;
			 anLocalInt_9_++)
			anLocalInts[anLocalInt_8_++]
			    = ((Class83) this).aByteArray591[anLocalInt_7_++];
		}
	    }
	    ((Class83) this).anInt593 = ((Class83) this).anInt588
		= ((Class83) this).anInt589 = ((Class83) this).anInt594 = 0;
	    ((Class83) this).anInt590 = anLocalInt;
	    ((Class83) this).anInt587 = anLocalInt_0_;
	    ((Class83) this).aByteArray591 = anLocalInts;
	}
    }
    
    final int method1600() {
	return (((Class83) this).anInt590 + ((Class83) this).anInt593
		+ ((Class83) this).anInt588);
    }
    
    final void method1601(int argument_10_) {
	int anLocalInt = -1;
	if (((Class83) this).anIntArray586.length < 255) {
	    for (int anLocalInt_11_ = 0;
		 anLocalInt_11_ < ((Class83) this).anIntArray586.length;
		 anLocalInt_11_++) {
		if (((Class83) this).anIntArray586[anLocalInt_11_]
		    == argument_10_) {
		    anLocalInt = anLocalInt_11_;
		    break;
		}
	    }
	    if (anLocalInt == -1) {
		anLocalInt = ((Class83) this).anIntArray586.length;
		int[] anLocalInts
		    = new int[((Class83) this).anIntArray586.length + 1];
		JagStrings.memcpy(((Class83) this).anIntArray586, 0, anLocalInts, 0, ((Class83) this).anIntArray586.length);
		((Class83) this).anIntArray586 = anLocalInts;
		anLocalInts[anLocalInt] = argument_10_;
	    }
	} else {
	    int anLocalInt_12_ = 2147483647;
	    int anLocalInt_13_ = argument_10_ >> 16 & 0xff;
	    int anLocalInt_14_ = argument_10_ >> 8 & 0xff;
	    int anLocalInt_15_ = argument_10_ & 0xff;
	    for (int anLocalInt_16_ = 0;
		 anLocalInt_16_ < ((Class83) this).anIntArray586.length;
		 anLocalInt_16_++) {
		int anLocalInt_17_
		    = ((Class83) this).anIntArray586[anLocalInt_16_];
		int anLocalInt_18_ = anLocalInt_17_ >> 16 & 0xff;
		int anLocalInt_19_ = anLocalInt_17_ >> 8 & 0xff;
		int anLocalInt_20_ = anLocalInt_17_ & 0xff;
		int anLocalInt_21_ = anLocalInt_13_ - anLocalInt_18_;
		if (anLocalInt_21_ < 0)
		    anLocalInt_21_ = -anLocalInt_21_;
		int anLocalInt_22_ = anLocalInt_14_ - anLocalInt_19_;
		if (anLocalInt_22_ < 0)
		    anLocalInt_22_ = -anLocalInt_22_;
		int anLocalInt_23_ = anLocalInt_15_ - anLocalInt_20_;
		if (anLocalInt_23_ < 0)
		    anLocalInt_23_ = -anLocalInt_23_;
		int anLocalInt_24_
		    = anLocalInt_21_ + anLocalInt_22_ + anLocalInt_23_;
		if (anLocalInt_24_ < anLocalInt_12_) {
		    anLocalInt_12_ = anLocalInt_24_;
		    anLocalInt = anLocalInt_16_;
		}
	    }
	}
	for (int anLocalInt_25_ = ((Class83) this).anInt587 - 1;
	     anLocalInt_25_ > 0; anLocalInt_25_--) {
	    int anLocalInt_26_ = anLocalInt_25_ * ((Class83) this).anInt590;
	    for (int anLocalInt_27_ = ((Class83) this).anInt590 - 1;
		 anLocalInt_27_ > 0; anLocalInt_27_--) {
		if ((((Class83) this).anIntArray586
		     [(((Class83) this).aByteArray591
		       [anLocalInt_27_ + anLocalInt_26_]) & 0xff]) == 0
		    && (((Class83) this).anIntArray586
			[(((Class83) this).aByteArray591
			  [(anLocalInt_27_ + anLocalInt_26_ - 1
			    - ((Class83) this).anInt590)]) & 0xff]) != 0)
		    ((Class83) this).aByteArray591[(anLocalInt_27_
						    + anLocalInt_26_)]
			= (byte) anLocalInt;
	    }
	}
    }
    
    private static final Class83[] method1602(byte[] argument) {
	Packet class59_sub28 = new Packet(argument);
	((Packet) class59_sub28).pos = argument.length - 2;
	int anLocalInt = class59_sub28.g2();
	Class83[] class83s = new Class83[anLocalInt];
	for (int anLocalInt_28_ = 0; anLocalInt_28_ < anLocalInt;
	     anLocalInt_28_++)
	    class83s[anLocalInt_28_] = new Class83();
	((Packet) class59_sub28).pos
	    = argument.length - 7 - anLocalInt * 8;
	int anLocalInt_29_ = class59_sub28.g2();
	int anLocalInt_30_ = class59_sub28.g2();
	int anLocalInt_31_ = (class59_sub28.g1() & 0xff) + 1;
	for (int anLocalInt_32_ = 0; anLocalInt_32_ < anLocalInt;
	     anLocalInt_32_++)
	    ((Class83) class83s[anLocalInt_32_]).anInt593
		= class59_sub28.g2();
	for (int anLocalInt_33_ = 0; anLocalInt_33_ < anLocalInt;
	     anLocalInt_33_++)
	    ((Class83) class83s[anLocalInt_33_]).anInt589
		= class59_sub28.g2();
	for (int anLocalInt_34_ = 0; anLocalInt_34_ < anLocalInt;
	     anLocalInt_34_++)
	    ((Class83) class83s[anLocalInt_34_]).anInt590
		= class59_sub28.g2();
	for (int anLocalInt_35_ = 0; anLocalInt_35_ < anLocalInt;
	     anLocalInt_35_++)
	    ((Class83) class83s[anLocalInt_35_]).anInt587
		= class59_sub28.g2();
	for (int anLocalInt_36_ = 0; anLocalInt_36_ < anLocalInt;
	     anLocalInt_36_++) {
	    Class83 class83 = class83s[anLocalInt_36_];
	    ((Class83) class83).anInt588
		= (anLocalInt_29_ - ((Class83) class83).anInt590
		   - ((Class83) class83).anInt593);
	    ((Class83) class83).anInt594
		= (anLocalInt_30_ - ((Class83) class83).anInt587
		   - ((Class83) class83).anInt589);
	}
	((Packet) class59_sub28).pos
	    = argument.length - 7 - anLocalInt * 8 - (anLocalInt_31_ - 1) * 3;
	int[] anLocalInts = new int[anLocalInt_31_];
	for (int anLocalInt_37_ = 1; anLocalInt_37_ < anLocalInt_31_;
	     anLocalInt_37_++) {
	    anLocalInts[anLocalInt_37_] = class59_sub28.g3_dupl();
	    if (anLocalInts[anLocalInt_37_] == 0)
		anLocalInts[anLocalInt_37_] = 1;
	}
	for (int anLocalInt_38_ = 0; anLocalInt_38_ < anLocalInt;
	     anLocalInt_38_++)
	    ((Class83) class83s[anLocalInt_38_]).anIntArray586 = anLocalInts;
	((Packet) class59_sub28).pos = 0;
	for (int anLocalInt_39_ = 0; anLocalInt_39_ < anLocalInt;
	     anLocalInt_39_++) {
	    Class83 class83 = class83s[anLocalInt_39_];
	    int anLocalInt_40_
		= ((Class83) class83).anInt590 * ((Class83) class83).anInt587;
	    ((Class83) class83).aByteArray591 = new byte[anLocalInt_40_];
	    int anLocalInt_41_ = class59_sub28.g1();
	    if ((anLocalInt_41_ & 0x2) == 0) {
		if ((anLocalInt_41_ & 0x1) == 0) {
		    for (int anLocalInt_42_ = 0;
			 anLocalInt_42_ < anLocalInt_40_; anLocalInt_42_++)
			((Class83) class83).aByteArray591[anLocalInt_42_]
			    = class59_sub28.g1s();
		} else {
		    for (int anLocalInt_43_ = 0;
			 anLocalInt_43_ < ((Class83) class83).anInt590;
			 anLocalInt_43_++) {
			for (int anLocalInt_44_ = 0;
			     anLocalInt_44_ < ((Class83) class83).anInt587;
			     anLocalInt_44_++)
			    ((Class83) class83).aByteArray591
				[(anLocalInt_43_
				  + (anLocalInt_44_
				     * ((Class83) class83).anInt590))]
				= class59_sub28.g1s();
		    }
		}
	    } else {
		boolean anLocalBoolean = false;
		((Class83) class83).aByteArray592 = new byte[anLocalInt_40_];
		if ((anLocalInt_41_ & 0x1) == 0) {
		    for (int anLocalInt_45_ = 0;
			 anLocalInt_45_ < anLocalInt_40_; anLocalInt_45_++)
			((Class83) class83).aByteArray591[anLocalInt_45_]
			    = class59_sub28.g1s();
		    for (int anLocalInt_46_ = 0;
			 anLocalInt_46_ < anLocalInt_40_; anLocalInt_46_++) {
			byte anLocalInt_47_
			    = (((Class83) class83).aByteArray592
				   [anLocalInt_46_]
			       = class59_sub28.g1s());
			anLocalBoolean = anLocalBoolean | anLocalInt_47_ != -1;
		    }
		} else {
		    for (int anLocalInt_48_ = 0;
			 anLocalInt_48_ < ((Class83) class83).anInt590;
			 anLocalInt_48_++) {
			for (int anLocalInt_49_ = 0;
			     anLocalInt_49_ < ((Class83) class83).anInt587;
			     anLocalInt_49_++)
			    ((Class83) class83).aByteArray591
				[(anLocalInt_48_
				  + (anLocalInt_49_
				     * ((Class83) class83).anInt590))]
				= class59_sub28.g1s();
		    }
		    for (int anLocalInt_50_ = 0;
			 anLocalInt_50_ < ((Class83) class83).anInt590;
			 anLocalInt_50_++) {
			for (int anLocalInt_51_ = 0;
			     anLocalInt_51_ < ((Class83) class83).anInt587;
			     anLocalInt_51_++) {
			    byte anLocalInt_52_
				= (((Class83) class83).aByteArray592
				       [(anLocalInt_50_
					 + (anLocalInt_51_
					    * ((Class83) class83).anInt590))]
				   = class59_sub28.g1s());
			    anLocalBoolean
				= anLocalBoolean | anLocalInt_52_ != -1;
			}
		    }
		}
		if (!anLocalBoolean)
		    ((Class83) class83).aByteArray592 = null;
	    }
	}
	return class83s;
    }
    
    final void method1603(int argument_53_) {
	int anLocalInt = method1600();
	int anLocalInt_54_ = method1598();
	if (((Class83) this).anInt590 != anLocalInt
	    || ((Class83) this).anInt587 != anLocalInt_54_) {
	    int anLocalInt_55_ = argument_53_;
	    if (anLocalInt_55_ > ((Class83) this).anInt593)
		anLocalInt_55_ = ((Class83) this).anInt593;
	    int anLocalInt_56_ = argument_53_;
	    if ((anLocalInt_56_ + ((Class83) this).anInt593
		 + ((Class83) this).anInt590)
		> anLocalInt)
		anLocalInt_56_ = (anLocalInt - ((Class83) this).anInt593
				  - ((Class83) this).anInt590);
	    int anLocalInt_57_ = argument_53_;
	    if (anLocalInt_57_ > ((Class83) this).anInt589)
		anLocalInt_57_ = ((Class83) this).anInt589;
	    int anLocalInt_58_ = argument_53_;
	    if ((anLocalInt_58_ + ((Class83) this).anInt589
		 + ((Class83) this).anInt587)
		> anLocalInt_54_)
		anLocalInt_58_ = (anLocalInt_54_ - ((Class83) this).anInt589
				  - ((Class83) this).anInt587);
	    int anLocalInt_59_
		= ((Class83) this).anInt590 + anLocalInt_55_ + anLocalInt_56_;
	    int anLocalInt_60_
		= ((Class83) this).anInt587 + anLocalInt_57_ + anLocalInt_58_;
	    byte[] anLocalInts = new byte[anLocalInt_59_ * anLocalInt_60_];
	    if (((Class83) this).aByteArray592 == null) {
		for (int anLocalInt_61_ = 0;
		     anLocalInt_61_ < ((Class83) this).anInt587;
		     anLocalInt_61_++) {
		    int anLocalInt_62_
			= anLocalInt_61_ * ((Class83) this).anInt590;
		    int anLocalInt_63_
			= ((anLocalInt_61_ + anLocalInt_57_) * anLocalInt_59_
			   + anLocalInt_55_);
		    for (int anLocalInt_64_ = 0;
			 anLocalInt_64_ < ((Class83) this).anInt590;
			 anLocalInt_64_++)
			anLocalInts[anLocalInt_63_++]
			    = ((Class83) this).aByteArray591[anLocalInt_62_++];
		}
	    } else {
		byte[] anLocalInts_65_
		    = new byte[anLocalInt_59_ * anLocalInt_60_];
		for (int anLocalInt_66_ = 0;
		     anLocalInt_66_ < ((Class83) this).anInt587;
		     anLocalInt_66_++) {
		    int anLocalInt_67_
			= anLocalInt_66_ * ((Class83) this).anInt590;
		    int anLocalInt_68_
			= ((anLocalInt_66_ + anLocalInt_57_) * anLocalInt_59_
			   + anLocalInt_55_);
		    for (int anLocalInt_69_ = 0;
			 anLocalInt_69_ < ((Class83) this).anInt590;
			 anLocalInt_69_++) {
			anLocalInts_65_[anLocalInt_68_]
			    = ((Class83) this).aByteArray592[anLocalInt_67_];
			anLocalInts[anLocalInt_68_++]
			    = ((Class83) this).aByteArray591[anLocalInt_67_++];
		    }
		}
		((Class83) this).aByteArray592 = anLocalInts_65_;
	    }
	    ((Class83) this).anInt593 -= anLocalInt_55_;
	    ((Class83) this).anInt589 -= anLocalInt_57_;
	    ((Class83) this).anInt588 -= anLocalInt_56_;
	    ((Class83) this).anInt594 -= anLocalInt_58_;
	    ((Class83) this).anInt590 = anLocalInt_59_;
	    ((Class83) this).anInt587 = anLocalInt_60_;
	    ((Class83) this).aByteArray591 = anLocalInts;
	}
    }
    
    final void method1604() {
	byte[] anLocalInts = ((Class83) this).aByteArray591;
	if (((Class83) this).aByteArray592 == null) {
	    for (int anLocalInt = ((Class83) this).anInt587 - 1;
		 anLocalInt >= 0; anLocalInt--) {
		int anLocalInt_70_ = anLocalInt * ((Class83) this).anInt590;
		for (int anLocalInt_71_
			 = (anLocalInt + 1) * ((Class83) this).anInt590;
		     anLocalInt_70_ < anLocalInt_71_; anLocalInt_70_++) {
		    anLocalInt_71_--;
		    byte anLocalInt_72_ = anLocalInts[anLocalInt_70_];
		    anLocalInts[anLocalInt_70_] = anLocalInts[anLocalInt_71_];
		    anLocalInts[anLocalInt_71_] = anLocalInt_72_;
		}
	    }
	} else {
	    byte[] anLocalInts_73_ = ((Class83) this).aByteArray592;
	    for (int anLocalInt = ((Class83) this).anInt587 - 1;
		 anLocalInt >= 0; anLocalInt--) {
		int anLocalInt_74_ = anLocalInt * ((Class83) this).anInt590;
		for (int anLocalInt_75_
			 = (anLocalInt + 1) * ((Class83) this).anInt590;
		     anLocalInt_74_ < anLocalInt_75_; anLocalInt_74_++) {
		    anLocalInt_75_--;
		    byte anLocalInt_76_ = anLocalInts[anLocalInt_74_];
		    anLocalInts[anLocalInt_74_] = anLocalInts[anLocalInt_75_];
		    anLocalInts[anLocalInt_75_] = anLocalInt_76_;
		    anLocalInt_76_ = anLocalInts_73_[anLocalInt_74_];
		    anLocalInts_73_[anLocalInt_74_]
			= anLocalInts_73_[anLocalInt_75_];
		    anLocalInts_73_[anLocalInt_75_] = anLocalInt_76_;
		}
	    }
	}
	int anLocalInt = ((Class83) this).anInt593;
	((Class83) this).anInt593 = ((Class83) this).anInt588;
	((Class83) this).anInt588 = anLocalInt;
    }
    
    static final Class83[] method1605(Js5Store argument, int argument_77_) {
	byte[] anLocalInts = argument.getFlatData(argument_77_);
	if (anLocalInts == null)
	    return null;
	return method1602(anLocalInts);
    }
    
    final int[] method1606() {
	int anLocalInt = method1600();
	int[] anLocalInts = new int[anLocalInt * method1598()];
	if (((Class83) this).aByteArray592 != null) {
	    for (int anLocalInt_78_ = 0;
		 anLocalInt_78_ < ((Class83) this).anInt587;
		 anLocalInt_78_++) {
		int anLocalInt_79_
		    = anLocalInt_78_ * ((Class83) this).anInt590;
		int anLocalInt_80_
		    = (((Class83) this).anInt593
		       + ((anLocalInt_78_ + ((Class83) this).anInt589)
			  * anLocalInt));
		for (int anLocalInt_81_ = 0;
		     anLocalInt_81_ < ((Class83) this).anInt590;
		     anLocalInt_81_++) {
		    anLocalInts[anLocalInt_80_++]
			= (((Class83) this).aByteArray592[anLocalInt_79_] << 24
			   | (((Class83) this).anIntArray586
			      [(((Class83) this).aByteArray591[anLocalInt_79_]
				& 0xff)]));
		    anLocalInt_79_++;
		}
	    }
	} else {
	    for (int anLocalInt_82_ = 0;
		 anLocalInt_82_ < ((Class83) this).anInt587;
		 anLocalInt_82_++) {
		int anLocalInt_83_
		    = anLocalInt_82_ * ((Class83) this).anInt590;
		int anLocalInt_84_
		    = (((Class83) this).anInt593
		       + ((anLocalInt_82_ + ((Class83) this).anInt589)
			  * anLocalInt));
		for (int anLocalInt_85_ = 0;
		     anLocalInt_85_ < ((Class83) this).anInt590;
		     anLocalInt_85_++) {
		    int anLocalInt_86_
			= (((Class83) this).anIntArray586
			   [(((Class83) this).aByteArray591[anLocalInt_83_++]
			     & 0xff)]);
		    if (anLocalInt_86_ != 0)
			anLocalInts[anLocalInt_84_++]
			    = anLocalInt_86_ | ~0xffffff;
		    else
			anLocalInts[anLocalInt_84_++] = 0;
		}
	    }
	}
	return anLocalInts;
    }
    
    final void method1607(int argument_87_) {
	int anLocalInt = -1;
	if (((Class83) this).anIntArray586.length < 255) {
	    for (int anLocalInt_88_ = 0;
		 anLocalInt_88_ < ((Class83) this).anIntArray586.length;
		 anLocalInt_88_++) {
		if (((Class83) this).anIntArray586[anLocalInt_88_]
		    == argument_87_) {
		    anLocalInt = anLocalInt_88_;
		    break;
		}
	    }
	    if (anLocalInt == -1) {
		anLocalInt = ((Class83) this).anIntArray586.length;
		int[] anLocalInts
		    = new int[((Class83) this).anIntArray586.length + 1];
		JagStrings.memcpy(((Class83) this).anIntArray586, 0, anLocalInts, 0, ((Class83) this).anIntArray586.length);
		((Class83) this).anIntArray586 = anLocalInts;
		anLocalInts[anLocalInt] = argument_87_;
	    }
	} else {
	    int anLocalInt_89_ = 2147483647;
	    int anLocalInt_90_ = argument_87_ >> 16 & 0xff;
	    int anLocalInt_91_ = argument_87_ >> 8 & 0xff;
	    int anLocalInt_92_ = argument_87_ & 0xff;
	    for (int anLocalInt_93_ = 0;
		 anLocalInt_93_ < ((Class83) this).anIntArray586.length;
		 anLocalInt_93_++) {
		int anLocalInt_94_
		    = ((Class83) this).anIntArray586[anLocalInt_93_];
		int anLocalInt_95_ = anLocalInt_94_ >> 16 & 0xff;
		int anLocalInt_96_ = anLocalInt_94_ >> 8 & 0xff;
		int anLocalInt_97_ = anLocalInt_94_ & 0xff;
		int anLocalInt_98_ = anLocalInt_90_ - anLocalInt_95_;
		if (anLocalInt_98_ < 0)
		    anLocalInt_98_ = -anLocalInt_98_;
		int anLocalInt_99_ = anLocalInt_91_ - anLocalInt_96_;
		if (anLocalInt_99_ < 0)
		    anLocalInt_99_ = -anLocalInt_99_;
		int anLocalInt_100_ = anLocalInt_92_ - anLocalInt_97_;
		if (anLocalInt_100_ < 0)
		    anLocalInt_100_ = -anLocalInt_100_;
		int anLocalInt_101_
		    = anLocalInt_98_ + anLocalInt_99_ + anLocalInt_100_;
		if (anLocalInt_101_ < anLocalInt_89_) {
		    anLocalInt_89_ = anLocalInt_101_;
		    anLocalInt = anLocalInt_93_;
		}
	    }
	}
	int anLocalInt_102_ = 0;
	byte[] anLocalInts
	    = new byte[((Class83) this).anInt590 * ((Class83) this).anInt587];
	for (int anLocalInt_103_ = 0;
	     anLocalInt_103_ < ((Class83) this).anInt587; anLocalInt_103_++) {
	    for (int anLocalInt_104_ = 0;
		 anLocalInt_104_ < ((Class83) this).anInt590;
		 anLocalInt_104_++) {
		int anLocalInt_105_
		    = ((Class83) this).aByteArray591[anLocalInt_102_] & 0xff;
		if (((Class83) this).anIntArray586[anLocalInt_105_] == 0) {
		    if (anLocalInt_104_ > 0
			&& (((Class83) this).anIntArray586
			    [(((Class83) this).aByteArray591
			      [anLocalInt_102_ - 1]) & 0xff]) != 0)
			anLocalInt_105_ = anLocalInt;
		    else if (anLocalInt_103_ > 0
			     && ((((Class83) this).anIntArray586
				  [(((Class83) this).aByteArray591
				    [(anLocalInt_102_
				      - ((Class83) this).anInt590)]) & 0xff])
				 != 0))
			anLocalInt_105_ = anLocalInt;
		    else if (anLocalInt_104_ < ((Class83) this).anInt590 - 1
			     && (((Class83) this).anIntArray586
				 [(((Class83) this).aByteArray591
				   [anLocalInt_102_ + 1]) & 0xff]) != 0)
			anLocalInt_105_ = anLocalInt;
		    else if (anLocalInt_103_ < ((Class83) this).anInt587 - 1
			     && ((((Class83) this).anIntArray586
				  [(((Class83) this).aByteArray591
				    [(anLocalInt_102_
				      + ((Class83) this).anInt590)]) & 0xff])
				 != 0))
			anLocalInt_105_ = anLocalInt;
		}
		anLocalInts[anLocalInt_102_++] = (byte) anLocalInt_105_;
	    }
	}
	((Class83) this).aByteArray591 = anLocalInts;
    }
    
    static final Class83[] method1608(Js5Store argument, int argument_106_,
				      int argument_107_) {
	byte[] anLocalInts
	    = argument.getData(argument_106_, argument_107_);
	if (anLocalInts == null)
	    return null;
	return method1602(anLocalInts);
    }
    
    static final Class83 method1609(Js5Store argument, int argument_108_) {
	byte[] anLocalInts = argument.getFlatData(argument_108_);
	if (anLocalInts == null)
	    return null;
	return method1602(anLocalInts)[0];
    }
    
    final void method1610() {
	byte[] anLocalInts
	    = new byte[((Class83) this).anInt590 * ((Class83) this).anInt587];
	int anLocalInt = 0;
	if (((Class83) this).aByteArray592 == null) {
	    for (int anLocalInt_109_ = 0;
		 anLocalInt_109_ < ((Class83) this).anInt590;
		 anLocalInt_109_++) {
		for (int anLocalInt_110_ = ((Class83) this).anInt587 - 1;
		     anLocalInt_110_ >= 0; anLocalInt_110_--)
		    anLocalInts[anLocalInt++]
			= (((Class83) this).aByteArray591
			   [(anLocalInt_109_
			     + anLocalInt_110_ * ((Class83) this).anInt590)]);
	    }
	    ((Class83) this).aByteArray591 = anLocalInts;
	} else {
	    byte[] anLocalInts_111_
		= (new byte
		   [((Class83) this).anInt590 * ((Class83) this).anInt587]);
	    for (int anLocalInt_112_ = 0;
		 anLocalInt_112_ < ((Class83) this).anInt590;
		 anLocalInt_112_++) {
		for (int anLocalInt_113_ = ((Class83) this).anInt587 - 1;
		     anLocalInt_113_ >= 0; anLocalInt_113_--) {
		    anLocalInts[anLocalInt]
			= (((Class83) this).aByteArray591
			   [(anLocalInt_112_
			     + anLocalInt_113_ * ((Class83) this).anInt590)]);
		    anLocalInts_111_[anLocalInt++]
			= (((Class83) this).aByteArray592
			   [(anLocalInt_112_
			     + anLocalInt_113_ * ((Class83) this).anInt590)]);
		}
	    }
	    ((Class83) this).aByteArray591 = anLocalInts;
	    ((Class83) this).aByteArray592 = anLocalInts_111_;
	}
	int anLocalInt_114_ = ((Class83) this).anInt589;
	((Class83) this).anInt589 = ((Class83) this).anInt593;
	((Class83) this).anInt593 = ((Class83) this).anInt594;
	((Class83) this).anInt594 = ((Class83) this).anInt588;
	((Class83) this).anInt588 = ((Class83) this).anInt589;
	anLocalInt_114_ = ((Class83) this).anInt587;
	((Class83) this).anInt587 = ((Class83) this).anInt590;
	((Class83) this).anInt590 = anLocalInt_114_;
    }
    
    final void method1611() {
	byte[] anLocalInts = ((Class83) this).aByteArray591;
	if (((Class83) this).aByteArray592 == null) {
	    for (int anLocalInt = (((Class83) this).anInt587 >> 1) - 1;
		 anLocalInt >= 0; anLocalInt--) {
		int anLocalInt_115_ = anLocalInt * ((Class83) this).anInt590;
		int anLocalInt_116_
		    = ((((Class83) this).anInt587 - anLocalInt - 1)
		       * ((Class83) this).anInt590);
		for (int anLocalInt_117_ = -((Class83) this).anInt590;
		     anLocalInt_117_ < 0; anLocalInt_117_++) {
		    byte anLocalInt_118_ = anLocalInts[anLocalInt_115_];
		    anLocalInts[anLocalInt_115_]
			= anLocalInts[anLocalInt_116_];
		    anLocalInts[anLocalInt_116_] = anLocalInt_118_;
		    anLocalInt_115_++;
		    anLocalInt_116_++;
		}
	    }
	} else {
	    byte[] anLocalInts_119_ = ((Class83) this).aByteArray592;
	    for (int anLocalInt = (((Class83) this).anInt587 >> 1) - 1;
		 anLocalInt >= 0; anLocalInt--) {
		int anLocalInt_120_ = anLocalInt * ((Class83) this).anInt590;
		int anLocalInt_121_
		    = ((((Class83) this).anInt587 - anLocalInt - 1)
		       * ((Class83) this).anInt590);
		for (int anLocalInt_122_ = -((Class83) this).anInt590;
		     anLocalInt_122_ < 0; anLocalInt_122_++) {
		    byte anLocalInt_123_ = anLocalInts[anLocalInt_120_];
		    anLocalInts[anLocalInt_120_]
			= anLocalInts[anLocalInt_121_];
		    anLocalInts[anLocalInt_121_] = anLocalInt_123_;
		    anLocalInt_123_ = anLocalInts_119_[anLocalInt_120_];
		    anLocalInts_119_[anLocalInt_120_]
			= anLocalInts_119_[anLocalInt_121_];
		    anLocalInts_119_[anLocalInt_121_] = anLocalInt_123_;
		    anLocalInt_120_++;
		    anLocalInt_121_++;
		}
	    }
	}
	int anLocalInt = ((Class83) this).anInt589;
	((Class83) this).anInt589 = ((Class83) this).anInt594;
	((Class83) this).anInt594 = anLocalInt;
    }
    
    static final Class83 method1612(Js5Store argument, int argument_124_,
				    int argument_125_) {
	byte[] anLocalInts
	    = argument.getData(argument_124_, argument_125_);
	if (anLocalInts == null)
	    return null;
	return method1602(anLocalInts)[0];
    }
    
    public Class83() {
	/* empty */
    }
}
