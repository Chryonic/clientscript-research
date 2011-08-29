/* Class59_Sub31_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class Node_Sub31_Sub32 extends Node_Sub31
{
    private int[] anIntArray5997;
    private int anInt5998 = 0;
    private short[] aShortArray5999 = new short[257];
    static BigInteger aBigInteger6000
	= (new BigInteger
	   ("c1007f013d1a958876a3c66e838e9843469d41646ba10112ab6a280bab25374f9d72b994183a7996d5e2c3ec645c265eb522881a9f6b6d223637643fb474870d",
	    16));
    private int[][] markers;
    private int[] anIntArray6002;

    final int[] method867(byte argument_1_, int argument_2_) {
	if (argument_1_ < 21)
	    method974(null, -123);
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_2_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int[] anLocalInts_3_ = this.method864(argument_2_, 0, (byte) 33);
	    for (int anLocalInt = 0; Statics.anInt294 > anLocalInt;
		 anLocalInt++) {
		int anLocalInt_4_ = anLocalInts_3_[anLocalInt] >> 4;
		if (anLocalInt_4_ < 0)
		    anLocalInt_4_ = 0;
		if (anLocalInt_4_ > 256)
		    anLocalInt_4_ = 256;
		anLocalInts[anLocalInt] = aShortArray5999[anLocalInt_4_];
	    }
	}
	return anLocalInts;
    }
    
    final void method865(boolean argument_5_) {
	if (markers == null)
	    markers = new int[][] { new int[2], { 4096, 4096 } };
	if (markers.length < 2)
	    throw new RuntimeException
		      ("Curve operation requires at least two markers");
	if (anInt5998 == 2)
	    method973((byte) 76);
	Class344.method3799(argument_5_);
	method978((byte) -81);
    }
    
    private final void method973(byte argument_6_) {
	int[] anLocalInts = markers[0];
	int[] anLocalInts_7_ = markers[1];
	int[] anLocalInts_8_
	    = markers[markers.length - 2];
	int[] anLocalInts_9_
	    = markers[markers.length - 1];
	anIntArray5997
	    = new int[] { anLocalInts[0] + anLocalInts[0] - anLocalInts_7_[0],
			  anLocalInts[1] - (-anLocalInts[1]
					    + anLocalInts_7_[1]) };
	anIntArray6002
	    = (new int[]
	       { anLocalInts_8_[0] + (-anLocalInts_9_[0] + anLocalInts_8_[0]),
		 anLocalInts_8_[1] + anLocalInts_8_[1] - anLocalInts_9_[1] });
	if (argument_6_ <= 27)
	    aShortArray5999 = null;
    }
    
    static final void method974(Js5Store argument, int argument_10_) {
	Class8.anInt81 = argument.getID("hitmarks");
	Class62_Sub14.anInt4412 = argument.getID("hitbar_default");
	Class268.anInt2139 = argument.getID("timerbar_default");
	Class96.anInt749 = argument.getID("headicons_pk");
	Node_Sub31_Sub19.anInt5928
	    = argument.getID("headicons_prayer");
	Class151.anInt1143 = argument.getID("hint_headicons");
	Statics.anInt1983 = argument.getID("hint_mapmarkers");
	Class234.anInt1715 = argument.getID("mapflag");
	Node_Sub47.anInt4285 = argument.getID("cross");
	Class16.anInt122 = argument.getID("mapdots");
	Class62_Sub19.anInt4425 = argument.getID("scrollbar");
	Node_Sub37_Sub3.anInt6126 = argument.getID("name_icons");
	Class374.anInt3207 = argument.getID("floorshadows");
	Class62_Sub17.anInt4420 = argument.getID("compass");
	Node_Sub47_Sub10.anInt6205
	    = argument.getID("otherlevel");
	Class390.anInt3286 = argument.getID("hint_mapedge");
    }
    
    public static void method975(byte argument) {
	aBigInteger6000 = null;
    }
    
    final void method868(Packet argument_11_, int argument_12_,
			 byte argument_13_) {
	if (argument_12_ == 0) {
	    anInt5998 = argument_11_.g1();
	    markers
		= new int[argument_11_.g1()][2];
	    for (int anLocalInt = 0; anLocalInt < markers.length;
		 anLocalInt++) {
		markers[anLocalInt][0]
		    = argument_11_.g2();
		markers[anLocalInt][1]
		    = argument_11_.g2();
	    }
	}
	if (argument_13_ >= -41)
	    anInt5998 = 121;
    }
    
    static final int method976(int argument) {
	synchronized (Node_Sub38.aClass149_4190) {
	    if (argument != 30245)
		return 3;
	    return Node_Sub38.aClass149_4190.method2539(argument ^ 0x7625);
	}
    }

    private final void method978(byte argument_20_) {
	int anLocalInt = anInt5998;
    while_166_:
	do {
	    do {
		if (anLocalInt != 2) {
		    if (anLocalInt != 1)
			break;
		} else {
		    for (anLocalInt = 0; anLocalInt < 257; anLocalInt++) {
			int anLocalInt_21_ = anLocalInt << 4;
			int anLocalInt_22_;
			for (anLocalInt_22_ = 1;
			     anLocalInt_22_ < markers.length - 1;
			     anLocalInt_22_++) {
			    if (markers[anLocalInt_22_][0]
				> anLocalInt_21_)
				break;
			}
			int[] anLocalInts
			    = markers[anLocalInt_22_ - 1];
			int[] anLocalInts_23_
			    = markers[anLocalInt_22_];
			int anLocalInt_24_
			    = (method979
			       (anLocalInt_22_ - 2, argument_20_ ^ 0x50)[1]);
			int anLocalInt_25_ = anLocalInts[1];
			int anLocalInt_26_ = anLocalInts_23_[1];
			int anLocalInt_27_
			    = (method979(anLocalInt_22_ + 1, argument_20_ + 80)
			       [1]);
			int anLocalInt_28_
			    = ((anLocalInt_21_ - anLocalInts[0] << 12)
			       / (anLocalInts_23_[0] - anLocalInts[0]));
			int anLocalInt_29_
			    = anLocalInt_28_ * anLocalInt_28_ >> 12;
			int anLocalInt_30_
			    = (anLocalInt_25_
			       + (-anLocalInt_24_
				  + (-anLocalInt_26_ + anLocalInt_27_)));
			int anLocalInt_31_
			    = (-anLocalInt_25_
			       + (anLocalInt_24_ - anLocalInt_30_));
			int anLocalInt_32_ = -anLocalInt_24_ + anLocalInt_26_;
			int anLocalInt_33_ = anLocalInt_25_;
			int anLocalInt_34_
			    = anLocalInt_29_ * (anLocalInt_28_ * anLocalInt_30_
						>> 12) >> 12;
			int anLocalInt_35_
			    = anLocalInt_31_ * anLocalInt_29_ >> 12;
			int anLocalInt_36_
			    = anLocalInt_32_ * anLocalInt_28_ >> 12;
			int anLocalInt_37_
			    = (anLocalInt_35_ + anLocalInt_34_
			       + (anLocalInt_36_ + anLocalInt_33_));
			if (anLocalInt_37_ <= -32768)
			    anLocalInt_37_ = -32767;
			if (anLocalInt_37_ >= 32768)
			    anLocalInt_37_ = 32767;
			aShortArray5999[anLocalInt] = (short) anLocalInt_37_;
		    }
		    break while_166_;
		}
		for (anLocalInt = 0; anLocalInt < 257; anLocalInt++) {
		    int anLocalInt_38_ = anLocalInt << 4;
		    int anLocalInt_39_;
		    for (anLocalInt_39_ = 1;
			 anLocalInt_39_ < markers.length - 1;
			 anLocalInt_39_++) {
			if (markers[anLocalInt_39_][0]
			    > anLocalInt_38_)
			    break;
		    }
		    int[] anLocalInts
			= markers[anLocalInt_39_ - 1];
		    int[] anLocalInts_40_
			= markers[anLocalInt_39_];
		    int anLocalInt_41_
			= ((-anLocalInts[0] + anLocalInt_38_ << 12)
			   / (-anLocalInts[0] + anLocalInts_40_[0]));
		    int anLocalInt_42_
			= (-(Class62_Sub7.anIntArray4392
			     [(anLocalInt_41_ & 0x1ff9) >> 5]) + 4096
			   >> 1);
		    int anLocalInt_43_ = -anLocalInt_42_ + 4096;
		    int anLocalInt_44_ = ((anLocalInts_40_[1] * anLocalInt_42_
					   + anLocalInts[1] * anLocalInt_43_)
					  >> 12);
		    if (anLocalInt_44_ <= -32768)
			anLocalInt_44_ = -32767;
		    if (anLocalInt_44_ >= 32768)
			anLocalInt_44_ = 32767;
		    aShortArray5999[anLocalInt] = (short) anLocalInt_44_;
		}
		break while_166_;
	    } while (false);
	    for (anLocalInt = 0; anLocalInt < 257; anLocalInt++) {
		int anLocalInt_45_ = anLocalInt << 4;
		int anLocalInt_46_;
		for (anLocalInt_46_ = 1;
		     anLocalInt_46_ < markers.length - 1;
		     anLocalInt_46_++) {
		    if (anLocalInt_45_
			< markers[anLocalInt_46_][0])
			break;
		}
		int[] anLocalInts = markers[anLocalInt_46_ - 1];
		int[] anLocalInts_47_ = markers[anLocalInt_46_];
		int anLocalInt_48_
		    = ((-anLocalInts[0] + anLocalInt_45_ << 12)
		       / (-anLocalInts[0] + anLocalInts_47_[0]));
		int anLocalInt_49_ = -anLocalInt_48_ + 4096;
		int anLocalInt_50_ = ((anLocalInt_48_ * anLocalInts_47_[1]
				       + anLocalInt_49_ * anLocalInts[1])
				      >> 12);
		if (anLocalInt_50_ <= -32768)
		    anLocalInt_50_ = -32767;
		if (anLocalInt_50_ >= 32768)
		    anLocalInt_50_ = 32767;
		aShortArray5999[anLocalInt] = (short) anLocalInt_50_;
	    }
	} while (false);
	if (argument_20_ != -81)
	    anIntArray6002 = null;
    }
    
    public Node_Sub31_Sub32() {
	super(1, true);
    }
    
    private final int[] method979(int argument_51_, int argument_52_) {
	if (argument_52_ < (argument_51_ ^ 0xffffffff))
	    return anIntArray5997;
	if (argument_51_ >= markers.length)
	    return anIntArray6002;
	return markers[argument_51_];
    }
}
