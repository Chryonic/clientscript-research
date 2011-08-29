/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class14
{
    short[] aShortArray98;
    Node_Sub11 aClass59_Sub11_99;
    private static short[] aShortArray100 = new short[500];
    private static short[] aShortArray101;
    short[] aShortArray102;
    short[] aShortArray103;
    private static byte[] aByteArray104 = new byte[500];
    short[] aShortArray105;
    int anInt106;
    boolean aBoolean107 = false;
    short[] aShortArray108;
    private static short[] aShortArray109 = new short[500];
    private static short[] aShortArray110;
    boolean aBoolean111;
    private static short[] aShortArray112;
    byte[] aByteArray113;
    boolean aBoolean114;
    
    public static void method300() {
	aShortArray112 = null;
	aShortArray109 = null;
	aShortArray100 = null;
	aShortArray101 = null;
	aShortArray110 = null;
	aByteArray104 = null;
    }
    
    Class14(byte[] argument_0_, Node_Sub11 argument_1_) {
	((Class14) this).anInt106 = 0;
	((Class14) this).aBoolean111 = false;
	((Class14) this).aClass59_Sub11_99 = null;
	((Class14) this).aBoolean114 = false;
	((Class14) this).aClass59_Sub11_99 = argument_1_;
	try {
	    Packet class59_sub28 = new Packet(argument_0_);
	    Packet class59_sub28_2_ = new Packet(argument_0_);
	    class59_sub28.g1();
	    ((Packet) class59_sub28).pos += 2;
	    int anLocalInt = class59_sub28.g1();
	    int anLocalInt_3_ = 0;
	    int anLocalInt_4_ = -1;
	    int anLocalInt_5_ = -1;
	    ((Packet) class59_sub28_2_).pos
		= ((Packet) class59_sub28).pos + anLocalInt;
	    for (int anLocalInt_6_ = 0; anLocalInt_6_ < anLocalInt;
		 anLocalInt_6_++) {
		int anLocalInt_7_
		    = (((Node_Sub11) ((Class14) this).aClass59_Sub11_99)
		       .anIntArray3944[anLocalInt_6_]);
		if (anLocalInt_7_ == 0)
		    anLocalInt_4_ = anLocalInt_6_;
		int anLocalInt_8_ = class59_sub28.g1();
		if (anLocalInt_8_ > 0) {
		    if (anLocalInt_7_ == 0)
			anLocalInt_5_ = anLocalInt_6_;
		    aShortArray112[anLocalInt_3_] = (short) anLocalInt_6_;
		    short anLocalInt_9_ = 0;
		    if (anLocalInt_7_ == 3 || anLocalInt_7_ == 10)
			anLocalInt_9_ = (short) 128;
		    if ((anLocalInt_8_ & 0x1) != 0)
			aShortArray109[anLocalInt_3_]
			    = (short) class59_sub28_2_.gsmarts();
		    else
			aShortArray109[anLocalInt_3_] = anLocalInt_9_;
		    if ((anLocalInt_8_ & 0x2) != 0)
			aShortArray100[anLocalInt_3_]
			    = (short) class59_sub28_2_.gsmarts();
		    else
			aShortArray100[anLocalInt_3_] = anLocalInt_9_;
		    if ((anLocalInt_8_ & 0x4) != 0)
			aShortArray101[anLocalInt_3_]
			    = (short) class59_sub28_2_.gsmarts();
		    else
			aShortArray101[anLocalInt_3_] = anLocalInt_9_;
		    aByteArray104[anLocalInt_3_]
			= (byte) (anLocalInt_8_ >>> 3 & 0x3);
		    if (anLocalInt_7_ == 2 || anLocalInt_7_ == 9) {
			aShortArray109[anLocalInt_3_]
			    = (short) (aShortArray109[anLocalInt_3_] << 2
				       & 0x3fff);
			aShortArray100[anLocalInt_3_]
			    = (short) (aShortArray100[anLocalInt_3_] << 2
				       & 0x3fff);
			aShortArray101[anLocalInt_3_]
			    = (short) (aShortArray101[anLocalInt_3_] << 2
				       & 0x3fff);
		    }
		    aShortArray110[anLocalInt_3_] = (short) -1;
		    if (anLocalInt_7_ == 1 || anLocalInt_7_ == 2
			|| anLocalInt_7_ == 3) {
			if (anLocalInt_4_ > anLocalInt_5_) {
			    aShortArray110[anLocalInt_3_]
				= (short) anLocalInt_4_;
			    anLocalInt_5_ = anLocalInt_4_;
			}
		    } else if (anLocalInt_7_ == 5)
			((Class14) this).aBoolean114 = true;
		    else if (anLocalInt_7_ == 7)
			((Class14) this).aBoolean111 = true;
		    else if (anLocalInt_7_ == 9 || anLocalInt_7_ == 10
			     || anLocalInt_7_ == 8)
			((Class14) this).aBoolean107 = true;
		    anLocalInt_3_++;
		}
	    }
	    if (((Packet) class59_sub28_2_).pos
		!= argument_0_.length)
		throw new RuntimeException();
	    ((Class14) this).anInt106 = anLocalInt_3_;
	    ((Class14) this).aShortArray98 = new short[anLocalInt_3_];
	    ((Class14) this).aShortArray102 = new short[anLocalInt_3_];
	    ((Class14) this).aShortArray105 = new short[anLocalInt_3_];
	    ((Class14) this).aShortArray108 = new short[anLocalInt_3_];
	    ((Class14) this).aShortArray103 = new short[anLocalInt_3_];
	    ((Class14) this).aByteArray113 = new byte[anLocalInt_3_];
	    for (int anLocalInt_10_ = 0; anLocalInt_10_ < anLocalInt_3_;
		 anLocalInt_10_++) {
		((Class14) this).aShortArray98[anLocalInt_10_]
		    = aShortArray112[anLocalInt_10_];
		((Class14) this).aShortArray102[anLocalInt_10_]
		    = aShortArray109[anLocalInt_10_];
		((Class14) this).aShortArray105[anLocalInt_10_]
		    = aShortArray100[anLocalInt_10_];
		((Class14) this).aShortArray108[anLocalInt_10_]
		    = aShortArray101[anLocalInt_10_];
		((Class14) this).aShortArray103[anLocalInt_10_]
		    = aShortArray110[anLocalInt_10_];
		((Class14) this).aByteArray113[anLocalInt_10_]
		    = aByteArray104[anLocalInt_10_];
	    }
	} catch (Exception exception) {
	    ((Class14) this).anInt106 = 0;
	    ((Class14) this).aBoolean114 = false;
	    ((Class14) this).aBoolean111 = false;
	}
    }
    
    static {
	aShortArray101 = new short[500];
	aShortArray110 = new short[500];
	aShortArray112 = new short[500];
    }
}
