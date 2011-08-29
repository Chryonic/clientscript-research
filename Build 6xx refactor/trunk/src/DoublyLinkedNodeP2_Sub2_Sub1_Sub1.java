/* Class104_Sub2_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub2_Sub1_Sub1 extends DoublyLinkedNodeP2_Sub2_Sub1
    implements Interface2
{
    private boolean aBoolean6553;
    Class78 aClass78_6554;
    private boolean aBoolean6555 = false;
    private Class80 aClass80_6557;
    static int anInt6558 = 2;
    
    public final int method3(int argument_0_) {
	if (argument_0_ != -2132)
	    return -103;
	return (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554)
		.anInt555);
    }
    
    public final int method2(int argument_1_) {
	if (argument_1_ != -10908)
	    method1773((byte) -71, null);
	return (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554)
		.anInt548);
    }
    
    final boolean method1766(int argument_2_) {
	if (argument_2_ > -87)
	    method7(-79);
	return false;
    }
    
    public final void method8(GraphicsToolkit argument_3_, int argument_4_) {
	if (argument_4_ != -4947)
	    Class211.aClass211_6556 = null;
	((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554.method1578((byte) -124,
								  argument_3_);
    }
    
    DoublyLinkedNodeP2_Sub2_Sub1_Sub1
	(GraphicsToolkit argument_5_, Class266 argument_6_, int argument_7_,
	 int argument_8_, int argument_9_, int argument_10_, int argument_11_,
	 boolean argument_12_, int argument_13_, int argument_14_,
	 int argument_15_, int argument_16_, int argument_17_) {
	super(argument_9_, argument_10_, argument_11_, argument_7_,
	      argument_8_, argument_13_, argument_14_);
	((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554
	    = new Class78(argument_5_, argument_6_, argument_15_, argument_16_,
			  ((DoublyLinkedNodeP2_Sub2) this).lightingHL, argument_8_, this,
			  argument_12_, argument_17_);
	aBoolean6553
	    = ((Class266) argument_6_).anInt2123 != 0 && !argument_12_;
    }
    
    final boolean method1772(int argument_18_) {
	if (argument_18_ != 0)
	    method1774(98);
	return aBoolean6555;
    }
    
    final DoublyLinkedNodeP2_Sub10 method1776(int argument_19_, GraphicsToolkit argument_20_) {
	Class167 class167
	    = ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554
		  .method1566(true, argument_20_, true, 2048, false);
	if (class167 == null)
	    return null;
	Class350 class350 = argument_20_.method2015();
	class350.method3825((((DoublyLinkedNodeP2_Sub2) this).worldX
			     + ((DoublyLinkedNodeP2_Sub2_Sub1) this).aShort6400),
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    (((DoublyLinkedNodeP2_Sub2_Sub1) this).aShort6401
			     + ((DoublyLinkedNodeP2_Sub2) this).worldZ));
	if (argument_19_ != -10)
	    method1774(-127);
	DoublyLinkedNodeP2_Sub10 class104_sub10
	    = Class3.method216(aBoolean6553, argument_19_ + 10, 1);
	int anLocalInt = ((DoublyLinkedNodeP2_Sub2) this).worldX >> 9;
	int anLocalInt_21_ = ((DoublyLinkedNodeP2_Sub2) this).worldZ >> 9;
	((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554.method1573
	    (argument_20_, true, anLocalInt, anLocalInt_21_, anLocalInt_21_,
	     anLocalInt, class350, class167, (byte) 92);
	if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
	    class167.method2646(class350,
				(((DoublyLinkedNodeP2_Sub10) class104_sub10)
				 .aClass104_Sub9Array4595[0]),
				Class390.anInt3285, 0);
	else
	    class167.method2640(class350, (((DoublyLinkedNodeP2_Sub10) class104_sub10)
					   .aClass104_Sub9Array4595[0]), 0);
	if ((((Class78) ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554)
	     .aClass104_Sub7_544)
	    != null) {
	    Class72 class72
		= ((Class78) ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554)
		      .aClass104_Sub7_544.method1932();
	    if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
		argument_20_.method2067(class72);
	    else
		argument_20_.method2074(class72, Class390.anInt3285);
	}
	aBoolean6555
	    = (class167.F()
	       || (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554)
		   .aClass104_Sub7_544) != null);
	if (aClass80_6557 == null)
	    aClass80_6557
		= Class369.method4045(-23545, class167,
				      ((DoublyLinkedNodeP2_Sub2) this).worldZ,
				      ((DoublyLinkedNodeP2_Sub2) this).worldX,
				      ((DoublyLinkedNodeP2_Sub2) this).anInt4511);
	else
	    Class217.method3010(class167, aClass80_6557,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				((DoublyLinkedNodeP2_Sub2) this).worldZ,
				((DoublyLinkedNodeP2_Sub2) this).worldX,
				argument_19_ ^ ~0x8);
	return class104_sub10;
    }
    
    public static void method1785(boolean argument) {
	Class211.aClass211_6556 = null;
    }
    
    final int method1781(int argument_22_) {
	if (argument_22_ != 748449288)
	    ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554 = null;
	return ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554
		   .method1568((byte) -122);
    }
    
    public final void method5(int argument_23_) {
	if (argument_23_ != 14667)
	    Class211.aClass211_6556 = null;
    }
    
    final void method1786(int argument_24_, Class120 argument_25_) {
	((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554
	    .method1572(-1090, argument_25_);
    }
    
    final Class80 method1769(GraphicsToolkit argument_26_, byte argument_27_) {
	if (argument_27_ != -126)
	    ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554 = null;
	return aClass80_6557;
    }
    
    final int method1774(int argument_28_) {
	if (argument_28_ != -13878)
	    method1776(42, null);
	return ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554
		   .method1569((byte) 111);
    }
    
    static final Class212[] method1787(int argument) {
	return new Class212[] { Class245_Sub2_Sub2.aClass212_6523,
				Class245_Sub2_Sub2.aClass212_6526,
				Class245_Sub2_Sub2.aClass212_6527,
				Class245_Sub2_Sub2.aClass212_6528,
				Class245_Sub2_Sub2.aClass212_6529,
				Class245_Sub2_Sub2.aClass212_6530,
				Class245_Sub2_Sub2.aClass212_6531,
				Class245_Sub2_Sub2.aClass212_6532,
				Class245_Sub2_Sub2.aClass212_6533,
				Class245_Sub2_Sub2.aClass212_6534,
				Class245_Sub2_Sub2.aClass212_6535,
				Class245_Sub2_Sub2.aClass212_6536,
				Class245_Sub2_Sub2.aClass212_6537 };
    }
    
    public final boolean method6(int argument_29_) {
	if (argument_29_ <= 59)
	    return true;
	return ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554.method1577(-1);
    }
    
    public final int method7(int argument_30_) {
	if (argument_30_ != -23356)
	    ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554 = null;
	return (((Class78) ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554)
		.anInt545);
    }
    
    final void method1773(byte argument_31_, GraphicsToolkit argument_32_) {
	Class167 class167
	    = ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554
		  .method1566(true, argument_32_, true, 262144, false);
	if (class167 != null) {
	    int anLocalInt = ((DoublyLinkedNodeP2_Sub2) this).worldX >> 9;
	    int anLocalInt_33_ = ((DoublyLinkedNodeP2_Sub2) this).worldZ >> 9;
	    Class350 class350 = argument_32_.method2015();
	    class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				((DoublyLinkedNodeP2_Sub2) this).worldZ);
	    ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554.method1573
		(argument_32_, false, anLocalInt, anLocalInt_33_,
		 anLocalInt_33_, anLocalInt, class350, class167, (byte) 109);
	}
	if (argument_31_ <= 69)
	    aClass80_6557 = null;
    }
    
    final boolean method1771(int argument_34_, int argument_35_,
			     int argument_36_, GraphicsToolkit argument_37_) {
	if (argument_34_ != 4161)
	    aBoolean6553 = false;
	Class167 class167
	    = ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554
		  .method1566(true, argument_37_, false, 131072, false);
	if (class167 == null)
	    return false;
	Class350 class350 = argument_37_.method2015();
	class350.method3825((((DoublyLinkedNodeP2_Sub2_Sub1) this).aShort6400
			     + ((DoublyLinkedNodeP2_Sub2) this).worldX),
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    (((DoublyLinkedNodeP2_Sub2_Sub1) this).aShort6401
			     + ((DoublyLinkedNodeP2_Sub2) this).worldZ));
	if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
	    return class167.method2637(argument_36_, argument_35_, class350,
				       false, 0, Class390.anInt3285);
	return class167.method2645(argument_36_, argument_35_, class350, false,
				   0);
    }
    
    public final void method4(GraphicsToolkit argument_38_, int argument_39_) {
	((DoublyLinkedNodeP2_Sub2_Sub1_Sub1) this).aClass78_6554
	    .method1575(13959, argument_38_);
	if (argument_39_ != -4351)
	    aClass80_6557 = null;
    }
}
