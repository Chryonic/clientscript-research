/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class234
{
    int anInt1700;
    private int anInt1701;
    private int anInt1702;
    private String aString1703 = "";
    int anInt1704;
    private int anInt1705;
    private int anInt1706;
    int anInt1707;
    int anInt1708;
    int anInt1709;
    static Class207 aClass207_1710 = new Class207(42, -1);
    int anInt1711;
    Class115 aClass115_1712;
    int anInt1713;
    int anInt1714;
    static int anInt1715;
    static int anInt1716 = 0;
    
    public static void method3100(byte argument) {
	aClass207_1710 = null;
    }
    
    final Class368 method3101(GraphicsToolkit argument_0_, int argument_1_) {
	if (argument_1_ > anInt1702)
	    return null;
	Class368 class368
	    = (Class368) ((Class115) ((Class234) this).aClass115_1712)
			     .aClass149_953.get((long) anInt1702);
	if (class368 == null) {
	    method3105(argument_1_ ^ 0xffffffff, argument_0_);
	    class368 = (Class368) ((Class115) ((Class234) this).aClass115_1712)
				      .aClass149_953
				      .get((long) anInt1702);
	}
	return class368;
    }
    
    final String method3102(byte argument_2_, int argument_3_) {
	String string = aString1703;
	for (;;) {
	    int anLocalInt = string.indexOf("%1");
	    if (anLocalInt < 0)
		break;
	    string = (string.substring(0, anLocalInt)
		      + Statics.method1499(argument_3_, 16051, false)
		      + string.substring(anLocalInt + 2));
	}
	return string;
    }
    
    final Class368 method3103(GraphicsToolkit argument_4_, int argument_5_) {
	if (anInt1706 < argument_5_)
	    return null;
	Class368 class368
	    = (Class368) ((Class115) ((Class234) this).aClass115_1712)
			     .aClass149_953.get((long) anInt1706);
	if (class368 == null) {
	    method3105(argument_5_ - 1, argument_4_);
	    class368 = (Class368) ((Class115) ((Class234) this).aClass115_1712)
				      .aClass149_953
				      .get((long) anInt1706);
	}
	return class368;
    }
    
    private final void method3104(int argument_6_, Packet argument_7_,
				  int argument_8_) {
	if (argument_6_ != 2)
	    aString1703 = null;
	if (argument_8_ != 1) {
	    if (argument_8_ == 2)
		((Class234) this).anInt1713
		    = argument_7_.g3_dupl();
	    else if (argument_8_ == 3)
		anInt1701 = argument_7_.g2();
	    else if (argument_8_ == 4)
		anInt1705 = argument_7_.g2();
	    else if (argument_8_ != 5) {
		if (argument_8_ == 6)
		    anInt1702 = argument_7_.g2();
		else if (argument_8_ == 7)
		    ((Class234) this).anInt1704 = argument_7_.g2s();
		else if (argument_8_ != 8) {
		    if (argument_8_ != 9) {
			if (argument_8_ == 10)
			    ((Class234) this).anInt1707
				= argument_7_.g2s();
			else if (argument_8_ == 11)
			    ((Class234) this).anInt1714 = 0;
			else if (argument_8_ != 12) {
			    if (argument_8_ == 13)
				((Class234) this).anInt1700
				    = argument_7_.g2s();
			    else if (argument_8_ == 14)
				((Class234) this).anInt1714
				    = argument_7_.g2();
			} else
			    ((Class234) this).anInt1708
				= argument_7_
				      .g1();
		    } else
			((Class234) this).anInt1711
			    = argument_7_.g2();
		} else
		    aString1703 = argument_7_.gjstr2();
	    } else
		anInt1706 = argument_7_.g2();
	} else
	    ((Class234) this).anInt1709 = argument_7_.g2();
    }
    
    private final void method3105(int argument_9_, GraphicsToolkit argument_10_) {
	Js5Store js5Store
	    = ((Class115) ((Class234) this).aClass115_1712).aJs5Store_952;
	if (anInt1701 >= 0
	    && ((Class115) ((Class234) this).aClass115_1712).aClass149_953
		   .get((long) anInt1701) == null
	    && js5Store.isFlatFile(anInt1701)) {
	    Class83 class83 = Class83.method1609(js5Store, anInt1701);
	    ((Class115) ((Class234) this).aClass115_1712).aClass149_953
		.put(argument_10_.method2033(class83, true), (long) anInt1701);
	}
	if (anInt1706 >= 0
	    && ((Class115) ((Class234) this).aClass115_1712).aClass149_953
		   .get((long) anInt1706) == null
	    && js5Store.isFlatFile(anInt1706)) {
	    Class83 class83 = Class83.method1609(js5Store, anInt1706);
	    ((Class115) ((Class234) this).aClass115_1712).aClass149_953
		.put(argument_10_.method2033(class83, true), (long) anInt1706);
	}
	if (argument_9_ >= (anInt1705 ^ 0xffffffff)
	    && ((Class115) ((Class234) this).aClass115_1712).aClass149_953
		   .get((long) anInt1705) == null
	    && js5Store.isFlatFile(anInt1705)) {
	    Class83 class83 = Class83.method1609(js5Store, anInt1705);
	    ((Class115) ((Class234) this).aClass115_1712).aClass149_953
		.put(argument_10_.method2033(class83, true), (long) anInt1705);
	}
	if (anInt1702 >= 0
	    && ((Class115) ((Class234) this).aClass115_1712).aClass149_953
		   .get((long) anInt1702) == null
	    && js5Store.isFlatFile(anInt1702)) {
	    Class83 class83 = Class83.method1609(js5Store, anInt1702);
	    ((Class115) ((Class234) this).aClass115_1712).aClass149_953
		.put(argument_10_.method2033(class83, true), (long) anInt1702);
	}
    }
    
    final Class368 method3106(int argument_11_, GraphicsToolkit argument_12_) {
	if (anInt1701 < 0)
	    return null;
	Class368 class368
	    = (Class368) ((Class115) ((Class234) this).aClass115_1712)
			     .aClass149_953.get((long) anInt1701);
	if (class368 == null) {
	    method3105(-1, argument_12_);
	    class368 = (Class368) ((Class115) ((Class234) this).aClass115_1712)
				      .aClass149_953
				      .get((long) anInt1701);
	}
	return class368;
    }
    
    final void method3107(Packet argument_13_, byte argument_14_) {
	for (;;) {
	    int anLocalInt = argument_13_.g1();
	    if (anLocalInt == 0)
		break;
	    method3104(2, argument_13_, anLocalInt);
	}
    }
    
    static final boolean method3108(int argument, int argument_15_,
				    Class48 argument_16_) {
	Statics.aClass350_2673.method3829
	    (((Class48) argument_16_).anIntArray347[argument],
	     ((Class48) argument_16_).anIntArray348[argument],
	     ((Class48) argument_16_).anIntArray345[argument],
	     DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405);
	int anLocalInt = DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[2];
	if (anLocalInt < 50)
	    return false;
	((Class48) argument_16_).aShortArray342[argument]
	    = (short) ((Exception_Sub1.anInt50
			* DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[0] / anLocalInt)
		       + Class_aa_Sub1.anInt3749);
	((Class48) argument_16_).aShortArray355[argument]
	    = (short) ((DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[1]
			* Class332.anInt2716 / anLocalInt)
		       + Class245_Sub1_Sub1.anInt6517);
	((Class48) argument_16_).aShortArray346[argument] = (short) anLocalInt;
	return true;
    }
    
    static final float method3109(int argument, float argument_17_,
				  float argument_18_, float argument_19_,
				  float argument_20_, float argument_21_,
				  int argument_22_, float argument_23_) {
	float f = 0.0F;
	float f_24_ = -argument_21_ + argument_23_;
	float f_25_ = argument_17_ - argument_19_;
	float f_26_ = argument_20_ - argument_18_;
	float f_27_ = 0.0F;
	float f_28_ = 0.0F;
	float f_29_ = 0.0F;
	while (f < 1.1F) {
	    float f_30_ = argument_21_ + f_24_ * f;
	    float f_31_ = f * f_25_ + argument_19_;
	    float f_32_ = argument_18_ + f_26_ * f;
	    int anLocalInt = (int) f_30_ >> 9;
	    int anLocalInt_33_ = (int) f_32_ >> 9;
	    if (anLocalInt > 0 && anLocalInt_33_ > 0
		&& anLocalInt < MapRelated.mapWidth
		&& MapRelated.mapDepth > anLocalInt_33_) {
		int anLocalInt_34_
		    = (((DoublyLinkedNodeP2_Sub2)
			Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
		       .lightingHL);
		if (anLocalInt_34_ < 3 && ((Class303.tileSettings[1]
					    [anLocalInt][anLocalInt_33_])
					   & 0x2) != 0)
		    anLocalInt_34_++;
		int anLocalInt_35_
		    = Statics.aClass_sArray2713[anLocalInt_34_]
			  .method3541((int) f_32_, 0, (int) f_30_);
		if ((float) anLocalInt_35_ < f_31_) {
		    if (argument_22_ < 2)
			return f;
		    return (method3109(-122, f_31_, f_29_, f_28_, f_32_, f_27_,
				       argument_22_ - 1, f_30_) * 0.1F
			    + (f - 0.1F));
		}
	    }
	    f_27_ = f_30_;
	    f += 0.1F;
	    f_28_ = f_31_;
	    f_29_ = f_32_;
	}
	return -1.0F;
    }
    
    final Class368 method3110(GraphicsToolkit argument_36_, int argument_37_) {
	if (argument_37_ < (anInt1705 ^ 0xffffffff))
	    return null;
	Class368 class368
	    = ((Class368)
	       ((Class115) ((Class234) this).aClass115_1712).aClass149_953
		   .get((long) anInt1705));
	if (class368 == null) {
	    method3105(-1, argument_36_);
	    class368 = (Class368) ((Class115) ((Class234) this).aClass115_1712)
				      .aClass149_953
				      .get((long) anInt1705);
	}
	return class368;
    }
    
    static final void method3111(int argument, boolean argument_38_,
				 byte argument_39_, String argument_40_,
				 String argument_41_) {
	Node_Sub29 class59_sub29 = Class253_Sub1.method3249(-116);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129.p1
            (((Class212) Class245_Sub2_Sub2.aClass212_6530).anInt1505);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p2(0);
	int anLocalInt = (((Packet) (((Node_Sub29) class59_sub29)
					    .aClass59_Sub28_Sub1_4129))
			  .pos);
	int anLocalInt_42_ = -19 % ((-2 - argument_39_) / 47);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p2(649);
	int[] anLocalInts
	    = Node_Sub31_Sub34.method981((byte) 61, class59_sub29);
	int anLocalInt_43_ = (((Packet) (((Node_Sub29) class59_sub29)
						.aClass59_Sub28_Sub1_4129))
			      .pos);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .pjstr(argument_41_);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p2(client.affiliateId);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .pjstr(argument_40_);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p8(client.userFlow);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p1(client.language);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p1(((GameEnum) client.selectedGame).id);
	Class389.method4132(24, (((Node_Sub29) class59_sub29)
				 .aClass59_Sub28_Sub1_4129));
	String string = client.additionalInfo;
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p1(string == null ? 0 : 1);
	if (string != null)
	    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		.pjstr(string);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p1(argument);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p1(!argument_38_ ? 0 : 1);
	((Packet)
	 ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129).pos
	    += 7;
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129.decryptXTEA
	    (
                anLocalInt_43_, ((Packet) (((Node_Sub29) class59_sub29)
                .aClass59_Sub28_Sub1_4129)).pos,
                anLocalInts);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129.psize2
            ((((Packet) (((Node_Sub29) class59_sub29)
                    .aClass59_Sub28_Sub1_4129)).pos
                    - anLocalInt)
            );
	Class251.method3243(class59_sub29, true);
	MenuAction.anInt6282 = -3;
	Class245.anInt1784 = 1;
	Class62_Sub3.anInt4372 = 0;
	Skybox_Sub2_Sub1.anInt6394 = 0;
	if (argument < 13) {
	    client.aBoolean2950 = true;
	    Statics.method3465((byte) -84);
	}
    }
    
    public Class234() {
	anInt1701 = -1;
	anInt1702 = -1;
	anInt1706 = -1;
	anInt1705 = -1;
	((Class234) this).anInt1700 = 0;
	((Class234) this).anInt1704 = 0;
	((Class234) this).anInt1707 = 0;
	((Class234) this).anInt1708 = -1;
	((Class234) this).anInt1709 = -1;
	((Class234) this).anInt1713 = 16777215;
	((Class234) this).anInt1711 = 70;
	((Class234) this).anInt1714 = -1;
    }
}
