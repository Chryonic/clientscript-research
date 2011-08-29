/* Class359 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class359
{
    int anInt3036 = 128;
    int anInt3037;
    static int anInt3038 = 1;
    int anInt3039;
    int anInt3040;
    int anInt3041 = 128;
    static int[] bitMasks = new int[32];
    int anInt3043;
    /*synthetic*/ static Class aClass3044;
    
    static final void method3943
	(int argument, int argument_0_, byte argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_, int argument_6_) {
	if (argument_1_ != -8)
	    method3947(-117);
    while_92_:
	do {
	    if (argument_5_ >= 0 && argument >= 0
		&& argument_5_ < MapRelated.mapWidth - 1
		&& MapRelated.mapDepth - 1 > argument) {
		if (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676 != null) {
		    do {
			if (argument_2_ != 0) {
			    if (argument_2_ == 1) {
				Interface2 interface2
				    = ((Interface2)
				       GlTexture_Sub2.method2492(argument_4_, argument_5_, argument));
				if (interface2 != null) {
				    if (!(interface2
					  instanceof DoublyLinkedNodeP2_Sub2_Sub1_Sub1)) {
					int anLocalInt
					    = interface2.method7(argument_1_
								 - 23348);
					if (argument_0_ != 4
					    && argument_0_ != 5) {
					    if (argument_0_ != 6) {
						if (argument_0_ != 7) {
						    if (argument_0_ == 8) {
							Class307.method3600
							    (argument, 4,
							     argument_3_ + 4,
							     anLocalInt,
							     argument_1_ + 7,
							     argument_5_,
							     argument_6_,
							     argument_2_,
							     argument_4_);
							Class307.method3600
							    (argument, 4,
							     (argument_3_ + 2
							      & 0x3) + 4,
							     anLocalInt,
							     argument_1_ ^ 0x7,
							     argument_5_,
							     argument_6_,
							     argument_2_,
							     argument_4_);
						    }
						} else
						    Class307.method3600
							(argument, 4,
							 (argument_3_ + 2
							  & 0x3) + 4,
							 anLocalInt,
							 argument_1_ + 7,
							 argument_5_,
							 argument_6_,
							 argument_2_,
							 argument_4_);
					    } else
						Class307.method3600
						    (argument, 4,
						     argument_3_ + 4,
						     anLocalInt,
						     argument_1_ + 7,
						     argument_5_, argument_6_,
						     argument_2_, argument_4_);
					} else
					    Class307.method3600(argument, 4,
								argument_3_,
								anLocalInt, -1,
								argument_5_,
								argument_6_,
								argument_2_,
								argument_4_);
				    } else
					((DoublyLinkedNodeP2_Sub2_Sub1_Sub1)
					 (DoublyLinkedNodeP2_Sub2_Sub1_Sub1) interface2)
					    .aClass78_6554
					    .method1576(argument_6_, false);
				}
			    } else if (argument_2_ == 2) {
				Interface2 interface2
				    = ((Interface2)
				       (LoadingBar.method2831(argument_4_, argument_5_, argument, (aClass3044 != null ? aClass3044 : (aClass3044 = method3949("Interface2"))))));
				if (interface2 != null) {
				    if (argument_0_ == 11)
					argument_0_ = 10;
				    if (!(interface2
					  instanceof DoublyLinkedNodeP2_Sub2_Sub2_Sub3))
					Class307.method3600
					    (argument, argument_0_,
					     argument_3_,
					     interface2.method7(-23356), -1,
					     argument_5_, argument_6_,
					     argument_2_, argument_4_);
				    else
					((DoublyLinkedNodeP2_Sub2_Sub2_Sub3)
					 (DoublyLinkedNodeP2_Sub2_Sub2_Sub3) interface2)
					    .aClass78_6626
					    .method1576(argument_6_, false);
				}
			    } else {
				if (argument_2_ != 3)
				    break;
				Interface2 interface2
				    = ((Interface2)
				       Statics.method1330(argument_4_, argument_5_, argument));
				if (interface2 == null)
				    break;
				if (interface2
				    instanceof DoublyLinkedNodeP2_Sub2_Sub4_Sub1)
				    ((DoublyLinkedNodeP2_Sub2_Sub4_Sub1)
				     (DoublyLinkedNodeP2_Sub2_Sub4_Sub1) interface2)
					.aClass78_6576
					.method1576(argument_6_, false);
				else
				    Class307.method3600
					(argument, argument_0_, argument_3_,
					 interface2
					     .method7(argument_1_ ^ 0x5b3c),
					 -1, argument_5_, argument_6_,
					 argument_2_, argument_4_);
			    }
			    break;
			}
			Interface2 interface2
			    = ((Interface2)
			       Node_Sub31_Sub15_Sub1.method921(argument_4_,
                           argument_5_,
                           argument));
			Interface2 interface2_7_
			    = ((Interface2)
			       ClanChannel.method1326(argument_4_, argument_5_, argument));
			if (interface2 != null && argument_0_ != 2) {
			    if (interface2 instanceof DoublyLinkedNodeP2_Sub2_Sub3_Sub2)
				((DoublyLinkedNodeP2_Sub2_Sub3_Sub2)
				 (DoublyLinkedNodeP2_Sub2_Sub3_Sub2) interface2)
				    .aClass78_6607
				    .method1576(argument_6_, false);
			    else
				Class307.method3600(argument, argument_0_,
						    argument_3_,
						    interface2.method7(-23356),
						    -1, argument_5_,
						    argument_6_, argument_2_,
						    argument_4_);
			}
			if (interface2_7_ == null)
			    break while_92_;
			if (interface2_7_ instanceof DoublyLinkedNodeP2_Sub2_Sub3_Sub2) {
			    ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2)
			     (DoublyLinkedNodeP2_Sub2_Sub3_Sub2) interface2_7_)
				.aClass78_6607.method1576(argument_6_, false);
			    break;
			}
			Class307.method3600(argument, argument_0_, argument_3_,
					    interface2_7_.method7(-23356), -1,
					    argument_5_, argument_6_,
					    argument_2_, argument_4_);
		    } while (false);
		    break;
		}
		break;
	    }
	} while (false);
    }
    
    static final Class76 method3944(Js5Store argument, int argument_8_,
				    int argument_9_) {
	byte[] anLocalInts = argument.getFlatData(argument_9_);
	if (anLocalInts == null)
	    return null;
	return new Class76(anLocalInts);
    }
    
    final void method3945(Class359 argument_10_, byte argument_11_) {
	((Class359) this).anInt3041 = ((Class359) argument_10_).anInt3041;
	((Class359) this).anInt3043 = ((Class359) argument_10_).anInt3043;
	((Class359) this).anInt3037 = ((Class359) argument_10_).anInt3037;
	((Class359) this).anInt3040 = ((Class359) argument_10_).anInt3040;
	((Class359) this).anInt3036 = ((Class359) argument_10_).anInt3036;
	((Class359) this).anInt3039 = ((Class359) argument_10_).anInt3039;
    }
    
    final Class359 method3946(boolean argument_12_) {
	return new Class359(((Class359) this).anInt3037,
			    ((Class359) this).anInt3036,
			    ((Class359) this).anInt3041,
			    ((Class359) this).anInt3039,
			    ((Class359) this).anInt3043,
			    ((Class359) this).anInt3040);
    }
    
    public static void method3947(int argument) {
	bitMasks = null;
    }
    
    static final String method3948(int argument, String argument_13_) {
	if (argument_13_ == null)
	    return null;
	int anLocalInt = 0;
	int anLocalInt_14_;
	for (anLocalInt_14_ = argument_13_.length();
	     anLocalInt < anLocalInt_14_; anLocalInt++) {
	    if (!Node_Sub9_Sub5.method680((byte) 123,
                argument_13_.charAt(anLocalInt)))
		break;
	}
	for (/**/;
	     (anLocalInt < anLocalInt_14_
	      && Node_Sub9_Sub5.method680((byte) 122,
                 argument_13_
                         .charAt(anLocalInt_14_ - 1)));
	     anLocalInt_14_--) {
	    /* empty */
	}
	int anLocalInt_15_ = -anLocalInt + anLocalInt_14_;
	if (anLocalInt_15_ < 1 || anLocalInt_15_ > 12)
	    return null;
	StringBuffer stringbuffer = new StringBuffer(anLocalInt_15_);
	for (int anLocalInt_16_ = anLocalInt; anLocalInt_14_ > anLocalInt_16_;
	     anLocalInt_16_++) {
	    char anLocalChar = argument_13_.charAt(anLocalInt_16_);
	    if (Class62_Sub3.method1361(argument - 9417, anLocalChar)) {
		char anLocalChar_17_
		    = Class101.method1734((byte) 109, anLocalChar);
		if (anLocalChar_17_ != 0)
		    stringbuffer.append(anLocalChar_17_);
	    }
	}
	if (argument != 18123)
	    return null;
	if (stringbuffer.length() == 0)
	    return null;
	return stringbuffer.toString();
    }
    
    Class359(int argument_18_) {
	((Class359) this).anInt3037 = argument_18_;
    }
    
    private Class359(int argument_19_, int argument_20_, int argument_21_,
		     int argument_22_, int argument_23_, int argument_24_) {
	((Class359) this).anInt3043 = argument_23_;
	((Class359) this).anInt3040 = argument_24_;
	((Class359) this).anInt3039 = argument_22_;
	((Class359) this).anInt3037 = argument_19_;
	((Class359) this).anInt3036 = argument_20_;
	((Class359) this).anInt3041 = argument_21_;
    }
    
    /*synthetic*/ static Class method3949(String argument) {
	try {
	    return Class.forName(argument);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
        int anLocalInt = 2;
        for (int arrayIndex = 0; arrayIndex < 32; arrayIndex++) {
            bitMasks[arrayIndex] = anLocalInt - 1;
            anLocalInt += anLocalInt;
        }
    }
}
