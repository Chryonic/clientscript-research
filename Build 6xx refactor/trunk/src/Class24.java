/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class24
{
    static Class166 aClass166_156 = new Class166(49, -2);
    int anInt157;
    private Js5Store aJs5Store_158;
    private Class149 aClass149_159 = new Class149(64);
    static int[] anIntArray160;
    static int anInt161;
    static int anInt163 = 0;
    
    final Class209 method337(int argument_0_, int argument_1_) {
	Class209 class209;
	synchronized (aClass149_159) {
	    class209
		= (Class209) aClass149_159.get((long) argument_1_);
	}
	if (class209 != null)
	    return class209;
	byte[] anLocalInts;
	synchronized (aJs5Store_158) {
	    anLocalInts = aJs5Store_158.getData(19, argument_1_);
	}
	class209 = new Class209();
	if (anLocalInts != null)
	    class209.method2957(new Packet(anLocalInts), 0);
	synchronized (aClass149_159) {
	    aClass149_159.put(class209, (long) argument_1_);
	}
	return class209;
    }
    
    static final Class47 method338(int argument, boolean argument_2_) {
	Class47 class47
	    = ((Class47)
	       Class87.aClass149_3560.get((long) argument));
	if (class47 != null)
	    return class47;
	byte[] anLocalInts
	    = Class62_Sub8.aJs5Store_4393.getData(1, argument);
	class47 = new Class47();
	((Class47) class47).anInt325 = argument;
	if (anLocalInts != null)
	    class47.method454((byte) 21, new Packet(anLocalInts));
	class47.method448(1);
	if (((Class47) class47).anInt334 == 2
	    && (Class388.aJagexHashMap_3273.get((long) argument)
		== null)) {
	    Class388.aJagexHashMap_3273.put((long) argument, new IntegerNode(Class106.anInt867));
	    Class95.aClass47Array722[Class106.anInt867++] = class47;
	}
	Class87.aClass149_3560.put(class47, (long) argument);
	return class47;
    }
    
    public static void method339(boolean argument) {
	aClass166_156 = null;
	anIntArray160 = null;
    }
    
    Class24(GameEnum argument_3_, int argument_4_, Js5Store argument_5_) {
	aJs5Store_158 = argument_5_;
	((Class24) this).anInt157 = aJs5Store_158.getSubFileCount(19);
    }
    
    static final void method340(RsInterface argument, byte argument_6_) {
	if (Class353.aBoolean2953) {
	    if (((RsInterface) argument).anObjectArray1831 != null) {
		RsInterface rsInterface
		    = RsInterface.getCreatedChild(Class297.anInt2472, Statics.anInt1181);
		if (rsInterface != null) {
		    Cs2Trigger class59_sub27 = new Cs2Trigger();
		    ((Cs2Trigger) class59_sub27).parameters
			= ((RsInterface) argument).anObjectArray1831;
		    ((Cs2Trigger) class59_sub27).aRsInterface_4114 = rsInterface;
		    ((Cs2Trigger) class59_sub27).aRsInterface_4115 = argument;
		    Cs2Runtime.executeTrigger(class59_sub27);
		}
	    }
	    Node_Sub29 class59_sub29
		= Class91.method1683((byte) 63,
				     Node_Sub31_Sub16.aClass372_5910,
				     Node_Sub47_Sub2.aClass207_6160);
	    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		.p4(((RsInterface) argument).idHash);
	    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		.p4m2143(Class297.anInt2472);
	    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		.p2(((RsInterface) argument).anInt1870);
	    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		.p2p128(Statics.anInt1181);
	    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		.p2p128(Statics.anInt4519);
	    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		.p2ip128(((RsInterface) argument).subId);
	    Class251.method3243(class59_sub29, true);
	}
    }
    
    static {
	anIntArray160 = new int[32];
    }
}
