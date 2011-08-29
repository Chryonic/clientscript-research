/* Class59_Sub51_Sub19_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNode_Sub51_Sub19_Sub1 extends DoublyLinkedNode_Sub51_Sub19
{
    static long[] aLongArray6675;
    static String[] aStringArray6676 = new String[100];
    static float aFloat6677;
    private Object anObject6678;
    
    final boolean method1299(int argument_0_) {
	if (argument_0_ != 14391)
	    return false;
	return false;
    }
    
    public static void method1300(int argument) {
	aStringArray6676 = null;
	aLongArray6675 = null;
    }
    
    final Object method1296(byte argument_1_) {
	if (argument_1_ != 20)
	    return null;
	return anObject6678;
    }
    
    static final void method1301(boolean argument, int argument_2_,
				 int argument_3_, int argument_4_,
				 int argument_5_) {
	int anLocalInt = Node_Sub47_Sub12.anInt6215;
    while_215_:
	do {
	    do {
		if (anLocalInt != 0) {
		    if (anLocalInt != 1) {
			if (anLocalInt == 2)
			    break;
			break while_215_;
		    }
		} else
		    return;
		Class165.anInt1204 = argument_2_;
		Class317.anInt2624 = argument_5_;
		Node_Sub47_Sub12.anInt6215 = 2;
		Class323.anInt2669 = argument_4_;
		Class245_Sub2_Sub2.anInt6524 = argument_3_;
		return;
	    } while (false);
	    if (Class245_Sub2_Sub2.anInt6524 < argument_3_)
		Class245_Sub2_Sub2.anInt6524 = argument_3_;
	    if (Class323.anInt2669 < argument_4_)
		Class323.anInt2669 = argument_4_;
	    if (argument_5_ < Class317.anInt2624)
		Class317.anInt2624 = argument_5_;
	    if (argument_2_ < Class165.anInt1204)
		Class165.anInt1204 = argument_2_;
	    break;
	} while (false);
    }
    
    static final void method1302(int argument, int argument_6_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(4, 13175, (long) argument);
	class59_sub51_sub3.method1181(585134072);
    }
    
    DoublyLinkedNode_Sub51_Sub19_Sub1(Object argument_7_, int argument_8_) {
	super(argument_8_);
	anObject6678 = argument_7_;
    }
}
