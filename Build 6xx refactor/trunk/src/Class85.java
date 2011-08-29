/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class85
{
    static DoublyLinkedNode_Sub51_Sub6[] aClass59_Sub51_Sub6Array603;
    static int anInt604;
    static String aString605 = "";
    static Class207 aClass207_606;
    static int anInt607;
    
    public final String toString() {
	throw new IllegalStateException();
    }
    
    static final void method1624
	(int argument, int argument_0_, int argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_, int argument_6_,
	 int argument_7_) {
	if (!RsInterface.isAvailable(argument_4_)) {
	    if (argument_3_ != -1)
		Class109_Sub1.aBooleanArray4604[argument_3_] = true;
	    else {
		for (int anLocalInt = 0; anLocalInt < 100; anLocalInt++)
		    Class109_Sub1.aBooleanArray4604[anLocalInt] = true;
	    }
	} else {
	    int anLocalInt = 0;
	    int anLocalInt_8_ = 0;
	    int anLocalInt_9_ = 0;
	    int anLocalInt_10_ = argument_2_;
	    int anLocalInt_11_ = 0;
	    if (Class52.aBoolean391) {
		anLocalInt_11_ = Node_Sub47_Sub12.anInt6215;
		anLocalInt_9_ = Class245_Sub2_Sub2.anInt6524;
		anLocalInt_8_ = Class317.anInt2624;
		anLocalInt = Class165.anInt1204;
		anLocalInt_10_ = Class323.anInt2669;
		Node_Sub47_Sub12.anInt6215 = 1;
	    }
	    if (Packet.aRsInterfaceArrayArray4123[argument_4_] == null)
		Node_Sub8.method570(argument, argument_3_ < 0, argument_6_,
                argument_0_, argument_2_ ^ 0x7800,
                argument_1_, -1, argument_7_,
                argument_5_, argument_3_,
                (RsInterface.anInterfaces
                        [argument_4_]));
	    else
		Node_Sub8.method570(argument, argument_3_ < 0, argument_6_,
                argument_0_, argument_2_ + 30720,
                argument_1_, -1, argument_7_,
                argument_5_, argument_3_,
                (Packet.aRsInterfaceArrayArray4123
                        [argument_4_]));
	    if (Class52.aBoolean391) {
		if (argument_3_ >= 0 && Node_Sub47_Sub12.anInt6215 == 2)
		    Canvas_Sub1.method125(Class245_Sub2_Sub2.anInt6524,
					  (byte) -102, Class323.anInt2669,
					  Class317.anInt2624,
					  Class165.anInt1204);
		Class323.anInt2669 = anLocalInt_10_;
		Class317.anInt2624 = anLocalInt_8_;
		Class245_Sub2_Sub2.anInt6524 = anLocalInt_9_;
		Node_Sub47_Sub12.anInt6215 = anLocalInt_11_;
		Class165.anInt1204 = anLocalInt;
	    }
	}
    }
    
    public static void method1625(boolean argument) {
	aString605 = null;
	aClass59_Sub51_Sub6Array603 = null;
	aClass207_606 = null;
    }
    
    public Class85() {
	/* empty */
    }
    
    static {
	aClass59_Sub51_Sub6Array603 = new DoublyLinkedNode_Sub51_Sub6[14];
	aClass207_606 = new Class207(44, 3);
    }
}
