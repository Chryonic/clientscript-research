/* Class104_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class DoublyLinkedNodeP2_Sub2_Sub1 extends DoublyLinkedNodeP2_Sub2
{
    static Class207 aClass207_6399 = new Class207(38, -1);
    short aShort6400;
    short aShort6401;
    static Class166 aClass166_6402 = new Class166(74, 0);
    static Class166 aClass166_6403 = new Class166(106, 10);
    static CyclicLinkedList aCyclicLinkedList_6404;
    static int[] anIntArray6405 = new int[3];
    static int[] anIntArray6406;
    
    final void method1775(GraphicsToolkit argument_0_, DoublyLinkedNodeP2_Sub2 argument_1_,
			  boolean argument_2_, int argument_3_,
			  int argument_4_, int argument_5_, int argument_6_) {
	if (argument_3_ >= -16)
	    method1765(124);
	throw new IllegalStateException();
    }
    
    final boolean method1782(int argument_7_) {
	if (argument_7_ != -1)
	    return true;
	return false;
    }
    
    final boolean method1780(int argument_8_, GraphicsToolkit argument_9_) {
	if (argument_8_ != 101)
	    method1770(27);
	return Class225.method3052(this.method1781(748449288),
				   (this.worldZ
				    >> LightingManager.lightCoordRShift),
				   (this.worldX
				    >> LightingManager.lightCoordRShift),
				   this.aByte4509,
				   (byte) -34);
    }
    
    final int applyLighting(byte argument_10_, HardwareLight[] argument_11_) {
	if (argument_10_ > -20)
	    aCyclicLinkedList_6404 = null;
	return this.setupLighting((this.worldZ >> LightingManager.lightCoordRShift), argument_11_, (this.worldX >> LightingManager.lightCoordRShift));
    }
    
    final void method1770(int argument_12_) {
	if (argument_12_ != -13514)
	    method1770(37);
	throw new IllegalStateException();
    }
    
    final boolean method1765(int argument_13_) {
	if (argument_13_ <= 103)
	    return false;
	return (Class242.aBooleanArrayArray1757
		[Node_Sub35.anInt4158 + ((this.worldX
					     >> LightingManager.lightCoordRShift)
					    - Class189_Sub2.anInt5642)]
		[(-Class311.anInt2592
		  + (this.worldZ >> LightingManager.lightCoordRShift)
		  + Node_Sub35.anInt4158)]);
    }
    
    public static void method1784(int argument) {
	aCyclicLinkedList_6404 = null;
	aClass207_6399 = null;
	anIntArray6406 = null;
	aClass166_6402 = null;
	anIntArray6405 = null;
	aClass166_6403 = null;
    }
    
    DoublyLinkedNodeP2_Sub2_Sub1(int argument_14_, int argument_15_, int argument_16_,
		       int argument_17_, int argument_18_, int argument_19_,
		       int argument_20_) {
	((DoublyLinkedNodeP2_Sub2) this).lightingHL = (byte) argument_17_;
	((DoublyLinkedNodeP2_Sub2) this).aByte4509 = (byte) argument_18_;
	this.aShort6401 = (short) argument_20_;
	((DoublyLinkedNodeP2_Sub2) this).anInt4511 = argument_15_;
	((DoublyLinkedNodeP2_Sub2) this).worldX = argument_14_;
	((DoublyLinkedNodeP2_Sub2) this).worldZ = argument_16_;
	this.aShort6400 = (short) argument_19_;
    }
    
    static {
	aCyclicLinkedList_6404 = new CyclicLinkedList();
    }
}
