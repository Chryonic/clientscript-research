/* Class13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

final class KeyHandler extends AbstractKeyHandler implements KeyListener, FocusListener {
    static char[] miscPrintableChars = {'\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178'};
    static int[] rsKeymap = {0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private CyclicLinkedList storedQueue = new CyclicLinkedList();
    private CyclicLinkedList messageQueue = new CyclicLinkedList();
    private boolean[] keyState = new boolean[112];
    private Component myComponent;

    static boolean isPrintableChar(char testChar) {
        if (testChar > 0 && testChar < '\u0080' || testChar >= '\u00a0' && testChar <= '\u00ff')
            return true;
        if (testChar != 0) {
            char[] anLocalChars = miscPrintableChars;
            for (char anLocalChar : anLocalChars) {
                if (testChar == anLocalChar)
                    return true;
            }
        }
        return false;
    }

    static void adjustKeymapToJRE() {
        if (Signlink.javaVendor.toLowerCase().contains("microsoft")) {
            rsKeymap[191] = 73;
            rsKeymap[219] = 42;
            rsKeymap[192] = 58;
            rsKeymap[187] = 27;
            rsKeymap[223] = 28;
            rsKeymap[222] = 59;
            rsKeymap[221] = 43;
            rsKeymap[188] = 71;
            rsKeymap[220] = 74;
            rsKeymap[186] = 57;
            rsKeymap[189] = 26;
            rsKeymap[190] = 72;
        } else {
            rsKeymap[44] = 71;
            rsKeymap[47] = 73;
            rsKeymap[61] = 27;
            rsKeymap[92] = 74;
            rsKeymap[59] = 57;
            rsKeymap[45] = 26;
            rsKeymap[91] = 42;
            if (Signlink.setFocusTraversalKeysEnabled == null) {
                rsKeymap[222] = 59;
                rsKeymap[192] = 58;
            } else {
                rsKeymap[222] = 58;
                rsKeymap[520] = 59;
                rsKeymap[192] = 28;
            }
            rsKeymap[46] = 72;
            rsKeymap[93] = 43;
        }
    }

    final void destroy() {
        removeListeners();
    }

    public final synchronized void keyReleased(KeyEvent e) {
        handleEvent(1, e);
    }

    private int getModifiers() {
        int mask = 0;
        if (keyState[81])
            mask |= 0x1;  //SHIFT
        if (keyState[82])
            mask |= 0x4;  //CTRL
        if (keyState[86])
            mask |= 0x2;  //ALT
        return mask;
    }

    final IKeyMessage popMessage() {
        return (IKeyMessage) storedQueue.remove();
    }

    public final synchronized void keyPressed(KeyEvent e) {
        handleEvent(0, e);
    }

    final boolean isKeyDown(int code) {
        return !(code < 0 || code >= 112) && keyState[code];
    }

    public final synchronized void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        if (keyChar != 0 && isPrintableChar(keyChar)) {
            handleEvent(-1, 3, keyChar);
            e.consume();
        }
    }

    private void handleEvent(int keyCode, int action, char keyChar) {
        KeyMessage m = new KeyMessage();
        m.action = action;
        m.keyChar = keyChar;
        m.keyCode = keyCode;
        m.eventTime = Applet_Sub1.getGameTime();
        messageQueue.add(m);
    }

    private void handleEvent(int action, KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode != 0) {
            if (keyCode < 0 || keyCode >= rsKeymap.length)
                keyCode = 0;
            else {
                keyCode = rsKeymap[keyCode];
                if (action != 0 || (keyCode & 0x80) == 0)
                    keyCode &= ~0x80;
                else
                    keyCode = 0;
            }
        } else
            keyCode = 0;
        if (keyCode != 0) {
            handleEvent(keyCode, action, '\0');
            e.consume();
        }
    }

    public final void focusGained(FocusEvent e) {
    }

    public final synchronized void focusLost(FocusEvent e) {
        handleEvent(0, -1, '\0');
    }

    final synchronized void swapBuffers() {
        storedQueue.clear();
        for (KeyMessage m = (KeyMessage) messageQueue.remove(); m != null; m = (KeyMessage) messageQueue.remove()) {
            m.modifiers = getModifiers();
            switch (m.action) {
                case 0:
                    if (!keyState[m.keyCode]) {
                        KeyMessage _m = new KeyMessage();
                        _m.eventTime = m.eventTime;
                        _m.action = 0;
                        _m.modifiers = m.modifiers;
                        _m.keyCode = m.keyCode;
                        _m.keyChar = '\0';
                        storedQueue.add(_m);
                        keyState[(m.keyCode)] = true;
                    }
                    m.action = 2;
                    storedQueue.add(m);
                    break;
                case 1:
                    if (keyState[m.keyCode]) {
                        storedQueue.add(m);
                        keyState[(m.keyCode)] = false;
                    }
                    break;
                case -1:
                    for (int keyCode = 0; keyCode < 112; keyCode++) {
                        if (keyState[keyCode]) {
                            KeyMessage _m = new KeyMessage();
                            _m.keyChar = '\0';
                            _m.eventTime = (m.eventTime);
                            _m.keyCode = keyCode;
                            _m.modifiers = (m.modifiers);
                            _m.action = 1;
                            storedQueue.add(_m);
                            keyState[keyCode] = false;
                        }
                    }
                    break;
                case 3:
                    storedQueue.add(m);
                    break;
            }
        }
    }

    private void setComponent(Component component) {
        removeListeners();
        myComponent = component;
        Method method = Signlink.setFocusTraversalKeysEnabled;
        if (method != null) {
            try {
                method.invoke(myComponent, false);
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        myComponent.addKeyListener(this);
        myComponent.addFocusListener(this);
    }

    private void removeListeners() {
        if (myComponent != null) {
            myComponent.removeKeyListener(this);
            myComponent.removeFocusListener(this);
            myComponent = null;
            for (int anLocalInt = 0; anLocalInt < 112; anLocalInt++)
                keyState[anLocalInt] = false;
            storedQueue.clear();
            messageQueue.clear();
        }
    }

    KeyHandler(Component argument_29_) {
        adjustKeymapToJRE();
        setComponent(argument_29_);
    }
}
