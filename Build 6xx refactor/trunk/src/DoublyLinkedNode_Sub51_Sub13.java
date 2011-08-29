/* Class59_Sub51_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class DoublyLinkedNode_Sub51_Sub13 extends DoublyLinkedNode
{
    int anInt6290;
    String aString6291;
    static int[] anIntArray6292;
    int anInt6293 = -1;
    boolean aBoolean6294;
    CyclicLinkedList aCyclicLinkedList_6295;
    static int anInt6296;
    static String[] aStringArray6297
	= { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
    int anInt6298;
    int anInt6299;
    int anInt6300;
    int anInt6301;
    String aString6302;
    int anInt6303;
    int anInt6304;
    
    static final GraphicsToolkit method1257(TextureSource argument,
				     boolean argument_0_, int argument_1_,
				     Canvas argument_2_) {
	return new GlToolkit(argument_2_, argument, argument_1_);
    }
    
    static final int method1258(int argument, int argument_3_) {
	int anLocalInt = 0;
	if (argument_3_ < 0 || argument_3_ >= 65536) {
	    argument_3_ >>>= 16;
	    anLocalInt += 16;
	}
	if (argument_3_ >= 256) {
	    argument_3_ >>>= 8;
	    anLocalInt += 8;
	}
	if (argument_3_ >= 16) {
	    argument_3_ >>>= 4;
	    anLocalInt += 4;
	}
	if (argument_3_ >= 4) {
	    anLocalInt += 2;
	    argument_3_ >>>= 2;
	}
	if (argument_3_ >= 1) {
	    argument_3_ >>>= 1;
	    anLocalInt++;
	}
	return anLocalInt + argument_3_;
    }
    
    final boolean method1259(int argument_4_, int argument_5_, int argument_6_,
			     int[] argument_7_) {
	for (Node_Sub24 class59_sub24
		 = (Node_Sub24) ((DoublyLinkedNode_Sub51_Sub13) this)
				       .aCyclicLinkedList_6295.getFirst();
	     class59_sub24 != null;
	     class59_sub24
		 = (Node_Sub24) ((DoublyLinkedNode_Sub51_Sub13) this)
				       .aCyclicLinkedList_6295.getNext()) {
	    if (class59_sub24.method752(argument_6_, (byte) 102,
					argument_4_)) {
		class59_sub24.method748(argument_6_, argument_7_, argument_4_,
					125);
		return true;
	    }
	}
	return false;
    }
    
    final boolean method1260(int argument_8_, int argument_9_,
			     int argument_10_, int[] argument_11_,
			     int argument_12_) {
	for (Node_Sub24 class59_sub24
		 = (Node_Sub24) ((DoublyLinkedNode_Sub51_Sub13) this)
				       .aCyclicLinkedList_6295.getFirst();
	     class59_sub24 != null;
	     class59_sub24
		 = (Node_Sub24) ((DoublyLinkedNode_Sub51_Sub13) this)
				       .aCyclicLinkedList_6295.getNext()) {
	    if (class59_sub24.method750(argument_9_, argument_10_, -127,
					argument_12_)) {
		class59_sub24.method748(argument_10_, argument_11_,
					argument_9_, 120);
		return true;
	    }
	}
	return false;
    }
    
    static final int method1261(int argument) {
	return 16;
    }
    
    static final int method1262(int argument) {
	if (Applet_Sub1.overridingFrame != null)
	    return 3;
	if (Class362.aBoolean3058)
	    return 2;
	return 1;
    }
    
    final void method1263(int argument_13_) {
	((DoublyLinkedNode_Sub51_Sub13) this).anInt6300 = 0;
	((DoublyLinkedNode_Sub51_Sub13) this).anInt6303 = 12800;
	((DoublyLinkedNode_Sub51_Sub13) this).anInt6301 = 0;
	((DoublyLinkedNode_Sub51_Sub13) this).anInt6290 = 12800;
	for (Node_Sub24 class59_sub24
		 = (Node_Sub24) ((DoublyLinkedNode_Sub51_Sub13) this)
				       .aCyclicLinkedList_6295.getFirst();
	     class59_sub24 != null;
	     class59_sub24
		 = (Node_Sub24) ((DoublyLinkedNode_Sub51_Sub13) this)
				       .aCyclicLinkedList_6295.getNext()) {
	    if (((Node_Sub24) class59_sub24).anInt4060
		< ((DoublyLinkedNode_Sub51_Sub13) this).anInt6303)
		((DoublyLinkedNode_Sub51_Sub13) this).anInt6303
		    = ((Node_Sub24) class59_sub24).anInt4060;
	    if (((Node_Sub24) class59_sub24).anInt4065
		< ((DoublyLinkedNode_Sub51_Sub13) this).anInt6290)
		((DoublyLinkedNode_Sub51_Sub13) this).anInt6290
		    = ((Node_Sub24) class59_sub24).anInt4065;
	    if (((DoublyLinkedNode_Sub51_Sub13) this).anInt6301
		< ((Node_Sub24) class59_sub24).anInt4067)
		((DoublyLinkedNode_Sub51_Sub13) this).anInt6301
		    = ((Node_Sub24) class59_sub24).anInt4067;
	    if (((DoublyLinkedNode_Sub51_Sub13) this).anInt6300
		< ((Node_Sub24) class59_sub24).anInt4062)
		((DoublyLinkedNode_Sub51_Sub13) this).anInt6300
		    = ((Node_Sub24) class59_sub24).anInt4062;
	}
    }
    
    static final void method1264(DoublyLinkedNodeP2_Sub2[] argument, int argument_14_,
				 int argument_15_) {
	if (argument_14_ < argument_15_) {
	    int anLocalInt = (argument_14_ + argument_15_) / 2;
	    int anLocalInt_16_ = argument_14_;
	    DoublyLinkedNodeP2_Sub2 class104_sub2 = argument[anLocalInt];
	    argument[anLocalInt] = argument[argument_15_];
	    argument[argument_15_] = class104_sub2;
	    int anLocalInt_17_ = ((DoublyLinkedNodeP2_Sub2) class104_sub2).anInt4516;
	    for (int anLocalInt_18_ = argument_14_;
		 anLocalInt_18_ < argument_15_; anLocalInt_18_++) {
		if (((DoublyLinkedNodeP2_Sub2) argument[anLocalInt_18_]).anInt4516
		    > anLocalInt_17_ + (anLocalInt_18_ & 0x1)) {
		    DoublyLinkedNodeP2_Sub2 class104_sub2_19_ = argument[anLocalInt_18_];
		    argument[anLocalInt_18_] = argument[anLocalInt_16_];
		    argument[anLocalInt_16_++] = class104_sub2_19_;
		}
	    }
	    argument[argument_15_] = argument[anLocalInt_16_];
	    argument[anLocalInt_16_] = class104_sub2;
	    method1264(argument, argument_14_, anLocalInt_16_ - 1);
	    method1264(argument, anLocalInt_16_ + 1, argument_15_);
	}
    }
    
    static final boolean method1265(int argument, byte argument_20_,
				    int argument_21_) {
	if ((argument_21_ & 0x100100) == 0)
	    return false;
	return true;
    }
    
    public static void method1266(boolean argument) {
	anIntArray6292 = null;
	aStringArray6297 = null;
    }
    
    final boolean method1267(int argument_22_, int argument_23_,
			     int argument_24_) {
	for (Node_Sub24 class59_sub24
		 = (Node_Sub24) ((DoublyLinkedNode_Sub51_Sub13) this)
				       .aCyclicLinkedList_6295.getFirst();
	     class59_sub24 != null;
	     class59_sub24
		 = (Node_Sub24) ((DoublyLinkedNode_Sub51_Sub13) this)
				       .aCyclicLinkedList_6295.getNext()) {
	    if (class59_sub24.method752(argument_22_, (byte) 69, argument_24_))
		return true;
	}
	return false;
    }
    
    final boolean method1268(int argument_25_, int[] argument_26_,
			     int argument_27_, byte argument_28_) {
	for (Node_Sub24 class59_sub24
		 = (Node_Sub24) ((DoublyLinkedNode_Sub51_Sub13) this)
				       .aCyclicLinkedList_6295.getFirst();
	     class59_sub24 != null;
	     class59_sub24
		 = (Node_Sub24) ((DoublyLinkedNode_Sub51_Sub13) this)
				       .aCyclicLinkedList_6295.getNext()) {
	    if (class59_sub24.method751(argument_25_, argument_27_, 26642)) {
		class59_sub24.method746(argument_25_, argument_26_, (byte) 92,
					argument_27_);
		return true;
	    }
	}
	return false;
    }
    
    DoublyLinkedNode_Sub51_Sub13(int argument_29_, String argument_30_, String argument_31_, int argument_32_, int argument_33_, boolean argument_34_, int argument_35_, int argument_36_) {
	((DoublyLinkedNode_Sub51_Sub13) this).anInt6290 = 12800;
	((DoublyLinkedNode_Sub51_Sub13) this).aBoolean6294 = true;
	((DoublyLinkedNode_Sub51_Sub13) this).anInt6300 = 0;
	((DoublyLinkedNode_Sub51_Sub13) this).anInt6301 = 0;
	((DoublyLinkedNode_Sub51_Sub13) this).anInt6303 = 12800;
	((DoublyLinkedNode_Sub51_Sub13) this).anInt6304 = -1;
	((DoublyLinkedNode_Sub51_Sub13) this).anInt6299 = argument_29_;
	((DoublyLinkedNode_Sub51_Sub13) this).aBoolean6294 = argument_34_;
	((DoublyLinkedNode_Sub51_Sub13) this).anInt6298 = argument_32_;
	((DoublyLinkedNode_Sub51_Sub13) this).anInt6304 = argument_35_;
	((DoublyLinkedNode_Sub51_Sub13) this).aString6302 = argument_31_;
	((DoublyLinkedNode_Sub51_Sub13) this).aString6291 = argument_30_;
	((DoublyLinkedNode_Sub51_Sub13) this).anInt6293 = argument_33_;
	if (((DoublyLinkedNode_Sub51_Sub13) this).anInt6304 == 255)
	    ((DoublyLinkedNode_Sub51_Sub13) this).anInt6304 = 0;
	((DoublyLinkedNode_Sub51_Sub13) this).aCyclicLinkedList_6295 = new CyclicLinkedList();
    }
    
    static {
	anIntArray6292 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1,
				     2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				     1, 1, 1, 1, 0, 0, 0, 0, 1 };
    }
}
