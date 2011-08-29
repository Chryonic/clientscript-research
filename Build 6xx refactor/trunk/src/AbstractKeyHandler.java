/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

abstract class AbstractKeyHandler
{

    static final AbstractKeyHandler create(Component component) {
        return new KeyHandler(component);
    }

    abstract void swapBuffers();
    
    abstract boolean isKeyDown(int code);

    abstract void destroy();
    
    public AbstractKeyHandler() {
	/* empty */
    }

    abstract IKeyMessage popMessage();

}
