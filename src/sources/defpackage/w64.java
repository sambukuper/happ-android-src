package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w64 extends jx4 implements w07 {
    public dn2 q0;
    public s64 r0;
    public sd5 s0;
    public boolean t0;
    public jx6 u0;
    public final u64 v0 = new u64(this, 0);
    public u64 w0;

    public w64(dn2 dn2Var, s64 s64Var, sd5 sd5Var, boolean z) {
        this.q0 = dn2Var;
        this.r0 = s64Var;
        this.s0 = sd5Var;
        this.t0 = z;
        Y0();
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    public final void Y0() {
        this.u0 = new jx6(new v64(this, (byte) 0), new v64(this, (byte) 1));
        this.w0 = this.t0 ? new u64(this, (byte) 1) : null;
    }

    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        nw3[] nw3VarArr;
        d17.f(f17Var);
        f17Var.a(c17.P, this.v0);
        sd5 sd5Var = this.s0;
        jx6 jx6Var = this.u0;
        if (sd5Var == sd5.X) {
            if (jx6Var == null) {
                dh3.T("scrollAxisRange");
                throw null;
            }
            e17 e17Var = c17.w;
            nw3VarArr = d17.a;
            nw3 nw3Var = nw3VarArr[13];
            e17Var.getClass();
            f17Var.a(e17Var, jx6Var);
        } else {
            if (jx6Var == null) {
                dh3.T("scrollAxisRange");
                throw null;
            }
            e17 e17Var2 = c17.v;
            nw3VarArr = d17.a;
            nw3 nw3Var2 = nw3VarArr[12];
            e17Var2.getClass();
            f17Var.a(e17Var2, jx6Var);
        }
        u64 u64Var = this.w0;
        if (u64Var != null) {
            f17Var.a(s07.f, new q3(null, u64Var));
        }
        f17Var.a(s07.C, new q3(null, new t16(new v64(this, (byte) 2), (byte) 16)));
        s64 s64Var = this.r0;
        s64Var.getClass();
        sv0 sv0Var = new sv0(((Number) s64Var.a.getValue()).intValue(), 1);
        e17 e17Var3 = c17.f;
        nw3 nw3Var3 = nw3VarArr[24];
        e17Var3.getClass();
        f17Var.a(e17Var3, sv0Var);
    }
}
