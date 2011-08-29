/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class241
{
    private Js5Store aJs5Store_1751;
    private Class149 aClass149_1752 = new Class149(64);
    Js5Store aJs5Store_1753;
    Class149 aClass149_1754 = new Class149(2);
    /*synthetic*/ static Class aClass1755;
    
    final void method3145(int argument_0_, int argument_1_) {
	synchronized (aClass149_1752) {
	    aClass149_1752.method2534(argument_1_, (byte) -8);
	}
	synchronized (((Class241) this).aClass149_1754) {
	    ((Class241) this).aClass149_1754.method2534(argument_1_,
							(byte) -8);
	}
    }
    
    static final boolean method3146(int argument, int argument_2_,
				    int argument_3_, int argument_4_) {
	if (argument != 64)
	    method3146(-57, 15, -47, -124);
	Interface2 interface2
	    = ((Interface2)
	       Node_Sub31_Sub15_Sub1.method921(argument_4_, argument_3_,
                   argument_2_));
	boolean anLocalBoolean = true;
	if (interface2 != null)
	    anLocalBoolean
		&= Node_Sub47_Sub4.method1122(interface2, argument ^ ~0x27);
	interface2
	    = ((Interface2)
	       LoadingBar.method2831(argument_4_, argument_3_, argument_2_, (aClass1755 != null ? aClass1755 : (aClass1755 = method3152("Interface2")))));
	if (interface2 != null)
	    anLocalBoolean &= Node_Sub47_Sub4.method1122(interface2, -102);
	interface2
	    = (Interface2) Statics.method1330(argument_4_, argument_3_, argument_2_);
	if (interface2 != null)
	    anLocalBoolean &= Node_Sub47_Sub4.method1122(interface2, -84);
	return anLocalBoolean;
    }
    
    final void method3147(int argument_5_) {
	synchronized (aClass149_1752) {
	    aClass149_1752.method2540(argument_5_ ^ ~0x7a);
	}
	if (argument_5_ != 0)
	    method3147(-8);
	synchronized (((Class241) this).aClass149_1754) {
	    ((Class241) this).aClass149_1754.method2540(-127);
	}
    }

    final Class279 method3149(int argument_6_, int argument_7_) {
	Class279 class279;
	synchronized (aClass149_1752) {
	    class279
		= (Class279) aClass149_1752.get((long) argument_7_);
	}
	if (class279 != null)
	    return class279;
	byte[] anLocalInts;
	synchronized (aJs5Store_1751) {
	    anLocalInts = aJs5Store_1751.getData(33, argument_7_);
	}
	class279 = new Class279();
	((Class279) class279).aClass241_2237 = this;
	if (anLocalInts != null)
	    class279.method3420(new Packet(anLocalInts), -1);
	synchronized (aClass149_1752) {
	    aClass149_1752.put(class279, (long) argument_7_);
	}
	return class279;
    }
    
    private final void method3150(byte argument_8_) {
	synchronized (aClass149_1752) {
	    aClass149_1752.clear((byte) -3);
	}
	synchronized (((Class241) this).aClass149_1754) {
	    if (argument_8_ <= 12)
		((Class241) this).aClass149_1754 = null;
	    ((Class241) this).aClass149_1754.clear((byte) -3);
	}
    }
    
    static final void method3151(byte argument) {
	Statics.aClass51_1250.method471(16);
	Statics.aClass297_3521.method3516(-117);
	DoublyLinkedNodeP2_Sub5.aClass383_4536.method4116(-106);
	Node_Sub31_Sub30.aClass257_5983.method3297((byte) 85);
	DiskBackedCache.aClass26_2709.method350(-51);
	Class253_Sub1_Sub1.aClass365_6632.method3976(1);
	DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3755((byte) 49);
	Class194.aClass225_1414.method3050(false);
	ClientVariables.varbitSource.clearCache();
	JagexHash.aClass58_1682.method523(64);
	Class111.aClanVarbitSource_916.clearCache();
	Class157.aClass41_1159.method415(true);
	Class206.aClass374_1482.method4080(true);
	Node_Sub31_Sub13.aClass20_5897.method316((byte) -114);
	Class349.aClass313_2918.method3621((byte) -85);
	Class62_Sub27.aClass362_4457.method3961((byte) -6);
	Statics.aClass333_2631.method3725(3138);
	InputStream_Sub2.aClass64_35.method1487((byte) -126);
	Class48.aClass73_343.method1543(29083);
	Class363.aClass241_3064.method3150((byte) 104);
	Class86.aClass264_638.method3331(5);
	Class79.aClass115_561.method2364(-110);
	Class5.method225((byte) -121);
	Node_Sub32_Sub4.method1033(false);
	Node_Sub36.method1050(0);
	Class62_Sub3.method1359(49);
	if (client.modeWhere != TestingStageEnum.LIVE) {
	    for (int anLocalInt = 0;
		 Class166.aByteArrayArray1214.length > anLocalInt;
		 anLocalInt++)
		Class166.aByteArrayArray1214[anLocalInt] = null;
	    Statics.anInt1994 = 0;
	}
	Skybox.clearCache();
	Class86.method1632((byte) 114);
	Statics.method2866();
	Statics.method2424(true);
	Statics.method2761(1);
	Cs2Runtime.aClass149_2651.clear((byte) -3);
	Class389.aGraphicsToolkit3281.method2071();
	Node_Sub31_Sub29.method963(true);
	Node_Sub47_Sub11.method1139(109);
	Class274.aJs5Store_2197.forceClearSubFileBuffer();
	Class253.aJs5Store_3720.forceClearSubFileBuffer();
	Statics.aJs5Store_1153.forceClearSubFileBuffer();
	client.interfaceFetcher.forceClearSubFileBuffer();
	Class314.aJs5Store_2603.forceClearSubFileBuffer();
	MapRelated.mapStore.forceClearSubFileBuffer();
	Class341.aJs5Store_2881.forceClearSubFileBuffer();
	Node_Sub49.aJs5Store_4292.forceClearSubFileBuffer();
	Class205.aJs5Store_1472.forceClearSubFileBuffer();
	DoublyLinkedNodeP2_Sub10.aJs5Store_4600.forceClearSubFileBuffer();
	Class313.aJs5Store_2596.forceClearSubFileBuffer();
	Class42.aJs5Store_3537.forceClearSubFileBuffer();
	Cs2Script.scriptStore.forceClearSubFileBuffer();
	client.fontCache.forceClearSubFileBuffer();
	ClanSettingsDelta.aJs5Store_1546.forceClearSubFileBuffer();
	Node_Sub31_Sub4.aJs5Store_5856.forceClearSubFileBuffer();
	Statics.aJs5Store_4343.forceClearSubFileBuffer();
	Statics.aJs5Store_3520.forceClearSubFileBuffer();
	Class245_Sub1.aJs5Store_5307.forceClearSubFileBuffer();
	tia_sub_35_Sub2DoublyLinked.aJs5Store_6667.forceClearSubFileBuffer();
	Class200.aJs5Store_1447.forceClearSubFileBuffer();
	Class62_Sub16.aJs5Store_4416.forceClearSubFileBuffer();
	Node_Sub30.aJs5Store_4134.forceClearSubFileBuffer();
	Class147.aJs5Store_1116.forceClearSubFileBuffer();
	Class109.aJs5Store_908.forceClearSubFileBuffer();
	Class88.aJs5Store_645.forceClearSubFileBuffer();
	DoublyLinkedNode_Sub51_Sub3.aJs5Store_6232.forceClearSubFileBuffer();
	Class303_Sub1.aJs5Store_5408.forceClearSubFileBuffer();
	Class361.aJs5Store_3056.forceClearSubFileBuffer();
	Statics.aJs5Store_2160.forceClearSubFileBuffer();
	dba_sub_772.aJs5Store_4344.forceClearSubFileBuffer();
	Statics.aJs5Store_4153.forceClearSubFileBuffer();
	Class106.aJs5Store_865.forceClearSubFileBuffer();
	Rs2DPainter.aClass149_4048.clear((byte) -3);
	Class165.aClass149_1208.clear((byte) -3);
	Statics.aClass149_4512.clear((byte) -3);
	Class350_Sub1.aClass149_5423.clear((byte) -3);
    }
    
    Class241(GameEnum argument_9_, int argument_10_, Js5Store argument_11_,
	     Js5Store argument_12_) {
	aJs5Store_1751 = argument_11_;
	((Class241) this).aJs5Store_1753 = argument_12_;
	aJs5Store_1751.getSubFileCount(33);
    }
    
    /*synthetic*/ static Class method3152(String argument) {
	try {
	    return Class.forName(argument);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
