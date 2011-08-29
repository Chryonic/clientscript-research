/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class146 implements Runnable
{
    volatile Class112[] aClass112Array1109 = new Class112[2];
    volatile boolean aBoolean1110 = false;
    static int anInt1111 = -1;
    Signlink aSignlink_1112;
    volatile boolean aBoolean1113 = false;
    
    public final void run() {
	((Class146) this).aBoolean1113 = true;
	try {
	    while (!((Class146) this).aBoolean1110) {
		for (int anLocalInt = 0; anLocalInt < 2; anLocalInt++) {
		    Class112 class112
			= ((Class146) this).aClass112Array1109[anLocalInt];
		    if (class112 != null)
			class112.method2002((byte) 109);
		}
		Timing.sleep(10L);
		Gl2Water0.method207(null, ((Class146) this).aSignlink_1112);
	    }
	} catch (Exception exception) {
	    ErrorReporting.reportError(null, exception);
	} finally {
	    ((Class146) this).aBoolean1113 = false;
	}
    }
    
    static final void method2522(Node_Sub28_Sub1 argument,
				 int argument_0_) {
	argument.p4(Class274.aJs5Store_2197.getFitCRC());
	argument.p4(Class253.aJs5Store_3720.getFitCRC());
	argument.p4(Statics.aJs5Store_1153.getFitCRC());
	argument.p4(client.interfaceFetcher.getFitCRC());
	argument.p4(Class314.aJs5Store_2603.getFitCRC());
	argument.p4(MapRelated.mapStore.getFitCRC());
	argument.p4(Class341.aJs5Store_2881.getFitCRC());
	argument.p4(Node_Sub49.aJs5Store_4292.getFitCRC()
    );
	argument.p4(Class205.aJs5Store_1472.getFitCRC());
	argument.p4(DoublyLinkedNodeP2_Sub10.aJs5Store_4600.getFitCRC()
    );
	argument.p4(Class313.aJs5Store_2596.getFitCRC());
	argument.p4(Class42.aJs5Store_3537.getFitCRC());
	argument.p4(Cs2Script.scriptStore.getFitCRC());
	argument.p4(client.fontCache.getFitCRC()
    );
	argument.p4(ClanSettingsDelta.aJs5Store_1546.getFitCRC());
	argument.p4(Node_Sub31_Sub4.aJs5Store_5856.getFitCRC()
    );
	argument.p4(Statics.aJs5Store_4343.getFitCRC()
    );
	argument.p4(Statics.aJs5Store_3520.getFitCRC()
    );
	argument.p4(Class245_Sub1.aJs5Store_5307.getFitCRC()
    );
	argument.p4(tia_sub_35_Sub2DoublyLinked.aJs5Store_6667.getFitCRC()
    );
	argument.p4(Class200.aJs5Store_1447.getFitCRC());
	argument.p4(Class62_Sub16.aJs5Store_4416.getFitCRC()
    );
	argument.p4(Node_Sub30.aJs5Store_4134.getFitCRC()
    );
	argument.p4(Class147.aJs5Store_1116.getFitCRC());
	argument.p4(Class109.aJs5Store_908.getFitCRC());
	argument.p4(Class88.aJs5Store_645.getFitCRC());
	argument.p4(DoublyLinkedNode_Sub51_Sub3.aJs5Store_6232.getFitCRC()
    );
	argument.p4(Class303_Sub1.aJs5Store_5408.getFitCRC()
    );
	argument.p4(Class361.aJs5Store_3056.getFitCRC());
	argument.p4(Statics.aJs5Store_2160.getFitCRC());
	argument.p4(dba_sub_772.aJs5Store_4344.getFitCRC()
    );
	argument.p4(Statics.aJs5Store_4153.getFitCRC()
    );
	argument.p4(Class18.method310(127));
	argument.p4(Class256_Sub4.method3293(64));
	argument.p4(Class106.aJs5Store_865.getFitCRC());
    }
}
