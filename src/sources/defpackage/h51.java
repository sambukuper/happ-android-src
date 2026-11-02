package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h51 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public h51(long j, long j2, long j3, long j4, long j5) {
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
        if (obj == null || !(obj instanceof h51)) {
            return false;
        }
        h51 h51Var = (h51) obj;
        long j = h51Var.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, h51Var.b) && tk8.a(this.c, h51Var.c) && tk8.a(this.d, h51Var.d) && tk8.a(this.e, h51Var.e);
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
        StringBuilder sbT = oi0.t("ContextMenuColors(backgroundColor=", strH, ", textColor=", strH2, ", iconColor=");
        oi0.y(sbT, strH3, ", disabledTextColor=", strH4, ", disabledIconColor=");
        return oi0.p(sbT, strH5, ")");
    }
}
