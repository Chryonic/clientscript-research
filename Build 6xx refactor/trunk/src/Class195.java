/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

final class Class195
{
    private int anInt1418;
    static Class85 aClass85_1419;
    private int anInt1420;
    private Class368 aClass368_1421;
    private Class343[] aClass343Array1422;
    private Class343 aClass343_1423;
    static boolean aBoolean1424 = false;
    private int anInt1425 = -1;
    private int anInt1426;
    private int anInt1427;
    private int anInt1428;
    private int anInt1429;
    private boolean aBoolean1430 = true;
    static Class368 aClass368_1431;
    private Class343[] aClass343Array1432;
    static Object anObject1433;
    
    final boolean method2893(byte argument_0_, GraphicsToolkit argument_1_,
			     int argument_2_) {
	if (argument_2_ != anInt1425) {
	    anInt1425 = argument_2_;
	    int anLocalInt = Class392.method4142(argument_2_, false);
	    if (anLocalInt > 512)
		anLocalInt = 512;
	    if (anLocalInt <= 0)
		anLocalInt = 1;
	    if (anInt1428 != anLocalInt) {
		aClass368_1421 = null;
		anInt1428 = anLocalInt;
	    }
	    if (aClass343Array1422 != null) {
		anInt1426 = 0;
		int[] anLocalInts = new int[aClass343Array1422.length];
		for (int anLocalInt_3_ = 0;
		     anLocalInt_3_ < aClass343Array1422.length;
		     anLocalInt_3_++) {
		    Class343 class343 = aClass343Array1422[anLocalInt_3_];
		    if (class343.method3789(anInt1418, anInt1427, anInt1420,
					    anInt1425)) {
			anLocalInts[anInt1426]
			    = ((Class343) class343).anInt2890;
			aClass343Array1432[anInt1426++] = class343;
		    }
		}
		Class51.method468(anLocalInts, 0, aClass343Array1432, 85,
				  anInt1426 - 1);
	    }
	    aBoolean1430 = true;
	}
	boolean anLocalBoolean = false;
	if (aBoolean1430) {
	    aBoolean1430 = false;
	    for (int anLocalInt = anInt1426 - 1; anLocalInt >= 0;
		 anLocalInt--) {
		boolean anLocalBoolean_4_
		    = aClass343Array1432[anLocalInt]
			  .method3796(argument_1_, aClass343_1423);
		anLocalBoolean |= anLocalBoolean_4_;
		Class195 class195 = this;
		class195.aBoolean1430
		    = class195.aBoolean1430 | !anLocalBoolean_4_;
	    }
	}
	return anLocalBoolean;
    }
    
    public static void method2894(int argument) {
	aClass85_1419 = null;
	anObject1433 = null;
	aClass368_1431 = null;
    }
    
    static final void method2895(Canvas argument, int argument_5_) {
	Dimension dimension = argument.getSize();
	Class9.method244(dimension.height, (byte) 122, dimension.width);
	if (Class50.anInt365 == 1)
	    Statics.aGraphicsToolkit5822.method2036(argument,
							(dba_sub_772_Sub2
							 .anInt6366),
							(Class189_Sub3
							 .anInt5647));
	else
	    Statics.aGraphicsToolkit5822.method2036(argument,
							Class349.anInt2921,
							(Class353_Sub9
							 .anInt5523));
    }
    
    final void method2896(byte argument_6_) {
	if (aClass343Array1422 != null) {
	    for (int anLocalInt = 0; aClass343Array1422.length > anLocalInt;
		 anLocalInt++)
		aClass343Array1422[anLocalInt].method3798();
	}
	aClass368_1421 = null;
    }
    
    final void method2897(int argument_7_, int argument_8_,
			  GraphicsToolkit argument_9_, int argument_10_,
			  int argument_11_, int argument_12_, int argument_13_,
			  int argument_14_, int argument_15_,
			  int argument_16_) {
	argument_12_ = argument_12_ + argument_10_ & 0x3fff;
	if (anInt1429 == -1 || anInt1428 == 0)
	    argument_9_.fillRect(argument_11_, argument_14_, argument_13_, argument_15_, argument_16_, 0);
	else {
	    TextureDescriptor textureDescriptor
		= Statics.anTextureSource_4470.getDescriptor(anInt1429, true);
	    if (aClass368_1421 == null
		&& Statics.anTextureSource_4470.method9(true, anInt1429)) {
		int[] anLocalInts
		    = (((TextureDescriptor) textureDescriptor).anInt830 != 2
		       ? Statics.anTextureSource_4470.method13(anInt1428,
								   false,
								   anInt1428,
								   0.7F,
								   anInt1429,
								   (byte) -128)
		       : Statics.anTextureSource_4470.method14(anInt1428,
								   anInt1429,
								   -126, 0.7F,
								   anInt1428,
								   false));
		aClass368_1421
		    = argument_9_.method2047(anInt1428, anLocalInts, 0,
					     anInt1428, anInt1428);
	    }
	    if (((TextureDescriptor) textureDescriptor).anInt830 == 2)
		argument_9_.fillRect(argument_11_, argument_14_, argument_13_, argument_15_, argument_16_, 0);
	    if (aClass368_1421 != null) {
		int anLocalInt = ((TextureDescriptor) textureDescriptor).anInt830 == 2 ? 1 : 0;
		int anLocalInt_17_ = argument_8_ * argument_15_ / -4096;
		int anLocalInt_18_;
		for (anLocalInt_18_ = ((argument_13_ - argument_15_) / 2
				       + argument_15_ * argument_12_ / 4096);
		     argument_15_ < anLocalInt_18_;
		     anLocalInt_18_ -= argument_15_) {
		    /* empty */
		}
		for (/**/; anLocalInt_18_ < 0;
		     anLocalInt_18_ += argument_15_) {
		    /* empty */
		}
		for (/**/; argument_15_ < anLocalInt_17_;
		     anLocalInt_17_ -= argument_15_) {
		    /* empty */
		}
		for (/**/; anLocalInt_17_ < 0;
		     anLocalInt_17_ += argument_15_) {
		    /* empty */
		}
		for (int anLocalInt_19_ = -argument_15_ + anLocalInt_18_;
		     anLocalInt_19_ < argument_13_;
		     anLocalInt_19_ += argument_15_) {
		    for (int anLocalInt_20_ = -argument_15_ + anLocalInt_17_;
			 argument_15_ > anLocalInt_20_;
			 anLocalInt_20_ += argument_15_)
			aClass368_1421.method4016((anLocalInt_19_
						   + argument_11_),
						  (argument_14_
						   + anLocalInt_20_),
						  argument_15_, argument_15_,
						  1, 0, anLocalInt);
		}
	    }
	}
	for (int anLocalInt = anInt1426 - 1; anLocalInt >= 0; anLocalInt--)
	    aClass343Array1432[anLocalInt].method3790(argument_9_,
						      argument_11_,
						      argument_14_,
						      argument_13_,
						      argument_15_,
						      argument_8_,
						      argument_12_);
    }
    
    static final void method2898(int argument, String[] argument_21_,
				 int argument_22_, int argument_23_,
				 short[] argument_24_) {
	if (argument_22_ < argument) {
	    int anLocalInt = (argument_22_ + argument) / 2;
	    int anLocalInt_25_ = argument_22_;
	    String string = argument_21_[anLocalInt];
	    argument_21_[anLocalInt] = argument_21_[argument];
	    argument_21_[argument] = string;
	    short anLocalInt_26_ = argument_24_[anLocalInt];
	    argument_24_[anLocalInt] = argument_24_[argument];
	    argument_24_[argument] = anLocalInt_26_;
	    for (int anLocalInt_27_ = argument_22_; anLocalInt_27_ < argument;
		 anLocalInt_27_++) {
		if (string == null
		    || (argument_21_[anLocalInt_27_] != null
			&& (argument_21_[anLocalInt_27_].compareTo(string)
			    < (anLocalInt_27_ & 0x1)))) {
		    String string_28_ = argument_21_[anLocalInt_27_];
		    argument_21_[anLocalInt_27_]
			= argument_21_[anLocalInt_25_];
		    argument_21_[anLocalInt_25_] = string_28_;
		    short anLocalInt_29_ = argument_24_[anLocalInt_27_];
		    argument_24_[anLocalInt_27_]
			= argument_24_[anLocalInt_25_];
		    argument_24_[anLocalInt_25_++] = anLocalInt_29_;
		}
	    }
	    argument_21_[argument] = argument_21_[anLocalInt_25_];
	    argument_21_[anLocalInt_25_] = string;
	    argument_24_[argument] = argument_24_[anLocalInt_25_];
	    argument_24_[anLocalInt_25_] = anLocalInt_26_;
	    method2898(anLocalInt_25_ - 1, argument_21_, argument_22_, 94,
		       argument_24_);
	    method2898(argument, argument_21_, anLocalInt_25_ + 1, 52,
		       argument_24_);
	}
    }
    
    static final int method2899(int argument, boolean argument_30_) {
	int anLocalInt;
	if (argument > 12000) {
	    Class2_Sub1.method199(-18861);
	    anLocalInt = 4;
	} else if (argument > 5000) {
	    anLocalInt = 3;
	    Node_Sub7.method569(0);
	} else if (argument <= 2000) {
	    anLocalInt = 1;
	    Statics.method413(true, (byte) -97);
	} else {
	    anLocalInt = 2;
	    Class62_Sub29.method1476(1);
	}
	if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		.aClass62_Sub26_4295.method1464(5)
	    != 2) {
	    AthmosphericConditions.aClass59_Sub50_116.method1159(2,
						  (((Node_Sub50)
						    AthmosphericConditions.aClass59_Sub50_116)
						   .aClass62_Sub26_4316),
						  75);
	    Class215.method2991((byte) -41, false, 2);
	}
	Class251.method3240(argument_30_);
	return anLocalInt;
    }
    
    static final void method2900
	(int argument, int argument_31_, int argument_32_, int argument_33_,
	 int argument_34_, int argument_35_, int argument_36_) {
	Class124[] class124s = Class166.aClass124Array1216;
	if (argument_32_ != 1780724097)
	    aClass368_1431 = null;
	for (int anLocalInt = 0; class124s.length > anLocalInt; anLocalInt++) {
	    Class124 class124 = class124s[anLocalInt];
	    if (class124 != null && ((Class124) class124).anInt1007 == 2) {
		Statics.method741(((Class124) class124).anInt1006, argument_33_ >> 1, argument_32_ ^ 0x6a23b1c1, argument_34_ >> 1, argument, (((Class124) class124).anInt1003 * 2), argument_35_, ((Class124) class124).anInt1011, ((Class124) class124).anInt1010);
		if (DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0] > -1
		    && Class333.anInt2720 % 20 < 10) {
		    Class368 class368 = (Class17.aClass368Array123
					 [((Class124) class124).anInt1009]);
		    int anLocalInt_37_ = (DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0]
					  + argument_31_ - 12);
		    int anLocalInt_38_ = (DoublyLinkedNode_Sub51_Sub2.anIntArray6227[1]
					  - 28 + argument_36_);
		    class368.method4014(anLocalInt_37_, anLocalInt_38_);
		    Canvas_Sub1.method125((anLocalInt_37_
					   + class368.getWidth()),
					  (byte) -102,
					  (class368.method4018()
					   + anLocalInt_38_),
					  anLocalInt_38_, anLocalInt_37_);
		}
	    }
	}
    }
    
    Class195(int argument_39_, Class343[] argument_40_, int argument_41_,
	     int argument_42_, int argument_43_, int argument_44_) {
	aClass343Array1422 = argument_40_;
	anInt1429 = argument_39_;
	anInt1420 = argument_44_;
	anInt1418 = argument_42_;
	anInt1427 = argument_43_;
	if (argument_40_ == null) {
	    aClass343Array1432 = null;
	    aClass343_1423 = null;
	} else {
	    aClass343Array1432 = new Class343[argument_40_.length];
	    aClass343_1423
		= argument_41_ < 0 ? null : argument_40_[argument_41_];
	}
    }
    
    static {
	aClass85_1419 = new Class85();
    }
}
