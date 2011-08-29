/* Class243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class243 implements Interface12
{
    static Class166 aClass166_3601 = new Class166(70, 1);
    static int anInt3602;
    
    public Class243() {
	/* empty */
    }
    
    static final int method3155(int argument, int argument_0_,
				int argument_1_) {
	int anLocalInt = argument_0_ >> 31 & argument - 1;
	return (argument_0_ + (argument_0_ >>> 31)) % argument + anLocalInt;
    }
    
    public final String method54(int[] argument_2_, int argument_3_,
				 long argument_4_, Class217 argument_5_) {
	int anLocalInt = 53 % ((argument_3_ - 52) / 51);
	if (argument_5_ == Statics.aClass217_2289) {
	    Class323 class323
		= Class62_Sub14.aClass220_4409.method3028((byte) 126,
							  argument_2_[0]);
	    return class323.method3674(25851, (int) argument_4_);
	}
	if (argument_5_ == Node_Sub30.aClass217_4132
	    || Class253_Sub2.aClass217_5672 == argument_5_) {
	    Class371 class371 = Class253_Sub1_Sub1.aClass365_6632
				    .method3975(120, (int) argument_4_);
	    return ((Class371) class371).aString3160;
	}
	if (DoublyLinkedNode_Sub51_Sub8.aClass217_6259 == argument_5_
	    || Node_Sub31_Sub19.aClass217_5923 == argument_5_
	    || Node_Sub19.aClass217_4009 == argument_5_)
	    return Class62_Sub14.aClass220_4409.method3028
		       ((byte) -20, argument_2_[0])
		       .method3674(25851, (int) argument_4_);
	return null;
    }
    
    static final int method3156(boolean argument, Class84_Sub1 argument_6_,
				boolean argument_7_, int argument_8_,
				Class84_Sub1 argument_9_, int argument_10_,
				int argument_11_) {
	int anLocalInt
	    = Class62_Sub14.method1410(argument_7_, argument_10_, (byte) 19,
				       argument_9_, argument_6_);
	if (anLocalInt != 0) {
	    if (!argument_7_)
		return anLocalInt;
	    return -anLocalInt;
	}
	if (argument_11_ != 6906)
	    return -35;
	if (argument_8_ == -1)
	    return 0;
	int anLocalInt_12_
	    = Class62_Sub14.method1410(argument, argument_8_, (byte) 48,
				       argument_9_, argument_6_);
	if (argument)
	    return -anLocalInt_12_;
	return anLocalInt_12_;
    }

    public static void method3158(boolean argument) {
	aClass166_3601 = null;
    }
    
    static final void method3159(boolean argument, int argument_15_,
				 boolean argument_16_, int argument_17_,
				 int argument_18_, int argument_19_,
				 int argument_20_) {
	Class299.anInt2495 = argument_19_;
	Class317.anInt2623 = argument_18_;
	InputStream_Sub2.anInt38 = argument_17_;
	Class353_Sub5.anInt5499 = argument_20_;
	Class311.anInt2591 = argument_15_;
	if (argument_16_ && Class353_Sub5.anInt5499 >= 100) {
	    Class287.anInt2299 = Class311.anInt2591 * 512 + 256;
	    Node_Sub31_Sub30.anInt5987
		= InputStream_Sub2.anInt38 * 512 + 256;
	    Class2_Sub2.anInt3763
		= (Node_Sub31_Sub36.method993(Class176.anInt1308,
                Class287.anInt2299, -12040,
                Node_Sub31_Sub30.anInt5987)
		   - Class299.anInt2495);
	}
	Statics.anInt1745 = 2;
	DoublyLinkedNodeP2_Sub2_Sub4_Sub1.anInt6573 = Class85.anInt607 = -1;
    }
}
