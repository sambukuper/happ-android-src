package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xe0 implements kq8 {
    public final ye0 a;
    public final pr8 b;
    public final lx0 c;
    public qq8 d;

    public xe0(ye0 ye0Var, pr8 pr8Var, lx0 lx0Var) {
        this.a = ye0Var;
        this.b = pr8Var;
        this.c = lx0Var;
    }

    @Override // defpackage.kq8
    public final void b(qq8 qq8Var) {
        this.d = qq8Var;
        if (qq8Var != null) {
            lx0 lx0Var = this.c;
            ye0 ye0Var = this.a;
            lx0Var.b(ye0Var);
            lx0Var.a(ye0Var, this.b.e);
            ye0Var.a(qq8Var, false);
        }
    }

    @Override // defpackage.kq8
    public final void reset() {
        ye0 ye0Var = this.a;
        synchronized (ye0Var.Y) {
            try {
                ux0 ux0Var = ye0Var.f0;
                if (ux0Var != null) {
                    ye0Var.f0 = null;
                    ux0Var.l0(new nh0("The camera control has became inactive."));
                }
                ux0 ux0Var2 = ye0Var.g0;
                if (ux0Var2 != null) {
                    ye0Var.g0 = null;
                    ux0Var2.l0(new nh0("The camera control has became inactive."));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.b(this.a);
    }
}
