/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

final class Class92 implements Runnable
{
    private int anInt705;
    private int anInt707 = 0;
    private byte[] aByteArray708;
    static int[] anIntArray709;
    private int anInt710;
    private Thread aThread711;
    private IOException anIOException712;
    private OutputStream anOutputStream713;
    
    static final void method1688(byte argument) {
	synchronized (Node_Sub38.aClass149_4190) {
	    Node_Sub38.aClass149_4190.method2540(125);
	}
	synchronized (Class165.aClass149_1210) {
	    Class165.aClass149_1210.method2540(93);
	}
    }
    
    static final void method1689
	(int argument, float[] argument_0_, int argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_, int argument_6_,
	 float[] argument_7_, float argument_8_, int argument_9_,
	 int argument_10_, float argument_11_, float argument_12_) {
	argument_10_ -= argument_2_;
	argument_9_ -= argument_3_;
	argument_4_ -= argument_5_;
	float f = (argument_7_[2] * (float) argument_9_
		   + (argument_7_[0] * (float) argument_4_
		      + argument_7_[1] * (float) argument_10_));
	float f_13_ = (argument_7_[5] * (float) argument_9_
		       + (argument_7_[4] * (float) argument_10_
			  + argument_7_[3] * (float) argument_4_));
	float f_14_ = (argument_7_[7] * (float) argument_10_
		       + (float) argument_4_ * argument_7_[6]
		       + (float) argument_9_ * argument_7_[8]);
	float f_15_;
	float f_16_;
	if (argument != 0) {
	    if (argument != 1) {
		if (argument == 2) {
		    f_16_ = argument_11_ + -f + 0.5F;
		    f_15_ = argument_12_ + -f_13_ + 0.5F;
		} else if (argument == 3) {
		    f_15_ = argument_12_ + -f_13_ + 0.5F;
		    f_16_ = f + argument_11_ + 0.5F;
		} else if (argument == 4) {
		    f_16_ = argument_8_ + f_14_ + 0.5F;
		    f_15_ = -f_13_ + argument_12_ + 0.5F;
		} else {
		    f_16_ = argument_8_ + -f_14_ + 0.5F;
		    f_15_ = argument_12_ + -f_13_ + 0.5F;
		}
	    } else {
		f_16_ = f + argument_11_ + 0.5F;
		f_15_ = argument_8_ + f_14_ + 0.5F;
	    }
	} else {
	    f_15_ = argument_8_ + -f_14_ + 0.5F;
	    f_16_ = argument_11_ + f + 0.5F;
	}
	if (argument_1_ == 1) {
	    float f_17_ = f_16_;
	    f_16_ = -f_15_;
	    f_15_ = f_17_;
	} else if (argument_1_ == 2) {
	    f_15_ = -f_15_;
	    f_16_ = -f_16_;
	} else if (argument_1_ == 3) {
	    float f_18_ = f_16_;
	    f_16_ = f_15_;
	    f_15_ = -f_18_;
	}
	argument_0_[1] = f_15_;
	argument_0_[argument_6_] = f_16_;
    }
    
    public final void run() {
	for (;;) {
	    int anLocalInt;
	    synchronized (this) {
		for (;;) {
		    if (anIOException712 != null)
			return;
		    if (anInt707 > anInt705)
			anLocalInt = anInt705 + anInt710 - anInt707;
		    else
			anLocalInt = -anInt707 + anInt705;
		    if (anLocalInt > 0)
			break;
		    try {
			anOutputStream713.flush();
		    } catch (IOException ioexception) {
			anIOException712 = ioexception;
			return;
		    }
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (anInt710 < anLocalInt + anInt707) {
		    int anLocalInt_19_ = -anInt707 + anInt710;
		    anOutputStream713.write(aByteArray708, anInt707,
					    anLocalInt_19_);
		    anOutputStream713.write(aByteArray708, 0,
					    -anLocalInt_19_ + anLocalInt);
		} else
		    anOutputStream713.write(aByteArray708, anInt707,
					    anLocalInt);
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException712 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt707 = (anInt707 + anLocalInt) % anInt710;
	    }
	}
    }
    
    static final void method1690(int argument, int argument_20_,
				 int argument_21_, int argument_22_,
				 int argument_23_, int argument_24_) {
	int anLocalInt = argument_21_ - argument_23_;
	int anLocalInt_25_ = -argument_22_ + argument_20_;
	if (anLocalInt != 0) {
	    if (anLocalInt_25_ == 0) {
		DoublyLinkedNodeP2_Sub4_Sub1.method1905((byte) -102, argument_24_,
					      argument_22_, argument_21_,
					      argument_23_);
		return;
	    }
	} else {
	    if (anLocalInt_25_ != 0)
		Class214_Sub1.method2987(argument_22_, argument_23_,
					 argument_24_, 84, argument_20_);
	    return;
	}
	int anLocalInt_26_ = (anLocalInt_25_ << 12) / anLocalInt;
	int anLocalInt_27_
	    = -(argument_23_ * anLocalInt_26_ >> 12) + argument_22_;
	int anLocalInt_28_;
	int anLocalInt_29_;
	if (argument_23_ < Node_Sub35.anInt4156) {
	    anLocalInt_29_ = ((anLocalInt_26_ * Node_Sub35.anInt4156 >> 12)
			      + anLocalInt_27_);
	    anLocalInt_28_ = Node_Sub35.anInt4156;
	} else if (Node_Sub9_Sub2.anInt5776 < argument_23_) {
	    anLocalInt_28_ = Node_Sub9_Sub2.anInt5776;
	    anLocalInt_29_ = (Node_Sub9_Sub2.anInt5776 * anLocalInt_26_
			      >> 12) + anLocalInt_27_;
	} else {
	    anLocalInt_29_ = argument_22_;
	    anLocalInt_28_ = argument_23_;
	}
	int anLocalInt_30_;
	int anLocalInt_31_;
	if (argument_21_ < Node_Sub35.anInt4156) {
	    anLocalInt_30_ = ((Node_Sub35.anInt4156 * anLocalInt_26_ >> 12)
			      + anLocalInt_27_);
	    anLocalInt_31_ = Node_Sub35.anInt4156;
	} else if (argument_21_ <= Node_Sub9_Sub2.anInt5776) {
	    anLocalInt_30_ = argument_20_;
	    anLocalInt_31_ = argument_21_;
	} else {
	    anLocalInt_30_
		= (anLocalInt_27_
		   + (anLocalInt_26_ * Node_Sub9_Sub2.anInt5776 >> 12));
	    anLocalInt_31_ = Node_Sub9_Sub2.anInt5776;
	}
	if (anLocalInt_30_ >= Class209.anInt1504) {
	    if (Node_Sub31_Sub13.anInt5896 < anLocalInt_30_) {
		anLocalInt_30_ = Node_Sub31_Sub13.anInt5896;
		anLocalInt_31_
		    = ((Node_Sub31_Sub13.anInt5896 - anLocalInt_27_ << 12)
		       / anLocalInt_26_);
	    }
	} else {
	    anLocalInt_31_ = ((-anLocalInt_27_ + Class209.anInt1504 << 12)
			      / anLocalInt_26_);
	    anLocalInt_30_ = Class209.anInt1504;
	}
	if (Class209.anInt1504 > anLocalInt_29_) {
	    anLocalInt_28_ = ((-anLocalInt_27_ + Class209.anInt1504 << 12)
			      / anLocalInt_26_);
	    anLocalInt_29_ = Class209.anInt1504;
	} else if (anLocalInt_29_ > Node_Sub31_Sub13.anInt5896) {
	    anLocalInt_29_ = Node_Sub31_Sub13.anInt5896;
	    anLocalInt_28_ = (Node_Sub31_Sub13.anInt5896 - anLocalInt_27_
			      << 12) / anLocalInt_26_;
	}
	Class_s.method3532(argument_24_, true, anLocalInt_29_, anLocalInt_30_,
			   anLocalInt_31_, anLocalInt_28_);
    }
    
    final void method1691(byte argument_32_) {
	synchronized (this) {
	    if (anIOException712 == null)
		anIOException712 = new IOException("");
	    this.notifyAll();
	}
	try {
	    aThread711.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    final void method1692(int argument_33_, byte[] argument_34_,
			  int argument_35_,
			  int argument_36_) throws IOException {
	if (argument_36_ < 0 || argument_33_ < 0
	    || argument_33_ + argument_36_ > argument_34_.length)
	    throw new IOException();
	synchronized (this) {
	    if (anIOException712 != null)
		throw new IOException(anIOException712.toString());
	    int anLocalInt;
	    if (anInt707 > anInt705)
		anLocalInt = anInt707 - anInt705 - 1;
	    else
		anLocalInt = anInt707 - anInt705 - 1 + anInt710;
	    if (argument_36_ > anLocalInt)
		throw new IOException("");
	    if (anInt705 + argument_36_ > anInt710) {
		int anLocalInt_37_ = anInt710 - anInt705;
		JagStrings.memcpy(argument_34_, argument_33_, aByteArray708, anInt705, anLocalInt_37_);
		JagStrings.memcpy(argument_34_, anLocalInt_37_ + argument_33_, aByteArray708, 0, argument_36_ - anLocalInt_37_);
	    } else
		JagStrings.memcpy(argument_34_, argument_33_, aByteArray708, anInt705, argument_36_);
	    anInt705 = (argument_36_ + anInt705) % anInt710;
	    this.notifyAll();
	}
    }
    
    final void method1693(int argument_38_) {
	anOutputStream713 = new OutputStream_Sub2();
    }
    
    public static void method1694(byte argument) {
	Applet_Sub1.backBuffer = null;
	anIntArray709 = null;
    }
    
    Class92(OutputStream argument_39_, int argument_40_) {
	anInt705 = 0;
	anOutputStream713 = argument_39_;
	anInt710 = argument_40_ + 1;
	aByteArray708 = new byte[anInt710];
	aThread711 = new Thread(this);
	aThread711.setDaemon(true);
	aThread711.start();
    }
}
