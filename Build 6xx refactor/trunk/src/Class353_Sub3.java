/* Class353_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class353_Sub3 extends Class353
{
    private GlProgramObject aGlProgramObject_5484;
    private Class208 aClass208_5485;
    private int anInt5486;
    private float aFloat5487;
    private GlDrawingList aGlDrawingList_5488;
    private float[] aFloatArray5489;

    final void configure(int argument_0_, int argument_1_, int argument_2_) {
	if (aGlDrawingList_5488 != null) {
	    ((Class353) this).toolkit.setActiveTextureUnit(1);
	    if (argument_0_ >= 122) {
		if ((argument_1_ & 0x80) == 0) {
		    if ((argument_2_ & 0x1) != 1) {
			if (((Class208) aClass208_5485).aBoolean1490)
			    ((Class353) this).toolkit.bindTexture((((Class208) aClass208_5485).aClass142_Sub3_1491));
			else
			    ((Class353) this).toolkit.bindTexture((((Class208) aClass208_5485).aClass142_Sub4Array1493[0]));
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    } else if (!((Class208) aClass208_5485).aBoolean1490) {
			int anLocalInt
			    = ((((GlToolkit)
				 ((Class353) this).toolkit)
				.anInt4850)
			       % 4000 * 16 / 4000);
			((Class353) this).toolkit.bindTexture((((Class208) aClass208_5485).aClass142_Sub4Array1493[anLocalInt]));
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    } else {
			((Class353) this).toolkit.bindTexture(((Class208) aClass208_5485).aClass142_Sub3_1491);
			OpenGL.glProgramLocalParameter4fARB(34336, 65,
							    aFloat5487, 0.0F,
							    0.0F, 1.0F);
		    }
		} else
		    ((Class353) this).toolkit
			.bind(null);
		((Class353) this).toolkit.setActiveTextureUnit(0);
		if ((argument_1_ & 0x40) != 0)
		    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
							1.0F, 1.0F);
		else {
		    Class110.aFloatArray913[2]
			= (((GlToolkit)
			    ((Class353) this).toolkit).modelIntensity
			   * (((GlToolkit)
			       ((Class353) this).toolkit)
			      .lightBlue));
		    Class110.aFloatArray913[1]
			= (((GlToolkit)
			    ((Class353) this).toolkit).lightGreen
			   * (((GlToolkit)
			       ((Class353) this).toolkit)
			      .modelIntensity));
		    Class110.aFloatArray913[0]
			= (((GlToolkit)
			    ((Class353) this).toolkit).lightRed
			   * (((GlToolkit)
			       ((Class353) this).toolkit)
			      .modelIntensity));
		    OpenGL.glProgramLocalParameter4fvARB(34336, 66,
							 (Class110
							  .aFloatArray913),
							 0);
		}
		int anLocalInt = argument_1_ & 0x3;
		if (anLocalInt == 2)
		    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
							1.0F, 1.0F);
		else if (anLocalInt == 3)
		    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
							1.0F, 1.0F);
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F,
							1.0F, 1.0F, 1.0F);
	    }
	}
    }
    
    Class353_Sub3(GlToolkit argument_3_, Class208 argument_4_) {
	super(argument_3_);
	aClass208_5485 = argument_4_;
	if ((((GlToolkit) ((Class353) this).toolkit)
	     .haveVertexProgram)
	    && (((GlToolkit) ((Class353) this).toolkit)
		.maxTextureUnits) >= 2) {
	    aGlProgramObject_5484
		= (Class2_Sub2.method200
		   (34336,
		    "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND",
		    (byte) -65, ((Class353) this).toolkit));
	    if (aGlProgramObject_5484 != null) {
		int[][] anLocalInts
		    = DoublyLinkedNodeP2_Sub2_Sub5.method1895(3, false, 0, 4, 256, 64,
						    (byte) 114, 4, 0.4F);
		int[][] anLocalInts_5_
		    = DoublyLinkedNodeP2_Sub2_Sub5.method1895(3, false, 8, 4, 256, 64,
						    (byte) 115, 4, 0.4F);
		aFloatArray5489 = new float[32768];
		int anLocalInt = 0;
		for (int anLocalInt_6_ = 0; anLocalInt_6_ < 256;
		     anLocalInt_6_++) {
		    int[] anLocalInts_7_ = anLocalInts[anLocalInt_6_];
		    int[] anLocalInts_8_ = anLocalInts_5_[anLocalInt_6_];
		    for (int anLocalInt_9_ = 0; anLocalInt_9_ < 64;
			 anLocalInt_9_++) {
			aFloatArray5489[anLocalInt++]
			    = (float) anLocalInts_7_[anLocalInt_9_] / 4096.0F;
			aFloatArray5489[anLocalInt++]
			    = (float) anLocalInts_8_[anLocalInt_9_] / 4096.0F;
		    }
		}
		method3900(0);
	    }
	}
    }
    
    private final void method3900(int argument_10_) {
	aGlDrawingList_5488
	    = new GlDrawingList(2);
	aGlDrawingList_5488.newList(0);
	((Class353) this).toolkit.setActiveTextureUnit(1);
	((Class353) this).toolkit.setTexEnvColour(-16777216);
	((Class353) this).toolkit.setCombineModes(7681, 260);
	((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 34166);
	((Class353) this).toolkit.setActiveTextureUnit(0);
	OpenGL.glBindProgramARB(34336, ((GlProgramObject) aGlProgramObject_5484).glPtr);
	OpenGL.glEnable(34336);
	aGlDrawingList_5488.endList();
	aGlDrawingList_5488.newList(1);
	((Class353) this).toolkit.setActiveTextureUnit(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	((Class353) this).toolkit.setCombineMode(0);
	((Class353) this).toolkit.setTextureAlphaCombiners(0, 770, 5890);
	((Class353) this).toolkit.setActiveTextureUnit(0);
	OpenGL.glBindProgramARB(34336, argument_10_);
	OpenGL.glDisable(34336);
	OpenGL.glDisable(34820);
	aGlDrawingList_5488.endList();
    }
    
    final void bind(boolean argument_11_, boolean argument_12_) {
	if (aGlDrawingList_5488 != null) {
	    aGlDrawingList_5488.call('\0');
	    ((Class353) this).toolkit.setActiveTextureUnit(1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf(((GlToolkit)
				  ((Class353) this).toolkit)
				     .aClass350_Sub3_4884
				     .method3874(argument_12_),
				 0);
	    OpenGL.glMatrixMode(5888);
	    ((Class353) this).toolkit.setActiveTextureUnit(0);
	    if ((((GlToolkit) ((Class353) this).toolkit)
		 .anInt4850)
		!= anInt5486) {
		int anLocalInt
		    = ((((GlToolkit) ((Class353) this).toolkit)
			.anInt4850)
		       % 5000 * 128 / 5000);
		for (int anLocalInt_13_ = 0; anLocalInt_13_ < 64;
		     anLocalInt_13_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, anLocalInt_13_,
							 aFloatArray5489,
							 anLocalInt);
		    anLocalInt += 2;
		}
		if (((Class208) aClass208_5485).aBoolean1490)
		    aFloat5487
			= (float) ((((GlToolkit)
				     ((Class353) this).toolkit)
				    .anInt4850)
				   % 4000) / 4000.0F;
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		anInt5486
		    = (((GlToolkit) ((Class353) this).toolkit)
		       .anInt4850);
	    }
	}
    }
    
    public static void method3901(int argument) {
	AthmosphericConditions.defaultSkybox = null;
    }
    
    final boolean method3890(int argument_14_) {
	if (argument_14_ != -6808)
	    method3891(29);
	return true;
    }
    
    final void method3885(int argument_15_, boolean argument_16_) {
	if (argument_15_ != 0)
	    method3900(-66);
    }
    
    final void method3891(int argument_17_) {
	if (aGlDrawingList_5488 != null) {
	    aGlDrawingList_5488.call('\001');
	    ((Class353) this).toolkit.setActiveTextureUnit(1);
	    if (argument_17_ == -1756) {
		((Class353) this).toolkit.bind(null);
		((Class353) this).toolkit.setActiveTextureUnit(0);
	    }
	}
    }
    
    final void method3882(int argument_18_, GlTexture argument_19_,
			  int argument_20_) {
	((Class353) this).toolkit.bindTexture(argument_19_);
	if (argument_18_ != 9)
	    method3882(81, null, -119);
	((Class353) this).toolkit.setCombineMode(argument_20_);
    }
}
