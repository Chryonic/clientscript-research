/* Class306 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class306
{
    static int anInt2583 = 1405;
    int anInt2584;
    
    public final String toString() {
	throw new IllegalStateException();
    }
    
    static final void method3597(int argument, int argument_0_,
				 int argument_1_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(6, 13175, (long) argument_1_);
	class59_sub51_sub3.method1182(-115);
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231 = argument_0_;
    }
    
    static final Class244 method3598(int argument, int argument_2_) {
	if (argument != 0) {
	    if (argument != 1) {
		if (argument == 2) {
		    if ((double) Class179.aFloat1335 == 3.0)
			return Statics.aClass244_363;
		    if ((double) Class179.aFloat1335 == 4.0)
			return Class217.aClass244_1528;
		    if ((double) Class179.aFloat1335 == 6.0)
			return Class62_Sub22.aClass244_4436;
		    if ((double) Class179.aFloat1335 >= 8.0)
			return Node_Sub31_Sub15.aClass244_5901;
		}
	    } else {
		if ((double) Class179.aFloat1335 == 3.0)
		    return Class97.aClass244_757;
		if ((double) Class179.aFloat1335 == 4.0)
		    return Statics.aClass244_4117;
		if ((double) Class179.aFloat1335 == 6.0)
		    return Statics.aClass244_363;
		if ((double) Class179.aFloat1335 >= 8.0)
		    return Class217.aClass244_1528;
	    }
	} else {
	    if ((double) Class179.aFloat1335 == 3.0)
		return Node_Sub31_Sub25.aClass244_5953;
	    if ((double) Class179.aFloat1335 == 4.0)
		return Class196.aClass244_1438;
	    if ((double) Class179.aFloat1335 == 6.0)
		return Class97.aClass244_757;
	    if ((double) Class179.aFloat1335 >= 8.0)
		return Statics.aClass244_4117;
	}
	return null;
    }
    
    static final void method3599(int argument, boolean argument_3_,
				 int argument_4_, Js5Store argument_5_,
				 int argument_6_, int argument_7_,
				 int argument_8_) {
	if (argument_4_ <= 0)
	    Statics.method545(argument_3_, argument_8_, argument_6_, argument, argument_5_, (byte) -65);
	else {
	    Class281.anInt2272 = argument;
	    Statics.aBoolean4155 = argument_3_;
	    Class350_Sub1.aJs5Store_5432 = argument_5_;
	    Statics.anInt3525 = argument_8_;
	    Class316.anInt2617 = argument_6_;
	    Class256_Sub3.aClass59_Sub9_Sub2_5631 = null;
	    Statics.anInt5035 = 1;
	    DoublyLinkedNode_Sub51_Sub16.anInt6324
		= (GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546.method616(44)
		   / argument_4_);
	    if (DoublyLinkedNode_Sub51_Sub16.anInt6324 < 1)
		DoublyLinkedNode_Sub51_Sub16.anInt6324 = 1;
	}
    }
    
    Class306(int argument_9_) {
	((Class306) this).anInt2584 = argument_9_;
    }
}
