package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n04 extends p04 {
    public final cz3 k0;
    public final g44 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n04(ov3 ov3Var, String str, Object obj, cz3 cz3Var) {
        super(ov3Var, str, obj, yu3.k);
        ov3Var.getClass();
        str.getClass();
        cz3Var.getClass();
        this.k0 = cz3Var;
        this.l0 = x97.P(w74.X, new ok3(ov3Var, (byte) 2));
    }

    @Override // defpackage.kb6
    public final kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        if (!yu3Var.equals(yu3.k)) {
            xw3.z(this, "Constructors cannot have fake overrides: ");
            return null;
        }
        return new n04(ov3Var, this.Z, nd0.NO_RECEIVER, this.k0);
    }

    @Override // defpackage.p04
    public final pt3 X() {
        cz3 cz3Var = this.k0;
        cz3Var.getClass();
        pt3 pt3Var = ch3.D(cz3Var).a;
        if (pt3Var != null) {
            return pt3Var;
        }
        xw3.j(this, "No signature for constructor: ");
        return null;
    }

    @Override // defpackage.p04
    public final List Z() {
        return this.k0.b;
    }

    @Override // defpackage.xu3
    public final zw3 e() {
        nw3[] nw3VarArr = ow.a;
        cz3 cz3Var = this.k0;
        cz3Var.getClass();
        return ys0.c0((gz8) ow.g.J(ow.a[17], cz3Var));
    }

    @Override // defpackage.xu3
    public final String getName() {
        return "<init>";
    }

    @Override // defpackage.xu3, defpackage.pv3
    public final boolean h() {
        return false;
    }

    @Override // defpackage.pv3
    public final boolean i() {
        return false;
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        return (pw3) this.l0.getValue();
    }

    @Override // defpackage.pv3
    public final boolean k() {
        return false;
    }

    @Override // defpackage.kb6
    public final ex4 m() {
        return ex4.FINAL;
    }

    @Override // defpackage.pv3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.pv3
    public final boolean s() {
        return false;
    }
}
