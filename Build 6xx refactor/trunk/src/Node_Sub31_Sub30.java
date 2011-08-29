/* Class59_Sub31_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Node_Sub31_Sub30 extends Node_Sub31
{
    private int anInt5982 = 16;
    static Class257 aClass257_5983;
    private int anInt5984;
    private int anInt5985;
    private int anInt5986 = 4096;
    static int anInt5987;
    static Node_Sub29[] aClass59_Sub29Array5988 = new Node_Sub29[300];
    private int anInt5989;
    
    public Node_Sub31_Sub30() {
	super(0, true);
	anInt5985 = 0;
	anInt5984 = 2000;
	anInt5989 = 0;
    }
    
    final int[] method867(byte argument_0_, int argument_1_) {
	if (argument_0_ < 21)
	    anInt5985 = -42;
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_1_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int anLocalInt = anInt5986 >> 1;
	    int[][] anLocalInts_2_
		= ((Node_Sub31) this).aClass97_4135.method1717(0);
	    Random random = new Random((long) anInt5989);
	    for (int anLocalInt_3_ = 0; anInt5984 > anLocalInt_3_;
		 anLocalInt_3_++) {
		int anLocalInt_4_
		    = (anInt5986 <= 0 ? anInt5985
		       : (anInt5985 - anLocalInt
			  + Class207.method2945(random, 7, anInt5986)));
		anLocalInt_4_ = (anLocalInt_4_ & 0xff2) >> 4;
		int anLocalInt_5_
		    = Class207.method2945(random, -108, Statics.anInt294);
		int anLocalInt_6_
		    = Class207.method2945(random, 88,
					  DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711);
		int anLocalInt_7_
		    = ((Class62_Sub7.anIntArray4392[anLocalInt_4_] * anInt5982
			>> 12)
		       + anLocalInt_5_);
		int anLocalInt_8_
		    = (((anInt5982
			 * FloatPacket.anIntArray5834[anLocalInt_4_])
			>> 12)
		       + anLocalInt_6_);
		int anLocalInt_9_ = -anLocalInt_6_ + anLocalInt_8_;
		int anLocalInt_10_ = -anLocalInt_5_ + anLocalInt_7_;
		if (anLocalInt_10_ != 0 || anLocalInt_9_ != 0) {
		    if (anLocalInt_9_ < 0)
			anLocalInt_9_ = -anLocalInt_9_;
		    if (anLocalInt_10_ < 0)
			anLocalInt_10_ = -anLocalInt_10_;
		    boolean anLocalBoolean = anLocalInt_9_ > anLocalInt_10_;
		    if (anLocalBoolean) {
			int anLocalInt_11_ = anLocalInt_5_;
			int anLocalInt_12_ = anLocalInt_7_;
			anLocalInt_5_ = anLocalInt_6_;
			anLocalInt_6_ = anLocalInt_11_;
			anLocalInt_7_ = anLocalInt_8_;
			anLocalInt_8_ = anLocalInt_12_;
		    }
		    if (anLocalInt_5_ > anLocalInt_7_) {
			int anLocalInt_13_ = anLocalInt_5_;
			anLocalInt_5_ = anLocalInt_7_;
			int anLocalInt_14_ = anLocalInt_6_;
			anLocalInt_7_ = anLocalInt_13_;
			anLocalInt_6_ = anLocalInt_8_;
			anLocalInt_8_ = anLocalInt_14_;
		    }
		    int anLocalInt_15_ = anLocalInt_6_;
		    int anLocalInt_16_ = anLocalInt_7_ - anLocalInt_5_;
		    int anLocalInt_17_ = -anLocalInt_6_ + anLocalInt_8_;
		    int anLocalInt_18_ = -anLocalInt_16_ / 2;
		    int anLocalInt_19_ = 2048 / anLocalInt_16_;
		    int anLocalInt_20_
			= -(Class207.method2945(random, -4, 4096) >> 2) + 1024;
		    int anLocalInt_21_
			= anLocalInt_8_ <= anLocalInt_6_ ? -1 : 1;
		    if (anLocalInt_17_ < 0)
			anLocalInt_17_ = -anLocalInt_17_;
		    for (int anLocalInt_22_ = anLocalInt_5_;
			 anLocalInt_7_ > anLocalInt_22_; anLocalInt_22_++) {
			int anLocalInt_23_
			    = (anLocalInt_20_
			       + ((anLocalInt_22_ - anLocalInt_5_)
				  * anLocalInt_19_)
			       + 1024);
			int anLocalInt_24_
			    = anLocalInt_22_ & Statics.anInt1269;
			int anLocalInt_25_
			    = Exception_Sub1.anInt49 & anLocalInt_15_;
			if (!anLocalBoolean)
			    anLocalInts_2_[anLocalInt_24_][anLocalInt_25_]
				= anLocalInt_23_;
			else
			    anLocalInts_2_[anLocalInt_25_][anLocalInt_24_]
				= anLocalInt_23_;
			anLocalInt_18_ += anLocalInt_17_;
			if (anLocalInt_18_ > 0) {
			    anLocalInt_15_ += anLocalInt_21_;
			    anLocalInt_18_ = -anLocalInt_16_ + anLocalInt_18_;
			}
		    }
		}
	    }
	}
	return anLocalInts;
    }
    
    static final void method967(byte argument, int argument_26_,
				int argument_27_, GraphicsToolkit argument_28_,
				int argument_29_, int argument_30_) {
	Statics.aGraphicsToolkit5822 = argument_28_;
	Statics.aClass350_1255
	    = Statics.aGraphicsToolkit5822.method2029();
	Node_Sub31_Sub18.aClass350_5922
	    = Statics.aGraphicsToolkit5822.method2029();
	DoublyLinkedNodeP2_Sub4_Sub1.aClass350_6437
	    = Statics.aGraphicsToolkit5822.method2029();
	Class5.anIntArray65 = null;
	Class344.anInt3590 = argument_26_;
	Class301.anInterface15Array2529 = null;
	Class50.anInt365 = 0;
	Node_Sub18.anInt4006 = argument_27_;
	Class9.method244(argument_29_, (byte) 125, argument_30_);
	Class323.anInt2670 = -1;
	Class257.anInt2007 = -1;
	DoublyLinkedNodeP2_Sub8.anInt4581 = -1;
    }
    
    final void method865(boolean argument_31_) {
	Class344.method3799(argument_31_);
    }
    
    final void method868(Packet argument_32_, int argument_33_,
			 byte argument_34_) {
	if (argument_34_ >= -41)
	    method967((byte) -32, -121, -5, null, -22, 60);
	int anLocalInt = argument_33_;
    while_165_:
	do {
	while_164_:
	    do {
	    while_163_:
		do {
		    do {
			if (anLocalInt != 0) {
			    if (anLocalInt != 1) {
				if (anLocalInt != 2) {
				    if (anLocalInt != 3) {
					if (anLocalInt == 4)
					    break while_164_;
					break while_165_;
				    }
				} else
				    break;
				break while_163_;
			    }
			} else {
			    anInt5989 = argument_32_.g1();
			    return;
			}
			anInt5984 = argument_32_.g2();
			return;
		    } while (false);
		    anInt5982 = argument_32_.g1();
		    return;
		} while (false);
		anInt5985 = argument_32_.g2();
		return;
	    } while (false);
	    anInt5986 = argument_32_.g2();
	    break;
	} while (false);
    }
    
    public static void method968(int argument) {
	aClass257_5983 = null;
	aClass59_Sub29Array5988 = null;
    }
}
