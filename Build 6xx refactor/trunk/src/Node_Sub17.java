/* Class59_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub17 extends Node
{
    byte[] aByteArray4003;
    JagexHashMap aJagexHashMap_4004;
    
    final void method703() {
	((Node_Sub17) this).aJagexHashMap_4004 = null;
    }
    
    static final Node_Sub17 method704(Js5Store argument, int argument_0_,
					 int argument_1_) {
	byte[] anLocalInts = argument.getData(argument_0_, argument_1_);
	if (anLocalInts == null)
	    return null;
	return new Node_Sub17(new Packet(anLocalInts));
    }
    
    final void method705() {
	if (((Node_Sub17) this).aJagexHashMap_4004 == null) {
	    ((Node_Sub17) this).aJagexHashMap_4004 = new JagexHashMap(16);
	    int[] anLocalInts = new int[16];
	    int[] anLocalInts_2_ = new int[16];
	    anLocalInts[9] = anLocalInts_2_[9] = 128;
	    Class175 class175
		= new Class175(((Node_Sub17) this).aByteArray4003);
	    int anLocalInt = class175.method2773();
	    for (int anLocalInt_3_ = 0; anLocalInt_3_ < anLocalInt;
		 anLocalInt_3_++) {
		class175.method2779(anLocalInt_3_);
		class175.method2781(anLocalInt_3_);
		class175.method2776(anLocalInt_3_);
	    }
	while_107_:
	    for (;;) {
		int anLocalInt_4_ = class175.method2772();
		int anLocalInt_5_
		    = ((Class175) class175).anIntArray1300[anLocalInt_4_];
		while (((Class175) class175).anIntArray1300[anLocalInt_4_]
		       == anLocalInt_5_) {
		    class175.method2779(anLocalInt_4_);
		    int anLocalInt_6_ = class175.method2775(anLocalInt_4_);
		    if (anLocalInt_6_ == 1) {
			class175.method2780();
			class175.method2776(anLocalInt_4_);
			if (!class175.method2777())
			    break;
			break while_107_;
		    }
		    int anLocalInt_7_ = anLocalInt_6_ & 0xf0;
		    if (anLocalInt_7_ == 176) {
			int anLocalInt_8_ = anLocalInt_6_ & 0xf;
			int anLocalInt_9_ = anLocalInt_6_ >> 8 & 0x7f;
			int anLocalInt_10_ = anLocalInt_6_ >> 16 & 0x7f;
			if (anLocalInt_9_ == 0)
			    anLocalInts[anLocalInt_8_]
				= ((anLocalInts[anLocalInt_8_] & ~0x1fc000)
				   + (anLocalInt_10_ << 14));
			if (anLocalInt_9_ == 32)
			    anLocalInts[anLocalInt_8_]
				= ((anLocalInts[anLocalInt_8_] & ~0x3f80)
				   + (anLocalInt_10_ << 7));
		    }
		    if (anLocalInt_7_ == 192) {
			int anLocalInt_11_ = anLocalInt_6_ & 0xf;
			int anLocalInt_12_ = anLocalInt_6_ >> 8 & 0x7f;
			anLocalInts_2_[anLocalInt_11_]
			    = anLocalInts[anLocalInt_11_] + anLocalInt_12_;
		    }
		    if (anLocalInt_7_ == 144) {
			int anLocalInt_13_ = anLocalInt_6_ & 0xf;
			int anLocalInt_14_ = anLocalInt_6_ >> 8 & 0x7f;
			int anLocalInt_15_ = anLocalInt_6_ >> 16 & 0x7f;
			if (anLocalInt_15_ > 0) {
			    int anLocalInt_16_
				= anLocalInts_2_[anLocalInt_13_];
			    Node_Sub52 class59_sub52
				= ((Node_Sub52)
				   ((Node_Sub17) this).aJagexHashMap_4004
				       .get((long) anLocalInt_16_));
			    if (class59_sub52 == null) {
				class59_sub52
				    = new Node_Sub52(new byte[128]);
				((Node_Sub17) this).aJagexHashMap_4004.put((long) anLocalInt_16_, class59_sub52);
			    }
			    ((Node_Sub52) class59_sub52).aByteArray4346
				[anLocalInt_14_]
				= (byte) 1;
			}
		    }
		    class175.method2781(anLocalInt_4_);
		    class175.method2776(anLocalInt_4_);
		}
	    }
	}
    }
    
    private Node_Sub17(Packet argument_17_) {
	((Packet) argument_17_).pos
	    = ((Packet) argument_17_).data.length - 3;
	int anLocalInt = argument_17_.g1();
	int anLocalInt_18_ = argument_17_.g2();
	int anLocalInt_19_ = anLocalInt * 10 + 14;
	((Packet) argument_17_).pos = 0;
	int anLocalInt_20_ = 0;
	int anLocalInt_21_ = 0;
	int anLocalInt_22_ = 0;
	int anLocalInt_23_ = 0;
	int anLocalInt_24_ = 0;
	int anLocalInt_25_ = 0;
	int anLocalInt_26_ = 0;
	int anLocalInt_27_ = 0;
    while_105_:
	for (int anLocalInt_28_ = 0; anLocalInt_28_ < anLocalInt;
	     anLocalInt_28_++) {
	    int anLocalInt_29_ = -1;
	    for (;;) {
		int anLocalInt_30_ = argument_17_.g1();
		if (anLocalInt_30_ != anLocalInt_29_)
		    anLocalInt_19_++;
		anLocalInt_29_ = anLocalInt_30_ & 0xf;
		if (anLocalInt_30_ == 7)
		    continue while_105_;
		if (anLocalInt_30_ == 23)
		    anLocalInt_20_++;
		else if (anLocalInt_29_ == 0)
		    anLocalInt_22_++;
		else if (anLocalInt_29_ == 1)
		    anLocalInt_23_++;
		else if (anLocalInt_29_ == 2)
		    anLocalInt_21_++;
		else if (anLocalInt_29_ == 3)
		    anLocalInt_24_++;
		else if (anLocalInt_29_ == 4)
		    anLocalInt_25_++;
		else if (anLocalInt_29_ == 5)
		    anLocalInt_26_++;
		else {
		    if (anLocalInt_29_ != 6)
			break;
		    anLocalInt_27_++;
		}
	    }
	    throw new RuntimeException();
	}
	anLocalInt_19_ += anLocalInt_20_ * 5;
	anLocalInt_19_ += (anLocalInt_22_ + anLocalInt_23_ + anLocalInt_21_
			   + anLocalInt_24_ + anLocalInt_26_) * 2;
	anLocalInt_19_ += anLocalInt_25_ + anLocalInt_27_;
	int anLocalInt_31_ = ((Packet) argument_17_).pos;
	int anLocalInt_32_
	    = (anLocalInt + anLocalInt_20_ + anLocalInt_21_ + anLocalInt_22_
	       + anLocalInt_23_ + anLocalInt_24_ + anLocalInt_25_
	       + anLocalInt_26_ + anLocalInt_27_);
	for (int anLocalInt_33_ = 0; anLocalInt_33_ < anLocalInt_32_;
	     anLocalInt_33_++)
	    argument_17_.gMultiSomething();
	anLocalInt_19_
	    += ((Packet) argument_17_).pos - anLocalInt_31_;
	int anLocalInt_34_ = ((Packet) argument_17_).pos;
	int anLocalInt_35_ = 0;
	int anLocalInt_36_ = 0;
	int anLocalInt_37_ = 0;
	int anLocalInt_38_ = 0;
	int anLocalInt_39_ = 0;
	int anLocalInt_40_ = 0;
	int anLocalInt_41_ = 0;
	int anLocalInt_42_ = 0;
	int anLocalInt_43_ = 0;
	int anLocalInt_44_ = 0;
	int anLocalInt_45_ = 0;
	int anLocalInt_46_ = 0;
	int anLocalInt_47_ = 0;
	for (int anLocalInt_48_ = 0; anLocalInt_48_ < anLocalInt_21_;
	     anLocalInt_48_++) {
	    anLocalInt_47_
		= anLocalInt_47_ + argument_17_.g1() & 0x7f;
	    if (anLocalInt_47_ == 0 || anLocalInt_47_ == 32)
		anLocalInt_27_++;
	    else if (anLocalInt_47_ == 1)
		anLocalInt_35_++;
	    else if (anLocalInt_47_ == 33)
		anLocalInt_36_++;
	    else if (anLocalInt_47_ == 7)
		anLocalInt_37_++;
	    else if (anLocalInt_47_ == 39)
		anLocalInt_38_++;
	    else if (anLocalInt_47_ == 10)
		anLocalInt_39_++;
	    else if (anLocalInt_47_ == 42)
		anLocalInt_40_++;
	    else if (anLocalInt_47_ == 99)
		anLocalInt_41_++;
	    else if (anLocalInt_47_ == 98)
		anLocalInt_42_++;
	    else if (anLocalInt_47_ == 101)
		anLocalInt_43_++;
	    else if (anLocalInt_47_ == 100)
		anLocalInt_44_++;
	    else if (anLocalInt_47_ == 64 || anLocalInt_47_ == 65
		     || anLocalInt_47_ == 120 || anLocalInt_47_ == 121
		     || anLocalInt_47_ == 123)
		anLocalInt_45_++;
	    else
		anLocalInt_46_++;
	}
	int anLocalInt_49_ = 0;
	int anLocalInt_50_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_45_;
	int anLocalInt_51_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_26_;
	int anLocalInt_52_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_25_;
	int anLocalInt_53_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_24_;
	int anLocalInt_54_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_35_;
	int anLocalInt_55_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_37_;
	int anLocalInt_56_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_39_;
	int anLocalInt_57_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos
	    += anLocalInt_22_ + anLocalInt_23_ + anLocalInt_26_;
	int anLocalInt_58_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_22_;
	int anLocalInt_59_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_46_;
	int anLocalInt_60_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_23_;
	int anLocalInt_61_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_36_;
	int anLocalInt_62_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_38_;
	int anLocalInt_63_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_40_;
	int anLocalInt_64_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_27_;
	int anLocalInt_65_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_24_;
	int anLocalInt_66_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_41_;
	int anLocalInt_67_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_42_;
	int anLocalInt_68_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_43_;
	int anLocalInt_69_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_44_;
	int anLocalInt_70_ = ((Packet) argument_17_).pos;
	((Packet) argument_17_).pos += anLocalInt_20_ * 3;
	((Node_Sub17) this).aByteArray4003 = new byte[anLocalInt_19_];
	Packet class59_sub28
	    = new Packet(((Node_Sub17) this).aByteArray4003);
	class59_sub28.p4(1297377380);
	class59_sub28.p4(6);
	class59_sub28.p2(anLocalInt > 1 ? 1 : 0);
	class59_sub28.p2(anLocalInt);
	class59_sub28.p2(anLocalInt_18_);
	((Packet) argument_17_).pos = anLocalInt_31_;
	int anLocalInt_71_ = 0;
	int anLocalInt_72_ = 0;
	int anLocalInt_73_ = 0;
	int anLocalInt_74_ = 0;
	int anLocalInt_75_ = 0;
	int anLocalInt_76_ = 0;
	int anLocalInt_77_ = 0;
	int[] anLocalInts = new int[128];
	anLocalInt_47_ = 0;
	for (int anLocalInt_78_ = 0; anLocalInt_78_ < anLocalInt;
	     anLocalInt_78_++) {
	    class59_sub28.p4(1297379947);
	    ((Packet) class59_sub28).pos += 4;
	    int anLocalInt_79_ = ((Packet) class59_sub28).pos;
	    int anLocalInt_80_ = -1;
	while_106_:
	    do {
		for (;;) {
		    int anLocalInt_81_ = argument_17_.gMultiSomething();
		    class59_sub28.pMultiSomething(anLocalInt_81_, 127);
		    int anLocalInt_82_ = ((((Packet) argument_17_)
					   .data[anLocalInt_49_++])
					  & 0xff);
		    boolean anLocalBoolean = anLocalInt_82_ != anLocalInt_80_;
		    anLocalInt_80_ = anLocalInt_82_ & 0xf;
		    if (anLocalInt_82_ == 7) {
			if (anLocalBoolean)
			    class59_sub28.p1(255);
			class59_sub28.p1(47);
			class59_sub28.p1(0);
			break while_106_;
		    }
		    if (anLocalInt_82_ == 23) {
			if (anLocalBoolean)
			    class59_sub28.p1(255);
			class59_sub28.p1(81);
			class59_sub28.p1(3);
			class59_sub28.p1(
                    (((Packet) argument_17_)
                            .data
                            [anLocalInt_70_++]));
			class59_sub28.p1(
                    (((Packet) argument_17_)
                            .data
                            [anLocalInt_70_++]));
			class59_sub28.p1(
                    (((Packet) argument_17_)
                            .data
                            [anLocalInt_70_++]));
		    } else {
			anLocalInt_71_ ^= anLocalInt_82_ >> 4;
			if (anLocalInt_80_ == 0) {
			    if (anLocalBoolean)
				class59_sub28.p1(
                        anLocalInt_71_ + 144);
			    anLocalInt_72_
				+= (((Packet) argument_17_)
				    .data[anLocalInt_57_++]);
			    anLocalInt_73_
				+= (((Packet) argument_17_)
				    .data[anLocalInt_58_++]);
			    class59_sub28.p1(
                        anLocalInt_72_ & 0x7f);
			    class59_sub28.p1(
                        anLocalInt_73_ & 0x7f);
			} else if (anLocalInt_80_ == 1) {
			    if (anLocalBoolean)
				class59_sub28.p1(
                        anLocalInt_71_ + 128);
			    anLocalInt_72_
				+= (((Packet) argument_17_)
				    .data[anLocalInt_57_++]);
			    anLocalInt_74_
				+= (((Packet) argument_17_)
				    .data[anLocalInt_60_++]);
			    class59_sub28.p1(
                        anLocalInt_72_ & 0x7f);
			    class59_sub28.p1(
                        anLocalInt_74_ & 0x7f);
			} else if (anLocalInt_80_ == 2) {
			    if (anLocalBoolean)
				class59_sub28.p1(
                        anLocalInt_71_ + 176);
			    anLocalInt_47_ = (anLocalInt_47_
					      + (((Packet) argument_17_)
						 .data
						 [anLocalInt_34_++])) & 0x7f;
			    class59_sub28.p1(anLocalInt_47_);
			    int anLocalInt_83_;
			    if (anLocalInt_47_ == 0 || anLocalInt_47_ == 32)
				anLocalInt_83_
				    = (((Packet) argument_17_)
				       .data[anLocalInt_64_++]);
			    else if (anLocalInt_47_ == 1)
				anLocalInt_83_
				    = (((Packet) argument_17_)
				       .data[anLocalInt_54_++]);
			    else if (anLocalInt_47_ == 33)
				anLocalInt_83_
				    = (((Packet) argument_17_)
				       .data[anLocalInt_61_++]);
			    else if (anLocalInt_47_ == 7)
				anLocalInt_83_
				    = (((Packet) argument_17_)
				       .data[anLocalInt_55_++]);
			    else if (anLocalInt_47_ == 39)
				anLocalInt_83_
				    = (((Packet) argument_17_)
				       .data[anLocalInt_62_++]);
			    else if (anLocalInt_47_ == 10)
				anLocalInt_83_
				    = (((Packet) argument_17_)
				       .data[anLocalInt_56_++]);
			    else if (anLocalInt_47_ == 42)
				anLocalInt_83_
				    = (((Packet) argument_17_)
				       .data[anLocalInt_63_++]);
			    else if (anLocalInt_47_ == 99)
				anLocalInt_83_
				    = (((Packet) argument_17_)
				       .data[anLocalInt_66_++]);
			    else if (anLocalInt_47_ == 98)
				anLocalInt_83_
				    = (((Packet) argument_17_)
				       .data[anLocalInt_67_++]);
			    else if (anLocalInt_47_ == 101)
				anLocalInt_83_
				    = (((Packet) argument_17_)
				       .data[anLocalInt_68_++]);
			    else if (anLocalInt_47_ == 100)
				anLocalInt_83_
				    = (((Packet) argument_17_)
				       .data[anLocalInt_69_++]);
			    else if (anLocalInt_47_ == 64
				     || anLocalInt_47_ == 65
				     || anLocalInt_47_ == 120
				     || anLocalInt_47_ == 121
				     || anLocalInt_47_ == 123)
				anLocalInt_83_
				    = (((Packet) argument_17_)
				       .data[anLocalInt_50_++]);
			    else
				anLocalInt_83_
				    = (((Packet) argument_17_)
				       .data[anLocalInt_59_++]);
			    anLocalInt_83_ += anLocalInts[anLocalInt_47_];
			    anLocalInts[anLocalInt_47_] = anLocalInt_83_;
			    class59_sub28.p1(
                        anLocalInt_83_ & 0x7f);
			} else if (anLocalInt_80_ == 3) {
			    if (anLocalBoolean)
				class59_sub28.p1(
                        anLocalInt_71_ + 224);
			    anLocalInt_75_
				+= (((Packet) argument_17_)
				    .data[anLocalInt_65_++]);
			    anLocalInt_75_
				+= (((Packet) argument_17_)
				    .data[anLocalInt_53_++]) << 7;
			    class59_sub28.p1(
                        anLocalInt_75_ & 0x7f);
			    class59_sub28
				.p1(anLocalInt_75_ >> 7 & 0x7f);
			} else if (anLocalInt_80_ == 4) {
			    if (anLocalBoolean)
				class59_sub28.p1(
                        anLocalInt_71_ + 208);
			    anLocalInt_76_
				+= (((Packet) argument_17_)
				    .data[anLocalInt_52_++]);
			    class59_sub28.p1(
                        anLocalInt_76_ & 0x7f);
			} else if (anLocalInt_80_ == 5) {
			    if (anLocalBoolean)
				class59_sub28.p1(
                        anLocalInt_71_ + 160);
			    anLocalInt_72_
				+= (((Packet) argument_17_)
				    .data[anLocalInt_57_++]);
			    anLocalInt_77_
				+= (((Packet) argument_17_)
				    .data[anLocalInt_51_++]);
			    class59_sub28.p1(
                        anLocalInt_72_ & 0x7f);
			    class59_sub28.p1(
                        anLocalInt_77_ & 0x7f);
			} else {
			    if (anLocalInt_80_ != 6)
				break;
			    if (anLocalBoolean)
				class59_sub28.p1(
                        anLocalInt_71_ + 192);
			    class59_sub28.p1(
                        (((Packet)
                                argument_17_)
                                .data
                                [anLocalInt_64_++]));
			}
		    }
		}
		throw new RuntimeException();
	    } while (false);
	    class59_sub28.psize4((((Packet) class59_sub28).pos
                - anLocalInt_79_)
        );
	}
    }
}
