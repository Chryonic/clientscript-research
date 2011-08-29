/* Class67_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class GlInterpolatedSkybox extends GlSkybox {
    static int[] scissorValue = new int[4];
    private GlToolkit toolkit;
    private GlCubeMap cubemap;

    final int getSize() {
        return cubemap.size;
    }

    GlInterpolatedSkybox(GlToolkit toolkit, int size) {
        this.toolkit = toolkit;
        cubemap = new GlCubeMap(toolkit, 6408, size);
    }

    final boolean combineCubemaps(GlCubeMap texture0, GlCubeMap texture1, float texture1Strength) {
        boolean anLocalBoolean = true;
        GlExtFramebuffer glExtFramebuffer = toolkit.aGlExtFramebuffer_4945;
        toolkit.getScissor(scissorValue);
        toolkit.clearClip();
        toolkit.setMode0();
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, cubemap.size, cubemap.size);
        toolkit.setFogEnabled(false);
        toolkit.setLightingEnabled(false);
        toolkit.setDepthTestEnabled(false);
        toolkit.method2276(false);
        toolkit.method2333(-2);
        toolkit.setActiveTextureUnit(1);
        toolkit.setTexEnvColour(0.0F, 0.0F, 0.0F, texture1Strength);
        toolkit.setCombineModes(34165, 34165);
        toolkit.bindTexture(texture0);
        toolkit.setActiveTextureUnit(0);
        toolkit.setCombineMode(1);
        toolkit.bindTexture(texture1);
        toolkit.method2331(glExtFramebuffer);
        for (int cubeMap = 0; cubeMap < 6; cubeMap++) {
            int cubePartGL = 34069 + cubeMap;
            glExtFramebuffer.bindCubeMap(cubemap, 0, cubePartGL);
            glExtFramebuffer.draw(0);
            if (glExtFramebuffer.isComplete()) {
                OpenGL.glBegin(7);
                int drawTarget = cubePartGL;
                if (drawTarget == 34069) {
                    OpenGL.glTexCoord3i(65535, 65534, 65534);
                    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord3i(65535, 65534, -65534);
                    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord3i(65535, -65534, -65534);
                    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord3i(65535, -65534, 65534);
                    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                } else if (drawTarget == 34070) {
                    OpenGL.glTexCoord3i(-65535, 65534, -65534);
                    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord3i(-65535, 65534, 65534);
                    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord3i(-65535, -65534, 65534);
                    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord3i(-65535, -65534, -65534);
                    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                } else if (drawTarget == 34071) {
                    OpenGL.glTexCoord3i(-65534, 65535, -65534);
                    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord3i(65534, 65535, -65534);
                    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord3i(65534, 65535, 65534);
                    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord3i(-65534, 65535, 65534);
                    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                } else if (drawTarget == 34072) {
                    OpenGL.glTexCoord3i(-65534, -65535, 65534);
                    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord3i(65534, -65535, 65534);
                    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord3i(65534, -65535, -65534);
                    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord3i(-65534, -65535, -65534);
                    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                } else if (drawTarget == 34073) {
                    OpenGL.glTexCoord3i(-65534, 65534, 65535);
                    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord3i(65534, 65534, 65535);
                    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord3i(65534, -65534, 65535);
                    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord3i(-65534, -65534, 65535);
                    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                } else if (drawTarget == 34074) {
                    OpenGL.glTexCoord3i(65534, 65534, -65535);
                    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord3i(-65534, 65534, -65535);
                    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord3i(-65534, -65534, -65535);
                    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord3i(65534, -65534, -65535);
                    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                }
                OpenGL.glEnd();
            } else {
                anLocalBoolean = false;
                break;
            }
        }
        glExtFramebuffer.detachObject(0);
        toolkit.detachFBO(glExtFramebuffer, false);
        toolkit.setActiveTextureUnit(1);
        toolkit.bind(null);
        toolkit.setCombineModes(8448, 8448);
        toolkit.setActiveTextureUnit(0);
        toolkit.bind(null);
        OpenGL.glPopAttrib();
        toolkit.setClip(scissorValue[0], scissorValue[3], scissorValue[2], scissorValue[1]);
        if (anLocalBoolean && !toolkit.aBoolean4992)
            cubemap.generateMipMaps();
        return anLocalBoolean;
    }

    final GlCubeMap getCubeMap() {
        return cubemap;
    }
}
