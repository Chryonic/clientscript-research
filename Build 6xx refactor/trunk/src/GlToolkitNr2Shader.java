/* Class270 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class GlToolkitNr2Shader
{
    static int[] anIntArray351 = new int[2];
    private GraphicsToolkit_Sub2_Sub1 toolkit;
    long glPtr;

    static GlToolkitNr2Shader compile(int type, byte[] shaderSource, GraphicsToolkit_Sub2_Sub1 argument_7_) {
	if (shaderSource == null || shaderSource.length == 0)
	    return null;
	long l = OpenGL.glCreateShaderObjectARB(type);
	OpenGL.glShaderSourceRawARB(l, shaderSource);
	OpenGL.glCompileShaderARB(l);
	OpenGL.glGetObjectParameterivARB(l, 35713, anIntArray351, 0);
	if (anIntArray351[0] == 0) {
	    if (anIntArray351[0] == 0)
		System.out.println("Shader compile failed:");
	    OpenGL.glGetObjectParameterivARB(l, 35716, anIntArray351,
					     1);
	    if (anIntArray351[1] > 1) {
		byte[] anLocalInts = new byte[anIntArray351[1]];
		OpenGL.glGetInfoLogARB(l, anIntArray351[1],
				       anIntArray351, 0, anLocalInts,
				       0);
		System.out.println(new String(anLocalInts));
	    }
	    if (anIntArray351[0] == 0) {
		OpenGL.glDeleteObjectARB(l);
		return null;
	    }
	}
	return new GlToolkitNr2Shader(argument_7_, l);
    }

    protected final void finalize() throws Throwable {
	toolkit.requestArbObjectDeletion(this.glPtr);
	super.finalize();
    }

    GlToolkitNr2Shader(GraphicsToolkit_Sub2_Sub1 argument_18_, long argument_19_) {
	toolkit = argument_18_;
	this.glPtr = argument_19_;
    }
}
