/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class182
{
    static Class166 aClass166_1375;
    static int anInt1377 = -1;
    static int anInt1378;
    
    static final void method2845(int argument) {
	Node_Sub31_Sub24.aBoolean5946 = false;
	DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.anIntArray6859 = null;
	Class111_Sub1.anIntArray4613 = null;
	Class101.anIntArray823 = null;
	DoublyLinkedNodeP2_Sub4_Sub2.anIntArray6446 = null;
	Node_Sub31_Sub29.anIntArray5979 = null;
    }
    
    static final void method2846(int argument, String argument_0_) {
	if (argument_0_ != null) {
	    if (Class257.anInt2013 >= 200 && !Node_Sub31_Sub10.aBoolean5880
		|| Class257.anInt2013 >= 200)
		Class214.method2986((byte) 102,
				    MultilanguageString.FRIENDS_LIST_FULL
					.getLocalizedString(client.language),
				    4);
	    else {
		String string = Class359.method3948(18123, argument_0_);
		if (string != null) {
		    for (int anLocalInt = 0; anLocalInt < Class257.anInt2013;
			 anLocalInt++) {
			String string_1_
			    = Class359.method3948(18123,
						  (Class260.aStringArray2031
						   [anLocalInt]));
			if (string_1_ != null && string_1_.equals(string)) {
			    Class214.method2986
				((byte) 115,
				 (argument_0_
				  + MultilanguageString.ALREADY_FRIENDS
					.getLocalizedString(client.language)),
				 4);
			    return;
			}
			if (Statics.aStringArray4827[anLocalInt]
			    != null) {
			    String string_2_
				= Class359.method3948(18123, (Statics
							      .aStringArray4827
							      [anLocalInt]));
			    if (string_2_ != null
				&& string_2_.equals(string)) {
				Class214.method2986((byte) 91,
						    (argument_0_
						     + (MultilanguageString
							    .ALREADY_FRIENDS
							    .getLocalizedString
                                        (
                                                client.language))),
						    4);
				return;
			    }
			}
		    }
		    for (int anLocalInt = 0; Class60.anInt436 > anLocalInt;
			 anLocalInt++) {
			String string_3_
			    = Class359.method3948(18123,
						  (Class76.aStringArray515
						   [anLocalInt]));
			if (string_3_ != null && string_3_.equals(string)) {
			    Class214.method2986
				((byte) 90,
				 (MultilanguageString.FRIEND_IGNORE_PT1
				      .getLocalizedString(client.language)
				  + argument_0_
				  + MultilanguageString.FRIEND_IGNORE_PT2
					.getLocalizedString(client.language)),
				 4);
			    return;
			}
			if (DoublyLinkedNodeP2_Sub4.aStringArray4528[anLocalInt]
			    != null) {
			    String string_4_
				= Class359.method3948(18123, (DoublyLinkedNodeP2_Sub4
							      .aStringArray4528
							      [anLocalInt]));
			    if (string_4_ != null
				&& string_4_.equals(string)) {
				Class214.method2986
				    ((byte) 94,
				     (MultilanguageString.FRIEND_IGNORE_PT1
					  .getLocalizedString(client.language)
				      + argument_0_
				      + (MultilanguageString.FRIEND_IGNORE_PT2.getLocalizedString
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
			Class214.method2986((byte) 76,
					    (MultilanguageString.CANT_FRIEND_SELF.getLocalizedString
                                (client.language)),
					    4);
		    else {
			Node_Sub29 class59_sub29
			    = Class91.method1683((byte) 50,
						 (Node_Sub31_Sub16
						  .aClass372_5910),
						 (Node_Sub32_Sub3
						  .aClass207_6079));
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129.p1
                    (
                            JagexStringUtils.strlenp1(argument_0_, (byte) 91));
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129
			    .pjstr(argument_0_);
			Class251.method3243(class59_sub29, true);
		    }
		}
	    }
	}
    }
    
    static final String method2847(byte argument) {
	String string = "www";
	if (TestingStageEnum.WTRC == client.modeWhere)
	    string = "www-wtrc";
	else if (TestingStageEnum.WTQA != client.modeWhere) {
	    if (TestingStageEnum.WTWIP == client.modeWhere)
		string = "www-wtwip";
	} else
	    string = "www-wtqa";
	String string_5_ = "";
	if (client.settingsString != null)
	    string_5_ = "/p=" + client.settingsString;
	return ("http://" + string + "."
		+ ((GameEnum) client.selectedGame).name + ".com/l="
		+ client.language + "/a=" + client.affiliateId
		+ string_5_ + "/");
    }
    
    public static void method2848(int argument) {
	aClass166_1375 = null;
	RsInterface.interfaceStore = null;
    }
    
    static {
	aClass166_1375 = new Class166(6, -2);
    }
}
