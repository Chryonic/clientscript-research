/* Class12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

final class GlGeometryArray extends GlArray implements GlArrayBuffer {
    private int stride;

    public final int getARBPointer() {
        return 0;
    }

    public final int getStride() {
        return stride;
    }

    public final long getAddress() {
        return this.data.getAddress();
    }

    GlGeometryArray(GlToolkit toolkit, int stride, byte[] data, int size) {
        super(toolkit, data, size);
        this.stride = stride;
    }

    public final void setData(byte[] data, int stride, int length) {
        this.setData(data, length);
        this.stride = stride;
    }

    GlGeometryArray(GlToolkit toolkit, int stride, Buffer data) {
        super(toolkit, data);
        this.stride = stride;
    }

}
