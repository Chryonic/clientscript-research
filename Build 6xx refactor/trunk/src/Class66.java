/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class66
{
    static Class329 aClass329_463;
    private Js5Store aJs5Store_464;
    int anInt465 = 0;
    private Js5Store aJs5Store_466;
    static volatile int anInt467 = -1;
    private Class149 aClass149_468;
    int anInt469 = 0;
    private Interface12 anInterface12_470;
    
    final String method1492(int[] argument_0_, byte argument_1_,
			    Class217 argument_2_, long argument_3_) {
	if (anInterface12_470 != null) {
	    String string
		= anInterface12_470.method54(argument_0_, 110, argument_3_,
					     argument_2_);
	    if (string != null)
		return string;
	}
	return Long.toString(argument_3_);
    }
    
    public static void method1493(int argument) {
	aClass329_463 = null;
    }
    
    static final void method1494
	(int argument, byte[] argument_4_, int argument_5_, int argument_6_,
	 int argument_7_, int argument_8_, int argument_9_, int argument_10_,
	 byte[] argument_11_) {
	int anLocalInt = -(argument_10_ >> 2);
	argument_10_ = -(argument_10_ & 0x3);
	for (int anLocalInt_12_ = -argument_8_; anLocalInt_12_ < 0;
	     anLocalInt_12_++) {
	    for (int anLocalInt_13_ = anLocalInt; anLocalInt_13_ < 0;
		 anLocalInt_13_++) {
		argument_11_[argument_7_++] -= argument_4_[argument_9_++];
		argument_11_[argument_7_++] -= argument_4_[argument_9_++];
		argument_11_[argument_7_++] -= argument_4_[argument_9_++];
		argument_11_[argument_7_++] -= argument_4_[argument_9_++];
	    }
	    for (int anLocalInt_14_ = argument_10_; anLocalInt_14_ < 0;
		 anLocalInt_14_++)
		argument_11_[argument_7_++] -= argument_4_[argument_9_++];
	    argument_7_ += argument_5_;
	    argument_9_ += argument_6_;
	}
    }
    
    static final Class110 method1495(DoublyLinkedNodeP2_Sub2_Sub2 argument,
				     int argument_15_) {
	Class110 class110;
	if (Class245_Sub1_Sub2.aClass110_6519 == null)
	    class110 = new Class110();
	else {
	    class110 = Class245_Sub1_Sub2.aClass110_6519;
	    Class245_Sub1_Sub2.aClass110_6519
		= ((Class110) Class245_Sub1_Sub2.aClass110_6519).aClass110_912;
	    Class2_Sub6.anInt3789--;
	    ((Class110) class110).aClass110_912 = null;
	}
	((Class110) class110).aClass104_Sub2_Sub2_911 = argument;
	return class110;
    }
    
    final DoublyLinkedNode_Sub51_Sub16 method1496(int argument_16_, int argument_17_) {
	DoublyLinkedNode_Sub51_Sub16 class59_sub51_sub16
	    = ((DoublyLinkedNode_Sub51_Sub16)
	       aClass149_468.get((long) argument_16_));
	if (class59_sub51_sub16 != null)
	    return class59_sub51_sub16;
	byte[] anLocalInts;
	if (argument_16_ < 32768)
	    anLocalInts = aJs5Store_466.getData(1, argument_16_);
	else
	    anLocalInts = aJs5Store_464.getData(1, argument_16_ & 0x7fff);
	class59_sub51_sub16 = new DoublyLinkedNode_Sub51_Sub16();
	((DoublyLinkedNode_Sub51_Sub16) class59_sub51_sub16).aClass66_6321 = this;
	if (anLocalInts != null)
	    class59_sub51_sub16.method1282(new Packet(anLocalInts), 0);
	if (argument_16_ >= 32768)
	    class59_sub51_sub16.method1275(104);
	aClass149_468.put(class59_sub51_sub16, (long) argument_16_);
	if (argument_17_ != 17408)
	    method1494(-35, null, 23, 19, 45, -121, 125, -127, null);
	return class59_sub51_sub16;
    }
    
    Class66(int argument_18_, Js5Store argument_19_, Js5Store argument_20_,
	    Interface12 argument_21_) {
	aClass149_468 = new Class149(64);
	anInterface12_470 = null;
	aJs5Store_464 = argument_20_;
	aJs5Store_466 = argument_19_;
	anInterface12_470 = argument_21_;
	if (aJs5Store_466 != null)
	    ((Class66) this).anInt465 = aJs5Store_466.getSubFileCount(1);
	if (aJs5Store_464 != null)
	    ((Class66) this).anInt469 = aJs5Store_464.getSubFileCount(1);
    }
    
    static {
	aClass329_463 = new Class329(1, -1);
    }
}
