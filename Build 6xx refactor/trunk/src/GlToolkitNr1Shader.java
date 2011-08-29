/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class GlToolkitNr1Shader {
    static int[] resultBuffer = new int[2];
    long glPtr;
    private GlToolkit glToolkit;

    static GlToolkitNr1Shader compile(int target, GlToolkit toolkit, String argument_17_) {
        long shaderObject = OpenGL.glCreateShaderObjectARB(target);
        OpenGL.glShaderSourceARB(shaderObject, argument_17_);
        OpenGL.glCompileShaderARB(shaderObject);
        OpenGL.glGetObjectParameterivARB(shaderObject, 35713, resultBuffer, 0);
        if (resultBuffer[0] == 0) {
            if (resultBuffer[0] == 0)
                System.out.println("Shader compile failed:");
            OpenGL.glGetObjectParameterivARB(shaderObject, 35716, resultBuffer, 1);
            if (resultBuffer[1] > 1) {
                byte[] logData = new byte[resultBuffer[1]];
                OpenGL.glGetInfoLogARB(shaderObject, resultBuffer[1], resultBuffer, 0, logData, 0);
                System.out.println(new String(logData));
            }
            if (resultBuffer[0] == 0) {
                OpenGL.glDeleteObjectARB(shaderObject);
                return null;
            }
        }
        return new GlToolkitNr1Shader(toolkit, shaderObject);
    }

    protected final void finalize() throws Throwable {
        glToolkit.method2316(this.glPtr, false);
        super.finalize();
    }

    GlToolkitNr1Shader(GlToolkit argument_10_, long argument_11_) {
        glToolkit = argument_10_;
        this.glPtr = argument_11_;
    }
}
