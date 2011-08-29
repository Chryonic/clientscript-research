/* Class189_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class189_Sub3 extends Class189
{
    private Class368 aClass368_5643;
    static Class166 aClass166_5644;
    private Class368 aClass368_5645;
    private Class368 aClass368_5646;
    static int anInt5647;
    Class368 aClass368_5648;
    private Class368 aClass368_5649;
    private Class368 aClass368_5650;
    static boolean[] aBooleanArray5651 = new boolean[100];
    
    public final void method57(int argument_0_) {
	super.method57(126);
	Class253_Sub1 class253_sub1
	    = (Class253_Sub1) ((Class189) this).aClass253_3621;
	((Class189_Sub3) this).aClass368_5648
	    = Node_Sub47_Sub7.method1128(47,
            ((Class189) this).aJs5Store_3622,
            (((Class253_Sub1) class253_sub1)
                    .anInt5658));
	if (argument_0_ < 36)
	    method2878(-10, true, 18, 111, 116);
	aClass368_5645
	    = Node_Sub47_Sub7.method1128(47,
            ((Class189) this).aJs5Store_3622,
            (((Class253_Sub1) class253_sub1)
                    .anInt5657));
	aClass368_5649
	    = Node_Sub47_Sub7.method1128(47,
            ((Class189) this).aJs5Store_3622,
            (((Class253_Sub1) class253_sub1)
                    .anInt5661));
	aClass368_5643
	    = Node_Sub47_Sub7.method1128(47,
            ((Class189) this).aJs5Store_3622,
            (((Class253_Sub1) class253_sub1)
                    .anInt5659));
	aClass368_5650
	    = Node_Sub47_Sub7.method1128(47,
            ((Class189) this).aJs5Store_3622,
            (((Class253_Sub1) class253_sub1)
                    .anInt5662));
	aClass368_5646
	    = Node_Sub47_Sub7.method1128(47,
            ((Class189) this).aJs5Store_3622,
            (((Class253_Sub1) class253_sub1)
                    .anInt5660));
    }
    
    final void method2869(int argument_1_, boolean argument_2_,
			  int argument_3_, int argument_4_) {
	int anLocalInt = aClass368_5649.getWidth() + argument_4_;
	int anLocalInt_5_
	    = (argument_4_
	       + ((Class253) ((Class189) this).aClass253_3621).anInt3718
	       - aClass368_5643.getWidth());
	int anLocalInt_6_ = aClass368_5650.method4018() + argument_1_;
	int anLocalInt_7_
	    = (((Class253) ((Class189) this).aClass253_3621).anInt3711
	       + (argument_1_ - aClass368_5646.method4018()));
	int anLocalInt_8_ = anLocalInt_5_ - anLocalInt;
	int anLocalInt_9_ = anLocalInt_7_ - anLocalInt_6_;
	int anLocalInt_10_ = this.method2871(2048) * anLocalInt_8_ / 10000;
	int[] anLocalInts = new int[4];
	if (argument_3_ > 102) {
	    Class389.aGraphicsToolkit3281.getScissor(anLocalInts);
	    Class389.aGraphicsToolkit3281.setClip(anLocalInt, anLocalInt_7_, anLocalInt + anLocalInt_10_, anLocalInt_6_);
	    method2878(anLocalInt_8_, true, anLocalInt_6_, anLocalInt,
		       anLocalInt_9_);
	    Class389.aGraphicsToolkit3281.setClip(anLocalInt_10_ + anLocalInt, anLocalInt_7_, anLocalInt_5_, anLocalInt_6_);
	    aClass368_5645.method4023(anLocalInt, anLocalInt_6_, anLocalInt_8_,
				      anLocalInt_9_);
	    Class389.aGraphicsToolkit3281.setClip(anLocalInts[0], anLocalInts[3], anLocalInts[2], anLocalInts[1]);
	}
    }
    
    Class189_Sub3(Js5Store argument_11_, Js5Store argument_12_,
		  Class253_Sub1 argument_13_) {
	super(argument_11_, argument_12_, (Class253) argument_13_);
    }
    
    void method2878(int argument_14_, boolean argument_15_, int argument_16_,
		    int argument_17_, int argument_18_) {
	if (argument_15_ != true)
	    aClass368_5646 = null;
	((Class189_Sub3) this).aClass368_5648.method4023(argument_17_,
							 argument_16_,
							 argument_14_,
							 argument_18_);
    }
    
    final void method2873(boolean argument_19_, byte argument_20_,
			  int argument_21_, int argument_22_) {
	int anLocalInt = 27 % ((argument_20_ - 64) / 35);
	if (argument_19_) {
	    int[] anLocalInts = new int[4];
	    Class389.aGraphicsToolkit3281.getScissor(anLocalInts);
	    Class389.aGraphicsToolkit3281.setClip(argument_21_, (((Class253) ((Class189) this).aClass253_3621).anInt3711 + argument_22_), (argument_21_ + ((Class253) ((Class189) this).aClass253_3621).anInt3718), argument_22_);
	    int anLocalInt_23_ = aClass368_5649.getWidth();
	    int anLocalInt_24_ = aClass368_5649.method4018();
	    int anLocalInt_25_ = aClass368_5643.getWidth();
	    int anLocalInt_26_ = aClass368_5643.method4018();
	    aClass368_5649.method4014(argument_21_,
				      (-anLocalInt_24_
				       + (((Class253)
					   ((Class189) this).aClass253_3621)
					  .anInt3711)) / 2 + argument_22_);
	    aClass368_5643.method4014
		((-anLocalInt_25_
		  + (((Class253) ((Class189) this).aClass253_3621).anInt3718
		     + argument_21_)),
		 ((-anLocalInt_26_
		   + ((Class253) ((Class189) this).aClass253_3621).anInt3711)
		  / 2) + argument_22_);
	    Class389.aGraphicsToolkit3281.setClip(argument_21_, aClass368_5650.method4018() + argument_22_, (argument_21_ + ((Class253) ((Class189) this).aClass253_3621).anInt3718), argument_22_);
	    aClass368_5650.method4023
		(argument_21_ + anLocalInt_23_, argument_22_,
		 (-anLocalInt_25_ - anLocalInt_23_
		  + ((Class253) ((Class189) this).aClass253_3621).anInt3718),
		 ((Class253) ((Class189) this).aClass253_3621).anInt3711);
	    int anLocalInt_27_ = aClass368_5646.method4018();
	    Class389.aGraphicsToolkit3281.setClip(argument_21_, (argument_22_ + ((Class253) ((Class189) this).aClass253_3621).anInt3711), (((Class253) ((Class189) this).aClass253_3621).anInt3718 + argument_21_), (((Class253) ((Class189) this).aClass253_3621).anInt3711 + (argument_22_ - anLocalInt_27_)));
	    aClass368_5646.method4023
		(argument_21_ + anLocalInt_23_,
		 (argument_22_
		  + ((Class253) ((Class189) this).aClass253_3621).anInt3711
		  - anLocalInt_27_),
		 (-anLocalInt_23_
		  + ((Class253) ((Class189) this).aClass253_3621).anInt3718
		  - anLocalInt_25_),
		 ((Class253) ((Class189) this).aClass253_3621).anInt3711);
	    Class389.aGraphicsToolkit3281.setClip(anLocalInts[0], anLocalInts[3], anLocalInts[2], anLocalInts[1]);
	}
    }
    
    public final boolean method58(int argument_28_) {
	if (!super.method58(argument_28_))
	    return false;
	Class253_Sub1 class253_sub1
	    = (Class253_Sub1) ((Class189) this).aClass253_3621;
	if (!((Class189) this).aJs5Store_3622
		 .isFlatFile(((Class253_Sub1) class253_sub1).anInt5658))
	    return false;
	if (!((Class189) this).aJs5Store_3622
		 .isFlatFile(((Class253_Sub1) class253_sub1).anInt5657))
	    return false;
	if (!((Class189) this).aJs5Store_3622
		 .isFlatFile(((Class253_Sub1) class253_sub1).anInt5661))
	    return false;
	if (!((Class189) this).aJs5Store_3622.isFlatFile((((Class253_Sub1) class253_sub1).anInt5659)))
	    return false;
	if (!((Class189) this).aJs5Store_3622.isFlatFile((((Class253_Sub1) class253_sub1).anInt5662)))
	    return false;
	if (!((Class189) this).aJs5Store_3622
		 .isFlatFile(((Class253_Sub1) class253_sub1).anInt5660))
	    return false;
	return true;
    }
    
    public static void method2879(byte argument) {
	aBooleanArray5651 = null;
	aClass166_5644 = null;
    }
    
    static {
	aClass166_5644 = new Class166(29, 17);
    }
}
