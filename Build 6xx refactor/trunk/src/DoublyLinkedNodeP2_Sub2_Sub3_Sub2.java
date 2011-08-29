/* Class104_Sub2_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub2_Sub3_Sub2 extends DoublyLinkedNodeP2_Sub2_Sub3
    implements Interface2
{
    public static int anInt6604;
    static int[] anIntArray6605 = new int[4];
    private Class80 aClass80_6606;
    Class78 aClass78_6607;
    private boolean aBoolean6608 = false;
    private boolean aBoolean6609;
    
    final boolean method1782(int argument_0_) {
	if (argument_0_ != -1)
	    ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607 = null;
	return false;
    }
    
    final void method1775(GraphicsToolkit argument_1_, DoublyLinkedNodeP2_Sub2 argument_2_,
			  boolean argument_3_, int argument_4_,
			  int argument_5_, int argument_6_, int argument_7_) {
	if (argument_4_ > -16)
	    method1770(34);
	throw new IllegalStateException();
    }
    
    final boolean method1772(int argument_8_) {
	if (argument_8_ != 0)
	    return true;
	return aBoolean6608;
    }
    
    static final void method1873(int argument, int argument_9_,
				 Node_Sub10 argument_10_, int argument_11_,
				 int argument_12_) {
	long l = (long) (argument_12_ | (argument_9_ << 28 | argument << 14));
	Node_Sub15 class59_sub15
	    = ((Node_Sub15)
	       tia_sub_35_Sub1DoublyLinked.aJagexHashMap_6658.get(l));
	if (class59_sub15 == null) {
	    class59_sub15 = new Node_Sub15();
	    tia_sub_35_Sub1DoublyLinked.aJagexHashMap_6658.put(l, class59_sub15);
	    ((Node_Sub15) class59_sub15).aCyclicLinkedList_3993
		.add(argument_10_);
	} else {
	    Class371 class371
		= (Class253_Sub1_Sub1.aClass365_6632.method3975
		   (-14, ((Node_Sub10) argument_10_).anInt3934));
	    if (argument_11_ != -1)
		method1874(126);
	    int anLocalInt = ((Class371) class371).anInt3129;
	    if (((Class371) class371).anInt3152 == 1)
		anLocalInt *= ((Node_Sub10) argument_10_).anInt3936 + 1;
	    for (Node_Sub10 class59_sub10
		     = (Node_Sub10) ((Node_Sub15) class59_sub15)
					   .aCyclicLinkedList_3993
					   .getFirst();
		 class59_sub10 != null;
		 class59_sub10
		     = (Node_Sub10) ((Node_Sub15) class59_sub15)
					   .aCyclicLinkedList_3993
					   .getNext()) {
		class371 = (Class253_Sub1_Sub1.aClass365_6632.method3975
			    (argument_11_ ^ ~0x79,
			     ((Node_Sub10) class59_sub10).anInt3934));
		int anLocalInt_13_ = ((Class371) class371).anInt3129;
		if (((Class371) class371).anInt3152 == 1)
		    anLocalInt_13_
			*= ((Node_Sub10) class59_sub10).anInt3936 + 1;
		if (anLocalInt_13_ < anLocalInt) {
		    Class62_Sub21.method1441(argument_10_, 9476,
					     class59_sub10);
		    return;
		}
	    }
	    ((Node_Sub15) class59_sub15).aCyclicLinkedList_3993
		.add(argument_10_);
	}
    }
    
    final boolean method1771(int argument_14_, int argument_15_,
			     int argument_16_, GraphicsToolkit argument_17_) {
	Class167 class167
	    = ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607
		  .method1566(true, argument_17_, false, 131072, false);
	if (class167 == null)
	    return false;
	if (argument_14_ != 4161)
	    anInt6604 = 100;
	Class350 class350 = argument_17_.method2015();
	class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
	    return class167.method2637(argument_16_, argument_15_, class350,
				       false, 0, Class390.anInt3285);
	return class167.method2645(argument_16_, argument_15_, class350, false,
				   0);
    }
    
    public final int method2(int argument_18_) {
	if (argument_18_ != -10908)
	    method1782(-6);
	return (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607)
		.anInt548);
    }
    
    public static void method1874(int argument) {
	anIntArray6605 = null;
    }
    
    public final int method3(int argument_19_) {
	if (argument_19_ != -2132)
	    method1775(null, null, true, -101, 35, 23, -55);
	return (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607)
		.anInt555);
    }
    
    final Class80 method1769(GraphicsToolkit argument_20_, byte argument_21_) {
	if (argument_21_ != -126)
	    aBoolean6608 = false;
	return aClass80_6606;
    }
    
    final void method1773(byte argument_22_, GraphicsToolkit argument_23_) {
	Class167 class167
	    = ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607
		  .method1566(true, argument_23_, true, 262144, true);
	if (class167 != null) {
	    int anLocalInt = ((DoublyLinkedNodeP2_Sub2) this).worldX >> 9;
	    int anLocalInt_24_ = ((DoublyLinkedNodeP2_Sub2) this).worldZ >> 9;
	    Class350 class350 = argument_23_.method2015();
	    class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				((DoublyLinkedNodeP2_Sub2) this).worldZ);
	    ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607.method1573
		(argument_23_, false, anLocalInt, anLocalInt_24_,
		 anLocalInt_24_, anLocalInt, class350, class167, (byte) 96);
	}
	if (argument_22_ <= 69)
	    aClass80_6606 = null;
    }
    
    final void method1875(int argument_25_, Class120 argument_26_) {
	((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607
	    .method1572(-1090, argument_26_);
    }
    
    static final void method1876(int argument, int argument_27_,
				 int argument_28_, int argument_29_,
				 int argument_30_, int argument_31_,
				 int argument_32_, GraphicsToolkit argument_33_) {
	argument_33_.method2020(66, argument_29_, argument, argument_31_,
				argument_32_, argument_30_);
	argument_33_.method2020(-110, argument_29_ - 2, argument + 1, 16,
				argument_32_ + 1, argument_28_);
	argument_33_.method2028(argument + 18, (byte) 40, argument_31_ - 19,
				argument_28_, argument_32_ + 1,
				argument_29_ - 2);
    }
    
    static final void method1877(int argument) {
	for (Node_Sub2 class59_sub2
		 = ((Node_Sub2)
		    Statics.aCyclicLinkedList_3722.getFirst());
	     class59_sub2 != null;
	     class59_sub2 = ((Node_Sub2)
			     Statics.aCyclicLinkedList_3722.getNext())) {
	    if (!((Node_Sub2) class59_sub2).aBoolean3873) {
		((Node_Sub2) class59_sub2).aBoolean3875 = true;
		if (((Node_Sub2) class59_sub2).anInt3883 >= 0
		    && ((Node_Sub2) class59_sub2).anInt3882 >= 0
		    && (MapRelated.mapWidth
			> ((Node_Sub2) class59_sub2).anInt3883)
		    && (MapRelated.mapDepth
			> ((Node_Sub2) class59_sub2).anInt3882))
		    Class157.method2591(class59_sub2, -3361);
	    } else
		class59_sub2.unlink();
	}
	for (Node_Sub2 class59_sub2
		 = ((Node_Sub2)
		    Class88.aCyclicLinkedList_643.getFirst());
	     class59_sub2 != null;
	     class59_sub2
		 = (Node_Sub2) Class88.aCyclicLinkedList_643.getNext()) {
	    if (((Node_Sub2) class59_sub2).aBoolean3873)
		class59_sub2.unlink();
	    else
		((Node_Sub2) class59_sub2).aBoolean3875 = true;
	}
    }
    
    final int method1781(int argument_34_) {
	if (argument_34_ != 748449288)
	    method1766(71);
	return ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607
		   .method1568((byte) 126);
    }
    
    final int method1774(int argument_35_) {
	if (argument_35_ != -13878)
	    aBoolean6608 = false;
	return ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607
		   .method1569((byte) 122);
    }
    
    final DoublyLinkedNodeP2_Sub10 method1776(int argument_36_, GraphicsToolkit argument_37_) {
	Class167 class167
	    = ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607
		  .method1566(true, argument_37_, true, 2048, false);
	if (class167 == null)
	    return null;
	if (argument_36_ != -10)
	    method1770(47);
	Class350 class350 = argument_37_.method2015();
	class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	DoublyLinkedNodeP2_Sub10 class104_sub10
	    = Class3.method216(aBoolean6609, argument_36_ + 10, 1);
	int anLocalInt = ((DoublyLinkedNodeP2_Sub2) this).worldX >> 9;
	int anLocalInt_38_ = ((DoublyLinkedNodeP2_Sub2) this).worldZ >> 9;
	((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607.method1573
	    (argument_37_, true, anLocalInt, anLocalInt_38_, anLocalInt_38_,
	     anLocalInt, class350, class167, (byte) 118);
	if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
	    class167.method2640(class350, (((DoublyLinkedNodeP2_Sub10) class104_sub10)
					   .aClass104_Sub9Array4595[0]), 0);
	else
	    class167.method2646(class350,
				(((DoublyLinkedNodeP2_Sub10) class104_sub10)
				 .aClass104_Sub9Array4595[0]),
				Class390.anInt3285, 0);
	if ((((Class78) ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607)
	     .aClass104_Sub7_544)
	    != null) {
	    Class72 class72
		= ((Class78) ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607)
		      .aClass104_Sub7_544.method1932();
	    if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
		argument_37_.method2074(class72, Class390.anInt3285);
	    else
		argument_37_.method2067(class72);
	}
	aBoolean6608
	    = (class167.F()
	       || (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607)
		   .aClass104_Sub7_544) != null);
	if (aClass80_6606 != null)
	    Class217.method3010(class167, aClass80_6606,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				((DoublyLinkedNodeP2_Sub2) this).worldZ,
				((DoublyLinkedNodeP2_Sub2) this).worldX, 1);
	else
	    aClass80_6606
		= Class369.method4045(argument_36_ ^ 0x5bf1, class167,
				      ((DoublyLinkedNodeP2_Sub2) this).worldZ,
				      ((DoublyLinkedNodeP2_Sub2) this).worldX,
				      ((DoublyLinkedNodeP2_Sub2) this).anInt4511);
	return class104_sub10;
    }
    
    final void method1770(int argument_39_) {
	if (argument_39_ == -13514)
	    throw new IllegalStateException();
    }
    
    public final void method8(GraphicsToolkit argument_40_, int argument_41_) {
	if (argument_41_ == -4947)
	    ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607
		.method1578((byte) -125, argument_40_);
    }
    
    public final boolean method6(int argument_42_) {
	if (argument_42_ < 59)
	    return true;
	return ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607.method1577(-1);
    }
    
    public final int method7(int argument_43_) {
	if (argument_43_ != -23356)
	    return 39;
	return (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607)
		.anInt545);
    }
    
    DoublyLinkedNodeP2_Sub2_Sub3_Sub2
	(GraphicsToolkit argument_44_, Class266 argument_45_, int argument_46_,
	 int argument_47_, int argument_48_, int argument_49_,
	 int argument_50_, boolean argument_51_, int argument_52_,
	 int argument_53_, int argument_54_) {
	super(argument_48_, argument_49_, argument_50_, argument_46_,
	      argument_47_,
	      Class_aa.method161((byte) -43, argument_52_, argument_53_));
	((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607
	    = new Class78(argument_44_, argument_45_, argument_52_,
			  argument_53_, ((DoublyLinkedNodeP2_Sub2) this).lightingHL,
			  argument_47_, this, argument_51_, argument_54_);
	aBoolean6609
	    = ((Class266) argument_45_).anInt2123 != 0 && !argument_51_;
    }
    
    public final void method5(int argument_55_) {
	if (argument_55_ != 14667)
	    method1766(18);
    }
    
    final boolean method1766(int argument_56_) {
	if (argument_56_ > -87)
	    return true;
	return false;
    }
    
    public final void method4(GraphicsToolkit argument_57_, int argument_58_) {
	((DoublyLinkedNodeP2_Sub2_Sub3_Sub2) this).aClass78_6607
	    .method1575(argument_58_ + 18310, argument_57_);
	if (argument_58_ != -4351)
	    method2(7);
    }
}
