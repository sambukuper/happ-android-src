package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bs {
    public static final bs i;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        long j = dw0.c;
        i = new bs(j, ep.c, j, ep.w, dw0.b(0.5f, j), ep.d, ep.x, ep.l);
    }

    public bs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs)) {
            return false;
        }
        bs bsVar = (bs) obj;
        long j = bsVar.a;
        int i2 = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, bsVar.b) && tk8.a(this.c, bsVar.c) && tk8.a(this.d, bsVar.d) && tk8.a(this.e, bsVar.e) && tk8.a(this.f, bsVar.f) && tk8.a(this.g, bsVar.g) && tk8.a(this.h, bsVar.h);
    }

    public final int hashCode() {
        int i2 = dw0.h;
        return Long.hashCode(this.h) + p61.g(p61.g(p61.g(p61.g(p61.g(p61.g(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
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
        StringBuilder sbT = oi0.t("AppToggleColors(thumbChecked=", strH, ", trackChecked=", strH2, ", thumbUnchecked=");
        oi0.y(sbT, strH3, ", trackUnchecked=", strH4, ", thumbCheckedDisabled=");
        oi0.y(sbT, strH5, ", trackCheckedDisabled=", strH6, ", thumbUncheckedDisabled=");
        return oi0.q(sbT, strH7, ", trackUncheckedDisabled=", strH8, ")");
    }
}
