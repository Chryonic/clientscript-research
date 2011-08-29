/* Class267 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class267 implements Interface10
{
    private String name;
    private boolean aBoolean3589;

    final boolean method3354() {
	    return aBoolean3589;
    }

    public final int method49(byte argument_5_) {
	int anLocalInt_6_ = Class101.method1748(false, name);
	if (anLocalInt_6_ >= 0 && anLocalInt_6_ <= 100)
	    return anLocalInt_6_;
	aBoolean3589 = true;
	return 100;
    }

    Class267(String argument_21_) {
	    name = argument_21_;
    }
    
    public final Class160 method48(int argument_22_) {
        return Class160.aClass160_1172;
    }
}
