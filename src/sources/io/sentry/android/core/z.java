package io.sentry.android.core;

import io.sentry.ILogger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.a {
    public final long f0;
    public final boolean g0;
    public final boolean h0;

    public z(long j, ILogger iLogger, long j2, boolean z, boolean z2) {
        super(j, iLogger);
        this.f0 = j2;
        this.g0 = z;
        this.h0 = z2;
    }

    @Override // io.sentry.hints.b
    public final boolean a() {
        return this.g0;
    }

    @Override // io.sentry.hints.a
    public final Long b() {
        return Long.valueOf(this.f0);
    }

    @Override // io.sentry.hints.a
    public final boolean c() {
        return false;
    }

    @Override // io.sentry.hints.a
    public final String e() {
        return this.h0 ? "anr_background" : "anr_foreground";
    }
}
