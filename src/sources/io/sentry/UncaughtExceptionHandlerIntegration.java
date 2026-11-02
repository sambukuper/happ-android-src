package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.Closeable;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class UncaughtExceptionHandlerIntegration implements y1, Thread.UncaughtExceptionHandler, Closeable {
    public static final io.sentry.util.a g0 = new io.sentry.util.a();
    public Thread.UncaughtExceptionHandler X;
    public i1 Y;
    public SentryAndroidOptions Z;
    public boolean f0;

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration;
        i1 i1Var;
        if (this.f0) {
            sentryAndroidOptions.getLogger().h(s5.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f0 = true;
        this.Y = p4.a;
        this.Z = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        s5 s5Var = s5.DEBUG;
        logger.h(s5Var, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.Z.isEnableUncaughtExceptionHandler()));
        if (this.Z.isEnableUncaughtExceptionHandler()) {
            io.sentry.util.a aVar = g0;
            aVar.g();
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    this.Z.getLogger().h(s5Var, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                    if ((defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) && (i1Var = (uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).Y) != null && v4.c == i1Var.s()) {
                        this.X = uncaughtExceptionHandlerIntegration.X;
                    } else {
                        this.X = defaultUncaughtExceptionHandler;
                    }
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
                aVar.close();
                this.Z.getLogger().h(s5Var, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                io.sentry.util.b.a("UncaughtExceptionHandler");
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = g0;
        aVar.g();
        try {
            if (this == Thread.getDefaultUncaughtExceptionHandler()) {
                Thread.setDefaultUncaughtExceptionHandler(this.X);
                SentryAndroidOptions sentryAndroidOptions = this.Z;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                g(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());
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

    public final void g(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, HashSet hashSet) {
        if (uncaughtExceptionHandler == null) {
            SentryAndroidOptions sentryAndroidOptions = this.Z;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!hashSet.add(uncaughtExceptionHandler)) {
            SentryAndroidOptions sentryAndroidOptions2 = this.Z;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.getLogger().h(s5.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.X;
            if (this != uncaughtExceptionHandler2) {
                g(uncaughtExceptionHandler2, hashSet);
                return;
            }
            uncaughtExceptionHandlerIntegration.X = this.X;
            SentryAndroidOptions sentryAndroidOptions3 = this.Z;
            if (sentryAndroidOptions3 != null) {
                sentryAndroidOptions3.getLogger().h(s5.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        io.sentry.protocol.w wVar;
        SentryAndroidOptions sentryAndroidOptions = this.Z;
        if (sentryAndroidOptions == null || this.Y == null) {
            return;
        }
        sentryAndroidOptions.getLogger().h(s5.INFO, "Uncaught exception received.", new Object[0]);
        try {
            p7 p7Var = new p7(this.Z.getFlushTimeoutMillis(), this.Z.getLogger());
            io.sentry.protocol.o oVar = new io.sentry.protocol.o();
            oVar.f0 = Boolean.FALSE;
            oVar.X = "UncaughtExceptionHandler";
            j5 j5Var = new j5(new io.sentry.exception.a(oVar, th, thread, false));
            j5Var.w0 = s5.FATAL;
            if (this.Y.j() == null && (wVar = j5Var.X) != null) {
                p7Var.g(wVar);
            }
            n0 n0VarF = io.sentry.util.b.f(p7Var);
            boolean zEquals = this.Y.z(j5Var, n0VarF).equals(io.sentry.protocol.w.Y);
            io.sentry.hints.e eVar = (io.sentry.hints.e) n0VarF.c(io.sentry.hints.e.class, "sentry:eventDropReason");
            if ((!zEquals || io.sentry.hints.e.MULTITHREADED_DEDUPLICATION.equals(eVar)) && !p7Var.d()) {
                this.Z.getLogger().h(s5.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", j5Var.X);
            }
        } catch (Throwable th2) {
            this.Z.getLogger().e(s5.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.X;
        SentryAndroidOptions sentryAndroidOptions2 = this.Z;
        if (uncaughtExceptionHandler != null) {
            sentryAndroidOptions2.getLogger().h(s5.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.X.uncaughtException(thread, th);
        } else if (sentryAndroidOptions2.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }
}
