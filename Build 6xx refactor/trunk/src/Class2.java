/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

abstract class Class2
{
    GraphicsToolkit_Sub2 aClass_ha_Sub2_56;
    
    void method184(byte argument_0_) {
	/* empty */
    }
    
    abstract boolean method185(int argument_1_);
    
    abstract void method186(int argument_2_, int argument_3_,
			    boolean argument_4_);
    
    static final void method187(byte argument) {
	if (Class245.anInt1784 != 0) {
	    try {
		if (++Skybox_Sub2_Sub1.anInt6394 > 2000) {
		    if (Statics.aClass307_2632 != null) {
			Statics.aClass307_2632.method3601(2);
			Statics.aClass307_2632 = null;
		    }
		    if (Class62_Sub3.anInt4372 >= 2) {
			Class245.anInt1784 = 0;
			MenuAction.anInt6282 = -5;
			return;
		    }
		    client.lobbyServer.method3749(43594);
		    Skybox_Sub2_Sub1.anInt6394 = 0;
		    Class62_Sub3.anInt4372++;
		    Class245.anInt1784 = 1;
		}
		if (Class245.anInt1784 == 1) {
		    Class93.aSignlinkRequest_715
			= client.lobbyServer
			      .method3746((byte) 104, Applet_Sub1.baseSignlink);
		    Class245.anInt1784 = 2;
		}
		if (Class245.anInt1784 == 2) {
		    if (Class93.aSignlinkRequest_715.status == 2)
			throw new IOException();
		    if (Class93.aSignlinkRequest_715.status != 1)
			return;
		    Statics.aClass307_2632
			= Class350_Sub2.method3858(-98,
						   (Socket) (Class93
							     .aSignlinkRequest_715
							     .result),
						   15000);
		    Class93.aSignlinkRequest_715 = null;
		    Statics.method531((byte) -99);
		    Class245.anInt1784 = 4;
		}
		if (Class245.anInt1784 == 4) {
		    if (Statics.aClass307_2632.method3603(1, 55)) {
			Statics.aClass307_2632.method3606
			    (-78, 1,
			     ((Packet)
			      Network.stream).data,
			     0);
			int anLocalInt = ((((Packet)
					    Network.stream)
					   .data[0])
					  & 0xff);
			Class245.anInt1784 = 0;
			MenuAction.anInt6282 = anLocalInt;
			Statics.aClass307_2632.method3601(2);
			Statics.aClass307_2632 = null;
		    }
		}
	    } catch (IOException ioexception) {
		if (Statics.aClass307_2632 != null) {
		    Statics.aClass307_2632.method3601(2);
		    Statics.aClass307_2632 = null;
		}
		if (Class62_Sub3.anInt4372 < 2) {
		    client.lobbyServer.method3749(43594);
		    Class245.anInt1784 = 1;
		    Skybox_Sub2_Sub1.anInt6394 = 0;
		    Class62_Sub3.anInt4372++;
		} else {
		    Class245.anInt1784 = 0;
		    MenuAction.anInt6282 = -4;
		}
	    }
	}
    }
    
    void method188(byte argument_5_) {
	/* empty */
    }
    
    abstract void method189(int argument_6_, boolean argument_7_);
    
    void method190(byte argument_8_) {
	/* empty */
    }
    
    void method191(byte argument_9_) {
	/* empty */
    }
    
    void method192(int argument_10_) {
	/* empty */
    }
    
    abstract void method193(boolean argument_11_, int argument_12_);
    
    void method194(int argument_13_) {
	/* empty */
    }
    
    abstract void method195(byte argument_14_);
    
    abstract void method196(int argument_15_, byte argument_16_,
			    Interface7 argument_17_);
    
    Class2(GraphicsToolkit_Sub2 argument_18_) {
	((Class2) this).aClass_ha_Sub2_56 = argument_18_;
    }
}
