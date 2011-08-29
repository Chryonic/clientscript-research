/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

abstract class GlTexture implements FramebufferDetachable {
    static int[] buffer = new int[1];
    int format;
    int type;
    private int pixelCount;
    private boolean useMipmaps;
    private boolean useLinearMinification = false;
    GlToolkit myGLRenderer;
    int glPtr;

    final int getGlPtr() {
        return this.glPtr;
    }

    final void deleteFromServer() {
        if (this.glPtr > 0) {
            this.myGLRenderer.requestTextureDeletion(this.glPtr, getSize());
            this.glPtr = 0;
        }
    }

    private void applyFilters() {
        this.myGLRenderer.bindTexture(this);
        if (useLinearMinification) {
            OpenGL.glTexParameteri(this.type, 10241, useMipmaps ? 9987 : 9729);  //MIPMAP_LIN, LINEAR, (Minification)
            OpenGL.glTexParameteri(this.type, 10240, 9729);  //LINEAR (Magnification)
        } else {
            OpenGL.glTexParameteri(this.type, 10241, useMipmaps ? 9984 : 9728);    //MIPMAP_NEAREST, NEAREST (Magnification)
            OpenGL.glTexParameteri(this.type, 10240, 9728);  //NEAREST (Minification)
        }
    }

    protected final void finalize() throws Throwable {
        deleteFromServer();
        super.finalize();
    }

    private void updateUsage(int oldSize) {
        this.myGLRenderer.textureMemoryUsage -= oldSize;
        this.myGLRenderer.textureMemoryUsage += getSize();
    }

    final void setLinearMagnification(boolean useLinear) {
        if (useLinearMinification == useLinear)
            return;
        useLinearMinification = useLinear;
        applyFilters();
    }

    private int getSize() {
        int size = (this.myGLRenderer.sizeof(this.format) * pixelCount);
        if (!useMipmaps)
            return size;
        return size * 4 / 3;
    }

    final boolean generateMipMaps() {
        if (this.myGLRenderer.haveFBO) {
            int oldSize = getSize();
            this.myGLRenderer.bindTexture(this);
            OpenGL.glGenerateMipmapEXT(this.type);
            useMipmaps = true;
            applyFilters();
            updateUsage(oldSize);
            return true;
        }
        return false;
    }

    final void setUseMipmaps(boolean useMipmaps) {
        if (this.useMipmaps != useMipmaps) {
            int oldSize = getSize();
            this.useMipmaps = true;
            applyFilters();
            updateUsage(oldSize);
        }
    }

    GlTexture(GlToolkit renderer, int type, int format, int pixelCount, boolean useMipmaps) {
        this.myGLRenderer = renderer;
        this.format = format;
        this.pixelCount = pixelCount;
        this.useMipmaps = useMipmaps;
        this.type = type;
        OpenGL.glGenTextures(1, buffer, 0);
        this.glPtr = buffer[0];
        updateUsage(0);
    }

    public abstract void detachFBO(int argument_51_);
}
