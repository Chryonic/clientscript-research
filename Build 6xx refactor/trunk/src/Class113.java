/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class113
{
    static int anInt942 = 0;
    
    static final void method2361(int argument, RsInterface[] argument_0_,
				 boolean argument_1_) {
	for (int anLocalInt = 0; argument_0_.length > anLocalInt;
	     anLocalInt++) {
	    RsInterface rsInterface = argument_0_[anLocalInt];
	    if (rsInterface != null && argument == ((RsInterface) rsInterface).parentId
		&& !client.method108(rsInterface)) {
		if (((RsInterface) rsInterface).type == 0) {
		    method2361(((RsInterface) rsInterface).idHash, argument_0_,
			       false);
		    if (((RsInterface) rsInterface).children != null)
			method2361(((RsInterface) rsInterface).idHash,
				   ((RsInterface) rsInterface).children,
				   false);
		    Node_Sub49 class59_sub49
			= ((Node_Sub49)
			   (Class2_Sub5.aJagexHashMap_3787.get((long) ((RsInterface) rsInterface).idHash)));
		    if (class59_sub49 != null)
			Class313.method3616(-113,
					    (((Node_Sub49) class59_sub49)
					     .anInt4291));
		}
		if (((RsInterface) rsInterface).type == 6
		    && ((RsInterface) rsInterface).anInt1812 != -1) {
		    Class367 class367
			= DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
			      .method3758(((RsInterface) rsInterface).anInt1812, 0);
		    if (class367 != null) {
			((RsInterface) rsInterface).anInt1905 += Class350.anInt2930;
			int anLocalInt_2_ = ((RsInterface) rsInterface).anInt1853;
			while (((RsInterface) rsInterface).anInt1905
			       > (((Class367) class367).anIntArray3094
				  [((RsInterface) rsInterface).anInt1853])) {
			    ((RsInterface) rsInterface).anInt1905
				-= (((Class367) class367).anIntArray3094
				    [((RsInterface) rsInterface).anInt1853]);
			    ((RsInterface) rsInterface).anInt1853++;
			    if (((Class367) class367).anIntArray3096.length
				<= ((RsInterface) rsInterface).anInt1853) {
				((RsInterface) rsInterface).anInt1853
				    -= ((Class367) class367).anInt3109;
				if (((RsInterface) rsInterface).anInt1853 < 0
				    || (((RsInterface) rsInterface).anInt1853
					>= (((Class367) class367)
					    .anIntArray3096).length))
				    ((RsInterface) rsInterface).anInt1853 = 0;
			    }
			    ((RsInterface) rsInterface).anInt1898
				= ((RsInterface) rsInterface).anInt1853 + 1;
			    if (((Class367) class367).anIntArray3096.length
				<= ((RsInterface) rsInterface).anInt1898) {
				((RsInterface) rsInterface).anInt1898
				    -= ((Class367) class367).anInt3109;
				if (((RsInterface) rsInterface).anInt1898 < 0
				    || (((RsInterface) rsInterface).anInt1898
					>= (((Class367) class367)
					    .anIntArray3096).length))
				    ((RsInterface) rsInterface).anInt1898 = -1;
			    }
			    Class256.method3280(rsInterface, true);
			}
			if (((RsInterface) rsInterface).anInt1853 != anLocalInt_2_)
			    Node_Sub47_Sub11.method1138
                        (0, ((RsInterface) rsInterface).anInt1853, class367);
		    }
		}
	    }
	}
    }

}
