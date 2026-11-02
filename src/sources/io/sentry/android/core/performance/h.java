package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.x5;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {
    public String X;
    public long Y;
    public long Z;
    public long f0;

    public final long a() {
        if (d()) {
            return this.f0 - this.Z;
        }
        return 0L;
    }

    public final x5 b() {
        if (c()) {
            return new x5(this.Y * 1000000);
        }
        return null;
    }

    public final boolean c() {
        return this.Z != 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.Y, ((h) obj).Y);
    }

    public final boolean d() {
        return this.f0 != 0;
    }

    public final void e(long j) {
        this.Z = j;
        this.Y = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.Z);
    }
}
