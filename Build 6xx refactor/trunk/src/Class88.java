/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class88
{
    static CyclicLinkedList aCyclicLinkedList_643;
    static int anInt644 = 0;
    static Js5Store aJs5Store_645;
    
    final int method1642(int argument_0_, long argument_1_) {
	long l = method1646((byte) -96);
	if (l > 0L)
	    Timing.sleep(l);
	return method1644(argument_1_, -21626);
    }
    
    static final void method1643(int argument) {
	GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546.method617(10293);
	Class350_Sub1.aJs5Store_5432 = null;
	Class256_Sub3.aClass59_Sub9_Sub2_5631 = null;
	Statics.anInt5035 = 1;
    }
    
    abstract int method1644(long argument_2_, int argument_3_);
    
    abstract void method1645(byte argument_4_);
    
    abstract long method1646(byte argument_5_);
    
    static final void method1647(int argument, int argument_6_) {
	for (Node node = Statics.aJagexHashMap_1249.first(argument_6_);
	     node != null;
	     node = Statics.aJagexHashMap_1249.next()) {
	    if ((long) argument
		== (((Node) node).hash >> 48 & 0xffffL))
		node.unlink();
	}
    }
    
    abstract long method1648(byte argument_7_);
    
    public static void method1649(int argument) {
	aCyclicLinkedList_643 = null;
	aJs5Store_645 = null;
    }
    
    public Class88() {
	/* empty */
    }
    
    static {
	aCyclicLinkedList_643 = new CyclicLinkedList();
    }
}
