package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tu0 implements AutoCloseable, b71 {
    public final s61 X;

    public tu0(s61 s61Var) {
        s61Var.getClass();
        this.X = s61Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        u70.x(this.X, null);
    }

    @Override // defpackage.b71
    public final s61 getCoroutineContext() {
        return this.X;
    }
}
