package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import defpackage.j78;
import defpackage.sc4;
import io.sentry.a3;
import io.sentry.m5;
import io.sentry.s5;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class FeedbackShakeIntegration implements io.sentry.y1, Closeable, Application.ActivityLifecycleCallbacks, m5 {
    public final Application X;
    public SentryAndroidOptions Z;
    public volatile WeakReference g0;
    public volatile boolean f0 = false;
    public final CopyOnWriteArrayList h0 = new CopyOnWriteArrayList();
    public final y1 Y = new y1(a3.X);

    public FeedbackShakeIntegration(Application application) {
        this.X = application;
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.Z = sentryAndroidOptions;
        sentryAndroidOptions.getFeedbackOptions().i = this;
        if (sentryAndroidOptions.getFeedbackOptions().g) {
            synchronized (this) {
                SentryAndroidOptions sentryAndroidOptions2 = this.Z;
                if (!this.f0 && sentryAndroidOptions2 != null) {
                    this.f0 = true;
                    y1 y1Var = this.Y;
                    synchronized (y1Var) {
                        y1Var.g = false;
                    }
                    try {
                        sentryAndroidOptions2.getExecutorService().submit(new sc4((Object) this, (Object) sentryAndroidOptions2, (byte) 27));
                    } catch (Throwable th) {
                        sentryAndroidOptions2.getLogger().e(s5.WARNING, "Failed to submit shake detector initialization.", th);
                    }
                    io.sentry.util.b.a("FeedbackShake");
                    this.X.registerActivityLifecycleCallbacks(this);
                    sentryAndroidOptions2.getLogger().h(s5.DEBUG, "FeedbackShakeIntegration installed.", new Object[0]);
                    WeakReference weakReference = (WeakReference) n0.b.a;
                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                    if (activity != null) {
                        this.g0 = new WeakReference(activity);
                        m(activity);
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f0) {
                this.f0 = false;
                this.X.unregisterActivityLifecycleCallbacks(this);
                this.Y.a();
                this.g0 = null;
            }
        }
        this.h0.clear();
    }

    public final boolean g(Activity activity) {
        for (v0 v0Var : this.h0) {
            if (v0Var.b.get() != null && v0Var.a.get() == activity) {
                return true;
            }
        }
        return false;
    }

    public final void k(c2 c2Var) {
        boolean z;
        CopyOnWriteArrayList copyOnWriteArrayList = this.h0;
        Iterator it = copyOnWriteArrayList.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                v0 v0Var = (v0) it.next();
                Dialog dialog = (Dialog) v0Var.b.get();
                if (dialog == c2Var) {
                    if (copyOnWriteArrayList.remove(v0Var) || z) {
                        z = true;
                    }
                } else if (dialog == null) {
                    copyOnWriteArrayList.remove(v0Var);
                }
            }
        }
        if (z) {
            WeakReference weakReference = this.g0;
            Activity activity = weakReference == null ? null : (Activity) weakReference.get();
            if (!this.f0 || activity == null) {
                return;
            }
            m(activity);
        }
    }

    public final void m(Activity activity) {
        if (this.Z == null) {
            return;
        }
        y1 y1Var = this.Y;
        y1Var.d();
        if (g(activity)) {
            return;
        }
        y1Var.c(activity, new j78(this, (byte) 13));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        WeakReference weakReference = this.g0;
        if (activity == (weakReference != null ? (Activity) weakReference.get() : null)) {
            this.Y.d();
            this.g0 = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.g0 = new WeakReference(activity);
        m(activity);
    }

    @Override // io.sentry.m5
    public final boolean p() {
        return this.f0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
