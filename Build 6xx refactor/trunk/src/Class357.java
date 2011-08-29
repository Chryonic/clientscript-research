/* Class357 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class357
{
    int anInt3019;
    private int anInt3020 = 2;
    int anInt3021;
    private int[] anIntArray3022 = new int[2];
    private int[] anIntArray3023 = new int[2];
    int anInt3024;
    private int anInt3025;
    private int anInt3026;
    private int anInt3027;
    private int anInt3028;
    private int anInt3029;
    
    final void method3937(Packet argument_0_) {
	anInt3020 = argument_0_.g1();
	anIntArray3022 = new int[anInt3020];
	anIntArray3023 = new int[anInt3020];
	for (int anLocalInt = 0; anLocalInt < anInt3020; anLocalInt++) {
	    anIntArray3022[anLocalInt] = argument_0_.g2();
	    anIntArray3023[anLocalInt] = argument_0_.g2();
	}
    }
    
    final void method3938(Packet argument_1_) {
	((Class357) this).anInt3019 = argument_1_.g1();
	((Class357) this).anInt3024 = argument_1_.g4();
	((Class357) this).anInt3021 = argument_1_.g4();
	method3937(argument_1_);
    }
    
    final int method3939(int argument_2_) {
	if (anInt3025 >= anInt3026) {
	    anInt3029 = anIntArray3023[anInt3028++] << 15;
	    if (anInt3028 >= anInt3020)
		anInt3028 = anInt3020 - 1;
	    anInt3026 = (int) ((double) anIntArray3022[anInt3028] / 65536.0
			       * (double) argument_2_);
	    if (anInt3026 > anInt3025)
		anInt3027 = (((anIntArray3023[anInt3028] << 15) - anInt3029)
			     / (anInt3026 - anInt3025));
	}
	anInt3029 += anInt3027;
	anInt3025++;
	return anInt3029 - anInt3027 >> 15;
    }
    
    public Class357() {
	anIntArray3022[0] = 0;
	anIntArray3022[1] = 65535;
	anIntArray3023[0] = 0;
	anIntArray3023[1] = 65535;
    }
    
    final void method3940() {
	anInt3026 = 0;
	anInt3028 = 0;
	anInt3027 = 0;
	anInt3029 = 0;
	anInt3025 = 0;
    }
}
