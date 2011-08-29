/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class131
{
    static Class207 aClass207_1057 = new Class207(15, 1);
    static int anInt1058;
    static Class169[] aClass169Array1059 = new Class169[50];
    static int anInt1060;
    static RsInterface aRsInterface_1061;
    static Class349 aClass349_1062;
    
    static final void method2435(GraphicsToolkit argument, int argument_0_) {
	int anLocalInt = 0;
	int anLocalInt_1_ = 0;
	if (Class52.aBoolean391) {
	    anLocalInt = Node_Sub52.method1319(99);
	    anLocalInt_1_ = Class82.method1596(-2);
	}
	argument.setClip(anLocalInt, anLocalInt_1_ + 350, Applet_Sub1.canvasWidth + anLocalInt, anLocalInt_1_);
	argument.fillRect(anLocalInt, anLocalInt_1_, Applet_Sub1.canvasWidth, 350, Class88.anInt644 << 24 | 0x332277, 1);
	Canvas_Sub1.method125(anLocalInt + Applet_Sub1.canvasWidth,
			      (byte) -102, anLocalInt_1_ + 350, anLocalInt_1_,
			      anLocalInt);
	int anLocalInt_2_ = 350 / Class340.anInt2868;
	if (Node_Sub38.anInt4174 > 0) {
	    int anLocalInt_3_ = -Class340.anInt2868 - 4 + 346;
	    int anLocalInt_4_
		= (anLocalInt_2_ * anLocalInt_3_
		   / (Node_Sub38.anInt4174 + anLocalInt_2_ - 1));
	    int anLocalInt_5_ = 4;
	    if (Node_Sub38.anInt4174 > 1)
		anLocalInt_5_
		    += ((Node_Sub38.anInt4174 - Statics.anInt1986 - 1)
			* (-anLocalInt_4_ + anLocalInt_3_)
			/ (Node_Sub38.anInt4174 - 1));
	    argument.fillRect(Applet_Sub1.canvasWidth + (anLocalInt - 16), anLocalInt_1_ + anLocalInt_5_, 12, anLocalInt_4_, Class88.anInt644 << 24 | 0x332277, 2);
	    for (int anLocalInt_6_ = Statics.anInt1986;
		 (anLocalInt_6_ < Statics.anInt1986 + anLocalInt_2_
		  && Node_Sub38.anInt4174 > anLocalInt_6_);
		 anLocalInt_6_++) {
		String[] strings
		    = JagexStringUtils.split((Class342.aStringArray2885[anLocalInt_6_]), 0, '\010');
		int anLocalInt_7_
		    = (Applet_Sub1.canvasWidth - 16 - 8) / strings.length;
		for (int anLocalInt_8_ = 0; anLocalInt_8_ < strings.length;
		     anLocalInt_8_++) {
		    int anLocalInt_9_ = anLocalInt_7_ * anLocalInt_8_ + 8;
		    argument.setClip(anLocalInt + anLocalInt_9_, anLocalInt_1_ + 350, (anLocalInt_7_ + (anLocalInt + anLocalInt_9_) - 8), anLocalInt_1_);
		    Node_Sub47_Sub9.aAbstractFont_6203.method507
			((byte) 56,
			 (-Class99.anInt777 + anLocalInt_1_ + 350 - 2
			  - (((Class76) Statics.aClass76_3433).anInt518
			     + ((-Statics.anInt1986 + anLocalInt_6_)
				* Class340.anInt2868))),
			 -16777216,
			 Class178.method2796(0, strings[anLocalInt_8_]), -1,
			 anLocalInt_9_ + anLocalInt);
		}
	    }
	}
	Class226.aAbstractFont_1641.method492(-1, "Build: 649", -16777216,
					 (anLocalInt + Applet_Sub1.canvasWidth
					  - 25),
					 anLocalInt_1_ - 20 + 350, -1);
	argument.setClip(anLocalInt, anLocalInt_1_ + 350, Applet_Sub1.canvasWidth + anLocalInt, anLocalInt_1_);
	argument.method2061(anLocalInt_1_ + (350 - Class99.anInt777),
			    anLocalInt, -1, Applet_Sub1.canvasWidth,
			    (byte) -89);
	Class173.aAbstractFont_1286.method507
	    ((byte) 56,
	     (anLocalInt_1_ + 350 - 1
	      - ((Class76) Class37.aClass76_274).anInt518),
	     -16777216, "--> " + Class178.method2796(0, Class85.aString605),
	     -1, anLocalInt + 10);
	if (Node_Sub31_Sub31.aBoolean5990) {
	    int anLocalInt_10_ = -1;
	    if (Class333.anInt2720 % 30 > 15)
		anLocalInt_10_ = 16777215;
	    argument.method2050(12, -92,
				(anLocalInt + 10
				 + (Class37.aClass76_274.method1552
				    (("--> "
				      + Class178.method2796
					    (0, Class85.aString605)
					    .substring(0, Class205.anInt1471)),
				     0))),
				(anLocalInt_1_ - 11
				 - (((Class76) Class37.aClass76_274).anInt518
				    - 350)),
				anLocalInt_10_);
	}
    }
    
    public static void method2436(boolean argument) {
	aClass349_1062 = null;
	aRsInterface_1061 = null;
	aClass169Array1059 = null;
	aClass207_1057 = null;
    }
    
    static {
	anInt1058 = 0;
	aRsInterface_1061 = null;
	anInt1060 = 0;
	aClass349_1062 = new Class349();
    }
}
