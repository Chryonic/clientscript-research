/* tia_sub_35_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class tia_sub_35_Sub1DoublyLinked extends tia_sub_35DoublyLinked
{
    int anInt6653;
    int anInt6654;
    int anInt6655;
    int anInt6656;
    byte[] aByteArray6657;
    static JagexHashMap aJagexHashMap_6658 = new JagexHashMap(64);
    static Class112 aClass112_6659;
    static Class368 aClass368_6660;
    
    final void method1217(int argument_0_, int argument_1_, int argument_2_,
			  int argument_3_, int argument_4_, int argument_5_,
			  int argument_6_) {
	int anLocalInt = 0;
	if (argument_3_ != argument_2_)
	    anLocalInt = (-argument_1_ + argument_4_ << 16) / (argument_2_
							       - argument_3_);
	int anLocalInt_7_ = 0;
	if (argument_6_ != 29167)
	    aClass368_6660 = null;
	if (argument_5_ != argument_2_)
	    anLocalInt_7_
		= (-argument_4_ + argument_0_ << 16) / (argument_5_
							- argument_2_);
	int anLocalInt_8_ = 0;
	if (argument_3_ != argument_5_)
	    anLocalInt_8_
		= (argument_1_ - argument_0_ << 16) / (argument_3_
						       - argument_5_);
	if (argument_3_ > argument_2_ || argument_5_ < argument_3_) {
	    if (argument_5_ < argument_2_) {
		if (argument_3_ >= argument_2_) {
		    argument_1_ = argument_0_ <<= 16;
		    argument_4_ <<= 16;
		    if (argument_5_ < 0) {
			argument_0_ -= anLocalInt_8_ * argument_5_;
			argument_1_ -= argument_5_ * anLocalInt_7_;
			argument_5_ = 0;
		    }
		    if (argument_2_ < 0) {
			argument_4_ -= argument_2_ * anLocalInt;
			argument_2_ = 0;
		    }
		    if (anLocalInt_7_ >= anLocalInt_8_) {
			argument_3_ -= argument_2_;
			argument_2_ -= argument_5_;
			argument_5_
			    = ((tia_sub_35_Sub1DoublyLinked) this).anInt6656 * argument_5_;
			while (--argument_2_ >= 0) {
			    Node_Sub47_Sub8.method1132(85, 0,
                        (((tia_sub_35_Sub1DoublyLinked)
                                this)
                                .aByteArray6657),
                        argument_5_,
                        argument_0_ >> 16,
                        argument_1_ >> 16);
			    argument_0_ += anLocalInt_8_;
			    argument_1_ += anLocalInt_7_;
			    argument_5_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			}
			while (--argument_3_ >= 0) {
			    Node_Sub47_Sub8.method1132(87, 0,
                        (((tia_sub_35_Sub1DoublyLinked)
                                this)
                                .aByteArray6657),
                        argument_5_,
                        argument_0_ >> 16,
                        argument_4_ >> 16);
			    argument_5_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			    argument_4_ += anLocalInt;
			    argument_0_ += anLocalInt_8_;
			}
		    } else {
			argument_3_ -= argument_2_;
			argument_2_ -= argument_5_;
			argument_5_
			    = ((tia_sub_35_Sub1DoublyLinked) this).anInt6656 * argument_5_;
			while (--argument_2_ >= 0) {
			    Node_Sub47_Sub8.method1132(116, 0,
                        (((tia_sub_35_Sub1DoublyLinked)
                                this)
                                .aByteArray6657),
                        argument_5_,
                        argument_1_ >> 16,
                        argument_0_ >> 16);
			    argument_0_ += anLocalInt_8_;
			    argument_1_ += anLocalInt_7_;
			    argument_5_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			}
			while (--argument_3_ >= 0) {
			    Node_Sub47_Sub8.method1132(113, 0,
                        (((tia_sub_35_Sub1DoublyLinked)
                                this)
                                .aByteArray6657),
                        argument_5_,
                        argument_4_ >> 16,
                        argument_0_ >> 16);
			    argument_5_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			    argument_0_ += anLocalInt_8_;
			    argument_4_ += anLocalInt;
			}
		    }
		} else {
		    argument_4_ = argument_0_ <<= 16;
		    if (argument_5_ < 0) {
			argument_0_ -= argument_5_ * anLocalInt_8_;
			argument_4_ -= argument_5_ * anLocalInt_7_;
			argument_5_ = 0;
		    }
		    argument_1_ <<= 16;
		    if (argument_3_ < 0) {
			argument_1_ -= argument_3_ * anLocalInt;
			argument_3_ = 0;
		    }
		    if (anLocalInt_7_ >= anLocalInt_8_) {
			argument_2_ -= argument_3_;
			argument_3_ -= argument_5_;
			argument_5_ *= ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			while (--argument_3_ >= 0) {
			    Node_Sub47_Sub8.method1132(90, 0,
                        (((tia_sub_35_Sub1DoublyLinked)
                                this)
                                .aByteArray6657),
                        argument_5_,
                        argument_0_ >> 16,
                        argument_4_ >> 16);
			    argument_4_ += anLocalInt_7_;
			    argument_0_ += anLocalInt_8_;
			    argument_5_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			}
			while (--argument_2_ >= 0) {
			    Node_Sub47_Sub8.method1132(119, 0,
                        (((tia_sub_35_Sub1DoublyLinked)
                                this)
                                .aByteArray6657),
                        argument_5_,
                        argument_1_ >> 16,
                        argument_4_ >> 16);
			    argument_1_ += anLocalInt;
			    argument_5_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			    argument_4_ += anLocalInt_7_;
			}
		    } else {
			argument_2_ -= argument_3_;
			argument_3_ -= argument_5_;
			argument_5_
			    = ((tia_sub_35_Sub1DoublyLinked) this).anInt6656 * argument_5_;
			while (--argument_3_ >= 0) {
			    Node_Sub47_Sub8.method1132(75, 0,
                        (((tia_sub_35_Sub1DoublyLinked)
                                this)
                                .aByteArray6657),
                        argument_5_,
                        argument_4_ >> 16,
                        argument_0_ >> 16);
			    argument_5_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			    argument_4_ += anLocalInt_7_;
			    argument_0_ += anLocalInt_8_;
			}
			while (--argument_2_ >= 0) {
			    Node_Sub47_Sub8.method1132(85, 0,
                        (((tia_sub_35_Sub1DoublyLinked)
                                this)
                                .aByteArray6657),
                        argument_5_,
                        argument_4_ >> 16,
                        argument_1_ >> 16);
			    argument_1_ += anLocalInt;
			    argument_4_ += anLocalInt_7_;
			    argument_5_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			}
		    }
		}
	    } else if (argument_3_ > argument_5_) {
		argument_1_ = argument_4_ <<= 16;
		if (argument_2_ < 0) {
		    argument_4_ -= anLocalInt_7_ * argument_2_;
		    argument_1_ -= argument_2_ * anLocalInt;
		    argument_2_ = 0;
		}
		argument_0_ <<= 16;
		if (argument_5_ < 0) {
		    argument_0_ -= argument_5_ * anLocalInt_8_;
		    argument_5_ = 0;
		}
		if ((argument_2_ == argument_5_ || anLocalInt >= anLocalInt_7_)
		    && (argument_2_ != argument_5_
			|| anLocalInt <= anLocalInt_8_)) {
		    argument_3_ -= argument_5_;
		    argument_5_ -= argument_2_;
		    argument_2_ *= ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		    while (--argument_5_ >= 0) {
			Node_Sub47_Sub8.method1132(116, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_2_,
                    argument_4_ >> 16,
                    argument_1_ >> 16);
			argument_1_ += anLocalInt;
			argument_4_ += anLocalInt_7_;
			argument_2_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		    }
		    while (--argument_3_ >= 0) {
			Node_Sub47_Sub8.method1132(argument_6_ - 29090, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_2_,
                    argument_0_ >> 16,
                    argument_1_ >> 16);
			argument_2_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			argument_1_ += anLocalInt;
			argument_0_ += anLocalInt_8_;
		    }
		} else {
		    argument_3_ -= argument_5_;
		    argument_5_ -= argument_2_;
		    argument_2_
			= ((tia_sub_35_Sub1DoublyLinked) this).anInt6656 * argument_2_;
		    while (--argument_5_ >= 0) {
			Node_Sub47_Sub8.method1132(109, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_2_,
                    argument_1_ >> 16,
                    argument_4_ >> 16);
			argument_2_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			argument_4_ += anLocalInt_7_;
			argument_1_ += anLocalInt;
		    }
		    while (--argument_3_ >= 0) {
			Node_Sub47_Sub8.method1132(84, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_2_,
                    argument_1_ >> 16,
                    argument_0_ >> 16);
			argument_2_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			argument_0_ += anLocalInt_8_;
			argument_1_ += anLocalInt;
		    }
		}
	    } else {
		argument_0_ = argument_4_ <<= 16;
		argument_1_ <<= 16;
		if (argument_2_ < 0) {
		    argument_0_ -= argument_2_ * anLocalInt;
		    argument_4_ -= anLocalInt_7_ * argument_2_;
		    argument_2_ = 0;
		}
		if (argument_3_ < 0) {
		    argument_1_ -= anLocalInt_8_ * argument_3_;
		    argument_3_ = 0;
		}
		if (anLocalInt_7_ <= anLocalInt) {
		    argument_5_ -= argument_3_;
		    argument_3_ -= argument_2_;
		    argument_2_ *= ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		    while (--argument_3_ >= 0) {
			Node_Sub47_Sub8.method1132(argument_6_ ^ 0x71b5, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_2_,
                    argument_4_ >> 16,
                    argument_0_ >> 16);
			argument_4_ += anLocalInt_7_;
			argument_0_ += anLocalInt;
			argument_2_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		    }
		    while (--argument_5_ >= 0) {
			Node_Sub47_Sub8.method1132(98, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_2_,
                    argument_4_ >> 16,
                    argument_1_ >> 16);
			argument_4_ += anLocalInt_7_;
			argument_2_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			argument_1_ += anLocalInt_8_;
		    }
		} else {
		    argument_5_ -= argument_3_;
		    argument_3_ -= argument_2_;
		    argument_2_ *= ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		    while (--argument_3_ >= 0) {
			Node_Sub47_Sub8.method1132(argument_6_ ^ 0x7198, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_2_,
                    argument_0_ >> 16,
                    argument_4_ >> 16);
			argument_0_ += anLocalInt;
			argument_2_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			argument_4_ += anLocalInt_7_;
		    }
		    while (--argument_5_ >= 0) {
			Node_Sub47_Sub8.method1132(argument_6_ - 29042, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_2_,
                    argument_1_ >> 16,
                    argument_4_ >> 16);
			argument_2_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
			argument_4_ += anLocalInt_7_;
			argument_1_ += anLocalInt_8_;
		    }
		}
	    }
	} else if (argument_2_ < argument_5_) {
	    argument_0_ = argument_1_ <<= 16;
	    if (argument_3_ < 0) {
		argument_0_ -= anLocalInt_8_ * argument_3_;
		argument_1_ -= argument_3_ * anLocalInt;
		argument_3_ = 0;
	    }
	    argument_4_ <<= 16;
	    if (argument_2_ < 0) {
		argument_4_ -= argument_2_ * anLocalInt_7_;
		argument_2_ = 0;
	    }
	    if ((argument_2_ == argument_3_ || anLocalInt_8_ >= anLocalInt)
		&& (argument_3_ != argument_2_
		    || anLocalInt_8_ <= anLocalInt_7_)) {
		argument_5_ -= argument_2_;
		argument_2_ -= argument_3_;
		argument_3_ *= ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		while (--argument_2_ >= 0) {
		    Node_Sub47_Sub8.method1132(76, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_3_,
                    argument_1_ >> 16,
                    argument_0_ >> 16);
		    argument_1_ += anLocalInt;
		    argument_0_ += anLocalInt_8_;
		    argument_3_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		}
		while (--argument_5_ >= 0) {
		    Node_Sub47_Sub8.method1132(94, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_3_,
                    argument_4_ >> 16,
                    argument_0_ >> 16);
		    argument_0_ += anLocalInt_8_;
		    argument_4_ += anLocalInt_7_;
		    argument_3_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		}
	    } else {
		argument_5_ -= argument_2_;
		argument_2_ -= argument_3_;
		argument_3_ = ((tia_sub_35_Sub1DoublyLinked) this).anInt6656 * argument_3_;
		while (--argument_2_ >= 0) {
		    Node_Sub47_Sub8.method1132(119, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_3_,
                    argument_0_ >> 16,
                    argument_1_ >> 16);
		    argument_3_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		    argument_0_ += anLocalInt_8_;
		    argument_1_ += anLocalInt;
		}
		while (--argument_5_ >= 0) {
		    Node_Sub47_Sub8.method1132(92, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_3_,
                    argument_0_ >> 16,
                    argument_4_ >> 16);
		    argument_0_ += anLocalInt_8_;
		    argument_3_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		    argument_4_ += anLocalInt_7_;
		}
	    }
	} else {
	    argument_4_ = argument_1_ <<= 16;
	    argument_0_ <<= 16;
	    if (argument_3_ < 0) {
		argument_1_ -= anLocalInt * argument_3_;
		argument_4_ -= argument_3_ * anLocalInt_8_;
		argument_3_ = 0;
	    }
	    if (argument_5_ < 0) {
		argument_0_ -= anLocalInt_7_ * argument_5_;
		argument_5_ = 0;
	    }
	    if ((argument_5_ == argument_3_ || anLocalInt_8_ >= anLocalInt)
		&& (argument_3_ != argument_5_
		    || anLocalInt_7_ <= anLocalInt)) {
		argument_2_ -= argument_5_;
		argument_5_ -= argument_3_;
		argument_3_ *= ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		while (--argument_5_ >= 0) {
		    Node_Sub47_Sub8.method1132(113, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_3_,
                    argument_1_ >> 16,
                    argument_4_ >> 16);
		    argument_4_ += anLocalInt_8_;
		    argument_1_ += anLocalInt;
		    argument_3_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		}
		while (--argument_2_ >= 0) {
		    Node_Sub47_Sub8.method1132(argument_6_ ^ 0x7186, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_3_,
                    argument_1_ >> 16,
                    argument_0_ >> 16);
		    argument_3_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		    argument_0_ += anLocalInt_7_;
		    argument_1_ += anLocalInt;
		}
	    } else {
		argument_2_ -= argument_5_;
		argument_5_ -= argument_3_;
		argument_3_ = ((tia_sub_35_Sub1DoublyLinked) this).anInt6656 * argument_3_;
		while (--argument_5_ >= 0) {
		    Node_Sub47_Sub8.method1132(93, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_3_,
                    argument_4_ >> 16,
                    argument_1_ >> 16);
		    argument_3_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		    argument_1_ += anLocalInt;
		    argument_4_ += anLocalInt_8_;
		}
		while (--argument_2_ >= 0) {
		    Node_Sub47_Sub8.method1132(96, 0,
                    (((tia_sub_35_Sub1DoublyLinked) this)
                            .aByteArray6657),
                    argument_3_,
                    argument_0_ >> 16,
                    argument_1_ >> 16);
		    argument_3_ += ((tia_sub_35_Sub1DoublyLinked) this).anInt6656;
		    argument_1_ += anLocalInt;
		    argument_0_ += anLocalInt_7_;
		}
	    }
	}
    }
    
    public static void method1218(int argument) {
	aClass368_6660 = null;
	aJagexHashMap_6658 = null;
	aClass112_6659 = null;
    }
    
    static final Class101 method1219(int argument, Js5Store argument_9_,
				     int argument_10_, int argument_11_) {
	byte[] anLocalInts
	    = argument_9_.getData(argument_10_, argument_11_);
	if (anLocalInts == null)
	    return null;
	return new Class101(anLocalInts);
    }
    
    final void method1220(int argument_12_) {
	int anLocalInt = -1;
	int anLocalInt_13_
	    = ((tia_sub_35_Sub1DoublyLinked) this).aByteArray6657.length - 8;
	while (anLocalInt < anLocalInt_13_) {
	    ((tia_sub_35_Sub1DoublyLinked) this).aByteArray6657[++anLocalInt] = (byte) 0;
	    ((tia_sub_35_Sub1DoublyLinked) this).aByteArray6657[++anLocalInt] = (byte) 0;
	    ((tia_sub_35_Sub1DoublyLinked) this).aByteArray6657[++anLocalInt] = (byte) 0;
	    ((tia_sub_35_Sub1DoublyLinked) this).aByteArray6657[++anLocalInt] = (byte) 0;
	    ((tia_sub_35_Sub1DoublyLinked) this).aByteArray6657[++anLocalInt] = (byte) 0;
	    ((tia_sub_35_Sub1DoublyLinked) this).aByteArray6657[++anLocalInt] = (byte) 0;
	    ((tia_sub_35_Sub1DoublyLinked) this).aByteArray6657[++anLocalInt] = (byte) 0;
	    ((tia_sub_35_Sub1DoublyLinked) this).aByteArray6657[++anLocalInt] = (byte) 0;
	}
	while (((tia_sub_35_Sub1DoublyLinked) this).aByteArray6657.length - 1 > anLocalInt)
	    ((tia_sub_35_Sub1DoublyLinked) this).aByteArray6657[++anLocalInt] = (byte) 0;
    }
    
    final void method1221(int argument_14_, int argument_15_, int argument_16_,
			  int argument_17_, int argument_18_) {
	((tia_sub_35_Sub1DoublyLinked) this).anInt6653 = argument_16_;
	((tia_sub_35_Sub1DoublyLinked) this).anInt6654 = -argument_15_ + argument_18_;
	((tia_sub_35_Sub1DoublyLinked) this).anInt6655 = argument_15_;
	((tia_sub_35_Sub1DoublyLinked) this).anInt6656 = argument_14_ - argument_16_;
    }
    
    static final void method1222(byte argument) {
	for (int anLocalInt = 0; anLocalInt < 5; anLocalInt++)
	    Class291.aBooleanArray2366[anLocalInt] = false;
	HardwareLight.anInt3889 = Node_Sub47_Sub3.anInt6167;
	Statics.anInt5826 = Class333.anInt2720;
	Class174.anInt3438 = Class293.anInt2404;
	Class47.anInt336 = 0;
	Statics.anInt1745 = 5;
	Class391.anInt3291 = 0;
	Class100.anInt781 = Class287.anInt2299;
	Class209.anInt1503 = Class2_Sub2.anInt3763;
	DoublyLinkedNodeP2_Sub2_Sub4_Sub1.anInt6573 = Class85.anInt607 = -1;
	Class90.anInt683 = Node_Sub31_Sub30.anInt5987;
	Class146.anInt1111 = -1;
	Class76.anInt516 = -1;
    }
    
    tia_sub_35_Sub1DoublyLinked(GraphicsToolkit_Sub2 argument_19_, int argument_20_, int argument_21_) {
	((tia_sub_35_Sub1DoublyLinked) this).aByteArray6657
	    = new byte[argument_21_ * argument_20_];
    }
    
    final boolean method1223(int argument_22_, int argument_23_,
			     int argument_24_) {
	if (argument_24_ * argument_22_
	    > ((tia_sub_35_Sub1DoublyLinked) this).aByteArray6657.length)
	    return false;
	return true;
    }
}
