/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class96
{
    private GlToolkit aClass_ha_Sub3_724;
    private int anInt725 = 1;
    private int anInt726 = 0;
    private GlExtFramebuffer aGlExtFramebuffer_727;
    private int anInt728 = 1;
    private boolean aBoolean729;
    private CyclicLinkedList aCyclicLinkedList_730;
    private GlExtFramebuffer aGlExtFramebuffer_731;
    private int anInt732 = 0;
    private GlExtFramebuffer aGlExtFramebuffer_733;
    private DoublyLinkedNode_Sub51_Sub10 aClass59_Sub51_Sub10_734;
    private int anInt735;
    private boolean aBoolean736;
    private boolean aBoolean737;
    private DoublyLinkedNode_Sub51_Sub10 aClass59_Sub51_Sub10_738;
    private int anInt739;
    private boolean aBoolean740;
    static Class166 aClass166_741 = new Class166(75, 6);
    private GlTexture_Sub4 aClass142_Sub4_742;
    private boolean aBoolean743;
    private GlTexture_Sub4[] aClass142_Sub4Array744;
    private boolean aBoolean745;
    static Class44 aClass44_746 = new Class44();
    static int anInt748 = 0;
    static int anInt749;
    
    final boolean method1705(Node_Sub36 argument_0_, byte argument_1_) {
	if (aGlExtFramebuffer_727 != null) {
	    if (argument_0_.method1052(256)
		|| argument_0_.method1044(argument_1_ + 9630)) {
		aCyclicLinkedList_730.add(argument_0_);
		method1714(10);
		if (method1709((byte) 31)) {
		    if (anInt728 != -1 && anInt725 != -1)
			argument_0_.method1045(argument_1_ ^ 0x7b, anInt725,
					       anInt728);
		    ((Node_Sub36) argument_0_).aBoolean4163 = true;
		    return true;
		}
	    }
	    method1715(argument_0_, (byte) -115);
	}
	if (argument_1_ != 122)
	    return false;
	return false;
    }
    
    final void method1706(int argument_2_) {
	aClass59_Sub51_Sub10_738 = null;
	aClass142_Sub4Array744 = null;
	aGlExtFramebuffer_727 = aGlExtFramebuffer_731 = aGlExtFramebuffer_733 = null;
	aClass59_Sub51_Sub10_734 = null;
	aClass142_Sub4_742 = null;
	if (!aCyclicLinkedList_730.isEmpty()) {
	    for (Node node = aCyclicLinkedList_730.getFirst();
		 node != ((CyclicLinkedList) aCyclicLinkedList_730).rootNode;
		 node = ((Node) node).next)
		((Node_Sub36) node).method1051(88);
	}
	anInt728 = anInt725 = 1;
    }
    
    final boolean method1707(int argument_3_, int argument_4_, int argument_5_,
			     boolean argument_6_, int argument_7_) {
	if (aGlExtFramebuffer_727 == null || aCyclicLinkedList_730.isEmpty())
	    return false;
	if (anInt728 != argument_4_ || argument_7_ != anInt725) {
	    anInt725 = argument_7_;
	    anInt728 = argument_4_;
	    for (Node node = aCyclicLinkedList_730.getFirst();
		 ((CyclicLinkedList) aCyclicLinkedList_730).rootNode != node;
		 node = ((Node) node).next)
		((Node_Sub36) node).method1045(1, anInt725, anInt728);
	    aBoolean743 = true;
	    aBoolean745 = true;
	    aBoolean736 = true;
	}
	if (method1709((byte) 31)) {
	    aBoolean729 = true;
	    anInt726 = argument_3_;
	    anInt732 = argument_5_;
	    aClass_ha_Sub3_724.method2331(aGlExtFramebuffer_727);
	    aGlExtFramebuffer_727.draw(0);
	    aClass_ha_Sub3_724.setViewport(-anInt726, (-((GlToolkit) aClass_ha_Sub3_724).viewportH + (anInt725 + anInt732)));
	    return true;
	}
	return false;
    }
    
    final void method1708(int argument_8_) {
	if (aBoolean729) {
	    if (aGlExtFramebuffer_731 != null) {
		aClass_ha_Sub3_724.method2348(aGlExtFramebuffer_731, true);
		int anLocalInt = 16384;
		aClass_ha_Sub3_724.method2329((byte) 126, aGlExtFramebuffer_733);
		aGlExtFramebuffer_731.method2959((byte) -126, 0);
		aGlExtFramebuffer_733.draw(0);
		if (aBoolean740)
		    anLocalInt |= 0x100;
		OpenGL.glBlitFramebufferEXT(0, 0, anInt728, anInt725, 0, 0,
					    anInt728, anInt725, anLocalInt,
					    9728);
		aClass_ha_Sub3_724.method2347(argument_8_ + 2, aGlExtFramebuffer_731);
		aClass_ha_Sub3_724.method2309(aGlExtFramebuffer_733, -1);
	    }
	    aClass_ha_Sub3_724.method2296();
	    aClass_ha_Sub3_724.setBlendingConfiguration(0);
	    aClass_ha_Sub3_724.setCombineMode(1);
	    aClass_ha_Sub3_724.clearClip();
	    int anLocalInt = 0;
	    int anLocalInt_9_ = 1;
	    Node_Sub36 class59_sub36;
	    for (Node_Sub36 class59_sub36_10_
		     = (Node_Sub36) aCyclicLinkedList_730.getFirst();
		 class59_sub36_10_ != null;
		 class59_sub36_10_ = class59_sub36) {
		class59_sub36 = (Node_Sub36) aCyclicLinkedList_730.getNext();
		int anLocalInt_11_
		    = class59_sub36_10_.method1047(argument_8_ + 121);
		for (int anLocalInt_12_ = 0; anLocalInt_12_ < anLocalInt_11_;
		     anLocalInt_12_++) {
		    class59_sub36_10_.method1043((byte) 94, aClass142_Sub4_742,
						 anLocalInt_12_,
						 (aClass142_Sub4Array744
						  [anLocalInt]));
		    if (class59_sub36 != null
			|| anLocalInt_12_ != anLocalInt_11_ - 1) {
			aGlExtFramebuffer_733.draw(--anLocalInt_9_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, (float) anInt725);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glVertex2i(0, anInt725);
			OpenGL.glTexCoord2f((float) anInt728, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
			OpenGL.glVertex2i(anInt728, anInt725);
			OpenGL.glTexCoord2f((float) anInt728,
					    (float) anInt725);
			OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
			OpenGL.glVertex2i(anInt728, 0);
			OpenGL.glEnd();
		    } else {
			aClass_ha_Sub3_724.detachFBO(aGlExtFramebuffer_733, false);
			aClass_ha_Sub3_724.setViewport(0, 0);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, (float) anInt725);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
			OpenGL.glVertex2i(anInt726, anInt732);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glVertex2i(anInt726, anInt732 + anInt725);
			OpenGL.glTexCoord2f((float) anInt728, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
			OpenGL.glVertex2i(anInt726 + anInt728,
					  anInt732 + anInt725);
			OpenGL.glTexCoord2f((float) anInt728,
					    (float) anInt725);
			OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
			OpenGL.glVertex2i(anInt726 + anInt728, anInt732);
			OpenGL.glEnd();
		    }
		    anLocalInt_9_ = anLocalInt_9_ + 1 & 0x1;
		    anLocalInt = anLocalInt + 1 & 0x1;
		    class59_sub36_10_.method1048(anLocalInt_12_, (byte) -128);
		}
	    }
	    aBoolean729 = false;
	}
    }
    
    private final boolean method1709(byte argument_13_) {
	if (argument_13_ != 31)
	    method1711(-45, 95, null, -28, true, -102, null, 18, -12, -74,
		       null, -112, -94, 9, 9);
	if (aBoolean745) {
	    if (aClass59_Sub51_Sub10_738 != null) {
		aClass59_Sub51_Sub10_738.method1244(true);
		aClass59_Sub51_Sub10_738 = null;
	    }
	    if (aClass142_Sub4_742 != null) {
		aClass142_Sub4_742.deleteFromServer();
		aClass142_Sub4_742 = null;
	    }
	    if (aGlExtFramebuffer_731 != null)
		aClass59_Sub51_Sub10_738
		    = new DoublyLinkedNode_Sub51_Sub10(aClass_ha_Sub3_724, 6402,
					      anInt728, anInt725,
					      ((GlToolkit)
					       aClass_ha_Sub3_724).anInt4840);
	    if (!aBoolean740) {
		if (aClass59_Sub51_Sub10_738 == null)
		    aClass59_Sub51_Sub10_738
			= new DoublyLinkedNode_Sub51_Sub10(aClass_ha_Sub3_724, 6402,
						  anInt728, anInt725);
	    } else
		aClass142_Sub4_742
		    = new GlTexture_Sub4(aClass_ha_Sub3_724, 34037, 6402,
					anInt728, anInt725);
	    aBoolean736 = true;
	    aBoolean737 = true;
	    aBoolean745 = false;
	}
	if (aBoolean743) {
	    if (aClass59_Sub51_Sub10_734 != null) {
		aClass59_Sub51_Sub10_734.method1244(true);
		aClass59_Sub51_Sub10_734 = null;
	    }
	    if (aClass142_Sub4Array744[0] != null) {
		aClass142_Sub4Array744[0].deleteFromServer();
		aClass142_Sub4Array744[0] = null;
	    }
	    if (aClass142_Sub4Array744[1] != null) {
		aClass142_Sub4Array744[1].deleteFromServer();
		aClass142_Sub4Array744[1] = null;
	    }
	    if (aGlExtFramebuffer_731 != null)
		aClass59_Sub51_Sub10_734
		    = new DoublyLinkedNode_Sub51_Sub10(aClass_ha_Sub3_724, anInt735,
					      anInt728, anInt725,
					      ((GlToolkit)
					       aClass_ha_Sub3_724).anInt4840);
	    aClass142_Sub4Array744[0]
		= new GlTexture_Sub4(aClass_ha_Sub3_724, 34037, anInt735,
				    anInt728, anInt725);
	    aClass142_Sub4Array744[1]
		= anInt739 > 1 ? new GlTexture_Sub4(aClass_ha_Sub3_724, 34037,
						   anInt735, anInt728,
						   anInt725) : null;
	    aBoolean736 = true;
	    aBoolean743 = false;
	    aBoolean737 = true;
	}
	if (aBoolean736) {
	    if (aGlExtFramebuffer_731 != null) {
		aClass_ha_Sub3_724.method2331(aGlExtFramebuffer_733);
		aGlExtFramebuffer_733.detachObject(0);
		aGlExtFramebuffer_733.detachObject(1);
		aGlExtFramebuffer_733.detachObject(8);
		aGlExtFramebuffer_733.method2962(0, aClass142_Sub4Array744[0]);
		if (anInt739 > 1)
		    aGlExtFramebuffer_733.method2962(1, aClass142_Sub4Array744[1]);
		if (aBoolean740)
		    aGlExtFramebuffer_733.method2962(8, aClass142_Sub4_742);
		aClass_ha_Sub3_724.detachFBO(aGlExtFramebuffer_733, false);
		aClass_ha_Sub3_724.method2331(aGlExtFramebuffer_731);
		aGlExtFramebuffer_731.detachObject(0);
		aGlExtFramebuffer_731.detachObject(8);
		aGlExtFramebuffer_731.method2967(aClass59_Sub51_Sub10_734, 0);
		aGlExtFramebuffer_731.method2967(aClass59_Sub51_Sub10_738, 8);
		aClass_ha_Sub3_724.detachFBO(aGlExtFramebuffer_731, false);
	    } else {
		aClass_ha_Sub3_724.method2331(aGlExtFramebuffer_733);
		aGlExtFramebuffer_733.detachObject(0);
		aGlExtFramebuffer_733.detachObject(1);
		aGlExtFramebuffer_733.detachObject(8);
		aGlExtFramebuffer_733.method2962(0, aClass142_Sub4Array744[0]);
		if (anInt739 > 1)
		    aGlExtFramebuffer_733.method2962(1, aClass142_Sub4Array744[1]);
		if (aBoolean740)
		    aGlExtFramebuffer_733.method2962(8, aClass142_Sub4_742);
		else
		    aGlExtFramebuffer_733.method2967(aClass59_Sub51_Sub10_738,
					     8);
		aClass_ha_Sub3_724.detachFBO(aGlExtFramebuffer_733, false);
	    }
	    aBoolean737 = true;
	    aBoolean736 = false;
	}
	if (aBoolean737) {
	    aClass_ha_Sub3_724.method2331(aGlExtFramebuffer_727);
	    aBoolean737 = !aGlExtFramebuffer_727.isComplete();
	    aClass_ha_Sub3_724.detachFBO(aGlExtFramebuffer_727, false);
	}
	if (aBoolean737)
	    return false;
	return true;
    }
    
    final boolean method1710(byte argument_14_) {
	if (aGlExtFramebuffer_727 == null)
	    return false;
	return true;
    }
    
    static int method1711
	(int argument, int argument_15_, int[] argument_16_, int argument_17_,
	 boolean argument_18_, int argument_19_, int[] argument_20_,
	 int argument_21_, int argument_22_, int argument_23_,
	 ClipMap argument_24_, int argument_25_, int argument_26_,
	 int argument_27_, int argument_28_) {
	for (int anLocalInt = 0; anLocalInt < 128; anLocalInt++) {
	    for (int anLocalInt_29_ = 0; anLocalInt_29_ < 128;
		 anLocalInt_29_++) {
		Class105.anIntArrayArray863[anLocalInt][anLocalInt_29_] = 0;
		Class60.anIntArrayArray432[anLocalInt][anLocalInt_29_]
		    = 99999999;
	    }
	}
	boolean anLocalBoolean;
	if (argument_15_ == 1)
	    anLocalBoolean
		= Class251.method3238((byte) -118, argument_25_, argument_24_,
				      argument_27_, argument_19_, argument_21_,
				      argument, argument_28_, argument_26_,
				      argument_17_, argument_22_);
	else if (argument_15_ == 2)
	    anLocalBoolean
		= Node_Sub31_Sub15.method916(argument_27_, argument_21_,
                argument_25_, argument_22_,
                argument_17_, argument,
                argument_28_, -2878,
                argument_19_, argument_24_,
                argument_26_);
	else
	    anLocalBoolean
		= dba_sub_772_Sub1.method1312(argument_21_, argument_28_,
					      argument, argument_26_,
					      argument_27_, argument_24_,
					      argument_17_, 0, argument_15_,
					      argument_19_, argument_22_,
					      argument_25_);
	int anLocalInt = argument_19_ - 64;
	int anLocalInt_30_ = argument_21_ - 64;
	int anLocalInt_31_ = MenuAction.anInt6278;
	int anLocalInt_32_ = dba_sub_772_Sub2.anInt6367;
	if (!anLocalBoolean)
	    return -1;
	if (anLocalInt_31_ == argument_19_ && anLocalInt_32_ == argument_21_)
	    return 0;
	int anLocalInt_33_ = 0;
	int anLocalInt_34_ = 94 / ((-16 - argument_23_) / 61);
	RuntimeException_Sub2.anIntArray3427[anLocalInt_33_] = anLocalInt_31_;
	Class275.anIntArray2203[anLocalInt_33_++] = anLocalInt_32_;
	int anLocalInt_36_;
	int anLocalInt_35_
	    = (anLocalInt_36_
	       = (Class105.anIntArrayArray863[-anLocalInt + anLocalInt_31_]
		  [anLocalInt_32_ - anLocalInt_30_]));
	while (anLocalInt_31_ != argument_19_
	       || argument_21_ != anLocalInt_32_) {
	    if (anLocalInt_35_ != anLocalInt_36_) {
		anLocalInt_36_ = anLocalInt_35_;
		RuntimeException_Sub2.anIntArray3427[anLocalInt_33_]
		    = anLocalInt_31_;
		Class275.anIntArray2203[anLocalInt_33_++] = anLocalInt_32_;
	    }
	    if ((anLocalInt_35_ & 0x1) == 0) {
		if ((anLocalInt_35_ & 0x4) != 0)
		    anLocalInt_32_--;
	    } else
		anLocalInt_32_++;
	    if ((anLocalInt_35_ & 0x2) != 0)
		anLocalInt_31_++;
	    else if ((anLocalInt_35_ & 0x8) != 0)
		anLocalInt_31_--;
	    anLocalInt_35_
		= (Class105.anIntArrayArray863[anLocalInt_31_ - anLocalInt]
		   [-anLocalInt_30_ + anLocalInt_32_]);
	}
	int anLocalInt_37_ = 0;
	while (anLocalInt_33_-- > 0) {
	    argument_20_[anLocalInt_37_]
		= RuntimeException_Sub2.anIntArray3427[anLocalInt_33_];
	    argument_16_[anLocalInt_37_++]
		= Class275.anIntArray2203[anLocalInt_33_];
	    if (argument_20_.length <= anLocalInt_37_)
		break;
	}
	return anLocalInt_37_;
    }

    public static void method1713(int argument) {
	aClass44_746 = null;
	client.fileStoreManager = null;
	aClass166_741 = null;
    }
    
    private final void method1714(int argument_39_) {
	boolean anLocalBoolean = false;
	int anLocalInt = 0;
	if (argument_39_ != 10)
	    anInt732 = -100;
	int anLocalInt_40_ = 0;
	for (Node_Sub36 class59_sub36
		 = (Node_Sub36) aCyclicLinkedList_730.getFirst();
	     class59_sub36 != null;
	     class59_sub36 = (Node_Sub36) aCyclicLinkedList_730.getNext()) {
	    int anLocalInt_41_ = class59_sub36.method1046(1);
	    if (anLocalInt < anLocalInt_41_)
		anLocalInt = anLocalInt_41_;
	    anLocalInt_40_ += class59_sub36.method1047(119);
	    anLocalBoolean |= class59_sub36.method1049(1);
	}
	int anLocalInt_42_;
	if (anLocalInt == 2)
	    anLocalInt_42_ = 34836;
	else if (anLocalInt != 1)
	    anLocalInt_42_ = 6408;
	else
	    anLocalInt_42_ = 34842;
	if (anLocalInt_42_ != anInt735) {
	    aBoolean743 = true;
	    anInt735 = anLocalInt_42_;
	}
	int anLocalInt_43_ = anInt739 > 2 ? 2 : anInt739;
	int anLocalInt_44_ = anLocalInt_40_ <= 2 ? anLocalInt_40_ : 2;
	if (anLocalInt_43_ != anLocalInt_44_)
	    aBoolean736 = aBoolean743 = true;
	if (aBoolean740 == !anLocalBoolean) {
	    aBoolean745 = true;
	    aBoolean740 = anLocalBoolean;
	}
	anInt739 = anLocalInt_40_;
    }
    
    final void method1715(Node_Sub36 argument_45_, byte argument_46_) {
	((Node_Sub36) argument_45_).aBoolean4163 = false;
	if (argument_46_ >= -14)
	    method1714(-127);
	argument_45_.method1051(-8);
	argument_45_.unlink();
	method1714(10);
    }
    
    Class96(GlToolkit argument_47_) {
	aCyclicLinkedList_730 = new CyclicLinkedList();
	aBoolean736 = true;
	aBoolean737 = true;
	aBoolean740 = false;
	anInt735 = -1;
	anInt739 = 0;
	aBoolean743 = true;
	aClass142_Sub4Array744 = new GlTexture_Sub4[2];
	aBoolean745 = true;
	aClass_ha_Sub3_724 = argument_47_;
	if (((GlToolkit) aClass_ha_Sub3_724).haveFBO
	    && ((GlToolkit) aClass_ha_Sub3_724).haveTextureRectangle) {
	    aGlExtFramebuffer_727 = aGlExtFramebuffer_733 = new GlExtFramebuffer(aClass_ha_Sub3_724);
	    if (((GlToolkit) aClass_ha_Sub3_724).anInt4840 > 1
		&& ((GlToolkit) aClass_ha_Sub3_724).haveFBBlit
		&& ((GlToolkit) aClass_ha_Sub3_724).haveFBMultisample)
		aGlExtFramebuffer_727 = aGlExtFramebuffer_731
		    = new GlExtFramebuffer(aClass_ha_Sub3_724);
	}
    }
}
