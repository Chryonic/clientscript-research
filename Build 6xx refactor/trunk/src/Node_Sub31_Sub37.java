/* Class59_Sub31_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub37 extends Node_Sub31
{
    boolean aBoolean6018;
    int anInt6019 = 1638;
    static int[] anIntArray6020;
    static short[][][] aShortArrayArrayArray6021;
    private short[] aShortArray6022;
    int anInt6023;
    int anInt6024;
    int anInt6025 = 4;
    private short[] aShortArray6026;
    private static short[][] aShortArrayArray6027;
    private static short[][] aShortArrayArray6029
	= { new short[0], new short[0], new short[0], new short[0],
	    new short[0] };
    private byte[] aByteArray6030;
    int anInt6031;
    static int anInt6032;
    private static short[][] aShortArrayArray6033;
    static int[] anIntArray6034;
    
    final void method868(Packet argument_0_, int argument_1_,
			 byte argument_2_) {
	if (argument_2_ >= -41)
	    method994(-90, 54, 112, false, -52, -34, 18);
	int anLocalInt = argument_1_;
    while_192_:
	do {
	while_191_:
	    do {
	    while_190_:
		do {
		while_189_:
		    do {
		    while_188_:
			do {
			    do {
				if (anLocalInt != 0) {
				    if (anLocalInt != 1) {
					if (anLocalInt != 2) {
					    if (anLocalInt != 3) {
						if (anLocalInt != 4) {
						    if (anLocalInt != 5) {
							if (anLocalInt == 6)
							    break while_191_;
							break while_192_;
						    }
						} else
						    break while_189_;
						break while_190_;
					    }
					} else
					    break;
					break while_188_;
				    }
				} else {
				    ((Node_Sub31_Sub37) this).aBoolean6018
					= (argument_0_.g1()
					   == 1);
				    break while_192_;
				}
				((Node_Sub31_Sub37) this).anInt6025
				    = argument_0_.g1();
				break while_192_;
			    } while (false);
			    ((Node_Sub31_Sub37) this).anInt6019
				= argument_0_.g2s();
			    if (((Node_Sub31_Sub37) this).anInt6019 < 0) {
				aShortArray6022
				    = new short[(((Node_Sub31_Sub37) this)
						 .anInt6025)];
				for (anLocalInt = 0;
				     anLocalInt < (((Node_Sub31_Sub37) this)
						   .anInt6025);
				     anLocalInt++)
				    aShortArray6022[anLocalInt]
					= (short) argument_0_.g2s();
			    }
			    break while_192_;
			} while (false);
			((Node_Sub31_Sub37) this).anInt6024
			    = ((Node_Sub31_Sub37) this).anInt6031
			    = argument_0_.g1();
			break while_192_;
		    } while (false);
		    ((Node_Sub31_Sub37) this).anInt6023
			= argument_0_.g1();
		    break while_192_;
		} while (false);
		((Node_Sub31_Sub37) this).anInt6024
		    = argument_0_.g1();
		break while_192_;
	    } while (false);
	    ((Node_Sub31_Sub37) this).anInt6031
		= argument_0_.g1();
	} while (false);
    }
    
    private final int method994(int argument_3_, int argument_4_,
				int argument_5_, boolean argument_6_,
				int argument_7_, int argument_8_,
				int argument_9_) {
	if (argument_6_ != true)
	    AthmosphericConditions.previousFogThickness = 78;
	int anLocalInt = argument_7_ >> 12;
	int anLocalInt_10_ = anLocalInt + 1;
	if (argument_4_ <= anLocalInt_10_)
	    anLocalInt_10_ = 0;
	argument_7_ &= 0xfff;
	anLocalInt &= 0xff;
	int anLocalInt_11_ = argument_9_ - 4096;
	int anLocalInt_12_ = argument_7_ - 4096;
	anLocalInt_10_ &= 0xff;
	int anLocalInt_13_ = Class62_Sub11.anIntArray4401[argument_7_];
	int anLocalInt_14_ = aByteArray6030[anLocalInt + argument_8_] & 0x3;
	int anLocalInt_15_;
	if (anLocalInt_14_ > 1)
	    anLocalInt_15_ = (anLocalInt_14_ == 2 ? -argument_9_ + argument_7_
			      : -argument_9_ - argument_7_);
	else
	    anLocalInt_15_ = (anLocalInt_14_ != 0 ? -argument_7_ + argument_9_
			      : argument_9_ + argument_7_);
	anLocalInt_14_ = aByteArray6030[argument_8_ + anLocalInt_10_] & 0x3;
	int anLocalInt_16_;
	if (anLocalInt_14_ > 1)
	    anLocalInt_16_
		= (anLocalInt_14_ == 2 ? anLocalInt_12_ - argument_9_
		   : -argument_9_ - anLocalInt_12_);
	else
	    anLocalInt_16_
		= (anLocalInt_14_ != 0 ? argument_9_ - anLocalInt_12_
		   : anLocalInt_12_ + argument_9_);
	anLocalInt_14_ = aByteArray6030[argument_5_ + anLocalInt] & 0x3;
	int anLocalInt_17_
	    = (anLocalInt_15_
	       + (anLocalInt_13_ * (anLocalInt_16_ - anLocalInt_15_) >> 12));
	if (anLocalInt_14_ <= 1)
	    anLocalInt_15_
		= (anLocalInt_14_ == 0 ? argument_7_ + anLocalInt_11_
		   : -argument_7_ + anLocalInt_11_);
	else
	    anLocalInt_15_
		= (anLocalInt_14_ == 2 ? argument_7_ - anLocalInt_11_
		   : -anLocalInt_11_ - argument_7_);
	anLocalInt_14_ = aByteArray6030[argument_5_ + anLocalInt_10_] & 0x3;
	if (anLocalInt_14_ <= 1)
	    anLocalInt_16_
		= (anLocalInt_14_ == 0 ? anLocalInt_11_ + anLocalInt_12_
		   : -anLocalInt_12_ + anLocalInt_11_);
	else
	    anLocalInt_16_
		= (anLocalInt_14_ != 2 ? -anLocalInt_11_ - anLocalInt_12_
		   : -anLocalInt_11_ + anLocalInt_12_);
	int anLocalInt_18_
	    = (anLocalInt_15_
	       + (anLocalInt_13_ * (anLocalInt_16_ - anLocalInt_15_) >> 12));
	return ((argument_3_ * (-anLocalInt_17_ + anLocalInt_18_) >> 12)
		+ anLocalInt_17_);
    }
    
    public static void method995(byte argument) {
	anIntArray6034 = null;
	aShortArrayArray6027 = null;
	aShortArrayArrayArray6021 = null;
	HardCoding.aByteArray6017 = null;
	aShortArrayArray6029 = null;
	anIntArray6020 = null;
	aShortArrayArray6033 = null;
    }
    
    final void method996(int argument_19_, int[] argument_20_,
			 int argument_21_) {
	int anLocalInt = (((Node_Sub31_Sub37) this).anInt6031
			  * Class82.anIntArray585[argument_21_]);
	if (((Node_Sub31_Sub37) this).anInt6025 == 1) {
	    int anLocalInt_22_ = aShortArray6022[0];
	    int anLocalInt_23_ = aShortArray6026[0] << 12;
	    int anLocalInt_24_
		= (anLocalInt_23_ * ((Node_Sub31_Sub37) this).anInt6024
		   >> 12);
	    int anLocalInt_25_
		= (((Node_Sub31_Sub37) this).anInt6031 * anLocalInt_23_
		   >> 12);
	    int anLocalInt_26_ = anLocalInt * anLocalInt_23_ >> 12;
	    int anLocalInt_27_ = anLocalInt_26_ >> 12;
	    int anLocalInt_28_ = anLocalInt_27_ + 1;
	    if (anLocalInt_28_ >= anLocalInt_25_)
		anLocalInt_28_ = 0;
	    anLocalInt_26_ &= 0xfff;
	    int anLocalInt_29_ = aByteArray6030[anLocalInt_27_ & 0xff] & 0xff;
	    int anLocalInt_30_ = aByteArray6030[anLocalInt_28_ & 0xff] & 0xff;
	    int anLocalInt_31_ = Class62_Sub11.anIntArray4401[anLocalInt_26_];
	    if (((Node_Sub31_Sub37) this).aBoolean6018) {
		for (int anLocalInt_32_ = 0; Statics.anInt294 > anLocalInt_32_;
		     anLocalInt_32_++) {
		    int anLocalInt_33_
			= (Class130.anIntArray1053[anLocalInt_32_]
			   * ((Node_Sub31_Sub37) this).anInt6024);
		    int anLocalInt_34_
			= method994(anLocalInt_31_, anLocalInt_24_,
				    anLocalInt_30_, true,
				    anLocalInt_23_ * anLocalInt_33_ >> 12,
				    anLocalInt_29_, anLocalInt_26_);
		    anLocalInt_34_ = anLocalInt_34_ * anLocalInt_22_ >> 12;
		    argument_20_[anLocalInt_32_]
			= (anLocalInt_34_ >> 1) + 2048;
		}
	    } else {
		for (int anLocalInt_35_ = 0; Statics.anInt294 > anLocalInt_35_;
		     anLocalInt_35_++) {
		    int anLocalInt_36_
			= (Class130.anIntArray1053[anLocalInt_35_]
			   * ((Node_Sub31_Sub37) this).anInt6024);
		    int anLocalInt_37_
			= method994(anLocalInt_31_, anLocalInt_24_,
				    anLocalInt_30_, true,
				    anLocalInt_36_ * anLocalInt_23_ >> 12,
				    anLocalInt_29_, anLocalInt_26_);
		    argument_20_[anLocalInt_35_]
			= anLocalInt_37_ * anLocalInt_22_ >> 12;
		}
	    }
	} else {
	    int anLocalInt_38_ = aShortArray6022[0];
	    if (anLocalInt_38_ > 8 || anLocalInt_38_ < -8) {
		int anLocalInt_39_ = aShortArray6026[0] << 12;
		int anLocalInt_40_ = anLocalInt * anLocalInt_39_ >> 12;
		int anLocalInt_41_
		    = (((Node_Sub31_Sub37) this).anInt6024 * anLocalInt_39_
		       >> 12);
		int anLocalInt_42_
		    = (((Node_Sub31_Sub37) this).anInt6031 * anLocalInt_39_
		       >> 12);
		int anLocalInt_43_ = anLocalInt_40_ >> 12;
		int anLocalInt_44_ = anLocalInt_43_ + 1;
		if (anLocalInt_44_ >= anLocalInt_42_)
		    anLocalInt_44_ = 0;
		anLocalInt_40_ &= 0xfff;
		int anLocalInt_45_
		    = Class62_Sub11.anIntArray4401[anLocalInt_40_];
		int anLocalInt_46_
		    = aByteArray6030[anLocalInt_44_ & 0xff] & 0xff;
		int anLocalInt_47_
		    = aByteArray6030[anLocalInt_43_ & 0xff] & 0xff;
		for (int anLocalInt_48_ = 0; anLocalInt_48_ < Statics.anInt294;
		     anLocalInt_48_++) {
		    int anLocalInt_49_
			= (((Node_Sub31_Sub37) this).anInt6024
			   * Class130.anIntArray1053[anLocalInt_48_]);
		    int anLocalInt_50_
			= method994(anLocalInt_45_, anLocalInt_41_,
				    anLocalInt_46_, true,
				    anLocalInt_39_ * anLocalInt_49_ >> 12,
				    anLocalInt_47_, anLocalInt_40_);
		    argument_20_[anLocalInt_48_]
			= anLocalInt_50_ * anLocalInt_38_ >> 12;
		}
	    }
	    for (int anLocalInt_51_ = 1;
		 ((Node_Sub31_Sub37) this).anInt6025 > anLocalInt_51_;
		 anLocalInt_51_++) {
		anLocalInt_38_ = aShortArray6022[anLocalInt_51_];
		if (anLocalInt_38_ > 8 || anLocalInt_38_ < -8) {
		    int anLocalInt_52_ = aShortArray6026[anLocalInt_51_] << 12;
		    int anLocalInt_53_
			= ((((Node_Sub31_Sub37) this).anInt6031
			    * anLocalInt_52_)
			   >> 12);
		    int anLocalInt_54_ = anLocalInt_52_ * anLocalInt >> 12;
		    int anLocalInt_55_
			= ((anLocalInt_52_
			    * ((Node_Sub31_Sub37) this).anInt6024)
			   >> 12);
		    int anLocalInt_56_ = anLocalInt_54_ >> 12;
		    int anLocalInt_57_ = anLocalInt_56_ + 1;
		    if (anLocalInt_53_ <= anLocalInt_57_)
			anLocalInt_57_ = 0;
		    anLocalInt_54_ &= 0xfff;
		    int anLocalInt_58_
			= aByteArray6030[anLocalInt_57_ & 0xff] & 0xff;
		    int anLocalInt_59_
			= aByteArray6030[anLocalInt_56_ & 0xff] & 0xff;
		    int anLocalInt_60_
			= Class62_Sub11.anIntArray4401[anLocalInt_54_];
		    if (!((Node_Sub31_Sub37) this).aBoolean6018
			|| (((Node_Sub31_Sub37) this).anInt6025 - 1
			    != anLocalInt_51_)) {
			for (int anLocalInt_61_ = 0;
			     anLocalInt_61_ < Statics.anInt294;
			     anLocalInt_61_++) {
			    int anLocalInt_62_
				= (((Node_Sub31_Sub37) this).anInt6024
				   * Class130.anIntArray1053[anLocalInt_61_]);
			    int anLocalInt_63_
				= method994(anLocalInt_60_, anLocalInt_55_,
					    anLocalInt_58_, true,
					    (anLocalInt_52_ * anLocalInt_62_
					     >> 12),
					    anLocalInt_59_, anLocalInt_54_);
			    argument_20_[anLocalInt_61_]
				+= anLocalInt_38_ * anLocalInt_63_ >> 12;
			}
		    } else {
			for (int anLocalInt_64_ = 0;
			     Statics.anInt294 > anLocalInt_64_;
			     anLocalInt_64_++) {
			    int anLocalInt_65_
				= (((Node_Sub31_Sub37) this).anInt6024
				   * Class130.anIntArray1053[anLocalInt_64_]);
			    int anLocalInt_66_
				= method994(anLocalInt_60_, anLocalInt_55_,
					    anLocalInt_58_, true,
					    (anLocalInt_65_ * anLocalInt_52_
					     >> 12),
					    anLocalInt_59_, anLocalInt_54_);
			    anLocalInt_66_
				= (argument_20_[anLocalInt_64_]
				   + (anLocalInt_66_ * anLocalInt_38_ >> 12));
			    argument_20_[anLocalInt_64_]
				= (anLocalInt_66_ >> 1) + 2048;
			}
		    }
		}
	    }
	}
    }
    
    private final void method997(int argument_67_) {
	if (argument_67_ <= 86)
	    HardCoding.aByteArray6017 = null;
	if (((Node_Sub31_Sub37) this).anInt6019 <= 0) {
	    if (aShortArray6022 != null
		&& (((Node_Sub31_Sub37) this).anInt6025
		    == aShortArray6022.length)) {
		aShortArray6026
		    = new short[((Node_Sub31_Sub37) this).anInt6025];
		for (int anLocalInt = 0;
		     ((Node_Sub31_Sub37) this).anInt6025 > anLocalInt;
		     anLocalInt++)
		    aShortArray6026[anLocalInt]
			= (short) (int) Math.pow(2.0, (double) anLocalInt);
	    }
	} else {
	    aShortArray6022
		= new short[((Node_Sub31_Sub37) this).anInt6025];
	    aShortArray6026
		= new short[((Node_Sub31_Sub37) this).anInt6025];
	    for (int anLocalInt = 0;
		 anLocalInt < ((Node_Sub31_Sub37) this).anInt6025;
		 anLocalInt++) {
		aShortArray6022[anLocalInt]
		    = (short) (int) ((Math.pow
				      ((double) ((float) ((Node_Sub31_Sub37)
							  this).anInt6019
						 / 4096.0F),
				       (double) anLocalInt))
				     * 4096.0);
		aShortArray6026[anLocalInt]
		    = (short) (int) Math.pow(2.0, (double) anLocalInt);
	    }
	}
    }
    
    final int[] method867(byte argument_68_, int argument_69_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_69_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758)
	    method996(114, anLocalInts, argument_69_);
	if (argument_68_ <= 21)
	    return null;
	return anLocalInts;
    }
    
    final void method865(boolean argument_70_) {
	aByteArray6030
	    = Class179_Sub1.method2825(((Node_Sub31_Sub37) this).anInt6023,
				       false);
	method997(108);
	for (int anLocalInt = ((Node_Sub31_Sub37) this).anInt6025 - 1;
	     anLocalInt >= 1; anLocalInt--) {
	    short anLocalInt_71_ = aShortArray6022[anLocalInt];
	    if (anLocalInt_71_ > 8 || anLocalInt_71_ < -8)
		break;
	    ((Node_Sub31_Sub37) this).anInt6025--;
	}
    }
    
    public Node_Sub31_Sub37() {
	super(0, true);
	((Node_Sub31_Sub37) this).anInt6024 = 4;
	((Node_Sub31_Sub37) this).anInt6023 = 0;
	aByteArray6030 = new byte[512];
	((Node_Sub31_Sub37) this).aBoolean6018 = true;
	((Node_Sub31_Sub37) this).anInt6031 = 4;
    }
    
    static {
	anIntArray6020 = new int[3];
	aShortArrayArray6027
	    = new short[][] { new short[0], new short[0], new short[0],
			      new short[0], new short[0] };
	anIntArray6034 = new int[25];
	aShortArrayArray6033
	    = (new short[][]
	       { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760,
		   9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568,
		   -17472, -12373, -8256, -3545 },
		 { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760,
		   9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568,
		   -17472, -12373, -8256, -3545 },
		 { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760,
		   9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568,
		   -17472, -12373, -8256, -3545 },
		 { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760,
		   9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568,
		   -17472, -12373, -8256, -3545 },
		 { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760,
		   9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568,
		   -17472, -12373, -8256, -3545 } });
	aShortArrayArrayArray6021
	    = new short[][][] { aShortArrayArray6033, aShortArrayArray6029,
				aShortArrayArray6027 };
    }
}
