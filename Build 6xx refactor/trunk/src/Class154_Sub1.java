/* Class154_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class154_Sub1 extends Class154
{
    static int anInt5637;
    private int anInt5638 = 0;
    
    Class154_Sub1(Js5Store argument_0_, Class214_Sub1 argument_1_) {
	super(argument_0_, (Class214) argument_1_);
    }
    
    static final void method2578(int argument) {
	if (Statics.aClass59_Sub51_Sub7_581 != null) {
	    Statics.aClass59_Sub51_Sub7_581 = null;
	    Class344.method3801(argument ^ 0x96c, Node_Sub20.anInt4026,
				DoublyLinkedNode_Sub51_Sub13.anInt6296,
				Statics.anInt5520,
				Statics.anInt6645);
	    if (argument != -5) {
		/* empty */
	    }
	}
    }
    
    static final boolean method2579(int argument, int argument_2_) {
	if (argument_2_ != 3 && argument_2_ != 4)
	    return false;
	return true;
    }
    
    public final void method59(int argument_3_, boolean argument_4_) {
	int anLocalInt
	    = ((((Class214) ((Class154) this).aClass214_3614)
		    .aClass349_3705.method3823
		(((Class154) this).aClass368_3619.getWidth(),
		 client.gameWidth, (byte) -91))
	       + ((Class214) ((Class154) this).aClass214_3614).anInt3707);
	if (argument_3_ < -93) {
	    int anLocalInt_5_
		= ((((Class214) ((Class154) this).aClass214_3614)
			.aClass44_3709.method431
		    (0, client.gameHeight,
		     ((Class154) this).aClass368_3619.method4018()))
		   + ((Class214) ((Class154) this).aClass214_3614).anInt3708);
	    ((Class154) this).aClass368_3619.method4021
		((float) (((Class154) this).aClass368_3619.getWidth() / 2
			  + anLocalInt),
		 (float) (anLocalInt_5_
			  + ((Class154) this).aClass368_3619.method4018() / 2),
		 4096, anInt5638);
	    anInt5638 += ((Class214_Sub1) (Class214_Sub1)
			  ((Class154) this).aClass214_3614).anInt5652;
	}
    }
}
