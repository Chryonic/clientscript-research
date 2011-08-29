/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class265
{
    int anInt2050;
    int anInt2051;
    int[] anIntArray2052;
    int[] anIntArray2053;
    
    Class265() {
	Node_Sub25.method762(16);
	((Class265) this).anInt2051 = (Node_Sub25.method754() != 0
				       ? Node_Sub25.method762(4) + 1 : 1);
	if (Node_Sub25.method754() != 0)
	    Node_Sub25.method762(8);
	Node_Sub25.method762(2);
	if (((Class265) this).anInt2051 > 1)
	    ((Class265) this).anInt2050 = Node_Sub25.method762(4);
	((Class265) this).anIntArray2052
	    = new int[((Class265) this).anInt2051];
	((Class265) this).anIntArray2053
	    = new int[((Class265) this).anInt2051];
	for (int anLocalInt = 0; anLocalInt < ((Class265) this).anInt2051;
	     anLocalInt++) {
	    Node_Sub25.method762(8);
	    ((Class265) this).anIntArray2052[anLocalInt]
		= Node_Sub25.method762(8);
	    ((Class265) this).anIntArray2053[anLocalInt]
		= Node_Sub25.method762(8);
	}
    }
}
