/* NativeInterface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagex3.graphics2.hw;

public class NativeInterface
{
    long peer;
    
    public final native void copyTexCoords
	(float[] argument_0_, float[] argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, long argument_5_);
    
    public final native void copyLighting
	(short[] argument_6_, byte[] argument_7_, short[] argument_8_,
	 short[] argument_9_, short[] argument_10_, short[] argument_11_,
	 byte[] argument_12_, int argument_13_, int argument_14_,
	 short[] argument_15_, int argument_16_, int argument_17_,
	 int argument_18_, long argument_19_);
    
    public final native void setSunDirection
	(float argument_20_, float argument_21_, float argument_22_);
    
    public final native void copyNormals
	(short[] argument_23_, short[] argument_24_, short[] argument_25_,
	 byte[] argument_26_, float argument_27_, float argument_28_,
	 int argument_29_, int argument_30_, int argument_31_,
	 long argument_32_);
    
    public final native void copyPositions
	(int[] argument_33_, int[] argument_34_, int[] argument_35_,
	 short[] argument_36_, int argument_37_, int argument_38_,
	 int argument_39_, long argument_40_);
    
    public final native void initTextureMetrics
	(int argument_41_, byte argument_42_, byte argument_43_);
    
    public final native void copyColours
	(short[] argument_44_, byte[] argument_45_, short[] argument_46_,
	 int argument_47_, short[] argument_48_, int argument_49_,
	 int argument_50_, int argument_51_, long argument_52_);
    
    public final native void setAmbient(float argument_53_);
    
    public final native void setSunColour
	(float argument_54_, float argument_55_, float argument_56_,
	 float argument_57_, float argument_58_);
    
    public final native void release();
    
    private final native void init(int argument_59_, int argument_60_);
    
    public NativeInterface(int argument_61_, int argument_62_) {
	init(argument_61_, argument_62_);
    }
}
