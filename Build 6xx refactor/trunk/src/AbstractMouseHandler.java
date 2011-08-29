/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Constructor;

abstract class AbstractMouseHandler {

    /*synthetic*/ static Class componentClass;

    static AbstractMouseHandler create(boolean postMotionEvents, Component component) {
        try {
            Constructor constructor
            = (Class.forName("MouseHandler").getDeclaredConstructor
               (new Class[] {
                       (componentClass != null ?
                        componentClass : (componentClass = getClassForName("java.awt.Component"))),
                      Boolean.TYPE }));
            return ((AbstractMouseHandler)
                constructor.newInstance(component, postMotionEvents));
        } catch (Throwable throwable) {
            return new ScrolllessAbstractMouseHandler(component, postMotionEvents);
        }
    }

    /*synthetic*/ static Class getClassForName(String argument) {
        try {
            return Class.forName(argument);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception
                               .getMessage());
        }
    }

    abstract boolean isMiddleButtonDown();

    abstract boolean isLeftButtonDown();

    abstract boolean isRightButtonDown();

    abstract int getX();

    abstract void destroy();

    abstract int getY();

    final boolean isAnyButtonDown() {
        return !(!isLeftButtonDown() && !isMiddleButtonDown() && !isRightButtonDown());
    }

    abstract void swapBuffers();

    abstract AbstractMouseMessage popMessage();
}
