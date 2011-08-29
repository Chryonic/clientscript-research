/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

final class AwtCursorManager {
    private Component currentComponent;
    private Robot robot;

    final void setComponent(Component component, boolean nullComponent) {
        if (nullComponent)
            component = null;
        else if (component == null)
            throw new NullPointerException();
        if (component != currentComponent) {
            if (currentComponent != null) {
                currentComponent.setCursor(null);
                currentComponent = null;
            }
            if (component != null) {
                component.setCursor(component.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
                currentComponent = component;
            }
        }
    }

    final void mouseMove(int argument_2_, int argument_3_) {
        robot.mouseMove(argument_2_, argument_3_);
    }

    final void setCursor(Component argument_4_, int[] pixels, int width, int height, Point hotspot) {
        if (pixels != null) {
            BufferedImage bufferedimage = new BufferedImage(width, height, 2);
            bufferedimage.setRGB(0, 0, width, height, pixels, 0, width);
            argument_4_.setCursor(argument_4_.getToolkit().createCustomCursor(bufferedimage, hotspot, null));
        } else
            argument_4_.setCursor(null);
    }

    AwtCursorManager() throws Exception {
        robot = new Robot();
    }
}
