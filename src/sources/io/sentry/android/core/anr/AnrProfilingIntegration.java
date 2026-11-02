package io.sentry.android.core.anr;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.fl6;
import io.sentry.ILogger;
import io.sentry.a3;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.d0;
import io.sentry.android.core.g0;
import io.sentry.s5;
import io.sentry.util.o;
import io.sentry.y1;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class AnrProfilingIntegration implements y1, Closeable, d0, Runnable {
    public volatile d j0;
    public volatile SentryAndroidOptions l0;
    public volatile Handler p0;
    public volatile Thread q0;
    public final AtomicBoolean X = new AtomicBoolean(true);
    public final fl6 Y = new fl6(this, (byte) 29);
    public final io.sentry.util.a Z = new io.sentry.util.a();
    public final io.sentry.util.a f0 = new io.sentry.util.a();
    public volatile long g0 = SystemClock.uptimeMillis();
    public final AtomicInteger h0 = new AtomicInteger();
    public volatile a i0 = a.IDLE;
    public volatile ILogger k0 = a3.X;
    public volatile Thread m0 = null;
    public volatile boolean n0 = false;
    public volatile boolean o0 = false;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public enum a {
        IDLE,
        SUSPICIOUS,
        ANR_DETECTED
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.l0 = sentryAndroidOptions;
        this.k0 = sentryAndroidOptions.getLogger();
        if (this.l0.isAnrProfilingEnabled()) {
            if (this.l0.getCacheDirPath() == null) {
                this.k0.h(s5.WARNING, "ANR Profiling is enabled but cacheDirPath is not set", new Object[0]);
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            this.q0 = mainLooper.getThread();
            this.p0 = new Handler(mainLooper);
            io.sentry.util.b.a("AnrProfiling");
            g0.g0.g(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.X.set(false);
        g0.g0.p(this);
        Handler handler = this.p0;
        if (handler != null) {
            handler.removeCallbacks(this.Y);
        }
        Thread thread = this.m0;
        if (thread != null) {
            synchronized (this) {
                notifyAll();
            }
            thread.interrupt();
        }
        SentryAndroidOptions sentryAndroidOptions = this.l0;
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        try {
            d dVar = this.j0;
            this.j0 = null;
            aVar.close();
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new f(this, dVar, (byte) 0));
                } catch (Throwable unused) {
                    this.k0.h(s5.WARNING, "Failed to submit AnrProfileManager close", new Object[0]);
                }
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.d0
    public final void g() {
        if (this.X.get()) {
            io.sentry.util.a aVar = this.Z;
            aVar.g();
            try {
                if (this.o0) {
                    aVar.close();
                    return;
                }
                this.o0 = true;
                this.Y.run();
                Thread thread = this.m0;
                if (thread != null && thread.isAlive()) {
                    synchronized (this) {
                        notifyAll();
                    }
                }
                if (thread == null || !thread.isAlive()) {
                    Thread thread2 = new Thread(this, "AnrProfilingIntegration");
                    thread2.setDaemon(true);
                    thread2.start();
                    this.m0 = thread2;
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // io.sentry.android.core.d0
    public final void k() {
        if (this.X.get()) {
            io.sentry.util.a aVar = this.Z;
            aVar.g();
            try {
                this.o0 = false;
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final void m(Thread thread) {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.g0;
        if (jUptimeMillis < 1000) {
            this.i0 = a.IDLE;
            this.n0 = false;
        }
        if (this.i0 == a.IDLE && jUptimeMillis > 1000) {
            ILogger iLogger = this.k0;
            s5 s5Var = s5.DEBUG;
            if (iLogger.i(s5Var)) {
                this.k0.h(s5Var, "ANR: main thread is suspicious", new Object[0]);
            }
            this.i0 = a.SUSPICIOUS;
            SentryAndroidOptions sentryAndroidOptions = this.l0;
            Double anrProfilingSampleRate = sentryAndroidOptions != null ? sentryAndroidOptions.getAnrProfilingSampleRate() : null;
            if (anrProfilingSampleRate != null && o.a().c() < anrProfilingSampleRate.doubleValue()) {
                this.n0 = true;
            }
            if (this.n0) {
                this.h0.set(0);
                p().X.clear();
            }
        }
        if (this.n0 && (this.i0 == a.SUSPICIOUS || this.i0 == a.ANR_DETECTED)) {
            if (this.h0.get() < 151) {
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                g gVar = new g(System.currentTimeMillis(), thread.getStackTrace());
                long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis2;
                ILogger iLogger2 = this.k0;
                s5 s5Var2 = s5.DEBUG;
                if (iLogger2.i(s5Var2)) {
                    this.k0.h(s5Var2, "AnrWatchdog: capturing main thread stacktrace took " + jUptimeMillis3 + "ms", new Object[0]);
                }
                if (this.X.get()) {
                    this.h0.incrementAndGet();
                    p().X.R(gVar);
                }
            } else {
                ILogger iLogger3 = this.k0;
                s5 s5Var3 = s5.DEBUG;
                if (iLogger3.i(s5Var3)) {
                    this.k0.h(s5Var3, "ANR: reached maximum number of collected stack traces, skipping further collection", new Object[0]);
                }
            }
        }
        if (this.i0 != a.SUSPICIOUS || jUptimeMillis <= 4000) {
            return;
        }
        ILogger iLogger4 = this.k0;
        s5 s5Var4 = s5.DEBUG;
        if (iLogger4.i(s5Var4)) {
            this.k0.h(s5Var4, "ANR: main thread ANR threshold reached", new Object[0]);
        }
        this.i0 = a.ANR_DETECTED;
    }

    public final d p() {
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        try {
            if (this.j0 == null) {
                SentryAndroidOptions sentryAndroidOptions = this.l0;
                io.sentry.util.b.s(sentryAndroidOptions, "Options can't be null");
                String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
                if (cacheDirPath == null) {
                    throw new IllegalStateException("cacheDirPath is required for ANR profiling");
                }
                File file = new File(cacheDirPath);
                e.b(file);
                this.j0 = new d(sentryAndroidOptions, new File(file, "anr_profile"));
            }
            d dVar = this.j0;
            aVar.close();
            return dVar;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = this.p0;
        Thread thread = this.q0;
        if (handler == null || thread == null) {
            return;
        }
        while (this.X.get() && !Thread.currentThread().isInterrupted()) {
            try {
                try {
                    if (this.o0) {
                        m(thread);
                        handler.removeCallbacks(this.Y);
                        handler.post(this.Y);
                        Thread.sleep(66L);
                    } else {
                        synchronized (this) {
                            while (!this.o0 && this.X.get()) {
                                try {
                                    wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        this.Y.run();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (Throwable th2) {
                this.k0.e(s5.WARNING, "Failed to execute AnrStacktraceIntegration", th2);
                return;
            }
        }
    }
}
