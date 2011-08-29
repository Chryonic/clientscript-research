/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class89
{
    int anInt646 = 0;
    boolean aBoolean647;
    int anInt648;
    private boolean aBoolean649;
    int anInt650;
    private JavaToolkit aClass_ha__651;
    private int anInt652;
    int anInt653;
    private boolean aBoolean654 = false;
    int anInt655;
    private float[] aFloatArray656;
    private int[] anIntArray657;
    int[] anIntArray658 = new int[4096];
    boolean aBoolean659;
    private Class293 aClass293_660;
    boolean aBoolean661;
    private int anInt662;
    private int anInt663;
    private int[] anIntArray664;
    private int anInt665;
    private int anInt666;
    private float aFloat667;
    private int anInt668;
    private int[] anIntArray669;
    private int anInt670;
    private int anInt671;
    private boolean aBoolean672;
    private int anInt673;
    private int anInt674;
    private int anInt675;
    private int[] anIntArray676;
    private float aFloat677;
    private int anInt678;
    private float aFloat679;
    
    private final void method1653
	(int[] argument_0_, float[] argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_, int argument_6_,
	 float argument_7_, float argument_8_) {
	if (((Class89) this).aBoolean661) {
	    if (argument_6_ > ((Class89) this).anInt650)
		argument_6_ = ((Class89) this).anInt650;
	    if (argument_5_ < 0)
		argument_5_ = 0;
	}
	if (argument_5_ < argument_6_) {
	    argument_2_ += argument_5_ - 1;
	    argument_4_ = argument_6_ - argument_5_ >> 2;
	    argument_7_ += argument_8_ * (float) argument_5_;
	    if (((Class293) aClass293_660).aBoolean2415) {
		if (((Class89) this).anInt646 == 0) {
		    while (--argument_4_ >= 0) {
			if (argument_7_ < argument_1_[++argument_2_]) {
			    argument_0_[argument_2_] = argument_3_;
			    argument_1_[argument_2_] = argument_7_;
			}
			argument_7_ += argument_8_;
			if (argument_7_ < argument_1_[++argument_2_]) {
			    argument_0_[argument_2_] = argument_3_;
			    argument_1_[argument_2_] = argument_7_;
			}
			argument_7_ += argument_8_;
			if (argument_7_ < argument_1_[++argument_2_]) {
			    argument_0_[argument_2_] = argument_3_;
			    argument_1_[argument_2_] = argument_7_;
			}
			argument_7_ += argument_8_;
			if (argument_7_ < argument_1_[++argument_2_]) {
			    argument_0_[argument_2_] = argument_3_;
			    argument_1_[argument_2_] = argument_7_;
			}
			argument_7_ += argument_8_;
		    }
		    argument_4_ = argument_6_ - argument_5_ & 0x3;
		    while (--argument_4_ >= 0) {
			if (argument_7_ < argument_1_[++argument_2_]) {
			    argument_0_[argument_2_] = argument_3_;
			    argument_1_[argument_2_] = argument_7_;
			}
			argument_7_ += argument_8_;
		    }
		} else if (((Class89) this).anInt646 == 254) {
		    if (argument_5_ != 0
			&& argument_6_ <= ((Class89) this).anInt650 - 1) {
			while (--argument_4_ >= 0) {
			    if (argument_7_ < argument_1_[++argument_2_])
				argument_0_[argument_2_ - 1]
				    = argument_0_[argument_2_];
			    argument_7_ += argument_8_;
			    if (argument_7_ < argument_1_[++argument_2_])
				argument_0_[argument_2_ - 1]
				    = argument_0_[argument_2_];
			    argument_7_ += argument_8_;
			    if (argument_7_ < argument_1_[++argument_2_])
				argument_0_[argument_2_ - 1]
				    = argument_0_[argument_2_];
			    argument_7_ += argument_8_;
			    if (argument_7_ < argument_1_[++argument_2_])
				argument_0_[argument_2_ - 1]
				    = argument_0_[argument_2_];
			    argument_7_ += argument_8_;
			}
			argument_4_ = argument_6_ - argument_5_ & 0x3;
			while (--argument_4_ >= 0) {
			    if (argument_7_ < argument_1_[++argument_2_])
				argument_0_[argument_2_ - 1]
				    = argument_0_[argument_2_];
			    argument_7_ += argument_8_;
			}
		    }
		} else {
		    int anLocalInt = ((Class89) this).anInt646;
		    int anLocalInt_9_ = 256 - ((Class89) this).anInt646;
		    argument_3_
			= (((argument_3_ & 0xff00ff) * anLocalInt_9_ >> 8
			    & 0xff00ff)
			   + ((argument_3_ & 0xff00) * anLocalInt_9_ >> 8
			      & 0xff00));
		    while (--argument_4_ >= 0) {
			if (argument_7_ < argument_1_[++argument_2_]) {
			    int anLocalInt_10_ = argument_0_[argument_2_];
			    argument_0_[argument_2_]
				= (argument_3_
				   + (((anLocalInt_10_ & 0xff00ff) * anLocalInt
				       >> 8)
				      & 0xff00ff)
				   + (((anLocalInt_10_ & 0xff00) * anLocalInt
				       >> 8)
				      & 0xff00));
			    argument_1_[argument_2_] = argument_7_;
			}
			argument_7_ += argument_8_;
			if (argument_7_ < argument_1_[++argument_2_]) {
			    int anLocalInt_11_ = argument_0_[argument_2_];
			    argument_0_[argument_2_]
				= (argument_3_
				   + (((anLocalInt_11_ & 0xff00ff) * anLocalInt
				       >> 8)
				      & 0xff00ff)
				   + (((anLocalInt_11_ & 0xff00) * anLocalInt
				       >> 8)
				      & 0xff00));
			    argument_1_[argument_2_] = argument_7_;
			}
			argument_7_ += argument_8_;
			if (argument_7_ < argument_1_[++argument_2_]) {
			    int anLocalInt_12_ = argument_0_[argument_2_];
			    argument_0_[argument_2_]
				= (argument_3_
				   + (((anLocalInt_12_ & 0xff00ff) * anLocalInt
				       >> 8)
				      & 0xff00ff)
				   + (((anLocalInt_12_ & 0xff00) * anLocalInt
				       >> 8)
				      & 0xff00));
			    argument_1_[argument_2_] = argument_7_;
			}
			argument_7_ += argument_8_;
			if (argument_7_ < argument_1_[++argument_2_]) {
			    int anLocalInt_13_ = argument_0_[argument_2_];
			    argument_0_[argument_2_]
				= (argument_3_
				   + (((anLocalInt_13_ & 0xff00ff) * anLocalInt
				       >> 8)
				      & 0xff00ff)
				   + (((anLocalInt_13_ & 0xff00) * anLocalInt
				       >> 8)
				      & 0xff00));
			    argument_1_[argument_2_] = argument_7_;
			}
			argument_7_ += argument_8_;
		    }
		    argument_4_ = argument_6_ - argument_5_ & 0x3;
		    while (--argument_4_ >= 0) {
			if (argument_7_ < argument_1_[++argument_2_]) {
			    int anLocalInt_14_ = argument_0_[argument_2_];
			    argument_0_[argument_2_]
				= (argument_3_
				   + (((anLocalInt_14_ & 0xff00ff) * anLocalInt
				       >> 8)
				      & 0xff00ff)
				   + (((anLocalInt_14_ & 0xff00) * anLocalInt
				       >> 8)
				      & 0xff00));
			    argument_1_[argument_2_] = argument_7_;
			}
			argument_7_ += argument_8_;
		    }
		}
	    } else if (((Class89) this).anInt646 == 0) {
		while (--argument_4_ >= 0) {
		    if (argument_7_ < argument_1_[++argument_2_])
			argument_0_[argument_2_] = argument_3_;
		    argument_7_ += argument_8_;
		    if (argument_7_ < argument_1_[++argument_2_])
			argument_0_[argument_2_] = argument_3_;
		    argument_7_ += argument_8_;
		    if (argument_7_ < argument_1_[++argument_2_])
			argument_0_[argument_2_] = argument_3_;
		    argument_7_ += argument_8_;
		    if (argument_7_ < argument_1_[++argument_2_])
			argument_0_[argument_2_] = argument_3_;
		    argument_7_ += argument_8_;
		}
		argument_4_ = argument_6_ - argument_5_ & 0x3;
		while (--argument_4_ >= 0) {
		    if (argument_7_ < argument_1_[++argument_2_])
			argument_0_[argument_2_] = argument_3_;
		    argument_7_ += argument_8_;
		}
	    } else if (((Class89) this).anInt646 == 254) {
		if (argument_5_ != 0
		    && argument_6_ <= ((Class89) this).anInt650 - 1) {
		    while (--argument_4_ >= 0) {
			if (argument_7_ < argument_1_[++argument_2_])
			    argument_0_[argument_2_ - 1]
				= argument_0_[argument_2_];
			argument_7_ += argument_8_;
			if (argument_7_ < argument_1_[++argument_2_])
			    argument_0_[argument_2_ - 1]
				= argument_0_[argument_2_];
			argument_7_ += argument_8_;
			if (argument_7_ < argument_1_[++argument_2_])
			    argument_0_[argument_2_ - 1]
				= argument_0_[argument_2_];
			argument_7_ += argument_8_;
			if (argument_7_ < argument_1_[++argument_2_])
			    argument_0_[argument_2_ - 1]
				= argument_0_[argument_2_];
			argument_7_ += argument_8_;
		    }
		    argument_4_ = argument_6_ - argument_5_ & 0x3;
		    while (--argument_4_ >= 0) {
			if (argument_7_ < argument_1_[++argument_2_])
			    argument_0_[argument_2_ - 1]
				= argument_0_[argument_2_];
			argument_7_ += argument_8_;
		    }
		}
	    } else {
		int anLocalInt = ((Class89) this).anInt646;
		int anLocalInt_15_ = 256 - ((Class89) this).anInt646;
		argument_3_ = (((argument_3_ & 0xff00ff) * anLocalInt_15_ >> 8
				& 0xff00ff)
			       + ((argument_3_ & 0xff00) * anLocalInt_15_ >> 8
				  & 0xff00));
		while (--argument_4_ >= 0) {
		    if (argument_7_ < argument_1_[++argument_2_]) {
			int anLocalInt_16_ = argument_0_[argument_2_];
			argument_0_[argument_2_]
			    = (argument_3_
			       + ((anLocalInt_16_ & 0xff00ff) * anLocalInt >> 8
				  & 0xff00ff)
			       + ((anLocalInt_16_ & 0xff00) * anLocalInt >> 8
				  & 0xff00));
		    }
		    argument_7_ += argument_8_;
		    if (argument_7_ < argument_1_[++argument_2_]) {
			int anLocalInt_17_ = argument_0_[argument_2_];
			argument_0_[argument_2_]
			    = (argument_3_
			       + ((anLocalInt_17_ & 0xff00ff) * anLocalInt >> 8
				  & 0xff00ff)
			       + ((anLocalInt_17_ & 0xff00) * anLocalInt >> 8
				  & 0xff00));
		    }
		    argument_7_ += argument_8_;
		    if (argument_7_ < argument_1_[++argument_2_]) {
			int anLocalInt_18_ = argument_0_[argument_2_];
			argument_0_[argument_2_]
			    = (argument_3_
			       + ((anLocalInt_18_ & 0xff00ff) * anLocalInt >> 8
				  & 0xff00ff)
			       + ((anLocalInt_18_ & 0xff00) * anLocalInt >> 8
				  & 0xff00));
		    }
		    argument_7_ += argument_8_;
		    if (argument_7_ < argument_1_[++argument_2_]) {
			int anLocalInt_19_ = argument_0_[argument_2_];
			argument_0_[argument_2_]
			    = (argument_3_
			       + ((anLocalInt_19_ & 0xff00ff) * anLocalInt >> 8
				  & 0xff00ff)
			       + ((anLocalInt_19_ & 0xff00) * anLocalInt >> 8
				  & 0xff00));
		    }
		    argument_7_ += argument_8_;
		}
		argument_4_ = argument_6_ - argument_5_ & 0x3;
		while (--argument_4_ >= 0) {
		    if (argument_7_ < argument_1_[++argument_2_]) {
			int anLocalInt_20_ = argument_0_[argument_2_];
			argument_0_[argument_2_]
			    = (argument_3_
			       + ((anLocalInt_20_ & 0xff00ff) * anLocalInt >> 8
				  & 0xff00ff)
			       + ((anLocalInt_20_ & 0xff00) * anLocalInt >> 8
				  & 0xff00));
		    }
		    argument_7_ += argument_8_;
		}
	    }
	}
    }
    
    final void method1654(float argument_21_, float argument_22_,
			  float argument_23_, float argument_24_,
			  float argument_25_, float argument_26_,
			  float argument_27_, float argument_28_,
			  float argument_29_, int argument_30_) {
	if (aBoolean649) {
	    aClass_ha__651.method2035(argument_30_, (byte) -33,
					  (int) argument_21_,
					  (int) argument_25_,
					  (int) argument_22_,
					  (int) argument_24_);
	    aClass_ha__651.method2035(argument_30_, (byte) -64,
					  (int) argument_22_,
					  (int) argument_26_,
					  (int) argument_23_,
					  (int) argument_25_);
	    aClass_ha__651.method2035(argument_30_, (byte) -47,
					  (int) argument_23_,
					  (int) argument_24_,
					  (int) argument_21_,
					  (int) argument_26_);
	} else {
	    float f = argument_25_ - argument_24_;
	    float f_31_ = argument_22_ - argument_21_;
	    float f_32_ = argument_26_ - argument_24_;
	    float f_33_ = argument_23_ - argument_21_;
	    float f_34_ = argument_28_ - argument_27_;
	    float f_35_ = argument_29_ - argument_27_;
	    float f_36_ = 0.0F;
	    if (argument_22_ != argument_21_)
		f_36_ = (argument_25_ - argument_24_) / (argument_22_
							 - argument_21_);
	    float f_37_ = 0.0F;
	    if (argument_23_ != argument_22_)
		f_37_ = (argument_26_ - argument_25_) / (argument_23_
							 - argument_22_);
	    float f_38_ = 0.0F;
	    if (argument_23_ != argument_21_)
		f_38_ = (argument_24_ - argument_26_) / (argument_21_
							 - argument_23_);
	    float f_39_ = f * f_33_ - f_32_ * f_31_;
	    if (f_39_ != 0.0F) {
		float f_40_ = (f_34_ * f_33_ - f_35_ * f_31_) / f_39_;
		float f_41_ = (f_35_ * f - f_34_ * f_32_) / f_39_;
		if (argument_21_ <= argument_22_
		    && argument_21_ <= argument_23_) {
		    if (!(argument_21_ >= (float) ((Class89) this).anInt653)) {
			if (argument_22_ > (float) ((Class89) this).anInt653)
			    argument_22_ = (float) ((Class89) this).anInt653;
			if (argument_23_ > (float) ((Class89) this).anInt653)
			    argument_23_ = (float) ((Class89) this).anInt653;
			argument_27_
			    = argument_27_ - f_40_ * argument_24_ + f_40_;
			if (argument_22_ < argument_23_) {
			    argument_26_ = argument_24_;
			    if (argument_21_ < 0.0F) {
				argument_26_ -= f_38_ * argument_21_;
				argument_24_ -= f_36_ * argument_21_;
				argument_27_ -= f_41_ * argument_21_;
				argument_21_ = 0.0F;
			    }
			    if (argument_22_ < 0.0F) {
				argument_25_ -= f_37_ * argument_22_;
				argument_22_ = 0.0F;
			    }
			    if (argument_21_ != argument_22_ && f_38_ < f_36_
				|| (argument_21_ == argument_22_
				    && f_38_ > f_37_)) {
				argument_23_ -= argument_22_;
				argument_22_ -= argument_21_;
				argument_21_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_21_]);
				while (--argument_22_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_21_,
					       argument_30_, 0,
					       (int) argument_26_,
					       (int) argument_24_,
					       argument_27_, f_40_);
				    argument_26_ += f_38_;
				    argument_24_ += f_36_;
				    argument_27_ += f_41_;
				    argument_21_ += (float) anInt652;
				}
				while (--argument_23_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_21_,
					       argument_30_, 0,
					       (int) argument_26_,
					       (int) argument_25_,
					       argument_27_, f_40_);
				    argument_26_ += f_38_;
				    argument_25_ += f_37_;
				    argument_27_ += f_41_;
				    argument_21_ += (float) anInt652;
				}
			    } else {
				argument_23_ -= argument_22_;
				argument_22_ -= argument_21_;
				argument_21_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_21_]);
				while (--argument_22_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_21_,
					       argument_30_, 0,
					       (int) argument_24_,
					       (int) argument_26_,
					       argument_27_, f_40_);
				    argument_26_ += f_38_;
				    argument_24_ += f_36_;
				    argument_27_ += f_41_;
				    argument_21_ += (float) anInt652;
				}
				while (--argument_23_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_21_,
					       argument_30_, 0,
					       (int) argument_25_,
					       (int) argument_26_,
					       argument_27_, f_40_);
				    argument_26_ += f_38_;
				    argument_25_ += f_37_;
				    argument_27_ += f_41_;
				    argument_21_ += (float) anInt652;
				}
			    }
			} else {
			    argument_25_ = argument_24_;
			    if (argument_21_ < 0.0F) {
				argument_25_ -= f_38_ * argument_21_;
				argument_24_ -= f_36_ * argument_21_;
				argument_27_ -= f_41_ * argument_21_;
				argument_21_ = 0.0F;
			    }
			    if (argument_23_ < 0.0F) {
				argument_26_ -= f_37_ * argument_23_;
				argument_23_ = 0.0F;
			    }
			    if (argument_21_ != argument_23_ && f_38_ < f_36_
				|| (argument_21_ == argument_23_
				    && f_37_ > f_36_)) {
				argument_22_ -= argument_23_;
				argument_23_ -= argument_21_;
				argument_21_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_21_]);
				while (--argument_23_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_21_,
					       argument_30_, 0,
					       (int) argument_25_,
					       (int) argument_24_,
					       argument_27_, f_40_);
				    argument_25_ += f_38_;
				    argument_24_ += f_36_;
				    argument_27_ += f_41_;
				    argument_21_ += (float) anInt652;
				}
				while (--argument_22_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_21_,
					       argument_30_, 0,
					       (int) argument_26_,
					       (int) argument_24_,
					       argument_27_, f_40_);
				    argument_26_ += f_37_;
				    argument_24_ += f_36_;
				    argument_27_ += f_41_;
				    argument_21_ += (float) anInt652;
				}
			    } else {
				argument_22_ -= argument_23_;
				argument_23_ -= argument_21_;
				argument_21_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_21_]);
				while (--argument_23_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_21_,
					       argument_30_, 0,
					       (int) argument_24_,
					       (int) argument_25_,
					       argument_27_, f_40_);
				    argument_25_ += f_38_;
				    argument_24_ += f_36_;
				    argument_27_ += f_41_;
				    argument_21_ += (float) anInt652;
				}
				while (--argument_22_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_21_,
					       argument_30_, 0,
					       (int) argument_24_,
					       (int) argument_26_,
					       argument_27_, f_40_);
				    argument_26_ += f_37_;
				    argument_24_ += f_36_;
				    argument_27_ += f_41_;
				    argument_21_ += (float) anInt652;
				}
			    }
			}
		    }
		} else if (argument_22_ <= argument_23_) {
		    if (!(argument_22_ >= (float) ((Class89) this).anInt653)) {
			if (argument_23_ > (float) ((Class89) this).anInt653)
			    argument_23_ = (float) ((Class89) this).anInt653;
			if (argument_21_ > (float) ((Class89) this).anInt653)
			    argument_21_ = (float) ((Class89) this).anInt653;
			argument_28_
			    = argument_28_ - f_40_ * argument_25_ + f_40_;
			if (argument_23_ < argument_21_) {
			    argument_24_ = argument_25_;
			    if (argument_22_ < 0.0F) {
				argument_24_ -= f_36_ * argument_22_;
				argument_25_ -= f_37_ * argument_22_;
				argument_28_ -= f_41_ * argument_22_;
				argument_22_ = 0.0F;
			    }
			    if (argument_23_ < 0.0F) {
				argument_26_ -= f_38_ * argument_23_;
				argument_23_ = 0.0F;
			    }
			    if (argument_22_ != argument_23_ && f_36_ < f_37_
				|| (argument_22_ == argument_23_
				    && f_36_ > f_38_)) {
				argument_21_ -= argument_23_;
				argument_23_ -= argument_22_;
				argument_22_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_22_]);
				while (--argument_23_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_22_,
					       argument_30_, 0,
					       (int) argument_24_,
					       (int) argument_25_,
					       argument_28_, f_40_);
				    argument_24_ += f_36_;
				    argument_25_ += f_37_;
				    argument_28_ += f_41_;
				    argument_22_ += (float) anInt652;
				}
				while (--argument_21_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_22_,
					       argument_30_, 0,
					       (int) argument_24_,
					       (int) argument_26_,
					       argument_28_, f_40_);
				    argument_24_ += f_36_;
				    argument_26_ += f_38_;
				    argument_28_ += f_41_;
				    argument_22_ += (float) anInt652;
				}
			    } else {
				argument_21_ -= argument_23_;
				argument_23_ -= argument_22_;
				argument_22_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_22_]);
				while (--argument_23_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_22_,
					       argument_30_, 0,
					       (int) argument_25_,
					       (int) argument_24_,
					       argument_28_, f_40_);
				    argument_24_ += f_36_;
				    argument_25_ += f_37_;
				    argument_28_ += f_41_;
				    argument_22_ += (float) anInt652;
				}
				while (--argument_21_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_22_,
					       argument_30_, 0,
					       (int) argument_26_,
					       (int) argument_24_,
					       argument_28_, f_40_);
				    argument_24_ += f_36_;
				    argument_26_ += f_38_;
				    argument_28_ += f_41_;
				    argument_22_ += (float) anInt652;
				}
			    }
			} else {
			    argument_26_ = argument_25_;
			    if (argument_22_ < 0.0F) {
				argument_26_ -= f_36_ * argument_22_;
				argument_25_ -= f_37_ * argument_22_;
				argument_28_ -= f_41_ * argument_22_;
				argument_22_ = 0.0F;
			    }
			    if (argument_21_ < 0.0F) {
				argument_24_ -= f_38_ * argument_21_;
				argument_21_ = 0.0F;
			    }
			    if (f_36_ < f_37_) {
				argument_23_ -= argument_21_;
				argument_21_ -= argument_22_;
				argument_22_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_22_]);
				while (--argument_21_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_22_,
					       argument_30_, 0,
					       (int) argument_26_,
					       (int) argument_25_,
					       argument_28_, f_40_);
				    argument_26_ += f_36_;
				    argument_25_ += f_37_;
				    argument_28_ += f_41_;
				    argument_22_ += (float) anInt652;
				}
				while (--argument_23_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_22_,
					       argument_30_, 0,
					       (int) argument_24_,
					       (int) argument_25_,
					       argument_28_, f_40_);
				    argument_24_ += f_38_;
				    argument_25_ += f_37_;
				    argument_28_ += f_41_;
				    argument_22_ += (float) anInt652;
				}
			    } else {
				argument_23_ -= argument_21_;
				argument_21_ -= argument_22_;
				argument_22_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_22_]);
				while (--argument_21_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_22_,
					       argument_30_, 0,
					       (int) argument_25_,
					       (int) argument_26_,
					       argument_28_, f_40_);
				    argument_26_ += f_36_;
				    argument_25_ += f_37_;
				    argument_28_ += f_41_;
				    argument_22_ += (float) anInt652;
				}
				while (--argument_23_ >= 0.0F) {
				    method1661(anIntArray657, aFloatArray656,
					       (int) argument_22_,
					       argument_30_, 0,
					       (int) argument_25_,
					       (int) argument_24_,
					       argument_28_, f_40_);
				    argument_24_ += f_38_;
				    argument_25_ += f_37_;
				    argument_28_ += f_41_;
				    argument_22_ += (float) anInt652;
				}
			    }
			}
		    }
		} else if (!(argument_23_
			     >= (float) ((Class89) this).anInt653)) {
		    if (argument_21_ > (float) ((Class89) this).anInt653)
			argument_21_ = (float) ((Class89) this).anInt653;
		    if (argument_22_ > (float) ((Class89) this).anInt653)
			argument_22_ = (float) ((Class89) this).anInt653;
		    argument_29_ = argument_29_ - f_40_ * argument_26_ + f_40_;
		    if (argument_21_ < argument_22_) {
			argument_25_ = argument_26_;
			if (argument_23_ < 0.0F) {
			    argument_25_ -= f_37_ * argument_23_;
			    argument_26_ -= f_38_ * argument_23_;
			    argument_29_ -= f_41_ * argument_23_;
			    argument_23_ = 0.0F;
			}
			if (argument_21_ < 0.0F) {
			    argument_24_ -= f_36_ * argument_21_;
			    argument_21_ = 0.0F;
			}
			if (f_37_ < f_38_) {
			    argument_22_ -= argument_21_;
			    argument_21_ -= argument_23_;
			    argument_23_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_23_]);
			    while (--argument_21_ >= 0.0F) {
				method1661(anIntArray657, aFloatArray656,
					   (int) argument_23_, argument_30_, 0,
					   (int) argument_25_,
					   (int) argument_26_, argument_29_,
					   f_40_);
				argument_25_ += f_37_;
				argument_26_ += f_38_;
				argument_29_ += f_41_;
				argument_23_ += (float) anInt652;
			    }
			    while (--argument_22_ >= 0.0F) {
				method1661(anIntArray657, aFloatArray656,
					   (int) argument_23_, argument_30_, 0,
					   (int) argument_25_,
					   (int) argument_24_, argument_29_,
					   f_40_);
				argument_25_ += f_37_;
				argument_24_ += f_36_;
				argument_29_ += f_41_;
				argument_23_ += (float) anInt652;
			    }
			} else {
			    argument_22_ -= argument_21_;
			    argument_21_ -= argument_23_;
			    argument_23_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_23_]);
			    while (--argument_21_ >= 0.0F) {
				method1661(anIntArray657, aFloatArray656,
					   (int) argument_23_, argument_30_, 0,
					   (int) argument_26_,
					   (int) argument_25_, argument_29_,
					   f_40_);
				argument_25_ += f_37_;
				argument_26_ += f_38_;
				argument_29_ += f_41_;
				argument_23_ += (float) anInt652;
			    }
			    while (--argument_22_ >= 0.0F) {
				method1661(anIntArray657, aFloatArray656,
					   (int) argument_23_, argument_30_, 0,
					   (int) argument_24_,
					   (int) argument_25_, argument_29_,
					   f_40_);
				argument_25_ += f_37_;
				argument_24_ += f_36_;
				argument_29_ += f_41_;
				argument_23_ += (float) anInt652;
			    }
			}
		    } else {
			argument_24_ = argument_26_;
			if (argument_23_ < 0.0F) {
			    argument_24_ -= f_37_ * argument_23_;
			    argument_26_ -= f_38_ * argument_23_;
			    argument_29_ -= f_41_ * argument_23_;
			    argument_23_ = 0.0F;
			}
			if (argument_22_ < 0.0F) {
			    argument_25_ -= f_36_ * argument_22_;
			    argument_22_ = 0.0F;
			}
			if (f_37_ < f_38_) {
			    argument_21_ -= argument_22_;
			    argument_22_ -= argument_23_;
			    argument_23_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_23_]);
			    while (--argument_22_ >= 0.0F) {
				method1661(anIntArray657, aFloatArray656,
					   (int) argument_23_, argument_30_, 0,
					   (int) argument_24_,
					   (int) argument_26_, argument_29_,
					   f_40_);
				argument_24_ += f_37_;
				argument_26_ += f_38_;
				argument_29_ += f_41_;
				argument_23_ += (float) anInt652;
			    }
			    while (--argument_21_ >= 0.0F) {
				method1661(anIntArray657, aFloatArray656,
					   (int) argument_23_, argument_30_, 0,
					   (int) argument_25_,
					   (int) argument_26_, argument_29_,
					   f_40_);
				argument_25_ += f_36_;
				argument_26_ += f_38_;
				argument_29_ += f_41_;
				argument_23_ += (float) anInt652;
			    }
			} else {
			    argument_21_ -= argument_22_;
			    argument_22_ -= argument_23_;
			    argument_23_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_23_]);
			    while (--argument_22_ >= 0.0F) {
				method1661(anIntArray657, aFloatArray656,
					   (int) argument_23_, argument_30_, 0,
					   (int) argument_26_,
					   (int) argument_24_, argument_29_,
					   f_40_);
				argument_24_ += f_37_;
				argument_26_ += f_38_;
				argument_29_ += f_41_;
				argument_23_ += (float) anInt652;
			    }
			    while (--argument_21_ >= 0.0F) {
				method1661(anIntArray657, aFloatArray656,
					   (int) argument_23_, argument_30_, 0,
					   (int) argument_26_,
					   (int) argument_25_, argument_29_,
					   f_40_);
				argument_25_ += f_36_;
				argument_26_ += f_38_;
				argument_29_ += f_41_;
				argument_23_ += (float) anInt652;
			    }
			}
		    }
		}
	    }
	}
    }
    
    private final void method1655
	(int[] argument_42_, float[] argument_43_, int argument_44_,
	 int argument_45_, int argument_46_, int argument_47_,
	 int argument_48_, float argument_49_, float argument_50_,
	 float argument_51_, float argument_52_) {
	if (((Class89) this).aBoolean661) {
	    if (argument_48_ > ((Class89) this).anInt650)
		argument_48_ = ((Class89) this).anInt650;
	    if (argument_47_ < 0)
		argument_47_ = 0;
	}
	if (argument_47_ < argument_48_) {
	    argument_44_ += argument_47_ - 1;
	    argument_49_ += argument_50_ * (float) argument_47_;
	    argument_51_ += argument_52_ * (float) argument_47_;
	    if (((Class293) aClass293_660).aBoolean2415) {
		do {
		    if (((Class89) this).aBoolean647) {
			argument_46_ = argument_48_ - argument_47_ >> 2;
			argument_50_ *= 4.0F;
			if (((Class89) this).anInt646 == 0) {
			    if (argument_46_ > 0) {
				do {
				    argument_45_ = (HslToRgb.table2
						    [(int) argument_49_]);
				    argument_49_ += argument_50_;
				    if (argument_51_
					< argument_43_[++argument_44_]) {
					argument_42_[argument_44_]
					    = argument_45_;
					argument_43_[argument_44_]
					    = argument_51_;
				    }
				    argument_51_ += argument_52_;
				    if (argument_51_
					< argument_43_[++argument_44_]) {
					argument_42_[argument_44_]
					    = argument_45_;
					argument_43_[argument_44_]
					    = argument_51_;
				    }
				    argument_51_ += argument_52_;
				    if (argument_51_
					< argument_43_[++argument_44_]) {
					argument_42_[argument_44_]
					    = argument_45_;
					argument_43_[argument_44_]
					    = argument_51_;
				    }
				    argument_51_ += argument_52_;
				    if (argument_51_
					< argument_43_[++argument_44_]) {
					argument_42_[argument_44_]
					    = argument_45_;
					argument_43_[argument_44_]
					    = argument_51_;
				    }
				    argument_51_ += argument_52_;
				} while (--argument_46_ > 0);
			    }
			    argument_46_ = argument_48_ - argument_47_ & 0x3;
			    if (argument_46_ > 0) {
				argument_45_ = (HslToRgb.table2
						[(int) argument_49_]);
				do {
				    if (argument_51_
					< argument_43_[++argument_44_]) {
					argument_42_[argument_44_]
					    = argument_45_;
					argument_43_[argument_44_]
					    = argument_51_;
				    }
				    argument_51_ += argument_52_;
				} while (--argument_46_ > 0);
			    }
			} else {
			    int anLocalInt = ((Class89) this).anInt646;
			    int anLocalInt_53_
				= 256 - ((Class89) this).anInt646;
			    if (argument_46_ > 0) {
				do {
				    argument_45_ = (HslToRgb.table2
						    [(int) argument_49_]);
				    argument_49_ += argument_50_;
				    argument_45_ = ((((argument_45_ & 0xff00ff)
						      * anLocalInt_53_) >> 8
						     & 0xff00ff)
						    + (((argument_45_ & 0xff00)
							* anLocalInt_53_) >> 8
						       & 0xff00));
				    if (argument_51_
					< argument_43_[++argument_44_]) {
					int anLocalInt_54_
					    = argument_42_[argument_44_];
					argument_42_[argument_44_]
					    = (argument_45_
					       + (((anLocalInt_54_ & 0xff00ff)
						   * anLocalInt) >> 8
						  & 0xff00ff)
					       + (((anLocalInt_54_ & 0xff00)
						   * anLocalInt) >> 8
						  & 0xff00));
					argument_43_[argument_44_]
					    = argument_51_;
				    }
				    argument_51_ += argument_52_;
				    if (argument_51_
					< argument_43_[++argument_44_]) {
					int anLocalInt_55_
					    = argument_42_[argument_44_];
					argument_42_[argument_44_]
					    = (argument_45_
					       + (((anLocalInt_55_ & 0xff00ff)
						   * anLocalInt) >> 8
						  & 0xff00ff)
					       + (((anLocalInt_55_ & 0xff00)
						   * anLocalInt) >> 8
						  & 0xff00));
					argument_43_[argument_44_]
					    = argument_51_;
				    }
				    argument_51_ += argument_52_;
				    if (argument_51_
					< argument_43_[++argument_44_]) {
					int anLocalInt_56_
					    = argument_42_[argument_44_];
					argument_42_[argument_44_]
					    = (argument_45_
					       + (((anLocalInt_56_ & 0xff00ff)
						   * anLocalInt) >> 8
						  & 0xff00ff)
					       + (((anLocalInt_56_ & 0xff00)
						   * anLocalInt) >> 8
						  & 0xff00));
					argument_43_[argument_44_]
					    = argument_51_;
				    }
				    argument_51_ += argument_52_;
				    if (argument_51_
					< argument_43_[++argument_44_]) {
					int anLocalInt_57_
					    = argument_42_[argument_44_];
					argument_42_[argument_44_]
					    = (argument_45_
					       + (((anLocalInt_57_ & 0xff00ff)
						   * anLocalInt) >> 8
						  & 0xff00ff)
					       + (((anLocalInt_57_ & 0xff00)
						   * anLocalInt) >> 8
						  & 0xff00));
					argument_43_[argument_44_]
					    = argument_51_;
				    }
				    argument_51_ += argument_52_;
				} while (--argument_46_ > 0);
			    }
			    argument_46_ = argument_48_ - argument_47_ & 0x3;
			    if (argument_46_ <= 0)
				break;
			    argument_45_
				= HslToRgb.table2[(int) argument_49_];
			    argument_45_
				= ((((argument_45_ & 0xff00ff) * anLocalInt_53_
				     >> 8)
				    & 0xff00ff)
				   + (((argument_45_ & 0xff00) * anLocalInt_53_
				       >> 8)
				      & 0xff00));
			    do {
				if (argument_51_
				    < argument_43_[++argument_44_]) {
				    int anLocalInt_58_
					= argument_42_[argument_44_];
				    argument_42_[argument_44_]
					= (argument_45_
					   + (((anLocalInt_58_ & 0xff00ff)
					       * anLocalInt) >> 8
					      & 0xff00ff)
					   + (((anLocalInt_58_ & 0xff00)
					       * anLocalInt) >> 8
					      & 0xff00));
				    argument_43_[argument_44_] = argument_51_;
				}
				argument_51_ += argument_52_;
			    } while (--argument_46_ > 0);
			}
			break;
		    }
		    argument_46_ = argument_48_ - argument_47_;
		    if (((Class89) this).anInt646 == 0) {
			do {
			    if (argument_51_ < argument_43_[++argument_44_]) {
				argument_42_[argument_44_]
				    = (HslToRgb.table2
				       [(int) argument_49_]);
				argument_43_[argument_44_] = argument_51_;
			    }
			    argument_51_ += argument_52_;
			    argument_49_ += argument_50_;
			} while (--argument_46_ > 0);
			break;
		    }
		    int anLocalInt = ((Class89) this).anInt646;
		    int anLocalInt_59_ = 256 - ((Class89) this).anInt646;
		    do {
			if (argument_51_ < argument_43_[++argument_44_]) {
			    argument_45_
				= HslToRgb.table2[(int) argument_49_];
			    argument_45_
				= ((((argument_45_ & 0xff00ff) * anLocalInt_59_
				     >> 8)
				    & 0xff00ff)
				   + (((argument_45_ & 0xff00) * anLocalInt_59_
				       >> 8)
				      & 0xff00));
			    int anLocalInt_60_ = argument_42_[argument_44_];
			    argument_42_[argument_44_]
				= (argument_45_
				   + (((anLocalInt_60_ & 0xff00ff) * anLocalInt
				       >> 8)
				      & 0xff00ff)
				   + (((anLocalInt_60_ & 0xff00) * anLocalInt
				       >> 8)
				      & 0xff00));
			    argument_43_[argument_44_] = argument_51_;
			}
			argument_49_ += argument_50_;
			argument_51_ += argument_52_;
		    } while (--argument_46_ > 0);
		} while (false);
	    } else {
		do {
		    if (((Class89) this).aBoolean647) {
			argument_46_ = argument_48_ - argument_47_ >> 2;
			argument_50_ *= 4.0F;
			if (((Class89) this).anInt646 == 0) {
			    if (argument_46_ > 0) {
				do {
				    argument_45_ = (HslToRgb.table2
						    [(int) argument_49_]);
				    argument_49_ += argument_50_;
				    if (argument_51_
					< argument_43_[++argument_44_])
					argument_42_[argument_44_]
					    = argument_45_;
				    argument_51_ += argument_52_;
				    if (argument_51_
					< argument_43_[++argument_44_])
					argument_42_[argument_44_]
					    = argument_45_;
				    argument_51_ += argument_52_;
				    if (argument_51_
					< argument_43_[++argument_44_])
					argument_42_[argument_44_]
					    = argument_45_;
				    argument_51_ += argument_52_;
				    if (argument_51_
					< argument_43_[++argument_44_])
					argument_42_[argument_44_]
					    = argument_45_;
				    argument_51_ += argument_52_;
				} while (--argument_46_ > 0);
			    }
			    argument_46_ = argument_48_ - argument_47_ & 0x3;
			    if (argument_46_ > 0) {
				argument_45_ = (HslToRgb.table2
						[(int) argument_49_]);
				do {
				    if (argument_51_
					< argument_43_[++argument_44_])
					argument_42_[argument_44_]
					    = argument_45_;
				    argument_51_ += argument_52_;
				} while (--argument_46_ > 0);
			    }
			} else {
			    int anLocalInt = ((Class89) this).anInt646;
			    int anLocalInt_61_
				= 256 - ((Class89) this).anInt646;
			    if (argument_46_ > 0) {
				do {
				    argument_45_ = (HslToRgb.table2
						    [(int) argument_49_]);
				    argument_49_ += argument_50_;
				    argument_45_ = ((((argument_45_ & 0xff00ff)
						      * anLocalInt_61_) >> 8
						     & 0xff00ff)
						    + (((argument_45_ & 0xff00)
							* anLocalInt_61_) >> 8
						       & 0xff00));
				    if (argument_51_
					< argument_43_[++argument_44_]) {
					int anLocalInt_62_
					    = argument_42_[argument_44_];
					argument_42_[argument_44_]
					    = (argument_45_
					       + (((anLocalInt_62_ & 0xff00ff)
						   * anLocalInt) >> 8
						  & 0xff00ff)
					       + (((anLocalInt_62_ & 0xff00)
						   * anLocalInt) >> 8
						  & 0xff00));
				    }
				    argument_51_ += argument_52_;
				    if (argument_51_
					< argument_43_[++argument_44_]) {
					int anLocalInt_63_
					    = argument_42_[argument_44_];
					argument_42_[argument_44_]
					    = (argument_45_
					       + (((anLocalInt_63_ & 0xff00ff)
						   * anLocalInt) >> 8
						  & 0xff00ff)
					       + (((anLocalInt_63_ & 0xff00)
						   * anLocalInt) >> 8
						  & 0xff00));
				    }
				    argument_51_ += argument_52_;
				    if (argument_51_
					< argument_43_[++argument_44_]) {
					int anLocalInt_64_
					    = argument_42_[argument_44_];
					argument_42_[argument_44_]
					    = (argument_45_
					       + (((anLocalInt_64_ & 0xff00ff)
						   * anLocalInt) >> 8
						  & 0xff00ff)
					       + (((anLocalInt_64_ & 0xff00)
						   * anLocalInt) >> 8
						  & 0xff00));
				    }
				    argument_51_ += argument_52_;
				    if (argument_51_
					< argument_43_[++argument_44_]) {
					int anLocalInt_65_
					    = argument_42_[argument_44_];
					argument_42_[argument_44_]
					    = (argument_45_
					       + (((anLocalInt_65_ & 0xff00ff)
						   * anLocalInt) >> 8
						  & 0xff00ff)
					       + (((anLocalInt_65_ & 0xff00)
						   * anLocalInt) >> 8
						  & 0xff00));
				    }
				    argument_51_ += argument_52_;
				} while (--argument_46_ > 0);
			    }
			    argument_46_ = argument_48_ - argument_47_ & 0x3;
			    if (argument_46_ <= 0)
				break;
			    argument_45_
				= HslToRgb.table2[(int) argument_49_];
			    argument_45_
				= ((((argument_45_ & 0xff00ff) * anLocalInt_61_
				     >> 8)
				    & 0xff00ff)
				   + (((argument_45_ & 0xff00) * anLocalInt_61_
				       >> 8)
				      & 0xff00));
			    do {
				if (argument_51_
				    < argument_43_[++argument_44_]) {
				    int anLocalInt_66_
					= argument_42_[argument_44_];
				    argument_42_[argument_44_]
					= (argument_45_
					   + (((anLocalInt_66_ & 0xff00ff)
					       * anLocalInt) >> 8
					      & 0xff00ff)
					   + (((anLocalInt_66_ & 0xff00)
					       * anLocalInt) >> 8
					      & 0xff00));
				}
				argument_51_ += argument_52_;
			    } while (--argument_46_ > 0);
			}
			break;
		    }
		    argument_46_ = argument_48_ - argument_47_;
		    if (((Class89) this).anInt646 == 0) {
			do {
			    if (argument_51_ < argument_43_[++argument_44_])
				argument_42_[argument_44_]
				    = (HslToRgb.table2
				       [(int) argument_49_]);
			    argument_51_ += argument_52_;
			    argument_49_ += argument_50_;
			} while (--argument_46_ > 0);
			break;
		    }
		    int anLocalInt = ((Class89) this).anInt646;
		    int anLocalInt_67_ = 256 - ((Class89) this).anInt646;
		    do {
			if (argument_51_ < argument_43_[++argument_44_]) {
			    argument_45_
				= HslToRgb.table2[(int) argument_49_];
			    argument_45_
				= ((((argument_45_ & 0xff00ff) * anLocalInt_67_
				     >> 8)
				    & 0xff00ff)
				   + (((argument_45_ & 0xff00) * anLocalInt_67_
				       >> 8)
				      & 0xff00));
			    int anLocalInt_68_ = argument_42_[argument_44_];
			    argument_42_[argument_44_]
				= (argument_45_
				   + (((anLocalInt_68_ & 0xff00ff) * anLocalInt
				       >> 8)
				      & 0xff00ff)
				   + (((anLocalInt_68_ & 0xff00) * anLocalInt
				       >> 8)
				      & 0xff00));
			}
			argument_49_ += argument_50_;
			argument_51_ += argument_52_;
		    } while (--argument_46_ > 0);
		} while (false);
	    }
	}
    }
    
    final void method1656
	(float argument_69_, float argument_70_, float argument_71_,
	 float argument_72_, float argument_73_, float argument_74_,
	 float argument_75_, float argument_76_, float argument_77_,
	 int argument_78_, int argument_79_, int argument_80_) {
	if (aBoolean649) {
	    aClass_ha__651.method2035(argument_78_ | ~0xffffff,
					  (byte) -128, (int) argument_69_,
					  (int) argument_73_,
					  (int) argument_70_,
					  (int) argument_72_);
	    aClass_ha__651.method2035(argument_78_ | ~0xffffff,
					  (byte) -123, (int) argument_70_,
					  (int) argument_74_,
					  (int) argument_71_,
					  (int) argument_73_);
	    aClass_ha__651.method2035(argument_78_ | ~0xffffff, (byte) -53,
					  (int) argument_71_,
					  (int) argument_72_,
					  (int) argument_69_,
					  (int) argument_74_);
	} else {
	    float f = argument_73_ - argument_72_;
	    float f_81_ = argument_70_ - argument_69_;
	    float f_82_ = argument_74_ - argument_72_;
	    float f_83_ = argument_71_ - argument_69_;
	    float f_84_ = argument_76_ - argument_75_;
	    float f_85_ = argument_77_ - argument_75_;
	    float f_86_ = (float) ((argument_79_ & 0xff0000)
				   - (argument_78_ & 0xff0000));
	    float f_87_ = (float) ((argument_80_ & 0xff0000)
				   - (argument_78_ & 0xff0000));
	    float f_88_
		= (float) ((argument_79_ & 0xff00) - (argument_78_ & 0xff00));
	    float f_89_
		= (float) ((argument_80_ & 0xff00) - (argument_78_ & 0xff00));
	    float f_90_
		= (float) ((argument_79_ & 0xff) - (argument_78_ & 0xff));
	    float f_91_
		= (float) ((argument_80_ & 0xff) - (argument_78_ & 0xff));
	    float f_92_;
	    if (argument_71_ != argument_70_)
		f_92_ = (argument_74_ - argument_73_) / (argument_71_
							 - argument_70_);
	    else
		f_92_ = 0.0F;
	    float f_93_;
	    if (argument_70_ != argument_69_)
		f_93_ = f / f_81_;
	    else
		f_93_ = 0.0F;
	    float f_94_;
	    if (argument_71_ != argument_69_)
		f_94_ = f_82_ / f_83_;
	    else
		f_94_ = 0.0F;
	    float f_95_ = f * f_83_ - f_82_ * f_81_;
	    if (f_95_ != 0.0F) {
		float f_96_ = (f_84_ * f_83_ - f_85_ * f_81_) / f_95_;
		float f_97_ = (f_85_ * f - f_84_ * f_82_) / f_95_;
		float f_98_ = (f_86_ * f_83_ - f_87_ * f_81_) / f_95_;
		float f_99_ = (f_87_ * f - f_86_ * f_82_) / f_95_;
		float f_100_ = (f_88_ * f_83_ - f_89_ * f_81_) / f_95_;
		float f_101_ = (f_89_ * f - f_88_ * f_82_) / f_95_;
		float f_102_ = (f_90_ * f_83_ - f_91_ * f_81_) / f_95_;
		float f_103_ = (f_91_ * f - f_90_ * f_82_) / f_95_;
		if (argument_69_ <= argument_70_
		    && argument_69_ <= argument_71_) {
		    if (!(argument_69_ >= (float) ((Class89) this).anInt653)) {
			if (argument_70_ > (float) ((Class89) this).anInt653)
			    argument_70_ = (float) ((Class89) this).anInt653;
			if (argument_71_ > (float) ((Class89) this).anInt653)
			    argument_71_ = (float) ((Class89) this).anInt653;
			argument_75_
			    = argument_75_ - f_96_ * argument_72_ + f_96_;
			float f_104_ = ((float) (argument_78_ & 0xff0000)
					- f_98_ * argument_72_ + f_98_);
			float f_105_ = ((float) (argument_78_ & 0xff00)
					- f_100_ * argument_72_ + f_100_);
			float f_106_ = ((float) (argument_78_ & 0xff)
					- f_102_ * argument_72_ + f_102_);
			if (argument_70_ < argument_71_) {
			    argument_74_ = argument_72_;
			    if (argument_69_ < 0.0F) {
				argument_74_ -= f_94_ * argument_69_;
				argument_72_ -= f_93_ * argument_69_;
				argument_75_ -= f_97_ * argument_69_;
				f_104_ -= f_99_ * argument_69_;
				f_105_ -= f_101_ * argument_69_;
				f_106_ -= f_103_ * argument_69_;
				argument_69_ = 0.0F;
			    }
			    if (argument_70_ < 0.0F) {
				argument_73_ -= f_92_ * argument_70_;
				argument_70_ = 0.0F;
			    }
			    if (argument_69_ != argument_70_ && f_94_ < f_93_
				|| (argument_69_ == argument_70_
				    && f_94_ > f_92_)) {
				argument_71_ -= argument_70_;
				argument_70_ -= argument_69_;
				argument_69_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_69_]);
				while (--argument_70_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_69_, 0, 0,
					       (int) argument_74_,
					       (int) argument_72_,
					       argument_75_, f_96_, f_104_,
					       f_98_, f_105_, f_100_, f_106_,
					       f_102_);
				    argument_74_ += f_94_;
				    argument_72_ += f_93_;
				    argument_75_ += f_97_;
				    f_104_ += f_99_;
				    f_105_ += f_101_;
				    f_106_ += f_103_;
				    argument_69_ += (float) anInt652;
				}
				while (--argument_71_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_69_, 0, 0,
					       (int) argument_74_,
					       (int) argument_73_,
					       argument_75_, f_96_, f_104_,
					       f_98_, f_105_, f_100_, f_106_,
					       f_102_);
				    argument_74_ += f_94_;
				    argument_73_ += f_92_;
				    argument_75_ += f_97_;
				    f_104_ += f_99_;
				    f_105_ += f_101_;
				    f_106_ += f_103_;
				    argument_69_ += (float) anInt652;
				}
			    } else {
				argument_71_ -= argument_70_;
				argument_70_ -= argument_69_;
				argument_69_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_69_]);
				while (--argument_70_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_69_, 0, 0,
					       (int) argument_72_,
					       (int) argument_74_,
					       argument_75_, f_96_, f_104_,
					       f_98_, f_105_, f_100_, f_106_,
					       f_102_);
				    argument_74_ += f_94_;
				    argument_72_ += f_93_;
				    argument_75_ += f_97_;
				    f_104_ += f_99_;
				    f_105_ += f_101_;
				    f_106_ += f_103_;
				    argument_69_ += (float) anInt652;
				}
				while (--argument_71_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_69_, 0, 0,
					       (int) argument_73_,
					       (int) argument_74_,
					       argument_75_, f_96_, f_104_,
					       f_98_, f_105_, f_100_, f_106_,
					       f_102_);
				    argument_74_ += f_94_;
				    argument_73_ += f_92_;
				    argument_75_ += f_97_;
				    f_104_ += f_99_;
				    f_105_ += f_101_;
				    f_106_ += f_103_;
				    argument_69_ += (float) anInt652;
				}
			    }
			} else {
			    argument_73_ = argument_72_;
			    if (argument_69_ < 0.0F) {
				argument_73_ -= f_94_ * argument_69_;
				argument_72_ -= f_93_ * argument_69_;
				argument_75_ -= f_97_ * argument_69_;
				f_104_ -= f_99_ * argument_69_;
				f_105_ -= f_101_ * argument_69_;
				f_106_ -= f_103_ * argument_69_;
				argument_69_ = 0.0F;
			    }
			    if (argument_71_ < 0.0F) {
				argument_74_ -= f_92_ * argument_71_;
				argument_71_ = 0.0F;
			    }
			    if (argument_69_ != argument_71_ && f_94_ < f_93_
				|| (argument_69_ == argument_71_
				    && f_92_ > f_93_)) {
				argument_70_ -= argument_71_;
				argument_71_ -= argument_69_;
				argument_69_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_69_]);
				while (--argument_71_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_69_, 0, 0,
					       (int) argument_73_,
					       (int) argument_72_,
					       argument_75_, f_96_, f_104_,
					       f_98_, f_105_, f_100_, f_106_,
					       f_102_);
				    argument_73_ += f_94_;
				    argument_72_ += f_93_;
				    argument_75_ += f_97_;
				    f_104_ += f_99_;
				    f_105_ += f_101_;
				    f_106_ += f_103_;
				    argument_69_ += (float) anInt652;
				}
				while (--argument_70_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_69_, 0, 0,
					       (int) argument_74_,
					       (int) argument_72_,
					       argument_75_, f_96_, f_104_,
					       f_98_, f_105_, f_100_, f_106_,
					       f_102_);
				    argument_74_ += f_92_;
				    argument_72_ += f_93_;
				    argument_75_ += f_97_;
				    f_104_ += f_99_;
				    f_105_ += f_101_;
				    f_106_ += f_103_;
				    argument_69_ += (float) anInt652;
				}
			    } else {
				argument_70_ -= argument_71_;
				argument_71_ -= argument_69_;
				argument_69_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_69_]);
				while (--argument_71_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_69_, 0, 0,
					       (int) argument_72_,
					       (int) argument_73_,
					       argument_75_, f_96_, f_104_,
					       f_98_, f_105_, f_100_, f_106_,
					       f_102_);
				    argument_73_ += f_94_;
				    argument_72_ += f_93_;
				    argument_75_ += f_97_;
				    f_104_ += f_99_;
				    f_105_ += f_101_;
				    f_106_ += f_103_;
				    argument_69_ += (float) anInt652;
				}
				while (--argument_70_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_69_, 0, 0,
					       (int) argument_72_,
					       (int) argument_74_,
					       argument_75_, f_96_, f_104_,
					       f_98_, f_105_, f_100_, f_106_,
					       f_102_);
				    argument_74_ += f_92_;
				    argument_72_ += f_93_;
				    argument_75_ += f_97_;
				    f_104_ += f_99_;
				    f_105_ += f_101_;
				    f_106_ += f_103_;
				    argument_69_ += (float) anInt652;
				}
			    }
			}
		    }
		} else if (argument_70_ <= argument_71_) {
		    if (!(argument_70_ >= (float) ((Class89) this).anInt653)) {
			if (argument_71_ > (float) ((Class89) this).anInt653)
			    argument_71_ = (float) ((Class89) this).anInt653;
			if (argument_69_ > (float) ((Class89) this).anInt653)
			    argument_69_ = (float) ((Class89) this).anInt653;
			argument_76_
			    = argument_76_ - f_96_ * argument_73_ + f_96_;
			float f_107_ = ((float) (argument_79_ & 0xff0000)
					- f_98_ * argument_73_ + f_98_);
			float f_108_ = ((float) (argument_79_ & 0xff00)
					- f_100_ * argument_73_ + f_100_);
			float f_109_ = ((float) (argument_79_ & 0xff)
					- f_102_ * argument_73_ + f_102_);
			if (argument_71_ < argument_69_) {
			    argument_72_ = argument_73_;
			    if (argument_70_ < 0.0F) {
				argument_72_ -= f_93_ * argument_70_;
				argument_73_ -= f_92_ * argument_70_;
				argument_76_ -= f_97_ * argument_70_;
				f_107_ -= f_99_ * argument_70_;
				f_108_ -= f_101_ * argument_70_;
				f_109_ -= f_103_ * argument_70_;
				argument_70_ = 0.0F;
			    }
			    if (argument_71_ < 0.0F) {
				argument_74_ -= f_94_ * argument_71_;
				argument_71_ = 0.0F;
			    }
			    if (argument_70_ != argument_71_ && f_93_ < f_92_
				|| (argument_70_ == argument_71_
				    && f_93_ > f_94_)) {
				argument_69_ -= argument_71_;
				argument_71_ -= argument_70_;
				argument_70_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_70_]);
				while (--argument_71_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_70_, 0, 0,
					       (int) argument_72_,
					       (int) argument_73_,
					       argument_76_, f_96_, f_107_,
					       f_98_, f_108_, f_100_, f_109_,
					       f_102_);
				    argument_72_ += f_93_;
				    argument_73_ += f_92_;
				    argument_76_ += f_97_;
				    f_107_ += f_99_;
				    f_108_ += f_101_;
				    f_109_ += f_103_;
				    argument_70_ += (float) anInt652;
				}
				while (--argument_69_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_70_, 0, 0,
					       (int) argument_72_,
					       (int) argument_74_,
					       argument_76_, f_96_, f_107_,
					       f_98_, f_108_, f_100_, f_109_,
					       f_102_);
				    argument_72_ += f_93_;
				    argument_74_ += f_94_;
				    argument_76_ += f_97_;
				    f_107_ += f_99_;
				    f_108_ += f_101_;
				    f_109_ += f_103_;
				    argument_70_ += (float) anInt652;
				}
			    } else {
				argument_69_ -= argument_71_;
				argument_71_ -= argument_70_;
				argument_70_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_70_]);
				while (--argument_71_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_70_, 0, 0,
					       (int) argument_73_,
					       (int) argument_72_,
					       argument_76_, f_96_, f_107_,
					       f_98_, f_108_, f_100_, f_109_,
					       f_102_);
				    argument_72_ += f_93_;
				    argument_73_ += f_92_;
				    argument_76_ += f_97_;
				    f_107_ += f_99_;
				    f_108_ += f_101_;
				    f_109_ += f_103_;
				    argument_70_ += (float) anInt652;
				}
				while (--argument_69_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_70_, 0, 0,
					       (int) argument_74_,
					       (int) argument_72_,
					       argument_76_, f_96_, f_107_,
					       f_98_, f_108_, f_100_, f_109_,
					       f_102_);
				    argument_72_ += f_93_;
				    argument_74_ += f_94_;
				    argument_76_ += f_97_;
				    f_107_ += f_99_;
				    f_108_ += f_101_;
				    f_109_ += f_103_;
				    argument_70_ += (float) anInt652;
				}
			    }
			} else {
			    argument_74_ = argument_73_;
			    if (argument_70_ < 0.0F) {
				argument_74_ -= f_93_ * argument_70_;
				argument_73_ -= f_92_ * argument_70_;
				argument_76_ -= f_97_ * argument_70_;
				f_107_ -= f_99_ * argument_70_;
				f_108_ -= f_101_ * argument_70_;
				f_109_ -= f_103_ * argument_70_;
				argument_70_ = 0.0F;
			    }
			    if (argument_69_ < 0.0F) {
				argument_72_ -= f_94_ * argument_69_;
				argument_69_ = 0.0F;
			    }
			    if (f_93_ < f_92_) {
				argument_71_ -= argument_69_;
				argument_69_ -= argument_70_;
				argument_70_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_70_]);
				while (--argument_69_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_70_, 0, 0,
					       (int) argument_74_,
					       (int) argument_73_,
					       argument_76_, f_96_, f_107_,
					       f_98_, f_108_, f_100_, f_109_,
					       f_102_);
				    argument_74_ += f_93_;
				    argument_73_ += f_92_;
				    argument_76_ += f_97_;
				    f_107_ += f_99_;
				    f_108_ += f_101_;
				    f_109_ += f_103_;
				    argument_70_ += (float) anInt652;
				}
				while (--argument_71_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_70_, 0, 0,
					       (int) argument_72_,
					       (int) argument_73_,
					       argument_76_, f_96_, f_107_,
					       f_98_, f_108_, f_100_, f_109_,
					       f_102_);
				    argument_72_ += f_94_;
				    argument_73_ += f_92_;
				    argument_76_ += f_97_;
				    f_107_ += f_99_;
				    f_108_ += f_101_;
				    f_109_ += f_103_;
				    argument_70_ += (float) anInt652;
				}
			    } else {
				argument_71_ -= argument_69_;
				argument_69_ -= argument_70_;
				argument_70_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_70_]);
				while (--argument_69_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_70_, 0, 0,
					       (int) argument_73_,
					       (int) argument_74_,
					       argument_76_, f_96_, f_107_,
					       f_98_, f_108_, f_100_, f_109_,
					       f_102_);
				    argument_74_ += f_93_;
				    argument_73_ += f_92_;
				    argument_76_ += f_97_;
				    f_107_ += f_99_;
				    f_108_ += f_101_;
				    f_109_ += f_103_;
				    argument_70_ += (float) anInt652;
				}
				while (--argument_71_ >= 0.0F) {
				    method1671(anIntArray657, aFloatArray656,
					       (int) argument_70_, 0, 0,
					       (int) argument_73_,
					       (int) argument_72_,
					       argument_76_, f_96_, f_107_,
					       f_98_, f_108_, f_100_, f_109_,
					       f_102_);
				    argument_72_ += f_94_;
				    argument_73_ += f_92_;
				    argument_76_ += f_97_;
				    f_107_ += f_99_;
				    f_108_ += f_101_;
				    f_109_ += f_103_;
				    argument_70_ += (float) anInt652;
				}
			    }
			}
		    }
		} else if (!(argument_71_
			     >= (float) ((Class89) this).anInt653)) {
		    if (argument_69_ > (float) ((Class89) this).anInt653)
			argument_69_ = (float) ((Class89) this).anInt653;
		    if (argument_70_ > (float) ((Class89) this).anInt653)
			argument_70_ = (float) ((Class89) this).anInt653;
		    argument_77_ = argument_77_ - f_96_ * argument_74_ + f_96_;
		    float f_110_ = ((float) (argument_80_ & 0xff0000)
				    - f_98_ * argument_74_ + f_98_);
		    float f_111_ = ((float) (argument_80_ & 0xff00)
				    - f_100_ * argument_74_ + f_100_);
		    float f_112_ = ((float) (argument_80_ & 0xff)
				    - f_102_ * argument_74_ + f_102_);
		    if (argument_69_ < argument_70_) {
			argument_73_ = argument_74_;
			if (argument_71_ < 0.0F) {
			    argument_73_ -= f_92_ * argument_71_;
			    argument_74_ -= f_94_ * argument_71_;
			    argument_77_ -= f_97_ * argument_71_;
			    f_110_ -= f_99_ * argument_71_;
			    f_111_ -= f_101_ * argument_71_;
			    f_112_ -= f_103_ * argument_71_;
			    argument_71_ = 0.0F;
			}
			if (argument_69_ < 0.0F) {
			    argument_72_ -= f_93_ * argument_69_;
			    argument_69_ = 0.0F;
			}
			if (f_92_ < f_94_) {
			    argument_70_ -= argument_69_;
			    argument_69_ -= argument_71_;
			    argument_71_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_71_]);
			    while (--argument_69_ >= 0.0F) {
				method1671(anIntArray657, aFloatArray656,
					   (int) argument_71_, 0, 0,
					   (int) argument_73_,
					   (int) argument_74_, argument_77_,
					   f_96_, f_110_, f_98_, f_111_,
					   f_100_, f_112_, f_102_);
				argument_73_ += f_92_;
				argument_74_ += f_94_;
				argument_77_ += f_97_;
				f_110_ += f_99_;
				f_111_ += f_101_;
				f_112_ += f_103_;
				argument_71_ += (float) anInt652;
			    }
			    while (--argument_70_ >= 0.0F) {
				method1671(anIntArray657, aFloatArray656,
					   (int) argument_71_, 0, 0,
					   (int) argument_73_,
					   (int) argument_72_, argument_77_,
					   f_96_, f_110_, f_98_, f_111_,
					   f_100_, f_112_, f_102_);
				argument_73_ += f_92_;
				argument_72_ += f_93_;
				argument_77_ += f_97_;
				f_110_ += f_99_;
				f_111_ += f_101_;
				f_112_ += f_103_;
				argument_71_ += (float) anInt652;
			    }
			} else {
			    argument_70_ -= argument_69_;
			    argument_69_ -= argument_71_;
			    argument_71_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_71_]);
			    while (--argument_69_ >= 0.0F) {
				method1671(anIntArray657, aFloatArray656,
					   (int) argument_71_, 0, 0,
					   (int) argument_74_,
					   (int) argument_73_, argument_77_,
					   f_96_, f_110_, f_98_, f_111_,
					   f_100_, f_112_, f_102_);
				argument_73_ += f_92_;
				argument_74_ += f_94_;
				argument_77_ += f_97_;
				f_110_ += f_99_;
				f_111_ += f_101_;
				f_112_ += f_103_;
				argument_71_ += (float) anInt652;
			    }
			    while (--argument_70_ >= 0.0F) {
				method1671(anIntArray657, aFloatArray656,
					   (int) argument_71_, 0, 0,
					   (int) argument_72_,
					   (int) argument_73_, argument_77_,
					   f_96_, f_110_, f_98_, f_111_,
					   f_100_, f_112_, f_102_);
				argument_73_ += f_92_;
				argument_72_ += f_93_;
				argument_77_ += f_97_;
				f_110_ += f_99_;
				f_111_ += f_101_;
				f_112_ += f_103_;
				argument_71_ += (float) anInt652;
			    }
			}
		    } else {
			argument_72_ = argument_74_;
			if (argument_71_ < 0.0F) {
			    argument_72_ -= f_92_ * argument_71_;
			    argument_74_ -= f_94_ * argument_71_;
			    argument_77_ -= f_97_ * argument_71_;
			    f_110_ -= f_99_ * argument_71_;
			    f_111_ -= f_101_ * argument_71_;
			    f_112_ -= f_103_ * argument_71_;
			    argument_71_ = 0.0F;
			}
			if (argument_70_ < 0.0F) {
			    argument_73_ -= f_93_ * argument_70_;
			    argument_70_ = 0.0F;
			}
			if (f_92_ < f_94_) {
			    argument_69_ -= argument_70_;
			    argument_70_ -= argument_71_;
			    argument_71_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_71_]);
			    while (--argument_70_ >= 0.0F) {
				method1671(anIntArray657, aFloatArray656,
					   (int) argument_71_, 0, 0,
					   (int) argument_72_,
					   (int) argument_74_, argument_77_,
					   f_96_, f_110_, f_98_, f_111_,
					   f_100_, f_112_, f_102_);
				argument_72_ += f_92_;
				argument_74_ += f_94_;
				argument_77_ += f_97_;
				f_110_ += f_99_;
				f_111_ += f_101_;
				f_112_ += f_103_;
				argument_71_ += (float) anInt652;
			    }
			    while (--argument_69_ >= 0.0F) {
				method1671(anIntArray657, aFloatArray656,
					   (int) argument_71_, 0, 0,
					   (int) argument_73_,
					   (int) argument_74_, argument_77_,
					   f_96_, f_110_, f_98_, f_111_,
					   f_100_, f_112_, f_102_);
				argument_73_ += f_93_;
				argument_74_ += f_94_;
				argument_77_ += f_97_;
				f_110_ += f_99_;
				f_111_ += f_101_;
				f_112_ += f_103_;
				argument_71_ += (float) anInt652;
			    }
			} else {
			    argument_69_ -= argument_70_;
			    argument_70_ -= argument_71_;
			    argument_71_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_71_]);
			    while (--argument_70_ >= 0.0F) {
				method1671(anIntArray657, aFloatArray656,
					   (int) argument_71_, 0, 0,
					   (int) argument_74_,
					   (int) argument_72_, argument_77_,
					   f_96_, f_110_, f_98_, f_111_,
					   f_100_, f_112_, f_102_);
				argument_72_ += f_92_;
				argument_74_ += f_94_;
				argument_77_ += f_97_;
				f_110_ += f_99_;
				f_111_ += f_101_;
				f_112_ += f_103_;
				argument_71_ += (float) anInt652;
			    }
			    while (--argument_69_ >= 0.0F) {
				method1671(anIntArray657, aFloatArray656,
					   (int) argument_71_, 0, 0,
					   (int) argument_74_,
					   (int) argument_73_, argument_77_,
					   f_96_, f_110_, f_98_, f_111_,
					   f_100_, f_112_, f_102_);
				argument_73_ += f_93_;
				argument_74_ += f_94_;
				argument_77_ += f_97_;
				f_110_ += f_99_;
				f_111_ += f_101_;
				f_112_ += f_103_;
				argument_71_ += (float) anInt652;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final int method1657() {
	return ((Class89) this).anIntArray658[0] % anInt652;
    }
    
    final int method1658() {
	return ((Class89) this).anIntArray658[0] / anInt652;
    }
    
    private final void method1659
	(int[] argument_113_, int[] argument_114_, int argument_115_,
	 int argument_116_, int argument_117_, float argument_118_,
	 float argument_119_, float argument_120_, float argument_121_,
	 float argument_122_, float argument_123_, float argument_124_,
	 float argument_125_, float argument_126_, float argument_127_,
	 float argument_128_, float argument_129_, float argument_130_,
	 float argument_131_, float argument_132_, float argument_133_) {
	int anLocalInt = argument_117_ - argument_116_;
	float f = 1.0F / (float) anLocalInt;
	float f_134_ = (argument_119_ - argument_118_) * f;
	float f_135_ = (argument_121_ - argument_120_) * f;
	float f_136_ = (argument_123_ - argument_122_) * f;
	float f_137_ = (argument_125_ - argument_124_) * f;
	float f_138_ = (argument_127_ - argument_126_) * f;
	float f_139_ = (argument_129_ - argument_128_) * f;
	float f_140_ = (argument_131_ - argument_130_) * f;
	float f_141_ = (argument_133_ - argument_132_) * f;
	if (((Class89) this).aBoolean661) {
	    if (argument_117_ > ((Class89) this).anInt650)
		argument_117_ = ((Class89) this).anInt650;
	    if (argument_116_ < 0) {
		argument_118_ -= f_134_ * (float) argument_116_;
		argument_120_ -= f_135_ * (float) argument_116_;
		argument_122_ -= f_136_ * (float) argument_116_;
		argument_124_ -= f_137_ * (float) argument_116_;
		argument_126_ -= f_138_ * (float) argument_116_;
		argument_128_ -= f_139_ * (float) argument_116_;
		argument_130_ -= f_140_ * (float) argument_116_;
		argument_132_ -= f_141_ * (float) argument_116_;
		argument_116_ = 0;
	    }
	}
	if (argument_116_ < argument_117_) {
	    anLocalInt = argument_117_ - argument_116_;
	    argument_115_ += argument_116_;
	    while (anLocalInt-- > 0) {
		float f_142_ = 1.0F / argument_118_;
		if (f_142_ < aFloatArray656[argument_115_]) {
		    int anLocalInt_143_
			= (int) (argument_120_ * f_142_ * (float) anInt663);
		    if (aBoolean672)
			anLocalInt_143_ &= anInt666;
		    else if (anLocalInt_143_ < 0)
			anLocalInt_143_ = 0;
		    else if (anLocalInt_143_ > anInt666)
			anLocalInt_143_ = anInt666;
		    int anLocalInt_144_
			= (int) (argument_122_ * f_142_ * (float) anInt663);
		    if (aBoolean672)
			anLocalInt_144_ &= anInt666;
		    else if (anLocalInt_144_ < 0)
			anLocalInt_144_ = 0;
		    else if (anLocalInt_144_ > anInt666)
			anLocalInt_144_ = anInt666;
		    int anLocalInt_145_
			= (anIntArray676
			   [anLocalInt_144_ * anInt663 + anLocalInt_143_]);
		    int anLocalInt_146_ = 255;
		    if (anInt675 == 2)
			anLocalInt_146_ = anLocalInt_145_ >> 24 & 0xff;
		    else if (anInt675 == 1)
			anLocalInt_146_ = anLocalInt_145_ == 0 ? 0 : 255;
		    else
			anLocalInt_146_ = (int) argument_126_;
		    if (anLocalInt_146_ != 0) {
			if (anLocalInt_146_ != 255) {
			    int anLocalInt_147_
				= ((int) (argument_128_
					  * (float) (anLocalInt_145_ >> 16
						     & 0xff)) << 8 & 0xff0000
				   | ~0xffffff
				   | (int) (argument_130_
					    * (float) (anLocalInt_145_ >> 8
						       & 0xff)) & 0xff00
				   | (int) (argument_132_
					    * (float) (anLocalInt_145_
						       & 0xff)) >> 8);
			    if (argument_124_ != 0.0F) {
				int anLocalInt_148_
				    = (int) (255.0F - argument_124_);
				int anLocalInt_149_
				    = ((((anInt668 & 0xff00ff)
					 * (int) argument_124_) & ~0xff00ff
					| ((anInt668 & 0xff00)
					   * (int) argument_124_) & 0xff0000)
				       >>> 8);
				anLocalInt_147_
				    = ((((anLocalInt_147_ & 0xff00ff)
					 * anLocalInt_148_) & ~0xff00ff
					| ((anLocalInt_147_ & 0xff00)
					   * anLocalInt_148_) & 0xff0000)
				       >>> 8) + anLocalInt_149_;
			    }
			    int anLocalInt_150_ = argument_113_[argument_115_];
			    int anLocalInt_151_ = 255 - anLocalInt_146_;
			    anLocalInt_147_
				= (((((anLocalInt_150_ & 0xff00ff)
				      * anLocalInt_151_)
				     + ((anLocalInt_147_ & 0xff00ff)
					* anLocalInt_146_))
				    & ~0xff00ff)
				   + ((((anLocalInt_150_ & 0xff00)
					* anLocalInt_151_)
				       + ((anLocalInt_147_ & 0xff00)
					  * anLocalInt_146_))
				      & 0xff0000)) >> 8;
			    argument_113_[argument_115_]
				= ((anLocalInt_146_
				    | argument_113_[argument_115_] >> 24) << 24
				   | anLocalInt_147_);
			    aFloatArray656[argument_115_] = f_142_;
			} else {
			    int anLocalInt_152_
				= ((int) (argument_128_
					  * (float) (anLocalInt_145_ >> 16
						     & 0xff)) << 8 & 0xff0000
				   | ~0xffffff
				   | (int) (argument_130_
					    * (float) (anLocalInt_145_ >> 8
						       & 0xff)) & 0xff00
				   | (int) (argument_132_
					    * (float) (anLocalInt_145_
						       & 0xff)) >> 8);
			    if (argument_124_ != 0.0F) {
				int anLocalInt_153_
				    = (int) (255.0F - argument_124_);
				int anLocalInt_154_
				    = ((((anInt668 & 0xff00ff)
					 * (int) argument_124_) & ~0xff00ff
					| ((anInt668 & 0xff00)
					   * (int) argument_124_) & 0xff0000)
				       >>> 8);
				anLocalInt_152_
				    = ((((anLocalInt_152_ & 0xff00ff)
					 * anLocalInt_153_) & ~0xff00ff
					| ((anLocalInt_152_ & 0xff00)
					   * anLocalInt_153_) & 0xff0000)
				       >>> 8) + anLocalInt_154_;
			    }
			    argument_113_[argument_115_]
				= anLocalInt_146_ << 24 | anLocalInt_152_;
			    aFloatArray656[argument_115_] = f_142_;
			}
		    }
		}
		argument_115_++;
		argument_118_ += f_134_;
		argument_120_ += f_135_;
		argument_122_ += f_136_;
		argument_124_ += f_137_;
		argument_126_ += f_138_;
		argument_128_ += f_139_;
		argument_130_ += f_140_;
		argument_132_ += f_141_;
	    }
	}
    }
    
    final void method1660(float argument_155_, float argument_156_,
			  float argument_157_, float argument_158_,
			  float argument_159_, float argument_160_,
			  float argument_161_, float argument_162_,
			  float argument_163_, int argument_164_) {
	if (aBoolean649) {
	    aClass_ha__651.method2035(argument_164_, (byte) -48,
					  (int) argument_155_,
					  (int) argument_159_,
					  (int) argument_156_,
					  (int) argument_158_);
	    aClass_ha__651.method2035(argument_164_, (byte) -25,
					  (int) argument_156_,
					  (int) argument_160_,
					  (int) argument_157_,
					  (int) argument_159_);
	    aClass_ha__651.method2035(argument_164_, (byte) -125,
					  (int) argument_157_,
					  (int) argument_158_,
					  (int) argument_155_,
					  (int) argument_160_);
	} else {
	    float f = argument_159_ - argument_158_;
	    float f_165_ = argument_156_ - argument_155_;
	    float f_166_ = argument_160_ - argument_158_;
	    float f_167_ = argument_157_ - argument_155_;
	    float f_168_ = argument_162_ - argument_161_;
	    float f_169_ = argument_163_ - argument_161_;
	    float f_170_ = 0.0F;
	    if (argument_156_ != argument_155_)
		f_170_ = (argument_159_ - argument_158_) / (argument_156_
							    - argument_155_);
	    float f_171_ = 0.0F;
	    if (argument_157_ != argument_156_)
		f_171_ = (argument_160_ - argument_159_) / (argument_157_
							    - argument_156_);
	    float f_172_ = 0.0F;
	    if (argument_157_ != argument_155_)
		f_172_ = (argument_158_ - argument_160_) / (argument_155_
							    - argument_157_);
	    float f_173_ = f * f_167_ - f_166_ * f_165_;
	    if (f_173_ != 0.0F) {
		float f_174_ = (f_168_ * f_167_ - f_169_ * f_165_) / f_173_;
		float f_175_ = (f_169_ * f - f_168_ * f_166_) / f_173_;
		if (argument_155_ <= argument_156_
		    && argument_155_ <= argument_157_) {
		    if (!(argument_155_
			  >= (float) ((Class89) this).anInt653)) {
			if (argument_156_ > (float) ((Class89) this).anInt653)
			    argument_156_ = (float) ((Class89) this).anInt653;
			if (argument_157_ > (float) ((Class89) this).anInt653)
			    argument_157_ = (float) ((Class89) this).anInt653;
			argument_161_
			    = argument_161_ - f_174_ * argument_158_ + f_174_;
			if (argument_156_ < argument_157_) {
			    argument_160_ = argument_158_;
			    if (argument_155_ < 0.0F) {
				argument_160_ -= f_172_ * argument_155_;
				argument_158_ -= f_170_ * argument_155_;
				argument_161_ -= f_175_ * argument_155_;
				argument_155_ = 0.0F;
			    }
			    if (argument_156_ < 0.0F) {
				argument_159_ -= f_171_ * argument_156_;
				argument_156_ = 0.0F;
			    }
			    if ((argument_155_ != argument_156_
				 && f_172_ < f_170_)
				|| (argument_155_ == argument_156_
				    && f_172_ > f_171_)) {
				argument_157_ -= argument_156_;
				argument_156_ -= argument_155_;
				argument_155_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_155_]);
				while (--argument_156_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_155_,
					       argument_164_, 0,
					       (int) argument_160_,
					       (int) argument_158_,
					       argument_161_, f_174_);
				    argument_160_ += f_172_;
				    argument_158_ += f_170_;
				    argument_161_ += f_175_;
				    argument_155_ += (float) anInt652;
				}
				while (--argument_157_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_155_,
					       argument_164_, 0,
					       (int) argument_160_,
					       (int) argument_159_,
					       argument_161_, f_174_);
				    argument_160_ += f_172_;
				    argument_159_ += f_171_;
				    argument_161_ += f_175_;
				    argument_155_ += (float) anInt652;
				}
			    } else {
				argument_157_ -= argument_156_;
				argument_156_ -= argument_155_;
				argument_155_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_155_]);
				while (--argument_156_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_155_,
					       argument_164_, 0,
					       (int) argument_158_,
					       (int) argument_160_,
					       argument_161_, f_174_);
				    argument_160_ += f_172_;
				    argument_158_ += f_170_;
				    argument_161_ += f_175_;
				    argument_155_ += (float) anInt652;
				}
				while (--argument_157_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_155_,
					       argument_164_, 0,
					       (int) argument_159_,
					       (int) argument_160_,
					       argument_161_, f_174_);
				    argument_160_ += f_172_;
				    argument_159_ += f_171_;
				    argument_161_ += f_175_;
				    argument_155_ += (float) anInt652;
				}
			    }
			} else {
			    argument_159_ = argument_158_;
			    if (argument_155_ < 0.0F) {
				argument_159_ -= f_172_ * argument_155_;
				argument_158_ -= f_170_ * argument_155_;
				argument_161_ -= f_175_ * argument_155_;
				argument_155_ = 0.0F;
			    }
			    if (argument_157_ < 0.0F) {
				argument_160_ -= f_171_ * argument_157_;
				argument_157_ = 0.0F;
			    }
			    if ((argument_155_ != argument_157_
				 && f_172_ < f_170_)
				|| (argument_155_ == argument_157_
				    && f_171_ > f_170_)) {
				argument_156_ -= argument_157_;
				argument_157_ -= argument_155_;
				argument_155_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_155_]);
				while (--argument_157_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_155_,
					       argument_164_, 0,
					       (int) argument_159_,
					       (int) argument_158_,
					       argument_161_, f_174_);
				    argument_159_ += f_172_;
				    argument_158_ += f_170_;
				    argument_161_ += f_175_;
				    argument_155_ += (float) anInt652;
				}
				while (--argument_156_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_155_,
					       argument_164_, 0,
					       (int) argument_160_,
					       (int) argument_158_,
					       argument_161_, f_174_);
				    argument_160_ += f_171_;
				    argument_158_ += f_170_;
				    argument_161_ += f_175_;
				    argument_155_ += (float) anInt652;
				}
			    } else {
				argument_156_ -= argument_157_;
				argument_157_ -= argument_155_;
				argument_155_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_155_]);
				while (--argument_157_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_155_,
					       argument_164_, 0,
					       (int) argument_158_,
					       (int) argument_159_,
					       argument_161_, f_174_);
				    argument_159_ += f_172_;
				    argument_158_ += f_170_;
				    argument_161_ += f_175_;
				    argument_155_ += (float) anInt652;
				}
				while (--argument_156_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_155_,
					       argument_164_, 0,
					       (int) argument_158_,
					       (int) argument_160_,
					       argument_161_, f_174_);
				    argument_160_ += f_171_;
				    argument_158_ += f_170_;
				    argument_161_ += f_175_;
				    argument_155_ += (float) anInt652;
				}
			    }
			}
		    }
		} else if (argument_156_ <= argument_157_) {
		    if (!(argument_156_
			  >= (float) ((Class89) this).anInt653)) {
			if (argument_157_ > (float) ((Class89) this).anInt653)
			    argument_157_ = (float) ((Class89) this).anInt653;
			if (argument_155_ > (float) ((Class89) this).anInt653)
			    argument_155_ = (float) ((Class89) this).anInt653;
			argument_162_
			    = argument_162_ - f_174_ * argument_159_ + f_174_;
			if (argument_157_ < argument_155_) {
			    argument_158_ = argument_159_;
			    if (argument_156_ < 0.0F) {
				argument_158_ -= f_170_ * argument_156_;
				argument_159_ -= f_171_ * argument_156_;
				argument_162_ -= f_175_ * argument_156_;
				argument_156_ = 0.0F;
			    }
			    if (argument_157_ < 0.0F) {
				argument_160_ -= f_172_ * argument_157_;
				argument_157_ = 0.0F;
			    }
			    if ((argument_156_ != argument_157_
				 && f_170_ < f_171_)
				|| (argument_156_ == argument_157_
				    && f_170_ > f_172_)) {
				argument_155_ -= argument_157_;
				argument_157_ -= argument_156_;
				argument_156_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_156_]);
				while (--argument_157_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_156_,
					       argument_164_, 0,
					       (int) argument_158_,
					       (int) argument_159_,
					       argument_162_, f_174_);
				    argument_158_ += f_170_;
				    argument_159_ += f_171_;
				    argument_162_ += f_175_;
				    argument_156_ += (float) anInt652;
				}
				while (--argument_155_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_156_,
					       argument_164_, 0,
					       (int) argument_158_,
					       (int) argument_160_,
					       argument_162_, f_174_);
				    argument_158_ += f_170_;
				    argument_160_ += f_172_;
				    argument_162_ += f_175_;
				    argument_156_ += (float) anInt652;
				}
			    } else {
				argument_155_ -= argument_157_;
				argument_157_ -= argument_156_;
				argument_156_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_156_]);
				while (--argument_157_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_156_,
					       argument_164_, 0,
					       (int) argument_159_,
					       (int) argument_158_,
					       argument_162_, f_174_);
				    argument_158_ += f_170_;
				    argument_159_ += f_171_;
				    argument_162_ += f_175_;
				    argument_156_ += (float) anInt652;
				}
				while (--argument_155_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_156_,
					       argument_164_, 0,
					       (int) argument_160_,
					       (int) argument_158_,
					       argument_162_, f_174_);
				    argument_158_ += f_170_;
				    argument_160_ += f_172_;
				    argument_162_ += f_175_;
				    argument_156_ += (float) anInt652;
				}
			    }
			} else {
			    argument_160_ = argument_159_;
			    if (argument_156_ < 0.0F) {
				argument_160_ -= f_170_ * argument_156_;
				argument_159_ -= f_171_ * argument_156_;
				argument_162_ -= f_175_ * argument_156_;
				argument_156_ = 0.0F;
			    }
			    if (argument_155_ < 0.0F) {
				argument_158_ -= f_172_ * argument_155_;
				argument_155_ = 0.0F;
			    }
			    if (f_170_ < f_171_) {
				argument_157_ -= argument_155_;
				argument_155_ -= argument_156_;
				argument_156_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_156_]);
				while (--argument_155_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_156_,
					       argument_164_, 0,
					       (int) argument_160_,
					       (int) argument_159_,
					       argument_162_, f_174_);
				    argument_160_ += f_170_;
				    argument_159_ += f_171_;
				    argument_162_ += f_175_;
				    argument_156_ += (float) anInt652;
				}
				while (--argument_157_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_156_,
					       argument_164_, 0,
					       (int) argument_158_,
					       (int) argument_159_,
					       argument_162_, f_174_);
				    argument_158_ += f_172_;
				    argument_159_ += f_171_;
				    argument_162_ += f_175_;
				    argument_156_ += (float) anInt652;
				}
			    } else {
				argument_157_ -= argument_155_;
				argument_155_ -= argument_156_;
				argument_156_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_156_]);
				while (--argument_155_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_156_,
					       argument_164_, 0,
					       (int) argument_159_,
					       (int) argument_160_,
					       argument_162_, f_174_);
				    argument_160_ += f_170_;
				    argument_159_ += f_171_;
				    argument_162_ += f_175_;
				    argument_156_ += (float) anInt652;
				}
				while (--argument_157_ >= 0.0F) {
				    method1653(anIntArray657, aFloatArray656,
					       (int) argument_156_,
					       argument_164_, 0,
					       (int) argument_159_,
					       (int) argument_158_,
					       argument_162_, f_174_);
				    argument_158_ += f_172_;
				    argument_159_ += f_171_;
				    argument_162_ += f_175_;
				    argument_156_ += (float) anInt652;
				}
			    }
			}
		    }
		} else if (!(argument_157_
			     >= (float) ((Class89) this).anInt653)) {
		    if (argument_155_ > (float) ((Class89) this).anInt653)
			argument_155_ = (float) ((Class89) this).anInt653;
		    if (argument_156_ > (float) ((Class89) this).anInt653)
			argument_156_ = (float) ((Class89) this).anInt653;
		    argument_163_
			= argument_163_ - f_174_ * argument_160_ + f_174_;
		    if (argument_155_ < argument_156_) {
			argument_159_ = argument_160_;
			if (argument_157_ < 0.0F) {
			    argument_159_ -= f_171_ * argument_157_;
			    argument_160_ -= f_172_ * argument_157_;
			    argument_163_ -= f_175_ * argument_157_;
			    argument_157_ = 0.0F;
			}
			if (argument_155_ < 0.0F) {
			    argument_158_ -= f_170_ * argument_155_;
			    argument_155_ = 0.0F;
			}
			if (f_171_ < f_172_) {
			    argument_156_ -= argument_155_;
			    argument_155_ -= argument_157_;
			    argument_157_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_157_]);
			    while (--argument_155_ >= 0.0F) {
				method1653(anIntArray657, aFloatArray656,
					   (int) argument_157_, argument_164_,
					   0, (int) argument_159_,
					   (int) argument_160_, argument_163_,
					   f_174_);
				argument_159_ += f_171_;
				argument_160_ += f_172_;
				argument_163_ += f_175_;
				argument_157_ += (float) anInt652;
			    }
			    while (--argument_156_ >= 0.0F) {
				method1653(anIntArray657, aFloatArray656,
					   (int) argument_157_, argument_164_,
					   0, (int) argument_159_,
					   (int) argument_158_, argument_163_,
					   f_174_);
				argument_159_ += f_171_;
				argument_158_ += f_170_;
				argument_163_ += f_175_;
				argument_157_ += (float) anInt652;
			    }
			} else {
			    argument_156_ -= argument_155_;
			    argument_155_ -= argument_157_;
			    argument_157_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_157_]);
			    while (--argument_155_ >= 0.0F) {
				method1653(anIntArray657, aFloatArray656,
					   (int) argument_157_, argument_164_,
					   0, (int) argument_160_,
					   (int) argument_159_, argument_163_,
					   f_174_);
				argument_159_ += f_171_;
				argument_160_ += f_172_;
				argument_163_ += f_175_;
				argument_157_ += (float) anInt652;
			    }
			    while (--argument_156_ >= 0.0F) {
				method1653(anIntArray657, aFloatArray656,
					   (int) argument_157_, argument_164_,
					   0, (int) argument_158_,
					   (int) argument_159_, argument_163_,
					   f_174_);
				argument_159_ += f_171_;
				argument_158_ += f_170_;
				argument_163_ += f_175_;
				argument_157_ += (float) anInt652;
			    }
			}
		    } else {
			argument_158_ = argument_160_;
			if (argument_157_ < 0.0F) {
			    argument_158_ -= f_171_ * argument_157_;
			    argument_160_ -= f_172_ * argument_157_;
			    argument_163_ -= f_175_ * argument_157_;
			    argument_157_ = 0.0F;
			}
			if (argument_156_ < 0.0F) {
			    argument_159_ -= f_170_ * argument_156_;
			    argument_156_ = 0.0F;
			}
			if (f_171_ < f_172_) {
			    argument_155_ -= argument_156_;
			    argument_156_ -= argument_157_;
			    argument_157_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_157_]);
			    while (--argument_156_ >= 0.0F) {
				method1653(anIntArray657, aFloatArray656,
					   (int) argument_157_, argument_164_,
					   0, (int) argument_158_,
					   (int) argument_160_, argument_163_,
					   f_174_);
				argument_158_ += f_171_;
				argument_160_ += f_172_;
				argument_163_ += f_175_;
				argument_157_ += (float) anInt652;
			    }
			    while (--argument_155_ >= 0.0F) {
				method1653(anIntArray657, aFloatArray656,
					   (int) argument_157_, argument_164_,
					   0, (int) argument_159_,
					   (int) argument_160_, argument_163_,
					   f_174_);
				argument_159_ += f_170_;
				argument_160_ += f_172_;
				argument_163_ += f_175_;
				argument_157_ += (float) anInt652;
			    }
			} else {
			    argument_155_ -= argument_156_;
			    argument_156_ -= argument_157_;
			    argument_157_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_157_]);
			    while (--argument_156_ >= 0.0F) {
				method1653(anIntArray657, aFloatArray656,
					   (int) argument_157_, argument_164_,
					   0, (int) argument_160_,
					   (int) argument_158_, argument_163_,
					   f_174_);
				argument_158_ += f_171_;
				argument_160_ += f_172_;
				argument_163_ += f_175_;
				argument_157_ += (float) anInt652;
			    }
			    while (--argument_155_ >= 0.0F) {
				method1653(anIntArray657, aFloatArray656,
					   (int) argument_157_, argument_164_,
					   0, (int) argument_160_,
					   (int) argument_159_, argument_163_,
					   f_174_);
				argument_159_ += f_170_;
				argument_160_ += f_172_;
				argument_163_ += f_175_;
				argument_157_ += (float) anInt652;
			    }
			}
		    }
		}
	    }
	}
    }
    
    private final void method1661
	(int[] argument_176_, float[] argument_177_, int argument_178_,
	 int argument_179_, int argument_180_, int argument_181_,
	 int argument_182_, float argument_183_, float argument_184_) {
	if (((Class89) this).aBoolean661) {
	    if (argument_182_ > ((Class89) this).anInt650)
		argument_182_ = ((Class89) this).anInt650;
	    if (argument_181_ < 0)
		argument_181_ = 0;
	}
	if (argument_181_ < argument_182_) {
	    argument_178_ += argument_181_ - 1;
	    argument_180_ = argument_182_ - argument_181_ >> 2;
	    argument_183_ += argument_184_ * (float) argument_181_;
	    if (((Class293) aClass293_660).aBoolean2415) {
		if (((Class89) this).anInt646 == 0) {
		    while (--argument_180_ >= 0) {
			if (argument_183_ < argument_177_[++argument_178_]) {
			    argument_176_[argument_178_] = argument_179_;
			    argument_177_[argument_178_] = argument_183_;
			}
			argument_183_ += argument_184_;
			if (argument_183_ < argument_177_[++argument_178_]) {
			    argument_176_[argument_178_] = argument_179_;
			    argument_177_[argument_178_] = argument_183_;
			}
			argument_183_ += argument_184_;
			if (argument_183_ < argument_177_[++argument_178_]) {
			    argument_176_[argument_178_] = argument_179_;
			    argument_177_[argument_178_] = argument_183_;
			}
			argument_183_ += argument_184_;
			if (argument_183_ < argument_177_[++argument_178_]) {
			    argument_176_[argument_178_] = argument_179_;
			    argument_177_[argument_178_] = argument_183_;
			}
			argument_183_ += argument_184_;
		    }
		    argument_180_ = argument_182_ - argument_181_ & 0x3;
		    while (--argument_180_ >= 0) {
			if (argument_183_ < argument_177_[++argument_178_]) {
			    argument_176_[argument_178_] = argument_179_;
			    argument_177_[argument_178_] = argument_183_;
			}
			argument_183_ += argument_184_;
		    }
		} else if (((Class89) this).anInt646 == 254) {
		    if (argument_181_ != 0
			&& argument_182_ <= ((Class89) this).anInt650 - 1) {
			while (--argument_180_ >= 0) {
			    if (argument_183_ < argument_177_[++argument_178_])
				argument_176_[argument_178_ - 1]
				    = argument_176_[argument_178_];
			    argument_183_ += argument_184_;
			    if (argument_183_ < argument_177_[++argument_178_])
				argument_176_[argument_178_ - 1]
				    = argument_176_[argument_178_];
			    argument_183_ += argument_184_;
			    if (argument_183_ < argument_177_[++argument_178_])
				argument_176_[argument_178_ - 1]
				    = argument_176_[argument_178_];
			    argument_183_ += argument_184_;
			    if (argument_183_ < argument_177_[++argument_178_])
				argument_176_[argument_178_ - 1]
				    = argument_176_[argument_178_];
			    argument_183_ += argument_184_;
			}
			argument_180_ = argument_182_ - argument_181_ & 0x3;
			while (--argument_180_ >= 0) {
			    if (argument_183_ < argument_177_[++argument_178_])
				argument_176_[argument_178_ - 1]
				    = argument_176_[argument_178_];
			    argument_183_ += argument_184_;
			}
		    }
		} else {
		    int anLocalInt = ((Class89) this).anInt646;
		    int anLocalInt_185_ = 256 - ((Class89) this).anInt646;
		    argument_179_
			= (((argument_179_ & 0xff00ff) * anLocalInt_185_ >> 8
			    & 0xff00ff)
			   + ((argument_179_ & 0xff00) * anLocalInt_185_ >> 8
			      & 0xff00));
		    while (--argument_180_ >= 0) {
			if (argument_183_ < argument_177_[++argument_178_]) {
			    int anLocalInt_186_ = argument_176_[argument_178_];
			    argument_176_[argument_178_]
				= (((anLocalInt_185_ | anLocalInt_186_ >> 24)
				    << 24)
				   | (argument_179_
				      + (((anLocalInt_186_ & 0xff00ff)
					  * anLocalInt) >> 8
					 & 0xff00ff)
				      + (((anLocalInt_186_ & 0xff00)
					  * anLocalInt) >> 8
					 & 0xff00)));
			    argument_177_[argument_178_] = argument_183_;
			}
			argument_183_ += argument_184_;
			if (argument_183_ < argument_177_[++argument_178_]) {
			    int anLocalInt_187_ = argument_176_[argument_178_];
			    argument_176_[argument_178_]
				= (((anLocalInt_185_ | anLocalInt_187_ >> 24)
				    << 24)
				   | (argument_179_
				      + (((anLocalInt_187_ & 0xff00ff)
					  * anLocalInt) >> 8
					 & 0xff00ff)
				      + (((anLocalInt_187_ & 0xff00)
					  * anLocalInt) >> 8
					 & 0xff00)));
			    argument_177_[argument_178_] = argument_183_;
			}
			argument_183_ += argument_184_;
			if (argument_183_ < argument_177_[++argument_178_]) {
			    int anLocalInt_188_ = argument_176_[argument_178_];
			    argument_176_[argument_178_]
				= (((anLocalInt_185_ | anLocalInt_188_ >> 24)
				    << 24)
				   | (argument_179_
				      + (((anLocalInt_188_ & 0xff00ff)
					  * anLocalInt) >> 8
					 & 0xff00ff)
				      + (((anLocalInt_188_ & 0xff00)
					  * anLocalInt) >> 8
					 & 0xff00)));
			    argument_177_[argument_178_] = argument_183_;
			}
			argument_183_ += argument_184_;
			if (argument_183_ < argument_177_[++argument_178_]) {
			    int anLocalInt_189_ = argument_176_[argument_178_];
			    argument_176_[argument_178_]
				= (((anLocalInt_185_ | anLocalInt_189_ >> 24)
				    << 24)
				   | (argument_179_
				      + (((anLocalInt_189_ & 0xff00ff)
					  * anLocalInt) >> 8
					 & 0xff00ff)
				      + (((anLocalInt_189_ & 0xff00)
					  * anLocalInt) >> 8
					 & 0xff00)));
			    argument_177_[argument_178_] = argument_183_;
			}
			argument_183_ += argument_184_;
		    }
		    argument_180_ = argument_182_ - argument_181_ & 0x3;
		    while (--argument_180_ >= 0) {
			if (argument_183_ < argument_177_[++argument_178_]) {
			    int anLocalInt_190_ = argument_176_[argument_178_];
			    argument_176_[argument_178_]
				= (((anLocalInt_185_ | anLocalInt_190_ >> 24)
				    << 24)
				   | (argument_179_
				      + (((anLocalInt_190_ & 0xff00ff)
					  * anLocalInt) >> 8
					 & 0xff00ff)
				      + (((anLocalInt_190_ & 0xff00)
					  * anLocalInt) >> 8
					 & 0xff00)));
			    argument_177_[argument_178_] = argument_183_;
			}
			argument_183_ += argument_184_;
		    }
		}
	    } else if (((Class89) this).anInt646 == 0) {
		while (--argument_180_ >= 0) {
		    if (argument_183_ < argument_177_[++argument_178_])
			argument_176_[argument_178_] = argument_179_;
		    argument_183_ += argument_184_;
		    if (argument_183_ < argument_177_[++argument_178_])
			argument_176_[argument_178_] = argument_179_;
		    argument_183_ += argument_184_;
		    if (argument_183_ < argument_177_[++argument_178_])
			argument_176_[argument_178_] = argument_179_;
		    argument_183_ += argument_184_;
		    if (argument_183_ < argument_177_[++argument_178_])
			argument_176_[argument_178_] = argument_179_;
		    argument_183_ += argument_184_;
		}
		argument_180_ = argument_182_ - argument_181_ & 0x3;
		while (--argument_180_ >= 0) {
		    if (argument_183_ < argument_177_[++argument_178_])
			argument_176_[argument_178_] = argument_179_;
		    argument_183_ += argument_184_;
		}
	    } else if (((Class89) this).anInt646 == 254) {
		if (argument_181_ != 0
		    && argument_182_ <= ((Class89) this).anInt650 - 1) {
		    while (--argument_180_ >= 0) {
			if (argument_183_ < argument_177_[++argument_178_])
			    argument_176_[argument_178_ - 1]
				= argument_176_[argument_178_];
			argument_183_ += argument_184_;
			if (argument_183_ < argument_177_[++argument_178_])
			    argument_176_[argument_178_ - 1]
				= argument_176_[argument_178_];
			argument_183_ += argument_184_;
			if (argument_183_ < argument_177_[++argument_178_])
			    argument_176_[argument_178_ - 1]
				= argument_176_[argument_178_];
			argument_183_ += argument_184_;
			if (argument_183_ < argument_177_[++argument_178_])
			    argument_176_[argument_178_ - 1]
				= argument_176_[argument_178_];
			argument_183_ += argument_184_;
		    }
		    argument_180_ = argument_182_ - argument_181_ & 0x3;
		    while (--argument_180_ >= 0) {
			if (argument_183_ < argument_177_[++argument_178_])
			    argument_176_[argument_178_ - 1]
				= argument_176_[argument_178_];
			argument_183_ += argument_184_;
		    }
		}
	    } else {
		int anLocalInt = ((Class89) this).anInt646;
		int anLocalInt_191_ = 256 - ((Class89) this).anInt646;
		argument_179_
		    = (((argument_179_ & 0xff00ff) * anLocalInt_191_ >> 8
			& 0xff00ff)
		       + ((argument_179_ & 0xff00) * anLocalInt_191_ >> 8
			  & 0xff00));
		while (--argument_180_ >= 0) {
		    if (argument_183_ < argument_177_[++argument_178_]) {
			int anLocalInt_192_ = argument_176_[argument_178_];
			argument_176_[argument_178_]
			    = ((anLocalInt_191_ | anLocalInt_192_ >> 24) << 24
			       | (argument_179_
				  + (((anLocalInt_192_ & 0xff00ff) * anLocalInt
				      >> 8)
				     & 0xff00ff)
				  + (((anLocalInt_192_ & 0xff00) * anLocalInt
				      >> 8)
				     & 0xff00)));
		    }
		    argument_183_ += argument_184_;
		    if (argument_183_ < argument_177_[++argument_178_]) {
			int anLocalInt_193_ = argument_176_[argument_178_];
			argument_176_[argument_178_]
			    = ((anLocalInt_191_ | anLocalInt_193_ >> 24) << 24
			       | (argument_179_
				  + (((anLocalInt_193_ & 0xff00ff) * anLocalInt
				      >> 8)
				     & 0xff00ff)
				  + (((anLocalInt_193_ & 0xff00) * anLocalInt
				      >> 8)
				     & 0xff00)));
		    }
		    argument_183_ += argument_184_;
		    if (argument_183_ < argument_177_[++argument_178_]) {
			int anLocalInt_194_ = argument_176_[argument_178_];
			argument_176_[argument_178_]
			    = ((anLocalInt_191_ | anLocalInt_194_ >> 24) << 24
			       | (argument_179_
				  + (((anLocalInt_194_ & 0xff00ff) * anLocalInt
				      >> 8)
				     & 0xff00ff)
				  + (((anLocalInt_194_ & 0xff00) * anLocalInt
				      >> 8)
				     & 0xff00)));
		    }
		    argument_183_ += argument_184_;
		    if (argument_183_ < argument_177_[++argument_178_]) {
			int anLocalInt_195_ = argument_176_[argument_178_];
			argument_176_[argument_178_]
			    = ((anLocalInt_191_ | anLocalInt_195_ >> 24) << 24
			       | (argument_179_
				  + (((anLocalInt_195_ & 0xff00ff) * anLocalInt
				      >> 8)
				     & 0xff00ff)
				  + (((anLocalInt_195_ & 0xff00) * anLocalInt
				      >> 8)
				     & 0xff00)));
		    }
		    argument_183_ += argument_184_;
		}
		argument_180_ = argument_182_ - argument_181_ & 0x3;
		while (--argument_180_ >= 0) {
		    if (argument_183_ < argument_177_[++argument_178_]) {
			int anLocalInt_196_ = argument_176_[argument_178_];
			argument_176_[argument_178_]
			    = ((anLocalInt_191_ | anLocalInt_196_ >> 24) << 24
			       | (argument_179_
				  + (((anLocalInt_196_ & 0xff00ff) * anLocalInt
				      >> 8)
				     & 0xff00ff)
				  + (((anLocalInt_196_ & 0xff00) * anLocalInt
				      >> 8)
				     & 0xff00)));
		    }
		    argument_183_ += argument_184_;
		}
	    }
	}
    }
    
    private final void method1662
	(int[] argument_197_, float[] argument_198_, int argument_199_,
	 int argument_200_, int argument_201_, int argument_202_,
	 int argument_203_, float argument_204_, float argument_205_,
	 float argument_206_, float argument_207_, float argument_208_,
	 float argument_209_, float argument_210_, float argument_211_) {
	if (((Class89) this).aBoolean661) {
	    if (argument_203_ > ((Class89) this).anInt650)
		argument_203_ = ((Class89) this).anInt650;
	    if (argument_202_ < 0)
		argument_202_ = 0;
	}
	if (argument_202_ < argument_203_) {
	    if (aBoolean654) {
		argument_199_ += argument_202_;
		argument_206_ += argument_207_ * (float) argument_202_;
		argument_208_ += argument_209_ * (float) argument_202_;
		argument_210_ += argument_211_ * (float) argument_202_;
		if (((Class89) this).aBoolean647) {
		    argument_201_ = argument_203_ - argument_202_ >> 2;
		    argument_207_ *= 4.0F;
		    argument_209_ *= 4.0F;
		    argument_211_ *= 4.0F;
		    if (((Class89) this).anInt646 == 0) {
			if (argument_201_ > 0) {
			    do {
				argument_200_ = ((int) argument_206_ & 0xff0000
						 | (int) argument_208_ & 0xff00
						 | (int) argument_210_ & 0xff
						 | ~0xffffff);
				argument_206_ += argument_207_;
				argument_208_ += argument_209_;
				argument_210_ += argument_211_;
				argument_197_[argument_199_++] = argument_200_;
				argument_197_[argument_199_++] = argument_200_;
				argument_197_[argument_199_++] = argument_200_;
				argument_197_[argument_199_++] = argument_200_;
			    } while (--argument_201_ > 0);
			}
			argument_201_ = argument_203_ - argument_202_ & 0x3;
			if (argument_201_ > 0) {
			    argument_200_
				= ((int) argument_206_ & 0xff0000
				   | (int) argument_208_ & 0xff00
				   | (int) argument_210_ & 0xff | ~0xffffff);
			    do
				argument_197_[argument_199_++] = argument_200_;
			    while (--argument_201_ > 0);
			}
		    } else if (!((Class89) this).aBoolean659) {
			int anLocalInt = ((Class89) this).anInt646;
			int anLocalInt_212_ = 256 - ((Class89) this).anInt646;
			if (argument_201_ > 0) {
			    do {
				argument_200_ = ((int) argument_206_ & 0xff0000
						 | (int) argument_208_ & 0xff00
						 | (int) argument_210_ & 0xff
						 | ~0xffffff);
				argument_206_ += argument_207_;
				argument_208_ += argument_209_;
				argument_210_ += argument_211_;
				argument_200_ = ((((argument_200_ & 0xff00ff)
						   * anLocalInt_212_) >> 8
						  & 0xff00ff)
						 + (((argument_200_ & 0xff00)
						     * anLocalInt_212_) >> 8
						    & 0xff00));
				int anLocalInt_213_
				    = argument_197_[argument_199_];
				argument_197_[argument_199_++]
				    = ((anLocalInt_212_
					| anLocalInt_213_ >> 24) << 24
				       | (argument_200_
					  + (((anLocalInt_213_ & 0xff00ff)
					      * anLocalInt) >> 8
					     & 0xff00ff)
					  + (((anLocalInt_213_ & 0xff00)
					      * anLocalInt) >> 8
					     & 0xff00)));
				anLocalInt_213_ = argument_197_[argument_199_];
				argument_197_[argument_199_++]
				    = ((anLocalInt_212_
					| anLocalInt_213_ >> 24) << 24
				       | (argument_200_
					  + (((anLocalInt_213_ & 0xff00ff)
					      * anLocalInt) >> 8
					     & 0xff00ff)
					  + (((anLocalInt_213_ & 0xff00)
					      * anLocalInt) >> 8
					     & 0xff00)));
				anLocalInt_213_ = argument_197_[argument_199_];
				argument_197_[argument_199_++]
				    = ((anLocalInt_212_
					| anLocalInt_213_ >> 24) << 24
				       | (argument_200_
					  + (((anLocalInt_213_ & 0xff00ff)
					      * anLocalInt) >> 8
					     & 0xff00ff)
					  + (((anLocalInt_213_ & 0xff00)
					      * anLocalInt) >> 8
					     & 0xff00)));
				anLocalInt_213_ = argument_197_[argument_199_];
				argument_197_[argument_199_++]
				    = ((anLocalInt_212_
					| anLocalInt_213_ >> 24) << 24
				       | (argument_200_
					  + (((anLocalInt_213_ & 0xff00ff)
					      * anLocalInt) >> 8
					     & 0xff00ff)
					  + (((anLocalInt_213_ & 0xff00)
					      * anLocalInt) >> 8
					     & 0xff00)));
			    } while (--argument_201_ > 0);
			}
			argument_201_ = argument_203_ - argument_202_ & 0x3;
			if (argument_201_ > 0) {
			    argument_200_
				= ((int) argument_206_ & 0xff0000
				   | (int) argument_208_ & 0xff00
				   | (int) argument_210_ & 0xff | ~0xffffff);
			    argument_200_ = ((((argument_200_ & 0xff00ff)
					       * anLocalInt_212_) >> 8
					      & 0xff00ff)
					     + (((argument_200_ & 0xff00)
						 * anLocalInt_212_) >> 8
						& 0xff00));
			    do {
				int anLocalInt_214_
				    = argument_197_[argument_199_];
				argument_197_[argument_199_++]
				    = ((anLocalInt_212_
					| anLocalInt_214_ >> 24) << 24
				       | (argument_200_
					  + (((anLocalInt_214_ & 0xff00ff)
					      * anLocalInt) >> 8
					     & 0xff00ff)
					  + (((anLocalInt_214_ & 0xff00)
					      * anLocalInt) >> 8
					     & 0xff00)));
			    } while (--argument_201_ > 0);
			}
		    } else {
			if (argument_201_ > 0) {
			    do {
				argument_200_ = ((int) argument_206_ & 0xff0000
						 | (int) argument_208_ & 0xff00
						 | (int) argument_210_ & 0xff);
				argument_206_ += argument_207_;
				argument_208_ += argument_209_;
				argument_210_ += argument_211_;
				int[] anLocalInts = argument_197_;
				int anLocalInt = argument_199_++;
				int anLocalInt_215_ = argument_200_;
				int anLocalInt_216_ = anLocalInts[anLocalInt];
				int anLocalInt_217_
				    = anLocalInt_215_ + anLocalInt_216_;
				int anLocalInt_218_
				    = ((anLocalInt_215_ & 0xff00ff)
				       + (anLocalInt_216_ & 0xff00ff));
				anLocalInt_216_
				    = ((anLocalInt_218_ & 0x1000100)
				       + (anLocalInt_217_ - anLocalInt_218_
					  & 0x10000));
				anLocalInts[anLocalInt]
				    = (anLocalInt_217_ - anLocalInt_216_
				       | ~0xffffff
				       | anLocalInt_216_ - (anLocalInt_216_
							    >>> 8));
				int[] anLocalInts_219_ = argument_197_;
				int anLocalInt_220_ = argument_199_++;
				int anLocalInt_221_ = argument_200_;
				int anLocalInt_222_
				    = anLocalInts_219_[anLocalInt_220_];
				int anLocalInt_223_
				    = anLocalInt_221_ + anLocalInt_222_;
				int anLocalInt_224_
				    = ((anLocalInt_221_ & 0xff00ff)
				       + (anLocalInt_222_ & 0xff00ff));
				anLocalInt_222_
				    = ((anLocalInt_224_ & 0x1000100)
				       + (anLocalInt_223_ - anLocalInt_224_
					  & 0x10000));
				anLocalInts_219_[anLocalInt_220_]
				    = (anLocalInt_223_ - anLocalInt_222_
				       | ~0xffffff
				       | anLocalInt_222_ - (anLocalInt_222_
							    >>> 8));
				int[] anLocalInts_225_ = argument_197_;
				int anLocalInt_226_ = argument_199_++;
				int anLocalInt_227_ = argument_200_;
				int anLocalInt_228_
				    = anLocalInts_225_[anLocalInt_226_];
				int anLocalInt_229_
				    = anLocalInt_227_ + anLocalInt_228_;
				int anLocalInt_230_
				    = ((anLocalInt_227_ & 0xff00ff)
				       + (anLocalInt_228_ & 0xff00ff));
				anLocalInt_228_
				    = ((anLocalInt_230_ & 0x1000100)
				       + (anLocalInt_229_ - anLocalInt_230_
					  & 0x10000));
				anLocalInts_225_[anLocalInt_226_]
				    = (anLocalInt_229_ - anLocalInt_228_
				       | ~0xffffff
				       | anLocalInt_228_ - (anLocalInt_228_
							    >>> 8));
				int[] anLocalInts_231_ = argument_197_;
				int anLocalInt_232_ = argument_199_++;
				int anLocalInt_233_ = argument_200_;
				int anLocalInt_234_
				    = anLocalInts_231_[anLocalInt_232_];
				int anLocalInt_235_
				    = anLocalInt_233_ + anLocalInt_234_;
				int anLocalInt_236_
				    = ((anLocalInt_233_ & 0xff00ff)
				       + (anLocalInt_234_ & 0xff00ff));
				anLocalInt_234_
				    = ((anLocalInt_236_ & 0x1000100)
				       + (anLocalInt_235_ - anLocalInt_236_
					  & 0x10000));
				anLocalInts_231_[anLocalInt_232_]
				    = (anLocalInt_235_ - anLocalInt_234_
				       | ~0xffffff
				       | anLocalInt_234_ - (anLocalInt_234_
							    >>> 8));
			    } while (--argument_201_ > 0);
			}
			argument_201_ = argument_203_ - argument_202_ & 0x3;
			if (argument_201_ > 0) {
			    argument_200_ = ((int) argument_206_ & 0xff0000
					     | (int) argument_208_ & 0xff00
					     | (int) argument_210_ & 0xff);
			    do {
				int[] anLocalInts = argument_197_;
				int anLocalInt = argument_199_++;
				int anLocalInt_237_ = argument_200_;
				int anLocalInt_238_ = anLocalInts[anLocalInt];
				int anLocalInt_239_
				    = anLocalInt_237_ + anLocalInt_238_;
				int anLocalInt_240_
				    = ((anLocalInt_237_ & 0xff00ff)
				       + (anLocalInt_238_ & 0xff00ff));
				anLocalInt_238_
				    = ((anLocalInt_240_ & 0x1000100)
				       + (anLocalInt_239_ - anLocalInt_240_
					  & 0x10000));
				anLocalInts[anLocalInt]
				    = (anLocalInt_239_ - anLocalInt_238_
				       | ~0xffffff
				       | anLocalInt_238_ - (anLocalInt_238_
							    >>> 8));
			    } while (--argument_201_ > 0);
			}
		    }
		} else {
		    argument_201_ = argument_203_ - argument_202_;
		    if (((Class89) this).anInt646 == 0) {
			do {
			    argument_197_[argument_199_++]
				= ((int) argument_206_ & 0xff0000
				   | (int) argument_208_ & 0xff00
				   | (int) argument_210_ & 0xff | ~0xffffff);
			    argument_206_ += argument_207_;
			    argument_208_ += argument_209_;
			    argument_210_ += argument_211_;
			} while (--argument_201_ > 0);
		    } else if (!((Class89) this).aBoolean659) {
			int anLocalInt = ((Class89) this).anInt646;
			int anLocalInt_241_ = 256 - ((Class89) this).anInt646;
			do {
			    argument_200_
				= ((int) argument_206_ & 0xff0000
				   | (int) argument_208_ & 0xff00
				   | (int) argument_210_ & 0xff | ~0xffffff);
			    argument_206_ += argument_207_;
			    argument_208_ += argument_209_;
			    argument_210_ += argument_211_;
			    argument_200_ = ((((argument_200_ & 0xff00ff)
					       * anLocalInt_241_) >> 8
					      & 0xff00ff)
					     + (((argument_200_ & 0xff00)
						 * anLocalInt_241_) >> 8
						& 0xff00));
			    int anLocalInt_242_ = argument_197_[argument_199_];
			    argument_197_[argument_199_++]
				= (((anLocalInt_241_ | anLocalInt_242_ >> 24)
				    << 24)
				   | (argument_200_
				      + (((anLocalInt_242_ & 0xff00ff)
					  * anLocalInt) >> 8
					 & 0xff00ff)
				      + (((anLocalInt_242_ & 0xff00)
					  * anLocalInt) >> 8
					 & 0xff00)));
			} while (--argument_201_ > 0);
		    } else {
			do {
			    int[] anLocalInts = argument_197_;
			    int anLocalInt = argument_199_++;
			    int anLocalInt_243_
				= ((int) argument_206_ & 0xff0000
				   | (int) argument_208_ & 0xff00
				   | (int) argument_210_ & 0xff);
			    int anLocalInt_244_ = anLocalInts[anLocalInt];
			    int anLocalInt_245_
				= anLocalInt_243_ + anLocalInt_244_;
			    int anLocalInt_246_
				= ((anLocalInt_243_ & 0xff00ff)
				   + (anLocalInt_244_ & 0xff00ff));
			    anLocalInt_244_
				= ((anLocalInt_246_ & 0x1000100)
				   + (anLocalInt_245_ - anLocalInt_246_
				      & 0x10000));
			    anLocalInts[anLocalInt]
				= (anLocalInt_245_ - anLocalInt_244_
				   | ~0xffffff
				   | anLocalInt_244_ - (anLocalInt_244_
							>>> 8));
			    argument_206_ += argument_207_;
			    argument_208_ += argument_209_;
			    argument_210_ += argument_211_;
			} while (--argument_201_ > 0);
		    }
		}
	    } else {
		argument_199_ += argument_202_ - 1;
		argument_204_ += argument_205_ * (float) argument_202_;
		argument_206_ += argument_207_ * (float) argument_202_;
		argument_208_ += argument_209_ * (float) argument_202_;
		argument_210_ += argument_211_ * (float) argument_202_;
		if (((Class293) aClass293_660).aBoolean2415) {
		    if (((Class89) this).aBoolean647) {
			argument_201_ = argument_203_ - argument_202_ >> 2;
			argument_207_ *= 4.0F;
			argument_209_ *= 4.0F;
			argument_211_ *= 4.0F;
			if (((Class89) this).anInt646 == 0) {
			    if (argument_201_ > 0) {
				do {
				    argument_200_
					= ((int) argument_206_ & 0xff0000
					   | (int) argument_208_ & 0xff00
					   | (int) argument_210_ & 0xff
					   | ~0xffffff);
				    argument_206_ += argument_207_;
				    argument_208_ += argument_209_;
				    argument_210_ += argument_211_;
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					argument_197_[argument_199_]
					    = argument_200_;
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					argument_197_[argument_199_]
					    = argument_200_;
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					argument_197_[argument_199_]
					    = argument_200_;
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					argument_197_[argument_199_]
					    = argument_200_;
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				} while (--argument_201_ > 0);
			    }
			    argument_201_
				= argument_203_ - argument_202_ & 0x3;
			    if (argument_201_ > 0) {
				argument_200_ = ((int) argument_206_ & 0xff0000
						 | (int) argument_208_ & 0xff00
						 | (int) argument_210_ & 0xff
						 | ~0xffffff);
				do {
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					argument_197_[argument_199_]
					    = argument_200_;
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				} while (--argument_201_ > 0);
			    }
			} else if (!((Class89) this).aBoolean659) {
			    int anLocalInt = ((Class89) this).anInt646;
			    int anLocalInt_247_
				= 256 - ((Class89) this).anInt646;
			    if (argument_201_ > 0) {
				do {
				    argument_200_
					= ((int) argument_206_ & 0xff0000
					   | (int) argument_208_ & 0xff00
					   | (int) argument_210_ & 0xff
					   | ~0xffffff);
				    argument_206_ += argument_207_;
				    argument_208_ += argument_209_;
				    argument_210_ += argument_211_;
				    argument_200_
					= ((((argument_200_ & 0xff00ff)
					     * anLocalInt_247_) >> 8
					    & 0xff00ff)
					   + (((argument_200_ & 0xff00)
					       * anLocalInt_247_) >> 8
					      & 0xff00));
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					int anLocalInt_248_
					    = argument_197_[argument_199_];
					argument_197_[argument_199_]
					    = ((anLocalInt_247_
						| anLocalInt_248_ >> 24) << 24
					       | (argument_200_
						  + (((anLocalInt_248_
						       & 0xff00ff) * anLocalInt
						      >> 8)
						     & 0xff00ff)
						  + (((anLocalInt_248_
						       & 0xff00) * anLocalInt
						      >> 8)
						     & 0xff00)));
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					int anLocalInt_249_
					    = argument_197_[argument_199_];
					argument_197_[argument_199_]
					    = ((anLocalInt_247_
						| anLocalInt_249_ >> 24) << 24
					       | (argument_200_
						  + (((anLocalInt_249_
						       & 0xff00ff) * anLocalInt
						      >> 8)
						     & 0xff00ff)
						  + (((anLocalInt_249_
						       & 0xff00) * anLocalInt
						      >> 8)
						     & 0xff00)));
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					int anLocalInt_250_
					    = argument_197_[argument_199_];
					argument_197_[argument_199_]
					    = ((anLocalInt_247_
						| anLocalInt_250_ >> 24) << 24
					       | (argument_200_
						  + (((anLocalInt_250_
						       & 0xff00ff) * anLocalInt
						      >> 8)
						     & 0xff00ff)
						  + (((anLocalInt_250_
						       & 0xff00) * anLocalInt
						      >> 8)
						     & 0xff00)));
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					int anLocalInt_251_
					    = argument_197_[argument_199_];
					argument_197_[argument_199_]
					    = ((anLocalInt_247_
						| anLocalInt_251_ >> 24) << 24
					       | (argument_200_
						  + (((anLocalInt_251_
						       & 0xff00ff) * anLocalInt
						      >> 8)
						     & 0xff00ff)
						  + (((anLocalInt_251_
						       & 0xff00) * anLocalInt
						      >> 8)
						     & 0xff00)));
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				} while (--argument_201_ > 0);
			    }
			    argument_201_
				= argument_203_ - argument_202_ & 0x3;
			    if (argument_201_ > 0) {
				argument_200_ = ((int) argument_206_ & 0xff0000
						 | (int) argument_208_ & 0xff00
						 | (int) argument_210_ & 0xff
						 | ~0xffffff);
				argument_200_ = ((((argument_200_ & 0xff00ff)
						   * anLocalInt_247_) >> 8
						  & 0xff00ff)
						 + (((argument_200_ & 0xff00)
						     * anLocalInt_247_) >> 8
						    & 0xff00));
				do {
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					int anLocalInt_252_
					    = argument_197_[argument_199_];
					argument_197_[argument_199_]
					    = ((anLocalInt_247_
						| anLocalInt_252_ >> 24) << 24
					       | (argument_200_
						  + (((anLocalInt_252_
						       & 0xff00ff) * anLocalInt
						      >> 8)
						     & 0xff00ff)
						  + (((anLocalInt_252_
						       & 0xff00) * anLocalInt
						      >> 8)
						     & 0xff00)));
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				} while (--argument_201_ > 0);
			    }
			} else {
			    if (argument_201_ > 0) {
				do {
				    argument_200_
					= ((int) argument_206_ & 0xff0000
					   | (int) argument_208_ & 0xff00
					   | (int) argument_210_ & 0xff);
				    argument_206_ += argument_207_;
				    argument_208_ += argument_209_;
				    argument_210_ += argument_211_;
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					int[] anLocalInts = argument_197_;
					int anLocalInt = argument_199_;
					int anLocalInt_253_ = argument_200_;
					int anLocalInt_254_
					    = anLocalInts[anLocalInt];
					int anLocalInt_255_
					    = (anLocalInt_253_
					       + anLocalInt_254_);
					int anLocalInt_256_
					    = ((anLocalInt_253_ & 0xff00ff)
					       + (anLocalInt_254_ & 0xff00ff));
					anLocalInt_254_
					    = ((anLocalInt_256_ & 0x1000100)
					       + ((anLocalInt_255_
						   - anLocalInt_256_)
						  & 0x10000));
					anLocalInts[anLocalInt]
					    = ((anLocalInt_255_
						- anLocalInt_254_)
					       | ~0xffffff
					       | (anLocalInt_254_
						  - (anLocalInt_254_ >>> 8)));
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					int[] anLocalInts = argument_197_;
					int anLocalInt = argument_199_;
					int anLocalInt_257_ = argument_200_;
					int anLocalInt_258_
					    = anLocalInts[anLocalInt];
					int anLocalInt_259_
					    = (anLocalInt_257_
					       + anLocalInt_258_);
					int anLocalInt_260_
					    = ((anLocalInt_257_ & 0xff00ff)
					       + (anLocalInt_258_ & 0xff00ff));
					anLocalInt_258_
					    = ((anLocalInt_260_ & 0x1000100)
					       + ((anLocalInt_259_
						   - anLocalInt_260_)
						  & 0x10000));
					anLocalInts[anLocalInt]
					    = ((anLocalInt_259_
						- anLocalInt_258_)
					       | ~0xffffff
					       | (anLocalInt_258_
						  - (anLocalInt_258_ >>> 8)));
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					int[] anLocalInts = argument_197_;
					int anLocalInt = argument_199_;
					int anLocalInt_261_ = argument_200_;
					int anLocalInt_262_
					    = anLocalInts[anLocalInt];
					int anLocalInt_263_
					    = (anLocalInt_261_
					       + anLocalInt_262_);
					int anLocalInt_264_
					    = ((anLocalInt_261_ & 0xff00ff)
					       + (anLocalInt_262_ & 0xff00ff));
					anLocalInt_262_
					    = ((anLocalInt_264_ & 0x1000100)
					       + ((anLocalInt_263_
						   - anLocalInt_264_)
						  & 0x10000));
					anLocalInts[anLocalInt]
					    = ((anLocalInt_263_
						- anLocalInt_262_)
					       | ~0xffffff
					       | (anLocalInt_262_
						  - (anLocalInt_262_ >>> 8)));
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					int[] anLocalInts = argument_197_;
					int anLocalInt = argument_199_;
					int anLocalInt_265_ = argument_200_;
					int anLocalInt_266_
					    = anLocalInts[anLocalInt];
					int anLocalInt_267_
					    = (anLocalInt_265_
					       + anLocalInt_266_);
					int anLocalInt_268_
					    = ((anLocalInt_265_ & 0xff00ff)
					       + (anLocalInt_266_ & 0xff00ff));
					anLocalInt_266_
					    = ((anLocalInt_268_ & 0x1000100)
					       + ((anLocalInt_267_
						   - anLocalInt_268_)
						  & 0x10000));
					anLocalInts[anLocalInt]
					    = ((anLocalInt_267_
						- anLocalInt_266_)
					       | ~0xffffff
					       | (anLocalInt_266_
						  - (anLocalInt_266_ >>> 8)));
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				} while (--argument_201_ > 0);
			    }
			    argument_201_
				= argument_203_ - argument_202_ & 0x3;
			    if (argument_201_ > 0) {
				argument_200_ = ((int) argument_206_ & 0xff0000
						 | (int) argument_208_ & 0xff00
						 | (int) argument_210_ & 0xff);
				do {
				    if (argument_204_
					< argument_198_[++argument_199_]) {
					int[] anLocalInts = argument_197_;
					int anLocalInt = argument_199_;
					int anLocalInt_269_ = argument_200_;
					int anLocalInt_270_
					    = anLocalInts[anLocalInt];
					int anLocalInt_271_
					    = (anLocalInt_269_
					       + anLocalInt_270_);
					int anLocalInt_272_
					    = ((anLocalInt_269_ & 0xff00ff)
					       + (anLocalInt_270_ & 0xff00ff));
					anLocalInt_270_
					    = ((anLocalInt_272_ & 0x1000100)
					       + ((anLocalInt_271_
						   - anLocalInt_272_)
						  & 0x10000));
					anLocalInts[anLocalInt]
					    = ((anLocalInt_271_
						- anLocalInt_270_)
					       | ~0xffffff
					       | (anLocalInt_270_
						  - (anLocalInt_270_ >>> 8)));
					argument_198_[argument_199_]
					    = argument_204_;
				    }
				    argument_204_ += argument_205_;
				} while (--argument_201_ > 0);
			    }
			}
		    } else {
			argument_201_ = argument_203_ - argument_202_;
			if (((Class89) this).anInt646 == 0) {
			    do {
				if (argument_204_
				    < argument_198_[++argument_199_]) {
				    argument_197_[argument_199_]
					= ((int) argument_206_ & 0xff0000
					   | (int) argument_208_ & 0xff00
					   | (int) argument_210_ & 0xff
					   | ~0xffffff);
				    argument_198_[argument_199_]
					= argument_204_;
				}
				argument_204_ += argument_205_;
				argument_206_ += argument_207_;
				argument_208_ += argument_209_;
				argument_210_ += argument_211_;
			    } while (--argument_201_ > 0);
			} else if (!((Class89) this).aBoolean659) {
			    int anLocalInt = ((Class89) this).anInt646;
			    int anLocalInt_273_
				= 256 - ((Class89) this).anInt646;
			    do {
				if (argument_204_
				    < argument_198_[++argument_199_]) {
				    argument_200_
					= ((int) argument_206_ & 0xff0000
					   | (int) argument_208_ & 0xff00
					   | (int) argument_210_ & 0xff
					   | ~0xffffff);
				    argument_200_
					= ((((argument_200_ & 0xff00ff)
					     * anLocalInt_273_) >> 8
					    & 0xff00ff)
					   + (((argument_200_ & 0xff00)
					       * anLocalInt_273_) >> 8
					      & 0xff00));
				    int anLocalInt_274_
					= argument_197_[argument_199_];
				    argument_197_[argument_199_]
					= ((anLocalInt_273_
					    | anLocalInt_274_ >> 24) << 24
					   | (argument_200_
					      + (((anLocalInt_274_ & 0xff00ff)
						  * anLocalInt) >> 8
						 & 0xff00ff)
					      + (((anLocalInt_274_ & 0xff00)
						  * anLocalInt) >> 8
						 & 0xff00)));
				    argument_198_[argument_199_]
					= argument_204_;
				}
				argument_204_ += argument_205_;
				argument_206_ += argument_207_;
				argument_208_ += argument_209_;
				argument_210_ += argument_211_;
			    } while (--argument_201_ > 0);
			} else {
			    do {
				if (argument_204_
				    < argument_198_[++argument_199_]) {
				    int[] anLocalInts = argument_197_;
				    int anLocalInt = argument_199_;
				    int anLocalInt_275_
					= ((int) argument_206_ & 0xff0000
					   | (int) argument_208_ & 0xff00
					   | (int) argument_210_ & 0xff);
				    int anLocalInt_276_
					= anLocalInts[anLocalInt];
				    int anLocalInt_277_
					= anLocalInt_275_ + anLocalInt_276_;
				    int anLocalInt_278_
					= ((anLocalInt_275_ & 0xff00ff)
					   + (anLocalInt_276_ & 0xff00ff));
				    anLocalInt_276_
					= ((anLocalInt_278_ & 0x1000100)
					   + (anLocalInt_277_ - anLocalInt_278_
					      & 0x10000));
				    anLocalInts[anLocalInt]
					= (anLocalInt_277_ - anLocalInt_276_
					   | ~0xffffff
					   | anLocalInt_276_ - (anLocalInt_276_
								>>> 8));
				    argument_198_[argument_199_]
					= argument_204_;
				}
				argument_204_ += argument_205_;
				argument_206_ += argument_207_;
				argument_208_ += argument_209_;
				argument_210_ += argument_211_;
			    } while (--argument_201_ > 0);
			}
		    }
		} else if (((Class89) this).aBoolean647) {
		    argument_201_ = argument_203_ - argument_202_ >> 2;
		    argument_207_ *= 4.0F;
		    argument_209_ *= 4.0F;
		    argument_211_ *= 4.0F;
		    if (((Class89) this).anInt646 == 0) {
			if (argument_201_ > 0) {
			    do {
				argument_200_ = ((int) argument_206_ & 0xff0000
						 | (int) argument_208_ & 0xff00
						 | (int) argument_210_ & 0xff
						 | ~0xffffff);
				argument_206_ += argument_207_;
				argument_208_ += argument_209_;
				argument_210_ += argument_211_;
				if (argument_204_
				    < argument_198_[++argument_199_])
				    argument_197_[argument_199_]
					= argument_200_;
				argument_204_ += argument_205_;
				if (argument_204_
				    < argument_198_[++argument_199_])
				    argument_197_[argument_199_]
					= argument_200_;
				argument_204_ += argument_205_;
				if (argument_204_
				    < argument_198_[++argument_199_])
				    argument_197_[argument_199_]
					= argument_200_;
				argument_204_ += argument_205_;
				if (argument_204_
				    < argument_198_[++argument_199_])
				    argument_197_[argument_199_]
					= argument_200_;
				argument_204_ += argument_205_;
			    } while (--argument_201_ > 0);
			}
			argument_201_ = argument_203_ - argument_202_ & 0x3;
			if (argument_201_ > 0) {
			    argument_200_
				= ((int) argument_206_ & 0xff0000
				   | (int) argument_208_ & 0xff00
				   | (int) argument_210_ & 0xff | ~0xffffff);
			    do {
				if (argument_204_
				    < argument_198_[++argument_199_])
				    argument_197_[argument_199_]
					= argument_200_;
				argument_204_ += argument_205_;
			    } while (--argument_201_ > 0);
			}
		    } else if (!((Class89) this).aBoolean659) {
			int anLocalInt = ((Class89) this).anInt646;
			int anLocalInt_279_ = 256 - ((Class89) this).anInt646;
			if (argument_201_ > 0) {
			    do {
				argument_200_ = ((int) argument_206_ & 0xff0000
						 | (int) argument_208_ & 0xff00
						 | (int) argument_210_ & 0xff
						 | ~0xffffff);
				argument_206_ += argument_207_;
				argument_208_ += argument_209_;
				argument_210_ += argument_211_;
				argument_200_ = ((((argument_200_ & 0xff00ff)
						   * anLocalInt_279_) >> 8
						  & 0xff00ff)
						 + (((argument_200_ & 0xff00)
						     * anLocalInt_279_) >> 8
						    & 0xff00));
				if (argument_204_
				    < argument_198_[++argument_199_]) {
				    int anLocalInt_280_
					= argument_197_[argument_199_];
				    argument_197_[argument_199_]
					= ((anLocalInt_279_
					    | anLocalInt_280_ >> 24) << 24
					   | (argument_200_
					      + (((anLocalInt_280_ & 0xff00ff)
						  * anLocalInt) >> 8
						 & 0xff00ff)
					      + (((anLocalInt_280_ & 0xff00)
						  * anLocalInt) >> 8
						 & 0xff00)));
				}
				argument_204_ += argument_205_;
				if (argument_204_
				    < argument_198_[++argument_199_]) {
				    int anLocalInt_281_
					= argument_197_[argument_199_];
				    argument_197_[argument_199_]
					= ((anLocalInt_279_
					    | anLocalInt_281_ >> 24) << 24
					   | (argument_200_
					      + (((anLocalInt_281_ & 0xff00ff)
						  * anLocalInt) >> 8
						 & 0xff00ff)
					      + (((anLocalInt_281_ & 0xff00)
						  * anLocalInt) >> 8
						 & 0xff00)));
				}
				argument_204_ += argument_205_;
				if (argument_204_
				    < argument_198_[++argument_199_]) {
				    int anLocalInt_282_
					= argument_197_[argument_199_];
				    argument_197_[argument_199_]
					= ((anLocalInt_279_
					    | anLocalInt_282_ >> 24) << 24
					   | (argument_200_
					      + (((anLocalInt_282_ & 0xff00ff)
						  * anLocalInt) >> 8
						 & 0xff00ff)
					      + (((anLocalInt_282_ & 0xff00)
						  * anLocalInt) >> 8
						 & 0xff00)));
				}
				argument_204_ += argument_205_;
				if (argument_204_
				    < argument_198_[++argument_199_]) {
				    int anLocalInt_283_
					= argument_197_[argument_199_];
				    argument_197_[argument_199_]
					= ((anLocalInt_279_
					    | anLocalInt_283_ >> 24) << 24
					   | (argument_200_
					      + (((anLocalInt_283_ & 0xff00ff)
						  * anLocalInt) >> 8
						 & 0xff00ff)
					      + (((anLocalInt_283_ & 0xff00)
						  * anLocalInt) >> 8
						 & 0xff00)));
				}
				argument_204_ += argument_205_;
			    } while (--argument_201_ > 0);
			}
			argument_201_ = argument_203_ - argument_202_ & 0x3;
			if (argument_201_ > 0) {
			    argument_200_
				= ((int) argument_206_ & 0xff0000
				   | (int) argument_208_ & 0xff00
				   | (int) argument_210_ & 0xff | ~0xffffff);
			    argument_200_ = ((((argument_200_ & 0xff00ff)
					       * anLocalInt_279_) >> 8
					      & 0xff00ff)
					     + (((argument_200_ & 0xff00)
						 * anLocalInt_279_) >> 8
						& 0xff00));
			    do {
				if (argument_204_
				    < argument_198_[++argument_199_]) {
				    int anLocalInt_284_
					= argument_197_[argument_199_];
				    argument_197_[argument_199_]
					= ((anLocalInt_279_
					    | anLocalInt_284_ >> 24) << 24
					   | (argument_200_
					      + (((anLocalInt_284_ & 0xff00ff)
						  * anLocalInt) >> 8
						 & 0xff00ff)
					      + (((anLocalInt_284_ & 0xff00)
						  * anLocalInt) >> 8
						 & 0xff00)));
				}
				argument_204_ += argument_205_;
			    } while (--argument_201_ > 0);
			}
		    } else {
			if (argument_201_ > 0) {
			    do {
				argument_200_ = ((int) argument_206_ & 0xff0000
						 | (int) argument_208_ & 0xff00
						 | (int) argument_210_ & 0xff);
				argument_206_ += argument_207_;
				argument_208_ += argument_209_;
				argument_210_ += argument_211_;
				if (argument_204_
				    < argument_198_[++argument_199_]) {
				    int[] anLocalInts = argument_197_;
				    int anLocalInt = argument_199_;
				    int anLocalInt_285_ = argument_200_;
				    int anLocalInt_286_
					= anLocalInts[anLocalInt];
				    int anLocalInt_287_
					= anLocalInt_285_ + anLocalInt_286_;
				    int anLocalInt_288_
					= ((anLocalInt_285_ & 0xff00ff)
					   + (anLocalInt_286_ & 0xff00ff));
				    anLocalInt_286_
					= ((anLocalInt_288_ & 0x1000100)
					   + (anLocalInt_287_ - anLocalInt_288_
					      & 0x10000));
				    anLocalInts[anLocalInt]
					= (anLocalInt_287_ - anLocalInt_286_
					   | ~0xffffff
					   | anLocalInt_286_ - (anLocalInt_286_
								>>> 8));
				}
				argument_204_ += argument_205_;
				if (argument_204_
				    < argument_198_[++argument_199_]) {
				    int[] anLocalInts = argument_197_;
				    int anLocalInt = argument_199_;
				    int anLocalInt_289_ = argument_200_;
				    int anLocalInt_290_
					= anLocalInts[anLocalInt];
				    int anLocalInt_291_
					= anLocalInt_289_ + anLocalInt_290_;
				    int anLocalInt_292_
					= ((anLocalInt_289_ & 0xff00ff)
					   + (anLocalInt_290_ & 0xff00ff));
				    anLocalInt_290_
					= ((anLocalInt_292_ & 0x1000100)
					   + (anLocalInt_291_ - anLocalInt_292_
					      & 0x10000));
				    anLocalInts[anLocalInt]
					= (anLocalInt_291_ - anLocalInt_290_
					   | ~0xffffff
					   | anLocalInt_290_ - (anLocalInt_290_
								>>> 8));
				}
				argument_204_ += argument_205_;
				if (argument_204_
				    < argument_198_[++argument_199_]) {
				    int[] anLocalInts = argument_197_;
				    int anLocalInt = argument_199_;
				    int anLocalInt_293_ = argument_200_;
				    int anLocalInt_294_
					= anLocalInts[anLocalInt];
				    int anLocalInt_295_
					= anLocalInt_293_ + anLocalInt_294_;
				    int anLocalInt_296_
					= ((anLocalInt_293_ & 0xff00ff)
					   + (anLocalInt_294_ & 0xff00ff));
				    anLocalInt_294_
					= ((anLocalInt_296_ & 0x1000100)
					   + (anLocalInt_295_ - anLocalInt_296_
					      & 0x10000));
				    anLocalInts[anLocalInt]
					= (anLocalInt_295_ - anLocalInt_294_
					   | ~0xffffff
					   | anLocalInt_294_ - (anLocalInt_294_
								>>> 8));
				}
				argument_204_ += argument_205_;
				if (argument_204_
				    < argument_198_[++argument_199_]) {
				    int[] anLocalInts = argument_197_;
				    int anLocalInt = argument_199_;
				    int anLocalInt_297_ = argument_200_;
				    int anLocalInt_298_
					= anLocalInts[anLocalInt];
				    int anLocalInt_299_
					= anLocalInt_297_ + anLocalInt_298_;
				    int anLocalInt_300_
					= ((anLocalInt_297_ & 0xff00ff)
					   + (anLocalInt_298_ & 0xff00ff));
				    anLocalInt_298_
					= ((anLocalInt_300_ & 0x1000100)
					   + (anLocalInt_299_ - anLocalInt_300_
					      & 0x10000));
				    anLocalInts[anLocalInt]
					= (anLocalInt_299_ - anLocalInt_298_
					   | ~0xffffff
					   | anLocalInt_298_ - (anLocalInt_298_
								>>> 8));
				}
				argument_204_ += argument_205_;
			    } while (--argument_201_ > 0);
			}
			argument_201_ = argument_203_ - argument_202_ & 0x3;
			if (argument_201_ > 0) {
			    argument_200_ = ((int) argument_206_ & 0xff0000
					     | (int) argument_208_ & 0xff00
					     | (int) argument_210_ & 0xff);
			    do {
				if (argument_204_
				    < argument_198_[++argument_199_]) {
				    int[] anLocalInts = argument_197_;
				    int anLocalInt = argument_199_;
				    int anLocalInt_301_ = argument_200_;
				    int anLocalInt_302_
					= anLocalInts[anLocalInt];
				    int anLocalInt_303_
					= anLocalInt_301_ + anLocalInt_302_;
				    int anLocalInt_304_
					= ((anLocalInt_301_ & 0xff00ff)
					   + (anLocalInt_302_ & 0xff00ff));
				    anLocalInt_302_
					= ((anLocalInt_304_ & 0x1000100)
					   + (anLocalInt_303_ - anLocalInt_304_
					      & 0x10000));
				    anLocalInts[anLocalInt]
					= (anLocalInt_303_ - anLocalInt_302_
					   | ~0xffffff
					   | anLocalInt_302_ - (anLocalInt_302_
								>>> 8));
				}
				argument_204_ += argument_205_;
			    } while (--argument_201_ > 0);
			}
		    }
		} else {
		    argument_201_ = argument_203_ - argument_202_;
		    if (((Class89) this).anInt646 == 0) {
			do {
			    if (argument_204_ < argument_198_[++argument_199_])
				argument_197_[argument_199_]
				    = ((int) argument_206_ & 0xff0000
				       | (int) argument_208_ & 0xff00
				       | (int) argument_210_ & 0xff
				       | ~0xffffff);
			    argument_204_ += argument_205_;
			    argument_206_ += argument_207_;
			    argument_208_ += argument_209_;
			    argument_210_ += argument_211_;
			} while (--argument_201_ > 0);
		    } else if (!((Class89) this).aBoolean659) {
			int anLocalInt = ((Class89) this).anInt646;
			int anLocalInt_305_ = 256 - ((Class89) this).anInt646;
			do {
			    if (argument_204_
				< argument_198_[++argument_199_]) {
				argument_200_ = ((int) argument_206_ & 0xff0000
						 | (int) argument_208_ & 0xff00
						 | (int) argument_210_ & 0xff
						 | ~0xffffff);
				argument_200_ = ((((argument_200_ & 0xff00ff)
						   * anLocalInt_305_) >> 8
						  & 0xff00ff)
						 + (((argument_200_ & 0xff00)
						     * anLocalInt_305_) >> 8
						    & 0xff00));
				int anLocalInt_306_
				    = argument_197_[argument_199_];
				argument_197_[argument_199_]
				    = ((anLocalInt_305_
					| anLocalInt_306_ >> 24) << 24
				       | (argument_200_
					  + (((anLocalInt_306_ & 0xff00ff)
					      * anLocalInt) >> 8
					     & 0xff00ff)
					  + (((anLocalInt_306_ & 0xff00)
					      * anLocalInt) >> 8
					     & 0xff00)));
			    }
			    argument_204_ += argument_205_;
			    argument_206_ += argument_207_;
			    argument_208_ += argument_209_;
			    argument_210_ += argument_211_;
			} while (--argument_201_ > 0);
		    } else {
			do {
			    if (argument_204_
				< argument_198_[++argument_199_]) {
				int[] anLocalInts = argument_197_;
				int anLocalInt = argument_199_;
				int anLocalInt_307_
				    = ((int) argument_206_ & 0xff0000
				       | (int) argument_208_ & 0xff00
				       | (int) argument_210_ & 0xff);
				int anLocalInt_308_ = anLocalInts[anLocalInt];
				int anLocalInt_309_
				    = anLocalInt_307_ + anLocalInt_308_;
				int anLocalInt_310_
				    = ((anLocalInt_307_ & 0xff00ff)
				       + (anLocalInt_308_ & 0xff00ff));
				anLocalInt_308_
				    = ((anLocalInt_310_ & 0x1000100)
				       + (anLocalInt_309_ - anLocalInt_310_
					  & 0x10000));
				anLocalInts[anLocalInt]
				    = (anLocalInt_309_ - anLocalInt_308_
				       | ~0xffffff
				       | anLocalInt_308_ - (anLocalInt_308_
							    >>> 8));
			    }
			    argument_204_ += argument_205_;
			    argument_206_ += argument_207_;
			    argument_208_ += argument_209_;
			    argument_210_ += argument_211_;
			} while (--argument_201_ > 0);
		    }
		}
	    }
	}
    }
    
    final void method1663
	(float argument_311_, float argument_312_, float argument_313_,
	 float argument_314_, float argument_315_, float argument_316_,
	 float argument_317_, float argument_318_, float argument_319_,
	 float argument_320_, float argument_321_, float argument_322_) {
	if (aBoolean649) {
	    aClass_ha__651.method2035((HslToRgb.table2
					   [(int) argument_320_]),
					  (byte) -120, (int) argument_311_,
					  (int) argument_315_,
					  (int) argument_312_,
					  (int) argument_314_);
	    aClass_ha__651.method2035((HslToRgb.table2
					   [(int) argument_320_]),
					  (byte) -104, (int) argument_312_,
					  (int) argument_316_,
					  (int) argument_313_,
					  (int) argument_315_);
	    aClass_ha__651.method2035((HslToRgb.table2
					   [(int) argument_320_]),
					  (byte) -124, (int) argument_313_,
					  (int) argument_314_,
					  (int) argument_311_,
					  (int) argument_316_);
	} else {
	    float f = argument_315_ - argument_314_;
	    float f_323_ = argument_312_ - argument_311_;
	    float f_324_ = argument_316_ - argument_314_;
	    float f_325_ = argument_313_ - argument_311_;
	    float f_326_ = argument_321_ - argument_320_;
	    float f_327_ = argument_322_ - argument_320_;
	    float f_328_ = argument_318_ - argument_317_;
	    float f_329_ = argument_319_ - argument_317_;
	    float f_330_;
	    if (argument_313_ != argument_312_)
		f_330_ = (argument_316_ - argument_315_) / (argument_313_
							    - argument_312_);
	    else
		f_330_ = 0.0F;
	    float f_331_;
	    if (argument_312_ != argument_311_)
		f_331_ = f / f_323_;
	    else
		f_331_ = 0.0F;
	    float f_332_;
	    if (argument_313_ != argument_311_)
		f_332_ = f_324_ / f_325_;
	    else
		f_332_ = 0.0F;
	    float f_333_ = f * f_325_ - f_324_ * f_323_;
	    if (f_333_ != 0.0F) {
		float f_334_ = (f_326_ * f_325_ - f_327_ * f_323_) / f_333_;
		float f_335_ = (f_327_ * f - f_326_ * f_324_) / f_333_;
		float f_336_ = (f_328_ * f_325_ - f_329_ * f_323_) / f_333_;
		float f_337_ = (f_329_ * f - f_328_ * f_324_) / f_333_;
		if (argument_311_ <= argument_312_
		    && argument_311_ <= argument_313_) {
		    if (!(argument_311_
			  >= (float) ((Class89) this).anInt653)) {
			if (argument_312_ > (float) ((Class89) this).anInt653)
			    argument_312_ = (float) ((Class89) this).anInt653;
			if (argument_313_ > (float) ((Class89) this).anInt653)
			    argument_313_ = (float) ((Class89) this).anInt653;
			argument_320_
			    = argument_320_ - f_334_ * argument_314_ + f_334_;
			argument_317_
			    = argument_317_ - f_336_ * argument_314_ + f_336_;
			if (argument_312_ < argument_313_) {
			    argument_316_ = argument_314_;
			    if (argument_311_ < 0.0F) {
				argument_316_ -= f_332_ * argument_311_;
				argument_314_ -= f_331_ * argument_311_;
				argument_320_ -= f_335_ * argument_311_;
				argument_317_ -= f_337_ * argument_311_;
				argument_311_ = 0.0F;
			    }
			    if (argument_312_ < 0.0F) {
				argument_315_ -= f_330_ * argument_312_;
				argument_312_ = 0.0F;
			    }
			    if ((argument_311_ != argument_312_
				 && f_332_ < f_331_)
				|| (argument_311_ == argument_312_
				    && f_332_ > f_330_)) {
				argument_313_ -= argument_312_;
				argument_312_ -= argument_311_;
				argument_311_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_311_]);
				while (--argument_312_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_311_, 0, 0,
					       (int) argument_316_,
					       (int) argument_314_,
					       argument_320_, f_334_,
					       argument_317_, f_336_);
				    argument_316_ += f_332_;
				    argument_314_ += f_331_;
				    argument_320_ += f_335_;
				    argument_317_ += f_337_;
				    argument_311_ += (float) anInt652;
				}
				while (--argument_313_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_311_, 0, 0,
					       (int) argument_316_,
					       (int) argument_315_,
					       argument_320_, f_334_,
					       argument_317_, f_336_);
				    argument_316_ += f_332_;
				    argument_315_ += f_330_;
				    argument_320_ += f_335_;
				    argument_317_ += f_337_;
				    argument_311_ += (float) anInt652;
				}
			    } else {
				argument_313_ -= argument_312_;
				argument_312_ -= argument_311_;
				argument_311_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_311_]);
				while (--argument_312_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_311_, 0, 0,
					       (int) argument_314_,
					       (int) argument_316_,
					       argument_320_, f_334_,
					       argument_317_, f_336_);
				    argument_316_ += f_332_;
				    argument_314_ += f_331_;
				    argument_320_ += f_335_;
				    argument_317_ += f_337_;
				    argument_311_ += (float) anInt652;
				}
				while (--argument_313_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_311_, 0, 0,
					       (int) argument_315_,
					       (int) argument_316_,
					       argument_320_, f_334_,
					       argument_317_, f_336_);
				    argument_316_ += f_332_;
				    argument_315_ += f_330_;
				    argument_320_ += f_335_;
				    argument_317_ += f_337_;
				    argument_311_ += (float) anInt652;
				}
			    }
			} else {
			    argument_315_ = argument_314_;
			    if (argument_311_ < 0.0F) {
				argument_315_ -= f_332_ * argument_311_;
				argument_314_ -= f_331_ * argument_311_;
				argument_320_ -= f_335_ * argument_311_;
				argument_317_ -= f_337_ * argument_311_;
				argument_311_ = 0.0F;
			    }
			    if (argument_313_ < 0.0F) {
				argument_316_ -= f_330_ * argument_313_;
				argument_313_ = 0.0F;
			    }
			    if ((argument_311_ != argument_313_
				 && f_332_ < f_331_)
				|| (argument_311_ == argument_313_
				    && f_330_ > f_331_)) {
				argument_312_ -= argument_313_;
				argument_313_ -= argument_311_;
				argument_311_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_311_]);
				while (--argument_313_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_311_, 0, 0,
					       (int) argument_315_,
					       (int) argument_314_,
					       argument_320_, f_334_,
					       argument_317_, f_336_);
				    argument_315_ += f_332_;
				    argument_314_ += f_331_;
				    argument_320_ += f_335_;
				    argument_317_ += f_337_;
				    argument_311_ += (float) anInt652;
				}
				while (--argument_312_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_311_, 0, 0,
					       (int) argument_316_,
					       (int) argument_314_,
					       argument_320_, f_334_,
					       argument_317_, f_336_);
				    argument_316_ += f_330_;
				    argument_314_ += f_331_;
				    argument_320_ += f_335_;
				    argument_317_ += f_337_;
				    argument_311_ += (float) anInt652;
				}
			    } else {
				argument_312_ -= argument_313_;
				argument_313_ -= argument_311_;
				argument_311_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_311_]);
				while (--argument_313_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_311_, 0, 0,
					       (int) argument_314_,
					       (int) argument_315_,
					       argument_320_, f_334_,
					       argument_317_, f_336_);
				    argument_315_ += f_332_;
				    argument_314_ += f_331_;
				    argument_320_ += f_335_;
				    argument_317_ += f_337_;
				    argument_311_ += (float) anInt652;
				}
				while (--argument_312_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_311_, 0, 0,
					       (int) argument_314_,
					       (int) argument_316_,
					       argument_320_, f_334_,
					       argument_317_, f_336_);
				    argument_316_ += f_330_;
				    argument_314_ += f_331_;
				    argument_320_ += f_335_;
				    argument_317_ += f_337_;
				    argument_311_ += (float) anInt652;
				}
			    }
			}
		    }
		} else if (argument_312_ <= argument_313_) {
		    if (!(argument_312_
			  >= (float) ((Class89) this).anInt653)) {
			if (argument_313_ > (float) ((Class89) this).anInt653)
			    argument_313_ = (float) ((Class89) this).anInt653;
			if (argument_311_ > (float) ((Class89) this).anInt653)
			    argument_311_ = (float) ((Class89) this).anInt653;
			argument_321_
			    = argument_321_ - f_334_ * argument_315_ + f_334_;
			argument_318_
			    = argument_318_ - f_336_ * argument_315_ + f_336_;
			if (argument_313_ < argument_311_) {
			    argument_314_ = argument_315_;
			    if (argument_312_ < 0.0F) {
				argument_314_ -= f_331_ * argument_312_;
				argument_315_ -= f_330_ * argument_312_;
				argument_321_ -= f_335_ * argument_312_;
				argument_318_ -= f_337_ * argument_312_;
				argument_312_ = 0.0F;
			    }
			    if (argument_313_ < 0.0F) {
				argument_316_ -= f_332_ * argument_313_;
				argument_313_ = 0.0F;
			    }
			    if ((argument_312_ != argument_313_
				 && f_331_ < f_330_)
				|| (argument_312_ == argument_313_
				    && f_331_ > f_332_)) {
				argument_311_ -= argument_313_;
				argument_313_ -= argument_312_;
				argument_312_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_312_]);
				while (--argument_313_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_312_, 0, 0,
					       (int) argument_314_,
					       (int) argument_315_,
					       argument_321_, f_334_,
					       argument_318_, f_336_);
				    argument_314_ += f_331_;
				    argument_315_ += f_330_;
				    argument_321_ += f_335_;
				    argument_318_ += f_337_;
				    argument_312_ += (float) anInt652;
				}
				while (--argument_311_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_312_, 0, 0,
					       (int) argument_314_,
					       (int) argument_316_,
					       argument_321_, f_334_,
					       argument_318_, f_336_);
				    argument_314_ += f_331_;
				    argument_316_ += f_332_;
				    argument_321_ += f_335_;
				    argument_318_ += f_337_;
				    argument_312_ += (float) anInt652;
				}
			    } else {
				argument_311_ -= argument_313_;
				argument_313_ -= argument_312_;
				argument_312_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_312_]);
				while (--argument_313_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_312_, 0, 0,
					       (int) argument_315_,
					       (int) argument_314_,
					       argument_321_, f_334_,
					       argument_318_, f_336_);
				    argument_314_ += f_331_;
				    argument_315_ += f_330_;
				    argument_321_ += f_335_;
				    argument_318_ += f_337_;
				    argument_312_ += (float) anInt652;
				}
				while (--argument_311_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_312_, 0, 0,
					       (int) argument_316_,
					       (int) argument_314_,
					       argument_321_, f_334_,
					       argument_318_, f_336_);
				    argument_314_ += f_331_;
				    argument_316_ += f_332_;
				    argument_321_ += f_335_;
				    argument_318_ += f_337_;
				    argument_312_ += (float) anInt652;
				}
			    }
			} else {
			    argument_316_ = argument_315_;
			    if (argument_312_ < 0.0F) {
				argument_316_ -= f_331_ * argument_312_;
				argument_315_ -= f_330_ * argument_312_;
				argument_321_ -= f_335_ * argument_312_;
				argument_318_ -= f_337_ * argument_312_;
				argument_312_ = 0.0F;
			    }
			    if (argument_311_ < 0.0F) {
				argument_314_ -= f_332_ * argument_311_;
				argument_311_ = 0.0F;
			    }
			    if (f_331_ < f_330_) {
				argument_313_ -= argument_311_;
				argument_311_ -= argument_312_;
				argument_312_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_312_]);
				while (--argument_311_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_312_, 0, 0,
					       (int) argument_316_,
					       (int) argument_315_,
					       argument_321_, f_334_,
					       argument_318_, f_336_);
				    argument_316_ += f_331_;
				    argument_315_ += f_330_;
				    argument_321_ += f_335_;
				    argument_318_ += f_337_;
				    argument_312_ += (float) anInt652;
				}
				while (--argument_313_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_312_, 0, 0,
					       (int) argument_314_,
					       (int) argument_315_,
					       argument_321_, f_334_,
					       argument_318_, f_336_);
				    argument_314_ += f_332_;
				    argument_315_ += f_330_;
				    argument_321_ += f_335_;
				    argument_318_ += f_337_;
				    argument_312_ += (float) anInt652;
				}
			    } else {
				argument_313_ -= argument_311_;
				argument_311_ -= argument_312_;
				argument_312_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_312_]);
				while (--argument_311_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_312_, 0, 0,
					       (int) argument_315_,
					       (int) argument_316_,
					       argument_321_, f_334_,
					       argument_318_, f_336_);
				    argument_316_ += f_331_;
				    argument_315_ += f_330_;
				    argument_321_ += f_335_;
				    argument_318_ += f_337_;
				    argument_312_ += (float) anInt652;
				}
				while (--argument_313_ >= 0.0F) {
				    method1655(anIntArray657, aFloatArray656,
					       (int) argument_312_, 0, 0,
					       (int) argument_315_,
					       (int) argument_314_,
					       argument_321_, f_334_,
					       argument_318_, f_336_);
				    argument_314_ += f_332_;
				    argument_315_ += f_330_;
				    argument_321_ += f_335_;
				    argument_318_ += f_337_;
				    argument_312_ += (float) anInt652;
				}
			    }
			}
		    }
		} else if (!(argument_313_
			     >= (float) ((Class89) this).anInt653)) {
		    if (argument_311_ > (float) ((Class89) this).anInt653)
			argument_311_ = (float) ((Class89) this).anInt653;
		    if (argument_312_ > (float) ((Class89) this).anInt653)
			argument_312_ = (float) ((Class89) this).anInt653;
		    argument_322_
			= argument_322_ - f_334_ * argument_316_ + f_334_;
		    argument_319_
			= argument_319_ - f_336_ * argument_316_ + f_336_;
		    if (argument_311_ < argument_312_) {
			argument_315_ = argument_316_;
			if (argument_313_ < 0.0F) {
			    argument_315_ -= f_330_ * argument_313_;
			    argument_316_ -= f_332_ * argument_313_;
			    argument_322_ -= f_335_ * argument_313_;
			    argument_319_ -= f_337_ * argument_313_;
			    argument_313_ = 0.0F;
			}
			if (argument_311_ < 0.0F) {
			    argument_314_ -= f_331_ * argument_311_;
			    argument_311_ = 0.0F;
			}
			if (f_330_ < f_332_) {
			    argument_312_ -= argument_311_;
			    argument_311_ -= argument_313_;
			    argument_313_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_313_]);
			    while (--argument_311_ >= 0.0F) {
				method1655(anIntArray657, aFloatArray656,
					   (int) argument_313_, 0, 0,
					   (int) argument_315_,
					   (int) argument_316_, argument_322_,
					   f_334_, argument_319_, f_336_);
				argument_315_ += f_330_;
				argument_316_ += f_332_;
				argument_322_ += f_335_;
				argument_319_ += f_337_;
				argument_313_ += (float) anInt652;
			    }
			    while (--argument_312_ >= 0.0F) {
				method1655(anIntArray657, aFloatArray656,
					   (int) argument_313_, 0, 0,
					   (int) argument_315_,
					   (int) argument_314_, argument_322_,
					   f_334_, argument_319_, f_336_);
				argument_315_ += f_330_;
				argument_314_ += f_331_;
				argument_322_ += f_335_;
				argument_319_ += f_337_;
				argument_313_ += (float) anInt652;
			    }
			} else {
			    argument_312_ -= argument_311_;
			    argument_311_ -= argument_313_;
			    argument_313_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_313_]);
			    while (--argument_311_ >= 0.0F) {
				method1655(anIntArray657, aFloatArray656,
					   (int) argument_313_, 0, 0,
					   (int) argument_316_,
					   (int) argument_315_, argument_322_,
					   f_334_, argument_319_, f_336_);
				argument_315_ += f_330_;
				argument_316_ += f_332_;
				argument_322_ += f_335_;
				argument_319_ += f_337_;
				argument_313_ += (float) anInt652;
			    }
			    while (--argument_312_ >= 0.0F) {
				method1655(anIntArray657, aFloatArray656,
					   (int) argument_313_, 0, 0,
					   (int) argument_314_,
					   (int) argument_315_, argument_322_,
					   f_334_, argument_319_, f_336_);
				argument_315_ += f_330_;
				argument_314_ += f_331_;
				argument_322_ += f_335_;
				argument_319_ += f_337_;
				argument_313_ += (float) anInt652;
			    }
			}
		    } else {
			argument_314_ = argument_316_;
			if (argument_313_ < 0.0F) {
			    argument_314_ -= f_330_ * argument_313_;
			    argument_316_ -= f_332_ * argument_313_;
			    argument_322_ -= f_335_ * argument_313_;
			    argument_319_ -= f_337_ * argument_313_;
			    argument_313_ = 0.0F;
			}
			if (argument_312_ < 0.0F) {
			    argument_315_ -= f_331_ * argument_312_;
			    argument_312_ = 0.0F;
			}
			if (f_330_ < f_332_) {
			    argument_311_ -= argument_312_;
			    argument_312_ -= argument_313_;
			    argument_313_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_313_]);
			    while (--argument_312_ >= 0.0F) {
				method1655(anIntArray657, aFloatArray656,
					   (int) argument_313_, 0, 0,
					   (int) argument_314_,
					   (int) argument_316_, argument_322_,
					   f_334_, argument_319_, f_336_);
				argument_314_ += f_330_;
				argument_316_ += f_332_;
				argument_322_ += f_335_;
				argument_319_ += f_337_;
				argument_313_ += (float) anInt652;
			    }
			    while (--argument_311_ >= 0.0F) {
				method1655(anIntArray657, aFloatArray656,
					   (int) argument_313_, 0, 0,
					   (int) argument_315_,
					   (int) argument_316_, argument_322_,
					   f_334_, argument_319_, f_336_);
				argument_315_ += f_331_;
				argument_316_ += f_332_;
				argument_322_ += f_335_;
				argument_319_ += f_337_;
				argument_313_ += (float) anInt652;
			    }
			} else {
			    argument_311_ -= argument_312_;
			    argument_312_ -= argument_313_;
			    argument_313_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_313_]);
			    while (--argument_312_ >= 0.0F) {
				method1655(anIntArray657, aFloatArray656,
					   (int) argument_313_, 0, 0,
					   (int) argument_316_,
					   (int) argument_314_, argument_322_,
					   f_334_, argument_319_, f_336_);
				argument_314_ += f_330_;
				argument_316_ += f_332_;
				argument_322_ += f_335_;
				argument_319_ += f_337_;
				argument_313_ += (float) anInt652;
			    }
			    while (--argument_311_ >= 0.0F) {
				method1655(anIntArray657, aFloatArray656,
					   (int) argument_313_, 0, 0,
					   (int) argument_316_,
					   (int) argument_315_, argument_322_,
					   f_334_, argument_319_, f_336_);
				argument_315_ += f_331_;
				argument_316_ += f_332_;
				argument_322_ += f_335_;
				argument_319_ += f_337_;
				argument_313_ += (float) anInt652;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method1664
	(float argument_338_, float argument_339_, float argument_340_,
	 float argument_341_, float argument_342_, float argument_343_,
	 float argument_344_, float argument_345_, float argument_346_,
	 float argument_347_, float argument_348_, float argument_349_,
	 float argument_350_, float argument_351_, float argument_352_,
	 int argument_353_, int argument_354_, int argument_355_,
	 int argument_356_, int argument_357_, int argument_358_,
	 int argument_359_, int argument_360_) {
	if (argument_360_ != anInt662) {
	    anIntArray676 = aClass_ha__651.method2108(argument_360_);
	    if (anIntArray676 == null) {
		method1670
		    ((float) (int) argument_338_, (float) (int) argument_339_,
		     (float) (int) argument_340_, (float) (int) argument_341_,
		     (float) (int) argument_342_, (float) (int) argument_343_,
		     (float) (int) argument_344_, (float) (int) argument_345_,
		     (float) (int) argument_346_,
		     Statics.method2255((argument_356_ | argument_357_ << 24), argument_353_),
		     Statics.method2255((argument_356_ | argument_358_ << 24), argument_354_),
		     Statics.method2255((argument_356_ | argument_359_ << 24), argument_355_));
		return;
	    }
	    anInt663 = (aClass_ha__651.method2111(argument_360_) ? 64
			: ((JavaToolkit) aClass_ha__651).anInt4655);
	    anInt666 = anInt663 - 1;
	    anInt675 = aClass_ha__651.method2110(argument_360_);
	    aBoolean672 = aClass_ha__651.method2104(argument_360_);
	}
	anInt668 = argument_356_;
	float f = (float) (argument_353_ >> 24 & 0xff);
	float f_361_ = (float) (argument_354_ >> 24 & 0xff);
	float f_362_ = (float) (argument_355_ >> 24 & 0xff);
	float f_363_ = (float) (argument_353_ >> 16 & 0xff);
	float f_364_ = (float) (argument_354_ >> 16 & 0xff);
	float f_365_ = (float) (argument_355_ >> 16 & 0xff);
	float f_366_ = (float) (argument_353_ >> 8 & 0xff);
	float f_367_ = (float) (argument_354_ >> 8 & 0xff);
	float f_368_ = (float) (argument_355_ >> 8 & 0xff);
	float f_369_ = (float) (argument_353_ & 0xff);
	float f_370_ = (float) (argument_354_ & 0xff);
	float f_371_ = (float) (argument_355_ & 0xff);
	argument_347_ /= argument_344_;
	argument_348_ /= argument_345_;
	argument_349_ /= argument_346_;
	argument_350_ /= argument_344_;
	argument_351_ /= argument_345_;
	argument_352_ /= argument_346_;
	argument_344_ = 1.0F / argument_344_;
	argument_345_ = 1.0F / argument_345_;
	argument_346_ = 1.0F / argument_346_;
	float f_372_ = 0.0F;
	float f_373_ = 0.0F;
	float f_374_ = 0.0F;
	float f_375_ = 0.0F;
	float f_376_ = 0.0F;
	float f_377_ = 0.0F;
	float f_378_ = 0.0F;
	float f_379_ = 0.0F;
	float f_380_ = 0.0F;
	if (argument_339_ != argument_338_) {
	    float f_381_ = argument_339_ - argument_338_;
	    f_372_ = (argument_342_ - argument_341_) / f_381_;
	    f_373_ = (argument_345_ - argument_344_) / f_381_;
	    f_374_ = (argument_348_ - argument_347_) / f_381_;
	    f_375_ = (argument_351_ - argument_350_) / f_381_;
	    f_376_ = (float) (argument_358_ - argument_357_) / f_381_;
	    f_377_ = (f_361_ - f) / f_381_;
	    f_378_ = (f_364_ - f_363_) / f_381_;
	    f_379_ = (f_367_ - f_366_) / f_381_;
	    f_380_ = (f_370_ - f_369_) / f_381_;
	}
	float f_382_ = 0.0F;
	float f_383_ = 0.0F;
	float f_384_ = 0.0F;
	float f_385_ = 0.0F;
	float f_386_ = 0.0F;
	float f_387_ = 0.0F;
	float f_388_ = 0.0F;
	float f_389_ = 0.0F;
	float f_390_ = 0.0F;
	if (argument_340_ != argument_339_) {
	    float f_391_ = argument_340_ - argument_339_;
	    f_382_ = (argument_343_ - argument_342_) / f_391_;
	    f_383_ = (argument_346_ - argument_345_) / f_391_;
	    f_384_ = (argument_349_ - argument_348_) / f_391_;
	    f_385_ = (argument_352_ - argument_351_) / f_391_;
	    f_386_ = (float) (argument_359_ - argument_358_) / f_391_;
	    f_387_ = (f_362_ - f_361_) / f_391_;
	    f_388_ = (f_365_ - f_364_) / f_391_;
	    f_389_ = (f_368_ - f_367_) / f_391_;
	    f_390_ = (f_371_ - f_370_) / f_391_;
	}
	float f_392_ = 0.0F;
	float f_393_ = 0.0F;
	float f_394_ = 0.0F;
	float f_395_ = 0.0F;
	float f_396_ = 0.0F;
	float f_397_ = 0.0F;
	float f_398_ = 0.0F;
	float f_399_ = 0.0F;
	float f_400_ = 0.0F;
	if (argument_338_ != argument_340_) {
	    float f_401_ = argument_338_ - argument_340_;
	    f_392_ = (argument_341_ - argument_343_) / f_401_;
	    f_393_ = (argument_344_ - argument_346_) / f_401_;
	    f_394_ = (argument_347_ - argument_349_) / f_401_;
	    f_395_ = (argument_350_ - argument_352_) / f_401_;
	    f_396_ = (float) (argument_357_ - argument_359_) / f_401_;
	    f_397_ = (f - f_362_) / f_401_;
	    f_398_ = (f_363_ - f_365_) / f_401_;
	    f_399_ = (f_366_ - f_368_) / f_401_;
	    f_400_ = (f_369_ - f_371_) / f_401_;
	}
	if (argument_338_ <= argument_339_ && argument_338_ <= argument_340_) {
	    if (!(argument_338_ >= (float) ((Class89) this).anInt653)) {
		if (argument_339_ > (float) ((Class89) this).anInt653)
		    argument_339_ = (float) ((Class89) this).anInt653;
		if (argument_340_ > (float) ((Class89) this).anInt653)
		    argument_340_ = (float) ((Class89) this).anInt653;
		if (argument_339_ < argument_340_) {
		    argument_343_ = argument_341_;
		    argument_346_ = argument_344_;
		    argument_349_ = argument_347_;
		    argument_352_ = argument_350_;
		    argument_359_ = argument_357_;
		    f_362_ = f;
		    f_365_ = f_363_;
		    f_368_ = f_366_;
		    f_371_ = f_369_;
		    if (argument_338_ < 0.0F) {
			argument_341_ -= f_372_ * argument_338_;
			argument_343_ -= f_392_ * argument_338_;
			argument_344_ -= f_373_ * argument_338_;
			argument_346_ -= f_393_ * argument_338_;
			argument_347_ -= f_374_ * argument_338_;
			argument_349_ -= f_394_ * argument_338_;
			argument_350_ -= f_375_ * argument_338_;
			argument_352_ -= f_395_ * argument_338_;
			argument_357_ -= f_376_ * argument_338_;
			argument_359_ -= f_396_ * argument_338_;
			f -= f_377_ * argument_338_;
			f_362_ -= f_397_ * argument_338_;
			f_363_ -= f_377_ * argument_338_;
			f_365_ -= f_397_ * argument_338_;
			f_366_ -= f_377_ * argument_338_;
			f_368_ -= f_397_ * argument_338_;
			f_369_ -= f_377_ * argument_338_;
			f_371_ -= f_397_ * argument_338_;
			argument_338_ = 0.0F;
		    }
		    if (argument_339_ < 0.0F) {
			argument_342_ -= f_382_ * argument_339_;
			argument_345_ -= f_383_ * argument_339_;
			argument_348_ -= f_384_ * argument_339_;
			argument_351_ -= f_385_ * argument_339_;
			argument_358_ -= f_386_ * argument_339_;
			f_361_ -= f_387_ * argument_339_;
			f_364_ -= f_388_ * argument_339_;
			f_367_ -= f_389_ * argument_339_;
			f_370_ -= f_390_ * argument_339_;
			argument_339_ = 0.0F;
		    }
		    if (argument_338_ != argument_339_ && f_392_ < f_372_
			|| argument_338_ == argument_339_ && f_392_ > f_382_) {
			argument_340_ -= argument_339_;
			argument_339_ -= argument_338_;
			argument_338_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_338_]);
			while (--argument_339_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_338_,
				       (int) argument_343_,
				       (int) argument_341_, argument_346_,
				       argument_344_, argument_349_,
				       argument_347_, argument_352_,
				       argument_350_, (float) argument_359_,
				       (float) argument_357_, f_362_, f,
				       f_365_, f_363_, f_368_, f_366_, f_371_,
				       f_369_);
			    argument_341_ += f_372_;
			    argument_343_ += f_392_;
			    argument_344_ += f_373_;
			    argument_346_ += f_393_;
			    argument_347_ += f_374_;
			    argument_349_ += f_394_;
			    argument_350_ += f_375_;
			    argument_352_ += f_395_;
			    argument_357_ += f_376_;
			    argument_359_ += f_396_;
			    f += f_377_;
			    f_362_ += f_397_;
			    f_363_ += f_378_;
			    f_365_ += f_398_;
			    f_366_ += f_379_;
			    f_368_ += f_399_;
			    f_369_ += f_380_;
			    f_371_ += f_400_;
			    argument_338_ += (float) anInt652;
			}
			while (--argument_340_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_338_,
				       (int) argument_343_,
				       (int) argument_342_, argument_346_,
				       argument_345_, argument_349_,
				       argument_348_, argument_352_,
				       argument_351_, (float) argument_359_,
				       (float) argument_358_, f_362_, f_361_,
				       f_365_, f_364_, f_368_, f_367_, f_371_,
				       f_370_);
			    argument_342_ += f_382_;
			    argument_343_ += f_392_;
			    argument_345_ += f_383_;
			    argument_346_ += f_393_;
			    argument_348_ += f_384_;
			    argument_349_ += f_394_;
			    argument_351_ += f_385_;
			    argument_352_ += f_395_;
			    argument_358_ += f_386_;
			    argument_359_ += f_396_;
			    f_361_ += f_387_;
			    f_362_ += f_397_;
			    f_364_ += f_388_;
			    f_365_ += f_398_;
			    f_367_ += f_389_;
			    f_368_ += f_399_;
			    f_370_ += f_390_;
			    f_371_ += f_400_;
			    argument_338_ += (float) anInt652;
			}
		    } else {
			argument_340_ -= argument_339_;
			argument_339_ -= argument_338_;
			argument_338_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_338_]);
			while (--argument_339_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_338_,
				       (int) argument_341_,
				       (int) argument_343_, argument_344_,
				       argument_346_, argument_347_,
				       argument_349_, argument_350_,
				       argument_352_, (float) argument_357_,
				       (float) argument_359_, f, f_362_,
				       f_363_, f_365_, f_366_, f_368_, f_369_,
				       f_371_);
			    argument_341_ += f_372_;
			    argument_343_ += f_392_;
			    argument_344_ += f_373_;
			    argument_346_ += f_393_;
			    argument_347_ += f_374_;
			    argument_349_ += f_394_;
			    argument_350_ += f_375_;
			    argument_352_ += f_395_;
			    argument_357_ += f_376_;
			    argument_359_ += f_396_;
			    f += f_377_;
			    f_362_ += f_397_;
			    f_363_ += f_378_;
			    f_365_ += f_398_;
			    f_366_ += f_379_;
			    f_368_ += f_399_;
			    f_369_ += f_380_;
			    f_371_ += f_400_;
			    argument_338_ += (float) anInt652;
			}
			while (--argument_340_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_338_,
				       (int) argument_342_,
				       (int) argument_343_, argument_345_,
				       argument_346_, argument_348_,
				       argument_349_, argument_351_,
				       argument_352_, (float) argument_358_,
				       (float) argument_359_, f_361_, f_362_,
				       f_364_, f_365_, f_367_, f_368_, f_370_,
				       f_371_);
			    argument_342_ += f_382_;
			    argument_343_ += f_392_;
			    argument_345_ += f_383_;
			    argument_346_ += f_393_;
			    argument_348_ += f_384_;
			    argument_349_ += f_394_;
			    argument_351_ += f_385_;
			    argument_352_ += f_395_;
			    argument_358_ += f_386_;
			    argument_359_ += f_396_;
			    f_361_ += f_387_;
			    f_362_ += f_397_;
			    f_364_ += f_388_;
			    f_365_ += f_398_;
			    f_367_ += f_389_;
			    f_368_ += f_399_;
			    f_370_ += f_390_;
			    f_371_ += f_400_;
			    argument_338_ += (float) anInt652;
			}
		    }
		} else {
		    argument_342_ = argument_341_;
		    argument_345_ = argument_344_;
		    argument_348_ = argument_347_;
		    argument_351_ = argument_350_;
		    argument_358_ = argument_357_;
		    f_361_ = f;
		    f_364_ = f_363_;
		    f_367_ = f_366_;
		    f_370_ = f_369_;
		    if (argument_338_ < 0.0F) {
			argument_341_ -= f_372_ * argument_338_;
			argument_342_ -= f_392_ * argument_338_;
			argument_344_ -= f_373_ * argument_338_;
			argument_345_ -= f_393_ * argument_338_;
			argument_347_ -= f_374_ * argument_338_;
			argument_348_ -= f_394_ * argument_338_;
			argument_350_ -= f_375_ * argument_338_;
			argument_351_ -= f_395_ * argument_338_;
			argument_357_ -= f_376_ * argument_338_;
			argument_358_ -= f_396_ * argument_338_;
			f -= f_377_ * argument_338_;
			f_361_ -= f_397_ * argument_338_;
			f_363_ -= f_377_ * argument_338_;
			f_364_ -= f_397_ * argument_338_;
			f_366_ -= f_377_ * argument_338_;
			f_367_ -= f_397_ * argument_338_;
			f_369_ -= f_377_ * argument_338_;
			f_370_ -= f_397_ * argument_338_;
			argument_338_ = 0.0F;
		    }
		    if (argument_340_ < 0.0F) {
			argument_343_ -= f_382_ * argument_340_;
			argument_346_ -= f_383_ * argument_340_;
			argument_349_ -= f_384_ * argument_340_;
			argument_352_ -= f_385_ * argument_340_;
			argument_359_ -= f_386_ * argument_340_;
			f_362_ -= f_387_ * argument_340_;
			f_365_ -= f_388_ * argument_340_;
			f_368_ -= f_389_ * argument_340_;
			f_371_ -= f_390_ * argument_340_;
			argument_340_ = 0.0F;
		    }
		    if (argument_338_ != argument_340_ && f_392_ < f_372_
			|| argument_338_ == argument_340_ && f_382_ > f_372_) {
			argument_339_ -= argument_340_;
			argument_340_ -= argument_338_;
			argument_338_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_338_]);
			while (--argument_340_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_338_,
				       (int) argument_342_,
				       (int) argument_341_, argument_345_,
				       argument_344_, argument_348_,
				       argument_347_, argument_351_,
				       argument_350_, (float) argument_358_,
				       (float) argument_357_, f_361_, f,
				       f_364_, f_363_, f_367_, f_366_, f_370_,
				       f_369_);
			    argument_341_ += f_372_;
			    argument_342_ += f_392_;
			    argument_344_ += f_373_;
			    argument_345_ += f_393_;
			    argument_347_ += f_374_;
			    argument_348_ += f_394_;
			    argument_350_ += f_375_;
			    argument_351_ += f_395_;
			    argument_357_ += f_376_;
			    argument_358_ += f_396_;
			    f += f_377_;
			    f_361_ += f_397_;
			    f_363_ += f_378_;
			    f_364_ += f_398_;
			    f_366_ += f_379_;
			    f_367_ += f_399_;
			    f_369_ += f_380_;
			    f_370_ += f_400_;
			    argument_338_ += (float) anInt652;
			}
			while (--argument_339_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_338_,
				       (int) argument_343_,
				       (int) argument_341_, argument_346_,
				       argument_344_, argument_349_,
				       argument_347_, argument_352_,
				       argument_350_, (float) argument_359_,
				       (float) argument_357_, f_362_, f,
				       f_365_, f_363_, f_368_, f_366_, f_371_,
				       f_369_);
			    argument_343_ += f_382_;
			    argument_341_ += f_372_;
			    argument_346_ += f_383_;
			    argument_344_ += f_373_;
			    argument_349_ += f_384_;
			    argument_347_ += f_374_;
			    argument_352_ += f_385_;
			    argument_350_ += f_375_;
			    argument_359_ += f_386_;
			    argument_357_ += f_376_;
			    f_362_ += f_387_;
			    f += f_377_;
			    f_365_ += f_388_;
			    f_363_ += f_378_;
			    f_368_ += f_389_;
			    f_366_ += f_379_;
			    f_371_ += f_390_;
			    f_369_ += f_380_;
			    argument_338_ += (float) anInt652;
			}
		    } else {
			argument_339_ -= argument_340_;
			argument_340_ -= argument_338_;
			argument_338_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_338_]);
			while (--argument_340_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_338_,
				       (int) argument_341_,
				       (int) argument_342_, argument_344_,
				       argument_345_, argument_347_,
				       argument_348_, argument_350_,
				       argument_351_, (float) argument_357_,
				       (float) argument_358_, f, f_361_,
				       f_363_, f_364_, f_366_, f_367_, f_369_,
				       f_370_);
			    argument_342_ += f_392_;
			    argument_341_ += f_372_;
			    argument_345_ += f_393_;
			    argument_344_ += f_373_;
			    argument_348_ += f_394_;
			    argument_347_ += f_374_;
			    argument_351_ += f_395_;
			    argument_350_ += f_375_;
			    argument_358_ += f_396_;
			    argument_357_ += f_376_;
			    f_361_ += f_397_;
			    f += f_377_;
			    f_364_ += f_398_;
			    f_363_ += f_378_;
			    f_367_ += f_399_;
			    f_366_ += f_379_;
			    f_370_ += f_400_;
			    f_369_ += f_380_;
			    argument_338_ += (float) anInt652;
			}
			while (--argument_339_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_338_,
				       (int) argument_341_,
				       (int) argument_343_, argument_344_,
				       argument_346_, argument_347_,
				       argument_349_, argument_350_,
				       argument_352_, (float) argument_357_,
				       (float) argument_359_, f, f_362_,
				       f_363_, f_365_, f_366_, f_368_, f_369_,
				       f_371_);
			    argument_341_ += f_372_;
			    argument_343_ += f_382_;
			    argument_344_ += f_373_;
			    argument_346_ += f_383_;
			    argument_347_ += f_374_;
			    argument_349_ += f_384_;
			    argument_350_ += f_375_;
			    argument_352_ += f_385_;
			    argument_357_ += f_376_;
			    argument_359_ += f_386_;
			    f += f_377_;
			    f_362_ += f_387_;
			    f_363_ += f_378_;
			    f_365_ += f_388_;
			    f_366_ += f_379_;
			    f_368_ += f_389_;
			    f_369_ += f_380_;
			    f_371_ += f_390_;
			    argument_338_ += (float) anInt652;
			}
		    }
		}
	    }
	} else if (argument_339_ <= argument_340_) {
	    if (!(argument_339_ >= (float) ((Class89) this).anInt653)) {
		if (argument_340_ > (float) ((Class89) this).anInt653)
		    argument_340_ = (float) ((Class89) this).anInt653;
		if (argument_338_ > (float) ((Class89) this).anInt653)
		    argument_338_ = (float) ((Class89) this).anInt653;
		if (argument_340_ < argument_338_) {
		    argument_341_ = argument_342_;
		    argument_344_ = argument_345_;
		    argument_347_ = argument_348_;
		    argument_350_ = argument_351_;
		    argument_357_ = argument_358_;
		    f = f_361_;
		    f_363_ = f_364_;
		    f_366_ = f_367_;
		    f_369_ = f_370_;
		    if (argument_339_ < 0.0F) {
			argument_341_ -= f_372_ * argument_339_;
			argument_342_ -= f_382_ * argument_339_;
			argument_344_ -= f_373_ * argument_339_;
			argument_345_ -= f_383_ * argument_339_;
			argument_347_ -= f_374_ * argument_339_;
			argument_348_ -= f_384_ * argument_339_;
			argument_350_ -= f_375_ * argument_339_;
			argument_351_ -= f_385_ * argument_339_;
			argument_357_ -= f_376_ * argument_339_;
			argument_358_ -= f_386_ * argument_339_;
			f -= f_377_ * argument_339_;
			f_361_ -= f_387_ * argument_339_;
			f_363_ -= f_378_ * argument_339_;
			f_364_ -= f_388_ * argument_339_;
			f_366_ -= f_379_ * argument_339_;
			f_367_ -= f_389_ * argument_339_;
			f_369_ -= f_380_ * argument_339_;
			f_370_ -= f_390_ * argument_339_;
			argument_339_ = 0.0F;
		    }
		    if (argument_340_ < 0.0F) {
			argument_343_ -= f_392_ * argument_340_;
			argument_346_ -= f_393_ * argument_340_;
			argument_349_ -= f_394_ * argument_340_;
			argument_352_ -= f_395_ * argument_340_;
			argument_359_ -= f_396_ * argument_340_;
			f_362_ -= f_397_ * argument_340_;
			f_365_ -= f_398_ * argument_340_;
			f_368_ -= f_399_ * argument_340_;
			f_371_ -= f_400_ * argument_340_;
			argument_340_ = 0.0F;
		    }
		    if (argument_339_ != argument_340_ && f_372_ < f_382_
			|| argument_339_ == argument_340_ && f_372_ > f_392_) {
			argument_338_ -= argument_340_;
			argument_340_ -= argument_339_;
			argument_339_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_339_]);
			while (--argument_340_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_339_,
				       (int) argument_341_,
				       (int) argument_342_, argument_344_,
				       argument_345_, argument_347_,
				       argument_348_, argument_350_,
				       argument_351_, (float) argument_357_,
				       (float) argument_358_, f, f_361_,
				       f_363_, f_364_, f_366_, f_367_, f_369_,
				       f_370_);
			    argument_341_ += f_372_;
			    argument_342_ += f_382_;
			    argument_344_ += f_373_;
			    argument_345_ += f_383_;
			    argument_347_ += f_374_;
			    argument_348_ += f_384_;
			    argument_350_ += f_375_;
			    argument_351_ += f_385_;
			    argument_357_ += f_376_;
			    argument_358_ += f_386_;
			    f += f_377_;
			    f_361_ += f_387_;
			    f_363_ += f_378_;
			    f_364_ += f_388_;
			    f_366_ += f_379_;
			    f_367_ += f_389_;
			    f_369_ += f_380_;
			    f_370_ += f_390_;
			    argument_339_ += (float) anInt652;
			}
			while (--argument_338_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_339_,
				       (int) argument_341_,
				       (int) argument_343_, argument_344_,
				       argument_346_, argument_347_,
				       argument_349_, argument_350_,
				       argument_352_, (float) argument_357_,
				       (float) argument_359_, f, f_362_,
				       f_363_, f_365_, f_366_, f_368_, f_369_,
				       f_371_);
			    argument_341_ += f_372_;
			    argument_343_ += f_392_;
			    argument_344_ += f_373_;
			    argument_346_ += f_393_;
			    argument_347_ += f_374_;
			    argument_349_ += f_394_;
			    argument_350_ += f_375_;
			    argument_352_ += f_395_;
			    argument_357_ += f_376_;
			    argument_359_ += f_396_;
			    f += f_377_;
			    f_362_ += f_397_;
			    f_363_ += f_378_;
			    f_365_ += f_398_;
			    f_366_ += f_379_;
			    f_368_ += f_399_;
			    f_369_ += f_380_;
			    f_371_ += f_400_;
			    argument_339_ += (float) anInt652;
			}
		    } else {
			argument_338_ -= argument_340_;
			argument_340_ -= argument_339_;
			argument_339_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_339_]);
			while (--argument_340_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_339_,
				       (int) argument_342_,
				       (int) argument_341_, argument_345_,
				       argument_344_, argument_348_,
				       argument_347_, argument_351_,
				       argument_350_, (float) argument_358_,
				       (float) argument_357_, f_361_, f,
				       f_364_, f_363_, f_367_, f_366_, f_370_,
				       f_369_);
			    argument_342_ += f_382_;
			    argument_341_ += f_372_;
			    argument_345_ += f_383_;
			    argument_344_ += f_373_;
			    argument_348_ += f_384_;
			    argument_347_ += f_374_;
			    argument_351_ += f_385_;
			    argument_350_ += f_375_;
			    argument_358_ += f_386_;
			    argument_357_ += f_376_;
			    f_361_ += f_387_;
			    f += f_377_;
			    f_364_ += f_388_;
			    f_363_ += f_378_;
			    f_367_ += f_389_;
			    f_366_ += f_379_;
			    f_370_ += f_390_;
			    f_369_ += f_380_;
			    argument_339_ += (float) anInt652;
			}
			while (--argument_338_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_339_,
				       (int) argument_343_,
				       (int) argument_341_, argument_346_,
				       argument_344_, argument_349_,
				       argument_347_, argument_352_,
				       argument_350_, (float) argument_359_,
				       (float) argument_357_, f_362_, f,
				       f_365_, f_363_, f_368_, f_366_, f_371_,
				       f_369_);
			    argument_343_ += f_392_;
			    argument_341_ += f_372_;
			    argument_346_ += f_393_;
			    argument_344_ += f_373_;
			    argument_349_ += f_394_;
			    argument_347_ += f_374_;
			    argument_352_ += f_395_;
			    argument_350_ += f_375_;
			    argument_359_ += f_396_;
			    argument_357_ += f_376_;
			    f_362_ += f_397_;
			    f += f_377_;
			    f_365_ += f_398_;
			    f_363_ += f_378_;
			    f_368_ += f_399_;
			    f_366_ += f_379_;
			    f_371_ += f_400_;
			    f_369_ += f_380_;
			    argument_339_ += (float) anInt652;
			}
		    }
		} else {
		    argument_343_ = argument_342_;
		    argument_346_ = argument_345_;
		    argument_349_ = argument_348_;
		    argument_352_ = argument_351_;
		    argument_359_ = argument_358_;
		    f_362_ = f_361_;
		    f_365_ = f_364_;
		    f_368_ = f_367_;
		    f_371_ = f_370_;
		    if (argument_339_ < 0.0F) {
			argument_343_ -= f_372_ * argument_339_;
			argument_342_ -= f_382_ * argument_339_;
			argument_346_ -= f_373_ * argument_339_;
			argument_345_ -= f_383_ * argument_339_;
			argument_349_ -= f_374_ * argument_339_;
			argument_348_ -= f_384_ * argument_339_;
			argument_352_ -= f_375_ * argument_339_;
			argument_351_ -= f_385_ * argument_339_;
			argument_359_ -= f_376_ * argument_339_;
			argument_358_ -= f_386_ * argument_339_;
			f_362_ -= f_377_ * argument_339_;
			f_361_ -= f_387_ * argument_339_;
			f_365_ -= f_378_ * argument_339_;
			f_364_ -= f_388_ * argument_339_;
			f_368_ -= f_379_ * argument_339_;
			f_367_ -= f_389_ * argument_339_;
			f_371_ -= f_380_ * argument_339_;
			f_370_ -= f_390_ * argument_339_;
			argument_339_ = 0.0F;
		    }
		    if (argument_338_ < 0.0F) {
			argument_341_ -= f_392_ * argument_338_;
			argument_344_ -= f_393_ * argument_338_;
			argument_347_ -= f_394_ * argument_338_;
			argument_350_ -= f_395_ * argument_338_;
			argument_357_ -= f_396_ * argument_338_;
			f -= f_397_ * argument_338_;
			f_363_ -= f_398_ * argument_338_;
			f_366_ -= f_399_ * argument_338_;
			f_369_ -= f_400_ * argument_338_;
			argument_338_ = 0.0F;
		    }
		    argument_340_ -= argument_338_;
		    argument_338_ -= argument_339_;
		    argument_339_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_339_]);
		    if (f_372_ < f_382_) {
			while (--argument_338_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_339_,
				       (int) argument_343_,
				       (int) argument_342_, argument_346_,
				       argument_345_, argument_349_,
				       argument_348_, argument_352_,
				       argument_351_, (float) argument_359_,
				       (float) argument_358_, f_362_, f_361_,
				       f_365_, f_364_, f_368_, f_367_, f_371_,
				       f_370_);
			    argument_343_ += f_372_;
			    argument_342_ += f_382_;
			    argument_346_ += f_373_;
			    argument_345_ += f_383_;
			    argument_349_ += f_374_;
			    argument_348_ += f_384_;
			    argument_352_ += f_375_;
			    argument_351_ += f_385_;
			    argument_359_ += f_376_;
			    argument_358_ += f_386_;
			    f_362_ += f_377_;
			    f_361_ += f_387_;
			    f_365_ += f_378_;
			    f_364_ += f_388_;
			    f_368_ += f_379_;
			    f_367_ += f_389_;
			    f_371_ += f_380_;
			    f_370_ += f_390_;
			    argument_339_ += (float) anInt652;
			}
			while (--argument_340_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_339_,
				       (int) argument_341_,
				       (int) argument_342_, argument_344_,
				       argument_345_, argument_347_,
				       argument_348_, argument_350_,
				       argument_351_, (float) argument_357_,
				       (float) argument_358_, f, f_361_,
				       f_363_, f_364_, f_366_, f_367_, f_369_,
				       f_370_);
			    argument_341_ += f_392_;
			    argument_342_ += f_382_;
			    argument_344_ += f_393_;
			    argument_345_ += f_383_;
			    argument_347_ += f_394_;
			    argument_348_ += f_384_;
			    argument_350_ += f_395_;
			    argument_351_ += f_385_;
			    argument_357_ += f_396_;
			    argument_358_ += f_386_;
			    f += f_397_;
			    f_361_ += f_387_;
			    f_363_ += f_398_;
			    f_364_ += f_388_;
			    f_366_ += f_399_;
			    f_367_ += f_389_;
			    f_369_ += f_400_;
			    f_370_ += f_390_;
			    argument_339_ += (float) anInt652;
			}
		    } else {
			while (--argument_338_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_339_,
				       (int) argument_342_,
				       (int) argument_343_, argument_345_,
				       argument_346_, argument_348_,
				       argument_349_, argument_351_,
				       argument_352_, (float) argument_358_,
				       (float) argument_359_, f_361_, f_362_,
				       f_364_, f_365_, f_367_, f_368_, f_370_,
				       f_371_);
			    argument_342_ += f_382_;
			    argument_343_ += f_372_;
			    argument_345_ += f_383_;
			    argument_346_ += f_373_;
			    argument_348_ += f_384_;
			    argument_349_ += f_374_;
			    argument_351_ += f_385_;
			    argument_352_ += f_375_;
			    argument_358_ += f_386_;
			    argument_359_ += f_376_;
			    f_361_ += f_387_;
			    f_362_ += f_377_;
			    f_364_ += f_388_;
			    f_365_ += f_378_;
			    f_367_ += f_389_;
			    f_368_ += f_379_;
			    f_370_ += f_390_;
			    f_371_ += f_380_;
			    argument_339_ += (float) anInt652;
			}
			while (--argument_340_ >= 0.0F) {
			    method1659(anIntArray657, anIntArray676,
				       (int) argument_339_,
				       (int) argument_342_,
				       (int) argument_341_, argument_345_,
				       argument_344_, argument_348_,
				       argument_347_, argument_351_,
				       argument_350_, (float) argument_358_,
				       (float) argument_357_, f_361_, f,
				       f_364_, f_363_, f_367_, f_366_, f_370_,
				       f_369_);
			    argument_342_ += f_382_;
			    argument_341_ += f_392_;
			    argument_345_ += f_383_;
			    argument_344_ += f_393_;
			    argument_348_ += f_384_;
			    argument_347_ += f_394_;
			    argument_351_ += f_385_;
			    argument_350_ += f_395_;
			    argument_358_ += f_386_;
			    argument_357_ += f_396_;
			    f_361_ += f_387_;
			    f += f_397_;
			    f_364_ += f_388_;
			    f_363_ += f_398_;
			    f_367_ += f_389_;
			    f_366_ += f_399_;
			    f_370_ += f_390_;
			    f_369_ += f_400_;
			    argument_339_ += (float) anInt652;
			}
		    }
		}
	    }
	} else if (!(argument_340_ >= (float) ((Class89) this).anInt653)) {
	    if (argument_338_ > (float) ((Class89) this).anInt653)
		argument_338_ = (float) ((Class89) this).anInt653;
	    if (argument_339_ > (float) ((Class89) this).anInt653)
		argument_339_ = (float) ((Class89) this).anInt653;
	    if (argument_338_ < argument_339_) {
		argument_342_ = argument_343_;
		argument_345_ = argument_346_;
		argument_348_ = argument_349_;
		argument_351_ = argument_352_;
		argument_358_ = argument_359_;
		f_361_ = f_362_;
		f_364_ = f_365_;
		f_367_ = f_368_;
		f_370_ = f_371_;
		if (argument_340_ < 0.0F) {
		    argument_343_ -= f_392_ * argument_340_;
		    argument_342_ -= f_382_ * argument_340_;
		    argument_346_ -= f_393_ * argument_340_;
		    argument_345_ -= f_383_ * argument_340_;
		    argument_349_ -= f_394_ * argument_340_;
		    argument_348_ -= f_384_ * argument_340_;
		    argument_352_ -= f_395_ * argument_340_;
		    argument_351_ -= f_385_ * argument_340_;
		    argument_359_ -= f_396_ * 3.0F;
		    argument_358_ -= f_386_ * argument_340_;
		    f_362_ -= f_397_ * argument_340_;
		    f_361_ -= f_387_ * argument_340_;
		    f_365_ -= f_398_ * argument_340_;
		    f_364_ -= f_388_ * argument_340_;
		    f_368_ -= f_399_ * argument_340_;
		    f_367_ -= f_389_ * argument_340_;
		    f_371_ -= f_400_ * argument_340_;
		    f_370_ -= f_390_ * argument_340_;
		    argument_340_ = 0.0F;
		}
		if (argument_338_ < 0.0F) {
		    argument_341_ -= f_372_ * argument_338_;
		    argument_344_ -= f_373_ * argument_338_;
		    argument_347_ -= f_374_ * argument_338_;
		    argument_350_ -= f_375_ * argument_338_;
		    argument_357_ -= f_376_ * argument_338_;
		    f -= f_377_ * argument_338_;
		    f_363_ -= f_378_ * argument_338_;
		    f_366_ -= f_379_ * argument_338_;
		    f_369_ -= f_380_ * argument_338_;
		    argument_338_ = 0.0F;
		}
		if (f_382_ < f_392_) {
		    argument_339_ -= argument_338_;
		    argument_338_ -= argument_340_;
		    argument_340_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_340_]);
		    while (--argument_338_ >= 0.0F) {
			method1659(anIntArray657, anIntArray676,
				   (int) argument_340_, (int) argument_342_,
				   (int) argument_343_, argument_345_,
				   argument_346_, argument_348_, argument_349_,
				   argument_351_, argument_352_,
				   (float) argument_358_,
				   (float) argument_359_, f_361_, f_362_,
				   f_364_, f_365_, f_367_, f_368_, f_370_,
				   f_371_);
			argument_342_ += f_382_;
			argument_343_ += f_392_;
			argument_345_ += f_383_;
			argument_346_ += f_393_;
			argument_348_ += f_384_;
			argument_349_ += f_394_;
			argument_351_ += f_385_;
			argument_352_ += f_395_;
			argument_358_ += f_386_;
			argument_359_ += f_396_;
			f_361_ += f_387_;
			f_362_ += f_397_;
			f_364_ += f_388_;
			f_365_ += f_398_;
			f_367_ += f_389_;
			f_368_ += f_399_;
			f_370_ += f_390_;
			f_371_ += f_400_;
			argument_340_ += (float) anInt652;
		    }
		    while (--argument_339_ >= 0.0F) {
			method1659(anIntArray657, anIntArray676,
				   (int) argument_340_, (int) argument_342_,
				   (int) argument_341_, argument_345_,
				   argument_344_, argument_348_, argument_347_,
				   argument_351_, argument_350_,
				   (float) argument_358_,
				   (float) argument_357_, f_361_, f, f_364_,
				   f_363_, f_367_, f_366_, f_370_, f_369_);
			argument_342_ += f_382_;
			argument_341_ += f_372_;
			argument_345_ += f_383_;
			argument_344_ += f_373_;
			argument_348_ += f_384_;
			argument_347_ += f_374_;
			argument_351_ += f_385_;
			argument_350_ += f_375_;
			argument_358_ += f_386_;
			argument_357_ += f_376_;
			f_361_ += f_387_;
			f += f_377_;
			f_364_ += f_388_;
			f_363_ += f_378_;
			f_367_ += f_389_;
			f_366_ += f_379_;
			f_370_ += f_390_;
			f_369_ += f_380_;
			argument_340_ += (float) anInt652;
		    }
		} else {
		    argument_339_ -= argument_338_;
		    argument_338_ -= argument_340_;
		    argument_340_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_340_]);
		    while (--argument_338_ >= 0.0F) {
			method1659(anIntArray657, anIntArray676,
				   (int) argument_340_, (int) argument_343_,
				   (int) argument_342_, argument_346_,
				   argument_345_, argument_349_, argument_348_,
				   argument_352_, argument_351_,
				   (float) argument_359_,
				   (float) argument_358_, f_362_, f_361_,
				   f_365_, f_364_, f_368_, f_367_, f_371_,
				   f_370_);
			argument_343_ += f_392_;
			argument_342_ += f_382_;
			argument_346_ += f_393_;
			argument_345_ += f_383_;
			argument_349_ += f_394_;
			argument_348_ += f_384_;
			argument_352_ += f_395_;
			argument_351_ += f_385_;
			argument_359_ += f_396_;
			argument_358_ += f_386_;
			f_362_ += f_397_;
			f_361_ += f_387_;
			f_365_ += f_398_;
			f_364_ += f_388_;
			f_368_ += f_399_;
			f_367_ += f_389_;
			f_371_ += f_400_;
			f_370_ += f_390_;
			argument_340_ += (float) anInt652;
		    }
		    while (--argument_339_ >= 0.0F) {
			method1659(anIntArray657, anIntArray676,
				   (int) argument_340_, (int) argument_341_,
				   (int) argument_342_, argument_344_,
				   argument_345_, argument_347_, argument_348_,
				   argument_350_, argument_351_,
				   (float) argument_357_,
				   (float) argument_358_, f, f_361_, f_363_,
				   f_364_, f_366_, f_367_, f_369_, f_370_);
			argument_341_ += f_372_;
			argument_342_ += f_382_;
			argument_344_ += f_373_;
			argument_345_ += f_383_;
			argument_347_ += f_374_;
			argument_348_ += f_384_;
			argument_350_ += f_375_;
			argument_351_ += f_385_;
			argument_357_ += f_376_;
			argument_358_ += f_386_;
			f += f_377_;
			f_361_ += f_387_;
			f_363_ += f_378_;
			f_364_ += f_388_;
			f_366_ += f_379_;
			f_367_ += f_389_;
			f_369_ += f_380_;
			f_370_ += f_390_;
			argument_340_ += (float) anInt652;
		    }
		}
	    } else {
		argument_341_ = argument_343_;
		argument_344_ = argument_346_;
		argument_347_ = argument_349_;
		argument_350_ = argument_352_;
		argument_357_ = argument_359_;
		f = f_362_;
		f_363_ = f_365_;
		f_366_ = f_368_;
		f_369_ = f_371_;
		if (argument_340_ < 0.0F) {
		    argument_343_ -= f_392_ * argument_340_;
		    argument_341_ -= f_382_ * argument_340_;
		    argument_346_ -= f_393_ * argument_340_;
		    argument_344_ -= f_383_ * argument_340_;
		    argument_349_ -= f_394_ * argument_340_;
		    argument_347_ -= f_384_ * argument_340_;
		    argument_352_ -= f_395_ * argument_340_;
		    argument_350_ -= f_385_ * argument_340_;
		    argument_359_ -= f_396_ * 3.0F;
		    argument_357_ -= f_386_ * argument_340_;
		    f_362_ -= f_397_ * argument_340_;
		    f -= f_387_ * argument_340_;
		    f_365_ -= f_398_ * argument_340_;
		    f_363_ -= f_388_ * argument_340_;
		    f_368_ -= f_399_ * argument_340_;
		    f_366_ -= f_389_ * argument_340_;
		    f_371_ -= f_400_ * argument_340_;
		    f_369_ -= f_390_ * argument_340_;
		    argument_340_ = 0.0F;
		}
		if (argument_339_ < 0.0F) {
		    argument_342_ -= f_372_ * argument_339_;
		    argument_345_ -= f_373_ * argument_339_;
		    argument_348_ -= f_374_ * argument_339_;
		    argument_351_ -= f_375_ * argument_339_;
		    argument_358_ -= f_376_ * argument_339_;
		    f_361_ -= f_377_ * argument_339_;
		    f_364_ -= f_378_ * argument_339_;
		    f_367_ -= f_379_ * argument_339_;
		    f_370_ -= f_380_ * argument_339_;
		    argument_339_ = 0.0F;
		}
		if (f_382_ < f_392_) {
		    argument_338_ -= argument_339_;
		    argument_339_ -= argument_340_;
		    argument_340_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_340_]);
		    while (--argument_339_ >= 0.0F) {
			method1659(anIntArray657, anIntArray676,
				   (int) argument_340_, (int) argument_341_,
				   (int) argument_343_, argument_344_,
				   argument_346_, argument_347_, argument_349_,
				   argument_350_, argument_352_,
				   (float) argument_357_,
				   (float) argument_359_, f, f_362_, f_363_,
				   f_365_, f_366_, f_368_, f_369_, f_371_);
			argument_341_ += f_382_;
			argument_343_ += f_392_;
			argument_344_ += f_383_;
			argument_346_ += f_393_;
			argument_347_ += f_384_;
			argument_349_ += f_394_;
			argument_350_ += f_385_;
			argument_352_ += f_395_;
			argument_357_ += f_386_;
			argument_359_ += f_396_;
			f += f_387_;
			f_362_ += f_397_;
			f_363_ += f_388_;
			f_365_ += f_398_;
			f_366_ += f_389_;
			f_368_ += f_399_;
			f_369_ += f_390_;
			f_371_ += f_400_;
			argument_340_ += (float) anInt652;
		    }
		    while (--argument_338_ >= 0.0F) {
			method1659(anIntArray657, anIntArray676,
				   (int) argument_340_, (int) argument_342_,
				   (int) argument_343_, argument_345_,
				   argument_346_, argument_348_, argument_349_,
				   argument_351_, argument_352_,
				   (float) argument_358_,
				   (float) argument_359_, f_361_, f_362_,
				   f_364_, f_365_, f_367_, f_368_, f_370_,
				   f_371_);
			argument_342_ += f_372_;
			argument_343_ += f_392_;
			argument_345_ += f_373_;
			argument_346_ += f_393_;
			argument_348_ += f_374_;
			argument_349_ += f_394_;
			argument_351_ += f_375_;
			argument_352_ += f_395_;
			argument_358_ += f_376_;
			argument_359_ += f_396_;
			f_361_ += f_377_;
			f_362_ += f_397_;
			f_364_ += f_378_;
			f_365_ += f_398_;
			f_367_ += f_379_;
			f_368_ += f_399_;
			f_370_ += f_380_;
			f_371_ += f_400_;
			argument_340_ += (float) anInt652;
		    }
		} else {
		    argument_338_ -= argument_339_;
		    argument_339_ -= argument_340_;
		    argument_340_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_340_]);
		    while (--argument_339_ >= 0.0F) {
			method1659(anIntArray657, anIntArray676,
				   (int) argument_340_, (int) argument_343_,
				   (int) argument_341_, argument_346_,
				   argument_344_, argument_349_, argument_347_,
				   argument_352_, argument_350_,
				   (float) argument_359_,
				   (float) argument_357_, f_362_, f, f_365_,
				   f_363_, f_368_, f_366_, f_371_, f_369_);
			argument_343_ += f_392_;
			argument_341_ += f_382_;
			argument_346_ += f_393_;
			argument_344_ += f_383_;
			argument_349_ += f_394_;
			argument_347_ += f_384_;
			argument_352_ += f_395_;
			argument_350_ += f_385_;
			argument_359_ += f_396_;
			argument_357_ += f_386_;
			f_362_ += f_397_;
			f += f_387_;
			f_365_ += f_398_;
			f_363_ += f_388_;
			f_368_ += f_399_;
			f_366_ += f_389_;
			f_371_ += f_400_;
			f_369_ += f_390_;
			argument_340_ += (float) anInt652;
		    }
		    while (--argument_338_ >= 0.0F) {
			method1659(anIntArray657, anIntArray676,
				   (int) argument_340_, (int) argument_343_,
				   (int) argument_342_, argument_346_,
				   argument_345_, argument_349_, argument_348_,
				   argument_352_, argument_351_,
				   (float) argument_359_,
				   (float) argument_358_, f_362_, f_361_,
				   f_365_, f_364_, f_368_, f_367_, f_371_,
				   f_370_);
			argument_343_ += f_392_;
			argument_342_ += f_372_;
			argument_346_ += f_393_;
			argument_345_ += f_373_;
			argument_349_ += f_394_;
			argument_348_ += f_374_;
			argument_352_ += f_395_;
			argument_351_ += f_375_;
			argument_359_ += f_396_;
			argument_358_ += f_376_;
			f_362_ += f_397_;
			f_361_ += f_377_;
			f_365_ += f_398_;
			f_364_ += f_378_;
			f_368_ += f_399_;
			f_367_ += f_379_;
			f_371_ += f_400_;
			f_370_ += f_380_;
			argument_340_ += (float) anInt652;
		    }
		}
	    }
	}
    }
    
    private final void method1665
	(int[] argument_402_, float[] argument_403_, int argument_404_,
	 int argument_405_, int argument_406_, int argument_407_,
	 int argument_408_, float argument_409_, float argument_410_,
	 float argument_411_, float argument_412_) {
	if (((Class89) this).aBoolean661) {
	    if (argument_408_ > ((Class89) this).anInt650)
		argument_408_ = ((Class89) this).anInt650;
	    if (argument_407_ < 0)
		argument_407_ = 0;
	}
	if (argument_407_ < argument_408_) {
	    argument_404_ += argument_407_ - 1;
	    argument_409_ += argument_410_ * (float) argument_407_;
	    argument_411_ += argument_412_ * (float) argument_407_;
	    if (((Class293) aClass293_660).aBoolean2415) {
		do {
		    if (((Class89) this).aBoolean647) {
			argument_406_ = argument_408_ - argument_407_ >> 2;
			argument_410_ *= 4.0F;
			if (((Class89) this).anInt646 == 0) {
			    if (argument_406_ > 0) {
				do {
				    argument_405_ = (HslToRgb.table2
						     [(int) argument_409_]);
				    argument_409_ += argument_410_;
				    if (argument_411_
					< argument_403_[++argument_404_]) {
					argument_402_[argument_404_]
					    = argument_405_;
					argument_403_[argument_404_]
					    = argument_411_;
				    }
				    argument_411_ += argument_412_;
				    if (argument_411_
					< argument_403_[++argument_404_]) {
					argument_402_[argument_404_]
					    = argument_405_;
					argument_403_[argument_404_]
					    = argument_411_;
				    }
				    argument_411_ += argument_412_;
				    if (argument_411_
					< argument_403_[++argument_404_]) {
					argument_402_[argument_404_]
					    = argument_405_;
					argument_403_[argument_404_]
					    = argument_411_;
				    }
				    argument_411_ += argument_412_;
				    if (argument_411_
					< argument_403_[++argument_404_]) {
					argument_402_[argument_404_]
					    = argument_405_;
					argument_403_[argument_404_]
					    = argument_411_;
				    }
				    argument_411_ += argument_412_;
				} while (--argument_406_ > 0);
			    }
			    argument_406_
				= argument_408_ - argument_407_ & 0x3;
			    if (argument_406_ > 0) {
				argument_405_ = (HslToRgb.table2
						 [(int) argument_409_]);
				do {
				    if (argument_411_
					< argument_403_[++argument_404_]) {
					argument_402_[argument_404_]
					    = argument_405_;
					argument_403_[argument_404_]
					    = argument_411_;
				    }
				    argument_411_ += argument_412_;
				} while (--argument_406_ > 0);
			    }
			} else {
			    int anLocalInt = ((Class89) this).anInt646;
			    int anLocalInt_413_
				= 256 - ((Class89) this).anInt646;
			    if (argument_406_ > 0) {
				do {
				    argument_405_ = (HslToRgb.table2
						     [(int) argument_409_]);
				    argument_409_ += argument_410_;
				    argument_405_
					= ((((argument_405_ & 0xff00ff)
					     * anLocalInt_413_) >> 8
					    & 0xff00ff)
					   + (((argument_405_ & 0xff00)
					       * anLocalInt_413_) >> 8
					      & 0xff00));
				    if (argument_411_
					< argument_403_[++argument_404_]) {
					int anLocalInt_414_
					    = argument_402_[argument_404_];
					argument_402_[argument_404_]
					    = ((anLocalInt_413_
						| anLocalInt_414_ >> 24) << 24
					       | (argument_405_
						  + (((anLocalInt_414_
						       & 0xff00ff) * anLocalInt
						      >> 8)
						     & 0xff00ff)
						  + (((anLocalInt_414_
						       & 0xff00) * anLocalInt
						      >> 8)
						     & 0xff00)));
					argument_403_[argument_404_]
					    = argument_411_;
				    }
				    argument_411_ += argument_412_;
				    if (argument_411_
					< argument_403_[++argument_404_]) {
					int anLocalInt_415_
					    = argument_402_[argument_404_];
					argument_402_[argument_404_]
					    = ((anLocalInt_413_
						| anLocalInt_415_ >> 24) << 24
					       | (argument_405_
						  + (((anLocalInt_415_
						       & 0xff00ff) * anLocalInt
						      >> 8)
						     & 0xff00ff)
						  + (((anLocalInt_415_
						       & 0xff00) * anLocalInt
						      >> 8)
						     & 0xff00)));
					argument_403_[argument_404_]
					    = argument_411_;
				    }
				    argument_411_ += argument_412_;
				    if (argument_411_
					< argument_403_[++argument_404_]) {
					int anLocalInt_416_
					    = argument_402_[argument_404_];
					argument_402_[argument_404_]
					    = ((anLocalInt_413_
						| anLocalInt_416_ >> 24) << 24
					       | (argument_405_
						  + (((anLocalInt_416_
						       & 0xff00ff) * anLocalInt
						      >> 8)
						     & 0xff00ff)
						  + (((anLocalInt_416_
						       & 0xff00) * anLocalInt
						      >> 8)
						     & 0xff00)));
					argument_403_[argument_404_]
					    = argument_411_;
				    }
				    argument_411_ += argument_412_;
				    if (argument_411_
					< argument_403_[++argument_404_]) {
					int anLocalInt_417_
					    = argument_402_[argument_404_];
					argument_402_[argument_404_]
					    = ((anLocalInt_413_
						| anLocalInt_417_ >> 24) << 24
					       | (argument_405_
						  + (((anLocalInt_417_
						       & 0xff00ff) * anLocalInt
						      >> 8)
						     & 0xff00ff)
						  + (((anLocalInt_417_
						       & 0xff00) * anLocalInt
						      >> 8)
						     & 0xff00)));
					argument_403_[argument_404_]
					    = argument_411_;
				    }
				    argument_411_ += argument_412_;
				} while (--argument_406_ > 0);
			    }
			    argument_406_
				= argument_408_ - argument_407_ & 0x3;
			    if (argument_406_ <= 0)
				break;
			    argument_405_
				= HslToRgb.table2[(int) argument_409_];
			    argument_405_ = ((((argument_405_ & 0xff00ff)
					       * anLocalInt_413_) >> 8
					      & 0xff00ff)
					     + (((argument_405_ & 0xff00)
						 * anLocalInt_413_) >> 8
						& 0xff00));
			    do {
				if (argument_411_
				    < argument_403_[++argument_404_]) {
				    int anLocalInt_418_
					= argument_402_[argument_404_];
				    argument_402_[argument_404_]
					= ((anLocalInt_413_
					    | anLocalInt_418_ >> 24) << 24
					   | (argument_405_
					      + (((anLocalInt_418_ & 0xff00ff)
						  * anLocalInt) >> 8
						 & 0xff00ff)
					      + (((anLocalInt_418_ & 0xff00)
						  * anLocalInt) >> 8
						 & 0xff00)));
				    argument_403_[argument_404_]
					= argument_411_;
				}
				argument_411_ += argument_412_;
			    } while (--argument_406_ > 0);
			}
			break;
		    }
		    argument_406_ = argument_408_ - argument_407_;
		    if (((Class89) this).anInt646 == 0) {
			do {
			    if (argument_411_
				< argument_403_[++argument_404_]) {
				argument_402_[argument_404_]
				    = (HslToRgb.table2
				       [(int) argument_409_]);
				argument_403_[argument_404_] = argument_411_;
			    }
			    argument_411_ += argument_412_;
			    argument_409_ += argument_410_;
			} while (--argument_406_ > 0);
			break;
		    }
		    int anLocalInt = ((Class89) this).anInt646;
		    int anLocalInt_419_ = 256 - ((Class89) this).anInt646;
		    do {
			if (argument_411_ < argument_403_[++argument_404_]) {
			    argument_405_
				= HslToRgb.table2[(int) argument_409_];
			    argument_405_ = ((((argument_405_ & 0xff00ff)
					       * anLocalInt_419_) >> 8
					      & 0xff00ff)
					     + (((argument_405_ & 0xff00)
						 * anLocalInt_419_) >> 8
						& 0xff00));
			    int anLocalInt_420_ = argument_402_[argument_404_];
			    argument_402_[argument_404_]
				= (((anLocalInt_419_ | anLocalInt_420_ >> 24)
				    << 24)
				   | (argument_405_
				      + (((anLocalInt_420_ & 0xff00ff)
					  * anLocalInt) >> 8
					 & 0xff00ff)
				      + (((anLocalInt_420_ & 0xff00)
					  * anLocalInt) >> 8
					 & 0xff00)));
			    argument_403_[argument_404_] = argument_411_;
			}
			argument_409_ += argument_410_;
			argument_411_ += argument_412_;
		    } while (--argument_406_ > 0);
		} while (false);
	    } else {
		do {
		    if (((Class89) this).aBoolean647) {
			argument_406_ = argument_408_ - argument_407_ >> 2;
			argument_410_ *= 4.0F;
			if (((Class89) this).anInt646 == 0) {
			    if (argument_406_ > 0) {
				do {
				    argument_405_ = (HslToRgb.table2
						     [(int) argument_409_]);
				    argument_409_ += argument_410_;
				    if (argument_411_
					< argument_403_[++argument_404_])
					argument_402_[argument_404_]
					    = argument_405_;
				    argument_411_ += argument_412_;
				    if (argument_411_
					< argument_403_[++argument_404_])
					argument_402_[argument_404_]
					    = argument_405_;
				    argument_411_ += argument_412_;
				    if (argument_411_
					< argument_403_[++argument_404_])
					argument_402_[argument_404_]
					    = argument_405_;
				    argument_411_ += argument_412_;
				    if (argument_411_
					< argument_403_[++argument_404_])
					argument_402_[argument_404_]
					    = argument_405_;
				    argument_411_ += argument_412_;
				} while (--argument_406_ > 0);
			    }
			    argument_406_
				= argument_408_ - argument_407_ & 0x3;
			    if (argument_406_ > 0) {
				argument_405_ = (HslToRgb.table2
						 [(int) argument_409_]);
				do {
				    if (argument_411_
					< argument_403_[++argument_404_])
					argument_402_[argument_404_]
					    = argument_405_;
				    argument_411_ += argument_412_;
				} while (--argument_406_ > 0);
			    }
			} else {
			    int anLocalInt = ((Class89) this).anInt646;
			    int anLocalInt_421_
				= 256 - ((Class89) this).anInt646;
			    if (argument_406_ > 0) {
				do {
				    argument_405_ = (HslToRgb.table2
						     [(int) argument_409_]);
				    argument_409_ += argument_410_;
				    argument_405_
					= ((((argument_405_ & 0xff00ff)
					     * anLocalInt_421_) >> 8
					    & 0xff00ff)
					   + (((argument_405_ & 0xff00)
					       * anLocalInt_421_) >> 8
					      & 0xff00));
				    if (argument_411_
					< argument_403_[++argument_404_]) {
					int anLocalInt_422_
					    = argument_402_[argument_404_];
					argument_402_[argument_404_]
					    = ((anLocalInt_421_
						| anLocalInt_422_ >> 24) << 24
					       | (argument_405_
						  + (((anLocalInt_422_
						       & 0xff00ff) * anLocalInt
						      >> 8)
						     & 0xff00ff)
						  + (((anLocalInt_422_
						       & 0xff00) * anLocalInt
						      >> 8)
						     & 0xff00)));
				    }
				    argument_411_ += argument_412_;
				    if (argument_411_
					< argument_403_[++argument_404_]) {
					int anLocalInt_423_
					    = argument_402_[argument_404_];
					argument_402_[argument_404_]
					    = ((anLocalInt_421_
						| anLocalInt_423_ >> 24) << 24
					       | (argument_405_
						  + (((anLocalInt_423_
						       & 0xff00ff) * anLocalInt
						      >> 8)
						     & 0xff00ff)
						  + (((anLocalInt_423_
						       & 0xff00) * anLocalInt
						      >> 8)
						     & 0xff00)));
				    }
				    argument_411_ += argument_412_;
				    if (argument_411_
					< argument_403_[++argument_404_]) {
					int anLocalInt_424_
					    = argument_402_[argument_404_];
					argument_402_[argument_404_]
					    = ((anLocalInt_421_
						| anLocalInt_424_ >> 24) << 24
					       | (argument_405_
						  + (((anLocalInt_424_
						       & 0xff00ff) * anLocalInt
						      >> 8)
						     & 0xff00ff)
						  + (((anLocalInt_424_
						       & 0xff00) * anLocalInt
						      >> 8)
						     & 0xff00)));
				    }
				    argument_411_ += argument_412_;
				    if (argument_411_
					< argument_403_[++argument_404_]) {
					int anLocalInt_425_
					    = argument_402_[argument_404_];
					argument_402_[argument_404_]
					    = ((anLocalInt_421_
						| anLocalInt_425_ >> 24) << 24
					       | (argument_405_
						  + (((anLocalInt_425_
						       & 0xff00ff) * anLocalInt
						      >> 8)
						     & 0xff00ff)
						  + (((anLocalInt_425_
						       & 0xff00) * anLocalInt
						      >> 8)
						     & 0xff00)));
				    }
				    argument_411_ += argument_412_;
				} while (--argument_406_ > 0);
			    }
			    argument_406_
				= argument_408_ - argument_407_ & 0x3;
			    if (argument_406_ <= 0)
				break;
			    argument_405_
				= HslToRgb.table2[(int) argument_409_];
			    argument_405_ = ((((argument_405_ & 0xff00ff)
					       * anLocalInt_421_) >> 8
					      & 0xff00ff)
					     + (((argument_405_ & 0xff00)
						 * anLocalInt_421_) >> 8
						& 0xff00));
			    do {
				if (argument_411_
				    < argument_403_[++argument_404_]) {
				    int anLocalInt_426_
					= argument_402_[argument_404_];
				    argument_402_[argument_404_]
					= ((anLocalInt_421_
					    | anLocalInt_426_ >> 24) << 24
					   | (argument_405_
					      + (((anLocalInt_426_ & 0xff00ff)
						  * anLocalInt) >> 8
						 & 0xff00ff)
					      + (((anLocalInt_426_ & 0xff00)
						  * anLocalInt) >> 8
						 & 0xff00)));
				}
				argument_411_ += argument_412_;
			    } while (--argument_406_ > 0);
			}
			break;
		    }
		    argument_406_ = argument_408_ - argument_407_;
		    if (((Class89) this).anInt646 == 0) {
			do {
			    if (argument_411_ < argument_403_[++argument_404_])
				argument_402_[argument_404_]
				    = (HslToRgb.table2
				       [(int) argument_409_]);
			    argument_411_ += argument_412_;
			    argument_409_ += argument_410_;
			} while (--argument_406_ > 0);
			break;
		    }
		    int anLocalInt = ((Class89) this).anInt646;
		    int anLocalInt_427_ = 256 - ((Class89) this).anInt646;
		    do {
			if (argument_411_ < argument_403_[++argument_404_]) {
			    argument_405_
				= HslToRgb.table2[(int) argument_409_];
			    argument_405_ = ((((argument_405_ & 0xff00ff)
					       * anLocalInt_427_) >> 8
					      & 0xff00ff)
					     + (((argument_405_ & 0xff00)
						 * anLocalInt_427_) >> 8
						& 0xff00));
			    int anLocalInt_428_ = argument_402_[argument_404_];
			    argument_402_[argument_404_]
				= (((anLocalInt_427_ | anLocalInt_428_ >> 24)
				    << 24)
				   | (argument_405_
				      + (((anLocalInt_428_ & 0xff00ff)
					  * anLocalInt) >> 8
					 & 0xff00ff)
				      + (((anLocalInt_428_ & 0xff00)
					  * anLocalInt) >> 8
					 & 0xff00)));
			}
			argument_409_ += argument_410_;
			argument_411_ += argument_412_;
		    } while (--argument_406_ > 0);
		} while (false);
	    }
	}
    }
    
    final void method1666
	(float argument_429_, float argument_430_, float argument_431_,
	 float argument_432_, float argument_433_, float argument_434_,
	 float argument_435_, float argument_436_, float argument_437_,
	 float argument_438_, float argument_439_, float argument_440_,
	 float argument_441_, float argument_442_, float argument_443_,
	 int argument_444_, int argument_445_, int argument_446_,
	 int argument_447_, int argument_448_, int argument_449_,
	 int argument_450_, int argument_451_, float argument_452_,
	 int argument_453_, float argument_454_, int argument_455_,
	 float argument_456_) {
	if (argument_451_ != anInt662) {
	    anIntArray676 = aClass_ha__651.method2107(argument_451_);
	    if (anIntArray676 == null) {
		method1656
		    ((float) (int) argument_429_, (float) (int) argument_430_,
		     (float) (int) argument_431_, (float) (int) argument_432_,
		     (float) (int) argument_433_, (float) (int) argument_434_,
		     (float) (int) argument_435_, (float) (int) argument_436_,
		     (float) (int) argument_437_,
		     Statics.method2255((argument_447_ | argument_448_ << 24), argument_444_),
		     Statics.method2255((argument_447_ | argument_449_ << 24), argument_445_),
		     Statics.method2255((argument_447_ | argument_450_ << 24), argument_446_));
		return;
	    }
	    anInt663 = (aClass_ha__651.method2111(argument_451_) ? 64
			: ((JavaToolkit) aClass_ha__651).anInt4655);
	    anInt666 = anInt663 - 1;
	    anInt675 = aClass_ha__651.method2110(argument_451_);
	}
	aFloat679 = argument_452_;
	if (argument_453_ != anInt665) {
	    anIntArray669 = aClass_ha__651.method2107(argument_453_);
	    if (anIntArray669 == null) {
		method1656
		    ((float) (int) argument_429_, (float) (int) argument_430_,
		     (float) (int) argument_431_, (float) (int) argument_432_,
		     (float) (int) argument_433_, (float) (int) argument_434_,
		     (float) (int) argument_435_, (float) (int) argument_436_,
		     (float) (int) argument_437_,
		     Statics.method2255((argument_447_ | argument_448_ << 24), argument_444_),
		     Statics.method2255((argument_447_ | argument_449_ << 24), argument_445_),
		     Statics.method2255((argument_447_ | argument_450_ << 24), argument_446_));
		return;
	    }
	    anInt671 = (aClass_ha__651.method2111(argument_453_) ? 64
			: ((JavaToolkit) aClass_ha__651).anInt4655);
	    anInt673 = anInt671 - 1;
	}
	aFloat667 = argument_454_;
	if (argument_455_ != anInt674) {
	    anIntArray664 = aClass_ha__651.method2107(argument_455_);
	    if (anIntArray664 == null) {
		method1656
		    ((float) (int) argument_429_, (float) (int) argument_430_,
		     (float) (int) argument_431_, (float) (int) argument_432_,
		     (float) (int) argument_433_, (float) (int) argument_434_,
		     (float) (int) argument_435_, (float) (int) argument_436_,
		     (float) (int) argument_437_,
		     Statics.method2255((argument_447_ | argument_448_ << 24), argument_444_),
		     Statics.method2255((argument_447_ | argument_449_ << 24), argument_445_),
		     Statics.method2255((argument_447_ | argument_450_ << 24), argument_446_));
		return;
	    }
	    anInt678 = (aClass_ha__651.method2111(argument_455_) ? 64
			: ((JavaToolkit) aClass_ha__651).anInt4655);
	    anInt670 = anInt678 - 1;
	}
	aFloat677 = argument_456_;
	anInt668 = argument_447_;
	float f = (float) (argument_444_ >> 24 & 0xff);
	float f_457_ = (float) (argument_445_ >> 24 & 0xff);
	float f_458_ = (float) (argument_446_ >> 24 & 0xff);
	float f_459_ = (float) (argument_444_ >> 16 & 0xff);
	float f_460_ = (float) (argument_445_ >> 16 & 0xff);
	float f_461_ = (float) (argument_446_ >> 16 & 0xff);
	float f_462_ = (float) (argument_444_ >> 8 & 0xff);
	float f_463_ = (float) (argument_445_ >> 8 & 0xff);
	float f_464_ = (float) (argument_446_ >> 8 & 0xff);
	float f_465_ = (float) (argument_444_ & 0xff);
	float f_466_ = (float) (argument_445_ & 0xff);
	float f_467_ = (float) (argument_446_ & 0xff);
	argument_438_ /= argument_435_;
	argument_439_ /= argument_436_;
	argument_440_ /= argument_437_;
	argument_441_ /= argument_435_;
	argument_442_ /= argument_436_;
	argument_443_ /= argument_437_;
	argument_435_ = 1.0F / argument_435_;
	argument_436_ = 1.0F / argument_436_;
	argument_437_ = 1.0F / argument_437_;
	float f_468_ = 1.0F;
	float f_469_ = 0.0F;
	float f_470_ = 0.0F;
	float f_471_ = 0.0F;
	float f_472_ = 1.0F;
	float f_473_ = 0.0F;
	float f_474_ = 0.0F;
	float f_475_ = 0.0F;
	float f_476_ = 0.0F;
	float f_477_ = 0.0F;
	float f_478_ = 0.0F;
	float f_479_ = 0.0F;
	float f_480_ = 0.0F;
	float f_481_ = 0.0F;
	float f_482_ = 0.0F;
	float f_483_ = 0.0F;
	float f_484_ = 0.0F;
	if (argument_430_ != argument_429_) {
	    float f_485_ = argument_430_ - argument_429_;
	    f_474_ = (argument_433_ - argument_432_) / f_485_;
	    f_475_ = (argument_436_ - argument_435_) / f_485_;
	    f_476_ = (argument_439_ - argument_438_) / f_485_;
	    f_477_ = (argument_442_ - argument_441_) / f_485_;
	    f_478_ = (float) (argument_449_ - argument_448_) / f_485_;
	    f_479_ = (f_457_ - f) / f_485_;
	    f_480_ = (f_460_ - f_459_) / f_485_;
	    f_481_ = (f_463_ - f_462_) / f_485_;
	    f_482_ = (f_466_ - f_465_) / f_485_;
	    f_483_ = (f_469_ - f_468_) / f_485_;
	    f_484_ = (f_472_ - f_471_) / f_485_;
	}
	float f_486_ = 0.0F;
	float f_487_ = 0.0F;
	float f_488_ = 0.0F;
	float f_489_ = 0.0F;
	float f_490_ = 0.0F;
	float f_491_ = 0.0F;
	float f_492_ = 0.0F;
	float f_493_ = 0.0F;
	float f_494_ = 0.0F;
	float f_495_ = 0.0F;
	float f_496_ = 0.0F;
	if (argument_431_ != argument_430_) {
	    float f_497_ = argument_431_ - argument_430_;
	    f_486_ = (argument_434_ - argument_433_) / f_497_;
	    f_487_ = (argument_437_ - argument_436_) / f_497_;
	    f_488_ = (argument_440_ - argument_439_) / f_497_;
	    f_489_ = (argument_443_ - argument_442_) / f_497_;
	    f_490_ = (float) (argument_450_ - argument_449_) / f_497_;
	    f_491_ = (f_458_ - f_457_) / f_497_;
	    f_492_ = (f_461_ - f_460_) / f_497_;
	    f_493_ = (f_464_ - f_463_) / f_497_;
	    f_494_ = (f_467_ - f_466_) / f_497_;
	    f_495_ = (f_470_ - f_469_) / f_497_;
	    f_496_ = (f_473_ - f_472_) / f_497_;
	}
	float f_498_ = 0.0F;
	float f_499_ = 0.0F;
	float f_500_ = 0.0F;
	float f_501_ = 0.0F;
	float f_502_ = 0.0F;
	float f_503_ = 0.0F;
	float f_504_ = 0.0F;
	float f_505_ = 0.0F;
	float f_506_ = 0.0F;
	float f_507_ = 0.0F;
	float f_508_ = 0.0F;
	if (argument_429_ != argument_431_) {
	    float f_509_ = argument_429_ - argument_431_;
	    f_498_ = (argument_432_ - argument_434_) / f_509_;
	    f_499_ = (argument_435_ - argument_437_) / f_509_;
	    f_500_ = (argument_438_ - argument_440_) / f_509_;
	    f_501_ = (argument_441_ - argument_443_) / f_509_;
	    f_502_ = (float) (argument_448_ - argument_450_) / f_509_;
	    f_503_ = (f - f_458_) / f_509_;
	    f_504_ = (f_459_ - f_461_) / f_509_;
	    f_505_ = (f_462_ - f_464_) / f_509_;
	    f_506_ = (f_465_ - f_467_) / f_509_;
	    f_507_ = (f_468_ - f_470_) / f_509_;
	    f_508_ = (f_471_ - f_473_) / f_509_;
	}
	if (argument_429_ <= argument_430_ && argument_429_ <= argument_431_) {
	    if (!(argument_429_ >= (float) ((Class89) this).anInt653)) {
		if (argument_430_ > (float) ((Class89) this).anInt653)
		    argument_430_ = (float) ((Class89) this).anInt653;
		if (argument_431_ > (float) ((Class89) this).anInt653)
		    argument_431_ = (float) ((Class89) this).anInt653;
		if (argument_430_ < argument_431_) {
		    argument_434_ = argument_432_;
		    argument_437_ = argument_435_;
		    argument_440_ = argument_438_;
		    argument_443_ = argument_441_;
		    argument_450_ = argument_448_;
		    f_458_ = f;
		    f_461_ = f_459_;
		    f_464_ = f_462_;
		    f_467_ = f_465_;
		    f_470_ = f_468_;
		    f_473_ = f_471_;
		    if (argument_429_ < 0.0F) {
			argument_432_ -= f_474_ * argument_429_;
			argument_434_ -= f_498_ * argument_429_;
			argument_435_ -= f_475_ * argument_429_;
			argument_437_ -= f_499_ * argument_429_;
			argument_438_ -= f_476_ * argument_429_;
			argument_440_ -= f_500_ * argument_429_;
			argument_441_ -= f_477_ * argument_429_;
			argument_443_ -= f_501_ * argument_429_;
			argument_448_ -= f_478_ * argument_429_;
			argument_450_ -= f_502_ * argument_429_;
			f -= f_479_ * argument_429_;
			f_458_ -= f_503_ * argument_429_;
			f_459_ -= f_480_ * argument_429_;
			f_461_ -= f_504_ * argument_429_;
			f_462_ -= f_481_ * argument_429_;
			f_464_ -= f_505_ * argument_429_;
			f_465_ -= f_482_ * argument_429_;
			f_467_ -= f_506_ * argument_429_;
			f_468_ -= f_483_ * argument_429_;
			f_470_ -= f_507_ * argument_429_;
			f_471_ -= f_484_ * argument_429_;
			f_473_ -= f_508_ * argument_429_;
			argument_429_ = 0.0F;
		    }
		    if (argument_430_ < 0.0F) {
			argument_433_ -= f_486_ * argument_430_;
			argument_436_ -= f_487_ * argument_430_;
			argument_439_ -= f_488_ * argument_430_;
			argument_442_ -= f_489_ * argument_430_;
			argument_449_ -= f_490_ * argument_430_;
			f_457_ -= f_491_ * argument_430_;
			f_460_ -= f_492_ * argument_430_;
			f_463_ -= f_493_ * argument_430_;
			f_466_ -= f_494_ * argument_430_;
			f_469_ -= f_495_ * argument_430_;
			f_472_ -= f_496_ * argument_430_;
			argument_430_ = 0.0F;
		    }
		    if (argument_429_ != argument_430_ && f_498_ < f_474_
			|| argument_429_ == argument_430_ && f_498_ > f_486_) {
			argument_431_ -= argument_430_;
			argument_430_ -= argument_429_;
			argument_429_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_429_]);
			while (--argument_430_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_429_,
				       (int) argument_434_,
				       (int) argument_432_, argument_437_,
				       argument_435_, argument_440_,
				       argument_438_, argument_443_,
				       argument_441_, (float) argument_450_,
				       (float) argument_448_, f_458_, f,
				       f_461_, f_459_, f_464_, f_462_, f_467_,
				       f_465_, f_470_, f_468_, f_473_, f_471_);
			    argument_432_ += f_474_;
			    argument_434_ += f_498_;
			    argument_435_ += f_475_;
			    argument_437_ += f_499_;
			    argument_438_ += f_476_;
			    argument_440_ += f_500_;
			    argument_441_ += f_477_;
			    argument_443_ += f_501_;
			    argument_448_ += f_478_;
			    argument_450_ += f_502_;
			    f += f_479_;
			    f_458_ += f_503_;
			    f_459_ += f_480_;
			    f_461_ += f_504_;
			    f_462_ += f_481_;
			    f_464_ += f_505_;
			    f_465_ += f_482_;
			    f_467_ += f_506_;
			    f_468_ += f_483_;
			    f_470_ += f_507_;
			    f_471_ += f_484_;
			    f_473_ += f_484_;
			    argument_429_ += (float) anInt652;
			}
			while (--argument_431_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_429_,
				       (int) argument_434_,
				       (int) argument_433_, argument_437_,
				       argument_436_, argument_440_,
				       argument_439_, argument_443_,
				       argument_442_, (float) argument_450_,
				       (float) argument_449_, f_458_, f_457_,
				       f_461_, f_460_, f_464_, f_463_, f_467_,
				       f_466_, f_470_, f_469_, f_473_, f_472_);
			    argument_433_ += f_486_;
			    argument_434_ += f_498_;
			    argument_436_ += f_487_;
			    argument_437_ += f_499_;
			    argument_439_ += f_488_;
			    argument_440_ += f_500_;
			    argument_442_ += f_489_;
			    argument_443_ += f_501_;
			    argument_449_ += f_490_;
			    argument_450_ += f_502_;
			    f_457_ += f_491_;
			    f_458_ += f_503_;
			    f_460_ += f_492_;
			    f_461_ += f_504_;
			    f_463_ += f_493_;
			    f_464_ += f_505_;
			    f_466_ += f_494_;
			    f_467_ += f_506_;
			    f_469_ += f_495_;
			    f_470_ += f_507_;
			    f_472_ += f_496_;
			    f_473_ += f_508_;
			    argument_429_ += (float) anInt652;
			}
		    } else {
			argument_431_ -= argument_430_;
			argument_430_ -= argument_429_;
			argument_429_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_429_]);
			while (--argument_430_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_429_,
				       (int) argument_432_,
				       (int) argument_434_, argument_435_,
				       argument_437_, argument_438_,
				       argument_440_, argument_441_,
				       argument_443_, (float) argument_448_,
				       (float) argument_450_, f, f_458_,
				       f_459_, f_461_, f_462_, f_464_, f_465_,
				       f_467_, f_468_, f_470_, f_471_, f_473_);
			    argument_432_ += f_474_;
			    argument_434_ += f_498_;
			    argument_435_ += f_475_;
			    argument_437_ += f_499_;
			    argument_438_ += f_476_;
			    argument_440_ += f_500_;
			    argument_441_ += f_477_;
			    argument_443_ += f_501_;
			    argument_448_ += f_478_;
			    argument_450_ += f_502_;
			    f += f_479_;
			    f_458_ += f_503_;
			    f_459_ += f_480_;
			    f_461_ += f_504_;
			    f_462_ += f_481_;
			    f_464_ += f_505_;
			    f_465_ += f_482_;
			    f_467_ += f_506_;
			    f_468_ += f_483_;
			    f_470_ += f_507_;
			    f_471_ += f_484_;
			    f_473_ += f_508_;
			    argument_429_ += (float) anInt652;
			}
			while (--argument_431_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_429_,
				       (int) argument_433_,
				       (int) argument_434_, argument_436_,
				       argument_437_, argument_439_,
				       argument_440_, argument_442_,
				       argument_443_, (float) argument_449_,
				       (float) argument_450_, f_457_, f_458_,
				       f_460_, f_461_, f_463_, f_464_, f_466_,
				       f_467_, f_469_, f_470_, f_472_, f_473_);
			    argument_433_ += f_486_;
			    argument_434_ += f_498_;
			    argument_436_ += f_487_;
			    argument_437_ += f_499_;
			    argument_439_ += f_488_;
			    argument_440_ += f_500_;
			    argument_442_ += f_489_;
			    argument_443_ += f_501_;
			    argument_449_ += f_490_;
			    argument_450_ += f_502_;
			    f_457_ += f_491_;
			    f_458_ += f_503_;
			    f_460_ += f_492_;
			    f_461_ += f_504_;
			    f_463_ += f_493_;
			    f_464_ += f_505_;
			    f_466_ += f_494_;
			    f_467_ += f_506_;
			    f_469_ += f_495_;
			    f_470_ += f_507_;
			    f_472_ += f_496_;
			    f_473_ += f_508_;
			    argument_429_ += (float) anInt652;
			}
		    }
		} else {
		    argument_433_ = argument_432_;
		    argument_436_ = argument_435_;
		    argument_439_ = argument_438_;
		    argument_442_ = argument_441_;
		    argument_449_ = argument_448_;
		    f_457_ = f;
		    f_460_ = f_459_;
		    f_463_ = f_462_;
		    f_466_ = f_465_;
		    f_469_ = f_468_;
		    f_472_ = f_471_;
		    if (argument_429_ < 0.0F) {
			argument_432_ -= f_474_ * argument_429_;
			argument_433_ -= f_498_ * argument_429_;
			argument_435_ -= f_475_ * argument_429_;
			argument_436_ -= f_499_ * argument_429_;
			argument_438_ -= f_476_ * argument_429_;
			argument_439_ -= f_500_ * argument_429_;
			argument_441_ -= f_477_ * argument_429_;
			argument_442_ -= f_501_ * argument_429_;
			argument_448_ -= f_478_ * argument_429_;
			argument_449_ -= f_502_ * argument_429_;
			f -= f_479_ * argument_429_;
			f_457_ -= f_503_ * argument_429_;
			f_459_ -= f_480_ * argument_429_;
			f_460_ -= f_504_ * argument_429_;
			f_462_ -= f_481_ * argument_429_;
			f_463_ -= f_505_ * argument_429_;
			f_465_ -= f_482_ * argument_429_;
			f_466_ -= f_506_ * argument_429_;
			f_468_ -= f_483_ * argument_429_;
			f_469_ -= f_507_ * argument_429_;
			f_471_ -= f_484_ * argument_429_;
			f_472_ -= f_508_ * argument_429_;
			argument_429_ = 0.0F;
		    }
		    if (argument_431_ < 0.0F) {
			argument_434_ -= f_486_ * argument_431_;
			argument_437_ -= f_487_ * argument_431_;
			argument_440_ -= f_488_ * argument_431_;
			argument_443_ -= f_489_ * argument_431_;
			argument_450_ -= f_490_ * argument_431_;
			f_458_ -= f_491_ * argument_431_;
			f_461_ -= f_492_ * argument_431_;
			f_464_ -= f_493_ * argument_431_;
			f_467_ -= f_494_ * argument_431_;
			f_470_ -= f_495_ * argument_431_;
			f_473_ -= f_496_ * argument_431_;
			argument_431_ = 0.0F;
		    }
		    if (argument_429_ != argument_431_ && f_498_ < f_474_
			|| argument_429_ == argument_431_ && f_486_ > f_474_) {
			argument_430_ -= argument_431_;
			argument_431_ -= argument_429_;
			argument_429_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_429_]);
			while (--argument_431_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_429_,
				       (int) argument_433_,
				       (int) argument_432_, argument_436_,
				       argument_435_, argument_439_,
				       argument_438_, argument_442_,
				       argument_441_, (float) argument_449_,
				       (float) argument_448_, f_457_, f,
				       f_460_, f_459_, f_463_, f_462_, f_466_,
				       f_465_, f_469_, f_468_, f_472_, f_471_);
			    argument_432_ += f_474_;
			    argument_433_ += f_498_;
			    argument_435_ += f_475_;
			    argument_436_ += f_499_;
			    argument_438_ += f_476_;
			    argument_439_ += f_500_;
			    argument_441_ += f_477_;
			    argument_442_ += f_501_;
			    argument_448_ += f_478_;
			    argument_449_ += f_502_;
			    f += f_479_;
			    f_457_ += f_503_;
			    f_459_ += f_480_;
			    f_460_ += f_504_;
			    f_462_ += f_481_;
			    f_463_ += f_505_;
			    f_465_ += f_482_;
			    f_466_ += f_506_;
			    f_468_ += f_483_;
			    f_469_ += f_507_;
			    f_471_ += f_484_;
			    f_472_ += f_508_;
			    argument_429_ += (float) anInt652;
			}
			while (--argument_430_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_429_,
				       (int) argument_434_,
				       (int) argument_432_, argument_437_,
				       argument_435_, argument_440_,
				       argument_438_, argument_443_,
				       argument_441_, (float) argument_450_,
				       (float) argument_448_, f_458_, f,
				       f_461_, f_459_, f_464_, f_462_, f_467_,
				       f_465_, f_470_, f_468_, f_473_, f_471_);
			    argument_434_ += f_486_;
			    argument_432_ += f_474_;
			    argument_437_ += f_487_;
			    argument_435_ += f_475_;
			    argument_440_ += f_488_;
			    argument_438_ += f_476_;
			    argument_443_ += f_489_;
			    argument_441_ += f_477_;
			    argument_450_ += f_490_;
			    argument_448_ += f_478_;
			    f_458_ += f_491_;
			    f += f_479_;
			    f_461_ += f_492_;
			    f_459_ += f_480_;
			    f_464_ += f_493_;
			    f_462_ += f_481_;
			    f_467_ += f_494_;
			    f_465_ += f_482_;
			    f_470_ += f_495_;
			    f_468_ += f_483_;
			    f_473_ += f_496_;
			    f_471_ += f_484_;
			    argument_429_ += (float) anInt652;
			}
		    } else {
			argument_430_ -= argument_431_;
			argument_431_ -= argument_429_;
			argument_429_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_429_]);
			while (--argument_431_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_429_,
				       (int) argument_432_,
				       (int) argument_433_, argument_435_,
				       argument_436_, argument_438_,
				       argument_439_, argument_441_,
				       argument_442_, (float) argument_448_,
				       (float) argument_449_, f, f_457_,
				       f_459_, f_460_, f_462_, f_463_, f_465_,
				       f_466_, f_468_, f_469_, f_471_, f_472_);
			    argument_433_ += f_498_;
			    argument_432_ += f_474_;
			    argument_436_ += f_499_;
			    argument_435_ += f_475_;
			    argument_439_ += f_500_;
			    argument_438_ += f_476_;
			    argument_442_ += f_501_;
			    argument_441_ += f_477_;
			    argument_449_ += f_502_;
			    argument_448_ += f_478_;
			    f_457_ += f_503_;
			    f += f_479_;
			    f_460_ += f_504_;
			    f_459_ += f_480_;
			    f_463_ += f_505_;
			    f_462_ += f_481_;
			    f_466_ += f_506_;
			    f_465_ += f_482_;
			    f_469_ += f_507_;
			    f_468_ += f_483_;
			    f_472_ += f_508_;
			    f_471_ += f_484_;
			    argument_429_ += (float) anInt652;
			}
			while (--argument_430_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_429_,
				       (int) argument_432_,
				       (int) argument_434_, argument_435_,
				       argument_437_, argument_438_,
				       argument_440_, argument_441_,
				       argument_443_, (float) argument_448_,
				       (float) argument_450_, f, f_458_,
				       f_459_, f_461_, f_462_, f_464_, f_465_,
				       f_467_, f_468_, f_470_, f_471_, f_473_);
			    argument_432_ += f_474_;
			    argument_434_ += f_486_;
			    argument_435_ += f_475_;
			    argument_437_ += f_487_;
			    argument_438_ += f_476_;
			    argument_440_ += f_488_;
			    argument_441_ += f_477_;
			    argument_443_ += f_489_;
			    argument_448_ += f_478_;
			    argument_450_ += f_490_;
			    f += f_479_;
			    f_458_ += f_491_;
			    f_459_ += f_480_;
			    f_461_ += f_492_;
			    f_462_ += f_481_;
			    f_464_ += f_493_;
			    f_465_ += f_482_;
			    f_467_ += f_494_;
			    f_468_ += f_483_;
			    f_470_ += f_495_;
			    f_471_ += f_484_;
			    f_473_ += f_496_;
			    argument_429_ += (float) anInt652;
			}
		    }
		}
	    }
	} else if (argument_430_ <= argument_431_) {
	    if (!(argument_430_ >= (float) ((Class89) this).anInt653)) {
		if (argument_431_ > (float) ((Class89) this).anInt653)
		    argument_431_ = (float) ((Class89) this).anInt653;
		if (argument_429_ > (float) ((Class89) this).anInt653)
		    argument_429_ = (float) ((Class89) this).anInt653;
		if (argument_431_ < argument_429_) {
		    argument_432_ = argument_433_;
		    argument_435_ = argument_436_;
		    argument_438_ = argument_439_;
		    argument_441_ = argument_442_;
		    argument_448_ = argument_449_;
		    f = f_457_;
		    f_459_ = f_460_;
		    f_462_ = f_463_;
		    f_465_ = f_466_;
		    f_468_ = f_469_;
		    f_471_ = f_472_;
		    if (argument_430_ < 0.0F) {
			argument_432_ -= f_474_ * argument_430_;
			argument_433_ -= f_486_ * argument_430_;
			argument_435_ -= f_475_ * argument_430_;
			argument_436_ -= f_487_ * argument_430_;
			argument_438_ -= f_476_ * argument_430_;
			argument_439_ -= f_488_ * argument_430_;
			argument_441_ -= f_477_ * argument_430_;
			argument_442_ -= f_489_ * argument_430_;
			argument_448_ -= f_478_ * argument_430_;
			argument_449_ -= f_490_ * argument_430_;
			f -= f_479_ * argument_430_;
			f_457_ -= f_491_ * argument_430_;
			f_459_ -= f_480_ * argument_430_;
			f_460_ -= f_492_ * argument_430_;
			f_462_ -= f_481_ * argument_430_;
			f_463_ -= f_493_ * argument_430_;
			f_465_ -= f_482_ * argument_430_;
			f_466_ -= f_494_ * argument_430_;
			f_468_ -= f_483_ * argument_430_;
			f_469_ -= f_495_ * argument_430_;
			f_471_ -= f_484_ * argument_430_;
			f_472_ -= f_496_ * argument_430_;
			argument_430_ = 0.0F;
		    }
		    if (argument_431_ < 0.0F) {
			argument_434_ -= f_498_ * argument_431_;
			argument_437_ -= f_499_ * argument_431_;
			argument_440_ -= f_500_ * argument_431_;
			argument_443_ -= f_501_ * argument_431_;
			argument_450_ -= f_502_ * argument_431_;
			f_458_ -= f_503_ * argument_431_;
			f_461_ -= f_504_ * argument_431_;
			f_464_ -= f_505_ * argument_431_;
			f_467_ -= f_506_ * argument_431_;
			f_470_ -= f_507_ * argument_431_;
			f_473_ -= f_508_ * argument_431_;
			argument_431_ = 0.0F;
		    }
		    if (argument_430_ != argument_431_ && f_474_ < f_486_
			|| argument_430_ == argument_431_ && f_474_ > f_498_) {
			argument_429_ -= argument_431_;
			argument_431_ -= argument_430_;
			argument_430_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_430_]);
			while (--argument_431_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_430_,
				       (int) argument_432_,
				       (int) argument_433_, argument_435_,
				       argument_436_, argument_438_,
				       argument_439_, argument_441_,
				       argument_442_, (float) argument_448_,
				       (float) argument_449_, f, f_457_,
				       f_459_, f_460_, f_462_, f_463_, f_465_,
				       f_466_, f_468_, f_469_, f_471_, f_472_);
			    argument_432_ += f_474_;
			    argument_433_ += f_486_;
			    argument_435_ += f_475_;
			    argument_436_ += f_487_;
			    argument_438_ += f_476_;
			    argument_439_ += f_488_;
			    argument_441_ += f_477_;
			    argument_442_ += f_489_;
			    argument_448_ += f_478_;
			    argument_449_ += f_490_;
			    f += f_479_;
			    f_457_ += f_491_;
			    f_459_ += f_480_;
			    f_460_ += f_492_;
			    f_462_ += f_481_;
			    f_463_ += f_493_;
			    f_465_ += f_482_;
			    f_466_ += f_494_;
			    f_468_ += f_483_;
			    f_469_ += f_495_;
			    f_471_ += f_484_;
			    f_472_ += f_496_;
			    argument_430_ += (float) anInt652;
			}
			while (--argument_429_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_430_,
				       (int) argument_432_,
				       (int) argument_434_, argument_435_,
				       argument_437_, argument_438_,
				       argument_440_, argument_441_,
				       argument_443_, (float) argument_448_,
				       (float) argument_450_, f, f_458_,
				       f_459_, f_461_, f_462_, f_464_, f_465_,
				       f_467_, f_468_, f_470_, f_471_, f_473_);
			    argument_432_ += f_474_;
			    argument_434_ += f_498_;
			    argument_435_ += f_475_;
			    argument_437_ += f_499_;
			    argument_438_ += f_476_;
			    argument_440_ += f_500_;
			    argument_441_ += f_477_;
			    argument_443_ += f_501_;
			    argument_448_ += f_478_;
			    argument_450_ += f_502_;
			    f += f_479_;
			    f_458_ += f_503_;
			    f_459_ += f_480_;
			    f_461_ += f_504_;
			    f_462_ += f_481_;
			    f_464_ += f_505_;
			    f_465_ += f_482_;
			    f_467_ += f_506_;
			    f_468_ += f_483_;
			    f_470_ += f_507_;
			    f_471_ += f_484_;
			    f_473_ += f_508_;
			    argument_430_ += (float) anInt652;
			}
		    } else {
			argument_429_ -= argument_431_;
			argument_431_ -= argument_430_;
			argument_430_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_430_]);
			while (--argument_431_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_430_,
				       (int) argument_433_,
				       (int) argument_432_, argument_436_,
				       argument_435_, argument_439_,
				       argument_438_, argument_442_,
				       argument_441_, (float) argument_449_,
				       (float) argument_448_, f_457_, f,
				       f_460_, f_459_, f_463_, f_462_, f_466_,
				       f_465_, f_469_, f_468_, f_472_, f_471_);
			    argument_433_ += f_486_;
			    argument_432_ += f_474_;
			    argument_436_ += f_487_;
			    argument_435_ += f_475_;
			    argument_439_ += f_488_;
			    argument_438_ += f_476_;
			    argument_442_ += f_489_;
			    argument_441_ += f_477_;
			    argument_449_ += f_490_;
			    argument_448_ += f_478_;
			    f_457_ += f_491_;
			    f += f_479_;
			    f_460_ += f_492_;
			    f_459_ += f_480_;
			    f_463_ += f_493_;
			    f_462_ += f_481_;
			    f_466_ += f_494_;
			    f_465_ += f_482_;
			    f_470_ += f_495_;
			    f_468_ += f_483_;
			    f_472_ += f_496_;
			    f_471_ += f_484_;
			    argument_430_ += (float) anInt652;
			}
			while (--argument_429_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_430_,
				       (int) argument_434_,
				       (int) argument_432_, argument_437_,
				       argument_435_, argument_440_,
				       argument_438_, argument_443_,
				       argument_441_, (float) argument_450_,
				       (float) argument_448_, f_458_, f,
				       f_461_, f_459_, f_464_, f_462_, f_467_,
				       f_465_, f_470_, f_468_, f_473_, f_471_);
			    argument_434_ += f_498_;
			    argument_432_ += f_474_;
			    argument_437_ += f_499_;
			    argument_435_ += f_475_;
			    argument_440_ += f_500_;
			    argument_438_ += f_476_;
			    argument_443_ += f_501_;
			    argument_441_ += f_477_;
			    argument_450_ += f_502_;
			    argument_448_ += f_478_;
			    f_458_ += f_503_;
			    f += f_479_;
			    f_461_ += f_504_;
			    f_459_ += f_480_;
			    f_464_ += f_505_;
			    f_462_ += f_481_;
			    f_467_ += f_506_;
			    f_465_ += f_482_;
			    f_470_ += f_507_;
			    f_468_ += f_483_;
			    f_473_ += f_508_;
			    f_471_ += f_484_;
			    argument_430_ += (float) anInt652;
			}
		    }
		} else {
		    argument_434_ = argument_433_;
		    argument_437_ = argument_436_;
		    argument_440_ = argument_439_;
		    argument_443_ = argument_442_;
		    argument_450_ = argument_449_;
		    f_458_ = f_457_;
		    f_461_ = f_460_;
		    f_464_ = f_463_;
		    f_467_ = f_466_;
		    f_470_ = f_469_;
		    f_473_ = f_472_;
		    if (argument_430_ < 0.0F) {
			argument_434_ -= f_474_ * argument_430_;
			argument_433_ -= f_486_ * argument_430_;
			argument_437_ -= f_475_ * argument_430_;
			argument_436_ -= f_487_ * argument_430_;
			argument_440_ -= f_476_ * argument_430_;
			argument_439_ -= f_488_ * argument_430_;
			argument_443_ -= f_477_ * argument_430_;
			argument_442_ -= f_489_ * argument_430_;
			argument_450_ -= f_478_ * argument_430_;
			argument_449_ -= f_490_ * argument_430_;
			f_458_ -= f_479_ * argument_430_;
			f_457_ -= f_491_ * argument_430_;
			f_461_ -= f_480_ * argument_430_;
			f_460_ -= f_492_ * argument_430_;
			f_464_ -= f_481_ * argument_430_;
			f_463_ -= f_493_ * argument_430_;
			f_467_ -= f_482_ * argument_430_;
			f_466_ -= f_494_ * argument_430_;
			f_470_ -= f_483_ * argument_430_;
			f_469_ -= f_495_ * argument_430_;
			f_473_ -= f_484_ * argument_430_;
			f_472_ -= f_496_ * argument_430_;
			argument_430_ = 0.0F;
		    }
		    if (argument_429_ < 0.0F) {
			argument_432_ -= f_498_ * argument_429_;
			argument_435_ -= f_499_ * argument_429_;
			argument_438_ -= f_500_ * argument_429_;
			argument_441_ -= f_501_ * argument_429_;
			argument_448_ -= f_502_ * argument_429_;
			f -= f_503_ * argument_429_;
			f_459_ -= f_504_ * argument_429_;
			f_462_ -= f_505_ * argument_429_;
			f_465_ -= f_506_ * argument_429_;
			f_468_ -= f_507_ * argument_429_;
			f_471_ -= f_508_ * argument_429_;
			argument_429_ = 0.0F;
		    }
		    argument_431_ -= argument_429_;
		    argument_429_ -= argument_430_;
		    argument_430_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_430_]);
		    if (f_474_ < f_486_) {
			while (--argument_429_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_430_,
				       (int) argument_434_,
				       (int) argument_433_, argument_437_,
				       argument_436_, argument_440_,
				       argument_439_, argument_443_,
				       argument_442_, (float) argument_450_,
				       (float) argument_449_, f_458_, f_457_,
				       f_461_, f_460_, f_464_, f_463_, f_467_,
				       f_466_, f_470_, f_469_, f_473_, f_472_);
			    argument_434_ += f_474_;
			    argument_433_ += f_486_;
			    argument_437_ += f_475_;
			    argument_436_ += f_487_;
			    argument_440_ += f_476_;
			    argument_439_ += f_488_;
			    argument_443_ += f_477_;
			    argument_442_ += f_489_;
			    argument_450_ += f_478_;
			    argument_449_ += f_490_;
			    f_458_ += f_479_;
			    f_457_ += f_491_;
			    f_461_ += f_480_;
			    f_460_ += f_492_;
			    f_464_ += f_481_;
			    f_463_ += f_493_;
			    f_467_ += f_482_;
			    f_466_ += f_494_;
			    f_470_ += f_483_;
			    f_469_ += f_495_;
			    f_473_ += f_484_;
			    f_472_ += f_496_;
			    argument_430_ += (float) anInt652;
			}
			while (--argument_431_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_430_,
				       (int) argument_432_,
				       (int) argument_433_, argument_435_,
				       argument_436_, argument_438_,
				       argument_439_, argument_441_,
				       argument_442_, (float) argument_448_,
				       (float) argument_449_, f, f_457_,
				       f_459_, f_460_, f_462_, f_463_, f_465_,
				       f_466_, f_468_, f_469_, f_471_, f_472_);
			    argument_432_ += f_498_;
			    argument_433_ += f_486_;
			    argument_435_ += f_499_;
			    argument_436_ += f_487_;
			    argument_438_ += f_500_;
			    argument_439_ += f_488_;
			    argument_441_ += f_501_;
			    argument_442_ += f_489_;
			    argument_448_ += f_502_;
			    argument_449_ += f_490_;
			    f += f_503_;
			    f_457_ += f_491_;
			    f_459_ += f_504_;
			    f_460_ += f_492_;
			    f_462_ += f_505_;
			    f_463_ += f_493_;
			    f_465_ += f_506_;
			    f_466_ += f_494_;
			    f_468_ += f_507_;
			    f_469_ += f_495_;
			    f_471_ += f_508_;
			    f_472_ += f_496_;
			    argument_430_ += (float) anInt652;
			}
		    } else {
			while (--argument_429_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_430_,
				       (int) argument_433_,
				       (int) argument_434_, argument_436_,
				       argument_437_, argument_439_,
				       argument_440_, argument_442_,
				       argument_443_, (float) argument_449_,
				       (float) argument_450_, f_457_, f_458_,
				       f_460_, f_461_, f_463_, f_464_, f_466_,
				       f_467_, f_469_, f_470_, f_472_, f_473_);
			    argument_433_ += f_486_;
			    argument_434_ += f_474_;
			    argument_436_ += f_487_;
			    argument_437_ += f_475_;
			    argument_439_ += f_488_;
			    argument_440_ += f_476_;
			    argument_442_ += f_489_;
			    argument_443_ += f_477_;
			    argument_449_ += f_490_;
			    argument_450_ += f_478_;
			    f_457_ += f_491_;
			    f_458_ += f_479_;
			    f_460_ += f_492_;
			    f_461_ += f_480_;
			    f_463_ += f_493_;
			    f_464_ += f_481_;
			    f_466_ += f_494_;
			    f_467_ += f_482_;
			    f_469_ += f_495_;
			    f_470_ += f_483_;
			    f_472_ += f_496_;
			    f_473_ += f_484_;
			    argument_430_ += (float) anInt652;
			}
			while (--argument_431_ >= 0.0F) {
			    method1672(anIntArray657, anIntArray676,
				       (int) argument_430_,
				       (int) argument_433_,
				       (int) argument_432_, argument_436_,
				       argument_435_, argument_439_,
				       argument_438_, argument_442_,
				       argument_441_, (float) argument_449_,
				       (float) argument_448_, f_457_, f,
				       f_460_, f_459_, f_463_, f_462_, f_466_,
				       f_465_, f_469_, f_468_, f_472_, f_471_);
			    argument_433_ += f_486_;
			    argument_432_ += f_498_;
			    argument_436_ += f_487_;
			    argument_435_ += f_499_;
			    argument_439_ += f_488_;
			    argument_438_ += f_500_;
			    argument_442_ += f_489_;
			    argument_441_ += f_501_;
			    argument_449_ += f_490_;
			    argument_448_ += f_502_;
			    f_457_ += f_491_;
			    f += f_503_;
			    f_460_ += f_492_;
			    f_459_ += f_504_;
			    f_463_ += f_493_;
			    f_462_ += f_505_;
			    f_466_ += f_494_;
			    f_465_ += f_506_;
			    f_469_ += f_495_;
			    f_468_ += f_507_;
			    f_472_ += f_496_;
			    f_471_ += f_508_;
			    argument_430_ += (float) anInt652;
			}
		    }
		}
	    }
	} else if (!(argument_431_ >= (float) ((Class89) this).anInt653)) {
	    if (argument_429_ > (float) ((Class89) this).anInt653)
		argument_429_ = (float) ((Class89) this).anInt653;
	    if (argument_430_ > (float) ((Class89) this).anInt653)
		argument_430_ = (float) ((Class89) this).anInt653;
	    if (argument_429_ < argument_430_) {
		argument_433_ = argument_434_;
		argument_436_ = argument_437_;
		argument_439_ = argument_440_;
		argument_442_ = argument_443_;
		argument_449_ = argument_450_;
		f_457_ = f_458_;
		f_460_ = f_461_;
		f_463_ = f_464_;
		f_466_ = f_467_;
		f_469_ = f_470_;
		f_472_ = f_473_;
		if (argument_431_ < 0.0F) {
		    argument_434_ -= f_498_ * argument_431_;
		    argument_433_ -= f_486_ * argument_431_;
		    argument_437_ -= f_499_ * argument_431_;
		    argument_436_ -= f_487_ * argument_431_;
		    argument_440_ -= f_500_ * argument_431_;
		    argument_439_ -= f_488_ * argument_431_;
		    argument_443_ -= f_501_ * argument_431_;
		    argument_442_ -= f_489_ * argument_431_;
		    argument_450_ -= f_502_ * 3.0F;
		    argument_449_ -= f_490_ * argument_431_;
		    f_458_ -= f_503_ * argument_431_;
		    f_457_ -= f_491_ * argument_431_;
		    f_461_ -= f_504_ * argument_431_;
		    f_460_ -= f_492_ * argument_431_;
		    f_464_ -= f_505_ * argument_431_;
		    f_463_ -= f_493_ * argument_431_;
		    f_467_ -= f_506_ * argument_431_;
		    f_466_ -= f_494_ * argument_431_;
		    f_470_ -= f_507_ * argument_431_;
		    f_469_ -= f_495_ * argument_431_;
		    f_473_ -= f_508_ * argument_431_;
		    f_472_ -= f_496_ * argument_431_;
		    argument_431_ = 0.0F;
		}
		if (argument_429_ < 0.0F) {
		    argument_432_ -= f_474_ * argument_429_;
		    argument_435_ -= f_475_ * argument_429_;
		    argument_438_ -= f_476_ * argument_429_;
		    argument_441_ -= f_477_ * argument_429_;
		    argument_448_ -= f_478_ * argument_429_;
		    f -= f_479_ * argument_429_;
		    f_459_ -= f_480_ * argument_429_;
		    f_462_ -= f_481_ * argument_429_;
		    f_465_ -= f_482_ * argument_429_;
		    f_468_ -= f_483_ * argument_429_;
		    f_471_ -= f_484_ * argument_429_;
		    argument_429_ = 0.0F;
		}
		if (f_486_ < f_498_) {
		    argument_430_ -= argument_429_;
		    argument_429_ -= argument_431_;
		    argument_431_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_431_]);
		    while (--argument_429_ >= 0.0F) {
			method1672(anIntArray657, anIntArray676,
				   (int) argument_431_, (int) argument_433_,
				   (int) argument_434_, argument_436_,
				   argument_437_, argument_439_, argument_440_,
				   argument_442_, argument_443_,
				   (float) argument_449_,
				   (float) argument_450_, f_457_, f_458_,
				   f_460_, f_461_, f_463_, f_464_, f_466_,
				   f_467_, f_469_, f_470_, f_472_, f_473_);
			argument_433_ += f_486_;
			argument_434_ += f_498_;
			argument_436_ += f_487_;
			argument_437_ += f_499_;
			argument_439_ += f_488_;
			argument_440_ += f_500_;
			argument_442_ += f_489_;
			argument_443_ += f_501_;
			argument_449_ += f_490_;
			argument_450_ += f_502_;
			f_457_ += f_491_;
			f_458_ += f_503_;
			f_460_ += f_492_;
			f_461_ += f_504_;
			f_463_ += f_493_;
			f_464_ += f_505_;
			f_466_ += f_494_;
			f_467_ += f_506_;
			f_469_ += f_495_;
			f_470_ += f_507_;
			f_472_ += f_496_;
			f_473_ += f_508_;
			argument_431_ += (float) anInt652;
		    }
		    while (--argument_430_ >= 0.0F) {
			method1672(anIntArray657, anIntArray676,
				   (int) argument_431_, (int) argument_433_,
				   (int) argument_432_, argument_436_,
				   argument_435_, argument_439_, argument_438_,
				   argument_442_, argument_441_,
				   (float) argument_449_,
				   (float) argument_448_, f_457_, f, f_460_,
				   f_459_, f_463_, f_462_, f_466_, f_465_,
				   f_469_, f_468_, f_472_, f_471_);
			argument_433_ += f_486_;
			argument_432_ += f_474_;
			argument_436_ += f_487_;
			argument_435_ += f_475_;
			argument_439_ += f_488_;
			argument_438_ += f_476_;
			argument_442_ += f_489_;
			argument_441_ += f_477_;
			argument_449_ += f_490_;
			argument_448_ += f_478_;
			f_457_ += f_491_;
			f += f_479_;
			f_460_ += f_492_;
			f_459_ += f_480_;
			f_463_ += f_493_;
			f_462_ += f_481_;
			f_466_ += f_494_;
			f_465_ += f_482_;
			f_469_ += f_495_;
			f_468_ += f_483_;
			f_472_ += f_496_;
			f_471_ += f_484_;
			argument_431_ += (float) anInt652;
		    }
		} else {
		    argument_430_ -= argument_429_;
		    argument_429_ -= argument_431_;
		    argument_431_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_431_]);
		    while (--argument_429_ >= 0.0F) {
			method1672(anIntArray657, anIntArray676,
				   (int) argument_431_, (int) argument_434_,
				   (int) argument_433_, argument_437_,
				   argument_436_, argument_440_, argument_439_,
				   argument_443_, argument_442_,
				   (float) argument_450_,
				   (float) argument_449_, f_458_, f_457_,
				   f_461_, f_460_, f_464_, f_463_, f_467_,
				   f_466_, f_470_, f_469_, f_473_, f_472_);
			argument_434_ += f_498_;
			argument_433_ += f_486_;
			argument_437_ += f_499_;
			argument_436_ += f_487_;
			argument_440_ += f_500_;
			argument_439_ += f_488_;
			argument_443_ += f_501_;
			argument_442_ += f_489_;
			argument_450_ += f_502_;
			argument_449_ += f_490_;
			f_458_ += f_503_;
			f_457_ += f_491_;
			f_461_ += f_504_;
			f_460_ += f_492_;
			f_464_ += f_505_;
			f_463_ += f_493_;
			f_467_ += f_506_;
			f_466_ += f_494_;
			f_470_ += f_507_;
			f_469_ += f_495_;
			f_473_ += f_508_;
			f_472_ += f_496_;
			argument_431_ += (float) anInt652;
		    }
		    while (--argument_430_ >= 0.0F) {
			method1672(anIntArray657, anIntArray676,
				   (int) argument_431_, (int) argument_432_,
				   (int) argument_433_, argument_435_,
				   argument_436_, argument_438_, argument_439_,
				   argument_441_, argument_442_,
				   (float) argument_448_,
				   (float) argument_449_, f, f_457_, f_459_,
				   f_460_, f_462_, f_463_, f_465_, f_466_,
				   f_468_, f_469_, f_471_, f_472_);
			argument_432_ += f_474_;
			argument_433_ += f_486_;
			argument_435_ += f_475_;
			argument_436_ += f_487_;
			argument_438_ += f_476_;
			argument_439_ += f_488_;
			argument_441_ += f_477_;
			argument_442_ += f_489_;
			argument_448_ += f_478_;
			argument_449_ += f_490_;
			f += f_479_;
			f_457_ += f_491_;
			f_459_ += f_480_;
			f_460_ += f_492_;
			f_462_ += f_481_;
			f_463_ += f_493_;
			f_465_ += f_482_;
			f_466_ += f_494_;
			f_468_ += f_483_;
			f_469_ += f_495_;
			f_471_ += f_484_;
			f_472_ += f_496_;
			argument_431_ += (float) anInt652;
		    }
		}
	    } else {
		argument_432_ = argument_434_;
		argument_435_ = argument_437_;
		argument_438_ = argument_440_;
		argument_441_ = argument_443_;
		argument_448_ = argument_450_;
		f = f_458_;
		f_459_ = f_461_;
		f_462_ = f_464_;
		f_465_ = f_467_;
		f_468_ = f_470_;
		f_471_ = f_473_;
		if (argument_431_ < 0.0F) {
		    argument_434_ -= f_498_ * argument_431_;
		    argument_432_ -= f_486_ * argument_431_;
		    argument_437_ -= f_499_ * argument_431_;
		    argument_435_ -= f_487_ * argument_431_;
		    argument_440_ -= f_500_ * argument_431_;
		    argument_438_ -= f_488_ * argument_431_;
		    argument_443_ -= f_501_ * argument_431_;
		    argument_441_ -= f_489_ * argument_431_;
		    argument_450_ -= f_502_ * 3.0F;
		    argument_448_ -= f_490_ * argument_431_;
		    f_458_ -= f_503_ * argument_431_;
		    f -= f_491_ * argument_431_;
		    f_461_ -= f_504_ * argument_431_;
		    f_459_ -= f_492_ * argument_431_;
		    f_464_ -= f_505_ * argument_431_;
		    f_462_ -= f_493_ * argument_431_;
		    f_467_ -= f_506_ * argument_431_;
		    f_465_ -= f_494_ * argument_431_;
		    f_470_ -= f_507_ * argument_431_;
		    f_468_ -= f_495_ * argument_431_;
		    f_473_ -= f_508_ * argument_431_;
		    f_471_ -= f_496_ * argument_431_;
		    argument_431_ = 0.0F;
		}
		if (argument_430_ < 0.0F) {
		    argument_433_ -= f_474_ * argument_430_;
		    argument_436_ -= f_475_ * argument_430_;
		    argument_439_ -= f_476_ * argument_430_;
		    argument_442_ -= f_477_ * argument_430_;
		    argument_449_ -= f_478_ * argument_430_;
		    f_457_ -= f_479_ * argument_430_;
		    f_460_ -= f_480_ * argument_430_;
		    f_463_ -= f_481_ * argument_430_;
		    f_466_ -= f_482_ * argument_430_;
		    f_469_ -= f_483_ * argument_430_;
		    f_472_ -= f_484_ * argument_430_;
		    argument_430_ = 0.0F;
		}
		if (f_486_ < f_498_) {
		    argument_429_ -= argument_430_;
		    argument_430_ -= argument_431_;
		    argument_431_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_431_]);
		    while (--argument_430_ >= 0.0F) {
			method1672(anIntArray657, anIntArray676,
				   (int) argument_431_, (int) argument_432_,
				   (int) argument_434_, argument_435_,
				   argument_437_, argument_438_, argument_440_,
				   argument_441_, argument_443_,
				   (float) argument_448_,
				   (float) argument_450_, f, f_458_, f_459_,
				   f_461_, f_462_, f_464_, f_465_, f_467_,
				   f_468_, f_470_, f_471_, f_473_);
			argument_432_ += f_486_;
			argument_434_ += f_498_;
			argument_435_ += f_487_;
			argument_437_ += f_499_;
			argument_438_ += f_488_;
			argument_440_ += f_500_;
			argument_441_ += f_489_;
			argument_443_ += f_501_;
			argument_448_ += f_490_;
			argument_450_ += f_502_;
			f += f_491_;
			f_458_ += f_503_;
			f_459_ += f_492_;
			f_461_ += f_504_;
			f_462_ += f_493_;
			f_464_ += f_505_;
			f_465_ += f_494_;
			f_467_ += f_506_;
			f_468_ += f_495_;
			f_470_ += f_507_;
			f_471_ += f_496_;
			f_473_ += f_508_;
			argument_431_ += (float) anInt652;
		    }
		    while (--argument_429_ >= 0.0F) {
			method1672(anIntArray657, anIntArray676,
				   (int) argument_431_, (int) argument_433_,
				   (int) argument_434_, argument_436_,
				   argument_437_, argument_439_, argument_440_,
				   argument_442_, argument_443_,
				   (float) argument_449_,
				   (float) argument_450_, f_457_, f_458_,
				   f_460_, f_461_, f_463_, f_464_, f_466_,
				   f_467_, f_469_, f_470_, f_472_, f_473_);
			argument_433_ += f_474_;
			argument_434_ += f_498_;
			argument_436_ += f_475_;
			argument_437_ += f_499_;
			argument_439_ += f_476_;
			argument_440_ += f_500_;
			argument_442_ += f_477_;
			argument_443_ += f_501_;
			argument_449_ += f_478_;
			argument_450_ += f_502_;
			f_457_ += f_479_;
			f_458_ += f_503_;
			f_460_ += f_480_;
			f_461_ += f_504_;
			f_463_ += f_481_;
			f_464_ += f_505_;
			f_466_ += f_482_;
			f_467_ += f_506_;
			f_469_ += f_483_;
			f_470_ += f_507_;
			f_472_ += f_484_;
			f_473_ += f_508_;
			argument_431_ += (float) anInt652;
		    }
		} else {
		    argument_429_ -= argument_430_;
		    argument_430_ -= argument_431_;
		    argument_431_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_431_]);
		    while (--argument_430_ >= 0.0F) {
			method1672(anIntArray657, anIntArray676,
				   (int) argument_431_, (int) argument_434_,
				   (int) argument_432_, argument_437_,
				   argument_435_, argument_440_, argument_438_,
				   argument_443_, argument_441_,
				   (float) argument_450_,
				   (float) argument_448_, f_458_, f, f_461_,
				   f_459_, f_464_, f_462_, f_467_, f_465_,
				   f_470_, f_468_, f_473_, f_471_);
			argument_434_ += f_498_;
			argument_432_ += f_486_;
			argument_437_ += f_499_;
			argument_435_ += f_487_;
			argument_440_ += f_500_;
			argument_438_ += f_488_;
			argument_443_ += f_501_;
			argument_441_ += f_489_;
			argument_450_ += f_502_;
			argument_448_ += f_490_;
			f_458_ += f_503_;
			f += f_491_;
			f_461_ += f_504_;
			f_459_ += f_492_;
			f_464_ += f_505_;
			f_462_ += f_493_;
			f_467_ += f_506_;
			f_465_ += f_494_;
			f_470_ += f_507_;
			f_468_ += f_495_;
			f_473_ += f_508_;
			f_471_ += f_496_;
			argument_431_ += (float) anInt652;
		    }
		    while (--argument_429_ >= 0.0F) {
			method1672(anIntArray657, anIntArray676,
				   (int) argument_431_, (int) argument_434_,
				   (int) argument_433_, argument_437_,
				   argument_436_, argument_440_, argument_439_,
				   argument_443_, argument_442_,
				   (float) argument_450_,
				   (float) argument_449_, f_458_, f_457_,
				   f_461_, f_460_, f_464_, f_463_, f_467_,
				   f_466_, f_470_, f_469_, f_473_, f_472_);
			argument_434_ += f_498_;
			argument_433_ += f_474_;
			argument_437_ += f_499_;
			argument_436_ += f_475_;
			argument_440_ += f_500_;
			argument_439_ += f_476_;
			argument_443_ += f_501_;
			argument_442_ += f_477_;
			argument_450_ += f_502_;
			argument_449_ += f_478_;
			f_458_ += f_503_;
			f_457_ += f_479_;
			f_461_ += f_504_;
			f_460_ += f_480_;
			f_464_ += f_505_;
			f_463_ += f_481_;
			f_467_ += f_506_;
			f_466_ += f_482_;
			f_470_ += f_507_;
			f_469_ += f_483_;
			f_473_ += f_508_;
			f_472_ += f_484_;
			argument_431_ += (float) anInt652;
		    }
		}
	    }
	}
    }
    
    final void method1667
	(float argument_510_, float argument_511_, float argument_512_,
	 float argument_513_, float argument_514_, float argument_515_,
	 float argument_516_, float argument_517_, float argument_518_,
	 float argument_519_, float argument_520_, float argument_521_) {
	if (aBoolean649) {
	    aClass_ha__651.method2035((HslToRgb.table2
					   [(int) argument_519_]),
					  (byte) -74, (int) argument_510_,
					  (int) argument_514_,
					  (int) argument_511_,
					  (int) argument_513_);
	    aClass_ha__651.method2035((HslToRgb.table2
					   [(int) argument_519_]),
					  (byte) -99, (int) argument_511_,
					  (int) argument_515_,
					  (int) argument_512_,
					  (int) argument_514_);
	    aClass_ha__651.method2035((HslToRgb.table2
					   [(int) argument_519_]),
					  (byte) -123, (int) argument_512_,
					  (int) argument_513_,
					  (int) argument_510_,
					  (int) argument_515_);
	} else {
	    float f = argument_514_ - argument_513_;
	    float f_522_ = argument_511_ - argument_510_;
	    float f_523_ = argument_515_ - argument_513_;
	    float f_524_ = argument_512_ - argument_510_;
	    float f_525_ = argument_520_ - argument_519_;
	    float f_526_ = argument_521_ - argument_519_;
	    float f_527_ = argument_517_ - argument_516_;
	    float f_528_ = argument_518_ - argument_516_;
	    float f_529_;
	    if (argument_512_ != argument_511_)
		f_529_ = (argument_515_ - argument_514_) / (argument_512_
							    - argument_511_);
	    else
		f_529_ = 0.0F;
	    float f_530_;
	    if (argument_511_ != argument_510_)
		f_530_ = f / f_522_;
	    else
		f_530_ = 0.0F;
	    float f_531_;
	    if (argument_512_ != argument_510_)
		f_531_ = f_523_ / f_524_;
	    else
		f_531_ = 0.0F;
	    float f_532_ = f * f_524_ - f_523_ * f_522_;
	    if (f_532_ != 0.0F) {
		float f_533_ = (f_525_ * f_524_ - f_526_ * f_522_) / f_532_;
		float f_534_ = (f_526_ * f - f_525_ * f_523_) / f_532_;
		float f_535_ = (f_527_ * f_524_ - f_528_ * f_522_) / f_532_;
		float f_536_ = (f_528_ * f - f_527_ * f_523_) / f_532_;
		if (argument_510_ <= argument_511_
		    && argument_510_ <= argument_512_) {
		    if (!(argument_510_
			  >= (float) ((Class89) this).anInt653)) {
			if (argument_511_ > (float) ((Class89) this).anInt653)
			    argument_511_ = (float) ((Class89) this).anInt653;
			if (argument_512_ > (float) ((Class89) this).anInt653)
			    argument_512_ = (float) ((Class89) this).anInt653;
			argument_519_
			    = argument_519_ - f_533_ * argument_513_ + f_533_;
			argument_516_
			    = argument_516_ - f_535_ * argument_513_ + f_535_;
			if (argument_511_ < argument_512_) {
			    argument_515_ = argument_513_;
			    if (argument_510_ < 0.0F) {
				argument_515_ -= f_531_ * argument_510_;
				argument_513_ -= f_530_ * argument_510_;
				argument_519_ -= f_534_ * argument_510_;
				argument_516_ -= f_536_ * argument_510_;
				argument_510_ = 0.0F;
			    }
			    if (argument_511_ < 0.0F) {
				argument_514_ -= f_529_ * argument_511_;
				argument_511_ = 0.0F;
			    }
			    if ((argument_510_ != argument_511_
				 && f_531_ < f_530_)
				|| (argument_510_ == argument_511_
				    && f_531_ > f_529_)) {
				argument_512_ -= argument_511_;
				argument_511_ -= argument_510_;
				argument_510_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_510_]);
				while (--argument_511_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_510_, 0, 0,
					       (int) argument_515_,
					       (int) argument_513_,
					       argument_519_, f_533_,
					       argument_516_, f_535_);
				    argument_515_ += f_531_;
				    argument_513_ += f_530_;
				    argument_519_ += f_534_;
				    argument_516_ += f_536_;
				    argument_510_ += (float) anInt652;
				}
				while (--argument_512_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_510_, 0, 0,
					       (int) argument_515_,
					       (int) argument_514_,
					       argument_519_, f_533_,
					       argument_516_, f_535_);
				    argument_515_ += f_531_;
				    argument_514_ += f_529_;
				    argument_519_ += f_534_;
				    argument_516_ += f_536_;
				    argument_510_ += (float) anInt652;
				}
			    } else {
				argument_512_ -= argument_511_;
				argument_511_ -= argument_510_;
				argument_510_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_510_]);
				while (--argument_511_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_510_, 0, 0,
					       (int) argument_513_,
					       (int) argument_515_,
					       argument_519_, f_533_,
					       argument_516_, f_535_);
				    argument_515_ += f_531_;
				    argument_513_ += f_530_;
				    argument_519_ += f_534_;
				    argument_516_ += f_536_;
				    argument_510_ += (float) anInt652;
				}
				while (--argument_512_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_510_, 0, 0,
					       (int) argument_514_,
					       (int) argument_515_,
					       argument_519_, f_533_,
					       argument_516_, f_535_);
				    argument_515_ += f_531_;
				    argument_514_ += f_529_;
				    argument_519_ += f_534_;
				    argument_516_ += f_536_;
				    argument_510_ += (float) anInt652;
				}
			    }
			} else {
			    argument_514_ = argument_513_;
			    if (argument_510_ < 0.0F) {
				argument_514_ -= f_531_ * argument_510_;
				argument_513_ -= f_530_ * argument_510_;
				argument_519_ -= f_534_ * argument_510_;
				argument_516_ -= f_536_ * argument_510_;
				argument_510_ = 0.0F;
			    }
			    if (argument_512_ < 0.0F) {
				argument_515_ -= f_529_ * argument_512_;
				argument_512_ = 0.0F;
			    }
			    if ((argument_510_ != argument_512_
				 && f_531_ < f_530_)
				|| (argument_510_ == argument_512_
				    && f_529_ > f_530_)) {
				argument_511_ -= argument_512_;
				argument_512_ -= argument_510_;
				argument_510_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_510_]);
				while (--argument_512_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_510_, 0, 0,
					       (int) argument_514_,
					       (int) argument_513_,
					       argument_519_, f_533_,
					       argument_516_, f_535_);
				    argument_514_ += f_531_;
				    argument_513_ += f_530_;
				    argument_519_ += f_534_;
				    argument_516_ += f_536_;
				    argument_510_ += (float) anInt652;
				}
				while (--argument_511_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_510_, 0, 0,
					       (int) argument_515_,
					       (int) argument_513_,
					       argument_519_, f_533_,
					       argument_516_, f_535_);
				    argument_515_ += f_529_;
				    argument_513_ += f_530_;
				    argument_519_ += f_534_;
				    argument_516_ += f_536_;
				    argument_510_ += (float) anInt652;
				}
			    } else {
				argument_511_ -= argument_512_;
				argument_512_ -= argument_510_;
				argument_510_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_510_]);
				while (--argument_512_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_510_, 0, 0,
					       (int) argument_513_,
					       (int) argument_514_,
					       argument_519_, f_533_,
					       argument_516_, f_535_);
				    argument_514_ += f_531_;
				    argument_513_ += f_530_;
				    argument_519_ += f_534_;
				    argument_516_ += f_536_;
				    argument_510_ += (float) anInt652;
				}
				while (--argument_511_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_510_, 0, 0,
					       (int) argument_513_,
					       (int) argument_515_,
					       argument_519_, f_533_,
					       argument_516_, f_535_);
				    argument_515_ += f_529_;
				    argument_513_ += f_530_;
				    argument_519_ += f_534_;
				    argument_516_ += f_536_;
				    argument_510_ += (float) anInt652;
				}
			    }
			}
		    }
		} else if (argument_511_ <= argument_512_) {
		    if (!(argument_511_
			  >= (float) ((Class89) this).anInt653)) {
			if (argument_512_ > (float) ((Class89) this).anInt653)
			    argument_512_ = (float) ((Class89) this).anInt653;
			if (argument_510_ > (float) ((Class89) this).anInt653)
			    argument_510_ = (float) ((Class89) this).anInt653;
			argument_520_
			    = argument_520_ - f_533_ * argument_514_ + f_533_;
			argument_517_
			    = argument_517_ - f_535_ * argument_514_ + f_535_;
			if (argument_512_ < argument_510_) {
			    argument_513_ = argument_514_;
			    if (argument_511_ < 0.0F) {
				argument_513_ -= f_530_ * argument_511_;
				argument_514_ -= f_529_ * argument_511_;
				argument_520_ -= f_534_ * argument_511_;
				argument_517_ -= f_536_ * argument_511_;
				argument_511_ = 0.0F;
			    }
			    if (argument_512_ < 0.0F) {
				argument_515_ -= f_531_ * argument_512_;
				argument_512_ = 0.0F;
			    }
			    if ((argument_511_ != argument_512_
				 && f_530_ < f_529_)
				|| (argument_511_ == argument_512_
				    && f_530_ > f_531_)) {
				argument_510_ -= argument_512_;
				argument_512_ -= argument_511_;
				argument_511_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_511_]);
				while (--argument_512_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_511_, 0, 0,
					       (int) argument_513_,
					       (int) argument_514_,
					       argument_520_, f_533_,
					       argument_517_, f_535_);
				    argument_513_ += f_530_;
				    argument_514_ += f_529_;
				    argument_520_ += f_534_;
				    argument_517_ += f_536_;
				    argument_511_ += (float) anInt652;
				}
				while (--argument_510_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_511_, 0, 0,
					       (int) argument_513_,
					       (int) argument_515_,
					       argument_520_, f_533_,
					       argument_517_, f_535_);
				    argument_513_ += f_530_;
				    argument_515_ += f_531_;
				    argument_520_ += f_534_;
				    argument_517_ += f_536_;
				    argument_511_ += (float) anInt652;
				}
			    } else {
				argument_510_ -= argument_512_;
				argument_512_ -= argument_511_;
				argument_511_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_511_]);
				while (--argument_512_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_511_, 0, 0,
					       (int) argument_514_,
					       (int) argument_513_,
					       argument_520_, f_533_,
					       argument_517_, f_535_);
				    argument_513_ += f_530_;
				    argument_514_ += f_529_;
				    argument_520_ += f_534_;
				    argument_517_ += f_536_;
				    argument_511_ += (float) anInt652;
				}
				while (--argument_510_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_511_, 0, 0,
					       (int) argument_515_,
					       (int) argument_513_,
					       argument_520_, f_533_,
					       argument_517_, f_535_);
				    argument_513_ += f_530_;
				    argument_515_ += f_531_;
				    argument_520_ += f_534_;
				    argument_517_ += f_536_;
				    argument_511_ += (float) anInt652;
				}
			    }
			} else {
			    argument_515_ = argument_514_;
			    if (argument_511_ < 0.0F) {
				argument_515_ -= f_530_ * argument_511_;
				argument_514_ -= f_529_ * argument_511_;
				argument_520_ -= f_534_ * argument_511_;
				argument_517_ -= f_536_ * argument_511_;
				argument_511_ = 0.0F;
			    }
			    if (argument_510_ < 0.0F) {
				argument_513_ -= f_531_ * argument_510_;
				argument_510_ = 0.0F;
			    }
			    if (f_530_ < f_529_) {
				argument_512_ -= argument_510_;
				argument_510_ -= argument_511_;
				argument_511_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_511_]);
				while (--argument_510_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_511_, 0, 0,
					       (int) argument_515_,
					       (int) argument_514_,
					       argument_520_, f_533_,
					       argument_517_, f_535_);
				    argument_515_ += f_530_;
				    argument_514_ += f_529_;
				    argument_520_ += f_534_;
				    argument_517_ += f_536_;
				    argument_511_ += (float) anInt652;
				}
				while (--argument_512_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_511_, 0, 0,
					       (int) argument_513_,
					       (int) argument_514_,
					       argument_520_, f_533_,
					       argument_517_, f_535_);
				    argument_513_ += f_531_;
				    argument_514_ += f_529_;
				    argument_520_ += f_534_;
				    argument_517_ += f_536_;
				    argument_511_ += (float) anInt652;
				}
			    } else {
				argument_512_ -= argument_510_;
				argument_510_ -= argument_511_;
				argument_511_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_511_]);
				while (--argument_510_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_511_, 0, 0,
					       (int) argument_514_,
					       (int) argument_515_,
					       argument_520_, f_533_,
					       argument_517_, f_535_);
				    argument_515_ += f_530_;
				    argument_514_ += f_529_;
				    argument_520_ += f_534_;
				    argument_517_ += f_536_;
				    argument_511_ += (float) anInt652;
				}
				while (--argument_512_ >= 0.0F) {
				    method1665(anIntArray657, aFloatArray656,
					       (int) argument_511_, 0, 0,
					       (int) argument_514_,
					       (int) argument_513_,
					       argument_520_, f_533_,
					       argument_517_, f_535_);
				    argument_513_ += f_531_;
				    argument_514_ += f_529_;
				    argument_520_ += f_534_;
				    argument_517_ += f_536_;
				    argument_511_ += (float) anInt652;
				}
			    }
			}
		    }
		} else if (!(argument_512_
			     >= (float) ((Class89) this).anInt653)) {
		    if (argument_510_ > (float) ((Class89) this).anInt653)
			argument_510_ = (float) ((Class89) this).anInt653;
		    if (argument_511_ > (float) ((Class89) this).anInt653)
			argument_511_ = (float) ((Class89) this).anInt653;
		    argument_521_
			= argument_521_ - f_533_ * argument_515_ + f_533_;
		    argument_518_
			= argument_518_ - f_535_ * argument_515_ + f_535_;
		    if (argument_510_ < argument_511_) {
			argument_514_ = argument_515_;
			if (argument_512_ < 0.0F) {
			    argument_514_ -= f_529_ * argument_512_;
			    argument_515_ -= f_531_ * argument_512_;
			    argument_521_ -= f_534_ * argument_512_;
			    argument_518_ -= f_536_ * argument_512_;
			    argument_512_ = 0.0F;
			}
			if (argument_510_ < 0.0F) {
			    argument_513_ -= f_530_ * argument_510_;
			    argument_510_ = 0.0F;
			}
			if (f_529_ < f_531_) {
			    argument_511_ -= argument_510_;
			    argument_510_ -= argument_512_;
			    argument_512_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_512_]);
			    while (--argument_510_ >= 0.0F) {
				method1665(anIntArray657, aFloatArray656,
					   (int) argument_512_, 0, 0,
					   (int) argument_514_,
					   (int) argument_515_, argument_521_,
					   f_533_, argument_518_, f_535_);
				argument_514_ += f_529_;
				argument_515_ += f_531_;
				argument_521_ += f_534_;
				argument_518_ += f_536_;
				argument_512_ += (float) anInt652;
			    }
			    while (--argument_511_ >= 0.0F) {
				method1665(anIntArray657, aFloatArray656,
					   (int) argument_512_, 0, 0,
					   (int) argument_514_,
					   (int) argument_513_, argument_521_,
					   f_533_, argument_518_, f_535_);
				argument_514_ += f_529_;
				argument_513_ += f_530_;
				argument_521_ += f_534_;
				argument_518_ += f_536_;
				argument_512_ += (float) anInt652;
			    }
			} else {
			    argument_511_ -= argument_510_;
			    argument_510_ -= argument_512_;
			    argument_512_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_512_]);
			    while (--argument_510_ >= 0.0F) {
				method1665(anIntArray657, aFloatArray656,
					   (int) argument_512_, 0, 0,
					   (int) argument_515_,
					   (int) argument_514_, argument_521_,
					   f_533_, argument_518_, f_535_);
				argument_514_ += f_529_;
				argument_515_ += f_531_;
				argument_521_ += f_534_;
				argument_518_ += f_536_;
				argument_512_ += (float) anInt652;
			    }
			    while (--argument_511_ >= 0.0F) {
				method1665(anIntArray657, aFloatArray656,
					   (int) argument_512_, 0, 0,
					   (int) argument_513_,
					   (int) argument_514_, argument_521_,
					   f_533_, argument_518_, f_535_);
				argument_514_ += f_529_;
				argument_513_ += f_530_;
				argument_521_ += f_534_;
				argument_518_ += f_536_;
				argument_512_ += (float) anInt652;
			    }
			}
		    } else {
			argument_513_ = argument_515_;
			if (argument_512_ < 0.0F) {
			    argument_513_ -= f_529_ * argument_512_;
			    argument_515_ -= f_531_ * argument_512_;
			    argument_521_ -= f_534_ * argument_512_;
			    argument_518_ -= f_536_ * argument_512_;
			    argument_512_ = 0.0F;
			}
			if (argument_511_ < 0.0F) {
			    argument_514_ -= f_530_ * argument_511_;
			    argument_511_ = 0.0F;
			}
			if (f_529_ < f_531_) {
			    argument_510_ -= argument_511_;
			    argument_511_ -= argument_512_;
			    argument_512_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_512_]);
			    while (--argument_511_ >= 0.0F) {
				method1665(anIntArray657, aFloatArray656,
					   (int) argument_512_, 0, 0,
					   (int) argument_513_,
					   (int) argument_515_, argument_521_,
					   f_533_, argument_518_, f_535_);
				argument_513_ += f_529_;
				argument_515_ += f_531_;
				argument_521_ += f_534_;
				argument_518_ += f_536_;
				argument_512_ += (float) anInt652;
			    }
			    while (--argument_510_ >= 0.0F) {
				method1665(anIntArray657, aFloatArray656,
					   (int) argument_512_, 0, 0,
					   (int) argument_514_,
					   (int) argument_515_, argument_521_,
					   f_533_, argument_518_, f_535_);
				argument_514_ += f_530_;
				argument_515_ += f_531_;
				argument_521_ += f_534_;
				argument_518_ += f_536_;
				argument_512_ += (float) anInt652;
			    }
			} else {
			    argument_510_ -= argument_511_;
			    argument_511_ -= argument_512_;
			    argument_512_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_512_]);
			    while (--argument_511_ >= 0.0F) {
				method1665(anIntArray657, aFloatArray656,
					   (int) argument_512_, 0, 0,
					   (int) argument_515_,
					   (int) argument_513_, argument_521_,
					   f_533_, argument_518_, f_535_);
				argument_513_ += f_529_;
				argument_515_ += f_531_;
				argument_521_ += f_534_;
				argument_518_ += f_536_;
				argument_512_ += (float) anInt652;
			    }
			    while (--argument_510_ >= 0.0F) {
				method1665(anIntArray657, aFloatArray656,
					   (int) argument_512_, 0, 0,
					   (int) argument_515_,
					   (int) argument_514_, argument_521_,
					   f_533_, argument_518_, f_535_);
				argument_514_ += f_530_;
				argument_515_ += f_531_;
				argument_521_ += f_534_;
				argument_518_ += f_536_;
				argument_512_ += (float) anInt652;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method1668
	(float argument_537_, float argument_538_, float argument_539_,
	 float argument_540_, float argument_541_, float argument_542_,
	 float argument_543_, float argument_544_, float argument_545_,
	 float argument_546_, float argument_547_, float argument_548_,
	 float argument_549_, float argument_550_, float argument_551_,
	 int argument_552_, int argument_553_, int argument_554_,
	 int argument_555_, int argument_556_, int argument_557_,
	 int argument_558_, int argument_559_) {
	if (argument_559_ != anInt662) {
	    anIntArray676 = aClass_ha__651.method2108(argument_559_);
	    if (anIntArray676 == null) {
		method1656
		    ((float) (int) argument_537_, (float) (int) argument_538_,
		     (float) (int) argument_539_, (float) (int) argument_540_,
		     (float) (int) argument_541_, (float) (int) argument_542_,
		     (float) (int) argument_543_, (float) (int) argument_544_,
		     (float) (int) argument_545_,
		     Statics.method2255((argument_555_ | argument_556_ << 24), argument_552_),
		     Statics.method2255((argument_555_ | argument_557_ << 24), argument_553_),
		     Statics.method2255((argument_555_ | argument_558_ << 24), argument_554_));
		return;
	    }
	    anInt663 = (aClass_ha__651.method2111(argument_559_) ? 64
			: ((JavaToolkit) aClass_ha__651).anInt4655);
	    anInt666 = anInt663 - 1;
	    anInt675 = aClass_ha__651.method2110(argument_559_);
	    aBoolean672 = aClass_ha__651.method2104(argument_559_);
	}
	anInt668 = argument_555_;
	float f = (float) (argument_552_ >> 24 & 0xff);
	float f_560_ = (float) (argument_553_ >> 24 & 0xff);
	float f_561_ = (float) (argument_554_ >> 24 & 0xff);
	float f_562_ = (float) (argument_552_ >> 16 & 0xff);
	float f_563_ = (float) (argument_553_ >> 16 & 0xff);
	float f_564_ = (float) (argument_554_ >> 16 & 0xff);
	float f_565_ = (float) (argument_552_ >> 8 & 0xff);
	float f_566_ = (float) (argument_553_ >> 8 & 0xff);
	float f_567_ = (float) (argument_554_ >> 8 & 0xff);
	float f_568_ = (float) (argument_552_ & 0xff);
	float f_569_ = (float) (argument_553_ & 0xff);
	float f_570_ = (float) (argument_554_ & 0xff);
	argument_546_ /= argument_543_;
	argument_547_ /= argument_544_;
	argument_548_ /= argument_545_;
	argument_549_ /= argument_543_;
	argument_550_ /= argument_544_;
	argument_551_ /= argument_545_;
	argument_543_ = 1.0F / argument_543_;
	argument_544_ = 1.0F / argument_544_;
	argument_545_ = 1.0F / argument_545_;
	float f_571_ = 0.0F;
	float f_572_ = 0.0F;
	float f_573_ = 0.0F;
	float f_574_ = 0.0F;
	float f_575_ = 0.0F;
	float f_576_ = 0.0F;
	float f_577_ = 0.0F;
	float f_578_ = 0.0F;
	float f_579_ = 0.0F;
	if (argument_538_ != argument_537_) {
	    float f_580_ = argument_538_ - argument_537_;
	    f_571_ = (argument_541_ - argument_540_) / f_580_;
	    f_572_ = (argument_544_ - argument_543_) / f_580_;
	    f_573_ = (argument_547_ - argument_546_) / f_580_;
	    f_574_ = (argument_550_ - argument_549_) / f_580_;
	    f_575_ = (float) (argument_557_ - argument_556_) / f_580_;
	    f_576_ = (f_560_ - f) / f_580_;
	    f_577_ = (f_563_ - f_562_) / f_580_;
	    f_578_ = (f_566_ - f_565_) / f_580_;
	    f_579_ = (f_569_ - f_568_) / f_580_;
	}
	float f_581_ = 0.0F;
	float f_582_ = 0.0F;
	float f_583_ = 0.0F;
	float f_584_ = 0.0F;
	float f_585_ = 0.0F;
	float f_586_ = 0.0F;
	float f_587_ = 0.0F;
	float f_588_ = 0.0F;
	float f_589_ = 0.0F;
	if (argument_539_ != argument_538_) {
	    float f_590_ = argument_539_ - argument_538_;
	    f_581_ = (argument_542_ - argument_541_) / f_590_;
	    f_582_ = (argument_545_ - argument_544_) / f_590_;
	    f_583_ = (argument_548_ - argument_547_) / f_590_;
	    f_584_ = (argument_551_ - argument_550_) / f_590_;
	    f_585_ = (float) (argument_558_ - argument_557_) / f_590_;
	    f_586_ = (f_561_ - f_560_) / f_590_;
	    f_587_ = (f_564_ - f_563_) / f_590_;
	    f_588_ = (f_567_ - f_566_) / f_590_;
	    f_589_ = (f_570_ - f_569_) / f_590_;
	}
	float f_591_ = 0.0F;
	float f_592_ = 0.0F;
	float f_593_ = 0.0F;
	float f_594_ = 0.0F;
	float f_595_ = 0.0F;
	float f_596_ = 0.0F;
	float f_597_ = 0.0F;
	float f_598_ = 0.0F;
	float f_599_ = 0.0F;
	if (argument_537_ != argument_539_) {
	    float f_600_ = argument_537_ - argument_539_;
	    f_591_ = (argument_540_ - argument_542_) / f_600_;
	    f_592_ = (argument_543_ - argument_545_) / f_600_;
	    f_593_ = (argument_546_ - argument_548_) / f_600_;
	    f_594_ = (argument_549_ - argument_551_) / f_600_;
	    f_595_ = (float) (argument_556_ - argument_558_) / f_600_;
	    f_596_ = (f - f_561_) / f_600_;
	    f_597_ = (f_562_ - f_564_) / f_600_;
	    f_598_ = (f_565_ - f_567_) / f_600_;
	    f_599_ = (f_568_ - f_570_) / f_600_;
	}
	if (argument_537_ <= argument_538_ && argument_537_ <= argument_539_) {
	    if (!(argument_537_ >= (float) ((Class89) this).anInt653)) {
		if (argument_538_ > (float) ((Class89) this).anInt653)
		    argument_538_ = (float) ((Class89) this).anInt653;
		if (argument_539_ > (float) ((Class89) this).anInt653)
		    argument_539_ = (float) ((Class89) this).anInt653;
		if (argument_538_ < argument_539_) {
		    argument_542_ = argument_540_;
		    argument_545_ = argument_543_;
		    argument_548_ = argument_546_;
		    argument_551_ = argument_549_;
		    argument_558_ = argument_556_;
		    f_561_ = f;
		    f_564_ = f_562_;
		    f_567_ = f_565_;
		    f_570_ = f_568_;
		    if (argument_537_ < 0.0F) {
			argument_540_ -= f_571_ * argument_537_;
			argument_542_ -= f_591_ * argument_537_;
			argument_543_ -= f_572_ * argument_537_;
			argument_545_ -= f_592_ * argument_537_;
			argument_546_ -= f_573_ * argument_537_;
			argument_548_ -= f_593_ * argument_537_;
			argument_549_ -= f_574_ * argument_537_;
			argument_551_ -= f_594_ * argument_537_;
			argument_556_ -= f_575_ * argument_537_;
			argument_558_ -= f_595_ * argument_537_;
			f -= f_576_ * argument_537_;
			f_561_ -= f_596_ * argument_537_;
			f_562_ -= f_576_ * argument_537_;
			f_564_ -= f_596_ * argument_537_;
			f_565_ -= f_576_ * argument_537_;
			f_567_ -= f_596_ * argument_537_;
			f_568_ -= f_576_ * argument_537_;
			f_570_ -= f_596_ * argument_537_;
			argument_537_ = 0.0F;
		    }
		    if (argument_538_ < 0.0F) {
			argument_541_ -= f_581_ * argument_538_;
			argument_544_ -= f_582_ * argument_538_;
			argument_547_ -= f_583_ * argument_538_;
			argument_550_ -= f_584_ * argument_538_;
			argument_557_ -= f_585_ * argument_538_;
			f_560_ -= f_586_ * argument_538_;
			f_563_ -= f_587_ * argument_538_;
			f_566_ -= f_588_ * argument_538_;
			f_569_ -= f_589_ * argument_538_;
			argument_538_ = 0.0F;
		    }
		    if (argument_537_ != argument_538_ && f_591_ < f_571_
			|| argument_537_ == argument_538_ && f_591_ > f_581_) {
			argument_539_ -= argument_538_;
			argument_538_ -= argument_537_;
			argument_537_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_537_]);
			while (--argument_538_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_537_,
				       (int) argument_542_,
				       (int) argument_540_, argument_545_,
				       argument_543_, argument_548_,
				       argument_546_, argument_551_,
				       argument_549_, (float) argument_558_,
				       (float) argument_556_, f_561_, f,
				       f_564_, f_562_, f_567_, f_565_, f_570_,
				       f_568_);
			    argument_540_ += f_571_;
			    argument_542_ += f_591_;
			    argument_543_ += f_572_;
			    argument_545_ += f_592_;
			    argument_546_ += f_573_;
			    argument_548_ += f_593_;
			    argument_549_ += f_574_;
			    argument_551_ += f_594_;
			    argument_556_ += f_575_;
			    argument_558_ += f_595_;
			    f += f_576_;
			    f_561_ += f_596_;
			    f_562_ += f_577_;
			    f_564_ += f_597_;
			    f_565_ += f_578_;
			    f_567_ += f_598_;
			    f_568_ += f_579_;
			    f_570_ += f_599_;
			    argument_537_ += (float) anInt652;
			}
			while (--argument_539_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_537_,
				       (int) argument_542_,
				       (int) argument_541_, argument_545_,
				       argument_544_, argument_548_,
				       argument_547_, argument_551_,
				       argument_550_, (float) argument_558_,
				       (float) argument_557_, f_561_, f_560_,
				       f_564_, f_563_, f_567_, f_566_, f_570_,
				       f_569_);
			    argument_541_ += f_581_;
			    argument_542_ += f_591_;
			    argument_544_ += f_582_;
			    argument_545_ += f_592_;
			    argument_547_ += f_583_;
			    argument_548_ += f_593_;
			    argument_550_ += f_584_;
			    argument_551_ += f_594_;
			    argument_557_ += f_585_;
			    argument_558_ += f_595_;
			    f_560_ += f_586_;
			    f_561_ += f_596_;
			    f_563_ += f_587_;
			    f_564_ += f_597_;
			    f_566_ += f_588_;
			    f_567_ += f_598_;
			    f_569_ += f_589_;
			    f_570_ += f_599_;
			    argument_537_ += (float) anInt652;
			}
		    } else {
			argument_539_ -= argument_538_;
			argument_538_ -= argument_537_;
			argument_537_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_537_]);
			while (--argument_538_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_537_,
				       (int) argument_540_,
				       (int) argument_542_, argument_543_,
				       argument_545_, argument_546_,
				       argument_548_, argument_549_,
				       argument_551_, (float) argument_556_,
				       (float) argument_558_, f, f_561_,
				       f_562_, f_564_, f_565_, f_567_, f_568_,
				       f_570_);
			    argument_540_ += f_571_;
			    argument_542_ += f_591_;
			    argument_543_ += f_572_;
			    argument_545_ += f_592_;
			    argument_546_ += f_573_;
			    argument_548_ += f_593_;
			    argument_549_ += f_574_;
			    argument_551_ += f_594_;
			    argument_556_ += f_575_;
			    argument_558_ += f_595_;
			    f += f_576_;
			    f_561_ += f_596_;
			    f_562_ += f_577_;
			    f_564_ += f_597_;
			    f_565_ += f_578_;
			    f_567_ += f_598_;
			    f_568_ += f_579_;
			    f_570_ += f_599_;
			    argument_537_ += (float) anInt652;
			}
			while (--argument_539_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_537_,
				       (int) argument_541_,
				       (int) argument_542_, argument_544_,
				       argument_545_, argument_547_,
				       argument_548_, argument_550_,
				       argument_551_, (float) argument_557_,
				       (float) argument_558_, f_560_, f_561_,
				       f_563_, f_564_, f_566_, f_567_, f_569_,
				       f_570_);
			    argument_541_ += f_581_;
			    argument_542_ += f_591_;
			    argument_544_ += f_582_;
			    argument_545_ += f_592_;
			    argument_547_ += f_583_;
			    argument_548_ += f_593_;
			    argument_550_ += f_584_;
			    argument_551_ += f_594_;
			    argument_557_ += f_585_;
			    argument_558_ += f_595_;
			    f_560_ += f_586_;
			    f_561_ += f_596_;
			    f_563_ += f_587_;
			    f_564_ += f_597_;
			    f_566_ += f_588_;
			    f_567_ += f_598_;
			    f_569_ += f_589_;
			    f_570_ += f_599_;
			    argument_537_ += (float) anInt652;
			}
		    }
		} else {
		    argument_541_ = argument_540_;
		    argument_544_ = argument_543_;
		    argument_547_ = argument_546_;
		    argument_550_ = argument_549_;
		    argument_557_ = argument_556_;
		    f_560_ = f;
		    f_563_ = f_562_;
		    f_566_ = f_565_;
		    f_569_ = f_568_;
		    if (argument_537_ < 0.0F) {
			argument_540_ -= f_571_ * argument_537_;
			argument_541_ -= f_591_ * argument_537_;
			argument_543_ -= f_572_ * argument_537_;
			argument_544_ -= f_592_ * argument_537_;
			argument_546_ -= f_573_ * argument_537_;
			argument_547_ -= f_593_ * argument_537_;
			argument_549_ -= f_574_ * argument_537_;
			argument_550_ -= f_594_ * argument_537_;
			argument_556_ -= f_575_ * argument_537_;
			argument_557_ -= f_595_ * argument_537_;
			f -= f_576_ * argument_537_;
			f_560_ -= f_596_ * argument_537_;
			f_562_ -= f_576_ * argument_537_;
			f_563_ -= f_596_ * argument_537_;
			f_565_ -= f_576_ * argument_537_;
			f_566_ -= f_596_ * argument_537_;
			f_568_ -= f_576_ * argument_537_;
			f_569_ -= f_596_ * argument_537_;
			argument_537_ = 0.0F;
		    }
		    if (argument_539_ < 0.0F) {
			argument_542_ -= f_581_ * argument_539_;
			argument_545_ -= f_582_ * argument_539_;
			argument_548_ -= f_583_ * argument_539_;
			argument_551_ -= f_584_ * argument_539_;
			argument_558_ -= f_585_ * argument_539_;
			f_561_ -= f_586_ * argument_539_;
			f_564_ -= f_587_ * argument_539_;
			f_567_ -= f_588_ * argument_539_;
			f_570_ -= f_589_ * argument_539_;
			argument_539_ = 0.0F;
		    }
		    if (argument_537_ != argument_539_ && f_591_ < f_571_
			|| argument_537_ == argument_539_ && f_581_ > f_571_) {
			argument_538_ -= argument_539_;
			argument_539_ -= argument_537_;
			argument_537_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_537_]);
			while (--argument_539_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_537_,
				       (int) argument_541_,
				       (int) argument_540_, argument_544_,
				       argument_543_, argument_547_,
				       argument_546_, argument_550_,
				       argument_549_, (float) argument_557_,
				       (float) argument_556_, f_560_, f,
				       f_563_, f_562_, f_566_, f_565_, f_569_,
				       f_568_);
			    argument_540_ += f_571_;
			    argument_541_ += f_591_;
			    argument_543_ += f_572_;
			    argument_544_ += f_592_;
			    argument_546_ += f_573_;
			    argument_547_ += f_593_;
			    argument_549_ += f_574_;
			    argument_550_ += f_594_;
			    argument_556_ += f_575_;
			    argument_557_ += f_595_;
			    f += f_576_;
			    f_560_ += f_596_;
			    f_562_ += f_577_;
			    f_563_ += f_597_;
			    f_565_ += f_578_;
			    f_566_ += f_598_;
			    f_568_ += f_579_;
			    f_569_ += f_599_;
			    argument_537_ += (float) anInt652;
			}
			while (--argument_538_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_537_,
				       (int) argument_542_,
				       (int) argument_540_, argument_545_,
				       argument_543_, argument_548_,
				       argument_546_, argument_551_,
				       argument_549_, (float) argument_558_,
				       (float) argument_556_, f_561_, f,
				       f_564_, f_562_, f_567_, f_565_, f_570_,
				       f_568_);
			    argument_542_ += f_581_;
			    argument_540_ += f_571_;
			    argument_545_ += f_582_;
			    argument_543_ += f_572_;
			    argument_548_ += f_583_;
			    argument_546_ += f_573_;
			    argument_551_ += f_584_;
			    argument_549_ += f_574_;
			    argument_558_ += f_585_;
			    argument_556_ += f_575_;
			    f_561_ += f_586_;
			    f += f_576_;
			    f_564_ += f_587_;
			    f_562_ += f_577_;
			    f_567_ += f_588_;
			    f_565_ += f_578_;
			    f_570_ += f_589_;
			    f_568_ += f_579_;
			    argument_537_ += (float) anInt652;
			}
		    } else {
			argument_538_ -= argument_539_;
			argument_539_ -= argument_537_;
			argument_537_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_537_]);
			while (--argument_539_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_537_,
				       (int) argument_540_,
				       (int) argument_541_, argument_543_,
				       argument_544_, argument_546_,
				       argument_547_, argument_549_,
				       argument_550_, (float) argument_556_,
				       (float) argument_557_, f, f_560_,
				       f_562_, f_563_, f_565_, f_566_, f_568_,
				       f_569_);
			    argument_541_ += f_591_;
			    argument_540_ += f_571_;
			    argument_544_ += f_592_;
			    argument_543_ += f_572_;
			    argument_547_ += f_593_;
			    argument_546_ += f_573_;
			    argument_550_ += f_594_;
			    argument_549_ += f_574_;
			    argument_557_ += f_595_;
			    argument_556_ += f_575_;
			    f_560_ += f_596_;
			    f += f_576_;
			    f_563_ += f_597_;
			    f_562_ += f_577_;
			    f_566_ += f_598_;
			    f_565_ += f_578_;
			    f_569_ += f_599_;
			    f_568_ += f_579_;
			    argument_537_ += (float) anInt652;
			}
			while (--argument_538_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_537_,
				       (int) argument_540_,
				       (int) argument_542_, argument_543_,
				       argument_545_, argument_546_,
				       argument_548_, argument_549_,
				       argument_551_, (float) argument_556_,
				       (float) argument_558_, f, f_561_,
				       f_562_, f_564_, f_565_, f_567_, f_568_,
				       f_570_);
			    argument_540_ += f_571_;
			    argument_542_ += f_581_;
			    argument_543_ += f_572_;
			    argument_545_ += f_582_;
			    argument_546_ += f_573_;
			    argument_548_ += f_583_;
			    argument_549_ += f_574_;
			    argument_551_ += f_584_;
			    argument_556_ += f_575_;
			    argument_558_ += f_585_;
			    f += f_576_;
			    f_561_ += f_586_;
			    f_562_ += f_577_;
			    f_564_ += f_587_;
			    f_565_ += f_578_;
			    f_567_ += f_588_;
			    f_568_ += f_579_;
			    f_570_ += f_589_;
			    argument_537_ += (float) anInt652;
			}
		    }
		}
	    }
	} else if (argument_538_ <= argument_539_) {
	    if (!(argument_538_ >= (float) ((Class89) this).anInt653)) {
		if (argument_539_ > (float) ((Class89) this).anInt653)
		    argument_539_ = (float) ((Class89) this).anInt653;
		if (argument_537_ > (float) ((Class89) this).anInt653)
		    argument_537_ = (float) ((Class89) this).anInt653;
		if (argument_539_ < argument_537_) {
		    argument_540_ = argument_541_;
		    argument_543_ = argument_544_;
		    argument_546_ = argument_547_;
		    argument_549_ = argument_550_;
		    argument_556_ = argument_557_;
		    f = f_560_;
		    f_562_ = f_563_;
		    f_565_ = f_566_;
		    f_568_ = f_569_;
		    if (argument_538_ < 0.0F) {
			argument_540_ -= f_571_ * argument_538_;
			argument_541_ -= f_581_ * argument_538_;
			argument_543_ -= f_572_ * argument_538_;
			argument_544_ -= f_582_ * argument_538_;
			argument_546_ -= f_573_ * argument_538_;
			argument_547_ -= f_583_ * argument_538_;
			argument_549_ -= f_574_ * argument_538_;
			argument_550_ -= f_584_ * argument_538_;
			argument_556_ -= f_575_ * argument_538_;
			argument_557_ -= f_585_ * argument_538_;
			f -= f_576_ * argument_538_;
			f_560_ -= f_586_ * argument_538_;
			f_562_ -= f_577_ * argument_538_;
			f_563_ -= f_587_ * argument_538_;
			f_565_ -= f_578_ * argument_538_;
			f_566_ -= f_588_ * argument_538_;
			f_568_ -= f_579_ * argument_538_;
			f_569_ -= f_589_ * argument_538_;
			argument_538_ = 0.0F;
		    }
		    if (argument_539_ < 0.0F) {
			argument_542_ -= f_591_ * argument_539_;
			argument_545_ -= f_592_ * argument_539_;
			argument_548_ -= f_593_ * argument_539_;
			argument_551_ -= f_594_ * argument_539_;
			argument_558_ -= f_595_ * argument_539_;
			f_561_ -= f_596_ * argument_539_;
			f_564_ -= f_597_ * argument_539_;
			f_567_ -= f_598_ * argument_539_;
			f_570_ -= f_599_ * argument_539_;
			argument_539_ = 0.0F;
		    }
		    if (argument_538_ != argument_539_ && f_571_ < f_581_
			|| argument_538_ == argument_539_ && f_571_ > f_591_) {
			argument_537_ -= argument_539_;
			argument_539_ -= argument_538_;
			argument_538_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_538_]);
			while (--argument_539_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_538_,
				       (int) argument_540_,
				       (int) argument_541_, argument_543_,
				       argument_544_, argument_546_,
				       argument_547_, argument_549_,
				       argument_550_, (float) argument_556_,
				       (float) argument_557_, f, f_560_,
				       f_562_, f_563_, f_565_, f_566_, f_568_,
				       f_569_);
			    argument_540_ += f_571_;
			    argument_541_ += f_581_;
			    argument_543_ += f_572_;
			    argument_544_ += f_582_;
			    argument_546_ += f_573_;
			    argument_547_ += f_583_;
			    argument_549_ += f_574_;
			    argument_550_ += f_584_;
			    argument_556_ += f_575_;
			    argument_557_ += f_585_;
			    f += f_576_;
			    f_560_ += f_586_;
			    f_562_ += f_577_;
			    f_563_ += f_587_;
			    f_565_ += f_578_;
			    f_566_ += f_588_;
			    f_568_ += f_579_;
			    f_569_ += f_589_;
			    argument_538_ += (float) anInt652;
			}
			while (--argument_537_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_538_,
				       (int) argument_540_,
				       (int) argument_542_, argument_543_,
				       argument_545_, argument_546_,
				       argument_548_, argument_549_,
				       argument_551_, (float) argument_556_,
				       (float) argument_558_, f, f_561_,
				       f_562_, f_564_, f_565_, f_567_, f_568_,
				       f_570_);
			    argument_540_ += f_571_;
			    argument_542_ += f_591_;
			    argument_543_ += f_572_;
			    argument_545_ += f_592_;
			    argument_546_ += f_573_;
			    argument_548_ += f_593_;
			    argument_549_ += f_574_;
			    argument_551_ += f_594_;
			    argument_556_ += f_575_;
			    argument_558_ += f_595_;
			    f += f_576_;
			    f_561_ += f_596_;
			    f_562_ += f_577_;
			    f_564_ += f_597_;
			    f_565_ += f_578_;
			    f_567_ += f_598_;
			    f_568_ += f_579_;
			    f_570_ += f_599_;
			    argument_538_ += (float) anInt652;
			}
		    } else {
			argument_537_ -= argument_539_;
			argument_539_ -= argument_538_;
			argument_538_ = (float) (((Class89) this).anIntArray658
						 [(int) argument_538_]);
			while (--argument_539_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_538_,
				       (int) argument_541_,
				       (int) argument_540_, argument_544_,
				       argument_543_, argument_547_,
				       argument_546_, argument_550_,
				       argument_549_, (float) argument_557_,
				       (float) argument_556_, f_560_, f,
				       f_563_, f_562_, f_566_, f_565_, f_569_,
				       f_568_);
			    argument_541_ += f_581_;
			    argument_540_ += f_571_;
			    argument_544_ += f_582_;
			    argument_543_ += f_572_;
			    argument_547_ += f_583_;
			    argument_546_ += f_573_;
			    argument_550_ += f_584_;
			    argument_549_ += f_574_;
			    argument_557_ += f_585_;
			    argument_556_ += f_575_;
			    f_560_ += f_586_;
			    f += f_576_;
			    f_563_ += f_587_;
			    f_562_ += f_577_;
			    f_566_ += f_588_;
			    f_565_ += f_578_;
			    f_569_ += f_589_;
			    f_568_ += f_579_;
			    argument_538_ += (float) anInt652;
			}
			while (--argument_537_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_538_,
				       (int) argument_542_,
				       (int) argument_540_, argument_545_,
				       argument_543_, argument_548_,
				       argument_546_, argument_551_,
				       argument_549_, (float) argument_558_,
				       (float) argument_556_, f_561_, f,
				       f_564_, f_562_, f_567_, f_565_, f_570_,
				       f_568_);
			    argument_542_ += f_591_;
			    argument_540_ += f_571_;
			    argument_545_ += f_592_;
			    argument_543_ += f_572_;
			    argument_548_ += f_593_;
			    argument_546_ += f_573_;
			    argument_551_ += f_594_;
			    argument_549_ += f_574_;
			    argument_558_ += f_595_;
			    argument_556_ += f_575_;
			    f_561_ += f_596_;
			    f += f_576_;
			    f_564_ += f_597_;
			    f_562_ += f_577_;
			    f_567_ += f_598_;
			    f_565_ += f_578_;
			    f_570_ += f_599_;
			    f_568_ += f_579_;
			    argument_538_ += (float) anInt652;
			}
		    }
		} else {
		    argument_542_ = argument_541_;
		    argument_545_ = argument_544_;
		    argument_548_ = argument_547_;
		    argument_551_ = argument_550_;
		    argument_558_ = argument_557_;
		    f_561_ = f_560_;
		    f_564_ = f_563_;
		    f_567_ = f_566_;
		    f_570_ = f_569_;
		    if (argument_538_ < 0.0F) {
			argument_542_ -= f_571_ * argument_538_;
			argument_541_ -= f_581_ * argument_538_;
			argument_545_ -= f_572_ * argument_538_;
			argument_544_ -= f_582_ * argument_538_;
			argument_548_ -= f_573_ * argument_538_;
			argument_547_ -= f_583_ * argument_538_;
			argument_551_ -= f_574_ * argument_538_;
			argument_550_ -= f_584_ * argument_538_;
			argument_558_ -= f_575_ * argument_538_;
			argument_557_ -= f_585_ * argument_538_;
			f_561_ -= f_576_ * argument_538_;
			f_560_ -= f_586_ * argument_538_;
			f_564_ -= f_577_ * argument_538_;
			f_563_ -= f_587_ * argument_538_;
			f_567_ -= f_578_ * argument_538_;
			f_566_ -= f_588_ * argument_538_;
			f_570_ -= f_579_ * argument_538_;
			f_569_ -= f_589_ * argument_538_;
			argument_538_ = 0.0F;
		    }
		    if (argument_537_ < 0.0F) {
			argument_540_ -= f_591_ * argument_537_;
			argument_543_ -= f_592_ * argument_537_;
			argument_546_ -= f_593_ * argument_537_;
			argument_549_ -= f_594_ * argument_537_;
			argument_556_ -= f_595_ * argument_537_;
			f -= f_596_ * argument_537_;
			f_562_ -= f_597_ * argument_537_;
			f_565_ -= f_598_ * argument_537_;
			f_568_ -= f_599_ * argument_537_;
			argument_537_ = 0.0F;
		    }
		    argument_539_ -= argument_537_;
		    argument_537_ -= argument_538_;
		    argument_538_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_538_]);
		    if (f_571_ < f_581_) {
			while (--argument_537_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_538_,
				       (int) argument_542_,
				       (int) argument_541_, argument_545_,
				       argument_544_, argument_548_,
				       argument_547_, argument_551_,
				       argument_550_, (float) argument_558_,
				       (float) argument_557_, f_561_, f_560_,
				       f_564_, f_563_, f_567_, f_566_, f_570_,
				       f_569_);
			    argument_542_ += f_571_;
			    argument_541_ += f_581_;
			    argument_545_ += f_572_;
			    argument_544_ += f_582_;
			    argument_548_ += f_573_;
			    argument_547_ += f_583_;
			    argument_551_ += f_574_;
			    argument_550_ += f_584_;
			    argument_558_ += f_575_;
			    argument_557_ += f_585_;
			    f_561_ += f_576_;
			    f_560_ += f_586_;
			    f_564_ += f_577_;
			    f_563_ += f_587_;
			    f_567_ += f_578_;
			    f_566_ += f_588_;
			    f_570_ += f_579_;
			    f_569_ += f_589_;
			    argument_538_ += (float) anInt652;
			}
			while (--argument_539_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_538_,
				       (int) argument_540_,
				       (int) argument_541_, argument_543_,
				       argument_544_, argument_546_,
				       argument_547_, argument_549_,
				       argument_550_, (float) argument_556_,
				       (float) argument_557_, f, f_560_,
				       f_562_, f_563_, f_565_, f_566_, f_568_,
				       f_569_);
			    argument_540_ += f_591_;
			    argument_541_ += f_581_;
			    argument_543_ += f_592_;
			    argument_544_ += f_582_;
			    argument_546_ += f_593_;
			    argument_547_ += f_583_;
			    argument_549_ += f_594_;
			    argument_550_ += f_584_;
			    argument_556_ += f_595_;
			    argument_557_ += f_585_;
			    f += f_596_;
			    f_560_ += f_586_;
			    f_562_ += f_597_;
			    f_563_ += f_587_;
			    f_565_ += f_598_;
			    f_566_ += f_588_;
			    f_568_ += f_599_;
			    f_569_ += f_589_;
			    argument_538_ += (float) anInt652;
			}
		    } else {
			while (--argument_537_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_538_,
				       (int) argument_541_,
				       (int) argument_542_, argument_544_,
				       argument_545_, argument_547_,
				       argument_548_, argument_550_,
				       argument_551_, (float) argument_557_,
				       (float) argument_558_, f_560_, f_561_,
				       f_563_, f_564_, f_566_, f_567_, f_569_,
				       f_570_);
			    argument_541_ += f_581_;
			    argument_542_ += f_571_;
			    argument_544_ += f_582_;
			    argument_545_ += f_572_;
			    argument_547_ += f_583_;
			    argument_548_ += f_573_;
			    argument_550_ += f_584_;
			    argument_551_ += f_574_;
			    argument_557_ += f_585_;
			    argument_558_ += f_575_;
			    f_560_ += f_586_;
			    f_561_ += f_576_;
			    f_563_ += f_587_;
			    f_564_ += f_577_;
			    f_566_ += f_588_;
			    f_567_ += f_578_;
			    f_569_ += f_589_;
			    f_570_ += f_579_;
			    argument_538_ += (float) anInt652;
			}
			while (--argument_539_ >= 0.0F) {
			    method1673(anIntArray657, anIntArray676,
				       (int) argument_538_,
				       (int) argument_541_,
				       (int) argument_540_, argument_544_,
				       argument_543_, argument_547_,
				       argument_546_, argument_550_,
				       argument_549_, (float) argument_557_,
				       (float) argument_556_, f_560_, f,
				       f_563_, f_562_, f_566_, f_565_, f_569_,
				       f_568_);
			    argument_541_ += f_581_;
			    argument_540_ += f_591_;
			    argument_544_ += f_582_;
			    argument_543_ += f_592_;
			    argument_547_ += f_583_;
			    argument_546_ += f_593_;
			    argument_550_ += f_584_;
			    argument_549_ += f_594_;
			    argument_557_ += f_585_;
			    argument_556_ += f_595_;
			    f_560_ += f_586_;
			    f += f_596_;
			    f_563_ += f_587_;
			    f_562_ += f_597_;
			    f_566_ += f_588_;
			    f_565_ += f_598_;
			    f_569_ += f_589_;
			    f_568_ += f_599_;
			    argument_538_ += (float) anInt652;
			}
		    }
		}
	    }
	} else if (!(argument_539_ >= (float) ((Class89) this).anInt653)) {
	    if (argument_537_ > (float) ((Class89) this).anInt653)
		argument_537_ = (float) ((Class89) this).anInt653;
	    if (argument_538_ > (float) ((Class89) this).anInt653)
		argument_538_ = (float) ((Class89) this).anInt653;
	    if (argument_537_ < argument_538_) {
		argument_541_ = argument_542_;
		argument_544_ = argument_545_;
		argument_547_ = argument_548_;
		argument_550_ = argument_551_;
		argument_557_ = argument_558_;
		f_560_ = f_561_;
		f_563_ = f_564_;
		f_566_ = f_567_;
		f_569_ = f_570_;
		if (argument_539_ < 0.0F) {
		    argument_542_ -= f_591_ * argument_539_;
		    argument_541_ -= f_581_ * argument_539_;
		    argument_545_ -= f_592_ * argument_539_;
		    argument_544_ -= f_582_ * argument_539_;
		    argument_548_ -= f_593_ * argument_539_;
		    argument_547_ -= f_583_ * argument_539_;
		    argument_551_ -= f_594_ * argument_539_;
		    argument_550_ -= f_584_ * argument_539_;
		    argument_558_ -= f_595_ * 3.0F;
		    argument_557_ -= f_585_ * argument_539_;
		    f_561_ -= f_596_ * argument_539_;
		    f_560_ -= f_586_ * argument_539_;
		    f_564_ -= f_597_ * argument_539_;
		    f_563_ -= f_587_ * argument_539_;
		    f_567_ -= f_598_ * argument_539_;
		    f_566_ -= f_588_ * argument_539_;
		    f_570_ -= f_599_ * argument_539_;
		    f_569_ -= f_589_ * argument_539_;
		    argument_539_ = 0.0F;
		}
		if (argument_537_ < 0.0F) {
		    argument_540_ -= f_571_ * argument_537_;
		    argument_543_ -= f_572_ * argument_537_;
		    argument_546_ -= f_573_ * argument_537_;
		    argument_549_ -= f_574_ * argument_537_;
		    argument_556_ -= f_575_ * argument_537_;
		    f -= f_576_ * argument_537_;
		    f_562_ -= f_577_ * argument_537_;
		    f_565_ -= f_578_ * argument_537_;
		    f_568_ -= f_579_ * argument_537_;
		    argument_537_ = 0.0F;
		}
		if (f_581_ < f_591_) {
		    argument_538_ -= argument_537_;
		    argument_537_ -= argument_539_;
		    argument_539_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_539_]);
		    while (--argument_537_ >= 0.0F) {
			method1673(anIntArray657, anIntArray676,
				   (int) argument_539_, (int) argument_541_,
				   (int) argument_542_, argument_544_,
				   argument_545_, argument_547_, argument_548_,
				   argument_550_, argument_551_,
				   (float) argument_557_,
				   (float) argument_558_, f_560_, f_561_,
				   f_563_, f_564_, f_566_, f_567_, f_569_,
				   f_570_);
			argument_541_ += f_581_;
			argument_542_ += f_591_;
			argument_544_ += f_582_;
			argument_545_ += f_592_;
			argument_547_ += f_583_;
			argument_548_ += f_593_;
			argument_550_ += f_584_;
			argument_551_ += f_594_;
			argument_557_ += f_585_;
			argument_558_ += f_595_;
			f_560_ += f_586_;
			f_561_ += f_596_;
			f_563_ += f_587_;
			f_564_ += f_597_;
			f_566_ += f_588_;
			f_567_ += f_598_;
			f_569_ += f_589_;
			f_570_ += f_599_;
			argument_539_ += (float) anInt652;
		    }
		    while (--argument_538_ >= 0.0F) {
			method1673(anIntArray657, anIntArray676,
				   (int) argument_539_, (int) argument_541_,
				   (int) argument_540_, argument_544_,
				   argument_543_, argument_547_, argument_546_,
				   argument_550_, argument_549_,
				   (float) argument_557_,
				   (float) argument_556_, f_560_, f, f_563_,
				   f_562_, f_566_, f_565_, f_569_, f_568_);
			argument_541_ += f_581_;
			argument_540_ += f_571_;
			argument_544_ += f_582_;
			argument_543_ += f_572_;
			argument_547_ += f_583_;
			argument_546_ += f_573_;
			argument_550_ += f_584_;
			argument_549_ += f_574_;
			argument_557_ += f_585_;
			argument_556_ += f_575_;
			f_560_ += f_586_;
			f += f_576_;
			f_563_ += f_587_;
			f_562_ += f_577_;
			f_566_ += f_588_;
			f_565_ += f_578_;
			f_569_ += f_589_;
			f_568_ += f_579_;
			argument_539_ += (float) anInt652;
		    }
		} else {
		    argument_538_ -= argument_537_;
		    argument_537_ -= argument_539_;
		    argument_539_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_539_]);
		    while (--argument_537_ >= 0.0F) {
			method1673(anIntArray657, anIntArray676,
				   (int) argument_539_, (int) argument_542_,
				   (int) argument_541_, argument_545_,
				   argument_544_, argument_548_, argument_547_,
				   argument_551_, argument_550_,
				   (float) argument_558_,
				   (float) argument_557_, f_561_, f_560_,
				   f_564_, f_563_, f_567_, f_566_, f_570_,
				   f_569_);
			argument_542_ += f_591_;
			argument_541_ += f_581_;
			argument_545_ += f_592_;
			argument_544_ += f_582_;
			argument_548_ += f_593_;
			argument_547_ += f_583_;
			argument_551_ += f_594_;
			argument_550_ += f_584_;
			argument_558_ += f_595_;
			argument_557_ += f_585_;
			f_561_ += f_596_;
			f_560_ += f_586_;
			f_564_ += f_597_;
			f_563_ += f_587_;
			f_567_ += f_598_;
			f_566_ += f_588_;
			f_570_ += f_599_;
			f_569_ += f_589_;
			argument_539_ += (float) anInt652;
		    }
		    while (--argument_538_ >= 0.0F) {
			method1673(anIntArray657, anIntArray676,
				   (int) argument_539_, (int) argument_540_,
				   (int) argument_541_, argument_543_,
				   argument_544_, argument_546_, argument_547_,
				   argument_549_, argument_550_,
				   (float) argument_556_,
				   (float) argument_557_, f, f_560_, f_562_,
				   f_563_, f_565_, f_566_, f_568_, f_569_);
			argument_540_ += f_571_;
			argument_541_ += f_581_;
			argument_543_ += f_572_;
			argument_544_ += f_582_;
			argument_546_ += f_573_;
			argument_547_ += f_583_;
			argument_549_ += f_574_;
			argument_550_ += f_584_;
			argument_556_ += f_575_;
			argument_557_ += f_585_;
			f += f_576_;
			f_560_ += f_586_;
			f_562_ += f_577_;
			f_563_ += f_587_;
			f_565_ += f_578_;
			f_566_ += f_588_;
			f_568_ += f_579_;
			f_569_ += f_589_;
			argument_539_ += (float) anInt652;
		    }
		}
	    } else {
		argument_540_ = argument_542_;
		argument_543_ = argument_545_;
		argument_546_ = argument_548_;
		argument_549_ = argument_551_;
		argument_556_ = argument_558_;
		f = f_561_;
		f_562_ = f_564_;
		f_565_ = f_567_;
		f_568_ = f_570_;
		if (argument_539_ < 0.0F) {
		    argument_542_ -= f_591_ * argument_539_;
		    argument_540_ -= f_581_ * argument_539_;
		    argument_545_ -= f_592_ * argument_539_;
		    argument_543_ -= f_582_ * argument_539_;
		    argument_548_ -= f_593_ * argument_539_;
		    argument_546_ -= f_583_ * argument_539_;
		    argument_551_ -= f_594_ * argument_539_;
		    argument_549_ -= f_584_ * argument_539_;
		    argument_558_ -= f_595_ * 3.0F;
		    argument_556_ -= f_585_ * argument_539_;
		    f_561_ -= f_596_ * argument_539_;
		    f -= f_586_ * argument_539_;
		    f_564_ -= f_597_ * argument_539_;
		    f_562_ -= f_587_ * argument_539_;
		    f_567_ -= f_598_ * argument_539_;
		    f_565_ -= f_588_ * argument_539_;
		    f_570_ -= f_599_ * argument_539_;
		    f_568_ -= f_589_ * argument_539_;
		    argument_539_ = 0.0F;
		}
		if (argument_538_ < 0.0F) {
		    argument_541_ -= f_571_ * argument_538_;
		    argument_544_ -= f_572_ * argument_538_;
		    argument_547_ -= f_573_ * argument_538_;
		    argument_550_ -= f_574_ * argument_538_;
		    argument_557_ -= f_575_ * argument_538_;
		    f_560_ -= f_576_ * argument_538_;
		    f_563_ -= f_577_ * argument_538_;
		    f_566_ -= f_578_ * argument_538_;
		    f_569_ -= f_579_ * argument_538_;
		    argument_538_ = 0.0F;
		}
		if (f_581_ < f_591_) {
		    argument_537_ -= argument_538_;
		    argument_538_ -= argument_539_;
		    argument_539_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_539_]);
		    while (--argument_538_ >= 0.0F) {
			method1673(anIntArray657, anIntArray676,
				   (int) argument_539_, (int) argument_540_,
				   (int) argument_542_, argument_543_,
				   argument_545_, argument_546_, argument_548_,
				   argument_549_, argument_551_,
				   (float) argument_556_,
				   (float) argument_558_, f, f_561_, f_562_,
				   f_564_, f_565_, f_567_, f_568_, f_570_);
			argument_540_ += f_581_;
			argument_542_ += f_591_;
			argument_543_ += f_582_;
			argument_545_ += f_592_;
			argument_546_ += f_583_;
			argument_548_ += f_593_;
			argument_549_ += f_584_;
			argument_551_ += f_594_;
			argument_556_ += f_585_;
			argument_558_ += f_595_;
			f += f_586_;
			f_561_ += f_596_;
			f_562_ += f_587_;
			f_564_ += f_597_;
			f_565_ += f_588_;
			f_567_ += f_598_;
			f_568_ += f_589_;
			f_570_ += f_599_;
			argument_539_ += (float) anInt652;
		    }
		    while (--argument_537_ >= 0.0F) {
			method1673(anIntArray657, anIntArray676,
				   (int) argument_539_, (int) argument_541_,
				   (int) argument_542_, argument_544_,
				   argument_545_, argument_547_, argument_548_,
				   argument_550_, argument_551_,
				   (float) argument_557_,
				   (float) argument_558_, f_560_, f_561_,
				   f_563_, f_564_, f_566_, f_567_, f_569_,
				   f_570_);
			argument_541_ += f_571_;
			argument_542_ += f_591_;
			argument_544_ += f_572_;
			argument_545_ += f_592_;
			argument_547_ += f_573_;
			argument_548_ += f_593_;
			argument_550_ += f_574_;
			argument_551_ += f_594_;
			argument_557_ += f_575_;
			argument_558_ += f_595_;
			f_560_ += f_576_;
			f_561_ += f_596_;
			f_563_ += f_577_;
			f_564_ += f_597_;
			f_566_ += f_578_;
			f_567_ += f_598_;
			f_569_ += f_579_;
			f_570_ += f_599_;
			argument_539_ += (float) anInt652;
		    }
		} else {
		    argument_537_ -= argument_538_;
		    argument_538_ -= argument_539_;
		    argument_539_ = (float) (((Class89) this).anIntArray658
					     [(int) argument_539_]);
		    while (--argument_538_ >= 0.0F) {
			method1673(anIntArray657, anIntArray676,
				   (int) argument_539_, (int) argument_542_,
				   (int) argument_540_, argument_545_,
				   argument_543_, argument_548_, argument_546_,
				   argument_551_, argument_549_,
				   (float) argument_558_,
				   (float) argument_556_, f_561_, f, f_564_,
				   f_562_, f_567_, f_565_, f_570_, f_568_);
			argument_542_ += f_591_;
			argument_540_ += f_581_;
			argument_545_ += f_592_;
			argument_543_ += f_582_;
			argument_548_ += f_593_;
			argument_546_ += f_583_;
			argument_551_ += f_594_;
			argument_549_ += f_584_;
			argument_558_ += f_595_;
			argument_556_ += f_585_;
			f_561_ += f_596_;
			f += f_586_;
			f_564_ += f_597_;
			f_562_ += f_587_;
			f_567_ += f_598_;
			f_565_ += f_588_;
			f_570_ += f_599_;
			f_568_ += f_589_;
			argument_539_ += (float) anInt652;
		    }
		    while (--argument_537_ >= 0.0F) {
			method1673(anIntArray657, anIntArray676,
				   (int) argument_539_, (int) argument_542_,
				   (int) argument_541_, argument_545_,
				   argument_544_, argument_548_, argument_547_,
				   argument_551_, argument_550_,
				   (float) argument_558_,
				   (float) argument_557_, f_561_, f_560_,
				   f_564_, f_563_, f_567_, f_566_, f_570_,
				   f_569_);
			argument_542_ += f_591_;
			argument_541_ += f_571_;
			argument_545_ += f_592_;
			argument_544_ += f_572_;
			argument_548_ += f_593_;
			argument_547_ += f_573_;
			argument_551_ += f_594_;
			argument_550_ += f_574_;
			argument_558_ += f_595_;
			argument_557_ += f_575_;
			f_561_ += f_596_;
			f_560_ += f_576_;
			f_564_ += f_597_;
			f_563_ += f_577_;
			f_567_ += f_598_;
			f_566_ += f_578_;
			f_570_ += f_599_;
			f_569_ += f_579_;
			argument_539_ += (float) anInt652;
		    }
		}
	    }
	}
    }
    
    final void method1669(boolean argument_601_) {
	aBoolean649 = argument_601_;
    }
    
    final void method1670
	(float argument_602_, float argument_603_, float argument_604_,
	 float argument_605_, float argument_606_, float argument_607_,
	 float argument_608_, float argument_609_, float argument_610_,
	 int argument_611_, int argument_612_, int argument_613_) {
	if (aBoolean649) {
	    aClass_ha__651.method2035(argument_611_ | ~0xffffff,
					  (byte) -123, (int) argument_602_,
					  (int) argument_606_,
					  (int) argument_603_,
					  (int) argument_605_);
	    aClass_ha__651.method2035(argument_611_ | ~0xffffff,
					  (byte) -50, (int) argument_603_,
					  (int) argument_607_,
					  (int) argument_604_,
					  (int) argument_606_);
	    aClass_ha__651.method2035(argument_611_ | ~0xffffff,
					  (byte) -77, (int) argument_604_,
					  (int) argument_605_,
					  (int) argument_602_,
					  (int) argument_607_);
	} else {
	    float f = argument_606_ - argument_605_;
	    float f_614_ = argument_603_ - argument_602_;
	    float f_615_ = argument_607_ - argument_605_;
	    float f_616_ = argument_604_ - argument_602_;
	    float f_617_ = argument_609_ - argument_608_;
	    float f_618_ = argument_610_ - argument_608_;
	    float f_619_ = (float) ((argument_612_ & 0xff0000)
				    - (argument_611_ & 0xff0000));
	    float f_620_ = (float) ((argument_613_ & 0xff0000)
				    - (argument_611_ & 0xff0000));
	    float f_621_ = (float) ((argument_612_ & 0xff00)
				    - (argument_611_ & 0xff00));
	    float f_622_ = (float) ((argument_613_ & 0xff00)
				    - (argument_611_ & 0xff00));
	    float f_623_
		= (float) ((argument_612_ & 0xff) - (argument_611_ & 0xff));
	    float f_624_
		= (float) ((argument_613_ & 0xff) - (argument_611_ & 0xff));
	    float f_625_;
	    if (argument_604_ != argument_603_)
		f_625_ = (argument_607_ - argument_606_) / (argument_604_
							    - argument_603_);
	    else
		f_625_ = 0.0F;
	    float f_626_;
	    if (argument_603_ != argument_602_)
		f_626_ = f / f_614_;
	    else
		f_626_ = 0.0F;
	    float f_627_;
	    if (argument_604_ != argument_602_)
		f_627_ = f_615_ / f_616_;
	    else
		f_627_ = 0.0F;
	    float f_628_ = f * f_616_ - f_615_ * f_614_;
	    if (f_628_ != 0.0F) {
		float f_629_ = (f_617_ * f_616_ - f_618_ * f_614_) / f_628_;
		float f_630_ = (f_618_ * f - f_617_ * f_615_) / f_628_;
		float f_631_ = (f_619_ * f_616_ - f_620_ * f_614_) / f_628_;
		float f_632_ = (f_620_ * f - f_619_ * f_615_) / f_628_;
		float f_633_ = (f_621_ * f_616_ - f_622_ * f_614_) / f_628_;
		float f_634_ = (f_622_ * f - f_621_ * f_615_) / f_628_;
		float f_635_ = (f_623_ * f_616_ - f_624_ * f_614_) / f_628_;
		float f_636_ = (f_624_ * f - f_623_ * f_615_) / f_628_;
		if (argument_602_ <= argument_603_
		    && argument_602_ <= argument_604_) {
		    if (!(argument_602_
			  >= (float) ((Class89) this).anInt653)) {
			if (argument_603_ > (float) ((Class89) this).anInt653)
			    argument_603_ = (float) ((Class89) this).anInt653;
			if (argument_604_ > (float) ((Class89) this).anInt653)
			    argument_604_ = (float) ((Class89) this).anInt653;
			argument_608_
			    = argument_608_ - f_629_ * argument_605_ + f_629_;
			float f_637_ = ((float) (argument_611_ & 0xff0000)
					- f_631_ * argument_605_ + f_631_);
			float f_638_ = ((float) (argument_611_ & 0xff00)
					- f_633_ * argument_605_ + f_633_);
			float f_639_ = ((float) (argument_611_ & 0xff)
					- f_635_ * argument_605_ + f_635_);
			if (argument_603_ < argument_604_) {
			    argument_607_ = argument_605_;
			    if (argument_602_ < 0.0F) {
				argument_607_ -= f_627_ * argument_602_;
				argument_605_ -= f_626_ * argument_602_;
				argument_608_ -= f_630_ * argument_602_;
				f_637_ -= f_632_ * argument_602_;
				f_638_ -= f_634_ * argument_602_;
				f_639_ -= f_636_ * argument_602_;
				argument_602_ = 0.0F;
			    }
			    if (argument_603_ < 0.0F) {
				argument_606_ -= f_625_ * argument_603_;
				argument_603_ = 0.0F;
			    }
			    if ((argument_602_ != argument_603_
				 && f_627_ < f_626_)
				|| (argument_602_ == argument_603_
				    && f_627_ > f_625_)) {
				argument_604_ -= argument_603_;
				argument_603_ -= argument_602_;
				argument_602_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_602_]);
				while (--argument_603_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_602_, 0, 0,
					       (int) argument_607_,
					       (int) argument_605_,
					       argument_608_, f_629_, f_637_,
					       f_631_, f_638_, f_633_, f_639_,
					       f_635_);
				    argument_607_ += f_627_;
				    argument_605_ += f_626_;
				    argument_608_ += f_630_;
				    f_637_ += f_632_;
				    f_638_ += f_634_;
				    f_639_ += f_636_;
				    argument_602_ += (float) anInt652;
				}
				while (--argument_604_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_602_, 0, 0,
					       (int) argument_607_,
					       (int) argument_606_,
					       argument_608_, f_629_, f_637_,
					       f_631_, f_638_, f_633_, f_639_,
					       f_635_);
				    argument_607_ += f_627_;
				    argument_606_ += f_625_;
				    argument_608_ += f_630_;
				    f_637_ += f_632_;
				    f_638_ += f_634_;
				    f_639_ += f_636_;
				    argument_602_ += (float) anInt652;
				}
			    } else {
				argument_604_ -= argument_603_;
				argument_603_ -= argument_602_;
				argument_602_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_602_]);
				while (--argument_603_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_602_, 0, 0,
					       (int) argument_605_,
					       (int) argument_607_,
					       argument_608_, f_629_, f_637_,
					       f_631_, f_638_, f_633_, f_639_,
					       f_635_);
				    argument_607_ += f_627_;
				    argument_605_ += f_626_;
				    argument_608_ += f_630_;
				    f_637_ += f_632_;
				    f_638_ += f_634_;
				    f_639_ += f_636_;
				    argument_602_ += (float) anInt652;
				}
				while (--argument_604_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_602_, 0, 0,
					       (int) argument_606_,
					       (int) argument_607_,
					       argument_608_, f_629_, f_637_,
					       f_631_, f_638_, f_633_, f_639_,
					       f_635_);
				    argument_607_ += f_627_;
				    argument_606_ += f_625_;
				    argument_608_ += f_630_;
				    f_637_ += f_632_;
				    f_638_ += f_634_;
				    f_639_ += f_636_;
				    argument_602_ += (float) anInt652;
				}
			    }
			} else {
			    argument_606_ = argument_605_;
			    if (argument_602_ < 0.0F) {
				argument_606_ -= f_627_ * argument_602_;
				argument_605_ -= f_626_ * argument_602_;
				argument_608_ -= f_630_ * argument_602_;
				f_637_ -= f_632_ * argument_602_;
				f_638_ -= f_634_ * argument_602_;
				f_639_ -= f_636_ * argument_602_;
				argument_602_ = 0.0F;
			    }
			    if (argument_604_ < 0.0F) {
				argument_607_ -= f_625_ * argument_604_;
				argument_604_ = 0.0F;
			    }
			    if ((argument_602_ != argument_604_
				 && f_627_ < f_626_)
				|| (argument_602_ == argument_604_
				    && f_625_ > f_626_)) {
				argument_603_ -= argument_604_;
				argument_604_ -= argument_602_;
				argument_602_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_602_]);
				while (--argument_604_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_602_, 0, 0,
					       (int) argument_606_,
					       (int) argument_605_,
					       argument_608_, f_629_, f_637_,
					       f_631_, f_638_, f_633_, f_639_,
					       f_635_);
				    argument_606_ += f_627_;
				    argument_605_ += f_626_;
				    argument_608_ += f_630_;
				    f_637_ += f_632_;
				    f_638_ += f_634_;
				    f_639_ += f_636_;
				    argument_602_ += (float) anInt652;
				}
				while (--argument_603_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_602_, 0, 0,
					       (int) argument_607_,
					       (int) argument_605_,
					       argument_608_, f_629_, f_637_,
					       f_631_, f_638_, f_633_, f_639_,
					       f_635_);
				    argument_607_ += f_625_;
				    argument_605_ += f_626_;
				    argument_608_ += f_630_;
				    f_637_ += f_632_;
				    f_638_ += f_634_;
				    f_639_ += f_636_;
				    argument_602_ += (float) anInt652;
				}
			    } else {
				argument_603_ -= argument_604_;
				argument_604_ -= argument_602_;
				argument_602_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_602_]);
				while (--argument_604_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_602_, 0, 0,
					       (int) argument_605_,
					       (int) argument_606_,
					       argument_608_, f_629_, f_637_,
					       f_631_, f_638_, f_633_, f_639_,
					       f_635_);
				    argument_606_ += f_627_;
				    argument_605_ += f_626_;
				    argument_608_ += f_630_;
				    f_637_ += f_632_;
				    f_638_ += f_634_;
				    f_639_ += f_636_;
				    argument_602_ += (float) anInt652;
				}
				while (--argument_603_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_602_, 0, 0,
					       (int) argument_605_,
					       (int) argument_607_,
					       argument_608_, f_629_, f_637_,
					       f_631_, f_638_, f_633_, f_639_,
					       f_635_);
				    argument_607_ += f_625_;
				    argument_605_ += f_626_;
				    argument_608_ += f_630_;
				    f_637_ += f_632_;
				    f_638_ += f_634_;
				    f_639_ += f_636_;
				    argument_602_ += (float) anInt652;
				}
			    }
			}
		    }
		} else if (argument_603_ <= argument_604_) {
		    if (!(argument_603_
			  >= (float) ((Class89) this).anInt653)) {
			if (argument_604_ > (float) ((Class89) this).anInt653)
			    argument_604_ = (float) ((Class89) this).anInt653;
			if (argument_602_ > (float) ((Class89) this).anInt653)
			    argument_602_ = (float) ((Class89) this).anInt653;
			argument_609_
			    = argument_609_ - f_629_ * argument_606_ + f_629_;
			float f_640_ = ((float) (argument_612_ & 0xff0000)
					- f_631_ * argument_606_ + f_631_);
			float f_641_ = ((float) (argument_612_ & 0xff00)
					- f_633_ * argument_606_ + f_633_);
			float f_642_ = ((float) (argument_612_ & 0xff)
					- f_635_ * argument_606_ + f_635_);
			if (argument_604_ < argument_602_) {
			    argument_605_ = argument_606_;
			    if (argument_603_ < 0.0F) {
				argument_605_ -= f_626_ * argument_603_;
				argument_606_ -= f_625_ * argument_603_;
				argument_609_ -= f_630_ * argument_603_;
				f_640_ -= f_632_ * argument_603_;
				f_641_ -= f_634_ * argument_603_;
				f_642_ -= f_636_ * argument_603_;
				argument_603_ = 0.0F;
			    }
			    if (argument_604_ < 0.0F) {
				argument_607_ -= f_627_ * argument_604_;
				argument_604_ = 0.0F;
			    }
			    if ((argument_603_ != argument_604_
				 && f_626_ < f_625_)
				|| (argument_603_ == argument_604_
				    && f_626_ > f_627_)) {
				argument_602_ -= argument_604_;
				argument_604_ -= argument_603_;
				argument_603_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_603_]);
				while (--argument_604_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_603_, 0, 0,
					       (int) argument_605_,
					       (int) argument_606_,
					       argument_609_, f_629_, f_640_,
					       f_631_, f_641_, f_633_, f_642_,
					       f_635_);
				    argument_605_ += f_626_;
				    argument_606_ += f_625_;
				    argument_609_ += f_630_;
				    f_640_ += f_632_;
				    f_641_ += f_634_;
				    f_642_ += f_636_;
				    argument_603_ += (float) anInt652;
				}
				while (--argument_602_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_603_, 0, 0,
					       (int) argument_605_,
					       (int) argument_607_,
					       argument_609_, f_629_, f_640_,
					       f_631_, f_641_, f_633_, f_642_,
					       f_635_);
				    argument_605_ += f_626_;
				    argument_607_ += f_627_;
				    argument_609_ += f_630_;
				    f_640_ += f_632_;
				    f_641_ += f_634_;
				    f_642_ += f_636_;
				    argument_603_ += (float) anInt652;
				}
			    } else {
				argument_602_ -= argument_604_;
				argument_604_ -= argument_603_;
				argument_603_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_603_]);
				while (--argument_604_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_603_, 0, 0,
					       (int) argument_606_,
					       (int) argument_605_,
					       argument_609_, f_629_, f_640_,
					       f_631_, f_641_, f_633_, f_642_,
					       f_635_);
				    argument_605_ += f_626_;
				    argument_606_ += f_625_;
				    argument_609_ += f_630_;
				    f_640_ += f_632_;
				    f_641_ += f_634_;
				    f_642_ += f_636_;
				    argument_603_ += (float) anInt652;
				}
				while (--argument_602_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_603_, 0, 0,
					       (int) argument_607_,
					       (int) argument_605_,
					       argument_609_, f_629_, f_640_,
					       f_631_, f_641_, f_633_, f_642_,
					       f_635_);
				    argument_605_ += f_626_;
				    argument_607_ += f_627_;
				    argument_609_ += f_630_;
				    f_640_ += f_632_;
				    f_641_ += f_634_;
				    f_642_ += f_636_;
				    argument_603_ += (float) anInt652;
				}
			    }
			} else {
			    argument_607_ = argument_606_;
			    if (argument_603_ < 0.0F) {
				argument_607_ -= f_626_ * argument_603_;
				argument_606_ -= f_625_ * argument_603_;
				argument_609_ -= f_630_ * argument_603_;
				f_640_ -= f_632_ * argument_603_;
				f_641_ -= f_634_ * argument_603_;
				f_642_ -= f_636_ * argument_603_;
				argument_603_ = 0.0F;
			    }
			    if (argument_602_ < 0.0F) {
				argument_605_ -= f_627_ * argument_602_;
				argument_602_ = 0.0F;
			    }
			    if (f_626_ < f_625_) {
				argument_604_ -= argument_602_;
				argument_602_ -= argument_603_;
				argument_603_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_603_]);
				while (--argument_602_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_603_, 0, 0,
					       (int) argument_607_,
					       (int) argument_606_,
					       argument_609_, f_629_, f_640_,
					       f_631_, f_641_, f_633_, f_642_,
					       f_635_);
				    argument_607_ += f_626_;
				    argument_606_ += f_625_;
				    argument_609_ += f_630_;
				    f_640_ += f_632_;
				    f_641_ += f_634_;
				    f_642_ += f_636_;
				    argument_603_ += (float) anInt652;
				}
				while (--argument_604_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_603_, 0, 0,
					       (int) argument_605_,
					       (int) argument_606_,
					       argument_609_, f_629_, f_640_,
					       f_631_, f_641_, f_633_, f_642_,
					       f_635_);
				    argument_605_ += f_627_;
				    argument_606_ += f_625_;
				    argument_609_ += f_630_;
				    f_640_ += f_632_;
				    f_641_ += f_634_;
				    f_642_ += f_636_;
				    argument_603_ += (float) anInt652;
				}
			    } else {
				argument_604_ -= argument_602_;
				argument_602_ -= argument_603_;
				argument_603_
				    = (float) (((Class89) this).anIntArray658
					       [(int) argument_603_]);
				while (--argument_602_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_603_, 0, 0,
					       (int) argument_606_,
					       (int) argument_607_,
					       argument_609_, f_629_, f_640_,
					       f_631_, f_641_, f_633_, f_642_,
					       f_635_);
				    argument_607_ += f_626_;
				    argument_606_ += f_625_;
				    argument_609_ += f_630_;
				    f_640_ += f_632_;
				    f_641_ += f_634_;
				    f_642_ += f_636_;
				    argument_603_ += (float) anInt652;
				}
				while (--argument_604_ >= 0.0F) {
				    method1662(anIntArray657, aFloatArray656,
					       (int) argument_603_, 0, 0,
					       (int) argument_606_,
					       (int) argument_605_,
					       argument_609_, f_629_, f_640_,
					       f_631_, f_641_, f_633_, f_642_,
					       f_635_);
				    argument_605_ += f_627_;
				    argument_606_ += f_625_;
				    argument_609_ += f_630_;
				    f_640_ += f_632_;
				    f_641_ += f_634_;
				    f_642_ += f_636_;
				    argument_603_ += (float) anInt652;
				}
			    }
			}
		    }
		} else if (!(argument_604_
			     >= (float) ((Class89) this).anInt653)) {
		    if (argument_602_ > (float) ((Class89) this).anInt653)
			argument_602_ = (float) ((Class89) this).anInt653;
		    if (argument_603_ > (float) ((Class89) this).anInt653)
			argument_603_ = (float) ((Class89) this).anInt653;
		    argument_610_
			= argument_610_ - f_629_ * argument_607_ + f_629_;
		    float f_643_ = ((float) (argument_613_ & 0xff0000)
				    - f_631_ * argument_607_ + f_631_);
		    float f_644_ = ((float) (argument_613_ & 0xff00)
				    - f_633_ * argument_607_ + f_633_);
		    float f_645_ = ((float) (argument_613_ & 0xff)
				    - f_635_ * argument_607_ + f_635_);
		    if (argument_602_ < argument_603_) {
			argument_606_ = argument_607_;
			if (argument_604_ < 0.0F) {
			    argument_606_ -= f_625_ * argument_604_;
			    argument_607_ -= f_627_ * argument_604_;
			    argument_610_ -= f_630_ * argument_604_;
			    f_643_ -= f_632_ * argument_604_;
			    f_644_ -= f_634_ * argument_604_;
			    f_645_ -= f_636_ * argument_604_;
			    argument_604_ = 0.0F;
			}
			if (argument_602_ < 0.0F) {
			    argument_605_ -= f_626_ * argument_602_;
			    argument_602_ = 0.0F;
			}
			if (f_625_ < f_627_) {
			    argument_603_ -= argument_602_;
			    argument_602_ -= argument_604_;
			    argument_604_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_604_]);
			    while (--argument_602_ >= 0.0F) {
				method1662(anIntArray657, aFloatArray656,
					   (int) argument_604_, 0, 0,
					   (int) argument_606_,
					   (int) argument_607_, argument_610_,
					   f_629_, f_643_, f_631_, f_644_,
					   f_633_, f_645_, f_635_);
				argument_606_ += f_625_;
				argument_607_ += f_627_;
				argument_610_ += f_630_;
				f_643_ += f_632_;
				f_644_ += f_634_;
				f_645_ += f_636_;
				argument_604_ += (float) anInt652;
			    }
			    while (--argument_603_ >= 0.0F) {
				method1662(anIntArray657, aFloatArray656,
					   (int) argument_604_, 0, 0,
					   (int) argument_606_,
					   (int) argument_605_, argument_610_,
					   f_629_, f_643_, f_631_, f_644_,
					   f_633_, f_645_, f_635_);
				argument_606_ += f_625_;
				argument_605_ += f_626_;
				argument_610_ += f_630_;
				f_643_ += f_632_;
				f_644_ += f_634_;
				f_645_ += f_636_;
				argument_604_ += (float) anInt652;
			    }
			} else {
			    argument_603_ -= argument_602_;
			    argument_602_ -= argument_604_;
			    argument_604_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_604_]);
			    while (--argument_602_ >= 0.0F) {
				method1662(anIntArray657, aFloatArray656,
					   (int) argument_604_, 0, 0,
					   (int) argument_607_,
					   (int) argument_606_, argument_610_,
					   f_629_, f_643_, f_631_, f_644_,
					   f_633_, f_645_, f_635_);
				argument_606_ += f_625_;
				argument_607_ += f_627_;
				argument_610_ += f_630_;
				f_643_ += f_632_;
				f_644_ += f_634_;
				f_645_ += f_636_;
				argument_604_ += (float) anInt652;
			    }
			    while (--argument_603_ >= 0.0F) {
				method1662(anIntArray657, aFloatArray656,
					   (int) argument_604_, 0, 0,
					   (int) argument_605_,
					   (int) argument_606_, argument_610_,
					   f_629_, f_643_, f_631_, f_644_,
					   f_633_, f_645_, f_635_);
				argument_606_ += f_625_;
				argument_605_ += f_626_;
				argument_610_ += f_630_;
				f_643_ += f_632_;
				f_644_ += f_634_;
				f_645_ += f_636_;
				argument_604_ += (float) anInt652;
			    }
			}
		    } else {
			argument_605_ = argument_607_;
			if (argument_604_ < 0.0F) {
			    argument_605_ -= f_625_ * argument_604_;
			    argument_607_ -= f_627_ * argument_604_;
			    argument_610_ -= f_630_ * argument_604_;
			    f_643_ -= f_632_ * argument_604_;
			    f_644_ -= f_634_ * argument_604_;
			    f_645_ -= f_636_ * argument_604_;
			    argument_604_ = 0.0F;
			}
			if (argument_603_ < 0.0F) {
			    argument_606_ -= f_626_ * argument_603_;
			    argument_603_ = 0.0F;
			}
			if (f_625_ < f_627_) {
			    argument_602_ -= argument_603_;
			    argument_603_ -= argument_604_;
			    argument_604_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_604_]);
			    while (--argument_603_ >= 0.0F) {
				method1662(anIntArray657, aFloatArray656,
					   (int) argument_604_, 0, 0,
					   (int) argument_605_,
					   (int) argument_607_, argument_610_,
					   f_629_, f_643_, f_631_, f_644_,
					   f_633_, f_645_, f_635_);
				argument_605_ += f_625_;
				argument_607_ += f_627_;
				argument_610_ += f_630_;
				f_643_ += f_632_;
				f_644_ += f_634_;
				f_645_ += f_636_;
				argument_604_ += (float) anInt652;
			    }
			    while (--argument_602_ >= 0.0F) {
				method1662(anIntArray657, aFloatArray656,
					   (int) argument_604_, 0, 0,
					   (int) argument_606_,
					   (int) argument_607_, argument_610_,
					   f_629_, f_643_, f_631_, f_644_,
					   f_633_, f_645_, f_635_);
				argument_606_ += f_626_;
				argument_607_ += f_627_;
				argument_610_ += f_630_;
				f_643_ += f_632_;
				f_644_ += f_634_;
				f_645_ += f_636_;
				argument_604_ += (float) anInt652;
			    }
			} else {
			    argument_602_ -= argument_603_;
			    argument_603_ -= argument_604_;
			    argument_604_
				= (float) (((Class89) this).anIntArray658
					   [(int) argument_604_]);
			    while (--argument_603_ >= 0.0F) {
				method1662(anIntArray657, aFloatArray656,
					   (int) argument_604_, 0, 0,
					   (int) argument_607_,
					   (int) argument_605_, argument_610_,
					   f_629_, f_643_, f_631_, f_644_,
					   f_633_, f_645_, f_635_);
				argument_605_ += f_625_;
				argument_607_ += f_627_;
				argument_610_ += f_630_;
				f_643_ += f_632_;
				f_644_ += f_634_;
				f_645_ += f_636_;
				argument_604_ += (float) anInt652;
			    }
			    while (--argument_602_ >= 0.0F) {
				method1662(anIntArray657, aFloatArray656,
					   (int) argument_604_, 0, 0,
					   (int) argument_607_,
					   (int) argument_606_, argument_610_,
					   f_629_, f_643_, f_631_, f_644_,
					   f_633_, f_645_, f_635_);
				argument_606_ += f_626_;
				argument_607_ += f_627_;
				argument_610_ += f_630_;
				f_643_ += f_632_;
				f_644_ += f_634_;
				f_645_ += f_636_;
				argument_604_ += (float) anInt652;
			    }
			}
		    }
		}
	    }
	}
    }
    
    private final void method1671
	(int[] argument_646_, float[] argument_647_, int argument_648_,
	 int argument_649_, int argument_650_, int argument_651_,
	 int argument_652_, float argument_653_, float argument_654_,
	 float argument_655_, float argument_656_, float argument_657_,
	 float argument_658_, float argument_659_, float argument_660_) {
	if (((Class89) this).aBoolean661) {
	    if (argument_652_ > ((Class89) this).anInt650)
		argument_652_ = ((Class89) this).anInt650;
	    if (argument_651_ < 0)
		argument_651_ = 0;
	}
	if (argument_651_ < argument_652_) {
	    if (aBoolean654) {
		argument_648_ += argument_651_;
		argument_655_ += argument_656_ * (float) argument_651_;
		argument_657_ += argument_658_ * (float) argument_651_;
		argument_659_ += argument_660_ * (float) argument_651_;
		if (((Class89) this).aBoolean647) {
		    argument_650_ = argument_652_ - argument_651_ >> 2;
		    argument_656_ *= 4.0F;
		    argument_658_ *= 4.0F;
		    argument_660_ *= 4.0F;
		    if (((Class89) this).anInt646 == 0) {
			if (argument_650_ > 0) {
			    do {
				argument_649_ = ((int) argument_655_ & 0xff0000
						 | (int) argument_657_ & 0xff00
						 | (int) argument_659_ & 0xff
						 | ~0xffffff);
				argument_655_ += argument_656_;
				argument_657_ += argument_658_;
				argument_659_ += argument_660_;
				argument_646_[argument_648_++] = argument_649_;
				argument_646_[argument_648_++] = argument_649_;
				argument_646_[argument_648_++] = argument_649_;
				argument_646_[argument_648_++] = argument_649_;
			    } while (--argument_650_ > 0);
			}
			argument_650_ = argument_652_ - argument_651_ & 0x3;
			if (argument_650_ > 0) {
			    argument_649_
				= ((int) argument_655_ & 0xff0000
				   | (int) argument_657_ & 0xff00
				   | (int) argument_659_ & 0xff | ~0xffffff);
			    do
				argument_646_[argument_648_++] = argument_649_;
			    while (--argument_650_ > 0);
			}
		    } else if (!((Class89) this).aBoolean659) {
			int anLocalInt = ((Class89) this).anInt646;
			int anLocalInt_661_ = 256 - ((Class89) this).anInt646;
			if (argument_650_ > 0) {
			    do {
				argument_649_ = ((int) argument_655_ & 0xff0000
						 | (int) argument_657_ & 0xff00
						 | (int) argument_659_ & 0xff
						 | ~0xffffff);
				argument_655_ += argument_656_;
				argument_657_ += argument_658_;
				argument_659_ += argument_660_;
				argument_649_ = ((((argument_649_ & 0xff00ff)
						   * anLocalInt_661_) >> 8
						  & 0xff00ff)
						 + (((argument_649_ & 0xff00)
						     * anLocalInt_661_) >> 8
						    & 0xff00));
				int anLocalInt_662_
				    = argument_646_[argument_648_];
				argument_646_[argument_648_++]
				    = (argument_649_
				       + (((anLocalInt_662_ & 0xff00ff)
					   * anLocalInt) >> 8
					  & 0xff00ff)
				       + (((anLocalInt_662_ & 0xff00)
					   * anLocalInt) >> 8
					  & 0xff00));
				anLocalInt_662_ = argument_646_[argument_648_];
				argument_646_[argument_648_++]
				    = (argument_649_
				       + (((anLocalInt_662_ & 0xff00ff)
					   * anLocalInt) >> 8
					  & 0xff00ff)
				       + (((anLocalInt_662_ & 0xff00)
					   * anLocalInt) >> 8
					  & 0xff00));
				anLocalInt_662_ = argument_646_[argument_648_];
				argument_646_[argument_648_++]
				    = (argument_649_
				       + (((anLocalInt_662_ & 0xff00ff)
					   * anLocalInt) >> 8
					  & 0xff00ff)
				       + (((anLocalInt_662_ & 0xff00)
					   * anLocalInt) >> 8
					  & 0xff00));
				anLocalInt_662_ = argument_646_[argument_648_];
				argument_646_[argument_648_++]
				    = (argument_649_
				       + (((anLocalInt_662_ & 0xff00ff)
					   * anLocalInt) >> 8
					  & 0xff00ff)
				       + (((anLocalInt_662_ & 0xff00)
					   * anLocalInt) >> 8
					  & 0xff00));
			    } while (--argument_650_ > 0);
			}
			argument_650_ = argument_652_ - argument_651_ & 0x3;
			if (argument_650_ > 0) {
			    argument_649_
				= ((int) argument_655_ & 0xff0000
				   | (int) argument_657_ & 0xff00
				   | (int) argument_659_ & 0xff | ~0xffffff);
			    argument_649_ = ((((argument_649_ & 0xff00ff)
					       * anLocalInt_661_) >> 8
					      & 0xff00ff)
					     + (((argument_649_ & 0xff00)
						 * anLocalInt_661_) >> 8
						& 0xff00));
			    do {
				int anLocalInt_663_
				    = argument_646_[argument_648_];
				argument_646_[argument_648_++]
				    = (argument_649_
				       + (((anLocalInt_663_ & 0xff00ff)
					   * anLocalInt) >> 8
					  & 0xff00ff)
				       + (((anLocalInt_663_ & 0xff00)
					   * anLocalInt) >> 8
					  & 0xff00));
			    } while (--argument_650_ > 0);
			}
		    } else {
			if (argument_650_ > 0) {
			    do {
				argument_649_ = ((int) argument_655_ & 0xff0000
						 | (int) argument_657_ & 0xff00
						 | (int) argument_659_ & 0xff);
				argument_655_ += argument_656_;
				argument_657_ += argument_658_;
				argument_659_ += argument_660_;
				int[] anLocalInts = argument_646_;
				int anLocalInt = argument_648_++;
				int anLocalInt_664_ = argument_649_;
				int anLocalInt_665_ = anLocalInts[anLocalInt];
				int anLocalInt_666_
				    = anLocalInt_664_ + anLocalInt_665_;
				int anLocalInt_667_
				    = ((anLocalInt_664_ & 0xff00ff)
				       + (anLocalInt_665_ & 0xff00ff));
				anLocalInt_665_
				    = ((anLocalInt_667_ & 0x1000100)
				       + (anLocalInt_666_ - anLocalInt_667_
					  & 0x10000));
				anLocalInts[anLocalInt]
				    = (anLocalInt_666_ - anLocalInt_665_
				       | ~0xffffff
				       | anLocalInt_665_ - (anLocalInt_665_
							    >>> 8));
				int[] anLocalInts_668_ = argument_646_;
				int anLocalInt_669_ = argument_648_++;
				int anLocalInt_670_ = argument_649_;
				int anLocalInt_671_
				    = anLocalInts_668_[anLocalInt_669_];
				int anLocalInt_672_
				    = anLocalInt_670_ + anLocalInt_671_;
				int anLocalInt_673_
				    = ((anLocalInt_670_ & 0xff00ff)
				       + (anLocalInt_671_ & 0xff00ff));
				anLocalInt_671_
				    = ((anLocalInt_673_ & 0x1000100)
				       + (anLocalInt_672_ - anLocalInt_673_
					  & 0x10000));
				anLocalInts_668_[anLocalInt_669_]
				    = (anLocalInt_672_ - anLocalInt_671_
				       | ~0xffffff
				       | anLocalInt_671_ - (anLocalInt_671_
							    >>> 8));
				int[] anLocalInts_674_ = argument_646_;
				int anLocalInt_675_ = argument_648_++;
				int anLocalInt_676_ = argument_649_;
				int anLocalInt_677_
				    = anLocalInts_674_[anLocalInt_675_];
				int anLocalInt_678_
				    = anLocalInt_676_ + anLocalInt_677_;
				int anLocalInt_679_
				    = ((anLocalInt_676_ & 0xff00ff)
				       + (anLocalInt_677_ & 0xff00ff));
				anLocalInt_677_
				    = ((anLocalInt_679_ & 0x1000100)
				       + (anLocalInt_678_ - anLocalInt_679_
					  & 0x10000));
				anLocalInts_674_[anLocalInt_675_]
				    = (anLocalInt_678_ - anLocalInt_677_
				       | ~0xffffff
				       | anLocalInt_677_ - (anLocalInt_677_
							    >>> 8));
				int[] anLocalInts_680_ = argument_646_;
				int anLocalInt_681_ = argument_648_++;
				int anLocalInt_682_ = argument_649_;
				int anLocalInt_683_
				    = anLocalInts_680_[anLocalInt_681_];
				int anLocalInt_684_
				    = anLocalInt_682_ + anLocalInt_683_;
				int anLocalInt_685_
				    = ((anLocalInt_682_ & 0xff00ff)
				       + (anLocalInt_683_ & 0xff00ff));
				anLocalInt_683_
				    = ((anLocalInt_685_ & 0x1000100)
				       + (anLocalInt_684_ - anLocalInt_685_
					  & 0x10000));
				anLocalInts_680_[anLocalInt_681_]
				    = (anLocalInt_684_ - anLocalInt_683_
				       | ~0xffffff
				       | anLocalInt_683_ - (anLocalInt_683_
							    >>> 8));
			    } while (--argument_650_ > 0);
			}
			argument_650_ = argument_652_ - argument_651_ & 0x3;
			if (argument_650_ > 0) {
			    argument_649_ = ((int) argument_655_ & 0xff0000
					     | (int) argument_657_ & 0xff00
					     | (int) argument_659_ & 0xff);
			    do {
				int[] anLocalInts = argument_646_;
				int anLocalInt = argument_648_++;
				int anLocalInt_686_ = argument_649_;
				int anLocalInt_687_ = anLocalInts[anLocalInt];
				int anLocalInt_688_
				    = anLocalInt_686_ + anLocalInt_687_;
				int anLocalInt_689_
				    = ((anLocalInt_686_ & 0xff00ff)
				       + (anLocalInt_687_ & 0xff00ff));
				anLocalInt_687_
				    = ((anLocalInt_689_ & 0x1000100)
				       + (anLocalInt_688_ - anLocalInt_689_
					  & 0x10000));
				anLocalInts[anLocalInt]
				    = (anLocalInt_688_ - anLocalInt_687_
				       | ~0xffffff
				       | anLocalInt_687_ - (anLocalInt_687_
							    >>> 8));
			    } while (--argument_650_ > 0);
			}
		    }
		} else {
		    argument_650_ = argument_652_ - argument_651_;
		    if (((Class89) this).anInt646 == 0) {
			do {
			    argument_646_[argument_648_++]
				= ((int) argument_655_ & 0xff0000
				   | (int) argument_657_ & 0xff00
				   | (int) argument_659_ & 0xff | ~0xffffff);
			    argument_655_ += argument_656_;
			    argument_657_ += argument_658_;
			    argument_659_ += argument_660_;
			} while (--argument_650_ > 0);
		    } else if (!((Class89) this).aBoolean659) {
			int anLocalInt = ((Class89) this).anInt646;
			int anLocalInt_690_ = 256 - ((Class89) this).anInt646;
			do {
			    argument_649_
				= ((int) argument_655_ & 0xff0000
				   | (int) argument_657_ & 0xff00
				   | (int) argument_659_ & 0xff | ~0xffffff);
			    argument_655_ += argument_656_;
			    argument_657_ += argument_658_;
			    argument_659_ += argument_660_;
			    argument_649_ = ((((argument_649_ & 0xff00ff)
					       * anLocalInt_690_) >> 8
					      & 0xff00ff)
					     + (((argument_649_ & 0xff00)
						 * anLocalInt_690_) >> 8
						& 0xff00));
			    int anLocalInt_691_ = argument_646_[argument_648_];
			    argument_646_[argument_648_++]
				= (argument_649_
				   + (((anLocalInt_691_ & 0xff00ff)
				       * anLocalInt) >> 8
				      & 0xff00ff)
				   + (((anLocalInt_691_ & 0xff00) * anLocalInt
				       >> 8)
				      & 0xff00));
			} while (--argument_650_ > 0);
		    } else {
			do {
			    int[] anLocalInts = argument_646_;
			    int anLocalInt = argument_648_++;
			    int anLocalInt_692_
				= ((int) argument_655_ & 0xff0000
				   | (int) argument_657_ & 0xff00
				   | (int) argument_659_ & 0xff);
			    int anLocalInt_693_ = anLocalInts[anLocalInt];
			    int anLocalInt_694_
				= anLocalInt_692_ + anLocalInt_693_;
			    int anLocalInt_695_
				= ((anLocalInt_692_ & 0xff00ff)
				   + (anLocalInt_693_ & 0xff00ff));
			    anLocalInt_693_
				= ((anLocalInt_695_ & 0x1000100)
				   + (anLocalInt_694_ - anLocalInt_695_
				      & 0x10000));
			    anLocalInts[anLocalInt]
				= (anLocalInt_694_ - anLocalInt_693_
				   | ~0xffffff
				   | anLocalInt_693_ - (anLocalInt_693_
							>>> 8));
			    argument_655_ += argument_656_;
			    argument_657_ += argument_658_;
			    argument_659_ += argument_660_;
			} while (--argument_650_ > 0);
		    }
		}
	    } else {
		argument_648_ += argument_651_ - 1;
		argument_653_ += argument_654_ * (float) argument_651_;
		argument_655_ += argument_656_ * (float) argument_651_;
		argument_657_ += argument_658_ * (float) argument_651_;
		argument_659_ += argument_660_ * (float) argument_651_;
		if (((Class293) aClass293_660).aBoolean2415) {
		    if (((Class89) this).aBoolean647) {
			argument_650_ = argument_652_ - argument_651_ >> 2;
			argument_656_ *= 4.0F;
			argument_658_ *= 4.0F;
			argument_660_ *= 4.0F;
			if (((Class89) this).anInt646 == 0) {
			    if (argument_650_ > 0) {
				do {
				    argument_649_
					= ((int) argument_655_ & 0xff0000
					   | (int) argument_657_ & 0xff00
					   | (int) argument_659_ & 0xff
					   | ~0xffffff);
				    argument_655_ += argument_656_;
				    argument_657_ += argument_658_;
				    argument_659_ += argument_660_;
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					argument_646_[argument_648_]
					    = argument_649_;
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					argument_646_[argument_648_]
					    = argument_649_;
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					argument_646_[argument_648_]
					    = argument_649_;
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					argument_646_[argument_648_]
					    = argument_649_;
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				} while (--argument_650_ > 0);
			    }
			    argument_650_
				= argument_652_ - argument_651_ & 0x3;
			    if (argument_650_ > 0) {
				argument_649_ = ((int) argument_655_ & 0xff0000
						 | (int) argument_657_ & 0xff00
						 | (int) argument_659_ & 0xff
						 | ~0xffffff);
				do {
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					argument_646_[argument_648_]
					    = argument_649_;
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				} while (--argument_650_ > 0);
			    }
			} else if (!((Class89) this).aBoolean659) {
			    int anLocalInt = ((Class89) this).anInt646;
			    int anLocalInt_696_
				= 256 - ((Class89) this).anInt646;
			    if (argument_650_ > 0) {
				do {
				    argument_649_
					= ((int) argument_655_ & 0xff0000
					   | (int) argument_657_ & 0xff00
					   | (int) argument_659_ & 0xff
					   | ~0xffffff);
				    argument_655_ += argument_656_;
				    argument_657_ += argument_658_;
				    argument_659_ += argument_660_;
				    argument_649_
					= ((((argument_649_ & 0xff00ff)
					     * anLocalInt_696_) >> 8
					    & 0xff00ff)
					   + (((argument_649_ & 0xff00)
					       * anLocalInt_696_) >> 8
					      & 0xff00));
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					int anLocalInt_697_
					    = argument_646_[argument_648_];
					argument_646_[argument_648_]
					    = (argument_649_
					       + (((anLocalInt_697_ & 0xff00ff)
						   * anLocalInt) >> 8
						  & 0xff00ff)
					       + (((anLocalInt_697_ & 0xff00)
						   * anLocalInt) >> 8
						  & 0xff00));
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					int anLocalInt_698_
					    = argument_646_[argument_648_];
					argument_646_[argument_648_]
					    = (argument_649_
					       + (((anLocalInt_698_ & 0xff00ff)
						   * anLocalInt) >> 8
						  & 0xff00ff)
					       + (((anLocalInt_698_ & 0xff00)
						   * anLocalInt) >> 8
						  & 0xff00));
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					int anLocalInt_699_
					    = argument_646_[argument_648_];
					argument_646_[argument_648_]
					    = (argument_649_
					       + (((anLocalInt_699_ & 0xff00ff)
						   * anLocalInt) >> 8
						  & 0xff00ff)
					       + (((anLocalInt_699_ & 0xff00)
						   * anLocalInt) >> 8
						  & 0xff00));
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					int anLocalInt_700_
					    = argument_646_[argument_648_];
					argument_646_[argument_648_]
					    = (argument_649_
					       + (((anLocalInt_700_ & 0xff00ff)
						   * anLocalInt) >> 8
						  & 0xff00ff)
					       + (((anLocalInt_700_ & 0xff00)
						   * anLocalInt) >> 8
						  & 0xff00));
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				} while (--argument_650_ > 0);
			    }
			    argument_650_
				= argument_652_ - argument_651_ & 0x3;
			    if (argument_650_ > 0) {
				argument_649_ = ((int) argument_655_ & 0xff0000
						 | (int) argument_657_ & 0xff00
						 | (int) argument_659_ & 0xff
						 | ~0xffffff);
				argument_649_ = ((((argument_649_ & 0xff00ff)
						   * anLocalInt_696_) >> 8
						  & 0xff00ff)
						 + (((argument_649_ & 0xff00)
						     * anLocalInt_696_) >> 8
						    & 0xff00));
				do {
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					int anLocalInt_701_
					    = argument_646_[argument_648_];
					argument_646_[argument_648_]
					    = (argument_649_
					       + (((anLocalInt_701_ & 0xff00ff)
						   * anLocalInt) >> 8
						  & 0xff00ff)
					       + (((anLocalInt_701_ & 0xff00)
						   * anLocalInt) >> 8
						  & 0xff00));
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				} while (--argument_650_ > 0);
			    }
			} else {
			    if (argument_650_ > 0) {
				do {
				    argument_649_
					= ((int) argument_655_ & 0xff0000
					   | (int) argument_657_ & 0xff00
					   | (int) argument_659_ & 0xff);
				    argument_655_ += argument_656_;
				    argument_657_ += argument_658_;
				    argument_659_ += argument_660_;
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					int[] anLocalInts = argument_646_;
					int anLocalInt = argument_648_;
					int anLocalInt_702_ = argument_649_;
					int anLocalInt_703_
					    = anLocalInts[anLocalInt];
					int anLocalInt_704_
					    = (anLocalInt_702_
					       + anLocalInt_703_);
					int anLocalInt_705_
					    = ((anLocalInt_702_ & 0xff00ff)
					       + (anLocalInt_703_ & 0xff00ff));
					anLocalInt_703_
					    = ((anLocalInt_705_ & 0x1000100)
					       + ((anLocalInt_704_
						   - anLocalInt_705_)
						  & 0x10000));
					anLocalInts[anLocalInt]
					    = ((anLocalInt_704_
						- anLocalInt_703_)
					       | ~0xffffff
					       | (anLocalInt_703_
						  - (anLocalInt_703_ >>> 8)));
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					int[] anLocalInts = argument_646_;
					int anLocalInt = argument_648_;
					int anLocalInt_706_ = argument_649_;
					int anLocalInt_707_
					    = anLocalInts[anLocalInt];
					int anLocalInt_708_
					    = (anLocalInt_706_
					       + anLocalInt_707_);
					int anLocalInt_709_
					    = ((anLocalInt_706_ & 0xff00ff)
					       + (anLocalInt_707_ & 0xff00ff));
					anLocalInt_707_
					    = ((anLocalInt_709_ & 0x1000100)
					       + ((anLocalInt_708_
						   - anLocalInt_709_)
						  & 0x10000));
					anLocalInts[anLocalInt]
					    = ((anLocalInt_708_
						- anLocalInt_707_)
					       | ~0xffffff
					       | (anLocalInt_707_
						  - (anLocalInt_707_ >>> 8)));
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					int[] anLocalInts = argument_646_;
					int anLocalInt = argument_648_;
					int anLocalInt_710_ = argument_649_;
					int anLocalInt_711_
					    = anLocalInts[anLocalInt];
					int anLocalInt_712_
					    = (anLocalInt_710_
					       + anLocalInt_711_);
					int anLocalInt_713_
					    = ((anLocalInt_710_ & 0xff00ff)
					       + (anLocalInt_711_ & 0xff00ff));
					anLocalInt_711_
					    = ((anLocalInt_713_ & 0x1000100)
					       + ((anLocalInt_712_
						   - anLocalInt_713_)
						  & 0x10000));
					anLocalInts[anLocalInt]
					    = ((anLocalInt_712_
						- anLocalInt_711_)
					       | ~0xffffff
					       | (anLocalInt_711_
						  - (anLocalInt_711_ >>> 8)));
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					int[] anLocalInts = argument_646_;
					int anLocalInt = argument_648_;
					int anLocalInt_714_ = argument_649_;
					int anLocalInt_715_
					    = anLocalInts[anLocalInt];
					int anLocalInt_716_
					    = (anLocalInt_714_
					       + anLocalInt_715_);
					int anLocalInt_717_
					    = ((anLocalInt_714_ & 0xff00ff)
					       + (anLocalInt_715_ & 0xff00ff));
					anLocalInt_715_
					    = ((anLocalInt_717_ & 0x1000100)
					       + ((anLocalInt_716_
						   - anLocalInt_717_)
						  & 0x10000));
					anLocalInts[anLocalInt]
					    = ((anLocalInt_716_
						- anLocalInt_715_)
					       | ~0xffffff
					       | (anLocalInt_715_
						  - (anLocalInt_715_ >>> 8)));
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				} while (--argument_650_ > 0);
			    }
			    argument_650_
				= argument_652_ - argument_651_ & 0x3;
			    if (argument_650_ > 0) {
				argument_649_ = ((int) argument_655_ & 0xff0000
						 | (int) argument_657_ & 0xff00
						 | (int) argument_659_ & 0xff);
				do {
				    if (argument_653_
					< argument_647_[++argument_648_]) {
					int[] anLocalInts = argument_646_;
					int anLocalInt = argument_648_;
					int anLocalInt_718_ = argument_649_;
					int anLocalInt_719_
					    = anLocalInts[anLocalInt];
					int anLocalInt_720_
					    = (anLocalInt_718_
					       + anLocalInt_719_);
					int anLocalInt_721_
					    = ((anLocalInt_718_ & 0xff00ff)
					       + (anLocalInt_719_ & 0xff00ff));
					anLocalInt_719_
					    = ((anLocalInt_721_ & 0x1000100)
					       + ((anLocalInt_720_
						   - anLocalInt_721_)
						  & 0x10000));
					anLocalInts[anLocalInt]
					    = ((anLocalInt_720_
						- anLocalInt_719_)
					       | ~0xffffff
					       | (anLocalInt_719_
						  - (anLocalInt_719_ >>> 8)));
					argument_647_[argument_648_]
					    = argument_653_;
				    }
				    argument_653_ += argument_654_;
				} while (--argument_650_ > 0);
			    }
			}
		    } else {
			argument_650_ = argument_652_ - argument_651_;
			if (((Class89) this).anInt646 == 0) {
			    do {
				if (argument_653_
				    < argument_647_[++argument_648_]) {
				    argument_646_[argument_648_]
					= ((int) argument_655_ & 0xff0000
					   | (int) argument_657_ & 0xff00
					   | (int) argument_659_ & 0xff
					   | ~0xffffff);
				    argument_647_[argument_648_]
					= argument_653_;
				}
				argument_653_ += argument_654_;
				argument_655_ += argument_656_;
				argument_657_ += argument_658_;
				argument_659_ += argument_660_;
			    } while (--argument_650_ > 0);
			} else if (!((Class89) this).aBoolean659) {
			    int anLocalInt = ((Class89) this).anInt646;
			    int anLocalInt_722_
				= 256 - ((Class89) this).anInt646;
			    do {
				if (argument_653_
				    < argument_647_[++argument_648_]) {
				    argument_649_
					= ((int) argument_655_ & 0xff0000
					   | (int) argument_657_ & 0xff00
					   | (int) argument_659_ & 0xff
					   | ~0xffffff);
				    argument_649_
					= ((((argument_649_ & 0xff00ff)
					     * anLocalInt_722_) >> 8
					    & 0xff00ff)
					   + (((argument_649_ & 0xff00)
					       * anLocalInt_722_) >> 8
					      & 0xff00));
				    int anLocalInt_723_
					= argument_646_[argument_648_];
				    argument_646_[argument_648_]
					= (argument_649_
					   + (((anLocalInt_723_ & 0xff00ff)
					       * anLocalInt) >> 8
					      & 0xff00ff)
					   + (((anLocalInt_723_ & 0xff00)
					       * anLocalInt) >> 8
					      & 0xff00));
				    argument_647_[argument_648_]
					= argument_653_;
				}
				argument_653_ += argument_654_;
				argument_655_ += argument_656_;
				argument_657_ += argument_658_;
				argument_659_ += argument_660_;
			    } while (--argument_650_ > 0);
			} else {
			    do {
				if (argument_653_
				    < argument_647_[++argument_648_]) {
				    int[] anLocalInts = argument_646_;
				    int anLocalInt = argument_648_;
				    int anLocalInt_724_
					= ((int) argument_655_ & 0xff0000
					   | (int) argument_657_ & 0xff00
					   | (int) argument_659_ & 0xff);
				    int anLocalInt_725_
					= anLocalInts[anLocalInt];
				    int anLocalInt_726_
					= anLocalInt_724_ + anLocalInt_725_;
				    int anLocalInt_727_
					= ((anLocalInt_724_ & 0xff00ff)
					   + (anLocalInt_725_ & 0xff00ff));
				    anLocalInt_725_
					= ((anLocalInt_727_ & 0x1000100)
					   + (anLocalInt_726_ - anLocalInt_727_
					      & 0x10000));
				    anLocalInts[anLocalInt]
					= (anLocalInt_726_ - anLocalInt_725_
					   | ~0xffffff
					   | anLocalInt_725_ - (anLocalInt_725_
								>>> 8));
				    argument_647_[argument_648_]
					= argument_653_;
				}
				argument_653_ += argument_654_;
				argument_655_ += argument_656_;
				argument_657_ += argument_658_;
				argument_659_ += argument_660_;
			    } while (--argument_650_ > 0);
			}
		    }
		} else if (((Class89) this).aBoolean647) {
		    argument_650_ = argument_652_ - argument_651_ >> 2;
		    argument_656_ *= 4.0F;
		    argument_658_ *= 4.0F;
		    argument_660_ *= 4.0F;
		    if (((Class89) this).anInt646 == 0) {
			if (argument_650_ > 0) {
			    do {
				argument_649_ = ((int) argument_655_ & 0xff0000
						 | (int) argument_657_ & 0xff00
						 | (int) argument_659_ & 0xff
						 | ~0xffffff);
				argument_655_ += argument_656_;
				argument_657_ += argument_658_;
				argument_659_ += argument_660_;
				if (argument_653_
				    < argument_647_[++argument_648_])
				    argument_646_[argument_648_]
					= argument_649_;
				argument_653_ += argument_654_;
				if (argument_653_
				    < argument_647_[++argument_648_])
				    argument_646_[argument_648_]
					= argument_649_;
				argument_653_ += argument_654_;
				if (argument_653_
				    < argument_647_[++argument_648_])
				    argument_646_[argument_648_]
					= argument_649_;
				argument_653_ += argument_654_;
				if (argument_653_
				    < argument_647_[++argument_648_])
				    argument_646_[argument_648_]
					= argument_649_;
				argument_653_ += argument_654_;
			    } while (--argument_650_ > 0);
			}
			argument_650_ = argument_652_ - argument_651_ & 0x3;
			if (argument_650_ > 0) {
			    argument_649_
				= ((int) argument_655_ & 0xff0000
				   | (int) argument_657_ & 0xff00
				   | (int) argument_659_ & 0xff | ~0xffffff);
			    do {
				if (argument_653_
				    < argument_647_[++argument_648_])
				    argument_646_[argument_648_]
					= argument_649_;
				argument_653_ += argument_654_;
			    } while (--argument_650_ > 0);
			}
		    } else if (!((Class89) this).aBoolean659) {
			int anLocalInt = ((Class89) this).anInt646;
			int anLocalInt_728_ = 256 - ((Class89) this).anInt646;
			if (argument_650_ > 0) {
			    do {
				argument_649_ = ((int) argument_655_ & 0xff0000
						 | (int) argument_657_ & 0xff00
						 | (int) argument_659_ & 0xff
						 | ~0xffffff);
				argument_655_ += argument_656_;
				argument_657_ += argument_658_;
				argument_659_ += argument_660_;
				argument_649_ = ((((argument_649_ & 0xff00ff)
						   * anLocalInt_728_) >> 8
						  & 0xff00ff)
						 + (((argument_649_ & 0xff00)
						     * anLocalInt_728_) >> 8
						    & 0xff00));
				if (argument_653_
				    < argument_647_[++argument_648_]) {
				    int anLocalInt_729_
					= argument_646_[argument_648_];
				    argument_646_[argument_648_]
					= (argument_649_
					   + (((anLocalInt_729_ & 0xff00ff)
					       * anLocalInt) >> 8
					      & 0xff00ff)
					   + (((anLocalInt_729_ & 0xff00)
					       * anLocalInt) >> 8
					      & 0xff00));
				}
				argument_653_ += argument_654_;
				if (argument_653_
				    < argument_647_[++argument_648_]) {
				    int anLocalInt_730_
					= argument_646_[argument_648_];
				    argument_646_[argument_648_]
					= (argument_649_
					   + (((anLocalInt_730_ & 0xff00ff)
					       * anLocalInt) >> 8
					      & 0xff00ff)
					   + (((anLocalInt_730_ & 0xff00)
					       * anLocalInt) >> 8
					      & 0xff00));
				}
				argument_653_ += argument_654_;
				if (argument_653_
				    < argument_647_[++argument_648_]) {
				    int anLocalInt_731_
					= argument_646_[argument_648_];
				    argument_646_[argument_648_]
					= (argument_649_
					   + (((anLocalInt_731_ & 0xff00ff)
					       * anLocalInt) >> 8
					      & 0xff00ff)
					   + (((anLocalInt_731_ & 0xff00)
					       * anLocalInt) >> 8
					      & 0xff00));
				}
				argument_653_ += argument_654_;
				if (argument_653_
				    < argument_647_[++argument_648_]) {
				    int anLocalInt_732_
					= argument_646_[argument_648_];
				    argument_646_[argument_648_]
					= (argument_649_
					   + (((anLocalInt_732_ & 0xff00ff)
					       * anLocalInt) >> 8
					      & 0xff00ff)
					   + (((anLocalInt_732_ & 0xff00)
					       * anLocalInt) >> 8
					      & 0xff00));
				}
				argument_653_ += argument_654_;
			    } while (--argument_650_ > 0);
			}
			argument_650_ = argument_652_ - argument_651_ & 0x3;
			if (argument_650_ > 0) {
			    argument_649_
				= ((int) argument_655_ & 0xff0000
				   | (int) argument_657_ & 0xff00
				   | (int) argument_659_ & 0xff | ~0xffffff);
			    argument_649_ = ((((argument_649_ & 0xff00ff)
					       * anLocalInt_728_) >> 8
					      & 0xff00ff)
					     + (((argument_649_ & 0xff00)
						 * anLocalInt_728_) >> 8
						& 0xff00));
			    do {
				if (argument_653_
				    < argument_647_[++argument_648_]) {
				    int anLocalInt_733_
					= argument_646_[argument_648_];
				    argument_646_[argument_648_]
					= (argument_649_
					   + (((anLocalInt_733_ & 0xff00ff)
					       * anLocalInt) >> 8
					      & 0xff00ff)
					   + (((anLocalInt_733_ & 0xff00)
					       * anLocalInt) >> 8
					      & 0xff00));
				}
				argument_653_ += argument_654_;
			    } while (--argument_650_ > 0);
			}
		    } else {
			if (argument_650_ > 0) {
			    do {
				argument_649_ = ((int) argument_655_ & 0xff0000
						 | (int) argument_657_ & 0xff00
						 | (int) argument_659_ & 0xff);
				argument_655_ += argument_656_;
				argument_657_ += argument_658_;
				argument_659_ += argument_660_;
				if (argument_653_
				    < argument_647_[++argument_648_]) {
				    int[] anLocalInts = argument_646_;
				    int anLocalInt = argument_648_;
				    int anLocalInt_734_ = argument_649_;
				    int anLocalInt_735_
					= anLocalInts[anLocalInt];
				    int anLocalInt_736_
					= anLocalInt_734_ + anLocalInt_735_;
				    int anLocalInt_737_
					= ((anLocalInt_734_ & 0xff00ff)
					   + (anLocalInt_735_ & 0xff00ff));
				    anLocalInt_735_
					= ((anLocalInt_737_ & 0x1000100)
					   + (anLocalInt_736_ - anLocalInt_737_
					      & 0x10000));
				    anLocalInts[anLocalInt]
					= (anLocalInt_736_ - anLocalInt_735_
					   | ~0xffffff
					   | anLocalInt_735_ - (anLocalInt_735_
								>>> 8));
				}
				argument_653_ += argument_654_;
				if (argument_653_
				    < argument_647_[++argument_648_]) {
				    int[] anLocalInts = argument_646_;
				    int anLocalInt = argument_648_;
				    int anLocalInt_738_ = argument_649_;
				    int anLocalInt_739_
					= anLocalInts[anLocalInt];
				    int anLocalInt_740_
					= anLocalInt_738_ + anLocalInt_739_;
				    int anLocalInt_741_
					= ((anLocalInt_738_ & 0xff00ff)
					   + (anLocalInt_739_ & 0xff00ff));
				    anLocalInt_739_
					= ((anLocalInt_741_ & 0x1000100)
					   + (anLocalInt_740_ - anLocalInt_741_
					      & 0x10000));
				    anLocalInts[anLocalInt]
					= (anLocalInt_740_ - anLocalInt_739_
					   | ~0xffffff
					   | anLocalInt_739_ - (anLocalInt_739_
								>>> 8));
				}
				argument_653_ += argument_654_;
				if (argument_653_
				    < argument_647_[++argument_648_]) {
				    int[] anLocalInts = argument_646_;
				    int anLocalInt = argument_648_;
				    int anLocalInt_742_ = argument_649_;
				    int anLocalInt_743_
					= anLocalInts[anLocalInt];
				    int anLocalInt_744_
					= anLocalInt_742_ + anLocalInt_743_;
				    int anLocalInt_745_
					= ((anLocalInt_742_ & 0xff00ff)
					   + (anLocalInt_743_ & 0xff00ff));
				    anLocalInt_743_
					= ((anLocalInt_745_ & 0x1000100)
					   + (anLocalInt_744_ - anLocalInt_745_
					      & 0x10000));
				    anLocalInts[anLocalInt]
					= (anLocalInt_744_ - anLocalInt_743_
					   | ~0xffffff
					   | anLocalInt_743_ - (anLocalInt_743_
								>>> 8));
				}
				argument_653_ += argument_654_;
				if (argument_653_
				    < argument_647_[++argument_648_]) {
				    int[] anLocalInts = argument_646_;
				    int anLocalInt = argument_648_;
				    int anLocalInt_746_ = argument_649_;
				    int anLocalInt_747_
					= anLocalInts[anLocalInt];
				    int anLocalInt_748_
					= anLocalInt_746_ + anLocalInt_747_;
				    int anLocalInt_749_
					= ((anLocalInt_746_ & 0xff00ff)
					   + (anLocalInt_747_ & 0xff00ff));
				    anLocalInt_747_
					= ((anLocalInt_749_ & 0x1000100)
					   + (anLocalInt_748_ - anLocalInt_749_
					      & 0x10000));
				    anLocalInts[anLocalInt]
					= (anLocalInt_748_ - anLocalInt_747_
					   | ~0xffffff
					   | anLocalInt_747_ - (anLocalInt_747_
								>>> 8));
				}
				argument_653_ += argument_654_;
			    } while (--argument_650_ > 0);
			}
			argument_650_ = argument_652_ - argument_651_ & 0x3;
			if (argument_650_ > 0) {
			    argument_649_ = ((int) argument_655_ & 0xff0000
					     | (int) argument_657_ & 0xff00
					     | (int) argument_659_ & 0xff);
			    do {
				if (argument_653_
				    < argument_647_[++argument_648_]) {
				    int[] anLocalInts = argument_646_;
				    int anLocalInt = argument_648_;
				    int anLocalInt_750_ = argument_649_;
				    int anLocalInt_751_
					= anLocalInts[anLocalInt];
				    int anLocalInt_752_
					= anLocalInt_750_ + anLocalInt_751_;
				    int anLocalInt_753_
					= ((anLocalInt_750_ & 0xff00ff)
					   + (anLocalInt_751_ & 0xff00ff));
				    anLocalInt_751_
					= ((anLocalInt_753_ & 0x1000100)
					   + (anLocalInt_752_ - anLocalInt_753_
					      & 0x10000));
				    anLocalInts[anLocalInt]
					= (anLocalInt_752_ - anLocalInt_751_
					   | ~0xffffff
					   | anLocalInt_751_ - (anLocalInt_751_
								>>> 8));
				}
				argument_653_ += argument_654_;
			    } while (--argument_650_ > 0);
			}
		    }
		} else {
		    argument_650_ = argument_652_ - argument_651_;
		    if (((Class89) this).anInt646 == 0) {
			do {
			    if (argument_653_ < argument_647_[++argument_648_])
				argument_646_[argument_648_]
				    = ((int) argument_655_ & 0xff0000
				       | (int) argument_657_ & 0xff00
				       | (int) argument_659_ & 0xff
				       | ~0xffffff);
			    argument_653_ += argument_654_;
			    argument_655_ += argument_656_;
			    argument_657_ += argument_658_;
			    argument_659_ += argument_660_;
			} while (--argument_650_ > 0);
		    } else if (!((Class89) this).aBoolean659) {
			int anLocalInt = ((Class89) this).anInt646;
			int anLocalInt_754_ = 256 - ((Class89) this).anInt646;
			do {
			    if (argument_653_
				< argument_647_[++argument_648_]) {
				argument_649_ = ((int) argument_655_ & 0xff0000
						 | (int) argument_657_ & 0xff00
						 | (int) argument_659_ & 0xff
						 | ~0xffffff);
				argument_649_ = ((((argument_649_ & 0xff00ff)
						   * anLocalInt_754_) >> 8
						  & 0xff00ff)
						 + (((argument_649_ & 0xff00)
						     * anLocalInt_754_) >> 8
						    & 0xff00));
				int anLocalInt_755_
				    = argument_646_[argument_648_];
				argument_646_[argument_648_]
				    = (argument_649_
				       + (((anLocalInt_755_ & 0xff00ff)
					   * anLocalInt) >> 8
					  & 0xff00ff)
				       + (((anLocalInt_755_ & 0xff00)
					   * anLocalInt) >> 8
					  & 0xff00));
			    }
			    argument_653_ += argument_654_;
			    argument_655_ += argument_656_;
			    argument_657_ += argument_658_;
			    argument_659_ += argument_660_;
			} while (--argument_650_ > 0);
		    } else {
			do {
			    if (argument_653_
				< argument_647_[++argument_648_]) {
				int[] anLocalInts = argument_646_;
				int anLocalInt = argument_648_;
				int anLocalInt_756_
				    = ((int) argument_655_ & 0xff0000
				       | (int) argument_657_ & 0xff00
				       | (int) argument_659_ & 0xff);
				int anLocalInt_757_ = anLocalInts[anLocalInt];
				int anLocalInt_758_
				    = anLocalInt_756_ + anLocalInt_757_;
				int anLocalInt_759_
				    = ((anLocalInt_756_ & 0xff00ff)
				       + (anLocalInt_757_ & 0xff00ff));
				anLocalInt_757_
				    = ((anLocalInt_759_ & 0x1000100)
				       + (anLocalInt_758_ - anLocalInt_759_
					  & 0x10000));
				anLocalInts[anLocalInt]
				    = (anLocalInt_758_ - anLocalInt_757_
				       | ~0xffffff
				       | anLocalInt_757_ - (anLocalInt_757_
							    >>> 8));
			    }
			    argument_653_ += argument_654_;
			    argument_655_ += argument_656_;
			    argument_657_ += argument_658_;
			    argument_659_ += argument_660_;
			} while (--argument_650_ > 0);
		    }
		}
	    }
	}
    }
    
    private final void method1672
	(int[] argument_760_, int[] argument_761_, int argument_762_,
	 int argument_763_, int argument_764_, float argument_765_,
	 float argument_766_, float argument_767_, float argument_768_,
	 float argument_769_, float argument_770_, float argument_771_,
	 float argument_772_, float argument_773_, float argument_774_,
	 float argument_775_, float argument_776_, float argument_777_,
	 float argument_778_, float argument_779_, float argument_780_,
	 float argument_781_, float argument_782_, float argument_783_,
	 float argument_784_) {
	int anLocalInt = argument_764_ - argument_763_;
	float f = 1.0F / (float) anLocalInt;
	float f_785_ = (argument_766_ - argument_765_) * f;
	float f_786_ = (argument_768_ - argument_767_) * f;
	float f_787_ = (argument_770_ - argument_769_) * f;
	float f_788_ = (argument_772_ - argument_771_) * f;
	float f_789_ = (argument_776_ - argument_775_) * f;
	float f_790_ = (argument_778_ - argument_777_) * f;
	float f_791_ = (argument_780_ - argument_779_) * f;
	float f_792_ = (argument_782_ - argument_781_) * f;
	float f_793_ = (argument_784_ - argument_783_) * f;
	if (((Class89) this).aBoolean661) {
	    if (argument_764_ > ((Class89) this).anInt650)
		argument_764_ = ((Class89) this).anInt650;
	    if (argument_763_ < 0) {
		argument_765_ -= f_785_ * (float) argument_763_;
		argument_767_ -= f_786_ * (float) argument_763_;
		argument_769_ -= f_787_ * (float) argument_763_;
		argument_771_ -= f_788_ * (float) argument_763_;
		argument_775_ -= f_789_ * (float) argument_763_;
		argument_777_ -= f_790_ * (float) argument_763_;
		argument_779_ -= f_791_ * (float) argument_763_;
		argument_781_ -= f_792_ * (float) argument_763_;
		argument_783_ -= f_793_ * (float) argument_763_;
		argument_763_ = 0;
	    }
	}
	if (argument_763_ < argument_764_) {
	    anLocalInt = argument_764_ - argument_763_;
	    argument_762_ += argument_763_;
	    while (anLocalInt-- > 0) {
		float f_794_ = 1.0F / argument_765_;
		if (f_794_ < aFloatArray656[argument_762_]) {
		    float f_795_ = argument_767_ * f_794_;
		    float f_796_ = argument_769_ * f_794_;
		    int anLocalInt_797_
			= ((int) (f_795_ * (float) anInt663 * aFloat679)
			   & anInt666);
		    int anLocalInt_798_
			= ((int) (f_796_ * (float) anInt663 * aFloat679)
			   & anInt666);
		    int anLocalInt_799_
			= (anIntArray676
			   [anLocalInt_798_ * anInt663 + anLocalInt_797_]);
		    anLocalInt_797_ = (int) (f_795_ * (float) anInt671
					     * aFloat667) & anInt673;
		    anLocalInt_798_ = (int) (f_796_ * (float) anInt671
					     * aFloat667) & anInt673;
		    int anLocalInt_800_
			= (anIntArray669
			   [anLocalInt_798_ * anInt671 + anLocalInt_797_]);
		    anLocalInt_797_ = (int) (f_795_ * (float) anInt678
					     * aFloat677) & anInt670;
		    anLocalInt_798_ = (int) (f_796_ * (float) anInt678
					     * aFloat677) & anInt670;
		    int anLocalInt_801_
			= (anIntArray664
			   [anLocalInt_798_ * anInt678 + anLocalInt_797_]);
		    float f_802_ = 1.0F - (argument_781_ + argument_783_);
		    anLocalInt_799_
			= (((int) (argument_781_
				   * (float) (anLocalInt_799_ >> 16 & 0xff))
			    << 16)
			   | ~0xffffff
			   | ((int) (argument_781_
				     * (float) (anLocalInt_799_ >> 8 & 0xff))
			      << 8)
			   | (int) (argument_781_
				    * (float) (anLocalInt_799_ & 0xff)));
		    anLocalInt_800_
			= (((int) (argument_783_
				   * (float) (anLocalInt_800_ >> 16 & 0xff))
			    << 16)
			   | ~0xffffff
			   | ((int) (argument_783_
				     * (float) (anLocalInt_800_ >> 8 & 0xff))
			      << 8)
			   | (int) (argument_783_
				    * (float) (anLocalInt_800_ & 0xff)));
		    anLocalInt_801_
			= ((int) (f_802_ * (float) (anLocalInt_801_ >> 16
						    & 0xff)) << 16
			   | ~0xffffff
			   | (int) (f_802_ * (float) (anLocalInt_801_ >> 8
						      & 0xff)) << 8
			   | (int) (f_802_
				    * (float) (anLocalInt_801_ & 0xff)));
		    int anLocalInt_803_
			= anLocalInt_799_ + anLocalInt_800_ + anLocalInt_801_;
		    int anLocalInt_804_
			= (((int) (argument_775_
				   * (float) (anLocalInt_803_ >> 16 & 0xff))
			    << 8) & 0xff0000
			   | ~0xffffff
			   | ((int) (argument_777_
				     * (float) (anLocalInt_803_ >> 8 & 0xff))
			      & 0xff00)
			   | (int) (argument_779_
				    * (float) (anLocalInt_803_ & 0xff)) >> 8);
		    if (argument_771_ != 0.0F) {
			int anLocalInt_805_ = (int) (255.0F - argument_771_);
			int anLocalInt_806_
			    = ((((anInt668 & 0xff00ff) * (int) argument_771_
				 & ~0xff00ff)
				| ((anInt668 & 0xff00) * (int) argument_771_
				   & 0xff0000))
			       >>> 8);
			anLocalInt_804_
			    = ((((anLocalInt_804_ & 0xff00ff) * anLocalInt_805_
				 & ~0xff00ff)
				| ((anLocalInt_804_ & 0xff00) * anLocalInt_805_
				   & 0xff0000))
			       >>> 8) + anLocalInt_806_;
		    }
		    argument_760_[argument_762_] = anLocalInt_804_;
		    aFloatArray656[argument_762_] = f_794_;
		}
		argument_762_++;
		argument_765_ += f_785_;
		argument_767_ += f_786_;
		argument_769_ += f_787_;
		argument_771_ += f_788_;
		argument_775_ += f_789_;
		argument_777_ += f_790_;
		argument_779_ += f_791_;
		argument_781_ += f_792_;
		argument_783_ += f_793_;
	    }
	}
    }
    
    private final void method1673
	(int[] argument_807_, int[] argument_808_, int argument_809_,
	 int argument_810_, int argument_811_, float argument_812_,
	 float argument_813_, float argument_814_, float argument_815_,
	 float argument_816_, float argument_817_, float argument_818_,
	 float argument_819_, float argument_820_, float argument_821_,
	 float argument_822_, float argument_823_, float argument_824_,
	 float argument_825_, float argument_826_, float argument_827_) {
	int anLocalInt = argument_811_ - argument_810_;
	float f = 1.0F / (float) anLocalInt;
	float f_828_ = (argument_813_ - argument_812_) * f;
	float f_829_ = (argument_815_ - argument_814_) * f;
	float f_830_ = (argument_817_ - argument_816_) * f;
	float f_831_ = (argument_819_ - argument_818_) * f;
	float f_832_ = (argument_821_ - argument_820_) * f;
	float f_833_ = (argument_823_ - argument_822_) * f;
	float f_834_ = (argument_825_ - argument_824_) * f;
	float f_835_ = (argument_827_ - argument_826_) * f;
	if (((Class89) this).aBoolean661) {
	    if (argument_811_ > ((Class89) this).anInt650)
		argument_811_ = ((Class89) this).anInt650;
	    if (argument_810_ < 0) {
		argument_812_ -= f_828_ * (float) argument_810_;
		argument_814_ -= f_829_ * (float) argument_810_;
		argument_816_ -= f_830_ * (float) argument_810_;
		argument_818_ -= f_831_ * (float) argument_810_;
		argument_820_ -= f_832_ * (float) argument_810_;
		argument_822_ -= f_833_ * (float) argument_810_;
		argument_824_ -= f_834_ * (float) argument_810_;
		argument_826_ -= f_835_ * (float) argument_810_;
		argument_810_ = 0;
	    }
	}
	if (argument_810_ < argument_811_) {
	    anLocalInt = argument_811_ - argument_810_;
	    argument_809_ += argument_810_;
	    while (anLocalInt-- > 0) {
		float f_836_ = 1.0F / argument_812_;
		if (f_836_ < aFloatArray656[argument_809_]) {
		    int anLocalInt_837_
			= (int) (argument_814_ * f_836_ * (float) anInt663);
		    if (aBoolean672)
			anLocalInt_837_ &= anInt666;
		    else if (anLocalInt_837_ < 0)
			anLocalInt_837_ = 0;
		    else if (anLocalInt_837_ > anInt666)
			anLocalInt_837_ = anInt666;
		    int anLocalInt_838_
			= (int) (argument_816_ * f_836_ * (float) anInt663);
		    if (aBoolean672)
			anLocalInt_838_ &= anInt666;
		    else if (anLocalInt_838_ < 0)
			anLocalInt_838_ = 0;
		    else if (anLocalInt_838_ > anInt666)
			anLocalInt_838_ = anInt666;
		    int anLocalInt_839_
			= (anIntArray676
			   [anLocalInt_838_ * anInt663 + anLocalInt_837_]);
		    int anLocalInt_840_ = 255;
		    if (anInt675 == 2)
			anLocalInt_840_ = anLocalInt_839_ >> 24 & 0xff;
		    else if (anInt675 == 1)
			anLocalInt_840_ = anLocalInt_839_ == 0 ? 0 : 255;
		    else
			anLocalInt_840_ = (int) argument_820_;
		    if (anLocalInt_840_ != 0) {
			if (anLocalInt_840_ != 255) {
			    int anLocalInt_841_
				= ((int) (argument_822_
					  * (float) (anLocalInt_839_ >> 16
						     & 0xff)) << 8 & 0xff0000
				   | ~0xffffff
				   | (int) (argument_824_
					    * (float) (anLocalInt_839_ >> 8
						       & 0xff)) & 0xff00
				   | (int) (argument_826_
					    * (float) (anLocalInt_839_
						       & 0xff)) >> 8);
			    if (argument_818_ != 0.0F) {
				int anLocalInt_842_
				    = (int) (255.0F - argument_818_);
				int anLocalInt_843_
				    = ((((anInt668 & 0xff00ff)
					 * (int) argument_818_) & ~0xff00ff
					| ((anInt668 & 0xff00)
					   * (int) argument_818_) & 0xff0000)
				       >>> 8);
				anLocalInt_841_
				    = ((((anLocalInt_841_ & 0xff00ff)
					 * anLocalInt_842_) & ~0xff00ff
					| ((anLocalInt_841_ & 0xff00)
					   * anLocalInt_842_) & 0xff0000)
				       >>> 8) + anLocalInt_843_;
			    }
			    int anLocalInt_844_ = argument_807_[argument_809_];
			    int anLocalInt_845_ = 255 - anLocalInt_840_;
			    anLocalInt_841_
				= (((((anLocalInt_844_ & 0xff00ff)
				      * anLocalInt_845_)
				     + ((anLocalInt_841_ & 0xff00ff)
					* anLocalInt_840_))
				    & ~0xff00ff)
				   + ((((anLocalInt_844_ & 0xff00)
					* anLocalInt_845_)
				       + ((anLocalInt_841_ & 0xff00)
					  * anLocalInt_840_))
				      & 0xff0000)) >> 8;
			    argument_807_[argument_809_] = anLocalInt_841_;
			    aFloatArray656[argument_809_] = f_836_;
			} else {
			    int anLocalInt_846_
				= ((int) (argument_822_
					  * (float) (anLocalInt_839_ >> 16
						     & 0xff)) << 8 & 0xff0000
				   | ~0xffffff
				   | (int) (argument_824_
					    * (float) (anLocalInt_839_ >> 8
						       & 0xff)) & 0xff00
				   | (int) (argument_826_
					    * (float) (anLocalInt_839_
						       & 0xff)) >> 8);
			    if (argument_818_ != 0.0F) {
				int anLocalInt_847_
				    = (int) (255.0F - argument_818_);
				int anLocalInt_848_
				    = ((((anInt668 & 0xff00ff)
					 * (int) argument_818_) & ~0xff00ff
					| ((anInt668 & 0xff00)
					   * (int) argument_818_) & 0xff0000)
				       >>> 8);
				anLocalInt_846_
				    = ((((anLocalInt_846_ & 0xff00ff)
					 * anLocalInt_847_) & ~0xff00ff
					| ((anLocalInt_846_ & 0xff00)
					   * anLocalInt_847_) & 0xff0000)
				       >>> 8) + anLocalInt_848_;
			    }
			    argument_807_[argument_809_] = anLocalInt_846_;
			    aFloatArray656[argument_809_] = f_836_;
			}
		    }
		}
		argument_809_++;
		argument_812_ += f_828_;
		argument_814_ += f_829_;
		argument_816_ += f_830_;
		argument_818_ += f_831_;
		argument_820_ += f_832_;
		argument_822_ += f_833_;
		argument_824_ += f_834_;
		argument_826_ += f_835_;
	    }
	}
    }
    
    Class89(JavaToolkit argument_849_, Class293 argument_850_) {
	((Class89) this).aBoolean647 = true;
	((Class89) this).aBoolean659 = false;
	aBoolean649 = false;
	((Class89) this).aBoolean661 = false;
	anInt663 = 0;
	anIntArray664 = null;
	anInt666 = 0;
	anInt665 = -1;
	anInt662 = -1;
	anInt673 = 0;
	anInt670 = 0;
	anInt675 = 0;
	anIntArray669 = null;
	anIntArray676 = null;
	anInt671 = 0;
	aFloat667 = 0.0F;
	aFloat677 = 0.0F;
	anInt674 = -1;
	anInt678 = 0;
	aBoolean672 = true;
	aFloat679 = 0.0F;
	aClass_ha__651 = argument_849_;
	aClass293_660 = argument_850_;
	anInt652 = ((JavaToolkit) aClass_ha__651).width;
	anIntArray657 = ((JavaToolkit) aClass_ha__651).pixels;
	aFloatArray656 = ((JavaToolkit) aClass_ha__651).aFloatArray4667;
    }
}
