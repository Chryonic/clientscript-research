/* Class253_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class253_Sub3 extends Class253
{
    int anInt5673;
    static Class217 aClass217_5674;
    static int anInt5675 = 0;
    int anInt5676;
    static Class81 aClass81_5677;
    static DoublyLinkedNodeP2_Sub4_Sub1_Sub1[] aClass104_Sub4_Sub1_Sub1Array5678;
    
    public static void method3252(int argument) {
	aClass217_5674 = null;
	aClass81_5677 = null;
	aClass104_Sub4_Sub1_Sub1Array5678 = null;
    }
    
    static final Class10 method3253(Packet argument, int argument_0_) {
	int anLocalInt = argument.g4();
	return new Class10(anLocalInt);
    }
    
    Class253_Sub3(Class349 argument_1_, Class44 argument_2_, int argument_3_,
		  int argument_4_, int argument_5_, int argument_6_,
		  int argument_7_, int argument_8_, int argument_9_,
		  int argument_10_, int argument_11_, int argument_12_) {
	super(argument_1_, argument_2_, argument_3_, argument_4_, argument_5_,
	      argument_6_, argument_7_, argument_8_, argument_9_);
	((Class253_Sub3) this).anInt5676 = argument_11_;
	((Class253_Sub3) this).anInt5673 = argument_12_;
    }
    
    static final Class75 method3254(boolean argument) {
	try {
	    return (Class75) Class.forName("Class75_Sub1").newInstance();
	} catch (Throwable throwable) {
	    return new Class75_Sub2();
	}
    }
    
    public final Class128 method68(byte argument_13_) {
	if (argument_13_ > -35)
	    anInt5675 = 46;
	return Class_aa_Sub1.aClass128_3747;
    }
    
    static {
	aClass217_5674 = new Class217(9, 0, 4, 1);
	aClass81_5677 = new Class81();
    }
}
