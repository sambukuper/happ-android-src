package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.ILogger;
import io.sentry.p4;
import io.sentry.s5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityBreadcrumbsIntegration implements io.sentry.y1, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application X;
    public io.sentry.i1 Y;
    public boolean Z;
    public final io.sentry.util.a f0 = new io.sentry.util.a();

    public ActivityBreadcrumbsIntegration(Application application) {
        this.X = application;
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.Y = p4.a;
        this.Z = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = sentryAndroidOptions.getLogger();
        s5 s5Var = s5.DEBUG;
        logger.h(s5Var, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.Z));
        if (this.Z) {
            this.X.registerActivityLifecycleCallbacks(this);
            sentryAndroidOptions.getLogger().h(s5Var, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.util.b.a("ActivityBreadcrumbs");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.Z) {
            this.X.unregisterActivityLifecycleCallbacks(this);
            io.sentry.i1 i1Var = this.Y;
            if (i1Var != null) {
                i1Var.i().getLogger().h(s5.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    public final void g(Activity activity, String str) {
        if (this.Y == null) {
            return;
        }
        io.sentry.g gVar = new io.sentry.g();
        gVar.g0 = "navigation";
        gVar.d(str, "state");
        gVar.d(activity.getClass().getSimpleName(), "screen");
        gVar.i0 = "ui.lifecycle";
        gVar.k0 = s5.INFO;
        io.sentry.n0 n0Var = new io.sentry.n0();
        n0Var.d(activity, "android:activity");
        this.Y.a(gVar, n0Var);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        try {
            g(activity, "created");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        try {
            g(activity, "destroyed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        try {
            g(activity, "paused");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        try {
            g(activity, "resumed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        try {
            g(activity, "saveInstanceState");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        try {
            g(activity, "started");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        io.sentry.util.a aVar = this.f0;
        aVar.g();
        try {
            g(activity, "stopped");
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
