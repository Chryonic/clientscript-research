/* Class189_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class189_Sub2 extends Class189
{
    static int anInt5642;
    
    Class189_Sub2(Js5Store argument_0_, Js5Store argument_1_,
		  Class253_Sub2 argument_2_) {
	super(argument_0_, argument_1_, (Class253) argument_2_);
    }
    
    final void method2869(int argument_3_, boolean argument_4_,
			  int argument_5_, int argument_6_) {
	int anLocalInt
	    = (this.method2871(2048)
	       * ((Class253) ((Class189) this).aClass253_3621).anInt3718
	       / 10000);
	Class389.aGraphicsToolkit3281.fillRect(argument_6_, argument_3_ + 2, anLocalInt, ((Class253) (((Class189) this).aClass253_3621)).anInt3711 - 2, ((Class253_Sub2) (Class253_Sub2) ((Class189) this).aClass253_3621).anInt5668, 0);
	if (argument_5_ <= 102)
	    method2873(false, (byte) 124, 122, 29);
	Class389.aGraphicsToolkit3281.fillRect(anLocalInt + argument_6_, argument_3_ + 2, (-anLocalInt + ((Class253) ((Class189) this).aClass253_3621).anInt3718), ((Class253) ((Class189) this).aClass253_3621).anInt3711 - 2, 0, 0);
    }
    
    final void method2873(boolean argument_7_, byte argument_8_,
			  int argument_9_, int argument_10_) {
	Class389.aGraphicsToolkit3281.drawRect(argument_9_ - 2, argument_10_, ((Class253) ((Class189) this).aClass253_3621).anInt3718 + 4, ((Class253) ((Class189) this).aClass253_3621).anInt3711 + 2, ((Class253_Sub2) (Class253_Sub2) ((Class189) this).aClass253_3621).anInt5671, 0);
	int anLocalInt = -1 / ((64 - argument_8_) / 35);
	Class389.aGraphicsToolkit3281.drawRect(argument_9_ - 1, argument_10_ + 1, ((Class253) ((Class189) this).aClass253_3621).anInt3718 + 2, ((Class253) ((Class189) this).aClass253_3621).anInt3711, 0, 0);
    }
    
    static final float[] method2877(float argument, int argument_11_,
				    int argument_12_, int argument_13_,
				    int argument_14_, int argument_15_,
				    float argument_16_, float argument_17_) {
	float[] fs = new float[9];
	float[] fs_18_ = new float[9];
	float f
	    = (float) Math.cos((double) ((float) argument_14_ * 0.024543693F));
	float f_19_
	    = (float) Math.sin((double) ((float) argument_14_ * 0.024543693F));
	fs[3] = 0.0F;
	fs[6] = -f_19_;
	fs[2] = f_19_;
	fs[8] = f;
	fs[4] = 1.0F;
	fs[1] = 0.0F;
	float f_20_ = -f + 1.0F;
	fs[7] = 0.0F;
	fs[5] = 0.0F;
	fs[0] = f;
	float[] fs_21_ = new float[9];
	float f_22_ = 1.0F;
	float f_23_ = 0.0F;
	f = (float) argument_13_ / 32767.0F;
	f_20_ = -f + 1.0F;
	f_19_ = -(float) Math.sqrt((double) (-(f * f) + 1.0F));
	float f_24_
	    = (float) Math.sqrt((double) (argument_12_ * argument_12_
					  + argument_15_ * argument_15_));
	if (f_24_ != 0.0F || f != 0.0F) {
	    if (f_24_ != 0.0F) {
		f_23_ = (float) argument_12_ / f_24_;
		f_22_ = (float) -argument_15_ / f_24_;
	    }
	    fs_21_[5] = f_19_ * f_22_;
	    fs_21_[6] = f_20_ * (f_23_ * f_22_);
	    fs_21_[3] = -f_23_ * f_19_;
	    fs_21_[4] = f;
	    fs_21_[0] = f + f_22_ * f_22_ * f_20_;
	    fs_21_[7] = -f_22_ * f_19_;
	    fs_21_[1] = f_23_ * f_19_;
	    fs_21_[8] = f_20_ * (f_23_ * f_23_) + f;
	    fs_21_[2] = f_20_ * (f_22_ * f_23_);
	    fs_18_[0]
		= fs_21_[6] * fs[2] + (fs_21_[3] * fs[1] + fs_21_[0] * fs[0]);
	    fs_18_[1]
		= fs_21_[1] * fs[0] + fs[1] * fs_21_[4] + fs[2] * fs_21_[7];
	    fs_18_[3]
		= fs_21_[6] * fs[5] + (fs_21_[3] * fs[4] + fs[3] * fs_21_[0]);
	    fs_18_[2]
		= fs_21_[8] * fs[2] + (fs_21_[5] * fs[1] + fs[0] * fs_21_[2]);
	    fs_18_[4]
		= fs[5] * fs_21_[7] + (fs[3] * fs_21_[1] + fs_21_[4] * fs[4]);
	    fs_18_[5]
		= fs_21_[8] * fs[5] + (fs_21_[2] * fs[3] + fs_21_[5] * fs[4]);
	    fs_18_[6]
		= fs[6] * fs_21_[0] + fs[7] * fs_21_[3] + fs_21_[6] * fs[8];
	    fs_18_[7]
		= fs[6] * fs_21_[1] + fs_21_[4] * fs[7] + fs_21_[7] * fs[8];
	    fs_18_[8]
		= fs[7] * fs_21_[5] + fs_21_[2] * fs[6] + fs[8] * fs_21_[8];
	} else
	    fs_18_ = fs;
	fs_18_[1] *= argument_16_;
	fs_18_[8] *= argument_17_;
	fs_18_[7] *= argument_17_;
	fs_18_[3] *= argument;
	fs_18_[5] *= argument;
	fs_18_[0] *= argument_16_;
	fs_18_[4] *= argument;
	fs_18_[2] *= argument_16_;
	fs_18_[argument_11_] *= argument_17_;
	return fs_18_;
    }
}
