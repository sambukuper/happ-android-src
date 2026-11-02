package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ap {
    public static final ap b = new ap(ep.e);
    public static final ap c = new ap(ep.h);
    public final long a;

    public ap(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        long j = ((ap) obj).a;
        int i = dw0.h;
        return tk8.a(this.a, j);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return pc6.p("AppBorderColors(primary=", dw0.h(this.a), ")");
    }
}
