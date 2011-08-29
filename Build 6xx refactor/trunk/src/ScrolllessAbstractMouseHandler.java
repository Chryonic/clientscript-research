/* Class153_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class ScrolllessAbstractMouseHandler extends AbstractMouseHandler implements MouseListener, MouseMotionListener {
    private int storedY;
    private int storedX;
    private int storedButtons;
    private CyclicLinkedList storedQueue = new CyclicLinkedList();
    private int currentX;
    private CyclicLinkedList messageQueue = new CyclicLinkedList();
    private int pressedButtons;
    private int currentY;
    private Component myComponent;
    private boolean aBoolean5044;

    public final synchronized void mouseMoved(MouseEvent e) {
        motionEventHandler(e.getY(), e.getX());
    }

    final synchronized void swapBuffers() {
        storedX = currentX;
        storedY = currentY;
        storedButtons = pressedButtons;
        CyclicLinkedList cyclicLinkedList = storedQueue;
        storedQueue = messageQueue;
        messageQueue = cyclicLinkedList;
        messageQueue.clear();
    }

    final boolean isLeftButtonDown() {
        return (storedButtons & 0x1) != 0;
    }

    private void buttonEventHandler(int clickCount, int y, int x, int action) {
       ScrolllessMouseMessage m = new ScrolllessMouseMessage();
            m.y = y;
            m.action = action;
            m.clickCount = clickCount;
            m.x = x;
            m.eventTime = Applet_Sub1.getGameTime();
            messageQueue.add(m);
    }

    public final synchronized void mouseExited(MouseEvent e) {
        motionEventHandler(e.getY(), e.getX());
    }

    private int getPressedButton(MouseEvent e) {
        int modifiers = e.getModifiers();
        boolean leftDown = (modifiers & 0x10) != 0;
        boolean middleDown = (modifiers & 0x8) != 0;
        boolean rightDown = (modifiers & 0x4) != 0;
        if (middleDown && (leftDown || rightDown))
            middleDown = false;
        if (leftDown && rightDown)
            return 4;
        if (leftDown)
            return 1;
        if (middleDown)
            return 2;
        if (rightDown)
            return 4;
        return 0;
    }

    final boolean isRightButtonDown() {
        return (storedButtons & 0x4) != 0;
    }

    private void _removeListeners() {
        if (myComponent != null) {
            myComponent.removeMouseMotionListener(this);
            myComponent.removeMouseListener(this);
            currentX = currentY = pressedButtons = 0;
            myComponent = null;
            storedQueue.clear();
            messageQueue.clear();
            storedX = storedY = storedButtons = 0;
        }
    }

    final boolean isMiddleButtonDown() {
        return (storedButtons & 0x2) != 0;
    }

    public final synchronized void mouseDragged(MouseEvent e) {
        motionEventHandler(e.getY(), e.getX());
    }

    final AbstractMouseMessage popMessage() {
        return (AbstractMouseMessage) storedQueue.remove();
    }

    public final synchronized void mouseClicked(MouseEvent e) {
        if (e.isPopupTrigger())
            e.consume();
    }

    final void destroy() {
        _removeListeners();
    }

    public final synchronized void mouseReleased(MouseEvent e) {
        int mask = getPressedButton(e);
        if ((pressedButtons & mask) == 0)
            mask = pressedButtons;
        if ((mask & 0x1) != 0)
            buttonEventHandler(e.getClickCount(), e.getY(), e.getX(), 3);
        if ((mask & 0x4) != 0)
            buttonEventHandler(e.getClickCount(), e.getY(), e.getX(), 5);
        if ((mask & 0x2) != 0)
            buttonEventHandler(e.getClickCount(), e.getY(), e.getX(), 4);
        pressedButtons &= ~mask;
        if (e.isPopupTrigger())
            e.consume();
    }

    private void setComponent(Component argument_22_) {
        _removeListeners();
        myComponent = argument_22_;
        myComponent.addMouseListener(this);
        myComponent.addMouseMotionListener(this);
    }

    final int getY() {
        return storedY;
    }

    final int getX() {
        return storedX;
    }

    public final synchronized void mouseEntered(MouseEvent argument_30_) {
        motionEventHandler(argument_30_.getY(), argument_30_.getX());
    }

    private void motionEventHandler(int argument_32_, int argument_33_) {
        currentX = argument_33_;
        currentY = argument_32_;
        if (aBoolean5044)
            buttonEventHandler(0, argument_32_, argument_33_, -1);
    }

    public final synchronized void mousePressed(MouseEvent argument_34_) {
        int anLocalInt = getPressedButton(argument_34_);
        if (anLocalInt != 1) {
            if (anLocalInt != 4) {
                if (anLocalInt == 2)
                    buttonEventHandler(argument_34_.getClickCount(), argument_34_.getY(), argument_34_.getX(), 1);
            } else
                buttonEventHandler(argument_34_.getClickCount(), argument_34_.getY(), argument_34_.getX(), 2);
        } else
            buttonEventHandler(argument_34_.getClickCount(), argument_34_.getY(), argument_34_.getX(), 0);
        pressedButtons |= anLocalInt;
        if (argument_34_.isPopupTrigger())
            argument_34_.consume();
    }

    ScrolllessAbstractMouseHandler(Component argument_35_, boolean argument_36_) {
        setComponent(argument_35_);
        aBoolean5044 = argument_36_;
    }
}
