/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class Class4
{
    int[] anIntArray57 = new int[2];
    int[] anIntArray58;
    static float aFloat59;
    static int anInt60;
    short[] aShortArray61;
    int[] anIntArray62 = new int[2];
    int[] anIntArray63;
    short[] aShortArray64;
    
    static final void method218(byte argument, GraphicsToolkit argument_0_) {
	if (argument == 82
	    && Class46_Sub2.aCyclicLinkedList_3838.getSize() != 0) {
	    if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		    .aClass62_Sub26_4295.method1464(argument ^ 0x57)
		!= 0) {
		if (Class361.aGraphicsToolkit3057 == null) {
		    Canvas canvas = new Canvas();
		    canvas.setSize(36, 32);
		    Class361.aGraphicsToolkit3057
			= Class314.method3626(0, Statics.aJs5Store_4153,
					      Class22.anTextureSource_142,
					      (byte) -83, 0, canvas);
		    Class284.aAbstractFont_2280
			= (Class361.aGraphicsToolkit3057.method2083
			   (Class349.method3820(0, client.fontCache,
						client.fontIndexP11full, (byte) 44),
			    Class83.method1608(Class205.aJs5Store_1472,
					       client.fontIndexP11full, 0),
			    true));
		}
		for (Node_Sub16 class59_sub16
			 = (Node_Sub16) Class46_Sub2.aCyclicLinkedList_3838
					       .getFirst();
		     class59_sub16 != null;
		     class59_sub16
			 = ((Node_Sub16)
			    Class46_Sub2.aCyclicLinkedList_3838.getNext())) {
		    Class253_Sub1_Sub1.aClass365_6632.method3978
			(((Node_Sub16) class59_sub16).anInt4000, false,
			 (((Node_Sub16) class59_sub16).aBoolean4002
			  ? (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
			      Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			     .aClass22_6854)
			  : null),
			 ((Node_Sub16) class59_sub16).anInt3996,
			 ((Node_Sub16) class59_sub16).anInt4001,
			 Class284.aAbstractFont_2280, argument_0_, false,
			 ((Node_Sub16) class59_sub16).anInt3994,
			 ((Node_Sub16) class59_sub16).anInt3998,
			 Class361.aGraphicsToolkit3057, -25958);
		    class59_sub16.unlink();
		}
	    } else {
		for (Node_Sub16 class59_sub16
			 = (Node_Sub16) Class46_Sub2.aCyclicLinkedList_3838
					       .getFirst();
		     class59_sub16 != null;
		     class59_sub16
			 = (Node_Sub16) Class46_Sub2.aCyclicLinkedList_3838
					       .getNext()) {
		    Class253_Sub1_Sub1.aClass365_6632.method3978
			(((Node_Sub16) class59_sub16).anInt4000, false,
			 (((Node_Sub16) class59_sub16).aBoolean4002
			  ? (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
			      Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			     .aClass22_6854)
			  : null),
			 ((Node_Sub16) class59_sub16).anInt3996,
			 ((Node_Sub16) class59_sub16).anInt4001,
			 Class226.aAbstractFont_1641, argument_0_, false,
			 ((Node_Sub16) class59_sub16).anInt3994,
			 ((Node_Sub16) class59_sub16).anInt3998,
			 argument_0_, -25958);
		    class59_sub16.unlink();
		}
		Class305.method3596(0);
	    }
	}
    }
    
    static final Class133_Sub1 method219(byte argument,
					 Packet argument_1_) {
	return new Class133_Sub1(argument_1_.g2s(),
				 argument_1_.g2s(),
				 argument_1_.g2s(),
				 argument_1_.g2s(),
				 argument_1_.g3_dupl(),
				 argument_1_.g3_dupl(),
				 argument_1_.g1());
    }
    
    Class4(Class371 argument_2_) {
	((Class4) this).anIntArray58 = new int[3];
	((Class4) this).anIntArray63 = new int[3];
	((Class4) this).anIntArray58[0] = ((Class371) argument_2_).anInt3165;
	((Class4) this).anIntArray58[2] = ((Class371) argument_2_).anInt3124;
	((Class4) this).anIntArray58[1] = ((Class371) argument_2_).anInt3159;
	((Class4) this).anIntArray63[0] = ((Class371) argument_2_).anInt3180;
	((Class4) this).anIntArray63[1] = ((Class371) argument_2_).anInt3174;
	((Class4) this).anIntArray63[2] = ((Class371) argument_2_).anInt3164;
	((Class4) this).anIntArray57[0] = ((Class371) argument_2_).anInt3133;
	((Class4) this).anIntArray57[1] = ((Class371) argument_2_).anInt3142;
	((Class4) this).anIntArray62[0] = ((Class371) argument_2_).anInt3128;
	((Class4) this).anIntArray62[1] = ((Class371) argument_2_).anInt3170;
	if (((Class371) argument_2_).aShortArray3144 != null) {
	    ((Class4) this).aShortArray61
		= new short[((Class371) argument_2_).aShortArray3144.length];
	    JagStrings.memcpy(((Class371) argument_2_).aShortArray3144, 0, ((Class4) this).aShortArray61, 0, ((Class4) this).aShortArray61.length);
	}
	if (((Class371) argument_2_).aShortArray3150 != null) {
	    ((Class4) this).aShortArray64
		= new short[((Class371) argument_2_).aShortArray3150.length];
	    JagStrings.memcpy(((Class371) argument_2_).aShortArray3150, 0, ((Class4) this).aShortArray64, 0, ((Class4) this).aShortArray64.length);
	}
    }
}
