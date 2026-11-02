package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xr {
    public static final xr f;
    public static final xr g;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    static {
        long j = dw0.c;
        long j2 = ep.i;
        long j3 = ep.k;
        long j4 = ep.c;
        long j5 = ep.m;
        f = new xr(j, j2, j3, j4, j5);
        g = new xr(dw0.b, ep.j, j3, j4, j5);
    }

    public xr(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr)) {
            return false;
        }
        xr xrVar = (xr) obj;
        long j = xrVar.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, xrVar.b) && tk8.a(this.c, xrVar.c) && tk8.a(this.d, xrVar.d) && tk8.a(this.e, xrVar.e);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.e) + p61.g(p61.g(p61.g(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        String strH = dw0.h(this.a);
        String strH2 = dw0.h(this.b);
        String strH3 = dw0.h(this.c);
        String strH4 = dw0.h(this.d);
        String strH5 = dw0.h(this.e);
        StringBuilder sbT = oi0.t("AppTextColors(primary=", strH, ", secondary=", strH2, ", tertiary=");
        oi0.y(sbT, strH3, ", accent=", strH4, ", error=");
        return oi0.p(sbT, strH5, ")");
    }
}
