/* Class59_Sub51_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class DoublyLinkedNode_Sub51_Sub19 extends DoublyLinkedNode
{
    static CyclicLinkedList triggerQueue;
    static boolean[][] aBooleanArrayArray6353;
    static int anInt6354 = 0;
    int anInt6355;
    
    static final void method1294(byte argument, int argument_0_,
				 RsInterface argument_1_, int argument_2_) {
	if (Class353.aBoolean2953) {
	    Class315 class315 = (Class178.anInt1311 == -1 ? null
				 : Class62_Sub27.aClass362_4457
				       .method3960(true, Class178.anInt1311));
	    if (client.method122(argument_1_).method707(-119)
		&& (Node_Sub31_Sub4.anInt5855 & 0x20) != 0
		&& (class315 == null
		    || (argument_1_.method3211(((Class315) class315).anInt2607,
					       Class178.anInt1311, (byte) 82)
			!= ((Class315) class315).anInt2607)))
		Class173.method2769(false, AbstractFont.aString416, false,
				    ((RsInterface) argument_1_).anInt1870,
				    (Statics.aString6376 + " -> "
				     + ((RsInterface) argument_1_).aString1968),
				    (byte) 123, true,
				    ((RsInterface) argument_1_).subId, 8,
				    (long) ((((RsInterface) argument_1_).subId
					     << 0)
					    | (((RsInterface) argument_1_)
					       .idHash)),
				    ((RsInterface) argument_1_).idHash,
				    Class262.anInt2040, 0L);
	}
	for (int anLocalInt = 9; anLocalInt >= 5; anLocalInt--) {
	    String string
		= Statics.method283(true, argument_1_, anLocalInt);
	    if (string != null) {
		Node_Sub10.anInt3935++;
		Class173.method2769
		    (false, string, false, ((RsInterface) argument_1_).anInt1870,
		     ((RsInterface) argument_1_).aString1968, (byte) -123, true,
		     ((RsInterface) argument_1_).subId, 1001,
		     (long) (((RsInterface) argument_1_).subId << 0
			     | ((RsInterface) argument_1_).idHash),
		     ((RsInterface) argument_1_).idHash,
		     Class115.method2366(argument_1_, argument + 60,
					 anLocalInt),
		     (long) (anLocalInt + 1));
	    }
	}
	if (argument != -61)
	    aBooleanArrayArray6353 = null;
	String string = Class62_Sub9.method1391(argument_1_, (byte) -81);
	if (string != null)
	    Class173.method2769(false, string, false,
				((RsInterface) argument_1_).anInt1870,
				((RsInterface) argument_1_).aString1968,
				(byte) -86, true,
				((RsInterface) argument_1_).subId, 18,
				(long) (((RsInterface) argument_1_).idHash
					| (((RsInterface) argument_1_).subId
					   << 0)),
				((RsInterface) argument_1_).idHash,
				((RsInterface) argument_1_).anInt1948, 0L);
	for (int anLocalInt = 4; anLocalInt >= 0; anLocalInt--) {
	    String string_3_
		= Statics.method283(true, argument_1_, anLocalInt);
	    if (string_3_ != null) {
		Node_Sub10.anInt3935++;
		Class173.method2769
		    (false, string_3_, false,
		     ((RsInterface) argument_1_).anInt1870,
		     ((RsInterface) argument_1_).aString1968, (byte) -103, true,
		     ((RsInterface) argument_1_).subId, 30,
		     (long) (((RsInterface) argument_1_).subId << 0
			     | ((RsInterface) argument_1_).idHash),
		     ((RsInterface) argument_1_).idHash,
		     Class115.method2366(argument_1_, -1, anLocalInt),
		     (long) (anLocalInt + 1));
	    }
	}
	if (client.method122(argument_1_).method710((byte) -70)) {
	    if (((RsInterface) argument_1_).aString1890 != null)
		Class173.method2769
		    (false, ((RsInterface) argument_1_).aString1890, false,
		     ((RsInterface) argument_1_).anInt1870, "", (byte) 90, true,
		     ((RsInterface) argument_1_).subId, 19,
		     (long) (((RsInterface) argument_1_).idHash
			     | ((RsInterface) argument_1_).subId << 0),
		     ((RsInterface) argument_1_).idHash, -1, 0L);
	    else
		Class173.method2769
		    (false,
		     MultilanguageString.CONTINUE.getLocalizedString(
                     client.language),
		     false, ((RsInterface) argument_1_).anInt1870, "", (byte) -74,
		     true, ((RsInterface) argument_1_).subId, 19,
		     (long) (((RsInterface) argument_1_).idHash
			     | ((RsInterface) argument_1_).subId << 0),
		     ((RsInterface) argument_1_).idHash, -1, 0L);
	}
    }
    
    DoublyLinkedNode_Sub51_Sub19(int argument_4_) {
	((DoublyLinkedNode_Sub51_Sub19) this).anInt6355 = argument_4_;
    }
    
    static final void method1295(int argument) {
	ModeWhatEnum.anInt2310 = -1;
	Node_Sub1.anInt3868 = 0;
	Class62_Sub19.anInt4428 = -1;
	if (argument <= 95)
	    anInt6354 = -61;
	Class382.anInt3242 = -1;
    }
    
    abstract Object method1296(byte argument_5_);
    
    static final boolean method1297
	(int argument, int argument_6_, int argument_7_, int argument_8_,
	 int argument_9_, int argument_10_, int argument_11_, int argument_12_,
	 int argument_13_) {
	if (argument_10_ >= argument + argument_7_
	    || argument_7_ >= argument_12_ + argument_10_)
	    return false;
	if (argument_13_ >= argument_6_ + argument_9_
	    || argument_6_ >= argument_11_ + argument_13_)
	    return false;
	return true;
    }
    
    public static void method1298(int argument) {
	triggerQueue = null;
	aBooleanArrayArray6353 = null;
    }
    
    abstract boolean method1299(int argument_14_);
    
    static {
	aBooleanArrayArray6353
	    = new boolean[][] { new boolean[13],
				{ false, false, true, true, true, true, true,
				  false, false, false, false, false, true },
				{ true, true, true, true, true, true, false,
				  false, false, false, false, false, false },
				{ true, true, true, false, false, true, true,
				  true, false, false, false, false, false },
				{ true, false, false, false, false, true, true,
				  true, false, false, false, false, false },
				{ false, false, true, true, true, true, false,
				  false, false, false, false, false, false },
				{ false, true, true, true, true, true, false,
				  false, false, false, false, false, true },
				{ false, true, true, true, true, true, true,
				  true, false, false, false, false, true },
				{ true, true, false, false, false, false,
				  false, true, false, false, false, false,
				  false },
				{ true, true, true, true, true, false, false,
				  false, true, true, false, false, false },
				{ true, false, false, false, true, true, true,
				  true, true, true, false, false, false },
				{ true, false, true, true, true, true, true,
				  true, false, false, true, true, false },
				{ true, true, true, true, true, true, true,
				  true, true, true, true, true, true },
				new boolean[13],
				{ true, true, true, true, true, true, true,
				  true, true, true, true, true, true } };
	triggerQueue = new CyclicLinkedList();
    }
}
