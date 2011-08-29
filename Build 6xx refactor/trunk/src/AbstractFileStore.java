/* Class216 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class AbstractFileStore
{
    abstract int getFileProgress(int argument_1_);
    
    abstract FileInformationTable getFIT();
    
    abstract void request(int argument_4_);
    
    public AbstractFileStore() {
	/* empty */
    }
    
    abstract byte[] getFile(int argument_6_);
}
