/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.DataOutputStream;
import java.io.IOException;

final class Cs2CallStackEntry
{
    int[] integerLocalVariables;
    Cs2Script caller;
    String[] stringLocalVariables;
    long[] longLocalVariables;
    static Class166 aClass166_507 = new Class166(98, 7);
    static Class166 aClass166_508;
    int instructionCounter = -1;
    static int anInt510 = 0;
    static int[] anIntArray511 = new int[14];

    public void writeState(DataOutputStream dOS) throws IOException {
        dOS.writeInt((int) caller.hash);
        dOS.writeInt(instructionCounter);
        for (int i = 0;i < caller.integerVariableCount;i++)
            dOS.writeInt(integerLocalVariables[i]);
        for (int i = 0;i < caller.stringVariableCount;i++)
            dOS.writeUTF(stringLocalVariables[i]);
        for (int i = 0;i < caller.longVariableCount;i++)
            dOS.writeLong(longLocalVariables[i]);
    }
    static final void method1545(int argument, int argument_0_,
				 int argument_1_, boolean argument_2_,
				 int argument_3_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(4, 13175, (long) argument_0_);
	class59_sub51_sub3.method1182(-66);
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6234 = argument_1_;
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6233 = argument;
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231 = argument_3_;
    }
    
    public static void method1546(int argument) {
	anIntArray511 = null;
	aClass166_508 = null;
	aClass166_507 = null;
    }
    
    static final void method1547(int argument) {
	Node_Sub47_Sub8.method1131((long) Class333.anInt2720,
            Class389.aGraphicsToolkit3281, (byte) -2);
	if (Class66.anInt467 != -1)
	    Class313.method3616(argument ^ 0x135, Class66.anInt467);
	for (int anLocalInt = 0; Node_Sub47_Sub8.anInt6193 > anLocalInt;
	     anLocalInt++) {
	    if (Class109_Sub1.aBooleanArray4604[anLocalInt])
		Class189_Sub3.aBooleanArray5651[anLocalInt] = true;
	    Class1_Sub1.aBooleanArray5600[anLocalInt]
		= Class109_Sub1.aBooleanArray4604[anLocalInt];
	    Class109_Sub1.aBooleanArray4604[anLocalInt] = false;
	}
	Class100.anInt782 = Class333.anInt2720;
	if (Class66.anInt467 != -1) {
	    Node_Sub47_Sub8.anInt6193 = 0;
	    DoublyLinkedNode_Sub51_Sub14.method1269(95);
	}
	Class389.aGraphicsToolkit3281.clearClip();
	Node_Sub9_Sub2.method607(false, Class389.aGraphicsToolkit3281);
	int anLocalInt = Class166.method2636((byte) 1);
	if (anLocalInt == -1)
	    anLocalInt = Class62_Sub10.anInt4399;
	if (argument == -343) {
	    if (anLocalInt == -1)
		anLocalInt = Class350_Sub3.anInt5468;
	    Class70.method1519(argument ^ 0x132, anLocalInt);
	    Class350.anInt2930 = 0;
	}
    }
    
    static final Node_Sub7 method1548(int argument) {
	if (Class179.aCyclicLinkedList_1329 == null || Statics.aClass151_1646 == null)
	    return null;
	for (Node_Sub7 class59_sub7
		 = ((Node_Sub7)
		    Statics.aClass151_1646.method2549((byte) 17));
	     class59_sub7 != null;
	     class59_sub7 = ((Node_Sub7)
			     Statics.aClass151_1646.method2549((byte) 17))) {
	    Class299 class299
		= Class179.aClass20_1324.method312(((Node_Sub7)
						    class59_sub7).anInt3910,
						   -113);
	    if (class299 != null && ((Class299) class299).aBoolean2503
		&& class299.method3525((byte) -115,
				       Class179.anInterface13_1325))
		return class59_sub7;
	}
	return null;
    }
    
    static {
	aClass166_508 = new Class166(126, -2);
    }
}
