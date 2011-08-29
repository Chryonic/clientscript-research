/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class50
{
    boolean aBoolean364;
    static int anInt365;
    int anInt366;
    int anInt367 = 512;
    Class51 aClass51_368;
    int anInt369 = -1;
    boolean aBoolean370 = true;
    int anInt371;
    static Class81 aClass81_372;
    static boolean aBoolean373 = false;
    int anInt374 = 64;
    boolean aBoolean375;
    int anInt376;
    int anInt377;
    int anInt378;
    int anInt379;
    static boolean aBoolean380;
    /*synthetic*/ static Class aClass381;

    final void method461(int argument_5_, Packet argument_6_) {
	if (argument_5_ != -7)
	    method464(39);
	for (;;) {
	    int anLocalInt = argument_6_.g1();
	    if (anLocalInt == 0)
		break;
	    method466(argument_6_, 107, anLocalInt);
	}
    }
    
    static final String method462(int argument, int argument_7_,
				  int argument_8_) {
	int anLocalInt = argument_7_ - argument_8_;
	if (anLocalInt < -9)
	    return "<col=ff0000>";
	if (anLocalInt < -6)
	    return "<col=ff3000>";
	if (anLocalInt < -3)
	    return "<col=ff7000>";
	if (anLocalInt < 0)
	    return "<col=ffb000>";
	if (anLocalInt > 9)
	    return "<col=00ff00>";
	if (anLocalInt > 6)
	    return "<col=40ff00>";
	if (anLocalInt > 3)
	    return "<col=80ff00>";
	if (anLocalInt > 0)
	    return "<col=c0ff00>";
	return "<col=ffff00>";
    }
    
    static final int[] method463(boolean argument, float argument_9_,
				 int argument_10_, int argument_11_,
				 int argument_12_, int argument_13_,
				 int argument_14_, int argument_15_) {
	int[] anLocalInts = new int[argument_15_];
	Node_Sub31_Sub37 class59_sub31_sub37 = new Node_Sub31_Sub37();
	((Node_Sub31_Sub37) class59_sub31_sub37).anInt6023 = argument_10_;
	((Node_Sub31_Sub37) class59_sub31_sub37).anInt6025 = argument_11_;
	((Node_Sub31_Sub37) class59_sub31_sub37).anInt6031 = argument_13_;
	((Node_Sub31_Sub37) class59_sub31_sub37).anInt6024 = argument_12_;
	((Node_Sub31_Sub37) class59_sub31_sub37).aBoolean6018 = argument;
	((Node_Sub31_Sub37) class59_sub31_sub37).anInt6019
	    = (int) (argument_9_ * 4096.0F);
	class59_sub31_sub37.method865(true);
	Class122.method2391(argument_15_, 1, -50);
	class59_sub31_sub37.method996(125, anLocalInts, 0);
	return anLocalInts;
    }
    
    public static void method464(int argument) {
	aClass81_372 = null;
    }
    
    final void method465(int argument_16_) {
	((Class50) this).anInt379
	    = ((Class50) this).anInt371 | ((Class50) this).anInt379 << 8;
    }
    
    private final void method466(Packet argument_17_, int argument_18_,
				 int argument_19_) {
	if (argument_18_ < 58)
	    method464(42);
	if (argument_19_ == 1)
	    ((Class50) this).anInt376
		= Statics.method2975((byte) -3, argument_17_.g3_dupl());
	else if (argument_19_ == 2)
	    ((Class50) this).anInt369 = argument_17_.g1();
	else if (argument_19_ == 3) {
	    ((Class50) this).anInt369 = argument_17_.g2();
	    if (((Class50) this).anInt369 == 65535)
		((Class50) this).anInt369 = -1;
	} else if (argument_19_ != 5) {
	    if (argument_19_ != 7) {
		if (argument_19_ == 8)
		    ((Class51) ((Class50) this).aClass51_368).anInt389
			= ((Class50) this).anInt371;
		else if (argument_19_ != 9) {
		    if (argument_19_ == 10)
			((Class50) this).aBoolean370 = false;
		    else if (argument_19_ == 11)
			((Class50) this).anInt379
			    = argument_17_.g1();
		    else if (argument_19_ != 12) {
			if (argument_19_ != 13) {
			    if (argument_19_ == 14)
				((Class50) this).anInt374
				    = argument_17_.g1() << 2;
			    else if (argument_19_ == 16)
				((Class50) this).anInt366
				    = argument_17_.g1();
			} else
			    ((Class50) this).anInt377
				= argument_17_.g3_dupl();
		    } else
			((Class50) this).aBoolean375 = true;
		} else
		    ((Class50) this).anInt367
			= argument_17_.g2() << 2;
	    } else
		((Class50) this).anInt378
		    = Statics.method2975((byte) -3, argument_17_.g3_dupl());
	} else
	    ((Class50) this).aBoolean364 = false;
    }
    
    public Class50() {
	((Class50) this).aBoolean364 = true;
	((Class50) this).anInt366 = 127;
	((Class50) this).anInt376 = 0;
	((Class50) this).aBoolean375 = false;
	((Class50) this).anInt379 = 8;
	((Class50) this).anInt377 = 1190717;
	((Class50) this).anInt378 = -1;
    }
    
    /*synthetic*/ static Class method467(String argument) {
	try {
	    return Class.forName(argument);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aClass81_372 = new Class81();
	aBoolean380 = false;
    }
}
