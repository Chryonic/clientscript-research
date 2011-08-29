/* Class59_Sub31_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub2 extends Node_Sub31
{
    static int anInt5844;
    private int anInt5845 = 4096;
    private int anInt5846 = 0;
    static int anInt5847;
    
    final void method868(Packet argument_0_, int argument_1_,
			 byte argument_2_) {
	if (argument_2_ < -41) {
	    int anLocalInt = argument_1_;
	    do {
		if (anLocalInt != 0) {
		    if (anLocalInt != 1)
			break;
		} else {
		    anInt5846 = argument_0_.g2();
		    break;
		}
		anInt5845 = argument_0_.g2();
	    } while (false);
	}
    }
    
    public Node_Sub31_Sub2() {
	super(1, true);
    }
    
    final int[] method867(byte argument_3_, int argument_4_) {
	if (argument_3_ < 21)
	    anInt5847 = -63;
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_4_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int[] anLocalInts_5_ = this.method864(argument_4_, 0, (byte) 33);
	    for (int anLocalInt = 0; Statics.anInt294 > anLocalInt;
		 anLocalInt++) {
		int anLocalInt_6_ = anLocalInts_5_[anLocalInt];
		anLocalInts[anLocalInt]
		    = (anInt5846 > anLocalInt_6_ || anLocalInt_6_ > anInt5845
		       ? 0 : 4096);
	    }
	}
	return anLocalInts;
    }

}
