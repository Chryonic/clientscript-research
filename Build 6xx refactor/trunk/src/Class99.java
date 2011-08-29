/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class99
{
    private short[] aShortArray770;
    private int[] anIntArray771;
    private int[] anIntArray772 = { -1, -1, -1, -1, -1 };
    static Class207 aClass207_773 = new Class207(74, 7);
    private short[] aShortArray774;
    private short[] aShortArray775;
    Class383 aClass383_776;
    static int anInt777;
    static int anInt778;
    private short[] aShortArray779;
    
    final void method1721(Packet argument_0_, int argument_1_) {
	for (;;) {
	    int anLocalInt = argument_0_.g1();
	    if (anLocalInt == 0)
		break;
	    method1722((byte) -30, anLocalInt, argument_0_);
	}
    }
    
    private final void method1722(byte argument_2_, int argument_3_,
				  Packet argument_4_) {
	if (argument_3_ != 1) {
	    if (argument_3_ == 2) {
		int anLocalInt = argument_4_.g1();
		anIntArray771 = new int[anLocalInt];
		for (int anLocalInt_5_ = 0; anLocalInt > anLocalInt_5_;
		     anLocalInt_5_++)
		    anIntArray771[anLocalInt_5_]
			= (argument_4_.g2
                    ());
	    } else if (argument_3_ != 3) {
		if (argument_3_ != 40) {
		    if (argument_3_ == 41) {
			int anLocalInt = argument_4_.g1();
			aShortArray775 = new short[anLocalInt];
			aShortArray770 = new short[anLocalInt];
			for (int anLocalInt_6_ = 0; anLocalInt > anLocalInt_6_;
			     anLocalInt_6_++) {
			    aShortArray770[anLocalInt_6_]
				= (short) argument_4_.g2();
			    aShortArray775[anLocalInt_6_]
				= (short) argument_4_.g2();
			}
		    } else if (argument_3_ >= 60 && argument_3_ < 70)
			anIntArray772[argument_3_ - 60]
			    = argument_4_.g2();
		} else {
		    int anLocalInt = argument_4_.g1();
		    aShortArray774 = new short[anLocalInt];
		    aShortArray779 = new short[anLocalInt];
		    for (int anLocalInt_7_ = 0; anLocalInt > anLocalInt_7_;
			 anLocalInt_7_++) {
			aShortArray779[anLocalInt_7_]
			    = (short) argument_4_.g2();
			aShortArray774[anLocalInt_7_]
			    = (short) argument_4_.g2();
		    }
		}
	    }
	} else
	    argument_4_.g1();
	if (argument_2_ != -30)
	    anIntArray772 = null;
    }
    
    final boolean method1723(int argument_8_) {
	if (anIntArray771 == null)
	    return true;
	boolean anLocalBoolean = true;
	synchronized (((Class383) ((Class99) this).aClass383_776)
		      .aJs5Store_3246) {
	    for (int anLocalInt = 0; anLocalInt < anIntArray771.length;
		 anLocalInt++) {
		if (!((Class383) ((Class99) this).aClass383_776)
			 .aJs5Store_3246
			 .isLoaded(anIntArray771[anLocalInt], 0))
		    anLocalBoolean = false;
	    }
	}
	return anLocalBoolean;
    }
    
    public static void method1724(int argument) {
	aClass207_773 = null;
    }
    
    static final int method1725(int argument) {
	if ((double) Class179.aFloat1328 == 3.0)
	    return 37;
	if ((double) Class179.aFloat1328 == 4.0)
	    return 50;
	if ((double) Class179.aFloat1328 == 6.0)
	    return 75;
	if ((double) Class179.aFloat1328 == 8.0)
	    return 100;
	return 200;
    }
    
    static final void method1726(byte argument, int argument_9_,
				 boolean argument_10_) {
	Node_Sub5 class59_sub5
	    = Class365.method3969((byte) 61, argument_9_, argument_10_);
	if (class59_sub5 != null) {
	    for (int anLocalInt = 0;
		 (anLocalInt
		  < ((Node_Sub5) class59_sub5).anIntArray3897.length);
		 anLocalInt++) {
		((Node_Sub5) class59_sub5).anIntArray3897[anLocalInt] = -1;
		((Node_Sub5) class59_sub5).anIntArray3895[anLocalInt] = 0;
	    }
	}
    }
    
    final Class101 method1727(int argument_11_) {
	Class101[] class101s = new Class101[5];
	int anLocalInt = 0;
	synchronized (((Class383) ((Class99) this).aClass383_776)
		      .aJs5Store_3246) {
	    for (int anLocalInt_12_ = 0; anLocalInt_12_ < 5;
		 anLocalInt_12_++) {
		if (anIntArray772[anLocalInt_12_] != -1)
		    class101s[anLocalInt++]
			= (tia_sub_35_Sub1DoublyLinked.method1219(2085750768, (((Class383) ((Class99) this).aClass383_776).aJs5Store_3246), anIntArray772[anLocalInt_12_], 0));
	    }
	}
	for (int anLocalInt_13_ = 0; anLocalInt_13_ < 5; anLocalInt_13_++) {
	    if (class101s[anLocalInt_13_] != null
		&& ((Class101) class101s[anLocalInt_13_]).anInt820 < 13)
		class101s[anLocalInt_13_].method1733(17496, 2);
	}
	Class101 class101 = new Class101(class101s, anLocalInt);
	if (aShortArray779 != null) {
	    for (int anLocalInt_14_ = 0;
		 anLocalInt_14_ < aShortArray779.length; anLocalInt_14_++)
		class101.method1751(aShortArray774[anLocalInt_14_],
				    aShortArray779[anLocalInt_14_], false);
	}
	if (aShortArray770 != null) {
	    for (int anLocalInt_15_ = 0;
		 aShortArray770.length > anLocalInt_15_; anLocalInt_15_++)
		class101.method1739(aShortArray775[anLocalInt_15_],
				    aShortArray770[anLocalInt_15_], -8378);
	}
	return class101;
    }
    
    final boolean method1728(boolean argument_16_) {
	boolean anLocalBoolean = argument_16_;
	synchronized (((Class383) ((Class99) this).aClass383_776)
		      .aJs5Store_3246) {
	    for (int anLocalInt = 0; anLocalInt < 5; anLocalInt++) {
		if (anIntArray772[anLocalInt] != -1
		    && !((Class383) ((Class99) this).aClass383_776)
			    .aJs5Store_3246
			    .isLoaded(anIntArray772[anLocalInt], 0))
		    anLocalBoolean = false;
	    }
	}
	return anLocalBoolean;
    }
    
    final Class101 method1729(boolean argument_17_) {
	if (anIntArray771 == null)
	    return null;
	Class101[] class101s = new Class101[anIntArray771.length];
	synchronized (((Class383) ((Class99) this).aClass383_776)
		      .aJs5Store_3246) {
	    for (int anLocalInt = 0; anIntArray771.length > anLocalInt;
		 anLocalInt++)
		class101s[anLocalInt]
		    = tia_sub_35_Sub1DoublyLinked.method1219(2085750768, (((Class383) (((Class99) this).aClass383_776)).aJs5Store_3246), anIntArray771[anLocalInt], 0);
	}
	for (int anLocalInt = 0; anLocalInt < anIntArray771.length;
	     anLocalInt++) {
	    if (((Class101) class101s[anLocalInt]).anInt820 < 13)
		class101s[anLocalInt].method1733(17496, 2);
	}
	Class101 class101;
	if (class101s.length == 1)
	    class101 = class101s[0];
	else
	    class101 = new Class101(class101s, class101s.length);
	if (class101 == null)
	    return null;
	if (aShortArray779 != null) {
	    for (int anLocalInt = 0; anLocalInt < aShortArray779.length;
		 anLocalInt++)
		class101.method1751(aShortArray774[anLocalInt],
				    aShortArray779[anLocalInt], false);
	}
	if (aShortArray770 != null) {
	    for (int anLocalInt = 0; anLocalInt < aShortArray770.length;
		 anLocalInt++)
		class101.method1739(aShortArray775[anLocalInt],
				    aShortArray770[anLocalInt], -8378);
	}
	return class101;
    }
    
    public Class99() {
	/* empty */
    }
}
