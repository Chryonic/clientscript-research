/* Class250 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class GlToolkitNr2Program {
    static int[] anIntArray1479 = new int[2];
    long aLong1969;
    private GraphicsToolkit_Sub2_Sub1 aClass_ha_Sub2_Sub1_1971;
    static float[] aFloatArray1972 = new float[2];

    public static void method3234(int argument) {
        client.keyHandler = null;
        TestingStageEnum.WTQA = null;
        aFloatArray1972 = null;
    }

    static final GlToolkitNr2Program link(GlToolkitNr2Shader[] argument_34_, GraphicsToolkit_Sub2_Sub1 argument_35_) {
        for (int anLocalInt = 0; argument_34_.length > anLocalInt; anLocalInt++) {
            if (argument_34_[anLocalInt] == null || argument_34_[anLocalInt].glPtr <= 0L)
                return null;
        }
        long l = OpenGL.glCreateProgramObjectARB();
        for (int anLocalInt = 0; argument_34_.length > anLocalInt; anLocalInt++)
            OpenGL.glAttachObjectARB(l, (argument_34_[anLocalInt].glPtr));
        OpenGL.glLinkProgramARB(l);
        OpenGL.glGetObjectParameterivARB(l, 35714, anIntArray1479, 0);
        if (anIntArray1479[0] == 0) {
            if (anIntArray1479[0] == 0)
                System.out.println("Shader linking failed:");
            OpenGL.glGetObjectParameterivARB(l, 35716, anIntArray1479, 1);
            if (anIntArray1479[1] > 1) {
                byte[] anLocalInts = new byte[anIntArray1479[1]];
                OpenGL.glGetInfoLogARB(l, anIntArray1479[1], anIntArray1479, 0, anLocalInts, 0);
                System.out.println(new String(anLocalInts));
            }
            if (anIntArray1479[0] == 0) {
                for (int anLocalInt = 0; argument_34_.length > anLocalInt; anLocalInt++)
                    OpenGL.glDetachObjectARB(l, (argument_34_[anLocalInt].glPtr));
                OpenGL.glDeleteObjectARB(l);
                return null;
            }
        }
        return new GlToolkitNr2Program(argument_35_, l, argument_34_);
    }

    protected final void finalize() throws Throwable {
        aClass_ha_Sub2_Sub1_1971.requestArbObjectDeletion(this.aLong1969);
        super.finalize();
    }

    static final void method3236(int argument, boolean argument_3_) {
        if (argument_3_) {
            if (Class66.anInt467 != -1)
                Node_Sub9_Sub1.method580(47, Class66.anInt467);
            for (Node_Sub49 class59_sub49 = (Node_Sub49) Class2_Sub5.aJagexHashMap_3787.first(0); class59_sub49 != null; class59_sub49 = (Node_Sub49) Class2_Sub5.aJagexHashMap_3787.next()) {
                if (!class59_sub49.isLinked()) {
                    class59_sub49 = ((Node_Sub49) Class2_Sub5.aJagexHashMap_3787.first(0));
                    if (class59_sub49 == null)
                        break;
                }
                Class222_Sub2.method3037(false, true, class59_sub49, -86709072);
            }
            Class66.anInt467 = -1;
            Class2_Sub5.aJagexHashMap_3787 = new JagexHashMap(8);
            RsInterface.method729(-40);
            Class66.anInt467 = client.lobbyscreenId;
            Statics.method1760(-39, false);
            Class305.method3596(0);
            Cs2Runtime.method3656(Class66.anInt467);
        }
        Statics.aBoolean184 = true;
    }

    GlToolkitNr2Program(GraphicsToolkit_Sub2_Sub1 argument_5_, long argument_6_, GlToolkitNr2Shader[] argument_7_) {
        this.aLong1969 = argument_6_;
        aClass_ha_Sub2_Sub1_1971 = argument_5_;
    }
}
