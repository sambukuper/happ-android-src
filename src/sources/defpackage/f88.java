package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f88 {
    public static final long b = ct7.c(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ f88(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final boolean b(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int c(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int d(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean e(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static String f(long j) {
        return pc6.k((int) (j >> 32), "TextRange(", (int) (j & 4294967295L), ", ", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f88) {
            return this.a == ((f88) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return f(this.a);
    }
}
