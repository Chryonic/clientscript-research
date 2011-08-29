/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class215
{
    private Js5Store aJs5Store_1516;
    private JagexHashMap aJagexHashMap_1517 = new JagexHashMap(256);
    static int[] anIntArray1518 = new int[120];
    private Js5Store aJs5Store_1519;
    private JagexHashMap aJagexHashMap_1520 = new JagexHashMap(256);
    static Class166 aClass166_1521;
    static int[] anIntArray1522;
    
    private final Node_Sub40_Sub1 method2990
	(int argument_0_, int argument_1_, int argument_2_,
	 int[] argument_3_) {
	int anLocalInt
	    = argument_1_ ^ (argument_0_ << 4 & 0xfff9 | argument_0_ >>> 12);
	anLocalInt |= argument_0_ << 16;
	long l = (long) anLocalInt ^ 0x100000000L;
	Node_Sub40_Sub1 class59_sub40_sub1
	    = (Node_Sub40_Sub1) aJagexHashMap_1520.get(l);
	if (class59_sub40_sub1 != null)
	    return class59_sub40_sub1;
	if (argument_3_ != null && argument_3_[0] <= 0)
	    return null;
	Node_Sub25 class59_sub25
	    = (Node_Sub25) aJagexHashMap_1517.get(l);
	if (class59_sub25 == null) {
	    class59_sub25 = Node_Sub25.method756(aJs5Store_1516, argument_0_,
                argument_1_);
	    if (class59_sub25 == null)
		return null;
	    aJagexHashMap_1517.put(l, class59_sub25);
	}
	class59_sub40_sub1 = class59_sub25.method758(argument_3_);
	if (class59_sub40_sub1 == null)
	    return null;
	class59_sub25.unlink();
	aJagexHashMap_1520.put(l, class59_sub40_sub1);
	if (argument_2_ != -4385)
	    return null;
	return class59_sub40_sub1;
    }
    
    static final void method2991(byte argument, boolean argument_4_,
				 int argument_5_) {
	Node_Sub30.method860(-3,
            MultilanguageString.LOADING_PLEASE_WAIT
                    .getLocalizedString(client.language),
            argument_4_, argument_5_);
    }
    
    public static void method2992(int argument) {
	aClass166_1521 = null;
	anIntArray1522 = null;
	anIntArray1518 = null;
    }
    
    final Node_Sub40_Sub1 method2993(int[] argument_6_, int argument_7_,
					byte argument_8_) {
	if (aJs5Store_1516.getRealSubFileCount() == 1)
	    return method2990(0, argument_7_, argument_8_ - 4432, argument_6_);
	if (argument_8_ != 47)
	    return null;
	if (aJs5Store_1516.getSubFileCount(argument_7_) == 1)
	    return method2990(argument_7_, 0, -4385, argument_6_);
	throw new RuntimeException();
    }
    
    private final Node_Sub40_Sub1 method2994
	(int argument_9_, byte argument_10_, int argument_11_,
	 int[] argument_12_) {
	int anLocalInt
	    = (argument_9_ >>> 12 | argument_9_ << 4 & 0xfff3) ^ argument_11_;
	anLocalInt |= argument_9_ << 16;
	long l = (long) anLocalInt;
	Node_Sub40_Sub1 class59_sub40_sub1
	    = (Node_Sub40_Sub1) aJagexHashMap_1520.get(l);
	if (class59_sub40_sub1 != null)
	    return class59_sub40_sub1;
	if (argument_12_ != null && argument_12_[0] <= 0)
	    return null;
	Class198 class198
	    = Class198.method2906(aJs5Store_1519, argument_9_, argument_11_);
	if (class198 == null)
	    return null;
	class59_sub40_sub1 = class198.method2909();
	if (argument_10_ > -107)
	    return null;
	aJagexHashMap_1520.put(l, class59_sub40_sub1);
	if (argument_12_ != null)
	    argument_12_[0] -= (((Node_Sub40_Sub1) class59_sub40_sub1)
				.aByteArray6136).length;
	return class59_sub40_sub1;
    }
    
    final Node_Sub40_Sub1 method2995(byte argument_13_, int[] argument_14_,
					int argument_15_) {
	if (aJs5Store_1519.getRealSubFileCount() == 1)
	    return method2994(0, (byte) -123, argument_15_, argument_14_);
	if (aJs5Store_1519.getSubFileCount(argument_15_) == 1)
	    return method2994(argument_15_, (byte) -113, 0, argument_14_);
	throw new RuntimeException();
    }
    
    Class215(Js5Store argument_16_, Js5Store argument_17_) {
	aJs5Store_1519 = argument_16_;
	aJs5Store_1516 = argument_17_;
    }
    
    static {
	int anLocalInt = 0;
	for (int anLocalInt_18_ = 0; anLocalInt_18_ < 120; anLocalInt_18_++) {
	    int anLocalInt_19_ = anLocalInt_18_ + 1;
	    int anLocalInt_20_
		= (int) (Math.pow(2.0, (double) anLocalInt_19_ / 7.0) * 300.0
			 + (double) anLocalInt_19_);
	    anLocalInt += anLocalInt_20_;
	    anIntArray1518[anLocalInt_18_] = anLocalInt / 4;
	}
	aClass166_1521 = new Class166(117, 5);
	anIntArray1522 = null;
    }
}
