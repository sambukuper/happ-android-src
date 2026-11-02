package io.sentry;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements j1 {
    public static final ThreadLocal a = new ThreadLocal();

    @Override // io.sentry.j1
    public final n1 a(i1 i1Var) {
        i1 i1Var2 = get();
        a.set(i1Var);
        return new x(i1Var2);
    }

    @Override // io.sentry.j1
    public final void close() {
        a.remove();
    }

    @Override // io.sentry.j1
    public final i1 get() {
        return (i1) a.get();
    }
}
