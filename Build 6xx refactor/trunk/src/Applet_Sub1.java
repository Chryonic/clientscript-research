/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

import jagex3.jagmisc.jagmisc;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {
    static Frame gameFrame;
    static int containerHeight;
    static int containerWidth;
    static Applet_Sub1 currentInstance = null;
    static volatile boolean shouldRepaint;
    static int instanceCount = 0;
    static Canvas gameCanvas;
    static Frame overridingFrame;
    static int gameRevision;
    static int canvasWidth;
    static int canvasHeight;
    static int canvasX = 0;
    static int canvasY = 0;
    static Applet anApplet5957;
    static boolean java5Plus;
    static boolean objectTagApplet = false;
    static boolean useJavaScript = false;
    static long aLong1979;
    static long aLong3760;
    static Signlink baseSignlink;
    static Font loadingBarFont;
    static Image backBuffer;
    static String loadingText = null;
    private boolean aBoolean6 = false;
    private boolean aBoolean7 = false;
    static int anInt8 = 1;
    static Class320 aClass320_9 = new Class320(4);
    static Class166 aClass166_10 = new Class166(39, -1);
    public static int anInt11;
    public static int anInt12;
    public static int anInt13;
    public static boolean aBoolean14;
    public static boolean aBoolean15;
    public static boolean aBoolean16;
    public static boolean aBoolean17;
    public static int anInt18;
    public static int anInt19;
    public static int anInt20;
    public static boolean aBoolean21;
    public static boolean aBoolean22;
    public static int anInt23;
    public static boolean aBoolean24;
    public static boolean aBoolean25;
    public static boolean aBoolean26;
    public static boolean aBoolean27;
    public static int anInt28;
    public static int anInt29;

    static synchronized long getGameTime() {
        long currentTime = System.currentTimeMillis();
        if (aLong1979 > currentTime)
            aLong3760 += aLong1979 - currentTime;
        aLong1979 = currentTime;
        return currentTime + aLong3760;
    }

    static final void drawLoadingBar(int percentage, String barText, Color barBorderColour, Color barFillColour, Color textColour) {
        try {
            Graphics graphics = gameCanvas.getGraphics();
            if (loadingBarFont == null)
                loadingBarFont = new Font("Helvetica", 1, 13);
            if (barFillColour == null)
                barFillColour = new Color(140, 17, 17);
            if (barBorderColour == null)
                barBorderColour = new Color(140, 17, 17);
            if (textColour == null)
                textColour = new Color(255, 255, 255);
            try {
                if (backBuffer == null)
                    backBuffer = gameCanvas.createImage(canvasWidth, canvasHeight);
                Graphics gImage = backBuffer.getGraphics();
                gImage.setColor(Color.black);
                gImage.fillRect(0, 0, canvasWidth, canvasHeight);
                int loadingBarX = canvasWidth / 2 - 152;
                int loadingBarY = canvasHeight / 2 - 18;
                gImage.setColor(barBorderColour);
                gImage.drawRect(loadingBarX, loadingBarY, 303, 33);
                gImage.setColor(barFillColour);
                gImage.fillRect(loadingBarX + 2, loadingBarY + 2, percentage * 3, 30);
                gImage.setColor(Color.black);
                gImage.drawRect(loadingBarX + 1, loadingBarY + 1, 301, 31);
                gImage.fillRect(loadingBarX + 2 + percentage * 3, loadingBarY + 2, -(percentage * 3) + 300, 30);
                gImage.setFont(loadingBarFont);
                gImage.setColor(textColour);
                gImage.drawString(barText, (loadingBarX + ((304 - barText.length() * 6) / 2)), loadingBarY + 22);
                if (loadingText != null) {
                    gImage.setFont(loadingBarFont);
                    gImage.setColor(textColour);
                    gImage.drawString(loadingText, (canvasWidth / 2 - loadingText.length() * 6 / 2), canvasHeight / 2 - 26);
                }
                graphics.drawImage(backBuffer, 0, 0, null);
            } catch (Exception exception) {
                graphics.setColor(Color.black);
                graphics.fillRect(0, 0, canvasWidth, canvasHeight);
                int anLocalInt = canvasWidth / 2 - 152;
                int anLocalInt_7_ = canvasHeight / 2 - 18;
                graphics.setColor(barBorderColour);
                graphics.drawRect(anLocalInt, anLocalInt_7_, 303, 33);
                graphics.setColor(barFillColour);
                graphics.fillRect(anLocalInt + 2, anLocalInt_7_ + 2, percentage * 3, 30);
                graphics.setColor(Color.black);
                graphics.drawRect(anLocalInt + 1, anLocalInt_7_ + 1, 301, 31);
                graphics.fillRect(anLocalInt + 2 + percentage * 3, anLocalInt_7_ + 2, -(percentage * 3) + 300, 30);
                graphics.setFont(loadingBarFont);
                graphics.setColor(textColour);
                if (loadingText != null) {
                    graphics.setFont(loadingBarFont);
                    graphics.setColor(textColour);
                    graphics.drawString(loadingText, (canvasWidth / 2 - loadingText.length() * 6 / 2), canvasHeight / 2 - 26);
                }
                graphics.drawString(barText, ((-(barText.length() * 6) + 304) / 2 + anLocalInt), anLocalInt_7_ + 22);
            }
        } catch (Exception exception) {
            gameCanvas.repaint();
        }
    }

    final void initialize(String gameName, int gameRevision, int gameWidth, int gameHeight, int cacheId, int argument_3_, int argument_0_, boolean argument_6_) {
        try {
            anApplet5957 = null;
            canvasY = argument_0_;
            Applet_Sub1.gameRevision = gameRevision;
            Applet_Sub1.containerWidth = canvasWidth = gameWidth;
            currentInstance = this;
            Applet_Sub1.containerHeight = canvasHeight = gameHeight;
            canvasX = 0;
            gameFrame = new Frame();
            gameFrame.setTitle("Jagex");
            gameFrame.setResizable(true);
            gameFrame.addWindowListener(this);
            gameFrame.setVisible(true);
            gameFrame.toFront();
            Insets insets = gameFrame.getInsets();
            gameFrame.setSize(insets.right + (gameWidth + insets.left), (insets.bottom + insets.top + gameHeight));
            Statics.aSignlink_1105 = baseSignlink = new Signlink(cacheId, gameName, argument_3_, true);
            SignlinkRequest signlinkRequest = baseSignlink.requestThreadStart(this, 1);
            while (signlinkRequest.status == 0)
                Timing.sleep(10L);
        } catch (Exception exception) {
            ErrorReporting.reportError(null, exception);
        }
    }

    public final synchronized void paint(Graphics g) {
        if (this == currentInstance && !Class252.aBoolean1982) {
            Node_Sub49.aBoolean4293 = true;
            if (java5Plus && -Class217.aLong1529 + getGameTime() > 1000L) {
                Rectangle rectangle = g.getClipBounds();
                if (rectangle == null || (containerWidth <= rectangle.width && rectangle.height >= containerHeight))
                    shouldRepaint = true;
            }
        }
    }

    public final void windowClosed(WindowEvent argument_9_) {
        /* empty */
    }

    String method85(int argument_10_) {
        if (argument_10_ <= 29)
            return null;
        return null;
    }

    abstract void method86(int argument_11_);

    public final void focusGained(FocusEvent argument_12_) {
        Node_Sub31_Sub16.aBoolean5913 = true;
        Node_Sub49.aBoolean4293 = true;
    }

    public final void focusLost(FocusEvent argument_13_) {
        Node_Sub31_Sub16.aBoolean5913 = false;
    }

    private final void method87(int argument_14_) {
        long l = getGameTime();
        long l_15_ = DoublyLinkedNodeP2_Sub2_Sub3.aLongArray6421[Class134.anInt3612];
        DoublyLinkedNodeP2_Sub2_Sub3.aLongArray6421[Class134.anInt3612] = l;
        Class134.anInt3612 = Class134.anInt3612 + 1 & 0x1f;
        if (l_15_ != 0L && l > l_15_) {
            int anLocalInt = (int) (-l_15_ + l);
            Class350_Sub1.anInt5433 = (32000 + (anLocalInt >> 1)) / anLocalInt;
        }
        if (Class79.anInt563++ > 50) {
            Class79.anInt563 -= 50;
            Node_Sub49.aBoolean4293 = true;
            gameCanvas.setSize(canvasWidth, canvasHeight);
            gameCanvas.setVisible(true);
            if (gameFrame == null || overridingFrame != null)
                gameCanvas.setLocation(canvasX, canvasY);
            else {
                Insets insets = gameFrame.getInsets();
                gameCanvas.setLocation((canvasX + insets.left), (insets.top + canvasY));
            }
        }
        method94((byte) -88);
    }

    public final void update(Graphics g) {
        paint(g);
    }

    public final URL getCodeBase() {
        if (gameFrame != null)
            return null;
        if (Signlink.mainapp != null && Signlink.mainapp != this)
            return Signlink.mainapp.getCodeBase();
        return super.getCodeBase();
    }

    public static final void method88(Applet argument) {
        Signlink.mainapp = argument;
    }

    final boolean method89(int argument_17_) {
        return NativeManager.method2978("jagtheora");
    }

    public final void stop() {
        if (currentInstance == this && !Class252.aBoolean1982)
            DCyclicLinkedList.aLong446 = getGameTime() + 4000L;
    }

    public final URL getDocumentBase() {
        if (gameFrame != null)
            return null;
        if (Signlink.mainapp != null && this != Signlink.mainapp)
            return Signlink.mainapp.getDocumentBase();
        return super.getDocumentBase();
    }

    private final void method90(int argument_18_) {
        if (argument_18_ != 22054)
            anInt8 = 0;
        long l = getGameTime();
        long l_19_ = Class78.aLongArray553[DoublyLinkedNode_Sub51_Sub10.anInt5592];
        Class78.aLongArray553[DoublyLinkedNode_Sub51_Sub10.anInt5592] = l;
        if (l_19_ != 0L && l_19_ < l) {
            /* empty */
        }
        DoublyLinkedNode_Sub51_Sub10.anInt5592 = DoublyLinkedNode_Sub51_Sub10.anInt5592 + 1 & 0x1f;
        synchronized (this) {
            Node_Sub31_Sub31.aBoolean5990 = Node_Sub31_Sub16.aBoolean5913;
        }
        method92(argument_18_ - 21960);
    }

    public static void method91(byte argument) {
        aClass320_9 = null;
        aClass166_10 = null;
    }

    abstract void method92(int argument_20_);

    public final AppletContext getAppletContext() {
        if (gameFrame != null)
            return null;
        if (Signlink.mainapp != null && this != Signlink.mainapp)
            return Signlink.mainapp.getAppletContext();
        return super.getAppletContext();
    }

    final void initializeApplet(int w, int h, String gamename, int revision, int argument_24_, int argument_25_, boolean argument_27_) {
        try {
            if (!argument_27_) {
                if (currentInstance != null) {
                    instanceCount++;
                    if (instanceCount >= 3)
                        loaderror(-98, "alreadyloaded");
                    else
                        getAppletContext().showDocument(getDocumentBase(), "_self");
                } else {
                    containerWidth = canvasWidth = w;
                    gameRevision = revision;
                    currentInstance = this;
                    canvasY = 0;
                    canvasX = 0;
                    anApplet5957 = Signlink.mainapp;
                    containerHeight = canvasHeight = h;
                    Statics.aSignlink_1105 = baseSignlink = new Signlink(argument_24_, gamename, argument_25_, Signlink.mainapp != null);
                    SignlinkRequest signlinkRequest = baseSignlink.requestThreadStart(this, 1);
                    while (signlinkRequest.status == 0)
                        Timing.sleep(10L);
                }
            }
        } catch (Throwable throwable) {
            ErrorReporting.reportError(null, throwable);
            loaderror(-128, "crash");
        }
    }

    public final void windowDeiconified(WindowEvent argument_28_) {
        /* empty */
    }

    abstract void method94(byte argument_29_);

    public final void windowDeactivated(WindowEvent argument_30_) {
        /* empty */
    }

    synchronized void initializeCanvas() {
        if (gameCanvas != null) {
            gameCanvas.removeFocusListener(this);
            gameCanvas.getParent().setBackground(Color.black);
            gameCanvas.getParent().remove(gameCanvas);
        }
        Container container;
        if (overridingFrame == null) {
            if (gameFrame == null) {
                if (Signlink.mainapp == null)
                    container = currentInstance;
                else
                    container = Signlink.mainapp;
            } else
                container = gameFrame;
        } else
            container = overridingFrame;
        container.setLayout(null);
        gameCanvas = new Canvas_Sub1(this);
        container.add(gameCanvas);
        gameCanvas.setSize(canvasWidth, canvasHeight);
        gameCanvas.setVisible(true);
        if (container == gameFrame) {
            Insets insets = gameFrame.getInsets();
            gameCanvas.setLocation(insets.left + canvasX, insets.top + canvasY);
        } else
            gameCanvas.setLocation(canvasX, canvasY);
        gameCanvas.addFocusListener(this);
        gameCanvas.requestFocus();
        Node_Sub31_Sub16.aBoolean5913 = true;
        Node_Sub31_Sub31.aBoolean5990 = true;
        Node_Sub49.aBoolean4293 = true;
        shouldRepaint = false;
        Class217.aLong1529 = getGameTime();
    }

    final boolean method96(int argument_32_) {
        return NativeManager.method2978("jagmisc");
    }

    private final void shutdown(boolean clean) {
        synchronized (this) {
            if (Class252.aBoolean1982)
                return;
            Class252.aBoolean1982 = true;
        }
        System.out.println("Shutdown start - clean:" + clean);
        if (Signlink.mainapp != null)
            Signlink.mainapp.destroy();
        try {
            method86(-38);
        } catch (Exception exception) {
            /* empty */
        }
        if (aBoolean6) {
            try {
                jagmisc.quit();
            } catch (Throwable throwable) {
                /* empty */
            }
            aBoolean6 = false;
        }
        Class346.method3808(-14, true);
        Class374.method4081((byte) -28);
        if (gameCanvas != null) {
            try {
                gameCanvas.removeFocusListener(this);
                gameCanvas.getParent().remove(gameCanvas);
            } catch (Exception exception) {
                /* empty */
            }
        }
        if (baseSignlink != null) {
            try {
                baseSignlink.shutdown();
            } catch (Exception exception) {
                /* empty */
            }
        }
        method105((byte) 122);
        if (gameFrame != null) {
            gameFrame.setVisible(false);
            gameFrame.dispose();
            gameFrame = null;
        }
        System.out.println("Shutdown complete - clean:" + clean);
    }

    final boolean isValidHost() {
        String string = getDocumentBase().getHost().toLowerCase();
        if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
            return true;
        if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
            return true;
        if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
            return true;
        if (string.endsWith("127.0.0.1"))
            return true;
        for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
            /* empty */
        }
        if (string.endsWith("192.168.1."))
            return true;
        loaderror(-91, "invalidhost");
        return false;
    }

    public final void windowOpened(WindowEvent argument_36_) {
        /* empty */
    }

    static final TestingStageEnum[] getTestingStages(boolean argument) {
        return (new TestingStageEnum[]{TestingStageEnum.LIVE, TestingStageEnum.WTRC, TestingStageEnum.WTQA, TestingStageEnum.WTWIP, TestingStageEnum.LOCAL, TestingStageEnum.WTI, TestingStageEnum.INTBETA});
    }

    public final void windowActivated(WindowEvent argument_37_) {
        /* empty */
    }

    public final void start() {
        if (currentInstance == this && !Class252.aBoolean1982)
            DCyclicLinkedList.aLong446 = 0L;
    }

    public final void run() {
        do {
            try {
                if (Signlink.javaVendor != null) {
                    String javaVendorLC = Signlink.javaVendor.toLowerCase();
                    if (javaVendorLC.contains("sun") || javaVendorLC.contains("apple")) {
                        String javaVersion = Signlink.javaVersion;
                        if (javaVersion.equals("1.1") || javaVersion.startsWith("1.1.") || javaVersion.equals("1.2") || javaVersion.startsWith("1.2.")) {
                            loaderror(-124, "wrongjava");
                            break;
                        }
                    } else if (javaVendorLC.contains("ibm") && (Signlink.javaVersion == null || Signlink.javaVersion.equals("1.4.2"))) {
                        loaderror(-88, "wrongjava");
                        break;
                    }
                }
                if (Signlink.javaVersion != null && Signlink.javaVersion.startsWith("1.")) {
                    int characterPos = 2;
                    int javaMinorVersion = 0;
                    while (characterPos < Signlink.javaVersion.length()) {
                        int verChar = Signlink.javaVersion.charAt(characterPos);
                        if (verChar < 48 || verChar > 57)
                            break;
                        characterPos++;
                        javaMinorVersion = verChar - 48 + javaMinorVersion * 10;
                    }
                    if (javaMinorVersion >= 5)
                        java5Plus = true;
                }
                Applet applet = currentInstance;
                if (Signlink.mainapp != null)
                    applet = Signlink.mainapp;
                Method method = Signlink.setFocusCycleRoot;
                if (method != null) {
                    try {
                        method.invoke(applet, new Object[]{Boolean.TRUE});
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                }
                Class332.method3723(56);
                Class259.method3309(-1358116690);
                initializeCanvas();
                method100(-23014);
                Class111.aClass88_917 = Statics.method384((byte) 90);
                while (DCyclicLinkedList.aLong446 == 0L || getGameTime() < DCyclicLinkedList.aLong446) {
                    Class242.anInt1760 = Class111.aClass88_917.method1642(15841, Class245_Sub2_Sub1.aLong6521);
                    for (int anLocalInt = 0; anLocalInt < Class242.anInt1760; anLocalInt++)
                        method90(22054);
                    method87(0);
                    Gl2Water0.method207(gameCanvas, baseSignlink);
                }
            } catch (ThreadDeath threaddeath) {
                throw threaddeath;
            } catch (Throwable throwable) {
                ErrorReporting.reportError(method85(96), throwable);
                loaderror(-98, "crash");
            } finally {
                shutdown(true);
            }
        } while (false);
    }

    public final void destroy() {
        if (this == currentInstance && !Class252.aBoolean1982) {
            DCyclicLinkedList.aLong446 = getGameTime();
            Timing.sleep(5000L);
            Statics.aSignlink_1105 = null;
            shutdown(false);
        }
    }

    abstract void method100(int argument_41_);

    public final String getParameter(String argument_42_) {
        if (gameFrame != null)
            return null;
        if (Signlink.mainapp != null && Signlink.mainapp != this)
            return Signlink.mainapp.getParameter(argument_42_);
        return super.getParameter(argument_42_);
    }

    static final void method101(int argument, byte argument_43_, int argument_44_) {
        DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3 = Node_Sub31_Sub15_Sub1.method922(18, 13175, ((long) argument_44_ << 32 | (long) argument));
        class59_sub51_sub3.method1181(585134072);
    }

    public final void windowIconified(WindowEvent argument_45_) {
        /* empty */
    }

    final boolean method102(int argument_46_) {
        return NativeManager.method2978("jaclib");
    }

    static final boolean method103(int argument, int argument_47_, int argument_48_) {
        if ((argument & 0x800) == 0 || (argument_47_ & 0x37) == 0)
            return false;
        return true;
    }

    public final void windowClosing(WindowEvent argument_49_) {
        destroy();
    }

    public abstract void init();

    final void loaderror(int argument_50_, String argument_51_) {
        if (!aBoolean7) {
            aBoolean7 = true;
            System.out.println("error_game_" + argument_51_);
            try {
                Class328.method3698(Signlink.mainapp, "loggedout", (byte) 119);
            } catch (Throwable throwable) {
                /* empty */
            }
            try {
                getAppletContext().showDocument(new URL(getCodeBase(), ("error_game_" + argument_51_ + ".ws")), "_top");
            } catch (Exception exception) {
                /* empty */
            }
        }
    }

    abstract void method105(byte argument_52_);
}
