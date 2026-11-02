package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z95 {
    public final Runnable a;
    public final vz7 b = new vz7(new tb2(this, 27));

    public z95(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(d94 d94Var, u95 u95Var) {
        u95Var.getClass();
        final g94 h0 = d94Var.getX();
        if (h0.i == o84.X) {
            return;
        }
        t95 t95Var = new t95(u95Var, new v95(d94Var, u95Var));
        u95Var.a.add(t95Var);
        t95Var.g(false);
        z47.k(c().c, t95Var);
        final jf1 jf1Var = new jf1(t95Var, this, h0);
        h0.a(jf1Var);
        u95Var.c.add(new AutoCloseable() { // from class: w95
            @Override // java.lang.AutoCloseable
            public final void close() {
                h0.f(jf1Var);
            }
        });
    }

    public final void b(u95 u95Var) {
        u95Var.getClass();
        t95 t95Var = new t95(u95Var, new v95(null, u95Var));
        u95Var.a.add(t95Var);
        z47.k(c().c, t95Var);
    }

    public final x95 c() {
        return (x95) this.b.getValue();
    }

    public final void d(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        c().c.m(new q95(onBackInvokedDispatcher, 0), 1);
        c().c.m(new q95(onBackInvokedDispatcher, 1000000), 0);
    }
}
