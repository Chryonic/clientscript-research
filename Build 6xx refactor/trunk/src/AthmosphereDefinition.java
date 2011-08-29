/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class AthmosphereDefinition {
    float unknown2 = 0.25F;
    int fogThickness;
    int fogColour;
    int sunAngleZ;
    float ambientIntensity;
    float unknown1 = 1.0F;
    float light0Intensity;
    float light1Intensity;
    Skybox skybox;
    int sunAngleX;
    float unknown0 = 1.0F;
    int sunColour;
    int sunAngleY;

    final void readUnknownValues(Packet packet) {
        this.unknown1 = (float) (packet.g1() * 8) / 255.0F;
        this.unknown2 = (float) (packet.g1() * 8) / 255.0F;
        this.unknown0 = (float) (packet.g1() * 8) / 255.0F;
    }

    final boolean equals(AthmosphereDefinition other) {
        return !(this.sunColour != other.sunColour || (other.ambientIntensity != this.ambientIntensity) || (other.light0Intensity != this.light0Intensity) || (this.light1Intensity != other.light1Intensity) || (this.unknown2 != other.unknown2) || (other.unknown1 != this.unknown1) || (this.unknown0 != other.unknown0) || (other.fogColour != this.fogColour) || (other.fogThickness != this.fogThickness) || (other.skybox != this.skybox));
    }

    public AthmosphereDefinition() {
        this.ambientIntensity = 1.1523438F;
        this.light1Intensity = 1.2F;
        this.fogThickness = 0;
        this.light0Intensity = 0.69921875F;
        this.sunAngleY = -60;
        this.skybox = AthmosphericConditions.defaultSkybox;
        this.sunAngleX = -50;
        this.sunColour = AthmosphericConditions.defaultSunColour;
        this.fogColour = AthmosphericConditions.defaultFogColour;
        this.sunAngleZ = -50;
    }

    AthmosphereDefinition(Packet packet) {
        int definedValues = packet.g1();
        if (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub16_4308.method1421(62) == 1 && AthmosphericConditions.toolkit.method2016() > 0) {
            if ((definedValues & 0x1) == 0)
                this.sunColour = AthmosphericConditions.defaultSunColour;
            else
                this.sunColour = packet.g4();
            if ((definedValues & 0x2) != 0)
                this.ambientIntensity = (float) packet.g2() / 256.0F;
            else
                this.ambientIntensity = 1.1523438F;
            if ((definedValues & 0x4) != 0)
                this.light0Intensity = (float) packet.g2() / 256.0F;
            else
                this.light0Intensity = 0.69921875F;
            if ((definedValues & 0x8) != 0)
                this.light1Intensity = (float) packet.g2() / 256.0F;
            else
                this.light1Intensity = 1.2F;
        } else {
            if ((definedValues & 0x1) != 0)
                packet.g4();
            if ((definedValues & 0x2) != 0)
                packet.g2();
            if ((definedValues & 0x4) != 0)
                packet.g2();
            if ((definedValues & 0x8) != 0)
                packet.g2();
            this.light0Intensity = 0.69921875F;
            this.sunColour = AthmosphericConditions.defaultSunColour;
            this.ambientIntensity = 1.1523438F;
            this.light1Intensity = 1.2F;
        }
        if ((definedValues & 0x10) == 0) {
            this.sunAngleZ = -50;
            this.sunAngleX = -50;
            this.sunAngleY = -60;
        } else {
            this.sunAngleX = packet.g2s();
            this.sunAngleY = packet.g2s();
            this.sunAngleZ = packet.g2s();
        }
        if ((definedValues & 0x20) == 0)
            this.fogColour = AthmosphericConditions.defaultFogColour;
        else
            this.fogColour = packet.g4();
        if ((definedValues & 0x40) != 0)
            this.fogThickness = packet.g2();
        else
            this.fogThickness = 0;
        if ((definedValues & 0x80) != 0) {
            int anLocalInt_8_ = packet.g2();
            int anLocalInt_9_ = packet.g2();
            int anLocalInt_10_ = packet.g2();
            int anLocalInt_11_ = packet.g2();
            int anLocalInt_12_ = packet.g2();
            int anLocalInt_13_ = packet.g2();
            this.skybox = Skybox.createSkybox(anLocalInt_8_, anLocalInt_9_, anLocalInt_11_, anLocalInt_10_, anLocalInt_13_, anLocalInt_12_);
        } else
            this.skybox = AthmosphericConditions.defaultSkybox;
    }
}
