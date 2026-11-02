package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ka8 implements qx0 {
    public final long X;

    public /* synthetic */ ka8(long j) {
        this.X = j;
    }

    public static long b(long j) {
        return (1 | (j - 1)) == Long.MAX_VALUE ? gx1.k(z68.U(j)) : z68.D0(yx4.a(), j);
    }

    public static final long c(long j, long j2) {
        int i = yx4.Y;
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? z68.U(j) : z68.D0(j, j2);
        }
        if (j != j2) {
            return gx1.k(z68.U(j2));
        }
        be beVar = gx1.Y;
        return 0L;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(qx0 qx0Var) {
        qx0Var.getClass();
        boolean z = qx0Var instanceof ka8;
        long j = this.X;
        if (z) {
            return gx1.c(c(j, ((ka8) qx0Var).X), 0L);
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + qx0Var);
    }

    public final ka8 d(long j) {
        int i = yx4.Y;
        return new ka8(z68.C0(this.X, j));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ka8) {
            return this.X == ((ka8) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.X);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.X + ')';
    }
}
