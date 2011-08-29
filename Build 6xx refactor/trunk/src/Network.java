import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 8/2/11
 * Time: 2:57 PM
 * To change this template use File | Ssettings | File Templates.
 */
public class Network {
    static Node_Sub28_Sub1 stream
	= new Node_Sub28_Sub1(15000);
    static int anInt4454 = 0;

    static final boolean method4043(int argument) throws IOException {
	if (Statics.aClass307_2632 == null)
	    return false;
	if (Class93.aClass166_714 == null) {
	    if (Statics.aBoolean3522) {
		if (!Statics.aClass307_2632.method3603(1, 55))
		    return false;
		Statics.aClass307_2632.method3606
		    (-109, 1,
		     (((Packet) stream)
		      .data),
		     0);
		Node_Sub31_Sub24.anInt5949 = 0;
		Class353_Sub7.anInt5511++;
		Statics.aBoolean3522 = false;
	    }
	    ((Packet) stream).pos = 0;
	    if (stream.method842(61)) {
		if (!Statics.aClass307_2632.method3603(1, 55))
		    return false;
		Statics.aClass307_2632.method3606
		    (-70, 1,
		     (((Packet) stream)
		      .data),
		     1);
		Class353_Sub7.anInt5511++;
		Node_Sub31_Sub24.anInt5949 = 0;
	    }
	    Statics.aBoolean3522 = true;
	    Class166[] class166s = Statics.method1146(-32);
	    int anLocalInt
		= stream.method844(argument ^ 0x75);
	    if (anLocalInt < 0 || anLocalInt >= class166s.length)
		throw new IOException("invo:" + anLocalInt + " ip:"
				      + (((Packet) stream)
					 .pos));
	    Class93.aClass166_714 = class166s[anLocalInt];
	    anInt4454
		= ((Class166) Class93.aClass166_714).anInt1212;
	}
	if (anInt4454 == -1) {
	    if (!Statics.aClass307_2632.method3603(1, 55))
		return false;
	    Statics.aClass307_2632.method3606(-72, 1,
					       (((Packet)
						 (stream))
						.data),
					       0);
	    Node_Sub31_Sub24.anInt5949 = 0;
	    Class353_Sub7.anInt5511++;
	    anInt4454
		= (((Packet) stream)
		   .data[0]) & 0xff;
	}
	if (anInt4454 == -2) {
	    if (!Statics.aClass307_2632.method3603(2, 55))
		return false;
	    Statics.aClass307_2632.method3606(argument ^ 0x4e, 2,
					       (((Packet)
						 (stream))
						.data),
					       0);
	    ((Packet) stream).pos = 0;
	    anInt4454
		= stream.g2();
	    Class353_Sub7.anInt5511 += 2;
	    Node_Sub31_Sub24.anInt5949 = 0;
	}
	if (anInt4454 > 0) {
	    if (!Statics.aClass307_2632.method3603(anInt4454,
						    55))
		return false;
	    ((Packet) stream).pos = 0;
	    Statics.aClass307_2632.method3606(124, anInt4454,
					       (((Packet)
						 (stream))
						.data),
					       0);
	    Class353_Sub7.anInt5511 += anInt4454;
	    Node_Sub31_Sub24.anInt5949 = 0;
	}
	Class62_Sub16.aClass166_4418 = Class190.aClass166_1396;
	Class190.aClass166_1396 = Class366.aClass166_3086;
	Class366.aClass166_3086 = Class93.aClass166_714;
	if (Class93.aClass166_714 == Class315.aClass166_2609) {
	    Node_Sub31_Sub37.anInt6032
		= (stream.g1ns()
		   << 3);
	    Class208.anInt1494
		= stream.p1m128() << 3;
	    Class379.anInt3227
		= stream.g1n();
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class316.aClass166_2614 == Class93.aClass166_714) {
	    int anLocalInt = stream.g2ip128();
	    int anLocalInt_0_
		= stream.g4m();
	    Class283.method3451((byte) -124);
	    Class178.method2797(anLocalInt_0_, -106, anLocalInt);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Node_Sub7.aClass166_3914) {
	    Statics.anInt5603 = Class359.anInt3038;
	    boolean anLocalBoolean
		= stream.g1() == 1;
	    ClanChannelDelta clanChannelDelta = new ClanChannelDelta(stream);
	    ClanChannel class59_sub53;
	    if (anLocalBoolean)
		class59_sub53 = AbstractFont.aClass59_Sub53_420;
	    else
		class59_sub53 = GameEnum.aClass59_Sub53_825;
	    clanChannelDelta.applyToClanChannel(class59_sub53);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class115.aClass166_950 == Class93.aClass166_714) {
	    Class232.method3094(tia_sub_35DoublyLinked.aClass329_6252, 120);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Statics.aClass166_580) {
	    int anLocalInt
		= stream.g1();
	    boolean anLocalBoolean = (anLocalInt & 0x1) == 1;
	    String string
		= stream.gstr();
	    String string_1_
		= stream.gstr();
	    if (string_1_.equals(""))
		string_1_ = string;
	    String string_2_
		= stream.gstr();
	    String string_3_
		= stream.gstr();
	    if (string_3_.equals(""))
		string_3_ = string_2_;
	    if (!anLocalBoolean) {
		Class76.aStringArray515[Class60.anInt436] = string;
		DoublyLinkedNode_Sub51_Sub19_Sub1.aStringArray6676[Class60.anInt436]
		    = string_1_;
		DoublyLinkedNodeP2_Sub4.aStringArray4528[Class60.anInt436] = string_2_;
		Class18.aStringArray126[Class60.anInt436] = string_3_;
		Node_Sub6.aBooleanArray3907[Class60.anInt436]
		    = MathStatics.AND(2, anLocalInt) == 2;
		Class60.anInt436++;
	    } else {
		for (int anLocalInt_4_ = 0; Class60.anInt436 > anLocalInt_4_;
		     anLocalInt_4_++) {
		    if (DoublyLinkedNode_Sub51_Sub19_Sub1.aStringArray6676
			    [anLocalInt_4_].equals(string_3_)) {
			Class76.aStringArray515[anLocalInt_4_] = string;
			DoublyLinkedNode_Sub51_Sub19_Sub1.aStringArray6676
			    [anLocalInt_4_]
			    = string_1_;
			DoublyLinkedNodeP2_Sub4.aStringArray4528[anLocalInt_4_]
			    = string_2_;
			Class18.aStringArray126[anLocalInt_4_] = string_3_;
			break;
		    }
		}
	    }
	    Class93.aClass166_714 = null;
	    Class45.anInt316 = Class359.anInt3038;
	    return true;
	}
	if (Class93.aClass166_714 == Cs2CallStackEntry.aClass166_508) {
	    Class114.anInt949 = Class359.anInt3038;
	    boolean anLocalBoolean
		= stream.g1() == 1;
	    ClanSettingsDelta clanSettingsDelta = new ClanSettingsDelta(stream);
	    ClanSettings clanSettings;
	    if (!anLocalBoolean)
		clanSettings = Node_Sub31_Sub13.aClanSettings_5899;
	    else
		clanSettings = Node_Sub32.aClanSettings_4143;
	    clanSettingsDelta.applyToClanSettings(clanSettings);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class289.aClass166_2306) {
	    int anLocalInt
		= stream.g4i_dupl();
	    int anLocalInt_5_
		= stream.g2sp128();
	    Class283.method3451((byte) -115);
	    Class46_Sub1.method437(anLocalInt, -17453, anLocalInt_5_);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class35.aClass166_261 == Class93.aClass166_714) {
	    int anLocalInt = stream.g2m128();
	    int anLocalInt_6_ = stream
				    .g1();
	    int anLocalInt_7_
		= stream.g1n();
	    int anLocalInt_8_
		= stream.g1p128();
	    int anLocalInt_9_
		= stream.g1n();
	    Class283.method3451((byte) -66);
	    Class291.aBooleanArray2366[anLocalInt_9_] = true;
	    Class321.anIntArray2637[anLocalInt_9_] = anLocalInt_6_;
	    Class259.anIntArray2016[anLocalInt_9_] = anLocalInt_8_;
	    Statics.anIntArray5574[anLocalInt_9_] = anLocalInt_7_;
	    Statics.anIntArray583[anLocalInt_9_] = anLocalInt;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class308.aClass166_2585 == Class93.aClass166_714) {
	    Class93.aClass166_714 = null;
	    return false;
	}
	if (Class93.aClass166_714 == Statics.aClass166_6237) {
	    int anLocalInt
		= stream.g2i();
	    Class283.method3451((byte) -44);
	    Node_Sub31_Sub11.method903(102, anLocalInt);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class62_Sub2.aClass166_4368 == Class93.aClass166_714) {
	    Class307_Sub1.aClass306_5412
		= DoublyLinkedNode_Sub51_Sub18.method1291(stream.g1(), -123);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class62_Sub29.aClass166_4466) {
	    int anLocalInt
		= stream.g2m128();
	    int anLocalInt_10_
		= stream.g4m();
	    Class283.method3451((byte) -74);
	    Class365.method3970(anLocalInt_10_, anLocalInt, argument ^ 0x2);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class_aa_Sub2.aClass166_3752) {
	    boolean anLocalBoolean
		= stream.g1() == 1;
	    String string
		= stream.gstr();
	    String string_11_ = string;
	    if (anLocalBoolean)
		string_11_
		    = stream.gstr();
	    int anLocalInt = stream
				 .g1();
	    boolean anLocalBoolean_12_ = false;
	    if (anLocalInt <= 1) {
		if (Class207.aBoolean1485 && !Class190.aBoolean1395
		    || Class128.aBoolean1042)
		    anLocalBoolean_12_ = true;
		else if (anLocalInt <= 1
			 && Class356.method3933(121, string_11_))
		    anLocalBoolean_12_ = true;
	    }
	    if (!anLocalBoolean_12_ && Node_Sub23.anInt4057 == 0) {
		String string_13_
		    = (Node_Sub31_Sub1.method878
                ((byte) -10,
                        Class303.method3566(stream,
                                -74)));
		if (anLocalInt != 2) {
		    if (anLocalInt != 1)
			Class266.method3343(24, true, string, string, -1,
					    string_11_, 0, string_13_, null);
		    else
			Class266.method3343(24, true, "<img=0>" + string,
					    string, -1, "<img=0>" + string_11_,
					    0, string_13_, null);
		} else
		    Class266.method3343(24, true, "<img=1>" + string, string,
					-1, "<img=1>" + string_11_, 0,
					string_13_, null);
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class361.aClass166_3052 == Class93.aClass166_714) {
	    int anLocalInt
		= stream.g4i_dupl();
	    int anLocalInt_14_
		= stream.g2();
	    Class283.method3451((byte) -42);
	    Class260.method3311(anLocalInt, 3560, anLocalInt_14_);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class384.aClass166_3259) {
	    int anLocalInt = stream
				 .g2ip128();
	    int anLocalInt_15_
		= stream.g2i();
	    int anLocalInt_16_
		= stream.g1p128();
	    int anLocalInt_17_
		= stream.g4();
	    Class283.method3451((byte) -37);
	    Class127.method2415(anLocalInt_16_, anLocalInt_15_, anLocalInt_17_,
				anLocalInt, (byte) -52);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class209.aClass166_1502 == Class93.aClass166_714) {
	    Class72.anInt495
		= stream.g1_128p();
	    DoublyLinkedNodeP2_Sub10.anInt4598
		= stream.g1p128();
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Node_Sub11.aClass166_3947 == Class93.aClass166_714) {
	    Class283.method3451((byte) -95);
	    Class80.method1586(27315);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (argument != 2)
	    LightingManager.aBooleanArray3116 = null;
	if (Class93.aClass166_714 == Node_Sub9_Sub2.aClass166_5770) {
	    int anLocalInt
		= stream.g2i() << 2;
	    int anLocalInt_18_
		= stream.g1p128();
	    int anLocalInt_19_
		= stream.g1n();
	    int anLocalInt_20_
		= stream.g1_128p();
	    int anLocalInt_21_
		= stream.g1_128p();
	    Class283.method3451((byte) -122);
	    Class217.method3012(anLocalInt_19_, anLocalInt_18_, anLocalInt_21_,
				anLocalInt_20_, anLocalInt, -28384);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (DoublyLinkedNode_Sub51_Sub15.aClass166_6313 == Class93.aClass166_714) {
	    Class232.method3094(Class66.aClass329_463, 90);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class297.aClass166_2469) {
	    int anLocalInt
		= stream.g4i_dupl();
	    int anLocalInt_22_
		= stream.g2ip128();
	    int anLocalInt_23_
		= stream.g4();
	    Class283.method3451((byte) -90);
	    Cs2CallStackEntry.method1545(anLocalInt_22_, anLocalInt_23_, anLocalInt, true, 5);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class133_Sub2.aClass166_5013 == Class93.aClass166_714) {
	    boolean anLocalBoolean
		= (stream.g1_128p()
		   == 1);
	    Class283.method3451((byte) -88);
	    DoublyLinkedNodeP2_Sub2_Sub3.aBoolean6420 = anLocalBoolean;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Statics.aClass166_4468 == Class93.aClass166_714) {
	    Class232.method3094(Class133_Sub4.aClass329_5028, 86);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class25.aClass166_166) {
	    int anLocalInt = stream.g1_128p();
	    int[] anLocalInts = new int[4];
	    for (int anLocalInt_24_ = 0; anLocalInt_24_ < 4; anLocalInt_24_++)
		anLocalInts[anLocalInt_24_]
		    = stream.g2i();
	    int anLocalInt_25_
		= stream.g2m128();
	    Node_Sub35 class59_sub35
		= ((Node_Sub35)
		   Class294.aJagexHashMap_2453.get((long) anLocalInt_25_));
	    if (class59_sub35 != null)
		Class124.method2400((((Node_Sub35) class59_sub35)
				     .aClass104_Sub2_Sub2_Sub5_Sub1_4157),
				    anLocalInts, anLocalInt, false);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class350.aClass166_2923) {
	    int anLocalInt
		= stream.g1();
	    int anLocalInt_26_
		= stream.g1n();
	    int anLocalInt_27_
		= stream.g4m2143();
	    Node_Sub31_Sub37.anIntArray6034[anLocalInt_26_]
		= anLocalInt_27_;
	    Class_aa_Sub3.anIntArray3756[anLocalInt_26_] = anLocalInt;
	    Class156.anIntArray3686[anLocalInt_26_] = 1;
	    int anLocalInt_28_
		= Node_Sub52.anIntArray4347[anLocalInt_26_] - 1;
	    for (int anLocalInt_29_ = 0; anLocalInt_29_ < anLocalInt_28_;
		 anLocalInt_29_++) {
		if (anLocalInt_27_ >= Class215.anIntArray1518[anLocalInt_29_])
		    Class156.anIntArray3686[anLocalInt_26_]
			= anLocalInt_29_ + 2;
	    }
	    Class51.anIntArray388
		[MathStatics.AND(31, Class62_Sub19.anInt4429++)]
		= anLocalInt_26_;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class116.aClass166_955) {
	    int anLocalInt = stream.g2();
	    Class283.method3451((byte) -115);
	    Class389.method4135(43, anLocalInt);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == client.aClass166_3743) {
	    int anLocalInt = stream.g2();
	    if (anLocalInt == 65535)
		anLocalInt = -1;
	    int anLocalInt_30_
		= stream.g1();
	    int anLocalInt_31_
		= stream.g2();
	    int anLocalInt_32_
		= stream.g1();
	    int anLocalInt_33_
		= stream.g2();
	    Class165.method2629(anLocalInt_32_, anLocalInt, anLocalInt_31_,
				anLocalInt_30_, anLocalInt_33_, 2760);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Statics.aClass166_1048 == Class93.aClass166_714) {
	    Class232.method3094(Statics.aClass329_719, argument ^ 0x3e);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class215.aClass166_1521) {
	    Class232.method3094(Class53.aClass329_394, 121);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Statics.aClass166_6417) {
	    int anLocalInt
		= stream.g4();
	    Class283.method3451((byte) -58);
	    Cs2CallStackEntry.method1545(Class64.anInt451, anLocalInt, 0, true, 5);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class212.aClass166_1509) {
	    boolean anLocalBoolean
		= stream.g1() == 1;
	    String string
		= stream.gstr();
	    long l = (long) stream.g2();
	    long l_34_ = (long) stream
				    .g3_dupl();
	    int anLocalInt
		= stream.g1();
	    long l_35_ = l_34_ + (l << 32);
	    boolean anLocalBoolean_36_ = false;
	    Object object = null;
	    ClanChannel class59_sub53
		= (anLocalBoolean ? AbstractFont.aClass59_Sub53_420
		   : GameEnum.aClass59_Sub53_825);
	while_93_:
	    do {
		if (class59_sub53 == null)
		    anLocalBoolean_36_ = true;
		else {
		    for (int anLocalInt_37_ = 0; anLocalInt_37_ < 100;
			 anLocalInt_37_++) {
			if (FileOnDisk.aLongArray1452[anLocalInt_37_] == l_35_) {
			    anLocalBoolean_36_ = true;
			    break while_93_;
			}
		    }
		    if (anLocalInt <= 1) {
			if (Class207.aBoolean1485 && !Class190.aBoolean1395
			    || Class128.aBoolean1042)
			    anLocalBoolean_36_ = true;
			else if (Class356.method3933(124, string))
			    anLocalBoolean_36_ = true;
		    }
		}
	    } while (false);
	    if (!anLocalBoolean_36_ && Node_Sub23.anInt4057 == 0) {
		FileOnDisk.aLongArray1452[Class285.anInt3635] = l_35_;
		Class285.anInt3635 = (Class285.anInt3635 + 1) % 100;
		String string_38_
		    = (Node_Sub31_Sub1.method878
                ((byte) -10,
                        Class303.method3566(stream,
                                argument ^ ~0x70)));
		int anLocalInt_39_ = anLocalBoolean ? 41 : 44;
		if (anLocalInt != 2 && anLocalInt != 3) {
		    if (anLocalInt == 1)
			Class266.method3343(anLocalInt_39_, true,
					    "<img=0>" + string, string, -1,
					    "<img=0>" + string, 0, string_38_,
					    (((ClanChannel) class59_sub53)
					     .aString4357));
		    else
			Class266.method3343(anLocalInt_39_, true, string,
					    string, -1, string, 0, string_38_,
					    (((ClanChannel) class59_sub53)
					     .aString4357));
		} else
		    Class266.method3343(anLocalInt_39_, true,
					"<img=1>" + string, string, -1,
					"<img=1>" + string, 0, string_38_,
					(((ClanChannel) class59_sub53)
					 .aString4357));
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class373.aClass166_3199 == Class93.aClass166_714) {
	    int anLocalInt = stream.g1_128p();
	    int anLocalInt_40_
		= stream.g4i_dupl();
	    Class283.method3451((byte) -41);
	    Class361.method3958(anLocalInt_40_, 18, anLocalInt);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class205.aClass166_1467) {
	    Class232.method3094(Class62_Sub2.aClass329_4366, 42);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Statics.aClass166_4113 == Class93.aClass166_714) {
	    int anLocalInt = stream.g2m128();
	    int anLocalInt_41_
		= stream.g1n();
	    Class283.method3451((byte) -128);
	    Node_Sub49.method1151(true, anLocalInt, (byte) -2,
                anLocalInt_41_);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class100.aClass166_780) {
	    int anLocalInt
		= stream.g2();
	    int anLocalInt_42_
		= stream.g2m128();
	    int anLocalInt_43_
		= stream.g4i_dupl();
	    Class283.method3451((byte) -61);
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub2.method1809(anLocalInt_43_,
					       anLocalInt + (anLocalInt_42_
							     << 16),
					       0);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class82.aClass166_584) {
	    int anLocalInt = stream.g2ip128();
	    if (anLocalInt == 65535)
		anLocalInt = -1;
	    int anLocalInt_44_
		= stream.g4();
	    Class283.method3451((byte) -110);
	    Cs2CallStackEntry.method1545(anLocalInt, anLocalInt_44_, -1, true, 2);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (DataType.aClass166_1079 == Class93.aClass166_714) {
	    for (int anLocalInt = 0;
		 (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905.length
		  > anLocalInt);
		 anLocalInt++) {
		if (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[anLocalInt]
		    != null) {
		    ((Entity)
		     (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		      [anLocalInt])).anIntArray6735
			= null;
		    ((Entity)
		     (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		      [anLocalInt])).anInt6754
			= -1;
		}
	    }
	    for (int anLocalInt = 0; Statics.anInt5573 > anLocalInt;
		 anLocalInt++) {
		((Entity)
		 (((Node_Sub35)
		   Node_Sub31_Sub13.aClass59_Sub35Array5900[anLocalInt])
		  .aClass104_Sub2_Sub2_Sub5_Sub1_4157)).anIntArray6735
		    = null;
		((Entity)
		 (((Node_Sub35)
		   Node_Sub31_Sub13.aClass59_Sub35Array5900[anLocalInt])
		  .aClass104_Sub2_Sub2_Sub5_Sub1_4157)).anInt6754
		    = -1;
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class30.aClass166_206 == Class93.aClass166_714) {
	    Class208.anInt1494
		= stream.g1s() << 3;
	    Class379.anInt3227
		= stream.g1();
	    Node_Sub31_Sub37.anInt6032
		= stream.g1p128s() << 3;
	    for (Node_Sub15 class59_sub15
		     = ((Node_Sub15)
			tia_sub_35_Sub1DoublyLinked.aJagexHashMap_6658.first(0));
		 class59_sub15 != null;
		 class59_sub15 = (Node_Sub15) tia_sub_35_Sub1DoublyLinked
						     .aJagexHashMap_6658
						     .next()) {
		int anLocalInt
		    = (int) (((Node) class59_sub15).hash >> 28 & 0x3L);
		int anLocalInt_45_
		    = (int) (((Node) class59_sub15).hash & 0x3fffL);
		int anLocalInt_46_ = -MapRelated.baseX + anLocalInt_45_;
		int anLocalInt_47_
		    = (int) (((Node) class59_sub15).hash >> 14
			     & 0x3fffL);
		int anLocalInt_48_ = -MapRelated.baseZ + anLocalInt_47_;
		if (anLocalInt == Class379.anInt3227
		    && anLocalInt_46_ >= Class208.anInt1494
		    && Class208.anInt1494 + 8 > anLocalInt_46_
		    && Node_Sub31_Sub37.anInt6032 <= anLocalInt_48_
		    && anLocalInt_48_ < Node_Sub31_Sub37.anInt6032 + 8) {
		    class59_sub15.unlink();
		    if (anLocalInt_46_ >= 0 && anLocalInt_48_ >= 0
			&& anLocalInt_46_ < MapRelated.mapWidth
			&& anLocalInt_48_ < MapRelated.mapDepth)
			DoublyLinkedNode_Sub51_Sub8.method1229(126, anLocalInt_48_, Class379.anInt3227, anLocalInt_46_);
		}
	    }
	    for (Node_Sub2 class59_sub2
		     = ((Node_Sub2)
			Statics.aCyclicLinkedList_3722.getFirst());
		 class59_sub2 != null;
		 class59_sub2
		     = (Node_Sub2) Statics.aCyclicLinkedList_3722
					  .getNext()) {
		if ((((Node_Sub2) class59_sub2).anInt3883
		     >= Class208.anInt1494)
		    && (((Node_Sub2) class59_sub2).anInt3883
			< Class208.anInt1494 + 8)
		    && (Node_Sub31_Sub37.anInt6032
			<= ((Node_Sub2) class59_sub2).anInt3882)
		    && (((Node_Sub2) class59_sub2).anInt3882
			< Node_Sub31_Sub37.anInt6032 + 8)
		    && (Class379.anInt3227
			== ((Node_Sub2) class59_sub2).anInt3871))
		    ((Node_Sub2) class59_sub2).aBoolean3873 = true;
	    }
	    for (Node_Sub2 class59_sub2
		     = ((Node_Sub2)
			Class88.aCyclicLinkedList_643.getFirst());
		 class59_sub2 != null;
		 class59_sub2
		     = ((Node_Sub2)
			Class88.aCyclicLinkedList_643.getNext())) {
		if ((Class208.anInt1494
		     <= ((Node_Sub2) class59_sub2).anInt3883)
		    && (((Node_Sub2) class59_sub2).anInt3883
			< Class208.anInt1494 + 8)
		    && (Node_Sub31_Sub37.anInt6032
			<= ((Node_Sub2) class59_sub2).anInt3882)
		    && (Node_Sub31_Sub37.anInt6032 + 8
			> ((Node_Sub2) class59_sub2).anInt3882)
		    && (((Node_Sub2) class59_sub2).anInt3871
			== Class379.anInt3227))
		    ((Node_Sub2) class59_sub2).aBoolean3873 = true;
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class222_Sub2.aClass166_5297 == Class93.aClass166_714) {
	    int anLocalInt
		= stream.g2i();
	    int anLocalInt_49_
		= stream.g1_128p();
	    Class283.method3451((byte) -49);
	    if (anLocalInt_49_ == 2)
		Node_Sub23.method744(-88);
	    Class66.anInt467 = anLocalInt;
	    JagexHash.method3085(anLocalInt, (byte) -26);
	    Statics.method1760(-47, false);
	    Cs2Runtime.method3656(Class66.anInt467);
	    for (int anLocalInt_50_ = 0; anLocalInt_50_ < 100;
		 anLocalInt_50_++)
		Class109_Sub1.aBooleanArray4604[anLocalInt_50_] = true;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == DoublyLinkedNodeP2_Sub2_Sub1.aClass166_6402) {
	    Class44.method429(81, Statics.aBoolean184);
	    Class93.aClass166_714 = null;
	    return false;
	}
	if (Class93.aClass166_714 == Class60.aClass166_434) {
	    Class45.anInt316 = Class359.anInt3038;
	    Class6.anInt72 = 1;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class243.aClass166_3601 == Class93.aClass166_714) {
	    Node_Sub1.anInt3868
		= stream.g1();
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class205.aClass166_1474 == Class93.aClass166_714) {
	    Class232.method3094(Node_Sub31_Sub31.aClass329_5994,
				argument ^ 0x21);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class_aa.aClass166_52) {
	    int anLocalInt = stream.gsmart(-2);
	    int anLocalInt_51_
		= stream.g4();
	    int anLocalInt_52_
		= stream.g1();
	    String string = "";
	    String string_53_ = string;
	    if ((anLocalInt_52_ & 0x1) != 0) {
		string = stream.gstr();
		if ((anLocalInt_52_ & 0x2) == 0)
		    string_53_ = string;
		else
		    string_53_ = stream
				     .gstr();
	    }
	    String string_54_
		= stream.gstr();
	    if (anLocalInt != 99) {
		if (!string_53_.equals("")
		    && Class356.method3933(115, string_53_)) {
		    Class93.aClass166_714 = null;
		    return true;
		}
		Class62_Sub12.method1403(anLocalInt, string, string_53_,
					 string_54_, anLocalInt_51_, string,
					 16773);
	    } else
		Statics.method2425((byte) -122, string_54_);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class317.aClass166_2619) {
	    Class60.anInt436
		= stream.g1();
	    for (int anLocalInt = 0; Class60.anInt436 > anLocalInt;
		 anLocalInt++) {
		Class76.aStringArray515[anLocalInt]
		    = stream.gstr();
		DoublyLinkedNode_Sub51_Sub19_Sub1.aStringArray6676[anLocalInt]
		    = stream.gstr();
		if (DoublyLinkedNode_Sub51_Sub19_Sub1.aStringArray6676[anLocalInt]
			.equals(""))
		    DoublyLinkedNode_Sub51_Sub19_Sub1.aStringArray6676[anLocalInt]
			= Class76.aStringArray515[anLocalInt];
		DoublyLinkedNodeP2_Sub4.aStringArray4528[anLocalInt]
		    = stream.gstr();
		Class18.aStringArray126[anLocalInt]
		    = stream.gstr();
		if (Class18.aStringArray126[anLocalInt].equals(""))
		    Class18.aStringArray126[anLocalInt]
			= DoublyLinkedNodeP2_Sub4.aStringArray4528[anLocalInt];
		Node_Sub6.aBooleanArray3907[anLocalInt] = false;
	    }
	    Class45.anInt316 = Class359.anInt3038;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class245.aClass166_1785 == Class93.aClass166_714) {
	    boolean anLocalBoolean
		= stream.g1() == 1;
	    byte[] anLocalInts = new byte[anInt4454 - 1];
	    stream.gbytes(anLocalInts, 0, (anInt4454 - 1));
	    DoublyLinkedNodeP2_Sub2_Sub3.method1867(anLocalBoolean, argument ^ 0x676f,
					  anLocalInts);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == DoublyLinkedNodeP2_Sub4.aClass166_4525) {
	    byte anLocalInt = stream.p1m128();
	    int anLocalInt_55_
		= stream.g2m128();
	    ClientVariables.instance.setDefault(anLocalInt_55_, anLocalInt);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == DoublyLinkedNode_Sub51_Sub1.aClass166_6222) {
	    String string
		= stream.gstr();
	    String string_56_
		= (Node_Sub31_Sub1.method878
                ((byte) -10,
                        Class303.method3566(stream,
                                -123)));
	    Class62_Sub12.method1403(6, string, string, string_56_, 0, string,
				     16773);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class45.aClass166_320 == Class93.aClass166_714) {
	    int anLocalInt = stream.g4();
	    int anLocalInt_57_
		= stream.g2();
	    Class283.method3451((byte) -36);
	    Class306.method3597(1, anLocalInt_57_, anLocalInt);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (DoublyLinkedNodeP2_Sub2_Sub1.aClass166_6403 == Class93.aClass166_714) {
	    int anLocalInt = stream.g2m128();
	    if (anLocalInt == 65535)
		anLocalInt = -1;
	    int anLocalInt_58_
		= stream.g4i_dupl();
	    int anLocalInt_59_
		= stream.g4m();
	    Class283.method3451((byte) -62);
	    Class371.method4049(anLocalInt_58_, (byte) -101, anLocalInt_59_,
				anLocalInt);
	    Class371 class371
		= Class253_Sub1_Sub1.aClass365_6632.method3975(3, anLocalInt);
	    Node_Sub31_Sub11.method904((byte) -121,
                ((Class371) class371).anInt3153,
                anLocalInt_58_,
                ((Class371) class371).anInt3166,
                ((Class371) class371).anInt3123);
	    dba_sub_772_Sub1.method1309(anLocalInt_58_, 10,
					((Class371) class371).anInt3146,
					((Class371) class371).anInt3132,
					((Class371) class371).anInt3172);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class354.aClass166_3000 == Class93.aClass166_714) {
	    int anLocalInt = stream.g2();
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2;
	    if (anLocalInt != Class64.anInt451)
		class104_sub2_sub2_sub5_sub2
		    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		       [anLocalInt]);
	    else
		class104_sub2_sub2_sub5_sub2
		    = Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587;
	    if (class104_sub2_sub2_sub5_sub2 == null) {
		Class93.aClass166_714 = null;
		return true;
	    }
	    int anLocalInt_60_
		= stream.g2();
	    int anLocalInt_61_
		= stream.g1();
	    boolean anLocalBoolean = (anLocalInt_60_ & 0x8000) != 0;
	    if ((((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) class104_sub2_sub2_sub5_sub2)
		 .aString6836) != null
		&& ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		    class104_sub2_sub2_sub5_sub2).aClass22_6854 != null) {
		boolean anLocalBoolean_62_ = false;
		if (anLocalInt_61_ <= 1) {
		    if (!anLocalBoolean
			&& (Class207.aBoolean1485 && !Class190.aBoolean1395
			    || Class128.aBoolean1042))
			anLocalBoolean_62_ = true;
		    else if (Class356.method3933
			     (114, ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				    class104_sub2_sub2_sub5_sub2).aString6836))
			anLocalBoolean_62_ = true;
		}
		if (!anLocalBoolean_62_ && Node_Sub23.anInt4057 == 0) {
		    int anLocalInt_63_ = -1;
		    String string;
		    if (!anLocalBoolean)
			string
			    = (Node_Sub31_Sub1.method878
                    ((byte) -10,
                            Class303.method3566((stream),
                                    argument ^ ~0x69)));
		    else {
			anLocalInt_60_ &= 0x7fff;
			Class379 class379
			    = Statics.method323((stream), true);
			anLocalInt_63_ = ((Class379) class379).anInt3229;
			string = (((Class379) class379)
				      .aClass59_Sub51_Sub16_3226.method1279
				  (stream, 15628));
		    }
		    ((Entity) class104_sub2_sub2_sub5_sub2)
			.aString6733
			= string.trim();
		    ((Entity) class104_sub2_sub2_sub5_sub2)
			.anInt6776
			= anLocalInt_60_ & 0xff;
		    ((Entity) class104_sub2_sub2_sub5_sub2)
			.anInt6736
			= anLocalInt_60_ >> 8;
		    ((Entity) class104_sub2_sub2_sub5_sub2)
			.anInt6791
			= 150;
		    int anLocalInt_64_;
		    if (anLocalInt_61_ != 1 && anLocalInt_61_ != 2)
			anLocalInt_64_ = anLocalBoolean ? 17 : 2;
		    else
			anLocalInt_64_ = !anLocalBoolean ? 1 : 17;
		    if (anLocalInt_61_ != 2) {
			if (anLocalInt_61_ != 1)
			    Class266.method3343
				(anLocalInt_64_, true,
				 class104_sub2_sub2_sub5_sub2
				     .method1855(true, -1075074040),
				 ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				  class104_sub2_sub2_sub5_sub2).aString6847,
				 anLocalInt_63_,
				 class104_sub2_sub2_sub5_sub2
				     .method1862(false, -12628),
				 0, string, null);
			else
			    Class266.method3343
				(anLocalInt_64_, true,
				 ("<img=0>"
				  + class104_sub2_sub2_sub5_sub2
					.method1855(true, -1075074040)),
				 ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				  class104_sub2_sub2_sub5_sub2).aString6847,
				 anLocalInt_63_,
				 "<img=0>" + class104_sub2_sub2_sub5_sub2
						 .method1862(false, -12628),
				 0, string, null);
		    } else
			Class266.method3343
			    (anLocalInt_64_, true,
			     "<img=1>" + class104_sub2_sub2_sub5_sub2
					     .method1855(true, -1075074040),
			     ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
			      class104_sub2_sub2_sub5_sub2).aString6847,
			     anLocalInt_63_,
			     "<img=1>" + class104_sub2_sub2_sub5_sub2
					     .method1862(false, -12628),
			     0, string, null);
		}
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class189_Sub3_Sub1.aClass166_6630) {
	    int anLocalInt = stream.g4();
	    int anLocalInt_65_
		= stream.g2i();
	    Class283.method3451((byte) -52);
	    if (anLocalInt_65_ == 65535)
		anLocalInt_65_ = -1;
	    Statics.method3714(anLocalInt_65_, anLocalInt);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class143.aClass166_1101) {
	    int anLocalInt = stream.g1_128p();
	    byte anLocalInt_66_
		= stream.g1s();
	    Class283.method3451((byte) -75);
	    Node_Sub31_Sub35.method988(anLocalInt_66_, (byte) -127,
                anLocalInt);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == DoublyLinkedNodeP2_Sub2_Sub5_Sub1.aClass166_6813) {
	    Class232.method3094(Statics.aClass329_2294, 124);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Node_Sub28_Sub1.aClass166_5830) {
	    Class232.method3094(Statics.aClass329_1046, 100);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class80.aClass166_569) {
	    int anLocalInt = stream
				 .g2ip128();
	    String string
		= stream.gstr();
	    Class283.method3451((byte) -85);
	    Node_Sub32_Sub1.method1015(anLocalInt, (byte) -120, string);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class33.aClass166_221 == Class93.aClass166_714) {
	    int anLocalInt
		= stream.g4m();
	    Class283.method3451((byte) -73);
	    Node_Sub49 class59_sub49
		= ((Node_Sub49)
		   Class2_Sub5.aJagexHashMap_3787.get((long) anLocalInt));
	    if (class59_sub49 != null)
		Class222_Sub2.method3037(false, true, class59_sub49,
					 -86709072);
	    if (Gl2Water0.aRsInterface_3801 != null) {
		Class256.method3280(Gl2Water0.aRsInterface_3801, true);
		Gl2Water0.aRsInterface_3801 = null;
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class360.aClass166_3048 == Class93.aClass166_714) {
	    int anLocalInt
		= stream.g1p128();
	    int anLocalInt_67_
		= stream.g1();
	    int anLocalInt_68_
		= (stream.g2()
		   << 2);
	    int anLocalInt_69_
		= stream.g1n();
	    int anLocalInt_70_
		= stream.g1n();
	    Class283.method3451((byte) -40);
	    Class243.method3159(false, anLocalInt, true, anLocalInt_70_,
				anLocalInt_67_, anLocalInt_68_,
				anLocalInt_69_);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Node_Sub13.aClass166_3959 == Class93.aClass166_714) {
	    int anLocalInt = stream.g1n();
	    int anLocalInt_71_
		= stream.g2i();
	    ClientVariables.instance
		.setVarbitDefault(anLocalInt_71_, anLocalInt);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Node_Sub10.aClass166_3937) {
	    Class289.anInt2303
		= stream.g3s();
	    Class207.aBoolean1485
		= stream
		      .g1() == 1;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class84.aClass166_602) {
	    Class232.method3094(Class365.aClass329_3075, 85);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class43.aClass166_311 == Class93.aClass166_714) {
	    int anLocalInt = stream.g4();
	    Class283.method3451((byte) -101);
	    Class93.aClass166_714 = null;
	    if (anLocalInt != -1) {
		int anLocalInt_72_ = (anLocalInt & 0xffffb7c) >> 14;
		int anLocalInt_73_ = anLocalInt & 0x3fff;
		anLocalInt_72_ -= MapRelated.baseX;
		if (anLocalInt_72_ >= 0) {
		    if (anLocalInt_72_ >= MapRelated.mapWidth)
			anLocalInt_72_ = MapRelated.mapWidth;
		} else
		    anLocalInt_72_ = 0;
		anLocalInt_73_ -= MapRelated.baseZ;
		if (anLocalInt_73_ >= 0) {
		    if (MapRelated.mapDepth <= anLocalInt_73_)
			anLocalInt_73_ = MapRelated.mapDepth;
		} else
		    anLocalInt_73_ = 0;
		DoublyLinkedNodeP2_Sub2_Sub4_Sub1.anInt6573
		    = (anLocalInt_72_ << 9) + 256;
		Class85.anInt607 = (anLocalInt_73_ << 9) + 256;
	    } else {
		DoublyLinkedNodeP2_Sub2_Sub4_Sub1.anInt6573 = -1;
		Class85.anInt607 = -1;
	    }
	    return true;
	}
	if (Class62_Sub6.aClass166_4387 == Class93.aClass166_714) {
	    int anLocalInt
		= stream.g1p128();
	    int anLocalInt_74_
		= stream.g2();
	    int anLocalInt_75_
		= stream.g4m2143();
	    Class283.method3451((byte) -104);
	    Node_Sub49 class59_sub49
		= ((Node_Sub49)
		   Class2_Sub5.aJagexHashMap_3787.get((long) anLocalInt_75_));
	    if (class59_sub49 != null)
		Class222_Sub2.method3037(false,
					 (anLocalInt_74_
					  != (((Node_Sub49) class59_sub49)
					      .anInt4291)),
					 class59_sub49, -86709072);
	    Statics.method2567(anLocalInt_74_, anLocalInt_75_, false, (byte) 19, anLocalInt);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.aClass166_6853
	    == Class93.aClass166_714) {
	    int anLocalInt
		= stream.g4();
	    Class62_Sub2.aSignlinkRequest_4365
		= Applet_Sub1.baseSignlink.requestHostnameForIP(anLocalInt);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class62_Sub3.aClass166_4374 == Class93.aClass166_714) {
	    Class62_Sub24.method1455(argument ^ 0x3d);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class182.aClass166_1375) {
	    Class217.method3011(0);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class62_Sub1.aClass166_4361) {
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.aBoolean6865
		= stream.g1p128() == 1;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class329.aClass166_2700) {
	    boolean anLocalBoolean
		= stream.g1() == 1;
	    String string
		= stream.gstr();
	    String string_76_ = string;
	    if (anLocalBoolean)
		string_76_
		    = stream.gstr();
	    long l = stream.g8();
	    long l_77_ = (long) stream.g2();
	    long l_78_ = (long) stream
				    .g3_dupl();
	    int anLocalInt
		= stream.g1();
	    long l_79_ = l_78_ + (l_77_ << 32);
	    boolean anLocalBoolean_80_ = false;
	while_94_:
	    do {
		for (int anLocalInt_81_ = 0; anLocalInt_81_ < 100;
		     anLocalInt_81_++) {
		    if (FileOnDisk.aLongArray1452[anLocalInt_81_] == l_79_) {
			anLocalBoolean_80_ = true;
			break while_94_;
		    }
		}
		if (anLocalInt <= 1) {
		    if (Class207.aBoolean1485 && !Class190.aBoolean1395
			|| Class128.aBoolean1042)
			anLocalBoolean_80_ = true;
		    else if (Class356.method3933(120, string_76_))
			anLocalBoolean_80_ = true;
		}
	    } while (false);
	    if (!anLocalBoolean_80_ && Node_Sub23.anInt4057 == 0) {
		FileOnDisk.aLongArray1452[Class285.anInt3635] = l_79_;
		Class285.anInt3635 = (Class285.anInt3635 + 1) % 100;
		String string_82_
		    = (Node_Sub31_Sub1.method878
                ((byte) -10,
                        Class303.method3566(stream,
                                -110)));
		if (anLocalInt != 2 && anLocalInt != 3) {
		    if (anLocalInt != 1)
			Class266.method3343(9, true, string, string, -1,
					    string_76_, 0, string_82_,
					    Class275.method3393(l, false));
		    else
			Class266.method3343(9, true, "<img=0>" + string,
					    string, -1, "<img=0>" + string_76_,
					    0, string_82_,
					    Class275.method3393(l, false));
		} else
		    Class266.method3343(9, true, "<img=1>" + string, string,
					-1, "<img=1>" + string_76_, 0,
					string_82_,
					Class275.method3393(l, false));
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Applet_Sub1.aClass166_10 == Class93.aClass166_714) {
	    String string
		= stream.gstr();
	    boolean anLocalBoolean = (stream
					  .g1()
				      == 1);
	    String string_83_;
	    if (!anLocalBoolean)
		string_83_ = string;
	    else
		string_83_
		    = stream.gstr();
	    int anLocalInt = stream.g2();
	    byte anLocalInt_84_
		= stream.g1s();
	    boolean anLocalBoolean_85_ = false;
	    if (anLocalInt_84_ == -128)
		anLocalBoolean_85_ = true;
	    if (anLocalBoolean_85_) {
		if (Statics.anInt2724 == 0) {
		    Class93.aClass166_714 = null;
		    return true;
		}
		boolean anLocalBoolean_86_ = false;
		int anLocalInt_87_;
		for (anLocalInt_87_ = 0; Statics.anInt2724 > anLocalInt_87_;
		     anLocalInt_87_++) {
		    if (((Class176)
			 Node_Sub13.aClass176Array3956[anLocalInt_87_])
			    .aString1303.equals(string_83_)
			&& (anLocalInt
			    == ((Class176) (Node_Sub13.aClass176Array3956
					    [anLocalInt_87_])).anInt1307))
			break;
		}
		if (Statics.anInt2724 > anLocalInt_87_) {
		    for (/**/; Statics.anInt2724 - 1 > anLocalInt_87_;
			 anLocalInt_87_++)
			Node_Sub13.aClass176Array3956[anLocalInt_87_]
			    = (Node_Sub13.aClass176Array3956
			       [anLocalInt_87_ + 1]);
		    Statics.anInt2724--;
		    Node_Sub13.aClass176Array3956[Statics.anInt2724]
			= null;
		}
	    } else {
		String string_88_
		    = stream.gstr();
		Class176 class176 = new Class176();
		((Class176) class176).aString1304 = string;
		((Class176) class176).aString1303 = string_83_;
		((Class176) class176).aString1305
		    = Class359.method3948(argument ^ 0x46c9,
					  ((Class176) class176).aString1303);
		((Class176) class176).aByte1309 = anLocalInt_84_;
		((Class176) class176).aString1306 = string_88_;
		((Class176) class176).anInt1307 = anLocalInt;
		int anLocalInt_89_;
		for (anLocalInt_89_ = Statics.anInt2724 - 1;
		     anLocalInt_89_ >= 0; anLocalInt_89_--) {
		    int anLocalInt_90_
			= ((Class176)
			   Node_Sub13.aClass176Array3956[anLocalInt_89_])
			      .aString1305
			      .compareTo(((Class176) class176).aString1305);
		    if (anLocalInt_90_ == 0) {
			((Class176) (Node_Sub13.aClass176Array3956
				     [anLocalInt_89_])).anInt1307
			    = anLocalInt;
			((Class176) (Node_Sub13.aClass176Array3956
				     [anLocalInt_89_])).aByte1309
			    = anLocalInt_84_;
			((Class176) (Node_Sub13.aClass176Array3956
				     [anLocalInt_89_])).aString1306
			    = string_88_;
			if (string_83_.equals
			    (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
			      Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			     .aString6836))
			    Class72.aByte496 = anLocalInt_84_;
			Class232.anInt1694 = Class359.anInt3038;
			Class93.aClass166_714 = null;
			return true;
		    }
		    if (anLocalInt_90_ < 0)
			break;
		}
		if (Statics.anInt2724
		    >= Node_Sub13.aClass176Array3956.length) {
		    Class93.aClass166_714 = null;
		    return true;
		}
		for (int anLocalInt_91_ = Statics.anInt2724 - 1;
		     anLocalInt_91_ > anLocalInt_89_; anLocalInt_91_--)
		    Node_Sub13.aClass176Array3956[anLocalInt_91_ + 1]
			= Node_Sub13.aClass176Array3956[anLocalInt_91_];
		if (Statics.anInt2724 == 0)
		    Node_Sub13.aClass176Array3956 = new Class176[100];
		Node_Sub13.aClass176Array3956[anLocalInt_89_ + 1]
		    = class176;
		Statics.anInt2724++;
		if (string_83_.equals(((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				       (Class308
					.aClass104_Sub2_Sub2_Sub5_Sub2_2587))
				      .aString6836))
		    Class72.aByte496 = anLocalInt_84_;
	    }
	    Class232.anInt1694 = Class359.anInt3038;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class274.aClass166_2194) {
	    int anLocalInt = stream.g2();
	    int anLocalInt_92_
		= stream.g1();
	    boolean anLocalBoolean = (anLocalInt_92_ & 0x1) == 1;
	    Class99.method1726((byte) 3, anLocalInt, anLocalBoolean);
	    int anLocalInt_93_
		= stream.g2();
	    for (int anLocalInt_94_ = 0; anLocalInt_94_ < anLocalInt_93_;
		 anLocalInt_94_++) {
		int anLocalInt_95_
		    = stream.g1p128();
		if (anLocalInt_95_ == 255)
		    anLocalInt_95_ = stream
					 .g4m2143();
		int anLocalInt_96_
		    = stream.g2i();
		Class213.method2981(anLocalInt_94_, -100, anLocalBoolean,
				    anLocalInt, anLocalInt_96_ - 1,
				    anLocalInt_95_);
	    }
	    Class24.anIntArray160[MathStatics.AND(31, Class41.anInt306++)]
		= anLocalInt;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class377.aClass166_3218 == Class93.aClass166_714) {
	    boolean anLocalBoolean = (stream
					  .g1()
				      == 1);
	    String string
		= stream.gstr();
	    String string_97_ = string;
	    if (anLocalBoolean)
		string_97_
		    = stream.gstr();
	    int anLocalInt = stream
				 .g1();
	    int anLocalInt_98_
		= stream.g2();
	    boolean anLocalBoolean_99_ = false;
	    if (anLocalInt <= 1 && Class356.method3933(126, string_97_))
		anLocalBoolean_99_ = true;
	    if (!anLocalBoolean_99_ && Node_Sub23.anInt4057 == 0) {
		String string_100_
		    = DoublyLinkedNode_Sub51_Sub5.aClass66_6242.method1496
			  (anLocalInt_98_, 17408)
			  .method1279(stream, 15628);
		if (anLocalInt != 2) {
		    if (anLocalInt != 1)
			Class266.method3343(25, true, string, string,
					    anLocalInt_98_, string_97_, 0,
					    string_100_, null);
		    else
			Class266.method3343(25, true, "<img=0>" + string,
					    string, anLocalInt_98_,
					    "<img=0>" + string_97_, 0,
					    string_100_, null);
		} else
		    Class266.method3343(25, true, "<img=1>" + string, string,
					anLocalInt_98_, "<img=1>" + string_97_,
					0, string_100_, null);
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class350_Sub3.aClass166_5464) {
	    int anLocalInt = stream.g4();
	    int anLocalInt_101_
		= stream.g4m2143();
	    Class283.method3451((byte) -41);
	    Node_Sub49 class59_sub49
		= ((Node_Sub49)
		   Class2_Sub5.aJagexHashMap_3787.get((long) anLocalInt_101_));
	    Node_Sub49 class59_sub49_102_
		= ((Node_Sub49)
		   Class2_Sub5.aJagexHashMap_3787.get((long) anLocalInt));
	    if (class59_sub49_102_ != null)
		Class222_Sub2.method3037
		    (false,
		     (class59_sub49 == null
		      || (((Node_Sub49) class59_sub49_102_).anInt4291
			  != ((Node_Sub49) class59_sub49).anInt4291)),
		     class59_sub49_102_, -86709072);
	    if (class59_sub49 != null) {
		class59_sub49.unlink();
		Class2_Sub5.aJagexHashMap_3787.put((long) anLocalInt, class59_sub49);
	    }
	    RsInterface rsInterface
		= RsInterface.getByHash(anLocalInt_101_);
	    if (rsInterface != null)
		Class256.method3280(rsInterface, true);
	    rsInterface = RsInterface.getByHash(anLocalInt);
	    if (rsInterface != null) {
		Class256.method3280(rsInterface, true);
		RsInterface.autoLayoutChildren(true, rsInterface);
	    }
	    if (Class66.anInt467 != -1)
		Class62_Sub21.method1442((byte) -47, 1, Class66.anInt467);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class78.aClass166_551) {
	    Class232.method3094(Class117.aClass329_966, 59);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class24.aClass166_156 == Class93.aClass166_714) {
	    String string
		= stream.gstr();
	    Object[] objects = new Object[string.length() + 1];
	    for (int anLocalInt = string.length() - 1; anLocalInt >= 0;
		 anLocalInt--) {
		if (string.charAt(anLocalInt) == 's')
		    objects[anLocalInt + 1] = stream
						  .gstr();
		else
		    objects[anLocalInt + 1]
			= new Integer(stream
					  .g4());
	    }
	    objects[0] = new Integer(stream
					 .g4());
	    Class283.method3451((byte) -119);
	    Cs2Trigger class59_sub27 = new Cs2Trigger();
	    ((Cs2Trigger) class59_sub27).parameters = objects;
	    Cs2Runtime.executeTrigger(class59_sub27);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class298.aClass166_2474) {
	    MapRelated.readMapGenerationPacket();
	    Class93.aClass166_714 = null;
	    return false;
	}
	if (Class93.aClass166_714 == Node_Sub20.aClass166_4016) {
	    ((Packet) stream).pos += 28;
	    if (stream.checkcrc())
		Class_s.method3543((((Packet) stream)
				    .pos) - 28, stream, true);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class51.aClass166_384) {
	    ClientVariables.instance.resetAll();
	    ClanChannel.anInt4353 += 32;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class256_Sub2.aClass166_5623 == Class93.aClass166_714) {
	    if (Applet_Sub1.overridingFrame != null)
		Class127.method2418(-1, -352753888,
				    ((Node_Sub50)
				     AthmosphericConditions.aClass59_Sub50_116)
					.aClass62_Sub4_4300.method1368(74),
				    -1, false);
	    byte[] anLocalInts = new byte[anInt4454];
	    stream.method848(anInt4454, 0, (byte) -126, anLocalInts);
	    String string = Class239.method3127(anLocalInts, 1958, 0, anInt4454);
	    Class127.method2416(((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				    .aClass62_Sub26_4295.method1464(55) == 1,
				-22283, true, string, Applet_Sub1.baseSignlink);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Node_Sub47_Sub1.aClass166_6153) {
	    Class44.method429(argument ^ 0x6b, false);
	    Class93.aClass166_714 = null;
	    return false;
	}
	if (Statics.aClass166_1175 == Class93.aClass166_714) {
	    int anLocalInt
		= stream.g2i();
	    int anLocalInt_103_
		= stream.g4m2143();
	    Class283.method3451((byte) -86);
	    Statics.method249(-115, anLocalInt, anLocalInt_103_);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class62.aClass166_443) {
	    int anLocalInt = stream.g1n();
	    Class283.method3451((byte) -101);
	    Class350_Sub1.anInt5434 = anLocalInt;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class55.aClass166_406) {
	    int anLocalInt = stream.g2m128();
	    int anLocalInt_104_
		= stream.g4m2143();
	    ClientVariables.instance
		.setDefault(anLocalInt, anLocalInt_104_);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class122.aClass166_985) {
	    boolean anLocalBoolean
		= stream.g1() == 1;
	    String string
		= stream.gstr();
	    String string_105_ = string;
	    if (anLocalBoolean)
		string_105_
		    = stream.gstr();
	    long l = (long) stream.g2();
	    long l_106_ = (long) stream
				     .g3_dupl();
	    int anLocalInt
		= stream.g1();
	    long l_107_ = (l << 32) + l_106_;
	    boolean anLocalBoolean_108_ = false;
	while_95_:
	    do {
		for (int anLocalInt_109_ = 0; anLocalInt_109_ < 100;
		     anLocalInt_109_++) {
		    if (FileOnDisk.aLongArray1452[anLocalInt_109_] == l_107_) {
			anLocalBoolean_108_ = true;
			break while_95_;
		    }
		}
		if (anLocalInt <= 1) {
		    if (Class207.aBoolean1485 && !Class190.aBoolean1395
			|| Class128.aBoolean1042)
			anLocalBoolean_108_ = true;
		    else if (Class356.method3933(114, string_105_))
			anLocalBoolean_108_ = true;
		}
	    } while (false);
	    if (!anLocalBoolean_108_ && Node_Sub23.anInt4057 == 0) {
		FileOnDisk.aLongArray1452[Class285.anInt3635] = l_107_;
		Class285.anInt3635 = (Class285.anInt3635 + 1) % 100;
		String string_110_
		    = (Node_Sub31_Sub1.method878
                ((byte) -10,
                        Class303.method3566(stream,
                                -69)));
		if (anLocalInt == 2)
		    Class266.method3343(7, true, "<img=1>" + string, string,
					-1, "<img=1>" + string_105_, 0,
					string_110_, null);
		else if (anLocalInt != 1)
		    Class266.method3343(3, true, string, string, -1,
					string_105_, 0, string_110_, null);
		else
		    Class266.method3343(7, true, "<img=0>" + string, string,
					-1, "<img=0>" + string_105_, 0,
					string_110_, null);
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class46_Sub3_Sub1.aClass166_5738) {
	    int anLocalInt
		= stream.g4m();
	    if (anLocalInt != Class205.anInt1473) {
		Class205.anInt1473 = anLocalInt;
		Cs2Runtime.executeActionScript(Class211.aClass211_4294, -1, -1);
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class120.aClass166_978 == Class93.aClass166_714) {
	    if (Applet_Sub1.overridingFrame != null)
		Class127.method2418(-1, -352753888,
				    ((Node_Sub50)
				     AthmosphericConditions.aClass59_Sub50_116)
					.aClass62_Sub4_4300.method1368(65),
				    -1, false);
	    byte[] anLocalInts = new byte[anInt4454];
	    stream
		.method848(anInt4454, 0, (byte) 7, anLocalInts);
	    String string = Class239.method3127(anLocalInts, 1958, 0, anInt4454);
	    String string_111_ = "opensn";
	    if (!Applet_Sub1.useJavaScript
		|| (Class279.method3416
		    ((byte) 7, string, Applet_Sub1.baseSignlink, string_111_, 1)
		    .status) == 2)
		Statics.method3262(0, true, Applet_Sub1.baseSignlink, string_111_, string, (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116).aClass62_Sub26_4295.method1464(49) == 1));
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class123.aClass166_993) {
	    int anLocalInt = stream.g4();
	    Class283.method3451((byte) -73);
	    Cs2CallStackEntry.method1545(-1, anLocalInt, -1, true, 3);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class111_Sub1.aClass166_4612) {
	    Class282.aByte2275
		= stream.p1m128();
	    Class93.aClass166_714 = null;
	    if (Class282.aByte2275 == 0 || Class282.aByte2275 == 1)
		tia_sub_35_Sub2DoublyLinked.aBoolean6662 = true;
	    return true;
	}
	if (Class93.aClass166_714 == dba_sub_772_Sub1.aClass166_6362) {
	    Node_Sub47.method1113(Applet_Sub1.baseSignlink, stream,
                (byte) -112, anInt4454);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == DoublyLinkedNode_Sub51_Sub10.aClass166_5587) {
	    int anLocalInt
		= stream.g1();
	    String string
		= stream.gstr();
	    int anLocalInt_112_
		= stream.g1p128();
	    int anLocalInt_113_
		= stream.g2i();
	    if (anLocalInt_113_ == 65535)
		anLocalInt_113_ = -1;
	    if (anLocalInt >= 1 && anLocalInt <= 8) {
		if (string.equalsIgnoreCase("null"))
		    string = null;
		Node_Sub28_Sub1.aStringArray5831[anLocalInt - 1] = string;
		RuntimeException_Sub2.anIntArray3425[anLocalInt - 1]
		    = anLocalInt_113_;
		Node_Sub31_Sub16.aBooleanArray5908[anLocalInt - 1]
		    = anLocalInt_112_ == 0;
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class363.aClass166_3065 == Class93.aClass166_714) {
	    int anLocalInt = stream.g2ip128();
	    int anLocalInt_114_
		= stream.g2m128();
	    int anLocalInt_115_
		= stream.g2();
	    int anLocalInt_116_
		= stream.g4i_dupl();
	    Class283.method3451((byte) -126);
	    Node_Sub31_Sub11.method904((byte) -52, anLocalInt_115_,
                anLocalInt_116_, anLocalInt_114_,
                anLocalInt);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class222.aClass166_1555 == Class93.aClass166_714) {
	    int anLocalInt
		= stream.g2sp128();
	    int anLocalInt_117_
		= stream.g2s();
	    int anLocalInt_118_
		= stream.g4m();
	    Class283.method3451((byte) -110);
	    Class184.method2854(anLocalInt, anLocalInt_118_, (byte) 55,
				anLocalInt_117_);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class178.aClass166_1315 == Class93.aClass166_714) {
	    Statics.method3912(false, stream.gstr());
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class360.aClass166_3046) {
	    boolean anLocalBoolean
		= stream.g1() == 1;
	    String string
		= stream.gstr();
	    long l = (long) stream.g2();
	    long l_119_ = (long) stream
				     .g3_dupl();
	    int anLocalInt
		= stream.g1();
	    int anLocalInt_120_
		= stream.g2();
	    long l_121_ = l_119_ + (l << 32);
	    boolean anLocalBoolean_122_ = false;
	    Object object = null;
	    ClanChannel class59_sub53
		= (anLocalBoolean ? AbstractFont.aClass59_Sub53_420
		   : GameEnum.aClass59_Sub53_825);
	while_96_:
	    do {
		if (class59_sub53 == null)
		    anLocalBoolean_122_ = true;
		else {
		    for (int anLocalInt_123_ = 0; anLocalInt_123_ < 100;
			 anLocalInt_123_++) {
			if (l_121_
			    == FileOnDisk.aLongArray1452[anLocalInt_123_]) {
			    anLocalBoolean_122_ = true;
			    break while_96_;
			}
		    }
		    if (anLocalInt <= 1 && Class356.method3933(115, string))
			anLocalBoolean_122_ = true;
		}
	    } while (false);
	    if (!anLocalBoolean_122_ && Node_Sub23.anInt4057 == 0) {
		FileOnDisk.aLongArray1452[Class285.anInt3635] = l_121_;
		Class285.anInt3635 = (Class285.anInt3635 + 1) % 100;
		String string_124_
		    = DoublyLinkedNode_Sub51_Sub5.aClass66_6242.method1496
			  (anLocalInt_120_, 17408)
			  .method1279(stream, 15628);
		int anLocalInt_125_ = !anLocalBoolean ? 45 : 42;
		if (anLocalInt == 2 || anLocalInt == 3)
		    Class266.method3343(anLocalInt_125_, true,
					"<img=1>" + string, string,
					anLocalInt_120_, "<img=1>" + string, 0,
					string_124_,
					(((ClanChannel) class59_sub53)
					 .aString4357));
		else if (anLocalInt != 1)
		    Class266.method3343(anLocalInt_125_, true, string, string,
					anLocalInt_120_, string, 0,
					string_124_,
					(((ClanChannel) class59_sub53)
					 .aString4357));
		else
		    Class266.method3343(anLocalInt_125_, true,
					"<img=0>" + string, string,
					anLocalInt_120_, "<img=0>" + string, 0,
					string_124_,
					(((ClanChannel) class59_sub53)
					 .aString4357));
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class167.aClass166_1219) {
	    if (Class382.method4108(Statics.anInt1652, 92))
		DoublyLinkedNode_Sub51_Sub14.anInt6305
		    = (int) ((float) stream
					 .g2()
			     * 2.5F);
	    else
		DoublyLinkedNode_Sub51_Sub14.anInt6305
		    = stream
			  .g2() * 30;
	    JagexHashMap.anInt490 = Class359.anInt3038;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class62_Sub13.aClass166_4407 == Class93.aClass166_714) {
	    int anLocalInt = stream.g1_128p();
	    int anLocalInt_126_
		= stream.g2();
	    int anLocalInt_127_
		= stream.g4i_dupl();
	    int anLocalInt_128_
		= stream.g2ip128();
	    Class283.method3451((byte) -79);
	    Class274.method3390(anLocalInt_127_, anLocalInt, anLocalInt_128_,
				(byte) -63, anLocalInt_126_);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (FloatPacket.aClass166_5833 == Class93.aClass166_714) {
	    while (anInt4454
		   > (((Packet) stream)
		      .pos)) {
		boolean anLocalBoolean
		    = (stream.g1()
		       == 1);
		String string
		    = stream.gstr();
		String string_129_
		    = stream.gstr();
		int anLocalInt
		    = stream.g2();
		int anLocalInt_130_
		    = stream.g1();
		String string_131_ = "";
		boolean anLocalBoolean_132_ = false;
		if (anLocalInt > 0) {
		    string_131_ = stream
				      .gstr();
		    anLocalBoolean_132_
			= stream
			      .g1() == 1;
		}
		for (int anLocalInt_133_ = 0;
		     Class257.anInt2013 > anLocalInt_133_; anLocalInt_133_++) {
		    if (anLocalBoolean) {
			if (string_129_.equals(Class260.aStringArray2031
					       [anLocalInt_133_])) {
			    Class260.aStringArray2031[anLocalInt_133_]
				= string;
			    Statics.aStringArray4827[anLocalInt_133_]
				= string_129_;
			    string = null;
			    break;
			}
		    } else if (string.equals(Class260.aStringArray2031
					     [anLocalInt_133_])) {
			if (GraphicsToolkit.anIntArray941[anLocalInt_133_]
			    != anLocalInt) {
			    boolean anLocalBoolean_134_ = true;
			    for (DoublyLinkedNodeP2_Sub4_Sub2 class104_sub4_sub2
				     = ((DoublyLinkedNodeP2_Sub4_Sub2)
					Class120.aClass366_977.method3986(0));
				 class104_sub4_sub2 != null;
				 class104_sub4_sub2
				     = ((DoublyLinkedNodeP2_Sub4_Sub2)
					Class120.aClass366_977
					    .method3992((byte) 90))) {
				if (((DoublyLinkedNodeP2_Sub4_Sub2) class104_sub4_sub2)
					.aString6442.equals(string)) {
				    if (anLocalInt != 0
					&& (((DoublyLinkedNodeP2_Sub4_Sub2)
					     class104_sub4_sub2).aShort6444
					    == 0)) {
					class104_sub4_sub2
					    .unlink();
					anLocalBoolean_134_ = false;
				    } else if (anLocalInt == 0
					       && (((DoublyLinkedNodeP2_Sub4_Sub2)
						    class104_sub4_sub2)
						   .aShort6444) != 0) {
					class104_sub4_sub2
					    .unlink();
					anLocalBoolean_134_ = false;
				    }
				}
			    }
			    if (anLocalBoolean_134_)
				Class120.aClass366_977.method3983
				    (new DoublyLinkedNodeP2_Sub4_Sub2(string,
							    anLocalInt),
				     (byte) 119);
			    GraphicsToolkit.anIntArray941[anLocalInt_133_]
				= anLocalInt;
			}
			Statics.aStringArray4827[anLocalInt_133_]
			    = string_129_;
			DoublyLinkedNodeP2_Sub10.aStringArray4601[anLocalInt_133_]
			    = string_131_;
			dba_sub_772_Sub2.anIntArray6370[anLocalInt_133_]
			    = anLocalInt_130_;
			string = null;
			Statics.aBooleanArray4340[anLocalInt_133_]
			    = anLocalBoolean_132_;
			break;
		    }
		}
		if (string != null && Class257.anInt2013 < 200) {
		    Class260.aStringArray2031[Class257.anInt2013] = string;
		    Statics.aStringArray4827[Class257.anInt2013]
			= string_129_;
		    GraphicsToolkit.anIntArray941[Class257.anInt2013] = anLocalInt;
		    DoublyLinkedNodeP2_Sub10.aStringArray4601[Class257.anInt2013]
			= string_131_;
		    dba_sub_772_Sub2.anIntArray6370[Class257.anInt2013]
			= anLocalInt_130_;
		    Statics.aBooleanArray4340[Class257.anInt2013]
			= anLocalBoolean_132_;
		    Class257.anInt2013++;
		}
	    }
	    Class6.anInt72 = 2;
	    Class45.anInt316 = Class359.anInt3038;
	    boolean anLocalBoolean = false;
	    int anLocalInt = Class257.anInt2013;
	    while (anLocalInt > 0) {
		anLocalInt--;
		anLocalBoolean = true;
		for (int anLocalInt_135_ = 0; anLocalInt_135_ < anLocalInt;
		     anLocalInt_135_++) {
		    if ((((((GameServer) Statics.aGameServer_6149)
			   .id)
			  != GraphicsToolkit.anIntArray941[anLocalInt_135_])
			 && (GraphicsToolkit.anIntArray941[anLocalInt_135_ + 1]
			     == (((GameServer) Statics.aGameServer_6149)
				 .id)))
			|| (GraphicsToolkit.anIntArray941[anLocalInt_135_] == 0
			    && (GraphicsToolkit.anIntArray941[anLocalInt_135_ + 1]
				!= 0))) {
			int anLocalInt_136_
			    = GraphicsToolkit.anIntArray941[anLocalInt_135_];
			GraphicsToolkit.anIntArray941[anLocalInt_135_]
			    = GraphicsToolkit.anIntArray941[anLocalInt_135_ + 1];
			GraphicsToolkit.anIntArray941[anLocalInt_135_ + 1]
			    = anLocalInt_136_;
			String string
			    = DoublyLinkedNodeP2_Sub10.aStringArray4601[anLocalInt_135_];
			DoublyLinkedNodeP2_Sub10.aStringArray4601[anLocalInt_135_]
			    = (DoublyLinkedNodeP2_Sub10.aStringArray4601
			       [anLocalInt_135_ + 1]);
			DoublyLinkedNodeP2_Sub10.aStringArray4601[anLocalInt_135_ + 1]
			    = string;
			String string_137_
			    = Class260.aStringArray2031[anLocalInt_135_];
			Class260.aStringArray2031[anLocalInt_135_]
			    = Class260.aStringArray2031[anLocalInt_135_ + 1];
			Class260.aStringArray2031[anLocalInt_135_ + 1]
			    = string_137_;
			String string_138_
			    = Statics.aStringArray4827[anLocalInt_135_];
			Statics.aStringArray4827[anLocalInt_135_]
			    = (Statics.aStringArray4827
			       [anLocalInt_135_ + 1]);
			Statics.aStringArray4827[anLocalInt_135_ + 1]
			    = string_138_;
			int anLocalInt_139_
			    = dba_sub_772_Sub2.anIntArray6370[anLocalInt_135_];
			dba_sub_772_Sub2.anIntArray6370[anLocalInt_135_]
			    = (dba_sub_772_Sub2.anIntArray6370
			       [anLocalInt_135_ + 1]);
			dba_sub_772_Sub2.anIntArray6370[anLocalInt_135_ + 1]
			    = anLocalInt_139_;
			boolean anLocalBoolean_140_
			    = Statics.aBooleanArray4340[anLocalInt_135_];
			Statics.aBooleanArray4340[anLocalInt_135_]
			    = (Statics.aBooleanArray4340
			       [anLocalInt_135_ + 1]);
			anLocalBoolean = false;
			Statics.aBooleanArray4340[anLocalInt_135_ + 1]
			    = anLocalBoolean_140_;
		    }
		}
		if (anLocalBoolean)
		    break;
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Cs2CallStackEntry.aClass166_507) {
	    int anLocalInt = stream.g1_128p();
	    int anLocalInt_141_ = anLocalInt >> 2;
	    int anLocalInt_142_ = anLocalInt & 0x3;
	    int anLocalInt_143_
		= Node_Sub38.anIntArray4195[anLocalInt_141_];
	    int anLocalInt_144_
		= stream.g4();
	    int anLocalInt_145_ = anLocalInt_144_ >> 28 & 0x3;
	    int anLocalInt_146_ = anLocalInt_144_ >> 14 & 0x3fff;
	    int anLocalInt_147_ = anLocalInt_144_ & 0x3fff;
	    int anLocalInt_148_
		= stream.g2i();
	    anLocalInt_146_ -= MapRelated.baseX;
	    anLocalInt_147_ -= MapRelated.baseZ;
	    if (anLocalInt_148_ == 65535)
		anLocalInt_148_ = -1;
	    Class359.method3943(anLocalInt_147_, anLocalInt_141_, (byte) -8,
				anLocalInt_143_, anLocalInt_142_,
				anLocalInt_145_, anLocalInt_146_,
				anLocalInt_148_);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == GlTexture_Sub2.aClass166_5564) {
	    String string
		= stream.gstr();
	    int anLocalInt
		= stream.g4m();
	    Class283.method3451((byte) -118);
	    Statics.method3124(25243, anLocalInt, string);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Node_Sub31_Sub10.aClass166_5879 == Class93.aClass166_714) {
	    Class232.method3094(Class217.aClass329_1523, 39);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class77.aClass166_526 == Class93.aClass166_714) {
	    int anLocalInt = stream.g2();
	    int anLocalInt_149_
		= stream.g1();
	    boolean anLocalBoolean = (anLocalInt_149_ & 0x1) == 1;
	    while (((Packet) stream).pos
		   < anInt4454) {
		int anLocalInt_150_
		    = stream.gsmart(-2);
		int anLocalInt_151_
		    = stream.g2();
		int anLocalInt_152_ = 0;
		if (anLocalInt_151_ != 0) {
		    anLocalInt_152_ = stream
					  .g1();
		    if (anLocalInt_152_ == 255)
			anLocalInt_152_ = stream
					      .g4();
		}
		Class213.method2981(anLocalInt_150_, -101, anLocalBoolean,
				    anLocalInt, anLocalInt_151_ - 1,
				    anLocalInt_152_);
	    }
	    Class24.anIntArray160[MathStatics.AND(Class41.anInt306++, 31)]
		= anLocalInt;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class62_Sub7.aClass166_4391) {
	    Class232.method3094(dba_sub_772_Sub2.aClass329_6365, 100);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class96.aClass166_741) {
	    int anLocalInt = stream.g2();
	    if (anLocalInt == 65535)
		anLocalInt = -1;
	    int anLocalInt_153_
		= stream.g1();
	    int anLocalInt_154_
		= stream.g2();
	    int anLocalInt_155_
		= stream.g1();
	    Statics.method2520(true, anLocalInt_154_, anLocalInt_153_, -102, anLocalInt, anLocalInt_155_, 256);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == DoublyLinkedNode_Sub51_Sub15.aClass166_6317) {
	    boolean anLocalBoolean
		= stream.g1() == 1;
	    String string
		= stream.gstr();
	    String string_156_ = string;
	    if (anLocalBoolean)
		string_156_
		    = stream.gstr();
	    long l = stream.g8();
	    long l_157_
		= (long) stream.g2();
	    long l_158_ = (long) stream
				     .g3_dupl();
	    int anLocalInt
		= stream.g1();
	    int anLocalInt_159_
		= stream.g2();
	    long l_160_ = (l_157_ << 32) - -l_158_;
	    boolean anLocalBoolean_161_ = false;
	while_97_:
	    do {
		for (int anLocalInt_162_ = 0; anLocalInt_162_ < 100;
		     anLocalInt_162_++) {
		    if (l_160_ == FileOnDisk.aLongArray1452[anLocalInt_162_]) {
			anLocalBoolean_161_ = true;
			break while_97_;
		    }
		}
		if (anLocalInt <= 1 && Class356.method3933(113, string_156_))
		    anLocalBoolean_161_ = true;
	    } while (false);
	    if (!anLocalBoolean_161_ && Node_Sub23.anInt4057 == 0) {
		FileOnDisk.aLongArray1452[Class285.anInt3635] = l_160_;
		Class285.anInt3635 = (Class285.anInt3635 + 1) % 100;
		String string_163_
		    = DoublyLinkedNode_Sub51_Sub5.aClass66_6242.method1496
			  (anLocalInt_159_, 17408)
			  .method1279(stream, 15628);
		if (anLocalInt != 2) {
		    if (anLocalInt != 1)
			Class266.method3343(20, true, string, string,
					    anLocalInt_159_, string_156_, 0,
					    string_163_,
					    Class275.method3393(l, false));
		    else
			Class266.method3343(20, true, "<img=0>" + string,
					    string, anLocalInt_159_,
					    "<img=0>" + string_156_, 0,
					    string_163_,
					    Class275.method3393(l, false));
		} else
		    Class266.method3343(20, true, "<img=1>" + string, string,
					anLocalInt_159_,
					"<img=1>" + string_156_, 0,
					string_163_,
					Class275.method3393(l, false));
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Statics.aClass166_1409 == Class93.aClass166_714) {
	    Class214_Sub1.method2988(stream, anInt4454, 1442);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class260.aClass166_2027) {
	    int anLocalInt
		= stream.g4m();
	    int anLocalInt_164_
		= stream.g2ip128();
	    if (anLocalInt_164_ == 65535)
		anLocalInt_164_ = -1;
	    Class283.method3451((byte) -104);
	    Cs2CallStackEntry.method1545(anLocalInt_164_, anLocalInt, -1, true, 1);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class263.aClass166_3632 == Class93.aClass166_714) {
	    int anLocalInt = stream.g1n();
	    int anLocalInt_165_
		= stream.g1p128();
	    if (anLocalInt == 255) {
		anLocalInt = -1;
		anLocalInt_165_ = -1;
	    }
	    Statics.method1195(anLocalInt_165_, anLocalInt, argument ^ ~0x5d);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class166.aClass166_1215) {
	    Class58.anInt422
		= stream.g1();
	    JagexHashMap.anInt490 = Class359.anInt3038;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == DoublyLinkedNodeP2_Sub4_Sub2.aClass166_6443) {
	    int anLocalInt
		= stream.g4i_dupl();
	    int anLocalInt_166_ = stream
				      .g2m128();
	    if (anLocalInt_166_ == 65535)
		anLocalInt_166_ = -1;
	    int anLocalInt_167_
		= stream.g4m2143();
	    int anLocalInt_168_ = stream
				      .g2ip128();
	    if (anLocalInt_168_ == 65535)
		anLocalInt_168_ = -1;
	    Class283.method3451((byte) -118);
	    for (int anLocalInt_169_ = anLocalInt_166_;
		 anLocalInt_169_ <= anLocalInt_168_; anLocalInt_169_++) {
		long l = ((long) anLocalInt << 32) + (long) anLocalInt_169_;
		Node_Sub18 class59_sub18
		    = (Node_Sub18) Statics.aJagexHashMap_1249.get(l);
		Node_Sub18 class59_sub18_170_;
		if (class59_sub18 != null) {
		    class59_sub18_170_
			= new Node_Sub18(anLocalInt_167_,
					    (((Node_Sub18) class59_sub18)
					     .anInt4008));
		    class59_sub18.unlink();
		} else if (anLocalInt_169_ == -1)
		    class59_sub18_170_
			= (new Node_Sub18
			   (anLocalInt_167_,
			    ((Node_Sub18)
			     (((RsInterface)
			       RsInterface.getByHash(anLocalInt))
			      .aClass59_Sub18_1860)).anInt4008));
		else
		    class59_sub18_170_
			= new Node_Sub18(anLocalInt_167_, -1);
		Statics.aJagexHashMap_1249.put(l, class59_sub18_170_);
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class206.aClass166_1481) {
	    Class208.anInt1494
		= (stream.g1ns()
		   << 3);
	    Node_Sub31_Sub37.anInt6032
		= stream.g1ns() << 3;
	    Class379.anInt3227
		= stream.g1_128p();
	    while (((Packet) stream).pos
		   < anInt4454) {
		Class329 class329 = (Class148.method2527((byte) 43)
				     [stream
					  .g1()]);
		Class232.method3094(class329, 95);
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class41.aClass166_302 == Class93.aClass166_714) {
	    int anLocalInt = stream.g2m128();
	    String string
		= stream.gstr();
	    Class283.method3451((byte) -39);
	    Node_Sub32_Sub1.method1015(anLocalInt, (byte) -118, string);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class388.aClass166_3277 == Class93.aClass166_714) {
	    Class232.anInt1694 = Class359.anInt3038;
	    if (anInt4454 == 0) {
		Node_Sub13.aClass176Array3956 = null;
		Statics.aString2287 = null;
		Class307_Sub1.aString5416 = null;
		Class93.aClass166_714 = null;
		Statics.anInt2724 = 0;
		return true;
	    }
	    Class307_Sub1.aString5416
		= stream.gstr();
	    boolean anLocalBoolean = (stream
					  .g1()
				      == 1);
	    if (anLocalBoolean)
		stream.gstr();
	    long l = stream.g8();
	    Statics.aString2287 = JagexStringEncoding.decode(l);
	    Statics.aByte853
		= stream.g1s();
	    int anLocalInt
		= stream.g1();
	    if (anLocalInt == 255) {
		Class93.aClass166_714 = null;
		return true;
	    }
	    Statics.anInt2724 = anLocalInt;
	    Class176[] class176s = new Class176[100];
	    for (int anLocalInt_171_ = 0; Statics.anInt2724 > anLocalInt_171_;
		 anLocalInt_171_++) {
		class176s[anLocalInt_171_] = new Class176();
		((Class176) class176s[anLocalInt_171_]).aString1304
		    = stream.gstr();
		anLocalBoolean
		    = (stream.g1()
		       == 1);
		if (!anLocalBoolean)
		    ((Class176) class176s[anLocalInt_171_]).aString1303
			= ((Class176) class176s[anLocalInt_171_]).aString1304;
		else
		    ((Class176) class176s[anLocalInt_171_]).aString1303
			= stream
			      .gstr();
		((Class176) class176s[anLocalInt_171_]).aString1305
		    = Class359.method3948(argument + 18121,
					  (((Class176)
					    class176s[anLocalInt_171_])
					   .aString1303));
		((Class176) class176s[anLocalInt_171_]).anInt1307
		    = stream.g2();
		((Class176) class176s[anLocalInt_171_]).aByte1309
		    = stream.g1s();
		((Class176) class176s[anLocalInt_171_]).aString1306
		    = stream.gstr();
		if (((Class176) class176s[anLocalInt_171_]).aString1303.equals
		    (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		      Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
		     .aString6836))
		    Class72.aByte496
			= ((Class176) class176s[anLocalInt_171_]).aByte1309;
	    }
	    boolean anLocalBoolean_172_ = false;
	    int anLocalInt_173_ = Statics.anInt2724;
	    while (anLocalInt_173_ > 0) {
		anLocalBoolean_172_ = true;
		anLocalInt_173_--;
		for (int anLocalInt_174_ = 0;
		     anLocalInt_174_ < anLocalInt_173_; anLocalInt_174_++) {
		    if ((((Class176) class176s[anLocalInt_174_])
			     .aString1305.compareTo
			 (((Class176) class176s[anLocalInt_174_ + 1])
			  .aString1305))
			> 0) {
			Class176 class176 = class176s[anLocalInt_174_];
			class176s[anLocalInt_174_]
			    = class176s[anLocalInt_174_ + 1];
			class176s[anLocalInt_174_ + 1] = class176;
			anLocalBoolean_172_ = false;
		    }
		}
		if (anLocalBoolean_172_)
		    break;
	    }
	    Node_Sub13.aClass176Array3956 = class176s;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Statics.aClass166_5519) {
	    MapRelated.readRegionPacket();
	    Class93.aClass166_714 = null;
	    return false;
	}
	if (Class151.aClass166_1145 == Class93.aClass166_714) {
	    Class283.method3451((byte) -74);
	    tia_sub_35_Sub1DoublyLinked.method1222((byte) -116);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class75.aClass166_512 == Class93.aClass166_714) {
	    int anLocalInt
		= stream.g4m2143();
	    int anLocalInt_175_
		= stream.g2m128();
	    int anLocalInt_176_
		= stream.g2m128();
	    int anLocalInt_177_
		= stream.g2();
	    Class283.method3451((byte) -99);
	    Cs2CallStackEntry.method1545(anLocalInt_175_ | anLocalInt_176_ << 16, anLocalInt, anLocalInt_177_, true, 7);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Node_Sub31_Sub38.aClass166_6042) {
	    int anLocalInt = stream
				 .g1();
	    int anLocalInt_178_ = anLocalInt >> 5;
	    int anLocalInt_179_ = anLocalInt & 0x1f;
	    if (anLocalInt_179_ == 0) {
		Class166.aClass124Array1216[anLocalInt_178_] = null;
		Class93.aClass166_714 = null;
		return true;
	    }
	    Class124 class124 = new Class124();
	    ((Class124) class124).anInt1007 = anLocalInt_179_;
	    ((Class124) class124).anInt1009
		= stream.g1();
	    if (((Class124) class124).anInt1009 >= 0
		&& (Class17.aClass368Array123.length
		    > ((Class124) class124).anInt1009)) {
		if (((Class124) class124).anInt1007 == 1
		    || ((Class124) class124).anInt1007 == 10) {
		    ((Class124) class124).anInt1008
			= stream.g2();
		    ((Packet) stream)
			.pos
			+= 6;
		} else if (((Class124) class124).anInt1007 >= 2
			   && ((Class124) class124).anInt1007 <= 6) {
		    if (((Class124) class124).anInt1007 == 2) {
			((Class124) class124).anInt1010 = 256;
			((Class124) class124).anInt1006 = 256;
		    }
		    if (((Class124) class124).anInt1007 == 3) {
			((Class124) class124).anInt1006 = 256;
			((Class124) class124).anInt1010 = 0;
		    }
		    if (((Class124) class124).anInt1007 == 4) {
			((Class124) class124).anInt1006 = 256;
			((Class124) class124).anInt1010 = 512;
		    }
		    if (((Class124) class124).anInt1007 == 5) {
			((Class124) class124).anInt1006 = 0;
			((Class124) class124).anInt1010 = 256;
		    }
		    if (((Class124) class124).anInt1007 == 6) {
			((Class124) class124).anInt1006 = 512;
			((Class124) class124).anInt1010 = 256;
		    }
		    ((Class124) class124).anInt1007 = 2;
		    ((Class124) class124).anInt1011
			= stream
			      .g1();
		    ((Class124) class124).anInt1010
			+= (stream
				.g2()
			    - MapRelated.baseX) << 9;
		    ((Class124) class124).anInt1006
			+= (stream.g2()
			    - MapRelated.baseZ) << 9;
		    ((Class124) class124).anInt1003
			= stream
			      .g1() << 2;
		    ((Class124) class124).anInt1004
			= stream.g2();
		}
		((Class124) class124).anInt1005
		    = stream
			  .g2();
		if (((Class124) class124).anInt1005 == 65535)
		    ((Class124) class124).anInt1005 = -1;
		Class166.aClass124Array1216[anLocalInt_178_] = class124;
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class166.aClass166_1218 == Class93.aClass166_714) {
	    if (Class66.anInt467 != -1)
		Class62_Sub21.method1442((byte) -47, 0, Class66.anInt467);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class189_Sub3.aClass166_5644) {
	    Class232.method3094(Class353_Sub2.aClass329_5480, argument + 100);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Canvas_Sub1.aClass166_30) {
	    int anLocalInt
		= stream.g1p128();
	    int anLocalInt_180_
		= stream.g2ip128();
	    if (anLocalInt_180_ == 65535)
		anLocalInt_180_ = -1;
	    int anLocalInt_181_
		= stream.g1p128();
	    Node_Sub31_Sub8.method898(argument - 29, anLocalInt_181_,
                anLocalInt, anLocalInt_180_);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == tia_sub_35DoublyLinked.aClass166_6251) {
	    int anLocalInt
		= stream.g3();
	    int anLocalInt_182_
		= stream.g2();
	    if (anLocalInt_182_ == 65535)
		anLocalInt_182_ = -1;
	    int anLocalInt_183_
		= stream.g1_128p();
	    DoublyLinkedNodeP2_Sub10.method1945(anLocalInt_182_, anLocalInt_183_,
				      (byte) -124, anLocalInt);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (DoublyLinkedNodeP2_Sub4.aClass166_4529 == Class93.aClass166_714) {
	    Class114.anInt949 = Class359.anInt3038;
	    boolean anLocalBoolean
		= stream.g1() == 1;
	    if (anInt4454 == 1) {
		Class93.aClass166_714 = null;
		if (anLocalBoolean)
		    Node_Sub32.aClanSettings_4143 = null;
		else
		    Node_Sub31_Sub13.aClanSettings_5899 = null;
		return true;
	    }
	    if (anLocalBoolean)
		Node_Sub32.aClanSettings_4143
		    = new ClanSettings(stream);
	    else
		Node_Sub31_Sub13.aClanSettings_5899
		    = new ClanSettings(stream);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (DoublyLinkedNode_Sub51_Sub20.aClass166_6358 == Class93.aClass166_714) {
	    Statics.anInt5603 = Class359.anInt3038;
	    boolean anLocalBoolean = (stream
					  .g1()
				      == 1);
	    if (anInt4454 == 1) {
		Class93.aClass166_714 = null;
		if (!anLocalBoolean)
		    GameEnum.aClass59_Sub53_825 = null;
		else
		    AbstractFont.aClass59_Sub53_420 = null;
		return true;
	    }
	    if (!anLocalBoolean)
		GameEnum.aClass59_Sub53_825
		    = new ClanChannel(stream);
	    else
		AbstractFont.aClass59_Sub53_420
		    = new ClanChannel(stream);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Statics.aClass166_1410) {
	    Cs2CallStackEntry.anInt510 = stream.g2s();
	    JagexHashMap.anInt490 = Class359.anInt3038;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class47.aClass166_338) {
	    int anLocalInt
		= stream.g2();
	    byte anLocalInt_184_
		= stream.p1m128();
	    Class283.method3451((byte) -103);
	    Class365.method3970(anLocalInt_184_, anLocalInt, 0);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class31.aClass166_208 == Class93.aClass166_714) {
	    String string
		= stream.gstr();
	    int anLocalInt = stream.g2();
	    String string_185_
		= (DoublyLinkedNode_Sub51_Sub5.aClass66_6242.method1496
		       (anLocalInt, argument + 17406).method1279
		   (stream, argument + 15626));
	    Class266.method3343(19, true, string, string, anLocalInt, string,
				0, string_185_, null);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class256.aClass166_3526) {
	    Class232.method3094(Node_Sub13.aClass329_3982, 99);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class138.aClass166_1089) {
	    int anLocalInt = stream.g2();
	    if (anLocalInt == 65535)
		anLocalInt = -1;
	    int anLocalInt_186_
		= stream.g1();
	    int anLocalInt_187_
		= stream.g2();
	    int anLocalInt_188_
		= stream.g1();
	    int anLocalInt_189_
		= stream.g2();
	    Statics.method2520(false, anLocalInt_187_, anLocalInt_186_, argument ^ ~0x2a, anLocalInt, anLocalInt_188_, anLocalInt_189_);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == DoublyLinkedNode_Sub51_Sub11.aClass166_6284) {
	    int anLocalInt = stream.g2m128();
	    int anLocalInt_190_
		= stream.g2i();
	    Class283.method3451((byte) -80);
	    Node_Sub6.method560(anLocalInt_190_, 0, anLocalInt, false);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (OutputStream_Sub2.aClass166_45 == Class93.aClass166_714) {
	    int anLocalInt
		= stream.g2i();
	    int anLocalInt_191_
		= stream.g4i_dupl();
	    ClientVariables.instance
		.setVarbitDefault(anLocalInt, anLocalInt_191_);
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Node_Sub47_Sub7.aClass166_6190 == Class93.aClass166_714) {
	    int anLocalInt = stream.g2m128();
	    int anLocalInt_192_
		= stream.g1n();
	    boolean anLocalBoolean = (anLocalInt_192_ & 0x1) == 1;
	    Class38.method395(anLocalInt, anLocalBoolean, argument + 72);
	    Class24.anIntArray160[MathStatics.AND(31, Class41.anInt306++)]
		= anLocalInt;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Class391.aClass166_3288) {
	    int anLocalInt
		= stream.g1p128();
	    int anLocalInt_193_
		= stream.g2m128();
	    int anLocalInt_194_
		= stream.g2i();
	    int anLocalInt_195_
		= stream.g2ip128();
	    int anLocalInt_196_
		= stream.g1_128p();
	    int anLocalInt_197_
		= stream.g4m();
	    int anLocalInt_198_ = anLocalInt_196_ & 0x7;
	    int anLocalInt_199_ = anLocalInt_196_ >> 3 & 0xf;
	    if (anLocalInt_199_ == 15)
		anLocalInt_199_ = -1;
	    if (anLocalInt_197_ >> 30 != 0) {
		int anLocalInt_200_ = anLocalInt_197_ >> 28 & 0x3;
		int anLocalInt_201_
		    = -MapRelated.baseX + (anLocalInt_197_ >> 14 & 0x3fff);
		int anLocalInt_202_
		    = -MapRelated.baseZ + (anLocalInt_197_ & 0x3fff);
		if (anLocalInt_201_ >= 0 && anLocalInt_202_ >= 0
		    && anLocalInt_201_ < MapRelated.mapWidth
		    && anLocalInt_202_ < MapRelated.mapDepth) {
		    int anLocalInt_203_ = anLocalInt_201_ * 512 + 256;
		    int anLocalInt_204_ = anLocalInt_202_ * 512 + 256;
		    int anLocalInt_205_ = anLocalInt_200_;
		    if (anLocalInt_205_ < 3
			&& Class274.method3388(anLocalInt_201_,
					       anLocalInt_202_, 1))
			anLocalInt_205_++;
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub4 class104_sub2_sub2_sub4
			= (new DoublyLinkedNodeP2_Sub2_Sub2_Sub4
			   (anLocalInt_194_, anLocalInt_195_,
			    Class333.anInt2720, anLocalInt_200_,
			    anLocalInt_205_, anLocalInt_203_,
			    (-anLocalInt_193_
			     + Node_Sub31_Sub36.method993(anLocalInt_200_,
                        anLocalInt_203_,
                        (argument
                                ^ ~0x2f05),
                        anLocalInt_204_)),
			    anLocalInt_204_, anLocalInt_201_, anLocalInt_201_,
			    anLocalInt_202_, anLocalInt_202_,
			    anLocalInt_198_));
		    Class305.aCyclicLinkedList_3640.add(new DoublyLinkedNode_Sub51_Sub2(class104_sub2_sub2_sub4));
		}
	    } else if (anLocalInt_197_ >> 29 == 0) {
		if (anLocalInt_197_ >> 28 != 0) {
		    int anLocalInt_206_ = anLocalInt_197_ & 0xffff;
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2;
		    if (anLocalInt_206_ == Class64.anInt451)
			class104_sub2_sub2_sub5_sub2
			    = Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587;
		    else
			class104_sub2_sub2_sub5_sub2
			    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
			       [anLocalInt_206_]);
		    if (class104_sub2_sub2_sub5_sub2 != null) {
			if (anLocalInt_194_ == 65535)
			    anLocalInt_194_ = -1;
			Class269 class269 = (((Entity)
					      class104_sub2_sub2_sub5_sub2)
					     .aClass269Array6759[anLocalInt]);
			boolean anLocalBoolean = true;
			int anLocalInt_207_ = ((Class269) class269).anInt2150;
			if (anLocalInt_194_ != -1 && anLocalInt_207_ != -1) {
			    if (anLocalInt_194_ != anLocalInt_207_) {
				Class126 class126
				    = (Class194.aClass225_1414.method3054
				       ((byte) 106, anLocalInt_194_));
				Class126 class126_208_
				    = (Class194.aClass225_1414.method3054
				       ((byte) 121, anLocalInt_207_));
				if (((Class126) class126).anInt1034 != -1
				    && (((Class126) class126_208_).anInt1034
					!= -1)) {
				    Class367 class367
					= (DoublyLinkedNodeP2_Sub2_Sub4
					       .aClass336_6425.method3758
					   (((Class126) class126).anInt1034,
					    argument - 2));
				    Class367 class367_209_
					= (DoublyLinkedNodeP2_Sub2_Sub4
					       .aClass336_6425.method3758
					   ((((Class126) class126_208_)
					     .anInt1034),
					    0));
				    if (((Class367) class367).anInt3099
					< ((Class367) class367_209_).anInt3099)
					anLocalBoolean = false;
				}
			    } else {
				Class126 class126
				    = (Class194.aClass225_1414.method3054
				       ((byte) 109, anLocalInt_194_));
				if (((Class126) class126).aBoolean1035
				    && ((Class126) class126).anInt1034 != -1) {
				    Class367 class367
					= (DoublyLinkedNodeP2_Sub2_Sub4
					       .aClass336_6425.method3758
					   (((Class126) class126).anInt1034,
					    0));
				    int anLocalInt_210_
					= ((Class367) class367).anInt3106;
				    if (anLocalInt_210_ == 0
					|| anLocalInt_210_ == 2)
					anLocalBoolean = false;
				    else if (anLocalInt_210_ == 1)
					anLocalBoolean = true;
				}
			    }
			}
			if (anLocalBoolean) {
			    ((Class269) class269).anInt2148 = 1;
			    ((Class269) class269).anInt2150 = anLocalInt_194_;
			    ((Class269) class269).anInt2157
				= Class333.anInt2720 + anLocalInt_195_;
			    ((Class269) class269).anInt2146 = anLocalInt_193_;
			    ((Class269) class269).anInt2151 = anLocalInt_198_;
			    ((Class269) class269).anInt2158 = anLocalInt_199_;
			    ((Class269) class269).anInt2159 = 0;
			    ((Class269) class269).anInt2156 = 0;
			    if (((Class269) class269).anInt2150 == 65535)
				((Class269) class269).anInt2150 = -1;
			    if (Class333.anInt2720
				< ((Class269) class269).anInt2157)
				((Class269) class269).anInt2159 = -1;
			    if (((Class269) class269).anInt2150 != -1
				&& (((Class269) class269).anInt2157
				    == Class333.anInt2720)) {
				int anLocalInt_211_
				    = (((Class126)
					(Class194.aClass225_1414.method3054
					 ((byte) 97,
					  ((Class269) class269).anInt2150)))
				       .anInt1034);
				if (anLocalInt_211_ != -1) {
				    Class367 class367
					= DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
					      .method3758(anLocalInt_211_, 0);
				    if (class367 != null
					&& (((Class367) class367)
					    .anIntArray3096) != null
					&& !(((Entity)
					      class104_sub2_sub2_sub5_sub2)
					     .aBoolean6751))
					Class313.method3622
					    (class104_sub2_sub2_sub5_sub2, 0,
					     class367, 0);
				}
			    }
			}
		    }
		}
	    } else {
		int anLocalInt_212_ = anLocalInt_197_ & 0xffff;
		Node_Sub35 class59_sub35
		    = ((Node_Sub35)
		       Class294.aJagexHashMap_2453
			   .get((long) anLocalInt_212_));
		if (class59_sub35 != null) {
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
			= (((Node_Sub35) class59_sub35)
			   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
		    Class269 class269 = (((Entity)
					  class104_sub2_sub2_sub5_sub1)
					 .aClass269Array6759[anLocalInt]);
		    if (anLocalInt_194_ == 65535)
			anLocalInt_194_ = -1;
		    boolean anLocalBoolean = true;
		    int anLocalInt_213_ = ((Class269) class269).anInt2150;
		    if (anLocalInt_194_ != -1 && anLocalInt_213_ != -1) {
			if (anLocalInt_194_ != anLocalInt_213_) {
			    Class126 class126
				= Class194.aClass225_1414
				      .method3054((byte) 112, anLocalInt_194_);
			    Class126 class126_214_
				= Class194.aClass225_1414
				      .method3054((byte) 119, anLocalInt_213_);
			    if (((Class126) class126).anInt1034 != -1
				&& (((Class126) class126_214_).anInt1034
				    != -1)) {
				Class367 class367
				    = (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
					   .method3758
				       (((Class126) class126).anInt1034, 0));
				Class367 class367_215_
				    = (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
					   .method3758
				       (((Class126) class126_214_).anInt1034,
					argument - 2));
				if (((Class367) class367_215_).anInt3099
				    > ((Class367) class367).anInt3099)
				    anLocalBoolean = false;
			    }
			} else {
			    Class126 class126
				= Class194.aClass225_1414
				      .method3054((byte) 86, anLocalInt_194_);
			    if (((Class126) class126).aBoolean1035
				&& ((Class126) class126).anInt1034 != -1) {
				Class367 class367
				    = (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
					   .method3758
				       (((Class126) class126).anInt1034, 0));
				int anLocalInt_216_
				    = ((Class367) class367).anInt3106;
				if (anLocalInt_216_ != 0
				    && anLocalInt_216_ != 2) {
				    if (anLocalInt_216_ == 1)
					anLocalBoolean = true;
				} else
				    anLocalBoolean = false;
			    }
			}
		    }
		    if (anLocalBoolean) {
			((Class269) class269).anInt2148 = 1;
			((Class269) class269).anInt2151 = anLocalInt_198_;
			((Class269) class269).anInt2146 = anLocalInt_193_;
			((Class269) class269).anInt2159 = 0;
			((Class269) class269).anInt2150 = anLocalInt_194_;
			((Class269) class269).anInt2156 = 0;
			((Class269) class269).anInt2158 = anLocalInt_199_;
			((Class269) class269).anInt2157
			    = anLocalInt_195_ + Class333.anInt2720;
			if (((Class269) class269).anInt2157
			    > Class333.anInt2720)
			    ((Class269) class269).anInt2159 = -1;
			if (((Class269) class269).anInt2150 == 65535)
			    ((Class269) class269).anInt2150 = -1;
			if (((Class269) class269).anInt2150 != -1
			    && (((Class269) class269).anInt2157
				== Class333.anInt2720)) {
			    int anLocalInt_217_
				= (((Class126)
				    (Class194.aClass225_1414.method3054
				     ((byte) 97,
				      ((Class269) class269).anInt2150)))
				   .anInt1034);
			    if (anLocalInt_217_ != -1) {
				Class367 class367
				    = DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
					  .method3758(anLocalInt_217_, 0);
				if (class367 != null
				    && (((Class367) class367).anIntArray3096
					!= null)
				    && !(((Entity)
					  class104_sub2_sub2_sub5_sub1)
					 .aBoolean6751))
				    Class313.method3622
					(class104_sub2_sub2_sub5_sub1,
					 argument ^ 0x2, class367, 0);
			    }
			}
		    }
		}
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class191.aClass166_1406 == Class93.aClass166_714) {
	    int anLocalInt
		= stream.g2();
	    int anLocalInt_218_
		= stream.g2();
	    int anLocalInt_219_
		= stream.g2();
	    Class283.method3451((byte) -84);
	    if (RsInterface.anInterfaces[anLocalInt] != null) {
		for (int anLocalInt_220_ = anLocalInt_218_;
		     anLocalInt_220_ < anLocalInt_219_; anLocalInt_220_++) {
		    int anLocalInt_221_ = stream
					      .g3_dupl();
		    if (anLocalInt_220_ < (RsInterface
					   .anInterfaces
					   [anLocalInt]).length
			&& (RsInterface.anInterfaces[anLocalInt]
			    [anLocalInt_220_]) != null)
			((RsInterface) (RsInterface.anInterfaces
				     [anLocalInt][anLocalInt_220_])).anInt1916
			    = anLocalInt_221_;
		}
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class62_Sub6.aClass166_4385 == Class93.aClass166_714) {
	    int anLocalInt
		= stream.g1();
	    if (stream.g1() == 0)
		Class128.aClass272Array1043[anLocalInt] = new Class272();
	    else {
		((Packet) stream).pos--;
		Class128.aClass272Array1043[anLocalInt]
		    = new Class272(stream);
	    }
	    Node_Sub47_Sub1.anInt6155 = Class359.anInt3038;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (Class93.aClass166_714 == Node_Sub9_Sub2.aClass166_5762) {
	    boolean anLocalBoolean
		= stream.g1() == 1;
	    String string
		= stream.gstr();
	    String string_222_ = string;
	    if (anLocalBoolean)
		string_222_
		    = stream.gstr();
	    long l = (long) stream.g2();
	    long l_223_ = (long) stream
				     .g3_dupl();
	    int anLocalInt
		= stream.g1();
	    int anLocalInt_224_
		= stream.g2();
	    long l_225_ = (l << 32) + l_223_;
	    boolean anLocalBoolean_226_ = false;
	while_98_:
	    do {
		for (int anLocalInt_227_ = 0; anLocalInt_227_ < 100;
		     anLocalInt_227_++) {
		    if (l_225_ == FileOnDisk.aLongArray1452[anLocalInt_227_]) {
			anLocalBoolean_226_ = true;
			break while_98_;
		    }
		}
		if (anLocalInt <= 1 && Class356.method3933(117, string_222_))
		    anLocalBoolean_226_ = true;
	    } while (false);
	    if (!anLocalBoolean_226_ && Node_Sub23.anInt4057 == 0) {
		FileOnDisk.aLongArray1452[Class285.anInt3635] = l_225_;
		Class285.anInt3635 = (Class285.anInt3635 + 1) % 100;
		String string_228_
		    = DoublyLinkedNode_Sub51_Sub5.aClass66_6242.method1496
			  (anLocalInt_224_, 17408)
			  .method1279(stream, 15628);
		if (anLocalInt != 2) {
		    if (anLocalInt != 1)
			Class266.method3343(18, true, string, string,
					    anLocalInt_224_, string_222_, 0,
					    string_228_, null);
		    else
			Class266.method3343(18, true, "<img=0>" + string,
					    string, anLocalInt_224_,
					    "<img=0>" + string_222_, 0,
					    string_228_, null);
		} else
		    Class266.method3343(18, true, "<img=1>" + string, string,
					anLocalInt_224_,
					"<img=1>" + string_222_, 0,
					string_228_, null);
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (OutputStream_Sub2.aClass166_46 == Class93.aClass166_714) {
	    Class316.aString2615
		= (anInt4454 <= 2
		   ? MultilanguageString.WALK_HERE.getLocalizedString(client.language)
		   : stream.gstr());
	    Class8.anInt82
		= (anInt4454 > 0
		   ? stream.g2() : -1);
	    if (Class8.anInt82 == 65535)
		Class8.anInt82 = -1;
	    Class93.aClass166_714 = null;
	    return true;
	}
	if (MenuAction.aClass166_6267 == Class93.aClass166_714) {
	    int anLocalInt
		= stream.g4i_dupl();
	    int anLocalInt_229_
		= stream.g2i();
	    if (anLocalInt_229_ == 65535)
		anLocalInt_229_ = -1;
	    int anLocalInt_230_
		= stream.g2m128();
	    int anLocalInt_231_
		= stream.g2i();
	    if (anLocalInt_231_ == 65535)
		anLocalInt_231_ = -1;
	    Class283.method3451((byte) -68);
	    for (int anLocalInt_232_ = anLocalInt_229_;
		 anLocalInt_232_ <= anLocalInt_231_; anLocalInt_232_++) {
		long l = (long) anLocalInt_232_ + ((long) anLocalInt << 32);
		Node_Sub18 class59_sub18
		    = ((Node_Sub18)
		       Statics.aJagexHashMap_1249.get(l));
		Node_Sub18 class59_sub18_233_;
		if (class59_sub18 == null) {
		    if (anLocalInt_232_ == -1)
			class59_sub18_233_
			    = (new Node_Sub18
			       (((Node_Sub18)
				 (((RsInterface)
				   RsInterface.getByHash(anLocalInt))
				  .aClass59_Sub18_1860)).anInt4005,
				anLocalInt_230_));
		    else
			class59_sub18_233_
			    = new Node_Sub18(0, anLocalInt_230_);
		} else {
		    class59_sub18_233_
			= new Node_Sub18((((Node_Sub18) class59_sub18)
					     .anInt4005),
					    anLocalInt_230_);
		    class59_sub18.unlink();
		}
		Statics.aJagexHashMap_1249.put(l, class59_sub18_233_);
	    }
	    Class93.aClass166_714 = null;
	    return true;
	}
	ErrorReporting.reportError(("T1 - " + (Class93.aClass166_714 != null ? Class93.aClass166_714.method2633((byte) -125) : -1) + "," + (Class190.aClass166_1396 != null ? Class190.aClass166_1396.method2633((byte) -120) : -1) + "," + (Class62_Sub16.aClass166_4418 == null ? -1 : Class62_Sub16.aClass166_4418.method2633((byte) -119)) + " - " + anInt4454), null);
	Class44.method429(121, false);
	return true;
    }

    static final boolean method1114() {
	try {
	    return method4043(2);
	} catch (IOException ioexception) {
	    Node_Sub11.method685((byte) -54);
	    return true;
	} catch (Exception exception) {
	    String string
		= ("T2 - "
		   + (Class93.aClass166_714 != null
		      ? Class93.aClass166_714.method2633((byte) -120) : -1)
		   + ","
		   + (Class190.aClass166_1396 == null ? -1
		      : Class190.aClass166_1396.method2633((byte) -121))
		   + ","
		   + (Class62_Sub16.aClass166_4418 != null
		      ? Class62_Sub16.aClass166_4418.method2633((byte) -124)
		      : -1)
		   + " - " + anInt4454 + ","
		   + (MapRelated.baseX
		      + (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587
			 .pathX[0]))
		   + ","
		   + (MapRelated.baseZ
		      + (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587
			 .pathZ[0]))
		   + " - ");
	    for (int anLocalInt = 0;
		 anLocalInt < anInt4454 && anLocalInt < 50;
		 anLocalInt++)
		string += (stream
			   .data[anLocalInt]) + ",";
	    ErrorReporting.reportError(string, exception);
	    Class44.method429(93, false);
	    return true;
	}
    }
}
