/* Class104_Sub2_Sub2_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub2_Sub2_Sub4 extends DoublyLinkedNodeP2_Sub2_Sub2
{
    static int anInt6711;
    private int anInt6712 = 0;
    private int anInt6713;
    private DoublyLinkedNodeP2_Sub7 aClass104_Sub7_6714;
    private int anInt6715;
    private int anInt6716;
    int anInt6717;
    private int anInt6718;
    private Class367 aClass367_6719;
    private boolean aBoolean6720;
    private int anInt6721 = 0;
    private int anInt6722;
    boolean aBoolean6723 = false;
    
    final int method1774(int argument_0_) {
	if (argument_0_ != -13878)
	    anInt6715 = -55;
	return anInt6718;
    }
    
    protected final void finalize() {
	if (aClass104_Sub7_6714 != null)
	    aClass104_Sub7_6714.method1930();
    }
    
    final void method1775(GraphicsToolkit argument_1_, DoublyLinkedNodeP2_Sub2 argument_2_,
			  boolean argument_3_, int argument_4_,
			  int argument_5_, int argument_6_, int argument_7_) {
	if (argument_4_ >= -16)
	    aClass367_6719 = null;
	throw new IllegalStateException();
    }
    
    final void method1770(int argument_8_) {
	if (argument_8_ != -13514)
	    method1774(51);
	throw new IllegalStateException();
    }
    
    private final Class167 method1817(GraphicsToolkit argument_9_, int argument_10_,
				      boolean argument_11_, int argument_12_) {
	Class126 class126
	    = Class194.aClass225_1414.method3054((byte) 123, argument_12_);
	Class_s class_s
	    = Statics.aClass_sArray2713[((DoublyLinkedNodeP2_Sub2) this).lightingHL];
	if (argument_11_)
	    return null;
	Class_s class_s_13_ = (((DoublyLinkedNodeP2_Sub2) this).aByte4509 >= 3 ? null
			       : (Statics.aClass_sArray2713
				  [((DoublyLinkedNodeP2_Sub2) this).aByte4509 + 1]));
	if (!((DoublyLinkedNodeP2_Sub2_Sub2_Sub4) this).aBoolean6723)
	    return class126.method2405((byte) 118, true,
				       ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				       argument_10_, anInt6722,
				       ((DoublyLinkedNodeP2_Sub2) this).worldX,
				       anInt6716, anInt6715,
				       DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425,
				       class_s,
				       ((DoublyLinkedNodeP2_Sub2) this).worldZ,
				       class_s_13_, argument_9_);
	return class126.method2405((byte) -89, true,
				   ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				   argument_10_, 0,
				   ((DoublyLinkedNodeP2_Sub2) this).worldX, -1, -1,
				   DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425, class_s,
				   ((DoublyLinkedNodeP2_Sub2) this).worldZ,
				   class_s_13_, argument_9_);
    }
    
    final void method1818(boolean argument_14_) {
	if (aClass104_Sub7_6714 != null)
	    aClass104_Sub7_6714.method1930();
    }
    
    final boolean method1782(int argument_15_) {
	if (argument_15_ != -1)
	    return false;
	return false;
    }
    
    final boolean method1771(int argument_16_, int argument_17_,
			     int argument_18_, GraphicsToolkit argument_19_) {
	if (argument_16_ != 4161)
	    return false;
	return false;
    }
    
    final DoublyLinkedNodeP2_Sub10 method1776(int argument_20_, GraphicsToolkit argument_21_) {
	Class167 class167
	    = method1817(argument_21_, (anInt6721 != 0 ? 5 : 0) | 0x800, false,
			 anInt6713);
	if (class167 == null)
	    return null;
	if (argument_20_ != -10)
	    method1819(-7, (byte) -83);
	if (anInt6721 != 0)
	    class167.a(anInt6721 * 2048);
	Class350 class350 = argument_21_.method2015();
	class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	method1820(-128, class167, class350, argument_21_);
	DoublyLinkedNodeP2_Sub10 class104_sub10 = Class3.method216(false, 0, 1);
	if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
	    class167.method2646(class350,
				(((DoublyLinkedNodeP2_Sub10) class104_sub10)
				 .aClass104_Sub9Array4595[0]),
				Class390.anInt3285, 0);
	else
	    class167.method2640(class350, (((DoublyLinkedNodeP2_Sub10) class104_sub10)
					   .aClass104_Sub9Array4595[0]), 0);
	if (aClass104_Sub7_6714 != null) {
	    Class72 class72 = aClass104_Sub7_6714.method1932();
	    if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
		argument_21_.method2067(class72);
	    else
		argument_21_.method2074(class72, Class390.anInt3285);
	}
	aBoolean6720 = class167.F();
	anInt6712 = class167.fa();
	anInt6718 = class167.ma();
	return class104_sub10;
    }
    
    final boolean method1766(int argument_22_) {
	if (argument_22_ >= -87)
	    anInt6712 = 7;
	return false;
    }
    
    final void method1819(int argument_23_, byte argument_24_) {
	if (!((DoublyLinkedNodeP2_Sub2_Sub2_Sub4) this).aBoolean6723) {
	    anInt6722 += argument_23_;
	    while (((Class367) aClass367_6719).anIntArray3094[anInt6715]
		   < anInt6722) {
		anInt6722
		    -= ((Class367) aClass367_6719).anIntArray3094[anInt6715];
		anInt6715++;
		if (((Class367) aClass367_6719).anIntArray3096.length
		    <= anInt6715) {
		    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub4) this).aBoolean6723 = true;
		    break;
		}
	    }
	    if (!((DoublyLinkedNodeP2_Sub2_Sub2_Sub4) this).aBoolean6723)
		Class313.method3622(this, 0, aClass367_6719, anInt6715);
	}
    }
    
    DoublyLinkedNodeP2_Sub2_Sub2_Sub4
	(int argument_25_, int argument_26_, int argument_27_,
	 int argument_28_, int argument_29_, int argument_30_,
	 int argument_31_, int argument_32_, int argument_33_,
	 int argument_34_, int argument_35_, int argument_36_,
	 int argument_37_) {
	super(argument_28_, argument_29_, argument_30_, argument_31_,
	      argument_32_, argument_33_, argument_34_, argument_35_,
	      argument_36_, false, (byte) 0);
	anInt6722 = 0;
	anInt6718 = 0;
	anInt6716 = -1;
	anInt6715 = 0;
	aBoolean6720 = true;
	anInt6721 = argument_37_;
	anInt6713 = argument_25_;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub4) this).anInt6717
	    = argument_26_ + argument_27_;
	Class126 class126
	    = Class194.aClass225_1414.method3054((byte) 83, anInt6713);
	int anLocalInt = ((Class126) class126).anInt1034;
	if (anLocalInt == -1)
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub4) this).aBoolean6723 = true;
	else {
	    aClass367_6719
		= DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758(anLocalInt, 0);
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub4) this).aBoolean6723 = false;
	}
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub4) this).anInt6717 == argument_27_)
	    Class313.method3622(this, 0, aClass367_6719, anInt6715);
    }
    
    final boolean method1772(int argument_38_) {
	if (argument_38_ != 0)
	    anInt6712 = 26;
	return aBoolean6720;
    }
    
    final void method1773(byte argument_39_, GraphicsToolkit argument_40_) {
	if (argument_39_ < 69)
	    method1819(83, (byte) -113);
	Class167 class167 = method1817(argument_40_, 0, false, anInt6713);
	if (class167 != null) {
	    Class350 class350 = argument_40_.method2015();
	    class350.method3825(((DoublyLinkedNodeP2_Sub2) this).worldX,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				((DoublyLinkedNodeP2_Sub2) this).worldZ);
	    method1820(-122, class167, class350, argument_40_);
	}
    }
    
    final Class80 method1769(GraphicsToolkit argument_41_, byte argument_42_) {
	if (argument_42_ != -126)
	    return null;
	return null;
    }
    
    private final void method1820(int argument_43_, Class167 argument_44_,
				  Class350 argument_45_,
				  GraphicsToolkit argument_46_) {
	int anLocalInt = -29 / ((-66 - argument_43_) / 54);
	argument_44_.method2656(argument_45_);
	Class38[] class38s = argument_44_.method2641();
	Class185[] class185s = argument_44_.method2655();
	if ((aClass104_Sub7_6714 == null
	     || ((DoublyLinkedNodeP2_Sub7) aClass104_Sub7_6714).aBoolean4563)
	    && (class38s != null || class185s != null))
	    aClass104_Sub7_6714
		= DoublyLinkedNodeP2_Sub7.method1931(Class333.anInt2720, true);
	if (aClass104_Sub7_6714 != null) {
	    aClass104_Sub7_6714.method1925(argument_46_,
					   (long) Class333.anInt2720, class38s,
					   class185s, false);
	    aClass104_Sub7_6714.method1929
		(((DoublyLinkedNodeP2_Sub2) this).lightingHL,
		 ((DoublyLinkedNodeP2_Sub2_Sub2) this).left,
		 ((DoublyLinkedNodeP2_Sub2_Sub2) this).right,
		 ((DoublyLinkedNodeP2_Sub2_Sub2) this).bottom,
		 ((DoublyLinkedNodeP2_Sub2_Sub2) this).top);
	}
    }
    
    final int method1781(int argument_47_) {
	if (argument_47_ != 748449288)
	    return 63;
	return anInt6712;
    }
}
