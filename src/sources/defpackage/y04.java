package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y04 extends p04 {
    public final iz3 k0;
    public final g44 l0;
    public final g44 m0;
    public final g44 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y04(ov3 ov3Var, String str, Object obj, iz3 iz3Var, yu3 yu3Var) {
        super(ov3Var, str, obj, yu3Var);
        ov3Var.getClass();
        str.getClass();
        iz3Var.getClass();
        yu3Var.getClass();
        this.k0 = iz3Var;
        w04 w04Var = new w04(this, (byte) 0);
        w74 w74Var = w74.X;
        this.l0 = x97.P(w74Var, w04Var);
        this.m0 = x97.P(w74Var, new x04(ov3Var, this));
        this.n0 = x97.P(w74Var, new x04(this, ov3Var));
    }

    @Override // defpackage.kb6
    public final kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        return new y04(ov3Var, this.Z, nd0.NO_RECEIVER, this.k0, yu3Var);
    }

    @Override // defpackage.p04
    public final List V() {
        return this.k0.g;
    }

    @Override // defpackage.p04
    public final mz3 W() {
        return (mz3) this.l0.getValue();
    }

    @Override // defpackage.p04
    public final pt3 X() {
        iz3 iz3Var = this.k0;
        iz3Var.getClass();
        pt3 pt3Var = ch3.E(iz3Var).a;
        if (pt3Var != null) {
            return pt3Var;
        }
        xw3.j(this, "No signature for function: ");
        return null;
    }

    @Override // defpackage.p04
    public final li8 Y() {
        return (li8) this.m0.getValue();
    }

    @Override // defpackage.p04
    public final List Z() {
        return this.k0.f;
    }

    @Override // defpackage.xu3
    public final zw3 e() {
        nw3[] nw3VarArr = ow.a;
        iz3 iz3Var = this.k0;
        iz3Var.getClass();
        return ys0.c0((gz8) ow.h.J(ow.a[22], iz3Var));
    }

    @Override // defpackage.xu3
    public final String getName() {
        return this.k0.b;
    }

    @Override // defpackage.xu3, defpackage.pv3
    public final boolean h() {
        nw3[] nw3VarArr = ow.a;
        iz3 iz3Var = this.k0;
        iz3Var.getClass();
        return ow.n.x(ow.a[29], iz3Var);
    }

    @Override // defpackage.pv3
    public final boolean i() {
        nw3[] nw3VarArr = ow.a;
        iz3 iz3Var = this.k0;
        iz3Var.getClass();
        return ow.l.x(ow.a[26], iz3Var);
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        return (pw3) this.n0.getValue();
    }

    @Override // defpackage.pv3
    public final boolean k() {
        nw3[] nw3VarArr = ow.a;
        iz3 iz3Var = this.k0;
        iz3Var.getClass();
        return ow.m.x(ow.a[28], iz3Var);
    }

    @Override // defpackage.kb6
    public final ex4 m() {
        nw3[] nw3VarArr = ow.a;
        iz3 iz3Var = this.k0;
        iz3Var.getClass();
        return (ex4) ow.i.J(ow.a[23], iz3Var);
    }

    @Override // defpackage.pv3
    public final boolean o() {
        nw3[] nw3VarArr = ow.a;
        iz3 iz3Var = this.k0;
        iz3Var.getClass();
        return ow.j.x(ow.a[24], iz3Var);
    }

    @Override // defpackage.pv3
    public final boolean s() {
        nw3[] nw3VarArr = ow.a;
        iz3 iz3Var = this.k0;
        iz3Var.getClass();
        return ow.k.x(ow.a[25], iz3Var);
    }
}
