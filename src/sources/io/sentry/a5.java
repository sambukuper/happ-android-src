package io.sentry;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a5 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a5 a5Var) {
        return Long.compare(d(), a5Var.d());
    }

    public long b(a5 a5Var) {
        return d() - a5Var.d();
    }

    public long c(a5 a5Var) {
        return (a5Var == null || compareTo(a5Var) >= 0) ? d() : a5Var.d();
    }

    public abstract long d();
}
