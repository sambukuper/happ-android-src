package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ir {
    public static final ir k;
    public static final ir l;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    static {
        long j = dw0.c;
        long j2 = dw0.b;
        long j3 = ep.c;
        k = new ir(j, j, j, j, j2, j, j3, dw0.b(0.33f, j), j, dw0.b(0.12f, j));
        l = new ir(j, j, j2, j, j, j2, j3, dw0.b(0.33f, ep.v), j2, dw0.b(0.12f, j2));
    }

    public ir(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir)) {
            return false;
        }
        ir irVar = (ir) obj;
        long j = irVar.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, irVar.b) && tk8.a(this.c, irVar.c) && tk8.a(this.d, irVar.d) && tk8.a(this.e, irVar.e) && tk8.a(this.f, irVar.f) && tk8.a(this.g, irVar.g) && tk8.a(this.h, irVar.h) && tk8.a(this.i, irVar.i) && tk8.a(this.j, irVar.j);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.j) + p61.g(p61.g(p61.g(p61.g(p61.g(p61.g(p61.g(p61.g(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31);
    }

    public final String toString() {
        String strH = dw0.h(this.a);
        String strH2 = dw0.h(this.b);
        String strH3 = dw0.h(this.c);
        String strH4 = dw0.h(this.d);
        String strH5 = dw0.h(this.e);
        String strH6 = dw0.h(this.f);
        String strH7 = dw0.h(this.g);
        String strH8 = dw0.h(this.h);
        String strH9 = dw0.h(this.i);
        String strH10 = dw0.h(this.j);
        StringBuilder sbT = oi0.t("AppFilledButtonColors(contentPrimary=", strH, ", contentPrimaryDisabled=", strH2, ", contentPrimaryTv=");
        oi0.y(sbT, strH3, ", contentPrimaryTvFocused=", strH4, ", contentSecondary=");
        oi0.y(sbT, strH5, ", contentTertiary=", strH6, ", backgroundPrimary=");
        oi0.y(sbT, strH7, ", backgroundPrimaryDisabled=", strH8, ", backgroundSecondary=");
        return oi0.q(sbT, strH9, ", backgroundTertiary=", strH10, ")");
    }
}
