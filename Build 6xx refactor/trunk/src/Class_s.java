/* Class_s - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

abstract class Class_s
{
    static Rectangle[] aRectangleArray2545 = new Rectangle[100];
    int[][] anIntArrayArray2546;
    int anInt2547;
    int anInt2548;
    int anInt2549;
    int anInt2550;
    static Class195 aClass195_2551;
    
    static final void method3532(int argument, boolean argument_0_,
				 int argument_1_, int argument_2_,
				 int argument_3_, int argument_4_) {
	int anLocalInt = argument_2_ - argument_1_;
	int anLocalInt_5_ = argument_3_ - argument_4_;
	if (anLocalInt_5_ != 0) {
	    if (anLocalInt == 0) {
		Node_Sub31_Sub1.method881(argument_4_, argument_3_, -123,
                argument, argument_1_);
		return;
	    }
	} else {
	    if (anLocalInt != 0)
		Class376.method4090(argument_2_, true, argument, argument_4_,
				    argument_1_);
	    return;
	}
	if (anLocalInt_5_ < 0)
	    anLocalInt_5_ = -anLocalInt_5_;
	if (anLocalInt < 0)
	    anLocalInt = -anLocalInt;
	boolean anLocalBoolean = anLocalInt > anLocalInt_5_;
	if (anLocalBoolean) {
	    int anLocalInt_6_ = argument_4_;
	    argument_4_ = argument_1_;
	    int anLocalInt_7_ = argument_3_;
	    argument_3_ = argument_2_;
	    argument_1_ = anLocalInt_6_;
	    argument_2_ = anLocalInt_7_;
	}
	if (argument_4_ > argument_3_) {
	    int anLocalInt_8_ = argument_4_;
	    int anLocalInt_9_ = argument_1_;
	    argument_4_ = argument_3_;
	    argument_3_ = anLocalInt_8_;
	    argument_1_ = argument_2_;
	    argument_2_ = anLocalInt_9_;
	}
	int anLocalInt_10_ = argument_1_;
	int anLocalInt_11_ = argument_3_ - argument_4_;
	int anLocalInt_12_ = argument_2_ - argument_1_;
	int anLocalInt_13_ = -(anLocalInt_11_ >> 1);
	int anLocalInt_14_ = argument_1_ < argument_2_ ? 1 : -1;
	if (anLocalInt_12_ < 0)
	    anLocalInt_12_ = -anLocalInt_12_;
	if (!anLocalBoolean) {
	    for (int anLocalInt_15_ = argument_4_;
		 anLocalInt_15_ <= argument_3_; anLocalInt_15_++) {
		anLocalInt_13_ += anLocalInt_12_;
		Class223.anIntArrayArray1562[anLocalInt_10_][anLocalInt_15_]
		    = argument;
		if (anLocalInt_13_ > 0) {
		    anLocalInt_10_ += anLocalInt_14_;
		    anLocalInt_13_ -= anLocalInt_11_;
		}
	    }
	} else {
	    for (int anLocalInt_16_ = argument_4_;
		 argument_3_ >= anLocalInt_16_; anLocalInt_16_++) {
		anLocalInt_13_ += anLocalInt_12_;
		Class223.anIntArrayArray1562[anLocalInt_16_][anLocalInt_10_]
		    = argument;
		if (anLocalInt_13_ > 0) {
		    anLocalInt_13_ -= anLocalInt_11_;
		    anLocalInt_10_ += anLocalInt_14_;
		}
	    }
	}
    }
    
    abstract void method3533(int argument_17_, int argument_18_,
			     int argument_19_, boolean[][] argument_20_,
			     boolean argument_21_, int argument_22_);
    
    final int method3534(int argument_23_, boolean argument_24_,
			 int argument_25_) {
	if (argument_24_)
	    fa(-43, 103, null);
	return (((Class_s) this).anIntArrayArray2546[argument_23_]
		[argument_25_]);
    }
    
    abstract void method3535(int argument_26_, int argument_27_,
			     int argument_28_, int argument_29_,
			     int argument_30_, int argument_31_,
			     int argument_32_, boolean[][] argument_33_);
    
    abstract void method3536(HardwareLight argument_34_, int[] argument_35_);
    
    public static void method3537(int argument) {
	aClass195_2551 = null;
	aRectangleArray2545 = null;
    }
    
    abstract void wa(tia_sub_35DoublyLinked argument_36_, int argument_37_,
		     int argument_38_, int argument_39_, int argument_40_,
		     boolean argument_41_);
    
    abstract void CA(tia_sub_35DoublyLinked argument_42_, int argument_43_,
		     int argument_44_, int argument_45_, int argument_46_,
		     boolean argument_47_);
    
    abstract void method3538
	(int argument_48_, int argument_49_, int[] argument_50_,
	 int[] argument_51_, int[] argument_52_, int[] argument_53_,
	 int[] argument_54_, int[] argument_55_, int[] argument_56_,
	 int[] argument_57_, int[] argument_58_, int[] argument_59_,
	 int[] argument_60_, int argument_61_, int argument_62_,
	 int argument_63_, boolean argument_64_);
    
    abstract void method3539(int argument_65_, int argument_66_,
			     int argument_67_, boolean[][] argument_68_,
			     boolean argument_69_, int argument_70_,
			     int argument_71_);
    
    abstract void method3540(int argument_72_, int argument_73_);
    
    final int method3541(int argument_74_, int argument_75_,
			 int argument_76_) {
	int anLocalInt = argument_76_ >> ((Class_s) this).anInt2548;
	int anLocalInt_77_ = argument_74_ >> ((Class_s) this).anInt2548;
	if (argument_75_ > anLocalInt || anLocalInt_77_ < 0
	    || anLocalInt > ((Class_s) this).anInt2550 - 1
	    || anLocalInt_77_ > ((Class_s) this).anInt2549 - 1)
	    return 0;
	int anLocalInt_78_ = ((Class_s) this).anInt2547 - 1 & argument_76_;
	int anLocalInt_79_ = argument_74_ & ((Class_s) this).anInt2547 - 1;
	int anLocalInt_80_
	    = ((((((Class_s) this).anIntArrayArray2546[anLocalInt]
		  [anLocalInt_77_])
		 * (-anLocalInt_78_ + ((Class_s) this).anInt2547))
		+ (((Class_s) this).anIntArrayArray2546[anLocalInt + 1]
		   [anLocalInt_77_]) * anLocalInt_78_)
	       >> ((Class_s) this).anInt2548);
	int anLocalInt_81_
	    = ((((((Class_s) this).anIntArrayArray2546[anLocalInt]
		  [anLocalInt_77_ + 1])
		 * (-anLocalInt_78_ + ((Class_s) this).anInt2547))
		+ (((Class_s) this).anIntArrayArray2546[anLocalInt + 1]
		   [anLocalInt_77_ + 1]) * anLocalInt_78_)
	       >> ((Class_s) this).anInt2548);
	return ((anLocalInt_81_ * anLocalInt_79_
		 + anLocalInt_80_ * (-anLocalInt_79_
				     + ((Class_s) this).anInt2547))
		>> ((Class_s) this).anInt2548);
    }
    
    abstract tia_sub_35DoublyLinked fa(int argument_82_, int argument_83_,
			   tia_sub_35DoublyLinked argument_84_);
    
    abstract boolean method3542(tia_sub_35DoublyLinked argument_85_, int argument_86_,
				int argument_87_, int argument_88_,
				int argument_89_, boolean argument_90_);
    
    abstract void YA();
    
    abstract void ka(int argument_91_, int argument_92_, int argument_93_);
    
    static final void method3543(int argument, Packet argument_94_,
				 boolean argument_95_) {
	if (client.randomFile != null) {
	    try {
		client.randomFile.seek(0L);
		client.randomFile.write((((Packet) argument_94_).data), argument, 24);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    Class_s(int argument_96_, int argument_97_, int argument_98_,
	    int[][] argument_99_) {
	((Class_s) this).anInt2549 = argument_97_;
	((Class_s) this).anInt2550 = argument_96_;
	int anLocalInt = 0;
	for (/**/; argument_98_ > 1; argument_98_ >>= 1)
	    anLocalInt++;
	((Class_s) this).anInt2547 = 1 << anLocalInt;
	((Class_s) this).anIntArrayArray2546 = argument_99_;
	((Class_s) this).anInt2548 = anLocalInt;
    }
    
    abstract void U(int argument_100_, int argument_101_, int[] argument_102_,
		    int[] argument_103_, int[] argument_104_,
		    int[] argument_105_, int[] argument_106_,
		    int[] argument_107_, int[] argument_108_,
		    int[] argument_109_, int argument_110_, int argument_111_,
		    int argument_112_, boolean argument_113_);
    
    static final void method3544(int argument, Class233 argument_114_) {
	Class46_Sub1_Sub1.aClass233_5737 = argument_114_;
    }
    
    static {
	for (int anLocalInt = 0; anLocalInt < 100; anLocalInt++)
	    aRectangleArray2545[anLocalInt] = new Rectangle();
    }
}
