package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qr {
    public static final qr d;
    public static final qr e;
    public final long a;
    public final long b;
    public final long c;

    static {
        long j = ep.c;
        long j2 = dw0.c;
        long j3 = ep.o;
        d = new qr(j, j2, j3);
        e = new qr(j, dw0.b, j3);
    }

    public qr(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr)) {
            return false;
        }
        qr qrVar = (qr) obj;
        long j = qrVar.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, qrVar.b) && tk8.a(this.c, qrVar.c);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.c) + p61.g(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        String strH = dw0.h(this.a);
        String strH2 = dw0.h(this.b);
        return oi0.p(oi0.t("AppProgressIndicatorColors(indicatorPrimary=", strH, ", indicatorSecondary=", strH2, ", track="), dw0.h(this.c), ")");
    }
}
