package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class db7 implements AutoCloseable {
    public final o02 X;
    public final Object Y;
    public final k42 Z = new k42();

    public db7(o02 o02Var, long j) {
        this.X = o02Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        g();
    }

    public void g() {
    }
}
