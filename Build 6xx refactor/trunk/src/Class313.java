/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class313
{
    static Js5Store aJs5Store_2596;
    private Class149 aClass149_2597 = new Class149(64);
    private Js5Store aJs5Store_2598;
    static int[] anIntArray2599 = new int[32];
    
    static final void method3614() {
	for (;;) {
	    boolean anLocalBoolean = true;
	    for (int anLocalInt = 0;
		 anLocalInt < Node_Sub32_Sub4.aClass380Array6085.length;
		 anLocalInt++) {
		if (!Node_Sub32_Sub4.aClass380Array6085[anLocalInt]
			 .method4103()) {
		    synchronized (Node_Sub32_Sub4.aClass380Array6085
				  [anLocalInt]) {
			Node_Sub32_Sub4.aClass380Array6085[anLocalInt]
			    .notify();
		    }
		    anLocalBoolean = false;
		} else
		    Class350.aLongArray2927[anLocalInt]
			= Node_Sub32_Sub4.aClass380Array6085[anLocalInt]
			      .method4100();
	    }
	    if (anLocalBoolean)
		break;
	    try {
		Timing.sleep(1L);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	Node_Sub32_Sub4.aClass380Array6085
	    [Node_Sub32_Sub4.aClass380Array6085.length - 1].method4104();
	Statics.method136(1);
	for (;;) {
	    boolean anLocalBoolean = true;
	    for (int anLocalInt = 0;
		 anLocalInt < Node_Sub32_Sub4.aClass380Array6085.length - 1;
		 anLocalInt++) {
		if (!Node_Sub32_Sub4.aClass380Array6085[anLocalInt]
			 .method4103()) {
		    synchronized (Node_Sub32_Sub4.aClass380Array6085
				  [anLocalInt]) {
			Node_Sub32_Sub4.aClass380Array6085[anLocalInt]
			    .notify();
		    }
		    anLocalBoolean = false;
		}
	    }
	    if (anLocalBoolean)
		break;
	    try {
		Timing.sleep(1L);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	for (int anLocalInt = 1;
	     anLocalInt < Node_Sub32_Sub4.aClass380Array6085.length - 2;
	     anLocalInt++)
	    Node_Sub32_Sub4.aClass380Array6085[anLocalInt].method4104();
	Statics.method136(2);
	while (!Node_Sub32_Sub4.aClass380Array6085[0].method4103()) {
	    synchronized (Node_Sub32_Sub4.aClass380Array6085[0]) {
		Node_Sub32_Sub4.aClass380Array6085[0].notify();
	    }
	    try {
		Timing.sleep(1L);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	Node_Sub32_Sub4.aClass380Array6085[0].method4104();
    }
    
    static final void method3615(byte argument) {
	if (Class201.aByteArray1448 == null) {
	    if (Class141.anInt1099 == -1)
		Class48.method456(Class276.aString2215, Statics.aString2295,
				  Node_Sub13.anInt3978, 113);
	    else
		Class201.method2919((byte) -38, Node_Sub13.anInt3978);
	} else
	    Node_Sub39.method1073(Node_Sub13.anInt3978, (byte) -43);
    }
    
    static final void method3616(int argument, int argument_0_) {
	if (RsInterface.isAvailable(argument_0_))
	    Class113.method2361(-1, (RsInterface.anInterfaces
				     [argument_0_]), false);
    }
    
    public static void method3617(int argument) {
	aJs5Store_2596 = null;
	anIntArray2599 = null;
    }
    
    final void method3618(int argument_1_, byte argument_2_) {
	synchronized (aClass149_2597) {
	    aClass149_2597.method2534(argument_1_, (byte) -8);
	}
    }
    
    final void method3619(byte argument_3_) {
	synchronized (aClass149_2597) {
	    aClass149_2597.method2540(84);
	}
    }

    final void method3621(byte argument_7_) {
	synchronized (aClass149_2597) {
	    aClass149_2597.clear((byte) -3);
	}
    }
    
    static final void method3622(DoublyLinkedNodeP2_Sub2 argument, int argument_8_,
				 Class367 argument_9_, int argument_10_) {
	if (Class105.anInt861 < 50
	    && (argument_9_ != null
		&& ((Class367) argument_9_).anIntArrayArray3100 != null
		&& (((Class367) argument_9_).anIntArrayArray3100.length
		    > argument_10_)
		&& (((Class367) argument_9_).anIntArrayArray3100[argument_10_]
		    != null))) {
	    int anLocalInt = (((Class367) argument_9_).anIntArrayArray3100
			      [argument_10_][0]);
	    int anLocalInt_11_ = anLocalInt >> 8;
	    int anLocalInt_12_ = (anLocalInt & 0xf0) >> 5;
	    if ((((Class367) argument_9_).anIntArrayArray3100
		 [argument_10_]).length
		> 1) {
		int anLocalInt_13_
		    = (int) (Math.random() * (double) (((Class367) argument_9_)
						       .anIntArrayArray3100
						       [argument_10_]).length);
		if (anLocalInt_13_ > 0)
		    anLocalInt_11_
			= (((Class367) argument_9_).anIntArrayArray3100
			   [argument_10_][anLocalInt_13_]);
	    }
	    int anLocalInt_14_ = anLocalInt & 0x1f;
	    int anLocalInt_15_ = 256;
	    if (((Class367) argument_9_).anIntArray3111 != null
		&& ((Class367) argument_9_).anIntArray3093 != null)
		anLocalInt_15_
		    = ((int) (Math.random()
			      * (double) ((((Class367) argument_9_)
					   .anIntArray3093[argument_10_])
					  - (((Class367) argument_9_)
					     .anIntArray3111[argument_10_])))
		       + (((Class367) argument_9_).anIntArray3111
			  [argument_10_]));
	    int anLocalInt_16_
		= (((Class367) argument_9_).anIntArray3108 == null ? 255
		   : ((Class367) argument_9_).anIntArray3108[argument_10_]);
	    if (anLocalInt_14_ == 0) {
		if (argument == Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587) {
		    if (!((Class367) argument_9_).aBoolean3102)
			Class165.method2629(anLocalInt_16_, anLocalInt_11_, 0,
					    anLocalInt_12_, anLocalInt_15_,
					    2760);
		    else
			Statics.method2520(false, 0, anLocalInt_12_, argument_8_ + 97, anLocalInt_11_, anLocalInt_16_, anLocalInt_15_);
		}
	    } else if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			   .aClass62_Sub22_4303.method1446(118)
		       != 0) {
		int anLocalInt_17_
		    = ((DoublyLinkedNodeP2_Sub2) argument).worldX - 256 >> 9;
		int anLocalInt_18_
		    = ((DoublyLinkedNodeP2_Sub2) argument).worldZ - 256 >> 9;
		int anLocalInt_19_
		    = (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587 == argument
		       ? 0
		       : (anLocalInt_14_
			  + (((DoublyLinkedNodeP2_Sub2) argument).lightingHL << 24)
			  + ((anLocalInt_17_ << 16) + (anLocalInt_18_ << 8))));
		Class131.aClass169Array1059[Class105.anInt861++]
		    = new Class169((((Class367) argument_9_).aBoolean3102
				    ? (byte) 2 : (byte) 1),
				   anLocalInt_11_, anLocalInt_12_, argument_8_,
				   anLocalInt_16_, anLocalInt_19_,
				   anLocalInt_15_, argument);
	    }
	}
    }
    
    final Class351 method3623(byte argument_20_, int argument_21_) {
	Class351 class351;
	synchronized (aClass149_2597) {
	    class351
		= (Class351) aClass149_2597.get((long) argument_21_);
	}
	if (class351 != null)
	    return class351;
	byte[] anLocalInts;
	synchronized (aJs5Store_2598) {
	    anLocalInts = aJs5Store_2598.getData(35, argument_21_);
	}
	class351 = new Class351();
	if (anLocalInts != null)
	    class351.method3877(new Packet(anLocalInts), false);
	class351.method3878(-2);
	synchronized (aClass149_2597) {
	    aClass149_2597.put(class351, (long) argument_21_);
	}
	return class351;
    }
    
    Class313(GameEnum argument_22_, int argument_23_, Js5Store argument_24_) {
	aJs5Store_2598 = argument_24_;
	if (aJs5Store_2598 != null)
	    aJs5Store_2598.getSubFileCount(35);
    }
    
    static final boolean method3624(boolean argument) {
	try {
	    if (Statics.anInt5035 == 2) {
		if (Class91.aClass59_Sub17_703 == null) {
		    Class91.aClass59_Sub17_703
			= Node_Sub17.method704(Class350_Sub1.aJs5Store_5432,
                    Statics.anInt3525,
                    Class281.anInt2272);
		    if (Class91.aClass59_Sub17_703 == null)
			return false;
		}
		if (Class2_Sub11.aClass215_3829 == null)
		    Class2_Sub11.aClass215_3829
			= new Class215(Node_Sub31_Sub35.aJs5Store_6012,
				       DoublyLinkedNode_Sub51_Sub8.aJs5Store_6261);
		Node_Sub9_Sub2 class59_sub9_sub2
		    = GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546;
		if (Class256_Sub3.aClass59_Sub9_Sub2_5631 != null)
		    class59_sub9_sub2 = Class256_Sub3.aClass59_Sub9_Sub2_5631;
		if (class59_sub9_sub2.method612(Class2_Sub11.aClass215_3829,
						argument,
						Class91.aClass59_Sub17_703,
						22050,
						Class338.aJs5Store_2766)) {
		    GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546
			= class59_sub9_sub2;
		    GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546.method622(127);
		    if (Class121.anInt984 <= 0) {
			Statics.anInt5035 = 0;
			GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546
			    .method590((byte) -126, Class316.anInt2617);
			for (int anLocalInt = 0;
			     anLocalInt < Class123.anIntArray998.length;
			     anLocalInt++) {
			    GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546
				.method610
				(Class123.anIntArray998[anLocalInt],
				 anLocalInt, 0);
			    Class123.anIntArray998[anLocalInt] = 255;
			}
		    } else {
			Statics.anInt5035 = 3;
			GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546.method590
			    ((byte) -64,
			     (Class316.anInt2617 >= Class121.anInt984
			      ? Class121.anInt984 : Class316.anInt2617));
			for (int anLocalInt = 0;
			     Class123.anIntArray998.length > anLocalInt;
			     anLocalInt++) {
			    GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546
				.method610
				(Class123.anIntArray998[anLocalInt],
				 anLocalInt, 0);
			    Class123.anIntArray998[anLocalInt] = 255;
			}
		    }
		    if (Class256_Sub3.aClass59_Sub9_Sub2_5631 == null) {
			if (Node_Sub15.aLong3991 <= 0L)
			    GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546
				.method618
				(Statics.aBoolean4155,
				 Class91.aClass59_Sub17_703, -2);
			else
			    GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546
				.method614
				(Node_Sub15.aLong3991, true,
				 Statics.aBoolean4155,
				 Class91.aClass59_Sub17_703, false);
		    }
		    if (Node_Sub47_Sub7.aClass112_6191 != null)
			Node_Sub47_Sub7.aClass112_6191.method2003
			    (GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546,
			     (byte) 80);
		    Node_Sub15.aLong3991 = 0L;
		    Class91.aClass59_Sub17_703 = null;
		    Class2_Sub11.aClass215_3829 = null;
		    Class256_Sub3.aClass59_Sub9_Sub2_5631 = null;
		    Class350_Sub1.aJs5Store_5432 = null;
		    return true;
		}
	    }
	    if (argument != true)
		method3617(84);
	} catch (Exception exception) {
	    exception.printStackTrace();
	    GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546.method617(10293);
	    Class2_Sub11.aClass215_3829 = null;
	    Class91.aClass59_Sub17_703 = null;
	    Statics.anInt5035 = 0;
	    Class256_Sub3.aClass59_Sub9_Sub2_5631 = null;
	    Class350_Sub1.aJs5Store_5432 = null;
	}
	return false;
    }
}
