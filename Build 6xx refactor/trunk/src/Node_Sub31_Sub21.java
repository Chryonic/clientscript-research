/* Class59_Sub31_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub21 extends Node_Sub31
{
    static int anInt5929;
    static int anInt5930;
    static Class221 aClass221_5931 = new Class221();
    private int[][] anIntArrayArray5932;
    private int[] anIntArray5933 = new int[257];
    
    final void method868(Packet argument_0_, int argument_1_,
			 byte argument_2_) {
	if (argument_2_ > -41)
	    method938(-114);
	if (argument_1_ == 0) {
	    int anLocalInt = argument_0_.g1();
	    if (anLocalInt != 0)
		method940(anLocalInt, 97);
	    else {
		anIntArrayArray5932
		    = new int[argument_0_.g1()][4];
		for (int anLocalInt_3_ = 0;
		     anLocalInt_3_ < anIntArrayArray5932.length;
		     anLocalInt_3_++) {
		    anIntArrayArray5932[anLocalInt_3_][0]
			= argument_0_.g2();
		    anIntArrayArray5932[anLocalInt_3_][1]
			= argument_0_.g1() << 4;
		    anIntArrayArray5932[anLocalInt_3_][2]
			= argument_0_.g1() << 4;
		    anIntArrayArray5932[anLocalInt_3_][3]
			= argument_0_.g1() << 4;
		}
	    }
	}
    }
    
    final int[][] method870(int argument_4_, byte argument_5_) {
	if (argument_5_ != -9)
	    method938(-42);
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 59,
							       argument_4_);
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int[] anLocalInts_6_ = this.method864(argument_4_, 0, (byte) 33);
	    int[] anLocalInts_7_ = anLocalInts[0];
	    int[] anLocalInts_8_ = anLocalInts[1];
	    int[] anLocalInts_9_ = anLocalInts[2];
	    for (int anLocalInt = 0; Statics.anInt294 > anLocalInt;
		 anLocalInt++) {
		int anLocalInt_10_ = anLocalInts_6_[anLocalInt] >> 4;
		if (anLocalInt_10_ < 0)
		    anLocalInt_10_ = 0;
		if (anLocalInt_10_ > 256)
		    anLocalInt_10_ = 256;
		anLocalInt_10_ = anIntArray5933[anLocalInt_10_];
		anLocalInts_7_[anLocalInt]
		    = MathStatics.AND(anLocalInt_10_ >> 12, 4080);
		anLocalInts_8_[anLocalInt]
		    = MathStatics.AND(anLocalInt_10_, 65280) >> 4;
		anLocalInts_9_[anLocalInt]
		    = MathStatics.AND(anLocalInt_10_ << 4, 4080);
	    }
	}
	return anLocalInts;
    }
    
    private final void method938(int argument_11_) {
	if (argument_11_ == -65537) {
	    int anLocalInt = anIntArrayArray5932.length;
	    if (anLocalInt > 0) {
		for (int anLocalInt_12_ = 0; anLocalInt_12_ < 257;
		     anLocalInt_12_++) {
		    int anLocalInt_13_ = 0;
		    int anLocalInt_14_ = anLocalInt_12_ << 4;
		    for (int anLocalInt_15_ = 0; anLocalInt_15_ < anLocalInt;
			 anLocalInt_15_++) {
			if (anIntArrayArray5932[anLocalInt_15_][0]
			    > anLocalInt_14_)
			    break;
			anLocalInt_13_++;
		    }
		    int anLocalInt_16_;
		    int anLocalInt_17_;
		    int anLocalInt_18_;
		    if (anLocalInt <= anLocalInt_13_) {
			int[] anLocalInts
			    = anIntArrayArray5932[anLocalInt - 1];
			anLocalInt_17_ = anLocalInts[3];
			anLocalInt_16_ = anLocalInts[1];
			anLocalInt_18_ = anLocalInts[2];
		    } else {
			int[] anLocalInts
			    = anIntArrayArray5932[anLocalInt_13_];
			if (anLocalInt_13_ <= 0) {
			    anLocalInt_16_ = anLocalInts[1];
			    anLocalInt_17_ = anLocalInts[3];
			    anLocalInt_18_ = anLocalInts[2];
			} else {
			    int[] anLocalInts_19_
				= anIntArrayArray5932[anLocalInt_13_ - 1];
			    int anLocalInt_20_
				= ((anLocalInt_14_ - anLocalInts_19_[0] << 12)
				   / (anLocalInts[0] - anLocalInts_19_[0]));
			    int anLocalInt_21_ = -anLocalInt_20_ + 4096;
			    anLocalInt_18_
				= ((anLocalInt_20_ * anLocalInts[2]
				    + anLocalInts_19_[2] * anLocalInt_21_)
				   >> 12);
			    anLocalInt_16_
				= (anLocalInts_19_[1] * anLocalInt_21_
				   + anLocalInt_20_ * anLocalInts[1]) >> 12;
			    anLocalInt_17_
				= (anLocalInt_21_ * anLocalInts_19_[3]
				   + anLocalInt_20_ * anLocalInts[3]) >> 12;
			}
		    }
		    anLocalInt_17_ >>= 4;
		    anLocalInt_16_ >>= 4;
		    anLocalInt_18_ >>= 4;
		    if (anLocalInt_17_ < 0)
			anLocalInt_17_ = 0;
		    else if (anLocalInt_17_ > 255)
			anLocalInt_17_ = 255;
		    if (anLocalInt_16_ < 0)
			anLocalInt_16_ = 0;
		    else if (anLocalInt_16_ > 255)
			anLocalInt_16_ = 255;
		    if (anLocalInt_18_ < 0)
			anLocalInt_18_ = 0;
		    else if (anLocalInt_18_ > 255)
			anLocalInt_18_ = 255;
		    anIntArray5933[anLocalInt_12_]
			= (MathStatics.OR
			   (MathStatics.OR(anLocalInt_18_ << 8, anLocalInt_16_ << 16), anLocalInt_17_));
		}
	    }
	}
    }
    
    final void method865(boolean argument_22_) {
	if (anIntArrayArray5932 == null)
	    method940(1, 20);
	if (argument_22_ == true)
	    method938(-65537);
    }

    private final void method940(int argument_38_, int argument_39_) {
	if (argument_39_ <= 0)
	    anIntArray5933 = null;
	if (argument_38_ != 0) {
	    int gradientPReset = argument_38_;
	while_149_:
	    do {
	    while_148_:
		do {
		while_147_:
		    do {
		    while_146_:
			do {
			    do {
				if (gradientPReset != 1) {
				    if (gradientPReset != 2) {
					if (gradientPReset != 3) {
					    if (gradientPReset != 4) {
						if (gradientPReset != 5) {
						    if (gradientPReset != 6)
							break while_149_;
						} else
						    break while_147_;
						break while_148_;
					    }
					} else
					    break;
					break while_146_;
				    }
				} else {
				    anIntArrayArray5932 = new int[2][4];
				    anIntArrayArray5932[0][1] = 0;
				    anIntArrayArray5932[0][3] = 0;
				    anIntArrayArray5932[0][2] = 0;
				    anIntArrayArray5932[0][0] = 0;
				    anIntArrayArray5932[1][2] = 4096;
				    anIntArrayArray5932[1][3] = 4096;
				    anIntArrayArray5932[1][0] = 4096;
				    anIntArrayArray5932[1][1] = 4096;
				    return;
				}
				anIntArrayArray5932 = new int[8][4];
				anIntArrayArray5932[0][3] = 2361;
				anIntArrayArray5932[0][0] = 0;
				anIntArrayArray5932[0][1] = 2650;
				anIntArrayArray5932[0][2] = 2602;
				anIntArrayArray5932[1][0] = 2867;
				anIntArrayArray5932[1][1] = 2313;
				anIntArrayArray5932[1][2] = 1799;
				anIntArrayArray5932[1][3] = 1558;
				anIntArrayArray5932[2][0] = 3072;
				anIntArrayArray5932[2][1] = 2618;
				anIntArrayArray5932[2][3] = 1413;
				anIntArrayArray5932[2][2] = 1734;
				anIntArrayArray5932[3][0] = 3276;
				anIntArrayArray5932[3][3] = 947;
				anIntArrayArray5932[3][2] = 1220;
				anIntArrayArray5932[3][1] = 2296;
				anIntArrayArray5932[4][3] = 722;
				anIntArrayArray5932[4][1] = 2072;
				anIntArrayArray5932[4][0] = 3481;
				anIntArrayArray5932[4][2] = 963;
				anIntArrayArray5932[5][1] = 2730;
				anIntArrayArray5932[5][3] = 1766;
				anIntArrayArray5932[5][2] = 2152;
				anIntArrayArray5932[5][0] = 3686;
				anIntArrayArray5932[6][2] = 1060;
				anIntArrayArray5932[6][3] = 915;
				anIntArrayArray5932[6][0] = 3891;
				anIntArrayArray5932[6][1] = 2232;
				anIntArrayArray5932[7][2] = 1413;
				anIntArrayArray5932[7][3] = 1140;
				anIntArrayArray5932[7][0] = 4096;
				anIntArrayArray5932[7][1] = 1686;
				return;
			    } while (false);
			    anIntArrayArray5932 = new int[7][4];
			    anIntArrayArray5932[0][0] = 0;
			    anIntArrayArray5932[0][2] = 0;
			    anIntArrayArray5932[0][3] = 4096;
			    anIntArrayArray5932[0][1] = 0;
			    anIntArrayArray5932[1][3] = 4096;
			    anIntArrayArray5932[1][1] = 0;
			    anIntArrayArray5932[1][2] = 4096;
			    anIntArrayArray5932[1][0] = 663;
			    anIntArrayArray5932[2][2] = 4096;
			    anIntArrayArray5932[2][3] = 0;
			    anIntArrayArray5932[2][0] = 1363;
			    anIntArrayArray5932[2][1] = 0;
			    anIntArrayArray5932[3][1] = 4096;
			    anIntArrayArray5932[3][0] = 2048;
			    anIntArrayArray5932[3][2] = 4096;
			    anIntArrayArray5932[3][3] = 0;
			    anIntArrayArray5932[4][3] = 0;
			    anIntArrayArray5932[4][2] = 0;
			    anIntArrayArray5932[4][0] = 2727;
			    anIntArrayArray5932[4][1] = 4096;
			    anIntArrayArray5932[5][1] = 4096;
			    anIntArrayArray5932[5][0] = 3411;
			    anIntArrayArray5932[5][3] = 4096;
			    anIntArrayArray5932[5][2] = 0;
			    anIntArrayArray5932[6][3] = 4096;
			    anIntArrayArray5932[6][0] = 4096;
			    anIntArrayArray5932[6][2] = 0;
			    anIntArrayArray5932[6][1] = 0;
			    return;
			} while (false);
			anIntArrayArray5932 = new int[6][4];
			anIntArrayArray5932[0][1] = 0;
			anIntArrayArray5932[0][3] = 0;
			anIntArrayArray5932[0][2] = 0;
			anIntArrayArray5932[0][0] = 0;
			anIntArrayArray5932[1][3] = 1493;
			anIntArrayArray5932[1][0] = 1843;
			anIntArrayArray5932[1][1] = 0;
			anIntArrayArray5932[1][2] = 0;
			anIntArrayArray5932[2][0] = 2457;
			anIntArrayArray5932[2][3] = 2939;
			anIntArrayArray5932[2][1] = 0;
			anIntArrayArray5932[2][2] = 0;
			anIntArrayArray5932[3][1] = 0;
			anIntArrayArray5932[3][0] = 2781;
			anIntArrayArray5932[3][3] = 3565;
			anIntArrayArray5932[3][2] = 1124;
			anIntArrayArray5932[4][0] = 3481;
			anIntArrayArray5932[4][2] = 3084;
			anIntArrayArray5932[4][3] = 4031;
			anIntArrayArray5932[4][1] = 546;
			anIntArrayArray5932[5][2] = 4096;
			anIntArrayArray5932[5][1] = 4096;
			anIntArrayArray5932[5][0] = 4096;
			anIntArrayArray5932[5][3] = 4096;
			return;
		    } while (false);
		    anIntArrayArray5932 = new int[16][4];
		    anIntArrayArray5932[0][3] = 321;
		    anIntArrayArray5932[0][1] = 80;
		    anIntArrayArray5932[0][0] = 0;
		    anIntArrayArray5932[0][2] = 192;
		    anIntArrayArray5932[1][3] = 562;
		    anIntArrayArray5932[1][2] = 449;
		    anIntArrayArray5932[1][0] = 155;
		    anIntArrayArray5932[1][1] = 321;
		    anIntArrayArray5932[2][3] = 803;
		    anIntArrayArray5932[2][2] = 690;
		    anIntArrayArray5932[2][1] = 578;
		    anIntArrayArray5932[2][0] = 389;
		    anIntArrayArray5932[3][1] = 947;
		    anIntArrayArray5932[3][2] = 995;
		    anIntArrayArray5932[3][3] = 1140;
		    anIntArrayArray5932[3][0] = 671;
		    anIntArrayArray5932[4][3] = 1509;
		    anIntArrayArray5932[4][2] = 1397;
		    anIntArrayArray5932[4][1] = 1285;
		    anIntArrayArray5932[4][0] = 897;
		    anIntArrayArray5932[5][3] = 1413;
		    anIntArrayArray5932[5][0] = 1175;
		    anIntArrayArray5932[5][2] = 1429;
		    anIntArrayArray5932[5][1] = 1525;
		    anIntArrayArray5932[6][0] = 1368;
		    anIntArrayArray5932[6][3] = 1333;
		    anIntArrayArray5932[6][2] = 1461;
		    anIntArrayArray5932[6][1] = 1734;
		    anIntArrayArray5932[7][1] = 1413;
		    anIntArrayArray5932[7][2] = 1525;
		    anIntArrayArray5932[7][0] = 1507;
		    anIntArrayArray5932[7][3] = 1702;
		    anIntArrayArray5932[8][3] = 2056;
		    anIntArrayArray5932[8][0] = 1736;
		    anIntArrayArray5932[8][1] = 1108;
		    anIntArrayArray5932[8][2] = 1590;
		    anIntArrayArray5932[9][3] = 2666;
		    anIntArrayArray5932[9][2] = 2056;
		    anIntArrayArray5932[9][1] = 1766;
		    anIntArrayArray5932[9][0] = 2088;
		    anIntArrayArray5932[10][1] = 2409;
		    anIntArrayArray5932[10][2] = 2586;
		    anIntArrayArray5932[10][0] = 2355;
		    anIntArrayArray5932[10][3] = 3276;
		    anIntArrayArray5932[11][0] = 2691;
		    anIntArrayArray5932[11][3] = 3228;
		    anIntArrayArray5932[11][1] = 3116;
		    anIntArrayArray5932[11][2] = 3148;
		    anIntArrayArray5932[12][3] = 3196;
		    anIntArrayArray5932[12][0] = 3031;
		    anIntArrayArray5932[12][2] = 3710;
		    anIntArrayArray5932[12][1] = 3806;
		    anIntArrayArray5932[13][1] = 3437;
		    anIntArrayArray5932[13][2] = 3421;
		    anIntArrayArray5932[13][3] = 3019;
		    anIntArrayArray5932[13][0] = 3522;
		    anIntArrayArray5932[14][2] = 3148;
		    anIntArrayArray5932[14][3] = 3228;
		    anIntArrayArray5932[14][1] = 3116;
		    anIntArrayArray5932[14][0] = 3727;
		    anIntArrayArray5932[15][2] = 2505;
		    anIntArrayArray5932[15][1] = 2377;
		    anIntArrayArray5932[15][3] = 2746;
		    anIntArrayArray5932[15][0] = 4096;
		    return;
		} while (false);
		anIntArrayArray5932 = new int[4][4];
		anIntArrayArray5932[0][1] = 0;
		anIntArrayArray5932[0][3] = 0;
		anIntArrayArray5932[0][0] = 2048;
		anIntArrayArray5932[0][2] = 4096;
		anIntArrayArray5932[1][2] = 4096;
		anIntArrayArray5932[1][1] = 4096;
		anIntArrayArray5932[1][0] = 2867;
		anIntArrayArray5932[1][3] = 0;
		anIntArrayArray5932[2][2] = 4096;
		anIntArrayArray5932[2][0] = 3276;
		anIntArrayArray5932[2][1] = 4096;
		anIntArrayArray5932[2][3] = 0;
		anIntArrayArray5932[3][3] = 0;
		anIntArrayArray5932[3][1] = 4096;
		anIntArrayArray5932[3][0] = 4096;
		anIntArrayArray5932[3][2] = 0;
		return;
	    } while (false);
	    throw new RuntimeException("Invalid gradient preset");
	}
    }
    
    static final void method941(int argument, int argument_40_) {
	Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[0]
			     [argument][argument_40_]);
	for (int anLocalInt = 0; anLocalInt < 3; anLocalInt++) {
	    Class148 class148_41_
		= (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[anLocalInt]
		       [argument][argument_40_]
		   = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
		      [anLocalInt + 1][argument][argument_40_]));
	    if (class148_41_ != null) {
		for (Class110 class110
			 = ((Class148) class148_41_).aClass110_1126;
		     class110 != null;
		     class110 = ((Class110) class110).aClass110_912) {
		    DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2
			= ((Class110) class110).aClass104_Sub2_Sub2_911;
		    if ((((DoublyLinkedNodeP2_Sub2_Sub2) class104_sub2_sub2).left
			 == argument)
			&& (((DoublyLinkedNodeP2_Sub2_Sub2) class104_sub2_sub2)
			    .bottom) == argument_40_)
			((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2).lightingHL--;
		}
		if (((Class148) class148_41_).aClass104_Sub2_Sub4_1134 != null)
		    ((DoublyLinkedNodeP2_Sub2) (((Class148) class148_41_)
				      .aClass104_Sub2_Sub4_1134)).lightingHL--;
		if (((Class148) class148_41_).aClass104_Sub2_Sub3_1124 != null)
		    ((DoublyLinkedNodeP2_Sub2) (((Class148) class148_41_)
				      .aClass104_Sub2_Sub3_1124)).lightingHL--;
		if (((Class148) class148_41_).aClass104_Sub2_Sub3_1123 != null)
		    ((DoublyLinkedNodeP2_Sub2) (((Class148) class148_41_)
				      .aClass104_Sub2_Sub3_1123)).lightingHL--;
		if (((Class148) class148_41_).aClass104_Sub2_Sub1_1131 != null)
		    ((DoublyLinkedNodeP2_Sub2) (((Class148) class148_41_)
				      .aClass104_Sub2_Sub1_1131)).lightingHL--;
		if (((Class148) class148_41_).aClass104_Sub2_Sub1_1128 != null)
		    ((DoublyLinkedNodeP2_Sub2) (((Class148) class148_41_)
				      .aClass104_Sub2_Sub1_1128)).lightingHL--;
	    }
	}
	if ((GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[0][argument]
	     [argument_40_])
	    == null) {
	    GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[0][argument]
		[argument_40_]
		= new Class148(0);
	    ((Class148) (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[0]
			 [argument][argument_40_])).aByte1129
		= (byte) 1;
	}
	((Class148) (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[0][argument]
		     [argument_40_])).aClass148_1135
	    = class148;
	GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[3][argument][argument_40_]
	    = null;
    }
    
    public Node_Sub31_Sub21() {
	super(1, false);
    }
    
    public static void method942(boolean argument) {
	aClass221_5931 = null;
    }
}
