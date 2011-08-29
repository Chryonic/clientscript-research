/* Class133_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class133_Sub4 extends Class133
{
    private int anInt5026;
    private int anInt5027;
    static Class329 aClass329_5028 = new Class329(4, 8);
    private int anInt5029;
    static Class207 aClass207_5030 = new Class207(70, 3);
    private int anInt5031;
    
    final void method2439(int argument_0_, int argument_1_, int argument_2_) {
	int anLocalInt = argument_0_ * anInt5031 >> 12;
	int anLocalInt_3_ = argument_0_ * anInt5029 >> 12;
	int anLocalInt_4_ = anInt5027 * argument_1_ >> 12;
	int anLocalInt_5_ = argument_1_ * anInt5026 >> 12;
	Class289.method3475(((Class133) this).anInt1069, anLocalInt,
			    anLocalInt_4_, anLocalInt_5_, -128, anLocalInt_3_);
	if (argument_2_ != -7895)
	    anInt5031 = 99;
    }
    
    Class133_Sub4(int argument_6_, int argument_7_, int argument_8_,
		  int argument_9_, int argument_10_, int argument_11_,
		  int argument_12_) {
	super(argument_10_, argument_11_, argument_12_);
	anInt5027 = argument_7_;
	anInt5029 = argument_8_;
	anInt5031 = argument_6_;
	anInt5026 = argument_9_;
    }
    
    final void method2444(byte argument_13_, int argument_14_,
			  int argument_15_) {
	int anLocalInt = argument_15_ * anInt5031 >> 12;
	int anLocalInt_16_ = anInt5029 * argument_15_ >> 12;
	int anLocalInt_17_ = argument_14_ * anInt5027 >> 12;
	int anLocalInt_18_ = argument_14_ * anInt5026 >> 12;
	DoublyLinkedNodeP2_Sub2_Sub2_Sub1.method1805(anLocalInt, -113,
					   ((Class133) this).anInt1068,
					   ((Class133) this).anInt1069,
					   anLocalInt_17_, anLocalInt_18_,
					   ((Class133) this).anInt1067,
					   anLocalInt_16_);
	if (argument_13_ != 85)
	    aClass207_5030 = null;
    }
    
    final void method2441(byte argument_19_, int argument_20_,
			  int argument_21_) {
	int anLocalInt = anInt5031 * argument_21_ >> 12;
	int anLocalInt_22_ = argument_21_ * anInt5029 >> 12;
	int anLocalInt_23_ = argument_20_ * anInt5027 >> 12;
	int anLocalInt_24_ = argument_20_ * anInt5026 >> 12;
	Class133.method2440(anLocalInt_24_, ((Class133) this).anInt1067,
			    anLocalInt, anLocalInt_22_,
			    ((Class133) this).anInt1068, -127, anLocalInt_23_);
	if (argument_19_ != 101)
	    method2439(118, 17, -55);
    }
    
    public static void method2452(byte argument) {
	aClass207_5030 = null;
	aClass329_5028 = null;
    }
}
