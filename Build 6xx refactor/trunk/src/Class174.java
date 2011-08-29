/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class174 implements TextureSource
{
    private Class165 aClass165_3437 = new Class165(256);
    static int anInt3438;
    private int anInt3439;
    private Js5Store aJs5Store_3440;
    static float aFloat3441;
    private TextureDescriptor[] aTextureDescriptorArray3442;
    private Js5Store aJs5Store_3443;
    
    public final int[] method14(int argument_0_, int argument_1_,
				int argument_2_, float argument_3_,
				int argument_4_, boolean argument_5_) {
	if (argument_2_ > -87)
	    return null;
	return (method2770(argument_1_, true).method1274
		(argument_4_, (double) argument_3_,
		 ((TextureDescriptor) aTextureDescriptorArray3442[argument_1_]).aBoolean832, aJs5Store_3440, this, 101, argument_0_));
    }
    
    private final DoublyLinkedNode_Sub51_Sub15 method2770(int argument_6_,
						 boolean argument_7_) {
	if (argument_7_ != true)
	    method12((byte) -124, 71, false, -0.7712839F, -126, -91);
	DoublyLinkedNode class59_DoublyLinked
	    = aClass165_3437.get((long) argument_6_, 110);
	if (class59_DoublyLinked != null)
	    return (DoublyLinkedNode_Sub51_Sub15) class59_DoublyLinked;
	byte[] anLocalInts = aJs5Store_3443.getFlatData(argument_6_);
	if (anLocalInts == null)
	    return null;
	DoublyLinkedNode_Sub51_Sub15 class59_sub51_sub15
	    = new DoublyLinkedNode_Sub51_Sub15(new Packet(anLocalInts));
	aClass165_3437.put(class59_sub51_sub15, 114, (long) argument_6_);
	return class59_sub51_sub15;
    }
    
    public final float[] method12(byte argument_8_, int argument_9_,
				  boolean argument_10_, float argument_11_,
				  int argument_12_, int argument_13_) {
	if (argument_8_ != -13)
	    anInt3439 = 91;
	return (method2770(argument_12_, true).method1272
		(((TextureDescriptor) aTextureDescriptorArray3442[argument_12_]).aBoolean832,
		 false, argument_9_, aJs5Store_3440, this, argument_13_));
    }
    
    public final int[] method13(int argument_14_, boolean argument_15_,
				int argument_16_, float argument_17_,
				int argument_18_, byte argument_19_) {
	if (argument_19_ >= -89)
	    aJs5Store_3440 = null;
	return (method2770(argument_18_, true).method1273
		(aJs5Store_3440, argument_16_, argument_15_,
		 (double) argument_17_, this,
		 ((TextureDescriptor) aTextureDescriptorArray3442[argument_18_]).aBoolean832,
		 argument_14_, false));
    }
    
    public final boolean method9(boolean argument_20_, int argument_21_) {
	DoublyLinkedNode_Sub51_Sub15 class59_sub51_sub15
	    = method2770(argument_21_, argument_20_);
	if (class59_sub51_sub15 == null
	    || !class59_sub51_sub15.method1271(this, aJs5Store_3440, (byte) 37))
	    return false;
	return true;
    }
    
    public final int method11(byte argument_22_) {
	int anLocalInt = 10 / ((-75 - argument_22_) / 50);
	return anInt3439;
    }
    
    Class174(Js5Store argument_23_, Js5Store argument_24_,
	     Js5Store argument_25_) {
	aJs5Store_3443 = argument_24_;
	aJs5Store_3440 = argument_25_;
	Packet class59_sub28
	    = new Packet(argument_23_.getData(0, 0));
	anInt3439 = class59_sub28.g2();
	aTextureDescriptorArray3442 = new TextureDescriptor[anInt3439];
	for (int anLocalInt = 0; anInt3439 > anLocalInt; anLocalInt++) {
	    if (class59_sub28.g1() == 1)
		aTextureDescriptorArray3442[anLocalInt] = new TextureDescriptor();
	}
	for (int anLocalInt = 0; anLocalInt < anInt3439; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aBoolean836
		    = class59_sub28.g1() == 0;
	}
	for (int anLocalInt = 0; anLocalInt < anInt3439; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).isHalfSize
		    = class59_sub28.g1() == 1;
	}
	for (int anLocalInt = 0; anLocalInt < anInt3439; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aBoolean843
		    = class59_sub28.g1() == 1;
	}
	for (int anLocalInt = 0; anInt3439 > anLocalInt; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aByte828
		    = class59_sub28.g1s();
	}
	for (int anLocalInt = 0; anInt3439 > anLocalInt; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aByte840
		    = class59_sub28.g1s();
	}
	for (int anLocalInt = 0; anInt3439 > anLocalInt; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aByte834
		    = class59_sub28.g1s();
	}
	for (int anLocalInt = 0; anInt3439 > anLocalInt; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aByte842
		    = class59_sub28.g1s();
	}
	for (int anLocalInt = 0; anInt3439 > anLocalInt; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aShort831
		    = (short) class59_sub28.g2();
	}
	for (int anLocalInt = 0; anInt3439 > anLocalInt; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aByte845
		    = class59_sub28.g1s();
	}
	for (int anLocalInt = 0; anLocalInt < anInt3439; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aByte849
		    = class59_sub28.g1s();
	}
	for (int anLocalInt = 0; anInt3439 > anLocalInt; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aBoolean833
		    = class59_sub28.g1() == 1;
	}
	for (int anLocalInt = 0; anLocalInt < anInt3439; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aBoolean832
		    = class59_sub28.g1() == 1;
	}
	for (int anLocalInt = 0; anInt3439 > anLocalInt; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aByte846
		    = class59_sub28.g1s();
	}
	for (int anLocalInt = 0; anLocalInt < anInt3439; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aBoolean848
		    = class59_sub28.g1() == 1;
	}
	for (int anLocalInt = 0; anLocalInt < anInt3439; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aBoolean841
		    = class59_sub28.g1() == 1;
	}
	for (int anLocalInt = 0; anInt3439 > anLocalInt; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).aBoolean850
		    = class59_sub28.g1() == 1;
	}
	for (int anLocalInt = 0; anInt3439 > anLocalInt; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).anInt835
		    = class59_sub28.g1();
	}
	for (int anLocalInt = 0; anInt3439 > anLocalInt; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).anInt847
		    = class59_sub28.g4();
	}
	for (int anLocalInt = 0; anInt3439 > anLocalInt; anLocalInt++) {
	    if (aTextureDescriptorArray3442[anLocalInt] != null)
		((TextureDescriptor) aTextureDescriptorArray3442[anLocalInt]).anInt830
		    = class59_sub28.g1();
	}
    }
    
    public final TextureDescriptor getDescriptor(int argument_26_, boolean argument_27_) {
	if (argument_27_ != true)
	    anInt3439 = -18;
	return aTextureDescriptorArray3442[argument_26_];
    }
}
