/* Class59_Sub31_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub27 extends Node_Sub31
{
    private boolean aBoolean5958 = true;
    static boolean aBoolean5959;
    private boolean aBoolean5960 = true;
    static int anInt5961 = 0;
    static int anInt5962;
    
    public Node_Sub31_Sub27() {
	super(1, false);
    }
    
    final int[] method867(byte argument_0_, int argument_1_) {
	if (argument_0_ <= 21)
	    Applet_Sub1.anApplet5957 = null;
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_1_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int[] anLocalInts_2_
		= this.method864((aBoolean5958
				  ? Exception_Sub1.anInt49 - argument_1_
				  : argument_1_),
				 0, (byte) 33);
	    if (aBoolean5960) {
		for (int anLocalInt = 0; Statics.anInt294 > anLocalInt;
		     anLocalInt++)
		    anLocalInts[anLocalInt]
			= anLocalInts_2_[Statics.anInt1269 - anLocalInt];
	    } else
		JagStrings.memcpy(anLocalInts_2_, 0, anLocalInts, 0, Statics.anInt294);
	}
	return anLocalInts;
    }
    
    final void method868(Packet argument_3_, int argument_4_,
			 byte argument_5_) {
	int anLocalInt = argument_4_;
    while_156_:
	do {
	    do {
		if (anLocalInt != 0) {
		    if (anLocalInt != 1) {
			if (anLocalInt == 2)
			    break;
			break while_156_;
		    }
		} else {
		    aBoolean5960 = argument_3_.g1() == 1;
		    break while_156_;
		}
		aBoolean5958 = argument_3_.g1() == 1;
		break while_156_;
	    } while (false);
	    ((Node_Sub31) this).aBoolean4138
		= argument_3_.g1() == 1;
	} while (false);
	if (argument_5_ >= -41)
	    aBoolean5959 = false;
    }
    
    static final String method960(int argument, int argument_6_) {
	Node_Sub23 class59_sub23
	    = ((Node_Sub23)
	       Node_Sub37_Sub1.aJagexHashMap_6114.get((long) argument));
	if (class59_sub23 != null) {
	    Node_Sub32_Sub3 class59_sub32_sub3
		= ((Node_Sub23) class59_sub23).aClass109_Sub1_4050
		      .method1970(15570);
	    if (class59_sub32_sub3 != null) {
		double d = ((Node_Sub23) class59_sub23)
			       .aClass109_Sub1_4050.method1979(0);
		if ((double) class59_sub32_sub3.method1029((byte) -19) <= d
		    && (double) class59_sub32_sub3.method1026((byte) 126) >= d)
		    return class59_sub32_sub3.method1027(true);
	    }
	}
	return null;
    }
    
    final int[][] method870(int argument_7_, byte argument_8_) {
	if (argument_8_ != -9)
	    aBoolean5958 = true;
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 90,
							       argument_7_);
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int[][] anLocalInts_9_
		= this.method869(0, 1,
				 (!aBoolean5958 ? argument_7_
				  : Exception_Sub1.anInt49 - argument_7_));
	    int[] anLocalInts_10_ = anLocalInts_9_[0];
	    int[] anLocalInts_11_ = anLocalInts_9_[1];
	    int[] anLocalInts_12_ = anLocalInts_9_[2];
	    int[] anLocalInts_13_ = anLocalInts[0];
	    int[] anLocalInts_14_ = anLocalInts[1];
	    int[] anLocalInts_15_ = anLocalInts[2];
	    if (!aBoolean5960) {
		for (int anLocalInt = 0; Statics.anInt294 > anLocalInt;
		     anLocalInt++) {
		    anLocalInts_13_[anLocalInt] = anLocalInts_10_[anLocalInt];
		    anLocalInts_14_[anLocalInt] = anLocalInts_11_[anLocalInt];
		    anLocalInts_15_[anLocalInt] = anLocalInts_12_[anLocalInt];
		}
	    } else {
		for (int anLocalInt = 0; anLocalInt < Statics.anInt294;
		     anLocalInt++) {
		    anLocalInts_13_[anLocalInt]
			= anLocalInts_10_[Statics.anInt1269 - anLocalInt];
		    anLocalInts_14_[anLocalInt]
			= anLocalInts_11_[-anLocalInt + Statics.anInt1269];
		    anLocalInts_15_[anLocalInt]
			= anLocalInts_12_[-anLocalInt + Statics.anInt1269];
		}
	    }
	}
	return anLocalInts;
    }
    
    public static void method961(byte argument) {
	Applet_Sub1.anApplet5957 = null;
    }
    
    static {
	aBoolean5959 = false;
    }
}
