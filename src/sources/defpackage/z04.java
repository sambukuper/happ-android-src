package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z04 extends ob6 {
    public final m04 X;
    public final qz3 Y;
    public final int Z;
    public final fw3 f0;
    public final String g0;
    public final g44 h0;

    public z04(m04 m04Var, qz3 qz3Var, int i, fw3 fw3Var, li8 li8Var) {
        qz3Var.getClass();
        li8Var.getClass();
        this.X = m04Var;
        this.Y = qz3Var;
        this.Z = i;
        this.f0 = fw3Var;
        String str = qz3Var.b;
        this.g0 = mm7.Z(str, false, "<") ? null : str;
        this.h0 = x97.P(w74.X, new c3((Object) this, (Object) li8Var, (byte) 24));
    }

    @Override // defpackage.ob6
    public final pw3 B() {
        return (pw3) this.h0.getValue();
    }

    @Override // defpackage.ob6
    public final boolean F() {
        m04 m04Var = this.X;
        if ((m04Var instanceof l14) || (m04Var.D() instanceof ew3) || mb6.L(m04Var)) {
            nw3[] nw3VarArr = ow.a;
            qz3 qz3Var = this.Y;
            qz3Var.getClass();
            return ow.C.x(ow.a[56], qz3Var);
        }
        StringBuilder sb = new StringBuilder("Only constructors and top-level callables are supported for now: ");
        sb.append(m04Var.D());
        xw3.p(sb, m04Var.getName(), this.g0);
        return false;
    }

    @Override // defpackage.ob6
    public final boolean G() {
        return this.Y.d != null;
    }

    @Override // defpackage.ob6
    public final kb6 f() {
        return this.X;
    }

    @Override // defpackage.ob6
    public final String getName() {
        return this.g0;
    }

    @Override // defpackage.ob6
    public final boolean t() {
        nw3[] nw3VarArr = ow.a;
        qz3 qz3Var = this.Y;
        qz3Var.getClass();
        return ow.C.x(ow.a[56], qz3Var);
    }

    @Override // defpackage.ob6
    public final int v() {
        return this.Z;
    }

    @Override // defpackage.ob6
    public final fw3 x() {
        return this.f0;
    }
}
