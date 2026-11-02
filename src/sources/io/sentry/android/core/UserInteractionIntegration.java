package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import defpackage.d94;
import defpackage.o84;
import io.sentry.ILogger;
import io.sentry.j7;
import io.sentry.p4;
import io.sentry.s5;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class UserInteractionIntegration implements io.sentry.y1, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application X;
    public io.sentry.i1 Y;
    public final WeakHashMap g0 = new WeakHashMap();
    public final Object h0 = new Object();
    public SentryAndroidOptions Z;
    public final boolean f0 = io.sentry.util.h.b(this.Z, "androidx.lifecycle.Lifecycle");

    public UserInteractionIntegration(Application application) {
        this.X = application;
    }

    @Override // io.sentry.y1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.Z = sentryAndroidOptions;
        this.Y = p4.a;
        boolean z = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.Z.isEnableUserInteractionTracing();
        ILogger logger = this.Z.getLogger();
        s5 s5Var = s5.DEBUG;
        logger.h(s5Var, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
        if (z) {
            this.X.registerActivityLifecycleCallbacks(this);
            this.Z.getLogger().h(s5Var, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.util.b.a("UserInteraction");
            if (this.f0) {
                WeakReference weakReference = (WeakReference) n0.b.a;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if ((activity instanceof d94) && ((d94) activity).getH0().i == o84.g0) {
                    g(activity);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList<Window> arrayList;
        this.X.unregisterActivityLifecycleCallbacks(this);
        synchronized (this.h0) {
            arrayList = new ArrayList(this.g0.keySet());
        }
        for (Window window : arrayList) {
            if (window != null) {
                k(window);
            }
        }
        synchronized (this.h0) {
            this.g0.clear();
        }
        SentryAndroidOptions sentryAndroidOptions = this.Z;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    public final void g(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.Z;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(s5.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.Y == null || this.Z == null) {
            return;
        }
        synchronized (this.h0) {
            try {
                WeakReference weakReference = (WeakReference) this.g0.get(window);
                if (weakReference == null || weakReference.get() == null) {
                    Window.Callback callback = window.getCallback();
                    if (callback == null) {
                        callback = new io.sentry.android.core.internal.gestures.b();
                    }
                    io.sentry.android.core.internal.gestures.h hVar = new io.sentry.android.core.internal.gestures.h(callback, activity, new io.sentry.android.core.internal.gestures.g(activity, this.Y, this.Z), this.Z);
                    window.setCallback(hVar);
                    synchronized (this.h0) {
                        this.g0.put(window, new WeakReference(hVar));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(Window window) {
        io.sentry.android.core.internal.gestures.h hVar;
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            io.sentry.android.core.internal.gestures.h hVar2 = (io.sentry.android.core.internal.gestures.h) callback;
            hVar2.h0 = true;
            hVar2.Z.d(j7.CANCELLED);
            hVar2.f0.a();
            Window.Callback callback2 = hVar2.Y;
            if (callback2 instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
            synchronized (this.h0) {
                this.g0.remove(window);
            }
            return;
        }
        synchronized (this.h0) {
            try {
                WeakReference weakReference = (WeakReference) this.g0.remove(window);
                hVar = weakReference != null ? (io.sentry.android.core.internal.gestures.h) weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hVar != null) {
            hVar.h0 = true;
            hVar.Z.d(j7.CANCELLED);
            hVar.f0.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            k(window);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.Z;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(s5.INFO, "Window was null in stopTracking", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        g(activity);
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
