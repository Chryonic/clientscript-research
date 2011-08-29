/* Class62_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub3 extends Class62
{
    static Class368[] aClass368Array4370;
    static int anInt4372 = 0;
    static int[] anIntArray4373;
    static Class166 aClass166_4374 = new Class166(33, 0);
    static int anInt4375 = 0;
    static int[] anIntArray4376 = new int[3];
    static boolean aBoolean4377;
    
    final boolean method1357(int argument_0_) {
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -115))
	    return false;
	if (((Class62) this).aClass59_Sub50_440.method1161(false)
	    == GameEnum.RUNESCAPE)
	    return true;
	return false;
    }
    
    static final void method1358(GraphicsToolkit argument, RsInterface argument_1_,
				 boolean argument_2_) {
	boolean anLocalBoolean
	    = ((Class253_Sub1_Sub1.aClass365_6632.method3982
		(((RsInterface) argument_1_).anInt1857,
		 ((RsInterface) argument_1_).anInt1826, (byte) 16,
		 (((RsInterface) argument_1_).aBoolean1862
		  ? ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		     Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).aClass22_6854
		  : null),
		 ((RsInterface) argument_1_).anInt1823 | ~0xffffff,
		 ((RsInterface) argument_1_).anInt1925, argument,
		 ((RsInterface) argument_1_).anInt1870))
	       == null);
	if (anLocalBoolean) {
	    Class46_Sub2.aCyclicLinkedList_3838.add(new Node_Sub16(((RsInterface) argument_1_).anInt1870, ((RsInterface) argument_1_).anInt1925, ((RsInterface) argument_1_).anInt1826, (((RsInterface) argument_1_).anInt1823 | ~0xffffff), ((RsInterface) argument_1_).anInt1857, ((RsInterface) argument_1_).aBoolean1862));
	    Class256.method3280(argument_1_, true);
	}
    }
    
    Class62_Sub3(int argument_3_, Node_Sub50 argument_4_) {
	super(argument_3_, argument_4_);
    }
    
    static final void method1359(int argument) {
	Class62_Sub5.aClass149_4383.clear((byte) -3);
    }
    
    final void method1346(boolean argument_5_) {
	if (((Class62) this).aClass59_Sub50_440.method1161(argument_5_)
	    != GameEnum.RUNESCAPE)
	    ((Class62) this).anInt441 = 1;
	else if (((Class62) this).aClass59_Sub50_440.method1164((byte) -103))
	    ((Class62) this).anInt441 = 0;
	if (((Class62) this).anInt441 != 0 && ((Class62) this).anInt441 != 1)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    public static void method1360(int argument) {
	anIntArray4376 = null;
	aClass368Array4370 = null;
	anIntArray4373 = null;
	aClass166_4374 = null;
    }
    
    final int method1344(byte argument_6_) {
	if (argument_6_ != 4)
	    aBoolean4377 = false;
	return 1;
    }
    
    static final boolean method1361(int argument, char argument_7_) {
	if (Character.isISOControl(argument_7_))
	    return false;
	if (Class259.method3306(64, argument_7_))
	    return true;
	char[] anLocalChars = Class2_Sub1.aCharArray3761;
	for (int anLocalInt = 0; anLocalChars.length > anLocalInt;
	     anLocalInt++) {
	    char anLocalChar = anLocalChars[anLocalInt];
	    if (argument_7_ == anLocalChar)
		return true;
	}
	char[] anLocalChars_8_ = Class301.aCharArray2530;
	for (int anLocalInt = 0; anLocalInt < anLocalChars_8_.length;
	     anLocalInt++) {
	    char anLocalChar = anLocalChars_8_[anLocalInt];
	    if (argument_7_ == anLocalChar)
		return true;
	}
	return false;
    }
    
    static final void method1362(int argument, int argument_9_,
				 int argument_10_, int argument_11_,
				 int argument_12_, int argument_13_) {
	if (argument_10_ == -10602) {
	    if (argument_12_ == argument_9_)
		Class391.method4139(true, argument_9_, argument_13_, argument,
				    argument_11_);
	    else if (argument_11_ - argument_9_ >= Node_Sub35.anInt4156
		     && (argument_9_ + argument_11_
			 <= Node_Sub9_Sub2.anInt5776)
		     && Class209.anInt1504 <= -argument_12_ + argument
		     && (argument_12_ + argument
			 <= Node_Sub31_Sub13.anInt5896))
		Class2_Sub11.method215(argument_9_, (byte) -126, argument_13_,
				       argument_11_, argument, argument_12_);
	    else
		Class261.method3322(argument, argument_9_, -30, argument_12_,
				    argument_11_, argument_13_);
	}
    }
    
    static final void method1363(int argument) {
	Statics.aClass149_1252.method2540(argument ^ 0x71a7);
	Class371.aClass149_3191.method2540(-120);
	if (argument != -29152)
	    method1361(-109, '\004');
	Node_Sub44.aClass149_4250.method2540(13);
	Class214_Sub1.aClass149_5653.method2540(argument ^ 0x71a1);
    }
    
    Class62_Sub3(Node_Sub50 argument_14_) {
	super(argument_14_);
    }
    
    static final byte[] method1364(int argument, String argument_15_) {
	int anLocalInt = argument_15_.length();
	if (anLocalInt == 0)
	    return new byte[0];
	int anLocalInt_16_ = anLocalInt + 3 & ~0x3;
	int anLocalInt_17_ = anLocalInt_16_ / 4 * 3;
	if (anLocalInt_16_ - 2 < anLocalInt
	    && (AbstractFont.method493(argument_15_.charAt(anLocalInt_16_ - 2), -1)
		!= -1)) {
	    if (anLocalInt <= anLocalInt_16_ - 1
		|| AbstractFont.method493(argument_15_.charAt(anLocalInt_16_ - 1), -1) == -1)
		anLocalInt_17_--;
	} else
	    anLocalInt_17_ -= 2;
	byte[] anLocalInts = new byte[anLocalInt_17_];
	Class8.method236(argument_15_, (byte) 94, anLocalInts, 0);
	return anLocalInts;
    }
    
    final int method1365(int argument_18_) {
	return ((Class62) this).anInt441;
    }
    
    final void method1343(int argument_19_, byte argument_20_) {
	((Class62) this).anInt441 = argument_19_;
	if (argument_20_ != -107)
	    anIntArray4373 = null;
    }
    
    final int method1342(int argument_21_, byte argument_22_) {
	int anLocalInt = 4 / ((-53 - argument_22_) / 50);
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -107))
	    return 3;
	if (((Class62) this).aClass59_Sub50_440.method1161(false)
	    == GameEnum.RUNESCAPE) {
	    if (argument_21_ == 0) {
		if (((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
			.aClass62_Sub13_4329.method1405(63)
		    == 1)
		    return 2;
		if (((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
			.aClass62_Sub19_4323.method1432(55)
		    == 1)
		    return 2;
		if (((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
			.aClass62_Sub20_4334.method1435(95)
		    > 0)
		    return 2;
	    }
	    return 1;
	}
	return 3;
    }
    
    static {
    }
}
