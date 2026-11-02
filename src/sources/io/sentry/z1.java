package io.sentry;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements e1 {
    public final Runtime a = Runtime.getRuntime();

    @Override // io.sentry.e1
    public final void a(t3 t3Var) {
        Runtime runtime = this.a;
        t3Var.c = runtime.totalMemory() - runtime.freeMemory();
        t3Var.d = true;
    }

    @Override // io.sentry.e1
    public final void c() {
    }
}
