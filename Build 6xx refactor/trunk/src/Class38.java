/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38
{
    private int anInt275;
    int anInt276;
    int anInt277;
    Class38 aClass38_278;
    int anInt279;
    int anInt280;
    int anInt281;
    int anInt282;
    int anInt283;
    int anInt284;
    static Class217 aClass217_285 = new Class217(4, 1, 1, 1);
    int anInt286;
    byte aByte287;
    int anInt288;
    int anInt289;
    int anInt290;
    
    final Class38 method391(int argument_0_, int argument_1_, int argument_2_,
			    int argument_3_) {
	return new Class38(anInt275, argument_2_, argument_3_, argument_0_,
			   ((Class38) this).aByte287);
    }
    
    static final boolean method392(int argument, int argument_4_,
				   int argument_5_) {
	if ((argument & 0x22) == 0)
	    return false;
	return true;
    }
    
    final Class224 method393(boolean argument_6_) {
	return Statics.method182(anInt275, false);
    }
    
    static final Class84_Sub1 method394(int argument) {
	if (Statics.anInt5560 < Class384.aClass84_Sub1Array3251.length)
	    return Class384.aClass84_Sub1Array3251[Statics.anInt5560++];
	return null;
    }
    
    static final void method395(int argument, boolean argument_7_,
				int argument_8_) {
	Node_Sub5 class59_sub5
	    = Class365.method3969((byte) -126, argument, argument_7_);
	if (class59_sub5 != null)
	    class59_sub5.unlink();
    }
    
    public static void method396(boolean argument) {
	aClass217_285 = null;
    }
    
    static final void method397(int argument, boolean argument_9_,
				byte argument_10_) {
	ClanChannel class59_sub53
	    = (!argument_9_ ? GameEnum.aClass59_Sub53_825
	       : AbstractFont.aClass59_Sub53_420);
	if (class59_sub53 != null && argument >= 0
	    && argument < ((ClanChannel) class59_sub53).anInt4350) {
	    Class388 class388
		= ((ClanChannel) class59_sub53).aClass388Array4354[argument];
	    if (((Class388) class388).aByte3274 == -1) {
		String string = ((Class388) class388).aString3272;
		Node_Sub29 class59_sub29
		    = Class91.method1683((byte) 90,
					 Node_Sub31_Sub16.aClass372_5910,
					 Class350_Sub2.aClass207_5450);
		((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		    .p1
                    (3 + JagexStringUtils.strlenp1(string, (byte) 105));
		((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		    .p1(argument_9_ ? 1 : 0);
		((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		    .p2(argument);
		((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		    .pjstr(string);
		Class251.method3243(class59_sub29, true);
	    }
	}
    }
    
    static final void method398(boolean argument, byte argument_11_) {
	DoublyLinkedNodeP2_Sub4_Sub1.aClass350_6437
	    .method3838(Statics.aGraphicsToolkit5822.method2096());
	int[] anLocalInts = Statics.aGraphicsToolkit5822.Y();
	Node_Sub7.anInt3909 = anLocalInts[0];
	Class62_Sub16.anInt4417 = anLocalInts[2];
	Class47.anInt331 = anLocalInts[3];
	Statics.anInt6456 = anLocalInts[1];
	if (argument) {
	    Statics.aGraphicsToolkit5822.DA(Statics.anInt5032,
						Node_Sub47.anInt4288,
						Class353_Sub9.anInt5522,
						Class_aa_Sub2.anInt3753);
	    Node_Sub30.method861((byte) -103, Class245.aDouble1780);
	} else {
	    Statics.aGraphicsToolkit5822.DA(Node_Sub52.anInt4348,
						Node_Sub31_Sub4.anInt5851,
						Node_Sub36.anInt4164,
						Class284.anInt2279);
	    Node_Sub30.method861((byte) -82, Class87.aDouble3559);
	}
    }
    
    Class38(int argument_12_, int argument_13_, int argument_14_,
	    int argument_15_, byte argument_16_) {
	((Class38) this).anInt284 = argument_14_;
	((Class38) this).anInt281 = argument_15_;
	((Class38) this).aByte287 = argument_16_;
	((Class38) this).anInt286 = argument_13_;
	anInt275 = argument_12_;
    }
}
