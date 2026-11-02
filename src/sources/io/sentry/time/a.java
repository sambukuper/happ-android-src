package io.sentry.time;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final c a;
    public final long b;

    public a(c cVar, long j) {
        this.a = cVar;
        this.b = j;
    }

    public static a a(c cVar, long j, TimeUnit timeUnit) {
        if (j < 0) {
            return new a(cVar, cVar.a());
        }
        return new a(cVar, timeUnit.toNanos(j) + cVar.a());
    }

    public final boolean b() {
        return this.a.a() - this.b >= 0;
    }
}
