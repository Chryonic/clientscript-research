/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class75
{
    static Class166 aClass166_512 = new Class166(131, 10);
    
    static final void method1549(int argument) {
	if (argument != 17381)
	    method1551(-115);
	do {
	    try {
		if (Statics.anInt5035 == 1) {
		    int anLocalInt = GlTexture_Sub4_Sub1
					 .aClass59_Sub9_Sub2_6546
					 .method616(33);
		    if (anLocalInt > 0
			&& GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546
			       .method602((byte) 122)) {
			anLocalInt -= DoublyLinkedNode_Sub51_Sub16.anInt6324;
			if (anLocalInt < 0)
			    anLocalInt = 0;
			GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546
			    .method590((byte) 67, anLocalInt);
			break;
		    }
		    GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546
			.method617(10293);
		    GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546
			.method591((byte) 20);
		    if (Class350_Sub1.aJs5Store_5432 != null)
			Statics.anInt5035 = 2;
		    else
			Statics.anInt5035 = 0;
		    Class2_Sub11.aClass215_3829 = null;
		    Class91.aClass59_Sub17_703 = null;
		}
		if (Statics.anInt5035 != 3)
		    break;
		int anLocalInt
		    = GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546.method616(45);
		if (anLocalInt < Class316.anInt2617
		    && GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546
			   .method602((byte) 122)) {
		    anLocalInt += Class121.anInt984;
		    if (Class316.anInt2617 < anLocalInt)
			anLocalInt = Class316.anInt2617;
		    GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546
			.method590((byte) -30, anLocalInt);
		} else {
		    Class121.anInt984 = 0;
		    Statics.anInt5035 = 0;
		}
	    } catch (Exception exception) {
		exception.printStackTrace();
		GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546
		    .method617(argument - 7088);
		Statics.anInt5035 = 0;
		Class2_Sub11.aClass215_3829 = null;
		Class91.aClass59_Sub17_703 = null;
		Class256_Sub3.aClass59_Sub9_Sub2_5631 = null;
		Class350_Sub1.aJs5Store_5432 = null;
	    }
	    break;
	} while (false);
    }
    
    abstract long method1550(byte argument_0_);
    
    public Class75() {
	/* empty */
    }
    
    public static void method1551(int argument) {
	aClass166_512 = null;
    }
}
