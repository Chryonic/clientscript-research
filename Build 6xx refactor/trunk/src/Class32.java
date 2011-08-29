/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class32
{
    String aString210;
    String aString211;
    String aString212;
    static int anInt213;
    static int anInt214;
    static int anInt215 = 0;
    
    static final void method366(byte argument) {
	AbstractMouseMessage class59_sub46
	    = (AbstractMouseMessage) Class376.aCyclicLinkedList_3214.getFirst();
	boolean anLocalBoolean
	    = dba_sub_772.aRsInterface_4345 != null || Class123.anInt1002 > 0;
	int anLocalInt = class59_sub46.getX();
	int anLocalInt_0_ = class59_sub46.getY();
	if (anLocalBoolean)
	    Node_Sub31_Sub27.anInt5961 = 1;
	if (!anLocalBoolean)
	    Class133.method2445(Class84.aClass59_Sub51_Sub9_601, anLocalInt_0_,
				123, anLocalInt);
	else
	    Node_Sub32_Sub4.aClass59_Sub51_Sub9_6087
		= Class84.aClass59_Sub51_Sub9_601;
    }
    
    static final int method367(int argument, byte argument_1_) {
	return argument & 0xff;
    }
    
    Class32(String argument_2_, String argument_3_, String argument_4_) {
	((Class32) this).aString211 = argument_4_;
	((Class32) this).aString212 = argument_3_;
	((Class32) this).aString210 = argument_2_;
    }
    
    static {
	anInt214 = 1400;
    }
}
