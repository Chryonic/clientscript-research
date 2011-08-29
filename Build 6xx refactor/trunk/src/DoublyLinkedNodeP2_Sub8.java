/* Class104_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub8 extends DoublyLinkedNodeP2
{
    int anInt4575;
    int anInt4576;
    int anInt4577;
    String aString4578;
    int anInt4579;
    int anInt4580;
    static int anInt4581 = -1;
    int anInt4583;
    static DoublyLinkedNodeP2_Sub2[] aClass104_Sub2Array4584;
    static int anInt4585 = 0;
    
    static final void method1937(int argument, int argument_0_,
				 int argument_1_, int argument_2_,
				 int argument_3_) {
	Node_Sub35.anInt4156 = argument_1_;
	Node_Sub31_Sub13.anInt5896 = argument_2_;
	Node_Sub9_Sub2.anInt5776 = argument_0_;
	Class209.anInt1504 = argument_3_;
    }
    
    static final void method1938(int argument) {
	if (!Class282.method3446(Statics.anInt1652, (byte) -128)
	    && !Class382.method4108(Statics.anInt1652, 105)) {
	    int anLocalInt = ((((Entity)
				Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			       .pathX[0])
			      >> 3);
	    int anLocalInt_4_ = ((((Entity)
				   Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
				  .pathZ[0])
				 >> 3);
	    if (anLocalInt >= 0 && anLocalInt < MapRelated.mapWidth >> 3
		&& anLocalInt_4_ >= 0
		&& anLocalInt_4_ < MapRelated.mapDepth >> 3)
		Class62_Sub5.method1372(anLocalInt, 5000, anLocalInt_4_, 0);
	    else
		Class62_Sub5.method1372(MapRelated.mapWidth >> 4, 0,
					MapRelated.mapDepth >> 4, 0);
	} else
	    Class62_Sub5.method1372(Class287.anInt2299 >> 12, 5000,
				    Node_Sub31_Sub30.anInt5987 >> 12, 0);
	AthmosphericConditions.interpolate();
	AthmosphericConditions.applyLighting();
	AthmosphericConditions.applyUnknown();
	AthmosphericConditions.applyFog();
    }
    
    static final int method1939(int argument, int argument_5_) {
	return argument_5_ & 0xff;
    }
    
    public static void method1940(int argument) {
	aClass104_Sub2Array4584 = null;
	GlMultiTexSourceEnum.TEXTURE = null;
    }

    public DoublyLinkedNodeP2_Sub8() {
	/* empty */
    }
}
