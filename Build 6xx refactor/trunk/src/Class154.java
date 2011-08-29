/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class154 implements Interface14
{
    Class214 aClass214_3614;
    static int anInt3615;
    private Js5Store aJs5Store_3616;
    static int[] anIntArray3617 = { 1, 0, -1, 0 };
    static boolean aBoolean3618 = false;
    Class368 aClass368_3619;
    
    public final void method57(int argument_0_) {
	if (argument_0_ > 36)
	    ((Class154) this).aClass368_3619
		= Node_Sub47_Sub7.method1128(47, aJs5Store_3616,
                (((Class214) (((Class154) this)
                        .aClass214_3614))
                        .anInt3706));
    }
    
    public static void method2575(boolean argument) {
	anIntArray3617 = null;
    }
    
    static final void method2576(int argument) {
	if (tia_sub_35_Sub1DoublyLinked.aClass112_6659 != null)
	    tia_sub_35_Sub1DoublyLinked.aClass112_6659.method2005(-23318);
	if (argument != 0)
	    method2575(true);
	if (Class245.aClass112_1787 != null)
	    Class245.aClass112_1787.method2005(-23318);
    }
    
    public final boolean method58(int argument_1_) {
	if (argument_1_ != 20662)
	    method2575(true);
	return aJs5Store_3616.isFlatFile((((Class214) ((Class154) this).aClass214_3614).anInt3706));
    }
    
    static final void method2577(int argument) {
	DoublyLinkedNodeP2_Sub3.aCyclicLinkedList_4521.clear();
	Node_Sub47_Sub3.anInt6164 = 0;
    }
    
    public void method59(int argument_2_, boolean argument_3_) {
	if (argument_3_) {
	    int anLocalInt
		= ((((Class214) ((Class154) this).aClass214_3614)
			.aClass349_3705.method3823
		    (((Class154) this).aClass368_3619.getWidth(),
		     client.gameWidth, (byte) -91))
		   + ((Class214) ((Class154) this).aClass214_3614).anInt3707);
	    int anLocalInt_4_
		= ((((Class214) ((Class154) this).aClass214_3614)
			.aClass44_3709.method431
		    (0, client.gameHeight,
		     ((Class154) this).aClass368_3619.method4018()))
		   + ((Class214) ((Class154) this).aClass214_3614).anInt3708);
	    ((Class154) this).aClass368_3619.method4014(anLocalInt,
							anLocalInt_4_);
	}
	if (argument_2_ >= -93)
	    method2577(6);
    }
    
    Class154(Js5Store argument_5_, Class214 argument_6_) {
	((Class154) this).aClass214_3614 = argument_6_;
	aJs5Store_3616 = argument_5_;
    }
}
