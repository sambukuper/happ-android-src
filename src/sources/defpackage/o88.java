package defpackage;

import okhttp3.dnsoverhttps.DnsOverHttps;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o88 {
    public static final o88 d = new o88(0, 0, null, null, 0, 0, 0, 0, 16777215);
    public final qe7 a;
    public final xg5 b;
    public final up5 c;

    public o88(long j, long j2, dj2 dj2Var, bj2 bj2Var, long j3, int i, int i2, long j4, int i3) {
        this(new qe7((i3 & 1) != 0 ? dw0.g : j, (i3 & 2) != 0 ? v88.c : j2, (i3 & 4) != 0 ? null : dj2Var, (i3 & 8) != 0 ? null : bj2Var, (cj2) null, (gi2) null, (String) null, (i3 & 128) != 0 ? v88.c : j3, (x20) null, (g78) null, (ge4) null, dw0.g, (x38) null, (t67) null, (qp5) null), new xg5((32768 & i3) != 0 ? 0 : i, (65536 & i3) == 0 ? i2 : 0, (i3 & 131072) != 0 ? v88.c : j4, null, null, null, 0, 0, null), null);
    }

    public static o88 a(o88 o88Var, long j, long j2, dj2 dj2Var, gi2 gi2Var, long j3, long j4, aa4 aa4Var, int i) {
        f78 pw0Var;
        up5 up5Var = mb6.g0;
        long jB = (i & 1) != 0 ? o88Var.a.a.b() : j;
        long j5 = (i & 2) != 0 ? o88Var.a.b : j2;
        dj2 dj2Var2 = (i & 4) != 0 ? o88Var.a.c : dj2Var;
        qe7 qe7Var = o88Var.a;
        bj2 bj2Var = qe7Var.d;
        cj2 cj2Var = qe7Var.e;
        gi2 gi2Var2 = (i & 32) != 0 ? qe7Var.f : gi2Var;
        String str = qe7Var.g;
        long j6 = (i & 128) != 0 ? qe7Var.h : j3;
        x20 x20Var = qe7Var.i;
        g78 g78Var = qe7Var.j;
        ge4 ge4Var = qe7Var.k;
        long j7 = qe7Var.l;
        x38 x38Var = qe7Var.m;
        t67 t67Var = qe7Var.n;
        tv1 tv1Var = qe7Var.p;
        int i2 = (i & 32768) != 0 ? o88Var.b.a : 6;
        int i3 = (i & DnsOverHttps.MAX_RESPONSE_SIZE) != 0 ? o88Var.b.b : 1;
        long j8 = (i & 131072) != 0 ? o88Var.b.c : j4;
        xg5 xg5Var = o88Var.b;
        i78 i78Var = xg5Var.d;
        up5 up5Var2 = (i & 524288) != 0 ? o88Var.c : up5Var;
        aa4 aa4Var2 = (i & 1048576) != 0 ? xg5Var.f : aa4Var;
        int i4 = xg5Var.g;
        int i5 = xg5Var.h;
        e88 e88Var = xg5Var.i;
        long jB2 = qe7Var.a.b();
        int i6 = dw0.h;
        if (tk8.a(jB, jB2)) {
            pw0Var = qe7Var.a;
        } else {
            pw0Var = jB != 16 ? new pw0(jB) : e78.a;
        }
        return new o88(new qe7(pw0Var, j5, dj2Var2, bj2Var, cj2Var, gi2Var2, str, j6, x20Var, g78Var, ge4Var, j7, x38Var, t67Var, up5Var2 != null ? up5Var2.a : null, tv1Var), new xg5(i2, i3, j8, i78Var, up5Var2 != null ? up5Var2.b : null, aa4Var2, i4, i5, e88Var), up5Var2);
    }

    public static o88 e(o88 o88Var, long j, long j2, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? v88.c : j2;
        long j6 = (i2 & 128) != 0 ? v88.c : j3;
        long j7 = dw0.g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? v88.c : j4;
        qe7 qe7VarA = re7.a(o88Var.a, j, null, Float.NaN, j5, null, null, null, null, null, j6, null, null, null, j7, null, null, null, null);
        xg5 xg5VarA = yg5.a(o88Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (o88Var.a == qe7VarA && o88Var.b == xg5VarA) ? o88Var : new o88(qe7VarA, xg5VarA);
    }

    public final long b() {
        return this.a.a.b();
    }

    public final boolean c(o88 o88Var) {
        if (this != o88Var) {
            return dh3.f(this.b, o88Var.b) && this.a.a(o88Var.a);
        }
        return true;
    }

    public final o88 d(o88 o88Var) {
        return (o88Var == null || o88Var.equals(d)) ? this : new o88(this.a.c(o88Var.a), this.b.a(o88Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o88)) {
            return false;
        }
        o88 o88Var = (o88) obj;
        return dh3.f(this.a, o88Var.a) && dh3.f(this.b, o88Var.b) && dh3.f(this.c, o88Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        up5 up5Var = this.c;
        return iHashCode + (up5Var != null ? up5Var.hashCode() : 0);
    }

    public final String toString() {
        String strH = dw0.h(b());
        qe7 qe7Var = this.a;
        d90 d90VarC = qe7Var.a.c();
        float fA = qe7Var.a.a();
        String strE = v88.e(qe7Var.b);
        dj2 dj2Var = qe7Var.c;
        bj2 bj2Var = qe7Var.d;
        cj2 cj2Var = qe7Var.e;
        gi2 gi2Var = qe7Var.f;
        String str = qe7Var.g;
        String strE2 = v88.e(qe7Var.h);
        x20 x20Var = qe7Var.i;
        g78 g78Var = qe7Var.j;
        ge4 ge4Var = qe7Var.k;
        String strH2 = dw0.h(qe7Var.l);
        x38 x38Var = qe7Var.m;
        t67 t67Var = qe7Var.n;
        tv1 tv1Var = qe7Var.p;
        xg5 xg5Var = this.b;
        String strA = o28.a(xg5Var.a);
        String strA2 = b48.a(xg5Var.b);
        String strE3 = v88.e(xg5Var.c);
        i78 i78Var = xg5Var.d;
        aa4 aa4Var = xg5Var.f;
        String strA3 = v94.a(xg5Var.g);
        String strA4 = w23.a(xg5Var.h);
        e88 e88Var = xg5Var.i;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(strH);
        sb.append(", brush=");
        sb.append(d90VarC);
        sb.append(", alpha=");
        sb.append(fA);
        sb.append(", fontSize=");
        sb.append(strE);
        sb.append(", fontWeight=");
        sb.append(dj2Var);
        sb.append(", fontStyle=");
        sb.append(bj2Var);
        sb.append(", fontSynthesis=");
        sb.append(cj2Var);
        sb.append(", fontFamily=");
        sb.append(gi2Var);
        sb.append(", fontFeatureSettings=");
        oi0.y(sb, str, ", letterSpacing=", strE2, ", baselineShift=");
        sb.append(x20Var);
        sb.append(", textGeometricTransform=");
        sb.append(g78Var);
        sb.append(", localeList=");
        sb.append(ge4Var);
        sb.append(", background=");
        sb.append(strH2);
        sb.append(", textDecoration=");
        sb.append(x38Var);
        sb.append(", shadow=");
        sb.append(t67Var);
        sb.append(", drawStyle=");
        sb.append(tv1Var);
        sb.append(", textAlign=");
        sb.append(strA);
        sb.append(", textDirection=");
        oi0.y(sb, strA2, ", lineHeight=", strE3, ", textIndent=");
        sb.append(i78Var);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(aa4Var);
        sb.append(", lineBreak=");
        sb.append(strA3);
        sb.append(", hyphens=");
        sb.append(strA4);
        sb.append(", textMotion=");
        sb.append(e88Var);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o88(qe7 qe7Var, xg5 xg5Var) {
        qp5 qp5Var = qe7Var.o;
        fp5 fp5Var = xg5Var.e;
        this(qe7Var, xg5Var, (qp5Var == null && fp5Var == null) ? null : new up5(qp5Var, fp5Var));
    }

    public o88(qe7 qe7Var, xg5 xg5Var, up5 up5Var) {
        this.a = qe7Var;
        this.b = xg5Var;
        this.c = up5Var;
    }
}
