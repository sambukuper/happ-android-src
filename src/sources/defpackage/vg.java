package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vg implements Application.ActivityLifecycleCallbacks {
    public final double X;
    public final /* synthetic */ wg Y;

    public vg(wg wgVar, v76 v76Var) {
        this.Y = wgVar;
        s76 s76Var = v76Var.a;
        f4 f4Var = h63.a;
        Object obj = s76Var.b.n.a.get(h63.d);
        this.X = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        double d = this.X;
        if (d == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        wg wgVar = this.Y;
        v76 v76Var = (v76) ((WeakReference) wgVar.b).get();
        if (v76Var == null) {
            wgVar.z();
            return;
        }
        a86 a86VarC = v76Var.c();
        if (a86VarC != null) {
            synchronized (a86VarC.c) {
                j = a86VarC.a.X;
            }
            a86VarC.a((long) (d * j));
        }
    }

    public final void b(Context context) {
        long j;
        if (this.X == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        wg wgVar = this.Y;
        v76 v76Var = (v76) ((WeakReference) wgVar.b).get();
        if (v76Var == null) {
            wgVar.z();
            return;
        }
        a86 a86VarC = v76Var.c();
        if (a86VarC != null) {
            synchronized (a86VarC.c) {
                j = a86VarC.a.X;
            }
            a86VarC.a(j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
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
