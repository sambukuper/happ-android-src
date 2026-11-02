package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ae2 extends u1 {
    public final u1 Y;
    public final u1 Z;
    public final boolean f0;

    public ae2(u1 u1Var, u1 u1Var2, boolean z, dn2 dn2Var) {
        super(dn2Var);
        this.Y = u1Var;
        this.Z = u1Var2;
        this.f0 = z;
    }

    @Override // defpackage.u1
    public final boolean B() {
        return false;
    }

    @Override // defpackage.u1
    public final boolean F() {
        return this.f0;
    }

    @Override // defpackage.u1
    public final boolean G() {
        return false;
    }

    @Override // defpackage.u1
    public final u1 K() {
        return this.Y;
    }

    @Override // defpackage.pw3
    public final List L() {
        return this.Y.L();
    }

    @Override // defpackage.pw3
    public final lv3 M() {
        lv3 lv3VarM = this.Y.M();
        if (!(lv3VarM instanceof zu3)) {
            return lv3VarM;
        }
        return yb6.a.b(zc1.N((zu3) lv3VarM));
    }

    @Override // defpackage.u1
    public final u1 N(boolean z) {
        u1 u1VarN = this.Y.N(z);
        u1 u1VarN2 = this.Z.N(z);
        return u1VarN.equals(u1VarN2) ? u1VarN : new ae2(u1VarN, u1VarN2, this.f0, null);
    }

    @Override // defpackage.u1
    public final u1 S(boolean z) {
        u1 u1VarS = this.Y.S(z);
        u1 u1VarS2 = this.Z.S(z);
        return u1VarS.equals(u1VarS2) ? u1VarS : new ae2(u1VarS, u1VarS2, this.f0, null);
    }

    @Override // defpackage.u1
    public final u1 T() {
        return this.Z;
    }

    @Override // defpackage.u1
    public final pw3 f() {
        return null;
    }

    @Override // defpackage.u1
    public final g44 t() {
        return this.Y.t();
    }

    @Override // defpackage.u1
    public final zu3 v() {
        return this.Y.v();
    }

    @Override // defpackage.u1
    public final boolean x() {
        return false;
    }

    @Override // defpackage.pw3
    public final boolean z() {
        return this.Y.z();
    }
}
