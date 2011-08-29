/* Class256_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class256_Sub4 extends Class256 implements Interface7_Impl1
{
    private int anInt5632;
    static Class149 aClass149_5633 = new Class149(64);
    private int anInt5634;
    private int anInt5635;

    static final void method3292(int argument, int argument_0_,
				 int argument_1_, int argument_2_) {
	Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			     [argument][argument_0_][argument_1_]);
	if (class148 != null) {
	    DoublyLinkedNodeP2_Sub2_Sub1 class104_sub2_sub1
		= ((Class148) class148).aClass104_Sub2_Sub1_1131;
	    DoublyLinkedNodeP2_Sub2_Sub1 class104_sub2_sub1_3_
		= ((Class148) class148).aClass104_Sub2_Sub1_1128;
	    if (class104_sub2_sub1 != null) {
		((DoublyLinkedNodeP2_Sub2_Sub1) class104_sub2_sub1).aShort6400
		    = (short) ((((DoublyLinkedNodeP2_Sub2_Sub1) class104_sub2_sub1)
				.aShort6400)
			       * argument_2_ / (16 << LightingManager.lightCoordRShift - 7));
		((DoublyLinkedNodeP2_Sub2_Sub1) class104_sub2_sub1).aShort6401
		    = (short) ((((DoublyLinkedNodeP2_Sub2_Sub1) class104_sub2_sub1)
				.aShort6401)
			       * argument_2_ / (16 << LightingManager.lightCoordRShift - 7));
	    }
	    if (class104_sub2_sub1_3_ != null) {
		((DoublyLinkedNodeP2_Sub2_Sub1) class104_sub2_sub1_3_).aShort6400
		    = (short) ((((DoublyLinkedNodeP2_Sub2_Sub1) class104_sub2_sub1_3_)
				.aShort6400)
			       * argument_2_ / (16 << LightingManager.lightCoordRShift - 7));
		((DoublyLinkedNodeP2_Sub2_Sub1) class104_sub2_sub1_3_).aShort6401
		    = (short) ((((DoublyLinkedNodeP2_Sub2_Sub1) class104_sub2_sub1_3_)
				.aShort6401)
			       * argument_2_ / (16 << LightingManager.lightCoordRShift - 7));
	    }
	}
    }
    
    static final int method3293(int argument) {
	return client.store33FITCRC;
    }
    
    Class256_Sub4(GraphicsToolkit_Sub2_Sub1 argument_4_, Class320 argument_5_,
		  int argument_6_, int argument_7_, int argument_8_,
		  byte[] argument_9_) {
	super(argument_4_, 32879, argument_5_, DataType.BYTE,
	      argument_8_ * argument_6_ * argument_7_, false);
	anInt5634 = argument_8_;
	anInt5635 = argument_6_;
	anInt5632 = argument_7_;
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage3Dub(((Class256) this).anInt3533, 0,
			      this.method3273(-11391), anInt5635, anInt5632,
			      anInt5634, 0,
			      Class157.method2592(98, (((Class256) this)
						       .aClass320_3534)),
			      5121, argument_9_, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public static void method3294(byte argument) {
	client.currentLoadingBar = null;
	aClass149_5633 = null;
    }
}
