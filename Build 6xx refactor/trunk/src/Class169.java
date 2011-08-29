/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class169
{
    static Class207 aClass207_1233;
    Node_Sub25 aClass59_Sub25_1234;
    static HardwareLight[] aClass59_Sub3Array1235 = new HardwareLight[8];
    int anInt1236;
    int anInt1237;
    int anInt1238;
    int anInt1239;
    Node_Sub9_Sub4 aClass59_Sub9_Sub4_1240;
    byte aByte1241;
    int anInt1242;
    Node_Sub40_Sub1 aClass59_Sub40_Sub1_1243;
    int anInt1244;
    DoublyLinkedNodeP2_Sub2 aClass104_Sub2_1245;
    Class198 aClass198_1246;
    
    static final int method2731(byte argument,
				DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 argument_0_) {
	int anLocalInt
	    = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_0_).anInt6838;
	Class354 class354 = argument_0_.method1831();
	if (((Entity) argument_0_).anInt6731 == -1
	    || ((Entity) argument_0_).aBoolean6753)
	    anLocalInt
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_0_).anInt6837;
	else if ((((Entity) argument_0_).anInt6731
		  == ((Class354) class354).anInt2999)
		 || (((Class354) class354).anInt2980
		     == ((Entity) argument_0_).anInt6731)
		 || (((Class354) class354).anInt2973
		     == ((Entity) argument_0_).anInt6731)
		 || (((Class354) class354).anInt2975
		     == ((Entity) argument_0_).anInt6731))
	    anLocalInt
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_0_).anInt6851;
	else if ((((Class354) class354).anInt2956
		  == ((Entity) argument_0_).anInt6731)
		 || (((Class354) class354).anInt2964
		     == ((Entity) argument_0_).anInt6731)
		 || (((Entity) argument_0_).anInt6731
		     == ((Class354) class354).anInt2966)
		 || (((Entity) argument_0_).anInt6731
		     == ((Class354) class354).anInt2988))
	    anLocalInt
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_0_).anInt6870;
	return anLocalInt;
    }
    
    final boolean method2732(byte argument_1_) {
	if (((Class169) this).aByte1241 != 2
	    && ((Class169) this).aByte1241 != 3)
	    return false;
	return true;
    }
    
    static final void method2733(byte argument, GlToolkit argument_2_) {
	if (Class119.anObject972 == null) {
	    Class245_Sub2_Sub1 class245_sub2_sub1 = new Class245_Sub2_Sub1();
	    byte[] anLocalInts
		= class245_sub2_sub1.method3195(16, -31095, 128, 128);
	    Class119.anObject972
		= Class183_Sub1.wrap(anLocalInts, false, -137);
	}
	if (Class195.anObject1433 == null) {
	    Class245_Sub1_Sub2 class245_sub1_sub2 = new Class245_Sub1_Sub2();
	    byte[] anLocalInts
		= class245_sub1_sub2.method3186(-87, 128, 128, 16);
	    Class195.anObject1433
		= Class183_Sub1.wrap(anLocalInts, false, -137);
	}
	Class196 class196 = ((GlToolkit) argument_2_).aClass196_4848;
	if (class196.method2901((byte) 36) && GameServer.anObject2744 == null) {
	    byte[] anLocalInts
		= Class387.method4128(0.6F, false, 4.0F, 4.0F, 16, 128, 0.5F,
				      16.0F, 128, new Class111_Sub1(419684),
				      8);
	    GameServer.anObject2744
		= Class183_Sub1.wrap(anLocalInts, false, -137);
	}
    }
    
    public static void method2734(byte argument) {
	aClass207_1233 = null;
	aClass59_Sub3Array1235 = null;
    }
    
    Class169(byte argument_3_, int argument_4_, int argument_5_,
	     int argument_6_, int argument_7_, int argument_8_,
	     int argument_9_, DoublyLinkedNodeP2_Sub2 argument_10_) {
	((Class169) this).anInt1236 = argument_6_;
	((Class169) this).aByte1241 = argument_3_;
	((Class169) this).anInt1239 = argument_9_;
	((Class169) this).aClass104_Sub2_1245 = argument_10_;
	((Class169) this).anInt1244 = argument_5_;
	((Class169) this).anInt1238 = argument_7_;
	((Class169) this).anInt1237 = argument_8_;
	((Class169) this).anInt1242 = argument_4_;
    }
    
    static {
	aClass207_1233 = new Class207(32, -1);
    }
}
