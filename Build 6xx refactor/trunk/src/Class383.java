/* Class383 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class383
{
    static boolean aBoolean3243;
    private Js5Store aJs5Store_3244;
    private Class149 aClass149_3245 = new Class149(64);
    Js5Store aJs5Store_3246;
    
    static final boolean method4109(int argument, int argument_0_) {
	for (MenuAction class59_sub51_sub9
		 = ((MenuAction)
		    DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404.getFirst());
	     class59_sub51_sub9 != null;
	     class59_sub51_sub9
		 = ((MenuAction)
		    DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404.getNext())) {
	    if (Statics.method3411((((MenuAction) class59_sub51_sub9).action), -13)
		&& (((MenuAction) class59_sub51_sub9).parameter1
		    == (long) argument))
		return true;
	}
	return false;
    }
    
    final void method4110(byte argument_1_, int argument_2_) {
	synchronized (aClass149_3245) {
	    aClass149_3245.method2534(argument_2_, (byte) -8);
	}
    }
    
    static final int method4111(int argument, int argument_3_,
				byte argument_4_) {
	argument = (argument_3_ & 0x7f) * argument >> 7;
	if (argument >= 2) {
	    if (argument > 126)
		argument = 126;
	} else
	    argument = 2;
	return (argument_3_ & 0xff80) + argument;
    }
    
    static final Class156 method4112(Packet argument, int argument_5_) {
	String string = argument.gstr();
	if (argument_5_ != 65408)
	    method4109(-56, -50);
	Class349 class349 = (JagexHashMap.method1522()
			     [argument.g1()]);
	Class44 class44
	    = Class225.method3051(-1)[argument.g1()];
	int anLocalInt = argument.g2s();
	int anLocalInt_6_ = argument.g2s();
	int anLocalInt_7_ = argument.g1();
	int anLocalInt_8_ = argument.g1();
	int anLocalInt_9_ = argument.g1();
	int anLocalInt_10_ = argument.g2();
	int anLocalInt_11_ = argument.g2();
	int anLocalInt_12_ = argument.g4();
	int anLocalInt_13_ = argument.g4();
	int anLocalInt_14_ = argument.g4();
	return new Class156(string, class349, class44, anLocalInt,
			    anLocalInt_6_, anLocalInt_7_, anLocalInt_8_,
			    anLocalInt_9_, anLocalInt_10_, anLocalInt_11_,
			    anLocalInt_12_, anLocalInt_13_, anLocalInt_14_);
    }
    
    final void method4113(int argument_15_) {
	synchronized (aClass149_3245) {
	    aClass149_3245.method2540(-120);
	}
    }
    
    final Class99 method4114(int argument_16_, int argument_17_) {
	Class99 class99;
	synchronized (aClass149_3245) {
	    class99 = (Class99) aClass149_3245.get((long) argument_16_);
	}
	if (class99 != null)
	    return class99;
	byte[] anLocalInts;
	synchronized (aJs5Store_3244) {
	    anLocalInts
		= aJs5Store_3244.getData(3, argument_16_);
	}
	class99 = new Class99();
	((Class99) class99).aClass383_776 = this;
	if (anLocalInts != null)
	    class99.method1721(new Packet(anLocalInts), 0);
	synchronized (aClass149_3245) {
	    aClass149_3245.put(class99, (long) argument_16_);
	}
	if (argument_17_ != 2)
	    aJs5Store_3244 = null;
	return class99;
    }
    
    static final void method4115(boolean argument) {
	Class99.anInt777 = (((Class76) Class37.aClass76_274).anInt520
			    + ((Class76) Class37.aClass76_274).anInt518 + 2);
	Class340.anInt2868 = (((Class76) Statics.aClass76_3433).anInt520 + 2
			      + ((Class76) Statics.aClass76_3433).anInt518);
	Class342.aStringArray2885 = new String[500];
	for (int anLocalInt = 0; anLocalInt < Class342.aStringArray2885.length;
	     anLocalInt++)
	    Class342.aStringArray2885[anLocalInt] = "";
	Statics.method2425((byte) -107, MultilanguageString.DEV_CONSOLE_WELCOME.getLocalizedString(client.language));
    }
    
    final void method4116(int argument_18_) {
	synchronized (aClass149_3245) {
	    aClass149_3245.clear((byte) -3);
	}
    }
    
    Class383(GameEnum argument_19_, int argument_20_, Js5Store argument_21_,
	     Js5Store argument_22_) {
	aJs5Store_3244 = argument_21_;
	((Class383) this).aJs5Store_3246 = argument_22_;
	aJs5Store_3244.getSubFileCount(3);
    }
}
