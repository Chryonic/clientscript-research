/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream {
    private byte[] data;
    private int currentSize;
    private int pos;
    private int maxSize;
    private Buffer anBuffer_3305;

    public final void write4Bytes(int argument_0_, int argument_1_, int argument_2_, int argument_3_) {
        if (pos + 3 >= data.length)
            upload();
        data[pos++] = (byte) argument_0_;
        data[pos++] = (byte) argument_1_;
        data[pos++] = (byte) argument_2_;
        data[pos++] = (byte) argument_3_;
    }

    public final void writeByte(int argument_4_) {
        if (data.length <= pos)
            upload();
        data[pos++] = (byte) argument_4_;
    }

    public final void writeShortBE(int argument_5_) {
        if (data.length <= pos + 1)
            upload();
        data[pos++] = (byte) (argument_5_ >> 8);
        data[pos++] = (byte) argument_5_;
    }

    public final void method4159(Buffer argument_6_) {
        method4167(argument_6_, 0, argument_6_.getSize());
    }

    public final void writeRGBA(int byte3, int byte2, int byte1, int byte4) {
        if (pos + 3 >= data.length)
            upload();
        data[pos++] = (byte) byte1;
        data[pos++] = (byte) byte2;
        data[pos++] = (byte) byte3;
        data[pos++] = (byte) byte4;
    }

    public final void writeShortLE(int argument_11_) {
        if (data.length <= pos + 1)
            upload();
        data[pos++] = (byte) argument_11_;
        data[pos++] = (byte) (argument_11_ >> 8);
    }

    public final void upload() {
        if (pos > 0) {
            if (currentSize + pos > maxSize)
                throw new RuntimeException();
            anBuffer_3305.put(data, 0, currentSize, pos);
            currentSize += pos;
            pos = 0;
        }
    }

    public static final native int floatToRawIntBits(float argument);

    public Stream(Buffer argument_12_, int argument_13_, int argument_14_) {
        this(argument_12_.getSize() >= 4096 ? 4096 : argument_12_.getSize());
        method4167(argument_12_, argument_13_, argument_14_);
    }

    public final void writeRGBA(int colour) {
        if (pos + 3 >= data.length)
            upload();
        data[pos++] = (byte) (colour >> 16);
        data[pos++] = (byte) (colour >> 8);
        data[pos++] = (byte) colour;
        data[pos++] = (byte) (colour >> 24);
    }

    public final int method4164() {
        return currentSize + pos;
    }

    public final void method4165(int argument_16_) {
        upload();
        currentSize = argument_16_;
    }

    public static boolean isBigEndian() {
        return getLSB(-65536) == -1;
    }

    private final void method4167(Buffer argument_17_, int argument_18_, int argument_19_) {
        upload();
        currentSize = argument_18_;
        anBuffer_3305 = argument_17_;
        maxSize = argument_19_ + argument_18_;
        if (maxSize > argument_17_.getSize())
            throw new RuntimeException();
    }

    public final void writeIntLE(int argument_20_) {
        if (data.length <= pos + 3)
            upload();
        data[pos++] = (byte) argument_20_;
        data[pos++] = (byte) (argument_20_ >> 8);
        data[pos++] = (byte) (argument_20_ >> 16);
        data[pos++] = (byte) (argument_20_ >> 24);
    }

    private static final native byte getLSB(int argument);

    private Stream(int argument_21_) {
        data = new byte[argument_21_];
    }

    public final void writeFloatLE(float argument_22_) {
        if (data.length <= pos + 3)
            upload();
        int anLocalInt = floatToRawIntBits(argument_22_);
        data[pos++] = (byte) anLocalInt;
        data[pos++] = (byte) (anLocalInt >> 8);
        data[pos++] = (byte) (anLocalInt >> 16);
        data[pos++] = (byte) (anLocalInt >> 24);
    }

    public Stream(Buffer argument_23_) {
        this(argument_23_, 0, argument_23_.getSize());
    }

    public Stream() {
        this(4096);
    }

    public final void writeFloatBE(float argument_24_) {
        if (data.length <= pos + 3)
            upload();
        int anLocalInt = floatToRawIntBits(argument_24_);
        data[pos++] = (byte) (anLocalInt >> 24);
        data[pos++] = (byte) (anLocalInt >> 16);
        data[pos++] = (byte) (anLocalInt >> 8);
        data[pos++] = (byte) anLocalInt;
    }
}
