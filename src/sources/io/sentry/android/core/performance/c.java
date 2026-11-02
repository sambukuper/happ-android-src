package io.sentry.android.core.performance;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparable {
    public final h X = new h();
    public final h Y = new h();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int iCompare = Long.compare(this.X.Z, cVar.X.Z);
        return iCompare == 0 ? Long.compare(this.Y.Z, cVar.Y.Z) : iCompare;
    }
}
