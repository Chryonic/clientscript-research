/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class128
{
    static boolean aBoolean1039;
    static int anInt1040 = -1;
    int anInt1041;
    static boolean aBoolean1042 = false;
    static Class272[] aClass272Array1043 = new Class272[6];
    static int anInt1044 = 0;
    
    public static void method2419(int argument) {
	aClass272Array1043 = null;
    }
    
    public final String toString() {
	throw new IllegalStateException();
    }
    
    static final void method2420(int argument, int argument_0_,
				 int argument_1_, RsInterface argument_2_,
				 Class_aa argument_3_, Class368 argument_4_,
				 int argument_5_, int argument_6_) {
	if (argument_4_ != null) {
	    int anLocalInt;
	    if (Statics.anInt1745 == 4)
		anLocalInt = (int) DoublyLinkedNodeP2_Sub6.aFloat4538 & 0x3fff;
	    else
		anLocalInt
		    = ((int) DoublyLinkedNodeP2_Sub6.aFloat4538 + Class2_Sub10.anInt3824
		       & 0x3fff);
	    int anLocalInt_7_
		= (Math.max(((RsInterface) argument_2_).renderWidth / 2,
			    ((RsInterface) argument_2_).renderHeight / 2)
		   + 10);
	    int anLocalInt_8_
		= argument_0_ * argument_0_ + argument * argument;
	    if (anLocalInt_8_ <= anLocalInt_7_ * anLocalInt_7_) {
		int anLocalInt_9_ = Node_Sub6.SINETABLE[anLocalInt];
		int anLocalInt_10_ = Node_Sub6.COSINETABLE[anLocalInt];
		if (Statics.anInt1745 != 4) {
		    anLocalInt_10_
			= anLocalInt_10_ * 256 / (Node_Sub11.anInt3945
						  + 256);
		    anLocalInt_9_
			= anLocalInt_9_ * 256 / (Node_Sub11.anInt3945
						 + 256);
		}
		int anLocalInt_11_
		    = (argument * anLocalInt_10_ + anLocalInt_9_ * argument_0_
		       >> 14);
		int anLocalInt_12_
		    = (anLocalInt_10_ * argument_0_ - anLocalInt_9_ * argument
		       >> 14);
		argument_4_.method4007
		    ((anLocalInt_11_
		      + (((RsInterface) argument_2_).renderWidth / 2 + argument_5_)
		      - argument_4_.getWidth() / 2),
		     (argument_1_
		      + ((RsInterface) argument_2_).renderHeight / argument_6_
		      + (-anLocalInt_12_ - argument_4_.method4018() / 2)),
		     argument_3_, argument_5_, argument_1_);
	    }
	}
    }
    
    static final void method2421(int argument, int argument_13_,
				 int argument_14_, int argument_15_,
				 Entity argument_16_,
				 byte argument_17_, int argument_18_) {
	Class189_Sub1.method2875(((DoublyLinkedNodeP2_Sub2) argument_16_).worldZ,
				 argument_14_,
				 ((DoublyLinkedNodeP2_Sub2) argument_16_).worldX,
				 argument_18_, argument_13_, true, argument,
				 ((DoublyLinkedNodeP2_Sub2) argument_16_).lightingHL, 0,
				 argument_15_);
    }
    
    static final int method2422(int argument, int argument_19_) {
	double d = (double) ((argument & 0xffa98b) >> 16) / 256.0;
	double d_20_ = (double) ((argument & 0xff4c) >> 8) / 256.0;
	double d_21_ = (double) (argument & 0xff) / 256.0;
	double d_22_ = d;
	if (d_20_ < d_22_)
	    d_22_ = d_20_;
	if (d_22_ > d_21_)
	    d_22_ = d_21_;
	double d_23_ = d;
	if (d_23_ < d_20_)
	    d_23_ = d_20_;
	if (d_21_ > d_23_)
	    d_23_ = d_21_;
	double d_24_ = 0.0;
	double d_25_ = 0.0;
	double d_26_ = (d_23_ + d_22_) / 2.0;
	if (d_23_ != d_22_) {
	    if (d_26_ < 0.5)
		d_25_ = (-d_22_ + d_23_) / (d_23_ + d_22_);
	    if (d_26_ >= 0.5)
		d_25_ = (-d_22_ + d_23_) / (-d_22_ + (-d_23_ + 2.0));
	    if (d != d_23_) {
		if (d_23_ != d_20_) {
		    if (d_21_ == d_23_)
			d_24_ = (d - d_20_) / (-d_22_ + d_23_) + 4.0;
		} else
		    d_24_ = (-d + d_21_) / (-d_22_ + d_23_) + 2.0;
	    } else
		d_24_ = (d_20_ - d_21_) / (d_23_ - d_22_);
	}
	d_24_ /= 6.0;
	int anLocalInt = (int) (d_24_ * 256.0);
	int anLocalInt_27_ = (int) (d_25_ * 256.0);
	if (anLocalInt_27_ < 0)
	    anLocalInt_27_ = 0;
	else if (anLocalInt_27_ > 255)
	    anLocalInt_27_ = 255;
	int anLocalInt_28_ = (int) (d_26_ * 256.0);
	if (anLocalInt_28_ >= 0) {
	    if (anLocalInt_28_ > 255)
		anLocalInt_28_ = 255;
	} else
	    anLocalInt_28_ = 0;
	if (anLocalInt_28_ > 243)
	    anLocalInt_27_ >>= 4;
	else if (anLocalInt_28_ <= 217) {
	    if (anLocalInt_28_ <= 192) {
		if (anLocalInt_28_ > 179)
		    anLocalInt_27_ >>= 1;
	    } else
		anLocalInt_27_ >>= 2;
	} else
	    anLocalInt_27_ >>= 3;
	return (((anLocalInt >> 2 & 0x3f) << 10)
		- (-(anLocalInt_27_ >> 5 << 7) - (anLocalInt_28_ >> 1)));
    }
    
    Class128(int argument_29_, int argument_30_) {
	((Class128) this).anInt1041 = argument_30_;
    }
}
