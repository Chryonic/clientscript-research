/* Class59_Sub47_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub47_Sub5 extends Node_Sub47
{
    static Class48[] aClass48Array6171;
    static int anInt6172;
    static int anInt6173;
    private String aString6174;
    
    final void method1109(ClanSettings argument_0_, int argument_1_) {
	if (argument_1_ != 5)
	    method1110(-97, null);
	((ClanSettings) argument_0_).aString1274 = aString6174;
    }
    
    public static void method1123(int argument) {
	aClass48Array6171 = null;
    }
    
    static final void method1124(byte argument) {
	for (Node_Sub13 class59_sub13
		 = ((Node_Sub13)
		    Class76.aCyclicLinkedList_519.getFirst());
	     class59_sub13 != null;
	     class59_sub13
		 = (Node_Sub13) Class76.aCyclicLinkedList_519.getNext()) {
	    if (((Node_Sub13) class59_sub13).aBoolean3979)
		class59_sub13.method691((byte) 31);
	}
	for (Node_Sub13 class59_sub13
		 = ((Node_Sub13)
		    Node_Sub31_Sub8.aCyclicLinkedList_5872.getFirst());
	     class59_sub13 != null;
	     class59_sub13 = (Node_Sub13) Node_Sub31_Sub8
						 .aCyclicLinkedList_5872
						 .getNext()) {
	    if (((Node_Sub13) class59_sub13).aBoolean3979)
		class59_sub13.method691((byte) 31);
	}
    }
    
    final void method1110(int argument_2_, Packet argument_3_) {
	if (argument_2_ > -56)
	    aClass48Array6171 = null;
	aString6174 = argument_3_.gstr();
	argument_3_.g4();
    }
}
