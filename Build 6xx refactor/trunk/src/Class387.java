/* Class387 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class387
{
    static Class390 aClass390_3267;
    static int anInt3268;
    static int anInt3269;
    static boolean aBoolean3270 = false;

    static final byte[] method4128
	(float argument, boolean argument_0_, float argument_1_,
	 float argument_2_, int argument_3_, int argument_4_,
	 float argument_5_, float argument_6_, int argument_7_,
	 Class111 argument_8_, int argument_9_) {
	byte[] anLocalInts = new byte[argument_7_ * argument_4_ * argument_3_];
	Class354.method3921(argument_7_, 0, argument_1_, anLocalInts,
			    argument_3_, argument_8_, argument, argument_9_,
			    argument_2_, 123, argument_4_, argument_5_,
			    argument_6_);
	return anLocalInts;
    }
    
    public static void method4129(int argument) {
	ModeWhatEnum.WIP = null;
	aClass390_3267 = null;
    }
    
    static {
	aClass390_3267 = new Class390();
	ModeWhatEnum.WIP = new ModeWhatEnum("WIP", 2);
    }
}
