/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;

public final class client extends Applet_Sub1 {
    static Class166 aClass166_3743 = new Class166(87, 8);
    /*synthetic*/ static Class aClass3744;
    public static int anInt3745;
    static ModeWhatEnum modeWhat;
    static int language = 0;
    static GameEnum selectedGame = null;
    static TestingStageEnum modeWhere;
    static GameServer gameServer;
    static GameServer lobbyServer;
    static GameServer demoServer;
    static boolean useAdvertising = false;
    static int affiliateId;
    static String quitURL;
    static String settingsString = null;
    static boolean aBoolean2950 = false;
    static int country;
    static int colourId = 0;
    static boolean fromBilling = false  ;
    static boolean force64MB = false;
    static int worldFlags;
    static long userFlow = 0L;
    static String additionalInfo = null;
    static int gameWidth = 765;
    static int gameHeight = 503;
    static client clientInstance;
    static Clipboard clipboard;
    static String loadingBarText;
    static int loadingBarPercentage;
    static LoadingStatus currentLoadingStatus;
    static LoadingStatus[] loadingStatusCollection;
    static LoadingBar currentLoadingBar;
    static long lastGC = 0L;
    static BufferedFile[] cacheIndexFile = new BufferedFile[37];
    static BufferedFile cacheDataFile;
    static BufferedFile idx255File;
    static BufferedFile randomFile;
    static DiskBackedCache cache255;
    static AbstractMouseHandler mouseHandler;
    static AbstractKeyHandler keyHandler;
    static ThreadSafeDiskBackedCache threadSafeDiskBackedCache;
    static Js5Client js5client;
    static FileStoreManager fileStoreManager;
    static FileStore[] fileStores = new FileStore[37];
    static GzipInflater gzipInflater = new GzipInflater();
    static Js5Store bootData;
    static Js5Store fontCache;
    static Js5Store store33;
    static boolean useOldBootData;
    static int bootDataFITCRC;
    static int store33FITCRC;
    static int fontIndexP11full;
    static int fontIndexP12full;
    static int fontIndexB12full;
    static Class33 aClass33_2630;
    static Color[] loadingBarTextColour
	= { new Color(16777215), new Color(16777215), new Color(16741381),
	    new Color(16741381) };
    static Color[] loadingBarFillColour = { new Color(9179409), new Color(3289650),
				      new Color(3289650), new Color(3289650) };
    static Color[] loadingBarBorderColour
	= { new Color(9179409), new Color(16777215), new Color(16726277),
	    new Color(16726277) };
    static Thread aThread3512;
    static int anInt1155 = 0;
    static Js5Store interfaceFetcher;
    static int loginscreenId;
    static int lobbyscreenId;

    static final void method106() {
        int anLocalInt = Class224.anInt1578;
        int[] anLocalInts = Class242.anIntArray1769;
        int anLocalInt_0_ = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub24_4299.method1451(75);
        boolean anLocalBoolean = (anLocalInt_0_ == 1 && anLocalInt > 200 || anLocalInt_0_ == 0 && anLocalInt > 50);
        for (int anLocalInt_1_ = 0; anLocalInt_1_ < anLocalInt; anLocalInt_1_++) {
            DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2 = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[anLocalInts[anLocalInt_1_]]);
            if (!class104_sub2_sub2_sub5_sub2.method1860(-1))
                ((Entity) class104_sub2_sub2_sub5_sub2).anInt6786 = -1;
            else if (class104_sub2_sub2_sub5_sub2.aBoolean6848)
                ((Entity) class104_sub2_sub2_sub5_sub2).anInt6786 = -1;
            else {
                class104_sub2_sub2_sub5_sub2.method1795(-125);
                if ((class104_sub2_sub2_sub5_sub2.left) < 0 || (class104_sub2_sub2_sub5_sub2.bottom) < 0 || (class104_sub2_sub2_sub5_sub2.right) >= MapRelated.mapWidth || (class104_sub2_sub2_sub5_sub2.top) >= MapRelated.mapDepth)
                    ((Entity) class104_sub2_sub2_sub5_sub2).anInt6786 = -1;
                else {
                    class104_sub2_sub2_sub5_sub2.aBoolean6846 = (class104_sub2_sub2_sub5_sub2.aBoolean6753 ? anLocalBoolean : false);
                    if (class104_sub2_sub2_sub5_sub2 == Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
                        ((Entity) class104_sub2_sub2_sub5_sub2).anInt6786 = 2147483647;
                    else {
                        int anLocalInt_2_ = 0;
                        if (!class104_sub2_sub2_sub5_sub2.aBoolean6751)
                            anLocalInt_2_++;
                        if (class104_sub2_sub2_sub5_sub2.anInt6774 > Class333.anInt2720)
                            anLocalInt_2_ += 2;
                        anLocalInt_2_ += 5 - class104_sub2_sub2_sub5_sub2.method1830(-125) << 2;
                        if (class104_sub2_sub2_sub5_sub2.aBoolean6852 || class104_sub2_sub2_sub5_sub2.aBoolean6856)
                            anLocalInt_2_ += 512;
                        else {
                            if (Class350_Sub1.anInt5434 == 0)
                                anLocalInt_2_ += 32;
                            else
                                anLocalInt_2_ += 128;
                            anLocalInt_2_ += 256;
                        }
                        ((Entity) class104_sub2_sub2_sub5_sub2).anInt6786 = anLocalInt_2_ + 1;
                    }
                }
            }
        }
        for (int anLocalInt_3_ = 0; anLocalInt_3_ < dba_sub_772_Sub2.anInt6369; anLocalInt_3_++) {
            DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1 = (((Node_Sub35) Class294.aJagexHashMap_2453.get((long) (DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616[anLocalInt_3_]))).aClass104_Sub2_Sub2_Sub5_Sub1_4157);
            if (!class104_sub2_sub2_sub5_sub1.method1845(-1) || !(class104_sub2_sub2_sub5_sub1.aClass291_6832.method3491(ClientVariables.instance, 162)))
                ((Entity) class104_sub2_sub2_sub5_sub1).anInt6786 = -1;
            else {
                class104_sub2_sub2_sub5_sub1.method1795(-125);
                if ((class104_sub2_sub2_sub5_sub1.left) < 0 || (class104_sub2_sub2_sub5_sub1.bottom) < 0 || (class104_sub2_sub2_sub5_sub1.right) >= MapRelated.mapWidth || (class104_sub2_sub2_sub5_sub1.top) >= MapRelated.mapDepth)
                    ((Entity) class104_sub2_sub2_sub5_sub1).anInt6786 = -1;
                else {
                    int anLocalInt_4_ = 0;
                    if (!class104_sub2_sub2_sub5_sub1.aBoolean6751)
                        anLocalInt_4_++;
                    if (class104_sub2_sub2_sub5_sub1.anInt6774 > Class333.anInt2720)
                        anLocalInt_4_ += 2;
                    anLocalInt_4_ += (5 - class104_sub2_sub2_sub5_sub1.method1830(-126) << 2);
                    if (Class350_Sub1.anInt5434 == 0) {
                        if (class104_sub2_sub2_sub5_sub1.aClass291_6832.aBoolean2311)
                            anLocalInt_4_ += 64;
                        else
                            anLocalInt_4_ += 128;
                    } else if (Class350_Sub1.anInt5434 == 1) {
                        if (class104_sub2_sub2_sub5_sub1.aClass291_6832.aBoolean2311)
                            anLocalInt_4_ += 32;
                        else
                            anLocalInt_4_ += 64;
                    }
                    if (class104_sub2_sub2_sub5_sub1.aClass291_6832.aBoolean2321)
                        anLocalInt_4_ += 1024;
                    else if (!class104_sub2_sub2_sub5_sub1.aClass291_6832.aBoolean2317)
                        anLocalInt_4_ += 256;
                    ((Entity) class104_sub2_sub2_sub5_sub1).anInt6786 = anLocalInt_4_ + 1;
                }
            }
        }
        for (int anLocalInt_5_ = 0; anLocalInt_5_ < Class166.aClass124Array1216.length; anLocalInt_5_++) {
            Class124 class124 = Class166.aClass124Array1216[anLocalInt_5_];
            if (class124 != null) {
                if (class124.anInt1007 == 1) {
                    Node_Sub35 class59_sub35 = ((Node_Sub35) (Class294.aJagexHashMap_2453.get((long) class124.anInt1008)));
                    if (class59_sub35 != null) {
                        DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1 = (class59_sub35.aClass104_Sub2_Sub2_Sub5_Sub1_4157);
                        if (class104_sub2_sub2_sub5_sub1.anInt6786 >= 0)
                            ((Entity) class104_sub2_sub2_sub5_sub1).anInt6786 += 2048;
                    }
                } else if (class124.anInt1007 == 10) {
                    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2 = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[class124.anInt1008]);
                    if (class104_sub2_sub2_sub5_sub2 != null && (class104_sub2_sub2_sub5_sub2 != Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587) && class104_sub2_sub2_sub5_sub2.anInt6786 >= 0)
                        ((Entity) class104_sub2_sub2_sub5_sub2).anInt6786 += 2048;
                }
            }
        }
    }

    static final void throwCommandLineError(String argument, byte argument_7_) {
        System.exit(1);
    }

    static final int parseLanguageString(String argument, int argument_25_) {
        for (int anLocalInt = 0; Class388.aStringArray3276.length > anLocalInt; anLocalInt++) {
            if (Class388.aStringArray3276[anLocalInt].equalsIgnoreCase(argument))
                return anLocalInt;
        }
        return -1;
    }

    static final void processStartUp() {
        if (loadingStatusCollection == null) {
            loadingStatusCollection = LoadingStatus.generateArray();
            currentLoadingStatus = loadingStatusCollection[0];
            Node_Sub31_Sub25.aLong5952 = getGameTime();
        }
        if (currentLoadingBar == null)
            updateLoadingBar();
        LoadingStatus previousStatus = currentLoadingStatus;
        int loadingProgress = processInitialization((byte) -108);
        if (previousStatus == currentLoadingStatus) {
            loadingBarText = currentLoadingStatus.busyStatusText.getLocalizedString(language);
            if (currentLoadingStatus.usePercentageRange)
                loadingBarPercentage = (loadingProgress * (currentLoadingStatus.finishedPercentage - currentLoadingStatus.startPercentage) / 100) + currentLoadingStatus.startPercentage;
            if (currentLoadingStatus.showPercentageString)
                loadingBarText += loadingBarPercentage + "%";
        } else if (currentLoadingStatus != LoadingStatus.aLoadingStatus_251) {
            loadingBarText = previousStatus.finishedStatusText.getLocalizedString(language);
            if (currentLoadingStatus.showPercentageString)
                loadingBarText += previousStatus.finishedPercentage + "%";
            loadingBarPercentage = previousStatus.finishedPercentage;
            if (currentLoadingStatus.usePercentageRange || previousStatus.usePercentageRange)
                Node_Sub31_Sub25.aLong5952 = getGameTime();
        } else {
            currentLoadingBar = null;
            Class316.method3638(3, 2);
        }
        if (currentLoadingBar != null) {
            currentLoadingBar.create(loadingBarText, currentLoadingStatus, loadingBarPercentage, Node_Sub31_Sub25.aLong5952);
            if (Class86.anInterface8Array640 != null) {
                for (int anLocalInt_42_ = Class_s_Sub2.anInt5364 + 1; anLocalInt_42_ < Class86.anInterface8Array640.length; anLocalInt_42_++) {
                    if (Class86.anInterface8Array640[anLocalInt_42_].method38(-31784) >= 100 && Class_s_Sub2.anInt5364 == anLocalInt_42_ - 1 && Statics.anInt1652 >= 1 && currentLoadingBar.method2830()) {
                        try {
                            Class86.anInterface8Array640[anLocalInt_42_].method39(true);
                        } catch (Exception exception) {
                            Class86.anInterface8Array640 = null;
                            break;
                        }
                        currentLoadingBar.method2828(Class86.anInterface8Array640[anLocalInt_42_]);
                        Class_s_Sub2.anInt5364++;
                        if ((Class_s_Sub2.anInt5364 >= Class86.anInterface8Array640.length - 1) && Class86.anInterface8Array640.length > 1)
                            Class_s_Sub2.anInt5364 = (!aClass33_2630.method370(23382) ? -1 : 0);
                    }
                }
            }
        }
    }

    static final int processInitialization(byte argument) {
        if (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub15_4322.method1416(argument ^ 0xffffffff) == 0) {
            for (int anLocalInt = 0; Class246.anInt1792 > anLocalInt; anLocalInt++) {
                if (Statics.keyMessages[anLocalInt].getKeyChar() == 's' || Statics.keyMessages[anLocalInt].getKeyChar() == 'S') {
                    AthmosphericConditions.aClass59_Sub50_116.method1159(1, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub15_4322), 110);
                    GlInterleavedArray.aBoolean3224 = true;
                    break;
                }
            }
        }
        if (currentLoadingStatus == LoadingStatus.aLoadingStatus_229) {
            Runtime runtime = Runtime.getRuntime();
            int usedMemoryKB = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
            long l = getGameTime();
            if (Class307_Sub1.aLong5417 == 0L)
                Class307_Sub1.aLong5417 = l;
            if (usedMemoryKB > 16384 && l - Class307_Sub1.aLong5417 < 5000L) {
                if (l - lastGC > 1000L) {
                    System.gc();
                    lastGC = l;
                }
                return 0;
            }
        }
        if (currentLoadingStatus == LoadingStatus.aLoadingStatus_231) {
            if (fileStoreManager == null)
                fileStoreManager = new FileStoreManager(js5client, threadSafeDiskBackedCache, Statics.updateServerD, Class72.updateServerN);
            if (!fileStoreManager.processMetaFIT())
                return 0;
            Class367.method3998(null, 0, true);
            useOldBootData = !Node_Sub31_Sub11.decompressHardcodedGzip();
            bootData = createStore(useOldBootData ? 34 : 32, false, 1);
            store33 = createStore(33, false, 1);
            fontCache = createStore(13, false, 1);
        }
        if (LoadingStatus.aLoadingStatus_233 == currentLoadingStatus) {
            boolean preloadedStore33 = store33.preloadAll();
            int progress = fileStores[33].getFITProgress();
            progress = progress + fileStores[!useOldBootData ? 32 : 34].getFITProgress();
            progress += fileStores[13].getFITProgress();
            progress = progress + (preloadedStore33 ? 100 : store33.getProgress());
            if (progress != 400)
                return progress / 4;
            bootDataFITCRC = bootData.getFitCRC();
            store33FITCRC = store33.getFitCRC();
            loadFontIndices(bootData);
            int anLocalInt_0_ = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub9_4309.method1392(98);
            aClass33_2630 = new Class33(selectedGame, language, store33);
            int[] anLocalInts = aClass33_2630.method372(anLocalInt_0_, true);
            if (anLocalInts.length == 0)
                anLocalInts = aClass33_2630.method372(0, true);
            Class145 class145 = new Class145(bootData, fontCache);
            if (anLocalInts.length > 0) {
                Class86.anInterface8Array640 = new Interface8[anLocalInts.length];
                for (int anLocalInt_1_ = 0; Class86.anInterface8Array640.length > anLocalInt_1_; anLocalInt_1_++)
                    Class86.anInterface8Array640[anLocalInt_1_] = new Class42((aClass33_2630.method371(-1, anLocalInts[anLocalInt_1_])), class145);
            }
        }
        if (LoadingStatus.aLoadingStatus_234 == currentLoadingStatus)
            Class5.method223(fontCache, Class295.method3508(false), bootData, (byte) 77);
        if (currentLoadingStatus == LoadingStatus.aLoadingStatus_235) {
            int anLocalInt = LoadingBar.method2834();
            int anLocalInt_2_ = Class62_Sub22.method1447(true);
            if (anLocalInt < anLocalInt_2_)
                return anLocalInt * 100 / anLocalInt_2_;
        }
        if (LoadingStatus.aLoadingStatus_236 == currentLoadingStatus) {
            if (Class86.anInterface8Array640 != null && Class86.anInterface8Array640.length > 0) {
                if (Class86.anInterface8Array640[0].method38(-31784) < 100)
                    return 0;
                if (Class86.anInterface8Array640.length > 1 && aClass33_2630.method370(23382) && Class86.anInterface8Array640[1].method38(-31784) < 100)
                    return 0;
            }
            Class42.method424((byte) 96, Class389.aGraphicsToolkit3281);
            Node_Sub31_Sub1.method882(-1719661332, Class389.aGraphicsToolkit3281);
            Class316.method3638(1, 2);
        }
        if (LoadingStatus.aLoadingStatus_237 == currentLoadingStatus) {
            for (int anLocalInt = 0; anLocalInt < 4; anLocalInt++)
                MapRelated.clippingMaps[anLocalInt] = Class46_Sub1_Sub1.method438(MapRelated.mapWidth, (byte) -98, (MapRelated.mapDepth));
        }
        if (currentLoadingStatus == LoadingStatus.aLoadingStatus_238) {
            Class205.aJs5Store_1472 = createStore(8, false, 1);
            Class274.aJs5Store_2197 = createStore(0, false, 1);
            Class253.aJs5Store_3720 = createStore(1, false, 1);
            Statics.aJs5Store_1153 = createStore(2, false, 1);
            interfaceFetcher = createStore(3, false, 1);
            Class314.aJs5Store_2603 = createStore(4, false, 1);
            MapRelated.mapStore = createStore(5, true, 1);
            Class341.aJs5Store_2881 = createStore(6, true, 1);
            Node_Sub49.aJs5Store_4292 = createStore(7, false, 1);
            DoublyLinkedNodeP2_Sub10.aJs5Store_4600 = createStore(9, false, 1);
            Class313.aJs5Store_2596 = createStore(10, false, 1);
            Class42.aJs5Store_3537 = createStore(11, false, 1);
            Cs2Script.scriptStore = createStore(12, false, 1);
            ClanSettingsDelta.aJs5Store_1546 = createStore(14, false, 1);
            Node_Sub31_Sub4.aJs5Store_5856 = createStore(15, false, 1);
            Statics.aJs5Store_4343 = createStore(16, false, 1);
            Statics.aJs5Store_3520 = createStore(17, false, 1);
            Class245_Sub1.aJs5Store_5307 = createStore(18, false, 1);
            tia_sub_35_Sub2DoublyLinked.aJs5Store_6667 = createStore(19, false, 1);
            Class200.aJs5Store_1447 = createStore(20, false, 1);
            Class62_Sub16.aJs5Store_4416 = createStore(21, false, 1);
            Node_Sub30.aJs5Store_4134 = createStore(22, false, 1);
            Class147.aJs5Store_1116 = createStore(23, true, 1);
            Class109.aJs5Store_908 = createStore(24, false, 1);
            Class88.aJs5Store_645 = createStore(25, false, 1);
            DoublyLinkedNode_Sub51_Sub3.aJs5Store_6232 = createStore(26, true, 1);
            Class303_Sub1.aJs5Store_5408 = createStore(27, false, 1);
            Class361.aJs5Store_3056 = createStore(28, true, 1);
            Statics.aJs5Store_2160 = createStore(29, false, 1);
            dba_sub_772.aJs5Store_4344 = createStore(30, true, 1);
            Statics.aJs5Store_4153 = createStore(31, true, 1);
            Class106.aJs5Store_865 = createStore(36, true, 2);
        }
        if (currentLoadingStatus == LoadingStatus.aLoadingStatus_239) {
            int anLocalInt = 0;
            for (int anLocalInt_3_ = 0; anLocalInt_3_ < 37; anLocalInt_3_++) {
                if (fileStores[anLocalInt_3_] != null)
                    anLocalInt += (fileStores[anLocalInt_3_].getFITProgress() * DoublyLinkedNode_Sub51_Sub13.anIntArray6292[anLocalInt_3_] / 100);
            }
            if (anLocalInt != 100) {
                if (Class259.anInt2022 < 0)
                    Class259.anInt2022 = anLocalInt;
                return ((anLocalInt - Class259.anInt2022) * 100 / (100 - Class259.anInt2022));
            }
            Node_Sub31_Sub32.method974(Class205.aJs5Store_1472, 0);
            Class5.method223(fontCache, Class295.method3508(false), Class205.aJs5Store_1472, (byte) 77);
        }
        if (LoadingStatus.aLoadingStatus_240 == currentLoadingStatus) {
            if (Statics.anInt472 == -1)
                Statics.anInt472 = Class341.aJs5Store_2881.getID("scape main");
            Class245_Sub1.method3178(argument ^ ~0x3f44);
            Class316.method3638(2, 2);
        }
        if (LoadingStatus.aLoadingStatus_241 == currentLoadingStatus)
            Class111.method1989(baseSignlink, 109, dba_sub_772.aJs5Store_4344);
        if (LoadingStatus.aLoadingStatus_242 == currentLoadingStatus) {
            int anLocalInt = Statics.method2604(argument + 189);
            if (anLocalInt < 100)
                return anLocalInt;
            Node_Sub15.method696(argument + 108, Class361.aJs5Store_3056.getFlatData(1));
            Node_Sub31_Sub39.method1007(1412, Class361.aJs5Store_3056.getFlatData(3));
            Statics.aClass61_2002 = new Class61(Class361.aJs5Store_3056);
        }
        if (currentLoadingStatus == LoadingStatus.aLoadingStatus_243) {
            if (GlTexture_Sub4_Sub1.anInt6551 != -1 && !Node_Sub49.aJs5Store_4292.isLoaded(GlTexture_Sub4_Sub1.anInt6551, 0))
                return 99;
            Class22.anTextureSource_142 = new Class174(DoublyLinkedNode_Sub51_Sub3.aJs5Store_6232, DoublyLinkedNodeP2_Sub10.aJs5Store_4600, Class205.aJs5Store_1472);
            Class62_Sub27.aClass362_4457 = new Class362(selectedGame, language, Statics.aJs5Store_1153);
            Class157.aClass41_1159 = new Class41(selectedGame, language, Statics.aJs5Store_1153, Statics.aClass61_2002);
            Class363.aClass241_3064 = new Class241(selectedGame, language, Statics.aJs5Store_1153, Class205.aJs5Store_1472);
            Class62_Sub14.aClass220_4409 = new Class220(selectedGame, language, Statics.aJs5Store_3520);
            Statics.aClass51_1250 = new Class51(selectedGame, language, Statics.aJs5Store_1153);
            Statics.aClass297_3521 = new Class297(selectedGame, language, Statics.aJs5Store_1153);
            Class79.aClass115_561 = new Class115(selectedGame, language, Statics.aJs5Store_1153, Class205.aJs5Store_1472);
            DoublyLinkedNodeP2_Sub5.aClass383_4536 = new Class383(selectedGame, language, Statics.aJs5Store_1153, Node_Sub49.aJs5Store_4292);
            DoublyLinkedNode_Sub51_Sub2.aClass140_6228 = new Class140(selectedGame, language, Statics.aJs5Store_1153);
            Class48.aClass73_343 = new Class73(selectedGame, language, Statics.aJs5Store_1153);
            Node_Sub31_Sub30.aClass257_5983 = new Class257(selectedGame, language, true, Statics.aJs5Store_4343, Node_Sub49.aJs5Store_4292);
            Node_Sub31_Sub13.aClass20_5897 = new Class20(selectedGame, language, Statics.aJs5Store_1153, Class205.aJs5Store_1472);
            Class206.aClass374_1482 = new Class374(selectedGame, language, Statics.aJs5Store_1153, Class205.aJs5Store_1472);
            DiskBackedCache.aClass26_2709 = new Class26(selectedGame, language, true, Class245_Sub1.aJs5Store_5307, Node_Sub49.aJs5Store_4292);
            Class253_Sub1_Sub1.aClass365_6632 = new Class365(selectedGame, language, true, Class62_Sub27.aClass362_4457, tia_sub_35_Sub2DoublyLinked.aJs5Store_6667, Node_Sub49.aJs5Store_4292);
            Class349.aClass313_2918 = new Class313(selectedGame, language, Statics.aJs5Store_1153);
            DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425 = new Class336(selectedGame, language, Class200.aJs5Store_1447, Class274.aJs5Store_2197, Class253.aJs5Store_3720);
            Statics.aClass333_2631 = new Class333(selectedGame, language, Statics.aJs5Store_1153);
            InputStream_Sub2.aClass64_35 = new Class64(selectedGame, language, Statics.aJs5Store_1153);
            Class194.aClass225_1414 = new Class225(selectedGame, language, Class62_Sub16.aJs5Store_4416, Node_Sub49.aJs5Store_4292);
            Class86.aClass264_638 = new Class264(selectedGame, language, Statics.aJs5Store_1153);
            Class62_Sub6.aClass226_4388 = new Class226(selectedGame, language, Statics.aJs5Store_1153);
            Class245_Sub2_Sub1.aClass24_6520 = new Class24(selectedGame, language, Statics.aJs5Store_1153);
            ClientVariables.varbitSource = new VarbitSource(selectedGame, Node_Sub30.aJs5Store_4134);
            JagexHash.aClass58_1682 = new Class58(selectedGame, language, Statics.aJs5Store_1153);
            Class111.aClanVarbitSource_916 = new ClanVarbitSource(selectedGame, Statics.aJs5Store_1153);
            RsInterface.initialize(fontCache, Class205.aJs5Store_1472, interfaceFetcher, Node_Sub49.aJs5Store_4292);
            Class348.method3813(Statics.aJs5Store_2160, -83);
            Node_Sub43.aClass316_4220 = new Class316(language, Class109.aJs5Store_908, Class88.aJs5Store_645);
            DoublyLinkedNode_Sub51_Sub5.aClass66_6242 = new Class66(language, Class109.aJs5Store_908, Class88.aJs5Store_645, new Class243());
            Class29.method358((byte) 65);
            Node_Sub31_Sub30.aClass257_5983.method3299(11, AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub25_4332.method1458(120) == 0);
            ClientVariables.instance = new ClientVariables();
            Class353_Sub2.method3896(false);
            DoublyLinkedNode_Sub51_Sub11.method1251((byte) -71, Class303_Sub1.aJs5Store_5408);
            Class46_Sub3.method446(argument + 108, Node_Sub49.aJs5Store_4292, Class22.anTextureSource_142);
            Class233 class233 = new Class233(Class313.aJs5Store_2596.getData("huffman", ""));
            Class_s.method3544(-18, class233);
            try {
                jagmisc.init();
            } catch (Throwable throwable) {
                /* empty */
            }
            Class111.aClass88_917 = Statics.method384((byte) 76);
            Statics.aClass59_Sub44_1064 = new Node_Sub44(true, baseSignlink);
        }
        if (LoadingStatus.aLoadingStatus_245 == currentLoadingStatus) {
            int anLocalInt = (Node_Sub31_Sub24.method955(Class205.aJs5Store_1472, argument ^ 0x6b) + Class274.method3387(true, (byte) -14));
            int anLocalInt_4_ = (DoublyLinkedNode_Sub51_Sub13.method1261(16) + Class62_Sub22.method1447(true));
            if (anLocalInt_4_ > anLocalInt)
                return anLocalInt * 100 / anLocalInt_4_;
        }
        if (LoadingStatus.aLoadingStatus_246 == currentLoadingStatus)
            Class179.method2803(Class147.aJs5Store_1116, Statics.aClass51_1250, Statics.aClass297_3521, Node_Sub31_Sub30.aClass257_5983, Node_Sub31_Sub13.aClass20_5897, Class206.aClass374_1482, ClientVariables.instance);
        if (LoadingStatus.aLoadingStatus_247 == currentLoadingStatus) {
            Cs2Runtime.integerGlobalVariables = (new int
                    [Class245_Sub2_Sub1.aClass24_6520.anInt157]);
            Cs2Runtime.stringGlobalVariable = (new String
                    [Class62_Sub6.aClass226_4388.anInt1638]);
            Class273.aBooleanArray2184 = (new boolean
                    [Class245_Sub2_Sub1.aClass24_6520.anInt157]);
            for (int anLocalInt = 0; (Class245_Sub2_Sub1.aClass24_6520.anInt157 > anLocalInt); anLocalInt++) {
                if (Class245_Sub2_Sub1.aClass24_6520.method337(109, anLocalInt).anInt1498 == 0) {
                    Class273.aBooleanArray2184[anLocalInt] = true;
                    Statics.anInt1152++;
                }
                Cs2Runtime.integerGlobalVariables[anLocalInt] = -1;
            }
            Class62_Sub2.method1354(4);
            loginscreenId = interfaceFetcher.getID("lobbyscreen");
            lobbyscreenId = interfaceFetcher.getID("lobbyscreen");
            MapRelated.mapStore.clearFeatures(true, false);
            Class341.aJs5Store_2881.clearFeatures(true, true);
            Class205.aJs5Store_1472.clearFeatures(true, true);
            fontCache.clearFeatures(true, true);
            Class313.aJs5Store_2596.clearFeatures(true, true);
            interfaceFetcher.clearFeatures(true, true);
            Statics.aJs5Store_1153.discardUnpacked = 2;
            HardwareLight.aBoolean3891 = true;
            Statics.aJs5Store_3520.discardUnpacked = 2;
            Statics.aJs5Store_4343.discardUnpacked = 2;
            Class245_Sub1.aJs5Store_5307.discardUnpacked = 2;
            tia_sub_35_Sub2DoublyLinked.aJs5Store_6667.discardUnpacked = 2;
            Class200.aJs5Store_1447.discardUnpacked = 2;
            Class62_Sub16.aJs5Store_4416.discardUnpacked = 2;
        }
        if (LoadingStatus.aLoadingStatus_248 == currentLoadingStatus) {
            if (!RsInterface.isAvailable(loginscreenId))
                return 0;
            boolean anLocalBoolean = true;
            for (int anLocalInt = 0; anLocalInt < (RsInterface.anInterfaces[loginscreenId]).length; anLocalInt++) {
                RsInterface rsInterface = (RsInterface.anInterfaces[loginscreenId][anLocalInt]);
                if (rsInterface.type == 5 && rsInterface.anInt1864 != -1 && !Class205.aJs5Store_1472.isLoaded((rsInterface.anInt1864), 0))
                    anLocalBoolean = false;
            }
            if (!anLocalBoolean)
                return 0;
        }
        if (LoadingStatus.aLoadingStatus_249 == currentLoadingStatus)
            Class6.method230(true, (byte) -94);
        if (LoadingStatus.aLoadingStatus_250 == currentLoadingStatus) {
            currentLoadingBar.method2836();
            try {
                aThread3512.join();
            } catch (InterruptedException interruptedexception) {
                return 0;
            }
            store33 = null;
            Class86.anInterface8Array640 = null;
            aThread3512 = null;
            bootData = null;
            currentLoadingBar = null;
            aClass33_2630 = null;
            Class101.method1736((byte) -111);
            Statics.aBoolean6373 = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub15_4322.method1416(37) == 1;
            AthmosphericConditions.aClass59_Sub50_116.method1159(1, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub15_4322), 81);
            if (Statics.aBoolean6373)
                AthmosphericConditions.aClass59_Sub50_116.method1159(0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4316), argument ^ ~0x7);
            else if (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4316.aBoolean4445 && (Statics.aClass59_Sub44_1064.anInt4246) < 512 && (Statics.aClass59_Sub44_1064.anInt4246) != 0)
                AthmosphericConditions.aClass59_Sub50_116.method1159(0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4316), 101);
            Class251.method3240(false);
            if (!Statics.aBoolean6373)
                Class215.method2991((byte) -41, false, AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4316.method1464(94));
            else
                Class215.method2991((byte) -41, false, 0);
            Class127.method2418(-1, -352753888, AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub4_4300.method1368(26), -1, false);
            Class42.method424((byte) 127, Class389.aGraphicsToolkit3281);
            Node_Sub31_Sub1.method882(-1719661332, Class389.aGraphicsToolkit3281);
            Statics.method3000(Class389.aGraphicsToolkit3281, Class205.aJs5Store_1472, -127);
            Node_Sub29.method857(Class33.aClass368Array222, argument + 109);
            //Cs2Script.decompileall();
            System.out.println("Dec done");
        }
        return DoublyLinkedNodeP2_Sub2_Sub4.method1881((byte) -122);
    }

    static Js5Store createStore(int cacheId, boolean useArrayBuffers, int discardUnpacked) {
        DiskBackedCache diskBackedCache = null;
        if (cacheDataFile != null)
            diskBackedCache = new DiskBackedCache(cacheId, cacheDataFile, cacheIndexFile[cacheId], 1000000);
        fileStores[cacheId] = fileStoreManager.createFileStore(cacheId, (cache255), diskBackedCache);
        fileStores[cacheId].reset();
        return new Js5Store((fileStores[cacheId]), useArrayBuffers, discardUnpacked);
    }

    static final int calcStringHash(String argument) {
	int anLocalInt = argument.length();
	int anLocalInt_3_ = 0;
	for (int anLocalInt_4_ = 0; anLocalInt > anLocalInt_4_;
	     anLocalInt_4_++)
	    anLocalInt_3_
		= (Class62_Sub18.method1426(-117,
					    argument.charAt(anLocalInt_4_))
		   + (anLocalInt_3_ << 5) - anLocalInt_3_);
	return anLocalInt_3_;
    }

    static final void loadFontIndices(Js5Store argument) {
	fontIndexP11full = argument.getID("p11_full");
	fontIndexP12full = argument.getID("p12_full");
	fontIndexB12full = argument.getID("b12_full");
    }

    static void updateLoadingBar() {
        if (currentLoadingStatus != null) {
            currentLoadingBar = new LoadingBar();
            currentLoadingBar.create(currentLoadingStatus.busyStatusText.getLocalizedString(language), currentLoadingStatus, currentLoadingStatus.startPercentage, Node_Sub31_Sub25.aLong5952);
            aThread3512 = new Thread(currentLoadingBar, "");
            aThread3512.start();
        }
    }

    private final void method107(boolean argument_6_) {
        if (Statics.anInt1652 == 7 && !Class303.method3574(-1)) {
            if (DoublyLinkedNode_Sub51_Sub14.anInt6305 > 1) {
                JagexHashMap.anInt490 = Class359.anInt3038;
                DoublyLinkedNode_Sub51_Sub14.anInt6305--;
            }
            if (!Node_Sub31_Sub39.aBoolean6055)
                Statics.method3267(1024);
            for (int anLocalInt = 0; anLocalInt < 100; anLocalInt++) {
                if (!Network.method1114())
                    break;
            }
        }
        Class350.anInt2930++;
        Class376.method4091(-1, -1, 55, null);
        Class62_Sub5.method1373(-1, -89, null, -1);
        Node_Sub2.method533(-1);
        Class359.anInt3038++;
        for (int anLocalInt = 0; Statics.anInt5573 > anLocalInt; anLocalInt++) {
            DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1 = (Node_Sub31_Sub13.aClass59_Sub35Array5900[anLocalInt].aClass104_Sub2_Sub2_Sub5_Sub1_4157);
            if (class104_sub2_sub2_sub5_sub1 != null) {
                byte anLocalInt_7_ = (class104_sub2_sub2_sub5_sub1.aClass291_6832.aByte2367);
                if ((anLocalInt_7_ & 0x1) != 0) {
                    int anLocalInt_8_ = class104_sub2_sub2_sub5_sub1.method1830(-125);
                    if ((anLocalInt_7_ & 0x2) != 0 && class104_sub2_sub2_sub5_sub1.anInt6798 == 0 && Math.random() * 1000.0 < 10.0) {
                        int anLocalInt_9_ = (int) Math.round(Math.random() * 10.0 - 5.0);
                        int anLocalInt_10_ = (int) Math.round(Math.random() * 10.0 - 5.0);
                        if (anLocalInt_9_ != 0 || anLocalInt_10_ != 0) {
                            int anLocalInt_11_ = (anLocalInt_9_ + (class104_sub2_sub2_sub5_sub1.pathX[0]));
                            if (anLocalInt_11_ >= 0) {
                                if (MapRelated.mapWidth - anLocalInt_8_ - 1 < anLocalInt_11_)
                                    anLocalInt_11_ = (-anLocalInt_8_ + (MapRelated.mapWidth - 1));
                            } else
                                anLocalInt_11_ = 0;
                            int anLocalInt_12_ = (anLocalInt_10_ + (class104_sub2_sub2_sub5_sub1.pathZ[0]));
                            if (anLocalInt_12_ < 0)
                                anLocalInt_12_ = 0;
                            else if ((MapRelated.mapDepth - (anLocalInt_8_ + 1)) < anLocalInt_12_)
                                anLocalInt_12_ = (MapRelated.mapDepth - anLocalInt_8_ - 1);
                            int anLocalInt_13_ = (Class96.method1711(anLocalInt_12_, anLocalInt_8_, Class338.anIntArray2786, 0, true, (class104_sub2_sub2_sub5_sub1.pathX[0]), Statics.anIntArray292, (class104_sub2_sub2_sub5_sub1.pathZ[0]), anLocalInt_8_, -120, (MapRelated.clippingMaps[(class104_sub2_sub2_sub5_sub1.lightingHL)]), anLocalInt_8_, anLocalInt_11_, -1, 0));
                            if (anLocalInt_13_ > 0) {
                                if (anLocalInt_13_ > 9)
                                    anLocalInt_13_ = 9;
                                for (int anLocalInt_14_ = 0; anLocalInt_14_ < anLocalInt_13_; anLocalInt_14_++) {
                                    ((Entity) class104_sub2_sub2_sub5_sub1).pathX[anLocalInt_14_] = (Statics.anIntArray292[(-anLocalInt_14_ - 1 + anLocalInt_13_)]);
                                    ((Entity) class104_sub2_sub2_sub5_sub1).pathZ[anLocalInt_14_] = (Class338.anIntArray2786[(anLocalInt_13_ - 1 - anLocalInt_14_)]);
                                    ((Entity) class104_sub2_sub2_sub5_sub1).aByteArray6802[anLocalInt_14_] = (byte) 1;
                                }
                                ((Entity) class104_sub2_sub2_sub5_sub1).anInt6798 = anLocalInt_13_;
                            }
                        }
                    }
                    Entity.method1828(!argument_6_, class104_sub2_sub2_sub5_sub1, true);
                    int anLocalInt_15_ = Class46_Sub2.method443(class104_sub2_sub2_sub5_sub1, -21);
                    Node_Sub31_Sub35.method987(-102, class104_sub2_sub2_sub5_sub1);
                    Class62_Sub16.method1420((byte) 69, anLocalInt_15_, class104_sub2_sub2_sub5_sub1, Class55.anInt408, Class_aa_Sub1.anInt3748);
                    Class123.method2395(class104_sub2_sub2_sub5_sub1, Class55.anInt408, -25478);
                    Node_Sub2.method532(class104_sub2_sub2_sub5_sub1, -1);
                }
            }
        }
        if (!Class303.method3574(-1) && Class245.anInt1784 == 0) {
            if (Statics.anInt1745 != 2)
                Class150.method2544(3);
            else
                LoadingStatus.method373(105);
            if (Class287.anInt2299 >> 9 < 14 || MapRelated.mapWidth - 14 <= Class287.anInt2299 >> 9 || Node_Sub31_Sub30.anInt5987 >> 9 < 14 || (Node_Sub31_Sub30.anInt5987 >> 9 >= MapRelated.mapDepth - 14))
                MapRelated.loadMapForLogin();
        }
        for (; ; ) {
            Cs2Trigger class59_sub27 = (Cs2Trigger) Class43.aCyclicLinkedList_308.remove();
            if (class59_sub27 == null)
                break;
            RsInterface rsInterface = class59_sub27.aRsInterface_4115;
            if (rsInterface.subId >= 0) {
                RsInterface rsInterface_16_ = RsInterface.getByHash(rsInterface.parentId);
                if (rsInterface_16_ == null || rsInterface_16_.children == null || (rsInterface_16_.children.length <= rsInterface.subId) || (rsInterface_16_.children[rsInterface.subId]) != rsInterface)
                    continue;
            }
            Cs2Runtime.executeTrigger(class59_sub27);
        }
        for (; ; ) {
            Cs2Trigger class59_sub27 = (Cs2Trigger) Class124.aCyclicLinkedList_1012.remove();
            if (class59_sub27 == null)
                break;
            RsInterface rsInterface = class59_sub27.aRsInterface_4115;
            if (rsInterface.subId >= 0) {
                RsInterface rsInterface_17_ = RsInterface.getByHash(rsInterface.parentId);
                if (rsInterface_17_ == null || rsInterface_17_.children == null || (rsInterface.subId >= rsInterface_17_.children.length) || (rsInterface_17_.children[rsInterface.subId]) != rsInterface)
                    continue;
            }
            Cs2Runtime.executeTrigger(class59_sub27);
        }
        for (; ; ) {
            Cs2Trigger class59_sub27 = ((Cs2Trigger) DoublyLinkedNode_Sub51_Sub19.triggerQueue.remove());
            if (class59_sub27 == null)
                break;
            RsInterface rsInterface = class59_sub27.aRsInterface_4115;
            if (rsInterface.subId >= 0) {
                RsInterface rsInterface_18_ = RsInterface.getByHash(rsInterface.parentId);
                if (rsInterface_18_ == null || rsInterface_18_.children == null || (rsInterface.subId >= rsInterface_18_.children.length) || rsInterface != (rsInterface_18_.children[rsInterface.subId]))
                    continue;
            }
            Cs2Runtime.executeTrigger(class59_sub27);
        }
        if (dba_sub_772.aRsInterface_4345 != null)
            Class26.method346(-126);
        if (Class333.anInt2720 % 1500 == 0)
            Node_Sub23.method745(0);
        if (Statics.anInt1652 == 7 && !Class303.method3574(-1))
            tia_sub_35DoublyLinked.method1215(2);
        Class289.method3473(8775);
        if (Class242.aBoolean1771 && getGameTime() + -60000L > Node_Sub47_Sub4.aLong6169)
            Node_Sub47_Sub7.method1130((byte) 9);
        for (DoublyLinkedNodeP2_Sub4_Sub2 class104_sub4_sub2 = (DoublyLinkedNodeP2_Sub4_Sub2) Class120.aClass366_977.method3986(0); class104_sub4_sub2 != null; class104_sub4_sub2 = ((DoublyLinkedNodeP2_Sub4_Sub2) Class120.aClass366_977.method3992((byte) -102))) {
            if ((long) class104_sub4_sub2.anInt6441 < getGameTime() / 1000L + -5L) {
                if (class104_sub4_sub2.aShort6444 > 0)
                    Class62_Sub12.method1403(5, "", "", (class104_sub4_sub2.aString6442 + MultilanguageString.HAS_LOGGED_IN.getLocalizedString(language)), 0, "", 16773);
                if (class104_sub4_sub2.aShort6444 == 0)
                    Class62_Sub12.method1403(5, "", "", (class104_sub4_sub2.aString6442 + MultilanguageString.HAS_LOGGED_OUT.getLocalizedString(language)), 0, "", 16773);
                class104_sub4_sub2.unlink();
            }
        }
        if (argument_6_)
            aClass166_3743 = null;
        if (Statics.anInt1652 == 7 && !Class303.method3574(-1)) {
            if (Statics.aClass307_2632 == null)
                Class44.method429(86, false);
            else {
                Class113.anInt942++;
                if (Class113.anInt942 > 50) {
                    Class151.anInt1148++;
                    Node_Sub29 class59_sub29 = Class91.method1683((byte) 99, (Node_Sub31_Sub16.aClass372_5910), Class105.aClass207_862);
                    Class251.method3243(class59_sub29, !argument_6_);
                }
                try {
                    Statics.method531((byte) -60);
                } catch (java.io.IOException ioexception) {
                    Class44.method429(65, false);
                }
            }
        }
    }

    static final boolean method108(RsInterface argument) {
        if (dba_sub_772_Sub2.aBoolean6372) {
            if (method122(argument).anInt4005 != 0)
                return false;
            if (argument.type == 0)
                return false;
        }
        return argument.aBoolean1854;
    }

    static final void method109() {
        for (int anLocalInt = 0; anLocalInt < MapRelated.mapWidth; anLocalInt++) {
            int[] anLocalInts = Class133.anIntArrayArray1066[anLocalInt];
            for (int anLocalInt_19_ = 0; anLocalInt_19_ < MapRelated.mapDepth; anLocalInt_19_++)
                anLocalInts[anLocalInt_19_] = 0;
        }
    }

    private final void method110(int argument_20_) {
        if (FileStore.DISABLE_USERVER)
            return;
        if (js5client.exceptionCount > Class137.anInt1083) {
            Statics.aGameServer_6149.method3749(43594);
            Class167.anInt1225 = (js5client.exceptionCount * 50 - 50) * 5;
            if (Class167.anInt1225 > 3000)
                Class167.anInt1225 = 3000;
            if (js5client.exceptionCount >= 2 && js5client.status == 6) {
                this.loaderror(-109, "js5connect_outofdate");
                Statics.anInt1652 = 14;
                return;
            }
            if (js5client.exceptionCount >= 4 && js5client.status == -1) {
                this.loaderror(-109, "js5crc");
                Statics.anInt1652 = 14;
                return;
            }
            if (js5client.exceptionCount >= 4 && Class360.method3950(true, Statics.anInt1652)) {
                if (js5client.status == 7 || (js5client.status == 9))
                    this.loaderror(-119, "js5connect_full");
                else if (js5client.status <= 0)
                    this.loaderror(-120, "js5io");
                else if (DoublyLinkedNode_Sub51_Sub18.aString6343 != null)
                    this.loaderror(-91, "js5proxy_" + DoublyLinkedNode_Sub51_Sub18.aString6343.trim());
                else
                    this.loaderror(-93, "js5connect");
                Statics.anInt1652 = 14;
                return;
            }
        }
        int anLocalInt = 51 % ((argument_20_ - 62) / 35);
        Class137.anInt1083 = js5client.exceptionCount;
        if (Class167.anInt1225 > 0)
            Class167.anInt1225--;
        else {
            do {
                try {
                    if (anInt1155 == 0) {
                        Node_Sub31_Sub12.aSignlinkRequest_5894 = (Statics.aGameServer_6149.method3746((byte) 104, baseSignlink));
                        anInt1155++;
                    }
                    if (anInt1155 == 1) {
                        if (Node_Sub31_Sub12.aSignlinkRequest_5894.status == 2) {
                            if (Node_Sub31_Sub12.aSignlinkRequest_5894.result != null)
                                DoublyLinkedNode_Sub51_Sub18.aString6343 = (String) (Node_Sub31_Sub12.aSignlinkRequest_5894.result);
                            method123(1000, 7);
                            break;
                        }
                        if (Node_Sub31_Sub12.aSignlinkRequest_5894.status == 1)
                            anInt1155++;
                    }
                    if (anInt1155 == 2) {
                        Class79.aJagexSocket_564 = new JagexSocket((Socket) (Node_Sub31_Sub12.aSignlinkRequest_5894.result), baseSignlink, 25000);
                        Packet class59_sub28 = new Packet(5);
                        class59_sub28.p1(Class245_Sub2_Sub2.aClass212_6526.anInt1505);
                        class59_sub28.p4(649);
                        Class79.aJagexSocket_564.write((class59_sub28.data), 0, 5);
                        anInt1155++;
                        Class90.aLong680 = getGameTime();
                    }
                    if (anInt1155 == 3) {
                        if (Class360.method3950(true, Statics.anInt1652) || (Class79.aJagexSocket_564.available() > 0)) {
                            int anLocalInt_21_ = Class79.aJagexSocket_564.read();
                            if (anLocalInt_21_ != 0) {
                                method123(anLocalInt_21_, 7);
                                break;
                            }
                            anInt1155++;
                        } else if (getGameTime() + -Class90.aLong680 > 30000L) {
                            method123(1001, 7);
                            break;
                        }
                    }
                    if (anInt1155 != 4)
                        break;
                    boolean anLocalBoolean = (Class360.method3950(true, Statics.anInt1652) || Class282.method3446(Statics.anInt1652, (byte) 89) || Class382.method4108(Statics.anInt1652, 122));
                    Class86[] class86s = Class86.method1626(1);
                    Packet class59_sub28 = new Packet(class86s.length * 4);
                    Class79.aJagexSocket_564.read(class59_sub28.data, 0, class59_sub28.data.length);
                    for (int anLocalInt_22_ = 0; class86s.length > anLocalInt_22_; anLocalInt_22_++)
                        class86s[anLocalInt_22_].method1631(-119, class59_sub28.g4());
                    js5client.connect((Class79.aJagexSocket_564), !anLocalBoolean);
                    Node_Sub31_Sub12.aSignlinkRequest_5894 = null;
                    anInt1155 = 0;
                    Class79.aJagexSocket_564 = null;
                } catch (java.io.IOException ioexception) {
                    method123(1002, 7);
                }
                break;
            } while (false);
        }
    }

    public final void init() {
        if (this.isValidHost()) {
            gameServer = new GameServer();
            gameServer.id = Integer.parseInt(this.getParameter("worldid"));
            lobbyServer = new GameServer();
            lobbyServer.id = Integer.parseInt(this.getParameter("lobbyid"));
            lobbyServer.address = this.getParameter("lobbyaddress");
            demoServer = new GameServer();
            demoServer.id = Integer.parseInt(this.getParameter("demoid"));
            demoServer.address = this.getParameter("demoaddress");
            modeWhere = (TestingStageEnum.forId(Integer.parseInt(this.getParameter("modewhere"))));
            if (TestingStageEnum.LOCAL == modeWhere) {
                modeWhere = TestingStageEnum.WTWIP;
            } else if (TestingStageEnum.isValid(modeWhere) || TestingStageEnum.LIVE == modeWhere) {
            } else {
                modeWhere = TestingStageEnum.LIVE;
            }
            modeWhat = (ModeWhatEnum.forId(Integer.parseInt(this.getParameter("modewhat"))));
            if (ModeWhatEnum.WIP != modeWhat && modeWhat != ModeWhatEnum.RC && modeWhat != ModeWhatEnum.LIVE)
                modeWhat = ModeWhatEnum.LIVE;
            try {
                language = Integer.parseInt(this.getParameter("lang"));
            } catch (Exception exception) {
                language = 0;
            }
            String objecttag = this.getParameter("objecttag");
            if (objecttag == null || !objecttag.equals("1"))
                objectTagApplet = false;
            else
                objectTagApplet = true;
            String js = this.getParameter("js");
            if (js == null || !js.equals("1"))
                useJavaScript = false;
            else
                useJavaScript = true;
            String advert = this.getParameter("advert");
            if (advert == null || !advert.equals("1"))
                useAdvertising = false;
            else
                useAdvertising = true;
            String game = this.getParameter("game");
            if (game != null) {
                if (game.equals("0"))
                    selectedGame = GameEnum.RUNESCAPE;
                else if (game.equals("1"))
                    selectedGame = GameEnum.STELLARDAWN;
                else if (game.equals("2"))
                    selectedGame = GameEnum.GAME2;
                else if (game.equals("3"))
                    selectedGame = GameEnum.GAME3;
            }
            try {
                affiliateId = Integer.parseInt(this.getParameter("affid"));
            } catch (Exception exception) {
                affiliateId = 0;
            }
            quitURL = this.getParameter("quiturl");
            settingsString = this.getParameter("settings");
            if (settingsString == null)
                settingsString = "";
            aBoolean2950 = this.getParameter("under").equals("1");
            String country = this.getParameter("country");
            if (country != null) {
                try {
                    client.country = Integer.parseInt(country);
                } catch (Exception exception) {
                    client.country = 0;
                }
            }
            colourId = Integer.parseInt(this.getParameter("colourid"));
            if (colourId < 0 || colourId >= loadingBarFillColour.length)
                colourId = 0;
            if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1)
                Node_Sub31_Sub10.aBoolean5880 = Class50.aBoolean380 = true;
            String string_27_ = this.getParameter("frombilling");
            if (string_27_ != null && string_27_.equals("true"))
                fromBilling = true;
            String sskey = this.getParameter("sskey");
            Class201.aByteArray1448 = Class62_Sub3.method1364(-25417, Class62_Sub13.method1407(sskey, 97));
            if (Class201.aByteArray1448.length < 16)
                Class201.aByteArray1448 = null;
            String force64mbr = this.getParameter("force64mb");
            if (force64mbr != null && force64mbr.equals("true"))
                force64MB = true;
            String worldflags = this.getParameter("worldflags");
            if (worldflags != null) {
                try {
                    worldFlags = Integer.parseInt(worldflags);
                } catch (Exception exception) {
                    /* empty */
                }
            }
            String userFlow = this.getParameter("userFlow");
            if (userFlow != null) {
                try {
                    client.userFlow = Long.parseLong(userFlow);
                } catch (NumberFormatException numberformatexception) {
                    /* empty */
                }
            }
            additionalInfo = this.getParameter("additionalInfo");
            if (additionalInfo != null && additionalInfo.length() > 50)
                additionalInfo = null;
            clientInstance = this;
            if (selectedGame == GameEnum.RUNESCAPE) {
                gameHeight = 503;
                gameWidth = 765;
            } else if (selectedGame == GameEnum.STELLARDAWN) {
                gameHeight = 480;
                gameWidth = 640;
            }
            this.initializeApplet(gameWidth, gameHeight, selectedGame.name, 649, modeWhat.getId() + 32, 37, false);
        }
    }

    static final void method111(int argument) {
        int anLocalInt = Class224.anInt1578;
        int[] anLocalInts = Class242.anIntArray1769;
        int anLocalInt_32_ = (DoublyLinkedNodeP2_Sub2_Sub4.aBoolean6422 ? anLocalInt : anLocalInt + dba_sub_772_Sub2.anInt6369);
        for (int anLocalInt_33_ = 0; anLocalInt_33_ < anLocalInt_32_; anLocalInt_33_++) {
            Entity entity;
            if (anLocalInt_33_ < anLocalInt)
                entity = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[anLocalInts[anLocalInt_33_]]);
            else
                entity = ((Node_Sub35) Class294.aJagexHashMap_2453.get((long) (DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616[anLocalInt_33_ - anLocalInt]))).aClass104_Sub2_Sub2_Sub5_Sub1_4157;
            if (entity.lightingHL == argument) {
                entity.anInt6749 = 0;
                if ((entity.anInt6786) < 0)
                    entity.aBoolean6751 = false;
                else {
                    int anLocalInt_34_ = entity.method1830(-128);
                    if ((anLocalInt_34_ & 0x1) == 0) {
                        if (((entity.worldX) & 0x1ff) != 0 || ((entity.worldZ) & 0x1ff) != 0) {
                            entity.aBoolean6751 = false;
                            continue;
                        }
                    } else if (((entity.worldX) & 0x1ff) != 256 || ((entity.worldZ) & 0x1ff) != 256) {
                        entity.aBoolean6751 = false;
                        continue;
                    }
                    if (anLocalInt_34_ == 1) {
                        int anLocalInt_35_ = ((entity.worldX) >> 9);
                        int anLocalInt_36_ = ((entity.worldZ) >> 9);
                        if (entity.anInt6786 != (Class133.anIntArrayArray1066[anLocalInt_35_][anLocalInt_36_])) {
                            entity.aBoolean6751 = true;
                            continue;
                        }
                        if ((Class119.anIntArrayArray970[anLocalInt_35_][anLocalInt_36_]) > 1) {
                            Class119.anIntArrayArray970[anLocalInt_35_][anLocalInt_36_]--;
                            entity.aBoolean6751 = true;
                            continue;
                        }
                    } else {
                        int anLocalInt_37_ = (anLocalInt_34_ - 1) * 256 + 252;
                        int anLocalInt_38_ = ((entity.worldX) - anLocalInt_37_ >> 9);
                        int anLocalInt_39_ = ((entity.worldZ) - anLocalInt_37_ >> 9);
                        int anLocalInt_40_ = ((entity.worldX) + anLocalInt_37_ >> 9);
                        int anLocalInt_41_ = ((entity.worldZ) + anLocalInt_37_ >> 9);
                        if (!Class273.method3376(anLocalInt_41_, anLocalInt_38_, anLocalInt_39_, 7, (entity.anInt6786), anLocalInt_40_)) {
                            for (int anLocalInt_42_ = anLocalInt_38_; anLocalInt_42_ <= anLocalInt_40_; anLocalInt_42_++) {
                                for (int anLocalInt_43_ = anLocalInt_39_; anLocalInt_43_ <= anLocalInt_41_; anLocalInt_43_++) {
                                    if (entity.anInt6786 == (Class133.anIntArrayArray1066[anLocalInt_42_][anLocalInt_43_]))
                                        Class119.anIntArrayArray970[anLocalInt_42_][anLocalInt_43_]--;
                                }
                            }
                            entity.aBoolean6751 = true;
                            continue;
                        }
                    }
                    entity.aBoolean6751 = false;
                    ((DoublyLinkedNodeP2_Sub2) entity).anInt4511 = (Node_Sub31_Sub36.method993((entity.lightingHL), (entity.worldX), -12040, (entity.worldZ)));
                    Node_Sub47_Sub6.method1126(entity, true);
                }
            }
        }
    }

    static final boolean method112(int argument) {
        boolean anLocalBoolean = true;
        if (Class62_Sub10.aClass83_4400 == null) {
            if (Class205.aJs5Store_1472.isFlatFile(Statics.anInt4154))
                Class62_Sub10.aClass83_4400 = Class83.method1609(Class205.aJs5Store_1472, Statics.anInt4154);
            else
                anLocalBoolean = false;
        }
        if (Class392.aClass83_3294 == null) {
            if (!Class205.aJs5Store_1472.isFlatFile(Class329.anInt2699))
                anLocalBoolean = false;
            else
                Class392.aClass83_3294 = Class83.method1609(Class205.aJs5Store_1472, Class329.anInt2699);
        }
        if (JagexHash.aClass83_1676 == null) {
            if (!Class205.aJs5Store_1472.isFlatFile(Class62_Sub16.anInt4419))
                anLocalBoolean = false;
            else
                JagexHash.aClass83_1676 = Class83.method1609(Class205.aJs5Store_1472, Class62_Sub16.anInt4419);
        }
        if (Class167.aClass76_1221 == null) {
            if (fontCache.isFlatFile(Class193.anInt1413))
                Class167.aClass76_1221 = Class359.method3944(fontCache, -5707, Class193.anInt1413);
            else
                anLocalBoolean = false;
        }
        if (Statics.aClass83Array6378 == null) {
            if (!Class205.aJs5Store_1472.isFlatFile(Class193.anInt1413))
                anLocalBoolean = false;
            else
                Statics.aClass83Array6378 = Class83.method1605(Class205.aJs5Store_1472, Class193.anInt1413);
        }
        return anLocalBoolean;
    }

    final void method100(int argument_44_) {
        if (argument_44_ != -23014)
            method118(51);
        if (force64MB)
            ClanSettingsDelta.anInt1544 = 64;
        Frame frame = new Frame("Jagex");
        frame.pack();
        frame.dispose();
        Class46_Sub1.method436(2445);
        threadSafeDiskBackedCache = new ThreadSafeDiskBackedCache(baseSignlink);
        js5client = new Js5Client();
        ByteArrayManager.initialize(new int[]{1000, 100}, new int[]{20, 260});
        if (modeWhere != TestingStageEnum.LIVE)
            Class166.aByteArrayArray1214 = new byte[50][];
        AthmosphericConditions.aClass59_Sub50_116 = Class362.method3962(0);
        if (modeWhere == TestingStageEnum.LIVE)
            gameServer.address = this.getCodeBase().getHost();
        else if (TestingStageEnum.isValid(modeWhere)) {
            gameServer.address = this.getCodeBase().getHost();
            gameServer.primaryPort = gameServer.id + 40000;
            lobbyServer.primaryPort = lobbyServer.id + 40000;
            demoServer.primaryPort = demoServer.id + 40000;
            gameServer.secundaryPort = gameServer.id + 50000;
            lobbyServer.secundaryPort = lobbyServer.id + 50000;
            demoServer.secundaryPort = demoServer.id + 50000;
        } else if (modeWhere == TestingStageEnum.LOCAL) {
            gameServer.address = "127.0.0.1";
            lobbyServer.address = "127.0.0.1";
            demoServer.address = "127.0.0.1";
            gameServer.primaryPort = gameServer.id + 40000;
            lobbyServer.primaryPort = lobbyServer.id + 40000;
            demoServer.primaryPort = demoServer.id + 40000;
            gameServer.secundaryPort = gameServer.id + 50000;
            lobbyServer.secundaryPort = lobbyServer.id + 50000;
            demoServer.secundaryPort = demoServer.id + 50000;
        }
        Class_aa_Sub2.aShortArray3754 = Class1_Sub1.aShortArray5599 = Class62_Sub27.aShortArray4449 = Class70.aShortArray483 = new short[256];
        Statics.aGameServer_6149 = gameServer;
        if (GameEnum.STELLARDAWN == selectedGame) {
            AthmosphericConditions.defaultFogColour = 0;
            Statics.aBoolean1392 = true;
            AthmosphericConditions.sunColour = 16777215;
            Statics.aShortArrayArrayArray270 = Class191.aShortArrayArrayArray1404;
            Class42.aShortArrayArray3543 = Node_Sub38.aShortArrayArray4177;
        } else if (selectedGame == GameEnum.GAME3) {
            Statics.aShortArrayArrayArray270 = Node_Sub31_Sub37.aShortArrayArrayArray6021;
            Class42.aShortArrayArray3543 = Class62_Sub24.aShortArrayArray4440;
        } else {
            Class42.aShortArrayArray3543 = Class26.aShortArrayArray172;
            Statics.aShortArrayArrayArray270 = Class167.aShortArrayArrayArray1222;
        }
        if (GameEnum.RUNESCAPE == selectedGame)
            Class360.aBoolean3045 = false;
        try {
            clipboard = clientInstance.getToolkit().getSystemClipboard();
        } catch (Exception exception) {
            /* empty */
        }
        keyHandler = AbstractKeyHandler.create(gameCanvas);
        mouseHandler = AbstractMouseHandler.create(true, gameCanvas);
        try {
            if (baseSignlink.cacheDataFile != null) {
                cacheDataFile = new BufferedFile((baseSignlink.cacheDataFile), 5200, 0);
                for (int anLocalInt = 0; anLocalInt < 37; anLocalInt++)
                    cacheIndexFile[anLocalInt] = new BufferedFile((baseSignlink.cacheIndexFiles[anLocalInt]), 6000, 0);
                idx255File = new BufferedFile((baseSignlink.idx255File), 6000, 0);
                cache255 = new DiskBackedCache(255, cacheDataFile, idx255File, 500000);
                randomFile = new BufferedFile((baseSignlink.randomFile), 24, 0);
                baseSignlink.cacheIndexFiles = null;
                baseSignlink.randomFile = null;
                baseSignlink.cacheDataFile = null;
                baseSignlink.idx255File = null;
            }
        } catch (java.io.IOException ioexception) {
            cache255 = null;
            cacheDataFile = null;
            randomFile = null;
            idx255File = null;
        }
        if (modeWhere != TestingStageEnum.LIVE)
            Node_Sub31_Sub27.aBoolean5959 = true;
        loadingText = MultilanguageString.LOADING_PLEASE_WAIT.getLocalizedString(language);
    }

    public static final void main(String[] argv) {
        try {
            if (argv.length != 6)
                throwCommandLineError("Argument count", (byte) -72);
            gameServer = new GameServer();
            gameServer.id = Integer.parseInt(argv[0]);
            lobbyServer = new GameServer();
            lobbyServer.id = Integer.parseInt(argv[1]);
            demoServer = new GameServer();
            demoServer.id = Integer.parseInt(argv[2]);
            modeWhere = TestingStageEnum.LOCAL;
            if (argv[3].equals("live")) {
                modeWhat = ModeWhatEnum.LIVE;
            } else if (argv[3].equals("rc")) {
                modeWhat = ModeWhatEnum.RC;
            } else if (argv[3].equals("wip")) {
                modeWhat = ModeWhatEnum.WIP;
            } else {
                throwCommandLineError("modewhat", (byte) -82);
            }
            language = parseLanguageString(argv[4], -1);
            if (language == -1) {
                if (argv[4].equals("english")) {
                    language = 0;
                } else if (argv[4].equals("german"))
                    language = 1;
                else
                    throwCommandLineError("language", (byte) -88);
            }
            objectTagApplet = false;
            useJavaScript = false;
            if (argv[5].equals("game0"))
                selectedGame = GameEnum.RUNESCAPE;
            else if (argv[5].equals("game1"))
                selectedGame = GameEnum.STELLARDAWN;
            else if (argv[5].equals("game2"))
                selectedGame = GameEnum.GAME2;
            else if (argv[5].equals("game3"))
                selectedGame = GameEnum.GAME3;
            else
                throwCommandLineError("game", (byte) -58);
            settingsString = "";
            colourId = selectedGame.id;
            worldFlags = 0;
            country = 0;
            additionalInfo = null;
            Class201.aByteArray1448 = null;
            Node_Sub31_Sub10.aBoolean5880 = Class50.aBoolean380 = true;
            force64MB = false;
            fromBilling = false;
            affiliateId = 0;
            userFlow = 0L;
            client var_client = new client();
            clientInstance = var_client;
            var_client.initialize(selectedGame.name, 649, 1024, 768, modeWhat.getId() + 32, 37, 0, false);
            gameFrame.setLocation(40, 40);
        } catch (Exception exception) {
            ErrorReporting.reportError(null, exception);
        }
    }

    final String method85(int argument_45_) {
        String string = null;
        try {
            string = ("[1)" + MapRelated.baseX + "," + MapRelated.baseZ + "," + MapRelated.mapWidth + "," + MapRelated.mapDepth + "|");
            if (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587 != null)
                string += ("2)" + Class176.anInt1308 + "," + (MapRelated.baseX + (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.pathX[0])) + "," + (MapRelated.baseZ + (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.pathZ[0])) + "|");
            string += ("3)" + AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4295.method1464(62) + "|4)" + AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub6_4317.method1377(120) + "|5)" + DoublyLinkedNode_Sub51_Sub13.method1262(-117) + "|6)" + canvasWidth + "," + canvasHeight + "|");
            string += "7)" + AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub16_4308.method1421(5) + "|";
            string += "8)" + AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub8_4331.method1388(92) + "|";
            string += "9)" + AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub20_4334.method1435(28) + "|";
            string += "10)" + AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub19_4323.method1432(98) + "|";
            string += "11)" + AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub14_4327.method1414(75) + "|";
            string += "12)" + AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub25_4332.method1458(88) + "|";
            string += "13)" + ClanSettingsDelta.anInt1544 + "|";
            string += "14)" + Statics.anInt1652;
            if (Statics.aClass59_Sub44_1064 != null)
                string += "|15)" + (Statics.aClass59_Sub44_1064.anInt4246);
            try {
                if (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4295.method1464(90) == 2) {
                    Class var_class = Class.forName("java.lang.ClassLoader");
                    Field field = var_class.getDeclaredField("nativeLibraries");
                    Class var_class_46_ = Class.forName("java.lang.reflect.AccessibleObject");
                    Method method = var_class_46_.getDeclaredMethod("setAccessible", (new Class[]{Boolean.TYPE}));
                    method.invoke(field, new Object[]{Boolean.TRUE});
                    Vector vector = ((Vector) field.get((aClass3744 != null ? aClass3744 : (aClass3744 = method124("client"))).getClassLoader()));
                    for (int anLocalInt = 0; anLocalInt < vector.size(); anLocalInt++) {
                        try {
                            Object object = vector.elementAt(anLocalInt);
                            Field field_47_ = object.getClass().getDeclaredField("name");
                            method.invoke(field_47_, new Object[]{Boolean.TRUE});
                            try {
                                String string_48_ = (String) field_47_.get(object);
                                if (string_48_ != null && string_48_.indexOf("sw3d.dll") != -1) {
                                    Field field_49_ = object.getClass().getDeclaredField("handle");
                                    method.invoke(field_49_, (new Object[]{Boolean.TRUE}));
                                    string += ("|16)" + (Long.toHexString(field_49_.getLong(object))));
                                    method.invoke(field_49_, (new Object[]{Boolean.FALSE}));
                                }
                            } catch (Throwable throwable) {
                                /* empty */
                            }
                            method.invoke(field_47_, new Object[]{Boolean.FALSE});
                        } catch (Throwable throwable) {
                            /* empty */
                        }
                    }
                }
            } catch (Throwable throwable) {
                /* empty */
            }
            string += "]";
        } catch (Throwable throwable) {
            /* empty */
        }
        return string;
    }

    private final void method113(boolean argument_50_) {
        if (Statics.anInt1652 != 14) {
            long l = Class6.method228(1727) / 1000000L - Class167.aLong1223;
            Class167.aLong1223 = Class6.method228(1727) / 1000000L;
            boolean anLocalBoolean = Class313.method3624(!argument_50_);
            if (anLocalBoolean && Class154.aBoolean3618 && tia_sub_35_Sub1DoublyLinked.aClass112_6659 != null)
                tia_sub_35_Sub1DoublyLinked.aClass112_6659.method2001(-13368);
            if (DoublyLinkedNode_Sub51_Sub3.method1185(-44, Statics.anInt1652)) {
                if (Class60.aLong433 == 0L || getGameTime() <= Class60.aLong433) {
                    if (!Class389.aGraphicsToolkit3281.method2076() && shouldRepaint)
                        Statics.method2726(7349);
                } else
                    Class127.method2418(Class253_Sub2.anInt5670, -352753888, DoublyLinkedNode_Sub51_Sub13.method1262(-88), Class212.anInt1508, false);
            }
            if (overridingFrame == null) {
                java.awt.Container container;
                if (gameFrame == null) {
                    if (Signlink.mainapp == null)
                        container = currentInstance;
                    else
                        container = Signlink.mainapp;
                } else
                    container = gameFrame;
                int anLocalInt = container.getSize().width;
                int anLocalInt_51_ = container.getSize().height;
                if (gameFrame == container) {
                    Insets insets = gameFrame.getInsets();
                    anLocalInt -= insets.left + insets.right;
                    anLocalInt_51_ -= insets.top + insets.bottom;
                }
                if (containerWidth != anLocalInt || containerHeight != anLocalInt_51_ || Node_Sub50.aBoolean4325) {
                    if (Class389.aGraphicsToolkit3281 == null || Class389.aGraphicsToolkit3281.method2049())
                        Class46_Sub1.method436(2445);
                    else {
                        containerWidth = anLocalInt;
                        containerHeight = anLocalInt_51_;
                    }
                    Class60.aLong433 = getGameTime() - -500L;
                    Node_Sub50.aBoolean4325 = false;
                }
            }
            if (overridingFrame != null && !Node_Sub31_Sub31.aBoolean5990 && DoublyLinkedNode_Sub51_Sub3.method1185(-62, Statics.anInt1652))
                Class127.method2418(-1, -352753888, AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub4_4300.method1368(113), -1, false);
            boolean anLocalBoolean_52_ = argument_50_;
            if (Node_Sub49.aBoolean4293) {
                Node_Sub49.aBoolean4293 = false;
                anLocalBoolean_52_ = true;
            }
            if (anLocalBoolean_52_)
                Node_Sub31_Sub31.method970(true);
            if ((Class389.aGraphicsToolkit3281 != null && Class389.aGraphicsToolkit3281.method2076()) || DoublyLinkedNode_Sub51_Sub13.method1262(-100) != 1)
                Class305.method3596(0);
            if (!Class360.method3950(true, Statics.anInt1652)) {
                if (DoublyLinkedNodeP2_Sub2_Sub1_Sub2.method1792(Statics.anInt1652, (byte) -49))
                    Cs2CallStackEntry.method1547(-343);
                else if (Class209.method2954(Statics.anInt1652, 83))
                    Cs2CallStackEntry.method1547(-343);
                else if (Class159.method2597(Statics.anInt1652, -31175)) {
                    if (MapRelated.missingFileType == 1) {
                        if (Class2_Sub2.anInt3770 < MapRelated.missingFileCount)
                            Class2_Sub2.anInt3770 = MapRelated.missingFileCount;
                        int anLocalInt = ((Class2_Sub2.anInt3770 - MapRelated.missingFileCount) * 50 / Class2_Sub2.anInt3770);
                        Class62_Sub10.method1395(Node_Sub47_Sub9.aAbstractFont_6203, Class389.aGraphicsToolkit3281, Statics.aClass76_3433, true, -71, (MultilanguageString.LOADING_PLEASE_WAIT.getLocalizedString(language) + "<br>(" + anLocalInt + "%)"));
                    } else if (MapRelated.missingFileType != 2)
                        Class62_Sub10.method1395(Node_Sub47_Sub9.aAbstractFont_6203, Class389.aGraphicsToolkit3281, Statics.aClass76_3433, true, -92, MultilanguageString.LOADING_PLEASE_WAIT.getLocalizedString(language));
                    else {
                        if (Class373.anInt3201 < Class164.anInt1199)
                            Class373.anInt3201 = Class164.anInt1199;
                        int anLocalInt = (((Class373.anInt3201 - Class164.anInt1199) * 50 / Class373.anInt3201) + 50);
                        Class62_Sub10.method1395(Node_Sub47_Sub9.aAbstractFont_6203, Class389.aGraphicsToolkit3281, Statics.aClass76_3433, true, -93, (MultilanguageString.LOADING_PLEASE_WAIT.getLocalizedString(language) + "<br>(" + anLocalInt + "%)"));
                    }
                } else if (Statics.anInt1652 == 10)
                    Statics.method551(l, true);
                else if (Statics.anInt1652 == 13)
                    Class62_Sub10.method1395(Node_Sub47_Sub9.aAbstractFont_6203, Class389.aGraphicsToolkit3281, Statics.aClass76_3433, false, -105, (MultilanguageString.CONNECTION_LOST.getLocalizedString(language) + "<br>" + MultilanguageString.ATTEMPT_RECONNECT.getLocalizedString(language)));
            } else
                Class46_Sub2.method445(0, anLocalBoolean_52_);
            if (Class371.anInt3190 == 3) {
                for (int anLocalInt = 0; Node_Sub47_Sub8.anInt6193 > anLocalInt; anLocalInt++) {
                    Rectangle rectangle = Class_s.aRectangleArray2545[anLocalInt];
                    if (Class1_Sub1.aBooleanArray5600[anLocalInt])
                        Class389.aGraphicsToolkit3281.method2028(rectangle.y, (byte) 40, rectangle.height, -65281, rectangle.x, rectangle.width);
                    else if (!Class189_Sub3.aBooleanArray5651[anLocalInt])
                        Class389.aGraphicsToolkit3281.method2028(rectangle.y, (byte) 40, rectangle.height, -16711936, rectangle.x, rectangle.width);
                    else
                        Class389.aGraphicsToolkit3281.method2028(rectangle.y, (byte) 40, rectangle.height, -65536, rectangle.x, rectangle.width);
                }
            }
            if (Statics.method740(argument_50_))
                Class131.method2435(Class389.aGraphicsToolkit3281, 3);
            if (baseSignlink.useWin32 && DoublyLinkedNode_Sub51_Sub3.method1185(1, Statics.anInt1652) && Class371.anInt3190 == 0 && DoublyLinkedNode_Sub51_Sub13.method1262(-128) == 1 && !anLocalBoolean_52_) {
                int anLocalInt = 0;
                for (int anLocalInt_53_ = 0; Node_Sub47_Sub8.anInt6193 > anLocalInt_53_; anLocalInt_53_++) {
                    if (Class189_Sub3.aBooleanArray5651[anLocalInt_53_]) {
                        Class189_Sub3.aBooleanArray5651[anLocalInt_53_] = false;
                        Class350.aRectangleArray2926[anLocalInt++] = Class_s.aRectangleArray2545[anLocalInt_53_];
                    }
                }
                try {
                    if (!Class52.aBoolean391)
                        Class389.aGraphicsToolkit3281.method2056(Class350.aRectangleArray2926, anLocalInt, argument_50_);
                    else
                        DoublyLinkedNodeP2_Sub4_Sub2.method1912(-2, anLocalInt, (Class350.aRectangleArray2926));
                } catch (Exception_Sub1 exception_sub1) {
                    /* empty */
                }
            } else if (!Class360.method3950(true, Statics.anInt1652)) {
                for (int anLocalInt = 0; anLocalInt < Node_Sub47_Sub8.anInt6193; anLocalInt++)
                    Class189_Sub3.aBooleanArray5651[anLocalInt] = false;
                try {
                    if (Class52.aBoolean391)
                        Statics.method2502((byte) 121);
                    else
                        Class389.aGraphicsToolkit3281.method2086((byte) -111);
                } catch (Exception_Sub1 exception_sub1) {
                    ErrorReporting.reportError((exception_sub1.getMessage() + " (Recovered) " + method85(69)), exception_sub1);
                    Class215.method2991((byte) -41, false, 0);
                }
            }
            Node_Sub50.method1167(-16);
            int anLocalInt = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub17_4320.method1422(113);
            if (anLocalInt == 0)
                Timing.sleep(15L);
            else if (anLocalInt != 1) {
                if (anLocalInt != 2) {
                    if (anLocalInt == 3)
                        Timing.sleep(2L);
                } else
                    Timing.sleep(5L);
            } else
                Timing.sleep(10L);
            if (HardwareLight.aBoolean3891)
                Node_Sub6.method564(101);
            if (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub15_4322.method1416(105) == 1 && Statics.anInt1652 == 3 && Class66.anInt467 != -1) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub15_4322), 98);
                Class251.method3240(false);
            }
        }
    }

    private final void method114(byte argument_54_) {
        if (argument_54_ == 120) {
            boolean anLocalBoolean = js5client.processRequests();
            if (!anLocalBoolean)
                method110(argument_54_ - 17);
        }
    }

    static final void method115(RsInterface[] argument, int argument_55_, int argument_56_, int argument_57_, int argument_58_, int argument_59_, int argument_60_, int argument_61_, int argument_62_, int argument_63_, int argument_64_, int argument_65_) {
        for (int anLocalInt = 0; anLocalInt < argument.length; anLocalInt++) {
            RsInterface rsInterface = argument[anLocalInt];
            if (rsInterface != null && rsInterface.parentId == argument_55_) {
                int anLocalInt_66_ = rsInterface.renderX + argument_60_;
                int anLocalInt_67_ = rsInterface.renderY + argument_61_;
                int anLocalInt_68_;
                int anLocalInt_69_;
                int anLocalInt_70_;
                int anLocalInt_71_;
                if (rsInterface.type == 2) {
                    anLocalInt_68_ = argument_56_;
                    anLocalInt_69_ = argument_57_;
                    anLocalInt_70_ = argument_58_;
                    anLocalInt_71_ = argument_59_;
                } else {
                    int anLocalInt_72_ = anLocalInt_66_ + rsInterface.renderWidth;
                    int anLocalInt_73_ = anLocalInt_67_ + rsInterface.renderHeight;
                    if (rsInterface.type == 9) {
                        anLocalInt_72_++;
                        anLocalInt_73_++;
                    }
                    anLocalInt_68_ = (anLocalInt_66_ > argument_56_ ? anLocalInt_66_ : argument_56_);
                    anLocalInt_69_ = (anLocalInt_67_ > argument_57_ ? anLocalInt_67_ : argument_57_);
                    anLocalInt_70_ = (anLocalInt_72_ < argument_58_ ? anLocalInt_72_ : argument_58_);
                    anLocalInt_71_ = (anLocalInt_73_ < argument_59_ ? anLocalInt_73_ : argument_59_);
                }
                if (rsInterface.type != 0 && !rsInterface.aBoolean1908 && method122(rsInterface).anInt4005 == 0 && rsInterface != Class235.aRsInterface_1717 && (rsInterface.anInt1859 != Node_Sub39.anInt4198) && (rsInterface.anInt1859 != RuntimeException_Sub2.anInt3428)) {
                    if (anLocalInt_68_ < anLocalInt_70_ && anLocalInt_69_ < anLocalInt_71_)
                        Node_Sub28_Sub1.method838(rsInterface, 298724582);
                } else if (!method108(rsInterface)) {
                    int anLocalInt_74_ = 0;
                    int anLocalInt_75_ = 0;
                    if (Class52.aBoolean391) {
                        anLocalInt_74_ = Node_Sub52.method1319(99);
                        anLocalInt_75_ = Class82.method1596(-2);
                    }
                    if (rsInterface == dba_sub_772.aRsInterface_4345 && (Canvas_Sub1.method127(-105, dba_sub_772.aRsInterface_4345) != null)) {
                        Statics.aBoolean1729 = true;
                        Statics.anInt5581 = anLocalInt_66_;
                        Class253.anInt3721 = anLocalInt_67_;
                    }
                    if (rsInterface.aBoolean1923 || (anLocalInt_68_ < anLocalInt_70_ && anLocalInt_69_ < anLocalInt_71_)) {
                        if (rsInterface.aBoolean1942 && argument_64_ >= anLocalInt_68_ && argument_65_ >= anLocalInt_69_ && argument_64_ < anLocalInt_70_ && argument_65_ < anLocalInt_71_) {
                            for (Cs2Trigger class59_sub27 = ((Cs2Trigger) DoublyLinkedNode_Sub51_Sub19.triggerQueue.getFirst()); class59_sub27 != null; class59_sub27 = (Cs2Trigger) DoublyLinkedNode_Sub51_Sub19.triggerQueue.getNext()) {
                                if (class59_sub27.aBoolean4106) {
                                    class59_sub27.unlink();
                                    class59_sub27.aRsInterface_4115.aBoolean1911 = false;
                                }
                            }
                            if (Statics.anInt5604 == 0) {
                                dba_sub_772.aRsInterface_4345 = null;
                                Class235.aRsInterface_1717 = null;
                            }
                            Class123.anInt1002 = 0;
                            Class62_Sub18.aBoolean4423 = false;
                            DxSkybox.aBoolean4473 = false;
                            if (!Node_Sub31_Sub39.aBoolean6055)
                                Statics.method3267(1024);
                        }
                        boolean anLocalBoolean;
                        if ((mouseHandler.getX() + anLocalInt_74_) >= anLocalInt_68_ && (mouseHandler.getY() + anLocalInt_75_) >= anLocalInt_69_ && (mouseHandler.getX() + anLocalInt_74_) < anLocalInt_70_ && (mouseHandler.getY() + anLocalInt_75_) < anLocalInt_71_)
                            anLocalBoolean = true;
                        else
                            anLocalBoolean = false;
                        if (!Class353.aBoolean2953 && anLocalBoolean) {
                            if (rsInterface.anInt1927 >= 0)
                                Class62_Sub10.anInt4399 = rsInterface.anInt1927;
                            else if (rsInterface.aBoolean1942)
                                Class62_Sub10.anInt4399 = -1;
                        }
                        if (!Node_Sub31_Sub39.aBoolean6055 && argument_64_ >= anLocalInt_68_ && argument_65_ >= anLocalInt_69_ && argument_64_ < anLocalInt_70_ && argument_65_ < anLocalInt_71_)
                            DoublyLinkedNode_Sub51_Sub19.method1294((byte) -61, argument_64_ - anLocalInt_66_, rsInterface, argument_65_ - anLocalInt_67_);
                        boolean anLocalBoolean_76_ = false;
                        if (mouseHandler.isLeftButtonDown() && anLocalBoolean)
                            anLocalBoolean_76_ = true;
                        boolean anLocalBoolean_77_ = false;
                        AbstractMouseMessage class59_sub46 = (AbstractMouseMessage) Class376.aCyclicLinkedList_3214.getFirst();
                        if (class59_sub46 != null && class59_sub46.getAction() == 0 && (class59_sub46.getX() + anLocalInt_74_ >= anLocalInt_68_) && (class59_sub46.getY() + anLocalInt_75_ >= anLocalInt_69_) && (class59_sub46.getX() + anLocalInt_74_ < anLocalInt_70_) && (class59_sub46.getY() + anLocalInt_75_ < anLocalInt_71_))
                            anLocalBoolean_77_ = true;
                        if (rsInterface.aByteArray1827 != null && !Statics.method740(false)) {
                            for (int anLocalInt_78_ = 0; anLocalInt_78_ < (rsInterface.aByteArray1827).length; anLocalInt_78_++) {
                                if (!keyHandler.isKeyDown((rsInterface.aByteArray1827[anLocalInt_78_]))) {
                                    if (rsInterface.anIntArray1915 != null)
                                        rsInterface.anIntArray1915[anLocalInt_78_] = 0;
                                } else if ((rsInterface.anIntArray1915) == null || (Class333.anInt2720 >= (rsInterface.anIntArray1915[anLocalInt_78_]))) {
                                    byte anLocalInt_79_ = (rsInterface.aByteArray1966[anLocalInt_78_]);
                                    if (anLocalInt_79_ == 0 || (((anLocalInt_79_ & 0x8) == 0 || (!keyHandler.isKeyDown(86) && !keyHandler.isKeyDown(82) && !keyHandler.isKeyDown(81))) && ((anLocalInt_79_ & 0x2) == 0 || keyHandler.isKeyDown(86)) && ((anLocalInt_79_ & 0x1) == 0 || keyHandler.isKeyDown(82)) && ((anLocalInt_79_ & 0x4) == 0 || keyHandler.isKeyDown(81)))) {
                                        if (anLocalInt_78_ < 10)
                                            Node_Sub47.method1111(true, -1, (rsInterface.idHash), "", anLocalInt_78_ + 1);
                                        else if (anLocalInt_78_ == 10) {
                                            Class362.method3964(0);
                                            Node_Sub18 class59_sub18 = method122(rsInterface);
                                            Class123.method2392(class59_sub18.anInt4008, rsInterface, -112, class59_sub18.method709(0));
                                            AbstractFont.aString416 = (Class62_Sub9.method1391(rsInterface, (byte) -93));
                                            if (AbstractFont.aString416 == null)
                                                AbstractFont.aString416 = "Null";
                                            Statics.aString6376 = ((rsInterface.aString1968) + "<col=ffffff>");
                                        }
                                        int anLocalInt_80_ = (rsInterface.anIntArray1964[anLocalInt_78_]);
                                        if ((rsInterface.anIntArray1915) == null)
                                            rsInterface.anIntArray1915 = (new int
                                                    [(rsInterface.aByteArray1827).length]);
                                        if (anLocalInt_80_ != 0)
                                            rsInterface.anIntArray1915[anLocalInt_78_] = (Class333.anInt2720 + anLocalInt_80_);
                                        else
                                            rsInterface.anIntArray1915[anLocalInt_78_] = 2147483647;
                                    }
                                }
                            }
                        }
                        if (anLocalBoolean_77_)
                            Statics.method411((anLocalInt_75_ + class59_sub46.getY() - anLocalInt_67_), (anLocalInt_74_ + class59_sub46.getX() - anLocalInt_66_), rsInterface, 114);
                        if (dba_sub_772.aRsInterface_4345 != null && dba_sub_772.aRsInterface_4345 != rsInterface && anLocalBoolean && method122(rsInterface).method706((byte) -55))
                            Class131.aRsInterface_1061 = rsInterface;
                        if (rsInterface == Class235.aRsInterface_1717) {
                            GlImageSkybox.aBoolean829 = true;
                            Statics.anInt3517 = anLocalInt_66_;
                            Class22.anInt140 = anLocalInt_67_;
                        }
                        if (rsInterface.aBoolean1908 || rsInterface.anInt1859 != 0) {
                            if (anLocalBoolean && Class62_Sub8.anInt4396 != 0 && (rsInterface.anObjectArray1955 != null)) {
                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                class59_sub27.aBoolean4106 = true;
                                class59_sub27.aRsInterface_4115 = rsInterface;
                                class59_sub27.anInt4108 = Class62_Sub8.anInt4396;
                                class59_sub27.parameters = rsInterface.anObjectArray1955;
                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                            }
                            if (dba_sub_772.aRsInterface_4345 != null || Node_Sub31_Sub39.aBoolean6055 || ((rsInterface.anInt1859 != Class32.anInt214) && Class123.anInt1002 > 0)) {
                                anLocalBoolean_77_ = false;
                                anLocalBoolean_76_ = false;
                                anLocalBoolean = false;
                            }
                            if (rsInterface.anInt1859 != 0) {
                                if ((rsInterface.anInt1859 == Class283.anInt2276) || (rsInterface.anInt1859 == DoublyLinkedNodeP2_Sub2_Sub5.anInt6426)) {
                                    Class133.aRsInterface_1065 = rsInterface;
                                    if (Class_s.aClass195_2551 != null)
                                        Class_s.aClass195_2551.method2893((byte) -123, Class389.aGraphicsToolkit3281, rsInterface.renderHeight);
                                    if (rsInterface.anInt1859 == Class283.anInt2276) {
                                        if (!Node_Sub31_Sub39.aBoolean6055 && argument_64_ >= anLocalInt_68_ && argument_65_ >= anLocalInt_69_ && argument_64_ < anLocalInt_70_ && argument_65_ < anLocalInt_71_) {
                                            Class15.method302((byte) 86, argument_62_, argument_63_, Class389.aGraphicsToolkit3281);
                                            for (DoublyLinkedNodeP2_Sub5 class104_sub5 = ((DoublyLinkedNodeP2_Sub5) Class70.aClass366_481.method3986(0)); class104_sub5 != null; class104_sub5 = ((DoublyLinkedNodeP2_Sub5) (Class70.aClass366_481.method3992((byte) 71)))) {
                                                if ((argument_64_ >= (class104_sub5.anInt4532)) && (argument_64_ < (class104_sub5.anInt4530)) && (argument_65_ >= (class104_sub5.anInt4537)) && (argument_65_ < (class104_sub5.anInt4531))) {
                                                    Statics.method3267(1024);
                                                    Class246.method3200(120, (class104_sub5.aEntity_4533));
                                                }
                                            }
                                        }
                                        continue;
                                    }
                                }
                                if (rsInterface.anInt1859 == Node_Sub39.anInt4198) {
                                    if ((rsInterface.method3213(0, (Class389.aGraphicsToolkit3281)) != null) && (Node_Sub1.anInt3868 == 0 || Node_Sub1.anInt3868 == 3) && !Node_Sub31_Sub39.aBoolean6055 && argument_64_ >= anLocalInt_68_ && argument_65_ >= anLocalInt_69_ && argument_64_ < anLocalInt_70_ && argument_65_ < anLocalInt_71_) {
                                        int anLocalInt_81_ = argument_64_ - anLocalInt_66_;
                                        int anLocalInt_82_ = argument_65_ - anLocalInt_67_;
                                        int anLocalInt_83_ = (rsInterface.anIntArray1902[anLocalInt_82_]);
                                        if (anLocalInt_81_ >= anLocalInt_83_ && (anLocalInt_81_ <= (anLocalInt_83_ + (rsInterface.anIntArray1840[anLocalInt_82_])))) {
                                            anLocalInt_81_ -= (rsInterface.renderWidth) / 2;
                                            anLocalInt_82_ -= (rsInterface.renderHeight) / 2;
                                            int anLocalInt_84_;
                                            if (Statics.anInt1745 == 4)
                                                anLocalInt_84_ = ((int) (DoublyLinkedNodeP2_Sub6.aFloat4538) & 0x3fff);
                                            else
                                                anLocalInt_84_ = (((int) (DoublyLinkedNodeP2_Sub6.aFloat4538) + (Class2_Sub10.anInt3824)) & 0x3fff);
                                            int anLocalInt_85_ = (Node_Sub6.SINETABLE[anLocalInt_84_]);
                                            int anLocalInt_86_ = (Node_Sub6.COSINETABLE[anLocalInt_84_]);
                                            if (Statics.anInt1745 != 4) {
                                                anLocalInt_85_ = (anLocalInt_85_ * ((Node_Sub11.anInt3945) + 256)) >> 8;
                                                anLocalInt_86_ = (anLocalInt_86_ * ((Node_Sub11.anInt3945) + 256)) >> 8;
                                            }
                                            int anLocalInt_87_ = (((anLocalInt_82_ * anLocalInt_85_) + (anLocalInt_81_ * anLocalInt_86_)) >> 14);
                                            int anLocalInt_88_ = (((anLocalInt_82_ * anLocalInt_86_) - (anLocalInt_81_ * anLocalInt_85_)) >> 14);
                                            int anLocalInt_89_;
                                            int anLocalInt_90_;
                                            if (Statics.anInt1745 == 4) {
                                                anLocalInt_89_ = ((Class167.anInt1224 >> 9) + (anLocalInt_87_ >> 2));
                                                anLocalInt_90_ = ((Class61.anInt437 >> 9) - (anLocalInt_88_ >> 2));
                                            } else {
                                                int anLocalInt_91_ = (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.method1830(-125) - 1) * 256;
                                                anLocalInt_89_ = ((((Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.worldX) - anLocalInt_91_) >> 9) + (anLocalInt_87_ >> 2));
                                                anLocalInt_90_ = ((((Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.worldZ) - anLocalInt_91_) >> 9) - (anLocalInt_88_ >> 2));
                                            }
                                            if (Class353.aBoolean2953 && ((Node_Sub31_Sub4.anInt5855) & 0x40) != 0) {
                                                RsInterface rsInterface_92_ = (RsInterface.getCreatedChild(Class297.anInt2472, Statics.anInt1181));
                                                if (rsInterface_92_ != null)
                                                    Class173.method2769(false, AbstractFont.aString416, true, (rsInterface.anInt1870), " ->", (byte) 78, true, anLocalInt_89_, 2, (long) (((rsInterface.subId) << 0) | (rsInterface.idHash)), anLocalInt_90_, Class262.anInt2040, 1L);
                                                else
                                                    Class362.method3964(0);
                                            } else {
                                                if (selectedGame == GameEnum.STELLARDAWN)
                                                    Class173.method2769(false, (MultilanguageString.FACE_HERE.getLocalizedString((language))), true, -1, "", (byte) 86, true, anLocalInt_89_, 57, 0L, anLocalInt_90_, -1, 1L);
                                                Class173.method2769(false, Class316.aString2615, true, -1, "", (byte) -127, true, anLocalInt_89_, 51, 0L, anLocalInt_90_, Class8.anInt82, 1L);
                                            }
                                        }
                                    }
                                    continue;
                                }
                                if (rsInterface.anInt1859 == Class32.anInt214) {
                                    MultilanguageString.aRsInterface_2865 = rsInterface;
                                    if (anLocalBoolean)
                                        Class62_Sub18.aBoolean4423 = true;
                                    if (anLocalBoolean_77_) {
                                        int anLocalInt_93_ = (int) ((double) (anLocalInt_74_ + (class59_sub46.getX()) - anLocalInt_66_ - ((rsInterface.renderWidth) / 2)) * 2.0 / (double) (Class179.aFloat1335));
                                        int anLocalInt_94_ = (int) -((double) (anLocalInt_75_ + (class59_sub46.getY()) - anLocalInt_67_ - ((rsInterface.renderHeight) / 2)) * 2.0 / (double) (Class179.aFloat1335));
                                        int anLocalInt_95_ = (Node_Sub31_Sub21.anInt5930 + anLocalInt_93_ + Class179.anInt1353);
                                        int anLocalInt_96_ = (AbstractFont.anInt418 + anLocalInt_94_ + Class179.anInt1340);
                                        DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13 = Class97.method1720(-75);
                                        if (class59_sub51_sub13 != null) {
                                            int[] anLocalInts = new int[3];
                                            class59_sub51_sub13.method1268(anLocalInt_96_, anLocalInts, anLocalInt_95_, (byte) 117);
                                            if (anLocalInts != null) {
                                                if (keyHandler.isKeyDown(82) && Class15.anInt120 > 0) {
                                                    Class150.method2546(anLocalInts[0], 14328, anLocalInts[2], anLocalInts[1]);
                                                    continue;
                                                }
                                                DxSkybox.aBoolean4473 = true;
                                                Class25.anInt168 = anLocalInts[0];
                                                Statics.anInt1744 = anLocalInts[1];
                                                Class276.anInt2212 = anLocalInts[2];
                                            }
                                            Class123.anInt1002 = 1;
                                            Class350_Sub2.aBoolean5452 = false;
                                            Node_Sub31_Sub15_Sub1.anInt6637 = mouseHandler.getX();
                                            GlImageSkybox.anInt839 = mouseHandler.getY();
                                        }
                                    } else if (anLocalBoolean_76_ && Class123.anInt1002 > 0) {
                                        if (Class123.anInt1002 == 1 && (((Node_Sub31_Sub15_Sub1.anInt6637) != mouseHandler.getX()) || (GlImageSkybox.anInt839 != (mouseHandler.getY())))) {
                                            Class133_Sub1.anInt5009 = (Node_Sub31_Sub21.anInt5930);
                                            Class232.anInt1692 = AbstractFont.anInt418;
                                            Class123.anInt1002 = 2;
                                        }
                                        if (Class123.anInt1002 == 2) {
                                            Class350_Sub2.aBoolean5452 = true;
                                            Class62_Sub20.method1436((byte) 73, (Class133_Sub1.anInt5009 + (int) ((double) ((Node_Sub31_Sub15_Sub1.anInt6637) - (mouseHandler.getX())) * 2.0 / (double) (Class179.aFloat1328))));
                                            Class222_Sub2.method3038((Class232.anInt1692 - (int) ((double) ((GlImageSkybox.anInt839) - (mouseHandler.getY())) * 2.0 / (double) (Class179.aFloat1328))), (byte) 77);
                                        }
                                    } else {
                                        if (Class123.anInt1002 > 0 && !Class350_Sub2.aBoolean5452) {
                                            if ((Class121.anInt983 == 1 || Class62_Sub20.method1438(-121)) && Class62_Sub12.anInt4402 > 2)
                                                Node_Sub15.method693(GlImageSkybox.anInt839, (Node_Sub31_Sub15_Sub1.anInt6637), -120);
                                            else if (Class256_Sub3.method3287(true))
                                                Node_Sub15.method693(GlImageSkybox.anInt839, (Node_Sub31_Sub15_Sub1.anInt6637), -128);
                                        }
                                        Class123.anInt1002 = 0;
                                    }
                                    continue;
                                }
                                if (rsInterface.anInt1859 == Class107.anInt878) {
                                    if (anLocalBoolean_76_)
                                        Class353_Sub2.method3897((anLocalInt_75_ + mouseHandler.getY() - anLocalInt_67_), rsInterface.renderHeight, 22486, rsInterface.renderWidth, (anLocalInt_74_ + mouseHandler.getX() - anLocalInt_66_));
                                    continue;
                                }
                                if (rsInterface.anInt1859 == RuntimeException_Sub2.anInt3428) {
                                    Class62_Sub5.method1373(anLocalInt_66_, -123, rsInterface, anLocalInt_67_);
                                    continue;
                                }
                            }
                            if (!rsInterface.aBoolean1958 && anLocalBoolean_77_) {
                                rsInterface.aBoolean1958 = true;
                                if (rsInterface.anObjectArray1926 != null) {
                                    Cs2Trigger class59_sub27 = new Cs2Trigger();
                                    class59_sub27.aBoolean4106 = true;
                                    class59_sub27.aRsInterface_4115 = rsInterface;
                                    class59_sub27.anInt4105 = (anLocalInt_74_ + class59_sub46.getX() - anLocalInt_66_);
                                    class59_sub27.anInt4108 = (anLocalInt_75_ + class59_sub46.getY() - anLocalInt_67_);
                                    class59_sub27.parameters = (rsInterface.anObjectArray1926);
                                    DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                                }
                            }
                            if (rsInterface.aBoolean1958 && anLocalBoolean_76_ && (rsInterface.anObjectArray1945 != null)) {
                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                class59_sub27.aBoolean4106 = true;
                                class59_sub27.aRsInterface_4115 = rsInterface;
                                class59_sub27.anInt4105 = (anLocalInt_74_ + mouseHandler.getX() - anLocalInt_66_);
                                class59_sub27.anInt4108 = (anLocalInt_75_ + mouseHandler.getY() - anLocalInt_67_);
                                class59_sub27.parameters = rsInterface.anObjectArray1945;
                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                            }
                            if (rsInterface.aBoolean1958 && !anLocalBoolean_76_) {
                                rsInterface.aBoolean1958 = false;
                                if (rsInterface.anObjectArray1894 != null) {
                                    Cs2Trigger class59_sub27 = new Cs2Trigger();
                                    class59_sub27.aBoolean4106 = true;
                                    class59_sub27.aRsInterface_4115 = rsInterface;
                                    class59_sub27.anInt4105 = (anLocalInt_74_ + mouseHandler.getX() - anLocalInt_66_);
                                    class59_sub27.anInt4108 = (anLocalInt_75_ + mouseHandler.getY() - anLocalInt_67_);
                                    class59_sub27.parameters = (rsInterface.anObjectArray1894);
                                    Class124.aCyclicLinkedList_1012.add(class59_sub27);
                                }
                            }
                            if (anLocalBoolean_76_ && (rsInterface.anObjectArray1880 != null)) {
                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                class59_sub27.aBoolean4106 = true;
                                class59_sub27.aRsInterface_4115 = rsInterface;
                                class59_sub27.anInt4105 = (anLocalInt_74_ + mouseHandler.getX() - anLocalInt_66_);
                                class59_sub27.anInt4108 = (anLocalInt_75_ + mouseHandler.getY() - anLocalInt_67_);
                                class59_sub27.parameters = rsInterface.anObjectArray1880;
                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                            }
                            if (!rsInterface.aBoolean1911 && anLocalBoolean) {
                                rsInterface.aBoolean1911 = true;
                                if (rsInterface.anObjectArray1832 != null) {
                                    Cs2Trigger class59_sub27 = new Cs2Trigger();
                                    class59_sub27.aBoolean4106 = true;
                                    class59_sub27.aRsInterface_4115 = rsInterface;
                                    class59_sub27.anInt4105 = (anLocalInt_74_ + mouseHandler.getX() - anLocalInt_66_);
                                    class59_sub27.anInt4108 = (anLocalInt_75_ + mouseHandler.getY() - anLocalInt_67_);
                                    class59_sub27.parameters = (rsInterface.anObjectArray1832);
                                    DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                                }
                            }
                            if (rsInterface.aBoolean1911 && anLocalBoolean && (rsInterface.anObjectArray1878 != null)) {
                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                class59_sub27.aBoolean4106 = true;
                                class59_sub27.aRsInterface_4115 = rsInterface;
                                class59_sub27.anInt4105 = (anLocalInt_74_ + mouseHandler.getX() - anLocalInt_66_);
                                class59_sub27.anInt4108 = (anLocalInt_75_ + mouseHandler.getY() - anLocalInt_67_);
                                class59_sub27.parameters = rsInterface.anObjectArray1878;
                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                            }
                            if (rsInterface.aBoolean1911 && !anLocalBoolean) {
                                rsInterface.aBoolean1911 = false;
                                if (rsInterface.anObjectArray1872 != null) {
                                    Cs2Trigger class59_sub27 = new Cs2Trigger();
                                    class59_sub27.aBoolean4106 = true;
                                    class59_sub27.aRsInterface_4115 = rsInterface;
                                    class59_sub27.anInt4105 = (anLocalInt_74_ + mouseHandler.getX() - anLocalInt_66_);
                                    class59_sub27.anInt4108 = (anLocalInt_75_ + mouseHandler.getY() - anLocalInt_67_);
                                    class59_sub27.parameters = (rsInterface.anObjectArray1872);
                                    Class124.aCyclicLinkedList_1012.add(class59_sub27);
                                }
                            }
                            if (rsInterface.anObjectArray1941 != null) {
                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                class59_sub27.aRsInterface_4115 = rsInterface;
                                class59_sub27.parameters = rsInterface.anObjectArray1941;
                                Class43.aCyclicLinkedList_308.add(class59_sub27);
                            }
                            if (rsInterface.anObjectArray1856 != null && (Statics.anInt3587 > rsInterface.anInt1954)) {
                                if ((rsInterface.anIntArray1851 == null) || ((Statics.anInt3587 - rsInterface.anInt1954) > 32)) {
                                    Cs2Trigger class59_sub27 = new Cs2Trigger();
                                    class59_sub27.aRsInterface_4115 = rsInterface;
                                    class59_sub27.parameters = (rsInterface.anObjectArray1856);
                                    DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                                } else {
                                    while_99_:
                                    for (int anLocalInt_97_ = rsInterface.anInt1954; anLocalInt_97_ < Statics.anInt3587; anLocalInt_97_++) {
                                        int anLocalInt_98_ = (Class313.anIntArray2599[anLocalInt_97_ & 0x1f]);
                                        for (int anLocalInt_99_ = 0; (anLocalInt_99_ < (rsInterface.anIntArray1851).length); anLocalInt_99_++) {
                                            if ((rsInterface.anIntArray1851[anLocalInt_99_]) == anLocalInt_98_) {
                                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                                class59_sub27.aRsInterface_4115 = rsInterface;
                                                class59_sub27.parameters = (rsInterface.anObjectArray1856);
                                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                                                break while_99_;
                                            }
                                        }
                                    }
                                }
                                rsInterface.anInt1954 = Statics.anInt3587;
                            }
                            if (rsInterface.anObjectArray1951 != null && (Class90.anInt681 > rsInterface.anInt1877)) {
                                if ((rsInterface.anIntArray1867 == null) || ((Class90.anInt681 - rsInterface.anInt1877) > 32)) {
                                    Cs2Trigger class59_sub27 = new Cs2Trigger();
                                    class59_sub27.aRsInterface_4115 = rsInterface;
                                    class59_sub27.parameters = (rsInterface.anObjectArray1951);
                                    DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                                } else {
                                    while_100_:
                                    for (int anLocalInt_100_ = rsInterface.anInt1877; anLocalInt_100_ < Class90.anInt681; anLocalInt_100_++) {
                                        int anLocalInt_101_ = (Node_Sub29.anIntArray4127[anLocalInt_100_ & 0x1f]);
                                        for (int anLocalInt_102_ = 0; (anLocalInt_102_ < (rsInterface.anIntArray1867).length); anLocalInt_102_++) {
                                            if ((rsInterface.anIntArray1867[anLocalInt_102_]) == anLocalInt_101_) {
                                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                                class59_sub27.aRsInterface_4115 = rsInterface;
                                                class59_sub27.parameters = (rsInterface.anObjectArray1951);
                                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                                                break while_100_;
                                            }
                                        }
                                    }
                                }
                                rsInterface.anInt1877 = Class90.anInt681;
                            }
                            if (rsInterface.anObjectArray1907 != null && (ClanChannel.anInt4353 > rsInterface.anInt1821)) {
                                if ((rsInterface.anIntArray1847 == null) || ((ClanChannel.anInt4353 - rsInterface.anInt1821) > 32)) {
                                    Cs2Trigger class59_sub27 = new Cs2Trigger();
                                    class59_sub27.aRsInterface_4115 = rsInterface;
                                    class59_sub27.parameters = (rsInterface.anObjectArray1907);
                                    DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                                } else {
                                    while_101_:
                                    for (int anLocalInt_103_ = rsInterface.anInt1821; (anLocalInt_103_ < ClanChannel.anInt4353); anLocalInt_103_++) {
                                        int anLocalInt_104_ = (GlImageSkybox.anIntArray838[anLocalInt_103_ & 0x1f]);
                                        for (int anLocalInt_105_ = 0; (anLocalInt_105_ < (rsInterface.anIntArray1847).length); anLocalInt_105_++) {
                                            if ((rsInterface.anIntArray1847[anLocalInt_105_]) == anLocalInt_104_) {
                                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                                class59_sub27.aRsInterface_4115 = rsInterface;
                                                class59_sub27.parameters = (rsInterface.anObjectArray1907);
                                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                                                break while_101_;
                                            }
                                        }
                                    }
                                }
                                rsInterface.anInt1821 = ClanChannel.anInt4353;
                            }
                            if (rsInterface.anObjectArray1936 != null && (Class41.anInt306 > rsInterface.anInt1899)) {
                                if ((rsInterface.anIntArray1819 == null) || ((Class41.anInt306 - rsInterface.anInt1899) > 32)) {
                                    Cs2Trigger class59_sub27 = new Cs2Trigger();
                                    class59_sub27.aRsInterface_4115 = rsInterface;
                                    class59_sub27.parameters = (rsInterface.anObjectArray1936);
                                    DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                                } else {
                                    while_102_:
                                    for (int anLocalInt_106_ = rsInterface.anInt1899; anLocalInt_106_ < Class41.anInt306; anLocalInt_106_++) {
                                        int anLocalInt_107_ = (Class24.anIntArray160[anLocalInt_106_ & 0x1f]);
                                        for (int anLocalInt_108_ = 0; (anLocalInt_108_ < (rsInterface.anIntArray1819).length); anLocalInt_108_++) {
                                            if ((rsInterface.anIntArray1819[anLocalInt_108_]) == anLocalInt_107_) {
                                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                                class59_sub27.aRsInterface_4115 = rsInterface;
                                                class59_sub27.parameters = (rsInterface.anObjectArray1936);
                                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                                                break while_102_;
                                            }
                                        }
                                    }
                                }
                                rsInterface.anInt1899 = Class41.anInt306;
                            }
                            if (rsInterface.anObjectArray1914 != null && (Class62_Sub19.anInt4429 > rsInterface.anInt1830)) {
                                if ((rsInterface.anIntArray1904 == null) || ((Class62_Sub19.anInt4429 - rsInterface.anInt1830) > 32)) {
                                    Cs2Trigger class59_sub27 = new Cs2Trigger();
                                    class59_sub27.aRsInterface_4115 = rsInterface;
                                    class59_sub27.parameters = (rsInterface.anObjectArray1914);
                                    DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                                } else {
                                    while_103_:
                                    for (int anLocalInt_109_ = rsInterface.anInt1830; (anLocalInt_109_ < Class62_Sub19.anInt4429); anLocalInt_109_++) {
                                        int anLocalInt_110_ = (Class51.anIntArray388[anLocalInt_109_ & 0x1f]);
                                        for (int anLocalInt_111_ = 0; (anLocalInt_111_ < (rsInterface.anIntArray1904).length); anLocalInt_111_++) {
                                            if ((rsInterface.anIntArray1904[anLocalInt_111_]) == anLocalInt_110_) {
                                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                                class59_sub27.aRsInterface_4115 = rsInterface;
                                                class59_sub27.parameters = (rsInterface.anObjectArray1914);
                                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                                                break while_103_;
                                            }
                                        }
                                    }
                                }
                                rsInterface.anInt1830 = Class62_Sub19.anInt4429;
                            }
                            if ((Class356.anInt3015 > rsInterface.anInt1963) && (rsInterface.anObjectArray1892 != null)) {
                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                class59_sub27.aRsInterface_4115 = rsInterface;
                                class59_sub27.parameters = rsInterface.anObjectArray1892;
                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                            }
                            if ((Class45.anInt316 > rsInterface.anInt1963) && (rsInterface.anObjectArray1957 != null)) {
                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                class59_sub27.aRsInterface_4115 = rsInterface;
                                class59_sub27.parameters = rsInterface.anObjectArray1957;
                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                            }
                            if ((Class232.anInt1694 > rsInterface.anInt1963) && (rsInterface.anObjectArray1920 != null)) {
                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                class59_sub27.aRsInterface_4115 = rsInterface;
                                class59_sub27.parameters = rsInterface.anObjectArray1920;
                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                            }
                            if ((Class114.anInt949 > rsInterface.anInt1963) && (rsInterface.anObjectArray1913 != null)) {
                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                class59_sub27.aRsInterface_4115 = rsInterface;
                                class59_sub27.parameters = rsInterface.anObjectArray1913;
                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                            }
                            if ((Statics.anInt5603 > rsInterface.anInt1963) && (rsInterface.anObjectArray1893 != null)) {
                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                class59_sub27.aRsInterface_4115 = rsInterface;
                                class59_sub27.parameters = rsInterface.anObjectArray1893;
                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                            }
                            if ((Node_Sub47_Sub1.anInt6155 > rsInterface.anInt1963) && (rsInterface.anObjectArray1855 != null)) {
                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                class59_sub27.aRsInterface_4115 = rsInterface;
                                class59_sub27.parameters = rsInterface.anObjectArray1855;
                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                            }
                            if ((JagexHashMap.anInt490 > rsInterface.anInt1963) && (rsInterface.anObjectArray1952 != null)) {
                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                class59_sub27.aRsInterface_4115 = rsInterface;
                                class59_sub27.parameters = rsInterface.anObjectArray1952;
                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                            }
                            rsInterface.anInt1963 = Class359.anInt3038;
                            if (rsInterface.anObjectArray1959 != null) {
                                for (int anLocalInt_112_ = 0; anLocalInt_112_ < Class246.anInt1792; anLocalInt_112_++) {
                                    Cs2Trigger class59_sub27 = new Cs2Trigger();
                                    class59_sub27.aRsInterface_4115 = rsInterface;
                                    class59_sub27.anInt4116 = Statics.keyMessages[anLocalInt_112_].getKeyCode();
                                    class59_sub27.anInt4110 = Statics.keyMessages[anLocalInt_112_].getKeyChar();
                                    class59_sub27.parameters = (rsInterface.anObjectArray1959);
                                    DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                                }
                            }
                            if (Class263.aBoolean3633 && (rsInterface.anObjectArray1919 != null)) {
                                Cs2Trigger class59_sub27 = new Cs2Trigger();
                                class59_sub27.aRsInterface_4115 = rsInterface;
                                class59_sub27.parameters = rsInterface.anObjectArray1919;
                                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                            }
                        }
                        if (rsInterface.type == 5 && rsInterface.anInt1909 != -1)
                            rsInterface.method3229(Statics.aClass333_2631, InputStream_Sub2.aClass64_35, -65536).method2893((byte) -107, Class389.aGraphicsToolkit3281, rsInterface.renderHeight);
                        Node_Sub28_Sub1.method838(rsInterface, 298724582);
                        if (rsInterface.type == 0) {
                            method115(argument, rsInterface.idHash, anLocalInt_68_, anLocalInt_69_, anLocalInt_70_, anLocalInt_71_, (anLocalInt_66_ - rsInterface.anInt1950), (anLocalInt_67_ - rsInterface.anInt1838), argument_62_, argument_63_, argument_64_, argument_65_);
                            if (rsInterface.children != null)
                                method115((rsInterface.children), rsInterface.idHash, anLocalInt_68_, anLocalInt_69_, anLocalInt_70_, anLocalInt_71_, (anLocalInt_66_ - rsInterface.anInt1950), (anLocalInt_67_ - rsInterface.anInt1838), argument_62_, argument_63_, argument_64_, argument_65_);
                            Node_Sub49 class59_sub49 = ((Node_Sub49) (Class2_Sub5.aJagexHashMap_3787.get((long) rsInterface.idHash)));
                            if (class59_sub49 != null) {
                                if ((selectedGame == GameEnum.RUNESCAPE) && (class59_sub49.anInt4289) == 0 && !Node_Sub31_Sub39.aBoolean6055 && anLocalBoolean && !dba_sub_772_Sub2.aBoolean6372)
                                    Statics.method3267(1024);
                                Statics.method3681(anLocalInt_66_, argument_63_, anLocalInt_69_, anLocalInt_70_, (byte) 123, argument_62_, anLocalInt_68_, argument_64_, class59_sub49.anInt4291, anLocalInt_71_, anLocalInt_67_, argument_65_);
                            }
                        }
                    }
                }
            }
        }
    }

    static final void method116() {
        Class24.anInt163 = 0;
        for (int anLocalInt = 0; anLocalInt < dba_sub_772_Sub2.anInt6369; anLocalInt++) {
            DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1 = ((Node_Sub35) Class294.aJagexHashMap_2453.get((long) DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616[anLocalInt])).aClass104_Sub2_Sub2_Sub5_Sub1_4157;
            if ((class104_sub2_sub2_sub5_sub1.aBoolean6751) && class104_sub2_sub2_sub5_sub1.method1834(-1) != -1) {
                int anLocalInt_113_ = (((class104_sub2_sub2_sub5_sub1.method1830(-128) - 1) * 256) + 252);
                int anLocalInt_114_ = (class104_sub2_sub2_sub5_sub1.worldX - anLocalInt_113_) >> 9;
                int anLocalInt_115_ = (class104_sub2_sub2_sub5_sub1.worldZ - anLocalInt_113_) >> 9;
                Entity entity = Class311.method3613((byte) -128, anLocalInt_114_, anLocalInt_115_, (class104_sub2_sub2_sub5_sub1.lightingHL));
                if (entity != null) {
                    int anLocalInt_116_ = (entity.anInt6745);
                    if (entity instanceof DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
                        anLocalInt_116_ += 2048;
                    if ((entity.anInt6749) == 0 && entity.method1834(-1) != -1) {
                        Node_Sub29.anIntArray4126[Class24.anInt163] = anLocalInt_116_;
                        Class259.anIntArray2020[Class24.anInt163] = anLocalInt_116_;
                        Class24.anInt163++;
                        entity.anInt6749++;
                    }
                    Node_Sub29.anIntArray4126[Class24.anInt163] = anLocalInt_116_;
                    Class259.anIntArray2020[Class24.anInt163] = class104_sub2_sub2_sub5_sub1.anInt6745 + 2048;
                    Class24.anInt163++;
                    entity.anInt6749++;
                }
            }
        }
        Class105.method1948(Node_Sub29.anIntArray4126, Class259.anIntArray2020, (byte) 1, Class24.anInt163 - 1, 0);
    }

    static final void method117(int argument) {
        int anLocalInt = Class224.anInt1578;
        int[] anLocalInts = Class242.anIntArray1769;
        for (int anLocalInt_117_ = 0; anLocalInt_117_ < anLocalInt + dba_sub_772_Sub2.anInt6369; anLocalInt_117_++) {
            Entity entity;
            if (anLocalInt_117_ < anLocalInt)
                entity = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[anLocalInts[anLocalInt_117_]]);
            else
                entity = ((Node_Sub35) Class294.aJagexHashMap_2453.get((long) (DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616[anLocalInt_117_ - anLocalInt]))).aClass104_Sub2_Sub2_Sub5_Sub1_4157;
            if (entity.lightingHL == argument && (entity.anInt6786) >= 0) {
                int anLocalInt_118_ = entity.method1830(-127);
                if ((anLocalInt_118_ & 0x1) == 0) {
                    if ((entity.worldX & 0x1ff) != 0 || (entity.worldZ & 0x1ff) != 0)
                        continue;
                } else if ((entity.worldX & 0x1ff) != 256 || ((entity.worldZ) & 0x1ff) != 256)
                    continue;
                if (anLocalInt_118_ == 1) {
                    int anLocalInt_119_ = (entity.worldX >> 9);
                    int anLocalInt_120_ = (entity.worldZ >> 9);
                    if ((entity.anInt6786) > (Class133.anIntArrayArray1066[anLocalInt_119_][anLocalInt_120_])) {
                        Class133.anIntArrayArray1066[anLocalInt_119_][anLocalInt_120_] = entity.anInt6786;
                        Class119.anIntArrayArray970[anLocalInt_119_][anLocalInt_120_] = 1;
                    } else if (entity.anInt6786 == (Class133.anIntArrayArray1066[anLocalInt_119_][anLocalInt_120_]))
                        Class119.anIntArrayArray970[anLocalInt_119_][anLocalInt_120_]++;
                } else {
                    int anLocalInt_121_ = (anLocalInt_118_ - 1) * 256 + 60;
                    int anLocalInt_122_ = ((entity.worldX - anLocalInt_121_) >> 9);
                    int anLocalInt_123_ = ((entity.worldZ - anLocalInt_121_) >> 9);
                    int anLocalInt_124_ = ((entity.worldX + anLocalInt_121_) >> 9);
                    int anLocalInt_125_ = ((entity.worldZ + anLocalInt_121_) >> 9);
                    for (int anLocalInt_126_ = anLocalInt_122_; anLocalInt_126_ <= anLocalInt_124_; anLocalInt_126_++) {
                        for (int anLocalInt_127_ = anLocalInt_123_; anLocalInt_127_ <= anLocalInt_125_; anLocalInt_127_++) {
                            if (entity.anInt6786 > (Class133.anIntArrayArray1066[anLocalInt_126_][anLocalInt_127_])) {
                                Class133.anIntArrayArray1066[anLocalInt_126_][anLocalInt_127_] = entity.anInt6786;
                                Class119.anIntArrayArray970[anLocalInt_126_][anLocalInt_127_] = 1;
                            } else if (entity.anInt6786 == (Class133.anIntArrayArray1066[anLocalInt_126_][anLocalInt_127_]))
                                Class119.anIntArrayArray970[anLocalInt_126_][anLocalInt_127_]++;
                        }
                    }
                }
            }
        }
    }

    private final void method118(int argument_128_) {
        if (Statics.anInt1652 != argument_128_) {
            Class333.anInt2720++;
            if (Class333.anInt2720 % 1000 == 1) {
                GregorianCalendar gregoriancalendar = new GregorianCalendar();
                DoublyLinkedNodeP2_Sub2_Sub3_Sub2.anInt6604 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10 + gregoriancalendar.get(13) / 6);
                Node_Sub31_Sub24.aRandom5948.setSeed((long) DoublyLinkedNodeP2_Sub2_Sub3_Sub2.anInt6604);
            }
            if (Class333.anInt2720 % 50 == 0) {
                Node_Sub39.anInt4196 = Statics.anInt3515;
                Statics.anInt3515 = 0;
                Packet.anInt4120 = Class353_Sub7.anInt5511;
                Class353_Sub7.anInt5511 = 0;
            }
            method114((byte) 120);
            if (fileStoreManager != null)
                fileStoreManager.method3209();
            Class341.method3782(argument_128_ - 14);
            Class360.method3952(false);
            keyHandler.swapBuffers();
            mouseHandler.swapBuffers();
            if (Class389.aGraphicsToolkit3281 != null)
                Class389.aGraphicsToolkit3281.processDeletions((int) getGameTime());
            Statics.method742((byte) 98);
            Class246.anInt1792 = 0;
            Node_Sub31_Sub29.anInt5980 = 0;
            for (IKeyMessage keyMessage = keyHandler.popMessage(); keyMessage != null; keyMessage = keyHandler.popMessage()) {
                int anLocalInt = keyMessage.getAction();
                if (anLocalInt == 2 || anLocalInt == 3) {
                    char anLocalChar = keyMessage.getKeyChar();
                    if (!Node_Sub45.method1089((byte) 90) || (anLocalChar != '`' && anLocalChar != '\u00a7' && anLocalChar != '\u00b2')) {
                        if (Class246.anInt1792 < 128) {
                            Statics.keyMessages[Class246.anInt1792] = keyMessage;
                            Class246.anInt1792++;
                        }
                    } else if (Statics.method740(false))
                        Class361.method3957(-88);
                    else
                        DoublyLinkedNodeP2_Sub2_Sub1_Sub2.method1794(0);
                } else if (anLocalInt == 0 && Node_Sub31_Sub29.anInt5980 < 75) {
                    Node_Sub36_Sub1.keyMessages[Node_Sub31_Sub29.anInt5980] = keyMessage;
                    Node_Sub31_Sub29.anInt5980++;
                }
            }
            Class62_Sub8.anInt4396 = 0;
            for (AbstractMouseMessage class59_sub46 = mouseHandler.popMessage(); class59_sub46 != null; class59_sub46 = mouseHandler.popMessage()) {
                int anLocalInt = class59_sub46.getAction();
                if (anLocalInt != -1) {
                    if (anLocalInt != 6) {
                        if (Class303_Sub1.method3580(anLocalInt)) {
                            Class376.aCyclicLinkedList_3214.add(class59_sub46);
                            if (Class376.aCyclicLinkedList_3214.getSize() > 10)
                                Class376.aCyclicLinkedList_3214.remove();
                        }
                    } else
                        Class62_Sub8.anInt4396 += class59_sub46.getClickCount();
                } else
                    Node_Sub47_Sub12.aCyclicLinkedList_6211.add(class59_sub46);
            }
            if (Statics.method740(false))
                Statics.method2500((byte) -103);
            if (Class360.method3950(true, Statics.anInt1652)) {
                processStartUp();
                Class120.method2384(argument_128_ ^ ~0x2e);
            } else if (Class159.method2597(Statics.anInt1652, -31175))
                MapRelated.initializeRegion();
            if (!Class282.method3446(Statics.anInt1652, (byte) 6) || Class159.method2597(Statics.anInt1652, -31175)) {
                if (Class382.method4108(Statics.anInt1652, 72) && !Class159.method2597(Statics.anInt1652, -31175)) {
                    method107(false);
                    Node_Sub47_Sub9.method1135(-19573);
                } else if (Statics.anInt1652 != 12) {
                    if (Class230.method3070(true, Statics.anInt1652) && !Class159.method2597(Statics.anInt1652, -31175))
                        IOException_Sub1.method131((byte) 88);
                    else if (Statics.anInt1652 == 13) {
                        Node_Sub47_Sub9.method1135(-19573);
                        if (Node_Sub47.anInt4283 != -3 && Node_Sub47.anInt4283 != 2 && Node_Sub47.anInt4283 != 15)
                            Class44.method429(argument_128_ ^ 0x63, false);
                    }
                } else
                    Node_Sub47_Sub9.method1135(-19573);
            } else {
                method107(false);
                Class2.method187((byte) -88);
                Node_Sub47_Sub9.method1135(argument_128_ - 19587);
            }
            Class4.method218((byte) 82, Class389.aGraphicsToolkit3281);
            Class376.aCyclicLinkedList_3214.remove();
        }
    }

    final void method86(int argument_129_) {
        if (Class242.aBoolean1771)
            Node_Sub47_Sub7.method1130((byte) 9);
        MultilanguageString.method3778(75);
        if (Class389.aGraphicsToolkit3281 != null)
            Class389.aGraphicsToolkit3281.method2027((byte) 71);
        if (overridingFrame != null) {
            RsInterface.method3210(baseSignlink, argument_129_ + 152, overridingFrame);
            overridingFrame = null;
        }
        if (Statics.aClass307_2632 != null) {
            Statics.aClass307_2632.method3601(argument_129_ + 40);
            Statics.aClass307_2632 = null;
        }
        Class154.method2576(argument_129_ ^ argument_129_);
        js5client.closeSocket();
        threadSafeDiskBackedCache.shutdown();
        if (Node_Sub24.aClass31_4063 != null) {
            Node_Sub24.aClass31_4063.method364(argument_129_ + 162);
            Node_Sub24.aClass31_4063 = null;
        }
        try {
            cacheDataFile.close();
            for (int anLocalInt = 0; anLocalInt < 37; anLocalInt++)
                cacheIndexFile[anLocalInt].close();
            idx255File.close();
            randomFile.close();
            Class245_Sub2_Sub1.method3194(-102);
        } catch (Exception exception) {
            /* empty */
        }
    }

    public static void method119(boolean argument) {
        if (argument == true)
            aClass166_3743 = null;
    }

    final void method105(byte argument_130_) {
        method119(true);
        Class188.method2867(34037);
        DoublyLinkedNode_Sub51_Sub3.method1186((byte) -82);
        MultilanguageString.cleanConstants(-119);
        Statics.method291(-1);
        Statics.method2561(-29);
        Class321.method3650(true);
        Class201.method2918(124);
        Class86.method1628((byte) -67);
        Class234.method3100((byte) -110);
        Class115.method2365(34);
        Class25.method342(-17435);
        Class61.method1340(0);
        Class303.method3563((byte) -119);
        Statics.method1172((byte) -84);
        Statics.method527(false);
        JagexHashMap.method1525();
        Applet_Sub1.method91((byte) -69);
        Class88.method1649(22759);
        Statics.method2426((byte) 122);
        GameEnum.method1754(101);
        Class350.method3836((byte) -74);
        GraphicsToolkit.method2022((byte) -122);
        Node_Sub44.method1087((byte) 19);
        Class124.method2398((byte) -88);
        Statics.method487((byte) -119);
        Statics.cleanStatics();
        Statics.method3412(true);
        Statics.method3733(15674);
        Statics.method3058(-7742);
        GameEnum.method3205(-124);
        BufferedFile.cleanStatics();
        DiskBackedCache.method3707((byte) 116);
        Class149.method2530(0);
        Class41.method418(8448);
        Class51.method472(101);
        Class297.method3513(86);
        Class140.method2473(-31235);
        Class257.method3300(4);
        Class26.method349(-1);
        Class365.method3979(false);
        Class362.method3959(11);
        Class313.method3617(-1);
        Class336.method3751(125);
        Class264.method3330((byte) -68);
        Class226.method3055((byte) 116);
        Class24.method339(false);
        Statics.method1700(true);
        Class316.method3636(2);
        Class66.method1493(1718625538);
        Node_Sub35.method1041(-28815);
        Packet.cleanStatics();
        Node_Sub28_Sub1.method849((byte) 107);
        Class166.method2635((byte) 64);
        Class31.method362(102);
        Class303_Sub1.method3582(-71);
        DoublyLinkedNode_Sub51_Sub13.method1266(false);
        Class114.method2363(7084);
        Class195.method2894(-1);
        Class366.method3985((byte) -71);
        RsInterface.method3218((byte) 98);
        Class259.method3308((byte) 127);
        DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.method1861(7);
        Statics.method2760((byte) -116);
        Class272.method3375((byte) 12);
        Node_Sub29.method858(1);
        Statics.method1829((byte) -128);
        Class329.method3699(-29162);
        Node_Sub10.method684((byte) 94);
        DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.method1842(6327);
        Node_Sub49.method1148((byte) 125);
        Node_Sub18.method711((byte) -51);
        DoublyLinkedNode_Sub51_Sub19.method1298(19);
        Class251.method3241(1);
        Class60.method1339((byte) -31);
        Class235.method3112(86);
        Statics.method1759(false);
        Class199.method2910((byte) -112);
        DoublyLinkedNodeP2_Sub4.method1902(-3886);
        Class295.method3509(102);
        Class9.method241((byte) -51);
        Class84_Sub1.method1623(-79);
        Class5.method224(-4);
        GameServer.method3747((byte) -78);
        Class164.method2623((byte) -90);
        RuntimeException_Sub2.method4221(109);
        Class200.method2914(94);
        Class332.method3722(true);
        Statics.method1194(15);
        Statics.cleanStatics2();
        Statics.method319(false);
        Class157.method2590(true);
        Class22.method331(true);
        Class367.method4001((byte) 70);
        Class91.method1684(32);
        Class167.method2639(-1);
        Class95.method1704(-84);
        Statics.method3588((byte) -111);
        Class342.method3786(3);
        Class360.method3953(false);
        Class266.method3341(-107);
        Class101.method1747((byte) -123);
        Class_s.method3537(-97);
        Class120.method2383(-2);
        Class291.method3492((byte) -110);
        Class8.method237(-95);
        Class371.method4060(108);
        AbstractFont.method509();
        FileOnDisk.cleanStatics();
        Class6.method232((byte) -82);
        Class62_Sub6.method1378((byte) -117);
        Class62_Sub14.method1412(6);
        Class62_Sub11.method1400(6);
        Class62_Sub5.method1375(-116);
        Class62_Sub18.method1430(true);
        Class62_Sub13.method1404(0);
        Class62_Sub3.method1360(-91);
        Class62_Sub7.method1383(false);
        Class62_Sub24.method1453(-1);
        Class62_Sub16.method1418((byte) -116);
        Class62_Sub8.method1385(0);
        Class62_Sub10.method1394(90);
        Class62_Sub1.method1350((byte) -107);
        Class62_Sub29.method1474(false);
        Class62_Sub27.method1469(-69);
        Class62_Sub2.method1355(10399);
        Class62_Sub19.method1431(false);
        Class62_Sub26.method1465(-32728);
        Class62_Sub25.method1456(320);
        Class62_Sub20.method1439((byte) -95);
        Class62_Sub4.method1366(-37);
        Class62_Sub28.method1472((byte) -1);
        Class62_Sub17.method1425((byte) -112);
        Class62_Sub9.method1390((byte) 64);
        Class62_Sub15.method1415(-11905);
        Class62_Sub22.method1445(76);
        Class62.method1345(7863);
        Class252.method3244((byte) -47);
        Statics.method459((byte) -93);
        Exception_Sub1.method142(-3917);
        Class_aa.method160((byte) 116);
        dba_sub_772.method1306((byte) -5);
        Class76.method1561((byte) 45);
        Class72.method1536(-99);
        Class287.method3469(6320);
        Statics.method1799(-78);
        Statics.method1767((byte) 53);
        Node_Sub9_Sub2.method595(-145);
        Class112.method2006(1);
        Class213.method2985(false);
        Class169.method2734((byte) -67);
        Cs2Runtime.method3651();
        Class207.method2949(-104);
        Statics.method2974();
        Node_Sub32_Sub3.method1024(-3938);
        Class109.method1977(false);
        Class109_Sub1.method1984(-11);
        Node_Sub32_Sub2.method1023(23);
        Node_Sub32_Sub4.method1031(true);
        Node_Sub9_Sub5.method676((byte) 102);
        Class116.method2372((byte) -33);
        Class53.method481(false);
        Class18.method309(0);
        LoadingStatus.cleanStatics();
        Class294.method3503((byte) 115);
        Class28.method356(-22272);
        Class345.method3806(-1355324126);
        Statics.method2517(100);
        Class243.method3158(true);
        Class33.method368(-106);
        Class209.method2953(8);
        Class179.method2808();
        LoadingBar.method2837();
        Class152.method2552(0);
        Class194.method2891(113);
        Class215.method2992(-50174896);
        Class70.method1518(-124);
        Class122.method2389(-110);
        Class349.method3822(255);
        Class105.method1949(2);
        Class314.method3627(1);
        DoublyLinkedNodeP2_Sub10.method1944((byte) 6);
        Class80.method1587(126);
        Class269.method3361(true);
        Class271.method3367(106);
        DoublyLinkedNodeP2_Sub7.method1921();
        Class354.method3922((byte) 117);
        Class376.method4088(43);
        Statics.method353((byte) -89);
        Class179_Sub1.method2824(-120);
        Class373.method4075(false);
        Class391.method4140(-1);
        Class151.method2548(0);
        Node_Sub7.method567(false);
        Class299.method3529((byte) -67);
        Class244.method3163();
        Class212.method2977(115);
        Statics.method2601(26911);
        Cs2CallStackEntry.method1546(-1);
        Statics.method768((byte) -57);
        Statics.method1286(true);
        Statics.method1188(909839010);
        Class75.method1551(0);
        Statics.method3261(true);
        Class130.method2434((byte) -113);
        DoublyLinkedNodeP2_Sub2_Sub4.method1878(-116);
        DoublyLinkedNodeP2_Sub2_Sub5.method1892(-16777216);
        DoublyLinkedNodeP2_Sub2_Sub3.method1868(true);
        DoublyLinkedNodeP2_Sub2_Sub1.method1784(-80);
        Class110.method1987(15435);
        tia_sub_35DoublyLinked.method1216((byte) 124);
        Class93.method1695((byte) 107);
        Class343.method3792();
        Class38.method396(true);
        Class185.method2857((byte) -80);
        Class147.method2523(78);
        Node_Sub11.method686(76);
        Class14.method300();
        Class162.method2614(1);
        Class126.method2412((byte) 7);
        Class52.method478(6);
        Node_Sub5.method557(false);
        Class100.method1731((byte) -27);
        Node_Sub13.method688((byte) 123);
        Node_Sub25.method760();
        Class178.method2795(102);
        Class239.method3128(128);
        Class50.method464(2);
        Class260.method3318((byte) -100);
        Class99.method1724(29323);
        Statics.method412(true);
        Class79.method1579(0);
        Statics.method380((byte) -125);
        Class315.method3632(0);
        Class377.method4094(-127);
        Class117.method2375(68);
        Class223.method3039(true);
        DoublyLinkedNode_Sub51_Sub11.method1247(false);
        Class47.method451(false);
        Class298.method3520((byte) -83);
        Class165.method2626(27946);
        Class276.method3402(1210843136);
        Class131.method2436(true);
        Class77.method1563(31);
        Node_Sub2.method535(-1);
        Class190.method2881(true);
        Class193.method2890(125);
        Class387.method4129(-126);
        DoublyLinkedNodeP2_Sub5.method1914(-93);
        DoublyLinkedNodeP2_Sub2_Sub2_Sub1.method1801(512);
        DoublyLinkedNodeP2_Sub8.method1940(71);
        Node_Sub15.method695((byte) 31);
        Class144.method2514(-108);
        Statics.method2603((byte) 98);
        Class388.method4130(16);
        ClanSettingsDelta.method3025((byte) 98);
        Class277.method3404(0);
        Class137.method2459(-28474);
        Class217.method3013((byte) -122);
        Class182.method2848(108);
        DoublyLinkedNodeP2_Sub2_Sub5_Sub1.method1896((byte) 71);
        DoublyLinkedNodeP2_Sub2_Sub3_Sub2.method1874(-1);
        Class78.method1574(false);
        DoublyLinkedNodeP2_Sub2_Sub1_Sub1.method1785(false);
        DoublyLinkedNodeP2_Sub2_Sub4_Sub1.method1883(-46);
        Class262.method3323(5390);
        Statics.method295((byte) -126);
        Class128.method2419(-20212);
        Class42.method425(0);
        Class253_Sub1_Sub1.method3250((byte) 94);
        Class253_Sub1.method3247(127);
        Class214_Sub1.method2989(true);
        Class253_Sub2.method3251(13361);
        Class253_Sub3.method3252(-17839);
        Class156.method2585(-17122);
        Class348.method3814(true);
        GlImageSkybox.method1755(true);
        DoublyLinkedNode_Sub51_Sub15.method1270((byte) 111);
        Class323.method3672(21746);
        DoublyLinkedNode_Sub51_Sub5.method1199((byte) -112);
        DoublyLinkedNode_Sub51_Sub8.method1238((byte) 12);
        Node_Sub32.method1013(true);
        int anLocalInt = -62 % ((66 - argument_130_) / 48);
        Class48.method455((byte) -33);
        Canvas_Sub1.method126(-1);
        IOException_Sub1.method132(-112);
        Class197.method2905(-82);
        Class281.method3443(0);
        Class30.method360(50);
        Class369.method4044(-92);
        JagexHash.method3084(0);
        Statics.method2438();
        Bzip2Decompressor.method402();
        Class338.method3774((byte) -75);
        DoublyLinkedNode_Sub51_Sub19_Sub1.method1300(26934);
        Class143.method2509((byte) 120);
        DoublyLinkedNode_Sub51_Sub12.method1256((byte) 126);
        Class307_Sub1.method3607(30000);
        Node_Sub31_Sub37.method995((byte) 81);
        DoublyLinkedNodeP2_Sub2_Sub4_Sub2.method1887(131072);
        DoublyLinkedNodeP2_Sub2_Sub2_Sub2.method1812(-65537);
        DoublyLinkedNodeP2_Sub2_Sub3_Sub1.method1870(0);
        Class43.method426(-12648);
        DoublyLinkedNodeP2_Sub2_Sub1_Sub2.method1789((byte) -109);
        Node_Sub24.method749((byte) -122);
        Statics.method1329(-109);
        Statics.method1040((byte) 25);
        Class84.method1615((byte) 105);
        Class119.method2381(0);
        Node_Sub43.method1080(1);
        Class175.method2784();
        Node_Sub6.method559((byte) 85);
        Class292.method3498();
        Class218.method3018();
        Node_Sub52.method1317((byte) -19);
        Class384.method4117((byte) -112);
        Class112_Sub1.method2011();
        Class37.method389(6);
        Node_Sub32_Sub1.method1016(2);
        Class392.method4143(98);
        Class347.method3812((byte) 106);
        Class305.method3594((byte) -114);
        Class263.method3325(true);
        Class154.method2575(true);
        Class189.method2870(50);
        Class253.method3246(32370);
        Class189_Sub3.method2879((byte) -6);
        Class134.method2454((byte) 107);
        Class189_Sub3_Sub1.method2880((byte) -115);
        Class356.method3931(-105);
        Class389.method4131(96);
        Class326.method3691();
        Class87.method1634(0);
        DoublyLinkedNode_Sub51_Sub18.method1293((byte) 105);
        DoublyLinkedNodeP2_Sub4_Sub1.method1903(-67);
        Class23.method335(8);
        DoublyLinkedNodeP2_Sub3.method1897(0);
        Class227.method3056(-60);
        Class245.method3170(-21116);
        Class341.method3781((byte) 75);
        Class97.method1716((byte) -39);
        Class283.method3448((byte) 101);
        Class82.method1594((byte) -51);
        Node_Sub31_Sub4.method888(-15969);
        Node_Sub31_Sub15.method918((byte) 115);
        Node_Sub31_Sub31.method971(false);
        Node_Sub30.method859((byte) -67);
        Rs2DPainter.method735((byte) 117);
        Class364.method3968(127);
        Class350_Sub1.method3842(15);
        GlToolkit.cleanStatics();
        Class107.method1953(false);
        Class65.method1490(86);
        Class96.method1713(-123);
        Node_Sub36_Sub1.method1054(false);
        Class350_Sub3.method3867(1);
        Class196.method2904(-6376);
        Class368_Sub3.method4036(-13865);
        Statics.method2479(true);
        Statics.cleanStatics((byte) -19);
        Statics.method1503((byte) 71);
        GlTexture_Sub4_Sub1.method2506(27606);
        Statics.method2715(-25683);
        Statics.method4096();
        FloatPacket.method851(-218867224);
        GraphicsToolkit_Sub2.method2250();
        Statics.method1964((byte) -125);
        Statics.method2455((byte) 111);
        Class191.method2884(-109);
        Class350_Sub2.method3851(0);
        Class221.method3030(96);
        Statics.method1591((byte) 99);
        Statics.method2888(0);
        Class138.method2466((byte) 120);
        DxSkybox.method1512((byte) -89);
        Class85.method1625(true);
        Class222.method3031(false);
        Class167_Sub2.method2706(-31408);
        Class320.method3648(false);
        Statics.method3645(21160);
        Class289.method3476((byte) 110);
        Class390.method4136(-104);
        Statics.method2252(16384);
        Class229.method3064();
        Node_Sub31_Sub35.method989((byte) 80);
        Node_Sub31_Sub24.method953(-103);
        Node_Sub31_Sub16.method926(5680);
        Node_Sub31_Sub26.method958(2);
        Node_Sub31_Sub36.method992((byte) -94);
        Node_Sub31_Sub32.method975((byte) -126);
        Node_Sub31_Sub27.method961((byte) -64);
        Node_Sub31_Sub21.method942(false);
        Node_Sub31_Sub10.method902(false);
        Node_Sub31_Sub34.method984(1);
        Node_Sub31_Sub25.method957(4096);
        Node_Sub31_Sub29.method965(0);
        Node_Sub31_Sub38.method1000((byte) 97);
        Node_Sub31_Sub5.method891(true);
        Node_Sub31_Sub11.method906((byte) -112);
        Node_Sub31_Sub15_Sub1.method924(true);
        Node_Sub31_Sub12.method913((byte) -48);
        Node_Sub31_Sub6.method892(0);
        Node_Sub31_Sub17.method931(1);
        Node_Sub31_Sub33.method980(true);
        Node_Sub31_Sub13.method914((byte) 44);
        Node_Sub31_Sub7.method894(638841633);
        Node_Sub31_Sub8.method899(-3);
        Node_Sub31_Sub19.method935(-11451);
        Node_Sub31_Sub18.method934(16384);
        Node_Sub31_Sub23.method952(-636);
        Node_Sub31_Sub3.method884(-1);
        Node_Sub31_Sub1.method879((byte) -1);
        Node_Sub31_Sub30.method968(-2953);
        Class381.method4107(59);
        Node_Sub41.method1075();
        Class159.method2598((byte) 92);
        Class_aa_Sub3.method167(-114);
        Class35.method378(-103);
        Class205.method2937(4);
        Statics.method739(1);
        Statics.method550((byte) 33);
        Class361.method3954(16777215);
        Class275.method3396(105);
        Class273.method3379((byte) -85);
        Class_s_Sub2.method3552(255);
        Statics.method3123((byte) -102);
        DoublyLinkedNode_Sub51_Sub10.method1241((byte) -71);
        Class353.method3889(0);
        Class208.method2951(103);
        Class173.method2768((byte) 3);
        Class359.method3947(120);
        tia_sub_35_Sub2DoublyLinked.method1226(102);
        dba_sub_772_Sub1.method1311(10103);
        Class_aa_Sub1.method163(-1);
        Node_Sub20.method725(false);
        Statics.method3678(-1);
        Statics.method553((byte) 95);
        Statics.method1511(false);
        Statics.method1509(-85);
        Statics.method3466((byte) -39);
        Statics.method3462((byte) -96);
        Class353_Sub5.method3906(111);
        Class353_Sub3.method3901(-111);
        GlTexture_Sub2.method2494(3552);
        Class353_Sub6.method3908(3);
        Class353_Sub9.method3916(2);
        Class353_Sub2.method3899((byte) 125);
        Statics.method3913(30929);
        Statics.method3902((byte) 121);
        Statics.method2738((byte) -108);
        Class17.method306((byte) 20);
        Class352.method3881(123);
        dba_sub_772_Sub2.method1313((byte) -121);
        Class55.method491((byte) 97);
        Class163.method2620((byte) -72);
        tia_sub_35_Sub1DoublyLinked.method1218(19273);
        Class261.method3321(64);
        Class111_Sub1.method1993(-124);
        Class368_Sub1.method4029((byte) -5);
        Class_aa_Sub2.method165(0);
        Node_Sub45.method1090((byte) -127);
        Class232.method3088((byte) -111);
        Statics.method548(false);
        Class2_Sub5.method202((byte) -43);
        Class2_Sub6.method203(33);
        Class2_Sub8.method211(4000);
        Class2_Sub11.method214((byte) 88);
        Class2_Sub1.method197((byte) 96);
        Class245_Sub2.method3188(255);
        Class245_Sub1.method3175(false);
        Class111.method1991(-60);
        Class308.method3608(-117);
        Class256_Sub2.method3283(0);
        Class256.method3271(82);
        Class256_Sub3.method3290((byte) -114);
        Class256_Sub1.method3282(125);
        Class256_Sub4.method3294((byte) 127);
        Class2_Sub10.method212(0);
        Class301.method3531(-24265);
        Gl2Water0.method206(0);
        GlToolkitNr2Program.method3234(17335);
        Class1.method172();
        Class1_Sub1.method176(-64);
        Class222_Sub2.method3034((byte) -105);
        Class46_Sub3_Sub1.method447(4096);
        Class46_Sub2.method440((byte) 120);
        Class46_Sub1_Sub1.method439(117);
        Node_Sub38.method1069(-2174);
        Class123.method2397(10090);
        Statics.method3362(0);
        DoublyLinkedNodeP2_Sub4_Sub2.method1911(6);
        DoublyLinkedNode_Sub51_Sub2.method1178(-43);
        Statics.method1097(-82);
        Class363.method3967(102);
        Statics.method135(3);
        Class358.method3941(true);
        DoublyLinkedNode_Sub51_Sub20.method1305(47);
        Node_Sub16.method702(6);
        DoublyLinkedNode_Sub51_Sub7.method1211((byte) 31);
        MenuAction.method1240(-12281);
        Node_Sub37.method1055(53);
        Node_Sub37_Sub4.method1065((byte) 15);
        Node_Sub37_Sub2.method1061(-1);
        Node_Sub37_Sub3.method1062(2);
        Node_Sub37_Sub1.method1060(-105);
        Node_Sub47.method1112((byte) 126);
        Node_Sub47_Sub3.method1119(4);
        Node_Sub47_Sub1.method1117(false);
        Node_Sub47_Sub8.method1133(false);
        Node_Sub47_Sub2.method1118(7);
        Node_Sub47_Sub7.method1129(-55);
        Node_Sub47_Sub5.method1123(12);
        Node_Sub47_Sub6.method1125((byte) -37);
        Node_Sub47_Sub9.method1136(78);
        Node_Sub47_Sub12.method1142((byte) 117);
        Node_Sub47_Sub10.method1137((byte) 38);
        Statics.method1145(-1);
        Statics.method1105(-17981);
        Class274.method3384((byte) 39);
        Class92.method1694((byte) -108);
        OutputStream_Sub2.method138((byte) -42);
        InputStream_Sub2.method130((byte) -30);
        Class242.method3154(2048);
        Node_Sub19.method713(-10119);
        Node_Sub33.method1036(116);
        DoublyLinkedNode_Sub51_Sub1.method1176((byte) 43);
        Class45.method432(-99);
        Class106.method1951((byte) 101);
        Class121.method2386(true);
        Class317.method3640(80);
        Class245_Sub2_Sub2.method3198(8);
        Class245_Sub1_Sub1.method3181((byte) 25);
        Class247.method3202(4);
        Class206.method2941((byte) 61);
        Class15.method303((byte) 34);
        Class268.method3359((byte) 69);
        Class284.method3456(70);
        Class133.method2442(116);
        Class133_Sub2.method2451(-120);
        Class133_Sub4.method2452((byte) -112);
        Class133_Sub1.method2446(-23567);
        Class245_Sub2_Sub1.method3193(-12285);
        Class245_Sub1_Sub2.method3184(26);
    }

    static final void method120() {
        int anLocalInt = Class224.anInt1578;
        int[] anLocalInts = Class242.anIntArray1769;
        int anLocalInt_131_ = (DoublyLinkedNodeP2_Sub2_Sub4.aBoolean6422 ? anLocalInt : anLocalInt + dba_sub_772_Sub2.anInt6369);
        for (int anLocalInt_132_ = 0; anLocalInt_132_ < anLocalInt_131_; anLocalInt_132_++) {
            Entity entity;
            if (anLocalInt_132_ < anLocalInt)
                entity = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[anLocalInts[anLocalInt_132_]]);
            else
                entity = ((Node_Sub35) Class294.aJagexHashMap_2453.get((long) (DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616[anLocalInt_132_ - anLocalInt]))).aClass104_Sub2_Sub2_Sub5_Sub1_4157;
            if (entity.anInt6786 >= 0) {
                int anLocalInt_133_ = entity.method1830(-125);
                if ((anLocalInt_133_ & 0x1) == 0) {
                    if ((entity.worldX & 0x1ff) == 0 && (entity.worldZ & 0x1ff) == 0)
                        continue;
                } else if ((entity.worldX & 0x1ff) == 256 && ((entity.worldZ) & 0x1ff) == 256)
                    continue;
                ((DoublyLinkedNodeP2_Sub2) entity).anInt4511 = (Node_Sub31_Sub36.method993(entity.lightingHL, entity.worldX, -12040, entity.worldZ));
                Node_Sub47_Sub6.method1126(entity, true);
            }
        }
    }

    final void method94(byte argument_134_) {
        if (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4295.method1464(69) == 2) {
            try {
                method113(false);
            } catch (ThreadDeath threaddeath) {
                throw threaddeath;
            } catch (Throwable throwable) {
                ErrorReporting.reportError((throwable.getMessage() + " (Recovered) " + method85(118)), throwable);
                Class178.aBoolean1316 = true;
                Class215.method2991((byte) -41, false, 0);
            }
        } else
            method113(false);
        if (argument_134_ != -88)
            aClass166_3743 = null;
    }

    final void method92(int argument_135_) {
        if (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4295.method1464(52) == 2) {
            try {
                method118(14);
            } catch (ThreadDeath threaddeath) {
                throw threaddeath;
            } catch (Throwable throwable) {
                ErrorReporting.reportError((throwable.getMessage() + " (Recovered) " + method85(34)), throwable);
                Class178.aBoolean1316 = true;
                Class215.method2991((byte) -41, false, 0);
            }
        } else
            method118(14);
        if (argument_135_ < 93)
            method86(4);
    }

    static final RsInterface method121(RsInterface argument) {
        int anLocalInt = method122(argument).method708(-101);
        if (anLocalInt == 0)
            return null;
        for (int anLocalInt_136_ = 0; anLocalInt_136_ < anLocalInt; anLocalInt_136_++) {
            argument = RsInterface.getByHash(argument.parentId);
            if (argument == null)
                return null;
        }
        return argument;
    }

    static final Node_Sub18 method122(RsInterface argument) {
        Node_Sub18 class59_sub18 = (Node_Sub18) (Statics.aJagexHashMap_1249.get((((long) argument.idHash << 32) + (long) argument.subId)));
        if (class59_sub18 != null)
            return class59_sub18;
        return argument.aClass59_Sub18_1860;
    }

    private final void method123(int argument_137_, int argument_138_) {
        Class79.aJagexSocket_564 = null;
        if (argument_138_ != 7)
            aClass166_3743 = null;
        js5client.status = argument_137_;
        js5client.exceptionCount++;
        anInt1155 = 0;
        Node_Sub31_Sub12.aSignlinkRequest_5894 = null;
    }

    final synchronized void initializeCanvas() {
        if (Signlink.mainapp != null && gameCanvas == null && !baseSignlink.useWin32) {
            try {
                Class var_class = Signlink.mainapp.getClass();
                Field field = var_class.getDeclaredField("canvas");
                gameCanvas = (Canvas) field.get(Signlink.mainapp);
                field.set(Signlink.mainapp, null);
                if (gameCanvas != null)
                    return;
            } catch (Exception exception) {
                /* empty */
            }
        }
        super.initializeCanvas();
    }

    /*synthetic*/
    static Class method124(String argument) {
        try {
            return Class.forName(argument);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
