/* Class104_Sub2_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class DoublyLinkedNodeP2_Sub2_Sub4 extends DoublyLinkedNodeP2_Sub2
{
    static boolean aBoolean6422 = false;
    static Class354 aClass354_6423 = new Class354();
    short aShort6424;
    static Class336 aClass336_6425;
    
    public static void method1878(int argument) {
	aClass354_6423 = null;
	aClass336_6425 = null;
    }
    
    static final Class method1879(String argument, int argument_0_)
	throws ClassNotFoundException {
	if (argument.equals("B"))
	    return Byte.TYPE;
	if (argument.equals("I"))
	    return Integer.TYPE;
	if (argument.equals("S"))
	    return Short.TYPE;
	if (argument.equals("J"))
	    return Long.TYPE;
	if (argument.equals("Z"))
	    return Boolean.TYPE;
	if (argument.equals("F"))
	    return Float.TYPE;
	if (argument.equals("D"))
	    return Double.TYPE;
	if (argument.equals("C"))
	    return Character.TYPE;
	return Class.forName(argument);
    }
    
    final boolean method1780(int argument_1_, GraphicsToolkit argument_2_) {
	if (argument_1_ != 101)
	    return false;
	return Node_Sub29.method856((((DoublyLinkedNodeP2_Sub2) this).worldX
            >> LightingManager.lightCoordRShift),
            (((DoublyLinkedNodeP2_Sub2) this).worldZ
                    >> LightingManager.lightCoordRShift),
            ((DoublyLinkedNodeP2_Sub2) this).aByte4509,
            19322);
    }
    
    static final void method1880(int argument) {
	if (Class86.anInterface8Array640 != null) {
	    Interface8[] interface8s = Class86.anInterface8Array640;
	    for (int anLocalInt = 0; interface8s.length > anLocalInt;
		 anLocalInt++) {
		Interface8 interface8 = interface8s[anLocalInt];
		interface8.method39(true);
	    }
	}
    }
    
    final int applyLighting(byte argument_3_, HardwareLight[] argument_4_) {
	if (argument_3_ >= -20)
	    method1765(-19);
	return this.setupLighting((((DoublyLinkedNodeP2_Sub2) this).worldZ >> LightingManager.lightCoordRShift), argument_4_, (((DoublyLinkedNodeP2_Sub2) this).worldX >> LightingManager.lightCoordRShift));
    }
    
    static final int method1881(byte argument) {
	int anLocalInt = client.currentLoadingStatus.getIndex();
	if (client.loadingStatusCollection.length - 1 > anLocalInt)
	    client.currentLoadingStatus
		= client.loadingStatusCollection[anLocalInt + 1];
	return 100;
    }
    
    final boolean method1765(int argument_5_) {
	if (argument_5_ < 103)
	    aClass354_6423 = null;
	return (Class242.aBooleanArrayArray1757
		[((((DoublyLinkedNodeP2_Sub2) this).worldX >> LightingManager.lightCoordRShift)
		  - Class189_Sub2.anInt5642 + Node_Sub35.anInt4158)]
		[Node_Sub35.anInt4158 + ((((DoublyLinkedNodeP2_Sub2) this).worldZ
					     >> LightingManager.lightCoordRShift)
					    - Class311.anInt2592)]);
    }
    
    DoublyLinkedNodeP2_Sub2_Sub4(int argument_6_, int argument_7_, int argument_8_,
		       int argument_9_, int argument_10_, int argument_11_) {
	((DoublyLinkedNodeP2_Sub2) this).aByte4509 = (byte) argument_10_;
	((DoublyLinkedNodeP2_Sub2) this).worldX = argument_6_;
	((DoublyLinkedNodeP2_Sub2) this).lightingHL = (byte) argument_9_;
	((DoublyLinkedNodeP2_Sub2_Sub4) this).aShort6424 = (short) argument_11_;
	((DoublyLinkedNodeP2_Sub2) this).worldZ = argument_8_;
	((DoublyLinkedNodeP2_Sub2) this).anInt4511 = argument_7_;
    }
}
