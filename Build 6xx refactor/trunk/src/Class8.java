/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

final class Class8
{
    short[] aShortArray76;
    static int[] anIntArray78 = new int[4];
    int[] anIntArray79;
    short[] aShortArray80;
    static int anInt81;
    static int anInt82;
    long aLong83;
    
    static final int method236(String argument, byte argument_0_,
			       byte[] argument_1_, int argument_2_) {
	int anLocalInt = argument_2_;
	int anLocalInt_3_ = argument.length();
	for (int anLocalInt_4_ = 0; anLocalInt_3_ > anLocalInt_4_;
	     anLocalInt_4_ += 4) {
	    int anLocalInt_5_
		= AbstractFont.method493(argument.charAt(anLocalInt_4_), -1);
	    int anLocalInt_6_
		= (anLocalInt_3_ <= anLocalInt_4_ + 1 ? -1
		   : AbstractFont.method493(argument.charAt(anLocalInt_4_ + 1), -1));
	    int anLocalInt_7_
		= (anLocalInt_4_ + 2 < anLocalInt_3_
		   ? AbstractFont.method493(argument.charAt(anLocalInt_4_ + 2), -1)
		   : -1);
	    int anLocalInt_8_
		= (anLocalInt_4_ + 3 < anLocalInt_3_
		   ? AbstractFont.method493(argument.charAt(anLocalInt_4_ + 3), -1)
		   : -1);
	    argument_1_[argument_2_++]
		= (byte) MathStatics.OR(anLocalInt_5_ << 2, anLocalInt_6_ >>> 4);
	    if (anLocalInt_7_ == -1)
		break;
	    argument_1_[argument_2_++]
		= (byte) (MathStatics.OR(anLocalInt_7_ >>> 2, MathStatics.AND(anLocalInt_6_ << 4, 240)));
	    if (anLocalInt_8_ == -1)
		break;
	    argument_1_[argument_2_++]
		= (byte) (MathStatics.OR(anLocalInt_8_, MathStatics.AND(anLocalInt_7_, 3) << 6));
	}
	return -anLocalInt + argument_2_;
    }
    
    public static void method237(int argument) {
	anIntArray78 = null;
	client.loadingBarFillColour = null;
    }
    
    static final void method238(int argument) {
	for (int anLocalInt = 0;
	     Class303.tileSettings.length > anLocalInt;
	     anLocalInt++) {
	    for (int anLocalInt_9_ = 0;
		 Class303.tileSettings[0].length > anLocalInt_9_;
		 anLocalInt_9_++) {
		for (int anLocalInt_10_ = 0;
		     (Class303.tileSettings[0][0].length
		      > anLocalInt_10_);
		     anLocalInt_10_++)
		    Class303.tileSettings[anLocalInt]
			[anLocalInt_9_][anLocalInt_10_]
			= (byte) 0;
	    }
	}
    }
    
    Class8(long argument_11_, int[] argument_12_, short[] argument_13_,
	   short[] argument_14_) {
	((Class8) this).aShortArray80 = argument_14_;
	((Class8) this).aLong83 = argument_11_;
	((Class8) this).aShortArray76 = argument_13_;
	((Class8) this).anIntArray79 = argument_12_;
    }
    
    protected Class8() {
	/* empty */
    }
    
    static {
	client.loadingBarFillColour = new Color[] { new Color(9179409), new Color(3289650),
				      new Color(3289650), new Color(3289650) };
	anInt82 = -1;
    }
}
