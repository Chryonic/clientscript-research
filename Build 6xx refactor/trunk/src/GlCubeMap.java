/* Class142_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class GlCubeMap extends GlTexture {
    private int framebufferAttachment = -1;
    private int framebufferTarget = -1;
    int size;

    GlCubeMap(GlToolkit toolkit, int format, int size) {
        super(toolkit, 34067, format, size * (size * 6), false);
        this.size = size;
        this.myGLRenderer.bindTexture(this);
        for (int anLocalInt = 0; anLocalInt < 6; anLocalInt++)
            OpenGL.glTexImage2Dub(anLocalInt + 34069, 0, this.format, size, size, 0, Statics.method1498((this.format), -87), 5121, null, 0);
        this.setLinearMagnification(true);
    }

    public final void detachFBO(int target) {
        OpenGL.glFramebufferTexture2DEXT(framebufferTarget, framebufferAttachment, 3553, 0, 0);
        framebufferTarget = target;
        framebufferAttachment = -1;
    }

    final void bindFBO(int mipLevel, int attachment, int target, int textureTarget) {
        OpenGL.glFramebufferTexture2DEXT(target, attachment, textureTarget, this.glPtr, mipLevel);
        framebufferTarget = target;
        framebufferAttachment = attachment;
    }

    GlCubeMap(GlToolkit toolkit, int format, int size, boolean useMipmaps, int[][] pixels) {
        super(toolkit, 34067, format, size * 6 * size, useMipmaps);
        this.size = size;
        this.myGLRenderer.bindTexture(this);
        if (!useMipmaps) {
            for (int cubeMapPart = 0; cubeMapPart < 6; cubeMapPart++)
                OpenGL.glTexImage2Di(cubeMapPart + 34069, 0, this.format, size, size, 0, 32993, (this.myGLRenderer.framebufferFormat), pixels[cubeMapPart], 0);
        } else {
            for (int cubeMapPart = 0; cubeMapPart < 6; cubeMapPart++)
                Class62_Sub26.method1466(cubeMapPart + 34069, pixels[cubeMapPart], size, size, 32993, this.myGLRenderer.framebufferFormat, 5056, this.format);
        }
        this.setLinearMagnification(true);
    }

    GlCubeMap(GlToolkit toolkit, int format, int size, boolean useMipMaps, byte[][] pixels, int inFormat) {
        super(toolkit, 34067, format, size * (size * 6), useMipMaps);
        this.size = size;
        this.myGLRenderer.bindTexture(this);
        for (int cubemapPart = 0; cubemapPart < 6; cubemapPart++)
            OpenGL.glTexImage2Dub(cubemapPart + 34069, 0, this.format, size, size, 0, inFormat, 5121, pixels[cubemapPart], 0);
        this.setLinearMagnification(true);
    }
}
