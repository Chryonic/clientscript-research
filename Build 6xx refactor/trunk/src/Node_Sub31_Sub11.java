/* Class59_Sub31_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub11 extends Node_Sub31
{
    private int anInt5884;
    private int anInt5885 = 0;
    private int anInt5886;
    private int anInt5887;
    private int anInt5888;
    static int[] anIntArray5889;
    private int anInt5890;
    private int anInt5891 = 0;
    private int anInt5892 = 0;
    private int anInt5893;
    
    public Node_Sub31_Sub11() {
	super(1, false);
    }
    
    static final void method903(int argument, int argument_0_) {
	Node_Sub23 class59_sub23
	    = ((Node_Sub23)
	       Node_Sub37_Sub1.aJagexHashMap_6114.get((long) argument_0_));
	if (class59_sub23 != null) {
	    ((Node_Sub23) class59_sub23).aBoolean4055
		= !((Node_Sub23) class59_sub23).aBoolean4055;
	    ((Node_Sub23) class59_sub23).aClass109_Sub1_4050
		.method1969(((Node_Sub23) class59_sub23).aBoolean4055, -90);
	}
    }
    
    static final void method904(byte argument, int argument_1_,
				int argument_2_, int argument_3_,
				int argument_4_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(8, 13175, (long) argument_2_);
	class59_sub51_sub3.method1182(-98);
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6233 = argument_4_;
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6234 = argument_3_;
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231 = argument_1_;
    }
    
    final int[][] method870(int argument_5_, byte argument_6_) {
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 60,
							       argument_5_);
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int[][] anLocalInts_7_ = this.method869(0, 1, argument_5_);
	    int[] anLocalInts_8_ = anLocalInts_7_[0];
	    int[] anLocalInts_9_ = anLocalInts_7_[1];
	    int[] anLocalInts_10_ = anLocalInts_7_[2];
	    int[] anLocalInts_11_ = anLocalInts[0];
	    int[] anLocalInts_12_ = anLocalInts[1];
	    int[] anLocalInts_13_ = anLocalInts[2];
	    for (int anLocalInt = 0; Statics.anInt294 > anLocalInt;
		 anLocalInt++) {
		method911(anLocalInts_10_[anLocalInt],
			  anLocalInts_8_[anLocalInt],
			  anLocalInts_9_[anLocalInt], true);
		anInt5884 += anInt5892;
		anInt5893 += anInt5891;
		anInt5890 += anInt5885;
		for (/**/; anInt5884 < 0; anInt5884 += 4096) {
		    /* empty */
		}
		if (anInt5893 < 0)
		    anInt5893 = 0;
		for (/**/; anInt5884 > 4096; anInt5884 -= 4096) {
		    /* empty */
		}
		if (anInt5890 < 0)
		    anInt5890 = 0;
		if (anInt5893 > 4096)
		    anInt5893 = 4096;
		if (anInt5890 > 4096)
		    anInt5890 = 4096;
		method908(anInt5884, anInt5893, (byte) 119, anInt5890);
		anLocalInts_11_[anLocalInt] = anInt5886;
		anLocalInts_12_[anLocalInt] = anInt5888;
		anLocalInts_13_[anLocalInt] = anInt5887;
	    }
	}
	if (argument_6_ != -9)
	    return null;
	return anLocalInts;
    }
    
    static final void method905(String argument, int argument_14_) {
	if (!argument.equals("")) {
	    Class62_Sub28.anInt4458++;
	    Node_Sub29 class59_sub29
		= Class91.method1683((byte) 61,
				     Node_Sub31_Sub16.aClass372_5910,
				     Class107.aClass207_872);
	    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		.p1(JagexStringUtils.strlenp1(argument, (byte) 88));
	    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		.pjstr(argument);
	    Class251.method3243(class59_sub29, true);
	}
    }
    
    public static void method906(byte argument) {
	anIntArray5889 = null;
    }
    
    static final boolean decompressHardcodedGzip() {
	try {
	    GzipInflater gzipInflater = new GzipInflater();
	    byte[] anLocalInts = gzipInflater.decompress(HardCoding.aByteArray6017);
	    DoublyLinkedNode_Sub51_Sub10.method1245(anLocalInts);
	    return true;
	} catch (Exception exception) {
	    return false;
	}
    }
    
    private final void method908(int argument_15_, int argument_16_,
				 byte argument_17_, int argument_18_) {
	if (argument_17_ < 71)
	    method905(null, -48);
	int anLocalInt = (argument_18_ <= 2048
			  ? argument_18_ * (argument_16_ + 4096) >> 12
			  : (-(argument_18_ * argument_16_ >> 12)
			     + argument_18_ + argument_16_));
    while_136_:
	do {
	    if (anLocalInt > 0) {
		argument_15_ *= 6;
		int anLocalInt_19_ = -anLocalInt + argument_18_ + argument_18_;
		int anLocalInt_20_
		    = (-anLocalInt_19_ + anLocalInt << 12) / anLocalInt;
		int anLocalInt_21_ = argument_15_ >> 12;
		int anLocalInt_22_ = -(anLocalInt_21_ << 12) + argument_15_;
		int anLocalInt_23_ = anLocalInt;
		anLocalInt_23_ = anLocalInt_20_ * anLocalInt_23_ >> 12;
		anLocalInt_23_ = anLocalInt_23_ * anLocalInt_22_ >> 12;
		int anLocalInt_24_ = anLocalInt_23_ + anLocalInt_19_;
		int anLocalInt_25_ = anLocalInt - anLocalInt_23_;
		int anLocalInt_26_ = anLocalInt_21_;
	    while_135_:
		do {
		while_134_:
		    do {
		    while_133_:
			do {
			    do {
				if (anLocalInt_26_ != 0) {
				    if (anLocalInt_26_ != 1) {
					if (anLocalInt_26_ != 2) {
					    if (anLocalInt_26_ != 3) {
						if (anLocalInt_26_ != 4) {
						    if (anLocalInt_26_ != 5)
							break while_136_;
						} else
						    break while_134_;
						break while_135_;
					    }
					} else
					    break;
					break while_133_;
				    }
				} else {
				    anInt5887 = anLocalInt_19_;
				    anInt5888 = anLocalInt_24_;
				    anInt5886 = anLocalInt;
				    return;
				}
				anInt5888 = anLocalInt;
				anInt5886 = anLocalInt_25_;
				anInt5887 = anLocalInt_19_;
				return;
			    } while (false);
			    anInt5886 = anLocalInt_19_;
			    anInt5887 = anLocalInt_24_;
			    anInt5888 = anLocalInt;
			    return;
			} while (false);
			anInt5888 = anLocalInt_25_;
			anInt5887 = anLocalInt;
			anInt5886 = anLocalInt_19_;
			return;
		    } while (false);
		    anInt5887 = anLocalInt;
		    anInt5888 = anLocalInt_19_;
		    anInt5886 = anLocalInt_24_;
		    return;
		} while (false);
		anInt5887 = anLocalInt_25_;
		anInt5888 = anLocalInt_19_;
		anInt5886 = anLocalInt;
		break;
	    }
	    anInt5886 = anInt5888 = anInt5887 = argument_18_;
	} while (false);
    }
    
    static final void method909(int argument) {
	Class251.aClass149_1974.method2540(30);
    }
    
    final void method868(Packet argument_27_, int argument_28_,
			 byte argument_29_) {
	int anLocalInt = argument_28_;
    while_137_:
	do {
	    do {
		if (anLocalInt != 0) {
		    if (anLocalInt != 1) {
			if (anLocalInt == 2)
			    break;
			break while_137_;
		    }
		} else {
		    anInt5892 = argument_27_.g2s();
		    break while_137_;
		}
		anInt5891 = (argument_27_.g1s() << 12) / 100;
		break while_137_;
	    } while (false);
	    anInt5885 = (argument_27_.g1s() << 12) / 100;
	} while (false);
	if (argument_29_ >= -41)
	    anInt5886 = 74;
    }
    
    static final Node_Sub29 method910(int argument) {
	if (Statics.anInt2001 == 0)
	    return new Node_Sub29();
	return (Node_Sub31_Sub30.aClass59_Sub29Array5988
		[--Statics.anInt2001]);
    }
    
    private final void method911(int argument_30_, int argument_31_,
				 int argument_32_, boolean argument_33_) {
	int anLocalInt
	    = argument_32_ >= argument_31_ ? argument_32_ : argument_31_;
	if (argument_33_ != true)
	    method904((byte) -114, -105, 3, 112, 29);
	int anLocalInt_34_
	    = argument_32_ <= argument_31_ ? argument_32_ : argument_31_;
	anLocalInt = argument_30_ > anLocalInt ? argument_30_ : anLocalInt;
	anLocalInt_34_
	    = anLocalInt_34_ > argument_30_ ? argument_30_ : anLocalInt_34_;
	int anLocalInt_35_ = -anLocalInt_34_ + anLocalInt;
	anInt5890 = (anLocalInt_34_ + anLocalInt) / 2;
	if (anLocalInt_35_ <= 0)
	    anInt5884 = 0;
	else {
	    int anLocalInt_36_
		= (anLocalInt - argument_31_ << 12) / anLocalInt_35_;
	    int anLocalInt_37_
		= (anLocalInt - argument_32_ << 12) / anLocalInt_35_;
	    int anLocalInt_38_
		= (anLocalInt - argument_30_ << 12) / anLocalInt_35_;
	    if (anLocalInt != argument_31_) {
		if (argument_32_ != anLocalInt)
		    anInt5884
			= (anLocalInt_34_ == argument_31_
			   ? anLocalInt_37_ + 12288 : -anLocalInt_36_ + 20480);
		else
		    anInt5884
			= (argument_30_ == anLocalInt_34_
			   ? anLocalInt_36_ + 4096 : -anLocalInt_38_ + 12288);
	    } else
		anInt5884 = (anLocalInt_34_ != argument_32_
			     ? 4096 - anLocalInt_37_ : anLocalInt_38_ + 20480);
	    anInt5884 /= 6;
	}
	if (anInt5890 > 0 && anInt5890 < 4096)
	    anInt5893
		= (anLocalInt_35_ << 12) / (anInt5890 <= 2048 ? anInt5890 * 2
					    : -(anInt5890 * 2) + 8192);
	else
	    anInt5893 = 0;
    }
}
