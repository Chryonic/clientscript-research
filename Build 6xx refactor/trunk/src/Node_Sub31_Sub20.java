/* Class59_Sub31_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub20 extends Node_Sub31
{
    final int[] method867(byte argument_0_, int argument_1_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_1_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    for (int anLocalInt = 0; Statics.anInt294 > anLocalInt;
		 anLocalInt++) {
		method937(anLocalInt, argument_1_, 1);
		int[] anLocalInts_2_
		    = this.method864(Node_Sub31_Sub19.anInt5927, 0,
				     (byte) 33);
		anLocalInts[anLocalInt] = anLocalInts_2_[Class32.anInt215];
	    }
	}
	if (argument_0_ < 21)
	    method867((byte) -36, -91);
	return anLocalInts;
    }
    
    final void method868(Packet argument_3_, int argument_4_,
			 byte argument_5_) {
	if (argument_4_ == 0)
	    ((Node_Sub31) this).aBoolean4138
		= argument_3_.g1() == 1;
	if (argument_5_ >= -41) {
	    /* empty */
	}
    }
    
    private final void method937(int argument_6_, int argument_7_,
				 int argument_8_) {
	if (argument_8_ == 1) {
	    int anLocalInt = Class130.anIntArray1053[argument_6_];
	    int anLocalInt_9_ = Class82.anIntArray585[argument_7_];
	    float f = (float) Math.atan2((double) (anLocalInt - 2048),
					 (double) (anLocalInt_9_ - 2048));
	    if (!((double) f >= -3.141592653589793)
		|| !((double) f <= -2.356194490192345)) {
		if ((double) f <= -1.5707963267948966
		    && (double) f >= -2.356194490192345) {
		    Class32.anInt215 = argument_7_;
		    Node_Sub31_Sub19.anInt5927 = argument_6_;
		} else if (!((double) f <= -0.7853981633974483)
			   || !((double) f >= -1.5707963267948966)) {
		    if (f <= 0.0F && (double) f >= -0.7853981633974483) {
			Node_Sub31_Sub19.anInt5927
			    = DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711 - argument_7_;
			Class32.anInt215 = argument_6_;
		    } else if (!(f >= 0.0F)
			       || !((double) f <= 0.7853981633974483)) {
			if ((double) f >= 0.7853981633974483
			    && (double) f <= 1.5707963267948966) {
			    Class32.anInt215 = -argument_7_ + Statics.anInt294;
			    Node_Sub31_Sub19.anInt5927
				= (-argument_6_
				   + DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711);
			} else if ((double) f >= 1.5707963267948966
				   && (double) f <= 2.356194490192345) {
			    Class32.anInt215 = argument_7_;
			    Node_Sub31_Sub19.anInt5927
				= (DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711
				   - argument_6_);
			} else if ((double) f >= 2.356194490192345
				   && (double) f <= 3.141592653589793) {
			    Class32.anInt215 = Statics.anInt294 - argument_6_;
			    Node_Sub31_Sub19.anInt5927 = argument_7_;
			}
		    } else {
			Node_Sub31_Sub19.anInt5927
			    = DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711 - argument_7_;
			Class32.anInt215 = Statics.anInt294 - argument_6_;
		    }
		} else {
		    Node_Sub31_Sub19.anInt5927 = argument_6_;
		    Class32.anInt215 = -argument_7_ + Statics.anInt294;
		}
	    } else {
		Class32.anInt215 = argument_6_;
		Node_Sub31_Sub19.anInt5927 = argument_7_;
	    }
	    Class32.anInt215 &= Statics.anInt1269;
	    Node_Sub31_Sub19.anInt5927 &= Exception_Sub1.anInt49;
	}
    }
    
    final int[][] method870(int argument_10_, byte argument_11_) {
	if (argument_11_ != -9)
	    return null;
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 119,
							       argument_10_);
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int[] anLocalInts_12_ = anLocalInts[0];
	    int[] anLocalInts_13_ = anLocalInts[1];
	    int[] anLocalInts_14_ = anLocalInts[2];
	    for (int anLocalInt = 0; anLocalInt < Statics.anInt294;
		 anLocalInt++) {
		method937(anLocalInt, argument_10_, argument_11_ ^ ~0x9);
		int[][] anLocalInts_15_
		    = this.method869(0, 1, Node_Sub31_Sub19.anInt5927);
		anLocalInts_12_[anLocalInt]
		    = anLocalInts_15_[0][Class32.anInt215];
		anLocalInts_13_[anLocalInt]
		    = anLocalInts_15_[1][Class32.anInt215];
		anLocalInts_14_[anLocalInt]
		    = anLocalInts_15_[2][Class32.anInt215];
	    }
	}
	return anLocalInts;
    }
    
    public Node_Sub31_Sub20() {
	super(1, false);
    }
}
