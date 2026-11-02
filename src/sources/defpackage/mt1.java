package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mt1 {
    public final long a;

    public static String a(long j) {
        return j != 9205357640488583168L ? pc6.q("(", kt1.c(Float.intBitsToFloat((int) (j >> 32))), ", ", kt1.c(Float.intBitsToFloat((int) (j & 4294967295L))), ")") : "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mt1) {
            return this.a == ((mt1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
