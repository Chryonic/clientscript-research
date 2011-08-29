import cs2.Cs2DecompileState;
import cs2.Cs2Type;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 8:59 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class Cs2Signature {
    private int integerParameters;
    private int stringParameters;
    private int longParameters;
    private int integerResults;
    private int stringResults;
    private int longResults;

    public Cs2Signature(int integerParameters, int stringParameters, int longParameters, int integerResults, int stringResults, int longResults) {
        this.integerParameters = integerParameters;
        this.stringParameters = stringParameters;
        this.longParameters = longParameters;
        this.integerResults = integerResults;
        this.stringResults = stringResults;
        this.longResults = longResults;
    }

    public int getIntegerParameters() {
        return integerParameters;
    }

    public int getStringParameters() {
        return stringParameters;
    }

    public int getLongParameters() {
        return longParameters;
    }

    public int getIntegerResults() {
        return integerResults;
    }

    public int getStringResults() {
        return stringResults;
    }

    public int getLongResults() {
        return longResults;
    }

    public String toParList(Cs2DecompileState s) {
        StringBuilder b = new StringBuilder();
        for (int i = 0;i < integerParameters;i++)
            b.append("int "+ s.getLocalVariable(i, Cs2Type.Int).getName()+",");
        for (int i = 0;i < stringParameters;i++)
            b.append("string "+ s.getLocalVariable(i, Cs2Type.String).getName()+",");
        for (int i = 0;i < longParameters;i++)
            b.append("long "+ s.getLocalVariable(i, Cs2Type.Long).getName()+",");
        return b.toString();
    }

    public String toAsmParList() {
        StringBuilder b = new StringBuilder();
        for (int i = 0;i < integerParameters;i++)
            b.append("int local"+i+",");
        for (int i = 0;i < stringParameters;i++)
            b.append("string local"+ i+",");
        for (int i = 0;i < longParameters;i++)
            b.append("long local"+ i+",");
        return b.toString();
    }
}
