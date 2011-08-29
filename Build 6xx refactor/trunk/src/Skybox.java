/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Skybox {
    static Class149 skyboxCache;

    static Skybox createSkybox(int argument, int argument_9_, int argument_11_, int argument_12_, int argument_13_, int argument_14_) {
        long hash = ((long) argument_11_ * 986053L
              ^ ((long) argument_9_ * 97549L ^ (long) argument * 67481L
                 ^ (long) argument_12_ * 475427L)
              ^ (long) argument_14_ * 32147369L
              ^ (long) argument_13_ * 76724863L);
        Skybox skybox = (Skybox) skyboxCache.get(hash);
        if (skybox != null)
            return skybox;
        skybox = AthmosphericConditions.toolkit.createSkybox(argument, argument_9_, argument_12_, argument_11_, argument_14_, argument_13_);
        skyboxCache.put(skybox, hash);
        return skybox;
    }

    static void clearCache() {
	    skyboxCache.clear((byte) -3);
    }
}
