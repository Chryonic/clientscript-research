/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap {
    long peer;
    private boolean allocated;
    private int size;

    final synchronized native int allocateBuffer(int size, boolean argument_1_);

    private final native void deallocateHeap();

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        safeDeallocate();
    }

    final synchronized native void put(int argument_2_, byte[] argument_3_, int argument_4_, int argument_5_, int argument_6_);

    private final native void allocateHeap(int argument_7_);

    final synchronized native void deallocateBuffer(int argument_8_);

    public final NativeHeapBuffer safeAllocateBuffer(int size, boolean argument_10_) {
        if (!allocated)
            throw new IllegalStateException();
        return new NativeHeapBuffer(this, allocateBuffer(size, argument_10_), size);
    }

    final synchronized native void get(int argument_11_, byte[] argument_12_, int argument_13_, int argument_14_, int argument_15_);

    final synchronized boolean isAllocated() {
        return allocated;
    }

    final synchronized native long getBufferAddress(int argument_16_);

    public NativeHeap(int size) {
        this.size = size;
        allocateHeap(this.size);
        allocated = true;
    }

    public final synchronized void safeDeallocate() {
        if (allocated)
            deallocateHeap();
        allocated = false;
    }
}
