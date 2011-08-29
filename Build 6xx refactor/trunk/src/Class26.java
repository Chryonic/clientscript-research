/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class Class26
{
    private static short[] aShortArray169;
    GameEnum aGameEnum_170;
    Js5Store aJs5Store_171;
    static short[][] aShortArrayArray172;
    static int[] anIntArray173 = new int[14];
    private static short[] aShortArray174
	= { -10304, 9104, 25485, 4620, 4540 };
    boolean aBoolean175;
    private Js5Store aJs5Store_176;
    private static short[] aShortArray177;
    private Class149 aClass149_178 = new Class149(64);
    Class149 aClass149_179 = new Class149(50);
    static int anInt180;
    Class149 aClass149_181 = new Class149(5);
    int anInt182;
    
    final Class291 method343(byte argument_0_, int argument_1_) {
	Class291 class291;
	synchronized (aClass149_178) {
	    class291
		= (Class291) aClass149_178.get((long) argument_1_);
	}
	if (class291 != null)
	    return class291;
	byte[] anLocalInts;
	synchronized (aJs5Store_176) {
	    anLocalInts
		= (aJs5Store_176.getData(Node_Sub31_Sub7.method893(argument_1_, -1196763737), Class68.method1516(argument_1_, 110)));
	}
	class291 = new Class291();
	((Class291) class291).aClass26_2369 = this;
	((Class291) class291).anInt2375 = argument_1_;
	if (anLocalInts != null)
	    class291.method3490(19918, new Packet(anLocalInts));
	class291.method3486((byte) -123);
	synchronized (aClass149_178) {
	    aClass149_178.put(class291, (long) argument_1_);
	}
	return class291;
    }
    
    final void method344(int argument_2_, int argument_3_) {
	((Class26) this).anInt182 = argument_2_;
	synchronized (((Class26) this).aClass149_179) {
	    ((Class26) this).aClass149_179.clear((byte) -3);
	}
	synchronized (((Class26) this).aClass149_181) {
	    ((Class26) this).aClass149_181.clear((byte) -3);
	}
    }
    
    final void method345(byte argument_4_) {
	synchronized (((Class26) this).aClass149_179) {
	    ((Class26) this).aClass149_179.clear((byte) -3);
	}
	synchronized (((Class26) this).aClass149_181) {
	    ((Class26) this).aClass149_181.clear((byte) -3);
	}
    }
    
    static final void method346(int argument) {
	Class256.method3280(dba_sub_772.aRsInterface_4345, true);
	Statics.anInt5604++;
	if (!Statics.aBoolean1729 || !GlImageSkybox.aBoolean829) {
	    if (Statics.anInt5604 > 1)
		dba_sub_772.aRsInterface_4345 = null;
	} else {
	    int anLocalInt = 0;
	    int anLocalInt_5_ = 0;
	    if (Class52.aBoolean391) {
		anLocalInt = Node_Sub52.method1319(99);
		anLocalInt_5_ = Class82.method1596(-2);
	    }
	    int anLocalInt_6_
		= client.mouseHandler.getX() + anLocalInt;
	    int anLocalInt_7_
		= client.mouseHandler.getY() + anLocalInt_5_;
	    anLocalInt_6_ -= Node_Sub31_Sub15_Sub1.anInt6637;
	    anLocalInt_7_ -= GlImageSkybox.anInt839;
	    if (anLocalInt_6_ < Statics.anInt3517)
		anLocalInt_6_ = Statics.anInt3517;
	    if (anLocalInt_7_ < Class22.anInt140)
		anLocalInt_7_ = Class22.anInt140;
	    if ((((RsInterface) dba_sub_772.aRsInterface_4345).renderWidth
		 + anLocalInt_6_)
		> (((RsInterface) Class235.aRsInterface_1717).renderWidth
		   + Statics.anInt3517))
		anLocalInt_6_
		    = (-((RsInterface) dba_sub_772.aRsInterface_4345).renderWidth
		       + (Statics.anInt3517
			  + ((RsInterface) Class235.aRsInterface_1717).renderWidth));
	    if ((((RsInterface) Class235.aRsInterface_1717).renderHeight
		 + Class22.anInt140)
		< (((RsInterface) dba_sub_772.aRsInterface_4345).renderHeight
		   + anLocalInt_7_))
		anLocalInt_7_
		    = (-((RsInterface) dba_sub_772.aRsInterface_4345).renderHeight
		       + Class22.anInt140
		       + ((RsInterface) Class235.aRsInterface_1717).renderHeight);
	    int anLocalInt_8_ = (((RsInterface) Class235.aRsInterface_1717).anInt1950
				 + anLocalInt_6_ - Statics.anInt3517);
	    int anLocalInt_9_ = (((RsInterface) Class235.aRsInterface_1717).anInt1838
				 - Class22.anInt140 + anLocalInt_7_);
	    if (client.mouseHandler.isAnyButtonDown()) {
		if (((RsInterface) dba_sub_772.aRsInterface_4345).anInt1961
		    < Statics.anInt5604) {
		    int anLocalInt_10_
			= -Statics.anInt5581 + anLocalInt_6_;
		    int anLocalInt_11_ = -Class253.anInt3721 + anLocalInt_7_;
		    if ((((RsInterface) dba_sub_772.aRsInterface_4345).anInt1901
			 < anLocalInt_10_)
			|| (anLocalInt_10_
			    < -(((RsInterface) dba_sub_772.aRsInterface_4345)
				.anInt1901))
			|| (((RsInterface) dba_sub_772.aRsInterface_4345).anInt1901
			    < anLocalInt_11_)
			|| (anLocalInt_11_
			    < -(((RsInterface) dba_sub_772.aRsInterface_4345)
				.anInt1901)))
			Packet.aBoolean4121 = true;
		}
		if ((((RsInterface) dba_sub_772.aRsInterface_4345).anObjectArray1879
		     != null)
		    && Packet.aBoolean4121) {
		    Cs2Trigger class59_sub27 = new Cs2Trigger();
		    ((Cs2Trigger) class59_sub27).anInt4108 = anLocalInt_9_;
		    ((Cs2Trigger) class59_sub27).anInt4105 = anLocalInt_8_;
		    ((Cs2Trigger) class59_sub27).parameters
			= (((RsInterface) dba_sub_772.aRsInterface_4345)
			   .anObjectArray1879);
		    ((Cs2Trigger) class59_sub27).aRsInterface_4115
			= dba_sub_772.aRsInterface_4345;
		    Cs2Runtime.executeTrigger(class59_sub27);
		}
	    } else {
		if (!Packet.aBoolean4121) {
		    if ((Class121.anInt983 != 1
			 && !Class62_Sub20.method1438(-124))
			|| Class62_Sub12.anInt4402 <= 2) {
			if (Class256_Sub3.method3287(true))
			    Node_Sub15.method693
				(GlImageSkybox.anInt839 + Class253.anInt3721,
                        (Statics.anInt5581
                                + Node_Sub31_Sub15_Sub1.anInt6637),
                        106);
		    } else
			Node_Sub15.method693((GlImageSkybox.anInt839
                    + Class253.anInt3721),
                    ((Node_Sub31_Sub15_Sub1
                            .anInt6637)
                            + Statics.anInt5581),
                    -123);
		} else {
		    Class362.method3964(0);
		    if ((((RsInterface) dba_sub_772.aRsInterface_4345)
			 .anObjectArray1839)
			!= null) {
			Cs2Trigger class59_sub27 = new Cs2Trigger();
			((Cs2Trigger) class59_sub27).aRsInterface_4115
			    = dba_sub_772.aRsInterface_4345;
			((Cs2Trigger) class59_sub27).aRsInterface_4114
			    = Class131.aRsInterface_1061;
			((Cs2Trigger) class59_sub27).anInt4105
			    = anLocalInt_8_;
			((Cs2Trigger) class59_sub27).anInt4108
			    = anLocalInt_9_;
			((Cs2Trigger) class59_sub27).parameters
			    = (((RsInterface) dba_sub_772.aRsInterface_4345)
			       .anObjectArray1839);
			Cs2Runtime.executeTrigger(class59_sub27);
		    }
		    if (Class131.aRsInterface_1061 != null
			&& (client.method121(dba_sub_772.aRsInterface_4345)
			    != null))
			Gl2Water0.method205(dba_sub_772.aRsInterface_4345, (byte) 105, Class131.aRsInterface_1061);
		}
		dba_sub_772.aRsInterface_4345 = null;
	    }
	}
    }
    
    final void method347(byte argument_12_) {
	synchronized (aClass149_178) {
	    aClass149_178.method2540(-128);
	}
	synchronized (((Class26) this).aClass149_179) {
	    ((Class26) this).aClass149_179.method2540(-121);
	}
	synchronized (((Class26) this).aClass149_181) {
	    ((Class26) this).aClass149_181.method2540(-123);
	}
    }
    
    final void method348(int argument_13_, int argument_14_) {
	synchronized (aClass149_178) {
	    aClass149_178.method2534(argument_14_, (byte) -8);
	}
	synchronized (((Class26) this).aClass149_179) {
	    ((Class26) this).aClass149_179.method2534(argument_14_, (byte) -8);
	}
	synchronized (((Class26) this).aClass149_181) {
	    ((Class26) this).aClass149_181.method2534(argument_14_, (byte) -8);
	}
    }
    
    public static void method349(int argument) {
	aShortArray174 = null;
	aShortArray177 = null;
	anIntArray173 = null;
	aShortArrayArray172 = null;
	aShortArray169 = null;
    }
    
    final void method350(int argument_15_) {
	synchronized (aClass149_178) {
	    aClass149_178.clear((byte) -3);
	}
	synchronized (((Class26) this).aClass149_179) {
	    ((Class26) this).aClass149_179.clear((byte) -3);
	}
	synchronized (((Class26) this).aClass149_181) {
	    ((Class26) this).aClass149_181.clear((byte) -3);
	}
    }
    
    final void method351(byte argument_16_, boolean argument_17_) {
	if (!argument_17_ != !((Class26) this).aBoolean175) {
	    ((Class26) this).aBoolean175 = argument_17_;
	    method350(-47);
	}
    }
    
    static final int method352(boolean argument) {
	GraphicsToolkit graphicsToolkit = Class389.aGraphicsToolkit3281;
	boolean anLocalBoolean = false;
	if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		.aClass62_Sub26_4295.method1464(88)
	    != 0) {
	    Canvas canvas = new Canvas();
	    canvas.setSize(100, 100);
	    anLocalBoolean = true;
	    graphicsToolkit
		= Class314.method3626(0, null, null, (byte) -83, 0, canvas);
	}
	long l = Applet_Sub1.getGameTime();
	for (int anLocalInt = 0; anLocalInt < 10000; anLocalInt++)
	    graphicsToolkit.draw3DTriangle(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
	int anLocalInt = (int) (-l + Applet_Sub1.getGameTime());
	graphicsToolkit.method2020(57, 100, 0, 100, 0, -16777216);
	if (anLocalBoolean)
	    graphicsToolkit.method2027((byte) 120);
	return anLocalInt;
    }
    
    Class26(GameEnum argument_18_, int argument_19_, boolean argument_20_,
	    Js5Store argument_21_, Js5Store argument_22_) {
	((Class26) this).aGameEnum_170 = argument_18_;
	((Class26) this).aBoolean175 = argument_20_;
	aJs5Store_176 = argument_21_;
	((Class26) this).aJs5Store_171 = argument_22_;
	if (aJs5Store_176 != null) {
	    int anLocalInt = aJs5Store_176.getRealSubFileCount() - 1;
	    aJs5Store_176.getSubFileCount(anLocalInt);
	}
    }
    
    static {
	aShortArray169 = new short[] { 6798, 8741, 25238, 4626, 4550 };
	aShortArray177 = new short[] { -1, -1, -1, -1, -1 };
	aShortArrayArray172
	    = new short[][] { aShortArray169, aShortArray174, aShortArray177 };
	anInt180 = 0;
    }
}
