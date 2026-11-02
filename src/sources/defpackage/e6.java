package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e6 implements Application.ActivityLifecycleCallbacks {
    public Object X;
    public Activity Y;
    public final int Z;
    public boolean f0 = false;
    public boolean g0 = false;
    public boolean h0 = false;

    public e6(Activity activity) {
        this.Y = activity;
        this.Z = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.Y == activity) {
            this.Y = null;
            this.g0 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.g0 || this.h0 || this.f0) {
            return;
        }
        Object obj = this.X;
        try {
            Object obj2 = f6.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.Z) {
                f6.g.postAtFrontOfQueue(new zo2(f6.b.get(activity), obj2, (byte) 4));
                this.h0 = true;
                this.X = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.Y == activity) {
            this.f0 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
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
