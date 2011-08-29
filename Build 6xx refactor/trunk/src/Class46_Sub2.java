/* Class46_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class Class46_Sub2 extends Class46
{
    static CyclicLinkedList aCyclicLinkedList_3838 = new CyclicLinkedList();
    
    public static void method440(byte argument) {
	aCyclicLinkedList_3838 = null;
    }
    
    static final boolean method441(int argument, char argument_0_) {
	if (argument_0_ < '0' || argument_0_ > '9')
	    return false;
	return true;
    }
    
    static final void method442(int argument, Class_s argument_1_) {
	Node_Sub31_Sub5.aClass_sArray5858[argument] = argument_1_;
    }
    
    static final int method443(Entity argument,
			       int argument_2_) {
	if (((Entity) argument).anInt6727 == 0)
	    return 0;
	if (((Entity) argument).anInt6725 != -1) {
	    Entity entity = null;
	    if (((Entity) argument).anInt6725 >= 32768) {
		if (((Entity) argument).anInt6725 >= 32768)
		    entity
			= (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
			   [(((Entity) argument).anInt6725
			     - 32768)]);
	    } else {
		Node_Sub35 class59_sub35
		    = ((Node_Sub35)
		       (Class294.aJagexHashMap_2453.get((long) ((Entity) argument).anInt6725)));
		if (class59_sub35 != null)
		    entity
			= (((Node_Sub35) class59_sub35)
			   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
	    }
	    if (entity != null) {
		int anLocalInt
		    = (((DoublyLinkedNodeP2_Sub2) argument).worldX
		       - ((DoublyLinkedNodeP2_Sub2) entity).worldX);
		int anLocalInt_3_
		    = (((DoublyLinkedNodeP2_Sub2) argument).worldZ
		       - ((DoublyLinkedNodeP2_Sub2) entity).worldZ);
		if (anLocalInt != 0 || anLocalInt_3_ != 0)
		    argument.method1824
			((int) (Math.atan2((double) anLocalInt,
					   (double) anLocalInt_3_)
				* 2607.5945876176133) & 0x3fff,
			 (byte) 81);
	    }
	}
	if (!(argument instanceof DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)) {
	    if (argument instanceof DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) {
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
		    = (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) argument;
		if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
		     class104_sub2_sub2_sub5_sub1).anInt6828 != -1
		    && (((Entity)
			 class104_sub2_sub2_sub5_sub1).anInt6798 == 0
			|| ((Entity)
			    class104_sub2_sub2_sub5_sub1).anInt6796 > 0)) {
		    int anLocalInt
			= (-((((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
			       class104_sub2_sub2_sub5_sub1).anInt6828
			      - MapRelated.baseX - MapRelated.baseX)
			     * 256)
			   + (((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub1)
			      .worldX));
		    int anLocalInt_4_
			= ((((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub1)
			    .worldZ)
			   - ((-MapRelated.baseZ
			       + (-MapRelated.baseZ
				  + ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				     class104_sub2_sub2_sub5_sub1).anInt6826))
			      * 256));
		    if (anLocalInt != 0 || anLocalInt_4_ != 0)
			class104_sub2_sub2_sub5_sub1.method1824
			    ((int) (Math.atan2((double) anLocalInt,
					       (double) anLocalInt_4_)
				    * 2607.5945876176133) & 0x3fff,
			     (byte) 91);
		    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
		     class104_sub2_sub2_sub5_sub1).anInt6828
			= -1;
		}
	    }
	} else {
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		= (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument;
	    if ((((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) class104_sub2_sub2_sub5_sub2)
		 .anInt6862) != -1
		&& ((((Entity) class104_sub2_sub2_sub5_sub2)
		     .anInt6798) == 0
		    || ((Entity)
			class104_sub2_sub2_sub5_sub2).anInt6796 > 0)) {
		class104_sub2_sub2_sub5_sub2.method1824
		    (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		      class104_sub2_sub2_sub5_sub2).anInt6862,
		     (byte) 124);
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) class104_sub2_sub2_sub5_sub2)
		    .anInt6862
		    = -1;
	    }
	}
	return argument.method1822(-100);
    }
    
    static final void method444(Node_Sub28_Sub1 argument, int argument_5_) {
	Node_Sub14 class59_sub14
	    = (Node_Sub14) Class151.aCyclicLinkedList_1146.getFirst();
	if (class59_sub14 != null) {
	    boolean anLocalBoolean = false;
	    for (int anLocalInt = 0;
		 ((Node_Sub14) class59_sub14).anInt3989 > anLocalInt;
		 anLocalInt++) {
		if ((((Node_Sub14) class59_sub14).aSignlinkRequestArray3984
		     [anLocalInt])
		    != null) {
		    if ((((Node_Sub14) class59_sub14).aSignlinkRequestArray3984
			 [anLocalInt].status)
			== 2)
			((Node_Sub14) class59_sub14).anIntArray3983
			    [anLocalInt]
			    = -5;
		    if ((((Node_Sub14) class59_sub14).aSignlinkRequestArray3984
			 [anLocalInt].status)
			== 0)
			anLocalBoolean = true;
		}
		if ((((Node_Sub14) class59_sub14).aSignlinkRequestArray3987
		     [anLocalInt])
		    != null) {
		    if ((((Node_Sub14) class59_sub14).aSignlinkRequestArray3987
			 [anLocalInt].status)
			== 2)
			((Node_Sub14) class59_sub14).anIntArray3983
			    [anLocalInt]
			    = -6;
		    if ((((Node_Sub14) class59_sub14).aSignlinkRequestArray3987
			 [anLocalInt].status)
			== 0)
			anLocalBoolean = true;
		}
	    }
	    if (!anLocalBoolean) {
		int anLocalInt = ((Packet) argument).pos;
		argument.p4(((Node_Sub14) class59_sub14).anInt3988
        );
		for (int anLocalInt_6_ = 0;
		     ((Node_Sub14) class59_sub14).anInt3989 > anLocalInt_6_;
		     anLocalInt_6_++) {
		    if ((((Node_Sub14) class59_sub14).anIntArray3983
			 [anLocalInt_6_])
			!= 0)
			argument.p1(
                    (((Node_Sub14) class59_sub14)
                            .anIntArray3983[anLocalInt_6_]));
		    else {
			try {
			    int anLocalInt_7_
				= (((Node_Sub14) class59_sub14)
				   .anIntArray3985[anLocalInt_6_]);
			    if (anLocalInt_7_ == 0) {
				Field field
				    = (Field) (((Node_Sub14) class59_sub14)
					       .aSignlinkRequestArray3984
					       [anLocalInt_6_].result);
				int anLocalInt_8_ = field.getInt(null);
				argument.p1(0);
				argument.p4(anLocalInt_8_);
			    } else if (anLocalInt_7_ != 1) {
				if (anLocalInt_7_ == 2) {
				    Field field
					= ((Field)
					   (((Node_Sub14) class59_sub14)
					    .aSignlinkRequestArray3984[anLocalInt_6_]
					    .result));
				    int anLocalInt_9_ = field.getModifiers();
				    argument.p1(0);
				    argument.p4(anLocalInt_9_
                    );
				}
			    } else {
				Field field
				    = (Field) (((Node_Sub14) class59_sub14)
					       .aSignlinkRequestArray3984
					       [anLocalInt_6_].result);
				field.setInt(null,
					     (((Node_Sub14) class59_sub14)
					      .anIntArray3986[anLocalInt_6_]));
				argument.p1(0);
			    }
			    if (anLocalInt_7_ == 3) {
				Method method
				    = (Method) (((Node_Sub14) class59_sub14)
						.aSignlinkRequestArray3987
						[anLocalInt_6_].result);
				byte[][] anLocalInts
				    = (((Node_Sub14) class59_sub14)
				       .aByteArrayArrayArray3990
				       [anLocalInt_6_]);
				Object[] objects
				    = new Object[anLocalInts.length];
				for (int anLocalInt_10_ = 0;
				     anLocalInt_10_ < anLocalInts.length;
				     anLocalInt_10_++) {
				    ObjectInputStream objectinputstream
					= (new ObjectInputStream
					   (new ByteArrayInputStream
					    (anLocalInts[anLocalInt_10_])));
				    objects[anLocalInt_10_]
					= objectinputstream.readObject();
				}
				Object object = method.invoke(null, objects);
				if (object == null)
				    argument.p1(0);
				else if (!(object instanceof Number)) {
				    if (object instanceof String) {
					argument.p1(2);
					argument.pjstr(
                            (String) object);
				    } else
					argument.p1(4);
				} else {
				    argument.p1(1);
				    argument.p8(((Number) object)
                            .longValue());
				}
			    } else if (anLocalInt_7_ == 4) {
				Method method
				    = (Method) (((Node_Sub14) class59_sub14)
						.aSignlinkRequestArray3987
						[anLocalInt_6_].result);
				int anLocalInt_11_ = method.getModifiers();
				argument.p1(0);
				argument.p4(anLocalInt_11_);
			    }
			} catch (ClassNotFoundException classnotfoundexception) {
			    argument.p1(-10);
			} catch (java.io.InvalidClassException invalidclassexception) {
			    argument.p1(-11);
			} catch (java.io.StreamCorruptedException streamcorruptedexception) {
			    argument.p1(-12);
			} catch (java.io.OptionalDataException optionaldataexception) {
			    argument.p1(-13);
			} catch (IllegalAccessException illegalaccessexception) {
			    argument.p1(-14);
			} catch (IllegalArgumentException illegalargumentexception) {
			    argument.p1(-15);
			} catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
			    argument.p1(-16);
			} catch (SecurityException securityexception) {
			    argument.p1(-17);
			} catch (java.io.IOException ioexception) {
			    argument.p1(-18);
			} catch (NullPointerException nullpointerexception) {
			    argument.p1(-19);
			} catch (Exception exception) {
			    argument.p1(-20);
			} catch (Throwable throwable) {
			    argument.p1(-21);
			}
		    }
		}
		argument.pcrc(anLocalInt);
		class59_sub14.unlink();
	    }
	}
    }
    
    static final void method445(int argument, boolean argument_12_) {
	if (argument != 0)
	    aCyclicLinkedList_3838 = null;
	if (client.currentLoadingBar == null)
	    client.updateLoadingBar();
	if (argument_12_)
	    client.currentLoadingBar.method2829();
    }
}
