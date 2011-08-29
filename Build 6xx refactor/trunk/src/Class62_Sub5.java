/* Class62_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

final class Class62_Sub5 extends Class62
{
    static String osArch;
    static String osName;
    static int[][] anIntArrayArray4382
	= { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 },
	    { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 },
	    { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 },
	    { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
    static Class149 aClass149_4383;
    static DoublyLinkedNodeP2_Sub7[] aClass104_Sub7Array4384;
    
    Class62_Sub5(int argument_0_, Node_Sub50 argument_1_) {
	super(argument_0_, argument_1_);
    }
    
    final void method1346(boolean argument_2_) {
	int anLocalInt = ((Class62) this).aClass59_Sub50_440.method1157
			     (-104).method229(117);
	if (anLocalInt < 96)
	    ((Class62) this).anInt441 = 0;
	if (((Class62) this).anInt441 > 1 && anLocalInt < 128)
	    ((Class62) this).anInt441 = 1;
	if (argument_2_)
	    anIntArrayArray4382 = null;
	if (((Class62) this).anInt441 > 2 && anLocalInt < 192)
	    ((Class62) this).anInt441 = 2;
	if (((Class62) this).anInt441 < 0 || ((Class62) this).anInt441 > 3)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    Class62_Sub5(Node_Sub50 argument_3_) {
	super(argument_3_);
    }
    
    final int method1371(int argument_4_) {
	return ((Class62) this).anInt441;
    }
    
    static final void method1372(int argument, int argument_5_,
				 int argument_6_, int argument_7_) {
	AthmosphereDefinition athmosphereDefinition = (AthmosphericConditions
			     .athmosphereDefinitions[argument][argument_6_]);
	AthmosphericConditions.setTarget(argument_5_, (athmosphereDefinition != null ? athmosphereDefinition : AthmosphericConditions.defaultAthmosphereDefinition));
    }
    
    final int method1344(byte argument_8_) {
	if (argument_8_ != 4)
	    osName = null;
	return 0;
    }
    
    final int method1342(int argument_9_, byte argument_10_) {
	int anLocalInt = ((Class62) this).aClass59_Sub50_440.method1157(28)
			     .method229(111);
	if (anLocalInt < 96)
	    return 3;
	if (argument_9_ > 1 && anLocalInt < 128)
	    return 3;
	if (argument_9_ > 3 && anLocalInt < 192)
	    return 3;
	return 1;
    }
    
    static final void method1373(int argument, int argument_11_,
				 RsInterface argument_12_, int argument_13_) {
	Statics.anInt5262 = argument;
	Class225.anInt1634 = argument_13_;
	Node_Sub47_Sub8.aRsInterface_6196 = argument_12_;
    }
    
    final void method1343(int argument_14_, byte argument_15_) {
	if (argument_15_ != -107)
	    osArch = null;
	((Class62) this).anInt441 = argument_14_;
    }
    
    final boolean method1374(int argument_16_) {
	int anLocalInt = ((Class62) this).aClass59_Sub50_440.method1157
			     (-14).method229(111);
	if (anLocalInt < 96)
	    return false;
	return true;
    }
    
    public static void method1375(int argument) {
	aClass104_Sub7Array4384 = null;
	osName = null;
	osArch = null;
	anIntArrayArray4382 = null;
	aClass149_4383 = null;
    }
    
    static {
	String b = "Unknown";
	try {
	    b = System.getProperty("java.vendor").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	b.toLowerCase();
	b = "Unknown";
	try {
	    b = System.getProperty("java.version").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	b.toLowerCase();
	b = "Unknown";
	try {
	    b = System.getProperty("os.name").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	osName = b.toLowerCase();
	b = "Unknown";
	try {
	    b = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	osArch = b.toLowerCase();
	b = "Unknown";
	try {
	    b = System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	b.toLowerCase();
	b = "~/";
	try {
	    b = System.getProperty("user.home").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	new File(b);
	aClass149_4383 = new Class149(10);
    }
}
