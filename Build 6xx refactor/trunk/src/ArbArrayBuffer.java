/* Class286_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

final class ArbArrayBuffer extends ArbBuffer implements GlArrayBuffer {
    private int stride;

    public final int getARBPointer() {
        return this.glPtr;
    }

    public final long getAddress() {
        return 0L;
    }

    final void bind() {
        this.glToolkit.bindArrayBuffer(this);
    }

    public final int getStride() {
        return stride;
    }

    public final void setData(byte[] data, int stride, int size) {
        this.setData(data, size);
        this.stride = stride;
    }

    ArbArrayBuffer(GlToolkit toolkit, int stride, byte[] data, int size, boolean stream) {
        super(toolkit, 34962, data, size, stream);
        this.stride = stride;
    }

    ArbArrayBuffer(GlToolkit toolkit, int stride, Buffer data, int size, boolean stream) {
        super(toolkit, 34962, data, size, stream);
        this.stride = stride;
    }
}
