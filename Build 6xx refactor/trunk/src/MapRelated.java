/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 8/2/11
 * Time: 2:17 PM
 * To change this template use File | Ssettings | File Templates.
 */
public class MapRelated {
    static Js5Store mapStore;
    static int[] mapFileMId;
    static int[] mapFileLId;
    static int[] underworldMId;
    static int[] underworldLId;
    static int[] mapCoordinates;
    static int[][][] mapGenerationArray;
    static int mapWidth = 104;
    static int mapDepth = 104;
    static byte[][] underworldLData;
    static byte[][] mapFileNData;
    static byte[][] mapFileLData;
    static byte[][] underworldMData;
    static byte[][] mapFileMData;
    static int[] mapFileNId;
    static int regionX;
    static int regionZ;
    static int baseX;
    static int baseZ;
    static int missingFileCount = 0;
    static int[][] mapKeys;
    static int missingFileType = 0;
    static int anInt5582;
    static ClipMap[] clippingMaps = new ClipMap[4];

    static void initializeRegion() {
        Class293.method3500((byte) -74, false);
        missingFileCount = 0;
        boolean complete = true;
        for (int mapPtr = 0; mapFileMData.length > mapPtr; mapPtr++) {
            if (mapFileMId[mapPtr] != -1 && (mapFileMData[mapPtr] == null)) {
                mapFileMData[mapPtr] = mapStore.getData((mapFileMId[mapPtr]), 0);
                if (mapFileMData[mapPtr] == null) {
                    missingFileCount++;
                    complete = false;
                }
            }
            if (mapFileLId[mapPtr] != -1 && (mapFileLData[mapPtr]) == null) {
                mapFileLData[mapPtr] = (mapStore.getData(mapFileLId[mapPtr], 0, mapKeys[mapPtr]));
                if ((mapFileLData[mapPtr]) == null) {
                    complete = false;
                    missingFileCount++;
                }
            }
            if (underworldMId[mapPtr] != -1 && (underworldMData[mapPtr] == null)) {
                underworldMData[mapPtr] = mapStore.getData(underworldMId[mapPtr], 0);
                if (underworldMData[mapPtr] == null) {
                    missingFileCount++;
                    complete = false;
                }
            }
            if (underworldLId[mapPtr] != -1 && underworldLData[mapPtr] == null) {
                underworldLData[mapPtr] = mapStore.getData((underworldLId[mapPtr]), 0);
                if (underworldLData[mapPtr] == null) {
                    complete = false;
                    missingFileCount++;
                }
            }
            if (mapFileNId != null && mapFileNData[mapPtr] == null && mapFileNId[mapPtr] != -1) {
                mapFileNData[mapPtr] = (mapStore.getData(mapFileNId[mapPtr], 0, mapKeys[mapPtr]));
                if (mapFileNData[mapPtr] == null) {
                    missingFileCount++;
                    complete = false;
                }
            }
        }
        if (Class303.aClass114_2567 == null) {
            if (Class341.aClass59_Sub51_Sub13_2883 != null && (Class147.aJs5Store_1116.fileExists((Class341.aClass59_Sub51_Sub13_2883.aString6291) + "_staticelements"))) {
                if (!Class147.aJs5Store_1116.isLoaded((Class341.aClass59_Sub51_Sub13_2883.aString6291 + "_staticelements"))) {
                    missingFileCount++;
                    complete = false;
                } else
                    Class303.aClass114_2567 = (Statics.method1285((Class341.aClass59_Sub51_Sub13_2883.aString6291 + "_staticelements"), Class147.aJs5Store_1116, -109, Statics.aBoolean5559));
            } else
                Class303.aClass114_2567 = new Class114(0);
        }
        if (!complete)
            missingFileType = 1;
        else {
            Class164.anInt1199 = 0;
            complete = true;
            for (int mapPtr = 0; (mapPtr < mapFileMData.length); mapPtr++) {
                byte[] data = (mapFileLData[mapPtr]);
                if (data != null) {
                    int mapLocalX = ((mapCoordinates[mapPtr] >> 8) * 64 - baseX);
                    int mapLocalZ = ((mapCoordinates[mapPtr] & 0xff) * 64 - baseZ);
                    if (anInt5582 != 0) {
                        mapLocalX = 10;
                        mapLocalZ = 10;
                    }
                    complete &= MapRegion.checkObjectsLoaded(data, mapLocalX, mapWidth, mapDepth, mapLocalZ, 0);
                }
                data = underworldLData[mapPtr];
                if (data != null) {
                    int mapLocalX = ((mapCoordinates[mapPtr] >> 8) * 64 - baseX);
                    int mapLocalZ = ((mapCoordinates[mapPtr] & 0xff) * 64 - baseZ);
                    if (anInt5582 != 0) {
                        mapLocalX = 10;
                        mapLocalZ = 10;
                    }
                    complete &= MapRegion.checkObjectsLoaded(data, mapLocalX, mapWidth, mapDepth, mapLocalZ, 0);
                }
            }
            if (!complete)
                missingFileType = 2;
            else {
                if (missingFileType != 0)
                    Class62_Sub10.method1395(Node_Sub47_Sub9.aAbstractFont_6203, Class389.aGraphicsToolkit3281, Statics.aClass76_3433, true, -99, (MultilanguageString.LOADING_PLEASE_WAIT.getLocalizedString(client.language) + "<br>(100%)"));
                Class47.method453((byte) -40);
                Class241.method3151((byte) -99);
                Class373.method4076((byte) 9);
                boolean hasUnderworld = false;
                if (Class389.aGraphicsToolkit3281.method2075() && AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub20_4334.method1435(29) == 2) {
                    for (int mapPtr = 0; mapPtr < (mapFileMData).length; mapPtr++) {
                        if (underworldLData[mapPtr] != null || (underworldMData[mapPtr]) != null) {
                            hasUnderworld = true;
                            break;
                        }
                    }
                }
                int anLocalInt;
                if (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub13_4329.method1405(88) == 1)
                    anLocalInt = Class42.anIntArray3540[Class6.anInt70];
                else
                    anLocalInt = Node_Sub32_Sub4.anIntArray6091[Class6.anInt70];
                if (Class389.aGraphicsToolkit3281.method2081())
                    anLocalInt++;
                LightingManager.method4082(Class389.aGraphicsToolkit3281, Class365.anInt3079, 9, 4, mapWidth, mapDepth, anLocalInt, hasUnderworld, Class389.aGraphicsToolkit3281.method2016() > 0);
                DoublyLinkedNode_Sub51_Sub18.method1292(Class253_Sub1.anInt5666);
                if (Class253_Sub1.anInt5666 == 0)
                    Class125.method2403(null);
                else
                    Class125.method2403(Class226.aAbstractFont_1641);
                for (int anLocalInt_14_ = 0; anLocalInt_14_ < 4; anLocalInt_14_++)
                    clippingMaps[anLocalInt_14_].method3138(2097152);
                Class8.method238(6812);
                DoublyLinkedNodeP2_Sub3.method1899(false, -41);
                AthmosphericConditions.initializeArray();
                Class_s.aClass195_2551 = null;
                Class363.aBoolean3068 = false;
                Class47.method453((byte) -73);
                System.gc();
                Class293.method3500((byte) -113, true);
                Class62_Sub26.method1459(-1);
                Node_Sub44.anInt4252 = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub8_4331.method1388(49);
                Node_Sub16.aBoolean3997 = ClanSettingsDelta.anInt1544 >= 96;
                Class50.aBoolean373 = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub20_4334.method1435(122) == 2;
                Class305.aBoolean3641 = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub16_4308.method1421(35) == 1;
                Class2_Sub6.anInt3790 = (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub25_4332.method1458(95) == 1 ? -1 : Statics.anInt136);
                Class374.aBoolean3210 = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub3_4318.method1365(37) == 1;
                tia_sub_35DoublyLinked.aBoolean6253 = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub19_4323.method1432(12) == 1;
                Class130.aClass303_Sub1_1055 = new Class303_Sub1(4, mapWidth, mapDepth, false);
                if (anInt5582 == 0)
                    loadTerrainMaps((mapFileMData), Class130.aClass303_Sub1_1055);
                else
                    GraphicsToolkit_Sub2.method2204((mapFileMData), Class130.aClass303_Sub1_1055, (byte) -91);
                AthmosphericConditions.loadSunPosition(mapDepth >> 4, mapWidth >> 4);
                DoublyLinkedNodeP2_Sub8.method1938(1204339692);
                if (hasUnderworld) {
                    Class295.method3511(true);
                    DoublyLinkedNode_Sub51_Sub18.aClass303_Sub1_6344 = new Class303_Sub1(1, mapWidth, mapDepth, true);
                    if (anInt5582 == 0) {
                        loadTerrainMaps((underworldMData), (DoublyLinkedNode_Sub51_Sub18.aClass303_Sub1_6344));
                        Class293.method3500((byte) -46, true);
                    } else {
                        GraphicsToolkit_Sub2.method2204((underworldMData), (DoublyLinkedNode_Sub51_Sub18.aClass303_Sub1_6344), (byte) -91);
                        Class293.method3500((byte) -99, true);
                    }
                    DoublyLinkedNode_Sub51_Sub18.aClass303_Sub1_6344.method3573(0, (Class130.aClass303_Sub1_1055.heightMap[0]), -121);
                    DoublyLinkedNode_Sub51_Sub18.aClass303_Sub1_6344.method3568(null, null, -14360, Class389.aGraphicsToolkit3281);
                    Class295.method3511(false);
                }
                Class130.aClass303_Sub1_1055.method3568(clippingMaps, (hasUnderworld ? (DoublyLinkedNode_Sub51_Sub18.aClass303_Sub1_6344.heightMap) : null), -14360, Class389.aGraphicsToolkit3281);
                if (anInt5582 == 0) {
                    Class293.method3500((byte) -69, true);
                    loadObjectMaps(Class130.aClass303_Sub1_1055, (mapFileLData));
                    if (mapFileNData != null)
                        Statics.method1502(1);
                } else {
                    Class293.method3500((byte) -54, true);
                    loadGeneratedObjectMap(Class130.aClass303_Sub1_1055, (mapFileLData));
                }
                Class241.method3151((byte) -111);
                if (ClanSettingsDelta.anInt1544 < 96)
                    Class317.method3639(-70);
                Class293.method3500((byte) -119, true);
                Class130.aClass303_Sub1_1055.method3567(!hasUnderworld ? null : Class65.aClass_sArray455[0], null, 121, Class389.aGraphicsToolkit3281);
                Class130.aClass303_Sub1_1055.method3578(false, Class389.aGraphicsToolkit3281, (byte) 112);
                Class293.method3500((byte) -95, true);
                if (hasUnderworld) {
                    Class295.method3511(true);
                    Class293.method3500((byte) -113, true);
                    if (anInt5582 == 0)
                        loadObjectMaps((DoublyLinkedNode_Sub51_Sub18.aClass303_Sub1_6344), underworldLData);
                    else
                        loadGeneratedObjectMap((DoublyLinkedNode_Sub51_Sub18.aClass303_Sub1_6344), underworldLData);
                    Class241.method3151((byte) -118);
                    Class293.method3500((byte) -20, true);
                    DoublyLinkedNode_Sub51_Sub18.aClass303_Sub1_6344.method3567(null, Statics.aClass_sArray2713[0], 119, Class389.aGraphicsToolkit3281);
                    DoublyLinkedNode_Sub51_Sub18.aClass303_Sub1_6344.method3578(true, Class389.aGraphicsToolkit3281, (byte) 106);
                    Class293.method3500((byte) -102, true);
                    Class295.method3511(false);
                }
                Class182.method2845(-201);
                int anLocalInt_15_ = Class130.aClass303_Sub1_1055.anInt5407;
                if (anLocalInt_15_ > Class176.anInt1308)
                    anLocalInt_15_ = Class176.anInt1308;
                if (Class176.anInt1308 - 1 > anLocalInt_15_)
                    anLocalInt_15_ = Class176.anInt1308 - 1;
                if (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub25_4332.method1458(28) == 0)
                    Statics.method1768(anLocalInt_15_);
                else
                    Statics.method1768(0);
                for (int anLocalInt_16_ = 0; anLocalInt_16_ < 4; anLocalInt_16_++) {
                    for (int anLocalInt_17_ = 0; anLocalInt_17_ < mapWidth; anLocalInt_17_++) {
                        for (int anLocalInt_18_ = 0; anLocalInt_18_ < mapDepth; anLocalInt_18_++)
                            DoublyLinkedNode_Sub51_Sub8.method1229(124, anLocalInt_18_, anLocalInt_16_, anLocalInt_17_);
                    }
                }
                Node_Sub31_Sub1.method875(-4);
                Class47.method453((byte) -98);
                DoublyLinkedNodeP2_Sub2_Sub3_Sub2.method1877(-116);
                Class241.method3151((byte) 53);
                AthmosphericConditions.applyFog();
                if (Applet_Sub1.gameFrame != null && Statics.aClass307_2632 != null && Statics.anInt1652 == 11) {
                    Node_Sub29 class59_sub29 = Class91.method1683((byte) 87, (Node_Sub31_Sub16.aClass372_5910), JagexHash.aClass207_1673);
                    class59_sub29.aClass59_Sub28_Sub1_4129.p4(1057001181);
                    Class251.method3243(class59_sub29, true);
                }
                if (anInt5582 == 0) {
                    int anLocalInt_19_ = ((-(mapWidth >> 4) + regionX) / 8);
                    int anLocalInt_20_ = ((regionX + (mapWidth >> 4)) / 8);
                    int anLocalInt_21_ = ((regionZ - (mapDepth >> 4)) / 8);
                    int anLocalInt_22_ = (((mapDepth >> 4) + regionZ) / 8);
                    for (int x = anLocalInt_19_ - 1; x <= anLocalInt_20_ + 1; x++) {
                        for (int z = anLocalInt_21_ - 1; z <= anLocalInt_22_ + 1; z++) {
                            if (anLocalInt_19_ > x || anLocalInt_20_ < x || z < anLocalInt_21_ || anLocalInt_22_ < z) {
                                mapStore.request(("m" + x + "_" + z));
                                mapStore.request(("l" + x + "_" + z));
                            }
                        }
                    }
                }
                if (Statics.anInt1652 != 4) {
                    if (Statics.anInt1652 != 8) {
                        Class316.method3638(10, 2);
                        if (Statics.aClass307_2632 != null) {
                            Node_Sub29 class59_sub29 = Class91.method1683((byte) 36, (Node_Sub31_Sub16.aClass372_5910), Class117.aClass207_961);
                            Class251.method3243(class59_sub29, true);
                        }
                    } else
                        Class316.method3638(7, 2);
                } else
                    Class316.method3638(3, 2);
                Statics.method1800(-80);
                Class47.method453((byte) -69);
                Class120.method2384(-33);
                Class18.aBoolean124 = true;
                if (GlTexture_Sub3.aBoolean5568) {
                    Statics.method2425((byte) -109, ("Took: " + (Applet_Sub1.getGameTime() - Class62_Sub6.aLong4386) + "ms"));
                    GlTexture_Sub3.aBoolean5568 = false;
                }
            }
        }
    }

    static void readMapGenerationPacket() {
        int anLocalInt = Network.stream.g1p128();
        int anLocalInt_3_ = Network.stream.g2m128();
        boolean anLocalBoolean = Network.stream.g1_128p() == 1;
        anInt5582 = Network.stream.g1_128p();
        int anLocalInt_4_ = Network.stream.g2ip128();
        Class158.method2595((byte) -31);
        method3942(598809411, anLocalInt);
        Network.stream.method847(false);
        for (int anLocalInt_5_ = 0; anLocalInt_5_ < 4; anLocalInt_5_++) {
            for (int anLocalInt_6_ = 0; mapWidth >> 3 > anLocalInt_6_; anLocalInt_6_++) {
                for (int anLocalInt_7_ = 0; anLocalInt_7_ < mapDepth >> 3; anLocalInt_7_++) {
                    int anLocalInt_8_ = Network.stream.method850(-1, 1);
                    if (anLocalInt_8_ != 1)
                        mapGenerationArray[anLocalInt_5_][anLocalInt_6_][anLocalInt_7_] = -1;
                    else
                        mapGenerationArray[anLocalInt_5_][anLocalInt_6_][anLocalInt_7_] = Network.stream.method850(-1, 26);
                }
            }
        }
        Network.stream.method841(-69);
        int mapPtr = ((-Network.stream.pos + Network.anInt4454) / 16);
        mapKeys = new int[mapPtr][4];
        for (int anLocalInt_10_ = 0; anLocalInt_10_ < mapPtr; anLocalInt_10_++) {
            for (int anLocalInt_11_ = 0; anLocalInt_11_ < 4; anLocalInt_11_++)
                mapKeys[anLocalInt_10_][anLocalInt_11_] = Network.stream.g4();
        }
        mapFileMData = new byte[mapPtr][];
        mapFileNId = null;
        underworldMId = new int[mapPtr];
        underworldLData = new byte[mapPtr][];
        mapFileMId = new int[mapPtr];
        mapFileNData = null;
        mapFileLData = new byte[mapPtr][];
        mapFileLId = new int[mapPtr];
        underworldMData = new byte[mapPtr][];
        underworldLId = new int[mapPtr];
        mapCoordinates = new int[mapPtr];
        mapPtr = 0;
        for (int mapBlockY = 0; mapBlockY < 4; mapBlockY++) {
            for (int mapBlockX = 0; mapBlockX < mapWidth >> 3; mapBlockX++) {
                for (int mapBlockZ = 0; mapBlockZ < mapDepth >> 3; mapBlockZ++) {
                    int mapBlockData = (mapGenerationArray[mapBlockY][mapBlockX][mapBlockZ]);
                    if (mapBlockData != -1) {
                        int targetBlockX = (mapBlockData & 0xffd1f3) >> 14;
                        int targetBlockZ = (mapBlockData & 0x3fff) >> 3;
                        int mapHash = (targetBlockX / 8 << 8) + targetBlockZ / 8;
                        for (int mapPtr2 = 0; mapPtr2 < mapPtr; mapPtr2++) {
                            if (mapHash == mapCoordinates[mapPtr2]) {
                                mapHash = -1;
                                break;
                            }
                        }
                        if (mapHash != -1) {
                            mapCoordinates[mapPtr] = mapHash;
                            int x = mapHash >> 8 & 0xff;
                            int z = mapHash & 0xff;
                            mapFileMId[mapPtr] = (mapStore.getID(("m" + x + "_" + z)));
                            mapFileLId[mapPtr] = (mapStore.getID(("l" + x + "_" + z)));
                            underworldMId[mapPtr] = (mapStore.getID(("um" + x + "_" + z)));
                            underworldLId[mapPtr] = (mapStore.getID(("ul" + x + "_" + z)));
                            mapPtr++;
                        }
                    }
                }
            }
        }
        updateCoordinates(anLocalInt_4_, anLocalBoolean, anLocalInt_3_, 11);
    }

    static void loadMapForLogin() {
        method3942(598809411, AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub5_4314.method1371(17));
        int mapBaseX = (baseX >> 3) + (Class287.anInt2299 >> 12);
        int mapBaseZ = (baseZ >> 3) + (Node_Sub31_Sub30.anInt5987 >> 12);
        Class176.anInt1308 = ((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).lightingHL = (byte) 0;
        Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.method1865(8, 8, false);
        int mapPtr = 18;
        mapFileNId = new int[mapPtr];
        mapKeys = new int[mapPtr][4];
        underworldMData = new byte[mapPtr][];
        mapFileLData = new byte[mapPtr][];
        mapCoordinates = new int[mapPtr];
        mapFileLId = new int[mapPtr];
        underworldLData = new byte[mapPtr][];
        underworldLId = new int[mapPtr];
        mapFileMData = new byte[mapPtr][];
        mapFileNData = new byte[mapPtr][];
        mapFileMId = new int[mapPtr];
        underworldMId = new int[mapPtr];
        mapPtr = 0;
        for (int x = (mapBaseX - (mapWidth >> 4)) / 8; (mapBaseX + (mapWidth >> 4)) / 8 >= x; x++) {
            for (int z = ((mapBaseZ - (mapDepth >> 4)) / 8); z <= (mapBaseZ + (mapDepth >> 4)) / 8; z++) {
                int mapHash = z + (x << 8);
                mapCoordinates[mapPtr] = mapHash;
                mapFileMId[mapPtr] = mapStore.getID(("m" + x + "_" + z));
                mapFileLId[mapPtr] = mapStore.getID(("l" + x + "_" + z));
                mapFileNId[mapPtr] = mapStore.getID(("n" + x + "_" + z));
                underworldMId[mapPtr] = mapStore.getID(("um" + x + "_" + z));
                underworldLId[mapPtr] = mapStore.getID(("ul" + x + "_" + z));
                if (mapFileNId[mapPtr] == -1) {
                    mapFileMId[mapPtr] = -1;
                    mapFileLId[mapPtr] = -1;
                    underworldMId[mapPtr] = -1;
                    underworldLId[mapPtr] = -1;
                }
                mapPtr++;
            }
        }
        for (int anLocalInt_5_ = mapPtr; mapFileNId.length > anLocalInt_5_; anLocalInt_5_++) {
            mapFileNId[anLocalInt_5_] = -1;
            mapFileMId[anLocalInt_5_] = -1;
            mapFileLId[anLocalInt_5_] = -1;
            underworldMId[anLocalInt_5_] = -1;
            underworldLId[anLocalInt_5_] = -1;
        }
        int anLocalInt_6_;
        if (Statics.anInt1652 == 3)
            anLocalInt_6_ = 4;
        else
            anLocalInt_6_ = 8;
        updateCoordinates(mapBaseX, false, mapBaseZ, anLocalInt_6_);
    }

    static void readRegionPacket() {
        anInt5582 = 0;
        int mapBaseX = Network.stream.g2m128();
        int anLocalInt_0_ = Network.stream.g1n();
        boolean anLocalBoolean = (Network.stream.g1() == 1);
        int mapBaseZ = Network.stream.g2i();
        Class158.method2595((byte) -31);
        method3942(598809411, anLocalInt_0_);
        int mapPtr = ((Network.anInt4454 - Network.stream.pos) / 16);
        mapKeys = new int[mapPtr][4];
        for (int anLocalInt_3_ = 0; mapPtr > anLocalInt_3_; anLocalInt_3_++) {
            for (int anLocalInt_4_ = 0; anLocalInt_4_ < 4; anLocalInt_4_++)
                mapKeys[anLocalInt_3_][anLocalInt_4_] = (Network.stream.g4());
        }
        mapFileNData = null;
        mapFileNId = null;
        underworldMId = new int[mapPtr];
        underworldLId = new int[mapPtr];
        mapFileLId = new int[mapPtr];
        underworldMData = new byte[mapPtr][];
        mapFileLData = new byte[mapPtr][];
        mapFileMData = new byte[mapPtr][];
        mapCoordinates = new int[mapPtr];
        mapFileMId = new int[mapPtr];
        underworldLData = new byte[mapPtr][];
        mapPtr = 0;
        for (int x = (mapBaseX - (mapWidth >> 4)) / 8; x <= ((mapWidth >> 4) + mapBaseX) / 8; x++) {
            for (int z = (-(mapDepth >> 4) + mapBaseZ) / 8; (((mapDepth >> 4) + mapBaseZ) / 8 >= z); z++) {
                mapCoordinates[mapPtr] = (x << 8) + z;
                mapFileMId[mapPtr] = mapStore.getID(("m" + x + "_" + z));
                mapFileLId[mapPtr] = mapStore.getID(("l" + x + "_" + z));
                underworldMId[mapPtr] = mapStore.getID(("um" + x + "_" + z));
                underworldLId[mapPtr] = mapStore.getID(("ul" + x + "_" + z));
                mapPtr++;
            }
        }
        updateCoordinates(mapBaseX, anLocalBoolean, mapBaseZ, 11);
    }

    static void updateCoordinates(int mapBaseX, boolean forceReload, int mapBaseZ, int argument_2_) {
        if (forceReload || mapBaseX != regionX || mapBaseZ != regionZ || (Statics.anInt136 != Class176.anInt1308 && AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub25_4332.method1458(126) != 1)) {
            regionZ = mapBaseZ;
            Statics.anInt136 = Class176.anInt1308;
            regionX = mapBaseX;
            if (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub25_4332.method1458(17) == 1)
                Statics.anInt136 = 0;
            Class316.method3638(argument_2_, 2);
            Class62_Sub10.method1395(Node_Sub47_Sub9.aAbstractFont_6203, Class389.aGraphicsToolkit3281, Statics.aClass76_3433, true, -122, MultilanguageString.LOADING_PLEASE_WAIT.getLocalizedString(client.language));
            int oldBaseX = baseX;
            int oldBaseZ = baseZ;
            baseX = (regionX - (mapWidth >> 4)) * 8;
            baseZ = (regionZ - (mapDepth >> 4)) * 8;
            Class341.aClass59_Sub51_Sub13_2883 = Class179.method2800(regionX * 8, regionZ * 8);
            Class303.aClass114_2567 = null;
            int deltaBaseX = baseX - oldBaseX;
            int deltaBaseZ = baseZ - oldBaseZ;
            if (argument_2_ == 11) {
                for (int anLocalInt_7_ = 0; Statics.anInt5573 > anLocalInt_7_; anLocalInt_7_++) {
                    Node_Sub35 class59_sub35 = (Node_Sub31_Sub13.aClass59_Sub35Array5900[anLocalInt_7_]);
                    if (class59_sub35 != null) {
                        DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1 = (class59_sub35.aClass104_Sub2_Sub2_Sub5_Sub1_4157);
                        for (int anLocalInt_8_ = 0; anLocalInt_8_ < 10; anLocalInt_8_++) {
                            ((Entity) class104_sub2_sub2_sub5_sub1).pathX[anLocalInt_8_] -= deltaBaseX;
                            ((Entity) class104_sub2_sub2_sub5_sub1).pathZ[anLocalInt_8_] -= deltaBaseZ;
                        }
                        ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub1).worldZ -= deltaBaseZ * 512;
                        ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub1).worldX -= deltaBaseX * 512;
                    }
                }
            } else {
                dba_sub_772_Sub2.anInt6369 = 0;
                boolean anLocalBoolean = false;
                int anLocalInt_9_ = (mapWidth - 1) * 512;
                int anLocalInt_10_ = (mapDepth - 1) * 512;
                for (int anLocalInt_11_ = 0; Statics.anInt5573 > anLocalInt_11_; anLocalInt_11_++) {
                    Node_Sub35 class59_sub35 = (Node_Sub31_Sub13.aClass59_Sub35Array5900[anLocalInt_11_]);
                    if (class59_sub35 != null) {
                        DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1 = (class59_sub35.aClass104_Sub2_Sub2_Sub5_Sub1_4157);
                        ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub1).worldZ -= deltaBaseZ * 512;
                        ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub1).worldX -= deltaBaseX * 512;
                        if ((class104_sub2_sub2_sub5_sub1.worldX) >= 0 && (class104_sub2_sub2_sub5_sub1.worldX) <= anLocalInt_9_ && (class104_sub2_sub2_sub5_sub1.worldZ) >= 0 && (anLocalInt_10_ >= class104_sub2_sub2_sub5_sub1.worldZ)) {
                            boolean anLocalBoolean_12_ = true;
                            for (int anLocalInt_13_ = 0; anLocalInt_13_ < 10; anLocalInt_13_++) {
                                ((Entity) class104_sub2_sub2_sub5_sub1).pathX[anLocalInt_13_] -= deltaBaseX;
                                ((Entity) class104_sub2_sub2_sub5_sub1).pathZ[anLocalInt_13_] -= deltaBaseZ;
                                if ((class104_sub2_sub2_sub5_sub1.pathX[anLocalInt_13_]) < 0 || (mapWidth <= (class104_sub2_sub2_sub5_sub1.pathX[anLocalInt_13_])) || (class104_sub2_sub2_sub5_sub1.pathZ[anLocalInt_13_]) < 0 || ((class104_sub2_sub2_sub5_sub1.pathZ[anLocalInt_13_]) >= mapDepth))
                                    anLocalBoolean_12_ = false;
                            }
                            if (anLocalBoolean_12_)
                                DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616[dba_sub_772_Sub2.anInt6369++] = class104_sub2_sub2_sub5_sub1.anInt6745;
                            else {
                                class104_sub2_sub2_sub5_sub1.method1851(null, false);
                                anLocalBoolean = true;
                                class59_sub35.unlink();
                            }
                        } else {
                            class104_sub2_sub2_sub5_sub1.method1851(null, false);
                            anLocalBoolean = true;
                            class59_sub35.unlink();
                        }
                    }
                }
                if (anLocalBoolean) {
                    Statics.anInt5573 = Class294.aJagexHashMap_2453.count();
                    Class294.aJagexHashMap_2453.method1520(0, Node_Sub31_Sub13.aClass59_Sub35Array5900);
                }
            }
            for (int anLocalInt_14_ = 0; anLocalInt_14_ < 2048; anLocalInt_14_++) {
                DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2 = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[anLocalInt_14_]);
                if (class104_sub2_sub2_sub5_sub2 != null) {
                    for (int anLocalInt_15_ = 0; anLocalInt_15_ < 10; anLocalInt_15_++) {
                        ((Entity) class104_sub2_sub2_sub5_sub2).pathX[anLocalInt_15_] -= deltaBaseX;
                        ((Entity) class104_sub2_sub2_sub5_sub2).pathZ[anLocalInt_15_] -= deltaBaseZ;
                    }
                    ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).worldX -= deltaBaseX * 512;
                    ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).worldZ -= deltaBaseZ * 512;
                }
            }
            Class124[] class124s = Class166.aClass124Array1216;
            for (int anLocalInt_16_ = 0; anLocalInt_16_ < class124s.length; anLocalInt_16_++) {
                Class124 class124 = class124s[anLocalInt_16_];
                if (class124 != null) {
                    class124.anInt1010 -= deltaBaseX * 512;
                    class124.anInt1006 -= deltaBaseZ * 512;
                }
            }
            for (Node_Sub2 class59_sub2 = ((Node_Sub2) Statics.aCyclicLinkedList_3722.getFirst()); class59_sub2 != null; class59_sub2 = (Node_Sub2) Statics.aCyclicLinkedList_3722.getNext()) {
                class59_sub2.anInt3882 -= deltaBaseZ;
                class59_sub2.anInt3883 -= deltaBaseX;
                if (anInt5582 != 4 && (class59_sub2.anInt3883 < 0 || class59_sub2.anInt3882 < 0 || (class59_sub2.anInt3883 >= mapWidth) || (class59_sub2.anInt3882 >= mapDepth)))
                    class59_sub2.unlink();
            }
            for (Node_Sub2 class59_sub2 = ((Node_Sub2) Class88.aCyclicLinkedList_643.getFirst()); class59_sub2 != null; class59_sub2 = (Node_Sub2) Class88.aCyclicLinkedList_643.getNext()) {
                class59_sub2.anInt3883 -= deltaBaseX;
                class59_sub2.anInt3882 -= deltaBaseZ;
                if (anInt5582 != 4 && (class59_sub2.anInt3883 < 0 || class59_sub2.anInt3882 < 0 || (mapWidth <= class59_sub2.anInt3883) || (mapDepth <= class59_sub2.anInt3882)))
                    class59_sub2.unlink();
            }
            if (anInt5582 != 4) {
                for (Node_Sub15 class59_sub15 = ((Node_Sub15) tia_sub_35_Sub1DoublyLinked.aJagexHashMap_6658.first(0)); class59_sub15 != null; class59_sub15 = (Node_Sub15) tia_sub_35_Sub1DoublyLinked.aJagexHashMap_6658.next()) {
                    int anLocalInt_17_ = (int) (class59_sub15.hash & 0x3fffL);
                    int anLocalInt_18_ = -baseX + anLocalInt_17_;
                    int anLocalInt_19_ = (int) (class59_sub15.hash >> 14 & 0x3fffL);
                    int anLocalInt_20_ = anLocalInt_19_ - baseZ;
                    if (anLocalInt_18_ < 0 || anLocalInt_20_ < 0 || anLocalInt_18_ >= mapWidth || mapDepth <= anLocalInt_20_)
                        class59_sub15.unlink();
                }
            }
            if (Class382.anInt3242 != 0) {
                ModeWhatEnum.anInt2310 -= deltaBaseZ;
                Class382.anInt3242 -= deltaBaseX;
            }
            Node_Sub31_Sub12.method912(0);
            if (argument_2_ != 11) {
                InputStream_Sub2.anInt38 -= deltaBaseZ;
                Class287.anInt2299 -= deltaBaseX * 512;
                Class311.anInt2591 -= deltaBaseX;
                Node_Sub31_Sub30.anInt5987 -= deltaBaseZ * 512;
                Class120.anInt980 -= deltaBaseX;
                Class298.anInt2475 -= deltaBaseZ;
                if (Math.abs(deltaBaseX) > mapWidth || Math.abs(deltaBaseZ) > mapDepth)
                    Class120.method2385((byte) 53);
            } else if (Statics.anInt1745 == 4) {
                Class61.anInt437 -= deltaBaseZ * 512;
                tia_sub_35_Sub2DoublyLinked.anInt6665 -= deltaBaseX * 512;
                Statics.anInt1411 -= deltaBaseZ * 512;
                Class167.anInt1224 -= deltaBaseX * 512;
            } else {
                Statics.anInt1745 = 1;
                DoublyLinkedNodeP2_Sub2_Sub4_Sub1.anInt6573 = Class85.anInt607 = -1;
            }
            Class353_Sub2.method3898(104);
            Class371.method4047(-61);
            Class305.aCyclicLinkedList_3640.clear();
            Node_Sub31_Sub3.aCyclicLinkedList_5850.clear();
            Node_Sub49.aClass366_4290.method3990(0);
            Node_Sub9_Sub5.method677((byte) 50);
        }
    }

    static void loadObjectMaps(Class303_Sub1 argument, byte[][] mapFileData) {
        int mapCount = mapFileMData.length;
        for (int mapPtr = 0; mapPtr < mapCount; mapPtr++) {
            byte[] data = mapFileData[mapPtr];
            if (data != null) {
                int mapLocalX = ((mapCoordinates[mapPtr] >> 8) * 64 - baseX);
                int mapLocalZ = ((mapCoordinates[mapPtr] & 0xff) * 64 - baseZ);
                Class47.method453((byte) -37);
                argument.loadObjectMap(Class389.aGraphicsToolkit3281, mapLocalX, (byte) -62, clippingMaps, data, mapLocalZ);
            }
        }
    }

    static void loadGeneratedObjectMap(Class303_Sub1 argument, byte[][] mapFileDat) {
        for (int anLocalInt = 0; anLocalInt < argument.mapHeight; anLocalInt++) {
            Class47.method453((byte) -62);
            for (int anLocalInt_18_ = 0; anLocalInt_18_ < mapWidth >> 3; anLocalInt_18_++) {
                for (int anLocalInt_19_ = 0; mapDepth >> 3 > anLocalInt_19_; anLocalInt_19_++) {
                    int mapGenValue = (mapGenerationArray[anLocalInt][anLocalInt_18_][anLocalInt_19_]);
                    if (mapGenValue != -1) {
                        int anLocalInt_21_ = mapGenValue >> 24 & 0x3;
                        if (!argument.aBoolean2561 || anLocalInt_21_ == 0) {
                            int anLocalInt_22_ = mapGenValue >> 1 & 0x3;
                            int targetBlockX = (mapGenValue & 0xffe167) >> 14;
                            int targetBlockZ = mapGenValue >> 3 & 0x7ff;
                            int mapHash = (targetBlockZ / 8 + (targetBlockX / 8 << 8));
                            for (int mapPtr = 0; mapPtr < mapCoordinates.length; mapPtr++) {
                                if ((mapCoordinates[mapPtr] == mapHash) && mapFileDat[mapPtr] != null) {
                                    argument.loadObjectMapBlock(anLocalInt_21_, clippingMaps, anLocalInt_18_ * 8, anLocalInt_19_ * 8, -1, Class389.aGraphicsToolkit3281, anLocalInt, (targetBlockX & 0x7) * 8, (targetBlockZ & 0x7) * 8, anLocalInt_22_, mapFileDat[mapPtr]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static void loadTerrainMaps(byte[][] mapFileData, Class303_Sub1 argument_17_) {
        int[] anLocalInts = {-1, 0, 0, 0, 0};
        int mapCount = mapFileData.length;
        for (int mapPtr = 0; mapPtr < mapCount; mapPtr++) {
            byte[] data = mapFileData[mapPtr];
            if (data != null) {
                Packet packet = new Packet(data);
                int mapX = mapCoordinates[mapPtr] >> 8;
                int mapZ = mapCoordinates[mapPtr] & 0xff;
                int mapLocalX = mapX * 64 - baseX;
                int mapLocalZ = mapZ * 64 - baseZ;
                Class47.method453((byte) -122);
                argument_17_.readTerrainMap(packet, clippingMaps, mapLocalX, baseX, baseZ, mapLocalZ);
                argument_17_.readHDData(mapLocalZ, packet, Class389.aGraphicsToolkit3281, mapLocalX, anLocalInts);
                if (!argument_17_.aBoolean2561 && mapX == regionX / 8 && mapZ == regionZ / 8 && anLocalInts[0] != -1) {
                    Class_s.aClass195_2551 = Statics.aClass333_2631.method3727(-18085, anLocalInts[2], (InputStream_Sub2.aClass64_35), anLocalInts[3], anLocalInts[1], anLocalInts[0]);
                    Statics.anInt6416 = anLocalInts[4];
                }
            }
        }
        for (int anLocalInt_25_ = 0; mapCount > anLocalInt_25_; anLocalInt_25_++) {
            int anLocalInt_26_ = ((mapCoordinates[anLocalInt_25_] >> 8) * 64 - baseX);
            int anLocalInt_27_ = (-baseZ + (mapCoordinates[anLocalInt_25_] & 0xff) * 64);
            byte[] anLocalInts_28_ = mapFileData[anLocalInt_25_];
            if (anLocalInts_28_ == null && regionZ < 800) {
                Class47.method453((byte) -96);
                argument_17_.method3564(anLocalInt_26_, 64, 64, anLocalInt_27_, false);
            }
        }
    }

    static final void method3942(int argument, int argument_0_) {
	if (argument_0_ != Class6.anInt70) {
	    mapWidth = mapDepth
		= Class114.anIntArray944[argument_0_];
	    Node_Sub37_Sub3.method1064((byte) -109);
	    Class133.anIntArrayArray1066 = (new int[mapWidth]
					    [mapDepth]);
	    Class119.anIntArrayArray970 = (new int[mapWidth]
					   [mapDepth]);
	    mapGenerationArray
		= (new int[4][mapWidth >> 3]
		   [mapDepth >> 3]);
	    for (int anLocalInt = 0; anLocalInt < 4; anLocalInt++)
		clippingMaps[anLocalInt]
		    = Class46_Sub1_Sub1.method438(mapWidth,
						  (byte) -126,
						  (mapDepth));
	    if (argument != 598809411)
		Class358.method3941(true);
	    Statics.aByteArrayArrayArray1279
		= (new byte[4][mapWidth]
		   [mapDepth]);
	    Node_Sub49.method1153(4, mapDepth, mapWidth, (byte) -84);
	    AthmosphericConditions.initialize(mapWidth >> 3, mapDepth >> 3, Class389.aGraphicsToolkit3281);
	    Class6.anInt70 = argument_0_;
	}
    }
}
