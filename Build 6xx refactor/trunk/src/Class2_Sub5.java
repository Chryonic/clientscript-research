/* Class2_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2_Sub5 extends Class2
{
    static JagexHashMap aJagexHashMap_3787 = new JagexHashMap(8);

    final void method196(int argument_0_, byte argument_1_,
			 Interface7 argument_2_) {
	int anLocalInt = -9 % ((60 - argument_1_) / 61);
	((Class2) this).aClass_ha_Sub2_56.method2237(true, argument_2_);
	((Class2) this).aClass_ha_Sub2_56.method2216((byte) 96, argument_0_);
    }
    
    final void method195(byte argument_3_) {
	((Class2) this).aClass_ha_Sub2_56.method2192((byte) 18, false);
	if (argument_3_ < 54)
	    client.additionalInfo = null;
    }
    
    public static void method202(byte argument) {
	aJagexHashMap_3787 = null;
	client.additionalInfo = null;
    }
    
    Class2_Sub5(GraphicsToolkit_Sub2 argument_4_) {
	super(argument_4_);
    }
    
    final void method193(boolean argument_5_, int argument_6_) {
	if (argument_6_ != 2)
	    method195((byte) 27);
	((Class2) this).aClass_ha_Sub2_56.method2192((byte) 18, true);
    }
    
    final boolean method185(int argument_7_) {
	if (argument_7_ <= 53)
	    return false;
	return true;
    }
    
    final void method186(int argument_8_, int argument_9_,
			 boolean argument_10_) {
	if (argument_10_ != true)
	    method196(71, (byte) -89, null);
    }
    
    final void method189(int argument_11_, boolean argument_12_) {
	if (argument_11_ != 22789) {
	    /* empty */
	}
    }
}
