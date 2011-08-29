/* Class224 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class224
{
    int anInt1564;
    boolean aBoolean1565;
    int anInt1566;
    boolean aBoolean1567;
    int anInt1568;
    int anInt1569 = -2;
    boolean aBoolean1570;
    int anInt1571;
    int anInt1572;
    short aShort1573;
    boolean aBoolean1574;
    boolean aBoolean1575;
    int anInt1576;
    private int anInt1577;
    static int anInt1578 = 0;
    int anInt1579;
    boolean aBoolean1580;
    int anInt1581;
    int anInt1582;
    int[] anIntArray1583;
    int anInt1584;
    int[] anIntArray1585;
    int anInt1586;
    int anInt1587;
    private int anInt1588;
    int anInt1589;
    int anInt1590;
    short aShort1591;
    int anInt1592;
    private int anInt1593;
    int anInt1594;
    int anInt1595;
    private int anInt1596;
    boolean aBoolean1597;
    int anInt1598;
    int anInt1599;
    private int anInt1600;
    int anInt1601;
    int anInt1602;
    int[] anIntArray1603;
    int anInt1604;
    int anInt1605;
    private int anInt1606;
    int anInt1607;
    int anInt1608;
    boolean aBoolean1609;
    private int anInt1610;
    int anInt1611;
    int anInt1612;
    int anInt1613;
    int[] anIntArray1614;
    private int anInt1615;
    short aShort1616;
    int anInt1617;
    int anInt1618;
    boolean aBoolean1619;
    int anInt1620;
    int anInt1621;
    int anInt1622;
    private int anInt1623;
    int anInt1624;
    int anInt1625;
    int anInt1626;
    int anInt1627;
    int anInt1628;
    short aShort1629;
    private int anInt1630;
    
    static final boolean method3043(int argument, int argument_0_,
				    int argument_1_) {
	if ((argument_0_ & 0x800) == 0)
	    return false;
	return true;
    }
    
    final void method3044(int argument_2_) {
	if (((Class224) this).anInt1569 > -2
	    || ((Class224) this).anInt1608 > -2)
	    ((Class224) this).aBoolean1565 = true;
	((Class224) this).anInt1604 = anInt1593 >> 16 & 0xff;
	anInt1600 = anInt1577 >> 16 & 0xff;
	((Class224) this).anInt1576 = -((Class224) this).anInt1604 + anInt1600;
	anInt1630 = (anInt1577 & 0xff3a) >> 8;
	((Class224) this).anInt1586 = anInt1593 >> 8 & 0xff;
	((Class224) this).anInt1595 = anInt1593 & 0xff;
	((Class224) this).anInt1590 = -((Class224) this).anInt1586 + anInt1630;
	anInt1615 = anInt1577 & 0xff;
	anInt1596 = anInt1577 >> 24 & 0xff;
	((Class224) this).anInt1621 = anInt1593 >> 24 & 0xff;
	((Class224) this).anInt1599 = anInt1615 - ((Class224) this).anInt1595;
	((Class224) this).anInt1584 = anInt1596 - ((Class224) this).anInt1621;
	if (((Class224) this).anInt1589 != -1) {
	    ((Class224) this).anInt1626
		= ((Class224) this).anInt1618 * anInt1588 / 100;
	    if (((Class224) this).anInt1626 == 0)
		((Class224) this).anInt1626 = 1;
	    ((Class224) this).anInt1568
		= ((((Class224) this).anInt1589
		    - (((Class224) this).anInt1572
		       - ((Class224) this).anInt1624) / 2
		    - ((Class224) this).anInt1624)
		   / ((Class224) this).anInt1626);
	}
	if (((Class224) this).anInt1579 != 0) {
	    ((Class224) this).anInt1566
		= anInt1606 * ((Class224) this).anInt1618 / 100;
	    ((Class224) this).anInt1613
		= anInt1623 * ((Class224) this).anInt1618 / 100;
	    if (((Class224) this).anInt1566 == 0)
		((Class224) this).anInt1566 = 1;
	    if (((Class224) this).anInt1613 == 0)
		((Class224) this).anInt1613 = 1;
	    ((Class224) this).anInt1607
		= (((((Class224) this).anInt1579 >> 16 & 0xff)
		    - (((Class224) this).anInt1604
		       + ((Class224) this).anInt1576 / 2))
		   << 8) / ((Class224) this).anInt1566;
	    ((Class224) this).anInt1628
		= ((-(((Class224) this).anInt1590 / 2)
		    - ((Class224) this).anInt1586
		    + ((((Class224) this).anInt1579 & 0xff9f) >> 8))
		   << 8) / ((Class224) this).anInt1566;
	    ((Class224) this).anInt1625
		= ((-(((Class224) this).anInt1599 / 2)
		    - ((Class224) this).anInt1595
		    + (((Class224) this).anInt1579 & 0xff))
		   << 8) / ((Class224) this).anInt1566;
	    Class224 class224 = this;
	    ((Class224) class224).anInt1607
		= (((Class224) class224).anInt1607
		   - (((Class224) this).anInt1607 > 0 ? 4 : 4));
	    ((Class224) this).anInt1620
		= ((-((Class224) this).anInt1621
		    - ((Class224) this).anInt1584 / 2
		    + (((Class224) this).anInt1579 >> 24 & 0xff))
		   << 8) / ((Class224) this).anInt1613;
	    Class224 class224_3_ = this;
	    ((Class224) class224_3_).anInt1625
		= (((Class224) class224_3_).anInt1625
		   - (((Class224) this).anInt1625 > 0 ? 4 : 4));
	    Class224 class224_4_ = this;
	    ((Class224) class224_4_).anInt1628
		= (((Class224) class224_4_).anInt1628
		   + (((Class224) this).anInt1628 <= 0 ? 4 : -4));
	    Class224 class224_5_ = this;
	    ((Class224) class224_5_).anInt1620
		= (((Class224) class224_5_).anInt1620
		   + (((Class224) this).anInt1620 <= 0 ? 4 : -4));
	}
	if (((Class224) this).anInt1622 != -1) {
	    ((Class224) this).anInt1627
		= ((Class224) this).anInt1618 * anInt1610 / 100;
	    if (((Class224) this).anInt1627 == 0)
		((Class224) this).anInt1627 = 1;
	    ((Class224) this).anInt1617
		= ((((Class224) this).anInt1622
		    - (((Class224) this).anInt1605
		       - ((Class224) this).anInt1587) / 2
		    - ((Class224) this).anInt1587)
		   / ((Class224) this).anInt1627);
	}
    }
    
    private final void method3045(Packet argument_6_, int argument_7_,
				  int argument_8_) {
	if (argument_7_ == 1) {
	    ((Class224) this).aShort1616 = (short) argument_6_.g2();
	    ((Class224) this).aShort1591
		= (short) argument_6_.g2();
	    ((Class224) this).aShort1629 = (short) argument_6_.g2();
	    ((Class224) this).aShort1573
		= (short) argument_6_.g2();
	    int anLocalInt = 3;
	    ((Class224) this).aShort1573 <<= anLocalInt;
	    ((Class224) this).aShort1591 <<= anLocalInt;
	    ((Class224) this).aShort1629 <<= anLocalInt;
	    ((Class224) this).aShort1616 <<= anLocalInt;
	} else if (argument_7_ != 2) {
	    if (argument_7_ == 3) {
		((Class224) this).anInt1624 = argument_6_.g4();
		((Class224) this).anInt1572 = argument_6_.g4();
	    } else if (argument_7_ != 4) {
		if (argument_7_ != 5) {
		    if (argument_7_ != 6) {
			if (argument_7_ == 7) {
			    ((Class224) this).anInt1598
				= argument_6_.g2();
			    ((Class224) this).anInt1618
				= argument_6_.g2();
			} else if (argument_7_ != 8) {
			    if (argument_7_ == 9) {
				int anLocalInt
				    = argument_6_.g1();
				((Class224) this).anIntArray1583
				    = new int[anLocalInt];
				for (int anLocalInt_9_ = 0;
				     anLocalInt > anLocalInt_9_;
				     anLocalInt_9_++)
				    ((Class224) this).anIntArray1583
					[anLocalInt_9_]
					= argument_6_.g2();
			    } else if (argument_7_ != 10) {
				if (argument_7_ == 12)
				    ((Class224) this).anInt1569
					= argument_6_.g1s();
				else if (argument_7_ == 13)
				    ((Class224) this).anInt1608
					= argument_6_.g1s();
				else if (argument_7_ != 14) {
				    if (argument_7_ == 15)
					((Class224) this).anInt1592
					    = argument_6_.g2();
				    else if (argument_7_ != 16) {
					if (argument_7_ != 17) {
					    if (argument_7_ != 18) {
						if (argument_7_ == 19)
						    ((Class224) this).anInt1582
							= (argument_6_
							       .g1
                                           ());
						else if (argument_7_ != 20) {
						    if (argument_7_ != 21) {
							if (argument_7_
							    != 22) {
							    if (argument_7_
								!= 23) {
								if (argument_7_
								    == 24)
								    ((Class224)
								     this)
									.aBoolean1575
									= false;
								else if (argument_7_
									 != 25) {
								    if (argument_7_
									== 26)
									((Class224)
									 this)
									    .aBoolean1619
									    = false;
								    else if (argument_7_
									     == 27)
									((Class224)
									 this)
									    .anInt1622
									    = argument_6_.g2() << 12 << 2;
								    else if (argument_7_
									     == 28)
									anInt1610
									    = argument_6_.g1();
								    else if (argument_7_
									     == 29)
									argument_6_
									    .g2s
                                                ();
								    else if (argument_7_
									     != 30) {
									if (argument_7_
									    != 31) {
									    if (argument_7_ != 32) {
										if (argument_7_ == 33)
										    ((Class224) this).aBoolean1570 = true;
										else if (argument_7_ == 34)
										    ((Class224) this).aBoolean1574 = false;
									    } else
										((Class224) this).aBoolean1567 = false;
									} else {
									    ((Class224)
									     this).anInt1587
										= argument_6_.g2() << 12 << 2;
									    ((Class224)
									     this).anInt1605
										= argument_6_.g2() << 12 << 2;
									}
								    } else
									((Class224)
									 this)
									    .aBoolean1580
									    = true;
								} else {
								    int anLocalInt
									= (argument_6_.g1
                                            ());
								    ((Class224)
								     this)
									.anIntArray1614
									= (new int
									   [anLocalInt]);
								    for (int anLocalInt_10_
									     = 0;
									 (anLocalInt_10_
									  < anLocalInt);
									 anLocalInt_10_++)
									((Class224)
									 this)
									    .anIntArray1614
									    [anLocalInt_10_]
									    = argument_6_.g2();
								}
							    } else
								anInt1588
								    = (argument_6_
									   .g1
                                               ());
							} else
							    ((Class224) this)
								.anInt1589
								= (argument_6_
								       .g4
                                               ());
						    } else
							anInt1623
							    = (argument_6_
								   .g1
                                           ());
						} else
						    anInt1606
							= (argument_6_
							       .g1
                                           ());
					    } else
						((Class224) this).anInt1579
						    = (argument_6_.g4
                                ());
					} else
					    ((Class224) this).anInt1601
						= argument_6_.g2();
				    } else {
					((Class224) this).aBoolean1597
					    = ((argument_6_.g1
                            ())
					       == 1);
					((Class224) this).anInt1594
					    = argument_6_.g2();
					((Class224) this).anInt1612
					    = argument_6_.g2();
					((Class224) this).aBoolean1609
					    = argument_6_
						  .g1() == 1;
				    }
				} else
				    ((Class224) this).anInt1564
					= argument_6_.g2();
			    } else {
				int anLocalInt
				    = argument_6_.g1();
				((Class224) this).anIntArray1603
				    = new int[anLocalInt];
				for (int anLocalInt_11_ = 0;
				     anLocalInt_11_ < anLocalInt;
				     anLocalInt_11_++)
				    ((Class224) this).anIntArray1603
					[anLocalInt_11_]
					= argument_6_.g2();
			    }
			} else {
			    ((Class224) this).anInt1581
				= argument_6_.g2();
			    ((Class224) this).anInt1571
				= argument_6_.g2();
			}
		    } else {
			anInt1593 = argument_6_.g4();
			anInt1577 = argument_6_.g4();
		    }
		} else
		    ((Class224) this).anInt1587
			= ((Class224) this).anInt1605
			= argument_6_.g2() << 12 << 2;
	    } else {
		((Class224) this).anInt1602
		    = argument_6_.g1();
		((Class224) this).anInt1611 = argument_6_.g1s();
	    }
	} else
	    argument_6_.g1();
	if (argument_8_ != -15)
	    ((Class224) this).anInt1605 = -60;
    }
    
    final void method3046(byte argument_12_, Packet argument_13_) {
	for (;;) {
	    int anLocalInt = argument_13_.g1();
	    if (anLocalInt == 0)
		break;
	    method3045(argument_13_, anLocalInt, -15);
	}
    }
    
    static final boolean method3047(byte argument, int argument_14_,
				    int argument_15_) {
	if (!((argument_14_ & 0x60000) != 0
	      | Class247.method3203(16, argument_14_, argument_15_))
	    && !Statics.method1284(28361, argument_14_, argument_15_))
	    return false;
	return true;
    }
    
    public Class224() {
	((Class224) this).aBoolean1565 = false;
	((Class224) this).anInt1582 = 0;
	((Class224) this).aBoolean1574 = true;
	((Class224) this).aBoolean1575 = true;
	((Class224) this).anInt1592 = -1;
	((Class224) this).aBoolean1597 = true;
	((Class224) this).anInt1594 = -1;
	((Class224) this).aBoolean1567 = true;
	((Class224) this).anInt1601 = -1;
	((Class224) this).anInt1564 = 0;
	((Class224) this).aBoolean1570 = false;
	anInt1606 = 100;
	((Class224) this).aBoolean1580 = false;
	((Class224) this).anInt1612 = -1;
	((Class224) this).aBoolean1609 = true;
	anInt1588 = 100;
	((Class224) this).anInt1608 = -2;
	((Class224) this).anInt1589 = -1;
	anInt1623 = 100;
	((Class224) this).anInt1622 = -1;
	((Class224) this).anInt1602 = 0;
	anInt1610 = 100;
	((Class224) this).aBoolean1619 = true;
    }
}
