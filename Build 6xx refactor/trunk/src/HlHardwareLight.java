/* Class59_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class HlHardwareLight extends HardwareLight {

    final void setPosition(int x, int y, int z) {
        ((HardwareLight) this).x = x;
        ((HardwareLight) this).z = z;
        ((HardwareLight) this).y = y;
    }

    final void setIntensity(float intensity) {
        ((HardwareLight) this).colourIntensity = intensity;
    }

    HlHardwareLight(int x, int y, int z, int attenuation, int colour, float colourIntensity) {
        super(x, y, z, attenuation, colour, colourIntensity);
    }

}
