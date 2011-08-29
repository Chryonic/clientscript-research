/* Class278 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class JagexSocket implements Runnable {
    private boolean stopping = false;
    private byte[] writeBuffer;
    private Signlink signlink;
    private int writeBufferOutPos = 0;
    private InputStream myInputStream;
    private boolean lastAttemptFailed = false;
    private SignlinkRequest threadStartRequest;
    private int chunkSize;
    private Socket mySocket;
    private int writeBufferInPos = 0;
    private OutputStream myOutputStream;

    final void shutdown() {
        if (!stopping) {
            synchronized (this) {
                stopping = true;
                this.notifyAll();
            }
            if (threadStartRequest != null) {
                while (threadStartRequest.status == 0)
                    Timing.sleep(1L);
                if (threadStartRequest.status == 1) {
                    try {
                        ((Thread) threadStartRequest.result).join();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            threadStartRequest = null;
        }
    }

    final void read(byte[] buffer, int offset, int length) throws IOException {
        if (!stopping) {
            int readSize;
            for (/**/; length > 0; length -= readSize) {
                readSize = myInputStream.read(buffer, offset, length);
                if (readSize <= 0)
                    throw new EOFException();
                offset += readSize;
            }
        }
    }

    public final void run() {
        try {
            for (; ; ) {
                int length;
                int offset;
                synchronized (this) {
                    if (writeBufferInPos == writeBufferOutPos) {
                        if (stopping)
                            break;
                        try {
                            this.wait();
                        } catch (InterruptedException interruptedexception) {
                            /* empty */
                        }
                    }
                    if (writeBufferInPos >= writeBufferOutPos)
                        length = writeBufferInPos - writeBufferOutPos;
                    else
                        length = chunkSize - writeBufferOutPos;
                    offset = writeBufferOutPos;
                }
                if (length > 0) {
                    try {
                        myOutputStream.write(writeBuffer, offset, length);
                    } catch (IOException ioexception) {
                        lastAttemptFailed = true;
                    }
                    writeBufferOutPos = (writeBufferOutPos + length) % chunkSize;
                    try {
                        if (writeBufferOutPos == writeBufferInPos)
                            myOutputStream.flush();
                    } catch (IOException ioexception) {
                        lastAttemptFailed = true;
                    }
                }
            }
            try {
                if (myInputStream != null)
                    myInputStream.close();
                if (myOutputStream != null)
                    myOutputStream.close();
                if (mySocket != null)
                    mySocket.close();
            } catch (IOException ioexception) {
                /* empty */
            }
            writeBuffer = null;
        } catch (Exception exception) {
            ErrorReporting.reportError(null, exception);
        }
    }

    final void write(byte[] buffer, int offset, int length) throws IOException {
        if (!stopping) {
            if (lastAttemptFailed) {
                lastAttemptFailed = false;
                throw new IOException();
            }
            if (writeBuffer == null)
                writeBuffer = new byte[chunkSize];
            synchronized (this) {
                for (int writePos = offset; writePos < length; writePos++) {
                    writeBuffer[writeBufferInPos] = buffer[writePos];
                    writeBufferInPos = (writeBufferInPos + 1) % chunkSize;
                    if (writeBufferInPos == (chunkSize + writeBufferOutPos - 100) % chunkSize)
                        throw new IOException();
                }
                if (threadStartRequest == null)
                    threadStartRequest = signlink.requestThreadStart(this, 3);
                this.notifyAll();
            }
        }
    }

    final int read() throws IOException {
        if (stopping)
            return 0;
        return myInputStream.read();
    }

    final void setStubIOStreams() {
        if (!stopping) {
            myInputStream = new StubInputStream();
            myOutputStream = new StubOutputStream();
        }
    }

    final int available() throws IOException {
        if (stopping)
            return 0;
        return myInputStream.available();
    }

    final void clearErrors() throws IOException {
        if (!stopping) {
            if (lastAttemptFailed) {
                lastAttemptFailed = false;
                throw new IOException();
            }
        }
    }

    @SuppressWarnings({"FinalizeDoesntCallSuperFinalize"})
    @Override
    protected final void finalize() {
        shutdown();
    }

    JagexSocket(Socket socket, Signlink signlink, int chunkSize) throws IOException {
        mySocket = socket;
        this.signlink = signlink;
        mySocket.setSoTimeout(30000);
        mySocket.setTcpNoDelay(true);
        myInputStream = mySocket.getInputStream();
        myOutputStream = mySocket.getOutputStream();
        this.chunkSize = chunkSize;
    }
}
