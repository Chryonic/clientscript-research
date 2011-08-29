/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class184 implements Interface18
{
    int anInt3694;
    Class349 aClass349_3695;
    int anInt3696;
    int anInt3697;
    int anInt3698;
    int anInt3699;
    Class44 aClass44_3700;
    boolean aBoolean3701;
    int anInt3702;
    int anInt3703;
    int anInt3704;
    
    static final void method2854(int argument, int argument_0_,
				 byte argument_1_, int argument_2_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(11, 13175,
            (long) argument_0_);
	class59_sub51_sub3.method1182(-72);
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6233 = argument_2_;
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231 = argument;
    }
    
    static final void method2855(int argument, byte argument_3_) {
	if (argument < 0 || argument > 2)
	    argument = 0;
	Node_Sub21.anInt4035 = argument;
	Class62_Sub5.aClass104_Sub7Array4384
	    = (new DoublyLinkedNodeP2_Sub7
	       [Class166.anIntArray1217[Node_Sub21.anInt4035] + 1]);
	Statics.anInt1997 = 0;
	Statics.anInt860 = 0;
    }
    
    Class184(int argument_4_, Class349 argument_5_, Class44 argument_6_,
	     int argument_7_, int argument_8_, int argument_9_,
	     int argument_10_, int argument_11_, int argument_12_,
	     int argument_13_, boolean argument_14_) {
	((Class184) this).anInt3704 = argument_11_;
	((Class184) this).aBoolean3701 = argument_14_;
	((Class184) this).aClass44_3700 = argument_6_;
	((Class184) this).anInt3694 = argument_13_;
	((Class184) this).anInt3697 = argument_7_;
	((Class184) this).anInt3696 = argument_10_;
	((Class184) this).anInt3703 = argument_8_;
	((Class184) this).aClass349_3695 = argument_5_;
	((Class184) this).anInt3699 = argument_4_;
	((Class184) this).anInt3702 = argument_12_;
	((Class184) this).anInt3698 = argument_9_;
    }
    
    public final Class128 method68(byte argument_15_) {
	if (argument_15_ > -35)
	    method2855(-82, (byte) 91);
	return Class84.aClass128_599;
    }
}
