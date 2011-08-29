/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class82
{
    static Class166 aClass166_584 = new Class166(93, 6);
    static int[] anIntArray585;
    
    public static void method1594(byte argument) {
	aClass166_584 = null;
	anIntArray585 = null;
    }
    
    static final void method1595(int argument, boolean argument_0_,
				 RsInterface argument_1_, int argument_2_) {
	Class_aa class_aa = argument_1_.method3213(0, Class389.aGraphicsToolkit3281);
	if (class_aa != null) {
	    Class389.aGraphicsToolkit3281.setClip(argument, (argument_2_ + ((RsInterface) argument_1_).renderHeight), (argument + ((RsInterface) argument_1_).renderWidth), argument_2_);
	    if (Node_Sub1.anInt3868 >= 3)
		Class389.aGraphicsToolkit3281.A(-16777216, class_aa, argument,
					 argument_2_);
	    else
		tia_sub_35_Sub1DoublyLinked.aClass368_6660.method4009
		    (((float) argument
		      + (float) ((RsInterface) argument_1_).renderWidth / 2.0F),
		     ((float) argument_2_
		      + (float) ((RsInterface) argument_1_).renderHeight / 2.0F),
		     4096, ((int) -DoublyLinkedNodeP2_Sub6.aFloat4538 & 0x3fff) << 2,
		     class_aa, argument, argument_2_);
	}
    }
    
    static final int method1596(int argument) {
	if (argument == (Class50.anInt365 ^ 0xffffffff))
	    return Class272.anInt2174;
	return 0;
    }
    
    static final void method1597(TextureSource argument, GraphicsToolkit argument_3_,
				 byte argument_4_) {
	if (Class179.aClass59_Sub51_Sub13_1320 != null) {
	    if (Class392.anInt3295 < 10) {
		if (!Class179.aJs5Store_1317.isLoaded(((DoublyLinkedNode_Sub51_Sub13) Class179.aClass59_Sub51_Sub13_1320).aString6291)) {
		    Class392.anInt3295
			= (Class147.aJs5Store_1116.getFileProgress((((DoublyLinkedNode_Sub51_Sub13) Class179.aClass59_Sub51_Sub13_1320).aString6291))) / 10;
		    return;
		}
		Statics.method2253();
		Class392.anInt3295 = 10;
	    }
	    if (Class392.anInt3295 == 10) {
		Class179.anInt1340
		    = ((DoublyLinkedNode_Sub51_Sub13)
		       Class179.aClass59_Sub51_Sub13_1320).anInt6303 >> 6 << 6;
		Class179.anInt1353
		    = ((DoublyLinkedNode_Sub51_Sub13)
		       Class179.aClass59_Sub51_Sub13_1320).anInt6290 >> 6 << 6;
		Class179.anInt1342
		    = (((DoublyLinkedNode_Sub51_Sub13)
			Class179.aClass59_Sub51_Sub13_1320).anInt6301
		       >> 6 << 6) - Class179.anInt1340 + 64;
		Class179.anInt1354
		    = (-Class179.anInt1353
		       + (((DoublyLinkedNode_Sub51_Sub13)
			   Class179.aClass59_Sub51_Sub13_1320).anInt6300
			  >> 6 << 6)
		       + 64);
		int[] anLocalInts = new int[3];
		int anLocalInt = -1;
		int anLocalInt_5_ = -1;
		if (Class179.aClass59_Sub51_Sub13_1320.method1260
		    (-67,
		     (MapRelated.baseZ
		      + ((((DoublyLinkedNodeP2_Sub2)
			   Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			  .worldZ)
			 >> 9)),
		     (MapRelated.baseX
		      + ((((DoublyLinkedNodeP2_Sub2)
			   Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			  .worldX)
			 >> 9)),
		     anLocalInts,
		     (((DoublyLinkedNodeP2_Sub2)
		       Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
		      .lightingHL))) {
		    anLocalInt_5_ = anLocalInts[2] - Class179.anInt1340;
		    anLocalInt = anLocalInts[1] - Class179.anInt1353;
		}
		if (!Class62_Sub28.aBoolean4461 && anLocalInt >= 0
		    && Class179.anInt1354 > anLocalInt && anLocalInt_5_ >= 0
		    && Class179.anInt1342 > anLocalInt_5_) {
		    anLocalInt += (int) (Math.random() * 10.0) - 5;
		    anLocalInt_5_ += (int) (Math.random() * 10.0) - 5;
		    Node_Sub31_Sub21.anInt5930 = anLocalInt;
		    AbstractFont.anInt418 = anLocalInt_5_;
		} else if (Class182.anInt1377 == -1
			   || Class45.anInt314 == -1) {
		    Class179.aClass59_Sub51_Sub13_1320.method1259
			((((DoublyLinkedNode_Sub51_Sub13)
			   Class179.aClass59_Sub51_Sub13_1320).anInt6298
			  & 0x3fff),
			 1,
			 (((DoublyLinkedNode_Sub51_Sub13)
			   Class179.aClass59_Sub51_Sub13_1320).anInt6298
			  & 0xfffe82a) >> 14,
			 anLocalInts);
		    Node_Sub31_Sub21.anInt5930
			= anLocalInts[1] - Class179.anInt1353;
		    AbstractFont.anInt418 = -Class179.anInt1340 + anLocalInts[2];
		} else {
		    Class179.aClass59_Sub51_Sub13_1320.method1259
			(Class45.anInt314, 1, Class182.anInt1377, anLocalInts);
		    if (anLocalInts != null) {
			AbstractFont.anInt418
			    = -Class179.anInt1340 + anLocalInts[2];
			Node_Sub31_Sub21.anInt5930
			    = -Class179.anInt1353 + anLocalInts[1];
		    }
		    Class62_Sub28.aBoolean4461 = false;
		    Class182.anInt1377 = Class45.anInt314 = -1;
		}
		if ((((DoublyLinkedNode_Sub51_Sub13) Class179.aClass59_Sub51_Sub13_1320)
		     .anInt6304)
		    != 37) {
		    if (((DoublyLinkedNode_Sub51_Sub13)
			 Class179.aClass59_Sub51_Sub13_1320).anInt6304
			!= 50) {
			if (((DoublyLinkedNode_Sub51_Sub13)
			     Class179.aClass59_Sub51_Sub13_1320).anInt6304
			    == 75)
			    Class179.aFloat1328 = Class179.aFloat1335 = 6.0F;
			else if (((DoublyLinkedNode_Sub51_Sub13)
				  Class179.aClass59_Sub51_Sub13_1320).anInt6304
				 != 100) {
			    if (((DoublyLinkedNode_Sub51_Sub13)
				 Class179.aClass59_Sub51_Sub13_1320).anInt6304
				!= 200)
				Class179.aFloat1328 = Class179.aFloat1335
				    = 8.0F;
			    else
				Class179.aFloat1328 = Class179.aFloat1335
				    = 16.0F;
			} else
			    Class179.aFloat1328 = Class179.aFloat1335 = 8.0F;
		    } else
			Class179.aFloat1328 = Class179.aFloat1335 = 4.0F;
		} else
		    Class179.aFloat1328 = Class179.aFloat1335 = 3.0F;
		Class179.anInt1332 = (int) Class179.aFloat1335 >> 1;
		Class179.aByteArrayArrayArray1326
		    = GlTexture_Sub4_Sub1.method2507(Class179.anInt1332, 8);
		Class279.method3417((byte) 73);
		Class179.method2804();
		Statics.aCyclicLinkedList_429 = new CyclicLinkedList();
		Class179.anInt1330 += (int) (Math.random() * 5.0) - 2;
		if (Class179.anInt1330 < -8)
		    Class179.anInt1330 = -8;
		if (Class179.anInt1330 > 8)
		    Class179.anInt1330 = 8;
		Class179.anInt1327 += (int) (Math.random() * 5.0) - 2;
		if (Class179.anInt1327 < -16)
		    Class179.anInt1327 = -16;
		if (Class179.anInt1327 > 16)
		    Class179.anInt1327 = 16;
		Class179.method2820(argument, Class179.anInt1330 >> 2 << 10,
				    Class179.anInt1327 >> 1);
		Class179.aClass20_1324.method314(1024, 1, 256);
		Class179.aClass374_1322.method4079(true, 256, 256);
		Class179.aClass257_1318.method3301(11, 4096);
		ClientVariables.varbitSource.resizeCache(256);
		Class392.anInt3295 = 20;
	    } else if (Class392.anInt3295 == 20) {
		Class293.method3500((byte) -52, true);
		Class179.method2818(argument_3_, Class179.anInt1330,
				    Class179.anInt1327);
		Class392.anInt3295 = 60;
		Class293.method3500((byte) -69, true);
		Class120.method2384(-33);
	    } else if (Class392.anInt3295 == 60) {
		if (!Class179.aJs5Store_1317.fileExists((((DoublyLinkedNode_Sub51_Sub13) Class179.aClass59_Sub51_Sub13_1320).aString6291) + "_staticelements"))
		    Class179.aClass114_1333 = new Class114(0);
		else {
		    if (!Class179.aJs5Store_1317.isLoaded((((DoublyLinkedNode_Sub51_Sub13) Class179.aClass59_Sub51_Sub13_1320).aString6291) + "_staticelements"))
			return;
		    Class179.aClass114_1333
			= (Statics.method1285((((DoublyLinkedNode_Sub51_Sub13) Class179.aClass59_Sub51_Sub13_1320).aString6291 + "_staticelements"), Class179.aJs5Store_1317, -69, Statics.aBoolean5559));
		}
		Class179.method2806();
		Class392.anInt3295 = 70;
		Class293.method3500((byte) -60, true);
		Class120.method2384(-33);
	    } else if (Class392.anInt3295 == 70) {
		Node_Sub31_Sub25.aClass244_5953
		    = new Class244(argument_3_, 11, true, Applet_Sub1.gameCanvas);
		Class392.anInt3295 = 73;
		Class293.method3500((byte) -98, true);
		Class120.method2384(-33);
	    } else if (Class392.anInt3295 == 73) {
		Class196.aClass244_1438
		    = new Class244(argument_3_, 12, true, Applet_Sub1.gameCanvas);
		Class392.anInt3295 = 76;
		Class293.method3500((byte) -67, true);
		Class120.method2384(-33);
	    } else if (Class392.anInt3295 == 76) {
		Class97.aClass244_757
		    = new Class244(argument_3_, 14, true, Applet_Sub1.gameCanvas);
		Class392.anInt3295 = 79;
		Class293.method3500((byte) -75, true);
		Class120.method2384(-33);
	    } else if (Class392.anInt3295 == 79) {
		Statics.aClass244_4117
		    = new Class244(argument_3_, 17, true, Applet_Sub1.gameCanvas);
		Class392.anInt3295 = 82;
		Class293.method3500((byte) -30, true);
		Class120.method2384(-33);
	    } else if (Class392.anInt3295 == 82) {
		Statics.aClass244_363
		    = new Class244(argument_3_, 19, true, Applet_Sub1.gameCanvas);
		Class392.anInt3295 = 85;
		Class293.method3500((byte) -52, true);
		Class120.method2384(-33);
	    } else if (Class392.anInt3295 == 85) {
		Class217.aClass244_1528
		    = new Class244(argument_3_, 22, true, Applet_Sub1.gameCanvas);
		Class392.anInt3295 = 88;
		Class293.method3500((byte) -120, true);
		Class120.method2384(-33);
	    } else if (Class392.anInt3295 == 88) {
		Class62_Sub22.aClass244_4436
		    = new Class244(argument_3_, 26, true, Applet_Sub1.gameCanvas);
		Class392.anInt3295 = 91;
		Class293.method3500((byte) -97, true);
		Class120.method2384(-33);
	    } else {
		Node_Sub31_Sub15.aClass244_5901
		    = new Class244(argument_3_, 30, true, Applet_Sub1.gameCanvas);
		Class392.anInt3295 = 100;
		Class293.method3500((byte) -86, true);
		Class120.method2384(-33);
		System.gc();
	    }
	}
    }
}
