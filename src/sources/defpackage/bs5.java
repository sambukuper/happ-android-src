package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bs5 {
    public static final ql3 a = new ql3(h75.Y, false);
    public static final ql3 b;
    public static final ql3 c;
    public static final LinkedHashMap d;

    static {
        boolean z = false;
        h75 h75Var = h75.Z;
        b = new ql3(h75Var, false);
        c = new ql3(h75Var, true);
        fj4 fj4Var = new fj4((byte) 1);
        byte b2 = 8;
        new xd6(b2, fj4Var, "java/util/Iterator", z).o("forEachRemaining", null, new ve7((byte) 18));
        new xd6(b2, fj4Var, "java/lang/Iterable", z).o("spliterator", null, new ve7((byte) 29));
        xd6 xd6Var = new xd6(b2, fj4Var, "java/util/Collection", z);
        xd6Var.o("removeIf", null, new zr5((byte) 10));
        xd6Var.o("stream", null, new zr5((byte) 21));
        xd6Var.o("parallelStream", null, new zr5((byte) 26));
        xd6 xd6Var2 = new xd6(b2, fj4Var, "java/util/List", z);
        xd6Var2.o("replaceAll", null, new zr5((byte) 27));
        xd6Var2.o("addFirst", "2.1", new zr5((byte) 28));
        xd6Var2.o("addLast", "2.1", new zr5((byte) 29));
        xd6Var2.o("removeFirst", "2.1", new as5((byte) 0));
        xd6Var2.o("removeLast", "2.1", new as5((byte) 1));
        xd6 xd6Var3 = new xd6(b2, fj4Var, "java/util/LinkedList", z);
        xd6Var3.o("addFirst", "2.1", new ve7((byte) 19));
        xd6Var3.o("addLast", "2.1", new ve7((byte) 20));
        xd6Var3.o("removeFirst", "2.1", new ve7((byte) 21));
        xd6Var3.o("removeLast", "2.1", new ve7((byte) 22));
        xd6 xd6Var4 = new xd6(b2, fj4Var, "java/util/LinkedHashSet", z);
        xd6Var4.o("addFirst", "2.2", new ve7((byte) 23));
        xd6Var4.o("addLast", "2.2", new ve7((byte) 24));
        xd6Var4.o("removeFirst", "2.2", new ve7((byte) 25));
        xd6Var4.o("removeLast", "2.2", new ve7((byte) 26));
        xd6Var4.o("getFirst", "2.2", new ve7((byte) 27));
        xd6Var4.o("getLast", "2.2", new ve7((byte) 28));
        xd6 xd6Var5 = new xd6(b2, fj4Var, "java/util/Map", z);
        xd6Var5.o("forEach", null, new zr5((byte) 0));
        xd6Var5.o("putIfAbsent", null, new zr5((byte) 1));
        xd6Var5.o("replace", null, new zr5((byte) 2));
        xd6Var5.o("replace", null, new zr5((byte) 3));
        xd6Var5.o("replaceAll", null, new zr5((byte) 4));
        xd6Var5.o("compute", null, new zr5((byte) 5));
        xd6Var5.o("computeIfAbsent", null, new zr5((byte) 6));
        xd6Var5.o("computeIfPresent", null, new zr5((byte) 7));
        xd6Var5.o("merge", null, new zr5((byte) 8));
        xd6 xd6Var6 = new xd6(b2, fj4Var, "java/util/LinkedHashMap", z);
        xd6Var6.o("putFirst", "2.2", new zr5((byte) 9));
        xd6Var6.o("putLast", "2.2", new zr5((byte) 11));
        xd6 xd6Var7 = new xd6(b2, fj4Var, "java/util/Optional", z);
        xd6Var7.o("empty", null, new zr5((byte) 12));
        xd6Var7.o("of", null, new zr5((byte) 13));
        xd6Var7.o("ofNullable", null, new zr5((byte) 14));
        xd6Var7.o("get", null, new zr5((byte) 15));
        xd6Var7.o("ifPresent", null, new zr5((byte) 16));
        new xd6(b2, fj4Var, "java/lang/ref/Reference", z).o("get", null, new zr5((byte) 17));
        new xd6(b2, fj4Var, "java/util/function/Predicate", z).o("test", null, new zr5((byte) 18));
        new xd6(b2, fj4Var, "java/util/function/BiPredicate", z).o("test", null, new zr5((byte) 19));
        new xd6(b2, fj4Var, "java/util/function/Consumer", z).o("accept", null, new zr5((byte) 20));
        new xd6(b2, fj4Var, "java/util/function/BiConsumer", z).o("accept", null, new zr5((byte) 22));
        new xd6(b2, fj4Var, "java/util/function/Function", z).o("apply", null, new zr5((byte) 23));
        new xd6(b2, fj4Var, "java/util/function/BiFunction", z).o("apply", null, new zr5((byte) 24));
        new xd6(b2, fj4Var, "java/util/function/Supplier", z).o("get", null, new zr5((byte) 25));
        d = fj4Var.a;
    }
}
