/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class29
{
    static final void method358(byte argument) {
	int[] anLocalInts
	    = (new int
	       [((Class365) Class253_Sub1_Sub1.aClass365_6632).anInt3071]);
	int anLocalInt = 0;
	for (int anLocalInt_0_ = 0;
	     (anLocalInt_0_
	      < ((Class365) Class253_Sub1_Sub1.aClass365_6632).anInt3071);
	     anLocalInt_0_++) {
	    Class371 class371
		= Class253_Sub1_Sub1.aClass365_6632.method3975(125,
							       anLocalInt_0_);
	    if (((Class371) class371).anInt3165 >= 0
		|| ((Class371) class371).anInt3180 >= 0)
		anLocalInts[anLocalInt++] = anLocalInt_0_;
	}
	Node_Sub36_Sub1.anIntArray6102 = new int[anLocalInt];
	for (int anLocalInt_1_ = 0; anLocalInt > anLocalInt_1_;
	     anLocalInt_1_++)
	    Node_Sub36_Sub1.anIntArray6102[anLocalInt_1_]
		= anLocalInts[anLocalInt_1_];
    }
}
