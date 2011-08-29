/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GameEnum
{
    static GameEnum RUNESCAPE = new GameEnum("runescape", "RuneScape", 0);
    static GameEnum STELLARDAWN = new GameEnum("stellardawn", "Stellar Dawn", 1);;
    static GameEnum GAME2 = new GameEnum("game3", "Game 3", 2);
    static GameEnum GAME3 = new GameEnum("game4", "Game 4", 3);
    int id;
    static ClanChannel aClass59_Sub53_825;
    String name;
    private String niceName;

    static final RuntimeException_Sub2 method1753(Throwable argument,
						  String argument_0_) {
	RuntimeException_Sub2 runtimeexception_sub2;
	if (argument instanceof RuntimeException_Sub2) {
	    runtimeexception_sub2 = (RuntimeException_Sub2) argument;
	    ((RuntimeException_Sub2) runtimeexception_sub2).aString3424
		+= ' ' + (String) argument_0_;
	} else
	    runtimeexception_sub2
		= new RuntimeException_Sub2(argument, argument_0_);
	return runtimeexception_sub2;
    }

    public static void method3205(int argument) {
        RUNESCAPE = null;
    }

    public final String toString() {
	throw new IllegalStateException();
    }
    
    public static void method1754(int argument) {
	aClass59_Sub53_825 = null;
    }
    
    GameEnum(String argument_1_, String argument_2_, int argument_3_) {
	((GameEnum) this).name = argument_1_;
	((GameEnum) this).id = argument_3_;
        niceName = argument_2_;
    }
}
