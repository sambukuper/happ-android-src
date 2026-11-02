package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u84 implements a94, b71 {
    public final g94 X;
    public final s61 Y;

    public u84(g94 g94Var, s61 s61Var) {
        g94Var.getClass();
        s61Var.getClass();
        this.X = g94Var;
        this.Y = s61Var;
        if (g94Var.i == o84.X) {
            u70.x(s61Var, null);
        }
    }

    @Override // defpackage.b71
    public final s61 getCoroutineContext() {
        return this.Y;
    }

    @Override // defpackage.a94
    public final void k(d94 d94Var, n84 n84Var) {
        g94 g94Var = this.X;
        if (g94Var.i.compareTo(o84.X) <= 0) {
            g94Var.f(this);
            u70.x(this.Y, null);
        }
    }
}
