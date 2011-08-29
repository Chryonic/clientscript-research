/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 8/3/11
 * Time: 11:11 AM
 * To change this template use File | Ssettings | File Templates.
 */
public class LightingManager {
    static int lightCoordRShift;
    static int attenuationOffset;
    static VirtualLight[] virtualLights;
    static long[][][] virtualLightMap;
    static int lightListPointer;
    static boolean[] aBooleanArray3116;
    static int yMapSize;
    static int xMapSize;
    static int zMapSize;

    static void method3620(DoublyLinkedNodeP2_Sub2 argument, HardwareLight[] hwLights) {
        if (Class128.aBoolean1039) {
            int lightCount = argument.applyLighting((byte) -108, hwLights);
            DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.setLights(lightCount, hwLights);
        }
        if (Class65.aClass_sArray455 == Node_Sub31_Sub5.aClass_sArray5858) {
            int anLocalInt;
            int anLocalInt_6_;
            if (argument instanceof DoublyLinkedNodeP2_Sub2_Sub2) {
                anLocalInt = (((DoublyLinkedNodeP2_Sub2_Sub2) argument).left);
                anLocalInt_6_ = (((DoublyLinkedNodeP2_Sub2_Sub2) argument).bottom);
            } else {
                anLocalInt = (argument.worldX >> lightCoordRShift);
                anLocalInt_6_ = (argument.worldZ >> lightCoordRShift);
            }
            DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.EA((Statics.aClass_sArray2713[0].method3541(argument.worldZ, 0, argument.worldX)), Node_Sub47_Sub6.method1127(anLocalInt, anLocalInt_6_), Class62_Sub2.method1352(anLocalInt, anLocalInt_6_), DoublyLinkedNode_Sub51_Sub12.method1255(anLocalInt, anLocalInt_6_));
        }
        DoublyLinkedNodeP2_Sub10 class104_sub10 = argument.method1776(-10, DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834);
        if (class104_sub10 != null) {
            if (argument.aBoolean4517) {
                DoublyLinkedNodeP2_Sub9[] class104_sub9s = (class104_sub10.aClass104_Sub9Array4595);
                for (DoublyLinkedNodeP2_Sub9 class104_sub9 : class104_sub9s) {
                    if (class104_sub9.aBoolean4591)
                        Canvas_Sub1.method125((class104_sub9.anInt4590 + class104_sub9.anInt4586), (byte) -102, (class104_sub9.anInt4587 + class104_sub9.anInt4586), (class104_sub9.anInt4589 - class104_sub9.anInt4586), (class104_sub9.anInt4588 - class104_sub9.anInt4586));
                }
            }
            if (class104_sub10.aBoolean4592) {
                class104_sub10.aClass104_Sub2_4596 = argument;
                if (Node_Sub31_Sub10.aBoolean5882) {
                    synchronized (Class62_Sub20.aClass314_4431) {
                        Class62_Sub20.aClass314_4431.method3625(class104_sub10, -15621);
                    }
                } else Class62_Sub20.aClass314_4431.method3625(class104_sub10, -15621);
            } else Class353_Sub9.method3915(class104_sub10, (byte) 108);
        }
    }

    static void method4082(GraphicsToolkit argument, int argument_13_, int argument_14_, int ySize, int xSize, int zSize, int argument_18_, boolean argument_19_, boolean argument_20_) {
        DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834 = argument;
        DoublyLinkedNodeP2_Sub2_Sub3_Sub1.anInt6602 = argument_13_;
        Node_Sub31_Sub10.aBoolean5882 = (DoublyLinkedNodeP2_Sub2_Sub3_Sub1.anInt6602 > 1 && DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.method2065());
        lightCoordRShift = argument_14_;
        Class110.anInt909 = 1 << lightCoordRShift;
        attenuationOffset = Class110.anInt909 >> 1;
        Math.sqrt((double) (attenuationOffset * attenuationOffset + attenuationOffset * attenuationOffset));
        yMapSize = ySize;
        xMapSize = xSize;
        zMapSize = zSize;
        Node_Sub35.anInt4158 = argument_18_;
        Class350_Sub2.aClass75_5451 = Class253_Sub3.method3254(false);
        Class194.method2892(68);
        Class84_Sub1.aClass148ArrayArrayArray4480 = (new Class148[ySize][xMapSize]
                [zMapSize]);
        Statics.aClass_sArray2713 = new Class_s[ySize];
        if (argument_19_) {
            DoublyLinkedNodeP2_Sub10.anIntArrayArray4599 = new int[xMapSize][zMapSize];
            Statics.aByteArrayArray297 = new byte[xMapSize][zMapSize];
            Class62_Sub25.aShortArrayArray4443 = new short[xMapSize][zMapSize];
            Class152.aClass148ArrayArrayArray1151 = (new Class148[1][xMapSize]
                    [zMapSize]);
            Class65.aClass_sArray455 = new Class_s[1];
        } else {
            DoublyLinkedNodeP2_Sub10.anIntArrayArray4599 = null;
            Statics.aByteArrayArray297 = null;
            Class62_Sub25.aShortArrayArray4443 = null;
            Class152.aClass148ArrayArrayArray1151 = null;
            Class65.aClass_sArray455 = null;
        }
        if (argument_20_) {
            virtualLightMap = new long[ySize][xSize][zSize];
            virtualLights = new VirtualLight[65535];
            aBooleanArray3116 = new boolean[65535];
            lightListPointer = 0;
        } else {
            virtualLightMap = null;
            virtualLights = null;
            aBooleanArray3116 = null;
            lightListPointer = 0;
        }
        Class295.method3511(false);
        Node_Sub31_Sub33.aClass104_Sub2Array6004 = new DoublyLinkedNodeP2_Sub2[2];
        InputStream_Sub2.aClass104_Sub2Array36 = new DoublyLinkedNodeP2_Sub2[2];
        Statics.aClass104_Sub2Array851 = new DoublyLinkedNodeP2_Sub2[2];
        Class221.aClass104_Sub2Array1552 = new DoublyLinkedNodeP2_Sub2[10000];
        DoublyLinkedNode_Sub51_Sub3.anInt6229 = 0;
        DoublyLinkedNodeP2_Sub8.aClass104_Sub2Array4584 = new DoublyLinkedNodeP2_Sub2[5000];
        FileOnDisk.anInt1453 = 0;
        DoublyLinkedNodeP2_Sub3.aClass104_Sub2_Sub2Array4522 = new DoublyLinkedNodeP2_Sub2_Sub2[5000];
        Class51.anInt383 = 0;
        Class242.aBooleanArrayArray1757 = (new boolean
                [Node_Sub35.anInt4158 + Node_Sub35.anInt4158 + 1]
                [Node_Sub35.anInt4158 + Node_Sub35.anInt4158 + 1]);
        DoublyLinkedNode_Sub51_Sub15.aBooleanArrayArray6319 = (new boolean
                [Node_Sub35.anInt4158 + Node_Sub35.anInt4158 + 2]
                [Node_Sub35.anInt4158 + Node_Sub35.anInt4158 + 2]);
        Class92.anIntArray709 = new int[Node_Sub35.anInt4158 + Node_Sub35.anInt4158 + 2];
        Class62_Sub20.aClass314_4431 = Class62_Sub20.aClass314_4430;
        if (Node_Sub31_Sub10.aBoolean5882) {
            Class62_Sub22.aBooleanArrayArrayArray4435 = (new boolean[ySize]
                    [Node_Sub35.anInt4158 + Node_Sub35.anInt4158 + 1]
                    [Node_Sub35.anInt4158 + Node_Sub35.anInt4158 + 1]);
            Node_Sub44.aBooleanArrayArrayArray4255 = new boolean[ySize][][];
            if (Node_Sub32_Sub4.aClass380Array6085 != null) Class284.method3454();
            Node_Sub32_Sub4.aClass380Array6085 = new Class380[DoublyLinkedNodeP2_Sub2_Sub3_Sub1.anInt6602];
            DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.method2089(Node_Sub32_Sub4.aClass380Array6085.length + 1);
            DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.assignThread(0);
            for (int anLocalInt = 0; anLocalInt < Node_Sub32_Sub4.aClass380Array6085.length; anLocalInt++) {
                Node_Sub32_Sub4.aClass380Array6085[anLocalInt] = new Class380(anLocalInt + 1, DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834);
                new Thread(Node_Sub32_Sub4.aClass380Array6085[anLocalInt], "wr" + anLocalInt).start();
            }
            int anLocalInt;
            if (DoublyLinkedNodeP2_Sub2_Sub3_Sub1.anInt6602 == 2) {
                anLocalInt = 4;
                Statics.anInt1650 = 2;
            } else if (DoublyLinkedNodeP2_Sub2_Sub3_Sub1.anInt6602 == 3) {
                anLocalInt = 6;
                Statics.anInt1650 = 3;
            } else {
                anLocalInt = 8;
                Statics.anInt1650 = 4;
            }
            Class179_Sub1.aClass130Array5271 = new Class130[anLocalInt];
            for (int anLocalInt_21_ = 0; anLocalInt_21_ < anLocalInt; anLocalInt_21_++)
                Class179_Sub1.aClass130Array5271[anLocalInt_21_] = new Class130(Statics.aStringArrayArray425[DoublyLinkedNodeP2_Sub2_Sub3_Sub1.anInt6602 - 2][anLocalInt_21_]);
        } else Statics.anInt1650 = 1;
        Class62_Sub3.anIntArray4373 = new int[Statics.anInt1650 - 1];
        IOException_Sub1.anIntArray41 = new int[Statics.anInt1650 - 1];
    }

    static void addVirtualLight(VirtualLight light) {
        if (lightListPointer < 65535) {
            HardwareLight hwLight = light.hardwareLight;
            virtualLights[(lightListPointer)] = light;
            aBooleanArray3116[lightListPointer] = false;
            lightListPointer++;
            int minY = light.tileZ;
            if (light.fromGroundToFloor)
                minY = 0;
            int maxY = light.tileZ;
            if (light.fromFloorToMax)
                maxY = yMapSize - 1;
            for (int y = minY; y <= maxY; y++) {
                int shapePtr = 0;
                int minZ = ((hwLight.getZ() - hwLight.getRadius() + attenuationOffset) >> lightCoordRShift);
                if (minZ < 0) {
                    shapePtr -= minZ;
                    minZ = 0;
                }
                int maxZ = ((hwLight.getZ() + hwLight.getRadius() - attenuationOffset) >> lightCoordRShift);
                if (maxZ >= zMapSize)
                    maxZ = zMapSize - 1;
                for (int z = minZ; z <= maxZ; z++) {
                    int shapeV = (light.shape[shapePtr++]);
                    int minX = (((hwLight.getX() - hwLight.getRadius() + attenuationOffset) >> lightCoordRShift) + (shapeV >>> 8));
                    int maxX = minX + (shapeV & 0xff) - 1;
                    if (minX < 0) minX = 0;
                    if (maxX >= xMapSize) maxX = xMapSize - 1;
                    for (int x = minX; x <= maxX; x++) {
                        long oldValue = (virtualLightMap[y][x][z]);
                        if ((oldValue & 0xffffL) == 0L)
                            virtualLightMap[y][x][z] = oldValue |  (long) lightListPointer;
                        else if ((oldValue & 0xffff0000L) == 0L)
                            virtualLightMap[y][x][z] = oldValue | ((long) lightListPointer << 16);
                        else if ((oldValue & 0xffff00000000L) == 0L)
                            virtualLightMap[y][x][z] = oldValue | ((long) lightListPointer << 32);
                        else if ((oldValue & ~0xffffffffffffL) == 0L)
                            virtualLightMap[y][x][z] = oldValue | ((long) lightListPointer << 48);
                    }
                }
            }
        }
    }

    static final void method945() {
	if (Class84_Sub1.aClass148ArrayArrayArray4480 != null) {
	    for (int anLocalInt = 0;
		 anLocalInt < Class84_Sub1.aClass148ArrayArrayArray4480.length;
		 anLocalInt++) {
		for (int anLocalInt_17_ = 0;
		     anLocalInt_17_ < xMapSize;
		     anLocalInt_17_++) {
		    for (int anLocalInt_18_ = 0;
			 anLocalInt_18_ < zMapSize;
			 anLocalInt_18_++) {
			if ((Class84_Sub1.aClass148ArrayArrayArray4480
			     [anLocalInt][anLocalInt_17_][anLocalInt_18_])
			    != null)
			    Class84_Sub1.aClass148ArrayArrayArray4480
				[anLocalInt][anLocalInt_17_][anLocalInt_18_]
				.method2528(29301);
			Class84_Sub1.aClass148ArrayArrayArray4480
			    [anLocalInt][anLocalInt_17_][anLocalInt_18_]
			    = null;
		    }
		}
	    }
	}
	Class84_Sub1.aClass148ArrayArrayArray4480 = null;
	Statics.aClass_sArray2713 = null;
	if (Class152.aClass148ArrayArrayArray1151 != null) {
	    for (int anLocalInt = 0;
		 anLocalInt < Class152.aClass148ArrayArrayArray1151.length;
		 anLocalInt++) {
		for (int anLocalInt_19_ = 0;
		     anLocalInt_19_ < xMapSize;
		     anLocalInt_19_++) {
		    for (int anLocalInt_20_ = 0;
			 anLocalInt_20_ < zMapSize;
			 anLocalInt_20_++) {
			if ((Class152.aClass148ArrayArrayArray1151[anLocalInt]
			     [anLocalInt_19_][anLocalInt_20_])
			    != null)
			    Class152.aClass148ArrayArrayArray1151
				[anLocalInt][anLocalInt_19_][anLocalInt_20_]
				.method2528(29301);
			Class152.aClass148ArrayArrayArray1151[anLocalInt]
			    [anLocalInt_19_][anLocalInt_20_]
			    = null;
		    }
		}
	    }
	}
	Class152.aClass148ArrayArrayArray1151 = null;
	Class65.aClass_sArray455 = null;
	GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676 = null;
	Node_Sub31_Sub5.aClass_sArray5858 = null;
	Class242.aBooleanArrayArray1757 = null;
	DoublyLinkedNode_Sub51_Sub15.aBooleanArrayArray6319 = null;
	Class92.anIntArray709 = null;
	Class62_Sub22.aBooleanArrayArrayArray4435 = null;
	Node_Sub44.aBooleanArrayArrayArray4255 = null;
	Statics.method1703((byte) -98);
	if (DoublyLinkedNodeP2_Sub3.aClass104_Sub2_Sub2Array4522 != null) {
	    for (int anLocalInt = 0; anLocalInt < Class51.anInt383;
		 anLocalInt++)
		DoublyLinkedNodeP2_Sub3.aClass104_Sub2_Sub2Array4522[anLocalInt] = null;
	    Class51.anInt383 = 0;
	}
	Node_Sub31_Sub33.aClass104_Sub2Array6004 = null;
	InputStream_Sub2.aClass104_Sub2Array36 = null;
	Statics.aClass104_Sub2Array851 = null;
	if (Class221.aClass104_Sub2Array1552 != null) {
	    for (int anLocalInt = 0;
		 anLocalInt < Class221.aClass104_Sub2Array1552.length;
		 anLocalInt++)
		Class221.aClass104_Sub2Array1552[anLocalInt] = null;
	    DoublyLinkedNode_Sub51_Sub3.anInt6229 = 0;
	}
	if (DoublyLinkedNodeP2_Sub8.aClass104_Sub2Array4584 != null) {
	    for (int anLocalInt = 0;
		 anLocalInt < DoublyLinkedNodeP2_Sub8.aClass104_Sub2Array4584.length;
		 anLocalInt++)
		DoublyLinkedNodeP2_Sub8.aClass104_Sub2Array4584[anLocalInt] = null;
	    FileOnDisk.anInt1453 = 0;
	}
	if (virtualLights != null) {
	    for (int anLocalInt = 0;
		 anLocalInt < lightListPointer; anLocalInt++)
		virtualLights[anLocalInt] = null;
	    for (int anLocalInt = 0; anLocalInt < yMapSize;
		 anLocalInt++) {
		for (int anLocalInt_21_ = 0;
		     anLocalInt_21_ < xMapSize;
		     anLocalInt_21_++) {
		    for (int anLocalInt_22_ = 0;
			 anLocalInt_22_ < zMapSize;
			 anLocalInt_22_++)
			virtualLightMap[anLocalInt]
			    [anLocalInt_21_][anLocalInt_22_]
			    = 0L;
		}
	    }
	    lightListPointer = 0;
	}
	Node_Sub37_Sub3.method1063(-72);
	Class62_Sub20.aClass314_4431 = Class62_Sub20.aClass314_4430;
	Class62_Sub20.aClass314_4431.method3628(0);
	Statics.aByteArrayArray297 = null;
	DoublyLinkedNodeP2_Sub10.anIntArrayArray4599 = null;
	Class62_Sub25.aShortArrayArray4443 = null;
	if (Node_Sub32_Sub4.aClass380Array6085 != null) {
	    Class284.method3454();
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.method2089(1);
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.assignThread(0);
	}
	if (Class179_Sub1.aClass130Array5271 != null)
	    Class179_Sub1.aClass130Array5271 = null;
	DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834 = null;
    }
}
