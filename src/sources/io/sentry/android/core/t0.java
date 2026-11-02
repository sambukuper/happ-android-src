package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.s5;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements io.sentry.hints.d, io.sentry.hints.h, io.sentry.hints.k, io.sentry.hints.f {
    public final long f0;
    public final ILogger g0;
    public CountDownLatch Z = new CountDownLatch(1);
    public boolean X = false;
    public boolean Y = false;

    public t0(long j, ILogger iLogger) {
        this.f0 = j;
        io.sentry.util.b.s(iLogger, "ILogger is required.");
        this.g0 = iLogger;
    }

    @Override // io.sentry.hints.h
    public final boolean a() {
        return this.X;
    }

    @Override // io.sentry.hints.k
    public final void b(boolean z) {
        this.Y = z;
        this.Z.countDown();
    }

    @Override // io.sentry.hints.h
    public final void c(boolean z) {
        this.X = z;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.Z.await(this.f0, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.g0.e(s5.ERROR, "Exception while awaiting on lock.", e);
            return false;
        }
    }

    @Override // io.sentry.hints.k
    public final boolean e() {
        return this.Y;
    }
}
