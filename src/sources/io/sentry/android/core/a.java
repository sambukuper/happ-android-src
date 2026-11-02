package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import defpackage.fl6;
import defpackage.ie2;
import defpackage.jn0;
import defpackage.kp5;
import io.sentry.ILogger;
import io.sentry.j5;
import io.sentry.s5;
import io.sentry.v4;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {
    public final boolean X;
    public final jn0 Y;
    public final n0 Z;
    public final io.sentry.c2 f0;
    public final short g0;
    public final long h0;
    public final ILogger i0;
    public volatile long j0;
    public final AtomicBoolean k0;
    public final Context l0;
    public final fl6 m0;

    public a(long j, boolean z, jn0 jn0Var, ILogger iLogger, Context context) {
        io.sentry.c2 c2Var = new io.sentry.c2((byte) 10);
        n0 n0Var = new n0();
        super("|ANR-WatchDog|");
        this.j0 = 0L;
        this.k0 = new AtomicBoolean(false);
        this.f0 = c2Var;
        this.h0 = j;
        this.g0 = (short) 500;
        this.X = z;
        this.Y = jn0Var;
        this.i0 = iLogger;
        this.Z = n0Var;
        this.l0 = context;
        this.m0 = new fl6(this, c2Var);
        if (j >= 1000) {
            return;
        }
        kp5.n("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", new Object[]{1000L});
        throw null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.m0.run();
        while (!isInterrupted()) {
            ((Handler) this.Z.a).post(this.m0);
            try {
                Thread.sleep(this.g0);
                this.f0.getClass();
                if (SystemClock.uptimeMillis() - this.j0 > this.h0) {
                    if (this.X || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.l0.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th) {
                                this.i0.e(s5.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
                                processesInErrorState = null;
                            }
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (it.next().condition == 2) {
                                        }
                                    }
                                }
                            }
                        }
                        if (this.k0.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(ie2.g(this.h0, " ms.", new StringBuilder("Application Not Responding for at least ")), ((Handler) this.Z.a).getLooper().getThread());
                            jn0 jn0Var = this.Y;
                            Object obj = jn0Var.Y;
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) jn0Var.Z;
                            a aVar = AnrIntegration.g0;
                            sentryAndroidOptions.getLogger().h(s5.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(g0.g0.f0);
                            String strConcat = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strConcat = "Background ".concat(strConcat);
                            }
                            Thread thread = applicationNotResponding.X;
                            ApplicationNotResponding applicationNotResponding2 = thread == null ? new ApplicationNotResponding(strConcat) : new ApplicationNotResponding(strConcat, thread);
                            io.sentry.protocol.o oVar = new io.sentry.protocol.o();
                            oVar.X = "ANR";
                            j5 j5Var = new j5(new io.sentry.exception.a(oVar, applicationNotResponding2, thread, true));
                            j5Var.w0 = s5.ERROR;
                            v4.b().z(j5Var, io.sentry.util.b.f(new y(zEquals)));
                        }
                    } else {
                        this.i0.h(s5.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.k0.set(true);
                    }
                }
            } catch (InterruptedException e) {
                try {
                    Thread.currentThread().interrupt();
                    this.i0.h(s5.WARNING, "Interrupted: %s", e.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.i0.h(s5.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
                    return;
                }
            }
        }
    }
}
