/* Class179_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class179_Sub1 extends Class179
{
    static Js5Store aJs5Store_5270;
    static Class130[] aClass130Array5271;
    
    static final void method2823(int argument, int argument_0_,
				 int argument_1_) {
	Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			     [argument][argument_0_][argument_1_]);
	if (class148 != null) {
	    Class191
		.method2886(((Class148) class148).aClass104_Sub2_Sub1_1131);
	    Class191
		.method2886(((Class148) class148).aClass104_Sub2_Sub1_1128);
	    if (((Class148) class148).aClass104_Sub2_Sub1_1131 != null)
		((Class148) class148).aClass104_Sub2_Sub1_1131 = null;
	    if (((Class148) class148).aClass104_Sub2_Sub1_1128 != null)
		((Class148) class148).aClass104_Sub2_Sub1_1128 = null;
	}
    }
    
    public static void method2824(int argument) {
	aJs5Store_5270 = null;
	aClass130Array5271 = null;
    }
    
    static final byte[] method2825(int argument, boolean argument_2_) {
	DoublyLinkedNode_Sub51_Sub1 class59_sub51_sub1
	    = ((DoublyLinkedNode_Sub51_Sub1)
	       Class46_Sub3_Sub1.aClass165_5740.get((long) argument, 19));
	if (class59_sub51_sub1 == null) {
	    byte[] anLocalInts = new byte[512];
	    Random random = new Random((long) argument);
	    for (int anLocalInt = 0; anLocalInt < 255; anLocalInt++)
		anLocalInts[anLocalInt] = (byte) anLocalInt;
	    for (int anLocalInt = 0; anLocalInt < 255; anLocalInt++) {
		int anLocalInt_3_ = -anLocalInt + 255;
		int anLocalInt_4_
		    = Class207.method2945(random, 63, anLocalInt_3_);
		byte anLocalInt_5_ = anLocalInts[anLocalInt_4_];
		anLocalInts[anLocalInt_4_] = anLocalInts[anLocalInt_3_];
		anLocalInts[anLocalInt_3_] = anLocalInts[-anLocalInt + 511]
		    = anLocalInt_5_;
	    }
	    class59_sub51_sub1 = new DoublyLinkedNode_Sub51_Sub1(anLocalInts);
	    Class46_Sub3_Sub1.aClass165_5740.put(class59_sub51_sub1, 127, (long) argument);
	}
	return ((DoublyLinkedNode_Sub51_Sub1) class59_sub51_sub1).aByteArray6218;
    }
}
