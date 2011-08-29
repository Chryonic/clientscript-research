/* Class59_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

final class Node_Sub7 extends Node
{
    static int anInt3909;
    int anInt3910;
    int anInt3911;
    int anInt3912;
    boolean aBoolean3913 = false;
    static Class166 aClass166_3914 = new Class166(56, -2);
    static Class81 aClass81_3915;
    int anInt3916;
    static boolean aBoolean3917 = false;
    int anInt3918;
    int anInt3919;
    static DCyclicLinkedList aDCyclicLinkedList_3920;
    
    public static void method567(boolean argument) {
	aClass166_3914 = null;
	aClass81_3915 = null;
	aDCyclicLinkedList_3920 = null;
    }
    
    static final boolean method568(String argument, int argument_0_,
				   boolean argument_1_) {
	if (((Signlink) Applet_Sub1.baseSignlink).useCache) {
	    Statics.aGameServer_6149 = new GameServer();
	    ((GameServer) Statics.aGameServer_6149).address
		= argument;
	    ((GameServer) Statics.aGameServer_6149).id
		= argument_0_;
	    if (client.modeWhere != TestingStageEnum.LIVE) {
		((GameServer) Statics.aGameServer_6149).secundaryPort
		    = (((GameServer) Statics.aGameServer_6149).id
		       + 50000);
		((GameServer) Statics.aGameServer_6149).primaryPort
		    = 40000 + (((GameServer) Statics.aGameServer_6149)
			       .id);
	    }
	    for (int anLocalInt = 0;
		 anLocalInt < Class384.aClass84_Sub1Array3251.length;
		 anLocalInt++) {
		if (((Class84_Sub1)
		     Class384.aClass84_Sub1Array3251[anLocalInt]).anInt4481
		    == argument_0_)
		    client.worldFlags
			= ((Class84) (Class384.aClass84_Sub1Array3251
				      [anLocalInt])).anInt595;
	    }
	    return true;
	}
	String string = "";
	if (client.modeWhere != TestingStageEnum.LIVE)
	    string = ":" + (argument_0_ + 7000);
	String string_2_ = "";
	if (client.settingsString != null)
	    string_2_ = "/p=" + client.settingsString;
	String string_3_
	    = ("http://" + argument + string + "/l=" + client.language
	       + "/a=" + client.affiliateId + string_2_ + "/j"
	       + (Applet_Sub1.useJavaScript ? "1" : "0") + ",o"
	       + (Applet_Sub1.objectTagApplet ? "1" : "0") + ",a2");
	try {
	    client.clientInstance.getAppletContext()
		.showDocument(new URL(string_3_), "_self");
	} catch (Exception exception) {
	    return false;
	}
	return true;
    }
    
    static final void method569(int argument) {
	AthmosphericConditions.aClass59_Sub50_116.method1159(1, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub25_4321), 103);
	AthmosphericConditions.aClass59_Sub50_116.method1159(1, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub25_4332), 122);
	AthmosphericConditions.aClass59_Sub50_116.method1159(2, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub29_4310), 71);
	AthmosphericConditions.aClass59_Sub50_116.method1159(2, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub29_4328), 118);
	AthmosphericConditions.aClass59_Sub50_116.method1159(1, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub7_4307), 84);
	AthmosphericConditions.aClass59_Sub50_116.method1159(1, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub3_4318), 73);
	AthmosphericConditions.aClass59_Sub50_116.method1159(1, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub24_4299), 83);
	AthmosphericConditions.aClass59_Sub50_116.method1159(1, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub18_4304), 126);
	AthmosphericConditions.aClass59_Sub50_116.method1159(1, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub27_4330), 116);
	AthmosphericConditions.aClass59_Sub50_116.method1159(1,
					      (((Node_Sub50)
						AthmosphericConditions.aClass59_Sub50_116)
					       .aClass62_Sub19_4323),
					      argument + 85);
	AthmosphericConditions.aClass59_Sub50_116.method1159(1, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub8_4331), 113);
	AthmosphericConditions.aClass59_Sub50_116.method1159(1,
					      (((Node_Sub50)
						AthmosphericConditions.aClass59_Sub50_116)
					       .aClass62_Sub16_4308),
					      argument + 88);
	AthmosphericConditions.aClass59_Sub50_116.method1159(0, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub20_4334), 78);
	AthmosphericConditions.aClass59_Sub50_116.method1159(1, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub13_4329), 77);
	AthmosphericConditions.aClass59_Sub50_116.method1159(0, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub6_4317), 121);
	AthmosphericConditions.aClass59_Sub50_116.method1159(0, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub6_4296), 90);
	AthmosphericConditions.aClass59_Sub50_116.method1159(1, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub1_4297), 110);
	AthmosphericConditions.aClass59_Sub50_116.method1159(0, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub5_4314), 103);
	AthmosphericConditions.aClass59_Sub50_116.method1159(argument,
					      (((Node_Sub50)
						AthmosphericConditions.aClass59_Sub50_116)
					       .aClass62_Sub14_4327),
					      94);
	Statics.method2491(false);
	AthmosphericConditions.aClass59_Sub50_116.method1159(1, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub23_4311), 91);
	AthmosphericConditions.aClass59_Sub50_116.method1159(3, (((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						  .aClass62_Sub21_4326), 94);
	Class353_Sub2.method3896(false);
	Class120.method2385((byte) 127);
	Node_Sub50.aBoolean4325 = true;
    }
    
    Node_Sub7(int argument_4_) {
	((Node_Sub7) this).anInt3910 = -1;
	((Node_Sub7) this).anInt3910 = argument_4_;
    }
    
    static {
	aClass81_3915 = new Class81();
	aDCyclicLinkedList_3920 = new DCyclicLinkedList();
    }
}
