/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class53
{
    static Class329 aClass329_394 = new Class329(5, 5);
    
    static final boolean method479(int argument, int argument_0_,
				   byte argument_1_) {
	if (!Class361.method3956(argument_0_, argument, true)
	    && !Node_Sub47_Sub11.method1140(argument_0_, 0, argument))
	    return false;
	return true;
    }
    
    static final void method480(int argument, int argument_2_,
				long argument_3_, int argument_4_) {
	int anLocalInt = (int) argument_3_ >> 14 & 0x1f;
	int anLocalInt_5_ = (int) argument_3_ >> 20 & 0x3;
	int anLocalInt_6_ = (int) (argument_3_ >>> 32) & 0x7fffffff;
	if (anLocalInt == 10 || anLocalInt == 11 || anLocalInt == 22) {
	    Class266 class266
		= Node_Sub31_Sub30.aClass257_5983.method3298((byte) 103,
								anLocalInt_6_);
	    int anLocalInt_7_;
	    int anLocalInt_8_;
	    if (anLocalInt_5_ == 0 || anLocalInt_5_ == 2) {
		anLocalInt_8_ = ((Class266) class266).anInt2131;
		anLocalInt_7_ = ((Class266) class266).anInt2128;
	    } else {
		anLocalInt_7_ = ((Class266) class266).anInt2131;
		anLocalInt_8_ = ((Class266) class266).anInt2128;
	    }
	    int anLocalInt_9_ = ((Class266) class266).anInt2075;
	    if (anLocalInt_5_ != 0)
		anLocalInt_9_ = ((anLocalInt_9_ << anLocalInt_5_ & 0xf)
				 + (anLocalInt_9_ >> -anLocalInt_5_ + 4));
	    Statics.method3357(anLocalInt_9_, anLocalInt_7_, 0, (byte) -26, argument_4_, argument_2_, anLocalInt_8_, 0, true);
	} else
	    Statics.method3357(0, 0, anLocalInt, (byte) -26, argument_4_, argument_2_, 0, anLocalInt_5_, true);
    }
    
    public static void method481(boolean argument) {
	aClass329_394 = null;
    }
    
    static final void method482(int argument) {
	Node_Sub13.anInt3978 = -1;
	Class353_Sub6.anInt5507 = 1;
	String string = null;
	if (Class201.aByteArray1448 != null) {
	    Packet class59_sub28
		= new Packet(Class201.aByteArray1448);
	    string = JagexStringEncoding.decode(class59_sub28.g8());
	    Class62_Sub19.aLong4427 = class59_sub28.g8();
	}
	if (string == null)
	    Node_Sub16.method698(35, argument + 19645);
	else if (argument == -19643)
	    Class62_Sub4.method1367("", false, 0, string, true);
    }
    
    static final boolean method483
	(int argument, int argument_10_, int argument_11_, int argument_12_,
	 int argument_13_, int argument_14_, int argument_15_) {
	int anLocalInt = argument_15_ + argument_12_;
	if (argument_13_ != -7515)
	    aClass329_394 = null;
	int anLocalInt_16_ = argument_10_ + argument;
	int anLocalInt_17_ = argument_14_ + argument_11_;
	if (!Class5.method221(anLocalInt_16_, argument_15_, anLocalInt_16_,
			      anLocalInt, argument_15_, argument_14_, 1,
			      anLocalInt_16_, anLocalInt_17_, anLocalInt_17_))
	    return false;
	if (!Class5.method221(anLocalInt_16_, anLocalInt, anLocalInt_16_,
			      anLocalInt, argument_15_, argument_14_, 1,
			      anLocalInt_16_, argument_14_, anLocalInt_17_))
	    return false;
	if (Class320.anInt2635 <= argument_15_) {
	    if (!Class5.method221(argument, anLocalInt, anLocalInt_16_,
				  anLocalInt, anLocalInt, anLocalInt_17_, 1,
				  anLocalInt_16_, argument_14_,
				  anLocalInt_17_))
		return false;
	    if (!Class5.method221(argument, anLocalInt, anLocalInt_16_,
				  anLocalInt, anLocalInt, anLocalInt_17_, 1,
				  argument, argument_14_, argument_14_))
		return false;
	} else {
	    if (!Class5.method221(argument, argument_15_, anLocalInt_16_,
				  argument_15_, argument_15_, anLocalInt_17_,
				  argument_13_ + 7516, anLocalInt_16_,
				  argument_14_, anLocalInt_17_))
		return false;
	    if (!Class5.method221(argument, argument_15_, anLocalInt_16_,
				  argument_15_, argument_15_, anLocalInt_17_,
				  1, argument, argument_14_, argument_14_))
		return false;
	}
	if (Class277.anInt2220 <= argument_14_) {
	    if (!Class5.method221(argument, argument_15_, anLocalInt_16_,
				  anLocalInt, argument_15_, anLocalInt_17_,
				  argument_13_ + 7516, anLocalInt_16_,
				  anLocalInt_17_, anLocalInt_17_))
		return false;
	    if (!Class5.method221(argument, anLocalInt, anLocalInt_16_,
				  anLocalInt, argument_15_, anLocalInt_17_, 1,
				  argument, anLocalInt_17_, anLocalInt_17_))
		return false;
	} else {
	    if (!Class5.method221(argument, argument_15_, anLocalInt_16_,
				  anLocalInt, argument_15_, argument_14_,
				  argument_13_ ^ ~0x1d5b, anLocalInt_16_,
				  argument_14_, argument_14_))
		return false;
	    if (!Class5.method221(argument, anLocalInt, anLocalInt_16_,
				  anLocalInt, argument_15_, argument_14_, 1,
				  argument, argument_14_, argument_14_))
		return false;
	}
	return true;
    }
}
