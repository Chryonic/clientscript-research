/* Class334 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

//import static MathStatics.XOR;

final class Js5Client {
    private DCyclicLinkedList requestType0Queue = new DCyclicLinkedList();
    private DCyclicLinkedList requestType0RecvQueue = new DCyclicLinkedList();
    private DCyclicLinkedList requestType1Queue = new DCyclicLinkedList();
    private DCyclicLinkedList requestType1RecvQueue = new DCyclicLinkedList();
    private Packet controlPacket = new Packet(4);
    private int totalCommTime;
    private long lastRequest;
    private JagexSocket updateSocket;
    private byte xorKey = 0;
    volatile int status;
    volatile int exceptionCount = 0;
    private Packet inStream;
    private StreamingDataRequest currentRequest;

    final void setStubIOStreams() {
        if (updateSocket != null)
            updateSocket.setStubIOStreams();
    }

    final void setupXORCipher() {
        try {
            updateSocket.shutdown();
        } catch (Exception exception) {
            /* empty */
        }
        updateSocket = null;
        xorKey = (byte) (int) (Math.random() * 255.0 + 1.0);
        this.exceptionCount++;
        this.status = -1;
    }

    final boolean request1QueueFull() {
        return type1RequestCount(false) >= 20;
    }

    final void connect(JagexSocket socket, boolean send3or2) {
        if (updateSocket != null) {
            try {
                updateSocket.shutdown();
            } catch (Exception exception) {
                /* empty */
            }
            updateSocket = null;
        }
        updateSocket = socket;
        writeP6V3();
        send3or2(send3or2);
        inStream.pos = 0;
        currentRequest = null;
        for (; ; ) {
            StreamingDataRequest class59_sub51_sub4_sub1 = (StreamingDataRequest) requestType0RecvQueue.remove();
            if (class59_sub51_sub4_sub1 == null)
                break;
            requestType0Queue.add(class59_sub51_sub4_sub1);
        }
        for (; ; ) {
            StreamingDataRequest class59_sub51_sub4_sub1 = (StreamingDataRequest) requestType1RecvQueue.remove();
            if (class59_sub51_sub4_sub1 == null)
                break;
            requestType1Queue.add(class59_sub51_sub4_sub1);
        }
        if (this.xorKey != 0) {
            try {
                controlPacket.pos = 0;
                controlPacket.p1(4);
                controlPacket.p1(this.xorKey);
                controlPacket.p2(0);
                updateSocket.write(controlPacket.data, 0, 4);
            } catch (IOException ioexception) {
                try {
                    updateSocket.shutdown();
                } catch (Exception exception) {
                    /* empty */
                }
                this.status = -2;
                this.exceptionCount++;
                updateSocket = null;
            }
        }
        totalCommTime = 0;
        lastRequest = Applet_Sub1.getGameTime();
    }

    final void writeP7(int value) {
        if (updateSocket != null) {
            try {
                controlPacket.pos = 0;
                controlPacket.p1(7);
                controlPacket.p3(value);
                updateSocket.write(controlPacket.data, 0, 4);
            } catch (IOException ioexception) {
                try {
                    updateSocket.shutdown();
                } catch (Exception exception) {
                    /* empty */
                }
                updateSocket = null;
                this.exceptionCount++;
                this.status = -2;
            }
        }
    }

    private int type1RequestCount(boolean argument_15_) {
        if (argument_15_)
            closeSocket();
        return (requestType1Queue.size() + requestType1RecvQueue.size());
    }

    final void closeSocket() {
        if (updateSocket != null)
            updateSocket.shutdown();
    }

    private void writeP6V3() {
        if (updateSocket != null) {
            try {
                controlPacket.pos = 0;
                controlPacket.p1(6);
                controlPacket.p3(3);
                updateSocket.write(controlPacket.data, 0, 4);
            } catch (IOException ioexception) {
                try {
                    updateSocket.shutdown();
                } catch (Exception exception) {
                    /* empty */
                }
                this.status = -2;
                updateSocket = null;
                this.exceptionCount++;
            }
        }
    }

    final boolean processRequests() {
        if (updateSocket != null) {
            long time = Applet_Sub1.getGameTime();
            int lastTryAgo = (int) (time - lastRequest);
            lastRequest = time;
            if (lastTryAgo > 200)
                lastTryAgo = 200;
            totalCommTime += lastTryAgo;
            if (totalCommTime > 30000) {
                try {
                    updateSocket.shutdown();
                } catch (Exception exception) {
                    /* empty */
                }
                updateSocket = null;
            }
        } else {
            return !(type0RequestCount() != 0 || type1RequestCount(false) != 0);
        }
        try {
            updateSocket.clearErrors();
            for (StreamingDataRequest request = ((StreamingDataRequest) requestType0Queue.getFirst()); request != null; request = ((StreamingDataRequest) requestType0Queue.getNext())) {
                controlPacket.pos = 0;
                controlPacket.p1(1);
                controlPacket.p3((int) (request.id));
                updateSocket.write(controlPacket.data, 0, 4);
                requestType0RecvQueue.add(request);
            }
            for (StreamingDataRequest request = ((StreamingDataRequest) requestType1Queue.getFirst()); request != null; request = ((StreamingDataRequest) requestType1Queue.getNext())) {
                controlPacket.pos = 0;
                controlPacket.p1(0);
                controlPacket.p3((int) (request.id));
                updateSocket.write(controlPacket.data, 0, 4);
                requestType1RecvQueue.add(request);
            }
            for (int chunkPtr = 0; chunkPtr < 100; chunkPtr++) {
                int available = updateSocket.available();
                if (available < 0)
                    throw new IOException();
                if (available == 0)
                    break;
                totalCommTime = 0;
                int headerLength = 0;
                if (currentRequest != null) {
                    if (currentRequest.chunkOffset == 0)
                        headerLength = 1;
                } else
                    headerLength = 8;
                if (headerLength <= 0) {
                    int fileLength = currentRequest.data.data.length - currentRequest.startOffset;
                    int chunkLength = 512 - currentRequest.chunkOffset;
                    if ((-currentRequest.data.pos + fileLength) < chunkLength)
                        chunkLength = (fileLength - currentRequest.data.pos);
                    if (chunkLength > available)
                        chunkLength = available;
                    updateSocket.read((currentRequest.data.data), currentRequest.data.pos, chunkLength);
                    if (xorKey != 0) {
                        for (int _ptr = 0; _ptr < chunkLength; _ptr++)
                            currentRequest.data.data[(currentRequest.data.pos + _ptr)] = (byte) (MathStatics.XOR((currentRequest.data.data[(currentRequest.data.pos) + _ptr]), xorKey));
                    }
                    currentRequest.data.pos += chunkLength;
                    currentRequest.chunkOffset += chunkLength;
                    if (currentRequest.data.pos != fileLength) {
                        if (currentRequest.chunkOffset == 512)
                            currentRequest.chunkOffset = 0;
                    } else {
                        currentRequest.unlinkD();
                        ((DataRequest) currentRequest).inProcessing = false;
                        currentRequest = null;
                    }
                } else {
                    int inLength = (headerLength - inStream.pos);
                    if (available < inLength)
                        inLength = available;
                    updateSocket.read(inStream.data, inStream.pos, inLength);
                    if (xorKey != 0) {
                        for (int _ptr = 0; _ptr < inLength; _ptr++)
                            inStream.data[(_ptr + (inStream.pos))] = (byte) (MathStatics.XOR((inStream.data[(_ptr + (inStream.pos))]), xorKey));
                    }
                    inStream.pos += inLength;
                    if (inStream.pos >= headerLength) {
                        if (currentRequest == null) {
                            inStream.pos = 0;
                            int cacheId = inStream.g1();
                            int index = inStream.g2();
                            int flags = inStream.g1();
                            int length = inStream.g4();
                            int compressionType = flags & 0x7f;
                            boolean priority = (flags & 0x80) != 0;
                            long hash = (long) ((cacheId << 16) + index);
                            StreamingDataRequest request;
                            if (priority) {
                                for (request = ((StreamingDataRequest) requestType1RecvQueue.getFirst()); request != null; request = ((StreamingDataRequest) requestType1RecvQueue.getNext())) {
                                    if (request.id == hash)
                                        break;
                                }
                            } else {
                                for (request = ((StreamingDataRequest) requestType0RecvQueue.getFirst()); request != null; request = ((StreamingDataRequest) requestType0RecvQueue.getNext())) {
                                    if (hash == request.id)
                                        break;
                                }
                            }
                            if (request == null)
                                throw new IOException();
                            int writeOffset = compressionType == 0 ? 5 : 9;
                            currentRequest = request;
                            currentRequest.data = (new Packet(currentRequest.startOffset + writeOffset + length));
                            currentRequest.data.p1(compressionType);
                            currentRequest.data.p4(length);
                            currentRequest.chunkOffset = 8;
                            inStream.pos = 0;
                        } else if (currentRequest.chunkOffset == 0) {
                            if ((inStream.data[0]) != -1)
                                currentRequest = null;
                            else {
                                inStream.pos = 0;
                                currentRequest.chunkOffset = 1;
                            }
                        } else
                            throw new IOException();
                    }
                }
            }
            return true;
        } catch (IOException ioexception) {
            try {
                updateSocket.shutdown();
            } catch (Exception exception) {
                /* empty */
            }
            updateSocket = null;
            this.exceptionCount++;
            this.status = -2;
            return !(type0RequestCount() != 0 || type1RequestCount(false) != 0);
        }
    }

    final StreamingDataRequest requestData(int cache, int id, boolean useType0, byte startOffset) {
        long hash = (long) ((cache << 16) + id);
        StreamingDataRequest request = new StreamingDataRequest();
        ((DataRequest) request).aBoolean6238 = useType0;
        ((DoublyLinkedNode) request).id = hash;
        request.startOffset = startOffset;
        if (useType0) {
            if (type0RequestCount() >= 20)
                throw new RuntimeException();
            requestType0Queue.add(request);
        } else {
            if (type1RequestCount(false) >= 20)
                throw new RuntimeException();
            requestType1Queue.add(request);
        }
        return request;
    }

    final boolean request0QueueFull() {
        return type0RequestCount() >= 20;
    }

    final int type0RequestCount() {
        return (requestType0Queue.size() + requestType0RecvQueue.size());
    }

    final void send3or2(boolean pkt3or2) {
        if (updateSocket != null) {
            try {
                controlPacket.pos = 0;
                controlPacket.p1(!pkt3or2 ? 3 : 2);
                controlPacket.p3(0);
                updateSocket.write(controlPacket.data, 0, 4);
            } catch (IOException ioexception) {
                try {
                    updateSocket.shutdown();
                } catch (Exception exception) {
                    /* empty */
                }
                this.status = -2;
                updateSocket = null;
                this.exceptionCount++;
            }
        }
    }

    public Js5Client() {
        this.status = 0;
        inStream = new Packet(8);
    }
}
