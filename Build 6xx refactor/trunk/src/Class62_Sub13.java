/* Class62_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub13 extends Class62
{
    static Class207 aClass207_4404 = new Class207(16, 3);
    static int anInt4406 = 0;
    static Class166 aClass166_4407;
    
    Class62_Sub13(Node_Sub50 argument_0_) {
	super(argument_0_);
    }
    
    public static void method1404(int argument) {
	aClass207_4404 = null;
	TestingStageEnum.WTWIP = null;
	aClass166_4407 = null;
	CombineModeEnum.SUBTRACT = null;
    }
    
    final int method1342(int argument_1_, byte argument_2_) {
	int anLocalInt = 61 / ((-53 - argument_2_) / 50);
	if (argument_1_ == 0
	    || ((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
		   .aClass62_Sub3_4318.method1365(70) == 1)
	    return 1;
	return 2;
    }
    
    final int method1344(byte argument_3_) {
	if (argument_3_ != 4)
	    return -9;
	return 1;
    }
    
    final void method1346(boolean argument_4_) {
	if (((Class62) this).anInt441 != 0
	    && ((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
		   .aClass62_Sub3_4318.method1365(62) != 1)
	    ((Class62) this).anInt441 = 0;
	if (argument_4_)
	    method1346(false);
	if (((Class62) this).anInt441 < 0 || ((Class62) this).anInt441 > 1)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    final void method1343(int argument_5_, byte argument_6_) {
	((Class62) this).anInt441 = argument_5_;
	if (argument_6_ != -107)
	    aClass207_4404 = null;
    }
    
    final int method1405(int argument_7_) {
	return ((Class62) this).anInt441;
    }
    
    final boolean method1406(int argument_8_) {
	return true;
    }
    
    static final String method1407(String argument, int argument_9_) {
	StringBuffer stringbuffer = new StringBuffer();
	int anLocalInt = argument.length();
	for (int anLocalInt_10_ = 0; anLocalInt_10_ < anLocalInt;
	     anLocalInt_10_++) {
	    char anLocalChar = argument.charAt(anLocalInt_10_);
	    if (anLocalChar != 37 || anLocalInt_10_ + 2 >= anLocalInt) {
		if (anLocalChar != 43)
		    stringbuffer.append(anLocalChar);
		else
		    stringbuffer.append(' ');
	    } else {
		anLocalChar = argument.charAt(anLocalInt_10_ + 1);
		boolean anLocalBoolean = false;
		int anLocalInt_11_;
		if (anLocalChar < 48 || anLocalChar > 57) {
		    if (anLocalChar < 97 || anLocalChar > 102) {
			if (anLocalChar < 65 || anLocalChar > 70) {
			    stringbuffer.append('%');
			    continue;
			}
			anLocalInt_11_ = anLocalChar - 65 + 10;
		    } else
			anLocalInt_11_ = anLocalChar + 10 - 97;
		} else
		    anLocalInt_11_ = anLocalChar - 48;
		int anLocalInt_12_ = argument.charAt(anLocalInt_10_ + 2);
		anLocalInt_11_ *= 16;
		if (anLocalInt_12_ >= 48 && anLocalInt_12_ <= 57)
		    anLocalInt_11_ += anLocalInt_12_ - 48;
		else if (anLocalInt_12_ < 97 || anLocalInt_12_ > 102) {
		    if (anLocalInt_12_ < 65 || anLocalInt_12_ > 70) {
			stringbuffer.append('%');
			continue;
		    }
		    anLocalInt_11_ += anLocalInt_12_ - 65 + 10;
		} else
		    anLocalInt_11_ += anLocalInt_12_ - 87;
		if (anLocalInt_11_ != 0
		    && Statics.method3366((byte) anLocalInt_11_, -1))
		    stringbuffer.append
			(JagexStringUtils.parseCharacter((byte) anLocalInt_11_));
		anLocalInt_10_ += 2;
	    }
	}
	return stringbuffer.toString();
    }
    
    Class62_Sub13(int argument_13_, Node_Sub50 argument_14_) {
	super(argument_13_, argument_14_);
    }
    
    static {
	aClass166_4407 = new Class166(65, 9);
    }
}
