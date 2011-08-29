/* Class286 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaggl.OpenGL;

abstract class ArbBuffer {
    static int[] genArray = new int[1];
    private int size;
    private boolean isStream;
    GlToolkit glToolkit;
    int glPtr;
    private int target;

    final void setData(byte[] data, int size) {
        bind();
        if (this.size >= size)
            OpenGL.glBufferSubDataARBub(target, 0, size, data, 0);
        else {
            OpenGL.glBufferDataARBub(target, size, data, 0, isStream ? 35040 : 35044);
            this.glToolkit.arbBufferMemoryUsage += -this.size + size;
            this.size = size;
        }
    }

    protected final void finalize() throws Throwable {
        this.glToolkit.requestBufferDeletion(this.glPtr, size);
        super.finalize();
    }

    ArbBuffer(GlToolkit toolkit, int target, byte[] data, int size, boolean stream) {
        this.size = size;
        this.glToolkit = toolkit;
        this.target = target;
        isStream = stream;
        OpenGL.glGenBuffersARB(1, genArray, 0);
        this.glPtr = genArray[0];
        bind();
        OpenGL.glBufferDataARBub(target, this.size, data, 0, isStream ? 35040 : 35044);
        this.glToolkit.arbBufferMemoryUsage += this.size;
    }

    ArbBuffer(GlToolkit toolkit, int target, Buffer buffer, int size, boolean stream) {
        this.size = size;
        isStream = stream;
        this.target = target;
        this.glToolkit = toolkit;
        OpenGL.glGenBuffersARB(1, genArray, 0);
        this.glPtr = genArray[0];
        bind();
        OpenGL.glBufferDataARBa(target, this.size, buffer.getAddress(), isStream ? 35040 : 35044);
        this.glToolkit.arbBufferMemoryUsage += this.size;
    }

    abstract void bind();
}
