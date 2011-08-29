/* tia_sub_35_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class tia_sub_35_Sub2DoublyLinked extends tia_sub_35DoublyLinked
{
    int anInt6661;
    static boolean aBoolean6662 = false;
    int anInt6663;
    static Class85 aClass85_6664;
    static int anInt6665;
    byte[] aByteArray6666;
    static Js5Store aJs5Store_6667;
    int anInt6668;
    int anInt6669;
    static int anInt6670 = 1;
    
    final boolean method1224(int argument_0_, int argument_1_,
			     int argument_2_) {
	if (argument_1_ * argument_2_
	    > ((tia_sub_35_Sub2DoublyLinked) this).aByteArray6666.length)
	    return false;
	return true;
    }
    
    final void method1225(boolean argument_3_, int argument_4_,
			  int argument_5_, int argument_6_, int argument_7_,
			  int argument_8_, int argument_9_) {
	int anLocalInt = 0;
	if (argument_4_ != argument_9_)
	    anLocalInt = (argument_5_ - argument_8_ << 16) / (-argument_9_
							      + argument_4_);
	int anLocalInt_10_ = 0;
	if (argument_7_ != argument_4_)
	    anLocalInt_10_
		= (-argument_5_ + argument_6_ << 16) / (argument_7_
							- argument_4_);
	int anLocalInt_11_ = 0;
	if (argument_7_ != argument_9_)
	    anLocalInt_11_
		= (-argument_6_ + argument_8_ << 16) / (argument_9_
							- argument_7_);
	if (argument_4_ >= argument_9_ && argument_9_ <= argument_7_) {
	    if (argument_4_ >= argument_7_) {
		argument_5_ = argument_8_ <<= 16;
		argument_6_ <<= 16;
		if (argument_9_ < 0) {
		    argument_8_ -= anLocalInt * argument_9_;
		    argument_5_ -= argument_9_ * anLocalInt_11_;
		    argument_9_ = 0;
		}
		if (argument_7_ < 0) {
		    argument_6_ -= anLocalInt_10_ * argument_7_;
		    argument_7_ = 0;
		}
		if ((argument_9_ == argument_7_
		     || anLocalInt <= anLocalInt_11_)
		    && (argument_7_ != argument_9_
			|| anLocalInt >= anLocalInt_10_)) {
		    argument_4_ -= argument_7_;
		    argument_7_ -= argument_9_;
		    argument_9_
			= ((tia_sub_35_Sub2DoublyLinked) this).anInt6663 * argument_9_;
		    while (--argument_7_ >= 0) {
			Class217.method3014(105, argument_8_ >> 16,
					    argument_5_ >> 16, 0, argument_9_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_9_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
			argument_5_ += anLocalInt_11_;
			argument_8_ += anLocalInt;
		    }
		    while (--argument_4_ >= 0) {
			Class217.method3014(94, argument_8_ >> 16,
					    argument_6_ >> 16, 0, argument_9_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_8_ += anLocalInt;
			argument_6_ += anLocalInt_10_;
			argument_9_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		    }
		} else {
		    argument_4_ -= argument_7_;
		    argument_7_ -= argument_9_;
		    argument_9_
			= ((tia_sub_35_Sub2DoublyLinked) this).anInt6663 * argument_9_;
		    while (--argument_7_ >= 0) {
			Class217.method3014(101, argument_5_ >> 16,
					    argument_8_ >> 16, 0, argument_9_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_9_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
			argument_5_ += anLocalInt_11_;
			argument_8_ += anLocalInt;
		    }
		    while (--argument_4_ >= 0) {
			Class217.method3014(79, argument_6_ >> 16,
					    argument_8_ >> 16, 0, argument_9_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_8_ += anLocalInt;
			argument_9_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
			argument_6_ += anLocalInt_10_;
		    }
		}
	    } else {
		argument_6_ = argument_8_ <<= 16;
		if (argument_9_ < 0) {
		    argument_6_ -= argument_9_ * anLocalInt_11_;
		    argument_8_ -= anLocalInt * argument_9_;
		    argument_9_ = 0;
		}
		argument_5_ <<= 16;
		if (argument_4_ < 0) {
		    argument_5_ -= anLocalInt_10_ * argument_4_;
		    argument_4_ = 0;
		}
		if ((argument_4_ == argument_9_
		     || anLocalInt <= anLocalInt_11_)
		    && (argument_4_ != argument_9_
			|| anLocalInt_11_ <= anLocalInt_10_)) {
		    argument_7_ -= argument_4_;
		    argument_4_ -= argument_9_;
		    argument_9_
			= ((tia_sub_35_Sub2DoublyLinked) this).anInt6663 * argument_9_;
		    while (--argument_4_ >= 0) {
			Class217.method3014(104, argument_8_ >> 16,
					    argument_6_ >> 16, 0, argument_9_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_6_ += anLocalInt_11_;
			argument_8_ += anLocalInt;
			argument_9_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		    }
		    while (--argument_7_ >= 0) {
			Class217.method3014(124, argument_5_ >> 16,
					    argument_6_ >> 16, 0, argument_9_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_6_ += anLocalInt_11_;
			argument_9_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
			argument_5_ += anLocalInt_10_;
		    }
		} else {
		    argument_7_ -= argument_4_;
		    argument_4_ -= argument_9_;
		    argument_9_ *= ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		    while (--argument_4_ >= 0) {
			Class217.method3014(83, argument_6_ >> 16,
					    argument_8_ >> 16, 0, argument_9_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_6_ += anLocalInt_11_;
			argument_8_ += anLocalInt;
			argument_9_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		    }
		    while (--argument_7_ >= 0) {
			Class217.method3014(103, argument_6_ >> 16,
					    argument_5_ >> 16, 0, argument_9_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_9_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
			argument_6_ += anLocalInt_11_;
			argument_5_ += anLocalInt_10_;
		    }
		}
	    }
	} else if (argument_4_ <= argument_7_) {
	    if (argument_9_ > argument_7_) {
		argument_8_ = argument_5_ <<= 16;
		argument_6_ <<= 16;
		if (argument_4_ < 0) {
		    argument_8_ -= anLocalInt * argument_4_;
		    argument_5_ -= anLocalInt_10_ * argument_4_;
		    argument_4_ = 0;
		}
		if (argument_7_ < 0) {
		    argument_6_ -= anLocalInt_11_ * argument_7_;
		    argument_7_ = 0;
		}
		if (argument_7_ != argument_4_ && anLocalInt < anLocalInt_10_
		    || (argument_4_ == argument_7_
			&& anLocalInt_11_ < anLocalInt)) {
		    argument_9_ -= argument_7_;
		    argument_7_ -= argument_4_;
		    argument_4_
			= ((tia_sub_35_Sub2DoublyLinked) this).anInt6663 * argument_4_;
		    while (--argument_7_ >= 0) {
			Class217.method3014(126, argument_8_ >> 16,
					    argument_5_ >> 16, 0, argument_4_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_8_ += anLocalInt;
			argument_5_ += anLocalInt_10_;
			argument_4_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		    }
		    while (--argument_9_ >= 0) {
			Class217.method3014(108, argument_8_ >> 16,
					    argument_6_ >> 16, 0, argument_4_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_6_ += anLocalInt_11_;
			argument_4_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
			argument_8_ += anLocalInt;
		    }
		} else {
		    argument_9_ -= argument_7_;
		    argument_7_ -= argument_4_;
		    argument_4_
			= ((tia_sub_35_Sub2DoublyLinked) this).anInt6663 * argument_4_;
		    while (--argument_7_ >= 0) {
			Class217.method3014(80, argument_5_ >> 16,
					    argument_8_ >> 16, 0, argument_4_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_8_ += anLocalInt;
			argument_4_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
			argument_5_ += anLocalInt_10_;
		    }
		    while (--argument_9_ >= 0) {
			Class217.method3014(103, argument_6_ >> 16,
					    argument_8_ >> 16, 0, argument_4_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_6_ += anLocalInt_11_;
			argument_8_ += anLocalInt;
			argument_4_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		    }
		}
	    } else {
		argument_6_ = argument_5_ <<= 16;
		if (argument_4_ < 0) {
		    argument_5_ -= anLocalInt_10_ * argument_4_;
		    argument_6_ -= argument_4_ * anLocalInt;
		    argument_4_ = 0;
		}
		argument_8_ <<= 16;
		if (argument_9_ < 0) {
		    argument_8_ -= anLocalInt_11_ * argument_9_;
		    argument_9_ = 0;
		}
		if (anLocalInt_10_ <= anLocalInt) {
		    argument_7_ -= argument_9_;
		    argument_9_ -= argument_4_;
		    argument_4_ *= ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		    while (--argument_9_ >= 0) {
			Class217.method3014(66, argument_5_ >> 16,
					    argument_6_ >> 16, 0, argument_4_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_4_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
			argument_5_ += anLocalInt_10_;
			argument_6_ += anLocalInt;
		    }
		    while (--argument_7_ >= 0) {
			Class217.method3014(83, argument_5_ >> 16,
					    argument_8_ >> 16, 0, argument_4_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_4_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
			argument_5_ += anLocalInt_10_;
			argument_8_ += anLocalInt_11_;
		    }
		} else {
		    argument_7_ -= argument_9_;
		    argument_9_ -= argument_4_;
		    argument_4_
			= ((tia_sub_35_Sub2DoublyLinked) this).anInt6663 * argument_4_;
		    while (--argument_9_ >= 0) {
			Class217.method3014(116, argument_6_ >> 16,
					    argument_5_ >> 16, 0, argument_4_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_5_ += anLocalInt_10_;
			argument_6_ += anLocalInt;
			argument_4_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		    }
		    while (--argument_7_ >= 0) {
			Class217.method3014(102, argument_8_ >> 16,
					    argument_5_ >> 16, 0, argument_4_,
					    (((tia_sub_35_Sub2DoublyLinked) this)
					     .aByteArray6666));
			argument_4_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
			argument_8_ += anLocalInt_11_;
			argument_5_ += anLocalInt_10_;
		    }
		}
	    }
	} else if (argument_4_ <= argument_9_) {
	    argument_8_ = argument_6_ <<= 16;
	    if (argument_7_ < 0) {
		argument_6_ -= argument_7_ * anLocalInt_11_;
		argument_8_ -= argument_7_ * anLocalInt_10_;
		argument_7_ = 0;
	    }
	    argument_5_ <<= 16;
	    if (argument_4_ < 0) {
		argument_5_ -= argument_4_ * anLocalInt;
		argument_4_ = 0;
	    }
	    if (anLocalInt_10_ >= anLocalInt_11_) {
		argument_9_ -= argument_4_;
		argument_4_ -= argument_7_;
		argument_7_ *= ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		while (--argument_4_ >= 0) {
		    Class217.method3014(119, argument_6_ >> 16,
					argument_8_ >> 16, 0, argument_7_,
					(((tia_sub_35_Sub2DoublyLinked) this)
					 .aByteArray6666));
		    argument_7_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		    argument_6_ += anLocalInt_11_;
		    argument_8_ += anLocalInt_10_;
		}
		while (--argument_9_ >= 0) {
		    Class217.method3014(110, argument_6_ >> 16,
					argument_5_ >> 16, 0, argument_7_,
					(((tia_sub_35_Sub2DoublyLinked) this)
					 .aByteArray6666));
		    argument_6_ += anLocalInt_11_;
		    argument_7_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		    argument_5_ += anLocalInt;
		}
	    } else {
		argument_9_ -= argument_4_;
		argument_4_ -= argument_7_;
		argument_7_ = ((tia_sub_35_Sub2DoublyLinked) this).anInt6663 * argument_7_;
		while (--argument_4_ >= 0) {
		    Class217.method3014(126, argument_8_ >> 16,
					argument_6_ >> 16, 0, argument_7_,
					(((tia_sub_35_Sub2DoublyLinked) this)
					 .aByteArray6666));
		    argument_6_ += anLocalInt_11_;
		    argument_8_ += anLocalInt_10_;
		    argument_7_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		}
		while (--argument_9_ >= 0) {
		    Class217.method3014(67, argument_5_ >> 16,
					argument_6_ >> 16, 0, argument_7_,
					(((tia_sub_35_Sub2DoublyLinked) this)
					 .aByteArray6666));
		    argument_5_ += anLocalInt;
		    argument_6_ += anLocalInt_11_;
		    argument_7_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		}
	    }
	} else {
	    argument_5_ = argument_6_ <<= 16;
	    if (argument_7_ < 0) {
		argument_6_ -= anLocalInt_11_ * argument_7_;
		argument_5_ -= anLocalInt_10_ * argument_7_;
		argument_7_ = 0;
	    }
	    argument_8_ <<= 16;
	    if (argument_9_ < 0) {
		argument_8_ -= argument_9_ * anLocalInt;
		argument_9_ = 0;
	    }
	    if (anLocalInt_11_ > anLocalInt_10_) {
		argument_4_ -= argument_9_;
		argument_9_ -= argument_7_;
		argument_7_ *= ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		while (--argument_9_ >= 0) {
		    Class217.method3014(82, argument_5_ >> 16,
					argument_6_ >> 16, 0, argument_7_,
					(((tia_sub_35_Sub2DoublyLinked) this)
					 .aByteArray6666));
		    argument_5_ += anLocalInt_10_;
		    argument_7_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		    argument_6_ += anLocalInt_11_;
		}
		while (--argument_4_ >= 0) {
		    Class217.method3014(68, argument_5_ >> 16,
					argument_8_ >> 16, 0, argument_7_,
					(((tia_sub_35_Sub2DoublyLinked) this)
					 .aByteArray6666));
		    argument_7_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		    argument_8_ += anLocalInt;
		    argument_5_ += anLocalInt_10_;
		}
	    } else {
		argument_4_ -= argument_9_;
		argument_9_ -= argument_7_;
		argument_7_ *= ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		while (--argument_9_ >= 0) {
		    Class217.method3014(121, argument_6_ >> 16,
					argument_5_ >> 16, 0, argument_7_,
					(((tia_sub_35_Sub2DoublyLinked) this)
					 .aByteArray6666));
		    argument_5_ += anLocalInt_10_;
		    argument_6_ += anLocalInt_11_;
		    argument_7_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		}
		while (--argument_4_ >= 0) {
		    Class217.method3014(122, argument_8_ >> 16,
					argument_5_ >> 16, 0, argument_7_,
					(((tia_sub_35_Sub2DoublyLinked) this)
					 .aByteArray6666));
		    argument_5_ += anLocalInt_10_;
		    argument_7_ += ((tia_sub_35_Sub2DoublyLinked) this).anInt6663;
		    argument_8_ += anLocalInt;
		}
	    }
	}
    }
    
    public static void method1226(int argument) {
	aClass85_6664 = null;
	aJs5Store_6667 = null;
    }
    
    final void method1227(int argument_12_) {
	int anLocalInt = -1;
	int anLocalInt_13_
	    = ((tia_sub_35_Sub2DoublyLinked) this).aByteArray6666.length - 8;
	while (anLocalInt < anLocalInt_13_) {
	    ((tia_sub_35_Sub2DoublyLinked) this).aByteArray6666[++anLocalInt] = (byte) 0;
	    ((tia_sub_35_Sub2DoublyLinked) this).aByteArray6666[++anLocalInt] = (byte) 0;
	    ((tia_sub_35_Sub2DoublyLinked) this).aByteArray6666[++anLocalInt] = (byte) 0;
	    ((tia_sub_35_Sub2DoublyLinked) this).aByteArray6666[++anLocalInt] = (byte) 0;
	    ((tia_sub_35_Sub2DoublyLinked) this).aByteArray6666[++anLocalInt] = (byte) 0;
	    ((tia_sub_35_Sub2DoublyLinked) this).aByteArray6666[++anLocalInt] = (byte) 0;
	    ((tia_sub_35_Sub2DoublyLinked) this).aByteArray6666[++anLocalInt] = (byte) 0;
	    ((tia_sub_35_Sub2DoublyLinked) this).aByteArray6666[++anLocalInt] = (byte) 0;
	}
	while (((tia_sub_35_Sub2DoublyLinked) this).aByteArray6666.length - 1 > anLocalInt)
	    ((tia_sub_35_Sub2DoublyLinked) this).aByteArray6666[++anLocalInt] = (byte) 0;
    }
    
    final void method1228(byte argument_14_, int argument_15_,
			  int argument_16_, int argument_17_,
			  int argument_18_) {
	((tia_sub_35_Sub2DoublyLinked) this).anInt6668 = argument_15_;
	((tia_sub_35_Sub2DoublyLinked) this).anInt6661 = argument_17_ - argument_18_;
	((tia_sub_35_Sub2DoublyLinked) this).anInt6663 = argument_16_ - argument_15_;
	((tia_sub_35_Sub2DoublyLinked) this).anInt6669 = argument_18_;
    }
    
    tia_sub_35_Sub2DoublyLinked(GlToolkit argument_19_, int argument_20_, int argument_21_) {
	((tia_sub_35_Sub2DoublyLinked) this).aByteArray6666
	    = new byte[argument_20_ * argument_21_];
    }
    
    static {
	aClass85_6664 = new Class85();
    }
}
