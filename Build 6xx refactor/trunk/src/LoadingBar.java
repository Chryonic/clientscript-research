/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LoadingBar implements Runnable {
    private Interface8 anInterface8_1358 = new Class87();
    static Class390 aClass390_1359 = new Class390();
    static float aFloat1360;
    static int[] anIntArray1361 = new int[8];
    private volatile boolean aBoolean1362;
    private boolean aBoolean1363;
    private long aLong1364;
    private Interface8 anInterface8_1365 = null;
    private int startPercentage;
    private int anInt1367;
    private long aLong1368;
    private String text;
    private LoadingStatus loadingStatus;

    final int getStartPercentage() {
        return startPercentage;
    }

    final int getProgress() {
        if (loadingStatus == null)
            return 0;
        int anLocalInt = loadingStatus.getIndex();
        if (loadingStatus.usePercentageRange && startPercentage < loadingStatus.finishedPercentage)
            return startPercentage + 1;
        if (anLocalInt < 0 || client.loadingStatusCollection.length - 1 <= anLocalInt)
            return 100;
        if (loadingStatus.startPercentage == startPercentage)
            return loadingStatus.finishedPercentage;
        return loadingStatus.startPercentage;
    }

    final synchronized void method2828(Interface8 argument_2_) {
        anInterface8_1365 = anInterface8_1358;
        anInterface8_1358 = argument_2_;
        aLong1364 = Applet_Sub1.getGameTime();
    }

    public final void run() {
        while (!aBoolean1362) {
            long l = Applet_Sub1.getGameTime();
            synchronized (this) {
                try {
                    anInt1367++;
                    if (!(anInterface8_1358 instanceof Class87)) {
                        long l_4_ = Applet_Sub1.getGameTime();
                        if (Class389.aGraphicsToolkit3281 == null || anInterface8_1365 == null || anInterface8_1365.method35(-4076) == 0 || (aLong1364 < l_4_ + -(long) anInterface8_1365.method35(-4076))) {
                            if (anInterface8_1365 != null) {
                                aBoolean1363 = true;
                                anInterface8_1365.method36(true);
                                anInterface8_1365 = null;
                            }
                            if (aBoolean1363) {
                                Node_Sub31_Sub31.method970(true);
                                if (Class389.aGraphicsToolkit3281 != null)
                                    Class389.aGraphicsToolkit3281.clear(0);
                            }
                            anInterface8_1358.method40(true, (aBoolean1363 || (Class389.aGraphicsToolkit3281 != null && Class389.aGraphicsToolkit3281.method2076())));
                        } else {
                            int anLocalInt = (int) ((l_4_ - aLong1364) * 255L / (long) anInterface8_1365.method35(-4076));
                            int anLocalInt_5_ = -anLocalInt + 255;
                            Node_Sub31_Sub31.method970(true);
                            anLocalInt_5_ = anLocalInt_5_ << 24 | 0xffffff;
                            anLocalInt = anLocalInt << 24 | 0xffffff;
                            Class389.aGraphicsToolkit3281.clear(0);
                            Class368 class368 = (Class389.aGraphicsToolkit3281.method2055(Applet_Sub1.canvasWidth, Applet_Sub1.canvasHeight, true));
                            Class389.aGraphicsToolkit3281.method2044(true, class368);
                            anInterface8_1365.method40(true, true);
                            Class389.aGraphicsToolkit3281.method2058();
                            class368.method4004(0, 0, 0, anLocalInt_5_, 1);
                            Class389.aGraphicsToolkit3281.method2044(true, class368);
                            Class389.aGraphicsToolkit3281.clear(0);
                            anInterface8_1358.method40(true, true);
                            Class389.aGraphicsToolkit3281.method2058();
                            class368.method4004(0, 0, 0, anLocalInt, 1);
                        }
                        try {
                            if (Class389.aGraphicsToolkit3281 != null && !(anInterface8_1358 instanceof Class87))
                                Class389.aGraphicsToolkit3281.method2086((byte) -93);
                        } catch (Exception_Sub1 exception_sub1) {
                            ErrorReporting.reportError((exception_sub1.getMessage() + " (Recovered) " + client.clientInstance.method85(31)), exception_sub1);
                            Class215.method2991((byte) -41, true, 0);
                        }
                    } else
                        anInterface8_1358.method40(true, aBoolean1363);
                    java.awt.Container container;
                    if (Applet_Sub1.gameFrame == null) {
                        if (Signlink.mainapp == null)
                            container = Applet_Sub1.currentInstance;
                        else
                            container = Signlink.mainapp;
                    } else
                        container = Applet_Sub1.gameFrame;
                    container.getSize();
                    container.getSize();
                    if (container == Applet_Sub1.gameFrame)
                        Applet_Sub1.gameFrame.getInsets();
                    aBoolean1363 = false;
                    if (Class389.aGraphicsToolkit3281 != null && !(anInterface8_1358 instanceof Class87) && (loadingStatus.getIndex() < LoadingStatus.aLoadingStatus_249.getIndex()))
                        Class46_Sub1.method436(2445);
                } catch (Exception exception) {
                    continue;
                }
            }
            long l_6_ = Applet_Sub1.getGameTime();
            int anLocalInt = (int) (-l_6_ + (l + 20L));
            if (anLocalInt > 0)
                Timing.sleep((long) anLocalInt);
        }
    }

    final synchronized void method2829() {
        aBoolean1363 = true;
    }

    final synchronized boolean method2830() {
        return anInterface8_1358.method37(-18419, aLong1364);
    }

    static final DoublyLinkedNodeP2_Sub2_Sub2 method2831(int argument, int argument_9_, int argument_10_, Class argument_11_) {
        Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[argument][argument_9_][argument_10_]);
        if (class148 == null)
            return null;
        for (Class110 class110 = class148.aClass110_1126; class110 != null; class110 = class110.aClass110_912) {
            DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2 = class110.aClass104_Sub2_Sub2_911;
            if (argument_11_.isAssignableFrom(class104_sub2_sub2.getClass()) && (class104_sub2_sub2.left == argument_9_) && (class104_sub2_sub2.bottom == argument_10_))
                return class104_sub2_sub2;
        }
        return null;
    }

    final String getText() {
        return text;
    }

    final int method2833() {
        return anInt1367;
    }

    static final int method2834() {
        return Class274.method3387(false, (byte) 6);
    }

    final LoadingStatus getClass34() {
        return loadingStatus;
    }

    final void method2836() {
        aBoolean1362 = true;
    }

    public static void method2837() {
        anIntArray1361 = null;
        aClass390_1359 = null;
    }

    final long method2838() {
        return aLong1368;
    }

    final synchronized void create(String text, LoadingStatus loadingStatus, int startPercentage, long argument_21_) {
        this.loadingStatus = loadingStatus;
        this.startPercentage = startPercentage;
        aLong1368 = argument_21_;
        this.text = text;
    }

    public LoadingBar() {
        /* empty */
    }
}
