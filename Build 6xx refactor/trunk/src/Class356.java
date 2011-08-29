/* Class356 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class356
{
    static int anInt3011;
    private boolean aBoolean3012 = false;
    private String[] aStringArray3013 = new String[0];
    static Class368 aClass368_3014;
    static int anInt3015 = 0;
    static int anInt3016;
    private int anInt3017 = -1;
    private int anInt3018;
    
    private final void method3930(String argument_0_, int argument_1_,
				  byte argument_2_) {
	if (argument_1_ > anInt3017)
	    anInt3017 = argument_1_;
	if (argument_2_ > -53)
	    anInt3015 = -64;
	if (argument_1_ >= aStringArray3013.length)
	    method3936(argument_1_, (byte) -64);
	aStringArray3013[argument_1_] = argument_0_;
    }
    
    public static void method3931(int argument) {
	aClass368_3014 = null;
    }
    
    final String[] method3932(int argument_3_) {
	String[] strings = new String[anInt3017 + 1];
	JagStrings.memcpy(aStringArray3013, 0, strings, 0, anInt3017 + 1);
	return strings;
    }
    
    static final boolean method3933(int argument, String argument_4_) {
	if (argument_4_ == null)
	    return false;
	for (int anLocalInt = 0; anLocalInt < Class60.anInt436; anLocalInt++) {
	    if (argument_4_.equalsIgnoreCase(DoublyLinkedNode_Sub51_Sub19_Sub1
					     .aStringArray6676[anLocalInt]))
		return true;
	    if (argument_4_
		    .equalsIgnoreCase(Class18.aStringArray126[anLocalInt]))
		return true;
	}
	return false;
    }
    
    final void method3934(String argument_5_, int argument_6_) {
	method3930(argument_5_, anInt3017 + 1, (byte) -77);
    }
    
    public final String toString() {
	StringBuffer stringbuffer = new StringBuffer();
	stringbuffer.append("[");
	for (int anLocalInt = 0; anLocalInt < anInt3017; anLocalInt++) {
	    if (anLocalInt != 0)
		stringbuffer.append(", ");
	    stringbuffer.append(aStringArray3013[anLocalInt]);
	}
	stringbuffer.append("]");
	return stringbuffer.toString();
    }
    
    private final int method3935(int argument_7_, int argument_8_) {
	int anLocalInt = aStringArray3013.length;
	while (argument_8_ >= anLocalInt) {
	    if (aBoolean3012) {
		if (anLocalInt != 0)
		    anLocalInt *= anInt3018;
		else
		    anLocalInt = 1;
	    } else
		anLocalInt += anInt3018;
	}
	if (argument_7_ != 1)
	    method3932(121);
	return anLocalInt;
    }
    
    private final void method3936(int argument_9_, byte argument_10_) {
	String[] strings = new String[method3935(1, argument_9_)];
	JagStrings.memcpy(aStringArray3013, 0, strings, 0, aStringArray3013.length);
	aStringArray3013 = strings;
	if (argument_10_ > -36)
	    method3932(-3);
    }
    
    Class356(int argument_11_, boolean argument_12_) {
	aBoolean3012 = argument_12_;
	anInt3018 = argument_11_;
    }
}
