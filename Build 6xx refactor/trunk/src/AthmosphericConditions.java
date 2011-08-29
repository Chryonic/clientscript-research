/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 8/2/11
 * Time: 6:00 PM
 * To change this template use File | Ssettings | File Templates.
 */
public class AthmosphericConditions {
    static int defaultSunColour = 16777215;
    static int defaultFogColour = 13156520;
    static int sunColour;
    static float light0Intensity;
    static float light1Intensity;
    static int sunAngleX = -50;
    static int sunAngleY = -60;
    static int sunAngleZ = -50;
    static float unknown0;
    static float unknown1;
    static float unknown2;
    static int fogColour;
    static int fogThickness;
    static float ambientIntensity;
    static int interpolationLength = -1;
    static long lastInterpolation = 0L;
    static int interpolationSpeed = 0;
    static AthmosphereDefinition targetConditions;
    static float previousUnknown2;
    static float previousUnknown1;
    static float previousUnknown0;
    static int previousFogColour;
    static int previousFogThickness;
    static float previousLight0Intensity;
    static float previousLight1Intensity;
    static float previousAmbientIntensity;
    static int previousSunColour;
    static Node_Sub50 aClass59_Sub50_116;
    static boolean skipInterpolation = false;
    static Skybox previousSkybox;
    static Skybox skybox;
    static Skybox defaultSkybox;
    static AthmosphereDefinition[][] athmosphereDefinitions;
    static GraphicsToolkit toolkit;
    static int[] defaultSkyboxTextures;
    static AthmosphereDefinition defaultAthmosphereDefinition;

    static void loadDefaults() {
        toolkit.setAmbientIntensity(((float) aClass59_Sub50_116.aClass62_Sub11_4301.getAnInt441() * 0.1F + 0.7F) * 1.1523438F);
        toolkit.setSun(defaultSunColour, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        toolkit.setFog(defaultFogColour, -1, 0);
        toolkit.method2030(defaultSkybox);
    }

    static void interpolate() {
        if (interpolationLength >= 0) {
            long time = Applet_Sub1.getGameTime();
            interpolationLength -= time - lastInterpolation;
            if (interpolationLength <= 0) {
                skybox = targetConditions.skybox;
                fogColour = targetConditions.fogColour;
                fogThickness = targetConditions.fogThickness;
                sunColour = targetConditions.sunColour;
                light0Intensity = targetConditions.light0Intensity;
                light1Intensity = targetConditions.light1Intensity;
                ambientIntensity = targetConditions.ambientIntensity;
                unknown2 = targetConditions.unknown2;
                unknown1 = targetConditions.unknown1;
                unknown0 = targetConditions.unknown0;
                interpolationLength = -1;
            } else {
                int srcIntensity = (interpolationLength << 8) / interpolationSpeed;
                int destIntensity = 255 - srcIntensity;
                float fSrcIntensity = (float) srcIntensity / 255.0F;
                float fDestIntensity = 1.0F - fSrcIntensity;
                sunColour = ((((targetConditions.sunColour & 0xff00ff) * destIntensity + (previousSunColour & 0xff00ff) * srcIntensity) & ~0xff00ff) + (((previousSunColour & 0xff00) * srcIntensity + (destIntensity * (targetConditions.sunColour & 0xff00))) & 0xff0000)) >>> 8;
                fogThickness = ((destIntensity * targetConditions.fogThickness) + srcIntensity * previousFogThickness) >> 8;
                light1Intensity = (targetConditions.light1Intensity - previousLight1Intensity) * fDestIntensity + previousLight1Intensity;
                light0Intensity = (targetConditions.light0Intensity - previousLight0Intensity) * fDestIntensity + previousLight0Intensity;
                ambientIntensity = (targetConditions.ambientIntensity - previousAmbientIntensity) * fDestIntensity + previousAmbientIntensity;
                fogColour = (((srcIntensity * (previousFogColour & 0xff00ff) + (targetConditions.fogColour & 0xff00ff) * destIntensity) & ~0xff00ff) + (((targetConditions.fogColour & 0xff00) * destIntensity + (previousFogColour & 0xff00) * srcIntensity) & 0xff0000)) >>> 8;
                unknown2 = (targetConditions.unknown2 - previousUnknown2) * fDestIntensity + previousUnknown2;
                unknown1 = (targetConditions.unknown1 - previousUnknown1) * fDestIntensity + previousUnknown1;
                unknown0 = (targetConditions.unknown0 - previousUnknown0) * fDestIntensity + previousUnknown0;
                if (previousSkybox != targetConditions.skybox)
                    skybox = (toolkit.method2045(previousSkybox, targetConditions.skybox, fDestIntensity, skybox));
            }
            lastInterpolation = time;
        }
    }

    static void applyUnknown() {
        toolkit.method2059(unknown0, unknown1, unknown2);
    }

    static void applyFog() {
        toolkit.setFog(fogColour, (aClass59_Sub50_116.aClass62_Sub13_4329.method1405(43) == 1 ? fogThickness + 256 << 2 : -1), 0);
    }

    static void applyLighting() {
        toolkit.setAmbientIntensity(((float) aClass59_Sub50_116.aClass62_Sub11_4301.getAnInt441() * 0.1F + 0.7F) * ambientIntensity);
        toolkit.setSun(sunColour, light0Intensity, light1Intensity, (float) (sunAngleX << 2), (float) (sunAngleY << 2), (float) (sunAngleZ << 2));
        toolkit.method2030(skybox);
    }

    static void setTarget(int interpolationDuration, AthmosphereDefinition newConditions) {
        if (skipInterpolation) {
            interpolationDuration = 0;
            skipInterpolation = false;
        }
        if (targetConditions == null || !targetConditions.equals(newConditions)) {
            targetConditions = newConditions;
            lastInterpolation = Applet_Sub1.getGameTime();
            interpolationSpeed = interpolationLength = interpolationDuration;
            if (interpolationSpeed != 0) {
                previousFogThickness = fogThickness;
                previousFogColour = fogColour;
                previousUnknown0 = unknown0;
                previousUnknown2 = unknown2;
                previousUnknown1 = unknown1;
                previousLight1Intensity = light1Intensity;
                previousLight0Intensity = light0Intensity;
                previousAmbientIntensity = ambientIntensity;
                previousSunColour = sunColour;
                previousSkybox = skybox;
            } else
                interpolate();
        }
    }

    static void loadSunPosition(int argument, int argument_0_) {
        AthmosphereDefinition athmosphereDefinition = (athmosphereDefinitions[argument_0_][argument]);
        if (athmosphereDefinition != null) {
            sunAngleZ = athmosphereDefinition.sunAngleZ;
            sunAngleX = athmosphereDefinition.sunAngleX;
            sunAngleY = athmosphereDefinition.sunAngleY;
        }
        applyLighting();
    }

    static void initialize(int w, int h, GraphicsToolkit toolkit) {
        athmosphereDefinitions = new AthmosphereDefinition[w][h];
        AthmosphericConditions.toolkit = toolkit;
        if (defaultSkyboxTextures != null)
            defaultSkybox = Skybox.createSkybox(defaultSkyboxTextures[0], defaultSkyboxTextures[1], defaultSkyboxTextures[3], defaultSkyboxTextures[2], defaultSkyboxTextures[5], defaultSkyboxTextures[4]);
        defaultAthmosphereDefinition = new AthmosphereDefinition();
        initializeArray();
    }

    static void cleanup() {
        Skybox.clearCache();
        athmosphereDefinitions = null;
        defaultSkybox = null;
        toolkit = null;
        skybox = null;
        previousSkybox = null;
    }

    static void initializeArray() {
        if (athmosphereDefinitions != null) {
            for (int anLocalInt = 0; anLocalInt < (athmosphereDefinitions).length; anLocalInt++) {
                for (int anLocalInt_2_ = 0; (anLocalInt_2_ < (athmosphereDefinitions[anLocalInt]).length); anLocalInt_2_++)
                    athmosphereDefinitions[anLocalInt][anLocalInt_2_] = defaultAthmosphereDefinition;
            }
        }
    }

    static final void setDefinitionForArea(AthmosphereDefinition value, int x, int z) {
	athmosphereDefinitions[x][z] = value;
    }
}
