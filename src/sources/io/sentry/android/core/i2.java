package io.sentry.android.core;

import io.sentry.ILogger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.g {
    public final long f0;
    public final boolean g0;

    public i2(long j, ILogger iLogger, long j2, boolean z) {
        super(j, iLogger);
        this.f0 = j2;
        this.g0 = z;
    }

    @Override // io.sentry.hints.b
    public final boolean a() {
        return this.g0;
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.w wVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.w wVar) {
    }
}
