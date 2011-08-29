/* Class349 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class349
{
    static Class313 aClass313_2918;
    static Class207 aClass207_2920 = new Class207(24, -1);
    static int anInt2921;
    static int anInt2922 = 0;
    
    static final Class76 method3820(int argument, Js5Store argument_0_,
				    int argument_1_, byte argument_2_) {
	byte[] anLocalInts
	    = argument_0_.getData(argument_1_, argument);
	if (anLocalInts == null)
	    return null;
	if (argument_2_ != 44)
	    return null;
	return new Class76(anLocalInts);
    }
    
    public final String toString() {
	throw new IllegalStateException();
    }
    
    public Class349() {
	/* empty */
    }
    
    static final void method3821(int argument, int argument_3_,
				 boolean argument_4_, int argument_5_,
				 int argument_6_, GraphicsToolkit argument_7_,
				 int argument_8_, String argument_9_) {
	if (Statics.aClass368_6450 == null
	    || Class178.aClass368_1312 == null) {
	    if (!Class205.aJs5Store_1472.isFlatFile(Class350.anInt2928)
		|| !Class205.aJs5Store_1472
			.isFlatFile(Node_Sub47_Sub5.anInt6173))
		argument_7_.fillRect(argument_6_, argument, argument_3_, argument_8_, (Class245_Sub1.anInt5302 | -Node_Sub37.anInt4165 + 255 << 24), 1);
	    else {
		Statics.aClass368_6450
		    = (argument_7_.method2033
		       (Class83.method1612(Class205.aJs5Store_1472,
					   Class350.anInt2928, 0),
			true));
		Class83 class83
		    = Class83.method1612(Class205.aJs5Store_1472,
					 Node_Sub47_Sub5.anInt6173, 0);
		Class178.aClass368_1312
		    = argument_7_.method2033(class83, true);
		class83.method1604();
		Class361.aClass368_3054
		    = argument_7_.method2033(class83, true);
	    }
	}
	if (Statics.aClass368_6450 != null
	    && Class178.aClass368_1312 != null) {
	    int anLocalInt
		= ((-(Class178.aClass368_1312.method4019() * 2) + argument_3_)
		   / Statics.aClass368_6450.method4019());
	    for (int anLocalInt_10_ = 0; anLocalInt > anLocalInt_10_;
		 anLocalInt_10_++)
		Statics.aClass368_6450.method4014
		    (argument_6_ + (Class178.aClass368_1312.method4019()
				    + Statics.aClass368_6450
					  .method4019() * anLocalInt_10_),
		     argument);
	    Class178.aClass368_1312.method4014(argument_6_, argument);
	    Class361.aClass368_3054.method4014((argument_6_
						+ (argument_3_
						   - Class361
							 .aClass368_3054
							 .method4019())),
					       argument);
	}
	Class173.aAbstractFont_1286.method507((byte) 56, argument + 14, -1,
					 argument_9_,
					 Class93.anInt716 | ~0xffffff,
					 argument_6_ + 3);
	argument_7_.fillRect(argument_6_, argument_8_ + argument, argument_3_, -argument_8_ + argument_5_, (-Node_Sub37.anInt4165 + 255 << 24 | Class245_Sub1.anInt5302), 1);
    }
    
    public static void method3822(int argument) {
	GameEnum.GAME2 = null;
	aClass313_2918 = null;
	aClass207_2920 = null;
    }
    
    final int method3823(int argument_11_, int argument_12_,
			 byte argument_13_) {
	int anLocalInt = (Applet_Sub1.canvasWidth > argument_12_
			  ? Applet_Sub1.canvasWidth : argument_12_);
	if (this == Class226.aClass349_1639)
	    return 0;
	if (this == Class209.aClass349_1501)
	    return -argument_11_ + anLocalInt;
	if (this == Class131.aClass349_1062)
	    return (-argument_11_ + anLocalInt) / 2;
	return 0;
    }
}
