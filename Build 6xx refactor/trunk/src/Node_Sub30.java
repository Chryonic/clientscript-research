/* Class59_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub30 extends Node
{
    static Class217 aClass217_4132 = new Class217(1, 2, 2, 0);
    String aString4133;
    static Js5Store aJs5Store_4134;
    
    public static void method859(byte argument) {
	aJs5Store_4134 = null;
	aClass217_4132 = null;
    }
    
    static final void method860(int argument, String argument_0_,
				boolean argument_1_, int argument_2_) {
	MultilanguageString.method3778(argument ^ ~0x6f);
	Class62_Sub6.method1376((byte) -126);
	Statics.method2756(argument ^ argument);
	Class367.method3998(argument_0_, argument_2_, argument_1_);
	Node_Sub31_Sub34.method986(18);
	Class42.method424((byte) 122, Class389.aGraphicsToolkit3281);
	Node_Sub31_Sub1.method882(-1719661332, Class389.aGraphicsToolkit3281);
	Statics.method3000(Class389.aGraphicsToolkit3281, Class205.aJs5Store_1472, argument ^ 0x7c);
	Statics.method457((byte) 95);
	Node_Sub29.method857(Class33.aClass368Array222, 1);
	Class305.method3596(0);
	Class353_Sub2.method3896(false);
	if (Statics.anInt1652 == 3)
	    Class316.method3638(4, 2);
	else if (Statics.anInt1652 != 7) {
	    if (Statics.anInt1652 == 10)
		Class316.method3638(11, 2);
	    else if (Statics.anInt1652 == 1 || Statics.anInt1652 == 2)
		DoublyLinkedNodeP2_Sub2_Sub4.method1880(0);
	} else
	    Class316.method3638(8, 2);
    }
    
    static final void method861(byte argument, double argument_3_) {
	Node_Sub31_Sub18.aClass350_5922.method3838(Statics.aClass350_1255);
	Node_Sub31_Sub18.aClass350_5922.method3835(0, 0, (int) argument_3_);
	Statics.aGraphicsToolkit5822
	    .method2069(Node_Sub31_Sub18.aClass350_5922);
    }
    
    static final void method862(int argument, int argument_4_, int argument_5_,
				byte[] argument_6_, int argument_7_,
				int argument_8_, int argument_9_,
				byte[] argument_10_, int argument_11_) {
	int anLocalInt = -(argument_5_ >> 2);
	argument_5_ = -(argument_5_ & 0x3);
	for (int anLocalInt_12_ = -argument_9_; anLocalInt_12_ < 0;
	     anLocalInt_12_++) {
	    for (int anLocalInt_13_ = anLocalInt; anLocalInt_13_ < 0;
		 anLocalInt_13_++) {
		argument_6_[argument++] += argument_10_[argument_7_++];
		argument_6_[argument++] += argument_10_[argument_7_++];
		argument_6_[argument++] += argument_10_[argument_7_++];
		argument_6_[argument++] += argument_10_[argument_7_++];
	    }
	    for (int anLocalInt_14_ = argument_5_; anLocalInt_14_ < 0;
		 anLocalInt_14_++)
		argument_6_[argument++] += argument_10_[argument_7_++];
	    argument += argument_8_;
	    argument_7_ += argument_4_;
	}
    }
    
    static final boolean method863(int argument, int argument_15_,
				   boolean argument_16_) {
	return false;
    }
    
    public Node_Sub30() {
	/* empty */
    }
    
    Node_Sub30(String argument_17_, int argument_18_) {
	((Node_Sub30) this).aString4133 = argument_17_;
    }
}
