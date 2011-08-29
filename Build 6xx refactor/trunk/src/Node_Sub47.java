/* Class59_Sub47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Node_Sub47 extends Node
{
    static int anInt4283 = -2;
    static Class207 aClass207_4284;
    static int anInt4285;
    static boolean aBoolean4286 = false;
    static int anInt4287;
    static int anInt4288;
    
    abstract void method1109(ClanSettings argument_0_, int argument_1_);
    
    abstract void method1110(int argument_2_, Packet argument_3_);
    
    static final void method1111(boolean argument, int argument_4_,
				 int argument_5_, String argument_6_,
				 int argument_7_) {
	RsInterface rsInterface
	    = RsInterface.getCreatedChild(argument_5_, argument_4_);
	if (rsInterface != null) {
	    if (rsInterface.anObjectArray1841 != null) {
		Cs2Trigger class59_sub27 = new Cs2Trigger();
		class59_sub27.anInt4109 = argument_7_;
		class59_sub27.aRsInterface_4115 = rsInterface;
		class59_sub27.event_opbase = argument_6_;
		class59_sub27.parameters
		    = rsInterface.anObjectArray1841;
		Cs2Runtime.executeTrigger(class59_sub27);
	    }
	    if (Statics.anInt1652 == 10
		&& client.method122(rsInterface).method712(19061,
							argument_7_ - 1)) {
		if (argument != true)
		    aBoolean4286 = true;
		if (argument_7_ == 1) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 53,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class371.aClass207_3187);
		    Class348.method3819(!argument,
					rsInterface.anInt1870,
					argument_5_, class59_sub29,
					argument_4_);
		    Class251.method3243(class59_sub29, true);
		}
		if (argument_7_ == 2) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 125,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Statics.aClass207_4339);
		    Class348.method3819(!argument,
					rsInterface.anInt1870,
					argument_5_, class59_sub29,
					argument_4_);
		    Class251.method3243(class59_sub29, true);
		}
		if (argument_7_ == 3) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 79,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Node_Sub16.aClass207_3999);
		    Class348.method3819(false, rsInterface.anInt1870,
					argument_5_, class59_sub29,
					argument_4_);
		    Class251.method3243(class59_sub29, true);
		}
		if (argument_7_ == 4) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 104,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class353_Sub5.aClass207_5501);
		    Class348.method3819(false, rsInterface.anInt1870,
					argument_5_, class59_sub29,
					argument_4_);
		    Class251.method3243(class59_sub29, argument);
		}
		if (argument_7_ == 5) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 44,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class101.aClass207_808);
		    Class348.method3819(!argument,
					rsInterface.anInt1870,
					argument_5_, class59_sub29,
					argument_4_);
		    Class251.method3243(class59_sub29, true);
		}
		if (argument_7_ == 6) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 37,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class2_Sub8.aClass207_3805);
		    Class348.method3819(!argument,
					rsInterface.anInt1870,
					argument_5_, class59_sub29,
					argument_4_);
		    Class251.method3243(class59_sub29, true);
		}
		if (argument_7_ == 7) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 62,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     InterleavedArrayElementEnum.aClass207_892);
		    Class348.method3819(false, rsInterface.anInt1870,
					argument_5_, class59_sub29,
					argument_4_);
		    Class251.method3243(class59_sub29, true);
		}
		if (argument_7_ == 8) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 38,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     (Node_Sub31_Sub24
					      .aClass207_5947));
		    Class348.method3819(!argument,
					rsInterface.anInt1870,
					argument_5_, class59_sub29,
					argument_4_);
		    Class251.method3243(class59_sub29, true);
		}
		if (argument_7_ == 9) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 87,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Node_Sub33.aClass207_4146);
		    Class348.method3819(false, rsInterface.anInt1870,
					argument_5_, class59_sub29,
					argument_4_);
		    Class251.method3243(class59_sub29, true);
		}
		if (argument_7_ == 10) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 95,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     (Statics
					      .aClass207_6644));
		    Class348.method3819(false, rsInterface.anInt1870,
					argument_5_, class59_sub29,
					argument_4_);
		    Class251.method3243(class59_sub29, true);
		}
	    }
	}
    }
    
    public static void method1112(byte argument) {
	aClass207_4284 = null;
    }
    
    static final void method1113(Signlink argument, Packet argument_8_,
				 byte argument_9_, int argument_10_) {
	Node_Sub14 class59_sub14 = new Node_Sub14();
	class59_sub14.anInt3989
	    = argument_8_.g1();
	class59_sub14.anInt3988 = argument_8_.g4();
	class59_sub14.anIntArray3986
	    = new int[class59_sub14.anInt3989];
	class59_sub14.aSignlinkRequestArray3984
	    = new SignlinkRequest[class59_sub14.anInt3989];
	class59_sub14.anIntArray3983
	    = new int[class59_sub14.anInt3989];
	class59_sub14.aByteArrayArrayArray3990
	    = new byte[class59_sub14.anInt3989][][];
	class59_sub14.aSignlinkRequestArray3987
	    = new SignlinkRequest[class59_sub14.anInt3989];
	class59_sub14.anIntArray3985
	    = new int[class59_sub14.anInt3989];
	for (int anLocalInt = 0;
	     anLocalInt < class59_sub14.anInt3989;
	     anLocalInt++) {
	    try {
		int anLocalInt_11_ = argument_8_.g1();
		if (anLocalInt_11_ != 0 && anLocalInt_11_ != 1
		    && anLocalInt_11_ != 2) {
		    if (anLocalInt_11_ == 3 || anLocalInt_11_ == 4) {
			String string = argument_8_.gstr();
			String string_12_ = argument_8_.gstr();
			int anLocalInt_13_
			    = argument_8_.g1();
			String[] strings = new String[anLocalInt_13_];
			for (int anLocalInt_14_ = 0;
			     anLocalInt_13_ > anLocalInt_14_; anLocalInt_14_++)
			    strings[anLocalInt_14_]
				= argument_8_.gstr();
			byte[][] anLocalInts = new byte[anLocalInt_13_][];
			if (anLocalInt_11_ == 3) {
			    for (int anLocalInt_15_ = 0;
				 anLocalInt_13_ > anLocalInt_15_;
				 anLocalInt_15_++) {
				int anLocalInt_16_ = argument_8_.g4();
				anLocalInts[anLocalInt_15_]
				    = new byte[anLocalInt_16_];
				argument_8_.gbytes((anLocalInts
                 [anLocalInt_15_]), 0,
                        anLocalInt_16_
                );
			    }
			}
			class59_sub14.anIntArray3985
			    [anLocalInt]
			    = anLocalInt_11_;
			Class[] var_classes = new Class[anLocalInt_13_];
			for (int anLocalInt_17_ = 0;
			     anLocalInt_13_ > anLocalInt_17_; anLocalInt_17_++)
			    var_classes[anLocalInt_17_]
				= (DoublyLinkedNodeP2_Sub2_Sub4.method1879
				   (strings[anLocalInt_17_], 23244));
			class59_sub14.aSignlinkRequestArray3987
			    [anLocalInt]
			    = (argument.requestDeclaredMethod(string_12_, var_classes, DoublyLinkedNodeP2_Sub2_Sub4.method1879(string, 23244)));
			class59_sub14
			    .aByteArrayArrayArray3990[anLocalInt]
			    = anLocalInts;
		    }
		} else {
		    String string = argument_8_.gstr();
		    String string_18_ = argument_8_.gstr();
		    int anLocalInt_19_ = 0;
		    if (anLocalInt_11_ == 1)
			anLocalInt_19_ = argument_8_.g4();
		    class59_sub14.anIntArray3985[anLocalInt]
			= anLocalInt_11_;
		    class59_sub14.anIntArray3986[anLocalInt]
			= anLocalInt_19_;
		    class59_sub14.aSignlinkRequestArray3984
			[anLocalInt]
			= argument.requestDeclaredField(DoublyLinkedNodeP2_Sub2_Sub4.method1879(string, 23244), string_18_);
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		class59_sub14.anIntArray3983[anLocalInt]
		    = -1;
	    } catch (SecurityException securityexception) {
		class59_sub14.anIntArray3983[anLocalInt]
		    = -2;
	    } catch (NullPointerException nullpointerexception) {
		class59_sub14.anIntArray3983[anLocalInt]
		    = -3;
	    } catch (Exception exception) {
		class59_sub14.anIntArray3983[anLocalInt]
		    = -4;
	    } catch (Throwable throwable) {
		class59_sub14.anIntArray3983[anLocalInt]
		    = -5;
	    }
	}
	int anLocalInt = -57 % ((46 - argument_9_) / 51);
	Class151.aCyclicLinkedList_1146.add(class59_sub14);
    }

    static {
	aClass207_4284 = new Class207(66, 3);
    }
}
