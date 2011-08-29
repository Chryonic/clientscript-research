import jaggl.OpenGL;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 7/17/11
 * Time: 4:20 PM
 * To change this template use File | Ssettings | File Templates.
 */
public class JagexMipmapGen {
    static final void genMipmaps(int height, byte[] inBytes, int width, int inFormat, int target, int format) {
        if (width > 0 && !Class2_Sub1.method198(width))
            throw new IllegalArgumentException("");
        if (height > 0 && !Class2_Sub1.method198(height))
            throw new IllegalArgumentException("");
        int anLocalInt = GlToolkit.method883(inFormat);
        int level = 0;
        int anLocalInt_7_ = height > width ? width : height;
        int anLocalInt_8_ = width >> 1;
        int anLocalInt_9_ = height >> 1;
        byte[] mipBytes = inBytes;
        byte[] anLocalInts_10_ = new byte[anLocalInt_9_ * (anLocalInt_8_ * anLocalInt)];
        for (; ; ) {
            OpenGL.glTexImage2Dub(target, level, format, width, height, 0, inFormat, 5121, mipBytes, 0);
            if (anLocalInt_7_ <= 1)
                break;
            int anLocalInt_11_ = anLocalInt * width;
            for (int anLocalInt_12_ = 0; anLocalInt > anLocalInt_12_; anLocalInt_12_++) {
                int anLocalInt_13_ = anLocalInt_12_;
                int anLocalInt_14_ = anLocalInt_12_;
                int anLocalInt_15_ = anLocalInt_11_ + anLocalInt_14_;
                for (int anLocalInt_16_ = 0; anLocalInt_16_ < anLocalInt_9_; anLocalInt_16_++) {
                    for (int anLocalInt_17_ = 0; anLocalInt_17_ < anLocalInt_8_; anLocalInt_17_++) {
                        int anLocalInt_18_ = mipBytes[anLocalInt_14_];
                        anLocalInt_14_ += anLocalInt;
                        anLocalInt_18_ += mipBytes[anLocalInt_14_];
                        anLocalInt_18_ += mipBytes[anLocalInt_15_];
                        anLocalInt_14_ += anLocalInt;
                        anLocalInt_15_ += anLocalInt;
                        anLocalInt_18_ += mipBytes[anLocalInt_15_];
                        anLocalInt_15_ += anLocalInt;
                        anLocalInts_10_[anLocalInt_13_] = (byte) (anLocalInt_18_ >> 2);
                        anLocalInt_13_ += anLocalInt;
                    }
                    anLocalInt_14_ += anLocalInt_11_;
                    anLocalInt_15_ += anLocalInt_11_;
                }
            }
            byte[] anLocalInts_19_ = anLocalInts_10_;
            anLocalInts_10_ = mipBytes;
            height = anLocalInt_9_;
            mipBytes = anLocalInts_19_;
            width = anLocalInt_8_;
            level++;
            anLocalInt_9_ >>= 1;
            anLocalInt_7_ >>= 1;
            anLocalInt_8_ >>= 1;
        }
    }
}
