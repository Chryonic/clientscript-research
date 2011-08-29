/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class JagexHash {
    private byte[] aByteArray1671;
    private long[] aLongArray1672 = new long[8];
    static Class207 aClass207_1673 = new Class207(51, 4);
    private long[] aLongArray1674;
    private int anInt1675;
    static Class83 aClass83_1676;
    private int anInt1677;
    private byte[] aByteArray1678 = new byte[32];
    private long[] aLongArray1679;
    private long[] aLongArray1680;
    private long[] aLongArray1681;
    static Class58 aClass58_1682;

    static final byte[] calculateJagexHash(int offset, byte[] buffer, int length) {
        byte[] arrayToUse;
        if (offset > 0) {
            arrayToUse = new byte[length];
            for (int _pos = 0; _pos < length; _pos++)
                arrayToUse[_pos] = buffer[offset + _pos];
        } else
            arrayToUse = buffer;
        JagexHash jagexHash = new JagexHash();
        jagexHash.reset();
        jagexHash.update(arrayToUse, (long) (length * 8));
        byte[] result = new byte[64];
        jagexHash.writeHash(0, result);
        return result;
    }

    final void writeHash(int argument_1_, byte[] argument_2_) {
        aByteArray1671[anInt1675] = (byte) (MathStatics.OR(aByteArray1671[anInt1675], 128 >>> MathStatics.AND(anInt1677, 7)));
        anInt1675++;
        if (anInt1675 > 32) {
            while (anInt1675 < 64)
                aByteArray1671[anInt1675++] = (byte) 0;
            method3081(56);
            anInt1675 = 0;
        }
        while (anInt1675 < 32)
            aByteArray1671[anInt1675++] = (byte) 0;
        JagStrings.memcpy(aByteArray1678, 0, aByteArray1671, 32, 32);
        method3081(56);
        int anLocalInt = 0;
        int anLocalInt_3_ = argument_1_;
        for (/**/; anLocalInt < 8; anLocalInt++) {
            long l = aLongArray1680[anLocalInt];
            argument_2_[anLocalInt_3_] = (byte) (int) (l >>> 56);
            argument_2_[anLocalInt_3_ + 1] = (byte) (int) (l >>> 48);
            argument_2_[anLocalInt_3_ + 2] = (byte) (int) (l >>> 40);
            argument_2_[anLocalInt_3_ + 3] = (byte) (int) (l >>> 32);
            argument_2_[anLocalInt_3_ + 4] = (byte) (int) (l >>> 24);
            argument_2_[anLocalInt_3_ + 5] = (byte) (int) (l >>> 16);
            argument_2_[anLocalInt_3_ + 6] = (byte) (int) (l >>> 8);
            argument_2_[anLocalInt_3_ + 7] = (byte) (int) l;
            anLocalInt_3_ += 8;
        }
    }

    static final int method3080(int argument, int argument_4_) {
        return argument >>> 8;
    }

    private final void method3081(int argument_5_) {
        int anLocalInt = 0;
        if (argument_5_ != 56)
            method3086('(', -58);
        int anLocalInt_6_ = 0;
        while (anLocalInt < 8) {
            aLongArray1674[anLocalInt] = (DoublyLinkedNode_Sub51_Sub8.method1231(Class16.method305((long) aByteArray1671[anLocalInt_6_ + 7], 255L), (DoublyLinkedNode_Sub51_Sub8.method1231((DoublyLinkedNode_Sub51_Sub8.method1231(Class16.method305(255L << 16, (long) (aByteArray1671[anLocalInt_6_ + 5]) << 16), (DoublyLinkedNode_Sub51_Sub8.method1231((DoublyLinkedNode_Sub51_Sub8.method1231((Class16.method305(255L, (long) (aByteArray1671[anLocalInt_6_ + 3])) << 32), (DoublyLinkedNode_Sub51_Sub8.method1231((DoublyLinkedNode_Sub51_Sub8.method1231(Class16.method305(((long) (aByteArray1671[anLocalInt_6_ + 1]) << 48), 255L << 48), (long) aByteArray1671[anLocalInt_6_] << 56)), (Class16.method305(255L, (long) (aByteArray1671[anLocalInt_6_ + 2])) << 40))))), Class16.method305(255L << 24, ((long) (aByteArray1671[anLocalInt_6_ + 4]) << 24)))))), (Class16.method305(255L, (long) (aByteArray1671[anLocalInt_6_ + 6])) << 8)))));
            anLocalInt++;
            anLocalInt_6_ += 8;
        }
        for (int anLocalInt_7_ = 0; anLocalInt_7_ < 8; anLocalInt_7_++)
            aLongArray1672[anLocalInt_7_] = DoublyLinkedNode_Sub51_Sub8.method1231(aLongArray1674[anLocalInt_7_], (aLongArray1679[anLocalInt_7_] = (aLongArray1680[anLocalInt_7_])));
        for (int anLocalInt_8_ = 1; anLocalInt_8_ <= 10; anLocalInt_8_++) {
            for (int anLocalInt_9_ = 0; anLocalInt_9_ < 8; anLocalInt_9_++) {
                aLongArray1681[anLocalInt_9_] = 0L;
                int anLocalInt_10_ = 0;
                int anLocalInt_11_ = 56;
                while (anLocalInt_10_ < 8) {
                    aLongArray1681[anLocalInt_9_] = (DoublyLinkedNode_Sub51_Sub8.method1231(aLongArray1681[anLocalInt_9_], (Statics.aLongArrayArray1723[anLocalInt_10_][(MathStatics.AND(255, (int) ((aLongArray1679[(MathStatics.AND(7, anLocalInt_9_ - anLocalInt_10_))]) >>> anLocalInt_11_)))])));
                    anLocalInt_10_++;
                    anLocalInt_11_ -= 8;
                }
            }
            for (int anLocalInt_12_ = 0; anLocalInt_12_ < 8; anLocalInt_12_++)
                aLongArray1679[anLocalInt_12_] = aLongArray1681[anLocalInt_12_];
            aLongArray1679[0] = DoublyLinkedNode_Sub51_Sub8.method1231(aLongArray1679[0], (Statics.aLongArray1722[anLocalInt_8_]));
            for (int anLocalInt_13_ = 0; anLocalInt_13_ < 8; anLocalInt_13_++) {
                aLongArray1681[anLocalInt_13_] = aLongArray1679[anLocalInt_13_];
                int anLocalInt_14_ = 0;
                int anLocalInt_15_ = 56;
                while (anLocalInt_14_ < 8) {
                    aLongArray1681[anLocalInt_13_] = (DoublyLinkedNode_Sub51_Sub8.method1231(aLongArray1681[anLocalInt_13_], (Statics.aLongArrayArray1723[anLocalInt_14_][(MathStatics.AND(255, (int) ((aLongArray1672[(MathStatics.AND(7, -anLocalInt_14_ + anLocalInt_13_))]) >>> anLocalInt_15_)))])));
                    anLocalInt_14_++;
                    anLocalInt_15_ -= 8;
                }
            }
            for (int anLocalInt_16_ = 0; anLocalInt_16_ < 8; anLocalInt_16_++)
                aLongArray1672[anLocalInt_16_] = aLongArray1681[anLocalInt_16_];
        }
        for (int anLocalInt_17_ = 0; anLocalInt_17_ < 8; anLocalInt_17_++)
            aLongArray1680[anLocalInt_17_] = (DoublyLinkedNode_Sub51_Sub8.method1231(aLongArray1680[anLocalInt_17_], DoublyLinkedNode_Sub51_Sub8.method1231((aLongArray1672[anLocalInt_17_]), (aLongArray1674[anLocalInt_17_]))));
    }

    final void reset() {
        for (int anLocalInt = 0; anLocalInt < 32; anLocalInt++)
            aByteArray1678[anLocalInt] = (byte) 0;
        anInt1677 = anInt1675 = 0;
        aByteArray1671[0] = (byte) 0;
        for (int anLocalInt = 0; anLocalInt < 8; anLocalInt++)
            aLongArray1680[anLocalInt] = 0L;
    }

    final void update(byte[] buffer, long argument_21_) {
        int anLocalInt = 0;
        int anLocalInt_22_ = 8 - ((int) argument_21_ & 0x7) & 0x7;
        int anLocalInt_23_ = anInt1677 & 0x7;
        long l = argument_21_;
        int anLocalInt_24_ = 31;
        int anLocalInt_25_ = 0;
        for (/**/; anLocalInt_24_ >= 0; anLocalInt_24_--) {
            anLocalInt_25_ += (aByteArray1678[anLocalInt_24_] & 0xff) + ((int) l & 0xff);
            aByteArray1678[anLocalInt_24_] = (byte) anLocalInt_25_;
            l >>>= 8;
            anLocalInt_25_ >>>= 8;
        }
        for (/**/; argument_21_ > 8L; argument_21_ -= 8L) {
            int anLocalInt_26_ = (buffer[anLocalInt] << anLocalInt_22_ & 0xff | ((buffer[anLocalInt + 1] & 0xff) >>> -anLocalInt_22_ + 8));
            if (anLocalInt_26_ < 0 || anLocalInt_26_ >= 256)
                throw new RuntimeException("LOGIC ERROR");
            aByteArray1671[anInt1675] = (byte) MathStatics.OR(aByteArray1671[anInt1675], (anLocalInt_26_ >>> anLocalInt_23_));
            anInt1675++;
            anInt1677 += -anLocalInt_23_ + 8;
            if (anInt1677 == 512) {
                method3081(56);
                anInt1677 = anInt1675 = 0;
            }
            aByteArray1671[anInt1675] = (byte) MathStatics.AND(255, (anLocalInt_26_ << -anLocalInt_23_ + 8));
            anInt1677 += anLocalInt_23_;
            anLocalInt++;
        }
        int anLocalInt_27_;
        if (argument_21_ <= 0L)
            anLocalInt_27_ = 0;
        else {
            anLocalInt_27_ = buffer[anLocalInt] << anLocalInt_22_ & 0xff;
            aByteArray1671[anInt1675] = (byte) MathStatics.OR(aByteArray1671[anInt1675], (anLocalInt_27_ >>> anLocalInt_23_));
        }
        if ((long) anLocalInt_23_ + argument_21_ >= 8L) {
            anInt1675++;
            anInt1677 += -anLocalInt_23_ + 8;
            argument_21_ -= (long) (-anLocalInt_23_ + 8);
            if (anInt1677 == 512) {
                method3081(56);
                anInt1677 = anInt1675 = 0;
            }
            aByteArray1671[anInt1675] = (byte) MathStatics.AND((anLocalInt_27_ << -anLocalInt_23_ + 8), 255);
            anInt1677 += (int) argument_21_;
        } else
            anInt1677 += argument_21_;
    }

    public static void method3084(int argument) {
        aClass207_1673 = null;
        aClass83_1676 = null;
        aClass58_1682 = null;
    }

    static final void method3085(int argument, byte argument_28_) {
        if (RsInterface.isAvailable(argument)) {
            RsInterface[] rsInterfaces = RsInterface.anInterfaces[argument];
            if (argument_28_ != -26)
                method3086('\013', -60);
            for (int anLocalInt = 0; rsInterfaces.length > anLocalInt; anLocalInt++) {
                RsInterface rsInterface = rsInterfaces[anLocalInt];
                if (rsInterface != null) {
                    ((RsInterface) rsInterface).anInt1905 = 0;
                    ((RsInterface) rsInterface).anInt1898 = 1;
                    ((RsInterface) rsInterface).anInt1853 = 0;
                }
            }
        }
    }

    static final boolean method3086(char argument, int argument_29_) {
        if ((argument < 'A' || argument > 'Z') && (argument < 'a' || argument > 'z'))
            return false;
        return true;
    }

    public JagexHash() {
        aByteArray1671 = new byte[64];
        anInt1677 = 0;
        anInt1675 = 0;
        aLongArray1680 = new long[8];
        aLongArray1674 = new long[8];
        aLongArray1681 = new long[8];
        aLongArray1679 = new long[8];
    }
}
