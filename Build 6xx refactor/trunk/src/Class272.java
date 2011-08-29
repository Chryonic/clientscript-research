/* Class272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class272
{
    private byte aByte2167;
    int anInt2168;
    int anInt2169;
    int anInt2170;
    static Class207 aClass207_2171 = new Class207(84, 5);
    int anInt2172;
    int anInt2173;
    static int anInt2174;
    
    final int method3373(boolean argument_0_) {
	return aByte2167 & 0x7;
    }
    
    final int method3374(byte argument_1_) {
	if ((aByte2167 & 0x8) != 8)
	    return 0;
	return 1;
    }
    
    public static void method3375(byte argument) {
	aClass207_2171 = null;
    }
    
    public Class272() {
	/* empty */
    }
    
    Class272(Packet argument_2_) {
	aByte2167 = argument_2_.g1s();
	((Class272) this).anInt2172 = argument_2_.g2();
	((Class272) this).anInt2173 = argument_2_.g4();
	((Class272) this).anInt2168 = argument_2_.g4();
	((Class272) this).anInt2170 = argument_2_.g4();
	((Class272) this).anInt2169 = argument_2_.g4();
    }
}
