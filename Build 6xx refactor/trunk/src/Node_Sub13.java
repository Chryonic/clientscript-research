/* Class59_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

final class Node_Sub13 extends Node
{
    int anInt3950;
    Class266 aClass266_3951;
    int anInt3952;
    boolean aBoolean3953;
    Node_Sub25 aClass59_Sub25_3954;
    int anInt3955;
    static Class176[] aClass176Array3956;
    int anInt3957;
    Node_Sub40_Sub1 aClass59_Sub40_Sub1_3958;
    static Class166 aClass166_3959 = new Class166(21, 3);
    int anInt3960;
    boolean aBoolean3961;
    int anInt3962;
    int anInt3963 = 0;
    int anInt3964;
    int anInt3965;
    Node_Sub25 aClass59_Sub25_3966;
    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 aClass104_Sub2_Sub2_Sub5_Sub2_3967;
    Node_Sub9_Sub4 aClass59_Sub9_Sub4_3968;
    int anInt3969;
    int anInt3970;
    Node_Sub9_Sub4 aClass59_Sub9_Sub4_3971;
    int anInt3972;
    int anInt3973;
    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 aClass104_Sub2_Sub2_Sub5_Sub1_3974;
    int[] anIntArray3975;
    Node_Sub40_Sub1 aClass59_Sub40_Sub1_3976;
    static float aFloat3977;
    static int anInt3978 = -1;
    boolean aBoolean3979;
    int anInt3980;
    int anInt3981;
    static Class329 aClass329_3982 = new Class329(12, 3);
    
    public static void method688(byte argument) {
	aClass329_3982 = null;
	aClass166_3959 = null;
	aClass176Array3956 = null;
    }
    
    static final boolean method689(int argument, int argument_0_,
				   int argument_1_) {
	if ((argument_0_ & 0x800) == 0)
	    return false;
	return true;
    }
    
    static final void method690(int argument, int argument_2_, int argument_3_,
				int argument_4_, int argument_5_) {
	for (int anLocalInt = 0; anLocalInt < Node_Sub47_Sub8.anInt6193;
	     anLocalInt++) {
	    Rectangle rectangle = Class_s.aRectangleArray2545[anLocalInt];
	    if (rectangle.width + rectangle.x > argument_5_
		&& argument_2_ + argument_5_ > rectangle.x
		&& argument_3_ < rectangle.height + rectangle.y
		&& argument_3_ + argument > rectangle.y)
		Class189_Sub3.aBooleanArray5651[anLocalInt] = true;
	}
	Canvas_Sub1.method125(argument_5_ + argument_2_, (byte) -102,
			      argument_3_ + argument, argument_3_,
			      argument_5_);
    }
    
    final void method691(byte argument_6_) {
	int anLocalInt = ((Node_Sub13) this).anInt3950;
	boolean anLocalBoolean = ((Node_Sub13) this).aBoolean3953;
	if (((Node_Sub13) this).aClass266_3951 == null) {
	    if (((Node_Sub13) this).aClass104_Sub2_Sub2_Sub5_Sub1_3974
		!= null) {
		int anLocalInt_7_ = (DoublyLinkedNode_Sub51_Sub18.method1290((((Node_Sub13) this).aClass104_Sub2_Sub2_Sub5_Sub1_3974), 126));
		if (anLocalInt_7_ != anLocalInt) {
		    ((Node_Sub13) this).anInt3950 = anLocalInt_7_;
		    Class291 class291
			= (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
			    (((Node_Sub13) this)
			     .aClass104_Sub2_Sub2_Sub5_Sub1_3974))
			   .aClass291_6832);
		    if (((Class291) class291).anIntArray2374 != null)
			class291 = class291.method3485((ClientVariables
							.instance),
						       -1);
		    if (class291 != null) {
			((Node_Sub13) this).anInt3970
			    = ((Class291) class291).anInt2356;
			((Node_Sub13) this).anInt3965
			    = ((Class291) class291).anInt2335;
			((Node_Sub13) this).anInt3972
			    = ((Class291) class291).anInt2346 << 9;
			((Node_Sub13) this).anInt3964
			    = ((Class291) class291).anInt2358 << 9;
			((Node_Sub13) this).aBoolean3953
			    = ((Class291) class291).aBoolean2365;
			((Node_Sub13) this).anInt3952
			    = ((Class291) class291).anInt2331;
		    } else {
			((Node_Sub13) this).anInt3965 = 256;
			((Node_Sub13) this).anInt3952
			    = ((Node_Sub13) this).anInt3972
			    = ((Node_Sub13) this).anInt3964 = 0;
			((Node_Sub13) this).aBoolean3953
			    = ((Class291)
			       (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				 (((Node_Sub13) this)
				  .aClass104_Sub2_Sub2_Sub5_Sub1_3974))
				.aClass291_6832)).aBoolean2365;
			((Node_Sub13) this).anInt3970 = 256;
		    }
		}
	    } else if ((((Node_Sub13) this)
			.aClass104_Sub2_Sub2_Sub5_Sub2_3967)
		       != null) {
		((Node_Sub13) this).anInt3950
		    = (Class169.method2731
		       ((byte) -109, (((Node_Sub13) this)
				      .aClass104_Sub2_Sub2_Sub5_Sub2_3967)));
		((Node_Sub13) this).anInt3970 = 256;
		((Node_Sub13) this).anInt3972
		    = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		       (((Node_Sub13) this)
			.aClass104_Sub2_Sub2_Sub5_Sub2_3967)).anInt6863 << 9;
		((Node_Sub13) this).anInt3952
		    = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		       (((Node_Sub13) this)
			.aClass104_Sub2_Sub2_Sub5_Sub2_3967)).anInt6871;
		((Node_Sub13) this).aBoolean3953
		    = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		       (((Node_Sub13) this)
			.aClass104_Sub2_Sub2_Sub5_Sub2_3967)).aBoolean6857;
		((Node_Sub13) this).anInt3964 = 0;
		((Node_Sub13) this).anInt3965 = 256;
	    }
	} else {
	    Class266 class266
		= ((Node_Sub13) this).aClass266_3951
		      .method3345(1, ClientVariables.instance);
	    if (class266 == null) {
		((Node_Sub13) this).anInt3960 = 0;
		((Node_Sub13) this).anInt3980 = 0;
		((Node_Sub13) this).anIntArray3975 = null;
		((Node_Sub13) this).anInt3952 = 0;
		((Node_Sub13) this).anInt3964 = 0;
		((Node_Sub13) this).anInt3965 = 256;
		((Node_Sub13) this).anInt3970 = 256;
		((Node_Sub13) this).anInt3950 = -1;
		((Node_Sub13) this).anInt3972 = 0;
		((Node_Sub13) this).aBoolean3961 = false;
		((Node_Sub13) this).aBoolean3953 = false;
	    } else {
		((Node_Sub13) this).anIntArray3975
		    = ((Class266) class266).anIntArray2108;
		((Node_Sub13) this).aBoolean3961
		    = ((Class266) class266).aBoolean2116;
		((Node_Sub13) this).anInt3980
		    = ((Class266) class266).anInt2114;
		((Node_Sub13) this).anInt3965
		    = ((Class266) class266).anInt2113;
		((Node_Sub13) this).anInt3960
		    = ((Class266) class266).anInt2097;
		((Node_Sub13) this).anInt3952
		    = ((Class266) class266).anInt2095;
		((Node_Sub13) this).aBoolean3953
		    = ((Class266) class266).aBoolean2080;
		((Node_Sub13) this).anInt3972
		    = ((Class266) class266).anInt2132 << 9;
		((Node_Sub13) this).anInt3970
		    = ((Class266) class266).anInt2109;
		((Node_Sub13) this).anInt3950
		    = ((Class266) class266).anInt2110;
	    }
	}
	do {
	    if (((Node_Sub13) this).anInt3950 != anLocalInt
		|| anLocalBoolean == !((Node_Sub13) this).aBoolean3953) {
		if (((Node_Sub13) this).aClass59_Sub9_Sub4_3968 == null)
		    break;
		Class353_Sub2.aClass59_Sub9_Sub3_5483
		    .method626(((Node_Sub13) this).aClass59_Sub9_Sub4_3968);
		((Node_Sub13) this).aClass59_Sub25_3954 = null;
		((Node_Sub13) this).aClass59_Sub40_Sub1_3958 = null;
		((Node_Sub13) this).aClass59_Sub9_Sub4_3968 = null;
	    }
	    break;
	} while (false);
    }
    
    static final void method692(int argument, int argument_8_) {
	Node_Sub47_Sub5.method1124((byte) -50);
	int anLocalInt
	    = (((Class79) JagexHash.aClass58_1682.method521(argument_8_,
							   (byte) -127))
	       .anInt566);
	if (anLocalInt != 0) {
	    int anLocalInt_9_
		= (((ClientVariables) ClientVariables.instance)
		   .values[argument_8_]);
	    if (anLocalInt == argument)
		Class26.anInt180 = anLocalInt_9_;
	    if (anLocalInt == 5)
		Class121.anInt983 = anLocalInt_9_;
	}
    }
    
    public Node_Sub13() {
	/* empty */
    }
}
