/* Class153_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class MouseHandler extends AbstractMouseHandler implements MouseListener, MouseMotionListener, MouseWheelListener {
    private int storedButtons;
    private int storedX;
    private CyclicLinkedList storedQueue = new CyclicLinkedList();
    private int storedY;
    private int currentX;
    private int currentY;
    private int pressedButtons;
    private CyclicLinkedList messageQueue = new CyclicLinkedList();
    private boolean buttonEventsForMotion;
    private Component myComponent;

    final boolean isLeftButtonDown() {
        return (storedButtons & 0x1) != 0;
    }

    final synchronized void swapBuffers() {
        storedY = currentY;
        storedX = currentX;
        storedButtons = pressedButtons;
        CyclicLinkedList cyclicLinkedList = storedQueue;
        storedQueue = messageQueue;
        messageQueue = cyclicLinkedList;
        messageQueue.clear();
    }

    final boolean isRightButtonDown() {
        return (storedButtons & 0x4) != 0;
    }

    private void motionEventHandler(int y, int x) {
        currentY = y;
        currentX = x;
        if (buttonEventsForMotion)
            buttonEventHandler(0, -1, y, x);
    }

    public final synchronized void mouseReleased(MouseEvent e) {
        int button = getMouseButton(e);
        if ((button & pressedButtons) == 0)
            button = pressedButtons;
        if ((button & 0x1) != 0)
            buttonEventHandler(e.getClickCount(), 3, e.getY(), e.getX());
        if ((button & 0x4) != 0)
            buttonEventHandler(e.getClickCount(), 5, e.getY(), e.getX());
        if ((button & 0x2) != 0)
            buttonEventHandler(e.getClickCount(), 4, e.getY(), e.getX());
        pressedButtons &= ~button;
        if (e.isPopupTrigger())
            e.consume();
    }

    public final synchronized void mouseExited(MouseEvent e) {
        motionEventHandler(e.getY(), e.getX());
    }

    public final synchronized void mouseClicked(MouseEvent e) {
        if (e.isPopupTrigger())
            e.consume();
    }

    final AbstractMouseMessage popMessage() {
        return (AbstractMouseMessage) storedQueue.remove();
    }

    private int getMouseButton(MouseEvent argument_11_) {
        if (argument_11_.getButton() == 1) {
            if (argument_11_.isMetaDown())
                return 4;
            return 1;
        }
        if (argument_11_.getButton() == 2)
            return 2;
        if (argument_11_.getButton() == 3)
            return 4;
        return 0;
    }

    public final synchronized void mousePressed(MouseEvent e) {
        int button = getMouseButton(e);
        if (button == 1)
            buttonEventHandler(e.getClickCount(), 0, e.getY(), e.getX());
        else if (button == 4)
            buttonEventHandler(e.getClickCount(), 2, e.getY(), e.getX());
        else if (button == 2)
            buttonEventHandler(e.getClickCount(), 1, e.getY(), e.getX());
        pressedButtons |= button;
        if (e.isPopupTrigger())
            e.consume();
    }

    private void setComponent(Component component) {
        _destroy();
        myComponent = component;
        myComponent.addMouseListener(this);
        myComponent.addMouseMotionListener(this);
        myComponent.addMouseWheelListener(this);
    }

    public final synchronized void mouseWheelMoved(MouseWheelEvent e) {
        int x = e.getX();
        int y = e.getY();
        int wheelRot = e.getWheelRotation();
        buttonEventHandler(wheelRot, 6, y, x);
        e.consume();
    }

    private void buttonEventHandler(int clickCount, int action, int y, int x) {
        MouseMessage m = new MouseMessage();
        m.x = x;
        m.action = action;
        m.y = y;
        m.eventTime = Applet_Sub1.getGameTime();
        m.clickCount = clickCount;
        messageQueue.add(m);
    }

    final int getX() {
        return storedX;
    }

    final boolean isMiddleButtonDown() {
        return (storedButtons & 0x2) != 0;
    }

    final int getY() {
        return storedY;
    }

    public final synchronized void mouseDragged(MouseEvent e) {
        motionEventHandler(e.getY(), e.getX());
    }

    private void _destroy() {
        if (myComponent != null) {
            myComponent.removeMouseWheelListener(this);
            myComponent.removeMouseMotionListener(this);
            myComponent.removeMouseListener(this);
            //messageQueue = null;
            currentX = currentY = pressedButtons = 0;
            //storedQueue = null;
            storedX = storedY = storedButtons = 0;
            myComponent = null;
        }
    }

    final void destroy() {
        _destroy();
    }

    public final synchronized void mouseMoved(MouseEvent e) {
        motionEventHandler(e.getY(), e.getX());
    }

    public final synchronized void mouseEntered(MouseEvent e) {
        motionEventHandler(e.getY(), e.getX());
    }

    MouseHandler(Component argument_31_, boolean argument_32_) {
        setComponent(argument_31_);
        buttonEventsForMotion = argument_32_;
    }
}
