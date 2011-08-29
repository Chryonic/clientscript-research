/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

final class TestingStageEnum
{
    static TestingStageEnum LIVE = new TestingStageEnum("LIVE", "", "", 0);
    static TestingStageEnum WTRC = new TestingStageEnum("WTRC", "office", "_rc", 1);
    static TestingStageEnum WTQA = new TestingStageEnum("WTQA", "office", "_qa", 2);
    static TestingStageEnum WTWIP = new TestingStageEnum("WTWIP", "office", "_wip", 3);
    static TestingStageEnum WTI = new TestingStageEnum("WTI", "office", "_wti", 5);
    static TestingStageEnum LOCAL = new TestingStageEnum("LOCAL", "", "local", 4);
    static TestingStageEnum INTBETA = new TestingStageEnum("INTBETA", "office", "_intbeta", 6);
    int anInt1045;

    static final TestingStageEnum forId(int argument_57_) {
	TestingStageEnum[] testingStageEnums = Applet_Sub1.getTestingStages(true);
	for (int anLocalInt = 0; testingStageEnums.length > anLocalInt; anLocalInt++) {
	    TestingStageEnum testingStageEnum = testingStageEnums[anLocalInt];
	    if (argument_57_ == ((TestingStageEnum) testingStageEnum).anInt1045)
		return testingStageEnum;
	}
	return null;
    }

    static final boolean isValid(TestingStageEnum argument) {
	if (argument != WTRC
	    && WTQA != argument
	    && WTWIP != argument
	    && argument != WTI
	    && INTBETA != argument)
	    return false;
	return true;
    }

    public final String toString() {
	throw new IllegalStateException();
    }

    TestingStageEnum(String argument_5_, String argument_6_, String argument_7_,
                     int argument_8_) {
	((TestingStageEnum) this).anInt1045 = argument_8_;
    }
}
