/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

final class Canvas_Sub1 extends Canvas
{
    static Class166 aClass166_30 = new Class166(0, 4);
    private Component aComponent31;
    static Class367[] aClass367Array32 = new Class367[14];
    
    public final void update(Graphics argument_0_) {
	aComponent31.update(argument_0_);
    }
    
    public final void paint(Graphics argument_1_) {
	aComponent31.paint(argument_1_);
    }
    
    static final void method125(int argument, byte argument_2_,
				int argument_3_, int argument_4_,
				int argument_5_) {
	if (Class50.anInt365 == 1) {
	    int anLocalInt = argument_5_ / Node_Sub31_Sub2.anInt5844;
	    int anLocalInt_6_ = argument / Node_Sub31_Sub2.anInt5844;
	    int anLocalInt_7_ = argument_4_ / Class5.anInt67;
	    int anLocalInt_8_ = argument_3_ / Class5.anInt67;
	    if (Class85.anInt604 > anLocalInt && anLocalInt_6_ >= 0
		&& anLocalInt_7_ < Class24.anInt161 && anLocalInt_8_ >= 0) {
		if (anLocalInt_7_ < 0)
		    anLocalInt_7_ = 0;
		if (anLocalInt < 0)
		    anLocalInt = 0;
		if (Class85.anInt604 <= anLocalInt_6_)
		    anLocalInt_6_ = Class85.anInt604 - 1;
		if (anLocalInt_8_ >= Class24.anInt161)
		    anLocalInt_8_ = Class24.anInt161 - 1;
		for (int anLocalInt_9_ = anLocalInt_7_;
		     anLocalInt_8_ >= anLocalInt_9_; anLocalInt_9_++) {
		    int anLocalInt_10_
			= (Class243.method3155(Class24.anInt161,
					       (Node_Sub45.anInt4264
						+ anLocalInt_9_),
					       -127)
			   * Class85.anInt604);
		    for (int anLocalInt_11_ = anLocalInt;
			 anLocalInt_11_ <= anLocalInt_6_; anLocalInt_11_++) {
			int anLocalInt_12_
			    = (Class243.method3155(Class85.anInt604,
						   (Class2_Sub2.anInt3768
						    + anLocalInt_11_),
						   -128)
			       + anLocalInt_10_);
			Class5.anIntArray65[anLocalInt_12_]
			    = Class392.anInt3293;
		    }
		}
	    }
	}
    }
    
    Canvas_Sub1(Component argument_13_) {
	aComponent31 = argument_13_;
    }
    
    public static void method126(int argument) {
	aClass166_30 = null;
	aClass367Array32 = null;
    }
    
    static final RsInterface method127(int argument, RsInterface argument_14_) {
	RsInterface rsInterface = client.method121(argument_14_);
	if (rsInterface == null)
	    rsInterface = ((RsInterface) argument_14_).aRsInterface_1947;
	return rsInterface;
    }
}
