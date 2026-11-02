package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w38 extends oh1 implements s01, h38 {
    public ub8 s0;
    public final l48 t0;
    public final li u0;
    public final py7 v0;
    public og7 w0;
    public final zi1 x0 = rd7.b(new v38((Object) this, (byte) 0));
    public s86 y0 = s86.e;

    public w38(ub8 ub8Var, l48 l48Var, li liVar, py7 py7Var) {
        this.s0 = ub8Var;
        this.t0 = l48Var;
        this.u0 = liVar;
        this.v0 = py7Var;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        ub8 ub8Var = this.s0;
        ub8Var.b = tb8.Z;
        ub8Var.a = this;
    }

    @Override // defpackage.jx4
    public final void R0() {
        ub8 ub8Var = this.s0;
        ub8Var.b = tb8.Y;
        ub8Var.a = null;
    }

    @Override // defpackage.h38
    public final g38 S() {
        return (g38) this.x0.getValue();
    }

    @Override // defpackage.h38
    public final long j(y24 y24Var) {
        return m(y24Var).f();
    }

    @Override // defpackage.h38
    public final s86 m(y24 y24Var) {
        if (!this.p0) {
            return this.y0;
        }
        s86 s86Var = (s86) this.v0.B(y24Var);
        this.y0 = s86Var;
        return s86Var;
    }
}
