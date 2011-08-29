/* Class168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class168
{
    int anInt1231;
    String aString1232;
    
    static final boolean method2729(int argument, boolean argument_0_,
				    int argument_1_) {
	if ((argument & 0x800) == 0)
	    return false;
	return true;
    }
    
    static final DoublyLinkedNodeP2_Sub5 method2730(byte argument) {
	DoublyLinkedNodeP2_Sub5 class104_sub5
	    = (DoublyLinkedNodeP2_Sub5) Class291.aClass366_2349.method3988((byte) -7);
	if (class104_sub5 != null) {
	    Class25.anInt167--;
	    return class104_sub5;
	}
	return new DoublyLinkedNodeP2_Sub5();
    }
}
