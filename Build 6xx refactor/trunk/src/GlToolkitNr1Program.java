/* Class237 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class GlToolkitNr1Program {
    static int[] resultsArray = new int[2];
    long glPtr;
    private GlToolkit toolkit;

    static GlToolkitNr1Program link(GlToolkitNr1Shader[] shaders, GlToolkit toolkit) {
        for (GlToolkitNr1Shader shader1 : shaders) {
            if (shader1 == null || shader1.glPtr <= 0L)
                return null;
        }
        long programObject = OpenGL.glCreateProgramObjectARB();
        for (GlToolkitNr1Shader shader : shaders)
            OpenGL.glAttachObjectARB(programObject, (shader.glPtr));
        OpenGL.glLinkProgramARB(programObject);
        OpenGL.glGetObjectParameterivARB(programObject, 35714, resultsArray, 0);
        if (resultsArray[0] == 0) {
            if (resultsArray[0] == 0)
                System.out.println("Shader linking failed:");
            OpenGL.glGetObjectParameterivARB(programObject, 35716, resultsArray, 1);
            if (resultsArray[1] > 1) {
                byte[] logData = new byte[resultsArray[1]];
                OpenGL.glGetInfoLogARB(programObject, resultsArray[1], resultsArray, 0, logData, 0);
                System.out.println(new String(logData));
            }
            if (resultsArray[0] == 0) {
                for (GlToolkitNr1Shader shader : shaders)
                    OpenGL.glDetachObjectARB(programObject, (shader.glPtr));
                OpenGL.glDeleteObjectARB(programObject);
                return null;
            }
        }
        return new GlToolkitNr1Program(toolkit, programObject, shaders);
    }

    protected final void finalize() throws Throwable {
        toolkit.method2316(this.glPtr, false);
        super.finalize();
    }

    GlToolkitNr1Program(GlToolkit argument_4_, long argument_5_, GlToolkitNr1Shader[] argument_6_) {
        toolkit = argument_4_;
        this.glPtr = argument_5_;
    }
}
