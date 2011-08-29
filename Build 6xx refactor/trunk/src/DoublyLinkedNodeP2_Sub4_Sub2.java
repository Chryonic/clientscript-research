/* Class104_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

final class DoublyLinkedNodeP2_Sub4_Sub2 extends DoublyLinkedNodeP2_Sub4
{
    int anInt6441 = (int) (Applet_Sub1.getGameTime() / 1000L);
    String aString6442;
    static Class166 aClass166_6443;
    short aShort6444;
    static int[][] anIntArrayArray6445 = new int[6][];
    static int[] anIntArray6446;
    
    public static void method1911(int argument) {
	anIntArray6446 = null;
	aClass166_6443 = null;
	anIntArrayArray6445 = null;
    }
    
    static final void method1912
	(int argument, int argument_0_, Rectangle[] argument_1_)
	throws Exception_Sub1 {
	if (argument == (Class50.anInt365 ^ 0xffffffff))
	    Statics.aGraphicsToolkit5822.method2041(argument_1_,
							argument_0_,
							Statics.anInt3831,
							Class272.anInt2174);
	else
	    Statics.aGraphicsToolkit5822.method2041(argument_1_,
							argument_0_, 0, 0);
    }
    
    DoublyLinkedNodeP2_Sub4_Sub2(String argument_2_, int argument_3_) {
	((DoublyLinkedNodeP2_Sub4_Sub2) this).aString6442 = argument_2_;
	((DoublyLinkedNodeP2_Sub4_Sub2) this).aShort6444 = (short) argument_3_;
    }
    
    static final void method1913(boolean argument, byte argument_4_) {
	int anLocalInt = Class_s_Sub2.anInt5367;
	int anLocalInt_5_ = Class252.anInt1980;
	if (argument && DoublyLinkedNodeP2_Sub3.aBoolean4523) {
	    anLocalInt <<= 1;
	    anLocalInt_5_ = -anLocalInt;
	}
	Class389.aGraphicsToolkit3281.f(anLocalInt_5_, anLocalInt);
    }
    
    static {
	aClass166_6443 = new Class166(68, 12);
    }
}
