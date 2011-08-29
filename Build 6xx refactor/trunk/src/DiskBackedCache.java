/* Class330 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DiskBackedCache {
    static int anInt2701 = 0;
    static byte[] ioBuffer;
    private BufferedFile indexFile = null;
    private int anInt2704;
    private BufferedFile dataFile = null;
    static int[] anIntArray2706 = new int[2];
    private int cacheId;
    static Class26 aClass26_2709;

    final byte[] get(int fileId) {
        synchronized (dataFile) {
            try {
                if ((long) (fileId * 6 + 6) > indexFile.length())
                    return null;
                indexFile.seek((long) (fileId * 6));
                indexFile.read(ioBuffer, 0, 6);
                int anLocalInt = ((ioBuffer[2] & 0xff) + ((ioBuffer[1] << 8 & 0xff00) + ((ioBuffer[0] & 0xff) << 16)));
                int anLocalInt_2_ = ((ioBuffer[5] & 0xff) + ((ioBuffer[3] & 0xff) << 16) + (ioBuffer[4] << 8 & 0xff00));
                if (anLocalInt < 0 || anLocalInt > anInt2704)
                    return null;
                if (anLocalInt_2_ <= 0 || (dataFile.length() / 520L < (long) anLocalInt_2_))
                    return null;
                byte[] anLocalInts = new byte[anLocalInt];
                int anLocalInt_3_ = 0;
                int anLocalInt_4_ = 0;
                while (anLocalInt > anLocalInt_3_) {
                    if (anLocalInt_2_ == 0)
                        return null;
                    dataFile.seek((long) (anLocalInt_2_ * 520));
                    int anLocalInt_5_ = anLocalInt - anLocalInt_3_;
                    if (anLocalInt_5_ > 512)
                        anLocalInt_5_ = 512;
                    dataFile.read(ioBuffer, 0, anLocalInt_5_ + 8);
                    int anLocalInt_6_ = ((ioBuffer[1] & 0xff) + (ioBuffer[0] << 8 & 0xff00));
                    int anLocalInt_7_ = ((ioBuffer[2] << 8 & 0xff00) + (ioBuffer[3] & 0xff));
                    int anLocalInt_8_ = ((ioBuffer[6] & 0xff) + ((ioBuffer[4] & 0xff) << 16) + ((ioBuffer[5] & 0xff) << 8));
                    int anLocalInt_9_ = ioBuffer[7] & 0xff;
                    if (anLocalInt_6_ != fileId || anLocalInt_7_ != anLocalInt_4_ || anLocalInt_9_ != cacheId)
                        return null;
                    if (anLocalInt_8_ < 0 || ((long) anLocalInt_8_ > dataFile.length() / 520L))
                        return null;
                    for (int anLocalInt_10_ = 0; anLocalInt_5_ > anLocalInt_10_; anLocalInt_10_++)
                        anLocalInts[anLocalInt_3_++] = ioBuffer[anLocalInt_10_ + 8];
                    anLocalInt_2_ = anLocalInt_8_;
                    anLocalInt_4_++;
                }
                return anLocalInts;
            } catch (java.io.IOException ioexception) {
                return null;
            }
        }
    }

    final boolean put(int id, byte[] data, int length) {
        synchronized (dataFile) {
            if (length < 0 || anInt2704 < length)
                throw new IllegalArgumentException();
            boolean anLocalBoolean = put_((byte) 123, length, true, data, id);
            if (!anLocalBoolean)
                anLocalBoolean = put_((byte) 123, length, false, data, id);
            return anLocalBoolean;
        }
    }

    public final String toString() {
        return "Cache:" + cacheId;
    }

    private final boolean put_(byte argument_15_, int length, boolean argument_17_, byte[] data, int definedBlockSize) {
        synchronized (dataFile) {
            try {
                int blockId;
                if (!argument_17_) {
                    blockId = (int) ((dataFile.length() + 519L) / 520L);
                    if (blockId == 0)
                        blockId = 1;
                } else {
                    if ((long) (definedBlockSize * 6 + 6) > indexFile.length())
                        return false;
                    indexFile.seek((long) (definedBlockSize * 6));
                    indexFile.read(ioBuffer, 0, 6);
                    blockId = ((ioBuffer[5] & 0xff) + ((ioBuffer[4] & 0xff) << 8) + ((ioBuffer[3] & 0xff) << 16));
                    if (blockId <= 0 || ((long) blockId > dataFile.length() / 520L))
                        return false;
                }
                ioBuffer[2] = (byte) length;
                ioBuffer[5] = (byte) blockId;
                if (argument_15_ <= 121)
                    return false;
                ioBuffer[0] = (byte) (length >> 16);
                ioBuffer[4] = (byte) (blockId >> 8);
                ioBuffer[3] = (byte) (blockId >> 16);
                ioBuffer[1] = (byte) (length >> 8);
                indexFile.seek((long) (definedBlockSize * 6));
                indexFile.write(ioBuffer, 0, 6);
                int currentPos = 0;
                int anLocalInt_21_ = 0;
                int blockSize;
                for (/**/; currentPos < length; currentPos += blockSize) {
                    int anLocalInt_23_ = 0;
                    if (argument_17_) {
                        dataFile.seek((long) (blockId * 520));
                        try {
                            dataFile.read((ioBuffer), 0, 8);
                        } catch (java.io.EOFException eofexception) {
                            break;
                        }
                        blockSize = (((ioBuffer[0] & 0xff) << 8) + (ioBuffer[1] & 0xff));
                        int anLocalInt_24_ = ((ioBuffer[2] << 8 & 0xff00) + (ioBuffer[3] & 0xff));
                        anLocalInt_23_ = (((ioBuffer[5] & 0xff) << 8) + (((ioBuffer[4] & 0xff) << 16) + (ioBuffer[6] & 0xff)));
                        int anLocalInt_25_ = ioBuffer[7] & 0xff;
                        if (blockSize != definedBlockSize || anLocalInt_24_ != anLocalInt_21_ || anLocalInt_25_ != cacheId)
                            return false;
                        if (anLocalInt_23_ < 0 || (dataFile.length() / 520L < (long) anLocalInt_23_))
                            return false;
                    }
                    if (anLocalInt_23_ == 0) {
                        argument_17_ = false;
                        anLocalInt_23_ = (int) ((dataFile.length() + 519L) / 520L);
                        if (anLocalInt_23_ == 0)
                            anLocalInt_23_++;
                        if (blockId == anLocalInt_23_)
                            anLocalInt_23_++;
                    }
                    ioBuffer[3] = (byte) anLocalInt_21_;
                    if (length - currentPos <= 512)
                        anLocalInt_23_ = 0;
                    ioBuffer[1] = (byte) definedBlockSize;
                    ioBuffer[0] = (byte) (definedBlockSize >> 8);
                    ioBuffer[2] = (byte) (anLocalInt_21_ >> 8);
                    ioBuffer[5] = (byte) (anLocalInt_23_ >> 8);
                    ioBuffer[4] = (byte) (anLocalInt_23_ >> 16);
                    ioBuffer[6] = (byte) anLocalInt_23_;
                    ioBuffer[7] = (byte) cacheId;
                    dataFile.seek((long) (blockId * 520));
                    dataFile.write(ioBuffer, 0, 8);
                    blockSize = length - currentPos;
                    if (blockSize > 512)
                        blockSize = 512;
                    dataFile.write(data, currentPos, blockSize);
                    anLocalInt_21_++;
                    blockId = anLocalInt_23_;
                }
                return true;
            } catch (java.io.IOException ioexception) {
                return false;
            }
        }
    }

    static final int andFF(int argument) {
        return argument & 0xff;
    }

    public static void method3707(byte argument) {
        anIntArray2706 = null;
        CombineModeEnum.MODULATE = null;
        aClass26_2709 = null;
    }

    DiskBackedCache(int cacheId, BufferedFile data, BufferedFile index, int argument_30_) {
        anInt2704 = 65000;
        this.cacheId = cacheId;
        dataFile = data;
        indexFile = index;
        anInt2704 = argument_30_;
    }
}
