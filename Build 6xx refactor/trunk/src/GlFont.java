/* Class57_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class GlFont extends AbstractFont {
    private GlToolkit toolkit;
    private GlDrawingList drawingList;
    private GlTexture_Sub4_Sub1 texture;
    private boolean aBoolean3855;

    GlFont(GlToolkit argument_0_, Class76 argument_1_, Class83[] argument_2_, boolean argument_3_) {
        super(argument_0_, argument_1_);
        toolkit = argument_0_;
        int tcMultiplier = 0;
        for (int anLocalInt_4_ = 0; anLocalInt_4_ < 256; anLocalInt_4_++) {
            Class83 class83 = argument_2_[anLocalInt_4_];
            if (class83.anInt587 > tcMultiplier)
                tcMultiplier = class83.anInt587;
            if (class83.anInt590 > tcMultiplier)
                tcMultiplier = class83.anInt590;
        }
        int anLocalInt_5_ = tcMultiplier * 16;
        if (argument_3_) {
            byte[] anLocalInts = new byte[anLocalInt_5_ * anLocalInt_5_];
            for (int anLocalInt_6_ = 0; anLocalInt_6_ < 256; anLocalInt_6_++) {
                Class83 class83 = argument_2_[anLocalInt_6_];
                int anLocalInt_7_ = class83.anInt587;
                int anLocalInt_8_ = class83.anInt590;
                int anLocalInt_9_ = anLocalInt_6_ % 16 * tcMultiplier;
                int anLocalInt_10_ = anLocalInt_6_ / 16 * tcMultiplier;
                int anLocalInt_11_ = anLocalInt_10_ * anLocalInt_5_ + anLocalInt_9_;
                int anLocalInt_12_ = 0;
                if (class83.aByteArray592 == null) {
                    byte[] anLocalInts_13_ = class83.aByteArray591;
                    for (int anLocalInt_14_ = 0; anLocalInt_14_ < anLocalInt_7_; anLocalInt_14_++) {
                        for (int anLocalInt_15_ = 0; anLocalInt_15_ < anLocalInt_8_; anLocalInt_15_++)
                            anLocalInts[anLocalInt_11_++] = (byte) ((anLocalInts_13_[anLocalInt_12_++] == 0) ? 0 : -1);
                        anLocalInt_11_ += anLocalInt_5_ - anLocalInt_8_;
                    }
                } else {
                    byte[] anLocalInts_16_ = class83.aByteArray592;
                    for (int anLocalInt_17_ = 0; anLocalInt_17_ < anLocalInt_7_; anLocalInt_17_++) {
                        for (int anLocalInt_18_ = 0; anLocalInt_18_ < anLocalInt_8_; anLocalInt_18_++)
                            anLocalInts[anLocalInt_11_++] = anLocalInts_16_[anLocalInt_12_++];
                        anLocalInt_11_ += anLocalInt_5_ - anLocalInt_8_;
                    }
                }
            }
            texture = Class188.method2868(anLocalInts, 6406, anLocalInt_5_, argument_0_, anLocalInt_5_, 6406, false, (byte) -100);
            aBoolean3855 = true;
        } else {
            int[] anLocalInts = new int[anLocalInt_5_ * anLocalInt_5_];
            for (int anLocalInt_19_ = 0; anLocalInt_19_ < 256; anLocalInt_19_++) {
                Class83 class83 = argument_2_[anLocalInt_19_];
                int[] anLocalInts_20_ = class83.anIntArray586;
                byte[] anLocalInts_21_ = class83.aByteArray592;
                byte[] anLocalInts_22_ = class83.aByteArray591;
                int anLocalInt_23_ = class83.anInt587;
                int anLocalInt_24_ = class83.anInt590;
                int anLocalInt_25_ = anLocalInt_19_ % 16 * tcMultiplier;
                int anLocalInt_26_ = anLocalInt_19_ / 16 * tcMultiplier;
                int anLocalInt_27_ = anLocalInt_26_ * anLocalInt_5_ + anLocalInt_25_;
                int anLocalInt_28_ = 0;
                if (anLocalInts_21_ != null) {
                    for (int anLocalInt_29_ = 0; anLocalInt_29_ < anLocalInt_23_; anLocalInt_29_++) {
                        for (int anLocalInt_30_ = 0; anLocalInt_30_ < anLocalInt_24_; anLocalInt_30_++) {
                            anLocalInts[anLocalInt_27_++] = (anLocalInts_21_[anLocalInt_28_] << 24 | (anLocalInts_20_[(anLocalInts_22_[anLocalInt_28_] & 0xff)]));
                            anLocalInt_28_++;
                        }
                        anLocalInt_27_ += anLocalInt_5_ - anLocalInt_24_;
                    }
                } else {
                    for (int anLocalInt_31_ = 0; anLocalInt_31_ < anLocalInt_23_; anLocalInt_31_++) {
                        for (int anLocalInt_32_ = 0; anLocalInt_32_ < anLocalInt_24_; anLocalInt_32_++) {
                            int anLocalInt_33_;
                            if ((anLocalInt_33_ = anLocalInts_22_[anLocalInt_28_++]) != 0)
                                anLocalInts[anLocalInt_27_++] = (anLocalInts_20_[anLocalInt_33_ & 0xff] | ~0xffffff);
                            else
                                anLocalInt_27_++;
                        }
                        anLocalInt_27_ += anLocalInt_5_ - anLocalInt_24_;
                    }
                }
            }
            texture = Class274.method3392(anLocalInt_5_, anLocalInts, false, 0, anLocalInt_5_, argument_0_, 0, (byte) -98);
            aBoolean3855 = false;
        }
        texture.setLinearMagnification(false);
        drawingList = new GlDrawingList(256);
        float tcXMultiplier = (texture.tileW / (float) (texture.anInt6552));
        float tcYMultiplier = (texture.tileH / (float) (texture.anInt6545));
        for (int charId = 0; charId < 256; charId++) {
            Class83 class83 = argument_2_[charId];
            int charH = class83.anInt587;
            int charW = class83.anInt590;
            int vcY = class83.anInt589;
            int vcX = class83.anInt593;
            float tcX = (float) (charId % 16 * tcMultiplier);
            float tcY = (float) (charId / 16 * tcMultiplier);
            float tcXA = tcX * tcXMultiplier;
            float tcYA = tcY * tcYMultiplier;
            float tcXB = (tcX + (float) charW) * tcXMultiplier;
            float tcYB = (tcY + (float) charH) * tcYMultiplier;
            drawingList.newList(charId);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(tcXA, texture.tileH - tcYA);
            OpenGL.glVertex2i(vcX, vcY);
            OpenGL.glTexCoord2f(tcXA, texture.tileH - tcYB);
            OpenGL.glVertex2i(vcX, vcY + charH);
            OpenGL.glTexCoord2f(tcXB, texture.tileH - tcYB);
            OpenGL.glVertex2i(vcX + charW, vcY + charH);
            OpenGL.glTexCoord2f(tcXB, texture.tileH - tcYA);
            OpenGL.glVertex2i(vcX + charW, vcY);
            OpenGL.glEnd();
            drawingList.endList();
        }
    }

    final void drawCharacter2(char character, int x, int y, int colour, boolean argument_50_) {
        toolkit.setupConfig4();
        toolkit.bindTexture(texture);
        if (aBoolean3855 || argument_50_) {
            toolkit.setCombineModes(8448, 7681);
            toolkit.method2334(34168, 768, 0, 34192);
        } else
            toolkit.setCombineModes(7681, 7681);
        OpenGL.glColor4ub((byte) (colour >> 16), (byte) (colour >> 8), (byte) colour, (byte) (colour >> 24));
        OpenGL.glTranslatef((float) x, (float) y, 0.0F);
        drawingList.call(character);
        OpenGL.glLoadIdentity();
        if (aBoolean3855 || argument_50_)
            toolkit.method2334(5890, 768, 0, 34192);
    }

    final void drawCharacter(char character_, int x_, int y_, int argument_54_, boolean argument_55_, Class_aa argument_56_, int argument_57_, int argument_58_) {
        Class_aa_Sub1 class_aa_sub1 = (Class_aa_Sub1) argument_56_;
        GlTexture_Sub4_Sub1 class142_sub4_sub1 = class_aa_sub1.aClass142_Sub4_Sub1_3746;
        toolkit.setupConfig4();
        toolkit.bindTexture(texture);
        if (aBoolean3855 || argument_55_) {
            toolkit.setCombineModes(8448, 7681);
            toolkit.method2334(34168, 768, 0, 34192);
        } else
            toolkit.setCombineModes(7681, 7681);
        toolkit.setActiveTextureUnit(1);
        toolkit.bindTexture(class142_sub4_sub1);
        toolkit.setCombineModes(8448, 7681);
        toolkit.method2334(34168, 768, 0, 34192);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float f = (class142_sub4_sub1.tileW / (float) class142_sub4_sub1.anInt6552);
        float f_59_ = (class142_sub4_sub1.tileH / (float) class142_sub4_sub1.anInt6545);
        OpenGL.glTexGenfv(8192, 9474, new float[]{f, 0.0F, 0.0F, (float) -argument_57_ * f}, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, f_59_, 0.0F, (float) -argument_58_ * f_59_}, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (argument_54_ >> 16), (byte) (argument_54_ >> 8), (byte) argument_54_, (byte) (argument_54_ >> 24));
        OpenGL.glTranslatef((float) x_, (float) y_, 0.0F);
        drawingList.call(character_);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        toolkit.method2334(5890, 768, 0, 34192);
        toolkit.setCombineModes(8448, 8448);
        toolkit.bind(null);
        toolkit.setActiveTextureUnit(0);
        if (aBoolean3855 || argument_55_)
            toolkit.method2334(5890, 768, 0, 34192);
    }
}
