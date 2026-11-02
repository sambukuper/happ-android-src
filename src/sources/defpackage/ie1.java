package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ie1 extends jx4 implements rv1 {
    public final xz4 q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;

    public ie1(xz4 xz4Var) {
        this.q0 = xz4Var;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        w51.G(M0(), null, null, new r5((Object) this, (q51) null, (byte) 9), 3);
    }

    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        p34Var.a();
        um0 um0Var = p34Var.X;
        if (this.r0) {
            sv1.k0(p34Var, dw0.b(0.3f, dw0.b), 0L, um0Var.e(), 0.0f, 122);
        } else if (this.s0 || this.t0) {
            sv1.k0(p34Var, dw0.b(0.1f, dw0.b), 0L, um0Var.e(), 0.0f, 122);
        }
    }
}
