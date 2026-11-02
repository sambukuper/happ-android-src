package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a86 {
    public final gj4 a;
    public final b8 b;
    public final Object c = new Object();

    public a86(gj4 gj4Var, b8 b8Var) {
        this.a = gj4Var;
        this.b = b8Var;
    }

    public final void a(long j) {
        synchronized (this.c) {
            e86 e86Var = (e86) this.a.Z;
            e86Var.X = j;
            e86Var.h(j);
        }
    }
}
