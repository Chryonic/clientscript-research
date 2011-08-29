/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class158
{
    static boolean aBoolean1164 = false;
    int anInt1165;
    static int anInt1166;
    int anInt1167;
    Interface18[] anInterface18Array1168;
    
    final void method2594(Packet argument_0_, byte argument_1_) {
	((Class158) this).anInt1165
	    = argument_0_.g3_dupl();
	((Class158) this).anInt1167 = argument_0_.g2();
	((Class158) this).anInterface18Array1168
	    = (new Interface18
	       [argument_0_.g1()]);
	Class128[] class128s = Class107.method1961(argument_1_ ^ ~0x13);
	int anLocalInt = 0;
	if (argument_1_ != 83)
	    ((Class158) this).anInt1165 = 15;
	for (/**/;
	     ((Class158) this).anInterface18Array1168.length > anLocalInt;
	     anLocalInt++)
	    ((Class158) this).anInterface18Array1168[anLocalInt]
		= method2596(30, argument_0_,
			     class128s[argument_0_.g1()]);
    }
    
    static final void method2595(byte argument) {
	if (MapRelated.anInt5582 == 1 || MapRelated.anInt5582 == 3
	    || (MapRelated.anInt5582 != DiskBackedCache.anInt2701
		&& (MapRelated.anInt5582 == 0
		    || DiskBackedCache.anInt2701 == 0))) {
	    Statics.anInt5573 = 0;
	    dba_sub_772_Sub2.anInt6369 = 0;
	    Class294.aJagexHashMap_2453.method1527(argument ^ ~0x1e);
	}
	if (argument == -31)
	    DiskBackedCache.anInt2701 = MapRelated.anInt5582;
    }
    
    private final Interface18 method2596
	(int argument_2_, Packet argument_3_, Class128 argument_4_) {
	int anLocalInt = 55 % ((argument_2_ + 83) / 42);
	if (argument_4_ == Statics.aClass128_859)
	    return Class253_Sub3.method3253(argument_3_, 20859);
	if (argument_4_ == Node_Sub15.aClass128_3992)
	    return Class276.method3401(argument_3_, -1);
	if (Class84.aClass128_599 == argument_4_)
	    return Class164.method2625(argument_3_, 0);
	if (Node_Sub31_Sub31.aClass128_5995 == argument_4_)
	    return Class170.method2736(argument_3_, 21157);
	if (argument_4_ == DoublyLinkedNode_Sub51_Sub1.aClass128_6219)
	    return Node_Sub31_Sub23.method950(argument_3_, -84);
	if (Class_aa_Sub1.aClass128_3747 == argument_4_)
	    return Statics.method3591(-4971, argument_3_);
	if (argument_4_ == Class245_Sub1_Sub1.aClass128_6511)
	    return Class235.method3115((byte) -63, argument_3_);
	if (Class276.aClass128_2211 == argument_4_)
	    return Class383.method4112(argument_3_, 65408);
	if (Class107.aClass128_874 == argument_4_)
	    return Node_Sub44.method1085(argument_3_, 3);
	if (argument_4_ == Class28.aClass128_203)
	    return Class256.method3277(117, argument_3_);
	return null;
    }
    
    public Class158() {
	/* empty */
    }
}
