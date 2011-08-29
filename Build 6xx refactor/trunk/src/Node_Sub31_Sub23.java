/* Class59_Sub31_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub23 extends Node_Sub31
{
    private int anInt5939 = 4096;
    private int[] anIntArray5940 = new int[3];
    private int anInt5941;
    static Class320 aClass320_5942 = new Class320(1);
    private int anInt5943 = 3216;
    static int anInt5945;
    
    static final boolean method947(String argument, int argument_0_) {
	return Statics.fileTable.containsKey(argument);
    }
    
    final void method868(Packet argument_1_, int argument_2_,
			 byte argument_3_) {
	int anLocalInt = argument_2_;
    while_154_:
	do {
	    do {
		if (anLocalInt != 0) {
		    if (anLocalInt != 1) {
			if (anLocalInt == 2)
			    break;
			break while_154_;
		    }
		} else {
		    anInt5939 = argument_1_.g2();
		    break while_154_;
		}
		anInt5941 = argument_1_.g2();
		break while_154_;
	    } while (false);
	    anInt5943 = argument_1_.g2();
	} while (false);
	if (argument_3_ >= -41)
	    method950(null, -76);
    }
    
    final int[] method867(byte argument_4_, int argument_5_) {
	if (argument_4_ < 21)
	    return null;
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_5_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int anLocalInt = anInt5939 * DoublyLinkedNode_Sub51_Sub8.anInt6264 >> 12;
	    int[] anLocalInts_6_
		= this.method864(Exception_Sub1.anInt49 & argument_5_ - 1, 0,
				 (byte) 33);
	    int[] anLocalInts_7_ = this.method864(argument_5_, 0, (byte) 33);
	    int[] anLocalInts_8_
		= this.method864(Exception_Sub1.anInt49 & argument_5_ + 1, 0,
				 (byte) 33);
	    for (int anLocalInt_9_ = 0; anLocalInt_9_ < Statics.anInt294;
		 anLocalInt_9_++) {
		int anLocalInt_10_
		    = ((-anLocalInts_6_[anLocalInt_9_]
			+ anLocalInts_8_[anLocalInt_9_]) * anLocalInt
		       >> 12);
		int anLocalInt_11_
		    = (anLocalInt * ((anLocalInts_7_
				      [anLocalInt_9_ - 1 & Statics.anInt1269])
				     - anLocalInts_7_[(anLocalInt_9_ + 1
						       & Statics.anInt1269)])
		       >> 12);
		int anLocalInt_12_ = anLocalInt_11_ >> 4;
		if (anLocalInt_12_ < 0)
		    anLocalInt_12_ = -anLocalInt_12_;
		int anLocalInt_13_ = anLocalInt_10_ >> 4;
		if (anLocalInt_13_ < 0)
		    anLocalInt_13_ = -anLocalInt_13_;
		if (anLocalInt_12_ > 255)
		    anLocalInt_12_ = 255;
		if (anLocalInt_13_ > 255)
		    anLocalInt_13_ = 255;
		int anLocalInt_14_ = ((Class208.aByteArray1492
				       [((anLocalInt_13_ + 1) * anLocalInt_13_
					 >> 1) + anLocalInt_12_])
				      & 0xff);
		int anLocalInt_15_ = anLocalInt_14_ * 4096 >> 8;
		int anLocalInt_16_ = anLocalInt_14_ * anLocalInt_11_ >> 8;
		int anLocalInt_17_ = anLocalInt_10_ * anLocalInt_14_ >> 8;
		anLocalInt_15_ = anIntArray5940[2] * anLocalInt_15_ >> 12;
		anLocalInt_17_ = anIntArray5940[1] * anLocalInt_17_ >> 12;
		anLocalInt_16_ = anLocalInt_16_ * anIntArray5940[0] >> 12;
		anLocalInts[anLocalInt_9_]
		    = anLocalInt_16_ + (anLocalInt_17_ + anLocalInt_15_);
	    }
	}
	return anLocalInts;
    }
    
    static final void method948(int argument, int argument_18_) {
	if (argument_18_ != 37) {
	    if (argument_18_ != 50) {
		if (argument_18_ != 75) {
		    if (argument_18_ != 100) {
			if (argument_18_ == 200)
			    Class179.aFloat1328 = 16.0F;
		    } else
			Class179.aFloat1328 = 8.0F;
		} else
		    Class179.aFloat1328 = 6.0F;
	    } else
		Class179.aFloat1328 = 4.0F;
	} else
	    Class179.aFloat1328 = 3.0F;
	Class55.anInt409 = -1;
	Class55.anInt409 = -1;
    }
    
    private final void method949(byte argument_19_) {
	double d = Math.cos((double) ((float) anInt5943 / 4096.0F));
	anIntArray5940[0]
	    = (int) (Math.sin((double) ((float) anInt5941 / 4096.0F)) * d
		     * 4096.0);
	if (argument_19_ != -13)
	    method951(45, 93, 32, 115, -71, -52, -97);
	anIntArray5940[1]
	    = (int) (d * Math.cos((double) ((float) anInt5941 / 4096.0F))
		     * 4096.0);
	anIntArray5940[2]
	    = (int) (Math.sin((double) ((float) anInt5943 / 4096.0F))
		     * 4096.0);
	int anLocalInt = anIntArray5940[0] * anIntArray5940[0] >> 12;
	int anLocalInt_20_ = anIntArray5940[1] * anIntArray5940[1] >> 12;
	int anLocalInt_21_ = anIntArray5940[2] * anIntArray5940[2] >> 12;
	int anLocalInt_22_
	    = (int) (Math.sqrt((double) ((anLocalInt_20_ + anLocalInt
					  + anLocalInt_21_)
					 >> 12))
		     * 4096.0);
	if (anLocalInt_22_ != 0) {
	    anIntArray5940[0] = (anIntArray5940[0] << 12) / anLocalInt_22_;
	    anIntArray5940[2] = (anIntArray5940[2] << 12) / anLocalInt_22_;
	    anIntArray5940[1] = (anIntArray5940[1] << 12) / anLocalInt_22_;
	}
    }
    
    final void method865(boolean argument_23_) {
	method949((byte) -13);
	if (argument_23_ != true)
	    method868(null, -111, (byte) 29);
    }
    
    static final Class214 method950(Packet argument, int argument_24_) {
	int anLocalInt = argument.g2();
	Class349 class349
	    = JagexHashMap.method1522()[argument.g1()];
	Class44 class44
	    = Class225.method3051(-1)[argument.g1()];
	int anLocalInt_25_ = argument.g2s();
	int anLocalInt_26_ = argument.g2s();
	return new Class214(anLocalInt, class349, class44, anLocalInt_25_,
			    anLocalInt_26_);
    }
    
    static final void method951
	(int argument, int argument_27_, int argument_28_, int argument_29_,
	 int argument_30_, int argument_31_, int argument_32_) {
	if (argument_30_ != 8 && argument_30_ != 16) {
	    Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
				 [argument_27_][argument_31_][argument_28_]);
	    if (class148 == null)
		class148 = new Class148(argument_27_);
	    if (argument_30_ == 1) {
		((Class148) class148).aShort1127 = (short) argument_29_;
		((Class148) class148).aShort1125 = (short) argument;
	    } else if (argument_30_ == 2) {
		((Class148) class148).aShort1133 = (short) argument_29_;
		((Class148) class148).aShort1130 = (short) argument;
	    }
	    if (Class133_Sub1.aBoolean5008)
		Class176.method2789(1);
	} else if (argument_30_ == 8) {
	    int anLocalInt = argument_31_ << LightingManager.lightCoordRShift;
	    int anLocalInt_33_ = anLocalInt + Class110.anInt909;
	    int anLocalInt_34_ = argument_28_ << LightingManager.lightCoordRShift;
	    int anLocalInt_35_ = anLocalInt_34_ + Class110.anInt909;
	    int anLocalInt_36_
		= Statics.aClass_sArray2713[argument_27_]
		      .method3534(argument_31_, false, argument_28_);
	    int anLocalInt_37_
		= Statics.aClass_sArray2713[argument_27_]
		      .method3534(argument_31_ + 1, false, argument_28_ + 1);
	    Class276.aClass48Array2217[Class90.anInt689++]
		= new Class48(argument_30_, argument_27_, anLocalInt,
			      anLocalInt_33_, anLocalInt_33_, anLocalInt,
			      anLocalInt_36_, anLocalInt_37_,
			      -argument + anLocalInt_37_,
			      anLocalInt_36_ - argument, anLocalInt_34_,
			      anLocalInt_35_, anLocalInt_35_, anLocalInt_34_);
	} else {
	    int anLocalInt
		= Class110.anInt909 + (argument_31_ << LightingManager.lightCoordRShift);
	    int anLocalInt_38_ = -Class110.anInt909 + anLocalInt;
	    int anLocalInt_39_ = argument_28_ << LightingManager.lightCoordRShift;
	    int anLocalInt_40_ = Class110.anInt909 + anLocalInt_39_;
	    int anLocalInt_41_
		= Statics.aClass_sArray2713[argument_27_]
		      .method3534(argument_31_ + 1, false, argument_28_);
	    int anLocalInt_42_
		= Statics.aClass_sArray2713[argument_27_]
		      .method3534(argument_31_, false, argument_28_ + 1);
	    Class276.aClass48Array2217[Class90.anInt689++]
		= new Class48(argument_30_, argument_27_, anLocalInt,
			      anLocalInt_38_, anLocalInt_38_, anLocalInt,
			      anLocalInt_41_, anLocalInt_42_,
			      anLocalInt_42_ - argument,
			      -argument + anLocalInt_41_, anLocalInt_39_,
			      anLocalInt_40_, anLocalInt_40_, anLocalInt_39_);
	}
    }
    
    public Node_Sub31_Sub23() {
	super(1, true);
	anInt5941 = 3216;
    }
    
    public static void method952(int argument) {
	aClass320_5942 = null;
    }
}
