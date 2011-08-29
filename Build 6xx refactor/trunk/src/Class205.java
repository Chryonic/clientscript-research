/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class205
{
    int anInt1459;
    int anInt1460;
    int anInt1461;
    int anInt1462;
    int anInt1463;
    int anInt1464;
    int anInt1465 = 128;
    int anInt1466;
    static Class166 aClass166_1467 = new Class166(84, 4);
    int anInt1468;
    int anInt1469;
    static JagexHashMap aJagexHashMap_1470 = new JagexHashMap(16);
    static int anInt1471 = 0;
    static Js5Store aJs5Store_1472;
    static int anInt1473;
    static Class166 aClass166_1474 = new Class166(90, 16);
    int anInt1475;
    
    public static void method2937(int argument) {
	aJs5Store_1472 = null;
	aClass166_1467 = null;
	aJagexHashMap_1470 = null;
	aClass166_1474 = null;
    }
    
    final Class205 method2938(int argument_0_) {
	return new Class205(((Class205) this).anInt1459,
			    ((Class205) this).anInt1465,
			    ((Class205) this).anInt1463,
			    ((Class205) this).anInt1462,
			    ((Class205) this).anInt1461,
			    ((Class205) this).anInt1469);
    }
    
    static final short[][] method2939
	(float[][] argument, short[][] argument_1_, byte argument_2_) {
	for (int anLocalInt = 0; anLocalInt < argument.length; anLocalInt++) {
	    for (int anLocalInt_3_ = 0;
		 anLocalInt_3_ < argument_1_[anLocalInt].length;
		 anLocalInt_3_++)
		argument_1_[anLocalInt][anLocalInt_3_]
		    = (short) (int) (argument[anLocalInt][anLocalInt_3_]
				     * 16383.0F);
	}
	return argument_1_;
    }
    
    final void method2940(int argument_4_, Class205 argument_5_) {
	((Class205) this).anInt1462 = ((Class205) argument_5_).anInt1462;
	((Class205) this).anInt1463 = ((Class205) argument_5_).anInt1463;
	((Class205) this).anInt1469 = ((Class205) argument_5_).anInt1469;
	((Class205) this).anInt1459 = ((Class205) argument_5_).anInt1459;
	((Class205) this).anInt1465 = ((Class205) argument_5_).anInt1465;
	((Class205) this).anInt1461 = ((Class205) argument_5_).anInt1461;
    }
    
    Class205(int argument_6_) {
	((Class205) this).anInt1463 = 128;
	((Class205) this).anInt1459 = argument_6_;
    }
    
    private Class205(int argument_7_, int argument_8_, int argument_9_,
		     int argument_10_, int argument_11_, int argument_12_) {
	((Class205) this).anInt1463 = 128;
	((Class205) this).anInt1461 = argument_11_;
	((Class205) this).anInt1465 = argument_8_;
	((Class205) this).anInt1469 = argument_12_;
	((Class205) this).anInt1459 = argument_7_;
	((Class205) this).anInt1462 = argument_10_;
	((Class205) this).anInt1463 = argument_9_;
    }
}
