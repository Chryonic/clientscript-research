/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class177
{
    static final Node_Sub7 method2790(int argument) {
	if (Class179.aCyclicLinkedList_1329 == null || Statics.aClass151_1646 == null)
	    return null;
	Statics.aClass151_1646.method2550(Class179.aCyclicLinkedList_1329, 113);
	Node_Sub7 class59_sub7
	    = (Node_Sub7) Statics.aClass151_1646.method2547(3530);
	if (class59_sub7 == null)
	    return null;
	Class299 class299
	    = Class179.aClass20_1324
		  .method312(((Node_Sub7) class59_sub7).anInt3910, -115);
	if (class299 != null && ((Class299) class299).aBoolean2503
	    && class299.method3525((byte) -113, Class179.anInterface13_1325))
	    return class59_sub7;
	return Cs2CallStackEntry.method1548(-10100);
    }
    
    static final void method2791(int argument, int argument_0_,
				 byte argument_1_, int argument_2_,
				 int argument_3_, int argument_4_) {
	if (argument_1_ == -22) {
	    int anLocalInt
		= Node_Sub31_Sub8.method897(argument_0_, Class209.anInt1504,
                argument_1_ + 124915098,
                Node_Sub31_Sub13.anInt5896);
	    int anLocalInt_5_
		= Node_Sub31_Sub8.method897(argument, Class209.anInt1504,
                argument_1_ ^ ~0x7720d91,
                Node_Sub31_Sub13.anInt5896);
	    int anLocalInt_6_
		= Node_Sub31_Sub8.method897(argument_3_,
                Node_Sub35.anInt4156,
                124915076,
                Node_Sub9_Sub2.anInt5776);
	    int anLocalInt_7_
		= Node_Sub31_Sub8.method897(argument_2_,
                Node_Sub35.anInt4156,
                124915076,
                Node_Sub9_Sub2.anInt5776);
	    for (int anLocalInt_8_ = anLocalInt;
		 anLocalInt_8_ <= anLocalInt_5_; anLocalInt_8_++)
		Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_8_]), (byte) 94, anLocalInt_6_, anLocalInt_7_, argument_4_);
	}
    }

    static final void method2793(String argument, boolean argument_25_,
				 byte argument_26_) {
	if (argument != null) {
	    if (Class60.anInt436 >= 100)
		Class214.method2986((byte) 63,
				    MultilanguageString.IGNORE_LIST_FULL
					.getLocalizedString(client.language),
				    4);
	    else {
		String string = Class359.method3948(18123, argument);
		if (string != null) {
		    for (int anLocalInt = 0; anLocalInt < Class60.anInt436;
			 anLocalInt++) {
			String string_27_
			    = Class359.method3948(18123,
						  (Class76.aStringArray515
						   [anLocalInt]));
			if (string_27_ != null && string_27_.equals(string)) {
			    Class214.method2986
				((byte) 105,
				 (argument
				  + MultilanguageString.ALREADY_IGNORED
					.getLocalizedString(client.language)),
				 4);
			    return;
			}
			if (DoublyLinkedNodeP2_Sub4.aStringArray4528[anLocalInt]
			    != null) {
			    String string_28_
				= Class359.method3948(18123, (DoublyLinkedNodeP2_Sub4
							      .aStringArray4528
							      [anLocalInt]));
			    if (string_28_ != null
				&& string_28_.equals(string)) {
				Class214.method2986((byte) 102,
						    (argument
						     + (MultilanguageString
							    .ALREADY_IGNORED
							    .getLocalizedString
                                        (
                                                client.language))),
						    4);
				return;
			    }
			}
		    }
		    for (int anLocalInt = 0; anLocalInt < Class257.anInt2013;
			 anLocalInt++) {
			String string_29_
			    = Class359.method3948(18123,
						  (Class260.aStringArray2031
						   [anLocalInt]));
			if (string_29_ != null && string_29_.equals(string)) {
			    Class214.method2986
				((byte) 111,
				 (MultilanguageString.IGNORE_ON_FRIEND_PT1
				      .getLocalizedString(client.language)
				  + argument
				  + MultilanguageString.IGNORE_ON_FRIEND_PT2
					.getLocalizedString(client.language)),
				 4);
			    return;
			}
			if (Statics.aStringArray4827[anLocalInt]
			    != null) {
			    String string_30_
				= Class359.method3948(18123, (Statics
							      .aStringArray4827
							      [anLocalInt]));
			    if (string_30_ != null
				&& string_30_.equals(string)) {
				Class214.method2986
				    ((byte) 125,
				     (MultilanguageString.IGNORE_ON_FRIEND_PT1
					  .getLocalizedString(client.language)
				      + argument
				      + (MultilanguageString.IGNORE_ON_FRIEND_PT2.getLocalizedString
                             (client.language))),
				     4);
				return;
			    }
			}
		    }
		    if (Class359.method3948
			    (18123,
			     (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
			       Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			      .aString6836))
			    .equals(string))
			Class214.method2986((byte) 50,
					    (MultilanguageString.CANT_IGNORE_SELF.getLocalizedString
                                (client.language)),
					    4);
		    else {
			Node_Sub29 class59_sub29
			    = Class91.method1683((byte) 81,
						 (Node_Sub31_Sub16
						  .aClass372_5910),
						 (Node_Sub37_Sub2
						  .aClass207_6118));
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129.p1
                    (
                            JagexStringUtils.strlenp1(argument, (byte) 85) + 1);
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129.pjstr(argument);
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129
			    .p1(!argument_25_ ? 0 : 1);
			Class251.method3243(class59_sub29, true);
		    }
		}
	    }
	}
    }
    
    static final Class217 method2794(boolean argument, int argument_31_) {
	Class217[] class217s = Class283.method3450(1807868904);
	for (int anLocalInt = 0; anLocalInt < class217s.length; anLocalInt++) {
	    if (((Class217) class217s[anLocalInt]).anInt1524 == argument_31_)
		return class217s[anLocalInt];
	}
	return null;
    }
}
