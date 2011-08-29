/* Class2_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.event.ActionEvent;

import jaggl.OpenGL;

final class Gl2Water0 extends Class2 {
    private GlToolkitNr2Program aGlToolkitNr2Program_3796;
    private Class191 aClass191_3797;
    private boolean aBoolean3799;
    private boolean aBoolean3800;
    static RsInterface aRsInterface_3801 = null;

    final void method196(int argument_0_, byte argument_1_, Interface7 argument_2_) {
        if (!aBoolean3800) {
            this.aClass_ha_Sub2_56.method2237(true, argument_2_);
            this.aClass_ha_Sub2_56.method2216((byte) 62, argument_0_);
        }
        int anLocalInt = -51 / ((argument_1_ - 60) / 61);
    }

    static final void method205(RsInterface argument, byte argument_3_, RsInterface argument_4_) {
        Node_Sub29 class59_sub29 = Class91.method1683((byte) 101, Node_Sub31_Sub16.aClass372_5910, Class332.aClass207_2715);
        class59_sub29.aClass59_Sub28_Sub1_4129.p4(argument.idHash);
        class59_sub29.aClass59_Sub28_Sub1_4129.p2ip128(argument_4_.anInt1870);
        class59_sub29.aClass59_Sub28_Sub1_4129.p4m3412(argument_4_.idHash);
        class59_sub29.aClass59_Sub28_Sub1_4129.p2(argument.subId);
        class59_sub29.aClass59_Sub28_Sub1_4129.p2i_dupl(argument.anInt1870);
        class59_sub29.aClass59_Sub28_Sub1_4129.p2p128(argument_4_.subId);
        Class251.method3243(class59_sub29, true);
    }

    final void method189(int argument_5_, boolean argument_6_) {
        if (argument_5_ != 22789)
            method205(null, (byte) 72, null);
    }

    public static void method206(int argument) {
        aRsInterface_3801 = null;
        client.quitURL = null;
    }

    final boolean method185(int argument_7_) {
        if (argument_7_ <= 53)
            return true;
        return aBoolean3799;
    }

    final void method195(byte argument_8_) {
        if (argument_8_ <= 54)
            aRsInterface_3801 = null;
        if (aBoolean3800) {
            this.aClass_ha_Sub2_56.setActiveTexture(1);
            this.aClass_ha_Sub2_56.method2237(true, null);
            this.aClass_ha_Sub2_56.setActiveTexture(0);
            this.aClass_ha_Sub2_56.method2237(true, null);
            OpenGL.glUseProgramObjectARB(0L);
            aBoolean3800 = false;
        }
    }

    static final void method207(Object argument, Signlink argument_9_) {
        if (argument_9_.systemEventQueue != null) {
            for (int anLocalInt = 0; (anLocalInt < 50 && (argument_9_.systemEventQueue.peekEvent() != null)); anLocalInt++)
                Timing.sleep(1L);
            try {
                if (argument != null)
                    argument_9_.systemEventQueue.postEvent(new ActionEvent(argument, 1001, "dummy"));
            } catch (Exception exception) {
                /* empty */
            }
        }
    }

    Gl2Water0(GraphicsToolkit_Sub2_Sub1 toolkit, Js5Store shaderStore, Class191 argument_13_) {
        super(toolkit);
        aClass191_3797 = argument_13_;
        if (shaderStore != null && toolkit.hasVertexShader && toolkit.hasFragmentShader) {
            GlToolkitNr2Shader vertexShader = (GlToolkitNr2Shader.compile(35633, shaderStore.getData("gl", "environment_mapped_water_v"), toolkit));
            GlToolkitNr2Shader fragmentShader = (GlToolkitNr2Shader.compile(35632, shaderStore.getData("gl", "environment_mapped_water_f"), toolkit));
            aGlToolkitNr2Program_3796 = GlToolkitNr2Program.link((new GlToolkitNr2Shader[]{vertexShader, fragmentShader}), toolkit);
            aBoolean3799 = (aGlToolkitNr2Program_3796 != null && aClass191_3797.method2885((byte) -26));
        } else
            aBoolean3799 = false;
    }

    final void method193(boolean argument_15_, int argument_16_) {
        if (argument_16_ != 2)
            aBoolean3799 = true;
        Interface7_Impl3 interface7_impl3 = this.aClass_ha_Sub2_56.method2236();
        if (aBoolean3799 && interface7_impl3 != null) {
            this.aClass_ha_Sub2_56.setActiveTexture(1);
            this.aClass_ha_Sub2_56.method2237(true, interface7_impl3);
            this.aClass_ha_Sub2_56.setActiveTexture(0);
            this.aClass_ha_Sub2_56.method2237(true, aClass191_3797.anInterface7_Impl1_1399);
            long l = aGlToolkitNr2Program_3796.aLong1969;
            OpenGL.glUseProgramObjectARB(l);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"), -(this.aClass_ha_Sub2_56.sunLight0Position[0]), -(this.aClass_ha_Sub2_56.sunLight0Position[1]), -(this.aClass_ha_Sub2_56.sunLight0Position[2]));
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l, "sunColour"), (this.aClass_ha_Sub2_56.sunRed), (this.aClass_ha_Sub2_56.sunGreen), (this.aClass_ha_Sub2_56.sunBlue), 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "sunExponent"), Math.abs(this.aClass_ha_Sub2_56.sunLight0Position[1]) * 928.0F + 96.0F);
            aBoolean3800 = true;
        }
    }

    final void method186(int argument_17_, int argument_18_, boolean argument_19_) {
        if (aBoolean3800) {
            int anLocalInt = 1 << (argument_17_ & 0x3);
            float f = (float) (1 << (argument_17_ >> 3 & 0x7)) / 32.0F;
            int anLocalInt_20_ = argument_18_ & 0xffff;
            float f_21_ = (float) ((argument_18_ & 0x3b096) >> 16) / 8.0F;
            long l = aGlToolkitNr2Program_3796.aLong1969;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"), (float) (this.aClass_ha_Sub2_56.anInt4757 * anLocalInt % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"), f);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"), (float) anLocalInt_20_);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_21_);
        }
    }
}
