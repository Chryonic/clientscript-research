/* Class59_Sub44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.hardware_info.HardwareInfo;

final class Node_Sub44 extends Node
{
    private String aString4230;
    private int anInt4231;
    private int anInt4232;
    private String aString4233;
    private String aString4234;
    private int anInt4235;
    private int anInt4236;
    private int anInt4237;
    private int anInt4238;
    private String aString4239;
    private int anInt4240;
    private int anInt4241;
    private int anInt4242;
    private int anInt4243;
    private boolean aBoolean4244;
    private int anInt4245;
    int anInt4246;
    private int anInt4247;
    private int anInt4248;
    private int anInt4249;
    static Class149 aClass149_4250 = new Class149(8);
    private boolean aBoolean4251;
    static int anInt4252 = 0;
    static double aDouble4253;
    static boolean[][][] aBooleanArrayArrayArray4255;
    
    final void method1083(Packet argument_0_, int argument_1_) {
	argument_0_.p1(5);
	argument_0_.p1(anInt4238);
	argument_0_.p1(aBoolean4251 ? 1 : 0);
	argument_0_.p1(anInt4236);
	argument_0_.p1(anInt4247);
	argument_0_.p1(anInt4231);
	argument_0_.p1(anInt4241);
	argument_0_.p1(anInt4243);
	argument_0_.p1(aBoolean4244 ? 1 : 0);
	argument_0_.p2(anInt4245);
	argument_0_.p1(anInt4232);
	argument_0_.p3(((Node_Sub44) this).anInt4246);
	argument_0_.p2(anInt4249);
	argument_0_.p1(anInt4248);
	argument_0_.p1(anInt4235);
	argument_0_.p1(anInt4240);
	argument_0_.pjstr2(aString4234);
	argument_0_.pjstr2(aString4230);
	argument_0_.pjstr2(aString4239);
	argument_0_.pjstr2(aString4233);
	argument_0_.p1(anInt4237);
	argument_0_.p2(anInt4242);
    }
    
    final int method1084(int argument_2_) {
	int anLocalInt = 23;
	anLocalInt += Class138.method2468(aString4234, 5);
	anLocalInt += Class138.method2468(aString4230, 5);
	anLocalInt += Class138.method2468(aString4239, 5);
	anLocalInt += Class138.method2468(aString4233, 5);
	return anLocalInt;
    }
    
    static final Class150 method1085(Packet argument, int argument_3_) {
	int anLocalInt = argument.g2();
	return new Class150(anLocalInt);
    }
    
    private final void method1086(int argument_4_) {
	if (aString4234.length() > 40)
	    aString4234 = aString4234.substring(0, 40);
	if (argument_4_ != 46)
	    method1084(-60);
	if (aString4230.length() > 40)
	    aString4230 = aString4230.substring(0, 40);
	if (aString4239.length() > 10)
	    aString4239 = aString4239.substring(0, 10);
	if (aString4233.length() > 10)
	    aString4233 = aString4233.substring(0, 10);
    }
    
    public Node_Sub44() {
	/* empty */
    }
    
    public static void method1087(byte argument) {
	aClass149_4250 = null;
	Class211.aClass211_4254 = null;
	aBooleanArrayArrayArray4255 = null;
    }
    
    Node_Sub44(boolean argument_5_, Signlink argument_6_) {
	if (argument_5_) {
	    if (!Signlink.osNameLC.startsWith("win")) {
		if (!Signlink.osNameLC.startsWith("mac")) {
		    if (!Signlink.osNameLC.startsWith("linux"))
			anInt4238 = 4;
		    else
			anInt4238 = 3;
		} else
		    anInt4238 = 2;
	    } else
		anInt4238 = 1;
	    if (Signlink.osArch.startsWith("amd64")
		|| Signlink.osArch.startsWith("x86_64"))
		aBoolean4251 = true;
	    else
		aBoolean4251 = false;
	    if (anInt4238 == 1) {
		if (Signlink.osVersion.indexOf("4.0") != -1)
		    anInt4236 = 1;
		else if (Signlink.osVersion.indexOf("4.1") == -1) {
		    if (Signlink.osVersion.indexOf("4.9") != -1)
			anInt4236 = 3;
		    else if (Signlink.osVersion.indexOf("5.0") == -1) {
			if (Signlink.osVersion.indexOf("5.1") == -1) {
			    if (Signlink.osVersion.indexOf("6.0") != -1)
				anInt4236 = 6;
			    else if (Signlink.osVersion.indexOf("6.1") != -1)
				anInt4236 = 7;
			} else
			    anInt4236 = 5;
		    } else
			anInt4236 = 4;
		} else
		    anInt4236 = 2;
	    } else if (anInt4238 == 2) {
		if (Signlink.osVersion.indexOf("10.4") != -1)
		    anInt4236 = 20;
		else if (Signlink.osVersion.indexOf("10.5") == -1) {
		    if (Signlink.osVersion.indexOf("10.6") != -1)
			anInt4236 = 22;
		} else
		    anInt4236 = 21;
	    }
	    if (Signlink.javaVendor.toLowerCase().indexOf("sun") != -1)
		anInt4247 = 1;
	    else if (Signlink.javaVendor.toLowerCase().indexOf("microsoft")
		     == -1) {
		if (Signlink.javaVendor.toLowerCase().indexOf("apple") != -1)
		    anInt4247 = 3;
		else
		    anInt4247 = 4;
	    } else
		anInt4247 = 2;
	    int anLocalInt = 2;
	    int anLocalInt_7_ = 0;
	    try {
		while (anLocalInt < Signlink.javaVersion.length()) {
		    int anLocalInt_8_
			= Signlink.javaVersion.charAt(anLocalInt);
		    if (anLocalInt_8_ < 48 || anLocalInt_8_ > 57)
			break;
		    anLocalInt++;
		    anLocalInt_7_ = anLocalInt_8_ + (anLocalInt_7_ * 10 - 48);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    anInt4231 = anLocalInt_7_;
	    anLocalInt = Signlink.javaVersion.indexOf('.', 2) + 1;
	    anLocalInt_7_ = 0;
	    try {
		while (anLocalInt < Signlink.javaVersion.length()) {
		    int anLocalInt_9_
			= Signlink.javaVersion.charAt(anLocalInt);
		    if (anLocalInt_9_ < 48 || anLocalInt_9_ > 57)
			break;
		    anLocalInt++;
		    anLocalInt_7_ = anLocalInt_9_ + anLocalInt_7_ * 10 - 48;
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    anInt4241 = anLocalInt_7_;
	    anLocalInt = Signlink.javaVersion.indexOf('_', 4) + 1;
	    anLocalInt_7_ = 0;
	    try {
		for (/**/; anLocalInt < Signlink.javaVersion.length();
		     anLocalInt++) {
		    int anLocalInt_10_
			= Signlink.javaVersion.charAt(anLocalInt);
		    if (anLocalInt_10_ < 48 || anLocalInt_10_ > 57)
			break;
		    anLocalInt_7_
			= anLocalInt_7_ * 10 - (-anLocalInt_10_ + 48);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    if (anInt4231 <= 3)
		anInt4232 = 0;
	    else
		anInt4232 = tia_sub_35_Sub2DoublyLinked.anInt6670;
	    anInt4245 = ClanSettingsDelta.anInt1544;
	    if (!((Signlink) argument_6_).useCache)
		aBoolean4244 = true;
	    else
		aBoolean4244 = false;
	    anInt4243 = anLocalInt_7_;
	    try {
		int[] anLocalInts = HardwareInfo.getCPUInfo();
		if (anLocalInts != null && anLocalInts.length == 7) {
		    anInt4235 = anLocalInts[4];
		    anInt4248 = anLocalInts[3];
		    anInt4249 = anLocalInts[2];
		    ((Node_Sub44) this).anInt4246 = anLocalInts[6];
		    anInt4240 = anLocalInts[5];
		}
	    } catch (Throwable throwable) {
		((Node_Sub44) this).anInt4246 = 0;
	    }
	}
	if (aString4239 == null)
	    aString4239 = "";
	if (aString4230 == null)
	    aString4230 = "";
	if (aString4233 == null)
	    aString4233 = "";
	if (aString4234 == null)
	    aString4234 = "";
	method1086(46);
    }
}
