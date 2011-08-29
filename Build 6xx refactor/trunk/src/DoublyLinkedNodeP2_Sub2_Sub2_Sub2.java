/* Class104_Sub2_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub2_Sub2_Sub2 extends DoublyLinkedNodeP2_Sub2_Sub2
    implements Interface2
{
    private boolean aBoolean6610;
    private short aShort6611;
    Class167 aClass167_6613;
    private boolean aBoolean6614;
    private byte aByte6615;
    static int[] anIntArray6616 = new int[1024];
    private boolean aBoolean6617;
    private byte aByte6618;
    private tia_sub_35DoublyLinked aTia_sub_35_6619;
    private Class80 aClass80_6620;
    private boolean aBoolean6622;
    
    public final void method5(int argument_0_) {
	if (argument_0_ == 14667) {
	    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613 != null)
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613.method2652();
	}
    }
    
    final int method1781(int argument_1_) {
	if (argument_1_ != 748449288)
	    aShort6611 = (short) -44;
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613 != null)
	    return ((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613.fa();
	return 0;
    }
    
    static final void method1809(int argument, int argument_2_,
				 int argument_3_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(13, 13175, (long) argument);
	class59_sub51_sub3.method1182(argument_3_ - 98);
	if (argument_3_ != 0)
	    ClientVariables.instance = null;
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231 = argument_2_;
    }
    
    final boolean method1771(int argument_4_, int argument_5_, int argument_6_,
			     GraphicsToolkit argument_7_) {
	Class167 class167 = method1814(109, argument_7_, 131072);
	if (class167 != null) {
	    Class350 class350 = argument_7_.method2015();
	    class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				((DoublyLinkedNodeP2_Sub2) this).worldZ);
	    if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
		return class167.method2645(argument_6_, argument_5_, class350,
					   false, 0);
	    return class167.method2637(argument_6_, argument_5_, class350,
				       false, 0, Class390.anInt3285);
	}
	if (argument_4_ != 4161)
	    aByte6615 = (byte) 81;
	return false;
    }
    
    final void method1773(byte argument_8_, GraphicsToolkit argument_9_) {
	if (argument_8_ < 69)
	    method1771(-97, -126, 96, null);
    }
    
    final int method1774(int argument_10_) {
	if (argument_10_ != -13878)
	    method1815(126, true);
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613 == null)
	    return 0;
	return ((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613.ma();
    }
    
    public final int method2(int argument_11_) {
	if (argument_11_ != -10908)
	    return 26;
	return aByte6615;
    }
    
    private final Class118 method1810(int argument_12_, int argument_13_,
				      GraphicsToolkit argument_14_,
				      boolean argument_15_) {
	Class266 class266 = Node_Sub31_Sub30.aClass257_5983
				.method3298((byte) 96, aShort6611 & 0xffff);
	Class_s class_s;
	Class_s class_s_16_;
	if (!aBoolean6614) {
	    if (((DoublyLinkedNodeP2_Sub2) this).aByte4509 >= 3)
		class_s_16_ = null;
	    else
		class_s_16_ = (Statics.aClass_sArray2713
			       [((DoublyLinkedNodeP2_Sub2) this).aByte4509 + 1]);
	    class_s
		= Statics.aClass_sArray2713[((DoublyLinkedNodeP2_Sub2) this).aByte4509];
	} else {
	    class_s
		= Class65.aClass_sArray455[((DoublyLinkedNodeP2_Sub2) this).aByte4509];
	    class_s_16_ = Statics.aClass_sArray2713[0];
	}
	if (argument_13_ != -12)
	    return null;
	return (class266.method3334
		(((DoublyLinkedNodeP2_Sub2) this).anInt4511, class_s_16_,
		 aByte6615 != 11 ? (int) aByte6618 : aByte6618 + 4, class_s,
		 null, aByte6615 == 11 ? 10 : aByte6615, argument_12_,
		 argument_15_, ((DoublyLinkedNodeP2_Sub2) this).worldX, (byte) 53,
		 ((DoublyLinkedNodeP2_Sub2) this).worldZ, argument_14_));
    }
    
    final DoublyLinkedNodeP2_Sub10 method1776(int argument_17_, GraphicsToolkit argument_18_) {
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613 == null)
	    return null;
	Class350 class350 = argument_18_.method2015();
	class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	if (argument_17_ != -10)
	    return null;
	DoublyLinkedNodeP2_Sub10 class104_sub10 = Class3.method216(aBoolean6617, 0, 1);
	if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613.method2646
		(class350,
		 ((DoublyLinkedNodeP2_Sub10) class104_sub10).aClass104_Sub9Array4595[0],
		 Class390.anInt3285, 0);
	else
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613.method2640
		(class350,
		 ((DoublyLinkedNodeP2_Sub10) class104_sub10).aClass104_Sub9Array4595[0],
		 0);
	return class104_sub10;
    }
    
    public final void method4(GraphicsToolkit argument_19_, int argument_20_) {
	Object object = null;
	if (argument_20_ != -4351)
	    aClass80_6620 = null;
	tia_sub_35DoublyLinked var_tia_sub_35;
	if (aTia_sub_35_6619 != null || !aBoolean6610) {
	    var_tia_sub_35 = aTia_sub_35_6619;
	    aTia_sub_35_6619 = null;
	} else {
	    Class118 class118 = method1810(262144, -12, argument_19_, true);
	    var_tia_sub_35 = (class118 == null ? null
			      : ((Class118) class118).aTia_sub_35_968);
	}
	if (var_tia_sub_35 != null)
	    Node_Sub21.method731(var_tia_sub_35,
                ((DoublyLinkedNodeP2_Sub2) this).aByte4509,
                ((DoublyLinkedNodeP2_Sub2) this).worldX,
                ((DoublyLinkedNodeP2_Sub2) this).worldZ, null);
    }
    
    final boolean method1782(int argument_21_) {
	if (argument_21_ != -1)
	    ClientVariables.instance = null;
	return aBoolean6622;
    }
    
    static final String method1811(int argument, byte[] argument_22_) {
	return Class239.method3127(argument_22_, 1958, 0, argument_22_.length);
    }
    
    final void method1770(int argument_23_) {
	aBoolean6622 = false;
	if (argument_23_ != -13514)
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613 = null;
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613 != null)
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613.s
		(((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613.ua()
		 & ~0x10000);
    }
    
    public final int method3(int argument_24_) {
	if (argument_24_ != -2132)
	    aByte6615 = (byte) -82;
	return aByte6618;
    }
    
    final boolean method1772(int argument_25_) {
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613 != null)
	    return ((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613.F();
	if (argument_25_ != 0)
	    return false;
	return false;
    }
    
    public final void method8(GraphicsToolkit argument_26_, int argument_27_) {
	Object object = null;
	tia_sub_35DoublyLinked var_tia_sub_35;
	if (aTia_sub_35_6619 == null && aBoolean6610) {
	    Class118 class118 = method1810(262144, -12, argument_26_, true);
	    var_tia_sub_35 = (class118 != null
			      ? ((Class118) class118).aTia_sub_35_968 : null);
	} else {
	    var_tia_sub_35 = aTia_sub_35_6619;
	    aTia_sub_35_6619 = null;
	}
	if (var_tia_sub_35 != null)
	    Statics.method1777(var_tia_sub_35, ((DoublyLinkedNodeP2_Sub2) this).aByte4509, ((DoublyLinkedNodeP2_Sub2) this).worldX, ((DoublyLinkedNodeP2_Sub2) this).worldZ, null);
    }
    
    public static void method1812(int argument) {
	anIntArray6616 = null;
	ClientVariables.instance = null;
    }
    
    public final boolean method6(int argument_28_) {
	return aBoolean6610;
    }
    
    final Class80 method1769(GraphicsToolkit argument_29_, byte argument_30_) {
	if (aClass80_6620 == null)
	    aClass80_6620
		= Class369.method4045(-23545, method1814(-88, argument_29_, 0),
				      ((DoublyLinkedNodeP2_Sub2) this).worldZ,
				      ((DoublyLinkedNodeP2_Sub2) this).worldX,
				      ((DoublyLinkedNodeP2_Sub2) this).anInt4511);
	if (argument_30_ != -126)
	    AthmosphericConditions.defaultSunColour = 25;
	return aClass80_6620;
    }
    
    final int method1813(byte argument_31_) {
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613 == null)
	    return 15;
	return ((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613.na() / 4;
    }
    
    DoublyLinkedNodeP2_Sub2_Sub2_Sub2
	(GraphicsToolkit argument_32_, Class266 argument_33_, int argument_34_,
	 int argument_35_, int argument_36_, int argument_37_,
	 int argument_38_, boolean argument_39_, int argument_40_,
	 int argument_41_, int argument_42_, int argument_43_,
	 int argument_44_, int argument_45_, boolean argument_46_) {
	super(argument_34_, argument_35_, argument_36_, argument_37_,
	      argument_38_, argument_40_, argument_41_, argument_42_,
	      argument_43_, ((Class266) argument_33_).anInt2092 == 1,
	      Statics.method525(argument_44_, argument_45_, (byte) -66));
	aByte6618 = (byte) argument_45_;
	aBoolean6622 = argument_46_;
	((DoublyLinkedNodeP2_Sub2) this).aByte4509 = (byte) argument_35_;
	aShort6611 = (short) ((Class266) argument_33_).anInt2059;
	aBoolean6617
	    = ((Class266) argument_33_).anInt2123 != 0 && !argument_39_;
	aBoolean6614 = argument_39_;
	aByte6615 = (byte) argument_44_;
	aBoolean6610
	    = (argument_32_.method2038()
	       && ((Class266) argument_33_).aBoolean2130 && !aBoolean6614
	       && ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		      .aClass62_Sub8_4331.method1388(56) != 0);
	int anLocalInt = 2048;
	if (aBoolean6622)
	    anLocalInt |= 0x10000;
	Class118 class118
	    = method1810(anLocalInt, -12, argument_32_, aBoolean6610);
	if (class118 != null) {
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613
		= ((Class118) class118).aClass167_969;
	    aTia_sub_35_6619 = ((Class118) class118).aTia_sub_35_968;
	    if (aBoolean6622)
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613
		    = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613
			  .method2651((byte) 0, anLocalInt, false);
	}
    }
    
    private final Class167 method1814(int argument_47_, GraphicsToolkit argument_48_,
				      int argument_49_) {
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613 != null
	    && argument_48_.andPow(((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613.ua(), argument_49_) == 0)
	    return ((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613;
	int anLocalInt = -21 % ((argument_47_ + 9) / 45);
	Class118 class118 = method1810(argument_49_, -12, argument_48_, false);
	if (class118 != null)
	    return ((Class118) class118).aClass167_969;
	return null;
    }
    
    public final int method7(int argument_50_) {
	if (argument_50_ != -23356)
	    return 22;
	return aShort6611 & 0xffff;
    }
    
    final void method1775(GraphicsToolkit argument_51_, DoublyLinkedNodeP2_Sub2 argument_52_,
			  boolean argument_53_, int argument_54_,
			  int argument_55_, int argument_56_,
			  int argument_57_) {
	if (argument_54_ < -16) {
	    do {
		if (argument_52_ instanceof DoublyLinkedNodeP2_Sub2_Sub3_Sub1) {
		    DoublyLinkedNodeP2_Sub2_Sub3_Sub1 class104_sub2_sub3_sub1
			= (DoublyLinkedNodeP2_Sub2_Sub3_Sub1) argument_52_;
		    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613 != null
			&& (((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) class104_sub2_sub3_sub1)
			    .aClass167_6599) != null)
			((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613
			    .method2660
			    (((DoublyLinkedNodeP2_Sub2_Sub3_Sub1)
			      class104_sub2_sub3_sub1).aClass167_6599,
			     argument_55_, argument_56_, argument_57_,
			     argument_53_);
		} else {
		    if (!(argument_52_ instanceof DoublyLinkedNodeP2_Sub2_Sub2_Sub2))
			break;
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub2 class104_sub2_sub2_sub2
			= (DoublyLinkedNodeP2_Sub2_Sub2_Sub2) argument_52_;
		    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613 == null
			|| (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) class104_sub2_sub2_sub2)
			    .aClass167_6613) == null)
			break;
		    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613.method2660
			((((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) class104_sub2_sub2_sub2)
			  .aClass167_6613),
			 argument_55_, argument_56_, argument_57_,
			 argument_53_);
		}
		break;
	    } while (false);
	}
    }
    
    static final void method1815(int argument, boolean argument_58_) {
	Class341.anInt2876 = argument;
	Class62_Sub5.aClass149_4383.clear((byte) -3);
    }
    
    final boolean method1766(int argument_59_) {
	if (argument_59_ > -87)
	    method1773((byte) -43, null);
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613 != null) {
	    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) this).aClass167_6613.r())
		return false;
	    return true;
	}
	return true;
    }
    
    static {
    }
}
