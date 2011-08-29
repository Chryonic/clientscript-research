/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class164
{
    static int[][][] anIntArrayArrayArray1198 = new int[2][][];
    static int anInt1199;

    public static void method2623(byte argument) {
	anIntArrayArrayArray1198 = null;
    }
    
    static final void method2624(boolean argument, DoublyLinkedNodeP2 argument_0_,
				 DoublyLinkedNodeP2 argument_1_) {
	if (((DoublyLinkedNodeP2) argument_1_).aClass104_855 != null)
	    argument_1_.unlink();
	((DoublyLinkedNodeP2) argument_1_).aClass104_855
	    = ((DoublyLinkedNodeP2) argument_0_).aClass104_855;
	((DoublyLinkedNodeP2) argument_1_).aClass104_858 = argument_0_;
	((DoublyLinkedNodeP2) ((DoublyLinkedNodeP2) argument_1_).aClass104_855).aClass104_858
	    = argument_1_;
	((DoublyLinkedNodeP2) ((DoublyLinkedNodeP2) argument_1_).aClass104_858).aClass104_855
	    = argument_1_;
    }
    
    static final Class184 method2625(Packet argument, int argument_2_) {
	int anLocalInt = argument.g1();
	if (argument_2_ != 0)
	    return null;
	Class349 class349 = (JagexHashMap.method1522()
			     [argument.g1()]);
	Class44 class44 = (Class225.method3051(-1)
			   [argument.g1()]);
	int anLocalInt_3_ = argument.g2s();
	int anLocalInt_4_ = argument.g2s();
	int anLocalInt_5_ = argument.g2();
	int anLocalInt_6_ = argument.g2();
	int anLocalInt_7_ = argument.g4();
	int anLocalInt_8_ = argument.g4();
	int anLocalInt_9_ = argument.g4();
	boolean anLocalBoolean = argument.g1() == 1;
	return new Class184(anLocalInt, class349, class44, anLocalInt_3_,
			    anLocalInt_4_, anLocalInt_5_, anLocalInt_6_,
			    anLocalInt_7_, anLocalInt_8_, anLocalInt_9_,
			    anLocalBoolean);
    }
    
    static {
	anInt1199 = 0;
    }
}
