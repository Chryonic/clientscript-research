/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class42 implements Interface8
{
    private GraphicsToolkit aGraphicsToolkit3535;
    static Class368[] aClass368Array3536;
    static Js5Store aJs5Store_3537;
    private boolean aBoolean3538;
    private Interface14[] anInterface14Array3539;
    static int[] anIntArray3540 = { 32, 39, 44, 47 };
    private Class158 aClass158_3541;
    static int anInt3542;
    static short[][] aShortArrayArray3543;
    
    static final boolean method422(byte argument) {
	if (Applet_Sub1.useJavaScript) {
	    try {
		if (((Boolean)
		     Class328.method3698(Signlink.mainapp, "showingVideoAd",
					 (byte) 115))
			.booleanValue())
		    return false;
		return true;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	return true;
    }
    
    public final int method38(int argument_0_) {
	int anLocalInt = 0;
	if (argument_0_ != -31784)
	    anIntArray3540 = null;
	Interface14[] interface14s = anInterface14Array3539;
	for (int anLocalInt_1_ = 0; anLocalInt_1_ < interface14s.length;
	     anLocalInt_1_++) {
	    Interface14 interface14 = interface14s[anLocalInt_1_];
	    if (interface14 == null || interface14.method58(20662))
		anLocalInt++;
	}
	return anLocalInt * 100 / anInterface14Array3539.length;
    }
    
    public final void method40(boolean argument_2_, boolean argument_3_) {
	argument_3_ = argument_2_;
	Interface14[] interface14s = anInterface14Array3539;
	for (int anLocalInt = 0; interface14s.length > anLocalInt;
	     anLocalInt++) {
	    Interface14 interface14 = interface14s[anLocalInt];
	    if (interface14 != null)
		interface14.method59(-112, argument_3_ || aBoolean3538);
	}
	aBoolean3538 = false;
    }
    
    static final Node_Sub31 method423(int argument,
					 Packet argument_4_) {
	argument_4_.g1();
	int anLocalInt = argument_4_.g1();
	Node_Sub31 class59_sub31
	    = DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.method1841(argument ^ 0x1b,
						      anLocalInt);
	((Node_Sub31) class59_sub31).anInt4139
	    = argument_4_.g1();
	int anLocalInt_5_ = argument_4_.g1();
	for (int anLocalInt_6_ = argument; anLocalInt_6_ < anLocalInt_5_;
	     anLocalInt_6_++) {
	    int anLocalInt_7_ = argument_4_.g1();
	    class59_sub31.method868(argument_4_, anLocalInt_7_, (byte) -107);
	}
	class59_sub31.method865(true);
	return class59_sub31;
    }
    
    public final void method39(boolean argument_8_) {
	if (aGraphicsToolkit3535 != Class389.aGraphicsToolkit3281) {
	    aBoolean3538 = true;
	    aGraphicsToolkit3535 = Class389.aGraphicsToolkit3281;
	}
	if (argument_8_ != true)
	    aJs5Store_3537 = null;
	aGraphicsToolkit3535.clear(0);
	Interface14[] interface14s = anInterface14Array3539;
	for (int anLocalInt = 0; anLocalInt < interface14s.length;
	     anLocalInt++) {
	    Interface14 interface14 = interface14s[anLocalInt];
	    if (interface14 != null)
		interface14.method57(112);
	}
    }
    
    static final void method424(byte argument, GraphicsToolkit argument_9_) {
	Node_Sub35.aClass363Array4160
	    = new Class363[Class298.anIntArray2476.length];
	for (int anLocalInt = 0; Class298.anIntArray2476.length > anLocalInt;
	     anLocalInt++) {
	    int anLocalInt_10_ = Class298.anIntArray2476[anLocalInt];
	    Class76 class76 = Class359.method3944(Node_Sub33.aJs5Store_4149,
						  -5707, anLocalInt_10_);
	    AbstractFont abstractFont
		= argument_9_.method2083(class76,
					 Class83.method1605((Statics
							     .aJs5Store_5741),
							    anLocalInt_10_),
					 true);
	    Node_Sub35.aClass363Array4160[anLocalInt]
		= new Class363(abstractFont, class76);
	}
    }
    
    public static void method425(int argument) {
	aJs5Store_3537 = null;
	aShortArrayArray3543 = null;
	aClass368Array3536 = null;
	anIntArray3540 = null;
    }
    
    public final int method35(int argument_11_) {
	if (argument_11_ != -4076)
	    method422((byte) 93);
	return ((Class158) aClass158_3541).anInt1167;
    }
    
    public final boolean method37(int argument_12_, long argument_13_) {
	if (argument_12_ != -18419)
	    aBoolean3538 = true;
	if (Applet_Sub1.getGameTime()
	    < argument_13_ + (long) ((Class158) aClass158_3541).anInt1165)
	    return false;
	return true;
    }
    
    public final void method36(boolean argument_14_) {
	if (argument_14_ != true)
	    method37(1, 82L);
    }
    
    Class42(Class158 argument_15_, Class145 argument_16_) {
	aClass158_3541 = argument_15_;
	anInterface14Array3539
	    = (new Interface14
	       [((Class158) aClass158_3541).anInterface18Array1168.length]);
	for (int anLocalInt = 0; anLocalInt < anInterface14Array3539.length;
	     anLocalInt++)
	    anInterface14Array3539[anLocalInt]
		= argument_16_.method2516((((Class158) aClass158_3541)
					   .anInterface18Array1168
					   [anLocalInt]));
    }
}
