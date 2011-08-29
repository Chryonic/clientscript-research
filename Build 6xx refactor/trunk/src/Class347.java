/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class347 implements Interface10
{
    private String aString3594;
    private Js5Store aJs5Store_3597;
    static float aFloat3598;
    
    public static void method3812(byte argument) {
	GlToolkit.glVBuffer = null;
	TestingStageEnum.INTBETA = null;
    }
    
    public final Class160 method48(int argument_0_) {
	if (argument_0_ != -12696)
	    method49((byte) -71);
	return Class160.aClass160_1171;
    }
    
    public final int method49(byte argument_1_) {
	int anLocalInt = 45 / ((6 - argument_1_) / 59);
	if (aJs5Store_3597.isLoaded(aString3594))
	    return 100;
	return aJs5Store_3597.getFileProgress(aString3594);
    }
    
    Class347(Js5Store argument_2_, String argument_3_) {
	aJs5Store_3597 = argument_2_;
	aString3594 = argument_3_;
    }
    
    static {
	new Class211("", 76);
    }
}
