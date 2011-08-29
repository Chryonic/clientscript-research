/* Class109_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class109_Sub1 extends Class109
{
    private int[] anIntArray4602;
    private int anInt4603;
    static boolean[] aBooleanArray4604 = new boolean[100];
    private int anInt4606;
    private Packet aClass59_Sub28_4607;
    private byte[][] aByteArrayArray4608 = new byte[10][];
    private Js5Store aJs5Store_4609;
    private Packet aClass59_Sub28_4610;
    
    final void method1982(byte argument_0_) {
	if (anIntArray4602 != null) {
	    if (argument_0_ != -118)
		anInt4603 = -18;
	    int anLocalInt = 0;
	while_117_:
	    do {
		for (;;) {
		    if (anLocalInt >= 10)
			break while_117_;
		    if (anIntArray4602.length <= anInt4603 + anLocalInt)
			break;
		    if (aByteArrayArray4608[anLocalInt] == null
			&& aJs5Store_4609.isLoaded((anIntArray4602[anInt4603 + anLocalInt]), 0))
			aByteArrayArray4608[anLocalInt]
			    = aJs5Store_4609.getData((anIntArray4602[(anLocalInt + anInt4603)]), 0);
		    anLocalInt++;
		}
		break;
	    } while (false);
	}
    }
    
    Class109_Sub1(int argument_1_, Js5Store argument_2_, int argument_3_) {
	super(argument_1_);
	aClass59_Sub28_4607 = new Packet(null);
	aClass59_Sub28_4610 = new Packet(null);
	aJs5Store_4609 = argument_2_;
	anInt4606 = argument_3_;
    }
    
    final int method1971(byte[] argument_4_, byte argument_5_)
	throws IOException {
	if (anIntArray4602 == null) {
	    if (!aJs5Store_4609.isLoaded(anInt4606, 0))
		return 0;
	    byte[] anLocalInts = aJs5Store_4609.getData(anInt4606, 0);
	    if (anLocalInts == null)
		throw new IllegalStateException("");
	    ((Packet) aClass59_Sub28_4610).pos = 0;
	    ((Packet) aClass59_Sub28_4610).data = anLocalInts;
	    int anLocalInt = anLocalInts.length >> 1;
	    anIntArray4602 = new int[anLocalInt];
	    for (int anLocalInt_6_ = 0; anLocalInt > anLocalInt_6_;
		 anLocalInt_6_++)
		anIntArray4602[anLocalInt_6_]
		    = aClass59_Sub28_4610.g2();
	}
	if (anIntArray4602.length <= anInt4603)
	    return -1;
	method1982((byte) -118);
	if (argument_5_ >= -3)
	    aByteArrayArray4608 = null;
	((Packet) aClass59_Sub28_4610).data = argument_4_;
	((Packet) aClass59_Sub28_4610).pos = 0;
	while (((Packet) aClass59_Sub28_4610).pos
	       < ((Packet) aClass59_Sub28_4610).data.length) {
	    if (((Packet) aClass59_Sub28_4607).data == null) {
		if (aByteArrayArray4608[0] == null) {
		    ((Packet) aClass59_Sub28_4610).data
			= null;
		    return ((Packet) aClass59_Sub28_4610).pos;
		}
		((Packet) aClass59_Sub28_4607).data
		    = aByteArrayArray4608[0];
	    }
	    int anLocalInt
		= (((Packet) aClass59_Sub28_4610).data.length
		   - ((Packet) aClass59_Sub28_4610).pos);
	    int anLocalInt_7_
		= (-((Packet) aClass59_Sub28_4607).pos
		   + (((Packet) aClass59_Sub28_4607)
		      .data).length);
	    if (anLocalInt < anLocalInt_7_) {
		aClass59_Sub28_4607.gbytes
		    (((Packet) aClass59_Sub28_4610).data, ((Packet) aClass59_Sub28_4610).pos,
                    anLocalInt
            );
		((Packet) aClass59_Sub28_4610).data = null;
		return argument_4_.length;
	    }
	    aClass59_Sub28_4610.pbytes
                (((Packet) aClass59_Sub28_4607).data,
                        ((Packet) aClass59_Sub28_4607).pos, anLocalInt_7_
                );
	    ((Packet) aClass59_Sub28_4607).data = null;
	    ((Packet) aClass59_Sub28_4607).pos = 0;
	    anInt4603++;
	    for (int anLocalInt_8_ = 0; anLocalInt_8_ < 9; anLocalInt_8_++)
		aByteArrayArray4608[anLocalInt_8_]
		    = aByteArrayArray4608[anLocalInt_8_ + 1];
	    aByteArrayArray4608[9] = null;
	    if (anIntArray4602.length <= anInt4603) {
		((Packet) aClass59_Sub28_4610).data = null;
		return ((Packet) aClass59_Sub28_4610).pos;
	    }
	}
	((Packet) aClass59_Sub28_4610).data = null;
	return argument_4_.length;
    }
    
    static final void method1983(int argument) {
	if (((Signlink) Applet_Sub1.baseSignlink).useCache
	    && ((GameServer) DoublyLinkedNode_Sub51_Sub15.aGameServer_6318).id != -1)
	    Node_Sub7.method568
		(((GameServer) DoublyLinkedNode_Sub51_Sub15.aGameServer_6318).address,
                ((GameServer) DoublyLinkedNode_Sub51_Sub15.aGameServer_6318).id,
                false);
    }
    
    public static void method1984(int argument) {
	client.clientInstance = null;
	aBooleanArray4604 = null;
    }
    
    static final void method1985(int argument) {
	if (Statics.anInt1652 != 3) {
	    if (Statics.anInt1652 == 7)
		Class316.method3638(8, 2);
	    else if (Statics.anInt1652 == 10)
		Class316.method3638(11, 2);
	} else
	    Class316.method3638(4, 2);
    }
}
