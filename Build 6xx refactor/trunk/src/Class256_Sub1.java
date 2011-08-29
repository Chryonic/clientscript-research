/* Class256_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class256_Sub1 extends Class256 implements Interface7_Impl3
{
    static Class207 aClass207_5619;
    static int[] anIntArray5620 = new int[2048];

    static final void method3281(Node_Sub28_Sub1 argument,
				 byte argument_0_) {
	argument.method847(false);
	int anLocalInt = 0;
	for (int anLocalInt_1_ = 0; Class224.anInt1578 > anLocalInt_1_;
	     anLocalInt_1_++) {
	    int anLocalInt_2_ = Class242.anIntArray1769[anLocalInt_1_];
	    if ((Statics.aByteArray199[anLocalInt_2_] & 0x1) == 0) {
		if (anLocalInt > 0) {
		    Statics.aByteArray199[anLocalInt_2_]
			= (byte) MathStatics.OR((Statics.aByteArray199[anLocalInt_2_]), 2);
		    anLocalInt--;
		} else {
		    int anLocalInt_3_ = argument.method850(-1, 1);
		    if (anLocalInt_3_ == 0) {
			anLocalInt = GlImageSkybox.method1758((byte) -64, argument);
			Statics.aByteArray199[anLocalInt_2_]
			    = (byte) (MathStatics.OR(Statics.aByteArray199[anLocalInt_2_], 2));
		    } else
			Class260.method3312((byte) -81, anLocalInt_2_,
					    argument);
		}
	    }
	}
	int anLocalInt_4_ = 16 % ((-20 - argument_0_) / 52);
	argument.method841(-104);
	if (anLocalInt != 0)
	    throw new RuntimeException("nsn0");
	argument.method847(false);
	for (int anLocalInt_5_ = 0; Class224.anInt1578 > anLocalInt_5_;
	     anLocalInt_5_++) {
	    int anLocalInt_6_ = Class242.anIntArray1769[anLocalInt_5_];
	    if ((Statics.aByteArray199[anLocalInt_6_] & 0x1) != 0) {
		if (anLocalInt > 0) {
		    anLocalInt--;
		    Statics.aByteArray199[anLocalInt_6_]
			= (byte) MathStatics.OR((Statics.aByteArray199[anLocalInt_6_]), 2);
		} else {
		    int anLocalInt_7_ = argument.method850(-1, 1);
		    if (anLocalInt_7_ == 0) {
			anLocalInt
			    = GlImageSkybox.method1758((byte) -103, argument);
			Statics.aByteArray199[anLocalInt_6_]
			    = (byte) (MathStatics.OR(Statics.aByteArray199[anLocalInt_6_], 2));
		    } else
			Class260.method3312((byte) -113, anLocalInt_6_,
					    argument);
		}
	    }
	}
	argument.method841(-83);
	if (anLocalInt != 0)
	    throw new RuntimeException("nsn1");
	argument.method847(false);
	for (int anLocalInt_8_ = 0; Class189.anInt3624 > anLocalInt_8_;
	     anLocalInt_8_++) {
	    int anLocalInt_9_ = Class235.anIntArray1719[anLocalInt_8_];
	    if ((Statics.aByteArray199[anLocalInt_9_] & 0x1) != 0) {
		if (anLocalInt > 0) {
		    anLocalInt--;
		    Statics.aByteArray199[anLocalInt_9_]
			= (byte) MathStatics.OR((Statics.aByteArray199[anLocalInt_9_]), 2);
		} else {
		    int anLocalInt_10_ = argument.method850(-1, 1);
		    if (anLocalInt_10_ == 0) {
			anLocalInt
			    = GlImageSkybox.method1758((byte) -103, argument);
			Statics.aByteArray199[anLocalInt_9_]
			    = (byte) (MathStatics.OR(Statics.aByteArray199[anLocalInt_9_], 2));
		    } else if (Class133_Sub1.method2450(anLocalInt_9_,
							argument, 0))
			Statics.aByteArray199[anLocalInt_9_]
			    = (byte) (MathStatics.OR(Statics.aByteArray199[anLocalInt_9_], 2));
		}
	    }
	}
	argument.method841(-110);
	if (anLocalInt != 0)
	    throw new RuntimeException("nsn2");
	argument.method847(false);
	for (int anLocalInt_11_ = 0; anLocalInt_11_ < Class189.anInt3624;
	     anLocalInt_11_++) {
	    int anLocalInt_12_ = Class235.anIntArray1719[anLocalInt_11_];
	    if ((Statics.aByteArray199[anLocalInt_12_] & 0x1) == 0) {
		if (anLocalInt > 0) {
		    anLocalInt--;
		    Statics.aByteArray199[anLocalInt_12_]
			= (byte) (MathStatics.OR(Statics.aByteArray199[anLocalInt_12_], 2));
		} else {
		    int anLocalInt_13_ = argument.method850(-1, 1);
		    if (anLocalInt_13_ == 0) {
			anLocalInt = GlImageSkybox.method1758((byte) -74, argument);
			Statics.aByteArray199[anLocalInt_12_]
			    = (byte) (MathStatics.OR(Statics.aByteArray199[anLocalInt_12_], 2));
		    } else if (Class133_Sub1.method2450(anLocalInt_12_,
							argument, 0))
			Statics.aByteArray199[anLocalInt_12_]
			    = (byte) (MathStatics.OR(Statics.aByteArray199[anLocalInt_12_], 2));
		}
	    }
	}
	argument.method841(-114);
	if (anLocalInt != 0)
	    throw new RuntimeException("nsn3");
	Class189.anInt3624 = 0;
	Class224.anInt1578 = 0;
	for (int anLocalInt_14_ = 1; anLocalInt_14_ < 2048; anLocalInt_14_++) {
	    Statics.aByteArray199[anLocalInt_14_] >>= 1;
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		= (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		   [anLocalInt_14_]);
	    if (class104_sub2_sub2_sub5_sub2 != null)
		Class242.anIntArray1769[Class224.anInt1578++] = anLocalInt_14_;
	    else
		Class235.anIntArray1719[Class189.anInt3624++] = anLocalInt_14_;
	}
    }
    
    Class256_Sub1(GraphicsToolkit_Sub2_Sub1 argument_15_, int argument_16_,
		  boolean argument_17_, int[][] argument_18_) {
	super(argument_15_, 34067, Applet_Sub1.aClass320_9,
	      DataType.BYTE, argument_16_ * argument_16_ * 6,
	      argument_17_);
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	if (argument_17_) {
	    for (int anLocalInt = 0; anLocalInt < 6; anLocalInt++)
		this.method3279(argument_18_[anLocalInt], anLocalInt + 34069,
				argument_16_, true, argument_16_);
	} else {
	    for (int anLocalInt = 0; anLocalInt < 6; anLocalInt++)
		OpenGL.glTexImage2Di
		    (anLocalInt + 34069, 0, this.method3273(-11391),
		     argument_16_, argument_16_, 0,
		     Class157.method2592(41, ((Class256) this).aClass320_3534),
		     ((GraphicsToolkit_Sub2_Sub1)
		      ((Class256) this).aClass_ha_Sub2_Sub1_3531).anInt6476,
		     argument_18_[anLocalInt], 0);
	}
    }
    
    public static void method3282(int argument) {
	AthmosphericConditions.defaultSkyboxTextures = null;
	anIntArray5620 = null;
	aClass207_5619 = null;
    }
    
    static {
	aClass207_5619 = new Class207(63, 2);
    }
}
