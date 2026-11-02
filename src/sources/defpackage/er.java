package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class er {
    public static final er c;
    public static final er d;
    public final long a;
    public final long b;

    static {
        long j = dw0.c;
        c = new er(j, ep.b);
        d = new er(ep.j, j);
    }

    public er(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er)) {
            return false;
        }
        er erVar = (er) obj;
        long j = erVar.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, erVar.b);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pc6.q("AppDialogColors(title=", dw0.h(this.a), ", background=", dw0.h(this.b), ")");
    }
}
