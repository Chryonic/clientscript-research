/* Class59_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NativeHardwareLight extends HardwareLight {

    NativeHardwareLight(int x, int y, int z, int attenuation, int colour, float intensity) {
        super(x, y, z, attenuation, colour, intensity);
    }

    final void setIntensity(float intensity) {
        ((HardwareLight) this).colourIntensity = intensity;
    }

    final void setPosition(int x, int y, int z) {
        ((HardwareLight) this).y = y;
        ((HardwareLight) this).z = z;
        ((HardwareLight) this).x = x;
    }
}
