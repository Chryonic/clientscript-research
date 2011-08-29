/* Class59_Sub53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ClanChannel extends Node
{
    private boolean aBoolean4349;
    int anInt4350 = 0;
    private int[] anIntArray4351;
    byte aByte4352;
    static int anInt4353 = 0;
    Class388[] aClass388Array4354;
    long updateNum;
    private boolean aBoolean4356;
    String aString4357 = null;
    byte aByte4358;
    
    final int[] method1320(byte argument_0_) {
	if (anIntArray4351 == null) {
	    String[] strings = new String[((ClanChannel) this).anInt4350];
	    anIntArray4351 = new int[((ClanChannel) this).anInt4350];
	    for (int anLocalInt = 0;
		 anLocalInt < ((ClanChannel) this).anInt4350; anLocalInt++) {
		strings[anLocalInt]
		    = ((Class388) (((ClanChannel) this).aClass388Array4354
				   [anLocalInt])).aString3272;
		anIntArray4351[anLocalInt] = anLocalInt;
	    }
	    Class329.method3702(anIntArray4351, true, strings);
	}
	return anIntArray4351;
    }
    
    final int method1321(String argument_1_, int argument_2_) {
	for (int anLocalInt = 0; anLocalInt < ((ClanChannel) this).anInt4350;
	     anLocalInt++) {
	    if (((Class388)
		 ((ClanChannel) this).aClass388Array4354[anLocalInt])
		    .aString3272.equalsIgnoreCase(argument_1_))
		return anLocalInt;
	}
	return -1;
    }
    
    private final void method1322(int argument_3_, boolean argument_4_) {
	if (((ClanChannel) this).aClass388Array4354 != null)
	    JagStrings.memcpy(((ClanChannel) this).aClass388Array4354, 0, (((ClanChannel) this).aClass388Array4354 = new Class388[argument_3_]), 0, ((ClanChannel) this).anInt4350);
	else
	    ((ClanChannel) this).aClass388Array4354
		= new Class388[argument_3_];
	if (argument_4_)
	    ((ClanChannel) this).aByte4358 = (byte) -18;
    }
    
    private final void method1323(Packet argument_5_,
				  byte argument_6_) {
	int anLocalInt = argument_5_.g1();
	if ((anLocalInt & 0x1) != 0)
	    aBoolean4349 = true;
	int anLocalInt_7_ = 105 % ((8 - argument_6_) / 55);
	if ((anLocalInt & 0x2) != 0)
	    aBoolean4356 = true;
	((Node) this).hash = argument_5_.g8();
	((ClanChannel) this).updateNum = argument_5_.g8();
	((ClanChannel) this).aString4357 = argument_5_.gstr();
	argument_5_.g1();
	((ClanChannel) this).aByte4358 = argument_5_.g1s();
	((ClanChannel) this).aByte4352 = argument_5_.g1s();
	((ClanChannel) this).anInt4350 = argument_5_.g2();
	if (((ClanChannel) this).anInt4350 > 0) {
	    ((ClanChannel) this).aClass388Array4354
		= new Class388[((ClanChannel) this).anInt4350];
	    for (int anLocalInt_8_ = 0;
		 anLocalInt_8_ < ((ClanChannel) this).anInt4350;
		 anLocalInt_8_++) {
		Class388 class388 = new Class388();
		if (aBoolean4349)
		    argument_5_.g8();
		if (aBoolean4356)
		    ((Class388) class388).aString3272
			= argument_5_.gstr();
		((Class388) class388).aByte3274
		    = argument_5_.g1s();
		((Class388) class388).anInt3275 = argument_5_.g2();
		((ClanChannel) this).aClass388Array4354[anLocalInt_8_]
		    = class388;
	    }
	}
    }
    
    static final void method1324
	(float argument, int argument_9_, boolean argument_10_,
	 float argument_11_, int argument_12_, int argument_13_,
	 int argument_14_, Class111 argument_15_, float argument_16_,
	 byte[] argument_17_, float argument_18_, int argument_19_,
	 float argument_20_, int argument_21_) {
	int anLocalInt = argument_9_ * argument_12_;
	float[] fs = new float[anLocalInt];
	for (int anLocalInt_22_ = 0; anLocalInt_22_ < argument_14_;
	     anLocalInt_22_++) {
	    argument_15_.method1992(argument / (float) argument_12_,
				    argument_12_,
				    argument_16_ / (float) argument_13_,
				    argument_19_, 0,
				    argument_11_ / (float) argument_9_,
				    argument_9_, -89, argument_20_ * 127.0F,
				    fs, argument_13_);
	    int anLocalInt_23_ = argument_21_;
	    argument *= 2.0F;
	    argument_11_ *= 2.0F;
	    argument_20_ *= argument_18_;
	    argument_16_ *= 2.0F;
	    for (int anLocalInt_24_ = 0; anLocalInt_24_ < anLocalInt;
		 anLocalInt_24_++) {
		argument_17_[anLocalInt_23_] += fs[anLocalInt_24_];
		anLocalInt_23_++;
	    }
	}
	int anLocalInt_25_ = argument_21_;
	for (int anLocalInt_26_ = 0; anLocalInt > anLocalInt_26_;
	     anLocalInt_26_++) {
	    argument_17_[anLocalInt_25_]
		= (byte) (argument_17_[anLocalInt_25_] + 127);
	    anLocalInt_25_++;
	}
    }
    
    final void method1325(int argument_27_, int argument_28_) {
	((ClanChannel) this).anInt4350--;
	if ((((ClanChannel) this).anInt4350 ^ 0xffffffff) == argument_27_)
	    ((ClanChannel) this).aClass388Array4354 = null;
	else
	    JagStrings.memcpy(((ClanChannel) this).aClass388Array4354, argument_28_ + 1, ((ClanChannel) this).aClass388Array4354, argument_28_, (-argument_28_ + ((ClanChannel) this).anInt4350));
	anIntArray4351 = null;
    }
    
    static final DoublyLinkedNodeP2_Sub2_Sub3 method1326(int argument, int argument_29_,
					       int argument_30_) {
	Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			     [argument][argument_29_][argument_30_]);
	if (class148 == null)
	    return null;
	return ((Class148) class148).aClass104_Sub2_Sub3_1123;
    }
    
    static final String method1327(int argument) {
	if (Node_Sub31_Sub39.aBoolean6055
	    || Class84.aClass59_Sub51_Sub9_601 == null)
	    return "";
	if (((((MenuAction) Class84.aClass59_Sub51_Sub9_601)
	      .aString6276) == null
	     || ((MenuAction) Class84.aClass59_Sub51_Sub9_601)
		    .aString6276.length() == 0)
	    && (((MenuAction) Class84.aClass59_Sub51_Sub9_601)
		.aString6274) != null
	    && ((MenuAction) Class84.aClass59_Sub51_Sub9_601)
		   .aString6274.length() > 0)
	    return (((MenuAction) Class84.aClass59_Sub51_Sub9_601)
		    .aString6274);
	return (((MenuAction) Class84.aClass59_Sub51_Sub9_601)
		.aString6276);
    }
    
    final void method1328(Class388 argument_31_, int argument_32_) {
	if (((ClanChannel) this).aClass388Array4354 == null
	    || (((ClanChannel) this).anInt4350
		>= ((ClanChannel) this).aClass388Array4354.length))
	    method1322(((ClanChannel) this).anInt4350 + 5, false);
	((ClanChannel) this).aClass388Array4354
	    [((ClanChannel) this).anInt4350++]
	    = argument_31_;
	anIntArray4351 = null;
    }
    
    ClanChannel(Packet argument_33_) {
	aBoolean4356 = true;
	method1323(argument_33_, (byte) 125);
    }
}
