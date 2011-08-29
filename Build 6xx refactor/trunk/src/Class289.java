/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class289
{
    private long aLong2302;
    static int anInt2303;
    private int anInt2304;
    static int anInt2305 = 0;
    static Class166 aClass166_2306;
    static Signlink aSignlink_2307;

    static final void method3473(int argument) {
	if (Class260.aBoolean2026) {
	    while (Node_Sub47_Sub6.anInt6184
		   < Class384.aClass84_Sub1Array3251.length) {
		Class84_Sub1 class84_sub1 = (Class384.aClass84_Sub1Array3251
					     [Node_Sub47_Sub6.anInt6184]);
		if (class84_sub1 == null
		    || ((Class84_Sub1) class84_sub1).anInt4479 != -1)
		    Node_Sub47_Sub6.anInt6184++;
		else {
		    if (Class360.aClass59_Sub1_3049 == null)
			Class360.aClass59_Sub1_3049
			    = (Node_Sub24.aClass31_4063.method363
			       (((Class84_Sub1) class84_sub1).aString4482,
				true));
		    int anLocalInt
			= (((Node_Sub1) Class360.aClass59_Sub1_3049)
			   .anInt3866);
		    if (anLocalInt == -1)
			break;
		    Node_Sub47_Sub6.anInt6184++;
		    Class360.aClass59_Sub1_3049 = null;
		    ((Class84_Sub1) class84_sub1).anInt4479 = anLocalInt;
		}
	    }
	}
    }
    
    final InterleavedArrayElementEnum method3474(int argument_0_) {
	    return InterleavedArrayElementEnum.forID((byte) -30, method3478(argument_0_, false));
    }
    
    static final void method3475(int argument, int argument_2_,
				 int argument_3_, int argument_4_,
				 int argument_5_, int argument_6_) {
	if (Node_Sub35.anInt4156 > argument_2_
	    || argument_6_ > Node_Sub9_Sub2.anInt5776
	    || Class209.anInt1504 > argument_3_
	    || Node_Sub31_Sub13.anInt5896 < argument_4_)
	    Class177.method2791(argument_4_, argument_3_, (byte) -22,
				argument_6_, argument_2_, argument);
	else
	    Node_Sub15.method694(argument_2_, 0, argument_6_, argument_3_,
                argument, argument_4_);
    }
    
    public static void method3476(byte argument) {
	aClass166_2306 = null;
	ModeWhatEnum.RC = null;
	aSignlink_2307 = null;
    }
    
    private final void method3477(InterleavedArrayElementEnum argument_7_, byte argument_8_) {
	aLong2302 |= (long) (((InterleavedArrayElementEnum) argument_7_).id
			     << Statics.anInt891 * anInt2304++);
	if (argument_8_ <= 48)
	    method3479((byte) -107);
    }
    
    private final int method3478(int argument_9_, boolean argument_10_) {
	if (argument_10_)
	    return -108;
	return (int) (aLong2302 >> argument_9_ * Statics.anInt891) & 0xf;
    }
    
    Class289(InterleavedArrayElementEnum argument_11_) {
	aLong2302 = (long) ((InterleavedArrayElementEnum) argument_11_).id;
	anInt2304 = 1;
    }
    
    final int method3479(byte argument_12_) {
	return anInt2304;
    }
    
    Class289(InterleavedArrayElementEnum[] argument_13_) {
	for (int anLocalInt = 0; anLocalInt < argument_13_.length;
	     anLocalInt++)
	    method3477(argument_13_[anLocalInt], (byte) 113);
    }
    
    static final int method3480(int argument, int argument_14_,
				int argument_15_, int argument_16_) {
	if (argument_16_ != 12835)
	    return -63;
	if (Class392.anInt3295 < 100)
	    return -2;
	int anLocalInt = -2;
	int anLocalInt_17_ = 2147483647;
	int anLocalInt_18_ = argument - Class179.anInt1353;
	int anLocalInt_19_ = -Class179.anInt1340 + argument_15_;
	for (Node_Sub7 class59_sub7
		 = ((Node_Sub7)
		    Class179.aCyclicLinkedList_1329.getFirst());
	     class59_sub7 != null;
	     class59_sub7
		 = (Node_Sub7) Class179.aCyclicLinkedList_1329
				      .getNext()) {
	    if (((Node_Sub7) class59_sub7).anInt3910 == argument_14_) {
		int anLocalInt_20_ = ((Node_Sub7) class59_sub7).anInt3918;
		int anLocalInt_21_ = ((Node_Sub7) class59_sub7).anInt3911;
		int anLocalInt_22_ = (anLocalInt_20_ + Class179.anInt1353 << 14
				      | anLocalInt_21_ + Class179.anInt1340);
		int anLocalInt_23_
		    = ((anLocalInt_18_ - anLocalInt_20_) * (anLocalInt_18_
							    - anLocalInt_20_)
		       + ((anLocalInt_19_ - anLocalInt_21_)
			  * (-anLocalInt_21_ + anLocalInt_19_)));
		if (anLocalInt < 0 || anLocalInt_23_ < anLocalInt_17_) {
		    anLocalInt_17_ = anLocalInt_23_;
		    anLocalInt = anLocalInt_22_;
		}
	    }
	}
	return anLocalInt;
    }
    
    static {
	aClass166_2306 = new Class166(51, 6);
    }
}
