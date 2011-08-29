/* Class59_Sub31_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub5 extends Node_Sub31
{
    private int anInt5857 = 204;
    static Class_s[] aClass_sArray5858;
    private int anInt5859 = 1;
    private int anInt5860 = 1;
    
    final int[] method867(byte argument_0_, int argument_1_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_1_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int anLocalInt = 0;
	    for (/**/; Statics.anInt294 > anLocalInt; anLocalInt++) {
		int anLocalInt_2_ = Class130.anIntArray1053[anLocalInt];
		int anLocalInt_3_ = Class82.anIntArray585[argument_1_];
		int anLocalInt_4_ = anLocalInt_2_ * anInt5859 >> 12;
		int anLocalInt_5_ = anLocalInt_3_ * anInt5860 >> 12;
		int anLocalInt_6_
		    = anInt5859 * (anLocalInt_2_ % (4096 / anInt5859));
		int anLocalInt_7_
		    = anInt5860 * (anLocalInt_3_ % (4096 / anInt5860));
		if (anInt5857 > anLocalInt_7_) {
		    for (anLocalInt_4_ -= anLocalInt_5_; anLocalInt_4_ < 0;
			 anLocalInt_4_ += 4) {
			/* empty */
		    }
		    for (/**/; anLocalInt_4_ > 3; anLocalInt_4_ -= 4) {
			/* empty */
		    }
		    if (anLocalInt_4_ != 1) {
			anLocalInts[anLocalInt] = 0;
			continue;
		    }
		    if (anLocalInt_6_ < anInt5857) {
			anLocalInts[anLocalInt] = 0;
			continue;
		    }
		}
		if (anInt5857 > anLocalInt_6_) {
		    for (anLocalInt_4_ -= anLocalInt_5_; anLocalInt_4_ < 0;
			 anLocalInt_4_ += 4) {
			/* empty */
		    }
		    for (/**/; anLocalInt_4_ > 3; anLocalInt_4_ -= 4) {
			/* empty */
		    }
		    if (anLocalInt_4_ > 0) {
			anLocalInts[anLocalInt] = 0;
			continue;
		    }
		}
		anLocalInts[anLocalInt] = 4096;
	    }
	}
	if (argument_0_ <= 21)
	    anInt5860 = 106;
	return anLocalInts;
    }
    
    final void method868(Packet argument_8_, int argument_9_,
			 byte argument_10_) {
	if (argument_10_ >= -41)
	    anInt5859 = -99;
	int anLocalInt = argument_9_;
    while_126_:
	do {
	    do {
		if (anLocalInt != 0) {
		    if (anLocalInt != 1) {
			if (anLocalInt == 2)
			    break;
			break while_126_;
		    }
		} else {
		    anInt5859 = argument_8_.g1();
		    return;
		}
		anInt5860 = argument_8_.g1();
		return;
	    } while (false);
	    anInt5857 = argument_8_.g2();
	    break;
	} while (false);
    }
    
    public static void method891(boolean argument) {
	aClass_sArray5858 = null;
    }
    
    public Node_Sub31_Sub5() {
	super(0, true);
    }
}
