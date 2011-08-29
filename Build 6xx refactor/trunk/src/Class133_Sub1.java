/* Class133_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jaggl.OpenGL;

final class Class133_Sub1 extends Class133
{
    private int anInt5002;
    static int anInt5003;
    private int anInt5004;
    private int anInt5005;
    private int anInt5006;
    static JagexHashMap aJagexHashMap_5007 = new JagexHashMap(16);
    static boolean aBoolean5008 = false;
    static int anInt5009;
    static int anInt5010 = 0;
    static Class81 aClass81_5011 = new Class81();
    
    final void method2444(byte argument_0_, int argument_1_, int argument_2_) {
	if (argument_0_ == 85) {
	    int anLocalInt = anInt5002 * argument_2_ >> 12;
	    int anLocalInt_3_ = argument_2_ * anInt5005 >> 12;
	    int anLocalInt_4_ = anInt5004 * argument_1_ >> 12;
	    int anLocalInt_5_ = argument_1_ * anInt5006 >> 12;
	    Class122.method2390(((Class133) this).anInt1067,
				((Class133) this).anInt1068,
				((Class133) this).anInt1069, -1, anLocalInt_5_,
				anLocalInt_4_, anLocalInt_3_, anLocalInt);
	}
    }
    
    final void method2439(int argument_6_, int argument_7_, int argument_8_) {
	int anLocalInt = argument_6_ * anInt5002 >> 12;
	if (argument_8_ != -7895)
	    anInt5002 = -121;
	int anLocalInt_9_ = anInt5005 * argument_6_ >> 12;
	int anLocalInt_10_ = argument_7_ * anInt5004 >> 12;
	int anLocalInt_11_ = anInt5006 * argument_7_ >> 12;
	Class62_Sub3.method1362(anLocalInt_10_, anLocalInt_9_,
				argument_8_ ^ 0x37bf, anLocalInt,
				anLocalInt_11_, ((Class133) this).anInt1069);
    }
    
    public static void method2446(int argument) {
	aClass81_5011 = null;
	aJagexHashMap_5007 = null;
    }
    
    final void method2441(byte argument_12_, int argument_13_,
			  int argument_14_) {
	if (argument_12_ != 101) {
	    /* empty */
	}
    }
    
    static final void method2447
	(int[] argument, DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 argument_15_,
	 int argument_16_, int[] argument_17_, int[] argument_18_) {
	if (argument_16_ != 3563)
	    anInt5009 = -63;
	for (int anLocalInt = 0; argument.length > anLocalInt; anLocalInt++) {
	    int anLocalInt_19_ = argument[anLocalInt];
	    int anLocalInt_20_ = argument_17_[anLocalInt];
	    int anLocalInt_21_ = argument_18_[anLocalInt];
	    for (int anLocalInt_22_ = 0;
		 (anLocalInt_20_ != 0
		  && (((Entity) argument_15_)
		      .aClass91Array6779).length > anLocalInt_22_);
		 anLocalInt_22_++) {
		if ((anLocalInt_20_ & 0x1) != 0) {
		    if (anLocalInt_19_ == -1)
			((Entity) argument_15_)
			    .aClass91Array6779[anLocalInt_22_]
			    = null;
		    else {
			Class367 class367
			    = (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758
			       (anLocalInt_19_, argument_16_ - 3563));
			int anLocalInt_23_ = ((Class367) class367).anInt3106;
			Class91 class91
			    = (((Entity) argument_15_)
			       .aClass91Array6779[anLocalInt_22_]);
			if (class91 != null) {
			    if (((Class91) class91).anInt704
				!= anLocalInt_19_) {
				if (((Class367) class367).anInt3099
				    >= (((Class367)
					 (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
					      .method3758
					  (((Class91) class91).anInt704, 0)))
					.anInt3099))
				    class91 = ((Entity)
					       argument_15_)
						  .aClass91Array6779
						  [anLocalInt_22_] = null;
			    } else if (anLocalInt_23_ == 0)
				class91
				    = ((Entity) argument_15_)
					  .aClass91Array6779[anLocalInt_22_]
				    = null;
			    else if (anLocalInt_23_ == 1) {
				((Class91) class91).anInt699 = 0;
				((Class91) class91).anInt700 = 1;
				((Class91) class91).anInt702 = 0;
				((Class91) class91).anInt701 = anLocalInt_21_;
				((Class91) class91).anInt698 = 0;
				if (!((Entity) argument_15_)
				     .aBoolean6751)
				    Class313.method3622(argument_15_,
							argument_16_ ^ 0xdeb,
							class367, 0);
			    } else if (anLocalInt_23_ == 2)
				((Class91) class91).anInt699 = 0;
			}
			if (class91 == null) {
			    class91
				= ((Entity) argument_15_)
				      .aClass91Array6779[anLocalInt_22_]
				= new Class91();
			    ((Class91) class91).anInt698 = 0;
			    ((Class91) class91).anInt704 = anLocalInt_19_;
			    ((Class91) class91).anInt699 = 0;
			    ((Class91) class91).anInt701 = anLocalInt_21_;
			    ((Class91) class91).anInt700 = 1;
			    ((Class91) class91).anInt702 = 0;
			    if (!((Entity) argument_15_)
				 .aBoolean6751)
				Class313.method3622(argument_15_, 0, class367,
						    0);
			}
		    }
		}
		anLocalInt_20_ >>>= 1;
	    }
	}
    }
    
    static final int method2448(int argument, int argument_24_) {
	return argument_24_ & 0xff;
    }
    
    static final GraphicsToolkit method2449
	(int argument, Js5Store argument_25_, int argument_26_,
	 TextureSource argument_27_, Canvas argument_28_) {
	if (!NativeManager.method2427(-2500))
	    throw new RuntimeException("");
	if (!NativeManager.method2978("jaggl"))
	    throw new RuntimeException("");
	OpenGL opengl = new OpenGL();
	long l = opengl.init(argument_28_, 8, 8, 8, 24, 0, argument);
	if (l == 0L)
	    throw new RuntimeException("");
	GraphicsToolkit_Sub2_Sub1 class_ha_sub2_sub1
	    = new GraphicsToolkit_Sub2_Sub1(opengl, argument_28_, l, argument_27_,
				     argument_25_, argument);
	class_ha_sub2_sub1.method2128(argument_26_ + argument_26_);
	return class_ha_sub2_sub1;
    }
    
    static final boolean method2450
	(int argument, Node_Sub28_Sub1 argument_29_, int argument_30_) {
	int anLocalInt = argument_29_.method850(-1, 2);
	if (anLocalInt == 0) {
	    if (argument_29_.method850(-1, 1) != 0)
		method2450(argument, argument_29_, 0);
	    int anLocalInt_31_ = argument_29_.method850(-1, 6);
	    int anLocalInt_32_ = argument_29_.method850(argument_30_ - 1, 6);
	    boolean anLocalBoolean = argument_29_.method850(-1, 1) == 1;
	    if (anLocalBoolean)
		Class256_Sub1.anIntArray5620
		    [DoublyLinkedNodeP2_Sub2_Sub1_Sub2.anInt6562++]
		    = argument;
	    if (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[argument]
		!= null)
		throw new RuntimeException("hr:lr");
	    Class239 class239
		= Node_Sub31_Sub15_Sub1.aClass239Array6640[argument];
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		= (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[argument]
		   = new DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2());
	    ((Entity) class104_sub2_sub2_sub5_sub2).anInt6745
		= argument;
	    if (DoublyLinkedNode_Sub51_Sub7.aClass59_Sub28Array6247[argument] != null)
		class104_sub2_sub2_sub5_sub2.method1856
		    (DoublyLinkedNode_Sub51_Sub7.aClass59_Sub28Array6247[argument],
		     true);
	    class104_sub2_sub2_sub5_sub2
		.method1840(16383, true, ((Class239) class239).anInt1738);
	    ((Entity) class104_sub2_sub2_sub5_sub2).anInt6725
		= ((Class239) class239).anInt1739;
	    int anLocalInt_33_ = ((Class239) class239).anInt1740;
	    int anLocalInt_34_ = anLocalInt_33_ >> 28;
	    int anLocalInt_35_ = (anLocalInt_33_ & 0x3fcea1) >> 14;
	    int anLocalInt_36_ = anLocalInt_33_ & 0xff;
	    int anLocalInt_37_ = (-MapRelated.baseX
				  + (anLocalInt_31_ + (anLocalInt_35_ << 6)));
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) class104_sub2_sub2_sub5_sub2)
		.aBoolean6856
		= ((Class239) class239).aBoolean1741;
	    int anLocalInt_38_
		= -MapRelated.baseZ + (anLocalInt_36_ << 6) + anLocalInt_32_;
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) class104_sub2_sub2_sub5_sub2)
		.aBoolean6852
		= ((Class239) class239).aBoolean1737;
	    ((Entity) class104_sub2_sub2_sub5_sub2)
		.aByteArray6802[0]
		= DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aByteArray6570[argument];
	    ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).lightingHL
		= ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).aByte4509
		= (byte) anLocalInt_34_;
	    if (Class274.method3388(anLocalInt_37_, anLocalInt_38_,
				    argument_30_ + 1))
		((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).aByte4509++;
	    class104_sub2_sub2_sub5_sub2.method1865(anLocalInt_37_,
						    anLocalInt_38_, false);
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) class104_sub2_sub2_sub5_sub2)
		.aBoolean6864
		= false;
	    Node_Sub31_Sub15_Sub1.aClass239Array6640[argument] = null;
	    return true;
	}
	if (anLocalInt == 1) {
	    int anLocalInt_39_ = argument_29_.method850(-1, 2);
	    int anLocalInt_40_ = (((Class239) (Node_Sub31_Sub15_Sub1
					       .aClass239Array6640[argument]))
				  .anInt1740);
	    ((Class239) Node_Sub31_Sub15_Sub1.aClass239Array6640[argument])
		.anInt1740
		= ((((anLocalInt_40_ >> 28) + anLocalInt_39_ & 0x3) << 28)
		   + (anLocalInt_40_ & 0xfffffff));
	    return false;
	}
	if (anLocalInt == 2) {
	    int anLocalInt_41_ = argument_29_.method850(argument_30_ - 1, 5);
	    int anLocalInt_42_ = anLocalInt_41_ >> 3;
	    int anLocalInt_43_ = anLocalInt_41_ & 0x7;
	    int anLocalInt_44_ = (((Class239) (Node_Sub31_Sub15_Sub1
					       .aClass239Array6640[argument]))
				  .anInt1740);
	    int anLocalInt_45_ = anLocalInt_42_ + (anLocalInt_44_ >> 28) & 0x3;
	    int anLocalInt_46_ = anLocalInt_44_ >> 14 & 0xff;
	    int anLocalInt_47_ = anLocalInt_44_ & 0xff;
	    if (anLocalInt_43_ == 0) {
		anLocalInt_46_--;
		anLocalInt_47_--;
	    }
	    if (anLocalInt_43_ == 1)
		anLocalInt_47_--;
	    if (anLocalInt_43_ == 2) {
		anLocalInt_47_--;
		anLocalInt_46_++;
	    }
	    if (anLocalInt_43_ == 3)
		anLocalInt_46_--;
	    if (anLocalInt_43_ == 4)
		anLocalInt_46_++;
	    if (anLocalInt_43_ == 5) {
		anLocalInt_47_++;
		anLocalInt_46_--;
	    }
	    if (anLocalInt_43_ == 6)
		anLocalInt_47_++;
	    if (anLocalInt_43_ == 7) {
		anLocalInt_47_++;
		anLocalInt_46_++;
	    }
	    ((Class239) Node_Sub31_Sub15_Sub1.aClass239Array6640[argument])
		.anInt1740
		= anLocalInt_47_ + (anLocalInt_45_ << 28) + (anLocalInt_46_
							     << 14);
	    return false;
	}
	int anLocalInt_48_ = argument_29_.method850(-1, 18);
	int anLocalInt_49_ = anLocalInt_48_ >> 16;
	int anLocalInt_50_ = (anLocalInt_48_ & 0xffc9) >> 8;
	if (argument_30_ != 0)
	    anInt5009 = 22;
	int anLocalInt_51_ = anLocalInt_48_ & 0xff;
	int anLocalInt_52_ = (((Class239) (Node_Sub31_Sub15_Sub1
					   .aClass239Array6640[argument]))
			      .anInt1740);
	int anLocalInt_53_ = (anLocalInt_52_ >> 28) + anLocalInt_49_ & 0x3;
	int anLocalInt_54_ = (anLocalInt_52_ >> 14) + anLocalInt_50_ & 0xff;
	int anLocalInt_55_ = anLocalInt_51_ + anLocalInt_52_ & 0xff;
	((Class239) Node_Sub31_Sub15_Sub1.aClass239Array6640[argument])
	    .anInt1740
	    = anLocalInt_55_ + (anLocalInt_53_ << 28) + (anLocalInt_54_ << 14);
	return false;
    }
    
    Class133_Sub1(int argument_56_, int argument_57_, int argument_58_,
		  int argument_59_, int argument_60_, int argument_61_,
		  int argument_62_) {
	super(argument_60_, argument_61_, argument_62_);
	anInt5006 = argument_59_;
	anInt5004 = argument_57_;
	anInt5002 = argument_56_;
	anInt5005 = argument_58_;
    }
}
