/* Class391 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class391
{
    private Node aNode_3287;
    static Class166 aClass166_3288 = new Class166(89, 12);
    private int anInt3289 = 0;
    static Js5Store aJs5Store_3290;
    static int anInt3291;
    private JagexHashMap aJagexHashMap_3292;
    
    final Node method4137(byte argument_0_) {
	if (anInt3289 > 0
	    && aNode_3287 != (((JagexHashMap) aJagexHashMap_3292).aNodeArray485
				 [anInt3289 - 1])) {
	    Node node = aNode_3287;
	    aNode_3287 = ((Node) node).next;
	    return node;
	}
	while (anInt3289 < ((JagexHashMap) aJagexHashMap_3292).anInt486) {
	    Node node = (((Node) (((JagexHashMap) aJagexHashMap_3292)
					   .aNodeArray485[anInt3289++]))
			       .next);
	    if (((JagexHashMap) aJagexHashMap_3292).aNodeArray485[anInt3289 - 1]
		!= node) {
		aNode_3287 = ((Node) node).next;
		return node;
	    }
	}
	return null;
    }
    
    static final void method4138(DoublyLinkedNodeP2_Sub2 argument, int argument_1_,
				 int argument_2_, int argument_3_) {
	if (argument_2_ < LightingManager.xMapSize) {
	    Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
				 [argument_1_][argument_2_ + 1][argument_3_]);
	    if (class148 != null
		&& ((Class148) class148).aClass104_Sub2_Sub4_1134 != null
		&& ((Class148) class148).aClass104_Sub2_Sub4_1134
		       .method1782(-1))
		argument.method1775(DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834,
				    (((Class148) class148)
				     .aClass104_Sub2_Sub4_1134),
				    true, -98, Class110.anInt909, 0, 0);
	}
	if (argument_3_ < LightingManager.xMapSize) {
	    Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
				 [argument_1_][argument_2_][argument_3_ + 1]);
	    if (class148 != null
		&& ((Class148) class148).aClass104_Sub2_Sub4_1134 != null
		&& ((Class148) class148).aClass104_Sub2_Sub4_1134
		       .method1782(-1))
		argument.method1775(DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834,
				    (((Class148) class148)
				     .aClass104_Sub2_Sub4_1134),
				    true, -110, 0, 0, Class110.anInt909);
	}
	if (argument_2_ < LightingManager.xMapSize
	    && argument_3_ < LightingManager.zMapSize) {
	    Class148 class148
		= (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[argument_1_]
		   [argument_2_ + 1][argument_3_ + 1]);
	    if (class148 != null
		&& ((Class148) class148).aClass104_Sub2_Sub4_1134 != null
		&& ((Class148) class148).aClass104_Sub2_Sub4_1134
		       .method1782(-1))
		argument.method1775(DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834,
				    (((Class148) class148)
				     .aClass104_Sub2_Sub4_1134),
				    true, -92, Class110.anInt909, 0,
				    Class110.anInt909);
	}
	if (argument_2_ < LightingManager.xMapSize && argument_3_ > 0) {
	    Class148 class148
		= (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[argument_1_]
		   [argument_2_ + 1][argument_3_ - 1]);
	    if (class148 != null
		&& ((Class148) class148).aClass104_Sub2_Sub4_1134 != null
		&& ((Class148) class148).aClass104_Sub2_Sub4_1134
		       .method1782(-1))
		argument.method1775(DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834,
				    (((Class148) class148)
				     .aClass104_Sub2_Sub4_1134),
				    true, -57, Class110.anInt909, 0,
				    -Class110.anInt909);
	}
    }
    
    static final void method4139(boolean argument, int argument_4_,
				 int argument_5_, int argument_6_,
				 int argument_7_) {
	if (argument_7_ - argument_4_ < Node_Sub35.anInt4156
	    || argument_4_ + argument_7_ > Node_Sub9_Sub2.anInt5776
	    || -argument_4_ + argument_6_ < Class209.anInt1504
	    || argument_4_ + argument_6_ > Node_Sub31_Sub13.anInt5896)
	    DoublyLinkedNode_Sub51_Sub2.method1179(argument_4_, argument_7_, (byte) 53, argument_6_, argument_5_);
	else
	    Node_Sub31_Sub24.method954(argument_7_, argument_5_,
                argument_6_, argument_4_, 628308897);
    }
    
    public static void method4140(int argument) {
	aJs5Store_3290 = null;
	aClass166_3288 = null;
    }
    
    public Class391() {
	/* empty */
    }
    
    Class391(JagexHashMap argument_8_) {
	aJagexHashMap_3292 = argument_8_;
    }
    
    final Node method4141(int argument_9_) {
	anInt3289 = 0;
	return method4137((byte) 111);
    }
}
