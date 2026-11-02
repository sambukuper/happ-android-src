package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sm7 extends oh1 implements kq5, vg2, qh2 {
    public dn2 s0;
    public boolean t0;
    public final cz7 u0;

    public sm7(dn2 dn2Var) {
        this.s0 = dn2Var;
        sd sdVar = new sd(this, (byte) 3);
        aq5 aq5Var = yy7.a;
        cz7 cz7Var = new cz7(null, null, sdVar);
        Y0(cz7Var);
        this.u0 = cz7Var;
    }

    @Override // defpackage.vg2
    public final void H(yh2 yh2Var) {
        this.t0 = yh2Var.b();
    }

    @Override // defpackage.kq5
    public final void I() {
        this.u0.I();
    }

    @Override // defpackage.kq5
    public final long p() {
        ot1 ot1Var = z68.j;
        fi1 fi1Var = yn0.Z(this).A0;
        ot1Var.getClass();
        int i = vc8.b;
        return z38.c(fi1Var.x0(10.0f), fi1Var.x0(40.0f), fi1Var.x0(10.0f), fi1Var.x0(40.0f));
    }

    @Override // defpackage.kq5
    public final void z(aq5 aq5Var, bq5 bq5Var, long j) {
        this.u0.z(aq5Var, bq5Var, j);
    }
}
