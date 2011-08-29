/* Class104_Sub2_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub2_Sub2_Sub3 extends DoublyLinkedNodeP2_Sub2_Sub2
    implements Interface2
{
    static float aFloat6623 = 1024.0F;
    private boolean aBoolean6624;
    static float aFloat6625 = 0.0F;
    Class78 aClass78_6626;
    private Class80 aClass80_6627;
    private boolean aBoolean6628 = false;
    
    final void method1775(GraphicsToolkit argument_0_, DoublyLinkedNodeP2_Sub2 argument_1_,
			  boolean argument_2_, int argument_3_,
			  int argument_4_, int argument_5_, int argument_6_) {
	if (argument_3_ <= -16)
	    throw new IllegalStateException();
    }
    
    final boolean method1782(int argument_7_) {
	if (argument_7_ != -1)
	    method5(-39);
	return false;
    }
    
    public final int method2(int argument_8_) {
	if (argument_8_ != -10908)
	    return 104;
	return (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626)
		.anInt548);
    }
    
    final boolean method1772(int argument_9_) {
	if (argument_9_ != 0)
	    return true;
	return aBoolean6628;
    }
    
    final int method1774(int argument_10_) {
	if (argument_10_ != -13878)
	    return -33;
	return ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626
		   .method1569((byte) 110);
    }
    
    public final boolean method6(int argument_11_) {
	if (argument_11_ < 59)
	    return true;
	return ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626.method1577(-1);
    }
    
    public final int method7(int argument_12_) {
	if (argument_12_ != -23356)
	    aClass80_6627 = null;
	return (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626)
		.anInt545);
    }
    
    final Class80 method1769(GraphicsToolkit argument_13_, byte argument_14_) {
	if (argument_14_ != -126)
	    method1769(null, (byte) -116);
	return aClass80_6627;
    }
    
    final void method1770(int argument_15_) {
	if (argument_15_ != -13514)
	    aFloat6623 = 0.17539486F;
	throw new IllegalStateException();
    }
    
    final DoublyLinkedNodeP2_Sub10 method1776(int argument_16_, GraphicsToolkit argument_17_) {
	Class167 class167
	    = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626
		  .method1566(true, argument_17_, true, 2048, false);
	if (class167 == null)
	    return null;
	if (argument_16_ != -10)
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626 = null;
	Class350 class350 = argument_17_.method2015();
	class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	DoublyLinkedNodeP2_Sub10 class104_sub10
	    = Class3.method216(aBoolean6624, argument_16_ + 10, 1);
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626.method1573
	    (argument_17_, true, ((DoublyLinkedNodeP2_Sub2_Sub2) this).right,
	     ((DoublyLinkedNodeP2_Sub2_Sub2) this).top,
	     ((DoublyLinkedNodeP2_Sub2_Sub2) this).bottom,
	     ((DoublyLinkedNodeP2_Sub2_Sub2) this).left, class350, class167,
	     (byte) 91);
	if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
	    class167.method2640(class350, (((DoublyLinkedNodeP2_Sub10) class104_sub10)
					   .aClass104_Sub9Array4595[0]), 0);
	else
	    class167.method2646(class350,
				(((DoublyLinkedNodeP2_Sub10) class104_sub10)
				 .aClass104_Sub9Array4595[0]),
				Class390.anInt3285, 0);
	if ((((Class78) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626)
	     .aClass104_Sub7_544)
	    != null) {
	    Class72 class72
		= ((Class78) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626)
		      .aClass104_Sub7_544.method1932();
	    if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
		argument_17_.method2067(class72);
	    else
		argument_17_.method2074(class72, Class390.anInt3285);
	}
	aBoolean6628
	    = (class167.F()
	       || (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626)
		   .aClass104_Sub7_544) != null);
	if (aClass80_6627 != null)
	    Class217.method3010(class167, aClass80_6627,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				((DoublyLinkedNodeP2_Sub2) this).worldZ,
				((DoublyLinkedNodeP2_Sub2) this).worldX, 1);
	else
	    aClass80_6627
		= Class369.method4045(argument_16_ - 23535, class167,
				      ((DoublyLinkedNodeP2_Sub2) this).worldZ,
				      ((DoublyLinkedNodeP2_Sub2) this).worldX,
				      ((DoublyLinkedNodeP2_Sub2) this).anInt4511);
	return class104_sub10;
    }
    
    public final void method8(GraphicsToolkit argument_18_, int argument_19_) {
	if (argument_19_ != -4947)
	    aClass80_6627 = null;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626
	    .method1578((byte) -119, argument_18_);
    }
    
    public final void method4(GraphicsToolkit argument_20_, int argument_21_) {
	if (argument_21_ != -4351)
	    method5(87);
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626
	    .method1575(argument_21_ + 18310, argument_20_);
    }
    
    final boolean method1766(int argument_22_) {
	if (argument_22_ > -87)
	    aBoolean6624 = true;
	return false;
    }
    
    final void method1773(byte argument_23_, GraphicsToolkit argument_24_) {
	if (argument_23_ <= 69)
	    aFloat6623 = 0.9856351F;
	Class167 class167
	    = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626
		  .method1566(true, argument_24_, true, 262144, true);
	if (class167 != null) {
	    Class350 class350 = argument_24_.method2015();
	    class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				((DoublyLinkedNodeP2_Sub2) this).worldZ);
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626.method1573
		(argument_24_, false, ((DoublyLinkedNodeP2_Sub2_Sub2) this).right,
		 ((DoublyLinkedNodeP2_Sub2_Sub2) this).top,
		 ((DoublyLinkedNodeP2_Sub2_Sub2) this).bottom,
		 ((DoublyLinkedNodeP2_Sub2_Sub2) this).left, class350, class167,
		 (byte) 99);
	}
    }
    
    DoublyLinkedNodeP2_Sub2_Sub2_Sub3
	(GraphicsToolkit argument_25_, Class266 argument_26_, int argument_27_,
	 int argument_28_, int argument_29_, int argument_30_,
	 int argument_31_, boolean argument_32_, int argument_33_,
	 int argument_34_, int argument_35_, int argument_36_,
	 int argument_37_, int argument_38_, int argument_39_) {
	super(argument_27_, argument_28_, argument_29_, argument_30_,
	      argument_31_, argument_33_, argument_34_, argument_35_,
	      argument_36_, ((Class266) argument_26_).anInt2092 == 1,
	      Node_Sub31_Sub39.method1004(argument_38_, (byte) 110,
                  argument_37_));
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626
	    = new Class78(argument_25_, argument_26_, argument_37_,
			  argument_38_, ((DoublyLinkedNodeP2_Sub2) this).lightingHL,
			  argument_28_, this, argument_32_, argument_39_);
	aBoolean6624
	    = ((Class266) argument_26_).anInt2123 != 0 && !argument_32_;
    }
    
    final void method1816(Class120 argument_40_, int argument_41_) {
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626
	    .method1572(-1090, argument_40_);
    }
    
    public final void method5(int argument_42_) {
	if (argument_42_ != 14667)
	    aBoolean6628 = false;
    }
    
    final int method1781(int argument_43_) {
	if (argument_43_ != 748449288)
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626 = null;
	return ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626
		   .method1568((byte) -118);
    }
    
    final boolean method1771(int argument_44_, int argument_45_,
			     int argument_46_, GraphicsToolkit argument_47_) {
	Class167 class167
	    = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626
		  .method1566(true, argument_47_, false, 131072, false);
	if (class167 == null)
	    return false;
	Class350 class350 = argument_47_.method2015();
	if (argument_44_ != 4161)
	    method5(123);
	class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
	    return class167.method2637(argument_46_, argument_45_, class350,
				       false, 0, Class390.anInt3285);
	return class167.method2645(argument_46_, argument_45_, class350, false,
				   0);
    }
    
    public final int method3(int argument_48_) {
	if (argument_48_ != -2132)
	    return 29;
	return (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub3) this).aClass78_6626)
		.anInt555);
    }
}
