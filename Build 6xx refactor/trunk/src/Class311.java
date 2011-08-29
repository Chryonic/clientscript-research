/* Class311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class311
{
    static int anInt2591;
    static int anInt2592;
    
    static final Entity method3613
	(byte argument, int argument_0_, int argument_1_, int argument_2_) {
	Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			     [argument_2_][argument_0_][argument_1_]);
	if (class148 == null)
	    return null;
	Entity entity = null;
	int anLocalInt = -1;
	for (Class110 class110 = ((Class148) class148).aClass110_1126;
	     class110 != null;
	     class110 = ((Class110) class110).aClass110_912) {
	    DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2
		= ((Class110) class110).aClass104_Sub2_Sub2_911;
	    if (class104_sub2_sub2 instanceof Entity) {
		Entity entity_3_
		    = (Entity) class104_sub2_sub2;
		int anLocalInt_4_
		    = (entity_3_.method1830(-125) * 256 - 256
		       + 252);
		int anLocalInt_5_
		    = (-anLocalInt_4_ + ((DoublyLinkedNodeP2_Sub2) entity_3_).worldX
		       >> 9);
		int anLocalInt_6_
		    = (-anLocalInt_4_ + ((DoublyLinkedNodeP2_Sub2) entity_3_).worldZ
		       >> 9);
		int anLocalInt_7_
		    = ((((DoublyLinkedNodeP2_Sub2) entity_3_).worldX
			+ anLocalInt_4_)
		       >> 9);
		int anLocalInt_8_
		    = (anLocalInt_4_ + ((DoublyLinkedNodeP2_Sub2) entity_3_).worldZ
		       >> 9);
		if (argument_0_ >= anLocalInt_5_
		    && anLocalInt_6_ <= argument_1_
		    && argument_0_ <= anLocalInt_7_
		    && anLocalInt_8_ >= argument_1_) {
		    int anLocalInt_9_ = ((-argument_0_ + (anLocalInt_7_ + 1))
					 * (anLocalInt_8_ + 1 - argument_1_));
		    if (anLocalInt_9_ > anLocalInt) {
			anLocalInt = anLocalInt_9_;
			entity = entity_3_;
		    }
		}
	    }
	}
	return entity;
    }
}
