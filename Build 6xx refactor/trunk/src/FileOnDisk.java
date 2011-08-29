/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

final class FileOnDisk {
    private RandomAccessFile myRandomAccessFile;
    private long maxSize;
    static long[] aLongArray1452 = new long[100];
    static int anInt1453;
    static MenuAction aClass59_Sub51_Sub9_1454;
    private long position;
    private File myFile;

    public static void cleanStatics() {
        aClass59_Sub51_Sub9_1454 = null;
        aLongArray1452 = null;
    }

    final long length() throws IOException {
        return myRandomAccessFile.length();
    }

    final File getFile() {
        return myFile;
    }

    final void write(byte[] buffer, int offset,
                     int length) throws IOException {
        if (maxSize < position + (long) length) {
            myRandomAccessFile.seek(maxSize);
            myRandomAccessFile.write(1);
            throw new EOFException();
        }
        myRandomAccessFile.write(buffer, offset, length);
        position += (long) length;
    }

    final void seek(long pos)
            throws IOException {
        myRandomAccessFile.seek(pos);
        position = pos;
    }

    final void close() throws IOException {
        if (myRandomAccessFile != null) {
            myRandomAccessFile.close();
            myRandomAccessFile = null;
        }
    }

    final int read(byte[] buffer, int offset,
                   int length) throws IOException {
        int readAmount = myRandomAccessFile.read(buffer, offset, length);
        if (readAmount > 0)
            position += (long) readAmount;
        return readAmount;
    }

    protected final void finalize() throws Throwable {
        if (myRandomAccessFile != null) {
            System.out.println
                    ("Warning! fileondisk " + myFile
                            + " not closed correctly using close(). Auto-closing instead. ");
            close();
        }
    }

    FileOnDisk(File file, String mode, long maxSize)
            throws IOException {
        if (maxSize == -1L)
            maxSize = 9223372036854775807L;
        if (maxSize < file.length())
            file.delete();
        myRandomAccessFile
                = new RandomAccessFile(file, mode);
        this.maxSize = maxSize;
        myFile = file;
        position = 0L;
        int readByte = myRandomAccessFile.read();
        if (readByte != -1 && !mode.equals("r")) {
            myRandomAccessFile.seek(0L);
            myRandomAccessFile.write(readByte);//Write access check
        }
        myRandomAccessFile.seek(0L);
    }
}
