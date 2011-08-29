/* Class314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

final class Class314
{
    Class366 aClass366_2600 = new Class366();
    static int[] anIntArray2601 = new int[1];
    static Js5Store aJs5Store_2603;
    boolean aBoolean2604 = false;
    
    final void method3625(DoublyLinkedNodeP2_Sub10 argument_0_, int argument_1_) {
	DoublyLinkedNodeP2_Sub2 class104_sub2
	    = ((DoublyLinkedNodeP2_Sub10) argument_0_).aClass104_Sub2_4596;
	boolean anLocalBoolean = true;
	DoublyLinkedNodeP2_Sub9[] class104_sub9s
	    = ((DoublyLinkedNodeP2_Sub10) argument_0_).aClass104_Sub9Array4595;
	if (argument_1_ != -15621)
	    method3625(null, 97);
	for (int anLocalInt = 0; class104_sub9s.length > anLocalInt;
	     anLocalInt++) {
	    if (((DoublyLinkedNodeP2_Sub9) class104_sub9s[anLocalInt]).aBoolean4591) {
		anLocalBoolean = false;
		break;
	    }
	}
	if (!anLocalBoolean) {
	    if (((Class314) this).aBoolean2604) {
		for (DoublyLinkedNodeP2_Sub10 class104_sub10
			 = ((DoublyLinkedNodeP2_Sub10)
			    ((Class314) this).aClass366_2600
				.method3986(argument_1_ ^ ~0x3d04));
		     class104_sub10 != null;
		     class104_sub10
			 = (DoublyLinkedNodeP2_Sub10) ((Class314) this)
						.aClass366_2600
						.method3992((byte) 91)) {
		    if (class104_sub2 == (((DoublyLinkedNodeP2_Sub10) class104_sub10)
					  .aClass104_Sub2_4596)) {
			class104_sub10.unlink();
			Class353_Sub9.method3915(class104_sub10, (byte) 120);
		    }
		}
	    }
	    for (DoublyLinkedNodeP2_Sub10 class104_sub10
		     = ((DoublyLinkedNodeP2_Sub10)
			((Class314) this).aClass366_2600.method3986(0));
		 class104_sub10 != null;
		 class104_sub10
		     = (DoublyLinkedNodeP2_Sub10) ((Class314) this).aClass366_2600
					    .method3992((byte) -104)) {
		if (((DoublyLinkedNodeP2_Sub2) class104_sub2).anInt4516
		    >= ((DoublyLinkedNodeP2_Sub2) (((DoublyLinkedNodeP2_Sub10) class104_sub10)
					 .aClass104_Sub2_4596)).anInt4516) {
		    Class164.method2624(true, class104_sub10, argument_0_);
		    return;
		}
	    }
	    ((Class314) this).aClass366_2600.method3983(argument_0_,
							(byte) 119);
	}
    }
    
    static final GraphicsToolkit method3626
	(int argument, Js5Store argument_2_, TextureSource argument_3_,
	 byte argument_4_, int argument_5_, Canvas argument_6_) {
	int anLocalInt = 0;
	int anLocalInt_7_ = 0;
	if (argument_6_ != null) {
	    Dimension dimension = argument_6_.getSize();
	    anLocalInt_7_ = dimension.height;
	    anLocalInt = dimension.width;
	}
	return GraphicsToolkit.method2021(argument_5_, anLocalInt, argument_6_, (byte) 100, argument, argument_3_, anLocalInt_7_, argument_2_);
    }
    
    public static void method3627(int argument) {
	aJs5Store_2603 = null;
	anIntArray2601 = null;
    }
    
    final void method3628(int argument_8_) {
	for (;;) {
	    DoublyLinkedNodeP2_Sub10 class104_sub10
		= ((DoublyLinkedNodeP2_Sub10)
		   ((Class314) this).aClass366_2600.method3988((byte) -7));
	    if (class104_sub10 == null)
		break;
	    class104_sub10.unlink();
	    Class353_Sub9.method3915(class104_sub10, (byte) 100);
	}
    }
    
    Class314(boolean argument_9_) {
	((Class314) this).aBoolean2604 = argument_9_;
    }
}
