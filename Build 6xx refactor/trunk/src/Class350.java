/* Class350 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

abstract class Class350
{
    static Class166 aClass166_2923;
    static int[] anIntArray2924 = new int[5];
    static Rectangle[] aRectangleArray2926;
    static long[] aLongArray2927;
    static int anInt2928;
    static int anInt2930;
    
    abstract void method3824(int argument_0_);
    
    public Class350() {
	/* empty */
    }
    
    abstract void method3825(int argument_1_, int argument_2_,
			     int argument_3_);
    
    abstract Class350 method3826();
    
    static final void method3827(int argument) {
	Class62_Sub28.anInt4458++;
	Node_Sub29 class59_sub29
	    = Class91.method1683((byte) 76, Node_Sub31_Sub16.aClass372_5910,
				 Class107.aClass207_872);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p1(argument);
	Class251.method3243(class59_sub29, true);
    }
    
    abstract void method3828(int argument_4_, int argument_5_, int argument_6_,
			     int argument_7_, int argument_8_,
			     int argument_9_);
    
    abstract void method3829(int argument_10_, int argument_11_,
			     int argument_12_, int[] argument_13_);
    
    abstract void method3830(int argument_14_, int argument_15_,
			     int argument_16_, int[] argument_17_);
    
    abstract void method3831(int argument_18_, int argument_19_,
			     int argument_20_, int[] argument_21_);
    
    abstract void method3832(int[] argument_22_);
    
    abstract void method3833(int argument_23_);
    
    abstract void method3834(int argument_24_);
    
    abstract void method3835(int argument_25_, int argument_26_,
			     int argument_27_);
    
    public static void method3836(byte argument) {
	anIntArray2924 = null;
	aClass166_2923 = null;
	aRectangleArray2926 = null;
	aLongArray2927 = null;
    }
    
    abstract void method3837(int argument_28_);
    
    abstract void method3838(Class350 argument_29_);
    
    abstract void method3839(int argument_30_);
    
    abstract void method3840();
    
    abstract void method3841(int argument_31_);
    
    static {
	aClass166_2923 = new Class166(82, 6);
	Applet_Sub1.java5Plus = false;
	aRectangleArray2926 = new Rectangle[100];
	aLongArray2927 = new long[10];
	anInt2930 = 0;
	Applet_Sub1.shouldRepaint = false;
    }
}
