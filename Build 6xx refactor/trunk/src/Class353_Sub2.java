/* Class353_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class353_Sub2 extends Class353
{
    private boolean aBoolean5479 = false;
    static Class329 aClass329_5480 = new Class329(9, 19);
    private GlDrawingList aGlDrawingList_5481;
    static int[] anIntArray5482 = new int[3];
    static Node_Sub9_Sub3 aClass59_Sub9_Sub3_5483;
    
    static final void method3896(boolean argument) {
	int anLocalInt = 0;
	if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		.aClass62_Sub16_4308.method1421(109)
	    == 1) {
	    anLocalInt |= 0x1;
	    anLocalInt |= 0x10;
	    anLocalInt |= 0x20;
	    anLocalInt |= 0x2;
	    anLocalInt |= 0x4;
	}
	if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		.aClass62_Sub19_4323.method1432(28)
	    == 0)
	    anLocalInt |= 0x40;
	Statics.method1143((byte) -80, anLocalInt);
	Node_Sub31_Sub30.aClass257_5983.method3296(8, anLocalInt);
	Class253_Sub1_Sub1.aClass365_6632.method3981(anLocalInt, (byte) 114);
	DiskBackedCache.aClass26_2709.method344(anLocalInt, 100);
	Class194.aClass225_1414.method3049(anLocalInt, (byte) -111);
	Class84.method1619(anLocalInt, (byte) -66);
	Node_Sub6.method566((byte) -101, anLocalInt);
	Node_Sub47_Sub1.method1115(anLocalInt, 0);
	DoublyLinkedNodeP2_Sub2_Sub2_Sub2.method1815(anLocalInt, true);
	Class109_Sub1.method1985(-100);
    }
    
    final void method3891(int argument_0_) {
	if (aBoolean5479) {
	    aGlDrawingList_5481.call('\001');
	    ((Class353) this).toolkit.setActiveTextureUnit(1);
	    ((Class353) this).toolkit.bind(null);
	    ((Class353) this).toolkit.setActiveTextureUnit(0);
	} else
	    ((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 5890);
	((Class353) this).toolkit.setCombineModes(8448, 8448);
	aBoolean5479 = false;
	if (argument_0_ != -1756)
	    aClass59_Sub9_Sub3_5483 = null;
    }
    
    final void method3882(int argument_1_, GlTexture argument_2_,
			  int argument_3_) {
	((Class353) this).toolkit.bindTexture(argument_2_);
	if (argument_1_ != 9)
	    aClass329_5480 = null;
	((Class353) this).toolkit.setCombineMode(argument_3_);
    }
    
    Class353_Sub2(GlToolkit argument_4_) {
	super(argument_4_);
	if (((GlToolkit) argument_4_).haveTextureCubeMap) {
	    aGlDrawingList_5481 = new GlDrawingList(2);
	    aGlDrawingList_5481.newList(0);
	    ((Class353) this).toolkit.setActiveTextureUnit(1);
	    ((Class353) this).toolkit.setCombineModes(7681, 34165);
	    ((Class353) this).toolkit.method2334(34168, 770, 2,
							     34192);
	    ((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 34167);
	    OpenGL.glTexGeni(8192, 9472, 34066);
	    OpenGL.glTexGeni(8193, 9472, 34066);
	    OpenGL.glTexGeni(8194, 9472, 34066);
	    OpenGL.glEnable(3168);
	    OpenGL.glEnable(3169);
	    OpenGL.glEnable(3170);
	    ((Class353) this).toolkit.setActiveTextureUnit(0);
	    aGlDrawingList_5481.endList();
	    aGlDrawingList_5481.newList(1);
	    ((Class353) this).toolkit.setActiveTextureUnit(1);
	    ((Class353) this).toolkit.setCombineModes(8448, 8448);
	    ((Class353) this).toolkit.method2334(34166, 770, 2,
							     34192);
	    ((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 5890);
	    OpenGL.glDisable(3168);
	    OpenGL.glDisable(3169);
	    OpenGL.glDisable(3170);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5888);
	    ((Class353) this).toolkit.setActiveTextureUnit(0);
	    aGlDrawingList_5481.endList();
	}
    }
    
    final boolean method3890(int argument_5_) {
	if (argument_5_ != -6808)
	    return true;
	return true;
    }
    
    static final void method3897(int argument, int argument_6_,
				 int argument_7_, int argument_8_,
				 int argument_9_) {
	float f = (float) Class179.anInt1342 / (float) Class179.anInt1354;
	int anLocalInt = argument_8_;
	int anLocalInt_10_ = argument_6_;
	if (!(f < 1.0F))
	    anLocalInt = (int) ((float) argument_6_ / f);
	else
	    anLocalInt_10_ = (int) ((float) argument_8_ * f);
	argument -= (argument_6_ - anLocalInt_10_) / 2;
	argument_9_ -= (-anLocalInt + argument_8_) / 2;
	Node_Sub31_Sub21.anInt5930
	    = argument_9_ * Class179.anInt1354 / anLocalInt;
	Statics.anInt2726 = -1;
	AbstractFont.anInt418 = (-(argument * Class179.anInt1342 / anLocalInt_10_)
			    + Class179.anInt1342);
	Class55.anInt409 = -1;
	Class279.method3417((byte) 66);
    }
    
    final void method3885(int argument_11_, boolean argument_12_) {
	if (argument_11_ == 0)
	    ((Class353) this).toolkit.setCombineModes(7681, 8448);
    }
    
    static final void method3898(int argument) {
	for (DoublyLinkedNode_Sub51_Sub7 class59_sub51_sub7
		 = ((DoublyLinkedNode_Sub51_Sub7)
		    Node_Sub7.aDCyclicLinkedList_3920.getFirst());
	     class59_sub51_sub7 != null;
	     class59_sub51_sub7
		 = ((DoublyLinkedNode_Sub51_Sub7)
		    Node_Sub7.aDCyclicLinkedList_3920.getNext())) {
	    if (((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7).anInt6249 > 1) {
		((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7).anInt6249 = 0;
		Class111_Sub1.aClass149_4614.put(class59_sub51_sub7, ((MenuAction) (MenuAction) (((DoublyLinkedNode) ((DCyclicLinkedList) (((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7).aDCyclicLinkedList_6250)).rootNode).nextD)).aLong6279);
		((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7).aDCyclicLinkedList_6250
		    .clear();
	    }
	}
	Class62_Sub8.anInt4394 = 0;
	Class62_Sub12.anInt4402 = 0;
	DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404.clear();
	Class205.aJagexHashMap_1470.method1527(0);
	Node_Sub7.aDCyclicLinkedList_3920.clear();
	Node_Sub31_Sub39.aBoolean6055 = false;
    }
    
    final void configure(int argument_13_, int argument_14_, int argument_15_) {
	if (argument_13_ < 122)
	    method3885(-21, true);
    }
    
    public static void method3899(byte argument) {
	anIntArray5482 = null;
	aClass329_5480 = null;
	aClass59_Sub9_Sub3_5483 = null;
    }
    
    final void bind(boolean argument_16_, boolean argument_17_) {
	if (argument_17_)
	    method3891(-104);
	GlCubeMap class142_sub1
	    = ((Class353) this).toolkit.method2311(1);
	if (aGlDrawingList_5481 != null && class142_sub1 != null && argument_16_) {
	    aGlDrawingList_5481.call('\0');
	    ((Class353) this).toolkit.setActiveTextureUnit(1);
	    ((Class353) this).toolkit.bindTexture(class142_sub1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf(((GlToolkit)
				  ((Class353) this).toolkit)
				     .aClass350_Sub3_4884
				     .method3872((byte) 76),
				 0);
	    OpenGL.glMatrixMode(5888);
	    ((Class353) this).toolkit.setActiveTextureUnit(0);
	    aBoolean5479 = true;
	} else
	    ((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 34168);
    }
}
