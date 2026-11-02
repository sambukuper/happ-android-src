package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ic0 extends jx4 implements w85, ea0, rv1 {
    public final jc0 q0;
    public boolean r0;
    public gn2 s0;

    public ic0(jc0 jc0Var, gn2 gn2Var) {
        this.q0 = jc0Var;
        this.s0 = gn2Var;
        jc0Var.X = this;
    }

    @Override // defpackage.rv1
    public final void O() {
        Y0();
    }

    @Override // defpackage.jx4
    public final void S0() {
        Y0();
    }

    @Override // defpackage.nh1
    public final void V() {
        Y0();
    }

    public final void Y0() {
        this.r0 = false;
        this.q0.Y = null;
        z68.W(this);
    }

    @Override // defpackage.nh1, defpackage.kq5
    public final void c() {
        Y0();
    }

    @Override // defpackage.ea0
    public final long e() {
        return u15.R(yn0.X(this, 4).Z);
    }

    @Override // defpackage.ea0
    public final fi1 getDensity() {
        return yn0.Z(this).A0;
    }

    @Override // defpackage.ea0
    public final z24 getLayoutDirection() {
        return yn0.Z(this).B0;
    }

    @Override // defpackage.w85
    public final void q0() {
        Y0();
    }

    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        boolean z = this.r0;
        jc0 jc0Var = this.q0;
        if (!z) {
            jc0Var.Y = null;
            ch3.N(this, new p5(this, jc0Var, (byte) 12));
            if (jc0Var.Y == null) {
                throw p61.j("DrawResult not defined, did you forget to call onDraw?");
            }
            this.r0 = true;
        }
        vk1 vk1Var = jc0Var.Y;
        vk1Var.getClass();
        ((gn2) vk1Var.Y).B(p34Var);
    }

    @Override // defpackage.jx4
    public final void R0() {
    }
}
