/* Class59_Sub48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class KeyMessage extends Node implements IKeyMessage
{
    int action;
    int modifiers;
    int keyCode;
    char keyChar;
    long eventTime;
    
    public final long getEventTime() {
	    return this.eventTime;
    }

    public final int getAction() {
	    return this.action;
    }

    public final int getModifiers() {
	    return this.modifiers;
    }

    public final char getKeyChar() {
	    return this.keyChar;
    }
    
    public final int getKeyCode() {
        return this.keyCode;
    }
}
