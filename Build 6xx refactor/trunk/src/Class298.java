/* Class298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class298
{
    static Class166 aClass166_2474 = new Class166(118, -2);
    static int anInt2475;
    static int[] anIntArray2476 = null;
    
    static final boolean method3517
	(DoublyLinkedNodeP2_Sub2 argument, boolean argument_0_, byte[][][] argument_1_,
	 int argument_2_, byte argument_3_) {
	if (!Node_Sub31_Sub16.aBoolean5911)
	    return false;
	int anLocalInt
	    = ((DoublyLinkedNodeP2_Sub2) argument).worldX >> LightingManager.lightCoordRShift;
	int anLocalInt_4_ = anLocalInt;
	int anLocalInt_5_
	    = ((DoublyLinkedNodeP2_Sub2) argument).worldZ >> LightingManager.lightCoordRShift;
	int anLocalInt_6_ = anLocalInt_5_;
	if (argument instanceof DoublyLinkedNodeP2_Sub2_Sub2) {
	    anLocalInt_4_
		= (((DoublyLinkedNodeP2_Sub2_Sub2) (DoublyLinkedNodeP2_Sub2_Sub2) argument)
		   .right);
	    anLocalInt_6_
		= (((DoublyLinkedNodeP2_Sub2_Sub2) (DoublyLinkedNodeP2_Sub2_Sub2) argument)
		   .top);
	    anLocalInt = (((DoublyLinkedNodeP2_Sub2_Sub2) (DoublyLinkedNodeP2_Sub2_Sub2) argument)
			  .left);
	    anLocalInt_5_
		= (((DoublyLinkedNodeP2_Sub2_Sub2) (DoublyLinkedNodeP2_Sub2_Sub2) argument)
		   .bottom);
	}
	for (int anLocalInt_7_ = anLocalInt; anLocalInt_7_ <= anLocalInt_4_;
	     anLocalInt_7_++) {
	    for (int anLocalInt_8_ = anLocalInt_5_;
		 anLocalInt_8_ <= anLocalInt_6_; anLocalInt_8_++) {
		if ((((DoublyLinkedNodeP2_Sub2) argument).aByte4509
		     < LightingManager.yMapSize)
		    && anLocalInt_7_ >= Class243.anInt3602
		    && anLocalInt_7_ < Class353_Sub1.anInt5477
		    && anLocalInt_8_ >= Statics.anInt6448
		    && anLocalInt_8_ < Class245_Sub2.anInt5315) {
		    if ((argument_1_ != null
			 && ((DoublyLinkedNodeP2_Sub2) argument).lightingHL >= argument_2_
			 && (argument_1_[((DoublyLinkedNodeP2_Sub2) argument).lightingHL]
			     [anLocalInt_7_][anLocalInt_8_]) == argument_3_)
			|| !argument.method1765(124)
			|| argument.method1780(101,
					       (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1
						.aGraphicsToolkit6834))) {
			if (!argument_0_
			    && anLocalInt_7_ >= Class189_Sub2.anInt5642 - 16
			    && anLocalInt_7_ <= Class189_Sub2.anInt5642 + 16
			    && anLocalInt_8_ >= Class311.anInt2592 - 16
			    && anLocalInt_8_ <= Class311.anInt2592 + 16) {
			    if (Node_Sub31_Sub10.aBoolean5882) {
				Class179_Sub1.aClass130Array5271
				    [RsInterface.anInt1881++]
				    .method2433(-4194, argument);
				RsInterface.anInt1881 %= Statics.anInt1650;
			    } else
				argument.method1773
				    ((byte) 122, (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1
						  .aGraphicsToolkit6834));
			}
		    } else
			return false;
		}
	    }
	}
	return true;
    }
    
    static final Node_Sub29 method3518(int argument, int argument_9_,
					  int argument_10_, int argument_11_) {
	Node_Sub29 class59_sub29 = null;
	if (argument_9_ == 0)
	    class59_sub29
		= Class91.method1683((byte) 88,
				     Node_Sub31_Sub16.aClass372_5910,
				     Class272.aClass207_2171);
	if (argument_11_ != 255)
	    return null;
	if (argument_9_ == 1)
	    class59_sub29
		= Class91.method1683((byte) 45,
				     Node_Sub31_Sub16.aClass372_5910,
				     Class271.aClass207_2165);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p2i_dupl(argument_10_ + MapRelated.baseZ);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p2ip128(argument + MapRelated.baseX);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129.p1
            (!client.keyHandler.isKeyDown(82) ? 0 : 1);
	Class18.aBoolean127 = false;
	Class382.anInt3242 = argument;
	ModeWhatEnum.anInt2310 = argument_10_;
	Class353_Sub1.method3892(argument_11_ ^ ~0xd1);
	return class59_sub29;
    }
    
    static final String method3519(MenuAction argument,
				   boolean argument_12_) {
	if (((MenuAction) argument).aString6274 == null
	    || ((MenuAction) argument).aString6274.length() == 0) {
	    if (((MenuAction) argument).aString6276 != null
		&& ((MenuAction) argument).aString6276.length() > 0)
		return (((MenuAction) argument).aString6270
			+ MultilanguageString.SPACE_OR_COLON
			      .getLocalizedString(client.language)
			+ ((MenuAction) argument).aString6276);
	    return ((MenuAction) argument).aString6270;
	}
	if (((MenuAction) argument).aString6276 == null
	    || ((MenuAction) argument).aString6276.length() <= 0)
	    return (((MenuAction) argument).aString6270
		    + MultilanguageString.SPACE_OR_COLON.getLocalizedString(
                client.language)
		    + ((MenuAction) argument).aString6274);
	return (((MenuAction) argument).aString6270
		+ MultilanguageString.SPACE_OR_COLON.getLocalizedString(client.language)
		+ ((MenuAction) argument).aString6276
		+ MultilanguageString.SPACE_OR_COLON.getLocalizedString(client.language)
		+ ((MenuAction) argument).aString6274);
    }
    
    public static void method3520(byte argument) {
	anIntArray2476 = null;
	Cs2Script.scriptStore = null;
	aClass166_2474 = null;
    }
}
