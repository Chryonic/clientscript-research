/* Class305 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class305 implements Interface14
{
    static CyclicLinkedList aCyclicLinkedList_3640;
    static boolean aBoolean3641 = false;
    static long aLong3642;
    private Class10 aClass10_3643;
    static double aDouble3645;
    
    public final boolean method58(int argument_0_) {
	if (argument_0_ != 20662)
	    method57(103);
	return true;
    }
    
    static final void method3592() {
	for (int anLocalInt = Class349.anInt2922;
	     anLocalInt < LightingManager.yMapSize; anLocalInt++) {
	    for (int anLocalInt_1_ = 0; anLocalInt_1_ < LightingManager.xMapSize;
		 anLocalInt_1_++) {
		for (int anLocalInt_2_ = 0;
		     anLocalInt_2_ < LightingManager.zMapSize;
		     anLocalInt_2_++) {
		    Class148 class148
			= (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			   [anLocalInt][anLocalInt_1_][anLocalInt_2_]);
		    if (class148 != null) {
			DoublyLinkedNodeP2_Sub2_Sub3 class104_sub2_sub3
			    = ((Class148) class148).aClass104_Sub2_Sub3_1124;
			DoublyLinkedNodeP2_Sub2_Sub3 class104_sub2_sub3_3_
			    = ((Class148) class148).aClass104_Sub2_Sub3_1123;
			if (class104_sub2_sub3 != null
			    && class104_sub2_sub3.method1782(-1)) {
			    Node_Sub31_Sub15_Sub1.method920
                        (class104_sub2_sub3, anLocalInt, anLocalInt_1_,
                                anLocalInt_2_, 1, 1);
			    if (class104_sub2_sub3_3_ != null
				&& class104_sub2_sub3_3_.method1782(-1)) {
				Node_Sub31_Sub15_Sub1.method920
                        (class104_sub2_sub3_3_, anLocalInt,
                                anLocalInt_1_, anLocalInt_2_, 1, 1);
				class104_sub2_sub3_3_.method1775
				    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1
				      .aGraphicsToolkit6834),
				     class104_sub2_sub3, false, -95, 0, 0, 0);
				class104_sub2_sub3_3_.method1770(-13514);
			    }
			    class104_sub2_sub3.method1770(-13514);
			}
			for (Class110 class110
				 = ((Class148) class148).aClass110_1126;
			     class110 != null;
			     class110 = ((Class110) class110).aClass110_912) {
			    DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2
				= (((Class110) class110)
				   .aClass104_Sub2_Sub2_911);
			    if (class104_sub2_sub2 != null
				&& class104_sub2_sub2.method1782(-1)) {
				Node_Sub31_Sub15_Sub1.method920
                        (class104_sub2_sub2, anLocalInt,
                                anLocalInt_1_, anLocalInt_2_,
                                (((DoublyLinkedNodeP2_Sub2_Sub2)
                                        class104_sub2_sub2).right
                                        - ((DoublyLinkedNodeP2_Sub2_Sub2)
                                        class104_sub2_sub2).left
                                        + 1),
                                (((DoublyLinkedNodeP2_Sub2_Sub2)
                                        class104_sub2_sub2).top
                                        - ((DoublyLinkedNodeP2_Sub2_Sub2)
                                        class104_sub2_sub2).bottom
                                        + 1));
				class104_sub2_sub2.method1770(-13514);
			    }
			}
			DoublyLinkedNodeP2_Sub2_Sub4 class104_sub2_sub4
			    = ((Class148) class148).aClass104_Sub2_Sub4_1134;
			if (class104_sub2_sub4 != null
			    && class104_sub2_sub4.method1782(-1)) {
			    Class391.method4138(class104_sub2_sub4, anLocalInt,
						anLocalInt_1_, anLocalInt_2_);
			    class104_sub2_sub4.method1770(-13514);
			}
		    }
		}
	    }
	}
    }

    public static void method3594(byte argument) {
	aCyclicLinkedList_3640 = null;
    }
    
    public final void method59(int argument_6_, boolean argument_7_) {
	if (argument_7_)
	    Class389.aGraphicsToolkit3281.fillRect(0, 0, Applet_Sub1.canvasWidth, Applet_Sub1.canvasHeight, ((Class10) aClass10_3643).anInt3676, 0);
	if (argument_6_ > -93)
	    aCyclicLinkedList_3640 = null;
    }
    
    static final void method3595(int argument, int argument_8_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(argument, 13175,
            (long) argument_8_);
	class59_sub51_sub3.method1181(argument ^ 0x22e06ffb);
    }
    
    Class305(Class10 argument_9_) {
	aClass10_3643 = argument_9_;
    }
    
    static final void method3596(int argument) {
	for (int anLocalInt = argument; anLocalInt < 100; anLocalInt++)
	    Class109_Sub1.aBooleanArray4604[anLocalInt] = true;
    }
    
    public final void method57(int argument_10_) {
	if (argument_10_ <= 36)
	    method3592();
    }
    
    static {
	aCyclicLinkedList_3640 = new CyclicLinkedList();
	aDouble3645 = -1.0;
    }
}
