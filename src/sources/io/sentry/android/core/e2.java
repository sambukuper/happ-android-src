package io.sentry.android.core;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements Comparable {
    public final long X;
    public final long Y;
    public final long Z;
    public final long f0;
    public final boolean g0;
    public final boolean h0;
    public final long i0;

    public e2(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5) {
        this.X = j;
        this.Y = j2;
        this.Z = j3;
        this.f0 = j4;
        this.g0 = z;
        this.h0 = z2;
        this.i0 = j5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.Y, ((e2) obj).Y);
    }

    public e2(long j) {
        this(j, j, 0L, 0L, false, false, 0L);
    }
}
