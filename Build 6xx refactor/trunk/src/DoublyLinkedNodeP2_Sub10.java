/* Class104_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub10 extends DoublyLinkedNodeP2
{
    boolean aBoolean4592;
    static Class350 aClass350_4594;
    DoublyLinkedNodeP2_Sub9[] aClass104_Sub9Array4595;
    DoublyLinkedNodeP2_Sub2 aClass104_Sub2_4596;
    static int anInt4598 = 0;
    static int[][] anIntArrayArray4599;
    static Js5Store aJs5Store_4600;
    static String[] aStringArray4601;
    
    final boolean method1943(int argument_0_, int argument_1_, int argument_2_,
			     GraphicsToolkit argument_3_) {
	int anLocalInt
	    = ((DoublyLinkedNodeP2_Sub10) this).aClass104_Sub2_4596.method1779(true);
	if (((DoublyLinkedNodeP2_Sub10) this).aClass104_Sub9Array4595 != null) {
	    for (int anLocalInt_4_ = 0;
		 (((DoublyLinkedNodeP2_Sub10) this).aClass104_Sub9Array4595.length
		  > anLocalInt_4_);
		 anLocalInt_4_++) {
		((DoublyLinkedNodeP2_Sub9) (((DoublyLinkedNodeP2_Sub10) this)
				  .aClass104_Sub9Array4595
				  [anLocalInt_4_])).anInt4586
		    <<= anLocalInt;
		if (((DoublyLinkedNodeP2_Sub10) this).aClass104_Sub9Array4595
			[anLocalInt_4_].method1942(argument_0_, argument_2_)
		    && (((DoublyLinkedNodeP2_Sub10) this).aClass104_Sub2_4596.method1771
			(4161, argument_2_, argument_0_, argument_3_))) {
		    ((DoublyLinkedNodeP2_Sub9) (((DoublyLinkedNodeP2_Sub10) this)
				      .aClass104_Sub9Array4595
				      [anLocalInt_4_])).anInt4586
			>>= anLocalInt;
		    return true;
		}
		((DoublyLinkedNodeP2_Sub9) (((DoublyLinkedNodeP2_Sub10) this)
				  .aClass104_Sub9Array4595
				  [anLocalInt_4_])).anInt4586
		    >>= anLocalInt;
	    }
	}
	return false;
    }
    
    public static void method1944(byte argument) {
	GameEnum.GAME3 = null;
	aJs5Store_4600 = null;
	aStringArray4601 = null;
	anIntArrayArray4599 = null;
	aClass350_4594 = null;
	TestingStageEnum.WTI = null;
    }
    
    static final void method1945(int argument, int argument_5_,
				 byte argument_6_, int argument_7_) {
	if (argument_6_ >= -117)
	    aClass350_4594 = null;
	argument_5_
	    = ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		  .aClass62_Sub22_4319.method1446(96) * argument_5_ >> 8;
	if (argument_5_ != 0 && argument != -1) {
	    if (!Class154.aBoolean3618 && Statics.anInt3514 != -1
		&& Class62_Sub21.method1444(-96)
		&& !dba_sub_772.method1307((byte) 124)) {
		Statics.aClass59_Sub9_Sub2_6647
		    = Class_s_Sub2.method3553(-86);
		Node_Sub9_Sub2 class59_sub9_sub2
		    = Class147.method2524((Statics
					   .aClass59_Sub9_Sub2_6647),
					  -127);
		JagexHashMap.method1529(class59_sub9_sub2, 36, true);
	    }
	    Statics.method545(false, argument, argument_5_, 0, Class42.aJs5Store_3537, (byte) -65);
	    Class51.method473(0, -1, 255);
	    Class154.aBoolean3618 = true;
	}
    }

    static final boolean method1947(int argument) {
	if (Applet_Sub1.useJavaScript) {
	    try {
		Class328.method3698(Signlink.mainapp, "showVideoAd",
				    (byte) 120);
		return true;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	return false;
    }
    
    static {
	aStringArray4601 = new String[200];
    }
}
