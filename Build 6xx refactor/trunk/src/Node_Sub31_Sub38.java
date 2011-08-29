/* Class59_Sub31_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Node_Sub31_Sub38 extends Node_Sub31
{
    private short[] aShortArray6035;
    private int anInt6036;
    private int anInt6037;
    private int anInt6038;
    private int anInt6039 = 0;
    private int anInt6040;
    private byte[] aByteArray6041;
    static Class166 aClass166_6042 = new Class166(71, 12);
    private int anInt6043;
    static int[] anIntArray6044 = new int[13];
    
    private final void method998(byte argument_0_) {
	if (argument_0_ != -111)
	    method998((byte) -52);
	Random random = new Random((long) anInt6039);
	aShortArray6035 = new short[512];
	if (anInt6043 > 0) {
	    for (int anLocalInt = 0; anLocalInt < 512; anLocalInt++)
		aShortArray6035[anLocalInt]
		    = (short) Class207.method2945(random, -128, anInt6043);
	}
    }
    
    final void method865(boolean argument_1_) {
	aByteArray6041 = Class179_Sub1.method2825(anInt6039, false);
	if (argument_1_ == true)
	    method998((byte) -111);
    }
    
    static final void method999(int argument, int argument_2_,
				int argument_3_) {
	Class55.anInt409 = -Class179.anInt1340 + argument_2_;
	Statics.anInt2726 = -Class179.anInt1353 + argument_3_;
    }
    
    public Node_Sub31_Sub38() {
	super(0, true);
	anInt6037 = 5;
	anInt6038 = 5;
	aShortArray6035 = new short[512];
	anInt6040 = 2;
	anInt6043 = 2048;
	anInt6036 = 1;
	aByteArray6041 = new byte[512];
    }
    
    public static void method1000(byte argument) {
	anIntArray6044 = null;
	aClass166_6042 = null;
    }
    
    final void method868(Packet argument_4_, int argument_5_,
			 byte argument_6_) {
	int anLocalInt = argument_5_;
    while_197_:
	do {
	while_196_:
	    do {
	    while_195_:
		do {
		while_194_:
		    do {
		    while_193_:
			do {
			    do {
				if (anLocalInt != 0) {
				    if (anLocalInt != 1) {
					if (anLocalInt != 2) {
					    if (anLocalInt != 3) {
						if (anLocalInt != 4) {
						    if (anLocalInt != 5) {
							if (anLocalInt == 6)
							    break while_196_;
							break while_197_;
						    }
						} else
						    break while_194_;
						break while_195_;
					    }
					} else
					    break;
					break while_193_;
				    }
				} else {
				    anInt6038 = anInt6037
					= argument_4_.g1();
				    break while_197_;
				}
				anInt6039 = argument_4_.g1();
				break while_197_;
			    } while (false);
			    anInt6043 = argument_4_.g2();
			    break while_197_;
			} while (false);
			anInt6040 = argument_4_.g1();
			break while_197_;
		    } while (false);
		    anInt6036 = argument_4_.g1();
		    break while_197_;
		} while (false);
		anInt6038 = argument_4_.g1();
		break while_197_;
	    } while (false);
	    anInt6037 = argument_4_.g1();
	} while (false);
	if (argument_6_ > -41)
	    anIntArray6044 = null;
    }
    
    final int[] method867(byte argument_7_, int argument_8_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_8_,
							      -13476);
	if (argument_7_ <= 21)
	    method1000((byte) 14);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int anLocalInt
		= anInt6037 * Class82.anIntArray585[argument_8_] + 2048;
	    int anLocalInt_9_ = anLocalInt >> 12;
	    int anLocalInt_10_ = anLocalInt_9_ + 1;
	    int anLocalInt_11_ = 0;
	while_205_:
	    for (/**/; Statics.anInt294 > anLocalInt_11_; anLocalInt_11_++) {
		Class73.anInt500 = Statics.anInt6415
		    = Class133_Sub1.anInt5003 = Class110.anInt914 = 2147483647;
		int anLocalInt_12_
		    = (Class130.anIntArray1053[anLocalInt_11_] * anInt6038
		       + 2048);
		int anLocalInt_13_ = anLocalInt_12_ >> 12;
		int anLocalInt_14_ = anLocalInt_13_ + 1;
		for (int anLocalInt_15_ = anLocalInt_9_ - 1;
		     anLocalInt_15_ <= anLocalInt_10_; anLocalInt_15_++) {
		    int anLocalInt_16_
			= (aByteArray6041[0xff & (anInt6037 <= anLocalInt_15_
						  ? anLocalInt_15_ - anInt6037
						  : anLocalInt_15_)]
			   & 0xff);
		    for (int anLocalInt_17_ = anLocalInt_13_ - 1;
			 anLocalInt_17_ <= anLocalInt_14_; anLocalInt_17_++) {
			int anLocalInt_18_
			    = ((aByteArray6041[((anLocalInt_17_ >= anInt6038
						 ? anLocalInt_17_ - anInt6038
						 : anLocalInt_17_)
						+ anLocalInt_16_) & 0xff]
				& 0xff)
			       * 2);
			int anLocalInt_19_
			    = (anLocalInt_12_ - (anLocalInt_17_ << 12)
			       - aShortArray6035[anLocalInt_18_++]);
			int anLocalInt_20_
			    = anLocalInt + (-aShortArray6035[anLocalInt_18_]
					    - (anLocalInt_15_ << 12));
			int anLocalInt_21_ = anInt6036;
			int anLocalInt_22_;
		    while_201_:
			do {
			while_200_:
			    do {
			    while_199_:
				do {
				while_198_:
				    do {
					do {
					    if (anLocalInt_21_ != 1) {
						if (anLocalInt_21_ != 3) {
						    if (anLocalInt_21_ != 4) {
							if (anLocalInt_21_
							    != 5) {
							    if (anLocalInt_21_
								== 2)
								break while_199_;
							    break while_200_;
							}
						    } else
							break;
						    break while_198_;
						}
					    } else {
						anLocalInt_22_
						    = (((anLocalInt_20_
							 * anLocalInt_20_)
							+ (anLocalInt_19_
							   * anLocalInt_19_))
						       >> 12);
						break while_201_;
					    }
					    anLocalInt_20_
						= (anLocalInt_20_ >= 0
						   ? anLocalInt_20_
						   : -anLocalInt_20_);
					    anLocalInt_19_
						= (anLocalInt_19_ >= 0
						   ? anLocalInt_19_
						   : -anLocalInt_19_);
					    anLocalInt_22_
						= ((anLocalInt_20_
						    >= anLocalInt_19_)
						   ? anLocalInt_20_
						   : anLocalInt_19_);
					    break while_201_;
					} while (false);
					anLocalInt_19_
					    = (int) ((Math.sqrt
						      ((double) ((float) ((anLocalInt_19_
									   >= 0)
									  ? anLocalInt_19_
									  : -anLocalInt_19_)
								 / 4096.0F)))
						     * 4096.0);
					anLocalInt_20_
					    = (int) ((Math.sqrt
						      ((double) ((float) ((anLocalInt_20_
									   >= 0)
									  ? anLocalInt_20_
									  : -anLocalInt_20_)
								 / 4096.0F)))
						     * 4096.0);
					anLocalInt_22_
					    = anLocalInt_20_ + anLocalInt_19_;
					anLocalInt_22_
					    = (anLocalInt_22_ * anLocalInt_22_
					       >> 12);
					break while_201_;
				    } while (false);
				    anLocalInt_20_ *= anLocalInt_20_;
				    anLocalInt_19_ *= anLocalInt_19_;
				    anLocalInt_22_
					= (int) ((Math.sqrt
						  (Math.sqrt
						   ((double) ((float) (anLocalInt_19_
								       + anLocalInt_20_)
							      / 1.6777216E7F))))
						 * 4096.0);
				    break while_201_;
				} while (false);
				anLocalInt_22_
				    = ((anLocalInt_20_ >= 0 ? anLocalInt_20_
					: -anLocalInt_20_)
				       - (anLocalInt_19_ < 0 ? anLocalInt_19_
					  : anLocalInt_19_));
				break while_201_;
			    } while (false);
			    anLocalInt_22_
				= (int) ((Math.sqrt
					  ((double) ((float) ((anLocalInt_19_
							       * anLocalInt_19_)
							      + (anLocalInt_20_
								 * anLocalInt_20_))
						     / 1.6777216E7F)))
					 * 4096.0);
			} while (false);
			if (anLocalInt_22_ < Class73.anInt500) {
			    Class110.anInt914 = Class133_Sub1.anInt5003;
			    Class133_Sub1.anInt5003
				= Statics.anInt6415;
			    Statics.anInt6415 = Class73.anInt500;
			    Class73.anInt500 = anLocalInt_22_;
			} else if (anLocalInt_22_
				   >= Statics.anInt6415) {
			    if (anLocalInt_22_ < Class133_Sub1.anInt5003) {
				Class110.anInt914 = Class133_Sub1.anInt5003;
				Class133_Sub1.anInt5003 = anLocalInt_22_;
			    } else if (Class110.anInt914 > anLocalInt_22_)
				Class110.anInt914 = anLocalInt_22_;
			} else {
			    Class110.anInt914 = Class133_Sub1.anInt5003;
			    Class133_Sub1.anInt5003
				= Statics.anInt6415;
			    Statics.anInt6415 = anLocalInt_22_;
			}
		    }
		}
		int anLocalInt_23_ = anInt6040;
	    while_203_:
		do {
		while_202_:
		    do {
			do {
			    if (anLocalInt_23_ != 0) {
				if (anLocalInt_23_ != 1) {
				    if (anLocalInt_23_ != 3) {
					if (anLocalInt_23_ != 4) {
					    if (anLocalInt_23_ == 2)
						break while_203_;
					    continue while_205_;
					}
				    } else
					break;
				    break while_202_;
				}
			    } else {
				anLocalInts[anLocalInt_11_] = Class73.anInt500;
				continue while_205_;
			    }
			    anLocalInts[anLocalInt_11_]
				= Statics.anInt6415;
			    continue while_205_;
			} while (false);
			anLocalInts[anLocalInt_11_] = Class133_Sub1.anInt5003;
			continue while_205_;
		    } while (false);
		    anLocalInts[anLocalInt_11_] = Class110.anInt914;
		    continue while_205_;
		} while (false);
		anLocalInts[anLocalInt_11_]
		    = Statics.anInt6415 - Class73.anInt500;
	    }
	}
	return anLocalInts;
    }
}
