package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rr {
    public static final rr c = new rr(ep.c, ep.d);
    public final long a;
    public final long b;

    public rr(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr)) {
            return false;
        }
        rr rrVar = (rr) obj;
        long j = rrVar.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, rrVar.b);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pc6.q("AppRadioButtonColors(enabled=", dw0.h(this.a), ", disabled=", dw0.h(this.b), ")");
    }
}
