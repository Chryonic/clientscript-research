/* Class368_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class368_Sub3 extends Class368
{
    private int anInt5726 = 0;
    private boolean aBoolean5727;
    static int[] anIntArray5728;
    private int anInt5729 = 0;
    private int anInt5730 = 0;
    private int anInt5731 = 0;
    private GlTexture_Sub4_Sub1 aClass142_Sub4_Sub1_5732;
    private GlTexture_Sub4_Sub1 aClass142_Sub4_Sub1_5733;
    private GlToolkit aClass_ha_Sub3_5734;
    private int anInt5735 = 0;
    
    static final void method4034(int argument, DoublyLinkedNode_Sub51_Sub7 argument_0_,
				 int argument_1_, int argument_2_) {
	if (Node_Sub31_Sub39.aBoolean6055) {
	    int anLocalInt = 0;
	    for (MenuAction class59_sub51_sub9
		     = (MenuAction) ((DoublyLinkedNode_Sub51_Sub7) argument_0_)
						.aDCyclicLinkedList_6250.getFirst();
		 class59_sub51_sub9 != null;
		 class59_sub51_sub9
		     = (MenuAction) ((DoublyLinkedNode_Sub51_Sub7) argument_0_)
						.aDCyclicLinkedList_6250
						.getNext()) {
		int anLocalInt_3_
		    = Statics.method1287(class59_sub51_sub9, (byte) -101);
		if (anLocalInt_3_ > anLocalInt)
		    anLocalInt = anLocalInt_3_;
	    }
	    anLocalInt += 8;
	    DoublyLinkedNode_Sub51_Sub13.anInt6296
		= (((DoublyLinkedNode_Sub51_Sub7) argument_0_).anInt6249 * 16
		   + (!Class344.aBoolean3593 ? 22 : 26));
	    int anLocalInt_4_
		= ((DoublyLinkedNode_Sub51_Sub7) argument_0_).anInt6249 * 16 + 21;
	    int anLocalInt_5_
		= Class204.anInt1457 + DoublyLinkedNode_Sub51_Sub15.anInt6320;
	    if (anLocalInt + anLocalInt_5_ > Applet_Sub1.canvasWidth)
		anLocalInt_5_ = DoublyLinkedNode_Sub51_Sub15.anInt6320 - anLocalInt;
	    if (anLocalInt_5_ < 0)
		anLocalInt_5_ = 0;
	    int anLocalInt_6_ = !Class344.aBoolean3593 ? 31 : 33;
	    int anLocalInt_7_ = argument - anLocalInt_6_ + 13;
	    if (Applet_Sub1.canvasHeight < anLocalInt_7_ + anLocalInt_4_)
		anLocalInt_7_ = Applet_Sub1.canvasHeight - anLocalInt_4_;
	    if (anLocalInt_7_ < 0)
		anLocalInt_7_ = 0;
	    Node_Sub20.anInt4026 = anLocalInt_5_;
	    Statics.anInt6645 = anLocalInt;
	    Statics.aClass59_Sub51_Sub7_581 = argument_0_;
	    Statics.anInt5520 = anLocalInt_7_;
	}
    }
    
    static final String method4035(boolean argument, long argument_8_,
				   int argument_9_, int argument_10_,
				   int argument_11_) {
	char anLocalChar = ',';
	char anLocalChar_12_ = '.';
	if (argument_9_ == 0) {
	    anLocalChar = '.';
	    anLocalChar_12_ = ',';
	}
	if (argument_9_ == 2)
	    anLocalChar_12_ = '\u00a0';
	boolean anLocalBoolean = false;
	if (argument_8_ < 0L) {
	    anLocalBoolean = true;
	    argument_8_ = -argument_8_;
	}
	StringBuffer stringbuffer = new StringBuffer(26);
	if (argument_10_ > 0) {
	    for (int anLocalInt = 0; argument_10_ > anLocalInt; anLocalInt++) {
		int anLocalInt_13_ = (int) argument_8_;
		argument_8_ /= 10L;
		stringbuffer.append((char) (-((int) argument_8_ * 10)
					    + anLocalInt_13_ + 48));
	    }
	    stringbuffer.append(anLocalChar);
	}
	int anLocalInt = 0;
	for (;;) {
	    int anLocalInt_14_ = (int) argument_8_;
	    argument_8_ /= 10L;
	    stringbuffer.append((char) (anLocalInt_14_
					+ (48 - (int) argument_8_ * 10)));
	    if (argument_8_ == 0L)
		break;
	    if (argument && ++anLocalInt % 3 == 0)
		stringbuffer.append(anLocalChar_12_);
	}
	if (anLocalBoolean)
	    stringbuffer.append('-');
	return stringbuffer.reverse().toString();
    }
    
    final void method4024(int argument_15_, int argument_16_, int argument_17_,
			  int argument_18_) {
	anInt5735 = argument_16_;
	anInt5731 = argument_15_;
	anInt5729 = argument_18_;
	anInt5726 = argument_17_;
	aBoolean5727 = (anInt5731 != 0 || anInt5735 != 0 || anInt5726 != 0
			|| anInt5729 != 0);
    }
    
    public static void method4036(int argument) {
	anIntArray5728 = null;
    }
    
    final int method4022() {
	return ((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).anInt6545;
    }
    
    private final void method4037(int argument_19_, byte argument_20_) {
	if (argument_20_ >= 1) {
	    aClass_ha_Sub3_5734.setActiveTextureUnit(1);
	    aClass_ha_Sub3_5734.bindTexture(aClass142_Sub4_Sub1_5733);
	    aClass_ha_Sub3_5734.setCombineModes(7681, aClass_ha_Sub3_5734.getGLFriendlyCombineMode(argument_19_));
	    aClass_ha_Sub3_5734.method2334(34167, 768, 1, 34192);
	    aClass_ha_Sub3_5734.setTextureAlphaCombiners(0, 770, 34168);
	    aClass_ha_Sub3_5734.setActiveTextureUnit(0);
	    aClass_ha_Sub3_5734.bindTexture(aClass142_Sub4_Sub1_5732);
	    aClass_ha_Sub3_5734.setCombineModes(7681, 34479);
	    aClass_ha_Sub3_5734.method2334(34166, 768, 1, 34192);
	    if (anInt5730 == 0)
		aClass_ha_Sub3_5734.setTexEnvColour(1.0F, 0.5F, 0.5F, 0.0F);
	    else if (anInt5730 == 1)
		aClass_ha_Sub3_5734.setTexEnvColour(0.5F, 1.0F, 0.5F, 0.0F);
	    else if (anInt5730 != 2) {
		if (anInt5730 == 3)
		    aClass_ha_Sub3_5734.setTexEnvColour(128.5F, 128.5F, 128.5F, 0.0F);
	    } else
		aClass_ha_Sub3_5734.setTexEnvColour(0.5F, 0.5F, 1.0F, 0.0F);
	}
    }
    
    final void method4012(int argument_21_, int argument_22_, int argument_23_,
			  int argument_24_, int argument_25_, int argument_26_,
			  int argument_27_, int argument_28_) {
	aClass142_Sub4_Sub1_5733.setLinearMagnification((argument_28_ & 0x1) != 0);
	aClass_ha_Sub3_5734.method2296();
	aClass_ha_Sub3_5734.setBlendingConfiguration(argument_27_);
	OpenGL.glColor4ub((byte) (argument_26_ >> 16),
			  (byte) (argument_26_ >> 8), (byte) argument_26_,
			  (byte) (argument_26_ >> 24));
	if (!aBoolean5727) {
	    if (aClass142_Sub4_Sub1_5732 != null) {
		method4037(argument_25_, (byte) 47);
		aClass142_Sub4_Sub1_5732.setLinearMagnification(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 (((GlTexture_Sub4_Sub1)
					   aClass142_Sub4_Sub1_5733)
					  .tileH));
		OpenGL.glTexCoord2f(0.0F,
				    ((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileH);
		OpenGL.glVertex2i(argument_21_, argument_22_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(argument_21_, argument_22_ + argument_24_);
		OpenGL.glMultiTexCoord2f(33985,
					 ((GlTexture_Sub4_Sub1)
					  aClass142_Sub4_Sub1_5733).tileW,
					 0.0F);
		OpenGL.glTexCoord2f(((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileW,
				    0.0F);
		OpenGL.glVertex2i(argument_23_ + argument_21_,
				  argument_22_ + argument_24_);
		OpenGL.glMultiTexCoord2f(33985,
					 ((GlTexture_Sub4_Sub1)
					  aClass142_Sub4_Sub1_5733).tileW,
					 (((GlTexture_Sub4_Sub1)
					   aClass142_Sub4_Sub1_5733)
					  .tileH));
		OpenGL.glTexCoord2f(((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileW,
				    ((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileH);
		OpenGL.glVertex2i(argument_21_ + argument_23_, argument_22_);
		OpenGL.glEnd();
		method4038((byte) 109);
	    } else {
		aClass_ha_Sub3_5734.bindTexture(aClass142_Sub4_Sub1_5733);
		aClass_ha_Sub3_5734.setCombineMode(argument_25_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    ((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileH);
		OpenGL.glVertex2i(argument_21_, argument_22_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(argument_21_, argument_22_ + argument_24_);
		OpenGL.glTexCoord2f(((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileW,
				    0.0F);
		OpenGL.glVertex2i(argument_23_ + argument_21_,
				  argument_24_ + argument_22_);
		OpenGL.glTexCoord2f(((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileW,
				    ((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileH);
		OpenGL.glVertex2i(argument_21_ + argument_23_, argument_22_);
		OpenGL.glEnd();
	    }
	} else {
	    float f = (float) argument_23_ / (float) getWidth();
	    float f_29_ = (float) argument_24_ / (float) method4018();
	    float f_30_ = (float) argument_21_ + (float) anInt5731 * f;
	    float f_31_ = (float) anInt5735 * f_29_ + (float) argument_22_;
	    float f_32_
		= ((float) (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			    .anInt6552) * f
		   + f_30_);
	    float f_33_
		= ((float) (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			    .anInt6545) * f_29_
		   + f_31_);
	    if (aClass142_Sub4_Sub1_5732 != null) {
		method4037(argument_25_, (byte) 114);
		aClass142_Sub4_Sub1_5732.setLinearMagnification(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 (((GlTexture_Sub4_Sub1)
					   aClass142_Sub4_Sub1_5733)
					  .tileH));
		OpenGL.glTexCoord2f(0.0F,
				    ((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileH);
		OpenGL.glVertex2f(f_30_, f_31_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_30_, f_33_);
		OpenGL.glMultiTexCoord2f(33985,
					 ((GlTexture_Sub4_Sub1)
					  aClass142_Sub4_Sub1_5733).tileW,
					 0.0F);
		OpenGL.glTexCoord2f(((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileW,
				    0.0F);
		OpenGL.glVertex2f(f_32_, f_33_);
		OpenGL.glMultiTexCoord2f(33985,
					 ((GlTexture_Sub4_Sub1)
					  aClass142_Sub4_Sub1_5733).tileW,
					 (((GlTexture_Sub4_Sub1)
					   aClass142_Sub4_Sub1_5733)
					  .tileH));
		OpenGL.glTexCoord2f(((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileW,
				    ((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileH);
		OpenGL.glVertex2f(f_32_, f_31_);
		OpenGL.glEnd();
		method4038((byte) 89);
	    } else {
		aClass_ha_Sub3_5734.bindTexture(aClass142_Sub4_Sub1_5733);
		aClass_ha_Sub3_5734.setCombineMode(argument_25_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    ((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileH);
		OpenGL.glVertex2f(f_30_, f_31_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_30_, f_33_);
		OpenGL.glTexCoord2f(((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileW,
				    0.0F);
		OpenGL.glVertex2f(f_32_, f_33_);
		OpenGL.glTexCoord2f(((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileW,
				    ((GlTexture_Sub4_Sub1)
				     aClass142_Sub4_Sub1_5733).tileH);
		OpenGL.glVertex2f(f_32_, f_31_);
		OpenGL.glEnd();
	    }
	}
    }
    
    private final void method4038(byte argument_34_) {
	aClass_ha_Sub3_5734.setActiveTextureUnit(1);
	aClass_ha_Sub3_5734.bind(null);
	int anLocalInt = -2 / ((25 - argument_34_) / 42);
	aClass_ha_Sub3_5734.setCombineModes(8448, 8448);
	aClass_ha_Sub3_5734.method2334(34168, 768, 1, 34192);
	aClass_ha_Sub3_5734.setTextureAlphaCombiners(0, 770, 5890);
	aClass_ha_Sub3_5734.setActiveTextureUnit(0);
	aClass_ha_Sub3_5734.method2334(34168, 768, 1, 34192);
    }
    
    final void method4010(float argument_35_, float argument_36_,
			  float argument_37_, float argument_38_,
			  float argument_39_, float argument_40_,
			  int argument_41_, Class_aa argument_42_,
			  int argument_43_, int argument_44_) {
	GlTexture_Sub4_Sub1 class142_sub4_sub1
	    = (((Class_aa_Sub1) (Class_aa_Sub1) argument_42_)
	       .aClass142_Sub4_Sub1_3746);
	if (aBoolean5727) {
	    float f = (float) getWidth();
	    float f_45_ = (float) method4018();
	    float f_46_ = (argument_37_ - argument_35_) / f;
	    float f_47_ = (-argument_36_ + argument_38_) / f;
	    float f_48_ = (-argument_35_ + argument_39_) / f_45_;
	    float f_49_ = (argument_40_ - argument_36_) / f_45_;
	    float f_50_ = f_48_ * (float) anInt5735;
	    float f_51_ = f_49_ * (float) anInt5735;
	    float f_52_ = f_46_ * (float) anInt5731;
	    float f_53_ = (float) anInt5731 * f_47_;
	    float f_54_ = -f_46_ * (float) anInt5726;
	    float f_55_ = (float) anInt5726 * -f_47_;
	    float f_56_ = (float) anInt5729 * -f_48_;
	    argument_36_ = f_51_ + (f_53_ + argument_36_);
	    float f_57_ = (float) anInt5729 * -f_49_;
	    argument_35_ = f_50_ + (f_52_ + argument_35_);
	    argument_39_ = argument_39_ + f_52_ + f_56_;
	    argument_37_ = f_50_ + (argument_37_ + f_54_);
	    argument_38_ = argument_38_ + f_55_ + f_51_;
	    argument_40_ = argument_40_ + f_53_ + f_57_;
	}
	float f = -argument_35_ + argument_37_ + argument_39_;
	float f_58_ = -argument_36_ + argument_40_ + argument_38_;
	aClass142_Sub4_Sub1_5733.setLinearMagnification((argument_41_ & 0x1) != 0);
	aClass_ha_Sub3_5734.method2296();
	aClass_ha_Sub3_5734.bindTexture(aClass142_Sub4_Sub1_5733);
	aClass_ha_Sub3_5734.setCombineMode(1);
	aClass_ha_Sub3_5734.setActiveTextureUnit(1);
	aClass_ha_Sub3_5734.bindTexture(class142_sub4_sub1);
	aClass_ha_Sub3_5734.setCombineModes(8448, 7681);
	aClass_ha_Sub3_5734.method2334(34168, 768, 0, 34192);
	aClass_ha_Sub3_5734.setBlendingConfiguration(1);
	float f_59_
	    = (((GlTexture_Sub4_Sub1) class142_sub4_sub1).tileW
	       / (float) ((GlTexture_Sub4_Sub1) class142_sub4_sub1).anInt6552);
	float f_60_
	    = (((GlTexture_Sub4_Sub1) class142_sub4_sub1).tileH
	       / (float) ((GlTexture_Sub4_Sub1) class142_sub4_sub1).anInt6545);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((GlTexture_Sub4_Sub1)
				  aClass142_Sub4_Sub1_5733).tileH);
	OpenGL.glMultiTexCoord2f(33985,
				 (argument_35_ - (float) argument_43_) * f_59_,
				 ((((GlTexture_Sub4_Sub1) class142_sub4_sub1)
				   .tileH)
				  - (((float) -argument_44_ + argument_36_)
				     * f_60_)));
	OpenGL.glVertex2f(argument_35_, argument_36_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f
	    (33985, f_59_ * ((float) -argument_43_ + argument_39_),
	     (((GlTexture_Sub4_Sub1) class142_sub4_sub1).tileH
	      - (argument_40_ - (float) argument_44_) * f_60_));
	OpenGL.glVertex2f(argument_39_, argument_40_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((GlTexture_Sub4_Sub1)
				  aClass142_Sub4_Sub1_5733).tileW,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, (f - (float) argument_43_) * f_59_,
				 ((((GlTexture_Sub4_Sub1) class142_sub4_sub1)
				   .tileH)
				  - f_60_ * ((float) -argument_44_ + f_58_)));
	OpenGL.glVertex2f(f, f_58_);
	OpenGL.glMultiTexCoord2f
	    (33984, ((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).tileW,
	     ((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).tileH);
	OpenGL.glMultiTexCoord2f
	    (33985, ((float) -argument_43_ + argument_37_) * f_59_,
	     (-((argument_38_ - (float) argument_44_) * f_60_)
	      + ((GlTexture_Sub4_Sub1) class142_sub4_sub1).tileH));
	OpenGL.glVertex2f(argument_37_, argument_38_);
	OpenGL.glEnd();
	aClass_ha_Sub3_5734.method2334(5890, 768, 0, 34192);
	aClass_ha_Sub3_5734.setCombineMode(0);
	aClass_ha_Sub3_5734.bind(null);
	aClass_ha_Sub3_5734.setActiveTextureUnit(0);
    }
    
    final void method4003(int argument_61_, int argument_62_,
			  int argument_63_) {
	OpenGL.glPixelTransferf(3348, 0.5F);
	OpenGL.glPixelTransferf(3349, 0.499F);
	OpenGL.glPixelTransferf(3352, 0.5F);
	OpenGL.glPixelTransferf(3353, 0.499F);
	OpenGL.glPixelTransferf(3354, 0.5F);
	OpenGL.glPixelTransferf(3355, 0.499F);
	aClass142_Sub4_Sub1_5732
	    = (Class353_Sub1.method3895
	       (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).anInt6545,
		aClass_ha_Sub3_5734, 34037, argument_61_, argument_62_,
		((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).anInt6552));
	anInt5730 = argument_63_;
	OpenGL.glPixelTransferf(3348, 1.0F);
	OpenGL.glPixelTransferf(3349, 0.0F);
	OpenGL.glPixelTransferf(3352, 1.0F);
	OpenGL.glPixelTransferf(3353, 0.0F);
	OpenGL.glPixelTransferf(3354, 1.0F);
	OpenGL.glPixelTransferf(3355, 0.0F);
    }
    
    private final void method4039(int argument_64_, int argument_65_,
				  int argument_66_, int argument_67_,
				  int[] argument_68_, int argument_69_,
				  int argument_70_) {
	aClass142_Sub4_Sub1_5733.method2505(argument_68_, true, argument_65_,
					    73, argument_69_, argument_67_,
					    argument_70_, argument_66_,
					    argument_64_);
    }
    
    static final short[] method4040(int argument, short[] argument_71_,
				    int argument_72_) {
	short[] anLocalInts = new short[argument_72_];
	JagStrings.memcpy(argument_71_, 0, anLocalInts, argument, argument_72_);
	return anLocalInts;
    }
    
    final int method4018() {
	return (anInt5729
		+ (anInt5735 + (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
				.anInt6545)));
    }
    
    final void method4007(int argument_73_, int argument_74_,
			  Class_aa argument_75_, int argument_76_,
			  int argument_77_) {
	Class_aa_Sub1 class_aa_sub1 = (Class_aa_Sub1) argument_75_;
	GlTexture_Sub4_Sub1 class142_sub4_sub1
	    = ((Class_aa_Sub1) class_aa_sub1).aClass142_Sub4_Sub1_3746;
	aClass142_Sub4_Sub1_5733.setLinearMagnification(false);
	aClass_ha_Sub3_5734.method2296();
	aClass_ha_Sub3_5734.bindTexture(aClass142_Sub4_Sub1_5733);
	aClass_ha_Sub3_5734.setCombineMode(1);
	aClass_ha_Sub3_5734.setActiveTextureUnit(1);
	aClass_ha_Sub3_5734.bindTexture(class142_sub4_sub1);
	aClass_ha_Sub3_5734.setCombineModes(8448, 7681);
	aClass_ha_Sub3_5734.method2334(34168, 768, 0, 34192);
	aClass_ha_Sub3_5734.setBlendingConfiguration(1);
	argument_74_ += anInt5735;
	argument_73_ += anInt5731;
	int anLocalInt
	    = (argument_73_
	       + ((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).anInt6552);
	int anLocalInt_78_
	    = (argument_74_
	       + ((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).anInt6545);
	float f
	    = (((GlTexture_Sub4_Sub1) class142_sub4_sub1).tileW
	       / (float) ((GlTexture_Sub4_Sub1) class142_sub4_sub1).anInt6552);
	float f_79_
	    = (((GlTexture_Sub4_Sub1) class142_sub4_sub1).tileH
	       / (float) ((GlTexture_Sub4_Sub1) class142_sub4_sub1).anInt6545);
	float f_80_ = f * (float) (-argument_76_ + argument_73_);
	float f_81_ = f * (float) (anLocalInt - argument_76_);
	float f_82_ = (((GlTexture_Sub4_Sub1) class142_sub4_sub1).tileH
		       - (float) (argument_74_ - argument_77_) * f_79_);
	float f_83_ = (((GlTexture_Sub4_Sub1) class142_sub4_sub1).tileH
		       - (float) (-argument_77_ + anLocalInt_78_) * f_79_);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((GlTexture_Sub4_Sub1)
				  aClass142_Sub4_Sub1_5733).tileH);
	OpenGL.glMultiTexCoord2f(33985, f_80_, f_82_);
	OpenGL.glVertex2i(argument_73_, argument_74_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_80_, f_83_);
	OpenGL.glVertex2i(argument_73_,
			  (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			   .anInt6545) + argument_74_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((GlTexture_Sub4_Sub1)
				  aClass142_Sub4_Sub1_5733).tileW,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_81_, f_83_);
	OpenGL.glVertex2i((((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			   .anInt6552) + argument_73_,
			  (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			   .anInt6545) + argument_74_);
	OpenGL.glMultiTexCoord2f
	    (33984, ((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).tileW,
	     ((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).tileH);
	OpenGL.glMultiTexCoord2f(33985, f_81_, f_82_);
	OpenGL.glVertex2i((((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			   .anInt6552) + argument_73_,
			  argument_74_);
	OpenGL.glEnd();
	aClass_ha_Sub3_5734.method2334(5890, 768, 0, 34192);
	aClass_ha_Sub3_5734.setCombineMode(0);
	aClass_ha_Sub3_5734.bind(null);
	aClass_ha_Sub3_5734.setActiveTextureUnit(0);
    }
    
    final void method4002(int argument_84_, int argument_85_, int argument_86_,
			  int argument_87_, int argument_88_, int argument_89_,
			  int argument_90_) {
	int anLocalInt = argument_84_ + argument_86_;
	aClass142_Sub4_Sub1_5733.setLinearMagnification(false);
	int anLocalInt_91_ = argument_85_ + argument_87_;
	aClass_ha_Sub3_5734.method2296();
	aClass_ha_Sub3_5734.bindTexture(aClass142_Sub4_Sub1_5733);
	aClass_ha_Sub3_5734.setBlendingConfiguration(argument_90_);
	aClass_ha_Sub3_5734.setCombineMode(argument_88_);
	OpenGL.glColor4ub((byte) (argument_89_ >> 16),
			  (byte) (argument_89_ >> 8), (byte) argument_89_,
			  (byte) (argument_89_ >> 24));
	if (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).aBoolean6547
	    && !aBoolean5727) {
	    float f
		= ((float) argument_87_
		   * ((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).tileH
		   / (float) (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			      .anInt6545));
	    float f_92_
		= ((float) argument_86_
		   * ((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).tileW
		   / (float) (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			      .anInt6552));
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, f);
	    OpenGL.glVertex2i(argument_84_, argument_85_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(argument_84_, anLocalInt_91_);
	    OpenGL.glTexCoord2f(f_92_, 0.0F);
	    OpenGL.glVertex2i(anLocalInt, anLocalInt_91_);
	    OpenGL.glTexCoord2f(f_92_, f);
	    OpenGL.glVertex2i(anLocalInt, argument_85_);
	    OpenGL.glEnd();
	} else {
	    OpenGL.glPushMatrix();
	    OpenGL.glTranslatef((float) anInt5731, (float) anInt5735, 0.0F);
	    int anLocalInt_93_ = getWidth();
	    int anLocalInt_94_ = method4018();
	    int anLocalInt_95_
		= (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).anInt6545
		   + argument_85_);
	    OpenGL.glBegin(7);
	    int anLocalInt_96_ = argument_85_;
	    while (anLocalInt_91_ >= anLocalInt_95_) {
		int anLocalInt_97_
		    = ((((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			.anInt6552)
		       + argument_84_);
		int anLocalInt_98_ = argument_84_;
		while (anLocalInt_97_ <= anLocalInt) {
		    OpenGL.glTexCoord2f(0.0F,
					((GlTexture_Sub4_Sub1)
					 aClass142_Sub4_Sub1_5733).tileH);
		    OpenGL.glVertex2i(anLocalInt_98_, anLocalInt_96_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(anLocalInt_98_, anLocalInt_95_);
		    OpenGL.glTexCoord2f(((GlTexture_Sub4_Sub1)
					 aClass142_Sub4_Sub1_5733).tileW,
					0.0F);
		    OpenGL.glVertex2i(anLocalInt_97_, anLocalInt_95_);
		    OpenGL.glTexCoord2f(((GlTexture_Sub4_Sub1)
					 aClass142_Sub4_Sub1_5733).tileW,
					((GlTexture_Sub4_Sub1)
					 aClass142_Sub4_Sub1_5733).tileH);
		    OpenGL.glVertex2i(anLocalInt_97_, anLocalInt_96_);
		    anLocalInt_97_ += anLocalInt_93_;
		    anLocalInt_98_ += anLocalInt_93_;
		}
		if (anLocalInt_98_ < anLocalInt) {
		    float f = ((((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
				.tileW)
			       * (float) (anLocalInt - anLocalInt_98_)
			       / (float) ((GlTexture_Sub4_Sub1)
					  aClass142_Sub4_Sub1_5733).anInt6552);
		    OpenGL.glTexCoord2f(0.0F,
					((GlTexture_Sub4_Sub1)
					 aClass142_Sub4_Sub1_5733).tileH);
		    OpenGL.glVertex2i(anLocalInt_98_, anLocalInt_96_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(anLocalInt_98_, anLocalInt_95_);
		    OpenGL.glTexCoord2f(f, 0.0F);
		    OpenGL.glVertex2i(anLocalInt, anLocalInt_95_);
		    OpenGL.glTexCoord2f(f,
					((GlTexture_Sub4_Sub1)
					 aClass142_Sub4_Sub1_5733).tileH);
		    OpenGL.glVertex2i(anLocalInt, anLocalInt_96_);
		}
		anLocalInt_95_ += anLocalInt_94_;
		anLocalInt_96_ += anLocalInt_94_;
	    }
	    if (anLocalInt_91_ > anLocalInt_96_) {
		float f = ((float) (anLocalInt_96_
				    - (anLocalInt_91_
				       - ((GlTexture_Sub4_Sub1)
					  aClass142_Sub4_Sub1_5733).anInt6545))
			   * (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			      .tileH)
			   / (float) ((GlTexture_Sub4_Sub1)
				      aClass142_Sub4_Sub1_5733).anInt6545);
		int anLocalInt_99_
		    = (argument_84_
		       + (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			  .anInt6552));
		int anLocalInt_100_ = argument_84_;
		while (anLocalInt >= anLocalInt_99_) {
		    OpenGL.glTexCoord2f(0.0F,
					((GlTexture_Sub4_Sub1)
					 aClass142_Sub4_Sub1_5733).tileH);
		    OpenGL.glVertex2i(anLocalInt_100_, anLocalInt_96_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(anLocalInt_100_, anLocalInt_91_);
		    OpenGL.glTexCoord2f(((GlTexture_Sub4_Sub1)
					 aClass142_Sub4_Sub1_5733).tileW,
					f);
		    OpenGL.glVertex2i(anLocalInt_99_, anLocalInt_91_);
		    OpenGL.glTexCoord2f(((GlTexture_Sub4_Sub1)
					 aClass142_Sub4_Sub1_5733).tileW,
					((GlTexture_Sub4_Sub1)
					 aClass142_Sub4_Sub1_5733).tileH);
		    OpenGL.glVertex2i(anLocalInt_99_, anLocalInt_96_);
		    anLocalInt_99_ += anLocalInt_93_;
		    anLocalInt_100_ += anLocalInt_93_;
		}
		if (anLocalInt > anLocalInt_100_) {
		    float f_101_
			= ((((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			    .tileW)
			   * (float) (-anLocalInt_100_ + anLocalInt)
			   / (float) ((GlTexture_Sub4_Sub1)
				      aClass142_Sub4_Sub1_5733).anInt6552);
		    OpenGL.glTexCoord2f(0.0F,
					((GlTexture_Sub4_Sub1)
					 aClass142_Sub4_Sub1_5733).tileH);
		    OpenGL.glVertex2i(anLocalInt_100_, anLocalInt_96_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(anLocalInt_100_, anLocalInt_91_);
		    OpenGL.glTexCoord2f(f_101_, f);
		    OpenGL.glVertex2i(anLocalInt, anLocalInt_91_);
		    OpenGL.glTexCoord2f(f_101_,
					((GlTexture_Sub4_Sub1)
					 aClass142_Sub4_Sub1_5733).tileH);
		    OpenGL.glVertex2i(anLocalInt, anLocalInt_96_);
		}
	    }
	    OpenGL.glEnd();
	    OpenGL.glPopMatrix();
	}
    }
    
    final void method4004(int argument_102_, int argument_103_,
			  int argument_104_, int argument_105_,
			  int argument_106_) {
	aClass142_Sub4_Sub1_5733.setLinearMagnification(false);
	aClass_ha_Sub3_5734.method2296();
	aClass_ha_Sub3_5734.setBlendingConfiguration(argument_106_);
	OpenGL.glColor4ub((byte) (argument_105_ >> 16),
			  (byte) (argument_105_ >> 8), (byte) argument_105_,
			  (byte) (argument_105_ >> 24));
	argument_103_ += anInt5735;
	argument_102_ += anInt5731;
	if (aClass142_Sub4_Sub1_5732 == null) {
	    aClass_ha_Sub3_5734.bindTexture(aClass142_Sub4_Sub1_5733);
	    aClass_ha_Sub3_5734.setCombineMode(argument_104_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, ((GlTexture_Sub4_Sub1)
				       aClass142_Sub4_Sub1_5733).tileH);
	    OpenGL.glVertex2i(argument_102_, argument_103_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(argument_102_,
			      (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			       .anInt6545) + argument_103_);
	    OpenGL.glTexCoord2f(((GlTexture_Sub4_Sub1)
				 aClass142_Sub4_Sub1_5733).tileW,
				0.0F);
	    OpenGL.glVertex2i(argument_102_ + (((GlTexture_Sub4_Sub1)
						aClass142_Sub4_Sub1_5733)
					       .anInt6552),
			      argument_103_ + (((GlTexture_Sub4_Sub1)
						aClass142_Sub4_Sub1_5733)
					       .anInt6545));
	    OpenGL.glTexCoord2f
		(((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).tileW,
		 ((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).tileH);
	    OpenGL.glVertex2i(argument_102_ + (((GlTexture_Sub4_Sub1)
						aClass142_Sub4_Sub1_5733)
					       .anInt6552),
			      argument_103_);
	    OpenGL.glEnd();
	} else {
	    method4037(argument_104_, (byte) 122);
	    aClass142_Sub4_Sub1_5732.setLinearMagnification(false);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     ((GlTexture_Sub4_Sub1)
				      aClass142_Sub4_Sub1_5733).tileH);
	    OpenGL.glTexCoord2f(0.0F, ((GlTexture_Sub4_Sub1)
				       aClass142_Sub4_Sub1_5733).tileH);
	    OpenGL.glVertex2i(argument_102_, argument_103_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(argument_102_,
			      (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			       .anInt6545) + argument_103_);
	    OpenGL.glMultiTexCoord2f(33985,
				     ((GlTexture_Sub4_Sub1)
				      aClass142_Sub4_Sub1_5733).tileW,
				     0.0F);
	    OpenGL.glTexCoord2f(((GlTexture_Sub4_Sub1)
				 aClass142_Sub4_Sub1_5733).tileW,
				0.0F);
	    OpenGL.glVertex2i((((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			       .anInt6552) + argument_102_,
			      argument_103_ + (((GlTexture_Sub4_Sub1)
						aClass142_Sub4_Sub1_5733)
					       .anInt6545));
	    OpenGL.glMultiTexCoord2f
		(33985,
		 ((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).tileW,
		 ((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).tileH);
	    OpenGL.glTexCoord2f
		(((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).tileW,
		 ((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).tileH);
	    OpenGL.glVertex2i((((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			       .anInt6552) + argument_102_,
			      argument_103_);
	    OpenGL.glEnd();
	    method4038((byte) -92);
	}
    }
    
    final void method4008(float argument_107_, float argument_108_,
			  float argument_109_, float argument_110_,
			  float argument_111_, float argument_112_,
			  int argument_113_, int argument_114_,
			  int argument_115_, int argument_116_) {
	if (aBoolean5727) {
	    float f = (float) getWidth();
	    float f_117_ = (float) method4018();
	    float f_118_ = (argument_109_ - argument_107_) / f;
	    float f_119_ = (argument_110_ - argument_108_) / f;
	    float f_120_ = (-argument_107_ + argument_111_) / f_117_;
	    float f_121_ = (-argument_108_ + argument_112_) / f_117_;
	    float f_122_ = f_120_ * (float) anInt5735;
	    float f_123_ = f_121_ * (float) anInt5735;
	    float f_124_ = f_118_ * (float) anInt5731;
	    float f_125_ = f_119_ * (float) anInt5731;
	    float f_126_ = (float) anInt5726 * -f_118_;
	    float f_127_ = (float) anInt5726 * -f_119_;
	    float f_128_ = -f_120_ * (float) anInt5729;
	    float f_129_ = (float) anInt5729 * -f_121_;
	    argument_107_ = argument_107_ + f_124_ + f_122_;
	    argument_108_ = argument_108_ + f_125_ + f_123_;
	    argument_111_ = argument_111_ + f_124_ + f_128_;
	    argument_110_ = f_123_ + (argument_110_ + f_127_);
	    argument_109_ = f_122_ + (argument_109_ + f_126_);
	    argument_112_ = f_129_ + (argument_112_ + f_125_);
	}
	float f = -argument_107_ + argument_109_ + argument_111_;
	aClass142_Sub4_Sub1_5733.setLinearMagnification((argument_116_ & 0x1) != 0);
	float f_130_ = -argument_108_ + argument_112_ + argument_110_;
	aClass_ha_Sub3_5734.method2296();
	aClass_ha_Sub3_5734.bindTexture(aClass142_Sub4_Sub1_5733);
	aClass_ha_Sub3_5734.setBlendingConfiguration(argument_115_);
	aClass_ha_Sub3_5734.setCombineMode(argument_113_);
	OpenGL.glColor4ub((byte) (argument_114_ >> 16),
			  (byte) (argument_114_ >> 8), (byte) argument_114_,
			  (byte) (argument_114_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F,
			    (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			     .tileH));
	OpenGL.glVertex2f(argument_107_, argument_108_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(argument_111_, argument_112_);
	OpenGL.glTexCoord2f((((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			     .tileW),
			    0.0F);
	OpenGL.glVertex2f(f, f_130_);
	OpenGL.glTexCoord2f((((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			     .tileW),
			    (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733)
			     .tileH));
	OpenGL.glVertex2f(argument_109_, argument_110_);
	OpenGL.glEnd();
    }
    
    final int getWidth() {
	return (((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).anInt6552
		- (-anInt5731 - anInt5726));
    }
    
    static final boolean method4041(String argument, byte argument_131_) {
	return Node_Sub2.classTable.containsKey(argument);
    }
    
    final int method4019() {
	return ((GlTexture_Sub4_Sub1) aClass142_Sub4_Sub1_5733).anInt6552;
    }
    
    static final void method4042(byte argument) {
	if (DoublyLinkedNode_Sub51_Sub12.anInt6286 != 0) {
	    if (Statics.aClass307_2632 != null) {
		Statics.aClass307_2632.method3601(2);
		Statics.aClass307_2632 = null;
	    }
	    Class126.method2407((byte) -109);
	    Class365.method3971(61);
	}
    }
    
    final void method4013(int argument_132_, int argument_133_,
			  int argument_134_, int argument_135_,
			  int argument_136_, int argument_137_) {
	if (((GlToolkit) aClass_ha_Sub3_5734).isMacintosh) {
	    int[] anLocalInts
		= aClass_ha_Sub3_5734.getPixels(argument_136_, argument_137_, argument_134_, argument_135_);
	    if (anLocalInts != null) {
		for (int anLocalInt = 0; anLocalInts.length > anLocalInt;
		     anLocalInt++)
		    anLocalInts[anLocalInt]
			= MathStatics.OR(anLocalInts[anLocalInt], -16777216);
		method4039(argument_132_, argument_133_, argument_134_,
			   argument_135_, anLocalInts, 0, argument_134_);
	    }
	} else
	    aClass142_Sub4_Sub1_5733.method2504(argument_136_, argument_133_, argument_134_,
						argument_135_, argument_137_,
						argument_132_);
    }
    
    final void method4017(int[] argument_138_) {
	argument_138_[3] = anInt5729;
	argument_138_[2] = anInt5726;
	argument_138_[0] = anInt5731;
	argument_138_[1] = anInt5735;
    }
    
    Class368_Sub3(GlToolkit argument_139_, int argument_140_,
		  int argument_141_, boolean argument_142_) {
	aBoolean5727 = false;
	aClass_ha_Sub3_5734 = argument_139_;
	aClass142_Sub4_Sub1_5733
	    = Class_aa_Sub3.method168(!argument_142_ ? 6407 : 6408,
				      argument_139_, argument_141_,
				      argument_140_, (byte) 127);
    }
    
    Class368_Sub3(GlToolkit argument_143_, int argument_144_,
		  int argument_145_, int argument_146_, int argument_147_) {
	aBoolean5727 = false;
	aClass_ha_Sub3_5734 = argument_143_;
	aClass142_Sub4_Sub1_5733
	    = Class353_Sub1.method3895(argument_147_, argument_143_, 34037,
				       argument_144_, argument_145_,
				       argument_146_);
    }
    
    Class368_Sub3(GlToolkit argument_148_, int argument_149_,
		  int argument_150_, int[] argument_151_, int argument_152_,
		  int argument_153_) {
	aBoolean5727 = false;
	aClass_ha_Sub3_5734 = argument_148_;
	aClass142_Sub4_Sub1_5733
	    = Class274.method3392(argument_149_, argument_151_, false,
				  argument_153_, argument_150_, argument_148_,
				  argument_152_, (byte) -98);
    }
}
