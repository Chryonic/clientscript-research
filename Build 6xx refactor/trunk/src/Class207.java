/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

import jagex3.jagmisc.jagmisc;

final class Class207
{
    private int anInt1483;
    static boolean aBoolean1485 = false;
    int anInt1487;
    
    static final int method2945(Random argument, int argument_0_,
				int argument_1_) {
	if (argument_1_ <= 0)
	    throw new IllegalArgumentException();
	if (Class2_Sub1.method198(argument_1_))
	    return (int) ((long) argument_1_ * ((long) argument.nextInt()
						& 0xffffffffL)
			  >> 32);
	int anLocalInt
	    = -(int) (4294967296L % (long) argument_1_) - -2147483648;
	int anLocalInt_2_;
	do
	    anLocalInt_2_ = argument.nextInt();
	while (anLocalInt_2_ >= anLocalInt);
	return Class243.method3155(argument_1_, anLocalInt_2_, -126);
    }
    
    static final char method2946(char argument, byte argument_3_,
				 int argument_4_) {
	if (argument >= '\u00c0' && argument <= '\u00ff') {
	    if (argument >= '\u00c0' && argument <= '\u00c6')
		return 'A';
	    if (argument == '\u00c7')
		return 'C';
	    if (argument >= '\u00c8' && argument <= '\u00cb')
		return 'E';
	    if (argument >= '\u00cc' && argument <= '\u00cf')
		return 'I';
	    if (argument >= '\u00d2' && argument <= '\u00d6')
		return 'O';
	    if (argument >= '\u00d9' && argument <= '\u00dc')
		return 'U';
	    if (argument == '\u00dd')
		return 'Y';
	    if (argument == '\u00df')
		return 's';
	    if (argument >= '\u00e0' && argument <= '\u00e6')
		return 'a';
	    if (argument == '\u00e7')
		return 'c';
	    if (argument >= '\u00e8' && argument <= '\u00eb')
		return 'e';
	    if (argument >= '\u00ec' && argument <= '\u00ef')
		return 'i';
	    if (argument >= '\u00f2' && argument <= '\u00f6')
		return 'o';
	    if (argument >= '\u00f9' && argument <= '\u00fc')
		return 'u';
	    if (argument == '\u00fd' || argument == '\u00ff')
		return 'y';
	}
	if (argument == '\u0152')
	    return 'O';
	if (argument == '\u0153')
	    return 'o';
	if (argument == '\u0178')
	    return 'Y';
	return argument;
    }
    
    final int method2947(byte argument_5_) {
	return anInt1483;
    }
    
    static final void method2948(String argument, boolean argument_6_,
				 boolean argument_7_, int argument_8_) {
	try {
	    if (argument.equalsIgnoreCase("commands")
		|| argument.equalsIgnoreCase("help")) {
		Statics.method2425((byte) -103, "commands - This command");
		Statics.method2425((byte) -113, "cls - Clear console");
		Statics.method2425((byte) -121, "displayfps - Toggle FPS and other information");
		Statics.method2425((byte) -113, "renderer - Print graphics renderer information");
		Statics.method2425((byte) -107, "heap - Print java memory information");
		return;
	    }
	    if (argument.equalsIgnoreCase("cls")) {
		Node_Sub38.anInt4174 = 0;
		Statics.anInt1986 = 0;
		return;
	    }
	    if (argument.equalsIgnoreCase("displayfps")) {
		Node_Sub31_Sub27.aBoolean5959
		    = !Node_Sub31_Sub27.aBoolean5959;
		if (!Node_Sub31_Sub27.aBoolean5959)
		    Statics.method2425((byte) -111, "FPS off");
		else {
		    Statics.method2425((byte) -124, "FPS on");
		    return;
		}
		return;
	    }
	    if (argument.equals("renderer")) {
		ToolkitInfo toolkitInfo = Class389.aGraphicsToolkit3281.getDescriptor();
		Statics.method2425((byte) -119, "Vendor: " + ((ToolkitInfo) toolkitInfo).version);
		Statics.method2425((byte) -124, "Name: " + ((ToolkitInfo) toolkitInfo).name);
		Statics.method2425((byte) -117, ("Version: " + ((ToolkitInfo) toolkitInfo).adapter));
		Statics.method2425((byte) -124, ("Device: " + ((ToolkitInfo) toolkitInfo).renderer));
		Statics.method2425((byte) -110, ("Driver Version: " + ((ToolkitInfo) toolkitInfo).aLong362));
		return;
	    }
	    if (argument_8_ != -1)
		return;
	    if (argument.equals("heap")) {
		Statics.method2425((byte) -128, "Heap: " + ClanSettingsDelta.anInt1544 + "MB");
		return;
	    }
	} catch (Exception exception) {
	    Statics.method2425((byte) -105, MultilanguageString.DEV_COMMAND_ERROR.getLocalizedString(client.language));
	    return;
	}
	if (TestingStageEnum.LIVE != client.modeWhere
	    || Class15.anInt120 >= 2) {
	    if (argument.equalsIgnoreCase("errortest"))
		throw new RuntimeException();
	    if (argument.equals("nativememerror"))
		throw new OutOfMemoryError("native(MPR");
	    try {
		if (argument.equalsIgnoreCase("printfps")) {
		    Statics.method2425((byte) -108, "FPS: " + Class350_Sub1.anInt5433);
		    return;
		}
		if (argument.equalsIgnoreCase("occlude")) {
		    DoublyLinkedNode_Sub51_Sub1.aBoolean6223
			= !DoublyLinkedNode_Sub51_Sub1.aBoolean6223;
		    if (!DoublyLinkedNode_Sub51_Sub1.aBoolean6223)
			Statics.method2425((byte) -105, "Occlsion now off!");
		    else {
			Statics.method2425((byte) -115, "Occlsion now on!");
			return;
		    }
		    return;
		}
		if (argument.equalsIgnoreCase("fpson")) {
		    Node_Sub31_Sub27.aBoolean5959 = true;
		    Statics.method2425((byte) -110, "fps debug enabled");
		    return;
		}
		if (argument.equalsIgnoreCase("fpsoff")) {
		    Node_Sub31_Sub27.aBoolean5959 = false;
		    Statics.method2425((byte) -104, "fps debug disabled");
		    return;
		}
		if (argument.equals("systemmem")) {
		    try {
			Statics.method2425((byte) -114, ("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + (((Node_Sub44) Statics.aClass59_Sub44_1064).anInt4246) + "Mb"));
		    } catch (Throwable throwable) {
			/* empty */
		    }
		    return;
		}
		if (argument.equalsIgnoreCase("cleartext")) {
		    Node_Sub49.aClass366_4290.method3990(0);
		    Statics.method2425((byte) -117, "Text coords cleared");
		    return;
		}
		if (argument.equalsIgnoreCase("gc")) {
		    Node_Sub5.method556(false);
		    for (int anLocalInt = 0; anLocalInt < 10; anLocalInt++)
			System.gc();
		    Runtime runtime = Runtime.getRuntime();
		    int anLocalInt
			= (int) ((runtime.totalMemory() - runtime.freeMemory())
				 / 1024L);
		    Statics.method2425((byte) -113, "mem=" + anLocalInt + "k");
		    return;
		}
		if (argument.equalsIgnoreCase("compact")) {
		    Node_Sub5.method556(false);
		    for (int anLocalInt = 0; anLocalInt < 10; anLocalInt++)
			System.gc();
		    Runtime runtime = Runtime.getRuntime();
		    int anLocalInt
			= (int) ((runtime.totalMemory() - runtime.freeMemory())
				 / 1024L);
		    Statics.method2425((byte) -122, ("Memory before cleanup=" + anLocalInt + "k"));
		    Class317.method3639(argument_8_ ^ 0x76);
		    Node_Sub5.method556(false);
		    for (int anLocalInt_9_ = 0; anLocalInt_9_ < 10;
			 anLocalInt_9_++)
			System.gc();
		    anLocalInt
			= (int) ((runtime.totalMemory() - runtime.freeMemory())
				 / 1024L);
		    Statics.method2425((byte) -125, ("Memory after cleanup=" + anLocalInt + "k"));
		    return;
		}
		if (argument.equalsIgnoreCase("unloadnatives")) {
		    Statics.method2425((byte) -113, (Class374.method4081((byte) -28) ? "Libraries unloaded" : "Library unloading failed!"));
		    return;
		}
		if (argument.equalsIgnoreCase("clientdrop")) {
		    Statics.method2425((byte) -113, "Dropped client connection");
		    if (Statics.anInt1652 == 10)
			Node_Sub11.method685((byte) -54);
		    else {
			if (Statics.anInt1652 == 11)
			    Statics.aBoolean1173 = true;
			return;
		    }
		    return;
		}
		if (argument.equalsIgnoreCase("rotateconnectmethods")) {
		    Statics.aGameServer_6149.method3749(43594);
		    Statics.method2425((byte) -119, "Rotated connection methods");
		    return;
		}
		if (argument.equalsIgnoreCase("clientjs5drop")) {
		    client.js5client.closeSocket();
		    Statics.method2425((byte) -121, "Dropped client js5 net queue");
		    return;
		}
		if (argument.equalsIgnoreCase("serverjs5drop")) {
		    client.js5client
			.writeP7(argument_8_ ^ 0xffffffff);
		    Statics.method2425((byte) -115, "Dropped server js5 net queue");
		    return;
		}
		if (argument.equalsIgnoreCase("breakcon")) {
		    Applet_Sub1.baseSignlink.delayNetworkRequests();
		    Statics.aClass307_2632.method3604(-119);
		    client.js5client.setStubIOStreams();
		    Statics.method2425((byte) -127, "Breaking new connections for 5 seconds");
		    return;
		}
		if (argument.equalsIgnoreCase("rebuild")) {
		    Class109_Sub1.method1985(-79);
		    Class371.method4047(-101);
		    Statics.method2425((byte) -115, "Rebuilding map");
		    return;
		}
		if (argument.equalsIgnoreCase("rebuildprofile")) {
		    Class62_Sub6.aLong4386 = Applet_Sub1.getGameTime();
		    GlTexture_Sub3.aBoolean5568 = true;
		    Class109_Sub1.method1985(-73);
		    Class371.method4047(-72);
		    Statics.method2425((byte) -114, "Rebuilding map (with profiling)");
		    return;
		}
		if (argument.equalsIgnoreCase("wm1")) {
		    Class127.method2418(-1, -352753888, 1, -1, false);
		    if (DoublyLinkedNode_Sub51_Sub13.method1262(-124) != 1)
			Statics.method2425((byte) -114, "wm1 failed");
		    else {
			Statics.method2425((byte) -107, "wm1 succeeded");
			return;
		    }
		    return;
		}
		if (argument.equalsIgnoreCase("wm2")) {
		    Class127.method2418(-1, -352753888, 2, -1, false);
		    if (DoublyLinkedNode_Sub51_Sub13.method1262(argument_8_ ^ 0x46)
			== 2)
			Statics.method2425((byte) -117, "wm2 succeeded");
		    else {
			Statics.method2425((byte) -109, "wm2 failed");
			return;
		    }
		    return;
		}
		if (argument.equalsIgnoreCase("wm3")) {
		    Class127.method2418(1024, -352753888, 3, 768, false);
		    if (DoublyLinkedNode_Sub51_Sub13.method1262(73) == 3)
			Statics.method2425((byte) -106, "wm3 succeeded");
		    else {
			Statics.method2425((byte) -103, "wm3 failed");
			return;
		    }
		    return;
		}
		if (argument.equalsIgnoreCase("tk0")) {
		    Class215.method2991((byte) -41, false, 0);
		    if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			    .aClass62_Sub26_4295.method1464(125)
			== 0) {
			Statics.method2425((byte) -125, "Entered tk0");
			AthmosphericConditions.aClass59_Sub50_116.method1159
			    (0, (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				 .aClass62_Sub26_4316), 88);
			Class251.method3240(false);
			Class152.aBoolean1149 = false;
		    } else {
			Statics.method2425((byte) -113, "Failed to enter tk0");
			return;
		    }
		    return;
		}
		if (argument.equalsIgnoreCase("tk1")) {
		    Class215.method2991((byte) -41, false, 1);
		    if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			    .aClass62_Sub26_4295.method1464(96)
			!= 1)
			Statics.method2425((byte) -127, "Failed to enter tk1");
		    else {
			Statics.method2425((byte) -109, "Entered tk1");
			AthmosphericConditions.aClass59_Sub50_116.method1159
			    (1, (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				 .aClass62_Sub26_4316), argument_8_ ^ ~0x52);
			Class251.method3240(false);
			Class152.aBoolean1149 = false;
			return;
		    }
		    return;
		}
		if (argument.equalsIgnoreCase("tk2")) {
		    Class215.method2991((byte) -41, false, 2);
		    if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			    .aClass62_Sub26_4295.method1464(32)
			!= 2)
			Statics.method2425((byte) -125, "Failed to enter tk2");
		    else {
			Statics.method2425((byte) -121, "Entered tk2");
			AthmosphericConditions.aClass59_Sub50_116.method1159
			    (2, (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				 .aClass62_Sub26_4316), 97);
			Class251.method3240(false);
			Class152.aBoolean1149 = false;
			return;
		    }
		    return;
		}
		if (argument.equalsIgnoreCase("tk3")) {
		    Class215.method2991((byte) -41, false, 3);
		    if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			    .aClass62_Sub26_4295.method1464(44)
			!= 3)
			Statics.method2425((byte) -108, "Failed to enter tk3");
		    else {
			Statics.method2425((byte) -127, "Entered tk3");
			AthmosphericConditions.aClass59_Sub50_116.method1159
			    (3, (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				 .aClass62_Sub26_4316), 102);
			Class251.method3240(false);
			Class152.aBoolean1149 = false;
			return;
		    }
		    return;
		}
		if (argument.equalsIgnoreCase("tk5")) {
		    Class215.method2991((byte) -41, false, 5);
		    if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			    .aClass62_Sub26_4295.method1464(78)
			!= 5)
			Statics.method2425((byte) -118, "Failed to enter tk5");
		    else {
			Statics.method2425((byte) -124, "Entered tk5");
			AthmosphericConditions.aClass59_Sub50_116.method1159
			    (5, (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				 .aClass62_Sub26_4316), argument_8_ + 94);
			Class251.method3240(false);
			Class152.aBoolean1149 = false;
			return;
		    }
		    return;
		}
		if (argument.startsWith("setba")) {
		    if (argument.length() < 6)
			Statics.method2425((byte) -127, "Invalid buildarea value");
		    else {
			int anLocalInt
			    = JagexStringUtils.parseInt(argument.substring(6));
			if (anLocalInt < 0
			    || (DoublyLinkedNodeP2_Sub5.method1915(argument_8_ ^ ~0x4c,
							 ClanSettingsDelta.anInt1544)
				< anLocalInt))
			    Statics.method2425((byte) -126, "Invalid buildarea value");
			else {
			    AthmosphericConditions.aClass59_Sub50_116.method1159
				(anLocalInt,
				 (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				  .aClass62_Sub5_4314),
				 78);
			    Class251.method3240(false);
			    Class152.aBoolean1149 = false;
			    Statics.method2425((byte) -120, ("maxbuildarea=" + ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116).aClass62_Sub5_4314.method1371(59)));
			    return;
			}
			return;
		    }
		    return;
		}
		if (argument.startsWith("rect_debug")) {
		    if (argument.length() < 10)
			Statics.method2425((byte) -108, "Invalid rect_debug value");
		    else {
			Class371.anInt3190
			    = JagexStringUtils.parseInt(argument.substring(10).trim());
			Statics.method2425((byte) -128, ("rect_debug=" + Class371.anInt3190));
			return;
		    }
		    return;
		}
		if (argument.equalsIgnoreCase("qa_op_test")) {
		    dba_sub_772_Sub2.aBoolean6372 = true;
		    Statics.method2425((byte) -126, ("qa_op_test=" + dba_sub_772_Sub2.aBoolean6372));
		    return;
		}
		if (argument.equalsIgnoreCase("clipcomponents")) {
		    Class62_Sub28.aBoolean4462 = !Class62_Sub28.aBoolean4462;
		    Statics.method2425((byte) -116, ("clipcomponents=" + Class62_Sub28.aBoolean4462));
		    return;
		}
		if (argument.startsWith("bloom")) {
		    boolean anLocalBoolean
			= Class389.aGraphicsToolkit3281.method2019();
		    if (dba_sub_772_Sub2.method1315((byte) 75,
						    !anLocalBoolean)) {
			if (!anLocalBoolean)
			    Statics.method2425((byte) -106, "Bloom enabled");
			else
			    Statics.method2425((byte) -118, "Bloom disabled");
		    } else {
			Statics.method2425((byte) -125, "Failed to enable bloom");
			return;
		    }
		    return;
		}
		if (argument.equalsIgnoreCase("tween")) {
		    if (!Node_Sub31_Sub9.aBoolean5877) {
			Node_Sub31_Sub9.aBoolean5877 = true;
			Statics.method2425((byte) -103, "Forced tweening ENABLED!");
		    } else {
			Node_Sub31_Sub9.aBoolean5877 = false;
			Statics.method2425((byte) -122, "Forced tweening disabled.");
			return;
		    }
		    return;
		}
		if (argument.equalsIgnoreCase("shiftclick")) {
		    if (Statics.aBoolean1392) {
			Statics.method2425((byte) -111, "Shift-click disabled.");
			Statics.aBoolean1392 = false;
		    } else {
			Statics.method2425((byte) -122, "Shift-click ENABLED!");
			Statics.aBoolean1392 = true;
			return;
		    }
		    return;
		}
		if (argument.equalsIgnoreCase("getcgcoord")) {
		    Statics.method2425((byte) -109, ("x:" + ((((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldX) >> 9) + " z:" + ((((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldZ) >> 9)));
		    return;
		}
		if (argument.equalsIgnoreCase("getheight")) {
		    Statics.method2425((byte) -118, ("Height: " + (Node_Sub31_Sub5.aClass_sArray5858[(((DoublyLinkedNodeP2_Sub2) (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)).lightingHL)].method3534((((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldX) >> 9, false, (((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldZ) >> 9))));
		    return;
		}
		if (argument.equalsIgnoreCase("resetminimap")) {
		    Class205.aJs5Store_1472.clearFileBuffer();
		    Class205.aJs5Store_1472.forceClearSubFileBuffer();
		    Class206.aClass374_1482.method4080(true);
		    Node_Sub31_Sub13.aClass20_5897.method316((byte) -124);
		    Class371.method4047(-96);
		    Statics.method2425((byte) -124, "Minimap reset");
		    return;
		}
		if (argument.startsWith("mc")) {
		    if (!Class389.aGraphicsToolkit3281.method2065())
			Statics.method2425((byte) -126, "Current toolkit doesn't support multiple cores");
		    else {
			int anLocalInt
			    = Integer.parseInt(argument.substring(3));
			if (anLocalInt >= 1) {
			    if (anLocalInt > 4)
				anLocalInt = 4;
			} else
			    anLocalInt = 1;
			Class365.anInt3079 = anLocalInt;
			Class109_Sub1.method1985(-54);
			Statics.method2425((byte) -124, ("Render cores now: " + Class365.anInt3079));
			return;
		    }
		    return;
		}
		if (argument.startsWith("cachespace")) {
		    Statics.method2425((byte) -123, ("I(s): " + Statics.aClass149_1252.method2535(0) + "/" + Statics.aClass149_1252.method2541(119)));
		    Statics.method2425((byte) -103, ("I(m): " + Class371.aClass149_3191.method2535(0) + "/" + Class371.aClass149_3191.method2541(-128)));
		    Statics.method2425((byte) -111, ("O(s): " + ((Class365) Class253_Sub1_Sub1.aClass365_6632).aClass162_3080.method2612(7) + "/" + ((Class365) Class253_Sub1_Sub1.aClass365_6632).aClass162_3080.method2617(false)));
		    return;
		}
		if (argument.equalsIgnoreCase("getcamerapos")) {
		    Statics.method2425((byte) -125, ("Pos: " + (((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).lightingHL) + "," + (MapRelated.baseX + (Class287.anInt2299 >> 9) >> 6) + "," + (MapRelated.baseZ + (Node_Sub31_Sub30.anInt5987 >> 9) >> 6) + "," + ((Class287.anInt2299 >> 9) + MapRelated.baseX & 0x3f) + "," + (((Node_Sub31_Sub30.anInt5987 >> 9) + MapRelated.baseZ) & 0x3f) + " Height: " + ((Node_Sub31_Sub36.method993((((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).lightingHL), Class287.anInt2299, -12040, Node_Sub31_Sub30.anInt5987)) - Class2_Sub2.anInt3763)));
		    Statics.method2425((byte) -118, ("Look: " + (((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).lightingHL) + "," + (Class120.anInt980 + MapRelated.baseX >> 6) + "," + (MapRelated.baseZ + Class298.anInt2475 >> 6) + "," + (Class120.anInt980 + MapRelated.baseX & 0x3f) + "," + (Class298.anInt2475 + MapRelated.baseZ & 0x3f) + " Height: " + ((Node_Sub31_Sub36.method993((((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).lightingHL), Class120.anInt980, argument_8_ ^ 0x2f07, Class298.anInt2475)) - Class182.anInt1378)));
		    return;
		}
		if (argument.equals("renderprofile")
		    || argument.equals("rp")) {
		    Class62.aBoolean444 = !Class62.aBoolean444;
		    Class389.aGraphicsToolkit3281.method2080(Class62.aBoolean444);
		    Class236.method3116(argument_8_ ^ ~0x29);
		    Statics.method2425((byte) -125, ("showprofiling=" + Class62.aBoolean444));
		    return;
		}
		if (argument.startsWith("performancetest")) {
		    int anLocalInt = -1;
		    int anLocalInt_10_ = 1000;
		    if (argument.length() > 15) {
			String[] strings
			    = JagexStringUtils.split(argument, 0, ' ');
			try {
			    if (strings.length > 1)
				anLocalInt_10_ = Integer.parseInt(strings[1]);
			} catch (Throwable throwable) {
			    /* empty */
			}
			try {
			    if (strings.length > 2)
				anLocalInt = Integer.parseInt(strings[2]);
			} catch (Throwable throwable) {
			    /* empty */
			}
		    }
		    if (anLocalInt == -1) {
			Statics.method2425((byte) -104, ("Java toolkit: " + Class51.method470(anLocalInt_10_, (byte) 28, 0)));
			Statics.method2425((byte) -103, ("SSE toolkit:  " + Class51.method470(anLocalInt_10_, (byte) 28, 2)));
			Statics.method2425((byte) -124, ("D3D toolkit:  " + Class51.method470(anLocalInt_10_, (byte) 28, 3)));
			Statics.method2425((byte) -116, ("GL toolkit:   " + Class51.method470(anLocalInt_10_, (byte) 28, 1)));
			Statics.method2425((byte) -106, ("GLX toolkit:  " + Class51.method470(anLocalInt_10_, (byte) 28, 5)));
		    } else {
			Statics.method2425((byte) -122, ("Performance: " + Class51.method470(anLocalInt_10_, (byte) 28, anLocalInt)));
			return;
		    }
		    return;
		}
		if (argument.equals("nonpcs")) {
		    DoublyLinkedNodeP2_Sub2_Sub4.aBoolean6422
			= !DoublyLinkedNodeP2_Sub2_Sub4.aBoolean6422;
		    Statics.method2425((byte) -118, ("nonpcs=" + DoublyLinkedNodeP2_Sub2_Sub4.aBoolean6422));
		    return;
		}
		if (argument.equals("autoworld")) {
		    Class109_Sub1.method1983(97);
		    Statics.method2425((byte) -119, "auto world selected");
		    return;
		}
		if (argument.startsWith("switchworld")) {
		    int anLocalInt = Integer.parseInt(argument.substring(12));
		    Node_Sub7.method568((((Class84_Sub1)
                    Class115.method2369(anLocalInt,
                            46))
                    .aString4482),
                    anLocalInt, false);
		    Statics.method2425((byte) -122, "switched");
		    return;
		}
		if (argument.equals("getworld")) {
		    Statics.method2425((byte) -107, "w: " + ((GameServer) (Statics.aGameServer_6149)).id);
		    return;
		}
		if (argument.startsWith("pc")) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 81,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Statics.aClass207_1276);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129.p1(0);
		    int anLocalInt
			= (((Packet) (((Node_Sub29) class59_sub29)
					     .aClass59_Sub28_Sub1_4129))
			   .pos);
		    int anLocalInt_11_ = argument.indexOf(" ", 4);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129
			.pjstr(argument.substring(3, anLocalInt_11_));
		    Statics.method2599((((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129), argument.substring(anLocalInt_11_), (byte) 17);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129.psize1
                    (-anLocalInt + (((Packet)
                            (((Node_Sub29) class59_sub29)
                                    .aClass59_Sub28_Sub1_4129))
                            .pos));
		    Class251.method3243(class59_sub29, true);
		    return;
		}
		if (argument.equals("savevarcs")) {
		    Node_Sub47_Sub7.method1130((byte) 9);
		    Statics.method2425((byte) -115, "perm varcs saved");
		    return;
		}
		if (argument.equals("scramblevarcs")) {
		    for (int anLocalInt = 0;
			 Cs2Runtime.integerGlobalVariables.length > anLocalInt;
			 anLocalInt++) {
			if (Class273.aBooleanArray2184[anLocalInt]) {
			    Cs2Runtime.integerGlobalVariables[anLocalInt]
				= (int) (Math.random() * 99999.0);
			    if (Math.random() > 0.5)
				Cs2Runtime.integerGlobalVariables[anLocalInt] *= -1;
			}
		    }
		    Node_Sub47_Sub7.method1130((byte) 9);
		    Statics.method2425((byte) -109, "perm varcs scrambled");
		    return;
		}
		if (argument.equals("showcolmap")) {
		    DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aBoolean6566 = true;
		    Class371.method4047(argument_8_ - 91);
		    Statics.method2425((byte) -127, "colmap is shown");
		    return;
		}
		if (argument.equals("hidecolmap")) {
		    DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aBoolean6566 = false;
		    Class371.method4047(-69);
		    Statics.method2425((byte) -124, "colmap is hidden");
		    return;
		}
		if (argument.equals("resetcache")) {
		    Class241.method3151((byte) -108);
		    Statics.method2425((byte) -112, "Caches reset");
		    return;
		}
		if (argument.equals("profilecpu")) {
		    Statics.method2425((byte) -128, (String.valueOf(Class26.method352(true)) + "ms"));
		    return;
		}
		if (argument.startsWith("getclientvarpbit")) {
		    int anLocalInt = Integer.parseInt(argument.substring(17));
		    Statics.method2425((byte) -126, ("varpbit=" + ClientVariables.instance.getVarbit(anLocalInt, argument_8_ ^ ~0x3772)));
		    return;
		}
		if (argument.startsWith("getclientvarp")) {
		    int anLocalInt = Integer.parseInt(argument.substring(14));
		    Statics.method2425((byte) -121, ("varp=" + ClientVariables.instance.get(0, anLocalInt)));
		    return;
		}
		if (argument.startsWith("directlogin")) {
		    String[] strings
			= JagexStringUtils.split(argument.substring(12), 0, ' ');
		    if (strings.length >= 2) {
			int anLocalInt = (strings.length <= 2 ? 0
					  : Integer.parseInt(strings[2]));
			Class366.method3991(strings[1], anLocalInt, 6,
					    strings[0]);
			return;
		    }
		}
		if (argument.startsWith("snlogin ")) {
		    String[] strings
			= JagexStringUtils.split(argument.substring(8), 0, ' ');
		    int anLocalInt = Integer.parseInt(strings[0]);
		    int anLocalInt_12_ = (strings.length != 2 ? 0
					  : Integer.parseInt(strings[1]));
		    Class62_Sub11.method1398(anLocalInt_12_, anLocalInt,
					     argument_8_ + 126);
		    return;
		}
		if (argument.startsWith("csprofileclear")) {
		    Cs2Runtime.empty3664();
		    return;
		}
		if (argument.startsWith("csprofileoutputc")) {
		    Cs2Runtime.empty3662();
		    return;
		}
		if (argument.startsWith("csprofileoutputt")) {
		    Cs2Runtime.empty3662();
		    return;
		}
		if (argument.startsWith("texsize")) {
		    int anLocalInt = Integer.parseInt(argument.substring(8));
		    Class389.aGraphicsToolkit3281.method2053(anLocalInt);
		    return;
		}
		if (argument.equals("soundstreamcount")) {
		    Statics.method2425((byte) -119, ("Active streams: " + Class353_Sub2.aClass59_Sub9_Sub3_5483.method627()));
		    return;
		}
		if (argument.equals("autosetup")) {
		    Statics.method128((byte) 60);
		    Statics.method2425((byte) -125, ("Complete. Toolkit now: " + ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116).aClass62_Sub26_4295.method1464(35)));
		    return;
		}
		if (argument.equals("errormessage")) {
		    Statics.method2425((byte) -116, client.clientInstance.method85(112));
		    return;
		}
		if (argument.equals("heapdump")) {
		    if (Signlink.osNameLC.startsWith("win"))
			Class287.method3470(argument_8_ + 70, false,
					    new File("C:\\Temp\\heap.dump"));
		    else
			Class287.method3470(-127, false,
					    new File("/tmp/heap.dump"));
		    Statics.method2425((byte) -128, "Done");
		    return;
		}
		if (argument.equals("os")) {
		    Statics.method2425((byte) -106, "Name: " + Signlink.osNameLC);
		    Statics.method2425((byte) -124, "Arch: " + Signlink.osArch);
		    Statics.method2425((byte) -127, "Ver: " + Signlink.osVersion);
		    return;
		}
		if (argument.startsWith("w2debug")) {
		    int anLocalInt
			= Integer.parseInt(argument.substring(8, 9));
		    Class253_Sub1.anInt5666 = anLocalInt;
		    Class109_Sub1.method1985(-14);
		    Statics.method2425((byte) -106, "Toggled!");
		    return;
		}
		if (argument.startsWith("ortho ")) {
		    int anLocalInt = argument.indexOf(' ');
		    if (anLocalInt < 0)
			Statics.method2425((byte) -123, "Syntax: ortho <n>");
		    else {
			int anLocalInt_13_
			    = JagexStringUtils.parseInt(argument.substring(anLocalInt + 1));
			AthmosphericConditions.aClass59_Sub50_116.method1159
			    (anLocalInt_13_,
			     (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			      .aClass62_Sub10_4335),
			     119);
			Class251.method3240(false);
			Class152.aBoolean1149 = false;
			Node_Sub38.method1067(26);
			if (anLocalInt_13_
			    != ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				   .aClass62_Sub10_4335.method1393(47))
			    Statics.method2425((byte) -106, "Failed to change ortho mode");
			else {
			    Statics.method2425((byte) -122, "Successfully changed ortho mode");
			    return;
			}
			return;
		    }
		    return;
		}
		if (argument.startsWith("orthozoom ")) {
		    if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			    .aClass62_Sub10_4335.method1393(60)
			== 0)
			Statics.method2425((byte) -103, "enable ortho mode first (use 'ortho <n>')");
		    else {
			int anLocalInt
			    = (JagexStringUtils.parseInt(argument.substring(argument.indexOf(' ') + 1)));
			Class390.anInt3284 = anLocalInt;
			Statics.method2425((byte) -116, "orthozoom=" + Class390.anInt3284);
			return;
		    }
		    return;
		}
		if (argument.startsWith("orthotilesize ")) {
		    int anLocalInt
			= (JagexStringUtils.parseInt(argument.substring(argument.indexOf(' ') + 1)));
		    Node_Sub31_Sub29.anInt5981 = Class5.anInt66
			= anLocalInt;
		    Statics.method2425((byte) -105, "ortho tile size=" + anLocalInt);
		    Node_Sub38.method1067(63);
		    return;
		}
		if (argument.equals("orthocamlock")) {
		    DoublyLinkedNode_Sub51_Sub12_Sub1.aBoolean6672
			= !DoublyLinkedNode_Sub51_Sub12_Sub1.aBoolean6672;
		    Statics.method2425((byte) -127, ("ortho camera lock is " + ((DoublyLinkedNode_Sub51_Sub12_Sub1.aBoolean6672) ? "on" : "off")));
		    return;
		}
		if (argument.startsWith("setoutput ")) {
		    File file = new File(argument.substring(10));
		    if (file.exists()) {
			file = new File(argument.substring(10) + "."
					+ Applet_Sub1.getGameTime() + ".log");
			if (file.exists()) {
			    Statics.method2425((byte) -105, "file already exists!");
			    return;
			}
		    }
		    if (Class194.aFileOutputStream1416 != null) {
			Class194.aFileOutputStream1416.close();
			Class194.aFileOutputStream1416 = null;
		    }
		    try {
			Class194.aFileOutputStream1416
			    = new FileOutputStream(file);
		    } catch (java.io.FileNotFoundException filenotfoundexception) {
			Statics.method2425((byte) -106, ("Could not create " + file.getName()));
		    } catch (SecurityException securityexception) {
			Statics.method2425((byte) -127, ("Cannot write to " + file.getName()));
		    }
		    return;
		}
		if (argument.equals("closeoutput")) {
		    if (Class194.aFileOutputStream1416 != null)
			Class194.aFileOutputStream1416.close();
		    Class194.aFileOutputStream1416 = null;
		    return;
		}
		if (argument.startsWith("runscript ")) {
		    File file = new File(argument.substring(10));
		    if (!file.exists()) {
			Statics.method2425((byte) -125, "No such file");
			return;
		    }
		    byte[] anLocalInts
			= MultilanguageString.method3779(file, argument_8_ + 9);
		    if (anLocalInts == null) {
			Statics.method2425((byte) -111, "Failed to read file");
			return;
		    }
		    String[] strings
			= (JagexStringUtils.split((Statics.method181(DoublyLinkedNodeP2_Sub2_Sub2_Sub2.method1811(1, anLocalInts), true, "", '\r')), 0, '\n'));
		    Node_Sub20.method721(-31780, strings);
		}
		if (argument.startsWith("zoom ")) {
		    short anLocalInt
			= (short) JagexStringUtils.parseInt(argument.substring(5));
		    if (anLocalInt > 0)
			Class245_Sub1_Sub1.aShort6515 = anLocalInt;
		    return;
		}
		if (Statics.anInt1652 == 10) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 118,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Statics.aClass207_1728);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129
			.p1(argument.length() + 3);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129
			.p1(argument_6_ ? 1 : 0);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129
			.p1(!argument_7_ ? 0 : 1);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129
			.pjstr(argument);
		    Class251.method3243(class59_sub29, true);
		}
		if (argument.startsWith("fps ")
		    && (client.modeWhere
			!= TestingStageEnum.LIVE)) {
		    Class284.method3457(124,
					JagexStringUtils.parseInt(argument.substring(4)));
		    return;
		}
	    } catch (Exception exception) {
		Statics.method2425((byte) -113, MultilanguageString.DEV_COMMAND_ERROR.getLocalizedString(client.language));
		return;
	    }
	}
	if (Statics.anInt1652 != 10)
	    Statics.method2425((byte) -125, (MultilanguageString.UNKNOWN_DEVELOPER_CMD.getLocalizedString(client.language) + argument));
    }
    
    public final String toString() {
	throw new IllegalStateException();
    }
    
    public static void method2949(int argument) {
	TestingStageEnum.WTRC = null;
    }
    
    Class207(int argument_14_, int argument_15_) {
	anInt1483 = argument_14_;
	((Class207) this).anInt1487 = argument_15_;
    }
    
    static {
    }
}
