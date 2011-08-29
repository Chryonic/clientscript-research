/* Class263 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class263 implements Interface14
{
    static Class207 aClass207_3630 = new Class207(83, 0);
    private Class184 aClass184_3631;
    static Class166 aClass166_3632 = new Class166(119, 2);
    static boolean aBoolean3633 = false;
    private Class348 aClass348_3634;
    
    public final boolean method58(int argument_0_) {
	if (argument_0_ != 20662)
	    method3325(true);
	return aClass348_3634.method3818((byte) 108);
    }
    
    private final int method3324(AbstractFont argument_1_, int argument_2_,
				 byte argument_3_, int argument_4_,
				 int argument_5_, String argument_6_) {
	if (argument_3_ > -53)
	    method3325(false);
	return (argument_1_.method498
		(argument_6_, 0, 0, null, argument_2_ + argument_5_, -1,
		 ((Class184) aClass184_3631).anInt3704, 0,
		 -(argument_5_ * 2) + ((Class184) aClass184_3631).anInt3698,
		 -(argument_5_ * 2) + ((Class184) aClass184_3631).anInt3696, 0,
		 0, ((Class184) aClass184_3631).anInt3702, null, null,
		 argument_4_ + argument_5_));
    }
    
    public final void method57(int argument_7_) {
	if (argument_7_ <= 36)
	    aClass166_3632 = null;
    }
    
    public static void method3325(boolean argument) {
	aClass166_3632 = null;
	aClass207_3630 = null;
    }
    
    static final int method3326(byte argument) {
	return Node_Sub47_Sub2.anInt6162++;
    }

    public final void method59(int argument_10_, boolean argument_11_) {
	if (argument_10_ > -93)
	    aBoolean3633 = false;
	Class32 class32
	    = aClass348_3634.method3817(true,
					((Class184) aClass184_3631).anInt3699);
	if (class32 != null) {
	    int anLocalInt
		= ((((Class184) aClass184_3631).aClass349_3695.method3823
		    (((Class184) aClass184_3631).anInt3698,
		     client.gameWidth, (byte) -91))
		   + ((Class184) aClass184_3631).anInt3697);
	    int anLocalInt_12_
		= ((((Class184) aClass184_3631).aClass44_3700.method431
		    (0, client.gameHeight,
		     ((Class184) aClass184_3631).anInt3696))
		   + ((Class184) aClass184_3631).anInt3703);
	    if (((Class184) aClass184_3631).aBoolean3701)
		Class389.aGraphicsToolkit3281.drawRect(anLocalInt, anLocalInt_12_, ((Class184) aClass184_3631).anInt3698, ((Class184) aClass184_3631).anInt3696, ((Class184) aClass184_3631).anInt3694, 0);
	    anLocalInt_12_ += method3324(Class173.aAbstractFont_1286, anLocalInt,
					 (byte) -61, anLocalInt_12_, 5,
					 ((Class32) class32).aString210) * 12;
	    anLocalInt_12_ += 8;
	    if (((Class184) aClass184_3631).aBoolean3701)
		Class389.aGraphicsToolkit3281.drawLine(anLocalInt, anLocalInt_12_, anLocalInt - 1 + ((Class184) aClass184_3631).anInt3698, anLocalInt_12_, ((Class184) aClass184_3631).anInt3694, 0);
	    anLocalInt_12_
		= (++anLocalInt_12_
		   + method3324(Class173.aAbstractFont_1286, anLocalInt,
				(byte) -127, anLocalInt_12_, 5,
				((Class32) class32).aString212) * 12);
	    anLocalInt_12_ += 5;
	    anLocalInt_12_ += method3324(Class173.aAbstractFont_1286, anLocalInt,
					 (byte) -81, anLocalInt_12_, 5,
					 ((Class32) class32).aString211) * 12;
	}
    }
    
    Class263(Class348 argument_13_, Class184 argument_14_) {
	aClass348_3634 = argument_13_;
	aClass184_3631 = argument_14_;
    }
}
