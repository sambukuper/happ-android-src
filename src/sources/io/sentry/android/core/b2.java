package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.jn0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements Application.ActivityLifecycleCallbacks {
    public final WeakReference X;
    public final /* synthetic */ c2 Y;

    public b2(c2 c2Var, WeakReference weakReference) {
        this.Y = c2Var;
        this.X = weakReference;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.X.get()) {
            c2 c2Var = this.Y;
            y1 y1Var = c2Var.g0;
            if (y1Var != null) {
                y1Var.a();
                c2Var.g0 = null;
            }
            if (c2Var.h0 != null) {
                Activity activityA = c2.a(c2Var.getContext());
                if (activityA != null) {
                    activityA.getApplication().unregisterActivityLifecycleCallbacks(c2Var.h0);
                }
                c2Var.h0 = null;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        y1 y1Var;
        if (activity != this.X.get() || (y1Var = this.Y.g0) == null) {
            return;
        }
        y1Var.d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c2 c2Var;
        y1 y1Var;
        WeakReference weakReference = this.X;
        if (activity != weakReference.get() || (y1Var = (c2Var = this.Y).g0) == null) {
            return;
        }
        y1Var.c(activity, new jn0(c2Var, weakReference, (byte) 23));
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
