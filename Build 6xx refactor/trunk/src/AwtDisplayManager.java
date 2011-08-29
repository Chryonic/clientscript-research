/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public final class AwtDisplayManager {
    private GraphicsDevice graphicsDevice;
    private DisplayMode displayMode;

    public final void setFullScreenDisplayMode(Frame frame, int width, int height, int bitdepth, int targetRefreshRate) {
        displayMode = graphicsDevice.getDisplayMode();
        if (displayMode == null)
            throw new NullPointerException();
        frame.setUndecorated(true);
        frame.enableInputMethods(false);
        setFrameFullscreen(frame);
        if (targetRefreshRate == 0) {
            int currentRefreshRate = displayMode.getRefreshRate();
            DisplayMode[] displayModes = graphicsDevice.getDisplayModes();
            boolean anLocalBoolean = false;
            for (int displayModesPtr = 0; displayModes.length > displayModesPtr; displayModesPtr++) {
                if (displayModes[displayModesPtr].getWidth() == width && height == displayModes[displayModesPtr].getHeight() && (displayModes[displayModesPtr].getBitDepth() == bitdepth)) {
                    int modeRefreshRate = displayModes[displayModesPtr].getRefreshRate();
                    if (!anLocalBoolean || (Math.abs(-currentRefreshRate + modeRefreshRate) < Math.abs(-currentRefreshRate + targetRefreshRate))) {
                        targetRefreshRate = modeRefreshRate;
                        anLocalBoolean = true;
                    }
                }
            }
            if (!anLocalBoolean)
                targetRefreshRate = currentRefreshRate;
        }
        graphicsDevice.setDisplayMode(new DisplayMode(width, height, bitdepth, targetRefreshRate));
    }

    public final int[] getDisplayModeHashes() {
        DisplayMode[] displayModes = graphicsDevice.getDisplayModes();
        int[] displayModeHashes = new int[displayModes.length << 2];
        for (int anLocalInt = 0; displayModes.length > anLocalInt; anLocalInt++) {
            displayModeHashes[anLocalInt << 2] = displayModes[anLocalInt].getWidth();
            displayModeHashes[(anLocalInt << 2) + 1] = displayModes[anLocalInt].getHeight();
            displayModeHashes[(anLocalInt << 2) + 2] = displayModes[anLocalInt].getBitDepth();
            displayModeHashes[(anLocalInt << 2) + 3] = displayModes[anLocalInt].getRefreshRate();
        }
        return displayModeHashes;
    }

    public AwtDisplayManager() throws Exception {
        GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        graphicsDevice = graphicsenvironment.getDefaultScreenDevice();
        if (!graphicsDevice.isFullScreenSupported()) {
            GraphicsDevice[] graphicsdevices = graphicsenvironment.getScreenDevices();
            GraphicsDevice[] graphicsdevices_7_ = graphicsdevices;
            for (int anLocalInt = 0; anLocalInt < graphicsdevices_7_.length; anLocalInt++) {
                GraphicsDevice graphicsdevice = graphicsdevices_7_[anLocalInt];
                if (graphicsdevice != null && graphicsdevice.isFullScreenSupported()) {
                    graphicsDevice = graphicsdevice;
                    return;
                }
            }
            throw new Exception();
        }
    }

    private final void setFrameFullscreen(Frame frame) {
        boolean invalidatedDevice = false;
            try {
                Field validField = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                validField.setAccessible(true);
                boolean valid = ((Boolean) validField.get(graphicsDevice)).booleanValue();
                if (valid) {
                    invalidatedDevice = true;
                    validField.set(graphicsDevice, Boolean.FALSE);
                }
            } catch (Throwable throwable) {
                /* empty */
            }
            try {
                graphicsDevice.setFullScreenWindow(frame);
            } catch (RuntimeException object) {
                if (invalidatedDevice) {
                    try {
                        Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                        field.set(graphicsDevice, Boolean.TRUE);
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                }
                throw object;
            }
            if (invalidatedDevice) {
                try {
                    Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    field.set(graphicsDevice, Boolean.TRUE);
                } catch (Throwable throwable) {
                    /* empty */
                }
            }
    }

    public final void restoreDisplayMode() {
        if (displayMode != null) {
            graphicsDevice.setDisplayMode(displayMode);
            if (!graphicsDevice.getDisplayMode().equals(displayMode))
                throw new RuntimeException("Did not return to correct resolution!");
            displayMode = null;
        }
        setFrameFullscreen(null);
    }
}
