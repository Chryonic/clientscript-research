/* Class59_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class HardwareLight extends Node {
    private int radius;
    int x;
    int y;
    static int anInt3889;
    int z;
    static boolean aBoolean3891 = false;
    float colourIntensity;
    private int colour;

    final int getColour() {
        return colour;
    }

    final int getRadius() {
        return radius;
    }

    abstract void setPosition(int x, int y, int z);

    final int getY() {
        return this.y;
    }

    final float getColourIntensity() {
        return this.colourIntensity;
    }

    abstract void setIntensity(float argument_8_);

    final int getZ() {
        return this.z;
    }

    final int getX() {
        return this.x;
    }

    HardwareLight(int x, int y, int z, int attenuation, int colour, float intensity) {
        this.z = z;
        this.colour = colour;
        this.y = y;
        this.colourIntensity = intensity;
        this.x = x;
        radius = attenuation;
    }
}
