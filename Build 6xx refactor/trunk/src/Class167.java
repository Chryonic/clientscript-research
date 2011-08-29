/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class167
{
    static Class166 aClass166_1219 = new Class166(46, 2);
    boolean aBoolean1220 = false;
    static Class76 aClass76_1221;
    static short[][][] aShortArrayArrayArray1222;
    static long aLong1223;
    static int anInt1224;
    static int anInt1225 = 0;
    private static short[][] aShortArrayArray1226
	= { new short[0], new short[0], new short[0], new short[0],
	    new short[0] };
    private static short[][] aShortArrayArray1227
	= { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433,
	      2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571,
	      908, 21830, 28946, -15701, -14010 },
	    { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153,
	      -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650,
	      -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010,
	      7085, 4001, 317, 918, 9517, 9125, 3608, 16450, -32593, 22026,
	      2700, -22256, 10289, 3877, -27999, 10770, 8982, 3753, 10275, 924,
	      8637, -26428, 26785, -15202, 8736, 2994, -25710, 928, 6859,
	      -25016, -5449, -14823, -23401, 12, -22456, -27471, -11229, 21673,
	      57, -24046, -27190, -22877, -30041, 20013, 21596, -31414, 29000,
	      -11209, 6361, -25552, -25450, -14174, -10998, -27357, 3249, 7465,
	      8913, 13774, 4584, 11728, 10454, 8123, 2619, 13756, -28220,
	      -26323, -23901, -31385, -32342, -29806, -29902, -24128, 933,
	      1189, 3873, 6057, 8590, 1812, 4895, -5366, 15019, 20793, 7599,
	      9536, 21778, 14102, 6938, 14648, 5919, 6472, 10128, 17940, 3226,
	      267, 5421, -27570, -25177, -26319, -28217, -28132, -23792,
	      -23249, -23001, -19033, 5427, 6340, 5673, 2458, 3625, 8646, 5186,
	      10382, 6826, 7442, 158, 2454, 9655, -27496, -27578, -31687,
	      11146, 18712, 10785, 21902, 10566, 9500, 11819, 11144, -15965,
	      -24170, -32488, -29277, 29097, -9567, -18794, -27116, 921, 6028,
	      2974, -5230, 6550, 15244, 14, 49, 3994, 2332, 6038, -31701, 520,
	      41, 9402, -4825, 28978, -25278, 30876, 13475, -28395, -24010,
	      -14027, -22454, -18158, 20503, -27618, -22258, -1776, -31468,
	      9616, 7333, 650, 784, 796, 813, -616, -3194, -8152, 1686, 29074,
	      22422, -32245, 29084, 22411, -22000, 3982, 7062, 10382, 3230,
	      8076, 20, 1936, 10, -22473, 4892, 5805, 5904, 10, 48, 1936, 5640,
	      8472, -25529 },
	    { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094,
	      10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650,
	      -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010,
	      7085, 4001, 317, 918, 9517, 9125, 3608, 16450, -32593, 22026,
	      2700, -22256, 10289, 3877, -27999, 10770, 8982, 3753, 10275, 924,
	      8637, -26428, 26785, -15202, 8736, 2994, -25710, 928, 6859,
	      -25016, -5449, -14823, -23401, 12, -22456, -27471, -11229, 21673,
	      57, -24046, -27190, -22877, -30041, 20013, 21596, -31414, 29000,
	      -11209, 6361, -25552, -25450, -14174, -10998, -27357, 3249, 7465,
	      8913, 13774, 4584, 11728, 10454, 8123, 2619, 13756, -28220,
	      -26323, -23901, -31385, -32342, -29806, -29902, -24128, 933,
	      1189, 3873, 6057, 8590, 1812, 4895, -5366, 15019, 20793, 7599,
	      9536, 21778, 14102, 6938, 14648, 5919, 6472, 10128, 17940, 3226,
	      267, 5421, -27570, -25177, -26319, -28217, -28132, -23792,
	      -23249, -23001, -19033, 5427, 6340, 5673, 2458, 3625, 8646, 5186,
	      10382, 6826, 7442, 158, 2454, 9655, -27496, -27578, -31687,
	      11146, 18712, 10785, 21902, 10566, 9500, 11819, 11144, -15965,
	      -24170, -32488, -29277, 29097, -9567, -18794, -27116, 921, 6028,
	      2974, -5230, 6550, 15244, 14, 49, 3994, 2332, 6038, -31701, 520,
	      41, 9402, -4825, 28978, -25278, 30876, 13475, -28395, -24010,
	      -14027, -22454, -18158, 20503, -27618, -22258, -1776, -31468,
	      9616, 7333, 650, 784, 796, 813, -616, -3194, -8152, 1686, 29074,
	      22422, -32245, 29084, 22411, -22000, 3982, 7062, 10382, 3230,
	      8076, 20, 1936, 10, -22473, 4892, 5805, 5904, 10, 48, 1936, 5640,
	      8472, -25529 },
	    { 4626, 11146, 6439, 12, 4758, 10270, 7085, 4001, 317, 918, 9517,
	      9125, 3608, 16450, -32593, 22026, 2700, -22256, 10289, 3877,
	      -27999, 10770, 8982, 3753, 10275, 924, 8637, -26428, 26785,
	      -15202, 8736, 2994, -25710, 928, 6859, -25016, -5449, -14823,
	      -23401, 12, -22456, -27471, -11229, 21673, 57, -24046, -27190,
	      -22877, -30041, 20013, 21596, -31414, 29000, -11209, 6361,
	      -25552, -25450, -14174, -10998, -27357, 3249, 7465, 8913, 13774,
	      4584, 11728, 10454, 8123, 2619, 13756, -28220, -26323, -23901,
	      -31385, -32342, -29806, -29902, -24128, 933, 1189, 3873, 6057,
	      8590, 1812, 4895, -5366, 15019, 20793, 7599, 9536, 21778, 14102,
	      6938, 14648, 5919, 6472, 10128, 17940, 3226, 267, 5421, -27570,
	      -25177, -26319, -28217, -28132, -23792, -23249, -23001, -19033,
	      5427, 6340, 5673, 2458, 3625, 8646, 5186, 10382, 6826, 7442, 158,
	      2454, 9655, -27496, -27578, -31687, 11146, 18712, 10785, 21902,
	      10566, 9500, 11819, 11144, -15965, -24170, -32488, -29277, 29097,
	      -9567, -18794, -27116, 921, 6028, 2974, -5230, 6550, 15244, 14,
	      49, 3994, 2332, 6038, -31701, 520, 41, 9402, -4825, 28978,
	      -25278, 30876, 13475, -28395, -24010, -14027, -22454, -18158,
	      20503, -27618, -22258, -1776, -31468, 9616, 7333, 650, 784, 796,
	      813, -616, -3194, -8152, 1686, 29074, 22422, -32245, 29084,
	      22411, -22000, 3982, 7062, 10382, 3230, 8076, 20, 1936, 10,
	      -22473, 4892, 5805, 5904, 10, 48, 1936, 5640, 8472, -25529 },
	    { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 4444, 4328, 7052,
	      4490 } };
    private static short[][] aShortArrayArray1229;

    abstract void O(int argument_0_, int argument_1_, int argument_2_);
    
    abstract boolean method2637(int argument_3_, int argument_4_,
				Class350 argument_5_, boolean argument_6_,
				int argument_7_, int argument_8_);
    
    abstract boolean r();
    
    final void method2638(int argument_9_, DoublyLinkedNode_Sub51_Sub6 argument_10_,
			  int argument_11_) {
	if (argument_9_ != -1) {
	    method2647();
	    if (!NA())
		method2654();
	    else {
		Class14 class14 = (((DoublyLinkedNode_Sub51_Sub6) argument_10_)
				   .aClass14Array6246[argument_9_]);
		Node_Sub11 class59_sub11
		    = ((Class14) class14).aClass59_Sub11_99;
		for (int anLocalInt = argument_11_;
		     ((Class14) class14).anInt106 > anLocalInt; anLocalInt++) {
		    short anLocalInt_12_
			= ((Class14) class14).aShortArray98[anLocalInt];
		    if (((Node_Sub11) class59_sub11).aBooleanArray3941
			[anLocalInt_12_]) {
			if (((Class14) class14).aShortArray103[anLocalInt]
			    != -1)
			    P(0, 0, 0, 0);
			P((((Node_Sub11) class59_sub11).anIntArray3944
			   [anLocalInt_12_]),
			  ((Class14) class14).aShortArray102[anLocalInt],
			  ((Class14) class14).aShortArray105[anLocalInt],
			  ((Class14) class14).aShortArray108[anLocalInt]);
		    }
		}
		wa();
		method2654();
	    }
	}
    }
    
    public static void method2639(int argument) {
	aClass76_1221 = null;
	aShortArrayArray1229 = null;
	aClass166_1219 = null;
	aShortArrayArrayArray1222 = null;
	aShortArrayArray1227 = null;
	aShortArrayArray1226 = null;
    }
    
    abstract void FA(int argument_13_);
    
    abstract void H(int argument_14_, int argument_15_, int argument_16_);
    
    abstract void k(int argument_17_);
    
    abstract void method2640(Class350 argument_18_, DoublyLinkedNodeP2_Sub9 argument_19_,
			     int argument_20_);
    
    abstract Class38[] method2641();
    
    abstract int ma();
    
    final void method2642(int argument_21_, Class_s argument_22_,
			  int argument_23_, int argument_24_, int argument_25_,
			  int argument_26_, int argument_27_, int argument_28_,
			  int argument_29_) {
	boolean anLocalBoolean = false;
	boolean anLocalBoolean_30_ = false;
	boolean anLocalBoolean_31_ = false;
	int anLocalInt = -argument_26_ / 2;
	int anLocalInt_32_ = -argument_27_ / 2;
	int anLocalInt_33_
	    = argument_22_.method3541(anLocalInt_32_ + argument_29_, 0,
				      anLocalInt + argument_28_);
	int anLocalInt_34_ = argument_26_ / 2;
	int anLocalInt_35_ = -argument_27_ / 2;
	int anLocalInt_36_
	    = argument_22_.method3541(argument_29_ + anLocalInt_35_, 0,
				      anLocalInt_34_ + argument_28_);
	int anLocalInt_37_ = -argument_26_ / 2;
	int anLocalInt_38_ = argument_27_ / 2;
	int anLocalInt_39_
	    = argument_22_.method3541(anLocalInt_38_ + argument_29_, 0,
				      argument_28_ + anLocalInt_37_);
	int anLocalInt_40_ = argument_26_ / 2;
	int anLocalInt_41_ = argument_27_ / 2;
	int anLocalInt_42_
	    = argument_22_.method3541(argument_29_ + anLocalInt_41_, 0,
				      anLocalInt_40_ + argument_28_);
	int anLocalInt_43_ = (anLocalInt_36_ <= anLocalInt_33_ ? anLocalInt_36_
			      : anLocalInt_33_);
	int anLocalInt_44_ = (anLocalInt_39_ < anLocalInt_42_ ? anLocalInt_39_
			      : anLocalInt_42_);
	int anLocalInt_45_ = (anLocalInt_36_ < anLocalInt_42_ ? anLocalInt_36_
			      : anLocalInt_42_);
	if (argument_27_ != 0) {
	    int anLocalInt_46_
		= (int) (Math.atan2((double) (anLocalInt_43_ - anLocalInt_44_),
				    (double) argument_27_)
			 * 2607.5945876176133) & 0x3fff;
	    if (anLocalInt_46_ != 0) {
		if (argument_24_ != 0) {
		    if (anLocalInt_46_ > 8192) {
			int anLocalInt_47_ = 16384 - argument_24_;
			if (anLocalInt_46_ < anLocalInt_47_)
			    anLocalInt_46_ = anLocalInt_47_;
		    } else if (argument_24_ < anLocalInt_46_)
			anLocalInt_46_ = argument_24_;
		}
		FA(anLocalInt_46_);
	    }
	}
	int anLocalInt_48_ = (anLocalInt_33_ < anLocalInt_39_ ? anLocalInt_33_
			      : anLocalInt_39_);
	if (argument_26_ != 0) {
	    int anLocalInt_49_
		= (int) (Math.atan2((double) (anLocalInt_48_ - anLocalInt_45_),
				    (double) argument_26_)
			 * 2607.5945876176133) & 0x3fff;
	    if (anLocalInt_49_ != 0) {
		if (argument_25_ != 0) {
		    if (anLocalInt_49_ > 8192) {
			int anLocalInt_50_ = -argument_25_ + 16384;
			if (anLocalInt_49_ < anLocalInt_50_)
			    anLocalInt_49_ = anLocalInt_50_;
		    } else if (argument_25_ < anLocalInt_49_)
			anLocalInt_49_ = argument_25_;
		}
		VA(anLocalInt_49_);
	    }
	}
	int anLocalInt_51_ = anLocalInt_33_ + anLocalInt_42_;
	if (anLocalInt_39_ + anLocalInt_36_ < anLocalInt_51_)
	    anLocalInt_51_ = anLocalInt_39_ + anLocalInt_36_;
	anLocalInt_51_ = -argument_21_ + (anLocalInt_51_ >> 1);
	if (anLocalInt_51_ != 0)
	    H(0, anLocalInt_51_, 0);
    }
    
    abstract int G();
    
    abstract void method2643(Class350 argument_52_, int argument_53_,
			     boolean argument_54_);
    
    final void method2644
	(int argument_55_, boolean argument_56_, int argument_57_,
	 int argument_58_, int[] argument_59_, int argument_60_,
	 boolean argument_61_, DoublyLinkedNode_Sub51_Sub6 argument_62_,
	 int argument_63_, int argument_64_, DoublyLinkedNode_Sub51_Sub6 argument_65_) {
	if (argument_63_ != -1) {
	    method2647();
	    if (!NA())
		method2654();
	    else {
		Class14 class14 = (((DoublyLinkedNode_Sub51_Sub6) argument_65_)
				   .aClass14Array6246[argument_63_]);
		Node_Sub11 class59_sub11
		    = ((Class14) class14).aClass59_Sub11_99;
		Class14 class14_66_ = null;
		if (argument_62_ != null) {
		    class14_66_ = (((DoublyLinkedNode_Sub51_Sub6) argument_62_)
				   .aClass14Array6246[argument_64_]);
		    if (((Class14) class14_66_).aClass59_Sub11_99
			!= class59_sub11)
			class14_66_ = null;
		}
		method2648(class14_66_, class59_sub11, argument_55_,
			   argument_56_, 125, argument_57_, argument_60_,
			   false, null, class14, argument_59_, argument_58_);
		wa();
		method2654();
	    }
	}
    }
    
    abstract int RA();
    
    abstract int da();
    
    abstract int na();
    
    abstract boolean method2645(int argument_67_, int argument_68_,
				Class350 argument_69_, boolean argument_70_,
				int argument_71_);
    
    abstract void method2646(Class350 argument_72_, DoublyLinkedNodeP2_Sub9 argument_73_,
			     int argument_74_, int argument_75_);
    
    abstract void method2647();
    
    abstract void wa();
    
    private final void method2648
	(Class14 argument_76_, Node_Sub11 argument_77_, int argument_78_,
	 boolean argument_79_, int argument_80_, int argument_81_,
	 int argument_82_, boolean argument_83_, boolean[] argument_84_,
	 Class14 argument_85_, int[] argument_86_, int argument_87_) {
	if (argument_76_ == null || argument_81_ == 0) {
	    for (int anLocalInt = 0;
		 ((Class14) argument_85_).anInt106 > anLocalInt;
		 anLocalInt++) {
		short anLocalInt_88_
		    = ((Class14) argument_85_).aShortArray98[anLocalInt];
		if (argument_84_ == null
		    || argument_83_ == argument_84_[anLocalInt_88_]
		    || (((Node_Sub11) argument_77_).anIntArray3944
			[anLocalInt_88_]) == 0) {
		    short anLocalInt_89_
			= ((Class14) argument_85_).aShortArray103[anLocalInt];
		    if (anLocalInt_89_ != -1)
			method2650(((((Node_Sub11) argument_77_)
				     .anIntArray3940[anLocalInt_89_])
				    & argument_87_),
				   0, argument_79_, argument_78_, 0,
				   (((Node_Sub11) argument_77_)
				    .anIntArrayArray3943[anLocalInt_89_]),
				   argument_86_, false, 0, 0);
		    method2650
			(argument_87_ & (((Node_Sub11) argument_77_)
					 .anIntArray3940[anLocalInt_88_]),
			 ((Class14) argument_85_).aShortArray108[anLocalInt],
			 argument_79_, argument_78_,
			 ((Class14) argument_85_).aShortArray102[anLocalInt],
			 (((Node_Sub11) argument_77_).anIntArrayArray3943
			  [anLocalInt_88_]),
			 argument_86_, false,
			 ((Class14) argument_85_).aShortArray105[anLocalInt],
			 (((Node_Sub11) argument_77_).anIntArray3944
			  [anLocalInt_88_]));
		}
	    }
	} else {
	    int anLocalInt = 0;
	    if (argument_80_ <= 92)
		aLong1223 = -127L;
	    int anLocalInt_90_ = 0;
	    for (int anLocalInt_91_ = 0;
		 ((Node_Sub11) argument_77_).anInt3942 > anLocalInt_91_;
		 anLocalInt_91_++) {
		boolean anLocalBoolean = false;
		if (((Class14) argument_85_).anInt106 > anLocalInt
		    && (((Class14) argument_85_).aShortArray98[anLocalInt]
			== anLocalInt_91_))
		    anLocalBoolean = true;
		boolean anLocalBoolean_92_ = false;
		if (anLocalInt_90_ < ((Class14) argument_76_).anInt106
		    && anLocalInt_91_ == (((Class14) argument_76_)
					  .aShortArray98[anLocalInt_90_]))
		    anLocalBoolean_92_ = true;
		if (anLocalBoolean || anLocalBoolean_92_) {
		    if (argument_84_ != null
			&& argument_83_ != argument_84_[anLocalInt_91_]
			&& (((Node_Sub11) argument_77_).anIntArray3944
			    [anLocalInt_91_]) != 0) {
			if (anLocalBoolean_92_)
			    anLocalInt_90_++;
			if (anLocalBoolean)
			    anLocalInt++;
		    } else {
			int anLocalInt_93_ = 0;
			int anLocalInt_94_ = (((Node_Sub11) argument_77_)
					      .anIntArray3944[anLocalInt_91_]);
			if (anLocalInt_94_ == 3 || anLocalInt_94_ == 10)
			    anLocalInt_93_ = 128;
			int anLocalInt_95_;
			byte anLocalInt_96_;
			short anLocalInt_97_;
			int anLocalInt_98_;
			int anLocalInt_99_;
			if (!anLocalBoolean) {
			    anLocalInt_96_ = (byte) 0;
			    anLocalInt_97_ = (short) -1;
			    anLocalInt_95_ = anLocalInt_93_;
			    anLocalInt_99_ = anLocalInt_93_;
			    anLocalInt_98_ = anLocalInt_93_;
			} else {
			    anLocalInt_95_ = (((Class14) argument_85_)
					      .aShortArray105[anLocalInt]);
			    anLocalInt_96_ = (((Class14) argument_85_)
					      .aByteArray113[anLocalInt]);
			    anLocalInt_97_ = (((Class14) argument_85_)
					      .aShortArray103[anLocalInt]);
			    anLocalInt_98_ = (((Class14) argument_85_)
					      .aShortArray108[anLocalInt]);
			    anLocalInt_99_ = (((Class14) argument_85_)
					      .aShortArray102[anLocalInt]);
			    anLocalInt++;
			}
			int anLocalInt_100_;
			byte anLocalInt_101_;
			short anLocalInt_102_;
			int anLocalInt_103_;
			int anLocalInt_104_;
			if (!anLocalBoolean_92_) {
			    anLocalInt_104_ = anLocalInt_93_;
			    anLocalInt_102_ = (short) -1;
			    anLocalInt_100_ = anLocalInt_93_;
			    anLocalInt_103_ = anLocalInt_93_;
			    anLocalInt_101_ = (byte) 0;
			} else {
			    anLocalInt_100_
				= (((Class14) argument_76_).aShortArray105
				   [anLocalInt_90_]);
			    anLocalInt_101_ = (((Class14) argument_76_)
					       .aByteArray113[anLocalInt_90_]);
			    anLocalInt_102_
				= (((Class14) argument_76_).aShortArray103
				   [anLocalInt_90_]);
			    anLocalInt_103_
				= (((Class14) argument_76_).aShortArray108
				   [anLocalInt_90_]);
			    anLocalInt_104_
				= (((Class14) argument_76_).aShortArray102
				   [anLocalInt_90_]);
			    anLocalInt_90_++;
			}
			int anLocalInt_105_;
			int anLocalInt_106_;
			int anLocalInt_107_;
			if ((anLocalInt_96_ & 0x2) != 0
			    || (anLocalInt_101_ & 0x1) != 0) {
			    anLocalInt_106_ = anLocalInt_95_;
			    anLocalInt_107_ = anLocalInt_98_;
			    anLocalInt_105_ = anLocalInt_99_;
			} else if (anLocalInt_94_ == 2) {
			    int anLocalInt_108_
				= -anLocalInt_99_ + anLocalInt_104_ & 0x3fff;
			    int anLocalInt_109_
				= anLocalInt_100_ - anLocalInt_95_ & 0x3fff;
			    if (anLocalInt_108_ >= 8192)
				anLocalInt_108_ -= 16384;
			    if (anLocalInt_109_ >= 8192)
				anLocalInt_109_ -= 16384;
			    int anLocalInt_110_
				= -anLocalInt_98_ + anLocalInt_103_ & 0x3fff;
			    if (anLocalInt_110_ >= 8192)
				anLocalInt_110_ -= 16384;
			    anLocalInt_105_
				= (anLocalInt_108_ * argument_81_
				   / argument_82_) + anLocalInt_99_ & 0x3fff;
			    anLocalInt_106_
				= (anLocalInt_109_ * argument_81_
				   / argument_82_) + anLocalInt_95_ & 0x3fff;
			    anLocalInt_107_
				= (anLocalInt_110_ * argument_81_
				   / argument_82_) + anLocalInt_98_ & 0x3fff;
			} else if (anLocalInt_94_ == 9) {
			    int anLocalInt_111_
				= anLocalInt_104_ - anLocalInt_99_ & 0x3fff;
			    if (anLocalInt_111_ >= 8192)
				anLocalInt_111_ -= 16384;
			    anLocalInt_105_
				= anLocalInt_99_ + (argument_81_
						    * anLocalInt_111_
						    / argument_82_) & 0x3fff;
			    anLocalInt_106_ = anLocalInt_107_ = 0;
			} else if (anLocalInt_94_ != 7) {
			    anLocalInt_107_
				= (anLocalInt_98_
				   + ((-anLocalInt_98_ + anLocalInt_103_)
				      * argument_81_ / argument_82_));
			    anLocalInt_105_
				= (anLocalInt_99_
				   + ((-anLocalInt_99_ + anLocalInt_104_)
				      * argument_81_ / argument_82_));
			    anLocalInt_106_
				= anLocalInt_95_ + (argument_81_
						    * (-anLocalInt_95_
						       + anLocalInt_100_)
						    / argument_82_);
			} else {
			    int anLocalInt_112_
				= -anLocalInt_99_ + anLocalInt_104_ & 0x3f;
			    if (anLocalInt_112_ >= 32)
				anLocalInt_112_ -= 64;
			    anLocalInt_105_
				= (anLocalInt_112_ * argument_81_
				   / argument_82_) + anLocalInt_99_ & 0x3f;
			    anLocalInt_106_
				= (((anLocalInt_100_ - anLocalInt_95_)
				    * argument_81_ / argument_82_)
				   + anLocalInt_95_);
			    anLocalInt_107_
				= (anLocalInt_98_
				   + ((-anLocalInt_98_ + anLocalInt_103_)
				      * argument_81_ / argument_82_));
			}
			if (anLocalInt_97_ == -1) {
			    if (anLocalInt_102_ != -1)
				method2650(((((Node_Sub11) argument_77_)
					     .anIntArray3940[anLocalInt_102_])
					    & argument_87_),
					   0, argument_79_, argument_78_, 0,
					   (((Node_Sub11) argument_77_)
					    .anIntArrayArray3943
					    [anLocalInt_102_]),
					   argument_86_, false, 0, 0);
			} else
			    method2650((argument_87_
					& (((Node_Sub11) argument_77_)
					   .anIntArray3940[anLocalInt_97_])),
				       0, argument_79_, argument_78_, 0,
				       (((Node_Sub11) argument_77_)
					.anIntArrayArray3943[anLocalInt_97_]),
				       argument_86_, false, 0, 0);
			method2650(((((Node_Sub11) argument_77_)
				     .anIntArray3940[anLocalInt_91_])
				    & argument_87_),
				   anLocalInt_107_, argument_79_, argument_78_,
				   anLocalInt_105_,
				   (((Node_Sub11) argument_77_)
				    .anIntArrayArray3943[anLocalInt_91_]),
				   argument_86_, false, anLocalInt_106_,
				   anLocalInt_94_);
		    }
		}
	    }
	}
    }
    
    abstract int EA();
    
    abstract int HA();
    
    abstract void method2649(int argument_113_, int argument_114_,
			     int argument_115_, int argument_116_);
    
    abstract void a(int argument_117_);
    
    private final void method2650(int argument_118_, int argument_119_,
				  boolean argument_120_, int argument_121_,
				  int argument_122_, int[] argument_123_,
				  int[] argument_124_, boolean argument_125_,
				  int argument_126_, int argument_127_) {
	if (argument_121_ == 1) {
	    if (argument_127_ != 0 && argument_127_ != 1) {
		if (argument_127_ != 3) {
		    if (argument_127_ == 2) {
			int anLocalInt = argument_122_;
			argument_122_ = -argument_119_ & 0x3fff;
			argument_119_ = anLocalInt & 0x3fff;
		    }
		} else {
		    int anLocalInt = argument_122_;
		    argument_122_ = argument_119_;
		    argument_119_ = anLocalInt;
		}
	    } else {
		int anLocalInt = -argument_122_;
		argument_122_ = argument_119_;
		argument_119_ = anLocalInt;
	    }
	} else if (argument_121_ != 2) {
	    if (argument_121_ == 3) {
		if (argument_127_ == 0 || argument_127_ == 1) {
		    int anLocalInt = argument_122_;
		    argument_122_ = -argument_119_;
		    argument_119_ = anLocalInt;
		} else if (argument_127_ == 3) {
		    int anLocalInt = argument_122_;
		    argument_122_ = argument_119_;
		    argument_119_ = anLocalInt;
		} else if (argument_127_ == 2) {
		    int anLocalInt = argument_122_;
		    argument_122_ = argument_119_ & 0x3fff;
		    argument_119_ = -anLocalInt & 0x3fff;
		}
	    }
	} else if (argument_127_ == 0 || argument_127_ == 1) {
	    argument_119_ = -argument_119_;
	    argument_122_ = -argument_122_;
	} else if (argument_127_ == 2) {
	    argument_119_ = -argument_119_ & 0x3fff;
	    argument_122_ = -argument_122_ & 0x3fff;
	}
	if (argument_118_ != 65535)
	    I(argument_127_, argument_123_, argument_122_, argument_126_,
	      argument_119_, argument_120_, argument_118_, argument_124_);
	else
	    method2659(argument_127_, argument_123_, argument_122_,
		       argument_126_, argument_119_, argument_121_,
		       argument_120_);
	if (argument_125_)
	    anInt1225 = 48;
    }
    
    abstract void C(int argument_128_);
    
    abstract void p(int argument_129_, int argument_130_,
		    Class_s argument_131_, Class_s argument_132_,
		    int argument_133_, int argument_134_, int argument_135_);
    
    abstract void ia(short argument_136_, short argument_137_);
    
    abstract Class167 method2651(byte argument_138_, int argument_139_,
				 boolean argument_140_);
    
    abstract int fa();
    
    abstract void method2652();
    
    abstract void P(int argument_141_, int argument_142_, int argument_143_,
		    int argument_144_);
    
    abstract void LA(int argument_145_);
    
    abstract int V();
    
    abstract tia_sub_35DoublyLinked ba(tia_sub_35DoublyLinked argument_146_);
    
    abstract int ua();
    
    abstract boolean method2653();
    
    abstract void v();
    
    abstract void method2654();
    
    abstract boolean NA();
    
    abstract Class185[] method2655();
    
    abstract void method2656(Class350 argument_147_);
    
    final void method2657(int argument_148_, int argument_149_,
			  int argument_150_, boolean argument_151_,
			  DoublyLinkedNode_Sub51_Sub6 argument_152_, int argument_153_,
			  int argument_154_, byte argument_155_,
			  DoublyLinkedNode_Sub51_Sub6 argument_156_) {
	if (argument_149_ != -1) {
	    method2647();
	    if (!NA())
		method2654();
	    else {
		Class14 class14 = (((DoublyLinkedNode_Sub51_Sub6) argument_152_)
				   .aClass14Array6246[argument_149_]);
		Node_Sub11 class59_sub11
		    = ((Class14) class14).aClass59_Sub11_99;
		Class14 class14_157_ = null;
		if (argument_156_ != null) {
		    class14_157_ = (((DoublyLinkedNode_Sub51_Sub6) argument_156_)
				    .aClass14Array6246[argument_153_]);
		    if (class59_sub11
			!= ((Class14) class14_157_).aClass59_Sub11_99)
			class14_157_ = null;
		}
		method2648(class14_157_, class59_sub11, argument_148_,
			   argument_151_, 113, argument_150_, argument_154_,
			   false, null, class14, null, 65535);
		wa();
		method2654();
	    }
	}
    }
    
    abstract void aa(short argument_158_, short argument_159_);
    
    abstract void s(int argument_160_);
    
    final void method2658
	(DoublyLinkedNode_Sub51_Sub6 argument_161_, DoublyLinkedNode_Sub51_Sub6 argument_162_,
	 boolean[] argument_163_, byte argument_164_, int argument_165_,
	 int argument_166_, DoublyLinkedNode_Sub51_Sub6 argument_167_,
	 int argument_168_, int argument_169_,
	 DoublyLinkedNode_Sub51_Sub6 argument_170_, int argument_171_,
	 boolean argument_172_, int argument_173_, int argument_174_,
	 int argument_175_) {
	if (argument_165_ != -1) {
	    if (argument_163_ == null || argument_168_ == -1)
		method2657(0, argument_165_, argument_173_, argument_172_,
			   argument_161_, argument_171_, argument_166_,
			   (byte) -70, argument_170_);
	    else {
		method2647();
		if (!NA())
		    method2654();
		else {
		    Class14 class14 = (((DoublyLinkedNode_Sub51_Sub6) argument_161_)
				       .aClass14Array6246[argument_165_]);
		    Node_Sub11 class59_sub11
			= ((Class14) class14).aClass59_Sub11_99;
		    Class14 class14_176_ = null;
		    if (argument_170_ != null) {
			class14_176_ = (((DoublyLinkedNode_Sub51_Sub6) argument_170_)
					.aClass14Array6246[argument_171_]);
			if (((Class14) class14_176_).aClass59_Sub11_99
			    != class59_sub11)
			    class14_176_ = null;
		    }
		    method2648(class14_176_, class59_sub11, 0, argument_172_,
			       123, argument_173_, argument_166_, false,
			       argument_163_, class14, null, 65535);
		    Class14 class14_177_
			= (((DoublyLinkedNode_Sub51_Sub6) argument_167_)
			   .aClass14Array6246[argument_168_]);
		    Class14 class14_178_ = null;
		    if (argument_162_ != null) {
			class14_178_ = (((DoublyLinkedNode_Sub51_Sub6) argument_162_)
					.aClass14Array6246[argument_169_]);
			if (class59_sub11
			    != ((Class14) class14_178_).aClass59_Sub11_99)
			    class14_178_ = null;
		    }
		    method2659(0, new int[0], 0, 0, 0, 0, argument_172_);
		    method2648(class14_178_,
			       ((Class14) class14_177_).aClass59_Sub11_99, 0,
			       argument_172_, 106, argument_174_,
			       argument_175_, true, argument_163_,
			       class14_177_, null, 65535);
		    wa();
		    method2654();
		}
	    }
	}
    }
    
    abstract int WA();
    
    abstract void VA(int argument_179_);
    
    abstract boolean F();
    
    public Class167() {
	/* empty */
    }
    
    abstract void method2659(int argument_180_, int[] argument_181_,
			     int argument_182_, int argument_183_,
			     int argument_184_, int argument_185_,
			     boolean argument_186_);
    
    abstract void I(int argument_187_, int[] argument_188_, int argument_189_,
		    int argument_190_, int argument_191_,
		    boolean argument_192_, int argument_193_,
		    int[] argument_194_);
    
    abstract void method2660(Class167 argument_195_, int argument_196_,
			     int argument_197_, int argument_198_,
			     boolean argument_199_);
    
    static {
	aLong1223 = 0L;
	anInt1224 = 0;
	aShortArrayArray1229
	    = (new short[][]
	       { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437,
		   2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472,
		   580, 784, 21966, 28950, -15697, -14002 },
		 { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466,
		   10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392,
		   10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835,
		   -15460, -14019, 7072, 3990, 309, 910, 9509, 9117, 3600,
		   16442, -32601, 22020, 2694, -22264, 10281, 3869, -28007,
		   10764, 8974, 3745, 10269, 914, 8629, -26438, 26779, -15208,
		   8728, 2982, -25718, 918, 6842, -25030, -5462, -14833,
		   -22386, 8, -22468, -27479, -11237, 21664, 45, -24054,
		   -27207, -22887, -30051, 20003, 21584, -31426, 28990, -11219,
		   6353, -25560, -25458, -14182, -11006, -27365, 3241, 7457,
		   8899, 13760, 4565, 11711, 10436, 8103, 2604, 13740, -28232,
		   -26333, -23910, -31403, -32352, -29812, -29909, -24137, 925,
		   1181, 3865, 6049, 8582, 1804, 4887, -5372, 15011, 20785,
		   7591, 9528, 21770, 14094, 6930, 14635, 5911, 6463, 10124,
		   17935, 3218, 262, 5413, -27579, -25189, -26331, -28236,
		   -28144, -23804, -23261, -23013, -19045, 5419, 6332, 5665,
		   2450, 3617, 8638, 5178, 10374, 6819, 7434, 150, 2446, 9647,
		   -27504, -27586, -31695, 11142, 18704, 10775, 21898, 10554,
		   9492, 11811, 11140, -15978, -24180, -32498, -29288, 29084,
		   -9579, -18799, -27122, 913, 6024, 2966, -5238, 6542, 15240,
		   10, 39, 3986, 2324, 6030, -31709, 512, 33, 9394, -4833,
		   28967, -25290, 30866, 13466, -28403, -24022, -14042, -22472,
		   -18166, 20493, -27626, -22266, -1784, -31473, 9612, 7324,
		   646, 778, 786, 800, -624, -3198, -8164, 1678, 29068, 22412,
		   -32253, 29075, 22404, -22006, 3974, 7054, 10376, 3222, 8070,
		   12, 1930, 2, -22481, 4884, 5797, 5900, 6, 40, 1932, 5638,
		   8466, -25537 },
		 { 25485, 9105, 10275, 7595, 3610, 7975, 8526, 918, -26734,
		   24466, 10145, -6882, 5027, 1457, 16565, -30545, 24, 5392,
		   10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835,
		   -15460, -14019, 7072, 3990, 309, 910, 9509, 9117, 3600,
		   16442, -32601, 22020, 2694, -22264, 10281, 3869, -28007,
		   10764, 8974, 3745, 10269, 914, 8629, -26438, 26779, -15208,
		   8728, 2982, -25718, 918, 6842, -25030, -5462, -14833,
		   -22386, 8, -22468, -27479, -11237, 21664, 45, -24054,
		   -27207, -22887, -30051, 20003, 21584, -31426, 28990, -11219,
		   6353, -25560, -25458, -14182, -11006, -27365, 3241, 7457,
		   8899, 13760, 4565, 11711, 10436, 8103, 2604, 13740, -28232,
		   -26333, -23910, -31403, -32352, -29812, -29909, -24137, 925,
		   1181, 3865, 6049, 8582, 1804, 4887, -5372, 15011, 20785,
		   7591, 9528, 21770, 14094, 6930, 14635, 5911, 6463, 10124,
		   17935, 3218, 262, 5413, -27579, -25189, -26331, -28236,
		   -28144, -23804, -23261, -23013, -19045, 5419, 6332, 5665,
		   2450, 3617, 8638, 5178, 10374, 6819, 7434, 150, 2446, 9647,
		   -27504, -27586, -31695, 11142, 18704, 10775, 21898, 10554,
		   9492, 11811, 11140, -15978, -24180, -32498, -29288, 29084,
		   -9579, -18799, -27122, 913, 6024, 2966, -5238, 6542, 15240,
		   10, 39, 3986, 2324, 6030, -31709, 512, 33, 9394, -4833,
		   28967, -25290, 30866, 13466, -28403, -24022, -14042, -22472,
		   -18166, 20493, -27626, -22266, -1784, -31473, 9612, 7324,
		   646, 778, 786, 800, -624, -3198, -8164, 1678, 29068, 22412,
		   -32253, 29075, 22404, -22006, 3974, 7054, 10376, 3222, 8070,
		   12, 1930, 2, -22481, 4884, 5797, 5900, 6, 40, 1932, 5638,
		   8466, -25537 },
		 { 4620, 11140, 6433, 6, 4752, 10264, 7072, 3990, 309, 910,
		   9509, 9117, 3600, 16442, -32601, 22020, 2694, -22264, 10281,
		   3869, -28007, 10764, 8974, 3745, 10269, 914, 8629, -26438,
		   26779, -15208, 8728, 2982, -25718, 918, 6842, -25030, -5462,
		   -14833, -22386, 8, -22468, -27479, -11237, 21664, 45,
		   -24054, -27207, -22887, -30051, 20003, 21584, -31426, 28990,
		   -11219, 6353, -25560, -25458, -14182, -11006, -27365, 3241,
		   7457, 8899, 13760, 4565, 11711, 10436, 8103, 2604, 13740,
		   -28232, -26333, -23910, -31403, -32352, -29812, -29909,
		   -24137, 925, 1181, 3865, 6049, 8582, 1804, 4887, -5372,
		   15011, 20785, 7591, 9528, 21770, 14094, 6930, 14635, 5911,
		   6463, 10124, 17935, 3218, 262, 5413, -27579, -25189, -26331,
		   -28236, -28144, -23804, -23261, -23013, -19045, 5419, 6332,
		   5665, 2450, 3617, 8638, 5178, 10374, 6819, 7434, 150, 2446,
		   9647, -27504, -27586, -31695, 11142, 18704, 10775, 21898,
		   10554, 9492, 11811, 11140, -15978, -24180, -32498, -29288,
		   29084, -9579, -18799, -27122, 913, 6024, 2966, -5238, 6542,
		   15240, 10, 39, 3986, 2324, 6030, -31709, 512, 33, 9394,
		   -4833, 28967, -25290, 30866, 13466, -28403, -24022, -14042,
		   -22472, -18166, 20493, -27626, -22266, -1784, -31473, 9612,
		   7324, 646, 778, 786, 800, -624, -3198, -8164, 1678, 29068,
		   22412, -32253, 29075, 22404, -22006, 3974, 7054, 10376,
		   3222, 8070, 12, 1930, 2, -22481, 4884, 5797, 5900, 6, 40,
		   1932, 5638, 8466, -25537 },
		 { 4540, 4529, 5674, 5667, 5785, 6802, 8072, 4562, 4437, 4317,
		   5896, 4488 } });
	aShortArrayArrayArray1222
	    = new short[][][] { aShortArrayArray1227, aShortArrayArray1229,
				aShortArrayArray1226 };
    }
}
