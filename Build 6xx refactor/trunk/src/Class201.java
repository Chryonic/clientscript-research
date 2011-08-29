/* Class201 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class201
{
    static byte[] aByteArray1448 = null;
    static int anInt1449;
    
    static final String method2915(boolean argument, int argument_0_,
				   Packet argument_1_) {
	try {
	    int anLocalInt = argument_1_.gsmart(-2);
	    if (anLocalInt > argument_0_)
		anLocalInt = argument_0_;
	    byte[] anLocalInts = new byte[anLocalInt];
	    ((Packet) argument_1_).pos
		+= (Class46_Sub1_Sub1.aClass233_5737.method3096
		    (anLocalInt, 107, 0,
		     ((Packet) argument_1_).pos, anLocalInts,
		     ((Packet) argument_1_).data));
	    String string
		= Class239.method3127(anLocalInts, 1958, 0, anLocalInt);
	    return string;
	} catch (Exception exception) {
	    return "Cabbage";
	}
    }
    
    static final void method2916(Object[] argument, int argument_2_,
				 int argument_3_, long[] argument_4_,
				 int argument_5_) {
	if (argument_3_ < argument_2_) {
	    int anLocalInt = (argument_2_ + argument_3_) / 2;
	    int anLocalInt_6_ = argument_3_;
	    long l = argument_4_[anLocalInt];
	    argument_4_[anLocalInt] = argument_4_[argument_2_];
	    argument_4_[argument_2_] = l;
	    Object object = argument[anLocalInt];
	    argument[anLocalInt] = argument[argument_2_];
	    argument[argument_2_] = object;
	    int anLocalInt_7_ = l == 9223372036854775807L ? 0 : 1;
	    for (int anLocalInt_8_ = argument_3_; argument_2_ > anLocalInt_8_;
		 anLocalInt_8_++) {
		if ((long) (anLocalInt_7_ & anLocalInt_8_) + l
		    > argument_4_[anLocalInt_8_]) {
		    long l_9_ = argument_4_[anLocalInt_8_];
		    argument_4_[anLocalInt_8_] = argument_4_[anLocalInt_6_];
		    argument_4_[anLocalInt_6_] = l_9_;
		    Object object_10_ = argument[anLocalInt_8_];
		    argument[anLocalInt_8_] = argument[anLocalInt_6_];
		    argument[anLocalInt_6_++] = object_10_;
		}
	    }
	    argument_4_[argument_2_] = argument_4_[anLocalInt_6_];
	    argument_4_[anLocalInt_6_] = l;
	    argument[argument_2_] = argument[anLocalInt_6_];
	    argument[anLocalInt_6_] = object;
	    method2916(argument, anLocalInt_6_ - 1, argument_3_, argument_4_,
		       0);
	    method2916(argument, argument_2_, anLocalInt_6_ + 1, argument_4_,
		       0);
	}
    }
    
    static final void method2917(byte argument) {
	Class350_Sub2.aClass149_5436.method2540(107);
    }
    
    public static void method2918(int argument) {
	aByteArray1448 = null;
    }
    
    static final void method2919(byte argument, int argument_11_) {
	Node_Sub13.anInt3978 = argument_11_;
	Class353_Sub6.anInt5507 = 2;
	Class62_Sub4.method1367("", Node_Sub31_Sub1.aString5837.equals(""),
				0, Node_Sub31_Sub1.aString5837, true);
    }
}
