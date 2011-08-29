/* Class295 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class295
{
    static Js5Store aJs5Store_2456;
    
    static final int method3504(char argument, int argument_0_,
				byte argument_1_) {
	int anLocalInt = argument << 4;
	if (Character.isUpperCase(argument)
	    || Character.isTitleCase(argument)) {
	    int anLocalInt_2_ = Character.toLowerCase(argument);
	    anLocalInt = (anLocalInt_2_ << 4) + 1;
	}
	return anLocalInt;
    }
    
    static final boolean method3505(byte argument) {
	if (Statics.anInt1652 != 3)
	    return false;
	if (DoublyLinkedNode_Sub51_Sub12.anInt6286 != 0 || Class245.anInt1784 != 0)
	    return false;
	return true;
    }
    
    static final byte[] method3506(int argument, byte[] argument_3_,
				   int argument_4_, int argument_5_) {
	byte[] anLocalInts = new byte[argument_4_];
	JagStrings.memcpy(argument_3_, argument_5_, anLocalInts, 0, argument_4_);
	return anLocalInts;
    }
    
    static final int method3507(int argument, int argument_6_,
				int argument_7_) {
	int anLocalInt = 0;
	for (/**/; argument_7_ > 0; argument_7_--) {
	    anLocalInt = anLocalInt << 1 | argument_6_ & 0x1;
	    argument_6_ >>>= 1;
	}
	return anLocalInt;
    }
    
    static final int[] method3508(boolean argument) {
	return (new int[]
		{ client.fontIndexP11full, client.fontIndexP12full, client.fontIndexB12full});
    }
    
    public static void method3509(int argument) {
	aJs5Store_2456 = null;
    }

    static final void method3511(boolean argument) {
	if (argument) {
	    GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
		= Class152.aClass148ArrayArrayArray1151;
	    Node_Sub31_Sub5.aClass_sArray5858 = Class65.aClass_sArray455;
	} else {
	    GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
		= Class84_Sub1.aClass148ArrayArrayArray4480;
	    Node_Sub31_Sub5.aClass_sArray5858 = Statics.aClass_sArray2713;
	}
	LightingManager.yMapSize
	    = GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676.length;
    }
}
