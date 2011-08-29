/* Class104_Sub2_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub2_Sub5_Sub1 extends DoublyLinkedNodeP2_Sub2_Sub5
{
    int anInt6806;
    int anInt6807 = -1;
    int anInt6808;
    private int anInt6809;
    int anInt6810;
    int anInt6811;
    int anInt6812 = -1;
    static Class166 aClass166_6813 = new Class166(111, 7);
    private boolean aBoolean6814;
    int anInt6815;
    
    final DoublyLinkedNodeP2_Sub10 method1776(int argument_0_, GraphicsToolkit argument_1_) {
	Class110 class110
	    = Class222_Sub2.method3035(((DoublyLinkedNodeP2_Sub2) this).lightingHL,
				       (((DoublyLinkedNodeP2_Sub2) this).worldX
					>> LightingManager.lightCoordRShift),
				       (((DoublyLinkedNodeP2_Sub2) this).worldZ
					>> LightingManager.lightCoordRShift));
	DoublyLinkedNodeP2_Sub2_Sub4 class104_sub2_sub4
	    = Statics.method1330(((DoublyLinkedNodeP2_Sub2) this).lightingHL, (((DoublyLinkedNodeP2_Sub2) this).worldX >> LightingManager.lightCoordRShift), (((DoublyLinkedNodeP2_Sub2) this).worldZ >> LightingManager.lightCoordRShift));
	int anLocalInt = 0;
	if (class110 != null
	    && ((DoublyLinkedNodeP2_Sub2_Sub2)
		((Class110) class110).aClass104_Sub2_Sub2_911).aBoolean6411)
	    anLocalInt = ((Class110) class110).aClass104_Sub2_Sub2_911
			     .method1781(748449288);
	if (class104_sub2_sub4 != null
	    && (-anLocalInt
		< ((DoublyLinkedNodeP2_Sub2_Sub4) class104_sub2_sub4).aShort6424))
	    anLocalInt = -((DoublyLinkedNodeP2_Sub2_Sub4) class104_sub2_sub4).aShort6424;
	if (anLocalInt != ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6815) {
	    ((DoublyLinkedNodeP2_Sub2) this).anInt4511
		-= ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6815;
	    ((DoublyLinkedNodeP2_Sub2) this).anInt4511 += anLocalInt;
	    ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6815 = anLocalInt;
	}
	Class350 class350 = argument_1_.method2015();
	class350.method3840();
	if (((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6815 == 0) {
	    boolean anLocalBoolean = false;
	    boolean anLocalBoolean_2_ = false;
	    boolean anLocalBoolean_3_ = false;
	    Class_s class_s = (Node_Sub31_Sub5.aClass_sArray5858
			       [((DoublyLinkedNodeP2_Sub2) this).aByte4509]);
	    int anLocalInt_4_ = anInt6809 << 1;
	    int anLocalInt_5_ = anLocalInt_4_;
	    int anLocalInt_6_ = -anLocalInt_4_ / 2;
	    int anLocalInt_7_ = -anLocalInt_5_ / 2;
	    int anLocalInt_8_
		= class_s.method3541((anLocalInt_7_
				      + ((DoublyLinkedNodeP2_Sub2) this).worldZ),
				     0,
				     (((DoublyLinkedNodeP2_Sub2) this).worldX
				      + anLocalInt_6_));
	    int anLocalInt_9_ = anLocalInt_4_ / 2;
	    int anLocalInt_10_ = -anLocalInt_5_ / 2;
	    int anLocalInt_11_
		= class_s.method3541((anLocalInt_10_
				      + ((DoublyLinkedNodeP2_Sub2) this).worldZ),
				     0,
				     (((DoublyLinkedNodeP2_Sub2) this).worldX
				      + anLocalInt_9_));
	    int anLocalInt_12_ = -anLocalInt_4_ / 2;
	    int anLocalInt_13_ = anLocalInt_5_ / 2;
	    int anLocalInt_14_
		= class_s.method3541((anLocalInt_13_
				      + ((DoublyLinkedNodeP2_Sub2) this).worldZ),
				     0,
				     (anLocalInt_12_
				      + ((DoublyLinkedNodeP2_Sub2) this).worldX));
	    int anLocalInt_15_ = anLocalInt_4_ / 2;
	    int anLocalInt_16_ = anLocalInt_5_ / 2;
	    int anLocalInt_17_
		= class_s.method3541((anLocalInt_16_
				      + ((DoublyLinkedNodeP2_Sub2) this).worldZ),
				     0,
				     (((DoublyLinkedNodeP2_Sub2) this).worldX
				      + anLocalInt_15_));
	    int anLocalInt_18_ = (anLocalInt_8_ >= anLocalInt_11_
				  ? anLocalInt_11_ : anLocalInt_8_);
	    int anLocalInt_19_ = (anLocalInt_17_ > anLocalInt_14_
				  ? anLocalInt_14_ : anLocalInt_17_);
	    int anLocalInt_20_ = (anLocalInt_17_ > anLocalInt_11_
				  ? anLocalInt_11_ : anLocalInt_17_);
	    if (anLocalInt_5_ != 0) {
		int anLocalInt_21_
		    = ((int) (Math.atan2((double) (anLocalInt_18_
						   - anLocalInt_19_),
					 (double) anLocalInt_5_)
			      * 2607.5945876176133)
		       & 0x3fff);
		if (anLocalInt_21_ != 0)
		    class350.method3833(anLocalInt_21_);
	    }
	    int anLocalInt_22_ = (anLocalInt_14_ > anLocalInt_8_
				  ? anLocalInt_8_ : anLocalInt_14_);
	    int anLocalInt_23_ = anLocalInt_8_ + anLocalInt_17_;
	    if (anLocalInt_4_ != 0) {
		int anLocalInt_24_
		    = ((int) (Math.atan2((double) (-anLocalInt_20_
						   + anLocalInt_22_),
					 (double) anLocalInt_4_)
			      * 2607.5945876176133)
		       & 0x3fff);
		if (anLocalInt_24_ != 0)
		    class350.method3837(-anLocalInt_24_);
	    }
	    if (anLocalInt_23_ > anLocalInt_11_ + anLocalInt_14_)
		anLocalInt_23_ = anLocalInt_11_ + anLocalInt_14_;
	    anLocalInt_23_
		= (anLocalInt_23_ >> 1) - ((DoublyLinkedNodeP2_Sub2) this).anInt4511;
	    if (anLocalInt_23_ != 0)
		class350.method3835(0, anLocalInt_23_, 0);
	}
	class350.method3835(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    argument_0_ + ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	DoublyLinkedNodeP2_Sub10 class104_sub10 = Class3.method216(true, 0, 3);
	anInt6809 = 0;
	aBoolean6814 = false;
	if (((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6812 != -1) {
	    Class167 class167
		= (Class253_Sub1_Sub1.aClass365_6632.method3975
		       (123, ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6812)
		       .method4057
		   (2048, -1, 5, null, 0, 0, argument_1_, null,
		    ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6811));
	    if (class167 != null) {
		if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
		    class167.method2646(class350,
					(((DoublyLinkedNodeP2_Sub10) class104_sub10)
					 .aClass104_Sub9Array4595[2]),
					Class390.anInt3285, 0);
		else
		    class167.method2640(class350,
					(((DoublyLinkedNodeP2_Sub10) class104_sub10)
					 .aClass104_Sub9Array4595[2]),
					0);
		aBoolean6814 |= class167.F();
		anInt6809 = class167.ma();
	    }
	}
	if (((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6807 != -1) {
	    Class167 class167
		= (Class253_Sub1_Sub1.aClass365_6632.method3975
		       (121, ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6807)
		       .method4057
		   (2048, -1, 5, null, 0, 0, argument_1_, null,
		    ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6810));
	    if (class167 != null) {
		if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
		    class167.method2640(class350,
					(((DoublyLinkedNodeP2_Sub10) class104_sub10)
					 .aClass104_Sub9Array4595[1]),
					0);
		else
		    class167.method2646(class350,
					(((DoublyLinkedNodeP2_Sub10) class104_sub10)
					 .aClass104_Sub9Array4595[1]),
					Class390.anInt3285, 0);
		aBoolean6814 |= class167.F();
		if (class167.ma() > anInt6809)
		    anInt6809 = class167.ma();
	    }
	}
	Class167 class167
	    = (Class253_Sub1_Sub1.aClass365_6632.method3975
		   (125, ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6808).method4057
	       (2048, -1, argument_0_ ^ ~0xc, null, 0, 0, argument_1_, null,
		((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6806));
	if (class167 != null) {
	    if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
		class167.method2646(class350,
				    (((DoublyLinkedNodeP2_Sub10) class104_sub10)
				     .aClass104_Sub9Array4595[0]),
				    Class390.anInt3285, 0);
	    else
		class167.method2640(class350,
				    (((DoublyLinkedNodeP2_Sub10) class104_sub10)
				     .aClass104_Sub9Array4595[0]),
				    0);
	    aBoolean6814 |= class167.F();
	    if (class167.ma() > anInt6809)
		anInt6809 = class167.ma();
	}
	return class104_sub10;
    }
    
    final int method1774(int argument_25_) {
	if (argument_25_ != -13878)
	    ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6806 = -32;
	return anInt6809;
    }
    
    final boolean method1766(int argument_26_) {
	if (argument_26_ >= -87)
	    return true;
	return false;
    }
    
    final boolean method1772(int argument_27_) {
	if (argument_27_ != 0)
	    return true;
	return aBoolean6814;
    }
    
    DoublyLinkedNodeP2_Sub2_Sub5_Sub1(int argument_28_, int argument_29_,
			    int argument_30_, int argument_31_,
			    int argument_32_) {
	super(argument_28_, argument_29_, argument_30_, argument_31_,
	      argument_32_);
	anInt6809 = 0;
	((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6815 = 0;
	aBoolean6814 = false;
    }
    
    final boolean method1771(int argument_33_, int argument_34_,
			     int argument_35_, GraphicsToolkit argument_36_) {
	Class350 class350 = argument_36_.method2015();
	if (argument_33_ != 4161)
	    method1766(11);
	class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511 - 10,
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	Class371 class371
	    = Class253_Sub1_Sub1.aClass365_6632
		  .method3975(123, ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6808);
	Class167 class167
	    = class371.method4057(131072, -1, 5, null, 0, 0, argument_36_,
				  null,
				  ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6806);
	if (class167 != null
	    && (DoublyLinkedNodeP2_Sub3.aBoolean4523
		? class167.method2637(argument_35_, argument_34_, class350,
				      true, ((Class371) class371).anInt3125,
				      Class390.anInt3285)
		: class167.method2645(argument_35_, argument_34_, class350,
				      true, ((Class371) class371).anInt3125)))
	    return true;
	if (((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6807 != -1) {
	    Class371 class371_37_
		= (Class253_Sub1_Sub1.aClass365_6632.method3975
		   (-108, ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6807));
	    class167
		= class371_37_.method4057(131072, -1, 5, null, 0, 0,
					  argument_36_, null,
					  (((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this)
					   .anInt6810));
	    if (class167 != null
		&& (DoublyLinkedNodeP2_Sub3.aBoolean4523
		    ? class167.method2637(argument_35_, argument_34_, class350,
					  true,
					  ((Class371) class371_37_).anInt3125,
					  Class390.anInt3285)
		    : class167.method2645(argument_35_, argument_34_, class350,
					  true,
					  (((Class371) class371_37_)
					   .anInt3125))))
		return true;
	}
	if (((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6812 != -1) {
	    Class371 class371_38_
		= (Class253_Sub1_Sub1.aClass365_6632.method3975
		   (argument_33_ - 4229,
		    ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6812));
	    class167
		= class371_38_.method4057(131072, -1, argument_33_ - 4156,
					  null, 0, 0, argument_36_, null,
					  (((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this)
					   .anInt6811));
	    if (class167 != null
		&& (!DoublyLinkedNodeP2_Sub3.aBoolean4523
		    ? class167.method2645(argument_35_, argument_34_, class350,
					  true,
					  ((Class371) class371_38_).anInt3125)
		    : class167.method2637(argument_35_, argument_34_, class350,
					  true,
					  ((Class371) class371_38_).anInt3125,
					  Class390.anInt3285)))
		return true;
	}
	return false;
    }
    
    final void method1773(byte argument_39_, GraphicsToolkit argument_40_) {
	if (argument_39_ <= 69) {
	    /* empty */
	}
    }
    
    public static void method1896(byte argument) {
	aClass166_6813 = null;
    }
    
    final int method1781(int argument_41_) {
	if (argument_41_ != 748449288)
	    method1896((byte) -76);
	return -10;
    }
    
    final Class80 method1769(GraphicsToolkit argument_42_, byte argument_43_) {
	if (argument_43_ != -126)
	    method1771(-93, 52, 82, null);
	return null;
    }
    
    final int method1779(boolean argument_44_) {
	Class371 class371
	    = Class253_Sub1_Sub1.aClass365_6632
		  .method3975(-26, ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6808);
	int anLocalInt = ((Class371) class371).anInt3125;
	if (((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6807 != -1) {
	    Class371 class371_45_
		= (Class253_Sub1_Sub1.aClass365_6632.method3975
		   (5, ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6807));
	    if (((Class371) class371_45_).anInt3125 > anLocalInt)
		anLocalInt = ((Class371) class371_45_).anInt3125;
	}
	if (((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6812 != -1) {
	    Class371 class371_46_
		= (Class253_Sub1_Sub1.aClass365_6632.method3975
		   (-24, ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) this).anInt6812));
	    if (((Class371) class371_46_).anInt3125 > anLocalInt)
		anLocalInt = ((Class371) class371_46_).anInt3125;
	}
	if (argument_44_ != true)
	    aClass166_6813 = null;
	return anLocalInt;
    }
}
