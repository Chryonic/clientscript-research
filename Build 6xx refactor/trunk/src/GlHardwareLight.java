/* Class59_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GlHardwareLight extends HardwareLight
{

    GlHardwareLight(int x, int y, int z, int attenuation, int colour, float intensity) {
	    super(x, y, z, attenuation, colour, intensity);
    }

    final void setPosition(int x, int y, int z) {
	    ((HardwareLight) this).z = z;
	    ((HardwareLight) this).y = y;
	    ((HardwareLight) this).x = x;
    }
    
    final void setIntensity(float intensity) {
	    ((HardwareLight) this).colourIntensity = intensity;
    }
}
