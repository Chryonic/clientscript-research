/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Source;

import jagdx.Class395;
import jagdx.IDirect3DVertexBuffer;

final class Class288 implements Interface4_Impl2
{
    private boolean aBoolean5612 = false;
    private int anInt5613;
    private GraphicsToolkit_Sub2_Sub2 aClass_ha_Sub2_Sub2_5614;
    IDirect3DVertexBuffer anIDirect3DVertexBuffer5615;
    private byte aByte5616;
    private boolean aBoolean5617;
    private int anInt5618;
    
    public final int getSize(byte argument_0_) {
	if (argument_0_ <= 81)
	    anInt5618 = -104;
	return anInt5618;
    }
    
    public final void method44(int argument_1_) {
	if (((Class288) this).anIDirect3DVertexBuffer5615 != null) {
	    ((Class288) this).anIDirect3DVertexBuffer5615
		.method4179((byte) -70);
	    ((Class288) this).anIDirect3DVertexBuffer5615 = null;
	}
	anInt5618 = 0;
	anInt5613 = 0;
	if (argument_1_ != 487)
	    aClass_ha_Sub2_Sub2_5614 = null;
    }
    
    public final Buffer method50(boolean argument_2_,
				      boolean argument_3_) {
	if (argument_2_ != true)
	    return null;
	if (((Class288) this).anIDirect3DVertexBuffer5615 == null)
	    return null;
	argument_3_ &= aBoolean5617;
	if (!aBoolean5612
	    && Class395.method4207(0, (((Class288) this)
					   .anIDirect3DVertexBuffer5615.Lock
				       (0, anInt5613, !argument_3_ ? 0 : 8192,
					(((GraphicsToolkit_Sub2_Sub2)
					  aClass_ha_Sub2_Sub2_5614)
					 .aGeometryBuffer6496))))) {
	    aBoolean5612 = true;
	    return (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_5614)
		    .aGeometryBuffer6496);
	}
	return null;
    }
    
    public final boolean method52(int argument_4_, int argument_5_,
				  int argument_6_) {
	anInt5618 = argument_4_;
	if (argument_6_ != -10760)
	    return true;
	aByte5616 = (byte) argument_5_;
	if (anInt5618 > anInt5613) {
	    int anLocalInt = 8;
	    int anLocalInt_7_;
	    if (!aBoolean5617)
		anLocalInt_7_ = 1;
	    else {
		anLocalInt_7_ = 0;
		anLocalInt |= 0x200;
	    }
	    if (((Class288) this).anIDirect3DVertexBuffer5615 != null)
		((Class288) this).anIDirect3DVertexBuffer5615
		    .method4179((byte) -70);
	    ((Class288) this).anIDirect3DVertexBuffer5615
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_5614)
		       .anIDirect3DDevice6491.method4194
		   (anInt5618, anLocalInt, 0, anLocalInt_7_,
		    ((Class288) this).anIDirect3DVertexBuffer5615));
	    anInt5613 = anInt5618;
	}
	return ((Class288) this).anIDirect3DVertexBuffer5615 != null;
    }
    
    final int method3472(int argument_8_) {
	return aByte5616;
    }
    
    public final boolean method53(int argument_9_) {
	if (aBoolean5612
	    && Class395.method4207(argument_9_ - 10925,
				   ((Class288) this)
				       .anIDirect3DVertexBuffer5615
				       .Unlock())) {
	    aBoolean5612 = false;
	    return true;
	}
	if (argument_9_ != 10925)
	    aByte5616 = (byte) -52;
	return false;
    }
    
    public final boolean method51(int argument_10_, int argument_11_,
				  int argument_12_, Source argument_13_) {
	if (method52(argument_10_, argument_11_, -10760))
	    return (((Class288) this).anIDirect3DVertexBuffer5615.method4204
		    (argument_13_, 0, 0, anInt5618, aBoolean5617 ? 8192 : 0));
	if (argument_12_ != -959)
	    ((Class288) this).anIDirect3DVertexBuffer5615 = null;
	return false;
    }
    
    Class288(GraphicsToolkit_Sub2_Sub2 argument_14_, boolean argument_15_) {
	aClass_ha_Sub2_Sub2_5614 = argument_14_;
	aBoolean5617 = argument_15_;
    }
}
