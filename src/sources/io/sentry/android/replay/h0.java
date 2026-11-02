package io.sentry.android.replay;

import android.os.Handler;
import defpackage.oi0;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.s5;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Runnable {
    public final SentryAndroidOptions X;
    public final io.sentry.d Y;
    public c0 Z;
    public d0 f0;
    public final AtomicBoolean g0;

    public h0(SentryAndroidOptions sentryAndroidOptions, io.sentry.d dVar) {
        dVar.getClass();
        this.X = sentryAndroidOptions;
        this.Y = dVar;
        this.g0 = new AtomicBoolean(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.g0.get();
        SentryAndroidOptions sentryAndroidOptions = this.X;
        if (!z) {
            if (sentryAndroidOptions.getSessionReplay().m) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                return;
            }
            return;
        }
        try {
            if (sentryAndroidOptions.getSessionReplay().m) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Capturing a frame.", new Object[0]);
            }
            c0 c0Var = this.Z;
            if (c0Var != null) {
                c0Var.b();
            }
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().e(s5.ERROR, "Failed to capture a frame", th);
        }
        if (sentryAndroidOptions.getSessionReplay().m) {
            ILogger logger = sentryAndroidOptions.getLogger();
            s5 s5Var = s5.DEBUG;
            StringBuilder sb = new StringBuilder("Posting the capture runnable again, frame rate is ");
            d0 d0Var = this.f0;
            logger.h(s5Var, oi0.n(sb, d0Var != null ? d0Var.e : 1, " fps."), new Object[0]);
        }
        d0 d0Var2 = this.f0;
        if (((Handler) this.Y.Y).postDelayed(this, 1000 / ((long) (d0Var2 != null ? d0Var2.e : 1)))) {
            return;
        }
        sentryAndroidOptions.getLogger().h(s5.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
    }
}
