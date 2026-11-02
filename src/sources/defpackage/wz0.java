package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wz0 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ xz0 X;

    public wz0(xz0 xz0Var) {
        this.X = xz0Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.X.f(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        xz0 xz0Var = this.X;
        xz0Var.g.a.clear();
        pf6 pf6Var = xz0Var.h;
        synchronized (pf6Var) {
            pf6Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        xz0 xz0Var = this.X;
        xz0Var.g.a.clear();
        pf6 pf6Var = xz0Var.h;
        synchronized (pf6Var) {
            pf6Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.X.t.c.setValue(Boolean.valueOf(z));
    }
}
