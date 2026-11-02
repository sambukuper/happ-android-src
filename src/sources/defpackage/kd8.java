package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kd8 {
    public final y68 a;
    public de3 b;
    public final qe4 c;
    public final zi1 d;
    public final rh5 e;

    public kd8(y68 y68Var, de3 de3Var, qe4 qe4Var) {
        this.a = y68Var;
        this.b = de3Var;
        this.c = qe4Var;
        this.d = qe4Var != null ? rd7.b(new f98(this, qe4Var, (byte) 1)) : null;
        f09 f09Var = f09.X;
        this.e = z51.H(new r07(f09Var, f09Var));
    }

    public static void h(kd8 kd8Var, CharSequence charSequence, boolean z, boolean z2, int i) {
        boolean z3 = (i & 2) == 0;
        e58 e58Var = (i & 4) != 0 ? e58.X : e58.Y;
        boolean z4 = (i & 8) != 0 ? true : z;
        boolean z5 = (i & 16) != 0 ? false : z2;
        y68 y68Var = kd8Var.a;
        de3 de3Var = kd8Var.b;
        y68Var.b.a().A();
        g48 g48Var = y68Var.b;
        if (z3) {
            g48Var.f(null);
        }
        long j = g48Var.i0;
        g48.d(g48Var, f88.d(j), f88.c(j), charSequence, 0, z5, 24);
        int length = charSequence.length() + f88.d(j);
        mn7.g(g48Var, length, length);
        kd8Var.l(g48Var);
        y68Var.b(de3Var, z4, e58Var);
        y68Var.f(true);
        y68Var.e(y68Var.b.g0);
    }

    public static void i(kd8 kd8Var, String str, long j, boolean z, boolean z2, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        y68 y68Var = kd8Var.a;
        de3 de3Var = kd8Var.b;
        y68Var.b.a().A();
        g48 g48Var = y68Var.b;
        long jE = kd8Var.e(j);
        g48.d(g48Var, f88.d(jE), f88.c(jE), str, 0, z3, 24);
        int length = str.length() + f88.d(jE);
        mn7.g(g48Var, length, length);
        kd8Var.l(g48Var);
        y68Var.b(de3Var, z, e58.X);
        y68Var.f(true);
        y68Var.e(y68Var.b.g0);
    }

    public final void a() {
        de3 de3Var = this.b;
        y68 y68Var = this.a;
        y68Var.b.a().A();
        g48 g48Var = y68Var.b;
        int iC = f88.c(g48Var.i0);
        mn7.g(g48Var, iC, iC);
        y68Var.b(de3Var, true, e58.X);
        y68Var.f(true);
        y68Var.e(y68Var.b.g0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void b(lh lhVar, s51 s51Var) {
        jd8 jd8Var;
        if (s51Var instanceof jd8) {
            jd8Var = (jd8) s51Var;
            int i = jd8Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                jd8Var.h0 = i - Integer.MIN_VALUE;
            } else {
                jd8Var = new jd8(this, s51Var);
            }
        } else {
            jd8Var = new jd8(this, s51Var);
        }
        Object obj = jd8Var.f0;
        int i2 = jd8Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            jd8Var.h0 = 1;
            mm0 mm0Var = new mm0(1, mb6.H(jd8Var));
            mm0Var.s();
            this.a.h.b(lhVar);
            mm0Var.u(new d3(this, lhVar, (byte) 18));
            if (mm0Var.q() == c71.X) {
                return;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            w39.n0(obj);
        }
        b61.n();
    }

    public final void c(boolean z) {
        de3 de3Var = this.b;
        y68 y68Var = this.a;
        y68Var.b.a().A();
        g48 g48Var = y68Var.b;
        g48.d(g48Var, f88.d(g48Var.i0), f88.c(g48Var.i0), _UrlKt.FRAGMENT_ENCODE_SET, 0, z, 24);
        int iD = f88.d(g48Var.i0);
        mn7.g(g48Var, iD, iD);
        l(g48Var);
        y68Var.b(de3Var, true, e58.Y);
        y68Var.f(true);
        y68Var.e(y68Var.b.g0);
    }

    public final h48 d() {
        id8 id8Var;
        zi1 zi1Var = this.d;
        return (zi1Var == null || (id8Var = (id8) zi1Var.getValue()) == null) ? this.a.c() : id8Var.a;
    }

    public final long e(long j) {
        id8 id8Var;
        zi1 zi1Var = this.d;
        qf3 qf3Var = (zi1Var == null || (id8Var = (id8) zi1Var.getValue()) == null) ? null : id8Var.b;
        if (qf3Var == null) {
            return j;
        }
        int i = f88.c;
        long jA = qf3Var.a((int) (j >> 32), false);
        long jA2 = f88.b(j) ? jA : qf3Var.a((int) (4294967295L & j), false);
        int iMin = Math.min(f88.d(jA), f88.d(jA2));
        int iMax = Math.max(f88.c(jA), f88.c(jA2));
        return f88.e(j) ? ct7.c(iMax, iMin) : ct7.c(iMin, iMax);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd8)) {
            return false;
        }
        kd8 kd8Var = (kd8) obj;
        return dh3.f(this.a, kd8Var.a) && dh3.f(this.c, kd8Var.c);
    }

    public final long f(long j) {
        id8 id8Var;
        zi1 zi1Var = this.d;
        qf3 qf3Var = (zi1Var == null || (id8Var = (id8) zi1Var.getValue()) == null) ? null : id8Var.b;
        return qf3Var != null ? qp7.i(j, qf3Var, (r07) this.e.getValue()) : j;
    }

    public final void g(CharSequence charSequence) {
        de3 de3Var = this.b;
        y68 y68Var = this.a;
        y68Var.b.a().A();
        g48 g48Var = y68Var.b;
        g48Var.c(0, g48Var.Z.length(), _UrlKt.FRAGMENT_ENCODE_SET);
        g48Var.append(charSequence.toString());
        l(g48Var);
        y68Var.b(de3Var, true, e58.X);
        y68Var.f(true);
        y68Var.e(y68Var.b.g0);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qe4 qe4Var = this.c;
        return (iHashCode + (qe4Var != null ? qe4Var.hashCode() : 0)) * 31;
    }

    public final void j(long j) {
        k(e(j));
    }

    public final void k(long j) {
        de3 de3Var = this.b;
        y68 y68Var = this.a;
        y68Var.b.a().A();
        g48 g48Var = y68Var.b;
        int i = f88.c;
        mn7.g(g48Var, (int) (j >> 32), (int) (j & 4294967295L));
        y68Var.b(de3Var, true, e58.X);
        y68Var.f(true);
        y68Var.e(y68Var.b.g0);
    }

    public final void l(g48 g48Var) {
        if (((c15) g48Var.a().Y).Z <= 0 || !f88.b(g48Var.i0)) {
            return;
        }
        f09 f09Var = f09.X;
        this.e.setValue(new r07(f09Var, f09Var));
    }

    public final String toString() {
        y68 y68Var = this.a;
        return "TransformedTextFieldState(textFieldState=" + y68Var + ", outputTransformation=null, outputTransformedText=null, codepointTransformation=" + this.c + ", codepointTransformedText=" + this.d + ", outputText=\"" + ((Object) y68Var.c()) + "\", visualText=\"" + ((Object) d()) + "\")";
    }
}
