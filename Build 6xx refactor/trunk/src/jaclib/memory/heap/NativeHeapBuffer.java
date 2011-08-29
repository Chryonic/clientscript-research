/* Class393 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {
    private boolean allocated = true;
    private NativeHeap heap;
    private int bufferId;
    public int size;

    private synchronized boolean isAllocated() {
        return !(!heap.isAllocated() || !allocated);
    }

    private synchronized void deallocate() {
        if (isAllocated())
            heap.deallocateBuffer(bufferId);
        allocated = false;
    }

    public final long getAddress() {
        return heap.getBufferAddress(bufferId);
    }

    public final synchronized void put(byte[] data, int srcPos, int destPos, int length) {
        if (data == null | !isAllocated() | srcPos < 0 | length + srcPos > data.length | destPos < 0 | length + destPos > size)
            throw new RuntimeException();
        heap.put(bufferId, data, srcPos, destPos, length);
    }

    public final int getSize() {
        return size;
    }

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        deallocate();
    }

    NativeHeapBuffer(NativeHeap heap, int id, int length) {
        this.heap = heap;
        bufferId = id;
        size = length;
    }
}
