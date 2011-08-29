/* Class104_Sub2_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub2_Sub4_Sub2 extends DoublyLinkedNodeP2_Sub2_Sub4
    implements Interface2
{
    private short aShort6578;
    private boolean aBoolean6579;
    private Class167 aClass167_6580;
    private Class80 aClass80_6581;
    private tia_sub_35DoublyLinked aTia_sub_35_6582;
    static Class221 aClass221_6583 = new Class221();
    private byte aByte6584;
    private boolean aBoolean6586;
    private boolean aBoolean6588;
    private boolean aBoolean6589;
    
    private final Class118 method1886(int argument_0_, boolean argument_1_,
				      GraphicsToolkit argument_2_, int argument_3_) {
	Class266 class266 = Node_Sub31_Sub30.aClass257_5983
				.method3298((byte) 40, aShort6578 & 0xffff);
	if (argument_3_ != -1)
	    client.loadingBarTextColour = null;
	Class_s class_s;
	Class_s class_s_4_;
	if (aBoolean6579) {
	    class_s = Statics.aClass_sArray2713[0];
	    class_s_4_
		= Class65.aClass_sArray455[((DoublyLinkedNodeP2_Sub2) this).aByte4509];
	} else {
	    if (((DoublyLinkedNodeP2_Sub2) this).aByte4509 < 3)
		class_s = (Statics.aClass_sArray2713
			   [((DoublyLinkedNodeP2_Sub2) this).aByte4509 + 1]);
	    else
		class_s = null;
	    class_s_4_
		= Statics.aClass_sArray2713[((DoublyLinkedNodeP2_Sub2) this).aByte4509];
	}
	return class266.method3334(((DoublyLinkedNodeP2_Sub2) this).anInt4511, class_s,
				   aByte6584, class_s_4_, null, 22,
				   argument_0_, argument_1_,
				   ((DoublyLinkedNodeP2_Sub2) this).worldX, (byte) 53,
				   ((DoublyLinkedNodeP2_Sub2) this).worldZ,
				   argument_2_);
    }
    
    public final void method8(GraphicsToolkit argument_5_, int argument_6_) {
	Object object = null;
	if (argument_6_ != -4947)
	    aTia_sub_35_6582 = null;
	tia_sub_35DoublyLinked var_tia_sub_35;
	if (aTia_sub_35_6582 == null && aBoolean6586) {
	    Class118 class118
		= method1886(262144, true, argument_5_, argument_6_ ^ 0x1352);
	    var_tia_sub_35 = (class118 != null
			      ? ((Class118) class118).aTia_sub_35_968 : null);
	} else {
	    var_tia_sub_35 = aTia_sub_35_6582;
	    aTia_sub_35_6582 = null;
	}
	if (var_tia_sub_35 != null)
	    Statics.method1777(var_tia_sub_35, ((DoublyLinkedNodeP2_Sub2) this).aByte4509, ((DoublyLinkedNodeP2_Sub2) this).worldX, ((DoublyLinkedNodeP2_Sub2) this).worldZ, null);
    }
    
    public static void method1887(int argument) {
	Cs2Script.scriptCache = null;
	aClass221_6583 = null;
	client.loadingBarTextColour = null;
    }
    
    static final void method1888(int argument) {
	Class224.anInt1578 = 0;
	for (int anLocalInt = 0; anLocalInt < 2048; anLocalInt++) {
	    DoublyLinkedNode_Sub51_Sub7.aClass59_Sub28Array6247[anLocalInt] = null;
	    DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aByteArray6570[anLocalInt] = (byte) 1;
	    Node_Sub31_Sub15_Sub1.aClass239Array6640[anLocalInt] = null;
	}
    }
    
    final boolean method1772(int argument_7_) {
	if (argument_7_ != 0)
	    aShort6578 = (short) 125;
	if (aClass167_6580 != null)
	    return aClass167_6580.F();
	return false;
    }
    
    public final boolean method6(int argument_8_) {
	return aBoolean6586;
    }
    
    final Class80 method1769(GraphicsToolkit argument_9_, byte argument_10_) {
	if (argument_10_ != -126)
	    Cs2Script.scriptCache = null;
	if (aClass80_6581 == null)
	    aClass80_6581
		= Class369.method4045(-23545,
				      method1889((byte) 90, argument_9_, 0),
				      ((DoublyLinkedNodeP2_Sub2) this).worldZ,
				      ((DoublyLinkedNodeP2_Sub2) this).worldX,
				      ((DoublyLinkedNodeP2_Sub2) this).anInt4511);
	return aClass80_6581;
    }
    
    final int method1774(int argument_11_) {
	if (argument_11_ != -13878)
	    aShort6578 = (short) -86;
	if (aClass167_6580 != null)
	    return aClass167_6580.ma();
	return 0;
    }
    
    final void method1775(GraphicsToolkit argument_12_, DoublyLinkedNodeP2_Sub2 argument_13_,
			  boolean argument_14_, int argument_15_,
			  int argument_16_, int argument_17_,
			  int argument_18_) {
	if (argument_15_ > -16)
	    aBoolean6588 = true;
	if (argument_13_ instanceof DoublyLinkedNodeP2_Sub2_Sub4_Sub2) {
	    DoublyLinkedNodeP2_Sub2_Sub4_Sub2 class104_sub2_sub4_sub2
		= (DoublyLinkedNodeP2_Sub2_Sub4_Sub2) argument_13_;
	    if (aClass167_6580 != null
		&& class104_sub2_sub4_sub2.aClass167_6580 != null)
		aClass167_6580.method2660((class104_sub2_sub4_sub2
					   .aClass167_6580),
					  argument_16_, argument_17_,
					  argument_18_, argument_14_);
	}
    }
    
    public final int method2(int argument_19_) {
	if (argument_19_ != -10908)
	    method1775(null, null, true, 88, -40, 111, 4);
	return 22;
    }
    
    final DoublyLinkedNodeP2_Sub10 method1776(int argument_20_, GraphicsToolkit argument_21_) {
	if (aClass167_6580 == null)
	    return null;
	Class350 class350 = argument_21_.method2015();
	class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	DoublyLinkedNodeP2_Sub10 class104_sub10 = Class3.method216(aBoolean6588, 0, 1);
	if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
	    aClass167_6580.method2640(class350,
				      (((DoublyLinkedNodeP2_Sub10) class104_sub10)
				       .aClass104_Sub9Array4595[0]),
				      0);
	else
	    aClass167_6580.method2646(class350,
				      (((DoublyLinkedNodeP2_Sub10) class104_sub10)
				       .aClass104_Sub9Array4595[0]),
				      Class390.anInt3285, 0);
	if (argument_20_ != -10)
	    method1776(-54, null);
	return class104_sub10;
    }
    
    DoublyLinkedNodeP2_Sub2_Sub4_Sub2(GraphicsToolkit argument_22_, Class266 argument_23_,
			    int argument_24_, int argument_25_,
			    int argument_26_, int argument_27_,
			    int argument_28_, boolean argument_29_,
			    int argument_30_, boolean argument_31_) {
	super(argument_26_, argument_27_, argument_28_, argument_24_,
	      argument_25_, ((Class266) argument_23_).anInt2070);
	aBoolean6589 = argument_31_;
	((DoublyLinkedNodeP2_Sub2) this).worldX = argument_26_;
	((DoublyLinkedNodeP2_Sub2) this).worldZ = argument_28_;
	aBoolean6588
	    = ((Class266) argument_23_).anInt2123 != 0 && !argument_29_;
	aByte6584 = (byte) argument_30_;
	aShort6578 = (short) ((Class266) argument_23_).anInt2059;
	aBoolean6579 = argument_29_;
	aBoolean6586
	    = (argument_22_.method2038()
	       && ((Class266) argument_23_).aBoolean2130 && !aBoolean6579
	       && ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		      .aClass62_Sub8_4331.method1388(21) != 0);
	int anLocalInt = 2048;
	if (aBoolean6589)
	    anLocalInt |= 0x10000;
	Class118 class118
	    = method1886(anLocalInt, aBoolean6586, argument_22_, -1);
	if (class118 != null) {
	    aTia_sub_35_6582 = ((Class118) class118).aTia_sub_35_968;
	    aClass167_6580 = ((Class118) class118).aClass167_969;
	    if (aBoolean6589)
		aClass167_6580
		    = aClass167_6580.method2651((byte) 0, anLocalInt, false);
	}
    }
    
    public final int method7(int argument_32_) {
	if (argument_32_ != -23356)
	    client.loadingBarTextColour = null;
	return aShort6578 & 0xffff;
    }
    
    final boolean method1766(int argument_33_) {
	if (argument_33_ >= -87)
	    method1770(-101);
	if (aClass167_6580 != null) {
	    if (aClass167_6580.r())
		return false;
	    return true;
	}
	return true;
    }
    
    final boolean method1782(int argument_34_) {
	if (argument_34_ != -1)
	    method1770(-124);
	return aBoolean6589;
    }
    
    final boolean method1771(int argument_35_, int argument_36_,
			     int argument_37_, GraphicsToolkit argument_38_) {
	if (argument_35_ != 4161)
	    client.loadingBarTextColour = null;
	Class167 class167 = method1889((byte) 90, argument_38_, 131072);
	if (class167 != null) {
	    Class350 class350 = argument_38_.method2015();
	    class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				((DoublyLinkedNodeP2_Sub2) this).worldZ);
	    if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
		return class167.method2645(argument_37_, argument_36_,
					   class350, false, 0);
	    return class167.method2637(argument_37_, argument_36_, class350,
				       false, 0, Class390.anInt3285);
	}
	return false;
    }
    
    final void method1770(int argument_39_) {
	aBoolean6589 = false;
	if (aClass167_6580 != null)
	    aClass167_6580.s(aClass167_6580.ua() & ~0x10000);
	if (argument_39_ != -13514)
	    method7(67);
    }
    
    public final void method4(GraphicsToolkit argument_40_, int argument_41_) {
	Object object = null;
	tia_sub_35DoublyLinked var_tia_sub_35;
	if (aTia_sub_35_6582 != null || !aBoolean6586) {
	    var_tia_sub_35 = aTia_sub_35_6582;
	    aTia_sub_35_6582 = null;
	} else {
	    Class118 class118 = method1886(262144, true, argument_40_, -1);
	    var_tia_sub_35 = (class118 == null ? null
			      : ((Class118) class118).aTia_sub_35_968);
	}
	if (var_tia_sub_35 != null)
	    Node_Sub21.method731(var_tia_sub_35,
                ((DoublyLinkedNodeP2_Sub2) this).aByte4509,
                ((DoublyLinkedNodeP2_Sub2) this).worldX,
                ((DoublyLinkedNodeP2_Sub2) this).worldZ, null);
	if (argument_41_ != -4351)
	    aClass221_6583 = null;
    }
    
    final int method1781(int argument_42_) {
	if (argument_42_ != 748449288)
	    method1775(null, null, false, 52, 2, 97, -72);
	if (aClass167_6580 != null)
	    return aClass167_6580.fa();
	return 0;
    }
    
    private final Class167 method1889(byte argument_43_, GraphicsToolkit argument_44_,
				      int argument_45_) {
	if (aClass167_6580 != null
	    && argument_44_.andPow(aClass167_6580.ua(), argument_45_) == 0)
	    return aClass167_6580;
	Class118 class118 = method1886(argument_45_, false, argument_44_, -1);
	if (argument_43_ != 90)
	    aByte6584 = (byte) 24;
	if (class118 == null)
	    return null;
	return ((Class118) class118).aClass167_969;
    }
    
    final void method1773(byte argument_46_, GraphicsToolkit argument_47_) {
	if (argument_46_ < 69)
	    aBoolean6579 = false;
    }
    
    public final void method5(int argument_48_) {
	if (aClass167_6580 != null)
	    aClass167_6580.method2652();
	if (argument_48_ != 14667)
	    Cs2Script.scriptCache = null;
    }
    
    public final int method3(int argument_49_) {
	if (argument_49_ != -2132)
	    aBoolean6588 = true;
	return aByte6584;
    }
}
