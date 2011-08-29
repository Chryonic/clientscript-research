/* Class208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class208
{
    GlTexture_Sub4[] aClass142_Sub4Array1488 = null;
    GlTexture_Sub3 aClass142_Sub3_1489 = null;
    boolean aBoolean1490;
    GlTexture_Sub3 aClass142_Sub3_1491 = null;
    static byte[] aByteArray1492 = new byte[32896];
    GlTexture_Sub4[] aClass142_Sub4Array1493 = null;
    static int anInt1494;
    GlTexture_Sub3 aClass142_Sub3_1495 = null;

    public static void method2951(int argument) {
	aByteArray1492 = null;
    }
    
    static final int method2952(int argument) {
	return client.currentLoadingBar.method2833();
    }
    
    Class208(GlToolkit argument_1_) {
	((Class208) this).aBoolean1490
	    = ((GlToolkit) argument_1_).haveTexture3D;
	Class169.method2733((byte) -116, argument_1_);
	if (((Class208) this).aBoolean1490) {
	    byte[] anLocalInts
		= Class183_Sub1.unwrap(Class119.anObject972, false, 16);
	    ((Class208) this).aClass142_Sub3_1491
		= new GlTexture_Sub3(argument_1_, 6410, 128, 128, 16,
				    anLocalInts, 6410);
	    anLocalInts
		= Class183_Sub1.unwrap(Class195.anObject1433, false, 16);
	    ((Class208) this).aClass142_Sub3_1489
		= new GlTexture_Sub3(argument_1_, 6410, 128, 128, 16,
				    anLocalInts, 6410);
	    Class196 class196 = ((GlToolkit) argument_1_).aClass196_4848;
	    if (class196.method2901((byte) 36)) {
		anLocalInts
		    = Class183_Sub1.unwrap(GameServer.anObject2744, false, 16);
		((Class208) this).aClass142_Sub3_1495
		    = new GlTexture_Sub3(argument_1_, 6408, 128, 128, 16);
		GlTexture_Sub3 class142_sub3
		    = new GlTexture_Sub3(argument_1_, 6409, 128, 128, 16,
					anLocalInts, 6409);
		if (class196.method2903((byte) -85, 2.0F,
					((Class208) this).aClass142_Sub3_1495,
					class142_sub3))
		    ((Class208) this).aClass142_Sub3_1495
			.generateMipMaps();
		else {
		    ((Class208) this).aClass142_Sub3_1495.deleteFromServer();
		    ((Class208) this).aClass142_Sub3_1495 = null;
		}
		class142_sub3.deleteFromServer();
	    }
	} else {
	    ((Class208) this).aClass142_Sub4Array1493 = new GlTexture_Sub4[16];
	    for (int anLocalInt = 0; anLocalInt < 16; anLocalInt++) {
		byte[] anLocalInts
		    = Class246.method3199((byte) 85, 32768,
					  anLocalInt * 128 * 256,
					  Class119.anObject972);
		((Class208) this).aClass142_Sub4Array1493[anLocalInt]
		    = new GlTexture_Sub4(argument_1_, 3553, 6410, 128, 128,
					true, anLocalInts, 6410, false);
	    }
	    ((Class208) this).aClass142_Sub4Array1488 = new GlTexture_Sub4[16];
	    for (int anLocalInt = 0; anLocalInt < 16; anLocalInt++) {
		byte[] anLocalInts
		    = Class246.method3199((byte) 95, 32768,
					  anLocalInt * 2 * 16384,
					  Class195.anObject1433);
		((Class208) this).aClass142_Sub4Array1488[anLocalInt]
		    = new GlTexture_Sub4(argument_1_, 3553, 6410, 128, 128,
					true, anLocalInts, 6410, false);
	    }
	}
    }
    
    static {
	int anLocalInt = 0;
	for (int anLocalInt_2_ = 0; anLocalInt_2_ < 256; anLocalInt_2_++) {
	    for (int anLocalInt_3_ = 0; anLocalInt_2_ >= anLocalInt_3_;
		 anLocalInt_3_++)
		aByteArray1492[anLocalInt++]
		    = (byte) (int) (255.0
				    / (Math.sqrt
				       ((double) ((float) ((anLocalInt_3_
							    * anLocalInt_3_)
							   + 65535
							   + (anLocalInt_2_
							      * anLocalInt_2_))
						  / 65535.0F))));
	}
    }
}
