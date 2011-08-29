/* Class353_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class353_Sub1 extends Class353
{
    private GlProgramObject aGlProgramObject_5469;
    private GlProgramObject aGlProgramObject_5470;
    private boolean aBoolean5471;
    private boolean aBoolean5472;
    private boolean aBoolean5473 = false;
    private GlProgramObject aGlProgramObject_5474;
    private GlProgramObject aGlProgramObject_5475;
    private boolean aBoolean5476;
    static int anInt5477;
    private GlTexture_Sub4 aClass142_Sub4_5478;
    
    final void method3882(int argument_0_, GlTexture argument_1_,
			  int argument_2_) {
	if (argument_0_ != 9)
	    method3885(80, false);
	if (argument_1_ != null) {
	    if (aBoolean5473) {
		((Class353) this).toolkit.method2334(5890, 768, 0,
								 34192);
		((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 5890);
		aBoolean5473 = false;
	    }
	    ((Class353) this).toolkit.bindTexture(argument_1_);
	    ((Class353) this).toolkit.setCombineMode(argument_2_);
	} else if (!aBoolean5473) {
	    ((Class353) this).toolkit.bindTexture((((GlToolkit) ((Class353) this).toolkit).aClass142_Sub4_4955));
	    ((Class353) this).toolkit.setCombineMode(1);
	    ((Class353) this).toolkit
		.method2334(34168, 768, 0, argument_0_ ^ 0x8599);
	    ((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 34168);
	    aBoolean5473 = true;
	}
    }
    
    static final void method3892(int argument) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(15, 13175, 0L);
	class59_sub51_sub3.method1181(585134072);
    }
    
    final boolean method3890(int argument_3_) {
	if (argument_3_ != -6808)
	    method3885(-113, true);
	return aBoolean5471;
    }
    
    final void method3893(byte argument_4_) {
	if (aBoolean5476) {
	    int anLocalInt = ((Class353) this).toolkit.XA();
	    int anLocalInt_5_ = ((Class353) this).toolkit.i();
	    float f = (-((float) (anLocalInt - anLocalInt_5_) * 0.125F)
		       + (float) anLocalInt);
	    float f_6_ = ((float) anLocalInt
			  - (float) (-anLocalInt_5_ + anLocalInt) * 0.25F);
	    OpenGL.glProgramLocalParameter4fARB
		(34336, 0, f_6_, f,
		 1.0F / (float) (((GlToolkit)
				  ((Class353) this).toolkit)
				 .anInt4988),
		 ((float) ((GlToolkit)
			   ((Class353) this).toolkit).anInt4974
		  / 255.0F));
	    ((Class353) this).toolkit.setActiveTextureUnit(1);
	    ((Class353) this).toolkit.setTexEnvColour((((GlToolkit) ((Class353) this).toolkit).anInt4980));
	    ((Class353) this).toolkit.setActiveTextureUnit(0);
	}
    }
    
    Class353_Sub1(GlToolkit argument_7_) {
	super(argument_7_);
	if (!((GlToolkit) ((Class353) this).toolkit)
	     .haveVertexProgram)
	    aBoolean5471 = false;
	else {
	    aGlProgramObject_5469
		= (Class2_Sub2.method200
		   (34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n",
		    (byte) -76, ((Class353) this).toolkit));
	    aGlProgramObject_5475
		= (Class2_Sub2.method200
		   (34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n",
		    (byte) -115, ((Class353) this).toolkit));
	    aGlProgramObject_5470
		= (Class2_Sub2.method200
		   (34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n",
		    (byte) -26, ((Class353) this).toolkit));
	    aGlProgramObject_5474
		= (Class2_Sub2.method200
		   (34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n",
		    (byte) -69, ((Class353) this).toolkit));
	    if (aGlProgramObject_5475 != null & aGlProgramObject_5469 != null
		& aGlProgramObject_5470 != null & aGlProgramObject_5474 != null) {
		aClass142_Sub4_5478
		    = new GlTexture_Sub4(argument_7_, 3553, 6406, 2, 1, false,
					new byte[] { 0, -1 }, 6406, false);
		aClass142_Sub4_5478.setWrappingMode(false, false);
		aBoolean5471 = true;
	    } else
		aBoolean5471 = false;
	}
    }
    
    final void method3894(int argument_8_) {
	Class350_Sub3 class350_sub3
	    = (((GlToolkit) ((Class353) this).toolkit)
	       .lightingMatrix);
	if (!aBoolean5472)
	    OpenGL.glBindProgramARB(34336,
				    ((((GlToolkit)
				       ((Class353) this).toolkit)
				      .anInt4950) != 2147483647
				     ? ((GlProgramObject) aGlProgramObject_5470).glPtr
				     : ((GlProgramObject) aGlProgramObject_5469).glPtr));
	else
	    OpenGL.glBindProgramARB(34336,
				    ((((GlToolkit)
				       ((Class353) this).toolkit)
				      .anInt4950) == 2147483647
				     ? ((GlProgramObject) aGlProgramObject_5475).glPtr
				     : ((GlProgramObject) aGlProgramObject_5474).glPtr));
	class350_sub3.method3870(-27186, Class178.aFloatArray1313, -1.0F, 0.0F,
				 0.0F,
				 (float) ((GlToolkit)
					  (((Class353) this)
					   .toolkit)).anInt4950);
	OpenGL.glProgramLocalParameter4fARB(34336, 1,
					    Class178.aFloatArray1313[0],
					    Class178.aFloatArray1313[1],
					    Class178.aFloatArray1313[2],
					    Class178.aFloatArray1313[3]);
	OpenGL.glEnable(34336);
	aBoolean5476 = true;
	method3893((byte) -77);
    }
    
    final void method3891(int argument_9_) {
	if (aBoolean5476) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    aBoolean5476 = false;
	}
	((Class353) this).toolkit.setActiveTextureUnit(1);
	((Class353) this).toolkit.bind(null);
	if (argument_9_ != -1756)
	    method3893((byte) -63);
	((Class353) this).toolkit.setCombineModes(8448, 8448);
	((Class353) this).toolkit.method2334(5890, 768, 0, 34192);
	((Class353) this).toolkit.method2334(34166, 770, 2, 34192);
	((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 5890);
	((Class353) this).toolkit.setActiveTextureUnit(0);
	if (aBoolean5473) {
	    ((Class353) this).toolkit.method2334(5890, 768, 0,
							     34192);
	    ((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 5890);
	    aBoolean5473 = false;
	}
    }
    
    final void configure(int argument_10_, int argument_11_, int argument_12_) {
	if (argument_10_ <= 122)
	    method3885(-48, true);
    }
    
    static final GlTexture_Sub4_Sub1 method3895
	(int argument, GlToolkit argument_13_, int argument_14_,
	 int argument_15_, int argument_16_, int argument_17_) {
	if (!((GlToolkit) argument_13_).aBoolean4927
	    && (!Class2_Sub1.method198(argument_17_)
		|| !Class2_Sub1.method198(argument))) {
	    if (((GlToolkit) argument_13_).haveTextureRectangle)
		return new GlTexture_Sub4_Sub1(argument_13_, 34037,
					      argument_15_, argument_16_,
					      argument_17_, argument, true);
	    return new GlTexture_Sub4_Sub1(argument_13_, argument_15_,
					  argument_16_, argument_17_, argument,
					  MathStatics.method2589(argument_17_),
					  MathStatics.method2589(argument));
	}
	return new GlTexture_Sub4_Sub1(argument_13_, 3553, argument_15_,
				      argument_16_, argument_17_, argument,
				      true);
    }
    
    final void bind(boolean argument_18_, boolean argument_19_) {
	aBoolean5472 = argument_18_;
	((Class353) this).toolkit.setActiveTextureUnit(1);
	((Class353) this).toolkit.bindTexture(aClass142_Sub4_5478);
	if (argument_19_)
	    method3885(-38, false);
	((Class353) this).toolkit.setCombineModes(7681, 34165);
	((Class353) this).toolkit.method2334(34166, 768, 0, 34192);
	((Class353) this).toolkit.method2334(5890, 770, 2, 34192);
	((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 34168);
	((Class353) this).toolkit.setActiveTextureUnit(0);
	method3894(928);
    }
    
    final void method3885(int argument_20_, boolean argument_21_) {
	if (argument_20_ != 0)
	    aClass142_Sub4_5478 = null;
    }
}
