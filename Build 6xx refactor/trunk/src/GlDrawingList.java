/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class GlDrawingList {
    private int listPtr;

    final void newList(int offset) {
        OpenGL.glNewList(listPtr + offset, 4864);
    }

    final void call(char offset) {
        OpenGL.glCallList(listPtr + offset);
    }

    final void endList() {
        OpenGL.glEndList();
    }

    GlDrawingList(int count) {
        listPtr = OpenGL.glGenLists(count);
    }
}
