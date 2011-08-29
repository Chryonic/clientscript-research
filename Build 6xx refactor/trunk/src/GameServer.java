/* Class335 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GameServer
{
    int primaryPort;
    private boolean aBoolean2740 = true;
    String address;
    private boolean aBoolean2742;
    int secundaryPort = 443;
    static Object anObject2744;
    int id;
    
    final SignlinkRequest method3746(byte argument_0_, Signlink argument_1_) {
	return argument_1_.requestSocket(((GameServer) this).address, (!aBoolean2740 ? ((GameServer) this).primaryPort : ((GameServer) this).secundaryPort), aBoolean2742);
    }
    
    public static void method3747(byte argument) {
	anObject2744 = null;
    }
    
    final boolean method3748(GameServer argument_2_, int argument_3_) {
	if (argument_2_ == null)
	    return false;
	if (((GameServer) argument_2_).id != ((GameServer) this).id
	    || !((GameServer) this).address
		    .equals(((GameServer) argument_2_).address))
	    return false;
	return true;
    }
    
    final void method3749(int argument_4_) {
	if (aBoolean2740) {
	    if (aBoolean2742)
		aBoolean2742 = false;
	    else
		aBoolean2740 = false;
	} else {
	    aBoolean2740 = true;
	    aBoolean2742 = true;
	}
    }
    
    public GameServer() {
	((GameServer) this).primaryPort = 43594;
	aBoolean2742 = false;
    }
}
