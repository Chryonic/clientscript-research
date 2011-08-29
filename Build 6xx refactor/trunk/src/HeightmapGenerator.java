/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 8/2/11
 * Time: 5:25 PM
 * To change this template use File | Ssettings | File Templates.
 */
public class HeightmapGenerator {
    static final int calculateTileHeight(int argument, int argument_0_, int argument_1_) {
	int anLocalInt
	    = (Class62_Sub4.method1370(0, 4, argument + 45365,
				       argument_0_ + 91923)
	       - 128
	       + (Class62_Sub4.method1370(0, 2, argument + 10294,
					  argument_0_ + 37821) - 128
		  >> 1)
	       + (Class62_Sub4.method1370(0, 1, argument, argument_0_) - 128
		  >> 2));
	anLocalInt = (int) ((double) anLocalInt * 0.3) + 35;
	if (anLocalInt < 10)
	    anLocalInt = 10;
	else if (anLocalInt > 60)
	    anLocalInt = 60;
	return anLocalInt;
    }
}
