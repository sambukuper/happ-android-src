package io.sentry.android.core.internal.util;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Comparable {
    public final long X;
    public final long Y;

    public r(long j, long j2) {
        this.X = j;
        this.Y = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        int iCompare = Long.compare(this.Y, rVar.Y);
        return iCompare != 0 ? iCompare : Long.compare(this.X, rVar.X);
    }
}
