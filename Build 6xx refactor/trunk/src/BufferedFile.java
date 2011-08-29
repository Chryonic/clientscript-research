/* Class337 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class BufferedFile {
    private byte[] writeBuffer;
    private long aLong2751;
    private int writeBufferOffset = 0;
    static Class76 aClass76_2753;
    private FileOnDisk myFileOnDisk;
    private byte[] readBuffer;
    private long position;
    private int readBufferOffset;
    private long aLong2758;
    private long aLong2759;
    private long fileLength;
    private long aLong2761;
    /*synthetic*/ static Class aClass2762;

    private final void handleRead() throws IOException {
        readBufferOffset = 0;
        if (position != aLong2759) {
            myFileOnDisk.seek(position);
            aLong2759 = position;
        }
        aLong2758 = position;
        while (readBuffer.length > readBufferOffset) {
            int anLocalInt = readBuffer.length - readBufferOffset;
            if (anLocalInt > 200000000)
                anLocalInt = 200000000;
            int anLocalInt_1_ = myFileOnDisk.read(readBuffer, readBufferOffset, anLocalInt);
            if (anLocalInt_1_ == -1)
                break;
            readBufferOffset += anLocalInt_1_;
            aLong2759 += (long) anLocalInt_1_;
        }
    }

    final void close() throws IOException {
        handleWrite();
        myFileOnDisk.close();
    }

    final void read(byte[] buffer) throws IOException {
        read(buffer, 0, buffer.length);
    }

    final void read(byte[] buffer, int offset, int length) throws IOException {
        try {
            if (buffer.length < length + offset)
                throw new ArrayIndexOutOfBoundsException(-buffer.length + (length + offset));
            if (aLong2751 != -1L && position >= aLong2751 && ((long) length + position <= aLong2751 - -(long) writeBufferOffset)) {
                JagStrings.memcpy(writeBuffer, (int) (position - aLong2751), buffer, offset, length);
                position += (long) length;
                return;
            }
            long l = position;
            int anLocalInt = offset;
            int anLocalInt_9_ = length;
            if (aLong2758 <= position && (long) readBufferOffset + aLong2758 > position) {
                int anLocalInt_10_ = (int) ((long) readBufferOffset - -aLong2758 - position);
                if (length < anLocalInt_10_)
                    anLocalInt_10_ = length;
                JagStrings.memcpy(readBuffer, (int) (position + -aLong2758), buffer, offset, anLocalInt_10_);
                position += (long) anLocalInt_10_;
                offset += anLocalInt_10_;
                length -= anLocalInt_10_;
            }
            if (length <= readBuffer.length) {
                if (length > 0) {
                    handleRead();
                    int anLocalInt_11_ = length;
                    if (anLocalInt_11_ > readBufferOffset)
                        anLocalInt_11_ = readBufferOffset;
                    JagStrings.memcpy(readBuffer, 0, buffer, offset, anLocalInt_11_);
                    length -= anLocalInt_11_;
                    position += (long) anLocalInt_11_;
                    offset += anLocalInt_11_;
                }
            } else {
                myFileOnDisk.seek(position);
                aLong2759 = position;
                int anLocalInt_12_;
                for (/**/; length > 0; length -= anLocalInt_12_) {
                    anLocalInt_12_ = myFileOnDisk.read(buffer, offset, length);
                    if (anLocalInt_12_ == -1)
                        break;
                    position += (long) anLocalInt_12_;
                    aLong2759 += (long) anLocalInt_12_;
                    offset += anLocalInt_12_;
                }
            }
            if (aLong2751 != -1L) {
                if (aLong2751 > position && length > 0) {
                    int anLocalInt_13_ = offset + (int) (-position + aLong2751);
                    if (offset + length < anLocalInt_13_)
                        anLocalInt_13_ = offset + length;
                    while (anLocalInt_13_ > offset) {
                        buffer[offset++] = (byte) 0;
                        length--;
                        position++;
                    }
                }
                long l_14_ = -1L;
                if (aLong2751 >= l && l + (long) anLocalInt_9_ > aLong2751)
                    l_14_ = aLong2751;
                else if (l >= aLong2751 && aLong2751 + (long) writeBufferOffset > l)
                    l_14_ = l;
                long l_15_ = -1L;
                if ((long) writeBufferOffset + aLong2751 <= l || (l - -(long) anLocalInt_9_ < (long) writeBufferOffset + aLong2751)) {
                    if (aLong2751 < l + (long) anLocalInt_9_ && (l - -(long) anLocalInt_9_ <= (long) writeBufferOffset + aLong2751))
                        l_15_ = l + (long) anLocalInt_9_;
                } else
                    l_15_ = aLong2751 - -(long) writeBufferOffset;
                if (l_14_ > -1L && l_15_ > l_14_) {
                    int anLocalInt_16_ = (int) (l_15_ + -l_14_);
                    JagStrings.memcpy(writeBuffer, (int) (-aLong2751 + l_14_), buffer, anLocalInt + (int) (l_14_ - l), anLocalInt_16_);
                    if (position < l_15_) {
                        length -= -position + l_15_;
                        position = l_15_;
                    }
                }
            }
        } catch (IOException ioexception) {
            aLong2759 = -1L;
            throw ioexception;
        }
        if (length > 0)
            throw new EOFException();
    }

    final void seek(long pos) throws IOException {
        if (pos < 0L)
            throw new IOException("Invalid seek to " + pos + " in file " + getFile());
        position = pos;
    }

    private final void handleWrite() throws IOException {
        if (aLong2751 != -1L) {
            if (aLong2759 != aLong2751) {
                myFileOnDisk.seek(aLong2751);
                aLong2759 = aLong2751;
            }
            myFileOnDisk.write(writeBuffer, 0, writeBufferOffset);
            aLong2759 += (long) writeBufferOffset;
            if (aLong2761 < aLong2759)
                aLong2761 = aLong2759;
            long l = -1L;
            long l_20_ = -1L;
            if (aLong2758 <= aLong2751 && aLong2758 + (long) readBufferOffset > aLong2751)
                l = aLong2751;
            else if (aLong2758 >= aLong2751 && (long) writeBufferOffset + aLong2751 > aLong2758)
                l = aLong2758;
            if (aLong2758 >= aLong2751 - -(long) writeBufferOffset || ((long) writeBufferOffset + aLong2751 > aLong2758 + (long) readBufferOffset)) {
                if (aLong2758 + (long) readBufferOffset > aLong2751 && ((long) readBufferOffset + aLong2758 <= aLong2751 + (long) writeBufferOffset))
                    l_20_ = (long) readBufferOffset + aLong2758;
            } else
                l_20_ = (long) writeBufferOffset + aLong2751;
            if (l > -1L && l_20_ > l) {
                int anLocalInt_21_ = (int) (-l + l_20_);
                JagStrings.memcpy(writeBuffer, (int) (-aLong2751 + l), readBuffer, (int) (-aLong2758 + l), anLocalInt_21_);
            }
            writeBufferOffset = 0;
            aLong2751 = -1L;
        }
    }

    static final int method3765(int argument, int argument_22_, boolean argument_23_) {
        if (argument_23_)
            return 0;
        Node_Sub5 class59_sub5 = Class365.method3969((byte) -122, argument_22_, argument_23_);
        if (class59_sub5 == null)
            return (((DoublyLinkedNode_Sub51_Sub5) DoublyLinkedNode_Sub51_Sub2.aClass140_6228.method2472((byte) 102, argument_22_)).anInt6241);
        int anLocalInt = 0;
        for (int anLocalInt_24_ = 0; (anLocalInt_24_ < ((Node_Sub5) class59_sub5).anIntArray3897.length); anLocalInt_24_++) {
            if (((Node_Sub5) class59_sub5).anIntArray3897[anLocalInt_24_] == -1)
                anLocalInt++;
        }
        anLocalInt += (((DoublyLinkedNode_Sub51_Sub5) DoublyLinkedNode_Sub51_Sub2.aClass140_6228.method2472((byte) 125, argument_22_)).anInt6241 - ((Node_Sub5) class59_sub5).anIntArray3897.length);
        int anLocalInt_25_ = -62 % ((argument - 13) / 63);
        return anLocalInt;
    }

    final long length() {
        return fileLength;
    }

    final void write(byte[] buffer, int offset, int length) throws IOException {
        try {
            if (fileLength < position + (long) length)
                fileLength = position + (long) length;
            if (aLong2751 != -1L && (position < aLong2751 || position > aLong2751 + (long) writeBufferOffset))
                handleWrite();
            if (aLong2751 != -1L && ((long) length + position > (long) writeBuffer.length + aLong2751)) {
                int writeLength = (int) (aLong2751 - (position - (long) writeBuffer.length));
                JagStrings.memcpy(buffer, offset, writeBuffer, (int) (position - aLong2751), writeLength);
                length -= writeLength;
                position += (long) writeLength;
                offset += writeLength;
                writeBufferOffset = writeBuffer.length;
                handleWrite();
            }
            if (writeBuffer.length < length) {
                if (position != aLong2759) {
                    myFileOnDisk.seek(position);
                    aLong2759 = position;
                }
                myFileOnDisk.write(buffer, offset, length);
                aLong2759 += (long) length;
                if (aLong2759 > aLong2761)
                    aLong2761 = aLong2759;
                long l = -1L;
                long l_31_ = -1L;
                if (aLong2758 <= position && (long) readBufferOffset + aLong2758 > position)
                    l = position;
                else if (aLong2758 >= position && position + (long) length > aLong2758)
                    l = aLong2758;
                if ((long) length + position > aLong2758 && ((long) readBufferOffset + aLong2758 >= position + (long) length))
                    l_31_ = position + (long) length;
                else if ((long) readBufferOffset + aLong2758 > position && (aLong2758 - -(long) readBufferOffset <= (long) length + position))
                    l_31_ = aLong2758 + (long) readBufferOffset;
                if (l > -1L && l_31_ > l) {
                    int anLocalInt = (int) (l_31_ - l);
                    JagStrings.memcpy(buffer, (int) (l + (long) offset - position), readBuffer, (int) (l - aLong2758), anLocalInt);
                }
                position += (long) length;
            } else if (length > 0) {
                if (aLong2751 == -1L)
                    aLong2751 = position;
                JagStrings.memcpy(buffer, offset, writeBuffer, (int) (-aLong2751 + position), length);
                position += (long) length;
                if (position - aLong2751 > (long) writeBufferOffset)
                    writeBufferOffset = (int) (position - aLong2751);
            }
        } catch (IOException ioexception) {
            aLong2759 = -1L;
            throw ioexception;
        }
    }

    public static void cleanStatics() {
        aClass76_2753 = null;
    }

    private final File getFile() {
        return myFileOnDisk.getFile();
    }

    static final int method3770(int argument_33_, int argument_34_, int argument_35_) {
        argument_33_ &= 0x3;
        if (argument_33_ == 0)
            return argument_34_;
        if (argument_33_ == 1)
            return 7 - argument_35_;
        if (argument_33_ == 2)
            return -argument_34_ + 7;
        return argument_35_;
    }

    static final void method3771() {
        for (int anLocalInt = 0; anLocalInt < LightingManager.lightListPointer; anLocalInt++) {
            if (!LightingManager.aBooleanArray3116[anLocalInt]) {
                VirtualLight virtualLight = LightingManager.virtualLights[anLocalInt];
                HardwareLight class59_sub3 = ((VirtualLight) virtualLight).hardwareLight;
                int anLocalInt_36_ = ((VirtualLight) virtualLight).tileZ;
                int anLocalInt_37_ = class59_sub3.getRadius() - LightingManager.attenuationOffset;
                int anLocalInt_38_ = (anLocalInt_37_ * 2 >> LightingManager.lightCoordRShift) + 1;
                int anLocalInt_39_ = 0;
                int[] anLocalInts = new int[anLocalInt_38_ * anLocalInt_38_];
                int anLocalInt_40_ = (class59_sub3.getX() - anLocalInt_37_ >> LightingManager.lightCoordRShift);
                int anLocalInt_41_ = (class59_sub3.getZ() - anLocalInt_37_ >> LightingManager.lightCoordRShift);
                int anLocalInt_42_ = (class59_sub3.getZ() + anLocalInt_37_ >> LightingManager.lightCoordRShift);
                if (anLocalInt_41_ < 0) {
                    anLocalInt_39_ -= anLocalInt_41_;
                    anLocalInt_41_ = 0;
                }
                if (anLocalInt_42_ >= LightingManager.zMapSize)
                    anLocalInt_42_ = LightingManager.zMapSize - 1;
                for (int anLocalInt_43_ = anLocalInt_41_; anLocalInt_43_ <= anLocalInt_42_; anLocalInt_43_++) {
                    int anLocalInt_44_ = (((VirtualLight) virtualLight).shape[anLocalInt_39_]);
                    int anLocalInt_45_ = anLocalInt_44_ >>> 8;
                    int anLocalInt_46_ = anLocalInt_39_ * anLocalInt_38_ + anLocalInt_45_;
                    int anLocalInt_47_ = anLocalInt_40_ + (anLocalInt_44_ >>> 8);
                    int anLocalInt_48_ = anLocalInt_47_ + (anLocalInt_44_ & 0xff) - 1;
                    if (anLocalInt_47_ < 0) {
                        anLocalInt_46_ -= anLocalInt_47_;
                        anLocalInt_47_ = 0;
                    }
                    if (anLocalInt_48_ >= LightingManager.xMapSize)
                        anLocalInt_48_ = LightingManager.xMapSize - 1;
                    for (int anLocalInt_49_ = anLocalInt_47_; anLocalInt_49_ <= anLocalInt_48_; anLocalInt_49_++) {
                        int anLocalInt_50_ = 1;
                        DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2 = (LoadingBar.method2831(anLocalInt_36_, anLocalInt_49_, anLocalInt_43_, (aClass2762 != null ? aClass2762 : (aClass2762 = getClassForName("Class104_Sub2_Sub2")))));
                        if (class104_sub2_sub2 != null && (((DoublyLinkedNodeP2_Sub2_Sub2) class104_sub2_sub2).aByte6408) != 0) {
                            if ((((DoublyLinkedNodeP2_Sub2_Sub2) class104_sub2_sub2).aByte6408) == 1) {
                                boolean anLocalBoolean = anLocalInt_49_ - 1 >= anLocalInt_47_;
                                boolean anLocalBoolean_51_ = anLocalInt_49_ + 1 <= anLocalInt_48_;
                                if (!anLocalBoolean && anLocalInt_43_ + 1 <= anLocalInt_42_) {
                                    int anLocalInt_52_ = (((VirtualLight) virtualLight).shape[anLocalInt_39_ + 1]);
                                    int anLocalInt_53_ = (anLocalInt_40_ + (anLocalInt_52_ >>> 8));
                                    int anLocalInt_54_ = (anLocalInt_53_ + (anLocalInt_52_ & 0xff));
                                    anLocalBoolean = (anLocalInt_49_ > anLocalInt_53_ && anLocalInt_49_ < anLocalInt_54_);
                                }
                                if (!anLocalBoolean_51_ && anLocalInt_43_ - 1 >= anLocalInt_41_) {
                                    int anLocalInt_55_ = (((VirtualLight) virtualLight).shape[anLocalInt_39_ - 1]);
                                    int anLocalInt_56_ = (anLocalInt_40_ + (anLocalInt_55_ >>> 8));
                                    int anLocalInt_57_ = (anLocalInt_56_ + (anLocalInt_55_ & 0xff));
                                    anLocalBoolean_51_ = (anLocalInt_49_ > anLocalInt_56_ && anLocalInt_49_ < anLocalInt_57_);
                                }
                                if (anLocalBoolean && !anLocalBoolean_51_)
                                    anLocalInt_50_ = 4;
                                else if (anLocalBoolean_51_ && !anLocalBoolean)
                                    anLocalInt_50_ = 2;
                            } else {
                                boolean anLocalBoolean = anLocalInt_49_ - 1 >= anLocalInt_47_;
                                boolean anLocalBoolean_58_ = anLocalInt_49_ + 1 <= anLocalInt_48_;
                                if (!anLocalBoolean && anLocalInt_43_ - 1 >= anLocalInt_41_) {
                                    int anLocalInt_59_ = (((VirtualLight) virtualLight).shape[anLocalInt_39_ - 1]);
                                    int anLocalInt_60_ = (anLocalInt_40_ + (anLocalInt_59_ >>> 8));
                                    int anLocalInt_61_ = (anLocalInt_60_ + (anLocalInt_59_ & 0xff));
                                    anLocalBoolean = (anLocalInt_49_ > anLocalInt_60_ && anLocalInt_49_ < anLocalInt_61_);
                                }
                                if (!anLocalBoolean_58_ && anLocalInt_43_ + 1 <= anLocalInt_42_) {
                                    int anLocalInt_62_ = (((VirtualLight) virtualLight).shape[anLocalInt_39_ + 1]);
                                    int anLocalInt_63_ = (anLocalInt_40_ + (anLocalInt_62_ >>> 8));
                                    int anLocalInt_64_ = (anLocalInt_63_ + (anLocalInt_62_ & 0xff));
                                    anLocalBoolean_58_ = (anLocalInt_49_ > anLocalInt_63_ && anLocalInt_49_ < anLocalInt_64_);
                                }
                                if (anLocalBoolean && !anLocalBoolean_58_)
                                    anLocalInt_50_ = 3;
                                else if (anLocalBoolean_58_ && !anLocalBoolean)
                                    anLocalInt_50_ = 5;
                            }
                        }
                        anLocalInts[anLocalInt_46_++] = anLocalInt_50_;
                    }
                    anLocalInt_39_++;
                }
                LightingManager.aBooleanArray3116[anLocalInt] = true;
                Node_Sub31_Sub5.aClass_sArray5858[anLocalInt_36_].method3536(class59_sub3, anLocalInts);
            }
        }
    }

    BufferedFile(FileOnDisk file, int readBufferSize, int writeBufferSize) throws IOException {
        aLong2751 = -1L;
        aLong2758 = -1L;
        myFileOnDisk = file;
        fileLength = aLong2761 = file.length();
        position = 0L;
        writeBuffer = new byte[writeBufferSize];
        readBuffer = new byte[readBufferSize];
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
