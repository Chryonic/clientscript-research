/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class GlExtFramebuffer implements GlFrameBuffer {
    static int[] genArray = new int[16];
    static int[] attachmentIds
            = {36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
    private int accessFlags = 0;
    private FramebufferDetachable[] anFramebufferDetachableArray3730 = new FramebufferDetachable[9];
    private int anInt3731;
    private int currentTarget = -1;
    private int anInt3733;
    private GlToolkit toolkit;
    private int anInt3735;
    private int ptr;

    final void method2959(byte argument_2_, int argument_3_) {
        if (currentTarget == -1)
            throw new RuntimeException();
        OpenGL.glReadBuffer(attachmentIds[argument_3_]);
    }

    final boolean isComplete() {
        int anLocalInt = OpenGL.glCheckFramebufferStatusEXT(currentTarget);
        return anLocalInt == 36053;
    }

    private void bindCubeMap(int mipLvevel, int attachmentId, int textureTarget, int fboTarget, GlCubeMap cubemap) {
        if ((~currentTarget) == fboTarget)
            throw new RuntimeException();
        int anLocalInt = 1 << attachmentId;
        if ((anInt3733 & (~anLocalInt)) == 0) {
            anInt3735 = cubemap.size;
            anInt3731 = cubemap.size;
        } else if (anInt3731 != cubemap.size || anInt3735 != cubemap.size)
            throw new RuntimeException();
        cubemap.bindFBO(mipLvevel, attachmentIds[attachmentId], currentTarget, textureTarget);
        anFramebufferDetachableArray3730[attachmentId] = cubemap;
        anInt3733 |= anLocalInt;
    }

    final void method2962(int argument_10_, GlTexture_Sub4 argument_12_) {
        method2964(0, argument_12_, false, argument_10_);
    }

    final void bindCubeMap(GlCubeMap cubemap, int attachmentId, int textureTarget) {
        bindCubeMap(0, attachmentId, textureTarget, 0, cubemap);
    }

    private void method2964(int argument_17_, GlTexture_Sub4 argument_18_, boolean argument_19_, int argument_20_) {
        if (currentTarget == -1)
            throw new RuntimeException();
        if (argument_19_)
            isComplete();
        int anLocalInt = 1 << argument_20_;
        if ((anInt3733 & (anLocalInt ^ 0xffffffff)) == 0) {
            anInt3735 = argument_18_.height;
            anInt3731 = argument_18_.width;
        } else if (anInt3731 != argument_18_.width || argument_18_.height != anInt3735)
            throw new RuntimeException();
        argument_18_.bindToFBO(currentTarget, attachmentIds[argument_20_], argument_17_);
        anFramebufferDetachableArray3730[argument_20_] = argument_18_;
        anInt3733 |= anLocalInt;
    }

    protected final void finalize() throws Throwable {
        toolkit.requestFramebufferDeletion(ptr);
        super.finalize();
    }

    public final void unbindForRead(int argument_21_) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        accessFlags &= ~0x1;
        currentTarget = getTarget();
    }

    final void detachObject(int argument_22_) {
        if (anFramebufferDetachableArray3730[argument_22_] != null)
            anFramebufferDetachableArray3730[argument_22_].detachFBO(-1);
        anInt3733 &= 1 << argument_22_ ^ 0xffffffff;
        anFramebufferDetachableArray3730[argument_22_] = null;
    }

    public final void bind(byte argument_24_) {
        OpenGL.glBindFramebufferEXT(36160, ptr);
        accessFlags |= 0x4;
        currentTarget = getTarget();
    }

    public final void bindForDraw(int argument_25_) {
        OpenGL.glBindFramebufferEXT(36009, ptr);
        accessFlags |= 0x2;
        currentTarget = getTarget();
    }

    final void method2967(DoublyLinkedNode_Sub51_Sub10 argument_27_, int argument_28_) {
        if (currentTarget == -1)
            throw new RuntimeException();
        int anLocalInt = 1 << argument_28_;
        if ((anInt3733 & (anLocalInt ^ 0xffffffff)) != 0) {
            if (anInt3731 != argument_27_.anInt5591 || anInt3735 != argument_27_.anInt5590)
                throw new RuntimeException();
        } else {
            anInt3731 = argument_27_.anInt5591;
            anInt3735 = argument_27_.anInt5590;
        }
        argument_27_.method1243(currentTarget, (byte) 114, attachmentIds[argument_28_]);
        anFramebufferDetachableArray3730[argument_28_] = argument_27_;
        anInt3733 |= anLocalInt;
    }

    final void draw(int argument_30_) {
        if (currentTarget == -1)
            throw new RuntimeException();
        OpenGL.glDrawBuffer(attachmentIds[argument_30_]);
    }

    public final void unbindForDraw(int argument_33_) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        accessFlags &= ~0x2;
        currentTarget = getTarget();
    }

    private int getTarget() {
        if ((accessFlags & 0x4) != 0)
            return 36160;
        if ((accessFlags & 0x2) != 0)
            return 36009;
        if ((accessFlags & 0x1) != 0)
            return 36008;
        return -1;
    }

    public final void unbind(int argument_35_) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        accessFlags &= ~0x4;
        currentTarget = getTarget();
    }

    public final void bindForRead(byte argument_36_) {
        OpenGL.glBindFramebufferEXT(36008, ptr);
        accessFlags |= 0x1;
        currentTarget = getTarget();
    }

    GlExtFramebuffer(GlToolkit toolkit) {
        if (!toolkit.haveFBO)
            throw new IllegalStateException("");
        this.toolkit = toolkit;
        OpenGL.glGenFramebuffersEXT(1, genArray, 0);
        ptr = genArray[0];
    }
}
