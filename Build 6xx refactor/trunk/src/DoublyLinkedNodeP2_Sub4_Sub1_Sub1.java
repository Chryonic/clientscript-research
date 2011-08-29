/* Class104_Sub4_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub4_Sub1_Sub1 extends DoublyLinkedNodeP2_Sub4_Sub1
{
    private short aShort6816;
    private int anInt6817;
    private short aShort6818;
    private short aShort6819;
    private short aShort6820;
    private short aShort6821;
    private int anInt6822;
    private short aShort6823;
    DoublyLinkedNodeP2_Sub6 aClass104_Sub6_6824;
    
    private final void method1906() {
	int anLocalInt
	    = (((DoublyLinkedNodeP2_Sub7)
		((DoublyLinkedNodeP2_Sub6) (((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this)
				  .aClass104_Sub6_6824)).aClass104_Sub7_4541)
	       .anInt4564);
	if ((((DoublyLinkedNodeP2_Sub7)
	      ((DoublyLinkedNodeP2_Sub6) (((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this)
				.aClass104_Sub6_6824)).aClass104_Sub7_4541)
	     .aClass104_Sub4_Sub1_Sub1Array4559[anLocalInt])
	    != null)
	    ((DoublyLinkedNodeP2_Sub7)
	     ((DoublyLinkedNodeP2_Sub6) (((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this)
			       .aClass104_Sub6_6824)).aClass104_Sub7_4541)
		.aClass104_Sub4_Sub1_Sub1Array4559[anLocalInt].method1908();
	((DoublyLinkedNodeP2_Sub7) (((DoublyLinkedNodeP2_Sub6) (((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this)
					    .aClass104_Sub6_6824))
			  .aClass104_Sub7_4541))
	    .aClass104_Sub4_Sub1_Sub1Array4559[anLocalInt]
	    = this;
	aShort6820
	    = (short) ((DoublyLinkedNodeP2_Sub7)
		       (((DoublyLinkedNodeP2_Sub6)
			 ((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this).aClass104_Sub6_6824)
			.aClass104_Sub7_4541)).anInt4564;
	((DoublyLinkedNodeP2_Sub7) (((DoublyLinkedNodeP2_Sub6) (((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this)
					    .aClass104_Sub6_6824))
			  .aClass104_Sub7_4541)).anInt4564
	    = anLocalInt + 1 & 0x1fff;
	((DoublyLinkedNodeP2_Sub6) ((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this).aClass104_Sub6_6824)
	    .aClass366_4539.method3983(this, (byte) 119);
    }
    
    final void method1907(GraphicsToolkit argument_0_, long argument_1_) {
	int anLocalInt
	    = ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6435 >> LightingManager.lightCoordRShift + 12;
	int anLocalInt_2_
	    = ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6432 >> LightingManager.lightCoordRShift + 12;
	int anLocalInt_3_ = ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6430 >> 12;
	if (anLocalInt_3_ > 0 || anLocalInt_3_ < -262144 || anLocalInt < 0
	    || anLocalInt >= LightingManager.xMapSize || anLocalInt_2_ < 0
	    || anLocalInt_2_ >= LightingManager.zMapSize)
	    method1908();
	else {
	    DoublyLinkedNodeP2_Sub7 class104_sub7
		= (((DoublyLinkedNodeP2_Sub6)
		    ((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this).aClass104_Sub6_6824)
		   .aClass104_Sub7_4541);
	    Class224 class224
		= (((DoublyLinkedNodeP2_Sub6)
		    ((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this).aClass104_Sub6_6824)
		   .aClass224_4549);
	    Class_s[] class_ses = Node_Sub31_Sub5.aClass_sArray5858;
	    int anLocalInt_4_ = ((DoublyLinkedNodeP2_Sub7) class104_sub7).anInt4570;
	    Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
				 [((DoublyLinkedNodeP2_Sub7) class104_sub7).anInt4570]
				 [anLocalInt][anLocalInt_2_]);
	    if (class148 != null)
		anLocalInt_4_ = ((Class148) class148).aByte1129;
	    int anLocalInt_5_
		= class_ses[anLocalInt_4_].method3534(anLocalInt, false,
						      anLocalInt_2_);
	    int anLocalInt_6_;
	    if (anLocalInt_4_ < LightingManager.yMapSize - 1)
		anLocalInt_6_
		    = class_ses[anLocalInt_4_ + 1]
			  .method3534(anLocalInt, false, anLocalInt_2_);
	    else
		anLocalInt_6_ = anLocalInt_5_ - (8 << LightingManager.lightCoordRShift);
	    if (((Class224) class224).aBoolean1565) {
		if (((Class224) class224).anInt1569 == -1
		    && anLocalInt_3_ > anLocalInt_5_) {
		    method1908();
		    return;
		}
		if (((Class224) class224).anInt1569 >= 0
		    && (anLocalInt_3_
			> class_ses[((Class224) class224).anInt1569]
			      .method3534(anLocalInt, false, anLocalInt_2_))) {
		    method1908();
		    return;
		}
		if (((Class224) class224).anInt1608 == -1
		    && anLocalInt_3_ < anLocalInt_6_) {
		    method1908();
		    return;
		}
		if (((Class224) class224).anInt1608 >= 0
		    && (anLocalInt_3_
			< class_ses[((Class224) class224).anInt1608 + 1]
			      .method3534(anLocalInt, false, anLocalInt_2_))) {
		    method1908();
		    return;
		}
	    }
	    int anLocalInt_7_;
	    for (anLocalInt_7_ = LightingManager.yMapSize - 1;
		 (anLocalInt_7_ > 0
		  && (anLocalInt_3_
		      > class_ses[anLocalInt_7_].method3534(anLocalInt, false,
							    anLocalInt_2_)));
		 anLocalInt_7_--) {
		/* empty */
	    }
	    if (((Class224) class224).aBoolean1574 && anLocalInt_7_ == 0
		&& anLocalInt_3_ > class_ses[0].method3534(anLocalInt, false,
							   anLocalInt_2_))
		method1908();
	    else if (anLocalInt_7_ == LightingManager.yMapSize - 1
		     && (class_ses[anLocalInt_7_].method3534(anLocalInt, false,
							     anLocalInt_2_)
			 - anLocalInt_3_) > 8 << LightingManager.lightCoordRShift)
		method1908();
	    else {
		class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			    [anLocalInt_7_][anLocalInt][anLocalInt_2_]);
		if (class148 == null) {
		    if (anLocalInt_7_ == 0
			|| (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[0]
			    [anLocalInt][anLocalInt_2_]) == null)
			class148
			    = GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[0]
				  [anLocalInt][anLocalInt_2_]
			    = new Class148(0);
		    boolean anLocalBoolean
			= ((((Class148) (GraphicsToolkit_Sub2
					 .aClass148ArrayArrayArray4676[0]
					 [anLocalInt][anLocalInt_2_]))
			    .aClass148_1135)
			   != null);
		    if (anLocalInt_7_ == 3 && anLocalBoolean) {
			method1908();
			return;
		    }
		    for (int anLocalInt_8_ = 1; anLocalInt_8_ <= anLocalInt_7_;
			 anLocalInt_8_++) {
			if ((GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			     [anLocalInt_8_][anLocalInt][anLocalInt_2_])
			    == null) {
			    class148
				= GraphicsToolkit_Sub2
				      .aClass148ArrayArrayArray4676
				      [anLocalInt_8_][anLocalInt]
				      [anLocalInt_2_]
				= new Class148(anLocalInt_8_);
			    if (anLocalBoolean)
				((Class148) class148).aByte1129++;
			}
		    }
		}
		if (((Class224) class224).aBoolean1570) {
		    int anLocalInt_9_
			= ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6435 >> 12;
		    int anLocalInt_10_
			= ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6432 >> 12;
		    if (((Class148) class148).aClass104_Sub2_Sub3_1124
			!= null) {
			Class80 class80
			    = ((Class148) class148)
				  .aClass104_Sub2_Sub3_1124
				  .method1769(argument_0_, (byte) -126);
			if (class80 != null
			    && class80.method1589(anLocalInt_10_,
						  anLocalInt_3_, (byte) -126,
						  anLocalInt_9_)) {
			    method1908();
			    return;
			}
		    }
		    if (((Class148) class148).aClass104_Sub2_Sub3_1123
			!= null) {
			Class80 class80
			    = ((Class148) class148)
				  .aClass104_Sub2_Sub3_1123
				  .method1769(argument_0_, (byte) -126);
			if (class80 != null
			    && class80.method1589(anLocalInt_10_,
						  anLocalInt_3_, (byte) -122,
						  anLocalInt_9_)) {
			    method1908();
			    return;
			}
		    }
		    if (((Class148) class148).aClass104_Sub2_Sub4_1134
			!= null) {
			Class80 class80
			    = ((Class148) class148)
				  .aClass104_Sub2_Sub4_1134
				  .method1769(argument_0_, (byte) -126);
			if (class80 != null
			    && class80.method1589(anLocalInt_10_,
						  anLocalInt_3_, (byte) -125,
						  anLocalInt_9_)) {
			    method1908();
			    return;
			}
		    }
		    for (Class110 class110
			     = ((Class148) class148).aClass110_1126;
			 class110 != null;
			 class110 = ((Class110) class110).aClass110_912) {
			Class80 class80
			    = ((Class110) class110).aClass104_Sub2_Sub2_911
				  .method1769(argument_0_, (byte) -126);
			if (class80 != null
			    && class80.method1589(anLocalInt_10_,
						  anLocalInt_3_, (byte) -95,
						  anLocalInt_9_)) {
			    method1908();
			    return;
			}
		    }
		}
		((Class72) ((DoublyLinkedNodeP2_Sub7) class104_sub7).aClass72_4572)
		    .aClass119_497.method2377((byte) 45, this);
	    }
	}
    }
    
    final void method1908() {
	((DoublyLinkedNodeP2_Sub7) (((DoublyLinkedNodeP2_Sub6) (((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this)
					    .aClass104_Sub6_6824))
			  .aClass104_Sub7_4541))
	    .aClass104_Sub4_Sub1_Sub1Array4559[aShort6820]
	    = null;
	Class253_Sub3.aClass104_Sub4_Sub1_Sub1Array5678[Class109.anInt904]
	    = this;
	Class109.anInt904 = Class109.anInt904 + 1 & 0x3ff;
	this.unlink();
	this.method1901((byte) 82);
    }
    
    final void method1909(long argument_11_, int argument_12_) {
	aShort6818 -= argument_12_;
	if (aShort6818 <= 0)
	    method1908();
	else {
	    int anLocalInt = ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6435 >> 12;
	    int anLocalInt_13_ = ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6430 >> 12;
	    int anLocalInt_14_ = ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6432 >> 12;
	    DoublyLinkedNodeP2_Sub7 class104_sub7
		= (((DoublyLinkedNodeP2_Sub6)
		    ((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this).aClass104_Sub6_6824)
		   .aClass104_Sub7_4541);
	    Class224 class224
		= (((DoublyLinkedNodeP2_Sub6)
		    ((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this).aClass104_Sub6_6824)
		   .aClass224_4549);
	    if (((Class224) class224).anInt1579 != 0) {
		if (aShort6816 - aShort6818
		    <= ((Class224) class224).anInt1566) {
		    int anLocalInt_15_
			= ((((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6439 >> 8
			    & 0xff00)
			   + (anInt6817 >> 16 & 0xff)
			   + ((Class224) class224).anInt1607 * argument_12_);
		    int anLocalInt_16_
			= ((((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6439 & 0xff00)
			   + (anInt6817 >> 8 & 0xff)
			   + ((Class224) class224).anInt1628 * argument_12_);
		    int anLocalInt_17_
			= ((((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6439 << 8
			    & 0xff00)
			   + (anInt6817 & 0xff)
			   + ((Class224) class224).anInt1625 * argument_12_);
		    if (anLocalInt_15_ < 0)
			anLocalInt_15_ = 0;
		    else if (anLocalInt_15_ > 65535)
			anLocalInt_15_ = 65535;
		    if (anLocalInt_16_ < 0)
			anLocalInt_16_ = 0;
		    else if (anLocalInt_16_ > 65535)
			anLocalInt_16_ = 65535;
		    if (anLocalInt_17_ < 0)
			anLocalInt_17_ = 0;
		    else if (anLocalInt_17_ > 65535)
			anLocalInt_17_ = 65535;
		    ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6439 &= ~0xffffff;
		    ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6439
			|= (((anLocalInt_15_ & 0xff00) << 8)
			    + (anLocalInt_16_ & 0xff00)
			    + ((anLocalInt_17_ & 0xff00) >> 8));
		    anInt6817 &= ~0xffffff;
		    anInt6817 |= (((anLocalInt_15_ & 0xff) << 16)
				  + ((anLocalInt_16_ & 0xff) << 8)
				  + (anLocalInt_17_ & 0xff));
		}
		if (aShort6816 - aShort6818
		    <= ((Class224) class224).anInt1613) {
		    int anLocalInt_18_
			= ((((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6439 >> 16
			    & 0xff00)
			   + (anInt6817 >> 24 & 0xff)
			   + ((Class224) class224).anInt1620 * argument_12_);
		    if (anLocalInt_18_ < 0)
			anLocalInt_18_ = 0;
		    else if (anLocalInt_18_ > 65535)
			anLocalInt_18_ = 65535;
		    ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6439 &= 0xffffff;
		    ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6439
			|= (anLocalInt_18_ & 0xff00) << 16;
		    anInt6817 &= 0xffffff;
		    anInt6817 |= (anLocalInt_18_ & 0xff) << 24;
		}
	    }
	    if (((Class224) class224).anInt1589 != -1
		&& aShort6816 - aShort6818 <= ((Class224) class224).anInt1626)
		anInt6822 += ((Class224) class224).anInt1568 * argument_12_;
	    if (((Class224) class224).anInt1622 != -1
		&& aShort6816 - aShort6818 <= ((Class224) class224).anInt1627)
		((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6431
		    += ((Class224) class224).anInt1617 * argument_12_;
	    double d = (double) aShort6821;
	    double d_19_ = (double) aShort6819;
	    double d_20_ = (double) aShort6823;
	    boolean anLocalBoolean = false;
	    if (((Class224) class224).anInt1602 == 1) {
		int anLocalInt_21_
		    = (anLocalInt
		       - (((Class242) ((DoublyLinkedNodeP2_Sub6)
				       (((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this)
					.aClass104_Sub6_6824)).aClass242_4546)
			  .anInt1767));
		int anLocalInt_22_
		    = (anLocalInt_13_
		       - (((Class242) ((DoublyLinkedNodeP2_Sub6)
				       (((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this)
					.aClass104_Sub6_6824)).aClass242_4546)
			  .anInt1758));
		int anLocalInt_23_
		    = (anLocalInt_14_
		       - (((Class242) ((DoublyLinkedNodeP2_Sub6)
				       (((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this)
					.aClass104_Sub6_6824)).aClass242_4546)
			  .anInt1766));
		int anLocalInt_24_
		    = (int) Math.sqrt((double) (anLocalInt_21_ * anLocalInt_21_
						+ (anLocalInt_22_
						   * anLocalInt_22_)
						+ (anLocalInt_23_
						   * anLocalInt_23_))) >> 2;
		long l = (long) (((Class224) class224).anInt1611
				 * anLocalInt_24_ * argument_12_);
		anInt6822 -= (long) anInt6822 * l >> 18;
	    } else if (((Class224) class224).anInt1602 == 2) {
		int anLocalInt_25_
		    = (anLocalInt
		       - (((Class242) ((DoublyLinkedNodeP2_Sub6)
				       (((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this)
					.aClass104_Sub6_6824)).aClass242_4546)
			  .anInt1767));
		int anLocalInt_26_
		    = (anLocalInt_13_
		       - (((Class242) ((DoublyLinkedNodeP2_Sub6)
				       (((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this)
					.aClass104_Sub6_6824)).aClass242_4546)
			  .anInt1758));
		int anLocalInt_27_
		    = (anLocalInt_14_
		       - (((Class242) ((DoublyLinkedNodeP2_Sub6)
				       (((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this)
					.aClass104_Sub6_6824)).aClass242_4546)
			  .anInt1766));
		int anLocalInt_28_ = (anLocalInt_25_ * anLocalInt_25_
				      + anLocalInt_26_ * anLocalInt_26_
				      + anLocalInt_27_ * anLocalInt_27_);
		long l = (long) (((Class224) class224).anInt1611
				 * anLocalInt_28_ * argument_12_);
		anInt6822 -= (long) anInt6822 * l >> 28;
	    }
	    if (((Class224) class224).anIntArray1583 != null) {
		Node node = (((CyclicLinkedList) (((DoublyLinkedNodeP2_Sub7) class104_sub7)
						.aCyclicLinkedList_4569))
				   .rootNode);
		for (Node node_29_ = ((Node) node).next;
		     node_29_ != node;
		     node_29_ = ((Node) node_29_).next) {
		    DoublyLinkedNode_Sub51_Sub18 class59_sub51_sub18
			= (DoublyLinkedNode_Sub51_Sub18) node_29_;
		    Class47 class47
			= (((DoublyLinkedNode_Sub51_Sub18) class59_sub51_sub18)
			   .aClass47_6349);
		    if (((Class47) class47).anInt334 != 1) {
			boolean anLocalBoolean_30_ = false;
			for (int anLocalInt_31_ = 0;
			     (anLocalInt_31_
			      < ((Class224) class224).anIntArray1583.length);
			     anLocalInt_31_++) {
			    if ((((Class224) class224).anIntArray1583
				 [anLocalInt_31_])
				== ((Class47) class47).anInt325) {
				anLocalBoolean_30_ = true;
				break;
			    }
			}
			if (anLocalBoolean_30_) {
			    double d_32_
				= (double) (anLocalInt
					    - ((DoublyLinkedNode_Sub51_Sub18)
					       class59_sub51_sub18).anInt6351);
			    double d_33_
				= (double) (anLocalInt_13_
					    - ((DoublyLinkedNode_Sub51_Sub18)
					       class59_sub51_sub18).anInt6345);
			    double d_34_
				= (double) (anLocalInt_14_
					    - ((DoublyLinkedNode_Sub51_Sub18)
					       class59_sub51_sub18).anInt6347);
			    double d_35_ = (d_32_ * d_32_ + d_33_ * d_33_
					    + d_34_ * d_34_);
			    if (!(d_35_
				  > (double) ((Class47) class47).aLong324)) {
				double d_36_ = Math.sqrt(d_35_);
				if (d_36_ == 0.0)
				    d_36_ = 1.0;
				double d_37_
				    = (((d_32_
					 * (double) (((DoublyLinkedNode_Sub51_Sub18)
						      class59_sub51_sub18)
						     .anInt6346))
					+ d_33_ * (double) (((Class47) class47)
							    .anInt323)
					+ (d_34_
					   * (double) (((DoublyLinkedNode_Sub51_Sub18)
							class59_sub51_sub18)
						       .anInt6350)))
				       * 65535.0
				       / ((double) ((Class47) class47).anInt329
					  * d_36_));
				if (!(d_37_ < (double) (((Class47) class47)
							.anInt327))) {
				    double d_38_ = 0.0;
				    if (((Class47) class47).anInt326 == 1)
					d_38_
					    = (d_36_ / 16.0
					       * (double) (((Class47) class47)
							   .anInt328));
				    else if (((Class47) class47).anInt326 == 2)
					d_38_
					    = (d_36_ / 16.0 * (d_36_ / 16.0)
					       * (double) (((Class47) class47)
							   .anInt328));
				    if (((Class47) class47).anInt337 == 0) {
					if (((Class47) class47).anInt332
					    == 0) {
					    d += (((double) (((DoublyLinkedNode_Sub51_Sub18)
							      class59_sub51_sub18)
							     .anInt6346)
						   - d_38_)
						  * (double) argument_12_);
					    d_19_ += (((double) (((Class47)
								  class47)
								 .anInt323)
						       - d_38_)
						      * (double) argument_12_);
					    d_20_
						+= (((double) (((DoublyLinkedNode_Sub51_Sub18)
								class59_sub51_sub18)
							       .anInt6350)
						     - d_38_)
						    * (double) argument_12_);
					    anLocalBoolean = true;
					} else {
					    ((DoublyLinkedNodeP2_Sub4_Sub1) this)
						.anInt6435
						+= (((double) (((DoublyLinkedNode_Sub51_Sub18)
								class59_sub51_sub18)
							       .anInt6346)
						     - d_38_)
						    * (double) argument_12_);
					    ((DoublyLinkedNodeP2_Sub4_Sub1) this)
						.anInt6430
						+= (((double) (((Class47)
								class47)
							       .anInt323)
						     - d_38_)
						    * (double) argument_12_);
					    ((DoublyLinkedNodeP2_Sub4_Sub1) this)
						.anInt6432
						+= (((double) (((DoublyLinkedNode_Sub51_Sub18)
								class59_sub51_sub18)
							       .anInt6350)
						     - d_38_)
						    * (double) argument_12_);
					}
				    } else {
					double d_39_
					    = (d_32_ / d_36_
					       * (double) (((Class47) class47)
							   .anInt329));
					double d_40_
					    = (d_33_ / d_36_
					       * (double) (((Class47) class47)
							   .anInt329));
					double d_41_
					    = (d_34_ / d_36_
					       * (double) (((Class47) class47)
							   .anInt329));
					if (((Class47) class47).anInt332
					    == 0) {
					    d += d_39_ * (double) argument_12_;
					    d_19_ += (d_40_
						      * (double) argument_12_);
					    d_20_ += (d_41_
						      * (double) argument_12_);
					    anLocalBoolean = true;
					} else {
					    ((DoublyLinkedNodeP2_Sub4_Sub1) this)
						.anInt6435
						+= (d_39_
						    * (double) argument_12_);
					    ((DoublyLinkedNodeP2_Sub4_Sub1) this)
						.anInt6430
						+= (d_40_
						    * (double) argument_12_);
					    ((DoublyLinkedNodeP2_Sub4_Sub1) this)
						.anInt6432
						+= (d_41_
						    * (double) argument_12_);
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (((Class224) class224).anIntArray1614 != null) {
		for (int anLocalInt_42_ = 0;
		     (anLocalInt_42_
		      < ((Class224) class224).anIntArray1614.length);
		     anLocalInt_42_++) {
		    DoublyLinkedNode_Sub51_Sub18 class59_sub51_sub18
			= ((DoublyLinkedNode_Sub51_Sub18)
			   (Node_Sub47_Sub12.aClass325_6217.method3685
			    (5, (long) (((Class224) class224).anIntArray1614
					[anLocalInt_42_]))));
		    while (class59_sub51_sub18 != null) {
			Class47 class47
			    = (((DoublyLinkedNode_Sub51_Sub18) class59_sub51_sub18)
			       .aClass47_6349);
			double d_43_
			    = (double) (anLocalInt
					- ((DoublyLinkedNode_Sub51_Sub18)
					   class59_sub51_sub18).anInt6351);
			double d_44_
			    = (double) (anLocalInt_13_
					- ((DoublyLinkedNode_Sub51_Sub18)
					   class59_sub51_sub18).anInt6345);
			double d_45_
			    = (double) (anLocalInt_14_
					- ((DoublyLinkedNode_Sub51_Sub18)
					   class59_sub51_sub18).anInt6347);
			double d_46_
			    = d_43_ * d_43_ + d_44_ * d_44_ + d_45_ * d_45_;
			if (d_46_ > (double) ((Class47) class47).aLong324)
			    class59_sub51_sub18
				= ((DoublyLinkedNode_Sub51_Sub18)
				   Node_Sub47_Sub12.aClass325_6217
				       .method3683((byte) -79));
			else {
			    double d_47_ = Math.sqrt(d_46_);
			    if (d_47_ == 0.0)
				d_47_ = 1.0;
			    double d_48_
				= ((d_43_ * (double) (((DoublyLinkedNode_Sub51_Sub18)
						       class59_sub51_sub18)
						      .anInt6346)
				    + (d_44_
				       * (double) ((Class47) class47).anInt323)
				    + d_45_ * (double) (((DoublyLinkedNode_Sub51_Sub18)
							 class59_sub51_sub18)
							.anInt6350))
				   * 65535.0
				   / ((double) ((Class47) class47).anInt329
				      * d_47_));
			    if (d_48_ < (double) ((Class47) class47).anInt327)
				class59_sub51_sub18
				    = ((DoublyLinkedNode_Sub51_Sub18)
				       Node_Sub47_Sub12.aClass325_6217
					   .method3683((byte) -79));
			    else {
				double d_49_ = 0.0;
				if (((Class47) class47).anInt326 == 1)
				    d_49_ = (d_47_ / 16.0
					     * (double) (((Class47) class47)
							 .anInt328));
				else if (((Class47) class47).anInt326 == 2)
				    d_49_ = (d_47_ / 16.0 * (d_47_ / 16.0)
					     * (double) (((Class47) class47)
							 .anInt328));
				if (((Class47) class47).anInt337 == 0) {
				    if (((Class47) class47).anInt332 == 0) {
					d += ((double) (((DoublyLinkedNode_Sub51_Sub18)
							 class59_sub51_sub18)
							.anInt6346)
					      - d_49_) * (double) argument_12_;
					d_19_
					    += (((double) (((Class47) class47)
							   .anInt323)
						 - d_49_)
						* (double) argument_12_);
					d_20_
					    += ((double) (((DoublyLinkedNode_Sub51_Sub18)
							   class59_sub51_sub18)
							  .anInt6350)
						- d_49_) * (double) argument_12_;
					anLocalBoolean = true;
				    } else {
					((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6435
					    += ((double) (((DoublyLinkedNode_Sub51_Sub18)
							   class59_sub51_sub18)
							  .anInt6346)
						- d_49_) * (double) argument_12_;
					((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6430
					    += (((double) (((Class47) class47)
							   .anInt323)
						 - d_49_)
						* (double) argument_12_);
					((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6432
					    += ((double) (((DoublyLinkedNode_Sub51_Sub18)
							   class59_sub51_sub18)
							  .anInt6350)
						- d_49_) * (double) argument_12_;
				    }
				} else {
				    double d_50_
					= (d_43_ / d_47_
					   * (double) (((Class47) class47)
						       .anInt329));
				    double d_51_
					= (d_44_ / d_47_
					   * (double) (((Class47) class47)
						       .anInt329));
				    double d_52_
					= (d_45_ / d_47_
					   * (double) (((Class47) class47)
						       .anInt329));
				    if (((Class47) class47).anInt332 == 0) {
					d += d_50_ * (double) argument_12_;
					d_19_ += d_51_ * (double) argument_12_;
					d_20_ += d_52_ * (double) argument_12_;
					anLocalBoolean = true;
				    } else {
					((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6435
					    += d_50_ * (double) argument_12_;
					((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6430
					    += d_51_ * (double) argument_12_;
					((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6432
					    += d_52_ * (double) argument_12_;
				    }
				}
				class59_sub51_sub18
				    = ((DoublyLinkedNode_Sub51_Sub18)
				       Node_Sub47_Sub12.aClass325_6217
					   .method3683((byte) -79));
			    }
			}
		    }
		}
	    }
	    if (((Class224) class224).anIntArray1603 != null) {
		if (((Class224) class224).anIntArray1585 == null) {
		    ((Class224) class224).anIntArray1585
			= new int[((Class224) class224).anIntArray1603.length];
		    for (int anLocalInt_53_ = 0;
			 (anLocalInt_53_
			  < ((Class224) class224).anIntArray1603.length);
			 anLocalInt_53_++) {
			Class24.method338((((Class224) class224).anIntArray1603
					   [anLocalInt_53_]),
					  true);
			((Class224) class224).anIntArray1585[anLocalInt_53_]
			    = ((IntegerNode) (IntegerNode)
			       (Class388.aJagexHashMap_3273.get((long) (((Class224) class224).anIntArray1603[anLocalInt_53_])))).value;
		    }
		}
		for (int anLocalInt_54_ = 0;
		     (anLocalInt_54_
		      < ((Class224) class224).anIntArray1585.length);
		     anLocalInt_54_++) {
		    Class47 class47 = (Class95.aClass47Array722
				       [(((Class224) class224).anIntArray1585
					 [anLocalInt_54_])]);
		    if (((Class47) class47).anInt332 == 0) {
			d += (double) (((Class47) class47).anInt333
				       * argument_12_);
			d_19_ += (double) (((Class47) class47).anInt323
					   * argument_12_);
			d_20_ += (double) (((Class47) class47).anInt322
					   * argument_12_);
			anLocalBoolean = true;
		    } else {
			((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6435
			    += ((Class47) class47).anInt333 * argument_12_;
			((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6430
			    += ((Class47) class47).anInt323 * argument_12_;
			((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6432
			    += ((Class47) class47).anInt322 * argument_12_;
		    }
		}
	    }
	    if (anLocalBoolean) {
		while (d > 32767.0 || d_19_ > 32767.0 || d_20_ > 32767.0
		       || d < -32767.0 || d_19_ < -32767.0
		       || d_20_ < -32767.0) {
		    d /= 2.0;
		    d_19_ /= 2.0;
		    d_20_ /= 2.0;
		    anInt6822 <<= 1;
		}
		aShort6821 = (short) (int) d;
		aShort6819 = (short) (int) d_19_;
		aShort6823 = (short) (int) d_20_;
	    }
	    ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6435
		+= (((long) aShort6821 * (long) (anInt6822 << 2) >> 23)
		    * (long) argument_12_);
	    ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6430
		+= (((long) aShort6819 * (long) (anInt6822 << 2) >> 23)
		    * (long) argument_12_);
	    ((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6432
		+= (((long) aShort6823 * (long) (anInt6822 << 2) >> 23)
		    * (long) argument_12_);
	}
    }
    
    DoublyLinkedNodeP2_Sub4_Sub1_Sub1
	(DoublyLinkedNodeP2_Sub6 argument_55_, int argument_56_, int argument_57_,
	 int argument_58_, int argument_59_, int argument_60_,
	 int argument_61_, int argument_62_, int argument_63_,
	 int argument_64_, int argument_65_, int argument_66_,
	 boolean argument_67_, boolean argument_68_) {
	((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this).aClass104_Sub6_6824 = argument_55_;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6435 = argument_56_ << 12;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6430 = argument_57_ << 12;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6432 = argument_58_ << 12;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6439 = argument_64_;
	aShort6816 = aShort6818 = (short) argument_63_;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6431 = argument_65_;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6438 = argument_66_;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).aBoolean6440 = argument_68_;
	aShort6821 = (short) argument_59_;
	aShort6819 = (short) argument_60_;
	aShort6823 = (short) argument_61_;
	anInt6822 = argument_62_;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).aByte6434
	    = ((Class38) (((DoublyLinkedNodeP2_Sub6) (((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this)
					    .aClass104_Sub6_6824))
			  .aClass38_4542)).aByte287;
	method1906();
    }
    
    final void method1910(DoublyLinkedNodeP2_Sub6 argument_69_, int argument_70_,
			  int argument_71_, int argument_72_, int argument_73_,
			  int argument_74_, int argument_75_, int argument_76_,
			  int argument_77_, int argument_78_, int argument_79_,
			  int argument_80_, boolean argument_81_,
			  boolean argument_82_) {
	((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this).aClass104_Sub6_6824 = argument_69_;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6435 = argument_70_ << 12;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6430 = argument_71_ << 12;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6432 = argument_72_ << 12;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6439 = argument_78_;
	aShort6816 = aShort6818 = (short) argument_77_;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6431 = argument_79_;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).anInt6438 = argument_80_;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).aBoolean6440 = argument_82_;
	aShort6821 = (short) argument_73_;
	aShort6819 = (short) argument_74_;
	aShort6823 = (short) argument_75_;
	anInt6822 = argument_76_;
	((DoublyLinkedNodeP2_Sub4_Sub1) this).aByte6434
	    = ((Class38) (((DoublyLinkedNodeP2_Sub6) (((DoublyLinkedNodeP2_Sub4_Sub1_Sub1) this)
					    .aClass104_Sub6_6824))
			  .aClass38_4542)).aByte287;
	method1906();
    }
}
