/* dba_sub_772_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeap;

final class dba_sub_772_Sub2 extends dba_sub_772
{
    static boolean aBoolean6364;
    static Class329 aClass329_6365;
    static int anInt6366;
    static int anInt6367;
    static Class368[] aClass368Array6368;
    static int anInt6369;
    static int[] anIntArray6370 = new int[200];
    NativeHeap aNativeHeap6371;
    static boolean aBoolean6372;
    
    public static void method1313(byte argument) {
	aClass329_6365 = null;
	anIntArray6370 = null;
	aClass368Array6368 = null;
    }
    
    final void method1314(int argument_0_) {
	((dba_sub_772_Sub2) this).aNativeHeap6371.safeDeallocate();
    }
    
    static final boolean method1315(byte argument, boolean argument_1_) {
	boolean anLocalBoolean = Class389.aGraphicsToolkit3281.method2019();
	if (!argument_1_ == !anLocalBoolean)
	    return true;
	if (argument_1_) {
	    if (!Class389.aGraphicsToolkit3281.method2092())
		argument_1_ = false;
	} else
	    Class389.aGraphicsToolkit3281.method2051();
	if (argument_1_ == !anLocalBoolean) {
	    AthmosphericConditions.aClass59_Sub50_116.method1159(argument_1_ ? 1 : 0,
						  (((Node_Sub50)
						    AthmosphericConditions.aClass59_Sub50_116)
						   .aClass62_Sub14_4327),
						  76);
	    Class251.method3240(false);
	    return true;
	}
	return false;
    }
    
    static final void method1316(int argument, int argument_2_,
				 int argument_3_, Class argument_4_) {
	Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			     [argument][argument_2_][argument_3_]);
	if (class148 != null) {
	    for (Class110 class110 = ((Class148) class148).aClass110_1126;
		 class110 != null;
		 class110 = ((Class110) class110).aClass110_912) {
		DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2
		    = ((Class110) class110).aClass104_Sub2_Sub2_911;
		if (argument_4_.isAssignableFrom(class104_sub2_sub2.getClass())
		    && (((DoublyLinkedNodeP2_Sub2_Sub2) class104_sub2_sub2).left
			== argument_2_)
		    && (((DoublyLinkedNodeP2_Sub2_Sub2) class104_sub2_sub2).bottom
			== argument_3_)) {
		    Class189_Sub1.method2874(class104_sub2_sub2, false);
		    break;
		}
	    }
	}
    }
    
    dba_sub_772_Sub2(int argument_5_) {
	((dba_sub_772_Sub2) this).aNativeHeap6371
	    = new NativeHeap(argument_5_);
    }
    
    static {
	aBoolean6364 = false;
	anInt6369 = 0;
	aClass329_6365 = new Class329(8, 2);
	aBoolean6372 = false;
    }
}
