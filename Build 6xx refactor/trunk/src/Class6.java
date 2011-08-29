/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class6
{
    private int anInt68;
    private int anInt69;
    static int anInt70 = -1;
    private boolean aBoolean71;
    static int anInt72 = 0;
    private boolean aBoolean73;
    static int[] anIntArray74 = new int[13];
    
    static final void method227(int argument, int argument_0_, int argument_1_,
				int argument_2_, int argument_3_,
				int argument_4_) {
	if (Node_Sub31_Sub13.anInt5896 >= argument_3_
	    && argument >= Class209.anInt1504) {
	    boolean anLocalBoolean;
	    if (argument_0_ >= Node_Sub35.anInt4156) {
		if (argument_0_ <= Node_Sub9_Sub2.anInt5776)
		    anLocalBoolean = true;
		else {
		    argument_0_ = Node_Sub9_Sub2.anInt5776;
		    anLocalBoolean = false;
		}
	    } else {
		anLocalBoolean = false;
		argument_0_ = Node_Sub35.anInt4156;
	    }
	    boolean anLocalBoolean_5_;
	    if (argument_2_ >= Node_Sub35.anInt4156) {
		if (argument_2_ <= Node_Sub9_Sub2.anInt5776)
		    anLocalBoolean_5_ = true;
		else {
		    argument_2_ = Node_Sub9_Sub2.anInt5776;
		    anLocalBoolean_5_ = false;
		}
	    } else {
		argument_2_ = Node_Sub35.anInt4156;
		anLocalBoolean_5_ = false;
	    }
	    if (argument_3_ < Class209.anInt1504)
		argument_3_ = Class209.anInt1504;
	    else
		Statics.method3364((Class223.anIntArrayArray1562[argument_3_++]), (byte) 123, argument_0_, argument_2_, argument_1_);
	    if (argument > Node_Sub31_Sub13.anInt5896)
		argument = Node_Sub31_Sub13.anInt5896;
	    else
		Statics.method3364(Class223.anIntArrayArray1562[argument--], (byte) -28, argument_0_, argument_2_, argument_1_);
	    if (!anLocalBoolean || !anLocalBoolean_5_) {
		if (!anLocalBoolean) {
		    if (anLocalBoolean_5_) {
			for (int anLocalInt = argument_3_;
			     argument >= anLocalInt; anLocalInt++)
			    Class223.anIntArrayArray1562[anLocalInt]
				[argument_2_]
				= argument_1_;
		    }
		} else {
		    for (int anLocalInt = argument_3_; anLocalInt <= argument;
			 anLocalInt++)
			Class223.anIntArrayArray1562[anLocalInt][argument_0_]
			    = argument_1_;
		}
	    } else {
		for (int anLocalInt = argument_3_; argument >= anLocalInt;
		     anLocalInt++) {
		    int[] anLocalInts
			= Class223.anIntArrayArray1562[anLocalInt];
		    anLocalInts[argument_0_] = anLocalInts[argument_2_]
			= argument_1_;
		}
	    }
	}
    }
    
    static final long method228(int argument) {
	return Class111.aClass88_917.method1648((byte) 64);
    }
    
    final int method229(int argument_6_) {
	return anInt68;
    }
    
    static final void method230(boolean argument, byte argument_7_) {
	if (argument) {
	    if (Class66.anInt467 != -1)
		Node_Sub9_Sub1.method580(95, Class66.anInt467);
	    for (Node_Sub49 class59_sub49
		     = (Node_Sub49) Class2_Sub5.aJagexHashMap_3787.first(0);
		 class59_sub49 != null;
		 class59_sub49
		     = ((Node_Sub49)
			Class2_Sub5.aJagexHashMap_3787.next())) {
		if (!class59_sub49.isLinked()) {
		    class59_sub49 = ((Node_Sub49)
				     Class2_Sub5.aJagexHashMap_3787.first(0));
		    if (class59_sub49 == null)
			break;
		}
		Class222_Sub2.method3037(false, true, class59_sub49,
					 -86709072);
	    }
	    Class66.anInt467 = -1;
	    Class2_Sub5.aJagexHashMap_3787 = new JagexHashMap(8);
	    RsInterface.method729(94);
	    Class66.anInt467 = client.loginscreenId;
	    Statics.method1760(-105, false);
	    Class305.method3596(0);
	    Cs2Runtime.method3656(Class66.anInt467);
	}
	Statics.method1701(false);
	Statics.aBoolean184 = false;
	Class2_Sub11.method213(77);
	Class62_Sub10.anInt4399 = -1;
	Class70.method1519(-101, Class350_Sub3.anInt5468);
	Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587
	    = new DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2();
	((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldX
	    = MapRelated.mapWidth * 512 / 2;
	((Entity) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
	    .pathX[0]
	    = MapRelated.mapWidth / 2;
	((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldZ
	    = MapRelated.mapDepth * 512 / 2;
	Class287.anInt2299 = Node_Sub31_Sub30.anInt5987 = 0;
	((Entity) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
	    .pathZ[0]
	    = MapRelated.mapDepth / 2;
	if (Statics.anInt1745 != 2)
	    Class150.method2544(3);
	else {
	    Node_Sub31_Sub30.anInt5987 = InputStream_Sub2.anInt38 << 9;
	    Class287.anInt2299 = Class311.anInt2591 << 9;
	}
	Class120.method2385((byte) 103);
    }
    
    final boolean method231(int argument_8_) {
	return aBoolean71;
    }
    
    public static void method232(byte argument) {
	anIntArray74 = null;
    }
    
    final int method233(int argument_9_) {
	return anInt69;
    }
    
    static final String[] method234(boolean argument, String[] argument_10_) {
	String[] strings = new String[5];
	for (int anLocalInt = 0; anLocalInt < 5; anLocalInt++) {
	    strings[anLocalInt] = String.valueOf(anLocalInt) + ": ";
	    if (argument_10_ != null && argument_10_[anLocalInt] != null)
		strings[anLocalInt]
		    = strings[anLocalInt] + argument_10_[anLocalInt];
	}
	return strings;
    }
    
    final boolean method235(byte argument_11_) {
	return aBoolean73;
    }
    
    Class6(boolean argument_12_, int argument_13_, int argument_14_,
	   boolean argument_15_) {
	anInt68 = argument_13_;
	anInt69 = argument_14_;
	aBoolean73 = argument_12_;
	aBoolean71 = argument_15_;
    }
}
