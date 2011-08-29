/* Class62_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub16 extends Class62
{
    static int anInt4414 = -1;
    static int anInt4415;
    static Js5Store aJs5Store_4416;
    static int anInt4417;
    static Class166 aClass166_4418;
    static int anInt4419;
    
    final int method1342(int argument_0_, byte argument_1_) {
	int anLocalInt = 104 / ((argument_1_ + 53) / 50);
	return 1;
    }
    
    public static void method1418(byte argument) {
	aClass166_4418 = null;
	aJs5Store_4416 = null;
    }
    
    static final void method1419(int[] argument, byte argument_2_,
				 long[] argument_3_) {
	Class338.method3773(argument, 0, argument_3_.length - 1, argument_3_,
			    (byte) 8);
    }
    
    Class62_Sub16(Node_Sub50 argument_4_) {
	super(argument_4_);
    }
    
    Class62_Sub16(int argument_5_, Node_Sub50 argument_6_) {
	super(argument_5_, argument_6_);
    }
    
    final void method1343(int argument_7_, byte argument_8_) {
	if (argument_8_ == -107)
	    ((Class62) this).anInt441 = argument_7_;
    }
    
    final int method1344(byte argument_9_) {
	if (argument_9_ != 4)
	    anInt4419 = 124;
	return 1;
    }
    
    static final void method1420(byte argument, int argument_10_,
				 Entity argument_11_,
				 int argument_12_, int argument_13_) {
	Class354 class354 = argument_11_.method1831();
	int anLocalInt
	    = ((-((Class271) (((Entity) argument_11_)
			      .aClass271_6780)).anInt2166
		+ ((Entity) argument_11_).anInt6784)
	       & 0x3fff);
	if (argument_12_ == -1) {
	    if (anLocalInt == 0
		&& ((Entity) argument_11_).anInt6738 <= 25) {
		if (!((Entity) argument_11_).aBoolean6753
		    || !class354.method3918((byte) 60,
					    ((Entity)
					     argument_11_).anInt6731)) {
		    ((Entity) argument_11_).anInt6731
			= class354.method3923((byte) -76);
		    ((Entity) argument_11_).aBoolean6753
			= (((Entity) argument_11_).anInt6731
			   != -1);
		}
	    } else {
		if (argument_10_ < 0
		    && ((Class354) class354).anInt2971 != -1) {
		    ((Entity) argument_11_).aBoolean6753
			= false;
		    ((Entity) argument_11_).anInt6731
			= ((Class354) class354).anInt2971;
		} else if (argument_10_ <= 0
			   || ((Class354) class354).anInt2987 == -1)
		    ((Entity) argument_11_).anInt6731
			= ((Class354) class354).anInt2959;
		else
		    ((Entity) argument_11_).anInt6731
			= ((Class354) class354).anInt2987;
		((Entity) argument_11_).aBoolean6753 = false;
	    }
	} else if (((Entity) argument_11_).anInt6725 != -1
		   && (anLocalInt >= 10240 || anLocalInt <= 2048)) {
	    int anLocalInt_14_
		= ((tia_sub_35DoublyLinked.anIntArray6254[argument_13_]
		    - ((Class271) (((Entity) argument_11_)
				   .aClass271_6780)).anInt2166)
		   & 0x3fff);
	    if (argument_12_ == 2 && ((Class354) class354).anInt2999 != -1) {
		if (anLocalInt_14_ <= 2048 || anLocalInt_14_ > 6144
		    || ((Class354) class354).anInt2973 == -1) {
		    if (anLocalInt_14_ < 10240 || anLocalInt_14_ >= 14336
			|| ((Class354) class354).anInt2975 == -1) {
			if (anLocalInt_14_ > 6144 && anLocalInt_14_ < 10240
			    && ((Class354) class354).anInt2980 != -1)
			    ((Entity) argument_11_).anInt6731
				= ((Class354) class354).anInt2980;
			else
			    ((Entity) argument_11_).anInt6731
				= ((Class354) class354).anInt2999;
		    } else
			((Entity) argument_11_).anInt6731
			    = ((Class354) class354).anInt2975;
		} else
		    ((Entity) argument_11_).anInt6731
			= ((Class354) class354).anInt2973;
	    } else if (argument_12_ != 0
		       || ((Class354) class354).anInt2956 == -1) {
		if (anLocalInt_14_ <= 2048 || anLocalInt_14_ > 6144
		    || ((Class354) class354).anInt2995 == -1) {
		    if (anLocalInt_14_ >= 10240 && anLocalInt_14_ < 14336
			&& ((Class354) class354).anInt2968 != -1)
			((Entity) argument_11_).anInt6731
			    = ((Class354) class354).anInt2968;
		    else if (anLocalInt_14_ > 6144 && anLocalInt_14_ < 10240
			     && ((Class354) class354).anInt2970 != -1)
			((Entity) argument_11_).anInt6731
			    = ((Class354) class354).anInt2970;
		    else
			((Entity) argument_11_).anInt6731
			    = ((Class354) class354).anInt2959;
		} else
		    ((Entity) argument_11_).anInt6731
			= ((Class354) class354).anInt2995;
	    } else if (anLocalInt_14_ > 2048 && anLocalInt_14_ <= 6144
		       && ((Class354) class354).anInt2966 != -1)
		((Entity) argument_11_).anInt6731
		    = ((Class354) class354).anInt2966;
	    else if (anLocalInt_14_ >= 10240 && anLocalInt_14_ < 14336
		     && ((Class354) class354).anInt2988 != -1)
		((Entity) argument_11_).anInt6731
		    = ((Class354) class354).anInt2988;
	    else if (anLocalInt_14_ <= 6144 || anLocalInt_14_ >= 10240
		     || ((Class354) class354).anInt2964 == -1)
		((Entity) argument_11_).anInt6731
		    = ((Class354) class354).anInt2956;
	    else
		((Entity) argument_11_).anInt6731
		    = ((Class354) class354).anInt2964;
	    ((Entity) argument_11_).aBoolean6753 = false;
	} else if (anLocalInt == 0
		   && (((Entity) argument_11_).anInt6738
		       <= 25)) {
	    ((Entity) argument_11_).aBoolean6753 = false;
	    if (argument_12_ != 2 || ((Class354) class354).anInt2999 == -1) {
		if (argument_12_ == 0 && ((Class354) class354).anInt2956 != -1)
		    ((Entity) argument_11_).anInt6731
			= ((Class354) class354).anInt2956;
		else
		    ((Entity) argument_11_).anInt6731
			= ((Class354) class354).anInt2959;
	    } else
		((Entity) argument_11_).anInt6731
		    = ((Class354) class354).anInt2999;
	} else {
	    ((Entity) argument_11_).aBoolean6753 = false;
	    if (argument_12_ != 2 || ((Class354) class354).anInt2999 == -1) {
		if (argument_12_ != 0
		    || ((Class354) class354).anInt2956 == -1) {
		    if (argument_10_ < 0
			&& ((Class354) class354).anInt2972 != -1)
			((Entity) argument_11_).anInt6731
			    = ((Class354) class354).anInt2972;
		    else if (argument_10_ > 0
			     && ((Class354) class354).anInt2989 != -1)
			((Entity) argument_11_).anInt6731
			    = ((Class354) class354).anInt2989;
		    else
			((Entity) argument_11_).anInt6731
			    = ((Class354) class354).anInt2959;
		} else if (argument_10_ >= 0
			   || ((Class354) class354).anInt2978 == -1) {
		    if (argument_10_ > 0
			&& ((Class354) class354).anInt2992 != -1)
			((Entity) argument_11_).anInt6731
			    = ((Class354) class354).anInt2992;
		    else
			((Entity) argument_11_).anInt6731
			    = ((Class354) class354).anInt2956;
		} else
		    ((Entity) argument_11_).anInt6731
			= ((Class354) class354).anInt2978;
	    } else if (argument_10_ < 0
		       && ((Class354) class354).anInt2977 != -1)
		((Entity) argument_11_).anInt6731
		    = ((Class354) class354).anInt2977;
	    else if (argument_10_ <= 0
		     || ((Class354) class354).anInt2990 == -1)
		((Entity) argument_11_).anInt6731
		    = ((Class354) class354).anInt2999;
	    else
		((Entity) argument_11_).anInt6731
		    = ((Class354) class354).anInt2990;
	}
    }
    
    final void method1346(boolean argument_15_) {
	if (argument_15_)
	    anInt4419 = 97;
	if (((Class62) this).anInt441 != 1 && ((Class62) this).anInt441 != 0)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    final int method1421(int argument_16_) {
	return ((Class62) this).anInt441;
    }
}
