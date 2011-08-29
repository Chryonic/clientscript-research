/* Class104_Sub2_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

final class DoublyLinkedNodeP2_Sub2_Sub3_Sub1 extends DoublyLinkedNodeP2_Sub2_Sub3
    implements Interface2
{
    private boolean aBoolean6590;
    static DCyclicLinkedList aDCyclicLinkedList_6591;
    private boolean aBoolean6592;
    private boolean aBoolean6593;
    private short aShort6594;
    private tia_sub_35DoublyLinked aTia_sub_35_6595;
    static float[] aFloatArray6596 = new float[2];
    private byte aByte6597;
    Class167 aClass167_6599;
    private byte aByte6600;
    private boolean aBoolean6601;
    static int anInt6602;
    private Class80 aClass80_6603;
    
    final boolean method1766(int argument_0_) {
	if (argument_0_ >= -87)
	    method1771(53, -86, 22, null);
	if (((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599 != null) {
	    if (((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599.r())
		return false;
	    return true;
	}
	return true;
    }
    
    final boolean method1782(int argument_1_) {
	if (argument_1_ != -1)
	    method4(null, -116);
	return aBoolean6601;
    }
    
    public final int method2(int argument_2_) {
	if (argument_2_ != -10908)
	    return 30;
	return aByte6597;
    }
    
    public final int method3(int argument_3_) {
	if (argument_3_ != -2132)
	    method3(22);
	return aByte6600;
    }
    
    final boolean method1771(int argument_4_, int argument_5_, int argument_6_,
			     GraphicsToolkit argument_7_) {
	if (argument_4_ != 4161)
	    anInt6602 = -1;
	Class167 class167 = method1872(131072, argument_7_, 0);
	if (class167 != null) {
	    Class350 class350 = argument_7_.method2015();
	    class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				((DoublyLinkedNodeP2_Sub2) this).worldZ);
	    if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
		return class167.method2637(argument_6_, argument_5_, class350,
					   false, 0, Class390.anInt3285);
	    return class167.method2645(argument_6_, argument_5_, class350,
				       false, 0);
	}
	return false;
    }
    
    final int method1774(int argument_8_) {
	if (argument_8_ != -13878)
	    return -111;
	if (((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599 != null)
	    return ((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599.ma();
	return 0;
    }
    
    final void method1775(GraphicsToolkit argument_9_, DoublyLinkedNodeP2_Sub2 argument_10_,
			  boolean argument_11_, int argument_12_,
			  int argument_13_, int argument_14_,
			  int argument_15_) {
	if (argument_12_ > -16)
	    method1776(96, null);
	do {
	    if (!(argument_10_ instanceof DoublyLinkedNodeP2_Sub2_Sub3_Sub1)) {
		if (argument_10_ instanceof DoublyLinkedNodeP2_Sub2_Sub2_Sub2) {
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub2 class104_sub2_sub2_sub2
			= (DoublyLinkedNodeP2_Sub2_Sub2_Sub2) argument_10_;
		    if (((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599 != null
			&& (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2) class104_sub2_sub2_sub2)
			    .aClass167_6613) != null)
			((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599
			    .method2660
			    (((DoublyLinkedNodeP2_Sub2_Sub2_Sub2)
			      class104_sub2_sub2_sub2).aClass167_6613,
			     argument_13_, argument_14_, argument_15_,
			     argument_11_);
		}
	    } else {
		DoublyLinkedNodeP2_Sub2_Sub3_Sub1 class104_sub2_sub3_sub1
		    = (DoublyLinkedNodeP2_Sub2_Sub3_Sub1) argument_10_;
		if (((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599 == null
		    || (((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) class104_sub2_sub3_sub1)
			.aClass167_6599) == null)
		    break;
		((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599.method2660
		    ((((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) class104_sub2_sub3_sub1)
		      .aClass167_6599),
		     argument_13_, argument_14_, argument_15_, argument_11_);
	    }
	    break;
	} while (false);
    }
    
    public final boolean method6(int argument_16_) {
	return aBoolean6593;
    }
    
    public final void method4(GraphicsToolkit argument_17_, int argument_18_) {
	Object object = null;
	tia_sub_35DoublyLinked var_tia_sub_35;
	if (aTia_sub_35_6595 != null || !aBoolean6593) {
	    var_tia_sub_35 = aTia_sub_35_6595;
	    aTia_sub_35_6595 = null;
	} else {
	    Class118 class118 = method1869(60, 262144, argument_17_, true);
	    var_tia_sub_35 = (class118 != null
			      ? ((Class118) class118).aTia_sub_35_968 : null);
	}
	if (argument_18_ != -4351)
	    aShort6594 = (short) 55;
	if (var_tia_sub_35 != null)
	    Node_Sub21.method731(var_tia_sub_35,
                ((DoublyLinkedNodeP2_Sub2) this).aByte4509,
                ((DoublyLinkedNodeP2_Sub2) this).worldX,
                ((DoublyLinkedNodeP2_Sub2) this).worldZ, null);
    }
    
    final Class80 method1769(GraphicsToolkit argument_19_, byte argument_20_) {
	if (argument_20_ != -126)
	    method2(126);
	if (aClass80_6603 == null)
	    aClass80_6603
		= Class369.method4045(-23545, method1872(0, argument_19_, 0),
				      ((DoublyLinkedNodeP2_Sub2) this).worldZ,
				      ((DoublyLinkedNodeP2_Sub2) this).worldX,
				      ((DoublyLinkedNodeP2_Sub2) this).anInt4511);
	return aClass80_6603;
    }
    
    final int method1781(int argument_21_) {
	if (argument_21_ != 748449288)
	    return -112;
	if (((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599 != null)
	    return ((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599.fa();
	return 0;
    }
    
    public final void method8(GraphicsToolkit argument_22_, int argument_23_) {
	Object object = null;
	tia_sub_35DoublyLinked var_tia_sub_35;
	if (aTia_sub_35_6595 != null || !aBoolean6593) {
	    var_tia_sub_35 = aTia_sub_35_6595;
	    aTia_sub_35_6595 = null;
	} else {
	    Class118 class118 = method1869(argument_23_ ^ ~0x1361, 262144,
					   argument_22_, true);
	    var_tia_sub_35 = (class118 != null
			      ? ((Class118) class118).aTia_sub_35_968 : null);
	}
	if (argument_23_ != -4947)
	    method8(null, -58);
	if (var_tia_sub_35 != null)
	    Statics.method1777(var_tia_sub_35, ((DoublyLinkedNodeP2_Sub2) this).aByte4509, ((DoublyLinkedNodeP2_Sub2) this).worldX, ((DoublyLinkedNodeP2_Sub2) this).worldZ, null);
    }
    
    private final Class118 method1869(int argument_24_, int argument_25_,
				      GraphicsToolkit argument_26_,
				      boolean argument_27_) {
	Class266 class266 = Node_Sub31_Sub30.aClass257_5983
				.method3298((byte) 82, aShort6594 & 0xffff);
	if (argument_24_ < 48)
	    aBoolean6590 = true;
	Class_s class_s;
	Class_s class_s_28_;
	if (!aBoolean6592) {
	    class_s
		= Statics.aClass_sArray2713[((DoublyLinkedNodeP2_Sub2) this).aByte4509];
	    if (((DoublyLinkedNodeP2_Sub2) this).aByte4509 >= 3)
		class_s_28_ = null;
	    else
		class_s_28_ = (Statics.aClass_sArray2713
			       [((DoublyLinkedNodeP2_Sub2) this).aByte4509 + 1]);
	} else {
	    class_s
		= Class65.aClass_sArray455[((DoublyLinkedNodeP2_Sub2) this).aByte4509];
	    class_s_28_ = Statics.aClass_sArray2713[0];
	}
	return class266.method3334(((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				   class_s_28_, aByte6600, class_s, null,
				   aByte6597, argument_25_, argument_27_,
				   ((DoublyLinkedNodeP2_Sub2) this).worldX, (byte) 53,
				   ((DoublyLinkedNodeP2_Sub2) this).worldZ,
				   argument_26_);
    }
    
    DoublyLinkedNodeP2_Sub2_Sub3_Sub1
	(GraphicsToolkit argument_29_, Class266 argument_30_, int argument_31_,
	 int argument_32_, int argument_33_, int argument_34_,
	 int argument_35_, boolean argument_36_, int argument_37_,
	 int argument_38_, boolean argument_39_) {
	super(argument_33_, argument_34_, argument_35_, argument_31_,
	      argument_32_,
	      Class329.method3701(-2, argument_38_, argument_37_));
	aBoolean6592 = argument_36_;
	aBoolean6590
	    = ((Class266) argument_30_).anInt2123 != 0 && !argument_36_;
	aByte6600 = (byte) argument_38_;
	aShort6594 = (short) ((Class266) argument_30_).anInt2059;
	((DoublyLinkedNodeP2_Sub2) this).worldZ = argument_35_;
	((DoublyLinkedNodeP2_Sub2) this).worldX = argument_33_;
	aByte6597 = (byte) argument_37_;
	aBoolean6601 = argument_39_;
	aBoolean6593
	    = (argument_29_.method2038()
	       && ((Class266) argument_30_).aBoolean2130 && !aBoolean6592
	       && ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		      .aClass62_Sub8_4331.method1388(51) != 0);
	int anLocalInt = 2048;
	if (aBoolean6601)
	    anLocalInt |= 0x10000;
	Class118 class118
	    = method1869(60, anLocalInt, argument_29_, aBoolean6593);
	if (class118 != null) {
	    ((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599
		= ((Class118) class118).aClass167_969;
	    aTia_sub_35_6595 = ((Class118) class118).aTia_sub_35_968;
	    if (aBoolean6601)
		((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599
		    = ((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599
			  .method2651((byte) 0, anLocalInt, false);
	}
    }
    
    public final void method5(int argument_40_) {
	if (((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599 != null)
	    ((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599.method2652();
	if (argument_40_ != 14667) {
	    /* empty */
	}
    }
    
    final DoublyLinkedNodeP2_Sub10 method1776(int argument_41_, GraphicsToolkit argument_42_) {
	if (((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599 == null)
	    return null;
	if (argument_41_ != -10)
	    method1772(-107);
	Class350 class350 = argument_42_.method2015();
	class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	DoublyLinkedNodeP2_Sub10 class104_sub10
	    = Class3.method216(aBoolean6590, argument_41_ + 10, 1);
	if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
	    ((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599.method2640
		(class350,
		 ((DoublyLinkedNodeP2_Sub10) class104_sub10).aClass104_Sub9Array4595[0],
		 0);
	else
	    ((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599.method2646
		(class350,
		 ((DoublyLinkedNodeP2_Sub10) class104_sub10).aClass104_Sub9Array4595[0],
		 Class390.anInt3285, 0);
	return class104_sub10;
    }
    
    public static void method1870(int argument) {
	aDCyclicLinkedList_6591 = null;
	aFloatArray6596 = null;
    }
    
    static final byte[] method1871(File argument, byte argument_43_,
				   int argument_44_) {
	try {
	    byte[] anLocalInts = new byte[argument_44_];
	    Statics.method2743(argument, argument_44_, anLocalInts, -365);
	    return anLocalInts;
	} catch (java.io.IOException ioexception) {
	    return null;
	}
    }
    
    public final int method7(int argument_45_) {
	if (argument_45_ != -23356)
	    return 114;
	return aShort6594 & 0xffff;
    }
    
    final boolean method1772(int argument_46_) {
	if (argument_46_ != 0)
	    return true;
	if (((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599 == null)
	    return false;
	return ((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599.F();
    }
    
    final void method1770(int argument_47_) {
	aBoolean6601 = false;
	if (argument_47_ != -13514)
	    method8(null, 75);
	if (((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599 != null)
	    ((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599.s
		(((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599.ua()
		 & ~0x10000);
    }
    
    private final Class167 method1872(int argument_48_, GraphicsToolkit argument_49_,
				      int argument_50_) {
	if (((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599 != null
	    && argument_49_.andPow(((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599.ua(), argument_48_) == 0)
	    return ((DoublyLinkedNodeP2_Sub2_Sub3_Sub1) this).aClass167_6599;
	Class118 class118
	    = method1869(argument_50_ + 64, argument_48_, argument_49_, false);
	if (argument_50_ != 0)
	    method1773((byte) 5, null);
	if (class118 != null)
	    return ((Class118) class118).aClass167_969;
	return null;
    }
    
    final void method1773(byte argument_51_, GraphicsToolkit argument_52_) {
	if (argument_51_ < 69)
	    method1869(-47, -10, null, true);
    }
    
    static {
	aDCyclicLinkedList_6591 = new DCyclicLinkedList();
	client.worldFlags = 0;
    }
}
