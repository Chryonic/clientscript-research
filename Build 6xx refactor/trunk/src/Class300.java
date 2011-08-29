/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class300
{
    private int anInt2519;
    private int anInt2520;
    private int anInt2521;
    private int[] anIntArray2522;
    private int anInt2523;
    private int anInt2524 = Node_Sub25.method762(16);
    private int anInt2525;
    
    final void method3530(float[] argument_0_, int argument_1_,
			  boolean argument_2_) {
	for (int anLocalInt = 0; anLocalInt < argument_1_; anLocalInt++)
	    argument_0_[anLocalInt] = 0.0F;
	if (!argument_2_) {
	    int anLocalInt
		= (((Class386) Node_Sub25.aClass386Array4078[anInt2519])
		   .anInt3261);
	    int anLocalInt_3_ = anInt2520 - anInt2521;
	    int anLocalInt_4_ = anLocalInt_3_ / anInt2523;
	    int[] anLocalInts = new int[anLocalInt_4_];
	    for (int anLocalInt_5_ = 0; anLocalInt_5_ < 8; anLocalInt_5_++) {
		int anLocalInt_6_ = 0;
		while (anLocalInt_6_ < anLocalInt_4_) {
		    if (anLocalInt_5_ == 0) {
			int anLocalInt_7_ = Node_Sub25
						.aClass386Array4078[anInt2519]
						.method4124();
			for (int anLocalInt_8_ = anLocalInt - 1;
			     anLocalInt_8_ >= 0; anLocalInt_8_--) {
			    if (anLocalInt_6_ + anLocalInt_8_ < anLocalInt_4_)
				anLocalInts[anLocalInt_6_ + anLocalInt_8_]
				    = anLocalInt_7_ % anInt2525;
			    anLocalInt_7_ /= anInt2525;
			}
		    }
		    for (int anLocalInt_9_ = 0; anLocalInt_9_ < anLocalInt;
			 anLocalInt_9_++) {
			int anLocalInt_10_ = anLocalInts[anLocalInt_6_];
			int anLocalInt_11_
			    = (anIntArray2522
			       [anLocalInt_10_ * 8 + anLocalInt_5_]);
			if (anLocalInt_11_ >= 0) {
			    int anLocalInt_12_
				= anInt2521 + anLocalInt_6_ * anInt2523;
			    Class386 class386
				= (Node_Sub25.aClass386Array4078
				   [anLocalInt_11_]);
			    if (anInt2524 == 0) {
				int anLocalInt_13_
				    = (anInt2523
				       / ((Class386) class386).anInt3261);
				for (int anLocalInt_14_ = 0;
				     anLocalInt_14_ < anLocalInt_13_;
				     anLocalInt_14_++) {
				    float[] fs = class386.method4127();
				    for (int anLocalInt_15_ = 0;
					 (anLocalInt_15_
					  < ((Class386) class386).anInt3261);
					 anLocalInt_15_++)
					argument_0_[(anLocalInt_12_
						     + anLocalInt_14_
						     + (anLocalInt_15_
							* anLocalInt_13_))]
					    += fs[anLocalInt_15_];
				}
			    } else {
				int anLocalInt_16_ = 0;
				while (anLocalInt_16_ < anInt2523) {
				    float[] fs = class386.method4127();
				    for (int anLocalInt_17_ = 0;
					 (anLocalInt_17_
					  < ((Class386) class386).anInt3261);
					 anLocalInt_17_++) {
					argument_0_[(anLocalInt_12_
						     + anLocalInt_16_)]
					    += fs[anLocalInt_17_];
					anLocalInt_16_++;
				    }
				}
			    }
			}
			if (++anLocalInt_6_ >= anLocalInt_4_)
			    break;
		    }
		}
	    }
	}
    }
    
    Class300() {
	anInt2521 = Node_Sub25.method762(24);
	anInt2520 = Node_Sub25.method762(24);
	anInt2523 = Node_Sub25.method762(24) + 1;
	anInt2525 = Node_Sub25.method762(6) + 1;
	anInt2519 = Node_Sub25.method762(8);
	int[] anLocalInts = new int[anInt2525];
	for (int anLocalInt = 0; anLocalInt < anInt2525; anLocalInt++) {
	    int anLocalInt_18_ = 0;
	    int anLocalInt_19_ = Node_Sub25.method762(3);
	    boolean anLocalBoolean = Node_Sub25.method754() != 0;
	    if (anLocalBoolean)
		anLocalInt_18_ = Node_Sub25.method762(5);
	    anLocalInts[anLocalInt] = anLocalInt_18_ << 3 | anLocalInt_19_;
	}
	anIntArray2522 = new int[anInt2525 * 8];
	for (int anLocalInt = 0; anLocalInt < anInt2525 * 8; anLocalInt++)
	    anIntArray2522[anLocalInt]
		= ((anLocalInts[anLocalInt >> 3] & 1 << (anLocalInt & 0x7))
		   != 0) ? Node_Sub25.method762(8) : -1;
    }
}
