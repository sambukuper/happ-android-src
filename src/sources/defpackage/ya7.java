package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ya7 extends xg3 {
    public wf7 r0;
    public long s0;
    public long t0;
    public boolean u0;
    public final rh5 v0;

    public ya7(wf7 wf7Var) {
        super((byte) 1);
        this.r0 = wf7Var;
        this.s0 = -9223372034707292160L;
        this.t0 = s31.b(0, 0, 0, 0, 15);
        this.v0 = z51.H(null);
    }

    @Override // defpackage.xg3, defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        eo5 eo5VarO;
        wa7 wa7Var;
        long jD;
        wa7 wa7Var2;
        if (zr4Var.c0()) {
            this.t0 = j;
            this.u0 = true;
            eo5VarO = tr4Var.o(j);
        } else {
            eo5VarO = tr4Var.o(this.u0 ? this.t0 : j);
        }
        eo5 eo5Var = eo5VarO;
        char c = ' ';
        long j2 = (((long) eo5Var.Y) & 4294967295L) | (((long) eo5Var.X) << 32);
        if (zr4Var.c0()) {
            this.s0 = j2;
            c = ' ';
            jD = j2;
            j2 = jD;
        } else {
            long j3 = !pf3.a(this.s0, -9223372034707292160L) ? this.s0 : j2;
            rh5 rh5Var = this.v0;
            wa7 wa7Var3 = (wa7) rh5Var.getValue();
            if (wa7Var3 != null) {
                oi oiVar = wa7Var3.a;
                boolean z = (pf3.a(j3, ((pf3) oiVar.d()).a) || ((Boolean) oiVar.d.getValue()).booleanValue()) ? false : true;
                if (!pf3.a(j3, ((pf3) oiVar.e.getValue()).a) || z) {
                    wa7Var3.b = ((pf3) oiVar.d()).a;
                    wa7Var2 = wa7Var3;
                    w51.G(M0(), null, null, new qn0(wa7Var2, j3, this, null), 3);
                } else {
                    wa7Var2 = wa7Var3;
                }
                wa7Var = wa7Var2;
            } else {
                long j4 = j3;
                wa7Var = new wa7(new oi(new pf3(j4), ys0.q0, new pf3(4294967297L), 8), j4);
            }
            rh5Var.setValue(wa7Var);
            jD = s31.d(j, ((pf3) wa7Var.a.d()).a);
        }
        int i = (int) (jD >> c);
        int i2 = (int) (jD & 4294967295L);
        return zr4Var.g0(i, i2, e02.X, new xa7(this, j2, i, i2, zr4Var, eo5Var));
    }

    @Override // defpackage.jx4
    public final void Q0() {
        this.s0 = -9223372034707292160L;
        this.u0 = false;
    }

    @Override // defpackage.jx4
    public final void S0() {
        this.v0.setValue(null);
    }
}
