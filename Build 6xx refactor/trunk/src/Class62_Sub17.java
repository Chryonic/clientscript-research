/* Class62_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub17 extends Class62
{
    static int anInt4420;

    final int method1422(int argument_0_) {
	return ((Class62) this).anInt441;
    }
    
    final int method1342(int argument_1_, byte argument_2_) {
	int anLocalInt = -50 % ((argument_2_ + 53) / 50);
	return 1;
    }
    
    static final void method1423(int argument, int argument_3_,
				 boolean argument_4_, Class266 argument_5_,
				 int argument_6_) {
	for (Node_Sub13 class59_sub13
		 = ((Node_Sub13)
		    Class76.aCyclicLinkedList_519.getFirst());
	     class59_sub13 != null;
	     class59_sub13
		 = (Node_Sub13) Class76.aCyclicLinkedList_519.getNext()) {
	    if (argument == ((Node_Sub13) class59_sub13).anInt3973
		&& (argument_3_ << 9
		    == ((Node_Sub13) class59_sub13).anInt3981)
		&& (argument_6_ << 9
		    == ((Node_Sub13) class59_sub13).anInt3969)
		&& (((Class266) ((Node_Sub13) class59_sub13).aClass266_3951)
		    .anInt2059) == ((Class266) argument_5_).anInt2059) {
		if (((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3968
		    != null) {
		    Class353_Sub2.aClass59_Sub9_Sub3_5483.method626
			(((Node_Sub13) class59_sub13)
			 .aClass59_Sub9_Sub4_3968);
		    ((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3968
			= null;
		}
		if (((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3971
		    != null) {
		    Class353_Sub2.aClass59_Sub9_Sub3_5483.method626
			(((Node_Sub13) class59_sub13)
			 .aClass59_Sub9_Sub4_3971);
		    ((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3971
			= null;
		}
		class59_sub13.unlink();
		break;
	    }
	}
    }
    
    final void method1343(int argument_7_, byte argument_8_) {
	((Class62) this).anInt441 = argument_7_;
	if (argument_8_ != -107)
	    anInt4420 = -23;
    }
    
    Class62_Sub17(int argument_9_, Node_Sub50 argument_10_) {
	super(argument_9_, argument_10_);
    }
    
    static final boolean method1424(int argument, int argument_11_,
				    boolean argument_12_) {
	if ((argument & 0x8000) == 0)
	    return false;
	return true;
    }
    
    Class62_Sub17(Node_Sub50 argument_13_) {
	super(argument_13_);
    }
    
    final void method1346(boolean argument_14_) {
	if (!argument_14_) {
	    if (((Class62) this).anInt441 < 0 && ((Class62) this).anInt441 > 4)
		((Class62) this).anInt441 = method1344((byte) 4);
	}
    }
    
    final int method1344(byte argument_15_) {
	if (((Class62) this).aClass59_Sub50_440.method1157(67)
		.method233(-20773)
	    > 1)
	    return 4;
	if (argument_15_ != 4)
	    anInt4420 = 123;
	return 2;
    }
    
    public static void method1425(byte argument) {
	KeyHandler.miscPrintableChars = null;
    }
}
