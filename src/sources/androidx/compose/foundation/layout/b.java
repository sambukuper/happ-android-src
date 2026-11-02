package androidx.compose.foundation.layout;

import defpackage.b1;
import defpackage.c59;
import defpackage.dh3;
import defpackage.fp1;
import defpackage.kx4;
import defpackage.n50;
import defpackage.o50;
import defpackage.p50;
import defpackage.pz2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final FillElement a;
    public static final FillElement b;
    public static final FillElement c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;

    static {
        fp1 fp1Var = fp1.Y;
        a = new FillElement(fp1Var);
        fp1 fp1Var2 = fp1.X;
        b = new FillElement(fp1Var2);
        fp1 fp1Var3 = fp1.Z;
        c = new FillElement(fp1Var3);
        n50 n50Var = pz2.r0;
        byte b2 = 29;
        d = new d(fp1Var, new b1(n50Var, b2), n50Var);
        n50 n50Var2 = pz2.q0;
        e = new d(fp1Var, new b1(n50Var2, b2), n50Var2);
        o50 o50Var = pz2.o0;
        f = new d(fp1Var2, new c59(o50Var, (byte) 0), o50Var);
        o50 o50Var2 = pz2.n0;
        g = new d(fp1Var2, new c59(o50Var2, (byte) 0), o50Var2);
        p50 p50Var = pz2.i0;
        h = new d(fp1Var3, new c59(p50Var, (byte) 1), p50Var);
        p50 p50Var2 = pz2.Z;
        i = new d(fp1Var3, new c59(p50Var2, (byte) 1), p50Var2);
    }

    public static final kx4 a(kx4 kx4Var, float f2, float f3) {
        return kx4Var.y(new c(f2, f3));
    }

    public static final kx4 b(kx4 kx4Var, float f2) {
        return kx4Var.y(new a(0.0f, f2, 0.0f, f2, true, 5));
    }

    public static kx4 c(kx4 kx4Var, float f2, int i2) {
        return kx4Var.y(new a(0.0f, (i2 & 1) != 0 ? Float.NaN : f2, 0.0f, (i2 & 2) == 0 ? 300.0f : Float.NaN, true, 5));
    }

    public static final kx4 d(kx4 kx4Var, float f2) {
        return kx4Var.y(new a(f2, f2, f2, f2, false));
    }

    public static final kx4 e(kx4 kx4Var, float f2, float f3) {
        return kx4Var.y(new a(f2, f3, f2, f3, false));
    }

    public static kx4 f(kx4 kx4Var, float f2, float f3, float f4, float f5, int i2) {
        return kx4Var.y(new a(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final kx4 g(kx4 kx4Var, float f2) {
        return kx4Var.y(new a(f2, f2, f2, f2, true));
    }

    public static final kx4 h(kx4 kx4Var, float f2, float f3) {
        return kx4Var.y(new a(f2, f3, f2, f3, true));
    }

    public static final kx4 i(kx4 kx4Var, float f2, float f3, float f4, float f5) {
        return kx4Var.y(new a(f2, f3, f4, f5, true));
    }

    public static kx4 j(kx4 kx4Var, float f2, float f3, float f4, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return i(kx4Var, f2, f3, f4, Float.NaN);
    }

    public static final kx4 k(kx4 kx4Var, float f2) {
        return kx4Var.y(new a(f2, 0.0f, f2, 0.0f, true, 10));
    }

    public static kx4 l(kx4 kx4Var, float f2, int i2) {
        return kx4Var.y(new a((i2 & 1) != 0 ? Float.NaN : 8.0f, 0.0f, (i2 & 2) != 0 ? Float.NaN : f2, 0.0f, true, 10));
    }

    public static kx4 m(kx4 kx4Var) {
        d dVar;
        o50 o50Var = pz2.o0;
        if (dh3.f(o50Var, o50Var)) {
            dVar = f;
        } else if (dh3.f(o50Var, pz2.n0)) {
            dVar = g;
        } else {
            dVar = new d(fp1.X, new c59(o50Var, (byte) 0), o50Var);
        }
        return kx4Var.y(dVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static kx4 n(kx4 kx4Var) {
        d dVar;
        p50 p50Var = pz2.i0;
        if (p50Var.equals(p50Var)) {
            dVar = h;
        } else if (p50Var.equals(pz2.Z)) {
            dVar = i;
        } else {
            dVar = new d(fp1.Z, new c59(p50Var, (byte) 1), p50Var);
        }
        return kx4Var.y(dVar);
    }

    public static kx4 o(kx4 kx4Var) {
        d dVar;
        n50 n50Var = pz2.r0;
        if (dh3.f(n50Var, n50Var)) {
            dVar = d;
        } else if (dh3.f(n50Var, pz2.q0)) {
            dVar = e;
        } else {
            dVar = new d(fp1.Y, new b1(n50Var, (byte) 29), n50Var);
        }
        return kx4Var.y(dVar);
    }
}
