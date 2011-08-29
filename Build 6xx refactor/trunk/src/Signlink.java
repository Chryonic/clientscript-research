/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

final class Signlink implements Runnable {
    static Applet mainapp;
    private DirectXCursorManager directXCursorManager;
    static String osNameLC;
    boolean useWin32;
    private DirectXDisplayManager directXDisplayManager;
    private static volatile long nextNetReqTime = 0L;
    private SignlinkRequest requestQueue = null;
    private Object directSoundManager;
    static String osVersion;
    private SignlinkRequest aSignlinkRequest_2248 = null;
    boolean useCache;
    private boolean shuttingDown = false;
    static String javaVersion;
    private Thread signlinkThread;
    FileOnDisk cacheDataFile;
    private static String gameName;
    FileOnDisk idx255File;
    private static int cacheId;
    private Object awtDisplayManager;
    static Method setFocusCycleRoot;
    static Method setFocusTraversalKeysEnabled;
    private Object class139Instance;
    EventQueue systemEventQueue;
    private static String osName;
    static String javaVendor;
    private static String userHome;
    FileOnDisk randomFile;
    static String osArch;
    FileOnDisk[] cacheIndexFiles;
    /*synthetic*/ static Class frameClass;
    /*synthetic*/ static Class componentClass;
    /*synthetic*/ static Class intArrayClass;
    /*synthetic*/ static Class pointClass;

    private final SignlinkRequest postRequest(int type, Object param0, int param1, int param2) {
        SignlinkRequest signlinkRequest = new SignlinkRequest();
        signlinkRequest.objectParameter = param0;
        signlinkRequest.intParameter2 = param2;
        signlinkRequest.intParameter1 = param1;
        signlinkRequest.requestType = type;
        synchronized (this) {
            if (aSignlinkRequest_2248 == null)
                aSignlinkRequest_2248 = requestQueue = signlinkRequest;
            else {
                aSignlinkRequest_2248.next = signlinkRequest;
                aSignlinkRequest_2248 = signlinkRequest;
            }
            this.notify();
        }
        return signlinkRequest;
    }

    final SignlinkRequest requestDeclaredField(Class argument_6_, String argument_7_) {
        return postRequest(9, new Object[]{argument_6_, argument_7_}, 0, 0);
    }

    final SignlinkRequest requestWebpageOpen(String argument_8_) {
        return postRequest(16, argument_8_, 0, 0);
    }

    final SignlinkRequest requestFullScreenWindow(int w, int refreshRate, int bitDepth, int h) {
        return postRequest(6, null, h + (w << 16), (bitDepth << 16) + refreshRate);
    }

    final SignlinkRequest requestURLDataInputStream(URL argument_15_) {
        return postRequest(4, argument_15_, 0, 0);
    }

    final SignlinkRequest requestHostnameForIP(int ip) {
        return postRequest(3, null, ip, 0);
    }

    final void shutdown() {
        synchronized (this) {
            shuttingDown = true;
            this.notifyAll();
        }
        try {
            signlinkThread.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
        if (this.cacheDataFile != null) {
            try {
                this.cacheDataFile.close();
            } catch (IOException ioexception) {
                /* empty */
            }
        }
        if (this.idx255File != null) {
            try {
                this.idx255File.close();
            } catch (IOException ioexception) {
                /* empty */
            }
        }
        if (this.cacheIndexFiles != null) {
            for (int anLocalInt = 0; this.cacheIndexFiles.length > anLocalInt; anLocalInt++) {
                if (this.cacheIndexFiles[anLocalInt] != null) {
                    try {
                        this.cacheIndexFiles[anLocalInt].close();
                    } catch (IOException ioexception) {
                        /* empty */
                    }
                }
            }
        }
        if (this.randomFile != null) {
            try {
                this.randomFile.close();
            } catch (IOException ioexception) {
                /* empty */
            }
        }
    }

    final SignlinkRequest requestPreferencesFile(String fileName, boolean perGame) {
        if (!perGame)
            return postRequest(13, fileName, 0, 0);
        return postRequest(12, fileName, 0, 0);
    }

    static final FileOnDisk getPreferencesFile(String argument_23_) {
        return getPreferencesFile(cacheId, gameName, argument_23_);
    }

    final SignlinkRequest requestDisplayModeHashes() {
        return postRequest(5, null, 0, 0);
    }

    final boolean isInitialized() {
        if (!this.useCache)
            return false;
        if (this.useWin32) {
            if (directXDisplayManager == null)
                return false;
            return true;
        }
        if (awtDisplayManager == null)
            return false;
        return true;
    }

    final void delayNetworkRequests() {
        nextNetReqTime = Applet_Sub1.getGameTime() + 5000L;
    }

    final SignlinkRequest requestRestoreDisplayMode(Frame argument_27_) {
        return postRequest(7, argument_27_, 0, 0);
    }

    final SignlinkRequest requestThreadStart(Runnable argument_29_, int argument_30_) {
        return postRequest(2, argument_29_, argument_30_, 0);
    }

    final SignlinkRequest requestSocket(String server, int port, boolean userProxy) {
        return postRequest(!userProxy ? 1 : 22, server, port, 0);
    }

    public final void run() {
        for (; ; ) {
            SignlinkRequest signlinkRequest;
            synchronized (this) {
                for (; ; ) {
                    if (shuttingDown)
                        return;
                    if (requestQueue != null) {
                        signlinkRequest = requestQueue;
                        requestQueue = requestQueue.next;
                        if (requestQueue == null)
                            aSignlinkRequest_2248 = null;
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            try {
                int requestType = signlinkRequest.requestType;
                switch (requestType) {
                    case 1:
                        if (Applet_Sub1.getGameTime() < nextNetReqTime)
                            throw new IOException();
                        signlinkRequest.result = new Socket(InetAddress.getByName((String) (signlinkRequest.objectParameter)), signlinkRequest.intParameter1);
                        break;
                    case 22:
                        if (Applet_Sub1.getGameTime() < nextNetReqTime)
                            throw new IOException();
                        try {
                            signlinkRequest.result = Class62_Sub14.method1413(1, signlinkRequest.intParameter1, (String) signlinkRequest.objectParameter).method3118(-120);
                        } catch (IOException_Sub1 ioexception_sub1) {
                            signlinkRequest.result = ioexception_sub1.getMessage();
                            throw ioexception_sub1;
                        }
                        break;
                    case 2:
                        Thread thread = new Thread((Runnable) (signlinkRequest.objectParameter));
                        thread.setDaemon(true);
                        thread.start();
                        thread.setPriority(signlinkRequest.intParameter1);
                        signlinkRequest.result = thread;
                        break;
                    case 4:
                        if (nextNetReqTime > Applet_Sub1.getGameTime())
                            throw new IOException();
                        signlinkRequest.result = new DataInputStream(((URL) (signlinkRequest.objectParameter)).openStream());
                        break;
                    case 8: {
                        Object[] objects = (Object[]) signlinkRequest.objectParameter;
                        if (this.useCache && (((Class) objects[0]).getClassLoader() == null))
                            throw new SecurityException();
                        signlinkRequest.result = (((Class) objects[0]).getDeclaredMethod((String) objects[1], (Class[]) objects[2]));
                        break;
                    }
                    case 9: {
                        Object[] objects = (Object[]) signlinkRequest.objectParameter;
                        if (this.useCache && (((Class) objects[0]).getClassLoader() == null))
                            throw new SecurityException();
                        signlinkRequest.result = ((Class) objects[0]).getDeclaredField((String) objects[1]);
                        break;
                    }
                    case 18: {
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                        signlinkRequest.result = clipboard.getContents(null);
                        break;
                    }
                    case 19: {
                        Transferable transferable = ((Transferable) signlinkRequest.objectParameter);
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                        clipboard.setContents(transferable, null);
                        break;
                    }
                    default:
                        if (!this.useCache)
                            throw new Exception("");
                        if (requestType == 3) {
                            if (nextNetReqTime > Applet_Sub1.getGameTime())
                                throw new IOException();
                            String string = (String.valueOf((signlinkRequest.intParameter1 >> 24) & 0xff) + "." + ((signlinkRequest.intParameter1 & 0xff8f76) >> 16) + "." + ((signlinkRequest.intParameter1 & 0xff34) >> 8) + "." + (signlinkRequest.intParameter1 & 0xff));
                            signlinkRequest.result = InetAddress.getByName(string).getHostName();
                        } else if (requestType == 21) {
                            if (nextNetReqTime > Applet_Sub1.getGameTime())
                                throw new IOException();
                            signlinkRequest.result = InetAddress.getByName((String) (signlinkRequest.objectParameter)).getAddress();
                        } else if (requestType == 5) {
                            if (this.useWin32)
                                signlinkRequest.result = directXDisplayManager.getDisplayModeHashes(-51);
                            else
                                signlinkRequest.result = (Class.forName("AwtDisplayManager").getMethod("getDisplayModeHashes", new Class[0]).invoke(awtDisplayManager, new Object[0]));
                        } else if (requestType == 6) {
                            Frame frame = (new Frame("Jagex Full Screen"));
                            signlinkRequest.result = frame;
                            frame.setResizable(false);
                            if (this.useWin32)
                                directXDisplayManager.setFullScreenDisplayMode(signlinkRequest.intParameter1 & 0xffff, frame, (signlinkRequest.intParameter2) >> 16, (signlinkRequest.intParameter2) & 0xffff, signlinkRequest.intParameter1 >>> 16, 0);
                            else
                                Class.forName("AwtDisplayManager").getMethod("setFullScreenDisplayMode", (new Class[]{(frameClass != null ? frameClass : (frameClass = (getClassForName("java.awt.Frame")))), Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE})).invoke(awtDisplayManager, (new Object[]{frame, new Integer((signlinkRequest.intParameter1) >>> 16), new Integer((signlinkRequest.intParameter1) & 0xffff), new Integer((signlinkRequest.intParameter2) >> 16), (new Integer((signlinkRequest.intParameter2) & 0xffff))}));
                        } else if (requestType == 7) {
                            if (!this.useWin32)
                                Class.forName("AwtDisplayManager").getMethod("restoreDisplayMode", new Class[0]).invoke(awtDisplayManager, new Object[0]);
                            else
                                directXDisplayManager.restoreDisplayMode(((Frame) (signlinkRequest.objectParameter)), -125);
                        } else if (requestType == 12) {
                            FileOnDisk fileOnDisk = getPreferencesFile(cacheId, gameName, ((String) (signlinkRequest.objectParameter)));
                            signlinkRequest.result = fileOnDisk;
                        } else if (requestType == 13) {
                            FileOnDisk fileOnDisk = (getPreferencesFile(cacheId, "", ((String) (signlinkRequest.objectParameter))));
                            signlinkRequest.result = fileOnDisk;
                        } else if (this.useCache && requestType == 14) {
                            int anLocalInt_38_ = signlinkRequest.intParameter1;
                            int anLocalInt_39_ = (signlinkRequest.intParameter2);
                            if (!this.useWin32)
                                Class.forName("AwtCursorManager").getDeclaredMethod("mouseMove", (new Class[]{Integer.TYPE, (Integer.TYPE)})).invoke(class139Instance, (new Object[]{(new Integer(anLocalInt_38_)), (new Integer(anLocalInt_39_))}));
                            else
                                directXCursorManager.mouseMove(118, anLocalInt_38_, anLocalInt_39_);
                        } else if (this.useCache && requestType == 15) {
                            boolean anLocalBoolean = (signlinkRequest.intParameter1 != 0);
                            Component component = ((Component) (signlinkRequest.objectParameter));
                            if (this.useWin32)
                                directXCursorManager.setComponent(component, anLocalBoolean, 15798);
                            else
                                Class.forName("AwtCursorManager").getDeclaredMethod("setComponent", (new Class[]{((componentClass != null) ? componentClass : (componentClass = (getClassForName("java.awt.Component")))), (Boolean.TYPE)})).invoke(class139Instance, (new Object[]{component, (new Boolean(anLocalBoolean))}));
                        } else if (!this.useWin32 && (requestType == 17)) {
                            Object[] objects = ((Object[]) (signlinkRequest.objectParameter));
                            Class.forName("AwtCursorManager").getDeclaredMethod("setCursor", (new Class[]{((componentClass != null) ? componentClass : (componentClass = (getClassForName("java.awt.Component")))), ((intArrayClass != null) ? intArrayClass : (intArrayClass = (getClassForName("[I")))), (Integer.TYPE), (Integer.TYPE), ((pointClass != null) ? pointClass : (pointClass = (getClassForName("java.awt.Point"))))})).invoke(class139Instance, (new Object[]{((Component) (objects[0])), ((int[]) (objects[1])), (new Integer(signlinkRequest.intParameter1)), (new Integer(signlinkRequest.intParameter2)), ((Point) (objects[2]))}));
                        } else if (requestType == 16) {
                            try {
                                if (!osNameLC.startsWith("win"))
                                    throw new Exception();
                                String string = ((String) (signlinkRequest.objectParameter));
                                if (!(string.startsWith("http://")) && !(string.startsWith("https://")))
                                    throw new Exception();
                                String string_36_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                for (int anLocalInt_37_ = 0; (anLocalInt_37_ < (string.length())); anLocalInt_37_++) {
                                    if ((string_36_.indexOf(string.charAt(anLocalInt_37_))) == -1)
                                        throw new Exception();
                                }
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string + "\"");
                                signlinkRequest.result = null;
                            } catch (Exception exception) {
                                signlinkRequest.result = exception;
                                throw exception;
                            }
                        } else {
                            throw new Exception("");
                        }
                        break;
                }
                signlinkRequest.status = 1;
            } catch (ThreadDeath threaddeath) {
                throw threaddeath;
            } catch (Throwable throwable) {
                signlinkRequest.status = 2;
            }
            synchronized (signlinkRequest) {
                signlinkRequest.notify();
            }
        }
    }

    final SignlinkRequest requestDeclaredMethod(String argument_40_, Class[] argument_42_, Class argument_43_) {
        return postRequest(8, new Object[]{argument_43_, argument_40_, argument_42_}, 0, 0);
    }

    final boolean writeFile(File file, byte[] data) {
        try {
            FileOutputStream fileoutputstream = new FileOutputStream(file);
            fileoutputstream.write(data, 0, data.length);
            fileoutputstream.close();
            return true;
        } catch (IOException ioexception) {
            throw new RuntimeException();
        }
    }

    private static final FileOnDisk getPreferencesFile(int cacheId, String gamename, String pref_name) {
        String string;
        if (cacheId == 33) {
            string = ("jagex_" + gamename + "_preferences" + pref_name + "_rc.dat");
        } else if (cacheId == 34) {
            string = ("jagex_" + gamename + "_preferences" + pref_name + "_wip.dat");
        } else {
            string = ("jagex_" + gamename + "_preferences" + pref_name + ".dat");
        }
        String[] cacheLocations = {"c:/rscache/", "/rscache/", userHome, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
        for (int anLocalInt = 0; cacheLocations.length > anLocalInt; anLocalInt++) {
            String string_50_ = cacheLocations[anLocalInt];
            if (string_50_.length() <= 0 || new File(string_50_).exists()) {
                try {
                    FileOnDisk fileOnDisk = new FileOnDisk(new File(string_50_, string), "rw", 10000L);
                    return fileOnDisk;
                } catch (Exception exception) {
                    /* empty */
                }
            }
        }
        return null;
    }

    final Object getDirectSoundManager() {
        return directSoundManager;
    }

    final SignlinkRequest requestSetCursor(int argument_52_, int[] argument_54_, int argument_55_, Component argument_56_, Point argument_57_) {
        return postRequest(17, new Object[]{argument_56_, argument_54_, argument_57_}, argument_52_, argument_55_);
    }

    Signlink(int argument_58_, String argument_59_, int argument_60_, boolean argument_61_) throws Exception {
        this.useCache = false;
        this.cacheDataFile = null;
        this.useWin32 = false;
        this.idx255File = null;
        this.randomFile = null;
        this.useCache = argument_61_;
        cacheId = argument_58_;
        cacheId = 647;
        gameName = argument_59_;
        javaVendor = "Unknown";
        javaVersion = "1.1";
        try {
            javaVendor = System.getProperty("java.vendor");
            javaVersion = System.getProperty("java.version");
        } catch (Exception exception) {
            /* empty */
        }
        if (javaVendor.toLowerCase().indexOf("microsoft") != -1)
            this.useWin32 = true;
        try {
            osName = System.getProperty("os.name");
        } catch (Exception exception) {
            osName = "Unknown";
        }
        osNameLC = osName.toLowerCase();
        try {
            osArch = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
            osArch = "";
        }
        try {
            osVersion = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
            osVersion = "";
        }
        try {
            userHome = System.getProperty("user.home");
            if (userHome != null)
                userHome += "/";
        } catch (Exception exception) {
            /* empty */
        }
        if (userHome == null)
            userHome = "~/";
        try {
            this.systemEventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable throwable) {
            /* empty */
        }
        if (!this.useWin32) {
            try {
                setFocusTraversalKeysEnabled = (Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE}));
            } catch (Exception exception) {
                /* empty */
            }
            try {
                setFocusCycleRoot = (Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE}));
            } catch (Exception exception) {
                /* empty */
            }
        }
        CacheFileOpener.initialize(cacheId, gameName);
        if (this.useCache) {
            this.randomFile = new FileOnDisk(CacheFileOpener.getCacheFile(cacheId, null, "random.dat"), "rw", 25L);
            this.cacheDataFile = new FileOnDisk(CacheFileOpener.getCacheFile("main_file_cache.dat2"), "rw", 314572800L);
            this.idx255File = new FileOnDisk(CacheFileOpener.getCacheFile("main_file_cache.idx255"), "rw", 1048576L);
            this.cacheIndexFiles = new FileOnDisk[argument_60_];
            for (int idx = 0; argument_60_ > idx; idx++)
                this.cacheIndexFiles[idx] = new FileOnDisk(CacheFileOpener.getCacheFile(("main_file_cache.idx" + idx)), "rw", 1048576L);
            if (this.useWin32) {
                try {
                    directSoundManager = Class.forName("DirectSoundManager").newInstance();
                } catch (Throwable throwable) {
                    /* empty */
                }
            }
            try {
                if (!this.useWin32)
                    awtDisplayManager = Class.forName("AwtDisplayManager").newInstance();
                else
                    directXDisplayManager = new DirectXDisplayManager();
            } catch (Throwable throwable) {
                /* empty */
            }
            try {
                if (!this.useWin32)
                    class139Instance = Class.forName("AwtCursorManager").newInstance();
                else
                    directXCursorManager = new DirectXCursorManager();
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        if (this.useCache && !this.useWin32) {
            ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
            for (ThreadGroup threadgroup_62_ = threadgroup.getParent(); threadgroup_62_ != null; threadgroup_62_ = threadgroup.getParent())
                threadgroup = threadgroup_62_;
            Thread[] threads = new Thread[1000];
            threadgroup.enumerate(threads);
            for (int anLocalInt = 0; threads.length > anLocalInt; anLocalInt++) {
                if (threads[anLocalInt] != null && threads[anLocalInt].getName().startsWith("AWT"))
                    threads[anLocalInt].setPriority(1);
            }
        }
        shuttingDown = false;
        signlinkThread = new Thread(this);
        signlinkThread.setName("[RT5] Signlink thread");
        signlinkThread.setPriority(10);
        signlinkThread.setDaemon(true);
        signlinkThread.start();
    }

    /*synthetic*/
    static Class getClassForName(String argument) {
        try {
            return Class.forName(argument);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
