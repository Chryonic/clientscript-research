/* Class222_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;

public class Class222_Sub1 extends Class222
{
    IDirect3DVertexDeclaration anIDirect3DVertexDeclaration5294;
    
    Class222_Sub1(GraphicsToolkit_Sub2_Sub2 argument_0_, Class289[] argument_1_) {
	VertexElementCollection vertexelementcollection
	    = new VertexElementCollection(((GraphicsToolkit_Sub2_Sub2) argument_0_)
					  .aClass394_6493);
	int anLocalInt = 0;
	for (int anLocalInt_2_ = 0; argument_1_.length > anLocalInt_2_;
	     anLocalInt_2_++) {
	    int anLocalInt_3_ = 0;
	    Class289 class289 = argument_1_[anLocalInt_2_];
	    for (int anLocalInt_4_ = 0;
		 class289.method3479((byte) 121) > anLocalInt_4_;
		 anLocalInt_4_++) {
		InterleavedArrayElementEnum interleavedArrayElementEnum = class289.method3474(anLocalInt_4_);
		if (InterleavedArrayElementEnum.VERTEX_POINTER == interleavedArrayElementEnum)
		    vertexelementcollection.addElement(anLocalInt_2_, 2, 0, 0,
						       0, anLocalInt_3_);
		else if (InterleavedArrayElementEnum.NORMAL_POINTER == interleavedArrayElementEnum)
		    vertexelementcollection.addElement(anLocalInt_2_, 2, 0, 3,
						       0, anLocalInt_3_);
		else if (InterleavedArrayElementEnum.COLOUR_POINTER == interleavedArrayElementEnum)
		    vertexelementcollection.addElement(anLocalInt_2_, 4, 0, 10,
						       0, anLocalInt_3_);
		else if (InterleavedArrayElementEnum.TEXCOORD_1D_POINTER == interleavedArrayElementEnum)
		    vertexelementcollection.addElement(anLocalInt_2_, 0, 0, 5,
						       anLocalInt++,
						       anLocalInt_3_);
		else if (InterleavedArrayElementEnum.TEXCOORD_2D_POINTER == interleavedArrayElementEnum)
		    vertexelementcollection.addElement(anLocalInt_2_, 1, 0, 5,
						       anLocalInt++,
						       anLocalInt_3_);
		else if (interleavedArrayElementEnum == InterleavedArrayElementEnum.TEXCOORD_3D_POINTER)
		    vertexelementcollection.addElement(anLocalInt_2_, 2, 0, 5,
						       anLocalInt++,
						       anLocalInt_3_);
		else if (InterleavedArrayElementEnum.TEXCOORD_4D_POINTER == interleavedArrayElementEnum)
		    vertexelementcollection.addElement(anLocalInt_2_, 3, 0, 5,
						       anLocalInt++,
						       anLocalInt_3_);
		anLocalInt_3_ += ((InterleavedArrayElementEnum) interleavedArrayElementEnum).byteSize;
	    }
	}
	vertexelementcollection.finish();
	((Class222_Sub1) this).anIDirect3DVertexDeclaration5294
	    = ((GraphicsToolkit_Sub2_Sub2) argument_0_).anIDirect3DDevice6491
		  .method4192(vertexelementcollection, null);
    }
}
