/* Class104_Sub2_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub2_Sub2_Sub1 extends DoublyLinkedNodeP2_Sub2_Sub2
{
    private int anInt6680;
    private double aDouble6681;
    private Class367 aClass367_6682;
    private int anInt6683;
    private int anInt6684 = 0;
    private int anInt6685;
    private double aDouble6686;
    private int anInt6687;
    private int anInt6688;
    private int anInt6689;
    private double aDouble6690;
    private int anInt6691;
    int anInt6692;
    private double aDouble6693;
    static Class306 aClass306_6694 = new Class306(2);
    private double aDouble6695;
    private int anInt6696;
    private double aDouble6697;
    private int anInt6698;
    int anInt6699;
    private double aDouble6700;
    private boolean aBoolean6701;
    int anInt6702;
    private int anInt6703;
    private double aDouble6704;
    int anInt6705;
    private DoublyLinkedNodeP2_Sub7 aClass104_Sub7_6706;
    private int anInt6707;
    private boolean aBoolean6708;
    private int anInt6709;
    private boolean aBoolean6710;
    
    final void method1773(byte argument_0_, GraphicsToolkit argument_1_) {
	Class167 class167 = method1808(0, true, argument_1_);
	if (class167 != null) {
	    Class350 class350 = argument_1_.method2015();
	    class350.method3841(anInt6688);
	    if (argument_0_ <= 69)
		aBoolean6701 = true;
	    class350.method3834(anInt6691);
	    class350.method3835((int) aDouble6697, (int) aDouble6681,
				(int) aDouble6695);
	    anInt6689 = class167.fa();
	    anInt6687 = class167.ma();
	    method1806(class167, (byte) -103, argument_1_, class350);
	}
    }
    
    DoublyLinkedNodeP2_Sub2_Sub2_Sub1(int argument_2_, int argument_3_, int argument_4_,
			    int argument_5_, int argument_6_, int argument_7_,
			    int argument_8_, int argument_9_, int argument_10_,
			    int argument_11_, int argument_12_,
			    int argument_13_, int argument_14_,
			    boolean argument_15_, int argument_16_) {
	super(argument_3_, argument_4_, argument_5_,
	      Node_Sub31_Sub36.method993(argument_3_, argument_5_, -12040,
                  argument_6_) - argument_7_,
	      argument_6_, argument_5_ >> 9, argument_5_ >> 9,
	      argument_6_ >> 9, argument_6_ >> 9, false, (byte) 0);
	anInt6683 = -1;
	anInt6689 = 0;
	anInt6687 = 0;
	anInt6698 = 0;
	aBoolean6708 = false;
	aBoolean6710 = false;
	anInt6707 = argument_16_;
	anInt6685 = argument_11_;
	aBoolean6710 = false;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub1) this).anInt6692 = argument_9_;
	anInt6703 = argument_2_;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub1) this).anInt6702 = argument_8_;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub1) this).anInt6705 = argument_14_;
	anInt6680 = argument_7_;
	anInt6696 = argument_10_;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub1) this).anInt6699 = argument_13_;
	anInt6709 = argument_12_;
	aBoolean6701 = argument_15_;
	int anLocalInt
	    = (((Class126) Class194.aClass225_1414.method3054((byte) 81,
							      anInt6703))
	       .anInt1034);
	if (anLocalInt != -1)
	    aClass367_6682
		= DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758(anLocalInt, 0);
	else
	    aClass367_6682 = null;
    }
    
    final boolean method1782(int argument_17_) {
	if (argument_17_ != -1)
	    finalize();
	return false;
    }
    
    final int method1774(int argument_18_) {
	if (argument_18_ != -13878)
	    aDouble6686 = 0.3755719478872897;
	return anInt6687;
    }
    
    public static void method1801(int argument) {
	aClass306_6694 = null;
    }
    
    final boolean method1771(int argument_19_, int argument_20_,
			     int argument_21_, GraphicsToolkit argument_22_) {
	if (argument_19_ != 4161)
	    method1766(-83);
	return false;
    }
    
    final void method1802(int argument_23_, byte argument_24_,
			  int argument_25_, int argument_26_,
			  int argument_27_) {
	if (!aBoolean6710) {
	    double d
		= (double) (argument_25_ - ((DoublyLinkedNodeP2_Sub2) this).worldX);
	    double d_28_
		= (double) (-((DoublyLinkedNodeP2_Sub2) this).worldZ + argument_27_);
	    double d_29_ = Math.sqrt(d * d + d_28_ * d_28_);
	    aDouble6695 = ((double) ((DoublyLinkedNodeP2_Sub2) this).worldZ
			   + (double) anInt6685 * d_28_ / d_29_);
	    aDouble6697 = ((double) ((DoublyLinkedNodeP2_Sub2) this).worldX
			   + (double) anInt6685 * d / d_29_);
	    if (!aBoolean6701)
		aDouble6681 = (double) ((DoublyLinkedNodeP2_Sub2) this).anInt4511;
	    else
		aDouble6681 = (double) ((Node_Sub31_Sub36.method993
                (((DoublyLinkedNodeP2_Sub2) this).lightingHL,
                        (int) aDouble6697, -12040,
                        (int) aDouble6695))
					- anInt6680);
	}
	double d = (double) (-argument_23_ + 1
			     + ((DoublyLinkedNodeP2_Sub2_Sub2_Sub1) this).anInt6692);
	aDouble6704 = ((double) argument_25_ - aDouble6697) / d;
	aDouble6690 = (-aDouble6695 + (double) argument_27_) / d;
	aDouble6693
	    = Math.sqrt(aDouble6690 * aDouble6690 + aDouble6704 * aDouble6704);
	if (anInt6696 != -1) {
	    if (!aBoolean6710)
		aDouble6700
		    = -aDouble6693 * Math.tan((double) anInt6696 * 0.02454369);
	    aDouble6686 = ((double) argument_26_ - aDouble6681
			   - d * aDouble6700) * 2.0 / (d * d);
	} else
	    aDouble6700 = ((double) argument_26_ - aDouble6681) / d;
    }
    
    final void method1803(int argument_30_) {
	if (!aBoolean6710) {
	    if (anInt6709 != argument_30_) {
		Entity entity = null;
		if (anInt6709 >= 0) {
		    int anLocalInt = anInt6709 - 1;
		    Node_Sub35 class59_sub35
			= ((Node_Sub35)
			   Class294.aJagexHashMap_2453.get((long) anLocalInt));
		    if (class59_sub35 != null)
			entity
			    = (((Node_Sub35) class59_sub35)
			       .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
		} else {
		    int anLocalInt = -anInt6709 - 1;
		    if (Class64.anInt451 == anLocalInt)
			entity
			    = Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587;
		    else
			entity
			    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
			       [anLocalInt]);
		}
		if (entity != null) {
		    ((DoublyLinkedNodeP2_Sub2) this).worldZ
			= ((DoublyLinkedNodeP2_Sub2) entity).worldZ;
		    ((DoublyLinkedNodeP2_Sub2) this).worldX
			= ((DoublyLinkedNodeP2_Sub2) entity).worldX;
		    ((DoublyLinkedNodeP2_Sub2) this).anInt4511
			= (Node_Sub31_Sub36.method993
                    (((DoublyLinkedNodeP2_Sub2) this).lightingHL,
                            (((DoublyLinkedNodeP2_Sub2) entity)
                                    .worldX),
                            -12040,
                            (((DoublyLinkedNodeP2_Sub2) entity)
                                    .worldZ))) - anInt6680;
		    if (anInt6707 >= 0) {
			Class354 class354
			    = entity.method1831();
			int anLocalInt = 0;
			int anLocalInt_31_ = 0;
			if (((Class354) class354).anIntArrayArray2958 != null
			    && (((Class354) class354).anIntArrayArray2958
				[anInt6707]) != null) {
			    anLocalInt_31_
				+= (((Class354) class354).anIntArrayArray2958
				    [anInt6707][2]);
			    anLocalInt += (((Class354) class354)
					   .anIntArrayArray2958[anInt6707][0]);
			}
			if (((Class354) class354).anIntArrayArray3001 != null
			    && (((Class354) class354).anIntArrayArray3001
				[anInt6707]) != null) {
			    anLocalInt_31_
				+= (((Class354) class354).anIntArrayArray3001
				    [anInt6707][2]);
			    anLocalInt += (((Class354) class354)
					   .anIntArrayArray3001[anInt6707][0]);
			}
			if (anLocalInt != 0 || anLocalInt_31_ != 0) {
			    int anLocalInt_32_
				= ((Entity) entity)
				      .aClass271_6780.method3372(2);
			    int anLocalInt_33_ = anLocalInt_32_;
			    if ((((Entity) entity).anIntArray6792
				 != null)
				&& (((Entity) entity)
				    .anIntArray6792[anInt6707]) != -1)
				anLocalInt_33_ = (((Entity) entity)
						  .anIntArray6792[anInt6707]);
			    int anLocalInt_34_
				= -anLocalInt_32_ + anLocalInt_33_ & 0x3fff;
			    int anLocalInt_35_
				= Node_Sub6.SINETABLE[anLocalInt_34_];
			    int anLocalInt_36_
				= Node_Sub6.COSINETABLE[anLocalInt_34_];
			    int anLocalInt_37_
				= ((anLocalInt_36_ * anLocalInt
				    + anLocalInt_31_ * anLocalInt_35_)
				   >> 14);
			    anLocalInt_31_
				= (-(anLocalInt_35_ * anLocalInt)
				   + anLocalInt_36_ * anLocalInt_31_) >> 14;
			    anLocalInt = anLocalInt_37_;
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ += anLocalInt_31_;
			    ((DoublyLinkedNodeP2_Sub2) this).worldX += anLocalInt;
			}
		    }
		}
	    }
	}
    }
    
    final Class80 method1769(GraphicsToolkit argument_38_, byte argument_39_) {
	if (argument_39_ != -126)
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub1) this).anInt6702 = 49;
	return null;
    }
    
    final boolean method1772(int argument_40_) {
	if (argument_40_ != 0)
	    return false;
	return aBoolean6708;
    }
    
    protected final void finalize() {
	if (aClass104_Sub7_6706 != null)
	    aClass104_Sub7_6706.method1930();
    }
    
    final int method1781(int argument_41_) {
	if (argument_41_ != 748449288)
	    method1770(99);
	return anInt6689;
    }
    
    final void method1770(int argument_42_) {
	if (argument_42_ == -13514)
	    throw new IllegalStateException();
    }
    
    final void method1804(int argument_43_, int argument_44_) {
	aDouble6697 += aDouble6704 * (double) argument_44_;
	aDouble6695 += (double) argument_44_ * aDouble6690;
	aBoolean6710 = true;
	if (aBoolean6701)
	    aDouble6681
		= (double) (Node_Sub31_Sub36.method993(((DoublyLinkedNodeP2_Sub2)
                this).lightingHL,
                (int) aDouble6697,
                -12040,
                (int) aDouble6695)
			    - anInt6680);
	else if (anInt6696 != -1) {
	    aDouble6681 += (aDouble6700 * (double) argument_44_
			    + ((double) argument_44_ * (aDouble6686 * 0.5)
			       * (double) argument_44_));
	    aDouble6700 += (double) argument_44_ * aDouble6686;
	} else
	    aDouble6681 += aDouble6700 * (double) argument_44_;
	anInt6691 = (int) (Math.atan2(aDouble6704, aDouble6690)
			   * 2607.5945876176133) + 8192 & argument_43_;
	anInt6688 = (int) (Math.atan2(aDouble6700, aDouble6693)
			   * 2607.5945876176133) & 0x3fff;
	if (aClass367_6682 != null) {
	    anInt6684 += argument_44_;
	    while (((Class367) aClass367_6682).anIntArray3094[anInt6698]
		   < anInt6684) {
		anInt6684
		    -= ((Class367) aClass367_6682).anIntArray3094[anInt6698];
		anInt6698++;
		if (anInt6698
		    >= ((Class367) aClass367_6682).anIntArray3096.length) {
		    anInt6698 -= ((Class367) aClass367_6682).anInt3109;
		    if (anInt6698 < 0
			|| (((Class367) aClass367_6682).anIntArray3096.length
			    <= anInt6698))
			anInt6698 = 0;
		}
		anInt6683 = anInt6698 + 1;
		if (anInt6683
		    >= ((Class367) aClass367_6682).anIntArray3096.length) {
		    anInt6683 -= ((Class367) aClass367_6682).anInt3109;
		    if (anInt6683 < 0
			|| anInt6683 >= (((Class367) aClass367_6682)
					 .anIntArray3096).length)
			anInt6683 = -1;
		}
	    }
	}
    }
    
    static final void method1805(int argument, int argument_45_,
				 int argument_46_, int argument_47_,
				 int argument_48_, int argument_49_,
				 int argument_50_, int argument_51_) {
	if (Node_Sub35.anInt4156 > argument
	    || argument_51_ > Node_Sub9_Sub2.anInt5776
	    || argument_48_ < Class209.anInt1504
	    || argument_49_ > Node_Sub31_Sub13.anInt5896)
	    Class235.method3113(argument, argument_50_, argument_49_, 0,
				argument_46_, argument_51_, argument_47_,
				argument_48_);
	else
	    Class5.method222(argument_49_, 1, argument_46_, argument_50_,
			     argument_47_, argument, argument_51_,
			     argument_48_);
    }
    
    private final void method1806(Class167 argument_52_, byte argument_53_,
				  GraphicsToolkit argument_54_,
				  Class350 argument_55_) {
	argument_52_.method2656(argument_55_);
	Class38[] class38s = argument_52_.method2641();
	Class185[] class185s = argument_52_.method2655();
	if ((aClass104_Sub7_6706 == null
	     || ((DoublyLinkedNodeP2_Sub7) aClass104_Sub7_6706).aBoolean4563)
	    && (class38s != null || class185s != null))
	    aClass104_Sub7_6706
		= DoublyLinkedNodeP2_Sub7.method1931(Class333.anInt2720, true);
	if (aClass104_Sub7_6706 != null) {
	    aClass104_Sub7_6706.method1925(argument_54_,
					   (long) Class333.anInt2720, class38s,
					   class185s, false);
	    aClass104_Sub7_6706.method1929
		(((DoublyLinkedNodeP2_Sub2) this).lightingHL,
		 ((DoublyLinkedNodeP2_Sub2_Sub2) this).left,
		 ((DoublyLinkedNodeP2_Sub2_Sub2) this).right,
		 ((DoublyLinkedNodeP2_Sub2_Sub2) this).bottom,
		 ((DoublyLinkedNodeP2_Sub2_Sub2) this).top);
	}
	int anLocalInt = 47 / ((-41 - argument_53_) / 60);
    }
    
    final boolean method1766(int argument_56_) {
	if (argument_56_ >= -87)
	    aClass306_6694 = null;
	return false;
    }
    
    final void method1795(int argument_57_) {
	((DoublyLinkedNodeP2_Sub2_Sub2) this).left
	    = ((DoublyLinkedNodeP2_Sub2_Sub2) this).right
	    = (short) (int) (aDouble6697 / 512.0);
	if (argument_57_ < -122)
	    ((DoublyLinkedNodeP2_Sub2_Sub2) this).bottom
		= ((DoublyLinkedNodeP2_Sub2_Sub2) this).top
		= (short) (int) (aDouble6695 / 512.0);
    }
    
    final void method1807(byte argument_58_) {
	if (aClass104_Sub7_6706 != null)
	    aClass104_Sub7_6706.method1930();
    }
    
    final void method1775(GraphicsToolkit argument_59_, DoublyLinkedNodeP2_Sub2 argument_60_,
			  boolean argument_61_, int argument_62_,
			  int argument_63_, int argument_64_,
			  int argument_65_) {
	if (argument_62_ >= -16)
	    aDouble6704 = -1.7224802544073619;
	throw new IllegalStateException();
    }
    
    private final Class167 method1808(int argument_66_, boolean argument_67_,
				      GraphicsToolkit argument_68_) {
	if (argument_67_ != true)
	    aClass306_6694 = null;
	Class126 class126
	    = Class194.aClass225_1414.method3054((byte) 116, anInt6703);
	return class126.method2414(argument_66_, argument_68_, anInt6698,
				   DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425,
				   anInt6684, 0, anInt6683);
    }
    
    final DoublyLinkedNodeP2_Sub10 method1776(int argument_69_, GraphicsToolkit argument_70_) {
	Class167 class167 = method1808(2048, true, argument_70_);
	if (class167 == null)
	    return null;
	Class350 class350 = argument_70_.method2015();
	class350.method3841(anInt6688);
	class350.method3834(anInt6691);
	class350.method3835((int) aDouble6697, (int) aDouble6681,
			    (int) aDouble6695);
	method1806(class167, (byte) -105, argument_70_, class350);
	DoublyLinkedNodeP2_Sub10 class104_sub10
	    = Class3.method216(false, argument_69_ ^ argument_69_, 1);
	if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
	    class167.method2646(class350,
				(((DoublyLinkedNodeP2_Sub10) class104_sub10)
				 .aClass104_Sub9Array4595[0]),
				Class390.anInt3285, 0);
	else
	    class167.method2640(class350, (((DoublyLinkedNodeP2_Sub10) class104_sub10)
					   .aClass104_Sub9Array4595[0]), 0);
	if (aClass104_Sub7_6706 != null) {
	    Class72 class72 = aClass104_Sub7_6706.method1932();
	    if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
		argument_70_.method2067(class72);
	    else
		argument_70_.method2074(class72, Class390.anInt3285);
	}
	aBoolean6708 = class167.F();
	anInt6689 = class167.fa();
	anInt6687 = class167.ma();
	return class104_sub10;
    }
}
