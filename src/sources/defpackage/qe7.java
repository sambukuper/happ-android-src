package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qe7 implements ml {
    public final f78 a;
    public final long b;
    public final dj2 c;
    public final bj2 d;
    public final cj2 e;
    public final gi2 f;
    public final String g;
    public final long h;
    public final x20 i;
    public final g78 j;
    public final ge4 k;
    public final long l;
    public final x38 m;
    public final t67 n;
    public final qp5 o;
    public final tv1 p;

    public qe7(long j, long j2, dj2 dj2Var, bj2 bj2Var, cj2 cj2Var, gi2 gi2Var, String str, long j3, x20 x20Var, g78 g78Var, ge4 ge4Var, long j4, x38 x38Var, t67 t67Var, int i) {
        this((i & 1) != 0 ? dw0.g : j, (i & 2) != 0 ? v88.c : j2, (i & 4) != 0 ? null : dj2Var, (i & 8) != 0 ? null : bj2Var, (i & 16) != 0 ? null : cj2Var, (i & 32) != 0 ? null : gi2Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? v88.c : j3, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : x20Var, (i & 512) != 0 ? null : g78Var, (i & 1024) != 0 ? null : ge4Var, (i & 2048) != 0 ? dw0.g : j4, (i & 4096) != 0 ? null : x38Var, (i & 8192) != 0 ? null : t67Var, (qp5) null);
    }

    public final boolean a(qe7 qe7Var) {
        if (this == qe7Var) {
            return true;
        }
        if (!v88.a(this.b, qe7Var.b) || !dh3.f(this.c, qe7Var.c) || !dh3.f(this.d, qe7Var.d) || !dh3.f(this.e, qe7Var.e) || !dh3.f(this.f, qe7Var.f) || !dh3.f(this.g, qe7Var.g) || !v88.a(this.h, qe7Var.h) || !dh3.f(this.i, qe7Var.i) || !dh3.f(this.j, qe7Var.j) || !dh3.f(this.k, qe7Var.k)) {
            return false;
        }
        long j = qe7Var.l;
        int i = dw0.h;
        return tk8.a(this.l, j) && dh3.f(this.o, qe7Var.o);
    }

    public final boolean b(qe7 qe7Var) {
        return dh3.f(this.a, qe7Var.a) && dh3.f(this.m, qe7Var.m) && dh3.f(this.n, qe7Var.n) && dh3.f(this.p, qe7Var.p);
    }

    public final qe7 c(qe7 qe7Var) {
        if (qe7Var == null) {
            return this;
        }
        f78 f78Var = qe7Var.a;
        return re7.a(this, f78Var.b(), f78Var.c(), f78Var.a(), qe7Var.b, qe7Var.c, qe7Var.d, qe7Var.e, qe7Var.f, qe7Var.g, qe7Var.h, qe7Var.i, qe7Var.j, qe7Var.k, qe7Var.l, qe7Var.m, qe7Var.n, qe7Var.o, qe7Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe7)) {
            return false;
        }
        qe7 qe7Var = (qe7) obj;
        return a(qe7Var) && b(qe7Var);
    }

    public final int hashCode() {
        f78 f78Var = this.a;
        long jB = f78Var.b();
        int i = dw0.h;
        int iHashCode = Long.hashCode(jB) * 31;
        d90 d90VarC = f78Var.c();
        int iHashCode2 = (Float.hashCode(f78Var.a()) + ((iHashCode + (d90VarC != null ? d90VarC.hashCode() : 0)) * 31)) * 31;
        w88[] w88VarArr = v88.b;
        int iG = p61.g(iHashCode2, this.b, 31);
        dj2 dj2Var = this.c;
        int i2 = (iG + (dj2Var != null ? dj2Var.X : 0)) * 31;
        bj2 bj2Var = this.d;
        int iHashCode3 = (i2 + (bj2Var != null ? Integer.hashCode(bj2Var.a) : 0)) * 31;
        cj2 cj2Var = this.e;
        int iHashCode4 = (iHashCode3 + (cj2Var != null ? Integer.hashCode(cj2Var.a) : 0)) * 31;
        gi2 gi2Var = this.f;
        int iHashCode5 = (iHashCode4 + (gi2Var != null ? gi2Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iG2 = p61.g((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, this.h, 31);
        x20 x20Var = this.i;
        int iHashCode6 = (iG2 + (x20Var != null ? Float.hashCode(x20Var.a) : 0)) * 31;
        g78 g78Var = this.j;
        int iHashCode7 = (iHashCode6 + (g78Var != null ? g78Var.hashCode() : 0)) * 31;
        ge4 ge4Var = this.k;
        int iG3 = p61.g((iHashCode7 + (ge4Var != null ? ge4Var.X.hashCode() : 0)) * 31, this.l, 31);
        x38 x38Var = this.m;
        int i3 = (iG3 + (x38Var != null ? x38Var.a : 0)) * 31;
        t67 t67Var = this.n;
        int iHashCode8 = (i3 + (t67Var != null ? t67Var.hashCode() : 0)) * 31;
        qp5 qp5Var = this.o;
        int iHashCode9 = (iHashCode8 + (qp5Var != null ? qp5Var.hashCode() : 0)) * 31;
        tv1 tv1Var = this.p;
        return iHashCode9 + (tv1Var != null ? tv1Var.hashCode() : 0);
    }

    public final String toString() {
        f78 f78Var = this.a;
        String strH = dw0.h(f78Var.b());
        d90 d90VarC = f78Var.c();
        float fA = f78Var.a();
        String strE = v88.e(this.b);
        String strE2 = v88.e(this.h);
        String strH2 = dw0.h(this.l);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(strH);
        sb.append(", brush=");
        sb.append(d90VarC);
        sb.append(", alpha=");
        sb.append(fA);
        sb.append(", fontSize=");
        sb.append(strE);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        oi0.y(sb, this.g, ", letterSpacing=", strE2, ", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append(strH2);
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }

    public qe7(f78 f78Var, long j, dj2 dj2Var, bj2 bj2Var, cj2 cj2Var, gi2 gi2Var, String str, long j2, x20 x20Var, g78 g78Var, ge4 ge4Var, long j3, x38 x38Var, t67 t67Var, qp5 qp5Var, tv1 tv1Var) {
        this.a = f78Var;
        this.b = j;
        this.c = dj2Var;
        this.d = bj2Var;
        this.e = cj2Var;
        this.f = gi2Var;
        this.g = str;
        this.h = j2;
        this.i = x20Var;
        this.j = g78Var;
        this.k = ge4Var;
        this.l = j3;
        this.m = x38Var;
        this.n = t67Var;
        this.o = qp5Var;
        this.p = tv1Var;
    }

    public qe7(long j, long j2, dj2 dj2Var, bj2 bj2Var, cj2 cj2Var, gi2 gi2Var, String str, long j3, x20 x20Var, g78 g78Var, ge4 ge4Var, long j4, x38 x38Var, t67 t67Var, qp5 qp5Var) {
        f78 pw0Var;
        if (j != 16) {
            pw0Var = new pw0(j);
        } else {
            pw0Var = e78.a;
        }
        this(pw0Var, j2, dj2Var, bj2Var, cj2Var, gi2Var, str, j3, x20Var, g78Var, ge4Var, j4, x38Var, t67Var, qp5Var, null);
    }
}
