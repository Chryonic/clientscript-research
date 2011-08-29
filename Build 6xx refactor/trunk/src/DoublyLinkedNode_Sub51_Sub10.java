/* Class59_Sub51_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

import jaggl.OpenGL;

final class DoublyLinkedNode_Sub51_Sub10 extends DoublyLinkedNode implements FramebufferDetachable
{
    private GlToolkit aClass_ha_Sub3_5584;
    static int anInt5585;
    private int anInt5586;
    static Class166 aClass166_5587 = new Class166(17, -1);
    private int anInt5588 = -1;
    private int anInt5589;
    int anInt5590;
    int anInt5591;
    static int anInt5592;
    private int anInt5593;
    private int anInt5594 = -1;
    
    public static void method1241(byte argument) {
	aClass166_5587 = null;
    }
    
    static final void method1242(int argument, boolean argument_0_,
				 Node_Sub2 argument_1_) {
	if (!((Node_Sub2) argument_1_).aBoolean3873) {
	    if (((Node_Sub2) argument_1_).aBoolean3875
		&& ((Node_Sub2) argument_1_).anInt3883 >= 1
		&& ((Node_Sub2) argument_1_).anInt3882 >= 1
		&& (((Node_Sub2) argument_1_).anInt3883
		    <= MapRelated.mapWidth - 2)
		&& (((Node_Sub2) argument_1_).anInt3882
		    <= MapRelated.mapDepth - 2)
		&& (((Node_Sub2) argument_1_).anInt3874 < 0
		    || Class127.method2417(75,
					   (((Node_Sub2) argument_1_)
					    .anInt3874),
					   (((Node_Sub2) argument_1_)
					    .anInt3884)))) {
		if (argument_0_)
		    Statics.method385(((Node_Sub2) argument_1_).anInt3881, ((Node_Sub2) argument_1_).anInt3882, (((Node_Sub2) argument_1_).aClass120_3877), ((Node_Sub2) argument_1_).anInt3871, ((Node_Sub2) argument_1_).anInt3883, 1);
		else
		    Class307.method3600(((Node_Sub2) argument_1_).anInt3882,
					((Node_Sub2) argument_1_).anInt3884,
					((Node_Sub2) argument_1_).anInt3876,
					((Node_Sub2) argument_1_).anInt3874,
					argument ^ 0x5aa3,
					((Node_Sub2) argument_1_).anInt3883,
					-1,
					((Node_Sub2) argument_1_).anInt3881,
					(((Node_Sub2) argument_1_)
					 .anInt3871));
		((Node_Sub2) argument_1_).aBoolean3875 = false;
		if (!argument_0_
		    && (((Node_Sub2) argument_1_).anInt3880
			== ((Node_Sub2) argument_1_).anInt3874)
		    && ((Node_Sub2) argument_1_).anInt3880 == -1)
		    argument_1_.unlink();
		else if (!argument_0_
			 && (((Node_Sub2) argument_1_).anInt3880
			     == ((Node_Sub2) argument_1_).anInt3874)
			 && (((Node_Sub2) argument_1_).anInt3876
			     == ((Node_Sub2) argument_1_).anInt3872)
			 && (((Node_Sub2) argument_1_).anInt3884
			     == ((Node_Sub2) argument_1_).anInt3878))
		    argument_1_.unlink();
	    }
	} else if (((Node_Sub2) argument_1_).anInt3880 < 0
		   || Class127.method2417(-128,
					  (((Node_Sub2) argument_1_)
					   .anInt3880),
					  (((Node_Sub2) argument_1_)
					   .anInt3878))) {
	    if (argument_0_)
		Statics.method385(((Node_Sub2) argument_1_).anInt3881, ((Node_Sub2) argument_1_).anInt3882, null, ((Node_Sub2) argument_1_).anInt3871, ((Node_Sub2) argument_1_).anInt3883, 1);
	    else
		Class307.method3600(((Node_Sub2) argument_1_).anInt3882,
				    ((Node_Sub2) argument_1_).anInt3878,
				    ((Node_Sub2) argument_1_).anInt3872,
				    ((Node_Sub2) argument_1_).anInt3880, -1,
				    ((Node_Sub2) argument_1_).anInt3883, -1,
				    ((Node_Sub2) argument_1_).anInt3881,
				    ((Node_Sub2) argument_1_).anInt3871);
	    argument_1_.unlink();
	}
	if (argument != -23204)
	    anInt5592 = 36;
    }
    
    final void method1243(int argument_2_, byte argument_3_, int argument_4_) {
	OpenGL.glFramebufferRenderbufferEXT(argument_2_, argument_4_, 36161,
					    anInt5593);
	anInt5594 = argument_4_;
	anInt5588 = argument_2_;
    }
    
    final void method1244(boolean argument_5_) {
	if (anInt5593 > 0) {
	    aClass_ha_Sub3_5584.requestRenderBufferDeletion(anInt5586, anInt5593);
	    anInt5593 = 0;
	}
    }
    
    static final Class368 method1245(byte[] data) {
	if (data == null)
	    throw new RuntimeException("");
	for (;;) {
	    try {
		Image image = Toolkit.getDefaultToolkit().createImage(data);
		MediaTracker mediatracker = new MediaTracker(client.clientInstance);
		mediatracker.addImage(image, 0);
		mediatracker.waitForAll();
		int width = image.getWidth(client.clientInstance);
		int height = image.getHeight(client.clientInstance);
		if (mediatracker.isErrorAny() || width < 0
		    || height < 0)
		    throw new RuntimeException("");
		int[] pixels = new int[height * width];
		PixelGrabber pixelgrabber
		    = new PixelGrabber(image, 0, 0, width, height,
				       pixels, 0, width);
		pixelgrabber.grabPixels();
		return Class389.aGraphicsToolkit3281.method2047(width,
							 pixels, 0,
							 height,
							 width);
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
    }
    
    public final void detachFBO(int argument_8_) {
	OpenGL.glFramebufferRenderbufferEXT(anInt5588, anInt5594, 36161, 0);
	anInt5594 = -1;
	anInt5588 = argument_8_;
    }
    
    protected final void finalize() throws Throwable {
	method1244(true);
	super.finalize();
    }
    
    DoublyLinkedNode_Sub51_Sub10(GlToolkit argument_9_, int argument_10_, int argument_11_, int argument_12_) {
	((DoublyLinkedNode_Sub51_Sub10) this).anInt5591 = argument_11_;
	aClass_ha_Sub3_5584 = argument_9_;
	anInt5589 = argument_10_;
	((DoublyLinkedNode_Sub51_Sub10) this).anInt5590 = argument_12_;
	OpenGL.glGenRenderbuffersEXT(1, Class256_Sub2.anIntArray5626, 0);
	anInt5593 = Class256_Sub2.anIntArray5626[0];
	OpenGL.glBindRenderbufferEXT(36161, anInt5593);
	OpenGL.glRenderbufferStorageEXT(36161, anInt5589,
					((DoublyLinkedNode_Sub51_Sub10) this).anInt5591,
					(((DoublyLinkedNode_Sub51_Sub10) this)
					 .anInt5590));
	anInt5586 = (((DoublyLinkedNode_Sub51_Sub10) this).anInt5591
		     * ((DoublyLinkedNode_Sub51_Sub10) this).anInt5590
		     * aClass_ha_Sub3_5584.sizeof(anInt5589));
    }
    
    DoublyLinkedNode_Sub51_Sub10(GlToolkit argument_13_, int argument_14_, int argument_15_, int argument_16_, int argument_17_) {
	((DoublyLinkedNode_Sub51_Sub10) this).anInt5591 = argument_15_;
	((DoublyLinkedNode_Sub51_Sub10) this).anInt5590 = argument_16_;
	aClass_ha_Sub3_5584 = argument_13_;
	anInt5589 = argument_14_;
	OpenGL.glGenRenderbuffersEXT(1, Class256_Sub2.anIntArray5626, 0);
	anInt5593 = Class256_Sub2.anIntArray5626[0];
	OpenGL.glBindRenderbufferEXT(36161, anInt5593);
	OpenGL.glRenderbufferStorageMultisampleEXT
	    (36161, argument_17_, anInt5589,
	     ((DoublyLinkedNode_Sub51_Sub10) this).anInt5591,
	     ((DoublyLinkedNode_Sub51_Sub10) this).anInt5590);
	anInt5586 = (((DoublyLinkedNode_Sub51_Sub10) this).anInt5590
		     * (((DoublyLinkedNode_Sub51_Sub10) this).anInt5591
			* aClass_ha_Sub3_5584.sizeof(anInt5589)));
    }
}
