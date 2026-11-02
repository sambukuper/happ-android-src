package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pv6 implements a94, AutoCloseable {
    public final String X;
    public final ov6 Y;
    public boolean Z;

    public pv6(String str, ov6 ov6Var) {
        this.X = str;
        this.Y = ov6Var;
    }

    public final void g(xd6 xd6Var, g94 g94Var) {
        xd6Var.getClass();
        g94Var.getClass();
        if (this.Z) {
            bt.i("Already attached to lifecycleOwner");
            return;
        }
        this.Z = true;
        g94Var.a(this);
        xd6Var.D(this.X, (hy0) this.Y.b.h0);
    }

    @Override // defpackage.a94
    public final void k(d94 d94Var, n84 n84Var) {
        if (n84Var == n84.ON_DESTROY) {
            this.Z = false;
            d94Var.getH0().f(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
