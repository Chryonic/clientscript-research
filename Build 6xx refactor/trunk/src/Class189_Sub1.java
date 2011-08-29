/* Class189_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class189_Sub1 extends Class189
{
    private Class368 aClass368_5640;
    static long aLong5641;
    
    static final void method2874(DoublyLinkedNodeP2_Sub2_Sub2 argument,
				 boolean argument_0_) {
	for (int anLocalInt = ((DoublyLinkedNodeP2_Sub2_Sub2) argument).left;
	     anLocalInt <= ((DoublyLinkedNodeP2_Sub2_Sub2) argument).right;
	     anLocalInt++) {
	    for (int anLocalInt_1_
		     = ((DoublyLinkedNodeP2_Sub2_Sub2) argument).bottom;
		 anLocalInt_1_ <= ((DoublyLinkedNodeP2_Sub2_Sub2) argument).top;
		 anLocalInt_1_++) {
		Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
				     [((DoublyLinkedNodeP2_Sub2) argument).lightingHL]
				     [anLocalInt][anLocalInt_1_]);
		if (class148 != null) {
		    Class110 class110 = ((Class148) class148).aClass110_1126;
		    Class110 class110_2_ = null;
		    for (/**/; class110 != null;
			 class110 = ((Class110) class110).aClass110_912) {
			if (((Class110) class110).aClass104_Sub2_Sub2_911
			    == argument) {
			    if (class110_2_ != null)
				((Class110) class110_2_).aClass110_912
				    = ((Class110) class110).aClass110_912;
			    else
				((Class148) class148).aClass110_1126
				    = ((Class110) class110).aClass110_912;
			    class110.method1988(-25016);
			    break;
			}
			class110_2_ = class110;
		    }
		}
	    }
	}
	Class191.method2886(argument);
    }
    
    static final void method2875
	(int argument, int argument_3_, int argument_4_, int argument_5_,
	 int argument_6_, boolean argument_7_, int argument_8_,
	 int argument_9_, int argument_10_, int argument_11_) {
	if (argument_4_ < 512 || argument < 512
	    || MapRelated.mapWidth * 512 - 1024 < argument_4_
	    || (MapRelated.mapDepth - 2) * 512 < argument)
	    DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0]
		= DoublyLinkedNode_Sub51_Sub2.anIntArray6227[1] = -1;
	else {
	    int anLocalInt
		= (-argument_3_
		   + Node_Sub31_Sub36.method993(argument_9_, argument_4_,
                -12040, argument));
	    if (!Class52.aBoolean391) {
		Class41.aClass350_304.method3835(argument_10_, 0, 0);
		Class389.aGraphicsToolkit3281.method2069(Class41.aClass350_304);
	    } else
		Class38.method398(true, (byte) -92);
	    if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
		Class389.aGraphicsToolkit3281.da(argument_4_, anLocalInt, argument,
					  DoublyLinkedNode_Sub51_Sub2.anIntArray6227);
	    else
		Class389.aGraphicsToolkit3281.HA(argument_4_, anLocalInt, argument,
					  Class390.anInt3285,
					  DoublyLinkedNode_Sub51_Sub2.anIntArray6227);
	    if (Class52.aBoolean391)
		RsInterface.method3232(-15443);
	    else {
		Class41.aClass350_304.method3835(-argument_10_, 0, 0);
		Class389.aGraphicsToolkit3281.method2069(Class41.aClass350_304);
	    }
	}
    }
    
    static final void method2876(int argument, String argument_12_) {
	if (argument_12_ != null) {
	    if (argument_12_.startsWith("*"))
		argument_12_ = argument_12_.substring(1);
	    String string = Class359.method3948(18123, argument_12_);
	    if (string != null) {
		for (int anLocalInt = argument; Class60.anInt436 > anLocalInt;
		     anLocalInt++) {
		    String string_13_ = Class76.aStringArray515[anLocalInt];
		    if (string_13_.startsWith("*"))
			string_13_ = string_13_.substring(1);
		    string_13_
			= Class359.method3948(argument ^ 0x46cb, string_13_);
		    if (string_13_ != null && string_13_.equals(string)) {
			Class60.anInt436--;
			for (int anLocalInt_14_ = anLocalInt;
			     anLocalInt_14_ < Class60.anInt436;
			     anLocalInt_14_++) {
			    Class76.aStringArray515[anLocalInt_14_]
				= Class76.aStringArray515[anLocalInt_14_ + 1];
			    DoublyLinkedNode_Sub51_Sub19_Sub1.aStringArray6676
				[anLocalInt_14_]
				= (DoublyLinkedNode_Sub51_Sub19_Sub1.aStringArray6676
				   [anLocalInt_14_ + 1]);
			    DoublyLinkedNodeP2_Sub4.aStringArray4528[anLocalInt_14_]
				= (DoublyLinkedNodeP2_Sub4.aStringArray4528
				   [anLocalInt_14_ + 1]);
			    Class18.aStringArray126[anLocalInt_14_]
				= Class18.aStringArray126[anLocalInt_14_ + 1];
			    Node_Sub6.aBooleanArray3907[anLocalInt_14_]
				= (Node_Sub6.aBooleanArray3907
				   [anLocalInt_14_ + 1]);
			}
			Class45.anInt316 = Class359.anInt3038;
			Node_Sub29 class59_sub29
			    = Class91.method1683((byte) 122,
						 (Node_Sub31_Sub16
						  .aClass372_5910),
						 Class62_Sub29.aClass207_4467);
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129.p1
                    (
                            JagexStringUtils.strlenp1(argument_12_, (byte) 112));
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129
			    .pjstr(argument_12_);
			Class251.method3243(class59_sub29, true);
			break;
		    }
		}
	    }
	}
    }
    
    final void method2869(int argument_15_, boolean argument_16_,
			  int argument_17_, int argument_18_) {
	int anLocalInt
	    = (this.method2871(2048)
	       * ((Class253) ((Class189) this).aClass253_3621).anInt3718
	       / 10000);
	if (argument_17_ < 102)
	    method2873(false, (byte) 30, 26, 91);
	int[] anLocalInts = new int[4];
	Class389.aGraphicsToolkit3281.getScissor(anLocalInts);
	Class389.aGraphicsToolkit3281.setClip(argument_18_, (((Class253) ((Class189) this).aClass253_3621).anInt3711 + argument_15_), anLocalInt + argument_18_, argument_15_ + 2);
	aClass368_5640.method4023
	    (argument_18_, argument_15_ + 2,
	     ((Class253) ((Class189) this).aClass253_3621).anInt3718,
	     ((Class253) ((Class189) this).aClass253_3621).anInt3711);
	Class389.aGraphicsToolkit3281.setClip(anLocalInts[0], anLocalInts[3], anLocalInts[2], anLocalInts[1]);
    }
    
    Class189_Sub1(Js5Store argument_19_, Js5Store argument_20_,
		  Class253_Sub3 argument_21_) {
	super(argument_19_, argument_20_, (Class253) argument_21_);
    }
    
    final void method2873(boolean argument_22_, byte argument_23_,
			  int argument_24_, int argument_25_) {
	Class389.aGraphicsToolkit3281.drawRect(argument_24_ - 2, argument_25_, ((Class253) ((Class189) this).aClass253_3621).anInt3718 + 4, ((Class253) ((Class189) this).aClass253_3621).anInt3711 + 2, ((Class253_Sub3) (Class253_Sub3) ((Class189) this).aClass253_3621).anInt5676, 0);
	int anLocalInt = -61 % ((64 - argument_23_) / 35);
	Class389.aGraphicsToolkit3281.drawRect(argument_24_ - 1, argument_25_ + 1, ((Class253) ((Class189) this).aClass253_3621).anInt3718 + 2, ((Class253) ((Class189) this).aClass253_3621).anInt3711, 0, 0);
    }
    
    public final boolean method58(int argument_26_) {
	if (argument_26_ != 20662)
	    method2876(98, null);
	if (!super.method58(argument_26_))
	    return false;
	return ((Class189) this).aJs5Store_3622.isFlatFile((((Class253_Sub3) (Class253_Sub3) (((Class189) this).aClass253_3621)).anInt5673));
    }
    
    public final void method57(int argument_27_) {
	super.method57(48);
	if (argument_27_ >= 36)
	    aClass368_5640
		= Node_Sub47_Sub7.method1128(47,
                (((Class189) this)
                        .aJs5Store_3622),
                ((Class253_Sub3)
                        (Class253_Sub3)
                                (((Class189) this)
                                        .aClass253_3621)).anInt5673);
    }
}
