/* Class59_Sub31_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Node_Sub31_Sub28 extends Node_Sub31
{
    private int anInt5963 = 0;
    private int anInt5964;
    private int anInt5965;
    private int anInt5966;
    private int anInt5967;
    private int anInt5968;
    private int anInt5969;
    private int[][] anIntArrayArray5970;
    private int[] anIntArray5971;
    private int anInt5972;
    private int anInt5973 = 204;
    private int[][] anIntArrayArray5974;
    private int anInt5975;
    private int anInt5976;
    static double aDouble5977;
    
    final int[] method867(byte argument_0_, int argument_1_) {
	if (argument_0_ < 21)
	    return null;
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_1_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int anLocalInt = 0;
	    int anLocalInt_2_;
	    for (anLocalInt_2_
		     = Class82.anIntArray585[argument_1_] + anInt5963;
		 anLocalInt_2_ < 0; anLocalInt_2_ += 4096) {
		/* empty */
	    }
	    for (/**/; anLocalInt_2_ > 4096; anLocalInt_2_ -= 4096) {
		/* empty */
	    }
	    for (/**/; anInt5972 > anLocalInt; anLocalInt++) {
		if (anLocalInt_2_ < anIntArray5971[anLocalInt])
		    break;
	    }
	    int anLocalInt_3_ = anLocalInt - 1;
	    boolean anLocalBoolean = (anLocalInt & 0x1) == 0;
	    int anLocalInt_4_ = anIntArray5971[anLocalInt];
	    int anLocalInt_5_ = anIntArray5971[anLocalInt - 1];
	    if (anLocalInt_5_ + anInt5966 >= anLocalInt_2_
		|| anLocalInt_2_ >= anLocalInt_4_ - anInt5966)
		JagStrings.memset(anLocalInts, 0, Statics.anInt294, 0);
	    else {
		for (int anLocalInt_6_ = 0; anLocalInt_6_ < Statics.anInt294;
		     anLocalInt_6_++) {
		    int anLocalInt_7_ = 0;
		    int anLocalInt_8_
			= anLocalBoolean ? anInt5975 : -anInt5975;
		    int anLocalInt_9_;
		    for (anLocalInt_9_
			     = (Class130.anIntArray1053[anLocalInt_6_]
				+ (anLocalInt_8_ * anInt5965 >> 12));
			 anLocalInt_9_ < 0; anLocalInt_9_ += 4096) {
			/* empty */
		    }
		    for (/**/; anLocalInt_9_ > 4096; anLocalInt_9_ -= 4096) {
			/* empty */
		    }
		    for (/**/; anLocalInt_7_ < anInt5969; anLocalInt_7_++) {
			if (anIntArrayArray5970[anLocalInt_3_][anLocalInt_7_]
			    > anLocalInt_9_)
			    break;
		    }
		    int anLocalInt_10_ = anLocalInt_7_ - 1;
		    int anLocalInt_11_
			= anIntArrayArray5970[anLocalInt_3_][anLocalInt_7_];
		    int anLocalInt_12_
			= anIntArrayArray5970[anLocalInt_3_][anLocalInt_10_];
		    if (anLocalInt_12_ + anInt5966 >= anLocalInt_9_
			|| anLocalInt_11_ - anInt5966 <= anLocalInt_9_)
			anLocalInts[anLocalInt_6_] = 0;
		    else
			anLocalInts[anLocalInt_6_]
			    = (anIntArrayArray5974[anLocalInt_3_]
			       [anLocalInt_10_]);
		}
	    }
	}
	return anLocalInts;
    }
    
    final void method865(boolean argument_13_) {
	if (argument_13_ == true)
	    method962((byte) 108);
    }
    
    private final void method962(byte argument_14_) {
	Random random = new Random((long) anInt5972);
	int anLocalInt = -92 / ((55 - argument_14_) / 52);
	anInt5966 = anInt5976 / 2;
	anInt5965 = 4096 / anInt5969;
	anInt5964 = 4096 / anInt5972;
	int anLocalInt_15_ = anInt5965 / 2;
	anIntArrayArray5974 = new int[anInt5972][anInt5969];
	anIntArray5971 = new int[anInt5972 + 1];
	int anLocalInt_16_ = anInt5964 / 2;
	anIntArrayArray5970 = new int[anInt5972][anInt5969 + 1];
	anIntArray5971[0] = 0;
	for (int anLocalInt_17_ = 0; anLocalInt_17_ < anInt5972;
	     anLocalInt_17_++) {
	    if (anLocalInt_17_ > 0) {
		int anLocalInt_18_ = anInt5964;
		int anLocalInt_19_ = ((Class207.method2945(random, 122, 4096)
				       - 2048) * anInt5973
				      >> 12);
		anLocalInt_18_ += anLocalInt_19_ * anLocalInt_16_ >> 12;
		anIntArray5971[anLocalInt_17_]
		    = anLocalInt_18_ + anIntArray5971[anLocalInt_17_ - 1];
	    }
	    anIntArrayArray5970[anLocalInt_17_][0] = 0;
	    for (int anLocalInt_20_ = 0; anLocalInt_20_ < anInt5969;
		 anLocalInt_20_++) {
		if (anLocalInt_20_ > 0) {
		    int anLocalInt_21_ = anInt5965;
		    int anLocalInt_22_ = (Class207.method2945(random, 48, 4096)
					  - 2048) * anInt5967 >> 12;
		    anLocalInt_21_ += anLocalInt_22_ * anLocalInt_15_ >> 12;
		    anIntArrayArray5970[anLocalInt_17_][anLocalInt_20_]
			= (anIntArrayArray5970[anLocalInt_17_]
			   [anLocalInt_20_ - 1]) + anLocalInt_21_;
		}
		anIntArrayArray5974[anLocalInt_17_][anLocalInt_20_]
		    = (anInt5968 <= 0 ? 4096
		       : -Class207.method2945(random, 124, anInt5968) + 4096);
	    }
	    anIntArrayArray5970[anLocalInt_17_][anInt5969] = 4096;
	}
	anIntArray5971[anInt5972] = 4096;
    }
    
    final void method868(Packet argument_23_, int argument_24_,
			 byte argument_25_) {
	int anLocalInt = argument_24_;
    while_162_:
	do {
	while_161_:
	    do {
	    while_160_:
		do {
		while_159_:
		    do {
		    while_158_:
			do {
			while_157_:
			    do {
				do {
				    if (anLocalInt != 0) {
					if (anLocalInt != 1) {
					    if (anLocalInt != 2) {
						if (anLocalInt != 3) {
						    if (anLocalInt != 4) {
							if (anLocalInt != 5) {
							    if (anLocalInt
								!= 6) {
								if (anLocalInt
								    != 7)
								    break while_162_;
							    } else
								break while_160_;
							    break while_161_;
							}
						    } else
							break while_158_;
						    break while_159_;
						}
					    } else
						break;
					    break while_157_;
					}
				    } else {
					anInt5969
					    = argument_23_
						  .g1();
					break while_162_;
				    }
				    anInt5972
					= argument_23_.g1();
				    break while_162_;
				} while (false);
				anInt5967 = argument_23_.g2();
				break while_162_;
			    } while (false);
			    anInt5973 = argument_23_.g2();
			    break while_162_;
			} while (false);
			anInt5975 = argument_23_.g2();
			break while_162_;
		    } while (false);
		    anInt5963 = argument_23_.g2();
		    break while_162_;
		} while (false);
		anInt5976 = argument_23_.g2();
		break while_162_;
	    } while (false);
	    anInt5968 = argument_23_.g2();
	} while (false);
	if (argument_25_ >= -41)
	    method867((byte) 28, -8);
    }
    
    public Node_Sub31_Sub28() {
	super(0, true);
	anInt5968 = 1024;
	anInt5967 = 409;
	anInt5969 = 4;
	anInt5972 = 8;
	anInt5976 = 81;
	anInt5975 = 1024;
    }
}
