/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class130
{
    static int anInt1049 = 2;
    static String[] aStringArray1050;
    String aString1051;
    private Class366 aClass366_1052 = new Class366();
    static int[] anIntArray1053;
    private volatile int anInt1054;
    static Class303_Sub1 aClass303_Sub1_1055;
    private Class380 aClass380_1056;
    
    final void method2428(Class380 argument_0_, byte argument_1_) {
	aClass380_1056 = argument_0_;
    }
    
    final DoublyLinkedNodeP2 method2429(byte argument_2_) {
	Object object = null;
	DoublyLinkedNodeP2 class104;
	synchronized (aClass366_1052) {
	    class104 = aClass366_1052.method3986(0);
	    class104.unlink();
	    anInt1054--;
	}
	return class104;
    }
    
    final void method2430(DoublyLinkedNodeP2_Sub2 argument_3_, byte argument_4_) {
	((DoublyLinkedNodeP2_Sub2) argument_3_).aBoolean4508 = false;
	synchronized (aClass366_1052) {
	    aClass366_1052.method3983(argument_3_, (byte) 119);
	    anInt1054++;
	}
	if (aClass380_1056 != null) {
	    synchronized (aClass380_1056) {
		aClass380_1056.notify();
	    }
	}
    }
    
    final void method2431(DoublyLinkedNodeP2_Sub3 argument_5_, int argument_6_) {
	synchronized (aClass366_1052) {
	    aClass366_1052.method3983(argument_5_, (byte) 119);
	    anInt1054++;
	}
	if (aClass380_1056 != null) {
	    synchronized (aClass380_1056) {
		aClass380_1056.notify();
	    }
	}
    }
    
    final boolean method2432(int argument_7_) {
	if (anInt1054 != 0)
	    return false;
	return true;
    }
    
    final void method2433(int argument_8_, DoublyLinkedNodeP2_Sub2 argument_9_) {
	((DoublyLinkedNodeP2_Sub2) argument_9_).aBoolean4508 = true;
	synchronized (aClass366_1052) {
	    aClass366_1052.method3983(argument_9_, (byte) 119);
	    anInt1054++;
	}
	if (aClass380_1056 != null) {
	    synchronized (aClass380_1056) {
		aClass380_1056.notify();
	    }
	}
    }
    
    public static void method2434(byte argument) {
	anIntArray1053 = null;
	aStringArray1050 = null;
	aClass303_Sub1_1055 = null;
    }
    
    Class130(String argument_10_) {
	((Class130) this).aString1051 = argument_10_;
    }
}
