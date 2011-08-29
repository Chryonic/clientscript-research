/* Class200 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class200
{
    static Class207 aClass207_1446 = new Class207(25, 15);
    static Js5Store aJs5Store_1447;
    
    static final boolean method2912(int argument, int argument_0_) {
	if (argument == 13 || argument == 58 || argument == 23
	    || argument == 17 || argument == 1012)
	    return true;
	if (argument == 22 || argument == 1008)
	    return true;
	return false;
    }
    
    static final void method2913(DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 argument,
				 byte argument_1_, int argument_2_,
				 int argument_3_, int argument_4_) {
	int anLocalInt
	    = ((Entity) argument).pathX[0];
	int anLocalInt_5_
	    = ((Entity) argument).pathZ[0];
	if (anLocalInt >= 0 && anLocalInt < MapRelated.mapWidth
	    && anLocalInt_5_ >= 0
	    && anLocalInt_5_ < MapRelated.mapDepth
	    && (argument_4_ >= 0 && argument_4_ < MapRelated.mapWidth
		&& argument_2_ >= 0
		&& MapRelated.mapDepth > argument_2_)) {
	    int anLocalInt_6_
		= Class96.method1711(argument_2_, argument.method1830(-125),
				     Class338.anIntArray2786, 0, true,
				     anLocalInt, Statics.anIntArray292,
				     anLocalInt_5_, 0, -100,
				     (MapRelated.clippingMaps
				      [((DoublyLinkedNodeP2_Sub2) argument).lightingHL]),
				     0, argument_4_, -4, 0);
	    if (anLocalInt_6_ >= 1 && anLocalInt_6_ <= 3) {
		for (int anLocalInt_7_ = 0; anLocalInt_6_ - 1 > anLocalInt_7_;
		     anLocalInt_7_++)
		    argument.method1853(Statics.anIntArray292[anLocalInt_7_],
					argument_1_,
					Class338.anIntArray2786[anLocalInt_7_],
					4);
	    }
	}
    }
    
    public static void method2914(int argument) {
	aClass207_1446 = null;
	aJs5Store_1447 = null;
    }
}
