/* Class220 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class220
{
    private Js5Store aJs5Store_1550;
    private Class149 aClass149_1551 = new Class149(128);
    
    static final int method3027(byte argument, int argument_0_,
				int argument_1_) {
	int anLocalInt
	    = (Class_s_Sub1.method3547(57, argument_1_ - 1, argument_0_ - 1)
	       + Class_s_Sub1.method3547(57, argument_1_ - 1, argument_0_ + 1)
	       - (-Class_s_Sub1.method3547(57, argument_1_ + 1,
					   argument_0_ - 1)
		  - Class_s_Sub1.method3547(57, argument_1_ + 1,
					    argument_0_ + 1)));
	int anLocalInt_2_
	    = (Class_s_Sub1.method3547(57, argument_1_, argument_0_ - 1)
	       + (Class_s_Sub1.method3547(57, argument_1_, argument_0_ + 1)
		  + Class_s_Sub1.method3547(57, argument_1_ - 1, argument_0_))
	       + Class_s_Sub1.method3547(57, argument_1_ + 1, argument_0_));
	int anLocalInt_3_
	    = Class_s_Sub1.method3547(57, argument_1_, argument_0_);
	return anLocalInt / 16 + anLocalInt_2_ / 8 + anLocalInt_3_ / 4;
    }
    
    final Class323 method3028(byte argument_4_, int argument_5_) {
	Class323 class323;
	synchronized (aClass149_1551) {
	    class323
		= (Class323) aClass149_1551.get((long) argument_5_);
	}
	if (class323 != null)
	    return class323;
	byte[] anLocalInts
	    = aJs5Store_1550.getData(Class35.method379(argument_5_, true), DoublyLinkedNodeP2_Sub8.method1939(255, argument_5_));
	class323 = new Class323();
	if (anLocalInts != null)
	    class323.method3671((byte) 103, new Packet(anLocalInts));
	synchronized (aClass149_1551) {
	    aClass149_1551.put(class323, (long) argument_5_);
	}
	return class323;
    }
    
    Class220(GameEnum argument_6_, int argument_7_, Js5Store argument_8_) {
	aJs5Store_1550 = argument_8_;
	if (aJs5Store_1550 != null) {
	    int anLocalInt = aJs5Store_1550.getRealSubFileCount() - 1;
	    aJs5Store_1550.getSubFileCount(anLocalInt);
	}
    }
}
