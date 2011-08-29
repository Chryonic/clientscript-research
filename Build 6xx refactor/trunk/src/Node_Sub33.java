/* Class59_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub33 extends Node
{
    static int anInt4145;
    static Class207 aClass207_4146 = new Class207(80, 8);
    int anInt4147;
    int anInt4148;
    static Js5Store aJs5Store_4149;
    
    public static void method1036(int argument) {
	aJs5Store_4149 = null;
	aClass207_4146 = null;
    }
    
    static final void method1037(DoublyLinkedNodeP2_Sub5 argument, int argument_0_) {
	((DoublyLinkedNodeP2_Sub5) argument).aEntity_4533 = null;
	if (Class25.anInt167 < 20) {
	    Class291.aClass366_2349.method3983(argument, (byte) 119);
	    Class25.anInt167++;
	}
    }
    
    static final byte[] method1038(int argument, byte[] argument_1_,
				   boolean argument_2_) {
	byte[] anLocalInts = new byte[argument];
	JagStrings.memcpy(argument_1_, 0, anLocalInts, 0, argument);
	return anLocalInts;
    }
    
    Node_Sub33(int argument_3_, int argument_4_) {
	((Node_Sub33) this).anInt4147 = argument_4_;
	((Node_Sub33) this).anInt4148 = argument_3_;
    }
}
