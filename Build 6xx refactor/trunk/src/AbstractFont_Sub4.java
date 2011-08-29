/* Class57_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class AbstractFont_Sub4 extends AbstractFont
{
    private GraphicsToolkit_Sub2 aClass_ha_Sub2_3856;
    private boolean aBoolean3857;
    private Interface7_Impl2 anInterface7_Impl2_3858;
    private Interface4_Impl2 anInterface4_Impl2_3859;
    
    final void drawCharacter2(char character_, int x_, int y_, int colour_, boolean argument_4_) {
	aClass_ha_Sub2_3856.method2196(1);
	aClass_ha_Sub2_3856.method2237(true, anInterface7_Impl2_3858);
	if (aBoolean3857 || argument_4_) {
	    aClass_ha_Sub2_3856.method2228(CombineModeEnum.MODULATE,
					   CombineModeEnum.REPLACE, 109);
	    aClass_ha_Sub2_3856.method2229((byte) 108,
					   GlMultiTexSourceEnum.CONSTANT, 0);
	    aClass_ha_Sub2_3856.method2246(colour_, 1);
	} else
	    aClass_ha_Sub2_3856.method2228(CombineModeEnum.REPLACE,
					   CombineModeEnum.REPLACE, -122);
	Class350_Sub2 class350_sub2
	    = aClass_ha_Sub2_3856.method2187((byte) 88);
	class350_sub2.method3825(x_, y_, 0);
	aClass_ha_Sub2_3856.method2222(11570);
	aClass_ha_Sub2_3856.method2130(anInterface4_Impl2_3859, 0, 76);
	aClass_ha_Sub2_3856.method2179((((GraphicsToolkit_Sub2) aClass_ha_Sub2_3856)
					.aClass222_4807),
				       (byte) -63);
	aClass_ha_Sub2_3856.method2156(Class387.aClass390_3267, 2,
				       character_ * '\004', (byte) 92);
	if (aBoolean3857 || argument_4_)
	    aClass_ha_Sub2_3856.method2229((byte) 108,
					   GlMultiTexSourceEnum.TEXTURE, 0);
    }
    
    final void drawCharacter(char character_, int x_, int y_, int argument_8_, boolean argument_9_, Class_aa argument_10_, int argument_11_, int argument_12_) {
	/* empty */
    }
    
    AbstractFont_Sub4(GraphicsToolkit_Sub2 argument_13_, Class76 argument_14_, Class83[] argument_15_, boolean argument_16_) {
	super(argument_13_, argument_14_);
	aClass_ha_Sub2_3856 = argument_13_;
	int anLocalInt = 0;
	for (int anLocalInt_17_ = 0; anLocalInt_17_ < 256; anLocalInt_17_++) {
	    Class83 class83 = argument_15_[anLocalInt_17_];
	    if (((Class83) class83).anInt587 > anLocalInt)
		anLocalInt = ((Class83) class83).anInt587;
	    if (((Class83) class83).anInt590 > anLocalInt)
		anLocalInt = ((Class83) class83).anInt590;
	}
	int anLocalInt_18_ = anLocalInt * 16;
	if (argument_16_) {
	    byte[] anLocalInts = new byte[anLocalInt_18_ * anLocalInt_18_];
	    for (int anLocalInt_19_ = 0; anLocalInt_19_ < 256;
		 anLocalInt_19_++) {
		Class83 class83 = argument_15_[anLocalInt_19_];
		int anLocalInt_20_ = ((Class83) class83).anInt587;
		int anLocalInt_21_ = ((Class83) class83).anInt590;
		int anLocalInt_22_ = anLocalInt_19_ % 16 * anLocalInt;
		int anLocalInt_23_ = anLocalInt_19_ / 16 * anLocalInt;
		int anLocalInt_24_
		    = anLocalInt_23_ * anLocalInt_18_ + anLocalInt_22_;
		int anLocalInt_25_ = 0;
		if (((Class83) class83).aByteArray592 == null) {
		    byte[] anLocalInts_26_ = ((Class83) class83).aByteArray591;
		    for (int anLocalInt_27_ = 0;
			 anLocalInt_27_ < anLocalInt_20_; anLocalInt_27_++) {
			for (int anLocalInt_28_ = 0;
			     anLocalInt_28_ < anLocalInt_21_; anLocalInt_28_++)
			    anLocalInts[anLocalInt_24_++]
				= (byte) ((anLocalInts_26_[anLocalInt_25_++]
					   == 0)
					  ? 0 : -1);
			anLocalInt_24_ += anLocalInt_18_ - anLocalInt_21_;
		    }
		} else {
		    byte[] anLocalInts_29_ = ((Class83) class83).aByteArray592;
		    for (int anLocalInt_30_ = 0;
			 anLocalInt_30_ < anLocalInt_20_; anLocalInt_30_++) {
			for (int anLocalInt_31_ = 0;
			     anLocalInt_31_ < anLocalInt_21_; anLocalInt_31_++)
			    anLocalInts[anLocalInt_24_++]
				= anLocalInts_29_[anLocalInt_25_++];
			anLocalInt_24_ += anLocalInt_18_ - anLocalInt_21_;
		    }
		}
	    }
	    if (!argument_13_.method2132(Node_Sub31_Sub23.aClass320_5942,
					 -2, DataType.BYTE)) {
		int[] anLocalInts_32_ = new int[anLocalInts.length];
		for (int anLocalInt_33_ = 0;
		     anLocalInt_33_ < anLocalInts.length; anLocalInt_33_++)
		    anLocalInts_32_[anLocalInt_33_]
			= anLocalInts[anLocalInt_33_] << 24;
		anInterface7_Impl2_3858
		    = argument_13_.method2233((byte) -114, anLocalInt_18_,
					      anLocalInt_18_, false,
					      anLocalInts_32_);
	    } else
		anInterface7_Impl2_3858
		    = argument_13_.method2153(anLocalInts, anLocalInt_18_,
					      anLocalInt_18_, (byte) -62,
					      false,
					      (Node_Sub31_Sub23
					       .aClass320_5942));
	    aBoolean3857 = true;
	} else {
	    int[] anLocalInts = new int[anLocalInt_18_ * anLocalInt_18_];
	    for (int anLocalInt_34_ = 0; anLocalInt_34_ < 256;
		 anLocalInt_34_++) {
		Class83 class83 = argument_15_[anLocalInt_34_];
		int[] anLocalInts_35_ = ((Class83) class83).anIntArray586;
		byte[] anLocalInts_36_ = ((Class83) class83).aByteArray592;
		byte[] anLocalInts_37_ = ((Class83) class83).aByteArray591;
		int anLocalInt_38_ = ((Class83) class83).anInt587;
		int anLocalInt_39_ = ((Class83) class83).anInt590;
		int anLocalInt_40_ = anLocalInt_34_ % 16 * anLocalInt;
		int anLocalInt_41_ = anLocalInt_34_ / 16 * anLocalInt;
		int anLocalInt_42_
		    = anLocalInt_41_ * anLocalInt_18_ + anLocalInt_40_;
		int anLocalInt_43_ = 0;
		if (anLocalInts_36_ != null) {
		    for (int anLocalInt_44_ = 0;
			 anLocalInt_44_ < anLocalInt_38_; anLocalInt_44_++) {
			for (int anLocalInt_45_ = 0;
			     anLocalInt_45_ < anLocalInt_39_;
			     anLocalInt_45_++) {
			    anLocalInts[anLocalInt_42_++]
				= (anLocalInts_36_[anLocalInt_43_] << 24
				   | (anLocalInts_35_
				      [(anLocalInts_37_[anLocalInt_43_]
					& 0xff)]));
			    anLocalInt_43_++;
			}
			anLocalInt_42_ += anLocalInt_18_ - anLocalInt_39_;
		    }
		} else {
		    for (int anLocalInt_46_ = 0;
			 anLocalInt_46_ < anLocalInt_38_; anLocalInt_46_++) {
			for (int anLocalInt_47_ = 0;
			     anLocalInt_47_ < anLocalInt_39_;
			     anLocalInt_47_++) {
			    int anLocalInt_48_;
			    if ((anLocalInt_48_
				 = anLocalInts_37_[anLocalInt_43_++])
				!= 0)
				anLocalInts[anLocalInt_42_++]
				    = (anLocalInts_35_[anLocalInt_48_ & 0xff]
				       | ~0xffffff);
			    else
				anLocalInt_42_++;
			}
			anLocalInt_42_ += anLocalInt_18_ - anLocalInt_39_;
		    }
		}
	    }
	    anInterface7_Impl2_3858
		= argument_13_.method2233((byte) -107, anLocalInt_18_,
					  anLocalInt_18_, false, anLocalInts);
	    aBoolean3857 = false;
	}
	anInterface7_Impl2_3858.method33(-114, Class388.aClass382_3278);
	anInterface4_Impl2_3859 = argument_13_.method2248(0, false);
	anInterface4_Impl2_3859.method52(20480, 20, -10760);
	for (int anLocalInt_49_ = 0; anLocalInt_49_ < 4; anLocalInt_49_++) {
	    Buffer buffer
		= anInterface4_Impl2_3859.method50(true, true);
	    if (buffer != null) {
		Stream stream = aClass_ha_Sub2_3856.method2116(9, buffer);
		float f
		    = (anInterface7_Impl2_3858.method18(-18982,
							(float) anLocalInt_18_)
		       / (float) anLocalInt_18_);
		float f_50_
		    = (anInterface7_Impl2_3858.method22(-51,
							(float) anLocalInt_18_)
		       / (float) anLocalInt_18_);
		for (int anLocalInt_51_ = 0; anLocalInt_51_ < 256;
		     anLocalInt_51_++) {
		    Class83 class83 = argument_15_[anLocalInt_51_];
		    int anLocalInt_52_ = ((Class83) class83).anInt587;
		    int anLocalInt_53_ = ((Class83) class83).anInt590;
		    int anLocalInt_54_ = ((Class83) class83).anInt589;
		    int anLocalInt_55_ = ((Class83) class83).anInt593;
		    float f_56_ = (float) (anLocalInt_51_ % 16 * anLocalInt);
		    float f_57_ = (float) (anLocalInt_51_ / 16 * anLocalInt);
		    float f_58_ = f_56_ * f;
		    float f_59_ = f_57_ * f_50_;
		    float f_60_ = (f_56_ + (float) anLocalInt_53_) * f;
		    float f_61_ = (f_57_ + (float) anLocalInt_52_) * f_50_;
		    if (Stream.isBigEndian()) {
			stream.writeFloatBE((float) anLocalInt_55_);
			stream.writeFloatBE((float) anLocalInt_54_);
			stream.writeFloatBE(0.0F);
			stream.writeFloatBE(f_58_);
			stream.writeFloatBE(f_59_);
			stream.writeFloatBE((float) anLocalInt_55_);
			stream.writeFloatBE((float) (anLocalInt_54_ + anLocalInt_52_));
			stream.writeFloatBE(0.0F);
			stream.writeFloatBE(f_58_);
			stream.writeFloatBE(f_61_);
			stream.writeFloatBE((float) (anLocalInt_55_ + anLocalInt_53_));
			stream.writeFloatBE((float) (anLocalInt_54_ + anLocalInt_52_));
			stream.writeFloatBE(0.0F);
			stream.writeFloatBE(f_60_);
			stream.writeFloatBE(f_61_);
			stream.writeFloatBE((float) (anLocalInt_55_ + anLocalInt_53_));
			stream.writeFloatBE((float) anLocalInt_54_);
			stream.writeFloatBE(0.0F);
			stream.writeFloatBE(f_60_);
			stream.writeFloatBE(f_59_);
		    } else {
			stream.writeFloatLE((float) anLocalInt_55_);
			stream.writeFloatLE((float) anLocalInt_54_);
			stream.writeFloatLE(0.0F);
			stream.writeFloatLE(f_58_);
			stream.writeFloatLE(f_59_);
			stream.writeFloatLE((float) anLocalInt_55_);
			stream.writeFloatLE((float) (anLocalInt_54_ + anLocalInt_52_));
			stream.writeFloatLE(0.0F);
			stream.writeFloatLE(f_58_);
			stream.writeFloatLE(f_61_);
			stream.writeFloatLE((float) (anLocalInt_55_ + anLocalInt_53_));
			stream.writeFloatLE((float) (anLocalInt_54_ + anLocalInt_52_));
			stream.writeFloatLE(0.0F);
			stream.writeFloatLE(f_60_);
			stream.writeFloatLE(f_61_);
			stream.writeFloatLE((float) (anLocalInt_55_ + anLocalInt_53_));
			stream.writeFloatLE((float) anLocalInt_54_);
			stream.writeFloatLE(0.0F);
			stream.writeFloatLE(f_60_);
			stream.writeFloatLE(f_59_);
		    }
		}
		stream.upload();
		if (anInterface4_Impl2_3859.method53(10925))
		    break;
	    }
	}
    }
}
