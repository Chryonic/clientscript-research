/* Class59_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;

class Packet extends Node {
    int pos;
    static int anInt4119 = 1409;
    static int anInt4120;
    static boolean aBoolean4121;
    static RsInterface[][] aRsInterfaceArrayArray4123;
    byte[] data;

    final void pjstr(String argument_1_) {
        int anLocalInt = argument_1_.indexOf('\0');
        if (anLocalInt >= 0)
            throw new IllegalArgumentException("NUL character at " + anLocalInt
                    + " - cannot pjstr");
        this.pos
                += Class126.method2413(argument_1_.length(), argument_1_, 0,
                this.pos, false,
                this.data);
        this.data
                [this.pos++]
                = (byte) 0;
    }

    final String gjstr2() {
        byte anLocalInt = (this.data
                [this.pos++]);
        if (anLocalInt != 0)
            throw new IllegalStateException("Bad version number in gjstr2");
        int anLocalInt_3_ = this.pos;
        while ((this.data
                [this.pos++])
                != 0) {
            /* empty */
        }
        int anLocalInt_4_
                = this.pos - anLocalInt_3_ - 1;
        if (anLocalInt_4_ == 0)
            return "";
        return Class239.method3127(this.data, 1958,
                anLocalInt_3_, anLocalInt_4_);
    }

    final void psize4(int argument_5_) {
        this.data
                [-argument_5_ + this.pos - 4]
                = (byte) (argument_5_ >> 24);
        this.data[(this.pos
                - (argument_5_ + 3))]
                = (byte) (argument_5_ >> 16);
        this.data
                [-argument_5_ - 2 + this.pos]
                = (byte) (argument_5_ >> 8);
        this.data[(this.pos
                - 1 - argument_5_)]
                = (byte) argument_5_;
    }

    final void p1m128(int argument_8_) {
        this.data
                [this.pos++]
                = (byte) (-argument_8_ + 128);
    }

    final void decryptXTEA(int start, int length,
                           int[] keys) {
        int anLocalInt = this.pos;
        this.pos = start;
        int anLocalInt_13_ = (-start + length) / 8;
        for (int anLocalInt_14_ = 0; anLocalInt_13_ > anLocalInt_14_; anLocalInt_14_++) {
            int anLocalInt_15_ = g4();
            int anLocalInt_16_ = g4();
            int anLocalInt_17_ = 0;
            int anLocalInt_18_ = -1640531527;
            int anLocalInt_19_ = 32;
            while (anLocalInt_19_-- > 0) {
                anLocalInt_15_ += (((anLocalInt_16_ >>> 5 ^ anLocalInt_16_ << 4) + anLocalInt_16_) ^ anLocalInt_17_ + keys[anLocalInt_17_ & 0x3]);
                anLocalInt_17_ += anLocalInt_18_;
                anLocalInt_16_ += ((anLocalInt_17_ + keys[anLocalInt_17_ >>> 11 & ~0x661ffffc]) ^ ((anLocalInt_15_ >>> 5 ^ anLocalInt_15_ << 4) + anLocalInt_15_));
            }
            this.pos -= 8;
            p4(anLocalInt_15_);
            p4(anLocalInt_16_);
        }
        this.pos = anLocalInt;
    }

    final void p4(int v) {
        this.data
                [this.pos++]
                = (byte) (v >> 24);
        this.data
                [this.pos++]
                = (byte) (v >> 16);
        this.data
                [this.pos++]
                = (byte) (v >> 8);
        this.data
                [this.pos++]
                = (byte) v;
    }

    final int g2s() {
        this.pos += 2;
        int anLocalInt = (((this.data
                [this.pos - 1])
                & 0xff)
                + (((this.data[this.pos - 2])
                & 0xff)
                << 8));
        if (anLocalInt > 32767)
            anLocalInt -= 65536;
        return anLocalInt;
    }

    final byte g1p128s() {
        return (byte) ((this.data[this.pos++]) - 128);
    }

    final int gsmarts() {
        int anLocalInt = ((this.data[this.pos]) & 0xff);
        if (anLocalInt < 128)
            return g1() - 64;
        return g2() - 49152;
    }

    final int g2i() {
        this.pos += 2;
        return ((((this.data
                [this.pos - 1])
                & 0xff)
                << 8)
                + ((this.data
                [this.pos - 2])
                & 0xff));
    }

    final int g2() {
        this.pos += 2;
        return ((((this.data
                [this.pos - 2])
                & 0xff)
                << 8)
                + ((this.data
                [this.pos - 1])
                & 0xff));
    }

    final int pcrc(int startPos) {
        int anLocalInt = JagexCRCImpl.calculateCRC(this.data, startPos, this.pos);
        p4(anLocalInt);
        return anLocalInt;
    }

    final void p4i(int v) {
        this.data
                [this.pos++]
                = (byte) v;
        this.data
                [this.pos++]
                = (byte) (v >> 8);
        this.data
                [this.pos++]
                = (byte) (v >> 16);
        this.data
                [this.pos++]
                = (byte) (v >> 24);
    }

    final void p2p128(int argument_32_) {
        this.data
                [this.pos++]
                = (byte) (argument_32_ >> 8);
        this.data
                [this.pos++]
                = (byte) (argument_32_ + 128);
    }

    final void p2ip128(int argument_34_) {
        this.data
                [this.pos++]
                = (byte) (argument_34_ + 128);
        this.data
                [this.pos++]
                = (byte) (argument_34_ >> 8);
    }

    final void p1n(int argument_36_) {
        this.data
                [this.pos++]
                = (byte) -argument_36_;
    }

    final byte g1ns() {
        return (byte) -(this.data
                [this.pos++]);
    }

    final long g8() {
        long l = (long) g4() & 0xffffffffL;
        long l_39_ = (long) g4() & 0xffffffffL;
        return (l << 32) + l_39_;
    }

    final void decryptRSA(BigInteger n, BigInteger d) {
        int anLocalInt = this.pos;
        this.pos = 0;
        byte[] data = new byte[anLocalInt];
        gbytes(data, 0, anLocalInt);
        BigInteger c = new BigInteger(data);
        BigInteger m = c.modPow(d, n);
        byte[] decryptedData = m.toByteArray();
        this.pos = 0;
        p2(decryptedData.length);
        pbytes(decryptedData, 0, decryptedData.length);
    }

    final void p2i(int argument_46_) {
        this.data
                [this.pos++]
                = (byte) argument_46_;
        this.data
                [this.pos++]
                = (byte) (argument_46_ >> 8);
    }

    final void p8(long argument_48_) {
        this.data
                [this.pos++]
                = (byte) (int) (argument_48_ >> 56);
        this.data
                [this.pos++]
                = (byte) (int) (argument_48_ >> 48);
        this.data
                [this.pos++]
                = (byte) (int) (argument_48_ >> 40);
        this.data
                [this.pos++]
                = (byte) (int) (argument_48_ >> 32);
        this.data
                [this.pos++]
                = (byte) (int) (argument_48_ >> 24);
        this.data
                [this.pos++]
                = (byte) (int) (argument_48_ >> 16);
        this.data
                [this.pos++]
                = (byte) (int) (argument_48_ >> 8);
        this.data
                [this.pos++]
                = (byte) (int) argument_48_;
    }

    final int gsmart(int argument_49_) {
        int anLocalInt = ((this.data[this.pos]) & 0xff);
        if (anLocalInt < 128)
            return g1();
        return g2() - 32768;
    }

    final int g4m2143() {     //2143
        this.pos += 4;
        return ((((this.data
                [this.pos - 1])
                & 0xff)
                << 8)
                + (((this.data
                [this.pos - 3]) << 24
                & ~0xffffff)
                + (((this.data [this.pos - 4]) << 16 & 0xff0000) + ((this.data[this.pos - 2])& 0xff))));
    }

    final long gd(int length) {
        if (--length < 0 || length > 7)
            throw new IllegalArgumentException();
        int bitpos = length * 8;
        long l = 0L;
        for (/**/; bitpos >= 0; bitpos -= 8)
            l |= ((long) (this.data
                    [this.pos++])
                    & 0xffL) << bitpos;
        return l;
    }

    final int g3_dupl() {
        this.pos += 3;
        return (((this.data
                [this.pos - 1])
                & 0xff)
                + ((((this.data
                [this.pos - 3])
                & 0xff)
                << 16)
                + (((this.data
                [this.pos - 2])
                & 0xff)
                << 8)));
    }

    final void p1p128(int argument_55_) {
        this.data
                [this.pos++]
                = (byte) (128 + argument_55_);
    }

    final int g1p128() {
        return ((this.data
                [this.pos++]) - 128
                & 0xff);
    }

    final int g4m() {     //2143
        this.pos += 4;
        return (((this.data
                [this.pos - 3])
                & 0xff)
                + ((((this.data
                [this.pos - 2])
                & 0xff)
                << 24)
                + ((this.data
                [this.pos - 1]) << 16
                & 0xff0000))
                + ((this.data
                [this.pos - 4]) << 8
                & 0xff00));
    }

    final int g3s() {
        this.pos += 3;
        int g3  = (((this.data
                [this.pos - 1])
                & 0xff)
                + (((this.data
                [this.pos - 3])
                & 0xff)
                << 16)
                + ((this.data
                [this.pos - 2]) << 8
                & 0xff00));
        if (g3  > 8388607)
            g3 -= 16777216;
        return g3 ;
    }

    final void decodeXTEA(int argument_59_, int argument_60_, int[] argument_62_) {
        int anLocalInt = this.pos;
        this.pos = argument_59_;
        int anLocalInt_63_ = (-argument_59_ + argument_60_) / 8;
        for (int anLocalInt_64_ = 0; anLocalInt_64_ < anLocalInt_63_;
             anLocalInt_64_++) {
            int anLocalInt_65_ = g4();
            int anLocalInt_66_ = g4();
            int anLocalInt_67_ = -957401312;
            int anLocalInt_68_ = -1640531527;
            int anLocalInt_69_ = 32;
            while (anLocalInt_69_-- > 0) {
                anLocalInt_66_
                        -= (((anLocalInt_65_ << 4 ^ anLocalInt_65_ >>> 5)
                        + anLocalInt_65_)
                        ^ (anLocalInt_67_
                        + argument_62_[(anLocalInt_67_ & 0x1b91) >>> 11]));
                anLocalInt_67_ -= anLocalInt_68_;
                anLocalInt_65_
                        -= (((anLocalInt_66_ >>> 5 ^ anLocalInt_66_ << 4)
                        + anLocalInt_66_)
                        ^ argument_62_[anLocalInt_67_ & 0x3] + anLocalInt_67_);
            }
            this.pos -= 8;
            p4(anLocalInt_65_);
            p4(anLocalInt_66_);
        }
        this.pos = anLocalInt;
    }

    final String gstr() {
        int startPos = this.pos;
        while ((this.data
                [this.pos++])
                != 0) {
            /* empty */
        }
        int length = this.pos - 1 - startPos;
        if (length == 0)
            return "";
        return Class239.method3127(this.data, 1958,
                startPos, length);
    }

    final void p1(int argument_73_) {
        this.data
                [this.pos++]
                = (byte) argument_73_;
    }

    final int g1n() {
        return (-(this.data
                [this.pos++])
                & 0xff);
    }

    final void p2i_dupl(int argument_76_) {
        this.data
                [this.pos++]
                = (byte) argument_76_;
        this.data
                [this.pos++]
                = (byte) (argument_76_ >> 8);
    }

    final String fastgstr(byte argument_77_) {
        if ((this.data
                [this.pos])
                == 0) {
            this.pos++;
            return null;
        }
        return gstr();
    }

    final int g4() {
        this.pos += 4;
        return (((this.data
                [this.pos - 3]) << 16
                & 0xff0000)
                + (((this.data
                [this.pos - 4]) << 24
                & ~0xffffff)
                + (((this.data
                [this.pos - 2])
                & 0xff)
                << 8)
                + ((this.data
                [this.pos - 1])
                & 0xff)));
    }

    final int gmultismart(int argument_79_) {
        int anLocalInt = 0;
        if (argument_79_ != -18919)
            anInt4119 = 57;
        int smart = gsmart(-2);
        while (smart == 32767) {
            smart = gsmart(argument_79_ + 18917);
            anLocalInt += 32767;
        }
        anLocalInt += smart;
        return anLocalInt;
    }

    final void method808(int[] argument_81_, byte argument_82_) {
        int anLocalInt = this.pos / 8;
        this.pos = 0;
        for (int anLocalInt_83_ = 0; anLocalInt > anLocalInt_83_;
             anLocalInt_83_++) {
            int anLocalInt_84_ = g4();
            int anLocalInt_85_ = g4();
            int anLocalInt_86_ = -957401312;
            int anLocalInt_87_ = -1640531527;
            int anLocalInt_88_ = 32;
            while (anLocalInt_88_-- > 0) {
                anLocalInt_85_
                        -= (((anLocalInt_84_ << 4 ^ anLocalInt_84_ >>> 5)
                        + anLocalInt_84_)
                        ^ (anLocalInt_86_
                        + argument_81_[(anLocalInt_86_ & 0x1e3b) >>> 11]));
                anLocalInt_86_ -= anLocalInt_87_;
                anLocalInt_84_
                        -= (anLocalInt_86_ + argument_81_[anLocalInt_86_ & 0x3]
                        ^ anLocalInt_85_ + (anLocalInt_85_ << 4
                        ^ anLocalInt_85_ >>> 5));
            }
            this.pos -= 8;
            p4(anLocalInt_84_);
            p4(anLocalInt_85_);
        }
    }

    final byte g1s() {
        return (this.data
                [this.pos++]);
    }

    final long g5(byte argument_90_) {
        long l = (long) g1() & 0xffffffffL;
        long l_91_ = (long) g4() & 0xffffffffL;
        return l_91_ + (l << 32);
    }

    final void gbytes(byte[] buffer, int offset, int length) {
        for (int anLocalInt = offset; anLocalInt < length + offset; anLocalInt++)
            buffer[anLocalInt] = (this.data[this.pos++]);
    }

    public static void cleanStatics() {
        aRsInterfaceArrayArray4123 = null;
        GlExtFramebuffer.attachmentIds = null;
    }

    final void pd(int length, long value) {
        if (--length < 0 || length > 7)
            throw new IllegalArgumentException();
        for (int shift = length * 8; shift >= 0;shift -= 8)
            this.data[this.pos++] = (byte) (int) (value >> shift);
    }

    final int gMultiSomething() {
        int byteIn = (this.data[this.pos++]);
        int value = 0;
        for (/**/; byteIn < 0; byteIn = (this.data[this.pos++]))
            value = (value | byteIn & 0x7f) << 7;
        return value | byteIn;
    }

    final void psmart(int argument_101_) {
            if (argument_101_ >= 0 && argument_101_ < 128)
                p1(argument_101_);
            else if (argument_101_ >= 0 && argument_101_ < 32768)
                p2(32768 + argument_101_);
            else
                throw new IllegalArgumentException();
    }

    final void psize1(int argument_104_) {
        this.data[(this.pos - argument_104_ - 1)]  = (byte) argument_104_;
    }

    final void psize2(int argument_105_) {
        this.data[(this.pos - 2 - argument_105_)]  = (byte) (argument_105_ >> 8);
        this.data[(this.pos  - argument_105_ - 1)] = (byte) argument_105_;
    }

    final void p4m2143(int argument_108_) {
        this.data
                [this.pos++]
                = (byte) (argument_108_ >> 8);
        this.data
                [this.pos++]
                = (byte) argument_108_;
        this.data
                [this.pos++]
                = (byte) (argument_108_ >> 24);
        this.data
                [this.pos++]
                = (byte) (argument_108_ >> 16);
    }

    final int g2sp128() {
        this.pos += 2;
        int anLocalInt = ((((this.data
                [this.pos - 2])
                & 0xff)
                << 8)
                + ((this.data
                [this.pos - 1]) - 128
                & 0xff));
        if (anLocalInt > 32767)
            anLocalInt -= 65536;
        return anLocalInt;
    }

    final int g1() {
        return ((this.data
                [this.pos++])
                & 0xff);
    }

    final int g4i() {
        this.pos += 4;
        return (((this.data
                [this.pos - 4])
                & 0xff)
                + (((this.data
                [this.pos - 2]) << 16
                & 0xff0000)
                + (((this.data
                [this.pos - 1])
                & 0xff)
                << 24)
                + (((this.data
                [this.pos - 3])
                & 0xff)
                << 8)));
    }

    final void p4m3412(int argument_112_) {
        this.data
                [this.pos++]
                = (byte) (argument_112_ >> 16);
        this.data
                [this.pos++]
                = (byte) (argument_112_ >> 24);
        this.data
                [this.pos++]
                = (byte) argument_112_;
        this.data
                [this.pos++]
                = (byte) (argument_112_ >> 8);
    }

    final void pjstr2(String v) {
        int nulIndex = v.indexOf('\0');
        if (nulIndex >= 0)
            throw new IllegalArgumentException("NUL character at " + nulIndex
                    + " - cannot pjstr2");
        this.data
                [this.pos++]
                = (byte) 0;
        this.pos
                += Class126.method2413(v.length(), v, 0, this.pos, false, this.data);
        this.data
                [this.pos++]
                = (byte) 0;
    }

    final int g4i_dupl() {
        this.pos += 4;
        return (((this.data
                [this.pos - 4])
                & 0xff)
                + (((this.data
                [this.pos - 3])
                & 0xff)
                << 8)
                + ((((this.data
                [this.pos - 2])
                & 0xff)
                << 16)
                + (((this.data
                [this.pos - 1])
                & 0xff)
                << 24)));
    }

    final void pbytes(byte[] buffer, int offset, int length) {
        for (int anLocalInt = offset;
             offset + length > anLocalInt; anLocalInt++)
            this.data
                    [this.pos++]
                    = buffer[anLocalInt];
    }

    final long g8i() {
        long l = (long) g4i() & 0xffffffffL;
        long l_122_ = (long) g4i() & 0xffffffffL;
        return l + (l_122_ << 32);
    }

    final int g2m128() {
        this.pos += 2;
        return ((((this.data
                [this.pos - 2])
                & 0xff)
                << 8)
                + ((this.data
                [this.pos - 1]) - 128
                & 0xff));
    }

    final void p4i_dupl(int v) {
        this.data
                [this.pos++]
                = (byte) v;
        this.data
                [this.pos++]
                = (byte) (v >> 8);
        this.data
                [this.pos++]
                = (byte) (v >> 16);
        this.data
                [this.pos++]
                = (byte) (v >> 24);
    }

    final boolean checkcrc() {
        this.pos -= 4;
        int anLocalInt
                = JagexCRCImpl.calculateCRC(this.data, 0, this.pos
        );
        int anLocalInt_127_ = g4();
        if (anLocalInt_127_ == anLocalInt)
            return true;
        return false;
    }

    final void p3(int argument_129_) {
        this.data
                [this.pos++]
                = (byte) (argument_129_ >> 16);
        this.data
                [this.pos++]
                = (byte) (argument_129_ >> 8);
        this.data
                [this.pos++]
                = (byte) argument_129_;
    }

    final byte p1m128() {
        return (byte) (-(this.data
                [this.pos++])
                + 128);
    }

    final int g2ip128() {
        this.pos += 2;
        return (((this.data
                [this.pos - 1]) << 8
                & 0xff00)
                + ((this.data
                [this.pos - 2]) - 128
                & 0xff));
    }

    final void pMultiSomething(int argument_132_, int argument_133_) {
        if ((argument_132_ & ~0x7f) != 0) {
            if ((argument_132_ & ~0x3fff) != 0) {
                if ((argument_132_ & ~0x1fffff) != 0) {
                    if ((argument_132_ & ~0xfffffff) != 0)
                        p1(argument_132_ >>> 28 | 0x80);
                    p1(argument_132_ >>> 21 | 0x80);
                }
                p1((argument_132_ | 0x2038bc) >>> 14);
            }
            p1(argument_132_ >>> 7 | 0x80);
        }
        p1(argument_133_ & argument_132_);
    }

    final int g1_128p() {
        return (-(this.data
                [this.pos++]) + 128
                & 0xff);
    }

    final int g3() {
        this.pos += 3;
        return (((this.data
                [this.pos - 2])
                & 0xff)
                + ((this.data
                [this.pos - 1]) << 8
                & 0xff00)
                + (((this.data
                [this.pos - 3])
                & 0xff)
                << 16));
    }

    final void free() {
        if (this.data != null)
            ByteArrayManager.freeByteArray(this.data);
        this.data = null;
    }

    Packet(int size) {
        this.pos = 0;
        this.data = ByteArrayManager.createByteArray(size);
    }

    Packet(byte[] argument_138_) {
        this.data = argument_138_;
        this.pos = 0;
    }

    final void p2(int v) {
        this.data[this.pos++] = (byte)(v >> 8);
        this.data[this.pos++] = (byte) v;
    }

    static {
        aBoolean4121 = false;
    }
}
