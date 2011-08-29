/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.MapBuffer;
import jaggl.OpenGL;

abstract class Class1 implements Interface4 {
    static int[] genArray = new int[1];
    private int size;
    private int anInt3502 = 0;
    static int anInt3503 = 0;
    static long[] aLongArray3504 = new long[256];
    private int glPtr = -1;
    private boolean stream;
    private NativeHeapBuffer buffer;
    private int target;
    GraphicsToolkit_Sub2_Sub1 toolkit;
    static AbstractFont aAbstractFont_3510;
    private int maxSize;

    final void bind() {
        if (this.toolkit.hasVBO)
            OpenGL.glBindBufferARB(target, glPtr);
    }

    private void genBuffer() {
        if (glPtr < 0) {
            if (this.toolkit.hasVBO) {
                OpenGL.glGenBuffersARB(1, genArray, 0);
                glPtr = genArray[0];
                OpenGL.glBindBufferARB(target, glPtr);
            } else
                glPtr = 0;
        }
    }

    public int getSize(byte argument_2_) {
        return size;
    }

    void method44(int check) {
        if (glPtr > 0) {
            this.toolkit.requestARBBufferDeletion(glPtr, size);
            glPtr = -1;
        }
    }

    final boolean setData(int newsize, Source nativebuffer) {
        if (newsize <= maxSize) {
            if (glPtr > 0) {
                OpenGL.glBindBufferARB(target, glPtr);
                OpenGL.glBufferSubDataARBa(target, 0, size, nativebuffer.getAddress());
                ((GraphicsToolkit_Sub2) this.toolkit).arbBufferMemoryUsage += newsize - size;
            } else
                throw new RuntimeException("ARGH!");
        } else {
            genBuffer();
            if (glPtr <= 0)
                throw new RuntimeException("ARGH!");
            OpenGL.glBindBufferARB(target, glPtr);
            OpenGL.glBufferDataARBa(target, newsize, nativebuffer.getAddress(), stream ? 35040 : 35044);
            ((GraphicsToolkit_Sub2) this.toolkit).arbBufferMemoryUsage += newsize - size;
            maxSize = newsize;
        }
        size = newsize;
        return true;
    }

    public static void method172() {
        aAbstractFont_3510 = null;
        client.aThread3512 = null;
        aLongArray3504 = null;
    }

    void setSize(int size, byte argument_8_) {
        if (size > maxSize) {
            genBuffer();
            if (glPtr <= 0)
                buffer = this.toolkit.allocateBuffer(false, size);
            else {
                OpenGL.glBindBufferARB(target, glPtr);
                OpenGL.glBufferDataARBub(target, size, null, 0, !stream ? 35044 : 35040);
                ((GraphicsToolkit_Sub2) this.toolkit).arbBufferMemoryUsage += size - maxSize;
            }
            maxSize = size;
        }
        this.size = size;
    }

    final Buffer method173(MapBuffer argument_9_, boolean argument_10_) {
        if (anInt3502 == 0) {
            genBuffer();
            if (glPtr > 0) {
                OpenGL.glBindBufferARB(target, glPtr);
                if (argument_10_) {
                    OpenGL.glBufferDataARBub(target, maxSize, null, 0, stream ? 35040 : 35044);
                    if ((this.toolkit.aNativeHeapBuffer_4687.size) >= size) {
                        anInt3502 = 1;
                        return (this.toolkit.aNativeHeapBuffer_4687);
                    }
                }
                if (!argument_9_.method4153() && argument_9_.method4155(target, size, 35001)) {
                    anInt3502 = 2;
                    return argument_9_;
                }
            } else {
                anInt3502 = 2;
                return buffer;
            }
        }
        return null;
    }

    final boolean method174(boolean argument_12_, MapBuffer argument_13_) {
        boolean anLocalBoolean = true;
        if (anInt3502 != 0) {
            if (glPtr > 0) {
                OpenGL.glBindBufferARB(target, glPtr);
                if (anInt3502 == 1)
                    OpenGL.glBufferSubDataARBa(target, 0, maxSize, this.toolkit.aNativeHeapBuffer_4687.getAddress());
                else
                    anLocalBoolean = argument_13_.method4154();
            }
            anInt3502 = 0;
        }
        return anLocalBoolean;
    }

    protected final void finalize() throws Throwable {
        method44(487);
        super.finalize();
    }

    final long getAddress() {
        if (glPtr == 0)
            return buffer.getAddress();
        return 0L;
    }

    Class1(GraphicsToolkit_Sub2_Sub1 argument_15_, int argument_16_, boolean argument_17_) {
        target = argument_16_;
        this.toolkit = argument_15_;
        stream = argument_17_;
    }

    static {
        for (int anLocalInt = 0; anLocalInt < 256; anLocalInt++) {
            long l = (long) anLocalInt;
            for (int anLocalInt_18_ = 0; anLocalInt_18_ < 8; anLocalInt_18_++) {
                if ((l & 0x1L) == 1L)
                    l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
                else
                    l >>>= 1;
            }
            aLongArray3504[anLocalInt] = l;
        }
    }
}
