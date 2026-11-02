package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v88 {
    public static final w88[] b = {new w88(0), new w88(4294967296L), new w88(8589934592L)};
    public static final long c = eu7.i(Float.NaN, 0);
    public final long a;

    public /* synthetic */ v88(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean d(long j) {
        return (j & 1095216660480L) == 8589934592L;
    }

    public static String e(long j) {
        long jB = b(j);
        if (w88.a(jB, 0L)) {
            return "Unspecified";
        }
        if (w88.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!w88.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v88) {
            return this.a == ((v88) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
