package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fv1 extends jx4 implements g34 {
    public t5 q0;
    public rn2 r0;
    public sd5 s0;
    public boolean t0;

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        eo5 eo5VarO = tr4Var.o(j);
        if (!zr4Var.c0() || !this.t0) {
            qg5 qg5Var = (qg5) this.r0.K(new pf3((((long) eo5VarO.Y) & 4294967295L) | (((long) eo5VarO.X) << 32)), new q31(j));
            t5 t5Var = this.q0;
            lp4 lp4Var = (lp4) qg5Var.X;
            Object obj = qg5Var.Y;
            lp4 lp4VarD = t5Var.d();
            rh5 rh5Var = (rh5) t5Var.m0;
            if (!dh3.f(lp4VarD, lp4Var)) {
                ((rh5) t5Var.n0).setValue(lp4Var);
                q15 q15Var = ((lg3) t5Var.g0).b;
                boolean zD = q15Var.d();
                if (zD) {
                    try {
                        ha haVar = (ha) t5Var.o0;
                        float fD = t5Var.d().d(obj);
                        if (!Float.isNaN(fD)) {
                            t5 t5Var2 = haVar.a;
                            ((nh5) t5Var2.k0).m(fD);
                            ((nh5) t5Var2.l0).m(0.0f);
                            rh5Var.setValue(null);
                        }
                        t5Var.g(obj);
                        q15Var.m(null);
                    } catch (Throwable th) {
                        q15Var.m(null);
                        throw th;
                    }
                }
                if (!zD) {
                    rh5Var.setValue(obj);
                }
            }
        }
        this.t0 = zr4Var.c0() || this.t0;
        return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new sn((Object) zr4Var, (Object) this, (Object) eo5VarO, (byte) 7));
    }

    @Override // defpackage.jx4
    public final void R0() {
        this.t0 = false;
    }
}
