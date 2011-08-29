/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

abstract class Class84
{
    int anInt595;
    int anInt596;
    static Class207 aClass207_597 = new Class207(41, 3);
    int anInt598;
    static Class128 aClass128_599;
    static int[] anIntArray600 = new int[1000];
    static MenuAction aClass59_Sub51_Sub9_601;
    static Class166 aClass166_602;
    
    final boolean method1613(int argument_0_) {
	if ((((Class84) this).anInt595 & 0x4) == 0)
	    return false;
	return true;
    }
    
    final boolean method1614(byte argument_1_) {
	if ((((Class84) this).anInt595 & 0x2) == 0)
	    return false;
	return true;
    }
    
    public static void method1615(byte argument) {
	aClass207_597 = null;
	aClass128_599 = null;
	aClass166_602 = null;
	anIntArray600 = null;
	aClass59_Sub51_Sub9_601 = null;
    }
    
    static final void method1616(int argument) {
	for (Node_Sub2 class59_sub2
		 = ((Node_Sub2)
		    Statics.aCyclicLinkedList_3722.getFirst());
	     class59_sub2 != null;
	     class59_sub2 = ((Node_Sub2)
			     Statics.aCyclicLinkedList_3722.getNext()))
	    DoublyLinkedNode_Sub51_Sub10.method1242(-23204, false, class59_sub2);
	Node_Sub2 class59_sub2
	    = (Node_Sub2) Class88.aCyclicLinkedList_643.getFirst();
	if (argument != 6594)
	    method1620(-27, null, null, (byte) 72, 42);
	for (/**/; class59_sub2 != null;
	     class59_sub2
		 = (Node_Sub2) Class88.aCyclicLinkedList_643.getNext())
	    DoublyLinkedNode_Sub51_Sub10.method1242(argument ^ ~0x4361, true, class59_sub2);
    }
    
    final boolean method1617(int argument_2_) {
	if ((((Class84) this).anInt595 & 0x8) == 0)
	    return false;
	return true;
    }

    static final void method1619(int argument, byte argument_4_) {
	Class389.anInt3280 = argument;
	Class350_Sub2.aClass149_5436.clear((byte) -3);
    }
    
    static final GraphicsToolkit method1620(int argument, TextureSource argument_5_,
				     Canvas argument_6_, byte argument_7_,
				     int argument_8_) {
	return new NativeToolkit(argument_6_, argument_5_, argument, argument_8_);
    }
    
    final boolean method1621(byte argument_9_) {
	if ((((Class84) this).anInt595 & 0x1) == 0)
	    return false;
	return true;
    }
    
    public Class84() {
	/* empty */
    }
    
    static {
	aClass128_599 = new Class128(4, 1);
	aClass166_602 = new Class166(69, 6);
    }
}
