package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ll3 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final qs0 e;
    public static final fk2 f;
    public static final qs0 g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final HashMap k;
    public static final HashMap l;
    public static final HashMap m;
    public static final LinkedHashSet n;
    public static final List o;

    static {
        StringBuilder sb = new StringBuilder();
        oo2 oo2Var = oo2.d;
        sb.append(oo2Var.a);
        sb.append('.');
        sb.append(oo2Var.b);
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        po2 po2Var = po2.d;
        sb2.append(po2Var.a);
        sb2.append('.');
        sb2.append(po2Var.b);
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        ro2 ro2Var = ro2.d;
        sb3.append(ro2Var.a);
        sb3.append('.');
        sb3.append(ro2Var.b);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        qo2 qo2Var = qo2.d;
        sb4.append(qo2Var.a);
        sb4.append('.');
        sb4.append(qo2Var.b);
        d = sb4.toString();
        qs0 qs0VarS = jb5.S(new fk2("kotlin.jvm.functions.FunctionN"));
        e = qs0VarS;
        f = qs0VarS.a();
        g = qg7.v;
        e(Class.class);
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        l = new HashMap();
        m = new HashMap();
        n = new LinkedHashSet();
        qs0 qs0VarS2 = jb5.S(tg7.B);
        fk2 fk2Var = tg7.J;
        fk2 fk2Var2 = qs0VarS2.a;
        kl3 kl3Var = new kl3(e(Iterable.class), qs0VarS2, new qs0(fk2Var2, z68.I0(fk2Var, fk2Var2), false));
        qs0 qs0VarS3 = jb5.S(tg7.A);
        fk2 fk2Var3 = tg7.I;
        fk2 fk2Var4 = qs0VarS3.a;
        kl3 kl3Var2 = new kl3(e(Iterator.class), qs0VarS3, new qs0(fk2Var4, z68.I0(fk2Var3, fk2Var4), false));
        qs0 qs0VarS4 = jb5.S(tg7.C);
        fk2 fk2Var5 = tg7.K;
        fk2 fk2Var6 = qs0VarS4.a;
        kl3 kl3Var3 = new kl3(e(Collection.class), qs0VarS4, new qs0(fk2Var6, z68.I0(fk2Var5, fk2Var6), false));
        qs0 qs0VarS5 = jb5.S(tg7.D);
        fk2 fk2Var7 = tg7.L;
        fk2 fk2Var8 = qs0VarS5.a;
        kl3 kl3Var4 = new kl3(e(List.class), qs0VarS5, new qs0(fk2Var8, z68.I0(fk2Var7, fk2Var8), false));
        qs0 qs0VarS6 = jb5.S(tg7.F);
        fk2 fk2Var9 = tg7.N;
        fk2 fk2Var10 = qs0VarS6.a;
        kl3 kl3Var5 = new kl3(e(Set.class), qs0VarS6, new qs0(fk2Var10, z68.I0(fk2Var9, fk2Var10), false));
        qs0 qs0VarS7 = jb5.S(tg7.E);
        fk2 fk2Var11 = tg7.M;
        fk2 fk2Var12 = qs0VarS7.a;
        kl3 kl3Var6 = new kl3(e(ListIterator.class), qs0VarS7, new qs0(fk2Var12, z68.I0(fk2Var11, fk2Var12), false));
        fk2 fk2Var13 = tg7.G;
        qs0 qs0VarS8 = jb5.S(fk2Var13);
        fk2 fk2Var14 = tg7.O;
        fk2 fk2Var15 = qs0VarS8.a;
        kl3 kl3Var7 = new kl3(e(Map.class), qs0VarS8, new qs0(fk2Var15, z68.I0(fk2Var14, fk2Var15), false));
        qs0 qs0VarD = jb5.S(fk2Var13).d(tg7.H.a.g());
        fk2 fk2Var16 = tg7.P;
        fk2 fk2Var17 = qs0VarD.a;
        List<kl3> listL = i21.L(kl3Var, kl3Var2, kl3Var3, kl3Var4, kl3Var5, kl3Var6, kl3Var7, new kl3(e(Map.Entry.class), qs0VarD, new qs0(fk2Var17, z68.I0(fk2Var16, fk2Var17), false)));
        o = listL;
        d(Object.class, tg7.a);
        d(String.class, tg7.f);
        d(CharSequence.class, tg7.e);
        c(Throwable.class, tg7.k);
        d(Cloneable.class, tg7.c);
        d(Number.class, tg7.i);
        c(Comparable.class, tg7.l);
        d(Enum.class, tg7.j);
        c(Annotation.class, tg7.s);
        for (kl3 kl3Var8 : listL) {
            qs0 qs0Var = kl3Var8.a;
            qs0 qs0Var2 = kl3Var8.b;
            qs0 qs0Var3 = kl3Var8.c;
            a(qs0Var, qs0Var2);
            b(qs0Var3.a(), qs0Var);
            l.put(qs0Var3, qs0Var2);
            m.put(qs0Var2, qs0Var3);
            fk2 fk2VarA = qs0Var2.a();
            fk2 fk2VarA2 = qs0Var3.a();
            j.put(qs0Var3.a().a, fk2VarA);
            k.put(fk2VarA.a, fk2VarA2);
        }
        for (ut3 ut3Var : ut3.values()) {
            fk2 fk2Var18 = ut3Var.f0;
            qs0 qs0Var4 = new qs0(fk2Var18.b(), fk2Var18.a.g());
            du5 du5VarC = ut3Var.c();
            du5VarC.getClass();
            fk2 fk2VarA3 = ug7.k.a(du5VarC.X);
            a(qs0Var4, new qs0(fk2VarA3.b(), fk2VarA3.a.g()));
        }
        for (qs0 qs0Var5 : px0.a) {
            fk2 fk2Var19 = new fk2("kotlin.jvm.internal." + qs0Var5.f().b() + "CompanionObject");
            a(new qs0(fk2Var19.b(), fk2Var19.a.g()), qs0Var5.d(hf7.b));
        }
        for (int i2 = 0; i2 < 23; i2++) {
            fk2 fk2Var20 = new fk2(pc6.j(i2, "kotlin.jvm.functions.Function"));
            a(new qs0(fk2Var20.b(), fk2Var20.a.g()), new qs0(ug7.k, v15.e("Function" + i2)));
            b(new fk2(b + i2), g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            b(new fk2(d + i3), g);
        }
        b(new fk2("kotlin.concurrent.atomics.AtomicInt"), e(AtomicInteger.class));
        b(new fk2("kotlin.concurrent.atomics.AtomicLong"), e(AtomicLong.class));
        b(new fk2("kotlin.concurrent.atomics.AtomicBoolean"), e(AtomicBoolean.class));
        b(new fk2("kotlin.concurrent.atomics.AtomicReference"), e(AtomicReference.class));
        b(new fk2("kotlin.concurrent.atomics.AtomicIntArray"), e(AtomicIntegerArray.class));
        b(new fk2("kotlin.concurrent.atomics.AtomicLongArray"), e(AtomicLongArray.class));
        b(new fk2("kotlin.concurrent.atomics.AtomicArray"), e(AtomicReferenceArray.class));
        b(tg7.b.i(), e(Void.class));
    }

    public static void a(qs0 qs0Var, qs0 qs0Var2) {
        h.put(qs0Var.a().a, qs0Var2);
        b(qs0Var2.a(), qs0Var);
    }

    public static void b(fk2 fk2Var, qs0 qs0Var) {
        n.add(fk2Var);
        i.put(fk2Var.a, qs0Var);
    }

    public static void c(Class cls, fk2 fk2Var) {
        qs0 qs0VarE = e(cls);
        fk2Var.getClass();
        a(qs0VarE, new qs0(fk2Var.b(), fk2Var.a.g()));
    }

    public static void d(Class cls, gk2 gk2Var) {
        c(cls, gk2Var.i());
    }

    public static qs0 e(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return e(declaringClass).d(v15.e(cls.getSimpleName()));
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        fk2 fk2Var = new fk2(canonicalName);
        return new qs0(fk2Var.b(), fk2Var.a.g());
    }

    public static boolean f(gk2 gk2Var, String str, boolean z) {
        String str2 = gk2Var.a;
        if (mm7.Z(str2, false, str)) {
            String strSubstring = str2.substring(str.length());
            if (!fm7.G0('0', strSubstring)) {
                Integer numB0 = mm7.b0(strSubstring);
                int i2 = z ? 22 : 23;
                if (numB0 != null && numB0.intValue() >= i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static qs0 g(fk2 fk2Var) {
        fk2Var.getClass();
        return (qs0) h.get(fk2Var.a);
    }

    public static qs0 h(gk2 gk2Var) {
        gk2Var.getClass();
        if (f(gk2Var, a, false) || f(gk2Var, c, true)) {
            return e;
        }
        return (f(gk2Var, b, false) || f(gk2Var, d, true)) ? g : (qs0) i.get(gk2Var);
    }
}
