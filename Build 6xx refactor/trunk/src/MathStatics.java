/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 7/16/11
 * Time: 7:23 AM
 * To change this template use File | Ssettings | File Templates.
 */
public class MathStatics {
    static int XOR(int argument, int argument_2_) {
	return argument ^ argument_2_;
    }

    static int AND(int argument, int argument_19_) {
	return argument & argument_19_;
    }

    static int OR(int argument, int argument_0_) {
	return argument | argument_0_;
    }

    static final int and3ff(int value) {
	return value & 0x3ff;
    }

    static final int shl10(int value) {
        return value >>> 10;
    }

    static final int method2589(int argument) {
	argument--;
	argument |= argument >>> 1;
	argument |= argument >>> 2;
	argument |= argument >>> 4;
	argument |= argument >>> 8;
	argument |= argument >>> 16;
	return argument + 1;
    }
}
