/* Class104_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub6 extends DoublyLinkedNodeP2
{
    static float aFloat4538 = 0.0F;
    Class366 aClass366_4539;
    private int anInt4540 = 0;
    DoublyLinkedNodeP2_Sub7 aClass104_Sub7_4541;
    Class38 aClass38_4542;
    static int anInt4543;
    private long aLong4544;
    boolean aBoolean4545 = false;
    Class242 aClass242_4546 = new Class242();
    static int anInt4547;
    int anInt4548;
    Class224 aClass224_4549;
    private Class242 aClass242_4550 = new Class242();
    private boolean aBoolean4551 = false;
    private int anInt4552;
    private int anInt4553;
    private int anInt4554;
    private int anInt4555;
    private int anInt4556;
    private int anInt4557;
    private int anInt4558;
    
    final void method1916(byte argument_0_) {
	((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1756
	    = ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt279;
	((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1764
	    = ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt282;
	((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1768
	    = ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt288;
	((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1763
	    = ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt276;
	((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1762
	    = ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt277;
	((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1765
	    = ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt283;
	((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1759
	    = ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt289;
	((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1770
	    = ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt280;
	((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1761
	    = ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt290;
	if ((((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1764
	     != ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1765)
	    || (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1762
		!= (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		    .anInt1765))
	    || (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1763
		!= (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		    .anInt1756))
	    || (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1763
		!= (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		    .anInt1768))
	    || (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1770
		!= (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		    .anInt1759))
	    || (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1759
		!= (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		    .anInt1761))) {
	    if (aBoolean4551) {
		((Class242) aClass242_4550).anInt1765
		    = (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		       .anInt1765);
		((Class242) aClass242_4550).anInt1764
		    = (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		       .anInt1764);
		((Class242) aClass242_4550).anInt1759
		    = (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		       .anInt1759);
		((Class242) aClass242_4550).anInt1768
		    = (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		       .anInt1768);
		((Class242) aClass242_4550).anInt1756
		    = (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		       .anInt1756);
		((Class242) aClass242_4550).anInt1761
		    = (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		       .anInt1761);
		((Class242) aClass242_4550).anInt1763
		    = (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		       .anInt1763);
		((Class242) aClass242_4550).anInt1770
		    = (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		       .anInt1770);
		((Class242) aClass242_4550).anInt1762
		    = (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		       .anInt1762);
		aBoolean4551 = false;
	    }
	} else
	    aBoolean4551 = true;
    }
    
    static final int method1917(int argument, int argument_1_, int argument_2_,
				int argument_3_, int argument_4_,
				int argument_5_, int argument_6_) {
	if ((argument & 0x1) == 1) {
	    int anLocalInt = argument_4_;
	    argument_4_ = argument_3_;
	    argument_3_ = anLocalInt;
	}
	argument_1_ &= 0x3;
	if (argument_1_ == 0)
	    return argument_5_;
	if (argument_1_ == 1)
	    return argument_6_;
	if (argument_1_ == 2)
	    return -argument_5_ + 1 - argument_4_ + 7;
	return -argument_3_ + 1 - argument_6_ + 7;
    }
    
    static final boolean method1918(byte argument, int argument_7_,
				    int argument_8_) {
	if ((argument_7_ & 0x800) == 0 || (argument_8_ & 0x37) == 0)
	    return false;
	return true;
    }
    
    final void method1919(byte argument_9_, long argument_10_,
			  GraphicsToolkit argument_11_) {
	for (DoublyLinkedNodeP2_Sub4_Sub1_Sub1 class104_sub4_sub1_sub1
		 = ((DoublyLinkedNodeP2_Sub4_Sub1_Sub1)
		    ((DoublyLinkedNodeP2_Sub6) this).aClass366_4539.method3986(0));
	     class104_sub4_sub1_sub1 != null;
	     class104_sub4_sub1_sub1
		 = (DoublyLinkedNodeP2_Sub4_Sub1_Sub1) ((DoublyLinkedNodeP2_Sub6) this)
						 .aClass366_4539
						 .method3992((byte) 12))
	    class104_sub4_sub1_sub1.method1907(argument_11_, argument_10_);
    }
    
    final void method1920(GraphicsToolkit argument_12_, int argument_13_,
			  int argument_14_, long argument_15_,
			  boolean argument_16_) {
	if (!((DoublyLinkedNodeP2_Sub6) this).aBoolean4545) {
	    if (((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549).anInt1582
		> Node_Sub21.anInt4035)
		argument_16_ = false;
	    else if (Class222.anIntArray1558[Node_Sub21.anInt4035]
		     < GlTexture_Sub3.anInt5570)
		argument_16_ = false;
	    else if (aBoolean4551)
		argument_16_ = false;
	    else if ((((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
		      .anInt1612)
		     != -1) {
		int anLocalInt = (int) (argument_15_ + -aLong4544);
		if ((((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
		     .aBoolean1609)
		    || (((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
			.anInt1612) >= anLocalInt)
		    anLocalInt
			%= (((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
			    .anInt1612);
		else
		    argument_16_ = false;
		if (!(((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
		      .aBoolean1597)
		    && anLocalInt < ((Class224) (((DoublyLinkedNodeP2_Sub6) this)
						 .aClass224_4549)).anInt1594)
		    argument_16_ = false;
		if ((((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
		     .aBoolean1597)
		    && (((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
			.anInt1594) <= anLocalInt)
		    argument_16_ = false;
	    }
	} else
	    argument_16_ = false;
	if (argument_16_) {
	    Class170.anInt1248++;
	    int anLocalInt
		= (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1765
		   + (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		      .anInt1764)
		   + (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		      .anInt1762)) / 3;
	    int anLocalInt_17_
		= (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1763
		   + (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		      .anInt1756)
		   + (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		      .anInt1768)) / 3;
	    int anLocalInt_18_
		= (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1759
		   + (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		      .anInt1770)
		   + (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		      .anInt1761)) / 3;
	    if (anLocalInt != ((Class242)
			       ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1767
		|| (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		    .anInt1758) != anLocalInt_17_
		|| (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
		    .anInt1766) != anLocalInt_18_) {
		((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1758
		    = anLocalInt_17_;
		((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1766
		    = anLocalInt_18_;
		((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1767
		    = anLocalInt;
		int anLocalInt_19_
		    = (-(((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
			 .anInt1764)
		       + (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
			  .anInt1765));
		int anLocalInt_20_
		    = (-(((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
			 .anInt1756)
		       + (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
			  .anInt1763));
		int anLocalInt_21_
		    = (-(((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
			 .anInt1770)
		       + (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
			  .anInt1759));
		int anLocalInt_22_
		    = (-(((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
			 .anInt1764)
		       + (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
			  .anInt1762));
		int anLocalInt_23_
		    = ((((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
			.anInt1768)
		       - (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
			  .anInt1756));
		int anLocalInt_24_
		    = (-(((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
			 .anInt1770)
		       + (((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546)
			  .anInt1761));
		anInt4552 = (anLocalInt_24_ * anLocalInt_20_
			     - anLocalInt_23_ * anLocalInt_21_);
		anInt4557 = (anLocalInt_21_ * anLocalInt_22_
			     - anLocalInt_19_ * anLocalInt_24_);
		for (anInt4555 = (-(anLocalInt_22_ * anLocalInt_20_)
				  + anLocalInt_23_ * anLocalInt_19_);
		     (anInt4552 > 32767 || anInt4557 > 32767
		      || anInt4555 > 32767 || anInt4552 < -32767
		      || anInt4557 < -32767 || anInt4555 < -32767);
		     anInt4557 >>= 1) {
		    anInt4552 >>= 1;
		    anInt4555 >>= 1;
		}
		int anLocalInt_25_
		    = (int) Math.sqrt((double) (anInt4557 * anInt4557
						+ anInt4552 * anInt4552
						+ anInt4555 * anInt4555));
		if (anLocalInt_25_ <= 0)
		    anLocalInt_25_ = 1;
		anInt4552 = anInt4552 * 32767 / anLocalInt_25_;
		anInt4555 = anInt4555 * 32767 / anLocalInt_25_;
		anInt4557 = anInt4557 * 32767 / anLocalInt_25_;
		if ((((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
		     .aShort1591) > 0
		    || (((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
			.aShort1573) > 0) {
		    int anLocalInt_26_ = (int) (Math.atan2((double) anInt4555,
							   (double) anInt4552)
						* 2607.5945876176133);
		    int anLocalInt_27_
			= (int) ((Math.atan2
				  ((double) anInt4557,
				   Math.sqrt((double) (anInt4555 * anInt4555
						       + (anInt4552
							  * anInt4552)))))
				 * 2607.5945876176133);
		    anInt4553
			= ((((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
			    .aShort1591)
			   - ((Class224) (((DoublyLinkedNodeP2_Sub6) this)
					  .aClass224_4549)).aShort1616);
		    anInt4558
			= (-(((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
			     .aShort1629)
			   + ((Class224) (((DoublyLinkedNodeP2_Sub6) this)
					  .aClass224_4549)).aShort1573);
		    anInt4554 = (-(anInt4553 >> 1)
				 + ((Class224) (((DoublyLinkedNodeP2_Sub6) this)
						.aClass224_4549)).aShort1616
				 + anLocalInt_26_);
		    anInt4556
			= (((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
			   .aShort1629) + (anLocalInt_27_ - (anInt4558 >> 1));
		}
	    }
	    anInt4540
		+= (int) (((Math.random()
			    * (double) ((((Class224) (((DoublyLinkedNodeP2_Sub6) this)
						      .aClass224_4549))
					 .anInt1571)
					- (((Class224) (((DoublyLinkedNodeP2_Sub6) this)
							.aClass224_4549))
					   .anInt1581)))
			   + (double) ((Class224) (((DoublyLinkedNodeP2_Sub6) this)
						   .aClass224_4549)).anInt1581)
			  * (double) argument_13_);
	    if (anInt4540 > 63) {
		int anLocalInt_28_ = anInt4540 >> 6;
		anInt4540 &= 0x3f;
		for (int anLocalInt_29_ = 0; anLocalInt_28_ > anLocalInt_29_;
		     anLocalInt_29_++) {
		    int anLocalInt_30_;
		    int anLocalInt_31_;
		    int anLocalInt_32_;
		    if ((((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
			 .aShort1591) <= 0
			&& (((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
			    .aShort1573) <= 0) {
			anLocalInt_30_ = anInt4557;
			anLocalInt_32_ = anInt4555;
			anLocalInt_31_ = anInt4552;
		    } else {
			int anLocalInt_33_
			    = (anInt4554
			       + (int) (Math.random() * (double) anInt4553));
			anLocalInt_33_ &= 0x3fff;
			int anLocalInt_34_
			    = Node_Sub6.SINETABLE[anLocalInt_33_];
			int anLocalInt_35_
			    = Node_Sub6.COSINETABLE[anLocalInt_33_];
			int anLocalInt_36_
			    = ((int) (Math.random() * (double) anInt4558)
			       + anInt4556);
			anLocalInt_36_ &= 0x1fff;
			int anLocalInt_37_
			    = Node_Sub6.SINETABLE[anLocalInt_36_];
			int anLocalInt_38_
			    = Node_Sub6.COSINETABLE[anLocalInt_36_];
			int anLocalInt_39_ = 13;
			anLocalInt_30_ = (anLocalInt_38_ << 1) * -1;
			anLocalInt_31_ = (anLocalInt_37_ * anLocalInt_35_
					  >> anLocalInt_39_);
			anLocalInt_32_ = (anLocalInt_34_ * anLocalInt_37_
					  >> anLocalInt_39_);
		    }
		    float f = (float) Math.random();
		    float f_40_ = (float) Math.random();
		    if (f + f_40_ > 1.0F) {
			f_40_ = 1.0F - f_40_;
			f = 1.0F - f;
		    }
		    float f_41_ = 1.0F - (f_40_ + f);
		    int anLocalInt_42_
			= (int) (f_41_ * (float) ((Class242)
						  (((DoublyLinkedNodeP2_Sub6) this)
						   .aClass242_4546)).anInt1762
				 + (f_40_ * (float) (((Class242)
						      (((DoublyLinkedNodeP2_Sub6) this)
						       .aClass242_4546))
						     .anInt1765)
				    + f * (float) (((Class242)
						    (((DoublyLinkedNodeP2_Sub6) this)
						     .aClass242_4546))
						   .anInt1764)));
		    int anLocalInt_43_
			= (int) (f_40_ * (float) ((Class242)
						  (((DoublyLinkedNodeP2_Sub6) this)
						   .aClass242_4546)).anInt1763
				 + f * (float) ((Class242)
						(((DoublyLinkedNodeP2_Sub6) this)
						 .aClass242_4546)).anInt1756
				 + (float) (((Class242) (((DoublyLinkedNodeP2_Sub6) this)
							 .aClass242_4546))
					    .anInt1768) * f_41_);
		    int anLocalInt_44_
			= (int) (f_41_ * (float) ((Class242)
						  (((DoublyLinkedNodeP2_Sub6) this)
						   .aClass242_4546)).anInt1761
				 + (f * (float) ((Class242)
						 (((DoublyLinkedNodeP2_Sub6) this)
						  .aClass242_4546)).anInt1770
				    + ((float) ((Class242)
						(((DoublyLinkedNodeP2_Sub6) this)
						 .aClass242_4546)).anInt1759
				       * f_40_)));
		    int anLocalInt_45_
			= (int) (((float) ((Class242) aClass242_4550).anInt1765
				  * f_40_)
				 + (float) (((Class242) aClass242_4550)
					    .anInt1764) * f
				 + (float) (((Class242) aClass242_4550)
					    .anInt1762) * f_41_);
		    int anLocalInt_46_
			= (int) (((float) ((Class242) aClass242_4550).anInt1763
				  * f_40_)
				 + f * (float) (((Class242) aClass242_4550)
						.anInt1756)
				 + f_41_ * (float) (((Class242) aClass242_4550)
						    .anInt1768));
		    int anLocalInt_47_
			= (int) (((float) ((Class242) aClass242_4550).anInt1759
				  * f_40_)
				 + (float) (((Class242) aClass242_4550)
					    .anInt1770) * f
				 + (float) (((Class242) aClass242_4550)
					    .anInt1761) * f_41_);
		    int anLocalInt_48_ = -anLocalInt_45_ + anLocalInt_42_;
		    int anLocalInt_49_ = anLocalInt_43_ - anLocalInt_46_;
		    int anLocalInt_50_ = anLocalInt_44_ - anLocalInt_47_;
		    int anLocalInt_51_
			= (int) ((double) anLocalInt_45_
				 + (double) anLocalInt_48_ * Math.random());
		    int anLocalInt_52_
			= (int) ((double) anLocalInt_46_
				 + (double) anLocalInt_49_ * Math.random());
		    int anLocalInt_53_
			= (int) ((double) anLocalInt_50_ * Math.random()
				 + (double) anLocalInt_47_);
		    int anLocalInt_54_
			= ((int) (Math.random()
				  * (double) (-((Class224)
						(((DoublyLinkedNodeP2_Sub6) this)
						 .aClass224_4549)).anInt1624
					      + ((Class224)
						 (((DoublyLinkedNodeP2_Sub6) this)
						  .aClass224_4549)).anInt1572))
			   + ((Class224) (((DoublyLinkedNodeP2_Sub6) this)
					  .aClass224_4549)).anInt1624);
		    int anLocalInt_55_
			= ((int) ((double) ((((Class224) ((DoublyLinkedNodeP2_Sub6)
							  this).aClass224_4549)
					     .anInt1618)
					    - ((Class224)
					       (((DoublyLinkedNodeP2_Sub6) this)
						.aClass224_4549)).anInt1598)
				  * Math.random())
			   + ((Class224) (((DoublyLinkedNodeP2_Sub6) this)
					  .aClass224_4549)).anInt1598);
		    int anLocalInt_56_
			= ((((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
			    .anInt1587)
			   + (int) ((double) (((Class224)
					       (((DoublyLinkedNodeP2_Sub6) this)
						.aClass224_4549)).anInt1605
					      - ((Class224)
						 (((DoublyLinkedNodeP2_Sub6) this)
						  .aClass224_4549)).anInt1587)
				    * Math.random()));
		    int anLocalInt_57_;
		    if (((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
			.aBoolean1575) {
			double d = Math.random();
			anLocalInt_57_
			    = ((int) ((double) ((Class224)
						(((DoublyLinkedNodeP2_Sub6) this)
						 .aClass224_4549)).anInt1621
				      + ((double) ((Class224)
						   (((DoublyLinkedNodeP2_Sub6) this)
						    .aClass224_4549)).anInt1584
					 * Math.random())) << 24
			       | ((int) ((double) ((Class224)
						   (((DoublyLinkedNodeP2_Sub6) this)
						    .aClass224_4549)).anInt1595
					 + d * (double) (((Class224)
							  (((DoublyLinkedNodeP2_Sub6)
							    this)
							   .aClass224_4549))
							 .anInt1599))
				  | ((int) ((double) (((Class224)
						       (((DoublyLinkedNodeP2_Sub6) this)
							.aClass224_4549))
						      .anInt1590) * d
					    + (double) (((Class224)
							 ((DoublyLinkedNodeP2_Sub6)
							  this).aClass224_4549)
							.anInt1586)) << 8
				     | ((int) ((double) (((Class224)
							  (((DoublyLinkedNodeP2_Sub6)
							    this)
							   .aClass224_4549))
							 .anInt1576) * d
					       + (double) (((Class224)
							    (((DoublyLinkedNodeP2_Sub6)
							      this)
							     .aClass224_4549))
							   .anInt1604))
					<< 16))));
		    } else
			anLocalInt_57_
			    = ((int) (((double) ((Class224)
						 (((DoublyLinkedNodeP2_Sub6) this)
						  .aClass224_4549)).anInt1599
				       * Math.random())
				      + (double) ((Class224)
						  (((DoublyLinkedNodeP2_Sub6) this)
						   .aClass224_4549)).anInt1595)
			       | ((int) ((double) (((Class224)
						    (((DoublyLinkedNodeP2_Sub6) this)
						     .aClass224_4549))
						   .anInt1576) * Math.random()
					 + (double) (((Class224)
						      (((DoublyLinkedNodeP2_Sub6) this)
						       .aClass224_4549))
						     .anInt1604)) << 16
				  | (int) ((Math.random()
					    * (double) (((Class224)
							 ((DoublyLinkedNodeP2_Sub6)
							  this).aClass224_4549)
							.anInt1590))
					   + (double) (((Class224)
							(((DoublyLinkedNodeP2_Sub6) this)
							 .aClass224_4549))
						       .anInt1586)) << 8)
			       | (int) ((Math.random()
					 * (double) (((Class224)
						      (((DoublyLinkedNodeP2_Sub6) this)
						       .aClass224_4549))
						     .anInt1584))
					+ (double) (((Class224)
						     (((DoublyLinkedNodeP2_Sub6) this)
						      .aClass224_4549))
						    .anInt1621)) << 24);
		    int anLocalInt_58_
			= (((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
			   .anInt1592);
		    if (!argument_12_.method2060()
			&& !(((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)
			     .aBoolean1580))
			anLocalInt_58_ = -1;
		    if (Class109.anInt904 == Class62_Sub3.anInt4375) {
			DoublyLinkedNodeP2_Sub4_Sub1_Sub1 class104_sub4_sub1_sub1
			    = (new DoublyLinkedNodeP2_Sub4_Sub1_Sub1
			       (this, anLocalInt_51_, anLocalInt_52_,
				anLocalInt_53_, anLocalInt_31_, anLocalInt_30_,
				anLocalInt_32_, anLocalInt_54_, anLocalInt_55_,
				anLocalInt_57_, anLocalInt_56_, anLocalInt_58_,
				((Class224) (((DoublyLinkedNodeP2_Sub6) this)
					     .aClass224_4549)).aBoolean1619,
				((Class224) (((DoublyLinkedNodeP2_Sub6) this)
					     .aClass224_4549)).aBoolean1567));
		    } else {
			DoublyLinkedNodeP2_Sub4_Sub1_Sub1 class104_sub4_sub1_sub1
			    = (Class253_Sub3.aClass104_Sub4_Sub1_Sub1Array5678
			       [Class62_Sub3.anInt4375]);
			Class62_Sub3.anInt4375
			    = Class62_Sub3.anInt4375 + 1 & 0x3ff;
			class104_sub4_sub1_sub1.method1910
			    (this, anLocalInt_51_, anLocalInt_52_,
			     anLocalInt_53_, anLocalInt_31_, anLocalInt_30_,
			     anLocalInt_32_, anLocalInt_54_, anLocalInt_55_,
			     anLocalInt_57_, anLocalInt_56_, anLocalInt_58_,
			     ((Class224) (((DoublyLinkedNodeP2_Sub6) this)
					  .aClass224_4549)).aBoolean1619,
			     ((Class224) (((DoublyLinkedNodeP2_Sub6) this)
					  .aClass224_4549)).aBoolean1567);
		    }
		}
	    }
	}
	if (!((DoublyLinkedNodeP2_Sub6) this).aClass242_4546.method3153(aClass242_4550,
							      (byte) -91)) {
	    Class242 class242 = aClass242_4550;
	    aClass242_4550 = ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546;
	    ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546 = class242;
	    ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1761
		= ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt290;
	    ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1770
		= ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt280;
	    ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1767
		= ((Class242) aClass242_4550).anInt1767;
	    ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1759
		= ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt289;
	    ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1764
		= ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt282;
	    ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1756
		= ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt279;
	    ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1763
		= ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt276;
	    ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1758
		= ((Class242) aClass242_4550).anInt1758;
	    ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1768
		= ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt288;
	    ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1766
		= ((Class242) aClass242_4550).anInt1766;
	    ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1762
		= ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt277;
	    ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1765
		= ((Class38) ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542).anInt283;
	}
	((DoublyLinkedNodeP2_Sub6) this).anInt4548 = 0;
	for (DoublyLinkedNodeP2_Sub4_Sub1_Sub1 class104_sub4_sub1_sub1
		 = ((DoublyLinkedNodeP2_Sub4_Sub1_Sub1)
		    ((DoublyLinkedNodeP2_Sub6) this).aClass366_4539.method3986(0));
	     class104_sub4_sub1_sub1 != null;
	     class104_sub4_sub1_sub1
		 = (DoublyLinkedNodeP2_Sub4_Sub1_Sub1) ((DoublyLinkedNodeP2_Sub6) this)
						 .aClass366_4539
						 .method3992((byte) 3)) {
	    class104_sub4_sub1_sub1.method1909(argument_15_, argument_13_);
	    ((DoublyLinkedNodeP2_Sub6) this).anInt4548++;
	}
	Class62_Sub8.anInt4395 += ((DoublyLinkedNodeP2_Sub6) this).anInt4548;
    }
    
    DoublyLinkedNodeP2_Sub6(GraphicsToolkit argument_59_, Class38 argument_60_,
		  DoublyLinkedNodeP2_Sub7 argument_61_, long argument_62_) {
	((DoublyLinkedNodeP2_Sub6) this).aClass104_Sub7_4541 = argument_61_;
	((DoublyLinkedNodeP2_Sub6) this).aClass38_4542 = argument_60_;
	aLong4544 = argument_62_;
	((DoublyLinkedNodeP2_Sub6) this).aClass224_4549
	    = ((DoublyLinkedNodeP2_Sub6) this).aClass38_4542.method393(false);
	if (!argument_59_.method2060()
	    && (((Class224) ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549).anInt1601
		!= -1))
	    ((DoublyLinkedNodeP2_Sub6) this).aClass224_4549
		= Statics.method182((((Class224) (((DoublyLinkedNodeP2_Sub6) this).aClass224_4549)).anInt1601), false);
	((DoublyLinkedNodeP2_Sub6) this).aClass366_4539 = new Class366();
	anInt4540 += Math.random() * 64.0;
	method1916((byte) -80);
	((Class242) aClass242_4550).anInt1765
	    = ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1765;
	((Class242) aClass242_4550).anInt1756
	    = ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1756;
	((Class242) aClass242_4550).anInt1764
	    = ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1764;
	((Class242) aClass242_4550).anInt1761
	    = ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1761;
	((Class242) aClass242_4550).anInt1763
	    = ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1763;
	((Class242) aClass242_4550).anInt1759
	    = ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1759;
	((Class242) aClass242_4550).anInt1768
	    = ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1768;
	((Class242) aClass242_4550).anInt1770
	    = ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1770;
	((Class242) aClass242_4550).anInt1762
	    = ((Class242) ((DoublyLinkedNodeP2_Sub6) this).aClass242_4546).anInt1762;
    }
}
