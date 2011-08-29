/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

class GlArray {
    Buffer data;
    private GlToolkit toolkit;

    final void setData(byte[] data, int size) {
        if (this.data == null || this.data.getSize() < size)
            this.data = toolkit.heap.safeAllocateBuffer(size, false);
        this.data.put(data, 0, 0, size);
    }

    GlArray(GlToolkit toolkit, byte[] data, int size) {
        this.toolkit = toolkit;
        this.data = this.toolkit.heap.safeAllocateBuffer(size, false);
        if (data != null)
            this.data.put(data, 0, 0, size);
    }

    GlArray(GlToolkit argument_5_, Buffer argument_6_) {
        toolkit = argument_5_;
        this.data = argument_6_;
    }
}
