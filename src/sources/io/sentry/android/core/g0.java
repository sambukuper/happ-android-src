package io.sentry.android.core;

import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;
import defpackage.fl6;
import defpackage.sc4;
import io.sentry.ILogger;
import io.sentry.a3;
import io.sentry.s5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Closeable {
    public static final g0 g0 = new g0();
    public volatile f0 Y;
    public final io.sentry.util.a X = new io.sentry.util.a();
    public final n0 Z = new n0();
    public volatile Boolean f0 = null;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u();
    }

    public final void g(d0 d0Var) {
        io.sentry.util.a aVar = this.X;
        aVar.g();
        try {
            m(a3.X);
            if (this.Y != null) {
                this.Y.X.add(d0Var);
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

    public final void k(ILogger iLogger) {
        f0 f0Var = this.Y;
        if (f0Var != null) {
            try {
                ProcessLifecycleOwner.k0.h0.a(f0Var);
            } catch (Throwable th) {
                this.Y = null;
                iLogger.e(s5.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th);
            }
        }
    }

    public final void m(ILogger iLogger) {
        if (this.Y != null) {
            return;
        }
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.k0;
            this.Y = new f0(this);
            if (io.sentry.android.core.internal.util.f.a.c()) {
                k(iLogger);
                return;
            }
            n0 n0Var = this.Z;
            ((Handler) n0Var.a).post(new sc4((Object) this, (Object) iLogger, (byte) 26));
        } catch (ClassNotFoundException unused) {
            iLogger.h(s5.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th) {
            iLogger.e(s5.ERROR, "AppState could not register lifecycle observer", th);
        }
    }

    public final void p(d0 d0Var) {
        io.sentry.util.a aVar = this.X;
        aVar.g();
        try {
            if (this.Y != null) {
                this.Y.X.remove(d0Var);
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

    public final void u() {
        if (this.Y == null) {
            return;
        }
        io.sentry.util.a aVar = this.X;
        aVar.g();
        try {
            f0 f0Var = this.Y;
            this.Y.X.clear();
            this.Y = null;
            aVar.close();
            if (io.sentry.android.core.internal.util.f.a.c()) {
                if (f0Var != null) {
                    ProcessLifecycleOwner.k0.h0.f(f0Var);
                }
            } else {
                n0 n0Var = this.Z;
                ((Handler) n0Var.a).post(new fl6(this, f0Var));
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
}
