/* Class59_Sub32_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

final class Node_Sub32_Sub1 extends Node_Sub32
{

    static final void method1015(int argument, byte argument_0_,
				 String argument_1_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(2, 13175, (long) argument);
	class59_sub51_sub3.method1182(-96);
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).aString6230 = argument_1_;
    }
    
    final void method1010(OggPacket argument_2_, byte argument_3_) {
	if (argument_3_ != -13)
	    client.threadSafeDiskBackedCache = null;
    }
    
    Node_Sub32_Sub1(OggStreamState argument_4_) {
	super(argument_4_);
    }
    
    final void method1012(int argument_5_) {
	if (argument_5_ != -30243) {
	    /* empty */
	}
    }
    
    public static void method1016(int argument) {
	client.threadSafeDiskBackedCache = null;
    }
}
