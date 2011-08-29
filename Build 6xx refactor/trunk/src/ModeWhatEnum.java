/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ModeWhatEnum
{
    static ModeWhatEnum LIVE = new ModeWhatEnum("LIVE", 0);
    static ModeWhatEnum RC = new ModeWhatEnum("RC", 1);
    static ModeWhatEnum WIP;
    int id;
    static int anInt2310 = -1;
    private String name;

    static final ModeWhatEnum forId(int argument_4_) {
	ModeWhatEnum[] modeWhatEnums = Statics.method1104(false);
	for (int anLocalInt = 0; modeWhatEnums.length > anLocalInt; anLocalInt++) {
	    ModeWhatEnum modeWhatEnum = modeWhatEnums[anLocalInt];
	    if (argument_4_ == ((ModeWhatEnum) modeWhatEnum).id)
		return modeWhatEnum;
	}
	return null;
    }

    public final String toString() {
        return name;
    }
    
    static final void method3481
	(int argument, int argument_0_, int argument_1_, GraphicsToolkit argument_2_,
	 int argument_3_, int argument_4_, int argument_5_, int argument_6_) {
	Statics.aGraphicsToolkit5822 = argument_2_;
	Statics.aClass350_1255
	    = Statics.aGraphicsToolkit5822.method2029();
	Node_Sub31_Sub18.aClass350_5922
	    = Statics.aGraphicsToolkit5822.method2029();
	DoublyLinkedNodeP2_Sub4_Sub1.aClass350_6437
	    = Statics.aGraphicsToolkit5822.method2029();
	Class50.anInt365 = 1;
	Node_Sub45.anInt4264 = 0;
	Class2_Sub2.anInt3768 = 0;
	Node_Sub31_Sub2.anInt5844 = argument_0_;
	Class154.anInt3615 = argument_6_;
	Class5.anInt67 = argument_4_;
	Node_Sub31_Sub16.anInterface15_5912 = null;
	Class4.anInt60 = argument_1_;
	Class9.method244(argument, (byte) 115, argument_5_);
    }
    
    static final boolean method3482(int argument, int argument_7_,
				    int argument_8_) {
	boolean anLocalBoolean
	    = ((argument & 0x37) != 0
	       ? Class256_Sub3.method3291(argument, (byte) -113, argument_8_)
	       : Class245_Sub2.method3191(argument_8_, argument, (byte) -49));
	return ((argument_8_ & 0x10000) != 0
		| DoublyLinkedNode_Sub51_Sub8.method1232((byte) -110, argument_8_, argument)
		| anLocalBoolean);
    }
    
    final int getId() {
	return ((ModeWhatEnum) this).id;
    }
    
    ModeWhatEnum(String argument_10_, int argument_11_) {
	((ModeWhatEnum) this).id = argument_11_;
        name = argument_10_;
    }
}
