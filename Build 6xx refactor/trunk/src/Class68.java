/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68 implements Interface10
{
    static int anInt3583;
    static int anInt3584 = 4;
    private Js5Store aJs5Store_3585;
    private String aString3586;
    
    public final int method49(byte argument_0_) {
	int anLocalInt = 32 % ((6 - argument_0_) / 59);
	if (aJs5Store_3585.exists(aString3586))
	    return 100;
	return 0;
    }
    
    public final Class160 method48(int argument_1_) {
	if (argument_1_ != -12696)
	    anInt3583 = 64;
	return Class160.aClass160_1170;
    }
    
    static final int method1516(int argument, int argument_2_) {
	return argument & 0x7f;
    }
    
    Class68(Js5Store argument_3_, String argument_4_) {
	aString3586 = argument_4_;
	aJs5Store_3585 = argument_3_;
    }
}
