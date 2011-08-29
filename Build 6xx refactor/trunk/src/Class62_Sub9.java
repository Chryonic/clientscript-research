/* Class62_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub9 extends Class62
{
    static Class207 aClass207_4398 = new Class207(53, 7);
    
    Class62_Sub9(int argument_0_, Node_Sub50 argument_1_) {
	super(argument_0_, argument_1_);
    }
    
    public static void method1390(byte argument) {
	aClass207_4398 = null;
    }
    
    final void method1346(boolean argument_2_) {
	if (argument_2_)
	    method1344((byte) -46);
    }
    
    static final String method1391(RsInterface argument, byte argument_3_) {
	if (client.method122(argument).method709(0) == 0)
	    return null;
	if (((RsInterface) argument).aString1895 == null
	    || ((RsInterface) argument).aString1895.trim().length() == 0) {
	    if (dba_sub_772_Sub2.aBoolean6372)
		return "Hidden-use";
	    return null;
	}
	return ((RsInterface) argument).aString1895;
    }
    
    final int method1344(byte argument_4_) {
	if (argument_4_ != 4)
	    return -30;
	return 0;
    }
    
    Class62_Sub9(Node_Sub50 argument_5_) {
	super(argument_5_);
    }
    
    final int method1392(int argument_6_) {
	return ((Class62) this).anInt441;
    }
    
    final void method1343(int argument_7_, byte argument_8_) {
	((Class62) this).anInt441 = argument_7_;
	if (argument_8_ != -107)
	    aClass207_4398 = null;
    }
    
    final int method1342(int argument_9_, byte argument_10_) {
	int anLocalInt = 37 / ((-53 - argument_10_) / 50);
	return 1;
    }
}
