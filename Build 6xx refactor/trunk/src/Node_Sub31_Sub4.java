/* Class59_Sub31_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub4 extends Node_Sub31
{
    static int anInt5851;
    static int anInt5852 = 0;
    private int anInt5853 = 4096;
    static float aFloat5854;
    static int anInt5855;
    static Js5Store aJs5Store_5856;
    
    static final void method886(int argument) {
	for (int anLocalInt = 0; anLocalInt < 100; anLocalInt++)
	    Class62_Sub1.aClass77Array4363[anLocalInt] = null;
	Class118.anInt967 = 0;
    }
    
    final int[] method867(byte argument_0_, int argument_1_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_1_,
							      -13476);
	if (argument_0_ < 21)
	    anInt5851 = -112;
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758)
	    JagStrings.memset(anLocalInts, 0, Statics.anInt294, anInt5853);
	return anLocalInts;
    }
    
    static final Class125 method887(byte argument, int argument_2_) {
	Class125 class125
	    = ((Class125)
	       Class256_Sub4.aClass149_5633.get((long) argument_2_));
	if (class125 != null)
	    return class125;
	if (argument != 113)
	    return null;
	byte[] anLocalInts
	    = Statics.aJs5Store_4151.getData(0, argument_2_);
	class125 = new Class125();
	if (anLocalInts != null)
	    class125.method2402(argument - 107, new Packet(anLocalInts),
				argument_2_);
	Class256_Sub4.aClass149_5633.put(class125, (long) argument_2_);
	return class125;
    }
    
    public static void method888(int argument) {
	aJs5Store_5856 = null;
    }
    
    static final void method889(String argument, boolean argument_3_,
				int argument_4_, String argument_5_,
				int argument_6_, boolean argument_7_,
				int argument_8_) {
	((Js5Store) tia_sub_35_Sub2DoublyLinked.aJs5Store_6667).discardUnpacked = 1;
	argument_5_ = argument_5_.toLowerCase();
	short[] anLocalInts = new short[16];
	int anLocalInt = -1;
	String string = null;
	if (argument_6_ != -1) {
	    Class315 class315
		= Class62_Sub27.aClass362_4457.method3960(true, argument_6_);
	    if (class315 == null || !argument_7_ != !class315.method3631(0))
		return;
	    if (!class315.method3631(argument_4_))
		anLocalInt = ((Class315) class315).anInt2607;
	    else
		string = ((Class315) class315).aString2606;
	}
	int anLocalInt_9_ = 0;
	for (int anLocalInt_10_ = 0;
	     (anLocalInt_10_
	      < ((Class365) Class253_Sub1_Sub1.aClass365_6632).anInt3071);
	     anLocalInt_10_++) {
	    Class371 class371
		= Class253_Sub1_Sub1.aClass365_6632.method3975(-13,
							       anLocalInt_10_);
	    if ((!argument_3_ || ((Class371) class371).aBoolean3176)
		&& ((Class371) class371).anInt3138 == -1
		&& ((Class371) class371).anInt3151 == -1
		&& ((Class371) class371).anInt3157 == -1
		&& ((Class371) class371).anInt3182 == 0
		&& ((Class371) class371).aString3160.toLowerCase()
		       .indexOf(argument_5_) != -1) {
		if (argument_6_ != -1) {
		    if (!argument_7_) {
			if (class371.method4053(anLocalInt, argument_6_, -1)
			    != argument_8_)
			    continue;
		    } else if (!argument.equals
				(class371.method4052(argument_6_, string,
						     (byte) -83)))
			continue;
		}
		if (anLocalInt_9_ >= 250) {
		    Class62_Sub26.anInt4447 = -1;
		    Node_Sub47_Sub6.aShortArray6178 = null;
		    return;
		}
		if (anLocalInt_9_ >= anLocalInts.length) {
		    short[] anLocalInts_11_
			= new short[anLocalInts.length * 2];
		    for (int anLocalInt_12_ = 0;
			 anLocalInt_12_ < anLocalInt_9_; anLocalInt_12_++)
			anLocalInts_11_[anLocalInt_12_]
			    = anLocalInts[anLocalInt_12_];
		    anLocalInts = anLocalInts_11_;
		}
		anLocalInts[anLocalInt_9_++] = (short) anLocalInt_10_;
	    }
	}
	Node_Sub47_Sub6.aShortArray6178 = anLocalInts;
	Class62_Sub26.anInt4447 = anLocalInt_9_;
	Class276.anInt2218 = argument_4_;
	String[] strings = new String[Class62_Sub26.anInt4447];
	for (int anLocalInt_13_ = 0; Class62_Sub26.anInt4447 > anLocalInt_13_;
	     anLocalInt_13_++)
	    strings[anLocalInt_13_]
		= (((Class371)
		    Class253_Sub1_Sub1.aClass365_6632
			.method3975(127, anLocalInts[anLocalInt_13_]))
		   .aString3160);
	Statics.method2489(strings, 69, Node_Sub47_Sub6.aShortArray6178);
	tia_sub_35_Sub2DoublyLinked.aJs5Store_6667.forceClearSubFileBuffer();
	((Js5Store) tia_sub_35_Sub2DoublyLinked.aJs5Store_6667).discardUnpacked = 2;
    }
    
    Node_Sub31_Sub4(int argument_14_) {
	super(0, true);
	anInt5853 = argument_14_;
    }
    
    static final void method890(String argument, byte argument_15_) {
	if (Node_Sub13.aClass176Array3956 != null) {
	    Node_Sub29 class59_sub29
		= Class91.method1683((byte) 106,
				     Node_Sub31_Sub16.aClass372_5910,
				     Class15.aClass207_115);
	    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129.p1
                (
                        JagexStringUtils.strlenp1(argument, (byte) 79));
	    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		.pjstr(argument);
	    Class251.method3243(class59_sub29, true);
	    if (argument_15_ != 112)
		aJs5Store_5856 = null;
	}
    }
    
    final void method868(Packet argument_16_, int argument_17_,
			 byte argument_18_) {
	if (argument_18_ >= -41)
	    anInt5855 = -29;
	int anLocalInt = argument_17_;
	if (anLocalInt == 0)
	    anInt5853 = (argument_16_.g1() << 12) / 255;
    }
    
    public Node_Sub31_Sub4() {
	this(4096);
    }
}
