/* Class307 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

abstract class Class307
{
    static final void method3600
	(int argument, int argument_0_, int argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_, int argument_6_,
	 int argument_7_) {
	if (argument_4_ >= 1 && argument >= 1
	    && MapRelated.mapWidth - 2 >= argument_4_
	    && argument <= MapRelated.mapDepth - 2) {
	    int anLocalInt = argument_7_;
	    if (anLocalInt < 3
		&& Class274.method3388(argument_4_, argument, 1))
		anLocalInt++;
	    if ((((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		     .aClass62_Sub25_4332.method1458(49) == 0
		 && !Class239.method3126(argument, argument_4_,
					 Statics.anInt136, false, anLocalInt))
		|| GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676 == null)
		return;
	    Class130.aClass303_Sub1_1055.method3577((MapRelated.clippingMaps
						     [argument_7_]),
						    argument_4_,
						    Class389.aGraphicsToolkit3281,
						    argument, (byte) -102,
						    argument_6_, argument_7_);
	    if (argument_2_ >= 0) {
		int anLocalInt_8_
		    = ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			  .aClass62_Sub7_4307.method1384(68);
		AthmosphericConditions.aClass59_Sub50_116.method1159(1,
						      (((Node_Sub50)
							(AthmosphericConditions
							 .aClass59_Sub50_116))
						       .aClass62_Sub7_4307),
						      103);
		Class130.aClass303_Sub1_1055.addObjectToRenderer(Class389.aGraphicsToolkit3281, argument_2_, anLocalInt, argument_0_, true, argument, argument_5_, argument_1_, argument_7_, argument_4_, MapRelated.clippingMaps[argument_7_]);
		AthmosphericConditions.aClass59_Sub50_116.method1159(anLocalInt_8_,
						      (((Node_Sub50)
							(AthmosphericConditions
							 .aClass59_Sub50_116))
						       .aClass62_Sub7_4307),
						      argument_3_ + 118);
	    }
	}
	if (argument_3_ != -1) {
	    /* empty */
	}
    }
    
    abstract void method3601(int argument_9_);
    
    abstract void method3602(int argument_10_, int argument_11_,
			     int argument_12_,
			     byte[] argument_13_) throws IOException;
    
    public Class307() {
	/* empty */
    }
    
    abstract boolean method3603(int argument_14_, int argument_15_)
	throws IOException;
    
    abstract void method3604(int argument_16_);
    
    static final boolean method3605(int argument, int argument_17_,
				    int argument_18_) {
	if ((argument & 0x37) == 0)
	    return false;
	return true;
    }
    
    abstract int method3606(int argument_19_, int argument_20_,
			    byte[] argument_21_,
			    int argument_22_) throws IOException;
}
