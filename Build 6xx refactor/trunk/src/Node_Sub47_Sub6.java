/* Class59_Sub47_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub47_Sub6 extends Node_Sub47
{
    private byte aByte6175;
    private boolean aBoolean6176;
    static int anInt6177;
    static short[] aShortArray6178;
    private byte aByte6179;
    static Node_Sub19 aClass59_Sub19_6180;
    private byte aByte6181;
    private byte aByte6182;
    static long aLong6183 = -1L;
    static int anInt6184;
    static int anInt6185;
    
    public static void method1125(byte argument) {
	aClass59_Sub19_6180 = null;
	aShortArray6178 = null;
    }
    
    final void method1110(int argument_0_, Packet argument_1_) {
	aBoolean6176 = argument_1_.g1() == 1;
	if (argument_0_ < -56) {
	    aByte6179 = argument_1_.g1s();
	    aByte6182 = argument_1_.g1s();
	    aByte6181 = argument_1_.g1s();
	    aByte6175 = argument_1_.g1s();
	}
    }
    
    static final boolean method1126(DoublyLinkedNodeP2_Sub2_Sub2 argument,
				    boolean argument_2_) {
	boolean anLocalBoolean
	    = Node_Sub31_Sub5.aClass_sArray5858 == Class65.aClass_sArray455;
	int anLocalInt = 0;
	short anLocalInt_3_ = 0;
	byte anLocalInt_4_ = 0;
	argument.method1795(-125);
	if (((DoublyLinkedNodeP2_Sub2_Sub2) argument).left < 0
	    || ((DoublyLinkedNodeP2_Sub2_Sub2) argument).bottom < 0
	    || (((DoublyLinkedNodeP2_Sub2_Sub2) argument).right
		>= LightingManager.xMapSize)
	    || (((DoublyLinkedNodeP2_Sub2_Sub2) argument).top
		>= LightingManager.zMapSize))
	    return false;
	short anLocalInt_5_ = 0;
	for (int anLocalInt_6_ = ((DoublyLinkedNodeP2_Sub2_Sub2) argument).left;
	     anLocalInt_6_ <= ((DoublyLinkedNodeP2_Sub2_Sub2) argument).right;
	     anLocalInt_6_++) {
	    for (int anLocalInt_7_
		     = ((DoublyLinkedNodeP2_Sub2_Sub2) argument).bottom;
		 anLocalInt_7_ <= ((DoublyLinkedNodeP2_Sub2_Sub2) argument).top;
		 anLocalInt_7_++) {
		Class148 class148
		    = Node_Sub9_Sub5.method675((((DoublyLinkedNodeP2_Sub2) argument)
                .lightingHL),
                anLocalInt_6_,
                anLocalInt_7_);
		if (class148 != null) {
		    Class110 class110 = Class66.method1495(argument, 120);
		    Class110 class110_8_
			= ((Class148) class148).aClass110_1126;
		    if (class110_8_ == null)
			((Class148) class148).aClass110_1126 = class110;
		    else {
			for (/**/;
			     ((Class110) class110_8_).aClass110_912 != null;
			     class110_8_
				 = ((Class110) class110_8_).aClass110_912) {
			    /* empty */
			}
			((Class110) class110_8_).aClass110_912 = class110;
		    }
		    if (anLocalBoolean && ((DoublyLinkedNodeP2_Sub10.anIntArrayArray4599
					    [anLocalInt_6_][anLocalInt_7_])
					   & ~0xffffff) != 0) {
			anLocalInt = (DoublyLinkedNodeP2_Sub10.anIntArrayArray4599
				      [anLocalInt_6_][anLocalInt_7_]);
			anLocalInt_3_ = (Class62_Sub25.aShortArrayArray4443
					 [anLocalInt_6_][anLocalInt_7_]);
			anLocalInt_4_ = (Statics.aByteArrayArray297
					 [anLocalInt_6_][anLocalInt_7_]);
		    }
		    if (!argument_2_
			&& (((Class148) class148).aClass104_Sub2_Sub4_1134
			    != null)
			&& (((DoublyLinkedNodeP2_Sub2_Sub4)
			     ((Class148) class148).aClass104_Sub2_Sub4_1134)
			    .aShort6424) > anLocalInt_5_)
			anLocalInt_5_
			    = (((DoublyLinkedNodeP2_Sub2_Sub4)
				((Class148) class148).aClass104_Sub2_Sub4_1134)
			       .aShort6424);
		}
	    }
	}
	if (anLocalBoolean && (anLocalInt & ~0xffffff) != 0) {
	    for (int anLocalInt_9_
		     = ((DoublyLinkedNodeP2_Sub2_Sub2) argument).left;
		 anLocalInt_9_ <= ((DoublyLinkedNodeP2_Sub2_Sub2) argument).right;
		 anLocalInt_9_++) {
		for (int anLocalInt_10_
			 = ((DoublyLinkedNodeP2_Sub2_Sub2) argument).bottom;
		     (anLocalInt_10_
		      <= ((DoublyLinkedNodeP2_Sub2_Sub2) argument).top);
		     anLocalInt_10_++) {
		    if (((DoublyLinkedNodeP2_Sub10.anIntArrayArray4599[anLocalInt_9_]
			  [anLocalInt_10_])
			 & ~0xffffff)
			== 0) {
			DoublyLinkedNodeP2_Sub10.anIntArrayArray4599[anLocalInt_9_]
			    [anLocalInt_10_]
			    = anLocalInt;
			Class62_Sub25.aShortArrayArray4443[anLocalInt_9_]
			    [anLocalInt_10_]
			    = anLocalInt_3_;
			Statics.aByteArrayArray297[anLocalInt_9_]
			    [anLocalInt_10_]
			    = anLocalInt_4_;
		    }
		}
	    }
	}
	if (argument_2_)
	    DoublyLinkedNodeP2_Sub3.aClass104_Sub2_Sub2Array4522[Class51.anInt383++]
		= argument;
	else {
	    int anLocalInt_11_ = ((Node_Sub31_Sub5.aClass_sArray5858
				   == Class65.aClass_sArray455)
				  ? 1 : 0);
	    if (argument.method1766(-123)) {
		if (argument.method1772(0)) {
		    ((DoublyLinkedNodeP2_Sub2) argument).aClass104_Sub2_4515
			= (InputStream_Sub2.aClass104_Sub2Array36
			   [anLocalInt_11_]);
		    InputStream_Sub2.aClass104_Sub2Array36[anLocalInt_11_]
			= argument;
		} else {
		    ((DoublyLinkedNodeP2_Sub2) argument).aClass104_Sub2_4515
			= (Node_Sub31_Sub33.aClass104_Sub2Array6004
			   [anLocalInt_11_]);
		    Node_Sub31_Sub33.aClass104_Sub2Array6004[anLocalInt_11_]
			= argument;
		    Class18.aBoolean124 = true;
		}
	    } else {
		((DoublyLinkedNodeP2_Sub2) argument).aClass104_Sub2_4515
		    = Statics.aClass104_Sub2Array851[anLocalInt_11_];
		Statics.aClass104_Sub2Array851[anLocalInt_11_] = argument;
	    }
	}
	if (argument_2_)
	    ((DoublyLinkedNodeP2_Sub2) argument).anInt4511 -= anLocalInt_5_;
	return true;
    }
    
    final void method1109(ClanSettings argument_12_, int argument_13_) {
	((ClanSettings) argument_12_).aBoolean1263 = aBoolean6176;
	((ClanSettings) argument_12_).aByte1272 = aByte6181;
	((ClanSettings) argument_12_).aByte1265 = aByte6179;
	((ClanSettings) argument_12_).aByte1264 = aByte6182;
	if (argument_13_ != 5)
	    method1125((byte) -33);
	((ClanSettings) argument_12_).aByte1261 = aByte6175;
    }
    
    static final int method1127(int argument, int argument_14_) {
	if (DoublyLinkedNodeP2_Sub10.anIntArrayArray4599 != null)
	    return (DoublyLinkedNodeP2_Sub10.anIntArrayArray4599[argument][argument_14_]
		    & 0xffffff);
	return 0;
    }
    
    static {
	aClass59_Sub19_6180 = new Node_Sub19(0, 0);
	anInt6184 = 0;
    }
}
