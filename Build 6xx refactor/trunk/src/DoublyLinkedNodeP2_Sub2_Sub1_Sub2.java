/* Class104_Sub2_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub2_Sub1_Sub2 extends DoublyLinkedNodeP2_Sub2_Sub1
    implements Interface2
{
    private boolean aBoolean6559;
    private byte aByte6560;
    private boolean aBoolean6561;
    static int anInt6562 = 0;
    private tia_sub_35DoublyLinked aTia_sub_35_6563;
    private byte aByte6564;
    private boolean aBoolean6565;
    static boolean aBoolean6566 = false;
    static boolean aBoolean6567;
    private Class167 aClass167_6568;
    private Class80 aClass80_6569;
    static byte[] aByteArray6570 = new byte[2048];
    private short aShort6571;
    
    final void method1773(byte argument_0_, GraphicsToolkit argument_1_) {
	if (argument_0_ < 69)
	    method1781(118);
    }
    
    public final boolean method6(int argument_2_) {
	return aBoolean6561;
    }
    
    final Class80 method1769(GraphicsToolkit argument_3_, byte argument_4_) {
	if (argument_4_ != -126)
	    aBoolean6561 = true;
	if (aClass80_6569 == null)
	    aClass80_6569
		= Class369.method4045(-23545, method1791(6051, argument_3_, 0),
				      ((DoublyLinkedNodeP2_Sub2) this).worldZ,
				      ((DoublyLinkedNodeP2_Sub2) this).worldX,
				      ((DoublyLinkedNodeP2_Sub2) this).anInt4511);
	return aClass80_6569;
    }
    
    final boolean method1772(int argument_5_) {
	if (argument_5_ != 0)
	    aBoolean6567 = true;
	if (aClass167_6568 == null)
	    return false;
	return aClass167_6568.F();
    }
    
    static final void method1788(int argument, int argument_6_,
				 String argument_7_) {
	int anLocalInt = Class224.anInt1578;
	int[] anLocalInts = Class242.anIntArray1769;
	boolean anLocalBoolean = false;
	for (int anLocalInt_8_ = 0; anLocalInt_8_ < anLocalInt;
	     anLocalInt_8_++) {
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		= (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		   [anLocalInts[anLocalInt_8_]]);
	    if (class104_sub2_sub2_sub5_sub2 != null
		&& (class104_sub2_sub2_sub5_sub2
		    != Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
		&& ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		    class104_sub2_sub2_sub5_sub2).aString6836 != null
		&& ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		    class104_sub2_sub2_sub5_sub2)
		       .aString6836.equalsIgnoreCase(argument_7_)) {
		anLocalBoolean = true;
		if (argument == 1) {
		    Node_Sub31_Sub27.anInt5962++;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 112,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     (DoublyLinkedNode_Sub51_Sub15
					      .aClass207_6315));
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129
			.p2ip128(anLocalInts[anLocalInt_8_]);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129.p1p128(0);
		    Class251.method3243(class59_sub29, true);
		} else if (argument != 4) {
		    if (argument != 5) {
			if (argument != 6) {
			    if (argument != 7) {
				if (argument == 9) {
				    Node_Sub29 class59_sub29
					= (Class91.method1683
					   ((byte) 38,
					    Node_Sub31_Sub16.aClass372_5910,
					    Class323.aClass207_2665));
				    ((Node_Sub29) class59_sub29)
					.aClass59_Sub28_Sub1_4129.p2
                            (anLocalInts[anLocalInt_8_]);
				    ((Node_Sub29) class59_sub29)
					.aClass59_Sub28_Sub1_4129
					.p1m128(0);
				    Class251.method3243(class59_sub29, true);
				}
			    } else {
				Class154_Sub1.anInt5637++;
				Node_Sub29 class59_sub29
				    = Class91.method1683((byte) 44,
							 (Node_Sub31_Sub16
							  .aClass372_5910),
							 (Node_Sub47_Sub12
							  .aClass207_6212));
				((Node_Sub29) class59_sub29)
				    .aClass59_Sub28_Sub1_4129
				    .p1(0);
				((Node_Sub29) class59_sub29)
				    .aClass59_Sub28_Sub1_4129.p2ip128
                        (anLocalInts[anLocalInt_8_]);
				Class251.method3243(class59_sub29, true);
			    }
			} else {
			    Class46_Sub3_Sub1.anInt5739++;
			    Node_Sub29 class59_sub29
				= Class91.method1683((byte) 84,
						     (Node_Sub31_Sub16
						      .aClass372_5910),
						     (Class253_Sub1
						      .aClass207_5656));
			    ((Node_Sub29) class59_sub29)
				.aClass59_Sub28_Sub1_4129.p1(0);
			    ((Node_Sub29) class59_sub29)
				.aClass59_Sub28_Sub1_4129
				.p2ip128(anLocalInts[anLocalInt_8_]);
			    Class251.method3243(class59_sub29, true);
			}
		    } else {
			Node_Sub31_Sub18.anInt5919++;
			Node_Sub29 class59_sub29
			    = Class91.method1683((byte) 71,
						 (Node_Sub31_Sub16
						  .aClass372_5910),
						 Class133_Sub4.aClass207_5030);
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129.p1(0);
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129
			    .p2(anLocalInts[anLocalInt_8_]);
			Class251.method3243(class59_sub29, true);
		    }
		} else {
		    Class354.anInt2974++;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 106,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Node_Sub47.aClass207_4284);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129
			.p2(anLocalInts[anLocalInt_8_]);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129.p1m128(0);
		    Class251.method3243(class59_sub29, true);
		}
		break;
	    }
	}
	if (!anLocalBoolean)
	    Class214.method2986((byte) 123,
				(MultilanguageString.UNABLE_TO_FIND
				     .getLocalizedString(client.language)
				 + argument_7_),
				4);
    }
    
    public static void method1789(byte argument) {
	aByteArray6570 = null;
    }
    
    private final Class118 method1790(GraphicsToolkit argument_9_,
				      boolean argument_10_, byte argument_11_,
				      int argument_12_) {
	if (argument_11_ <= 126)
	    aBoolean6567 = true;
	Class266 class266 = Node_Sub31_Sub30.aClass257_5983
				.method3298((byte) 48, aShort6571 & 0xffff);
	Class_s class_s;
	Class_s class_s_13_;
	if (!aBoolean6559) {
	    class_s_13_
		= Statics.aClass_sArray2713[((DoublyLinkedNodeP2_Sub2) this).aByte4509];
	    if (((DoublyLinkedNodeP2_Sub2) this).aByte4509 < 3)
		class_s = (Statics.aClass_sArray2713
			   [((DoublyLinkedNodeP2_Sub2) this).aByte4509 + 1]);
	    else
		class_s = null;
	} else {
	    class_s = Statics.aClass_sArray2713[0];
	    class_s_13_
		= Class65.aClass_sArray455[((DoublyLinkedNodeP2_Sub2) this).aByte4509];
	}
	return class266.method3334(((DoublyLinkedNodeP2_Sub2) this).anInt4511, class_s,
				   aByte6560, class_s_13_, null, aByte6564,
				   argument_12_, argument_10_,
				   ((DoublyLinkedNodeP2_Sub2) this).worldX, (byte) 53,
				   ((DoublyLinkedNodeP2_Sub2) this).worldZ,
				   argument_9_);
    }
    
    private final Class167 method1791(int argument_14_, GraphicsToolkit argument_15_,
				      int argument_16_) {
	if (argument_14_ != 6051)
	    return null;
	if (aClass167_6568 != null
	    && argument_15_.andPow(aClass167_6568.ua(), argument_16_) == 0)
	    return aClass167_6568;
	Class118 class118
	    = method1790(argument_15_, false, (byte) 127, argument_16_);
	if (class118 != null)
	    return ((Class118) class118).aClass167_969;
	return null;
    }
    
    final boolean method1771(int argument_17_, int argument_18_,
			     int argument_19_, GraphicsToolkit argument_20_) {
	if (argument_17_ != 4161)
	    return false;
	Class167 class167 = method1791(6051, argument_20_, 131072);
	if (class167 != null) {
	    Class350 class350 = argument_20_.method2015();
	    class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				((DoublyLinkedNodeP2_Sub2) this).worldZ);
	    if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
		return class167.method2637(argument_19_, argument_18_,
					   class350, false, 0,
					   Class390.anInt3285);
	    return class167.method2645(argument_19_, argument_18_, class350,
				       false, 0);
	}
	return false;
    }
    
    final int method1781(int argument_21_) {
	if (argument_21_ != 748449288)
	    aByte6560 = (byte) 122;
	if (aClass167_6568 != null)
	    return aClass167_6568.fa();
	return 0;
    }
    
    DoublyLinkedNodeP2_Sub2_Sub1_Sub2
	(GraphicsToolkit argument_22_, Class266 argument_23_, int argument_24_,
	 int argument_25_, int argument_26_, int argument_27_,
	 int argument_28_, boolean argument_29_, int argument_30_,
	 int argument_31_, int argument_32_, int argument_33_) {
	super(argument_26_, argument_27_, argument_28_, argument_24_,
	      argument_25_, argument_30_, argument_31_);
	((DoublyLinkedNodeP2_Sub2) this).worldX = argument_26_;
	aBoolean6565
	    = ((Class266) argument_23_).anInt2123 != 0 && !argument_29_;
	aShort6571 = (short) ((Class266) argument_23_).anInt2059;
	aBoolean6559 = argument_29_;
	((DoublyLinkedNodeP2_Sub2) this).worldZ = argument_28_;
	aByte6564 = (byte) argument_32_;
	aByte6560 = (byte) argument_33_;
	aBoolean6561
	    = (argument_22_.method2038()
	       && ((Class266) argument_23_).aBoolean2130 && !aBoolean6559
	       && ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		      .aClass62_Sub8_4331.method1388(27) != 0);
	Class118 class118
	    = method1790(argument_22_, aBoolean6561, (byte) 127, 2048);
	if (class118 != null) {
	    aTia_sub_35_6563 = ((Class118) class118).aTia_sub_35_968;
	    aClass167_6568 = ((Class118) class118).aClass167_969;
	}
    }
    
    final DoublyLinkedNodeP2_Sub10 method1776(int argument_34_, GraphicsToolkit argument_35_) {
	if (argument_34_ != -10)
	    method1766(29);
	if (aClass167_6568 == null)
	    return null;
	Class350 class350 = argument_35_.method2015();
	class350.method3825((((DoublyLinkedNodeP2_Sub2) this).worldX
			     + ((DoublyLinkedNodeP2_Sub2_Sub1) this).aShort6400),
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    (((DoublyLinkedNodeP2_Sub2_Sub1) this).aShort6401
			     + ((DoublyLinkedNodeP2_Sub2) this).worldZ));
	DoublyLinkedNodeP2_Sub10 class104_sub10
	    = Class3.method216(aBoolean6565, argument_34_ + 10, 1);
	if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
	    aClass167_6568.method2646(class350,
				      (((DoublyLinkedNodeP2_Sub10) class104_sub10)
				       .aClass104_Sub9Array4595[0]),
				      Class390.anInt3285, 0);
	else
	    aClass167_6568.method2640(class350,
				      (((DoublyLinkedNodeP2_Sub10) class104_sub10)
				       .aClass104_Sub9Array4595[0]),
				      0);
	return class104_sub10;
    }
    
    public final void method4(GraphicsToolkit argument_36_, int argument_37_) {
	if (argument_37_ != -4351)
	    method1791(-81, null, 117);
	Object object = null;
	tia_sub_35DoublyLinked var_tia_sub_35;
	if (aTia_sub_35_6563 == null && aBoolean6561) {
	    Class118 class118
		= method1790(argument_36_, true, (byte) 127, 262144);
	    var_tia_sub_35 = (class118 != null
			      ? ((Class118) class118).aTia_sub_35_968 : null);
	} else {
	    var_tia_sub_35 = aTia_sub_35_6563;
	    aTia_sub_35_6563 = null;
	}
	if (var_tia_sub_35 != null)
	    Node_Sub21.method731(var_tia_sub_35,
                ((DoublyLinkedNodeP2_Sub2) this).aByte4509,
                ((DoublyLinkedNodeP2_Sub2) this).worldX,
                ((DoublyLinkedNodeP2_Sub2) this).worldZ, null);
    }
    
    static final boolean method1792(int argument, byte argument_38_) {
	if (argument != 3 && argument != 5 && argument != 6)
	    return false;
	return true;
    }
    
    public final void method5(int argument_39_) {
	if (argument_39_ == 14667) {
	    if (aClass167_6568 != null)
		aClass167_6568.method2652();
	}
    }
    
    public final int method7(int argument_40_) {
	if (argument_40_ != -23356)
	    aByte6564 = (byte) -82;
	return aShort6571 & 0xffff;
    }
    
    public final void method8(GraphicsToolkit argument_41_, int argument_42_) {
	Object object = null;
	tia_sub_35DoublyLinked var_tia_sub_35;
	if (aTia_sub_35_6563 == null && aBoolean6561) {
	    Class118 class118
		= method1790(argument_41_, true, (byte) 127, 262144);
	    var_tia_sub_35 = (class118 == null ? null
			      : ((Class118) class118).aTia_sub_35_968);
	} else {
	    var_tia_sub_35 = aTia_sub_35_6563;
	    aTia_sub_35_6563 = null;
	}
	if (var_tia_sub_35 != null)
	    Statics.method1777(var_tia_sub_35, ((DoublyLinkedNodeP2_Sub2) this).aByte4509, ((DoublyLinkedNodeP2_Sub2) this).worldX, ((DoublyLinkedNodeP2_Sub2) this).worldZ, null);
    }
    
    static final int method1793(int argument, int argument_43_,
				int argument_44_, int argument_45_) {
	int anLocalInt = argument_43_ - argument_45_;
	argument = (argument_45_ * (argument & 0xff00ff) & ~0xff00ff
		    | argument_45_ * (argument & 0xff00) & 0xff0000) >>> 8;
	return (argument
		+ ((anLocalInt * (argument_44_ & 0xff00) & 0xff0000
		    | anLocalInt * (argument_44_ & 0xff00ff) & ~0xff00ff)
		   >>> 8));
    }
    
    final boolean method1766(int argument_46_) {
	if (argument_46_ > -87)
	    return false;
	if (aClass167_6568 == null)
	    return true;
	if (aClass167_6568.r())
	    return false;
	return true;
    }
    
    public final int method3(int argument_47_) {
	if (argument_47_ != -2132)
	    aByte6564 = (byte) -40;
	return aByte6560;
    }
    
    static final void method1794(int argument) {
	if (Node_Sub45.method1089((byte) 90)) {
	    if (Class342.aStringArray2885 == null)
		Class383.method4115(true);
	    Node_Sub47_Sub3.aBoolean6165 = true;
	    Class88.anInt644 = 0;
	}
    }
    
    public final int method2(int argument_48_) {
	if (argument_48_ != -10908)
	    aBoolean6565 = false;
	return aByte6564;
    }
    
    final int method1774(int argument_49_) {
	if (argument_49_ != -13878)
	    return 39;
	if (aClass167_6568 == null)
	    return 0;
	return aClass167_6568.ma();
    }
    
    static {
	aBoolean6567 = false;
    }
}
