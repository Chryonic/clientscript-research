/* Class370 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DBaseTexture;

abstract class Class370
{
    DataType aDataType_3118;
    boolean aBoolean3119;
    Class382 aClass382_3120 = Statics.aClass382_854;
    Class320 aClass320_3121;
    GraphicsToolkit_Sub2_Sub2 aClass_ha_Sub2_Sub2_3122;
    
    abstract IDirect3DBaseTexture method4046(int argument_0_);
    
    void method33(int argument_1_, Class382 argument_2_) {
	((Class370) this).aClass382_3120 = argument_2_;
    }
    
    Class370(GraphicsToolkit_Sub2_Sub2 argument_3_, Class320 argument_4_,
	     DataType argument_5_, boolean argument_6_, int argument_7_) {
	((Class370) this).aDataType_3118 = argument_5_;
	((Class370) this).aClass320_3121 = argument_4_;
	((Class370) this).aBoolean3119 = argument_6_;
	((Class370) this).aClass_ha_Sub2_Sub2_3122 = argument_3_;
    }
}
