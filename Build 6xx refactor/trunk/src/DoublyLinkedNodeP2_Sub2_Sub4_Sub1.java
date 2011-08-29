/* Class104_Sub2_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub2_Sub4_Sub1 extends DoublyLinkedNodeP2_Sub2_Sub4
    implements Interface2
{
    static int[] anIntArray6572 = { 16, 32, 64, 128 };
    static int anInt6573;
    private boolean aBoolean6574;
    private Class80 aClass80_6575;
    Class78 aClass78_6576;
    private boolean aBoolean6577 = false;
    
    public final int method3(int argument_0_) {
	if (argument_0_ != -2132)
	    return -16;
	return (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576)
		.anInt555);
    }
    
    final Class80 method1769(GraphicsToolkit argument_1_, byte argument_2_) {
	if (argument_2_ != -126)
	    method1883(76);
	return aClass80_6575;
    }
    
    final void method1775(GraphicsToolkit argument_3_, DoublyLinkedNodeP2_Sub2 argument_4_,
			  boolean argument_5_, int argument_6_,
			  int argument_7_, int argument_8_, int argument_9_) {
	if (argument_6_ >= -16)
	    aBoolean6577 = false;
	throw new IllegalStateException();
    }
    
    public final void method8(GraphicsToolkit argument_10_, int argument_11_) {
	((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576
	    .method1578((byte) -121, argument_10_);
	if (argument_11_ != -4947) {
	    /* empty */
	}
    }

    public final int method2(int argument_13_) {
	if (argument_13_ != -10908)
	    method1772(-61);
	return (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576)
		.anInt548);
    }
    
    public final int method7(int argument_14_) {
	if (argument_14_ != -23356)
	    return -41;
	return (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576)
		.anInt545);
    }
    
    final boolean method1771(int argument_15_, int argument_16_,
			     int argument_17_, GraphicsToolkit argument_18_) {
	Class167 class167
	    = ((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576
		  .method1566(true, argument_18_, false, 131072, false);
	if (class167 == null)
	    return false;
	if (argument_15_ != 4161)
	    return true;
	Class350 class350 = argument_18_.method2015();
	class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
	    return class167.method2637(argument_17_, argument_16_, class350,
				       false, 0, Class390.anInt3285);
	return class167.method2645(argument_17_, argument_16_, class350, false,
				   0);
    }
    
    public final boolean method6(int argument_19_) {
	if (argument_19_ <= 59)
	    method8(null, 59);
	return ((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576.method1577(-1);
    }
    
    final DoublyLinkedNodeP2_Sub10 method1776(int argument_20_, GraphicsToolkit argument_21_) {
	Class167 class167
	    = ((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576
		  .method1566(true, argument_21_, true, 2048, false);
	if (class167 == null)
	    return null;
	Class350 class350 = argument_21_.method2015();
	class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	DoublyLinkedNodeP2_Sub10 class104_sub10 = Class3.method216(aBoolean6574, 0, 1);
	if (argument_20_ != -10)
	    return null;
	int anLocalInt = ((DoublyLinkedNodeP2_Sub2) this).worldX >> 9;
	int anLocalInt_22_ = ((DoublyLinkedNodeP2_Sub2) this).worldZ >> 9;
	((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576.method1573
	    (argument_21_, true, anLocalInt, anLocalInt_22_, anLocalInt_22_,
	     anLocalInt, class350, class167, (byte) 86);
	if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
	    class167.method2646(class350,
				(((DoublyLinkedNodeP2_Sub10) class104_sub10)
				 .aClass104_Sub9Array4595[0]),
				Class390.anInt3285, 0);
	else
	    class167.method2640(class350, (((DoublyLinkedNodeP2_Sub10) class104_sub10)
					   .aClass104_Sub9Array4595[0]), 0);
	if ((((Class78) ((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576)
	     .aClass104_Sub7_544)
	    != null) {
	    Class72 class72
		= ((Class78) ((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576)
		      .aClass104_Sub7_544.method1932();
	    if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
		argument_21_.method2074(class72, Class390.anInt3285);
	    else
		argument_21_.method2067(class72);
	}
	aBoolean6577
	    = (class167.F()
	       || (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576)
		   .aClass104_Sub7_544) != null);
	if (aClass80_6575 == null)
	    aClass80_6575
		= Class369.method4045(-23545, class167,
				      ((DoublyLinkedNodeP2_Sub2) this).worldZ,
				      ((DoublyLinkedNodeP2_Sub2) this).worldX,
				      ((DoublyLinkedNodeP2_Sub2) this).anInt4511);
	else
	    Class217.method3010(class167, aClass80_6575,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				((DoublyLinkedNodeP2_Sub2) this).worldZ,
				((DoublyLinkedNodeP2_Sub2) this).worldX,
				argument_20_ ^ ~0x8);
	return class104_sub10;
    }
    
    final boolean method1772(int argument_23_) {
	if (argument_23_ != 0)
	    return false;
	return aBoolean6577;
    }
    
    final void method1770(int argument_24_) {
	if (argument_24_ != -13514)
	    anInt6573 = 26;
	throw new IllegalStateException();
    }
    
    final void method1773(byte argument_25_, GraphicsToolkit argument_26_) {
	if (argument_25_ <= 69)
	    aBoolean6574 = true;
	Class167 class167
	    = ((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576
		  .method1566(true, argument_26_, true, 262144, true);
	if (class167 != null) {
	    int anLocalInt = ((DoublyLinkedNodeP2_Sub2) this).worldX >> 9;
	    int anLocalInt_27_ = ((DoublyLinkedNodeP2_Sub2) this).worldZ >> 9;
	    Class350 class350 = argument_26_.method2015();
	    class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				((DoublyLinkedNodeP2_Sub2) this).worldZ);
	    ((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576.method1573
		(argument_26_, false, anLocalInt, anLocalInt_27_,
		 anLocalInt_27_, anLocalInt, class350, class167, (byte) 124);
	}
    }
    
    final int method1781(int argument_28_) {
	if (argument_28_ != 748449288)
	    method1883(-108);
	return ((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576
		   .method1568((byte) -116);
    }
    
    final boolean method1782(int argument_29_) {
	if (argument_29_ != -1)
	    method2(-21);
	return false;
    }
    
    public final void method4(GraphicsToolkit argument_30_, int argument_31_) {
	((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576
	    .method1575(argument_31_ ^ ~0x2679, argument_30_);
	if (argument_31_ != -4351)
	    method1776(60, null);
    }
    
    public final void method5(int argument_32_) {
	if (argument_32_ != 14667)
	    anIntArray6572 = null;
    }
    
    public static void method1883(int argument) {
	anIntArray6572 = null;
    }
    
    DoublyLinkedNodeP2_Sub2_Sub4_Sub1(GraphicsToolkit argument_33_, Class266 argument_34_,
			    int argument_35_, int argument_36_,
			    int argument_37_, int argument_38_,
			    int argument_39_, boolean argument_40_,
			    int argument_41_, int argument_42_) {
	super(argument_37_, argument_38_, argument_39_, argument_35_,
	      argument_36_, ((Class266) argument_34_).anInt2070);
	((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576
	    = new Class78(argument_33_, argument_34_, 22, argument_41_,
			  argument_35_, argument_36_, this, argument_40_,
			  argument_42_);
	aBoolean6574
	    = ((Class266) argument_34_).anInt2123 != 0 && !argument_40_;
    }
    
    final boolean method1766(int argument_43_) {
	if (argument_43_ > -87)
	    aBoolean6577 = true;
	return false;
    }
    
    final void method1884(Class120 argument_44_, boolean argument_45_) {
	((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576
	    .method1572(-1090, argument_44_);
    }
    
    final int method1774(int argument_46_) {
	if (argument_46_ != -13878)
	    aBoolean6574 = false;
	return ((DoublyLinkedNodeP2_Sub2_Sub4_Sub1) this).aClass78_6576
		   .method1569((byte) 117);
    }

}
