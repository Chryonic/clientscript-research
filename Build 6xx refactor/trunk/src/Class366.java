/* Class366 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class366
{
    static Class166 aClass166_3086;
    static Js5Store aJs5Store_3087;
    private DoublyLinkedNodeP2 aClass104_3088 = new DoublyLinkedNodeP2();
    static int anInt3089 = 0;
    private DoublyLinkedNodeP2 aClass104_3090;
    
    final void method3983(DoublyLinkedNodeP2 argument_0_, byte argument_1_) {
	if (((DoublyLinkedNodeP2) argument_0_).aClass104_855 != null)
	    argument_0_.unlink();
	((DoublyLinkedNodeP2) argument_0_).aClass104_858 = aClass104_3088;
	((DoublyLinkedNodeP2) argument_0_).aClass104_855
	    = ((DoublyLinkedNodeP2) aClass104_3088).aClass104_855;
	((DoublyLinkedNodeP2) ((DoublyLinkedNodeP2) argument_0_).aClass104_855).aClass104_858
	    = argument_0_;
	((DoublyLinkedNodeP2) ((DoublyLinkedNodeP2) argument_0_).aClass104_858).aClass104_855
	    = argument_0_;
    }

    public static void method3985(byte argument) {
	aClass166_3086 = null;
	aJs5Store_3087 = null;
    }
    
    final DoublyLinkedNodeP2 method3986(int argument_5_) {
	DoublyLinkedNodeP2 class104 = ((DoublyLinkedNodeP2) aClass104_3088).aClass104_858;
	if (aClass104_3088 == class104) {
	    aClass104_3090 = null;
	    return null;
	}
	aClass104_3090 = ((DoublyLinkedNodeP2) class104).aClass104_858;
	return class104;
    }
    
    final boolean method3987(int argument_6_) {
	if (((DoublyLinkedNodeP2) aClass104_3088).aClass104_858 != aClass104_3088)
	    return false;
	return true;
    }
    
    final DoublyLinkedNodeP2 method3988(byte argument_7_) {
	DoublyLinkedNodeP2 class104 = ((DoublyLinkedNodeP2) aClass104_3088).aClass104_858;
	if (aClass104_3088 == class104)
	    return null;
	class104.unlink();
	return class104;
    }
    
    final int method3989(int argument_8_) {
	int anLocalInt = 0;
	DoublyLinkedNodeP2 class104 = ((DoublyLinkedNodeP2) aClass104_3088).aClass104_858;
	while (aClass104_3088 != class104) {
	    class104 = ((DoublyLinkedNodeP2) class104).aClass104_858;
	    anLocalInt++;
	}
	return anLocalInt;
    }
    
    final void method3990(int argument_9_) {
	for (;;) {
	    DoublyLinkedNodeP2 class104 = ((DoublyLinkedNodeP2) aClass104_3088).aClass104_858;
	    if (class104 == aClass104_3088)
		break;
	    class104.unlink();
	}
	aClass104_3090 = null;
    }
    
    static final void method3991(String argument, int argument_10_,
				 int argument_11_, String argument_12_) {
	if (argument_12_.length() <= 320 && Class295.method3505((byte) -48)) {
	    Class206.method2943((byte) 44);
	    Class276.aString2215 = argument;
	    Statics.aString2295 = argument_12_;
	    Node_Sub13.anInt3978 = argument_10_;
	    Class316.method3638(argument_11_, 2);
	}
    }
    
    final DoublyLinkedNodeP2 method3992(byte argument_13_) {
	DoublyLinkedNodeP2 class104 = aClass104_3090;
	if (aClass104_3088 == class104) {
	    aClass104_3090 = null;
	    return null;
	}
	aClass104_3090 = ((DoublyLinkedNodeP2) class104).aClass104_858;
	return class104;
    }
    
    final DoublyLinkedNodeP2 method3993(byte argument_14_) {
	DoublyLinkedNodeP2 class104 = ((DoublyLinkedNodeP2) aClass104_3088).aClass104_855;
	if (aClass104_3088 == class104) {
	    aClass104_3090 = null;
	    return null;
	}
	aClass104_3090 = ((DoublyLinkedNodeP2) class104).aClass104_855;
	return class104;
    }
    
    public Class366() {
	((DoublyLinkedNodeP2) aClass104_3088).aClass104_855 = aClass104_3088;
	((DoublyLinkedNodeP2) aClass104_3088).aClass104_858 = aClass104_3088;
    }
}
