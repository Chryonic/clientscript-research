/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

final class Class101
{
    short[] aShortArray783;
    Class147[] aClass147Array784;
    int[] anIntArray785;
    byte[] aByteArray786;
    Class38[] aClass38Array787;
    static int[] anIntArray788 = new int[8];
    short[] aShortArray789;
    byte[] aByteArray790;
    int[] anIntArray791;
    int anInt792;
    short[] aShortArray793;
    short[] aShortArray794;
    int anInt795;
    int[] anIntArray796;
    int anInt797 = 0;
    short[] aShortArray798;
    short[] aShortArray799;
    byte[] aByteArray800;
    int[] anIntArray801;
    byte[] aByteArray802;
    short[] aShortArray803;
    int[] anIntArray804;
    int[] anIntArray805;
    byte aByte806 = 0;
    short[] aShortArray807;
    static Class207 aClass207_808 = new Class207(18, 8);
    int[] anIntArray809;
    int[] anIntArray810;
    int[] anIntArray811;
    int anInt812;
    byte[] aByteArray813;
    int[] anIntArray814;
    short[] aShortArray815;
    byte[] aByteArray816;
    Class185[] aClass185Array817;
    byte[] aByteArray818;
    int[] anIntArray819;
    int anInt820;
    short[] aShortArray821;
    static int anInt822;
    static int[] anIntArray823;
    
    final void method1733(int argument_0_, int argument_1_) {
	for (int anLocalInt = 0; anLocalInt < ((Class101) this).anInt792;
	     anLocalInt++) {
	    ((Class101) this).anIntArray814[anLocalInt] <<= argument_1_;
	    ((Class101) this).anIntArray810[anLocalInt] <<= argument_1_;
	    ((Class101) this).anIntArray785[anLocalInt] <<= argument_1_;
	}
	if (argument_0_ != 17496)
	    method1749(59, null);
	if (((Class101) this).anInt812 > 0
	    && ((Class101) this).anIntArray804 != null) {
	    for (int anLocalInt = 0;
		 anLocalInt < ((Class101) this).anIntArray804.length;
		 anLocalInt++) {
		((Class101) this).anIntArray804[anLocalInt] <<= argument_1_;
		((Class101) this).anIntArray811[anLocalInt] <<= argument_1_;
		if (((Class101) this).aByteArray800[anLocalInt] != 1)
		    ((Class101) this).anIntArray791[anLocalInt]
			<<= argument_1_;
	    }
	}
    }
    
    static final char method1734(byte argument, char argument_2_) {
	char anLocalChar = argument_2_;
    while_57_:
	do {
	while_56_:
	    do {
	    while_55_:
		do {
		while_54_:
		    do {
		    while_53_:
			do {
			while_52_:
			    do {
			    while_51_:
				do {
				while_50_:
				    do {
				    while_49_:
					do {
					    do {
						if (anLocalChar != ' '
						    && anLocalChar != '\u00a0'
						    && anLocalChar != '_'
						    && anLocalChar != '-') {
						    if (anLocalChar != '['
							&& anLocalChar != ']'
							&& (anLocalChar
							    != '#')) {
							if ((anLocalChar
							     != '\u00e0')
							    && (anLocalChar
								!= '\u00e1')
							    && (anLocalChar
								!= '\u00e2')
							    && (anLocalChar
								!= '\u00e4')
							    && (anLocalChar
								!= '\u00e3')
							    && (anLocalChar
								!= '\u00c0')
							    && (anLocalChar
								!= '\u00c1')
							    && (anLocalChar
								!= '\u00c2')
							    && (anLocalChar
								!= '\u00c4')
							    && (anLocalChar
								!= '\u00c3')) {
							    if ((anLocalChar
								 != '\u00e8')
								&& (anLocalChar
								    != '\u00e9')
								&& (anLocalChar
								    != '\u00ea')
								&& (anLocalChar
								    != '\u00eb')
								&& (anLocalChar
								    != '\u00c8')
								&& (anLocalChar
								    != '\u00c9')
								&& (anLocalChar
								    != '\u00ca')
								&& (anLocalChar
								    != '\u00cb')) {
								if ((anLocalChar
								     != '\u00ed')
								    && (anLocalChar
									!= '\u00ee')
								    && (anLocalChar
									!= '\u00ef')
								    && (anLocalChar
									!= '\u00cd')
								    && (anLocalChar
									!= '\u00ce')
								    && (anLocalChar
									!= '\u00cf')) {
								    if ((anLocalChar
									 != '\u00f2')
									&& (anLocalChar
									    != '\u00f3')
									&& (anLocalChar
									    != '\u00f4')
									&& (anLocalChar
									    != '\u00f6')
									&& (anLocalChar
									    != '\u00f5')
									&& (anLocalChar
									    != '\u00d2')
									&& (anLocalChar
									    != '\u00d3')
									&& (anLocalChar
									    != '\u00d4')
									&& (anLocalChar
									    != '\u00d6')
									&& (anLocalChar
									    != '\u00d5')) {
									if ((anLocalChar
									     != '\u00f9')
									    && anLocalChar != '\u00fa'
									    && anLocalChar != '\u00fb'
									    && anLocalChar != '\u00fc'
									    && anLocalChar != '\u00d9'
									    && anLocalChar != '\u00da'
									    && anLocalChar != '\u00db'
									    && anLocalChar != '\u00dc') {
									    if (anLocalChar != '\u00e7' && anLocalChar != '\u00c7') {
										if (anLocalChar != '\u00ff' && anLocalChar != '\u0178') {
										    if (anLocalChar != '\u00f1' && anLocalChar != '\u00d1') {
											if (anLocalChar == '\u00df')
											    break while_56_;
											break while_57_;
										    }
										} else
										    break while_54_;
										break while_55_;
									    }
									} else
									    break while_52_;
									break while_53_;
								    }
								} else
								    break while_50_;
								break while_51_;
							    }
							} else
							    break;
							break while_49_;
						    }
						} else
						    return '_';
						return argument_2_;
					    } while (false);
					    return 'a';
					} while (false);
					return 'e';
				    } while (false);
				    return 'i';
				} while (false);
				return 'o';
			    } while (false);
			    return 'u';
			} while (false);
			return 'c';
		    } while (false);
		    return 'y';
		} while (false);
		return 'n';
	    } while (false);
	    return 'b';
	} while (false);
	return Character.toLowerCase(argument_2_);
    }
    
    static final void method1735(byte argument) {
	if (argument >= -77)
	    method1748(true, null);
	Class133_Sub1.aJagexHashMap_5007.method1527(0);
	DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aDCyclicLinkedList_6591.clear();
	Statics.aDCyclicLinkedList_6734.clear();
    }
    
    static final void method1736(byte argument) {
	Class134.aClass149_3607.clear((byte) -3);
    }
    
    final int[][] method1737(int argument_3_) {
	int[] anLocalInts = new int[256];
	int anLocalInt = 0;
	for (int anLocalInt_4_ = 0;
	     ((Class101) this).aClass147Array784.length > anLocalInt_4_;
	     anLocalInt_4_++) {
	    int anLocalInt_5_
		= (((Class147)
		    ((Class101) this).aClass147Array784[anLocalInt_4_])
		   .anInt1119);
	    if (anLocalInt_5_ >= 0) {
		anLocalInts[anLocalInt_5_]++;
		if (anLocalInt < anLocalInt_5_)
		    anLocalInt = anLocalInt_5_;
	    }
	}
	int[][] anLocalInts_6_ = new int[anLocalInt + 1][];
	for (int anLocalInt_7_ = 0; anLocalInt_7_ <= anLocalInt;
	     anLocalInt_7_++) {
	    anLocalInts_6_[anLocalInt_7_]
		= new int[anLocalInts[anLocalInt_7_]];
	    anLocalInts[anLocalInt_7_] = 0;
	}
	for (int anLocalInt_8_ = 0;
	     ((Class101) this).aClass147Array784.length > anLocalInt_8_;
	     anLocalInt_8_++) {
	    int anLocalInt_9_
		= (((Class147)
		    ((Class101) this).aClass147Array784[anLocalInt_8_])
		   .anInt1119);
	    if (anLocalInt_9_ >= 0)
		anLocalInts_6_[anLocalInt_9_][anLocalInts[anLocalInt_9_]++]
		    = anLocalInt_8_;
	}
	return anLocalInts_6_;
    }
    
    final void method1738(int argument_10_, int argument_11_, int argument_12_,
			  int argument_13_) {
	if (argument_13_ != 0) {
	    int anLocalInt = Node_Sub6.SINETABLE[argument_13_];
	    int anLocalInt_14_ = Node_Sub6.COSINETABLE[argument_13_];
	    for (int anLocalInt_15_ = 0;
		 ((Class101) this).anInt792 > anLocalInt_15_;
		 anLocalInt_15_++) {
		int anLocalInt_16_
		    = (((((Class101) this).anIntArray814[anLocalInt_15_]
			 * anLocalInt_14_)
			+ (((Class101) this).anIntArray810[anLocalInt_15_]
			   * anLocalInt))
		       >> 14);
		((Class101) this).anIntArray810[anLocalInt_15_]
		    = (-(((Class101) this).anIntArray814[anLocalInt_15_]
			 * anLocalInt)
		       + anLocalInt_14_ * (((Class101) this).anIntArray810
					   [anLocalInt_15_])) >> 14;
		((Class101) this).anIntArray814[anLocalInt_15_]
		    = anLocalInt_16_;
	    }
	}
	if (argument_12_ != 0) {
	    int anLocalInt = Node_Sub6.SINETABLE[argument_12_];
	    int anLocalInt_17_ = Node_Sub6.COSINETABLE[argument_12_];
	    for (int anLocalInt_18_ = 0;
		 ((Class101) this).anInt792 > anLocalInt_18_;
		 anLocalInt_18_++) {
		int anLocalInt_19_
		    = (((((Class101) this).anIntArray810[anLocalInt_18_]
			 * anLocalInt_17_)
			- (anLocalInt
			   * ((Class101) this).anIntArray785[anLocalInt_18_]))
		       >> 14);
		((Class101) this).anIntArray785[anLocalInt_18_]
		    = ((((Class101) this).anIntArray810[anLocalInt_18_]
			* anLocalInt)
		       + anLocalInt_17_ * (((Class101) this).anIntArray785
					   [anLocalInt_18_])) >> 14;
		((Class101) this).anIntArray810[anLocalInt_18_]
		    = anLocalInt_19_;
	    }
	}
	if (argument_10_ != 0) {
	    int anLocalInt = Node_Sub6.SINETABLE[argument_10_];
	    int anLocalInt_20_ = Node_Sub6.COSINETABLE[argument_10_];
	    for (int anLocalInt_21_ = 0;
		 ((Class101) this).anInt792 > anLocalInt_21_;
		 anLocalInt_21_++) {
		int anLocalInt_22_
		    = (((((Class101) this).anIntArray785[anLocalInt_21_]
			 * anLocalInt)
			+ (((Class101) this).anIntArray814[anLocalInt_21_]
			   * anLocalInt_20_))
		       >> 14);
		((Class101) this).anIntArray785[anLocalInt_21_]
		    = (-(((Class101) this).anIntArray814[anLocalInt_21_]
			 * anLocalInt)
		       + anLocalInt_20_ * (((Class101) this).anIntArray785
					   [anLocalInt_21_])) >> 14;
		((Class101) this).anIntArray814[anLocalInt_21_]
		    = anLocalInt_22_;
	    }
	}
    }
    
    final void method1739(short argument_23_, short argument_24_,
			  int argument_25_) {
	if (((Class101) this).aShortArray815 != null) {
	    for (int anLocalInt = 0; anLocalInt < ((Class101) this).anInt795;
		 anLocalInt++) {
		if (((Class101) this).aShortArray815[anLocalInt]
		    == argument_24_)
		    ((Class101) this).aShortArray815[anLocalInt]
			= argument_23_;
	    }
	}
    }
    
    private final int method1740(short argument_26_, int argument_27_,
				 byte argument_28_, Class101 argument_29_) {
	int anLocalInt = ((Class101) argument_29_).anIntArray814[argument_27_];
	int anLocalInt_30_
	    = ((Class101) argument_29_).anIntArray810[argument_27_];
	int anLocalInt_31_ = -77 % (argument_28_ / 56);
	int anLocalInt_32_
	    = ((Class101) argument_29_).anIntArray785[argument_27_];
	for (int anLocalInt_33_ = 0;
	     anLocalInt_33_ < ((Class101) this).anInt792; anLocalInt_33_++) {
	    if (((Class101) this).anIntArray814[anLocalInt_33_] == anLocalInt
		&& (((Class101) this).anIntArray810[anLocalInt_33_]
		    == anLocalInt_30_)
		&& (((Class101) this).anIntArray785[anLocalInt_33_]
		    == anLocalInt_32_)) {
		((Class101) this).aShortArray789[anLocalInt_33_]
		    = (short) MathStatics.OR((((Class101) this).aShortArray789[anLocalInt_33_]), argument_26_);
		return anLocalInt_33_;
	    }
	}
	((Class101) this).anIntArray814[((Class101) this).anInt792]
	    = anLocalInt;
	((Class101) this).anIntArray810[((Class101) this).anInt792]
	    = anLocalInt_30_;
	((Class101) this).anIntArray785[((Class101) this).anInt792]
	    = anLocalInt_32_;
	((Class101) this).aShortArray789[((Class101) this).anInt792]
	    = argument_26_;
	((Class101) this).anIntArray796[((Class101) this).anInt792]
	    = (((Class101) argument_29_).anIntArray796 == null ? -1
	       : ((Class101) argument_29_).anIntArray796[argument_27_]);
	return ((Class101) this).anInt792++;
    }
    
    private final void method1741(byte[] argument_34_, int argument_35_) {
	Packet class59_sub28 = new Packet(argument_34_);
	Packet class59_sub28_36_ = new Packet(argument_34_);
	Packet class59_sub28_37_ = new Packet(argument_34_);
	Packet class59_sub28_38_ = new Packet(argument_34_);
	Packet class59_sub28_39_ = new Packet(argument_34_);
	Packet class59_sub28_40_ = new Packet(argument_34_);
	Packet class59_sub28_41_ = new Packet(argument_34_);
	((Packet) class59_sub28).pos = argument_34_.length - 23;
	((Class101) this).anInt792 = class59_sub28.g2();
	((Class101) this).anInt795 = class59_sub28.g2();
	((Class101) this).anInt812 = class59_sub28.g1();
	int anLocalInt = class59_sub28.g1();
	boolean anLocalBoolean = (anLocalInt & 0x1) == 1;
	boolean anLocalBoolean_42_ = (anLocalInt & 0x2) == 2;
	if (argument_35_ > 118) {
	    boolean anLocalBoolean_43_ = (anLocalInt & 0x4) == 4;
	    boolean anLocalBoolean_44_ = (anLocalInt & 0x8) == 8;
	    if (anLocalBoolean_44_) {
		((Packet) class59_sub28).pos -= 7;
		((Class101) this).anInt820
		    = class59_sub28.g1();
		((Packet) class59_sub28).pos += 6;
	    }
	    int anLocalInt_45_ = class59_sub28.g1();
	    int anLocalInt_46_ = class59_sub28.g1();
	    int anLocalInt_47_ = class59_sub28.g1();
	    int anLocalInt_48_ = class59_sub28.g1();
	    int anLocalInt_49_ = class59_sub28.g1();
	    int anLocalInt_50_ = class59_sub28.g2();
	    int anLocalInt_51_ = class59_sub28.g2();
	    int anLocalInt_52_ = class59_sub28.g2();
	    int anLocalInt_53_ = class59_sub28.g2();
	    int anLocalInt_54_ = class59_sub28.g2();
	    int anLocalInt_55_ = 0;
	    int anLocalInt_56_ = 0;
	    int anLocalInt_57_ = 0;
	    if (((Class101) this).anInt812 > 0) {
		((Packet) class59_sub28).pos = 0;
		((Class101) this).aByteArray800
		    = new byte[((Class101) this).anInt812];
		for (int anLocalInt_58_ = 0;
		     ((Class101) this).anInt812 > anLocalInt_58_;
		     anLocalInt_58_++) {
		    byte anLocalInt_59_
			= (((Class101) this).aByteArray800[anLocalInt_58_]
			   = class59_sub28.g1s());
		    if (anLocalInt_59_ >= 1 && anLocalInt_59_ <= 3)
			anLocalInt_56_++;
		    if (anLocalInt_59_ == 0)
			anLocalInt_55_++;
		    if (anLocalInt_59_ == 2)
			anLocalInt_57_++;
		}
	    }
	    int anLocalInt_60_ = ((Class101) this).anInt812;
	    int anLocalInt_61_ = anLocalInt_60_;
	    anLocalInt_60_ += ((Class101) this).anInt792;
	    int anLocalInt_62_ = anLocalInt_60_;
	    if (anLocalBoolean)
		anLocalInt_60_ += ((Class101) this).anInt795;
	    int anLocalInt_63_ = anLocalInt_60_;
	    anLocalInt_60_ += ((Class101) this).anInt795;
	    int anLocalInt_64_ = anLocalInt_60_;
	    if (anLocalInt_45_ == 255)
		anLocalInt_60_ += ((Class101) this).anInt795;
	    int anLocalInt_65_ = anLocalInt_60_;
	    if (anLocalInt_47_ == 1)
		anLocalInt_60_ += ((Class101) this).anInt795;
	    int anLocalInt_66_ = anLocalInt_60_;
	    if (anLocalInt_49_ == 1)
		anLocalInt_60_ += ((Class101) this).anInt792;
	    int anLocalInt_67_ = anLocalInt_60_;
	    if (anLocalInt_46_ == 1)
		anLocalInt_60_ += ((Class101) this).anInt795;
	    int anLocalInt_68_ = anLocalInt_60_;
	    anLocalInt_60_ += anLocalInt_53_;
	    int anLocalInt_69_ = anLocalInt_60_;
	    if (anLocalInt_48_ == 1)
		anLocalInt_60_ += ((Class101) this).anInt795 * 2;
	    int anLocalInt_70_ = anLocalInt_60_;
	    anLocalInt_60_ += anLocalInt_54_;
	    int anLocalInt_71_ = anLocalInt_60_;
	    anLocalInt_60_ += ((Class101) this).anInt795 * 2;
	    int anLocalInt_72_ = anLocalInt_60_;
	    anLocalInt_60_ += anLocalInt_50_;
	    int anLocalInt_73_ = anLocalInt_60_;
	    anLocalInt_60_ += anLocalInt_51_;
	    int anLocalInt_74_ = anLocalInt_60_;
	    anLocalInt_60_ += anLocalInt_52_;
	    int anLocalInt_75_ = anLocalInt_60_;
	    anLocalInt_60_ += anLocalInt_55_ * 6;
	    int anLocalInt_76_ = anLocalInt_60_;
	    anLocalInt_60_ += anLocalInt_56_ * 6;
	    int anLocalInt_77_ = 6;
	    if (((Class101) this).anInt820 == 14)
		anLocalInt_77_ = 7;
	    else if (((Class101) this).anInt820 >= 15)
		anLocalInt_77_ = 9;
	    int anLocalInt_78_ = anLocalInt_60_;
	    anLocalInt_60_ += anLocalInt_77_ * anLocalInt_56_;
	    int anLocalInt_79_ = anLocalInt_60_;
	    anLocalInt_60_ += anLocalInt_56_;
	    int anLocalInt_80_ = anLocalInt_60_;
	    anLocalInt_60_ += anLocalInt_56_;
	    int anLocalInt_81_ = anLocalInt_60_;
	    anLocalInt_60_ += anLocalInt_56_ + anLocalInt_57_ * 2;
	    ((Class101) this).aShortArray793
		= new short[((Class101) this).anInt795];
	    ((Class101) this).aShortArray798
		= new short[((Class101) this).anInt795];
	    if (anLocalInt_46_ == 1)
		((Class101) this).aByteArray816
		    = new byte[((Class101) this).anInt795];
	    if (anLocalInt_47_ == 1)
		((Class101) this).anIntArray809
		    = new int[((Class101) this).anInt795];
	    if (anLocalInt_48_ == 1)
		((Class101) this).aShortArray815
		    = new short[((Class101) this).anInt795];
	    if (anLocalInt_49_ == 1)
		((Class101) this).anIntArray796
		    = new int[((Class101) this).anInt792];
	    ((Class101) this).aShortArray807
		= new short[((Class101) this).anInt795];
	    ((Class101) this).anIntArray814
		= new int[((Class101) this).anInt792];
	    if (anLocalInt_45_ == 255)
		((Class101) this).aByteArray790
		    = new byte[((Class101) this).anInt795];
	    else
		((Class101) this).aByte806 = (byte) anLocalInt_45_;
	    ((Class101) this).anIntArray785
		= new int[((Class101) this).anInt792];
	    ((Packet) class59_sub28).pos = anLocalInt_61_;
	    if (anLocalBoolean)
		((Class101) this).aByteArray813
		    = new byte[((Class101) this).anInt795];
	    ((Class101) this).anIntArray810
		= new int[((Class101) this).anInt792];
	    int anLocalInt_82_ = anLocalInt_60_;
	    if (anLocalInt_48_ == 1 && ((Class101) this).anInt812 > 0)
		((Class101) this).aByteArray818
		    = new byte[((Class101) this).anInt795];
	    if (((Class101) this).anInt812 > 0) {
		((Class101) this).aShortArray803
		    = new short[((Class101) this).anInt812];
		if (anLocalInt_56_ > 0) {
		    ((Class101) this).aByteArray802 = new byte[anLocalInt_56_];
		    ((Class101) this).anIntArray804 = new int[anLocalInt_56_];
		    ((Class101) this).anIntArray811 = new int[anLocalInt_56_];
		    ((Class101) this).anIntArray791 = new int[anLocalInt_56_];
		    ((Class101) this).anIntArray819 = new int[anLocalInt_56_];
		    ((Class101) this).aByteArray786 = new byte[anLocalInt_56_];
		}
		((Class101) this).aShortArray799
		    = new short[((Class101) this).anInt812];
		if (anLocalInt_57_ > 0) {
		    ((Class101) this).anIntArray801 = new int[anLocalInt_57_];
		    ((Class101) this).anIntArray805 = new int[anLocalInt_57_];
		}
		((Class101) this).aShortArray821
		    = new short[((Class101) this).anInt812];
	    }
	    ((Class101) this).aShortArray783
		= new short[((Class101) this).anInt795];
	    ((Packet) class59_sub28_36_).pos = anLocalInt_72_;
	    ((Packet) class59_sub28_37_).pos = anLocalInt_73_;
	    ((Packet) class59_sub28_38_).pos = anLocalInt_74_;
	    ((Packet) class59_sub28_39_).pos = anLocalInt_66_;
	    int anLocalInt_83_ = 0;
	    int anLocalInt_84_ = 0;
	    int anLocalInt_85_ = 0;
	    for (int anLocalInt_86_ = 0;
		 anLocalInt_86_ < ((Class101) this).anInt792;
		 anLocalInt_86_++) {
		int anLocalInt_87_ = class59_sub28.g1();
		int anLocalInt_88_ = 0;
		if ((anLocalInt_87_ & 0x1) != 0)
		    anLocalInt_88_ = class59_sub28_36_.gsmarts();
		int anLocalInt_89_ = 0;
		if ((anLocalInt_87_ & 0x2) != 0)
		    anLocalInt_89_ = class59_sub28_37_.gsmarts();
		int anLocalInt_90_ = 0;
		if ((anLocalInt_87_ & 0x4) != 0)
		    anLocalInt_90_ = class59_sub28_38_.gsmarts();
		((Class101) this).anIntArray814[anLocalInt_86_]
		    = anLocalInt_88_ + anLocalInt_83_;
		((Class101) this).anIntArray810[anLocalInt_86_]
		    = anLocalInt_89_ + anLocalInt_84_;
		((Class101) this).anIntArray785[anLocalInt_86_]
		    = anLocalInt_85_ + anLocalInt_90_;
		anLocalInt_83_
		    = ((Class101) this).anIntArray814[anLocalInt_86_];
		anLocalInt_84_
		    = ((Class101) this).anIntArray810[anLocalInt_86_];
		anLocalInt_85_
		    = ((Class101) this).anIntArray785[anLocalInt_86_];
		if (anLocalInt_49_ == 1)
		    ((Class101) this).anIntArray796[anLocalInt_86_]
			= class59_sub28_39_.g1();
	    }
	    ((Packet) class59_sub28).pos = anLocalInt_71_;
	    ((Packet) class59_sub28_36_).pos = anLocalInt_62_;
	    ((Packet) class59_sub28_37_).pos = anLocalInt_64_;
	    ((Packet) class59_sub28_38_).pos = anLocalInt_67_;
	    ((Packet) class59_sub28_39_).pos = anLocalInt_65_;
	    ((Packet) class59_sub28_40_).pos = anLocalInt_69_;
	    ((Packet) class59_sub28_41_).pos = anLocalInt_70_;
	    for (int anLocalInt_91_ = 0;
		 ((Class101) this).anInt795 > anLocalInt_91_;
		 anLocalInt_91_++) {
		((Class101) this).aShortArray783[anLocalInt_91_]
		    = (short) class59_sub28.g2();
		if (anLocalBoolean)
		    ((Class101) this).aByteArray813[anLocalInt_91_]
			= class59_sub28_36_.g1s();
		if (anLocalInt_45_ == 255)
		    ((Class101) this).aByteArray790[anLocalInt_91_]
			= class59_sub28_37_.g1s();
		if (anLocalInt_46_ == 1)
		    ((Class101) this).aByteArray816[anLocalInt_91_]
			= class59_sub28_38_.g1s();
		if (anLocalInt_47_ == 1)
		    ((Class101) this).anIntArray809[anLocalInt_91_]
			= class59_sub28_39_.g1();
		if (anLocalInt_48_ == 1)
		    ((Class101) this).aShortArray815[anLocalInt_91_]
			= (short) (class59_sub28_40_.g2() - 1);
		if (((Class101) this).aByteArray818 != null) {
		    if (((Class101) this).aShortArray815[anLocalInt_91_] != -1)
			((Class101) this).aByteArray818[anLocalInt_91_]
			    = (byte) (class59_sub28_41_.g1()
				      - 1);
		    else
			((Class101) this).aByteArray818[anLocalInt_91_]
			    = (byte) -1;
		}
	    }
	    ((Packet) class59_sub28).pos = anLocalInt_68_;
	    ((Class101) this).anInt797 = -1;
	    ((Packet) class59_sub28_36_).pos = anLocalInt_63_;
	    short anLocalInt_92_ = 0;
	    short anLocalInt_93_ = 0;
	    short anLocalInt_94_ = 0;
	    int anLocalInt_95_ = 0;
	    for (int anLocalInt_96_ = 0;
		 ((Class101) this).anInt795 > anLocalInt_96_;
		 anLocalInt_96_++) {
		int anLocalInt_97_ = class59_sub28_36_.g1();
		if (anLocalInt_97_ == 1) {
		    anLocalInt_92_ = (short) (anLocalInt_95_
					      + class59_sub28.gsmarts());
		    anLocalInt_95_ = anLocalInt_92_;
		    anLocalInt_93_ = (short) (anLocalInt_95_
					      + class59_sub28.gsmarts());
		    anLocalInt_95_ = anLocalInt_93_;
		    anLocalInt_94_ = (short) (class59_sub28.gsmarts()
					      + anLocalInt_95_);
		    ((Class101) this).aShortArray798[anLocalInt_96_]
			= anLocalInt_92_;
		    anLocalInt_95_ = anLocalInt_94_;
		    ((Class101) this).aShortArray807[anLocalInt_96_]
			= anLocalInt_93_;
		    ((Class101) this).aShortArray793[anLocalInt_96_]
			= anLocalInt_94_;
		    if (((Class101) this).anInt797 < anLocalInt_92_)
			((Class101) this).anInt797 = anLocalInt_92_;
		    if (((Class101) this).anInt797 < anLocalInt_93_)
			((Class101) this).anInt797 = anLocalInt_93_;
		    if (anLocalInt_94_ > ((Class101) this).anInt797)
			((Class101) this).anInt797 = anLocalInt_94_;
		}
		if (anLocalInt_97_ == 2) {
		    anLocalInt_93_ = anLocalInt_94_;
		    anLocalInt_94_ = (short) (class59_sub28.gsmarts()
					      + anLocalInt_95_);
		    ((Class101) this).aShortArray798[anLocalInt_96_]
			= anLocalInt_92_;
		    anLocalInt_95_ = anLocalInt_94_;
		    ((Class101) this).aShortArray807[anLocalInt_96_]
			= anLocalInt_93_;
		    ((Class101) this).aShortArray793[anLocalInt_96_]
			= anLocalInt_94_;
		    if (((Class101) this).anInt797 < anLocalInt_94_)
			((Class101) this).anInt797 = anLocalInt_94_;
		}
		if (anLocalInt_97_ == 3) {
		    anLocalInt_92_ = anLocalInt_94_;
		    anLocalInt_94_ = (short) (anLocalInt_95_
					      + class59_sub28.gsmarts());
		    ((Class101) this).aShortArray798[anLocalInt_96_]
			= anLocalInt_92_;
		    anLocalInt_95_ = anLocalInt_94_;
		    ((Class101) this).aShortArray807[anLocalInt_96_]
			= anLocalInt_93_;
		    ((Class101) this).aShortArray793[anLocalInt_96_]
			= anLocalInt_94_;
		    if (((Class101) this).anInt797 < anLocalInt_94_)
			((Class101) this).anInt797 = anLocalInt_94_;
		}
		if (anLocalInt_97_ == 4) {
		    short anLocalInt_98_ = anLocalInt_92_;
		    anLocalInt_92_ = anLocalInt_93_;
		    anLocalInt_94_ = (short) (anLocalInt_95_
					      + class59_sub28.gsmarts());
		    anLocalInt_93_ = anLocalInt_98_;
		    anLocalInt_95_ = anLocalInt_94_;
		    ((Class101) this).aShortArray798[anLocalInt_96_]
			= anLocalInt_92_;
		    ((Class101) this).aShortArray807[anLocalInt_96_]
			= anLocalInt_93_;
		    ((Class101) this).aShortArray793[anLocalInt_96_]
			= anLocalInt_94_;
		    if (anLocalInt_94_ > ((Class101) this).anInt797)
			((Class101) this).anInt797 = anLocalInt_94_;
		}
	    }
	    ((Packet) class59_sub28).pos = anLocalInt_75_;
	    ((Class101) this).anInt797++;
	    ((Packet) class59_sub28_36_).pos = anLocalInt_76_;
	    ((Packet) class59_sub28_37_).pos = anLocalInt_78_;
	    ((Packet) class59_sub28_38_).pos = anLocalInt_79_;
	    ((Packet) class59_sub28_39_).pos = anLocalInt_80_;
	    ((Packet) class59_sub28_40_).pos = anLocalInt_81_;
	    for (int anLocalInt_99_ = 0;
		 ((Class101) this).anInt812 > anLocalInt_99_;
		 anLocalInt_99_++) {
		int anLocalInt_100_
		    = ((Class101) this).aByteArray800[anLocalInt_99_] & 0xff;
		if (anLocalInt_100_ == 0) {
		    ((Class101) this).aShortArray821[anLocalInt_99_]
			= (short) class59_sub28.g2();
		    ((Class101) this).aShortArray803[anLocalInt_99_]
			= (short) class59_sub28.g2();
		    ((Class101) this).aShortArray799[anLocalInt_99_]
			= (short) class59_sub28.g2();
		}
		if (anLocalInt_100_ == 1) {
		    ((Class101) this).aShortArray821[anLocalInt_99_]
			= (short) class59_sub28_36_.g2();
		    ((Class101) this).aShortArray803[anLocalInt_99_]
			= (short) class59_sub28_36_.g2();
		    ((Class101) this).aShortArray799[anLocalInt_99_]
			= (short) class59_sub28_36_.g2();
		    if (((Class101) this).anInt820 < 15) {
			((Class101) this).anIntArray804[anLocalInt_99_]
			    = class59_sub28_37_.g2();
			if (((Class101) this).anInt820 < 14)
			    ((Class101) this).anIntArray811[anLocalInt_99_]
				= class59_sub28_37_.g2();
			else
			    ((Class101) this).anIntArray811[anLocalInt_99_]
				= class59_sub28_37_.g3_dupl();
			((Class101) this).anIntArray791[anLocalInt_99_]
			    = class59_sub28_37_.g2();
		    } else {
			((Class101) this).anIntArray804[anLocalInt_99_]
			    = class59_sub28_37_.g3_dupl();
			((Class101) this).anIntArray811[anLocalInt_99_]
			    = class59_sub28_37_.g3_dupl();
			((Class101) this).anIntArray791[anLocalInt_99_]
			    = class59_sub28_37_.g3_dupl();
		    }
		    ((Class101) this).aByteArray802[anLocalInt_99_]
			= class59_sub28_38_.g1s();
		    ((Class101) this).aByteArray786[anLocalInt_99_]
			= class59_sub28_39_.g1s();
		    ((Class101) this).anIntArray819[anLocalInt_99_]
			= class59_sub28_40_.g1s();
		}
		if (anLocalInt_100_ == 2) {
		    ((Class101) this).aShortArray821[anLocalInt_99_]
			= (short) class59_sub28_36_.g2();
		    ((Class101) this).aShortArray803[anLocalInt_99_]
			= (short) class59_sub28_36_.g2();
		    ((Class101) this).aShortArray799[anLocalInt_99_]
			= (short) class59_sub28_36_.g2();
		    if (((Class101) this).anInt820 >= 15) {
			((Class101) this).anIntArray804[anLocalInt_99_]
			    = class59_sub28_37_.g3_dupl();
			((Class101) this).anIntArray811[anLocalInt_99_]
			    = class59_sub28_37_.g3_dupl();
			((Class101) this).anIntArray791[anLocalInt_99_]
			    = class59_sub28_37_.g3_dupl();
		    } else {
			((Class101) this).anIntArray804[anLocalInt_99_]
			    = class59_sub28_37_.g2();
			if (((Class101) this).anInt820 >= 14)
			    ((Class101) this).anIntArray811[anLocalInt_99_]
				= class59_sub28_37_.g3_dupl();
			else
			    ((Class101) this).anIntArray811[anLocalInt_99_]
				= class59_sub28_37_.g2();
			((Class101) this).anIntArray791[anLocalInt_99_]
			    = class59_sub28_37_.g2();
		    }
		    ((Class101) this).aByteArray802[anLocalInt_99_]
			= class59_sub28_38_.g1s();
		    ((Class101) this).aByteArray786[anLocalInt_99_]
			= class59_sub28_39_.g1s();
		    ((Class101) this).anIntArray819[anLocalInt_99_]
			= class59_sub28_40_.g1s();
		    ((Class101) this).anIntArray805[anLocalInt_99_]
			= class59_sub28_40_.g1s();
		    ((Class101) this).anIntArray801[anLocalInt_99_]
			= class59_sub28_40_.g1s();
		}
		if (anLocalInt_100_ == 3) {
		    ((Class101) this).aShortArray821[anLocalInt_99_]
			= (short) class59_sub28_36_.g2();
		    ((Class101) this).aShortArray803[anLocalInt_99_]
			= (short) class59_sub28_36_.g2();
		    ((Class101) this).aShortArray799[anLocalInt_99_]
			= (short) class59_sub28_36_.g2();
		    if (((Class101) this).anInt820 >= 15) {
			((Class101) this).anIntArray804[anLocalInt_99_]
			    = class59_sub28_37_.g3_dupl();
			((Class101) this).anIntArray811[anLocalInt_99_]
			    = class59_sub28_37_.g3_dupl();
			((Class101) this).anIntArray791[anLocalInt_99_]
			    = class59_sub28_37_.g3_dupl();
		    } else {
			((Class101) this).anIntArray804[anLocalInt_99_]
			    = class59_sub28_37_.g2();
			if (((Class101) this).anInt820 >= 14)
			    ((Class101) this).anIntArray811[anLocalInt_99_]
				= class59_sub28_37_.g3_dupl();
			else
			    ((Class101) this).anIntArray811[anLocalInt_99_]
				= class59_sub28_37_.g2();
			((Class101) this).anIntArray791[anLocalInt_99_]
			    = class59_sub28_37_.g2();
		    }
		    ((Class101) this).aByteArray802[anLocalInt_99_]
			= class59_sub28_38_.g1s();
		    ((Class101) this).aByteArray786[anLocalInt_99_]
			= class59_sub28_39_.g1s();
		    ((Class101) this).anIntArray819[anLocalInt_99_]
			= class59_sub28_40_.g1s();
		}
	    }
	    ((Packet) class59_sub28).pos = anLocalInt_82_;
	    if (anLocalBoolean_42_) {
		int anLocalInt_101_ = class59_sub28.g1();
		if (anLocalInt_101_ > 0) {
		    ((Class101) this).aClass38Array787
			= new Class38[anLocalInt_101_];
		    for (int anLocalInt_102_ = 0;
			 anLocalInt_101_ > anLocalInt_102_;
			 anLocalInt_102_++) {
			int anLocalInt_103_ = class59_sub28.g2();
			int anLocalInt_104_ = class59_sub28.g2();
			byte anLocalInt_105_;
			if (anLocalInt_45_ == 255)
			    anLocalInt_105_ = (((Class101) this).aByteArray790
					       [anLocalInt_104_]);
			else
			    anLocalInt_105_ = (byte) anLocalInt_45_;
			((Class101) this).aClass38Array787[anLocalInt_102_]
			    = new Class38(anLocalInt_103_,
					  (((Class101) this).aShortArray798
					   [anLocalInt_104_]),
					  (((Class101) this).aShortArray807
					   [anLocalInt_104_]),
					  (((Class101) this).aShortArray793
					   [anLocalInt_104_]),
					  anLocalInt_105_);
		    }
		}
		int anLocalInt_106_ = class59_sub28.g1();
		if (anLocalInt_106_ > 0) {
		    ((Class101) this).aClass185Array817
			= new Class185[anLocalInt_106_];
		    for (int anLocalInt_107_ = 0;
			 anLocalInt_106_ > anLocalInt_107_;
			 anLocalInt_107_++) {
			int anLocalInt_108_ = class59_sub28.g2();
			int anLocalInt_109_ = class59_sub28.g2();
			((Class101) this).aClass185Array817[anLocalInt_107_]
			    = new Class185(anLocalInt_108_, anLocalInt_109_);
		    }
		}
	    }
	    if (anLocalBoolean_43_) {
		int anLocalInt_110_ = class59_sub28.g1();
		if (anLocalInt_110_ > 0) {
		    ((Class101) this).aClass147Array784
			= new Class147[anLocalInt_110_];
		    for (int anLocalInt_111_ = 0;
			 anLocalInt_110_ > anLocalInt_111_;
			 anLocalInt_111_++) {
			int anLocalInt_112_ = class59_sub28.g2();
			int anLocalInt_113_ = class59_sub28.g2();
			int anLocalInt_114_
			    = class59_sub28.g1();
			byte anLocalInt_115_
			    = class59_sub28.g1s();
			((Class101) this).aClass147Array784[anLocalInt_111_]
			    = new Class147(anLocalInt_112_, anLocalInt_113_,
					   anLocalInt_114_, anLocalInt_115_);
		    }
		}
	    }
	}
    }
    
    final byte method1742(short argument_116_, byte argument_117_,
			  byte argument_118_, short argument_119_,
			  short argument_120_, byte argument_121_,
			  byte argument_122_, short argument_123_,
			  short argument_124_, short argument_125_) {
	if (((Class101) this).anInt812 >= 255)
	    throw new IllegalStateException();
	((Class101) this).aByteArray800[((Class101) this).anInt812] = (byte) 3;
	((Class101) this).aShortArray821[((Class101) this).anInt812]
	    = argument_120_;
	((Class101) this).aShortArray803[((Class101) this).anInt812]
	    = argument_124_;
	((Class101) this).aShortArray799[((Class101) this).anInt812]
	    = argument_119_;
	((Class101) this).anIntArray804[((Class101) this).anInt812]
	    = argument_123_;
	((Class101) this).anIntArray811[((Class101) this).anInt812]
	    = argument_116_;
	((Class101) this).anIntArray791[((Class101) this).anInt812]
	    = argument_125_;
	((Class101) this).aByteArray802[((Class101) this).anInt812]
	    = argument_117_;
	((Class101) this).aByteArray786[((Class101) this).anInt812]
	    = argument_121_;
	((Class101) this).anIntArray819[((Class101) this).anInt812]
	    = argument_122_;
	return (byte) ((Class101) this).anInt812++;
    }
    
    final int[][] method1743(int argument_126_, boolean argument_127_) {
	int[] anLocalInts = new int[256];
	int anLocalInt = 0;
	int anLocalInt_128_ = (!argument_127_ ? ((Class101) this).anInt797
			       : ((Class101) this).anInt792);
	for (int anLocalInt_129_ = 0; anLocalInt_128_ > anLocalInt_129_;
	     anLocalInt_129_++) {
	    int anLocalInt_130_
		= ((Class101) this).anIntArray796[anLocalInt_129_];
	    if (anLocalInt_130_ >= 0) {
		anLocalInts[anLocalInt_130_]++;
		if (anLocalInt < anLocalInt_130_)
		    anLocalInt = anLocalInt_130_;
	    }
	}
	int[][] anLocalInts_131_ = new int[anLocalInt + 1][];
	for (int anLocalInt_132_ = argument_126_;
	     anLocalInt_132_ <= anLocalInt; anLocalInt_132_++) {
	    anLocalInts_131_[anLocalInt_132_]
		= new int[anLocalInts[anLocalInt_132_]];
	    anLocalInts[anLocalInt_132_] = 0;
	}
	for (int anLocalInt_133_ = 0; anLocalInt_128_ > anLocalInt_133_;
	     anLocalInt_133_++) {
	    int anLocalInt_134_
		= ((Class101) this).anIntArray796[anLocalInt_133_];
	    if (anLocalInt_134_ >= 0)
		anLocalInts_131_[anLocalInt_134_]
		    [anLocalInts[anLocalInt_134_]++]
		    = anLocalInt_133_;
	}
	return anLocalInts_131_;
    }
    
    final int[][] method1744(byte argument_135_) {
	int[] anLocalInts = new int[256];
	int anLocalInt = 0;
	for (int anLocalInt_136_ = 0;
	     ((Class101) this).anInt795 > anLocalInt_136_; anLocalInt_136_++) {
	    int anLocalInt_137_
		= ((Class101) this).anIntArray809[anLocalInt_136_];
	    if (anLocalInt_137_ >= 0) {
		anLocalInts[anLocalInt_137_]++;
		if (anLocalInt < anLocalInt_137_)
		    anLocalInt = anLocalInt_137_;
	    }
	}
	int[][] anLocalInts_138_ = new int[anLocalInt + 1][];
	for (int anLocalInt_139_ = 0; anLocalInt >= anLocalInt_139_;
	     anLocalInt_139_++) {
	    anLocalInts_138_[anLocalInt_139_]
		= new int[anLocalInts[anLocalInt_139_]];
	    anLocalInts[anLocalInt_139_] = 0;
	}
	for (int anLocalInt_140_ = 0;
	     anLocalInt_140_ < ((Class101) this).anInt795; anLocalInt_140_++) {
	    int anLocalInt_141_
		= ((Class101) this).anIntArray809[anLocalInt_140_];
	    if (anLocalInt_141_ >= 0)
		anLocalInts_138_[anLocalInt_141_]
		    [anLocalInts[anLocalInt_141_]++]
		    = anLocalInt_140_;
	}
	return anLocalInts_138_;
    }
    
    final int method1745
	(int argument_142_, byte argument_143_, int argument_144_,
	 short argument_145_, int argument_146_, byte argument_147_,
	 short argument_148_, int argument_149_, byte argument_150_) {
	((Class101) this).aShortArray798[((Class101) this).anInt795]
	    = (short) argument_149_;
	((Class101) this).aShortArray807[((Class101) this).anInt795]
	    = (short) argument_144_;
	((Class101) this).aShortArray793[((Class101) this).anInt795]
	    = (short) argument_146_;
	((Class101) this).aByteArray813[((Class101) this).anInt795]
	    = argument_150_;
	((Class101) this).aByteArray818[((Class101) this).anInt795]
	    = argument_143_;
	if (argument_142_ != 0)
	    method1740((short) -104, -7, (byte) 3, null);
	((Class101) this).aShortArray783[((Class101) this).anInt795]
	    = argument_145_;
	((Class101) this).aByteArray816[((Class101) this).anInt795]
	    = argument_147_;
	((Class101) this).aShortArray815[((Class101) this).anInt795]
	    = argument_148_;
	return ((Class101) this).anInt795++;
    }
    
    static final void method1746(int argument_151_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(11, 13175,
            (long) argument_151_);
	class59_sub51_sub3.method1181(585134072);
    }
    
    public static void method1747(byte argument) {
	anIntArray823 = null;
	anIntArray788 = null;
	aClass207_808 = null;
    }
    
    static final int method1748(boolean argument, String argument_152_) {
	if (!((Signlink) Class289.aSignlink_2307).useCache)
	    return -1;
	if (Statics.fileTable.containsKey(argument_152_))
	    return 100;
	String string = NativeManager.method1618(-3275, argument_152_);
	if (string == null)
	    return -1;
	String string_153_ = Class_s_Sub2.aString5366 + string;
	if (!Class371.aJs5Store_3130.fileExists(string_153_, ""))
	    return -1;
	if (!Class371.aJs5Store_3130.isLoaded(string_153_))
	    return Class371.aJs5Store_3130.getFileProgress(string_153_);
	byte[] anLocalInts
	    = Class371.aJs5Store_3130.getData(string_153_, "");
	Object object = null;
	File file;
	try {
	    file = CacheFileOpener.getCacheFile(string);
	} catch (RuntimeException runtimeexception) {
	    return -1;
	}
	if (anLocalInts != null && file != null) {
	    boolean anLocalBoolean = true;
	    byte[] anLocalInts_154_ = MultilanguageString.method3779(file, 8);
	    if (anLocalInts_154_ != null
		&& anLocalInts.length == anLocalInts_154_.length) {
		for (int anLocalInt = 0; anLocalInt < anLocalInts_154_.length;
		     anLocalInt++) {
		    if (anLocalInts[anLocalInt]
			!= anLocalInts_154_[anLocalInt]) {
			anLocalBoolean = false;
			break;
		    }
		}
	    } else
		anLocalBoolean = false;
	    try {
		if (!anLocalBoolean)
		    Class289.aSignlink_2307.writeFile(file, anLocalInts);
	    } catch (Throwable throwable) {
		return -1;
	    }
	    NativeManager.method4095(argument_152_, file);
	    return 100;
	}
	return -1;
    }
    
    private final void method1749(int argument_155_, byte[] argument_156_) {
	boolean anLocalBoolean = false;
	boolean anLocalBoolean_157_ = false;
	Packet class59_sub28 = new Packet(argument_156_);
	Packet class59_sub28_158_ = new Packet(argument_156_);
	Packet class59_sub28_159_ = new Packet(argument_156_);
	Packet class59_sub28_160_ = new Packet(argument_156_);
	Packet class59_sub28_161_ = new Packet(argument_156_);
	((Packet) class59_sub28).pos = argument_156_.length - 18;
	((Class101) this).anInt792 = class59_sub28.g2();
	((Class101) this).anInt795 = class59_sub28.g2();
	((Class101) this).anInt812 = class59_sub28.g1();
	int anLocalInt = class59_sub28.g1();
	int anLocalInt_162_ = class59_sub28.g1();
	int anLocalInt_163_ = class59_sub28.g1();
	int anLocalInt_164_ = class59_sub28.g1();
	int anLocalInt_165_ = class59_sub28.g1();
	int anLocalInt_166_ = class59_sub28.g2();
	int anLocalInt_167_ = class59_sub28.g2();
	int anLocalInt_168_ = class59_sub28.g2();
	int anLocalInt_169_ = class59_sub28.g2();
	int anLocalInt_170_ = 0;
	int anLocalInt_171_ = anLocalInt_170_;
	anLocalInt_170_ += ((Class101) this).anInt792;
	int anLocalInt_172_ = anLocalInt_170_;
	anLocalInt_170_ += ((Class101) this).anInt795;
	int anLocalInt_173_ = anLocalInt_170_;
	if (anLocalInt_162_ == 255)
	    anLocalInt_170_ += ((Class101) this).anInt795;
	int anLocalInt_174_ = anLocalInt_170_;
	if (anLocalInt_164_ == 1)
	    anLocalInt_170_ += ((Class101) this).anInt795;
	int anLocalInt_175_ = anLocalInt_170_;
	if (anLocalInt == 1)
	    anLocalInt_170_ += ((Class101) this).anInt795;
	int anLocalInt_176_ = anLocalInt_170_;
	if (anLocalInt_165_ == 1)
	    anLocalInt_170_ += ((Class101) this).anInt792;
	int anLocalInt_177_ = anLocalInt_170_;
	if (anLocalInt_163_ == 1)
	    anLocalInt_170_ += ((Class101) this).anInt795;
	int anLocalInt_178_ = anLocalInt_170_;
	anLocalInt_170_ += anLocalInt_169_;
	int anLocalInt_179_ = anLocalInt_170_;
	anLocalInt_170_ += ((Class101) this).anInt795 * 2;
	int anLocalInt_180_ = anLocalInt_170_;
	anLocalInt_170_ += ((Class101) this).anInt812 * 6;
	int anLocalInt_181_ = anLocalInt_170_;
	anLocalInt_170_ += anLocalInt_166_;
	int anLocalInt_182_ = anLocalInt_170_;
	anLocalInt_170_ += anLocalInt_167_;
	int anLocalInt_183_ = anLocalInt_170_;
	if (anLocalInt_165_ == 1)
	    ((Class101) this).anIntArray796
		= new int[((Class101) this).anInt792];
	anLocalInt_170_ += anLocalInt_168_;
	((Class101) this).anIntArray814 = new int[((Class101) this).anInt792];
	((Class101) this).anIntArray810 = new int[((Class101) this).anInt792];
	if (anLocalInt_162_ != 255)
	    ((Class101) this).aByte806 = (byte) anLocalInt_162_;
	else
	    ((Class101) this).aByteArray790
		= new byte[((Class101) this).anInt795];
	((Class101) this).aShortArray807
	    = new short[((Class101) this).anInt795];
	if (anLocalInt == 1) {
	    ((Class101) this).aShortArray815
		= new short[((Class101) this).anInt795];
	    ((Class101) this).aByteArray818
		= new byte[((Class101) this).anInt795];
	    ((Class101) this).aByteArray813
		= new byte[((Class101) this).anInt795];
	}
	((Class101) this).aShortArray783
	    = new short[((Class101) this).anInt795];
	((Class101) this).anIntArray785 = new int[((Class101) this).anInt792];
	((Packet) class59_sub28).pos = anLocalInt_171_;
	((Class101) this).aShortArray793
	    = new short[((Class101) this).anInt795];
	if (anLocalInt_163_ == 1)
	    ((Class101) this).aByteArray816
		= new byte[((Class101) this).anInt795];
	((Class101) this).aShortArray798
	    = new short[((Class101) this).anInt795];
	if (((Class101) this).anInt812 > 0) {
	    ((Class101) this).aShortArray799
		= new short[((Class101) this).anInt812];
	    ((Class101) this).aByteArray800
		= new byte[((Class101) this).anInt812];
	    ((Class101) this).aShortArray803
		= new short[((Class101) this).anInt812];
	    ((Class101) this).aShortArray821
		= new short[((Class101) this).anInt812];
	}
	if (anLocalInt_164_ == 1)
	    ((Class101) this).anIntArray809
		= new int[((Class101) this).anInt795];
	((Packet) class59_sub28_158_).pos = anLocalInt_181_;
	((Packet) class59_sub28_159_).pos = anLocalInt_182_;
	((Packet) class59_sub28_160_).pos = anLocalInt_183_;
	((Packet) class59_sub28_161_).pos = anLocalInt_176_;
	int anLocalInt_184_ = 0;
	int anLocalInt_185_ = 0;
	int anLocalInt_186_ = 0;
	int anLocalInt_187_ = -22 % ((-9 - argument_155_) / 44);
	for (int anLocalInt_188_ = 0;
	     anLocalInt_188_ < ((Class101) this).anInt792; anLocalInt_188_++) {
	    int anLocalInt_189_ = class59_sub28.g1();
	    int anLocalInt_190_ = 0;
	    if ((anLocalInt_189_ & 0x1) != 0)
		anLocalInt_190_ = class59_sub28_158_.gsmarts();
	    int anLocalInt_191_ = 0;
	    if ((anLocalInt_189_ & 0x2) != 0)
		anLocalInt_191_ = class59_sub28_159_.gsmarts();
	    int anLocalInt_192_ = 0;
	    if ((anLocalInt_189_ & 0x4) != 0)
		anLocalInt_192_ = class59_sub28_160_.gsmarts();
	    ((Class101) this).anIntArray814[anLocalInt_188_]
		= anLocalInt_190_ + anLocalInt_184_;
	    ((Class101) this).anIntArray810[anLocalInt_188_]
		= anLocalInt_185_ + anLocalInt_191_;
	    ((Class101) this).anIntArray785[anLocalInt_188_]
		= anLocalInt_186_ + anLocalInt_192_;
	    anLocalInt_185_ = ((Class101) this).anIntArray810[anLocalInt_188_];
	    anLocalInt_186_ = ((Class101) this).anIntArray785[anLocalInt_188_];
	    anLocalInt_184_ = ((Class101) this).anIntArray814[anLocalInt_188_];
	    if (anLocalInt_165_ == 1)
		((Class101) this).anIntArray796[anLocalInt_188_]
		    = class59_sub28_161_.g1();
	}
	((Packet) class59_sub28).pos = anLocalInt_179_;
	((Packet) class59_sub28_158_).pos = anLocalInt_175_;
	((Packet) class59_sub28_159_).pos = anLocalInt_173_;
	((Packet) class59_sub28_160_).pos = anLocalInt_177_;
	((Packet) class59_sub28_161_).pos = anLocalInt_174_;
	for (int anLocalInt_193_ = 0;
	     ((Class101) this).anInt795 > anLocalInt_193_; anLocalInt_193_++) {
	    ((Class101) this).aShortArray783[anLocalInt_193_]
		= (short) class59_sub28.g2();
	    if (anLocalInt == 1) {
		int anLocalInt_194_
		    = class59_sub28_158_.g1();
		if ((anLocalInt_194_ & 0x1) != 1)
		    ((Class101) this).aByteArray813[anLocalInt_193_]
			= (byte) 0;
		else {
		    anLocalBoolean = true;
		    ((Class101) this).aByteArray813[anLocalInt_193_]
			= (byte) 1;
		}
		if ((anLocalInt_194_ & 0x2) == 2) {
		    ((Class101) this).aByteArray818[anLocalInt_193_]
			= (byte) (anLocalInt_194_ >> 2);
		    ((Class101) this).aShortArray815[anLocalInt_193_]
			= ((Class101) this).aShortArray783[anLocalInt_193_];
		    ((Class101) this).aShortArray783[anLocalInt_193_]
			= (short) 127;
		    if (((Class101) this).aShortArray815[anLocalInt_193_]
			!= -1)
			anLocalBoolean_157_ = true;
		} else {
		    ((Class101) this).aByteArray818[anLocalInt_193_]
			= (byte) -1;
		    ((Class101) this).aShortArray815[anLocalInt_193_]
			= (short) -1;
		}
	    }
	    if (anLocalInt_162_ == 255)
		((Class101) this).aByteArray790[anLocalInt_193_]
		    = class59_sub28_159_.g1s();
	    if (anLocalInt_163_ == 1)
		((Class101) this).aByteArray816[anLocalInt_193_]
		    = class59_sub28_160_.g1s();
	    if (anLocalInt_164_ == 1)
		((Class101) this).anIntArray809[anLocalInt_193_]
		    = class59_sub28_161_.g1();
	}
	((Packet) class59_sub28).pos = anLocalInt_178_;
	((Class101) this).anInt797 = -1;
	((Packet) class59_sub28_158_).pos = anLocalInt_172_;
	short anLocalInt_195_ = 0;
	short anLocalInt_196_ = 0;
	short anLocalInt_197_ = 0;
	int anLocalInt_198_ = 0;
	for (int anLocalInt_199_ = 0;
	     anLocalInt_199_ < ((Class101) this).anInt795; anLocalInt_199_++) {
	    int anLocalInt_200_ = class59_sub28_158_.g1();
	    if (anLocalInt_200_ == 1) {
		anLocalInt_195_ = (short) (anLocalInt_198_
					   + class59_sub28.gsmarts());
		anLocalInt_198_ = anLocalInt_195_;
		anLocalInt_196_ = (short) (class59_sub28.gsmarts()
					   + anLocalInt_198_);
		anLocalInt_198_ = anLocalInt_196_;
		anLocalInt_197_ = (short) (class59_sub28.gsmarts()
					   + anLocalInt_198_);
		anLocalInt_198_ = anLocalInt_197_;
		((Class101) this).aShortArray798[anLocalInt_199_]
		    = anLocalInt_195_;
		((Class101) this).aShortArray807[anLocalInt_199_]
		    = anLocalInt_196_;
		((Class101) this).aShortArray793[anLocalInt_199_]
		    = anLocalInt_197_;
		if (anLocalInt_195_ > ((Class101) this).anInt797)
		    ((Class101) this).anInt797 = anLocalInt_195_;
		if (anLocalInt_196_ > ((Class101) this).anInt797)
		    ((Class101) this).anInt797 = anLocalInt_196_;
		if (((Class101) this).anInt797 < anLocalInt_197_)
		    ((Class101) this).anInt797 = anLocalInt_197_;
	    }
	    if (anLocalInt_200_ == 2) {
		anLocalInt_196_ = anLocalInt_197_;
		anLocalInt_197_ = (short) (class59_sub28.gsmarts()
					   + anLocalInt_198_);
		anLocalInt_198_ = anLocalInt_197_;
		((Class101) this).aShortArray798[anLocalInt_199_]
		    = anLocalInt_195_;
		((Class101) this).aShortArray807[anLocalInt_199_]
		    = anLocalInt_196_;
		((Class101) this).aShortArray793[anLocalInt_199_]
		    = anLocalInt_197_;
		if (((Class101) this).anInt797 < anLocalInt_197_)
		    ((Class101) this).anInt797 = anLocalInt_197_;
	    }
	    if (anLocalInt_200_ == 3) {
		anLocalInt_195_ = anLocalInt_197_;
		anLocalInt_197_ = (short) (anLocalInt_198_
					   + class59_sub28.gsmarts());
		anLocalInt_198_ = anLocalInt_197_;
		((Class101) this).aShortArray798[anLocalInt_199_]
		    = anLocalInt_195_;
		((Class101) this).aShortArray807[anLocalInt_199_]
		    = anLocalInt_196_;
		((Class101) this).aShortArray793[anLocalInt_199_]
		    = anLocalInt_197_;
		if (anLocalInt_197_ > ((Class101) this).anInt797)
		    ((Class101) this).anInt797 = anLocalInt_197_;
	    }
	    if (anLocalInt_200_ == 4) {
		short anLocalInt_201_ = anLocalInt_195_;
		anLocalInt_195_ = anLocalInt_196_;
		anLocalInt_197_ = (short) (anLocalInt_198_
					   + class59_sub28.gsmarts());
		anLocalInt_196_ = anLocalInt_201_;
		anLocalInt_198_ = anLocalInt_197_;
		((Class101) this).aShortArray798[anLocalInt_199_]
		    = anLocalInt_195_;
		((Class101) this).aShortArray807[anLocalInt_199_]
		    = anLocalInt_196_;
		((Class101) this).aShortArray793[anLocalInt_199_]
		    = anLocalInt_197_;
		if (((Class101) this).anInt797 < anLocalInt_197_)
		    ((Class101) this).anInt797 = anLocalInt_197_;
	    }
	}
	((Packet) class59_sub28).pos = anLocalInt_180_;
	((Class101) this).anInt797++;
	for (int anLocalInt_202_ = 0;
	     ((Class101) this).anInt812 > anLocalInt_202_; anLocalInt_202_++) {
	    ((Class101) this).aByteArray800[anLocalInt_202_] = (byte) 0;
	    ((Class101) this).aShortArray821[anLocalInt_202_]
		= (short) class59_sub28.g2();
	    ((Class101) this).aShortArray803[anLocalInt_202_]
		= (short) class59_sub28.g2();
	    ((Class101) this).aShortArray799[anLocalInt_202_]
		= (short) class59_sub28.g2();
	}
	if (((Class101) this).aByteArray818 != null) {
	    boolean anLocalBoolean_203_ = false;
	    for (int anLocalInt_204_ = 0;
		 ((Class101) this).anInt795 > anLocalInt_204_;
		 anLocalInt_204_++) {
		int anLocalInt_205_
		    = ((Class101) this).aByteArray818[anLocalInt_204_] & 0xff;
		if (anLocalInt_205_ != 255) {
		    if (((((Class101) this).aShortArray821[anLocalInt_205_]
			  & 0xffff)
			 == ((Class101) this).aShortArray798[anLocalInt_204_])
			&& ((((Class101) this).aShortArray803[anLocalInt_205_]
			     & 0xffff)
			    == (((Class101) this).aShortArray807
				[anLocalInt_204_]))
			&& (((Class101) this).aShortArray793[anLocalInt_204_]
			    == ((((Class101) this).aShortArray799
				 [anLocalInt_205_])
				& 0xffff)))
			((Class101) this).aByteArray818[anLocalInt_204_]
			    = (byte) -1;
		    else
			anLocalBoolean_203_ = true;
		}
	    }
	    if (!anLocalBoolean_203_)
		((Class101) this).aByteArray818 = null;
	}
	if (!anLocalBoolean_157_)
	    ((Class101) this).aShortArray815 = null;
	if (!anLocalBoolean)
	    ((Class101) this).aByteArray813 = null;
    }
    
    final int method1750(int argument_206_, int argument_207_,
			 int argument_208_, byte argument_209_) {
	for (int anLocalInt = 0; ((Class101) this).anInt792 > anLocalInt;
	     anLocalInt++) {
	    if (((Class101) this).anIntArray814[anLocalInt] == argument_207_
		&& argument_206_ == ((Class101) this).anIntArray810[anLocalInt]
		&& (((Class101) this).anIntArray785[anLocalInt]
		    == argument_208_))
		return anLocalInt;
	}
	((Class101) this).anIntArray814[((Class101) this).anInt792]
	    = argument_207_;
	((Class101) this).anIntArray810[((Class101) this).anInt792]
	    = argument_206_;
	((Class101) this).anIntArray785[((Class101) this).anInt792]
	    = argument_208_;
	((Class101) this).anInt797 = ((Class101) this).anInt792 + 1;
	return ((Class101) this).anInt792++;
    }
    
    final void method1751(short argument_210_, short argument_211_,
			  boolean argument_212_) {
	for (int anLocalInt = 0; ((Class101) this).anInt795 > anLocalInt;
	     anLocalInt++) {
	    if (((Class101) this).aShortArray783[anLocalInt] == argument_211_)
		((Class101) this).aShortArray783[anLocalInt] = argument_210_;
	}
    }
    
    public Class101() {
	((Class101) this).anInt795 = 0;
	((Class101) this).anInt812 = 0;
	((Class101) this).anInt820 = 12;
	((Class101) this).anInt792 = 0;
    }
    
    Class101(byte[] argument_213_) {
	((Class101) this).anInt795 = 0;
	((Class101) this).anInt812 = 0;
	((Class101) this).anInt820 = 12;
	((Class101) this).anInt792 = 0;
	if (argument_213_[argument_213_.length - 1] != -1
	    || argument_213_[argument_213_.length - 2] != -1)
	    method1749(66, argument_213_);
	else
	    method1741(argument_213_, 120);
    }
    
    Class101(int argument_214_, int argument_215_, int argument_216_) {
	((Class101) this).anInt795 = 0;
	((Class101) this).anInt812 = 0;
	((Class101) this).anInt820 = 12;
	((Class101) this).anInt792 = 0;
	((Class101) this).aShortArray807 = new short[argument_215_];
	((Class101) this).anIntArray814 = new int[argument_214_];
	((Class101) this).aShortArray783 = new short[argument_215_];
	((Class101) this).aByteArray790 = new byte[argument_215_];
	((Class101) this).aShortArray815 = new short[argument_215_];
	((Class101) this).anIntArray809 = new int[argument_215_];
	((Class101) this).anIntArray785 = new int[argument_214_];
	((Class101) this).aShortArray798 = new short[argument_215_];
	((Class101) this).anIntArray796 = new int[argument_214_];
	((Class101) this).aByteArray818 = new byte[argument_215_];
	((Class101) this).aByteArray813 = new byte[argument_215_];
	if (argument_216_ > 0) {
	    ((Class101) this).anIntArray819 = new int[argument_216_];
	    ((Class101) this).anIntArray791 = new int[argument_216_];
	    ((Class101) this).aByteArray786 = new byte[argument_216_];
	    ((Class101) this).aByteArray802 = new byte[argument_216_];
	    ((Class101) this).anIntArray804 = new int[argument_216_];
	    ((Class101) this).aByteArray800 = new byte[argument_216_];
	    ((Class101) this).anIntArray811 = new int[argument_216_];
	    ((Class101) this).aShortArray803 = new short[argument_216_];
	    ((Class101) this).aShortArray821 = new short[argument_216_];
	    ((Class101) this).anIntArray801 = new int[argument_216_];
	    ((Class101) this).aShortArray799 = new short[argument_216_];
	    ((Class101) this).anIntArray805 = new int[argument_216_];
	}
	((Class101) this).aShortArray793 = new short[argument_215_];
	((Class101) this).aByteArray816 = new byte[argument_215_];
	((Class101) this).anIntArray810 = new int[argument_214_];
    }
    
    final void method1752(int argument_217_, int argument_218_,
			  int argument_219_, int argument_220_) {
	for (int anLocalInt = 0; ((Class101) this).anInt792 > anLocalInt;
	     anLocalInt++) {
	    ((Class101) this).anIntArray814[anLocalInt] += argument_218_;
	    ((Class101) this).anIntArray810[anLocalInt] += argument_219_;
	    ((Class101) this).anIntArray785[anLocalInt] += argument_217_;
	}
    }
    
    Class101(Class101[] argument_221_, int argument_222_) {
	((Class101) this).anInt795 = 0;
	((Class101) this).anInt812 = 0;
	((Class101) this).anInt820 = 12;
	((Class101) this).anInt792 = 0;
	((Class101) this).anInt795 = 0;
	((Class101) this).anInt812 = 0;
	((Class101) this).anInt792 = 0;
	int anLocalInt = 0;
	int anLocalInt_223_ = 0;
	int anLocalInt_224_ = 0;
	boolean anLocalBoolean = false;
	boolean anLocalBoolean_225_ = false;
	boolean anLocalBoolean_226_ = false;
	boolean anLocalBoolean_227_ = false;
	boolean anLocalBoolean_228_ = false;
	((Class101) this).aByte806 = (byte) -1;
	boolean anLocalBoolean_229_ = false;
	for (int anLocalInt_230_ = 0; anLocalInt_230_ < argument_222_;
	     anLocalInt_230_++) {
	    Class101 class101 = argument_221_[anLocalInt_230_];
	    if (class101 != null) {
		((Class101) this).anInt792 += ((Class101) class101).anInt792;
		((Class101) this).anInt812 += ((Class101) class101).anInt812;
		((Class101) this).anInt795 += ((Class101) class101).anInt795;
		if (((Class101) class101).aClass147Array784 != null)
		    anLocalInt_224_
			+= ((Class101) class101).aClass147Array784.length;
		anLocalBoolean
		    = (anLocalBoolean
		       | ((Class101) class101).aByteArray813 != null);
		if (((Class101) class101).aClass185Array817 != null)
		    anLocalInt_223_
			+= ((Class101) class101).aClass185Array817.length;
		if (((Class101) class101).aClass38Array787 != null)
		    anLocalInt
			+= ((Class101) class101).aClass38Array787.length;
		anLocalBoolean_226_
		    = (anLocalBoolean_226_
		       | ((Class101) class101).aByteArray816 != null);
		anLocalBoolean_229_
		    = (anLocalBoolean_229_
		       | ((Class101) class101).anIntArray809 != null);
		anLocalBoolean_227_
		    = (anLocalBoolean_227_
		       | ((Class101) class101).aByteArray818 != null);
		if (((Class101) class101).aByteArray790 != null)
		    anLocalBoolean_225_ = true;
		else {
		    if (((Class101) this).aByte806 == -1)
			((Class101) this).aByte806
			    = ((Class101) class101).aByte806;
		    if (((Class101) class101).aByte806
			!= ((Class101) this).aByte806)
			anLocalBoolean_225_ = true;
		}
		anLocalBoolean_228_
		    = (anLocalBoolean_228_
		       | ((Class101) class101).aShortArray815 != null);
	    }
	}
	((Class101) this).aShortArray789
	    = new short[((Class101) this).anInt792];
	((Class101) this).aShortArray783
	    = new short[((Class101) this).anInt795];
	((Class101) this).aShortArray794
	    = new short[((Class101) this).anInt795];
	if (anLocalInt_223_ > 0)
	    ((Class101) this).aClass185Array817
		= new Class185[anLocalInt_223_];
	((Class101) this).anIntArray810 = new int[((Class101) this).anInt792];
	if (anLocalBoolean_227_)
	    ((Class101) this).aByteArray818
		= new byte[((Class101) this).anInt795];
	if (anLocalBoolean_225_)
	    ((Class101) this).aByteArray790
		= new byte[((Class101) this).anInt795];
	((Class101) this).anIntArray796 = new int[((Class101) this).anInt792];
	if (((Class101) this).anInt812 > 0) {
	    ((Class101) this).aByteArray786
		= new byte[((Class101) this).anInt812];
	    ((Class101) this).anIntArray791
		= new int[((Class101) this).anInt812];
	    ((Class101) this).aShortArray821
		= new short[((Class101) this).anInt812];
	    ((Class101) this).anIntArray819
		= new int[((Class101) this).anInt812];
	    ((Class101) this).anIntArray801
		= new int[((Class101) this).anInt812];
	    ((Class101) this).anIntArray805
		= new int[((Class101) this).anInt812];
	    ((Class101) this).anIntArray804
		= new int[((Class101) this).anInt812];
	    ((Class101) this).anIntArray811
		= new int[((Class101) this).anInt812];
	    ((Class101) this).aShortArray799
		= new short[((Class101) this).anInt812];
	    ((Class101) this).aShortArray803
		= new short[((Class101) this).anInt812];
	    ((Class101) this).aByteArray802
		= new byte[((Class101) this).anInt812];
	    ((Class101) this).aByteArray800
		= new byte[((Class101) this).anInt812];
	}
	if (anLocalBoolean_229_)
	    ((Class101) this).anIntArray809
		= new int[((Class101) this).anInt795];
	((Class101) this).anIntArray785 = new int[((Class101) this).anInt792];
	if (anLocalBoolean_226_)
	    ((Class101) this).aByteArray816
		= new byte[((Class101) this).anInt795];
	((Class101) this).aShortArray798
	    = new short[((Class101) this).anInt795];
	if (anLocalInt_224_ > 0)
	    ((Class101) this).aClass147Array784
		= new Class147[anLocalInt_224_];
	((Class101) this).anIntArray814 = new int[((Class101) this).anInt792];
	if (anLocalBoolean_228_)
	    ((Class101) this).aShortArray815
		= new short[((Class101) this).anInt795];
	((Class101) this).aShortArray793
	    = new short[((Class101) this).anInt795];
	((Class101) this).aShortArray807
	    = new short[((Class101) this).anInt795];
	if (anLocalBoolean)
	    ((Class101) this).aByteArray813
		= new byte[((Class101) this).anInt795];
	if (anLocalInt > 0)
	    ((Class101) this).aClass38Array787 = new Class38[anLocalInt];
	anLocalInt = 0;
	anLocalInt_223_ = 0;
	((Class101) this).anInt812 = 0;
	anLocalInt_224_ = 0;
	((Class101) this).anInt795 = 0;
	((Class101) this).anInt792 = 0;
	for (int anLocalInt_231_ = 0; argument_222_ > anLocalInt_231_;
	     anLocalInt_231_++) {
	    short anLocalInt_232_ = (short) (1 << anLocalInt_231_);
	    Class101 class101 = argument_221_[anLocalInt_231_];
	    if (class101 != null) {
		if (((Class101) class101).aClass147Array784 != null) {
		    for (int anLocalInt_233_ = 0;
			 (anLocalInt_233_
			  < ((Class101) class101).aClass147Array784.length);
			 anLocalInt_233_++) {
			Class147 class147
			    = (((Class101) class101).aClass147Array784
			       [anLocalInt_233_]);
			((Class101) this).aClass147Array784[anLocalInt_224_++]
			    = class147.method2526((((Class101) this).anInt795
						   + (((Class147) class147)
						      .anInt1115)),
						  false);
		    }
		}
		for (int anLocalInt_234_ = 0;
		     ((Class101) class101).anInt795 > anLocalInt_234_;
		     anLocalInt_234_++) {
		    if (anLocalBoolean
			&& ((Class101) class101).aByteArray813 != null)
			((Class101) this).aByteArray813[(((Class101) this)
							 .anInt795)]
			    = (((Class101) class101).aByteArray813
			       [anLocalInt_234_]);
		    if (anLocalBoolean_225_) {
			if (((Class101) class101).aByteArray790 != null)
			    ((Class101) this).aByteArray790[(((Class101) this)
							     .anInt795)]
				= (((Class101) class101).aByteArray790
				   [anLocalInt_234_]);
			else
			    ((Class101) this).aByteArray790[(((Class101) this)
							     .anInt795)]
				= ((Class101) class101).aByte806;
		    }
		    if (anLocalBoolean_226_
			&& ((Class101) class101).aByteArray816 != null)
			((Class101) this).aByteArray816[(((Class101) this)
							 .anInt795)]
			    = (((Class101) class101).aByteArray816
			       [anLocalInt_234_]);
		    if (anLocalBoolean_228_) {
			if (((Class101) class101).aShortArray815 != null)
			    ((Class101) this).aShortArray815[(((Class101) this)
							      .anInt795)]
				= (((Class101) class101).aShortArray815
				   [anLocalInt_234_]);
			else
			    ((Class101) this).aShortArray815[(((Class101) this)
							      .anInt795)]
				= (short) -1;
		    }
		    if (anLocalBoolean_229_) {
			if (((Class101) class101).anIntArray809 != null)
			    ((Class101) this).anIntArray809[(((Class101) this)
							     .anInt795)]
				= (((Class101) class101).anIntArray809
				   [anLocalInt_234_]);
			else
			    ((Class101) this).anIntArray809[(((Class101) this)
							     .anInt795)]
				= -1;
		    }
		    ((Class101) this).aShortArray798[(((Class101) this)
						      .anInt795)]
			= (short) method1740(anLocalInt_232_,
					     (((Class101) class101)
					      .aShortArray798
					      [anLocalInt_234_]),
					     (byte) -83, class101);
		    ((Class101) this).aShortArray807[(((Class101) this)
						      .anInt795)]
			= (short) method1740(anLocalInt_232_,
					     (((Class101) class101)
					      .aShortArray807
					      [anLocalInt_234_]),
					     (byte) -71, class101);
		    ((Class101) this).aShortArray793[(((Class101) this)
						      .anInt795)]
			= (short) method1740(anLocalInt_232_,
					     (((Class101) class101)
					      .aShortArray793
					      [anLocalInt_234_]),
					     (byte) -61, class101);
		    ((Class101) this).aShortArray794[(((Class101) this)
						      .anInt795)]
			= anLocalInt_232_;
		    ((Class101) this).aShortArray783[(((Class101) this)
						      .anInt795)]
			= (((Class101) class101).aShortArray783
			   [anLocalInt_234_]);
		    ((Class101) this).anInt795++;
		}
		if (((Class101) class101).aClass38Array787 != null) {
		    for (int anLocalInt_235_ = 0;
			 (((Class101) class101).aClass38Array787.length
			  > anLocalInt_235_);
			 anLocalInt_235_++) {
			int anLocalInt_236_
			    = method1740(anLocalInt_232_,
					 (((Class38) (((Class101) class101)
						      .aClass38Array787
						      [anLocalInt_235_]))
					  .anInt286),
					 (byte) -127, class101);
			int anLocalInt_237_
			    = method1740(anLocalInt_232_,
					 (((Class38) (((Class101) class101)
						      .aClass38Array787
						      [anLocalInt_235_]))
					  .anInt284),
					 (byte) 76, class101);
			int anLocalInt_238_
			    = method1740(anLocalInt_232_,
					 (((Class38) (((Class101) class101)
						      .aClass38Array787
						      [anLocalInt_235_]))
					  .anInt281),
					 (byte) 118, class101);
			((Class101) this).aClass38Array787[anLocalInt]
			    = (((Class101) class101).aClass38Array787
				   [anLocalInt_235_].method391
			       (anLocalInt_238_, 0, anLocalInt_236_,
				anLocalInt_237_));
			anLocalInt++;
		    }
		}
		if (((Class101) class101).aClass185Array817 != null) {
		    for (int anLocalInt_239_ = 0;
			 (((Class101) class101).aClass185Array817.length
			  > anLocalInt_239_);
			 anLocalInt_239_++) {
			int anLocalInt_240_
			    = method1740(anLocalInt_232_,
					 (((Class185) (((Class101) class101)
						       .aClass185Array817
						       [anLocalInt_239_]))
					  .anInt1389),
					 (byte) -120, class101);
			((Class101) this).aClass185Array817[anLocalInt_223_]
			    = ((Class101) class101).aClass185Array817
				  [anLocalInt_239_]
				  .method2858(anLocalInt_240_, (byte) 93);
			anLocalInt_223_++;
		    }
		}
	    }
	}
	((Class101) this).anInt797 = ((Class101) this).anInt792;
	int anLocalInt_241_ = 0;
	for (int anLocalInt_242_ = 0; anLocalInt_242_ < argument_222_;
	     anLocalInt_242_++) {
	    short anLocalInt_243_ = (short) (1 << anLocalInt_242_);
	    Class101 class101 = argument_221_[anLocalInt_242_];
	    if (class101 != null) {
		for (int anLocalInt_244_ = 0;
		     anLocalInt_244_ < ((Class101) class101).anInt795;
		     anLocalInt_244_++) {
		    if (anLocalBoolean_227_)
			((Class101) this).aByteArray818[anLocalInt_241_++]
			    = (byte) (((((Class101) class101).aByteArray818
					== null)
				       || (((Class101) class101).aByteArray818
					   [anLocalInt_244_]) == -1)
				      ? -1
				      : ((((Class101) class101).aByteArray818
					  [anLocalInt_244_])
					 + ((Class101) this).anInt812));
		}
		for (int anLocalInt_245_ = 0;
		     ((Class101) class101).anInt812 > anLocalInt_245_;
		     anLocalInt_245_++) {
		    byte anLocalInt_246_
			= (((Class101) this).aByteArray800[(((Class101) this)
							    .anInt812)]
			   = (((Class101) class101).aByteArray800
			      [anLocalInt_245_]));
		    if (anLocalInt_246_ == 0) {
			((Class101) this).aShortArray821[(((Class101) this)
							  .anInt812)]
			    = (short) method1740(anLocalInt_243_,
						 (((Class101) class101)
						  .aShortArray821
						  [anLocalInt_245_]),
						 (byte) -107, class101);
			((Class101) this).aShortArray803[(((Class101) this)
							  .anInt812)]
			    = (short) method1740(anLocalInt_243_,
						 (((Class101) class101)
						  .aShortArray803
						  [anLocalInt_245_]),
						 (byte) -61, class101);
			((Class101) this).aShortArray799[(((Class101) this)
							  .anInt812)]
			    = (short) method1740(anLocalInt_243_,
						 (((Class101) class101)
						  .aShortArray799
						  [anLocalInt_245_]),
						 (byte) -69, class101);
		    }
		    if (anLocalInt_246_ >= 1 && anLocalInt_246_ <= 3) {
			((Class101) this).aShortArray821[(((Class101) this)
							  .anInt812)]
			    = (((Class101) class101).aShortArray821
			       [anLocalInt_245_]);
			((Class101) this).aShortArray803[(((Class101) this)
							  .anInt812)]
			    = (((Class101) class101).aShortArray803
			       [anLocalInt_245_]);
			((Class101) this).aShortArray799[(((Class101) this)
							  .anInt812)]
			    = (((Class101) class101).aShortArray799
			       [anLocalInt_245_]);
			((Class101) this).anIntArray804[(((Class101) this)
							 .anInt812)]
			    = (((Class101) class101).anIntArray804
			       [anLocalInt_245_]);
			((Class101) this).anIntArray811[(((Class101) this)
							 .anInt812)]
			    = (((Class101) class101).anIntArray811
			       [anLocalInt_245_]);
			((Class101) this).anIntArray791[(((Class101) this)
							 .anInt812)]
			    = (((Class101) class101).anIntArray791
			       [anLocalInt_245_]);
			((Class101) this).aByteArray802[(((Class101) this)
							 .anInt812)]
			    = (((Class101) class101).aByteArray802
			       [anLocalInt_245_]);
			((Class101) this).aByteArray786[(((Class101) this)
							 .anInt812)]
			    = (((Class101) class101).aByteArray786
			       [anLocalInt_245_]);
			((Class101) this).anIntArray819[(((Class101) this)
							 .anInt812)]
			    = (((Class101) class101).anIntArray819
			       [anLocalInt_245_]);
		    }
		    if (anLocalInt_246_ == 2) {
			((Class101) this).anIntArray805[(((Class101) this)
							 .anInt812)]
			    = (((Class101) class101).anIntArray805
			       [anLocalInt_245_]);
			((Class101) this).anIntArray801[(((Class101) this)
							 .anInt812)]
			    = (((Class101) class101).anIntArray801
			       [anLocalInt_245_]);
		    }
		    ((Class101) this).anInt812++;
		}
	    }
	}
    }
}
