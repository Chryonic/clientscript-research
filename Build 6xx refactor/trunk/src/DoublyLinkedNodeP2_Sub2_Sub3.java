/* Class104_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class DoublyLinkedNodeP2_Sub2_Sub3 extends DoublyLinkedNodeP2_Sub2
{
    static JagexHashMap aJagexHashMap_6418 = new JagexHashMap(8);
    short aShort6419;
    static boolean aBoolean6420;
    static long[] aLongArray6421 = new long[32];
    
    final boolean method1780(int argument_0_, GraphicsToolkit argument_1_) {
	if (argument_0_ != 101)
	    aJagexHashMap_6418 = null;
	return (Class62_Sub18.method1428
		(((DoublyLinkedNodeP2_Sub2) this).worldZ >> LightingManager.lightCoordRShift, false,
		 ((DoublyLinkedNodeP2_Sub2) this).worldX >> LightingManager.lightCoordRShift,
		 ((DoublyLinkedNodeP2_Sub2) this).aByte4509, this));
    }
    
    static final void method1867(boolean argument, int argument_2_,
				 byte[] argument_3_) {
	if (Class33.aClass59_Sub28_223 == null)
	    Class33.aClass59_Sub28_223 = new Packet(20000);
	if (argument_2_ != 26477)
	    method1867(true, -123, null);
	Class33.aClass59_Sub28_223.pbytes(argument_3_, 0, argument_3_.length
    );
	if (argument) {
	    Statics.method3141((((Packet) Class33.aClass59_Sub28_223).data), argument_2_ ^ ~0x676f);
	    Class384.aClass84_Sub1Array3251
		= new Class84_Sub1[Class141.anInt1100];
	    int anLocalInt = 0;
	    for (int anLocalInt_4_ = DoublyLinkedNode_Sub51_Sub10.anInt5585;
		 anLocalInt_4_ <= Class62_Sub25.anInt4444; anLocalInt_4_++) {
		Class84_Sub1 class84_sub1
		    = Class115.method2369(anLocalInt_4_, 46);
		if (class84_sub1 != null)
		    Class384.aClass84_Sub1Array3251[anLocalInt++]
			= class84_sub1;
	    }
	    Class158.aBoolean1164 = false;
	    Class189_Sub1.aLong5641 = Applet_Sub1.getGameTime();
	    Class33.aClass59_Sub28_223 = null;
	}
    }
    
    final int applyLighting(byte argument_5_, HardwareLight[] argument_6_) {
	if (argument_5_ > -20)
	    aLongArray6421 = null;
	int anLocalInt
	    = ((DoublyLinkedNodeP2_Sub2) this).worldX >> LightingManager.lightCoordRShift;
	int anLocalInt_7_
	    = ((DoublyLinkedNodeP2_Sub2) this).worldZ >> LightingManager.lightCoordRShift;
	int anLocalInt_8_ = 0;
	if (Class189_Sub2.anInt5642 == anLocalInt)
	    anLocalInt_8_++;
	else if (Class189_Sub2.anInt5642 < anLocalInt)
	    anLocalInt_8_ += 2;
	if (Class311.anInt2592 == anLocalInt_7_)
	    anLocalInt_8_ += 3;
	else if (anLocalInt_7_ < Class311.anInt2592)
	    anLocalInt_8_ += 6;
	int anLocalInt_9_ = Class367.anIntArray3103[anLocalInt_8_];
	if ((anLocalInt_9_ & ((DoublyLinkedNodeP2_Sub2_Sub3) this).aShort6419) != 0)
	    return this.setupLighting(anLocalInt_7_, argument_6_, anLocalInt);
	if (((DoublyLinkedNodeP2_Sub2_Sub3) this).aShort6419 == 1 && anLocalInt > 0)
	    return this.setupLighting(anLocalInt_7_, argument_6_, anLocalInt - 1);
	if (((DoublyLinkedNodeP2_Sub2_Sub3) this).aShort6419 == 4
	    && LightingManager.xMapSize >= anLocalInt)
	    return this.setupLighting(anLocalInt_7_, argument_6_, anLocalInt + 1);
	if (((DoublyLinkedNodeP2_Sub2_Sub3) this).aShort6419 == 8 && anLocalInt_7_ > 0)
	    return this.setupLighting(anLocalInt_7_ - 1, argument_6_, anLocalInt);
	if (((DoublyLinkedNodeP2_Sub2_Sub3) this).aShort6419 == 2
	    && anLocalInt_7_ <= LightingManager.zMapSize)
	    return this.setupLighting(anLocalInt_7_ + 1, argument_6_, anLocalInt);
	if (((DoublyLinkedNodeP2_Sub2_Sub3) this).aShort6419 == 16 && anLocalInt > 0
	    && LightingManager.zMapSize >= anLocalInt_7_)
	    return this.setupLighting(anLocalInt_7_ + 1, argument_6_, anLocalInt - 1);
	if (((DoublyLinkedNodeP2_Sub2_Sub3) this).aShort6419 == 32
	    && anLocalInt <= LightingManager.xMapSize
	    && LightingManager.zMapSize >= anLocalInt_7_)
	    return this.setupLighting(anLocalInt_7_ + 1, argument_6_, anLocalInt + 1);
	if (((DoublyLinkedNodeP2_Sub2_Sub3) this).aShort6419 == 128 && anLocalInt > 0
	    && anLocalInt_7_ > 0)
	    return this.setupLighting(anLocalInt_7_ - 1, argument_6_, anLocalInt - 1);
	if (((DoublyLinkedNodeP2_Sub2_Sub3) this).aShort6419 == 64
	    && anLocalInt <= LightingManager.xMapSize && anLocalInt_7_ > 0)
	    return this.setupLighting(anLocalInt_7_ - 1, argument_6_, anLocalInt + 1);
	throw new RuntimeException("");
    }
    
    DoublyLinkedNodeP2_Sub2_Sub3(int argument_10_, int argument_11_, int argument_12_,
		       int argument_13_, int argument_14_, int argument_15_) {
	((DoublyLinkedNodeP2_Sub2) this).worldX = argument_10_;
	((DoublyLinkedNodeP2_Sub2_Sub3) this).aShort6419 = (short) argument_15_;
	((DoublyLinkedNodeP2_Sub2) this).lightingHL = (byte) argument_13_;
	((DoublyLinkedNodeP2_Sub2) this).worldZ = argument_12_;
	((DoublyLinkedNodeP2_Sub2) this).aByte4509 = (byte) argument_14_;
	((DoublyLinkedNodeP2_Sub2) this).anInt4511 = argument_11_;
    }
    
    public static void method1868(boolean argument) {
	aLongArray6421 = null;
	aJagexHashMap_6418 = null;
    }
    
    final boolean method1765(int argument_16_) {
	if (argument_16_ <= 103)
	    aLongArray6421 = null;
	return (Class242.aBooleanArrayArray1757
		[-Class189_Sub2.anInt5642 + ((((DoublyLinkedNodeP2_Sub2) this).worldX
					      >> LightingManager.lightCoordRShift)
					     + Node_Sub35.anInt4158)]
		[((((DoublyLinkedNodeP2_Sub2) this).worldZ >> LightingManager.lightCoordRShift)
		  - (Class311.anInt2592 - Node_Sub35.anInt4158))]);
    }
}
