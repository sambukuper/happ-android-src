package io.sentry;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a6 extends a5 {
    public final long X;
    public final long Y;

    public a6() {
        this(System.currentTimeMillis(), System.nanoTime());
    }

    @Override // io.sentry.a5, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(a5 a5Var) {
        if (!(a5Var instanceof a6)) {
            return super.compareTo(a5Var);
        }
        a6 a6Var = (a6) a5Var;
        long j = a6Var.X;
        long j2 = this.X;
        return j2 == j ? Long.compare(this.Y, a6Var.Y) : Long.compare(j2, j);
    }

    @Override // io.sentry.a5
    public final long b(a5 a5Var) {
        return a5Var instanceof a6 ? this.Y - ((a6) a5Var).Y : super.b(a5Var);
    }

    @Override // io.sentry.a5
    public final long c(a5 a5Var) {
        if (!(a5Var instanceof a6)) {
            return super.c(a5Var);
        }
        a6 a6Var = (a6) a5Var;
        long j = a6Var.Y;
        int iCompareTo = compareTo(a5Var);
        long j2 = this.Y;
        if (iCompareTo < 0) {
            return d() + (j - j2);
        }
        return a6Var.d() + (j2 - j);
    }

    @Override // io.sentry.a5
    public final long d() {
        return this.X * 1000000;
    }

    public a6(long j, long j2) {
        this.X = j;
        this.Y = j2;
    }
}
