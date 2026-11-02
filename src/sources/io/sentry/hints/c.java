package io.sentry.hints;

import io.sentry.ILogger;
import io.sentry.protocol.w;
import io.sentry.s5;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements f {
    public final CountDownLatch X = new CountDownLatch(1);
    public final long Y;
    public final ILogger Z;

    public c(long j, ILogger iLogger) {
        this.Y = j;
        this.Z = iLogger;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.X.await(this.Y, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.Z.e(s5.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e);
            return false;
        }
    }

    public boolean f(w wVar) {
        return true;
    }

    public void g(w wVar) {
    }
}
