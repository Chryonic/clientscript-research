package co.cc.peterbjornx.cs2ide.re;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/31/11
 * Time: 9:56 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public enum Cs2OperandUse {
    Immediate,
    IntLocalPtr,
    LongLocalPtr,
    StringLocalPtr,
    IntGlobalPtr,
    LongGlobalPtr,
    StringGlobalPtr,
    FunctionPtr,
    CodeOffset,
    IntStackDepth,
    StringStackDepth,
    IntConfigPtr,
    None,
    BitConfigPtr,
    ArrayGlobalPtr,
    LongStackDepth,
    SwitchBlockPtr

}
