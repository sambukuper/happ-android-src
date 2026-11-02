package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tg7 {
    public static final fk2 A;
    public static final fk2 B;
    public static final fk2 C;
    public static final fk2 D;
    public static final fk2 E;
    public static final fk2 F;
    public static final fk2 G;
    public static final fk2 H;
    public static final fk2 I;
    public static final fk2 J;
    public static final fk2 K;
    public static final fk2 L;
    public static final fk2 M;
    public static final fk2 N;
    public static final fk2 O;
    public static final fk2 P;
    public static final gk2 Q;
    public static final qs0 R;
    public static final qs0 S;
    public static final qs0 T;
    public static final qs0 U;
    public static final qs0 V;
    public static final fk2 W;
    public static final fk2 X;
    public static final fk2 Y;
    public static final fk2 Z;
    public static final fk2 a0;
    public static final fk2 b0;
    public static final fk2 c0;
    public static final gk2 d;
    public static final HashSet d0;
    public static final gk2 e;
    public static final HashSet e0;
    public static final gk2 f;
    public static final HashMap f0;
    public static final gk2 g;
    public static final HashMap g0;
    public static final gk2 h;
    public static final gk2 i;
    public static final gk2 j;
    public static final fk2 k;
    public static final fk2 l;
    public static final fk2 m;
    public static final fk2 n;
    public static final fk2 o;
    public static final fk2 p;
    public static final fk2 q;
    public static final fk2 r;
    public static final fk2 s;
    public static final fk2 t;
    public static final fk2 u;
    public static final fk2 v;
    public static final fk2 w;
    public static final fk2 x;
    public static final fk2 y;
    public static final fk2 z;
    public static final gk2 a = d("Any").a;
    public static final gk2 b = d("Nothing").a;
    public static final gk2 c = d("Cloneable").a;

    static {
        d("Suppress");
        d = d("Unit").a;
        e = d("CharSequence").a;
        f = d("String").a;
        g = d("Array").a;
        h = d("Boolean").a;
        d("Char");
        d("Byte");
        d("Short");
        d("Int");
        d("Long");
        d("Float");
        d("Double");
        i = d("Number").a;
        j = d("Enum").a;
        d("Function");
        k = d("Throwable");
        l = d("Comparable");
        e("IntRange");
        e("LongRange");
        e("CharRange");
        e("IntProgression");
        e("LongProgression");
        e("CharProgression");
        m = d("Deprecated");
        d("DeprecatedSinceKotlin");
        n = d("DeprecationLevel");
        o = d("ReplaceWith");
        p = d("ExtensionFunctionType");
        q = d("ContextFunctionTypeParams");
        fk2 fk2VarD = d("ParameterName");
        r = fk2VarD;
        jb5.S(fk2VarD);
        s = d("Annotation");
        fk2 fk2VarA = a("Target");
        t = fk2VarA;
        jb5.S(fk2VarA);
        u = a("AnnotationTarget");
        v = a("AnnotationRetention");
        fk2 fk2VarA2 = a("Retention");
        w = fk2VarA2;
        jb5.S(fk2VarA2);
        jb5.S(a("Repeatable"));
        x = a("MustBeDocumented");
        y = d("UnsafeVariance");
        d("PublishedApi");
        ug7.o.a(v15.e("AccessibleLateinitPropertyLiteral"));
        fk2 fk2Var = new fk2("kotlin.internal.PlatformDependent");
        z = fk2Var;
        jb5.S(fk2Var);
        d("IntroducedAt");
        A = b("Iterator");
        B = b("Iterable");
        C = b("Collection");
        D = b("List");
        E = b("ListIterator");
        F = b("Set");
        fk2 fk2VarB = b("Map");
        G = fk2VarB;
        H = fk2VarB.a(v15.e("Entry"));
        I = b("MutableIterator");
        J = b("MutableIterable");
        K = b("MutableCollection");
        L = b("MutableList");
        M = b("MutableListIterator");
        N = b("MutableSet");
        fk2 fk2VarB2 = b("MutableMap");
        O = fk2VarB2;
        P = fk2VarB2.a(v15.e("MutableEntry"));
        Q = f("KClass");
        f("KType");
        f("KCallable");
        f("KProperty0");
        f("KProperty1");
        f("KProperty2");
        f("KMutableProperty0");
        f("KMutableProperty1");
        f("KMutableProperty2");
        gk2 gk2VarF = f("KProperty");
        f("KMutableProperty");
        R = jb5.S(gk2VarF.i());
        f("KDeclarationContainer");
        f("findAssociatedObject");
        fk2 fk2VarD2 = d("UByte");
        fk2 fk2VarD3 = d("UShort");
        fk2 fk2VarD4 = d("UInt");
        fk2 fk2VarD5 = d("ULong");
        S = jb5.S(fk2VarD2);
        T = jb5.S(fk2VarD3);
        U = jb5.S(fk2VarD4);
        V = jb5.S(fk2VarD5);
        W = d("UByteArray");
        X = d("UShortArray");
        Y = d("UIntArray");
        Z = d("ULongArray");
        c("AtomicInt");
        c("AtomicLong");
        c("AtomicBoolean");
        c("AtomicReference");
        a0 = c("AtomicIntArray");
        b0 = c("AtomicLongArray");
        c0 = c("AtomicArray");
        int length = du5.values().length;
        HashSet hashSet = new HashSet(length < 3 ? 3 : (length / 3) + length + 1);
        for (du5 du5Var : du5.values()) {
            hashSet.add(du5Var.X);
        }
        d0 = hashSet;
        int length2 = du5.values().length;
        HashSet hashSet2 = new HashSet(length2 < 3 ? 3 : (length2 / 3) + length2 + 1);
        for (du5 du5Var2 : du5.values()) {
            hashSet2.add(du5Var2.Y);
        }
        e0 = hashSet2;
        int length3 = du5.values().length;
        HashMap map = new HashMap(length3 < 3 ? 3 : (length3 / 3) + length3 + 1);
        for (du5 du5Var3 : du5.values()) {
            String strB = du5Var3.X.b();
            strB.getClass();
            map.put(d(strB).a, du5Var3);
        }
        f0 = map;
        int length4 = du5.values().length;
        HashMap map2 = new HashMap(length4 >= 3 ? (length4 / 3) + length4 + 1 : 3);
        for (du5 du5Var4 : du5.values()) {
            String strB2 = du5Var4.Y.b();
            strB2.getClass();
            map2.put(d(strB2).a, du5Var4);
        }
        g0 = map2;
    }

    public static fk2 a(String str) {
        return ug7.l.a(v15.e(str));
    }

    public static fk2 b(String str) {
        return ug7.m.a(v15.e(str));
    }

    public static fk2 c(String str) {
        return ug7.p.a(v15.e(str));
    }

    public static fk2 d(String str) {
        return ug7.k.a(v15.e(str));
    }

    public static void e(String str) {
        ug7.n.a(v15.e(str));
    }

    public static final gk2 f(String str) {
        return ug7.i.a(v15.e(str)).a;
    }
}
