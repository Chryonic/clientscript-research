/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ByteArrayManager {
    static int byteArrayPoolSize100Ptr = 0;
    static int byteArrayPoolSize5000Ptr = 0;
    static int byteArrayPoolSize30000Ptr = 0;
    static byte[][] byteArrayPoolSize30000 = new byte[50][];
    static byte[][] byteArrayPoolSize5000 = new byte[250][];
    static byte[][] byteArrayPoolSize100 = new byte[1000][];
    static byte[][][] byteArrayPool;
    static int[] byteArrayPoolSizes;
    static int[] byteArrayPoolPtr;

    static synchronized byte[] createByteArray(int desiredSize) {
        if (desiredSize == 100 && byteArrayPoolSize100Ptr > 0) {
            byte[] anLocalInts = byteArrayPoolSize100[--byteArrayPoolSize100Ptr];
            byteArrayPoolSize100[byteArrayPoolSize100Ptr] = null;
            return anLocalInts;
        }
        if (desiredSize == 5000 && byteArrayPoolSize5000Ptr > 0) {
            byte[] anLocalInts = (byteArrayPoolSize5000[--byteArrayPoolSize5000Ptr]);
            byteArrayPoolSize5000[byteArrayPoolSize5000Ptr] = null;
            return anLocalInts;
        }
        if (desiredSize == 30000 && byteArrayPoolSize30000Ptr > 0) {
            byte[] anLocalInts = (byteArrayPoolSize30000[--byteArrayPoolSize30000Ptr]);
            byteArrayPoolSize30000[byteArrayPoolSize30000Ptr] = null;
            return anLocalInts;
        }
        if (byteArrayPool != null) {
            for (int ptr = 0; byteArrayPoolSizes.length > ptr; ptr++) {
                if (desiredSize == byteArrayPoolSizes[ptr] && byteArrayPoolPtr[ptr] > 0) {
                    byte[] bytes = (byteArrayPool[ptr][--byteArrayPoolPtr[ptr]]);
                    byteArrayPool[ptr][byteArrayPoolPtr[ptr]] = null;
                    return bytes;
                }
            }
        }
        return new byte[desiredSize];
    }

    static synchronized void freeByteArray(byte[] array) {
        if (array.length == 100 && byteArrayPoolSize100Ptr < 1000)
            byteArrayPoolSize100[byteArrayPoolSize100Ptr++] = array;
        else if (array.length == 5000 && byteArrayPoolSize5000Ptr < 250)
            byteArrayPoolSize5000[byteArrayPoolSize5000Ptr++] = array;
        else if (array.length == 30000 && byteArrayPoolSize30000Ptr < 50)
            byteArrayPoolSize30000[byteArrayPoolSize30000Ptr++] = array;
        else if (byteArrayPool != null) {
            for (int anLocalInt = 0; anLocalInt < byteArrayPoolSizes.length; anLocalInt++) {
                if ((byteArrayPoolSizes[anLocalInt] == array.length) && (byteArrayPoolPtr[anLocalInt] < (byteArrayPool[anLocalInt]).length)) {
                    byteArrayPool[anLocalInt][byteArrayPoolPtr[anLocalInt]++] = array;
                    break;
                }
            }
        }
    }

    static {
    }

    static void initialize(int[] multiPoolSize, int[] poolSizes) {
        if (poolSizes == null || multiPoolSize == null) {
            byteArrayPoolPtr = null;
            byteArrayPoolSizes = null;
            byteArrayPool = null;
        } else {
            byteArrayPoolSizes = poolSizes;
            byteArrayPoolPtr = new int[poolSizes.length];
            byteArrayPool = new byte[poolSizes.length][][];
            for (int ptr = 0; ptr < byteArrayPoolSizes.length; ptr++)
                byteArrayPool[ptr] = new byte[multiPoolSize[ptr]][];
        }
    }
}
