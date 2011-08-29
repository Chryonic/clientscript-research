/* Class_aa_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_aa_Sub3 extends Class_aa
{
    int[] anIntArray3755;
    static int[] anIntArray3756 = new int[25];
    int[] anIntArray3757;

    public static void method167(int argument) {
	RsInterface.aJs5Store_3759 = null;
	anIntArray3756 = null;
    }
    
    static final GlTexture_Sub4_Sub1 method168
	(int argument, GlToolkit argument_0_, int argument_1_,
	 int argument_2_, byte argument_3_) {
	if (argument_3_ != 127)
	    RsInterface.aJs5Store_3759 = null;
	if (!((GlToolkit) argument_0_).aBoolean4927
	    && (!Class2_Sub1.method198(argument_2_)
		|| !Class2_Sub1.method198(argument_1_))) {
	    if (((GlToolkit) argument_0_).haveTextureRectangle)
		return new GlTexture_Sub4_Sub1(argument_0_, 34037, argument,
					      argument_2_, argument_1_);
	    return new GlTexture_Sub4_Sub1(argument_0_, argument, argument_2_,
					  argument_1_,
					  MathStatics.method2589(argument_2_),
					  MathStatics.method2589(argument_1_));
	}
	return new GlTexture_Sub4_Sub1(argument_0_, 3553, argument, argument_2_,
				      argument_1_);
    }
    
    Class_aa_Sub3(int argument_4_, int argument_5_, int[] argument_6_,
		  int[] argument_7_) {
	((Class_aa_Sub3) this).anIntArray3755 = argument_7_;
	((Class_aa_Sub3) this).anIntArray3757 = argument_6_;
    }
}
