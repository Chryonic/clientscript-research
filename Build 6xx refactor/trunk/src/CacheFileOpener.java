/* Class355 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class CacheFileOpener {
    private static Hashtable fileCache;
    private static boolean initialized = false;
    private static String gameName;
    private static int cacheId;
    private static String userHome;

    public static void initialize(int cacheId,
                                  String gameName) {
        CacheFileOpener.cacheId = cacheId;
        CacheFileOpener.gameName = gameName;
        try {
            userHome = System.getProperty("user.home");
            if (userHome != null)
                userHome += "/";
        } catch (Exception exception) {
            /* empty */
        }
        if (userHome == null)
            userHome = "~/";
        initialized = true;
    }

    public static File getCacheFile(String fileName) {
        return getCacheFile(cacheId, gameName, fileName);
    }

    public static File getCacheFile(int cacheId,
                                    String gameName, String fileName) {
        if (!initialized)
            throw new RuntimeException("Not initialized");
        File file = (File) fileCache.get(fileName);
        if (file != null)
            return file;
        String[] cacheLocations = {"c:/rscache/", "/rscache/", "c:/windows/",
                "c:/winnt/", "c:/", userHome, "/tmp/", ""};
        String[] cacheStoreNames
                = {".jagex_cache_" + cacheId, ".file_store_" + cacheId};
        for (int tries = 0; tries < 2; tries++) {
            for (int nameIdx = 0; cacheStoreNames.length > nameIdx; nameIdx++) {
                for (int locIdx = 0; cacheLocations.length > locIdx;
                     locIdx++) {
                    String path = (cacheLocations[locIdx] + cacheStoreNames[nameIdx] + "/" + (gameName == null ? "" : gameName + "/") + fileName);
                    RandomAccessFile randomaccessfile = null;
                    try {
                        File openedFile = new File(path);
                        if (tries != 0 || openedFile.exists()) {
                            String string_10_ = cacheLocations[locIdx];
                            if (tries != 1 || string_10_.length() <= 0 || new File(string_10_).exists()) {
                                new File(cacheLocations[locIdx] + cacheStoreNames[nameIdx]).mkdir();
                                if (gameName != null)
                                    new File(cacheLocations[locIdx] + cacheStoreNames[nameIdx] + "/" + gameName).mkdir();
                                randomaccessfile
                                        = new RandomAccessFile(openedFile, "rw");
                                System.out.println(openedFile.getAbsolutePath());
                                int firstByte = randomaccessfile.read();
                                randomaccessfile.seek(0L);
                                randomaccessfile.write(firstByte);//Write permission check
                                randomaccessfile.seek(0L);
                                randomaccessfile.close();
                                fileCache.put(fileName, openedFile);
                                return openedFile;
                            }
                        }
                    } catch (Exception exception) {
                        try {
                            if (randomaccessfile != null) {
                                randomaccessfile.close();
                            }
                        } catch (Exception exception_12_) {
                            /* empty */
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    static {
        fileCache = new Hashtable(16);
    }
}
