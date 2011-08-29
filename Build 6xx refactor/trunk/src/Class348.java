/* Class348 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.URL;

final class Class348 implements Runnable
{
    private SignlinkRequest aSignlinkRequest_2912;
    private volatile boolean aBoolean2913;
    static int[] anIntArray2915 = new int[3];
    private Thread aThread2916;
    private Class32[] aClass32Array2917;
    
    static final void method3813(Js5Store argument, int argument_0_) {
	Statics.aJs5Store_4151 = argument;
    }
    
    public static void method3814(boolean argument) {
	anIntArray2915 = null;
	client.currentLoadingStatus = null;
    }
    
    public final void run() {
	try {
	    BufferedReader bufferedreader
		= new BufferedReader(new InputStreamReader((DataInputStream)
							   (aSignlinkRequest_2912
							    .result)));
	    String string = bufferedreader.readLine();
	    Class356 class356 = GlImageSkybox.method1756((byte) 52);
	    for (/**/; string != null; string = bufferedreader.readLine())
		class356.method3934(string, 126);
	    String[] strings = class356.method3932(-21445);
	    if (strings.length % 3 != 0)
		return;
	    aClass32Array2917 = new Class32[strings.length / 3];
	    for (int anLocalInt = 0; anLocalInt < strings.length;
		 anLocalInt += 3)
		aClass32Array2917[anLocalInt / 3]
		    = new Class32(strings[anLocalInt], strings[anLocalInt + 1],
				  strings[anLocalInt + 2]);
	} catch (java.io.IOException ioexception) {
	    /* empty */
	}
	aBoolean2913 = true;
    }

    static final void method3816(GraphicsToolkit argument, int argument_7_) {
	int anLocalInt = 0;
	int anLocalInt_8_ = 0;
	if (Class52.aBoolean391) {
	    anLocalInt = Node_Sub52.method1319(argument_7_ - 17976);
	    anLocalInt_8_ = Class82.method1596(argument_7_ - 18077);
	}
	int anLocalInt_9_ = -10660793;
	DoublyLinkedNodeP2_Sub2_Sub3_Sub2.method1876
	    (Node_Sub47_Sub6.anInt6177 + anLocalInt_8_, 74, -16777216,
	     Class204.anInt1457, anLocalInt_9_, Class356.anInt3016,
	     DoublyLinkedNode_Sub51_Sub15.anInt6320 + anLocalInt, argument);
	Class173.aAbstractFont_1286.method507
	    ((byte) 56, Node_Sub47_Sub6.anInt6177 + anLocalInt_8_ + 14, -1,
	     MultilanguageString.CHOOSE_OPTION.getLocalizedString(client.language),
	     anLocalInt_9_, anLocalInt + DoublyLinkedNode_Sub51_Sub15.anInt6320 + 3);
	int anLocalInt_10_ = client.mouseHandler.getX() + anLocalInt;
	if (argument_7_ == 18075) {
	    int anLocalInt_11_
		= anLocalInt_8_ + client.mouseHandler.getY();
	    if (RsInterface.aBoolean1949) {
		int anLocalInt_12_ = 0;
		for (DoublyLinkedNode_Sub51_Sub7 class59_sub51_sub7
			 = ((DoublyLinkedNode_Sub51_Sub7)
			    Node_Sub7.aDCyclicLinkedList_3920.getFirst());
		     class59_sub51_sub7 != null;
		     class59_sub51_sub7
			 = ((DoublyLinkedNode_Sub51_Sub7)
			    Node_Sub7.aDCyclicLinkedList_3920.getNext())) {
		    int anLocalInt_13_
			= anLocalInt_12_ * 16 + (Node_Sub47_Sub6.anInt6177
						 + anLocalInt_8_ + 31);
		    anLocalInt_12_++;
		    if (((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7).anInt6249
			!= 1)
			Class183.method2850(anLocalInt_11_,
					    (anLocalInt_8_
					     + Node_Sub47_Sub6.anInt6177),
					    argument,
					    (DoublyLinkedNode_Sub51_Sub15.anInt6320
					     + anLocalInt),
					    -256, -1, Class204.anInt1457,
					    Class356.anInt3016, anLocalInt_10_,
					    class59_sub51_sub7, anLocalInt_13_,
					    false);
		    else
			Class_aa.method162
			    (Class204.anInt1457, anLocalInt_13_,
			     anLocalInt_11_,
			     Node_Sub47_Sub6.anInt6177 + anLocalInt_8_,
			     argument,
			     ((MenuAction)
			      ((DoublyLinkedNode)
			       (((DCyclicLinkedList) ((DoublyLinkedNode_Sub51_Sub7)
					    class59_sub51_sub7).aDCyclicLinkedList_6250)
				.rootNode)).nextD),
			     anLocalInt_10_, -256,
			     anLocalInt + DoublyLinkedNode_Sub51_Sub15.anInt6320, -1,
			     Class356.anInt3016, true);
		}
		if (Statics.aClass59_Sub51_Sub7_581 != null) {
		    DoublyLinkedNodeP2_Sub2_Sub3_Sub2.method1876
			(Statics.anInt5520, 71, -16777216,
			 Statics.anInt6645, anLocalInt_9_,
			 DoublyLinkedNode_Sub51_Sub13.anInt6296,
			 Node_Sub20.anInt4026, argument);
		    anLocalInt_12_ = 0;
		    Class173.aAbstractFont_1286.method507
			((byte) 56, Statics.anInt5520 + 14, -1,
			 ((DoublyLinkedNode_Sub51_Sub7)
			  Statics.aClass59_Sub51_Sub7_581).aString6248,
			 anLocalInt_9_, Node_Sub20.anInt4026 + 3);
		    for (MenuAction class59_sub51_sub9
			     = ((MenuAction)
				((DoublyLinkedNode_Sub51_Sub7)
				 Statics.aClass59_Sub51_Sub7_581)
				    .aDCyclicLinkedList_6250
				    .getFirst());
			 class59_sub51_sub9 != null;
			 class59_sub51_sub9
			     = ((MenuAction)
				((DoublyLinkedNode_Sub51_Sub7)
				 Statics.aClass59_Sub51_Sub7_581)
				    .aDCyclicLinkedList_6250.getNext())) {
			int anLocalInt_14_ = (Statics.anInt5520 + 31
					      + anLocalInt_12_ * 16);
			anLocalInt_12_++;
			Class_aa.method162(Statics.anInt6645,
					   anLocalInt_14_, anLocalInt_11_,
					   Statics.anInt5520, argument,
					   class59_sub51_sub9, anLocalInt_10_,
					   -256, Node_Sub20.anInt4026, -1,
					   DoublyLinkedNode_Sub51_Sub13.anInt6296,
					   true);
		    }
		    Node_Sub13.method690(DoublyLinkedNode_Sub51_Sub13.anInt6296,
                    Statics.anInt6645,
                    Statics.anInt5520, -1,
                    Node_Sub20.anInt4026);
		}
	    } else {
		int anLocalInt_15_ = 0;
		for (MenuAction class59_sub51_sub9
			 = (MenuAction) DoublyLinkedNodeP2_Sub2_Sub1
						    .aCyclicLinkedList_6404
						    .getFirst();
		     class59_sub51_sub9 != null;
		     class59_sub51_sub9
			 = (MenuAction) DoublyLinkedNodeP2_Sub2_Sub1
						    .aCyclicLinkedList_6404
						    .getNext()) {
		    int anLocalInt_16_
			= (anLocalInt_8_ + (Node_Sub47_Sub6.anInt6177 + 31)
			   + ((Class62_Sub12.anInt4402 - 1 - anLocalInt_15_)
			      * 16));
		    anLocalInt_15_++;
		    Class_aa.method162
			(Class204.anInt1457, anLocalInt_16_, anLocalInt_11_,
			 Node_Sub47_Sub6.anInt6177 + anLocalInt_8_,
			 argument, class59_sub51_sub9, anLocalInt_10_, -256,
			 DoublyLinkedNode_Sub51_Sub15.anInt6320 + anLocalInt, -1,
			 Class356.anInt3016, true);
		}
	    }
	    Node_Sub13.method690(Class356.anInt3016, Class204.anInt1457,
                (Node_Sub47_Sub6.anInt6177
                        + anLocalInt_8_),
                -1,
                (DoublyLinkedNode_Sub51_Sub15.anInt6320
                        + anLocalInt));
	}
    }
    
    final Class32 method3817(boolean argument_17_, int argument_18_) {
	if (aClass32Array2917 == null || argument_18_ < 0
	    || argument_18_ >= aClass32Array2917.length)
	    return null;
	return aClass32Array2917[argument_18_];
    }
    
    final boolean method3818(byte argument_19_) {
	if (aBoolean2913)
	    return true;
	if (aSignlinkRequest_2912 == null) {
	    try {
		int anLocalInt
		    = (client.modeWhere != TestingStageEnum.LIVE
		       ? (((GameServer) client.gameServer).id
			  + 7000)
		       : 80);
		aSignlinkRequest_2912
		    = (Applet_Sub1.baseSignlink.requestURLDataInputStream(new URL("http://" + (((GameServer) client.gameServer).address) + ":" + anLocalInt + "/news.ws?game=" + ((GameEnum) client.selectedGame).id)));
	    } catch (java.net.MalformedURLException malformedurlexception) {
		return true;
	    }
	}
	if (aSignlinkRequest_2912 == null || aSignlinkRequest_2912.status == 2)
	    return true;
	if (aSignlinkRequest_2912.status != 1)
	    return false;
	if (aThread2916 == null) {
	    aThread2916 = new Thread(this);
	    aThread2916.start();
	}
	return aBoolean2913;
    }
    
    static final void method3819(boolean argument, int argument_20_,
				 int argument_21_, Node_Sub29 argument_22_,
				 int argument_23_) {
	((Node_Sub29) argument_22_).aClass59_Sub28_Sub1_4129
	    .p4(argument_21_);
	((Node_Sub29) argument_22_).aClass59_Sub28_Sub1_4129
	    .p2ip128(argument_20_);
	((Node_Sub29) argument_22_).aClass59_Sub28_Sub1_4129
	    .p2i_dupl(argument_23_);
	if (argument)
	    JagexStringUtils.concatenate(null, -83, -97);
    }
    
    public Class348() {
	/* empty */
    }
}
