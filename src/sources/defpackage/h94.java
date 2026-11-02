package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h94 implements re6, DefaultLifecycleObserver {
    public final g94 X;
    public final bm3 Y;

    public h94(g94 g94Var, bm3 bm3Var) {
        this.X = g94Var;
        this.Y = bm3Var;
    }

    @Override // defpackage.re6
    public final Object a(u76 u76Var) {
        return w51.k(this.X, u76Var);
    }

    @Override // defpackage.re6
    public final void c() {
        this.X.f(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(d94 d94Var) {
        this.Y.m(null);
    }

    @Override // defpackage.re6
    public final void start() {
        this.X.a(this);
    }
}
