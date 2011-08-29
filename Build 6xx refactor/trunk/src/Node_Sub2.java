/* Class59_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Hashtable;

final class Node_Sub2 extends Node
{
    int anInt3871;
    int anInt3872;
    boolean aBoolean3873 = false;
    int anInt3874;
    boolean aBoolean3875 = true;
    int anInt3876;
    Class120 aClass120_3877;
    int anInt3878;
    static Hashtable classTable = new Hashtable();
    int anInt3880;
    int anInt3881;
    int anInt3882;
    int anInt3883;
    int anInt3884;
    static int anInt3885;
    
    static final void method532(Entity argument,
				int argument_0_) {
	do {
	    if (((Entity) argument).anInt6731 != -1) {
		Class367 class367
		    = (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758
		       (((Entity) argument).anInt6731, 0));
		if (class367 != null
		    && ((Class367) class367).anIntArray3096 != null) {
		    ((Entity) argument).anInt6761++;
		    if ((((Class367) class367).anIntArray3096.length
			 > ((Entity) argument).anInt6742)
			&& ((((Class367) class367).anIntArray3094
			     [((Entity) argument).anInt6742])
			    < (((Entity) argument)
			       .anInt6761))) {
			((Entity) argument).anInt6765++;
			((Entity) argument).anInt6742++;
			((Entity) argument).anInt6761 = 1;
			if (!((Entity) argument).aBoolean6751)
			    Class313.method3622(argument, argument_0_ + 1,
						class367,
						((Entity)
						 argument).anInt6742);
		    }
		    if (((Entity) argument).anInt6742
			>= ((Class367) class367).anIntArray3096.length) {
			((Entity) argument).anInt6742 = 0;
			((Entity) argument).anInt6761 = 0;
			if (((Entity) argument)
			    .aBoolean6753) {
			    ((Entity) argument).anInt6731
				= argument.method1831()
				      .method3923((byte) -83);
			    if (((Entity) argument).anInt6731
				== -1) {
				((Entity) argument)
				    .aBoolean6753
				    = false;
				break;
			    }
			    class367
				= (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758
				   ((((Entity) argument)
				     .anInt6731),
				    0));
			}
			if (!((Entity) argument).aBoolean6751)
			    Class313.method3622(argument, 0, class367,
						((Entity)
						 argument).anInt6742);
		    }
		    ((Entity) argument).anInt6765
			= ((Entity) argument).anInt6742 + 1;
		    if (((Class367) class367).anIntArray3096 != null) {
			if (((Class367) class367).anIntArray3096.length
			    <= ((Entity) argument).anInt6765)
			    ((Entity) argument).anInt6765 = 0;
		    } else {
			((Entity) argument).anInt6731 = -1;
			((Entity) argument).aBoolean6753
			    = false;
		    }
		} else {
		    ((Entity) argument).aBoolean6753 = false;
		    ((Entity) argument).anInt6731 = -1;
		}
	    }
	} while (false);
	for (int anLocalInt = 0;
	     anLocalInt < (((Entity) argument)
			   .aClass269Array6759).length;
	     anLocalInt++) {
	    if (((Class269) (((Entity) argument)
			     .aClass269Array6759[anLocalInt])).anInt2150 != -1
		&& (((Class269) (((Entity) argument)
				 .aClass269Array6759[anLocalInt])).anInt2157
		    <= Class333.anInt2720)) {
		Class126 class126
		    = (Class194.aClass225_1414.method3054
		       ((byte) 106,
			(((Class269) (((Entity) argument)
				      .aClass269Array6759[anLocalInt]))
			 .anInt2150)));
		int anLocalInt_1_ = ((Class126) class126).anInt1034;
		if (anLocalInt_1_ == -1)
		    ((Class269) (((Entity) argument)
				 .aClass269Array6759[anLocalInt])).anInt2150
			= -1;
		else {
		    Class367 class367 = DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
					    .method3758(anLocalInt_1_, 0);
		    if (((Class126) class126).aBoolean1035) {
			if (((Class367) class367).anInt3092 != 3) {
			    if (((Class367) class367).anInt3092 == 1
				&& (((Entity) argument)
				    .anInt6803) > 0
				&& (((Entity) argument)
				    .anInt6762) <= Class333.anInt2720
				&& (((Entity) argument)
				    .anInt6737) < Class333.anInt2720) {
				((Class269)
				 (((Entity) argument)
				  .aClass269Array6759[anLocalInt])).anInt2157
				    = Class333.anInt2720 + 1;
				continue;
			    }
			} else if ((((Entity) argument)
				    .anInt6803) > 0
				   && (((Entity) argument)
				       .anInt6762) <= Class333.anInt2720
				   && (Class333.anInt2720
				       > (((Entity) argument)
					  .anInt6737))) {
			    ((Class269) (((Entity) argument)
					 .aClass269Array6759
					 [anLocalInt])).anInt2150
				= -1;
			    continue;
			}
		    }
		    if (class367 != null
			&& ((Class367) class367).anIntArray3096 != null) {
			if ((((Class269) (((Entity) argument)
					  .aClass269Array6759[anLocalInt]))
			     .anInt2159)
			    < 0) {
			    ((Class269) (((Entity) argument)
					 .aClass269Array6759
					 [anLocalInt])).anInt2159
				= 0;
			    if (!((Entity) argument)
				 .aBoolean6751)
				Class313.method3622(argument, 0, class367, 0);
			}
			((Class269) (((Entity) argument)
				     .aClass269Array6759
				     [anLocalInt])).anInt2156++;
			if (((((Class269) (((Entity) argument)
					   .aClass269Array6759[anLocalInt]))
			      .anInt2159)
			     < ((Class367) class367).anIntArray3096.length)
			    && (((Class269)
				 (((Entity) argument)
				  .aClass269Array6759[anLocalInt])).anInt2156
				> (((Class367) class367).anIntArray3094
				   [(((Class269)
				      (((Entity) argument)
				       .aClass269Array6759[anLocalInt]))
				     .anInt2159)]))) {
			    ((Class269) (((Entity) argument)
					 .aClass269Array6759
					 [anLocalInt])).anInt2156
				= 1;
			    ((Class269) (((Entity) argument)
					 .aClass269Array6759
					 [anLocalInt])).anInt2159++;
			    if (!((Entity) argument)
				 .aBoolean6751)
				Class313.method3622
				    (argument, 0, class367,
				     (((Class269)
				       (((Entity) argument)
					.aClass269Array6759[anLocalInt]))
				      .anInt2159));
			}
			if (((Class367) class367).anIntArray3096.length
			    <= ((Class269)
				(((Entity) argument)
				 .aClass269Array6759[anLocalInt])).anInt2159) {
			    if (!((Class126) class126).aBoolean1035)
				((Class269)
				 (((Entity) argument)
				  .aClass269Array6759[anLocalInt])).anInt2150
				    = -1;
			    else {
				((Class269)
				 (((Entity) argument)
				  .aClass269Array6759[anLocalInt])).anInt2159
				    -= ((Class367) class367).anInt3109;
				((Class269)
				 (((Entity) argument)
				  .aClass269Array6759
				  [anLocalInt])).anInt2152++;
				if (((Class367) class367).anInt3105
				    <= (((Class269)
					 (((Entity) argument)
					  .aClass269Array6759[anLocalInt]))
					.anInt2152))
				    ((Class269)
				     (((Entity) argument)
				      .aClass269Array6759
				      [anLocalInt])).anInt2150
					= -1;
				else if (((Class269)
					  (((Entity) argument)
					   .aClass269Array6759
					   [anLocalInt])).anInt2159 < 0
					 || ((((Class367) class367)
					      .anIntArray3096).length
					     <= ((Class269)
						 (((Entity)
						   argument)
						  .aClass269Array6759
						  [anLocalInt])).anInt2159))
				    ((Class269)
				     (((Entity) argument)
				      .aClass269Array6759
				      [anLocalInt])).anInt2150
					= -1;
				else if (!((Entity) argument)
					  .aBoolean6751)
				    Class313.method3622
					(argument, 0, class367,
					 ((Class269)
					  (((Entity) argument)
					   .aClass269Array6759
					   [anLocalInt])).anInt2159);
			    }
			}
			((Class269) (((Entity) argument)
				     .aClass269Array6759
				     [anLocalInt])).anInt2148
			    = ((Class269) (((Entity) argument)
					   .aClass269Array6759
					   [anLocalInt])).anInt2159 + 1;
			if (((Class367) class367).anIntArray3096.length
			    <= ((Class269)
				(((Entity) argument)
				 .aClass269Array6759[anLocalInt])).anInt2148) {
			    if (((Class126) class126).aBoolean1035) {
				((Class269)
				 (((Entity) argument)
				  .aClass269Array6759[anLocalInt])).anInt2148
				    -= ((Class367) class367).anInt3109;
				if ((((Class269)
				      (((Entity) argument)
				       .aClass269Array6759[anLocalInt]))
				     .anInt2152) + 1
				    < ((Class367) class367).anInt3105) {
				    if ((((Class269)
					  (((Entity) argument)
					   .aClass269Array6759[anLocalInt]))
					 .anInt2148) < 0
					|| (((Class269)
					     (((Entity)
					       argument)
					      .aClass269Array6759
					      [anLocalInt])).anInt2148
					    >= (((Class367) class367)
						.anIntArray3096).length))
					((Class269)
					 (((Entity) argument)
					  .aClass269Array6759
					  [anLocalInt])).anInt2148
					    = -1;
				} else
				    ((Class269)
				     (((Entity) argument)
				      .aClass269Array6759
				      [anLocalInt])).anInt2148
					= -1;
			    } else
				((Class269)
				 (((Entity) argument)
				  .aClass269Array6759[anLocalInt])).anInt2148
				    = -1;
			}
		    } else
			((Class269) (((Entity) argument)
				     .aClass269Array6759
				     [anLocalInt])).anInt2150
			    = -1;
		}
	    }
	}
	if (((Entity) argument).anInt6754 != -1
	    && ((Entity) argument).anInt6755 <= 1) {
	    Class367 class367
		= (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758
		   (((Entity) argument).anInt6754, 0));
	    if (((Class367) class367).anInt3092 != 3) {
		if (((Class367) class367).anInt3092 == 1
		    && ((Entity) argument).anInt6803 > 0
		    && (((Entity) argument).anInt6762
			<= Class333.anInt2720)
		    && (Class333.anInt2720
			> ((Entity) argument).anInt6737))
		    ((Entity) argument).anInt6755 = 2;
	    } else if (((Entity) argument).anInt6803 > 0
		       && (Class333.anInt2720
			   >= ((Entity) argument).anInt6762)
		       && (((Entity) argument).anInt6737
			   < Class333.anInt2720)) {
		((Entity) argument).anIntArray6735 = null;
		((Entity) argument).anInt6754 = -1;
	    }
	}
	if (((Entity) argument).anInt6754 != -1
	    && ((Entity) argument).anInt6755 == 0) {
	    Class367 class367
		= (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758
		   (((Entity) argument).anInt6754, 0));
	    if (class367 == null
		|| ((Class367) class367).anIntArray3096 == null) {
		((Entity) argument).anIntArray6735 = null;
		((Entity) argument).anInt6754 = -1;
	    } else {
		((Entity) argument).anInt6740++;
		if ((((Entity) argument).anInt6732
		     < ((Class367) class367).anIntArray3096.length)
		    && (((Entity) argument).anInt6740
			> (((Class367) class367).anIntArray3094
			   [(((Entity) argument)
			     .anInt6732)]))) {
		    ((Entity) argument).anInt6732++;
		    ((Entity) argument).anInt6740 = 1;
		    if (!((Entity) argument).aBoolean6751)
			Class313.method3622(argument, argument_0_ ^ 0xffffffff,
					    class367,
					    ((Entity)
					     argument).anInt6732);
		}
		if (((Entity) argument).anInt6732
		    >= ((Class367) class367).anIntArray3096.length) {
		    ((Entity) argument).anInt6747++;
		    ((Entity) argument).anInt6732
			-= ((Class367) class367).anInt3109;
		    if (((Entity) argument).anInt6747
			>= ((Class367) class367).anInt3105) {
			((Entity) argument).anIntArray6735
			    = null;
			((Entity) argument).anInt6754 = -1;
		    } else if ((((Entity) argument).anInt6732
				< 0)
			       || ((((Entity) argument)
				    .anInt6732)
				   >= (((Class367) class367)
				       .anIntArray3096).length)) {
			((Entity) argument).anInt6754 = -1;
			((Entity) argument).anIntArray6735
			    = null;
		    } else if (!((Entity) argument)
				.aBoolean6751)
			Class313.method3622(argument, argument_0_ + 1,
					    class367,
					    ((Entity)
					     argument).anInt6732);
		}
		((Entity) argument).anInt6787
		    = ((Entity) argument).anInt6732 + 1;
		if (((Entity) argument).anInt6787
		    >= ((Class367) class367).anIntArray3096.length) {
		    ((Entity) argument).anInt6787
			-= ((Class367) class367).anInt3109;
		    if (((Class367) class367).anInt3105
			<= ((Entity) argument).anInt6747 + 1)
			((Entity) argument).anInt6787 = -1;
		    else if (((Entity) argument).anInt6787 < 0
			     || (((Entity) argument).anInt6787
				 >= (((Class367) class367)
				     .anIntArray3096).length))
			((Entity) argument).anInt6787 = -1;
		}
	    }
	}
	if (argument_0_
	    > (((Entity) argument).anInt6755 ^ 0xffffffff))
	    ((Entity) argument).anInt6755--;
	for (int anLocalInt = 0;
	     (anLocalInt
	      < ((Entity) argument).aClass91Array6779.length);
	     anLocalInt++) {
	    Class91 class91 = (((Entity) argument)
			       .aClass91Array6779[anLocalInt]);
	    if (class91 != null) {
		if (((Class91) class91).anInt701 > 0)
		    ((Class91) class91).anInt701--;
		else {
		    Class367 class367
			= DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
			      .method3758(((Class91) class91).anInt704, 0);
		    if (class367 != null
			&& ((Class367) class367).anIntArray3096 != null) {
			((Class91) class91).anInt702++;
			if ((((Class91) class91).anInt698
			     < ((Class367) class367).anIntArray3096.length)
			    && (((Class91) class91).anInt702
				> (((Class367) class367).anIntArray3094
				   [((Class91) class91).anInt698]))) {
			    ((Class91) class91).anInt698++;
			    ((Class91) class91).anInt702 = 1;
			    if (!((Entity) argument)
				 .aBoolean6751)
				Class313.method3622(argument,
						    argument_0_ ^ 0xffffffff,
						    class367,
						    (((Class91) class91)
						     .anInt698));
			}
			if (((Class367) class367).anIntArray3096.length
			    <= ((Class91) class91).anInt698) {
			    ((Class91) class91).anInt698
				-= ((Class367) class367).anInt3109;
			    ((Class91) class91).anInt699++;
			    if (((Class367) class367).anInt3105
				<= ((Class91) class91).anInt699)
				((Entity) argument)
				    .aClass91Array6779[anLocalInt]
				    = null;
			    else if (((Class91) class91).anInt698 >= 0
				     && (((Class91) class91).anInt698
					 < (((Class367) class367)
					    .anIntArray3096).length)) {
				if (!((Entity) argument)
				     .aBoolean6751)
				    Class313.method3622(argument, 0, class367,
							(((Class91) class91)
							 .anInt698));
			    } else
				((Entity) argument)
				    .aClass91Array6779[anLocalInt]
				    = null;
			}
			((Class91) class91).anInt700
			    = ((Class91) class91).anInt698 + 1;
			if (((Class91) class91).anInt700
			    >= ((Class367) class367).anIntArray3096.length) {
			    ((Class91) class91).anInt700
				-= ((Class367) class367).anInt3109;
			    if (((Class367) class367).anInt3105
				> ((Class91) class91).anInt699 + 1) {
				if (((Class91) class91).anInt700 < 0
				    || ((((Class367) class367)
					 .anIntArray3096).length
					<= ((Class91) class91).anInt700))
				    ((Class91) class91).anInt700 = -1;
			    } else
				((Class91) class91).anInt700 = -1;
			}
		    } else
			((Entity) argument)
			    .aClass91Array6779[anLocalInt]
			    = null;
		}
	    }
	}
    }
    
    static final void method533(int argument) {
	if (Class66.anInt467 != -1) {
	    int anLocalInt = client.mouseHandler.getX();
	    int anLocalInt_2_ = client.mouseHandler.getY();
	    AbstractMouseMessage class59_sub46
		= ((AbstractMouseMessage)
		   Class376.aCyclicLinkedList_3214.getFirst());
	    if (class59_sub46 != null) {
		anLocalInt = class59_sub46.getX();
		anLocalInt_2_ = class59_sub46.getY();
	    }
	    int anLocalInt_3_ = 0;
	    int anLocalInt_4_ = 0;
	    if (Class52.aBoolean391) {
		anLocalInt_3_ = Node_Sub52.method1319(99);
		anLocalInt_4_ = Class82.method1596(-2);
	    }
	    Statics.method3681(anLocalInt_3_, anLocalInt_2_, anLocalInt_4_, anLocalInt_3_ + Applet_Sub1.canvasWidth, (byte) 107, anLocalInt, anLocalInt_3_, anLocalInt + anLocalInt_3_, Class66.anInt467, Applet_Sub1.canvasHeight + anLocalInt_4_, anLocalInt_4_, anLocalInt_2_ + anLocalInt_4_);
	    if (MultilanguageString.aRsInterface_2865 != null)
		Node_Sub43.method1082(anLocalInt + anLocalInt_3_, false,
                anLocalInt_4_ + anLocalInt_2_);
	}
    }
    
    static final long method534(int argument, int argument_5_) {
	return (long) (argument + 11745) * 86400000L;
    }
    
    public static void method535(int argument) {
	classTable = null;
    }
    
    public Node_Sub2() {
	/* empty */
    }
}
