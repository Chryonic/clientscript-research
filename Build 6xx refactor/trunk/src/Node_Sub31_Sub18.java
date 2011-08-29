/* Class59_Sub31_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub18 extends Node_Sub31
{
    private int anInt5916;
    private int anInt5917 = 20;
    private int anInt5918;
    static int anInt5919;
    static boolean aBoolean5920;
    private int anInt5921;
    static Class350 aClass350_5922;
    
    final void method868(Packet argument_0_, int argument_1_,
			 byte argument_2_) {
	int anLocalInt = argument_1_;
    while_144_:
	do {
	while_143_:
	    do {
		do {
		    if (anLocalInt != 0) {
			if (anLocalInt != 1) {
			    if (anLocalInt != 2) {
				if (anLocalInt != 3)
				    break while_144_;
			    } else
				break;
			    break while_143_;
			}
		    } else {
			anInt5916 = argument_0_.g2();
			break while_144_;
		    }
		    anInt5917 = argument_0_.g2();
		    break while_144_;
		} while (false);
		anInt5921 = argument_0_.g2();
		break while_144_;
	    } while (false);
	    anInt5918 = argument_0_.g2();
	} while (false);
	if (argument_2_ > -41)
	    method934(-101);
    }
    
    public Node_Sub31_Sub18() {
	super(0, true);
	anInt5916 = 1365;
	anInt5918 = 0;
	anInt5921 = 0;
    }
    
    static final void method933(DoublyLinkedNodeP2_Sub2 argument, boolean argument_3_,
				boolean argument_4_) {
	((DoublyLinkedNodeP2_Sub2) argument).aBoolean4517 = argument_4_;
	if (Node_Sub31_Sub10.aBoolean5882) {
	    if (argument_3_)
		Class179_Sub1.aClass130Array5271
		    [Class179_Sub1.aClass130Array5271.length - 1]
		    .method2430(argument, (byte) 109);
	    else {
		int anLocalInt
		    = Exception_Sub1
			  .method140(((DoublyLinkedNodeP2_Sub2) argument).anInt4510);
		int anLocalInt_5_ = (Statics.anIntArray6413[2]
				     * argument.method1774(-13878)
				     / ((DoublyLinkedNodeP2_Sub2) argument).anInt4516);
		int anLocalInt_6_
		    = Exception_Sub1.method140((((DoublyLinkedNodeP2_Sub2) argument)
						.anInt4510) - anLocalInt_5_);
		int anLocalInt_7_
		    = Exception_Sub1.method140((((DoublyLinkedNodeP2_Sub2) argument)
						.anInt4510) + anLocalInt_5_);
		if (anLocalInt_6_ == anLocalInt_7_)
		    Class179_Sub1.aClass130Array5271[anLocalInt]
			.method2430(argument, (byte) 109);
		else if (anLocalInt_7_ - anLocalInt_6_ == 1)
		    Class179_Sub1.aClass130Array5271
			[Statics.anInt1650 + anLocalInt_6_]
			.method2430(argument, (byte) 109);
		else
		    Class179_Sub1.aClass130Array5271
			[Class179_Sub1.aClass130Array5271.length - 1]
			.method2430(argument, (byte) 109);
	    }
	} else
	    LightingManager.method3620(argument, Class169.aClass59_Sub3Array1235);
    }
    
    public static void method934(int argument) {
	aClass350_5922 = null;
    }
    
    final int[] method867(byte argument_8_, int argument_9_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_9_,
							      -13476);
	if (argument_8_ < 21)
	    anInt5917 = -10;
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    for (int anLocalInt = 0; Statics.anInt294 > anLocalInt;
		 anLocalInt++) {
		int anLocalInt_10_
		    = ((Class130.anIntArray1053[anLocalInt] << 12) / anInt5916
		       + anInt5921);
		int anLocalInt_11_
		    = ((Class82.anIntArray585[argument_9_] << 12) / anInt5916
		       + anInt5918);
		int anLocalInt_12_ = anLocalInt_10_;
		int anLocalInt_13_ = anLocalInt_11_;
		int anLocalInt_14_ = anLocalInt_10_;
		int anLocalInt_15_ = anLocalInt_11_;
		int anLocalInt_16_ = anLocalInt_10_ * anLocalInt_10_ >> 12;
		int anLocalInt_17_ = anLocalInt_11_ * anLocalInt_11_ >> 12;
		int anLocalInt_18_;
		for (anLocalInt_18_ = 0;
		     (anLocalInt_17_ + anLocalInt_16_ < 16384
		      && anInt5917 > anLocalInt_18_);
		     anLocalInt_18_++) {
		    anLocalInt_15_
			= ((anLocalInt_14_ * anLocalInt_15_ >> 12) * 2
			   + anLocalInt_13_);
		    anLocalInt_14_
			= anLocalInt_12_ + anLocalInt_16_ - anLocalInt_17_;
		    anLocalInt_16_ = anLocalInt_14_ * anLocalInt_14_ >> 12;
		    anLocalInt_17_ = anLocalInt_15_ * anLocalInt_15_ >> 12;
		}
		anLocalInts[anLocalInt]
		    = (anInt5917 - 1 <= anLocalInt_18_ ? 0
		       : (anLocalInt_18_ << 12) / anInt5917);
	    }
	}
	return anLocalInts;
    }
}
