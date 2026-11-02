package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.d94;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements DefaultLifecycleObserver {
    public final e0 X = new e0(this, (byte) 0);
    public final /* synthetic */ g0 Y;

    public f0(g0 g0Var) {
        this.Y = g0Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(d94 d94Var) {
        this.Y.f0 = Boolean.FALSE;
        Iterator it = this.X.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).g();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(d94 d94Var) {
        this.Y.f0 = Boolean.TRUE;
        Iterator it = this.X.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).k();
        }
    }
}
