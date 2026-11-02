package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uo {
    public static final uo c = new uo(ep.a, ep.b);
    public static final uo d = new uo(ep.g, dw0.c);
    public final long a;
    public final long b;

    public uo(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        long j = uoVar.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, uoVar.b);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pc6.q("AppBackgroundColors(primary=", dw0.h(this.a), ", secondary=", dw0.h(this.b), ")");
    }
}
