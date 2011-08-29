/* Class309 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

import jagdx.Class395;
import jagdx.IDirect3DIndexBuffer;

final class Class309 implements Interface4_Impl1
{
    private DataType aDataType_5605;
    private int anInt5606;
    private GraphicsToolkit_Sub2_Sub2 aClass_ha_Sub2_Sub2_5607;
    private boolean aBoolean5608;
    private int anInt5609;
    IDirect3DIndexBuffer anIDirect3DIndexBuffer5610;
    private boolean aBoolean5611 = false;
    
    public final void method44(int argument_0_) {
	if (argument_0_ == 487) {
	    if (((Class309) this).anIDirect3DIndexBuffer5610 != null) {
		((Class309) this).anIDirect3DIndexBuffer5610
		    .method4179((byte) -70);
		((Class309) this).anIDirect3DIndexBuffer5610 = null;
	    }
	    anInt5609 = 0;
	    anInt5606 = 0;
	}
    }
    
    public final boolean method41(int argument_1_) {
	if (argument_1_ != 26937)
	    method45(-55, (byte) -1);
	if (aBoolean5611
	    && Class395.method4207(argument_1_ ^ 0x6939,
				   ((Class309) this)
				       .anIDirect3DIndexBuffer5610.Unlock())) {
	    aBoolean5611 = false;
	    return true;
	}
	return false;
    }
    
    public final DataType method42(int argument_2_) {
	if (argument_2_ != 21064)
	    return null;
	return aDataType_5605;
    }
    
    public final void method45(int argument_3_, byte argument_4_) {
	anInt5606 = argument_3_ * ((DataType) aDataType_5605).length;
	if (anInt5609 < anInt5606) {
	    int anLocalInt = 8;
	    int anLocalInt_5_;
	    if (aBoolean5608) {
		anLocalInt_5_ = 0;
		anLocalInt |= 0x200;
	    } else
		anLocalInt_5_ = 1;
	    if (((Class309) this).anIDirect3DIndexBuffer5610 != null)
		((Class309) this).anIDirect3DIndexBuffer5610
		    .method4179((byte) -70);
	    ((Class309) this).anIDirect3DIndexBuffer5610
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_5607)
		       .anIDirect3DDevice6491.method4201
		   (anInt5606, anLocalInt,
		    aDataType_5605 == DataType.aDataType_1075 ? 101 : 102,
		    anLocalInt_5_,
		    ((Class309) this).anIDirect3DIndexBuffer5610));
	    anInt5609 = anInt5606;
	}
	if (argument_4_ != -73)
	    aBoolean5611 = false;
    }
    
    public final Buffer method43(boolean argument_6_, int argument_7_) {
	if (((Class309) this).anIDirect3DIndexBuffer5610 == null)
	    return null;
	if (argument_7_ != 3754)
	    aClass_ha_Sub2_Sub2_5607 = null;
	argument_6_ &= aBoolean5608;
	if (!aBoolean5611
	    && Class395.method4207(0, (((Class309) this)
					   .anIDirect3DIndexBuffer5610.Lock
				       (0, anInt5609, !argument_6_ ? 0 : 8192,
					(((GraphicsToolkit_Sub2_Sub2)
					  aClass_ha_Sub2_Sub2_5607)
					 .aGeometryBuffer6496))))) {
	    aBoolean5611 = true;
	    return (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_5607)
		    .aGeometryBuffer6496);
	}
	return null;
    }
    
    public final int getSize(byte argument_8_) {
	if (argument_8_ < 81)
	    method43(true, 29);
	return anInt5606;
    }
    
    Class309(GraphicsToolkit_Sub2_Sub2 argument_9_, DataType argument_10_,
	     boolean argument_11_) {
	aClass_ha_Sub2_Sub2_5607 = argument_9_;
	aDataType_5605 = argument_10_;
	aBoolean5608 = argument_11_;
    }
}
