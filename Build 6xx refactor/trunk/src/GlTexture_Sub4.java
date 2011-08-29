/* Class142_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

class GlTexture_Sub4 extends GlTexture {
    int height;
    private int fboAttachmentPoint;
    private int fboTarget = -1;
    int width;

    GlTexture_Sub4(GlToolkit renderer, int target, int format, int w, int h, boolean useMipMaps, byte[] pixels, int inputFormat, boolean invertY) {
        super(renderer, target, format, h * w, useMipMaps);
        fboAttachmentPoint = -1;
        this.height = h;
        this.width = w;
        if (invertY) {
            byte[] _pixels = new byte[pixels.length];
            for (int _y = 0; _y < h; _y++) {
                int poff = w * _y;
                int invY = (-_y - 1 + h) * w;
                for (int _x = 0; w > _x; _x++)
                    _pixels[poff++] = pixels[invY++];
            }
            pixels = _pixels;
        }
        this.myGLRenderer.bindTexture(this);
        OpenGL.glPixelStorei(3317, 1);
        if (!useMipMaps || this.type == 34037) {
            OpenGL.glTexImage2Dub(this.type, 0, this.format, this.width, this.height, 0, inputFormat, 5121, pixels, 0);
            this.setUseMipmaps(false);
        } else {
            JagexMipmapGen.genMipmaps(h, pixels, w, inputFormat, target, format);
            this.setUseMipmaps(true);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.setLinearMagnification(true);
    }

    final void setWrappingMode(boolean repeatT, boolean repeatS) {
        if (this.type == 3553) {
            this.myGLRenderer.bindTexture(this);
            OpenGL.glTexParameteri(this.type, 10242, repeatS ? 10497 : 33071);
            OpenGL.glTexParameteri(this.type, 10243, repeatT ? 10497 : 33071);
        }
    }

    public final void detachFBO(int argument_20_) {
        OpenGL.glFramebufferTexture2DEXT(fboTarget, fboAttachmentPoint, this.type, 0, 0);
        fboTarget = -1;
        fboAttachmentPoint = argument_20_;
    }

    final void method2501(int argument_21_, int argument_22_, boolean argument_23_, int argument_24_, int argument_25_, byte[] argument_26_, int argument_27_, int argument_28_, int argument_29_, int argument_30_) {
        if (argument_22_ == 0)
            argument_22_ = argument_21_;
        if (argument_23_) {
            int anLocalInt = GlToolkit.method883(argument_27_);
            int anLocalInt_31_ = argument_21_ * anLocalInt;
            int anLocalInt_32_ = argument_22_ * anLocalInt;
            byte[] anLocalInts = new byte[argument_25_ * anLocalInt_31_];
            for (int anLocalInt_33_ = 0; argument_25_ > anLocalInt_33_; anLocalInt_33_++) {
                int anLocalInt_34_ = anLocalInt_33_ * anLocalInt_31_;
                int anLocalInt_35_ = argument_29_ + anLocalInt_32_ * (-anLocalInt_33_ + argument_25_ - 1);
                for (int anLocalInt_36_ = 0; anLocalInt_31_ > anLocalInt_36_; anLocalInt_36_++)
                    anLocalInts[anLocalInt_34_++] = argument_26_[anLocalInt_35_++];
            }
            argument_26_ = anLocalInts;
        }
        this.myGLRenderer.bindTexture(this);
        OpenGL.glPixelStorei(3317, 1);
        if (argument_21_ != argument_22_)
            OpenGL.glPixelStorei(3314, argument_22_);
        OpenGL.glTexSubImage2Dub(this.type, 0, argument_30_, argument_28_, argument_21_, argument_25_, argument_27_, 5121, argument_26_, argument_29_);
        if (argument_21_ != argument_22_)
            OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
        int anLocalInt = 63 % ((argument_24_ - 49) / 61);
    }

    GlTexture_Sub4(GlToolkit argument_37_, int argument_38_, int argument_39_, int argument_40_, int argument_41_) {
        super(argument_37_, argument_38_, argument_39_, argument_41_ * argument_40_, false);
        fboAttachmentPoint = -1;
        this.height = argument_41_;
        this.width = argument_40_;
        this.myGLRenderer.bindTexture(this);
        OpenGL.glTexImage2Dub(this.type, 0, this.format, argument_40_, argument_41_, 0, Statics.method1498(this.format, 72), 5121, null, 0);
        this.setLinearMagnification(true);
    }

    GlTexture_Sub4(GlToolkit argument_42_, int argument_43_, int argument_44_, int argument_45_, int argument_46_, int argument_47_) {
        super(argument_42_, argument_43_, 6407, argument_47_ * argument_46_, false);
        fboAttachmentPoint = -1;
        this.height = argument_47_;
        this.width = argument_46_;
        int anLocalInt = (-argument_45_ - (argument_47_ - (this.myGLRenderer.viewportH)));
        this.myGLRenderer.bindTexture(this);
        OpenGL.glCopyTexImage2D(this.type, 0, this.format, argument_44_, anLocalInt, argument_46_, argument_47_, 0);
        this.setLinearMagnification(true);
    }

    GlTexture_Sub4(GlToolkit argument_48_, int argument_49_, int argument_50_, int argument_51_, int argument_52_, boolean argument_53_, float[] argument_54_, int argument_55_) {
        super(argument_48_, argument_49_, argument_50_, argument_51_ * argument_52_, argument_53_);
        fboAttachmentPoint = -1;
        this.width = argument_51_;
        this.height = argument_52_;
        this.myGLRenderer.bindTexture(this);
        if (argument_53_ && this.type != 34037) {
            Class137.method2460(argument_51_, argument_55_, argument_52_, argument_49_, argument_50_, 90, argument_54_);
            this.setUseMipmaps(true);
        } else {
            OpenGL.glTexImage2Df(this.type, 0, this.format, this.width, this.height, 0, argument_55_, 5126, argument_54_, 0);
            this.setUseMipmaps(false);
        }
        this.setLinearMagnification(true);
    }

    GlTexture_Sub4(GlToolkit argument_56_, int argument_57_, int argument_58_, int argument_59_, int argument_60_, boolean argument_61_, int[] argument_62_, int argument_63_, int argument_64_, boolean argument_65_) {
        super(argument_56_, argument_57_, argument_58_, argument_60_ * argument_59_, argument_61_);
        fboAttachmentPoint = -1;
        this.width = argument_59_;
        this.height = argument_60_;
        if (argument_65_) {
            int[] anLocalInts = new int[argument_62_.length];
            for (int anLocalInt = 0; argument_60_ > anLocalInt; anLocalInt++) {
                int anLocalInt_66_ = argument_59_ * anLocalInt;
                int anLocalInt_67_ = argument_59_ * (argument_60_ + (-anLocalInt - 1));
                for (int anLocalInt_68_ = 0; anLocalInt_68_ < argument_59_; anLocalInt_68_++)
                    anLocalInts[anLocalInt_66_++] = argument_62_[anLocalInt_67_++];
            }
            argument_62_ = anLocalInts;
        }
        this.myGLRenderer.bindTexture(this);
        if (this.type == 34037 || !argument_61_ || argument_63_ != 0 || argument_64_ != 0) {
            OpenGL.glPixelStorei(3314, argument_63_);
            OpenGL.glTexImage2Di(this.type, 0, this.format, this.width, this.height, 0, 32993, (this.myGLRenderer.framebufferFormat), argument_62_, argument_64_ * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.setUseMipmaps(false);
        } else {
            Class62_Sub26.method1466(this.type, argument_62_, this.width, this.height, 32993, (this.myGLRenderer.framebufferFormat), 5056, this.format);
            this.setUseMipmaps(true);
        }
        this.setLinearMagnification(true);
    }

    final void bindToFBO(int target, int aPoint, int level) {
        OpenGL.glFramebufferTexture2DEXT(target, aPoint, this.type, this.glPtr, level);
        fboAttachmentPoint = aPoint;
        fboTarget = target;
    }

    final void method2504(int argument_73_, int argument_75_, int argument_76_, int argument_77_, int argument_78_, int argument_79_) {
        int anLocalInt = ((this.myGLRenderer.viewportH) - argument_78_ - argument_77_);
        this.myGLRenderer.bindTexture(this);
        OpenGL.glCopyTexSubImage2D(this.type, 0, argument_79_, (this.height - argument_77_ - argument_75_), argument_73_, anLocalInt, argument_76_, argument_77_);
        OpenGL.glFlush();
    }

    final void method2505(int[] argument_80_, boolean argument_81_, int argument_82_, int argument_83_, int argument_84_, int argument_85_, int argument_86_, int argument_87_, int argument_88_) {
        if (argument_86_ == 0)
            argument_86_ = argument_87_;
        if (argument_81_) {
            int[] anLocalInts = new int[argument_87_ * argument_85_];
            for (int anLocalInt = 0; argument_85_ > anLocalInt; anLocalInt++) {
                int anLocalInt_89_ = argument_87_ * anLocalInt;
                int anLocalInt_90_ = (argument_86_ * (-anLocalInt + (argument_85_ - 1)) + argument_84_);
                for (int anLocalInt_91_ = 0; argument_87_ > anLocalInt_91_; anLocalInt_91_++)
                    anLocalInts[anLocalInt_89_++] = argument_80_[anLocalInt_90_++];
            }
            argument_80_ = anLocalInts;
        }
        this.myGLRenderer.bindTexture(this);
        if (argument_86_ != argument_87_)
            OpenGL.glPixelStorei(3314, argument_86_);
        OpenGL.glTexSubImage2Di(this.type, 0, argument_88_, -argument_85_ + (this.height - argument_82_), argument_87_, argument_85_, 32993, this.myGLRenderer.framebufferFormat, argument_80_, argument_84_);
        if (argument_86_ != argument_87_)
            OpenGL.glPixelStorei(3314, 0);
    }

}
