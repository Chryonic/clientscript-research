/* Class384 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class384
{
    int anInt3247;
    int anInt3248;
    static Class217 aClass217_3249;
    byte[] aByteArray3250;
    static Class84_Sub1[] aClass84_Sub1Array3251 = new Class84_Sub1[0];
    int anInt3252;
    int anInt3253;
    int anInt3254;
    static boolean aBoolean3255 = true;
    byte[] aByteArray3256;
    int anInt3257;
    int anInt3258;
    static Class166 aClass166_3259;

    public static void method4117(byte argument) {
	aClass84_Sub1Array3251 = null;
	aClass166_3259 = null;
	aClass217_3249 = null;
	AthmosphericConditions.targetConditions = null;
    }
    
    static final void method4118(DoublyLinkedNode argument,
				 DoublyLinkedNode argument_0_, int argument_1_) {
	if (((DoublyLinkedNode) argument).prevD != null)
	    argument.unlinkD();
	((DoublyLinkedNode) argument).prevD
	    = ((DoublyLinkedNode) argument_0_).prevD;
	((DoublyLinkedNode) argument).nextD = argument_0_;
	((DoublyLinkedNode) ((DoublyLinkedNode) argument).prevD)
	    .nextD
	    = argument;
	((DoublyLinkedNode) ((DoublyLinkedNode) argument).nextD)
	    .prevD
	    = argument;
    }
    
    static final int method4119(int argument, int argument_2_,
				int argument_3_) {
	double d = Math.log((double) argument_2_) / Math.log(2.0);
	double d_4_ = Math.log((double) argument) / Math.log(2.0);
	double d_5_ = d_4_ + Math.random() * (-d_4_ + d);
	return (int) (Math.pow(2.0, d_5_) + 0.5);
    }
    
    public Class384() {
	/* empty */
    }
    
    static {
	aClass217_3249 = new Class217(8, 0, 4, 1);
	aClass166_3259 = new Class166(8, 9);
    }
}
