/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class217
{
    static Class329 aClass329_1523 = new Class329(10, -1);
    int anInt1524;
    int anInt1525;
    int anInt1526;
    static String[] aStringArray1527 = new String[100];
    static Class244 aClass244_1528;
    static volatile long aLong1529 = 0L;
    static int anInt1530;
    int anInt1531;
    
    static final void method3010(Class167 argument, Class80 argument_0_,
				 int argument_1_, int argument_2_,
				 int argument_3_, int argument_4_) {
	if (argument_4_ != 1)
	    method3013((byte) -98);
	if (argument != null)
	    argument_0_.method1588(argument.fa(), argument_1_,
				   argument_4_ ^ 0x4e07, argument.RA(),
				   argument.EA(), argument.HA(), argument.na(),
				   argument.V(), argument_3_, argument_2_,
				   argument.G());
    }
    
    static final void method3011(int argument) {
	Class373.anInt3205 = 0;
	Class62_Sub6.anInt4389++;
	JagexStringEncoding.anInt128 = argument;
	Statics.method177(87);
	Node_Sub31_Sub9.method901((byte) 107);
	Node_Sub49.method1154((byte) 124);
	boolean anLocalBoolean = false;
	for (int anLocalInt = 0; Class373.anInt3205 > anLocalInt;
	     anLocalInt++) {
	    int anLocalInt_5_ = Class61.anIntArray438[anLocalInt];
	    Node_Sub35 class59_sub35
		= ((Node_Sub35)
		   Class294.aJagexHashMap_2453.get((long) anLocalInt_5_));
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
		= (((Node_Sub35) class59_sub35)
		   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
	    if (Node_Sub31_Sub39.aBoolean6055
		&& Class383.method4109(anLocalInt_5_, -127))
		Statics.method2600(0);
	    if ((((Entity) class104_sub2_sub2_sub5_sub1)
		 .anInt6769)
		!= Class62_Sub6.anInt4389) {
		if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
		     class104_sub2_sub2_sub5_sub1)
			.aClass291_6832.method3495(true))
		    Class385.method4123(class104_sub2_sub2_sub5_sub1,
					(byte) 111);
		class104_sub2_sub2_sub5_sub1.method1851(null, false);
		anLocalBoolean = true;
		class59_sub35.unlink();
	    }
	}
	if (anLocalBoolean) {
	    Statics.anInt5573
		= Class294.aJagexHashMap_2453.count();
	    Class294.aJagexHashMap_2453.method1520(argument,
					      (Node_Sub31_Sub13
					       .aClass59_Sub35Array5900));
	}
	if (((Packet) Network.stream).pos
	    != Network.anInt4454)
	    throw new RuntimeException("gnp1 pos:"
				       + (((Packet)
					   Network.stream)
					  .pos)
				       + " psize:" + Network.anInt4454);
	for (int anLocalInt = 0; dba_sub_772_Sub2.anInt6369 > anLocalInt;
	     anLocalInt++) {
	    if ((Class294.aJagexHashMap_2453.get((long) DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616[anLocalInt]))
		== null)
		throw new RuntimeException("gnp2 pos:" + anLocalInt + " size:"
					   + dba_sub_772_Sub2.anInt6369);
	}
	if (-dba_sub_772_Sub2.anInt6369 + Statics.anInt5573 != 0)
	    throw new RuntimeException("gnp3 mis:"
				       + (-dba_sub_772_Sub2.anInt6369
					  + Statics.anInt5573));
	for (int anLocalInt = 0; anLocalInt < Statics.anInt5573;
	     anLocalInt++) {
	    if (Class62_Sub6.anInt4389
		!= ((Entity)
		    (((Node_Sub35)
		      Node_Sub31_Sub13.aClass59_Sub35Array5900[anLocalInt])
		     .aClass104_Sub2_Sub2_Sub5_Sub1_4157)).anInt6769)
		throw new RuntimeException
			  ("gnp4 uk:"
			   + (((Entity)
			       (((Node_Sub35) (Node_Sub31_Sub13
						  .aClass59_Sub35Array5900
						  [anLocalInt]))
				.aClass104_Sub2_Sub2_Sub5_Sub1_4157))
			      .anInt6745));
	}
    }
    
    static final void method3012(int argument, int argument_6_,
				 int argument_7_, int argument_8_,
				 int argument_9_, int argument_10_) {
	Class298.anInt2475 = argument_7_;
	Class182.anInt1378 = argument_9_;
	Class120.anInt980 = argument_6_;
	Class47.anInt336 = argument;
	Class391.anInt3291 = argument_8_;
	if (Class47.anInt336 >= 100) {
	    int anLocalInt = Class120.anInt980 * 512 + 256;
	    int anLocalInt_11_ = Class298.anInt2475 * 512 + 256;
	    int anLocalInt_12_
		= (Node_Sub31_Sub36.method993(Class176.anInt1308,
                anLocalInt, -12040,
                anLocalInt_11_)
		   - Class182.anInt1378);
	    int anLocalInt_13_ = -Class287.anInt2299 + anLocalInt;
	    int anLocalInt_14_ = -Class2_Sub2.anInt3763 + anLocalInt_12_;
	    int anLocalInt_15_
		= -Node_Sub31_Sub30.anInt5987 + anLocalInt_11_;
	    int anLocalInt_16_
		= (int) Math.sqrt((double) (anLocalInt_15_ * anLocalInt_15_
					    + (anLocalInt_13_
					       * anLocalInt_13_)));
	    Class293.anInt2404 = (int) (Math.atan2((double) anLocalInt_14_,
						   (double) anLocalInt_16_)
					* 2607.5945876176133) & 0x3fff;
	    Node_Sub47_Sub3.anInt6167
		= (int) (Math.atan2((double) anLocalInt_13_,
				    (double) anLocalInt_15_)
			 * -2607.5945876176133) & 0x3fff;
	    if (Class293.anInt2404 < 1024)
		Class293.anInt2404 = 1024;
	    Class361.anInt3055 = 0;
	    if (Class293.anInt2404 > 3072)
		Class293.anInt2404 = 3072;
	}
	DoublyLinkedNodeP2_Sub2_Sub4_Sub1.anInt6573 = Class85.anInt607 = -1;
	Statics.anInt1745 = 2;
    }
    
    public static void method3013(byte argument) {
	aStringArray1527 = null;
	aClass329_1523 = null;
	aClass244_1528 = null;
    }
    
    static final void method3014(int argument, int argument_17_,
				 int argument_18_, int argument_19_,
				 int argument_20_, byte[] argument_21_) {
	if (argument_17_ < argument_18_) {
	    argument_20_ += argument_17_;
	    argument_19_ = argument_18_ - argument_17_ >> 2;
	    while (--argument_19_ >= 0) {
		argument_21_[argument_20_++] = (byte) 1;
		argument_21_[argument_20_++] = (byte) 1;
		argument_21_[argument_20_++] = (byte) 1;
		argument_21_[argument_20_++] = (byte) 1;
	    }
	    argument_19_ = -argument_17_ + argument_18_ & 0x3;
	    while (--argument_19_ >= 0)
		argument_21_[argument_20_++] = (byte) 1;
	}
    }
    
    public final String toString() {
	throw new IllegalStateException();
    }
    
    static final boolean method3015
	(int argument, int argument_22_, int argument_23_, int argument_24_,
	 int argument_25_, int argument_26_, int argument_27_,
	 int argument_28_, int argument_29_, int argument_30_) {
	if (argument_28_ > 2000 || argument_29_ > 2000 || argument_27_ > 2000
	    || argument > 2000 || argument_23_ > 2000 || argument_22_ > 2000)
	    return false;
	if (argument_28_ < -2000 || argument_29_ < -2000
	    || argument_27_ < -2000 || argument < -2000 || argument_23_ < -2000
	    || argument_22_ < -2000)
	    return false;
	if (GraphicsToolkit_Sub2.anInt4679 == 2) {
	    int anLocalInt = Class25.anInt164 * argument_28_ + argument;
	    if (anLocalInt >= 0
		&& DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406.length > anLocalInt
		&& ((argument_30_ << 8) - 38400
		    < DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406[anLocalInt]))
		return false;
	    anLocalInt = argument_23_ + argument_29_ * Class25.anInt164;
	    if (anLocalInt >= 0
		&& anLocalInt < DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406.length
		&& (DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406[anLocalInt]
		    > (argument_24_ << 8) - 38400))
		return false;
	    anLocalInt = argument_22_ + argument_27_ * Class25.anInt164;
	    if (anLocalInt >= 0
		&& DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406.length > anLocalInt
		&& ((argument_26_ << 8) - 38400
		    < DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406[anLocalInt]))
		return false;
	}
	int anLocalInt = argument_23_ - argument;
	int anLocalInt_31_ = argument_29_ - argument_28_;
	int anLocalInt_32_ = argument_22_ - argument;
	int anLocalInt_33_ = argument_27_ - argument_28_;
	int anLocalInt_34_ = argument_24_ - argument_30_;
	if (argument_28_ < argument_29_ && argument_27_ > argument_27_) {
	    if (argument_27_ >= argument_29_)
		argument_27_++;
	    else
		argument_29_++;
	    argument_28_--;
	} else if (argument_27_ > argument_29_) {
	    argument_29_--;
	    if (argument_27_ >= argument_28_)
		argument_27_++;
	    else
		argument_28_++;
	} else {
	    argument_27_--;
	    if (argument_29_ < argument_28_)
		argument_28_++;
	    else
		argument_29_++;
	}
	int anLocalInt_35_ = -argument_30_ + argument_26_;
	int anLocalInt_36_ = 0;
	if (argument_28_ != argument_29_)
	    anLocalInt_36_
		= (argument_23_ - argument << 12) / (argument_29_
						     - argument_28_);
	int anLocalInt_37_ = 0;
	if (argument_27_ != argument_29_)
	    anLocalInt_37_
		= (-argument_23_ + argument_22_ << 12) / (argument_27_
							  - argument_29_);
	int anLocalInt_38_ = argument_25_;
	if (argument_28_ != argument_27_)
	    anLocalInt_38_
		= (argument - argument_22_ << 12) / (-argument_27_
						     + argument_28_);
	int anLocalInt_39_
	    = -(anLocalInt_31_ * anLocalInt_32_) + anLocalInt_33_ * anLocalInt;
	if (anLocalInt_39_ == 0)
	    return false;
	int anLocalInt_40_ = (((-(anLocalInt_31_ * anLocalInt_35_)
				+ anLocalInt_33_ * anLocalInt_34_)
			       << 8)
			      / anLocalInt_39_);
	int anLocalInt_41_
	    = ((anLocalInt * anLocalInt_35_ - anLocalInt_34_ * anLocalInt_32_
		<< 8)
	       / anLocalInt_39_);
	if (argument_29_ < argument_28_ || argument_27_ < argument_28_) {
	    if (argument_27_ < argument_29_) {
		if (Class62_Sub16.anInt4414 <= argument_27_)
		    return true;
		if (argument_29_ > Class62_Sub16.anInt4414)
		    argument_29_ = Class62_Sub16.anInt4414;
		if (Class62_Sub16.anInt4414 < argument_28_)
		    argument_28_ = Class62_Sub16.anInt4414;
		argument_26_ = (anLocalInt_40_ + (argument_26_ << 8)
				- argument_22_ * anLocalInt_40_);
		if (argument_29_ <= argument_28_) {
		    argument = argument_22_ <<= 12;
		    if (argument_27_ < 0) {
			argument -= argument_27_ * anLocalInt_37_;
			argument_26_ -= anLocalInt_41_ * argument_27_;
			argument_22_ -= argument_27_ * anLocalInt_38_;
			argument_27_ = 0;
		    }
		    argument_23_ <<= 12;
		    if (argument_29_ < 0) {
			argument_23_ -= anLocalInt_36_ * argument_29_;
			argument_29_ = 0;
		    }
		    if (anLocalInt_37_ < anLocalInt_38_) {
			argument_28_ -= argument_29_;
			argument_29_ -= argument_27_;
			argument_27_ = Class25.anInt164 * argument_27_;
			while (--argument_29_ >= 0) {
			    if (!Class196.method2902(anLocalInt_40_,
						     (DoublyLinkedNodeP2_Sub2_Sub1
						      .anIntArray6406),
						     argument_27_,
						     argument_26_, 1874069218,
						     (argument >> 12) - 1,
						     (argument_22_ >> 12) + 1,
						     0))
				return false;
			    argument += anLocalInt_37_;
			    argument_27_ += Class25.anInt164;
			    argument_26_ += anLocalInt_41_;
			    argument_22_ += anLocalInt_38_;
			}
			while (--argument_28_ >= 0) {
			    if (!Class196.method2902(anLocalInt_40_,
						     (DoublyLinkedNodeP2_Sub2_Sub1
						      .anIntArray6406),
						     argument_27_,
						     argument_26_,
						     argument_25_ ^ 0x6fb406e2,
						     (argument_23_ >> 12) - 1,
						     (argument_22_ >> 12) + 1,
						     0))
				return false;
			    argument_22_ += anLocalInt_38_;
			    argument_26_ += anLocalInt_41_;
			    argument_23_ += anLocalInt_36_;
			    argument_27_ += Class25.anInt164;
			}
			return true;
		    }
		    argument_28_ -= argument_29_;
		    argument_29_ -= argument_27_;
		    argument_27_ = Class25.anInt164 * argument_27_;
		    while (--argument_29_ >= 0) {
			if (!Class196.method2902(anLocalInt_40_,
						 (DoublyLinkedNodeP2_Sub2_Sub1
						  .anIntArray6406),
						 argument_27_, argument_26_,
						 1874069218,
						 (argument_22_ >> 12) - 1,
						 (argument >> 12) + 1, 0))
			    return false;
			argument_27_ += Class25.anInt164;
			argument += anLocalInt_37_;
			argument_22_ += anLocalInt_38_;
			argument_26_ += anLocalInt_41_;
		    }
		    while (--argument_28_ >= 0) {
			if (!Class196.method2902(anLocalInt_40_,
						 (DoublyLinkedNodeP2_Sub2_Sub1
						  .anIntArray6406),
						 argument_27_, argument_26_,
						 argument_25_ + 1874069218,
						 (argument_22_ >> 12) - 1,
						 (argument_23_ >> 12) + 1, 0))
			    return false;
			argument_27_ += Class25.anInt164;
			argument_23_ += anLocalInt_36_;
			argument_22_ += anLocalInt_38_;
			argument_26_ += anLocalInt_41_;
		    }
		    return true;
		}
		argument_23_ = argument_22_ <<= 12;
		argument <<= 12;
		if (argument_27_ < 0) {
		    argument_26_ -= argument_27_ * anLocalInt_41_;
		    argument_22_ -= anLocalInt_38_ * argument_27_;
		    argument_23_ -= argument_27_ * anLocalInt_37_;
		    argument_27_ = 0;
		}
		if (argument_28_ < 0) {
		    argument -= argument_28_ * anLocalInt_36_;
		    argument_28_ = 0;
		}
		if (anLocalInt_37_ < anLocalInt_38_) {
		    argument_29_ -= argument_28_;
		    argument_28_ -= argument_27_;
		    argument_27_ = Class25.anInt164 * argument_27_;
		    while (--argument_28_ >= 0) {
			if (!Class196.method2902(anLocalInt_40_,
						 (DoublyLinkedNodeP2_Sub2_Sub1
						  .anIntArray6406),
						 argument_27_, argument_26_,
						 1874069218,
						 (argument_23_ >> 12) - 1,
						 (argument_22_ >> 12) + 1, 0))
			    return false;
			argument_27_ += Class25.anInt164;
			argument_23_ += anLocalInt_37_;
			argument_22_ += anLocalInt_38_;
			argument_26_ += anLocalInt_41_;
		    }
		    while (--argument_29_ >= 0) {
			if (!Class196.method2902(anLocalInt_40_,
						 (DoublyLinkedNodeP2_Sub2_Sub1
						  .anIntArray6406),
						 argument_27_, argument_26_,
						 argument_25_ ^ 0x6fb406e2,
						 (argument_23_ >> 12) - 1,
						 (argument >> 12) + 1, 0))
			    return false;
			argument_27_ += Class25.anInt164;
			argument_23_ += anLocalInt_37_;
			argument += anLocalInt_36_;
			argument_26_ += anLocalInt_41_;
		    }
		    return true;
		}
		argument_29_ -= argument_28_;
		argument_28_ -= argument_27_;
		argument_27_ *= Class25.anInt164;
		while (--argument_28_ >= 0) {
		    if (!Class196.method2902(anLocalInt_40_,
					     DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
					     argument_27_, argument_26_,
					     1874069218,
					     (argument_22_ >> 12) - 1,
					     (argument_23_ >> 12) + 1, 0))
			return false;
		    argument_23_ += anLocalInt_37_;
		    argument_26_ += anLocalInt_41_;
		    argument_27_ += Class25.anInt164;
		    argument_22_ += anLocalInt_38_;
		}
		while (--argument_29_ >= 0) {
		    if (!Class196.method2902(anLocalInt_40_,
					     DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
					     argument_27_, argument_26_,
					     1874069218, (argument >> 12) - 1,
					     (argument_23_ >> 12) + 1, 0))
			return false;
		    argument_23_ += anLocalInt_37_;
		    argument_26_ += anLocalInt_41_;
		    argument += anLocalInt_36_;
		    argument_27_ += Class25.anInt164;
		}
		return true;
	    }
	    if (argument_29_ >= Class62_Sub16.anInt4414)
		return true;
	    if (Class62_Sub16.anInt4414 < argument_28_)
		argument_28_ = Class62_Sub16.anInt4414;
	    argument_24_ = (-(anLocalInt_40_ * argument_23_)
			    + (argument_24_ << 8) + anLocalInt_40_);
	    if (Class62_Sub16.anInt4414 < argument_27_)
		argument_27_ = Class62_Sub16.anInt4414;
	    if (argument_27_ >= argument_28_) {
		argument_22_ = argument_23_ <<= 12;
		if (argument_29_ < 0) {
		    argument_23_ -= argument_29_ * anLocalInt_37_;
		    argument_22_ -= anLocalInt_36_ * argument_29_;
		    argument_24_ -= anLocalInt_41_ * argument_29_;
		    argument_29_ = 0;
		}
		argument <<= 12;
		if (argument_28_ < 0) {
		    argument -= argument_28_ * anLocalInt_38_;
		    argument_28_ = 0;
		}
		if (anLocalInt_37_ <= anLocalInt_36_) {
		    argument_27_ -= argument_28_;
		    argument_28_ -= argument_29_;
		    argument_29_ = Class25.anInt164 * argument_29_;
		    while (--argument_28_ >= 0) {
			if (!Class196.method2902(anLocalInt_40_,
						 (DoublyLinkedNodeP2_Sub2_Sub1
						  .anIntArray6406),
						 argument_29_, argument_24_,
						 1874069218,
						 (argument_23_ >> 12) - 1,
						 (argument_22_ >> 12) + 1, 0))
			    return false;
			argument_22_ += anLocalInt_36_;
			argument_29_ += Class25.anInt164;
			argument_23_ += anLocalInt_37_;
			argument_24_ += anLocalInt_41_;
		    }
		    while (--argument_27_ >= 0) {
			if (!Class196.method2902(anLocalInt_40_,
						 (DoublyLinkedNodeP2_Sub2_Sub1
						  .anIntArray6406),
						 argument_29_, argument_24_,
						 argument_25_ + 1874069218,
						 (argument_23_ >> 12) - 1,
						 (argument >> 12) + 1, 0))
			    return false;
			argument_23_ += anLocalInt_37_;
			argument_29_ += Class25.anInt164;
			argument_24_ += anLocalInt_41_;
			argument += anLocalInt_38_;
		    }
		    return true;
		}
		argument_27_ -= argument_28_;
		argument_28_ -= argument_29_;
		argument_29_ = Class25.anInt164 * argument_29_;
		while (--argument_28_ >= 0) {
		    if (!Class196.method2902(anLocalInt_40_,
					     DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
					     argument_29_, argument_24_,
					     argument_25_ + 1874069218,
					     (argument_22_ >> 12) - 1,
					     (argument_23_ >> 12) + 1, 0))
			return false;
		    argument_22_ += anLocalInt_36_;
		    argument_29_ += Class25.anInt164;
		    argument_24_ += anLocalInt_41_;
		    argument_23_ += anLocalInt_37_;
		}
		while (--argument_27_ >= 0) {
		    if (!Class196.method2902(anLocalInt_40_,
					     DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
					     argument_29_, argument_24_,
					     1874069218, (argument >> 12) - 1,
					     (argument_23_ >> 12) + 1, 0))
			return false;
		    argument_23_ += anLocalInt_37_;
		    argument += anLocalInt_38_;
		    argument_29_ += Class25.anInt164;
		    argument_24_ += anLocalInt_41_;
		}
		return true;
	    }
	    argument = argument_23_ <<= 12;
	    argument_22_ <<= 12;
	    if (argument_29_ < 0) {
		argument_24_ -= argument_29_ * anLocalInt_41_;
		argument_23_ -= argument_29_ * anLocalInt_37_;
		argument -= anLocalInt_36_ * argument_29_;
		argument_29_ = 0;
	    }
	    if (argument_27_ < 0) {
		argument_22_ -= anLocalInt_38_ * argument_27_;
		argument_27_ = 0;
	    }
	    if ((argument_27_ == argument_29_
		 || anLocalInt_36_ >= anLocalInt_37_)
		&& (argument_27_ != argument_29_
		    || anLocalInt_38_ >= anLocalInt_36_)) {
		argument_28_ -= argument_27_;
		argument_27_ -= argument_29_;
		argument_29_ *= Class25.anInt164;
		while (--argument_27_ >= 0) {
		    if (!Class196.method2902(anLocalInt_40_,
					     DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
					     argument_29_, argument_24_,
					     1874069218,
					     (argument_23_ >> 12) - 1,
					     (argument >> 12) + 1, 0))
			return false;
		    argument_29_ += Class25.anInt164;
		    argument_23_ += anLocalInt_37_;
		    argument_24_ += anLocalInt_41_;
		    argument += anLocalInt_36_;
		}
		while (--argument_28_ >= 0) {
		    if (!Class196.method2902(anLocalInt_40_,
					     DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
					     argument_29_, argument_24_,
					     argument_25_ + 1874069218,
					     (argument_22_ >> 12) - 1,
					     (argument >> 12) + 1, 0))
			return false;
		    argument_24_ += anLocalInt_41_;
		    argument_22_ += anLocalInt_38_;
		    argument_29_ += Class25.anInt164;
		    argument += anLocalInt_36_;
		}
		return true;
	    }
	    argument_28_ -= argument_27_;
	    argument_27_ -= argument_29_;
	    argument_29_ *= Class25.anInt164;
	    while (--argument_27_ >= 0) {
		if (!Class196.method2902(anLocalInt_40_,
					 DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
					 argument_29_, argument_24_,
					 1874069218, (argument >> 12) - 1,
					 (argument_23_ >> 12) + 1, 0))
		    return false;
		argument_23_ += anLocalInt_37_;
		argument_29_ += Class25.anInt164;
		argument_24_ += anLocalInt_41_;
		argument += anLocalInt_36_;
	    }
	    while (--argument_28_ >= 0) {
		if (!Class196.method2902(anLocalInt_40_,
					 DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
					 argument_29_, argument_24_,
					 1874069218, (argument >> 12) - 1,
					 (argument_22_ >> 12) + 1, 0))
		    return false;
		argument_29_ += Class25.anInt164;
		argument_22_ += anLocalInt_38_;
		argument_24_ += anLocalInt_41_;
		argument += anLocalInt_36_;
	    }
	    return true;
	}
	if (argument_28_ >= Class62_Sub16.anInt4414)
	    return true;
	argument_30_ = anLocalInt_40_ + ((argument_30_ << 8)
					 - argument * anLocalInt_40_);
	if (argument_29_ > Class62_Sub16.anInt4414)
	    argument_29_ = Class62_Sub16.anInt4414;
	if (argument_27_ > Class62_Sub16.anInt4414)
	    argument_27_ = Class62_Sub16.anInt4414;
	if (argument_27_ <= argument_29_) {
	    argument_23_ = argument <<= 12;
	    if (argument_28_ < 0) {
		argument_30_ -= anLocalInt_41_ * argument_28_;
		argument_23_ -= anLocalInt_38_ * argument_28_;
		argument -= anLocalInt_36_ * argument_28_;
		argument_28_ = 0;
	    }
	    argument_22_ <<= 12;
	    if (argument_27_ < 0) {
		argument_22_ -= argument_27_ * anLocalInt_37_;
		argument_27_ = 0;
	    }
	    if ((argument_28_ == argument_27_
		 || anLocalInt_36_ <= anLocalInt_38_)
		&& (argument_28_ != argument_27_
		    || anLocalInt_36_ >= anLocalInt_37_)) {
		argument_29_ -= argument_27_;
		argument_27_ -= argument_28_;
		argument_28_ = Class25.anInt164 * argument_28_;
		while (--argument_27_ >= 0) {
		    if (!Class196.method2902(anLocalInt_40_,
					     DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
					     argument_28_, argument_30_,
					     1874069218, (argument >> 12) - 1,
					     (argument_23_ >> 12) + 1, 0))
			return false;
		    argument_30_ += anLocalInt_41_;
		    argument_23_ += anLocalInt_38_;
		    argument += anLocalInt_36_;
		    argument_28_ += Class25.anInt164;
		}
		while (--argument_29_ >= 0) {
		    if (!Class196.method2902(anLocalInt_40_,
					     DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
					     argument_28_, argument_30_,
					     1874069218, (argument >> 12) - 1,
					     (argument_22_ >> 12) + 1, 0))
			return false;
		    argument_22_ += anLocalInt_37_;
		    argument_30_ += anLocalInt_41_;
		    argument += anLocalInt_36_;
		    argument_28_ += Class25.anInt164;
		}
		return true;
	    }
	    argument_29_ -= argument_27_;
	    argument_27_ -= argument_28_;
	    argument_28_ *= Class25.anInt164;
	    while (--argument_27_ >= 0) {
		if (!Class196.method2902(anLocalInt_40_,
					 DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
					 argument_28_, argument_30_,
					 argument_25_ + 1874069218,
					 (argument_23_ >> 12) - 1,
					 (argument >> 12) + 1, 0))
		    return false;
		argument_23_ += anLocalInt_38_;
		argument += anLocalInt_36_;
		argument_30_ += anLocalInt_41_;
		argument_28_ += Class25.anInt164;
	    }
	    while (--argument_29_ >= 0) {
		if (!Class196.method2902(anLocalInt_40_,
					 DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
					 argument_28_, argument_30_,
					 1874069218, (argument_22_ >> 12) - 1,
					 (argument >> 12) + 1, 0))
		    return false;
		argument_30_ += anLocalInt_41_;
		argument_22_ += anLocalInt_37_;
		argument_28_ += Class25.anInt164;
		argument += anLocalInt_36_;
	    }
	    return true;
	}
	argument_22_ = argument <<= 12;
	argument_23_ <<= 12;
	if (argument_28_ < 0) {
	    argument -= argument_28_ * anLocalInt_36_;
	    argument_22_ -= anLocalInt_38_ * argument_28_;
	    argument_30_ -= argument_28_ * anLocalInt_41_;
	    argument_28_ = 0;
	}
	if (argument_29_ < 0) {
	    argument_23_ -= anLocalInt_37_ * argument_29_;
	    argument_29_ = 0;
	}
	if ((argument_29_ == argument_28_ || anLocalInt_36_ <= anLocalInt_38_)
	    && (argument_29_ != argument_28_
		|| anLocalInt_37_ >= anLocalInt_38_)) {
	    argument_27_ -= argument_29_;
	    argument_29_ -= argument_28_;
	    argument_28_ *= Class25.anInt164;
	    while (--argument_29_ >= 0) {
		if (!Class196.method2902(anLocalInt_40_,
					 DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
					 argument_28_, argument_30_,
					 1874069218, (argument >> 12) - 1,
					 (argument_22_ >> 12) + 1, 0))
		    return false;
		argument_28_ += Class25.anInt164;
		argument += anLocalInt_36_;
		argument_22_ += anLocalInt_38_;
		argument_30_ += anLocalInt_41_;
	    }
	    while (--argument_27_ >= 0) {
		if (!Class196.method2902(anLocalInt_40_,
					 DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
					 argument_28_, argument_30_,
					 argument_25_ ^ 0x6fb406e2,
					 (argument_23_ >> 12) - 1,
					 (argument_22_ >> 12) + 1, 0))
		    return false;
		argument_22_ += anLocalInt_38_;
		argument_30_ += anLocalInt_41_;
		argument_28_ += Class25.anInt164;
		argument_23_ += anLocalInt_37_;
	    }
	    return true;
	}
	argument_27_ -= argument_29_;
	argument_29_ -= argument_28_;
	argument_28_ = Class25.anInt164 * argument_28_;
	while (--argument_29_ >= 0) {
	    if (!Class196.method2902(anLocalInt_40_,
				     DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
				     argument_28_, argument_30_, 1874069218,
				     (argument_22_ >> 12) - 1,
				     (argument >> 12) + 1, 0))
		return false;
	    argument_28_ += Class25.anInt164;
	    argument_30_ += anLocalInt_41_;
	    argument_22_ += anLocalInt_38_;
	    argument += anLocalInt_36_;
	}
	while (--argument_27_ >= 0) {
	    if (!Class196.method2902(anLocalInt_40_,
				     DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406,
				     argument_28_, argument_30_, 1874069218,
				     (argument_22_ >> 12) - 1,
				     (argument_23_ >> 12) + 1, 0))
		return false;
	    argument_28_ += Class25.anInt164;
	    argument_22_ += anLocalInt_38_;
	    argument_23_ += anLocalInt_37_;
	    argument_30_ += anLocalInt_41_;
	}
	return true;
    }
    
    Class217(int argument_42_, int argument_43_, int argument_44_,
	     int argument_45_) {
	((Class217) this).anInt1526 = argument_43_;
	((Class217) this).anInt1524 = argument_42_;
	((Class217) this).anInt1525 = argument_45_;
	((Class217) this).anInt1531 = argument_44_;
    }
}
