/* Class59_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;

abstract class Rs2DPainter extends Node
{
    int height;
    int[] myPixels;
    int width;
    static Class149 aClass149_4048 = new Class149(4);
    static Class207 aClass207_4049 = new Class207(46, 7);

    static Rs2DPainter create(int w, int h, Canvas canvas) {
        try {
            Class var_class = Class.forName("Simple2DPainter");
            Rs2DPainter painter = (Rs2DPainter) var_class.newInstance();
            painter.setup(canvas, w, h);
            return painter;
        } catch (Throwable throwable) {
            Dynamic2dPainter painter = new Dynamic2dPainter();
            painter.setup(canvas, w, h);
            return painter;
        }
    }

    abstract void setup(Canvas argument_1_, int argument_2_, int argument_3_);
    
    public static void method735(byte argument) {
	aClass207_4049 = null;
	aClass149_4048 = null;
    }
    
    abstract void draw(int x, int y, int w, int h, int xMargin, int yMargin, Graphics g);
    
    public Rs2DPainter() {
	/* empty */
    }
    
    static final void method737(int argument, int argument_12_,
				int argument_13_, int argument_14_,
				int argument_15_, int argument_16_,
				int argument_17_, int argument_18_) {
	int anLocalInt = 0;
	int anLocalInt_19_ = argument_18_;
	int anLocalInt_20_ = 0;
	int anLocalInt_21_ = argument_17_ - argument_16_;
	int anLocalInt_22_ = -argument_16_ + argument_18_;
	int anLocalInt_23_ = argument_17_ * argument_17_;
	int anLocalInt_24_ = argument_18_ * argument_18_;
	int anLocalInt_25_ = anLocalInt_21_ * anLocalInt_21_;
	int anLocalInt_26_ = anLocalInt_22_ * anLocalInt_22_;
	int anLocalInt_27_ = anLocalInt_24_ << 1;
	int anLocalInt_28_ = anLocalInt_23_ << 1;
	int anLocalInt_29_ = anLocalInt_26_ << 1;
	int anLocalInt_30_ = anLocalInt_25_ << 1;
	int anLocalInt_31_ = argument_18_ << 1;
	int anLocalInt_32_ = anLocalInt_22_ << 1;
	int anLocalInt_33_
	    = anLocalInt_23_ * (-anLocalInt_31_ + 1) + anLocalInt_27_;
	int anLocalInt_34_
	    = anLocalInt_24_ - (anLocalInt_31_ - 1) * anLocalInt_28_;
	int anLocalInt_35_
	    = anLocalInt_25_ * (-anLocalInt_32_ + 1) + anLocalInt_29_;
	int anLocalInt_36_
	    = anLocalInt_26_ - (anLocalInt_32_ - 1) * anLocalInt_30_;
	int anLocalInt_37_ = anLocalInt_23_ << 2;
	int anLocalInt_38_ = anLocalInt_24_ << 2;
	int anLocalInt_39_ = anLocalInt_25_ << 2;
	int anLocalInt_40_ = anLocalInt_26_ << 2;
	int anLocalInt_41_ = argument_12_ * anLocalInt_27_;
	int anLocalInt_42_ = anLocalInt_28_ * (anLocalInt_31_ - 3);
	int anLocalInt_43_ = anLocalInt_29_ * 3;
	int anLocalInt_44_ = (anLocalInt_32_ - 3) * anLocalInt_30_;
	int anLocalInt_45_ = anLocalInt_38_;
	int anLocalInt_46_ = anLocalInt_37_ * (argument_18_ - 1);
	int anLocalInt_47_ = anLocalInt_40_;
	int anLocalInt_48_ = anLocalInt_39_ * (anLocalInt_22_ - 1);
	int[] anLocalInts = Class223.anIntArrayArray1562[argument];
	Statics.method3364(anLocalInts, (byte) 96, argument_14_ - argument_17_, -anLocalInt_21_ + argument_14_, argument_15_);
	Statics.method3364(anLocalInts, (byte) -106, argument_14_ - anLocalInt_21_, anLocalInt_21_ + argument_14_, argument_13_);
	Statics.method3364(anLocalInts, (byte) -74, argument_14_ + anLocalInt_21_, argument_17_ + argument_14_, argument_15_);
	while (anLocalInt_19_ > 0) {
	    boolean anLocalBoolean = anLocalInt_22_ >= anLocalInt_19_;
	    if (anLocalInt_33_ < 0) {
		while (anLocalInt_33_ < 0) {
		    anLocalInt_34_ += anLocalInt_45_;
		    anLocalInt_33_ += anLocalInt_41_;
		    anLocalInt++;
		    anLocalInt_41_ += anLocalInt_38_;
		    anLocalInt_45_ += anLocalInt_38_;
		}
	    }
	    if (anLocalBoolean) {
		if (anLocalInt_35_ < 0) {
		    while (anLocalInt_35_ < 0) {
			anLocalInt_36_ += anLocalInt_47_;
			anLocalInt_35_ += anLocalInt_43_;
			anLocalInt_47_ += anLocalInt_40_;
			anLocalInt_43_ += anLocalInt_40_;
			anLocalInt_20_++;
		    }
		}
		if (anLocalInt_36_ < 0) {
		    anLocalInt_36_ += anLocalInt_47_;
		    anLocalInt_35_ += anLocalInt_43_;
		    anLocalInt_43_ += anLocalInt_40_;
		    anLocalInt_20_++;
		    anLocalInt_47_ += anLocalInt_40_;
		}
		anLocalInt_35_ -= anLocalInt_48_;
		anLocalInt_36_ -= anLocalInt_44_;
		anLocalInt_44_ -= anLocalInt_39_;
		anLocalInt_48_ -= anLocalInt_39_;
	    }
	    if (anLocalInt_34_ < 0) {
		anLocalInt_34_ += anLocalInt_45_;
		anLocalInt_33_ += anLocalInt_41_;
		anLocalInt++;
		anLocalInt_41_ += anLocalInt_38_;
		anLocalInt_45_ += anLocalInt_38_;
	    }
	    anLocalInt_33_ -= anLocalInt_46_;
	    anLocalInt_34_ -= anLocalInt_42_;
	    anLocalInt_19_--;
	    anLocalInt_46_ -= anLocalInt_37_;
	    anLocalInt_42_ -= anLocalInt_37_;
	    int anLocalInt_49_ = argument - anLocalInt_19_;
	    int anLocalInt_50_ = argument + anLocalInt_19_;
	    int anLocalInt_51_ = argument_14_ + anLocalInt;
	    int anLocalInt_52_ = -anLocalInt + argument_14_;
	    if (anLocalBoolean) {
		int anLocalInt_53_ = anLocalInt_20_ + argument_14_;
		int anLocalInt_54_ = -anLocalInt_20_ + argument_14_;
		Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_49_]), (byte) -35, anLocalInt_52_, anLocalInt_54_, argument_15_);
		Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_49_]), (byte) -42, anLocalInt_54_, anLocalInt_53_, argument_13_);
		Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_49_]), (byte) 101, anLocalInt_53_, anLocalInt_51_, argument_15_);
		Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_50_]), (byte) 114, anLocalInt_52_, anLocalInt_54_, argument_15_);
		Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_50_]), (byte) -101, anLocalInt_54_, anLocalInt_53_, argument_13_);
		Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_50_]), (byte) 120, anLocalInt_53_, anLocalInt_51_, argument_15_);
	    } else {
		Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_49_]), (byte) 101, anLocalInt_52_, anLocalInt_51_, argument_15_);
		Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_50_]), (byte) 99, anLocalInt_52_, anLocalInt_51_, argument_15_);
	    }
	}
    }
}
