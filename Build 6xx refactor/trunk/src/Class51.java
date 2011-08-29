/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;

final class Class51
{
    int anInt382;
    static int anInt383 = 0;
    static Class166 aClass166_384;
    private Class149 aClass149_385 = new Class149(64);
    private Js5Store aJs5Store_386;
    static int[] anIntArray388 = new int[32];
    int anInt389 = 0;
    
    static final void method468(int[] argument, int argument_0_,
				Object[] argument_1_, int argument_2_,
				int argument_3_) {
	if (argument_0_ < argument_3_) {
	    int anLocalInt = (argument_0_ + argument_3_) / 2;
	    int anLocalInt_4_ = argument_0_;
	    int anLocalInt_5_ = argument[anLocalInt];
	    argument[anLocalInt] = argument[argument_3_];
	    argument[argument_3_] = anLocalInt_5_;
	    Object object = argument_1_[anLocalInt];
	    argument_1_[anLocalInt] = argument_1_[argument_3_];
	    argument_1_[argument_3_] = object;
	    int anLocalInt_6_ = anLocalInt_5_ != 2147483647 ? 1 : 0;
	    for (int anLocalInt_7_ = argument_0_; anLocalInt_7_ < argument_3_;
		 anLocalInt_7_++) {
		if ((anLocalInt_7_ & anLocalInt_6_) + anLocalInt_5_
		    > argument[anLocalInt_7_]) {
		    int anLocalInt_8_ = argument[anLocalInt_7_];
		    argument[anLocalInt_7_] = argument[anLocalInt_4_];
		    argument[anLocalInt_4_] = anLocalInt_8_;
		    Object object_9_ = argument_1_[anLocalInt_7_];
		    argument_1_[anLocalInt_7_] = argument_1_[anLocalInt_4_];
		    argument_1_[anLocalInt_4_++] = object_9_;
		}
	    }
	    argument[argument_3_] = argument[anLocalInt_4_];
	    argument[anLocalInt_4_] = anLocalInt_5_;
	    argument_1_[argument_3_] = argument_1_[anLocalInt_4_];
	    argument_1_[anLocalInt_4_] = object;
	    method468(argument, argument_0_, argument_1_, 33,
		      anLocalInt_4_ - 1);
	    method468(argument, anLocalInt_4_ + 1, argument_1_, 112,
		      argument_3_);
	}
    }
    
    static final int method469(int argument, int argument_10_,
			       int argument_11_) {
	if (argument_11_ == -1)
	    return 12345678;
	argument_10_ = (argument_11_ & 0x7f) * argument_10_ >> 7;
	if (argument_10_ >= 2) {
	    if (argument_10_ > 126)
		argument_10_ = 126;
	} else
	    argument_10_ = 2;
	return (argument_11_ & 0xff80) + argument_10_;
    }
    
    static final int method470(int argument, byte argument_12_,
			       int argument_13_) {
	if (GlTexture_Sub4_Sub1.anInt6551 == -1)
	    return 1;
	if (argument_13_ != ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				.aClass62_Sub26_4295.method1464(78)) {
	    Node_Sub30.method860(-3,
                MultilanguageString.PROFILING
                        .getLocalizedString(client.language),
                true, argument_13_);
	    if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		    .aClass62_Sub26_4295.method1464(52)
		!= argument_13_)
		return -1;
	}
	try {
	    Dimension dimension = Applet_Sub1.gameCanvas.getSize();
	    Class62_Sub10.method1395(Node_Sub47_Sub9.aAbstractFont_6203,
				     Class389.aGraphicsToolkit3281,
				     Statics.aClass76_3433, true,
				     argument_12_ - 96,
				     MultilanguageString.PROFILING
					 .getLocalizedString(client.language));
	    Class101 class101
		= tia_sub_35_Sub1DoublyLinked.method1219(2085750768, Node_Sub49.aJs5Store_4292, GlTexture_Sub4_Sub1.anInt6551, 0);
	    long l = Applet_Sub1.getGameTime();
	    Class389.aGraphicsToolkit3281.clearClip();
	    Class41.aClass350_304.method3825(0, LightingManager.attenuationOffset, 0);
	    Class389.aGraphicsToolkit3281.method2069(Class41.aClass350_304);
	    Class389.aGraphicsToolkit3281.DA(dimension.width / 2,
				      dimension.height / 2, 512, 512);
	    Class389.aGraphicsToolkit3281.setAmbientIntensity(1.0F);
	    Class389.aGraphicsToolkit3281.setSun(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
	    Class167 class167
		= Class389.aGraphicsToolkit3281.method2057(class101, 2048, 64, 64,
						    768);
	    int anLocalInt = 0;
	while_47_:
	    for (int anLocalInt_14_ = 0; anLocalInt_14_ < 500;
		 anLocalInt_14_++) {
		Class389.aGraphicsToolkit3281.clear(0);
		Class389.aGraphicsToolkit3281.clearDepthBuffer();
		for (int anLocalInt_15_ = 15; anLocalInt_15_ >= 0;
		     anLocalInt_15_--) {
		    for (int anLocalInt_16_ = 0;
			 anLocalInt_15_ >= anLocalInt_16_; anLocalInt_16_++) {
			DoublyLinkedNodeP2_Sub10.aClass350_4594.method3825
			    ((int) (((float) anLocalInt_16_
				     - (float) anLocalInt_15_ / 2.0F)
				    * (float) Class110.anInt909),
			     0, Class110.anInt909 * (anLocalInt_15_ + 1));
			anLocalInt++;
			class167.method2640(DoublyLinkedNodeP2_Sub10.aClass350_4594,
					    null, 0);
			if (Applet_Sub1.getGameTime() - l >= (long) argument)
			    break while_47_;
		    }
		}
	    }
	    if (argument_12_ != 28)
		method469(-93, -106, 40);
	    Class389.aGraphicsToolkit3281.finish();
	    long l_17_
		= (long) (anLocalInt * 1000) / (-l + Applet_Sub1.getGameTime());
	    Class389.aGraphicsToolkit3281.clear(0);
	    Class389.aGraphicsToolkit3281.clearDepthBuffer();
	    return (int) l_17_;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    return -1;
	}
    }
    
    final void method471(int argument_18_) {
	synchronized (aClass149_385) {
	    aClass149_385.clear((byte) -3);
	}
    }
    
    public static void method472(int argument) {
	aClass166_384 = null;
	anIntArray388 = null;
	MapRelated.mapCoordinates = null;
    }
    
    static final void method473(int argument, int argument_19_,
				int argument_20_) {
	if (Statics.anInt5035 != argument) {
	    if (argument_19_ < 0) {
		for (int anLocalInt = 0; anLocalInt < 16; anLocalInt++)
		    Class123.anIntArray998[anLocalInt] = argument_20_;
	    } else
		Class123.anIntArray998[argument_19_] = argument_20_;
	}
	GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546.method610(argument_20_,
							     argument_19_, 0);
    }
    
    final void method474(byte argument_21_) {
	synchronized (aClass149_385) {
	    aClass149_385.method2540(-127);
	}
    }
    
    final void method475(int argument_22_, int argument_23_) {
	synchronized (aClass149_385) {
	    aClass149_385.method2534(argument_22_, (byte) -8);
	}
    }
    
    final Class50 method476(int argument_24_, byte argument_25_) {
	Class50 class50;
	synchronized (aClass149_385) {
	    class50
		= (Class50) aClass149_385.get((long) argument_24_);
	}
	if (class50 != null)
	    return class50;
	byte[] anLocalInts;
	synchronized (aJs5Store_386) {
	    anLocalInts = aJs5Store_386.getData(4, argument_24_);
	}
	class50 = new Class50();
	((Class50) class50).anInt371 = argument_24_;
	((Class50) class50).aClass51_368 = this;
	if (anLocalInts != null)
	    class50.method461(-7, new Packet(anLocalInts));
	class50.method465(127);
	synchronized (aClass149_385) {
	    aClass149_385.put(class50, (long) argument_24_);
	}
	return class50;
    }
    
    Class51(GameEnum argument_26_, int argument_27_, Js5Store argument_28_) {
	aJs5Store_386 = argument_28_;
	((Class51) this).anInt382 = aJs5Store_386.getSubFileCount(4);
    }
    
    static {
	aClass166_384 = new Class166(101, 0);
    }
}
