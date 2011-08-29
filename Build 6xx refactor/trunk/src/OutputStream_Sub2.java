/* OutputStream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

final class OutputStream_Sub2 extends OutputStream
{
    static Class166 aClass166_45 = new Class166(2, 6);
    static Class166 aClass166_46 = new Class166(63, -1);
    
    public static void method138(byte argument) {
	aClass166_46 = null;
	aClass166_45 = null;
    }
    
    static final void method139(DoublyLinkedNode argument, boolean argument_0_,
				DoublyLinkedNode argument_1_) {
	if (((DoublyLinkedNode) argument_1_).prevD != null)
	    argument_1_.unlinkD();
	((DoublyLinkedNode) argument_1_).prevD = argument;
	((DoublyLinkedNode) argument_1_).nextD
	    = ((DoublyLinkedNode) argument).nextD;
	((DoublyLinkedNode) ((DoublyLinkedNode) argument_1_).prevD)
	    .nextD
	    = argument_1_;
	((DoublyLinkedNode) ((DoublyLinkedNode) argument_1_).nextD)
	    .prevD
	    = argument_1_;
    }
    
    public final void write(int argument_2_) throws IOException {
	throw new IOException();
    }
}
